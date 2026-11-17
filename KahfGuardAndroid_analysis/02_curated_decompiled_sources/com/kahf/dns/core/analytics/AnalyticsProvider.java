package com.kahf.dns.core.analytics;

import java.util.Map;
import p000.txc;
import p000.ut1;
import p000.xa2;
import p000.zo3;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public interface AnalyticsProvider {
    static /* synthetic */ Object awaitReady$suspendImpl(AnalyticsProvider analyticsProvider, xa2 xa2Var) {
        return txc.f41359a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void logEvent$default(AnalyticsProvider analyticsProvider, String str, Map map, int i, Object obj) {
        if (obj != null) {
            ut1.m20051m("Super calls with default arguments not supported in this target, function: logEvent");
            return;
        }
        if ((i & 2) != 0) {
            map = zo3.f52774u;
        }
        analyticsProvider.logEvent(str, map);
    }

    default Object awaitReady(xa2 xa2Var) {
        return awaitReady$suspendImpl(this, xa2Var);
    }

    void logEvent(String str, Map<String, ? extends Object> map);

    void logScreenView(String str);

    default void setUserId(String str) {
        str.getClass();
    }

    default void setUserProperties(Map<String, String> map) {
        map.getClass();
    }
}
