package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.util.Log;
import com.kahf.dns.KahfGuardApp;
import com.kahf.dns.R;
import com.kahf.dns.features.notification.AppUsageMonitorWorker;
import com.kahf.dns.p019ui.MainActivity;
import com.kahf.dns.utils.PreferencesHelper;
import com.posthog.surveys.NPZg.PeBKUY;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: ml */
/* loaded from: classes.dex */
public final class C0602ml extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f26603u;

    /* renamed from: v */
    public final /* synthetic */ Object f26604v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0602ml(Object obj, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f26603u = b;
        this.f26604v = obj;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f26603u;
        Object obj2 = this.f26604v;
        switch (b) {
            case 0:
                return new C0602ml((C0639nl) obj2, xa2Var, (byte) 0);
            case 1:
                return new C0602ml((AppUsageMonitorWorker) obj2, xa2Var, (byte) 1);
            case 2:
                return new C0602ml((iv7) obj2, xa2Var, (byte) 2);
            case 3:
                return new C0602ml((y35) obj2, xa2Var, (byte) 3);
            case 4:
                return new C0602ml((rz5) obj2, xa2Var, (byte) 4);
            case 5:
                return new C0602ml((KahfGuardApp) obj2, xa2Var, (byte) 5);
            case 6:
                return new C0602ml((bt7) obj2, xa2Var, (byte) 6);
            case 7:
                return new C0602ml((m48) obj2, xa2Var, (byte) 7);
            case 8:
                return new C0602ml((caa) obj2, xa2Var, (byte) 8);
            case 9:
                return new C0602ml((ada) obj2, xa2Var, (byte) 9);
            case 10:
                return new C0602ml((g4b) obj2, xa2Var, (byte) 10);
            case 11:
                return new C0602ml((uwb) obj2, xa2Var, (byte) 11);
            default:
                return new C0602ml((Context) obj2, xa2Var, (byte) 12);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26603u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                return ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 1:
                return ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 2:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 3:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 4:
                ((C0602ml) create((w94) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 5:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 6:
                return ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 7:
                return ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 8:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 9:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 10:
                return ((C0602ml) create((g4b) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 11:
                ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            default:
                return ((C0602ml) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(15:13|14|15|16|17|18|19|20|21|22|23|(1:25)(1:51)|26|27|28)|(2:(1:49)(1:50)|41)|34|35|36|37|(1:39)(1:42)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
    
        r5 = p000.mxb.f27258v;
     */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long m3817e;
        long m3817e2;
        boolean booleanFromPreferences;
        long max;
        long max2;
        boolean m3819g;
        Boolean m13140b;
        String stringFromPreferences;
        int intValue;
        int i;
        boolean parseBoolean;
        boolean z;
        long j;
        Set m16028a1;
        os3 m20155w;
        long m22370e;
        ly6 ly6Var;
        byte b = this.f26603u;
        ly6 ly6Var2 = ly6.f25312y;
        xa2 xa2Var = null;
        boolean z2 = false;
        txc txcVar = txc.f41359a;
        Object obj2 = this.f26604v;
        switch (b) {
            case 0:
                Context context = ((C0639nl) obj2).f28441a;
                v11.m20244z(obj);
                try {
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.net.VpnService"), 0);
                    queryIntentServices.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
                        String str = serviceInfo != null ? serviceInfo.packageName : null;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str2 = (String) next;
                        if (!zy5.m23838d(str2, packageName) && !C0639nl.f28439d.contains(str2)) {
                            hashSet.add(next);
                        }
                    }
                    return hashSet;
                } catch (Exception unused) {
                    return ep3.f10423u;
                }
            case 1:
                AppUsageMonitorWorker appUsageMonitorWorker = (AppUsageMonitorWorker) obj2;
                v11.m20244z(obj);
                try {
                    currentTimeMillis = System.currentTimeMillis();
                    boolean z3 = AppUsageMonitorWorker.f6352D;
                    m3817e = appUsageMonitorWorker.m3817e(currentTimeMillis, "last_app_open_time");
                    m3817e2 = appUsageMonitorWorker.m3817e(0L, "last_usage_notification_time");
                    booleanFromPreferences = ((PreferencesHelper) appUsageMonitorWorker.f6354B.getValue()).getBooleanFromPreferences("first_notification_shown", false);
                    max = Math.max(0L, (currentTimeMillis - m3817e) / 60000);
                    max2 = Math.max(0L, (currentTimeMillis - m3817e2) / 60000);
                    m3819g = appUsageMonitorWorker.m3819g(max, max2, booleanFromPreferences);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    appUsageMonitorWorker.m3818f(currentTimeMillis, m3817e, m3817e2, max, max2, booleanFromPreferences, m3819g);
                    appUsageMonitorWorker = appUsageMonitorWorker;
                    if (m3819g) {
                        appUsageMonitorWorker.m3820h(booleanFromPreferences, currentTimeMillis);
                    }
                    return new ht6();
                } catch (Exception e2) {
                    e = e2;
                    appUsageMonitorWorker = appUsageMonitorWorker;
                    sx7 sx7Var = sx7.f39332a;
                    sx7.m18369g(ly6Var2, appUsageMonitorWorker.f6353A, e, "Error in app usage monitoring");
                    return new gt6();
                }
            case 2:
                v11.m20244z(obj);
                ((iv7) obj2).setValue(Boolean.TRUE);
                return txcVar;
            case 3:
                v11.m20244z(obj);
                ((y35) obj2).m22544n();
                return txcVar;
            case 4:
                v11.m20244z(obj);
                ((rz5) obj2).f37559e.incrementAndGet();
                return txcVar;
            case 5:
                KahfGuardApp kahfGuardApp = (KahfGuardApp) obj2;
                v11.m20244z(obj);
                try {
                    ShortcutManager shortcutManager = (ShortcutManager) kahfGuardApp.getSystemService(ShortcutManager.class);
                    if (shortcutManager.getDynamicShortcuts().isEmpty()) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.setClass(kahfGuardApp, MainActivity.class);
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.putExtra("shortcut_id", "kg_guardz_dynamic");
                        intent.setFlags(335544320);
                        ShortcutInfo build = new ShortcutInfo.Builder(kahfGuardApp, "kg_guardz_dynamic").setShortLabel(kahfGuardApp.getString(R.string.shortcut_guardz_short_label)).setLongLabel(kahfGuardApp.getString(R.string.shortcut_guardz_long_label)).setIcon(Icon.createWithResource(kahfGuardApp, R.drawable.ic_shortcut_guardz)).setIntent(intent).build();
                        build.getClass();
                        shortcutManager.setDynamicShortcuts(mv1.m13793E(build));
                        Log.i("AutoSilencePro", "Dynamic app shortcut initialised");
                    } else {
                        Log.i("AutoSilencePro", "Shortcut already exists – skipping");
                    }
                } catch (Throwable th) {
                    Log.e("AutoSilencePro", "Failed to initialise app shortcuts", th);
                    KahfGuardApp kahfGuardApp2 = KahfGuardApp.f6225y;
                    v20.m20254A("AppShortcuts", th);
                }
                return txcVar;
            case 6:
                v11.m20244z(obj);
                d8b d8bVar = (d8b) ((e8b) ((bt7) obj2).f3951i.getValue());
                return new Integer(d8bVar.f7561b.nativeGetCounterValue(d8bVar.f7562c));
            case 7:
                m48 m48Var = (m48) obj2;
                v11.m20244z(obj);
                try {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    vq8 vq8Var = m48Var.f25600b;
                    if (vq8Var != null) {
                        m13140b = (Boolean) vq8Var.f44884u;
                        if (currentTimeMillis2 - ((Number) vq8Var.f44885v).longValue() < 300000 && m13140b != null) {
                            sx7.m18364b(sx7.f39332a, "Returning cached Bangladesh result: " + m13140b, null, 6);
                            return m13140b;
                        }
                    }
                    m13140b = m48Var.m13140b();
                    if (m13140b != null) {
                        sx7.m18364b(sx7.f39332a, "Bangladesh check via telephony: " + m13140b, null, 6);
                        z2 = m13140b.booleanValue();
                        if (z2) {
                            m48Var.f25600b = new vq8(m13140b, new Long(currentTimeMillis2));
                            return m13140b;
                        }
                    }
                    m13140b = m48Var.m13139a();
                    if (m13140b != null) {
                        sx7.m18364b(sx7.f39332a, "Bangladesh check via SIM: " + m13140b, null, 6);
                        z2 = m13140b.booleanValue();
                        if (z2) {
                            m48Var.f25600b = new vq8(m13140b, new Long(currentTimeMillis2));
                            return m13140b;
                        }
                    }
                    String stringFromPreferences2 = m48Var.f25607i.getStringFromPreferences("pref_ip_country_name", "");
                    if (!stb.m18260Z0(stringFromPreferences2) && !stringFromPreferences2.equalsIgnoreCase("null")) {
                        boolean equalsIgnoreCase = stringFromPreferences2.equalsIgnoreCase("Bangladesh");
                        sx7.m18364b(sx7.f39332a, "Bangladesh check via stored IP country: " + equalsIgnoreCase, null, 6);
                        if (equalsIgnoreCase) {
                            m13140b = Boolean.TRUE;
                            m48Var.f25600b = new vq8(m13140b, new Long(currentTimeMillis2));
                            return m13140b;
                        }
                    }
                    boolean m13135c = m48.m13135c();
                    if (m13135c) {
                        sx7.m18364b(sx7.f39332a, "Bangladesh check via timezone: " + m13135c, null, 6);
                        m13140b = Boolean.TRUE;
                        m48Var.f25600b = new vq8(m13140b, new Long(currentTimeMillis2));
                    } else {
                        m48Var.f25600b = new vq8(Boolean.valueOf(z2), new Long(currentTimeMillis2));
                        m13140b = Boolean.valueOf(z2);
                    }
                    return m13140b;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    sx7 sx7Var2 = sx7.f39332a;
                    pr1.m15991y("Error checking Bangladesh location: ", e4.getMessage(), null, null, 6);
                    return Boolean.FALSE;
                }
            case 8:
                caa caaVar = (caa) obj2;
                v11.m20244z(obj);
                try {
                    caaVar.f4726f.m22921k(null, Boolean.FALSE);
                    caaVar.f4727g.m22921k(null, new Integer(0));
                    sx7.m18367e(sx7.f39332a, "[ENFORCE] ⏹️ Restriction enforcement stopped", "KG_SYNC", 2);
                } catch (Exception e5) {
                    sx7 sx7Var3 = sx7.f39332a;
                    sx7.m18369g(ly6Var2, "KG_SYNC", e5, "[ENFORCE] ❌ Error stopping enforcement");
                }
                return txcVar;
            case 9:
                v11.m20244z(obj);
                ada adaVar = (ada) obj2;
                long longFromPreferences = adaVar.f742i.f5552a.getLongFromPreferences(PeBKUY.lCdIwTDmNm, 0L);
                if (longFromPreferences > 0) {
                    if (zv5.f53149a.mo2814g().m22370e() >= longFromPreferences) {
                        sx7 sx7Var4 = sx7.f39332a;
                        sx7.m18369g(ly6.f25310w, "KG_SYNC", null, "⏰ Grace period expired while app was dead, forcing re-sync");
                        jzd.m11709o(adaVar.f745l, null, null, new rr7(adaVar, xa2Var, (byte) 7), 3);
                    } else {
                        adaVar.m450L(longFromPreferences);
                    }
                }
                return txcVar;
            case 10:
                v11.m20244z(obj);
                return (g4b) obj2;
            case 11:
                ly6 ly6Var3 = ly6.f25311x;
                v11.m20244z(obj);
                uwb uwbVar = (uwb) obj2;
                Map map = uwb.f43340C;
                PreferencesHelper preferencesHelper = uwbVar.f43348d;
                try {
                    stringFromPreferences = preferencesHelper.getStringFromPreferences("user_subscription_tier", "FREE");
                    try {
                        intValue = preferencesHelper.getIntFromPreferences("user_tier_level", 0);
                    } catch (ClassCastException unused2) {
                        Integer m23783H0 = ztb.m23783H0(preferencesHelper.getStringFromPreferences("user_tier_level", "0"));
                        intValue = m23783H0 != null ? m23783H0.intValue() : 0;
                        preferencesHelper.saveToPreferences("user_tier_level", intValue);
                        sx7 sx7Var5 = sx7.f39332a;
                        sx7.m18369g(ly6Var3, "SubscriptionManager", null, "Migrated PREF_TIER_LEVEL from String to Int: " + intValue);
                    }
                    i = intValue;
                    try {
                        parseBoolean = preferencesHelper.getBooleanFromPreferences("tier_is_active", false);
                    } catch (ClassCastException unused3) {
                        parseBoolean = Boolean.parseBoolean(preferencesHelper.getStringFromPreferences("tier_is_active", "false"));
                        preferencesHelper.saveToPreferences("tier_is_active", parseBoolean);
                        sx7 sx7Var6 = sx7.f39332a;
                        sx7.m18369g(ly6Var3, "SubscriptionManager", null, "Migrated PREF_TIER_IS_ACTIVE from String to Boolean: " + parseBoolean);
                    }
                    z = parseBoolean;
                    try {
                        j = preferencesHelper.getLongFromPreferences("tier_expires_at", 0L);
                    } catch (ClassCastException unused4) {
                        Long m23785J0 = ztb.m23785J0(preferencesHelper.getStringFromPreferences("tier_expires_at", "0"));
                        long longValue = m23785J0 != null ? m23785J0.longValue() : 0L;
                        preferencesHelper.saveToPreferences("tier_expires_at", longValue);
                        sx7 sx7Var7 = sx7.f39332a;
                        sx7.m18369g(ly6Var3, "SubscriptionManager", null, "Migrated PREF_TIER_EXPIRES from String to Long: " + longValue);
                        j = longValue;
                    }
                    String stringFromPreferences3 = preferencesHelper.getStringFromPreferences("tier_enabled_features", "");
                    m16028a1 = stringFromPreferences3.length() > 0 ? ps1.m16028a1(stb.m18274n1(stringFromPreferences3, new String[]{","}, 0, 6)) : v90.m20558j0(new String[]{"dns_change_prevention", "uninstall_prevention"});
                    m20155w = uwbVar.m20155w(j);
                    m22370e = uwbVar.f43351g.m21077a().m22370e();
                    ly6Var = ly6.f25309v;
                } catch (Exception e6) {
                    sx7 sx7Var8 = sx7.f39332a;
                    sx7.m18369g(ly6Var2, "SubscriptionManager", e6, "Failed to load tier data from preferences");
                    uwbVar.m20157y();
                }
                if ((j != 0 || m20155w == null || !m20155w.f31118a) && (j <= 0 || j <= m22370e)) {
                    if (j > 0) {
                        sx7 sx7Var9 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "SubscriptionManager", null, "Tier data expired, resetting to FREE");
                        uwbVar.m20136c();
                        uwbVar.m20157y();
                    } else {
                        sx7 sx7Var10 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "SubscriptionManager", null, "No valid tier data in preferences, using FREE tier");
                        uwbVar.m20157y();
                    }
                    return txcVar;
                }
                ynb ynbVar = uwbVar.f43363s;
                mxb mxbVar = mxb.valueOf(stringFromPreferences);
                ynbVar.m22920j(mxbVar);
                ynb ynbVar2 = uwbVar.f43364t;
                iwb iwbVar = new iwb(stringFromPreferences, i, m16028a1, j > 0 ? Long.valueOf(j) : null, z);
                ynbVar2.getClass();
                ynbVar2.m22921k(null, iwbVar);
                sx7 sx7Var11 = sx7.f39332a;
                sx7.m18369g(ly6Var, "SubscriptionManager", null, "Loaded tier data from preferences: Tier=" + stringFromPreferences + ", Features=" + m16028a1.size());
                return txcVar;
            default:
                v11.m20244z(obj);
                try {
                    sxc sxcVar = sxc.f39342a;
                    return sxc.m18373c((Context) obj2);
                } catch (Exception e7) {
                    sx7 sx7Var12 = sx7.f39332a;
                    sx7.m18369g(ly6Var2, "KG_SYNC", e7, "[DEVICE_ID] Error generating unique device ID");
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    sx7.m18370h(2, "[DEVICE_ID] Using fallback UUID: ".concat(uuid), "KG_SYNC");
                    return uuid;
                }
        }
    }
}
