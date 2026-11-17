package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class mzc implements vv7 {

    /* renamed from: c */
    public static final js6 f27360c;

    /* renamed from: a */
    public final String f27361a;

    /* renamed from: b */
    public final ArrayList f27362b;

    static {
        ozc ozcVar = ozc.f31567u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f27360c = new js6(ozcVar, (byte) 1);
        nzc.f29265a.getClass();
    }

    public mzc(String str, ArrayList arrayList) {
        str.getClass();
        this.f27361a = str;
        this.f27362b = arrayList;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f27360c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "0f9b759643d2d302f130204d8388a6911e6c77142478e73db3fc6ebb7e056059";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDeviceAppUsage($deviceId: ID!, $entries: [AppUsageEntryInput!]!) { updateDeviceAppUsage(deviceId: $deviceId, entries: $entries) { success message error } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("deviceId");
        AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, this.f27361a);
        bd6Var.mo1905F0("entries");
        l14 l14Var = l14.f23414B;
        bd6Var.mo1911l();
        Iterator it = this.f27362b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            bd6Var.mo1909i();
            l14Var.mo25j(bd6Var, pi2Var, next);
            bd6Var.mo1908f();
        }
        bd6Var.mo1910j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzc)) {
            return false;
        }
        mzc mzcVar = (mzc) obj;
        return zy5.m23838d(this.f27361a, mzcVar.f27361a) && this.f27362b.equals(mzcVar.f27362b);
    }

    public final int hashCode() {
        return this.f27362b.hashCode() + (this.f27361a.hashCode() * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDeviceAppUsage";
    }

    public final String toString() {
        return "UpdateDeviceAppUsageMutation(deviceId=" + this.f27361a + ", entries=" + this.f27362b + ")";
    }
}
