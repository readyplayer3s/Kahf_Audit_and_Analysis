package com.kahf.dns.p015di;

import android.app.Activity;
import android.content.Context;
import coil3.disk.DiskLruCache;
import com.github.mikephil.charting.charts.Chart;
import com.kahf.dns.data.database.AppDatabase;
import com.kahf.dns.p015di.PlatformModule_androidKt;
import com.kahf.dns.p015di.core.AndroidAnalyticsModuleKt;
import com.kahf.dns.p015di.core.AndroidRestrictionModuleKt;
import com.kahf.dns.p015di.core.RepositoryModuleKt;
import com.kahf.dns.p015di.core.ViewModelModuleKt;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0593mc;
import p000.C0020aj;
import p000.C0030ao;
import p000.C0065bm;
import p000.C0067bo;
import p000.C0101cm;
import p000.C0272dm;
import p000.C0302eg;
import p000.C0307el;
import p000.C0309en;
import p000.C0414hg;
import p000.C0420hm;
import p000.C0491jl;
import p000.C0522kf;
import p000.C0566lm;
import p000.C0601mk;
import p000.C0603mm;
import p000.C0633nf;
import p000.C0639nl;
import p000.C0674oj;
import p000.C0676ol;
import p000.C0790ro;
import p000.C0897uk;
import p000.C0932vi;
import p000.C0938vo;
import p000.C1001xd;
import p000.C1006xi;
import p000.C1043yi;
import p000.C1047ym;
import p000.C1058yx;
import p000.InterfaceC0048b5;
import p000.InterfaceC0551l7;
import p000.a40;
import p000.a50;
import p000.a5b;
import p000.a8b;
import p000.ada;
import p000.adb;
import p000.b1a;
import p000.b77;
import p000.ba7;
import p000.bha;
import p000.bn8;
import p000.bv8;
import p000.c14;
import p000.c19;
import p000.cf0;
import p000.cm8;
import p000.cn8;
import p000.cp5;
import p000.cw7;
import p000.d0a;
import p000.d48;
import p000.d4b;
import p000.d84;
import p000.de2;
import p000.df7;
import p000.dn8;
import p000.dq7;
import p000.dt2;
import p000.e13;
import p000.ee6;
import p000.ef0;
import p000.eq7;
import p000.fb3;
import p000.fc2;
import p000.fcb;
import p000.fdb;
import p000.fe6;
import p000.ff0;
import p000.fh6;
import p000.ftb;
import p000.g5b;
import p000.gb3;
import p000.gf0;
import p000.gpc;
import p000.i47;
import p000.ifc;
import p000.iz3;
import p000.iz9;
import p000.j30;
import p000.j33;
import p000.j39;
import p000.j78;
import p000.jb2;
import p000.jg9;
import p000.jk1;
import p000.jm4;
import p000.k83;
import p000.kd6;
import p000.kg7;
import p000.l33;
import p000.l39;
import p000.l78;
import p000.li0;
import p000.lo7;
import p000.ly6;
import p000.m21;
import p000.m40;
import p000.m60;
import p000.m68;
import p000.m80;
import p000.m8b;
import p000.mi0;
import p000.mk8;
import p000.mta;
import p000.muc;
import p000.mwc;
import p000.ng9;
import p000.nu8;
import p000.nxa;
import p000.o68;
import p000.oe8;
import p000.ohc;
import p000.p50;
import p000.pc2;
import p000.pj2;
import p000.pn0;
import p000.pn2;
import p000.pr1;
import p000.q0c;
import p000.q53;
import p000.qa2;
import p000.qg9;
import p000.qi5;
import p000.qj2;
import p000.qn2;
import p000.qpa;
import p000.qr9;
import p000.qs0;
import p000.r68;
import p000.rm8;
import p000.rr5;
import p000.rs0;
import p000.s4c;
import p000.s8b;
import p000.sa2;
import p000.sj7;
import p000.sr5;
import p000.stb;
import p000.sv5;
import p000.sx7;
import p000.sy0;
import p000.t78;
import p000.td3;
import p000.tf0;
import p000.tj1;
import p000.tm8;
import p000.tq2;
import p000.txc;
import p000.u43;
import p000.u84;
import p000.uf0;
import p000.uwb;
import p000.vic;
import p000.vk7;
import p000.vu2;
import p000.vw6;
import p000.vx6;
import p000.wf0;
import p000.wf5;
import p000.wic;
import p000.wk8;
import p000.x54;
import p000.x74;
import p000.xab;
import p000.xcb;
import p000.xga;
import p000.xp5;
import p000.xq8;
import p000.xs8;
import p000.xwb;
import p000.xz8;
import p000.y35;
import p000.y45;
import p000.y51;
import p000.yc3;
import p000.yj2;
import p000.yu9;
import p000.yw6;
import p000.z33;
import p000.zd8;
import p000.zga;
import p000.zl2;
import p000.zn1;
import p000.zx8;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class PlatformModule_androidKt {
    public static final lo7 platformModule() {
        lo7 lo7Var = new lo7();
        platformModule$lambda$0(lo7Var);
        return lo7Var;
    }

    private static final txc platformModule$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        lo7[] lo7VarArr = {AndroidPairingModuleKt.getAndroidPairingModule()};
        ArrayList arrayList = lo7Var.f24776e;
        List asList = Arrays.asList(lo7VarArr);
        asList.getClass();
        arrayList.addAll(asList);
        List asList2 = Arrays.asList(m80.m13239a());
        asList2.getClass();
        arrayList.addAll(asList2);
        List asList3 = Arrays.asList(AndroidAnalyticsModuleKt.getAndroidAnalyticsModule(), RepositoryModuleKt.getRepositoryModule(), ViewModelModuleKt.getViewModelModule(), DeviceToolsModuleKt.getDeviceToolsModule(), AndroidRestrictionModuleKt.getAndroidRestrictionModule());
        asList3.getClass();
        arrayList.addAll(asList3);
        final byte b = 15;
        fc2 fc2Var = new fc2(b);
        ftb ftbVar = d4b.f7320C;
        zn1 m5838a = d0a.m5838a(Activity.class);
        fh6 fh6Var = fh6.f11979u;
        lo7Var.m12842a(new xab(new rs0(ftbVar, m5838a, null, fc2Var, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(Context.class), null, new fc2((byte) 26), fh6Var)));
        final byte b2 = 7;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(nxa.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b2) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b3 = 18;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(jk1.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b3) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b4 = 29;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(jb2.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b4) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b5 = 10;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(rm8.class), null, new l39(b5), fh6Var)));
        final byte b6 = 21;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(oe8.class), null, new l39(b6), fh6Var)));
        final byte b7 = 23;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(l33.class), null, new l39(b7), fh6Var)));
        final byte b8 = 24;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(c14.class), null, new l39(b8), fh6Var)));
        final byte b9 = 25;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(bn8.class), null, new l39(b9), fh6Var)));
        final byte b10 = 16;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(mwc.class), null, new fc2(b10), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(wk8.class), null, new fc2((byte) 17), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(dn8.class), null, new fc2(b3), fh6Var)));
        final byte b11 = 19;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(b1a.class), null, new fc2(b11), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(g5b.class), null, new fc2((byte) 20), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(u43.class), null, new fc2(b6), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(mk8.class), null, new fc2((byte) 22), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(zl2.class), null, new fc2(b7), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(y51.class), null, new fc2(b8), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(pn2.class), null, new fc2(b9), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(AppDatabase.class), null, new fc2((byte) 27), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(a50.class), null, new fc2((byte) 28), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(vw6.class), null, new fc2(b4), fh6Var)));
        final byte b12 = 0;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(a40.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b12) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b13 = 1;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(m68.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b13) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b14 = 2;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(y45.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b14) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b15 = 3;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(cp5.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b15) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b16 = 4;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(vk7.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b16) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b17 = 5;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(fcb.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b17) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b18 = 6;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(xcb.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b18) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b19 = 8;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(fdb.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b19) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b20 = 9;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(r68.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b20) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(j78.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b5) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b21 = 11;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(o68.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b21) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b22 = 12;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(t78.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b22) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b23 = 13;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(vx6.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b23) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b24 = 14;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(m40.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b24) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(p50.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(qj2.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b10) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b25 = 17;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(fb3.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b25) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(yc3.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b11) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b26 = 20;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(eq7.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b26) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(dq7.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b6) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b27 = 22;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(InterfaceC0551l7.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b27) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(l78.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b7) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(pj2.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b8) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(m60.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b9) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b28 = 26;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(qs0.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b28) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b29 = 27;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(e13.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b29) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        final byte b30 = 28;
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(rr5.class), null, new jm4() { // from class: k39
            @Override // p000.jm4
            public final Object invoke(Object obj, Object obj2) {
                a40 platformModule$lambda$0$23;
                m68 platformModule$lambda$0$24;
                y45 platformModule$lambda$0$25;
                cp5 platformModule$lambda$0$26;
                vk7 platformModule$lambda$0$27;
                fcb platformModule$lambda$0$28;
                xcb platformModule$lambda$0$29;
                nxa platformModule$lambda$0$2;
                fdb platformModule$lambda$0$30;
                r68 platformModule$lambda$0$31;
                j78 platformModule$lambda$0$32;
                o68 platformModule$lambda$0$33;
                t78 platformModule$lambda$0$34;
                vx6 platformModule$lambda$0$35;
                m40 platformModule$lambda$0$36;
                p50 platformModule$lambda$0$37;
                qj2 platformModule$lambda$0$38;
                fb3 platformModule$lambda$0$39;
                jk1 platformModule$lambda$0$3;
                yc3 platformModule$lambda$0$40;
                eq7 platformModule$lambda$0$41;
                dq7 platformModule$lambda$0$42;
                InterfaceC0551l7 platformModule$lambda$0$43;
                l78 platformModule$lambda$0$44;
                pj2 platformModule$lambda$0$45;
                m60 platformModule$lambda$0$46;
                qs0 platformModule$lambda$0$47;
                e13 platformModule$lambda$0$48;
                rr5 platformModule$lambda$0$49;
                jb2 platformModule$lambda$0$4;
                mta mtaVar = (mta) obj;
                xs8 xs8Var = (xs8) obj2;
                switch (b30) {
                    case 0:
                        platformModule$lambda$0$23 = PlatformModule_androidKt.platformModule$lambda$0$23(mtaVar, xs8Var);
                        return platformModule$lambda$0$23;
                    case 1:
                        platformModule$lambda$0$24 = PlatformModule_androidKt.platformModule$lambda$0$24(mtaVar, xs8Var);
                        return platformModule$lambda$0$24;
                    case 2:
                        platformModule$lambda$0$25 = PlatformModule_androidKt.platformModule$lambda$0$25(mtaVar, xs8Var);
                        return platformModule$lambda$0$25;
                    case 3:
                        platformModule$lambda$0$26 = PlatformModule_androidKt.platformModule$lambda$0$26(mtaVar, xs8Var);
                        return platformModule$lambda$0$26;
                    case 4:
                        platformModule$lambda$0$27 = PlatformModule_androidKt.platformModule$lambda$0$27(mtaVar, xs8Var);
                        return platformModule$lambda$0$27;
                    case 5:
                        platformModule$lambda$0$28 = PlatformModule_androidKt.platformModule$lambda$0$28(mtaVar, xs8Var);
                        return platformModule$lambda$0$28;
                    case 6:
                        platformModule$lambda$0$29 = PlatformModule_androidKt.platformModule$lambda$0$29(mtaVar, xs8Var);
                        return platformModule$lambda$0$29;
                    case 7:
                        platformModule$lambda$0$2 = PlatformModule_androidKt.platformModule$lambda$0$2(mtaVar, xs8Var);
                        return platformModule$lambda$0$2;
                    case 8:
                        platformModule$lambda$0$30 = PlatformModule_androidKt.platformModule$lambda$0$30(mtaVar, xs8Var);
                        return platformModule$lambda$0$30;
                    case 9:
                        platformModule$lambda$0$31 = PlatformModule_androidKt.platformModule$lambda$0$31(mtaVar, xs8Var);
                        return platformModule$lambda$0$31;
                    case 10:
                        platformModule$lambda$0$32 = PlatformModule_androidKt.platformModule$lambda$0$32(mtaVar, xs8Var);
                        return platformModule$lambda$0$32;
                    case 11:
                        platformModule$lambda$0$33 = PlatformModule_androidKt.platformModule$lambda$0$33(mtaVar, xs8Var);
                        return platformModule$lambda$0$33;
                    case 12:
                        platformModule$lambda$0$34 = PlatformModule_androidKt.platformModule$lambda$0$34(mtaVar, xs8Var);
                        return platformModule$lambda$0$34;
                    case 13:
                        platformModule$lambda$0$35 = PlatformModule_androidKt.platformModule$lambda$0$35(mtaVar, xs8Var);
                        return platformModule$lambda$0$35;
                    case Chart.PAINT_CENTER_TEXT /* 14 */:
                        platformModule$lambda$0$36 = PlatformModule_androidKt.platformModule$lambda$0$36(mtaVar, xs8Var);
                        return platformModule$lambda$0$36;
                    case ba7.f2964h /* 15 */:
                        platformModule$lambda$0$37 = PlatformModule_androidKt.platformModule$lambda$0$37(mtaVar, xs8Var);
                        return platformModule$lambda$0$37;
                    case 16:
                        platformModule$lambda$0$38 = PlatformModule_androidKt.platformModule$lambda$0$38(mtaVar, xs8Var);
                        return platformModule$lambda$0$38;
                    case 17:
                        platformModule$lambda$0$39 = PlatformModule_androidKt.platformModule$lambda$0$39(mtaVar, xs8Var);
                        return platformModule$lambda$0$39;
                    case Chart.PAINT_LEGEND_LABEL /* 18 */:
                        platformModule$lambda$0$3 = PlatformModule_androidKt.platformModule$lambda$0$3(mtaVar, xs8Var);
                        return platformModule$lambda$0$3;
                    case 19:
                        platformModule$lambda$0$40 = PlatformModule_androidKt.platformModule$lambda$0$40(mtaVar, xs8Var);
                        return platformModule$lambda$0$40;
                    case 20:
                        platformModule$lambda$0$41 = PlatformModule_androidKt.platformModule$lambda$0$41(mtaVar, xs8Var);
                        return platformModule$lambda$0$41;
                    case 21:
                        platformModule$lambda$0$42 = PlatformModule_androidKt.platformModule$lambda$0$42(mtaVar, xs8Var);
                        return platformModule$lambda$0$42;
                    case 22:
                        platformModule$lambda$0$43 = PlatformModule_androidKt.platformModule$lambda$0$43(mtaVar, xs8Var);
                        return platformModule$lambda$0$43;
                    case 23:
                        platformModule$lambda$0$44 = PlatformModule_androidKt.platformModule$lambda$0$44(mtaVar, xs8Var);
                        return platformModule$lambda$0$44;
                    case 24:
                        platformModule$lambda$0$45 = PlatformModule_androidKt.platformModule$lambda$0$45(mtaVar, xs8Var);
                        return platformModule$lambda$0$45;
                    case 25:
                        platformModule$lambda$0$46 = PlatformModule_androidKt.platformModule$lambda$0$46(mtaVar, xs8Var);
                        return platformModule$lambda$0$46;
                    case 26:
                        platformModule$lambda$0$47 = PlatformModule_androidKt.platformModule$lambda$0$47(mtaVar, xs8Var);
                        return platformModule$lambda$0$47;
                    case 27:
                        platformModule$lambda$0$48 = PlatformModule_androidKt.platformModule$lambda$0$48(mtaVar, xs8Var);
                        return platformModule$lambda$0$48;
                    case 28:
                        platformModule$lambda$0$49 = PlatformModule_androidKt.platformModule$lambda$0$49(mtaVar, xs8Var);
                        return platformModule$lambda$0$49;
                    default:
                        platformModule$lambda$0$4 = PlatformModule_androidKt.platformModule$lambda$0$4(mtaVar, xs8Var);
                        return platformModule$lambda$0$4;
                }
            }
        }, fh6Var)));
        rs0 rs0Var = new rs0(ftbVar, d0a.m5838a(C0491jl.class), null, new l39(b12), fh6Var);
        xab xabVar = new xab(rs0Var);
        lo7Var.m12842a(xabVar);
        zn1 m5838a2 = d0a.m5838a(sr5.class);
        rs0Var.f37188f.add(m5838a2);
        lo7Var.f24774c.put(kd6.m11974a(m5838a2) + "::" + ftbVar, xabVar);
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(ee6.class), null, new l39((byte) 1), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(InterfaceC0048b5.class), null, new l39((byte) 2), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(li0.class), null, new l39((byte) 3), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(sv5.class), null, new l39((byte) 4), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(qr9.class), null, new l39((byte) 5), fh6Var)));
        lo7Var.m12842a(new iz3(new rs0(ftbVar, d0a.m5838a(y35.class), null, new jm4() { // from class: com.kahf.dns.di.PlatformModule_androidKt$platformModule$lambda$0$$inlined$viewModelOf$default$1
            @Override // p000.jm4
            public final y35 invoke(mta mtaVar, xs8 xs8Var) {
                Object m15970d = pr1.m15970d(mtaVar, xs8Var, PreferencesHelper.class, null, null);
                Object m13737e = mtaVar.m13737e(d0a.m5838a(ee6.class), null, null);
                Object m13737e2 = mtaVar.m13737e(d0a.m5838a(li0.class), null, null);
                Object m13737e3 = mtaVar.m13737e(d0a.m5838a(qpa.class), null, null);
                Object m13737e4 = mtaVar.m13737e(d0a.m5838a(ada.class), null, null);
                Object m13737e5 = mtaVar.m13737e(d0a.m5838a(yj2.class), null, null);
                Object m13737e6 = mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null);
                Object m13737e7 = mtaVar.m13737e(d0a.m5838a(d48.class), null, null);
                Object m13737e8 = mtaVar.m13737e(d0a.m5838a(vic.class), null, null);
                Object m13737e9 = mtaVar.m13737e(d0a.m5838a(de2.class), null, null);
                Object m13737e10 = mtaVar.m13737e(d0a.m5838a(xz8.class), null, null);
                Object m13737e11 = mtaVar.m13737e(d0a.m5838a(uwb.class), null, null);
                Object m13737e12 = mtaVar.m13737e(d0a.m5838a(ff0.class), null, null);
                Object m13737e13 = mtaVar.m13737e(d0a.m5838a(sv5.class), null, null);
                return new y35((PreferencesHelper) m15970d, (ee6) m13737e, (li0) m13737e2, (qpa) m13737e3, (ada) m13737e4, (yj2) m13737e5, (C1001xd) m13737e6, (d48) m13737e7, (vic) m13737e8, (de2) m13737e9, (xz8) m13737e10, (uwb) m13737e11, (ff0) m13737e12, (sv5) m13737e13, (rr5) mtaVar.m13737e(d0a.m5838a(rr5.class), null, null), (cf0) mtaVar.m13737e(d0a.m5838a(cf0.class), null, null));
            }
        }, fh6.f11980v)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(uf0.class), null, new l39((byte) 6), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(wf0.class), null, new l39((byte) 7), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(ff0.class), null, new l39((byte) 8), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(z33.class), null, new l39((byte) 9), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(nu8.class), null, new l39((byte) 11), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(zx8.class), null, new l39((byte) 12), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(xwb.class), null, new l39((byte) 13), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(iz9.class), null, new l39((byte) 14), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(u84.class), null, new l39(b), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(tq2.class), null, new l39(b10), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(vic.class), null, new l39(b25), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(de2.class), null, new l39((byte) 18), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(j33.class), null, new l39(b11), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(x74.class), null, new l39((byte) 20), fh6Var)));
        lo7Var.m12842a(new xab(new rs0(ftbVar, d0a.m5838a(a8b.class), null, new l39(b27), fh6Var)));
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity platformModule$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        throw new IllegalStateException("Activity must be initialized at runtime");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context platformModule$lambda$0$1(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return sa2.f38142u.m17960c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r8.length() > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mwc platformModule$lambda$0$10(mta mtaVar, xs8 xs8Var) {
        String str;
        mtaVar.getClass();
        xs8Var.getClass();
        yu9 yu9Var = j30.f19522c;
        yu9 yu9Var2 = cn8.f5514b;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.kahf.rom");
            str = invoke instanceof String ? (String) invoke : null;
            if (str != null) {
            }
        } catch (Exception unused) {
        }
        str = null;
        return new mwc(yu9Var, yu9Var2, zy5.m23838d(str, DiskLruCache.VERSION), new PlatformModule_androidKt$platformModule$1$11$1(mtaVar, null), new zd8((byte) 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wk8 platformModule$lambda$0$11(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0566lm((j33) mtaVar.m13737e(d0a.m5838a(j33.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn8 platformModule$lambda$0$12(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0603mm((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (nxa) mtaVar.m13737e(d0a.m5838a(nxa.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1a platformModule$lambda$0$13(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        dn8 dn8Var = (dn8) mtaVar.m13737e(d0a.m5838a(dn8.class), null, null);
        tm8 tm8Var = (tm8) mtaVar.m13737e(d0a.m5838a(tm8.class), null, null);
        zd8 zd8Var = new zd8((byte) 8);
        PlatformModule_androidKt$platformModule$1$14$2 platformModule_androidKt$platformModule$1$14$2 = new PlatformModule_androidKt$platformModule$1$14$2(mtaVar, null);
        return new b1a(dn8Var, tm8Var, zd8Var, platformModule_androidKt$platformModule$1$14$2, new c19((byte) 1, null, platformModule_androidKt$platformModule$1$14$2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g5b platformModule$lambda$0$14(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        q0c m18375J = sy0.m18375J();
        vu2 vu2Var = k83.f21845a;
        qa2 m13765a = muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v));
        zd8 zd8Var = new zd8((byte) 7);
        return new g5b((b1a) mtaVar.m13737e(d0a.m5838a(b1a.class), null, null), new b1a(new xq8((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (jk1) mtaVar.m13737e(d0a.m5838a(jk1.class), null, null)), new pn0(new tj1((wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null)), zd8Var), zd8Var, new PlatformModule_androidKt$platformModule$1$15$1(m13765a, mtaVar, null), new PlatformModule_androidKt$platformModule$1$15$2(m13765a, mtaVar, null)), new j39(mtaVar, (byte) 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a5b platformModule$lambda$0$14$1(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        return df7.m6227T((PreferencesHelper) mtaVar.m13737e(m5838a, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u43 platformModule$lambda$0$15(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new u43((g5b) mtaVar.m13737e(d0a.m5838a(g5b.class), null, null), (q53) mtaVar.m13737e(d0a.m5838a(q53.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mk8 platformModule$lambda$0$16(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new mk8(new j39(mtaVar, (byte) 5), new PlatformModule_androidKt$platformModule$1$17$2(mtaVar, null), new zd8((byte) 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean platformModule$lambda$0$16$0(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(dn8.class);
        mtaVar.getClass();
        return ((dn8) mtaVar.m13737e(m5838a, null, null)).mo6459a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zl2 platformModule$lambda$0$17(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new qn2((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (byte) 0).m16781d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y51 platformModule$lambda$0$18(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new y51();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn2 platformModule$lambda$0$19(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new pn2((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nxa platformModule$lambda$0$2(mta mtaVar, xs8 xs8Var) {
        return new nxa(new C0676ol("kahf_org_refresh_key", (byte) 0), new s8b((Context) pr1.m15970d(mtaVar, xs8Var, Context.class, null, null), "kahf_org_secure"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppDatabase platformModule$lambda$0$20(mta mtaVar, xs8 xs8Var) {
        Context applicationContext = ((pn2) pr1.m15970d(mtaVar, xs8Var, pn2.class, null, null)).f32910a.getApplicationContext();
        String absolutePath = applicationContext.getDatabasePath("app_usage.db").getAbsolutePath();
        absolutePath.getClass();
        if (stb.m18260Z0(absolutePath)) {
            gpc.m8805e("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
            return null;
        }
        if (absolutePath.equals(":memory:")) {
            gpc.m8805e("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
            return null;
        }
        xga xgaVar = new xga(d0a.m5838a(AppDatabase.class), absolutePath, applicationContext);
        xgaVar.f48374s = new m21((byte) 0);
        xgaVar.f48366k = zga.f52407w;
        vu2 vu2Var = k83.f21845a;
        dt2 dt2Var = dt2.f8706v;
        dt2Var.getClass();
        if (xgaVar.f48362g != null || xgaVar.f48363h != null) {
            gpc.m8805e("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            return null;
        }
        if (dt2Var.get(i47.f17427A) == null) {
            gpc.m8805e("It is required that the coroutine context contain a dispatcher.");
            return null;
        }
        xgaVar.f48375t = dt2Var;
        xgaVar.m22106a((sj7[]) Arrays.copyOf(AppDatabase.f6238l, 6));
        xgaVar.f48371p = false;
        xgaVar.f48372q = true;
        xgaVar.f48373r = true;
        return (AppDatabase) xgaVar.m22107b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a50 platformModule$lambda$0$21(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3574s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vw6 platformModule$lambda$0$22(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3577v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a40 platformModule$lambda$0$23(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3573r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m68 platformModule$lambda$0$24(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3579x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y45 platformModule$lambda$0$25(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3575t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cp5 platformModule$lambda$0$26(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3576u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vk7 platformModule$lambda$0$27(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3578w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fcb platformModule$lambda$0$28(mta mtaVar, xs8 xs8Var) {
        return ((AppDatabase) pr1.m15970d(mtaVar, xs8Var, AppDatabase.class, null, null)).mo3580y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xcb platformModule$lambda$0$29(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        fcb fcbVar = (fcb) mtaVar.m13737e(d0a.m5838a(fcb.class), null, null);
        pc2 pc2Var = (pc2) mtaVar.m13737e(d0a.m5838a(pc2.class), null, new ftb("ioScope"));
        vu2 vu2Var = k83.f21845a;
        return new xcb(fcbVar, pc2Var, dt2.f8706v.mo1526D(1), new zd8((byte) 12), new bv8((byte) 5), new xp5((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null)), new j39(mtaVar, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final adb platformModule$lambda$0$29$1(long j) {
        d84 d84Var = ohc.f30553b;
        return kg7.m12073s(j, bha.m2079m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String platformModule$lambda$0$29$2(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        String stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) mtaVar.m13737e(m5838a, null, null), PrefKeys.KEY_DEVICE_MONGODB_ID, null, 2, null);
        if (stringFromPreferences$default.length() > 0) {
            return stringFromPreferences$default;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jk1 platformModule$lambda$0$3(mta mtaVar, xs8 xs8Var) {
        return ba7.m1784f((Context) pr1.m15970d(mtaVar, xs8Var, Context.class, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fdb platformModule$lambda$0$30(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new fdb((fcb) mtaVar.m13737e(d0a.m5838a(fcb.class), null, null), (xcb) mtaVar.m13737e(d0a.m5838a(xcb.class), null, null), new zd8((byte) 10), new ifc((C1058yx) mtaVar.m13737e(d0a.m5838a(C1058yx.class), null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String platformModule$lambda$0$30$0() {
        long currentTimeMillis = System.currentTimeMillis();
        d84 d84Var = ohc.f30553b;
        return kg7.m12073s(currentTimeMillis, bha.m2079m()).m480a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r68 platformModule$lambda$0$31(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new r68((m68) mtaVar.m13737e(d0a.m5838a(m68.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j78 platformModule$lambda$0$32(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new j78(new m8b((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o68 platformModule$lambda$0$33(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new o68((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (r68) mtaVar.m13737e(d0a.m5838a(r68.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t78 platformModule$lambda$0$34(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0420hm((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (o68) mtaVar.m13737e(d0a.m5838a(o68.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vx6 platformModule$lambda$0$35(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new vx6((vw6) mtaVar.m13737e(d0a.m5838a(vw6.class), null, null), (wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (y51) mtaVar.m13737e(d0a.m5838a(y51.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m40 platformModule$lambda$0$36(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new m40((a40) mtaVar.m13737e(d0a.m5838a(a40.class), null, null), (wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p50 platformModule$lambda$0$37(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new p50((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj2 platformModule$lambda$0$38(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C1006xi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fb3 platformModule$lambda$0$39(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new gb3((qj2) mtaVar.m13737e(d0a.m5838a(qj2.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jb2 platformModule$lambda$0$4(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new b77((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yc3 platformModule$lambda$0$40(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new yc3(new PlatformModule_androidKt$platformModule$1$41$1(mtaVar, null), new PlatformModule_androidKt$platformModule$1$41$2(mtaVar, null), new j39(mtaVar, (byte) 0), new ng9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null)), new j39(mtaVar, (byte) 3), new j39(mtaVar, (byte) 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String platformModule$lambda$0$40$0(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        return ((PreferencesHelper) mtaVar.m13737e(m5838a, null, null)).getStringFromPreferences(PrefKeys.KEY_DEVICE_MONGODB_ID, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean platformModule$lambda$0$40$1(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(s4c.class);
        mtaVar.getClass();
        return ((s4c) mtaVar.m13737e(m5838a, null, null)).m17778g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean platformModule$lambda$0$40$2(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(tf0.class);
        mtaVar.getClass();
        return ((cf0) ((tf0) mtaVar.m13737e(m5838a, null, null))).m3142j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eq7 platformModule$lambda$0$41(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0101cm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dq7 platformModule$lambda$0$42(mta mtaVar, xs8 xs8Var) {
        return new C0065bm(sa2.f38142u.m17960c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0551l7 platformModule$lambda$0$43(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0522kf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l78 platformModule$lambda$0$44(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0272dm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj2 platformModule$lambda$0$45(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0932vi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60 platformModule$lambda$0$46(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0633nf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qs0 platformModule$lambda$0$47(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0414hg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e13 platformModule$lambda$0$48(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C1043yi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr5 platformModule$lambda$0$49(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0307el();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm8 platformModule$lambda$0$5(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new ef0((cf0) mtaVar.m13737e(d0a.m5838a(cf0.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0491jl platformModule$lambda$0$50(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0491jl((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ee6 platformModule$lambda$0$51(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new fe6(sa2.f38142u.m17960c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0048b5 platformModule$lambda$0$52(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return AbstractC0593mc.m13313x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li0 platformModule$lambda$0$53(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new mi0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sv5 platformModule$lambda$0$54(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0639nl((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr9 platformModule$lambda$0$55(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0030ao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uf0 platformModule$lambda$0$57(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new uf0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wf0 platformModule$lambda$0$58(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new wf0((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (uf0) mtaVar.m13737e(d0a.m5838a(uf0.class), null, null), (C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 platformModule$lambda$0$59(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0302eg((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (vic) mtaVar.m13737e(d0a.m5838a(vic.class), null, null), (C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null), (wf0) mtaVar.m13737e(d0a.m5838a(wf0.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oe8 platformModule$lambda$0$6(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new qg9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z33 platformModule$lambda$0$60(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0674oj((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nu8 platformModule$lambda$0$61(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C1047ym((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (vic) mtaVar.m13737e(d0a.m5838a(vic.class), null, null), (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zx8 platformModule$lambda$0$62(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0309en((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (C1001xd) mtaVar.m13737e(d0a.m5838a(C1001xd.class), null, null), (wf0) mtaVar.m13737e(d0a.m5838a(wf0.class), null, null), (td3) mtaVar.m13737e(d0a.m5838a(td3.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xwb platformModule$lambda$0$63(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0938vo((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iz9 platformModule$lambda$0$64(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0067bo((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u84 platformModule$lambda$0$65(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0897uk((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null), (wf5) mtaVar.m13737e(d0a.m5838a(wf5.class), null, null), (gf0) mtaVar.m13737e(d0a.m5838a(gf0.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tq2 platformModule$lambda$0$66(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new tq2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vic platformModule$lambda$0$67(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new wic((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final de2 platformModule$lambda$0$68(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new x54();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j33 platformModule$lambda$0$69(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0020aj((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l33 platformModule$lambda$0$7(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new jg9((PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x74 platformModule$lambda$0$70(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0601mk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8b platformModule$lambda$0$71(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new C0790ro((Context) mtaVar.m13737e(d0a.m5838a(Context.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c14 platformModule$lambda$0$8(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        return new c14(new PlatformModule_androidKt$platformModule$1$9$1(mtaVar, null), new PlatformModule_androidKt$platformModule$1$9$2(mtaVar, null), new j39(mtaVar, (byte) 6), new cw7(mtaVar, (byte) 8), new qi5((byte) 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String platformModule$lambda$0$8$0(mta mtaVar) {
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        return PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) mtaVar.m13737e(m5838a, null, null), PrefKeys.LAST_SYNCED_FCM_TOKEN, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc platformModule$lambda$0$8$1(mta mtaVar, String str) {
        str.getClass();
        zn1 m5838a = d0a.m5838a(PreferencesHelper.class);
        mtaVar.getClass();
        ((PreferencesHelper) mtaVar.m13737e(m5838a, null, null)).saveToPreferences(PrefKeys.LAST_SYNCED_FCM_TOKEN, str);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc platformModule$lambda$0$8$2(String str, Throwable th) {
        str.getClass();
        if (th != null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25311x, "KG_SYNC", th, str);
        } else {
            sx7.m18364b(sx7.f39332a, str, "KG_SYNC", 2);
        }
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bn8 platformModule$lambda$0$9(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        rm8 rm8Var = (rm8) mtaVar.m13737e(d0a.m5838a(rm8.class), null, null);
        nxa nxaVar = (nxa) mtaVar.m13737e(d0a.m5838a(nxa.class), null, null);
        jb2 jb2Var = (jb2) mtaVar.m13737e(d0a.m5838a(jb2.class), null, null);
        mk8 mk8Var = (mk8) mtaVar.m13737e(d0a.m5838a(mk8.class), null, null);
        oe8 oe8Var = (oe8) mtaVar.m13737e(d0a.m5838a(oe8.class), null, null);
        l33 l33Var = (l33) mtaVar.m13737e(d0a.m5838a(l33.class), null, null);
        c14 c14Var = (c14) mtaVar.m13737e(d0a.m5838a(c14.class), null, null);
        q0c m18375J = sy0.m18375J();
        vu2 vu2Var = k83.f21845a;
        return new cm8(rm8Var, nxaVar, jb2Var, mk8Var, oe8Var, l33Var, c14Var, muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v)));
    }
}
