package com.kahf.dns.features.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import coil3.gif.internal.oym.rEiUCjSwq;
import p000.C0898ul;
import p000.ly6;
import p000.sx7;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class ReminderActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            ly6 ly6Var = ly6.f25312y;
            if (hashCode != -1358251397) {
                if (hashCode != 670053936) {
                    if (hashCode == 942786074 && action.equals("com.kahf.dns.TURN_OFF_ANSAR_REMINDER")) {
                        try {
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18364b(sx7Var, "User clicked 'Turn off reminder' for ansar", "ReminderActionReceiver", 2);
                            new C0898ul().m19697e(false);
                            sx7.m18364b(sx7Var, "Ansar reminders disabled successfully", "ReminderActionReceiver", 2);
                            return;
                        } catch (Exception e) {
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18369g(ly6Var, "ReminderActionReceiver", e, "Error handling turn off ansar reminder action");
                            return;
                        }
                    }
                } else if (action.equals("com.kahf.dns.TURN_OFF_SADAKA_REMINDER")) {
                    try {
                        sx7 sx7Var3 = sx7.f39332a;
                        sx7.m18364b(sx7Var3, "User clicked 'Turn off reminder' for sadaka", "ReminderActionReceiver", 2);
                        C0898ul c0898ul = new C0898ul();
                        SharedPreferences.Editor edit = c0898ul.f42622v.edit();
                        edit.getClass();
                        edit.putBoolean("disable_sadaka_reminders", true);
                        edit.apply();
                        sx7.m18364b(sx7Var3, "Sadaka reminders disabled", "LocalNotificationManager", 2);
                        c0898ul.f42623w.cancel(6002);
                        sx7.m18364b(sx7Var3, "Sadaka reminders disabled successfully", "ReminderActionReceiver", 2);
                        return;
                    } catch (Exception e2) {
                        sx7 sx7Var4 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "ReminderActionReceiver", e2, "Error handling turn off sadaka reminder action");
                        return;
                    }
                }
            } else if (action.equals("com.kahf.dns.TURN_OFF_TRIAL_REMINDER")) {
                try {
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18364b(sx7Var5, "User clicked 'Turn off reminder' for trial expired", "ReminderActionReceiver", 2);
                    C0898ul c0898ul2 = new C0898ul();
                    SharedPreferences.Editor edit2 = c0898ul2.f42622v.edit();
                    edit2.getClass();
                    edit2.putBoolean("disable_trial_reminders", true);
                    edit2.apply();
                    sx7.m18364b(sx7Var5, "Trial reminders disabled", "LocalNotificationManager", 2);
                    c0898ul2.f42623w.cancel(6001);
                    sx7.m18364b(sx7Var5, "Trial reminders disabled successfully", "ReminderActionReceiver", 2);
                    return;
                } catch (Exception e3) {
                    sx7 sx7Var6 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "ReminderActionReceiver", e3, rEiUCjSwq.GsGKRmmNrW);
                    return;
                }
            }
        }
        sx7 sx7Var7 = sx7.f39332a;
        sx7.m18370h(2, "Unknown action received: " + intent.getAction(), "ReminderActionReceiver");
    }
}
