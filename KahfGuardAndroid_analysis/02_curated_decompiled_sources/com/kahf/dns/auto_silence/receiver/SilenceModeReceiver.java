package com.kahf.dns.auto_silence.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import com.kahf.dns.auto_silence.scheduler.SilenceModeWorker;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import p000.C0381gl;
import p000.cab;
import p000.cz8;
import p000.iq5;
import p000.jh6;
import p000.kl6;
import p000.lld;
import p000.m72;
import p000.m8b;
import p000.o68;
import p000.ps1;
import p000.qv3;
import p000.so6;
import p000.t38;
import p000.v20;
import p000.ve8;
import p000.we8;
import p000.z38;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class SilenceModeReceiver extends BroadcastReceiver implements jh6 {

    /* renamed from: u */
    public final kl6 f6231u;

    /* renamed from: v */
    public final kl6 f6232v;

    public SilenceModeReceiver() {
        cz8 cz8Var = new cz8(this, (byte) 14);
        so6 so6Var = so6.f38881u;
        this.f6231u = iq5.m10513r(so6Var, cz8Var);
        this.f6232v = iq5.m10513r(so6Var, new cz8(this, (byte) 15));
    }

    /* renamed from: b */
    public static void m3568b(Context context) {
        ve8 ve8Var = new ve8(SilenceModeWorker.class);
        ve8Var.f42653c.f50752j = new m72(new t38(null), z38.f51708u, false, false, false, false, -1L, -1L, ps1.m16028a1(new LinkedHashSet()));
        ve8Var.f42654d.add("immediate_silence_check");
        we8 we8Var = (we8) ve8Var.m19711a();
        lld m12801f = lld.m12801f(context);
        m12801f.getClass();
        m12801f.m12807e("immediate_silence_check", qv3.f35503u, we8Var);
        Log.i("AutoSilencePro", "Scheduled immediate silence mode verification");
    }

    /* renamed from: c */
    public static void m3569c(Context context, String str) {
        ve8 ve8Var = (ve8) new ve8(SilenceModeWorker.class).m19713e(23L, TimeUnit.HOURS);
        ve8Var.f42653c.f50752j = new m72(new t38(null), z38.f51708u, false, false, false, false, -1L, -1L, ps1.m16028a1(new LinkedHashSet()));
        ve8Var.f42654d.add("next_day_".concat(str));
        we8 we8Var = (we8) ve8Var.m19711a();
        lld m12801f = lld.m12801f(context);
        m12801f.getClass();
        m12801f.m12807e("next_day_".concat(str), qv3.f35503u, we8Var);
    }

    /* renamed from: d */
    public static void m3570d(Context context) {
        ve8 ve8Var = (ve8) new ve8(SilenceModeWorker.class).m19713e(5L, TimeUnit.MINUTES);
        ve8Var.f42653c.f50752j = new m72(new t38(null), z38.f51708u, false, false, false, false, -1L, -1L, ps1.m16028a1(new LinkedHashSet()));
        ve8Var.f42654d.add("verification_check");
        we8 we8Var = (we8) ve8Var.m19711a();
        lld m12801f = lld.m12801f(context);
        m12801f.getClass();
        m12801f.m12807e("verification_check", qv3.f35503u, we8Var);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        C0381gl c0381gl = v20.f43603j;
        if (c0381gl != null) {
            c0381gl.invoke();
        }
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "AutoSilence:SilenceModeWakeLock");
        newWakeLock.acquire(30000L);
        try {
            try {
                cab cabVar = new cab(context);
                m8b m8bVar = new m8b(context, (byte) 1);
                String stringExtra = intent.getStringExtra("prayer_name");
                if (stringExtra == null) {
                    stringExtra = "unknown";
                }
                boolean z = Calendar.getInstance().get(7) == 6;
                if (stringExtra.equals("Jum'a")) {
                    if (!z) {
                        Log.i("AutoSilencePro", "Not activating Juma alarm - not Friday");
                        newWakeLock.release();
                        return;
                    }
                } else if (stringExtra.equals("Duhr") && z) {
                    Log.i("AutoSilencePro", "Not activating Dhuhr alarm - it's Friday");
                    newWakeLock.release();
                    return;
                }
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != 1628962583) {
                        if (hashCode == 1965606648 && action.equals("com.kahf.dns.DISABLE_SILENCE")) {
                            Log.i("AutoSilencePro", "Alarm: Disabling silent mode for ".concat(stringExtra));
                            cabVar.m2909c();
                            m8bVar.m13241a("alarm", false);
                            try {
                                ((o68) this.f6231u.getValue()).m14837a();
                            } catch (Exception e) {
                                Log.e("AutoSilencePro", "Failed to clear prayer silence notification", e);
                            }
                            m3569c(context, stringExtra);
                        }
                    } else if (action.equals("com.kahf.dns.ENABLE_SILENCE")) {
                        Log.i("AutoSilencePro", "Alarm: Enabling silent mode for ".concat(stringExtra));
                        cabVar.m2910d();
                        m8bVar.m13241a("alarm", true);
                        try {
                            ((PreferencesHelper) this.f6232v.getValue()).saveToPreferences("pref_prayers_silenced_count", ((PreferencesHelper) this.f6232v.getValue()).getIntFromPreferences("pref_prayers_silenced_count", 0) + 1);
                        } catch (Exception e2) {
                            Log.e("AutoSilencePro", "Failed to increment prayers-silenced count", e2);
                        }
                        m3570d(context);
                    }
                }
            } finally {
                newWakeLock.release();
            }
        } catch (Exception e3) {
            Log.e("AutoSilencePro", "Failed to handle alarm", e3);
            m3568b(context);
        }
    }
}
