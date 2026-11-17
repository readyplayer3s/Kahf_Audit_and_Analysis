package com.kahf.dns.p015di;

import p000.AbstractC0492jm;
import p000.C0917v3;
import p000.ad7;
import p000.d0a;
import p000.dn8;
import p000.mta;
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
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$17$2", m17483f = "PlatformModule.android.kt", m17484l = {248}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class PlatformModule_androidKt$platformModule$1$17$2 extends s1c implements vl4 {
    final /* synthetic */ mta $this_single;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformModule_androidKt$platformModule$1$17$2(mta mtaVar, xa2 xa2Var) {
        super(1, xa2Var);
        this.$this_single = mtaVar;
    }

    @Override // p000.dp0
    public final xa2 create(xa2 xa2Var) {
        return new PlatformModule_androidKt$platformModule$1$17$2(this.$this_single, xa2Var);
    }

    @Override // p000.vl4
    public final Object invoke(xa2 xa2Var) {
        return ((PlatformModule_androidKt$platformModule$1$17$2) create(xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object m426z;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            mta mtaVar = this.$this_single;
            zn1 m5838a = d0a.m5838a(v43.class);
            mtaVar.getClass();
            v43 v43Var = (v43) mtaVar.m13737e(m5838a, null, null);
            mta mtaVar2 = this.$this_single;
            zn1 m5838a2 = d0a.m5838a(dn8.class);
            mtaVar2.getClass();
            boolean z = ((dn8) mtaVar2.m13737e(m5838a2, null, null)).mo6459a() != null;
            C01841 c01841 = C01841.INSTANCE;
            this.label = 1;
            m426z = ad7.m426z(v43Var, z, c01841, this);
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
    /* renamed from: com.kahf.dns.di.PlatformModule_androidKt$platformModule$1$17$2$1 */
    public static final /* synthetic */ class C01841 extends xm4 implements vl4 {
        public static final C01841 INSTANCE = new C01841();

        public C01841() {
            super(1, AbstractC0492jm.class, "androidOrgDeviceClient", "androidOrgDeviceClient(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // p000.vl4
        public final Object invoke(xa2 xa2Var) {
            return AbstractC0492jm.m11396c(xa2Var);
        }
    }
}
