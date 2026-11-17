package com.kahf.dns.p015di;

import p000.bn8;
import p000.cl8;
import p000.d0a;
import p000.d4b;
import p000.fc2;
import p000.fh6;
import p000.ftb;
import p000.iz3;
import p000.jm4;
import p000.lo7;
import p000.mta;
import p000.nm8;
import p000.pr1;
import p000.rs0;
import p000.tm8;
import p000.txc;
import p000.vm8;
import p000.wf5;
import p000.wk8;
import p000.xab;
import p000.xs8;
import p000.yk8;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class EnrollModuleKt {
    private static final lo7 enrollModule;

    static {
        lo7 lo7Var = new lo7();
        enrollModule$lambda$0(lo7Var);
        enrollModule = lo7Var;
    }

    private static final txc enrollModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        fc2 fc2Var = new fc2((byte) 7);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(yk8.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, fc2Var, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(tm8.class), null, new fc2((byte) 8), fh6Var)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar, d0a.m5838a(nm8.class), null, new jm4() { // from class: com.kahf.dns.di.EnrollModuleKt$enrollModule$lambda$0$$inlined$viewModelOf$default$1
            @Override // p000.jm4
            public final nm8 invoke(mta mtaVar, xs8 xs8Var) {
                Object m15970d = pr1.m15970d(mtaVar, xs8Var, yk8.class, null, null);
                return new nm8((yk8) m15970d, (bn8) mtaVar.m13737e(d0a.m5838a(bn8.class), null, null), (wk8) mtaVar.m13737e(d0a.m5838a(wk8.class), null, null));
            }
        }, fh6.f11980v)));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yk8 enrollModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new cl8((wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tm8 enrollModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new vm8((wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null));
    }

    public static final lo7 getEnrollModule() {
        return enrollModule;
    }
}
