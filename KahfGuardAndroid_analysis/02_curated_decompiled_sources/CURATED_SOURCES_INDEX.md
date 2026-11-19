# Curated Decompiled Sources Index (v2.1.4)

To keep this repository lightweight and focused strictly on verifiable forensic evidence, this folder includes:
1. **All 128 unobfuscated `com/kahf/dns/**` classes** from `base.apk`.
2. **The 53 R8-repackaged `p000/*.java` classes** directly cited in our forensic audit reports (out of 14,663 total R8-flattened classes in `base.apk`).

Anyone can decompile [`00_raw_apks/base.apk`](../00_raw_apks/base.apk) with `jadx 1.5.1` to inspect any other class or verify raw Dalvik bytecode directly.

## Key Unobfuscated `com/kahf/dns/**` Classes Cited

| Source File | Forensic Role & Evidence Summary |
| :--- | :--- |
| [`com/kahf/dns/KahfGuardApp.java`](./com/kahf/dns/KahfGuardApp.java) | Initializes Firebase/Crashlytics (`m3561e`), Meta SDK (`m3560d`), self-hosted PostHog (`m3563g`, sessionReplay left `false`) + initial `PRD` PostHog identity (`m3558b` → `ab9.m348e`), and schedules all background sync/analytics workers (`m3565i`). Note: `onCreate()` (lines 561–562) is PairIP-wrapped, while `m3557a()` → `m3561e()` → `Ltf6` is intact in DEX (also referenced at `Lgl;->invoke@307`). |
| [`com/kahf/dns/p019ui/MainActivity.java`](./com/kahf/dns/p019ui/MainActivity.java) | `m5528t` (lines 585–605): sets the persistent `PRD<12-hex>` ID on Firebase Crashlytics (line 592), Firebase Analytics (line 597), and **Meta/Facebook `AnalyticsUserIDStore.setUserID`** (`AbstractC0093ce.m3061b`, line 604) whenever Google Play Services is available. |
| [`com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java`](./com/kahf/dns/p015di/core/AndroidAnalyticsProviderFactory.java) | Returns `new qu1(new r54(), new ry3(), new n99())` (line 17). |
| [`com/kahf/dns/p015di/core/AuthInterceptor.java`](./com/kahf/dns/p015di/core/AuthInterceptor.java) | Reads `preferencesHelper.getUniqueDeviceId()` (`PRD<12-hex>`) and attaches `X-Device-Id` + `app-name: kahf-guard` on every GraphQL request (lines 52–60, 110). |
| [`com/kahf/dns/features/guards/service/KahfBlockerService.java`](./com/kahf/dns/features/guards/service/KahfBlockerService.java) | Core `AccessibilityService`: defines target app sets (`f6289u0`–`f6291w0`, lines 174–180 — note Messenger is *not* included), loads opt-in toggles defaulting to `false` (`m3789L`, lines 905–1012), runs local RAM Risky Word Block (lines 3549–3626, increments counters only in `m3806t`), and scrapes browser URL bars when enabled. |
| [`com/kahf/dns/features/guards/service/AccessibilityMonitorService.java`](./com/kahf/dns/features/guards/service/AccessibilityMonitorService.java) | Foreground service monitoring accessibility health (`50000ms` grace / `300000ms` check); contains **no** 60-second DNS unlock loop. |
| [`com/kahf/dns/features/user/InstalledAppsSyncWorker.java`](./com/kahf/dns/features/user/InstalledAppsSyncWorker.java) | Schedules/executes installed app inventory (`l74` case 1) and VPN app metadata sync (`m3841e` → `b53.m1658e`). |
| [`com/kahf/dns/features/app_usage/AppUsageSyncWorker.java`](./com/kahf/dns/features/app_usage/AppUsageSyncWorker.java) | Schedules/executes hourly app usage (`PACKAGE_USAGE_STATS`) and `Browsing Reports` (`fdb`) GraphQL uploads for logged-in accounts. Raw DEX (`Lx00;->invokeSuspend@1445-1568`) checks `isChildDevice()` (`Ls4c;->g()`) + `ro.kahf.rom == "1"` **only** when `inputData["kahf_cadence"] == true`; on the standard 6-hour periodic schedule unconditionally registered by `KahfGuardApp.m3565i()` (`Lsy0;->x0`), `kahf_cadence` is `false` and the check is bypassed for all logged-in accounts (adult or child). |
| [`com/kahf/dns/core/analytics/AnalyticsEvent.java`](./com/kahf/dns/core/analytics/AnalyticsEvent.java) | Defines analytics event schemas fanned out via `qu1`: `DiagnosticRun` (`lines 6875-6893`, `LAST_KNOWN_IP` at line `6880` param `#4`), `DnsSafetyDisable` (`lines 7245, 7324-7332`, 8 params), `PostDnsSetDiagnosticEvent.Check` (`lines 9801-9819`, `LAST_KNOWN_IP` at line `9807` param `#4`, invoked in `Lwj2;->invokeSuspend@246`), and `MindfulPauseEvent` (`lines 8992-9236`, sending third-party `package_name`, `opens_in_window`, `daily_limit`, `duration_seconds`, invoked in `Lhe6;->invoke` & `Lir9;->b`). |
| [`com/kahf/dns/services/AndroidNotificationService.java`](./com/kahf/dns/services/AndroidNotificationService.java) | Firebase Cloud Messaging handler (`lines 807-848`) routing silent FCM push triggers (`installed_apps_sync`, `app_usage_sync`, `PermissionSync`, `MetadataSync`, `DnsSync`, `BlockCountsSync`, `Restriction`, `SupervisionUpdate`, `DeviceAlert`) — disclosed in Kahf's Privacy Policy ("FCM-triggered data collection"). |

## R8-Obfuscated Class Mapping (`p000/*.java`)

| Obfuscated File | Forensic Role & Evidence Summary |
| :--- | :--- |
| [`p000/qu1.java`](./p000/qu1.java) | Composite `AnalyticsProvider`: fans out `logEvent`, `logScreenView`, `setUserId`, and `setUserProperties` to Firebase (`r54`), Facebook (`ry3`), and PostHog (`n99`). |
| [`p000/r54.java`](./p000/r54.java) | `FirebaseAnalyticsProvider` implementation (strips `email`/`name` in `setUserProperties`). |
| [`p000/ry3.java`](./p000/ry3.java) | `FacebookAnalyticsProvider` implementation (`AppEventsLogger` → `graph.facebook.com`; strips `email`/`name` in `setUserProperties`, logs subscription properties & all `AnalyticsEvent` payloads including IP fields in diagnostic events). |
| [`p000/n99.java`](./p000/n99.java) | `PostHogAnalyticsProvider` implementation; extracts `email` & `name` in `setUserProperties` (lines 54–69) to identify logged-in users on Kahf's self-hosted PostHog. |
| [`p000/f20.java`](./p000/f20.java) | Hardcoded PostHog API key (`phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N`) and Kahf's self-hosted PostHog URL (`https://p.kahf.co.uk`). |
| [`p000/ab9.java`](./p000/ab9.java) | `PostHogIdentityManager`: computes `device_id_quality` and identifies PostHog with `PRD<12-hex>` on startup (`m348e`, lines 95–131). *(Does not configure session replay; config lives in `KahfGuardApp.m3563g`.)* |
| [`p000/AbstractC0378gi.java`](./p000/AbstractC0378gi.java) | PostHog Android SDK `setup()` registering standard SDK integrations (`cd9` Replay — compiled-off in `v4.6.287`, `vd9` Touch — branch 0 of R8-merged `Lxc9;->a` resets idle timer only while branch 1 `cd9` `MotionEvent.obtain` is dead code behind `sessionReplay = false`, `gb9` LogCat — drops all lines when replay inactive), plus `m8670l()` returning `"https://id.kahf.co"`. |
| [`p000/gb9.java`](./p000/gb9.java) | Standard `posthog-android` `PostHogLogCatIntegration` (`logcat -v epoch -T <ts> *:E`); inactive/discarded when session replay is off. |
| [`p000/tu2.java`](./p000/tu2.java) | Standard `posthog-android` logcat reader thread; checks `isSessionReplayActive()` (`Lcb9;->c`) on every line and drops output when replay is disabled. |
| [`p000/sxc.java`](./p000/sxc.java) | `UniqueUserIdManager` (`m18373c`): generates persistent 48-bit `PRD<12-hex>` fingerprint from `Settings.Secure.ANDROID_ID` + 7 `Build.*` hardware constants (`"aid:<android_id>|bld:<build_info>"`), backs up to `files/device_data/device_id.dat`, and checks `AD_ID` / `READ_PHONE_STATE` (`m18372a`). |
| [`p000/dxc.java`](./p000/dxc.java) | Coroutine wrapper invoking `sxc.m18373c` via `Lml`. |
| [`p000/C0639nl.java`](./p000/C0639nl.java) | `InstalledAppsCollector`: enumerates all launchable user-installed (non-system) apps plus a hardcoded 161-package curated list (`f28440e`, lines 21, 47–52) via `QUERY_ALL_PACKAGES` (excluding Kahf Guard itself), and defines 10 excluded MDM/enterprise/Kahf Browser packages (`f28439d`, line 18). |
| [`p000/C0602ml.java`](./p000/C0602ml.java) | Queries `PackageManager` for installed `android.net.VpnService` implementations (`vpn_service_apps`, lines 155–184), excluding Kahf Guard itself and the 10 packages in `C0639nl.f28439d` (line 177). |
| [`p000/l74.java`](./p000/l74.java) | Case 1 (lines 221–316): executes `UpdateDeviceInstalledApps` for any logged-in account (`user_id` + `device_mongodb_id`, no `isChildDevice()` check). Case 2 (lines 318–377): fetches `PRD<12-hex>` and dispatches `MainActivity.m5528t`. |
| [`p000/a0d.java`](./p000/a0d.java) | Apollo GraphQL mutation: `UpdateDeviceInstalledApps`. |
| [`p000/b0d.java`](./p000/b0d.java) | Static field selection helper for `UpdateDeviceInstalledApps` (`a0d.java`). |
| [`p000/h0d.java`](./p000/h0d.java) | Apollo GraphQL mutation: `UpdateDeviceMetadataMutation` (uploads `vpn_service_apps` metadata via `b53.m1658e`). |
| [`p000/b53.java`](./p000/b53.java) | `DeviceRepository` implementation invoking `DeviceCheckInMutation` (`e23`), `CreateDeviceMutation` (`gg2`, assigns `device_mongodb_id` on login), `UpdateDeviceMetadataMutation` (`h0d`), and `UpdateFirebaseTokenMutation` (`e1d`). |
| [`p000/mzc.java`](./p000/mzc.java) | Apollo GraphQL mutation: `UpdateDeviceAppUsage`. |
| [`p000/pzc.java`](./p000/pzc.java) | Apollo GraphQL response adapter (`lzc`) for `UpdateDeviceAppUsage` (`mzc.java`). |
| [`p000/q0d.java`](./p000/q0d.java) | Apollo GraphQL mutation: `UpdateDevicePermissionStatusMutation`. |
| [`p000/z27.java`](./p000/z27.java) | Coroutine implementation for `PermissionStatusSyncWorker` (case 5, lines 490–600) executing `q0d`. |
| [`p000/tzc.java`](./p000/tzc.java) | Apollo GraphQL mutation: `UpdateDeviceDnsSettingsMutation`. |
| [`p000/y0d.java`](./p000/y0d.java) | Apollo GraphQL mutation: `UpdateDeviceSiteVisits` (uploads domain-only browsing reports when opt-in enabled). |
| [`p000/jcb.java`](./p000/jcb.java) | `SiteVisitDayInput` model (`day`, `source: BROWSER_BAR`, `hours`). |
| [`p000/c7d.java`](./p000/c7d.java) | Serializer for `SiteVisitDayInput` setting `source = "BROWSER_BAR"`. |
| [`p000/nl3.java`](./p000/nl3.java) | Serializer for `SiteVisitHourInput` (`host`, `hour`, `visits`, `blocked`, `activeSeconds`). |
| [`p000/xcb.java`](./p000/xcb.java) | `SiteVisitRecorder`: records domain names and active foreground duration into Room SQLite for 35 days when `pref_browsing_report_enabled` is `true`. |
| [`p000/fdb.java`](./p000/fdb.java) | `SiteVisitUploader`: batches up to 34 days of dirty `site_visit` rows (up to 1,976 hosts/day) for GraphQL upload. |
| [`p000/bcb.java`](./p000/bcb.java) | Validates and IDN/lowercase-normalizes already-extracted domain hosts (`m1876a`, lines 27–76 of 77 lines; initial URL-to-host stripping is performed by `gd7.m8571v`). |
| [`p000/gd7.java`](./p000/gd7.java) | Browser URL bar node extractor (`m8530G`, lines 83+) scanning up to 100 visible `AccessibilityNodeInfo` nodes for known URL bar view IDs, and stripping full URL paths/queries to a host via `m8571v` (line 1413) before calling `bcb.m1876a`. |
| [`p000/hge.java`](./p000/hge.java) | Local in-RAM risky keyword matcher (`m9467n`) and Android Settings / Private DNS / Uninstall UI detector. |
| [`p000/a13.java`](./p000/a13.java) | Constants: URL bar resource IDs (`f55e`, line 40), `low/medium/high.kahfguard.com` (`f56f`, line 108 — also referenced in raw DEX by `vc3.<init>`, `va3.invoke`, `i48.invokeSuspend`, and `w5.invoke`), Private DNS & Uninstall UI lock strings (`f58h`–`f61k`), and built-in risky word list (`f50C`, lines 202–205). |
| [`p000/qa3.java`](./p000/qa3.java) | `DnsDiagnosticTask` (`implements az8`, lines 12–426): coordinates Private DNS diagnostic execution. *(v2.1 correction: `qa3` is not the DNS tier hostname enum; `high`/`medium`/`low.kahfguard.com` are defined/referenced in `a13.java:108` (`f56f`), `vc3.<init>`, `va3.invoke`, `i48.invokeSuspend`, and `w5.invoke`.)* |
| [`p000/C0969wi.java`](./p000/C0969wi.java) | Reads active Android Private DNS hostname via `ConnectivityManager.getLinkProperties().getPrivateDnsServerName()`. |
| [`p000/ti9.java`](./p000/ti9.java) | Registers `DefaultNetworkCallback` to monitor Private DNS changes. |
| [`p000/gt5.java`](./p000/gt5.java) | `NetworkCallback.onLinkPropertiesChanged` listener triggering Private DNS backend sync. |
| [`p000/yc3.java`](./p000/yc3.java) | Deduplicates and reports `LAST_REPORTED_DNS` to backend. |
| [`p000/cd3.java`](./p000/cd3.java) | Syncs current Private DNS hostname via `UpdateDeviceDnsSettingsMutation`. |
| [`p000/nb3.java`](./p000/nb3.java) | `DnsSafetyManager` (`m14124a`): checks Kahf DNS substring (line 269), determines if Private DNS is failing, and logs `DiagnosticRun` analytics with `last_known_ip` (line 191; `AnalyticsEvent.java:6880` param #4, surviving Firebase/Meta's 25-parameter SDK cap). |
| [`p000/m48.java`](./p000/m48.java) | Network & DNS diagnostic engine (`m13149o`): checks SIM/MCC (`470`), `1.1.1.1:443` TCP, `google.com`, `forcesafesearch.google.com`, and `thequran.com`. |
| [`p000/C0717pp.java`](./p000/C0717pp.java) | Direct TCP socket connectivity probe (`new InetSocketAddress("1.1.1.1", 443)` with 3,000ms timeout, lines 176–180). |
| [`p000/i48.java`](./p000/i48.java) | Coroutine tasks for DNS bootstrap & canary resolution (`high/medium/low.kahfguard.com`, `thequran.com`, `forcesafesearch.google.com`). |
| [`p000/j48.java`](./p000/j48.java) | Parallel coroutine runner for DNS verification layers. |
| [`p000/oa3.java`](./p000/oa3.java) | `DnsDiagnosticResult` payload model (`f29956o` = `hasPrivateDnsIssue`). |
| [`p000/wo9.java`](./p000/wo9.java) | `ProtectionControlVM`: on local device (`!m21556N()`, line 324), launches DNS safety check (`zl9` → `C0890ud.m19549l`) upon opening the Protection screen. |
| [`p000/C0890ud.java`](./p000/C0890ud.java) | Executes `nb3.m14124a()` (`m19549l`), builds the `networkDetails` map containing `current_ip` (lines 238, 257), and invokes `nm9` (`DnsSafetyDisable`, 8 params in `AnalyticsEvent.java:7245, 7324-7332`, surviving Firebase/Meta's 25-param cap) when `isDnsUnsafe` returns `true`. |
| [`p000/nm9.java`](./p000/nm9.java) | Coroutine that logs `"Disabling protections due to internet connectivity issues with Kahf DNS"` and disables Accessibility-based `pref_dns_change_prevention_enabled` and `pref_uninstall_prevention_enabled` (leaving Device Admin `super_uninstall_protection` intact if enabled). |
| [`p000/jd2.java`](./p000/jd2.java) | `CountryDetector`: queries `ipwho.is`, `freeipapi.com`, `db-ip.com`, and `ipinfo.io` to detect user country. |
| [`p000/C0957w6.java`](./p000/C0957w6.java) | Contains the 7-service Public IP walker (`ipify`, `myip`, `checkip.amazonaws`, `ip.sb`, `icanhazip`, `ipecho`, `ipinfo`) and clipboard copy logic. |
| [`p000/C1061z.java`](./p000/C1061z.java) | Caches and coordinates public IP resolution. |
| [`p000/tk2.java`](./p000/tk2.java) | Executes `DailyStatusTask` and dispatches the 62-field daily status snapshot to PostHog (`$set`) and `AnalyticsEvent.DailyStatusEvent.Snapshot` (fanned out to Firebase, Meta, and PostHog; Firebase/Meta enforce a 25-parameter-per-event SDK cap while self-hosted PostHog receives all 62). |
| [`p000/rp9.java`](./p000/rp9.java) | Builds the **62-field** daily device configuration, permission, prayer silence, and per-app block counter map (`line 789` / `line 840`). |
