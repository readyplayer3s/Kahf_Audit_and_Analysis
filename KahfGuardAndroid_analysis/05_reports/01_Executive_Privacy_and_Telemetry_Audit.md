# 01 — Executive Privacy, Tracker & Telemetry Forensic Audit
**Target Application:** Kahf Guard (`com.kahf.dns`)  
**Version Audited:** `versionName: "4.6.287"` (`versionCode: 361`, Git Commit: `2a1ed43f12fd4fcaaa0f5662eccfc3287f73d5b1`)  
**Target SDK / Min SDK:** `targetSdkVersion: 37` / `minSdkVersion: 32` (Android 12L+)  
**Audit Posture:** Defensive Client-Side Static Forensic Verification (CLI-Only Toolchain: `apktool 2.11.1`, `jadx 1.5.1`, custom DEX/AXML/CVR parsers)

---

## 1. Executive Summary & Evidence Classification

Kahf Guard markets itself as a privacy-focused, faith-aligned ("halal internet") family protection and tracker/malware blocker. However, static forensic decompilation of the production split APK bundle (`v4.6.287`) reveals a pervasive **three-headed third-party telemetry architecture** coupled with **first-party background surveillance workers** that harvest device hardware fingerprints, full installed application inventories, hourly app usage timelines, and scraped browser URL histories.

### Strict Evidence Matrix

| Finding Category | Classification | Key Forensic Proof |
| :--- | :--- | :--- |
| **Simultaneous Triple-SDK Analytics Fan-Out (Firebase + Meta/Facebook + PostHog)** | **Verified Code Fact** | [`AndroidAnalyticsProviderFactory.java`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L10-L13) instantiates `qu1(new r54(), new ry3(), new n99())`, fanning out every event, screen view, and user ID to Google Firebase, Meta Graph API, and PostHog simultaneously. |
| **Meta (Facebook) Ad-Tech SDK Auto-Initialization & Advertiser ID Harvesting** | **Verified Code Fact** | [`AndroidManifest.xml`](../01_manifest_and_resources/AndroidManifest.xml#L207-L211) sets `com.facebook.sdk.ApplicationId="1121274686010716"`, `AutoLogAppEventsEnabled="true"`, `AdvertiserIDCollectionEnabled="true"`, and auto-starts `FacebookInitProvider` ([`AndroidManifest.xml:273`](../01_manifest_and_resources/AndroidManifest.xml#L273)) before `Application.onCreate()`. |
| **First-Party Reverse-Proxied PostHog Session Replay, Touch Tracking & Logcat Scraping** | **Verified Code Fact** | [`f20.java`](../02_curated_decompiled_sources/p000/f20.java#L10-L19) routes PostHog traffic (`phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N`) through `https://p.kahf.co.uk` to evade DNS ad-blockers. [`AbstractC0378gi.java`](../02_curated_decompiled_sources/p000/AbstractC0378gi.java#L786-L799) registers `PostHogReplayIntegration`, `PostHogTouchActivityIntegration`, and `PostHogLogCatIntegration` (`Runtime.getRuntime().exec("logcat ...")` in [`gb9.java:33-35`](../02_curated_decompiled_sources/p000/gb9.java#L33-L35) & [`tu2.java:83-109`](../02_curated_decompiled_sources/p000/tu2.java#L83-L109)). |
| **PII (Email & Name) Transmission to PostHog** | **Verified Code Fact** | While Firebase (`r54.java`) and Facebook (`ry3.java`) filter out `email` and `name`, [`n99.java`](../02_curated_decompiled_sources/p000/n99.java#L54-L68) explicitly extracts `email` and `name` and attaches them to the PostHog user profile (`KEY_USER_EMAIL`, `KEY_USER_NAME`). |
| **Non-Resettable Hardware + `ANDROID_ID` Fingerprinting (`PRD...`)** | **Verified Code Fact** | [`sxc.java`](../02_curated_decompiled_sources/p000/sxc.java#L116-L284) (`sxc.m18373c`) hashes `Settings.Secure.ANDROID_ID` + 7 `android.os.Build` hardware constants (`"aid:<android_id>|bld:<build_info>"`) into a 48-bit `PRD<12-hex>` identifier stored in `files/device_data/device_id.dat` and sent on every GraphQL request as `X-Device-Id` ([`AuthInterceptor.java`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AuthInterceptor.java#L52-L60)). |
| **Background Upload of Full Installed App Inventory, VPN Apps, Hourly Usage & Browser History** | **Verified Code Fact** | WorkManager jobs ([`InstalledAppsSyncWorker.java`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L83-L250), [`AppUsageSyncWorker.java`](../02_curated_decompiled_sources/com/kahf/dns/features/app_usage/AppUsageSyncWorker.java#L242-L607), [`fdb.java`](../02_curated_decompiled_sources/p000/fdb.java#L63-L295)) upload installed packages (`QUERY_ALL_PACKAGES`), installed VPN apps (`h0d.java`), hourly app usage (`mzc.java`), and scraped browser domains (`UpdateDeviceSiteVisits` in [`y0d.java`](../02_curated_decompiled_sources/p000/y0d.java#L45-L67)) to `https://id.kahf.co/graphql`. |
| **Unconsented Pre-Initialization Telemetry & In-App Privacy Disclosure Mismatch** | **Architectural / Privacy Flaw** | `FirebaseInitProvider` and `FacebookInitProvider` execute before `Application.onCreate()` with hardcoded `true` collection flags. Even though the in-app Accessibility screen claims `"No personal information collected"` and `"Data stays on your device, except what a parent or organisation turns on for parental control"` ([`compose_strings_decoded.json`](../04_evidence_dumps/compose_strings_decoded.json#L43-L46)), zero user-facing toggles exist to disable Firebase, Meta AppEvents, or PostHog telemetry. |
| **Remote Dynamic Code Loading (`DexClassLoader`) or Custom Root CA MitM** | **Disproven Hypothesis** | Inspected all classloader and TLS calls ([`deep_code_scan.json`](../04_evidence_dumps/deep_code_scan.json)). The app does **not** dynamically load remote DEX payloads or install a custom root CA certificate. Google Play's `libpairipcore.so` VM protection (`com.pairip.application.Application`) is used for Play Store license/integrity verification only. |

---

## 2. Cryptographic Chain of Custody & Binary Fingerprinting

All four split APK artifacts from the local installation bundle were hashed and verified in [`artifact_hashes.json`](../00_raw_apks/artifact_hashes.json):

| File Name | Size (Bytes) | SHA-256 Digest | Role |
| :--- | :--- | :--- | :--- |
| [`base.apk`](../00_raw_apks/base.apk) | `31,006,367` | `B338D08B7661F3A22E47C95E951E611213F43DD42389041DB0C0291F029CF402` | Core DEX (`classes.dex` 6.01 MB, `classes2.dex` 11.33 MB), Manifest, KMP Compose resources, 22 PairIP `.IAP` blobs |
| [`split_config.arm64_v8a.apk`](../00_raw_apks/split_config.arm64_v8a.apk) | `1,806,815` | `C185CC3B04EAC9FAFE320A2737282CEF57ADFDDE83A9C47E9D926F41F770BD97` | Native ARM64 libraries (`libpairipcore.so`, `libsqliteJni.so`, `libdatastore_shared_counter.so`, `libandroidx.graphics.path.so`) |
| [`split_config.en.apk`](../00_raw_apks/split_config.en.apk) | `45,266` | `19624EFACCD975CDEF21B51E71DA6B8AA8AEB2412B4730CD500D2A9DE0759FF2` | English locale resource split |
| [`split_config.xxhdpi.apk`](../00_raw_apks/split_config.xxhdpi.apk) | `65,514` | `A690650765B1871EE228E365B98EB8719EEBE6DBAF6B740886BAB6CA24EA8522` | XXHDPI density drawable split |

### Application Stack & Obfuscation Profile
- **Architecture:** Kotlin Multiplatform (KMP) + Jetpack Compose Multiplatform (`1.7.3`), Koin DI, Ktor HTTP Client (`3.0.1`), Apollo GraphQL Runtime, Room SQLite (`2.7.0-alpha11`), WorkManager (`2.10.0`).
- **R8 Repackaging:** Out of `16,375` total DEX classes ([`dex_strings_and_classes_summary.json`](../04_evidence_dumps/dex_strings_and_classes_summary.json)), `454` retain full `com.kahf.dns.*` package paths while `14,663` classes are R8-flattened into the root package `p000.*` with 3-character identifiers.
- **PairIP Wrapper:** [`AndroidManifest.xml`](../01_manifest_and_resources/AndroidManifest.xml#L108) declares `android:name="com.pairip.application.Application"` which delegates runtime execution to `com.kahf.dns.KahfGuardApp`.

---

## 3. The Three-Headed Third-Party Telemetry Architecture

In [`AndroidAnalyticsProviderFactory.java`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java#L10-L13), Kahf Guard wires a composite analytics dispatcher:

```java
// com/kahf/dns/di/core/AndroidAnalyticsProviderFactory.java
public final class AndroidAnalyticsProviderFactory {
    public static final InterfaceC0781rf createAnalyticsProvider() {
        return new qu1(new InterfaceC0781rf[]{new r54(), new ry3(), new n99()});
    }
}
```

Inspecting [`qu1.java`](../02_curated_decompiled_sources/p000/qu1.java#L22-L132) confirms that every single call to `logEvent(str, map)`, `logScreenView(str)`, `setUserId(str)`, and `setUserProperties(map)` iterates over all three providers in lockstep:

1. **`r54` (`FirebaseAnalyticsProvider`)** — Google Firebase Analytics (`com.google.firebase.analytics.FirebaseAnalytics`)
2. **`ry3` (`FacebookAnalyticsProvider`)** — Meta / Facebook AppEventsLogger (`com.facebook.appevents.AppEventsLogger`)
3. **`n99` (`PostHogAnalyticsProvider`)** — PostHog Product Analytics, Surveys & Session Replay (`com.posthog.PostHog`)

### 3.1 Tracker #1: Meta / Facebook Business SDK (`com.facebook.*`)
Bundling Meta's corporate ad-tracking SDK inside an application marketed for spiritual purity and privacy is a severe architectural contradiction:
- **Manifest Auto-Start & Credentials ([`AndroidManifest.xml:207-211, 273`](../01_manifest_and_resources/AndroidManifest.xml#L207-L211) & [`res/values/strings.xml:98-99`](../01_manifest_and_resources/res/values/strings.xml#L98-L99)):**
  - `com.facebook.sdk.ApplicationId`: `"1121274686010716"`
  - `com.facebook.sdk.ClientToken`: `"c81a5ae4bb4414f91d94bbb176cce0a3"`
  - `com.facebook.sdk.AutoLogAppEventsEnabled`: `"true"`
  - `com.facebook.sdk.AdvertiserIDCollectionEnabled`: `"true"`
  - `com.facebook.internal.FacebookInitProvider`: `android:exported="false"` (executes automatically on process start before `KahfGuardApp.onCreate()`).
- **Explicit Runtime Re-Enforcement ([`KahfGuardApp.java:53-77`](../02_curated_decompiled_sources/com/kahf/dns/KahfGuardApp.java#L53-L77)):**
  In `KahfGuardApp.m3560d()`, the app explicitly calls:
  ```java
  dz3.f8992o = true;
  afc.f894a.getClass();
  afc.m570b(); // Enables AutoLogAppEvents
  afc.m569a(); // Enables AdvertiserIDCollection (GAID)
  dz3.m6809l(applicationContext);
  ```
- **Event & Screen Fan-Out ([`ry3.java:18-99`](../02_curated_decompiled_sources/p000/ry3.java#L18-L99)):**
  - Every `logEvent(str, map)` converts the event map into a `Bundle` and invokes `AppEventsLogger.logEvent(str, bundle)` (`ry3.java:24-40`), transmitting the user's in-app actions to `https://graph.facebook.com`.
  - Every `logScreenView(str)` sends `fb_mobile_content_view` with `fb_content_type="screen"` and `fb_content_id=str` (`ry3.java:44-53`).
  - `setUserId(str)` assigns the device's persistent `unique_user_id` (`dz3.f8981d = str`, `ry3.java:57-68`).

### 3.2 Tracker #2: Google Firebase Analytics & Crashlytics (`com.google.firebase.*`)
- **Manifest Auto-Start ([`AndroidManifest.xml:206, 298`](../01_manifest_and_resources/AndroidManifest.xml#L206) & [`res/values/strings.xml:100-103, 158`](../01_manifest_and_resources/res/values/strings.xml#L100-L103)):**
  - `firebase_analytics_collection_enabled`: `"true"`
  - `google_app_id`: `"1:842555948920:android:efffa7e3fa524cc39d128d"`
  - `project_id`: `"kahf-guard-30b01"`
  - `google_storage_bucket`: `"kahf-guard-30b01.appspot.com"`
  - `com.google.firebase.provider.FirebaseInitProvider` runs at `android:initOrder="100"` with `android:directBootAware="true"`.
- **Event & User Property Logging ([`r54.java:19-105`](../02_curated_decompiled_sources/p000/r54.java#L19-L105)):**
  - Logs all events, screen views (`screen_view`), `setUserId`, and user properties (`setUserProperty`) to `app-measurement.com`.

### 3.3 Tracker #3: Reverse-Proxied PostHog Analytics, Session Replay & Logcat Capture (`com.posthog.*`)
Most concerning from a forensic standpoint is the integration of **PostHog (`com.posthog.android` v3.x)**, which is configured to bypass standard DNS tracker blocklists via a first-party UK domain proxy:
- **Hardcoded Credentials & Reverse Proxy ([`f20.java:10-19`](../02_curated_decompiled_sources/p000/f20.java#L10-L19)):**
  ```java
  public abstract class f20 {
      public static final String f11014b = "phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N";
      public static final String f11015c = "https://p.kahf.co.uk";
  }
  ```
- **Session Replay, Touch Tracking & Logcat Scraping ([`ab9.java:25-39`](../02_curated_decompiled_sources/p000/ab9.java#L25-L39), [`AbstractC0378gi.java:786-799`](../02_curated_decompiled_sources/p000/AbstractC0378gi.java#L786-L799), [`gb9.java:33-110`](../02_curated_decompiled_sources/p000/gb9.java#L33-L110), [`tu2.java:78-118`](../02_curated_decompiled_sources/p000/tu2.java#L78-L118)):**
  - `ab9.java` initializes `qc9` (`PostHogAndroidConfig`) with `f20.f11014b` and host `https://p.kahf.co.uk`, setting `captureApplicationLifecycleEvents = true`, `captureDeepLinks = true`, `captureScreenViews = true`, and `enableSwallowing = true`.
  - `AbstractC0378gi.m8657B()` registers:
    - `cd9` (`PostHogReplayIntegration`): Captures wireframe/screen hierarchy snapshots (`rrweb` events) when session recording is active.
    - `vd9` (`PostHogTouchActivityIntegration`): Hooks window touch callbacks to record user tap coordinates.
    - `gb9` (`PostHogLogCatIntegration`): Spawns a background thread (`tu2.java:83`) executing `Runtime.getRuntime().exec(["logcat", "-v", "epoch", "-T", "<timestamp>", "*:E"])` and streams parsed logcat entries to PostHog as `rrweb/console@1` events!
- **Direct PII Leak (Email & Full Name) to PostHog ([`n99.java:54-88`](../02_curated_decompiled_sources/p000/n99.java#L54-L88)):**
  Look at the contrast between `r54.java` / `ry3.java` and `n99.java`:
  - In `r54.java:65` (Firebase) and `ry3.java:74` (Facebook), the developers explicitly wrote:
    ```java
    if (!zy5.m23838d(str, "email") && !zy5.m23838d(str, "name")) { ... }
    ```
  - In [`n99.java:54-68`](../02_curated_decompiled_sources/p000/n99.java#L54-L68) (PostHog), the developers did the **exact opposite**—specifically extracting `"email"` and `"name"` and storing them in SharedPreferences (`KEY_USER_EMAIL`, `KEY_USER_NAME`) to pass into `PostHog.identify(userId, userProperties)` (`n99.m14011a`):
    ```java
    Object obj = map.get("email");
    String str = obj instanceof String ? (String) obj : null;
    Object obj2 = map.get("name");
    String str2 = obj2 instanceof String ? (String) obj2 : null;
    if (str != null && str.length() != 0) {
        m14012b().saveToPreferences(PrefKeys.KEY_USER_EMAIL, str);
    }
    if (str2 != null && str2.length() != 0) {
        m14012b().saveToPreferences(PrefKeys.KEY_USER_NAME, str2);
    }
    m14011a(stringFromPreferences, map);
    ```

---

## 4. Persistent Device Fingerprinting & Geolocation Harvesting

### 4.1 Hardware + `ANDROID_ID` Composite Fingerprint (`sxc.java`)
Instead of using an ephemeral, user-resettable UUID, [`sxc.java`](../02_curated_decompiled_sources/p000/sxc.java#L116-L284) (`UniqueUserIdManager.m18373c`) constructs a deterministic hardware fingerprint:
1. Reads `Settings.Secure.getString(context.getContentResolver(), "android_id")` (`sxc.java:165-171`), prefixing it as `"aid:".concat(str2)` (`sxc.java:222`).
2. Joins 7 hardware build properties with `"|"` (`sxc.java:173-175`) and prefixes `"bld:".concat(str3)` (`sxc.java:230`):
   ```java
   "bld:" + Build.BOARD + "|" + Build.BRAND + "|" + Build.DEVICE + "|" + Build.HARDWARE + "|" + Build.MANUFACTURER + "|" + Build.MODEL + "|" + Build.PRODUCT
   ```
3. Joins the non-empty parts with `"|"` into `"aid:<android_id>|bld:<build_string>"` (`sxc.java:233`), computes `SHA-256`, takes the first 12 uppercase hex characters (`substring(0, 12)` = 48 bits), and prepends `"PRD"` (or `"DBG"` in debug mode, e.g., `PRD4A8F9C12B0E3`, `sxc.java:234-266`).
4. **Dual Persistence & Backup Exclusion:** Saves the ID both in `SharedPreferences("user_prefs")` under `"unique_user_id"` AND in a hidden file `context.getFilesDir() + "/device_data/device_id.dat"` (`sxc.java:53-114, 289-377`). In [`res/xml/data_extraction_rules.xml`](../04_evidence_dumps/res_xml_audit.json) and `backup_rules.xml`, `device_data/` and `user_prefs.xml` are explicitly excluded from cloud backups so the device ID remains pinned to the physical hardware.
5. **Permission-Quality Grading (`sxc.java:15-50`):** `sxc.m18372a(context)` checks whether `com.google.android.gms.permission.AD_ID` and `android.permission.READ_PHONE_STATE` are granted, grading the fingerprint as `"optimal"`, `"partial"`, or `"basic"` (`l74.java:352-390`) and reporting `device_id_quality` to all analytics providers.

### 4.2 Public IP Walking, Geo-IP Lookups & SIM/MCC Probing (`m48.java`, `jd2.java`, `C0957w6.java`)
- **7-Service Public IP Walker ([`C0957w6.java:356-411`](../02_curated_decompiled_sources/p000/C0957w6.java#L356-L411) & [`nb3.java:511-552`](../02_curated_decompiled_sources/p000/nb3.java#L511-L552)):**
  Walks through 7 external IP echo services (`https://api.ipify.org`, `https://api.myip.com`, `https://checkip.amazonaws.com`, `https://api.ip.sb/ip`, `https://icanhazip.com`, `https://ipecho.net/plain`, `https://ipinfo.io/ip`), stores the user's public IPv4/IPv6 address in `PrefKeys.LAST_KNOWN_IP` (`"last_known_ip"`), and attaches it to `AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun` (`nb3.java:191-231`).
- **4-Service Geo-IP Country Detector ([`jd2.java:171-235`](../02_curated_decompiled_sources/p000/jd2.java#L171-L235)):**
  Queries `https://ipwho.is/`, `https://free.freeipapi.com/api/json`, `https://api.db-ip.com/v2/free/self`, and `https://ipinfo.io/json` to determine the user's country and persists `pref_ip_country_name`.
- **Telephony SIM & MCC Probing ([`m48.java:112-146`](../02_curated_decompiled_sources/p000/m48.java#L112-L146)):**
  Reads `TelephonyManager.getSimCountryIso()` (`equalsIgnoreCase("BD")`), `TelephonyManager.getNetworkOperator()` (checking Bangladesh MCC `"470"`), and `TimeZone.getDefault().getID()` (`"Asia/Dhaka"`).

---

## 5. First-Party Backend (`https://id.kahf.co/graphql`) & Background Sync Workers

When a user signs into a Kahf ID account (or links a device under Parent/Child mode or web dashboard management), [`NetworkModuleGraphQlKt.java`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/NetworkModuleGraphQlKt.java#L47-L92) configures an Apollo GraphQL client pointing to:
- **HTTP Endpoint:** `https://id.kahf.co/graphql` ([`NetworkModuleGraphQlKt.java:72`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/NetworkModuleGraphQlKt.java#L72), [`AbstractC0378gi.java:431-457`](../02_curated_decompiled_sources/p000/AbstractC0378gi.java#L431-L457))
- **WebSocket Subscription Endpoint:** `wss://id.kahf.co/graphql`
- **Headers ([`AuthInterceptor.java:52-60`](../02_curated_decompiled_sources/com/kahf/dns/p015di/core/AuthInterceptor.java#L52-L60)):** Every request carries `Authorization: Bearer <token>` (when signed in), `X-Device-Id: <PRD_unique_id>`, and `app-name: kahf-guard`.

### Summary of Data Uploaded to `https://id.kahf.co/graphql` & Analytics

| Worker / Class | GraphQL / Telemetry Operation | Data Exfiltrated to Backend | Source File & Lines |
| :--- | :--- | :--- | :--- |
| `InstalledAppsSyncWorker` (`mo1175d` -> `l74`) | `mutation UpdateDeviceInstalledApps` (`a0d.java`) | Full list of installed apps (`packageName`, `appName`, `isSystemApp`) enumerated via `QUERY_ALL_PACKAGES` (`C0639nl.java`). | [`InstalledAppsSyncWorker.java:83-126`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L83-L126), [`l74.java:222-308`](../02_curated_decompiled_sources/p000/l74.java#L222-L308), [`a0d.java:47`](../02_curated_decompiled_sources/p000/a0d.java#L47) |
| `InstalledAppsSyncWorker` (`m3841e` -> `b53.m1658e`) | `mutation UpdateDeviceMetadataMutation` (`h0d.java`) | Enumerates all installed `android.net.VpnService` apps (`C0602ml.java:155-184`) and uploads them under key `"vpn_service_apps"`. | [`InstalledAppsSyncWorker.java:141-250`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L141-L250), [`b53.java:267-365`](../02_curated_decompiled_sources/p000/b53.java#L267-L365), [`h0d.java:44`](../02_curated_decompiled_sources/p000/h0d.java#L44) |
| `AppUsageSyncWorker` | `mutation UpdateDeviceAppUsage` (`mzc.java`) | Hourly per-package foreground screen time (`packageName`, `date`, `hour`, `usageMinutes`) harvested via `UsageStatsManager.queryEvents()` (`PACKAGE_USAGE_STATS`). | [`AppUsageSyncWorker.java:242-607`](../02_curated_decompiled_sources/com/kahf/dns/features/app_usage/AppUsageSyncWorker.java#L242-L607), [`mzc.java:44-50`](../02_curated_decompiled_sources/p000/mzc.java#L44-L50) |
| `AppUsageSyncWorker` -> `fdb` | `mutation UpdateDeviceSiteVisits` (`y0d.java`) | Up to **34 days** of scraped browser URL bar history (`day`, `source: "BROWSER_BAR"`, `host`, `hour`, `visits`, `blocked`, `activeSeconds`) recorded by `KahfBlockerService` across 18 browsers (retained locally for 35 days in SQLite and queryable on the backend via `Query.deviceSiteVisits` for up to **92 days**). | [`fdb.java:63-295`](../02_curated_decompiled_sources/p000/fdb.java#L63-L295), [`y0d.java:45-67`](../02_curated_decompiled_sources/p000/y0d.java#L45-L67), [`nl3.java:1164-1180`](../02_curated_decompiled_sources/p000/nl3.java#L1164-L1180) |
| `PermissionStatusSyncWorker` (`mo1175d` -> `z27`) | `mutation UpdateDevicePermissionStatusMutation` (`q0d.java`) | Real-time state of Notification, Accessibility, Usage Stats, Battery Optimization, and Device Admin permissions. | [`PermissionStatusSyncWorker.java:51-90`](../02_curated_decompiled_sources/com/kahf/dns/features/permission_flows/PermissionStatusSyncWorker.java#L51-L90), [`z27.java:490-590`](../02_curated_decompiled_sources/p000/z27.java#L490-L590), [`q0d.java:46`](../02_curated_decompiled_sources/p000/q0d.java#L46) |
| `yc3` / `cd3` | `mutation UpdateDeviceDnsSettingsMutation` (`tzc.java`) | Reports the active Android system Private DNS hostname (`LinkProperties.getPrivateDnsServerName()`) whenever network link properties change (`ti9.java` / `gt5.java:86-105`). | [`yc3.java:116-188`](../02_curated_decompiled_sources/p000/yc3.java#L116-L188), [`cd3.java:148-155`](../02_curated_decompiled_sources/p000/cd3.java#L148-L155), [`tzc.java:44-46`](../02_curated_decompiled_sources/p000/tzc.java#L44-L46) |
| `DailyAnalyticsWorker` (`mo1175d` -> `tk2` / `rp9`) | `DailyStatusEvent.Snapshot` & PostHog `$set` (`tk2.java` / `rp9.java`) | Sends a 55-field daily snapshot of every protection toggle, prayer silence schedule, custom site block count, per-app block counters (`youtube`, `instagram`, `facebook`, `telegram`, `whatsapp`, `other_apps`, `group_social_media`), and permission state to **Firebase, Facebook, and PostHog** every 24 hours. | [`DailyAnalyticsWorker.java:65-139`](../02_curated_decompiled_sources/com/kahf/dns/features/analytics/DailyAnalyticsWorker.java#L65-L139), [`tk2.java:86-96`](../02_curated_decompiled_sources/p000/tk2.java#L86-L96), [`rp9.java:53-113, 840`](../02_curated_decompiled_sources/p000/rp9.java#L53-L113) |
