package p000;

import com.github.mikephil.charting.charts.Chart;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: ud */
/* loaded from: classes2.dex */
public final class C0890ud extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f42155u;

    /* renamed from: v */
    public byte f42156v;

    /* renamed from: w */
    public Object f42157w;

    /* renamed from: x */
    public final /* synthetic */ Object f42158x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0890ud(jn2 jn2Var, kh7 kh7Var, bl9 bl9Var, xa2 xa2Var) {
        super(2, xa2Var);
        this.f42155u = (byte) 7;
        this.f42157w = jn2Var;
        this.f42158x = kh7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r1.m18202e(r2, r3, r4, r5, r6) != r10) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:11:0x0034, B:13:0x003e, B:19:0x004e, B:27:0x0029), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:9:0x001a). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m19547j(Object obj) {
        pc2 pc2Var;
        pc2 pc2Var2;
        C0890ud c0890ud;
        sr7 sr7Var = (sr7) this.f42158x;
        byte b = this.f42156v;
        qc2 qc2Var = qc2.f34309u;
        try {
            if (b == 0) {
                v11.m20244z(obj);
                pc2Var = (pc2) this.f42157w;
                if (nld.m14316v(pc2Var.getCoroutineContext())) {
                }
            } else if (b == 1) {
                pc2Var2 = (pc2) this.f42157w;
                v11.m20244z(obj);
                nr7 nr7Var = (nr7) obj;
                float mo8114l0 = sr7Var.f47694c.mo8114l0(6.0f);
                float mo8114l02 = sr7Var.f47694c.mo8114l0(1.0f);
                bxa bxaVar = sr7Var.f47692a;
                this.f42157w = pc2Var2;
                this.f42156v = (byte) 2;
                c0890ud = this;
            } else {
                if (b != 2) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pc2Var2 = (pc2) this.f42157w;
                v11.m20244z(obj);
                c0890ud = this;
                pc2Var = pc2Var2;
                this = c0890ud;
                if (nld.m14316v(pc2Var.getCoroutineContext())) {
                    sr7Var.f39026h = null;
                    return txc.f41359a;
                }
                h11 h11Var = sr7Var.f39025g;
                this.f42157w = pc2Var;
                this.f42156v = (byte) 1;
                Object mo9073j = h11Var.mo9073j(this);
                if (mo9073j == qc2Var) {
                    return qc2Var;
                }
                pc2Var2 = pc2Var;
                obj = mo9073j;
                nr7 nr7Var2 = (nr7) obj;
                float mo8114l03 = sr7Var.f47694c.mo8114l0(6.0f);
                float mo8114l022 = sr7Var.f47694c.mo8114l0(1.0f);
                bxa bxaVar2 = sr7Var.f47692a;
                this.f42157w = pc2Var2;
                this.f42156v = (byte) 2;
                c0890ud = this;
            }
        } catch (Throwable th) {
            sr7Var.f39026h = null;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r9 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r9 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (p000.df7.m6222O((p000.n76) r9, r8) == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r9 == r7) goto L39;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m19548k(Object obj) {
        ova ovaVar = (ova) this.f42157w;
        byte b = this.f42156v;
        qc2 qc2Var = qc2.f34309u;
        if (b == 0) {
            v11.m20244z(obj);
            if (!ovaVar.mo1502a0()) {
                throw new z16("Await is not allowed in current context", null, null, 14);
            }
            kx3 kx3Var = (kx3) this.f42158x;
            this.f42157w = ovaVar;
            this.f42156v = (byte) 1;
            obj = kx3Var.m12362l(ovaVar, this);
        } else {
            if (b != 1) {
                if (b == 2) {
                    v11.m20244z(obj);
                    obj.getClass();
                    throw ((Throwable) obj);
                }
                if (b == 3) {
                    v11.m20244z(obj);
                    return (g86) obj;
                }
                if (b == 4) {
                    v11.m20244z(obj);
                    return wwc.f47276u;
                }
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
        }
        g86 g86Var = (g86) obj;
        Object mo6992e = g86Var != null ? g86Var.mo6992e(ovaVar) : null;
        if (!(mo6992e instanceof n76)) {
            j56 m1506i = av7.m1403v(ovaVar).m1506i();
            g86 m11894n = k97.m11894n(mo6992e + " is not a Promise");
            wf8 wf8Var = d76.f7491a;
            vab vabVar = new vab(m11894n);
            this.f42157w = null;
            this.f42156v = (byte) 2;
            obj = b26.m1590s0(m1506i, vabVar, ovaVar, this);
        } else if (mo6992e instanceof xw2) {
            this.f42157w = null;
            this.f42156v = (byte) 3;
            obj = ((xw2) mo6992e).m22386q(this);
        } else {
            this.f42157w = null;
            this.f42156v = (byte) 4;
        }
        return qc2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:9:0x0020, B:15:0x0031, B:16:0x008a, B:20:0x0035, B:21:0x0074, B:24:0x007a, B:28:0x0039, B:29:0x0060, B:31:0x0068, B:34:0x003d, B:35:0x0054, B:39:0x0044), top: B:2:0x0014 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m19549l(Object obj) {
        String str;
        Object m14126d;
        String str2;
        wo9 wo9Var = (wo9) this.f42158x;
        d48 d48Var = wo9Var.f46887H;
        h82 h82Var = wo9Var.f46927v;
        byte b = this.f42156v;
        txc txcVar = txc.f41359a;
        qc2 qc2Var = qc2.f34309u;
        try {
            if (b == 0) {
                v11.m20244z(obj);
                this.f42156v = (byte) 1;
                Object m14128f = h82Var.f15677n.m14128f(this);
                if (m14128f != qc2Var) {
                    m14128f = txcVar;
                }
                if (m14128f == qc2Var) {
                }
            } else if (b == 1) {
                v11.m20244z(obj);
            } else {
                if (b == 2) {
                    v11.m20244z(obj);
                    if (((Boolean) obj).booleanValue()) {
                        yj2 yj2Var = wo9Var.f46886G;
                        this.f42156v = (byte) 3;
                        obj = yj2Var.m22881g(this);
                        if (obj == qc2Var) {
                        }
                        str = (String) obj;
                        if (str == null) {
                        }
                        this.f42157w = str;
                        this.f42156v = (byte) 4;
                        m14126d = h82Var.f15677n.m14126d(this);
                        if (m14126d == qc2Var) {
                        }
                    }
                }
                if (b != 3) {
                    if (b != 4) {
                        if (b == 5) {
                            v11.m20244z(obj);
                            return txcVar;
                        }
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.f42157w;
                    v11.m20244z(obj);
                    Map m14870G = o97.m14870G(new vq8("current_dns", str2), new vq8("current_ip", (String) obj), new vq8("is_connected", Boolean.valueOf(((m48) d48Var).m13146k())), new vq8("has_internet_capability", Boolean.valueOf(((m48) d48Var).m13143h())), new vq8("is_vpn", Boolean.valueOf(((m48) d48Var).m13144i())));
                    vu2 vu2Var = k83.f21845a;
                    n75 n75Var = h57.f15547a;
                    nm9 nm9Var = new nm9(wo9Var, m14870G, null);
                    this.f42157w = null;
                    this.f42156v = (byte) 5;
                    return jzd.m11694F(n75Var, nm9Var, this) != qc2Var ? qc2Var : txcVar;
                }
                v11.m20244z(obj);
                str = (String) obj;
                if (str == null) {
                    str = "unknown";
                }
                this.f42157w = str;
                this.f42156v = (byte) 4;
                m14126d = h82Var.f15677n.m14126d(this);
                if (m14126d == qc2Var) {
                    str2 = str;
                    obj = m14126d;
                    Map m14870G2 = o97.m14870G(new vq8("current_dns", str2), new vq8("current_ip", (String) obj), new vq8("is_connected", Boolean.valueOf(((m48) d48Var).m13146k())), new vq8("has_internet_capability", Boolean.valueOf(((m48) d48Var).m13143h())), new vq8("is_vpn", Boolean.valueOf(((m48) d48Var).m13144i())));
                    vu2 vu2Var2 = k83.f21845a;
                    n75 n75Var2 = h57.f15547a;
                    nm9 nm9Var2 = new nm9(wo9Var, m14870G2, null);
                    this.f42157w = null;
                    this.f42156v = (byte) 5;
                    if (jzd.m11694F(n75Var2, nm9Var2, this) != qc2Var) {
                    }
                }
            }
            this.f42156v = (byte) 2;
            obj = h82Var.f15677n.m14124a(this);
            if (obj == qc2Var) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sj8.m18114z("Error during DNS safety check: ", e.getMessage(), ly6.f25312y, "ProtectionControlVM", null);
            return txcVar;
        }
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f42155u;
        Object obj2 = this.f42158x;
        switch (b) {
            case 0:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 0);
            case 1:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 1);
            case 2:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 2);
            case 3:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 3);
            case 4:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 4);
            case 5:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 5);
            case 6:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 6);
            case 7:
                return new C0890ud((jn2) this.f42157w, (kh7) obj2, (bl9) null, xa2Var);
            case 8:
                C0890ud c0890ud = new C0890ud((ay3) obj2, xa2Var, (byte) 8);
                c0890ud.f42157w = obj;
                return c0890ud;
            case 9:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 9);
            case 10:
                return new C0890ud((lp5) obj2, xa2Var, (byte) 10);
            case 11:
                return new C0890ud((yq7) obj2, xa2Var, (byte) 11);
            case 12:
                C0890ud c0890ud2 = new C0890ud((sr7) obj2, xa2Var, (byte) 12);
                c0890ud2.f42157w = obj;
                return c0890ud2;
            case 13:
                C0890ud c0890ud3 = new C0890ud((tg8) obj2, xa2Var, (byte) 13);
                c0890ud3.f42157w = obj;
                return c0890ud3;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                C0890ud c0890ud4 = new C0890ud((kx3) obj2, xa2Var, (byte) 14);
                c0890ud4.f42157w = obj;
                return c0890ud4;
            case ba7.f2964h /* 15 */:
                return new C0890ud((wo9) obj2, xa2Var, (byte) 15);
            case 16:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 16);
            default:
                return new C0890ud(this.f42157w, obj2, xa2Var, (byte) 17);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42155u;
        qc2 qc2Var = qc2.f34309u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 3:
                ((C0890ud) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                break;
            case 6:
                ((C0890ud) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                break;
        }
        return ((C0890ud) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:291:0x08a1 -> B:284:0x0848). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0890ud.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0890ud(Object obj, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f42155u = b;
        this.f42158x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0890ud(Object obj, Object obj2, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f42155u = b;
        this.f42157w = obj;
        this.f42158x = obj2;
    }
}
