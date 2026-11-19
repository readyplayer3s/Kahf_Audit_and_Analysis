# Kahf Guard Android (`com.kahf.dns` v4.6.287) — Technical Privacy, Network & Security Audit (v2.1.4)

> **Target Application:** Kahf Guard (`com.kahf.dns`)  
> **Version Audited:** `4.6.287` (`versionCode: 361`, Git Commit: `2a1ed43f12fd4fcaaa0f5662eccfc3287f73d5b1`)  
> **APK Provenance:** Downloaded via official Google Play Store on a **OnePlus Nord CE5** and extracted directly from the device via `adb pull` ([see full SHA-256 & signing certificate chain of custody](./00_raw_apks/APK_SOURCE_PROVENANCE.md)).  
> **Audit Scope:** Static DEX/APK analysis of `com.kahf.dns` `v4.6.287` plus live client-side DNS/DoT/DoH queries (no live app runtime MITM captures).  
> **Revision:** `v2.1.4` (Re-verified directly against raw `classes.dex` / `classes2.dex` bytecode, `strings.xml`, `res/xml/*`, Kahf's Privacy Policy, and multi-region DNS/DoH on Nov 19–20, 2026).

---

## Executive Summary of Findings

This directory contains the static reverse-engineering evidence and live client-side DNS wire-format verification for the **Kahf Guard** Android application and its public DNS resolvers (`high.kahfguard.com`, `medium.kahfguard.com`, `low.kahfguard.com`).

> **Scope & Framing Clarification:** Kahf Guard is **not** classic spyware — static analysis confirmed **no** custom root CA/DPI MitM, **no** remote `DexClassLoader` execution, **no** active PostHog screen recording or `logcat` upload, and **no** chat-message exfiltration. All major parental control features (`Browsing Reports`, `Risky Word Block`, `DNS Change Prevention`, `Uninstall Prevention`) default to `false`. However, the production APK contains **verified privacy concerns and Privacy Policy discrepancies** documented below.

### Key Verified Findings

1. **Mandatory Triple-SDK Analytics Fan-Out & Zero Opt-Out (Firebase + Meta/Facebook + Self-Hosted PostHog):**
   - [`AndroidAnalyticsProviderFactory.java`](./02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L16-L18) wires `new qu1(new r54(), new ry3(), new n99())` ([`qu1.java`](./02_curated_decompiled_sources/p000/qu1.java#L31-L82)), dispatching app events, screen views, and a daily **62-field** device/protection status snapshot ([`rp9.java`](./02_curated_decompiled_sources/p000/rp9.java#L789)) simultaneously to **Google Firebase** ([`r54.java`](./02_curated_decompiled_sources/p000/r54.java)), **Meta/Facebook Graph API** ([`ry3.java`](./02_curated_decompiled_sources/p000/ry3.java), `AppId: 1121274686010716`, `AutoLogAppEventsEnabled=true`, `AdvertiserIDCollectionEnabled=true`), and Kahf's **self-hosted PostHog** server (`https://p.kahf.co.uk`, [`f20.java`](./02_curated_decompiled_sources/p000/f20.java#L10-L19)). *(SDK cap note: while `tk2` dispatches all 62 fields to all three providers, Firebase Analytics and Meta App Events enforce a 25-parameter-per-event limit and truncate/drop excess parameters in practice, whereas self-hosted PostHog receives all 62 fields plus `$set` properties.)*
   - There is **zero in-app opt-out toggle**; Kahf's Privacy Policy explicitly states that the only way to stop data collection is to uninstall the app.
   - **Self-Hosted PostHog Clarification (v2.0 Correction):** `p.kahf.co.uk` resolves to Kahf's own Hetzner host (`large1.kahf.co.uk` → `157.180.4.107`), not PostHog Cloud (disclosed in Kahf's Privacy Policy). Raw DEX verification (`Ly3c;->p@360,402` → `Lk99;->z@37` → `Lcd9;->r` & `Lbp;->run@58-62`) confirms **PostHog Session Replay is compiled-off (`false`)** in `v4.6.287` (even remote config cannot enable it without an app update), `PostHogTouchActivityIntegration` (`vd9`, branch 0 of R8-merged `Lxc9;->a`) only resets the session idle timer (while branch 1's `Lcd9` `MotionEvent.obtain` is unreachable dead code behind `sessionReplay = false`), and `PostHogLogCatIntegration` (`gb9`/`tu2`) discards all log lines while replay is inactive. Logged-in user `email` and `name` are sent to self-hosted PostHog ([`n99.java`](./02_curated_decompiled_sources/p000/n99.java#L54-L69)), not Firebase or Meta.

2. **Undisclosed Persistent Hardware Fingerprint (`PRD<12-hex>`) Sent to Meta as `app_user_id` & Public IP Fan-Out:**
   - [`sxc.java`](./02_curated_decompiled_sources/p000/sxc.java#L116-L284) (`sxc.m18373c`) hashes `Settings.Secure.ANDROID_ID` + 7 `android.os.Build` constants (`"aid:<android_id>|bld:<build_info>"`) via SHA-256 into a deterministic 48-bit `PRD<12-hex>` identifier stored in `SharedPreferences("user_prefs")` and `files/device_data/device_id.dat` (excluded from `<cloud-backup>` in `data_extraction_rules.xml`, though `<device-transfer>` only excludes `AppPreferences.xml`).
   - Even when **logged out**, this persistent `PRD` ID is set on **PostHog** ([`KahfGuardApp.java`](./02_curated_decompiled_sources/com/kahf/dns/KahfGuardApp.java#L160-L194) → [`ab9.java`](./02_curated_decompiled_sources/p000/ab9.java#L95-L121)) and attached as `X-Device-Id` on every **GraphQL** request ([`AuthInterceptor.java`](./02_curated_decompiled_sources/com/kahf/dns/p015di/core/AuthInterceptor.java#L52-L60)). Statically in raw DEX, [`l74.java`](./02_curated_decompiled_sources/p000/l74.java#L318-L377) (case 2, no login check) → `C0391gv` → [`MainActivity.java`](./02_curated_decompiled_sources/com/kahf/dns/p019ui/MainActivity.java#L585-L605) (`m5528t`, line 604) passes `PRD<12-hex>` (when Google Play Services is available) to **Firebase** and **Meta's `AnalyticsUserIDStore.setUserID`** (`Lce;->b`, also invoked by `ry3.setUserId`), which `Lg30;->a` attaches as **`"app_user_id"`** on Meta Graph API payloads *(note: `MainActivity.onCreate` and `KahfGuardApp.onCreate` are PairIP-virtualized, so confirming exact logged-out first-launch wire traffic requires dynamic/MITM observation; see Report 01 Section 3.1)*. Resetting GAID in Android Settings does **not** reset this ID. Kahf's Privacy Policy omits this persistent ID and states Meta only collects *"standard SDK auto-events"* and *"Only aggregated, anonymized data"*, whereas Kahf's code (`qu1` → `ry3` & `MainActivity.m5528t`) actively sends `PRD` (`app_user_id`), custom app events, screen views, subscription properties (`user_properties_updated`), `MindfulPauseEvent` ([`AnalyticsEvent.java:8992-9236`](./02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L8992-L9236), sending monitored third-party `package_name`, `opens_in_window`, `daily_limit`, and `duration_seconds` to Meta & Firebase too), and diagnostic events with public IPs.
   - Additionally, while Kahf's Privacy Policy discloses seeing the user's public IP itself (*"If you have a public IP, then we see your public IP"*), it does **not** disclose passing `last_known_ip` / `current_ip` as custom event parameters to **third-party analytics SDKs (Meta & Firebase)** across **three** live events: `DiagnosticRun` ([`nb3.java:191`](./02_curated_decompiled_sources/p000/nb3.java#L191), [`AnalyticsEvent.java:6880`](./02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L6875-L6893), param **#4**), `PostDnsSetDiagnosticEvent.Check` ([`AnalyticsEvent.java:9807`](./02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L9801-L9819), param **#4**, invoked in `Lwj2;->invokeSuspend@246`), and `DnsSafetyDisable` ([`C0890ud.java:238,257`](./02_curated_decompiled_sources/p000/C0890ud.java#L238-L257), [`AnalyticsEvent.java:7245,7324-7332`](./02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L7245-L7332), 8 params total) — all three well within Firebase's and Meta's 25-parameter SDK cap.

3. **Installed App Inventory & Hourly Usage Sync Not Restricted to Child Devices (`https://id.kahf.co/graphql`):**
   - Kahf's Privacy Policy contains two separate bullets: a general bullet (*"The amount of time spent on the other Apps"*) and a child-specific bullet (*"On Child Device, we get the App List & Screen-time for Parents to see"*).
   - **Direct Policy Contradiction (Installed App List & VPN Apps):** Although the Policy *only* mentions App List under *"On Child Device"*, `InstalledAppsSyncWorker` ([`l74.java`](./02_curated_decompiled_sources/p000/l74.java#L222-L316)) has **zero `isChildDevice()` check**. Because standard adult (`FAMILY`/`ORG`) sign-ins register and save `device_mongodb_id` (`Lcf0;->k@881` (dispatching via `Lfj7;->m`) → `Lcf0;->v` → `Lcf0;->z`), **any logged-in account (adult or child)** automatically uploads **all launchable user-installed apps plus 161 curated system/preinstalled packages** ([`C0639nl.java:47-52`](./02_curated_decompiled_sources/p000/C0639nl.java#L47-L52), `f28440e`, via `QUERY_ALL_PACKAGES` with no runtime permission needed) and **installed VPN apps** ([`C0602ml.java:155-184`](./02_curated_decompiled_sources/p000/C0602ml.java#L155-L184), excluding 10 MDM/enterprise/Kahf Browser packages in `C0639nl.f28439d`; [`b53.java`](./02_curated_decompiled_sources/p000/b53.java#L267-L365)) to `id.kahf.co/graphql`.
   - **Usage Sync Nuance (`AppUsageSyncWorker` / `Lx00`):** While screen-time is also listed under the general Policy bullet, in code `AppUsageSyncWorker` (`Lx00`) checks `isChildDevice()` (`Ls4c;->g()`) + `ro.kahf.rom == "1"` **only** on the Kahf-ROM `"kahf_cadence"` branch—bypassing that gate entirely on the standard 6-hour periodic schedule unconditionally registered by `KahfGuardApp.m3565i()` (`Lsy0;->x0`). Thus, if a logged-in adult grants `Usage Access` (`PACKAGE_USAGE_STATS`) for self-use features (*App Usage / Screen Time Limits*), hourly per-app usage also syncs to `id.kahf.co/graphql`.
   - **Opt-In Clarifications:** `Risky Word Block` (`pref_risky_word_block_enabled`, default `false`) scans text locally in RAM and uploads zero chat content. `Browsing Reports` (`pref_browsing_report_enabled`, default `false`) extracts **domain names only** (`example.com`, not full URLs or searches), retains them locally for 35 days (`site_visit`), and uploads up to 34 days via `UpdateDeviceSiteVisits` ([`fdb.java`](./02_curated_decompiled_sources/p000/fdb.java#L63-L295), [`y0d.java`](./02_curated_decompiled_sources/p000/y0d.java#L45-L67)).

4. **Zero Local `VpnService` & The "DNS Safety Mechanism" Fail-Open Bypass:**
   - Kahf Guard declares **no** `android.net.VpnService` in [`AndroidManifest.xml`](./01_manifest_and_resources/AndroidManifest.xml) and relies on manual Android Private DNS + `AccessibilityService` UI locks.
   - When the local device opens the Protection screen ([`wo9.java`](./02_curated_decompiled_sources/p000/wo9.java#L324-L329) — **not** a 60-second background loop) while `1.1.1.1:443` is reachable ([`C0717pp.java`](./02_curated_decompiled_sources/p000/C0717pp.java#L176-L180)) but Kahf DoT (`853`) fails ([`m48.java`](./02_curated_decompiled_sources/p000/m48.java#L656-L657)), `C0890ud` → [`nb3.java`](./02_curated_decompiled_sources/p000/nb3.java#L91) → [`nm9.java`](./02_curated_decompiled_sources/p000/nm9.java) automatically disables Accessibility-based `dns_change_prevention` and `uninstall_prevention` with no PIN or cooldown (though Device Admin `super_uninstall_protection` stays active if separately enabled).

5. **Multi-Region GeoDNS & Filtering Audit ([`dns_verification_results.json`](./04_evidence_dumps/dns_verification_results.json)):**
   - **v2.0 Correction:** `kahfguard.com` uses **ClouDNS GeoDNS** (`gns21-24.cloudns.net`). US/EU/UK resolvers receive `CNAME hz-prod.kahfguard.com` → **3 Hetzner IPv4s** (`157.90.95.113`, `46.4.74.205`, `142.132.207.231`), while Bangladesh/SE Asia resolves to `CNAME bdix-high.kahfguard.com` → **`203.190.10.120` (`AS58768` Daffodil Online / BDIX)** and **IPv6 `AAAA 2400:fa40:400:1::120`** (single-node regional SPOF for Bangladesh, running PowerDNS `dnsdist`).
   - **YouTube Comments Breakage:** `high.kahfguard.com` rewrites `www.youtube.com` to `A 216.239.38.120` (`restrict.youtube.com`), disabling YouTube comments globally.
   - **Tracker Filtering Parity:** Like Cloudflare Family and AdGuard Family, `high.kahfguard.com` allows `graph.facebook.com` so Facebook/Instagram apps don't break. However, unlike AdGuard Family (which blocks `app-measurement.com` → `0.0.0.0`), Kahf DNS allows `app-measurement.com` (Google Firebase) as well as its own `p.kahf.co.uk`.

---

## Repository Directory Structure

```
KahfGuardAndroid_analysis/
├── 00_raw_apks/                        # Raw split APKs pulled from OnePlus Nord CE5 + SHA-256 hashes
├── 01_manifest_and_resources/          # Unpacked AndroidManifest.xml & XML configurations
├── 02_curated_decompiled_sources/      # Unobfuscated com.kahf.dns.* + cited R8 p000/*.java classes
│   └── CURATED_SOURCES_INDEX.md        # Maps obfuscated p000/*.java classes to their exact roles
├── 03_automation_scripts/              # Standalone Node.js static analysis & DNS verification scripts
├── 04_evidence_dumps/                  # Structured JSON outputs from static & DNS verification
└── 05_reports/                         # Full Technical Audit Reports (v2.1.4)
    ├── 01_Executive_Privacy_and_Telemetry_Audit.md
    ├── 02_VpnService_and_Accessibility_Deep_Dive.md
    └── 03_DNS_Infrastructure_and_Failproof_Analysis.md
```

---

## Read the Full Reports

1. **[01 — Executive Privacy, Tracker & Telemetry Forensic Audit](./05_reports/01_Executive_Privacy_and_Telemetry_Audit.md)**
2. **[02 — VpnService Absence, System Private DNS & AccessibilityService Deep Dive](./05_reports/02_VpnService_and_Accessibility_Deep_Dive.md)**
3. **[03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis](./05_reports/03_DNS_Infrastructure_and_Failproof_Analysis.md)**
