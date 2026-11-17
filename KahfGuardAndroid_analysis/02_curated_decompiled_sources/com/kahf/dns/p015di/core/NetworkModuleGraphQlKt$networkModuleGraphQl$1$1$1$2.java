package com.kahf.dns.p015di.core;

import p000.C0917v3;
import p000.b1a;
import p000.qc2;
import p000.rp2;
import p000.s1c;
import p000.txc;
import p000.v11;
import p000.vl4;
import p000.xa2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.di.core.NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2", m17483f = "NetworkModuleGraphQl.kt", m17484l = {114}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
public final class NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2 extends s1c implements vl4 {
    final /* synthetic */ b1a $refreshTokenFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2(b1a b1aVar, xa2 xa2Var) {
        super(1, xa2Var);
        this.$refreshTokenFlow = b1aVar;
    }

    @Override // p000.dp0
    public final xa2 create(xa2 xa2Var) {
        return new NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2(this.$refreshTokenFlow, xa2Var);
    }

    @Override // p000.vl4
    public final Object invoke(xa2 xa2Var) {
        return ((NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2) create(xa2Var)).invokeSuspend(txc.f41359a);
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            b1a b1aVar = this.$refreshTokenFlow;
            this.label = 1;
            Object m1565b = b1aVar.m1565b(b1aVar.f2449a.mo6460b(), this);
            qc2 qc2Var = qc2.f34309u;
            if (m1565b == qc2Var) {
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
