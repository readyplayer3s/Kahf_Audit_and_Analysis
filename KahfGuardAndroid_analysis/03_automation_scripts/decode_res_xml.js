const fs = require("fs");
const path = require("path");

const ATTR_MAP = {
  0x01010001: "label",
  0x01010002: "icon",
  0x01010003: "name",
  0x01010020: "description",
  0x01010025: "resource",
  0x01010225: "settingsActivity",
  0x01010380: "accessibilityEventTypes",
  0x01010381: "packageNames",
  0x01010382: "accessibilityFeedbackType",
  0x01010383: "notificationTimeout",
  0x01010384: "accessibilityFlags",
  0x01010385: "canRetrieveWindowContent",
  0x010103d8: "canRequestTouchExplorationMode",
  0x010103d9: "canRequestEnhancedWebAccessibility",
  0x010103db: "canRequestFilterKeyEvents",
  0x010104bc: "canControlMagnification",
  0x010104bd: "canPerformGestures",
  0x0101054d: "summary"
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
      let charLen = buf[p++]; if (charLen & 0x80) p++;
      let byteLen = buf[p++]; if (byteLen & 0x80) byteLen = ((byteLen & 0x7f) << 8) | buf[p++];
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
    for (let o = pos + 8; o < pos + resMapSize; o += 4) resIds.push(buf.readUInt32LE(o));
    pos += resMapSize;
  }
  const root = { tag: "root", children: [] };
  const stack = [root];
  while (pos < buf.length) {
    const type = buf.readUInt16LE(pos);
    const chunkSize = buf.readUInt32LE(pos + 4);
    if (chunkSize === 0) break;
    if (type === 0x0102) {
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
          aName = ATTR_MAP[resIds[aNameIdx]] || `attr_0x${resIds[aNameIdx].toString(16)}`;
        }
        let val = aRawVal >= 0 ? strings[aRawVal] : (aType === 0x12 ? aData !== 0 : `0x${aData.toString(16)}`);
        attrs[aName] = val;
        apos += attrSize;
      }
      const node = { tag: elName, attrs, children: [] };
      stack[stack.length - 1].children.push(node);
      stack.push(node);
    } else if (type === 0x0103) {
      if (stack.length > 1) stack.pop();
    }
    pos += chunkSize;
  }
  return root.children[0];
}

const xmlDir = "kahf_audit_workspace/03_cross_platform_extracts/base_extracted/res/xml";
const out = {};
for (const f of ["accessibility_service_config.xml", "device_admin_policies.xml", "data_extraction_rules.xml", "shortcuts.xml"]) {
  out[f] = decodeAXML(fs.readFileSync(path.join(xmlDir, f)));
}
fs.writeFileSync("kahf_audit_workspace/05_evidence_dumps/res_xml_audit.json", JSON.stringify(out, null, 2));
console.log(JSON.stringify(out, null, 2));
