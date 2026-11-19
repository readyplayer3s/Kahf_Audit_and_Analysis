# 03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis (v2.1.4)
**Target Infrastructure:** `high.kahfguard.com`, `medium.kahfguard.com`, `low.kahfguard.com`, `safety.kahfguard.com`  
**Verification Method:** Rate-Limited Client-Side Wire-Format DoT/DoH Inspection + Multi-Region EDNS Client Subnet (ECS) & `AAAA` Verification  
**Raw Evidence Dump (Initial Dhaka Run):** [`04_evidence_dumps/dns_verification_results.json`](../04_evidence_dumps/dns_verification_results.json)  
**Test Script:** [`03_automation_scripts/test_dns_resolvers.js`](../03_automation_scripts/test_dns_resolvers.js)  
**Revision:** `v2.1.4` (Corrected single-IP/zero-IPv6 error in `v2.0`, fixed DNS tier DEX citations in `v2.1`, and verified Dhaka RTT & `p.kahf.co.uk` `CNAME large1.kahf.co.uk -> 157.180.4.107` via Cloudflare/Google DoH on Nov 19–20, 2026)

---

## 📢 v2.0 Methodology Errata (Why v1.0 Missed GeoDNS & IPv6)
Version 1.0 of this report claimed that `high/medium/low.kahfguard.com` resolved globally to a single Dhaka IPv4 address (`203.190.10.120`) with zero IPv6 (`AAAA`) support. **That conclusion was incorrect** due to two measurement errors in v1.0's `test_dns_resolvers.js`:
1. `test_dns_resolvers.js` used `dns.promises.lookup(host, { all: true })` (OS `getaddrinfo` with `AI_ADDRCONFIG`) on an IPv4-only Dhaka connection, which suppresses `AAAA` records when the local host lacks IPv6 connectivity.
2. Querying only from Dhaka showed only the Bangladesh/SE Asia GeoDNS pool.

Re-testing directly via explicit `A`/`AAAA` queries and EDNS Client Subnet (ECS) probes confirmed **ClouDNS GeoDNS (`gns21-24.cloudns.net`)**, multi-IP Hetzner nodes for EU/US, and live IPv6 (`AAAA 2400:fa40:400:1::120`) on the Bangladesh BDIX pool. `test_dns_resolvers.js` has been updated to use `dns.promises.resolve4()` and `dns.promises.resolve6()`.

---

## 1. Executive Summary of DNS Infrastructure Findings

| Audit Question | Classification | Forensic Verdict & Exact Evidence |
| :--- | :--- | :--- |
| **Where are Kahf's DNS resolvers hosted (GeoDNS & IPv6)?** | **Verified Network Fact (v2.0 Corrected)** | `kahfguard.com` uses **ClouDNS GeoDNS** (`gns21-24.cloudns.net`):<br>• **EU / US / UK:** `CNAME hz-prod.kahfguard.com` → **3 Hetzner IPv4s** (`157.90.95.113`, `46.4.74.205`, `142.132.207.231`).<br>• **Bangladesh / SE Asia:** `CNAME bdix-high.kahfguard.com` (and `bdix-medium` / `bdix-low`) → **`A 203.190.10.120`** (`AS58768` Daffodil Online Ltd. / BDIX, Dhaka) **AND `AAAA 2400:fa40:400:1::120`**. |
| **Regional Single-Node Risk (Bangladesh Only)** | **Architectural Observation** | While globally GeoDNS-routed, the Bangladesh/SE Asia pool (`bdix-*.kahfguard.com`) resolves to a **single BDIX IPv4 (`203.190.10.120`) and single IPv6 (`2400:fa40:400:1::120`)** with no secondary BDIX failover IP in DNS answers. |
| **Dead Legacy Host (`safety.kahfguard.com`)** | **Verified Code & Network Fact** | Referenced in `classes2.dex` (`safety.kahfguard.com`), which returns **`NXDOMAIN`** in live DNS. The app uses `thequran.com` (`CNAME -> blocked.kahfguard.com`) as its active canary domain ([`oa3.java:107`](../02_curated_decompiled_sources/p000/oa3.java#L107), [`i48.java:116`](../02_curated_decompiled_sources/p000/i48.java#L116)). |
| **Server Software Fingerprint (`PowerDNS dnsdist`)** | **Verified Network Fact** | `https://high.kahfguard.com/dns-query` over HTTP/1.1 returns HTTP `505` with **PowerDNS `dnsdist`**'s hardcoded RFC 8484 HTTP/2 notice. |
| **Why `high.kahfguard.com` Breaks YouTube Comments** | **Verified Network Fact** | On `high.kahfguard.com`, `www.youtube.com` is rewritten directly to `A 216.239.38.120` (`restrict.youtube.com`, TTL `3600`), enforcing Strict Restricted Mode and hiding all YouTube comment sections. On `medium` and `low`, `www.youtube.com` resolves normally. |
| **Tracker Filtering Parity vs. AdGuard & Cloudflare Family** | **Verified Network Fact (v2.0 Nuance)** | Live DoH comparison confirms **both Cloudflare Family and AdGuard Family also allow `graph.facebook.com`** (blocking it breaks Facebook/Instagram login & apps). However, **AdGuard Family blocks `app-measurement.com` (`0.0.0.0`)**, whereas **Kahf DNS and Cloudflare Family allow it**. Kahf's own self-hosted PostHog server (`p.kahf.co.uk`) is also allowed. |
| **DNSSEC Cryptographic Validation & NXDOMAIN Integrity** | **Verified Network Fact (Passed)** | `high.kahfguard.com` properly validates DNSSEC: `sigok.verteiltesysteme.net` returns `NOERROR` with **`AD=true`**, and `sigfail.verteiltesysteme.net` returns **`SERVFAIL` (`RCODE=2`)**. Non-existent domains return clean `NXDOMAIN` (`RCODE=3`). |

---

## 2. Multi-Region GeoDNS Resolution & Hosting Breakdown

| Hostname | Tier Role (`v4.6.287` DEX) | EU / US / UK Pool (`hz-prod.kahfguard.com`) | Bangladesh / SE Asia Pool (`bdix-*.kahfguard.com`) |
| :--- | :--- | :--- | :--- |
| `high.kahfguard.com` | Strong Protection (`a13.f56f` / `vc3` / `i48`) | `A`: `157.90.95.113`, `46.4.74.205`, `142.132.207.231` (Hetzner) | `A`: `203.190.10.120` (`AS58768` BDIX)<br>`AAAA`: `2400:fa40:400:1::120` |
| `medium.kahfguard.com` | Moderate Protection (`a13.f56f` / `vc3` / `i48`) | `A`: `157.90.95.113`, `46.4.74.205`, `142.132.207.231` (Hetzner) | `A`: `203.190.10.120` (`AS58768` BDIX)<br>`AAAA`: `2400:fa40:400:1::120` |
| `low.kahfguard.com` | Weak Protection (`a13.f56f` / `vc3` / `i48`) | `A`: `157.90.95.113`, `46.4.74.205`, `142.132.207.231` (Hetzner) | `A`: `203.190.10.120` (`AS58768` BDIX)<br>`AAAA`: `2400:fa40:400:1::120` |
| `safety.kahfguard.com` | Legacy Host (`classes2.dex`) | **`NXDOMAIN`** | **`NXDOMAIN`** |

### Architectural Notes
1. **SNI-Based Tier Multiplexing:** Because `high`, `medium`, and `low` share the same IPs within each region, Kahf's `dnsdist` inspects the TLS SNI on DoT Port `853` to select the filtering tier.
2. **Regional Redundancy Gap (Bangladesh):** While EU/US resolvers distribute across 3 Hetzner IPv4s, Bangladesh/SE Asia users hit a single BDIX IPv4/IPv6 pair (`AS58768` Daffodil Online Ltd.). If that BDIX node becomes unreachable while general internet (`1.1.1.1:443`) works, opening Kahf Guard's Protection screen triggers the `DnsSafetyManager` fail-open bypass (Report 02, Section 3).

---

## 3. Transport Protocol & TLS Certificate Inspection

From [`dns_verification_results.json:150-234`](../04_evidence_dumps/dns_verification_results.json#L150-L234):
- **Protocol & Cipher Suite:** `TLSv1.3` with `TLS_AES_256_GCM_SHA384`, ALPN `"dot"`.
- **Certificate Subject & SANs:** `CN=kahfguard.com`, SANs: `*.kahfguard.com, kahfguard.com`.
- **Certificate Issuer:** Let's Encrypt (`CN=YE1`), 90-day lifecycle.

---

## 4. Tier-by-Tier Wire-Format Filtering Matrix (`high` vs `medium` vs `low`)

Executed over **DNS-over-TLS (Port 853)** ([`dns_verification_results.json:236-825`](../04_evidence_dumps/dns_verification_results.json#L236-L825)):

| Query Domain (`QTYPE=A`) | `high.kahfguard.com` (Strong) | `medium.kahfguard.com` (Moderate) | `low.kahfguard.com` (Weak) | Technical Analysis |
| :--- | :--- | :--- | :--- | :--- |
| **`www.youtube.com`** | **`A 216.239.38.120`** (`restrict.youtube.com`) | Normal Google CDN IPs | Normal Google CDN IPs | **`high` disables YouTube comments globally** via Strict Restricted Mode rewrite. |
| **`www.google.com`** | **`A 216.239.38.120`** (`forcesafesearch.google.com`) | **`A 216.239.38.120`** | Normal Google IPs | `high` and `medium` enforce Google SafeSearch; `low` does not. |
| **`www.bing.com`** | **`A 150.171.27.16`** (`strict.bing.com`) | **`A 150.171.27.16`** | Normal Bing CDN | `high` and `medium` enforce Bing Strict SafeSearch; `low` does not. |
| **`pornhub.com`** | `CNAME blocked.kahfguard.com` | `CNAME blocked.kahfguard.com` | `CNAME blocked.kahfguard.com` | Blocked across all 3 tiers. |
| **`thequran.com`** | `CNAME blocked.kahfguard.com` | `CNAME blocked.kahfguard.com` | `CNAME blocked.kahfguard.com` | Hardcoded canary domain (`oa3.java:107` / `i48.java:116`) used to detect active Kahf DNS. |
| **`nxdomain-audit-check-982734.invalid`** | `RCODE=3 (NXDOMAIN)` | — | — | Clean `NXDOMAIN`; no NXDOMAIN hijacking. |

---

## 5. Tracker Filtering Comparison (Kahf `high` vs. AdGuard Family vs. Cloudflare Family)

Live comparison via DoT (`high.kahfguard.com`) and DoH (`family.adguard-dns.com`, `family.cloudflare-dns.com`):

| Domain | Kahf Guard (`high`) | AdGuard Family (`family.adguard-dns.com`) | Cloudflare Family (`family.cloudflare-dns.com`) | Notes |
| :--- | :--- | :--- | :--- | :--- |
| **`pornhub.com`** | **BLOCKED** (`blocked.kahfguard.com`) | **BLOCKED** (`94.140.14.35`) | **BLOCKED** (`0.0.0.0`) | Adult content blocked by all three. |
| **`doubleclick.net`** | **BLOCKED** (`blocked.kahfguard.com`) | **BLOCKED** (`0.0.0.0`) | ALLOWED | Kahf & AdGuard block ad domains; Cloudflare Family only filters adult/malware. |
| **`graph.facebook.com`** | **ALLOWED** | **ALLOWED** | **ALLOWED** | Allowing `graph.facebook.com` is standard across family DNS resolvers so Facebook/Instagram apps don't break. |
| **`app-measurement.com`** | **ALLOWED** | **BLOCKED** (`0.0.0.0`) | **ALLOWED** | Google Firebase Analytics endpoint (also used by Kahf Guard's own Firebase SDK). AdGuard Family blocks it; Kahf and Cloudflare Family allow it. |
| **`p.kahf.co.uk`** | **ALLOWED** (`157.180.4.107`) | — | — | Kahf's own self-hosted PostHog server (`large1.kahf.co.uk`). |

---

## 6. DNSSEC Validation & Dhaka Latency Benchmark

- **DNSSEC Validation (`dns_verification_results.json:922-960`):** `sigok.verteiltesysteme.net` → `NOERROR` with **`AD=true`** (`RRSIG` present); `sigfail.verteiltesysteme.net` → **`SERVFAIL` (`RCODE=2`)**. **Passed.**
- **Dhaka Latency (`dns_verification_results.json:961-978` & `236-825`):** In `latencyBenchmarkDhaka` (lines `961-978`), `high.kahfguard.com` DoT via BDIX (`203.190.10.120`) measured **`7.83 ms`** query RTT (`20.04 ms` TLS handshake), vs. `30.19 ms` (Cloudflare), `31.08 ms` (Quad9), and `32.47 ms` (AdGuard) from the same Dhaka ISP. Across `tierComparison` (lines `236-825`), cached DoT RTT measured **`4.93–9.17 ms`** on `high.kahfguard.com` alone, and **`4.14–11.09 ms`** across all three tiers (excluding one `172.38 ms` cache-miss query on `medium.kahfguard.com` for `www.google.com`).
