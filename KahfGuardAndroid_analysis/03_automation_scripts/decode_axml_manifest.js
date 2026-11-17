const fs = require("fs");

const ANDROID_ATTR_MAP = {
  0x01010000: "theme",
  0x01010001: "label",
  0x01010002: "icon",
  0x01010003: "name",
  0x01010006: "permission",
  0x01010009: "protectionLevel",
  0x0101000e: "enabled",
  0x01010010: "exported",
  0x01010012: "process",
  0x01010016: "authorities",
  0x01010017: "syncable",
  0x01010018: "initOrder",
  0x0101001a: "grantUriPermissions",
  0x0101001c: "priority",
  0x0101001d: "launchMode",
  0x0101001e: "screenOrientation",
  0x0101001f: "configChanges",
  0x01010020: "description",
  0x01010024: "value",
  0x01010025: "resource",
  0x01010027: "mimeType",
  0x01010028: "scheme",
  0x01010029: "host",
  0x0101002a: "port",
  0x0101002b: "path",
  0x0101002c: "pathPrefix",
  0x0101002d: "pathPattern",
  0x0101020c: "minSdkVersion",
  0x0101021b: "versionCode",
  0x0101021c: "versionName",
  0x01010270: "targetSdkVersion",
  0x01010280: "allowBackup",
  0x010103a6: "supportsRtl",
  0x010104ec: "extractNativeLibs",
  0x01010505: "directBootAware",
  0x01010527: "roundIcon",
  0x0101052c: "networkSecurityConfig",
  0x01010540: "appComponentFactory",
  0x0101054c: "usesCleartextTraffic",
  0x01010572: "compileSdkVersion",
  0x01010573: "compileSdkVersionCodename",
  0x01010599: "foregroundServiceType"
};

function decodeAXML(buf) {
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

  const stringChunkSize = buf.readUInt32LE(12);
  let pos = 8 + stringChunkSize;
  const resIds = [];
  if (buf.readUInt16LE(pos) === 0x0180) {
    const resMapSize = buf.readUInt32LE(pos + 4);
    for (let o = pos + 8; o < pos + resMapSize; o += 4) {
      resIds.push(buf.readUInt32LE(o));
    }
    pos += resMapSize;
  }

  const root = { tag: "root", attrs: {}, children: [] };
  const stack = [root];

  while (pos < buf.length) {
    const type = buf.readUInt16LE(pos);
    const chunkSize = buf.readUInt32LE(pos + 4);
    if (chunkSize === 0) break;

    if (type === 0x0102) { // START_ELEMENT
      const nameIdx = buf.readInt32LE(pos + 20);
      const attrStart = buf.readUInt16LE(pos + 24);
      const attrSize = buf.readUInt16LE(pos + 26);
      const attrCount = buf.readUInt16LE(pos + 28);
      const elName = strings[nameIdx] || `tag_${nameIdx}`;
      const attrs = {};
      let apos = pos + 16 + attrStart;
      for (let a = 0; a < attrCount; a++) {
        const aNameIdx = buf.readInt32LE(apos + 4);
        const aRawVal = buf.readInt32LE(apos + 8);
        const aType = buf.readUInt8(apos + 15);
        const aData = buf.readUInt32LE(apos + 16);
        let aName = aNameIdx >= 0 ? strings[aNameIdx] : "";
        if (!aName && aNameIdx >= 0 && aNameIdx < resIds.length) {
          aName = ANDROID_ATTR_MAP[resIds[aNameIdx]] || `attr_0x${resIds[aNameIdx].toString(16)}`;
        }
        let val;
        if (aRawVal >= 0) {
          val = strings[aRawVal];
        } else if (aType === 0x12) { // TYPE_INT_BOOLEAN
          val = aData !== 0;
        } else if (aType === 0x01) { // TYPE_REFERENCE
          val = `@0x${aData.toString(16)}`;
        } else if (aType === 0x11) { // TYPE_INT_HEX
          val = `0x${aData.toString(16)}`;
        } else {
          val = aData;
        }
        attrs[aName] = val;
        apos += attrSize;
      }
      const node = { tag: elName, attrs, children: [] };
      stack[stack.length - 1].children.push(node);
      stack.push(node);
    } else if (type === 0x0103) { // END_ELEMENT
      if (stack.length > 1) stack.pop();
    }
    pos += chunkSize;
  }

  return root.children[0];
}

const buf = fs.readFileSync("kahf_audit_workspace/03_cross_platform_extracts/AndroidManifest.xml");
const manifestTree = decodeAXML(buf);

// Extract structured audit sections
const usesPermissions = manifestTree.children.filter(c => c.tag.startsWith("uses-permission")).map(c => ({
  tag: c.tag,
  ...c.attrs
}));

const permissions = manifestTree.children.filter(c => c.tag === "permission").map(c => c.attrs);
const queries = manifestTree.children.filter(c => c.tag === "queries");

const appNode = manifestTree.children.find(c => c.tag === "application") || { attrs: {}, children: [] };
const extractComponents = (tagName) =>
  appNode.children.filter(c => c.tag === tagName).map(c => ({
    ...c.attrs,
    intentFilters: c.children.filter(ch => ch.tag === "intent-filter").map(inf => ({
      ...inf.attrs,
      actions: inf.children.filter(x => x.tag === "action").map(x => x.attrs.name),
      categories: inf.children.filter(x => x.tag === "category").map(x => x.attrs.name),
      data: inf.children.filter(x => x.tag === "data").map(x => x.attrs)
    })),
    metaData: c.children.filter(ch => ch.tag === "meta-data").map(m => m.attrs)
  }));

const auditReport = {
  manifestAttrs: manifestTree.attrs,
  usesSdk: manifestTree.children.find(c => c.tag === "uses-sdk")?.attrs,
  applicationAttrs: appNode.attrs,
  usesPermissions,
  customPermissions: permissions,
  queries,
  applicationMetaData: appNode.children.filter(c => c.tag === "meta-data").map(c => c.attrs),
  providers: extractComponents("provider"),
  services: extractComponents("service"),
  receivers: extractComponents("receiver"),
  activities: extractComponents("activity")
};

fs.writeFileSync("kahf_audit_workspace/05_evidence_dumps/manifest_audit.json", JSON.stringify(auditReport, null, 2));
console.log("Permissions count:", usesPermissions.length);
console.log("Providers count:", auditReport.providers.length);
console.log("Services count:", auditReport.services.length);
console.log("Receivers count:", auditReport.receivers.length);
console.log("App Meta-Data count:", auditReport.applicationMetaData.length);
