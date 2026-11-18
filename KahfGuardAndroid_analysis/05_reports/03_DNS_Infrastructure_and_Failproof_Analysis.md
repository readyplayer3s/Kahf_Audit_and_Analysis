# 03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis
**Target Infrastructure:** `high.kahfguard.com`, `medium.kahfguard.com`, `low.kahfguard.com`, `safety.kahfguard.com`  
**Verification Method:** Rate-Limited (`>= 500ms` spacing, 28 total queries) Client-Side Wire-Format Inspection from Dhaka, Bangladesh  
**Raw Evidence Dump:** [`04_evidence_dumps/dns_verification_results.json`](../04_evidence_dumps/dns_verification_results.json)  
**Test Script:** [`03_automation_scripts/test_dns_resolvers.js`](../03_automation_scripts/test_dns_resolvers.js)

---

## 1. Executive Summary of DNS Infrastructure Findings

| Audit Question | Classification | Forensic Verdict & Exact Evidence |
| :--- | :--- | :--- |
| **Where are Kahf's DNS resolvers hosted, and do they use BDIX?** | **Verified Network Fact** | All three tiers (`high`, `medium`, `low`) resolve to a **single IPv4 address (`203.190.10.120`)** hosted in **Dhaka, Bangladesh** under **`AS58768` (`Daffodil Online Ltd.` / `DAFFODILNET-SUB-BLOCK-3`)**. Cached DoT queries return in **`4.14–11.09 ms`** from Dhaka (`20.04 ms` TLSv1.3 handshake). |
| **Single-IP Single Point of Failure (SPOF) & Zero IPv6 Support** | **Architectural / Reliability Flaw** | None of `high.kahfguard.com`, `medium.kahfguard.com`, or `low.kahfguard.com` publish a secondary IPv4 address or any IPv6 (`AAAA`) record. If `203.190.10.120` (`AS58768`) experiences a route flap or DDoS, all Kahf Guard users lose DNS resolution simultaneously. |
| **Dead Hardcoded Canary Host (`safety.kahfguard.com`)** | **Verified Code & Network Fact** | [`a13.java:43`](../02_curated_decompiled_sources/p000/a13.java#L43) defines `safety.kahfguard.com`, which returns **`NXDOMAIN` (`ENOTFOUND`)** in live DNS. Developers subsequently hardcoded `thequran.com` (`CNAME -> blocked.kahfguard.com`) as their canary domain in [`oa3.java:107`](../02_curated_decompiled_sources/p000/oa3.java#L107) and [`i48.java:116`](../02_curated_decompiled_sources/p000/i48.java#L116). |
| **Server Software Fingerprint (`PowerDNS dnsdist`)** | **Verified Network Fact** | Probing `https://high.kahfguard.com/dns-query` over HTTP/1.1 returns HTTP `505` with the exact hardcoded string from **PowerDNS `dnsdist`** (`doh.cc`): `"<html><body>This server implements RFC 8484 - DNS Queries over HTTP, and requires HTTP/2 in accordance with section 5.2 of the RFC.</body></html>"`. |
| **Why `high.kahfguard.com` Breaks YouTube Comments** | **Verified Network Fact** | On `high.kahfguard.com`, `www.youtube.com` is rewritten directly to `A 216.239.38.120` (Google's `restrict.youtube.com` VIP, TTL `3600`). On `medium` and `low`, `www.youtube.com` resolves to normal Google CDN IPs (`142.251.150.4`–`142.251.157.4`). |
| **Tracker Self-Whitelisting ("The Ironic Litmus Test")** | **Verified Network Fact** | While `high.kahfguard.com` blocks third-party ad domains like `doubleclick.net` (`CNAME -> blocked.kahfguard.com`), it **ALLOWS (`NOERROR`)** all three tracking endpoints embedded in Kahf's own app: **`graph.facebook.com`** (`57.144.142.141`), **`app-measurement.com`** (`142.250.143.100+`), and **`p.kahf.co.uk`** (`CNAME large1.kahf.co.uk -> 157.180.4.107`). |
| **DNSSEC Cryptographic Validation & NXDOMAIN Integrity** | **Verified Network Fact (Passed)** | `high.kahfguard.com` properly validates DNSSEC: `sigok.verteiltesysteme.net` returns `NOERROR` with **`AD=true`** (`RRSIG` present), and `sigfail.verteiltesysteme.net` returns **`SERVFAIL` (`RCODE=2`)**. Non-existent domains (`nxdomain-audit-check-982734.invalid`) return clean `NXDOMAIN` (`RCODE=3`) without ad-redirect hijacking. |

---

## 2. Endpoint Resolution, Hosting ASN & Single-Point-of-Failure Analysis

From [`dns_verification_results.json:4-39`](../04_evidence_dumps/dns_verification_results.json#L4-L39):

| Hostname | Tier Role in APK (`qa3.java`) | IPv4 (`A`) Record | IPv6 (`AAAA`) Record | Hosting ISP / ASN | Location |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `high.kahfguard.com` | Strong Protection (`qa3.f34200w`) | `203.190.10.120` | *None (`[]`)* | `AS58768` — Daffodil Online Ltd. (`DAFFODILNET-SUB-BLOCK-3`) | Dhaka, BD |
| `medium.kahfguard.com` | Moderate Protection (`qa3.f34201x`) | `203.190.10.120` | *None (`[]`)* | `AS58768` — Daffodil Online Ltd. (`DAFFODILNET-SUB-BLOCK-3`) | Dhaka, BD |
| `low.kahfguard.com` | Weak Protection (`qa3.f34202y`) | `203.190.10.120` | *None (`[]`)* | `AS58768` — Daffodil Online Ltd. (`DAFFODILNET-SUB-BLOCK-3`) | Dhaka, BD |
| `safety.kahfguard.com` | Legacy Canary (`a13.java:43`) | **`ENOTFOUND` (`NXDOMAIN`)** | *None* | Dead / Unregistered record | N/A |

### Architectural Implications of Single-IP Hosting (`203.190.10.120`)
1. **SNI-Based Tier Multiplexing on a Single Box:** Because all three hostnames resolve to the exact same IPv4 address (`203.190.10.120`), Kahf's `dnsdist` frontend inspects the TLS SNI (`high.kahfguard.com` vs `medium.kahfguard.com` vs `low.kahfguard.com`) on Port 853 to select the policy pool.
2. **Unencrypted Port 53 Cannot Distinguish Tiers & Is Open to the Internet:** Both plain `UDP/53` (`57.52 ms`) and plain `TCP/53` (`77.37 ms`) are open on `203.190.10.120` ([`dns_verification_results.json:41-138`](../04_evidence_dumps/dns_verification_results.json#L41-L138)). Because plain DNS packets carry no TLS SNI or HTTP `Host` header, plain Port 53 traffic hits a single default pool and exposes queries to ISP deep-packet inspection (DPI) and transparent DNS hijacking.
3. **Zero Redundancy / No Anycast Failover:** If `203.190.10.120` goes offline for maintenance or experiences a fiber cut at `AS58768`, Android's Private DNS enters a hard failure state across the user's phone—which in turn triggers Kahf Guard's `DnsSafetyManager` fail-open bug (Report 02, Section 3) and permanently disables DNS Change Prevention and Uninstall Prevention within ~5 seconds upon opening the app!

---

## 3. Transport Protocol & TLS Certificate Inspection

From [`dns_verification_results.json:150-234`](../04_evidence_dumps/dns_verification_results.json#L150-L234):

- **Protocol & Cipher Suite:** `TLSv1.3` with `TLS_AES_256_GCM_SHA384`, ALPN negotiated as `"dot"`.
- **Certificate Subject & SANs:** `CN=kahfguard.com`, `subjectaltname="DNS:*.kahfguard.com, DNS:kahfguard.com"`.
- **Certificate Issuer:** `C=US, O=Let's Encrypt, CN=YE1` (ECDSA intermediate).
- **Certificate Validity:** `Oct 23 05:34:28 2026 GMT` to `Jan 21 05:34:27 2027 GMT` (90-day Let's Encrypt lifecycle).
- **SHA-256 Fingerprint:** `8D:6B:41:2D:F3:1B:BB:73:05:52:DA:FD:1C:E9:B0:F5:AC:27:BD:7D:99:60:86:03:81:83:F6:0E:33:F8:5A:E7`.

---

## 4. Tier-by-Tier Wire-Format Filtering Matrix (`high` vs `medium` vs `low`)

Every query below was executed over **DNS-over-TLS (Port 853)** against `high.kahfguard.com`, `medium.kahfguard.com`, and `low.kahfguard.com` ([`dns_verification_results.json:236-825`](../04_evidence_dumps/dns_verification_results.json#L236-L825)):

| Query Domain (`QTYPE=A`) | `high.kahfguard.com` (Strong) | `medium.kahfguard.com` (Moderate) | `low.kahfguard.com` (Weak) | Technical Analysis |
| :--- | :--- | :--- | :--- | :--- |
| **`www.youtube.com`** | **`A 216.239.38.120`** (TTL 3600) — *Google's `restrict.youtube.com` VIP* | `A 142.251.150.4` .. `.157.4` (8 normal Google CDN IPs) | `A 142.251.150.4` .. `.157.4` (8 normal Google CDN IPs) | **Root Cause of YouTube Comments Bug:** `high` spoofs `www.youtube.com` directly to `216.239.38.120`, forcing Strict Restricted Mode globally and hiding all comment sections. |
| **`www.google.com`** | **`A 216.239.38.120`** (TTL 3600) — *`forcesafesearch.google.com` VIP* | **`A 216.239.38.120`** (TTL 3600) — *`forcesafesearch.google.com` VIP* | `A 142.251.150.119` .. `.157.119` (8 normal Google IPs) | `high` and `medium` enforce Google SafeSearch (`216.239.38.120`); `low` disables SafeSearch completely. |
| **`www.bing.com`** | **`A 150.171.27.16`** (TTL 3600) — *`strict.bing.com` VIP* | **`A 150.171.27.16`** (TTL 3600) — *`strict.bing.com` VIP* | `CNAME www-www.bing.com.trafficmanager.net` -> `2.19.212.x` | `high` and `medium` spoof Bing directly to Microsoft's Strict SafeSearch VIP (`150.171.27.16`); `low` leaves Bing unfiltered. |
| **`pornhub.com`** | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 300) | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 300) | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 300) | Blocked across all 3 tiers via authoritative CNAME rewrite to `blocked.kahfguard.com`. |
| **`thequran.com`** | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 300) | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 300) | `CNAME blocked.kahfguard.com` (`AA=true`, TTL 299) | Hardcoded canary domain in `oa3.java:107` / `i48.java:116` used by Kahf Guard to test if Kahf DNS is active on the device. |
| **`nxdomain-audit-check-982734.invalid`** | `RCODE=3 (NXDOMAIN)` (`SOA localhost nobody.invalid`) | — | — | Clean `NXDOMAIN` response; no search-redirect hijacking on non-existent domains. |

---

## 5. The "Ironic Litmus Test": Tracker Self-Whitelisting on `high.kahfguard.com`

We queried `high.kahfguard.com` (Kahf's strictest protection tier) for general ad-tech trackers (`doubleclick.net`) alongside the exact three tracking/analytics endpoints embedded inside the Kahf Guard Android client ([`dns_verification_results.json:826-921`](../04_evidence_dumps/dns_verification_results.json#L826-L921)):

| Domain Queried on `high.kahfguard.com` | Role in Kahf Guard APK | DNS Response (`RCODE` & Answer) | Verdict |
| :--- | :--- | :--- | :--- |
| **`doubleclick.net`** | Control (Third-Party Ad Tracker) | `NOERROR` -> **`CNAME blocked.kahfguard.com`** | **BLOCKED** |
| **`graph.facebook.com`** | Meta / Facebook SDK Event & Graph Endpoint (`ry3.java`, `AppId: 1121274686010716`) | `NOERROR` -> `CNAME star.c10r.facebook.com` -> **`A 57.144.142.141`** (TTL 3600) | **ALLOWED (UNBLOCKED)** |
| **`app-measurement.com`** | Google Firebase Analytics Ingestion Endpoint (`r54.java`) | `NOERROR` -> **`A 142.250.143.113`, `.139`, `.100`, `.102`, `.138`, `.101`** (TTL 3600) | **ALLOWED (UNBLOCKED)** |
| **`p.kahf.co.uk`** | Kahf's First-Party Reverse Proxy for PostHog Session Replay (`f20.java:15`) | `NOERROR` -> `CNAME large1.kahf.co.uk` -> **`A 157.180.4.107`** (TTL 24544) | **ALLOWED (UNBLOCKED)** |

> **Forensic Conclusion:** Even on "Strong Protection" (`high.kahfguard.com`), Kahf's DNS resolvers allow full resolution of Meta's tracking API (`graph.facebook.com`), Google's Firebase measurement API (`app-measurement.com`), and Kahf's own reverse-proxied PostHog session-replay collector (`p.kahf.co.uk` -> `large1.kahf.co.uk` at `157.180.4.107`), ensuring that telemetry from the Kahf Guard app is never blocked by its own DNS filter.

---

## 6. DNSSEC Validation & Latency Benchmark from Dhaka

### 6.1 DNSSEC Cryptographic Validation (`dns_verification_results.json:922-960`)
- **Valid Signature Test (`sigok.verteiltesysteme.net`, `DO=1`, `AD=1`):**
  - Response: `RCODE=0 (NOERROR)`, **`AD=true`**, `CNAME sigok.rsa2048-sha256.ippacket.stream` -> `A 195.201.14.36` with valid `RRSIG` records (`rttMs: 581.76`).
- **Bogus/Forged Signature Test (`sigfail.verteiltesysteme.net`, `DO=1`, `AD=1`):**
  - Response: **`RCODE=2 (SERVFAIL)`**, `AD=false`, `answers: []` (`rttMs: 680.53`).
- **Verdict:** DNSSEC validation is properly enforced on Kahf's upstream recursive resolver.

### 6.2 Latency Comparison from Dhaka, Bangladesh (`dns_verification_results.json:961-978`)

| Resolver Endpoint | Transport Tested | Location / Routing | Measured RTT from Dhaka |
| :--- | :--- | :--- | :--- |
| **`high.kahfguard.com` (`203.190.10.120`)** | DoT (Port 853) | Dhaka, BD (`AS58768` Daffodil Online / BDIX) | **`4.14 – 11.09 ms`** *(TLS Handshake: `20.04 ms`)* |
| **Cloudflare Families (`1.1.1.3`)** | UDP (Port 53) | Anycast (BDIX / Singapore route depending on ISP) | **`30.19 ms`** |
| **Quad9 (`9.9.9.9`)** | UDP (Port 53) | Anycast (Singapore / Mumbai route) | **`31.08 ms`** |
| **AdGuard Family (`94.140.14.15`)** | UDP (Port 53) | Anycast (Singapore route) | **`32.47 ms`** |
