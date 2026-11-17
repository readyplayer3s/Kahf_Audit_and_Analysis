package com.kahf.dns.p015di;

import p000.av2;
import p000.d0a;
import p000.d4b;
import p000.fh6;
import p000.ftb;
import p000.jm4;
import p000.k5a;
import p000.lo7;
import p000.mta;
import p000.pr1;
import p000.rs0;
import p000.txc;
import p000.xab;
import p000.xs8;
import p000.zn1;
import p000.zoa;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class SalatModuleKt {
    private static final lo7 salatModule;

    static {
        lo7 lo7Var = new lo7();
        salatModule$lambda$0(lo7Var);
        salatModule = lo7Var;
    }

    public static final lo7 getSalatModule() {
        return salatModule;
    }

    private static final txc salatModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        k5a k5aVar = new k5a((byte) 27);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(zoa.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, k5aVar, fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(av2.class), null, new jm4() { // from class: com.kahf.dns.di.SalatModuleKt$salatModule$lambda$0$$inlined$singleOf$default$1
            @Override // p000.jm4
            public final av2 invoke(mta mtaVar, xs8 xs8Var) {
                return new av2((zoa) pr1.m15970d(mtaVar, xs8Var, zoa.class, null, null));
            }
        }, fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoa salatModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new zoa();
    }
}
