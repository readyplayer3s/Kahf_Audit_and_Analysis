package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import android.p001os.p002hz.gcwXtavsqv;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: wi */
/* loaded from: classes.dex */
public final class C0969wi extends s1c implements jm4 {

    /* renamed from: u */
    public ConnectivityManager f46558u;

    /* renamed from: v */
    public int f46559v;

    /* renamed from: w */
    public boolean f46560w;

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new C0969wi(2, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        return ((C0969wi) create((pc2) obj, (xa2) obj2)).invokeSuspend(txc.f41359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        r0 = r0.getPrivateDnsServerName();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0010, B:9:0x0078, B:13:0x004a, B:19:0x007f, B:20:0x00b2, B:22:0x00b8, B:25:0x00c4, B:28:0x00ca, B:34:0x00d1, B:40:0x00e9, B:42:0x00ef, B:44:0x00f7, B:46:0x00fd, B:49:0x0104, B:51:0x011b, B:56:0x0022, B:58:0x002f, B:59:0x0123), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0010, B:9:0x0078, B:13:0x004a, B:19:0x007f, B:20:0x00b2, B:22:0x00b8, B:25:0x00c4, B:28:0x00ca, B:34:0x00d1, B:40:0x00e9, B:42:0x00ef, B:44:0x00f7, B:46:0x00fd, B:49:0x0104, B:51:0x011b, B:56:0x0022, B:58:0x002f, B:59:0x0123), top: B:2:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0075 -> B:8:0x0014). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        int i;
        String privateDnsServerName;
        String privateDnsServerName2;
        boolean z = this.f46560w;
        String str = gcwXtavsqv.BdvYmldOsmCirqe;
        try {
            if (!z) {
                v11.m20244z(obj);
                sx7 sx7Var = sx7.f39332a;
                sx7.m18364b(sx7Var, "Getting current DNS configuration", str, 2);
                if (Build.VERSION.SDK_INT < 28) {
                    sx7.m18364b(sx7Var, "Private DNS not supported below Android 9", str, 2);
                    return null;
                }
                Object systemService = sa2.f38142u.m17960c().getSystemService("connectivity");
                systemService.getClass();
                connectivityManager = (ConnectivityManager) systemService;
                activeNetwork = connectivityManager.getActiveNetwork();
                i = 0;
                if (activeNetwork == null) {
                }
                if (activeNetwork != null) {
                }
            } else {
                if (!z) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.f46559v;
                ConnectivityManager connectivityManager2 = this.f46558u;
                v11.m20244z(obj);
                connectivityManager = connectivityManager2;
                i = i2;
                activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || i >= 3) {
                    if (activeNetwork != null) {
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                        if (linkProperties == null) {
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18370h(2, "No link properties found", str);
                            return null;
                        }
                        privateDnsServerName = linkProperties.getPrivateDnsServerName();
                        if (privateDnsServerName != null && privateDnsServerName.length() != 0) {
                            sx7.m18367e(sx7.f39332a, "Current DNS: " + privateDnsServerName, str, 2);
                            return privateDnsServerName;
                        }
                        sx7.m18364b(sx7.f39332a, "Private DNS is not explicitly set", str, 2);
                        return null;
                    }
                    sx7 sx7Var3 = sx7.f39332a;
                    sx7.m18370h(2, "No active network found after retries", str);
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    allNetworks.getClass();
                    List m20556h0 = v90.m20556h0(allNetworks);
                    sx7.m18364b(sx7Var3, "Trying fallback: checking " + m20556h0.size() + " registered networks", str, 2);
                    Iterator it = m20556h0.iterator();
                    while (it.hasNext()) {
                        LinkProperties linkProperties2 = connectivityManager.getLinkProperties((Network) it.next());
                        if (linkProperties2 != null && privateDnsServerName2 != null && privateDnsServerName2.length() != 0) {
                            sx7.m18367e(sx7.f39332a, "Found DNS via fallback: " + privateDnsServerName2, str, 2);
                            return privateDnsServerName2;
                        }
                    }
                    return null;
                }
                i2 = i + 1;
                sx7 sx7Var4 = sx7.f39332a;
                sx7.m18370h(2, "Active network is null (attempt " + i2 + "/3), retrying...", str);
                this.f46558u = connectivityManager;
                this.f46559v = i2;
                this.f46560w = true;
                Object m9891G = i30.m9891G(100L, this);
                qc2 qc2Var = qc2.f34309u;
                if (m9891G == qc2Var) {
                    return qc2Var;
                }
                i = i2;
                activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                }
                if (activeNetwork != null) {
                }
            }
        } catch (Exception e) {
            sx7 sx7Var5 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, str, e, sj8.m18102n("Error getting current DNS: ", e.getMessage()));
            return null;
        }
    }
}
