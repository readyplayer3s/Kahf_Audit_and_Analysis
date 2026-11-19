# Plain-Language Summary — Kahf Guard Android (`v4.6.287`) Audit (v2.1)

> **v2.0 → v2.1 Correction Notice:** The initial v1.0 version of this summary contained confirmation-biased framing (describing Kahf Guard as "spyware" and overstating PostHog, Accessibility, and DNS findings). It was rewritten in `v2.0` and refined in `v2.1` after a follow-up DEX bytecode cross-check to reflect **strictly verified bytecode and multi-region DNS facts**.

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
Even when **logged out**, `sxc.java` hashes `ANDROID_ID` + 7 `Build.*` hardware properties into a non-resettable `PRD<12-hex>` ID (backed up to `files/device_data/device_id.dat`). On app launch, this ID is sent to PostHog (`KahfGuardApp` → `ab9.m348e`), attached to every GraphQL request (`AuthInterceptor` `X-Device-Id`), and—when Play Services is present—passed by `MainActivity.m5528t` (`MainActivity.java:604`) to Firebase and **Meta's `AnalyticsUserIDStore.setUserID`**, which Meta's SDK sends as **`"app_user_id"`**. Resetting Android's Advertising ID (GAID) does **not** reset this fingerprint, and it is not disclosed in Kahf's Privacy Policy (which claims *"Only aggregated, anonymized data"* is sent to external services). In addition, DNS diagnostic/fail-open events (`DiagnosticRun`, `DnsSafetyDisable`) fan out the user's **public IP** to all three analytics SDKs.

### 3. Installed App List & Usage Sync Applies to Adult Accounts Too
Kahf's Privacy Policy states: *"On Child Device, we get the App List & Screen-time for Parents to see."* In code, `InstalledAppsSyncWorker` (`l74.java:230-241`) has **zero `isChildDevice()` check**, and `AppUsageSyncWorker` (`Lx00`) only checks `isChildDevice()` on the Kahf-ROM `"kahf_cadence"` branch—bypassing it completely on the standard 6-hour periodic schedule for all logged-in accounts (adult or child). Any **logged-in account (adult or child)** automatically syncs its complete installed app inventory (via manifest `QUERY_ALL_PACKAGES`, no runtime permission required) and installed VPN apps to `https://id.kahf.co/graphql`. If a logged-in adult grants `Usage Access` to view their own screen time, hourly app usage also uploads to the server on the standard 6-hour schedule.

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
