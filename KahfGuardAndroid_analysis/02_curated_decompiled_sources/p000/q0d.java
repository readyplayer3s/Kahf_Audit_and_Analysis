package p000;

import java.util.List;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class q0d implements vv7 {

    /* renamed from: c */
    public static final js6 f33646c;

    /* renamed from: a */
    public final ak8 f33647a;

    /* renamed from: b */
    public final List f33648b;

    static {
        s0d s0dVar = s0d.f37626u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f33646c = new js6(s0dVar, (byte) 1);
        r0d.f35802a.getClass();
    }

    public q0d(ak8 ak8Var, ls6 ls6Var) {
        ls6Var.getClass();
        this.f33647a = ak8Var;
        this.f33648b = ls6Var;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f33646c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "5990bac36aeeadec3e68ff437b867b57cb6ec0ab8b06d7fb70459b38ce05bc72";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDevicePermissionStatusMutation($deviceId: ID, $uniqueDeviceId: String, $permissions: [PermissionInfoInput!]!) { updateDevicePermissionStatus(deviceId: $deviceId, uniqueDeviceId: $uniqueDeviceId, permissions: $permissions) { success error permissionStatus { deviceId uniqueDeviceId permissions { type status isRequired description } lastUpdated } } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("deviceId");
        AbstractC0849t9.m18688a(AbstractC0849t9.f39940f).mo25j(bd6Var, pi2Var, this.f33647a);
        bd6Var.mo1905F0("permissions");
        bd6Var.mo1911l();
        for (Object obj : this.f33648b) {
            bd6Var.mo1909i();
            nz8 nz8Var = (nz8) obj;
            nz8Var.getClass();
            ak8 ak8Var = nz8Var.f29244d;
            bd6Var.mo1905F0("type");
            bd6Var.mo1906K(nz8Var.f29241a.f45441u);
            bd6Var.mo1905F0("status");
            bd6Var.mo1906K(nz8Var.f29242b.f25379u);
            ak8 ak8Var2 = nz8Var.f29243c;
            bd6Var.mo1905F0("isRequired");
            AbstractC0849t9.m18688a(AbstractC0849t9.f39942h).mo25j(bd6Var, pi2Var, ak8Var2);
            bd6Var.mo1905F0("description");
            AbstractC0849t9.m18688a(AbstractC0849t9.f39940f).mo25j(bd6Var, pi2Var, ak8Var);
            bd6Var.mo1908f();
        }
        bd6Var.mo1910j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0d)) {
            return false;
        }
        q0d q0dVar = (q0d) obj;
        if (!this.f33647a.equals(q0dVar.f33647a)) {
            return false;
        }
        zj8 zj8Var = zj8.f52554g;
        return zj8Var.equals(zj8Var) && this.f33648b.equals(q0dVar.f33648b);
    }

    public final int hashCode() {
        return this.f33648b.hashCode() + (((this.f33647a.hashCode() * 31) - 813336043) * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDevicePermissionStatusMutation";
    }

    public final String toString() {
        return "UpdateDevicePermissionStatusMutation(deviceId=" + this.f33647a + ", uniqueDeviceId=" + zj8.f52554g + ", permissions=" + this.f33648b + ")";
    }
}
