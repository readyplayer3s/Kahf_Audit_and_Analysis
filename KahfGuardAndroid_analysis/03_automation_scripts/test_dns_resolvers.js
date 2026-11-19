const dns = require('dns');
const net = require('net');
const tls = require('tls');
const dgram = require('dgram');
const https = require('https');
const fs = require('fs');
const path = require('path');

const SLEEP_MS = 500;
let totalDiagnosticQueries = 0;

function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

// RFC 1035 DNS Wire Format Encoder
function encodeDnsQuery(qname, qtype = 1, options = { rd: true, ad: true, doBit: false }) {
  const txid = Math.floor(Math.random() * 65535);
  let flags = 0;
  if (options.rd !== false) flags |= 0x0100; // RD
  if (options.ad !== false) flags |= 0x0020; // AD

  const arcount = options.doBit ? 1 : 0;
  const header = Buffer.alloc(12);
  header.writeUInt16BE(txid, 0);
  header.writeUInt16BE(flags, 2);
  header.writeUInt16BE(1, 4); // QDCOUNT
  header.writeUInt16BE(0, 6); // ANCOUNT
  header.writeUInt16BE(0, 8); // NSCOUNT
  header.writeUInt16BE(arcount, 10); // ARCOUNT

  const labels = qname.split('.').filter(Boolean);
  const qnameParts = [];
  for (const label of labels) {
    const buf = Buffer.from(label, 'ascii');
    const len = Buffer.alloc(1);
    len.writeUInt8(buf.length, 0);
    qnameParts.push(len, buf);
  }
  qnameParts.push(Buffer.from([0])); // root label

  const qfooter = Buffer.alloc(4);
  qfooter.writeUInt16BE(qtype, 0); // QTYPE (1=A, 28=AAAA, 5=CNAME, 16=TXT)
  qfooter.writeUInt16BE(1, 2); // QCLASS (1=IN)

  const parts = [header, ...qnameParts, qfooter];

  if (options.doBit) {
    const opt = Buffer.alloc(11);
    opt.writeUInt8(0, 0);
    opt.writeUInt16BE(41, 1); // OPT
    opt.writeUInt16BE(1232, 3);
    opt.writeUInt8(0, 5);
    opt.writeUInt8(0, 6);
    opt.writeUInt16BE(0x8000, 7); // DO bit = 1
    opt.writeUInt16BE(0, 9);
    parts.push(opt);
  }

  return { txid, packet: Buffer.concat(parts) };
}

function readDomainName(buf, offset) {
  const labels = [];
  let jumped = false;
  let jumpOffset = -1;
  let maxLoops = 64;

  while (maxLoops-- > 0 && offset < buf.length) {
    const len = buf.readUInt8(offset);
    if (len === 0) {
      offset += 1;
      break;
    }
    if ((len & 0xc0) === 0xc0) {
      const ptr = ((len & 0x3f) << 8) | buf.readUInt8(offset + 1);
      if (!jumped) {
        jumpOffset = offset + 2;
        jumped = true;
      }
      offset = ptr;
      continue;
    }
    offset += 1;
    labels.push(buf.slice(offset, offset + len).toString('ascii'));
    offset += len;
  }

  return {
    name: labels.join('.'),
    nextOffset: jumped ? jumpOffset : offset,
  };
}

const RCODE_NAMES = {
  0: 'NOERROR',
  1: 'FORMERR',
  2: 'SERVFAIL',
  3: 'NXDOMAIN',
  4: 'NOTIMP',
  5: 'REFUSED',
};

const TYPE_NAMES = {
  1: 'A',
  2: 'NS',
  5: 'CNAME',
  6: 'SOA',
  15: 'MX',
  16: 'TXT',
  28: 'AAAA',
  41: 'OPT',
  43: 'DS',
  46: 'RRSIG',
  47: 'NSEC',
  48: 'DNSKEY',
};

function decodeDnsResponse(buf) {
  if (!buf || buf.length < 12) {
    return { error: 'Packet too short', rawHex: buf ? buf.toString('hex') : null };
  }
  const txid = buf.readUInt16BE(0);
  const flags = buf.readUInt16BE(2);
  const qdcount = buf.readUInt16BE(4);
  const ancount = buf.readUInt16BE(6);
  const nscount = buf.readUInt16BE(8);
  const arcount = buf.readUInt16BE(10);

  const qr = (flags >> 15) & 1;
  const opcode = (flags >> 11) & 0xf;
  const aa = Boolean((flags >> 10) & 1);
  const tc = Boolean((flags >> 9) & 1);
  const rd = Boolean((flags >> 8) & 1);
  const ra = Boolean((flags >> 7) & 1);
  const ad = Boolean((flags >> 5) & 1);
  const cd = Boolean((flags >> 4) & 1);
  const rcode = flags & 0xf;

  let offset = 12;
  const questions = [];
  for (let i = 0; i < qdcount && offset < buf.length; i++) {
    const q = readDomainName(buf, offset);
    offset = q.nextOffset;
    if (offset + 4 <= buf.length) {
      const qtype = buf.readUInt16BE(offset);
      const qclass = buf.readUInt16BE(offset + 2);
      offset += 4;
      questions.push({ name: q.name, type: TYPE_NAMES[qtype] || qtype, class: qclass });
    }
  }

  function parseSection(count) {
    const records = [];
    for (let i = 0; i < count && offset < buf.length; i++) {
      const rname = readDomainName(buf, offset);
      offset = rname.nextOffset;
      if (offset + 10 > buf.length) break;
      const rtype = buf.readUInt16BE(offset);
      const rclass = buf.readUInt16BE(offset + 2);
      const ttl = buf.readUInt32BE(offset + 4);
      const rdlen = buf.readUInt16BE(offset + 8);
      offset += 10;

      const rdataStart = offset;
      let data = null;
      if (rdataStart + rdlen <= buf.length) {
        if (rtype === 1 && rdlen === 4) {
          data = `${buf[rdataStart]}.${buf[rdataStart + 1]}.${buf[rdataStart + 2]}.${buf[rdataStart + 3]}`;
        } else if (rtype === 28 && rdlen === 16) {
          const parts = [];
          for (let j = 0; j < 16; j += 2) {
            parts.push(buf.readUInt16BE(rdataStart + j).toString(16));
          }
          data = parts.join(':');
        } else if (rtype === 5 || rtype === 2) {
          data = readDomainName(buf, rdataStart).name;
        } else if (rtype === 6) {
          const mname = readDomainName(buf, rdataStart);
          const rnameSoa = readDomainName(buf, mname.nextOffset);
          data = `${mname.name} ${rnameSoa.name}`;
        } else if (rtype === 16) {
          data = buf.slice(rdataStart + 1, rdataStart + rdlen).toString('utf8');
        } else if (rtype === 41) {
          data = `EDNS0_UDP_${rclass}_FLAGS_0x${ttl.toString(16)}`;
        } else {
          data = `0x${buf.slice(rdataStart, rdataStart + Math.min(rdlen, 32)).toString('hex')}`;
        }
      }
      offset += rdlen;
      records.push({
        name: rname.name,
        type: TYPE_NAMES[rtype] || rtype,
        ttl,
        data,
      });
    }
    return records;
  }

  const answers = parseSection(ancount);
  const authorities = parseSection(nscount);
  const additionals = parseSection(arcount);

  return {
    txid,
    rcode,
    rcodeName: RCODE_NAMES[rcode] || `RCODE_${rcode}`,
    flags: { qr, opcode, aa, tc, rd, ra, ad, cd, rawHex: '0x' + flags.toString(16).padStart(4, '0') },
    counts: { qdcount, ancount, nscount, arcount },
    questions,
    answers,
    authorities,
    additionals,
  };
}

// Query over UDP Port 53
function queryUdp53(serverIp, qname, qtype = 1, timeoutMs = 2500) {
  totalDiagnosticQueries++;
  return new Promise((resolve) => {
    const { packet } = encodeDnsQuery(qname, qtype);
    const sock = dgram.createSocket(serverIp.includes(':') ? 'udp6' : 'udp4');
    const start = performance.now();
    let settled = false;

    const timer = setTimeout(() => {
      if (!settled) {
        settled = true;
        sock.close();
        resolve({ success: false, rttMs: Math.round(performance.now() - start), error: 'TIMEOUT' });
      }
    }, timeoutMs);

    sock.on('error', (err) => {
      if (!settled) {
        settled = true;
        clearTimeout(timer);
        sock.close();
        resolve({ success: false, rttMs: Math.round(performance.now() - start), error: err.message });
      }
    });

    sock.on('message', (msg) => {
      if (!settled) {
        settled = true;
        clearTimeout(timer);
        const rttMs = Math.round((performance.now() - start) * 100) / 100;
        sock.close();
        resolve({ success: true, rttMs, decoded: decodeDnsResponse(msg) });
      }
    });

    sock.send(packet, 53, serverIp);
  });
}

// Query over TCP Port 53
function queryTcp53(serverIp, qname, qtype = 1, timeoutMs = 2500) {
  totalDiagnosticQueries++;
  return new Promise((resolve) => {
    const { packet } = encodeDnsQuery(qname, qtype);
    const lenBuf = Buffer.alloc(2);
    lenBuf.writeUInt16BE(packet.length, 0);
    const frame = Buffer.concat([lenBuf, packet]);
    const start = performance.now();
    let settled = false;
    let chunks = [];

    const sock = net.connect({ host: serverIp, port: 53, timeout: timeoutMs }, () => {
      sock.write(frame);
    });

    const timer = setTimeout(() => {
      if (!settled) {
        settled = true;
        sock.destroy();
        resolve({ success: false, rttMs: Math.round(performance.now() - start), error: 'TIMEOUT' });
      }
    }, timeoutMs);

    sock.on('data', (chunk) => {
      chunks.push(chunk);
      const buf = Buffer.concat(chunks);
      if (buf.length >= 2) {
        const expectedLen = buf.readUInt16BE(0);
        if (buf.length >= 2 + expectedLen && !settled) {
          settled = true;
          clearTimeout(timer);
          const rttMs = Math.round((performance.now() - start) * 100) / 100;
          sock.destroy();
          resolve({ success: true, rttMs, decoded: decodeDnsResponse(buf.slice(2, 2 + expectedLen)) });
        }
      }
    });

    sock.on('error', (err) => {
      if (!settled) {
        settled = true;
        clearTimeout(timer);
        sock.destroy();
        resolve({ success: false, rttMs: Math.round(performance.now() - start), error: err.message });
      }
    });
  });
}

// Persistent DoT (Port 853) Session Manager
class DotClient {
  constructor(hostname, connectIp = null) {
    this.hostname = hostname;
    this.connectIp = connectIp || hostname;
    this.socket = null;
    this.certInfo = null;
    this.handshakeMs = null;
  }

  connect(timeoutMs = 4000) {
    return new Promise((resolve, reject) => {
      const start = performance.now();
      const sock = tls.connect(
        {
          host: this.connectIp,
          port: 853,
          servername: this.hostname,
          rejectUnauthorized: false,
          ALPNProtocols: ['dot'],
          timeout: timeoutMs,
        },
        () => {
          this.handshakeMs = Math.round((performance.now() - start) * 100) / 100;
          const cert = sock.getPeerCertificate(false);
          this.certInfo = {
            authorized: sock.authorized,
            authorizationError: sock.authorizationError || null,
            protocol: sock.getProtocol(),
            cipher: sock.getCipher(),
            alpnProtocol: sock.alpnProtocol,
            subject: cert ? cert.subject : null,
            issuer: cert ? cert.issuer : null,
            subjectaltname: cert ? cert.subjectaltname : null,
            valid_from: cert ? cert.valid_from : null,
            valid_to: cert ? cert.valid_to : null,
            fingerprint256: cert ? cert.fingerprint256 : null,
            serialNumber: cert ? cert.serialNumber : null,
          };
          this.socket = sock;
          resolve(this.certInfo);
        }
      );

      sock.on('error', (err) => reject(err));
      sock.on('timeout', () => {
        sock.destroy();
        reject(new Error('TLS_HANDSHAKE_TIMEOUT'));
      });
    });
  }

  query(qname, qtype = 1, options = { rd: true, ad: true, doBit: false }, timeoutMs = 3500) {
    totalDiagnosticQueries++;
    return new Promise((resolve) => {
      if (!this.socket || this.socket.destroyed) {
        return resolve({ success: false, error: 'SOCKET_NOT_CONNECTED' });
      }
      const { packet } = encodeDnsQuery(qname, qtype, options);
      const lenBuf = Buffer.alloc(2);
      lenBuf.writeUInt16BE(packet.length, 0);
      const frame = Buffer.concat([lenBuf, packet]);
      const start = performance.now();
      let chunks = [];
      let settled = false;

      const onData = (chunk) => {
        chunks.push(chunk);
        const buf = Buffer.concat(chunks);
        if (buf.length >= 2) {
          const expectedLen = buf.readUInt16BE(0);
          if (buf.length >= 2 + expectedLen && !settled) {
            settled = true;
            clearTimeout(timer);
            this.socket.removeListener('data', onData);
            const rttMs = Math.round((performance.now() - start) * 100) / 100;
            resolve({
              success: true,
              rttMs,
              decoded: decodeDnsResponse(buf.slice(2, 2 + expectedLen)),
            });
          }
        }
      };

      const timer = setTimeout(() => {
        if (!settled) {
          settled = true;
          this.socket.removeListener('data', onData);
          resolve({ success: false, rttMs: Math.round(performance.now() - start), error: 'QUERY_TIMEOUT' });
        }
      }, timeoutMs);

      this.socket.on('data', onData);
      this.socket.write(frame);
    });
  }

  close() {
    if (this.socket && !this.socket.destroyed) {
      this.socket.destroy();
    }
  }
}

// Query over DoH (HTTPS Port 443 RFC 8484 GET)
function queryDoh(hostname, qname, qtype = 1, timeoutMs = 3500) {
  totalDiagnosticQueries++;
  return new Promise((resolve) => {
    const { packet } = encodeDnsQuery(qname, qtype);
    const b64url = packet.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
    const start = performance.now();

    const req = https.request(
      {
        hostname,
        port: 443,
        path: `/dns-query?dns=${b64url}`,
        method: 'GET',
        headers: {
          Accept: 'application/dns-message',
          'User-Agent': 'Mozilla/5.0 (Safe-DNS-Diagnostic)',
        },
        timeout: timeoutMs,
      },
      (res) => {
        const chunks = [];
        res.on('data', (c) => chunks.push(c));
        res.on('end', () => {
          const rttMs = Math.round((performance.now() - start) * 100) / 100;
          const body = Buffer.concat(chunks);
          const headers = {
            statusCode: res.statusCode,
            contentType: res.headers['content-type'],
            server: res.headers['server'],
            cfRay: res.headers['cf-ray'],
            altSvc: res.headers['alt-svc'],
            via: res.headers['via'],
            xPoweredBy: res.headers['x-powered-by'],
          };
          if (res.statusCode === 200 && (res.headers['content-type'] || '').includes('application/dns-message')) {
            resolve({
              success: true,
              rttMs,
              httpHeaders: headers,
              decoded: decodeDnsResponse(body),
            });
          } else {
            resolve({
              success: false,
              rttMs,
              httpHeaders: headers,
              bodyPreview: body.slice(0, 200).toString('utf8'),
            });
          }
        });
      }
    );

    req.on('error', (err) => {
      resolve({ success: false, rttMs: Math.round(performance.now() - start), error: err.message });
    });
    req.on('timeout', () => {
      req.destroy();
      resolve({ success: false, rttMs: Math.round(performance.now() - start), error: 'TIMEOUT' });
    });
    req.end();
  });
}

function fetchJson(url, timeoutMs = 4000) {
  return new Promise((resolve) => {
    const req = https.get(url, { timeout: timeoutMs, headers: { 'User-Agent': 'curl/8.0' } }, (res) => {
      const chunks = [];
      res.on('data', (c) => chunks.push(c));
      res.on('end', () => {
        try {
          resolve(JSON.parse(Buffer.concat(chunks).toString('utf8')));
        } catch (e) {
          resolve({ parseError: e.message });
        }
      });
    });
    req.on('error', (err) => resolve({ error: err.message }));
    req.on('timeout', () => {
      req.destroy();
      resolve({ error: 'TIMEOUT' });
    });
  });
}

async function main() {
  const report = {
    executedAt: new Date().toISOString(),
    rateLimitMs: SLEEP_MS,
    endpoints: {},
    ipGeoAndAsn: {},
    protocolSupport: {},
    tierComparison: {},
    trackerSelfWhitelisting: {},
    dnssecValidation: {},
    latencyBenchmarkDhaka: {},
    totalDiagnosticQueriesIssued: 0,
  };

  console.log('=== PHASE 4: SAFE, RATE-LIMITED DNS INFRASTRUCTURE VERIFICATION (<= 28 QUERIES) ===');

  // 1. Resolve Kahf DNS hostnames via explicit A + AAAA queries (avoids OS AI_ADDRCONFIG hiding IPv6 on IPv4-only hosts)
  const kahfHosts = ['high.kahfguard.com', 'medium.kahfguard.com', 'low.kahfguard.com', 'safety.kahfguard.com'];
  const uniqueIps = new Set();

  for (const host of kahfHosts) {
    console.log(`[1] Resolving A + AAAA records for ${host}...`);
    let ipv4 = [];
    let ipv6 = [];
    let err4 = null;
    let err6 = null;
    try { ipv4 = await dns.promises.resolve4(host); } catch (e) { err4 = e.code || e.message; }
    try { ipv6 = await dns.promises.resolve6(host); } catch (e) { err6 = e.code || e.message; }
    if (ipv4.length === 0 && ipv6.length === 0) {
      report.endpoints[host] = { error: err4 || err6 || 'ENOTFOUND' };
    } else {
      report.endpoints[host] = { ipv4, ipv6 };
      for (const ip of ipv4) uniqueIps.add(ip);
    }
    await sleep(SLEEP_MS);
  }

  // 2. Lookup ASN / Geo / Organization for unique IPv4 addresses
  for (const ip of uniqueIps) {
    console.log(`[2] Looking up ASN / Geo / Org for IP ${ip}...`);
    const geo = await fetchJson(`https://ipwho.is/${ip}`);
    report.ipGeoAndAsn[ip] = {
      ip: geo.ip,
      country: geo.country,
      country_code: geo.country_code,
      region: geo.region,
      city: geo.city,
      isp: geo.connection ? geo.connection.isp : null,
      org: geo.connection ? geo.connection.org : null,
      asn: geo.connection ? geo.connection.asn : null,
      domain: geo.connection ? geo.connection.domain : null,
    };
    await sleep(SLEEP_MS);
  }

  // 3. Test Protocol Matrix on high.kahfguard.com (UDP 53, TCP 53, DoH 443) -> 3 queries
  const primaryIp = Array.from(uniqueIps)[0] || 'high.kahfguard.com';
  console.log(`[3] Testing UDP/53, TCP/53, and DoH/443 on high.kahfguard.com (${primaryIp})...`);
  report.protocolSupport.udp53 = await queryUdp53(primaryIp, 'example.com', 1);
  await sleep(SLEEP_MS);
  report.protocolSupport.tcp53 = await queryTcp53(primaryIp, 'example.com', 1);
  await sleep(SLEEP_MS);
  report.protocolSupport.doh = {
    'high.kahfguard.com': await queryDoh('high.kahfguard.com', 'example.com', 1),
  };
  await sleep(SLEEP_MS);

  // 4. Connect DoT (Port 853) to high, medium, low
  const tiers = ['high.kahfguard.com', 'medium.kahfguard.com', 'low.kahfguard.com'];
  const dotClients = {};
  report.protocolSupport.dot853 = {};

  for (const tierHost of tiers) {
    console.log(`[4] Connecting DoT (TLS/853) to ${tierHost}...`);
    const client = new DotClient(tierHost);
    try {
      const certInfo = await client.connect();
      report.protocolSupport.dot853[tierHost] = {
        connected: true,
        handshakeMs: client.handshakeMs,
        certInfo,
      };
      dotClients[tierHost] = client;
    } catch (err) {
      report.protocolSupport.dot853[tierHost] = {
        connected: false,
        error: err.message,
      };
    }
    await sleep(SLEEP_MS);
  }

  // 5. Tier Comparison across high, medium, low (5 domains x 3 tiers = 15 queries)
  const tierTestDomains = [
    { domain: 'www.youtube.com', purpose: 'YouTube Restricted Mode CNAME enforcement check' },
    { domain: 'www.google.com', purpose: 'Google SafeSearch CNAME enforcement check' },
    { domain: 'www.bing.com', purpose: 'Bing SafeSearch CNAME enforcement check' },
    { domain: 'thequran.com', purpose: 'Kahf Guard hardcoded canary domain (oa3.java / i48.java)' },
    { domain: 'pornhub.com', purpose: 'Adult content blocking mechanism check' },
  ];

  for (const item of tierTestDomains) {
    report.tierComparison[item.domain] = { purpose: item.purpose, results: {} };
    for (const tierHost of tiers) {
      const client = dotClients[tierHost];
      if (client && client.socket && !client.socket.destroyed) {
        console.log(`[5] DoT Query [${tierHost}] -> ${item.domain}`);
        const res = await client.query(item.domain, 1);
        report.tierComparison[item.domain].results[tierHost] = {
          rttMs: res.rttMs,
          rcodeName: res.decoded ? res.decoded.rcodeName : null,
          flags: res.decoded ? res.decoded.flags : null,
          answers: res.decoded ? res.decoded.answers : null,
          authorities: res.decoded ? res.decoded.authorities : null,
        };
        await sleep(SLEEP_MS);
      }
    }
  }

  // 6. Ironic Litmus Test (Tracker Self-Whitelisting + NXDOMAIN + DNSSEC) on high.kahfguard.com (7 queries)
  const highClient = dotClients['high.kahfguard.com'];
  if (highClient && highClient.socket && !highClient.socket.destroyed) {
    console.log(`[6] NXDOMAIN integrity check [high.kahfguard.com]...`);
    const nxRes = await highClient.query('nxdomain-audit-check-982734.invalid', 1);
    report.tierComparison['nxdomain-audit-check-982734.invalid'] = {
      purpose: 'NXDOMAIN integrity check (non-hijacking verification)',
      results: {
        'high.kahfguard.com': {
          rttMs: nxRes.rttMs,
          rcodeName: nxRes.decoded ? nxRes.decoded.rcodeName : null,
          flags: nxRes.decoded ? nxRes.decoded.flags : null,
          answers: nxRes.decoded ? nxRes.decoded.answers : null,
          authorities: nxRes.decoded ? nxRes.decoded.authorities : null,
        },
      },
    };
    await sleep(SLEEP_MS);

    const trackerDomains = [
      { domain: 'graph.facebook.com', sdk: 'Meta / Facebook SDK (embedded in Kahf Guard)' },
      { domain: 'app-measurement.com', sdk: 'Google Firebase Analytics (embedded in Kahf Guard)' },
      { domain: 'p.kahf.co.uk', sdk: 'PostHog Session Replay Reverse Proxy (embedded in Kahf Guard)' },
      { domain: 'doubleclick.net', sdk: 'Google DoubleClick Ad Tracker (Control)' },
    ];

    for (const t of trackerDomains) {
      console.log(`[6] Tracker Litmus Test [high.kahfguard.com] -> ${t.domain}`);
      const res = await highClient.query(t.domain, 1);
      report.trackerSelfWhitelisting[t.domain] = {
        sdk: t.sdk,
        rttMs: res.rttMs,
        rcodeName: res.decoded ? res.decoded.rcodeName : null,
        answers: res.decoded ? res.decoded.answers : null,
      };
      await sleep(SLEEP_MS);
    }

    // 7. DNSSEC Validation Check on high.kahfguard.com (2 queries)
    console.log(`[7] DNSSEC Validation Check [high.kahfguard.com]...`);
    const sigOk = await highClient.query('sigok.verteiltesysteme.net', 1, { rd: true, ad: true, doBit: true });
    await sleep(SLEEP_MS);
    const sigFail = await highClient.query('sigfail.verteiltesysteme.net', 1, { rd: true, ad: true, doBit: true });
    await sleep(SLEEP_MS);
    report.dnssecValidation = {
      sigok_verteiltesysteme_net: {
        rttMs: sigOk.rttMs,
        rcodeName: sigOk.decoded ? sigOk.decoded.rcodeName : null,
        adFlag: sigOk.decoded && sigOk.decoded.flags ? sigOk.decoded.flags.ad : null,
        answers: sigOk.decoded ? sigOk.decoded.answers : null,
      },
      sigfail_verteiltesysteme_net: {
        rttMs: sigFail.rttMs,
        rcodeName: sigFail.decoded ? sigFail.decoded.rcodeName : null,
        adFlag: sigFail.decoded && sigFail.decoded.flags ? sigFail.decoded.flags.ad : null,
        answers: sigFail.decoded ? sigFail.decoded.answers : null,
      },
    };
  }

  // Close Kahf DoT sockets
  for (const tierHost of tiers) {
    if (dotClients[tierHost]) dotClients[tierHost].close();
  }

  // 8. Single-shot Latency Benchmark from Dhaka against global resolvers (3 queries)
  const benchmarkTargets = [
    { name: 'Cloudflare Families 1.1.1.3 (UDP)', ip: '1.1.1.3' },
    { name: 'Quad9 9.9.9.9 (UDP)', ip: '9.9.9.9' },
    { name: 'AdGuard Family 94.140.14.15 (UDP)', ip: '94.140.14.15' },
  ];

  // Record Kahf Guard High DoT latency from earlier handshake + query
  if (report.protocolSupport.dot853['high.kahfguard.com']) {
    const ytRes = report.tierComparison['www.youtube.com']?.results?.['high.kahfguard.com'];
    report.latencyBenchmarkDhaka['Kahf Guard High (DoT 853)'] = {
      tlsHandshakeMs: report.protocolSupport.dot853['high.kahfguard.com'].handshakeMs,
      queryRttMs: ytRes ? ytRes.rttMs : null,
    };
  }

  for (const target of benchmarkTargets) {
    console.log(`[8] Latency Benchmark -> ${target.name}`);
    const res = await queryUdp53(target.ip, 'example.com', 1);
    report.latencyBenchmarkDhaka[target.name] = { rttMs: res.rttMs, success: res.success };
    await sleep(SLEEP_MS);
  }

  report.totalDiagnosticQueriesIssued = totalDiagnosticQueries;
  const outPath = path.join(__dirname, '..', '05_evidence_dumps', 'dns_verification_results.json');
  fs.writeFileSync(outPath, JSON.stringify(report, null, 2), 'utf8');
  console.log(`=== DONE! Saved to ${outPath} (Total queries: ${totalDiagnosticQueries}) ===`);
}

main().catch((err) => {
  console.error('Fatal error:', err);
  process.exit(1);
});
