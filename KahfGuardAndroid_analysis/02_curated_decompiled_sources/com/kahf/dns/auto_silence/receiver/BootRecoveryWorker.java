package com.kahf.dns.auto_silence.receiver;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.features.notification.AnsarReminderWorker;
import com.kahf.dns.features.notification.AppUsageMonitorWorker;
import com.kahf.dns.features.notification.WeeklyImpactWorker;
import com.kahf.dns.utils.PreferencesHelper;
import p000.C1020xw;
import p000.aj7;
import p000.cab;
import p000.gt6;
import p000.ht6;
import p000.i30;
import p000.jzd;
import p000.ly6;
import p000.ou9;
import p000.sx7;
import p000.tda;
import p000.uda;
import p000.up2;
import p000.v20;
import p000.xa2;
import p000.xd9;
import p000.y3a;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class BootRecoveryWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootRecoveryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    public final Object mo1175d(xa2 xa2Var) {
        Object tdaVar;
        sx7 sx7Var = sx7.f39332a;
        try {
            try {
                tdaVar = Boolean.valueOf(new PreferencesHelper().getBooleanFromPreferences("pref_user_enabled_guards", false));
            } catch (Throwable th) {
                tdaVar = new tda(th);
            }
            if (uda.m19582a(tdaVar) != null) {
                tdaVar = Boolean.FALSE;
            }
            boolean booleanValue = ((Boolean) tdaVar).booleanValue();
            Context context = this.f21132u;
            if (booleanValue) {
                up2.m19906F(context);
                sx7.m18364b(sx7.f39332a, "Accessibility service monitoring scheduled after boot", "BootRecoveryWorker", 2);
            } else {
                sx7.m18364b(sx7.f39332a, "User has never enabled guards, skipping accessibility service monitoring", "BootRecoveryWorker", 2);
            }
            try {
                new cab(context).m2911e();
                sx7.m18364b(sx7Var, "Verified prayer silence notification consistency after boot", "BootRecoveryWorker", 2);
            } catch (Exception e) {
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18369g(ly6.f25312y, "BootRecoveryWorker", e, "Failed to verify notification consistency");
            }
            int i = xd9.f48201x;
            C1020xw.m22384d(context);
            jzd.m11717w(context);
            v20.m20255B(context);
            AnsarReminderWorker.f6347C.m22385e(context);
            WeeklyImpactWorker.f6364D.m22385e(context);
            boolean z = AppUsageMonitorWorker.f6352D;
            i30.m9920e0(context);
            y3a.m22546r(context);
            aj7.m765n(context);
            ou9.m15345A(context);
            return new ht6();
        } catch (Exception e2) {
            sx7 sx7Var3 = sx7.f39332a;
            sx7.m18366d(4, "BootRecoveryWorker", null, e2);
            return new gt6();
        }
    }
}
