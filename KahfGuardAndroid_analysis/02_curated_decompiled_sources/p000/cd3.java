package p000;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class cd3 implements ad3 {

    /* renamed from: a */
    public final C1058yx f4870a;

    /* renamed from: b */
    public final d48 f4871b;

    /* renamed from: c */
    public final j33 f4872c;

    public cd3(C1058yx c1058yx, d48 d48Var, j33 j33Var) {
        c1058yx.getClass();
        d48Var.getClass();
        j33Var.getClass();
        this.f4870a = c1058yx;
        this.f4871b = d48Var;
        this.f4872c = j33Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        if (r14 == r11) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0034, B:13:0x013e, B:15:0x0146, B:17:0x014a, B:19:0x014e, B:22:0x0159, B:24:0x015d, B:26:0x0165, B:27:0x017a, B:29:0x0168, B:31:0x016e, B:33:0x0172, B:91:0x019b, B:40:0x0049, B:41:0x00bc, B:43:0x00c4, B:45:0x00c8, B:47:0x00ce, B:48:0x00d2, B:50:0x00d8, B:52:0x00e1, B:53:0x00e5, B:57:0x00ed, B:59:0x00f3, B:61:0x0107, B:62:0x011f, B:72:0x004f, B:73:0x008d, B:77:0x0056, B:79:0x0075, B:82:0x007f, B:85:0x01ab), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0034, B:13:0x013e, B:15:0x0146, B:17:0x014a, B:19:0x014e, B:22:0x0159, B:24:0x015d, B:26:0x0165, B:27:0x017a, B:29:0x0168, B:31:0x016e, B:33:0x0172, B:91:0x019b, B:40:0x0049, B:41:0x00bc, B:43:0x00c4, B:45:0x00c8, B:47:0x00ce, B:48:0x00d2, B:50:0x00d8, B:52:0x00e1, B:53:0x00e5, B:57:0x00ed, B:59:0x00f3, B:61:0x0107, B:62:0x011f, B:72:0x004f, B:73:0x008d, B:77:0x0056, B:79:0x0075, B:82:0x007f, B:85:0x01ab), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0034, B:13:0x013e, B:15:0x0146, B:17:0x014a, B:19:0x014e, B:22:0x0159, B:24:0x015d, B:26:0x0165, B:27:0x017a, B:29:0x0168, B:31:0x016e, B:33:0x0172, B:91:0x019b, B:40:0x0049, B:41:0x00bc, B:43:0x00c4, B:45:0x00c8, B:47:0x00ce, B:48:0x00d2, B:50:0x00d8, B:52:0x00e1, B:53:0x00e5, B:57:0x00ed, B:59:0x00f3, B:61:0x0107, B:62:0x011f, B:72:0x004f, B:73:0x008d, B:77:0x0056, B:79:0x0075, B:82:0x007f, B:85:0x01ab), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0034, B:13:0x013e, B:15:0x0146, B:17:0x014a, B:19:0x014e, B:22:0x0159, B:24:0x015d, B:26:0x0165, B:27:0x017a, B:29:0x0168, B:31:0x016e, B:33:0x0172, B:91:0x019b, B:40:0x0049, B:41:0x00bc, B:43:0x00c4, B:45:0x00c8, B:47:0x00ce, B:48:0x00d2, B:50:0x00d8, B:52:0x00e1, B:53:0x00e5, B:57:0x00ed, B:59:0x00f3, B:61:0x0107, B:62:0x011f, B:72:0x004f, B:73:0x008d, B:77:0x0056, B:79:0x0075, B:82:0x007f, B:85:0x01ab), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3021a(String str, za2 za2Var) {
        bd3 bd3Var;
        Object obj;
        int i;
        qc2 qc2Var;
        String str2;
        List list;
        pr4 pr4Var;
        Object obj2;
        qr4 qr4Var;
        String str3;
        szc szcVar;
        bt3 bt3Var;
        szc szcVar2;
        d48 d48Var = this.f4871b;
        try {
            try {
                if (za2Var instanceof bd3) {
                    bd3Var = (bd3) za2Var;
                    int i2 = bd3Var.f3116y;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bd3Var.f3116y = i2 - Integer.MIN_VALUE;
                        obj = bd3Var.f3114w;
                        i = bd3Var.f3116y;
                        C1058yx c1058yx = this.f4870a;
                        qc2Var = qc2.f34309u;
                        if (i != 0) {
                            v11.m20244z(obj);
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18367e(sx7Var, "[DNS_SYNC] 🌐 Starting DNS sync to backend", "KG_SYNC", 2);
                            sx7.m18364b(sx7Var, "[DNS_SYNC]   dnsUrl=" + str, "KG_SYNC", 2);
                            if (((m48) d48Var).m13146k() && ((m48) d48Var).m13143h()) {
                                j33 j33Var = this.f4872c;
                                bd3Var.f3112u = str;
                                bd3Var.f3116y = 1;
                                obj = j33Var.mo705a(bd3Var);
                                if (obj == qc2Var) {
                                    return qc2Var;
                                }
                            }
                            sx7.m18370h(2, "[DNS_SYNC] ❌ No internet connection available", "KG_SYNC");
                            return new tda(new x48());
                        }
                        if (i == 1) {
                            str = bd3Var.f3112u;
                            v11.m20244z(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                v11.m20244z(obj);
                                C0726py c0726py = (C0726py) obj;
                                qzc qzcVar = (qzc) c0726py.f33500c;
                                if (qzcVar != null && (szcVar2 = qzcVar.f35745a) != null && szcVar2.f39451a) {
                                    sx7.m18367e(sx7.f39332a, "[DNS_SYNC] ✅ DNS settings synced successfully to backend", "KG_SYNC", 2);
                                    return txc.f41359a;
                                }
                                List list2 = c0726py.f33501d;
                                if (list2 == null || (bt3Var = (bt3) ps1.m16039q0(list2)) == null) {
                                    qzc qzcVar2 = (qzc) c0726py.f33500c;
                                    str3 = (qzcVar2 == null || (szcVar = qzcVar2.f35745a) == null) ? null : szcVar.f39453c;
                                    if (str3 == null) {
                                        str3 = "Unknown error syncing DNS";
                                    }
                                } else {
                                    str3 = bt3Var.f3930a;
                                }
                                sx7 sx7Var2 = sx7.f39332a;
                                sx7.m18366d(2, "[DNS_SYNC] ❌ Failed to sync DNS settings: " + str3, "KG_SYNC", null);
                                return new tda(new Exception(str3));
                            }
                            str2 = bd3Var.f3113v;
                            str = bd3Var.f3112u;
                            v11.m20244z(obj);
                            or4 or4Var = (or4) ((C0726py) obj).f33500c;
                            list = (or4Var != null || (qr4Var = or4Var.f31064a) == null) ? null : qr4Var.f35236k;
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    pr4 pr4Var2 = (pr4) obj2;
                                    if (zy5.m23838d(pr4Var2 != null ? pr4Var2.f33124b : null, str2)) {
                                        break;
                                    }
                                }
                                pr4Var = (pr4) obj2;
                            } else {
                                pr4Var = null;
                            }
                            if (pr4Var == null) {
                                sx7 sx7Var3 = sx7.f39332a;
                                sx7.m18370h(2, "[DNS_SYNC] ❌ Current device not found in backend", "KG_SYNC");
                                return new tda(new Exception("Device not registered in backend"));
                            }
                            String str4 = pr4Var.f33123a;
                            sx7 sx7Var4 = sx7.f39332a;
                            sx7.m18364b(sx7Var4, "[DNS_SYNC]   Found deviceMongoId=" + str4, "KG_SYNC", 2);
                            sx7.m18364b(sx7Var4, "[DNS_SYNC] 🔄 Executing updateDeviceDnsSettings mutation", "KG_SYNC", 2);
                            tzc tzcVar = new tzc(str4, str);
                            c1058yx.getClass();
                            nu5 nu5Var = new nu5(c1058yx, (oj8) tzcVar);
                            bd3Var.f3112u = null;
                            bd3Var.f3113v = null;
                            bd3Var.f3116y = 3;
                            obj = nu5Var.m14483I(bd3Var);
                        }
                        str2 = (String) obj;
                        sx7.m18364b(sx7.f39332a, "[DNS_SYNC]   Fetching device MongoDB ID for uniqueDeviceId=" + str2, "KG_SYNC", 2);
                        wr4 wr4Var = new wr4();
                        c1058yx.getClass();
                        nu5 nu5Var2 = new nu5(c1058yx, (oj8) wr4Var);
                        bd3Var.f3112u = str;
                        bd3Var.f3113v = str2;
                        bd3Var.f3116y = 2;
                        obj = nu5Var2.m14483I(bd3Var);
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                        or4 or4Var2 = (or4) ((C0726py) obj).f33500c;
                        if (or4Var2 != null) {
                        }
                        if (list != null) {
                        }
                        if (pr4Var == null) {
                        }
                    }
                }
                if (i != 0) {
                }
                str2 = (String) obj;
                sx7.m18364b(sx7.f39332a, "[DNS_SYNC]   Fetching device MongoDB ID for uniqueDeviceId=" + str2, "KG_SYNC", 2);
                wr4 wr4Var2 = new wr4();
                c1058yx.getClass();
                nu5 nu5Var22 = new nu5(c1058yx, (oj8) wr4Var2);
                bd3Var.f3112u = str;
                bd3Var.f3113v = str2;
                bd3Var.f3116y = 2;
                obj = nu5Var22.m14483I(bd3Var);
                if (obj == qc2Var) {
                }
                or4 or4Var22 = (or4) ((C0726py) obj).f33500c;
                if (or4Var22 != null) {
                }
                if (list != null) {
                }
                if (pr4Var == null) {
                }
            } catch (AbstractC0432hy e) {
                sx7 sx7Var5 = sx7.f39332a;
                sx7.m18369g(ly6.f25311x, "KG_SYNC", e, "[DNS_SYNC] ⚠️ Apollo error syncing DNS");
                return new tda(e);
            }
        } catch (Exception e2) {
            sx7 sx7Var6 = sx7.f39332a;
            return sj8.m18099k(ly6.f25312y, "KG_SYNC", e2, "[DNS_SYNC] ❌ Critical error in syncDnsToBackend", e2);
        }
        bd3Var = new bd3(this, za2Var);
        obj = bd3Var.f3114w;
        i = bd3Var.f3116y;
        C1058yx c1058yx2 = this.f4870a;
        qc2Var = qc2.f34309u;
    }
}
