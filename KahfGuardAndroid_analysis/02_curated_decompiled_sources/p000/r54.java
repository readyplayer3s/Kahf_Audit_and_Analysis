package p000;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kahf.dns.core.analytics.AnalyticsProvider;
import com.kahf.dns.utils.PrefKeys;
import com.posthog.surveys.NPZg.PeBKUY;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class r54 implements AnalyticsProvider {
    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logEvent(String str, Map map) {
        String str2;
        Exception exc;
        Bundle m17874k;
        d5e d5eVar;
        str.getClass();
        map.getClass();
        if (!bha.m2089y(sa2.f38142u.m17960c())) {
            sx7.m18364b(sx7.f39332a, tz6.m19210k("Skipping Firebase Analytics event '", str, "' - Google Play Services not available"), null, 6);
            return;
        }
        try {
            if (o20.f29377a == null) {
                try {
                    synchronized (o20.f29378b) {
                        if (o20.f29377a == null) {
                            v54 m20385c = v54.m20385c();
                            m20385c.m20388a();
                            o20.f29377a = FirebaseAnalytics.getInstance(m20385c.f43748a);
                        }
                    }
                } catch (Exception e) {
                    exc = e;
                    str2 = str;
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18366d(4, tz6.m19210k("Failed to log Firebase Analytics event '", str2, "'"), null, exc);
                }
            }
            FirebaseAnalytics firebaseAnalytics = o20.f29377a;
            firebaseAnalytics.getClass();
            vq8[] vq8VarArr = (vq8[]) o97.m14874K(map).toArray(new vq8[0]);
            m17874k = s6d.m17874k((vq8[]) Arrays.copyOf(vq8VarArr, vq8VarArr.length));
            d5eVar = firebaseAnalytics.f6015a;
            d5eVar.getClass();
            str2 = str;
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
        try {
            d5eVar.m5932c(new p3e(d5eVar, (String) null, str2, m17874k, false));
        } catch (Exception e3) {
            e = e3;
            exc = e;
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18366d(4, tz6.m19210k("Failed to log Firebase Analytics event '", str2, "'"), null, exc);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logScreenView(String str) {
        str.getClass();
        if (!bha.m2089y(sa2.f38142u.m17960c())) {
            sx7.m18364b(sx7.f39332a, tz6.m19210k("Skipping Firebase Analytics screen view '", str, "' - Google Play Services not available"), null, 6);
            return;
        }
        try {
            if (o20.f29377a == null) {
                synchronized (o20.f29378b) {
                    if (o20.f29377a == null) {
                        v54 m20385c = v54.m20385c();
                        m20385c.m20388a();
                        o20.f29377a = FirebaseAnalytics.getInstance(m20385c.f43748a);
                    }
                }
            }
            FirebaseAnalytics firebaseAnalytics = o20.f29377a;
            firebaseAnalytics.getClass();
            xp5 xp5Var = new xp5((byte) 15);
            xp5Var.m22237v(str);
            Bundle m22235s = xp5Var.m22235s();
            d5e d5eVar = firebaseAnalytics.f6015a;
            d5eVar.getClass();
            d5eVar.m5932c(new p3e(d5eVar, (String) null, "screen_view", m22235s, false));
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, tz6.m19210k("Failed to log Firebase Analytics screen view '", str, "'"), null, e);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserId(String str) {
        str.getClass();
        if (!bha.m2089y(sa2.f38142u.m17960c())) {
            sx7.m18364b(sx7.f39332a, "Skipping Firebase user ID set - Google Play Services not available", null, 6);
            return;
        }
        try {
            if (o20.f29377a == null) {
                synchronized (o20.f29378b) {
                    if (o20.f29377a == null) {
                        v54 m20385c = v54.m20385c();
                        m20385c.m20388a();
                        o20.f29377a = FirebaseAnalytics.getInstance(m20385c.f43748a);
                    }
                }
            }
            FirebaseAnalytics firebaseAnalytics = o20.f29377a;
            firebaseAnalytics.getClass();
            d5e d5eVar = firebaseAnalytics.f6015a;
            d5eVar.getClass();
            d5eVar.m5932c(new w3e(d5eVar, str));
            qe2 qe2Var = y54.m22622a().f49722a;
            ((bg2) qe2Var.f34454o.f14591u).m2028d(new p20(qe2Var, str, (byte) 8));
            sx7.m18364b(sx7.f39332a, "Firebase user ID set: ".concat(str), null, 6);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to set Firebase user ID", null, e);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserProperties(Map map) {
        map.getClass();
        if (!bha.m2089y(sa2.f38142u.m17960c())) {
            sx7.m18364b(sx7.f39332a, "Skipping Firebase user properties - Google Play Services not available", null, 6);
            return;
        }
        try {
            Set m20558j0 = v90.m20558j0(new String[]{PrefKeys.KEY_USER_EMAIL, "email", PrefKeys.KEY_USER_NAME, "name"});
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!m20558j0.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (o20.f29377a == null) {
                    synchronized (o20.f29378b) {
                        if (o20.f29377a == null) {
                            v54 m20385c = v54.m20385c();
                            m20385c.m20388a();
                            o20.f29377a = FirebaseAnalytics.getInstance(m20385c.f43748a);
                        }
                    }
                }
                FirebaseAnalytics firebaseAnalytics = o20.f29377a;
                firebaseAnalytics.getClass();
                d5e d5eVar = firebaseAnalytics.f6015a;
                d5eVar.getClass();
                d5eVar.m5932c(new p3e(d5eVar, (String) null, str, (Object) str2, false));
                sx7.m18364b(sx7.f39332a, "Firebase user property set: " + str + " = " + str2, null, 6);
            }
            y54 m22622a = y54.m22622a();
            String str3 = (String) map.get("server_user_id");
            if (str3 != null) {
                qe2 qe2Var = m22622a.f49722a;
                ((bg2) qe2Var.f34454o.f14591u).m2028d(new p20(qe2Var, str3, (byte) 8));
            }
            String str4 = (String) map.get("subscription_id");
            if (str4 != null) {
                m22622a.m22626e("subscription_id", str4);
            }
            String str5 = (String) map.get("subscription_name");
            if (str5 != null) {
                m22622a.m22626e("subscription_name", str5);
            }
            String str6 = (String) map.get("subscription_type");
            if (str6 != null) {
                m22622a.m22626e("subscription_type", str6);
            }
            String str7 = (String) map.get("trial_days_remaining");
            if (str7 != null) {
                m22622a.m22626e("trial_days_remaining", str7);
            }
            String str8 = (String) map.get(PeBKUY.VPJ);
            if (str8 != null) {
                m22622a.m22626e(PeBKUY.VPJ, str8);
            }
            sx7.m18364b(sx7.f39332a, "Crashlytics user properties set successfully with " + map.size() + " properties", null, 6);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to set Firebase user properties", null, e);
        }
    }
}
