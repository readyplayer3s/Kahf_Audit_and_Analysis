package com.kahf.dns.utils;

import com.kahf.dns.utils.AndroidBillingManagerWithSubscription;
import p000.C0917v3;
import p000.fv7;
import p000.jm4;
import p000.ly6;
import p000.pc2;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.sx7;
import p000.txc;
import p000.v11;
import p000.xa2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$emitPurchaseResult$1", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {2206}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
final class AndroidBillingManagerWithSubscription$emitPurchaseResult$1 extends s1c implements jm4 {
    final /* synthetic */ AndroidBillingManagerWithSubscription.PurchaseResult $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBillingManagerWithSubscription$emitPurchaseResult$1(AndroidBillingManagerWithSubscription.PurchaseResult purchaseResult, xa2 xa2Var) {
        super(2, xa2Var);
        this.$result = purchaseResult;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new AndroidBillingManagerWithSubscription$emitPurchaseResult$1(this.$result, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$emitPurchaseResult$1) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        fv7 fv7Var;
        int i = this.label;
        try {
            if (i == 0) {
                v11.m20244z(obj);
                fv7Var = AndroidBillingManagerWithSubscription.f6442J;
                AndroidBillingManagerWithSubscription.PurchaseResult purchaseResult = this.$result;
                this.label = 1;
                Object emit = fv7Var.emit(purchaseResult, this);
                qc2 qc2Var = qc2.f34309u;
                if (emit == qc2Var) {
                    return qc2Var;
                }
            } else {
                if (i != 1) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
            }
            sx7.m18364b(sx7.f39332a, "📤 Emitted purchase result: " + this.$result.getMessage(), "androidBilling", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "androidBilling", e, "Failed to emit purchase result");
        }
        return txc.f41359a;
    }
}
