package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class gt5 extends ConnectivityManager.NetworkCallback {

    /* renamed from: c */
    public static final /* synthetic */ int f14913c = 0;

    /* renamed from: a */
    public final /* synthetic */ byte f14914a;

    /* renamed from: b */
    public final Object f14915b;

    public gt5(b40 b40Var) {
        this.f14914a = (byte) 0;
        this.f14915b = b40Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.f14914a) {
            case 1:
                network.getClass();
                if (network.equals(((x38) this.f14915b).f47589f.getActiveNetwork())) {
                    sy6 m18418c = sy6.m18418c();
                    String str = w38.f45629a;
                    m18418c.getClass();
                    x38 x38Var = (x38) this.f14915b;
                    Object obj = x38Var.f13582d;
                    if (obj == null) {
                        obj = x38Var.mo6530c();
                    }
                    v38 v38Var = (v38) obj;
                    x38 x38Var2 = (x38) this.f14915b;
                    synchronized (x38Var2.f47590g) {
                        if (x38Var2.f47591h == z) {
                            return;
                        }
                        x38Var2.f47591h = z;
                        ((x38) this.f14915b).m8397d(new v38(v38Var.f43662a, v38Var.f43663b, v38Var.f43664c, v38Var.f43665d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f14914a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                sy6 m18418c = sy6.m18418c();
                String str = bld.f3568a;
                m18418c.getClass();
                ((b40) this.f14915b).invoke(q72.f34051a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                sy6 m18418c2 = sy6.m18418c();
                String str2 = w38.f45629a;
                networkCapabilities.toString();
                m18418c2.getClass();
                x38 x38Var = (x38) this.f14915b;
                x38Var.m8397d(w38.m21065b(x38Var.f47589f, x38Var.f47591h));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        String privateDnsServerName;
        switch (this.f14914a) {
            case 2:
                network.getClass();
                linkProperties.getClass();
                privateDnsServerName = linkProperties.getPrivateDnsServerName();
                if (!((ti9) this.f14915b).f40561e || !zy5.m23838d(privateDnsServerName, ((ti9) this.f14915b).f40560d)) {
                    ((ti9) this.f14915b).f40561e = true;
                    ((ti9) this.f14915b).f40560d = privateDnsServerName;
                    sx7 sx7Var = sx7.f39332a;
                    ly6 ly6Var = ly6.f25309v;
                    if (privateDnsServerName == null) {
                        privateDnsServerName = "none";
                    }
                    sx7.m18369g(ly6Var, "KG_SYNC", null, "[DNS_WATCH] private DNS on the default network: ".concat(privateDnsServerName));
                    ((ti9) this.f14915b).f40557a.invoke();
                    break;
                }
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        byte b = this.f14914a;
        Object obj = this.f14915b;
        switch (b) {
            case 0:
                network.getClass();
                sy6 m18418c = sy6.m18418c();
                String str = bld.f3568a;
                m18418c.getClass();
                ((b40) obj).invoke(new r72(7));
                break;
            case 1:
                network.getClass();
                sy6 m18418c2 = sy6.m18418c();
                String str2 = w38.f45629a;
                m18418c2.getClass();
                ((x38) obj).m8397d(new v38(false, false, false, false, false));
                break;
            default:
                super.onLost(network);
                break;
        }
    }

    public /* synthetic */ gt5(Object obj, byte b) {
        this.f14914a = b;
        this.f14915b = obj;
    }
}
