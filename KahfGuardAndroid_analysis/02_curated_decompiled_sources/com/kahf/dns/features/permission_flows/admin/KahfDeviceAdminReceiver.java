package com.kahf.dns.features.permission_flows.admin;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import com.kahf.dns.R;
import com.kahf.dns.utils.PreferencesHelper;
import p000.ce7;
import p000.cm0;
import p000.d4b;
import p000.iq5;
import p000.jh6;
import p000.kl6;
import p000.ly6;
import p000.so6;
import p000.sx7;
import p000.tda;
import p000.txc;
import p000.uda;
import p000.ynb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class KahfDeviceAdminReceiver extends DeviceAdminReceiver implements jh6 {

    /* renamed from: u */
    public final kl6 f6370u = iq5.m10513r(so6.f38881u, new cm0(this, (byte) 29));

    @Override // android.app.admin.DeviceAdminReceiver
    public final CharSequence onDisableRequested(Context context, Intent intent) {
        Object tdaVar;
        Object tdaVar2;
        context.getClass();
        intent.getClass();
        try {
            d4b.f7318A.m22547b(context).m5909w();
            tdaVar = txc.f41359a;
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        Throwable m19582a = uda.m19582a(tdaVar);
        if (m19582a != null) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KahfDeviceAdminReceiver", m19582a, "lockScreen failed in onDisableRequested");
        }
        try {
            tdaVar2 = context.getString(R.string.super_uninstall_admin_disable_warning);
        } catch (Throwable th2) {
            tdaVar2 = new tda(th2);
        }
        if (uda.m19582a(tdaVar2) != null) {
            tdaVar2 = "Deactivating will remove Kahf Guard's uninstall protection.";
        }
        tdaVar2.getClass();
        return (CharSequence) tdaVar2;
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onDisabled(Context context, Intent intent) {
        Object tdaVar;
        context.getClass();
        intent.getClass();
        super.onDisabled(context, intent);
        try {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25311x, "KahfDeviceAdminReceiver", null, "Device admin disabled by user — Super Uninstall Protection downgraded");
            ynb ynbVar = (ynb) d4b.f7318A.m22547b(context).f7326y;
            Boolean bool = Boolean.FALSE;
            ynbVar.getClass();
            ynbVar.m22921k(null, bool);
            ((PreferencesHelper) this.f6370u.getValue()).saveToPreferences("pref_super_uninstall_protection_enabled", false);
            ce7.m3084r();
            tdaVar = txc.f41359a;
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        Throwable m19582a = uda.m19582a(tdaVar);
        if (m19582a != null) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KahfDeviceAdminReceiver", m19582a, "onDisabled threw — pref may not be synced");
        }
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onEnabled(Context context, Intent intent) {
        Object tdaVar;
        context.getClass();
        intent.getClass();
        super.onEnabled(context, intent);
        try {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25310w, "KahfDeviceAdminReceiver", null, "Device admin enabled");
            ((PreferencesHelper) this.f6370u.getValue()).saveToPreferences("pref_super_uninstall_protection_enabled", true);
            d4b m22547b = d4b.f7318A.m22547b(context);
            ynb ynbVar = (ynb) m22547b.f7326y;
            Boolean bool = Boolean.TRUE;
            ynbVar.getClass();
            ynbVar.m22921k(null, bool);
            m22547b.m5894b();
            ce7.m3084r();
            tdaVar = txc.f41359a;
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        Throwable m19582a = uda.m19582a(tdaVar);
        if (m19582a != null) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KahfDeviceAdminReceiver", m19582a, "onEnabled threw — admin state may be inconsistent");
        }
    }
}
