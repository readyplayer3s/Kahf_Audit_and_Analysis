package com.kahf.dns.p015di.core;

import coil3.network.internal.UtilsKt;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p000.AbstractC0378gi;
import p000.C0381gl;
import p000.C0984wx;
import p000.C1058yx;
import p000.b1a;
import p000.d0a;
import p000.d4b;
import p000.dt2;
import p000.fc2;
import p000.fh6;
import p000.g5b;
import p000.h53;
import p000.jt8;
import p000.k83;
import p000.lo7;
import p000.mta;
import p000.muc;
import p000.nt8;
import p000.nu2;
import p000.oi2;
import p000.pr1;
import p000.ps1;
import p000.q0c;
import p000.rs0;
import p000.sx7;
import p000.sy0;
import p000.txc;
import p000.vu2;
import p000.xo3;
import p000.xs8;
import p000.yw6;
import p000.zg5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class NetworkModuleGraphQlKt {
    private static final lo7 networkModuleGraphQl;

    static {
        lo7 lo7Var = new lo7();
        networkModuleGraphQl$lambda$0(lo7Var);
        networkModuleGraphQl = lo7Var;
    }

    public static final lo7 getNetworkModuleGraphQl() {
        return networkModuleGraphQl;
    }

    private static final txc networkModuleGraphQl$lambda$0(lo7 lo7Var) {
        lo7Var.getClass();
        pr1.m15989w(new rs0(d4b.f7320C, d0a.m5838a(C1058yx.class), null, new fc2((byte) 12), fh6.f11979u), lo7Var);
        return txc.f41359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1058yx networkModuleGraphQl$lambda$0$0(mta mtaVar, xs8 xs8Var) {
        mtaVar.getClass();
        xs8Var.getClass();
        b1a b1aVar = (b1a) mtaVar.m13734b(d0a.m5838a(b1a.class));
        g5b g5bVar = (g5b) mtaVar.m13734b(d0a.m5838a(g5b.class));
        nt8 nt8Var = (nt8) mtaVar.m13734b(d0a.m5838a(nt8.class));
        PreferencesHelper preferencesHelper = (PreferencesHelper) mtaVar.m13737e(d0a.m5838a(PreferencesHelper.class), null, null);
        C0984wx c0984wx = new C0984wx();
        c0984wx.f47287i = AbstractC0378gi.m8670l().concat("/graphql");
        Collection collection = (List) c0984wx.f47286h;
        if (collection == null) {
            collection = xo3.f48775u;
        }
        c0984wx.f47286h = ps1.m16007F0(collection, new zg5(UtilsKt.CONTENT_TYPE, "application/json"));
        ((ArrayList) c0984wx.f47284f).add(new AuthInterceptor(g5bVar, preferencesHelper));
        byte b = 1;
        if (nt8Var != null) {
            C0984wx.m21740a(c0984wx, new h53(nt8Var, new C0381gl(nt8Var, (byte) 24), b));
        }
        if (g5bVar != null) {
            C0984wx.m21740a(c0984wx, new nu2(g5bVar, b));
        }
        if (b1aVar != null) {
            q0c m18375J = sy0.m18375J();
            vu2 vu2Var = k83.f21845a;
            C0984wx.m21740a(c0984wx, new h53(muc.m13765a(yw6.m23122r(m18375J, dt2.f8706v)), new NetworkModuleGraphQlKt$networkModuleGraphQl$1$1$1$2(b1aVar, null), (byte) 0));
        }
        C0984wx c0984wx2 = new C0984wx();
        LinkedHashMap linkedHashMap = ((oi2) c0984wx.f47279a).f30574a;
        LinkedHashMap linkedHashMap2 = ((oi2) c0984wx2.f47279a).f30574a;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
        ((ArrayList) c0984wx2.f47280b).addAll((ArrayList) c0984wx.f47280b);
        ((ArrayList) c0984wx2.f47281c).addAll((ArrayList) c0984wx.f47281c);
        ((ArrayList) c0984wx2.f47282d).addAll((ArrayList) c0984wx.f47282d);
        ((ArrayList) c0984wx2.f47283e).addAll((ArrayList) c0984wx.f47283e);
        c0984wx2.f47286h = (List) c0984wx.f47286h;
        c0984wx2.f47287i = (String) c0984wx.f47287i;
        ArrayList arrayList = (ArrayList) c0984wx.f47285g;
        ArrayList arrayList2 = (ArrayList) c0984wx2.f47284f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        C1058yx c1058yx = new C1058yx(c0984wx2);
        sx7.m18367e(sx7.f39332a, "Apollo Client created with auth interceptor", null, 6);
        return c1058yx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txc networkModuleGraphQl$lambda$0$0$0$0(nt8 nt8Var) {
        nt8Var.m14463a(jt8.f21147x);
        return txc.f41359a;
    }
}
