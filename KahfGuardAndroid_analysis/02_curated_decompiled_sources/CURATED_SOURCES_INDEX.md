# Curated Decompiled Sources Index

To keep this repository lightweight and focused strictly on verifiable forensic evidence, this folder includes:
1. **All 128 unobfuscated `com/kahf/dns/**` classes** from `base.apk`.
2. **The 53 R8-repackaged `p000/*.java` classes** directly cited in our forensic audit reports (out of 14,663 total R8-flattened library classes in `base.apk`).

Anyone can decompile [`00_raw_apks/base.apk`](../00_raw_apks/base.apk) with `jadx 1.5.1` to inspect any other third-party library class.

## R8-Obfuscated Class Mapping (`p000/*.java`)

| Obfuscated File | Forensic Role & Evidence Summary |
| :--- | :--- |
| [`p000/qu1.java`](./p000/qu1.java) | CompositeAnalyticsProvider: fans out logEvent, logScreenView, setUserId, and setUserProperties to Firebase (r54), Facebook (ry3), and PostHog (n99). |
| [`p000/r54.java`](./p000/r54.java) | FirebaseAnalyticsProvider implementation. |
| [`p000/ry3.java`](./p000/ry3.java) | FacebookAnalyticsProvider implementation (Meta AppEventsLogger -> graph.facebook.com). |
| [`p000/n99.java`](./p000/n99.java) | PostHogAnalyticsProvider implementation; extracts email & name PII in setUserProperties and calls PostHog.identify. |
| [`p000/f20.java`](./p000/f20.java) | Hardcoded PostHog API key (phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N) and first-party reverse proxy URL (https://p.kahf.co.uk). |
| [`p000/ab9.java`](./p000/ab9.java) | PostHogAndroidConfig builder enabling lifecycle events, deep links, screen views, and session replay. |
| [`p000/AbstractC0378gi.java`](./p000/AbstractC0378gi.java) | PostHog Android setup registering PostHogReplayIntegration (cd9), PostHogTouchActivityIntegration (vd9), and PostHogLogCatIntegration (gb9), plus `m8670l()` returning `"https://id.kahf.co"`. |
| [`p000/gb9.java`](./p000/gb9.java) | PostHogLogCatIntegration constructing `["logcat", "-v", "epoch", "-T", "<timestamp>", "*:E"]` and spawning logcat reader thread. |
| [`p000/tu2.java`](./p000/tu2.java) | Executes Runtime.getRuntime().exec("logcat -v epoch ...") and streams console logs to PostHog Session Replay (rrweb/console@1). |
| [`p000/sxc.java`](./p000/sxc.java) | UniqueUserIdManager (`m18373c`): generates persistent 48-bit `PRD<12-hex>` fingerprint from Settings.Secure.ANDROID_ID + 7 Build.* hardware constants (`"aid:<android_id>|bld:<build_info>"`) and checks AD_ID / READ_PHONE_STATE (`m18372a`). |
| [`p000/dxc.java`](./p000/dxc.java) | Coroutine wrapper for UniqueUserIdManager. |
| [`p000/C0639nl.java`](./p000/C0639nl.java) | InstalledAppsCollector: enumerates installed apps via QUERY_ALL_PACKAGES plus 160+ hardcoded package names. |
| [`p000/C0602ml.java`](./p000/C0602ml.java) | Queries PackageManager for all installed android.net.VpnService implementations (vpn_service_apps). |
| [`p000/l74.java`](./p000/l74.java) | Executes UpdateDeviceInstalledApps GraphQL mutation and evaluates device_id_quality (optimal/partial/basic). |
| [`p000/a0d.java`](./p000/a0d.java) | Apollo GraphQL mutation: UpdateDeviceInstalledApps. |
| [`p000/b0d.java`](./p000/b0d.java) | Static field selection helper for UpdateDeviceInstalledApps (`a0d.java`). |
| [`p000/h0d.java`](./p000/h0d.java) | Apollo GraphQL mutation: UpdateDeviceMetadataMutation (uploads `vpn_service_apps` metadata via `b53.m1658e`). |
| [`p000/b53.java`](./p000/b53.java) | DeviceRepository implementation invoking DeviceCheckInMutation (`e23`), CreateDeviceMutation (`gg2`), UpdateDeviceMetadataMutation (`h0d`), and UpdateFirebaseTokenMutation (`e1d`). |
| [`p000/mzc.java`](./p000/mzc.java) | Apollo GraphQL mutation: UpdateDeviceAppUsage. |
| [`p000/pzc.java`](./p000/pzc.java) | Apollo GraphQL response adapter (`lzc`) for UpdateDeviceAppUsage (`mzc.java`). |
| [`p000/q0d.java`](./p000/q0d.java) | Apollo GraphQL mutation: UpdateDevicePermissionStatusMutation. |
| [`p000/z27.java`](./p000/z27.java) | Coroutine implementation for PermissionStatusSyncWorker (case 5, lines 490-600) executing `q0d` (`UpdateDevicePermissionStatusMutation`). |
| [`p000/tzc.java`](./p000/tzc.java) | Apollo GraphQL mutation: UpdateDeviceDnsSettingsMutation. |
| [`p000/y0d.java`](./p000/y0d.java) | Apollo GraphQL mutation: UpdateDeviceSiteVisits (uploads scraped browser history). |
| [`p000/jcb.java`](./p000/jcb.java) | SiteVisitDayInput model (day, source: BROWSER_BAR, hours). |
| [`p000/c7d.java`](./p000/c7d.java) | Serializer for SiteVisitDayInput setting source = "BROWSER_BAR". |
| [`p000/nl3.java`](./p000/nl3.java) | Serializer for SiteVisitHourInput (host, hour, visits, blocked, activeSeconds). |
| [`p000/xcb.java`](./p000/xcb.java) | SiteVisitRecorder: records scraped browser URLs and active foreground time into Room SQLite for 35 days. |
| [`p000/fdb.java`](./p000/fdb.java) | SiteVisitUploader: batches up to 34 days of dirty site_visit rows (up to 1,976 hosts/day) for GraphQL upload. |
| [`p000/bcb.java`](./p000/bcb.java) | Extracts normalized domain names from scraped browser URL bar text. |
| [`p000/gd7.java`](./p000/gd7.java) | AccessibilityNodeInfo tree walker (m8526C) and 18-browser URL bar view ID scraper (m8530G). |
| [`p000/hge.java`](./p000/hge.java) | Keyword matcher and Android Settings / Private DNS / Uninstall screen text detector. |
| [`p000/a13.java`](./p000/a13.java) | Constants: high/medium/low/safety.kahfguard.com, 18 browser packages, Private DNS UI lock strings, risky words list. |
| [`p000/qa3.java`](./p000/qa3.java) | Protection tier enum mapping HIGH -> high.kahfguard.com, MEDIUM -> medium.kahfguard.com, LOW -> low.kahfguard.com. |
| [`p000/C0969wi.java`](./p000/C0969wi.java) | Reads active Android Private DNS hostname via ConnectivityManager.getLinkProperties().getPrivateDnsServerName(). |
| [`p000/ti9.java`](./p000/ti9.java) | Registers DefaultNetworkCallback to monitor Private DNS changes. |
| [`p000/gt5.java`](./p000/gt5.java) | NetworkCallback.onLinkPropertiesChanged listener triggering Private DNS backend sync. |
| [`p000/yc3.java`](./p000/yc3.java) | Deduplicates and reports LAST_REPORTED_DNS to backend. |
| [`p000/cd3.java`](./p000/cd3.java) | Syncs current Private DNS hostname via UpdateDeviceDnsSettingsMutation. |
| [`p000/nb3.java`](./p000/nb3.java) | DnsSafetyManager (`m14124a`): determines if Private DNS is failing and logs DiagnosticRun analytics with LAST_KNOWN_IP. |
| [`p000/m48.java`](./p000/m48.java) | Network & DNS diagnostic engine (`m13149o`): checks SIM/MCC (470), 1.1.1.1:443 TCP, google.com, forcesafesearch.google.com, and thequran.com. |
| [`p000/C0717pp.java`](./p000/C0717pp.java) | Direct TCP socket connectivity probe (`new InetSocketAddress("1.1.1.1", 443)` with 3,000ms timeout, lines 176-180). |
| [`p000/i48.java`](./p000/i48.java) | Coroutine tasks for DNS bootstrap & canary resolution (high/medium/low.kahfguard.com, thequran.com, forcesafesearch.google.com). |
| [`p000/j48.java`](./p000/j48.java) | Parallel coroutine runner for DNS verification layers. |
| [`p000/oa3.java`](./p000/oa3.java) | DnsDiagnosticResult payload model (`f29956o` = `hasPrivateDnsIssue`). |
| [`p000/wo9.java`](./p000/wo9.java) | ProtectionControlVM: launches DNS safety check (`zl9` -> `C0890ud.m19549l`) upon opening the Kahf Guard app / Protection screen (line 326). |
| [`p000/C0890ud.java`](./p000/C0890ud.java) | Executes `nb3.m14124a()` (`m19549l`, line 268) and invokes `nm9` to disarm protections when `isDnsUnsafe` returns true. |
| [`p000/nm9.java`](./p000/nm9.java) | Coroutine that logs `"Disabling protections due to internet connectivity issues with Kahf DNS"` and permanently sets `pref_dns_change_prevention_enabled = false` and `pref_uninstall_prevention_enabled = false`. |
| [`p000/jd2.java`](./p000/jd2.java) | CountryDetector: queries ipwho.is, freeipapi.com, db-ip.com, and ipinfo.io to detect user country. |
| [`p000/C0957w6.java`](./p000/C0957w6.java) | Contains the 7-service Public IP walker (ipify, myip, checkip.amazonaws, ip.sb, icanhazip, ipecho, ipinfo) and clipboard copy logic. |
| [`p000/C1061z.java`](./p000/C1061z.java) | Caches and coordinates public IP resolution. |
| [`p000/tk2.java`](./p000/tk2.java) | Executes DailyStatusTask and sends 55-field snapshot (including all per-app and per-category block counters) to PostHog ($set) and AnalyticsEvent.DailyStatusEvent.Snapshot. |
| [`p000/rp9.java`](./p000/rp9.java) | Builds the 55-field daily device configuration, permission, prayer silence, and block counter map (`youtube`, `instagram`, `facebook`, `telegram`, `whatsapp`, `other_apps`, `group_social_media`). |
