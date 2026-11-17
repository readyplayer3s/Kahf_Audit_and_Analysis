package com.kahf.dns.enroll;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.work.impl.workers.OCIC.qquouBmHq;
import com.bumptech.glide.p011DH.ZaEQclIjTObv;
import com.kahf.dns.p019ui.MainActivity;
import com.kahf.dns.utils.PreferencesHelper;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.List;
import java.util.ListIterator;
import p000.AbstractC0378gi;
import p000.C1024y;
import p000.ac6;
import p000.cg6;
import p000.dr3;
import p000.er3;
import p000.fr3;
import p000.gb6;
import p000.gpc;
import p000.gr3;
import p000.gx1;
import p000.hee;
import p000.hr3;
import p000.iq5;
import p000.ir3;
import p000.jr3;
import p000.jzd;
import p000.kl6;
import p000.kod;
import p000.kr3;
import p000.lr3;
import p000.ls6;
import p000.mr3;
import p000.mv1;
import p000.nr3;
import p000.o20;
import p000.or3;
import p000.pr1;
import p000.pr3;
import p000.qr3;
import p000.rr3;
import p000.so6;
import p000.sq3;
import p000.sr3;
import p000.stb;
import p000.tc5;
import p000.tq3;
import p000.tr3;
import p000.tz6;
import p000.uq3;
import p000.ur3;
import p000.v90;
import p000.va6;
import p000.vq3;
import p000.vr3;
import p000.wq3;
import p000.xa2;
import p000.xa6;
import p000.xo0;
import p000.xq3;
import p000.yy5;
import p000.z95;
import p000.za6;
import p000.ztb;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class KahfPhoneEnrollActivity extends gx1 {

    /* renamed from: W */
    public static final /* synthetic */ int f6247W = 0;

    /* renamed from: O */
    public final kl6 f6248O;

    /* renamed from: P */
    public final kl6 f6249P;

    /* renamed from: Q */
    public tr3 f6250Q;

    /* renamed from: R */
    public String f6251R;

    /* renamed from: S */
    public String f6252S;

    /* renamed from: T */
    public boolean f6253T;

    /* renamed from: U */
    public boolean f6254U;

    /* renamed from: V */
    public boolean f6255V;

    public KahfPhoneEnrollActivity() {
        cg6 cg6Var = new cg6(this, (byte) 0);
        so6 so6Var = so6.f38881u;
        this.f6248O = iq5.m10513r(so6Var, cg6Var);
        this.f6249P = iq5.m10513r(so6Var, new cg6(this, (byte) 1));
        this.f6250Q = qr3.f35225a;
    }

    /* renamed from: o */
    public static boolean m3756o(Uri uri) {
        return uri != null && zy5.m23838d(uri.getScheme(), "com.kahf.dns") && zy5.m23838d(uri.getHost(), "enroll");
    }

    /* renamed from: k */
    public final void m3757k(jr3 jr3Var) {
        vr3 vr3Var;
        tr3 tr3Var = this.f6250Q;
        tr3Var.getClass();
        boolean equals = tr3Var.equals(qr3.f35225a);
        sq3 sq3Var = sq3.f38978a;
        vq3 vq3Var = vq3.f44877a;
        xa2 xa2Var = null;
        nr3 nr3Var = nr3.f28732a;
        if (equals) {
            vr3Var = jr3Var.equals(fr3.f12597a) ? new vr3(nr3Var, vq3Var) : kod.m12179B(tr3Var, jr3Var);
        } else if (tr3Var.equals(nr3Var)) {
            vr3Var = kod.m12179B(tr3Var, jr3Var);
        } else {
            boolean equals2 = tr3Var.equals(rr3.f37151a);
            or3 or3Var = or3.f31063a;
            if (equals2) {
                vr3Var = jr3Var.equals(er3.f10534a) ? new vr3(or3Var, sq3Var) : jr3Var instanceof dr3 ? new vr3(new pr3(), new tq3()) : new vr3(tr3Var, null);
            } else {
                if (!tr3Var.equals(or3Var) && !tr3Var.equals(sr3.f39018a) && !(tr3Var instanceof pr3)) {
                    gpc.m8801a();
                    return;
                }
                vr3Var = new vr3(tr3Var, null);
            }
        }
        this.f6250Q = vr3Var.f44905a;
        xq3 xq3Var = vr3Var.f44906b;
        if (xq3Var != null) {
            if (!xq3Var.equals(vq3Var)) {
                if (xq3Var.equals(wq3.f46996a)) {
                    String str = this.f6251R;
                    if (str == null) {
                        Log.i("KahfPhoneEnroll", "DIAG register=NO_TOKEN");
                        m3757k(new dr3());
                        return;
                    } else {
                        Log.i("KahfPhoneEnroll", "DIAG register=START");
                        jzd.m11709o(yy5.m23186m(this), null, null, new C1024y((Object) this, (Object) str, xa2Var, (byte) 29), 3);
                        return;
                    }
                }
                if (xq3Var.equals(sq3Var)) {
                    m3758l("enrolled", null);
                    return;
                }
                if (xq3Var.equals(uq3.f43029a)) {
                    m3758l("skipped", null);
                    return;
                } else if (xq3Var instanceof tq3) {
                    m3758l("error", "Setup couldn't finish. Please try again.");
                    return;
                } else {
                    gpc.m8801a();
                    return;
                }
            }
            byte[] bArr = new byte[24];
            new SecureRandom().nextBytes(bArr);
            String m20550b0 = v90.m20550b0(bArr, "", new tc5((byte) 27), 30);
            ((PreferencesHelper) this.f6249P.getValue()).saveToPreferences("kahf_phone_enroll_nonce", m20550b0);
            String encode = URLEncoder.encode("com.kahf.dns://enroll?state=".concat(m20550b0), StandardCharsets.UTF_8.name());
            String m8670l = AbstractC0378gi.m8670l();
            encode.getClass();
            String m19197A = tz6.m19197A(stb.m18243C1(m8670l, '/'), "/kahf-phone-enroll?returnUrl=", encode);
            this.f6253T = true;
            this.f6254U = false;
            this.f6255V = false;
            try {
                hee heeVar = new hee((byte) 18);
                heeVar.m9404S();
                heeVar.m9415x().m14489P(this, Uri.parse(m19197A));
            } catch (Exception e) {
                Log.w("KahfPhoneEnroll", "Custom Tab launch failed, falling back to browser", e);
                try {
                    Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse(m19197A)).addCategory("android.intent.category.BROWSABLE");
                    addCategory.getClass();
                    if (addCategory.resolveActivity(getPackageManager()) != null) {
                        startActivity(addCategory);
                        return;
                    }
                } catch (Exception e2) {
                    Log.e("KahfPhoneEnroll", "Browser launch failed", e2);
                }
                Log.e("KahfPhoneEnroll", "No browser available to open the enroll web flow");
                m3757k(new hr3());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (r6.length() > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r11.length() > 0) goto L43;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3758l(String str, String str2) {
        String str3;
        String str4;
        Intent launchIntentForPackage;
        String str5 = this.f6252S;
        boolean z = this.f6255V;
        StringBuilder m15984r = pr1.m15984r("DIAG finishWith disposition=", str, " source=", str5, " returnDelivered=");
        m15984r.append(z);
        Log.i("KahfPhoneEnroll", m15984r.toString());
        ((PreferencesHelper) this.f6249P.getValue()).remove(mv1.m13793E("kahf_phone_enroll_nonce"));
        this.f6251R = null;
        if (str2 != null && !zy5.m23838d(this.f6252S, "suw")) {
            Toast.makeText(this, str2, 1).show();
        }
        ls6 m13818g = mv1.m13818g();
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.kahf.manager_pkg");
            str3 = invoke instanceof String ? (String) invoke : null;
            if (str3 != null) {
            }
        } catch (Exception unused) {
        }
        str3 = null;
        if (str3 != null) {
            if (stb.m18260Z0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                m13818g.add(str3);
            }
        }
        m13818g.add("org.lineageos.setupwizard");
        ListIterator listIterator = mv1.m13815d(m13818g).listIterator(0);
        while (true) {
            z95 z95Var = (z95) listIterator;
            if (!z95Var.hasNext()) {
                break;
            }
            String str6 = (String) z95Var.next();
            try {
                sendBroadcast(new Intent("com.kahf.dns.enroll.action.OUTCOME").setPackage(str6).putExtra("com.kahf.dns.enroll.EXTRA_RESULT", str));
            } catch (Exception e) {
                Log.w("KahfPhoneEnroll", "failed to broadcast enroll outcome to " + str6, e);
            }
        }
        if (zy5.m23838d(this.f6252S, "manager")) {
            try {
                Object invoke2 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.kahf.manager_pkg");
                str4 = invoke2 instanceof String ? (String) invoke2 : null;
                if (str4 != null) {
                }
            } catch (Exception unused2) {
            }
            str4 = null;
            if (str4 != null) {
                String str7 = stb.m18260Z0(str4) ? null : str4;
                if (str7 != null && (launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str7)) != null) {
                    try {
                        startActivity(launchIntentForPackage.addFlags(131072));
                    } catch (Exception e2) {
                        Log.w("KahfPhoneEnroll", "failed to bring Manager to front after enrollment", e2);
                    }
                }
            }
        }
        finishAndRemoveTask();
    }

    /* renamed from: m */
    public final void m3759m(String str) {
        Log.i("KahfPhoneEnroll", "DIAG ORG_QR forwarding to app");
        yy5.f51440e = str;
        startActivity(new Intent(this, (Class<?>) MainActivity.class).addFlags(872415232));
        finishAndRemoveTask();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
    
        if (p000.zy5.m23838d(p000.xa6.m21954d(r1), java.lang.Boolean.TRUE) != false) goto L47;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3760n(Uri uri) {
        String queryParameter;
        boolean z = true;
        this.f6255V = true;
        String stringFromPreferences = ((PreferencesHelper) this.f6249P.getValue()).getStringFromPreferences("kahf_phone_enroll_nonce", "");
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter("token");
        boolean z2 = queryParameter2 != null;
        boolean z3 = queryParameter3 != null;
        boolean z4 = stringFromPreferences.length() > 0;
        StringBuilder m19220u = tz6.m19220u("DIAG handleReturn hasState=", z2, " hasToken=", z3, " nonceStored=");
        m19220u.append(z4);
        Log.i("KahfPhoneEnroll", m19220u.toString());
        boolean m18260Z0 = stb.m18260Z0(stringFromPreferences);
        kr3 kr3Var = kr3.f22905a;
        lr3 lr3Var = lr3.f24947a;
        Object mr3Var = (!m18260Z0 && zy5.m23838d(queryParameter2, stringFromPreferences)) ? (queryParameter3 == null || stb.m18260Z0(queryParameter3)) ? kr3Var : new mr3(queryParameter3) : lr3Var;
        if (!(mr3Var instanceof mr3)) {
            if (mr3Var.equals(lr3Var)) {
                Log.w("KahfPhoneEnroll", "Enroll return rejected: state nonce mismatch");
                Log.i("KahfPhoneEnroll", "DIAG return=STATE_MISMATCH");
                m3757k(new hr3());
                return;
            } else if (!mr3Var.equals(kr3Var)) {
                gpc.m8801a();
                return;
            } else {
                Log.i("KahfPhoneEnroll", "DIAG return=MISSING_TOKEN");
                m3757k(gr3.f14749a);
                return;
            }
        }
        String str = ((mr3) mr3Var).f26942a;
        this.f6251R = str;
        gb6 gb6Var = ur3.f43073a;
        String str2 = null;
        try {
            List m18273m1 = stb.m18273m1(str, new char[]{'.'});
            if (m18273m1.size() >= 2) {
                String str3 = (String) m18273m1.get(1);
                int length = str3.length() % 4;
                if (length == 2) {
                    str3 = str3.concat("==");
                } else if (length == 3) {
                    str3 = str3.concat("=");
                }
                xo0.f48765e.getClass();
                String m23788u0 = ztb.m23788u0(xo0.m22206a(xo0.f48767g, str3, 0, 6));
                gb6 gb6Var2 = ur3.f43073a;
                gb6Var2.getClass();
                va6 va6Var = (va6) xa6.m21956f((va6) gb6Var2.m22748a(za6.f52030a, m23788u0)).get("isSupervised");
                ac6 m21957g = va6Var != null ? xa6.m21957g(va6Var) : null;
                if (m21957g != null && !m21957g.mo361c()) {
                }
            }
        } catch (Exception unused) {
        }
        z = false;
        Log.i("KahfPhoneEnroll", "DIAG return=VALID isChild=" + z);
        if (z && (queryParameter = uri.getQueryParameter("code")) != null) {
            if (stb.m18260Z0(queryParameter)) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                try {
                    Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.kahf.manager_pkg");
                    String str4 = invoke instanceof String ? (String) invoke : null;
                    if (str4 != null) {
                        if (str4.length() > 0) {
                            str2 = str4;
                        }
                    }
                } catch (Exception unused2) {
                }
                if (str2 != null) {
                    try {
                        sendBroadcast(new Intent("co.kahf.manager.action.ENROLL_CODE").setPackage(str2).putExtra("code", queryParameter).addFlags(32));
                    } catch (Exception e) {
                        Log.w("KahfPhoneEnroll", "failed to relay enroll code to Manager", e);
                    }
                }
            }
        }
        m3757k(new ir3(z));
    }

    @Override // p000.gx1, p000.fx1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qquouBmHq.nAFDGyK.invoke(null, this, bundle);
    }

    @Override // p000.gx1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String queryParameter;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            Uri uri = m3756o(data) ? data : null;
            if (uri != null && (queryParameter = uri.getQueryParameter("t")) != null && !stb.m18260Z0(queryParameter)) {
                str = queryParameter;
            }
        }
        if (str == null) {
            if (m3756o(data)) {
                data.getClass();
                m3760n(data);
                return;
            }
            return;
        }
        Boolean bool = o20.f29382f;
        if (bool != null ? bool.booleanValue() : false) {
            m3759m(str);
        } else {
            Log.i("KahfPhoneEnroll", "DIAG ORG_QR ignored: fleet disabled in this build");
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        ZaEQclIjTObv.QmmPIiZVC.invoke(null, this);
    }

    @Override // android.app.Activity
    public final void onResume() {
        qquouBmHq.jUg.invoke(null, this);
    }

    /* renamed from: p */
    public final FrameLayout m3761p() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-1);
        View progressBar = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        frameLayout.addView(progressBar);
        return frameLayout;
    }
}
