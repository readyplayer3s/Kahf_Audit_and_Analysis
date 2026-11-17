package p000;

import com.kahf.dns.utils.PreferencesHelper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class jd2 {

    /* renamed from: a */
    public static final jd2 f20210a = new jd2();

    /* renamed from: b */
    public static final long f20211b;

    /* renamed from: c */
    public static final long f20212c;

    /* renamed from: d */
    public static final r2c f20213d;

    /* renamed from: e */
    public static final qa2 f20214e;

    /* renamed from: f */
    public static final ew7 f20215f;

    /* renamed from: g */
    public static yw2 f20216g;

    static {
        f95 f95Var = dj3.f8146v;
        f20211b = qr5.m16842H(7, hj3.DAYS);
        f20212c = qr5.m16842H(30, hj3.MINUTES);
        f20213d = new r2c(new f32((byte) 18));
        q0c m18375J = sy0.m18375J();
        vu2 vu2Var = k83.f21845a;
        f20214e = muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v));
        f20215f = new ew7();
    }

    /* renamed from: e */
    public static boolean m11099e(PreferencesHelper preferencesHelper, long j) {
        String stringFromPreferences = preferencesHelper.getStringFromPreferences("pref_ip_country_name", "");
        if (!stb.m18260Z0(stringFromPreferences) && !stringFromPreferences.equalsIgnoreCase("null")) {
            if (!bd2.f3111b.contains(stringFromPreferences)) {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18370h(2, "stored ip country '" + stringFromPreferences + "' is not a canonical name — re-detecting", "CountryDetector");
                return false;
            }
            long longFromPreferences = preferencesHelper.getLongFromPreferences("pref_ip_country_detected_at", 0L);
            if (longFromPreferences == 0) {
                preferencesHelper.saveToPreferences("pref_ip_country_detected_at", j);
                return true;
            }
            if (1 <= longFromPreferences && longFromPreferences <= j && j - longFromPreferences < dj3.m6348f(f20211b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: Exception -> 0x003b, CancellationException -> 0x00c0, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c0, Exception -> 0x003b, blocks: (B:11:0x0035, B:13:0x00a7, B:17:0x00ac, B:22:0x0047, B:25:0x0058, B:28:0x0063, B:30:0x0069, B:32:0x0071, B:36:0x0081, B:38:0x008d, B:40:0x0095), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11100a(PreferencesHelper preferencesHelper, d48 d48Var, za2 za2Var) {
        fd2 fd2Var;
        int i;
        txc txcVar;
        long m22370e;
        String str;
        PreferencesHelper preferencesHelper2 = preferencesHelper;
        try {
            if (za2Var instanceof fd2) {
                fd2Var = (fd2) za2Var;
                int i2 = fd2Var.f11689y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fd2Var.f11689y = i2 - Integer.MIN_VALUE;
                    Object obj = fd2Var.f11687w;
                    i = fd2Var.f11689y;
                    txcVar = txc.f41359a;
                    if (i != 0) {
                        v11.m20244z(obj);
                        m22370e = zv5.f53149a.mo2814g().m22370e();
                        if (!m11099e(preferencesHelper2, m22370e)) {
                            m48 m48Var = (m48) d48Var;
                            if (m48Var.m13145j()) {
                                if (m48Var.m13144i()) {
                                    sx7.m18364b(sx7.f39332a, "VPN active — skipping IP country detection", "CountryDetector", 2);
                                    return txcVar;
                                }
                                long longFromPreferences = preferencesHelper2.getLongFromPreferences("pref_ip_country_last_attempt_at", 0L);
                                if (1 <= longFromPreferences && longFromPreferences <= m22370e && m22370e - longFromPreferences < dj3.m6348f(f20212c)) {
                                    sx7.m18364b(sx7.f39332a, "Country detection attempted recently — backing off", "CountryDetector", 2);
                                    return txcVar;
                                }
                                preferencesHelper2.saveToPreferences("pref_ip_country_last_attempt_at", m22370e);
                                fd2Var.f11685u = preferencesHelper2;
                                fd2Var.f11686v = m22370e;
                                fd2Var.f11689y = 1;
                                obj = m11101b(fd2Var);
                                Object obj2 = qc2.f34309u;
                                if (obj == obj2) {
                                    return obj2;
                                }
                            }
                        }
                        return txcVar;
                    }
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = fd2Var.f11686v;
                    PreferencesHelper preferencesHelper3 = fd2Var.f11685u;
                    v11.m20244z(obj);
                    m22370e = j;
                    preferencesHelper2 = preferencesHelper3;
                    str = (String) obj;
                    if (str != null) {
                        preferencesHelper2.saveToPreferences("pref_ip_country_name", str);
                        preferencesHelper2.saveToPreferences("pref_ip_country_detected_at", m22370e);
                        sx7.m18364b(sx7.f39332a, "stored ip country: ".concat(str), "CountryDetector", 2);
                        return txcVar;
                    }
                    return txcVar;
                }
            }
            if (i != 0) {
            }
            str = (String) obj;
            if (str != null) {
            }
            return txcVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("Country detection failed: ", e2.getMessage(), null, "CountryDetector", 2);
            return txcVar;
        }
        fd2Var = new fd2(this, za2Var);
        Object obj3 = fd2Var.f11687w;
        i = fd2Var.f11689y;
        txcVar = txc.f41359a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r9 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r9 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r9 == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11101b(za2 za2Var) {
        gd2 gd2Var;
        int i;
        String str;
        if (za2Var instanceof gd2) {
            gd2Var = (gd2) za2Var;
            int i2 = gd2Var.f13928w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gd2Var.f13928w = i2 - Integer.MIN_VALUE;
                Object obj = gd2Var.f13926u;
                i = gd2Var.f13928w;
                Object obj2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    sx7.m18364b(sx7.f39332a, "Starting country detection", "CountryDetector", 2);
                    gd2Var.f13928w = 1;
                    obj = m11103d("ipwho.is", "https://ipwho.is/", new C0289e3((byte) 27), gd2Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            v11.m20244z(obj);
                            str = (String) obj;
                            if (str == null) {
                                gd2Var.f13928w = 3;
                                obj = m11103d("db-ip.com", "https://api.db-ip.com/v2/free/self", new e42((byte) 4), gd2Var);
                            }
                            return str;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                v11.m20244z(obj);
                                return obj;
                            }
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        str = (String) obj;
                        if (str == null) {
                            gd2Var.f13928w = 4;
                            Object m11103d = m11103d("ipinfo.io", "https://ipinfo.io/json", new e42((byte) 5), gd2Var);
                            return m11103d == obj2 ? obj2 : m11103d;
                        }
                        return str;
                    }
                    v11.m20244z(obj);
                }
                str = (String) obj;
                if (str == null) {
                    gd2Var.f13928w = 2;
                    obj = m11103d("freeipapi.com", "https://free.freeipapi.com/api/json", new e42((byte) 6), gd2Var);
                }
                return str;
            }
        }
        gd2Var = new gd2(this, za2Var);
        Object obj3 = gd2Var.f13926u;
        i = gd2Var.f13928w;
        Object obj22 = qc2.f34309u;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str == null) {
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(1:40)|21|22|(5:24|(1:26)(1:33)|(1:28)|29|30)|34|29|30))|43|6|7|(0)(0)|21|22|(0)|34|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r9.m21148w(r0) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        if (r6.mo147b(r0) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        p000.nld.m14307l(r0.getContext());
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:22:0x0055, B:24:0x0059, B:34:0x0066), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11102c(PreferencesHelper preferencesHelper, d48 d48Var, za2 za2Var) {
        hd2 hd2Var;
        int i;
        ew7 ew7Var;
        yw2 yw2Var;
        try {
            if (za2Var instanceof hd2) {
                hd2Var = (hd2) za2Var;
                int i2 = hd2Var.f16016z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hd2Var.f16016z = i2 - Integer.MIN_VALUE;
                    Object obj = hd2Var.f16014x;
                    i = hd2Var.f16016z;
                    xa2 xa2Var = null;
                    qc2 qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        hd2Var.f16011u = preferencesHelper;
                        hd2Var.f16012v = d48Var;
                        ew7Var = f20215f;
                        hd2Var.f16013w = ew7Var;
                        hd2Var.f16016z = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            v11.m20244z(obj);
                            return txc.f41359a;
                        }
                        ew7 ew7Var2 = hd2Var.f16013w;
                        d48Var = hd2Var.f16012v;
                        PreferencesHelper preferencesHelper2 = hd2Var.f16011u;
                        v11.m20244z(obj);
                        ew7Var = ew7Var2;
                        preferencesHelper = preferencesHelper2;
                    }
                    yw2Var = f20216g;
                    if (yw2Var != null) {
                        if (!yw2Var.isActive()) {
                            yw2Var = null;
                        }
                        if (yw2Var == null) {
                        }
                        ew7Var.mo148n(null);
                        hd2Var.f16011u = null;
                        hd2Var.f16012v = null;
                        hd2Var.f16013w = null;
                        hd2Var.f16016z = 2;
                    }
                    yw2Var = jzd.m11698d(f20214e, null, new C0853td(preferencesHelper, d48Var, xa2Var, (byte) 7), 3);
                    f20216g = yw2Var;
                    ew7Var.mo148n(null);
                    hd2Var.f16011u = null;
                    hd2Var.f16012v = null;
                    hd2Var.f16013w = null;
                    hd2Var.f16016z = 2;
                }
            }
            yw2Var = f20216g;
            if (yw2Var != null) {
            }
            yw2Var = jzd.m11698d(f20214e, null, new C0853td(preferencesHelper, d48Var, xa2Var, (byte) 7), 3);
            f20216g = yw2Var;
            ew7Var.mo148n(null);
            hd2Var.f16011u = null;
            hd2Var.f16012v = null;
            hd2Var.f16013w = null;
            hd2Var.f16016z = 2;
        } catch (Throwable th) {
            ew7Var.mo148n(null);
            throw th;
        }
        hd2Var = new hd2(this, za2Var);
        Object obj2 = hd2Var.f16014x;
        i = hd2Var.f16016z;
        xa2 xa2Var2 = null;
        qc2 qc2Var2 = qc2.f34309u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010c, code lost:
    
        if (r9.equalsIgnoreCase("null") == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed A[Catch: Exception -> 0x0036, CancellationException -> 0x012e, TryCatch #1 {CancellationException -> 0x012e, blocks: (B:13:0x0031, B:14:0x00d1, B:16:0x00ed, B:18:0x00f7, B:21:0x00fe, B:23:0x0106, B:25:0x010f, B:37:0x0048, B:38:0x0082, B:44:0x009a, B:46:0x00ba, B:52:0x0052), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[Catch: Exception -> 0x004c, CancellationException -> 0x012e, TryCatch #0 {Exception -> 0x004c, blocks: (B:37:0x0048, B:38:0x0082, B:44:0x009a, B:46:0x00ba, B:52:0x0052), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: Exception -> 0x004c, CancellationException -> 0x012e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004c, blocks: (B:37:0x0048, B:38:0x0082, B:44:0x009a, B:46:0x00ba, B:52:0x0052), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11103d(String str, String str2, vl4 vl4Var, za2 za2Var) {
        id2 id2Var;
        int i;
        boolean z;
        int i2;
        String str3;
        x96 x96Var;
        vl4 vl4Var2;
        String str4;
        String str5;
        try {
            try {
                if (za2Var instanceof id2) {
                    id2Var = (id2) za2Var;
                    int i3 = id2Var.f18075z;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        id2Var.f18075z = i3 - Integer.MIN_VALUE;
                        Object obj = id2Var.f18073x;
                        i = id2Var.f18075z;
                        z = true;
                        qc2 qc2Var = qc2.f34309u;
                        if (i != 0) {
                            v11.m20244z(obj);
                            wf5 wf5Var = (wf5) f20213d.getValue();
                            mi5 mi5Var = new mi5();
                            ub0 ub0Var = ni5.f28331a;
                            str2.getClass();
                            xvc.m22376c(mi5Var.f26422a, str2);
                            mi5Var.m13440b(mh5.f26375b);
                            x30 x30Var = new x30(mi5Var, wf5Var);
                            id2Var.f18070u = str;
                            id2Var.f18071v = vl4Var;
                            id2Var.f18072w = null;
                            id2Var.f18075z = 1;
                            obj = x30Var.m21852I(id2Var);
                            if (obj == qc2Var) {
                                return qc2Var;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                x96Var = id2Var.f18072w;
                                vl4Var2 = id2Var.f18071v;
                                str3 = id2Var.f18070u;
                                try {
                                    v11.m20244z(obj);
                                    String str6 = (String) obj;
                                    x96Var.getClass();
                                    str6.getClass();
                                    str4 = (String) vl4Var2.invoke(xa6.m21956f((va6) x96Var.m22748a(za6.f52030a, str6)));
                                    if (str4 != null) {
                                        str5 = stb.m18242B1(str4).toString();
                                        if (str5 != null) {
                                            if (str5.length() == 0) {
                                                if (!str5.equals("-")) {
                                                }
                                            }
                                        }
                                    }
                                    str5 = null;
                                    sx7.m18364b(sx7.f39332a, "country: " + str5 + " (from " + str3 + ")", "CountryDetector", 2);
                                    return str5;
                                } catch (Exception e) {
                                    e = e;
                                    str = str3;
                                    sx7 sx7Var = sx7.f39332a;
                                    sx7.m18366d(2, tz6.m19197A(str, " failed: ", e.getMessage()), "CountryDetector", null);
                                    return null;
                                }
                            }
                            vl4Var = id2Var.f18071v;
                            str = id2Var.f18070u;
                            v11.m20244z(obj);
                        }
                        zi5 zi5Var = (zi5) obj;
                        sj5 mo11636e = zi5Var.mo11636e();
                        mo11636e.getClass();
                        i2 = mo11636e.f38594u;
                        if (200 <= i2 || i2 >= 300) {
                            z = false;
                        }
                        if (z) {
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18370h(2, str + " returned HTTP " + zi5Var.mo11636e().f38594u, "CountryDetector");
                            return null;
                        }
                        x96 x96Var2 = y96.f49965d;
                        id2Var.f18070u = str;
                        id2Var.f18071v = vl4Var;
                        id2Var.f18072w = x96Var2;
                        id2Var.f18075z = 2;
                        obj = i30.m9933l(zi5Var, zc1.f52140a, id2Var);
                        if (obj != qc2Var) {
                            vl4 vl4Var3 = vl4Var;
                            str3 = str;
                            x96Var = x96Var2;
                            vl4Var2 = vl4Var3;
                            String str62 = (String) obj;
                            x96Var.getClass();
                            str62.getClass();
                            str4 = (String) vl4Var2.invoke(xa6.m21956f((va6) x96Var.m22748a(za6.f52030a, str62)));
                            if (str4 != null) {
                            }
                            str5 = null;
                            sx7.m18364b(sx7.f39332a, "country: " + str5 + " (from " + str3 + ")", "CountryDetector", 2);
                            return str5;
                        }
                        return qc2Var;
                    }
                }
                if (i != 0) {
                }
                zi5 zi5Var2 = (zi5) obj;
                sj5 mo11636e2 = zi5Var2.mo11636e();
                mo11636e2.getClass();
                i2 = mo11636e2.f38594u;
                if (200 <= i2) {
                }
                z = false;
                if (z) {
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        id2Var = new id2(this, za2Var);
        Object obj2 = id2Var.f18073x;
        i = id2Var.f18075z;
        z = true;
        qc2 qc2Var2 = qc2.f34309u;
    }
}
