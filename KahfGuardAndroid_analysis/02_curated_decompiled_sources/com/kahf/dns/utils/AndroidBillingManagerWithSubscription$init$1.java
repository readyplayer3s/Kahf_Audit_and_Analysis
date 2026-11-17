package com.kahf.dns.utils;

import p000.C0602ml;
import p000.C0917v3;
import p000.d48;
import p000.dt2;
import p000.jm4;
import p000.jzd;
import p000.k83;
import p000.m48;
import p000.pc2;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.tda;
import p000.txc;
import p000.uda;
import p000.v11;
import p000.vu2;
import p000.xa2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$init$1", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {511}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes.dex */
public final class AndroidBillingManagerWithSubscription$init$1 extends s1c implements jm4 {
    final /* synthetic */ d48 $networkUtil;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBillingManagerWithSubscription$init$1(d48 d48Var, xa2 xa2Var) {
        super(2, xa2Var);
        this.$networkUtil = d48Var;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        AndroidBillingManagerWithSubscription$init$1 androidBillingManagerWithSubscription$init$1 = new AndroidBillingManagerWithSubscription$init$1(this.$networkUtil, xa2Var);
        androidBillingManagerWithSubscription$init$1.L$0 = obj;
        return androidBillingManagerWithSubscription$init$1;
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$init$1) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object tdaVar;
        boolean z;
        int i = this.label;
        try {
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        if (i == 0) {
            v11.m20244z(obj);
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = AndroidBillingManagerWithSubscription.INSTANCE;
            d48 d48Var = this.$networkUtil;
            if (d48Var == null) {
                z = false;
                tdaVar = Boolean.valueOf(z);
                if (uda.m19582a(tdaVar) != null) {
                    tdaVar = Boolean.FALSE;
                }
                AndroidBillingManagerWithSubscription.f6461h = ((Boolean) tdaVar).booleanValue();
                return txc.f41359a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            vu2 vu2Var = k83.f21845a;
            obj = jzd.m11694F(dt2.f8706v, new C0602ml((m48) d48Var, null, (byte) 7), this);
            qc2 qc2Var = qc2.f34309u;
            if (obj == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
        }
        z = ((Boolean) obj).booleanValue();
        tdaVar = Boolean.valueOf(z);
        if (uda.m19582a(tdaVar) != null) {
        }
        AndroidBillingManagerWithSubscription.f6461h = ((Boolean) tdaVar).booleanValue();
        return txc.f41359a;
    }
}
