package com.kahf.dns.features.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C0917v3;
import p000.C0957w6;
import p000.cm0;
import p000.d55;
import p000.dt2;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.ly6;
import p000.o68;
import p000.qc2;
import p000.so6;
import p000.sx7;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.y78;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class HabitReminderWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6359A;

    /* renamed from: B */
    public final kl6 f6360B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitReminderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cm0 cm0Var = new cm0(this, (byte) 21);
        so6 so6Var = so6.f38881u;
        this.f6359A = iq5.m10513r(so6Var, cm0Var);
        this.f6360B = iq5.m10513r(so6Var, new cm0(this, (byte) 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        d55 d55Var;
        int i;
        if (xa2Var instanceof d55) {
            d55Var = (d55) xa2Var;
            int i2 = d55Var.f7358w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d55Var.f7358w = i2 - Integer.MIN_VALUE;
                Object obj = d55Var.f7356u;
                i = d55Var.f7358w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0957w6 c0957w6 = new C0957w6(this, xa2Var2, (byte) 9);
                    d55Var.f7358w = 1;
                    obj = jzd.m11694F(dt2Var, c0957w6, d55Var);
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
        d55Var = new d55(this, (za2) xa2Var);
        Object obj2 = d55Var.f7356u;
        i = d55Var.f7358w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final void m3829e() {
        kl6 kl6Var = this.f6360B;
        boolean booleanFromPreferences$default = PreferencesHelper.getBooleanFromPreferences$default((PreferencesHelper) kl6Var.getValue(), "pref_habit_tracker_notifications_enabled", false, 2, null);
        ly6 ly6Var = ly6.f25309v;
        if (!booleanFromPreferences$default) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6Var, "HabitReminderWorker", null, "Skipped — notifications disabled by user");
        } else if (PreferencesHelper.getBooleanFromPreferences$default((PreferencesHelper) kl6Var.getValue(), "pref_habit_tracker_today_has_entry", false, 2, null)) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6Var, "HabitReminderWorker", null, "Skipped — user already logged habits today");
        } else {
            ((o68) this.f6359A.getValue()).m14842h(y78.f49856g);
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18369g(ly6Var, "HabitReminderWorker", null, "Habit daily reminder notification shown");
        }
    }
}
