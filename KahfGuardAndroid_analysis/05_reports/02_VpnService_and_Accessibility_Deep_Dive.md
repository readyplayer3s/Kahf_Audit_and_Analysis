# 02 — VpnService Absence, System Private DNS Architecture & AccessibilityService Deep Dive (v2.1)
**Target Application:** Kahf Guard (`com.kahf.dns` v4.6.287, `versionCode: 361`)  
**Components Audited:** `AndroidManifest.xml`, `res/xml/accessibility_service_config.xml`, `res/xml/device_admin_policies.xml`, `KahfBlockerService`, `AccessibilityMonitorService`, `DnsSafetyManager` (`nb3` / `m48` / `wo9` / `C0890ud` / `nm9`), `SiteVisitRecorder` (`xcb` / `fdb`)  
**Revision:** `v2.1` (Re-verified against `KahfBlockerService.java`, `a13.java`, `gd7.java`, `bcb.java`, and raw DEX on Nov 19, 2026)

---

## 1. Architectural Overview: Zero Local `VpnService` Implementation

### 1.1 Disproven Hypothesis: Local `tun` Interface or Packet-Level MitM
A primary hypothesis entering this audit was that Kahf Guard—like RethinkDNS, Intra, Nebulo, or AdGuard—instantiates a local `android.net.VpnService` virtual `tun` interface to intercept DNS or Layer-3 traffic.

**Forensic Verdict (Disproven Hypothesis / Verified Code Fact):**
1. **Zero `VpnService` Declarations in `AndroidManifest.xml`:** Full inspection of [`AndroidManifest.xml`](../01_manifest_and_resources/AndroidManifest.xml#L1-L328) and [`manifest_audit.json`](../04_evidence_dumps/manifest_audit.json) confirms Kahf Guard declares **no** `<service>` with `android.permission.BIND_VPN_SERVICE`.
2. **Only 3 First-Party (`com.kahf.dns.*`) Services Exist in the APK:**
   - `com.kahf.dns.features.guards.service.KahfBlockerService` (`BIND_ACCESSIBILITY_SERVICE`, [`AndroidManifest.xml:148-153`](../01_manifest_and_resources/AndroidManifest.xml#L148-L153))
   - `com.kahf.dns.features.guards.service.AccessibilityMonitorService` (`foregroundServiceType="specialUse"`, [`AndroidManifest.xml:162-164`](../01_manifest_and_resources/AndroidManifest.xml#L162-L164)) — monitors accessibility service health (`50000ms` / `300000ms` timers); contains **no** 60-second DNS unlock loop.
   - `com.kahf.dns.services.AndroidNotificationService` (`com.google.firebase.MESSAGING_EVENT`, [`AndroidManifest.xml:143-147`](../01_manifest_and_resources/AndroidManifest.xml#L143-L147))
3. **Why `"android.net.VpnService"` Appears in DEX:**
   [`C0602ml.java:155-184`](../02_curated_decompiled_sources/p000/C0602ml.java#L155-L184) queries `PackageManager.queryIntentServices(new Intent("android.net.VpnService"), 0)` to detect installed VPN apps so Kahf Guard can:
   - Upload installed VPN apps (`vpn_service_apps`) to `https://id.kahf.co/graphql` for any logged-in account ([`InstalledAppsSyncWorker.java:141-250`](../02_curated_decompiled_sources/com/kahf/dns/features/user/InstalledAppsSyncWorker.java#L141-L250) → [`b53.java:267-365`](../02_curated_decompiled_sources/p000/b53.java#L267-L365) → [`h0d.java:44`](../02_curated_decompiled_sources/p000/h0d.java#L44)), and
   - Block launching VPN/Tor apps via `AccessibilityService` when the opt-in `"Block VPN & Tor"` (`pref_group_vpn_tor_enabled`, default `false`) toggle is enabled.

### 1.2 How Kahf Guard Configures DNS: Manual Android System Private DNS (DoT)
Kahf Guard intentionally uses Android's built-in Private DNS (DoT) rather than a local VPN (avoiding Android's single-VPN slot conflict, banking-app VPN warnings, and OEM background-kill issues). Because non-Device-Owner apps cannot write Private DNS programmatically:
1. The app copies one of three hardcoded **DNS-over-TLS (DoT)** hostnames to the clipboard ([`a13.java:108`](../02_curated_decompiled_sources/p000/a13.java#L108) `f56f`, plus raw DEX `vc3.<init>`, `va3.invoke`, `i48.invokeSuspend`, and `w5.invoke`):
   - **Strong Protection (`HIGH`):** `high.kahfguard.com`
   - **Moderate Protection (`MEDIUM`):** `medium.kahfguard.com`
   - **Weak Protection (`LOW`):** `low.kahfguard.com`
2. It guides the user to paste the hostname into **Settings → Network & Internet → Private DNS**.
3. [`C0969wi.java:86-98`](../02_curated_decompiled_sources/p000/C0969wi.java#L86-L98) verifies activation via `LinkProperties.getPrivateDnsServerName()` (`contains("kahf")`), and [`ti9.java`](../02_curated_decompiled_sources/p000/ti9.java) / [`gt5.java`](../02_curated_decompiled_sources/p000/gt5.java) sync Private DNS changes to `id.kahf.co/graphql` (`tzc.java`) when logged in.

### 1.3 Architectural Trade-Offs & Flaws of System Private DNS + Accessibility Locks
1. **Monolithic Presets (No Per-Category Toggles):** Because Android Private DNS accepts only one static hostname and Kahf offers only three static tiers (`high`/`medium`/`low`), using `high.kahfguard.com` globally enforces `restrict.youtube.com` and disables YouTube comments with no option to toggle Restricted Mode independently.
2. **UI-Overlay Locking (`AccessibilityService`):** To prevent changing Private DNS, opt-in `DNS Change Prevention` (`pref_dns_change_prevention_enabled`, default `false`) watches `com.android.settings` for Private DNS labels ([`a13.java:115-117`](../02_curated_decompiled_sources/p000/a13.java#L115-L117)) and overlays a blocking screen.
3. **DNS Fail-Open Parental Control Bypass (Section 3):** When `1.1.1.1:443` is reachable but Kahf DoT (`853`) fails, opening the Protection screen automatically disables Accessibility-based `DNS Change Prevention` and `Uninstall Prevention` without PIN or cooldown.

---

## 2. AccessibilityService (`KahfBlockerService`) Forensic Deep Dive

### 2.1 Configuration, Opt-In Defaults & Actual Scoped App Sets
In [`res/xml/accessibility_service_config.xml`](../04_evidence_dumps/res_xml_audit.json):
- `canRetrieveWindowContent="true"`, `accessibilityEventTypes="0x820"` (`WINDOW_STATE_CHANGED | WINDOW_CONTENT_CHANGED`), `accessibilityFlags="0x12"` (`INCLUDE_NOT_IMPORTANT_VIEWS | REPORT_VIEW_IDS`).
- **All Major Features Default to `false` ([`KahfBlockerService.java:905-1012`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L905-L1012)):**
  `pref_risky_word_block_enabled`, `pref_browsing_report_enabled`, `pref_dns_change_prevention_enabled`, `pref_uninstall_prevention_enabled`, `pref_custom_site_block_enabled`, `pref_youtube_shorts_enabled`, `pref_instagram_reels_enabled`, and `pref_facebook_reels_enabled` all default to `false` and require explicit user/parent opt-in.
- At runtime, `KahfBlockerService.m3791b()` ([`KahfBlockerService.java:1038-1056`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L1038-L1056)) dynamically updates `serviceInfo.packageNames` based on enabled toggles.

#### Exact Hardcoded Target Package Sets in `KahfBlockerService.java` *(v2.0 Correction)*
| Static Set | Exact Packages in `KahfBlockerService.java` | Source Lines |
| :--- | :--- | :--- |
| **`f6289u0` (Core Social / Messaging — 7 apps)** | `com.google.android.youtube`, `com.instagram.android`, `com.facebook.katana`, `com.facebook.lite`, `org.telegram.messenger`, `com.whatsapp`, `com.whatsapp.w4b` *(Note: Facebook Messenger is **not** in `f6289u0` or `f6291w0`.)* | [`KahfBlockerService.java:174`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L174) |
| **`f6290v0` (18 Supported Browsers)** | Chrome (`com.android.chrome`), Chrome Dev (`com.chrome.dev`), Firefox (`org.mozilla.firefox`), Firefox Lite (`org.mozilla.rocket`), Samsung Internet (`com.sec.android.app.sbrowser`), Edge (`com.microsoft.emmx`), Opera (`com.opera.browser`), Opera Mini (`com.opera.mini.native`), Brave (`com.brave.browser`), DuckDuckGo (`com.duckduckgo.mobile.android`), Vivaldi (`com.vivaldi.browser`), Tor Browser (`org.torproject.torbrowser`), SPIN Safe Browser (`com.nationaledtech.spinbrowser`), Ecosia (`com.ecosia.android`), Free Adblocker Browser (`com.hsv.freeadblockerbrowser`), 1DM (`idm.internet.download.manager`), Web Video Caster (`com.instantbits.cast.webvideo`), Kahf Browser (`io.kahf.browser`). *(Note: [`a13.java:107`](../02_curated_decompiled_sources/p000/a13.java#L107) explicitly documents UC Browser, Mi Browser, and Huawei Browser as having `"No capture"`.)* | [`KahfBlockerService.java:177`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L177), [`a13.java:40, 106-107`](../02_curated_decompiled_sources/p000/a13.java#L40) |
| **`f6291w0` (Additional Social / Chat — 8 apps)** | X/Twitter (`com.twitter.android`), TikTok (`com.zhiliaoapp.musically`), Snapchat (`com.snapchat.android`), Reddit (`com.reddit.frontpage`), Threads (`com.instagram.barcelona`), Pinterest (`com.pinterest`), Discord (`com.discord`), Tumblr (`com.tumblr`). | [`KahfBlockerService.java:180`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L180) |

### 2.2 Local In-RAM Text Scanning ("Risky Word Block") — *v2.0 Clarification*
When the opt-in `"Risky Word Block"` (`pref_risky_word_block_enabled`, default `false`) feature is enabled ([`KahfBlockerService.java:3549-3626`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L3549-L3626)):
- It calls `hge.m9467n(accessibilityNodeInfo, this.f6295B)` to scan visible screen text locally in RAM against built-in ([`a13.java:202-205`](../02_curated_decompiled_sources/p000/a13.java#L202-L205)) and user-configured risky words.
- **No Chat Upload in Code:** On a match, `m3806t(str)` ([`KahfBlockerService.java:3692-3704`](../02_curated_decompiled_sources/com/kahf/dns/features/guards/service/KahfBlockerService.java#L3692-L3704)) only increments local block counters (`pref_*_blocks_count`, `pref_total_blocks_count`) and triggers the blocking overlay. **No matched text, typed messages, or chat contents are stored or uploaded to any server.**
- **Residual Risk (Trust Surface):** As with any closed-source parental control app using `AccessibilityService` on messaging apps, users must trust future updates and backend security.

### 2.3 Opt-In Browser URL Bar Scraping ("Browsing Reports") — *v2.0 Clarification*
When `Custom Site Block` or opt-in `Browsing Reports` (`pref_browsing_report_enabled`, default `false`) is enabled:
1. [`gd7.m8530G(accessibilityNodeInfo)`](../02_curated_decompiled_sources/p000/gd7.java#L83-L100) scans up to 100 visible nodes in supported browsers (`f6290v0`) for known URL bar resource IDs ([`a13.java:40`](../02_curated_decompiled_sources/p000/a13.java#L40)).
2. [`gd7.m8571v`](../02_curated_decompiled_sources/p000/gd7.java#L1413) (called from `gd7.m8530G`) strips full URL paths and search queries down to a bare host string, and [`bcb.m1876a`](../02_curated_decompiled_sources/p000/bcb.java#L27-L76) validates and IDN/lowercase-normalizes that extracted domain (e.g., `example.com`).
3. Only if `pref_browsing_report_enabled == true`, [`xcb.java:330-362`](../02_curated_decompiled_sources/p000/xcb.java#L330-L362) records `(domain, date, hour, visits, blocked, activeSeconds)` in local Room SQLite (`site_visit`, 35-day retention).
4. When signed into a Kahf account, [`fdb.java:63-295`](../02_curated_decompiled_sources/p000/fdb.java#L63-L295) uploads up to 34 days of dirty `site_visit` rows via `UpdateDeviceSiteVisits` ([`y0d.java:45-67`](../02_curated_decompiled_sources/p000/y0d.java#L45-L67)) to `https://id.kahf.co/graphql`.

---

## 3. The "DNS Safety Mechanism" Fail-Open Bypass (`wo9` → `zl9` → `C0890ud` → `nb3` → `m48` → `nm9`)

To avoid locking users out of their device if Kahf's DNS resolvers go down, `ProtectionControlVM` ([`wo9.java:324-329`](../02_curated_decompiled_sources/p000/wo9.java#L324-L329)) — when operating on the local device (`!m21556N()`, [`wo9.java:1999-2001`](../02_curated_decompiled_sources/p000/wo9.java#L1999-L2001)) — launches a check upon opening the Protection screen (**not** on a 60-second background timer).

### Exact Call Chain (`C0717pp.java:176-180`, `m48.java:656-657`, `C0890ud.java`, `nm9.java`)
1. `m48.m13149o()` invokes `i48` → [`C0717pp`](../02_curated_decompiled_sources/p000/C0717pp.java#L176-L180), opening a raw TCP socket to `1.1.1.1:443` (3,000ms timeout).
2. Next, it resolves `"google.com"` via system DNS (5,000ms timeout).
3. If `1.1.1.1:443` succeeds (`hasDirectInternet = true`) **but** `"google.com"` fails (`canResolveDns = false`), `m48` returns `hasPrivateDnsIssue = true` (`oa3.f29956o = true`, `diagnosticStatus = "private_dns_down"`, [`m48.java:656-657`](../02_curated_decompiled_sources/p000/m48.java#L656-L657)).
4. If Kahf DNS is configured, [`nb3.m14124a()`](../02_curated_decompiled_sources/p000/nb3.java#L91-L298) returns `true` (`isDnsUnsafe`) and logs `DiagnosticRun` (including `last_known_ip`) to all three analytics SDKs.
5. `C0890ud.m19549l()` (`Lud;->l`) triggers [`nm9`](../02_curated_decompiled_sources/p000/nm9.java), which logs `"Disabling protections due to internet connectivity issues with Kahf DNS"`, logs `DnsSafetyDisable` (including `current_ip`), and sets:
   - `pref_dns_change_prevention_enabled = false`
   - `pref_uninstall_prevention_enabled = false`

**Security Impact & Exact Scope (v2.0 Clarification):**
- While intentional for outage recovery, blocking TCP port `853` (or `*.kahfguard.com`) on a local Wi-Fi router/hotspot while allowing `1.1.1.1:443` and opening Kahf Guard's Protection screen disables Accessibility-based **DNS Change Prevention** and **Uninstall Prevention** in ~5–8 seconds with **zero PIN, cooldown, or parental confirmation**.
- **Scope Note:** `nm9` does **not** revoke Android Device Admin (`pref_super_uninstall_protection_enabled`) if the user separately enabled Super Uninstall Protection.
