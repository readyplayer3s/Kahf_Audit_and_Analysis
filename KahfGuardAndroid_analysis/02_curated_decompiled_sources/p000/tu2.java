package p000;

import com.posthog.internal.replay.RRPluginEvent;
import com.posthog.internal.replay.RRUtilsKt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final /* synthetic */ class tu2 implements Runnable {

    /* renamed from: u */
    public final /* synthetic */ byte f41146u;

    /* renamed from: v */
    public final /* synthetic */ Object f41147v;

    /* renamed from: w */
    public final /* synthetic */ Object f41148w;

    /* renamed from: x */
    public final /* synthetic */ Object f41149x;

    /* renamed from: y */
    public final /* synthetic */ Object f41150y;

    public /* synthetic */ tu2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f41146u = b;
        this.f41147v = obj;
        this.f41148w = obj2;
        this.f41149x = obj3;
        this.f41150y = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process exec;
        BufferedReader bufferedReader;
        pfc m17006a;
        String str;
        Date time;
        String obj;
        Process process = null;
        String str2 = null;
        byte b = 0;
        switch (this.f41146u) {
            case 0:
                wu2 wu2Var = (wu2) this.f41147v;
                zl0 zl0Var = (zl0) this.f41148w;
                String str3 = zl0Var.f52650a;
                ipc ipcVar = (ipc) this.f41149x;
                sk0 sk0Var = (sk0) this.f41150y;
                wu2Var.getClass();
                Logger logger = wu2.f47175f;
                try {
                    bpc m22873a = wu2Var.f47178c.m22873a(str3);
                    if (m22873a == null) {
                        String str4 = "Transport backend '" + str3 + "' is not registered";
                        logger.warning(str4);
                        ipcVar.mo2509c(new IllegalArgumentException(str4));
                    } else {
                        wu2Var.f47180e.m22203r(new uu2(wu2Var, zl0Var, ((y91) m22873a).m22743a(sk0Var), b));
                        ipcVar.mo2509c(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    ipcVar.mo2509c(e);
                    return;
                }
            default:
                ArrayList arrayList = (ArrayList) this.f41147v;
                gb9 gb9Var = (gb9) this.f41148w;
                qy6 qy6Var = (qy6) this.f41149x;
                cb9 cb9Var = (cb9) this.f41150y;
                try {
                    exec = Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
                    try {
                        InputStream inputStream = exec.getInputStream();
                        inputStream.getClass();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, zc1.f52140a), 8192);
                        try {
                            gb9Var.f13810v = true;
                            do {
                                try {
                                    str2 = bufferedReader.readLine();
                                    cb9 cb9Var2 = gb9Var.f13812x;
                                    if ((cb9Var2 != null ? cb9Var2.mo2974c() : false) && str2 != null && str2.length() != 0 && !stb.m18246L0(str2, "PostHog", false) && !stb.m18246L0(str2, "StrictMode", false) && (m17006a = qy6Var.m17006a(str2)) != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("level", ((String) m17006a.f32487v).toString());
                                        String str5 = (String) m17006a.f32488w;
                                        String str6 = "";
                                        if (str5 == null || (str = stb.m18242B1(str5).toString()) == null) {
                                            str = "";
                                        }
                                        String str7 = (String) m17006a.f32489x;
                                        if (str7 != null && (obj = stb.m18242B1(str7).toString()) != null) {
                                            str6 = obj;
                                        }
                                        linkedHashMap.put("payload", mv1.m13793E(str + ": " + str6));
                                        GregorianCalendar gregorianCalendar = (GregorianCalendar) m17006a.f32486u;
                                        RRUtilsKt.capture(mv1.m13793E(new RRPluginEvent("rrweb/console@1", linkedHashMap, (gregorianCalendar == null || (time = gregorianCalendar.getTime()) == null) ? gb9Var.f13809u.f30000L.mo17230a() : time.getTime())), cb9Var);
                                        break;
                                    }
                                } catch (Throwable unused) {
                                    break;
                                }
                                bufferedReader.close();
                                exec.destroy();
                            } while (gb9Var.f13810v);
                            bufferedReader.close();
                            exec.destroy();
                        } finally {
                        }
                    } catch (Throwable unused2) {
                        process = exec;
                        if (process != null) {
                            process.destroy();
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused3) {
                }
                break;
        }
        bufferedReader.close();
        exec.destroy();
    }
}
