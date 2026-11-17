package p000;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class tzc implements vv7 {

    /* renamed from: c */
    public static final js6 f41441c;

    /* renamed from: a */
    public final String f41442a;

    /* renamed from: b */
    public final String f41443b;

    static {
        vzc vzcVar = vzc.f45451u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f41441c = new js6(vzcVar, (byte) 1);
        uzc.f43489a.getClass();
    }

    public tzc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f41442a = str;
        this.f41443b = str2;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f41441c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "ff36f06d44eaf8c740a393fdec25133b56b514203c987b8febef60833ffddcb6";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDeviceDnsSettingsMutation($deviceId: ID!, $dnsUrl: String!) { updateDeviceDnsSettings(deviceId: $deviceId, dnsUrl: $dnsUrl) { success dnsSettings { dnsUrl lastSyncTime } error } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("deviceId");
        p2b p2bVar = AbstractC0849t9.f39935a;
        p2bVar.mo25j(bd6Var, pi2Var, this.f41442a);
        bd6Var.mo1905F0("dnsUrl");
        p2bVar.mo25j(bd6Var, pi2Var, this.f41443b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzc)) {
            return false;
        }
        tzc tzcVar = (tzc) obj;
        return zy5.m23838d(this.f41442a, tzcVar.f41442a) && zy5.m23838d(this.f41443b, tzcVar.f41443b);
    }

    public final int hashCode() {
        return this.f41443b.hashCode() + (this.f41442a.hashCode() * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDeviceDnsSettingsMutation";
    }

    public final String toString() {
        return tz6.m19212m("UpdateDeviceDnsSettingsMutation(deviceId=", this.f41442a, ", dnsUrl=", this.f41443b, ")");
    }
}
