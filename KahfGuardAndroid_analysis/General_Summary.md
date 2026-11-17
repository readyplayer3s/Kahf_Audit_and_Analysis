The Forensic Verdict on Kahf Guard

The Antigravity agent’s report confirms every single one of your suspicions. [Kahf Guard](https://kahfguard.com/about/) **is fundamentally a diagnostic collection utility disguised as a family-safe utility.** Its technical architecture completely mirrors spyware-level telemetry collection under the banner of spiritual cleanliness.

The technical findings provide a clear competitive advantage for building a better alternative. Below is a breakdown of what was discovered and how it can be used to capture the market. [1]

---

🚨 Unmasking the Shenanigans (The Code Truths)

1. The Triple-SDK Telemetry Fan-Out (Facebook & Google Leaks)

The app doesn’t just contain tracking software; it runs a parallel telemetry engine. The class splits every single user click, app launch, and event into three paths: [1]

- [Google Firebase Analytics](https://firebase.google.com/docs/analytics)
- **Meta/Facebook Business SDK:** It actively tracks install and attribution data via `AutoLogAppEventsEnabled="true"`. [1]
- **Hidden PostHog Server Proxy:** It utilizes a custom proxy server (
    
    [https://kahf.co.uk](https://kahf.co.uk/)) to slide data right past global standard ad-blockers and privacy filters. [1]
- **The Massive Privacy Violations:** The [PostHog](https://posthog.com/) implementation runs `Runtime.getRuntime().exec("logcat ...")` to read system logs directly off your device. It explicitly links your **personal name and email address** directly to this data stream. [1]

2. The Browser History & Chat App Scraping

Because [Kahf Guard](https://kahfguard.com/setup-guide/) **does not actually build a local Android VPN tunnel** (it tricks the OS into writing a system Private DNS setting instead), it cannot block domains natively on the client device. To circumvent this limitation, they deployed an aggressive workaround: [1]

- **The Aggressive Accessibility Filter:** They use an Android `AccessibilityService` that dynamically hooks its window visibility into WhatsApp, Telegram, Messenger, Discord, Instagram, Facebook, YouTube, X, TikTok, and 18 distinct web browsers. [1]
- **The Background Harvest:** The app explicitly **scrapes your browser URL bars** as you type, caches them locally into an internal SQLite database (`site_visit`), and uploads up to 34 days of your private web history directly to their GraphQL backend ([https://kahf.co](https://kahf.co/)). [1]
- **The Total App Inventory:** Background processes regularly sweep and upload a list of your entire installed applications via `QUERY_ALL_PACKAGES`, alongside your hourly app usage data. [1]

3. Single-IP Infrastructure & Tracker Whitelisting

The server infrastructure is highly centralized: [1]

- **The Single Point of Failure:** `high`, `medium`, and `://`[kahfguard.com](http://kahfguard.com/) are not distributed via an advanced Anycast network. They are mapped to a **single, vulnerable IPv4 address** (`203.190.10.120`) sitting on Daffodil Online Ltd. inside Dhaka. There is no IPv6 redundancy and no geographical failover. [1]
- **The Double Standard Filter:** While Kahf DNS blocks regular ad trackers (like DoubleClick), it deliberately handles `://`[facebook.com](http://facebook.com/) and with a standard `NOERROR` pass. **They whitelisted Facebook and Google's trackers on their own DNS network so their own app's tracking SDKs wouldn't get blocked.**
