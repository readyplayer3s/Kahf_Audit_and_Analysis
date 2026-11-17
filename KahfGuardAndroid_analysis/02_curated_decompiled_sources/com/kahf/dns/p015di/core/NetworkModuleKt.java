package com.kahf.dns.p015di.core;

import android.content.Context;
import com.kahf.dns.p015di.core.NetworkModuleKt;
import p000.C0415hh;
import p000.C0917v3;
import p000.bz6;
import p000.ca2;
import p000.d0a;
import p000.d48;
import p000.d4b;
import p000.dg5;
import p000.ds1;
import p000.f95;
import p000.fc2;
import p000.fh6;
import p000.ftb;
import p000.ga6;
import p000.gb6;
import p000.jm4;
import p000.lc6;
import p000.lo7;
import p000.lu2;
import p000.lz6;
import p000.m48;
import p000.mg5;
import p000.mta;
import p000.n92;
import p000.o92;
import p000.og5;
import p000.ok7;
import p000.ozd;
import p000.pr1;
import p000.rs0;
import p000.sx7;
import p000.txc;
import p000.ty6;
import p000.u92;
import p000.ub0;
import p000.uf5;
import p000.uh6;
import p000.wf5;
import p000.x30;
import p000.xab;
import p000.xs8;
import p000.y92;
import p000.zn1;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class NetworkModuleKt {
    public static final lo7 networkModule(boolean z) {
        lo7 lo7Var = new lo7();
        networkModule$lambda$0(z, lo7Var);
        return lo7Var;
    }

    private static final txc networkModule$lambda$0(final boolean z, lo7 lo7Var) {
        lo7Var.getClass();
        jm4 jm4Var = new jm4() { // from class: r38
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                wf5 networkModule$lambda$0$0;
                networkModule$lambda$0$0 = NetworkModuleKt.networkModule$lambda$0$0(z, (mta) obj, (xs8) obj2);
                return networkModule$lambda$0$0;
            }
        };
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(wf5.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, jm4Var, fh6Var)));
        pr1.m15989w(new rs0(ftbVar, d0a.m5838a(d48.class), null, new fc2((byte) 13), fh6Var), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wf5 networkModule$lambda$0$0(boolean z, mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        mg5 mg5Var = (mg5) og5.f30379a.getValue();
        mg5Var.getClass();
        dg5 dg5Var = new dg5();
        networkModule$lambda$0$0$0(z, dg5Var);
        return new wf5(mg5Var.mo6064a(dg5Var.f8021d), dg5Var);
    }

    private static final txc networkModule$lambda$0$0$0(boolean z, dg5 dg5Var) {
        dg5Var.getClass();
        dg5Var.f8022e = true;
        ub0 ub0Var = lu2.f25087a;
        dg5Var.m6302a(uf5.f42309b, new C0415hh((Object) dg5Var, (byte) 7));
        if (z) {
            dg5Var.m6302a(lz6.m13058j(), new ok7((byte) 10));
        }
        dg5Var.m6302a(u92.f42006e, new ok7((byte) 11));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.kahf.dns.di.core.NetworkModuleKt$networkModule$1$1$1$1$1] */
    public static final txc networkModule$lambda$0$0$0$0(bz6 bz6Var) {
        bz6Var.getClass();
        bz6Var.m2551a();
        bz6Var.m2552b(new ty6() { // from class: com.kahf.dns.di.core.NetworkModuleKt$networkModule$1$1$1$1$1
            @Override // p000.ty6
            public void log(String str) {
                str.getClass();
                sx7.m18367e(sx7.f39332a, str, "Http Client", 2);
            }
        });
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc networkModule$lambda$0$0$0$1(o92 o92Var) {
        o92Var.getClass();
        gb6 m15425a = ozd.m15425a(new ok7((byte) 9));
        int i = lc6.f24118a;
        ca2 ca2Var = y92.f49947a;
        ca2Var.getClass();
        o92Var.f29890b.add(new n92(new uh6(m15425a), ca2Var, new x30(ca2Var)));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc networkModule$lambda$0$0$0$1$0(ga6 ga6Var) {
        ga6Var.getClass();
        ga6Var.f13744c = true;
        ga6Var.f13745d = true;
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d48 networkModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        zn1 m5838a = d0a.m5838a(Context.class);
        ds1 ds1Var = f95.f11477y;
        if (ds1Var != null) {
            return new m48((Context) ((mta) ((d4b) ds1Var.f8644c).f7326y).m13737e(m5838a, null, null));
        }
        C0917v3.m20303j("KoinApplication has not been started");
        return null;
    }
}
