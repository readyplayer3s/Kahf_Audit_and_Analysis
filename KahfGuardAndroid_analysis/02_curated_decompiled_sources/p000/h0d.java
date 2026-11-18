package p000;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class h0d implements vv7 {

    /* renamed from: c */
    public static final js6 f15281c;

    /* renamed from: a */
    public final String f15282a;

    /* renamed from: b */
    public final ak8 f15283b;

    static {
        j0d j0dVar = j0d.f19377u;
        p2b p2bVar = AbstractC0849t9.f39935a;
        f15281c = new js6(j0dVar, (byte) 1);
        i0d.f17216a.getClass();
    }

    public h0d(String str, ak8 ak8Var) {
        str.getClass();
        this.f15282a = str;
        this.f15283b = ak8Var;
    }

    @Override // p000.oj8
    /* renamed from: a */
    public final js6 mo13a() {
        return f15281c;
    }

    @Override // p000.oj8
    /* renamed from: b */
    public final String mo14b() {
        return "1e374984718218ca2e5720162639c6dd18152aab0f16ce7e910386de6492efc8";
    }

    @Override // p000.oj8
    /* renamed from: c */
    public final String mo15c() {
        return "mutation UpdateDeviceMetadataMutation($id: ID!, $metadata: [NameValueInput!]) { updateDevice(id: $id, metadata: $metadata) { id deviceName uniqueDeviceId metadata { name value } } }";
    }

    @Override // p000.oj8
    /* renamed from: d */
    public final void mo16d(bd6 bd6Var, pi2 pi2Var) {
        pi2Var.getClass();
        bd6Var.mo1905F0("id");
        AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, this.f15282a);
        bd6Var.mo1905F0("metadata");
        js6 js6Var = new js6(new js6(u03.f41461A, (byte) 1), (byte) 0);
        Object obj = this.f15283b.f1241g;
        if (obj == null) {
            bd6Var.mo1902A0();
        } else {
            js6Var.mo25j(bd6Var, pi2Var, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0d)) {
            return false;
        }
        h0d h0dVar = (h0d) obj;
        return zy5.m23838d(this.f15282a, h0dVar.f15282a) && this.f15283b.equals(h0dVar.f15283b);
    }

    public final int hashCode() {
        return this.f15283b.hashCode() + (this.f15282a.hashCode() * 31);
    }

    @Override // p000.oj8
    public final String name() {
        return "UpdateDeviceMetadataMutation";
    }

    public final String toString() {
        return "UpdateDeviceMetadataMutation(id=" + this.f15282a + ", metadata=" + this.f15283b + ")";
    }
}
