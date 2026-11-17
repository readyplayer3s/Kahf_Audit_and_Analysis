package com.kahf.dns.auto_silence.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import java.util.Set;
import p000.lld;
import p000.ps1;
import p000.qv3;
import p000.up2;
import p000.v90;
import p000.ve8;
import p000.we8;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Set f6230a = v90.m20558j0(new String[]{"android.intent.action.BOOT_COMPLETED", "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.QUICKBOOT_POWERON"});

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (ps1.m16031i0(f6230a, intent.getAction())) {
            Object systemService = context.getSystemService("user");
            systemService.getClass();
            if (((UserManager) systemService).isUserUnlocked()) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                we8 we8Var = (we8) ((ve8) up2.m19907G(new ve8(BootRecoveryWorker.class))).m19711a();
                lld m12801f = lld.m12801f(context);
                m12801f.getClass();
                m12801f.m12807e("boot_recovery", qv3.f35504v, we8Var);
                goAsync.finish();
            }
        }
    }
}
