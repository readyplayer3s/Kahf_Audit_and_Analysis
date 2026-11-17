# Kahf_Audit_and_Analysis — Independent Security, Privacy & Network Forensic Audits

> Dissecting and analyzing the apps developed by Kahf due to privacy concerns.

Welcome to **`readyplayer3s/Kahf_Audit_and_Analysis`** — an open, reproducible, evidence-first technical reference auditing the **Kahf** software and DNS ecosystem.

Every claim in this repository is backed by **verifiable static code evidence** (raw split APKs with SHA-256 hashes, `AndroidManifest.xml` nodes, decompiled Java/Kotlin class and method signatures) and **client-side DNS wire-format captures**.

---

## Audited Targets (for now) in This Repository

### 1. [`KahfGuardAndroid_analysis/`](./KahfGuardAndroid_analysis/) — Kahf Guard for Android (`com.kahf.dns` v4.6.287) & Public DNS Resolvers
- **Source Provenance:** Pulled directly via `adb` from a **OnePlus Nord CE5** after installing from the official Google Play Store ([SHA-256 Hashes & Provenance](./KahfGuardAndroid_analysis/00_raw_apks/APK_SOURCE_PROVENANCE.md)).
- **Reports:**
  1. [01 — Executive Privacy, Tracker & Telemetry Forensic Audit](./KahfGuardAndroid_analysis/05_reports/01_Executive_Privacy_and_Telemetry_Audit.md)
  2. [02 — VpnService Absence, System Private DNS & AccessibilityService Deep Dive](./KahfGuardAndroid_analysis/05_reports/02_VpnService_and_Accessibility_Deep_Dive.md)
  3. [03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis](./KahfGuardAndroid_analysis/05_reports/03_DNS_Infrastructure_and_Failproof_Analysis.md)
- **Curated Evidence Index:** [Cited Decompiled Source Files (`CURATED_SOURCES_INDEX.md`)](./KahfGuardAndroid_analysis/02_curated_decompiled_sources/CURATED_SOURCES_INDEX.md) | [DNS Wire-Format Verification JSON](./KahfGuardAndroid_analysis/04_evidence_dumps/dns_verification_results.json)

> **NOTE:** More apps like Kahf Browser, Kahf Kids, Hikmah, etc. will be audited in the future.

---

## Audit Principles & Methodology
1. **Zero Hand-Waving:** Every finding cites exact file paths, line numbers, and wire-format responses.
2. **Strict Separation of Facts, Flaws & Disproven Hypotheses:** When a suspected vector (such as remote `DexClassLoader` execution or custom root CA MitM) is *not* present, we explicitly document that it was checked and cleared.
3. **Local Static & Polite Client-Side Verification Only:** Zero backend exploitation, fuzzing, or high-rate stress testing against live infrastructure.

---

## ⚠️ Legal & Ethical Disclaimer (Safe Harbor Notice)

1. **Defensive Consumer Research Only:** All research, documentation, and scripts in this repository are published strictly for **educational, consumer-awareness, and defensive privacy-auditing purposes**.
2. **Client-Side Static Analysis & Benign Lookups:** Every finding in this repository was obtained exclusively by inspecting the publicly distributed Android application package (`.apk`) pulled from the author's own personal device, accompanied by standard, rate-limited (`>= 500ms` interval) public DNS queries (`<= 28` queries total). At no point were any backend servers, private APIs, or hosting networks port-scanned, fuzzed, exploited, or subjected to automated load testing.
3. **Strict Prohibition of Misuse:** The IP addresses, hostnames, and endpoint URLs documented in these reports (which are subject to change) are provided solely as verifiable technical evidence of client-side application behavior and network architecture. **The author strictly condemns and prohibits any unauthorized probing, port-scanning, stress-testing, DDoS, or intrusion attempts against any infrastructure referenced in this repository.** The author assumes zero liability for the actions of any third party who misuses this public information.
