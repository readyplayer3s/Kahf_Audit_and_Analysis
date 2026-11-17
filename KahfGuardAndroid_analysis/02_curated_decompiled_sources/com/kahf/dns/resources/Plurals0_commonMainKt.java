package com.kahf.dns.resources;

import com.kahf.dns.resources.Res;
import java.util.Map;
import p000.ep3;
import p000.kl6;
import p000.r2c;
import p000.r8a;
import p000.sj8;
import p000.u69;
import p000.v90;
import p000.zd8;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class Plurals0_commonMainKt {

    /* renamed from: MD */
    private static final String f6390MD = "composeResources/com.kahf.dns.resources/";
    private static final kl6 billing_period_months$delegate = new r2c(new zd8(17));
    private static final kl6 billing_period_weeks$delegate = new r2c(new zd8(18));
    private static final kl6 billing_period_years$delegate = new r2c(new zd8(19));

    public static final void _collectCommonMainPlurals0Resources(Map<String, u69> map) {
        map.getClass();
        Res.plurals pluralsVar = Res.plurals.INSTANCE;
        map.put("billing_period_months", getBilling_period_months(pluralsVar));
        map.put("billing_period_weeks", getBilling_period_weeks(pluralsVar));
        map.put("billing_period_years", getBilling_period_years(pluralsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u69 billing_period_months_delegate$lambda$0() {
        return new u69("plurals:billing_period_months", "billing_period_months", v90.m20558j0(new r8a[]{new r8a(sj8.m18108t("ar"), "composeResources/com.kahf.dns.resources/values-ar/strings.commonMain.cvr", 10L, 159L), new r8a(sj8.m18108t("bn"), "composeResources/com.kahf.dns.resources/values-bn/strings.commonMain.cvr", 10L, 73L), new r8a(sj8.m18108t("ms"), "composeResources/com.kahf.dns.resources/values-ms/strings.commonMain.cvr", 10L, 65L), new r8a(sj8.m18108t("tr"), "composeResources/com.kahf.dns.resources/values-tr/strings.commonMain.cvr", 10L, 57L), new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/values/strings.commonMain.cvr", 10L, 65L)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u69 billing_period_weeks_delegate$lambda$0() {
        return new u69("plurals:billing_period_weeks", "billing_period_weeks", v90.m20558j0(new r8a[]{new r8a(sj8.m18108t("ar"), "composeResources/com.kahf.dns.resources/values-ar/strings.commonMain.cvr", 170L, 190L), new r8a(sj8.m18108t("bn"), "composeResources/com.kahf.dns.resources/values-bn/strings.commonMain.cvr", 84L, 96L), new r8a(sj8.m18108t("ms"), "composeResources/com.kahf.dns.resources/values-ms/strings.commonMain.cvr", 76L, 64L), new r8a(sj8.m18108t("tr"), "composeResources/com.kahf.dns.resources/values-tr/strings.commonMain.cvr", 68L, 64L), new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/values/strings.commonMain.cvr", 76L, 64L)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u69 billing_period_years_delegate$lambda$0() {
        return new u69("plurals:billing_period_years", "billing_period_years", v90.m20558j0(new r8a[]{new r8a(sj8.m18108t("ar"), "composeResources/com.kahf.dns.resources/values-ar/strings.commonMain.cvr", 361L, 154L), new r8a(sj8.m18108t("bn"), "composeResources/com.kahf.dns.resources/values-bn/strings.commonMain.cvr", 181L, 72L), new r8a(sj8.m18108t("ms"), "composeResources/com.kahf.dns.resources/values-ms/strings.commonMain.cvr", 141L, 64L), new r8a(sj8.m18108t("tr"), "composeResources/com.kahf.dns.resources/values-tr/strings.commonMain.cvr", 133L, 60L), new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/values/strings.commonMain.cvr", 141L, 64L)}));
    }

    public static final u69 getBilling_period_months(Res.plurals pluralsVar) {
        pluralsVar.getClass();
        return (u69) billing_period_months$delegate.getValue();
    }

    public static final u69 getBilling_period_weeks(Res.plurals pluralsVar) {
        pluralsVar.getClass();
        return (u69) billing_period_weeks$delegate.getValue();
    }

    public static final u69 getBilling_period_years(Res.plurals pluralsVar) {
        pluralsVar.getClass();
        return (u69) billing_period_years$delegate.getValue();
    }
}
