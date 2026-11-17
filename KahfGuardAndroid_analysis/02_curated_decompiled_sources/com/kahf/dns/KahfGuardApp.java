package com.kahf.dns;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.foreground.Ygju.iawVUOiEYmRW;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.disk.DiskCache;
import coil3.memory.MemoryCache;
import com.kahf.dns.KahfGuardApp;
import com.kahf.dns.auto_silence.receiver.SystemEventReceiver;
import com.kahf.dns.features.notification.AnsarReminderWorker;
import com.kahf.dns.features.notification.AppUsageMonitorWorker;
import com.kahf.dns.features.notification.WeeklyImpactWorker;
import com.kahf.dns.p015di.KoinConfig;
import com.kahf.dns.p015di.KoinInitializer;
import com.kahf.dns.utils.AndroidBillingManagerWithSubscription;
import com.kahf.dns.utils.PreferencesHelper;
import com.pairip.StartupLauncher;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.compose.resources.AndroidContextProvider;
import p000.AbstractC0378gi;
import p000.C0415hh;
import p000.C0898ul;
import p000.C0917v3;
import p000.C1001xd;
import p000.C1020xw;
import p000.C1058yx;
import p000.ab9;
import p000.aj7;
import p000.b5b;
import p000.bha;
import p000.c52;
import p000.caa;
import p000.cf0;
import p000.cn8;
import p000.d0a;
import p000.d48;
import p000.d4b;
import p000.dn8;
import p000.ds1;
import p000.dt2;
import p000.dxc;
import p000.dz3;
import p000.e30;
import p000.ee2;
import p000.ep3;
import p000.f20;
import p000.f95;
import p000.g29;
import p000.i30;
import p000.ic9;
import p000.ij7;
import p000.jzd;
import p000.k99;
import p000.lp6;
import p000.ly6;
import p000.mr5;
import p000.mta;
import p000.muc;
import p000.mwc;
import p000.na4;
import p000.o20;
import p000.ou9;
import p000.p99;
import p000.pc2;
import p000.ps1;
import p000.q30;
import p000.qa2;
import p000.qc2;
import p000.qf6;
import p000.qr5;
import p000.r2c;
import p000.r4d;
import p000.rj9;
import p000.s4c;
import p000.sa2;
import p000.sf6;
import p000.sx7;
import p000.sxc;
import p000.sy0;
import p000.tf6;
import p000.tl4;
import p000.txc;
import p000.u11;
import p000.uf6;
import p000.v11;
import p000.v20;
import p000.v54;
import p000.vic;
import p000.wm5;
import p000.x00;
import p000.xa2;
import p000.xd9;
import p000.xo3;
import p000.y3a;
import p000.y54;
import p000.ynb;
import p000.yw6;
import p000.za2;
import p000.zca;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public class KahfGuardApp extends Application implements SingletonImageLoader.Factory, c52 {

    /* renamed from: y */
    public static KahfGuardApp f6225y;

    /* renamed from: v */
    public boolean f6227v;

    /* renamed from: u */
    public final r2c f6226u = new r2c(new wm5(13));

    /* renamed from: w */
    public final AtomicBoolean f6228w = new AtomicBoolean(false);

    /* renamed from: x */
    public final Object f6229x = new Object();

    static {
        StartupLauncher.launch();
    }

    /* renamed from: a */
    public final void m3557a() {
        if (this.f6228w.get()) {
            return;
        }
        synchronized (this.f6229x) {
            if (this.f6228w.get()) {
                return;
            }
            m3561e();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(1:16))(3:20|21|(2:23|19))|17|(1:19)(1:12)))|26|6|7|(0)(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        p000.v20.m20254A("PostHog-Identify", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3558b(za2 za2Var) {
        sf6 sf6Var;
        int i;
        if (za2Var instanceof sf6) {
            sf6Var = (sf6) za2Var;
            int i2 = sf6Var.f38404w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sf6Var.f38404w = i2 - Integer.MIN_VALUE;
                Object obj = sf6Var.f38402u;
                i = sf6Var.f38404w;
                xa2 xa2Var = null;
                txc txcVar = txc.f41359a;
                byte b = 1;
                qc2 qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    sxc sxcVar = sxc.f39342a;
                    sf6Var.f38404w = 1;
                    obj = muc.m13761W(i30.m9932k0(sxc.f39343b), new dxc(this, xa2Var, b), sf6Var);
                    if (obj == qc2Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            v11.m20244z(obj);
                        }
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                qa2 qa2Var = ab9.f594b;
                sf6Var.f38404w = 2;
                ab9.m348e(this, (String) obj);
                return txcVar != qc2Var ? qc2Var : txcVar;
            }
        }
        sf6Var = new sf6(this, za2Var);
        Object obj2 = sf6Var.f38402u;
        i = sf6Var.f38404w;
        xa2 xa2Var2 = null;
        txc txcVar2 = txc.f41359a;
        byte b2 = 1;
        qc2 qc2Var2 = qc2.f34309u;
        if (i != 0) {
        }
        qa2 qa2Var2 = ab9.f594b;
        sf6Var.f38404w = 2;
        ab9.m348e(this, (String) obj2);
        if (txcVar2 != qc2Var2) {
        }
    }

    /* renamed from: c */
    public final void m3559c() {
        try {
            AndroidBillingManagerWithSubscription.INSTANCE.init(this, xo3.f48775u, ps1.m16023V0(rj9.f36841a), ep3.f10423u, (C1058yx) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(C1058yx.class), null, null), (vic) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(vic.class), null, null), (C1001xd) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(C1001xd.class), null, null), (s4c) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(s4c.class), null, null), (PreferencesHelper) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(PreferencesHelper.class), null, null), (d48) ((mta) ((d4b) i30.m9898N().f8644c).f7326y).m13737e(d0a.m5838a(d48.class), null, null));
            Log.i("AutoSilencePro", "AndroidBillingManager initialized with GraphQL backend verification and analytics");
        } catch (Exception e) {
            Log.e("AutoSilencePro", "Failed to initialize billing", e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void m3560d() {
        try {
            if (!dz3.f9007o.get()) {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18370h(2, "Facebook SDK not yet initialized, skipping. Will auto-initialize based on manifest configuration.", "FacebookSDK");
                return;
            }
            r4d r4dVar = r4d.f36006a;
            if (!ee2.f9818a.contains(r4d.class)) {
                try {
                    g29 g29Var = r4d.f36011f;
                    g29Var.f13358d = Boolean.TRUE;
                    g29Var.f13356b = System.currentTimeMillis();
                    if (r4d.f36007b.get()) {
                        r4dVar.m17125k(g29Var);
                    } else {
                        r4dVar.m17119e();
                    }
                } catch (Throwable th) {
                    ee2.m7125a(r4d.class, th);
                }
            }
            dz3.m6807j();
            sx7.m18364b(sx7.f39332a, "Facebook SDK initialized - AdvertiserID: enabled, AutoLogEvents: enabled", "FacebookSDK", 2);
            String str = e30.f9240c;
            o20.m14739o(this, null);
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "FacebookSDK", e, "Failed to configure Facebook SDK");
            v20.m20254A("FacebookSDK", e);
        }
    }

    /* renamed from: e */
    public final void m3561e() {
        try {
            this.f6227v = bha.m2088x(this);
            sa2 sa2Var = sa2.f38142u;
            sa2.f38143v = getApplicationContext();
            AndroidContextProvider.f31087u = this;
            byte b = 0;
            KoinInitializer.INSTANCE.init(new KoinConfig(false, lp6.f24834x), new C0415hh((Object) this, (byte) 22));
            if (this.f6227v) {
                try {
                    v54.m20386f(this);
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18364b(sx7Var, "Firebase App initialized", "Firebase", 2);
                    y54.m22622a().m22625d(true);
                    sx7.m18364b(sx7Var, "Crashlytics configured, collection enabled: true", "Firebase", 2);
                } catch (Exception e) {
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "Firebase", e, "Failed to initialize critical Firebase services");
                    v20.m20254A("Firebase", e);
                }
            }
            jzd.m11709o((pc2) this.f6226u.getValue(), null, null, new tf6(this, null, b), 3);
            this.f6228w.set(true);
        } catch (Exception e2) {
            Log.e("AutoSilencePro", "Failed to initialize app", e2);
            v20.m20254A("KahfGuardApp", e2);
        }
    }

    /* renamed from: f */
    public final void m3562f() {
        try {
            new C0898ul();
            sx7 sx7Var = sx7.f39332a;
            sx7.m18364b(sx7Var, "Notification system initialized", "KahfGuardApp", 2);
            ou9.m15345A(this);
            sx7.m18364b(sx7Var, "HabitReminderWorker scheduled", "KahfGuardApp", 2);
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KahfGuardApp", e, "Failed to initialize notifications");
            v20.m20254A("Notifications", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:10|11)(2:17|18))(9:19|20|(1:22)(1:65)|(1:24)|25|(1:27)(1:64)|(1:29)|30|(3:32|33|34)(6:35|7b|40|90|53|(1:55)(1:56)))|12|13|14|15))|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ea, code lost:
    
        r12 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25312y, "PostHog", r11, "Failed to initialize PostHog SDK");
        p000.v20.m20254A("PostHog", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3563g(za2 za2Var) {
        uf6 uf6Var;
        int i;
        String str;
        try {
            if (za2Var instanceof uf6) {
                uf6Var = (uf6) za2Var;
                int i2 = uf6Var.f42314x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uf6Var.f42314x = i2 - Integer.MIN_VALUE;
                    Object obj = uf6Var.f42312v;
                    Object obj2 = qc2.f34309u;
                    i = uf6Var.f42314x;
                    if (i != 0) {
                        v11.m20244z(obj);
                        String str2 = f20.f11014b;
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = f20.f11015c;
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.length() == 0) {
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18370h(2, "PostHog API key not configured, skipping initialization", "PostHog");
                            return txc.f41359a;
                        }
                        p99 m13684d0 = mr5.m13684d0(str2, str3);
                        m13684d0.f32085S = true;
                        m13684d0.f32083Q = true;
                        m13684d0.f32084R = true;
                        qf6 qf6Var = new qf6();
                        synchronized (m13684d0.f30004P) {
                            m13684d0.f30003O.add(qf6Var);
                        }
                        m13684d0.f30021q.f8140a = true;
                        m13684d0.f32086T.getClass();
                        ij7.m10385f(m13684d0);
                        synchronized (v11.f43542d) {
                            Context applicationContext = getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = this;
                            }
                            AbstractC0378gi.m8657B(applicationContext, m13684d0);
                            k99.f21937h0.m22559p(m13684d0);
                            k99 k99Var = k99.f21938i0;
                            p99 p99Var = k99Var.f36524x;
                            if ((p99Var != null ? p99Var : null) == m13684d0) {
                                AbstractC0378gi.m8680y(m13684d0, k99Var.m11911B());
                            }
                        }
                        ij7.m10354D();
                        uf6Var.f42311u = str3;
                        uf6Var.f42314x = 1;
                        if (m3558b(uf6Var) == obj2) {
                            return obj2;
                        }
                        str = str3;
                    } else {
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = uf6Var.f42311u;
                        v11.m20244z(obj);
                    }
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18367e(sx7Var2, "PostHog SDK initialized successfully", "PostHog", 2);
                    sx7.m18364b(sx7Var2, "PostHog Host: " + str + ", Debug mode: false", "PostHog", 2);
                    return txc.f41359a;
                }
            }
            if (i != 0) {
            }
            sx7 sx7Var22 = sx7.f39332a;
            sx7.m18367e(sx7Var22, "PostHog SDK initialized successfully", "PostHog", 2);
            sx7.m18364b(sx7Var22, "PostHog Host: " + str + ", Debug mode: false", "PostHog", 2);
            return txc.f41359a;
        } finally {
            ic9.m10212b();
        }
        uf6Var = new uf6(this, za2Var);
        Object obj3 = uf6Var.f42312v;
        Object obj22 = qc2.f34309u;
        i = uf6Var.f42314x;
    }

    /* renamed from: h */
    public final void m3564h() {
        try {
            int i = xd9.f48201x;
            C1020xw.m22384d(this);
            jzd.m11717w(this);
            v20.m20255B(this);
            AnsarReminderWorker.f6347C.m22385e(this);
            WeeklyImpactWorker.f6364D.m22385e(this);
            sx7 sx7Var = sx7.f39332a;
            sx7.m18364b(sx7Var, "DailyNotificationWorker + ReminderNotificationWorker + AnsarReminderWorker + WeeklyImpactWorker scheduled", "KahfGuardApp", 2);
            boolean z = AppUsageMonitorWorker.f6352D;
            i30.m9914b0(this);
            sx7.m18364b(sx7Var, "App open time initialized", "KahfGuardApp", 2);
            i30.m9920e0(this);
            sx7.m18364b(sx7Var, "AppUsageMonitorWorker scheduled", "KahfGuardApp", 2);
        } catch (Exception e) {
            Log.e("AutoSilencePro", "Failed to initialize prayer silence", e);
            v20.m20254A("PrayerSilence", e);
        }
    }

    /* renamed from: i */
    public final void m3565i() {
        try {
            boolean z = true;
            xa2 xa2Var = null;
            byte b = 3;
            jzd.m11709o((pc2) this.f6226u.getValue(), null, null, new tf6(this, xa2Var, 1 == true ? 1 : 0), 3);
            u11.m19276e0(this);
            sx7 sx7Var = sx7.f39332a;
            sx7.m18364b(sx7Var, "RestrictionSyncWorker scheduled", "KahfGuardApp", 2);
            b5b.m1670x(this);
            sx7.m18364b(sx7Var, "PermissionStatusSyncWorker scheduled", "KahfGuardApp", 2);
            qr5.m16839E(this);
            sx7.m18364b(sx7Var, "InstalledAppsSyncWorker scheduled", "KahfGuardApp", 2);
            sy0.m18414x0(this);
            sx7.m18364b(sx7Var, "AppUsageSyncWorker scheduled", "KahfGuardApp", 2);
            bha.m2060Q(this);
            sx7.m18364b(sx7Var, "BlockCountsSyncWorker scheduled", "KahfGuardApp", 2);
            y3a.m22546r(this);
            sx7.m18364b(sx7Var, "PeriodicAnalyticsWorker scheduled", "KahfGuardApp", 2);
            aj7.m765n(this);
            sx7.m18364b(sx7Var, "DailyAnalyticsWorker scheduled", "KahfGuardApp", 2);
            ds1 ds1Var = f95.f11477y;
            if (ds1Var == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            ((zca) ((mta) ((d4b) ds1Var.f8644c).f7326y).m13737e(d0a.m5838a(zca.class), null, null)).m23511b();
            sx7.m18367e(sx7Var, "RestrictionSyncManager initialized", "KahfGuardApp", 2);
            ynb ynbVar = cn8.f5513a;
            ds1 ds1Var2 = f95.f11477y;
            if (ds1Var2 == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            if (((dn8) ((mta) ((d4b) ds1Var2.f8644c).f7326y).m13737e(d0a.m5838a(dn8.class), null, null)).mo6459a() == null) {
                z = false;
            }
            cn8.m3346a(z);
            ds1 ds1Var3 = f95.f11477y;
            if (ds1Var3 == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            jzd.m11709o(muc.m13765a(yw6.m23122r(sy0.m18375J(), dt2.f8706v)), null, null, new x00((mwc) ((mta) ((d4b) ds1Var3.f8644c).f7326y).m13737e(d0a.m5838a(mwc.class), null, null), xa2Var, (byte) 16), 3);
            sx7.m18367e(sx7Var, "UiForegroundPoller started", "KahfGuardApp", 2);
            ds1 ds1Var4 = f95.f11477y;
            if (ds1Var4 == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            caa caaVar = (caa) ((mta) ((d4b) ds1Var4.f8644c).f7326y).m13737e(d0a.m5838a(caa.class), null, null);
            sx7.m18367e(sx7Var, "[ENFORCE] 🚀 Initializing restriction enforcement coordinator", "KG_SYNC", 2);
            i30.m9905U(new na4(((cf0) caaVar.f4723c).f4983K, new x00(caaVar, xa2Var, (byte) 12), b), caaVar.f4725e);
            sx7.m18367e(sx7Var, "RestrictionEnforcementCoordinator initialized", "KahfGuardApp", 2);
        } catch (Exception e) {
            Log.e("AutoSilencePro", "Failed to initialize restriction system", e);
            if (this.f6227v) {
                try {
                    y54.m22622a().m22624c(e);
                } catch (Exception e2) {
                    Log.e("AutoSilencePro", "Failed to record restriction system exception to Firebase Crashlytics", e2);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m3566j() {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DATE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(new SystemEventReceiver(), intentFilter, 4);
            } else {
                registerReceiver(new SystemEventReceiver(), intentFilter);
            }
            Log.i("AutoSilencePro", "System event receiver registered successfully");
        } catch (Exception e) {
            Log.e("AutoSilencePro", "Failed to register system event receiver", e);
            throw e;
        }
    }

    @Override // coil3.SingletonImageLoader.Factory
    public final ImageLoader newImageLoader(final Context context) {
        context.getClass();
        final byte b = 0;
        ImageLoader.Builder memoryCache = new ImageLoader.Builder(context).memoryCache(new tl4() { // from class: pf6
            @Override // p000.tl4
            public final Object invoke() {
                byte b2 = b;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        KahfGuardApp kahfGuardApp = KahfGuardApp.f6225y;
                        return new MemoryCache.Builder().maxSizePercent(context2, 0.25d).build();
                    default:
                        KahfGuardApp kahfGuardApp2 = KahfGuardApp.f6225y;
                        DiskCache.Builder builder = new DiskCache.Builder();
                        String str = rw8.f37424v;
                        File cacheDir = context2.getCacheDir();
                        cacheDir.getClass();
                        return builder.directory(cj7.m3266s(v44.m20349K(cacheDir, "image_cache"))).maxSizePercent(0.02d).build();
                }
            }
        });
        final byte b2 = 1;
        return memoryCache.diskCache(new tl4() { // from class: pf6
            @Override // p000.tl4
            public final Object invoke() {
                byte b22 = b2;
                Context context2 = context;
                switch (b22) {
                    case 0:
                        KahfGuardApp kahfGuardApp = KahfGuardApp.f6225y;
                        return new MemoryCache.Builder().maxSizePercent(context2, 0.25d).build();
                    default:
                        KahfGuardApp kahfGuardApp2 = KahfGuardApp.f6225y;
                        DiskCache.Builder builder = new DiskCache.Builder();
                        String str = rw8.f37424v;
                        File cacheDir = context2.getCacheDir();
                        cacheDir.getClass();
                        return builder.directory(cj7.m3266s(v44.m20349K(cacheDir, "image_cache"))).maxSizePercent(0.02d).build();
                }
            }
        }).build();
    }

    @Override // android.app.Application
    public final void onCreate() {
        iawVUOiEYmRW.JzykGGYozZ.invoke(null, this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        q30.m16283b(i);
    }
}
