const fs = require("fs");
const path = require("path");
const crypto = require("crypto");

const baseDir = "kahf_audit_workspace/01_unpacked_apktool/base_raw";
const armDir = "kahf_audit_workspace/01_unpacked_apktool/split_arm64_raw";

// 1. Read all *.properties in root
const rootFiles = fs.readdirSync(baseDir);
const properties = {};
for (const f of rootFiles.filter(x => x.endsWith(".properties"))) {
  properties[f] = fs.readFileSync(path.join(baseDir, f), "utf8").trim();
}

// 2. Read all META-INF/*.version
const metaInfDir = path.join(baseDir, "META-INF");
const versions = {};
if (fs.existsSync(metaInfDir)) {
  for (const f of fs.readdirSync(metaInfDir).filter(x => x.endsWith(".version"))) {
    versions[f.replace(".version", "")] = fs.readFileSync(path.join(metaInfDir, f), "utf8").trim();
  }
}

// 3. Scan all files in base_raw and split_arm64_raw for certs, dbs, and non-image assets
function walk(dir, fileList = []) {
  for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) walk(full, fileList);
    else fileList.push(full);
  }
  return fileList;
}

const allBaseFiles = walk(baseDir);
const specialExts = [".cer", ".crt", ".pem", ".der", ".p12", ".pfx", ".bks", ".jks", ".keystore", ".sqlite", ".db", ".dat", ".bin", ".txt", ".json", ".pro", ".html", ".cvr", ".prof", ".list", ".proto"];
const specialAssets = [];

for (const f of allBaseFiles) {
  const rel = path.relative(baseDir, f).replace(/\\/g, "/");
  const ext = path.extname(f).toLowerCase();
  const isAssetNoExt = rel.startsWith("assets/") && !ext;
  if (specialExts.includes(ext) || isAssetNoExt) {
    const buf = fs.readFileSync(f);
    const sha256 = crypto.createHash("sha256").update(buf).digest("hex").toUpperCase();
    specialAssets.push({
      path: rel,
      sizeBytes: buf.length,
      sha256,
      previewHex: buf.subarray(0, 16).toString("hex"),
      previewText: buf.subarray(0, 120).toString("utf8").replace(/[^\x20-\x7E]/g, ".")
    });
  }
}

// 4. Native .so libraries in split_config.arm64_v8a.apk
const soDir = path.join(armDir, "lib", "arm64-v8a");
const nativeLibs = [];
if (fs.existsSync(soDir)) {
  for (const f of fs.readdirSync(soDir)) {
    const full = path.join(soDir, f);
    const buf = fs.readFileSync(full);
    const sha256 = crypto.createHash("sha256").update(buf).digest("hex").toUpperCase();
    // Extract printable strings >= 6 chars matching JNI / version / library identifiers
    const strMatches = buf.toString("latin1").match(/[A-Za-z0-9_./:-]{6,}/g) || [];
    const jniSymbols = strMatches.filter(s => s.startsWith("Java_") || s.includes("JNI_OnLoad"));
    const interestingStrings = strMatches.filter(s =>
      /sqlite|pairip|androidx|datastore|version|clang|rust|go1\.|google|kahf|http|dns/i.test(s)
    ).slice(0, 40);
    nativeLibs.push({
      fileName: f,
      sizeBytes: buf.length,
      sha256,
      jniSymbols,
      interestingStrings
    });
  }
}

const report = {
  sdkProperties: properties,
  androidxAndLibVersions: versions,
  nativeLibraries: nativeLibs,
  specialAssets
};

fs.writeFileSync("kahf_audit_workspace/05_evidence_dumps/assets_and_libs_audit.json", JSON.stringify(report, null, 2));
console.log("SDK properties:", Object.keys(properties).length);
console.log("Native libraries:", nativeLibs.map(n => `${n.fileName} (${n.sizeBytes}B, JNI: ${n.jniSymbols.length})`));
console.log("Special assets count:", specialAssets.length);
