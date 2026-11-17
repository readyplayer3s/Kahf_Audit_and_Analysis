package p000;

import com.kahf.dns.core.analytics.AnalyticsProvider;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class qu1 implements AnalyticsProvider {

    /* renamed from: a */
    public final r54 f35376a;

    /* renamed from: b */
    public final ry3 f35377b;

    /* renamed from: c */
    public final n99 f35378c;

    public qu1(r54 r54Var, ry3 ry3Var, n99 n99Var) {
        this.f35376a = r54Var;
        this.f35377b = ry3Var;
        this.f35378c = n99Var;
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final Object awaitReady(xa2 xa2Var) {
        Object awaitReady = this.f35378c.awaitReady(xa2Var);
        return awaitReady == qc2.f34309u ? awaitReady : txc.f41359a;
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        try {
            this.f35378c.logEvent(str, map);
            this.f35376a.logEvent(str, map);
            this.f35377b.logEvent(str, map);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to log event", null, e);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void logScreenView(String str) {
        str.getClass();
        try {
            this.f35378c.logScreenView(str);
            this.f35376a.logScreenView(str);
            this.f35377b.logScreenView(str);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to log screen view", null, e);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserId(String str) {
        str.getClass();
        try {
            this.f35378c.setUserId(str);
            this.f35376a.setUserId(str);
            this.f35377b.setUserId(str);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to set user ID", null, e);
        }
    }

    @Override // com.kahf.dns.core.analytics.AnalyticsProvider
    public final void setUserProperties(Map map) {
        map.getClass();
        try {
            this.f35378c.setUserProperties(map);
            this.f35376a.setUserProperties(map);
            this.f35377b.setUserProperties(map);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18366d(4, "Failed to set user properties", null, e);
        }
    }
}
