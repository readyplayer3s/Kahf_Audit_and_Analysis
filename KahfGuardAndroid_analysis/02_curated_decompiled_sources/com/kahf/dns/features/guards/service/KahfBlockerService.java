package com.kahf.dns.features.guards.service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.p001os.p002hz.gcwXtavsqv;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.p006iR.SCIPs;
import coil3.decode.p009lL.ivWZ;
import com.github.mikephil.charting.jobs.Zzyu.kDZkQvvJAhzNl;
import com.google.android.gms.measurement.internal.jhdS.jcRNFy;
import com.google.firebase.inappmessaging.pGL.KMBQqWH;
import com.kahf.dns.R;
import com.kahf.dns.features.analytics.FtDH.mmUZEXxylxd;
import com.kahf.dns.features.guards.service.KahfBlockerService;
import com.kahf.dns.features.notification.p017fd.QaBoVN;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.C0381gl;
import p000.C0482jc;
import p000.C0898ul;
import p000.C0917v3;
import p000.a21;
import p000.a4b;
import p000.a4d;
import p000.a91;
import p000.af2;
import p000.af6;
import p000.ag7;
import p000.aw0;
import p000.b6b;
import p000.bb7;
import p000.bcb;
import p000.bha;
import p000.bsd;
import p000.cm0;
import p000.d0a;
import p000.d3d;
import p000.d4b;
import p000.enb;
import p000.ep3;
import p000.fk7;
import p000.fw0;
import p000.gb6;
import p000.gd7;
import p000.ge6;
import p000.gpc;
import p000.h57;
import p000.hge;
import p000.i30;
import p000.i8b;
import p000.ie6;
import p000.iq5;
import p000.iw0;
import p000.iw5;
import p000.je6;
import p000.jf6;
import p000.jh6;
import p000.jm5;
import p000.jv0;
import p000.jxc;
import p000.jz4;
import p000.jzd;
import p000.k83;
import p000.k90;
import p000.ke6;
import p000.ke7;
import p000.kf6;
import p000.kl6;
import p000.kxc;
import p000.l30;
import p000.le6;
import p000.lf6;
import p000.lxc;
import p000.ly4;
import p000.mf6;
import p000.mta;
import p000.mtb;
import p000.muc;
import p000.mv1;
import p000.mxc;
import p000.n75;
import p000.n97;
import p000.ne6;
import p000.nf6;
import p000.nrc;
import p000.nw0;
import p000.o48;
import p000.o50;
import p000.ob4;
import p000.oc0;
import p000.oe6;
import p000.of6;
import p000.oi4;
import p000.ozd;
import p000.p50;
import p000.p97;
import p000.pe6;
import p000.qa2;
import p000.qc2;
import p000.qe6;
import p000.qr5;
import p000.qs1;
import p000.r2c;
import p000.r5b;
import p000.re6;
import p000.rk7;
import p000.se6;
import p000.sg7;
import p000.sj8;
import p000.so6;
import p000.sy0;
import p000.tc5;
import p000.te6;
import p000.ti9;
import p000.tv0;
import p000.txc;
import p000.tz6;
import p000.u03;
import p000.ue6;
import p000.ulb;
import p000.v11;
import p000.v20;
import p000.v90;
import p000.v94;
import p000.ve6;
import p000.vq8;
import p000.vu2;
import p000.we6;
import p000.x96;
import p000.xa2;
import p000.xcb;
import p000.xe6;
import p000.xo3;
import p000.y01;
import p000.y96;
import p000.ye6;
import p000.yn2;
import p000.ynb;
import p000.yw6;
import p000.za2;
import p000.zbb;
import p000.zo3;
import p000.ztb;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class KahfBlockerService extends AccessibilityService implements jh6 {

    /* renamed from: t0 */
    public static final Map f6288t0 = ly4.f25297a;

    /* renamed from: u0 */
    public static final HashSet f6289u0 = b6b.m1684J("com.google.android.youtube", kDZkQvvJAhzNl.oKkh, "com.facebook.katana", "com.facebook.lite", "org.telegram.messenger", "com.whatsapp", "com.whatsapp.w4b");

    /* renamed from: v0 */
    public static final HashSet f6290v0 = b6b.m1684J("com.android.chrome", "com.chrome.dev", "org.mozilla.firefox", "com.sec.android.app.sbrowser", "com.opera.browser", "com.microsoft.emmx", "org.mozilla.rocket", "com.opera.mini.native", "com.brave.browser", "com.duckduckgo.mobile.android", "com.vivaldi.browser", "org.torproject.torbrowser", "com.nationaledtech.spinbrowser", "com.ecosia.android", "com.hsv.freeadblockerbrowser", "idm.internet.download.manager", "com.instantbits.cast.webvideo", "io.kahf.browser");

    /* renamed from: w0 */
    public static final HashSet f6291w0 = b6b.m1684J("com.twitter.android", "com.zhiliaoapp.musically", "com.snapchat.android", "com.reddit.frontpage", "com.instagram.barcelona", "com.pinterest", "com.discord", "com.tumblr");

    /* renamed from: x0 */
    public static final HashSet f6292x0;

    /* renamed from: y0 */
    public static final LinkedHashSet f6293y0;

    /* renamed from: A */
    public final r2c f6294A;

    /* renamed from: B */
    public volatile Set f6295B;

    /* renamed from: C */
    public final pe6 f6296C;

    /* renamed from: D */
    public final pe6 f6297D;

    /* renamed from: E */
    public final yn2 f6298E;

    /* renamed from: F */
    public final gb6 f6299F;

    /* renamed from: G */
    public Set f6300G;

    /* renamed from: H */
    public volatile Set f6301H;

    /* renamed from: I */
    public volatile Set f6302I;

    /* renamed from: J */
    public volatile Set f6303J;

    /* renamed from: K */
    public volatile Set f6304K;

    /* renamed from: L */
    public volatile boolean f6305L;

    /* renamed from: M */
    public enb f6306M;

    /* renamed from: N */
    public lf6 f6307N;

    /* renamed from: O */
    public final Object f6308O;

    /* renamed from: P */
    public volatile boolean f6309P;

    /* renamed from: Q */
    public volatile long f6310Q;

    /* renamed from: R */
    public volatile long f6311R;

    /* renamed from: S */
    public final r2c f6312S;

    /* renamed from: T */
    public final r2c f6313T;

    /* renamed from: U */
    public final r2c f6314U;

    /* renamed from: V */
    public final r2c f6315V;

    /* renamed from: W */
    public final r2c f6316W;

    /* renamed from: X */
    public final r2c f6317X;

    /* renamed from: Y */
    public final r2c f6318Y;

    /* renamed from: Z */
    public final qa2 f6319Z;

    /* renamed from: a0 */
    public final i8b f6320a0;

    /* renamed from: b0 */
    public final i8b f6321b0;

    /* renamed from: c0 */
    public final r2c f6322c0;

    /* renamed from: d0 */
    public final r2c f6323d0;

    /* renamed from: e0 */
    public final r2c f6324e0;

    /* renamed from: f0 */
    public final r2c f6325f0;

    /* renamed from: g0 */
    public final ynb f6326g0;

    /* renamed from: h0 */
    public final v94 f6327h0;

    /* renamed from: i0 */
    public je6 f6328i0;

    /* renamed from: j0 */
    public final r2c f6329j0;

    /* renamed from: k0 */
    public lf6 f6330k0;

    /* renamed from: l0 */
    public final ie6 f6331l0;

    /* renamed from: m0 */
    public final Set f6332m0;

    /* renamed from: n0 */
    public final a4b f6333n0;

    /* renamed from: o0 */
    public volatile List f6334o0;

    /* renamed from: p0 */
    public String f6335p0;

    /* renamed from: q0 */
    public final HashMap f6336q0;

    /* renamed from: r0 */
    public String f6337r0;

    /* renamed from: s0 */
    public long f6338s0;

    /* renamed from: u */
    public final kl6 f6339u;

    /* renamed from: v */
    public final kl6 f6340v;

    /* renamed from: w */
    public final kl6 f6341w;

    /* renamed from: x */
    public final kl6 f6342x;

    /* renamed from: y */
    public final kl6 f6343y;

    /* renamed from: z */
    public final kl6 f6344z;

    /* renamed from: d */
    public static void m3775d(KahfBlockerService kahfBlockerService, String str, boolean z) {
        kahfBlockerService.f6296C.put(str, new ke6(z, SystemClock.elapsedRealtime()));
    }

    /* renamed from: f */
    public static Boolean m3776f(KahfBlockerService kahfBlockerService, String str, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (i & 4) != 0 ? 700L : 400L;
        Object obj = kahfBlockerService.f6296C.get(str);
        ke6 ke6Var = obj instanceof ke6 ? (ke6) obj : null;
        if (ke6Var == null || elapsedRealtime - ke6Var.m13391a() >= j) {
            return null;
        }
        return Boolean.valueOf(ke6Var.m12006b());
    }

    /* renamed from: A */
    public final void m3778A() {
        synchronized (this.f6308O) {
            je6 je6Var = (je6) this.f6326g0.getValue();
            if (je6Var == null) {
                return;
            }
            m3787J(je6Var.m11271a(), je6Var.m11280j(), je6Var.m11283m(), je6Var.m11284n(), je6Var.m11279i(), je6Var.m11275e(), je6Var.m11276f(), je6Var.m11277g(), je6Var.m11278h());
            m3788K(je6Var);
        }
    }

    /* renamed from: B */
    public final void m3779B(boolean z, boolean z2) {
        xa2 xa2Var = null;
        if (!z) {
            enb enbVar = this.f6306M;
            if (enbVar != null) {
                enbVar.mo6991b(null);
            }
            this.f6306M = null;
            this.f6305L = false;
            lf6 lf6Var = this.f6307N;
            if (lf6Var != null) {
                try {
                    unregisterReceiver(lf6Var);
                } catch (Exception e) {
                    if (v20.m20278v()) {
                        e.getMessage();
                    }
                }
                this.f6307N = null;
            }
            if (this.f6304K.isEmpty()) {
                return;
            }
            this.f6304K = ep3.f10423u;
            m3778A();
            this.f6296C.evictAll();
            return;
        }
        if (this.f6307N == null) {
            lf6 lf6Var2 = new lf6(this, (byte) 1);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            try {
                zy5.m23854u(this, lf6Var2, intentFilter, null, 4);
                this.f6307N = lf6Var2;
            } catch (Exception e2) {
                if (v20.m20278v()) {
                    e2.getMessage();
                }
            }
        }
        if (!this.f6305L || z2) {
            enb enbVar2 = this.f6306M;
            if (enbVar2 != null) {
                enbVar2.mo6991b(null);
            }
            this.f6306M = jzd.m11709o(this.f6319Z, null, null, new C0482jc(this, xa2Var, (byte) 7), 3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(2:27|21)(3:28|29|(1:31)))|11|12|(2:14|(2:16|17)(2:19|20))|21))|37|6|7|(0)(0)|11|12|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (p000.v20.m20278v() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3780C(String str, za2 za2Var) {
        mf6 mf6Var;
        int i;
        int m19705b;
        if (za2Var instanceof mf6) {
            mf6Var = (mf6) za2Var;
            int i2 = mf6Var.f26302w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mf6Var.f26302w = i2 - Integer.MIN_VALUE;
                Object obj = mf6Var.f26300u;
                i = mf6Var.f26302w;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (!m3795i().m15529c()) {
                        return null;
                    }
                    p50 m3795i = m3795i();
                    mf6Var.f26302w = 1;
                    m3795i.getClass();
                    obj = jzd.m11694F(k83.f21845a, new o50(m3795i, str, Long.MAX_VALUE, (xa2) null), mf6Var);
                    qc2 qc2Var = qc2.f34309u;
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                m19705b = (int) (((ulb) obj).m19705b() / 60000);
                if (m19705b > 0) {
                    if (m19705b < 60) {
                        return m19705b + "m";
                    }
                    return (m19705b / 60) + "h " + (m19705b % 60) + "m";
                }
                return null;
            }
        }
        mf6Var = new mf6(this, za2Var);
        Object obj2 = mf6Var.f26300u;
        i = mf6Var.f26302w;
        if (i != 0) {
        }
        m19705b = (int) (((ulb) obj2).m19705b() / 60000);
        if (m19705b > 0) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        if (r11 == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (r11 == r5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3781D(String str, AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        nf6 nf6Var;
        int i;
        if (za2Var instanceof nf6) {
            nf6Var = (nf6) za2Var;
            int i2 = nf6Var.f28198y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nf6Var.f28198y = i2 - Integer.MIN_VALUE;
                Object obj = nf6Var.f28196w;
                i = nf6Var.f28198y;
                txc txcVar = txc.f41359a;
                Object obj2 = qc2.f34309u;
                switch (i) {
                    case 0:
                        v11.m20244z(obj);
                        int ordinal = n97.m14005E(str, f6289u0, f6290v0, f6291w0, f6292x0).ordinal();
                        if (ordinal == 0) {
                            nf6Var.f28194u = str;
                            nf6Var.f28195v = accessibilityNodeInfo;
                            nf6Var.f28198y = 1;
                            obj = m3802p(str, accessibilityNodeInfo, nf6Var);
                            break;
                        } else if (ordinal == 1) {
                            nf6Var.f28194u = str;
                            nf6Var.f28195v = accessibilityNodeInfo;
                            nf6Var.f28198y = 3;
                            obj = m3801o(str, accessibilityNodeInfo, nf6Var);
                            break;
                        } else if (ordinal == 2) {
                            nf6Var.f28194u = null;
                            nf6Var.f28195v = null;
                            nf6Var.f28198y = 5;
                            if (m3804r(str, accessibilityNodeInfo, nf6Var) == obj2) {
                            }
                        } else {
                            if (ordinal != 3) {
                                gpc.m8801a();
                                return null;
                            }
                            nf6Var.f28194u = null;
                            nf6Var.f28195v = null;
                            nf6Var.f28198y = 6;
                            if (m3805s(str, accessibilityNodeInfo, nf6Var) != obj2) {
                                return txcVar;
                            }
                        }
                        return obj2;
                    case 1:
                        accessibilityNodeInfo = nf6Var.f28195v;
                        str = nf6Var.f28194u;
                        v11.m20244z(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            nf6Var.f28194u = null;
                            nf6Var.f28195v = null;
                            nf6Var.f28198y = 2;
                            if (m3804r(str, accessibilityNodeInfo, nf6Var) == obj2) {
                                return obj2;
                            }
                        }
                        return txcVar;
                    case 2:
                        v11.m20244z(obj);
                        return txcVar;
                    case 3:
                        accessibilityNodeInfo = nf6Var.f28195v;
                        str = nf6Var.f28194u;
                        v11.m20244z(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            nf6Var.f28194u = null;
                            nf6Var.f28195v = null;
                            nf6Var.f28198y = 4;
                            if (m3804r(str, accessibilityNodeInfo, nf6Var) == obj2) {
                            }
                        }
                        return txcVar;
                    case 4:
                        v11.m20244z(obj);
                        return txcVar;
                    case 5:
                        v11.m20244z(obj);
                        return txcVar;
                    case 6:
                        v11.m20244z(obj);
                        return txcVar;
                    default:
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nf6Var = new nf6(this, za2Var);
        Object obj3 = nf6Var.f28196w;
        i = nf6Var.f28198y;
        txc txcVar2 = txc.f41359a;
        Object obj22 = qc2.f34309u;
        switch (i) {
        }
    }

    /* renamed from: E */
    public final Object m3782E(String str, String str2, String str3, za2 za2Var) {
        m3790M();
        Object m11589h = ((jv0) this.f6315V.getValue()).m11589h(str, str2, str3, za2Var);
        return m11589h == qc2.f34309u ? m11589h : txc.f41359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3783F(String str, za2 za2Var) {
        of6 of6Var;
        Object obj;
        int i;
        kxc kxcVar;
        long j;
        if (za2Var instanceof of6) {
            of6Var = (of6) za2Var;
            int i2 = of6Var.f30326y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                of6Var.f30326y = i2 - Integer.MIN_VALUE;
                of6 of6Var2 = of6Var;
                obj = of6Var2.f30324w;
                i = of6Var2.f30326y;
                r2c r2cVar = this.f6325f0;
                if (i != 0) {
                    v11.m20244z(obj);
                    lxc m13902b = ((mxc) r2cVar.getValue()).m13902b();
                    je6 je6Var = this.f6328i0;
                    kxc m1836q = bb7.m1836q(m13902b, je6Var != null ? je6Var.m11263A() : jxc.f21327e, SystemClock.elapsedRealtime(), ((mxc) r2cVar.getValue()).m13901a());
                    long m12367a = m1836q.m12367a() * 1000;
                    m3790M();
                    jv0 jv0Var = (jv0) this.f6315V.getValue();
                    String string = getString(R.string.overlay_title_uninstall_lock);
                    string.getClass();
                    String m19210k = tz6.m19210k(fw0.f13058D.m8244a(), " ", str);
                    String string2 = getString(R.string.overlay_uninstall_lock_attempt, new Integer(m1836q.m12368b().m13040a()));
                    string2.getClass();
                    of6Var2.f30322u = m1836q;
                    of6Var2.f30323v = m12367a;
                    of6Var2.f30326y = 1;
                    Object m11590i = jv0Var.m11590i(string, m19210k, string2, m12367a, of6Var2);
                    qc2 qc2Var = qc2.f34309u;
                    if (m11590i == qc2Var) {
                        return qc2Var;
                    }
                    obj = m11590i;
                    kxcVar = m1836q;
                    j = m12367a;
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = of6Var2.f30323v;
                    kxcVar = of6Var2.f30322u;
                    v11.m20244z(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((mxc) r2cVar.getValue()).m13903c(kxcVar.m12368b());
                    m3784G(new Long(j));
                }
                return txc.f41359a;
            }
        }
        of6Var = new of6(this, za2Var);
        of6 of6Var22 = of6Var;
        obj = of6Var22.f30324w;
        i = of6Var22.f30326y;
        r2c r2cVar2 = this.f6325f0;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return txc.f41359a;
    }

    /* renamed from: G */
    public final void m3784G(Long l) {
        try {
            if (l == null) {
                m3799m().m110g(8000L);
            } else {
                m3799m().m110g(l.longValue());
            }
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
    }

    /* renamed from: H */
    public final String m3785H() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f6338s0) {
            return this.f6337r0;
        }
        String localDate = LocalDate.now().toString();
        localDate.getClass();
        this.f6337r0 = localDate;
        this.f6338s0 = currentTimeMillis + 60000;
        return localDate;
    }

    /* renamed from: I */
    public final void m3786I() {
        try {
            Vibrator vibrator = (Vibrator) this.f6318Y.getValue();
            if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
            }
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
    }

    /* renamed from: J */
    public final void m3787J(boolean z, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        ep3 ep3Var = ep3.f10423u;
        boolean z9 = z4 || z5 || z6 || z7 || z8;
        if (!z && !z2 && !z3 && !z9) {
            this.f6300G = ep3Var;
            return;
        }
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    iw0 iw0Var = (iw0) entry.getValue();
                    if (iw0Var.f19062e && iw0Var.m10610e()) {
                        linkedHashSet.add(str);
                    }
                }
            }
            if (z2) {
                Map map2 = ly4.f25297a;
                linkedHashSet.addAll(ly4.m13042a(l30.f23529v));
            }
            if (z3) {
                Map map3 = ly4.f25297a;
                linkedHashSet.addAll(ly4.m13042a(l30.f23530w));
                linkedHashSet.addAll(this.f6304K);
            }
            if (z4) {
                linkedHashSet.add("com.google.android.youtube");
            }
            if (z5) {
                linkedHashSet.add("com.facebook.katana");
            }
            if (z6) {
                linkedHashSet.add("com.instagram.android");
            }
            if (z7) {
                linkedHashSet.add("org.telegram.messenger");
            }
            if (z8) {
                linkedHashSet.add("com.whatsapp");
                linkedHashSet.add("com.whatsapp.w4b");
            }
            this.f6300G = linkedHashSet;
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
            this.f6300G = ep3Var;
        }
    }

    /* renamed from: K */
    public final void m3788K(je6 je6Var) {
        Set set;
        r5b r5bVar = new r5b();
        boolean m11269G = je6Var.m11269G();
        if (m11269G) {
            if (je6Var.m11267E()) {
                r5bVar.add("com.google.android.youtube");
            }
            if (je6Var.m11285o()) {
                r5bVar.add("com.instagram.android");
            }
            if (je6Var.m11282l()) {
                r5bVar.add("com.facebook.katana");
                r5bVar.add("com.facebook.lite");
            }
            if (je6Var.m11296z()) {
                r5bVar.add("org.telegram.messenger");
            }
            if (je6Var.m11266D()) {
                r5bVar.add("com.whatsapp");
                r5bVar.add("com.whatsapp.w4b");
            }
            if (je6Var.m11272b().m18581a()) {
                if (je6Var.m11283m()) {
                    Map map = ly4.f25297a;
                    r5bVar.addAll(ly4.m13042a(l30.f23529v));
                }
                if (je6Var.m11284n()) {
                    Map map2 = ly4.f25297a;
                    r5bVar.addAll(ly4.m13042a(l30.f23530w));
                    r5bVar.addAll(this.f6304K);
                }
                if (je6Var.m11279i()) {
                    r5bVar.add("com.google.android.youtube");
                }
                if (je6Var.m11275e()) {
                    r5bVar.add("com.facebook.katana");
                }
                if (je6Var.m11276f()) {
                    r5bVar.add("com.instagram.android");
                }
                if (je6Var.m11277g()) {
                    r5bVar.add("org.telegram.messenger");
                }
                if (je6Var.m11278h()) {
                    r5bVar.add("com.whatsapp");
                    r5bVar.add("com.whatsapp.w4b");
                }
                for (iw0 iw0Var : je6Var.m11280j().values()) {
                    if (iw0Var.f19062e && iw0Var.m10610e()) {
                        r5bVar.add(iw0Var.f19058a);
                    }
                }
            }
            if (ag7.m585b(m11269G, je6Var.m11270H(), je6Var.m11281k())) {
                r5bVar.addAll(f6290v0);
            }
            if (je6Var.m11290t()) {
                r5bVar.addAll(f6289u0);
                r5bVar.addAll(f6290v0);
                r5bVar.addAll(f6291w0);
            }
            if (je6Var.m11274d()) {
                r5bVar.addAll(f6288t0.keySet());
            }
            if (je6Var.m11264B()) {
                for (iw0 iw0Var2 : je6Var.m11280j().values()) {
                    if (iw0Var2.f19062e && iw0Var2.f19061d == nw0.f28968x) {
                        r5bVar.add(iw0Var2.f19058a);
                    }
                }
            }
        }
        if (je6Var.m11295y() || je6Var.m11294x()) {
            r5bVar.addAll(f6292x0);
        }
        if (je6Var.m11295y()) {
            r5bVar.add("com.android.vending");
        }
        if (je6Var.m11288r()) {
            r5bVar.addAll(je6Var.m11289s());
        }
        Set m542f = af2.m542f(r5bVar);
        if (je6Var.m11287q() && je6Var.m11269G()) {
            List m11286p = je6Var.m11286p();
            set = new LinkedHashSet();
            Iterator it = m11286p.iterator();
            while (it.hasNext()) {
                set.add(((fk7) it.next()).f12145a);
            }
        } else {
            set = ep3.f10423u;
        }
        this.f6302I = m542f;
        this.f6303J = b6b.m1686L(set, m542f);
        if (!set.isEmpty()) {
            m542f = b6b.m1688N(m542f, set);
        }
        this.f6301H = m542f;
        if (v20.m20278v()) {
            this.f6301H.size();
            this.f6303J.size();
            je6Var.m11269G();
        }
        m3791b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.util.Set] */
    /* renamed from: L */
    public final void m3789L() {
        ep3 ep3Var;
        ep3 ep3Var2;
        List list;
        jxc jxcVar;
        Map map;
        ep3 ep3Var3 = ep3.f10423u;
        boolean z = m3798l().getBoolean("pref_app_blocker_enabled", false);
        String str = "[]";
        String string = m3798l().getString("pref_blocked_apps_json", "[]");
        if (string == null) {
            string = "[]";
        }
        boolean z2 = m3798l().getBoolean("pref_group_social_media_enabled", false);
        boolean z3 = m3798l().getBoolean("pref_group_vpn_tor_enabled", false);
        boolean z4 = m3798l().getBoolean("pref_block_youtube_enabled", false);
        boolean z5 = m3798l().getBoolean("pref_block_facebook_enabled", false);
        boolean z6 = m3798l().getBoolean("pref_block_instagram_enabled", false);
        boolean z7 = m3798l().getBoolean("pref_block_telegram_enabled", false);
        boolean z8 = m3798l().getBoolean("pref_block_whatsapp_enabled", false);
        boolean z9 = m3798l().getBoolean("pref_custom_site_block_enabled", false);
        try {
            String string2 = m3798l().getString("pref_custom_simplified_blocked_urls", "[]");
            if (string2 == null) {
                string2 = "[]";
            }
            x96 x96Var = y96.f49965d;
            x96Var.getClass();
            ep3Var = (Set) x96Var.m22748a(new k90(mtb.f27069a, (byte) 1), string2);
        } catch (Exception unused) {
            ep3Var = ep3Var3;
        }
        String string3 = m3798l().getString("pref_custom_site_block_mode", "blocklist");
        zbb.f52103v.getClass();
        zbb zbbVar = zy5.m23838d(string3, "allowlist") ? zbb.ALLOWLIST : zbb.BLOCKLIST;
        try {
            String string4 = m3798l().getString("pref_custom_simplified_allowed_urls", "[]");
            if (string4 == null) {
                string4 = "[]";
            }
            x96 x96Var2 = y96.f49965d;
            x96Var2.getClass();
            ep3Var2 = (Set) x96Var2.m22748a(new k90(mtb.f27069a, (byte) 1), string4);
        } catch (Exception unused2) {
            ep3Var2 = ep3Var3;
        }
        boolean z10 = m3798l().getBoolean("pref_app_limit_warning_enabled", true);
        int i = m3798l().getInt("pref_app_limit_threshold_minutes", 60);
        boolean z11 = m3798l().getBoolean("pref_usage_limit_block_enabled", false);
        boolean z12 = m3798l().getBoolean("pref_usage_timer_overlay_enabled", true);
        boolean z13 = m3798l().getBoolean("pref_risky_word_block_enabled", false);
        boolean z14 = m3798l().getBoolean("pref_mindful_pause_enabled", false);
        int i2 = m3798l().getInt("pref_mindful_pause_duration_seconds", 10);
        int i3 = m3798l().getInt("pref_mindful_pause_switch_grace_seconds", 300);
        try {
            x96 x96Var3 = y96.f49965d;
            String string5 = m3798l().getString("pref_mindful_pause_apps_json", "[]");
            if (string5 != null) {
                str = string5;
            }
            x96Var3.getClass();
            list = (List) x96Var3.m22748a(new k90(fk7.Companion.serializer(), (byte) 0), str);
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
            list = xo3.f48775u;
        }
        List list2 = list;
        jxc jxcVar2 = jxc.f21327e;
        try {
            jxcVar = new jxc(m3798l().getInt("pref_uninstall_lock_base_seconds", jxcVar2.m11629a()), m3798l().getInt("pref_uninstall_lock_multiplier", jxcVar2.m11631c()), m3798l().getInt("pref_uninstall_lock_max_seconds", jxcVar2.m11630b()), m3798l().getLong("pref_uninstall_lock_reset_after_seconds", jxcVar2.m11632d()));
        } catch (ClassCastException e2) {
            if (v20.m20278v()) {
                e2.getMessage();
            }
            jxcVar = jxcVar2;
        }
        String string6 = m3798l().getString("trial_status", "none");
        String str2 = string6 == null ? "none" : string6;
        Boolean valueOf = m3798l().getInt("entitlement_schema_version", 0) == 2 ? Boolean.valueOf(m3798l().getBoolean("entitlement_is_entitled", false)) : null;
        try {
            gb6 gb6Var = this.f6299F;
            gb6Var.getClass();
            List list3 = (List) gb6Var.m22748a(new k90(iw0.Companion.serializer(), (byte) 0), string);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (((iw0) obj).f19062e) {
                    arrayList.add(obj);
                }
            }
            int m15615D = p97.m15615D(qs1.m16870Y(arrayList, 10));
            if (m15615D < 16) {
                m15615D = 16;
            }
            map = new LinkedHashMap(m15615D);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                map.put(((iw0) next).f19058a, next);
            }
        } catch (Exception e3) {
            if (v20.m20278v()) {
                e3.getMessage();
            }
            map = zo3.f52774u;
        }
        je6 je6Var = new je6(m3798l().getBoolean("pref_youtube_shorts_enabled", false), m3798l().getBoolean("pref_instagram_reels_enabled", false), m3798l().getBoolean("pref_facebook_reels_enabled", false), m3798l().getBoolean("pref_telegram_search_enabled", false), m3798l().getBoolean("pref_whatsapp_status_enabled", false), z9, ep3Var, zbbVar, ep3Var2, m3798l().getBoolean("pref_uninstall_prevention_enabled", false), m3798l().getBoolean("pref_dns_change_prevention_enabled", false), z, string, map, z2, z3, z4, z5, z6, z7, z8, z10, i, z11, z12, z13, z14, i2, i3, list2, jxcVar, str2, valueOf, m3798l().getBoolean("pref_new_app_approval_enabled", false), m3797k().m14778c(), m3798l().getBoolean("pref_browsing_report_enabled", false));
        ynb ynbVar = this.f6326g0;
        ynbVar.getClass();
        ynbVar.m22921k(null, je6Var);
        m3778A();
        je6 je6Var2 = (je6) ynbVar.getValue();
        m3779B(je6Var2 != null && je6Var2.m11284n() && je6Var2.m11269G(), false);
        m3812z();
        this.f6296C.evictAll();
    }

    /* renamed from: M */
    public final void m3790M() {
        m3784G(null);
        if (this.f6323d0.mo12142c()) {
            try {
                m3796j().m17413d();
            } catch (Exception e) {
                if (v20.m20278v()) {
                    e.getMessage();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3791b() {
        try {
            AccessibilityServiceInfo serviceInfo = getServiceInfo();
            if (serviceInfo == null) {
                return;
            }
            Set set = this.f6301H;
            String packageName = getPackageName();
            packageName.getClass();
            String[] m18043p = sg7.m18043p(packageName, set);
            serviceInfo.packageNames = m18043p;
            this.f6334o0 = v90.m20556h0(m18043p);
            setServiceInfo(serviceInfo);
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
    }

    /* renamed from: c */
    public final String m3792c(int i, String str, String str2) {
        StringBuilder sb = (StringBuilder) this.f6298E.get();
        if (sb == null) {
            sb = new StringBuilder(64);
        }
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(i);
        sb.append(':');
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (printWriter == null) {
            return;
        }
        a4b a4bVar = this.f6333n0;
        int size = this.f6301H.size();
        List list = this.f6334o0;
        String packageName = getPackageName();
        packageName.getClass();
        a4b.m97a(a4bVar, printWriter, size, list, packageName, ((xcb) this.f6343y.getValue()).m22016d());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3793e(String str, xa2 xa2Var) {
        oe6 oe6Var;
        int i;
        long currentTimeMillis;
        String str2;
        int m11273c;
        String str3;
        long j;
        String str4;
        int i2;
        String str5;
        long j2;
        nrc nrcVar;
        iw0 iw0Var;
        boolean booleanValue;
        boolean z;
        String str6 = str;
        if (xa2Var instanceof oe6) {
            oe6Var = (oe6) xa2Var;
            int i3 = oe6Var.f30284C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oe6Var.f30284C = i3 - Integer.MIN_VALUE;
                oe6 oe6Var2 = oe6Var;
                Object obj = oe6Var2.f30282A;
                i = oe6Var2.f30284C;
                pe6 pe6Var = this.f6296C;
                txc txcVar = txc.f41359a;
                if (i != 0) {
                    v11.m20244z(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    je6 je6Var = this.f6328i0;
                    if (je6Var != null && je6Var.m11274d() && ((!je6Var.m11264B() || (iw0Var = (iw0) je6Var.m11280j().get(str6)) == null || !iw0Var.f19062e || iw0Var.f19061d != nw0.f28968x) && (str2 = (String) f6288t0.get(str6)) != null)) {
                        m11273c = je6Var.m11273c();
                        long j3 = m11273c * 60 * 1000;
                        String str7 = "usage_" + str6 + "_" + m11273c;
                        Object obj2 = pe6Var.get(str7);
                        le6 le6Var = obj2 instanceof le6 ? (le6) obj2 : null;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (le6Var == null || elapsedRealtime - le6Var.m13391a() >= 90000) {
                            p50 m3795i = m3795i();
                            oe6Var2.f30285u = str6;
                            oe6Var2.f30286v = str2;
                            oe6Var2.f30287w = str7;
                            oe6Var2.f30288x = currentTimeMillis;
                            oe6Var2.f30290z = m11273c;
                            oe6Var2.f30289y = elapsedRealtime;
                            oe6Var2.f30284C = 1;
                            m3795i.getClass();
                            obj = jzd.m11694F(k83.f21845a, new o50(m3795i, str6, j3, (xa2) null), oe6Var2);
                            qc2 qc2Var = qc2.f34309u;
                            if (obj == qc2Var) {
                                return qc2Var;
                            }
                            str3 = str;
                            j = currentTimeMillis;
                            str4 = str2;
                            i2 = m11273c;
                            str5 = str7;
                            j2 = elapsedRealtime;
                        } else {
                            nrcVar = new nrc(Boolean.valueOf(le6Var.m12707d()), new Long(le6Var.m12706c()), new Long(le6Var.m12705b()));
                            booleanValue = ((Boolean) nrcVar.m14418a()).booleanValue();
                            long longValue = ((Number) nrcVar.m14419b()).longValue();
                            long longValue2 = ((Number) nrcVar.m14420c()).longValue();
                            String m18102n = sj8.m18102n("session_last_active_", str6);
                            long j4 = m3798l().getLong(m18102n, 0L);
                            z = j4 != 0 || longValue2 - j4 > 180000;
                            String m18102n2 = sj8.m18102n("session_notif_shown_", str6);
                            if (z) {
                                SharedPreferences m3798l = m3798l();
                                m3798l.getClass();
                                SharedPreferences.Editor edit = m3798l.edit();
                                edit.getClass();
                                edit.putLong(m18102n, currentTimeMillis);
                                edit.remove(m18102n2);
                                edit.apply();
                            } else {
                                SharedPreferences m3798l2 = m3798l();
                                m3798l2.getClass();
                                SharedPreferences.Editor edit2 = m3798l2.edit();
                                edit2.getClass();
                                edit2.putLong(m18102n, currentTimeMillis);
                                edit2.apply();
                            }
                            if (booleanValue) {
                                try {
                                    if (!m3798l().getBoolean(m18102n2, false)) {
                                        ((C0898ul) this.f6313T.getValue()).m19699g(m11273c, str6, str2, bsd.m2418w(longValue));
                                        m3786I();
                                        SharedPreferences m3798l3 = m3798l();
                                        m3798l3.getClass();
                                        SharedPreferences.Editor edit3 = m3798l3.edit();
                                        edit3.getClass();
                                        edit3.putBoolean(m18102n2, true);
                                        edit3.apply();
                                        v20.m20278v();
                                        return txcVar;
                                    }
                                } catch (Exception e) {
                                    if (v20.m20278v()) {
                                        e.getMessage();
                                    }
                                }
                            }
                        }
                    }
                    return txcVar;
                }
                if (i != 1) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j5 = oe6Var2.f30289y;
                i2 = oe6Var2.f30290z;
                j = oe6Var2.f30288x;
                String str8 = oe6Var2.f30287w;
                String str9 = oe6Var2.f30286v;
                str3 = oe6Var2.f30285u;
                v11.m20244z(obj);
                j2 = j5;
                str5 = str8;
                str4 = str9;
                ulb ulbVar = (ulb) obj;
                pe6Var.put(str5, new le6(ulbVar.m19706c(), ulbVar.m19705b(), ulbVar.m19704a(), j2));
                nrcVar = new nrc(Boolean.valueOf(ulbVar.m19706c()), new Long(ulbVar.m19705b()), new Long(ulbVar.m19704a()));
                str2 = str4;
                m11273c = i2;
                currentTimeMillis = j;
                str6 = str3;
                booleanValue = ((Boolean) nrcVar.m14418a()).booleanValue();
                long longValue3 = ((Number) nrcVar.m14419b()).longValue();
                long longValue22 = ((Number) nrcVar.m14420c()).longValue();
                String m18102n3 = sj8.m18102n("session_last_active_", str6);
                long j42 = m3798l().getLong(m18102n3, 0L);
                if (j42 != 0) {
                }
                String m18102n22 = sj8.m18102n("session_notif_shown_", str6);
                if (z) {
                }
                if (booleanValue) {
                }
                return txcVar;
            }
        }
        oe6Var = new oe6(this, xa2Var);
        oe6 oe6Var22 = oe6Var;
        Object obj3 = oe6Var22.f30282A;
        i = oe6Var22.f30284C;
        pe6 pe6Var2 = this.f6296C;
        txc txcVar2 = txc.f41359a;
        if (i != 0) {
        }
        ulb ulbVar2 = (ulb) obj3;
        pe6Var2.put(str5, new le6(ulbVar2.m19706c(), ulbVar2.m19705b(), ulbVar2.m19704a(), j2));
        nrcVar = new nrc(Boolean.valueOf(ulbVar2.m19706c()), new Long(ulbVar2.m19705b()), new Long(ulbVar2.m19704a()));
        str2 = str4;
        m11273c = i2;
        currentTimeMillis = j;
        str6 = str3;
        booleanValue = ((Boolean) nrcVar.m14418a()).booleanValue();
        long longValue32 = ((Number) nrcVar.m14419b()).longValue();
        long longValue222 = ((Number) nrcVar.m14420c()).longValue();
        String m18102n32 = sj8.m18102n("session_last_active_", str6);
        long j422 = m3798l().getLong(m18102n32, 0L);
        if (j422 != 0) {
        }
        String m18102n222 = sj8.m18102n("session_notif_shown_", str6);
        if (z) {
        }
        if (booleanValue) {
        }
        return txcVar2;
    }

    /* renamed from: i */
    public final p50 m3795i() {
        return (p50) this.f6312S.getValue();
    }

    /* renamed from: j */
    public final rk7 m3796j() {
        return (rk7) this.f6323d0.getValue();
    }

    /* renamed from: k */
    public final o48 m3797k() {
        return (o48) this.f6329j0.getValue();
    }

    /* renamed from: l */
    public final SharedPreferences m3798l() {
        return (SharedPreferences) this.f6324e0.getValue();
    }

    /* renamed from: m */
    public final a4d m3799m() {
        return (a4d) this.f6317X.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x008b, code lost:
    
        if (m3809w(r4, "pending", r8) == r9) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x010d, code lost:
    
        if (m3809w(r0, "group", r8) == r9) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0196, code lost:
    
        if (m3809w(r0, "individual", r8) == r9) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x013e, code lost:
    
        if (r4.equals("com.whatsapp") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0167, code lost:
    
        r2 = r0.m11278h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0163, code lost:
    
        if (r4.equals("com.whatsapp.w4b") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x047c, code lost:
    
        if (m3809w(r4, "app", r8) == r9) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r15v3, types: [iw0, java.lang.String] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3800n(String str, za2 za2Var) {
        qe6 qe6Var;
        int i;
        vq8 vq8Var;
        boolean z;
        vq8 vq8Var2;
        iw0 iw0Var;
        long currentTimeMillis;
        Object obj;
        boolean z2;
        iw0 iw0Var2;
        boolean z3;
        long j;
        le6 le6Var;
        Object obj2;
        String str2;
        long j2;
        String str3;
        boolean m11283m;
        Object obj3;
        String str4;
        Object obj4;
        String str5 = str;
        if (za2Var instanceof qe6) {
            qe6Var = (qe6) za2Var;
            int i2 = qe6Var.f34468C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qe6Var.f34468C = i2 - Integer.MIN_VALUE;
                qe6 qe6Var2 = qe6Var;
                Object obj5 = qe6Var2.f34466A;
                Object obj6 = qc2.f34309u;
                i = qe6Var2.f34468C;
                if (i != 0) {
                    v11.m20244z(obj5);
                    je6 je6Var = this.f6328i0;
                    if (je6Var == null) {
                        return Boolean.FALSE;
                    }
                    if (je6Var.m11288r() && je6Var.m11289s().contains(str5)) {
                        qe6Var2.f34469u = null;
                        qe6Var2.f34468C = 1;
                    } else {
                        if (!je6Var.m11272b().m18581a()) {
                            return Boolean.FALSE;
                        }
                        Map map = ly4.f25297a;
                        str5.getClass();
                        l30 l30Var = (l30) ((Map) ly4.f25300d.getValue()).get(str5);
                        if (l30Var != null) {
                            int ordinal = l30Var.ordinal();
                            if (ordinal == 0) {
                                m11283m = je6Var.m11283m();
                            } else {
                                if (ordinal != 1) {
                                    gpc.m8801a();
                                    return null;
                                }
                                m11283m = je6Var.m11284n();
                            }
                            if (m11283m) {
                                String concat = l30Var.f23533u.concat(" apps are blocked - Kahf Guard");
                                v20.m20278v();
                                vq8Var = new vq8(concat, str5);
                                if (vq8Var == null) {
                                    String str6 = (String) vq8Var.f44885v;
                                    qe6Var2.f34469u = null;
                                    qe6Var2.f34468C = 2;
                                } else {
                                    switch (str5.hashCode()) {
                                        case -2103713194:
                                            break;
                                        case -2075712516:
                                            if (str5.equals("com.google.android.youtube")) {
                                                z = je6Var.m11279i();
                                                break;
                                            }
                                            z = false;
                                            break;
                                        case -1897170512:
                                            if (str5.equals("org.telegram.messenger")) {
                                                z = je6Var.m11277g();
                                                break;
                                            }
                                            z = false;
                                            break;
                                        case -1547699361:
                                            break;
                                        case -662003450:
                                            if (str5.equals("com.instagram.android")) {
                                                z = je6Var.m11276f();
                                                break;
                                            }
                                            z = false;
                                            break;
                                        case 714499313:
                                            if (str5.equals("com.facebook.katana")) {
                                                z = je6Var.m11275e();
                                                break;
                                            }
                                            z = false;
                                            break;
                                        default:
                                            z = false;
                                            break;
                                    }
                                    if (z) {
                                        String concat2 = m3777h(str5).concat(" is blocked - Kahf Guard");
                                        v20.m20278v();
                                        vq8Var2 = new vq8(concat2, str5);
                                    } else {
                                        vq8Var2 = null;
                                    }
                                    if (vq8Var2 != null) {
                                        String str7 = (String) vq8Var2.f44885v;
                                        qe6Var2.f34469u = null;
                                        qe6Var2.f34468C = 3;
                                    } else {
                                        if (!je6Var.m11271a()) {
                                            return Boolean.FALSE;
                                        }
                                        iw0Var = (iw0) je6Var.m11280j().get(str5);
                                        if (iw0Var == null || !iw0Var.f19062e) {
                                            v20.m20278v();
                                            this.f6300G = b6b.m1685K(this.f6300G, str5);
                                            return Boolean.FALSE;
                                        }
                                        currentTimeMillis = System.currentTimeMillis();
                                        int ordinal2 = iw0Var.f19061d.ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 == 1) {
                                                obj = null;
                                                v20.m20278v();
                                                iw0Var2 = iw0Var;
                                                z3 = true;
                                            } else if (ordinal2 == 2) {
                                                obj = null;
                                                z2 = false;
                                                List list = iw0Var.f19065h;
                                                if (list == null || !list.isEmpty()) {
                                                    Iterator it = list.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((aw0) it.next()).m1417b()) {
                                                                z2 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (v20.m20278v()) {
                                                    iw0Var.f19065h.size();
                                                }
                                            } else {
                                                if (ordinal2 != 3) {
                                                    gpc.m8801a();
                                                    return null;
                                                }
                                                if (je6Var.m11264B()) {
                                                    j = r0 * 60 * 1000;
                                                    String str8 = "usage_limit_" + str5 + "_" + iw0Var.f19066i;
                                                    Object obj7 = this.f6296C.get(str8);
                                                    le6Var = obj7 instanceof le6 ? (le6) obj7 : null;
                                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                                    if (le6Var == null || elapsedRealtime - le6Var.m13391a() >= 90000) {
                                                        p50 m3795i = m3795i();
                                                        qe6Var2.f34469u = str;
                                                        qe6Var2.f34470v = iw0Var;
                                                        qe6Var2.f34471w = str8;
                                                        qe6Var2.f34472x = currentTimeMillis;
                                                        qe6Var2.f34473y = j;
                                                        qe6Var2.f34474z = elapsedRealtime;
                                                        qe6Var2.f34468C = 4;
                                                        m3795i.getClass();
                                                        obj2 = null;
                                                        Object m11694F = jzd.m11694F(k83.f21845a, new o50(m3795i, str, j, (xa2) null), qe6Var2);
                                                        if (m11694F != obj6) {
                                                            str2 = str;
                                                            j = j;
                                                            j2 = elapsedRealtime;
                                                            str3 = str8;
                                                            obj5 = m11694F;
                                                            ulb ulbVar = (ulb) obj5;
                                                            le6Var = new le6(ulbVar.m19706c(), ulbVar.m19705b(), ulbVar.m19704a(), j2);
                                                            this.f6296C.put(str3, le6Var);
                                                        }
                                                    } else {
                                                        str2 = str;
                                                        obj2 = null;
                                                    }
                                                } else {
                                                    v20.m20278v();
                                                    obj = null;
                                                    iw0Var2 = iw0Var;
                                                    z3 = false;
                                                }
                                            }
                                            if (!z3) {
                                                if (v20.m20278v()) {
                                                    Objects.toString(iw0Var2.f19061d);
                                                }
                                                return Boolean.FALSE;
                                            }
                                            int ordinal3 = iw0Var2.f19061d.ordinal();
                                            if (ordinal3 != 0) {
                                                if (ordinal3 != 1) {
                                                    if (ordinal3 == 2) {
                                                        Iterator it2 = iw0Var2.f19065h.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                obj3 = it2.next();
                                                                if (((aw0) obj3).m1417b()) {
                                                                }
                                                            } else {
                                                                obj3 = obj;
                                                            }
                                                        }
                                                        aw0 aw0Var = (aw0) obj3;
                                                        if (aw0Var != null) {
                                                            aw0Var.m1416a();
                                                        }
                                                    } else {
                                                        if (ordinal3 != 3) {
                                                            gpc.m8801a();
                                                            return obj;
                                                        }
                                                        int i3 = iw0Var2.f19066i;
                                                        if (i3 >= 60) {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(i3 / 60);
                                                            sb.append("h ");
                                                            sb.append(i3 % 60);
                                                            sb.append("m");
                                                        } else {
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append(i3);
                                                            sb2.append("m");
                                                        }
                                                    }
                                                }
                                            } else if (iw0Var2.f19061d == nw0.f28965u && iw0Var2.m10609d()) {
                                                int m10607b = iw0Var2.m10607b();
                                                int m10608c = iw0Var2.m10608c();
                                                if (m10607b > 0) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(m10607b);
                                                    sb3.append("m");
                                                } else if (m10608c > 0) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(m10608c);
                                                    sb4.append("s");
                                                }
                                            }
                                            ?? r15 = obj;
                                            qe6Var2.f34469u = r15;
                                            qe6Var2.f34470v = r15;
                                            qe6Var2.f34471w = r15;
                                            qe6Var2.f34472x = currentTimeMillis;
                                            qe6Var2.f34468C = 5;
                                        } else {
                                            obj = null;
                                            z2 = currentTimeMillis < iw0Var.f19064g + ((long) (iw0Var.f19063f * 60000));
                                            v20.m20278v();
                                        }
                                        iw0Var2 = iw0Var;
                                        z3 = z2;
                                        if (!z3) {
                                        }
                                    }
                                }
                            }
                        }
                        if (je6Var.m11284n() && this.f6304K.contains(str5)) {
                            l30 l30Var2 = l30.f23529v;
                            v20.m20278v();
                            vq8Var = new vq8("VPN & Tor apps are blocked - Kahf Guard", str5);
                        } else {
                            vq8Var = null;
                        }
                        if (vq8Var == null) {
                        }
                    }
                    return obj6;
                }
                if (i == 1) {
                    v11.m20244z(obj5);
                    return Boolean.TRUE;
                }
                if (i == 2) {
                    v11.m20244z(obj5);
                    return Boolean.TRUE;
                }
                if (i == 3) {
                    v11.m20244z(obj5);
                    return Boolean.TRUE;
                }
                if (i != 4) {
                    if (i == 5) {
                        v11.m20244z(obj5);
                        return Boolean.TRUE;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = qe6Var2.f34474z;
                j = qe6Var2.f34473y;
                currentTimeMillis = qe6Var2.f34472x;
                str3 = qe6Var2.f34471w;
                iw0Var = qe6Var2.f34470v;
                str2 = qe6Var2.f34469u;
                v11.m20244z(obj5);
                j2 = j3;
                obj2 = null;
                ulb ulbVar2 = (ulb) obj5;
                le6Var = new le6(ulbVar2.m19706c(), ulbVar2.m19705b(), ulbVar2.m19704a(), j2);
                this.f6296C.put(str3, le6Var);
                if (!le6Var.m12707d() || j <= 0) {
                    str4 = str2;
                    obj = obj2;
                } else {
                    String str9 = iw0Var.f19059b;
                    long m12706c = le6Var.m12706c();
                    int i4 = iw0Var.f19066i;
                    obj = obj2;
                    HashMap hashMap = this.f6336q0;
                    try {
                        List list2 = jz4.f21373b;
                        if (!list2.isEmpty()) {
                            int i5 = (int) ((100 * m12706c) / j);
                            Integer num = (Integer) hashMap.get(str2);
                            if (num == null || num.intValue() != i5) {
                                hashMap.put(str2, Integer.valueOf(i5));
                                ListIterator listIterator = list2.listIterator(list2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        obj4 = listIterator.previous();
                                        if (i5 >= ((Number) obj4).intValue()) {
                                        }
                                    } else {
                                        obj4 = obj;
                                    }
                                }
                                Integer num2 = (Integer) obj4;
                                if (num2 != null) {
                                    int intValue = num2.intValue();
                                    String str10 = "usage_warn_milestone_" + str2 + "_" + m3785H();
                                    if (intValue > m3798l().getInt(str10, 0)) {
                                        int i6 = (int) (m12706c / 60000);
                                        int i7 = i4 - i6;
                                        str4 = str2;
                                        try {
                                            ((C0898ul) this.f6313T.getValue()).m19700h(str4, str9, intValue, i6, i7 < 0 ? 0 : i7, i4);
                                            SharedPreferences m3798l = m3798l();
                                            m3798l.getClass();
                                            SharedPreferences.Editor edit = m3798l.edit();
                                            edit.getClass();
                                            edit.putInt(str10, intValue);
                                            edit.apply();
                                            if (intValue >= 90) {
                                                m3786I();
                                            }
                                            v20.m20278v();
                                        } catch (Exception e) {
                                            e = e;
                                            if (v20.m20278v()) {
                                                e.getMessage();
                                            }
                                            if (v20.m20278v()) {
                                            }
                                            iw0 iw0Var3 = iw0Var;
                                            z3 = le6Var.m12707d();
                                            iw0Var2 = iw0Var3;
                                            str5 = str4;
                                            if (!z3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str4 = str2;
                    } catch (Exception e2) {
                        e = e2;
                        str4 = str2;
                    }
                }
                if (v20.m20278v()) {
                    int i8 = iw0Var.f19066i;
                }
                iw0 iw0Var32 = iw0Var;
                z3 = le6Var.m12707d();
                iw0Var2 = iw0Var32;
                str5 = str4;
                if (!z3) {
                }
            }
        }
        qe6Var = new qe6(this, za2Var);
        qe6 qe6Var22 = qe6Var;
        Object obj52 = qe6Var22.f34466A;
        Object obj62 = qc2.f34309u;
        i = qe6Var22.f34468C;
        if (i != 0) {
        }
        if (le6Var.m12707d()) {
        }
        str4 = str2;
        obj = obj2;
        if (v20.m20278v()) {
        }
        iw0 iw0Var322 = iw0Var;
        z3 = le6Var.m12707d();
        iw0Var2 = iw0Var322;
        str5 = str4;
        if (!z3) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(3:19|20|21))(4:30|31|32|(2:34|35)(5:36|(1:172)(1:40)|41|(1:171)(1:45)|(10:50|(1:52)(1:170)|(1:54)(1:169)|55|(1:57)(1:168)|58|(1:60)(1:167)|(1:62)(8:146|147|(1:149)|(1:151)(1:165)|(2:(1:154)(1:156)|155)|(1:160)|(1:163)|164)|63|(7:65|66|69|70|71|(1:73)|24)(2:144|145))(2:48|49)))|22))|176|6|7|(0)(0)|22|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0241, code lost:
    
        if (p000.jzd.m11694F(r0, r2, r4) == r10) goto L163;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021f A[Catch: Exception -> 0x0247, TryCatch #3 {Exception -> 0x0247, blocks: (B:11:0x0030, B:12:0x0244, B:22:0x0222, B:27:0x0219, B:29:0x021f), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3801o(String str, AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        re6 re6Var;
        int i;
        int i2;
        boolean z;
        a91 m1876a;
        int i3;
        String str2;
        int i4;
        int i5;
        String str3;
        int i6;
        a4b a4bVar = this.f6333n0;
        if (za2Var instanceof re6) {
            re6Var = (re6) za2Var;
            int i7 = re6Var.f36561B;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                re6Var.f36561B = i7 - Integer.MIN_VALUE;
                Object obj = re6Var.f36567z;
                i = re6Var.f36561B;
                byte b = 0;
                xa2 xa2Var = null;
                Object obj2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    try {
                        je6 je6Var = this.f6328i0;
                        if (je6Var == null) {
                            return Boolean.FALSE;
                        }
                        i2 = (!je6Var.m11270H() || ((tv0) this.f6314U.getValue()).m19142i()) ? 0 : 1;
                        int i8 = (je6Var.m11281k() && je6Var.m11269G()) ? 1 : 0;
                        if (i2 == 0 && i8 == 0) {
                            return Boolean.FALSE;
                        }
                        int i9 = je6Var.m11293w() == zbb.ALLOWLIST ? 1 : 0;
                        Set m11291u = i9 != 0 ? je6Var.m11291u() : je6Var.m11292v();
                        String m3792c = m3792c(accessibilityNodeInfo.getWindowId(), str, i9 != 0 ? "site_allow" : "site_block");
                        Boolean m3776f = i2 != 0 ? m3776f(this, m3792c, 6) : null;
                        if (m3776f != null) {
                            z = m3776f.booleanValue();
                        } else {
                            try {
                                List m8530G = gd7.m8530G(accessibilityNodeInfo);
                                a4bVar.m98b();
                                if (v20.m20278v()) {
                                    m8530G.toString();
                                }
                                d3d m12014d = i2 != 0 ? ke7.m12014d(m8530G, je6Var.m11293w(), m11291u) : null;
                                if (i2 != 0) {
                                    m3775d(this, m3792c, m12014d != null);
                                }
                                if (i8 != 0 && (m1876a = bcb.m1876a(m8530G, m12014d)) != null) {
                                    v20.m20278v();
                                    ((xcb) this.f6343y.getValue()).m22018f(str, m1876a.m243c(), m1876a.m242b(), m1876a.m241a());
                                    a4bVar.m100d();
                                }
                                if (m12014d != null) {
                                    z = true;
                                }
                            } catch (Exception unused) {
                            }
                            z = false;
                        }
                        i3 = z;
                        if (i3 == 0) {
                            return Boolean.FALSE;
                        }
                        m3807u();
                        switch (str.hashCode()) {
                            case -1749741528:
                                if (str.equals("com.ecosia.android")) {
                                    str2 = "Ecosia";
                                    break;
                                }
                                str2 = "Browser";
                                break;
                            case -1558804004:
                                if (!str.equals("org.mozilla.rocket")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Firefox Lite";
                                    break;
                                }
                            case -898527731:
                                if (!str.equals("com.brave.browser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Brave";
                                    break;
                                }
                            case -799609658:
                                if (!str.equals("com.opera.mini.native")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Opera Mini";
                                    break;
                                }
                            case -487636640:
                                if (!str.equals("com.microsoft.emmx")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Edge";
                                    break;
                                }
                            case 152101472:
                                if (!str.equals("com.opera.browser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Opera";
                                    break;
                                }
                            case 256457446:
                                if (!str.equals("com.android.chrome")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Chrome";
                                    break;
                                }
                            case 361140723:
                                if (!str.equals("org.torproject.torbrowser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Tor Browser";
                                    break;
                                }
                            case 501643778:
                                if (!str.equals("com.instantbits.cast.webvideo")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Web Video Cast";
                                    break;
                                }
                            case 640747243:
                                if (!str.equals("com.sec.android.app.sbrowser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Samsung Browser";
                                    break;
                                }
                            case 935438925:
                                if (!str.equals("com.hsv.freeadblockerbrowser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "AdBlocker Browser";
                                    break;
                                }
                            case 998473937:
                                if (!str.equals("org.mozilla.firefox")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Firefox";
                                    break;
                                }
                            case 1277915094:
                                if (!str.equals("io.kahf.browser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Kahf Browser";
                                    break;
                                }
                            case 1328541280:
                                if (!str.equals("com.vivaldi.browser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Vivaldi";
                                    break;
                                }
                            case 1568680458:
                                if (!str.equals("com.duckduckgo.mobile.android")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "DuckDuckGo";
                                    break;
                                }
                            case 1624076716:
                                if (!str.equals("com.nationaledtech.spinbrowser")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "Spin Browser";
                                    break;
                                }
                            case 2090922776:
                                if (!str.equals("idm.internet.download.manager")) {
                                    str2 = "Browser";
                                    break;
                                } else {
                                    str2 = "1DM Browser";
                                    break;
                                }
                            default:
                                str2 = "Browser";
                                break;
                        }
                        String str4 = str2;
                        try {
                            re6Var.f36562u = str4;
                            re6Var.f36563v = i2;
                            re6Var.f36564w = i8;
                            re6Var.f36565x = i9;
                            re6Var.f36566y = i3;
                            re6Var.f36561B = 1;
                            if (m3782E(str4, "site", "__SITE_BLOCKING__", re6Var) != obj2) {
                                i4 = i8;
                                i5 = i9;
                                str3 = str4;
                                i6 = i3;
                            }
                        } catch (Exception e) {
                            e = e;
                            i4 = i8;
                            i5 = i9;
                            str3 = str4;
                            i6 = i3;
                            if (v20.m20278v()) {
                            }
                            m3786I();
                            vu2 vu2Var = k83.f21845a;
                            n75 n75Var = h57.f15547a.f27744y;
                            se6 se6Var = new se6(this, xa2Var, b);
                            re6Var.f36562u = str3;
                            re6Var.f36563v = i2;
                            re6Var.f36564w = i4;
                            re6Var.f36565x = i5;
                            re6Var.f36566y = i6;
                            re6Var.f36561B = 2;
                        }
                        return obj2;
                    } catch (Exception unused2) {
                        return Boolean.FALSE;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                    v20.m20278v();
                    return Boolean.TRUE;
                }
                i3 = re6Var.f36566y;
                i5 = re6Var.f36565x;
                i4 = re6Var.f36564w;
                i2 = re6Var.f36563v;
                str3 = re6Var.f36562u;
                try {
                    v11.m20244z(obj);
                    i6 = i3;
                } catch (Exception e2) {
                    e = e2;
                    i6 = i3;
                    if (v20.m20278v()) {
                        e.getMessage();
                        i6 = i3;
                    }
                    m3786I();
                    vu2 vu2Var2 = k83.f21845a;
                    n75 n75Var2 = h57.f15547a.f27744y;
                    se6 se6Var2 = new se6(this, xa2Var, b);
                    re6Var.f36562u = str3;
                    re6Var.f36563v = i2;
                    re6Var.f36564w = i4;
                    re6Var.f36565x = i5;
                    re6Var.f36566y = i6;
                    re6Var.f36561B = 2;
                }
                m3786I();
                vu2 vu2Var22 = k83.f21845a;
                n75 n75Var22 = h57.f15547a.f27744y;
                se6 se6Var22 = new se6(this, xa2Var, b);
                re6Var.f36562u = str3;
                re6Var.f36563v = i2;
                re6Var.f36564w = i4;
                re6Var.f36565x = i5;
                re6Var.f36566y = i6;
                re6Var.f36561B = 2;
            }
        }
        re6Var = new re6(this, za2Var);
        Object obj3 = re6Var.f36567z;
        i = re6Var.f36561B;
        byte b2 = 0;
        xa2 xa2Var2 = null;
        Object obj22 = qc2.f34309u;
        if (i != 0) {
        }
        m3786I();
        vu2 vu2Var222 = k83.f21845a;
        n75 n75Var222 = h57.f15547a.f27744y;
        se6 se6Var222 = new se6(this, xa2Var2, b2);
        re6Var.f36562u = str3;
        re6Var.f36563v = i2;
        re6Var.f36564w = i4;
        re6Var.f36565x = i5;
        re6Var.f36566y = i6;
        re6Var.f36561B = 2;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String obj;
        int contentChangeTypes;
        if (accessibilityEvent == null) {
            return;
        }
        a4b a4bVar = this.f6333n0;
        CharSequence packageName = accessibilityEvent.getPackageName();
        a4bVar.m99c(packageName != null ? packageName.toString() : null);
        je6 je6Var = this.f6328i0;
        if (je6Var == null || !je6Var.m11268F()) {
            return;
        }
        int eventType = accessibilityEvent.getEventType();
        CharSequence packageName2 = accessibilityEvent.getPackageName();
        if (packageName2 == null || (obj = packageName2.toString()) == null || obj.equals(getPackageName()) || !u03.m19245q()) {
            return;
        }
        if (eventType == 32 && m3796j().m17414e(obj)) {
            this.f6321b0.mo8233c(obj);
        }
        if (eventType == 32) {
            String str = this.f6335p0;
            if (!zy5.m23838d(str, obj)) {
                this.f6335p0 = obj;
                if (str != null && je6Var.m11281k() && f6290v0.contains(str)) {
                    ((xcb) this.f6343y.getValue()).m22017e(str);
                }
            }
        }
        if (ke7.m12020k(this.f6315V.mo12142c() && ((jv0) this.f6315V.getValue()).m11585d(), obj, f6293y0)) {
            return;
        }
        if (obj.equals("com.android.vending") && je6Var.m11295y() && (eventType == 32 || eventType == 2048)) {
            if (eventType == 2048 && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0 && (contentChangeTypes & 7) == 0) {
                return;
            }
            this.f6320a0.mo8233c(new ne6(obj));
            return;
        }
        if (eventType != 2048) {
            return;
        }
        int contentChangeTypes2 = accessibilityEvent.getContentChangeTypes();
        if ((contentChangeTypes2 == 0 || (contentChangeTypes2 & 7) != 0) && this.f6302I.contains(obj)) {
            this.f6320a0.mo8233c(new ne6(obj));
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C0381gl c0381gl = v20.f43603j;
        if (c0381gl != null) {
            c0381gl.invoke();
        }
        oc0.m14951O(this);
        m3798l().registerOnSharedPreferenceChangeListener(this.f6331l0);
        m3789L();
        jzd.m11709o(this.f6319Z, null, null, new we6(this, null, (byte) 1), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        muc.m13775k(this.f6319Z, null);
        ((xcb) this.f6343y.getValue()).m22019g();
        m3798l().unregisterOnSharedPreferenceChangeListener(this.f6331l0);
        lf6 lf6Var = this.f6307N;
        if (lf6Var != null) {
            try {
                unregisterReceiver(lf6Var);
            } catch (Exception e) {
                if (v20.m20278v()) {
                    e.getMessage();
                }
            }
            this.f6307N = null;
        }
        lf6 lf6Var2 = this.f6330k0;
        if (lf6Var2 != null) {
            try {
                unregisterReceiver(lf6Var2);
            } catch (Exception e2) {
                if (v20.m20278v()) {
                    e2.getMessage();
                }
            }
            this.f6330k0 = null;
        }
        ((ti9) this.f6294A.getValue()).m18835b();
        oc0.m14962j();
        this.f6296C.evictAll();
        this.f6297D.evictAll();
        try {
            ((jv0) this.f6315V.getValue()).m11583b();
        } catch (Exception e3) {
            if (v20.m20278v()) {
                e3.getMessage();
            }
        }
        if (this.f6323d0.mo12142c()) {
            try {
                m3796j().m17410a();
            } catch (Exception e4) {
                if (v20.m20278v()) {
                    e4.getMessage();
                }
            }
        }
        try {
            m3799m().m106c();
        } catch (Exception e5) {
            if (v20.m20278v()) {
                e5.getMessage();
            }
        }
        try {
            ((tv0) this.f6314U.getValue()).m19139c();
        } catch (Exception e6) {
            if (v20.m20278v()) {
                e6.getMessage();
            }
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
        if (this.f6323d0.mo12142c()) {
            try {
                m3796j().m17413d();
            } catch (Exception e) {
                if (v20.m20278v()) {
                    e.getMessage();
                }
            }
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        r2c r2cVar = this.f6315V;
        if (r2cVar.mo12142c()) {
            ((jv0) r2cVar.getValue()).m11586e();
        }
        m3791b();
        if (v20.m20278v()) {
            getServiceInfo();
            getServiceInfo();
        }
        xa2 xa2Var = null;
        we6 we6Var = new we6(this, xa2Var, (byte) 2);
        qa2 qa2Var = this.f6319Z;
        jzd.m11709o(qa2Var, null, null, we6Var, 3);
        jzd.m11709o(qa2Var, null, null, new we6(this, xa2Var, (byte) 3), 3);
        jzd.m11709o(qa2Var, null, null, new we6(this, xa2Var, (byte) 4), 3);
        byte b = 5;
        if (!f6288t0.isEmpty()) {
            jzd.m11709o(qa2Var, null, null, new we6(this, xa2Var, b), 3);
        }
        jzd.m11709o(qa2Var, null, null, new se6(this, xa2Var, b), 3);
        byte b2 = 6;
        jzd.m11709o(qa2Var, null, null, new we6(this, xa2Var, b2), 3);
        jzd.m11709o(qa2Var, null, null, new we6(this, xa2Var, (byte) 7), 3);
        try {
            m3799m().m117o();
            m3812z();
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
        try {
            ((oi4) ((mta) ((d4b) jh6.m11341a().f8644c).f7326y).m13737e(d0a.m5838a(oi4.class), null, null)).m15110c(qa2Var);
        } catch (Exception e2) {
            if (v20.m20278v()) {
                e2.getMessage();
            }
        }
        if (this.f6330k0 == null) {
            lf6 lf6Var = new lf6(this, (byte) 0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter.addDataScheme("package");
            try {
                zy5.m23854u(this, lf6Var, intentFilter, null, 4);
                this.f6330k0 = lf6Var;
            } catch (Exception e3) {
                if (v20.m20278v()) {
                    e3.getMessage();
                }
            }
        }
        jzd.m11709o(qa2Var, null, null, new se6(this, xa2Var, b2), 3);
        ((ti9) this.f6294A.getValue()).m18834a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|17|18)(2:20|21))(4:22|23|24|25))(4:36|37|38|(2:40|41)(4:42|43|44|(2:51|52)(2:53|(2:55|56)(3:57|(2:59|60)(2:102|103)|(8:62|63|66|67|68|69|(1:71)|28)(2:100|101)))))|26|(5:29|13|(0)|17|18)|28))|131|6|7|(0)(0)|26|(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b1, code lost:
    
        if (r2.equals("com.whatsapp.w4b") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0135, code lost:
    
        if (r2.equals("com.whatsapp.w4b") == false) goto L101;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0187 A[Catch: Exception -> 0x018a, TRY_LEAVE, TryCatch #3 {Exception -> 0x018a, blocks: (B:12:0x0031, B:13:0x0181, B:15:0x0187, B:26:0x0160, B:33:0x0157, B:35:0x015d), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015d A[Catch: Exception -> 0x018a, TryCatch #3 {Exception -> 0x018a, blocks: (B:12:0x0031, B:13:0x0181, B:15:0x0187, B:26:0x0160, B:33:0x0157, B:35:0x015d), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.kahf.dns.features.guards.service.KahfBlockerService] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3802p(String str, AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        te6 te6Var;
        int i;
        qc2 qc2Var;
        ?? r4;
        boolean m11267E;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        int i2;
        ?? r5;
        int i3;
        n75 n75Var;
        ue6 ue6Var;
        String str4;
        String str5 = str;
        if (za2Var instanceof te6) {
            te6Var = (te6) za2Var;
            int i4 = te6Var.f40265A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                te6Var.f40265A = i4 - Integer.MIN_VALUE;
                Object obj = te6Var.f40270y;
                i = te6Var.f40265A;
                qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    try {
                        je6 je6Var = this.f6328i0;
                        if (je6Var == null) {
                            return Boolean.FALSE;
                        }
                        switch (str5.hashCode()) {
                            case -2103713194:
                                break;
                            case -2075712516:
                                if (!str5.equals("com.google.android.youtube")) {
                                    r4 = 0;
                                    break;
                                } else {
                                    m11267E = je6Var.m11267E();
                                    r4 = m11267E;
                                    break;
                                }
                            case -1897170512:
                                if (!str5.equals("org.telegram.messenger")) {
                                    r4 = 0;
                                    break;
                                } else {
                                    m11267E = je6Var.m11296z();
                                    r4 = m11267E;
                                    break;
                                }
                            case -1547699361:
                                if (!str5.equals("com.whatsapp")) {
                                    r4 = 0;
                                    break;
                                }
                                m11267E = je6Var.m11266D();
                                r4 = m11267E;
                                break;
                            case -662003450:
                                if (!str5.equals("com.instagram.android")) {
                                    r4 = 0;
                                    break;
                                } else {
                                    m11267E = je6Var.m11285o();
                                    r4 = m11267E;
                                    break;
                                }
                            case 714499313:
                                if (!str5.equals("com.facebook.katana")) {
                                    r4 = 0;
                                    break;
                                }
                                m11267E = je6Var.m11282l();
                                r4 = m11267E;
                                break;
                            case 908042537:
                                if (!str5.equals("com.facebook.lite")) {
                                    r4 = 0;
                                    break;
                                }
                                m11267E = je6Var.m11282l();
                                r4 = m11267E;
                                break;
                            default:
                                r4 = 0;
                                break;
                        }
                        if (r4 == 0) {
                            return Boolean.FALSE;
                        }
                        if (((tv0) this.f6314U.getValue()).m19141f(str5, true)) {
                            return Boolean.FALSE;
                        }
                        String m3792c = m3792c(accessibilityNodeInfo.getWindowId(), str5, "social");
                        Boolean m3776f = m3776f(this, m3792c, 6);
                        if (m3776f != null) {
                            z = m3776f.booleanValue();
                        } else {
                            try {
                                boolean m9468o = hge.m9468o(str, accessibilityNodeInfo);
                                m3775d(this, m3792c, m9468o);
                                z = m9468o;
                            } catch (Exception unused) {
                                z = false;
                            }
                        }
                        if (!z) {
                            return Boolean.FALSE;
                        }
                        switch (str5.hashCode()) {
                            case -2103713194:
                                break;
                            case -2075712516:
                                if (!str5.equals("com.google.android.youtube")) {
                                    str2 = "Social content";
                                    break;
                                } else {
                                    str2 = "YouTube Shorts";
                                    break;
                                }
                            case -1897170512:
                                if (!str5.equals("org.telegram.messenger")) {
                                    str2 = "Social content";
                                    break;
                                } else {
                                    str2 = "Telegram Search";
                                    break;
                                }
                            case -1547699361:
                                if (!str5.equals("com.whatsapp")) {
                                    str2 = "Social content";
                                    break;
                                }
                                str2 = "WhatsApp Status";
                                break;
                            case -662003450:
                                if (!str5.equals("com.instagram.android")) {
                                    str2 = "Social content";
                                    break;
                                } else {
                                    str2 = "Instagram Reels";
                                    break;
                                }
                            case 714499313:
                                if (!str5.equals("com.facebook.katana")) {
                                    str2 = "Social content";
                                    break;
                                }
                                str2 = "Facebook Reels";
                                break;
                            case 908042537:
                                if (!str5.equals("com.facebook.lite")) {
                                    str2 = "Social content";
                                    break;
                                }
                                str2 = "Facebook Reels";
                                break;
                            default:
                                str2 = "Social content";
                                break;
                        }
                        String str6 = str2;
                        m3806t(str);
                        try {
                            te6Var.f40266u = str5;
                            te6Var.f40267v = str6;
                            te6Var.f40268w = r4;
                            te6Var.f40269x = z ? 1 : 0;
                            te6Var.f40265A = 1;
                            if (m3782E(str6, "content", str5, te6Var) != qc2Var) {
                                str3 = str6;
                                i3 = r4;
                                r5 = z;
                            }
                        } catch (Exception e) {
                            e = e;
                            str3 = str6;
                            i2 = r4;
                            z2 = z;
                            i3 = i2;
                            r5 = z2;
                            if (v20.m20278v()) {
                            }
                            m3786I();
                            vu2 vu2Var = k83.f21845a;
                            n75Var = h57.f15547a.f27744y;
                            ue6Var = new ue6(this, str5, null);
                            te6Var.f40266u = str5;
                            te6Var.f40267v = str3;
                            te6Var.f40268w = i3;
                            te6Var.f40269x = r5;
                            te6Var.f40265A = 2;
                            if (jzd.m11694F(n75Var, ue6Var, te6Var) != qc2Var) {
                            }
                            return qc2Var;
                        }
                        return qc2Var;
                    } catch (Exception unused2) {
                        return Boolean.FALSE;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = te6Var.f40266u;
                    v11.m20244z(obj);
                    if (v20.m20278v()) {
                        zy5.m23838d(str4, "org.telegram.messenger");
                    }
                    return Boolean.TRUE;
                }
                ?? r2 = te6Var.f40269x;
                int i5 = te6Var.f40268w;
                str3 = te6Var.f40267v;
                String str7 = te6Var.f40266u;
                try {
                    v11.m20244z(obj);
                    r5 = r2;
                    str5 = str7;
                    i3 = i5;
                } catch (Exception e2) {
                    e = e2;
                    z2 = r2;
                    str5 = str7;
                    i2 = i5;
                    i3 = i2;
                    r5 = z2;
                    if (v20.m20278v()) {
                        e.getMessage();
                        i3 = i2;
                        r5 = z2;
                    }
                    m3786I();
                    vu2 vu2Var2 = k83.f21845a;
                    n75Var = h57.f15547a.f27744y;
                    ue6Var = new ue6(this, str5, null);
                    te6Var.f40266u = str5;
                    te6Var.f40267v = str3;
                    te6Var.f40268w = i3;
                    te6Var.f40269x = r5;
                    te6Var.f40265A = 2;
                    if (jzd.m11694F(n75Var, ue6Var, te6Var) != qc2Var) {
                    }
                    return qc2Var;
                }
                m3786I();
                vu2 vu2Var22 = k83.f21845a;
                n75Var = h57.f15547a.f27744y;
                ue6Var = new ue6(this, str5, null);
                te6Var.f40266u = str5;
                te6Var.f40267v = str3;
                te6Var.f40268w = i3;
                te6Var.f40269x = r5;
                te6Var.f40265A = 2;
                if (jzd.m11694F(n75Var, ue6Var, te6Var) != qc2Var) {
                    str4 = str5;
                    if (v20.m20278v()) {
                    }
                    return Boolean.TRUE;
                }
                return qc2Var;
            }
        }
        te6Var = new te6(this, za2Var);
        Object obj2 = te6Var.f40270y;
        i = te6Var.f40265A;
        qc2Var = qc2.f34309u;
        if (i != 0) {
        }
        m3786I();
        vu2 vu2Var222 = k83.f21845a;
        n75Var = h57.f15547a.f27744y;
        ue6Var = new ue6(this, str5, null);
        te6Var.f40266u = str5;
        te6Var.f40267v = str3;
        te6Var.f40268w = i3;
        te6Var.f40269x = r5;
        te6Var.f40265A = 2;
        if (jzd.m11694F(n75Var, ue6Var, te6Var) != qc2Var) {
        }
        return qc2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:111|112|(4:114|115|116|(4:118|86|(1:110)(1:89)|(4:91|92|93|(7:95|(1:97)(1:106)|98|99|100|(1:102)|25)(2:107|(4:38|39|40|(0)))))(1:119))(1:135)|120|121|(1:(1:131))(1:125)|86|(0)|110|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:18|19))(4:20|21|22|23))(7:31|32|33|34|35|(4:38|39|40|(6:42|43|44|45|(2:47|23)|25))|15))(4:53|54|55|56))(4:68|69|(11:75|(1:77)(1:139)|78|79|(1:138)(1:83)|(10:111|112|(4:114|115|116|(4:118|86|(1:110)(1:89)|(4:91|92|93|(7:95|(1:97)(1:106)|98|99|100|(1:102)|25)(2:107|(4:38|39|40|(0)))))(1:119))(1:135)|120|121|(1:(1:131))(1:125)|86|(0)|110|(0))|85|86|(0)|110|(0))|15)|57|58|(2:60|25)(5:61|34|35|(0)|15)))|141|6|7|(0)(0)|57|58|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00e7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0215, code lost:
    
        if (p000.jzd.m11694F(r0, r12, r3) == r4) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f1 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:13:0x0035, B:14:0x0218, B:23:0x01f4, B:28:0x01eb, B:30:0x01f1, B:32:0x0063, B:34:0x019d, B:42:0x01bc, B:58:0x016a, B:65:0x0161, B:67:0x0167, B:69:0x0091, B:72:0x0097, B:75:0x009f, B:77:0x00ab, B:78:0x00b5, B:86:0x010b, B:95:0x0120), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bc A[Catch: Exception -> 0x021b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x021b, blocks: (B:13:0x0035, B:14:0x0218, B:23:0x01f4, B:28:0x01eb, B:30:0x01f1, B:32:0x0063, B:34:0x019d, B:42:0x01bc, B:58:0x016a, B:65:0x0161, B:67:0x0167, B:69:0x0091, B:72:0x0097, B:75:0x009f, B:77:0x00ab, B:78:0x00b5, B:86:0x010b, B:95:0x0120), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167 A[Catch: Exception -> 0x021b, TryCatch #2 {Exception -> 0x021b, blocks: (B:13:0x0035, B:14:0x0218, B:23:0x01f4, B:28:0x01eb, B:30:0x01f1, B:32:0x0063, B:34:0x019d, B:42:0x01bc, B:58:0x016a, B:65:0x0161, B:67:0x0167, B:69:0x0091, B:72:0x0097, B:75:0x009f, B:77:0x00ab, B:78:0x00b5, B:86:0x010b, B:95:0x0120), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3803q(AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        ve6 ve6Var;
        Object obj;
        int i;
        long elapsedRealtime;
        String str;
        int i2;
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        long j3;
        int i8;
        long j4;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        n75 n75Var;
        we6 we6Var;
        int i9;
        int i10;
        long j5;
        int i11;
        int i12;
        int i13;
        txc txcVar = txc.f41359a;
        if (za2Var instanceof ve6) {
            ve6Var = (ve6) za2Var;
            int i14 = ve6Var.f44282D;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ve6Var.f44282D = i14 - Integer.MIN_VALUE;
                Object obj2 = ve6Var.f44280B;
                obj = qc2.f34309u;
                i = ve6Var.f44282D;
                byte b = 1;
                if (i != 0) {
                    v11.m20244z(obj2);
                    je6 je6Var = this.f6328i0;
                    if (je6Var != null && je6Var.m11295y()) {
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        long j6 = this.f6311R > 0 ? elapsedRealtime - this.f6311R : Long.MAX_VALUE;
                        int i15 = (this.f6311R <= 0 || j6 >= 120000) ? 0 : 1;
                        if (i15 == 0) {
                            if (this.f6309P) {
                                str = "Safety Protection Active";
                                if (elapsedRealtime - this.f6310Q < 30000) {
                                    this.f6310Q = elapsedRealtime;
                                    i2 = (this.f6309P && i15 == 0) ? 0 : 1;
                                    if (i2 != 0) {
                                        try {
                                            i3 = hge.m9466m(accessibilityNodeInfo) ? 1 : 0;
                                        } catch (Exception unused) {
                                            i3 = 0;
                                        }
                                        if (i3 != 0) {
                                            this.f6311R = elapsedRealtime;
                                            m3794g(new Integer(accessibilityNodeInfo.getWindowId()));
                                            m3807u();
                                            String str2 = i15 != 0 ? str : "Play Store Uninstall";
                                            accessibilityNodeInfo2 = accessibilityNodeInfo;
                                            try {
                                                ve6Var.f44283u = accessibilityNodeInfo2;
                                                ve6Var.f44284v = elapsedRealtime;
                                                ve6Var.f44285w = j6;
                                                ve6Var.f44286x = i15;
                                                ve6Var.f44287y = i2;
                                                ve6Var.f44288z = i3;
                                                ve6Var.f44282D = 1;
                                                if (m3783F(str2, ve6Var) != obj) {
                                                    j4 = j6;
                                                    i7 = i15;
                                                    i8 = i2;
                                                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                i7 = i15;
                                                j3 = j6;
                                                i8 = i2;
                                                if (v20.m20278v()) {
                                                    e.getMessage();
                                                }
                                                vu2 vu2Var = k83.f21845a;
                                                n75Var = h57.f15547a.f27744y;
                                                long j7 = j3;
                                                we6Var = new we6(this, null, (byte) 0);
                                                ve6Var.f44283u = accessibilityNodeInfo2;
                                                ve6Var.f44284v = elapsedRealtime;
                                                ve6Var.f44285w = j7;
                                                ve6Var.f44286x = i7;
                                                ve6Var.f44287y = i8;
                                                ve6Var.f44288z = i3;
                                                ve6Var.f44282D = 2;
                                                if (jzd.m11694F(n75Var, we6Var, ve6Var) != obj) {
                                                }
                                            }
                                            return obj;
                                        }
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i4 = i2;
                                        i5 = i3;
                                        i6 = i15;
                                        j = j6;
                                        j2 = elapsedRealtime;
                                        if (i5 == 0) {
                                            i11 = hge.m9465l(accessibilityNodeInfo2) ? 1 : 0;
                                            if (i11 != 0) {
                                            }
                                        }
                                    }
                                } else {
                                    this.f6309P = false;
                                    this.f6310Q = 0L;
                                }
                            } else {
                                str = "Safety Protection Active";
                            }
                            boolean z = hge.m9465l(accessibilityNodeInfo);
                            if (z && !this.f6309P) {
                                this.f6309P = true;
                                this.f6310Q = elapsedRealtime;
                            } else if (!z && this.f6309P && elapsedRealtime - this.f6310Q > 5000) {
                                this.f6309P = false;
                                this.f6310Q = 0L;
                            }
                            if (this.f6309P) {
                            }
                            if (i2 != 0) {
                            }
                        }
                        str = "Safety Protection Active";
                        if (this.f6309P) {
                        }
                        if (i2 != 0) {
                        }
                    }
                    return txcVar;
                }
                if (i == 1) {
                    int i16 = ve6Var.f44288z;
                    i8 = ve6Var.f44287y;
                    i7 = ve6Var.f44286x;
                    long j8 = ve6Var.f44285w;
                    elapsedRealtime = ve6Var.f44284v;
                    accessibilityNodeInfo3 = ve6Var.f44283u;
                    try {
                        v11.m20244z(obj2);
                        i3 = i16;
                        str = "Safety Protection Active";
                        j4 = j8;
                    } catch (Exception e2) {
                        e = e2;
                        i3 = i16;
                        str = "Safety Protection Active";
                        accessibilityNodeInfo2 = accessibilityNodeInfo3;
                        j3 = j8;
                        if (v20.m20278v()) {
                        }
                        vu2 vu2Var2 = k83.f21845a;
                        n75Var = h57.f15547a.f27744y;
                        long j72 = j3;
                        we6Var = new we6(this, null, (byte) 0);
                        ve6Var.f44283u = accessibilityNodeInfo2;
                        ve6Var.f44284v = elapsedRealtime;
                        ve6Var.f44285w = j72;
                        ve6Var.f44286x = i7;
                        ve6Var.f44287y = i8;
                        ve6Var.f44288z = i3;
                        ve6Var.f44282D = 2;
                        if (jzd.m11694F(n75Var, we6Var, ve6Var) != obj) {
                        }
                    }
                } else {
                    if (i == 2) {
                        i10 = ve6Var.f44288z;
                        i8 = ve6Var.f44287y;
                        int i17 = ve6Var.f44286x;
                        j = ve6Var.f44285w;
                        j5 = ve6Var.f44284v;
                        AccessibilityNodeInfo accessibilityNodeInfo4 = ve6Var.f44283u;
                        v11.m20244z(obj2);
                        i9 = i17;
                        str = "Safety Protection Active";
                        accessibilityNodeInfo2 = accessibilityNodeInfo4;
                        m3786I();
                        i5 = i10;
                        i4 = i8;
                        j2 = j5;
                        i6 = i9;
                        if (i5 == 0 && i6 != 0) {
                            try {
                                i11 = hge.m9465l(accessibilityNodeInfo2) ? 1 : 0;
                            } catch (Exception unused2) {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                this.f6311R = j2;
                                m3794g(new Integer(accessibilityNodeInfo2.getWindowId()));
                                try {
                                    ve6Var.f44283u = null;
                                    ve6Var.f44284v = j2;
                                    ve6Var.f44285w = j;
                                    ve6Var.f44286x = i6;
                                    ve6Var.f44287y = i4;
                                    ve6Var.f44288z = i5;
                                    ve6Var.f44279A = i11;
                                    ve6Var.f44282D = 3;
                                } catch (Exception e3) {
                                    e = e3;
                                    i12 = i4;
                                    i13 = i11;
                                    if (v20.m20278v()) {
                                        e.getMessage();
                                    }
                                    vu2 vu2Var3 = k83.f21845a;
                                    n75 n75Var2 = h57.f15547a.f27744y;
                                    se6 se6Var = new se6(this, null, b);
                                    ve6Var.f44283u = null;
                                    ve6Var.f44284v = j2;
                                    ve6Var.f44285w = j;
                                    ve6Var.f44286x = i6;
                                    ve6Var.f44287y = i12;
                                    ve6Var.f44288z = i5;
                                    ve6Var.f44279A = i13;
                                    ve6Var.f44282D = 4;
                                }
                                if (m3783F(str, ve6Var) != obj) {
                                    i12 = i4;
                                    i13 = i11;
                                    vu2 vu2Var32 = k83.f21845a;
                                    n75 n75Var22 = h57.f15547a.f27744y;
                                    se6 se6Var2 = new se6(this, null, b);
                                    ve6Var.f44283u = null;
                                    ve6Var.f44284v = j2;
                                    ve6Var.f44285w = j;
                                    ve6Var.f44286x = i6;
                                    ve6Var.f44287y = i12;
                                    ve6Var.f44288z = i5;
                                    ve6Var.f44279A = i13;
                                    ve6Var.f44282D = 4;
                                }
                                return obj;
                            }
                        }
                        return txcVar;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj2);
                        m3786I();
                        return txcVar;
                    }
                    i13 = ve6Var.f44279A;
                    i5 = ve6Var.f44288z;
                    int i18 = ve6Var.f44287y;
                    i6 = ve6Var.f44286x;
                    j = ve6Var.f44285w;
                    i12 = i18;
                    j2 = ve6Var.f44284v;
                    try {
                        v11.m20244z(obj2);
                    } catch (Exception e4) {
                        e = e4;
                        if (v20.m20278v()) {
                        }
                        vu2 vu2Var322 = k83.f21845a;
                        n75 n75Var222 = h57.f15547a.f27744y;
                        se6 se6Var22 = new se6(this, null, b);
                        ve6Var.f44283u = null;
                        ve6Var.f44284v = j2;
                        ve6Var.f44285w = j;
                        ve6Var.f44286x = i6;
                        ve6Var.f44287y = i12;
                        ve6Var.f44288z = i5;
                        ve6Var.f44279A = i13;
                        ve6Var.f44282D = 4;
                    }
                    vu2 vu2Var3222 = k83.f21845a;
                    n75 n75Var2222 = h57.f15547a.f27744y;
                    se6 se6Var222 = new se6(this, null, b);
                    ve6Var.f44283u = null;
                    ve6Var.f44284v = j2;
                    ve6Var.f44285w = j;
                    ve6Var.f44286x = i6;
                    ve6Var.f44287y = i12;
                    ve6Var.f44288z = i5;
                    ve6Var.f44279A = i13;
                    ve6Var.f44282D = 4;
                }
                accessibilityNodeInfo2 = accessibilityNodeInfo3;
                j3 = j4;
                vu2 vu2Var22 = k83.f21845a;
                n75Var = h57.f15547a.f27744y;
                long j722 = j3;
                we6Var = new we6(this, null, (byte) 0);
                ve6Var.f44283u = accessibilityNodeInfo2;
                ve6Var.f44284v = elapsedRealtime;
                ve6Var.f44285w = j722;
                ve6Var.f44286x = i7;
                ve6Var.f44287y = i8;
                ve6Var.f44288z = i3;
                ve6Var.f44282D = 2;
                if (jzd.m11694F(n75Var, we6Var, ve6Var) != obj) {
                    return obj;
                }
                i9 = i7;
                i10 = i3;
                j5 = elapsedRealtime;
                j = j722;
                m3786I();
                i5 = i10;
                i4 = i8;
                j2 = j5;
                i6 = i9;
                if (i5 == 0) {
                }
                return txcVar;
            }
        }
        ve6Var = new ve6(this, za2Var);
        Object obj22 = ve6Var.f44280B;
        obj = qc2.f34309u;
        i = ve6Var.f44282D;
        byte b2 = 1;
        if (i != 0) {
        }
        accessibilityNodeInfo2 = accessibilityNodeInfo3;
        j3 = j4;
        vu2 vu2Var222 = k83.f21845a;
        n75Var = h57.f15547a.f27744y;
        long j7222 = j3;
        we6Var = new we6(this, null, (byte) 0);
        ve6Var.f44283u = accessibilityNodeInfo2;
        ve6Var.f44284v = elapsedRealtime;
        ve6Var.f44285w = j7222;
        ve6Var.f44286x = i7;
        ve6Var.f44287y = i8;
        ve6Var.f44288z = i3;
        ve6Var.f44282D = 2;
        if (jzd.m11694F(n75Var, we6Var, ve6Var) != obj) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:42|(1:44)(1:94)|(1:46)(1:93)|47|(1:49)(1:92)|(1:51)|(4:54|55|(3:83|84|85)|(5:78|79|80|59|(6:64|(1:(1:76)(1:77))(1:67)|68|69|(1:71)|22)(2:62|63)))|58|59|(0)|64|(0)|(0)(0)|68|69|(0)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0126, code lost:
    
        if (p000.jzd.m11694F(r15, r7, r0) == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0104, code lost:
    
        r15.getMessage();
        r13 = r13;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r1 = r15;
        r15 = r3;
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x0027, B:12:0x0129, B:20:0x0107, B:25:0x00fe, B:27:0x0104, B:29:0x0047, B:31:0x004b, B:33:0x004e, B:36:0x005a, B:38:0x005d, B:40:0x0065, B:42:0x0068, B:44:0x007e, B:46:0x0086, B:49:0x008f, B:51:0x0097, B:62:0x00cf, B:64:0x00d2), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3805s(String str, AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        ye6 ye6Var;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        boolean z2;
        boolean booleanValue;
        int i4;
        int i5;
        try {
            if (za2Var instanceof ye6) {
                ye6Var = (ye6) za2Var;
                int i6 = ye6Var.f50339B;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    ye6Var.f50339B = i6 - Integer.MIN_VALUE;
                    Object obj = ye6Var.f50345z;
                    i = ye6Var.f50339B;
                    xa2 xa2Var = null;
                    Object obj2 = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        je6 je6Var = this.f6328i0;
                        if (je6Var == null) {
                            return Boolean.FALSE;
                        }
                        boolean m11295y = je6Var.m11295y();
                        boolean m11294x = je6Var.m11294x();
                        if (!m11295y && !m11294x) {
                            return Boolean.FALSE;
                        }
                        if (zy5.m23838d(str, "com.android.vending")) {
                            return Boolean.FALSE;
                        }
                        String m3792c = m3792c(accessibilityNodeInfo.getWindowId(), str, "uninstall");
                        String m3792c2 = m3792c(accessibilityNodeInfo.getWindowId(), str, "dns");
                        Boolean m3776f = m11295y ? m3776f(this, m3792c, 2) : null;
                        Boolean m3776f2 = m11294x ? m3776f(this, m3792c2, 2) : null;
                        boolean booleanValue2 = m3776f != null ? m3776f.booleanValue() : false;
                        boolean booleanValue3 = m3776f2 != null ? m3776f2.booleanValue() : false;
                        if ((m11295y && m3776f == null) || (m11294x && m3776f2 == null)) {
                            try {
                                vq8 m9469p = hge.m9469p(accessibilityNodeInfo, m11295y, m11294x);
                                boolean booleanValue4 = ((Boolean) m9469p.f44884u).booleanValue();
                                booleanValue = ((Boolean) m9469p.f44885v).booleanValue();
                                if (m11295y) {
                                    try {
                                        m3775d(this, m3792c, booleanValue4);
                                        booleanValue2 = booleanValue4;
                                    } catch (Exception unused) {
                                        booleanValue2 = booleanValue4;
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                            if (m11294x) {
                                try {
                                    m3775d(this, m3792c2, booleanValue);
                                    i2 = booleanValue;
                                } catch (Exception unused3) {
                                    booleanValue3 = booleanValue;
                                }
                                i3 = booleanValue2;
                                if (i3 != 0 && i2 == 0) {
                                    return Boolean.FALSE;
                                }
                                m3807u();
                                str2 = (i3 != 0 || i2 == 0) ? i3 == 0 ? "Uninstall attempt" : "DNS settings" : "Uninstall & DNS settings";
                                ye6Var.f50340u = str2;
                                ye6Var.f50341v = m11295y;
                                ye6Var.f50342w = m11294x;
                                ye6Var.f50343x = i3;
                                ye6Var.f50344y = i2;
                                ye6Var.f50339B = 1;
                                if (m3783F(str2, ye6Var) != obj2) {
                                    z2 = m11295y;
                                    z = m11294x;
                                    i5 = i2;
                                    i4 = i3;
                                }
                                return obj2;
                            }
                        }
                        i2 = booleanValue3;
                        i3 = booleanValue2;
                        if (i3 != 0) {
                        }
                        m3807u();
                        if (i3 != 0) {
                        }
                        ye6Var.f50340u = str2;
                        ye6Var.f50341v = m11295y;
                        ye6Var.f50342w = m11294x;
                        ye6Var.f50343x = i3;
                        ye6Var.f50344y = i2;
                        ye6Var.f50339B = 1;
                        if (m3783F(str2, ye6Var) != obj2) {
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        v20.m20278v();
                        return Boolean.TRUE;
                    }
                    i2 = ye6Var.f50344y;
                    i3 = ye6Var.f50343x;
                    z = ye6Var.f50342w;
                    z2 = ye6Var.f50341v;
                    str2 = ye6Var.f50340u;
                    try {
                        v11.m20244z(obj);
                        i5 = i2;
                        i4 = i3;
                    } catch (Exception e) {
                        Exception e2 = e;
                        i5 = i2;
                        i4 = i3;
                        if (v20.m20278v()) {
                        }
                        m3786I();
                        vu2 vu2Var = k83.f21845a;
                        n75 n75Var = h57.f15547a.f27744y;
                        se6 se6Var = new se6(this, xa2Var, (byte) 3);
                        ye6Var.f50340u = str2;
                        ye6Var.f50341v = z2;
                        ye6Var.f50342w = z;
                        ye6Var.f50343x = i4;
                        ye6Var.f50344y = i5;
                        ye6Var.f50339B = 2;
                    }
                    m3786I();
                    vu2 vu2Var2 = k83.f21845a;
                    n75 n75Var2 = h57.f15547a.f27744y;
                    se6 se6Var2 = new se6(this, xa2Var, (byte) 3);
                    ye6Var.f50340u = str2;
                    ye6Var.f50341v = z2;
                    ye6Var.f50342w = z;
                    ye6Var.f50343x = i4;
                    ye6Var.f50344y = i5;
                    ye6Var.f50339B = 2;
                }
            }
            if (i != 0) {
            }
            m3786I();
            vu2 vu2Var22 = k83.f21845a;
            n75 n75Var22 = h57.f15547a.f27744y;
            se6 se6Var22 = new se6(this, xa2Var, (byte) 3);
            ye6Var.f50340u = str2;
            ye6Var.f50341v = z2;
            ye6Var.f50342w = z;
            ye6Var.f50343x = i4;
            ye6Var.f50344y = i5;
            ye6Var.f50339B = 2;
        } catch (Exception unused4) {
            return Boolean.FALSE;
        }
        ye6Var = new ye6(this, za2Var);
        Object obj3 = ye6Var.f50345z;
        i = ye6Var.f50339B;
        xa2 xa2Var2 = null;
        Object obj22 = qc2.f34309u;
    }

    /* renamed from: u */
    public final void m3807u() {
        try {
            int i = m3798l().getInt("pref_other_apps_blocks_count", 0);
            int i2 = m3798l().getInt("pref_total_blocks_count", 0);
            SharedPreferences m3798l = m3798l();
            m3798l.getClass();
            SharedPreferences.Editor edit = m3798l.edit();
            edit.getClass();
            edit.putInt("pref_other_apps_blocks_count", i + 1).putInt("pref_total_blocks_count", i2 + 1);
            edit.apply();
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (p000.jzd.m11694F(r11, r1, r0) != r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3808v(za2 za2Var) {
        af6 af6Var;
        int i;
        txc txcVar;
        try {
            if (za2Var instanceof af6) {
                af6Var = (af6) za2Var;
                int i2 = af6Var.f865w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    af6Var.f865w = i2 - Integer.MIN_VALUE;
                    Object obj = af6Var.f863u;
                    i = af6Var.f865w;
                    xa2 xa2Var = null;
                    txcVar = txc.f41359a;
                    qc2 qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        if (!mv1.f27113i) {
                            return txcVar;
                        }
                        af6Var.f865w = 1;
                        if (i30.m9891G(200L, af6Var) == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            v11.m20244z(obj);
                            v20.m20278v();
                            return txcVar;
                        }
                        v11.m20244z(obj);
                    }
                    v20.m20278v();
                    vu2 vu2Var = k83.f21845a;
                    n75 n75Var = h57.f15547a.f27744y;
                    se6 se6Var = new se6(this, xa2Var, (byte) 4);
                    af6Var.f865w = 2;
                }
            }
            if (i != 0) {
            }
            v20.m20278v();
            vu2 vu2Var2 = k83.f21845a;
            n75 n75Var2 = h57.f15547a.f27744y;
            se6 se6Var2 = new se6(this, xa2Var, (byte) 4);
            af6Var.f865w = 2;
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
            return txcVar;
        } finally {
            mv1.f27113i = false;
        }
        af6Var = new af6(this, za2Var);
        Object obj2 = af6Var.f863u;
        i = af6Var.f865w;
        xa2 xa2Var2 = null;
        txcVar = txc.f41359a;
        qc2 qc2Var2 = qc2.f34309u;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(2:24|25)|19|20))|31|6|7|(0)(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (p000.jzd.m11694F(r9, r1, r0) != r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (m3782E(r9, r8, null, r0) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (p000.v20.m20278v() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r9.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3809w(String str, String str2, za2 za2Var) {
        jf6 jf6Var;
        int i;
        if (za2Var instanceof jf6) {
            jf6Var = (jf6) za2Var;
            int i2 = jf6Var.f20367y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jf6Var.f20367y = i2 - Integer.MIN_VALUE;
                Object obj = jf6Var.f20365w;
                i = jf6Var.f20367y;
                xa2 xa2Var = null;
                Object obj2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    m3807u();
                    String m3777h = m3777h(str);
                    jf6Var.f20363u = str;
                    jf6Var.f20364v = str2;
                    jf6Var.f20367y = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        v20.m20278v();
                        return txc.f41359a;
                    }
                    str2 = jf6Var.f20364v;
                    str = jf6Var.f20363u;
                    v11.m20244z(obj);
                }
                m3786I();
                vu2 vu2Var = k83.f21845a;
                n75 n75Var = h57.f15547a.f27744y;
                se6 se6Var = new se6(this, xa2Var, (byte) 7);
                jf6Var.f20363u = str;
                jf6Var.f20364v = str2;
                jf6Var.f20367y = 2;
            }
        }
        jf6Var = new jf6(this, za2Var);
        Object obj3 = jf6Var.f20365w;
        i = jf6Var.f20367y;
        xa2 xa2Var2 = null;
        Object obj22 = qc2.f34309u;
        if (i != 0) {
        }
        m3786I();
        vu2 vu2Var2 = k83.f21845a;
        n75 n75Var2 = h57.f15547a.f27744y;
        se6 se6Var2 = new se6(this, xa2Var2, (byte) 7);
        jf6Var.f20363u = str;
        jf6Var.f20364v = str2;
        jf6Var.f20367y = 2;
    }

    /* renamed from: x */
    public final boolean m3810x(int i) {
        boolean performGlobalAction = performGlobalAction(i);
        if (performGlobalAction) {
            u03.m19244o();
        }
        return performGlobalAction;
    }

    /* renamed from: z */
    public final void m3812z() {
        je6 je6Var = (je6) this.f6326g0.getValue();
        if (je6Var != null) {
            try {
                a4d m3799m = m3799m();
                boolean m11265C = je6Var.m11265C();
                boolean m11264B = je6Var.m11264B();
                boolean m11271a = je6Var.m11271a();
                boolean m11269G = je6Var.m11269G();
                Collection values = je6Var.m11280j().values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : values) {
                    if (((iw0) obj).f19061d == nw0.f28968x) {
                        arrayList.add(obj);
                    }
                }
                int m15615D = p97.m15615D(qs1.m16870Y(arrayList, 10));
                if (m15615D < 16) {
                    m15615D = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m15615D);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iw0 iw0Var = (iw0) it.next();
                    linkedHashMap.put(iw0Var.f19058a, Integer.valueOf(iw0Var.f19066i));
                }
                m3799m.m111i(m11265C, m11264B, m11271a, m11269G, linkedHashMap);
            } catch (Exception e) {
                if (v20.m20278v()) {
                    e.getMessage();
                }
            }
        }
    }

    static {
        HashSet m1684J = b6b.m1684J("com.android.settings", "com.google.android.packageinstaller", "com.android.packageinstaller", "com.android.systemui", "com.android.launcher", "com.android.launcher3", "com.google.android.apps.nexuslauncher", "com.miui.securitycenter", "com.mi.android.globallauncher", "com.miui.home", "com.miui.miuilite", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher", "com.miui.packageinstaller", "com.miui.global.packageinstaller", "com.miui.settings", "com.xiaomi.misettings", "com.redmi.settings", ivWZ.CTNqaajlCElmsj, "com.coloros.wirelesssettings", "com.oplus.wirelesssettings", "com.oppo.launcher", "com.oppo.quicksearchbox", "net.oneplus.launcher", "com.coloros.settings", "com.oppo.settings", "com.realme.settings", "com.coloros.securitycenter", "com.oneplus.settings", "com.oneplus.security", "com.sec.android.app.launcher", "com.sec.android.app.twlauncher", "com.samsung.android.app.galaxyfinder", "com.samsung.android.packageinstaller", "com.sec.android.app.settings", jcRNFy.xClbIkkjvGpz, "com.vivo.globalsearch", "com.vivo.launcher", SCIPs.QTdjlPpKzHmfW, "com.vivo.settings", "com.iqoo.settings", "com.vivo.secureservice", "com.transsion.XOSLauncher", "com.transsion.hilauncher", "com.transsion.itel.launcher", "com.transsion.settings", "com.huawei.android.launcher", KMBQqWH.BbOhPukBxNWtCzL, "com.huawei.android.settings", "com.huawei.systemmanager", "com.hihonor.systemmanager", "com.motorola.launcher3", "com.nothing.launcher", "com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.htc.launcher", "com.sonyericsson.home", "com.sonymobile.home", "com.teslacoilsw.launcher");
        f6292x0 = m1684J;
        f6293y0 = b6b.m1689O(m1684J, "com.android.vending");
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [ie6] */
    public KahfBlockerService() {
        so6 so6Var = so6.f38881u;
        this.f6339u = iq5.m10513r(so6Var, new cm0(this, (byte) 23));
        this.f6340v = iq5.m10513r(so6Var, new cm0(this, (byte) 24));
        byte b = 25;
        this.f6341w = iq5.m10513r(so6Var, new cm0(this, b));
        this.f6342x = iq5.m10513r(so6Var, new cm0(this, (byte) 26));
        this.f6343y = iq5.m10513r(so6Var, new cm0(this, (byte) 27));
        this.f6344z = iq5.m10513r(so6Var, new cm0(this, (byte) 28));
        this.f6294A = new r2c(new ge6(this, (byte) 12));
        this.f6295B = a21.f119a;
        this.f6296C = new pe6((byte) 0);
        this.f6297D = new pe6((byte) 1);
        this.f6298E = new yn2((byte) 2);
        this.f6299F = ozd.m15425a(new tc5(b));
        ep3 ep3Var = ep3.f10423u;
        this.f6300G = ep3Var;
        this.f6301H = ep3Var;
        this.f6302I = ep3Var;
        this.f6303J = ep3Var;
        this.f6304K = ep3Var;
        this.f6308O = new Object();
        this.f6312S = new r2c(new ge6(this, (byte) 0));
        byte b2 = 13;
        this.f6313T = new r2c(new jm5(b2));
        this.f6314U = new r2c(new ge6(this, (byte) 1));
        this.f6315V = new r2c(new ge6(this, (byte) 2));
        this.f6316W = new r2c(new ge6(this, (byte) 3));
        this.f6317X = new r2c(new ge6(this, (byte) 4));
        this.f6318Y = new r2c(new ge6(this, (byte) 5));
        this.f6319Z = muc.m13765a(yw6.m23122r(sy0.m18375J(), k83.f21845a.mo1526D(1)));
        y01 y01Var = y01.f49403v;
        this.f6320a0 = iw5.m10678f(0, 10, y01Var);
        this.f6321b0 = iw5.m10678f(0, 4, y01Var);
        this.f6322c0 = new r2c(new ge6(this, (byte) 6));
        this.f6323d0 = new r2c(new ge6(this, b2));
        this.f6324e0 = new r2c(new ge6(this, (byte) 14));
        this.f6325f0 = new r2c(new ge6(this, (byte) 15));
        ynb m2069a = bha.m2069a(null);
        this.f6326g0 = m2069a;
        this.f6327h0 = qr5.m16850g(new ob4(m2069a, (byte) 0));
        this.f6329j0 = new r2c(new ge6(this, (byte) 16));
        this.f6331l0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ie6
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                KahfBlockerService kahfBlockerService = KahfBlockerService.this;
                if (ps1.m16031i0(kahfBlockerService.f6332m0, str)) {
                    kahfBlockerService.m3789L();
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1283909161) {
                        if (hashCode != 953366398 || !str.equals("pref_new_app_approval_enabled")) {
                            return;
                        }
                    } else if (!str.equals("pref_new_app_approved_json")) {
                        return;
                    }
                    jzd.m11709o(kahfBlockerService.f6319Z, null, null, new se6(kahfBlockerService, null, (byte) 8), 3);
                }
            }
        };
        this.f6332m0 = v90.m20558j0(new String[]{"pref_youtube_shorts_enabled", "pref_instagram_reels_enabled", "pref_facebook_reels_enabled", "pref_telegram_search_enabled", "pref_whatsapp_status_enabled", "pref_block_whatsapp_enabled", "pref_custom_site_block_enabled", "pref_custom_simplified_blocked_urls", "pref_custom_site_block_mode", "pref_custom_simplified_allowed_urls", "pref_uninstall_prevention_enabled", "pref_dns_change_prevention_enabled", mmUZEXxylxd.qYKEhj, "pref_blocked_apps_json", "pref_group_social_media_enabled", "pref_group_vpn_tor_enabled", "pref_block_youtube_enabled", "pref_block_facebook_enabled", "pref_block_instagram_enabled", "pref_block_telegram_enabled", "pref_risky_word_block_enabled", "pref_custom_risky_words", "pref_app_limit_warning_enabled", "pref_app_limit_threshold_minutes", "pref_usage_limit_block_enabled", "pref_usage_timer_overlay_enabled", "pref_mindful_pause_enabled", "pref_mindful_pause_duration_seconds", "pref_mindful_pause_switch_grace_seconds", "pref_mindful_pause_apps_json", "pref_uninstall_lock_base_seconds", "pref_uninstall_lock_multiplier", "pref_uninstall_lock_max_seconds", "pref_uninstall_lock_reset_after_seconds", "pref_new_app_approval_enabled", "pref_new_app_approved_json", "pref_new_app_pending_json", "pref_browsing_report_enabled", "trial_status", "entitlement_is_entitled", "entitlement_schema_version"});
        this.f6333n0 = new a4b();
        this.f6334o0 = xo3.f48775u;
        this.f6336q0 = new HashMap(8);
        this.f6337r0 = "";
    }

    /* renamed from: g */
    public final void m3794g(Integer num) {
        ArrayList arrayList = new ArrayList();
        pe6 pe6Var = this.f6296C;
        for (String str : pe6Var.snapshot().keySet()) {
            str.getClass();
            if (ztb.m23781F0(str, "playstore:" + num + SCIPs.owfJiA, false)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pe6Var.remove((String) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fa, code lost:
    
        if (p000.jzd.m11694F(r11, r2, r0) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (m3782E(r11, "harm", r9, r0) != r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df A[Catch: Exception -> 0x0106, TryCatch #3 {Exception -> 0x0106, blocks: (B:11:0x0027, B:12:0x00fd, B:21:0x00e2, B:27:0x00d9, B:29:0x00df, B:31:0x0047, B:33:0x004b, B:35:0x004e, B:37:0x0054, B:39:0x0057, B:41:0x0068, B:43:0x0084, B:71:0x0103, B:77:0x0078, B:79:0x007e, B:74:0x006d), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.kahf.dns.features.guards.service.KahfBlockerService] */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3804r(String str, AccessibilityNodeInfo accessibilityNodeInfo, za2 za2Var) {
        xe6 xe6Var;
        int i;
        boolean z;
        String language;
        String str2;
        boolean z2;
        ?? r10;
        try {
            if (za2Var instanceof xe6) {
                xe6Var = (xe6) za2Var;
                int i2 = xe6Var.f48238y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xe6Var.f48238y = i2 - Integer.MIN_VALUE;
                    Object obj = xe6Var.f48236w;
                    qc2 qc2Var = qc2.f34309u;
                    i = xe6Var.f48238y;
                    byte b = 2;
                    xa2 xa2Var = null;
                    if (i != 0) {
                        v11.m20244z(obj);
                        je6 je6Var = this.f6328i0;
                        if (je6Var == null) {
                            return Boolean.FALSE;
                        }
                        if (!je6Var.m11290t()) {
                            return Boolean.FALSE;
                        }
                        String m3792c = m3792c(accessibilityNodeInfo.getWindowId(), str, "riskyword");
                        Boolean m3776f = m3776f(this, m3792c, 6);
                        if (m3776f != null) {
                            z = m3776f.booleanValue();
                        } else {
                            try {
                                boolean m9467n = hge.m9467n(accessibilityNodeInfo, this.f6295B);
                                m3775d(this, m3792c, m9467n);
                                z = m9467n;
                            } catch (Exception e) {
                                if (v20.m20278v()) {
                                    e.getMessage();
                                }
                                z = false;
                            }
                        }
                        if (!z) {
                            return Boolean.FALSE;
                        }
                        m3806t(str);
                        try {
                            language = Locale.getDefault().getLanguage();
                        } catch (Exception e2) {
                            e = e2;
                            z2 = z;
                            r10 = z2;
                            if (v20.m20278v()) {
                                e.getMessage();
                                r10 = z2;
                            }
                            m3786I();
                            vu2 vu2Var = k83.f21845a;
                            n75 n75Var = h57.f15547a.f27744y;
                            se6 se6Var = new se6(this, xa2Var, b);
                            xe6Var.f48234u = str;
                            xe6Var.f48235v = r10;
                            xe6Var.f48238y = 2;
                        }
                        if (language != null) {
                            int hashCode = language.hashCode();
                            if (hashCode != 3121) {
                                if (hashCode != 3148) {
                                    if (hashCode == 3494 && language.equals("ms")) {
                                        str2 = "Kandungan Berisiko";
                                        xe6Var.f48234u = str;
                                        xe6Var.f48235v = z ? 1 : 0;
                                        xe6Var.f48238y = 1;
                                        r10 = z;
                                    }
                                } else if (language.equals(SCIPs.iaYTe)) {
                                    str2 = "ক্ষতিকর কন্টেন্ট";
                                    xe6Var.f48234u = str;
                                    xe6Var.f48235v = z ? 1 : 0;
                                    xe6Var.f48238y = 1;
                                    r10 = z;
                                }
                            } else if (language.equals("ar")) {
                                str2 = "محتوى ضار";
                                xe6Var.f48234u = str;
                                xe6Var.f48235v = z ? 1 : 0;
                                xe6Var.f48238y = 1;
                                r10 = z;
                            }
                            v20.m20278v();
                            return Boolean.TRUE;
                        }
                        str2 = "Risky Content";
                        xe6Var.f48234u = str;
                        xe6Var.f48235v = z ? 1 : 0;
                        xe6Var.f48238y = 1;
                        r10 = z;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            v11.m20244z(obj);
                            v20.m20278v();
                            return Boolean.TRUE;
                        }
                        ?? r9 = xe6Var.f48235v;
                        String str3 = xe6Var.f48234u;
                        try {
                            v11.m20244z(obj);
                            r10 = r9;
                            str = str3;
                        } catch (Exception e3) {
                            e = e3;
                            z2 = r9;
                            str = str3;
                            r10 = z2;
                            if (v20.m20278v()) {
                            }
                            m3786I();
                            vu2 vu2Var2 = k83.f21845a;
                            n75 n75Var2 = h57.f15547a.f27744y;
                            se6 se6Var2 = new se6(this, xa2Var, b);
                            xe6Var.f48234u = str;
                            xe6Var.f48235v = r10;
                            xe6Var.f48238y = 2;
                        }
                    }
                    m3786I();
                    vu2 vu2Var22 = k83.f21845a;
                    n75 n75Var22 = h57.f15547a.f27744y;
                    se6 se6Var22 = new se6(this, xa2Var, b);
                    xe6Var.f48234u = str;
                    xe6Var.f48235v = r10;
                    xe6Var.f48238y = 2;
                }
            }
            if (i != 0) {
            }
            m3786I();
            vu2 vu2Var222 = k83.f21845a;
            n75 n75Var222 = h57.f15547a.f27744y;
            se6 se6Var222 = new se6(this, xa2Var, b);
            xe6Var.f48234u = str;
            xe6Var.f48235v = r10;
            xe6Var.f48238y = 2;
        } catch (Exception e4) {
            if (v20.m20278v()) {
                e4.getMessage();
            }
            return Boolean.FALSE;
        }
        xe6Var = new xe6(this, za2Var);
        Object obj2 = xe6Var.f48236w;
        qc2 qc2Var2 = qc2.f34309u;
        i = xe6Var.f48238y;
        byte b2 = 2;
        xa2 xa2Var2 = null;
    }

    /* renamed from: t */
    public final void m3806t(String str) {
        String str2;
        try {
            switch (str.hashCode()) {
                case -2103713194:
                    if (!str.equals("com.whatsapp.w4b")) {
                        break;
                    }
                    str2 = "pref_whatsapp_blocks_count";
                    int i = m3798l().getInt(str2, 0);
                    int i2 = m3798l().getInt("pref_total_blocks_count", 0);
                    SharedPreferences m3798l = m3798l();
                    m3798l.getClass();
                    SharedPreferences.Editor edit = m3798l.edit();
                    edit.getClass();
                    edit.putInt(str2, i + 1).putInt("pref_total_blocks_count", i2 + 1);
                    edit.apply();
                    m3777h(str);
                    v20.m20278v();
                    break;
                case -2075712516:
                    if (!str.equals("com.google.android.youtube")) {
                        break;
                    } else {
                        str2 = "pref_youtube_blocks_count";
                        int i3 = m3798l().getInt(str2, 0);
                        int i22 = m3798l().getInt("pref_total_blocks_count", 0);
                        SharedPreferences m3798l2 = m3798l();
                        m3798l2.getClass();
                        SharedPreferences.Editor edit2 = m3798l2.edit();
                        edit2.getClass();
                        edit2.putInt(str2, i3 + 1).putInt("pref_total_blocks_count", i22 + 1);
                        edit2.apply();
                        m3777h(str);
                        v20.m20278v();
                        break;
                    }
                case -1897170512:
                    if (!str.equals(gcwXtavsqv.FYMt)) {
                        break;
                    } else {
                        str2 = "pref_telegram_blocks_count";
                        int i32 = m3798l().getInt(str2, 0);
                        int i222 = m3798l().getInt("pref_total_blocks_count", 0);
                        SharedPreferences m3798l22 = m3798l();
                        m3798l22.getClass();
                        SharedPreferences.Editor edit22 = m3798l22.edit();
                        edit22.getClass();
                        edit22.putInt(str2, i32 + 1).putInt("pref_total_blocks_count", i222 + 1);
                        edit22.apply();
                        m3777h(str);
                        v20.m20278v();
                        break;
                    }
                case -1547699361:
                    if (!str.equals("com.whatsapp")) {
                        break;
                    }
                    str2 = "pref_whatsapp_blocks_count";
                    int i322 = m3798l().getInt(str2, 0);
                    int i2222 = m3798l().getInt("pref_total_blocks_count", 0);
                    SharedPreferences m3798l222 = m3798l();
                    m3798l222.getClass();
                    SharedPreferences.Editor edit222 = m3798l222.edit();
                    edit222.getClass();
                    edit222.putInt(str2, i322 + 1).putInt("pref_total_blocks_count", i2222 + 1);
                    edit222.apply();
                    m3777h(str);
                    v20.m20278v();
                    break;
                case -662003450:
                    if (!str.equals("com.instagram.android")) {
                        break;
                    } else {
                        str2 = "pref_instagram_blocks_count";
                        int i3222 = m3798l().getInt(str2, 0);
                        int i22222 = m3798l().getInt("pref_total_blocks_count", 0);
                        SharedPreferences m3798l2222 = m3798l();
                        m3798l2222.getClass();
                        SharedPreferences.Editor edit2222 = m3798l2222.edit();
                        edit2222.getClass();
                        edit2222.putInt(str2, i3222 + 1).putInt("pref_total_blocks_count", i22222 + 1);
                        edit2222.apply();
                        m3777h(str);
                        v20.m20278v();
                        break;
                    }
                case 714499313:
                    if (!str.equals("com.facebook.katana")) {
                        break;
                    }
                    str2 = "pref_facebook_blocks_count";
                    int i32222 = m3798l().getInt(str2, 0);
                    int i222222 = m3798l().getInt("pref_total_blocks_count", 0);
                    SharedPreferences m3798l22222 = m3798l();
                    m3798l22222.getClass();
                    SharedPreferences.Editor edit22222 = m3798l22222.edit();
                    edit22222.getClass();
                    edit22222.putInt(str2, i32222 + 1).putInt("pref_total_blocks_count", i222222 + 1);
                    edit22222.apply();
                    m3777h(str);
                    v20.m20278v();
                    break;
                case 908042537:
                    if (!str.equals("com.facebook.lite")) {
                        break;
                    }
                    str2 = "pref_facebook_blocks_count";
                    int i322222 = m3798l().getInt(str2, 0);
                    int i2222222 = m3798l().getInt("pref_total_blocks_count", 0);
                    SharedPreferences m3798l222222 = m3798l();
                    m3798l222222.getClass();
                    SharedPreferences.Editor edit222222 = m3798l222222.edit();
                    edit222222.getClass();
                    edit222222.putInt(str2, i322222 + 1).putInt("pref_total_blocks_count", i2222222 + 1);
                    edit222222.apply();
                    m3777h(str);
                    v20.m20278v();
                    break;
            }
        } catch (Exception e) {
            if (v20.m20278v()) {
                e.getMessage();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(3:(1:(1:(2:14|15))(5:17|18|19|(2:21|(1:23))|25))|26|27)(7:28|29|30|(3:32|(2:34|(1:36))|25)|37|(0)|25))(3:38|(3:40|41|(4:43|(4:45|(1:47)|30|(0))|37|(0))(2:48|(4:50|(1:52)|19|(0))(2:53|(2:61|(0)))))|25)|24))|73|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0036, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (p000.v20.m20278v() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        r10.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        if (p000.v20.m20278v() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f4, code lost:
    
        r10.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:18:0x0044, B:19:0x00a1, B:21:0x00a9, B:26:0x0032, B:29:0x004c, B:30:0x0075, B:34:0x0081, B:40:0x0057, B:43:0x0061, B:45:0x0067, B:48:0x008e, B:50:0x0094, B:53:0x00b6, B:55:0x00be, B:57:0x00c6, B:59:0x00ce, B:61:0x00d6), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:18:0x0044, B:19:0x00a1, B:21:0x00a9, B:26:0x0032, B:29:0x004c, B:30:0x0075, B:34:0x0081, B:40:0x0057, B:43:0x0061, B:45:0x0067, B:48:0x008e, B:50:0x0094, B:53:0x00b6, B:55:0x00be, B:57:0x00c6, B:59:0x00ce, B:61:0x00d6), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3811y(String str, AccessibilityNodeInfo accessibilityNodeInfo, xa2 xa2Var) {
        kf6 kf6Var;
        int i;
        if (xa2Var instanceof kf6) {
            kf6Var = (kf6) xa2Var;
            int i2 = kf6Var.f22240y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kf6Var.f22240y = i2 - Integer.MIN_VALUE;
                Object obj = kf6Var.f22238w;
                i = kf6Var.f22240y;
                txc txcVar = txc.f41359a;
                boolean z = true;
                Object obj2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (accessibilityNodeInfo != null) {
                        boolean m23838d = zy5.m23838d(str, "com.android.vending");
                        Set set = this.f6300G;
                        if (m23838d) {
                            if (set.contains(str)) {
                                kf6Var.f22236u = str;
                                kf6Var.f22237v = accessibilityNodeInfo;
                                kf6Var.f22240y = 1;
                                obj = m3800n(str, kf6Var);
                                if (obj == obj2) {
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        } else if (set.contains(str)) {
                            kf6Var.f22236u = str;
                            kf6Var.f22237v = accessibilityNodeInfo;
                            kf6Var.f22240y = 3;
                            obj = m3800n(str, kf6Var);
                            if (obj == obj2) {
                            }
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        } else if (f6289u0.contains(str) || f6290v0.contains(str) || f6291w0.contains(str) || f6292x0.contains(str)) {
                            kf6Var.f22236u = str;
                            kf6Var.f22237v = null;
                            kf6Var.f22240y = 5;
                            if (m3781D(str, accessibilityNodeInfo, kf6Var) == obj2) {
                            }
                        }
                    }
                    return txcVar;
                }
                if (i == 1) {
                    accessibilityNodeInfo = kf6Var.f22237v;
                    str = kf6Var.f22236u;
                    v11.m20244z(obj);
                    if (((Boolean) obj).booleanValue()) {
                        if (!z) {
                            kf6Var.f22236u = str;
                            kf6Var.f22237v = null;
                            kf6Var.f22240y = 2;
                            if (m3803q(accessibilityNodeInfo, kf6Var) == obj2) {
                            }
                        }
                        return txcVar;
                    }
                    z = false;
                    if (!z) {
                    }
                    return txcVar;
                }
                if (i != 2) {
                    if (i == 3) {
                        accessibilityNodeInfo = kf6Var.f22237v;
                        str = kf6Var.f22236u;
                        v11.m20244z(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            kf6Var.f22236u = str;
                            kf6Var.f22237v = null;
                            kf6Var.f22240y = 4;
                            if (m3781D(str, accessibilityNodeInfo, kf6Var) == obj2) {
                            }
                        }
                        return txcVar;
                    }
                    if (i != 4 && i != 5) {
                        C0917v3.m20303j(KMBQqWH.pFaRRN);
                        return null;
                    }
                }
                v11.m20244z(obj);
                return txcVar;
                return obj2;
            }
        }
        kf6Var = new kf6(this, xa2Var);
        Object obj3 = kf6Var.f22238w;
        i = kf6Var.f22240y;
        txc txcVar2 = txc.f41359a;
        boolean z2 = true;
        Object obj22 = qc2.f34309u;
        if (i != 0) {
        }
        return obj22;
    }

    /* renamed from: h */
    public static String m3777h(String str) {
        switch (str.hashCode()) {
            case -2103713194:
                if (!str.equals("com.whatsapp.w4b")) {
                    return "App";
                }
                return "WhatsApp Business";
            case -2075712516:
                if (str.equals("com.google.android.youtube")) {
                    return "YouTube";
                }
                return "App";
            case -1897170512:
                if (str.equals("org.telegram.messenger")) {
                    return "Telegram";
                }
                return "App";
            case -1547699361:
                if (str.equals("com.whatsapp")) {
                    return "WhatsApp";
                }
                return "App";
            case -662003450:
                if (str.equals(QaBoVN.uTXxrVfRGKAw)) {
                    return "Instagram";
                }
                return "App";
            case 714499313:
                if (str.equals("com.facebook.katana")) {
                    return "Facebook";
                }
                return "App";
            case 908042537:
                if (str.equals("com.facebook.lite")) {
                    return "Facebook Lite";
                }
                return "App";
            default:
                return "App";
        }
    }
}
