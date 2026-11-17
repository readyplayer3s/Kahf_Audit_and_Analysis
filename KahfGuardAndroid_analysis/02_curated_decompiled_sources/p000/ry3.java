package p000;

import android.os.Bundle;
import androidx.cardview.widget.ieJf.nTSoTOimczu;
import coil3.xdR.EYbWLcsD;
import com.google.firebase.remoteconfig.internal.muA.zkLKzAr;
import com.kahf.dns.core.analytics.AnalyticsProvider;
import com.kahf.dns.utils.PrefKeys;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class ry3 implements AnalyticsProvider {

    /* renamed from: a */
    public final r2c f37487a = new r2c(new yh3((byte) 9));

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserId(String str) {
        str.getClass();
        try {
            AbstractC0093ce.m3061b(str);
            sx7.m18364b(sx7.f39332a, "User ID set: ".concat(str), "FacebookAnalytics", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "FacebookAnalytics", e, "Failed to set user ID");
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    bundle.putString(str2, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(str2, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str2, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(str2, ((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putInt(str2, ((Boolean) value).booleanValue() ? 1 : 0);
                } else {
                    bundle.putString(str2, value.toString());
                }
            }
            ((d30) this.f37487a.getValue()).m5879a(str, bundle);
            sx7.m18364b(sx7.f39332a, "Event logged: " + str + ", params: " + map, "FacebookAnalytics", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "FacebookAnalytics", e, zkLKzAr.RFkONNvp.concat(str));
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logScreenView(String str) {
        logEvent("fb_mobile_content_view", o97.m14870G(AbstractC0327f4.m7612e(str, "fb_content_type", "screen"), new vq8("fb_content_id", str), new vq8(nTSoTOimczu.uiYEC, str)));
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserProperties(Map map) {
        String str = EYbWLcsD.xnPPV;
        map.getClass();
        try {
            j4d.m10863a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (mv1.m13794F("subscription_id", "subscription_name", "subscription_type", "trial_days_remaining", "subscription_expires_at").contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((String) entry2.getValue()) != null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(p97.m15615D(linkedHashMap2.size()));
                for (Object obj : linkedHashMap2.entrySet()) {
                    Object key = ((Map.Entry) obj).getKey();
                    Object value = ((Map.Entry) obj).getValue();
                    value.getClass();
                    linkedHashMap3.put(key, value);
                }
                logEvent("user_properties_updated", linkedHashMap3);
            }
            sx7 sx7Var = sx7.f39332a;
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                if (!v90.m20558j0(new String[]{PrefKeys.KEY_USER_EMAIL, "email", PrefKeys.KEY_USER_NAME, "name"}).contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            sx7.m18364b(sx7Var, "User properties set (no PII): " + arrayList, str, 2);
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, str, e, "Failed to set user properties");
        }
    }
}
