package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class y0d implements vv7 {

    /* renamed from: c */
    public static final js6 f49456c;

    /* renamed from: a */
    public final String f49457a;

    /* renamed from: b */
    public final ArrayList f49458b;

    static {
        a1d a1dVar = a1d.f113u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f49456c = new js6(a1dVar, (byte) 1);
        z0d.f51577a.getClass();
    }

    public y0d(String str, ArrayList arrayList) {
        str.getClass();
        this.f49457a = str;
        this.f49458b = arrayList;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f49456c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "cdc74920f9f2e94ddbd9226740ae09b2938416535016db78517ba9bcc1980c67";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDeviceSiteVisits($deviceId: ID!, $days: [SiteVisitDayInput!]!) { updateDeviceSiteVisits(deviceId: $deviceId, days: $days) { success message error } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("deviceId");
        AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, this.f49457a);
        bd6Var.mo1905F0("days");
        c7d c7dVar = c7d.f4580B;
        bd6Var.mo1911l();
        Iterator it = this.f49458b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            bd6Var.mo1909i();
            c7dVar.mo25j(bd6Var, pi2Var, next);
            bd6Var.mo1908f();
        }
        bd6Var.mo1910j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0d)) {
            return false;
        }
        y0d y0dVar = (y0d) obj;
        return zy5.m23838d(this.f49457a, y0dVar.f49457a) && this.f49458b.equals(y0dVar.f49458b);
    }

    public final int hashCode() {
        return this.f49458b.hashCode() + (this.f49457a.hashCode() * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDeviceSiteVisits";
    }

    public final String toString() {
        return "UpdateDeviceSiteVisitsMutation(deviceId=" + this.f49457a + ", days=" + this.f49458b + ")";
    }
}
