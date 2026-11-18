package p000;

import com.github.mikephil.charting.charts.Chart;
import com.kahf.dns.features.permission_flows.PermissionStatusSyncWorker;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class z27 extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f51657u;

    /* renamed from: v */
    public boolean f51658v;

    /* renamed from: w */
    public Object f51659w;

    /* renamed from: x */
    public Object f51660x;

    /* renamed from: y */
    public final /* synthetic */ Object f51661y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z27(ebc ebcVar, k79 k79Var, boolean z, xa2 xa2Var) {
        super(2, xa2Var);
        this.f51657u = (byte) 15;
        this.f51660x = ebcVar;
        this.f51661y = k79Var;
        this.f51658v = z;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f51657u;
        Object obj2 = this.f51661y;
        switch (b) {
            case 0:
                return new z27(this.f51660x, obj2, xa2Var, (byte) 0);
            case 1:
                z27 z27Var = new z27(this.f51660x, obj2, xa2Var, (byte) 1);
                z27Var.f51659w = obj;
                return z27Var;
            case 2:
                z27 z27Var2 = new z27(this.f51660x, obj2, xa2Var, (byte) 2);
                z27Var2.f51659w = obj;
                return z27Var2;
            case 3:
                return new z27((dq6) this.f51659w, (r78) this.f51660x, (xz8) obj2, xa2Var, (byte) 3);
            case 4:
                z27 z27Var3 = new z27(this.f51660x, obj2, xa2Var, (byte) 4);
                z27Var3.f51659w = obj;
                return z27Var3;
            case 5:
                return new z27((PermissionStatusSyncWorker) obj2, xa2Var);
            case 6:
                return new z27((wo9) this.f51659w, (zbb) this.f51660x, (List) obj2, xa2Var, (byte) 6);
            case 7:
                z27 z27Var4 = new z27(this.f51660x, obj2, xa2Var, (byte) 7);
                z27Var4.f51659w = obj;
                return z27Var4;
            case 8:
                z27 z27Var5 = new z27(this.f51660x, obj2, xa2Var, (byte) 8);
                z27Var5.f51659w = obj;
                return z27Var5;
            case 9:
                z27 z27Var6 = new z27(this.f51660x, obj2, xa2Var, (byte) 9);
                z27Var6.f51659w = obj;
                return z27Var6;
            case 10:
                return new z27((k79) this.f51659w, (gu7) this.f51660x, (zeb) obj2, xa2Var, (byte) 10);
            case 11:
                z27 z27Var7 = new z27(this.f51660x, obj2, xa2Var, (byte) 11);
                z27Var7.f51659w = obj;
                return z27Var7;
            case 12:
                z27 z27Var8 = new z27(this.f51660x, obj2, xa2Var, (byte) 12);
                z27Var8.f51659w = obj;
                return z27Var8;
            case 13:
                return new z27(this.f51660x, obj2, xa2Var, (byte) 13);
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                return new z27((ebc) this.f51659w, (k79) this.f51660x, (y7c) obj2, xa2Var, (byte) 14);
            case ba7.f2964h /* 15 */:
                z27 z27Var9 = new z27((ebc) this.f51660x, (k79) obj2, this.f51658v, xa2Var);
                z27Var9.f51659w = obj;
                return z27Var9;
            case 16:
                return new z27((wlc) this.f51659w, (pmc) this.f51660x, (jw9) obj2, xa2Var, (byte) 16);
            default:
                return new z27((v53) this.f51659w, (vic) this.f51660x, (vl4) obj2, xa2Var, (byte) 17);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f51657u;
        txc txcVar = txc.f41359a;
        switch (b) {
        }
        return ((z27) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x0640, code lost:
    
        if (r1 != r9) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0871  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:309:0x0846 -> B:301:0x084a). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        Object m13778n;
        w94 w94Var;
        Object obj2;
        String str;
        String obj3;
        xt7 xt7Var;
        boolean z;
        vt7 vt7Var;
        c37 c37Var;
        Object c37Var2;
        ?? arrayList;
        String str2;
        kl6 kl6Var;
        String str3;
        String str4;
        String str5;
        String str6;
        Object m14483I;
        pz8 pz8Var;
        ls6 ls6Var;
        fd6 fd6Var;
        Object m10559r;
        Object m22258x;
        byte b = this.f51657u;
        byte b2 = 6;
        byte b3 = 3;
        ?? r3 = 4;
        char c = 4;
        char c2 = 4;
        byte b4 = 2;
        byte b5 = 0;
        txc txcVar = txc.f41359a;
        qc2 qc2Var = qc2.f34309u;
        Object obj4 = this.f51661y;
        xa2 xa2Var = null;
        switch (b) {
            case 0:
                boolean z2 = this.f51658v;
                if (!z2) {
                    v11.m20244z(obj);
                    c37 c37Var3 = (c37) this.f51660x;
                    linkedHashMap = c37Var3.f4350l;
                    this.f51659w = linkedHashMap;
                    this.f51658v = true;
                    m13778n = muc.m13778n(new C0513k6((Object) c37Var3, obj4, (xa2) null, (byte) 12), this);
                    if (m13778n == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (!z2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f51659w;
                    v11.m20244z(obj);
                    linkedHashMap = linkedHashMap2;
                    m13778n = obj;
                }
                return o97.m14872I(linkedHashMap, (Map) m13778n);
            case 1:
                aj5 aj5Var = (aj5) obj4;
                az9 az9Var = (az9) this.f51660x;
                boolean z3 = this.f51658v;
                if (!z3) {
                    v11.m20244z(obj);
                    w94Var = (w94) this.f51659w;
                    p11 p11Var = aj5Var.f1170c;
                    if (p11Var == null) {
                        p11Var = null;
                    }
                    p11Var.getClass();
                    String m2606K = c3e.m2606K(aj5Var.f1169b);
                    if (m2606K != null) {
                        List m18273m1 = stb.m18273m1(m2606K, new char[]{';'});
                        ArrayList arrayList2 = new ArrayList(qs1.m16870Y(m18273m1, 10));
                        Iterator it = m18273m1.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(stb.m18242B1((String) it.next()).toString());
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (ztb.m23781F0((String) obj2, "boundary=", false)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        String str7 = (String) obj2;
                        if (str7 != null && (str = (String) ps1.m16040r0(1, stb.m18273m1(str7, new char[]{'='}))) != null) {
                            char[] cArr = {'\"', '\''};
                            int length = str.length() - 1;
                            boolean z4 = false;
                            int i = 0;
                            while (i <= length) {
                                boolean m20526D = v90.m20526D(cArr, str.charAt(!z4 ? i : length));
                                if (z4) {
                                    if (m20526D) {
                                        length--;
                                    } else {
                                        obj3 = str.subSequence(i, length + 1).toString();
                                        if (obj3 == null) {
                                            throw new ar2("Expected the Content-Type to have a boundary parameter", null);
                                        }
                                        az9Var.f2377u = new xt7(obj3, p11Var);
                                        Object obj5 = az9Var.f2377u;
                                        obj5.getClass();
                                        xt7Var = (xt7) obj5;
                                        l51 l51Var = xt7Var.f49030v;
                                        p11 p11Var2 = xt7Var.f49029u;
                                        if (xt7Var.f49033y) {
                                        }
                                    }
                                } else if (m20526D) {
                                    i++;
                                } else {
                                    z4 = true;
                                }
                            }
                            obj3 = str.subSequence(i, length + 1).toString();
                            if (obj3 == null) {
                            }
                        }
                    }
                    obj3 = null;
                    if (obj3 == null) {
                    }
                } else {
                    if (!z3) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w94Var = (w94) this.f51659w;
                    v11.m20244z(obj);
                    b2 = 6;
                    Object obj52 = az9Var.f2377u;
                    obj52.getClass();
                    xt7Var = (xt7) obj52;
                    l51 l51Var2 = xt7Var.f49030v;
                    p11 p11Var22 = xt7Var.f49029u;
                    if (xt7Var.f49033y) {
                        C0917v3.m20303j("closed");
                        return null;
                    }
                    if (xt7Var.f49034z) {
                        vt7Var = null;
                        z = true;
                    } else {
                        if (xt7Var.f49032x == 0 && p11Var22.mo2477I(0L, l51Var2)) {
                            p11Var22.skip(l51Var2.mo9010d());
                        } else {
                            while (true) {
                                long m22334b = xt7Var.m22334b(8192L);
                                if (m22334b != 0) {
                                    p11Var22.skip(m22334b);
                                } else {
                                    p11Var22.skip(xt7Var.f49031w.mo9010d());
                                }
                            }
                        }
                        boolean z5 = false;
                        while (true) {
                            int mo2478O = p11Var22.mo2478O(xt7Var.f49028B);
                            if (mo2478O == -1) {
                                if (p11Var22.mo2484c()) {
                                    throw new ar2("premature end of multipart body", null);
                                }
                                throw new ar2("unexpected characters after boundary", null);
                            }
                            if (mo2478O != 0) {
                                z = true;
                                if (mo2478O == 1) {
                                    xt7Var.f49032x++;
                                    ArrayList arrayList3 = new ArrayList();
                                    while (true) {
                                        String mo2491q0 = p11Var22.mo2491q0();
                                        if (mo2491q0.length() == 0) {
                                            wt7 wt7Var = new wt7(xt7Var);
                                            xt7Var.f49027A = wt7Var;
                                            vt7Var = new vt7(arrayList3, new bv9(wt7Var));
                                            z = true;
                                        } else {
                                            int m18256V0 = stb.m18256V0(mo2491q0, ':', 0, false, b2);
                                            if (m18256V0 != -1) {
                                                arrayList3.add(new zg5(stb.m18242B1(mo2491q0.substring(0, m18256V0)).toString(), stb.m18242B1(mo2491q0.substring(m18256V0 + 1)).toString()));
                                                b2 = 6;
                                            } else {
                                                rf6.m17312i("Unexpected header: ".concat(mo2491q0));
                                            }
                                        }
                                    }
                                } else if (mo2478O == 2) {
                                    if (z5) {
                                        throw new ar2("unexpected characters after boundary", null);
                                    }
                                    if (xt7Var.f49032x == 0) {
                                        throw new ar2("expected at least 1 part", null);
                                    }
                                    xt7Var.f49034z = true;
                                } else if (mo2478O == 3 || mo2478O == 4) {
                                    z5 = true;
                                }
                            } else {
                                if (xt7Var.f49032x == 0) {
                                    throw new ar2("expected at least 1 part", null);
                                }
                                z = true;
                                xt7Var.f49034z = true;
                            }
                        }
                        vt7Var = null;
                    }
                    if (vt7Var == null) {
                        return txcVar;
                    }
                    bv9 bv9Var = (bv9) vt7Var.f45085v;
                    this.f51659w = w94Var;
                    this.f51658v = z;
                    if (w94Var.emit(bv9Var, this) == qc2Var) {
                        return qc2Var;
                    }
                    b2 = 6;
                    Object obj522 = az9Var.f2377u;
                    obj522.getClass();
                    xt7Var = (xt7) obj522;
                    l51 l51Var22 = xt7Var.f49030v;
                    p11 p11Var222 = xt7Var.f49029u;
                    if (xt7Var.f49033y) {
                    }
                }
                break;
            case 2:
                pc2 pc2Var = (pc2) this.f51659w;
                boolean z6 = this.f51658v;
                int i2 = 1;
                if (!z6) {
                    v11.m20244z(obj);
                    byte[] bArr = (byte[]) this.f51660x;
                    if (bArr != null) {
                        this.f51659w = pc2Var;
                        this.f51658v = true;
                        gb6 gb6Var = be3.f3179a;
                        k27 k27Var = k27.f21531w;
                        while (true) {
                            int ordinal = k27Var.ordinal();
                            if (ordinal == 0) {
                                String m23788u0 = ztb.m23788u0(bArr);
                                l51 l51Var3 = l51.f23662x;
                                cx5.m5795f(m23788u0).mo9009c("MD5").toString();
                                y96 m16287a = q37.m16287a();
                                m16287a.getClass();
                                c37Var2 = new c37((C0834sv) m16287a.m22748a(C0834sv.Companion.serializer(), m23788u0));
                                break;
                            } else if (ordinal == i2) {
                                c37Var2 = new ae3(bArr).mo487a(this);
                                if (c37Var2 != qc2Var) {
                                    c37Var2 = (c37) c37Var2;
                                    break;
                                }
                            } else if (ordinal == 2) {
                                int i3 = 4;
                                if (4 >= bArr.length) {
                                    arrayList = v90.m20554f0(bArr);
                                } else {
                                    arrayList = new ArrayList(4);
                                    int length2 = bArr.length;
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i4 < length2) {
                                        arrayList.add(Byte.valueOf(bArr[i4]));
                                        i5++;
                                        if (i5 != i3) {
                                            i4++;
                                            i3 = 4;
                                        }
                                    }
                                }
                                k27Var = arrayList.equals(be3.f3180b) ? k27.f21530v : k27.f21529u;
                                i2 = 1;
                            } else {
                                gpc.m8801a();
                            }
                        }
                        return null;
                    }
                    c37Var = null;
                } else {
                    if (!z6) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                    c37Var2 = obj;
                    c37Var = (c37) c37Var2;
                }
                g38 g38Var = (g38) obj4;
                if (c37Var == null) {
                    rf6.m17312i("Failed to load animation ".concat(g38Var.f13400a));
                    return null;
                }
                xa2 xa2Var2 = null;
                jzd.m11709o(pc2Var, null, null, new f38(c37Var, g38Var, xa2Var2, b5), 3);
                jzd.m11709o(pc2Var, null, null, new f38(c37Var, g38Var, xa2Var2, (byte) 1), 3);
                return c37Var;
            case 3:
                boolean z7 = this.f51658v;
                if (z7) {
                    if (z7) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                up6 mo778g = ((dq6) this.f51659w).mo778g();
                C0662o7 c0662o7 = new C0662o7((r78) this.f51660x, (xz8) obj4, null, (byte) 22);
                this.f51658v = true;
                return x20.m21836u(mo778g, sp6.f38949y, c0662o7, this) == qc2Var ? qc2Var : txcVar;
            case 4:
                g9a g9aVar = (g9a) obj4;
                pc2 pc2Var2 = (pc2) this.f51659w;
                boolean z8 = this.f51658v;
                try {
                    if (!z8) {
                        v11.m20244z(obj);
                        n76 m14310o = nld.m14310o((ec2) this.f51660x);
                        this.f51659w = pc2Var2;
                        this.f51658v = true;
                        if (m14310o.mo6989P(this) == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (!z8) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                    }
                    try {
                        return txcVar;
                    } catch (Throwable unused) {
                        return txcVar;
                    }
                } finally {
                    try {
                        g9aVar.close();
                    } catch (Throwable unused2) {
                    }
                }
            case 5:
                PermissionStatusSyncWorker permissionStatusSyncWorker = (PermissionStatusSyncWorker) obj4;
                kl6 kl6Var2 = permissionStatusSyncWorker.f6369B;
                boolean z9 = this.f51658v;
                try {
                    if (!z9) {
                        v11.m20244z(obj);
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18367e(sx7Var, "[PERMISSION] ⏰ Starting permission status sync", "KG_SYNC", 2);
                        if (((PreferencesHelper) kl6Var2.getValue()).getAuthToken().length() == 0) {
                            sx7.m18367e(sx7Var, "[PERMISSION] ⏭️ User not logged in, skipping sync", "KG_SYNC", 2);
                            return new ht6();
                        }
                        String stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) kl6Var2.getValue(), PrefKeys.KEY_DEVICE_MONGODB_ID, null, 2, null);
                        if (stringFromPreferences$default.length() == 0) {
                            sx7.m18370h(2, "[PERMISSION] ⚠️ No device MongoDB ID found, skipping sync", "KG_SYNC");
                            sx7.m18370h(2, "[MONGO_ID] Device MongoDB ID not found in preferences - user may not be fully logged in", "KG_SYNC");
                            return new ht6();
                        }
                        sx7.m18364b(sx7Var, "[PERMISSION]   deviceId=".concat(stringFromPreferences$default), "KG_SYNC", 2);
                        pz8 m16518t = qd7.m16518t(permissionStatusSyncWorker.f21132u);
                        boolean z10 = m16518t.f33582e;
                        boolean z11 = m16518t.f33581d;
                        boolean z12 = m16518t.f33580c;
                        boolean z13 = m16518t.f33578a;
                        boolean z14 = m16518t.f33579b;
                        lz8 lz8Var = z14 ? lz8.GRANTED : lz8.DENIED;
                        kl6Var = kl6Var2;
                        lz8 lz8Var2 = z13 ? lz8.GRANTED : lz8.DENIED;
                        lz8 lz8Var3 = z12 ? lz8.GRANTED : lz8.DENIED;
                        lz8 lz8Var4 = z11 ? lz8.GRANTED : lz8.DENIED;
                        sx7.m18369g(ly6.f25310w, "KG_SYNC", null, "📤 Uploading permissions to server: Notification=" + lz8Var + ", Accessibility=" + lz8Var2 + ", UsageStats=" + lz8Var3 + ", Battery=" + lz8Var4);
                        ls6 m13818g = mv1.m13818g();
                        vz8 vz8Var = vz8.NOTIFICATION;
                        str3 = "[PERMISSION] ❌ Permission status update failed: ";
                        Boolean bool = Boolean.TRUE;
                        str4 = "[PERMISSION] ✅ Successfully updated permission status (";
                        str5 = "KG_SYNC";
                        str6 = "[PERMISSION] ❌ Failed to update permission status: ";
                        try {
                            m13818g.add(new nz8(vz8Var, lz8Var, new ak8(bool), new ak8(z14 ? "Notification permission granted" : "Notification permission denied")));
                            m13818g.add(new nz8(vz8.ACCESSIBILITY, lz8Var2, new ak8(bool), new ak8(z13 ? "Accessibility service enabled" : "Accessibility service not enabled")));
                            m13818g.add(new nz8(vz8.USAGE_STATS, lz8Var3, new ak8(bool), new ak8(z12 ? "Usage stats permission granted" : "Usage stats permission denied")));
                            m13818g.add(new nz8(vz8.BATTERY_OPTIMIZATION, lz8Var4, new ak8(bool), new ak8(z11 ? "Battery optimization disabled (required)" : "Battery optimization enabled (should be disabled)")));
                            m13818g.add(new nz8(vz8.ADMIN, z10 ? lz8.GRANTED : lz8.DENIED, new ak8(Boolean.FALSE), new ak8(z10 ? "Device Admin granted" : "Device Admin not granted")));
                            ls6 m13815d = mv1.m13815d(m13818g);
                            C1058yx c1058yx = (C1058yx) permissionStatusSyncWorker.f6368A.getValue();
                            q0d q0dVar = new q0d(new ak8(stringFromPreferences$default), m13815d);
                            c1058yx.getClass();
                            nu5 nu5Var = new nu5(c1058yx, (oj8) q0dVar);
                            this.f51659w = m16518t;
                            this.f51660x = m13815d;
                            this.f51658v = true;
                            m14483I = nu5Var.m14483I(this);
                            if (m14483I == qc2Var) {
                                return qc2Var;
                            }
                            pz8Var = m16518t;
                            ls6Var = m13815d;
                            r3 = q0dVar;
                        } catch (Exception e) {
                            e = e;
                            str2 = str5;
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18369g(ly6.f25312y, str2, e, "[PERMISSION] ❌ Error syncing permission status");
                            return new gt6();
                        }
                    } else {
                        if (!z9) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ls6Var = (ls6) this.f51660x;
                        pz8Var = (pz8) this.f51659w;
                        v11.m20244z(obj);
                        kl6Var = kl6Var2;
                        str3 = "[PERMISSION] ❌ Permission status update failed: ";
                        str4 = "[PERMISSION] ✅ Successfully updated permission status (";
                        str6 = "[PERMISSION] ❌ Failed to update permission status: ";
                        str5 = "KG_SYNC";
                        m14483I = obj;
                    }
                    C0726py c0726py = (C0726py) m14483I;
                    try {
                        if (c0726py.m16202a()) {
                            List list = c0726py.f33501d;
                            String m16045w0 = list != null ? ps1.m16045w0(list, "; ", null, null, new bv8((byte) 4), 30) : null;
                            sx7 sx7Var3 = sx7.f39332a;
                            sx7.m18366d(2, str6 + m16045w0, str5, null);
                            return new gt6();
                        }
                        String str8 = str5;
                        m0d m0dVar = (m0d) c0726py.f33500c;
                        p0d p0dVar = m0dVar != null ? m0dVar.f25426a : null;
                        if (p0dVar == null || !p0dVar.f31604a) {
                            sx7 sx7Var4 = sx7.f39332a;
                            sx7.m18366d(2, str3 + (p0dVar != null ? p0dVar.f31605b : null), str8, null);
                            return new gt6();
                        }
                        ((PreferencesHelper) kl6Var.getValue()).saveToPreferences(PrefKeys.LAST_REPORTED_PERMISSION_FINGERPRINT, pz8Var.m16221a());
                        sx7.m18367e(sx7.f39332a, str4 + ls6Var.size() + " permissions)", str8, 2);
                        return new ht6();
                    } catch (Exception e2) {
                        e = e2;
                        str2 = r3;
                        sx7 sx7Var22 = sx7.f39332a;
                        sx7.m18369g(ly6.f25312y, str2, e, "[PERMISSION] ❌ Error syncing permission status");
                        return new gt6();
                    }
                } catch (Exception e3) {
                    e = e3;
                    str2 = "KG_SYNC";
                }
                break;
            case 6:
                boolean z15 = this.f51658v;
                if (!z15) {
                    v11.m20244z(obj);
                    this.f51658v = true;
                    return ((wo9) this.f51659w).m21574g0((zbb) this.f51660x, (List) obj4, this) == qc2Var ? qc2Var : txcVar;
                }
                if (z15) {
                    v11.m20244z(obj);
                    return txcVar;
                }
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z16 = this.f51658v;
                if (z16) {
                    if (z16) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                axa axaVar = (axa) this.f51659w;
                C0513k6 c0513k6 = (C0513k6) this.f51660x;
                ua8 ua8Var = new ua8((Object) axaVar, obj4, (byte) 18);
                this.f51658v = true;
                return c0513k6.invoke(ua8Var, this) == qc2Var ? qc2Var : txcVar;
            case 8:
                boolean z17 = this.f51658v;
                if (z17) {
                    if (z17) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                gwa gwaVar = (gwa) this.f51659w;
                bxa bxaVar = (bxa) this.f51660x;
                bxaVar.f4114k = gwaVar;
                axa axaVar2 = bxaVar.f4115l;
                this.f51658v = true;
                return ((jm4) obj4).invoke(axaVar2, this) == qc2Var ? qc2Var : txcVar;
            case 9:
                boolean z18 = this.f51658v;
                if (z18) {
                    if (z18) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                pc2 pc2Var3 = (pc2) this.f51659w;
                km2 m20380z = v48.m20380z(new kn7((vnb) this.f51660x, b3));
                jl1 jl1Var = new jl1((C0718pq) obj4, pc2Var3, b2);
                this.f51658v = true;
                return m20380z.collect(jl1Var, this) == qc2Var ? qc2Var : txcVar;
            case 10:
                zeb zebVar = (zeb) obj4;
                boolean z19 = this.f51658v;
                if (z19) {
                    if (z19) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                k79 k79Var = (k79) this.f51659w;
                veb vebVar = new veb((gu7) this.f51660x, zebVar, null);
                geb gebVar = new geb(zebVar, b3);
                this.f51658v = true;
                return o4c.m14801e(k79Var, null, vebVar, gebVar, this, 3) == qc2Var ? qc2Var : txcVar;
            case 11:
                boolean z20 = this.f51658v;
                if (z20) {
                    if (z20) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                pc2 pc2Var4 = (pc2) this.f51659w;
                jm4 jm4Var = (jm4) this.f51660x;
                jj9 jj9Var = new jj9((iv7) obj4, pc2Var4.getCoroutineContext());
                this.f51658v = true;
                return jm4Var.invoke(jj9Var, this) == qc2Var ? qc2Var : txcVar;
            case 12:
                k8a k8aVar = (k8a) this.f51659w;
                boolean z21 = this.f51658v;
                if (z21) {
                    if (z21) {
                        v11.m20244z(obj);
                        return obj;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                this.f51659w = null;
                this.f51658v = true;
                Object m2961r = cb7.m2961r((wsb) this.f51660x, (zq2) obj4, k8aVar, this);
                return m2961r == qc2Var ? qc2Var : m2961r;
            case 13:
                boolean z22 = this.f51658v;
                if (!z22) {
                    v11.m20244z(obj);
                    fd6Var = ((vvb) this.f51660x).f45172l;
                    this.f51659w = fd6Var;
                    this.f51658v = true;
                    m10559r = iu4.m10559r((C0689oy) obj4);
                    if (m10559r == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (!z22) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fd6Var = (fd6) this.f51659w;
                    v11.m20244z(obj);
                    m10559r = obj;
                }
                ag7.m597n(fd6Var, (f6c) m10559r);
                return txcVar;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                boolean z23 = this.f51658v;
                if (z23) {
                    if (z23) {
                        v11.m20244z(obj);
                        return txcVar;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                ebc ebcVar = (ebc) this.f51659w;
                k79 k79Var2 = (k79) this.f51660x;
                y7c y7cVar = (y7c) obj4;
                this.f51658v = true;
                ebcVar.getClass();
                Object m17211h = ra7.m17211h(k79Var2, new uac(ebcVar, y7cVar), new vac(ebcVar, y7cVar), this);
                if (m17211h != qc2Var) {
                    m17211h = txcVar;
                }
                if (m17211h != qc2Var) {
                    m17211h = txcVar;
                }
                if (m17211h != qc2Var) {
                    m17211h = txcVar;
                }
                return m17211h == qc2Var ? qc2Var : txcVar;
            case ba7.f2964h /* 15 */:
                v11.m20244z(obj);
                pc2 pc2Var5 = (pc2) this.f51659w;
                ebc ebcVar2 = (ebc) this.f51660x;
                k79 k79Var3 = (k79) obj4;
                l8c l8cVar = new l8c(ebcVar2, k79Var3, xa2Var, c);
                sc2 sc2Var = sc2.f38239x;
                jzd.m11709o(pc2Var5, null, sc2Var, l8cVar, 1);
                boolean z24 = this.f51658v;
                jzd.m11709o(pc2Var5, null, sc2Var, new cbc(k79Var3, ebcVar2, z24, (xa2) null), 1).mo6986E0(new vq0(ebcVar2, b4));
                return jzd.m11709o(pc2Var5, null, sc2Var, new cbc(ebcVar2, k79Var3, z24, (xa2) null), 1);
            case 16:
                boolean z25 = this.f51658v;
                if (z25) {
                    if (z25) {
                        v11.m20244z(obj);
                        return obj;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                rb4 rb4Var = new rb4(v48.m20380z(new y7c(this.f51659w, this.f51660x, (byte) c2)), (jw9) obj4, b4);
                this.f51658v = true;
                Object m547n = af2.m547n(rb4Var, this);
                return m547n == qc2Var ? qc2Var : m547n;
            default:
                vl4 vl4Var = (vl4) obj4;
                vic vicVar = (vic) this.f51660x;
                boolean z26 = this.f51658v;
                try {
                    if (!z26) {
                        v11.m20244z(obj);
                        this.f51658v = true;
                        m22258x = xr1.m22258x();
                        if (m22258x == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (!z26) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        m22258x = obj;
                    }
                    g53 g53Var = (g53) m22258x;
                    if (g53Var instanceof e53) {
                        ((wic) vicVar).m21435c("❌ Error: ".concat(((e53) g53Var).f9330a), false);
                    } else if (zy5.m23838d(g53Var, f53.f11157a)) {
                        ((wic) vicVar).m21435c("⚠️ Not supported on this device", false);
                    } else if (!zy5.m23838d(g53Var, f53.f11158b) && !zy5.m23838d(g53Var, f53.f11159c)) {
                        throw new nw1();
                    }
                    return txcVar;
                } catch (Exception unused3) {
                    ((wic) vicVar).m21435c("❌ Failed to Battery optimization", false);
                    return txcVar;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z27(PermissionStatusSyncWorker permissionStatusSyncWorker, xa2 xa2Var) {
        super(2, xa2Var);
        this.f51657u = (byte) 5;
        this.f51661y = permissionStatusSyncWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z27(Object obj, Object obj2, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f51657u = b;
        this.f51660x = obj;
        this.f51661y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z27(Object obj, Object obj2, Object obj3, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f51657u = b;
        this.f51659w = obj;
        this.f51660x = obj2;
        this.f51661y = obj3;
    }
}
