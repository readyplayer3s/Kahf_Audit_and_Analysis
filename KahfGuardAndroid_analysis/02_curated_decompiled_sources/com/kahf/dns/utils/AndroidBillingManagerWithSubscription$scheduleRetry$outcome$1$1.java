package com.kahf.dns.utils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0917v3;
import p000.aad;
import p000.i30;
import p000.jm4;
import p000.mv1;
import p000.pc2;
import p000.pr9;
import p000.q9d;
import p000.qc2;
import p000.rp2;
import p000.rr9;
import p000.s1c;
import p000.s9d;
import p000.txc;
import p000.v11;
import p000.vl4;
import p000.xa2;
import p000.xv5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {1688}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
final class AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1 extends s1c implements jm4 {
    final /* synthetic */ s9d $action;
    final /* synthetic */ long $epoch;
    final /* synthetic */ rr9 $kind;
    final /* synthetic */ xv5 $now;
    final /* synthetic */ pr9 $purchase;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1(s9d s9dVar, xv5 xv5Var, String str, pr9 pr9Var, long j, rr9 rr9Var, xa2 xa2Var) {
        super(2, xa2Var);
        this.$action = s9dVar;
        this.$now = xv5Var;
        this.$token = str;
        this.$purchase = pr9Var;
        this.$epoch = j;
        this.$kind = rr9Var;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1(this.$action, this.$now, this.$token, this.$purchase, this.$epoch, this.$kind, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            long m22368c = ((q9d) this.$action).f34176a.m22368c(this.$now);
            this.label = 1;
            Object m9892H = i30.m9892H(m22368c, this);
            qc2 qc2Var = qc2.f34309u;
            if (m9892H == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
        }
        concurrentHashMap = AndroidBillingManagerWithSubscription.f6453U;
        concurrentHashMap.remove(this.$token);
        AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = AndroidBillingManagerWithSubscription.INSTANCE;
        List m13793E = mv1.m13793E(this.$purchase);
        final rr9 rr9Var = this.$kind;
        AndroidBillingManagerWithSubscription.access$processPurchases(androidBillingManagerWithSubscription, m13793E, aad.f557w, new vl4() { // from class: com.kahf.dns.utils.b
            @Override // p000.vl4
            public final Object invoke(Object obj2) {
                rr9 invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1.invokeSuspend$lambda$0(rr9.this, (pr9) obj2);
                return invokeSuspend$lambda$0;
            }
        }, this.$epoch);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr9 invokeSuspend$lambda$0(rr9 rr9Var, pr9 pr9Var) {
        return rr9Var;
    }
}
