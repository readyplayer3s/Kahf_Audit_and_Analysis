package com.kahf.dns.p015di.core;

import com.kahf.dns.core.analytics.AnalyticsProvider;
import com.kahf.dns.p015di.DIError;
import com.kahf.dns.p015di.DIErrorKt;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0596mf;
import p000.C1001xd;
import p000.C1058yx;
import p000.cf0;
import p000.d0a;
import p000.d4b;
import p000.de6;
import p000.dq7;
import p000.ds2;
import p000.fh6;
import p000.ftb;
import p000.i83;
import p000.iz3;
import p000.j33;
import p000.jm4;
import p000.lo7;
import p000.m40;
import p000.m6b;
import p000.mta;
import p000.n6b;
import p000.nl3;
import p000.pr1;
import p000.rs0;
import p000.sr2;
import p000.sx7;
import p000.td3;
import p000.txc;
import p000.v57;
import p000.x74;
import p000.xab;
import p000.xs8;
import p000.yu1;
import p000.zn1;
import p000.ztc;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class CommonModuleKt {
    private static final lo7 commonModule;

    static {
        lo7 lo7Var = new lo7();
        commonModule$lambda$0(lo7Var);
        commonModule = lo7Var;
    }

    private static final txc commonModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        C0596mf c0596mf = new C0596mf((byte) 10);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(i83.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, c0596mf, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(PreferencesHelper.class), null, new C0596mf((byte) 11), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(m6b.class), null, new C0596mf((byte) 12), fh6Var)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar, d0a.m5838a(v57.class), null, new jm4() { // from class: com.kahf.dns.di.core.CommonModuleKt$commonModule$lambda$0$$inlined$viewModelOf$default$1
            @Override // p000.jm4
            public final v57 invoke(mta mtaVar, xs8 xs8Var) {
                Object m15970d = pr1.m15970d(mtaVar, xs8Var, m6b.class, null, null);
                Object m13737e = mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null);
                Object m13737e2 = mtaVar.m13737e(d0a.m5838a(dq7.class), null, null);
                Object m13737e3 = mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null);
                Object m13737e4 = mtaVar.m13737e(d0a.m5838a(cf0.class), null, null);
                Object m13737e5 = mtaVar.m13737e(d0a.m5838a(m40.class), null, null);
                return new v57((m6b) m15970d, (C1001xd) m13737e, (dq7) m13737e2, (PreferencesHelper) m13737e3, (cf0) m13737e4, (m40) m13737e5, (td3) mtaVar.m13737e(d0a.m5838a(td3.class), null, null), (ztc) mtaVar.m13737e(d0a.m5838a(ztc.class), null, null));
            }
        }, fh6.f11980v)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(de6.class), null, new C0596mf((byte) 13), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(j33.class), null, new C0596mf((byte) 14), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(x74.class), null, new C0596mf((byte) 15), fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(C1001xd.class), null, new C0596mf((byte) 16), fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i83 commonModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new nl3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreferencesHelper commonModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        try {
            PreferencesHelper platformPreferencesHelper = CoreModule_androidKt.getPlatformPreferencesHelper();
            sx7.m18364b(sx7.f39332a, "PreferencesHelper initialized", null, 6);
            return platformPreferencesHelper;
        } catch (Exception e) {
            DIErrorKt.logDIError(new DIError.InitializationError("Failed to create PreferencesHelper", e));
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m6b commonModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new n6b((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final de6 commonModule$lambda$0$4(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new nl3((C1058yx) mtaVar.m13737e(d0a.m5838a(C1058yx.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j33 commonModule$lambda$0$5(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new sr2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x74 commonModule$lambda$0$6(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new ds2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1001xd commonModule$lambda$0$7(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C1001xd((AnalyticsProvider) mtaVar.m13737e(d0a.m5838a(AnalyticsProvider.class), null, null));
    }

    public static final lo7 getCommonModule() {
        return commonModule;
    }

    private static final void providesRepositories(lo7 lo7Var) {
        pr1.m15989w(new rs0(d4b.f7320C, d0a.m5838a(m6b.class), null, new yu1((byte) 1), fh6.f11979u), lo7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m6b providesRepositories$lambda$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new n6b((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    private static final void providesUtils(lo7 lo7Var) {
        yu1 yu1Var = new yu1((byte) 2);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(i83.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, yu1Var, fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(PreferencesHelper.class), null, new yu1((byte) 3), fh6Var), lo7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i83 providesUtils$lambda$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new nl3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreferencesHelper providesUtils$lambda$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        try {
            PreferencesHelper platformPreferencesHelper = CoreModule_androidKt.getPlatformPreferencesHelper();
            sx7.m18364b(sx7.f39332a, "PreferencesHelper initialized", null, 6);
            return platformPreferencesHelper;
        } catch (Exception e) {
            DIErrorKt.logDIError(new DIError.InitializationError("Failed to create PreferencesHelper", e));
            throw e;
        }
    }
}
