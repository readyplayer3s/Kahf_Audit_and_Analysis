package com.kahf.dns.auto_silence.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import com.kahf.dns.features.guards.service.AccessibilityMonitorService;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0097ci;
import p000.AbstractC0492jm;
import p000.jz4;
import p000.tda;
import p000.uda;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class HeartbeatReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m3567a(Context context) {
        Object tdaVar;
        boolean z = AccessibilityMonitorService.f6276F;
        if (AbstractC0492jm.m11418y()) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AccessibilityMonitorService.class);
        try {
            context.startForegroundService(intent);
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT < 31 || !AbstractC0097ci.m3228v(e)) {
                Log.e("HeartbeatReceiver", "Failed to start monitor service", e);
                return;
            }
            Log.w("HeartbeatReceiver", "FGS denied by OEM/OS, degrading to startService()", e);
            try {
                tdaVar = context.startService(intent);
            } catch (Throwable th) {
                tdaVar = new tda(th);
            }
            if (!(tdaVar instanceof tda)) {
            }
            Throwable m19582a = uda.m19582a(tdaVar);
            if (m19582a != null) {
                Log.e("HeartbeatReceiver", "Both FGS and background start failed", m19582a);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        Object systemService = context.getSystemService("user");
        systemService.getClass();
        if (((UserManager) systemService).isUserUnlocked() && action != null) {
            switch (action.hashCode()) {
                case 502473491:
                    if (!action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                        return;
                    }
                    break;
                case 505380757:
                    if (!action.equals("android.intent.action.TIME_SET")) {
                        return;
                    }
                    break;
                case 798292259:
                    if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                        return;
                    }
                    break;
                case 1737074039:
                    if (!action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("AppPreferences", 0);
                List list = jz4.f21372a;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (sharedPreferences.getBoolean((String) it.next(), false)) {
                            m3567a(context);
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                try {
                    Log.e("HeartbeatReceiver", "Failed to start monitor service", e);
                } catch (Exception e2) {
                    Log.e("HeartbeatReceiver", "Error ensuring service is running", e2);
                }
            }
        }
    }
}
