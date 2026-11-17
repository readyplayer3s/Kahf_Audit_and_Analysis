package com.kahf.dns.resources;

import com.kahf.dns.resources.Res;
import java.util.Map;
import p000.af2;
import p000.ep3;
import p000.hh4;
import p000.kl6;
import p000.r2c;
import p000.r8a;
import p000.yh3;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class Font0_commonMainKt {

    /* renamed from: MD */
    private static final String f6389MD = "composeResources/com.kahf.dns.resources/";
    private static final kl6 anek$delegate = new r2c(new yh3(10));
    private static final kl6 axiforma_medium$delegate = new r2c(new yh3(11));
    private static final kl6 axiforma_regular$delegate = new r2c(new yh3(12));
    private static final kl6 axiforma_semibold$delegate = new r2c(new yh3(13));
    private static final kl6 dm$delegate = new r2c(new yh3(14));
    private static final kl6 noto$delegate = new r2c(new yh3(15));

    public static final void _collectCommonMainFont0Resources(Map<String, hh4> map) {
        map.getClass();
        Res.font fontVar = Res.font.INSTANCE;
        map.put("anek", getAnek(fontVar));
        map.put("axiforma_medium", getAxiforma_medium(fontVar));
        map.put("axiforma_regular", getAxiforma_regular(fontVar));
        map.put("axiforma_semibold", getAxiforma_semibold(fontVar));
        map.put("dm", getDm(fontVar));
        map.put("noto", getNoto(fontVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 anek_delegate$lambda$0() {
        return new hh4("font:anek", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/anek.ttf", -1L, -1L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 axiforma_medium_delegate$lambda$0() {
        return new hh4("font:axiforma_medium", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/axiforma_medium.ttf", -1L, -1L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 axiforma_regular_delegate$lambda$0() {
        return new hh4("font:axiforma_regular", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/axiforma_regular.ttf", -1L, -1L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 axiforma_semibold_delegate$lambda$0() {
        return new hh4("font:axiforma_semibold", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/axiforma_semibold.ttf", -1L, -1L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 dm_delegate$lambda$0() {
        return new hh4("font:dm", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/dm.ttf", -1L, -1L)));
    }

    public static final hh4 getAnek(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) anek$delegate.getValue();
    }

    public static final hh4 getAxiforma_medium(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) axiforma_medium$delegate.getValue();
    }

    public static final hh4 getAxiforma_regular(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) axiforma_regular$delegate.getValue();
    }

    public static final hh4 getAxiforma_semibold(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) axiforma_semibold$delegate.getValue();
    }

    public static final hh4 getDm(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) dm$delegate.getValue();
    }

    public static final hh4 getNoto(Res.font fontVar) {
        fontVar.getClass();
        return (hh4) noto$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hh4 noto_delegate$lambda$0() {
        return new hh4("font:noto", af2.m530C(new r8a(ep3.f10423u, "composeResources/com.kahf.dns.resources/font/noto.ttf", -1L, -1L)));
    }
}
