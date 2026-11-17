package com.kahf.dns.p019ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.p003ui.platform.p004ZD.ahPHtVstMotfS;
import androidx.work.impl.foreground.Ygju.iawVUOiEYmRW;
import com.bumptech.glide.p011DH.ZaEQclIjTObv;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.datatransport.cct.p013Yv.EtVGdIOx;
import com.google.android.gms.measurement.internal.jhdS.oavfxXVsJYlYK;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kahf.dns.R;
import com.kahf.dns.core.analytics.AnalyticsEvent;
import com.kahf.dns.resources.Res;
import com.kahf.dns.resources.String11_commonMainKt;
import com.kahf.dns.utils.AndroidBillingManagerWithSubscription;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.AbstractC0093ce;
import p000.AbstractC0332f9;
import p000.C0295e9;
import p000.C0309en;
import p000.C0516k9;
import p000.C0662o7;
import p000.C0788rm;
import p000.C0917v3;
import p000.C0957w6;
import p000.C0983ww;
import p000.C1001xd;
import p000.a07;
import p000.a57;
import p000.bb7;
import p000.bg2;
import p000.c3e;
import p000.c57;
import p000.cf0;
import p000.d4c;
import p000.d57;
import p000.d5e;
import p000.df7;
import p000.dj3;
import p000.dt2;
import p000.e57;
import p000.f57;
import p000.f95;
import p000.ft8;
import p000.ftb;
import p000.gpc;
import p000.gtb;
import p000.gx1;
import p000.hj3;
import p000.i30;
import p000.i4d;
import p000.iq5;
import p000.j78;
import p000.jwb;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.kwb;
import p000.lwb;
import p000.ly6;
import p000.mj1;
import p000.muc;
import p000.mv1;
import p000.nf0;
import p000.nj1;
import p000.nld;
import p000.nw1;
import p000.o97;
import p000.ow6;
import p000.p20;
import p000.p29;
import p000.p3e;
import p000.p47;
import p000.pc2;
import p000.ps1;
import p000.qc2;
import p000.qe2;
import p000.qr5;
import p000.qz6;
import p000.r2c;
import p000.rj9;
import p000.s78;
import p000.sb0;
import p000.sj8;
import p000.so6;
import p000.stb;
import p000.sx7;
import p000.tc3;
import p000.tq2;
import p000.tr0;
import p000.txc;
import p000.tz6;
import p000.uda;
import p000.uf0;
import p000.v11;
import p000.v30;
import p000.v57;
import p000.vq8;
import p000.vu2;
import p000.w33;
import p000.w3a;
import p000.w3e;
import p000.x11;
import p000.x54;
import p000.xa2;
import p000.xhc;
import p000.xt0;
import p000.y04;
import p000.y47;
import p000.y54;
import p000.yf0;
import p000.ytb;
import p000.yw6;
import p000.yx8;
import p000.yy5;
import p000.z47;
import p000.za2;
import p000.zc1;
import p000.ze5;
import p000.zx8;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class MainActivity extends gx1 {

    /* renamed from: i0 */
    public static final /* synthetic */ int f6412i0 = 0;

    /* renamed from: O */
    public final kl6 f6413O;

    /* renamed from: P */
    public final kl6 f6414P;

    /* renamed from: Q */
    public final kl6 f6415Q;

    /* renamed from: R */
    public final kl6 f6416R;

    /* renamed from: S */
    public final ft8 f6417S;

    /* renamed from: T */
    public final x54 f6418T;

    /* renamed from: U */
    public final kl6 f6419U;

    /* renamed from: V */
    public final kl6 f6420V;

    /* renamed from: W */
    public final kl6 f6421W;

    /* renamed from: X */
    public final kl6 f6422X;

    /* renamed from: Y */
    public final kl6 f6423Y;

    /* renamed from: Z */
    public final kl6 f6424Z;

    /* renamed from: a0 */
    public final kl6 f6425a0;

    /* renamed from: b0 */
    public final kl6 f6426b0;

    /* renamed from: c0 */
    public final kl6 f6427c0;

    /* renamed from: d0 */
    public C0516k9 f6428d0;

    /* renamed from: e0 */
    public final kl6 f6429e0;

    /* renamed from: f0 */
    public final kl6 f6430f0;

    /* renamed from: g0 */
    public final kl6 f6431g0;

    /* renamed from: h0 */
    public final AbstractC0332f9 f6432h0;

    public MainActivity() {
        so6 so6Var = so6.f38881u;
        byte b = 0;
        this.f6413O = iq5.m10513r(so6Var, new f57(this, b));
        byte b2 = 1;
        this.f6414P = iq5.m10513r(so6Var, new f57(this, b2));
        this.f6415Q = iq5.m10513r(so6Var, new ze5(this, new ftb("ioScope")));
        byte b3 = 2;
        kl6 m10513r = iq5.m10513r(so6Var, new f57(this, b3));
        this.f6416R = m10513r;
        String stringFromPreferences = ((PreferencesHelper) m10513r.getValue()).getStringFromPreferences(PrefKeys.LANGUAGE, "");
        if (stringFromPreferences.length() == 0 && (stringFromPreferences = v11.f43547i) == null) {
            stringFromPreferences = nld.m14312q();
        }
        this.f6417S = yw6.m23120p(new ow6(stringFromPreferences));
        this.f6418T = new x54();
        this.f6419U = iq5.m10513r(so6Var, new f57(this, (byte) 3));
        this.f6420V = iq5.m10513r(so6Var, new f57(this, (byte) 4));
        so6 so6Var2 = so6.f38883w;
        this.f6421W = iq5.m10513r(so6Var2, new f57(this, (byte) 8));
        this.f6422X = iq5.m10513r(so6Var2, new f57(this, (byte) 9));
        this.f6423Y = iq5.m10513r(so6Var2, new f57(this, (byte) 10));
        this.f6424Z = iq5.m10513r(so6Var, new f57(this, (byte) 5));
        this.f6425a0 = iq5.m10513r(so6Var2, new f57(this, (byte) 11));
        this.f6426b0 = iq5.m10513r(so6Var, new f57(this, (byte) 6));
        this.f6427c0 = iq5.m10513r(so6Var, new f57(this, (byte) 7));
        this.f6429e0 = iq5.m10513r(so6Var, new e57(this, b));
        this.f6430f0 = iq5.m10513r(so6Var, new e57(this, b2));
        this.f6431g0 = iq5.m10513r(so6Var, new e57(this, b3));
        this.f6432h0 = m8967j(new y47(this), new C0295e9(b2));
    }

    /* renamed from: v */
    public static final void m5518v(boolean z, MainActivity mainActivity, yx8 yx8Var, String str, AndroidBillingManagerWithSubscription.LaunchOffer launchOffer) {
        if (z) {
            mainActivity.m5522n().m22025b(new AnalyticsEvent.UserJourneyEvent.IapLaunchResult(str, yx8Var.m23147d(), yx8Var.m23148e(), yx8Var.m23155l(), launchOffer != null ? launchOffer.getOfferId() : null, launchOffer != null ? launchOffer.getBasePlanId() : null, launchOffer != null ? Boolean.valueOf(launchOffer.getHasFreePhase()) : null));
        }
    }

    /* renamed from: k */
    public final boolean m5519k(Uri uri) {
        yx8 yx8Var;
        String str;
        xa2 xa2Var = null;
        try {
            ((tq2) this.f6419U.getValue()).getClass();
            yx8Var = tq2.m18969b(uri);
        } catch (Exception e) {
            Log.e("MainActivity", "Error handling payment deeplink", e);
            x54 x54Var = this.f6418T;
            Map singletonMap = Collections.singletonMap("error_type", "payment_deeplink");
            singletonMap.getClass();
            x54Var.m21886a("MainActivity", "Failed to handle payment deeplink", e, singletonMap);
            yx8Var = null;
        }
        byte b = 1;
        if (yx8Var != null) {
            String m23151h = yx8Var.m23151h();
            ((uf0) this.f6429e0.getValue()).f42298b = null;
            jzd.m11709o(yy5.m23186m(this), null, null, new tr0(this, yx8Var, m23151h, xa2Var, (byte) 7), 3);
            return true;
        }
        try {
            ((tq2) this.f6419U.getValue()).getClass();
            str = tq2.m18968a(uri);
        } catch (Exception e2) {
            Log.e("MainActivity", "Error handling auth deeplink", e2);
            str = null;
        }
        if (str != null) {
            jzd.m11709o(yy5.m23186m(this), null, null, new d57(this, str, xa2Var, b), 3);
            return true;
        }
        ((tq2) this.f6419U.getValue()).getClass();
        uri.getClass();
        if (!tq2.m18970c(uri) || !mj1.m13451b(uri.getQueryParameter("paired"), uri.getQueryParameter("token"))) {
            return m5533z(uri);
        }
        ((nj1) this.f6420V.getValue()).m14230a();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r10 == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007b, code lost:
    
        if (r9.length() > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5520l(yx8 yx8Var, za2 za2Var) {
        z47 z47Var;
        int i;
        String m23153j;
        String str;
        boolean z;
        i4d i4dVar;
        if (za2Var instanceof z47) {
            z47Var = (z47) za2Var;
            int i2 = z47Var.f51772y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z47Var.f51772y = i2 - Integer.MIN_VALUE;
                Object obj = z47Var.f51770w;
                i = z47Var.f51772y;
                Object obj2 = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    m23153j = yx8Var.m23153j();
                    if (m23153j != null) {
                        try {
                            String str2 = (String) ps1.m16040r0(1, stb.m18274n1(m23153j, new String[]{"."}, 0, 6));
                            if (str2 != null) {
                                byte[] decode = Base64.decode(str2, 11);
                                decode.getClass();
                                str = new JSONObject(new String(decode, zc1.f52140a)).optString("sub");
                                str.getClass();
                            }
                        } catch (Exception e) {
                            Log.w("Auth", "Failed to decode token subject", e);
                        }
                        str = null;
                        if (str != null) {
                            yf0 yf0Var = (yf0) this.f6421W.getValue();
                            z47Var.f51768u = m23153j;
                            z47Var.f51769v = str;
                            z47Var.f51772y = 1;
                            cf0 cf0Var = yf0Var.f50372v;
                            Object obj3 = (i4d) cf0Var.f4984L.getValue();
                            obj = obj3 == null ? ((nf0) cf0Var.f5005u).m14180d(z47Var) : obj3;
                        }
                        z = false;
                        if (!z) {
                            sb0 sb0Var = a07.f28a;
                            a07.m8c(AndroidBillingManagerWithSubscription.INSTANCE.getLastCheckoutSource().m6433a());
                            z47Var.f51768u = null;
                            z47Var.f51769v = null;
                            z47Var.f51772y = 2;
                            Object m5532y = m5532y(m23153j, z47Var);
                            return m5532y == obj2 ? obj2 : m5532y;
                        }
                    }
                    return Boolean.valueOf(((PreferencesHelper) this.f6416R.getValue()).getStringFromPreferences(PrefKeys.AUTH_TOKEN, "").length() > 0);
                }
                if (i != 1) {
                    if (i == 2) {
                        v11.m20244z(obj);
                        return obj;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = z47Var.f51769v;
                m23153j = z47Var.f51768u;
                v11.m20244z(obj);
                i4dVar = (i4d) obj;
                if (zy5.m23838d(str, i4dVar == null ? i4dVar.m9988e() : null)) {
                    z = true;
                    if (!z) {
                    }
                    return Boolean.valueOf(((PreferencesHelper) this.f6416R.getValue()).getStringFromPreferences(PrefKeys.AUTH_TOKEN, "").length() > 0);
                }
                z = false;
                if (!z) {
                }
                return Boolean.valueOf(((PreferencesHelper) this.f6416R.getValue()).getStringFromPreferences(PrefKeys.AUTH_TOKEN, "").length() > 0);
            }
        }
        z47Var = new z47(this, za2Var);
        Object obj4 = z47Var.f51770w;
        i = z47Var.f51772y;
        Object obj22 = qc2.f34309u;
        if (i != 0) {
        }
        i4dVar = (i4d) obj4;
        if (zy5.m23838d(str, i4dVar == null ? i4dVar.m9988e() : null)) {
        }
        z = false;
        if (!z) {
        }
        return Boolean.valueOf(((PreferencesHelper) this.f6416R.getValue()).getStringFromPreferences(PrefKeys.AUTH_TOKEN, "").length() > 0);
    }

    /* renamed from: m */
    public final void m5521m(yx8 yx8Var) {
        try {
            String m23148e = yx8Var.m23148e();
            if (m23148e != null && m23148e.length() != 0) {
                String m23144a = yx8Var.m23144a();
                String str = null;
                Double m23033r0 = m23144a != null ? ytb.m23033r0(m23144a) : null;
                String m23145b = yx8Var.m23145b();
                if (m23145b != null && !stb.m18260Z0(m23145b)) {
                    str = m23145b;
                }
                p29 m15509p = (m23033r0 == null || str == null) ? p47.m15509p(m23148e, AndroidBillingManagerWithSubscription.INSTANCE.getLastKnownIsBangladesh()) : new p29(m23033r0.doubleValue(), str);
                if (m15509p == null) {
                    Log.w("Payment", "FB Purchase skipped — no price mapping for ".concat(m23148e));
                    return;
                }
                String m23154k = yx8Var.m23154k();
                if (m23154k == null) {
                    String m23153j = yx8Var.m23153j();
                    m23154k = "web_" + m23148e + "_" + (m23153j != null ? stb.m18284x1(12, m23153j) : Long.valueOf(System.currentTimeMillis() / 60000));
                }
                String str2 = m23154k;
                SharedPreferences sharedPreferences = getSharedPreferences("payment_deeplink_dedup", 0);
                String concat = "fb_purchase_".concat(stb.m18284x1(24, str2));
                if (sharedPreferences.getBoolean(concat, false)) {
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putBoolean(concat, true);
                edit.apply();
                vq8 m2603H = c3e.m2603H(AndroidBillingManagerWithSubscription.INSTANCE.getLastCheckoutSource());
                String str3 = (String) m2603H.f44884u;
                String str4 = (String) m2603H.f44885v;
                r2c r2cVar = y04.f49410a;
                y04.m22455g(m15509p.m15456a(), m15509p.m15457b(), m23148e, str3, str4, str2);
                y04.m22458j(m15509p.m15456a(), m15509p.m15457b(), m23148e, str3, str4, str2);
                return;
            }
            Log.w("Payment", "FB Purchase skipped — no productCode on deeplink");
        } catch (Exception e) {
            Log.e("Payment", "Failed to fire web FB Purchase", e);
        }
    }

    /* renamed from: n */
    public final C1001xd m5522n() {
        return (C1001xd) this.f6413O.getValue();
    }

    /* renamed from: o */
    public final void m5523o(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null || m5519k(data)) {
            return;
        }
        sx7.m18364b(sx7.f39332a, "Unrecognized deeplink: " + data, "Deeplink", 2);
    }

    @Override // p000.gx1, p000.fx1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ZaEQclIjTObv.AWzUBKbDvXtlEUD.invoke(null, this, bundle);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ZaEQclIjTObv.trSX.invoke(null, this);
    }

    @Override // p000.gx1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        m5523o(intent);
        m5525q(intent);
        m5527s(intent);
        boolean z = (intent.getFlags() & 1048576) != 0;
        d4c.f7327u.getClass();
        m5526r(intent, w3a.m21072J(z));
        m5524p(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        ahPHtVstMotfS.hNslgznnmzef.invoke(null, this);
    }

    @Override // android.app.Activity
    public final void onStop() {
        iawVUOiEYmRW.XikUWLS.invoke(null, this);
    }

    /* renamed from: p */
    public final void m5524p(Intent intent) {
        String stringExtra;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("compose_screen");
            } catch (Exception e) {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18369g(ly6.f25312y, "MainActivity", e, "Error handling compose screen deeplink");
                return;
            }
        } else {
            stringExtra = null;
        }
        if (stringExtra != null && stringExtra.length() != 0) {
            String stringExtra2 = intent != null ? intent.getStringExtra("deeplink_source") : null;
            sx7.m18364b(sx7.f39332a, "Deeplink: Setting pending navigation to screen: " + stringExtra + ", source: " + stringExtra2, "MainActivity", 2);
            ((v57) this.f6422X.getValue()).m20393f(stringExtra, stringExtra2);
        }
    }

    /* renamed from: q */
    public final void m5525q(Intent intent) {
        Uri uri;
        if (intent == null) {
            return;
        }
        try {
            v30 m20307o = v30.m20307o(intent);
            if (m20307o == null || (uri = (Uri) m20307o.f43648v) == null || m5533z(uri)) {
                return;
            }
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "Meta App Link targetUri not in marketing scheme: " + uri, "Deeplink");
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "Deeplink", e, "Failed to parse Meta App Link");
        }
    }

    /* renamed from: r */
    public final void m5526r(Intent intent, d4c d4cVar) {
        MainActivity mainActivity;
        s78 m1829j = bb7.m1829j(new C0788rm(intent));
        if (m1829j != null && ((j78) this.f6414P.getValue()).m10993a(m1829j, d4cVar)) {
            AnalyticsEvent.AppOpenedByNotificationEvent.AppOpenedByNotification m17897c = m1829j.m17897c();
            if (m17897c != null) {
                m5522n().m22025b(m17897c);
            }
            String stringExtra = intent.getStringExtra("title");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("gcm.notification.title");
            }
            String str = stringExtra;
            String stringExtra2 = intent.getStringExtra("body");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("gcm.notification.body");
            }
            String str2 = stringExtra2;
            if (m1829j.m17896b() == null && str == null) {
                mainActivity = this;
            } else {
                String m17896b = m1829j.m17896b();
                if (m17896b == null) {
                    m17896b = sj8.m18101m((str == null ? "" : str).concat(str2 != null ? str2 : "").hashCode(), "notif_");
                }
                String str3 = m17896b;
                String stringExtra3 = intent.getStringExtra("image_url");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("gcm.notification.image");
                }
                mainActivity = this;
                jzd.m11709o((pc2) this.f6415Q.getValue(), null, null, new tc3(mainActivity, str, str2, stringExtra3, m1829j, intent.getStringExtra("compose_screen"), str3, null), 3);
            }
            String m17895a = m1829j.m17895a();
            if (m17895a != null) {
                try {
                    Uri parse = Uri.parse(m17895a);
                    parse.getClass();
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (RuntimeException e) {
                    Log.e("MainActivity", "Could not open the notification link", e);
                }
            }
        }
    }

    /* renamed from: s */
    public final void m5527s(Intent intent) {
        xa2 xa2Var = null;
        if (zy5.m23838d(intent != null ? intent.getStringExtra("shortcut_id") : null, "kg_guardz_dynamic")) {
            jzd.m11709o(yy5.m23186m(this), null, null, new C0957w6(this, xa2Var, (byte) 13), 3);
        }
    }

    /* renamed from: t */
    public final void m5528t(String str, String str2, boolean z) {
        if (!z) {
            sx7.m18364b(sx7.f39332a, "Skipping Google services analytics - not available", "Analytics", 2);
            return;
        }
        try {
            qe2 qe2Var = y54.m22622a().f49722a;
            ((bg2) qe2Var.f34454o.f14591u).m2028d(new p20(qe2Var, str, (byte) 8));
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
            firebaseAnalytics.getClass();
            d5e d5eVar = firebaseAnalytics.f6015a;
            d5eVar.getClass();
            d5eVar.m5932c(new w3e(d5eVar, str));
            d5eVar.getClass();
            d5eVar.m5932c(new p3e(d5eVar, (String) null, "app_version", (Object) "4.6.287", false));
            d5eVar.getClass();
            d5eVar.m5932c(new p3e(d5eVar, (String) null, "build_type", (Object) BuildConfig.BUILD_TYPE, false));
            d5eVar.getClass();
            d5eVar.m5932c(new p3e(d5eVar, (String) null, "device_id_quality", (Object) str2, false));
            AbstractC0093ce.m3061b(str);
            sx7.m18364b(sx7.f39332a, "Google services analytics initialized", "Analytics", 2);
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "Analytics", e, "Failed to initialize Google services analytics");
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5530w(yx8 yx8Var, boolean z) {
        String str;
        String str2;
        String m23153j = yx8Var.m23153j();
        if (m23153j != null) {
            SharedPreferences sharedPreferences = getSharedPreferences("payment_deeplink_dedup", 0);
            String concat = "pw_return_".concat(stb.m18284x1(24, m23153j));
            if (sharedPreferences.getBoolean(concat, false)) {
                return false;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putBoolean(concat, true);
            edit.apply();
        }
        if (yx8Var.m23146c()) {
            str = "iap_handoff";
        } else if (yx8Var.m23150g()) {
            str = "skip";
        } else if (zy5.m23838d(yx8Var.m23152i(), "active")) {
            str = "continue_active";
        } else {
            if (yx8Var.m23151h() != null) {
                str2 = "web_payment";
                boolean equals = str2.equals("web_payment");
                m5522n().m22025b(new AnalyticsEvent.UserJourneyEvent.WebPaywallReturn(str2, z, yx8Var.m23153j() == null, AndroidBillingManagerWithSubscription.INSTANCE.getLastCheckoutSource().m6433a(), !equals ? yx8Var.m23151h() : null, yx8Var.m23148e(), !yx8Var.m23146c() ? yx8Var.m23155l() : null, !equals ? yx8Var.m23144a() : null, equals ? yx8Var.m23145b() : null));
                return true;
            }
            str = "no_result";
        }
        str2 = str;
        boolean equals2 = str2.equals("web_payment");
        m5522n().m22025b(new AnalyticsEvent.UserJourneyEvent.WebPaywallReturn(str2, z, yx8Var.m23153j() == null, AndroidBillingManagerWithSubscription.INSTANCE.getLastCheckoutSource().m6433a(), !equals2 ? yx8Var.m23151h() : null, yx8Var.m23148e(), !yx8Var.m23146c() ? yx8Var.m23155l() : null, !equals2 ? yx8Var.m23144a() : null, equals2 ? yx8Var.m23145b() : null));
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(11:11|12|13|14|15|(1:17)(1:25)|18|(1:20)|21|22|23)(2:34|35))(2:36|37))(3:82|83|(2:85|44))|38|(2:40|(3:42|(8:45|15|(0)(0)|18|(0)|21|22|23)|44)(7:46|(0)(0)|18|(0)|21|22|23))(5:47|(12:50|(10:(1:(1:(1:55)(2:56|57))(1:58))(1:80)|59|(7:(1:(1:(1:64)(2:65|66))(1:67))(1:78)|68|(1:70)(1:77)|(1:72)|73|(1:75)|76)|79|68|(0)(0)|(0)|73|(0)|76)|81|59|(0)|79|68|(0)(0)|(0)|73|(0)|76)(1:49)|30|22|23)))|88|6|7|(0)(0)|38|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0061, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[Catch: Exception -> 0x0061, xhc -> 0x0064, TryCatch #3 {xhc -> 0x0064, Exception -> 0x0061, blocks: (B:15:0x00c4, B:18:0x00da, B:21:0x0105, B:37:0x005d, B:38:0x0088, B:40:0x0092, B:42:0x00a9, B:46:0x00c7, B:47:0x0121, B:50:0x013e, B:56:0x014c, B:57:0x0151, B:59:0x015a, B:65:0x0167, B:66:0x016c, B:68:0x0175, B:70:0x0182, B:72:0x0189, B:73:0x0192, B:76:0x01a1, B:83:0x006a), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121 A[Catch: Exception -> 0x0061, xhc -> 0x0064, TryCatch #3 {xhc -> 0x0064, Exception -> 0x0061, blocks: (B:15:0x00c4, B:18:0x00da, B:21:0x0105, B:37:0x005d, B:38:0x0088, B:40:0x0092, B:42:0x00a9, B:46:0x00c7, B:47:0x0121, B:50:0x013e, B:56:0x014c, B:57:0x0151, B:59:0x015a, B:65:0x0167, B:66:0x016c, B:68:0x0175, B:70:0x0182, B:72:0x0189, B:73:0x0192, B:76:0x01a1, B:83:0x006a), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182 A[Catch: Exception -> 0x0061, xhc -> 0x0064, TryCatch #3 {xhc -> 0x0064, Exception -> 0x0061, blocks: (B:15:0x00c4, B:18:0x00da, B:21:0x0105, B:37:0x005d, B:38:0x0088, B:40:0x0092, B:42:0x00a9, B:46:0x00c7, B:47:0x0121, B:50:0x013e, B:56:0x014c, B:57:0x0151, B:59:0x015a, B:65:0x0167, B:66:0x016c, B:68:0x0175, B:70:0x0182, B:72:0x0189, B:73:0x0192, B:76:0x01a1, B:83:0x006a), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189 A[Catch: Exception -> 0x0061, xhc -> 0x0064, TryCatch #3 {xhc -> 0x0064, Exception -> 0x0061, blocks: (B:15:0x00c4, B:18:0x00da, B:21:0x0105, B:37:0x005d, B:38:0x0088, B:40:0x0092, B:42:0x00a9, B:46:0x00c7, B:47:0x0121, B:50:0x013e, B:56:0x014c, B:57:0x0151, B:59:0x015a, B:65:0x0167, B:66:0x016c, B:68:0x0175, B:70:0x0182, B:72:0x0189, B:73:0x0192, B:76:0x01a1, B:83:0x006a), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5532y(String str, za2 za2Var) {
        c57 c57Var;
        int i;
        boolean z;
        Throwable m19582a;
        String str2;
        int ordinal;
        String str3;
        Throwable th;
        String message;
        i4d i4dVar;
        int i2;
        String str4;
        MainActivity mainActivity;
        String m9985b;
        String str5 = str;
        if (za2Var instanceof c57) {
            c57Var = (c57) za2Var;
            int i3 = c57Var.f4456A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c57Var.f4456A = i3 - Integer.MIN_VALUE;
                Object obj = c57Var.f4461y;
                i = c57Var.f4456A;
                x54 x54Var = this.f6418T;
                xa2 xa2Var = null;
                byte b = 0;
                qc2 qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    f95 f95Var = dj3.f8146v;
                    long m16842H = qr5.m16842H(30, hj3.SECONDS);
                    d57 d57Var = new d57(this, str5, xa2Var, b);
                    c57Var.f4457u = str5;
                    c57Var.f4456A = 1;
                    obj = muc.m13761W(i30.m9932k0(m16842H), d57Var, c57Var);
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = c57Var.f4460x;
                        MainActivity mainActivity2 = c57Var.f4459w;
                        i4dVar = c57Var.f4458v;
                        String str6 = c57Var.f4457u;
                        try {
                            v11.m20244z(obj);
                            i2 = i4;
                            mainActivity = mainActivity2;
                            str4 = (String) obj;
                            Toast.makeText(mainActivity, str4, i2 != 0 ? 1 : 0).show();
                            C1001xd m5522n = m5522n();
                            vq8 vq8Var = new vq8("server_user_id", i4dVar.m9988e());
                            vq8 vq8Var2 = new vq8(PrefKeys.KEY_USER_NAME, i4dVar.m9989f());
                            m9985b = i4dVar.m9985b();
                            if (m9985b == null) {
                                m9985b = "";
                            }
                            m5522n.m22028e(o97.m14870G(vq8Var, vq8Var2, new vq8(PrefKeys.KEY_USER_EMAIL, m9985b)));
                            m5522n().m22025b(AnalyticsEvent.AuthEvent.LoginSuccess.INSTANCE);
                            z = true;
                        } catch (xhc e) {
                            e = e;
                            str5 = str6;
                            Log.e("Auth", "Login process timed out after 30 seconds");
                            Toast.makeText(this, "Login is taking too long. Please check your connection and try again.", 1).show();
                            x54Var.m21886a("MainActivity", "Login process timed out", e, o97.m14870G(new vq8("error_type", "timeout"), new vq8("timeout_duration", "30000"), new vq8("token_length", String.valueOf(str5.length()))));
                            z = false;
                            return Boolean.valueOf(z);
                        } catch (Exception e2) {
                            e = e2;
                            str5 = str6;
                            Log.e("Auth", "Unexpected error during login process", e);
                            Toast.makeText(this, "An unexpected error occurred. Please try again.", 1).show();
                            x54Var.m21886a("MainActivity", "Unexpected error during login", e, o97.m14870G(new vq8("error_type", "unexpected_error"), new vq8("error_class", e.getClass().getSimpleName()), new vq8("token_length", String.valueOf(str5.length()))));
                            z = false;
                            return Boolean.valueOf(z);
                        }
                        return Boolean.valueOf(z);
                    }
                    str5 = c57Var.f4457u;
                    v11.m20244z(obj);
                }
                Object obj2 = ((uda) obj).f42208u;
                m19582a = uda.m19582a(obj2);
                if (m19582a != null) {
                    i4dVar = (i4d) obj2;
                    boolean z2 = ((yf0) this.f6421W.getValue()).f50374x.f51162u.getValue() instanceof w33;
                    if (!z2) {
                        String string = getString(R.string.login_success_toast);
                        string.getClass();
                        i2 = z2 ? 1 : 0;
                        str4 = string;
                        mainActivity = this;
                        Toast.makeText(mainActivity, str4, i2 != 0 ? 1 : 0).show();
                        C1001xd m5522n2 = m5522n();
                        vq8 vq8Var3 = new vq8("server_user_id", i4dVar.m9988e());
                        vq8 vq8Var22 = new vq8(PrefKeys.KEY_USER_NAME, i4dVar.m9989f());
                        m9985b = i4dVar.m9985b();
                        if (m9985b == null) {
                        }
                        m5522n2.m22028e(o97.m14870G(vq8Var3, vq8Var22, new vq8(PrefKeys.KEY_USER_EMAIL, m9985b)));
                        m5522n().m22025b(AnalyticsEvent.AuthEvent.LoginSuccess.INSTANCE);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    gtb refusal_pending_toast = String11_commonMainKt.getRefusal_pending_toast(Res.string.INSTANCE);
                    c57Var.f4457u = str5;
                    c57Var.f4458v = i4dVar;
                    c57Var.f4459w = this;
                    c57Var.f4460x = z2 ? 1 : 0;
                    c57Var.f4456A = 2;
                    Object m13832v = mv1.m13832v(refusal_pending_toast, c57Var);
                    if (m13832v != qc2Var) {
                        i2 = z2 ? 1 : 0;
                        obj = m13832v;
                        mainActivity = this;
                        str4 = (String) obj;
                        Toast.makeText(mainActivity, str4, i2 != 0 ? 1 : 0).show();
                        C1001xd m5522n22 = m5522n();
                        vq8 vq8Var32 = new vq8("server_user_id", i4dVar.m9988e());
                        vq8 vq8Var222 = new vq8(PrefKeys.KEY_USER_NAME, i4dVar.m9989f());
                        m9985b = i4dVar.m9985b();
                        if (m9985b == null) {
                        }
                        m5522n22.m22028e(o97.m14870G(vq8Var32, vq8Var222, new vq8(PrefKeys.KEY_USER_EMAIL, m9985b)));
                        m5522n().m22025b(AnalyticsEvent.AuthEvent.LoginSuccess.INSTANCE);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    return qc2Var;
                }
                Log.e("Auth", "Login failed: " + m19582a.getMessage(), m19582a);
                qz6 m6223P = df7.m6223P(m19582a);
                if (m6223P != qz6.f35715u) {
                    int ordinal2 = m6223P.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            str2 = "network_error";
                        } else if (ordinal2 == 2) {
                            str2 = "invalid_token";
                        } else if (ordinal2 != 3) {
                            throw new nw1();
                        }
                        ordinal = m6223P.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                str3 = "Network error. Please check your connection and try again.";
                            } else if (ordinal == 2) {
                                str3 = "Authentication failed. Please try logging in again.";
                            } else if (ordinal != 3) {
                                throw new nw1();
                            }
                            Toast.makeText(this, str3, 1).show();
                            th = m19582a instanceof Exception ? (Exception) m19582a : null;
                            if (th == null) {
                                th = new Exception(m19582a.getMessage());
                            }
                            vq8 vq8Var4 = new vq8("error_type", str2);
                            message = m19582a.getMessage();
                            if (message == null) {
                                message = "Unknown";
                            }
                            x54Var.m21886a("MainActivity", "Login failed with error", th, o97.m14870G(vq8Var4, new vq8("error_message", message), new vq8("token_length", String.valueOf(str5.length()))));
                        }
                        str3 = "Login failed. Please try again.";
                        Toast.makeText(this, str3, 1).show();
                        if (m19582a instanceof Exception) {
                        }
                        if (th == null) {
                        }
                        vq8 vq8Var42 = new vq8("error_type", str2);
                        message = m19582a.getMessage();
                        if (message == null) {
                        }
                        x54Var.m21886a("MainActivity", "Login failed with error", th, o97.m14870G(vq8Var42, new vq8("error_message", message), new vq8("token_length", String.valueOf(str5.length()))));
                    }
                    str2 = "unknown_error";
                    ordinal = m6223P.ordinal();
                    if (ordinal != 0) {
                    }
                    str3 = "Login failed. Please try again.";
                    Toast.makeText(this, str3, 1).show();
                    if (m19582a instanceof Exception) {
                    }
                    if (th == null) {
                    }
                    vq8 vq8Var422 = new vq8("error_type", str2);
                    message = m19582a.getMessage();
                    if (message == null) {
                    }
                    x54Var.m21886a("MainActivity", "Login failed with error", th, o97.m14870G(vq8Var422, new vq8("error_message", message), new vq8("token_length", String.valueOf(str5.length()))));
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        c57Var = new c57(this, za2Var);
        Object obj3 = c57Var.f4461y;
        i = c57Var.f4456A;
        x54 x54Var2 = this.f6418T;
        xa2 xa2Var2 = null;
        byte b2 = 0;
        qc2 qc2Var2 = qc2.f34309u;
        if (i != 0) {
        }
        Object obj22 = ((uda) obj3).f42208u;
        m19582a = uda.m19582a(obj22);
        if (m19582a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r8 == null) goto L19;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5533z(Uri uri) {
        if (!zy5.m23838d(uri.getScheme(), getPackageName()) || !zy5.m23838d(uri.getHost(), "open")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        String str = (String) ps1.m16039q0(pathSegments);
        if (str == null || stb.m18260Z0(str)) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "Marketing deeplink missing destination key: " + uri, "Deeplink");
            return true;
        }
        String queryParameter = uri.getQueryParameter("source");
        if (queryParameter != null) {
            if (stb.m18260Z0(queryParameter)) {
                queryParameter = null;
            }
        }
        queryParameter = "marketing_deeplink";
        sx7.m18364b(sx7.f39332a, tz6.m19211l("Marketing deeplink: key=", str, ", source=", queryParameter), "Deeplink", 2);
        ((v57) this.f6422X.getValue()).m20393f(str, queryParameter);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r6 == r9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5529u(yx8 yx8Var, boolean z, boolean z2, za2 za2Var) {
        a57 a57Var;
        int i;
        String m23147d;
        String str;
        x54 x54Var;
        Object m13763Y;
        yx8 yx8Var2;
        boolean z3;
        String str2;
        lwb subscriptionLaunchFor;
        yx8 yx8Var3 = yx8Var;
        boolean z4 = z;
        boolean z5 = z2;
        if (za2Var instanceof a57) {
            a57Var = (a57) za2Var;
            int i2 = a57Var.f297A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a57Var.f297A = i2 - Integer.MIN_VALUE;
                Object obj = a57Var.f302y;
                i = a57Var.f297A;
                x54 x54Var2 = this.f6418T;
                txc txcVar = txc.f41359a;
                char c = 1;
                qc2 qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (!z4) {
                        m5518v(z5, this, yx8Var3, "no_session", null);
                        Log.e("Payment", "IAP deeplink but no app session — refusing to launch billing");
                        if (yx8Var3.m23153j() == null) {
                            Toast.makeText(this, "Please sign in to complete your purchase.", 1).show();
                        }
                        x54Var2.m21886a("MainActivity", "IAP deeplink arrived without an app session", new Exception("IAP deeplink no session"), o97.m14870G(new vq8("error_type", "iap_deeplink_no_session"), new vq8("had_token", String.valueOf(yx8Var3.m23153j() != null))));
                        return txcVar;
                    }
                    String m23149f = yx8Var3.m23149f();
                    if (m23149f != null && !m23149f.equals("GOOGLE")) {
                        m5518v(z5, this, yx8Var3, EtVGdIOx.RLS, null);
                        Log.e("Payment", "IAP deeplink for non-Google provider=".concat(m23149f));
                        Toast.makeText(this, "Unable to start purchase. Please try again.", 1).show();
                        x54Var2.m21886a("MainActivity", "IAP deeplink with non-Google provider", new Exception("IAP wrong provider"), o97.m14870G(new vq8("error_type", "iap_deeplink_wrong_provider"), new vq8("provider", m23149f)));
                        return txcVar;
                    }
                    m23147d = yx8Var3.m23147d();
                    if (m23147d == null || !rj9.f36841a.contains(m23147d)) {
                        m5518v(z5, this, yx8Var3, "unknown_price_id", null);
                        Log.e("Payment", "IAP deeplink with unknown price_id=" + m23147d);
                        Toast.makeText(this, "Unable to start purchase. Please try again.", 1).show();
                        Exception exc = new Exception("IAP unknown price_id");
                        vq8 vq8Var = new vq8("error_type", "iap_deeplink_bad_price_id");
                        if (m23147d == null) {
                            m23147d = "null";
                        }
                        x54Var2.m21886a("MainActivity", "IAP deeplink with unknown price_id", exc, o97.m14870G(vq8Var, new vq8("price_id", m23147d)));
                        return txcVar;
                    }
                    xt0.m22281b();
                    f95 f95Var = dj3.f8146v;
                    str = "MainActivity";
                    x54Var = x54Var2;
                    long m16842H = qr5.m16842H(15, hj3.SECONDS);
                    C0983ww c0983ww = new C0983ww(m23147d, null, c == true ? 1 : 0);
                    a57Var.f298u = yx8Var3;
                    a57Var.f299v = m23147d;
                    a57Var.f300w = z4;
                    a57Var.f301x = z5;
                    a57Var.f297A = 1;
                    m13763Y = muc.m13763Y(m16842H, c0983ww, a57Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = a57Var.f301x;
                        str2 = a57Var.f299v;
                        yx8Var2 = a57Var.f298u;
                        v11.m20244z(obj);
                        yx8Var2.getClass();
                        subscriptionLaunchFor = AndroidBillingManagerWithSubscription.INSTANCE.subscriptionLaunchFor(str2, yx8Var2.m23155l());
                        if (!(subscriptionLaunchFor instanceof jwb)) {
                            m5518v(z3, this, yx8Var2, "launched", (AndroidBillingManagerWithSubscription.LaunchOffer) ((jwb) subscriptionLaunchFor).m11611a());
                        } else if (subscriptionLaunchFor instanceof kwb) {
                            m5518v(z3, this, yx8Var2, "trial_unavailable", (AndroidBillingManagerWithSubscription.LaunchOffer) ((kwb) subscriptionLaunchFor).m12357a());
                        } else {
                            if (subscriptionLaunchFor != null) {
                                gpc.m8801a();
                                return null;
                            }
                            m5518v(z3, this, yx8Var2, "launched", null);
                        }
                        ((C0309en) ((zx8) this.f6431g0.getValue())).m7337d(str2, yx8Var2.m23155l());
                        return txcVar;
                    }
                    boolean z6 = a57Var.f301x;
                    z4 = a57Var.f300w;
                    String str3 = a57Var.f299v;
                    yx8 yx8Var4 = a57Var.f298u;
                    v11.m20244z(obj);
                    z5 = z6;
                    yx8Var3 = yx8Var4;
                    m13763Y = obj;
                    m23147d = str3;
                    str = "MainActivity";
                    x54Var = x54Var2;
                }
                if (m13763Y != null) {
                    m5518v(z5, this, yx8Var3, "products_not_ready", null);
                    Log.e("Payment", "IAP billing products not ready for " + m23147d);
                    Toast.makeText(this, "Couldn't reach Google Play. Please check your connection and try again.", 1).show();
                    x54Var.m21886a(str, "IAP billing products not ready", new Exception("Play products not ready"), o97.m14870G(new vq8("error_type", "iap_products_not_ready"), new vq8("price_id", m23147d)));
                    return txcVar;
                }
                vu2 vu2Var = k83.f21845a;
                dt2 dt2Var = dt2.f8706v;
                C0662o7 c0662o7 = new C0662o7(m23147d, yx8Var3, null, (byte) 17);
                a57Var.f298u = yx8Var3;
                a57Var.f299v = m23147d;
                a57Var.f300w = z4;
                a57Var.f301x = z5;
                a57Var.f297A = 2;
                if (jzd.m11694F(dt2Var, c0662o7, a57Var) != qc2Var) {
                    boolean z7 = z5;
                    yx8Var2 = yx8Var3;
                    z3 = z7;
                    str2 = m23147d;
                    yx8Var2.getClass();
                    subscriptionLaunchFor = AndroidBillingManagerWithSubscription.INSTANCE.subscriptionLaunchFor(str2, yx8Var2.m23155l());
                    if (!(subscriptionLaunchFor instanceof jwb)) {
                    }
                    ((C0309en) ((zx8) this.f6431g0.getValue())).m7337d(str2, yx8Var2.m23155l());
                    return txcVar;
                }
                return qc2Var;
            }
        }
        a57Var = new a57(this, za2Var);
        Object obj2 = a57Var.f302y;
        i = a57Var.f297A;
        x54 x54Var22 = this.f6418T;
        txc txcVar2 = txc.f41359a;
        char c2 = 1;
        qc2 qc2Var2 = qc2.f34309u;
        if (i != 0) {
        }
        if (m13763Y != null) {
        }
    }

    /* renamed from: x */
    public final void m5531x(String str, vq8... vq8VarArr) {
        Toast.makeText(this, "Login failed. Please try again.", 1).show();
        Exception exc = new Exception("Auth Tab failure: ".concat(str));
        x11 x11Var = new x11(2);
        sj8.m18111w(x11Var, "error_type", str);
        x11Var.m21792c(vq8VarArr);
        ArrayList arrayList = x11Var.f47436b;
        this.f6418T.m21886a(oavfxXVsJYlYK.YdS, "Auth Tab login failed", exc, o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()])));
    }
}
