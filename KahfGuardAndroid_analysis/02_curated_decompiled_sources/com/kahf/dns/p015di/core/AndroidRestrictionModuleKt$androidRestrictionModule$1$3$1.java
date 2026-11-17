package com.kahf.dns.p015di.core;

import p000.AbstractC0492jm;
import p000.C0917v3;
import p000.ad7;
import p000.dn8;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.uda;
import p000.v11;
import p000.v43;
import p000.vl4;
import p000.xa2;
import p000.xm4;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.core.AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1", m17483f = "AndroidRestrictionModule.kt", m17484l = {52}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1 extends s1c implements vl4 {
    final /* synthetic */ v43 $deviceRepository;
    final /* synthetic */ dn8 $orgSessionStore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1(v43 v43Var, dn8 dn8Var, xa2 xa2Var) {
        super(1, xa2Var);
        this.$deviceRepository = v43Var;
        this.$orgSessionStore = dn8Var;
    }

    @Override // p000.dp0
    public final xa2 create(xa2 xa2Var) {
        return new AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1(this.$deviceRepository, this.$orgSessionStore, xa2Var);
    }

    @Override // p000.vl4
    public final Object invoke(xa2 xa2Var) {
        return ((AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1) create(xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object m426z;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            v43 v43Var = this.$deviceRepository;
            boolean z = this.$orgSessionStore.mo6459a() != null;
            C01881 c01881 = C01881.INSTANCE;
            this.label = 1;
            m426z = ad7.m426z(v43Var, z, c01881, this);
            qc2 qc2Var = qc2.f34309u;
            if (m426z == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
            m426z = ((uda) obj).f42208u;
        }
        return new uda(m426z);
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* renamed from: com.kahf.dns.di.core.AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1$1 */
    public static final /* synthetic */ class C01881 extends xm4 implements vl4 {
        public static final C01881 INSTANCE = new C01881();

        public C01881() {
            super(1, AbstractC0492jm.class, "androidOrgDeviceClient", "androidOrgDeviceClient(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // p000.vl4
        public final Object invoke(xa2 xa2Var) {
            return AbstractC0492jm.m11396c(xa2Var);
        }
    }
}
