package com.kahf.dns.resources;

import com.kahf.dns.resources.Res;
import java.util.Map;
import p000.C0243cu;
import p000.ep3;
import p000.kl6;
import p000.r2c;
import p000.r8a;
import p000.sj8;
import p000.v90;
import p000.wsb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class Array0_commonMainKt {

    /* renamed from: MD */
    private static final String f6387MD = "composeResources/com.kahf.dns.resources/";
    private static final kl6 themes$delegate = new r2c(new C0243cu(18));

    public static final void _collectCommonMainArray0Resources(Map<String, wsb> map) {
        map.getClass();
        map.put("themes", getThemes(Res.array.INSTANCE));
    }

    public static final wsb getThemes(Res.array arrayVar) {
        arrayVar.getClass();
        return (wsb) themes$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wsb themes_delegate$lambda$0() {
        return new wsb("string-array:themes", v90.m20558j0(new r8a[]{new r8a(sj8.m18108t("ar"), "composeResources/com.kahf.dns.resources/values-ar/strings.commonMain.cvr", 516L, 130L), new r8a(sj8.m18108t("bn"), "composeResources/com.kahf.dns.resources/values-bn/strings.commonMain.cvr", 254L, 74L), new r8a(sj8.m18108t("ms"), "composeResources/com.kahf.dns.resources/values-ms/strings.commonMain.cvr", 206L, 70L), new r8a(sj8.m18108t("tr"), "composeResources/com.kahf.dns.resources/values-tr/strings.commonMain.cvr", 194L, 78L), new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/values/strings.commonMain.cvr", 206L, 74L)}));
    }
}
