# 02 — VpnService Absence, System Private DNS Architecture & AccessibilityService Deep Dive
**Target Application:** Kahf Guard (`com.kahf.dns` v4.6.287, `versionCode: 361`)  
**Components Audited:** `AndroidManifest.xml`, `res/xml/accessibility_service_config.xml`, `res/xml/device_admin_receiver.xml`, `KahfBlockerService`, `AccessibilityMonitorService`, `DnsSafetyManager` (`nb3`), `SiteVisitRecorder` (`xcb` / `fdb`)

---

## 1. Architectural Surprise: Zero Local `VpnService` Implementation

### 1.1 Disproven Hypothesis: Local `tun` Interface or Packet-Level MitM
A primary hypothesis entering this audit was that Kahf Guard—like RethinkDNS, Intra, Nebulo, or AdGuard—instantiates a local `android.net.VpnService` virtual `tun` interface to intercept DNS traffic (`UDP/TCP 53`) or Layer-3 device traffic (`0.0.0.0/0`, `::/0`).

**Forensic Verdict (Disproven Hypothesis / Verified Code Fact):**
1. **Zero `VpnService` Declarations in `AndroidManifest.xml`:** Full inspection of [`AndroidManifest.xml`](../01_manifest_and_resources/AndroidManifest.xml#L1-L214) and [`manifest_audit.json`](../04_evidence_dumps/manifest_audit.json) confirms that Kahf Guard declares **no** `<service>` with `android.permission.BIND_VPN_SERVICE`.
2. **Only 4 Services Exist in the APK:**
   - `com.kahf.dns.features.guards.service.KahfBlockerService` (`BIND_ACCESSIBILITY_SERVICE`, exported=`false`)
   - `com.kahf.dns.features.guards.service.AccessibilityMonitorService` (`foregroundServiceType="specialUse"`, exported=`false`)
   - `androidx.work.impl.foreground.SystemForegroundService` (WorkManager)
   - `com.google.firebase.components.ComponentDiscoveryService` (Firebase)
3. **Why `"android.net.VpnService"` Appears in `classes2.dex`:**
   String search across DEX files found `"android.net.VpnService"` in [`C0602ml.java:155-184`](../02_curated_decompiled_sources/p000/C0602ml.java#L155-L184). Decompilation proves this is **not** a VPN service implementation; rather, it is a **VPN-app hunter** (`getInstalledVpnApps`) that queries `PackageManager.queryIntentServices(new Intent("android.net.VpnService"), 0)` so Kahf Guard can:
   - Upload the user's installed VPN apps (`vpn_service_apps`) to `https://id.kahf.co/graphql` via [`InstalledAppsSyncWorker.java:108-193`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L108-L193), and
   - Block the user from launching competing VPN/Tor apps via `AccessibilityService` when `"Block VPN & Tor"` (`pref_group_vpn_tor_enabled`) is toggled on!

### 1.2 How Kahf Guard Actually Configures DNS: Manual Android System Private DNS (DoT)
Because Kahf Guard has no `VpnService` (and does not hold Device Owner / Profile Owner privileges required to call `DevicePolicyManager.setGlobalPrivateDnsModeSpecifiedHost()`), it **cannot programmatically set DNS on standard non-rooted Android devices**.

Instead, as proven in [`a13.java:25-39`](../02_curated_decompiled_sources/p000/a13.java#L25-L39), [`qa3.java:18-45`](../02_curated_decompiled_sources/p000/qa3.java#L18-L45), and [`C0957w6.java:219-232`](../02_curated_decompiled_sources/p000/C0957w6.java#L219-L232):
1. The app copies one of three hardcoded **DNS-over-TLS (DoT)** hostnames to the Android system clipboard (`ClipboardManager.setPrimaryClip`):
   - **Strong Protection (`HIGH`):** `high.kahfguard.com` (`qa3.f34200w`)
   - **Moderate Protection (`MEDIUM`):** `medium.kahfguard.com` (`qa3.f34201x`)
   - **Weak Protection (`LOW`):** `low.kahfguard.com` (`qa3.f34202y`)
2. It launches the system settings intent (`"android.settings.NETWORK_OPERATOR_SETTINGS"` or `"com.android.settings.SEARCH_RESULT_TRAMPOLINE"`, [`a13.java:46-55`](../02_curated_decompiled_sources/p000/a13.java#L46-L55)) and instructs the user to manually paste the hostname into **Settings -> Network & Internet -> Private DNS**.
3. To verify if the user actually set it, [`C0969wi.java:86-98`](../02_curated_decompiled_sources/p000/C0969wi.java#L86-L98) calls `ConnectivityManager.getLinkProperties(activeNetwork).getPrivateDnsServerName()` and checks if the string contains `"kahf"` (`stb.m18246L0(str, "kahf", true)`).
4. In addition, [`ti9.java:32-44`](../02_curated_decompiled_sources/p000/ti9.java#L32-L44) and [`gt5.java:86-105`](../02_curated_decompiled_sources/p000/gt5.java#L86-L105) register a `ConnectivityManager.NetworkCallback` (`onLinkPropertiesChanged`) that watches `linkProperties.getPrivateDnsServerName()` in real time and uploads any change to `https://id.kahf.co/graphql` via `UpdateDeviceDnsSettingsMutation` ([`tzc.java`](../02_curated_decompiled_sources/p000/tzc.java)).

### 1.3 Architectural Flaws of Relying on Manual System Private DNS + UI Scraping
By avoiding a local `VpnService` and relying on manual Android Private DNS + `AccessibilityService` UI locks, Kahf Guard introduces four major engineering flaws:
1. **Zero Granular / Per-Category Client Control:** Android's Private DNS setting accepts only a single static DoT hostname. Because Kahf only operates three static hostnames (`high`, `medium`, `low`), users are trapped in monolithic presets—enabling `high.kahfguard.com` forces `restrict.youtube.com` CNAME rewriting globally and kills YouTube comments with no way to toggle YouTube Restricted Mode independently.
2. **Conflict with Legitimate WireGuard / Corporate VPNs:** When a user activates a legitimate work or privacy VPN (`TRANSPORT_VPN`), the VPN tunnel either overrides system DNS or causes Kahf's `CountryDetector` (`jd2.java:92`) and `KahfBlockerService` (`pref_group_vpn_tor_enabled`) to break or block the VPN app.
3. **Coercive UI Scraping to Prevent DNS Changes:** Because the app does not own the DNS transport, it resorts to using `AccessibilityService` (`KahfBlockerService.m3805s`, [`KahfBlockerService.java:1084-1142`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L1084-L1142)) to watch `com.android.settings` for strings like `"Select Private DNS Mode"` or `"Private DNS provider hostname"` (`a13.f59i`) and throws a full-screen blocking overlay (`f4d`) over the Android Settings app.
4. **The "DNS Safety Mechanism" Fail-Open Vulnerability (Detailed in Section 3 below):** If Private DNS becomes unreachable while raw IP (`1.1.1.1:443`) works, Kahf Guard **automatically disables its own DNS Change Prevention and Uninstall Prevention locks**, allowing trivial bypass.

---

## 2. AccessibilityService (`KahfBlockerService`) Forensic Deep Dive

### 2.1 Static XML Configuration vs. Dynamic Runtime Expansion
In [`res/xml/accessibility_service_config.xml`](../04_evidence_dumps/res_xml_audit.json):
```xml
<accessibility-service
    android:description="@string/accessibility_service_description"
    android:settingsActivity="com.kahf.dns.ui.MainActivity"
    android:canRetrieveWindowContent="true"
    android:accessibilityEventTypes="0x820"
    android:accessibilityFeedbackType="0x10"
    android:notificationTimeout="200"
    android:accessibilityFlags="0x12" />
```
- `accessibilityEventTypes="0x820"`: `TYPE_WINDOW_STATE_CHANGED (0x0020) | TYPE_WINDOW_CONTENT_CHANGED (0x0800)`.
- `accessibilityFlags="0x12"`: `FLAG_INCLUDE_NOT_IMPORTANT_VIEWS (0x0002) | FLAG_REPORT_VIEW_IDS (0x0010)`.
- `canRetrieveWindowContent="true"`: Grants full read access to the view hierarchy (`getRootInActiveWindow()`) of monitored packages.
- **Static XML Omission of `android:packageNames`:** The static XML omits `android:packageNames` (which defaults to all packages on the device until `onServiceConnected` runs).

At runtime, [`KahfBlockerService.java:356-530`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L356-L530) (`m3791b()` and `m3788K()`) dynamically builds a `LinkedHashSet` of target package names and calls `setServiceInfo(serviceInfo)`. While this dynamic scoping avoids hooking banking apps when only Reels/Shorts blocking is active, enabling standard protection features rapidly expands the monitored scope across dozens of sensitive apps:

| Feature Toggle | Packages Added to `AccessibilityServiceInfo.packageNames` | Evidence Location |
| :--- | :--- | :--- |
| **YouTube Shorts / Instagram Reels / Facebook Reels** | `com.google.android.youtube`, `com.instagram.android`, `com.facebook.katana`, `com.facebook.lite` | [`KahfBlockerService.java:371-383`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L371-L383) |
| **Telegram Search / WhatsApp Status** | `org.telegram.messenger`, `com.whatsapp`, `com.whatsapp.w4b` | [`KahfBlockerService.java:384-391`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L384-L391) |
| **Custom Site Blocker OR Browsing Report (`pref_browsing_report_enabled`)** | **18 Web Browsers** (`a13.f55e`): Chrome, Firefox, Samsung Internet, Opera, Opera Mini, Edge, Brave, DuckDuckGo, Vivaldi, Mi Browser, UC Browser, Kiwi,Via, Puffin, Tor Browser, Dolphin, Huawei Browser, Yahoo | [`KahfBlockerService.java:460-467`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L460-L467), [`a13.java:58-77`](../02_curated_decompiled_sources/p000/a13.java#L58-L77) |
| **Risky Word Block (`m11290t()`)** | **All 18 Browsers** + **Play Store** (`com.android.vending`) + **Social Media (`f6289u0`)**: Facebook, Instagram, YouTube, X/Twitter, TikTok, Snapchat, LinkedIn, Pinterest, Reddit, Tumblr + **Messaging (`f6290v0`)**: WhatsApp, WhatsApp Business, FB Messenger, Telegram, Discord | [`KahfBlockerService.java:81-101`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L81-L101), [`KahfBlockerService.java:468-475`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L468-L475) |
| **Uninstall Prevention / Super Uninstall Protection** | **60+ System & OEM Packages (`f6291w0`, `f6292x0`)**: `com.android.settings`, `com.google.android.packageinstaller`, `com.android.systemui`, MIUI Security Center, Samsung OneUI Home, ColorOS/Oppo/Vivo/Xiaomi/Huawei/Realme/OnePlus launchers & settings | [`KahfBlockerService.java:103-165`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L103-L165), [`KahfBlockerService.java:476-484`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L476-L484) |

### 2.2 Full-Screen Text Scraping in Messaging & Social Apps ("Risky Word Block")
When `"Risky Word Block"` (`pref_risky_word_block_enabled`) is enabled, [`KahfBlockerService.m3800n()`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L966-L1026) runs on every window content change (`throttled` at 300ms) inside WhatsApp, Telegram, Messenger, Discord, Instagram, Facebook, YouTube, Reddit, X, and 18 browsers:
- It calls [`gd7.m8526C(rootNode, this)`](../02_curated_decompiled_sources/p000/gd7.java#L27-L69), which **recursively traverses the entire on-screen UI tree** (`node.getChild(i)`) and extracts `node.getText().toString()` from every visible `AccessibilityNodeInfo`!
- While keyword matching (`hge.m9457d`) occurs in RAM against the risky keyword list (`a13.f63m`), granting an app containing **PostHog Session Replay (`cd9`)** and **Facebook/Firebase SDKs** full `AccessibilityNodeInfo` read access inside private messaging apps (`com.whatsapp`, `org.telegram.messenger`) violates the principle of least privilege.

### 2.3 Browser URL Bar Scraping, 35-Day SQLite Logging & Backend Exfiltration
Even more invasive is [`KahfBlockerService.m3801o()`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L1028-L1082):
1. Whenever any of the 18 supported browsers is in the foreground, [`gd7.m8530G(rootNode, packageName)`](../02_curated_decompiled_sources/p000/gd7.java#L156-L246) locates the browser's URL bar (`:id/url_bar`, `:id/mozac_browser_toolbar_url_view`, `:id/location_bar_edit_text`, etc.) and reads `node.getText()`.
2. It extracts the normalized hostname via [`bcb.m1876a(urlText)`](../02_curated_decompiled_sources/p000/bcb.java#L22-L120).
3. If `pref_browsing_report_enabled` is true (`xcb.m22015c`), it calls `xcb.m22018f(packageName, host, isBlocked, isIncognito)` ([`xcb.java:272-276`](../02_curated_decompiled_sources/p000/xcb.java#L272-L276)).
4. **Local Persistence (35 Days):** [`xcb.java:330-362`](../02_curated_decompiled_sources/p000/xcb.java#L330-L362) flushes the visited host, hour of day, visit count, block count, and active foreground milliseconds into the Room SQLite database (`app_database.db` tables `site_visit` and `site_visit_day`, defined in [`AppDatabase_Impl.java:65-115`](../02_curated_decompiled_sources/com/kahf/dns/data/database/AppDatabase_Impl.java#L65-L115)), retaining 35 days of history.
5. **Cloud Exfiltration to `https://id.kahf.co/graphql`:** Every hour when `AppUsageSyncWorker` runs, [`fdb.m7915a()`](../02_curated_decompiled_sources/p000/fdb.java#L63-L295) queries up to 34 days of dirty `site_visit` records (up to 1,976 unique domains per day) and uploads them via `mutation UpdateDeviceSiteVisits($deviceId: ID!, $days: [SiteVisitDayInput!]!)` ([`y0d.java:45-67`](../02_curated_decompiled_sources/p000/y0d.java#L45-L67), [`nl3.java:1164-1180`](../02_curated_decompiled_sources/p000/nl3.java#L1164-L1180)).

---

## 3. The "DNS Safety Mechanism" Fail-Open Vulnerability

To prevent users from getting locked out of their settings if Kahf's DNS servers go down, Kahf Guard runs a background foreground service (`AccessibilityMonitorService`) that executes `DnsSafetyManager.isDnsUnsafe()` ([`nb3.java:91-238`](../02_curated_decompiled_sources/p000/nb3.java#L91-L238)) every 60 seconds (`AccessibilityMonitorService.java:53`).

### Exact Fail-Open Logic (`m48.java:447-960` & `AccessibilityMonitorService.java:200-255`)
1. `m48.m13149o()` first checks if raw TCP connectivity to Cloudflare (`1.1.1.1:443`) succeeds within 3,000ms (`i48.java:169` -> `C0717pp.java`).
2. Next, it attempts to resolve `"google.com"` via the system DNS resolver (`m48.java:926`).
3. If `1.1.1.1:443` is reachable (`hasDirectInternet = true`), **but** `"google.com"` fails to resolve (`canResolveDns = false`), `m48.m13149o()` returns `hasPrivateDnsIssue = true` (`oa3.f29956o = true`, `diagnosticStatus = "private_dns_down"`, [`m48.java:656-657`](../02_curated_decompiled_sources/p000/m48.java#L656-L657)).
4. When `nb3.m14124a()` sees `isKahfDnsSet == true` and `hasPrivateDnsIssue == true`, it returns `isDnsUnsafe = true` (`nb3.java:170`).
5. In [`AccessibilityMonitorService.java:209-250`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/AccessibilityMonitorService.java#L209-L250), upon receiving `isDnsUnsafe = true`, the service logs:
   ```
   "Disabling protections due to internet connectivity issues with Kahf DNS"
   ```
   and **automatically overwrites SharedPreferences** to set:
   - `pref_dns_change_prevention_enabled = false`
   - `pref_uninstall_prevention_enabled = false`
   - `pref_super_uninstall_protection_enabled = false`

**Security Impact:** Anyone on the local Wi-Fi router (or a user with a local firewall/hotspot rule) who blocks TCP port `853` (or blocks `*.kahfguard.com`) while allowing `1.1.1.1:443` will trigger `AccessibilityMonitorService` within 60 seconds to **permanently disarm all DNS-change and uninstall protections** on the device!
