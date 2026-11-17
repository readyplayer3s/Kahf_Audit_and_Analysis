package com.kahf.dns.p015di.core;

import com.kahf.dns.core.analytics.AnalyticsProvider;
import p000.InterfaceC0015ae;
import p000.n99;
import p000.qu1;
import p000.r54;
import p000.ry3;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AndroidAnalyticsProviderFactory implements InterfaceC0015ae {
    public static final int $stable = 0;

    @Override // p000.InterfaceC0015ae
    public AnalyticsProvider createAnalyticsProvider() {
        return new qu1(new r54(), new ry3(), new n99());
    }
}
