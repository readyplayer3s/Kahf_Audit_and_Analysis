# Plain-Language Summary — Kahf Guard Android (`v4.6.287`) Audit (v2.1.4)

> **v2.0 → v2.1.4 Correction Notice:** The initial v1.0 version of this summary contained confirmation-biased framing (describing Kahf Guard as "spyware" and overstating PostHog, Accessibility, and DNS findings). It was rewritten in `v2.0` and refined through `v2.1.4` after follow-up DEX bytecode and Privacy Policy cross-checks to reflect **strictly verified bytecode, Privacy Policy, and multi-region DNS facts**.  
> **Audit Scope:** Findings come from static DEX/APK analysis of `com.kahf.dns` `v4.6.287` plus live client-side DNS/DoT/DoH queries (no live app runtime MITM captures).

---

## What Kahf Guard Is *Not* (Cleared / Corrected)
- **Not classic spyware:** Static analysis found **no** custom root CA certificate / TLS MitM, **no** local VPN packet interception, and **no** remote dynamic code loading (`DexClassLoader`).
- **No screen recording or `logcat` upload:** Although `posthog-android` bundles replay/logcat classes, raw DEX bytecode confirms Session Replay is compiled-off (`false`) in `v4.6.287` (cannot be enabled remotely without an app update), touch hooks only reset the session idle timer, and `logcat` drops all output.
- **No chat-message exfiltration:** `Risky Word Block` defaults to `false`; when enabled, it scans on-screen text **locally in RAM** and only increments local block counters.
- **Opt-in parental controls:** `Browsing Reports` (domain names only, never full URLs/searches), `Risky Word Block`, `DNS Change Prevention`, and `Uninstall Prevention` all default to `false`.
- **Self-hosted PostHog & GeoDNS:** `p.kahf.co.uk` is Kahf's own self-hosted PostHog instance (not PostHog Cloud). `kahfguard.com` uses ClouDNS GeoDNS (3 Hetzner IPv4s for EU/US, plus a Dhaka BDIX IPv4 + IPv6 node for BD/SE Asia), not a single global IP.

---

## Verified Privacy & Security Concerns That *Do* Stand

### 1. Mandatory Triple-SDK Telemetry & Zero Opt-Out
Every in-app event, screen view, and a **62-field daily device/protection snapshot** (`rp9.java`) is fanned out simultaneously (`qu1.java`) to **Google Firebase**, **Meta/Facebook Business SDK** (`AutoLogAppEventsEnabled=true`, `AdvertiserIDCollectionEnabled=true`), and Kahf's self-hosted **PostHog** (`p.kahf.co.uk`). *(Note: Firebase Analytics and Meta App Events enforce a 25-parameter-per-event cap and truncate/drop excess fields on the 62-field snapshot, whereas self-hosted PostHog receives all 62 fields.)* There is **no in-app opt-out toggle**; Kahf's Privacy Policy states the only way to stop collection is to uninstall the app.

### 2. Undisclosed Persistent Hardware Fingerprint (`PRD<12-hex>`) Sent to Meta
Even when **logged out**, `sxc.java` hashes `ANDROID_ID` + 7 `Build.*` hardware properties into a non-resettable `PRD<12-hex>` ID (backed up to `files/device_data/device_id.dat`), sets it on PostHog (`KahfGuardApp` → `ab9.m348e`), and attaches it to every GraphQL request (`AuthInterceptor` `X-Device-Id`). Statically in raw DEX, `l74` (case 2, no login check) → `C0391gv` → `MainActivity.m5528t` (`MainActivity.java:604`) passes `PRD<12-hex>` (when Play Services is present) to Firebase and **Meta's `AnalyticsUserIDStore.setUserID`** (`Lce;->b`, also called by `ry3.setUserId`), which Meta's SDK sends as **`"app_user_id"`** *(note: `MainActivity.onCreate` and `KahfGuardApp.onCreate` are PairIP-virtualized, so confirming exact logged-out first-launch wire traffic requires dynamic/MITM capture; see Report 01 Section 3.1)*. Resetting Android's Advertising ID (GAID) does **not** reset this fingerprint. Kahf's Privacy Policy claims Meta only collects *"standard SDK auto-events"* and *"Only aggregated, anonymized data"*, omitting both this persistent `app_user_id` and Kahf's custom app events, screen views, subscription properties (`user_properties_updated`), and opt-in `MindfulPauseEvent` (`pref_mindful_pause_enabled`, default `false`; `AnalyticsEvent.java:8992-9236`, sending monitored third-party `package_name`, `opens_in_window`, `daily_limit`, and/or `duration_seconds` via `qu1` → `ry3` to Meta & Firebase when enabled). Additionally, while Kahf's Policy discloses *seeing* the user's IP itself, it does **not** disclose forwarding `last_known_ip` (param #4 in both `DiagnosticRun` `AnalyticsEvent.java:6880` and `PostDnsSetDiagnosticEvent.Check` `AnalyticsEvent.java:9807`) or `current_ip` (in 8-param `DnsSafetyDisable`, `C0890ud.java:238,257`) to **third-party analytics SDKs (Meta & Firebase)** — all three of which survive Firebase's and Meta's 25-parameter SDK cap.

### 3. Installed App List & Usage Sync Applies to Adult Accounts Too
Kahf's Privacy Policy has two separate bullets: a general bullet (*"The amount of time spent on the other Apps"*) and a child-specific bullet (*"On Child Device, we get the App List & Screen-time for Parents to see"*). Although App List is **only** disclosed under *"On Child Device"*, `InstalledAppsSyncWorker` (`l74.java:230-241`) has **zero `isChildDevice()` check** — any **logged-in account (adult or child)** automatically syncs **all launchable user-installed apps plus 161 curated system/preinstalled packages** (`C0639nl.java:47-52`, via manifest `QUERY_ALL_PACKAGES`, no runtime permission required) and installed VPN apps (excluding 10 MDM/enterprise/Kahf Browser packages) to `https://id.kahf.co/graphql`. For screen time, while mentioned generally in the Policy, `AppUsageSyncWorker` (`Lx00`) only checks `isChildDevice()` on the Kahf-ROM `"kahf_cadence"` branch and bypasses it on the standard 6-hour periodic schedule — so logged-in adults who grant `Usage Access` also upload hourly app usage to `id.kahf.co/graphql`.

### 4. DNS Filtering Nuances & Fail-Open Parental Control Bypass
- **YouTube Comments:** `high.kahfguard.com` rewrites `www.youtube.com` to `216.239.38.120` (`restrict.youtube.com`), disabling YouTube comments globally.
- **Tracker Policy:** While allowing `graph.facebook.com` matches Cloudflare Family and AdGuard Family, Kahf DNS also allows `app-measurement.com` (Google Firebase), which AdGuard Family blocks.
- **Regional SPOF (Bangladesh):** While EU/US traffic balances across 3 Hetzner IPv4s, Bangladesh/SE Asia traffic routes to a single BDIX IPv4 (`203.190.10.120`) and IPv6 (`2400:fa40:400:1::120`).
- **DNS Fail-Open Bypass:** Opening the Protection screen (`wo9.java`) while `1.1.1.1:443` works but Kahf DoT (port `853`) is blocked triggers `nb3` → `nm9`, automatically disabling Accessibility-based `DNS Change Prevention` and `Uninstall Prevention` with no PIN or cooldown (though Device Admin `Super Uninstall Protection` remains active if separately enabled).

---

## Full Technical Reports
1. [01 — Executive Privacy, Tracker & Telemetry Forensic Audit](./05_reports/01_Executive_Privacy_and_Telemetry_Audit.md)
2. [02 — VpnService Absence, System Private DNS & AccessibilityService Deep Dive](./05_reports/02_VpnService_and_Accessibility_Deep_Dive.md)
3. [03 — DNS Infrastructure, Wire-Format Filtering Diff & Failproof Analysis](./05_reports/03_DNS_Infrastructure_and_Failproof_Analysis.md)
