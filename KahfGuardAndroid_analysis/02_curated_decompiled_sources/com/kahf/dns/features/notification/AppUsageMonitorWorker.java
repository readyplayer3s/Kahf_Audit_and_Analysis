package com.kahf.dns.features.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0602ml;
import p000.C0917v3;
import p000.dt2;
import p000.i30;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.l60;
import p000.ly6;
import p000.o68;
import p000.pr1;
import p000.qc2;
import p000.so6;
import p000.sx7;
import p000.ttb;
import p000.tz6;
import p000.v11;
import p000.v20;
import p000.v78;
import p000.vu2;
import p000.xa2;
import p000.y82;
import p000.za2;
import p000.ztb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AppUsageMonitorWorker extends CoroutineWorker implements jh6 {

    /* renamed from: D */
    public static final boolean f6352D = v20.m20278v();

    /* renamed from: A */
    public final String f6353A;

    /* renamed from: B */
    public final kl6 f6354B;

    /* renamed from: C */
    public final kl6 f6355C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageMonitorWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f6353A = "AppUsageMonitorWorker";
        y82 y82Var = new y82(this, (byte) 13);
        so6 so6Var = so6.f38881u;
        this.f6354B = iq5.m10513r(so6Var, y82Var);
        this.f6355C = iq5.m10513r(so6Var, new y82(this, (byte) 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        l60 l60Var;
        int i;
        if (xa2Var instanceof l60) {
            l60Var = (l60) xa2Var;
            int i2 = l60Var.f23712w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l60Var.f23712w = i2 - Integer.MIN_VALUE;
                Object obj = l60Var.f23710u;
                i = l60Var.f23712w;
                xa2 xa2Var2 = null;
                byte b = 1;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0602ml c0602ml = new C0602ml(this, xa2Var2, b);
                    l60Var.f23712w = 1;
                    obj = jzd.m11694F(dt2Var, c0602ml, l60Var);
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
                obj.getClass();
                return obj;
            }
        }
        l60Var = new l60(this, (za2) xa2Var);
        Object obj2 = l60Var.f23710u;
        i = l60Var.f23712w;
        xa2 xa2Var22 = null;
        byte b2 = 1;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final long m3817e(long j, String str) {
        try {
            Long m23785J0 = ztb.m23785J0(((PreferencesHelper) this.f6354B.getValue()).getStringFromPreferences(str, String.valueOf(j)));
            return m23785J0 != null ? m23785J0.longValue() : j;
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25311x, this.f6353A, e, tz6.m19210k("Failed to get time preference ", str, ", using fallback"));
            return j;
        }
    }

    /* renamed from: f */
    public final void m3818f(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        sx7 sx7Var = sx7.f39332a;
        String m9895K = i30.m9895K(j);
        String m9895K2 = i30.m9895K(j2);
        String m9895K3 = i30.m9895K(j3);
        StringBuilder m15984r = pr1.m15984r("\n            App Usage Monitor State:\n            - Current time: ", m9895K, "\n            - Last app open: ", m9895K2, " (");
        m15984r.append(j4);
        m15984r.append("m ago)\n            - Last notification: ");
        m15984r.append(m9895K3);
        tz6.m19224y(m15984r, " (", j5, "m ago)\n            - First notification shown: ");
        tz6.m19225z(m15984r, z, "\n            - Should show notification: ", z2, "\n            - Thresholds: Initial=4320m, Follow-up=120m\n            - Debug mode: ");
        m15984r.append(f6352D);
        m15984r.append("\n        ");
        sx7.m18364b(sx7Var, ttb.m19039o0(m15984r.toString()), this.f6353A, 2);
    }

    /* renamed from: g */
    public final boolean m3819g(long j, long j2, boolean z) {
        String str = this.f6353A;
        if (!z && j >= 4320) {
            sx7.m18364b(sx7.f39332a, pr1.m15977k(j, "Triggering first notification after ", "m of inactivity"), str, 2);
            return true;
        }
        if (!z || j < 4320 || j2 < 120) {
            sx7.m18364b(sx7.f39332a, pr1.m15977k(!z ? 4320 - j : 120 - j2, "Skipping notification: waiting ", "m more"), str, 2);
            return false;
        }
        sx7.m18364b(sx7.f39332a, pr1.m15977k(j2, "Triggering follow-up notification: ", "m since last notification"), str, 2);
        return true;
    }

    /* renamed from: h */
    public final void m3820h(boolean z, long j) {
        kl6 kl6Var = this.f6354B;
        String str = this.f6353A;
        try {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, "Showing app usage reminder notification at ".concat(i30.m9895K(j)), str);
            ((o68) this.f6355C.getValue()).m14842h(v78.f43889g);
            ((PreferencesHelper) kl6Var.getValue()).saveToPreferences("last_usage_notification_time", String.valueOf(j));
            if (z) {
                return;
            }
            ((PreferencesHelper) kl6Var.getValue()).saveToPreferences("first_notification_shown", true);
            sx7.m18364b(sx7Var, "First notification shown, next at ".concat(i30.m9895K(j + 7200000)), str, 2);
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, str, e, "Failed to show notification or update state");
            throw e;
        }
    }
}
