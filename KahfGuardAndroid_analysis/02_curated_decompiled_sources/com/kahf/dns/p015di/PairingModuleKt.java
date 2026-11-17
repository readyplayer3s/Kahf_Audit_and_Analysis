package com.kahf.dns.p015di;

import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import p000.as8;
import p000.c5b;
import p000.d0a;
import p000.d4b;
import p000.fh6;
import p000.ftb;
import p000.hm1;
import p000.iz3;
import p000.j33;
import p000.jc8;
import p000.jr8;
import p000.kc8;
import p000.lo7;
import p000.lr8;
import p000.mta;
import p000.od8;
import p000.pg9;
import p000.ph2;
import p000.pr1;
import p000.q53;
import p000.qi5;
import p000.rs0;
import p000.stb;
import p000.txc;
import p000.wf5;
import p000.xab;
import p000.xs8;
import p000.yq8;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class PairingModuleKt {
    private static final lo7 pairingModule;

    static {
        lo7 lo7Var = new lo7();
        pairingModule$lambda$0(lo7Var);
        pairingModule = lo7Var;
    }

    public static final lo7 getPairingModule() {
        return pairingModule;
    }

    private static final txc pairingModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        qi5 qi5Var = new qi5((byte) 20);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(jr8.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, qi5Var, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(ph2.class), null, new qi5((byte) 21), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(kc8.class), null, new qi5((byte) 22), fh6Var)));
        qi5 qi5Var2 = new qi5((byte) 23);
        zn1 m5838a2 = d0a.m5838a(jc8.class);
        fh6 fh6Var2 = fh6.f11980v;
        lo7Var.m12842a(new iz3(new rs0(ftbVar, m5838a2, null, qi5Var2, fh6Var2)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar, d0a.m5838a(hm1.class), null, new qi5((byte) 24), fh6Var2)));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jr8 pairingModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new lr8((wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ph2 pairingModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        return new as8((PreferencesHelper) pr1.m15970d(mtaVar, xs8Var, PreferencesHelper.class, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pairingModule$lambda$0$1$0(PreferencesHelper preferencesHelper) {
        String stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.KEY_USER_NAME, "");
        if (stb.m18260Z0(stringFromPreferences)) {
            return null;
        }
        return stringFromPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kc8 pairingModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new pg9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jc8 pairingModule$lambda$0$3(mta mtaVar, xs8 xs8Var) {
        return new jc8((q53) mtaVar.m13737e(d0a.m5838a(q53.class), null, null), (kc8) mtaVar.m13737e(d0a.m5838a(kc8.class), null, null), new od8((PreferencesHelper) pr1.m15970d(mtaVar, xs8Var, PreferencesHelper.class, null, null), (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hm1 pairingModule$lambda$0$4(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new hm1((jr8) mtaVar.m13737e(d0a.m5838a(jr8.class), null, null), (yq8) mtaVar.m13737e(d0a.m5838a(yq8.class), null, null), (j33) mtaVar.m13737e(d0a.m5838a(j33.class), null, null), (q53) mtaVar.m13737e(d0a.m5838a(q53.class), null, null), (ph2) mtaVar.m13737e(d0a.m5838a(ph2.class), null, null), (c5b) mtaVar.m13737e(d0a.m5838a(c5b.class), null, null));
    }
}
