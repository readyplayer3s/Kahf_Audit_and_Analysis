package com.kahf.dns.features.notification;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0898ul;
import p000.C0917v3;
import p000.C0957w6;
import p000.b88;
import p000.bxb;
import p000.c88;
import p000.cz8;
import p000.d0a;
import p000.dt2;
import p000.e88;
import p000.fj7;
import p000.g88;
import p000.ij7;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kg7;
import p000.kl6;
import p000.l3a;
import p000.ly6;
import p000.o20;
import p000.o68;
import p000.pr1;
import p000.qc2;
import p000.qpc;
import p000.so6;
import p000.stb;
import p000.sx7;
import p000.v11;
import p000.vu2;
import p000.w3b;
import p000.xa2;
import p000.xv5;
import p000.z78;
import p000.za2;
import p000.ztb;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class ReminderNotificationWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6361A;

    /* renamed from: B */
    public final kl6 f6362B;

    /* renamed from: C */
    public final kl6 f6363C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cz8 cz8Var = new cz8(this, (byte) 6);
        so6 so6Var = so6.f38881u;
        this.f6361A = iq5.m10513r(so6Var, cz8Var);
        this.f6362B = iq5.m10513r(so6Var, new cz8(this, (byte) 7));
        this.f6363C = iq5.m10513r(so6Var, new cz8(this, (byte) 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        l3a l3aVar;
        int i;
        if (xa2Var instanceof l3a) {
            l3aVar = (l3a) xa2Var;
            int i2 = l3aVar.f23558w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3aVar.f23558w = i2 - Integer.MIN_VALUE;
                Object obj = l3aVar.f23556u;
                i = l3aVar.f23558w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0957w6 c0957w6 = new C0957w6(this, xa2Var2, (byte) 20);
                    l3aVar.f23558w = 1;
                    obj = jzd.m11694F(dt2Var, c0957w6, l3aVar);
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
        l3aVar = new l3a(this, (za2) xa2Var);
        Object obj2 = l3aVar.f23556u;
        i = l3aVar.f23558w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final void m3830e() {
        Integer m3833h;
        boolean z;
        o20 c88Var;
        try {
            String stringFromPreferences = m3835j().getStringFromPreferences("last_subscription_type", "");
            String stringFromPreferences2 = m3835j().getStringFromPreferences("trial_status", "none");
            String stringFromPreferences3 = m3835j().getStringFromPreferences("last_subscription_recurring", "");
            String stringFromPreferences4 = m3835j().getStringFromPreferences("last_subscription_cancel_at_period_end", "");
            if (ij7.m10389k(stringFromPreferences, stringFromPreferences3, stringFromPreferences4)) {
                boolean equalsIgnoreCase = stringFromPreferences.equalsIgnoreCase("PREMIUM");
                if (zy5.m23838d(stringFromPreferences2, equalsIgnoreCase ? "premium" : "active")) {
                    String stringFromPreferences5 = m3835j().getStringFromPreferences("last_subscription_period_end", "");
                    if (stb.m18260Z0(stringFromPreferences5) || (m3833h = m3833h(stringFromPreferences5)) == null) {
                        return;
                    }
                    int intValue = m3833h.intValue();
                    boolean z2 = true;
                    if (intValue > 1) {
                        return;
                    }
                    C0898ul c0898ul = new C0898ul();
                    if (equalsIgnoreCase) {
                        z = false;
                    } else {
                        boolean equalsIgnoreCase2 = stringFromPreferences.equalsIgnoreCase("SADAKA");
                        SharedPreferences sharedPreferences = c0898ul.f42622v;
                        z = equalsIgnoreCase2 ? sharedPreferences.getBoolean("disable_sadaka_reminders", false) : sharedPreferences.getBoolean("disable_trial_reminders", false);
                    }
                    if (z) {
                        return;
                    }
                    boolean equalsIgnoreCase3 = stringFromPreferences.equalsIgnoreCase("TRIAL");
                    qpc m10361L = ij7.m10361L(m3835j().getStringFromPreferences("last_subscription_recurring", ""));
                    ly6 ly6Var = ly6.f25309v;
                    if (equalsIgnoreCase3 && ij7.m10391m(m10361L)) {
                        c88Var = new z78(ij7.m10401x(m3835j().getStringFromPreferences("last_subscription_cancel_at_period_end", "")));
                    } else if (equalsIgnoreCase3 && !ij7.m10390l(m10361L)) {
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6Var, "ReminderNotifWorker", null, "Trial kind still unknown — skipping the last-day notice");
                        return;
                    } else {
                        if (!equalsIgnoreCase || !ij7.m10402y(stringFromPreferences4)) {
                            z2 = false;
                        }
                        c88Var = new c88(stringFromPreferences, z2);
                    }
                    if (zy5.m23838d(m3835j().getStringFromPreferences("last_day_reminder_fired_for_period_end", ""), stringFromPreferences5)) {
                        return;
                    }
                    ((o68) this.f6361A.getValue()).m14842h(c88Var);
                    m3835j().saveToPreferences("last_day_reminder_fired_for_period_end", stringFromPreferences5);
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "ReminderNotifWorker", null, "Showed last-day reminder for " + stringFromPreferences + " (" + d0a.m5838a(c88Var.getClass()).m23680f() + ", ends in " + intValue + " day(s))");
                }
            }
        } catch (Exception e) {
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "ReminderNotifWorker", e, "Last-day check failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0006, B:6:0x002d, B:13:0x003e, B:17:0x0050, B:22:0x006a, B:24:0x0087, B:26:0x008e, B:29:0x00a5, B:33:0x00b7, B:35:0x009d, B:37:0x0037), top: B:2:0x0006 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3831f() {
        try {
            String stringFromPreferences = m3835j().getStringFromPreferences("last_subscription_type", "");
            String stringFromPreferences2 = m3835j().getStringFromPreferences("trial_status", "none");
            boolean m23792y0 = ztb.m23792y0(stringFromPreferences, "SADAKA", true);
            if (m23792y0) {
                if (!zy5.m23838d(stringFromPreferences2, "expired")) {
                }
                if (!m23792y0 && !new C0898ul().f42622v.getBoolean("disable_sadaka_reminders", false)) {
                    int intFromPreferences = m3835j().getIntFromPreferences("last_trial_days_remaining", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!zy5.m23838d(stringFromPreferences2, "active")) {
                        if (intFromPreferences <= 0) {
                            return;
                        }
                        m3834i(currentTimeMillis, "last_sadaka_reminder_time", new b88(intFromPreferences, false), "sadaka reminder (" + intFromPreferences + " days remaining)");
                        return;
                    }
                    if (zy5.m23838d(stringFromPreferences2, "expired")) {
                        long longFromPreferences = m3835j().getLongFromPreferences("sadaka_expiry_first_seen_time", 0L);
                        if (longFromPreferences == 0) {
                            m3835j().saveToPreferences("sadaka_expiry_first_seen_time", currentTimeMillis);
                            longFromPreferences = currentTimeMillis;
                        }
                        long j = longFromPreferences;
                        if (ij7.m10358I(j, m3835j().getLongFromPreferences("last_sadaka_expired_reminder_time", 0L), currentTimeMillis)) {
                            ((o68) this.f6361A.getValue()).m14842h(new b88(0, true));
                            m3835j().saveToPreferences("last_sadaka_expired_reminder_time", currentTimeMillis);
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18369g(ly6.f25309v, "ReminderNotifWorker", null, "Showed sadaka expired notification (day " + ((currentTimeMillis - j) / 86400000) + " since expiry)");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            m3836k("sadaka_expiry_first_seen_time", "last_sadaka_expired_reminder_time");
            if (!m23792y0) {
                return;
            }
            int intFromPreferences2 = m3835j().getIntFromPreferences("last_trial_days_remaining", 0);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!zy5.m23838d(stringFromPreferences2, "active")) {
            }
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "ReminderNotifWorker", e, "Sadaka check failed");
        }
    }

    /* renamed from: g */
    public final void m3832g() {
        long j;
        long j2;
        try {
            String stringFromPreferences = m3835j().getStringFromPreferences("last_subscription_type", "");
            String stringFromPreferences2 = m3835j().getStringFromPreferences("trial_status", "none");
            boolean m23792y0 = ztb.m23792y0(stringFromPreferences, "TRIAL", true);
            qpc m10361L = ij7.m10361L(m3835j().getStringFromPreferences("last_subscription_recurring", ""));
            if (ij7.m10359J(m23792y0, m10361L, zy5.m23838d(stringFromPreferences2, "expired"))) {
                m3836k("trial_expiry_first_seen_time", "last_trial_reminder_time");
            }
            if (m23792y0 && ij7.m10390l(m10361L) && !new C0898ul().f42622v.getBoolean("disable_trial_reminders", false)) {
                int intFromPreferences = m3835j().getIntFromPreferences("last_trial_days_remaining", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (zy5.m23838d(stringFromPreferences2, "active")) {
                    if (intFromPreferences <= 0) {
                        return;
                    }
                    m3834i(currentTimeMillis, "last_trial_active_reminder_time", new g88(intFromPreferences), "trial reminder (" + intFromPreferences + " days remaining)");
                    return;
                }
                if (zy5.m23838d(stringFromPreferences2, "expired")) {
                    long longFromPreferences = m3835j().getLongFromPreferences("trial_expiry_first_seen_time", 0L);
                    if (longFromPreferences != 0) {
                        j = currentTimeMillis;
                        j2 = longFromPreferences;
                    } else {
                        m3835j().saveToPreferences("trial_expiry_first_seen_time", currentTimeMillis);
                        j = currentTimeMillis;
                        j2 = j;
                    }
                    long j3 = j2;
                    long j4 = j;
                    if (ij7.m10358I(j2, m3835j().getLongFromPreferences("last_trial_reminder_time", 0L), j)) {
                        ((o68) this.f6361A.getValue()).m14842h(e88.f9517g);
                        m3835j().saveToPreferences("last_trial_reminder_time", j4);
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6.f25309v, "ReminderNotifWorker", null, "Showed trial expired notification (day " + ((j4 - j3) / 86400000) + " since expiry)");
                    }
                }
            }
        } catch (Exception e) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "ReminderNotifWorker", e, "Trial check failed");
        }
    }

    /* renamed from: h */
    public final Integer m3833h(String str) {
        xv5 m12069o = kg7.m12069o(str);
        if (m12069o == null) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("Failed to parse period end: ", str, null, "ReminderNotifWorker", 2);
            return null;
        }
        bxb m8048g = fj7.m8048g(new w3b(m3835j()).m21077a(), m12069o);
        if (m8048g.m2536d()) {
            return null;
        }
        return Integer.valueOf(m8048g.m2533a());
    }

    /* renamed from: i */
    public final void m3834i(long j, String str, o20 o20Var, String str2) {
        Integer m3833h;
        String stringFromPreferences = m3835j().getStringFromPreferences("last_subscription_period_end", "");
        if (!(stb.m18260Z0(stringFromPreferences) || (m3833h = m3833h(stringFromPreferences)) == null || m3833h.intValue() > 1) || j - m3835j().getLongFromPreferences(str, 0L) < 604800000) {
            return;
        }
        ((o68) this.f6361A.getValue()).m14842h(o20Var);
        m3835j().saveToPreferences(str, j);
        sx7 sx7Var = sx7.f39332a;
        sx7.m18369g(ly6.f25309v, "ReminderNotifWorker", null, "Showed ".concat(str2));
    }

    /* renamed from: j */
    public final PreferencesHelper m3835j() {
        return (PreferencesHelper) this.f6362B.getValue();
    }

    /* renamed from: k */
    public final void m3836k(String str, String str2) {
        if (m3835j().getLongFromPreferences(str, 0L) != 0) {
            m3835j().saveToPreferences(str, 0L);
        }
        if (m3835j().getLongFromPreferences(str2, 0L) != 0) {
            m3835j().saveToPreferences(str2, 0L);
        }
    }
}
