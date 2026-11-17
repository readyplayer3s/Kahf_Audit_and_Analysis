package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import android.widget.Toast;
import coil3.transform.p010aL.bbNCAFLw;
import com.github.mikephil.charting.charts.Chart;
import com.kahf.dns.auto_silence.scheduler.SilenceModeWorker;
import com.kahf.dns.features.guards.service.AccessibilityMonitorService;
import com.kahf.dns.features.notification.AnsarReminderWorker;
import com.kahf.dns.features.notification.HabitReminderWorker;
import com.kahf.dns.features.notification.ReminderNotificationWorker;
import com.kahf.dns.p019ui.MainActivity;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: w6 */
/* loaded from: classes2.dex */
public final class C0957w6 extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f45811u;

    /* renamed from: v */
    public final /* synthetic */ Object f45812v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0957w6(Object obj, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f45811u = b;
        this.f45812v = obj;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f45811u;
        Object obj2 = this.f45812v;
        switch (b) {
            case 0:
                return new C0957w6((AccessibilityMonitorService) obj2, xa2Var, (byte) 0);
            case 1:
                return new C0957w6((String) obj2, xa2Var, (byte) 1);
            case 2:
                return new C0957w6((AnsarReminderWorker) obj2, xa2Var, (byte) 2);
            case 3:
                return new C0957w6((yf0) obj2, xa2Var, (byte) 3);
            case 4:
                return new C0957w6((hlc) obj2, xa2Var, (byte) 4);
            case 5:
                return new C0957w6((nxb) obj2, xa2Var, (byte) 5);
            case 6:
                return new C0957w6((PreferencesHelper) obj2, xa2Var, (byte) 6);
            case 7:
                return new C0957w6((t73) obj2, xa2Var, (byte) 7);
            case 8:
                return new C0957w6((y35) obj2, xa2Var, (byte) 8);
            case 9:
                return new C0957w6((HabitReminderWorker) obj2, xa2Var, (byte) 9);
            case 10:
                return new C0957w6((e75) obj2, xa2Var, (byte) 10);
            case 11:
                return new C0957w6((tb5) obj2, xa2Var, (byte) 11);
            case 12:
                return new C0957w6((xcc) obj2, xa2Var, (byte) 12);
            case 13:
                return new C0957w6((MainActivity) obj2, xa2Var, (byte) 13);
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                return new C0957w6((rk7) obj2, xa2Var, (byte) 14);
            case ba7.f2964h /* 15 */:
                return new C0957w6((yq7) obj2, xa2Var, (byte) 15);
            case 16:
                return new C0957w6((bt7) obj2, xa2Var, (byte) 16);
            case 17:
                return new C0957w6((m48) obj2, xa2Var, (byte) 17);
            case Chart.PAINT_LEGEND_LABEL /* 18 */:
                return new C0957w6((nm8) obj2, xa2Var, (byte) 18);
            case 19:
                return new C0957w6((u39) obj2, xa2Var, (byte) 19);
            case 20:
                return new C0957w6((ReminderNotificationWorker) obj2, xa2Var, (byte) 20);
            case 21:
                return new C0957w6((caa) obj2, xa2Var, (byte) 21);
            case 22:
                return new C0957w6((zca) obj2, xa2Var, (byte) 22);
            case 23:
                return new C0957w6((wo9) obj2, xa2Var, (byte) 23);
            case 24:
                return new C0957w6((SilenceModeWorker) obj2, xa2Var, (byte) 24);
            case 25:
                return new C0957w6((nzb) obj2, xa2Var, (byte) 25);
            case 26:
                return new C0957w6((C0092cd) obj2, xa2Var, (byte) 26);
            case 27:
                return new C0957w6((bsc) obj2, xa2Var, (byte) 27);
            case 28:
                return new C0957w6((Context) obj2, xa2Var, (byte) 28);
            default:
                return new C0957w6((f4d) obj2, xa2Var, (byte) 29);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45811u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 1:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 2:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 3:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 4:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 5:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 6:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 7:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 8:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 9:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 10:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 11:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 12:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 13:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case ba7.f2964h /* 15 */:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 16:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 17:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case Chart.PAINT_LEGEND_LABEL /* 18 */:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 19:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 20:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 21:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 22:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 23:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 24:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 25:
                ((C0957w6) create((txc) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 26:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 27:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 28:
                return ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            default:
                ((C0957w6) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        C1020xw c1020xw;
        int i = 6;
        xa2 xa2Var = null;
        switch (this.f45811u) {
            case 0:
                v11.m20244z(obj);
                AccessibilityMonitorService accessibilityMonitorService = (AccessibilityMonitorService) this.f45812v;
                boolean z = AccessibilityMonitorService.f6276F;
                accessibilityMonitorService.m3771b("INITIAL_CHECK");
                return txc.f41359a;
            case 1:
                v11.m20244z(obj);
                try {
                    Object systemService = sa2.f38142u.m17960c().getSystemService("clipboard");
                    systemService.getClass();
                    try {
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Copied Text", (String) this.f45812v));
                    } catch (SecurityException e) {
                        ut4.m20082t(e, "Failed to copy to clipboard", "clipboard_security_exception");
                        Toast.makeText(sa2.f38142u.m17960c(), "Unable to copy text. Please type manually.", 0).show();
                    }
                } catch (Exception e2) {
                    ut4.m20082t(e2, "Failed to initialize clipboard", "clipboard_setup");
                }
                return txc.f41359a;
            case 2:
                ly6 ly6Var = ly6.f25312y;
                AnsarReminderWorker ansarReminderWorker = (AnsarReminderWorker) this.f45812v;
                Context context = ansarReminderWorker.f21132u;
                v11.m20244z(obj);
                try {
                    try {
                        try {
                            C1020xw c1020xw2 = AnsarReminderWorker.f6347C;
                            ansarReminderWorker.m3816e();
                            c1020xw = AnsarReminderWorker.f6347C;
                        } finally {
                        }
                    } catch (Exception e3) {
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6Var, "AnsarReminderWorker", e3, "AnsarReminderWorker show failed: " + e3.getMessage());
                        c1020xw = AnsarReminderWorker.f6347C;
                    }
                    c1020xw.m22385e(context);
                } catch (Exception e4) {
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "AnsarReminderWorker", e4, "Reschedule from doWork failed");
                }
                return new ht6();
            case 3:
                v11.m20244z(obj);
                ynb ynbVar = ((yf0) this.f45812v).f50372v.f4988P;
                u33 u33Var = u33.f41647a;
                ynbVar.getClass();
                ynbVar.m22921k(null, u33Var);
                return txc.f41359a;
            case 4:
                v11.m20244z(obj);
                ((hlc) this.f45812v).m9551a();
                return txc.f41359a;
            case 5:
                v11.m20244z(obj);
                sx7 sx7Var3 = sx7.f39332a;
                sx7.m18369g(ly6.f25310w, "KG_CHILD_SYNC", null, "🚀 ChildDeviceControlScreen one-time initialization");
                ((nxb) this.f45812v).m14591f();
                return txc.f41359a;
            case 6:
                v11.m20244z(obj);
                ((PreferencesHelper) this.f45812v).saveToPreferences(PrefKeys.CHILD_ONBOARDING_COMPLETED, true);
                sx7 sx7Var4 = sx7.f39332a;
                sx7.m18369g(ly6.f25309v, "ChildOnboarding", null, "Saved CHILD_ONBOARDING_COMPLETED = true");
                return txc.f41359a;
            case 7:
                v11.m20244z(obj);
                t73 t73Var = (t73) this.f45812v;
                synchronized (t73Var.f39862A) {
                    if (t73Var.f39867F || t73Var.f39868G) {
                        return txc.f41359a;
                    }
                    try {
                        t73Var.m18662z();
                    } catch (IOException unused) {
                        t73Var.f39869H = true;
                    }
                    try {
                        if (t73Var.f39864C >= 2000) {
                            t73Var.m18653F();
                        }
                    } catch (IOException unused2) {
                        t73Var.f39870I = true;
                        t73Var.f39865D = new zu9(new uu0());
                    }
                    return txc.f41359a;
                }
            case 8:
                v11.m20244z(obj);
                y35 y35Var = (y35) this.f45812v;
                return new vq8(Boolean.valueOf(((C0522kf) y35Var.f49584C.f49313v).m12040c()), Boolean.valueOf(((fe6) y35Var.f49603w).m7935a()));
            case 9:
                v11.m20244z(obj);
                try {
                    ((HabitReminderWorker) this.f45812v).m3829e();
                    return new ht6();
                } catch (Exception e5) {
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "HabitReminderWorker", null, "HabitReminderWorker failed: " + e5.getMessage());
                    return new gt6();
                }
            case 10:
                v11.m20244z(obj);
                ((e75) this.f45812v).f9483z.m22920j(null);
                return txc.f41359a;
            case 11:
                v11.m20244z(obj);
                ((tb5) this.f45812v).m18718d();
                return txc.f41359a;
            case 12:
                v11.m20244z(obj);
                xcc.m22021a((xcc) this.f45812v, "A", null, null, null, 1022);
                return txc.f41359a;
            case 13:
                v11.m20244z(obj);
                try {
                    MainActivity mainActivity = (MainActivity) this.f45812v;
                    int i2 = MainActivity.f6412i0;
                    ((v57) mainActivity.f6422X.getValue()).getClass();
                } catch (Exception e6) {
                    Log.e("Shortcut", "handle shortcut action", e6);
                }
                return txc.f41359a;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                v11.m20244z(obj);
                ((rk7) this.f45812v).f36893s.invoke();
                return txc.f41359a;
            case ba7.f2964h /* 15 */:
                v11.m20244z(obj);
                yq7 yq7Var = (yq7) this.f45812v;
                ynb ynbVar2 = yq7Var.f51011M;
                Boolean bool = Boolean.FALSE;
                ynbVar2.getClass();
                ynbVar2.m22921k(null, bool);
                yq7Var.m22956h();
                return txc.f41359a;
            case 16:
                v11.m20244z(obj);
                d8b d8bVar = (d8b) ((e8b) ((bt7) this.f45812v).f3951i.getValue());
                return new Integer(d8bVar.f7561b.nativeIncrementAndGetCounterValue(d8bVar.f7562c));
            case 17:
                String str = bbNCAFLw.xChbuY;
                v11.m20244z(obj);
                try {
                    while (true) {
                        int i3 = 0;
                        for (String str2 : mv1.m13794F("https://api.ipify.org", "https://api.myip.com", "https://checkip.amazonaws.com", "https://api.ip.sb/ip", "https://icanhazip.com", "https://ipecho.net/plain", "https://ipinfo.io/ip")) {
                            try {
                                URLConnection openConnection = new URL(str2).openConnection();
                                openConnection.getClass();
                                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                httpURLConnection.setConnectTimeout(3000);
                                httpURLConnection.setReadTimeout(3000);
                                if (httpURLConnection.getResponseCode() == 200) {
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    inputStream.getClass();
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, zc1.f52140a), 8192);
                                    try {
                                        String obj2 = stb.m18242B1(qr5.m16837C(bufferedReader)).toString();
                                        bufferedReader.close();
                                        if (m48.m13138l(obj2)) {
                                            httpURLConnection.disconnect();
                                            return obj2;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            jzd.m11701g(bufferedReader, th);
                                            throw th2;
                                        }
                                    }
                                }
                                httpURLConnection.disconnect();
                            } catch (UnknownHostException e7) {
                                sx7 sx7Var6 = sx7.f39332a;
                                sx7.m18364b(sx7Var6, str + str2 + ": " + e7.getMessage(), null, 6);
                                i3++;
                                if (i3 >= 2) {
                                    sx7.m18364b(sx7Var6, "Aborting public IP walk: DNS resolution is down", null, 6);
                                    return null;
                                }
                            } catch (CancellationException e8) {
                                throw e8;
                            } catch (Exception e9) {
                                sx7.m18364b(sx7.f39332a, str + str2 + ": " + e9.getMessage(), null, 6);
                            }
                        }
                        return null;
                    }
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Exception e11) {
                    sx7 sx7Var7 = sx7.f39332a;
                    pr1.m15991y("Error getting public IP: ", e11.getMessage(), null, null, 6);
                    return null;
                }
            case Chart.PAINT_LEGEND_LABEL /* 18 */:
                v11.m20244z(obj);
                String str3 = yy5.f51440e;
                yy5.f51440e = null;
                if (str3 != null) {
                    ((nm8) this.f45812v).m14323f(new ml8(new pm8(str3)));
                }
                return txc.f41359a;
            case 19:
                v11.m20244z(obj);
                u39 u39Var = (u39) this.f45812v;
                TextClassifier m21047b = w10.m21047b(u39Var.f41667b, u39Var.f41668c);
                u39Var.f41671f = m21047b;
                return m21047b;
            case 20:
                ReminderNotificationWorker reminderNotificationWorker = (ReminderNotificationWorker) this.f45812v;
                v11.m20244z(obj);
                try {
                    reminderNotificationWorker.m3832g();
                    reminderNotificationWorker.m3831f();
                    reminderNotificationWorker.m3830e();
                    ((uwb) reminderNotificationWorker.f6363C.getValue()).m20149q();
                    return new ht6();
                } catch (Exception e12) {
                    sx7 sx7Var8 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "ReminderNotifWorker", null, "ReminderNotificationWorker failed: " + e12.getMessage());
                    return new gt6();
                }
            case 21:
                txc txcVar = txc.f41359a;
                caa caaVar = (caa) this.f45812v;
                v11.m20244z(obj);
                try {
                    String stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default(caaVar.f4724d, PrefKeys.KEY_DEVICE_MONGODB_ID, null, 2, null);
                    if (stringFromPreferences$default.length() == 0) {
                        sx7 sx7Var9 = sx7.f39332a;
                        sx7.m18370h(2, "[ENFORCE] ⚠️ No device MongoDB ID found, cannot start enforcement", "KG_SYNC");
                        sx7.m18370h(2, "[MONGO_ID] Device MongoDB ID not found in preferences - restriction enforcement cannot start", "KG_SYNC");
                    } else {
                        sx7 sx7Var10 = sx7.f39332a;
                        sx7.m18364b(sx7Var10, "[MONGO_ID] Using device MongoDB ID for restriction enforcement: ".concat(stringFromPreferences$default), "KG_SYNC", 2);
                        i30.m9905U(new na4(((zaa) caaVar.f4721a).m23488h(stringFromPreferences$default), new C0662o7(caaVar, xa2Var, (byte) 29), (byte) 3), caaVar.f4725e);
                        caaVar.f4726f.m22921k(null, Boolean.TRUE);
                        sx7.m18367e(sx7Var10, "[ENFORCE] ✅ Restriction enforcement started", "KG_SYNC", 2);
                    }
                } catch (Exception e13) {
                    sx7 sx7Var11 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "KG_SYNC", e13, "[ENFORCE] ❌ Error starting enforcement");
                }
                return txcVar;
            case 22:
                ly6 ly6Var2 = ly6.f25312y;
                zca zcaVar = (zca) this.f45812v;
                v11.m20244z(obj);
                long j = 0;
                try {
                    try {
                        j = zcaVar.f52163a.getSharedPreferences("restriction_sync", 0).getLong("restriction_last_sync_timestamp", 0L);
                    } catch (Exception e14) {
                        sx7 sx7Var12 = sx7.f39332a;
                        sx7.m18369g(ly6Var2, "KG_SYNC", e14, "[SYNC_MGR] ❌ Error checking startup sync");
                    }
                } catch (Exception e15) {
                    sx7 sx7Var13 = sx7.f39332a;
                    sx7.m18369g(ly6Var2, "KG_SYNC", e15, "[SYNC_MGR] ❌ Failed to get last sync timestamp");
                }
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis > 900000) {
                    sx7.m18367e(sx7.f39332a, "[SYNC_MGR] 🔄 Last sync was " + ((currentTimeMillis / 1000) / 60) + " minutes ago, triggering startup sync", "KG_SYNC", 2);
                    zcaVar.m23513d();
                } else {
                    sx7.m18364b(sx7.f39332a, "[SYNC_MGR]   Last sync was " + ((currentTimeMillis / 1000) / 60) + " minutes ago, no startup sync needed", "KG_SYNC", 2);
                }
                return txc.f41359a;
            case 23:
                v11.m20244z(obj);
                ((wo9) this.f45812v).f46927v.f15676m.m15829G();
                return txc.f41359a;
            case 24:
                v11.m20244z(obj);
                SilenceModeWorker silenceModeWorker = (SilenceModeWorker) this.f45812v;
                Context context2 = silenceModeWorker.f6235A;
                cab cabVar = new cab(context2);
                m8b m8bVar = new m8b(context2, (byte) 1);
                kl6 m10513r = iq5.m10513r(so6.f38881u, new cz8(silenceModeWorker, (byte) 16));
                Calendar calendar = Calendar.getInstance();
                ggc ggcVar = new ggc(calendar.get(11), calendar.get(12));
                boolean z2 = false;
                for (String str4 : wd9.f46245b) {
                    try {
                        ne9 prayerTime = ((PreferencesHelper) m10513r.getValue()).getPrayerTime(str4);
                        if (prayerTime.f28155f) {
                            if (zy5.m23838d(str4, "Jum'a")) {
                                if (!(Calendar.getInstance().get(7) == i)) {
                                }
                            }
                            ggc ggcVar2 = new ggc(prayerTime.f28151b, prayerTime.f28152c);
                            ggc ggcVar3 = new ggc(prayerTime.f28153d, prayerTime.f28154e);
                            if (SilenceModeWorker.m3572e(ggcVar, ggcVar2, ggcVar3, str4)) {
                                try {
                                    ggcVar2.toString();
                                    ggcVar3.toString();
                                    z2 = true;
                                    xa2Var = str4;
                                } catch (Exception e16) {
                                    e = e16;
                                    z2 = true;
                                    xa2Var = str4;
                                    Log.e("AutoSilencePro", "Error checking prayer time for " + str4, e);
                                    i = 6;
                                }
                            }
                        }
                    } catch (Exception e17) {
                        e = e17;
                    }
                    i = 6;
                }
                if (z2 == m8bVar.f25841a.getBoolean("current_state", false)) {
                    cabVar.m2911e();
                } else if (z2) {
                    Log.i("AutoSilencePro", "Enabling silent mode for active prayer: " + xa2Var);
                    cabVar.m2910d();
                    m8bVar.m13241a("worker", true);
                } else {
                    Log.i("AutoSilencePro", "Disabling silent mode - no active prayers");
                    cabVar.m2909c();
                    m8bVar.m13241a("worker", false);
                }
                return txc.f41359a;
            case 25:
                v11.m20244z(obj);
                ((nzb) this.f45812v).m14656g();
                return txc.f41359a;
            case 26:
                v11.m20244z(obj);
                C0092cd c0092cd = (C0092cd) this.f45812v;
                if (((Boolean) c0092cd.f4863x.getValue()).booleanValue()) {
                    uf4.m19589b(c0092cd.f4864y);
                }
                return txc.f41359a;
            case 27:
                v11.m20244z(obj);
                bsc bscVar = (bsc) this.f45812v;
                ynb ynbVar3 = bscVar.f3889w;
                Boolean valueOf = Boolean.valueOf(((C0522kf) bscVar.f3888v).m12040c());
                ynbVar3.getClass();
                ynbVar3.m22921k(null, valueOf);
                return txc.f41359a;
            case 28:
                v11.m20244z(obj);
                sxc sxcVar = sxc.f39342a;
                return sxc.m18373c((Context) this.f45812v);
            default:
                v11.m20244z(obj);
                ((f4d) this.f45812v).m7649g();
                return txc.f41359a;
        }
    }
}
