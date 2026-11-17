package com.kahf.dns.features.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kahf.dns.features.restrictions.sync.p018gc.jTCFTGKxOS;
import p000.C0898ul;
import p000.ly6;
import p000.sx7;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class AccessibilityReminderActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1078388925 && action.equals(jTCFTGKxOS.lNv)) {
            try {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18364b(sx7Var, "User clicked 'Turn off reminder' button", "AccessibilityReminderReceiver", 2);
                new C0898ul().m19696c();
                sx7.m18364b(sx7Var, "Accessibility reminders disabled successfully", "AccessibilityReminderReceiver", 2);
                return;
            } catch (Exception e) {
                sx7 sx7Var2 = sx7.f39332a;
                sx7.m18369g(ly6.f25312y, "AccessibilityReminderReceiver", e, "Error handling turn off reminder action");
                return;
            }
        }
        sx7 sx7Var3 = sx7.f39332a;
        sx7.m18370h(2, "Unknown action received: " + intent.getAction(), "AccessibilityReminderReceiver");
    }
}
