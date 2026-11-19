# Kahf_Audit_and_Analysis — Independent Security, Privacy & Network Forensic Audits

> Dissecting and analyzing the apps developed by Kahf due to privacy concerns.

Welcome to **`readyplayer3s/Kahf_Audit_and_Analysis`** — an open, reproducible, evidence-first technical reference auditing the **Kahf** software and DNS ecosystem.

Every claim in this repository is backed by **verifiable static code evidence** (raw split APKs with SHA-256 hashes, `AndroidManifest.xml` nodes, decompiled Java/Kotlin + Dalvik bytecode citations) and **client-side DNS wire-format captures**.

> **📢 v2.1.4 Correction & Re-Verification Notice (Nov 19–20, 2026):**
> Following reader feedback, a technical response from a Kahf developer, a complete line-by-line re-verification directly against raw DEX bytecode (`classes.dex` / `classes2.dex`) and multi-region DNS/DoH queries (`v2.0`), and follow-up citation, bytecode, and Privacy Policy cross-checks (`v2.1` → `v2.1.4`), **all reports and summaries in this repository have been updated to v2.1.4**.
> - **Audit Scope:** All findings are derived exclusively from static DEX/APK analysis of `com.kahf.dns` `v4.6.287` (`versionCode: 361`) plus live client-side DNS/DoT/DoH queries (no live app runtime MITM captures).
> - **Retracted / Corrected from v1.0:** Removed spyware framing and confirmation-biased wording (`General_Summary.md`); corrected the single-IP / zero-IPv6 DNS claim (Kahf uses ClouDNS GeoDNS with 3 Hetzner IPv4s for EU/US and a BDIX IPv4 + IPv6 node for BD/SE Asia); corrected `p.kahf.co.uk` from "hidden cloud proxy" to Kahf's self-hosted PostHog instance; retracted claims of active PostHog Session Replay, touch-coordinate capture, and `logcat` exfiltration (bytecode confirms `sessionReplay` is compiled-off `false` in `v4.6.287`); clarified opt-in (`false` default) parental control features, local-only Risky Word Block scanning, domain-only Browsing Reports, and DoH parity with Cloudflare/AdGuard Family on `graph.facebook.com`.
> - **Confirmed & Strengthened (v2.0 → v2.1.4):** Verified statically in raw Dalvik bytecode that `l74` (case 2, no login check) → `C0391gv` → `MainActivity.m5528t` (`MainActivity.java:604`) passes Kahf's undisclosed deterministic hardware+`ANDROID_ID` hash (`PRD<12-hex>`, `sxc.java`) directly to Meta's `AnalyticsUserIDStore.setUserID` (`Lce;->b` → `Lg30;->a` `"app_user_id"`, surviving GAID resets; `ry3.setUserId` also invokes `Lce;->b` — while `MainActivity.onCreate` and `KahfGuardApp.onCreate` are PairIP-virtualized, so confirming exact logged-out first-launch wire traffic requires runtime/MITM observation), alongside custom events, screen views, subscription properties (`user_properties_updated`), and `MindfulPauseEvent` (sending monitored third-party `package_name`, `opens_in_window`, `daily_limit`, `duration_seconds` to Meta & Firebase via `qu1`)—contrasting with the Privacy Policy's *"standard SDK auto-events"* and *"Only aggregated, anonymized data"* wording; verified that while Kahf's Policy discloses *seeing* the user's public IP itself, it omits forwarding `last_known_ip`/`current_ip` to third-party analytics SDKs (Meta & Firebase) across **three** live events (`DiagnosticRun`, `PostDnsSetDiagnosticEvent.Check`, and `DnsSafetyDisable`, all within Firebase/Meta's 25-parameter SDK cap); verified `InstalledAppsSyncWorker` (`l74.java`) has zero `isChildDevice()` gate (uploading all launchable user-installed apps plus 161 curated system/preinstalled packages `C0639nl.f28440e` for adult accounts too, directly contradicting the Policy's child-only App List bullet) while `AppUsageSyncWorker` (`Lx00`) bypasses its `isChildDevice()` check on the standard 6-hour periodic schedule; verified the 62-field daily snapshot (`rp9.java`, noting Firebase/Meta's 25-parameter SDK cap vs. full receipt on self-hosted PostHog), zero in-app opt-out, and the `wo9` → `nb3` → `nm9` DNS fail-open bypass.
> - **v2.1 → v2.1.4 Precision Refinements:** Fixed `qa3.java`, `bcb.java`, `m48.java` (`TimeZone` line `69`), `C0969wi.java`, `sxc.java` (`268-282`), `Lcf0`/`Lfj7` (`Lcf0;->k@881` via `Lfj7;->m` → `Lcf0;->v` → `Lcf0;->z`), `accessibility_service_config.xml`, and Dhaka RTT JSON citations; removed erroneous `wss://id.kahf.co/graphql` mention; added `PostDnsSetDiagnosticEvent.Check` (`AnalyticsEvent.java:9807`, `Lwj2`) and `MindfulPauseEvent` (`AnalyticsEvent.java:8992-9236`, `Lhe6`/`Lir9`); qualified `C0639nl` & `C0602ml`; added PairIP static-boundary notes (`MainActivity.onCreate` & `KahfGuardApp.onCreate`), `data_extraction_rules.xml` nuance, `Lxc9` R8-merged dead branch note, APK Signature Scheme v2/v3 signing cert & `version-control-info.textproto` in `APK_SOURCE_PROVENANCE.md`, exact `classes.dex` byte size (`6,000,020` bytes / `6.00 MB`), exact Privacy Policy wording comparisons, and Android UI labels (`KG-AdminZ` / `Kahf Guard Protections`).

---

## Audited Targets (for now) in This Repository

### 1. [`KahfGuardAndroid_analysis/`](./KahfGuardAndroid_analysis/) — Kahf Guard for Android (`com.kahf.dns` v4.6.287) & Public DNS Resolvers
- **Source Provenance:** Pulled directly via `adb` from a **OnePlus Nord CE5** after installing from the official Google Play Store ([SHA-256 Hashes & Provenance](./KahfGuardAndroid_analysis/00_raw_apks/APK_SOURCE_PROVENANCE.md)).
- **Reports (v2.1.4 Re-Verified):**
  1. [01 — Executive Privacy, Tracker & Telemetry Forensic Audit](./KahfGuardAndroid_analysis/05_reports/01_Executive_Privacy_and_Telemetry_Audit.md)
  2. [02 — VpnService Absence, System Private DNS & AccessibilityService Deep Dive](./KahfGuardAndroid_analysis/05_reports/02_VpnService_and_Accessibility_Deep_Dive.md)
  3. [03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis](./KahfGuardAndroid_analysis/05_reports/03_DNS_Infrastructure_and_Failproof_Analysis.md)
- **Curated Evidence Index:** [Cited Decompiled Source Files (`CURATED_SOURCES_INDEX.md`)](./KahfGuardAndroid_analysis/02_curated_decompiled_sources/CURATED_SOURCES_INDEX.md) | [DNS Wire-Format Verification JSON](./KahfGuardAndroid_analysis/04_evidence_dumps/dns_verification_results.json)

> **NOTE:** More apps like Kahf Browser, Kahf Kids, Hikmah, etc. may be audited in the future.

---

## Audit Principles & Methodology
1. **Zero Hand-Waving:** Every finding cites exact file paths, line numbers, raw DEX bytecode paths, and wire-format DNS responses.
2. **Public Errata & Transparency:** When re-verification or community review exposes an inaccuracy or overstatement in our analysis, we publicly correct and document it rather than quietly hiding it.
3. **Strict Separation of Facts, Flaws & Disproven Hypotheses:** When a suspected vector (such as remote `DexClassLoader` execution, custom root CA MitM, or active PostHog screen recording) is *not* present, we explicitly document that it was checked and cleared.
4. **Local Static & Polite Client-Side Verification Only:** Zero backend exploitation, fuzzing, or high-rate stress testing against live infrastructure.

---

## ⚠️ Legal & Ethical Disclaimer (Safe Harbor Notice)

1. **Defensive Consumer Research Only:** All research, documentation, and scripts in this repository are published strictly for **educational, consumer-awareness, and defensive privacy-auditing purposes**.
2. **Client-Side Static Analysis & Benign Lookups:** Every finding in this repository was obtained exclusively by inspecting the publicly distributed Android application package (`.apk`) pulled from the author's own personal device, accompanied by standard, rate-limited (`>= 500ms` interval) public DNS queries. At no point were any backend servers, private APIs, or hosting networks port-scanned, fuzzed, exploited, or subjected to automated load testing.
3. **Strict Prohibition of Misuse:** The IP addresses, hostnames, and endpoint URLs documented in these reports (which are subject to change) are provided solely as verifiable technical evidence of client-side application behavior and network architecture. **The author strictly condemns and prohibits any unauthorized probing, port-scanning, stress-testing, DDoS, or intrusion attempts against any infrastructure referenced in this repository.** The author assumes zero liability for the actions of any third party who misuses this public information.
