package com.kahf.dns.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.p006iR.SCIPs;
import coil3.gif.internal.oym.rEiUCjSwq;
import com.facebook.internal.p012Lq.hqZLxhHl;
import com.kahf.dns.R;
import com.kahf.dns.core.analytics.AnalyticsEvent;
import com.kahf.dns.resources.Res;
import com.kahf.dns.resources.String10_commonMainKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p000.AbstractC0432hy;
import p000.C0289e3;
import p000.C0368g8;
import p000.C0443i8;
import p000.C0450ig;
import p000.C0486jg;
import p000.C0523kg;
import p000.C0726py;
import p000.C0917v3;
import p000.C1001xd;
import p000.C1058yx;
import p000.C1066z4;
import p000.aad;
import p000.aj7;
import p000.b1e;
import p000.bha;
import p000.bi9;
import p000.bxc;
import p000.c13;
import p000.c3e;
import p000.d48;
import p000.db0;
import p000.dj3;
import p000.dl2;
import p000.dlb;
import p000.dt2;
import p000.dt4;
import p000.dt9;
import p000.ep3;
import p000.f8b;
import p000.f95;
import p000.fd6;
import p000.fke;
import p000.fs9;
import p000.gb6;
import p000.gpc;
import p000.gtb;
import p000.hj3;
import p000.i30;
import p000.i8b;
import p000.iw5;
import p000.jwb;
import p000.jzd;
import p000.k1a;
import p000.k83;
import p000.k97;
import p000.kwb;
import p000.lg2;
import p000.lwb;
import p000.ly6;
import p000.mg2;
import p000.mj9;
import p000.muc;
import p000.mv1;
import p000.n76;
import p000.nj9;
import p000.nu5;
import p000.nwc;
import p000.ny8;
import p000.o3e;
import p000.o9d;
import p000.og2;
import p000.oj8;
import p000.oj9;
import p000.ot0;
import p000.oy8;
import p000.p29;
import p000.p2b;
import p000.p47;
import p000.p9d;
import p000.pc2;
import p000.pj9;
import p000.pkb;
import p000.pr1;
import p000.pr9;
import p000.ps1;
import p000.pt0;
import p000.pud;
import p000.q0c;
import p000.q9d;
import p000.qa2;
import p000.qc2;
import p000.qi3;
import p000.ql4;
import p000.qr5;
import p000.qs1;
import p000.qt0;
import p000.r2b;
import p000.r2c;
import p000.r9d;
import p000.rj9;
import p000.rr9;
import p000.rt0;
import p000.rv4;
import p000.s4c;
import p000.s9d;
import p000.sa2;
import p000.sg7;
import p000.sj8;
import p000.ss3;
import p000.st0;
import p000.stb;
import p000.sx7;
import p000.sy0;
import p000.t37;
import p000.t8c;
import p000.t9d;
import p000.tl4;
import p000.tpc;
import p000.tr9;
import p000.txc;
import p000.tz6;
import p000.u03;
import p000.u6d;
import p000.us1;
import p000.ut0;
import p000.v11;
import p000.va9;
import p000.vic;
import p000.vl4;
import p000.vq8;
import p000.vt4;
import p000.vu2;
import p000.wic;
import p000.wnb;
import p000.wt0;
import p000.wu9;
import p000.x9d;
import p000.xa2;
import p000.xo3;
import p000.xv5;
import p000.y04;
import p000.y3c;
import p000.y9d;
import p000.ynb;
import p000.ysb;
import p000.yu9;
import p000.yw6;
import p000.ywb;
import p000.z9d;
import p000.zv5;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AndroidBillingManagerWithSubscription implements tr9 {
    public static final int $stable = 0;

    /* renamed from: A */
    public static final yu9 f6433A;

    /* renamed from: B */
    public static final ynb f6434B;

    /* renamed from: C */
    public static final yu9 f6435C;

    /* renamed from: D */
    public static final ynb f6436D;

    /* renamed from: E */
    public static final yu9 f6437E;

    /* renamed from: F */
    public static final ynb f6438F;

    /* renamed from: G */
    public static final yu9 f6439G;

    /* renamed from: H */
    public static final i8b f6440H;

    /* renamed from: I */
    public static final wu9 f6441I;
    public static final AndroidBillingManagerWithSubscription INSTANCE = new AndroidBillingManagerWithSubscription();

    /* renamed from: J */
    public static final i8b f6442J;

    /* renamed from: K */
    public static final wu9 f6443K;

    /* renamed from: L */
    public static final ConcurrentHashMap.KeySetView f6444L;

    /* renamed from: M */
    public static fd6 f6445M;

    /* renamed from: N */
    public static final C0368g8 f6446N;

    /* renamed from: O */
    public static final Object f6447O;

    /* renamed from: P */
    public static List f6448P;

    /* renamed from: Q */
    public static Set f6449Q;

    /* renamed from: R */
    public static final ynb f6450R;

    /* renamed from: S */
    public static final yu9 f6451S;

    /* renamed from: T */
    public static final ConcurrentHashMap.KeySetView f6452T;

    /* renamed from: U */
    public static final ConcurrentHashMap f6453U;

    /* renamed from: a */
    public static Context f6454a;

    /* renamed from: b */
    public static pt0 f6455b;

    /* renamed from: c */
    public static C1058yx f6456c;

    /* renamed from: d */
    public static vic f6457d;

    /* renamed from: e */
    public static C1001xd f6458e;

    /* renamed from: f */
    public static s4c f6459f;

    /* renamed from: g */
    public static PreferencesHelper f6460g;

    /* renamed from: h */
    public static volatile boolean f6461h;

    /* renamed from: i */
    public static final long f6462i;

    /* renamed from: j */
    public static volatile dlb f6463j;

    /* renamed from: k */
    public static volatile String f6464k;

    /* renamed from: l */
    public static final qa2 f6465l;

    /* renamed from: m */
    public static final AtomicBoolean f6466m;

    /* renamed from: n */
    public static final AtomicBoolean f6467n;

    /* renamed from: o */
    public static final AtomicBoolean f6468o;

    /* renamed from: p */
    public static final AtomicBoolean f6469p;

    /* renamed from: q */
    public static final AtomicBoolean f6470q;

    /* renamed from: r */
    public static List f6471r;

    /* renamed from: s */
    public static List f6472s;

    /* renamed from: t */
    public static Set f6473t;

    /* renamed from: u */
    public static final AtomicInteger f6474u;

    /* renamed from: v */
    public static final byte f6475v;

    /* renamed from: w */
    public static final short f6476w;

    /* renamed from: x */
    public static final ynb f6477x;

    /* renamed from: y */
    public static final yu9 f6478y;

    /* renamed from: z */
    public static final ynb f6479z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final class FailureReason {
        private static final /* synthetic */ ss3 $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason BILLING_FAILED = new FailureReason("BILLING_FAILED", 0);
        public static final FailureReason BACKEND_VERIFICATION_FAILED = new FailureReason("BACKEND_VERIFICATION_FAILED", 1);
        public static final FailureReason USER_CANCELED = new FailureReason("USER_CANCELED", 2);
        public static final FailureReason ALREADY_OWNED = new FailureReason("ALREADY_OWNED", 3);
        public static final FailureReason SERVICE_UNAVAILABLE = new FailureReason("SERVICE_UNAVAILABLE", 4);
        public static final FailureReason PURCHASE_NOT_LINKED = new FailureReason("PURCHASE_NOT_LINKED", 5);
        public static final FailureReason UNKNOWN = new FailureReason("UNKNOWN", 6);

        private static final /* synthetic */ FailureReason[] $values() {
            return new FailureReason[]{BILLING_FAILED, BACKEND_VERIFICATION_FAILED, USER_CANCELED, ALREADY_OWNED, SERVICE_UNAVAILABLE, PURCHASE_NOT_LINKED, UNKNOWN};
        }

        static {
            FailureReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ysb.m22999h($values);
        }

        private FailureReason(String str, int i) {
        }

        public static ss3 getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final class LaunchOffer {
        public static final int $stable = 0;
        private final String basePlanId;
        private final boolean hasFreePhase;
        private final String offerId;

        public LaunchOffer(String str, String str2, boolean z) {
            str2.getClass();
            this.offerId = str;
            this.basePlanId = str2;
            this.hasFreePhase = z;
        }

        public static /* synthetic */ LaunchOffer copy$default(LaunchOffer launchOffer, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchOffer.offerId;
            }
            if ((i & 2) != 0) {
                str2 = launchOffer.basePlanId;
            }
            if ((i & 4) != 0) {
                z = launchOffer.hasFreePhase;
            }
            return launchOffer.copy(str, str2, z);
        }

        public final String component1() {
            return this.offerId;
        }

        public final String component2() {
            return this.basePlanId;
        }

        public final boolean component3() {
            return this.hasFreePhase;
        }

        public final LaunchOffer copy(String str, String str2, boolean z) {
            str2.getClass();
            return new LaunchOffer(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchOffer)) {
                return false;
            }
            LaunchOffer launchOffer = (LaunchOffer) obj;
            return zy5.m23838d(this.offerId, launchOffer.offerId) && zy5.m23838d(this.basePlanId, launchOffer.basePlanId) && this.hasFreePhase == launchOffer.hasFreePhase;
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final boolean getHasFreePhase() {
            return this.hasFreePhase;
        }

        public final String getOfferId() {
            return this.offerId;
        }

        public int hashCode() {
            String str = this.offerId;
            return Boolean.hashCode(this.hasFreePhase) + t8c.m18683g((str == null ? 0 : str.hashCode()) * 31, this.basePlanId, 31);
        }

        public String toString() {
            String str = this.offerId;
            String str2 = this.basePlanId;
            return tz6.m19215p(pr1.m15984r("LaunchOffer(offerId=", str, ", basePlanId=", str2, ", hasFreePhase="), this.hasFreePhase, ")");
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ql4.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        f95 f95Var = dj3.f8146v;
        f6462i = qr5.m16842H(24, hj3.HOURS);
        f6463j = pkb.f32808a;
        q0c m18375J = sy0.m18375J();
        vu2 vu2Var = k83.f21845a;
        f6465l = muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v));
        f6466m = new AtomicBoolean(false);
        f6467n = new AtomicBoolean(false);
        f6468o = new AtomicBoolean(false);
        f6469p = new AtomicBoolean(false);
        f6470q = new AtomicBoolean(false);
        xo3 xo3Var = xo3.f48775u;
        f6471r = xo3Var;
        f6472s = xo3Var;
        f6473t = ep3.f10423u;
        f6474u = new AtomicInteger(0);
        f6475v = (byte) 3;
        f6476w = (short) 2000;
        ynb m2069a = bha.m2069a(xo3Var);
        f6477x = m2069a;
        f6478y = dl2.m6406b(m2069a);
        ynb m2069a2 = bha.m2069a(xo3Var);
        f6479z = m2069a2;
        f6433A = dl2.m6406b(m2069a2);
        ynb m2069a3 = bha.m2069a("USD");
        f6434B = m2069a3;
        f6435C = dl2.m6406b(m2069a3);
        ynb m2069a4 = bha.m2069a(xo3Var);
        f6436D = m2069a4;
        f6437E = dl2.m6406b(m2069a4);
        ynb m2069a5 = bha.m2069a(xo3Var);
        f6438F = m2069a5;
        f6439G = dl2.m6406b(m2069a5);
        i8b m10679g = iw5.m10679g(0, 64, null, 4);
        f6440H = m10679g;
        f6441I = new wu9(m10679g);
        i8b m10679g2 = iw5.m10679g(0, 64, null, 4);
        f6442J = m10679g2;
        f6443K = new wu9(m10679g2);
        f6444L = ConcurrentHashMap.newKeySet();
        f6446N = new C0368g8();
        f6447O = new Object();
        f6448P = xo3Var;
        f6449Q = new LinkedHashSet();
        ynb m2069a6 = bha.m2069a(null);
        f6450R = m2069a6;
        f6451S = dl2.m6406b(m2069a6);
        f6452T = ConcurrentHashMap.newKeySet();
        f6453U = new ConcurrentHashMap();
    }

    /* renamed from: B */
    public static final void m5534B(String str, Integer num, String str2, boolean z, Boolean bool, rv4 rv4Var) {
        sx7 sx7Var = sx7.f39332a;
        String m17544b = rv4Var.m17544b();
        String m17543a = rv4Var.m17543a();
        String m17546d = rv4Var.m17546d();
        StringBuilder m15984r = pr1.m15984r("Verification failed [", m17544b, "/", m17543a, "]: ");
        m15984r.append(m17546d);
        sx7.m18366d(2, m15984r.toString(), "androidBilling", null);
        AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
        AnalyticsEvent.UserJourneyEvent.IapVerificationResult iapVerificationResult = new AnalyticsEvent.UserJourneyEvent.IapVerificationResult("failed", str, str2, z, rv4Var.m17544b(), rv4Var.m17543a(), bool);
        androidBillingManagerWithSubscription.getClass();
        m5546l(iapVerificationResult);
        String m17544b2 = rv4Var.m17544b();
        String m17543a2 = rv4Var.m17543a();
        String m19211l = m17543a2 != null ? tz6.m19211l("[", m17543a2, "] ", rv4Var.m17546d()) : rv4Var.m17546d();
        androidBillingManagerWithSubscription.getClass();
        m5544i(m17544b2, m19211l, str, true, num);
    }

    /* renamed from: C */
    public static Boolean m5535C(pr9 pr9Var) {
        SharedPreferences m5537b = m5537b();
        if (m5537b == null) {
            return null;
        }
        String m15999b = pr9Var.m15999b();
        m15999b.getClass();
        String concat = "trial:token:".concat(m15999b);
        if (m5537b.contains(concat)) {
            return Boolean.valueOf(m5537b.getBoolean(concat, false));
        }
        String str = (String) ps1.m16039q0(pr9Var.m16000c());
        if (str == null) {
            str = "";
        }
        String m5558y = m5558y(str);
        if (m5537b.contains(m5558y)) {
            return Boolean.valueOf(m5537b.getBoolean(m5558y, false));
        }
        return null;
    }

    /* renamed from: D */
    public static void m5536D(rr9 rr9Var, String str, t9d t9dVar) {
        SharedPreferences m5550p = m5550p();
        m5550p.getClass();
        SharedPreferences.Editor edit = m5550p.edit();
        edit.getClass();
        edit.putString(k97.m11870D(rr9Var, str), x9d.m21946b(t9dVar));
        edit.commit();
    }

    public static final void access$clearAccountScopedStateLocked(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription) {
        androidBillingManagerWithSubscription.getClass();
        Collection values = f6453U.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((n76) it.next()).mo6991b(null);
        }
        f6453U.clear();
        if (f6454a == null) {
            return;
        }
        Set<String> keySet = m5550p().getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (k97.m11904x((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences m5550p = m5550p();
            m5550p.getClass();
            SharedPreferences.Editor edit = m5550p.edit();
            edit.getClass();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                edit.remove((String) it2.next());
            }
            edit.commit();
        }
        synchronized (f6447O) {
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription2 = INSTANCE;
            xo3 xo3Var = xo3.f48775u;
            androidBillingManagerWithSubscription2.getClass();
            m5548n(xo3Var);
        }
        sx7.m18367e(sx7.f39332a, pr1.m15973g(arrayList.size(), "Logout: cleared ", " purchase verification records"), "androidBilling", 2);
    }

    public static final String access$currentAccountId(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription) {
        String stringFromPreferences$default;
        androidBillingManagerWithSubscription.getClass();
        PreferencesHelper preferencesHelper = f6460g;
        if (preferencesHelper == null || (stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default(preferencesHelper, PrefKeys.KEY_USER_ID, null, 2, null)) == null || stb.m18260Z0(stringFromPreferences$default)) {
            return null;
        }
        return stringFromPreferences$default;
    }

    public static final /* synthetic */ void access$emitPurchaseResult(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, PurchaseResult purchaseResult) {
        androidBillingManagerWithSubscription.getClass();
        m5539d(purchaseResult);
    }

    public static final /* synthetic */ void access$finalizeWithGoogle(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, pr9 pr9Var, rr9 rr9Var) {
        androidBillingManagerWithSubscription.getClass();
        m5540e(rr9Var, pr9Var);
    }

    public static final rr9 access$kindOf(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, pr9 pr9Var) {
        Object obj;
        androidBillingManagerWithSubscription.getClass();
        String str = (String) ps1.m16039q0(pr9Var.m16000c());
        if (str == null) {
            str = "";
        }
        Iterator it = ((Iterable) f6477x.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (zy5.m23838d(((pj9) obj).f32740c, str)) {
                break;
            }
        }
        pj9 pj9Var = (pj9) obj;
        String str2 = pj9Var != null ? pj9Var.f32741d : null;
        List list = f6472s;
        rr9.f37170v.getClass();
        return p2b.m15461E(str2, str, list);
    }

    public static final t9d access$loadVerificationRecord(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, rr9 rr9Var, String str) {
        androidBillingManagerWithSubscription.getClass();
        String string = m5550p().getString(k97.m11870D(rr9Var, str), null);
        if (string != null) {
            return x9d.m21945a(string);
        }
        return null;
    }

    public static final /* synthetic */ void access$persistPendingCelebrations(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, List list) {
        androidBillingManagerWithSubscription.getClass();
        m5548n(list);
    }

    public static final /* synthetic */ void access$processPurchases(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, List list, aad aadVar, vl4 vl4Var, long j) {
        androidBillingManagerWithSubscription.getClass();
        m5551q(list, aadVar, vl4Var, j);
    }

    public static final void access$retryConnection(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription) {
        androidBillingManagerWithSubscription.getClass();
        if (!f6466m.get()) {
            sx7.m18364b(sx7.f39332a, "Billing client was deinitialized, skipping retry", "androidBilling", 2);
        } else {
            sx7.m18364b(sx7.f39332a, "🔄 Retrying billing connection...", "androidBilling", 2);
            m5556w();
        }
    }

    public static final /* synthetic */ PurchaseResult access$successResult(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, ny8 ny8Var) {
        androidBillingManagerWithSubscription.getClass();
        return m5557x(ny8Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(3:(1:(1:(7:13|14|15|16|(1:18)|19|20)(2:22|23))(11:24|25|26|27|28|(5:30|(12:(1:33)(1:61)|34|(1:36)|37|(1:39)(1:60)|40|41|42|43|44|26b|49)|(0)|19|20)|62|(0)|(0)|19|20))(4:66|67|68|69)|(1:58)|59)(8:99|(1:101)|102|(1:104)(1:135)|105|(1:107)(1:134)|108|(2:110|111)(4:112|(1:133)(1:118)|119|(3:124|125|(2:127|128)(1:129))(2:122|123)))|70|(5:72|(1:74)(1:88)|(1:76)(1:87)|77|(2:79|(2:81|(2:83|84)(5:85|28|(0)|62|(0)))(3:86|62|(0))))(2:89|(3:93|(1:95)|16))|(0)|19|20))|137|6|7|8|(0)(0)|70|(0)(0)|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0069, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01af A[Catch: all -> 0x0069, TryCatch #4 {all -> 0x0069, blocks: (B:14:0x0063, B:16:0x0302, B:28:0x0221, B:34:0x023a, B:37:0x0249, B:44:0x0269, B:45:0x026b, B:48:0x027c, B:49:0x027d, B:52:0x0287, B:53:0x0288, B:70:0x01a9, B:72:0x01af, B:77:0x01e9, B:79:0x01f1, B:81:0x01f5, B:89:0x028e, B:91:0x02d6, B:93:0x02de, B:47:0x026c), top: B:8:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028e A[Catch: all -> 0x0069, TryCatch #4 {all -> 0x0069, blocks: (B:14:0x0063, B:16:0x0302, B:28:0x0221, B:34:0x023a, B:37:0x0249, B:44:0x0269, B:45:0x026b, B:48:0x027c, B:49:0x027d, B:52:0x0287, B:53:0x0288, B:70:0x01a9, B:72:0x01af, B:77:0x01e9, B:79:0x01f1, B:81:0x01f5, B:89:0x028e, B:91:0x02d6, B:93:0x02de, B:47:0x026c), top: B:8:0x0035, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v33, types: [fd6] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.concurrent.ConcurrentHashMap$KeySetView] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ConcurrentHashMap$KeySetView] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.kahf.dns.utils.AndroidBillingManagerWithSubscription, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$verifyAndFinalize(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, pr9 pr9Var, rr9 rr9Var, aad aadVar, long j, xa2 xa2Var) {
        AndroidBillingManagerWithSubscription$verifyAndFinalize$1 androidBillingManagerWithSubscription$verifyAndFinalize$1;
        ?? r3;
        String str;
        String str2;
        Object m5559A;
        int i;
        String str3;
        String str4;
        Boolean bool;
        int i2;
        rr9 rr9Var2;
        pr9 pr9Var2;
        String stringFromPreferences$default;
        rv4 rv4Var;
        AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription2;
        byte b;
        boolean z;
        pr9 pr9Var3;
        String str5;
        String str6;
        String str7;
        boolean z2;
        byte b2;
        String str8;
        boolean z3;
        boolean booleanValue;
        long j2 = j;
        androidBillingManagerWithSubscription.getClass();
        ?? r2 = "🔐 Starting backend verification for ";
        if (xa2Var instanceof AndroidBillingManagerWithSubscription$verifyAndFinalize$1) {
            androidBillingManagerWithSubscription$verifyAndFinalize$1 = (AndroidBillingManagerWithSubscription$verifyAndFinalize$1) xa2Var;
            int i3 = androidBillingManagerWithSubscription$verifyAndFinalize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                androidBillingManagerWithSubscription$verifyAndFinalize$1.label = i3 - Integer.MIN_VALUE;
                AndroidBillingManagerWithSubscription$verifyAndFinalize$1 androidBillingManagerWithSubscription$verifyAndFinalize$12 = androidBillingManagerWithSubscription$verifyAndFinalize$1;
                Object obj = androidBillingManagerWithSubscription$verifyAndFinalize$12.result;
                qc2 qc2Var = qc2.f34309u;
                r3 = androidBillingManagerWithSubscription$verifyAndFinalize$12.label;
                if (r3 == 0) {
                    if (r3 == 1) {
                        r2 = androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0;
                        int i4 = androidBillingManagerWithSubscription$verifyAndFinalize$12.I$1;
                        i = androidBillingManagerWithSubscription$verifyAndFinalize$12.I$0;
                        j2 = androidBillingManagerWithSubscription$verifyAndFinalize$12.J$0;
                        bool = (Boolean) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$6;
                        str3 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$5;
                        String str9 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4;
                        String str10 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$3;
                        rr9Var2 = (rr9) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$1;
                        pr9 pr9Var4 = (pr9) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$0;
                        try {
                            v11.m20244z(obj);
                            i2 = i4;
                            r3 = str9;
                            str4 = str10;
                            str = "❌ Backend verification FAILED for ";
                            str2 = "✅ Backend verification SUCCESS for ";
                            m5559A = obj;
                            pr9Var2 = pr9Var4;
                            r2 = r2;
                        } catch (Throwable th) {
                            th = th;
                            r3 = str9;
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 != 3) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z4 = androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0;
                            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription3 = (AndroidBillingManagerWithSubscription) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$8;
                            String str11 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4;
                            v11.m20244z(obj);
                            androidBillingManagerWithSubscription2 = androidBillingManagerWithSubscription3;
                            r2 = z4;
                            r3 = str11;
                            androidBillingManagerWithSubscription2.getClass();
                            m5539d((PurchaseResult) obj);
                            if (r2 != 0) {
                                f6452T.remove(r3);
                            }
                            return txc.f41359a;
                        }
                        r2 = androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0;
                        int i5 = androidBillingManagerWithSubscription$verifyAndFinalize$12.I$0;
                        Boolean bool2 = (Boolean) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$6;
                        str5 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$5;
                        String str12 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4;
                        str6 = (String) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$3;
                        pr9Var3 = (pr9) androidBillingManagerWithSubscription$verifyAndFinalize$12.L$0;
                        try {
                            v11.m20244z(obj);
                            bool = bool2;
                            b = 0;
                            i = i5;
                            str8 = str12;
                            z3 = r2;
                            booleanValue = ((Boolean) obj).booleanValue();
                            z = true;
                            pr9Var2 = pr9Var3;
                            str3 = str5;
                            str4 = str6;
                            z2 = z3;
                            str7 = str8;
                            if (booleanValue) {
                                b2 = 1;
                                r2 = z3;
                                r3 = str8;
                                if (b2 != 0) {
                                    ?? r9 = i != 0 ? z : b;
                                    String optString = pr9Var2.f33151c.optString("orderId");
                                    if (TextUtils.isEmpty(optString)) {
                                        optString = null;
                                    }
                                    androidBillingManagerWithSubscription.m5561k(str4, optString, r9);
                                    String str13 = r3;
                                    try {
                                        ny8 ny8Var = new ny8(str13, str4, i != 0 ? z : b, bool, str3);
                                        r3 = str13;
                                        synchronized (f6447O) {
                                            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription4 = INSTANCE;
                                            gb6 gb6Var = oy8.f31469a;
                                            List m15416d = oy8.m15416d(f6448P, ny8Var);
                                            androidBillingManagerWithSubscription4.getClass();
                                            m5548n(m15416d);
                                        }
                                        m5539d(m5557x(ny8Var));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r3 = str13;
                                    }
                                }
                                if (r2 != 0) {
                                }
                                return txc.f41359a;
                            }
                            b2 = b;
                            r2 = z2;
                            r3 = str7;
                            if (b2 != 0) {
                            }
                            if (r2 != 0) {
                            }
                            return txc.f41359a;
                        } catch (Throwable th3) {
                            th = th3;
                            r3 = str12;
                        }
                    }
                    if (r2 != 0) {
                        f6452T.remove(r3);
                    }
                    throw th;
                }
                v11.m20244z(obj);
                String str14 = (String) ps1.m16039q0(pr9Var.m16000c());
                if (str14 == null) {
                    str14 = "";
                }
                String str15 = str14;
                String m15999b = pr9Var.m15999b();
                m15999b.getClass();
                int i6 = rr9Var == rr9.SUBSCRIPTION ? 1 : 0;
                ?? r32 = aadVar != aad.f555u ? 1 : 0;
                if (!f6446N.m8419c(j2)) {
                    sx7.m18364b(sx7.f39332a, "⏭️ Account changed; dropping verification for ".concat(str15), "androidBilling", 2);
                    return txc.f41359a;
                }
                PreferencesHelper preferencesHelper = f6460g;
                String str16 = (preferencesHelper == null || (stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default(preferencesHelper, PrefKeys.KEY_USER_ID, null, 2, null)) == null || stb.m18260Z0(stringFromPreferences$default)) ? null : stringFromPreferences$default;
                boolean add = f6452T.add(m15999b);
                if (!add && r32 != 0) {
                    sx7.m18364b(sx7.f39332a, "⏭️ Verification already running for ".concat(str15), "androidBilling", 2);
                    return txc.f41359a;
                }
                try {
                    m5553s(pr9Var);
                    Boolean m5535C = m5535C(pr9Var);
                    str = "❌ Backend verification FAILED for ";
                    str2 = "✅ Backend verification SUCCESS for ";
                    sx7.m18364b(sx7.f39332a, "🔐 Starting backend verification for " + str15 + "...", "androidBilling", 2);
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$0 = pr9Var;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$1 = rr9Var;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$2 = null;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$3 = str15;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4 = m15999b;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$5 = str16;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.L$6 = m5535C;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.J$0 = j2;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.I$0 = i6;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.I$1 = r32;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0 = add;
                    androidBillingManagerWithSubscription$verifyAndFinalize$12.label = 1;
                    ?? r22 = i6;
                    m5559A = androidBillingManagerWithSubscription.m5559A(pr9Var, r22, r32, m5535C, androidBillingManagerWithSubscription$verifyAndFinalize$12);
                    if (m5559A == qc2Var) {
                        return qc2Var;
                    }
                    i = r22 == true ? 1 : 0;
                    r2 = add;
                    str3 = str16;
                    str4 = str15;
                    bool = m5535C;
                    i2 = r32;
                    r3 = m15999b;
                    rr9Var2 = rr9Var;
                    pr9Var2 = pr9Var;
                } catch (Throwable th4) {
                    th = th4;
                    r3 = m15999b;
                    r2 = add;
                }
                rv4Var = (rv4) m5559A;
                if (rv4Var != null) {
                    sx7.m18367e(sx7.f39332a, str2 + str4, "androidBilling", 2);
                    List list = z9d.f52010a;
                    b = 0;
                    boolean z5 = f6446N.m8418b(j2, new C0450ig(rr9Var2, (Object) r3, z9d.m23476b(zv5.f53149a.mo2814g(), str3), b)) != null;
                    m5541f(pr9Var2, i != 0);
                    m5540e(rr9Var2, pr9Var2);
                    if (z5) {
                        ?? r0 = f6445M;
                        if (r0 != 0) {
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$0 = pr9Var2;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$1 = null;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$2 = null;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$3 = str4;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4 = r3;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$5 = str3;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$6 = bool;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.L$7 = null;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.J$0 = j2;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.I$0 = i;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.I$1 = i2;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0 = r2;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$1 = z5;
                            androidBillingManagerWithSubscription$verifyAndFinalize$12.label = 2;
                            Object m7907v = r0.m7907v(r3, androidBillingManagerWithSubscription$verifyAndFinalize$12);
                            if (m7907v == qc2Var) {
                                return qc2Var;
                            }
                            pr9Var3 = pr9Var2;
                            str5 = str3;
                            str6 = str4;
                            obj = m7907v;
                            z3 = r2;
                            str8 = r3;
                            booleanValue = ((Boolean) obj).booleanValue();
                            z = true;
                            pr9Var2 = pr9Var3;
                            str3 = str5;
                            str4 = str6;
                            z2 = z3;
                            str7 = str8;
                            if (booleanValue) {
                            }
                            b2 = b;
                            r2 = z2;
                            r3 = str7;
                            if (b2 != 0) {
                            }
                        } else {
                            z = true;
                            z2 = r2;
                            str7 = r3;
                            b2 = b;
                            r2 = z2;
                            r3 = str7;
                            if (b2 != 0) {
                            }
                        }
                    }
                } else {
                    androidBillingManagerWithSubscription2 = androidBillingManagerWithSubscription;
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18366d(2, str + str4 + " (" + rv4Var.m17545c() + ", code=" + rv4Var.m17543a() + ")", "androidBilling", null);
                    long j3 = j2;
                    m5555v(pr9Var2, rr9Var2, rv4Var, j3, str3);
                    if (i2 == 0 && f6446N.m8419c(j3)) {
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$0 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$1 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$2 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$3 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$4 = r3;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$5 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$6 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$7 = null;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.L$8 = androidBillingManagerWithSubscription2;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.J$0 = j3;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.I$0 = i;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.I$1 = i2;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.Z$0 = r2;
                        androidBillingManagerWithSubscription$verifyAndFinalize$12.label = 3;
                        obj = androidBillingManagerWithSubscription2.m5563z(str4, rv4Var, androidBillingManagerWithSubscription$verifyAndFinalize$12);
                        r2 = r2;
                        r3 = r3;
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                        androidBillingManagerWithSubscription2.getClass();
                        m5539d((PurchaseResult) obj);
                    }
                }
                if (r2 != 0) {
                }
                return txc.f41359a;
            }
        }
        androidBillingManagerWithSubscription$verifyAndFinalize$1 = new AndroidBillingManagerWithSubscription$verifyAndFinalize$1(androidBillingManagerWithSubscription, xa2Var);
        AndroidBillingManagerWithSubscription$verifyAndFinalize$1 androidBillingManagerWithSubscription$verifyAndFinalize$122 = androidBillingManagerWithSubscription$verifyAndFinalize$1;
        Object obj2 = androidBillingManagerWithSubscription$verifyAndFinalize$122.result;
        qc2 qc2Var2 = qc2.f34309u;
        r3 = androidBillingManagerWithSubscription$verifyAndFinalize$122.label;
        if (r3 == 0) {
        }
        rv4Var = (rv4) m5559A;
        if (rv4Var != null) {
        }
        if (r2 != 0) {
        }
        return txc.f41359a;
    }

    /* renamed from: b */
    public static SharedPreferences m5537b() {
        Context context = f6454a;
        if (context != null) {
            return context.getSharedPreferences("iap_backend_product_code_overrides", 0);
        }
        return null;
    }

    /* renamed from: c */
    public static void m5538c(pr9 pr9Var) {
        SharedPreferences m5537b = m5537b();
        if (m5537b != null) {
            SharedPreferences.Editor edit = m5537b.edit();
            edit.getClass();
            String str = (String) ps1.m16039q0(pr9Var.m16000c());
            if (str == null) {
                str = "";
            }
            edit.remove(str);
            edit.remove("token:" + pr9Var.m15999b());
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
            String str2 = (String) ps1.m16039q0(pr9Var.m16000c());
            String str3 = str2 != null ? str2 : "";
            androidBillingManagerWithSubscription.getClass();
            edit.remove(m5558y(str3));
            String m15999b = pr9Var.m15999b();
            m15999b.getClass();
            edit.remove("trial:token:".concat(m15999b));
            edit.commit();
        }
    }

    /* renamed from: d */
    public static void m5539d(PurchaseResult purchaseResult) {
        jzd.m11709o(f6465l, null, null, new AndroidBillingManagerWithSubscription$emitPurchaseResult$1(purchaseResult, null), 3);
    }

    /* renamed from: f */
    public static void m5541f(pr9 pr9Var, boolean z) {
        ArrayList m16000c = pr9Var.m16000c();
        JSONObject jSONObject = pr9Var.f33151c;
        String str = (String) ps1.m16039q0(m16000c);
        if (str == null) {
            str = "";
        }
        String m15999b = pr9Var.m15999b();
        m15999b.getClass();
        String str2 = z ? "subscription" : "lifetime";
        sx7 sx7Var = sx7.f39332a;
        sx7.m18367e(sx7Var, tz6.m19211l("🎁 Granting ", str2, " entitlement for productId=", str), "androidBilling", 2);
        String m18283w1 = stb.m18283w1(20, m15999b);
        String optString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        sx7.m18364b(sx7Var, tz6.m19211l("📋 Purchase details: token=", m18283w1, "..., orderId=", optString), "androidBilling", 2);
        sx7.m18364b(sx7Var, "📋 Purchase time: " + jSONObject.optLong("purchaseTime") + ", acknowledged: " + jSONObject.optBoolean("acknowledged", true), "androidBilling", 2);
        sx7.m18367e(sx7Var, pr1.m15981o(new StringBuilder("✅ "), str2, " entitlement granted successfully for ", str, "!"), "androidBilling", 2);
    }

    /* renamed from: g */
    public static void m5542g(wt0 wt0Var, dt4 dt4Var, String str) {
        Iterator it;
        xo3 xo3Var;
        bi9 bi9Var;
        String str2;
        String m13465a;
        int i = wt0Var.f47095a;
        byte b = 0;
        boolean z = i == 0;
        sx7 sx7Var = sx7.f39332a;
        String str3 = wt0Var.f47097c;
        StringBuilder m18105q = sj8.m18105q(i, "queryProductDetailsAsync (", str, "): code=", ", msg=");
        m18105q.append(str3);
        sx7.m18364b(sx7Var, m18105q.toString(), "androidBilling", 2);
        if (z) {
            List m6589T = dt4Var.m6589T();
            xo3 xo3Var2 = xo3.f48775u;
            if (m6589T == null) {
                m6589T = xo3Var2;
            }
            sx7.m18364b(sx7Var, "ProductDetails 111 (" + str + "): " + m6589T + " items", "androidBilling", 2);
            ynb ynbVar = f6477x;
            ArrayList m16025X0 = ps1.m16025X0((Collection) ynbVar.getValue());
            us1.m20015d0(m16025X0, new C0486jg(str, b));
            m16025X0.addAll(m6589T);
            ynbVar.getClass();
            Object obj = null;
            ynbVar.m22921k(null, m16025X0);
            List list = (List) ynbVar.getValue();
            StringBuilder m15982p = pr1.m15982p(((List) ynbVar.getValue()).size(), "ProductDetails ", " (", str, "): ");
            m15982p.append(list);
            sx7.m18364b(sx7Var, m15982p.toString(), "androidBilling", 2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((Iterable) ynbVar.getValue()).iterator();
            while (it2.hasNext()) {
                pj9 pj9Var = (pj9) it2.next();
                mj9 m15848a = pj9Var.m15848a();
                ArrayList arrayList2 = pj9Var.f32746i;
                String str4 = pj9Var.f32743f;
                String str5 = pj9Var.f32742e;
                String str6 = pj9Var.f32740c;
                ynb ynbVar2 = f6434B;
                if (m15848a != null) {
                    mj9 m15848a2 = pj9Var.m15848a();
                    String str7 = "Null";
                    if (m15848a2 == null || (str2 = m15848a2.m13467c()) == null) {
                        str2 = "Null";
                    }
                    ynbVar2.getClass();
                    ynbVar2.m22921k(obj, str2);
                    str6.getClass();
                    str5.getClass();
                    str4.getClass();
                    if (m15848a2 != null && (m13465a = m15848a2.m13465a()) != null) {
                        str7 = m13465a;
                    }
                    arrayList.add(new nwc(str6, str5, str4, str7));
                } else if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i2 = 10;
                    ArrayList arrayList3 = new ArrayList(qs1.m16870Y(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        oj9 oj9Var = (oj9) it3.next();
                        String m15142a = oj9Var.m15142a();
                        m15142a.getClass();
                        String m15143b = oj9Var.m15143b();
                        String m15144c = oj9Var.m15144c();
                        m15144c.getClass();
                        ArrayList m7745d = oj9Var.m15145d().m7745d();
                        Iterator it4 = it2;
                        ArrayList arrayList4 = new ArrayList(qs1.m16870Y(m7745d, i2));
                        Iterator it5 = m7745d.iterator();
                        while (it5.hasNext()) {
                            nj9 nj9Var = (nj9) it5.next();
                            String m14237e = nj9Var.m14237e();
                            m14237e.getClass();
                            ynbVar2.getClass();
                            ynbVar2.m22921k(null, m14237e);
                            String m14235c = nj9Var.m14235c();
                            m14235c.getClass();
                            xo3 xo3Var3 = xo3Var2;
                            String m14234b = nj9Var.m14234b();
                            m14234b.getClass();
                            arrayList4.add(new bi9(nj9Var.m14233a(), nj9Var.m14238f(), m14235c, m14234b));
                            it5 = it5;
                            xo3Var2 = xo3Var3;
                            it3 = it3;
                        }
                        arrayList3.add(new ywb(m15142a, m15143b, m15144c, arrayList4));
                        it2 = it4;
                        i2 = 10;
                    }
                    it = it2;
                    xo3Var = xo3Var2;
                    ywb ywbVar = (ywb) ps1.m16039q0(arrayList3);
                    String m2111a = (ywbVar == null || (bi9Var = (bi9) ps1.m16039q0(ywbVar.m23134a())) == null) ? "" : bi9Var.m2111a();
                    str6.getClass();
                    str5.getClass();
                    str4.getClass();
                    arrayList.add(new nwc(str6, str5, str4, m2111a, "subs", arrayList3));
                    it2 = it;
                    xo3Var2 = xo3Var;
                    obj = null;
                }
                it = it2;
                xo3Var = xo3Var2;
                it2 = it;
                xo3Var2 = xo3Var;
                obj = null;
            }
            xo3 xo3Var4 = xo3Var2;
            ynb ynbVar3 = f6479z;
            ynbVar3.getClass();
            ynbVar3.m22921k(null, arrayList);
            sx7.m18364b(sx7.f39332a, pr1.m15973g(arrayList.size(), "Updated UI products: ", " total"), "androidBilling", 2);
            List m6591V = dt4Var.m6591V();
            for (bxc bxcVar : m6591V == null ? xo3Var4 : m6591V) {
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18370h(2, "Unfetched: id=" + bxcVar.m2537a() + ", status=" + bxcVar.m2538b(), "androidBilling");
            }
        }
    }

    /* renamed from: h */
    public static boolean m5543h(oj9 oj9Var) {
        ArrayList m7745d = oj9Var.m15145d().m7745d();
        if (m7745d.isEmpty()) {
            return false;
        }
        Iterator it = m7745d.iterator();
        while (it.hasNext()) {
            if (((nj9) it.next()).m14236d() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static void m5544i(String str, String str2, String str3, boolean z, Integer num) {
        String m19210k = str3 != null ? tz6.m19210k("(productId: ", str3, ")") : "";
        StringBuilder m15984r = pr1.m15984r("Billing Error [", str, "]: ", str2, " ");
        m15984r.append(m19210k);
        Log.e("AndroidBilling", m15984r.toString());
        try {
            AnalyticsEvent backendVerificationFailure = z ? new AnalyticsEvent.BillingErrorEvent.BackendVerificationFailure(str, str2, str3, num) : new AnalyticsEvent.BillingErrorEvent.PurchaseFlowFailure(str, str2, str3);
            C1001xd c1001xd = f6458e;
            if (c1001xd != null) {
                c1001xd.m22025b(backendVerificationFailure);
            }
        } catch (Exception e) {
            Log.w("AndroidBilling", "Failed to log billing error to analytics: " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, Context context, List list, List list2, Set set, C1058yx c1058yx, vic vicVar, C1001xd c1001xd, s4c s4cVar, PreferencesHelper preferencesHelper, d48 d48Var, int i, Object obj) {
        int i2 = i & 2;
        xo3 xo3Var = xo3.f48775u;
        if (i2 != 0) {
            list = xo3Var;
        }
        if ((i & 4) != 0) {
            list2 = xo3Var;
        }
        if ((i & 8) != 0) {
            set = ep3.f10423u;
        }
        if ((i & 16) != 0) {
            c1058yx = null;
        }
        if ((i & 32) != 0) {
            vicVar = null;
        }
        if ((i & 64) != 0) {
            c1001xd = null;
        }
        if ((i & 128) != 0) {
            s4cVar = null;
        }
        if ((i & 256) != 0) {
            preferencesHelper = null;
        }
        if ((i & 512) != 0) {
            d48Var = null;
        }
        androidBillingManagerWithSubscription.init(context, list, list2, set, c1058yx, vicVar, c1001xd, s4cVar, preferencesHelper, d48Var);
    }

    /* renamed from: j */
    public static /* synthetic */ void m5545j(int i, String str, String str2, String str3) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        m5544i(str, str2, str3, (i & 8) == 0, null);
    }

    /* renamed from: l */
    public static void m5546l(AnalyticsEvent.UserJourneyEvent userJourneyEvent) {
        try {
            C1001xd c1001xd = f6458e;
            if (c1001xd != null) {
                c1001xd.m22025b(userJourneyEvent);
            }
        } catch (Exception e) {
            Log.w("AndroidBilling", "Failed to log journey event to analytics: " + e.getMessage());
        }
    }

    public static /* synthetic */ void launchPurchase$default(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        androidBillingManagerWithSubscription.launchPurchase(str, bool, bool2);
    }

    /* renamed from: m */
    public static void m5547m(int i, String str) {
        AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
        AnalyticsEvent.UserJourneyEvent.IapBillingResult iapBillingResult = new AnalyticsEvent.UserJourneyEvent.IapBillingResult(str, i, null);
        androidBillingManagerWithSubscription.getClass();
        m5546l(iapBillingResult);
    }

    /* renamed from: n */
    public static void m5548n(List list) {
        f6448P = list;
        SharedPreferences m5550p = m5550p();
        m5550p.getClass();
        SharedPreferences.Editor edit = m5550p.edit();
        edit.getClass();
        edit.putString("pending_purchase_celebrations", oy8.m15415c(list));
        edit.commit();
    }

    /* renamed from: o */
    public static void m5549o(String str) {
        if (f6449Q.add(str)) {
            SharedPreferences m5550p = m5550p();
            m5550p.getClass();
            SharedPreferences.Editor edit = m5550p.edit();
            edit.getClass();
            edit.putStringSet("processed_purchase_tokens", ps1.m16028a1(f6449Q));
            edit.apply();
        }
    }

    /* renamed from: p */
    public static SharedPreferences m5550p() {
        Context context = f6454a;
        if (context != null) {
            return context.getSharedPreferences("billing_prefs", 0);
        }
        zy5.m23857x("appContext");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [ec2, sc2] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* renamed from: q */
    public static void m5551q(List list, aad aadVar, vl4 vl4Var, long j) {
        int i;
        int i2;
        ?? r6;
        s4c s4cVar = f6459f;
        int i3 = 2;
        if (s4cVar != null && s4cVar.m17778g()) {
            sx7.m18364b(sx7.f39332a, "Child device, skip processing purchases", "androidBilling", 2);
            return;
        }
        PreferencesHelper preferencesHelper = f6460g;
        String stringFromPreferences$default = preferencesHelper != null ? PreferencesHelper.getStringFromPreferences$default(preferencesHelper, PrefKeys.AUTH_TOKEN, null, 2, null) : null;
        if ((stringFromPreferences$default == null || stringFromPreferences$default.length() == 0) && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) ps1.m16039q0(((pr9) it.next()).m16000c());
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String m16045w0 = ps1.m16045w0(arrayList, ", ", null, null, null, 62);
            sx7.m18364b(sx7.f39332a, pr1.m15974h(list.size(), "Auth token null or empty, skip processing ", " purchases: ", m16045w0), "androidBilling", 2);
            m5545j(28, "auth_token_missing", pr1.m15974h(list.size(), "Auth token null or empty, skipped ", " purchases: ", m16045w0), null);
            return;
        }
        sx7 sx7Var = sx7.f39332a;
        int size = list.size();
        StringBuilder sb = new StringBuilder("🔄 Processing ");
        sb.append(size);
        sb.append(" purchase(s) (");
        aad aadVar2 = aadVar;
        sb.append(aadVar2);
        sb.append(")");
        sx7.m18367e(sx7Var, sb.toString(), "androidBilling", 2);
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                mv1.m13807T();
                throw null;
            }
            pr9 pr9Var = (pr9) obj;
            ArrayList m16000c = pr9Var.m16000c();
            JSONObject jSONObject = pr9Var.f33151c;
            String str2 = (String) ps1.m16039q0(m16000c);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String m15999b = pr9Var.m15999b();
            m15999b.getClass();
            rr9 rr9Var = (rr9) vl4Var.invoke(pr9Var);
            sx7 sx7Var2 = sx7.f39332a;
            int m15998a = pr9Var.m15998a();
            String m18283w1 = stb.m18283w1(20, m15999b);
            StringBuilder sb2 = new StringBuilder("📱 ");
            sb2.append(rr9Var);
            sb2.append(" #");
            sb2.append(i5);
            sb2.append(": productId=");
            sb2.append(str3);
            sb2.append(", state=");
            sb2.append(m15998a);
            sb2.append(", token=");
            sx7.m18364b(sx7Var2, pr1.m15980n(sb2, m18283w1, "..."), "androidBilling", i3);
            String optString = jSONObject.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                optString = null;
            }
            sx7.m18364b(sx7Var2, tz6.m19211l("📋 Purchase details: orderId=", optString, ", packageName=", jSONObject.optString("packageName")), "androidBilling", i3);
            int m15998a2 = pr9Var.m15998a();
            if (m15998a2 == 0) {
                i = i5;
                i2 = 2;
                sx7.m18370h(2, "❓ " + rr9Var + " state UNSPECIFIED for " + str3, "androidBilling");
            } else if (m15998a2 != 1) {
                if (m15998a2 != i3) {
                    sx7.m18370h(i3, "🚫 Unknown " + rr9Var + " state " + pr9Var.m15998a() + " for " + str3, "androidBilling");
                } else {
                    sx7.m18370h(i3, "⏳ " + rr9Var + " PENDING for " + str3, "androidBilling");
                }
                i2 = i3;
                i = i5;
            } else {
                sx7.m18367e(sx7Var2, "✅ " + rr9Var + " CONFIRMED for " + str3, "androidBilling", i3);
                INSTANCE.getClass();
                String m15999b2 = pr9Var.m15999b();
                m15999b2.getClass();
                boolean add = f6444L.add(m15999b2);
                qa2 qa2Var = f6465l;
                if (add) {
                    m5549o(m15999b2);
                    r6 = 0;
                    jzd.m11709o(qa2Var, null, null, new AndroidBillingManagerWithSubscription$maybeEmitNewPurchase$1(pr9Var, null), 3);
                } else {
                    r6 = 0;
                }
                i = i5;
                jzd.m11709o(qa2Var, r6, r6, new AndroidBillingManagerWithSubscription$processPurchases$1$1(rr9Var, m15999b, pr9Var, aadVar2, str3, j, null), 3);
                i2 = 2;
            }
            aadVar2 = aadVar;
            i4 = i;
            i3 = i2;
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m5552r(AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription, List list, aad aadVar, vl4 vl4Var) {
        long m8417a = f6446N.m8417a();
        androidBillingManagerWithSubscription.getClass();
        m5551q(list, aadVar, vl4Var, m8417a);
    }

    /* renamed from: s */
    public static void m5553s(pr9 pr9Var) {
        SharedPreferences m5537b = m5537b();
        if (m5537b == null) {
            return;
        }
        String str = (String) ps1.m16039q0(pr9Var.m16000c());
        if (str == null) {
            str = "";
        }
        String string = m5537b.getString(str, null);
        if (string == null) {
            return;
        }
        String m18102n = sj8.m18102n("token:", pr9Var.m15999b());
        if (!zy5.m23838d(m5537b.getString(m18102n, null), string)) {
            SharedPreferences.Editor edit = m5537b.edit();
            edit.getClass();
            edit.putString(m18102n, string);
            edit.commit();
        }
        String m5558y = m5558y(str);
        if (m5537b.contains(m5558y)) {
            SharedPreferences.Editor edit2 = m5537b.edit();
            edit2.getClass();
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
            String m15999b = pr9Var.m15999b();
            m15999b.getClass();
            androidBillingManagerWithSubscription.getClass();
            edit2.putBoolean("trial:token:".concat(m15999b), m5537b.getBoolean(m5558y, false));
            edit2.commit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (p000.z9d.m23477c(r4, !r10.isEmpty(), r1) != false) goto L25;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5554t(rr9 rr9Var, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((pr9) it.next()).m15999b());
        }
        xv5 mo2814g = zv5.f53149a.mo2814g();
        Map<String, ?> all = m5550p().getAll();
        all.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            String m11877K = k97.m11877K(rr9Var, key);
            String str = null;
            if (m11877K != null) {
                String str2 = value instanceof String ? (String) value : null;
                t9d m21945a = str2 != null ? x9d.m21945a(str2) : null;
                if (!linkedHashSet.contains(m11877K)) {
                    List list2 = z9d.f52010a;
                }
                key = null;
                str = key;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences m5550p = m5550p();
        m5550p.getClass();
        SharedPreferences.Editor edit = m5550p.edit();
        edit.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            edit.remove((String) it2.next());
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.kahf.dns.utils.AndroidBillingManagerWithSubscription$startConnection$stateListener$1] */
    /* renamed from: w */
    public static void m5556w() {
        ly6 ly6Var = ly6.f25312y;
        AtomicBoolean atomicBoolean = f6467n;
        pt0 pt0Var = f6455b;
        if (pt0Var == 0) {
            return;
        }
        AtomicBoolean atomicBoolean2 = f6470q;
        if (atomicBoolean2.get()) {
            sx7.m18364b(sx7.f39332a, "Billing unavailable in this user profile; skipping connection.", "androidBilling", 2);
            return;
        }
        AtomicBoolean atomicBoolean3 = f6468o;
        if (atomicBoolean3.getAndSet(true)) {
            sx7.m18364b(sx7.f39332a, "Connection attempt already in progress, skipping...", "androidBilling", 2);
            return;
        }
        sx7.m18364b(sx7.f39332a, pr1.m15971e(f6474u.get() + 1, f6475v, "Starting connection (attempt ", "/", ")..."), "androidBilling", 2);
        try {
            pt0Var.mo10793f(new qt0() { // from class: com.kahf.dns.utils.AndroidBillingManagerWithSubscription$startConnection$stateListener$1
                @Override // p000.qt0
                public void onBillingServiceDisconnected() {
                    AtomicBoolean atomicBoolean4;
                    AtomicBoolean atomicBoolean5;
                    pc2 pc2Var;
                    atomicBoolean4 = AndroidBillingManagerWithSubscription.f6467n;
                    atomicBoolean4.set(false);
                    atomicBoolean5 = AndroidBillingManagerWithSubscription.f6468o;
                    atomicBoolean5.set(false);
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18370h(2, "⚠️ Service disconnected; attempting reconnection...", "androidBilling");
                    pc2Var = AndroidBillingManagerWithSubscription.f6465l;
                    jzd.m11709o(pc2Var, null, null, new C0222x49fc0ff7(null), 3);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 long, still in use, count: 1, list:
                      (r2v5 long) from 0x006b: ARITH (r2v6 long) = (r2v5 long) * (r6v1 long) (LINE:108)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                    	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                    	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:452)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // p000.qt0
                public void onBillingSetupFinished(p000.wt0 r9) {
                    /*
                        r8 = this;
                        r9.getClass()
                        java.util.concurrent.atomic.AtomicBoolean r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$isConnecting$p()
                        r0 = 0
                        r8.set(r0)
                        int r8 = r9.f47095a
                        r1 = 1
                        if (r8 != 0) goto L12
                        r2 = r1
                        goto L13
                    L12:
                        r2 = r0
                    L13:
                        sx7 r3 = p000.sx7.f39332a
                        java.lang.String r4 = r9.f47097c
                        java.lang.String r5 = "onBillingSetupFinished: code="
                        java.lang.String r6 = ", msg="
                        java.lang.String r8 = p000.pr1.m15974h(r8, r5, r6, r4)
                        java.lang.String r4 = "androidBilling"
                        r5 = 2
                        p000.sx7.m18364b(r3, r8, r4, r5)
                        if (r2 == 0) goto L43
                        java.util.concurrent.atomic.AtomicBoolean r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$isConnected$p()
                        r8.set(r1)
                        java.util.concurrent.atomic.AtomicInteger r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getConnectionRetryCount$p()
                        r8.set(r0)
                        java.lang.String r8 = "✅ Billing client connected successfully!"
                        p000.sx7.m18367e(r3, r8, r4, r5)
                        com.kahf.dns.utils.AndroidBillingManagerWithSubscription r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.INSTANCE
                        r8.queryAllProductDetails()
                        r8.restorePurchases()
                        return
                    L43:
                        java.util.concurrent.atomic.AtomicBoolean r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$isConnected$p()
                        r8.set(r0)
                        int r8 = r9.f47095a
                        java.lang.String r9 = r9.f47097c
                        java.lang.String r2 = "❌ Billing setup failed: code="
                        java.lang.String r8 = p000.pr1.m15974h(r8, r2, r6, r9)
                        r9 = 0
                        p000.sx7.m18366d(r5, r8, r4, r9)
                        java.util.concurrent.atomic.AtomicInteger r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getConnectionRetryCount$p()
                        int r8 = r8.incrementAndGet()
                        int r2 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getMaxRetryAttempts$p()
                        if (r8 > r2) goto La5
                        long r2 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getRetryDelayMs$p()
                        long r6 = (long) r8
                        long r2 = r2 * r6
                        int r8 = r8 + r1
                        int r0 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getMaxRetryAttempts$p()
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r6 = "⏳ Retrying connection in "
                        r1.<init>(r6)
                        r1.append(r2)
                        java.lang.String r6 = "ms (attempt "
                        r1.append(r6)
                        r1.append(r8)
                        java.lang.String r8 = "/"
                        r1.append(r8)
                        r1.append(r0)
                        java.lang.String r8 = ")..."
                        r1.append(r8)
                        java.lang.String r8 = r1.toString()
                        p000.sx7.m18370h(r5, r8, r4)
                        pc2 r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getScope$p()
                        com.kahf.dns.utils.AndroidBillingManagerWithSubscription$startConnection$stateListener$1$onBillingSetupFinished$1 r0 = new com.kahf.dns.utils.AndroidBillingManagerWithSubscription$startConnection$stateListener$1$onBillingSetupFinished$1
                        r0.<init>(r2, r9)
                        r1 = 3
                        p000.jzd.m11709o(r8, r9, r9, r0, r1)
                        return
                    La5:
                        int r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$getMaxRetryAttempts$p()
                        java.lang.String r1 = "❌ Max retry attempts ("
                        java.lang.String r2 = ") reached. Billing client initialization failed."
                        java.lang.String r8 = p000.pr1.m15973g(r8, r1, r2)
                        p000.sx7.m18366d(r5, r8, r4, r9)
                        java.util.concurrent.atomic.AtomicBoolean r8 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.access$isInitialized$p()
                        r8.set(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.kahf.dns.utils.C0221xdf6b74e.onBillingSetupFinished(wt0):void");
                }
            });
        } catch (SecurityException e) {
            atomicBoolean2.set(true);
            atomicBoolean3.set(false);
            atomicBoolean.set(false);
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e, "❌ Billing unavailable in this user profile (cloned app / secondary user / work profile). Disabling.");
            m5545j(28, "billing_unavailable_cross_user", "bindService cross-user SecurityException: " + e.getMessage(), null);
        } catch (RuntimeException e2) {
            atomicBoolean3.set(false);
            atomicBoolean.set(false);
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e2, "❌ Unexpected error starting billing connection");
            m5545j(28, "billing_start_connection_exception", "Synchronous failure starting billing connection: " + e2.getMessage(), null);
        }
    }

    /* renamed from: x */
    public static PurchaseResult m5557x(ny8 ny8Var) {
        return new PurchaseResult(true, ny8Var.m14615a(), "Purchase Successful!", tz6.m19210k("Your ", ny8Var.m14617c() ? "subscription" : "premium feature", " has been activated successfully."), "You now have access to all premium features.", true, true, null, false, ny8Var.m14618d(), ny8Var.m14616b(), 384, null);
    }

    /* renamed from: y */
    public static String m5558y(String str) {
        return sj8.m18102n("trial:", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e8, code lost:
    
        if (r9 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9 A[Catch: Exception -> 0x01c4, hy -> 0x01c6, CancellationException -> 0x02e9, TRY_ENTER, TryCatch #11 {CancellationException -> 0x02e9, blocks: (B:12:0x005d, B:15:0x0194, B:19:0x01a0, B:34:0x01b9, B:36:0x01bf, B:38:0x01cb, B:41:0x0243, B:42:0x0246, B:49:0x0260, B:50:0x0267, B:87:0x0159, B:90:0x015b, B:93:0x0169, B:96:0x017e), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5559A(pr9 pr9Var, boolean z, boolean z2, Boolean bool, xa2 xa2Var) {
        AndroidBillingManagerWithSubscription$verifyPaymentFromKahfId$1 androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1;
        int i;
        Integer num;
        String string;
        String str;
        C1058yx c1058yx;
        o9d o9dVar;
        String str2;
        boolean z3;
        Boolean bool2;
        o9d o9dVar2;
        String str3;
        Boolean bool3;
        String str4;
        String str5;
        boolean z4;
        pr9 pr9Var2;
        Integer num2;
        String str6;
        rv4 m6650O;
        try {
            try {
                if (xa2Var instanceof AndroidBillingManagerWithSubscription$verifyPaymentFromKahfId$1) {
                    androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1 = (AndroidBillingManagerWithSubscription$verifyPaymentFromKahfId$1) xa2Var;
                    int i2 = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.result;
                        i = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.label;
                        o9d o9dVar3 = o9d.f29928w;
                        if (i != 0) {
                            v11.m20244z(obj);
                            String str7 = (String) ps1.m16039q0(pr9Var.m16000c());
                            String str8 = str7 == null ? "" : str7;
                            String m15999b = pr9Var.m15999b();
                            m15999b.getClass();
                            PreferencesHelper preferencesHelper = f6460g;
                            String stringFromPreferences$default = preferencesHelper != null ? PreferencesHelper.getStringFromPreferences$default(preferencesHelper, PrefKeys.AUTH_TOKEN, null, 2, null) : null;
                            num = stringFromPreferences$default != null ? new Integer(stringFromPreferences$default.length()) : null;
                            String str9 = (String) ps1.m16039q0(pr9Var.m16000c());
                            String str10 = str9 != null ? str9 : "";
                            SharedPreferences m5537b = m5537b();
                            if (m5537b != null) {
                                string = m5537b.getString("token:" + pr9Var.m15999b(), null);
                            }
                            string = m5537b != null ? m5537b.getString(str10, null) : null;
                            if (string == null) {
                                Set set = rj9.f36841a;
                                if (str10.equals("kg.premium.silver.yearly")) {
                                    str10 = "kahf_guard_premium_silver_yearly";
                                } else if (str10.equals("kg.premium.silver.monthly")) {
                                    str10 = "kahf_guard_premium_silver_monthly";
                                } else if (str10.equals("kg.premium.family.monthly")) {
                                    str10 = "kahf_guard_premium_family_monthly";
                                }
                                str = str10;
                                c1058yx = f6456c;
                                if (c1058yx != null) {
                                    rv4 rv4Var = new rv4(o9dVar3, null, "apollo_client_unavailable", "Apollo client not available for verification");
                                    m5534B(str8, num, str, z2, bool, rv4Var);
                                    return rv4Var;
                                }
                                o9dVar = o9dVar3;
                                str2 = "Provider: ";
                                sx7.m18364b(sx7.f39332a, pr1.m15980n(pr1.m15984r("Starting backend verification for ", z ? "subscription" : "one-time purchase", ": productId=", str8, ", token="), stb.m18283w1(20, m15999b), "..."), "androidBilling", 2);
                                try {
                                    try {
                                        try {
                                            nu5 nu5Var = new nu5(c1058yx, (oj8) new og2(str, m15999b));
                                            androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$0 = pr9Var;
                                            bool2 = bool;
                                            try {
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$1 = bool2;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$2 = str8;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$3 = null;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$4 = null;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$5 = num;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$6 = str;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$7 = null;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$8 = null;
                                                androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.Z$0 = z;
                                                z3 = z2;
                                                try {
                                                    androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.Z$1 = z3;
                                                    androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.label = 1;
                                                    obj = nu5Var.m14483I(androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1);
                                                    qc2 qc2Var = qc2.f34309u;
                                                    if (obj == qc2Var) {
                                                        return qc2Var;
                                                    }
                                                    pr9Var2 = pr9Var;
                                                    bool3 = bool2;
                                                    str4 = str8;
                                                    num2 = num;
                                                    str6 = str;
                                                    z4 = z3;
                                                } catch (AbstractC0432hy e) {
                                                    e = e;
                                                    bool3 = bool2;
                                                    str4 = str8;
                                                    str5 = str;
                                                    z4 = z3;
                                                    o9dVar2 = o9dVar;
                                                    str3 = null;
                                                    rv4 rv4Var2 = new rv4(o9dVar2, str3, "apollo_network_error", sj8.m18102n("Apollo network error during verification: ", e.getMessage()));
                                                    m5534B(str4, num, str5, z4, bool3, rv4Var2);
                                                    return rv4Var2;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    bool3 = bool2;
                                                    str4 = str8;
                                                    str5 = str;
                                                    z4 = z3;
                                                    sx7 sx7Var = sx7.f39332a;
                                                    sx7.m18369g(ly6.f25312y, "androidBilling", e, "Unexpected error during verification");
                                                    rv4 rv4Var3 = new rv4(o9dVar, null, "verification_exception", sj8.m18102n("Unexpected error during verification: ", e.getMessage()));
                                                    m5534B(str4, num, str5, z4, bool3, rv4Var3);
                                                    return rv4Var3;
                                                }
                                            } catch (AbstractC0432hy e3) {
                                                e = e3;
                                                z3 = z2;
                                            } catch (Exception e4) {
                                                e = e4;
                                                z3 = z2;
                                            }
                                        } catch (AbstractC0432hy e5) {
                                            e = e5;
                                            z3 = z2;
                                            bool2 = bool;
                                        }
                                    } catch (AbstractC0432hy e6) {
                                        e = e6;
                                        o9dVar2 = o9dVar;
                                        str3 = null;
                                        bool3 = bool;
                                        str4 = str8;
                                        str5 = str;
                                        z4 = z2;
                                        rv4 rv4Var22 = new rv4(o9dVar2, str3, "apollo_network_error", sj8.m18102n("Apollo network error during verification: ", e.getMessage()));
                                        m5534B(str4, num, str5, z4, bool3, rv4Var22);
                                        return rv4Var22;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    z3 = z2;
                                    bool2 = bool;
                                }
                            }
                            str = string;
                            c1058yx = f6456c;
                            if (c1058yx != null) {
                            }
                        } else {
                            if (i != 1) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.Z$1;
                            str5 = (String) androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$6;
                            Integer num3 = (Integer) androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$5;
                            String str11 = (String) androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$2;
                            Boolean bool4 = (Boolean) androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$1;
                            pr9Var2 = (pr9) androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.L$0;
                            try {
                                v11.m20244z(obj);
                                str2 = "Provider: ";
                                o9dVar = o9dVar3;
                                str6 = str5;
                                num2 = num3;
                                str4 = str11;
                                bool3 = bool4;
                                z4 = z5;
                            } catch (AbstractC0432hy e8) {
                                e = e8;
                                o9dVar2 = o9dVar3;
                                str3 = null;
                                str4 = str11;
                                bool3 = bool4;
                                num = num3;
                                z4 = z5;
                                rv4 rv4Var222 = new rv4(o9dVar2, str3, "apollo_network_error", sj8.m18102n("Apollo network error during verification: ", e.getMessage()));
                                m5534B(str4, num, str5, z4, bool3, rv4Var222);
                                return rv4Var222;
                            } catch (Exception e9) {
                                e = e9;
                                o9dVar = o9dVar3;
                                str4 = str11;
                                bool3 = bool4;
                                num = num3;
                                z4 = z5;
                                sx7 sx7Var2 = sx7.f39332a;
                                sx7.m18369g(ly6.f25312y, "androidBilling", e, "Unexpected error during verification");
                                rv4 rv4Var32 = new rv4(o9dVar, null, "verification_exception", sj8.m18102n("Unexpected error during verification: ", e.getMessage()));
                                m5534B(str4, num, str5, z4, bool3, rv4Var32);
                                return rv4Var32;
                            }
                        }
                        C0726py c0726py = (C0726py) obj;
                        m6650O = dt9.m6650O(c0726py);
                        if (m6650O == null) {
                            String str12 = str4;
                            Boolean bool5 = bool3;
                            try {
                                m5534B(str12, num2, str6, z4, bool5, m6650O);
                                return m6650O;
                            } catch (AbstractC0432hy e10) {
                                e = e10;
                                str4 = str12;
                                bool3 = bool5;
                                num = num2;
                                str5 = str6;
                                o9dVar2 = o9dVar;
                                str3 = null;
                                rv4 rv4Var2222 = new rv4(o9dVar2, str3, "apollo_network_error", sj8.m18102n("Apollo network error during verification: ", e.getMessage()));
                                m5534B(str4, num, str5, z4, bool3, rv4Var2222);
                                return rv4Var2222;
                            } catch (Exception e11) {
                                e = e11;
                                str4 = str12;
                                bool3 = bool5;
                                num = num2;
                                str5 = str6;
                                sx7 sx7Var22 = sx7.f39332a;
                                sx7.m18369g(ly6.f25312y, "androidBilling", e, "Unexpected error during verification");
                                rv4 rv4Var322 = new rv4(o9dVar, null, "verification_exception", sj8.m18102n("Unexpected error during verification: ", e.getMessage()));
                                m5534B(str4, num, str5, z4, bool3, rv4Var322);
                                return rv4Var322;
                            }
                        }
                        mg2 mg2Var = (mg2) c0726py.f33500c;
                        lg2 m13424a = mg2Var != null ? mg2Var.m13424a() : null;
                        if (m13424a == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        sx7 sx7Var3 = sx7.f39332a;
                        sx7.m18367e(sx7Var3, "✅ Backend verification successful!", "androidBilling", 2);
                        sx7.m18367e(sx7Var3, "Created subscription: id=" + m13424a.m12750a() + ", name=" + m13424a.m12751b(), "androidBilling", 2);
                        sx7.m18367e(sx7Var3, "Subscription type: " + m13424a.m12755f() + ", status: " + m13424a.m12754e(), "androidBilling", 2);
                        sx7.m18367e(sx7Var3, str2 + m13424a.m12752c() + ", planId: " + m13424a.m12753d(), "androidBilling", 2);
                        AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
                        String str13 = str6;
                        boolean z6 = z4;
                        try {
                            AnalyticsEvent.UserJourneyEvent.IapVerificationResult iapVerificationResult = new AnalyticsEvent.UserJourneyEvent.IapVerificationResult("success", str4, str13, z6, null, null, bool3);
                            androidBillingManagerWithSubscription.getClass();
                            m5546l(iapVerificationResult);
                            m5538c(pr9Var2);
                            return null;
                        } catch (AbstractC0432hy e12) {
                            e = e12;
                            str6 = str13;
                            z4 = z6;
                            num = num2;
                            str5 = str6;
                            o9dVar2 = o9dVar;
                            str3 = null;
                            rv4 rv4Var22222 = new rv4(o9dVar2, str3, "apollo_network_error", sj8.m18102n("Apollo network error during verification: ", e.getMessage()));
                            m5534B(str4, num, str5, z4, bool3, rv4Var22222);
                            return rv4Var22222;
                        } catch (Exception e13) {
                            e = e13;
                            str6 = str13;
                            z4 = z6;
                            num = num2;
                            str5 = str6;
                            sx7 sx7Var222 = sx7.f39332a;
                            sx7.m18369g(ly6.f25312y, "androidBilling", e, "Unexpected error during verification");
                            rv4 rv4Var3222 = new rv4(o9dVar, null, "verification_exception", sj8.m18102n("Unexpected error during verification: ", e.getMessage()));
                            m5534B(str4, num, str5, z4, bool3, rv4Var3222);
                            return rv4Var3222;
                        }
                    }
                }
                C0726py c0726py2 = (C0726py) obj;
                m6650O = dt9.m6650O(c0726py2);
                if (m6650O == null) {
                }
            } catch (AbstractC0432hy e14) {
                e = e14;
            } catch (Exception e15) {
                e = e15;
            }
            if (i != 0) {
            }
        } catch (CancellationException e16) {
            throw e16;
        }
        androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1 = new AndroidBillingManagerWithSubscription$verifyPaymentFromKahfId$1(this, xa2Var);
        Object obj2 = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.result;
        i = androidBillingManagerWithSubscription$verifyPaymentFromKahfId$1.label;
        o9d o9dVar32 = o9d.f29928w;
    }

    /* renamed from: a */
    public final void m5560a() {
        if (f6470q.get()) {
            sx7.m18364b(sx7.f39332a, "Billing unavailable in this user profile; skipping reconnection.", "androidBilling", 2);
            return;
        }
        if (!f6466m.get()) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "⚠️ Not initialized — triggering full reinitialize", "androidBilling");
            m5562u();
        } else if (f6467n.get()) {
            sx7.m18364b(sx7.f39332a, "Already connected, skipping reconnection", "androidBilling", 2);
        } else {
            if (f6468o.get()) {
                sx7.m18364b(sx7.f39332a, "Connection attempt in progress, skipping reconnection", "androidBilling", 2);
                return;
            }
            sx7.m18367e(sx7.f39332a, "🔄 Attempting to reconnect billing client...", "androidBilling", 2);
            f6474u.set(0);
            m5556w();
        }
    }

    public final Object clearAccountScopedState(xa2 xa2Var) {
        vu2 vu2Var = k83.f21845a;
        Object m11694F = jzd.m11694F(dt2.f8706v, new AndroidBillingManagerWithSubscription$clearAccountScopedState$2(null), xa2Var);
        return m11694F == qc2.f34309u ? m11694F : txc.f41359a;
    }

    public final void continueWithPaidPlan() {
        ynb ynbVar;
        Object value;
        tpc tpcVar;
        do {
            ynbVar = f6450R;
            value = ynbVar.getValue();
            tpcVar = (tpc) value;
        } while (!ynbVar.m22919i(value, null));
        if (tpcVar == null) {
            return;
        }
        m5546l(new AnalyticsEvent.UserJourneyEvent.IapTrialUnavailableChoice("continue", tpcVar.m18963a()));
        launchPurchase$default(this, tpcVar.m18963a(), null, Boolean.FALSE, 2, null);
    }

    public final void debugClearProcessedTokens() {
        f6449Q.clear();
        f6444L.clear();
        SharedPreferences m5550p = m5550p();
        m5550p.getClass();
        SharedPreferences.Editor edit = m5550p.edit();
        edit.getClass();
        edit.remove("processed_purchase_tokens");
        edit.apply();
        sx7 sx7Var = sx7.f39332a;
        sx7.m18370h(2, "Processed tokens cleared (debug only).", "androidBilling");
    }

    public final void declineTrialUnavailable() {
        ynb ynbVar;
        Object value;
        tpc tpcVar;
        do {
            ynbVar = f6450R;
            value = ynbVar.getValue();
            tpcVar = (tpc) value;
        } while (!ynbVar.m22919i(value, null));
        if (tpcVar == null) {
            return;
        }
        m5546l(new AnalyticsEvent.UserJourneyEvent.IapTrialUnavailableChoice("not_now", tpcVar.m18963a()));
    }

    public final void endConnection() {
        r2b mo6987G;
        sx7.m18364b(sx7.f39332a, "Ending connection...", "androidBilling", 2);
        f6467n.set(false);
        f6468o.set(false);
        f6469p.set(false);
        f6474u.set(0);
        pt0 pt0Var = f6455b;
        if (pt0Var != null) {
            pt0Var.mo10790c();
        }
        f6455b = null;
        n76 n76Var = (n76) f6465l.f34191u.get(y3c.f49632x);
        if (n76Var != null && (mo6987G = n76Var.mo6987G()) != null) {
            Iterator it = mo6987G.iterator();
            while (it.hasNext()) {
                ((n76) it.next()).mo6991b(null);
            }
        }
        f6466m.set(false);
    }

    public final pr9 getActiveSubscription(String str) {
        Object obj;
        str.getClass();
        Iterator it = ((Iterable) f6438F.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            pr9 pr9Var = (pr9) obj;
            if (pr9Var.m16000c().contains(str) && pr9Var.m15998a() == 1) {
                break;
            }
        }
        return (pr9) obj;
    }

    public final wnb getCurrencyCode() {
        return f6435C;
    }

    public final dlb getLastCheckoutSource() {
        return f6463j;
    }

    public final boolean getLastKnownIsBangladesh() {
        return f6461h;
    }

    public final f8b getNewPurchases() {
        return f6441I;
    }

    public final wnb getProductDetails() {
        return f6478y;
    }

    public final f8b getPurchaseResults() {
        return f6443K;
    }

    public final wnb getPurchases() {
        return f6437E;
    }

    public final wnb getSubscriptions() {
        return f6439G;
    }

    public final wnb getTrialUnavailablePrompt() {
        return f6451S;
    }

    public final nwc getUiProduct(String str) {
        Object obj;
        str.getClass();
        Iterator it = ((Iterable) f6479z.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (zy5.m23838d(((nwc) obj).m14567a(), str)) {
                break;
            }
        }
        return (nwc) obj;
    }

    public final wnb getUiProducts() {
        return f6433A;
    }

    public final boolean hasActiveSubscription() {
        Iterable iterable = (Iterable) f6438F.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((pr9) it.next()).m15998a() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void init(Context context, List<String> list, List<String> list2, Set<String> set, C1058yx c1058yx, vic vicVar, C1001xd c1001xd, s4c s4cVar, PreferencesHelper preferencesHelper, d48 d48Var) {
        dlb m2083q;
        context.getClass();
        list.getClass();
        list2.getClass();
        set.getClass();
        AtomicBoolean atomicBoolean = f6466m;
        byte b = 2;
        if (atomicBoolean.get()) {
            sx7.m18364b(sx7.f39332a, "Already initialized; reusing instance.", "androidBilling", 2);
            return;
        }
        if (!bha.m2089y(context)) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "Google Play Services not available - billing initialization aborted", "androidBilling");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        f6454a = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("checkout_attribution", 0);
        long j = sharedPreferences.getLong("last_checkout_source_at_ms", 0L);
        if (j != 0 && System.currentTimeMillis() - j <= dj3.m6348f(f6462i) && (m2083q = bha.m2083q(sharedPreferences.getString("last_checkout_source", null))) != null) {
            f6463j = m2083q;
        }
        f6471r = ps1.m16032j0(list);
        f6472s = ps1.m16032j0(list2);
        f6473t = set;
        f6456c = c1058yx;
        f6457d = vicVar;
        f6458e = c1001xd;
        f6459f = s4cVar;
        f6460g = preferencesHelper;
        jzd.m11709o(f6465l, null, null, new AndroidBillingManagerWithSubscription$init$1(d48Var, null), 3);
        atomicBoolean.set(true);
        Set<String> stringSet = m5550p().getStringSet("processed_purchase_tokens", ep3.f10423u);
        Set m16027Z0 = stringSet != null ? ps1.m16027Z0(stringSet) : new LinkedHashSet();
        f6449Q = m16027Z0;
        f6444L.addAll(m16027Z0);
        Set<String> stringSet2 = m5550p().getStringSet("reported_purchase_tokens", null);
        Set m16028a1 = stringSet2 != null ? ps1.m16028a1(stringSet2) : null;
        Set<String> m18602s = t37.m18602s(m16028a1, ps1.m16028a1(f6449Q));
        if (m16028a1 == null) {
            SharedPreferences m5550p = m5550p();
            m5550p.getClass();
            SharedPreferences.Editor edit = m5550p.edit();
            edit.getClass();
            edit.putStringSet("reported_purchase_tokens", m18602s);
            edit.commit();
        }
        String string = m5550p().getString("pending_purchase_celebrations", null);
        List m15413a = string != null ? oy8.m15413a(string) : null;
        if (m15413a == null) {
            m15413a = xo3.f48775u;
        }
        f6448P = m15413a;
        f6445M = new fd6(m18602s, new C0289e3(b));
        sx7.m18364b(sx7.f39332a, "Building BillingClient v8 (INAPP + SUBS)...", "androidBilling", 2);
        aj7 aj7Var = new aj7((byte) 22);
        Context context2 = f6454a;
        if (context2 == null) {
            zy5.m23857x("appContext");
            throw null;
        }
        ot0 ot0Var = new ot0(context2);
        ot0Var.f31149c = this;
        ot0Var.f31147a = aj7Var;
        ot0Var.f31150d = true;
        f6455b = ot0Var.m15325a();
        m5556w();
    }

    public final boolean isReady() {
        return f6467n.get();
    }

    /* renamed from: k */
    public final void m5561k(String str, String str2, boolean z) {
        p29 m15509p = p47.m15509p(str, f6461h);
        if (m15509p == null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "FB Purchase skipped — no price mapping for ".concat(str), "androidBilling");
            return;
        }
        vq8 m2603H = c3e.m2603H(getLastCheckoutSource());
        String str3 = (String) m2603H.f44884u;
        String str4 = (String) m2603H.f44885v;
        r2c r2cVar = y04.f49410a;
        y04.m22455g(m15509p.m15456a(), m15509p.m15457b(), str, str3, str4, str2);
        if (z) {
            y04.m22458j(m15509p.m15456a(), m15509p.m15457b(), str, str3, str4, str2);
        }
    }

    public final boolean markBkashTransactionAsProcessed(String str) {
        str.getClass();
        if (f6454a == null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "markBkashTransactionAsProcessed called before init — allowing", "androidBilling");
            return true;
        }
        boolean add = f6444L.add(str);
        if (add) {
            m5549o(str);
        }
        return add;
    }

    public final Object markCelebrationDelivered(String str, xa2 xa2Var) {
        vu2 vu2Var = k83.f21845a;
        return jzd.m11694F(dt2.f8706v, new AndroidBillingManagerWithSubscription$markCelebrationDelivered$2(str, null), xa2Var);
    }

    @Override // p000.tr9
    public void onPurchasesUpdated(wt0 wt0Var, List<pr9> list) {
        String str;
        wt0Var.getClass();
        int i = wt0Var.f47095a;
        String str2 = wt0Var.f47097c;
        str2.getClass();
        int size = list != null ? list.size() : 0;
        sx7 sx7Var = sx7.f39332a;
        sx7.m18367e(sx7Var, "🔔 PURCHASE UPDATE RECEIVED", "androidBilling", 2);
        sx7.m18364b(sx7Var, "📊 Response: code=" + i + ", message='" + str2 + "', purchaseCount=" + size, "androidBilling", 2);
        if (i != 0 && (str = f6464k) != null) {
            f6464k = null;
            SharedPreferences m5537b = m5537b();
            if (m5537b != null) {
                SharedPreferences.Editor edit = m5537b.edit();
                edit.getClass();
                INSTANCE.getClass();
                edit.remove(m5558y(str));
                edit.commit();
            }
        }
        if (i != 0) {
            if (i == 1) {
                sx7.m18367e(sx7Var, "🚫 User canceled the purchase", "androidBilling", 2);
                m5547m(i, "user_cancelled");
                m5539d(new PurchaseResult(false, "unknown", "Purchase Canceled", "You canceled the purchase process.", "No charges were made to your account.", false, false, FailureReason.USER_CANCELED, false, null, null, 1792, null));
                return;
            }
            if (i == 2) {
                sx7.m18366d(2, "❌ Google Play Service unavailable", "androidBilling", null);
                m5547m(i, "service_unavailable");
                m5539d(new PurchaseResult(false, "unknown", "Service Unavailable", "Google Play service is currently unavailable.", "Please check your internet connection and try again later.", false, false, FailureReason.SERVICE_UNAVAILABLE, false, null, null, 1792, null));
                return;
            } else if (i != 7) {
                m5547m(i, "failed");
                sx7.m18370h(2, "❓ Response code: " + i + " - " + str2, "androidBilling");
                return;
            } else {
                sx7.m18370h(2, "⚠️ Item already owned by user", "androidBilling");
                m5547m(i, "already_owned");
                m5539d(new PurchaseResult(false, "unknown", "Already Purchased", "You already own this item or have an active subscription.", "Check your subscription status or switch Google accounts in Play Store if you purchased with a different account.", false, false, FailureReason.ALREADY_OWNED, false, null, null, 1792, null));
                return;
            }
        }
        sx7.m18367e(sx7Var, "✅ Purchase flow completed successfully!", "androidBilling", 2);
        if (list == null || list.isEmpty()) {
            m5547m(i, "no_purchase_data");
            sx7.m18370h(2, "⚠️ Purchase successful but no purchase data received", "androidBilling");
            return;
        }
        sx7.m18367e(sx7Var, pr1.m15973g(list.size(), "📦 Received ", " purchase(s) to process"), "androidBilling", 2);
        for (pr9 pr9Var : list) {
            int m15998a = pr9Var.m15998a();
            String str3 = m15998a != 1 ? m15998a != 2 ? "failed" : "pending" : "purchased";
            String str4 = (String) ps1.m16039q0(pr9Var.m16000c());
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = INSTANCE;
            AnalyticsEvent.UserJourneyEvent.IapBillingResult iapBillingResult = new AnalyticsEvent.UserJourneyEvent.IapBillingResult(str3, i, str4);
            androidBillingManagerWithSubscription.getClass();
            m5546l(iapBillingResult);
        }
        ynb ynbVar = f6436D;
        ynbVar.getClass();
        ynbVar.m22921k(null, list);
        m5552r(this, list, aad.f555u, new AndroidBillingManagerWithSubscription$onPurchasesUpdated$2(this));
    }

    public final void queryAllProductDetails() {
        byte b = 2;
        if (!isReady()) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "⚠️ Billing client not ready for product query - attempting reconnection", "androidBilling");
            jzd.m11709o(f6465l, null, null, new AndroidBillingManagerWithSubscription$queryAllProductDetails$1(null), 3);
            return;
        }
        pt0 pt0Var = f6455b;
        boolean z = false;
        ly6 ly6Var = ly6.f25312y;
        if (pt0Var != null) {
            if (f6471r.isEmpty()) {
                sx7.m18364b(sx7.f39332a, "No INAPP productIds configured; skip query.", "androidBilling", 2);
            } else {
                List<String> list = f6471r;
                ArrayList arrayList = new ArrayList(qs1.m16870Y(list, 10));
                for (String str : list) {
                    c13 c13Var = new c13();
                    c13Var.f4254a = str;
                    c13Var.f4255b = "inapp";
                    arrayList.add(c13Var.m2566a());
                }
                va9 va9Var = new va9(b, z);
                va9Var.m20569n(arrayList);
                if (((b1e) va9Var.f44099v) == null) {
                    gpc.m8805e("Product list must be set to a non empty list.");
                    return;
                }
                fs9 fs9Var = new fs9(va9Var);
                sx7.m18364b(sx7.f39332a, pr1.m15973g(f6471r.size(), "Querying INAPP ProductDetails for ", " item(s)..."), "androidBilling", 2);
                try {
                    pt0Var.mo10792e(fs9Var, new qi3((byte) 7));
                } catch (RuntimeException e) {
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "androidBilling", e, "⚠️ Billing call 'queryProductDetails:INAPP' failed; billing may be unavailable in this user profile");
                }
            }
        }
        pt0 pt0Var2 = f6455b;
        if (pt0Var2 == null) {
            return;
        }
        if (f6472s.isEmpty()) {
            sx7.m18364b(sx7.f39332a, "No SUBS productIds configured; skip query.", "androidBilling", 2);
            return;
        }
        List<String> list2 = f6472s;
        ArrayList arrayList2 = new ArrayList(qs1.m16870Y(list2, 10));
        for (String str2 : list2) {
            c13 c13Var2 = new c13();
            c13Var2.f4254a = str2;
            c13Var2.f4255b = "subs";
            arrayList2.add(c13Var2.m2566a());
        }
        va9 va9Var2 = new va9(b, z);
        va9Var2.m20569n(arrayList2);
        if (((b1e) va9Var2.f44099v) == null) {
            gpc.m8805e("Product list must be set to a non empty list.");
            return;
        }
        fs9 fs9Var2 = new fs9(va9Var2);
        sx7.m18364b(sx7.f39332a, pr1.m15973g(f6472s.size(), "Querying SUBS ProductDetails for ", " item(s)..."), "androidBilling", 2);
        try {
            pt0Var2.mo10792e(fs9Var2, new qi3((byte) 5));
        } catch (RuntimeException e2) {
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e2, "⚠️ Billing call 'queryProductDetails:SUBS' failed; billing may be unavailable in this user profile");
        }
    }

    public final Object redeliverPendingCelebrations(xa2 xa2Var) {
        vu2 vu2Var = k83.f21845a;
        Object m11694F = jzd.m11694F(dt2.f8706v, new C0220x8ff086bc(null), xa2Var);
        return m11694F == qc2.f34309u ? m11694F : txc.f41359a;
    }

    public final void restorePurchases() {
        if (!isReady()) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "⚠️ Billing client not ready for restore - attempting reconnection", "androidBilling");
            jzd.m11709o(f6465l, null, null, new AndroidBillingManagerWithSubscription$restorePurchases$1(null), 3);
            return;
        }
        pt0 pt0Var = f6455b;
        byte b = 23;
        ly6 ly6Var = ly6.f25312y;
        if (pt0Var != null) {
            sx7.m18364b(sx7.f39332a, "Querying existing INAPP purchases...", "androidBilling", 2);
            try {
                qi3 qi3Var = new qi3((byte) 4);
                if (pt0.m16053h(new pud(pt0Var, qi3Var, "inapp"), 30000L, new o3e(pt0Var, qi3Var, b), pt0Var.m16068i(), pt0Var.m16067g()) == null) {
                    wt0 m16071l = pt0Var.m16071l();
                    pt0Var.m16076u(25, 9, m16071l);
                    qi3Var.mo16675b(m16071l, b1e.m1578k());
                }
            } catch (RuntimeException e) {
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18369g(ly6Var, "androidBilling", e, "⚠️ Billing call 'queryPurchases:INAPP' failed; billing may be unavailable in this user profile");
            }
        }
        pt0 pt0Var2 = f6455b;
        if (pt0Var2 == null) {
            return;
        }
        sx7.m18364b(sx7.f39332a, "Querying existing SUBS purchases...", "androidBilling", 2);
        try {
            qi3 qi3Var2 = new qi3((byte) 6);
            if (pt0.m16053h(new pud(pt0Var2, qi3Var2, "subs"), 30000L, new o3e(pt0Var2, qi3Var2, b), pt0Var2.m16068i(), pt0Var2.m16067g()) == null) {
                wt0 m16071l2 = pt0Var2.m16071l();
                pt0Var2.m16076u(25, 9, m16071l2);
                qi3Var2.mo16675b(m16071l2, b1e.m1578k());
            }
        } catch (RuntimeException e2) {
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e2, "⚠️ Billing call 'queryPurchases:SUBS' failed; billing may be unavailable in this user profile");
        }
    }

    public final void retryInitialization() {
        sx7.m18367e(sx7.f39332a, "🔄 Retry requested", "androidBilling", 2);
        m5560a();
    }

    public final void setBackendProductCodeOverride(String str, String str2) {
        str.getClass();
        SharedPreferences m5537b = m5537b();
        if (m5537b == null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "Cannot stash backend product code override — billing not initialized", "AndroidBilling");
            return;
        }
        SharedPreferences.Editor edit = m5537b.edit();
        edit.getClass();
        if (str2 != null) {
            edit.putString(str, str2);
        } else {
            edit.remove(str);
        }
        edit.commit();
    }

    public final void setLastCheckoutSource(dlb dlbVar) {
        dlbVar.getClass();
        f6463j = dlbVar;
        Context context = f6454a;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("checkout_attribution", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putString("last_checkout_source", dlbVar.m6433a());
            edit.putLong("last_checkout_source_at_ms", System.currentTimeMillis());
            edit.apply();
        }
    }

    public final lwb subscriptionLaunchFor(String str, Boolean bool) {
        Object obj;
        str.getClass();
        Iterator it = ((Iterable) f6477x.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (zy5.m23838d(((pj9) obj).f32740c, str)) {
                break;
            }
        }
        pj9 pj9Var = (pj9) obj;
        if (pj9Var != null) {
            List list = pj9Var.f32746i;
            if (list == null) {
                list = xo3.f48775u;
            }
            lwb m18034g = sg7.m18034g(list, bool, new C1066z4((byte) 9));
            if (m18034g instanceof jwb) {
                oj9 oj9Var = (oj9) ((jwb) m18034g).m11611a();
                String m15143b = oj9Var.m15143b();
                String m15142a = oj9Var.m15142a();
                m15142a.getClass();
                return new jwb(new LaunchOffer(m15143b, m15142a, m5543h(oj9Var)));
            }
            if (m18034g instanceof kwb) {
                oj9 oj9Var2 = (oj9) ((kwb) m18034g).m12357a();
                String m15143b2 = oj9Var2.m15143b();
                String m15142a2 = oj9Var2.m15142a();
                m15142a2.getClass();
                return new kwb(new LaunchOffer(m15143b2, m15142a2, m5543h(oj9Var2)));
            }
            if (m18034g != null) {
                gpc.m8801a();
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5563z(String str, rv4 rv4Var, xa2 xa2Var) {
        C0224x6fbc48d9 c0224x6fbc48d9;
        int i;
        qc2 qc2Var;
        int i2;
        String str2;
        Object m13832v;
        String str3;
        String str4;
        if (xa2Var instanceof C0224x6fbc48d9) {
            c0224x6fbc48d9 = (C0224x6fbc48d9) xa2Var;
            int i3 = c0224x6fbc48d9.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0224x6fbc48d9.label = i3 - Integer.MIN_VALUE;
                Object obj = c0224x6fbc48d9.result;
                i = c0224x6fbc48d9.label;
                qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    o9d m17545c = rv4Var.m17545c();
                    ql4.f34950u.getClass();
                    int ordinal = u03.m19243n(m17545c).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            return new PurchaseResult(false, str, "Verification Failed", "Payment processed but verification failed", "Your payment was successful, but we couldn't verify it with our servers. Your purchase is safe - please try refreshing the app or contact support.", true, false, FailureReason.BACKEND_VERIFICATION_FAILED, false, null, null, 1792, null);
                        }
                        gpc.m8801a();
                        return null;
                    }
                    gtb purchase_not_linked_title = String10_commonMainKt.getPurchase_not_linked_title(Res.string.INSTANCE);
                    c0224x6fbc48d9.L$0 = null;
                    c0224x6fbc48d9.L$1 = null;
                    c0224x6fbc48d9.L$2 = str;
                    c0224x6fbc48d9.I$0 = 0;
                    c0224x6fbc48d9.label = 1;
                    obj = mv1.m13832v(purchase_not_linked_title, c0224x6fbc48d9);
                    if (obj != qc2Var) {
                        i2 = 0;
                        str2 = str;
                    }
                    return qc2Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = c0224x6fbc48d9.I$0;
                    String str5 = (String) c0224x6fbc48d9.L$3;
                    String str6 = (String) c0224x6fbc48d9.L$2;
                    v11.m20244z(obj);
                    str3 = str5;
                    str4 = str6;
                    return new PurchaseResult(i2 == 0, str4, str3, (String) obj, null, true, false, FailureReason.PURCHASE_NOT_LINKED, false, null, null, 1808, null);
                }
                i2 = c0224x6fbc48d9.I$0;
                str2 = (String) c0224x6fbc48d9.L$2;
                v11.m20244z(obj);
                String str7 = (String) obj;
                gtb purchase_not_linked_message = String10_commonMainKt.getPurchase_not_linked_message(Res.string.INSTANCE);
                c0224x6fbc48d9.L$0 = null;
                c0224x6fbc48d9.L$1 = null;
                c0224x6fbc48d9.L$2 = str2;
                c0224x6fbc48d9.L$3 = str7;
                c0224x6fbc48d9.I$0 = i2;
                c0224x6fbc48d9.label = 2;
                m13832v = mv1.m13832v(purchase_not_linked_message, c0224x6fbc48d9);
                if (m13832v != qc2Var) {
                    str3 = str7;
                    obj = m13832v;
                    str4 = str2;
                    return new PurchaseResult(i2 == 0, str4, str3, (String) obj, null, true, false, FailureReason.PURCHASE_NOT_LINKED, false, null, null, 1808, null);
                }
                return qc2Var;
            }
        }
        c0224x6fbc48d9 = new C0224x6fbc48d9(this, xa2Var);
        Object obj2 = c0224x6fbc48d9.result;
        i = c0224x6fbc48d9.label;
        qc2Var = qc2.f34309u;
        if (i != 0) {
        }
        String str72 = (String) obj2;
        gtb purchase_not_linked_message2 = String10_commonMainKt.getPurchase_not_linked_message(Res.string.INSTANCE);
        c0224x6fbc48d9.L$0 = null;
        c0224x6fbc48d9.L$1 = null;
        c0224x6fbc48d9.L$2 = str2;
        c0224x6fbc48d9.L$3 = str72;
        c0224x6fbc48d9.I$0 = i2;
        c0224x6fbc48d9.label = 2;
        m13832v = mv1.m13832v(purchase_not_linked_message2, c0224x6fbc48d9);
        if (m13832v != qc2Var) {
        }
        return qc2Var;
    }

    public final void launchPurchase(String str, Boolean bool, Boolean bool2) {
        Object obj;
        Object obj2;
        ly6 ly6Var = ly6.f25312y;
        str.getClass();
        sx7 sx7Var = sx7.f39332a;
        sx7.m18367e(sx7Var, "🚀 INITIATING PURCHASE for productId: ".concat(str), "androidBilling", 2);
        sa2 sa2Var = sa2.f38142u;
        Activity m17958b = sa2.m17958b();
        if (m17958b == null) {
            sx7.m18366d(2, "❌ Cannot launch purchase - no active Activity", "androidBilling", null);
            m5545j(24, SCIPs.XONEyhgwrb, "Cannot launch purchase - no active Activity", str);
            vic vicVar = f6457d;
            if (vicVar != null) {
                Context context = f6454a;
                if (context == null) {
                    zy5.m23857x("appContext");
                    throw null;
                }
                String string = context.getString(R.string.error_occurred_try_again);
                string.getClass();
                ((wic) vicVar).m21435c(string, true);
                return;
            }
            return;
        }
        if (!f6466m.get()) {
            sx7.m18370h(2, "⚠️ Billing client not initialized — reinitializing before purchase", "androidBilling");
            m5545j(24, "billing_client_issues", "Billing client not initialized at purchase time, triggered reinitialize", str);
            m5562u();
        } else if (!f6467n.get()) {
            sx7.m18364b(sx7Var, "Billing client initialized but not connected", "androidBilling", 2);
            m5545j(24, "billing_client_issues", "Billing client initialized but not connected", str);
        }
        if (!isReady()) {
            sx7.m18370h(2, "⚠️ Billing client not ready — Google Play Services unavailable", "androidBilling");
            m5545j(24, "billing_not_ready", "Billing client not ready — Google Play Services unavailable", str);
            m5539d(new PurchaseResult(false, str, "Can not connect to Google Play!", "Please log into your Google account and enable Google Play service.", "", false, false, FailureReason.SERVICE_UNAVAILABLE, true, null, null, 1536, null));
            jzd.m11709o(f6465l, null, null, new AndroidBillingManagerWithSubscription$launchPurchase$1(null), 3);
            return;
        }
        Iterator it = ((Iterable) f6477x.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (zy5.m23838d(((pj9) obj).f32740c, str)) {
                    break;
                }
            }
        }
        pj9 pj9Var = (pj9) obj;
        if (pj9Var == null) {
            String m19210k = tz6.m19210k("ProductDetails missing for ", str, " - querying now");
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18370h(2, "⚠️ ".concat(m19210k), "androidBilling");
            m5545j(24, "product_details_missing", m19210k, str);
            queryAllProductDetails();
            return;
        }
        nwc uiProduct = getUiProduct(str);
        String m14568b = uiProduct != null ? uiProduct.m14568b() : null;
        if (zy5.m23838d(m14568b, "inapp")) {
            pt0 pt0Var = f6455b;
            if (pt0Var == null) {
                return;
            }
            sx7 sx7Var3 = sx7.f39332a;
            String str2 = pj9Var.f32742e;
            mj9 m15848a = pj9Var.m15848a();
            sx7.m18364b(sx7Var3, tz6.m19211l("💰 Launching INAPP purchase: ", str2, " - ", m15848a != null ? m15848a.m13465a() : null), "androidBilling", 2);
            nu5 m17525a = rt0.m17525a();
            m17525a.m14504c0(pj9Var);
            rt0 m14510k = m17525a.m14510k();
            db0 m18222a = st0.m18222a();
            m18222a.m6049o(mv1.m13793E(m14510k));
            if (bool != null) {
                m18222a.m6048n(bool.booleanValue());
            }
            st0 m6037b = m18222a.m6037b();
            sx7.m18367e(sx7Var3, tz6.m19210k("🛒 Launching Google Play billing flow for INAPP ", pj9Var.f32740c, "..."), "androidBilling", 2);
            try {
                wt0 mo10791d = pt0Var.mo10791d(m17958b, m6037b);
                mo10791d.getClass();
                sx7.m18364b(sx7Var3, "📱 Billing flow launch result: " + mo10791d.f47095a + " - " + mo10791d.f47097c, "androidBilling", 2);
                int i = mo10791d.f47095a;
                if (i != 0) {
                    m5545j(24, "billing_flow_launch_failed", "Billing flow failed to launch: code=" + i + ", message=" + mo10791d.f47097c, pj9Var.f32740c);
                    return;
                }
                return;
            } catch (Exception e) {
                String m18102n = sj8.m18102n("Exception launching billing flow: ", e.getMessage());
                sx7 sx7Var4 = sx7.f39332a;
                sx7.m18369g(ly6Var, "androidBilling", e, "❌ ".concat(m18102n));
                m5545j(24, "billing_flow_exception", m18102n, pj9Var.f32740c);
                return;
            }
        }
        if (!zy5.m23838d(m14568b, "subs")) {
            String concat = "Unknown product type for ".concat(str);
            sx7 sx7Var5 = sx7.f39332a;
            sx7.m18366d(2, "❌ ".concat(concat), "androidBilling", null);
            m5545j(24, "unknown_product_type", concat, str);
            return;
        }
        List list = pj9Var.f32746i;
        if (list == null) {
            list = xo3.f48775u;
        }
        lwb m18034g = sg7.m18034g(list, bool2, new C1066z4((byte) 9));
        if (!(m18034g instanceof jwb)) {
            if (!(m18034g instanceof kwb)) {
                if (m18034g != null) {
                    gpc.m8801a();
                    return;
                } else {
                    sx7 sx7Var6 = sx7.f39332a;
                    sx7.m18366d(2, "❌ No offer available for subscription ".concat(str), "androidBilling", null);
                    return;
                }
            }
            sx7.m18367e(sx7.f39332a, tz6.m19210k("🚫 No free-trial offer from Play for ", str, "; asking before the paid plan"), "androidBilling", 2);
            ynb ynbVar = f6450R;
            ArrayList m7745d = ((oj9) ((kwb) m18034g).m12357a()).m15145d().m7745d();
            ListIterator listIterator = m7745d.listIterator(m7745d.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = listIterator.previous();
                    if (((nj9) obj2).m14236d() > 0) {
                        break;
                    }
                }
            }
            nj9 nj9Var = (nj9) obj2;
            String m14235c = nj9Var != null ? nj9Var.m14235c() : null;
            if (m14235c == null) {
                m14235c = "";
            }
            k1a k1aVar = ut0.f43152c;
            tpc tpcVar = new tpc(str, m14235c, vt4.m20906B(nj9Var != null ? nj9Var.m14234b() : null));
            ynbVar.getClass();
            ynbVar.m22921k(null, tpcVar);
            return;
        }
        oj9 oj9Var = (oj9) ((jwb) m18034g).m11611a();
        boolean m5543h = m5543h(oj9Var);
        f6464k = str;
        SharedPreferences m5537b = m5537b();
        if (m5537b != null) {
            SharedPreferences.Editor edit = m5537b.edit();
            edit.getClass();
            INSTANCE.getClass();
            edit.putBoolean(m5558y(str), m5543h);
            edit.commit();
        }
        String m15144c = oj9Var.m15144c();
        m15144c.getClass();
        pt0 pt0Var2 = f6455b;
        if (pt0Var2 == null) {
            return;
        }
        sx7 sx7Var7 = sx7.f39332a;
        sx7.m18364b(sx7Var7, "💰 Launching SUBS purchase: " + pj9Var.f32742e, "androidBilling", 2);
        nu5 m17525a2 = rt0.m17525a();
        m17525a2.m14504c0(pj9Var);
        m17525a2.m14503b0(m15144c);
        rt0 m14510k2 = m17525a2.m14510k();
        db0 m18222a2 = st0.m18222a();
        m18222a2.m6049o(mv1.m13793E(m14510k2));
        if (bool != null) {
            m18222a2.m6048n(bool.booleanValue());
        }
        st0 m6037b2 = m18222a2.m6037b();
        sx7.m18367e(sx7Var7, tz6.m19210k("🛒 Launching Google Play billing flow for SUBS ", pj9Var.f32740c, "..."), "androidBilling", 2);
        try {
            wt0 mo10791d2 = pt0Var2.mo10791d(m17958b, m6037b2);
            mo10791d2.getClass();
            sx7.m18364b(sx7Var7, "📱 Billing flow launch result: " + mo10791d2.f47095a + " - " + mo10791d2.f47097c, "androidBilling", 2);
            int i2 = mo10791d2.f47095a;
            if (i2 != 0) {
                m5545j(24, "subscription_flow_launch_failed", "Subscription billing flow failed to launch: code=" + i2 + ", message=" + mo10791d2.f47097c, pj9Var.f32740c);
            }
        } catch (Exception e2) {
            String m18102n2 = sj8.m18102n("Exception launching subscription billing flow: ", e2.getMessage());
            sx7 sx7Var8 = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e2, "❌ ".concat(m18102n2));
            m5545j(24, "subscription_flow_exception", m18102n2, pj9Var.f32740c);
        }
    }

    /* renamed from: u */
    public final void m5562u() {
        if (f6454a == null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "⚠️ Cannot reinitialize — appContext not set yet. Skipping.", rEiUCjSwq.aMQzMzTkM);
            return;
        }
        if (f6470q.get()) {
            sx7.m18364b(sx7.f39332a, "Billing unavailable in this user profile; skipping reinitialize.", "androidBilling", 2);
            return;
        }
        AtomicBoolean atomicBoolean = f6469p;
        if (atomicBoolean.getAndSet(true)) {
            sx7.m18364b(sx7.f39332a, "Reinitialize already in progress, skipping", "androidBilling", 2);
            return;
        }
        sx7.m18367e(sx7.f39332a, "🔄 Reinitializing billing client from stored parameters...", "androidBilling", 2);
        pt0 pt0Var = f6455b;
        if (pt0Var != null) {
            pt0Var.mo10790c();
        }
        f6455b = null;
        f6467n.set(false);
        f6468o.set(false);
        f6474u.set(0);
        AtomicBoolean atomicBoolean2 = f6466m;
        atomicBoolean2.set(false);
        Context context = f6454a;
        if (context == null) {
            zy5.m23857x("appContext");
            throw null;
        }
        if (!bha.m2089y(context)) {
            sx7.m18370h(2, "Google Play Services not available - reinitialize aborted", "androidBilling");
            atomicBoolean.set(false);
            return;
        }
        aj7 aj7Var = new aj7((byte) 22);
        Context context2 = f6454a;
        if (context2 == null) {
            zy5.m23857x("appContext");
            throw null;
        }
        ot0 ot0Var = new ot0(context2);
        ot0Var.f31149c = this;
        ot0Var.f31147a = aj7Var;
        ot0Var.f31150d = true;
        f6455b = ot0Var.m15325a();
        atomicBoolean2.set(true);
        atomicBoolean.set(false);
        m5556w();
    }

    /* renamed from: e */
    public static void m5540e(rr9 rr9Var, pr9 pr9Var) {
        String str = (String) ps1.m16039q0(pr9Var.m16000c());
        String str2 = "";
        if (str == null) {
            str = "";
        }
        boolean contains = f6473t.contains(str);
        ly6 ly6Var = ly6.f25312y;
        if (contains) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18364b(sx7Var, tz6.m19210k("🔄 Consuming purchase for ", str, " (consumable)"), "androidBilling", 2);
            String str3 = (String) ps1.m16039q0(pr9Var.m16000c());
            if (str3 != null) {
                str2 = str3;
            }
            pt0 pt0Var = f6455b;
            if (pt0Var == null) {
                sx7.m18366d(2, "❌ Cannot consume - billing client not available", "androidBilling", null);
                m5545j(24, "consume_client_unavailable", "Cannot consume - billing client not available", str2);
                return;
            }
            String m15999b = pr9Var.m15999b();
            m15999b.getClass();
            C0443i8 m8091e = fke.m8091e();
            m8091e.m10085h(m15999b);
            fke m10082d = m8091e.m10082d();
            sx7.m18367e(sx7Var, tz6.m19210k("🔄 Consuming purchase for ", str2, " (allows re-purchase)..."), "androidBilling", 2);
            try {
                pt0Var.mo10789b(new C0523kg(str2, (byte) 0), m10082d);
                return;
            } catch (RuntimeException e) {
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18369g(ly6Var, "androidBilling", e, "⚠️ Billing call 'consumeAsync' failed; billing may be unavailable in this user profile");
                return;
            }
        }
        sx7 sx7Var3 = sx7.f39332a;
        sx7.m18364b(sx7Var3, "✅ Acknowledging purchase for " + str + " (" + rr9Var + hqZLxhHl.mWkJbBLDEYXH, "androidBilling", 2);
        String str4 = (String) ps1.m16039q0(pr9Var.m16000c());
        if (str4 != null) {
            str2 = str4;
        }
        pt0 pt0Var2 = f6455b;
        if (pt0Var2 == null) {
            sx7.m18366d(2, "❌ Cannot acknowledge - billing client not available", "androidBilling", null);
            m5545j(24, "acknowledge_client_unavailable", "Cannot acknowledge - billing client not available", str2);
            return;
        }
        String m15999b2 = pr9Var.m15999b();
        m15999b2.getClass();
        byte b = 1;
        if (pr9Var.f33151c.optBoolean("acknowledged", true)) {
            sx7.m18364b(sx7Var3, "✅ Purchase already acknowledged for ".concat(str2), "androidBilling", 2);
            return;
        }
        C0443i8 m8090c = fke.m8090c();
        m8090c.m10085h(m15999b2);
        fke m10081c = m8090c.m10081c();
        sx7.m18367e(sx7Var3, tz6.m19210k("📝 Acknowledging purchase for ", str2, "..."), "androidBilling", 2);
        try {
            pt0Var2.mo10788a(new C0523kg(str2, b), m10081c);
        } catch (RuntimeException e2) {
            sx7 sx7Var4 = sx7.f39332a;
            sx7.m18369g(ly6Var, "androidBilling", e2, "⚠️ Billing call 'acknowledgePurchase' failed; billing may be unavailable in this user profile");
        }
    }

    /* renamed from: v */
    public static void m5555v(final pr9 pr9Var, final rr9 rr9Var, final rv4 rv4Var, final long j, final String str) {
        String str2 = (String) ps1.m16039q0(pr9Var.m16000c());
        if (str2 == null) {
            str2 = "";
        }
        final String m15999b = pr9Var.m15999b();
        m15999b.getClass();
        final xv5 mo2814g = zv5.f53149a.mo2814g();
        vq8 vq8Var = (vq8) f6446N.m8418b(j, new tl4() { // from class: com.kahf.dns.utils.a
            @Override // p000.tl4
            public final Object invoke() {
                long j2;
                Object q9dVar;
                String str3;
                xv5 m22369d;
                n76 n76Var;
                xv5 xv5Var;
                AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = AndroidBillingManagerWithSubscription.INSTANCE;
                List list = z9d.f52010a;
                AndroidBillingManagerWithSubscription.INSTANCE.getClass();
                SharedPreferences m5550p = AndroidBillingManagerWithSubscription.m5550p();
                rr9 rr9Var2 = rr9.this;
                String str4 = m15999b;
                String string = m5550p.getString(k97.m11870D(rr9Var2, str4), null);
                t9d m21945a = string != null ? x9d.m21945a(string) : null;
                rv4 rv4Var2 = rv4Var;
                o9d o9dVar = rv4Var2.f37327a;
                String str5 = rv4Var2.f37328b;
                xv5 xv5Var2 = mo2814g;
                xv5Var2.getClass();
                String str6 = str;
                if (m21945a == null || m21945a.f39980e != null || !zy5.m23838d(m21945a.f39981f, str6)) {
                    m21945a = null;
                }
                int i = m21945a != null ? m21945a.f39976a : 0;
                int i2 = i + 1;
                xv5 xv5Var3 = (m21945a == null || (xv5Var = m21945a.f39977b) == null) ? xv5Var2 : xv5Var;
                if (o9dVar == o9d.f29926u) {
                    q9dVar = r9d.f36336a;
                } else {
                    xv5 m22369d2 = xv5Var3.m22369d(z9d.f52012c);
                    if (xv5Var2.compareTo(m22369d2) >= 0) {
                        q9dVar = p9d.f32096a;
                    } else {
                        if (y9d.f49979a[o9dVar.ordinal()] == 1) {
                            j2 = z9d.f52011b;
                        } else {
                            List list2 = z9d.f52010a;
                            j2 = ((dj3) list2.get(u6d.m19372g(i, 0, mv1.m13826o(list2)))).f8150u;
                        }
                        q9dVar = new q9d((xv5) i30.m9907W(xv5Var2.m22369d(j2), m22369d2));
                    }
                }
                boolean z = q9dVar instanceof q9d;
                q9d q9dVar2 = z ? (q9d) q9dVar : null;
                if (q9dVar2 != null) {
                    m22369d = q9dVar2.f34176a;
                    str3 = str5;
                } else {
                    str3 = str5;
                    m22369d = xv5Var2.m22369d(z9d.f52014e);
                }
                t9d t9dVar = new t9d(i2, xv5Var3, m22369d, str3, null, str6, !z, xv5Var2, 16);
                s9d s9dVar = (s9d) q9dVar;
                AndroidBillingManagerWithSubscription.m5536D(rr9Var2, str4, t9dVar);
                if ((s9dVar instanceof q9d) && dj3.m6345c(((q9d) s9dVar).f34176a.m22368c(xv5Var2), z9d.f52013d) <= 0 && (n76Var = (n76) AndroidBillingManagerWithSubscription.f6453U.put(str4, jzd.m11709o(AndroidBillingManagerWithSubscription.f6465l, null, null, new AndroidBillingManagerWithSubscription$scheduleRetry$outcome$1$1(s9dVar, xv5Var2, str4, pr9Var, j, rr9Var2, null), 3))) != null) {
                    n76Var.mo6991b(null);
                }
                return new vq8(t9dVar, s9dVar);
            }
        });
        if (vq8Var == null) {
            sx7.m18364b(sx7.f39332a, "⏭️ Account changed; no retry for ".concat(str2), "androidBilling", 2);
            return;
        }
        t9d t9dVar = (t9d) vq8Var.f44884u;
        s9d s9dVar = (s9d) vq8Var.f44885v;
        if (s9dVar instanceof q9d) {
            sx7 sx7Var = sx7.f39332a;
            int m18694a = t9dVar.m18694a();
            String m6355m = dj3.m6355m(((q9d) s9dVar).m16361a().m22368c(mo2814g));
            StringBuilder m15982p = pr1.m15982p(m18694a, "⏳ Verification retry #", " for ", str2, " in ");
            m15982p.append(m6355m);
            sx7.m18370h(2, m15982p.toString(), "androidBilling");
            return;
        }
        if (zy5.m23838d(s9dVar, r9d.f36336a)) {
            m5545j(16, "verification_terminal", "Verification stopped for this purchase token (re-checked daily): " + rv4Var.m17543a(), str2);
            return;
        }
        if (zy5.m23838d(s9dVar, p9d.f32096a)) {
            int m18694a2 = t9dVar.m18694a();
            String m6355m2 = dj3.m6355m(z9d.m23475a());
            String m17543a = rv4Var.m17543a();
            StringBuilder m15982p2 = pr1.m15982p(m18694a2, "Verification gave up after ", hqZLxhHl.QdAVdDSnHJybI, m6355m2, " (re-checked daily); last code ");
            m15982p2.append(m17543a);
            m5545j(16, "verification_gave_up", m15982p2.toString(), str2);
            return;
        }
        gpc.m8801a();
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final class PurchaseResult {
        public static final int $stable = 0;
        private final boolean backendSuccess;
        private final boolean billingSuccess;
        private final String details;
        private final FailureReason failureReason;
        private final boolean isGooglePlayUnavailable;
        private final boolean isSuccess;
        private final Boolean isTrialCheckout;
        private final String message;
        private final String productId;
        private final String purchaseToken;
        private final String title;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ PurchaseResult(boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, com.kahf.dns.utils.AndroidBillingManagerWithSubscription.FailureReason r22, boolean r23, java.lang.Boolean r24, java.lang.String r25, int r26, p000.mr2 r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 16
                if (r1 == 0) goto La
                java.lang.String r1 = ""
                r7 = r1
                goto Lc
            La:
                r7 = r19
            Lc:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L13
                r8 = r2
                goto L15
            L13:
                r8 = r20
            L15:
                r1 = r0 & 64
                if (r1 == 0) goto L1b
                r9 = r2
                goto L1d
            L1b:
                r9 = r21
            L1d:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L25
                com.kahf.dns.utils.AndroidBillingManagerWithSubscription$FailureReason r1 = com.kahf.dns.utils.AndroidBillingManagerWithSubscription.FailureReason.UNKNOWN
                r10 = r1
                goto L27
            L25:
                r10 = r22
            L27:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L2d
                r11 = r2
                goto L2f
            L2d:
                r11 = r23
            L2f:
                r1 = r0 & 512(0x200, float:7.17E-43)
                r2 = 0
                if (r1 == 0) goto L36
                r12 = r2
                goto L38
            L36:
                r12 = r24
            L38:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L46
                r13 = r2
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r2 = r14
                goto L50
            L46:
                r13 = r25
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
            L50:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kahf.dns.utils.AndroidBillingManagerWithSubscription.PurchaseResult.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.kahf.dns.utils.AndroidBillingManagerWithSubscription$FailureReason, boolean, java.lang.Boolean, java.lang.String, int, mr2):void");
        }

        public static /* synthetic */ PurchaseResult copy$default(PurchaseResult purchaseResult, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, FailureReason failureReason, boolean z4, Boolean bool, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = purchaseResult.isSuccess;
            }
            if ((i & 2) != 0) {
                str = purchaseResult.productId;
            }
            if ((i & 4) != 0) {
                str2 = purchaseResult.title;
            }
            if ((i & 8) != 0) {
                str3 = purchaseResult.message;
            }
            if ((i & 16) != 0) {
                str4 = purchaseResult.details;
            }
            if ((i & 32) != 0) {
                z2 = purchaseResult.billingSuccess;
            }
            if ((i & 64) != 0) {
                z3 = purchaseResult.backendSuccess;
            }
            if ((i & 128) != 0) {
                failureReason = purchaseResult.failureReason;
            }
            if ((i & 256) != 0) {
                z4 = purchaseResult.isGooglePlayUnavailable;
            }
            if ((i & 512) != 0) {
                bool = purchaseResult.isTrialCheckout;
            }
            if ((i & 1024) != 0) {
                str5 = purchaseResult.purchaseToken;
            }
            Boolean bool2 = bool;
            String str6 = str5;
            FailureReason failureReason2 = failureReason;
            boolean z5 = z4;
            boolean z6 = z2;
            boolean z7 = z3;
            String str7 = str4;
            String str8 = str2;
            return purchaseResult.copy(z, str, str8, str3, str7, z6, z7, failureReason2, z5, bool2, str6);
        }

        public final boolean component1() {
            return this.isSuccess;
        }

        public final Boolean component10() {
            return this.isTrialCheckout;
        }

        public final String component11() {
            return this.purchaseToken;
        }

        public final String component2() {
            return this.productId;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.message;
        }

        public final String component5() {
            return this.details;
        }

        public final boolean component6() {
            return this.billingSuccess;
        }

        public final boolean component7() {
            return this.backendSuccess;
        }

        public final FailureReason component8() {
            return this.failureReason;
        }

        public final boolean component9() {
            return this.isGooglePlayUnavailable;
        }

        public final PurchaseResult copy(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, FailureReason failureReason, boolean z4, Boolean bool, String str5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            failureReason.getClass();
            return new PurchaseResult(z, str, str2, str3, str4, z2, z3, failureReason, z4, bool, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseResult)) {
                return false;
            }
            PurchaseResult purchaseResult = (PurchaseResult) obj;
            return this.isSuccess == purchaseResult.isSuccess && zy5.m23838d(this.productId, purchaseResult.productId) && zy5.m23838d(this.title, purchaseResult.title) && zy5.m23838d(this.message, purchaseResult.message) && zy5.m23838d(this.details, purchaseResult.details) && this.billingSuccess == purchaseResult.billingSuccess && this.backendSuccess == purchaseResult.backendSuccess && this.failureReason == purchaseResult.failureReason && this.isGooglePlayUnavailable == purchaseResult.isGooglePlayUnavailable && zy5.m23838d(this.isTrialCheckout, purchaseResult.isTrialCheckout) && zy5.m23838d(this.purchaseToken, purchaseResult.purchaseToken);
        }

        public final boolean getBackendSuccess() {
            return this.backendSuccess;
        }

        public final boolean getBillingSuccess() {
            return this.billingSuccess;
        }

        public final String getDetails() {
            return this.details;
        }

        public final FailureReason getFailureReason() {
            return this.failureReason;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int m18682f = t8c.m18682f((this.failureReason.hashCode() + t8c.m18682f(t8c.m18682f(t8c.m18683g(t8c.m18683g(t8c.m18683g(t8c.m18683g(Boolean.hashCode(this.isSuccess) * 31, this.productId, 31), this.title, 31), this.message, 31), this.details, 31), 31, this.billingSuccess), 31, this.backendSuccess)) * 31, 31, this.isGooglePlayUnavailable);
            Boolean bool = this.isTrialCheckout;
            int hashCode = (m18682f + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.purchaseToken;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final boolean isGooglePlayUnavailable() {
            return this.isGooglePlayUnavailable;
        }

        public final boolean isSuccess() {
            return this.isSuccess;
        }

        public final Boolean isTrialCheckout() {
            return this.isTrialCheckout;
        }

        public String toString() {
            boolean z = this.isSuccess;
            String str = this.productId;
            String str2 = this.title;
            String str3 = this.message;
            String str4 = this.details;
            boolean z2 = this.billingSuccess;
            boolean z3 = this.backendSuccess;
            FailureReason failureReason = this.failureReason;
            boolean z4 = this.isGooglePlayUnavailable;
            Boolean bool = this.isTrialCheckout;
            String str5 = this.purchaseToken;
            StringBuilder m18685i = t8c.m18685i("PurchaseResult(isSuccess=", ", productId=", str, ", title=", z);
            pr1.m15992z(m18685i, str2, ", message=", str3, ", details=");
            m18685i.append(str4);
            m18685i.append(", billingSuccess=");
            m18685i.append(z2);
            m18685i.append(", backendSuccess=");
            m18685i.append(z3);
            m18685i.append(", failureReason=");
            m18685i.append(failureReason);
            m18685i.append(", isGooglePlayUnavailable=");
            m18685i.append(z4);
            m18685i.append(", isTrialCheckout=");
            m18685i.append(bool);
            m18685i.append(", purchaseToken=");
            return pr1.m15980n(m18685i, str5, ")");
        }

        public PurchaseResult(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, FailureReason failureReason, boolean z4, Boolean bool, String str5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            failureReason.getClass();
            this.isSuccess = z;
            this.productId = str;
            this.title = str2;
            this.message = str3;
            this.details = str4;
            this.billingSuccess = z2;
            this.backendSuccess = z3;
            this.failureReason = failureReason;
            this.isGooglePlayUnavailable = z4;
            this.isTrialCheckout = bool;
            this.purchaseToken = str5;
        }
    }
}
