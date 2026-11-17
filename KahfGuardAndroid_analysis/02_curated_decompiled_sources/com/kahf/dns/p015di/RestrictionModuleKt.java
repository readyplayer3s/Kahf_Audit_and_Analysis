package com.kahf.dns.p015di;

import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.LinkedHashSet;
import java.util.List;
import p000.C1058yx;
import p000.ada;
import p000.cb2;
import p000.cf0;
import p000.co3;
import p000.d0a;
import p000.d48;
import p000.d4b;
import p000.dt2;
import p000.fh6;
import p000.ftb;
import p000.fz8;
import p000.h57;
import p000.hda;
import p000.hj1;
import p000.iz3;
import p000.jm4;
import p000.k5a;
import p000.k83;
import p000.lo7;
import p000.m10;
import p000.m78;
import p000.mta;
import p000.muc;
import p000.mv1;
import p000.oda;
import p000.og9;
import p000.oga;
import p000.paa;
import p000.pc2;
import p000.pfc;
import p000.pr1;
import p000.raa;
import p000.rl7;
import p000.rs0;
import p000.s4c;
import p000.sy0;
import p000.tb5;
import p000.tf0;
import p000.txc;
import p000.vbb;
import p000.vi1;
import p000.vu2;
import p000.xab;
import p000.xi1;
import p000.xs8;
import p000.yg9;
import p000.z99;
import p000.zaa;
import p000.zn1;
import p000.zz6;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class RestrictionModuleKt {
    private static final lo7 restrictionModule;

    static {
        lo7 lo7Var = new lo7();
        restrictionModule$lambda$0(lo7Var);
        restrictionModule = lo7Var;
    }

    public static final lo7 getRestrictionModule() {
        return restrictionModule;
    }

    private static final txc restrictionModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        LinkedHashSet linkedHashSet = lo7Var.f24773b;
        ftb ftbVar = new ftb("ioScope");
        k5a k5aVar = new k5a((byte) 17);
        ftb ftbVar2 = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(pc2.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar2, m5838a, ftbVar, k5aVar, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(pc2.class), new ftb("defaultScope"), new k5a((byte) 22), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(pc2.class), new ftb("mainScope"), new k5a((byte) 23), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(raa.class), null, new k5a((byte) 24), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(vi1.class), null, new k5a((byte) 25), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(s4c.class), null, new k5a((byte) 12), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(co3.class), null, new k5a((byte) 13), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(hda.class), null, new k5a((byte) 14), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(ada.class), null, new k5a((byte) 15), fh6Var)));
        xab xabVar = new xab(new rs0(ftbVar2, d0a.m5838a(zz6.class), null, new k5a((byte) 16), fh6Var));
        lo7Var.m12842a(xabVar);
        linkedHashSet.add(xabVar);
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(hj1.class), null, new k5a((byte) 18), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(cb2.class), null, new k5a((byte) 19), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(List.class), null, new k5a((byte) 20), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar2, d0a.m5838a(tb5.class), null, new k5a((byte) 21), fh6Var)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar2, d0a.m5838a(oda.class), null, new jm4() { // from class: com.kahf.dns.di.RestrictionModuleKt$restrictionModule$lambda$0$$inlined$viewModelOf$default$1
            @Override // p000.jm4
            public final oda invoke(mta mtaVar, xs8 xs8Var) {
                Object m15970d = pr1.m15970d(mtaVar, xs8Var, raa.class, null, null);
                return new oda((raa) m15970d, (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (s4c) mtaVar.m13737e(d0a.m5838a(s4c.class), null, null));
            }
        }, fh6.f11980v)));
        pr1.m15989w(new rs0(ftbVar2, d0a.m5838a(paa.class), null, new jm4() { // from class: com.kahf.dns.di.RestrictionModuleKt$restrictionModule$lambda$0$$inlined$singleOf$default$1
            @Override // p000.jm4
            public final paa invoke(mta mtaVar, xs8 xs8Var) {
                return new paa((raa) pr1.m15970d(mtaVar, xs8Var, raa.class, null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
            }
        }, fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc2 restrictionModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        vu2 vu2Var = k83.f21845a;
        return muc.m13765a(dt2.f8706v.plus(sy0.m18375J()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc2 restrictionModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return muc.m13765a(k83.f21845a.plus(sy0.m18375J()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hj1 restrictionModule$lambda$0$10(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new hj1((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (s4c) mtaVar.m13737e(d0a.m5838a(s4c.class), null, null), (tf0) mtaVar.m13737e(d0a.m5838a(cf0.class), null, null), (ada) mtaVar.m13737e(d0a.m5838a(ada.class), null, null), (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cb2 restrictionModule$lambda$0$11(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new cb2((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List restrictionModule$lambda$0$12(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return mv1.m13794F(m78.f25767b, m78.f25771f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tb5 restrictionModule$lambda$0$13(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new tb5((List) mtaVar.m13737e(d0a.m5838a(List.class), null, null), (cb2) mtaVar.m13737e(d0a.m5838a(cb2.class), null, null), (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc2 restrictionModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        vu2 vu2Var = k83.f21845a;
        return muc.m13765a(h57.f15547a.plus(sy0.m18375J()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final raa restrictionModule$lambda$0$3(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new zaa((C1058yx) mtaVar.m13737e(d0a.m5838a(C1058yx.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (d48) mtaVar.m13737e(d0a.m5838a(d48.class), null, null), (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vi1 restrictionModule$lambda$0$4(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new xi1((C1058yx) mtaVar.m13737e(d0a.m5838a(C1058yx.class), null, null), (d48) mtaVar.m13737e(d0a.m5838a(d48.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4c restrictionModule$lambda$0$5(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new s4c((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final co3 restrictionModule$lambda$0$6(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new co3((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hda restrictionModule$lambda$0$7(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new hda(new yg9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ada restrictionModule$lambda$0$8(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new ada((raa) mtaVar.m13737e(d0a.m5838a(raa.class), null, null), (s4c) mtaVar.m13737e(d0a.m5838a(s4c.class), null, null), (vi1) mtaVar.m13737e(d0a.m5838a(vi1.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (m10) mtaVar.m13737e(d0a.m5838a(m10.class), null, null), (vbb) mtaVar.m13737e(d0a.m5838a(vbb.class), null, null), (oga) mtaVar.m13737e(d0a.m5838a(oga.class), null, null), (rl7) mtaVar.m13737e(d0a.m5838a(rl7.class), null, null), (co3) mtaVar.m13737e(d0a.m5838a(co3.class), null, null), (hda) mtaVar.m13737e(d0a.m5838a(hda.class), null, null), (fz8) mtaVar.m13737e(d0a.m5838a(fz8.class), null, null), (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope")), new pfc(new RestrictionModuleKt$restrictionModule$1$9$1(mtaVar, null), new z99(mtaVar, (byte) 6), new og9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String restrictionModule$lambda$0$8$0(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        return ((PreferencesHelper) mtaVar.m13737e(m5838a, null, null)).getStringFromPreferences(PrefKeys.KEY_DEVICE_MONGODB_ID, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zz6 restrictionModule$lambda$0$9(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new zz6((tf0) mtaVar.m13737e(d0a.m5838a(cf0.class), null, null), (ada) mtaVar.m13737e(d0a.m5838a(ada.class), null, null), (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope")));
    }
}
