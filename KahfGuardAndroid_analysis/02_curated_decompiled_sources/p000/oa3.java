package p000;

import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class oa3 {

    /* renamed from: a */
    public final boolean f29942a;

    /* renamed from: b */
    public final boolean f29943b;

    /* renamed from: c */
    public final String f29944c;

    /* renamed from: d */
    public final boolean f29945d;

    /* renamed from: e */
    public final boolean f29946e;

    /* renamed from: f */
    public final long f29947f;

    /* renamed from: g */
    public final boolean f29948g;

    /* renamed from: h */
    public final long f29949h;

    /* renamed from: i */
    public final boolean f29950i;

    /* renamed from: j */
    public final String f29951j;

    /* renamed from: k */
    public final String f29952k;

    /* renamed from: l */
    public final boolean f29953l;

    /* renamed from: m */
    public final String f29954m;

    /* renamed from: n */
    public final boolean f29955n;

    /* renamed from: o */
    public final boolean f29956o;

    /* renamed from: p */
    public final String f29957p;

    /* renamed from: q */
    public final String f29958q;

    /* renamed from: r */
    public final long f29959r;

    /* renamed from: s */
    public final long f29960s;

    /* renamed from: t */
    public final int f29961t;

    /* renamed from: u */
    public final String f29962u;

    /* renamed from: v */
    public final String f29963v;

    /* renamed from: w */
    public final String f29964w;

    public oa3(boolean z, boolean z2, String str, boolean z3, boolean z4, long j, boolean z5, long j2, boolean z6, String str2, String str3, boolean z7, String str4, boolean z8, boolean z9, String str5, String str6, long j3, long j4, int i, String str7, String str8, String str9) {
        tz6.m19222w(str, str5, str6);
        this.f29942a = z;
        this.f29943b = z2;
        this.f29944c = str;
        this.f29945d = z3;
        this.f29946e = z4;
        this.f29947f = j;
        this.f29948g = z5;
        this.f29949h = j2;
        this.f29950i = z6;
        this.f29951j = str2;
        this.f29952k = str3;
        this.f29953l = z7;
        this.f29954m = str4;
        this.f29955n = z8;
        this.f29956o = z9;
        this.f29957p = str5;
        this.f29958q = str6;
        this.f29959r = j3;
        this.f29960s = j4;
        this.f29961t = i;
        this.f29962u = str7;
        this.f29963v = str8;
        this.f29964w = str9;
    }

    /* renamed from: a */
    public final Map m14890a() {
        return o97.m14870G(new vq8("is_network_connected", Boolean.valueOf(this.f29942a)), new vq8("has_internet_capability", Boolean.valueOf(this.f29943b)), new vq8("connection_type", this.f29944c), new vq8("is_vpn_active", Boolean.valueOf(this.f29945d)), new vq8("has_direct_internet", Boolean.valueOf(this.f29946e)), new vq8("direct_internet_check_ms", Long.valueOf(this.f29947f)), new vq8("can_resolve_dns", Boolean.valueOf(this.f29948g)), new vq8("dns_resolution_time_ms", Long.valueOf(this.f29949h)), new vq8("is_kahf_dns_working", Boolean.valueOf(this.f29950i)), new vq8("google_resolved_ip", this.f29951j), new vq8("safe_search_resolved_ip", this.f29952k), new vq8("is_safe_search_enforced", Boolean.valueOf(this.f29953l)), new vq8("canary_domain", "thequran.com"), new vq8("canary_resolved_ip", this.f29954m), new vq8("is_canary_blocked", Boolean.valueOf(this.f29955n)), new vq8("has_private_dns_issue", Boolean.valueOf(this.f29956o)), new vq8("diagnostic_status", this.f29957p), new vq8("status_description", this.f29958q), new vq8("timestamp", Long.valueOf(this.f29959r)), new vq8("total_check_duration_ms", Long.valueOf(this.f29960s)), new vq8("android_api_level", Integer.valueOf(this.f29961t)), new vq8("device_model", this.f29962u), new vq8("android_version", this.f29963v), new vq8("error_message", this.f29964w));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa3)) {
            return false;
        }
        oa3 oa3Var = (oa3) obj;
        return this.f29942a == oa3Var.f29942a && this.f29943b == oa3Var.f29943b && zy5.m23838d(this.f29944c, oa3Var.f29944c) && this.f29945d == oa3Var.f29945d && this.f29946e == oa3Var.f29946e && this.f29947f == oa3Var.f29947f && this.f29948g == oa3Var.f29948g && this.f29949h == oa3Var.f29949h && this.f29950i == oa3Var.f29950i && zy5.m23838d(this.f29951j, oa3Var.f29951j) && zy5.m23838d(this.f29952k, oa3Var.f29952k) && this.f29953l == oa3Var.f29953l && zy5.m23838d(this.f29954m, oa3Var.f29954m) && this.f29955n == oa3Var.f29955n && this.f29956o == oa3Var.f29956o && zy5.m23838d(this.f29957p, oa3Var.f29957p) && zy5.m23838d(this.f29958q, oa3Var.f29958q) && this.f29959r == oa3Var.f29959r && this.f29960s == oa3Var.f29960s && this.f29961t == oa3Var.f29961t && this.f29962u.equals(oa3Var.f29962u) && this.f29963v.equals(oa3Var.f29963v) && zy5.m23838d(this.f29964w, oa3Var.f29964w);
    }

    public final int hashCode() {
        int m18682f = t8c.m18682f(tz6.m19202c(t8c.m18682f(tz6.m19202c(t8c.m18682f(t8c.m18682f(t8c.m18683g(t8c.m18682f(Boolean.hashCode(this.f29942a) * 31, 31, this.f29943b), this.f29944c, 31), 31, this.f29945d), 31, this.f29946e), 31, this.f29947f), 31, this.f29948g), 31, this.f29949h), 31, this.f29950i);
        String str = this.f29951j;
        int hashCode = (m18682f + (str == null ? 0 : str.hashCode())) * 31;
        int hashCode2 = (((Boolean.hashCode(this.f29953l) + ((hashCode + (this.f29952k == null ? 0 : r3.hashCode())) * 31)) * 31) - 2135905475) * 31;
        String str2 = this.f29954m;
        int m18683g = t8c.m18683g(t8c.m18683g(pr1.m15965A(this.f29961t, tz6.m19202c(tz6.m19202c(t8c.m18683g(t8c.m18683g(t8c.m18682f(t8c.m18682f((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f29955n), 31, this.f29956o), this.f29957p, 31), this.f29958q, 31), 31, this.f29959r), 31, this.f29960s), 31), this.f29962u, 31), this.f29963v, 31);
        String str3 = this.f29964w;
        return m18683g + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m19220u = tz6.m19220u("DnsDiagnosticResult(isNetworkConnected=", this.f29942a, ", hasInternetCapability=", this.f29943b, ", connectionType=");
        m19220u.append(this.f29944c);
        m19220u.append(", isVpnActive=");
        m19220u.append(this.f29945d);
        m19220u.append(", hasDirectInternet=");
        m19220u.append(this.f29946e);
        m19220u.append(", directInternetCheckMs=");
        m19220u.append(this.f29947f);
        m19220u.append(", canResolveDns=");
        m19220u.append(this.f29948g);
        m19220u.append(", dnsResolutionTimeMs=");
        m19220u.append(this.f29949h);
        m19220u.append(", isKahfDnsWorking=");
        m19220u.append(this.f29950i);
        pr1.m15992z(m19220u, ", googleResolvedIp=", this.f29951j, ", safeSearchResolvedIp=", this.f29952k);
        m19220u.append(", isSafeSearchEnforced=");
        m19220u.append(this.f29953l);
        m19220u.append(", canaryDomain=thequran.com, canaryResolvedIp=");
        m19220u.append(this.f29954m);
        m19220u.append(", isCanaryBlocked=");
        m19220u.append(this.f29955n);
        m19220u.append(", hasPrivateDnsIssue=");
        m19220u.append(this.f29956o);
        pr1.m15992z(m19220u, ", diagnosticStatus=", this.f29957p, ", statusDescription=", this.f29958q);
        tz6.m19224y(m19220u, ", timestamp=", this.f29959r, ", totalCheckDurationMs=");
        m19220u.append(this.f29960s);
        m19220u.append(", androidApiLevel=");
        m19220u.append(this.f29961t);
        pr1.m15992z(m19220u, ", deviceModel=", this.f29962u, ", androidVersion=", this.f29963v);
        return tz6.m19214o(m19220u, ", errorMessage=", this.f29964w, ")");
    }
}
