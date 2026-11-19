# 01 — Executive Privacy, Tracker & Telemetry Forensic Audit (v2.1.2)
**Target Application:** Kahf Guard (`com.kahf.dns`)  
**Version Audited:** `versionName: "4.6.287"` (`versionCode: 361`, Git Commit: `2a1ed43f12fd4fcaaa0f5662eccfc3287f73d5b1`)  
**Target SDK / Min SDK:** `targetSdkVersion: 37` / `minSdkVersion: 32` (Android 12L+)  
**Audit Posture:** Defensive Client-Side Static Forensic Verification (Raw DEX Dalvik bytecode inspection + `jadx 1.5.1` + `apktool 2.11.1`)  
**Revision:** `v2.1.2` (Re-verified against `classes.dex` / `classes2.dex`, `res/xml/*`, and Kahf's exact Privacy Policy text on Nov 19–20, 2026)

---

## 1. Executive Summary & Evidence Classification

Kahf Guard markets itself as a family-safety and content-filtering application. Static analysis of the production split APK (`v4.6.287`) clears several high-severity spyware hypotheses (no custom root CA / TLS MitM, no remote `DexClassLoader`, no active PostHog screen recording or `logcat` exfiltration, and parental control features default to `false`).

However, raw bytecode inspection confirms **five significant privacy and policy concerns**:
1. Mandatory **triple-SDK analytics fan-out** (Firebase + Meta/Facebook + self-hosted PostHog) with **zero in-app opt-out**.
2. An **undisclosed, non-resettable hardware+`ANDROID_ID` hash (`PRD<12-hex>`)** set on PostHog and GraphQL (`X-Device-Id`) even when logged out, and wired in raw DEX (`l74` case 2, no login check → `MainActivity.m5528t:604` → `Lce;->b` → `Lg30;->a`, plus `ry3.setUserId`) to Firebase and **Meta's `AnalyticsUserIDStore.setUserID` (`"app_user_id"`)** — surviving Android GAID resets and contradicting Kahf's Privacy Policy claims that Meta only collects *"standard SDK auto-events"* and *"Only aggregated, anonymized data"* (with PairIP static-boundaries noted on `MainActivity.onCreate` and `KahfGuardApp.onCreate`).
3. **Public IP address (`last_known_ip` / `current_ip`)** forwarded as custom event parameters to **third-party analytics SDKs (Meta & Firebase)** as well as PostHog on DNS diagnostic/fail-open events (whereas Kahf's Privacy Policy only discloses Kahf itself *seeing* the user's IP). Both IP parameters survive Firebase's and Meta's 25-parameter SDK cap.
4. **Installed App Inventory & VPN App Sync** running for **any logged-in account (adult or child)** with zero `isChildDevice()` gate (`InstalledAppsSyncWorker` / `l74.java`, uploading all launchable user-installed apps plus 161 curated system/preinstalled packages `C0639nl.f28440e`), directly contradicting Kahf's Privacy Policy which *only* mentions App List under *"On Child Device, we get the App List & Screen-time for Parents to see"* (while screen-time is also mentioned in a separate general bullet *"The amount of time spent on the other Apps"*, `AppUsageSyncWorker` / `Lx00` only checks `isChildDevice()` on its Kahf-ROM `"kahf_cadence"` branch and skips it on the standard 6-hour periodic sync).
5. A **62-field daily status snapshot** (`rp9.java`) dispatched every 24 hours across all three analytics providers *(noting that Firebase Analytics and Meta App Events enforce a 25-parameter-per-event SDK cap and truncate/drop excess parameters in practice, whereas self-hosted PostHog receives all 62 fields plus `$set` properties)*.

### Strict Evidence Matrix

| Finding Category | Classification | Key Forensic Proof |
| :--- | :--- | :--- |
| **Simultaneous Triple-SDK Analytics Fan-Out (Firebase + Meta + Self-Hosted PostHog)** | **Verified Code Fact** | [`AndroidAnalyticsProviderFactory.java:16-18`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L16-L18) instantiates `new qu1(new r54(), new ry3(), new n99())` ([`qu1.java:31-82`](../02_curated_decompiled_sources/p000/qu1.java#L31-L82)), fanning out `AnalyticsEvent` (`Lqr5;->x`), screen views, and a 62-field daily snapshot ([`rp9.java:789`](../02_curated_decompiled_sources/p000/rp9.java#L789)) to Google Firebase, Meta Graph API, and self-hosted PostHog (`https://p.kahf.co.uk`). *(SDK cap note: Firebase Analytics and Meta App Events cap custom events at 25 parameters and truncate/drop excess fields on the 62-field snapshot, whereas self-hosted PostHog receives all 62.)* |
| **Meta (Facebook) Ad-Tech SDK + Persistent `PRD` `app_user_id` & Custom Events** | **Verified Code Fact / Policy Mismatch** | [`AndroidManifest.xml:207-211`](../01_manifest_and_resources/AndroidManifest.xml#L207-L211) sets `ApplicationId="1121274686010716"`, `AutoLogAppEventsEnabled="true"`, `AdvertiserIDCollectionEnabled="true"` (`GAID`). Kahf's Privacy Policy states Meta only collects *"standard SDK auto-events"* and *"Only aggregated, anonymized data"*, omitting that Kahf's own code (`qu1` → `ry3` and [`l74.java:318-377`](../02_curated_decompiled_sources/p000/l74.java#L318-L377) case 2 → [`MainActivity.java:585-605`](../02_curated_decompiled_sources/com/kahf/dns/p019ui/MainActivity.java#L585-L605) `m5528t:604`) actively sends: (1) persistent `PRD<12-hex>` ([`sxc.java`](../02_curated_decompiled_sources/p000/sxc.java#L116-L284)) to `Lce;->b` (`AnalyticsUserIDStore.setUserID` → `"app_user_id"` in `Lg30;->a@39-52`, surviving GAID resets; also called by `ry3.setUserId`), and (2) custom app events, screen views, `user_properties_updated` subscription properties, and diagnostic events containing public IPs. |
| **Public IP Forwarding to Third-Party Analytics SDKs (Meta & Firebase)** | **Verified Code Fact / Policy Omission** | While Kahf's Privacy Policy states *"If you have a public IP, then we see your public IP. Otherwise, we see your ISP's public IP"*, it does **not** disclose forwarding public IPs to third-party analytics SDKs. `DiagnosticRun.getData()` ([`nb3.java:191`](../02_curated_decompiled_sources/p000/nb3.java#L191), [`AnalyticsEvent.java:6875-6893`](../02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L6875-L6893) — `last_known_ip` at line `6880` as parameter **#4**, ahead of the 24 `diagnosticData` entries) and `DnsSafetyDisable` ([`C0890ud.java:238, 257`](../02_curated_decompiled_sources/p000/C0890ud.java#L238-L257) → `nm9`, [`AnalyticsEvent.java:7245, 7324-7332`](../02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L7245-L7332) — 8 parameters total) dispatch `last_known_ip` / `current_ip` via `Lqr5;->x` → `qu1.logEvent` to PostHog, Firebase, and Meta (`ry3.logEvent`), well within Firebase's and Meta's 25-parameter SDK cap. |
| **Self-Hosted PostHog (`p.kahf.co.uk`) & Logged-In Name/Email** | **Verified Code Fact (v2.0 Nuance)** | [`f20.java:10-19`](../02_curated_decompiled_sources/p000/f20.java#L10-L19) sends analytics to `https://p.kahf.co.uk` (`large1.kahf.co.uk` → `157.180.4.107`), Kahf's own **self-hosted** PostHog server (disclosed in Privacy Policy; not PostHog Cloud). While Firebase (`r54`) and Meta (`ry3`) strip `email`/`name`, [`n99.java:54-69`](../02_curated_decompiled_sources/p000/n99.java#L54-L69) sends logged-in `email` and `name` to self-hosted PostHog. |
| **PostHog Session Replay, Touch Coordinates & `logcat` Exfiltration** | **Disproven / Retracted (v2.0)** | Raw DEX verification (`Ly3c;->p@360,402` → `Lk99;->z@37` → `Lk99;->O` + `Lcd9;->r` + `Lbp;->run@58-62`) proves `sessionReplay` is **compiled-off (`false`)** in `v4.6.287` (`startSessionReplay` is unreachable dead code; remote config cannot enable it without an app update). `PostHogTouchActivityIntegration` (`vd9`) only calls `touchSession()` (idle timer reset), and `PostHogLogCatIntegration` (`gb9`/`tu2`) checks `isSessionReplayActive()` on every line and drops all output. |
| **Installed Apps, VPN Apps & Usage Sync Not Limited to Child Devices** | **Verified Code Fact / Policy Mismatch** | Privacy Policy has two separate bullets: general *"The amount of time spent on the other Apps"* and child-specific *"On Child Device, we get the App List & Screen-time for Parents to see"*. **Direct mismatch on App List:** `InstalledAppsSyncWorker` ([`l74.java:222-316`](../02_curated_decompiled_sources/p000/l74.java#L222-L316)) has **zero `isChildDevice()` check** — because standard adult (`FAMILY`/`ORG`) sign-ins register `device_mongodb_id` (`Lcf0;->k@881` → `Lfj7;->m` → `v` → `z`), any logged-in account (adult or child) uploads **all launchable user-installed apps plus 161 curated system/preinstalled packages** ([`C0639nl.java:47-52`](../02_curated_decompiled_sources/p000/C0639nl.java#L47-L52), `f28440e`, via `QUERY_ALL_PACKAGES`) + installed VPN apps ([`C0602ml.java:155-184`](../02_curated_decompiled_sources/p000/C0602ml.java#L155-L184), excluding 10 MDM/enterprise/Kahf Browser packages in `C0639nl.f28439d`; `b53`) to `id.kahf.co/graphql`. **Usage sync nuance:** `AppUsageSyncWorker` (`Lx00;->invokeSuspend@1445-1568`) checks `isChildDevice()` (`Ls4c;->g()`) + `ro.kahf.rom == "1"` (`Lag7;->A`) **only** when `inputData["kahf_cadence"] == true`—skipping that gate completely (`@1466: if-eqz v7 -> 1568`) on the standard 6-hour periodic schedule registered by `KahfGuardApp.m3565i()` (`Lsy0;->x0`), uploading hourly adult usage too if `Usage Access` is granted. |
| **Zero In-App Telemetry Opt-Out** | **Privacy Flaw** | No in-app toggle exists to disable Firebase, Meta, or PostHog telemetry. Kahf's Privacy Policy ("Opt-Out Rights") explicitly states that stopping collection requires uninstalling the app. |
| **Remote Dynamic Code Loading (`DexClassLoader`) or Custom Root CA MitM** | **Disproven Hypothesis** | Inspected all classloader and TLS calls ([`deep_code_scan.json`](../04_evidence_dumps/deep_code_scan.json)). The app does **not** dynamically load remote DEX payloads or install a custom root CA certificate. Google Play's `libpairipcore.so` is standard Play integrity protection. |

---

## 2. Cryptographic Chain of Custody & Binary Fingerprinting

All four split APK artifacts from the local installation bundle were hashed and verified in [`artifact_hashes.json`](../00_raw_apks/artifact_hashes.json):

| File Name | Size (Bytes) | SHA-256 Digest | Role |
| :--- | :--- | :--- | :--- |
| [`base.apk`](../00_raw_apks/base.apk) | `31,006,367` | `B338D08B7661F3A22E47C95E951E611213F43DD42389041DB0C0291F029CF402` | Core DEX (`classes.dex` `6,000,020` bytes / `6.00 MB`, `classes2.dex` `11,328,924` bytes / `11.33 MB`), Manifest, KMP Compose resources, PairIP blobs |
| [`split_config.arm64_v8a.apk`](../00_raw_apks/split_config.arm64_v8a.apk) | `1,806,815` | `C185CC3B04EAC9FAFE320A2737282CEF57ADFDDE83A9C47E9D926F41F770BD97` | Native ARM64 libraries (`libpairipcore.so`, `libsqliteJni.so`, `libdatastore_shared_counter.so`, `libandroidx.graphics.path.so`) |
| [`split_config.en.apk`](../00_raw_apks/split_config.en.apk) | `45,266` | `19624EFACCD975CDEF21B51E71DA6B8AA8AEB2412B4730CD500D2A9DE0759FF2` | English locale resource split |
| [`split_config.xxhdpi.apk`](../00_raw_apks/split_config.xxhdpi.apk) | `65,514` | `A690650765B1871EE228E365B98EB8719EEBE6DBAF6B740886BAB6CA24EA8522` | XXHDPI density drawable split |

---

## 3. The Triple-SDK Telemetry Architecture

In [`AndroidAnalyticsProviderFactory.java:16-18`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L16-L18), Kahf Guard wires a composite analytics dispatcher:

```java
// com/kahf/dns/di/core/AndroidAnalyticsProviderFactory.java:12-19
public final class AndroidAnalyticsProviderFactory implements InterfaceC0015ae {
    @Override
    public AnalyticsProvider createAnalyticsProvider() {
        return new qu1(new r54(), new ry3(), new n99());
    }
}
```

[`qu1.java:31-82`](../02_curated_decompiled_sources/p000/qu1.java#L31-L82) fans out every `logEvent(str, map)`, `logScreenView(str)`, `setUserId(str)`, and `setUserProperties(map)` call to all three providers:
1. **`r54`** — Google Firebase Analytics (`com.google.firebase.analytics.FirebaseAnalytics`)
2. **`ry3`** — Meta / Facebook `AppEventsLogger` (`graph.facebook.com`)
3. **`n99`** — Kahf's self-hosted PostHog instance (`https://p.kahf.co.uk`)

### 3.1 Meta / Facebook Business SDK (`com.facebook.*`, `ry3.java`, `MainActivity.java:604`)
- **Manifest Auto-Start ([`AndroidManifest.xml:207-211, 273`](../01_manifest_and_resources/AndroidManifest.xml#L207-L211) & [`res/values/strings.xml:98-99`](../01_manifest_and_resources/res/values/strings.xml#L98-L99)):**
  - `com.facebook.sdk.ApplicationId`: `"1121274686010716"`
  - `com.facebook.sdk.AutoLogAppEventsEnabled`: `"true"`
  - `com.facebook.sdk.AdvertiserIDCollectionEnabled`: `"true"` (collects Google Advertising ID / GAID)
  - `com.facebook.internal.FacebookInitProvider` auto-initializes on process start; [`KahfGuardApp.java:225-256`](../02_curated_decompiled_sources/com/kahf/dns/KahfGuardApp.java#L225-L256) (`m3560d`) re-enforces auto-log and advertiser ID collection at runtime.
- **Persistent `PRD<12-hex>` Sent as Meta `app_user_id` & Custom Events Beyond "Standard Auto-Events":**
  Kahf's Privacy Policy states that Meta only collects *"standard SDK auto-events"* (GAID, app install/launch, device metadata) and *"Only aggregated, anonymized data"* (noting that `email`/`name`/`phone` are not passed to `UserDataStore`). However, raw DEX inspection reveals that [`l74.java:318-377`](../02_curated_decompiled_sources/p000/l74.java#L318-L377) (case 2, zero login check) → [`MainActivity.java:585-605`](../02_curated_decompiled_sources/com/kahf/dns/p019ui/MainActivity.java#L585-L605) (`m5528t`, line 604) invokes `AbstractC0093ce.m3061b(str)` (`Lce;->b`, Facebook's `AnalyticsUserIDStore.setUserID`) with Kahf's deterministic hardware hash (`PRD<12-hex>`) whenever Google Play Services is available (and `ry3.setUserId` also invokes `Lce;->b`):
  ```java
  // com/kahf/dns/ui/MainActivity.java:592-604 (str = PRD<12-hex> from sxc.m18373c)
  ((bg2) qe2Var.f34454o.f14591u).m2028d(new p20(qe2Var, str, (byte) 8)); // Crashlytics setUserId
  d5eVar.m5932c(new w3e(d5eVar, str));                                    // Firebase Analytics setUserId
  ...
  AbstractC0093ce.m3061b(str); // AnalyticsUserIDStore.setUserID(PRD...) -> "app_user_id" in Lg30;->a
  ```
  In `classes.dex`, `Lg30;->a@39-52` reads `Lce;->b` (`com.facebook.appevents.AnalyticsUserIDStore.userID`) and attaches **`"app_user_id": "PRD<12-hex>"`** directly to Meta Graph API event JSON payloads. Resetting GAID in Android Settings does **not** reset `PRD<12-hex>`.
  - *Methodological Boundary Note (PairIP, v2.1.2):* Both `MainActivity.onCreate` (`ZaEQclIjTObv.AWzUBKbDvXtlEUD.invoke(null, this, bundle)`) and `KahfGuardApp.onCreate` ([`KahfGuardApp.java:561-562`](../02_curated_decompiled_sources/com/kahf/dns/KahfGuardApp.java#L561-L562), `iawVUOiEYmRW.JzykGGYozZ.invoke(null, this)`) are virtualized by Google Play PairIP, so static DEX inspection cannot directly read call sites inside PairIP's VM blobs. However, both downstream chains are intact and retained by R8 in raw DEX: (a) `l74` case 2 (`MainActivity`, zero login check) → `C0391gv` → `MainActivity.m5528t` (`line 604`) → `Lce;->b` (`Ll0;->run@1166-1207`) → `Lg30;->a@39-52` (`"app_user_id"`, with `ry3.setUserId` also calling `Lce;->b`), and (b) `KahfGuardApp.m3557a()` → `m3561e()` → `Ltf6` (invoking `m3563g`, `m3560d`, `m3565i`, and also referenced outside PairIP at `Lgl;->invoke@307`). Confirming exact logged-out first-launch wire traffic requires runtime/MITM observation.
- **Event & Property Fan-Out ([`ry3.java:34-110`](../02_curated_decompiled_sources/p000/ry3.java#L34-L110)):**
  - `ry3.setUserProperties` filters out `email`/`name` and logs `subscription_id`, `subscription_name`, `subscription_type`, `trial_days_remaining`, `subscription_expires_at` via `user_properties_updated` (`ry3.java:77-95`).
  - `ry3.logEvent` receives all `AnalyticsEvent` dispatches (`Lqr5;->x`), including the 62-field daily status snapshot *(subject to Meta App Events' 25-parameter-per-event SDK cap)* and diagnostic events containing `last_known_ip` / `current_ip`.

### 3.2 Google Firebase Analytics & Crashlytics (`com.google.firebase.*`, `r54.java`)
- **Manifest Auto-Start ([`AndroidManifest.xml:206, 298`](../01_manifest_and_resources/AndroidManifest.xml#L206)):** `firebase_analytics_collection_enabled="true"`, `project_id="kahf-guard-30b01"`, `FirebaseInitProvider` (`directBootAware="true"`).
- Receives `PRD<12-hex>` as `userId` (`MainActivity.java:592, 597`), all app events, screen views, and diagnostic IP params (`app-measurement.com`).

### 3.3 Self-Hosted PostHog (`https://p.kahf.co.uk`, `f20.java`, `n99.java`, `ab9.java`) — *v2.0 Correction*
- **Self-Hosted Server ([`f20.java:10-19`](../02_curated_decompiled_sources/p000/f20.java#L10-L19)):**
  `f20.f11015c` points to `https://p.kahf.co.uk` (`CNAME large1.kahf.co.uk` → `157.180.4.107`, Hetzner). This is Kahf's own **self-hosted PostHog** server (disclosed in Kahf's Privacy Policy), not PostHog Cloud.
- **Session Replay, Touch & `logcat` Verified Inactive in `v4.6.287`:**
  - [`KahfGuardApp.java:354-377`](../02_curated_decompiled_sources/com/kahf/dns/KahfGuardApp.java#L354-L377) (`m3563g`) constructs `p99` (`PostHogAndroidConfig`) leaving `sessionReplay = false`.
  - Raw DEX bytecode confirms R8 folded `config.sessionReplay` to `false`: `Ly3c;->p@360,402` passes constant `0` (`false`) into `Lk99;->z`, skipping `Lk99;->O` (`startSessionReplay`), so `Lcd9;->r` (`isSessionReplayEnabled`) permanently returns `false` and `Lbp;->run@58-62` exits before checking remote config `Lqc9;->E`. **Session Replay cannot be activated remotely in `v4.6.287` without an app update.**
  - `PostHogTouchActivityIntegration` (`vd9`, branch 0 of R8-merged `Lxc9;->a`) only invokes `Lpd9;->c` (`touchSession()`) to reset the idle timer; it does not record tap coordinates. *(Branch 1 of `Lxc9;->a`, belonging to `Lcd9` / `PostHogReplayIntegration`, calls `MotionEvent.obtain` only when `Lcd9;->E` is `true` — unreachable dead code because `sessionReplay` is compiled-off `false`.)*
  - `PostHogLogCatIntegration` (`gb9` / `tu2`) checks `isSessionReplayActive()` (`Lcb9;->c`) on every line and drops all entries while replay is off (and Android 12+ restricts `logcat` to the app's own PID).
- **Identity & PII on Self-Hosted PostHog ([`ab9.java:95-131`](../02_curated_decompiled_sources/p000/ab9.java#L95-L131), [`n99.java:54-69`](../02_curated_decompiled_sources/p000/n99.java#L54-L69)):**
  - On startup (even logged out), `KahfGuardApp.m3558b` → `ab9.m348e` identifies PostHog with `distinctId = PRD<12-hex>`.
  - When signed in, [`n99.java:57-68`](../02_curated_decompiled_sources/p000/n99.java#L57-L68) extracts `"email"` / `KEY_USER_EMAIL` and `"name"` / `KEY_USER_NAME` and attaches them to the PostHog profile on `p.kahf.co.uk`.

---

## 4. Persistent Hardware Fingerprinting & Public IP / Geo-IP Collection

### 4.1 Deterministic Hardware + `ANDROID_ID` Hash (`sxc.java`)
[`sxc.java:116-284`](../02_curated_decompiled_sources/p000/sxc.java#L116-L284) (`UniqueUserIdManager.m18373c`) generates a persistent device fingerprint:
1. Reads `Settings.Secure.getString(contentResolver, "android_id")` (`sxc.java:165-171`) → `"aid:<android_id>"`.
2. Joins 7 hardware constants (`Build.BOARD`, `BRAND`, `DEVICE`, `HARDWARE`, `MANUFACTURER`, `MODEL`, `PRODUCT`) → `"bld:<build_info>"` (`sxc.java:173-175, 226`).
3. Computes `SHA-256("aid:<android_id>|bld:<build_info>")`, takes the first 12 uppercase hex characters (48 bits), and prepends `"PRD"` (`sxc.java:234-266`).
4. Persists the ID in `SharedPreferences("user_prefs")` (`"unique_user_id"`) **and** `files/device_data/device_id.dat` (`sxc.java:130-161, 195-218, 268-282`), excluding both from `<cloud-backup>` in [`data_extraction_rules.xml`](../01_manifest_and_resources/res/xml/data_extraction_rules.xml#L3-L10) *(note: `<device-transfer>` at lines 8–10 excludes only `AppPreferences.xml`, so Android device-to-device transfer can still migrate `user_prefs.xml` and `device_data/`)*.
5. Grades `AD_ID` and `READ_PHONE_STATE` availability as `"optimal"`, `"partial"`, or `"basic"` (`sxc.m18372a`, `ab9.java:101-135`, `l74.java:352-389`).

### 4.2 Public IP Walking, Geo-IP Lookups & SIM/MCC Probing (`m48.java`, `jd2.java`, `C0957w6.java`)
- **7-Service Public IP Walker ([`C0957w6.java:356-411`](../02_curated_decompiled_sources/p000/C0957w6.java#L356-L411) & [`nb3.java:511-552`](../02_curated_decompiled_sources/p000/nb3.java#L511-L552)):** Queries `api.ipify.org`, `api.myip.com`, `checkip.amazonaws.com`, `api.ip.sb/ip`, `icanhazip.com`, `ipecho.net/plain`, and `ipinfo.io/ip`, stores the public IP in `PrefKeys.LAST_KNOWN_IP`, and sends it in `AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun` ([`nb3.java:191`](../02_curated_decompiled_sources/p000/nb3.java#L191), [`AnalyticsEvent.java:6875-6893`](../02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L6875-L6893), `LAST_KNOWN_IP` at line `6880` as parameter **#4**) and `DnsSafetyDisable` ([`C0890ud.java:238, 257`](../02_curated_decompiled_sources/p000/C0890ud.java#L238-L257) → `nm9`, [`AnalyticsEvent.java:7245, 7324-7332`](../02_curated_decompiled_sources/com/kahf/dns/core/analytics/AnalyticsEvent.java#L7245-L7332), 8 parameters total) — fanning out to PostHog, Firebase, and Meta. Unlike the truncated tail of the 62-field daily snapshot, both `last_known_ip` (#4) and `current_ip` (8-param event) survive Firebase's and Meta's 25-parameter SDK cap *(and while Kahf's Privacy Policy discloses seeing the user's IP itself, it does not disclose forwarding `last_known_ip`/`current_ip` to third-party analytics SDKs like Meta and Firebase)*.
- **4-Service Geo-IP Country Detector ([`jd2.java:171-235`](../02_curated_decompiled_sources/p000/jd2.java#L171-L235)):** Queries `ipwho.is`, `free.freeipapi.com`, `api.db-ip.com`, and `ipinfo.io` to detect country (disclosed in Privacy Policy).
- **SIM/MCC/Timezone Check ([`m48.java:67-75, 112-146`](../02_curated_decompiled_sources/p000/m48.java#L67-L75)):** Checks `TimeZone` (`"Asia/Dhaka"`, line `69`), `SimCountryIso` (`"BD"`, lines `112-126`), and `NetworkOperator` (MCC `"470"`, lines `129-146`).

---

## 5. First-Party Backend (`https://id.kahf.co/graphql`) & Background Sync Workers

[`NetworkModuleGraphQlKt.java:47-92`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/NetworkModuleGraphQlKt.java#L47-L92) configures Apollo GraphQL against `https://id.kahf.co/graphql` (line `72`). [`AuthInterceptor.java:52-60, 110`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AuthInterceptor.java#L52-L60) attaches `X-Device-Id: <PRD_id>`, `app-name: kahf-guard`, and `Authorization: Bearer <token>` (when signed in) to every GraphQL request.

### Summary of Data Uploaded to `https://id.kahf.co/graphql` & Analytics

| Worker / Class | Operation | Data Uploaded & Actual Trigger Condition | Source File & Lines |
| :--- | :--- | :--- | :--- |
| `InstalledAppsSyncWorker` (`l74` case 1) | `UpdateDeviceInstalledApps` (`a0d.java`) | All launchable user-installed (non-system) apps plus any installed package in a hardcoded **161-package curated list** (`C0639nl.f28440e`: preinstalled browsers, social/messaging, games, dating, app stores, OEM/Google apps; excluding Kahf Guard itself) — uploading `packageName`, `appName`, `isSystemApp` via `QUERY_ALL_PACKAGES` ([`C0639nl.java:47-52`](../02_curated_decompiled_sources/p000/C0639nl.java#L47-L52)). **Runs for any logged-in account (adult or child); zero `isChildDevice()` check and no runtime permission needed.** | [`l74.java:222-316`](../02_curated_decompiled_sources/p000/l74.java#L222-L316), [`a0d.java:47`](../02_curated_decompiled_sources/p000/a0d.java#L47) |
| `InstalledAppsSyncWorker` (`m3841e` → `b53.m1658e`) | `UpdateDeviceMetadataMutation` (`h0d.java`) | Installed `android.net.VpnService` apps ([`C0602ml.java:155-184`](../02_curated_decompiled_sources/p000/C0602ml.java#L155-L184), excluding Kahf Guard and 10 MDM/enterprise/Kahf Browser packages in `C0639nl.f28439d`) under `"vpn_service_apps"`. **Runs for any logged-in account.** | [`InstalledAppsSyncWorker.java:141-250`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L141-L250), [`b53.java:267-365`](../02_curated_decompiled_sources/p000/b53.java#L267-L365) |
| `AppUsageSyncWorker` (`Lx00` case 2) | `UpdateDeviceAppUsage` (`mzc.java`) | Hourly per-package foreground screen time via `UsageStatsManager`. **Only checks `isChildDevice()` (`Ls4c;->g()`) + `ro.kahf.rom == "1"` on the Kahf-ROM `"kahf_cadence"` branch (`Lx00;->invokeSuspend@1445-1553`)** — bypasses that gate completely (`@1466: if-eqz v7 -> 1568`) on the standard 6-hour periodic schedule unconditionally registered by `KahfGuardApp.m3565i()` (`Lsy0;->x0`), running for any logged-in account (adult or child) that grants `Usage Access` (`PACKAGE_USAGE_STATS`). | [`AppUsageSyncWorker.java`](../02_curated_decompiled_sources/com/kahf/dns/features/app_usage/AppUsageSyncWorker.java), [`mzc.java:44-50`](../02_curated_decompiled_sources/p000/mzc.java#L44-L50) |
| `AppUsageSyncWorker` → `fdb` | `UpdateDeviceSiteVisits` (`y0d.java`) | **Opt-in (`pref_browsing_report_enabled`, default `false`):** Up to **34 days** of visited **domain names only** (`host`, `hour`, `visits`, `blocked`, `activeSeconds`; no full URLs or searches), retained locally for 35 days (`site_visit`). | [`fdb.java:63-295`](../02_curated_decompiled_sources/p000/fdb.java#L63-L295), [`y0d.java:45-67`](../02_curated_decompiled_sources/p000/y0d.java#L45-L67) |
| `PermissionStatusSyncWorker` (`z27`) | `UpdateDevicePermissionStatusMutation` (`q0d.java`) | State of Notification, Accessibility, Usage Stats, Battery Optimization, and Device Admin permissions (logged-in accounts). | [`PermissionStatusSyncWorker.java:51-90`](../02_curated_decompiled_sources/com/kahf/dns/features/permission_flows/PermissionStatusSyncWorker.java#L51-L90), [`z27.java:490-590`](../02_curated_decompiled_sources/p000/z27.java#L490-L590) |
| `yc3` / `cd3` | `UpdateDeviceDnsSettingsMutation` (`tzc.java`) | Active Android system Private DNS hostname (`LinkProperties.getPrivateDnsServerName()`) on network changes. | [`yc3.java:116-188`](../02_curated_decompiled_sources/p000/yc3.java#L116-L188), [`tzc.java:44-46`](../02_curated_decompiled_sources/p000/tzc.java#L44-L46) |
| `DailyAnalyticsWorker` (`tk2` / `rp9`) | `DailyStatusEvent.Snapshot` & PostHog `$set` | **62-field** daily snapshot of all protection toggles, prayer silence schedule, custom site block count, per-app block counters, and permission states dispatched every 24h to **Firebase, Meta, and PostHog** (no opt-out). *(Note: Firebase Analytics and Meta App Events enforce a 25-parameter-per-event cap and truncate/drop excess fields in practice, whereas self-hosted PostHog receives all 62 fields plus `$set`.)* | [`DailyAnalyticsWorker.java:65-139`](../02_curated_decompiled_sources/com/kahf/dns/features/analytics/DailyAnalyticsWorker.java#L65-L139), [`rp9.java:789`](../02_curated_decompiled_sources/p000/rp9.java#L789) |
