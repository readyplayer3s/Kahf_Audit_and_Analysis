package p000;

import com.kahf.dns.core.analytics.AnalyticsProvider;
import com.kahf.dns.utils.PrefKeys;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class n99 implements AnalyticsProvider {

    /* renamed from: a */
    public final ad0 f27888a;

    public n99() {
        ad0 m10211a = ic9.m10211a();
        m99 m99Var = m99.f25893u;
        m10211a.getClass();
        this.f27888a = m10211a;
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final Object awaitReady(xa2 xa2Var) {
        Object m370b = this.f27888a.m370b(xa2Var);
        return m370b == qc2.f34309u ? m370b : txc.f41359a;
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        this.f27888a.m372d(new ym0(this, str, map, (Date) m99.f25893u.invoke()));
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logScreenView(String str) {
        str.getClass();
        this.f27888a.m372d(new qb5(str, (byte) 5));
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserId(String str) {
        str.getClass();
        try {
            sx7.m18364b(sx7.f39332a, "setUserId called (managed by PostHogIdentityManager): ".concat(str), "PostHog", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "PostHog", e, "Failed in setUserId");
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserProperties(Map map) {
        map.getClass();
        try {
            String str = (String) map.get("email");
            if (str == null) {
                str = (String) map.get(PrefKeys.KEY_USER_EMAIL);
            }
            String str2 = (String) map.get("name");
            if (str2 == null) {
                str2 = (String) map.get(PrefKeys.KEY_USER_NAME);
            }
            ad0 ad0Var = this.f27888a;
            if (str != null && str2 != null) {
                ad0Var.m372d(new C0755qq(str, str2, (byte) 11));
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p97.m15615D(linkedHashMap.size()));
            for (Object obj : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Object value = ((Map.Entry) obj).getValue();
                value.getClass();
                linkedHashMap2.put(key, value);
            }
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            o02 o02Var = u11.f41528b;
            Date date = (Date) m99.f25893u.invoke();
            if (!linkedHashMap2.isEmpty()) {
                ad0Var.m372d(new u68(o02Var, linkedHashMap2, date, (byte) 3));
            }
            sx7.m18364b(sx7.f39332a, "Person properties set via $set: " + linkedHashMap2.keySet(), "PostHog", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "PostHog", e, "Failed to set user properties");
        }
    }
}
