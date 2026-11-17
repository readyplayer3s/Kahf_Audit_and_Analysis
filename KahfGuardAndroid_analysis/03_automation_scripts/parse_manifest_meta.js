const fs = require("fs");
const crypto = require("crypto");
const path = require("path");

const buf = fs.readFileSync("kahf_audit_workspace/03_cross_platform_extracts/AndroidManifest.xml");

const stringChunkOffset = 8;
const stringCount = buf.readUInt32LE(stringChunkOffset + 8);
const flags = buf.readUInt32LE(stringChunkOffset + 16);
const stringsStart = stringChunkOffset + buf.readUInt32LE(stringChunkOffset + 20);
const isUTF8 = (flags & 0x100) !== 0;
const strings = [];

for (let i = 0; i < stringCount; i++) {
  const relOff = buf.readUInt32LE(stringChunkOffset + 28 + i * 4);
  const absOff = stringsStart + relOff;
  if (isUTF8) {
    let p = absOff;
    let charLen = buf[p++];
    if (charLen & 0x80) p++;
    let byteLen = buf[p++];
    if (byteLen & 0x80) byteLen = ((byteLen & 0x7f) << 8) | buf[p++];
    strings.push(buf.toString("utf8", p, p + byteLen));
  } else {
    let charLen = buf.readUInt16LE(absOff);
    strings.push(buf.toString("utf16le", absOff + 2, absOff + 2 + charLen * 2));
  }
}

let pos = 8;
const manifestMeta = {};
while (pos < buf.length) {
  const type = buf.readUInt16LE(pos);
  const chunkSize = buf.readUInt32LE(pos + 4);
  if (chunkSize === 0) break;
  if (type === 0x0102) {
    const nameIdx = buf.readInt32LE(pos + 20);
    const attrStart = buf.readUInt16LE(pos + 24);
    const attrSize = buf.readUInt16LE(pos + 26);
    const attrCount = buf.readUInt16LE(pos + 28);
    const elName = strings[nameIdx];
    if (elName === "manifest" || elName === "uses-sdk" || elName === "application") {
      const attrs = {};
      let apos = pos + 16 + attrStart;
      for (let a = 0; a < attrCount; a++) {
        const aNameIdx = buf.readInt32LE(apos + 4);
        const aName = aNameIdx >= 0 ? strings[aNameIdx] : `attr_${a}`;
        const aRawVal = buf.readInt32LE(apos + 8);
        const aData = buf.readInt32LE(apos + 16);
        attrs[aName] = aRawVal >= 0 ? strings[aRawVal] : aData;
        apos += attrSize;
      }
      manifestMeta[elName] = attrs;
    }
  }
  pos += chunkSize;
}

const apksDir = "kahf_audit_workspace/00_raw_artifacts/apks";
const files = fs.readdirSync(apksDir).filter(f => f.endsWith(".apk"));
const apkArtifacts = files.map(f => {
  const fullPath = path.join(apksDir, f);
  const stat = fs.statSync(fullPath);
  const fileBuf = fs.readFileSync(fullPath);
  const sha256 = crypto.createHash("sha256").update(fileBuf).digest("hex").toUpperCase();
  return {
    fileName: f,
    sizeBytes: stat.size,
    sha256
  };
});

const output = {
  packageName: manifestMeta.manifest?.package,
  versionCode: manifestMeta.manifest?.versionCode,
  versionName: manifestMeta.manifest?.versionName,
  compileSdkVersion: manifestMeta.manifest?.compileSdkVersion,
  minSdkVersion: manifestMeta["uses-sdk"]?.minSdkVersion,
  targetSdkVersion: manifestMeta["uses-sdk"]?.targetSdkVersion,
  applicationClass: manifestMeta.application?.name,
  extractNativeLibs: manifestMeta.application?.extractNativeLibs,
  usesCleartextTraffic: manifestMeta.application?.usesCleartextTraffic,
  networkSecurityConfigResId: manifestMeta.application?.networkSecurityConfig,
  apks: apkArtifacts
};

fs.writeFileSync(
  "kahf_audit_workspace/00_raw_artifacts/artifact_hashes.json",
  JSON.stringify(output, null, 2)
);
console.log(JSON.stringify(output, null, 2));
