package p000;

import android.content.Context;
import android.os.Build;
import com.kahf.dns.core.analytics.AnalyticsEvent;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class qa3 implements az8 {

    /* renamed from: a */
    public final d48 f34192a;

    /* renamed from: b */
    public final fb3 f34193b;

    /* renamed from: c */
    public final PreferencesHelper f34194c;

    /* renamed from: d */
    public final C1001xd f34195d;

    public qa3(d48 d48Var, fb3 fb3Var, PreferencesHelper preferencesHelper, C1001xd c1001xd) {
        d48Var.getClass();
        fb3Var.getClass();
        preferencesHelper.getClass();
        c1001xd.getClass();
        this.f34192a = d48Var;
        this.f34193b = fb3Var;
        this.f34194c = preferencesHelper;
        this.f34195d = c1001xd;
    }

    /* renamed from: c */
    public static oa3 m16381c(String str) {
        String m18102n = sj8.m18102n("Worker task error: ", str);
        long currentTimeMillis = System.currentTimeMillis();
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.MODEL;
        str2.getClass();
        String str3 = Build.VERSION.RELEASE;
        str3.getClass();
        return new oa3(false, false, "unknown", false, false, -1L, false, -1L, false, null, null, false, null, false, false, "error", m18102n, currentTimeMillis, -1L, i, str2, str3, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:53|(3:54|55|56)|57|(1:78)(1:61)|62|63|64|65|66|(2:67|68)|(6:70|28|29|(0)|32|(0)(0))|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(15:5|6|7|(1:(1:(1:(1:(7:13|14|15|(1:17)(1:22)|18|19|20)(2:23|24))(8:25|26|27|28|29|(1:31)|32|(8:34|(6:39|40|(1:42)(1:47)|43|(6:46|15|(0)(0)|18|19|20)|45)|48|40|(0)(0)|43|(0)|45)(3:49|19|20)))(15:53|54|55|56|57|(1:78)(1:61)|62|63|64|65|66|67|68|(6:70|28|29|(0)|32|(0)(0))|45))(1:82))(5:101|102|103|104|(2:106|45))|83|(1:85)|86|87|88|(1:90)(1:99)|91|92|93|(13:95|56|57|(1:59)|78|62|63|64|65|66|67|68|(0))|45))|7|(0)(0)|83|(0)|86|87|88|(0)(0)|91|92|93|(0)|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|7|(1:(1:(1:(1:(7:13|14|15|(1:17)(1:22)|18|19|20)(2:23|24))(8:25|26|27|28|29|(1:31)|32|(8:34|(6:39|40|(1:42)(1:47)|43|(6:46|15|(0)(0)|18|19|20)|45)|48|40|(0)(0)|43|(0)|45)(3:49|19|20)))(15:53|54|55|56|57|(1:78)(1:61)|62|63|64|65|66|67|68|(6:70|28|29|(0)|32|(0)(0))|45))(1:82))(5:101|102|103|104|(2:106|45))|83|(1:85)|86|87|88|(1:90)(1:99)|91|92|93|(13:95|56|57|(1:59)|78|62|63|64|65|66|67|68|(0))|45))|121|6|7|(0)(0)|83|(0)|86|87|88|(0)(0)|91|92|93|(0)|45|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ff, code lost:
    
        r1 = p000.sx7.f39332a;
        p000.sj8.m18114z("Unexpected error in DNS diagnostic task: ", r0.getMessage(), r5, "DnsDiagnosticTask", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fe, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00a3, code lost:
    
        r4 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25311x, "DnsDiagnosticTask", null, "Failed to get current DNS: " + r0.getMessage());
        r4 = "unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0160, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0166, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0106, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0103, code lost:
    
        r14 = r4;
        r4 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TRY_ENTER, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0177 A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e6 A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ca A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TRY_ENTER, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d7 A[Catch: Exception -> 0x004b, CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #3 {Exception -> 0x004b, blocks: (B:14:0x0046, B:15:0x01b8, B:18:0x01bf, B:31:0x016d, B:34:0x0177, B:36:0x017b, B:40:0x0185, B:43:0x0194, B:49:0x01e6, B:59:0x012b, B:81:0x0108, B:116:0x01fd, B:87:0x00be, B:90:0x00ca, B:99:0x00d7, B:120:0x00a3, B:118:0x01fe, B:102:0x0085, B:103:0x0087), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    @Override // p000.az8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1532a(Context context, za2 za2Var) {
        pa3 pa3Var;
        Object obj;
        int i;
        ly6 ly6Var;
        qc2 qc2Var;
        String str;
        Throwable th;
        boolean m18246L0;
        boolean z;
        String str2;
        String str3;
        oa3 m16381c;
        String str4;
        boolean z2;
        int i2;
        oa3 oa3Var;
        Object m11694F;
        String str5;
        boolean z3;
        C1001xd c1001xd;
        AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun diagnosticRun;
        boolean z4;
        oa3 oa3Var2;
        int i3;
        String str6;
        try {
            try {
                try {
                    if (za2Var instanceof pa3) {
                        pa3Var = (pa3) za2Var;
                        int i4 = pa3Var.f32116C;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            pa3Var.f32116C = i4 - Integer.MIN_VALUE;
                            obj = pa3Var.f32114A;
                            i = pa3Var.f32116C;
                            ly6 ly6Var2 = ly6.f25312y;
                            ly6Var = ly6.f25309v;
                            d48 d48Var = this.f34192a;
                            PreferencesHelper preferencesHelper = this.f34194c;
                            qc2Var = qc2.f34309u;
                            if (i != 0) {
                                v11.m20244z(obj);
                                sx7 sx7Var = sx7.f39332a;
                                sx7.m18369g(ly6Var, "DnsDiagnosticTask", null, "Starting DNS diagnostic task");
                                fb3 fb3Var = this.f34193b;
                                pa3Var.f32116C = 1;
                                obj = ((gb3) fb3Var).m8476a(pa3Var);
                                if (obj == qc2Var) {
                                    return qc2Var;
                                }
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        z = pa3Var.f32120x;
                                        str3 = pa3Var.f32118v;
                                        str2 = pa3Var.f32117u;
                                        try {
                                            v11.m20244z(obj);
                                            m16381c = (oa3) obj;
                                        } catch (Exception e) {
                                            e = e;
                                            sx7 sx7Var2 = sx7.f39332a;
                                            sx7.m18369g(ly6Var2, "DnsDiagnosticTask", null, "Diagnostic failed: " + e.getMessage());
                                            m16381c = m16381c(e.getMessage());
                                            str4 = str3;
                                            z2 = z;
                                            if (z2) {
                                            }
                                            pa3Var.f32117u = str2;
                                            pa3Var.f32118v = str4;
                                            pa3Var.f32119w = m16381c;
                                            pa3Var.f32120x = z2;
                                            pa3Var.f32121y = i2;
                                            pa3Var.f32116C = 3;
                                            m48 m48Var = (m48) d48Var;
                                            int i5 = i2;
                                            m11694F = jzd.m11694F(m48Var.f25602d, new C1061z(m48Var, null), pa3Var);
                                            if (m11694F != qc2Var) {
                                            }
                                            return qc2Var;
                                        }
                                        str4 = str3;
                                        z2 = z;
                                        i2 = (z2 || !m16381c.f29956o) ? 0 : 1;
                                        pa3Var.f32117u = str2;
                                        pa3Var.f32118v = str4;
                                        pa3Var.f32119w = m16381c;
                                        pa3Var.f32120x = z2;
                                        pa3Var.f32121y = i2;
                                        pa3Var.f32116C = 3;
                                        m48 m48Var2 = (m48) d48Var;
                                        int i52 = i2;
                                        try {
                                            m11694F = jzd.m11694F(m48Var2.f25602d, new C1061z(m48Var2, null), pa3Var);
                                        } catch (Exception unused) {
                                            oa3Var = m16381c;
                                            i2 = i52;
                                            str5 = null;
                                            boolean z5 = z2;
                                            String str7 = str4;
                                            String str8 = str2;
                                            if (str5 == null) {
                                            }
                                            String str9 = str5;
                                            if (i2 != 0) {
                                            }
                                        }
                                        if (m11694F != qc2Var) {
                                            oa3Var = m16381c;
                                            obj = m11694F;
                                            i2 = i52;
                                            str5 = (String) obj;
                                            boolean z52 = z2;
                                            String str72 = str4;
                                            String str82 = str2;
                                            if (str5 == null) {
                                            }
                                            String str92 = str5;
                                            if (i2 != 0) {
                                            }
                                        }
                                        return qc2Var;
                                    }
                                    if (i != 3) {
                                        if (i != 4) {
                                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        int i6 = pa3Var.f32122z;
                                        z4 = pa3Var.f32120x;
                                        oa3Var2 = pa3Var.f32119w;
                                        v11.m20244z(obj);
                                        i3 = i6;
                                        sx7 sx7Var3 = sx7.f39332a;
                                        boolean z6 = i3 == 0;
                                        sx7.m18369g(ly6.f25310w, "DnsDiagnosticTask", null, "DNS diagnostic failure logged: status=" + oa3Var2.f29957p + ", isKahfDns=" + z4 + ", capturedOffline=" + z6);
                                        return yy8.f51457a;
                                    }
                                    i2 = pa3Var.f32121y;
                                    z2 = pa3Var.f32120x;
                                    oa3Var = pa3Var.f32119w;
                                    str4 = pa3Var.f32118v;
                                    str2 = pa3Var.f32117u;
                                    try {
                                        v11.m20244z(obj);
                                        str5 = (String) obj;
                                    } catch (Exception unused2) {
                                        str5 = null;
                                        boolean z522 = z2;
                                        String str722 = str4;
                                        String str822 = str2;
                                        if (str5 == null) {
                                        }
                                        String str922 = str5;
                                        if (i2 != 0) {
                                        }
                                    }
                                    boolean z5222 = z2;
                                    String str7222 = str4;
                                    String str8222 = str2;
                                    if (str5 == null) {
                                        str5 = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_IP, "unknown");
                                    }
                                    String str9222 = str5;
                                    if (i2 != 0) {
                                        sx7 sx7Var4 = sx7.f39332a;
                                        sx7.m18369g(ly6Var, "DnsDiagnosticTask", null, "DNS diagnostic healthy - not logging: status=" + oa3Var.f29957p);
                                        return yy8.f51457a;
                                    }
                                    if (oa3Var.f29942a && oa3Var.f29943b) {
                                        z3 = false;
                                        c1001xd = this.f34195d;
                                        diagnosticRun = new AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun(oa3Var.m14890a(), str8222, str7222, str9222, z5222, i2 == 0, z3, true);
                                        ?? r1 = z3;
                                        pa3Var.f32117u = null;
                                        pa3Var.f32118v = null;
                                        pa3Var.f32119w = oa3Var;
                                        pa3Var.f32120x = z5222;
                                        pa3Var.f32121y = i2;
                                        pa3Var.f32122z = r1;
                                        pa3Var.f32116C = 4;
                                        if (c1001xd.m22027d(diagnosticRun, pa3Var) != qc2Var) {
                                            z4 = z5222;
                                            oa3Var2 = oa3Var;
                                            i3 = r1;
                                            sx7 sx7Var32 = sx7.f39332a;
                                            if (i3 == 0) {
                                            }
                                            sx7.m18369g(ly6.f25310w, "DnsDiagnosticTask", null, "DNS diagnostic failure logged: status=" + oa3Var2.f29957p + ", isKahfDns=" + z4 + ", capturedOffline=" + z6);
                                            return yy8.f51457a;
                                        }
                                        return qc2Var;
                                    }
                                    z3 = true;
                                    c1001xd = this.f34195d;
                                    diagnosticRun = new AnalyticsEvent.DnsDiagnosticEvent.DiagnosticRun(oa3Var.m14890a(), str8222, str7222, str9222, z5222, i2 == 0, z3, true);
                                    ?? r12 = z3;
                                    pa3Var.f32117u = null;
                                    pa3Var.f32118v = null;
                                    pa3Var.f32119w = oa3Var;
                                    pa3Var.f32120x = z5222;
                                    pa3Var.f32121y = i2;
                                    pa3Var.f32122z = r12;
                                    pa3Var.f32116C = 4;
                                    if (c1001xd.m22027d(diagnosticRun, pa3Var) != qc2Var) {
                                    }
                                    return qc2Var;
                                }
                                v11.m20244z(obj);
                            }
                            str6 = (String) obj;
                            if (str6 == null) {
                                str6 = "unknown";
                            }
                            str = str6;
                            String stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
                            if (str.equals("unknown")) {
                                preferencesHelper.saveToPreferences(PrefKeys.LAST_KNOWN_DNS, str);
                                m18246L0 = stb.m18246L0(str, "kahf", true);
                            } else {
                                m18246L0 = stb.m18246L0(stringFromPreferences, "kahf", true);
                            }
                            z = m18246L0;
                            pa3Var.f32117u = str;
                            pa3Var.f32118v = stringFromPreferences;
                            pa3Var.f32120x = z;
                            pa3Var.f32116C = 2;
                            m48 m48Var3 = (m48) d48Var;
                            m48Var3.getClass();
                            vu2 vu2Var = k83.f21845a;
                            obj = jzd.m11694F(dt2.f8706v, new gh3(m48Var3, null), pa3Var);
                            if (obj != qc2Var) {
                                str2 = str;
                                str3 = stringFromPreferences;
                                m16381c = (oa3) obj;
                                str4 = str3;
                                z2 = z;
                                if (z2) {
                                }
                                pa3Var.f32117u = str2;
                                pa3Var.f32118v = str4;
                                pa3Var.f32119w = m16381c;
                                pa3Var.f32120x = z2;
                                pa3Var.f32121y = i2;
                                pa3Var.f32116C = 3;
                                m48 m48Var22 = (m48) d48Var;
                                int i522 = i2;
                                m11694F = jzd.m11694F(m48Var22.f25602d, new C1061z(m48Var22, null), pa3Var);
                                if (m11694F != qc2Var) {
                                }
                            }
                            return qc2Var;
                        }
                    }
                    if (i != 0) {
                    }
                    str6 = (String) obj;
                    if (str6 == null) {
                    }
                    str = str6;
                    String stringFromPreferences2 = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
                    if (str.equals("unknown")) {
                    }
                    z = m18246L0;
                    pa3Var.f32117u = str;
                    pa3Var.f32118v = stringFromPreferences2;
                    pa3Var.f32120x = z;
                    pa3Var.f32116C = 2;
                    m48 m48Var32 = (m48) d48Var;
                    m48Var32.getClass();
                    vu2 vu2Var2 = k83.f21845a;
                    obj = jzd.m11694F(dt2.f8706v, new gh3(m48Var32, null), pa3Var);
                    if (obj != qc2Var) {
                    }
                    return qc2Var;
                } catch (CancellationException e2) {
                    e = e2;
                    th = null;
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "DnsDiagnosticTask", th, "Task cancelled");
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
                th = null;
                sx7 sx7Var52 = sx7.f39332a;
                sx7.m18369g(ly6Var, "DnsDiagnosticTask", th, "Task cancelled");
                throw e;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        pa3Var = new pa3(this, za2Var);
        obj = pa3Var.f32114A;
        i = pa3Var.f32116C;
        ly6 ly6Var22 = ly6.f25312y;
        ly6Var = ly6.f25309v;
        d48 d48Var2 = this.f34192a;
        PreferencesHelper preferencesHelper2 = this.f34194c;
        qc2Var = qc2.f34309u;
    }

    @Override // p000.az8
    /* renamed from: b */
    public final String mo1533b() {
        return "dns_diagnostic";
    }
}
