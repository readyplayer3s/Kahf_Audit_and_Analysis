package p000;

import com.kahf.dns.p015di.PlatformModule_androidKt;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class yc3 {

    /* renamed from: a */
    public final vl4 f50195a;

    /* renamed from: b */
    public final jm4 f50196b;

    /* renamed from: c */
    public final j39 f50197c;

    /* renamed from: d */
    public final ng9 f50198d;

    /* renamed from: e */
    public final j39 f50199e;

    /* renamed from: f */
    public final j39 f50200f;

    /* renamed from: g */
    public final ew7 f50201g = new ew7();

    public yc3(vl4 vl4Var, jm4 jm4Var, j39 j39Var, ng9 ng9Var, j39 j39Var2, j39 j39Var3) {
        this.f50195a = vl4Var;
        this.f50196b = jm4Var;
        this.f50197c = j39Var;
        this.f50198d = ng9Var;
        this.f50199e = j39Var2;
        this.f50200f = j39Var3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(3:(1:(9:11|12|13|14|15|(1:17)(1:22)|18|19|20)(2:26|27))(10:28|29|30|31|(2:33|(1:35)(1:47))|48|37|(1:39)|40|(3:42|19|20)(3:43|(7:46|14|15|(0)(0)|18|19|20)|45))|24|25)(1:51))(1:64)|52|53|(3:58|(8:60|31|(0)|48|37|(0)|40|(0)(0))|45)|61|19|20))|66|6|(0)(0)|52|53|(4:55|58|(0)|45)|61|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r12 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        if (r12.mo147b(r1) == r8) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x00ee, B:17:0x00fa, B:22:0x011e), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011e A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x00ee, B:17:0x00fa, B:22:0x011e), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:30:0x0046, B:31:0x0094, B:33:0x0098, B:37:0x00a4, B:40:0x00cd, B:42:0x00d3, B:43:0x00d8), top: B:29:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:30:0x0046, B:31:0x0094, B:33:0x0098, B:37:0x00a4, B:40:0x00cd, B:42:0x00d3, B:43:0x00d8), top: B:29:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:30:0x0046, B:31:0x0094, B:33:0x0098, B:37:0x00a4, B:40:0x00cd, B:42:0x00d3, B:43:0x00d8), top: B:29:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [bw7] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [bw7] */
    /* JADX WARN: Type inference failed for: r2v18, types: [bw7] */
    /* JADX WARN: Type inference failed for: r2v19, types: [bw7] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22795a(za2 za2Var) {
        xc3 xc3Var;
        int i;
        qc2 qc2Var;
        ew7 ew7Var;
        ?? r1;
        Object obj;
        Object invoke;
        ew7 ew7Var2;
        String str;
        String platformModule$lambda$0$40$0;
        String str2;
        String stringFromPreferences;
        String str3;
        ew7 ew7Var3;
        String str4;
        Throwable m19582a;
        PreferencesHelper preferencesHelper = this.f50198d.f28253a;
        if (za2Var instanceof xc3) {
            xc3Var = (xc3) za2Var;
            int i2 = xc3Var.f48122z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xc3Var.f48122z = i2 - Integer.MIN_VALUE;
                Object obj2 = xc3Var.f48120x;
                i = xc3Var.f48122z;
                qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj2);
                    ew7Var = this.f50201g;
                    xc3Var.f48117u = ew7Var;
                    xc3Var.f48122z = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ?? r2 = xc3Var.f48117u;
                            try {
                                v11.m20244z(obj2);
                                ew7Var2 = r2;
                                str = (String) obj2;
                                if (str != null) {
                                    if (stb.m18260Z0(str)) {
                                        str = null;
                                    }
                                }
                                str = "none";
                                platformModule$lambda$0$40$0 = PlatformModule_androidKt.platformModule$lambda$0$40$0(this.f50197c.f19565v);
                                platformModule$lambda$0$40$0.getClass();
                                str2 = platformModule$lambda$0$40$0 + "|" + str;
                                stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_REPORTED_DNS, "");
                                if (stringFromPreferences.length() == 0) {
                                    stringFromPreferences = null;
                                }
                                if (!str2.equals(stringFromPreferences)) {
                                    obj = eb3.f9632a;
                                    ew7Var = ew7Var2;
                                    ew7Var.mo148n(null);
                                    return obj;
                                }
                                jm4 jm4Var = this.f50196b;
                                xc3Var.f48117u = ew7Var2;
                                xc3Var.f48118v = str2;
                                xc3Var.f48119w = str;
                                xc3Var.f48122z = 3;
                                Object invoke2 = jm4Var.invoke(str, xc3Var);
                                if (invoke2 != qc2Var) {
                                    String str5 = str;
                                    obj2 = invoke2;
                                    str3 = str5;
                                    ew7Var3 = ew7Var2;
                                    str4 = str2;
                                    Object obj3 = ((uda) obj2).f42208u;
                                    m19582a = uda.m19582a(obj3);
                                    if (m19582a != null) {
                                    }
                                    ew7Var = ew7Var3;
                                    ew7Var.mo148n(null);
                                    return obj;
                                }
                                return qc2Var;
                            } catch (Throwable th) {
                                th = th;
                                r1 = r2;
                            }
                        } else {
                            if (i != 3) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str3 = xc3Var.f48119w;
                            str4 = xc3Var.f48118v;
                            r1 = xc3Var.f48117u;
                            try {
                                v11.m20244z(obj2);
                                ew7Var3 = r1;
                                Object obj32 = ((uda) obj2).f42208u;
                                m19582a = uda.m19582a(obj32);
                                if (m19582a != null) {
                                    str4.getClass();
                                    preferencesHelper.saveToPreferences(PrefKeys.LAST_REPORTED_DNS, str4);
                                    sx7 sx7Var = sx7.f39332a;
                                    sx7.m18369g(ly6.f25310w, "KG_SYNC", null, "[DNS_REPORT] reported " + str3);
                                    obj = new cb3(str3);
                                } else {
                                    sx7 sx7Var2 = sx7.f39332a;
                                    sx7.m18369g(ly6.f25311x, "KG_SYNC", null, "[DNS_REPORT] upload of " + str3 + " failed, will retry on the next observation: " + m19582a.getMessage());
                                    obj = bb3.f3004a;
                                }
                                ew7Var = ew7Var3;
                                ew7Var.mo148n(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        r1.mo148n(null);
                        throw th;
                    }
                    ?? r22 = xc3Var.f48117u;
                    v11.m20244z(obj2);
                    ew7Var = r22;
                }
                if (((Boolean) this.f50199e.invoke()).booleanValue() && ((Boolean) this.f50200f.invoke()).booleanValue()) {
                    vl4 vl4Var = this.f50195a;
                    xc3Var.f48117u = ew7Var;
                    xc3Var.f48122z = 2;
                    invoke = vl4Var.invoke(xc3Var);
                    if (invoke != qc2Var) {
                        ew7Var2 = ew7Var;
                        obj2 = invoke;
                        str = (String) obj2;
                        if (str != null) {
                        }
                        str = "none";
                        platformModule$lambda$0$40$0 = PlatformModule_androidKt.platformModule$lambda$0$40$0(this.f50197c.f19565v);
                        platformModule$lambda$0$40$0.getClass();
                        str2 = platformModule$lambda$0$40$0 + "|" + str;
                        stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_REPORTED_DNS, "");
                        if (stringFromPreferences.length() == 0) {
                        }
                        if (!str2.equals(stringFromPreferences)) {
                        }
                    }
                    return qc2Var;
                }
                obj = db3.f7689a;
                ew7Var.mo148n(null);
                return obj;
            }
        }
        xc3Var = new xc3(this, za2Var);
        Object obj22 = xc3Var.f48120x;
        i = xc3Var.f48122z;
        qc2Var = qc2.f34309u;
        if (i != 0) {
        }
        if (((Boolean) this.f50199e.invoke()).booleanValue()) {
            vl4 vl4Var2 = this.f50195a;
            xc3Var.f48117u = ew7Var;
            xc3Var.f48122z = 2;
            invoke = vl4Var2.invoke(xc3Var);
            if (invoke != qc2Var) {
            }
            return qc2Var;
        }
        obj = db3.f7689a;
        ew7Var.mo148n(null);
        return obj;
    }
}
