package com.kahf.dns.p015di.core;

import com.kahf.dns.core.analytics.AnalyticsProvider;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0596mf;
import p000.C0884u7;
import p000.C1001xd;
import p000.InterfaceC0015ae;
import p000.cj7;
import p000.d0a;
import p000.d4b;
import p000.fb3;
import p000.fh6;
import p000.ftb;
import p000.lo7;
import p000.m14;
import p000.mta;
import p000.pr1;
import p000.rp9;
import p000.rs0;
import p000.txc;
import p000.xab;
import p000.xs8;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AndroidAnalyticsModuleKt {
    private static final lo7 androidAnalyticsModule;

    static {
        lo7 lo7Var = new lo7();
        androidAnalyticsModule$lambda$0(lo7Var);
        androidAnalyticsModule = lo7Var;
    }

    private static final txc androidAnalyticsModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        C0596mf c0596mf = new C0596mf((byte) 0);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(InterfaceC0015ae.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, c0596mf, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(AnalyticsProvider.class), null, new C0596mf((byte) 1), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(m14.class), null, new C0596mf((byte) 2), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(rp9.class), null, new C0596mf((byte) 3), fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(C0884u7.class), null, new C0596mf((byte) 4), fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0015ae androidAnalyticsModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new AndroidAnalyticsProviderFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsProvider androidAnalyticsModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        return ((InterfaceC0015ae) pr1.m15970d(mtaVar, xs8Var, InterfaceC0015ae.class, null, null)).createAnalyticsProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m14 androidAnalyticsModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new cj7((byte) 24, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rp9 androidAnalyticsModule$lambda$0$3(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new rp9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (fb3) mtaVar.m13737e(d0a.m5838a(fb3.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0884u7 androidAnalyticsModule$lambda$0$4(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0884u7((C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null), (rp9) mtaVar.m13737e(d0a.m5838a(rp9.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    public static final lo7 getAndroidAnalyticsModule() {
        return androidAnalyticsModule;
    }
}
