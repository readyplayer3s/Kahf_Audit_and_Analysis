package com.kahf.dns.p015di;

import com.kahf.dns.utils.PreferencesHelper;
import p000.C1001xd;
import p000.d0a;
import p000.d4b;
import p000.fc2;
import p000.fh6;
import p000.lo7;
import p000.mta;
import p000.pr1;
import p000.rs0;
import p000.td3;
import p000.txc;
import p000.xs8;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class DonationModuleKt {
    private static final lo7 donationModule;

    static {
        lo7 lo7Var = new lo7();
        donationModule$lambda$0(lo7Var);
        donationModule = lo7Var;
    }

    private static final txc donationModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        pr1.m15989w(new rs0(d4b.f7320C, d0a.m5838a(td3.class), null, new fc2((byte) 5), fh6.f11979u), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td3 donationModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new td3((C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    public static final lo7 getDonationModule() {
        return donationModule;
    }
}
