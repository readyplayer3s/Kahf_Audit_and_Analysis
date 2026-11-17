package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class a0d implements vv7 {

    /* renamed from: c */
    public static final js6 f38c;

    /* renamed from: a */
    public final String f39a;

    /* renamed from: b */
    public final ArrayList f40b;

    static {
        c0d c0dVar = c0d.f4241u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f38c = new js6(c0dVar, (byte) 1);
        b0d.f2423a.getClass();
    }

    public a0d(String str, ArrayList arrayList) {
        str.getClass();
        this.f39a = str;
        this.f40b = arrayList;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f38c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "726bd0852fef2e44ba29627c303f4e83351e235fd698e8fc1982996458eeb68e";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDeviceInstalledApps($deviceId: ID!, $apps: [InstalledAppInput!]!) { updateDeviceInstalledApps(deviceId: $deviceId, apps: $apps) { success message error } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("deviceId");
        AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, this.f39a);
        bd6Var.mo1905F0("apps");
        bd6Var.mo1911l();
        Iterator it = this.f40b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            bd6Var.mo1909i();
            rv5 rv5Var = (rv5) next;
            rv5Var.getClass();
            bd6Var.mo1905F0("packageName");
            p2b p2bVar = AbstractC0849t9.f39935a;
            p2bVar.mo25j(bd6Var, pi2Var, rv5Var.f37331a);
            bd6Var.mo1905F0("appName");
            p2bVar.mo25j(bd6Var, pi2Var, rv5Var.f37332b);
            xa7 xa7Var = rv5Var.f37333c;
            if (xa7Var instanceof ak8) {
                bd6Var.mo1905F0("isSystemApp");
                AbstractC0849t9.m18688a(AbstractC0849t9.f39942h).mo25j(bd6Var, pi2Var, (ak8) xa7Var);
            }
            bd6Var.mo1908f();
        }
        bd6Var.mo1910j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0d)) {
            return false;
        }
        a0d a0dVar = (a0d) obj;
        return zy5.m23838d(this.f39a, a0dVar.f39a) && this.f40b.equals(a0dVar.f40b);
    }

    public final int hashCode() {
        return this.f40b.hashCode() + (this.f39a.hashCode() * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDeviceInstalledApps";
    }

    public final String toString() {
        return "UpdateDeviceInstalledAppsMutation(deviceId=" + this.f39a + ", apps=" + this.f40b + ")";
    }
}
