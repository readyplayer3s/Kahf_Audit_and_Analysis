package com.kahf.dns.auto_silence.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kahf.dns.auto_silence.scheduler.SilenceModeWorker;
import com.kahf.dns.features.notification.AnsarReminderWorker;
import com.kahf.dns.features.notification.AppUsageMonitorWorker;
import com.kahf.dns.features.notification.WeeklyImpactWorker;
import com.pairip.VMRunner;
import java.util.Set;
import p000.i30;
import p000.jzd;
import p000.lld;
import p000.ou9;
import p000.qv3;
import p000.up2;
import p000.v20;
import p000.v90;
import p000.ve8;
import p000.we8;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class SystemEventReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Set f6233a = v90.m20558j0(new String[]{"android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.MY_PACKAGE_REPLACED"});

    /* renamed from: a */
    public static void m3571a(Context context) {
        we8 we8Var = (we8) ((ve8) up2.m19907G(new ve8(SilenceModeWorker.class))).m19711a();
        lld m12801f = lld.m12801f(context);
        m12801f.getClass();
        m12801f.m12807e("prayer_verification", qv3.f35503u, we8Var);
        up2.m19906F(context);
        boolean z = AppUsageMonitorWorker.f6352D;
        i30.m9920e0(context);
        jzd.m11717w(context);
        v20.m20255B(context);
        AnsarReminderWorker.f6347C.m22385e(context);
        WeeklyImpactWorker.f6364D.m22385e(context);
        ou9.m15345A(context);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("mEBpNyK72e1ebo2K", new Object[]{this, context, intent});
    }
}
