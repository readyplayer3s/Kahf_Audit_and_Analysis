package p000;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class i48 extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f17439u;

    /* renamed from: v */
    public boolean f17440v;

    /* renamed from: w */
    public final /* synthetic */ m48 f17441w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i48(m48 m48Var, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f17439u = b;
        this.f17441w = m48Var;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        switch (this.f17439u) {
            case 0:
                return new i48(this.f17441w, xa2Var, (byte) 0);
            case 1:
                return new i48(this.f17441w, xa2Var, (byte) 1);
            case 2:
                return new i48(this.f17441w, xa2Var, (byte) 2);
            case 3:
                return new i48(this.f17441w, xa2Var, (byte) 3);
            case 4:
                return new i48(this.f17441w, xa2Var, (byte) 4);
            case 5:
                return new i48(this.f17441w, xa2Var, (byte) 5);
            default:
                return new i48(this.f17441w, xa2Var, (byte) 6);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17439u;
        txc txcVar = txc.f41359a;
        pc2 pc2Var = (pc2) obj;
        xa2 xa2Var = (xa2) obj2;
        switch (b) {
        }
        return ((i48) create(pc2Var, xa2Var)).invokeSuspend(txcVar);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        byte b = this.f17439u;
        m48 m48Var = this.f17441w;
        qc2 qc2Var = qc2.f34309u;
        switch (b) {
            case 0:
                boolean z = this.f17440v;
                if (!z) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13148n = m48Var.m13148n("high.kahfguard.com", this);
                    if (m13148n == qc2Var) {
                        break;
                    }
                } else if (!z) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.f17440v;
                if (!z2) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13148n2 = m48Var.m13148n("low.kahfguard.com", this);
                    if (m13148n2 == qc2Var) {
                        break;
                    }
                } else if (!z2) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            case 2:
                boolean z3 = this.f17440v;
                if (!z3) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13148n3 = m48Var.m13148n("medium.kahfguard.com", this);
                    if (m13148n3 == qc2Var) {
                        break;
                    }
                } else if (!z3) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            case 3:
                boolean z4 = this.f17440v;
                if (!z4) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13147m = m48Var.m13147m("thequran.com", this);
                    if (m13147m == qc2Var) {
                        break;
                    }
                } else if (!z4) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            case 4:
                boolean z5 = this.f17440v;
                if (!z5) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13147m2 = m48Var.m13147m("www.google.com", this);
                    if (m13147m2 == qc2Var) {
                        break;
                    }
                } else if (!z5) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            case 5:
                boolean z6 = this.f17440v;
                if (!z6) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    Object m13147m3 = m48Var.m13147m("forcesafesearch.google.com", this);
                    if (m13147m3 == qc2Var) {
                        break;
                    }
                } else if (!z6) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
            default:
                boolean z7 = this.f17440v;
                if (!z7) {
                    v11.m20244z(obj);
                    this.f17440v = true;
                    m48Var.getClass();
                    vu2 vu2Var = k83.f21845a;
                    Object m11694F = jzd.m11694F(dt2.f8706v, new C0717pp(2, null, (byte) 11), this);
                    if (m11694F == qc2Var) {
                        break;
                    }
                } else if (!z7) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    v11.m20244z(obj);
                    break;
                }
                break;
        }
        return qc2Var;
    }
}
