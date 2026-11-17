package com.kahf.dns.resources;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.C0809s6;
import p000.ci3;
import p000.gtb;
import p000.hh4;
import p000.kl6;
import p000.r2c;
import p000.u69;
import p000.wsb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class ActualResourceCollectorsKt {
    private static final kl6 allDrawableResources$delegate = new r2c(new C0809s6(4));
    private static final kl6 allStringResources$delegate = new r2c(new C0809s6(5));
    private static final kl6 allStringArrayResources$delegate = new r2c(new C0809s6(6));
    private static final kl6 allPluralStringResources$delegate = new r2c(new C0809s6(7));
    private static final kl6 allFontResources$delegate = new r2c(new C0809s6(8));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allDrawableResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Drawable0_commonMainKt._collectCommonMainDrawable0Resources(linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allFontResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Font0_commonMainKt._collectCommonMainFont0Resources(linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allPluralStringResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Plurals0_commonMainKt._collectCommonMainPlurals0Resources(linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allStringArrayResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Array0_commonMainKt._collectCommonMainArray0Resources(linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allStringResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String0_commonMainKt._collectCommonMainString0Resources(linkedHashMap);
        String10_commonMainKt._collectCommonMainString10Resources(linkedHashMap);
        String11_commonMainKt._collectCommonMainString11Resources(linkedHashMap);
        String12_commonMainKt._collectCommonMainString12Resources(linkedHashMap);
        String13_commonMainKt._collectCommonMainString13Resources(linkedHashMap);
        String14_commonMainKt._collectCommonMainString14Resources(linkedHashMap);
        String15_commonMainKt._collectCommonMainString15Resources(linkedHashMap);
        String1_commonMainKt._collectCommonMainString1Resources(linkedHashMap);
        String2_commonMainKt._collectCommonMainString2Resources(linkedHashMap);
        String3_commonMainKt._collectCommonMainString3Resources(linkedHashMap);
        String4_commonMainKt._collectCommonMainString4Resources(linkedHashMap);
        String5_commonMainKt._collectCommonMainString5Resources(linkedHashMap);
        String6_commonMainKt._collectCommonMainString6Resources(linkedHashMap);
        String7_commonMainKt._collectCommonMainString7Resources(linkedHashMap);
        String8_commonMainKt._collectCommonMainString8Resources(linkedHashMap);
        String9_commonMainKt._collectCommonMainString9Resources(linkedHashMap);
        return linkedHashMap;
    }

    public static final Map<String, ci3> getAllDrawableResources(Res res) {
        res.getClass();
        return (Map) allDrawableResources$delegate.getValue();
    }

    public static final Map<String, hh4> getAllFontResources(Res res) {
        res.getClass();
        return (Map) allFontResources$delegate.getValue();
    }

    public static final Map<String, u69> getAllPluralStringResources(Res res) {
        res.getClass();
        return (Map) allPluralStringResources$delegate.getValue();
    }

    public static final Map<String, wsb> getAllStringArrayResources(Res res) {
        res.getClass();
        return (Map) allStringArrayResources$delegate.getValue();
    }

    public static final Map<String, gtb> getAllStringResources(Res res) {
        res.getClass();
        return (Map) allStringResources$delegate.getValue();
    }
}
