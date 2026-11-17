package com.kahf.dns.utils;

import p000.rp2;
import p000.xa2;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {1642, 1643}, m17485m = "verificationFailureResult", m17486v = 2)
/* renamed from: com.kahf.dns.utils.AndroidBillingManagerWithSubscription$verificationFailureResult$1 */
/* loaded from: classes2.dex */
final class C0224x6fbc48d9 extends za2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidBillingManagerWithSubscription this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224x6fbc48d9(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, xa2 xa2Var) {
        super(xa2Var);
        this.this$0 = androidBillingManagerWithSubscription;
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object m5563z;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m5563z = this.this$0.m5563z(null, null, this);
        return m5563z;
    }
}
