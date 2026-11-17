package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: z */
/* loaded from: classes2.dex */
public final class C1061z extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f51516u;

    /* renamed from: v */
    public byte f51517v;

    /* renamed from: w */
    public long f51518w;

    /* renamed from: x */
    public Object f51519x;

    /* renamed from: y */
    public Object f51520y;

    /* renamed from: z */
    public final /* synthetic */ Object f51521z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1061z(o6c o6cVar, long j, s6c s6cVar, n6c n6cVar, xa2 xa2Var) {
        super(2, xa2Var);
        this.f51516u = (byte) 3;
        this.f51519x = o6cVar;
        this.f51518w = j;
        this.f51520y = s6cVar;
        this.f51521z = n6cVar;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f51516u;
        Object obj2 = this.f51521z;
        switch (b) {
            case 0:
                return new C1061z((byte) 0, this.f51518w, xa2Var, this.f51520y, obj2);
            case 1:
                return new C1061z((byte) 1, this.f51518w, xa2Var, this.f51520y, obj2);
            case 2:
                return new C1061z((m48) obj2, xa2Var);
            case 3:
                return new C1061z((o6c) this.f51519x, this.f51518w, (s6c) this.f51520y, (n6c) obj2, xa2Var);
            case 4:
                return new C1061z((byte) 4, this.f51518w, xa2Var, this.f51520y, obj2);
            default:
                return new C1061z((byte) 5, this.f51518w, xa2Var, this.f51520y, obj2);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f51516u;
        txc txcVar = txc.f41359a;
        pc2 pc2Var = (pc2) obj;
        xa2 xa2Var = (xa2) obj2;
        switch (b) {
        }
        return ((C1061z) create(pc2Var, xa2Var)).invokeSuspend(txcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x030a, code lost:
    
        if (r1.mo6989P(r22) == r5) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        if (r8.m8913a(r4, r22) == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        if (r1.invoke(r2, r22) == r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4 A[Catch: all -> 0x0127, TryCatch #3 {all -> 0x0127, blocks: (B:76:0x0120, B:78:0x01c0, B:80:0x01c4, B:84:0x01da), top: B:75:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:76:0x0120, B:78:0x01c0, B:80:0x01c4, B:84:0x01da), top: B:75:0x0120 }] */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph9 ph9Var;
        Object m5985h;
        Object m11694F;
        Map map;
        Object m11694F2;
        Object m11694F3;
        List list;
        bw7 bw7Var;
        m48 m48Var;
        bw7 bw7Var2;
        Object m11694F4;
        long j;
        String str;
        String str2;
        iv7 iv7Var;
        oh9 oh9Var;
        oh9 oh9Var2;
        ebc ebcVar;
        oh9 oh9Var3;
        oh9 oh9Var4;
        byte b = this.f51516u;
        txc txcVar = txc.f41359a;
        qc2 qc2Var = qc2.f34309u;
        Object obj2 = this.f51521z;
        xa2 xa2Var = null;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) obj2;
                byte b2 = this.f51517v;
                if (b2 == 0) {
                    v11.m20244z(obj);
                    n76 n76Var = (n76) this.f51520y;
                    this.f51517v = (byte) 1;
                    break;
                } else {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 == 3) {
                                v11.m20244z(obj);
                                return txcVar;
                            }
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ph9Var = (ph9) this.f51519x;
                        v11.m20244z(obj);
                        this.f51519x = null;
                        this.f51517v = (byte) 3;
                        if (gu7Var.m8913a(ph9Var, this) != qc2Var) {
                            return txcVar;
                        }
                        return qc2Var;
                    }
                    v11.m20244z(obj);
                }
                oh9 oh9Var5 = new oh9(this.f51518w);
                ph9 ph9Var2 = new ph9(oh9Var5);
                this.f51519x = ph9Var2;
                this.f51517v = (byte) 2;
                if (gu7Var.m8913a(oh9Var5, this) != qc2Var) {
                    ph9Var = ph9Var2;
                    this.f51519x = null;
                    this.f51517v = (byte) 3;
                    if (gu7Var.m8913a(ph9Var, this) != qc2Var) {
                    }
                }
                return qc2Var;
            case 1:
                long j2 = this.f51518w;
                d80 d80Var = (d80) this.f51520y;
                iv7 iv7Var2 = (iv7) obj2;
                byte b3 = this.f51517v;
                if (b3 == 0) {
                    v11.m20244z(obj);
                    int ordinal = ((w91) iv7Var2.getValue()).ordinal();
                    if (ordinal == 0) {
                        this.f51517v = (byte) 1;
                        m5985h = d80Var.m5985h(j2, this);
                        if (m5985h == qc2Var) {
                            return qc2Var;
                        }
                        map = (Map) m5985h;
                    } else {
                        if (ordinal != 1) {
                            gpc.m8801a();
                            return null;
                        }
                        List list2 = d80Var.f7529K;
                        this.f51517v = (byte) 2;
                        vu2 vu2Var = k83.f21845a;
                        dt2 dt2Var = dt2.f8706v;
                        a80 a80Var = new a80(d80Var, j2, list2, null);
                        d80Var = d80Var;
                        m11694F = jzd.m11694F(dt2Var, a80Var, this);
                        if (m11694F == qc2Var) {
                            return qc2Var;
                        }
                        map = (Map) m11694F;
                    }
                } else if (b3 == 1) {
                    v11.m20244z(obj);
                    m5985h = obj;
                    map = (Map) m5985h;
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            Map map2 = (Map) this.f51519x;
                            v11.m20244z(obj);
                            map = map2;
                            m11694F2 = obj;
                            list = (List) m11694F2;
                            return new vq8(map, list);
                        }
                        if (b3 != 4) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map3 = (Map) this.f51519x;
                        v11.m20244z(obj);
                        map = map3;
                        m11694F3 = obj;
                        list = (List) m11694F3;
                        return new vq8(map, list);
                    }
                    v11.m20244z(obj);
                    m11694F = obj;
                    map = (Map) m11694F;
                }
                int ordinal2 = ((w91) iv7Var2.getValue()).ordinal();
                if (ordinal2 == 0) {
                    long j3 = this.f51518w;
                    this.f51519x = map;
                    this.f51517v = (byte) 3;
                    vu2 vu2Var2 = k83.f21845a;
                    m11694F2 = jzd.m11694F(dt2.f8706v, new b80(d80Var, j3, j3, null), this);
                    if (m11694F2 == qc2Var) {
                        return qc2Var;
                    }
                    list = (List) m11694F2;
                    return new vq8(map, list);
                }
                if (ordinal2 != 1) {
                    gpc.m8801a();
                    return null;
                }
                long j4 = this.f51518w;
                List list3 = d80Var.f7529K;
                this.f51519x = map;
                this.f51517v = (byte) 4;
                vu2 vu2Var3 = k83.f21845a;
                m11694F3 = jzd.m11694F(dt2.f8706v, new z70(d80Var, j4, j4, list3, null), this);
                if (m11694F3 == qc2Var) {
                    return qc2Var;
                }
                list = (List) m11694F3;
                return new vq8(map, list);
            case 2:
                byte b4 = this.f51517v;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    sx7 sx7Var = sx7.f39332a;
                    pr1.m15991y("Error getting IP address: ", e2.getMessage(), null, null, 6);
                }
                try {
                    if (b4 == 0) {
                        v11.m20244z(obj);
                        m48 m48Var2 = (m48) obj2;
                        ew7 ew7Var = m48Var2.f25604f;
                        this.f51519x = ew7Var;
                        this.f51520y = m48Var2;
                        this.f51517v = (byte) 1;
                        if (ew7Var.mo147b(this) == qc2Var) {
                            return qc2Var;
                        }
                        bw7Var = ew7Var;
                        m48Var = m48Var2;
                    } else {
                        if (b4 != 1) {
                            if (b4 != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = this.f51518w;
                            m48Var = (m48) this.f51520y;
                            bw7Var2 = (bw7) this.f51519x;
                            try {
                                v11.m20244z(obj);
                                m11694F4 = obj;
                                str2 = (String) m11694F4;
                                if (str2 == null) {
                                    sx7.m18364b(sx7.f39332a, "Found public IP address: ".concat(str2), null, 6);
                                    m48Var.f25601c = new vq8(str2, new Long(j));
                                } else {
                                    sx7.m18364b(sx7.f39332a, "Could not determine any IP address", null, 6);
                                    m48Var.f25605g = j;
                                }
                                bw7Var = bw7Var2;
                                str = str2;
                                bw7Var.mo148n(null);
                                return str;
                            } catch (Throwable th) {
                                th = th;
                                bw7Var2.mo148n(null);
                                throw th;
                            }
                        }
                        m48Var = (m48) this.f51520y;
                        bw7Var = (bw7) this.f51519x;
                        v11.m20244z(obj);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    vq8 vq8Var = m48Var.f25601c;
                    if (vq8Var != null) {
                        String str3 = (String) vq8Var.f44884u;
                        if (currentTimeMillis - ((Number) vq8Var.f44885v).longValue() < 300000 && str3 != null) {
                            sx7.m18364b(sx7.f39332a, "Returning cached IP address: ".concat(str3), null, 6);
                            str = str3;
                            bw7Var.mo148n(null);
                            return str;
                        }
                    }
                    long j5 = currentTimeMillis - m48Var.f25605g;
                    if (j5 < 60000) {
                        sx7.m18364b(sx7.f39332a, "Skipping public IP fetch: last walk failed " + j5 + "ms ago", null, 6);
                        str = null;
                        bw7Var.mo148n(null);
                        return str;
                    }
                    this.f51519x = bw7Var;
                    this.f51520y = m48Var;
                    this.f51518w = currentTimeMillis;
                    this.f51517v = (byte) 2;
                    m11694F4 = jzd.m11694F(m48Var.f25602d, new C0957w6(m48Var, xa2Var, (byte) 17), this);
                    if (m11694F4 == qc2Var) {
                        return qc2Var;
                    }
                    bw7Var2 = bw7Var;
                    j = currentTimeMillis;
                    str2 = (String) m11694F4;
                    if (str2 == null) {
                    }
                    bw7Var = bw7Var2;
                    str = str2;
                    bw7Var.mo148n(null);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    bw7Var2 = bw7Var;
                    bw7Var2.mo148n(null);
                    throw th;
                }
            case 3:
                byte b5 = this.f51517v;
                if (b5 == 0) {
                    v11.m20244z(obj);
                    jm4 jm4Var = ((o6c) this.f51519x).f29756K;
                    if (jm4Var != null) {
                        ha8 ha8Var = new ha8(this.f51518w);
                        this.f51517v = (byte) 1;
                        break;
                    }
                } else {
                    if (b5 != 1) {
                        if (b5 == 2) {
                            v11.m20244z(obj);
                            return txcVar;
                        }
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                this.f51517v = (byte) 2;
                if (((s6c) this.f51520y).mo5606a((n6c) obj2, this) != qc2Var) {
                    return txcVar;
                }
                return qc2Var;
            case 4:
                gu7 gu7Var2 = (gu7) obj2;
                iv7 iv7Var3 = (iv7) this.f51520y;
                byte b6 = this.f51517v;
                if (b6 == 0) {
                    v11.m20244z(obj);
                    oh9 oh9Var6 = (oh9) iv7Var3.getValue();
                    if (oh9Var6 != null) {
                        nh9 nh9Var = new nh9(oh9Var6);
                        if (gu7Var2 != null) {
                            this.f51519x = iv7Var3;
                            this.f51517v = (byte) 1;
                            break;
                        }
                        iv7Var = iv7Var3;
                    }
                    oh9Var = new oh9(this.f51518w);
                    if (gu7Var2 != null) {
                        this.f51519x = oh9Var;
                        this.f51517v = (byte) 2;
                        if (gu7Var2.m8913a(oh9Var, this) != qc2Var) {
                            oh9Var2 = oh9Var;
                            oh9Var = oh9Var2;
                        }
                        return qc2Var;
                    }
                    iv7Var3.setValue(oh9Var);
                    return txcVar;
                }
                if (b6 != 1) {
                    if (b6 != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oh9Var2 = (oh9) this.f51519x;
                    v11.m20244z(obj);
                    oh9Var = oh9Var2;
                    iv7Var3.setValue(oh9Var);
                    return txcVar;
                }
                iv7Var = (iv7) this.f51519x;
                v11.m20244z(obj);
                iv7Var.setValue(null);
                oh9Var = new oh9(this.f51518w);
                if (gu7Var2 != null) {
                }
                iv7Var3.setValue(oh9Var);
                return txcVar;
            default:
                gu7 gu7Var3 = (gu7) obj2;
                ebc ebcVar2 = (ebc) this.f51520y;
                byte b7 = this.f51517v;
                if (b7 == 0) {
                    v11.m20244z(obj);
                    oh9 oh9Var7 = ebcVar2.f9705w;
                    if (oh9Var7 != null) {
                        nh9 nh9Var2 = new nh9(oh9Var7);
                        this.f51519x = ebcVar2;
                        this.f51517v = (byte) 1;
                        if (gu7Var3.m8913a(nh9Var2, this) != qc2Var) {
                            ebcVar = ebcVar2;
                        }
                        return qc2Var;
                    }
                    oh9Var3 = new oh9(this.f51518w);
                    this.f51519x = oh9Var3;
                    this.f51517v = (byte) 2;
                    if (gu7Var3.m8913a(oh9Var3, this) != qc2Var) {
                        oh9Var4 = oh9Var3;
                        ebcVar2.f9705w = oh9Var4;
                        return txcVar;
                    }
                    return qc2Var;
                }
                if (b7 != 1) {
                    if (b7 != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oh9Var4 = (oh9) this.f51519x;
                    v11.m20244z(obj);
                    ebcVar2.f9705w = oh9Var4;
                    return txcVar;
                }
                ebcVar = (ebc) this.f51519x;
                v11.m20244z(obj);
                ebcVar.f9705w = null;
                oh9Var3 = new oh9(this.f51518w);
                this.f51519x = oh9Var3;
                this.f51517v = (byte) 2;
                if (gu7Var3.m8913a(oh9Var3, this) != qc2Var) {
                }
                return qc2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1061z(m48 m48Var, xa2 xa2Var) {
        super(2, xa2Var);
        this.f51516u = (byte) 2;
        this.f51521z = m48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1061z(byte b, long j, xa2 xa2Var, Object obj, Object obj2) {
        super(2, xa2Var);
        this.f51516u = b;
        this.f51520y = obj;
        this.f51518w = j;
        this.f51521z = obj2;
    }
}
