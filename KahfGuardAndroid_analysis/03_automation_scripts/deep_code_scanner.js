const fs = require("fs");
const path = require("path");

const srcRoot = "kahf_audit_workspace/02_decompiled_jadx/sources";

function walk(dir, list = []) {
  for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) walk(full, list);
    else if (entry.name.endsWith(".java")) list.push(full);
  }
  return list;
}

const files = walk(srcRoot);
const results = {
  siteVisitsUpload: [],
  ipGeolocationFiles: [],
  dnsEngineFiles: [],
  graphqlOperations: [],
  dynamicCodeAndCrypto: [],
  facebookSdkCalls: [],
  posthogSessionReplayFiles: []
};

for (const f of files) {
  const rel = path.relative(srcRoot, f).replace(/\\/g, "/");
  const content = fs.readFileSync(f, "utf8");

  if (content.includes("Site visits not uploaded") || content.includes("site_visit")) {
    results.siteVisitsUpload.push(rel);
  }
  if (content.includes("api.db-ip.com") || content.includes("Aborting public IP walk") || content.includes("ipinfo.io")) {
    results.ipGeolocationFiles.push(rel);
  }
  if (content.includes("getPrivateDnsServerName") || content.includes("DnsSafetyManager") || content.includes("DNS_SYNC") || content.includes("DNS_WATCH") || content.includes("DNS_REPORT")) {
    results.dnsEngineFiles.push(rel);
  }
  const gqlMatch = content.match(/"(?:mutation|query)\s+[A-Za-z0-9_]+[^"]*"/g);
  if (gqlMatch) {
    results.graphqlOperations.push({ file: rel, operations: gqlMatch });
  }
  for (const kw of ["DexClassLoader", "InMemoryDexClassLoader", "DelegateLastClassLoader", "System.loadLibrary", "System.load(", "Runtime.getRuntime().exec", "ProcessBuilder", "X509TrustManager", "KeyChain.createInstallIntent"]) {
    if (content.includes(kw)) {
      results.dynamicCodeAndCrypto.push({ file: rel, keyword: kw });
    }
  }
  if (content.includes("PostHogReplayIntegration") || content.includes("sessionReplay")) {
    results.posthogSessionReplayFiles.push(rel);
  }
}

fs.writeFileSync("kahf_audit_workspace/05_evidence_dumps/deep_code_scan.json", JSON.stringify(results, null, 2));
console.log(JSON.stringify(results, null, 2));
