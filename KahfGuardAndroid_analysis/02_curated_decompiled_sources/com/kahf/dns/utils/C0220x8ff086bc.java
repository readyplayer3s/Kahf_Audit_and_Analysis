package com.kahf.dns.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p000.C0917v3;
import p000.gb6;
import p000.jm4;
import p000.ny8;
import p000.oy8;
import p000.pc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.xa2;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$redeliverPendingCelebrations$2", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {}, m17485m = "invokeSuspend", m17486v = 2)
/* renamed from: com.kahf.dns.utils.AndroidBillingManagerWithSubscription$redeliverPendingCelebrations$2 */
/* loaded from: classes2.dex */
public final class C0220x8ff086bc extends s1c implements jm4 {
    int label;

    public C0220x8ff086bc(xa2 xa2Var) {
        super(2, xa2Var);
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new C0220x8ff086bc(xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((C0220x8ff086bc) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object obj2;
        List list;
        ArrayList<ny8> arrayList;
        List list2;
        if (this.label != 0) {
            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v11.m20244z(obj);
        context = AndroidBillingManagerWithSubscription.f6454a;
        if (context == null) {
            return txc.f41359a;
        }
        obj2 = AndroidBillingManagerWithSubscription.f6447O;
        synchronized (obj2) {
            gb6 gb6Var = oy8.f31469a;
            list = AndroidBillingManagerWithSubscription.f6448P;
            String access$currentAccountId = AndroidBillingManagerWithSubscription.access$currentAccountId(AndroidBillingManagerWithSubscription.INSTANCE);
            list.getClass();
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                ny8 ny8Var = (ny8) obj3;
                if (access$currentAccountId != null && zy5.m23838d(ny8Var.f29157e, access$currentAccountId)) {
                    arrayList.add(obj3);
                }
            }
            int size = arrayList.size();
            list2 = AndroidBillingManagerWithSubscription.f6448P;
            if (size != list2.size()) {
                AndroidBillingManagerWithSubscription.access$persistPendingCelebrations(AndroidBillingManagerWithSubscription.INSTANCE, arrayList);
            }
        }
        for (ny8 ny8Var2 : arrayList) {
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = AndroidBillingManagerWithSubscription.INSTANCE;
            AndroidBillingManagerWithSubscription.access$emitPurchaseResult(androidBillingManagerWithSubscription, AndroidBillingManagerWithSubscription.access$successResult(androidBillingManagerWithSubscription, ny8Var2));
        }
        return txc.f41359a;
    }
}
