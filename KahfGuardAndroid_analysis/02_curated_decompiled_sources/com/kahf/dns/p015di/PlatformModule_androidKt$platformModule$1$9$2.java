package com.kahf.dns.p015di;

import p000.C0917v3;
import p000.b53;
import p000.d0a;
import p000.jm4;
import p000.mta;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.tda;
import p000.txc;
import p000.uda;
import p000.v11;
import p000.v43;
import p000.xa2;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$9$2", m17483f = "PlatformModule.android.kt", m17484l = {170}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class PlatformModule_androidKt$platformModule$1$9$2 extends s1c implements jm4 {
    final /* synthetic */ mta $this_single;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformModule_androidKt$platformModule$1$9$2(mta mtaVar, xa2 xa2Var) {
        super(2, xa2Var);
        this.$this_single = mtaVar;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        PlatformModule_androidKt$platformModule$1$9$2 platformModule_androidKt$platformModule$1$9$2 = new PlatformModule_androidKt$platformModule$1$9$2(this.$this_single, xa2Var);
        platformModule_androidKt$platformModule$1$9$2.L$0 = obj;
        return platformModule_androidKt$platformModule$1$9$2;
    }

    @Override // p000.jm4
    public final Object invoke(String str, xa2 xa2Var) {
        return ((PlatformModule_androidKt$platformModule$1$9$2) create(str, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object m1659f;
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            mta mtaVar = this.$this_single;
            zn1 m5838a = d0a.m5838a(v43.class);
            mtaVar.getClass();
            v43 v43Var = (v43) mtaVar.m13737e(m5838a, null, null);
            this.L$0 = null;
            this.label = 1;
            m1659f = ((b53) v43Var).m1659f(str, this);
            qc2 qc2Var = qc2.f34309u;
            if (m1659f == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
            m1659f = ((uda) obj).f42208u;
        }
        if (!(m1659f instanceof tda)) {
            m1659f = txc.f41359a;
        }
        return new uda(m1659f);
    }
}
