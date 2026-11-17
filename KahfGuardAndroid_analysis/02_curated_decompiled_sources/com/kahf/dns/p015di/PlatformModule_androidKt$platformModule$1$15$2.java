package com.kahf.dns.p015di;

import p000.C0917v3;
import p000.cf0;
import p000.d0a;
import p000.ik1;
import p000.jm4;
import p000.jzd;
import p000.mta;
import p000.pc2;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.xa2;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$15$2", m17483f = "PlatformModule.android.kt", m17484l = {}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class PlatformModule_androidKt$platformModule$1$15$2 extends s1c implements jm4 {
    final /* synthetic */ pc2 $endScope;
    final /* synthetic */ mta $this_single;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    @rp2(m17482c = "com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$15$2$1", m17483f = "PlatformModule.android.kt", m17484l = {232}, m17485m = "invokeSuspend", m17486v = 2)
    /* renamed from: com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$15$2$1 */
    public static final class C01831 extends s1c implements jm4 {
        final /* synthetic */ ik1 $end;
        final /* synthetic */ mta $this_single;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01831(mta mtaVar, ik1 ik1Var, xa2 xa2Var) {
            super(2, xa2Var);
            this.$this_single = mtaVar;
            this.$end = ik1Var;
        }

        @Override // p000.dp0
        public final xa2 create(Object obj, xa2 xa2Var) {
            return new C01831(this.$this_single, this.$end, xa2Var);
        }

        @Override // p000.jm4
        public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
            return ((C01831) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
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
                ik1 ik1Var = this.$end;
                this.label = 1;
                Object m3139f = cf0Var.m3139f(ik1Var, this);
                qc2 qc2Var = qc2.f34309u;
                if (m3139f == qc2Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformModule_androidKt$platformModule$1$15$2(pc2 pc2Var, mta mtaVar, xa2 xa2Var) {
        super(2, xa2Var);
        this.$endScope = pc2Var;
        this.$this_single = mtaVar;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        PlatformModule_androidKt$platformModule$1$15$2 platformModule_androidKt$platformModule$1$15$2 = new PlatformModule_androidKt$platformModule$1$15$2(this.$endScope, this.$this_single, xa2Var);
        platformModule_androidKt$platformModule$1$15$2.L$0 = obj;
        return platformModule_androidKt$platformModule$1$15$2;
    }

    @Override // p000.jm4
    public final Object invoke(ik1 ik1Var, xa2 xa2Var) {
        return ((PlatformModule_androidKt$platformModule$1$15$2) create(ik1Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        ik1 ik1Var = (ik1) this.L$0;
        if (this.label != 0) {
            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v11.m20244z(obj);
        jzd.m11709o(this.$endScope, null, null, new C01831(this.$this_single, ik1Var, null), 3);
        return txc.f41359a;
    }
}
