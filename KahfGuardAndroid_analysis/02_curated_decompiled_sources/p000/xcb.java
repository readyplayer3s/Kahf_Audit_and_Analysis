package p000;

import com.kahf.dns.p015di.PlatformModule_androidKt;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class xcb {

    /* renamed from: a */
    public final fcb f48138a;

    /* renamed from: b */
    public final pc2 f48139b;

    /* renamed from: c */
    public final hc2 f48140c;

    /* renamed from: d */
    public final zd8 f48141d;

    /* renamed from: e */
    public final bv8 f48142e;

    /* renamed from: f */
    public final xp5 f48143f;

    /* renamed from: g */
    public final j39 f48144g;

    /* renamed from: h */
    public pfc f48145h;

    /* renamed from: i */
    public String f48146i;

    /* renamed from: j */
    public volatile long f48147j;

    public xcb(fcb fcbVar, pc2 pc2Var, hc2 hc2Var, zd8 zd8Var, bv8 bv8Var, xp5 xp5Var, j39 j39Var) {
        fcbVar.getClass();
        pc2Var.getClass();
        hc2Var.getClass();
        this.f48138a = fcbVar;
        this.f48139b = pc2Var;
        this.f48140c = hc2Var;
        this.f48141d = zd8Var;
        this.f48142e = bv8Var;
        this.f48143f = xp5Var;
        this.f48144g = j39Var;
        this.f48145h = new pfc(bv8Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(5:22|23|24|(1:26)|(1:28))|12|(1:14)|15|16|17))|33|6|7|(0)(0)|12|(0)|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        r7 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25312y, "SiteVisitRecorder", r6, "Failed to clear the site-visit store; keeping its owner");
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22013a(String str, za2 za2Var) {
        rcb rcbVar;
        int i;
        if (za2Var instanceof rcb) {
            rcbVar = (rcb) za2Var;
            int i2 = rcbVar.f36476x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rcbVar.f36476x = i2 - Integer.MIN_VALUE;
                Object obj = rcbVar.f36474v;
                i = rcbVar.f36476x;
                xa2 xa2Var = null;
                boolean z = true;
                if (i != 0) {
                    v11.m20244z(obj);
                    this.f48145h = new pfc(this.f48142e);
                    fcb fcbVar = this.f48138a;
                    rcbVar.f36473u = str;
                    rcbVar.f36476x = 1;
                    hcb hcbVar = (hcb) fcbVar;
                    Object m14551w = nud.m14551w(hcbVar.f15982a, new og1(hcbVar, xa2Var, (byte) 5), rcbVar);
                    Object obj2 = qc2.f34309u;
                    if (m14551w != obj2) {
                        m14551w = txc.f41359a;
                    }
                    if (m14551w == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = rcbVar.f36473u;
                    v11.m20244z(obj);
                }
                PreferencesHelper preferencesHelper = (PreferencesHelper) this.f48143f.f48826u;
                if (str == null) {
                    str = "";
                }
                preferencesHelper.saveToPreferences("site_visits_recorded_for_device_id", str);
                return Boolean.valueOf(z);
            }
        }
        rcbVar = new rcb(this, za2Var);
        Object obj3 = rcbVar.f36474v;
        i = rcbVar.f36476x;
        xa2 xa2Var2 = null;
        boolean z2 = true;
        if (i != 0) {
        }
        PreferencesHelper preferencesHelper2 = (PreferencesHelper) this.f48143f.f48826u;
        if (str == null) {
        }
        preferencesHelper2.saveToPreferences("site_visits_recorded_for_device_id", str);
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22014b(za2 za2Var) {
        scb scbVar;
        int i;
        if (za2Var instanceof scb) {
            scbVar = (scb) za2Var;
            int i2 = scbVar.f38269w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scbVar.f38269w = i2 - Integer.MIN_VALUE;
                Object obj = scbVar.f38267u;
                i = scbVar.f38269w;
                xa2 xa2Var = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    rr7 rr7Var = new rr7(this, xa2Var, (byte) 15);
                    scbVar.f38269w = 1;
                    Object m11694F = jzd.m11694F(this.f48140c, rr7Var, scbVar);
                    qc2 qc2Var = qc2.f34309u;
                    if (m11694F == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                return txc.f41359a;
            }
        }
        scbVar = new scb(this, za2Var);
        Object obj2 = scbVar.f38267u;
        i = scbVar.f38269w;
        xa2 xa2Var2 = null;
        if (i != 0) {
        }
        return txc.f41359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22015c(za2 za2Var) {
        tcb tcbVar;
        Object obj;
        int i;
        String platformModule$lambda$0$29$2;
        Object obj2;
        if (za2Var instanceof tcb) {
            tcbVar = (tcb) za2Var;
            int i2 = tcbVar.f40135x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tcbVar.f40135x = i2 - Integer.MIN_VALUE;
                obj = tcbVar.f40133v;
                i = tcbVar.f40135x;
                boolean z = true;
                if (i != 0) {
                    v11.m20244z(obj);
                    platformModule$lambda$0$29$2 = PlatformModule_androidKt.platformModule$lambda$0$29$2(this.f48144g.f19565v);
                    String stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) this.f48143f.f48826u, "site_visits_recorded_for_device_id", null, 2, null);
                    if (stringFromPreferences$default.length() <= 0) {
                        stringFromPreferences$default = null;
                    }
                    pcb pcbVar = pcb.f32261a;
                    Object ocbVar = (platformModule$lambda$0$29$2 == null || platformModule$lambda$0$29$2.length() == 0) ? new ocb(null) : zy5.m23838d(stringFromPreferences$default, platformModule$lambda$0$29$2) ? pcbVar : new ocb(platformModule$lambda$0$29$2);
                    if (!ocbVar.equals(pcbVar)) {
                        if (!(ocbVar instanceof ocb)) {
                            gpc.m8801a();
                            return null;
                        }
                        ocb ocbVar2 = (ocb) ocbVar;
                        String str = ocbVar2.f30187a;
                        tcbVar.f40132u = ocbVar2;
                        tcbVar.f40135x = 1;
                        Object m22013a = m22013a(str, tcbVar);
                        Object obj3 = qc2.f34309u;
                        if (m22013a == obj3) {
                            return obj3;
                        }
                        Object obj4 = ocbVar;
                        obj = m22013a;
                        obj2 = obj4;
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = tcbVar.f40132u;
                v11.m20244z(obj);
                if (((Boolean) obj).booleanValue() || ((ocb) obj2).f30187a == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        tcbVar = new tcb(this, za2Var);
        obj = tcbVar.f40133v;
        i = tcbVar.f40135x;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* renamed from: d */
    public final long m22016d() {
        return this.f48147j;
    }

    /* renamed from: e */
    public final void m22017e(String str) {
        str.getClass();
        jzd.m11709o(this.f48139b, this.f48140c, null, new ucb(this, str, ((Number) this.f48141d.invoke()).longValue(), null), 2);
    }

    /* renamed from: f */
    public final void m22018f(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        jzd.m11709o(this.f48139b, this.f48140c, null, new vcb(this, str, str2, z, z2, ((Number) this.f48141d.invoke()).longValue(), null), 2);
    }

    /* renamed from: g */
    public final void m22019g() {
        jzd.m11709o(this.f48139b, this.f48140c, null, new ga4(this, ((Number) this.f48141d.invoke()).longValue(), null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22020h(long j, za2 za2Var) {
        wcb wcbVar;
        int i;
        List list;
        String str;
        List list2;
        Object m14551w;
        long j2 = j;
        qc2 qc2Var = qc2.f34309u;
        txc txcVar = txc.f41359a;
        if (za2Var instanceof wcb) {
            wcbVar = (wcb) za2Var;
            int i2 = wcbVar.f46204z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wcbVar.f46204z = i2 - Integer.MIN_VALUE;
                Object obj = wcbVar.f46202x;
                i = wcbVar.f46204z;
                if (i != 0) {
                    v11.m20244z(obj);
                    pfc pfcVar = this.f48145h;
                    pfcVar.f32489x = Long.valueOf(j2);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) pfcVar.f32487v;
                    if (linkedHashMap.isEmpty()) {
                        list = xo3.f48775u;
                    } else {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            nrc nrcVar = (nrc) entry.getKey();
                            ncb ncbVar = (ncb) entry.getValue();
                            arrayList.add(new kcb(((Number) nrcVar.f28749v).intValue(), ncbVar.f28061a, ncbVar.f28062b, ncbVar.f28063c, (String) nrcVar.f28748u, (String) nrcVar.f28750w));
                        }
                        linkedHashMap.clear();
                        list = arrayList;
                    }
                    if (list.isEmpty()) {
                        return txcVar;
                    }
                    try {
                        str = ((adb) this.f48142e.invoke(new Long(j2))).f757a;
                        if (!zy5.m23838d(this.f48146i, str)) {
                            fcb fcbVar = this.f48138a;
                            iv6 m8919a = gv6.m8919a(iv6.Companion, str);
                            dp2.Companion.getClass();
                            String iv6Var = u6d.m19383r(m8919a, 35, dp2.f8498c).toString();
                            wcbVar.f46200v = list;
                            wcbVar.f46201w = str;
                            wcbVar.f46199u = j2;
                            wcbVar.f46204z = 1;
                            hcb hcbVar = (hcb) fcbVar;
                            Object m14551w2 = nud.m14551w(hcbVar.f15982a, new C0817se(hcbVar, iv6Var, null, (byte) 7), wcbVar);
                            if (m14551w2 != qc2Var) {
                                m14551w2 = txcVar;
                            }
                            if (m14551w2 == qc2Var) {
                                return qc2Var;
                            }
                        }
                        fcb fcbVar2 = this.f48138a;
                        wcbVar.f46200v = list;
                        wcbVar.f46201w = null;
                        wcbVar.f46199u = j2;
                        wcbVar.f46204z = 2;
                        hcb hcbVar2 = (hcb) fcbVar2;
                        m14551w = nud.m14551w(hcbVar2.f15982a, new C0817se(hcbVar2, list, null, (byte) 6), wcbVar);
                        if (m14551w != qc2Var) {
                            m14551w = txcVar;
                        }
                        if (m14551w != qc2Var) {
                            list2 = list;
                            this.f48147j++;
                            return txcVar;
                        }
                        return qc2Var;
                    } catch (Exception e) {
                        e = e;
                        list2 = list;
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6.f25312y, "SiteVisitRecorder", e, pr1.m15973g(list2.size(), "Failed to store ", " site-visit deltas"));
                        return txcVar;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = wcbVar.f46200v;
                    try {
                        v11.m20244z(obj);
                        this.f48147j++;
                        return txcVar;
                    } catch (Exception e2) {
                        e = e2;
                        sx7 sx7Var2 = sx7.f39332a;
                        sx7.m18369g(ly6.f25312y, "SiteVisitRecorder", e, pr1.m15973g(list2.size(), "Failed to store ", " site-visit deltas"));
                        return txcVar;
                    }
                }
                j2 = wcbVar.f46199u;
                str = wcbVar.f46201w;
                List list3 = wcbVar.f46200v;
                try {
                    v11.m20244z(obj);
                    list = list3;
                } catch (Exception e3) {
                    e = e3;
                    list2 = list3;
                    sx7 sx7Var22 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "SiteVisitRecorder", e, pr1.m15973g(list2.size(), "Failed to store ", " site-visit deltas"));
                    return txcVar;
                }
                this.f48146i = str;
                fcb fcbVar22 = this.f48138a;
                wcbVar.f46200v = list;
                wcbVar.f46201w = null;
                wcbVar.f46199u = j2;
                wcbVar.f46204z = 2;
                hcb hcbVar22 = (hcb) fcbVar22;
                m14551w = nud.m14551w(hcbVar22.f15982a, new C0817se(hcbVar22, list, null, (byte) 6), wcbVar);
                if (m14551w != qc2Var) {
                }
                if (m14551w != qc2Var) {
                }
                return qc2Var;
            }
        }
        wcbVar = new wcb(this, za2Var);
        Object obj2 = wcbVar.f46202x;
        i = wcbVar.f46204z;
        if (i != 0) {
        }
        this.f48146i = str;
        fcb fcbVar222 = this.f48138a;
        wcbVar.f46200v = list;
        wcbVar.f46201w = null;
        wcbVar.f46199u = j2;
        wcbVar.f46204z = 2;
        hcb hcbVar222 = (hcb) fcbVar222;
        m14551w = nud.m14551w(hcbVar222.f15982a, new C0817se(hcbVar222, list, null, (byte) 6), wcbVar);
        if (m14551w != qc2Var) {
        }
        if (m14551w != qc2Var) {
        }
        return qc2Var;
    }
}
