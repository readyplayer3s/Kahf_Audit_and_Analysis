package com.kahf.dns.p015di;

import java.util.List;
import p000.C0917v3;
import p000.b53;
import p000.d0a;
import p000.lm4;
import p000.mta;
import p000.mv1;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.tda;
import p000.txc;
import p000.uda;
import p000.v11;
import p000.v43;
import p000.xa2;
import p000.y33;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.RestrictionModuleKt$restrictionModule$1$9$1", m17483f = "RestrictionModule.kt", m17484l = {152}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class RestrictionModuleKt$restrictionModule$1$9$1 extends s1c implements lm4 {
    final /* synthetic */ mta $this_single;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionModuleKt$restrictionModule$1$9$1(mta mtaVar, xa2 xa2Var) {
        super(3, xa2Var);
        this.$this_single = mtaVar;
    }

    @Override // p000.lm4
    public final Object invoke(String str, String str2, xa2 xa2Var) {
        RestrictionModuleKt$restrictionModule$1$9$1 restrictionModuleKt$restrictionModule$1$9$1 = new RestrictionModuleKt$restrictionModule$1$9$1(this.$this_single, xa2Var);
        restrictionModuleKt$restrictionModule$1$9$1.L$0 = str;
        restrictionModuleKt$restrictionModule$1$9$1.L$1 = str2;
        return restrictionModuleKt$restrictionModule$1$9$1.invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        Object m1658e;
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            mta mtaVar = this.$this_single;
            zn1 m5838a = d0a.m5838a(v43.class);
            mtaVar.getClass();
            v43 v43Var = (v43) mtaVar.m13737e(m5838a, null, null);
            List m13793E = mv1.m13793E(new y33("kahf_local_defaults", str2));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            m1658e = ((b53) v43Var).m1658e(this, str, m13793E);
            qc2 qc2Var = qc2.f34309u;
            if (m1658e == qc2Var) {
                return qc2Var;
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
            m1658e = ((uda) obj).f42208u;
        }
        if (!(m1658e instanceof tda)) {
            m1658e = txc.f41359a;
        }
        return new uda(m1658e);
    }
}
