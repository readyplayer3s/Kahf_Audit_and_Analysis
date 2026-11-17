package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.kahf.dns.features.restrictions.sync.p018gc.jTCFTGKxOS;
import com.kahf.dns.utils.PreferencesHelper;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class m48 implements d48 {

    /* renamed from: a */
    public final Context f25599a;

    /* renamed from: b */
    public vq8 f25600b;

    /* renamed from: c */
    public vq8 f25601c;

    /* renamed from: d */
    public final hc2 f25602d;

    /* renamed from: e */
    public final hc2 f25603e;

    /* renamed from: f */
    public final ew7 f25604f;

    /* renamed from: g */
    public long f25605g;

    /* renamed from: h */
    public final ConnectivityManager f25606h;

    /* renamed from: i */
    public final PreferencesHelper f25607i;

    public m48(Context context) {
        context.getClass();
        this.f25599a = context;
        vu2 vu2Var = k83.f21845a;
        dt2 dt2Var = dt2.f8706v;
        this.f25602d = dt2Var.mo1526D(4);
        this.f25603e = dt2Var.mo1526D(4);
        this.f25604f = new ew7();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.f25606h = (ConnectivityManager) systemService;
        this.f25607i = new PreferencesHelper();
    }

    /* renamed from: c */
    public static boolean m13135c() {
        try {
            return zy5.m23838d(TimeZone.getDefault().getID(), "Asia/Dhaka");
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("Error checking timezone: ", e.getMessage(), null, null, 6);
            return false;
        }
    }

    /* renamed from: d */
    public static oa3 m13136d(long j, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis() - j;
        int i = Build.VERSION.SDK_INT;
        String m19197A = tz6.m19197A(Build.MANUFACTURER, " ", Build.MODEL);
        String str3 = Build.VERSION.RELEASE;
        str3.getClass();
        return new oa3(false, false, "unknown", false, false, -1L, false, -1L, false, null, null, false, null, false, false, "error", str2, currentTimeMillis, currentTimeMillis2, i, m19197A, str3, str);
    }

    /* renamed from: e */
    public static oa3 m13137e(long j, boolean z, boolean z2, String str, boolean z3, boolean z4, long j2, boolean z5, long j3, boolean z6, String str2, String str3, boolean z7, String str4, boolean z8, boolean z9, String str5, String str6) {
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis() - j;
        int i = Build.VERSION.SDK_INT;
        String m19197A = tz6.m19197A(Build.MANUFACTURER, " ", Build.MODEL);
        String str7 = Build.VERSION.RELEASE;
        str7.getClass();
        return new oa3(z, z2, str, z3, z4, j2, z5, j3, z6, str2, str3, z7, str4, z8, z9, str5, str6, currentTimeMillis, currentTimeMillis2, i, m19197A, str7, null);
    }

    /* renamed from: l */
    public static boolean m13138l(String str) {
        Pattern compile = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        compile.getClass();
        Pattern compile2 = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        compile2.getClass();
        Pattern compile3 = Pattern.compile("^(([0-9a-fA-F]{1,4}:)*)?::([0-9a-fA-F]{1,4}:)*[0-9a-fA-F]{1,4}$");
        compile3.getClass();
        str.getClass();
        return compile.matcher(str).matches() || compile2.matcher(str).matches() || compile3.matcher(str).matches();
    }

    /* renamed from: a */
    public final Boolean m13139a() {
        String simCountryIso;
        try {
            Object systemService = this.f25599a.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && (simCountryIso = telephonyManager.getSimCountryIso()) != null) {
                return Boolean.valueOf(simCountryIso.equalsIgnoreCase("BD"));
            }
            return null;
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("Error checking SIM country: ", e.getMessage(), null, null, 6);
            return null;
        }
    }

    /* renamed from: b */
    public final Boolean m13140b() {
        String networkOperator;
        try {
            Object systemService = this.f25599a.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null) {
                NetworkCapabilities m13141f = m13141f();
                if ((m13141f != null ? m13141f.hasTransport(0) : false) && (networkOperator = telephonyManager.getNetworkOperator()) != null && networkOperator.length() != 0 && networkOperator.length() >= 3) {
                    return Boolean.valueOf(networkOperator.substring(0, 3).equals("470"));
                }
            }
            return null;
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("Error checking telephony: ", e.getMessage(), null, null, 6);
            return null;
        }
    }

    /* renamed from: f */
    public final NetworkCapabilities m13141f() {
        ConnectivityManager connectivityManager = this.f25606h;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (SecurityException e) {
            sx7 sx7Var = sx7.f39332a;
            pr1.m15991y("ACCESS_NETWORK_STATE missing at runtime: ", e.getMessage(), null, null, 6);
            return null;
        }
    }

    /* renamed from: g */
    public final String m13142g() {
        NetworkCapabilities m13141f = m13141f();
        return m13141f == null ? "none" : m13141f.hasTransport(4) ? "vpn" : m13141f.hasTransport(1) ? "wifi" : m13141f.hasTransport(0) ? "mobile" : m13141f.hasTransport(3) ? "ethernet" : "unknown";
    }

    /* renamed from: h */
    public final boolean m13143h() {
        NetworkCapabilities m13141f = m13141f();
        if (m13141f == null) {
            return false;
        }
        boolean z = m13141f.hasCapability(12) && m13141f.hasCapability(16);
        return Build.VERSION.SDK_INT >= 28 ? z && m13141f.hasCapability(21) : z;
    }

    /* renamed from: i */
    public final boolean m13144i() {
        NetworkCapabilities m13141f = m13141f();
        if (m13141f != null) {
            return m13141f.hasTransport(4);
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m13145j() {
        return m13146k() && m13143h();
    }

    /* renamed from: k */
    public final boolean m13146k() {
        NetworkCapabilities m13141f = m13141f();
        if (m13141f != null) {
            return m13141f.hasTransport(0) || m13141f.hasTransport(1) || m13141f.hasTransport(3);
        }
        return false;
    }

    /* renamed from: m */
    public final Object m13147m(String str, za2 za2Var) {
        f95 f95Var = dj3.f8146v;
        return muc.m13763Y(qr5.m16843I(5000L, hj3.MILLISECONDS), new f48(this, str, null, (byte) 0), za2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[Catch: Exception -> 0x0095, InterruptedException -> 0x0099, UnknownHostException -> 0x009c, TryCatch #6 {InterruptedException -> 0x0099, UnknownHostException -> 0x009c, Exception -> 0x0095, blocks: (B:15:0x0071, B:17:0x007b, B:19:0x0084, B:21:0x008c, B:24:0x00a1, B:26:0x00a8, B:28:0x00ab, B:33:0x00af, B:53:0x00d3), top: B:14:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: Exception -> 0x0095, InterruptedException -> 0x0099, UnknownHostException -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {InterruptedException -> 0x0099, UnknownHostException -> 0x009c, Exception -> 0x0095, blocks: (B:15:0x0071, B:17:0x007b, B:19:0x0084, B:21:0x008c, B:24:0x00a1, B:26:0x00a8, B:28:0x00ab, B:33:0x00af, B:53:0x00d3), top: B:14:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13148n(String str, za2 za2Var) {
        g48 g48Var;
        int i;
        long j;
        long j2;
        final String str2;
        InetAddress[] inetAddressArr;
        String str3 = str;
        try {
            if (za2Var instanceof g48) {
                g48Var = (g48) za2Var;
                int i2 = g48Var.f13442y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g48Var.f13442y = i2 - Integer.MIN_VALUE;
                    Object obj = g48Var.f13440w;
                    i = g48Var.f13442y;
                    ly6 ly6Var = ly6.f25311x;
                    xa2 xa2Var = null;
                    byte b = 1;
                    xo3 xo3Var = xo3.f48775u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            g48Var.f13438u = str3;
                            g48Var.f13439v = currentTimeMillis;
                            g48Var.f13442y = 1;
                            f95 f95Var = dj3.f8146v;
                            obj = muc.m13763Y(qr5.m16843I(5000L, hj3.MILLISECONDS), new f48(this, str3, xa2Var, b), g48Var);
                            qc2 qc2Var = qc2.f34309u;
                            if (obj == qc2Var) {
                                return qc2Var;
                            }
                            j2 = currentTimeMillis;
                        } catch (InterruptedException unused) {
                            j = currentTimeMillis;
                            str2 = str3;
                            long currentTimeMillis2 = System.currentTimeMillis() - j;
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": Interrupted after " + currentTimeMillis2 + "ms");
                            return new ra3(str2, currentTimeMillis2, false, xo3Var, "Timeout");
                        } catch (UnknownHostException unused2) {
                            j = currentTimeMillis;
                            str2 = str3;
                            long currentTimeMillis3 = System.currentTimeMillis() - j;
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": UnknownHostException after " + currentTimeMillis3 + "ms");
                            return new ra3(str2, currentTimeMillis3, false, xo3Var, "UnknownHost");
                        } catch (Exception e) {
                            e = e;
                            j = currentTimeMillis;
                            str2 = str3;
                            long currentTimeMillis4 = System.currentTimeMillis() - j;
                            sx7 sx7Var3 = sx7.f39332a;
                            sx7.m18369g(ly6.f25312y, "DNS_BOOTSTRAP", null, str2 + ": " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            return new ra3(str2, currentTimeMillis4, false, xo3Var, e.getClass().getSimpleName());
                        }
                    } else {
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = g48Var.f13439v;
                        str3 = g48Var.f13438u;
                        try {
                            v11.m20244z(obj);
                            j2 = j;
                        } catch (InterruptedException unused3) {
                            str2 = str3;
                            long currentTimeMillis22 = System.currentTimeMillis() - j;
                            sx7 sx7Var4 = sx7.f39332a;
                            sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": Interrupted after " + currentTimeMillis22 + "ms");
                            return new ra3(str2, currentTimeMillis22, false, xo3Var, "Timeout");
                        } catch (UnknownHostException unused4) {
                            str2 = str3;
                            long currentTimeMillis32 = System.currentTimeMillis() - j;
                            sx7 sx7Var22 = sx7.f39332a;
                            sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": UnknownHostException after " + currentTimeMillis32 + "ms");
                            return new ra3(str2, currentTimeMillis32, false, xo3Var, "UnknownHost");
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            long currentTimeMillis42 = System.currentTimeMillis() - j;
                            sx7 sx7Var32 = sx7.f39332a;
                            sx7.m18369g(ly6.f25312y, "DNS_BOOTSTRAP", null, str2 + ": " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            return new ra3(str2, currentTimeMillis42, false, xo3Var, e.getClass().getSimpleName());
                        }
                    }
                    str2 = str3;
                    inetAddressArr = (InetAddress[]) obj;
                    final long currentTimeMillis5 = System.currentTimeMillis() - j2;
                    if (inetAddressArr != null) {
                        sx7 sx7Var5 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": Timeout after " + currentTimeMillis5 + "ms");
                        return new ra3(str2, currentTimeMillis5, false, xo3Var, "Timeout");
                    }
                    final ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : inetAddressArr) {
                        String hostAddress = inetAddress.getHostAddress();
                        u7a u7aVar = hostAddress != null ? new u7a(hostAddress, inetAddress instanceof Inet6Address ? "ipv6" : "ipv4") : null;
                        if (u7aVar != null) {
                            arrayList.add(u7aVar);
                        }
                    }
                    sx7.m18363a(sx7.f39332a, "DNS_BOOTSTRAP", new tl4() { // from class: e48
                        @Override // p000.tl4
                        public final Object invoke() {
                            ArrayList arrayList2 = arrayList;
                            ArrayList arrayList3 = new ArrayList(qs1.m16870Y(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                u7a u7aVar2 = (u7a) it.next();
                                arrayList3.add(u7aVar2.f41922a + ":" + u7aVar2.f41923b);
                            }
                            return str2 + " resolved in " + currentTimeMillis5 + "ms: " + arrayList3;
                        }
                    });
                    try {
                        return new ra3(str2, currentTimeMillis5, true, arrayList, null);
                    } catch (InterruptedException unused5) {
                        str2 = str2;
                        j = j2;
                        long currentTimeMillis222 = System.currentTimeMillis() - j;
                        sx7 sx7Var42 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": Interrupted after " + currentTimeMillis222 + "ms");
                        return new ra3(str2, currentTimeMillis222, false, xo3Var, "Timeout");
                    } catch (UnknownHostException unused6) {
                        str2 = str2;
                        j = j2;
                        long currentTimeMillis322 = System.currentTimeMillis() - j;
                        sx7 sx7Var222 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "DNS_BOOTSTRAP", null, str2 + ": UnknownHostException after " + currentTimeMillis322 + "ms");
                        return new ra3(str2, currentTimeMillis322, false, xo3Var, "UnknownHost");
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str2;
                        j = j2;
                        long currentTimeMillis422 = System.currentTimeMillis() - j;
                        sx7 sx7Var322 = sx7.f39332a;
                        sx7.m18369g(ly6.f25312y, "DNS_BOOTSTRAP", null, str2 + ": " + e.getClass().getSimpleName() + " - " + e.getMessage());
                        return new ra3(str2, currentTimeMillis422, false, xo3Var, e.getClass().getSimpleName());
                    }
                }
            }
            inetAddressArr = (InetAddress[]) obj;
            final long currentTimeMillis52 = System.currentTimeMillis() - j2;
            if (inetAddressArr != null) {
            }
        } catch (InterruptedException unused7) {
        } catch (UnknownHostException unused8) {
        } catch (Exception e4) {
            e = e4;
        }
        g48Var = new g48(this, za2Var);
        Object obj2 = g48Var.f13440w;
        i = g48Var.f13442y;
        ly6 ly6Var2 = ly6.f25311x;
        xa2 xa2Var2 = null;
        byte b2 = 1;
        xo3 xo3Var2 = xo3.f48775u;
        if (i != 0) {
        }
        str2 = str3;
    }

    /* renamed from: p */
    public final Object m13150p(String[] strArr, sj2 sj2Var) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!stb.m18260Z0(str)) {
                arrayList.add(str);
            }
        }
        List m16032j0 = ps1.m16032j0(arrayList);
        if (!m16032j0.isEmpty()) {
            vu2 vu2Var = k83.f21845a;
            Object m11694F = jzd.m11694F(dt2.f8706v, new l94(m16032j0, this, null, (byte) 20), sj2Var);
            if (m11694F == qc2.f34309u) {
                return m11694F;
            }
        }
        return txc.f41359a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:(2:3|(13:5|6|7|(2:186|(1:(1:(24:190|191|192|73|74|(1:123)(1:79)|(1:81)(1:122)|(1:121)(1:84)|85|86|87|88|89|(1:91)(1:110)|92|(1:94)(1:109)|95|(1:97)(1:108)|98|(1:100)|101|(1:103)(1:107)|104|105)(2:193|194))(14:195|196|197|198|(1:53)(1:154)|54|55|56|57|58|59|61|62|(3:137|138|139)(8:64|65|66|67|68|69|70|(1:126)(24:72|73|74|(0)|123|(0)(0)|(0)|121|85|86|87|88|89|(0)(0)|92|(0)(0)|95|(0)(0)|98|(0)|101|(0)(0)|104|105))))(3:202|203|204))(4:9|10|11|(2:13|14)(11:16|17|18|19|20|21|22|23|24|25|(2:27|28)(1:29)))|30|31|32|(1:34)(1:168)|35|36|37|38|(2:40|41)(8:43|44|45|46|47|48|49|(1:155)(11:51|(0)(0)|54|55|56|57|58|59|61|62|(0)(0)))))|37|38|(0)(0))|209|6|7|(0)(0)|30|31|32|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01ca, code lost:
    
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0069, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x006a, code lost:
    
        r13 = r5;
        r3 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0402 A[Catch: Exception -> 0x040c, CancellationException -> 0x040f, TryCatch #23 {CancellationException -> 0x040f, Exception -> 0x040c, blocks: (B:88:0x0392, B:92:0x03c7, B:95:0x03dc, B:98:0x03eb, B:101:0x03f7, B:103:0x0402, B:104:0x041a, B:107:0x0412), top: B:87:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0412 A[Catch: Exception -> 0x040c, CancellationException -> 0x040f, TryCatch #23 {CancellationException -> 0x040f, Exception -> 0x040c, blocks: (B:88:0x0392, B:92:0x03c7, B:95:0x03dc, B:98:0x03eb, B:101:0x03f7, B:103:0x0402, B:104:0x041a, B:107:0x0412), top: B:87:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3 A[Catch: Exception -> 0x01c9, CancellationException -> 0x01d0, TryCatch #17 {Exception -> 0x01c9, blocks: (B:32:0x01bf, B:34:0x01c3, B:35:0x01d8), top: B:31:0x01bf }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0212 A[Catch: Exception -> 0x0236, CancellationException -> 0x0238, TRY_LEAVE, TryCatch #25 {CancellationException -> 0x0238, Exception -> 0x0236, blocks: (B:38:0x01e6, B:40:0x0212), top: B:37:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e6  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13149o(long j, za2 za2Var) {
        l48 l48Var;
        ?? r5;
        String str;
        ly6 ly6Var;
        long j2;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        String str4;
        long j3;
        long j4;
        Object obj;
        ly6 ly6Var2;
        boolean z4;
        int i;
        String str5;
        ly6 ly6Var3;
        long j5;
        boolean z5;
        String str6;
        Object obj2;
        boolean z6;
        long j6;
        String str7;
        Object obj3;
        long j7;
        boolean z7;
        boolean z8;
        String str8;
        boolean z9;
        String str9;
        long j8;
        long j9;
        long j10;
        byte b;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j11;
        long currentTimeMillis;
        String str14;
        boolean booleanValue;
        ly6 ly6Var4;
        try {
            if (za2Var instanceof l48) {
                l48Var = (l48) za2Var;
                int i2 = l48Var.f23629G;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l48Var.f23629G = i2 - Integer.MIN_VALUE;
                    Object obj4 = l48Var.f23627E;
                    r5 = l48Var.f23629G;
                    ly6 ly6Var5 = ly6.f25309v;
                    Object obj5 = qc2.f34309u;
                    if (r5 == 0) {
                        try {
                            if (r5 == 1) {
                                str2 = "ms";
                                long j12 = l48Var.f23631v;
                                boolean z14 = l48Var.f23624B;
                                boolean z15 = l48Var.f23623A;
                                z = l48Var.f23635z;
                                long j13 = l48Var.f23630u;
                                String str15 = l48Var.f23625C;
                                v11.m20244z(obj4);
                                str3 = "DNS_TRACE";
                                z2 = z14;
                                z3 = z15;
                                str4 = str15;
                                j3 = j13;
                                j4 = j12;
                                obj = obj4;
                                ly6Var2 = ly6Var5;
                            } else {
                                if (r5 != 2) {
                                    if (r5 != 3) {
                                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    long j14 = l48Var.f23634y;
                                    long j15 = l48Var.f23632w;
                                    boolean z16 = l48Var.f23624B;
                                    boolean z17 = l48Var.f23623A;
                                    boolean z18 = l48Var.f23635z;
                                    long j16 = l48Var.f23630u;
                                    String str16 = l48Var.f23625C;
                                    v11.m20244z(obj4);
                                    z7 = z16;
                                    z8 = z17;
                                    str7 = "═══════════════════════════════════════════════════════════════";
                                    str8 = str16;
                                    str3 = "DNS_TRACE";
                                    ly6Var3 = ly6Var5;
                                    z9 = z18;
                                    str9 = "ms";
                                    j8 = j15;
                                    j9 = j16;
                                    j10 = j14;
                                    b = 1;
                                    try {
                                        nrc nrcVar = (nrc) obj4;
                                        str11 = (String) nrcVar.m14418a();
                                        str12 = (String) nrcVar.m14419b();
                                        str13 = (String) nrcVar.m14420c();
                                        z10 = (str11 == null && str12 != null && zy5.m23838d(str11, str12)) ? b : 0;
                                        z11 = str13 != null ? b : 0;
                                        z12 = (z10 != 0 || z11 == 0) ? 0 : b;
                                        sx7 sx7Var = sx7.f39332a;
                                        str = str3;
                                        ly6Var = ly6Var3;
                                    } catch (Exception e) {
                                        e = e;
                                        str = str3;
                                    }
                                    try {
                                        sx7.m18369g(ly6Var, str, null, "Kahf DNS Verification:");
                                        sx7.m18369g(ly6Var, str, null, "  ├─ Layer 1 (Safe Search):");
                                        sx7.m18369g(ly6Var, str, null, "  │   ├─ google.com: " + str11);
                                        sx7.m18369g(ly6Var, str, null, "  │   ├─ safesearch: " + str12);
                                        sx7.m18369g(ly6Var, str, null, "  │   └─ Enforced: ".concat(z10 == 0 ? "✓" : "✗"));
                                        sx7.m18369g(ly6Var, str, null, "  ├─ Layer 2 (Canary Block):");
                                        sx7.m18369g(ly6Var, str, null, "  │   ├─ thequran.com: ".concat(str13 != null ? "NXDOMAIN" : str13));
                                        sx7.m18369g(ly6Var, str, null, "  │   └─ Blocked: ".concat(z11 == 0 ? "✓" : "✗"));
                                        sx7.m18369g(ly6Var, str, null, "  └─ Kahf DNS Working: ".concat(z12 != 0 ? "✓" : "✗"));
                                        vq8 vq8Var = z12 == 0 ? new vq8("healthy", "All checks passed, Kahf DNS active") : mv1.m13808U("healthy_no_kahf", "Network OK but Kahf DNS not active/detected");
                                        String str17 = (String) vq8Var.f44884u;
                                        String str18 = (String) vq8Var.f44885v;
                                        long currentTimeMillis2 = System.currentTimeMillis() - j9;
                                        String str19 = str7;
                                        sx7.m18369g(ly6Var, str, null, str19);
                                        sx7.m18369g(ly6Var, str, null, "DIAGNOSTIC RESULT: " + str17);
                                        sx7.m18369g(ly6Var, str, null, "  └─ " + str18);
                                        sx7.m18369g(ly6Var, str, null, "  └─ Total Duration: " + currentTimeMillis2 + str9);
                                        sx7.m18369g(ly6Var, str, null, str19);
                                        return m13137e(j9, z9, z8, str8, z7, true, j8, true, j10, z12, str11, str12, z10, str13, z11, false, str17, str18);
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        sx7 sx7Var2 = sx7.f39332a;
                                        sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                                        throw e;
                                    } catch (Exception e3) {
                                        e = e3;
                                        j2 = j9;
                                        sx7 sx7Var3 = sx7.f39332a;
                                        sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                        return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                    }
                                }
                                long j17 = l48Var.f23633x;
                                long j18 = l48Var.f23632w;
                                int i3 = l48Var.f23626D;
                                j4 = l48Var.f23631v;
                                boolean z19 = l48Var.f23624B;
                                boolean z20 = l48Var.f23623A;
                                boolean z21 = l48Var.f23635z;
                                long j19 = l48Var.f23630u;
                                String str20 = l48Var.f23625C;
                                try {
                                    v11.m20244z(obj4);
                                    z4 = z20;
                                    i = i3;
                                    str5 = str20;
                                    ly6Var3 = ly6Var5;
                                    j5 = j18;
                                    z5 = z19;
                                    str6 = "ms";
                                    obj2 = obj4;
                                    z6 = z21;
                                    j6 = j19;
                                    str7 = "═══════════════════════════════════════════════════════════════";
                                    str3 = "DNS_TRACE";
                                    obj3 = obj5;
                                    j7 = j17;
                                    z13 = obj2 == null;
                                    try {
                                        currentTimeMillis = System.currentTimeMillis() - j7;
                                        sx7 sx7Var4 = sx7.f39332a;
                                        str14 = str3;
                                        ly6Var = ly6Var3;
                                        try {
                                            try {
                                                sx7.m18369g(ly6Var, str14, null, "DNS Resolution Layer:");
                                            } catch (CancellationException e4) {
                                                e = e4;
                                                str = str14;
                                                sx7 sx7Var22 = sx7.f39332a;
                                                sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                                                throw e;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            str = str14;
                                        }
                                        try {
                                            sx7.m18369g(ly6Var, str14, null, "  ├─ Can Resolve DNS: " + z13);
                                            StringBuilder sb = new StringBuilder("  └─ Resolution Time: ");
                                            sb.append(currentTimeMillis);
                                            String str21 = str6;
                                            sb.append(str21);
                                            sx7.m18369g(ly6Var, str14, null, sb.toString());
                                            if (z13) {
                                                try {
                                                    sx7.m18369g(ly6.f25311x, str14, null, "DNS resolution failed but internet works → Private DNS issue");
                                                    return m13137e(j6, z6, z4, str5, z5, true, j5, false, currentTimeMillis, false, null, null, false, null, false, true, "private_dns_down", "Private DNS server unreachable");
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    j2 = j6;
                                                    str = str14;
                                                    sx7 sx7Var32 = sx7.f39332a;
                                                    sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                                    return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                                }
                                            }
                                            ly6Var3 = ly6Var;
                                            str9 = str21;
                                            long j20 = j7;
                                            j11 = j6;
                                            boolean z22 = z6;
                                            boolean z23 = z4;
                                            String str22 = str5;
                                            boolean z24 = z5;
                                            long j21 = j5;
                                            try {
                                                Object obj6 = obj3;
                                                str3 = str14;
                                                b = 1;
                                                try {
                                                    j48 j48Var = new j48(this, null, b);
                                                    l48Var.f23625C = str22;
                                                    l48Var.f23630u = j11;
                                                    l48Var.f23635z = z22;
                                                    l48Var.f23623A = z23;
                                                    l48Var.f23624B = z24;
                                                    l48Var.f23631v = j4;
                                                    l48Var.f23626D = i;
                                                    l48Var.f23632w = j21;
                                                    l48Var.f23633x = j20;
                                                    l48Var.f23634y = currentTimeMillis;
                                                    l48Var.f23629G = 3;
                                                    Object m13778n = muc.m13778n(j48Var, l48Var);
                                                    if (m13778n == obj6) {
                                                        return obj6;
                                                    }
                                                    z8 = z23;
                                                    j9 = j11;
                                                    j10 = currentTimeMillis;
                                                    z9 = z22;
                                                    str8 = str22;
                                                    z7 = z24;
                                                    j8 = j21;
                                                    obj4 = m13778n;
                                                    nrc nrcVar2 = (nrc) obj4;
                                                    str11 = (String) nrcVar2.m14418a();
                                                    str12 = (String) nrcVar2.m14419b();
                                                    str13 = (String) nrcVar2.m14420c();
                                                    if (str11 == null) {
                                                    }
                                                    if (str13 != null) {
                                                    }
                                                    if (z10 != 0) {
                                                    }
                                                    sx7 sx7Var5 = sx7.f39332a;
                                                    str = str3;
                                                    ly6Var = ly6Var3;
                                                    sx7.m18369g(ly6Var, str, null, "Kahf DNS Verification:");
                                                    sx7.m18369g(ly6Var, str, null, "  ├─ Layer 1 (Safe Search):");
                                                    sx7.m18369g(ly6Var, str, null, "  │   ├─ google.com: " + str11);
                                                    sx7.m18369g(ly6Var, str, null, "  │   ├─ safesearch: " + str12);
                                                    sx7.m18369g(ly6Var, str, null, "  │   └─ Enforced: ".concat(z10 == 0 ? "✓" : "✗"));
                                                    sx7.m18369g(ly6Var, str, null, "  ├─ Layer 2 (Canary Block):");
                                                    sx7.m18369g(ly6Var, str, null, "  │   ├─ thequran.com: ".concat(str13 != null ? "NXDOMAIN" : str13));
                                                    sx7.m18369g(ly6Var, str, null, "  │   └─ Blocked: ".concat(z11 == 0 ? "✓" : "✗"));
                                                    sx7.m18369g(ly6Var, str, null, "  └─ Kahf DNS Working: ".concat(z12 != 0 ? "✓" : "✗"));
                                                    if (z12 == 0) {
                                                    }
                                                    String str172 = (String) vq8Var.f44884u;
                                                    String str182 = (String) vq8Var.f44885v;
                                                    long currentTimeMillis22 = System.currentTimeMillis() - j9;
                                                    String str192 = str7;
                                                    sx7.m18369g(ly6Var, str, null, str192);
                                                    sx7.m18369g(ly6Var, str, null, "DIAGNOSTIC RESULT: " + str172);
                                                    sx7.m18369g(ly6Var, str, null, "  └─ " + str182);
                                                    sx7.m18369g(ly6Var, str, null, "  └─ Total Duration: " + currentTimeMillis22 + str9);
                                                    sx7.m18369g(ly6Var, str, null, str192);
                                                    return m13137e(j9, z9, z8, str8, z7, true, j8, true, j10, z12, str11, str12, z10, str13, z11, false, str172, str182);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    str = str3;
                                                    j2 = j11;
                                                    sx7 sx7Var322 = sx7.f39332a;
                                                    sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                                    return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                                }
                                            } catch (CancellationException e8) {
                                                e = e8;
                                                str = str14;
                                                ly6Var = ly6Var3;
                                                sx7 sx7Var222 = sx7.f39332a;
                                                sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                                                throw e;
                                            } catch (Exception e9) {
                                                e = e9;
                                                str = str14;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            str = str14;
                                            j11 = j6;
                                            j2 = j11;
                                            sx7 sx7Var3222 = sx7.f39332a;
                                            sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                            return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        str = str3;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    str = "DNS_TRACE";
                                    j2 = j19;
                                    sx7 sx7Var32222 = sx7.f39332a;
                                    sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                    return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            j2 = 1;
                            str10 = r5;
                            str = str10;
                            sx7 sx7Var322222 = sx7.f39332a;
                            sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                            return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                        }
                    } else {
                        str2 = "ms";
                        String str23 = "DNS_TRACE";
                        v11.m20244z(obj4);
                        try {
                            z = m13146k();
                            boolean m13143h = m13143h();
                            String m13142g = m13142g();
                            boolean m13144i = m13144i();
                            sx7 sx7Var6 = sx7.f39332a;
                            sx7.m18369g(ly6Var5, str23, null, "Network Layer:");
                            sx7.m18369g(ly6Var5, str23, null, "  ├─ Connected: " + z);
                            sx7.m18369g(ly6Var5, str23, null, "  ├─ Internet Capability: " + m13143h);
                            sx7.m18369g(ly6Var5, str23, null, "  ├─ Connection Type: ".concat(m13142g));
                            sx7.m18369g(ly6Var5, str23, null, "  └─ VPN Active: " + m13144i);
                            if (!z) {
                                sx7.m18369g(ly6Var5, str23, null, "Early exit: No network connection");
                                return m13137e(j, false, m13143h, m13142g, m13144i, false, 0L, false, -1L, false, null, null, false, null, false, false, "no_network", "Device not connected to any network");
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            f95 f95Var = dj3.f8146v;
                            str = str23;
                            ly6Var2 = ly6Var5;
                            try {
                                long m16843I = qr5.m16843I(3000L, hj3.MILLISECONDS);
                                str3 = str;
                                try {
                                    try {
                                        i48 i48Var = new i48(this, null, (byte) 6);
                                        l48Var.f23625C = m13142g;
                                        j2 = j;
                                        try {
                                            l48Var.f23630u = j2;
                                            l48Var.f23635z = z;
                                            l48Var.f23623A = m13143h;
                                            l48Var.f23624B = m13144i;
                                            l48Var.f23631v = currentTimeMillis3;
                                            l48Var.f23629G = 1;
                                            Object m13763Y = muc.m13763Y(m16843I, i48Var, l48Var);
                                            if (m13763Y == obj5) {
                                                return obj5;
                                            }
                                            z2 = m13144i;
                                            z3 = m13143h;
                                            j3 = j2;
                                            str4 = m13142g;
                                            j4 = currentTimeMillis3;
                                            obj = m13763Y;
                                        } catch (Exception e14) {
                                            e = e14;
                                            str = str3;
                                            sx7 sx7Var3222222 = sx7.f39332a;
                                            sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                            return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        j2 = j;
                                        str = str3;
                                        sx7 sx7Var32222222 = sx7.f39332a;
                                        sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                        return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                                    }
                                } catch (CancellationException e16) {
                                    e = e16;
                                    ly6Var = ly6Var2;
                                    str = str3;
                                    sx7 sx7Var2222 = sx7.f39332a;
                                    sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                                    throw e;
                                }
                            } catch (CancellationException e17) {
                                e = e17;
                                ly6Var = ly6Var2;
                                sx7 sx7Var22222 = sx7.f39332a;
                                sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                                throw e;
                            } catch (Exception e18) {
                                e = e18;
                                j2 = j;
                                sx7 sx7Var322222222 = sx7.f39332a;
                                sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                                return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                            }
                        } catch (Exception e19) {
                            e = e19;
                            j2 = j;
                            str10 = str23;
                            str = str10;
                            sx7 sx7Var3222222222 = sx7.f39332a;
                            sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
                            return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
                        }
                    }
                    boolean z25 = z;
                    Boolean bool = (Boolean) obj;
                    booleanValue = bool == null ? bool.booleanValue() : 0;
                    long currentTimeMillis4 = System.currentTimeMillis() - j4;
                    sx7 sx7Var7 = sx7.f39332a;
                    ly6Var4 = ly6Var2;
                    str = str3;
                    sx7.m18369g(ly6Var4, str, null, "Internet Layer:");
                    sx7.m18369g(ly6Var4, str, null, "  ├─ Direct Internet (1.1.1.1:443): " + booleanValue);
                    sx7.m18369g(ly6Var4, str, null, "  └─ Check Duration: " + currentTimeMillis4 + str2);
                    if (booleanValue != 0) {
                        sx7.m18369g(ly6Var4, str, null, "Early exit: No internet connectivity");
                        return m13137e(j3, z25, z3, str4, z2, false, currentTimeMillis4, false, -1L, false, null, null, false, null, false, false, "no_internet", "No internet connection (ISP/router issue)");
                    }
                    str7 = "═══════════════════════════════════════════════════════════════";
                    str3 = str;
                    str6 = str2;
                    j2 = j3;
                    String str24 = str4;
                    boolean z26 = z2;
                    boolean z27 = z3;
                    try {
                        j7 = System.currentTimeMillis();
                        ly6Var3 = ly6Var4;
                    } catch (CancellationException e20) {
                        e = e20;
                        ly6Var = ly6Var4;
                        str = str3;
                        sx7 sx7Var222222 = sx7.f39332a;
                        sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                        throw e;
                    }
                    try {
                        l48Var.f23625C = str24;
                        l48Var.f23630u = j2;
                        l48Var.f23635z = z25;
                        l48Var.f23623A = z27;
                        l48Var.f23624B = z26;
                        l48Var.f23631v = j4;
                        l48Var.f23626D = booleanValue ? 1 : 0;
                        l48Var.f23632w = currentTimeMillis4;
                        l48Var.f23633x = j7;
                        l48Var.f23629G = 2;
                        obj2 = m13147m("google.com", l48Var);
                        obj3 = obj5;
                        if (obj2 == obj3) {
                            return obj3;
                        }
                        z5 = z26;
                        z6 = z25;
                        z4 = z27;
                        j6 = j2;
                        j5 = currentTimeMillis4;
                        str5 = str24;
                        i = booleanValue;
                        if (obj2 == null) {
                        }
                        currentTimeMillis = System.currentTimeMillis() - j7;
                        sx7 sx7Var42 = sx7.f39332a;
                        str14 = str3;
                        ly6Var = ly6Var3;
                        sx7.m18369g(ly6Var, str14, null, "DNS Resolution Layer:");
                        sx7.m18369g(ly6Var, str14, null, "  ├─ Can Resolve DNS: " + z13);
                        StringBuilder sb2 = new StringBuilder("  └─ Resolution Time: ");
                        sb2.append(currentTimeMillis);
                        String str212 = str6;
                        sb2.append(str212);
                        sx7.m18369g(ly6Var, str14, null, sb2.toString());
                        if (z13) {
                        }
                    } catch (CancellationException e21) {
                        e = e21;
                        str = str3;
                        ly6Var = ly6Var3;
                        sx7 sx7Var2222222 = sx7.f39332a;
                        sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
                        throw e;
                    }
                }
            }
            sx7.m18369g(ly6Var4, str, null, "Internet Layer:");
            sx7.m18369g(ly6Var4, str, null, "  ├─ Direct Internet (1.1.1.1:443): " + booleanValue);
            sx7.m18369g(ly6Var4, str, null, "  └─ Check Duration: " + currentTimeMillis4 + str2);
            if (booleanValue != 0) {
            }
        } catch (CancellationException e22) {
            e = e22;
            ly6Var = ly6Var4;
            sx7 sx7Var22222222 = sx7.f39332a;
            sx7.m18369g(ly6Var, str, null, "runFullDiagnostics: Cancelled");
            throw e;
        } catch (Exception e23) {
            e = e23;
            j2 = j3;
            sx7 sx7Var32222222222 = sx7.f39332a;
            sj8.m18114z("runFullDiagnostics: Exception - ", e.getMessage(), ly6.f25312y, str, null);
            return m13136d(j2, e.getMessage(), jTCFTGKxOS.dKokuxOP + e.getMessage());
        }
        l48Var = new l48(this, za2Var);
        Object obj42 = l48Var.f23627E;
        r5 = l48Var.f23629G;
        ly6 ly6Var52 = ly6.f25309v;
        Object obj52 = qc2.f34309u;
        if (r5 == 0) {
        }
        boolean z252 = z;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
        }
        long currentTimeMillis42 = System.currentTimeMillis() - j4;
        sx7 sx7Var72 = sx7.f39332a;
        ly6Var4 = ly6Var2;
        str = str3;
    }
}
