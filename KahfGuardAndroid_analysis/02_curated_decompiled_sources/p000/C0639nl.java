package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.appcompat.app.JoF.wfBxRVkDOVdoPZ;
import coil3.decode.p009lL.ivWZ;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: nl */
/* loaded from: classes.dex */
public final class C0639nl implements sv5 {

    /* renamed from: d */
    public static final Set f28439d = v90.m20558j0(new String[]{"com.microsoft.windowsintune.companyportal", "com.microsoft.scmx", "com.google.android.apps.work.clouddpc", "com.google.android.apps.enterprise.dmagent", "com.samsung.android.knox.containeragent", "com.airwatch.androidagent", "com.mobileiron.client.android.mdm", "com.google.android.apps.subscriptions.red", "com.samsung.android.fast", "io.kahf.browser"});

    /* renamed from: e */
    public static final Set f28440e = v90.m20558j0(new String[]{"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.apps.youtube.kids", "com.google.android.apps.youtube.music", "com.google.android.apps.youtube.creator", "com.instagram.android", "com.instagram.lite", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.facebook.mlite", "com.instagram.threadsapp", "org.telegram.messenger", "org.telegram.messenger.web", "org.thunderdog.challegram", "com.twitter.android", "com.zhiliaoapp.musically", "com.ss.android.ugc.trill", "com.snapchat.android", "com.whatsapp", "com.whatsapp.w4b", "com.discord", "com.reddit.frontpage", "com.linkedin.android", "com.pinterest", "com.tumblr", "com.quora.android", "com.tencent.mm", "jp.naver.line.android", "com.viber.voip", ivWZ.cmgWrwzhdYf, "com.skype.m2", "org.thoughtcrime.securesms", "com.imo.android.imoim", "com.kakao.talk", "com.vkontakte.android", "com.twitch.android.app", "com.bereal.ft", "us.zoom.videomeetings", "com.microsoft.teams", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "com.google.android.apps.chrome", "com.microsoft.emmx", "org.mozilla.firefox", "org.mozilla.focus", "com.brave.browser", "com.opera.browser", "com.opera.mini.native", "com.opera.gx", "com.duckduckgo.mobile.android", "com.UCMobile.intl", "com.sec.android.app.sbrowser", "com.mi.globalbrowser", "com.huawei.browser", "com.vivo.browser", "com.android.browser", "com.google.android.apps.searchlite", "com.mi.globalbrowser.mini", "com.uc.browser.en", wfBxRVkDOVdoPZ.toKAJEgacsLlQ, "com.opera.browser.beta", "com.opera.mini.native.beta", "org.mozilla.fenix", "org.mozilla.firefox_beta", "org.mozilla.focus.beta", "com.brave.browser_beta", "com.microsoft.emmx.beta", "com.yandex.browser", "com.vivaldi.browser", "com.kiwibrowser.browser", "mark.via.gp", "org.torproject.torbrowser", "com.amazon.cloud9", "com.heytap.browser", "com.talpa.hibrowser", "com.netflix.mediaclient", "com.spotify.music", "com.amazon.avod.thirdpartyclient", "com.amazon.mp3", "com.disney.disneyplus", "com.hulu.plus", "com.apple.android.music", "com.apple.atve.androidtv.appletv", "com.hbo.hbonow", "com.wbd.stream", "com.peacocktv.peacockandroid", "com.cbs.app", "com.crunchyroll.crunchyroid", "tv.twitch.android.app", "deezer.android.app", "com.soundcloud.android", "com.pandora.android", "com.aspiro.tidal", "com.bigo.live", "video.like", "com.community.oneroom", "com.miui.videoplayer", "com.coloros.video", "com.miui.video", "com.huawei.himovie.overseas", "com.samsung.android.tvplus", "com.mxtech.videoplayer.ad", "com.afmobi.boomplayer", "com.roblox.client", "com.mojang.minecraftpe", "com.epicgames.fortnite", "com.epicgames.portal", "com.valvesoftware.android.steam.community", "com.innersloth.spacemafia", "com.samsung.android.game.gamehome", "com.oplus.games", "com.vivo.gamecube", "com.xiaomi.glgm", "com.nearme.gamecenter", "com.samsung.android.game.gametools", "jp.konami.pesam", "com.tinder", "com.bumble.app", "co.hinge.app", "com.okcupid.okcupid", "com.grindrapp.android", "com.android.vending", "com.google.android.play.games", "com.sec.android.app.samsungapps", "com.huawei.appmarket", "com.xiaomi.market", "com.xiaomi.mipicks", "com.vivo.appstore", "com.heytap.market", "com.hihonor.appmarket", "com.oppo.market", "com.amazon.venezia", "com.transsnet.store", "com.iqoo.secure", "com.transsion.phonemaster", "com.itel.freezer", "com.samsung.android.app.spage", "com.facebook.services", "com.facebook.appmanager", "com.facebook.system", "com.google.android.gm", "com.google.android.apps.maps", "com.google.android.apps.photos", "com.google.android.apps.docs", "com.google.android.apps.docs.editors.docs", "com.google.android.apps.docs.editors.sheets", "com.google.android.apps.docs.editors.slides", "com.google.android.apps.translate", "com.google.android.apps.tachyon", "com.google.android.apps.dynamite", "com.google.android.apps.magazines", "com.google.android.googlequicksearchbox", "com.google.android.calendar", "com.google.android.keep", "com.google.android.apps.nbu.files", "com.google.android.videos", "com.google.android.apps.books", "com.google.android.apps.podcasts"});

    /* renamed from: a */
    public final Context f28441a;

    /* renamed from: b */
    public final ConcurrentHashMap f28442b;

    /* renamed from: c */
    public volatile long f28443c;

    public C0639nl(Context context) {
        context.getClass();
        this.f28441a = context;
        this.f28442b = new ConcurrentHashMap();
        ix0 ix0Var = new ix0(this, (byte) 1);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        zy5.m23854u(context, ix0Var, intentFilter, null, 4);
        zy5.m23854u(context, ix0Var, intentFilter2, null, 4);
    }

    /* renamed from: b */
    public static boolean m14252b(PackageManager packageManager, ApplicationInfo applicationInfo, String str) {
        if (zy5.m23838d(applicationInfo.packageName, str)) {
            return false;
        }
        return f28440e.contains(applicationInfo.packageName) || ((applicationInfo.flags & 1) == 0 && packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null);
    }

    /* renamed from: a */
    public final Object m14253a(String str, za2 za2Var) {
        qv5 qv5Var = (qv5) this.f28442b.get(str);
        if (qv5Var != null) {
            return qv5Var;
        }
        vu2 vu2Var = k83.f21845a;
        return jzd.m11694F(dt2.f8706v, new C0927vd(this, str, null, (byte) 1), za2Var);
    }
}
