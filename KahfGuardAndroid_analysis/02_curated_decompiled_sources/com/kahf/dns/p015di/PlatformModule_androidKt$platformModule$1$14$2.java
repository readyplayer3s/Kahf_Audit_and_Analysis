package com.kahf.dns.p015di;

import p000.C0917v3;
import p000.cf0;
import p000.d0a;
import p000.i07;
import p000.mta;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.vl4;
import p000.xa2;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$14$2", m17483f = "PlatformModule.android.kt", m17484l = {213}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes.dex */
public final class PlatformModule_androidKt$platformModule$1$14$2 extends s1c implements vl4 {
    final /* synthetic */ mta $this_single;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformModule_androidKt$platformModule$1$14$2(mta mtaVar, xa2 xa2Var) {
        super(1, xa2Var);
        this.$this_single = mtaVar;
    }

    @Override // p000.dp0
    public final xa2 create(xa2 xa2Var) {
        return new PlatformModule_androidKt$platformModule$1$14$2(this.$this_single, xa2Var);
    }

    @Override // p000.vl4
    public final Object invoke(xa2 xa2Var) {
        return ((PlatformModule_androidKt$platformModule$1$14$2) create(xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            mta mtaVar = this.$this_single;
            zn1 m5838a = d0a.m5838a(cf0.class);
            mtaVar.getClass();
            cf0 cf0Var = (cf0) mtaVar.m13737e(m5838a, null, null);
            this.label = 1;
            Object m3146o = cf0Var.m3146o(i07.f17201b, this);
            qc2 qc2Var = qc2.f34309u;
            if (m3146o == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
        }
        return txc.f41359a;
    }
}
