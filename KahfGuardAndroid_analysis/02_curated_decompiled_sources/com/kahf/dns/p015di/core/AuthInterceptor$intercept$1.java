package com.kahf.dns.p015di.core;

import p000.rp2;
import p000.xa2;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.core.AuthInterceptor", m17483f = "NetworkModuleGraphQl.kt", m17484l = {50, 53, 57, 58, 63, 68, 69}, m17485m = "intercept", m17486v = 2)
/* loaded from: classes2.dex */
public final class AuthInterceptor$intercept$1 extends za2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthInterceptor$intercept$1(AuthInterceptor authInterceptor, xa2 xa2Var) {
        super(xa2Var);
        this.this$0 = authInterceptor;
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.intercept(null, null, this);
    }
}
