# Kahf Guard Android (`com.kahf.dns` v4.6.287) — Technical Privacy, Network & Security Audit

> **Target Application:** Kahf Guard (`com.kahf.dns`)  
> **Version Audited:** `4.6.287` (`versionCode: 361`, Git Commit: `2a1ed43f12fd4fcaaa0f5662eccfc3287f73d5b1`)  
> **APK Provenance:** Downloaded via official Google Play Store on a **OnePlus Nord CE5** and extracted directly from the device via `adb pull` ([see full SHA-256 chain of custody](./00_raw_apks/APK_SOURCE_PROVENANCE.md)).

---

## Executive Summary of Findings

This directory contains the static reverse-engineering evidence and live client-side DNS wire-format verification for the **Kahf Guard** Android application and its public DNS resolvers (`high.kahfguard.com`, `medium.kahfguard.com`, `low.kahfguard.com`).

### Key Verified Findings

1. **Simultaneous Triple-SDK Analytics Fan-Out (Firebase + Meta/Facebook + PostHog):**
   - [`AndroidAnalyticsProviderFactory.java`](./02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L10-L13) wires `new qu1(new r54(), new ry3(), new n99())` ([`qu1.java`](./02_curated_decompiled_sources/p000/qu1.java#L22-L132)), dispatching every app event, screen view, user ID, and a daily 55-field device status snapshot ([`rp9.java`](./02_curated_decompiled_sources/p000/rp9.java#L840)) simultaneously to **Google Firebase** ([`r54.java`](./02_curated_decompiled_sources/p000/r54.java)), **Meta/Facebook Graph API** ([`ry3.java`](./02_curated_decompiled_sources/p000/ry3.java), `AppId: 1121274686010716`, `AdvertiserIDCollectionEnabled=true`), and **PostHog** ([`n99.java`](./02_curated_decompiled_sources/p000/n99.java)).
2. **First-Party Reverse-Proxied PostHog Session Replay, Touch Tracking & `logcat` Capture (Plus Email/Name PII Leak):**
   - [`f20.java`](./02_curated_decompiled_sources/p000/f20.java#L10-L19) routes PostHog telemetry (`phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N`) through a first-party UK proxy (`https://p.kahf.co.uk`) to evade DNS ad-blockers.
   - [`AbstractC0378gi.java`](./02_curated_decompiled_sources/p000/AbstractC0378gi.java#L786-L799) registers `PostHogReplayIntegration`, `PostHogTouchActivityIntegration`, and `PostHogLogCatIntegration` (which spawns `Runtime.getRuntime().exec("logcat -v epoch ...")` in [`gb9.java`](./02_curated_decompiled_sources/p000/gb9.java#L33-L35) & [`tu2.java`](./02_curated_decompiled_sources/p000/tu2.java#L83-L109)).
   - While Firebase (`r54.java`) and Facebook (`ry3.java`) strip `email` and `name`, [`n99.java`](./02_curated_decompiled_sources/p000/n99.java#L54-L68) explicitly extracts `email` and `name` and attaches them to the PostHog user profile.
3. **Hardware + `ANDROID_ID` Fingerprinting & First-Party Background Data Harvesting (`https://id.kahf.co/graphql`):**
   - [`sxc.java`](./02_curated_decompiled_sources/p000/sxc.java#L116-L284) (`sxc.m18373c`) hashes `Settings.Secure.ANDROID_ID` + 7 `android.os.Build` constants (`"aid:<android_id>|bld:<build_info>"`) into a non-resettable 48-bit `PRD<12-hex>` device fingerprint stored in `files/device_data/device_id.dat` (excluded from cloud backup) and sent as `X-Device-Id` on every GraphQL request ([`AuthInterceptor.java`](./02_curated_decompiled_sources/com/kahf/dns/p015di/core/AuthInterceptor.java#L52-L60)).
   - When linked to a Kahf account, background workers upload:
     - **Full Installed App Inventory** (`QUERY_ALL_PACKAGES` in [`C0639nl.java`](./02_curated_decompiled_sources/p000/C0639nl.java), [`l74.java`](./02_curated_decompiled_sources/p000/l74.java#L222-L308), and [`a0d.java`](./02_curated_decompiled_sources/p000/a0d.java#L47))
     - **Installed VPN Apps** ([`C0602ml.java`](./02_curated_decompiled_sources/p000/C0602ml.java#L155-L184), [`InstalledAppsSyncWorker.java`](./02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L141-L240), [`b53.java`](./02_curated_decompiled_sources/p000/b53.java#L267-L365), and [`h0d.java`](./02_curated_decompiled_sources/p000/h0d.java#L44))
     - **Hourly Per-App Screen Time** (`PACKAGE_USAGE_STATS` via `UpdateDeviceAppUsage` in [`mzc.java`](./02_curated_decompiled_sources/p000/mzc.java))
     - **Up to 34 Days of Scraped Browser URL Bar History** (`UpdateDeviceSiteVisits` in [`y0d.java`](./02_curated_decompiled_sources/p000/y0d.java#L45-L67), [`xcb.java`](./02_curated_decompiled_sources/p000/xcb.java#L330-L362), [`fdb.java`](./02_curated_decompiled_sources/p000/fdb.java#L63-L295)).
4. **Zero Local `VpnService` & The "DNS Safety Mechanism" Fail-Open Bug:**
   - Kahf Guard declares **no** `android.net.VpnService` in [`AndroidManifest.xml`](./01_manifest_and_resources/AndroidManifest.xml). It relies on manual copy-paste into Android's system Private DNS and uses `AccessibilityService` UI scraping to lock the Android Settings screen.
   - If Private DNS is unreachable while TCP `1.1.1.1:443` works ([`C0717pp.java`](./02_curated_decompiled_sources/p000/C0717pp.java#L176-L180) & [`m48.java`](./02_curated_decompiled_sources/p000/m48.java#L656-L657)), opening the Kahf Guard app triggers `ProtectionControlVM` ([`wo9.java`](./02_curated_decompiled_sources/p000/wo9.java#L326) -> [`C0890ud.java`](./02_curated_decompiled_sources/p000/C0890ud.java#L268) -> [`nb3.java`](./02_curated_decompiled_sources/p000/nb3.java#L91) -> [`nm9.java`](./02_curated_decompiled_sources/p000/nm9.java)), which **automatically and permanently disables DNS Change Prevention and Uninstall Prevention within ~5 seconds**.
5. **DNS Infrastructure Wire-Format Audit ([`dns_verification_results.json`](./04_evidence_dumps/dns_verification_results.json)):**
   - All three tiers (`high`, `medium`, `low.kahfguard.com`) resolve to a **single IPv4 address (`203.190.10.120`, `AS58768` Daffodil Online Ltd., Dhaka)** with **zero secondary IPv4 and zero IPv6 (`AAAA`) records**, running **PowerDNS `dnsdist`**.
   - **Why "Strong Protection" Breaks YouTube Comments:** `high.kahfguard.com` spoofs `www.youtube.com` directly to `A 216.239.38.120` (Google's Strict `restrict.youtube.com` VIP), globally hiding all YouTube comment sections.
   - **Tracker Self-Whitelisting:** While `high.kahfguard.com` blocks `doubleclick.net` (`CNAME -> blocked.kahfguard.com`), it **allows (`NOERROR`)** `graph.facebook.com`, `app-measurement.com`, and `p.kahf.co.uk`.

---

## Repository Directory Structure

```
KahfGuardAndroid_analysis/
├── 00_raw_apks/                        # Raw split APKs pulled from OnePlus Nord CE5 + SHA-256 hashes
│   ├── APK_SOURCE_PROVENANCE.md
│   ├── artifact_hashes.json
│   ├── base.apk
│   ├── split_config.arm64_v8a.apk
│   ├── split_config.en.apk
│   └── split_config.xxhdpi.apk
├── 01_manifest_and_resources/          # Unpacked AndroidManifest.xml & XML configurations
│   ├── AndroidManifest.xml
│   └── res/
├── 02_curated_decompiled_sources/      # Unobfuscated com.kahf.dns.* + cited R8 p000/*.java classes
│   ├── CURATED_SOURCES_INDEX.md        # Maps obfuscated p000/*.java classes to their exact roles
│   ├── com/kahf/dns/...
│   └── p000/...
├── 03_automation_scripts/              # Standalone Node.js static analysis & DNS verification scripts
│   ├── test_dns_resolvers.js
│   ├── deep_code_scanner.js
│   └── ...
├── 04_evidence_dumps/                  # Structured JSON outputs from static & DNS verification
│   ├── dns_verification_results.json
│   ├── deep_code_scan.json
│   ├── manifest_audit.json
│   └── ...
└── 05_reports/                         # Full Technical Audit Reports
    ├── 01_Executive_Privacy_and_Telemetry_Audit.md
    ├── 02_VpnService_and_Accessibility_Deep_Dive.md
    └── 03_DNS_Infrastructure_and_Failproof_Analysis.md
```

---

## Read the Full Reports

1. **[01 — Executive Privacy, Tracker & Telemetry Forensic Audit](./05_reports/01_Executive_Privacy_and_Telemetry_Audit.md)**
2. **[02 — VpnService Absence, System Private DNS & AccessibilityService Deep Dive](./05_reports/02_VpnService_and_Accessibility_Deep_Dive.md)**
3. **[03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis](./05_reports/03_DNS_Infrastructure_and_Failproof_Analysis.md)**
