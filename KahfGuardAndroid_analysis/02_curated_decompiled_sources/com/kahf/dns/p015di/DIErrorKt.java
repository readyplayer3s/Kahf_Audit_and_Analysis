package com.kahf.dns.p015di;

import p000.sj8;
import p000.sx7;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class DIErrorKt {
    public static final void logDIError(DIError dIError) {
        dIError.getClass();
        sx7 sx7Var = sx7.f39332a;
        sx7.m18366d(4, sj8.m18102n("DI Error: ", dIError.getMessage()), null, dIError.getCause());
    }
}
