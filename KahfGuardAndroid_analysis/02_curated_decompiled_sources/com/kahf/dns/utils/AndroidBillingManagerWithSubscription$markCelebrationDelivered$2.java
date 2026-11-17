package com.kahf.dns.utils;

import java.util.List;
import p000.C0917v3;
import p000.gb6;
import p000.jm4;
import p000.oy8;
import p000.pc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.vq8;
import p000.xa2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$markCelebrationDelivered$2", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class AndroidBillingManagerWithSubscription$markCelebrationDelivered$2 extends s1c implements jm4 {
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBillingManagerWithSubscription$markCelebrationDelivered$2(String str, xa2 xa2Var) {
        super(2, xa2Var);
        this.$token = str;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new AndroidBillingManagerWithSubscription$markCelebrationDelivered$2(this.$token, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$markCelebrationDelivered$2) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list;
        Boolean bool;
        if (this.label != 0) {
            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v11.m20244z(obj);
        obj2 = AndroidBillingManagerWithSubscription.f6447O;
        String str = this.$token;
        synchronized (obj2) {
            gb6 gb6Var = oy8.f31469a;
            list = AndroidBillingManagerWithSubscription.f6448P;
            vq8 m15414b = oy8.m15414b(str, list);
            List list2 = (List) m15414b.f44884u;
            bool = (Boolean) m15414b.f44885v;
            if (bool.booleanValue()) {
                AndroidBillingManagerWithSubscription.access$persistPendingCelebrations(AndroidBillingManagerWithSubscription.INSTANCE, list2);
            }
        }
        return bool;
    }
}
