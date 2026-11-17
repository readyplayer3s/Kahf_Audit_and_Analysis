package com.kahf.dns.features.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kahf.dns.utils.PreferencesHelper;
import p000.AbstractC0492jm;
import p000.AbstractC0593mc;
import p000.cm0;
import p000.iq5;
import p000.jh6;
import p000.kl6;
import p000.ly6;
import p000.so6;
import p000.sx7;
import p000.tda;
import p000.txc;
import p000.uda;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class DeviceKeyReceiver extends BroadcastReceiver implements jh6 {

    /* renamed from: u */
    public final kl6 f6382u = iq5.m10513r(so6.f38881u, new cm0(this, (byte) 15));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String m11405l;
        Object tdaVar;
        context.getClass();
        intent.getClass();
        if (zy5.m23838d(intent.getAction(), "co.kahf.provision.action.DEVICE_KEY") && (m11405l = AbstractC0492jm.m11405l(intent.getStringExtra("device_key"))) != null) {
            AbstractC0593mc.f26075e0 = m11405l;
            try {
                ((PreferencesHelper) this.f6382u.getValue()).saveToPreferences("kahf_device_hardware_key", m11405l);
                tdaVar = txc.f41359a;
            } catch (Throwable th) {
                tdaVar = new tda(th);
            }
            Throwable m19582a = uda.m19582a(tdaVar);
            if (m19582a != null) {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18369g(ly6.f25311x, "KG_SYNC", m19582a, "[DEVICE_KEY] persist deferred (storage/DI not ready)");
            }
            sx7.m18364b(sx7.f39332a, "[DEVICE_KEY] cached + persisted hardware key from Core", "KG_SYNC", 2);
        }
    }
}
