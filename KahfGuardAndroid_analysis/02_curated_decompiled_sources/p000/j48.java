package p000;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class j48 extends s1c implements jm4 {

    /* renamed from: A */
    public /* synthetic */ Object f19634A;

    /* renamed from: B */
    public final /* synthetic */ m48 f19635B;

    /* renamed from: u */
    public final /* synthetic */ byte f19636u;

    /* renamed from: v */
    public yw2 f19637v;

    /* renamed from: w */
    public xw2 f19638w;

    /* renamed from: x */
    public Object f19639x;

    /* renamed from: y */
    public Object f19640y;

    /* renamed from: z */
    public byte f19641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j48(m48 m48Var, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f19636u = b;
        this.f19635B = m48Var;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        switch (this.f19636u) {
            case 0:
                j48 j48Var = new j48(this.f19635B, xa2Var, (byte) 0);
                j48Var.f19634A = obj;
                return j48Var;
            default:
                j48 j48Var2 = new j48(this.f19635B, xa2Var, (byte) 1);
                j48Var2.f19634A = obj;
                return j48Var2;
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19636u;
        txc txcVar = txc.f41359a;
        pc2 pc2Var = (pc2) obj;
        xa2 xa2Var = (xa2) obj2;
        switch (b) {
        }
        return ((j48) create(pc2Var, xa2Var)).invokeSuspend(txcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yw2 m11698d;
        xw2 m11698d2;
        Object m22386q;
        Object m22386q2;
        Object obj2;
        Object obj3;
        yw2 m11698d3;
        xw2 m11698d4;
        Object m22386q3;
        Object m22386q4;
        Object obj4;
        Object obj5;
        byte b = this.f19636u;
        qc2 qc2Var = qc2.f34309u;
        m48 m48Var = this.f19635B;
        byte b2 = 1;
        byte b3 = 2;
        byte b4 = 3;
        xa2 xa2Var = null;
        switch (b) {
            case 0:
                pc2 pc2Var = (pc2) this.f19634A;
                byte b5 = this.f19641z;
                if (b5 == 0) {
                    v11.m20244z(obj);
                    yw2 m11698d5 = jzd.m11698d(pc2Var, null, new i48(m48Var, xa2Var, (byte) 0), 3);
                    m11698d = jzd.m11698d(pc2Var, null, new i48(m48Var, xa2Var, b3), 3);
                    m11698d2 = jzd.m11698d(pc2Var, null, new i48(m48Var, xa2Var, b2), 3);
                    this.f19634A = null;
                    this.f19637v = m11698d;
                    this.f19638w = m11698d2;
                    this.f19641z = (byte) 1;
                    obj = m11698d5.m21148w(this);
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (b5 != 1) {
                        if (b5 != 2) {
                            if (b5 != 3) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj3 = this.f19640y;
                            obj2 = this.f19639x;
                            v11.m20244z(obj);
                            return new nrc(obj2, obj3, obj);
                        }
                        Object obj6 = this.f19639x;
                        xw2 xw2Var = this.f19638w;
                        v11.m20244z(obj);
                        m22386q = obj;
                        obj = obj6;
                        m11698d2 = xw2Var;
                        this.f19634A = null;
                        this.f19637v = null;
                        this.f19638w = null;
                        this.f19639x = obj;
                        this.f19640y = m22386q;
                        this.f19641z = (byte) 3;
                        m22386q2 = m11698d2.m22386q(this);
                        if (m22386q2 != qc2Var) {
                            return qc2Var;
                        }
                        Object obj7 = obj;
                        obj = m22386q2;
                        obj2 = obj7;
                        obj3 = m22386q;
                        return new nrc(obj2, obj3, obj);
                    }
                    m11698d2 = this.f19638w;
                    m11698d = this.f19637v;
                    v11.m20244z(obj);
                }
                this.f19634A = null;
                this.f19637v = null;
                this.f19638w = m11698d2;
                this.f19639x = obj;
                this.f19641z = (byte) 2;
                m22386q = m11698d.m22386q(this);
                if (m22386q == qc2Var) {
                    return qc2Var;
                }
                this.f19634A = null;
                this.f19637v = null;
                this.f19638w = null;
                this.f19639x = obj;
                this.f19640y = m22386q;
                this.f19641z = (byte) 3;
                m22386q2 = m11698d2.m22386q(this);
                if (m22386q2 != qc2Var) {
                }
            default:
                pc2 pc2Var2 = (pc2) this.f19634A;
                byte b6 = this.f19641z;
                if (b6 == 0) {
                    v11.m20244z(obj);
                    yw2 m11698d6 = jzd.m11698d(pc2Var2, null, new i48(m48Var, xa2Var, (byte) 4), 3);
                    m11698d3 = jzd.m11698d(pc2Var2, null, new i48(m48Var, xa2Var, (byte) 5), 3);
                    m11698d4 = jzd.m11698d(pc2Var2, null, new i48(m48Var, xa2Var, b4), 3);
                    this.f19634A = null;
                    this.f19637v = m11698d3;
                    this.f19638w = m11698d4;
                    this.f19641z = (byte) 1;
                    obj = m11698d6.m21148w(this);
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (b6 != 1) {
                        if (b6 != 2) {
                            if (b6 != 3) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj5 = this.f19640y;
                            obj4 = this.f19639x;
                            v11.m20244z(obj);
                            return new nrc(obj4, obj5, obj);
                        }
                        Object obj8 = this.f19639x;
                        xw2 xw2Var2 = this.f19638w;
                        v11.m20244z(obj);
                        m22386q3 = obj;
                        obj = obj8;
                        m11698d4 = xw2Var2;
                        this.f19634A = null;
                        this.f19637v = null;
                        this.f19638w = null;
                        this.f19639x = obj;
                        this.f19640y = m22386q3;
                        this.f19641z = (byte) 3;
                        m22386q4 = m11698d4.m22386q(this);
                        if (m22386q4 != qc2Var) {
                            return qc2Var;
                        }
                        Object obj9 = obj;
                        obj = m22386q4;
                        obj4 = obj9;
                        obj5 = m22386q3;
                        return new nrc(obj4, obj5, obj);
                    }
                    m11698d4 = this.f19638w;
                    m11698d3 = this.f19637v;
                    v11.m20244z(obj);
                }
                this.f19634A = null;
                this.f19637v = null;
                this.f19638w = m11698d4;
                this.f19639x = obj;
                this.f19641z = (byte) 2;
                m22386q3 = m11698d3.m22386q(this);
                if (m22386q3 == qc2Var) {
                    return qc2Var;
                }
                this.f19634A = null;
                this.f19637v = null;
                this.f19638w = null;
                this.f19639x = obj;
                this.f19640y = m22386q3;
                this.f19641z = (byte) 3;
                m22386q4 = m11698d4.m22386q(this);
                if (m22386q4 != qc2Var) {
                }
        }
    }
}
