package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class ti9 {

    /* renamed from: a */
    public final ge6 f40557a;

    /* renamed from: b */
    public final ConnectivityManager f40558b;

    /* renamed from: c */
    public gt5 f40559c;

    /* renamed from: d */
    public volatile String f40560d;

    /* renamed from: e */
    public volatile boolean f40561e;

    public ti9(Context context, ge6 ge6Var) {
        this.f40557a = ge6Var;
        this.f40558b = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
    }

    /* renamed from: a */
    public final void m18834a() {
        if (Build.VERSION.SDK_INT < 28 || this.f40559c != null) {
            return;
        }
        gt5 gt5Var = new gt5(this, (byte) 2);
        try {
            this.f40558b.registerDefaultNetworkCallback(gt5Var);
            this.f40559c = gt5Var;
        } catch (RuntimeException e) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25311x, "KG_SYNC", e, "[DNS_WATCH] could not register the network callback");
        }
    }

    /* renamed from: b */
    public final void m18835b() {
        gt5 gt5Var = this.f40559c;
        if (gt5Var == null) {
            return;
        }
        this.f40559c = null;
        try {
            this.f40558b.unregisterNetworkCallback(gt5Var);
        } catch (IllegalArgumentException e) {
            sx7 sx7Var = sx7.f39332a;
            sj8.m18114z("[DNS_WATCH] callback already unregistered: ", e.getMessage(), ly6.f25311x, "KG_SYNC", null);
        }
    }
}
