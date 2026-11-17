package com.kahf.dns.p015di.core;

import android.content.Context;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0596mf;
import p000.caa;
import p000.d0a;
import p000.d4b;
import p000.dn8;
import p000.eaa;
import p000.fh6;
import p000.ftb;
import p000.j33;
import p000.lo7;
import p000.mk8;
import p000.mta;
import p000.oi4;
import p000.pr1;
import p000.raa;
import p000.rs0;
import p000.s4c;
import p000.tf0;
import p000.txc;
import p000.v43;
import p000.xab;
import p000.xs8;
import p000.zca;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AndroidRestrictionModuleKt {
    private static final lo7 androidRestrictionModule;

    static {
        lo7 lo7Var = new lo7();
        androidRestrictionModule$lambda$0(lo7Var);
        androidRestrictionModule = lo7Var;
    }

    private static final txc androidRestrictionModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        C0596mf c0596mf = new C0596mf((byte) 6);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(eaa.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, c0596mf, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(zca.class), null, new C0596mf((byte) 7), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(oi4.class), null, new C0596mf((byte) 8), fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(caa.class), null, new C0596mf((byte) 9), fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eaa androidRestrictionModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new eaa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zca androidRestrictionModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new zca((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (tf0) mtaVar.m13737e(d0a.m5838a(tf0.class), null, null), (raa) mtaVar.m13737e(d0a.m5838a(raa.class), null, null), (j33) mtaVar.m13737e(d0a.m5838a(j33.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (mk8) mtaVar.m13737e(d0a.m5838a(mk8.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi4 androidRestrictionModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        return new oi4((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (zca) mtaVar.m13737e(d0a.m5838a(zca.class), null, null), (s4c) mtaVar.m13737e(d0a.m5838a(s4c.class), null, null), (tf0) mtaVar.m13737e(d0a.m5838a(tf0.class), null, null), new AndroidRestrictionModuleKt$androidRestrictionModule$1$3$1((v43) pr1.m15970d(mtaVar, xs8Var, v43.class, null, null), (dn8) mtaVar.m13737e(d0a.m5838a(dn8.class), null, null), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final caa androidRestrictionModule$lambda$0$3(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new caa((raa) mtaVar.m13737e(d0a.m5838a(raa.class), null, null), (eaa) mtaVar.m13737e(d0a.m5838a(eaa.class), null, null), (tf0) mtaVar.m13737e(d0a.m5838a(tf0.class), null, null), (j33) mtaVar.m13737e(d0a.m5838a(j33.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    public static final lo7 getAndroidRestrictionModule() {
        return androidRestrictionModule;
    }
}
