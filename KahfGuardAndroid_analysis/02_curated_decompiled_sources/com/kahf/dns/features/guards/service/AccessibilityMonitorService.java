package com.kahf.dns.features.guards.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.kahf.dns.features.guards.service.AccessibilityMonitorService;
import com.kahf.dns.p019ui.MainActivity;
import java.util.Locale;
import p000.AccessibilityManagerAccessibilityStateChangeListenerC0883u6;
import p000.C0809s6;
import p000.C0898ul;
import p000.C0917v3;
import p000.C0920v6;
import p000.C0957w6;
import p000.C0994x6;
import p000.dj3;
import p000.f95;
import p000.hj3;
import p000.i30;
import p000.jzd;
import p000.k68;
import p000.k83;
import p000.muc;
import p000.qa2;
import p000.qc2;
import p000.qr5;
import p000.r2c;
import p000.sy0;
import p000.tl4;
import p000.txc;
import p000.ut4;
import p000.v11;
import p000.xa2;
import p000.yw6;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class AccessibilityMonitorService extends Service {

    /* renamed from: F */
    public static volatile boolean f6276F;

    /* renamed from: B */
    public volatile long f6278B;

    /* renamed from: D */
    public final r2c f6280D;

    /* renamed from: E */
    public final r2c f6281E;

    /* renamed from: w */
    public final r2c f6284w;

    /* renamed from: x */
    public boolean f6285x;

    /* renamed from: y */
    public boolean f6286y;

    /* renamed from: z */
    public Long f6287z;

    /* renamed from: u */
    public final qa2 f6282u = muc.m13765a(yw6.m23122r(sy0.m18375J(), k83.f21845a.mo1526D(1)));

    /* renamed from: v */
    public final r2c f6283v = new r2c(new C0809s6((byte) 0));

    /* renamed from: A */
    public boolean f6277A = true;

    /* renamed from: C */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0883u6 f6279C = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u6
        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z) {
            AccessibilityMonitorService accessibilityMonitorService = AccessibilityMonitorService.this;
            jzd.m11709o(accessibilityMonitorService.f6282u, null, null, new C0920v6(accessibilityMonitorService, z, (xa2) null), 3);
        }
    };

    /* JADX WARN: Type inference failed for: r0v5, types: [u6] */
    public AccessibilityMonitorService() {
        final byte b = 1;
        final byte b2 = 0;
        this.f6284w = new r2c(new tl4(this) { // from class: t6

            /* renamed from: v */
            public final /* synthetic */ AccessibilityMonitorService f39768v;

            {
                this.f39768v = this;
            }

            @Override // p000.tl4
            public final Object invoke() {
                byte b3 = b2;
                AccessibilityMonitorService accessibilityMonitorService = this.f39768v;
                switch (b3) {
                    case 0:
                        boolean z = AccessibilityMonitorService.f6276F;
                        Object systemService = accessibilityMonitorService.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        boolean z2 = AccessibilityMonitorService.f6276F;
                        try {
                            int i = MainActivity.f6412i0;
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(accessibilityMonitorService, (Class<?>) MainActivity.class).addFlags(268468224), 201326592);
                        } catch (Exception unused) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(), 201326592);
                        }
                    default:
                        boolean z3 = AccessibilityMonitorService.f6276F;
                        try {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268468224), 201326592);
                        } catch (Exception unused2) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent(), 201326592);
                        }
                }
            }
        });
        this.f6280D = new r2c(new tl4(this) { // from class: t6

            /* renamed from: v */
            public final /* synthetic */ AccessibilityMonitorService f39768v;

            {
                this.f39768v = this;
            }

            @Override // p000.tl4
            public final Object invoke() {
                byte b3 = b;
                AccessibilityMonitorService accessibilityMonitorService = this.f39768v;
                switch (b3) {
                    case 0:
                        boolean z = AccessibilityMonitorService.f6276F;
                        Object systemService = accessibilityMonitorService.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        boolean z2 = AccessibilityMonitorService.f6276F;
                        try {
                            int i = MainActivity.f6412i0;
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(accessibilityMonitorService, (Class<?>) MainActivity.class).addFlags(268468224), 201326592);
                        } catch (Exception unused) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(), 201326592);
                        }
                    default:
                        boolean z3 = AccessibilityMonitorService.f6276F;
                        try {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268468224), 201326592);
                        } catch (Exception unused2) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent(), 201326592);
                        }
                }
            }
        });
        final byte b3 = 2;
        this.f6281E = new r2c(new tl4(this) { // from class: t6

            /* renamed from: v */
            public final /* synthetic */ AccessibilityMonitorService f39768v;

            {
                this.f39768v = this;
            }

            @Override // p000.tl4
            public final Object invoke() {
                byte b32 = b3;
                AccessibilityMonitorService accessibilityMonitorService = this.f39768v;
                switch (b32) {
                    case 0:
                        boolean z = AccessibilityMonitorService.f6276F;
                        Object systemService = accessibilityMonitorService.getSystemService("accessibility");
                        systemService.getClass();
                        return (AccessibilityManager) systemService;
                    case 1:
                        boolean z2 = AccessibilityMonitorService.f6276F;
                        try {
                            int i = MainActivity.f6412i0;
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(accessibilityMonitorService, (Class<?>) MainActivity.class).addFlags(268468224), 201326592);
                        } catch (Exception unused) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 0, new Intent(), 201326592);
                        }
                    default:
                        boolean z3 = AccessibilityMonitorService.f6276F;
                        try {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268468224), 201326592);
                        } catch (Exception unused2) {
                            return PendingIntent.getActivity(accessibilityMonitorService, 1, new Intent(), 201326592);
                        }
                }
            }
        });
    }

    /* renamed from: a */
    public final Notification m3770a(String str, boolean z) {
        Notification build;
        PendingIntent pendingIntent;
        try {
            try {
                if (z) {
                    Object value = this.f6281E.getValue();
                    value.getClass();
                    pendingIntent = (PendingIntent) value;
                } else {
                    Object value2 = this.f6280D.getValue();
                    value2.getClass();
                    pendingIntent = (PendingIntent) value2;
                }
                k68 k68Var = new k68(this, "accessibility_monitor");
                k68Var.f21737e = k68.m11823d("Kahf Guard");
                k68Var.f21738f = k68.m11823d(str);
                k68Var.f21754v.icon = 2131231024;
                k68Var.m11833k(2, true);
                k68Var.f21752t = true;
                k68Var.f21743k = false;
                k68Var.f21747o = "service";
                k68Var.f21739g = pendingIntent;
                Notification m11826c = k68Var.m11826c();
                m11826c.getClass();
                return m11826c;
            } catch (Exception unused) {
                k68 k68Var2 = new k68(this, "accessibility_monitor");
                k68Var2.f21737e = k68.m11823d("Kahf Guard");
                k68Var2.f21738f = k68.m11823d("Active");
                k68Var2.f21754v.icon = 2131231024;
                k68Var2.m11833k(2, true);
                build = k68Var2.m11826c();
                build.getClass();
                return build;
            }
        } catch (Exception unused2) {
            build = new Notification.Builder(this, "accessibility_monitor").setContentTitle("Kahf Guard").setContentText("Active").setSmallIcon(2131231024).build();
            build.getClass();
            return build;
        }
    }

    /* renamed from: b */
    public final void m3771b(String str) {
        try {
            boolean m20085w = ut4.m20085w(this);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r2c r2cVar = this.f6283v;
            byte b = 1;
            xa2 xa2Var = null;
            if (m20085w) {
                if (!this.f6277A) {
                    Log.i("AccessibilityMonitor", "🟢 [" + str + "] Accessibility RE-ENABLED → Clearing alerts");
                    m3774e(false);
                    ((C0898ul) r2cVar.getValue()).m19695b();
                }
                this.f6287z = null;
                this.f6277A = true;
                return;
            }
            Long l = this.f6287z;
            if (l == null) {
                Log.w("AccessibilityMonitor", "🔴 [" + str + "] Accessibility DISABLED → Starting 50s grace period");
                this.f6287z = Long.valueOf(elapsedRealtime);
                jzd.m11709o(this.f6282u, null, null, new C0920v6(this, xa2Var, b), 3);
                return;
            }
            if (!this.f6277A || elapsedRealtime - l.longValue() < 50000) {
                return;
            }
            Log.e("AccessibilityMonitor", "🚨 [" + str + "] Grace period expired, still DISABLED → ALERTING USER");
            m3774e(true);
            C0898ul c0898ul = (C0898ul) r2cVar.getValue();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Long l2 = this.f6287z;
            l2.getClass();
            c0898ul.m19698f((elapsedRealtime - l2.longValue()) / 1000, lowerCase, true);
            this.f6277A = false;
        } catch (Exception unused) {
            Log.e("AccessibilityMonitor", "❌ [" + str + "] Error during state check");
        }
    }

    /* renamed from: c */
    public final void m3772c() {
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if ((notificationManager != null ? notificationManager.getNotificationChannel("accessibility_monitor") : null) != null || notificationManager == null) {
                return;
            }
            NotificationChannel notificationChannel = new NotificationChannel("accessibility_monitor", "Kahf Guard is Active", 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004a -> B:10:0x004d). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3773d(za2 za2Var) {
        C0994x6 c0994x6;
        int i;
        if (za2Var instanceof C0994x6) {
            c0994x6 = (C0994x6) za2Var;
            int i2 = c0994x6.f47711w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0994x6.f47711w = i2 - Integer.MIN_VALUE;
                Object obj = c0994x6.f47709u;
                i = c0994x6.f47711w;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (muc.m13749G(this.f6282u)) {
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                    m3771b("SAFETY_NET");
                    if (muc.m13749G(this.f6282u)) {
                        f95 f95Var = dj3.f8146v;
                        long m16843I = qr5.m16843I(300000L, hj3.MILLISECONDS);
                        c0994x6.f47711w = 1;
                        Object m9892H = i30.m9892H(m16843I, c0994x6);
                        qc2 qc2Var = qc2.f34309u;
                        if (m9892H == qc2Var) {
                            return qc2Var;
                        }
                        m3771b("SAFETY_NET");
                        if (muc.m13749G(this.f6282u)) {
                            return txc.f41359a;
                        }
                    }
                }
            }
        }
        c0994x6 = new C0994x6(this, za2Var);
        Object obj2 = c0994x6.f47709u;
        i = c0994x6.f47711w;
        if (i != 0) {
        }
    }

    /* renamed from: e */
    public final void m3774e(boolean z) {
        if (this.f6285x) {
            String str = z ? "Accessibility service OFF" : "Kahf Guard • Protection Active";
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.notify(1001, m3770a(str, z));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m3772c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f6276F = false;
        try {
            ((AccessibilityManager) this.f6284w.getValue()).removeAccessibilityStateChangeListener(this.f6279C);
        } catch (Exception unused) {
            Log.w("AccessibilityMonitor", "⚠️ Failed to unregister EVENT listener");
        }
        muc.m13775k(this.f6282u, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        byte b = 0;
        try {
            m3772c();
            startForeground(1001, m3770a("Kahf Guard • Protection Active", false));
            this.f6285x = true;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6286y && this.f6278B > 0 && elapsedRealtime - this.f6278B < 5000) {
                f6276F = true;
                return 1;
            }
            this.f6278B = elapsedRealtime;
            if (!this.f6286y) {
                ((AccessibilityManager) this.f6284w.getValue()).addAccessibilityStateChangeListener(this.f6279C);
                xa2 xa2Var = null;
                jzd.m11709o(this.f6282u, null, null, new C0920v6(this, xa2Var, (byte) 2), 3);
                jzd.m11709o(this.f6282u, null, null, new C0957w6(this, xa2Var, b), 3);
                this.f6286y = true;
            }
            f6276F = true;
            return 1;
        } catch (Exception unused) {
            f6276F = false;
            stopSelf();
            return 1;
        }
    }
}
