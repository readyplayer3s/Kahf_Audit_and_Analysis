package p000;

import com.google.android.datatransport.cct.p013Yv.EtVGdIOx;
import com.google.android.gms.measurement.internal.jhdS.jcRNFy;
import com.kahf.dns.core.analytics.AnalyticsEvent;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class nb3 {

    /* renamed from: a */
    public final yj2 f27993a;

    /* renamed from: b */
    public final d48 f27994b;

    /* renamed from: c */
    public final PreferencesHelper f27995c;

    /* renamed from: d */
    public final C1001xd f27996d;

    public nb3(yj2 yj2Var, d48 d48Var, PreferencesHelper preferencesHelper, C1001xd c1001xd) {
        yj2Var.getClass();
        d48Var.getClass();
        preferencesHelper.getClass();
        c1001xd.getClass();
        this.f27993a = yj2Var;
        this.f27994b = d48Var;
        this.f27995c = preferencesHelper;
        this.f27996d = c1001xd;
    }

    /* renamed from: c */
    public static boolean m14123c(String str) {
        boolean z;
        if (!str.equals("unknown") && !stb.m18260Z0(str)) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                if (!Character.isDigit(str.charAt(i))) {
                    i++;
                } else if (stb.m18247M0(str, '.') || stb.m18247M0(str, ':')) {
                    z = true;
                }
            }
            z = false;
            int length = str.length();
            boolean z2 = 7 <= length && length < 46;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(15:13|14|15|16|17|(2:19|(9:21|22|(1:24)(1:40)|25|(1:27)(1:39)|28|(1:30)|31|32))|42|22|(0)(0)|25|(0)(0)|28|(0)|31|32)(2:43|44))(9:45|46|47|48|(1:58)(1:52)|(3:54|(10:57|16|17|(0)|42|22|(0)(0)|25|(0)(0)|28)|56)|(0)|31|32))(6:59|60|61|62|63|(2:65|56)(8:66|48|(1:50)|58|(0)|(0)|31|32)))(1:67))(5:79|80|81|82|(2:84|56))|68|69|(1:71)|72|(2:74|(2:76|56)(5:77|61|62|63|(0)(0)))(3:78|63|(0)(0))))|89|6|7|(0)(0)|68|69|(0)|72|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0166, code lost:
    
        r1 = p000.sx7.f39332a;
        p000.sj8.m18114z("isDnsUnsafe: Error - ", r0.getMessage(), p000.ly6.f25312y, "DnsSafetyManager", null);
        r2 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd A[Catch: Exception -> 0x0054, CancellationException -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0057, blocks: (B:14:0x0049, B:19:0x00fd, B:46:0x0068, B:50:0x00d3, B:60:0x0073, B:61:0x00ac, B:67:0x0077, B:74:0x0099, B:80:0x007e), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc A[Catch: Exception -> 0x0054, CancellationException -> 0x0163, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0163, blocks: (B:17:0x00f5, B:22:0x0107, B:25:0x011c, B:28:0x0133, B:48:0x00cf, B:54:0x00dc, B:63:0x00bc, B:68:0x0088, B:72:0x008f, B:78:0x00b4, B:82:0x0080), top: B:81:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0099 A[Catch: Exception -> 0x0054, CancellationException -> 0x0057, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0057, blocks: (B:14:0x0049, B:19:0x00fd, B:46:0x0068, B:50:0x00d3, B:60:0x0073, B:61:0x00ac, B:67:0x0077, B:74:0x0099, B:80:0x007e), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b4 A[Catch: Exception -> 0x0054, CancellationException -> 0x0163, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0163, blocks: (B:17:0x00f5, B:22:0x0107, B:25:0x011c, B:28:0x0133, B:48:0x00cf, B:54:0x00dc, B:63:0x00bc, B:68:0x0088, B:72:0x008f, B:78:0x00b4, B:82:0x0080), top: B:81:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14124a(za2 za2Var) {
        ib3 ib3Var;
        int i;
        int i2;
        Throwable th;
        String str;
        String stringFromPreferences;
        String str2;
        boolean m18246L0;
        String str3;
        Object m14127e;
        String str4;
        String str5;
        boolean z;
        String str6;
        oa3 oa3Var;
        boolean z2;
        PreferencesHelper preferencesHelper = this.f27995c;
        try {
            if (za2Var instanceof ib3) {
                ib3Var = (ib3) za2Var;
                int i3 = ib3Var.f17854B;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ib3Var.f17854B = i3 - Integer.MIN_VALUE;
                    Object obj = ib3Var.f17860z;
                    i = ib3Var.f17854B;
                    ly6 ly6Var = ly6.f25309v;
                    yj2 yj2Var = this.f27993a;
                    Object obj2 = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        ib3Var.f17854B = 1;
                        try {
                            obj = yj2Var.m22881g(ib3Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } catch (CancellationException e) {
                            e = e;
                            th = null;
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18369g(ly6Var, "DNS_TRACE", th, "isDnsUnsafe: Cancelled");
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                str3 = ib3Var.f17856v;
                                str2 = ib3Var.f17855u;
                                v11.m20244z(obj);
                                m18246L0 = ((Boolean) obj).booleanValue();
                                stringFromPreferences = str3;
                                ib3Var.f17855u = str2;
                                ib3Var.f17856v = stringFromPreferences;
                                ib3Var.f17858x = m18246L0;
                                ib3Var.f17854B = 3;
                                m14127e = m14127e(ib3Var);
                                if (m14127e == obj2) {
                                    return obj2;
                                }
                                str4 = str2;
                                str5 = stringFromPreferences;
                                z = m18246L0;
                                obj = m14127e;
                                oa3 oa3Var2 = (oa3) obj;
                                if (z) {
                                }
                                if (i2 != 0) {
                                }
                                return Boolean.valueOf(i2 != 0);
                            }
                            if (i == 3) {
                                boolean z3 = ib3Var.f17858x;
                                String str7 = ib3Var.f17856v;
                                str4 = ib3Var.f17855u;
                                v11.m20244z(obj);
                                str5 = str7;
                                z = z3;
                                oa3 oa3Var22 = (oa3) obj;
                                i2 = (z || !oa3Var22.f29956o) ? 0 : 1;
                                if (i2 != 0) {
                                    ib3Var.f17855u = str4;
                                    ib3Var.f17856v = str5;
                                    ib3Var.f17857w = oa3Var22;
                                    ib3Var.f17858x = z;
                                    ib3Var.f17859y = i2;
                                    ib3Var.f17854B = 4;
                                    Object m14126d = m14126d(ib3Var);
                                    if (m14126d != obj2) {
                                        str6 = str4;
                                        oa3Var = oa3Var22;
                                        obj = m14126d;
                                        boolean z4 = z;
                                        String str8 = str5;
                                        String str9 = (String) obj;
                                        if (oa3Var.f29942a) {
                                        }
                                        z2 = true;
                                        String str10 = str6;
                                        boolean z5 = z2;
                                        this.f27996d.m22025b(new AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun(oa3Var.m14890a(), str10, str8, str9, z4, i2 != 0, z2, false, 128, null));
                                        sx7 sx7Var2 = sx7.f39332a;
                                        if (i2 != 0) {
                                        }
                                        sx7.m18369g(ly6Var, "DNS_TRACE", null, "Analytics logged: isDnsFailure=" + (i2 != 0) + ", capturedOffline=" + z5);
                                        sx7.m18371i("DnsSafetyManager", new hb3(str10, str8, z4, oa3Var, str9));
                                    }
                                    return obj2;
                                }
                                return Boolean.valueOf(i2 != 0);
                            }
                            if (i != 4) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = ib3Var.f17859y;
                            z = ib3Var.f17858x;
                            oa3Var = ib3Var.f17857w;
                            str5 = ib3Var.f17856v;
                            String str11 = ib3Var.f17855u;
                            v11.m20244z(obj);
                            str6 = str11;
                            boolean z42 = z;
                            String str82 = str5;
                            String str92 = (String) obj;
                            if (oa3Var.f29942a) {
                                if (oa3Var.f29943b) {
                                    z2 = false;
                                    String str102 = str6;
                                    boolean z52 = z2;
                                    this.f27996d.m22025b(new AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun(oa3Var.m14890a(), str102, str82, str92, z42, i2 != 0, z2, false, 128, null));
                                    sx7 sx7Var22 = sx7.f39332a;
                                    sx7.m18369g(ly6Var, "DNS_TRACE", null, "Analytics logged: isDnsFailure=" + (i2 != 0) + ", capturedOffline=" + z52);
                                    sx7.m18371i("DnsSafetyManager", new hb3(str102, str82, z42, oa3Var, str92));
                                    return Boolean.valueOf(i2 != 0);
                                }
                            }
                            z2 = true;
                            String str1022 = str6;
                            boolean z522 = z2;
                            this.f27996d.m22025b(new AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun(oa3Var.m14890a(), str1022, str82, str92, z42, i2 != 0, z2, false, 128, null));
                            sx7 sx7Var222 = sx7.f39332a;
                            if (i2 != 0) {
                            }
                            sx7.m18369g(ly6Var, "DNS_TRACE", null, "Analytics logged: isDnsFailure=" + (i2 != 0) + ", capturedOffline=" + z522);
                            sx7.m18371i("DnsSafetyManager", new hb3(str1022, str82, z42, oa3Var, str92));
                            return Boolean.valueOf(i2 != 0);
                        }
                        v11.m20244z(obj);
                    }
                    str = (String) obj;
                    if (str == null) {
                        str = "unknown";
                    }
                    stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
                    if (str.equals("unknown")) {
                        preferencesHelper.saveToPreferences(PrefKeys.LAST_KNOWN_DNS, str);
                        ib3Var.f17855u = str;
                        ib3Var.f17856v = stringFromPreferences;
                        ib3Var.f17854B = 2;
                        Object m22882h = yj2Var.m22882h(ib3Var);
                        if (m22882h == obj2) {
                            return obj2;
                        }
                        str2 = str;
                        obj = m22882h;
                        str3 = stringFromPreferences;
                        m18246L0 = ((Boolean) obj).booleanValue();
                        stringFromPreferences = str3;
                        ib3Var.f17855u = str2;
                        ib3Var.f17856v = stringFromPreferences;
                        ib3Var.f17858x = m18246L0;
                        ib3Var.f17854B = 3;
                        m14127e = m14127e(ib3Var);
                        if (m14127e == obj2) {
                        }
                    } else {
                        str2 = str;
                        m18246L0 = stb.m18246L0(stringFromPreferences, "kahf", false);
                        ib3Var.f17855u = str2;
                        ib3Var.f17856v = stringFromPreferences;
                        ib3Var.f17858x = m18246L0;
                        ib3Var.f17854B = 3;
                        m14127e = m14127e(ib3Var);
                        if (m14127e == obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            str = (String) obj;
            if (str == null) {
            }
            stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
            if (str.equals("unknown")) {
            }
        } catch (CancellationException e2) {
            e = e2;
            th = null;
        }
        ib3Var = new ib3(this, za2Var);
        Object obj3 = ib3Var.f17860z;
        i = ib3Var.f17854B;
        ly6 ly6Var2 = ly6.f25309v;
        yj2 yj2Var2 = this.f27993a;
        Object obj22 = qc2.f34309u;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|27|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r5 = p000.sx7.f39332a;
        p000.sj8.m18114z("isKahfDnsSet: Error - ", r4.getMessage(), p000.ly6.f25312y, "DnsSafetyManager", null);
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14125b(za2 za2Var) {
        jb3 jb3Var;
        int i;
        if (za2Var instanceof jb3) {
            jb3Var = (jb3) za2Var;
            int i2 = jb3Var.f20013w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jb3Var.f20013w = i2 - Integer.MIN_VALUE;
                Object obj = jb3Var.f20011u;
                i = jb3Var.f20013w;
                if (i != 0) {
                    v11.m20244z(obj);
                    yj2 yj2Var = this.f27993a;
                    jb3Var.f20013w = 1;
                    obj = yj2Var.m22882h(jb3Var);
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
                boolean z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        jb3Var = new jb3(this, za2Var);
        Object obj2 = jb3Var.f20011u;
        i = jb3Var.f20013w;
        if (i != 0) {
        }
        boolean z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[PHI: r6
  0x005f: PHI (r6v8 java.lang.String) = (r6v4 java.lang.String), (r6v10 java.lang.String) binds: [B:20:0x0040, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14126d(za2 za2Var) {
        kb3 kb3Var;
        int i;
        String stringFromPreferences;
        if (za2Var instanceof kb3) {
            kb3Var = (kb3) za2Var;
            int i2 = kb3Var.f22064w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kb3Var.f22064w = i2 - Integer.MIN_VALUE;
                Object obj = kb3Var.f22062u;
                i = kb3Var.f22064w;
                if (i != 0) {
                    v11.m20244z(obj);
                    stringFromPreferences = this.f27995c.getStringFromPreferences(PrefKeys.LAST_KNOWN_IP, "");
                    if (stb.m18260Z0(stringFromPreferences)) {
                        stringFromPreferences = null;
                    }
                    if (stringFromPreferences == null) {
                        kb3Var.f22064w = 1;
                        m48 m48Var = (m48) this.f27994b;
                        obj = jzd.m11694F(m48Var.f25602d, new C1061z(m48Var, null), kb3Var);
                        qc2 qc2Var = qc2.f34309u;
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    }
                }
                if (i != 1) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                stringFromPreferences = (String) obj;
                return stringFromPreferences != null ? "unknown" : stringFromPreferences;
            }
        }
        kb3Var = new kb3(this, za2Var);
        Object obj2 = kb3Var.f22062u;
        i = kb3Var.f22064w;
        if (i != 0) {
        }
        stringFromPreferences = (String) obj2;
        if (stringFromPreferences != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14127e(za2 za2Var) {
        lb3 lb3Var;
        int i;
        ly6 ly6Var;
        try {
            if (za2Var instanceof lb3) {
                lb3Var = (lb3) za2Var;
                int i2 = lb3Var.f24058w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lb3Var.f24058w = i2 - Integer.MIN_VALUE;
                    Object obj = lb3Var.f24056u;
                    i = lb3Var.f24058w;
                    ly6Var = ly6.f25309v;
                    if (i != 0) {
                        v11.m20244z(obj);
                        d48 d48Var = this.f27994b;
                        lb3Var.f24058w = 1;
                        m48 m48Var = (m48) d48Var;
                        m48Var.getClass();
                        vu2 vu2Var = k83.f21845a;
                        obj = jzd.m11694F(dt2.f8706v, new gh3(m48Var, null), lb3Var);
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
                    oa3 oa3Var = (oa3) obj;
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18369g(ly6Var, "DNS_TRACE", null, "DnsSafetyManager: Diagnostic completed - status=" + oa3Var.f29957p);
                    return oa3Var;
                }
            }
            if (i != 0) {
            }
            oa3 oa3Var2 = (oa3) obj;
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6Var, "DNS_TRACE", null, "DnsSafetyManager: Diagnostic completed - status=" + oa3Var2.f29957p);
            return oa3Var2;
        } catch (CancellationException e) {
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6Var, "DNS_TRACE", null, "runDiagnostics: Cancelled");
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var4 = sx7.f39332a;
            sj8.m18114z("runDiagnostics: Error - ", e2.getMessage(), ly6.f25312y, "DnsSafetyManager", null);
            String message = e2.getMessage();
            return new oa3(false, false, "unknown", false, false, -1L, false, -1L, false, null, null, false, null, false, false, "error", sj8.m18102n("Exception in DnsSafetyManager: ", message), zv5.f53149a.mo2814g().m22370e(), -1L, 0, "unknown", "unknown", message);
        }
        lb3Var = new lb3(this, za2Var);
        Object obj2 = lb3Var.f24056u;
        i = lb3Var.f24058w;
        ly6Var = ly6.f25309v;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:21|22))(5:23|24|(3:26|27|(1:29))|18|19)|11|(1:13)|14|(1:16)|18|19))|34|6|7|(0)(0)|11|(0)|14|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r8 = p000.sx7.f39332a;
        p000.sj8.m18114z("saveCurrentIpIfValid: Error - ", r7.getMessage(), p000.ly6.f25312y, r4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: Exception -> 0x002d, CancellationException -> 0x0075, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0075, Exception -> 0x002d, blocks: (B:10:0x0029, B:11:0x0056, B:14:0x005c, B:16:0x0062, B:24:0x0039, B:26:0x0042), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14128f(za2 za2Var) {
        mb3 mb3Var;
        int i;
        String str;
        d48 d48Var = this.f27994b;
        if (za2Var instanceof mb3) {
            mb3Var = (mb3) za2Var;
            int i2 = mb3Var.f26014w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mb3Var.f26014w = i2 - Integer.MIN_VALUE;
                Object obj = mb3Var.f26012u;
                i = mb3Var.f26014w;
                String str2 = EtVGdIOx.oXqaYOEg;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (((m48) d48Var).m13145j()) {
                        mb3Var.f26014w = 1;
                        m48 m48Var = (m48) d48Var;
                        obj = jzd.m11694F(m48Var.f25602d, new C1061z(m48Var, null), mb3Var);
                        qc2 qc2Var = qc2.f34309u;
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    }
                    return txc.f41359a;
                }
                if (i != 1) {
                    C0917v3.m20303j(jcRNFy.aDPOCpOzVRMyJ);
                    return null;
                }
                v11.m20244z(obj);
                str = (String) obj;
                if (str == null) {
                    str = "unknown";
                }
                if (m14123c(str)) {
                    this.f27995c.saveToPreferences(PrefKeys.LAST_KNOWN_IP, str);
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18369g(ly6.f25309v, str2, null, "Saved valid IP address: ".concat(str));
                }
                return txc.f41359a;
            }
        }
        mb3Var = new mb3(this, za2Var);
        Object obj2 = mb3Var.f26012u;
        i = mb3Var.f26014w;
        String str22 = EtVGdIOx.oXqaYOEg;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        if (m14123c(str)) {
        }
        return txc.f41359a;
    }
}
