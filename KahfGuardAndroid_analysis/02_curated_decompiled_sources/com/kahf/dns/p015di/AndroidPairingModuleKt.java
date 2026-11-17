package com.kahf.dns.p015di;

import p000.C0809s6;
import p000.d0a;
import p000.d4b;
import p000.dy1;
import p000.fh6;
import p000.ftb;
import p000.gy2;
import p000.j30;
import p000.k83;
import p000.kd6;
import p000.lo7;
import p000.mta;
import p000.muc;
import p000.nt8;
import p000.rs0;
import p000.sy0;
import p000.txc;
import p000.xab;
import p000.xs8;
import p000.yw6;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class AndroidPairingModuleKt {
    private static final lo7 androidPairingModule;

    static {
        lo7 lo7Var = new lo7();
        androidPairingModule$lambda$0(lo7Var);
        androidPairingModule = lo7Var;
    }

    private static final txc androidPairingModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        dy1 dy1Var = new dy1((byte) 11);
        ftb ftbVar = d4b.f7320C;
        rs0 rs0Var = new rs0(ftbVar, d0a.m5838a(nt8.class), null, dy1Var, fh6.f11979u);
        xab xabVar = new xab(rs0Var);
        lo7Var.m12842a(xabVar);
        zn1 m5838a = d0a.m5838a(gy2.class);
        rs0Var.f37188f.add(m5838a);
        lo7Var.f24774c.put(kd6.m11974a(m5838a) + "::" + ftbVar, xabVar);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nt8 androidPairingModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new nt8(new C0809s6((byte) 11), j30.f19522c, muc.m13765a(yw6.m23122r(sy0.m18375J(), k83.f21845a)));
    }

    public static final lo7 getAndroidPairingModule() {
        return androidPairingModule;
    }
}
