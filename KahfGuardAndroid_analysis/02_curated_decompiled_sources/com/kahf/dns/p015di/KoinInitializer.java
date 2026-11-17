package com.kahf.dns.p015di;

import com.kahf.dns.p015di.core.CommonModuleKt;
import com.kahf.dns.p015di.core.DeviceModuleKt;
import com.kahf.dns.p015di.core.NetworkModuleGraphQlKt;
import com.kahf.dns.p015di.core.NetworkModuleKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.auc;
import p000.d5b;
import p000.dj3;
import p000.ds1;
import p000.f95;
import p000.fu4;
import p000.hh6;
import p000.hj3;
import p000.kd0;
import p000.lhc;
import p000.lo7;
import p000.lp6;
import p000.ls6;
import p000.mh6;
import p000.mv1;
import p000.no7;
import p000.ps1;
import p000.t80;
import p000.tc5;
import p000.txc;
import p000.tz6;
import p000.uy6;
import p000.v30;
import p000.vl4;
import p000.vq8;
import p000.wwb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class KoinInitializer {
    public static final int $stable = 0;
    public static final KoinInitializer INSTANCE = new KoinInitializer();
    private static final KoinConfig defaultConfig = new KoinConfig(true, lp6.f24832v);

    private KoinInitializer() {
    }

    private final List<lo7> getFeatureModules() {
        ls6 m13818g = mv1.m13818g();
        m13818g.add(wwb.f47275a);
        m13818g.add(UpdateModuleKt.getUpdateModule());
        m13818g.add(OfferModuleKt.getOfferModule());
        m13818g.add(EnrollModuleKt.getEnrollModule());
        m13818g.add(d5b.m5922a());
        m13818g.add(PairingModuleKt.getPairingModule());
        m13818g.add(t80.m18674a());
        m13818g.add(RestrictionModuleKt.getRestrictionModule());
        m13818g.add(SalatModuleKt.getSalatModule());
        m13818g.add(DonationModuleKt.getDonationModule());
        m13818g.add(SupportModuleKt.getSupportModule());
        m13818g.add(auc.f2161a);
        return mv1.m13815d(m13818g);
    }

    public static /* synthetic */ hh6 init$default(KoinInitializer koinInitializer, KoinConfig koinConfig, vl4 vl4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            koinConfig = defaultConfig;
        }
        if ((i & 2) != 0) {
            vl4Var = new tc5((byte) 28);
        }
        return koinInitializer.init(koinConfig, vl4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc init$lambda$0(hh6 hh6Var) {
        hh6Var.getClass();
        return txc.f41359a;
    }

    private static final txc init$lambda$1(KoinConfig koinConfig, vl4 vl4Var, hh6 hh6Var) {
        hh6Var.getClass();
        KoinInitializer koinInitializer = INSTANCE;
        koinInitializer.setupLogging(hh6Var, koinConfig.getLogLevel());
        vl4Var.invoke(hh6Var);
        vq8[] vq8VarArr = {new vq8(mh6.f26382u, Boolean.TRUE)};
        ds1 ds1Var = hh6Var.f16244a;
        fu4 fu4Var = (fu4) ds1Var.f8646e;
        vq8 vq8Var = vq8VarArr[0];
        vq8Var.getClass();
        Map singletonMap = Collections.singletonMap(vq8Var.f44884u, vq8Var.f44885v);
        singletonMap.getClass();
        fu4Var.getClass();
        fu4Var.f12977a.putAll(singletonMap);
        ArrayList m16006E0 = ps1.m16006E0(mv1.m13794F(CommonModuleKt.getCommonModule(), NetworkModuleKt.networkModule(koinConfig.getEnableNetworkLogs()), NetworkModuleGraphQlKt.getNetworkModuleGraphQl(), DeviceModuleKt.getDeviceModule(), PlatformModule_androidKt.platformModule()), koinInitializer.getFeatureModules());
        lp6 level = ((uy6) ds1Var.f8642a).getLevel();
        lp6 lp6Var = lp6.f24832v;
        if (level.compareTo(lp6Var) <= 0) {
            long m14345b = no7.m14345b();
            ds1Var.m6542i(m16006E0);
            long m12760a = lhc.m12760a(m14345b);
            int size = ((ConcurrentHashMap) ((v30) ds1Var.f8645d).f43649w).size();
            uy6 uy6Var = (uy6) ds1Var.f8642a;
            StringBuilder m19217r = tz6.m19217r(size, "Started ", " definitions in ");
            f95 f95Var = dj3.f8146v;
            m19217r.append(dj3.m6354l(m12760a, hj3.MICROSECONDS) / 1000.0d);
            m19217r.append(" ms");
            uy6Var.display(lp6Var, m19217r.toString());
        } else {
            ds1Var.m6542i(m16006E0);
        }
        return txc.f41359a;
    }

    private final void setupLogging(hh6 hh6Var, lp6 lp6Var) {
        NapierKoinLogger napierKoinLogger = new NapierKoinLogger(lp6Var);
        hh6Var.getClass();
        hh6Var.f16244a.f8642a = napierKoinLogger;
    }

    public final hh6 init(KoinConfig koinConfig, vl4 vl4Var) {
        hh6 hh6Var;
        koinConfig.getClass();
        vl4Var.getClass();
        synchronized (f95.f11476x) {
            hh6Var = new hh6();
            if (f95.f11477y != null) {
                throw new kd0((byte) 8);
            }
            f95.f11477y = hh6Var.f16244a;
            init$lambda$1(koinConfig, vl4Var, hh6Var);
            hh6Var.f16244a.m6538c();
        }
        return hh6Var;
    }

    public final hh6 initIOS() {
        return init$default(this, new KoinConfig(false, lp6.f24834x), null, 2, null);
    }
}
