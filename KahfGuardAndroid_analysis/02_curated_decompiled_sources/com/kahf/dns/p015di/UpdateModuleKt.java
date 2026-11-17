package com.kahf.dns.p015di;

import com.kahf.dns.utils.PreferencesHelper;
import p000.C1001xd;
import p000.ara;
import p000.d0a;
import p000.d4b;
import p000.fh6;
import p000.ftb;
import p000.iz3;
import p000.jm4;
import p000.k2d;
import p000.l1d;
import p000.lo7;
import p000.mta;
import p000.pr1;
import p000.rs0;
import p000.txc;
import p000.xab;
import p000.xs8;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class UpdateModuleKt {
    private static final lo7 updateModule;

    static {
        lo7 lo7Var = new lo7();
        updateModule$lambda$0(lo7Var);
        updateModule = lo7Var;
    }

    public static final lo7 getUpdateModule() {
        return updateModule;
    }

    private static final txc updateModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        ara araVar = new ara((byte) 26);
        ftb ftbVar = d4b.f7320C;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(l1d.class), null, araVar, fh6.f11979u)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar, d0a.m5838a(k2d.class), null, new jm4() { // from class: com.kahf.dns.di.UpdateModuleKt$updateModule$lambda$0$$inlined$factoryOf$default$1
            @Override // p000.jm4
            public final k2d invoke(mta mtaVar, xs8 xs8Var) {
                Object m15970d = pr1.m15970d(mtaVar, xs8Var, l1d.class, null, null);
                return new k2d((l1d) m15970d, (C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
            }
        }, fh6.f11980v)));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1d updateModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new l1d((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }
}
