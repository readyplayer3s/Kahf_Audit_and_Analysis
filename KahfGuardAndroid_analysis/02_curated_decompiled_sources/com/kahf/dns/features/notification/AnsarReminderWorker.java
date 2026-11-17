package com.kahf.dns.features.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.AbstractC0909uw;
import p000.C0872tw;
import p000.C0898ul;
import p000.C0917v3;
import p000.C0957w6;
import p000.C1020xw;
import p000.C1057yw;
import p000.cm0;
import p000.dt2;
import p000.iq5;
import p000.jh6;
import p000.jo2;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.kp2;
import p000.ly6;
import p000.o68;
import p000.qc2;
import p000.qv6;
import p000.so6;
import p000.sx7;
import p000.tz6;
import p000.u78;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.y82;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AnsarReminderWorker extends CoroutineWorker implements jh6 {

    /* renamed from: C */
    public static final C1020xw f6347C;

    /* renamed from: D */
    public static final kl6 f6348D;

    /* renamed from: E */
    public static final kl6 f6349E;

    /* renamed from: A */
    public final kl6 f6350A;

    /* renamed from: B */
    public final kl6 f6351B;

    static {
        C1020xw c1020xw = new C1020xw((byte) 0);
        f6347C = c1020xw;
        y82 y82Var = new y82(c1020xw, (byte) 11);
        so6 so6Var = so6.f38881u;
        f6348D = iq5.m10513r(so6Var, y82Var);
        f6349E = iq5.m10513r(so6Var, new y82(c1020xw, (byte) 12));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnsarReminderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cm0 cm0Var = new cm0(this, (byte) 3);
        so6 so6Var = so6.f38881u;
        this.f6350A = iq5.m10513r(so6Var, cm0Var);
        this.f6351B = iq5.m10513r(so6Var, new cm0(this, (byte) 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        C1057yw c1057yw;
        int i;
        if (xa2Var instanceof C1057yw) {
            c1057yw = (C1057yw) xa2Var;
            int i2 = c1057yw.f51298w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1057yw.f51298w = i2 - Integer.MIN_VALUE;
                Object obj = c1057yw.f51296u;
                i = c1057yw.f51298w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0957w6 c0957w6 = new C0957w6(this, xa2Var2, (byte) 2);
                    c1057yw.f51298w = 1;
                    obj = jzd.m11694F(dt2Var, c0957w6, c1057yw);
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
        c1057yw = new C1057yw(this, (za2) xa2Var);
        Object obj2 = c1057yw.f51296u;
        i = c1057yw.f51298w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final void m3816e() {
        boolean booleanFromPreferences = ((PreferencesHelper) this.f6351B.getValue()).getBooleanFromPreferences(PrefKeys.IS_DONATION_VISIBLE, false);
        ly6 ly6Var = ly6.f25309v;
        if (!booleanFromPreferences) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6Var, "AnsarReminderWorker", null, "Donation disabled via Remote Config, skipping show");
            return;
        }
        if (new C0898ul().f42622v.getBoolean("disable_ansar_reminders", false)) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6Var, "AnsarReminderWorker", null, "Ansar reminders disabled by user, skipping show");
            return;
        }
        qv6 m11471d = jo2.m11471d(qv6.Companion);
        if (m11471d.m16957b() == kp2.f22821y) {
            List list = AbstractC0909uw.f43307a;
            C0872tw m20126a = AbstractC0909uw.m20126a(this.f21132u);
            ((o68) this.f6350A.getValue()).m14842h(new u78(m20126a.m19149c(), m20126a.m19147a(), m20126a.m19148b()));
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6Var, "AnsarReminderWorker", null, tz6.m19210k("Showed ansar reminder notification (variant=", m20126a.m19149c(), ")"));
            return;
        }
        sx7 sx7Var4 = sx7.f39332a;
        sx7.m18369g(ly6Var, "AnsarReminderWorker", null, "Today is " + m11471d.m16957b() + ", not Friday — skipping show");
    }
}
