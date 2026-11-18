package p000;

import com.google.firebase.concurrent.GfAS.xsIgieWT;
import com.kahf.dns.utils.PreferencesHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class b53 implements v43, jh6 {

    /* renamed from: u */
    public final C1058yx f2593u;

    /* renamed from: v */
    public final d48 f2594v;

    /* renamed from: w */
    public final j33 f2595w;

    /* renamed from: x */
    public final ew7 f2596x;

    public b53(C1058yx c1058yx, d48 d48Var, j33 j33Var) {
        c1058yx.getClass();
        d48Var.getClass();
        j33Var.getClass();
        this.f2593u = c1058yx;
        this.f2594v = d48Var;
        this.f2595w = j33Var;
        this.f2596x = new ew7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r7 != r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1655b(za2 za2Var) {
        w43 w43Var;
        int i;
        bt3 bt3Var;
        d48 d48Var = this.f2594v;
        try {
            try {
                if (za2Var instanceof w43) {
                    w43Var = (w43) za2Var;
                    int i2 = w43Var.f45678w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        w43Var.f45678w = i2 - Integer.MIN_VALUE;
                        Object obj = w43Var.f45676u;
                        i = w43Var.f45678w;
                        qc2 qc2Var = qc2.f34309u;
                        if (i != 0) {
                            v11.m20244z(obj);
                            if (((m48) d48Var).m13146k() && ((m48) d48Var).m13143h()) {
                                j33 j33Var = this.f2595w;
                                w43Var.f45678w = 1;
                                obj = j33Var.mo705a(w43Var);
                                if (obj == qc2Var) {
                                    return qc2Var;
                                }
                            }
                            return new tda(new x48());
                        }
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            v11.m20244z(obj);
                            C0726py c0726py = (C0726py) obj;
                            c23 c23Var = (c23) c0726py.f33500c;
                            if (c23Var != null) {
                                return new Integer(c23Var.m2583a().m5875a());
                            }
                            List list = c0726py.f33501d;
                            return new tda(new Exception((list == null || (bt3Var = (bt3) ps1.m16039q0(list)) == null) ? "Unknown error on device check-in" : bt3Var.m2429a()));
                        }
                        v11.m20244z(obj);
                        String str = (String) obj;
                        C1058yx c1058yx = this.f2593u;
                        e23 e23Var = new e23(str);
                        c1058yx.getClass();
                        nu5 nu5Var = new nu5(c1058yx, (oj8) e23Var);
                        w43Var.f45678w = 2;
                        obj = nu5Var.m14483I(w43Var);
                    }
                }
                if (i != 0) {
                }
                String str2 = (String) obj;
                C1058yx c1058yx2 = this.f2593u;
                e23 e23Var2 = new e23(str2);
                c1058yx2.getClass();
                nu5 nu5Var2 = new nu5(c1058yx2, (oj8) e23Var2);
                w43Var.f45678w = 2;
                obj = nu5Var2.m14483I(w43Var);
            } catch (AbstractC0432hy e) {
                return new tda(e);
            }
        } catch (Exception e2) {
            return new tda(e2);
        }
        w43Var = new w43(this, za2Var);
        Object obj2 = w43Var.f45676u;
        i = w43Var.f45678w;
        qc2 qc2Var2 = qc2.f34309u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
    
        if (r0 == r15) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[Catch: Exception -> 0x0040, CancellationException -> 0x01f8, TryCatch #3 {CancellationException -> 0x01f8, Exception -> 0x0040, blocks: (B:11:0x003b, B:12:0x0130, B:14:0x013a, B:17:0x0183, B:19:0x0187, B:21:0x01a0, B:23:0x01a8, B:25:0x01b0, B:27:0x01b4, B:29:0x01e1, B:30:0x01e6, B:34:0x004d, B:36:0x0080, B:38:0x0085, B:40:0x0097, B:42:0x00a2, B:45:0x00eb, B:48:0x00f1, B:50:0x00fd, B:51:0x0104, B:53:0x010c, B:54:0x0113, B:57:0x0111, B:60:0x00e5, B:61:0x00bd, B:63:0x0059, B:65:0x0062, B:68:0x006c, B:71:0x01e7, B:44:0x00c2), top: B:7:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: Exception -> 0x0040, CancellationException -> 0x01f8, TryCatch #3 {CancellationException -> 0x01f8, Exception -> 0x0040, blocks: (B:11:0x003b, B:12:0x0130, B:14:0x013a, B:17:0x0183, B:19:0x0187, B:21:0x01a0, B:23:0x01a8, B:25:0x01b0, B:27:0x01b4, B:29:0x01e1, B:30:0x01e6, B:34:0x004d, B:36:0x0080, B:38:0x0085, B:40:0x0097, B:42:0x00a2, B:45:0x00eb, B:48:0x00f1, B:50:0x00fd, B:51:0x0104, B:53:0x010c, B:54:0x0113, B:57:0x0111, B:60:0x00e5, B:61:0x00bd, B:63:0x0059, B:65:0x0062, B:68:0x006c, B:71:0x01e7, B:44:0x00c2), top: B:7:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1657d(String str, String str2, za2 za2Var) {
        y43 y43Var;
        int i;
        String str3;
        String str4;
        String str5;
        Object tdaVar;
        d48 d48Var = this.f2594v;
        try {
            if (za2Var instanceof y43) {
                y43Var = (y43) za2Var;
                int i2 = y43Var.f49658y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    y43Var.f49658y = i2 - Integer.MIN_VALUE;
                    Object obj = y43Var.f49656w;
                    i = y43Var.f49658y;
                    qc2 qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        if (((m48) d48Var).m13146k() && ((m48) d48Var).m13143h()) {
                            j33 j33Var = this.f2595w;
                            str3 = str;
                            y43Var.f49654u = str3;
                            str4 = str2;
                            y43Var.f49655v = str4;
                            y43Var.f49658y = 1;
                            obj = j33Var.mo707c(y43Var);
                            if (obj == qc2Var) {
                                return qc2Var;
                            }
                        }
                        sx7.m18367e(sx7.f39332a, "No internet connection available", "KG_SYNC", 2);
                        return t20.m18493S(new x48());
                    }
                    if (i != 1) {
                        if (i != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        r43 m18497W = t20.m18497W((C0726py) obj);
                        if (m18497W instanceof q43) {
                            d13 m16288a = ((q43) m18497W).m16288a();
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18364b(sx7Var, "[REPO] Device registration SUCCESS - MongoDB ID: " + m16288a.m5851b() + ", Unique ID: " + m16288a.m5852c() + ", Name: " + m16288a.m5850a(), "KG_SYNC", 2);
                            String m5851b = m16288a.m5851b();
                            StringBuilder sb = new StringBuilder("[MONGO_ID] Received MongoDB device ID from backend: ");
                            sb.append(m5851b);
                            sx7.m18364b(sx7Var, sb.toString(), "KG_SYNC", 2);
                            return m18497W;
                        }
                        if (m18497W instanceof p43) {
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18370h(2, "[REPO] Device registration REFUSED: " + ((p43) m18497W).m15487a(), "KG_SYNC");
                            return m18497W;
                        }
                        if (m18497W.equals(n43.f27571a)) {
                            sx7.m18367e(sx7.f39332a, "[REPO] Device registration: already exists for this account", "KG_SYNC", 2);
                            return m18497W;
                        }
                        if (!(m18497W instanceof o43)) {
                            throw new nw1();
                        }
                        sx7 sx7Var3 = sx7.f39332a;
                        sx7.m18366d(2, "[REPO] Device registration FAILED (transient=" + ((o43) m18497W).m14774b() + "): " + ((o43) m18497W).m14773a().getMessage(), "KG_SYNC", null);
                        return m18497W;
                    }
                    String str6 = y43Var.f49655v;
                    String str7 = y43Var.f49654u;
                    v11.m20244z(obj);
                    str4 = str6;
                    str3 = str7;
                    str5 = (String) obj;
                    if (str5 != null) {
                        sx7 sx7Var4 = sx7.f39332a;
                        sx7.m18370h(2, "[DEVICE_ID] No device ID available; not registering", "KG_SYNC");
                        return t20.m18493S(new kd0((byte) 6));
                    }
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18364b(sx7Var5, "[DEVICE_ID] Using unique device ID for registration: ".concat(str5), "KG_SYNC", 2);
                    if (str4 != null) {
                        sx7.m18364b(sx7Var5, "[FCM_TOKEN] Using provided Firebase token for device registration: " + stb.m18283w1(20, str4) + "...", "KG_SYNC", 2);
                    } else {
                        sx7.m18370h(2, "[FCM_TOKEN] No Firebase token provided, registering device without FCM token", "KG_SYNC");
                    }
                    try {
                        tdaVar = ((PreferencesHelper) ((mta) ((d4b) jh6.m11341a().f8644c).f7326y).m13737e(d0a.m5838a(PreferencesHelper.class), null, null)).getStringFromPreferences("kahf_device_hardware_key", "");
                    } catch (Throwable th) {
                        tdaVar = new tda(th);
                    }
                    if (tdaVar instanceof tda) {
                        tdaVar = null;
                    }
                    String m11382A = AbstractC0492jm.m11382A(AbstractC0593mc.m13274I(), (String) tdaVar);
                    if (m11382A != null) {
                        sx7.m18364b(sx7.f39332a, "[DEVICE_KEY] Reporting hardware key on registration", "KG_SYNC", 2);
                    }
                    C1058yx c1058yx = this.f2593u;
                    l14 l14Var = w53.f45723v;
                    gg2 gg2Var = new gg2(str3, str5, str4 != null ? ra7.m17227x(str4) : zj8.f52554g, ra7.m17228y(m11382A));
                    c1058yx.getClass();
                    nu5 nu5Var = new nu5(c1058yx, (oj8) gg2Var);
                    y43Var.f49654u = null;
                    y43Var.f49655v = null;
                    y43Var.f49658y = 2;
                    obj = nu5Var.m14483I(y43Var);
                }
            }
            if (i != 0) {
            }
            str5 = (String) obj;
            if (str5 != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var6 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KG_SYNC", e2, "[REPO] Critical error in registerCurrentDevice");
            return t20.m18493S(e2);
        }
        y43Var = new y43(this, za2Var);
        Object obj2 = y43Var.f49656w;
        i = y43Var.f49658y;
        qc2 qc2Var2 = qc2.f34309u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v3, types: [xo3] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1658e(za2 za2Var, String str, List list) {
        z43 z43Var;
        int i;
        e0d e0dVar;
        bt3 bt3Var;
        g0d m6842a;
        ?? r1;
        d48 d48Var = this.f2594v;
        try {
            try {
                if (za2Var instanceof z43) {
                    z43Var = (z43) za2Var;
                    int i2 = z43Var.f51756x;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        z43Var.f51756x = i2 - Integer.MIN_VALUE;
                        Object obj = z43Var.f51754v;
                        i = z43Var.f51756x;
                        if (i != 0) {
                            v11.m20244z(obj);
                            if (((m48) d48Var).m13146k() && ((m48) d48Var).m13143h()) {
                                ArrayList arrayList = new ArrayList(qs1.m16870Y(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    y33 y33Var = (y33) it.next();
                                    arrayList.add(new jx7(y33Var.m22534a(), y33Var.m22535b()));
                                }
                                C1058yx c1058yx = this.f2593u;
                                h0d h0dVar = new h0d(str, ra7.m17227x(arrayList));
                                c1058yx.getClass();
                                nu5 nu5Var = new nu5(c1058yx, (oj8) h0dVar);
                                z43Var.f51753u = str;
                                z43Var.f51756x = 1;
                                obj = nu5Var.m14483I(z43Var);
                                qc2 qc2Var = qc2.f34309u;
                                if (obj == qc2Var) {
                                    return qc2Var;
                                }
                            }
                            sx7.m18367e(sx7.f39332a, "No internet connection available", "KG_SYNC", 2);
                            return new tda(new x48());
                        }
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = z43Var.f51753u;
                        v11.m20244z(obj);
                        C0726py c0726py = (C0726py) obj;
                        e0dVar = (e0d) c0726py.f33500c;
                        if (e0dVar != null || (m6842a = e0dVar.m6842a()) == null) {
                            List list2 = c0726py.f33501d;
                            String m2429a = (list2 != null || (bt3Var = (bt3) ps1.m16039q0(list2)) == null) ? "Unknown error updating device metadata" : bt3Var.m2429a();
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18366d(2, "Error updating device metadata: " + m2429a, "KG_SYNC", null);
                            return new tda(new Exception(m2429a));
                        }
                        String m8299b = m6842a.m8299b();
                        String m8301d = m6842a.m8301d();
                        String m8298a = m6842a.m8298a();
                        List<f0d> m8300c = m6842a.m8300c();
                        if (m8300c != null) {
                            r1 = new ArrayList(qs1.m16870Y(m8300c, 10));
                            for (f0d f0dVar : m8300c) {
                                f0dVar.getClass();
                                r1.add(new y33(f0dVar.m7564a(), f0dVar.m7565b()));
                            }
                        } else {
                            r1 = xo3.f48775u;
                        }
                        d13 d13Var = new d13(m8299b, m8301d, m8298a, r1);
                        sx7.m18364b(sx7.f39332a, "Successfully updated device metadata for device: " + str, "KG_SYNC", 2);
                        return d13Var;
                    }
                }
                if (i != 0) {
                }
                C0726py c0726py2 = (C0726py) obj;
                e0dVar = (e0d) c0726py2.f33500c;
                if (e0dVar != null) {
                }
                List list22 = c0726py2.f33501d;
                if (list22 != null) {
                }
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18366d(2, "Error updating device metadata: " + m2429a, "KG_SYNC", null);
                return new tda(new Exception(m2429a));
            } catch (AbstractC0432hy e) {
                sx7 sx7Var3 = sx7.f39332a;
                sx7.m18369g(ly6.f25311x, "KG_SYNC", e, "Apollo error updating device metadata");
                return new tda(e);
            }
        } catch (Exception e2) {
            sx7 sx7Var4 = sx7.f39332a;
            return sj8.m18099k(ly6.f25312y, "KG_SYNC", e2, "Critical error in updateDeviceMetadata", e2);
        }
        z43Var = new z43(this, za2Var);
        Object obj2 = z43Var.f51754v;
        i = z43Var.f51756x;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(4:12|13|14|(6:16|(1:26)(1:20)|21|22|23|24)(6:27|(1:33)(1:31)|32|22|23|24))(2:34|35))(6:36|37|38|39|(3:42|14|(0)(0))|41))(1:43))(1:63)|44|45|(3:50|(4:52|38|39|(0))|41)|53|54|23|24))|69|6|7|(0)(0)|44|45|(4:47|50|(0)|41)|53|54|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        r1 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25312y, "KG_SYNC", r0, "[FCM_TOKEN] Critical error in updateFirebaseToken");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019f, code lost:
    
        r0 = new p000.tda(r0);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0178, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a6, code lost:
    
        r2.mo148n(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0072, code lost:
    
        if (r7.mo147b(r6) == r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        r1 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25311x, "KG_SYNC", r0, "[FCM_TOKEN] Apollo error updating Firebase token");
        r4 = new p000.tda(r0);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0044, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee A[Catch: all -> 0x0041, Exception -> 0x0044, hy -> 0x0047, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00e6, B:16:0x00ee, B:18:0x00f2, B:20:0x00fa, B:21:0x0101, B:27:0x0117, B:29:0x011d, B:31:0x0123, B:33:0x0154, B:57:0x0191, B:67:0x0168, B:37:0x0054, B:38:0x009d, B:39:0x00c3), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117 A[Catch: all -> 0x0041, Exception -> 0x0044, hy -> 0x0047, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00e6, B:16:0x00ee, B:18:0x00f2, B:20:0x00fa, B:21:0x0101, B:27:0x0117, B:29:0x011d, B:31:0x0123, B:33:0x0154, B:57:0x0191, B:67:0x0168, B:37:0x0054, B:38:0x009d, B:39:0x00c3), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r2v0, types: [d48] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bw7] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1659f(String str, za2 za2Var) {
        a53 a53Var;
        int i;
        qc2 qc2Var;
        Object tdaVar;
        Object tdaVar2;
        bw7 bw7Var;
        bw7 bw7Var2;
        bw7 bw7Var3;
        String str2;
        Object mo705a;
        String str3;
        bw7 bw7Var4;
        Object m14483I;
        String str4;
        bw7 bw7Var5;
        C0726py c0726py;
        d1d m2574a;
        bt3 bt3Var;
        ?? r2 = this.f2594v;
        try {
            if (za2Var instanceof a53) {
                a53Var = (a53) za2Var;
                int i2 = a53Var.f276z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a53Var.f276z = i2 - Integer.MIN_VALUE;
                    Object obj = a53Var.f274x;
                    i = a53Var.f276z;
                    qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        str2 = str;
                        a53Var.f271u = str2;
                        bw7Var2 = this.f2596x;
                        a53Var.f272v = bw7Var2;
                        a53Var.f276z = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                bw7 bw7Var6 = a53Var.f272v;
                                str3 = a53Var.f271u;
                                v11.m20244z(obj);
                                bw7Var4 = bw7Var6;
                                String str5 = (String) obj;
                                sx7.m18364b(sx7.f39332a, "[FCM_TOKEN] Updating Firebase token for device: " + str5 + ", Token: " + stb.m18283w1(20, str3) + "...", "KG_SYNC", 2);
                                C1058yx c1058yx = this.f2593u;
                                e1d e1dVar = new e1d(str5, str3);
                                c1058yx.getClass();
                                nu5 nu5Var = new nu5(c1058yx, (oj8) e1dVar);
                                a53Var.f271u = null;
                                a53Var.f272v = bw7Var4;
                                a53Var.f273w = str5;
                                a53Var.f276z = 3;
                                m14483I = nu5Var.m14483I(a53Var);
                                if (m14483I != qc2Var) {
                                    obj = m14483I;
                                    str4 = str5;
                                    bw7Var5 = bw7Var4;
                                    c0726py = (C0726py) obj;
                                    if (!c0726py.m16202a()) {
                                    }
                                }
                                return qc2Var;
                            }
                            if (i != 3) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str4 = a53Var.f273w;
                            bw7 bw7Var7 = a53Var.f272v;
                            v11.m20244z(obj);
                            bw7Var5 = bw7Var7;
                            c0726py = (C0726py) obj;
                            if (!c0726py.m16202a()) {
                                List list = c0726py.f33501d;
                                String m2429a = (list == null || (bt3Var = (bt3) ps1.m16039q0(list)) == null) ? "Unknown GraphQL error" : bt3Var.m2429a();
                                sx7 sx7Var = sx7.f39332a;
                                sx7.m18366d(2, "[FCM_TOKEN] Firebase token update FAILED (GraphQL error): ".concat(m2429a), "KG_SYNC", null);
                                tdaVar2 = new tda(new Exception(m2429a));
                                bw7Var3 = bw7Var5;
                                bw7Var2 = bw7Var3;
                                bw7Var2.mo148n(null);
                                return tdaVar2;
                            }
                            c1d c1dVar = (c1d) c0726py.f33500c;
                            if (c1dVar == null || (m2574a = c1dVar.m2574a()) == null) {
                                sx7 sx7Var2 = sx7.f39332a;
                                sx7.m18366d(2, "[FCM_TOKEN] Firebase token update FAILED: no data returned", "KG_SYNC", null);
                                tdaVar = new tda(new Exception("No data returned from updateFirebaseToken mutation"));
                                bw7Var = bw7Var5;
                            } else {
                                tdaVar = new d13(m2574a.m5858b(), m2574a.m5859c(), m2574a.m5857a(), xo3.f48775u);
                                sx7.m18364b(sx7.f39332a, "[FCM_TOKEN] Firebase token update SUCCESS for device: " + str4 + ", MongoDB ID: " + m2574a.m5858b(), "KG_SYNC", 2);
                                bw7Var = bw7Var5;
                            }
                            tdaVar2 = tdaVar;
                            bw7Var3 = bw7Var;
                            bw7Var2 = bw7Var3;
                            bw7Var2.mo148n(null);
                            return tdaVar2;
                        }
                        bw7Var2 = a53Var.f272v;
                        String str6 = a53Var.f271u;
                        v11.m20244z(obj);
                        str2 = str6;
                    }
                    if (((m48) r2).m13146k() && ((m48) r2).m13143h()) {
                        j33 j33Var = this.f2595w;
                        a53Var.f271u = str2;
                        a53Var.f272v = bw7Var2;
                        a53Var.f276z = 2;
                        mo705a = j33Var.mo705a(a53Var);
                        if (mo705a != qc2Var) {
                            bw7 bw7Var8 = bw7Var2;
                            str3 = str2;
                            obj = mo705a;
                            bw7Var4 = bw7Var8;
                            String str52 = (String) obj;
                            sx7.m18364b(sx7.f39332a, "[FCM_TOKEN] Updating Firebase token for device: " + str52 + ", Token: " + stb.m18283w1(20, str3) + "...", "KG_SYNC", 2);
                            C1058yx c1058yx2 = this.f2593u;
                            e1d e1dVar2 = new e1d(str52, str3);
                            c1058yx2.getClass();
                            nu5 nu5Var2 = new nu5(c1058yx2, (oj8) e1dVar2);
                            a53Var.f271u = null;
                            a53Var.f272v = bw7Var4;
                            a53Var.f273w = str52;
                            a53Var.f276z = 3;
                            m14483I = nu5Var2.m14483I(a53Var);
                            if (m14483I != qc2Var) {
                            }
                        }
                        return qc2Var;
                    }
                    sx7.m18367e(sx7.f39332a, "No internet connection available", "KG_SYNC", 2);
                    tdaVar2 = new tda(new x48());
                    bw7Var2.mo148n(null);
                    return tdaVar2;
                }
            }
            if (i != 0) {
            }
            if (((m48) r2).m13146k()) {
                j33 j33Var2 = this.f2595w;
                a53Var.f271u = str2;
                a53Var.f272v = bw7Var2;
                a53Var.f276z = 2;
                mo705a = j33Var2.mo705a(a53Var);
                if (mo705a != qc2Var) {
                }
                return qc2Var;
            }
            sx7.m18367e(sx7.f39332a, "No internet connection available", "KG_SYNC", 2);
            tdaVar2 = new tda(new x48());
            bw7Var2.mo148n(null);
            return tdaVar2;
        } catch (Throwable th) {
            th = th;
        }
        a53Var = new a53(this, za2Var);
        Object obj2 = a53Var.f274x;
        i = a53Var.f276z;
        qc2Var = qc2.f34309u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r12 != r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m1656c(tk8 tk8Var, za2 za2Var) {
        x43 x43Var;
        int i;
        bt3 bt3Var;
        d48 d48Var = this.f2594v;
        try {
            try {
                if (za2Var instanceof x43) {
                    x43Var = (x43) za2Var;
                    int i2 = x43Var.f47634x;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        x43Var.f47634x = i2 - Integer.MIN_VALUE;
                        Object obj = x43Var.f47632v;
                        i = x43Var.f47634x;
                        qc2 qc2Var = qc2.f34309u;
                        if (i != 0) {
                            v11.m20244z(obj);
                            if (((m48) d48Var).m13146k() && ((m48) d48Var).m13143h()) {
                                j33 j33Var = this.f2595w;
                                x43Var.f47631u = tk8Var;
                                x43Var.f47634x = 1;
                                obj = j33Var.mo705a(x43Var);
                                if (obj == qc2Var) {
                                    return qc2Var;
                                }
                            }
                            return new tda(new x48());
                        }
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j(xsIgieWT.HlG);
                                return null;
                            }
                            v11.m20244z(obj);
                            C0726py c0726py = (C0726py) obj;
                            nk8 nk8Var = (nk8) c0726py.f33500c;
                            if (nk8Var != null) {
                                return new Integer(nk8Var.m14250a().m15147a());
                            }
                            List list = c0726py.f33501d;
                            return new tda(new Exception((list == null || (bt3Var = (bt3) ps1.m16039q0(list)) == null) ? "Unknown error on org device check-in" : bt3Var.m2429a()));
                        }
                        tk8Var = x43Var.f47631u;
                        v11.m20244z(obj);
                        String str = (String) obj;
                        C1058yx c1058yx = this.f2593u;
                        pk8 pk8Var = new pk8(str, ra7.m17227x(new uk8(ra7.m17227x(tk8Var.m18885a()), ra7.m17227x(tk8Var.m18887c()), ra7.m17227x(tk8Var.m18886b()), ra7.m17227x(tk8Var.m18889e()))), ra7.m17228y(tk8Var.m18888d()));
                        c1058yx.getClass();
                        nu5 nu5Var = new nu5(c1058yx, (oj8) pk8Var);
                        x43Var.f47631u = null;
                        x43Var.f47634x = 2;
                        obj = nu5Var.m14483I(x43Var);
                    }
                }
                if (i != 0) {
                }
                String str2 = (String) obj;
                C1058yx c1058yx2 = this.f2593u;
                pk8 pk8Var2 = new pk8(str2, ra7.m17227x(new uk8(ra7.m17227x(tk8Var.m18885a()), ra7.m17227x(tk8Var.m18887c()), ra7.m17227x(tk8Var.m18886b()), ra7.m17227x(tk8Var.m18889e()))), ra7.m17228y(tk8Var.m18888d()));
                c1058yx2.getClass();
                nu5 nu5Var2 = new nu5(c1058yx2, (oj8) pk8Var2);
                x43Var.f47631u = null;
                x43Var.f47634x = 2;
                obj = nu5Var2.m14483I(x43Var);
            } catch (AbstractC0432hy e) {
                return new tda(e);
            }
        } catch (Exception e2) {
            return new tda(e2);
        }
        x43Var = new x43(this, za2Var);
        Object obj2 = x43Var.f47632v;
        i = x43Var.f47634x;
        qc2 qc2Var2 = qc2.f34309u;
    }
}
