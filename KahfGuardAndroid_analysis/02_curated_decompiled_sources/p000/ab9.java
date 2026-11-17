package p000;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.github.mikephil.charting.BuildConfig;
import com.kahf.dns.KahfGuardApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public abstract class ab9 {

    /* renamed from: a */
    public static final long f593a;

    /* renamed from: b */
    public static final qa2 f594b;

    static {
        f95 f95Var = dj3.f8146v;
        f593a = qr5.m16842H(7, hj3.DAYS);
        q0c m18375J = sy0.m18375J();
        vu2 vu2Var = k83.f21845a;
        f594b = muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v));
    }

    /* renamed from: a */
    public static g77 m344a(String str, String str2, String str3, String str4, boolean z) {
        g77 g77Var = new g77();
        g77Var.put("device_id", str);
        String str5 = ((PackageInfo) f20.f11013a.getValue()).versionName;
        if (str5 == null) {
            str5 = "";
        }
        g77Var.put("app_version", str5);
        g77Var.put("build_type", z ? "debug" : BuildConfig.BUILD_TYPE);
        if (str2 != null) {
            g77Var.put("email", str2);
        }
        if (str3 != null) {
            g77Var.put("name", str3);
        }
        g77Var.put("device_id_quality", str4);
        return g77Var.m8404b();
    }

    /* renamed from: b */
    public static boolean m345b(KahfGuardApp kahfGuardApp, String str, g77 g77Var) {
        String tdaVar;
        SharedPreferences sharedPreferences = kahfGuardApp.getSharedPreferences("posthog_identity", 0);
        String string = sharedPreferences.getString("identity_fingerprint", null);
        if (string != null && string.equals(m346c(g77Var))) {
            long currentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong("identity_sent_at_ms", 0L);
            if (0 <= currentTimeMillis && currentTimeMillis <= dj3.m6348f(f593a)) {
                try {
                    y3c y3cVar = k99.f21937h0;
                    k99 k99Var = k99.f21938i0;
                    tdaVar = !k99Var.m17252i() ? "" : k99Var.m11933t();
                } catch (Throwable th) {
                    tdaVar = new tda(th);
                }
                return zy5.m23838d((String) (tdaVar instanceof tda ? null : tdaVar), str);
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m346c(g77 g77Var) {
        return ps1.m16045w0(ps1.m16015N0(g77Var.entrySet(), new id8((byte) 9)), "|", null, null, new ua9((byte) 1), 30);
    }

    /* renamed from: d */
    public static void m347d(String str, g77 g77Var) {
        try {
            y3c y3cVar = k99.f21937h0;
            str.getClass();
            k99.f21938i0.m11937y(str, g77Var);
            String m16045w0 = ps1.m16045w0(g77Var.keySet(), ", ", null, null, null, 62);
            sx7.m18364b(sx7.f39332a, "Identity set: distinctId=" + str + ", properties=[" + m16045w0 + "]", "PostHog", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "PostHog", e, "Failed to set identity");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #0 {Exception -> 0x005b, blocks: (B:3:0x0004, B:7:0x0063, B:9:0x0070, B:12:0x008c, B:14:0x0011, B:15:0x0019, B:17:0x001f, B:20:0x0031, B:24:0x0038, B:25:0x0040, B:27:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:3:0x0004, B:7:0x0063, B:9:0x0070, B:12:0x008c, B:14:0x0011, B:15:0x0019, B:17:0x001f, B:20:0x0031, B:24:0x0038, B:25:0x0040, B:27:0x0046), top: B:2:0x0004 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static txc m348e(KahfGuardApp kahfGuardApp, String str) {
        String str2;
        g77 m344a;
        txc txcVar = txc.f41359a;
        try {
            sxc sxcVar = sxc.f39342a;
            LinkedHashMap m18372a = sxc.m18372a(kahfGuardApp);
            if (!m18372a.isEmpty()) {
                Iterator it = m18372a.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                        if (!m18372a.isEmpty()) {
                            Iterator it2 = m18372a.entrySet().iterator();
                            while (it2.hasNext()) {
                                if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                    str2 = "partial";
                                    break;
                                }
                            }
                        }
                        str2 = "basic";
                        m344a = m344a(str, null, null, str2, false);
                        if (!m345b(kahfGuardApp, str, m344a)) {
                            sx7.m18364b(sx7.f39332a, "Initial identity unchanged for " + str + " — skipping identify()", "PostHog", 2);
                            return txcVar;
                        }
                        m347d(str, m344a);
                        String m346c = m346c(m344a);
                        SharedPreferences sharedPreferences = kahfGuardApp.getSharedPreferences("posthog_identity", 0);
                        sharedPreferences.getClass();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.putString("identity_fingerprint", m346c);
                        edit.putLong("identity_sent_at_ms", System.currentTimeMillis());
                        edit.apply();
                        sx7.m18367e(sx7.f39332a, "Initial identity set for device: " + str + " (quality: " + str2 + ")", "PostHog", 2);
                        return txcVar;
                    }
                }
            }
            str2 = "optimal";
            m344a = m344a(str, null, null, str2, false);
            if (!m345b(kahfGuardApp, str, m344a)) {
            }
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "PostHog", e, "Failed to set initial identity");
            return txcVar;
        }
    }
}
