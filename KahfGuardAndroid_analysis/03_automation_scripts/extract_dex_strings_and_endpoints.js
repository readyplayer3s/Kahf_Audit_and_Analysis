const fs = require("fs");
const path = require("path");

function parseDexStrings(dexPath) {
  const buf = fs.readFileSync(dexPath);
  const stringIdsSize = buf.readUInt32LE(56);
  const stringIdsOff = buf.readUInt32LE(60);
  const typeIdsSize = buf.readUInt32LE(64);
  const typeIdsOff = buf.readUInt32LE(68);
  const classDefsSize = buf.readUInt32LE(96);
  const classDefsOff = buf.readUInt32LE(100);

  const strings = new Array(stringIdsSize);
  for (let i = 0; i < stringIdsSize; i++) {
    let off = buf.readUInt32LE(stringIdsOff + i * 4);
    // Read ULEB128 utf16_size
    let shift = 0;
    let b;
    do {
      b = buf[off++];
      shift += 7;
    } while (b & 0x80);
    // Read MUTF-8 until null byte
    let end = off;
    while (end < buf.length && buf[end] !== 0) end++;
    strings[i] = buf.toString("utf8", off, end);
  }

  const types = new Array(typeIdsSize);
  for (let i = 0; i < typeIdsSize; i++) {
    const descIdx = buf.readUInt32LE(typeIdsOff + i * 4);
    types[i] = strings[descIdx];
  }

  const classes = [];
  for (let i = 0; i < classDefsSize; i++) {
    const base = classDefsOff + i * 32;
    const classIdx = buf.readUInt32LE(base);
    const superclassIdx = buf.readUInt32LE(base + 8);
    const sourceFileIdx = buf.readInt32LE(base + 16);
    classes.push({
      className: types[classIdx],
      superClass: superclassIdx !== 0xffffffff ? types[superclassIdx] : null,
      sourceFile: sourceFileIdx >= 0 ? strings[sourceFileIdx] : null
    });
  }

  return { strings, classes };
}

const baseRaw = "kahf_audit_workspace/01_unpacked_apktool/base_raw";
const dex1 = parseDexStrings(path.join(baseRaw, "classes.dex"));
const dex2 = parseDexStrings(path.join(baseRaw, "classes2.dex"));

const allStrings = Array.from(new Set([...dex1.strings, ...dex2.strings]));
const allClasses = [...dex1.classes, ...dex2.classes];

// Also extract strings from strings.commonMain.cvr
const cvrPath = path.join(baseRaw, "assets/composeResources/com.kahf.dns.resources/values/strings.commonMain.cvr");
const cvrStrings = fs.existsSync(cvrPath)
  ? fs.readFileSync(cvrPath, "utf8").split(/\r?\n/).filter(Boolean)
  : [];

// Categorize findings
const urls = allStrings.filter(s => /^(https?|wss?|tls|quic|sdns|dns):\/\//i.test(s) || /https?:\/\//i.test(s));
const kahfRefs = allStrings.filter(s => /kahf|mahfil|buraq|safegaze|pihole|adguard|nextdns|controld|cloudflare|cleanbrowsing/i.test(s) && !s.startsWith("Lcom/") && !s.startsWith("[Lcom/"));
const ipv4s = allStrings.filter(s => /\b(?:\d{1,3}\.){3}\d{1,3}\b/.test(s) && !/^\d+\.\d+\.\d+$/.test(s));
const dnsKeywords = allStrings.filter(s => /dns|doh|dot|private_dns|private_dns_mode|private_dns_specifier|VpnService|addDnsServer|addRoute/i.test(s) && s.length < 200);
const viewIds = allStrings.filter(s => /:id\//.test(s));
const kahfClasses = allClasses.filter(c => c.className.startsWith("Lcom/kahf/") || c.className.startsWith("Lco/kahf/") || c.className.startsWith("Lio/kahf/"));

// Group classes by top-level package
const pkgCounts = {};
for (const c of allClasses) {
  const parts = c.className.replace(/^L/, "").split("/");
  const pkg = parts.slice(0, Math.min(3, parts.length - 1)).join(".");
  pkgCounts[pkg] = (pkgCounts[pkg] || 0) + 1;
}

const dump = {
  totalStrings: allStrings.length,
  totalClasses: allClasses.length,
  kahfClassCount: kahfClasses.length,
  packageSummary: Object.entries(pkgCounts).sort((a, b) => b[1] - a[1]).slice(0, 60),
  urls,
  ipv4Literals: ipv4s,
  kahfStrings: kahfRefs,
  dnsRelatedStrings: dnsKeywords,
  accessibilityViewIds: viewIds,
  kahfClasses,
  composeStringsSample: cvrStrings.slice(0, 100)
};

fs.writeFileSync("kahf_audit_workspace/05_evidence_dumps/dex_strings_and_classes.json", JSON.stringify(dump, null, 2));
console.log("Total unique DEX strings:", allStrings.length);
console.log("Total DEX classes:", allClasses.length);
console.log("Kahf first-party classes:", kahfClasses.length);
console.log("URLs found:", urls.length);
console.log("Accessibility View IDs found:", viewIds.length);
