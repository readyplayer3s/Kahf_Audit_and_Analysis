# APK Acquisition & Chain of Custody Provenance

## Acquisition Hardware & Method
- **Application Name:** Kahf Guard (`com.kahf.dns`)
- **Version:** `4.6.287` (`versionCode: 361`)
- **Git Revision (from `res/values/strings.xml`):** `2a1ed43f12fd4fcaaa0f5662eccfc3287f73d5b1`
- **Source Store:** Official Google Play Store
- **Test Device:** OnePlus Nord CE5 (ARM64-v8a, XXHDPI density, English locale)
- **Extraction Method:** Unmodified split APK bundle pulled directly from the physical device over USB Debugging via Android Debug Bridge (`adb`):
  ```powershell
  adb shell pm path com.kahf.dns
  adb pull /data/app/.../base.apk
  adb pull /data/app/.../split_config.arm64_v8a.apk
  adb pull /data/app/.../split_config.en.apk
  adb pull /data/app/.../split_config.xxhdpi.apk
  ```

## Cryptographic Verification (SHA-256)

Anyone can verify that these APK files are unmodified and signed by the original developer certificate:

| File | Size (Bytes) | SHA-256 Digest |
| :--- | :--- | :--- |
| [`base.apk`](./base.apk) | `31,006,367` | `B338D08B7661F3A22E47C95E951E611213F43DD42389041DB0C0291F029CF402` |
| [`split_config.arm64_v8a.apk`](./split_config.arm64_v8a.apk) | `1,806,815` | `C185CC3B04EAC9FAFE320A2737282CEF57ADFDDE83A9C47E9D926F41F770BD97` |
| [`split_config.en.apk`](./split_config.en.apk) | `45,266` | `19624EFACCD975CDEF21B51E71DA6B8AA8AEB2412B4730CD500D2A9DE0759FF2` |
| [`split_config.xxhdpi.apk`](./split_config.xxhdpi.apk) | `65,514` | `A690650765B1871EE228E365B98EB8719EEBE6DBAF6B740886BAB6CA24EA8522` |

### Verify Hashes Locally
**PowerShell (Windows):**
```powershell
Get-FileHash .\*.apk -Algorithm SHA256
```
**Bash (Linux / macOS):**
```bash
sha256sum *.apk
```

### Reproduce Decompilation Locally
```bash
# 1. Unpack resources and AndroidManifest.xml with Apktool
apktool d base.apk -o unpacked_base

# 2. Decompile DEX bytecode to Java/Kotlin sources with JADX
jadx --show-bad-code --deobf --deobf-min 3 --deobf-use-sourcename -d decompiled_jadx base.apk
```
