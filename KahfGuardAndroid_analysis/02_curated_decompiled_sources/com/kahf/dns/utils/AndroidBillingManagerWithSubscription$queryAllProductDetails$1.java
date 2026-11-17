package com.kahf.dns.utils;

import p000.C0917v3;
import p000.jm4;
import p000.pc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.xa2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$queryAllProductDetails$1", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class AndroidBillingManagerWithSubscription$queryAllProductDetails$1 extends s1c implements jm4 {
    int label;

    public AndroidBillingManagerWithSubscription$queryAllProductDetails$1(xa2 xa2Var) {
        super(2, xa2Var);
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new AndroidBillingManagerWithSubscription$queryAllProductDetails$1(xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$queryAllProductDetails$1) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v11.m20244z(obj);
        AndroidBillingManagerWithSubscription.INSTANCE.m5560a();
        return txc.f41359a;
    }
}
