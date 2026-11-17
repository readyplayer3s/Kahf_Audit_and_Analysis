package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.JoF.wfBxRVkDOVdoPZ;
import com.facebook.internal.p012Lq.hqZLxhHl;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class rp9 {

    /* renamed from: d */
    public static final Set f37067d = v90.m20558j0(new String[]{"is_kahf_dns_set", "dns_change_prevention_enabled", "uninstall_prevention_enabled", "super_uninstall_protection_enabled", "youtube_shorts_enabled", "instagram_reels_enabled", "facebook_reels_enabled", "telegram_search_enabled", "whatsapp_status_enabled", "block_youtube_enabled", "block_facebook_enabled", "block_instagram_enabled", "block_telegram_enabled", "block_whatsapp_enabled", "group_social_media_enabled", wfBxRVkDOVdoPZ.ZberufqsA, "custom_app_blocker_enabled", "custom_site_blocker_enabled", "usage_limit_block_enabled", "risky_word_block_enabled", "mindful_pause_enabled", "new_app_approval_enabled", "prayer_silence_any_enabled"});

    /* renamed from: a */
    public final PreferencesHelper f37068a;

    /* renamed from: b */
    public final fb3 f37069b;

    /* renamed from: c */
    public final gb6 f37070c;

    public rp9(PreferencesHelper preferencesHelper, fb3 fb3Var) {
        preferencesHelper.getClass();
        fb3Var.getClass();
        this.f37068a = preferencesHelper;
        this.f37069b = fb3Var;
        this.f37070c = ozd.m15425a(new bv8((byte) 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17488a(Context context, boolean z, za2 za2Var) {
        pp9 pp9Var;
        int i;
        if (za2Var instanceof pp9) {
            pp9Var = (pp9) za2Var;
            int i2 = pp9Var.f33006w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pp9Var.f33006w = i2 - Integer.MIN_VALUE;
                Object obj = pp9Var.f33004u;
                i = pp9Var.f33006w;
                if (i != 0) {
                    v11.m20244z(obj);
                    pp9Var.f33006w = 1;
                    obj = m17489b(context, z, pp9Var);
                    Object obj2 = qc2.f34309u;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                return ((mp9) obj).m13656a();
            }
        }
        pp9Var = new pp9(this, za2Var);
        Object obj3 = pp9Var.f33004u;
        i = pp9Var.f33006w;
        if (i != 0) {
        }
        return ((mp9) obj3).m13656a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:94|95|96|(1:98)(1:192)|99|(1:101)(1:191)|102|(1:104)(1:190)|105|(1:107)(1:189)|108|(1:110)(1:188)|111|(1:113)(1:187)|114|(3:170|(4:173|(3:182|183|184)|178|171)|186)(1:118)|119|120|(1:169)(1:124)|125|(3:126|127|(1:129)(1:167))|(13:131|132|133|134|(1:136)(1:163)|(11:138|139|140|141|(6:143|144|(4:147|(3:149|150|151)(1:153)|152|145)|154|155|156)|158|144|(1:145)|154|155|156)|162|158|144|(1:145)|154|155|156)|166|132|133|134|(0)(0)|(0)|162|158|144|(1:145)|154|155|156) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0767 A[Catch: Exception -> 0x0777, TryCatch #6 {Exception -> 0x0777, blocks: (B:127:0x075d, B:129:0x0767, B:131:0x076e), top: B:126:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x076e A[Catch: Exception -> 0x0777, TRY_LEAVE, TryCatch #6 {Exception -> 0x0777, blocks: (B:127:0x075d, B:129:0x0767, B:131:0x076e), top: B:126:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x078f A[Catch: Exception -> 0x07ae, TryCatch #1 {Exception -> 0x07ae, blocks: (B:134:0x0785, B:136:0x078f, B:138:0x0796), top: B:133:0x0785 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0796 A[Catch: Exception -> 0x07ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x07ae, blocks: (B:134:0x0785, B:136:0x078f, B:138:0x0796), top: B:133:0x0785 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0547 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x057a A[Catch: Exception -> 0x059a, TryCatch #11 {Exception -> 0x059a, blocks: (B:204:0x0564, B:208:0x057a, B:209:0x057f, B:211:0x0585, B:214:0x0591, B:220:0x0596, B:221:0x0599), top: B:203:0x0564 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x023c A[Catch: Exception -> 0x025a, TryCatch #12 {Exception -> 0x025a, blocks: (B:51:0x01ff, B:59:0x0230, B:248:0x023c, B:250:0x0246, B:252:0x024c, B:254:0x0254, B:256:0x025d, B:257:0x0261, B:259:0x0267), top: B:50:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00a0 A[Catch: Exception -> 0x00ad, TryCatch #3 {Exception -> 0x00ad, blocks: (B:22:0x0093, B:25:0x00a6, B:286:0x00a0, B:288:0x00b0, B:291:0x00ed, B:294:0x0116, B:297:0x013e, B:298:0x011e, B:299:0x0123, B:301:0x0129, B:304:0x0135, B:310:0x013a, B:311:0x013d, B:314:0x00f5, B:315:0x00fa, B:317:0x0100, B:319:0x010c, B:322:0x0112, B:323:0x0115, B:328:0x00cd, B:329:0x00d2, B:331:0x00d8, B:334:0x00e4, B:340:0x00e9, B:341:0x00ec), top: B:21:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x011e A[Catch: Exception -> 0x00ad, TryCatch #3 {Exception -> 0x00ad, blocks: (B:22:0x0093, B:25:0x00a6, B:286:0x00a0, B:288:0x00b0, B:291:0x00ed, B:294:0x0116, B:297:0x013e, B:298:0x011e, B:299:0x0123, B:301:0x0129, B:304:0x0135, B:310:0x013a, B:311:0x013d, B:314:0x00f5, B:315:0x00fa, B:317:0x0100, B:319:0x010c, B:322:0x0112, B:323:0x0115, B:328:0x00cd, B:329:0x00d2, B:331:0x00d8, B:334:0x00e4, B:340:0x00e9, B:341:0x00ec), top: B:21:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00f5 A[Catch: Exception -> 0x00ad, TryCatch #3 {Exception -> 0x00ad, blocks: (B:22:0x0093, B:25:0x00a6, B:286:0x00a0, B:288:0x00b0, B:291:0x00ed, B:294:0x0116, B:297:0x013e, B:298:0x011e, B:299:0x0123, B:301:0x0129, B:304:0x0135, B:310:0x013a, B:311:0x013d, B:314:0x00f5, B:315:0x00fa, B:317:0x0100, B:319:0x010c, B:322:0x0112, B:323:0x0115, B:328:0x00cd, B:329:0x00d2, B:331:0x00d8, B:334:0x00e4, B:340:0x00e9, B:341:0x00ec), top: B:21:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00cd A[Catch: Exception -> 0x00ad, TryCatch #3 {Exception -> 0x00ad, blocks: (B:22:0x0093, B:25:0x00a6, B:286:0x00a0, B:288:0x00b0, B:291:0x00ed, B:294:0x0116, B:297:0x013e, B:298:0x011e, B:299:0x0123, B:301:0x0129, B:304:0x0135, B:310:0x013a, B:311:0x013d, B:314:0x00f5, B:315:0x00fa, B:317:0x0100, B:319:0x010c, B:322:0x0112, B:323:0x0115, B:328:0x00cd, B:329:0x00d2, B:331:0x00d8, B:334:0x00e4, B:340:0x00e9, B:341:0x00ec), top: B:21:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0220 A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:53:0x0214, B:55:0x0220, B:58:0x022a), top: B:52:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02dc A[LOOP:2: B:74:0x02d6->B:76:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17489b(Context context, boolean z, za2 za2Var) {
        qp9 qp9Var;
        int i;
        Context context2;
        Object m8476a;
        String stringFromPreferences;
        op9 op9Var;
        int m15615D;
        Collection values;
        Iterator it;
        boolean z2;
        Throwable th;
        boolean z3;
        Iterator it2;
        ArrayList m11757a;
        boolean z4;
        boolean z5;
        vq8 vq8Var;
        vq8 vq8Var2;
        vq8 vq8Var3;
        vq8 vq8Var4;
        int i2;
        Collection values2;
        Iterator it3;
        int i3;
        boolean z6;
        vq8 vq8Var5;
        boolean z7;
        AppOpsManager appOpsManager;
        PowerManager powerManager;
        String stringFromPreferences2;
        List m18274n1;
        int i4;
        Boolean bool;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z8;
        String stringFromPreferences$default;
        String stringFromPreferences3;
        List list;
        int i5;
        int i6;
        int i7;
        gb6 gb6Var = this.f37070c;
        try {
            if (za2Var instanceof qp9) {
                qp9Var = (qp9) za2Var;
                int i8 = qp9Var.f35109x;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    qp9Var.f35109x = i8 - Integer.MIN_VALUE;
                    Object obj = qp9Var.f35107v;
                    i = qp9Var.f35109x;
                    ly6 ly6Var = ly6.f25311x;
                    Throwable th2 = null;
                    PreferencesHelper preferencesHelper = this.f37068a;
                    if (i != 0) {
                        v11.m20244z(obj);
                        if (z) {
                            try {
                                fb3 fb3Var = this.f37069b;
                                context2 = context;
                                try {
                                    qp9Var.f35106u = context2;
                                    qp9Var.f35109x = 1;
                                    m8476a = ((gb3) fb3Var).m8476a(qp9Var);
                                    qc2 qc2Var = qc2.f34309u;
                                    if (m8476a == qc2Var) {
                                        return qc2Var;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    sx7 sx7Var = sx7.f39332a;
                                    sj8.m18114z("Failed to get current DNS: ", e.getMessage(), ly6Var, "ProtectionSync", null);
                                    stringFromPreferences = "unknown";
                                    if (stringFromPreferences.equals("unknown")) {
                                        stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
                                    } else {
                                        preferencesHelper.saveToPreferences(PrefKeys.LAST_KNOWN_DNS, stringFromPreferences);
                                    }
                                    String str = stringFromPreferences;
                                    boolean m18246L0 = stb.m18246L0(str, "kahf", true);
                                    stringFromPreferences3 = preferencesHelper.getStringFromPreferences("pref_blocked_apps_json", "[]");
                                    if (stringFromPreferences3.length() != 0) {
                                        list = (List) gb6Var.m22748a(new k90(iw0.Companion.serializer(), (byte) 0), stringFromPreferences3);
                                        int size = list.size();
                                        if (list.isEmpty()) {
                                        }
                                        if (list.isEmpty()) {
                                        }
                                        if (list.isEmpty()) {
                                        }
                                        op9Var = new op9(size, i5, i6, i7);
                                        List list2 = wd9.f46245b;
                                        m15615D = p97.m15615D(qs1.m16870Y(list2, 10));
                                        if (m15615D < 16) {
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(m15615D);
                                        while (r7.hasNext()) {
                                        }
                                        String stringFromPreferences4 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                                        values = linkedHashMap.values();
                                        if (values instanceof Collection) {
                                        }
                                        it = values.iterator();
                                        while (it.hasNext()) {
                                        }
                                        z2 = false;
                                        boolean m5891A = d4b.f7318A.m22547b(context2).m5891A();
                                        String str2 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                                        String string = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                                        bool = Boolean.valueOf(string == null && stb.m18246L0(string, str2, false));
                                        if (zy5.m23838d(bool, Boolean.TRUE)) {
                                        }
                                        z3 = true;
                                        List m11758b = k14.m11758b();
                                        ArrayList arrayList = new ArrayList();
                                        while (r4.hasNext()) {
                                        }
                                        op9 op9Var2 = op9Var;
                                        ArrayList arrayList2 = new ArrayList(qs1.m16870Y(arrayList, 10));
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                        }
                                        m11757a = k14.m11757a();
                                        if (!m11757a.isEmpty()) {
                                        }
                                        ul9 m17212i = ra7.m17212i(arrayList2, m18246L0, z2, z3, m5891A, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                                        vq8 vq8Var6 = new vq8("current_dns", str);
                                        vq8 vq8Var7 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L0));
                                        vq8 vq8Var8 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                                        vq8 vq8Var9 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                                        vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                                        vq8 vq8Var10 = new vq8("device_admin_granted", Boolean.valueOf(m5891A));
                                        vq8 vq8Var11 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                                        vq8 vq8Var12 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                                        vq8 vq8Var13 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                                        vq8 vq8Var14 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                                        vq8 vq8Var15 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                                        vq8 vq8Var16 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                                        vq8 vq8Var17 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                                        vq8 vq8Var18 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                                        vq8 vq8Var19 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                                        vq8 vq8Var20 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                                        vq8 vq8Var21 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                                        vq8 vq8Var22 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                                        vq8 vq8Var23 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                                        vq8 vq8Var24 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                                        vq8 vq8Var25 = new vq8("custom_app_blocker_count", new Integer(op9Var2.m15227d()));
                                        vq8 vq8Var26 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var2.m15225b() > 0));
                                        vq8 vq8Var27 = new vq8("quick_block_apps_count", new Integer(op9Var2.m15225b()));
                                        vq8 vq8Var28 = new vq8("always_block_enabled", Boolean.valueOf(op9Var2.m15224a() > 0));
                                        vq8 vq8Var29 = new vq8("always_block_apps_count", new Integer(op9Var2.m15224a()));
                                        vq8 vq8Var30 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var2.m15226c() > 0));
                                        vq8 vq8Var31 = new vq8("scheduled_block_apps_count", new Integer(op9Var2.m15226c()));
                                        vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                                        stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                        if (stringFromPreferences2.length() == 0) {
                                        }
                                    }
                                    op9Var = new op9(0, 0, 0, 0);
                                    List list22 = wd9.f46245b;
                                    m15615D = p97.m15615D(qs1.m16870Y(list22, 10));
                                    if (m15615D < 16) {
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(m15615D);
                                    while (r7.hasNext()) {
                                    }
                                    String stringFromPreferences42 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                                    values = linkedHashMap2.values();
                                    if (values instanceof Collection) {
                                    }
                                    it = values.iterator();
                                    while (it.hasNext()) {
                                    }
                                    z2 = false;
                                    boolean m5891A2 = d4b.f7318A.m22547b(context2).m5891A();
                                    String str22 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                                    String string2 = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                                    bool = Boolean.valueOf(string2 == null && stb.m18246L0(string2, str22, false));
                                    if (zy5.m23838d(bool, Boolean.TRUE)) {
                                    }
                                    z3 = true;
                                    List m11758b2 = k14.m11758b();
                                    ArrayList arrayList3 = new ArrayList();
                                    while (r4.hasNext()) {
                                    }
                                    op9 op9Var22 = op9Var;
                                    ArrayList arrayList22 = new ArrayList(qs1.m16870Y(arrayList3, 10));
                                    it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    m11757a = k14.m11757a();
                                    if (!m11757a.isEmpty()) {
                                    }
                                    ul9 m17212i2 = ra7.m17212i(arrayList22, m18246L0, z2, z3, m5891A2, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                                    vq8 vq8Var62 = new vq8("current_dns", str);
                                    vq8 vq8Var72 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L0));
                                    vq8 vq8Var82 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                                    vq8 vq8Var92 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                                    vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                                    vq8 vq8Var102 = new vq8("device_admin_granted", Boolean.valueOf(m5891A2));
                                    vq8 vq8Var112 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                                    vq8 vq8Var122 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                                    vq8 vq8Var132 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                                    vq8 vq8Var142 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                                    vq8 vq8Var152 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                                    vq8 vq8Var162 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                                    vq8 vq8Var172 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                                    vq8 vq8Var182 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                                    vq8 vq8Var192 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                                    vq8 vq8Var202 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                                    vq8 vq8Var212 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                                    vq8 vq8Var222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                                    vq8 vq8Var232 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                                    vq8 vq8Var242 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                                    vq8 vq8Var252 = new vq8("custom_app_blocker_count", new Integer(op9Var22.m15227d()));
                                    vq8 vq8Var262 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var22.m15225b() > 0));
                                    vq8 vq8Var272 = new vq8("quick_block_apps_count", new Integer(op9Var22.m15225b()));
                                    vq8 vq8Var282 = new vq8("always_block_enabled", Boolean.valueOf(op9Var22.m15224a() > 0));
                                    vq8 vq8Var292 = new vq8("always_block_apps_count", new Integer(op9Var22.m15224a()));
                                    vq8 vq8Var302 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var22.m15226c() > 0));
                                    vq8 vq8Var312 = new vq8("scheduled_block_apps_count", new Integer(op9Var22.m15226c()));
                                    vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                                    stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                    if (stringFromPreferences2.length() == 0) {
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                context2 = context;
                                sx7 sx7Var2 = sx7.f39332a;
                                sj8.m18114z("Failed to get current DNS: ", e.getMessage(), ly6Var, "ProtectionSync", null);
                                stringFromPreferences = "unknown";
                                if (stringFromPreferences.equals("unknown")) {
                                }
                                String str3 = stringFromPreferences;
                                boolean m18246L02 = stb.m18246L0(str3, "kahf", true);
                                stringFromPreferences3 = preferencesHelper.getStringFromPreferences("pref_blocked_apps_json", "[]");
                                if (stringFromPreferences3.length() != 0) {
                                }
                                op9Var = new op9(0, 0, 0, 0);
                                List list222 = wd9.f46245b;
                                m15615D = p97.m15615D(qs1.m16870Y(list222, 10));
                                if (m15615D < 16) {
                                }
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap(m15615D);
                                while (r7.hasNext()) {
                                }
                                String stringFromPreferences422 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                                values = linkedHashMap22.values();
                                if (values instanceof Collection) {
                                }
                                it = values.iterator();
                                while (it.hasNext()) {
                                }
                                z2 = false;
                                boolean m5891A22 = d4b.f7318A.m22547b(context2).m5891A();
                                String str222 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                                String string22 = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                                bool = Boolean.valueOf(string22 == null && stb.m18246L0(string22, str222, false));
                                if (zy5.m23838d(bool, Boolean.TRUE)) {
                                }
                                z3 = true;
                                List m11758b22 = k14.m11758b();
                                ArrayList arrayList32 = new ArrayList();
                                while (r4.hasNext()) {
                                }
                                op9 op9Var222 = op9Var;
                                ArrayList arrayList222 = new ArrayList(qs1.m16870Y(arrayList32, 10));
                                it2 = arrayList32.iterator();
                                while (it2.hasNext()) {
                                }
                                m11757a = k14.m11757a();
                                if (!m11757a.isEmpty()) {
                                }
                                ul9 m17212i22 = ra7.m17212i(arrayList222, m18246L02, z2, z3, m5891A22, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                                vq8 vq8Var622 = new vq8("current_dns", str3);
                                vq8 vq8Var722 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L02));
                                vq8 vq8Var822 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                                vq8 vq8Var922 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                                vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                                vq8 vq8Var1022 = new vq8("device_admin_granted", Boolean.valueOf(m5891A22));
                                vq8 vq8Var1122 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                                vq8 vq8Var1222 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                                vq8 vq8Var1322 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                                vq8 vq8Var1422 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                                vq8 vq8Var1522 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                                vq8 vq8Var1622 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                                vq8 vq8Var1722 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                                vq8 vq8Var1822 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                                vq8 vq8Var1922 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                                vq8 vq8Var2022 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                                vq8 vq8Var2122 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                                vq8 vq8Var2222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                                vq8 vq8Var2322 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                                vq8 vq8Var2422 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                                vq8 vq8Var2522 = new vq8("custom_app_blocker_count", new Integer(op9Var222.m15227d()));
                                vq8 vq8Var2622 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var222.m15225b() > 0));
                                vq8 vq8Var2722 = new vq8("quick_block_apps_count", new Integer(op9Var222.m15225b()));
                                vq8 vq8Var2822 = new vq8("always_block_enabled", Boolean.valueOf(op9Var222.m15224a() > 0));
                                vq8 vq8Var2922 = new vq8("always_block_apps_count", new Integer(op9Var222.m15224a()));
                                vq8 vq8Var3022 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var222.m15226c() > 0));
                                vq8 vq8Var3122 = new vq8("scheduled_block_apps_count", new Integer(op9Var222.m15226c()));
                                vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                                stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                if (stringFromPreferences2.length() == 0) {
                                }
                            }
                        } else {
                            context2 = context;
                            stringFromPreferences = preferencesHelper.getStringFromPreferences(PrefKeys.LAST_KNOWN_DNS, "unknown");
                            String str32 = stringFromPreferences;
                            boolean m18246L022 = stb.m18246L0(str32, "kahf", true);
                            stringFromPreferences3 = preferencesHelper.getStringFromPreferences("pref_blocked_apps_json", "[]");
                            if (stringFromPreferences3.length() != 0 && !stringFromPreferences3.equals("[]")) {
                                list = (List) gb6Var.m22748a(new k90(iw0.Companion.serializer(), (byte) 0), stringFromPreferences3);
                                int size2 = list.size();
                                if (list.isEmpty()) {
                                    Iterator it4 = list.iterator();
                                    i5 = 0;
                                    while (it4.hasNext()) {
                                        if (((iw0) it4.next()).f19061d == nw0.f28965u && (i5 = i5 + 1) < 0) {
                                            mv1.m13806S();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (list.isEmpty()) {
                                    Iterator it5 = list.iterator();
                                    i6 = 0;
                                    while (it5.hasNext()) {
                                        if (((iw0) it5.next()).f19061d == nw0.f28966v && (i6 = i6 + 1) < 0) {
                                            mv1.m13806S();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i6 = 0;
                                }
                                if (list.isEmpty()) {
                                    Iterator it6 = list.iterator();
                                    i7 = 0;
                                    while (it6.hasNext()) {
                                        if (((iw0) it6.next()).f19061d == nw0.f28967w && (i7 = i7 + 1) < 0) {
                                            mv1.m13806S();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i7 = 0;
                                }
                                op9Var = new op9(size2, i5, i6, i7);
                                List list2222 = wd9.f46245b;
                                m15615D = p97.m15615D(qs1.m16870Y(list2222, 10));
                                if (m15615D < 16) {
                                    m15615D = 16;
                                }
                                LinkedHashMap linkedHashMap222 = new LinkedHashMap(m15615D);
                                for (Object obj2 : list2222) {
                                    try {
                                        stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default(preferencesHelper, "salat_silence_time_" + ((String) obj2), null, 2, null);
                                    } catch (Exception unused) {
                                    }
                                    if (stringFromPreferences$default.length() > 0) {
                                        z8 = ((ipa) gb6Var.m22748a(ipa.Companion.serializer(), stringFromPreferences$default)).m10468e();
                                        linkedHashMap222.put(obj2, Boolean.valueOf(z8));
                                    }
                                    z8 = false;
                                    linkedHashMap222.put(obj2, Boolean.valueOf(z8));
                                }
                                String stringFromPreferences4222 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                                values = linkedHashMap222.values();
                                if ((values instanceof Collection) || !values.isEmpty()) {
                                    it = values.iterator();
                                    while (it.hasNext()) {
                                        if (((Boolean) it.next()).booleanValue()) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                boolean m5891A222 = d4b.f7318A.m22547b(context2).m5891A();
                                String str2222 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                                String string222 = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                                bool = Boolean.valueOf(string222 == null && stb.m18246L0(string222, str2222, false));
                                if (zy5.m23838d(bool, Boolean.TRUE)) {
                                    Object systemService = context2.getSystemService("accessibility");
                                    AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                                    if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(8)) != null && !enabledAccessibilityServiceList.isEmpty()) {
                                        Iterator<T> it7 = enabledAccessibilityServiceList.iterator();
                                        while (it7.hasNext()) {
                                            ServiceInfo serviceInfo = ((AccessibilityServiceInfo) it7.next()).getResolveInfo().serviceInfo;
                                            th = th2;
                                            try {
                                                if (!(serviceInfo.packageName + "/" + serviceInfo.name).equals(str2222)) {
                                                    th2 = th;
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    }
                                    th = th2;
                                    z3 = false;
                                    List m11758b222 = k14.m11758b();
                                    ArrayList arrayList322 = new ArrayList();
                                    for (Object obj3 : m11758b222) {
                                        op9 op9Var3 = op9Var;
                                        if (!k14.f21486x.contains(((j14) obj3).f19415a)) {
                                            arrayList322.add(obj3);
                                        }
                                        op9Var = op9Var3;
                                    }
                                    op9 op9Var2222 = op9Var;
                                    ArrayList arrayList2222 = new ArrayList(qs1.m16870Y(arrayList322, 10));
                                    it2 = arrayList322.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2222.add(Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(((j14) it2.next()).f19420f, false)));
                                    }
                                    m11757a = k14.m11757a();
                                    if (!m11757a.isEmpty()) {
                                        Iterator it8 = m11757a.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                z4 = false;
                                                z5 = false;
                                                break;
                                            }
                                            z4 = false;
                                            if (preferencesHelper.getBooleanFromPreferences(((j14) it8.next()).f19420f, false)) {
                                                z5 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        z4 = false;
                                        z5 = false;
                                    }
                                    ul9 m17212i222 = ra7.m17212i(arrayList2222, m18246L022, z2, z3, m5891A222, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                                    vq8 vq8Var6222 = new vq8("current_dns", str32);
                                    vq8 vq8Var7222 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L022));
                                    vq8 vq8Var8222 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                                    vq8 vq8Var9222 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                                    vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                                    vq8 vq8Var10222 = new vq8("device_admin_granted", Boolean.valueOf(m5891A222));
                                    vq8 vq8Var11222 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                                    vq8 vq8Var12222 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                                    vq8 vq8Var13222 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                                    vq8 vq8Var14222 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                                    vq8 vq8Var15222 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                                    vq8 vq8Var16222 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                                    vq8 vq8Var17222 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                                    vq8 vq8Var18222 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                                    vq8 vq8Var19222 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                                    vq8 vq8Var20222 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                                    vq8 vq8Var21222 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                                    vq8 vq8Var22222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                                    vq8 vq8Var23222 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                                    vq8 vq8Var24222 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                                    vq8 vq8Var25222 = new vq8("custom_app_blocker_count", new Integer(op9Var2222.m15227d()));
                                    vq8 vq8Var26222 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var2222.m15225b() > 0));
                                    vq8 vq8Var27222 = new vq8("quick_block_apps_count", new Integer(op9Var2222.m15225b()));
                                    vq8 vq8Var28222 = new vq8("always_block_enabled", Boolean.valueOf(op9Var2222.m15224a() > 0));
                                    vq8 vq8Var29222 = new vq8("always_block_apps_count", new Integer(op9Var2222.m15224a()));
                                    vq8 vq8Var30222 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var2222.m15226c() > 0));
                                    vq8 vq8Var31222 = new vq8("scheduled_block_apps_count", new Integer(op9Var2222.m15226c()));
                                    vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                                    stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                    if (stringFromPreferences2.length() == 0) {
                                        vq8Var3 = vq8Var2;
                                        vq8Var4 = vq8Var;
                                        i2 = 0;
                                        vq8 vq8Var32 = new vq8("custom_site_blocker_count", new Integer(i2));
                                        vq8 vq8Var33 = new vq8("usage_limit_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_usage_limit_block_enabled", false)));
                                        vq8 vq8Var34 = new vq8("risky_word_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_risky_word_block_enabled", false)));
                                        vq8 vq8Var35 = new vq8("mindful_pause_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_mindful_pause_enabled", false)));
                                        vq8 vq8Var36 = new vq8("new_app_approval_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_new_app_approval_enabled", false)));
                                        vq8 vq8Var37 = new vq8("app_limit_warning_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_limit_warning_enabled", true)));
                                        vq8 vq8Var38 = new vq8("app_limit_threshold_minutes", new Integer(preferencesHelper.getIntFromPreferences("pref_app_limit_threshold_minutes", 60)));
                                        vq8 vq8Var39 = new vq8("prayer_silence_any_enabled", Boolean.valueOf(z2));
                                        Boolean bool2 = (Boolean) linkedHashMap222.get("Fazr");
                                        vq8 vq8Var40 = new vq8("prayer_silence_fajr_enabled", Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                                        Boolean bool3 = (Boolean) linkedHashMap222.get("Duhr");
                                        vq8 vq8Var41 = new vq8("prayer_silence_dhuhr_enabled", Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
                                        Boolean bool4 = (Boolean) linkedHashMap222.get("Jum'a");
                                        vq8 vq8Var42 = new vq8("prayer_silence_juma_enabled", Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false));
                                        Boolean bool5 = (Boolean) linkedHashMap222.get("Asr");
                                        vq8 vq8Var43 = new vq8("prayer_silence_asr_enabled", Boolean.valueOf(bool5 != null ? bool5.booleanValue() : false));
                                        Boolean bool6 = (Boolean) linkedHashMap222.get("Maghrib");
                                        vq8 vq8Var44 = new vq8("prayer_silence_maghrib_enabled", Boolean.valueOf(bool6 != null ? bool6.booleanValue() : false));
                                        Boolean bool7 = (Boolean) linkedHashMap222.get("Isha");
                                        vq8 vq8Var45 = new vq8("prayer_silence_isha_enabled", Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false));
                                        values2 = linkedHashMap222.values();
                                        if ((values2 instanceof Collection) || !values2.isEmpty()) {
                                            it3 = values2.iterator();
                                            i3 = 0;
                                            while (it3.hasNext()) {
                                                if (((Boolean) it3.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                                                    mv1.m13806S();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i3 = 0;
                                        }
                                        vq8 vq8Var46 = new vq8("prayer_silence_enabled_count", new Integer(i3));
                                        vq8 vq8Var47 = new vq8("subscription_status", stringFromPreferences4222);
                                        vq8 vq8Var48 = new vq8("accessibility_service_enabled", Boolean.valueOf(z3));
                                        vq8 vq8Var49 = new vq8("notification_permission_granted", Boolean.valueOf(Build.VERSION.SDK_INT >= 33 || zy5.m23841g(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                                        try {
                                            Object systemService2 = context2.getSystemService("power");
                                            powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                                        } catch (Exception unused3) {
                                        }
                                        if (powerManager != null) {
                                            z6 = powerManager.isIgnoringBatteryOptimizations(context2.getPackageName());
                                            vq8 vq8Var50 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                            Object systemService3 = context2.getSystemService("appops");
                                            appOpsManager = !(systemService3 instanceof AppOpsManager) ? (AppOpsManager) systemService3 : null;
                                            if (appOpsManager != null) {
                                                vq8Var5 = vq8Var46;
                                                if (appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), context2.getPackageName()) == 0) {
                                                    z7 = true;
                                                    Map m14870G = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var32, vq8Var33, vq8Var34, vq8Var35, vq8Var36, vq8Var37, vq8Var38, vq8Var39, vq8Var40, vq8Var41, vq8Var42, vq8Var43, vq8Var44, vq8Var45, vq8Var5, vq8Var47, vq8Var48, vq8Var49, vq8Var50, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                    for (Map.Entry entry : m14870G.entrySet()) {
                                                        if (f37067d.contains((String) entry.getKey())) {
                                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                                        }
                                                    }
                                                    return new mp9(m14870G, m17212i222, linkedHashMap3);
                                                }
                                                z7 = false;
                                                Map m14870G2 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var32, vq8Var33, vq8Var34, vq8Var35, vq8Var36, vq8Var37, vq8Var38, vq8Var39, vq8Var40, vq8Var41, vq8Var42, vq8Var43, vq8Var44, vq8Var45, vq8Var5, vq8Var47, vq8Var48, vq8Var49, vq8Var50, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                                LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                                                while (r2.hasNext()) {
                                                }
                                                return new mp9(m14870G2, m17212i222, linkedHashMap32);
                                            }
                                            vq8Var5 = vq8Var46;
                                            z7 = false;
                                            Map m14870G22 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var32, vq8Var33, vq8Var34, vq8Var35, vq8Var36, vq8Var37, vq8Var38, vq8Var39, vq8Var40, vq8Var41, vq8Var42, vq8Var43, vq8Var44, vq8Var45, vq8Var5, vq8Var47, vq8Var48, vq8Var49, vq8Var50, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                            LinkedHashMap linkedHashMap322 = new LinkedHashMap();
                                            while (r2.hasNext()) {
                                            }
                                            return new mp9(m14870G22, m17212i222, linkedHashMap322);
                                        }
                                        z6 = false;
                                        vq8 vq8Var502 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                        Object systemService32 = context2.getSystemService("appops");
                                        if (!(systemService32 instanceof AppOpsManager)) {
                                        }
                                        if (appOpsManager != null) {
                                        }
                                        vq8Var5 = vq8Var46;
                                        z7 = false;
                                        Map m14870G222 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var32, vq8Var33, vq8Var34, vq8Var35, vq8Var36, vq8Var37, vq8Var38, vq8Var39, vq8Var40, vq8Var41, vq8Var42, vq8Var43, vq8Var44, vq8Var45, vq8Var5, vq8Var47, vq8Var48, vq8Var49, vq8Var502, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                        LinkedHashMap linkedHashMap3222 = new LinkedHashMap();
                                        while (r2.hasNext()) {
                                        }
                                        return new mp9(m14870G222, m17212i222, linkedHashMap3222);
                                    }
                                    try {
                                        vq8Var3 = vq8Var2;
                                        try {
                                            vq8Var4 = vq8Var;
                                        } catch (Exception unused4) {
                                            vq8Var4 = vq8Var;
                                            try {
                                                m18274n1 = stb.m18274n1(stringFromPreferences2, new String[]{",", "\n"}, 0, 6);
                                                if (m18274n1.isEmpty()) {
                                                    Iterator it9 = m18274n1.iterator();
                                                    i4 = 0;
                                                    while (it9.hasNext()) {
                                                        if (!stb.m18260Z0((String) it9.next()) && (i4 = i4 + 1) < 0) {
                                                            mv1.m13806S();
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    i4 = 0;
                                                }
                                                i2 = i4;
                                            } catch (Exception e3) {
                                                e = e3;
                                                sx7 sx7Var3 = sx7.f39332a;
                                                sj8.m18114z("Failed to count blocked sites: ", e.getMessage(), ly6Var, "ProtectionSync", th);
                                                i2 = 0;
                                                vq8 vq8Var322 = new vq8("custom_site_blocker_count", new Integer(i2));
                                                vq8 vq8Var332 = new vq8("usage_limit_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_usage_limit_block_enabled", false)));
                                                vq8 vq8Var342 = new vq8("risky_word_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_risky_word_block_enabled", false)));
                                                vq8 vq8Var352 = new vq8("mindful_pause_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_mindful_pause_enabled", false)));
                                                vq8 vq8Var362 = new vq8("new_app_approval_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_new_app_approval_enabled", false)));
                                                vq8 vq8Var372 = new vq8("app_limit_warning_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_limit_warning_enabled", true)));
                                                vq8 vq8Var382 = new vq8("app_limit_threshold_minutes", new Integer(preferencesHelper.getIntFromPreferences("pref_app_limit_threshold_minutes", 60)));
                                                vq8 vq8Var392 = new vq8("prayer_silence_any_enabled", Boolean.valueOf(z2));
                                                Boolean bool22 = (Boolean) linkedHashMap222.get("Fazr");
                                                vq8 vq8Var402 = new vq8("prayer_silence_fajr_enabled", Boolean.valueOf(bool22 != null ? bool22.booleanValue() : false));
                                                Boolean bool32 = (Boolean) linkedHashMap222.get("Duhr");
                                                vq8 vq8Var412 = new vq8("prayer_silence_dhuhr_enabled", Boolean.valueOf(bool32 != null ? bool32.booleanValue() : false));
                                                Boolean bool42 = (Boolean) linkedHashMap222.get("Jum'a");
                                                vq8 vq8Var422 = new vq8("prayer_silence_juma_enabled", Boolean.valueOf(bool42 != null ? bool42.booleanValue() : false));
                                                Boolean bool52 = (Boolean) linkedHashMap222.get("Asr");
                                                vq8 vq8Var432 = new vq8("prayer_silence_asr_enabled", Boolean.valueOf(bool52 != null ? bool52.booleanValue() : false));
                                                Boolean bool62 = (Boolean) linkedHashMap222.get("Maghrib");
                                                vq8 vq8Var442 = new vq8("prayer_silence_maghrib_enabled", Boolean.valueOf(bool62 != null ? bool62.booleanValue() : false));
                                                Boolean bool72 = (Boolean) linkedHashMap222.get("Isha");
                                                vq8 vq8Var452 = new vq8("prayer_silence_isha_enabled", Boolean.valueOf(bool72 != null ? bool72.booleanValue() : false));
                                                values2 = linkedHashMap222.values();
                                                if (values2 instanceof Collection) {
                                                }
                                                it3 = values2.iterator();
                                                i3 = 0;
                                                while (it3.hasNext()) {
                                                }
                                                vq8 vq8Var462 = new vq8("prayer_silence_enabled_count", new Integer(i3));
                                                vq8 vq8Var472 = new vq8("subscription_status", stringFromPreferences4222);
                                                vq8 vq8Var482 = new vq8("accessibility_service_enabled", Boolean.valueOf(z3));
                                                vq8 vq8Var492 = new vq8("notification_permission_granted", Boolean.valueOf(Build.VERSION.SDK_INT >= 33 || zy5.m23841g(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                                                Object systemService22 = context2.getSystemService("power");
                                                if (systemService22 instanceof PowerManager) {
                                                }
                                                if (powerManager != null) {
                                                }
                                                z6 = false;
                                                vq8 vq8Var5022 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                                Object systemService322 = context2.getSystemService("appops");
                                                if (!(systemService322 instanceof AppOpsManager)) {
                                                }
                                                if (appOpsManager != null) {
                                                }
                                                vq8Var5 = vq8Var462;
                                                z7 = false;
                                                Map m14870G2222 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var322, vq8Var332, vq8Var342, vq8Var352, vq8Var362, vq8Var372, vq8Var382, vq8Var392, vq8Var402, vq8Var412, vq8Var422, vq8Var432, vq8Var442, vq8Var452, vq8Var5, vq8Var472, vq8Var482, vq8Var492, vq8Var5022, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                                LinkedHashMap linkedHashMap32222 = new LinkedHashMap();
                                                while (r2.hasNext()) {
                                                }
                                                return new mp9(m14870G2222, m17212i222, linkedHashMap32222);
                                            }
                                            vq8 vq8Var3222 = new vq8("custom_site_blocker_count", new Integer(i2));
                                            vq8 vq8Var3322 = new vq8("usage_limit_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_usage_limit_block_enabled", false)));
                                            vq8 vq8Var3422 = new vq8("risky_word_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_risky_word_block_enabled", false)));
                                            vq8 vq8Var3522 = new vq8("mindful_pause_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_mindful_pause_enabled", false)));
                                            vq8 vq8Var3622 = new vq8("new_app_approval_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_new_app_approval_enabled", false)));
                                            vq8 vq8Var3722 = new vq8("app_limit_warning_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_limit_warning_enabled", true)));
                                            vq8 vq8Var3822 = new vq8("app_limit_threshold_minutes", new Integer(preferencesHelper.getIntFromPreferences("pref_app_limit_threshold_minutes", 60)));
                                            vq8 vq8Var3922 = new vq8("prayer_silence_any_enabled", Boolean.valueOf(z2));
                                            Boolean bool222 = (Boolean) linkedHashMap222.get("Fazr");
                                            vq8 vq8Var4022 = new vq8("prayer_silence_fajr_enabled", Boolean.valueOf(bool222 != null ? bool222.booleanValue() : false));
                                            Boolean bool322 = (Boolean) linkedHashMap222.get("Duhr");
                                            vq8 vq8Var4122 = new vq8("prayer_silence_dhuhr_enabled", Boolean.valueOf(bool322 != null ? bool322.booleanValue() : false));
                                            Boolean bool422 = (Boolean) linkedHashMap222.get("Jum'a");
                                            vq8 vq8Var4222 = new vq8("prayer_silence_juma_enabled", Boolean.valueOf(bool422 != null ? bool422.booleanValue() : false));
                                            Boolean bool522 = (Boolean) linkedHashMap222.get("Asr");
                                            vq8 vq8Var4322 = new vq8("prayer_silence_asr_enabled", Boolean.valueOf(bool522 != null ? bool522.booleanValue() : false));
                                            Boolean bool622 = (Boolean) linkedHashMap222.get("Maghrib");
                                            vq8 vq8Var4422 = new vq8("prayer_silence_maghrib_enabled", Boolean.valueOf(bool622 != null ? bool622.booleanValue() : false));
                                            Boolean bool722 = (Boolean) linkedHashMap222.get("Isha");
                                            vq8 vq8Var4522 = new vq8("prayer_silence_isha_enabled", Boolean.valueOf(bool722 != null ? bool722.booleanValue() : false));
                                            values2 = linkedHashMap222.values();
                                            if (values2 instanceof Collection) {
                                            }
                                            it3 = values2.iterator();
                                            i3 = 0;
                                            while (it3.hasNext()) {
                                            }
                                            vq8 vq8Var4622 = new vq8("prayer_silence_enabled_count", new Integer(i3));
                                            vq8 vq8Var4722 = new vq8("subscription_status", stringFromPreferences4222);
                                            vq8 vq8Var4822 = new vq8("accessibility_service_enabled", Boolean.valueOf(z3));
                                            vq8 vq8Var4922 = new vq8("notification_permission_granted", Boolean.valueOf(Build.VERSION.SDK_INT >= 33 || zy5.m23841g(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                                            Object systemService222 = context2.getSystemService("power");
                                            if (systemService222 instanceof PowerManager) {
                                            }
                                            if (powerManager != null) {
                                            }
                                            z6 = false;
                                            vq8 vq8Var50222 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                            Object systemService3222 = context2.getSystemService("appops");
                                            if (!(systemService3222 instanceof AppOpsManager)) {
                                            }
                                            if (appOpsManager != null) {
                                            }
                                            vq8Var5 = vq8Var4622;
                                            z7 = false;
                                            Map m14870G22222 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var3222, vq8Var3322, vq8Var3422, vq8Var3522, vq8Var3622, vq8Var3722, vq8Var3822, vq8Var3922, vq8Var4022, vq8Var4122, vq8Var4222, vq8Var4322, vq8Var4422, vq8Var4522, vq8Var5, vq8Var4722, vq8Var4822, vq8Var4922, vq8Var50222, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                            LinkedHashMap linkedHashMap322222 = new LinkedHashMap();
                                            while (r2.hasNext()) {
                                            }
                                            return new mp9(m14870G22222, m17212i222, linkedHashMap322222);
                                        }
                                        try {
                                            i2 = ((List) gb6Var.m22748a(new k90(mtb.f27069a, (byte) 0), stringFromPreferences2)).size();
                                        } catch (Exception unused5) {
                                            m18274n1 = stb.m18274n1(stringFromPreferences2, new String[]{",", "\n"}, 0, 6);
                                            if (m18274n1.isEmpty()) {
                                            }
                                            i2 = i4;
                                            vq8 vq8Var32222 = new vq8("custom_site_blocker_count", new Integer(i2));
                                            vq8 vq8Var33222 = new vq8("usage_limit_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_usage_limit_block_enabled", false)));
                                            vq8 vq8Var34222 = new vq8("risky_word_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_risky_word_block_enabled", false)));
                                            vq8 vq8Var35222 = new vq8("mindful_pause_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_mindful_pause_enabled", false)));
                                            vq8 vq8Var36222 = new vq8("new_app_approval_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_new_app_approval_enabled", false)));
                                            vq8 vq8Var37222 = new vq8("app_limit_warning_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_limit_warning_enabled", true)));
                                            vq8 vq8Var38222 = new vq8("app_limit_threshold_minutes", new Integer(preferencesHelper.getIntFromPreferences("pref_app_limit_threshold_minutes", 60)));
                                            vq8 vq8Var39222 = new vq8("prayer_silence_any_enabled", Boolean.valueOf(z2));
                                            Boolean bool2222 = (Boolean) linkedHashMap222.get("Fazr");
                                            vq8 vq8Var40222 = new vq8("prayer_silence_fajr_enabled", Boolean.valueOf(bool2222 != null ? bool2222.booleanValue() : false));
                                            Boolean bool3222 = (Boolean) linkedHashMap222.get("Duhr");
                                            vq8 vq8Var41222 = new vq8("prayer_silence_dhuhr_enabled", Boolean.valueOf(bool3222 != null ? bool3222.booleanValue() : false));
                                            Boolean bool4222 = (Boolean) linkedHashMap222.get("Jum'a");
                                            vq8 vq8Var42222 = new vq8("prayer_silence_juma_enabled", Boolean.valueOf(bool4222 != null ? bool4222.booleanValue() : false));
                                            Boolean bool5222 = (Boolean) linkedHashMap222.get("Asr");
                                            vq8 vq8Var43222 = new vq8("prayer_silence_asr_enabled", Boolean.valueOf(bool5222 != null ? bool5222.booleanValue() : false));
                                            Boolean bool6222 = (Boolean) linkedHashMap222.get("Maghrib");
                                            vq8 vq8Var44222 = new vq8("prayer_silence_maghrib_enabled", Boolean.valueOf(bool6222 != null ? bool6222.booleanValue() : false));
                                            Boolean bool7222 = (Boolean) linkedHashMap222.get("Isha");
                                            vq8 vq8Var45222 = new vq8("prayer_silence_isha_enabled", Boolean.valueOf(bool7222 != null ? bool7222.booleanValue() : false));
                                            values2 = linkedHashMap222.values();
                                            if (values2 instanceof Collection) {
                                            }
                                            it3 = values2.iterator();
                                            i3 = 0;
                                            while (it3.hasNext()) {
                                            }
                                            vq8 vq8Var46222 = new vq8("prayer_silence_enabled_count", new Integer(i3));
                                            vq8 vq8Var47222 = new vq8("subscription_status", stringFromPreferences4222);
                                            vq8 vq8Var48222 = new vq8("accessibility_service_enabled", Boolean.valueOf(z3));
                                            vq8 vq8Var49222 = new vq8("notification_permission_granted", Boolean.valueOf(Build.VERSION.SDK_INT >= 33 || zy5.m23841g(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                                            Object systemService2222 = context2.getSystemService("power");
                                            if (systemService2222 instanceof PowerManager) {
                                            }
                                            if (powerManager != null) {
                                            }
                                            z6 = false;
                                            vq8 vq8Var502222 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                            Object systemService32222 = context2.getSystemService("appops");
                                            if (!(systemService32222 instanceof AppOpsManager)) {
                                            }
                                            if (appOpsManager != null) {
                                            }
                                            vq8Var5 = vq8Var46222;
                                            z7 = false;
                                            Map m14870G222222 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var32222, vq8Var33222, vq8Var34222, vq8Var35222, vq8Var36222, vq8Var37222, vq8Var38222, vq8Var39222, vq8Var40222, vq8Var41222, vq8Var42222, vq8Var43222, vq8Var44222, vq8Var45222, vq8Var5, vq8Var47222, vq8Var48222, vq8Var49222, vq8Var502222, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                            LinkedHashMap linkedHashMap3222222 = new LinkedHashMap();
                                            while (r2.hasNext()) {
                                            }
                                            return new mp9(m14870G222222, m17212i222, linkedHashMap3222222);
                                        }
                                    } catch (Exception unused6) {
                                        vq8Var3 = vq8Var2;
                                    }
                                    vq8 vq8Var322222 = new vq8("custom_site_blocker_count", new Integer(i2));
                                    vq8 vq8Var332222 = new vq8("usage_limit_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_usage_limit_block_enabled", false)));
                                    vq8 vq8Var342222 = new vq8("risky_word_block_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_risky_word_block_enabled", false)));
                                    vq8 vq8Var352222 = new vq8("mindful_pause_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_mindful_pause_enabled", false)));
                                    vq8 vq8Var362222 = new vq8("new_app_approval_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_new_app_approval_enabled", false)));
                                    vq8 vq8Var372222 = new vq8("app_limit_warning_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_limit_warning_enabled", true)));
                                    vq8 vq8Var382222 = new vq8("app_limit_threshold_minutes", new Integer(preferencesHelper.getIntFromPreferences("pref_app_limit_threshold_minutes", 60)));
                                    vq8 vq8Var392222 = new vq8("prayer_silence_any_enabled", Boolean.valueOf(z2));
                                    Boolean bool22222 = (Boolean) linkedHashMap222.get("Fazr");
                                    vq8 vq8Var402222 = new vq8("prayer_silence_fajr_enabled", Boolean.valueOf(bool22222 != null ? bool22222.booleanValue() : false));
                                    Boolean bool32222 = (Boolean) linkedHashMap222.get("Duhr");
                                    vq8 vq8Var412222 = new vq8("prayer_silence_dhuhr_enabled", Boolean.valueOf(bool32222 != null ? bool32222.booleanValue() : false));
                                    Boolean bool42222 = (Boolean) linkedHashMap222.get("Jum'a");
                                    vq8 vq8Var422222 = new vq8("prayer_silence_juma_enabled", Boolean.valueOf(bool42222 != null ? bool42222.booleanValue() : false));
                                    Boolean bool52222 = (Boolean) linkedHashMap222.get("Asr");
                                    vq8 vq8Var432222 = new vq8("prayer_silence_asr_enabled", Boolean.valueOf(bool52222 != null ? bool52222.booleanValue() : false));
                                    Boolean bool62222 = (Boolean) linkedHashMap222.get("Maghrib");
                                    vq8 vq8Var442222 = new vq8("prayer_silence_maghrib_enabled", Boolean.valueOf(bool62222 != null ? bool62222.booleanValue() : false));
                                    Boolean bool72222 = (Boolean) linkedHashMap222.get("Isha");
                                    vq8 vq8Var452222 = new vq8("prayer_silence_isha_enabled", Boolean.valueOf(bool72222 != null ? bool72222.booleanValue() : false));
                                    values2 = linkedHashMap222.values();
                                    if (values2 instanceof Collection) {
                                    }
                                    it3 = values2.iterator();
                                    i3 = 0;
                                    while (it3.hasNext()) {
                                    }
                                    vq8 vq8Var462222 = new vq8("prayer_silence_enabled_count", new Integer(i3));
                                    vq8 vq8Var472222 = new vq8("subscription_status", stringFromPreferences4222);
                                    vq8 vq8Var482222 = new vq8("accessibility_service_enabled", Boolean.valueOf(z3));
                                    vq8 vq8Var492222 = new vq8("notification_permission_granted", Boolean.valueOf(Build.VERSION.SDK_INT >= 33 || zy5.m23841g(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                                    Object systemService22222 = context2.getSystemService("power");
                                    if (systemService22222 instanceof PowerManager) {
                                    }
                                    if (powerManager != null) {
                                    }
                                    z6 = false;
                                    vq8 vq8Var5022222 = new vq8("battery_optimization_disabled", Boolean.valueOf(z6));
                                    Object systemService322222 = context2.getSystemService("appops");
                                    if (!(systemService322222 instanceof AppOpsManager)) {
                                    }
                                    if (appOpsManager != null) {
                                    }
                                    vq8Var5 = vq8Var462222;
                                    z7 = false;
                                    Map m14870G2222222 = o97.m14870G(vq8Var6222, vq8Var7222, vq8Var8222, vq8Var9222, vq8Var4, vq8Var10222, vq8Var11222, vq8Var12222, vq8Var13222, vq8Var14222, vq8Var15222, vq8Var16222, vq8Var17222, vq8Var18222, vq8Var19222, vq8Var20222, vq8Var21222, vq8Var22222, vq8Var23222, vq8Var24222, vq8Var25222, vq8Var26222, vq8Var27222, vq8Var28222, vq8Var29222, vq8Var30222, vq8Var31222, vq8Var3, vq8Var322222, vq8Var332222, vq8Var342222, vq8Var352222, vq8Var362222, vq8Var372222, vq8Var382222, vq8Var392222, vq8Var402222, vq8Var412222, vq8Var422222, vq8Var432222, vq8Var442222, vq8Var452222, vq8Var5, vq8Var472222, vq8Var482222, vq8Var492222, vq8Var5022222, new vq8("app_usage_permission_granted", Boolean.valueOf(z7)), new vq8("total_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_total_blocks_count", 0))), new vq8("youtube_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_youtube_blocks_count", 0))), new vq8("instagram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_instagram_blocks_count", 0))), new vq8("facebook_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_facebook_blocks_count", 0))), new vq8("telegram_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_telegram_blocks_count", 0))), new vq8("whatsapp_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_whatsapp_blocks_count", 0))), new vq8("other_apps_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_other_apps_blocks_count", 0))), new vq8("group_social_media_blocks_count", new Long(preferencesHelper.getIntFromPreferences("pref_group_social_media_blocks_count", 0))), new vq8(hqZLxhHl.xIDuHtvjbHVRrAq, Boolean.valueOf(preferencesHelper.isChildDevice())), new vq8(PrefKeys.IS_PARENT_DEVICE, Boolean.valueOf(preferencesHelper.isParentDevice())), new vq8(PrefKeys.ONBOARDING_COMPLETED, Boolean.valueOf(preferencesHelper.getBooleanFromPreferences(PrefKeys.ONBOARDING_COMPLETED, false))), new vq8("any_protection_active", Boolean.valueOf(m17212i222.m19702b())), new vq8("active_protection_count", new Integer(m17212i222.m19701a())), new vq8("protection_effective", Boolean.valueOf(m17212i222.m19703c())));
                                    LinkedHashMap linkedHashMap32222222 = new LinkedHashMap();
                                    while (r2.hasNext()) {
                                    }
                                    return new mp9(m14870G2222222, m17212i222, linkedHashMap32222222);
                                }
                                th = null;
                                z3 = true;
                                List m11758b2222 = k14.m11758b();
                                ArrayList arrayList3222 = new ArrayList();
                                while (r4.hasNext()) {
                                }
                                op9 op9Var22222 = op9Var;
                                ArrayList arrayList22222 = new ArrayList(qs1.m16870Y(arrayList3222, 10));
                                it2 = arrayList3222.iterator();
                                while (it2.hasNext()) {
                                }
                                m11757a = k14.m11757a();
                                if (!m11757a.isEmpty()) {
                                }
                                ul9 m17212i2222 = ra7.m17212i(arrayList22222, m18246L022, z2, z3, m5891A222, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                                vq8 vq8Var62222 = new vq8("current_dns", str32);
                                vq8 vq8Var72222 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L022));
                                vq8 vq8Var82222 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                                vq8 vq8Var92222 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                                vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                                vq8 vq8Var102222 = new vq8("device_admin_granted", Boolean.valueOf(m5891A222));
                                vq8 vq8Var112222 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                                vq8 vq8Var122222 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                                vq8 vq8Var132222 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                                vq8 vq8Var142222 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                                vq8 vq8Var152222 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                                vq8 vq8Var162222 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                                vq8 vq8Var172222 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                                vq8 vq8Var182222 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                                vq8 vq8Var192222 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                                vq8 vq8Var202222 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                                vq8 vq8Var212222 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                                vq8 vq8Var222222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                                vq8 vq8Var232222 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                                vq8 vq8Var242222 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                                vq8 vq8Var252222 = new vq8("custom_app_blocker_count", new Integer(op9Var22222.m15227d()));
                                vq8 vq8Var262222 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var22222.m15225b() > 0));
                                vq8 vq8Var272222 = new vq8("quick_block_apps_count", new Integer(op9Var22222.m15225b()));
                                vq8 vq8Var282222 = new vq8("always_block_enabled", Boolean.valueOf(op9Var22222.m15224a() > 0));
                                vq8 vq8Var292222 = new vq8("always_block_apps_count", new Integer(op9Var22222.m15224a()));
                                vq8 vq8Var302222 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var22222.m15226c() > 0));
                                vq8 vq8Var312222 = new vq8("scheduled_block_apps_count", new Integer(op9Var22222.m15226c()));
                                vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                                stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                if (stringFromPreferences2.length() == 0) {
                                }
                            }
                            op9Var = new op9(0, 0, 0, 0);
                            List list22222 = wd9.f46245b;
                            m15615D = p97.m15615D(qs1.m16870Y(list22222, 10));
                            if (m15615D < 16) {
                            }
                            LinkedHashMap linkedHashMap2222 = new LinkedHashMap(m15615D);
                            while (r7.hasNext()) {
                            }
                            String stringFromPreferences42222 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                            values = linkedHashMap2222.values();
                            if (values instanceof Collection) {
                            }
                            it = values.iterator();
                            while (it.hasNext()) {
                            }
                            z2 = false;
                            boolean m5891A2222 = d4b.f7318A.m22547b(context2).m5891A();
                            String str22222 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                            String string2222 = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                            bool = Boolean.valueOf(string2222 == null && stb.m18246L0(string2222, str22222, false));
                            if (zy5.m23838d(bool, Boolean.TRUE)) {
                            }
                            z3 = true;
                            List m11758b22222 = k14.m11758b();
                            ArrayList arrayList32222 = new ArrayList();
                            while (r4.hasNext()) {
                            }
                            op9 op9Var222222 = op9Var;
                            ArrayList arrayList222222 = new ArrayList(qs1.m16870Y(arrayList32222, 10));
                            it2 = arrayList32222.iterator();
                            while (it2.hasNext()) {
                            }
                            m11757a = k14.m11757a();
                            if (!m11757a.isEmpty()) {
                            }
                            ul9 m17212i22222 = ra7.m17212i(arrayList222222, m18246L022, z2, z3, m5891A2222, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                            vq8 vq8Var622222 = new vq8("current_dns", str32);
                            vq8 vq8Var722222 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L022));
                            vq8 vq8Var822222 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                            vq8 vq8Var922222 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                            vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                            vq8 vq8Var1022222 = new vq8("device_admin_granted", Boolean.valueOf(m5891A2222));
                            vq8 vq8Var1122222 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                            vq8 vq8Var1222222 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                            vq8 vq8Var1322222 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                            vq8 vq8Var1422222 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                            vq8 vq8Var1522222 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                            vq8 vq8Var1622222 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                            vq8 vq8Var1722222 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                            vq8 vq8Var1822222 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                            vq8 vq8Var1922222 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                            vq8 vq8Var2022222 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                            vq8 vq8Var2122222 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                            vq8 vq8Var2222222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                            vq8 vq8Var2322222 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                            vq8 vq8Var2422222 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                            vq8 vq8Var2522222 = new vq8("custom_app_blocker_count", new Integer(op9Var222222.m15227d()));
                            vq8 vq8Var2622222 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var222222.m15225b() > 0));
                            vq8 vq8Var2722222 = new vq8("quick_block_apps_count", new Integer(op9Var222222.m15225b()));
                            vq8 vq8Var2822222 = new vq8("always_block_enabled", Boolean.valueOf(op9Var222222.m15224a() > 0));
                            vq8 vq8Var2922222 = new vq8("always_block_apps_count", new Integer(op9Var222222.m15224a()));
                            vq8 vq8Var3022222 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var222222.m15226c() > 0));
                            vq8 vq8Var3122222 = new vq8("scheduled_block_apps_count", new Integer(op9Var222222.m15226c()));
                            vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                            stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                            if (stringFromPreferences2.length() == 0) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Context context3 = qp9Var.f35106u;
                        try {
                            v11.m20244z(obj);
                            m8476a = obj;
                            context2 = context3;
                        } catch (Exception e4) {
                            e = e4;
                            context2 = context3;
                            sx7 sx7Var22 = sx7.f39332a;
                            sj8.m18114z("Failed to get current DNS: ", e.getMessage(), ly6Var, "ProtectionSync", null);
                            stringFromPreferences = "unknown";
                            if (stringFromPreferences.equals("unknown")) {
                            }
                            String str322 = stringFromPreferences;
                            boolean m18246L0222 = stb.m18246L0(str322, "kahf", true);
                            try {
                                stringFromPreferences3 = preferencesHelper.getStringFromPreferences("pref_blocked_apps_json", "[]");
                                if (stringFromPreferences3.length() != 0) {
                                }
                                op9Var = new op9(0, 0, 0, 0);
                            } catch (Exception e5) {
                                sx7 sx7Var4 = sx7.f39332a;
                                sx7.m18369g(ly6Var, "ProtectionSync", null, "Failed to count blocked apps: " + e5.getMessage());
                                op9Var = new op9(0, 0, 0, 0);
                            }
                            List list222222 = wd9.f46245b;
                            m15615D = p97.m15615D(qs1.m16870Y(list222222, 10));
                            if (m15615D < 16) {
                            }
                            LinkedHashMap linkedHashMap22222 = new LinkedHashMap(m15615D);
                            while (r7.hasNext()) {
                            }
                            String stringFromPreferences422222 = preferencesHelper.getStringFromPreferences("trial_status", "none");
                            values = linkedHashMap22222.values();
                            if (values instanceof Collection) {
                            }
                            it = values.iterator();
                            while (it.hasNext()) {
                            }
                            z2 = false;
                            boolean m5891A22222 = d4b.f7318A.m22547b(context2).m5891A();
                            try {
                                String str222222 = context2.getPackageName() + "/com.kahf.dns.features.guards.service.KahfBlockerService";
                                try {
                                    String string22222 = Settings.Secure.getString(context2.getContentResolver(), "enabled_accessibility_services");
                                    bool = Boolean.valueOf(string22222 == null && stb.m18246L0(string22222, str222222, false));
                                } catch (Exception unused7) {
                                    bool = null;
                                }
                                if (zy5.m23838d(bool, Boolean.TRUE)) {
                                }
                                z3 = true;
                                break;
                            } catch (Exception unused8) {
                            }
                            List m11758b222222 = k14.m11758b();
                            ArrayList arrayList322222 = new ArrayList();
                            while (r4.hasNext()) {
                            }
                            op9 op9Var2222222 = op9Var;
                            ArrayList arrayList2222222 = new ArrayList(qs1.m16870Y(arrayList322222, 10));
                            it2 = arrayList322222.iterator();
                            while (it2.hasNext()) {
                            }
                            m11757a = k14.m11757a();
                            if (!m11757a.isEmpty()) {
                            }
                            ul9 m17212i222222 = ra7.m17212i(arrayList2222222, m18246L0222, z2, z3, m5891A22222, z5, preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", z4));
                            vq8 vq8Var6222222 = new vq8("current_dns", str322);
                            vq8 vq8Var7222222 = new vq8("is_kahf_dns_set", Boolean.valueOf(m18246L0222));
                            vq8 vq8Var8222222 = new vq8("dns_change_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_dns_change_prevention_enabled", z4)));
                            vq8 vq8Var9222222 = new vq8("uninstall_prevention_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_uninstall_prevention_enabled", false)));
                            vq8Var = new vq8("super_uninstall_protection_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_super_uninstall_protection_enabled", false)));
                            vq8 vq8Var10222222 = new vq8("device_admin_granted", Boolean.valueOf(m5891A22222));
                            vq8 vq8Var11222222 = new vq8("disable_emergency_pause", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_disable_emergency_pause", false)));
                            vq8 vq8Var12222222 = new vq8("youtube_shorts_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_youtube_shorts_enabled", false)));
                            vq8 vq8Var13222222 = new vq8("instagram_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_instagram_reels_enabled", false)));
                            vq8 vq8Var14222222 = new vq8("facebook_reels_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_facebook_reels_enabled", false)));
                            vq8 vq8Var15222222 = new vq8("telegram_search_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_telegram_search_enabled", false)));
                            vq8 vq8Var16222222 = new vq8("whatsapp_status_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_whatsapp_status_enabled", false)));
                            vq8 vq8Var17222222 = new vq8("block_youtube_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_youtube_enabled", false)));
                            vq8 vq8Var18222222 = new vq8("block_facebook_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_facebook_enabled", false)));
                            vq8 vq8Var19222222 = new vq8("block_instagram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_instagram_enabled", false)));
                            vq8 vq8Var20222222 = new vq8("block_telegram_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_telegram_enabled", false)));
                            vq8 vq8Var21222222 = new vq8("block_whatsapp_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_block_whatsapp_enabled", false)));
                            vq8 vq8Var22222222 = new vq8("group_social_media_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_social_media_enabled", false)));
                            vq8 vq8Var23222222 = new vq8("group_vpn_tor_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_group_vpn_tor_enabled", false)));
                            vq8 vq8Var24222222 = new vq8("custom_app_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_app_blocker_enabled", false)));
                            vq8 vq8Var25222222 = new vq8("custom_app_blocker_count", new Integer(op9Var2222222.m15227d()));
                            vq8 vq8Var26222222 = new vq8("quick_block_enabled", Boolean.valueOf(op9Var2222222.m15225b() > 0));
                            vq8 vq8Var27222222 = new vq8("quick_block_apps_count", new Integer(op9Var2222222.m15225b()));
                            vq8 vq8Var28222222 = new vq8("always_block_enabled", Boolean.valueOf(op9Var2222222.m15224a() > 0));
                            vq8 vq8Var29222222 = new vq8("always_block_apps_count", new Integer(op9Var2222222.m15224a()));
                            vq8 vq8Var30222222 = new vq8("scheduled_block_enabled", Boolean.valueOf(op9Var2222222.m15226c() > 0));
                            vq8 vq8Var31222222 = new vq8("scheduled_block_apps_count", new Integer(op9Var2222222.m15226c()));
                            vq8Var2 = new vq8("custom_site_blocker_enabled", Boolean.valueOf(preferencesHelper.getBooleanFromPreferences("pref_custom_site_block_enabled", false)));
                            try {
                                stringFromPreferences2 = preferencesHelper.getStringFromPreferences("pref_custom_blocked_urls", "");
                                if (stringFromPreferences2.length() == 0) {
                                }
                            } catch (Exception e6) {
                                e = e6;
                                vq8Var3 = vq8Var2;
                                vq8Var4 = vq8Var;
                            }
                        }
                    }
                    stringFromPreferences = (String) m8476a;
                }
            }
            if (i != 0) {
            }
            stringFromPreferences = (String) m8476a;
        } catch (CancellationException e7) {
            throw e7;
        }
        qp9Var = new qp9(this, za2Var);
        Object obj4 = qp9Var.f35107v;
        i = qp9Var.f35109x;
        ly6 ly6Var2 = ly6.f25311x;
        Throwable th22 = null;
        PreferencesHelper preferencesHelper2 = this.f37068a;
    }
}
