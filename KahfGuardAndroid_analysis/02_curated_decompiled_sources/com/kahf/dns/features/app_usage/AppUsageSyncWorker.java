package com.kahf.dns.features.app_usage;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p000.C0639nl;
import p000.C0726py;
import p000.C0917v3;
import p000.C1058yx;
import p000.a50;
import p000.b50;
import p000.cm0;
import p000.dt2;
import p000.f50;
import p000.g50;
import p000.h50;
import p000.i50;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.kzc;
import p000.l50;
import p000.ly6;
import p000.lzc;
import p000.m2d;
import p000.mzc;
import p000.nrc;
import p000.nu5;
import p000.nud;
import p000.oj8;
import p000.p50;
import p000.p97;
import p000.pr1;
import p000.ps1;
import p000.q70;
import p000.qc2;
import p000.qs1;
import p000.qv5;
import p000.s70;
import p000.so6;
import p000.sv5;
import p000.sx7;
import p000.t70;
import p000.tab;
import p000.tz6;
import p000.v11;
import p000.vl4;
import p000.vq8;
import p000.vu2;
import p000.x00;
import p000.xa2;
import p000.xo3;
import p000.y82;
import p000.za2;
import p000.zv5;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AppUsageSyncWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6264A;

    /* renamed from: B */
    public final kl6 f6265B;

    /* renamed from: C */
    public final kl6 f6266C;

    /* renamed from: D */
    public final kl6 f6267D;

    /* renamed from: E */
    public final kl6 f6268E;

    /* renamed from: F */
    public final kl6 f6269F;

    /* renamed from: G */
    public final kl6 f6270G;

    /* renamed from: H */
    public final kl6 f6271H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        y82 y82Var = new y82(this, (byte) 15);
        so6 so6Var = so6.f38881u;
        this.f6264A = iq5.m10513r(so6Var, y82Var);
        this.f6265B = iq5.m10513r(so6Var, new y82(this, (byte) 16));
        this.f6266C = iq5.m10513r(so6Var, new y82(this, (byte) 17));
        this.f6267D = iq5.m10513r(so6Var, new y82(this, (byte) 18));
        this.f6268E = iq5.m10513r(so6Var, new y82(this, (byte) 19));
        this.f6269F = iq5.m10513r(so6Var, new y82(this, (byte) 20));
        this.f6270G = iq5.m10513r(so6Var, new y82(this, (byte) 21));
        this.f6271H = iq5.m10513r(so6Var, new cm0(this, (byte) 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        q70 q70Var;
        int i;
        if (xa2Var instanceof q70) {
            q70Var = (q70) xa2Var;
            int i2 = q70Var.f34046w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q70Var.f34046w = i2 - Integer.MIN_VALUE;
                Object obj = q70Var.f34044u;
                i = q70Var.f34046w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    x00 x00Var = new x00(this, xa2Var2, (byte) 2);
                    q70Var.f34046w = 1;
                    obj = jzd.m11694F(dt2Var, x00Var, q70Var);
                    qc2 qc2Var = qc2.f34309u;
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        q70Var = new q70(this, (za2) xa2Var);
        Object obj2 = q70Var.f34044u;
        i = q70Var.f34046w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m3766e(String str, vl4 vl4Var, za2 za2Var) {
        s70 s70Var;
        int i;
        try {
            if (za2Var instanceof s70) {
                s70Var = (s70) za2Var;
                int i2 = s70Var.f38003x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s70Var.f38003x = i2 - Integer.MIN_VALUE;
                    Object obj = s70Var.f38001v;
                    i = s70Var.f38003x;
                    if (i != 0) {
                        v11.m20244z(obj);
                        s70Var.f38000u = str;
                        s70Var.f38003x = 1;
                        obj = vl4Var.invoke(s70Var);
                        qc2 qc2Var = qc2.f34309u;
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = s70Var.f38000u;
                        v11.m20244z(obj);
                    }
                    return (m2d) obj;
                }
            }
            if (i != 0) {
            }
            return (m2d) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KG_SYNC", e2, tz6.m19211l("Exception during ", str, " upload: ", e2.getMessage()));
            return m2d.f25512w;
        }
        s70Var = new s70(this, za2Var);
        Object obj2 = s70Var.f38001v;
        i = s70Var.f38003x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a1, code lost:
    
        if (r1 == r11) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028d A[LOOP:1: B:62:0x0287->B:64:0x028d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d5 A[LOOP:2: B:67:0x02cf->B:69:0x02d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v21, types: [xo3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x03d0 -> B:36:0x03d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0110 -> B:85:0x011a). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m3767f(String str, za2 za2Var) {
        t70 t70Var;
        int i;
        String str2;
        List list;
        ArrayList arrayList;
        Iterator it;
        m2d m2dVar;
        qc2 qc2Var;
        String str3;
        List<i50> list2;
        long j;
        long j2;
        m2d m2dVar2;
        Iterator it2;
        kl6 kl6Var;
        ?? arrayList2;
        LinkedHashMap linkedHashMap;
        Iterator it3;
        Iterator it4;
        Map map;
        Map map2;
        long j3;
        if (za2Var instanceof t70) {
            t70Var = (t70) za2Var;
            int i2 = t70Var.f39849I;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t70Var.f39849I = i2 - Integer.MIN_VALUE;
                Object obj = t70Var.f39847G;
                i = t70Var.f39849I;
                kl6 kl6Var2 = this.f6267D;
                m2d m2dVar3 = m2d.f25510u;
                xa2 xa2Var = null;
                qc2 qc2Var2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    sx7 sx7Var = sx7.f39332a;
                    StringBuilder sb = new StringBuilder("Collecting app usage data for device: ");
                    str2 = str;
                    sb.append(str2);
                    sx7.m18364b(sx7Var, sb.toString(), "KG_SYNC", 2);
                    ((p50) kl6Var2.getValue()).getClass();
                    List m15527a = p50.m15527a();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it5 = m15527a.iterator();
                    list = m15527a;
                    arrayList = arrayList3;
                    it = it5;
                    if (it.hasNext()) {
                    }
                    return qc2Var;
                }
                if (i == 1) {
                    long j4 = t70Var.f39845E;
                    Iterator it6 = t70Var.f39853x;
                    ?? r11 = t70Var.f39852w;
                    list = t70Var.f39851v;
                    String str4 = t70Var.f39850u;
                    v11.m20244z(obj);
                    Iterator it7 = it6;
                    t70 t70Var2 = t70Var;
                    ArrayList arrayList4 = r11;
                    qc2Var = qc2Var2;
                    long j5 = 86400000;
                    List list3 = (List) obj;
                    String str5 = str4;
                    t70 t70Var3 = t70Var2;
                    kl6 kl6Var3 = kl6Var2;
                    long min = Math.min(j4 + j5, zv5.f53149a.mo2814g().m22370e());
                    if (min > j4) {
                        arrayList2 = xo3.f48775u;
                        m2dVar2 = m2dVar3;
                        it2 = it7;
                        kl6Var = kl6Var3;
                    } else {
                        HashMap hashMap = new HashMap();
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            tab tabVar = (tab) it8.next();
                            Iterator it9 = it7;
                            kl6 kl6Var4 = kl6Var3;
                            long max = Math.max(tabVar.m18714c(), j4);
                            long min2 = Math.min(tabVar.m18713b(), min);
                            if (max < min2) {
                                while (max < min2) {
                                    long j6 = min;
                                    int i3 = ((int) ((max - j4) / 3600000)) + 1;
                                    m2d m2dVar4 = m2dVar3;
                                    long min3 = Math.min((i3 * 3600000) + j4, min2);
                                    long j7 = min3 - max;
                                    Iterator it10 = it8;
                                    vq8 vq8Var = new vq8(tabVar.m18712a(), Integer.valueOf(i3));
                                    Long l = (Long) hashMap.get(vq8Var);
                                    hashMap.put(vq8Var, Long.valueOf((l != null ? l.longValue() : 0L) + j7));
                                    max = min3;
                                    it8 = it10;
                                    min = j6;
                                    m2dVar3 = m2dVar4;
                                }
                            }
                            it7 = it9;
                            kl6Var3 = kl6Var4;
                        }
                        m2dVar2 = m2dVar3;
                        it2 = it7;
                        kl6Var = kl6Var3;
                        arrayList2 = new ArrayList(hashMap.size());
                        for (Map.Entry entry : hashMap.entrySet()) {
                            arrayList2.add(new i50(j4, ((Number) r5.f44885v).intValue(), ((Number) entry.getValue()).longValue(), (String) ((vq8) entry.getKey()).f44884u));
                        }
                    }
                    arrayList4.addAll(arrayList2);
                    str2 = str5;
                    arrayList = arrayList4;
                    qc2Var2 = qc2Var;
                    t70Var = t70Var3;
                    it = it2;
                    kl6Var2 = kl6Var;
                    m2dVar3 = m2dVar2;
                    xa2Var = null;
                    if (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        p50 p50Var = (p50) kl6Var2.getValue();
                        t70Var.f39850u = str2;
                        t70Var.f39851v = list;
                        t70Var.f39852w = arrayList;
                        t70Var.f39853x = it;
                        t70Var.f39845E = longValue;
                        t70Var.f39849I = 1;
                        p50Var.getClass();
                        vu2 vu2Var = k83.f21845a;
                        qc2Var = qc2Var2;
                        l50 l50Var = new l50(longValue, p50Var, xa2Var, (byte) 0);
                        j5 = 86400000;
                        Object m11694F = jzd.m11694F(vu2Var, l50Var, t70Var);
                        if (m11694F != qc2Var) {
                            t70 t70Var4 = t70Var;
                            arrayList4 = arrayList;
                            obj = m11694F;
                            it7 = it;
                            t70Var2 = t70Var4;
                            str4 = str2;
                            j4 = longValue;
                            List list32 = (List) obj;
                            String str52 = str4;
                            t70 t70Var32 = t70Var2;
                            kl6 kl6Var32 = kl6Var2;
                            long min4 = Math.min(j4 + j5, zv5.f53149a.mo2814g().m22370e());
                            if (min4 > j4) {
                            }
                            arrayList4.addAll(arrayList2);
                            str2 = str52;
                            arrayList = arrayList4;
                            qc2Var2 = qc2Var;
                            t70Var = t70Var32;
                            it = it2;
                            kl6Var2 = kl6Var;
                            m2dVar3 = m2dVar2;
                            xa2Var = null;
                            if (it.hasNext()) {
                                m2dVar = m2dVar3;
                                qc2Var = qc2Var2;
                                Long l2 = (Long) ps1.m16003B0(list);
                                if (l2 != null) {
                                    long longValue2 = l2.longValue();
                                    Long l3 = (Long) ps1.m16048z0(list);
                                    if (l3 != null) {
                                        long longValue3 = l3.longValue();
                                        a50 a50Var = (a50) this.f6266C.getValue();
                                        t70Var.f39850u = str2;
                                        t70Var.f39851v = null;
                                        t70Var.f39852w = arrayList;
                                        t70Var.f39853x = null;
                                        t70Var.f39845E = longValue2;
                                        t70Var.f39846F = longValue3;
                                        t70Var.f39849I = 2;
                                        Object m14552x = nud.m14552x(t70Var, ((f50) a50Var).f11154a, true, false, new b50((byte) 2, longValue2, longValue3 + 86400000));
                                        if (m14552x != qc2Var) {
                                            str3 = str2;
                                            list2 = arrayList;
                                            obj = m14552x;
                                            j = longValue3;
                                            j2 = longValue2;
                                            linkedHashMap = new LinkedHashMap();
                                            it3 = ((List) obj).iterator();
                                            while (it3.hasNext()) {
                                            }
                                            t70 t70Var5 = t70Var;
                                            long j8 = j;
                                            while (r1.hasNext()) {
                                            }
                                            if (!linkedHashMap.isEmpty()) {
                                            }
                                        }
                                    }
                                }
                                return m2dVar;
                            }
                        }
                    }
                    return qc2Var;
                }
                if (i == 2) {
                    j = t70Var.f39846F;
                    j2 = t70Var.f39845E;
                    list2 = t70Var.f39852w;
                    str3 = t70Var.f39850u;
                    v11.m20244z(obj);
                    m2dVar = m2dVar3;
                    qc2Var = qc2Var2;
                    linkedHashMap = new LinkedHashMap();
                    it3 = ((List) obj).iterator();
                    while (it3.hasNext()) {
                        g50 g50Var = (g50) it3.next();
                        linkedHashMap.put(new nrc(g50Var.m8364d(), new Long(g50Var.m8361a()), new Long(g50Var.m8363c())), new Long(g50Var.m8362b()));
                        t70Var = t70Var;
                        it3 = it3;
                        j = j;
                    }
                    t70 t70Var52 = t70Var;
                    long j82 = j;
                    for (i50 i50Var : list2) {
                        linkedHashMap.put(new nrc(i50Var.m10001d(), new Long(i50Var.m9998a()), new Long(i50Var.m10000c())), new Long(i50Var.m9999b()));
                    }
                    if (!linkedHashMap.isEmpty()) {
                        sx7.m18364b(sx7.f39332a, "No app usage data to sync", "KG_SYNC", 2);
                        return m2dVar;
                    }
                    String packageName = this.f21132u.getPackageName();
                    Set keySet = linkedHashMap.keySet();
                    keySet.getClass();
                    Iterator it11 = keySet.iterator();
                    while (it11.hasNext()) {
                        nrc nrcVar = (nrc) it11.next();
                        nrcVar.getClass();
                        if (zy5.m23838d(nrcVar.m14421d(), packageName)) {
                            it11.remove();
                        }
                    }
                    Set keySet2 = linkedHashMap.keySet();
                    ArrayList arrayList5 = new ArrayList(qs1.m16870Y(keySet2, 10));
                    Iterator it12 = keySet2.iterator();
                    while (it12.hasNext()) {
                        arrayList5.add((String) ((nrc) it12.next()).m14421d());
                    }
                    List m16032j0 = ps1.m16032j0(arrayList5);
                    int m15615D = p97.m15615D(qs1.m16870Y(m16032j0, 10));
                    if (m15615D < 16) {
                        m15615D = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(m15615D);
                    it4 = m16032j0.iterator();
                    map = linkedHashMap2;
                    map2 = linkedHashMap;
                    j3 = j82;
                    t70Var = t70Var52;
                    if (it4.hasNext()) {
                    }
                    return qc2Var;
                }
                if (i != 3) {
                    if (i != 4) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = t70Var.f39854y;
                    v11.m20244z(obj);
                    C0726py c0726py = (C0726py) obj;
                    boolean m16202a = c0726py.m16202a();
                    m2d m2dVar5 = m2d.f25512w;
                    if (m16202a) {
                        sx7 sx7Var2 = sx7.f39332a;
                        sx7.m18366d(2, "GraphQL errors: " + c0726py.f33501d, "KG_SYNC", null);
                        return m2dVar5;
                    }
                    kzc kzcVar = (kzc) c0726py.f33500c;
                    lzc m12408a = kzcVar != null ? kzcVar.m12408a() : null;
                    if (m12408a == null || !m12408a.m13062c()) {
                        sx7 sx7Var3 = sx7.f39332a;
                        pr1.m15991y("Failed to sync app usage: ", m12408a != null ? m12408a.m13060a() : null, null, "KG_SYNC", 2);
                        return m2dVar5;
                    }
                    sx7.m18364b(sx7.f39332a, "App usage synced successfully: " + m12408a.m13061b(), "KG_SYNC", 2);
                    return m2d.f25511v;
                }
                j3 = t70Var.f39846F;
                j2 = t70Var.f39845E;
                Object next = t70Var.f39844D;
                map = t70Var.f39843C;
                String str6 = t70Var.f39842B;
                it4 = t70Var.f39841A;
                Map map4 = t70Var.f39855z;
                map2 = t70Var.f39854y;
                String str7 = t70Var.f39850u;
                v11.m20244z(obj);
                Map map5 = map4;
                str3 = str7;
                qc2Var = qc2Var2;
                String str8 = str6;
                qv5 qv5Var = (qv5) obj;
                if (qv5Var != null || (r1 = qv5Var.f35512b) == null) {
                    String str9 = str8;
                }
                map.put(next, str9);
                map = map5;
                if (it4.hasNext()) {
                    next = it4.next();
                    String str10 = (String) next;
                    sv5 sv5Var = (sv5) this.f6268E.getValue();
                    t70Var.f39850u = str3;
                    t70Var.f39851v = null;
                    t70Var.f39852w = null;
                    t70Var.f39853x = null;
                    t70Var.f39854y = map2;
                    Map map6 = map;
                    t70Var.f39855z = map6;
                    t70Var.f39841A = it4;
                    t70Var.f39842B = str10;
                    t70Var.f39843C = map6;
                    t70Var.f39844D = next;
                    t70Var.f39845E = j2;
                    t70Var.f39846F = j3;
                    t70Var.f39849I = 3;
                    Object m14253a = ((C0639nl) sv5Var).m14253a(str10, t70Var);
                    if (m14253a != qc2Var) {
                        str8 = str10;
                        obj = m14253a;
                        map5 = map;
                        qv5 qv5Var2 = (qv5) obj;
                        if (qv5Var2 != null) {
                        }
                        String str92 = str8;
                        map.put(next, str92);
                        map = map5;
                        if (it4.hasNext()) {
                            ArrayList arrayList6 = new ArrayList(map2.size());
                            for (Map.Entry entry2 : map2.entrySet()) {
                                nrc nrcVar2 = (nrc) entry2.getKey();
                                long longValue4 = ((Number) entry2.getValue()).longValue();
                                String str11 = (String) nrcVar2.m14421d();
                                String str12 = (String) map.get(nrcVar2.m14421d());
                                if (str12 == null) {
                                    str12 = (String) nrcVar2.m14421d();
                                }
                                arrayList6.add(new h50(str11, str12, ((Number) nrcVar2.m14422e()).longValue(), (int) ((Number) nrcVar2.m14423f()).longValue(), longValue4));
                                map = map;
                            }
                            sx7.m18364b(sx7.f39332a, pr1.m15973g(arrayList6.size(), "Sending ", " app usage entries to server"), "KG_SYNC", 2);
                            C1058yx c1058yx = (C1058yx) this.f6264A.getValue();
                            mzc mzcVar = new mzc(str3, arrayList6);
                            c1058yx.getClass();
                            nu5 nu5Var = new nu5(c1058yx, (oj8) mzcVar);
                            t70Var.f39850u = null;
                            t70Var.f39851v = null;
                            t70Var.f39852w = null;
                            t70Var.f39853x = null;
                            t70Var.f39854y = null;
                            t70Var.f39855z = null;
                            t70Var.f39841A = null;
                            t70Var.f39842B = null;
                            t70Var.f39843C = null;
                            t70Var.f39844D = null;
                            t70Var.f39845E = j2;
                            t70Var.f39846F = j3;
                            t70Var.f39849I = 4;
                            obj = nu5Var.m14483I(t70Var);
                        }
                    }
                }
                return qc2Var;
            }
        }
        t70Var = new t70(this, za2Var);
        Object obj2 = t70Var.f39847G;
        i = t70Var.f39849I;
        kl6 kl6Var22 = this.f6267D;
        m2d m2dVar32 = m2d.f25510u;
        xa2 xa2Var2 = null;
        qc2 qc2Var22 = qc2.f34309u;
        if (i != 0) {
        }
    }
}
