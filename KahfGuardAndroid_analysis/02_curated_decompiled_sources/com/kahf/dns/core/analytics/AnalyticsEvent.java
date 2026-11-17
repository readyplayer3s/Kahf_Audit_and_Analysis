package com.kahf.dns.core.analytics;

import android.p001os.p002hz.gcwXtavsqv;
import androidx.appcompat.app.JoF.wfBxRVkDOVdoPZ;
import androidx.lifecycle.p006iR.iazcOQnbJex;
import androidx.work.impl.workers.dFe.kfGHxXNRt;
import coil3.annotation.p008xm.PXJXvZZH;
import coil3.decode.p009lL.GqctEyzvnho;
import coil3.decode.p009lL.ivWZ;
import com.bumptech.glide.load.QJWT.XLGovHFQUxVAg;
import com.facebook.internal.p012Lq.hqZLxhHl;
import com.github.mikephil.charting.jobs.Zzyu.kDZkQvvJAhzNl;
import com.google.android.datatransport.cct.p013Yv.EtVGdIOx;
import com.google.android.datatransport.runtime.backends.p014PK.jpnKuHlzpT;
import com.google.android.gms.measurement.internal.jhdS.jcRNFy;
import com.google.android.gms.measurement.internal.jhdS.oavfxXVsJYlYK;
import com.kahf.dns.features.analytics.FtDH.mmUZEXxylxd;
import com.kahf.dns.features.notification.p017fd.QaBoVN;
import com.kahf.dns.features.restrictions.sync.p018gc.jTCFTGKxOS;
import com.kahf.dns.p015di.core.p016mT.NwivstN;
import com.kahf.dns.utils.PrefKeys;
import com.posthog.internal.replay.p020nI.hWpfEmw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p000.AbstractC0327f4;
import p000.AbstractC0505jz;
import p000.C0041az;
import p000.C0077bz;
import p000.C0248cz;
import p000.C0284dz;
import p000.C0321ez;
import p000.C0358fz;
import p000.C0395gz;
import p000.C0433hz;
import p000.C0468iz;
import p000.C0874ty;
import p000.C0911uy;
import p000.C0948vy;
import p000.C0985wy;
import p000.C1022xy;
import p000.C1059yy;
import p000.C1096zy;
import p000.ae0;
import p000.aib;
import p000.be0;
import p000.bib;
import p000.cib;
import p000.dlb;
import p000.g77;
import p000.gpc;
import p000.gu8;
import p000.hu8;
import p000.iu8;
import p000.ju8;
import p000.ku8;
import p000.lu8;
import p000.lva;
import p000.mr2;
import p000.mu8;
import p000.o97;
import p000.pr1;
import p000.rib;
import p000.shb;
import p000.sj8;
import p000.t8c;
import p000.thb;
import p000.tu4;
import p000.tz6;
import p000.uhb;
import p000.uu4;
import p000.vhb;
import p000.vq8;
import p000.whb;
import p000.x11;
import p000.xhb;
import p000.yhb;
import p000.zd0;
import p000.zhb;
import p000.zo3;
import p000.zv5;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public abstract class AnalyticsEvent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_ACTION = "action";
    private final Map<String, Object> data;
    private final String eventName;

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class AppOpenedByNotificationEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_APP_OPEN_BY_NOTIFICATION = "action_app_open_by_notification";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "app_open_by_notification";
        private static final String PARAM_CAMPAIGN_NAME = "campaign_name";
        private static final String PARAM_CAMPAIGN_NUMBER = "campaign_number";
        private static final String PARAM_ID_NOTIFICATION = "id_notification";
        private static final String PARAM_MESSAGE_ID = "message_id";
        private static final String PARAM_TRACKING_VERSION = "tracking_version";
        private static final int TRACKING_VERSION = 2;
        private final String actionName;
        private final String campaignName;
        private final String campaignNumber;

        /* renamed from: id */
        private final String f6236id;
        private final String messageId;

        private AppOpenedByNotificationEvent(String str, String str2, String str3, String str4, String str5) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.f6236id = str2;
            this.campaignName = str3;
            this.campaignNumber = str4;
            this.messageId = str5;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(jcRNFy.dVLehCcXedQOxe, this.actionName), new vq8(PARAM_ID_NOTIFICATION, this.f6236id), new vq8(PARAM_CAMPAIGN_NAME, this.campaignName), new vq8(PARAM_CAMPAIGN_NUMBER, this.campaignNumber), new vq8(PARAM_MESSAGE_ID, this.messageId), new vq8(PARAM_TRACKING_VERSION, 2));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ AppOpenedByNotificationEvent(String str, String str2, String str3, String str4, String str5, mr2 mr2Var) {
            this(str, str2, str3, str4, str5);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AppOpenedByNotification extends AppOpenedByNotificationEvent {
            public static final int $stable = 0;
            private final String campaignName;
            private final String campaignNumber;

            /* renamed from: id */
            private final String f6237id;
            private final String messageId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppOpenedByNotification(String str, String str2, String str3, String str4) {
                super(AppOpenedByNotificationEvent.ACTION_APP_OPEN_BY_NOTIFICATION, str, str2, str3, str4, null);
                str.getClass();
                this.f6237id = str;
                this.campaignName = str2;
                this.campaignNumber = str3;
                this.messageId = str4;
            }

            private final String component1() {
                return this.f6237id;
            }

            private final String component2() {
                return this.campaignName;
            }

            private final String component3() {
                return this.campaignNumber;
            }

            private final String component4() {
                return this.messageId;
            }

            public static /* synthetic */ AppOpenedByNotification copy$default(AppOpenedByNotification appOpenedByNotification, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = appOpenedByNotification.f6237id;
                }
                if ((i & 2) != 0) {
                    str2 = appOpenedByNotification.campaignName;
                }
                if ((i & 4) != 0) {
                    str3 = appOpenedByNotification.campaignNumber;
                }
                if ((i & 8) != 0) {
                    str4 = appOpenedByNotification.messageId;
                }
                return appOpenedByNotification.copy(str, str2, str3, str4);
            }

            public final AppOpenedByNotification copy(String str, String str2, String str3, String str4) {
                str.getClass();
                return new AppOpenedByNotification(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AppOpenedByNotification)) {
                    return false;
                }
                AppOpenedByNotification appOpenedByNotification = (AppOpenedByNotification) obj;
                return zy5.m23838d(this.f6237id, appOpenedByNotification.f6237id) && zy5.m23838d(this.campaignName, appOpenedByNotification.campaignName) && zy5.m23838d(this.campaignNumber, appOpenedByNotification.campaignNumber) && zy5.m23838d(this.messageId, appOpenedByNotification.messageId);
            }

            public int hashCode() {
                int hashCode = this.f6237id.hashCode() * 31;
                String str = this.campaignName;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.campaignNumber;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.messageId;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                String str = this.f6237id;
                String str2 = this.campaignName;
                return pr1.m15981o(pr1.m15984r("AppOpenedByNotification(id=", str, ", campaignName=", str2, ", campaignNumber="), this.campaignNumber, ", messageId=", this.messageId, ")");
            }

            public /* synthetic */ AppOpenedByNotification(String str, String str2, String str3, String str4, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DonationEvent extends AnalyticsEvent {
        private static final String ACTION_CARD_CLICK = "action_card_click";
        private static final String ACTION_CTA_CLICK = "action_cta_click";
        private static final String ACTION_ICON_CLICK = "action_icon_click";
        private static final String ACTION_PAGE_OPEN_FAILURE = "action_page_open_failure";
        private static final String ACTION_PAGE_OPEN_SUCCESS = "action_page_open_success";
        private static final String EVENT_NAME = "donation_activity";
        private static final String PARAM_CTA_POSITION = "cta_position";
        private static final String PARAM_DONATION_URL = "donation_url";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_ERROR_TYPE = "error_type";
        private static final String PARAM_LAUNCH_METHOD = "launch_method";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CardClick extends DonationEvent {
            public static final int $stable = 8;
            private final String sourceScreen;

            public CardClick(String str) {
                super(DonationEvent.ACTION_CARD_CLICK, new vq8[]{AbstractC0327f4.m7612e(str, DonationEvent.PARAM_SOURCE_SCREEN, str)}, null);
                this.sourceScreen = str;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ CardClick copy$default(CardClick cardClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cardClick.sourceScreen;
                }
                return cardClick.copy(str);
            }

            public final CardClick copy(String str) {
                str.getClass();
                return new CardClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardClick) && zy5.m23838d(this.sourceScreen, ((CardClick) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("CardClick(sourceScreen=", this.sourceScreen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CtaClick extends DonationEvent {
            public static final int $stable = 8;
            private final String ctaPosition;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CtaClick(String str, String str2) {
                super(DonationEvent.ACTION_CTA_CLICK, new vq8[]{new vq8(DonationEvent.PARAM_SOURCE_SCREEN, str), new vq8(DonationEvent.PARAM_CTA_POSITION, str2)}, null);
                str.getClass();
                str2.getClass();
                this.sourceScreen = str;
                this.ctaPosition = str2;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            private final String component2() {
                return this.ctaPosition;
            }

            public static /* synthetic */ CtaClick copy$default(CtaClick ctaClick, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ctaClick.sourceScreen;
                }
                if ((i & 2) != 0) {
                    str2 = ctaClick.ctaPosition;
                }
                return ctaClick.copy(str, str2);
            }

            public final CtaClick copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new CtaClick(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CtaClick)) {
                    return false;
                }
                CtaClick ctaClick = (CtaClick) obj;
                return zy5.m23838d(this.sourceScreen, ctaClick.sourceScreen) && zy5.m23838d(this.ctaPosition, ctaClick.ctaPosition);
            }

            public int hashCode() {
                return this.ctaPosition.hashCode() + (this.sourceScreen.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("CtaClick(sourceScreen=", this.sourceScreen, ", ctaPosition=", this.ctaPosition, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class IconClick extends DonationEvent {
            public static final int $stable = 8;
            private final String sourceScreen;

            public IconClick(String str) {
                super(DonationEvent.ACTION_ICON_CLICK, new vq8[]{AbstractC0327f4.m7612e(str, DonationEvent.PARAM_SOURCE_SCREEN, str)}, null);
                this.sourceScreen = str;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ IconClick copy$default(IconClick iconClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iconClick.sourceScreen;
                }
                return iconClick.copy(str);
            }

            public final IconClick copy(String str) {
                str.getClass();
                return new IconClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IconClick) && zy5.m23838d(this.sourceScreen, ((IconClick) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("IconClick(sourceScreen=", this.sourceScreen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class PageOpenSuccess extends DonationEvent {
            public static final int $stable = 8;
            private final String donationUrl;
            private final String launchMethod;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PageOpenSuccess(String str, String str2, String str3) {
                super(DonationEvent.ACTION_PAGE_OPEN_SUCCESS, new vq8[]{new vq8(DonationEvent.PARAM_SOURCE_SCREEN, str), new vq8(DonationEvent.PARAM_LAUNCH_METHOD, str2), new vq8(DonationEvent.PARAM_DONATION_URL, str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.sourceScreen = str;
                this.launchMethod = str2;
                this.donationUrl = str3;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            private final String component2() {
                return this.launchMethod;
            }

            private final String component3() {
                return this.donationUrl;
            }

            public static /* synthetic */ PageOpenSuccess copy$default(PageOpenSuccess pageOpenSuccess, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pageOpenSuccess.sourceScreen;
                }
                if ((i & 2) != 0) {
                    str2 = pageOpenSuccess.launchMethod;
                }
                if ((i & 4) != 0) {
                    str3 = pageOpenSuccess.donationUrl;
                }
                return pageOpenSuccess.copy(str, str2, str3);
            }

            public final PageOpenSuccess copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new PageOpenSuccess(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PageOpenSuccess)) {
                    return false;
                }
                PageOpenSuccess pageOpenSuccess = (PageOpenSuccess) obj;
                return zy5.m23838d(this.sourceScreen, pageOpenSuccess.sourceScreen) && zy5.m23838d(this.launchMethod, pageOpenSuccess.launchMethod) && zy5.m23838d(this.donationUrl, pageOpenSuccess.donationUrl);
            }

            public int hashCode() {
                return this.donationUrl.hashCode() + t8c.m18683g(this.sourceScreen.hashCode() * 31, this.launchMethod, 31);
            }

            public String toString() {
                String str = this.sourceScreen;
                String str2 = this.launchMethod;
                return pr1.m15980n(pr1.m15984r("PageOpenSuccess(sourceScreen=", str, ", launchMethod=", str2, ", donationUrl="), this.donationUrl, ")");
            }
        }

        private DonationEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class PageOpenFailure extends DonationEvent {
            public static final int $stable = 8;
            private final String donationUrl;
            private final String errorMessage;
            private final String errorType;
            private final String launchMethod;
            private final String sourceScreen;

            private final String component1() {
                return this.sourceScreen;
            }

            private final String component2() {
                return this.launchMethod;
            }

            private final String component3() {
                return this.errorType;
            }

            private final String component4() {
                return this.errorMessage;
            }

            private final String component5() {
                return this.donationUrl;
            }

            public static /* synthetic */ PageOpenFailure copy$default(PageOpenFailure pageOpenFailure, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pageOpenFailure.sourceScreen;
                }
                if ((i & 2) != 0) {
                    str2 = pageOpenFailure.launchMethod;
                }
                if ((i & 4) != 0) {
                    str3 = pageOpenFailure.errorType;
                }
                if ((i & 8) != 0) {
                    str4 = pageOpenFailure.errorMessage;
                }
                if ((i & 16) != 0) {
                    str5 = pageOpenFailure.donationUrl;
                }
                String str6 = str5;
                String str7 = str3;
                return pageOpenFailure.copy(str, str2, str7, str4, str6);
            }

            public final PageOpenFailure copy(String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new PageOpenFailure(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PageOpenFailure)) {
                    return false;
                }
                PageOpenFailure pageOpenFailure = (PageOpenFailure) obj;
                return zy5.m23838d(this.sourceScreen, pageOpenFailure.sourceScreen) && zy5.m23838d(this.launchMethod, pageOpenFailure.launchMethod) && zy5.m23838d(this.errorType, pageOpenFailure.errorType) && zy5.m23838d(this.errorMessage, pageOpenFailure.errorMessage) && zy5.m23838d(this.donationUrl, pageOpenFailure.donationUrl);
            }

            public int hashCode() {
                return this.donationUrl.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(this.sourceScreen.hashCode() * 31, this.launchMethod, 31), this.errorType, 31), this.errorMessage, 31);
            }

            public String toString() {
                String str = this.sourceScreen;
                String str2 = this.launchMethod;
                String str3 = this.errorType;
                String str4 = this.errorMessage;
                String str5 = this.donationUrl;
                StringBuilder m15984r = pr1.m15984r("PageOpenFailure(sourceScreen=", str, ", launchMethod=", str2, ", errorType=");
                pr1.m15992z(m15984r, str3, ", errorMessage=", str4, ", donationUrl=");
                return pr1.m15980n(m15984r, str5, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PageOpenFailure(String str, String str2, String str3, String str4, String str5) {
                super(DonationEvent.ACTION_PAGE_OPEN_FAILURE, new vq8[]{new vq8(DonationEvent.PARAM_SOURCE_SCREEN, str), new vq8(DonationEvent.PARAM_LAUNCH_METHOD, str2), new vq8(DonationEvent.PARAM_ERROR_TYPE, str3), new vq8(EtVGdIOx.vkUBqYwwkV, str4), new vq8(DonationEvent.PARAM_DONATION_URL, str5)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                this.sourceScreen = str;
                this.launchMethod = str2;
                this.errorType = str3;
                this.errorMessage = str4;
                this.donationUrl = str5;
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DonationEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class GettingStartedEvent extends AnalyticsEvent {
        private static final String ACTION_COMPLETED = "completed";
        private static final String ACTION_DISMISSED = "dismissed";
        private static final String ACTION_SHOWN = "shown";
        private static final String ACTION_STEP_COMPLETED = "step_completed";
        private static final String ACTION_STEP_CTA_CLICKED = "step_cta_clicked";
        private static final String EVENT_NAME = "getting_started_activity";
        private static final String PARAM_COMPLETED_COUNT = "completed_count";
        private static final String PARAM_STEP = "step";
        private static final String PARAM_TOTAL_COUNT = "total_count";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Completed extends GettingStartedEvent {
            public static final int $stable = 0;
            public static final Completed INSTANCE = new Completed();

            private Completed() {
                super(GettingStartedEvent.ACTION_COMPLETED, new vq8[0], null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Completed);
            }

            public int hashCode() {
                return -641350587;
            }

            public String toString() {
                return "Completed";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Dismissed extends GettingStartedEvent {
            public static final int $stable = 8;
            private final int completedCount;
            private final int totalCount;

            public Dismissed(int i, int i2) {
                super(GettingStartedEvent.ACTION_DISMISSED, new vq8[]{new vq8(GettingStartedEvent.PARAM_COMPLETED_COUNT, Integer.valueOf(i)), new vq8(GettingStartedEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i2))}, null);
                this.completedCount = i;
                this.totalCount = i2;
            }

            private final int component1() {
                return this.completedCount;
            }

            private final int component2() {
                return this.totalCount;
            }

            public static /* synthetic */ Dismissed copy$default(Dismissed dismissed, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = dismissed.completedCount;
                }
                if ((i3 & 2) != 0) {
                    i2 = dismissed.totalCount;
                }
                return dismissed.copy(i, i2);
            }

            public final Dismissed copy(int i, int i2) {
                return new Dismissed(i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dismissed)) {
                    return false;
                }
                Dismissed dismissed = (Dismissed) obj;
                return this.completedCount == dismissed.completedCount && this.totalCount == dismissed.totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount) + (Integer.hashCode(this.completedCount) * 31);
            }

            public String toString() {
                return pr1.m15971e(this.completedCount, this.totalCount, "Dismissed(completedCount=", ", totalCount=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Shown extends GettingStartedEvent {
            public static final int $stable = 8;
            private final int completedCount;
            private final String step;
            private final int totalCount;

            public Shown(String str, int i, int i2) {
                super(GettingStartedEvent.ACTION_SHOWN, new vq8[]{AbstractC0327f4.m7612e(str, GettingStartedEvent.PARAM_STEP, str), new vq8(GettingStartedEvent.PARAM_COMPLETED_COUNT, Integer.valueOf(i)), new vq8(GettingStartedEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i2))}, null);
                this.step = str;
                this.completedCount = i;
                this.totalCount = i2;
            }

            private final String component1() {
                return this.step;
            }

            private final int component2() {
                return this.completedCount;
            }

            private final int component3() {
                return this.totalCount;
            }

            public static /* synthetic */ Shown copy$default(Shown shown, String str, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = shown.step;
                }
                if ((i3 & 2) != 0) {
                    i = shown.completedCount;
                }
                if ((i3 & 4) != 0) {
                    i2 = shown.totalCount;
                }
                return shown.copy(str, i, i2);
            }

            public final Shown copy(String str, int i, int i2) {
                str.getClass();
                return new Shown(str, i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Shown)) {
                    return false;
                }
                Shown shown = (Shown) obj;
                return zy5.m23838d(this.step, shown.step) && this.completedCount == shown.completedCount && this.totalCount == shown.totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount) + pr1.m15965A(this.completedCount, this.step.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.step;
                return tz6.m19207h(this.totalCount, ")", sj8.m18105q(this.completedCount, "Shown(step=", str, ", completedCount=", ", totalCount="));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepCompleted extends GettingStartedEvent {
            public static final int $stable = 8;
            private final String step;

            public StepCompleted(String str) {
                super(GettingStartedEvent.ACTION_STEP_COMPLETED, new vq8[]{AbstractC0327f4.m7612e(str, GettingStartedEvent.PARAM_STEP, str)}, null);
                this.step = str;
            }

            private final String component1() {
                return this.step;
            }

            public static /* synthetic */ StepCompleted copy$default(StepCompleted stepCompleted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stepCompleted.step;
                }
                return stepCompleted.copy(str);
            }

            public final StepCompleted copy(String str) {
                str.getClass();
                return new StepCompleted(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepCompleted) && zy5.m23838d(this.step, ((StepCompleted) obj).step);
            }

            public int hashCode() {
                return this.step.hashCode();
            }

            public String toString() {
                return tz6.m19210k("StepCompleted(step=", this.step, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepCtaClicked extends GettingStartedEvent {
            public static final int $stable = 8;
            private final String step;

            public StepCtaClicked(String str) {
                super(GettingStartedEvent.ACTION_STEP_CTA_CLICKED, new vq8[]{AbstractC0327f4.m7612e(str, GettingStartedEvent.PARAM_STEP, str)}, null);
                this.step = str;
            }

            private final String component1() {
                return this.step;
            }

            public static /* synthetic */ StepCtaClicked copy$default(StepCtaClicked stepCtaClicked, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stepCtaClicked.step;
                }
                return stepCtaClicked.copy(str);
            }

            public final StepCtaClicked copy(String str) {
                str.getClass();
                return new StepCtaClicked(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepCtaClicked) && zy5.m23838d(this.step, ((StepCtaClicked) obj).step);
            }

            public int hashCode() {
                return this.step.hashCode();
            }

            public String toString() {
                return tz6.m19210k("StepCtaClicked(step=", this.step, ")");
            }
        }

        private GettingStartedEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, kfGHxXNRt.odPQ, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ GettingStartedEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class GotoSettingsEvent extends AnalyticsEvent {
        private static final String ACTION_GO_TO_SETTINGS = "action_go_to_settings";
        private static final String EVENT_NAME = "go_to_settings";
        private static final String PARAM_GO_TO_SETTINGS_FROM = "go_to_settings_from";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class TrackGoToSettingsActivity extends GotoSettingsEvent {
            public static final int $stable = 8;
            private final uu4 activity;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public TrackGoToSettingsActivity(uu4 uu4Var) {
                super(GotoSettingsEvent.ACTION_GO_TO_SETTINGS, new vq8[]{new vq8(GotoSettingsEvent.PARAM_GO_TO_SETTINGS_FROM, "accessibility")}, r1);
                uu4Var.getClass();
                mr2 mr2Var = null;
                if (!(uu4Var instanceof tu4)) {
                    gpc.m8801a();
                    throw null;
                }
                this.activity = uu4Var;
            }

            private final uu4 component1() {
                return this.activity;
            }

            public static /* synthetic */ TrackGoToSettingsActivity copy$default(TrackGoToSettingsActivity trackGoToSettingsActivity, uu4 uu4Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    uu4Var = trackGoToSettingsActivity.activity;
                }
                return trackGoToSettingsActivity.copy(uu4Var);
            }

            public final TrackGoToSettingsActivity copy(uu4 uu4Var) {
                uu4Var.getClass();
                return new TrackGoToSettingsActivity(uu4Var);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TrackGoToSettingsActivity) && zy5.m23838d(this.activity, ((TrackGoToSettingsActivity) obj).activity);
            }

            public int hashCode() {
                return this.activity.hashCode();
            }

            public String toString() {
                return "TrackGoToSettingsActivity(activity=" + this.activity + ")";
            }
        }

        private GotoSettingsEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, GqctEyzvnho.kMXvyuzCqbx, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ GotoSettingsEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class GuardAutoDisableEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_AUTO_DISABLE = "action_auto_disable";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "guard_auto_disable";
        private static final String PARAM_FEATURE = "feature";
        private static final String PARAM_PREFERENCE_KEY = "preference_key";
        private static final String PARAM_REASON = "reason";
        private final String actionName;
        private final String featureName;
        private final String preferenceKey;
        private final String reason;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AutoDisable extends GuardAutoDisableEvent {
            public static final int $stable = 0;
            private final String featureName;
            private final String preferenceKey;
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoDisable(String str, String str2, String str3) {
                super(GuardAutoDisableEvent.ACTION_AUTO_DISABLE, str, str2, str3, null);
                tz6.m19222w(str, str2, str3);
                this.featureName = str;
                this.reason = str2;
                this.preferenceKey = str3;
            }

            private final String component1() {
                return this.featureName;
            }

            private final String component2() {
                return this.reason;
            }

            private final String component3() {
                return this.preferenceKey;
            }

            public static /* synthetic */ AutoDisable copy$default(AutoDisable autoDisable, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = autoDisable.featureName;
                }
                if ((i & 2) != 0) {
                    str2 = autoDisable.reason;
                }
                if ((i & 4) != 0) {
                    str3 = autoDisable.preferenceKey;
                }
                return autoDisable.copy(str, str2, str3);
            }

            public final AutoDisable copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new AutoDisable(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoDisable)) {
                    return false;
                }
                AutoDisable autoDisable = (AutoDisable) obj;
                return zy5.m23838d(this.featureName, autoDisable.featureName) && zy5.m23838d(this.reason, autoDisable.reason) && zy5.m23838d(this.preferenceKey, autoDisable.preferenceKey);
            }

            public int hashCode() {
                return this.preferenceKey.hashCode() + t8c.m18683g(this.featureName.hashCode() * 31, this.reason, 31);
            }

            public String toString() {
                String str = this.featureName;
                String str2 = this.reason;
                return pr1.m15980n(pr1.m15984r("AutoDisable(featureName=", str, ", reason=", str2, ", preferenceKey="), this.preferenceKey, ")");
            }
        }

        private GuardAutoDisableEvent(String str, String str2, String str3, String str4) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.featureName = str2;
            this.reason = str3;
            this.preferenceKey = str4;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_FEATURE, this.featureName), new vq8(oavfxXVsJYlYK.RRinuePNfQbUPhF, this.reason), new vq8(PARAM_PREFERENCE_KEY, this.preferenceKey));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ GuardAutoDisableEvent(String str, String str2, String str3, String str4, mr2 mr2Var) {
            this(str, str2, str3, str4);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class GuardToggleEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_GUARD_TOGGLE = "action_guard_toggle";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "guard_toggle_activity";
        private static final String PARAM_GUARD_TOGGLE_TYPE = "guard_toggle_type";
        private static final String PARAM_PERMISSION_ACCESSIBILITY = "permission_accessibility";
        private static final String PARAM_PERMISSION_BATTERY = "permission_battery";
        private static final String PARAM_PERMISSION_NOTIFICATION = "permission_notification";
        private final String actionName;
        private final String guardType;
        private final Map<String, Boolean> permissionInfo;

        private GuardToggleEvent(String str, String str2, Map<String, Boolean> map) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.guardType = str2;
            this.permissionInfo = map;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            g77 g77Var = new g77();
            g77Var.put(AnalyticsEvent.PARAM_ACTION, this.actionName);
            g77Var.put(PARAM_GUARD_TOGGLE_TYPE, this.guardType);
            Map<String, Boolean> map = this.permissionInfo;
            if (map != null) {
                Boolean bool = map.get("accessibility");
                if (bool != null) {
                    g77Var.put(PARAM_PERMISSION_ACCESSIBILITY, bool);
                }
                Boolean bool2 = map.get("battery");
                if (bool2 != null) {
                    g77Var.put(PARAM_PERMISSION_BATTERY, bool2);
                }
                Boolean bool3 = map.get("notification");
                if (bool3 != null) {
                    g77Var.put(PARAM_PERMISSION_NOTIFICATION, bool3);
                }
            }
            return g77Var.m8404b();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class GuardToggle extends GuardToggleEvent {
            public static final int $stable = 0;
            private final String guardType;
            private final Map<String, Boolean> permissionInfo;

            private final String component1() {
                return this.guardType;
            }

            private final Map<String, Boolean> component2() {
                return this.permissionInfo;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GuardToggle copy$default(GuardToggle guardToggle, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = guardToggle.guardType;
                }
                if ((i & 2) != 0) {
                    map = guardToggle.permissionInfo;
                }
                return guardToggle.copy(str, map);
            }

            public final GuardToggle copy(String str, Map<String, Boolean> map) {
                str.getClass();
                return new GuardToggle(str, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GuardToggle)) {
                    return false;
                }
                GuardToggle guardToggle = (GuardToggle) obj;
                return zy5.m23838d(this.guardType, guardToggle.guardType) && zy5.m23838d(this.permissionInfo, guardToggle.permissionInfo);
            }

            public int hashCode() {
                int hashCode = this.guardType.hashCode() * 31;
                Map<String, Boolean> map = this.permissionInfo;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            public String toString() {
                return "GuardToggle(guardType=" + this.guardType + ", permissionInfo=" + this.permissionInfo + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GuardToggle(String str, Map<String, Boolean> map) {
                super(kDZkQvvJAhzNl.QUuHIfVLOn, str, map, null);
                str.getClass();
                this.guardType = str;
                this.permissionInfo = map;
            }

            public /* synthetic */ GuardToggle(String str, Map map, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : map);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ GuardToggleEvent(String str, String str2, Map map, int i, mr2 mr2Var) {
            this(str, str2, (i & 4) != 0 ? null : map, null);
        }

        public /* synthetic */ GuardToggleEvent(String str, String str2, Map map, mr2 mr2Var) {
            this(str, str2, map);
        }
    }

    private AnalyticsEvent(String str) {
        this.eventName = str;
        this.data = zo3.f52774u;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public final String getEventName() {
        return this.eventName;
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class AccessibilityServiceStoppedEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_ACCESSIBILITY_STOPPED = "action_accessibility_stopped";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "accessibility_service_stopped";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Triggered extends AccessibilityServiceStoppedEvent {
            public static final int $stable = 0;
            private final Map<String, Object> properties;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Triggered(Map<String, ? extends Object> map) {
                super(null);
                map.getClass();
                this.properties = map;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14872I(this.properties, o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, AccessibilityServiceStoppedEvent.ACTION_ACCESSIBILITY_STOPPED), new vq8("timestamp", Long.valueOf(zv5.f53149a.mo2814g().m22370e()))));
            }
        }

        private AccessibilityServiceStoppedEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ AccessibilityServiceStoppedEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class AppActivityEvent extends AnalyticsEvent {
        private static final String ACTION_APP_ACTIVITY = "action_app_activity";
        private static final String EVENT_NAME = "app_activity";
        private static final String PARAM_ACTIVITY_TYPE = "app_activity_type";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class TrackAppActivity extends AppActivityEvent {
            public static final int $stable = 8;
            private final AbstractC0505jz activity;
            private final dlb sourceScreen;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public TrackAppActivity(AbstractC0505jz abstractC0505jz, dlb dlbVar) {
                super(AppActivityEvent.ACTION_APP_ACTIVITY, new vq8[]{new vq8(AppActivityEvent.PARAM_ACTIVITY_TYPE, r0), new vq8(AppActivityEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())}, r1);
                String str;
                abstractC0505jz.getClass();
                dlbVar.getClass();
                mr2 mr2Var = null;
                if (abstractC0505jz instanceof C0358fz) {
                    str = "report_site";
                } else if (abstractC0505jz instanceof C0468iz) {
                    str = "theme_light_selected";
                } else if (abstractC0505jz instanceof C0433hz) {
                    str = "theme_dark_selected";
                } else if (abstractC0505jz instanceof C0911uy) {
                    str = "delete_account_initiated";
                } else if (abstractC0505jz instanceof C0948vy) {
                    str = "delete_account_success";
                } else if (abstractC0505jz instanceof C0077bz) {
                    str = "go_to_manage_devices";
                } else if (abstractC0505jz instanceof C0041az) {
                    str = "go_to_support_from_battery_guide";
                } else if (abstractC0505jz instanceof C1096zy) {
                    str = "force_update_clicked";
                } else if (abstractC0505jz instanceof C0395gz) {
                    str = "soft_update_clicked";
                } else if (abstractC0505jz instanceof C0248cz) {
                    str = "manage_subscription";
                } else if (abstractC0505jz instanceof C0874ty) {
                    str = "app_tour_clicked";
                } else if (abstractC0505jz instanceof C1059yy) {
                    str = "device_role_parent_selected";
                } else if (abstractC0505jz instanceof C1022xy) {
                    str = "device_role_child_selected";
                } else if (abstractC0505jz instanceof C0985wy) {
                    str = "device_role_child_login_success";
                } else if (abstractC0505jz instanceof C0284dz) {
                    str = "notification_permission_dialog_allow";
                } else {
                    if (!(abstractC0505jz instanceof C0321ez)) {
                        gpc.m8801a();
                        throw null;
                    }
                    str = "notification_permission_dialog_cancel";
                }
                this.activity = abstractC0505jz;
                this.sourceScreen = dlbVar;
            }

            private final AbstractC0505jz component1() {
                return this.activity;
            }

            private final dlb component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ TrackAppActivity copy$default(TrackAppActivity trackAppActivity, AbstractC0505jz abstractC0505jz, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    abstractC0505jz = trackAppActivity.activity;
                }
                if ((i & 2) != 0) {
                    dlbVar = trackAppActivity.sourceScreen;
                }
                return trackAppActivity.copy(abstractC0505jz, dlbVar);
            }

            public final TrackAppActivity copy(AbstractC0505jz abstractC0505jz, dlb dlbVar) {
                abstractC0505jz.getClass();
                dlbVar.getClass();
                return new TrackAppActivity(abstractC0505jz, dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrackAppActivity)) {
                    return false;
                }
                TrackAppActivity trackAppActivity = (TrackAppActivity) obj;
                return zy5.m23838d(this.activity, trackAppActivity.activity) && zy5.m23838d(this.sourceScreen, trackAppActivity.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.activity.hashCode() * 31);
            }

            public String toString() {
                return "TrackAppActivity(activity=" + this.activity + ", sourceScreen=" + this.sourceScreen + ")";
            }
        }

        private AppActivityEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ AppActivityEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static abstract class AppBehaviorEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "app_behavior";
        private static final String PARAM_ACTION_TYPE = "action_type";
        private static final String PARAM_BEHAVIOR_ACTION = "behavior_action";
        private static final String PARAM_COMPLETED_STEPS = "completed_steps";
        private static final String PARAM_CURRENT_TIER = "current_tier";
        private static final String PARAM_DEVICE_BRAND = "device_brand";
        private static final String PARAM_DEVICE_ID = "device_id";
        private static final String PARAM_DEVICE_MODEL = "device_model";
        private static final String PARAM_DNS = "dns";
        private static final String PARAM_ENABLED = "enabled";
        private static final String PARAM_ERROR = "error";
        private static final String PARAM_FEATURE = "feature";
        private static final String PARAM_FEATURE_NAME = "feature_name";
        private static final String PARAM_FEATURE_TYPE = "feature_type";
        private static final String PARAM_FLOW = "flow";
        private static final String PARAM_FLOW_TYPE = "flow_type";
        private static final String PARAM_GOAL_TYPE = "goal_type";
        private static final String PARAM_GRANTED = "granted";
        private static final String PARAM_GUARD_TYPE = "guard_type";
        private static final String PARAM_ITEM_TYPE = "item_type";
        private static final String PARAM_LANGUAGE = "language";
        private static final String PARAM_LINK_TARGET = "link_target";
        private static final String PARAM_NOTIFICATION_TYPE = "notification_type";
        private static final String PARAM_OS_VERSION = "os_version";
        private static final String PARAM_PERMISSIONS_GRANTED = "permissions_granted";
        private static final String PARAM_PLATFORM = "platform";
        private static final String PARAM_PREVIOUS_SCREEN = "previous_screen";
        private static final String PARAM_PROTECTION_LEVEL = "protection_level";
        private static final String PARAM_REQUIRED_TIER = "required_tier";
        private static final String PARAM_RESULT = "result";
        private static final String PARAM_SCREEN = "screen";
        private static final String PARAM_SECTION_NAME = "section_name";
        private static final String PARAM_SOURCE = "source";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private static final String PARAM_STEP = "step";
        private static final String PARAM_STEPS_LIST = "steps_list";
        private static final String PARAM_STEP_ID = "step_id";
        private static final String PARAM_STEP_NAME = "step_name";
        private static final String PARAM_STEP_TYPE = "step_type";
        private static final String PARAM_SUCCESS = "success";
        private static final String PARAM_TOTAL_PERMISSIONS = "total_permissions";
        private static final String PARAM_TOTAL_STEPS = "total_steps";
        private static final String PARAM_TRIGGER = "trigger";
        private static final String PARAM_TUTORIAL_TYPE = "tutorial_type";
        private static final String PARAM_USER_RESPONSE = "user_response";
        private static final String PARAM_VIDEO_ACTION = "video_action";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class AccessibilityGrantClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final AccessibilityGrantClick INSTANCE = new AccessibilityGrantClick();

            private AccessibilityGrantClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AccessibilityGrantClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "accessibility_grant_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return 2060234696;
            }

            public String toString() {
                return "AccessibilityGrantClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class AppBlockerAction extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String actionType;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppBlockerAction(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.actionType = str;
                this.screen = str2;
            }

            private final String component1() {
                return this.actionType;
            }

            private final String component2() {
                return this.screen;
            }

            public static /* synthetic */ AppBlockerAction copy$default(AppBlockerAction appBlockerAction, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = appBlockerAction.actionType;
                }
                if ((i & 2) != 0) {
                    str2 = appBlockerAction.screen;
                }
                return appBlockerAction.copy(str, str2);
            }

            public final AppBlockerAction copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new AppBlockerAction(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AppBlockerAction)) {
                    return false;
                }
                AppBlockerAction appBlockerAction = (AppBlockerAction) obj;
                return zy5.m23838d(this.actionType, appBlockerAction.actionType) && zy5.m23838d(this.screen, appBlockerAction.screen);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "app_blocker_action"), new vq8(AppBehaviorEvent.PARAM_ACTION_TYPE, this.actionType), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen));
            }

            public int hashCode() {
                return this.screen.hashCode() + (this.actionType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("AppBlockerAction(actionType=", this.actionType, ", screen=", this.screen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class AppControlsFeatureClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String featureType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppControlsFeatureClick(String str) {
                super(null);
                str.getClass();
                this.featureType = str;
            }

            private final String component1() {
                return this.featureType;
            }

            public static /* synthetic */ AppControlsFeatureClick copy$default(AppControlsFeatureClick appControlsFeatureClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = appControlsFeatureClick.featureType;
                }
                return appControlsFeatureClick.copy(str);
            }

            public final AppControlsFeatureClick copy(String str) {
                str.getClass();
                return new AppControlsFeatureClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppControlsFeatureClick) && zy5.m23838d(this.featureType, ((AppControlsFeatureClick) obj).featureType);
            }

            public int hashCode() {
                return this.featureType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("AppControlsFeatureClick(featureType=", this.featureType, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, kfGHxXNRt.tfvzGeDO), new vq8(AppBehaviorEvent.PARAM_SCREEN, "app_controls"), new vq8(AppBehaviorEvent.PARAM_FEATURE_TYPE, this.featureType));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ChildOnboardingCompleted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final int permissionsGranted;
            private final int totalPermissions;

            public ChildOnboardingCompleted(int i, int i2) {
                super(null);
                this.permissionsGranted = i;
                this.totalPermissions = i2;
            }

            private final int component1() {
                return this.permissionsGranted;
            }

            private final int component2() {
                return this.totalPermissions;
            }

            public static /* synthetic */ ChildOnboardingCompleted copy$default(ChildOnboardingCompleted childOnboardingCompleted, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = childOnboardingCompleted.permissionsGranted;
                }
                if ((i3 & 2) != 0) {
                    i2 = childOnboardingCompleted.totalPermissions;
                }
                return childOnboardingCompleted.copy(i, i2);
            }

            public final ChildOnboardingCompleted copy(int i, int i2) {
                return new ChildOnboardingCompleted(i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChildOnboardingCompleted)) {
                    return false;
                }
                ChildOnboardingCompleted childOnboardingCompleted = (ChildOnboardingCompleted) obj;
                return this.permissionsGranted == childOnboardingCompleted.permissionsGranted && this.totalPermissions == childOnboardingCompleted.totalPermissions;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, PrefKeys.CHILD_ONBOARDING_COMPLETED), new vq8(AppBehaviorEvent.PARAM_PERMISSIONS_GRANTED, Integer.valueOf(this.permissionsGranted)), new vq8(AppBehaviorEvent.PARAM_TOTAL_PERMISSIONS, Integer.valueOf(this.totalPermissions)));
            }

            public int hashCode() {
                return Integer.hashCode(this.totalPermissions) + (Integer.hashCode(this.permissionsGranted) * 31);
            }

            public String toString() {
                return pr1.m15971e(this.permissionsGranted, this.totalPermissions, "ChildOnboardingCompleted(permissionsGranted=", ", totalPermissions=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ChildOnboardingStepCompleted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final boolean granted;
            private final int step;
            private final String stepName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChildOnboardingStepCompleted(int i, String str, boolean z) {
                super(null);
                str.getClass();
                this.step = i;
                this.stepName = str;
                this.granted = z;
            }

            private final int component1() {
                return this.step;
            }

            private final String component2() {
                return this.stepName;
            }

            private final boolean component3() {
                return this.granted;
            }

            public static /* synthetic */ ChildOnboardingStepCompleted copy$default(ChildOnboardingStepCompleted childOnboardingStepCompleted, int i, String str, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = childOnboardingStepCompleted.step;
                }
                if ((i2 & 2) != 0) {
                    str = childOnboardingStepCompleted.stepName;
                }
                if ((i2 & 4) != 0) {
                    z = childOnboardingStepCompleted.granted;
                }
                return childOnboardingStepCompleted.copy(i, str, z);
            }

            public final ChildOnboardingStepCompleted copy(int i, String str, boolean z) {
                str.getClass();
                return new ChildOnboardingStepCompleted(i, str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChildOnboardingStepCompleted)) {
                    return false;
                }
                ChildOnboardingStepCompleted childOnboardingStepCompleted = (ChildOnboardingStepCompleted) obj;
                return this.step == childOnboardingStepCompleted.step && zy5.m23838d(this.stepName, childOnboardingStepCompleted.stepName) && this.granted == childOnboardingStepCompleted.granted;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "child_onboarding_step_completed"), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.step)), new vq8(AppBehaviorEvent.PARAM_STEP_NAME, this.stepName), new vq8(AppBehaviorEvent.PARAM_GRANTED, Boolean.valueOf(this.granted)));
            }

            public int hashCode() {
                return Boolean.hashCode(this.granted) + t8c.m18683g(Integer.hashCode(this.step) * 31, this.stepName, 31);
            }

            public String toString() {
                int i = this.step;
                String str = this.stepName;
                return tz6.m19215p(pr1.m15982p(i, "ChildOnboardingStepCompleted(step=", ", stepName=", str, ", granted="), this.granted, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsCopied extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsCopied(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsCopied copy$default(DnsCopied dnsCopied, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsCopied.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsCopied.protectionLevel;
                }
                return dnsCopied.copy(str, str2);
            }

            public final DnsCopied copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsCopied(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsCopied)) {
                    return false;
                }
                DnsCopied dnsCopied = (DnsCopied) obj;
                return zy5.m23838d(this.dns, dnsCopied.dns) && zy5.m23838d(this.protectionLevel, dnsCopied.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_copied"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsCopied(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsCopyScreenViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsCopyScreenViewed(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsCopyScreenViewed copy$default(DnsCopyScreenViewed dnsCopyScreenViewed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsCopyScreenViewed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsCopyScreenViewed.protectionLevel;
                }
                return dnsCopyScreenViewed.copy(str, str2);
            }

            public final DnsCopyScreenViewed copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsCopyScreenViewed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsCopyScreenViewed)) {
                    return false;
                }
                DnsCopyScreenViewed dnsCopyScreenViewed = (DnsCopyScreenViewed) obj;
                return zy5.m23838d(this.dns, dnsCopyScreenViewed.dns) && zy5.m23838d(this.protectionLevel, dnsCopyScreenViewed.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_copy_screen_viewed"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsCopyScreenViewed(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsGotoSettingsClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String flow;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsGotoSettingsClicked(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.dns = str;
                this.protectionLevel = str2;
                this.flow = str3;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            private final String component3() {
                return this.flow;
            }

            public static /* synthetic */ DnsGotoSettingsClicked copy$default(DnsGotoSettingsClicked dnsGotoSettingsClicked, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsGotoSettingsClicked.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsGotoSettingsClicked.protectionLevel;
                }
                if ((i & 4) != 0) {
                    str3 = dnsGotoSettingsClicked.flow;
                }
                return dnsGotoSettingsClicked.copy(str, str2, str3);
            }

            public final DnsGotoSettingsClicked copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DnsGotoSettingsClicked(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsGotoSettingsClicked)) {
                    return false;
                }
                DnsGotoSettingsClicked dnsGotoSettingsClicked = (DnsGotoSettingsClicked) obj;
                return zy5.m23838d(this.dns, dnsGotoSettingsClicked.dns) && zy5.m23838d(this.protectionLevel, dnsGotoSettingsClicked.protectionLevel) && zy5.m23838d(this.flow, dnsGotoSettingsClicked.flow);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_goto_settings_clicked"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel), new vq8(AppBehaviorEvent.PARAM_FLOW, this.flow));
            }

            public int hashCode() {
                return this.flow.hashCode() + t8c.m18683g(this.dns.hashCode() * 31, this.protectionLevel, 31);
            }

            public String toString() {
                String str = this.dns;
                String str2 = this.protectionLevel;
                return pr1.m15980n(pr1.m15984r("DnsGotoSettingsClicked(dns=", str, ", protectionLevel=", str2, ", flow="), this.flow, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsLevelSelected extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsLevelSelected(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.source = str;
                this.protectionLevel = str2;
                this.dns = str3;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            private final String component3() {
                return this.dns;
            }

            public static /* synthetic */ DnsLevelSelected copy$default(DnsLevelSelected dnsLevelSelected, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsLevelSelected.source;
                }
                if ((i & 2) != 0) {
                    str2 = dnsLevelSelected.protectionLevel;
                }
                if ((i & 4) != 0) {
                    str3 = dnsLevelSelected.dns;
                }
                return dnsLevelSelected.copy(str, str2, str3);
            }

            public final DnsLevelSelected copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DnsLevelSelected(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsLevelSelected)) {
                    return false;
                }
                DnsLevelSelected dnsLevelSelected = (DnsLevelSelected) obj;
                return zy5.m23838d(this.source, dnsLevelSelected.source) && zy5.m23838d(this.protectionLevel, dnsLevelSelected.protectionLevel) && zy5.m23838d(this.dns, dnsLevelSelected.dns);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_level_selected"), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns));
            }

            public int hashCode() {
                return this.dns.hashCode() + t8c.m18683g(this.source.hashCode() * 31, this.protectionLevel, 31);
            }

            public String toString() {
                String str = this.source;
                String str2 = this.protectionLevel;
                return pr1.m15980n(pr1.m15984r("DnsLevelSelected(source=", str, ", protectionLevel=", str2, ", dns="), this.dns, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsSetScreenViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSetScreenViewed(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsSetScreenViewed copy$default(DnsSetScreenViewed dnsSetScreenViewed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSetScreenViewed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsSetScreenViewed.protectionLevel;
                }
                return dnsSetScreenViewed.copy(str, str2);
            }

            public final DnsSetScreenViewed copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsSetScreenViewed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSetScreenViewed)) {
                    return false;
                }
                DnsSetScreenViewed dnsSetScreenViewed = (DnsSetScreenViewed) obj;
                return zy5.m23838d(this.dns, dnsSetScreenViewed.dns) && zy5.m23838d(this.protectionLevel, dnsSetScreenViewed.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_set_screen_viewed"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsSetScreenViewed(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsSetupStarted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSetupStarted(String str) {
                super(null);
                str.getClass();
                this.screen = str;
            }

            private final String component1() {
                return this.screen;
            }

            public static /* synthetic */ DnsSetupStarted copy$default(DnsSetupStarted dnsSetupStarted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSetupStarted.screen;
                }
                return dnsSetupStarted.copy(str);
            }

            public final DnsSetupStarted copy(String str) {
                str.getClass();
                return new DnsSetupStarted(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DnsSetupStarted) && zy5.m23838d(this.screen, ((DnsSetupStarted) obj).screen);
            }

            public int hashCode() {
                return this.screen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("DnsSetupStarted(screen=", this.screen, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_setup_started"), new vq8(PXJXvZZH.VeAFdnukKJsReDw, this.screen));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsUnsetFailed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsUnsetFailed(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsUnsetFailed copy$default(DnsUnsetFailed dnsUnsetFailed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsUnsetFailed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsUnsetFailed.protectionLevel;
                }
                return dnsUnsetFailed.copy(str, str2);
            }

            public final DnsUnsetFailed copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsUnsetFailed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsUnsetFailed)) {
                    return false;
                }
                DnsUnsetFailed dnsUnsetFailed = (DnsUnsetFailed) obj;
                return zy5.m23838d(this.dns, dnsUnsetFailed.dns) && zy5.m23838d(this.protectionLevel, dnsUnsetFailed.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_unset_failed"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsUnsetFailed(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsUnsetScreenViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsUnsetScreenViewed(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsUnsetScreenViewed copy$default(DnsUnsetScreenViewed dnsUnsetScreenViewed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsUnsetScreenViewed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsUnsetScreenViewed.protectionLevel;
                }
                return dnsUnsetScreenViewed.copy(str, str2);
            }

            public final DnsUnsetScreenViewed copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsUnsetScreenViewed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsUnsetScreenViewed)) {
                    return false;
                }
                DnsUnsetScreenViewed dnsUnsetScreenViewed = (DnsUnsetScreenViewed) obj;
                return zy5.m23838d(this.dns, dnsUnsetScreenViewed.dns) && zy5.m23838d(this.protectionLevel, dnsUnsetScreenViewed.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_unset_screen_viewed"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsUnsetScreenViewed(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsUnsetSuccess extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsUnsetSuccess(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protectionLevel = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            public static /* synthetic */ DnsUnsetSuccess copy$default(DnsUnsetSuccess dnsUnsetSuccess, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsUnsetSuccess.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsUnsetSuccess.protectionLevel;
                }
                return dnsUnsetSuccess.copy(str, str2);
            }

            public final DnsUnsetSuccess copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsUnsetSuccess(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsUnsetSuccess)) {
                    return false;
                }
                DnsUnsetSuccess dnsUnsetSuccess = (DnsUnsetSuccess) obj;
                return zy5.m23838d(this.dns, dnsUnsetSuccess.dns) && zy5.m23838d(this.protectionLevel, dnsUnsetSuccess.protectionLevel);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_unset_success"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel));
            }

            public int hashCode() {
                return this.protectionLevel.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsUnsetSuccess(dns=", this.dns, ", protectionLevel=", this.protectionLevel, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class FeatureCardClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String featureType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FeatureCardClick(String str) {
                super(null);
                str.getClass();
                this.featureType = str;
            }

            private final String component1() {
                return this.featureType;
            }

            public static /* synthetic */ FeatureCardClick copy$default(FeatureCardClick featureCardClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = featureCardClick.featureType;
                }
                return featureCardClick.copy(str);
            }

            public final FeatureCardClick copy(String str) {
                str.getClass();
                return new FeatureCardClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FeatureCardClick) && zy5.m23838d(this.featureType, ((FeatureCardClick) obj).featureType);
            }

            public int hashCode() {
                return this.featureType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("FeatureCardClick(featureType=", this.featureType, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "feature_card_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, wfBxRVkDOVdoPZ.iNEoxswX), new vq8(AppBehaviorEvent.PARAM_FEATURE_TYPE, this.featureType));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class GoalCardClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String goalType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoalCardClick(String str) {
                super(null);
                str.getClass();
                this.goalType = str;
            }

            private final String component1() {
                return this.goalType;
            }

            public static /* synthetic */ GoalCardClick copy$default(GoalCardClick goalCardClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goalCardClick.goalType;
                }
                return goalCardClick.copy(str);
            }

            public final GoalCardClick copy(String str) {
                str.getClass();
                return new GoalCardClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoalCardClick) && zy5.m23838d(this.goalType, ((GoalCardClick) obj).goalType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "goal_card_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"), new vq8(AppBehaviorEvent.PARAM_GOAL_TYPE, this.goalType));
            }

            public int hashCode() {
                return this.goalType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("GoalCardClick(goalType=", this.goalType, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class OnboardingStepRevisited extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final int step;
            private final String stepName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnboardingStepRevisited(int i, String str) {
                super(null);
                str.getClass();
                this.step = i;
                this.stepName = str;
            }

            private final int component1() {
                return this.step;
            }

            private final String component2() {
                return this.stepName;
            }

            public static /* synthetic */ OnboardingStepRevisited copy$default(OnboardingStepRevisited onboardingStepRevisited, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = onboardingStepRevisited.step;
                }
                if ((i2 & 2) != 0) {
                    str = onboardingStepRevisited.stepName;
                }
                return onboardingStepRevisited.copy(i, str);
            }

            public final OnboardingStepRevisited copy(int i, String str) {
                str.getClass();
                return new OnboardingStepRevisited(i, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnboardingStepRevisited)) {
                    return false;
                }
                OnboardingStepRevisited onboardingStepRevisited = (OnboardingStepRevisited) obj;
                return this.step == onboardingStepRevisited.step && zy5.m23838d(this.stepName, onboardingStepRevisited.stepName);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "onboarding_step_revisited"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "onboarding"), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.step)), new vq8(AppBehaviorEvent.PARAM_STEP_NAME, this.stepName));
            }

            public int hashCode() {
                return this.stepName.hashCode() + (Integer.hashCode(this.step) * 31);
            }

            public String toString() {
                return "OnboardingStepRevisited(step=" + this.step + ", stepName=" + this.stepName + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ReferralCardClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReferralCardClick(String str) {
                super(null);
                str.getClass();
                this.screen = str;
            }

            private final String component1() {
                return this.screen;
            }

            public static /* synthetic */ ReferralCardClick copy$default(ReferralCardClick referralCardClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = referralCardClick.screen;
                }
                return referralCardClick.copy(str);
            }

            public final ReferralCardClick copy(String str) {
                str.getClass();
                return new ReferralCardClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReferralCardClick) && zy5.m23838d(this.screen, ((ReferralCardClick) obj).screen);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "referral_card_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen));
            }

            public int hashCode() {
                return this.screen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("ReferralCardClick(screen=", this.screen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SectionToggle extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final boolean expanded;
            private final String sectionName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionToggle(String str, boolean z) {
                super(null);
                str.getClass();
                this.sectionName = str;
                this.expanded = z;
            }

            private final String component1() {
                return this.sectionName;
            }

            private final boolean component2() {
                return this.expanded;
            }

            public static /* synthetic */ SectionToggle copy$default(SectionToggle sectionToggle, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sectionToggle.sectionName;
                }
                if ((i & 2) != 0) {
                    z = sectionToggle.expanded;
                }
                return sectionToggle.copy(str, z);
            }

            public final SectionToggle copy(String str, boolean z) {
                str.getClass();
                return new SectionToggle(str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SectionToggle)) {
                    return false;
                }
                SectionToggle sectionToggle = (SectionToggle) obj;
                return zy5.m23838d(this.sectionName, sectionToggle.sectionName) && this.expanded == sectionToggle.expanded;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, this.expanded ? "section_expanded" : "section_collapsed"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"), new vq8(AppBehaviorEvent.PARAM_SECTION_NAME, this.sectionName));
            }

            public int hashCode() {
                return Boolean.hashCode(this.expanded) + (this.sectionName.hashCode() * 31);
            }

            public String toString() {
                return "SectionToggle(sectionName=" + this.sectionName + ", expanded=" + this.expanded + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SettingsItemClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String itemType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SettingsItemClick(String str) {
                super(null);
                str.getClass();
                this.itemType = str;
            }

            private final String component1() {
                return this.itemType;
            }

            public static /* synthetic */ SettingsItemClick copy$default(SettingsItemClick settingsItemClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = settingsItemClick.itemType;
                }
                return settingsItemClick.copy(str);
            }

            public final SettingsItemClick copy(String str) {
                str.getClass();
                return new SettingsItemClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SettingsItemClick) && zy5.m23838d(this.itemType, ((SettingsItemClick) obj).itemType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "settings_item_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "more"), new vq8(AppBehaviorEvent.PARAM_ITEM_TYPE, this.itemType));
            }

            public int hashCode() {
                return this.itemType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SettingsItemClick(itemType=", this.itemType, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccConsentDeclineClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final SetupAccConsentDeclineClicked INSTANCE = new SetupAccConsentDeclineClicked();

            private SetupAccConsentDeclineClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SetupAccConsentDeclineClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_acc_consent_decline_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 756811829;
            }

            public String toString() {
                return "SetupAccConsentDeclineClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccConsentGrantClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final SetupAccConsentGrantClicked INSTANCE = new SetupAccConsentGrantClicked();

            private SetupAccConsentGrantClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SetupAccConsentGrantClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_acc_consent_grant_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 1788886095;
            }

            public String toString() {
                return "SetupAccConsentGrantClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccDeclineConfirmed extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final SetupAccDeclineConfirmed INSTANCE = new SetupAccDeclineConfirmed();

            private SetupAccDeclineConfirmed() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SetupAccDeclineConfirmed);
            }

            public int hashCode() {
                return -1166551649;
            }

            public String toString() {
                return "SetupAccDeclineConfirmed";
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(NwivstN.pfQePzXFu, "setup_acc_decline_confirmed");
                singletonMap.getClass();
                return singletonMap;
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccGotoSettingsClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final SetupAccGotoSettingsClicked INSTANCE = new SetupAccGotoSettingsClicked();

            private SetupAccGotoSettingsClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SetupAccGotoSettingsClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_acc_goto_settings_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return -856800693;
            }

            public String toString() {
                return "SetupAccGotoSettingsClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccPermissionResult extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final boolean granted;

            public SetupAccPermissionResult(boolean z) {
                super(null);
                this.granted = z;
            }

            private final boolean component1() {
                return this.granted;
            }

            public static /* synthetic */ SetupAccPermissionResult copy$default(SetupAccPermissionResult setupAccPermissionResult, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = setupAccPermissionResult.granted;
                }
                return setupAccPermissionResult.copy(z);
            }

            public final SetupAccPermissionResult copy(boolean z) {
                return new SetupAccPermissionResult(z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetupAccPermissionResult) && this.granted == ((SetupAccPermissionResult) obj).granted;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_acc_permission_result"), new vq8(AppBehaviorEvent.PARAM_RESULT, this.granted ? AppBehaviorEvent.PARAM_GRANTED : "not_granted"));
            }

            public int hashCode() {
                return Boolean.hashCode(this.granted);
            }

            public String toString() {
                return "SetupAccPermissionResult(granted=" + this.granted + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupAccessibilityConsentNavigated extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupAccessibilityConsentNavigated(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.deviceBrand = str;
                this.deviceModel = str2;
                this.osVersion = str3;
            }

            private final String component1() {
                return this.deviceBrand;
            }

            private final String component2() {
                return this.deviceModel;
            }

            private final String component3() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupAccessibilityConsentNavigated copy$default(SetupAccessibilityConsentNavigated setupAccessibilityConsentNavigated, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupAccessibilityConsentNavigated.deviceBrand;
                }
                if ((i & 2) != 0) {
                    str2 = setupAccessibilityConsentNavigated.deviceModel;
                }
                if ((i & 4) != 0) {
                    str3 = setupAccessibilityConsentNavigated.osVersion;
                }
                return setupAccessibilityConsentNavigated.copy(str, str2, str3);
            }

            public final SetupAccessibilityConsentNavigated copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new SetupAccessibilityConsentNavigated(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupAccessibilityConsentNavigated)) {
                    return false;
                }
                SetupAccessibilityConsentNavigated setupAccessibilityConsentNavigated = (SetupAccessibilityConsentNavigated) obj;
                return zy5.m23838d(this.deviceBrand, setupAccessibilityConsentNavigated.deviceBrand) && zy5.m23838d(this.deviceModel, setupAccessibilityConsentNavigated.deviceModel) && zy5.m23838d(this.osVersion, setupAccessibilityConsentNavigated.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_accessibility_consent_navigated"), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(this.deviceBrand.hashCode() * 31, this.deviceModel, 31);
            }

            public String toString() {
                String str = this.deviceBrand;
                String str2 = this.deviceModel;
                return pr1.m15980n(pr1.m15984r("SetupAccessibilityConsentNavigated(deviceBrand=", str, ", deviceModel=", str2, ", osVersion="), this.osVersion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupFlowStarted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String feature;
            private final String flowType;
            private final String osVersion;
            private final String source;
            private final String stepsList;
            private final int totalSteps;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupFlowStarted(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                str7.getClass();
                this.source = str;
                this.feature = str2;
                this.stepsList = str3;
                this.totalSteps = i;
                this.deviceBrand = str4;
                this.deviceModel = str5;
                this.osVersion = str6;
                this.flowType = str7;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.feature;
            }

            private final String component3() {
                return this.stepsList;
            }

            private final int component4() {
                return this.totalSteps;
            }

            private final String component5() {
                return this.deviceBrand;
            }

            private final String component6() {
                return this.deviceModel;
            }

            private final String component7() {
                return this.osVersion;
            }

            private final String component8() {
                return this.flowType;
            }

            public static /* synthetic */ SetupFlowStarted copy$default(SetupFlowStarted setupFlowStarted, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = setupFlowStarted.source;
                }
                if ((i2 & 2) != 0) {
                    str2 = setupFlowStarted.feature;
                }
                if ((i2 & 4) != 0) {
                    str3 = setupFlowStarted.stepsList;
                }
                if ((i2 & 8) != 0) {
                    i = setupFlowStarted.totalSteps;
                }
                if ((i2 & 16) != 0) {
                    str4 = setupFlowStarted.deviceBrand;
                }
                if ((i2 & 32) != 0) {
                    str5 = setupFlowStarted.deviceModel;
                }
                if ((i2 & 64) != 0) {
                    str6 = setupFlowStarted.osVersion;
                }
                if ((i2 & 128) != 0) {
                    str7 = setupFlowStarted.flowType;
                }
                String str8 = str6;
                String str9 = str7;
                String str10 = str4;
                String str11 = str5;
                return setupFlowStarted.copy(str, str2, str3, i, str10, str11, str8, str9);
            }

            public final SetupFlowStarted copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                str7.getClass();
                return new SetupFlowStarted(str, str2, str3, i, str4, str5, str6, str7);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupFlowStarted)) {
                    return false;
                }
                SetupFlowStarted setupFlowStarted = (SetupFlowStarted) obj;
                return zy5.m23838d(this.source, setupFlowStarted.source) && zy5.m23838d(this.feature, setupFlowStarted.feature) && zy5.m23838d(this.stepsList, setupFlowStarted.stepsList) && this.totalSteps == setupFlowStarted.totalSteps && zy5.m23838d(this.deviceBrand, setupFlowStarted.deviceBrand) && zy5.m23838d(this.deviceModel, setupFlowStarted.deviceModel) && zy5.m23838d(this.osVersion, setupFlowStarted.osVersion) && zy5.m23838d(this.flowType, setupFlowStarted.flowType);
            }

            public int hashCode() {
                return this.flowType.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(pr1.m15965A(this.totalSteps, t8c.m18683g(t8c.m18683g(this.source.hashCode() * 31, this.feature, 31), this.stepsList, 31), 31), this.deviceBrand, 31), this.deviceModel, 31), this.osVersion, 31);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_flow_started"), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source), new vq8(AppBehaviorEvent.PARAM_FEATURE, this.feature), new vq8(AppBehaviorEvent.PARAM_STEPS_LIST, this.stepsList), new vq8(AppBehaviorEvent.PARAM_TOTAL_STEPS, Integer.valueOf(this.totalSteps)), new vq8(QaBoVN.kvifrtf, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion), new vq8(AppBehaviorEvent.PARAM_FLOW_TYPE, this.flowType));
            }

            public String toString() {
                String str = this.source;
                String str2 = this.feature;
                String str3 = this.stepsList;
                int i = this.totalSteps;
                String str4 = this.deviceBrand;
                String str5 = this.deviceModel;
                String str6 = this.osVersion;
                String str7 = this.flowType;
                StringBuilder m15984r = pr1.m15984r(jcRNFy.BXx, str, ", feature=", str2, ", stepsList=");
                m15984r.append(str3);
                m15984r.append(", totalSteps=");
                m15984r.append(i);
                m15984r.append(", deviceBrand=");
                pr1.m15992z(m15984r, str4, ", deviceModel=", str5, ", osVersion=");
                return pr1.m15981o(m15984r, str6, ", flowType=", str7, ")");
            }

            public /* synthetic */ SetupFlowStarted(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, mr2 mr2Var) {
                this(str, str2, str3, i, str4, str5, str6, (i2 & 128) != 0 ? "" : str7);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupOptimizationConfirmed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupOptimizationConfirmed(String str, String str2, String str3, String str4) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.stepId = str;
                this.deviceBrand = str2;
                this.deviceModel = str3;
                this.osVersion = str4;
            }

            private final String component1() {
                return this.stepId;
            }

            private final String component2() {
                return this.deviceBrand;
            }

            private final String component3() {
                return this.deviceModel;
            }

            private final String component4() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupOptimizationConfirmed copy$default(SetupOptimizationConfirmed setupOptimizationConfirmed, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupOptimizationConfirmed.stepId;
                }
                if ((i & 2) != 0) {
                    str2 = setupOptimizationConfirmed.deviceBrand;
                }
                if ((i & 4) != 0) {
                    str3 = setupOptimizationConfirmed.deviceModel;
                }
                if ((i & 8) != 0) {
                    str4 = setupOptimizationConfirmed.osVersion;
                }
                return setupOptimizationConfirmed.copy(str, str2, str3, str4);
            }

            public final SetupOptimizationConfirmed copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new SetupOptimizationConfirmed(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupOptimizationConfirmed)) {
                    return false;
                }
                SetupOptimizationConfirmed setupOptimizationConfirmed = (SetupOptimizationConfirmed) obj;
                return zy5.m23838d(this.stepId, setupOptimizationConfirmed.stepId) && zy5.m23838d(this.deviceBrand, setupOptimizationConfirmed.deviceBrand) && zy5.m23838d(this.deviceModel, setupOptimizationConfirmed.deviceModel) && zy5.m23838d(this.osVersion, setupOptimizationConfirmed.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_optimization_confirmed"), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(this.stepId.hashCode() * 31, this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                String str = this.stepId;
                String str2 = this.deviceBrand;
                return pr1.m15981o(pr1.m15984r("SetupOptimizationConfirmed(stepId=", str, ", deviceBrand=", str2, ", deviceModel="), this.deviceModel, ", osVersion=", this.osVersion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupOptimizationRetry extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupOptimizationRetry(String str, String str2, String str3, String str4) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.stepId = str;
                this.deviceBrand = str2;
                this.deviceModel = str3;
                this.osVersion = str4;
            }

            private final String component1() {
                return this.stepId;
            }

            private final String component2() {
                return this.deviceBrand;
            }

            private final String component3() {
                return this.deviceModel;
            }

            private final String component4() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupOptimizationRetry copy$default(SetupOptimizationRetry setupOptimizationRetry, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupOptimizationRetry.stepId;
                }
                if ((i & 2) != 0) {
                    str2 = setupOptimizationRetry.deviceBrand;
                }
                if ((i & 4) != 0) {
                    str3 = setupOptimizationRetry.deviceModel;
                }
                if ((i & 8) != 0) {
                    str4 = setupOptimizationRetry.osVersion;
                }
                return setupOptimizationRetry.copy(str, str2, str3, str4);
            }

            public final SetupOptimizationRetry copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new SetupOptimizationRetry(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupOptimizationRetry)) {
                    return false;
                }
                SetupOptimizationRetry setupOptimizationRetry = (SetupOptimizationRetry) obj;
                return zy5.m23838d(this.stepId, setupOptimizationRetry.stepId) && zy5.m23838d(this.deviceBrand, setupOptimizationRetry.deviceBrand) && zy5.m23838d(this.deviceModel, setupOptimizationRetry.deviceModel) && zy5.m23838d(this.osVersion, setupOptimizationRetry.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_optimization_retry"), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(this.stepId.hashCode() * 31, this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                String str = this.stepId;
                String str2 = this.deviceBrand;
                return pr1.m15981o(pr1.m15984r("SetupOptimizationRetry(stepId=", str, ", deviceBrand=", str2, ", deviceModel="), this.deviceModel, ", osVersion=", this.osVersion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupPhoneMasterResult extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String error;
            private final String osVersion;
            private final String result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupPhoneMasterResult(String str, String str2, String str3, String str4, String str5) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.result = str;
                this.deviceBrand = str2;
                this.deviceModel = str3;
                this.osVersion = str4;
                this.error = str5;
            }

            private final String component1() {
                return this.result;
            }

            private final String component2() {
                return this.deviceBrand;
            }

            private final String component3() {
                return this.deviceModel;
            }

            private final String component4() {
                return this.osVersion;
            }

            private final String component5() {
                return this.error;
            }

            public static /* synthetic */ SetupPhoneMasterResult copy$default(SetupPhoneMasterResult setupPhoneMasterResult, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupPhoneMasterResult.result;
                }
                if ((i & 2) != 0) {
                    str2 = setupPhoneMasterResult.deviceBrand;
                }
                if ((i & 4) != 0) {
                    str3 = setupPhoneMasterResult.deviceModel;
                }
                if ((i & 8) != 0) {
                    str4 = setupPhoneMasterResult.osVersion;
                }
                if ((i & 16) != 0) {
                    str5 = setupPhoneMasterResult.error;
                }
                String str6 = str5;
                String str7 = str3;
                return setupPhoneMasterResult.copy(str, str2, str7, str4, str6);
            }

            public final SetupPhoneMasterResult copy(String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new SetupPhoneMasterResult(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupPhoneMasterResult)) {
                    return false;
                }
                SetupPhoneMasterResult setupPhoneMasterResult = (SetupPhoneMasterResult) obj;
                return zy5.m23838d(this.result, setupPhoneMasterResult.result) && zy5.m23838d(this.deviceBrand, setupPhoneMasterResult.deviceBrand) && zy5.m23838d(this.deviceModel, setupPhoneMasterResult.deviceModel) && zy5.m23838d(this.osVersion, setupPhoneMasterResult.osVersion) && zy5.m23838d(this.error, setupPhoneMasterResult.error);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_phone_master_result");
                g77Var.put(AppBehaviorEvent.PARAM_RESULT, this.result);
                g77Var.put(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand);
                g77Var.put(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel);
                g77Var.put(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion);
                String str = this.error;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_ERROR, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(t8c.m18683g(t8c.m18683g(this.result.hashCode() * 31, this.deviceBrand, 31), this.deviceModel, 31), this.osVersion, 31);
                String str = this.error;
                return m18683g + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.result;
                String str2 = this.deviceBrand;
                String str3 = this.deviceModel;
                String str4 = this.osVersion;
                String str5 = this.error;
                StringBuilder m15984r = pr1.m15984r("SetupPhoneMasterResult(result=", str, ", deviceBrand=", str2, ivWZ.IFEk);
                pr1.m15992z(m15984r, str3, ", osVersion=", str4, ", error=");
                return pr1.m15980n(m15984r, str5, ")");
            }

            public /* synthetic */ SetupPhoneMasterResult(String str, String str2, String str3, String str4, String str5, int i, mr2 mr2Var) {
                this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupStepActionClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;
            private final int stepIndex;
            private final String stepType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupStepActionClicked(int i, String str, String str2, String str3, String str4, String str5) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                this.stepIndex = i;
                this.stepId = str;
                this.stepType = str2;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
            }

            private final int component1() {
                return this.stepIndex;
            }

            private final String component2() {
                return this.stepId;
            }

            private final String component3() {
                return this.stepType;
            }

            private final String component4() {
                return this.deviceBrand;
            }

            private final String component5() {
                return this.deviceModel;
            }

            private final String component6() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupStepActionClicked copy$default(SetupStepActionClicked setupStepActionClicked, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = setupStepActionClicked.stepIndex;
                }
                if ((i2 & 2) != 0) {
                    str = setupStepActionClicked.stepId;
                }
                if ((i2 & 4) != 0) {
                    str2 = setupStepActionClicked.stepType;
                }
                if ((i2 & 8) != 0) {
                    str3 = setupStepActionClicked.deviceBrand;
                }
                if ((i2 & 16) != 0) {
                    str4 = setupStepActionClicked.deviceModel;
                }
                if ((i2 & 32) != 0) {
                    str5 = setupStepActionClicked.osVersion;
                }
                String str6 = str4;
                String str7 = str5;
                return setupStepActionClicked.copy(i, str, str2, str3, str6, str7);
            }

            public final SetupStepActionClicked copy(int i, String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new SetupStepActionClicked(i, str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupStepActionClicked)) {
                    return false;
                }
                SetupStepActionClicked setupStepActionClicked = (SetupStepActionClicked) obj;
                return this.stepIndex == setupStepActionClicked.stepIndex && zy5.m23838d(this.stepId, setupStepActionClicked.stepId) && zy5.m23838d(this.stepType, setupStepActionClicked.stepType) && zy5.m23838d(this.deviceBrand, setupStepActionClicked.deviceBrand) && zy5.m23838d(this.deviceModel, setupStepActionClicked.deviceModel) && zy5.m23838d(this.osVersion, setupStepActionClicked.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_step_action_clicked"), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.stepIndex)), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_STEP_TYPE, this.stepType), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(t8c.m18683g(Integer.hashCode(this.stepIndex) * 31, this.stepId, 31), this.stepType, 31), this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                int i = this.stepIndex;
                String str = this.stepId;
                String str2 = this.stepType;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                StringBuilder m15982p = pr1.m15982p(i, "SetupStepActionClicked(stepIndex=", ", stepId=", str, ", stepType=");
                pr1.m15992z(m15982p, str2, ", deviceBrand=", str3, ", deviceModel=");
                return pr1.m15981o(m15982p, str4, ", osVersion=", str5, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupStepCompleted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;
            private final int stepIndex;
            private final String stepType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupStepCompleted(int i, String str, String str2, String str3, String str4, String str5) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                this.stepIndex = i;
                this.stepId = str;
                this.stepType = str2;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
            }

            private final int component1() {
                return this.stepIndex;
            }

            private final String component2() {
                return this.stepId;
            }

            private final String component3() {
                return this.stepType;
            }

            private final String component4() {
                return this.deviceBrand;
            }

            private final String component5() {
                return this.deviceModel;
            }

            private final String component6() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupStepCompleted copy$default(SetupStepCompleted setupStepCompleted, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = setupStepCompleted.stepIndex;
                }
                if ((i2 & 2) != 0) {
                    str = setupStepCompleted.stepId;
                }
                if ((i2 & 4) != 0) {
                    str2 = setupStepCompleted.stepType;
                }
                if ((i2 & 8) != 0) {
                    str3 = setupStepCompleted.deviceBrand;
                }
                if ((i2 & 16) != 0) {
                    str4 = setupStepCompleted.deviceModel;
                }
                if ((i2 & 32) != 0) {
                    str5 = setupStepCompleted.osVersion;
                }
                String str6 = str4;
                String str7 = str5;
                return setupStepCompleted.copy(i, str, str2, str3, str6, str7);
            }

            public final SetupStepCompleted copy(int i, String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new SetupStepCompleted(i, str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupStepCompleted)) {
                    return false;
                }
                SetupStepCompleted setupStepCompleted = (SetupStepCompleted) obj;
                return this.stepIndex == setupStepCompleted.stepIndex && zy5.m23838d(this.stepId, setupStepCompleted.stepId) && zy5.m23838d(this.stepType, setupStepCompleted.stepType) && zy5.m23838d(this.deviceBrand, setupStepCompleted.deviceBrand) && zy5.m23838d(this.deviceModel, setupStepCompleted.deviceModel) && zy5.m23838d(this.osVersion, setupStepCompleted.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_step_completed"), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.stepIndex)), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_STEP_TYPE, this.stepType), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(t8c.m18683g(Integer.hashCode(this.stepIndex) * 31, this.stepId, 31), this.stepType, 31), this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                int i = this.stepIndex;
                String str = this.stepId;
                String str2 = this.stepType;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                StringBuilder m15982p = pr1.m15982p(i, "SetupStepCompleted(stepIndex=", ", stepId=", str, ", stepType=");
                pr1.m15992z(m15982p, str2, ", deviceBrand=", str3, ", deviceModel=");
                return pr1.m15981o(m15982p, str4, ", osVersion=", str5, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupStepViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;
            private final int stepIndex;
            private final String stepType;
            private final int totalSteps;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupStepViewed(int i, String str, String str2, int i2, String str3, String str4, String str5) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                this.stepIndex = i;
                this.stepId = str;
                this.stepType = str2;
                this.totalSteps = i2;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
            }

            private final int component1() {
                return this.stepIndex;
            }

            private final String component2() {
                return this.stepId;
            }

            private final String component3() {
                return this.stepType;
            }

            private final int component4() {
                return this.totalSteps;
            }

            private final String component5() {
                return this.deviceBrand;
            }

            private final String component6() {
                return this.deviceModel;
            }

            private final String component7() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupStepViewed copy$default(SetupStepViewed setupStepViewed, int i, String str, String str2, int i2, String str3, String str4, String str5, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = setupStepViewed.stepIndex;
                }
                if ((i3 & 2) != 0) {
                    str = setupStepViewed.stepId;
                }
                if ((i3 & 4) != 0) {
                    str2 = setupStepViewed.stepType;
                }
                if ((i3 & 8) != 0) {
                    i2 = setupStepViewed.totalSteps;
                }
                if ((i3 & 16) != 0) {
                    str3 = setupStepViewed.deviceBrand;
                }
                if ((i3 & 32) != 0) {
                    str4 = setupStepViewed.deviceModel;
                }
                if ((i3 & 64) != 0) {
                    str5 = setupStepViewed.osVersion;
                }
                String str6 = str4;
                String str7 = str5;
                String str8 = str3;
                String str9 = str2;
                return setupStepViewed.copy(i, str, str9, i2, str8, str6, str7);
            }

            public final SetupStepViewed copy(int i, String str, String str2, int i2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new SetupStepViewed(i, str, str2, i2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupStepViewed)) {
                    return false;
                }
                SetupStepViewed setupStepViewed = (SetupStepViewed) obj;
                return this.stepIndex == setupStepViewed.stepIndex && zy5.m23838d(this.stepId, setupStepViewed.stepId) && zy5.m23838d(this.stepType, setupStepViewed.stepType) && this.totalSteps == setupStepViewed.totalSteps && zy5.m23838d(this.deviceBrand, setupStepViewed.deviceBrand) && zy5.m23838d(this.deviceModel, setupStepViewed.deviceModel) && zy5.m23838d(this.osVersion, setupStepViewed.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_step_viewed"), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.stepIndex)), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_STEP_TYPE, this.stepType), new vq8(AppBehaviorEvent.PARAM_TOTAL_STEPS, Integer.valueOf(this.totalSteps)), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(pr1.m15965A(this.totalSteps, t8c.m18683g(t8c.m18683g(Integer.hashCode(this.stepIndex) * 31, this.stepId, 31), this.stepType, 31), 31), this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                int i = this.stepIndex;
                String str = this.stepId;
                String str2 = this.stepType;
                int i2 = this.totalSteps;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                StringBuilder m15982p = pr1.m15982p(i, "SetupStepViewed(stepIndex=", ", stepId=", str, ", stepType=");
                m15982p.append(str2);
                m15982p.append(", totalSteps=");
                m15982p.append(i2);
                m15982p.append(", deviceBrand=");
                pr1.m15992z(m15982p, str3, ", deviceModel=", str4, ", osVersion=");
                return pr1.m15980n(m15982p, str5, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupSupportLinkClicked extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String linkTarget;
            private final String osVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupSupportLinkClicked(String str, String str2, String str3, String str4) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.linkTarget = str;
                this.deviceBrand = str2;
                this.deviceModel = str3;
                this.osVersion = str4;
            }

            private final String component1() {
                return this.linkTarget;
            }

            private final String component2() {
                return this.deviceBrand;
            }

            private final String component3() {
                return this.deviceModel;
            }

            private final String component4() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupSupportLinkClicked copy$default(SetupSupportLinkClicked setupSupportLinkClicked, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupSupportLinkClicked.linkTarget;
                }
                if ((i & 2) != 0) {
                    str2 = setupSupportLinkClicked.deviceBrand;
                }
                if ((i & 4) != 0) {
                    str3 = setupSupportLinkClicked.deviceModel;
                }
                if ((i & 8) != 0) {
                    str4 = setupSupportLinkClicked.osVersion;
                }
                return setupSupportLinkClicked.copy(str, str2, str3, str4);
            }

            public final SetupSupportLinkClicked copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new SetupSupportLinkClicked(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupSupportLinkClicked)) {
                    return false;
                }
                SetupSupportLinkClicked setupSupportLinkClicked = (SetupSupportLinkClicked) obj;
                return zy5.m23838d(this.linkTarget, setupSupportLinkClicked.linkTarget) && zy5.m23838d(this.deviceBrand, setupSupportLinkClicked.deviceBrand) && zy5.m23838d(this.deviceModel, setupSupportLinkClicked.deviceModel) && zy5.m23838d(this.osVersion, setupSupportLinkClicked.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_support_link_clicked"), new vq8(AppBehaviorEvent.PARAM_LINK_TARGET, this.linkTarget), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(this.linkTarget.hashCode() * 31, this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                String str = this.linkTarget;
                String str2 = this.deviceBrand;
                return pr1.m15981o(pr1.m15984r("SetupSupportLinkClicked(linkTarget=", str, ", deviceBrand=", str2, ", deviceModel="), this.deviceModel, ", osVersion=", this.osVersion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupTutorialViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;
            private final String stepId;
            private final String tutorialType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupTutorialViewed(String str, String str2, String str3, String str4, String str5) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                this.stepId = str;
                this.tutorialType = str2;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
            }

            private final String component1() {
                return this.stepId;
            }

            private final String component2() {
                return this.tutorialType;
            }

            private final String component3() {
                return this.deviceBrand;
            }

            private final String component4() {
                return this.deviceModel;
            }

            private final String component5() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupTutorialViewed copy$default(SetupTutorialViewed setupTutorialViewed, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupTutorialViewed.stepId;
                }
                if ((i & 2) != 0) {
                    str2 = setupTutorialViewed.tutorialType;
                }
                if ((i & 4) != 0) {
                    str3 = setupTutorialViewed.deviceBrand;
                }
                if ((i & 8) != 0) {
                    str4 = setupTutorialViewed.deviceModel;
                }
                if ((i & 16) != 0) {
                    str5 = setupTutorialViewed.osVersion;
                }
                String str6 = str5;
                String str7 = str3;
                return setupTutorialViewed.copy(str, str2, str7, str4, str6);
            }

            public final SetupTutorialViewed copy(String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new SetupTutorialViewed(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupTutorialViewed)) {
                    return false;
                }
                SetupTutorialViewed setupTutorialViewed = (SetupTutorialViewed) obj;
                return zy5.m23838d(this.stepId, setupTutorialViewed.stepId) && zy5.m23838d(this.tutorialType, setupTutorialViewed.tutorialType) && zy5.m23838d(this.deviceBrand, setupTutorialViewed.deviceBrand) && zy5.m23838d(this.deviceModel, setupTutorialViewed.deviceModel) && zy5.m23838d(this.osVersion, setupTutorialViewed.osVersion);
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(this.stepId.hashCode() * 31, this.tutorialType, 31), this.deviceBrand, 31), this.deviceModel, 31);
            }

            public String toString() {
                String str = this.stepId;
                String str2 = this.tutorialType;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                StringBuilder m15984r = pr1.m15984r("SetupTutorialViewed(stepId=", str, ", tutorialType=", str2, ", deviceBrand=");
                pr1.m15992z(m15984r, str3, ", deviceModel=", str4, ", osVersion=");
                return pr1.m15980n(m15984r, str5, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_tutorial_viewed"), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.stepId), new vq8(AppBehaviorEvent.PARAM_TUTORIAL_TYPE, this.tutorialType), new vq8(mmUZEXxylxd.cxJtdIeja, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupXiaomiBatteryToast extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String osVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupXiaomiBatteryToast(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.deviceBrand = str;
                this.deviceModel = str2;
                this.osVersion = str3;
            }

            private final String component1() {
                return this.deviceBrand;
            }

            private final String component2() {
                return this.deviceModel;
            }

            private final String component3() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupXiaomiBatteryToast copy$default(SetupXiaomiBatteryToast setupXiaomiBatteryToast, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupXiaomiBatteryToast.deviceBrand;
                }
                if ((i & 2) != 0) {
                    str2 = setupXiaomiBatteryToast.deviceModel;
                }
                if ((i & 4) != 0) {
                    str3 = setupXiaomiBatteryToast.osVersion;
                }
                return setupXiaomiBatteryToast.copy(str, str2, str3);
            }

            public final SetupXiaomiBatteryToast copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new SetupXiaomiBatteryToast(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupXiaomiBatteryToast)) {
                    return false;
                }
                SetupXiaomiBatteryToast setupXiaomiBatteryToast = (SetupXiaomiBatteryToast) obj;
                return zy5.m23838d(this.deviceBrand, setupXiaomiBatteryToast.deviceBrand) && zy5.m23838d(this.deviceModel, setupXiaomiBatteryToast.deviceModel) && zy5.m23838d(this.osVersion, setupXiaomiBatteryToast.osVersion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_xiaomi_battery_toast"), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion));
            }

            public int hashCode() {
                return this.osVersion.hashCode() + t8c.m18683g(this.deviceBrand.hashCode() * 31, this.deviceModel, 31);
            }

            public String toString() {
                String str = this.deviceBrand;
                String str2 = this.deviceModel;
                return pr1.m15980n(pr1.m15984r("SetupXiaomiBatteryToast(deviceBrand=", str, ", deviceModel=", str2, ", osVersion="), this.osVersion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ShareDialogResponse extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String platform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareDialogResponse(String str) {
                super(null);
                str.getClass();
                this.platform = str;
            }

            private final String component1() {
                return this.platform;
            }

            public static /* synthetic */ ShareDialogResponse copy$default(ShareDialogResponse shareDialogResponse, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = shareDialogResponse.platform;
                }
                return shareDialogResponse.copy(str);
            }

            public final ShareDialogResponse copy(String str) {
                str.getClass();
                return new ShareDialogResponse(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShareDialogResponse) && zy5.m23838d(this.platform, ((ShareDialogResponse) obj).platform);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "share_dialog_response"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"), new vq8(AppBehaviorEvent.PARAM_PLATFORM, this.platform));
            }

            public int hashCode() {
                return this.platform.hashCode();
            }

            public String toString() {
                return tz6.m19210k("ShareDialogResponse(platform=", this.platform, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ShareDialogShown extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final ShareDialogShown INSTANCE = new ShareDialogShown();

            private ShareDialogShown() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ShareDialogShown);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "share_dialog_shown"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return -324351748;
            }

            public String toString() {
                return "ShareDialogShown";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SupervisionAction extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String actionType;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupervisionAction(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.actionType = str;
                this.screen = str2;
            }

            private final String component1() {
                return this.actionType;
            }

            private final String component2() {
                return this.screen;
            }

            public static /* synthetic */ SupervisionAction copy$default(SupervisionAction supervisionAction, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = supervisionAction.actionType;
                }
                if ((i & 2) != 0) {
                    str2 = supervisionAction.screen;
                }
                return supervisionAction.copy(str, str2);
            }

            public final SupervisionAction copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new SupervisionAction(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupervisionAction)) {
                    return false;
                }
                SupervisionAction supervisionAction = (SupervisionAction) obj;
                return zy5.m23838d(this.actionType, supervisionAction.actionType) && zy5.m23838d(this.screen, supervisionAction.screen);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "supervision_action"), new vq8(AppBehaviorEvent.PARAM_ACTION_TYPE, this.actionType), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen));
            }

            public int hashCode() {
                return this.screen.hashCode() + (this.actionType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("SupervisionAction(actionType=", this.actionType, ", screen=", this.screen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class TierUpgradeDialogResponse extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String featureName;
            private final String requiredTier;
            private final String screen;
            private final String userResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TierUpgradeDialogResponse(String str, String str2, String str3, String str4) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.screen = str;
                this.featureName = str2;
                this.requiredTier = str3;
                this.userResponse = str4;
            }

            private final String component1() {
                return this.screen;
            }

            private final String component2() {
                return this.featureName;
            }

            private final String component3() {
                return this.requiredTier;
            }

            private final String component4() {
                return this.userResponse;
            }

            public static /* synthetic */ TierUpgradeDialogResponse copy$default(TierUpgradeDialogResponse tierUpgradeDialogResponse, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tierUpgradeDialogResponse.screen;
                }
                if ((i & 2) != 0) {
                    str2 = tierUpgradeDialogResponse.featureName;
                }
                if ((i & 4) != 0) {
                    str3 = tierUpgradeDialogResponse.requiredTier;
                }
                if ((i & 8) != 0) {
                    str4 = tierUpgradeDialogResponse.userResponse;
                }
                return tierUpgradeDialogResponse.copy(str, str2, str3, str4);
            }

            public final TierUpgradeDialogResponse copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new TierUpgradeDialogResponse(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TierUpgradeDialogResponse)) {
                    return false;
                }
                TierUpgradeDialogResponse tierUpgradeDialogResponse = (TierUpgradeDialogResponse) obj;
                return zy5.m23838d(this.screen, tierUpgradeDialogResponse.screen) && zy5.m23838d(this.featureName, tierUpgradeDialogResponse.featureName) && zy5.m23838d(this.requiredTier, tierUpgradeDialogResponse.requiredTier) && zy5.m23838d(this.userResponse, tierUpgradeDialogResponse.userResponse);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "tier_upgrade_dialog_response"), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen), new vq8(AppBehaviorEvent.PARAM_FEATURE_NAME, this.featureName), new vq8(AppBehaviorEvent.PARAM_REQUIRED_TIER, this.requiredTier), new vq8(AppBehaviorEvent.PARAM_USER_RESPONSE, this.userResponse));
            }

            public int hashCode() {
                return this.userResponse.hashCode() + t8c.m18683g(t8c.m18683g(this.screen.hashCode() * 31, this.featureName, 31), this.requiredTier, 31);
            }

            public String toString() {
                String str = this.screen;
                String str2 = this.featureName;
                return pr1.m15981o(pr1.m15984r("TierUpgradeDialogResponse(screen=", str, ", featureName=", str2, ", requiredTier="), this.requiredTier, ", userResponse=", this.userResponse, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class TierUpgradeDialogShown extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String currentTier;
            private final String featureName;
            private final String requiredTier;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TierUpgradeDialogShown(String str, String str2, String str3, String str4) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.screen = str;
                this.featureName = str2;
                this.requiredTier = str3;
                this.currentTier = str4;
            }

            private final String component1() {
                return this.screen;
            }

            private final String component2() {
                return this.featureName;
            }

            private final String component3() {
                return this.requiredTier;
            }

            private final String component4() {
                return this.currentTier;
            }

            public static /* synthetic */ TierUpgradeDialogShown copy$default(TierUpgradeDialogShown tierUpgradeDialogShown, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tierUpgradeDialogShown.screen;
                }
                if ((i & 2) != 0) {
                    str2 = tierUpgradeDialogShown.featureName;
                }
                if ((i & 4) != 0) {
                    str3 = tierUpgradeDialogShown.requiredTier;
                }
                if ((i & 8) != 0) {
                    str4 = tierUpgradeDialogShown.currentTier;
                }
                return tierUpgradeDialogShown.copy(str, str2, str3, str4);
            }

            public final TierUpgradeDialogShown copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                return new TierUpgradeDialogShown(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TierUpgradeDialogShown)) {
                    return false;
                }
                TierUpgradeDialogShown tierUpgradeDialogShown = (TierUpgradeDialogShown) obj;
                return zy5.m23838d(this.screen, tierUpgradeDialogShown.screen) && zy5.m23838d(this.featureName, tierUpgradeDialogShown.featureName) && zy5.m23838d(this.requiredTier, tierUpgradeDialogShown.requiredTier) && zy5.m23838d(this.currentTier, tierUpgradeDialogShown.currentTier);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "tier_upgrade_dialog_shown"), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen), new vq8(AppBehaviorEvent.PARAM_FEATURE_NAME, this.featureName), new vq8(AppBehaviorEvent.PARAM_REQUIRED_TIER, this.requiredTier), new vq8(AppBehaviorEvent.PARAM_CURRENT_TIER, this.currentTier));
            }

            public int hashCode() {
                return this.currentTier.hashCode() + t8c.m18683g(t8c.m18683g(this.screen.hashCode() * 31, this.featureName, 31), this.requiredTier, 31);
            }

            public String toString() {
                String str = this.screen;
                String str2 = this.featureName;
                return pr1.m15981o(pr1.m15984r("TierUpgradeDialogShown(screen=", str, ", featureName=", str2, ", requiredTier="), this.requiredTier, ", currentTier=", this.currentTier, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ToolbarMenuClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final ToolbarMenuClick INSTANCE = new ToolbarMenuClick();

            private ToolbarMenuClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ToolbarMenuClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "toolbar_menu_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return -649023520;
            }

            public String toString() {
                return "ToolbarMenuClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ToolbarNotificationClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final ToolbarNotificationClick INSTANCE = new ToolbarNotificationClick();

            private ToolbarNotificationClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ToolbarNotificationClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "toolbar_notification_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return 1380134100;
            }

            public String toString() {
                return "ToolbarNotificationClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class TroubleshootingItemClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String itemType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TroubleshootingItemClick(String str) {
                super(null);
                str.getClass();
                this.itemType = str;
            }

            private final String component1() {
                return this.itemType;
            }

            public static /* synthetic */ TroubleshootingItemClick copy$default(TroubleshootingItemClick troubleshootingItemClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = troubleshootingItemClick.itemType;
                }
                return troubleshootingItemClick.copy(str);
            }

            public final TroubleshootingItemClick copy(String str) {
                str.getClass();
                return new TroubleshootingItemClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TroubleshootingItemClick) && zy5.m23838d(this.itemType, ((TroubleshootingItemClick) obj).itemType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "troubleshooting_item_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"), new vq8(AppBehaviorEvent.PARAM_ITEM_TYPE, this.itemType));
            }

            public int hashCode() {
                return this.itemType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("TroubleshootingItemClick(itemType=", this.itemType, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class UpdateBannerClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final UpdateBannerClick INSTANCE = new UpdateBannerClick();

            private UpdateBannerClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UpdateBannerClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "update_banner_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return 920375745;
            }

            public String toString() {
                return "UpdateBannerClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class UpgradeCtaClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final UpgradeCtaClick INSTANCE = new UpgradeCtaClick();

            private UpgradeCtaClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UpgradeCtaClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "upgrade_cta_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return -387013726;
            }

            public String toString() {
                return "UpgradeCtaClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ViewStatsClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            public static final ViewStatsClick INSTANCE = new ViewStatsClick();

            private ViewStatsClick() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ViewStatsClick);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "view_stats_click"), new vq8(AppBehaviorEvent.PARAM_SCREEN, "home"));
            }

            public int hashCode() {
                return 646433504;
            }

            public String toString() {
                return "ViewStatsClick";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class WebsiteBlockerAction extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String actionType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebsiteBlockerAction(String str) {
                super(null);
                str.getClass();
                this.actionType = str;
            }

            private final String component1() {
                return this.actionType;
            }

            public static /* synthetic */ WebsiteBlockerAction copy$default(WebsiteBlockerAction websiteBlockerAction, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = websiteBlockerAction.actionType;
                }
                return websiteBlockerAction.copy(str);
            }

            public final WebsiteBlockerAction copy(String str) {
                str.getClass();
                return new WebsiteBlockerAction(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WebsiteBlockerAction) && zy5.m23838d(this.actionType, ((WebsiteBlockerAction) obj).actionType);
            }

            public int hashCode() {
                return this.actionType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("WebsiteBlockerAction(actionType=", this.actionType, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, jcRNFy.OLJgz), new vq8(AppBehaviorEvent.PARAM_ACTION_TYPE, this.actionType));
            }
        }

        private AppBehaviorEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ AppBehaviorEvent(mr2 mr2Var) {
            this();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class NotificationItemClick extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String notificationType;

            public /* synthetic */ NotificationItemClick(String str, int i, mr2 mr2Var) {
                this((i & 1) != 0 ? null : str);
            }

            private final String component1() {
                return this.notificationType;
            }

            public static /* synthetic */ NotificationItemClick copy$default(NotificationItemClick notificationItemClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = notificationItemClick.notificationType;
                }
                return notificationItemClick.copy(str);
            }

            public final NotificationItemClick copy(String str) {
                return new NotificationItemClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotificationItemClick) && zy5.m23838d(this.notificationType, ((NotificationItemClick) obj).notificationType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "notification_item_click");
                g77Var.put(AppBehaviorEvent.PARAM_SCREEN, "notification_history");
                String str = this.notificationType;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_NOTIFICATION_TYPE, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                String str = this.notificationType;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return tz6.m19210k("NotificationItemClick(notificationType=", this.notificationType, ")");
            }

            public NotificationItemClick(String str) {
                super(null);
                this.notificationType = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NotificationItemClick() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ShareDialogDismissed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareDialogDismissed(String str) {
                super(null);
                str.getClass();
                this.source = str;
            }

            private final String component1() {
                return this.source;
            }

            public static /* synthetic */ ShareDialogDismissed copy$default(ShareDialogDismissed shareDialogDismissed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = shareDialogDismissed.source;
                }
                return shareDialogDismissed.copy(str);
            }

            public final ShareDialogDismissed copy(String str) {
                str.getClass();
                return new ShareDialogDismissed(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShareDialogDismissed) && zy5.m23838d(this.source, ((ShareDialogDismissed) obj).source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "share_dialog_dismissed"), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.source));
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return tz6.m19210k("ShareDialogDismissed(source=", this.source, ")");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ShareDialogDismissed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ ShareDialogDismissed(String str, int i, mr2 mr2Var) {
                this((i & 1) != 0 ? "home" : str);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ChildDeviceSelected extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceId;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChildDeviceSelected(String str, String str2) {
                super(null);
                str.getClass();
                this.screen = str;
                this.deviceId = str2;
            }

            private final String component1() {
                return this.screen;
            }

            private final String component2() {
                return this.deviceId;
            }

            public static /* synthetic */ ChildDeviceSelected copy$default(ChildDeviceSelected childDeviceSelected, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = childDeviceSelected.screen;
                }
                if ((i & 2) != 0) {
                    str2 = childDeviceSelected.deviceId;
                }
                return childDeviceSelected.copy(str, str2);
            }

            public final ChildDeviceSelected copy(String str, String str2) {
                str.getClass();
                return new ChildDeviceSelected(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChildDeviceSelected)) {
                    return false;
                }
                ChildDeviceSelected childDeviceSelected = (ChildDeviceSelected) obj;
                return zy5.m23838d(this.screen, childDeviceSelected.screen) && zy5.m23838d(this.deviceId, childDeviceSelected.deviceId);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "child_device_selected");
                g77Var.put(AppBehaviorEvent.PARAM_SCREEN, this.screen);
                String str = this.deviceId;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_DEVICE_ID, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int hashCode = this.screen.hashCode() * 31;
                String str = this.deviceId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return tz6.m19212m("ChildDeviceSelected(screen=", this.screen, ", deviceId=", this.deviceId, ")");
            }

            public /* synthetic */ ChildDeviceSelected(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class PremiumDialogShown extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String featureName;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PremiumDialogShown(String str, String str2) {
                super(null);
                str.getClass();
                this.screen = str;
                this.featureName = str2;
            }

            private final String component1() {
                return this.screen;
            }

            private final String component2() {
                return this.featureName;
            }

            public static /* synthetic */ PremiumDialogShown copy$default(PremiumDialogShown premiumDialogShown, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = premiumDialogShown.screen;
                }
                if ((i & 2) != 0) {
                    str2 = premiumDialogShown.featureName;
                }
                return premiumDialogShown.copy(str, str2);
            }

            public final PremiumDialogShown copy(String str, String str2) {
                str.getClass();
                return new PremiumDialogShown(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PremiumDialogShown)) {
                    return false;
                }
                PremiumDialogShown premiumDialogShown = (PremiumDialogShown) obj;
                return zy5.m23838d(this.screen, premiumDialogShown.screen) && zy5.m23838d(this.featureName, premiumDialogShown.featureName);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "premium_dialog_shown");
                g77Var.put(AppBehaviorEvent.PARAM_SCREEN, this.screen);
                String str = this.featureName;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_FEATURE_NAME, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int hashCode = this.screen.hashCode() * 31;
                String str = this.featureName;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return tz6.m19212m("PremiumDialogShown(screen=", this.screen, ", featureName=", this.featureName, ")");
            }

            public /* synthetic */ PremiumDialogShown(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsSetFailed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSetFailed(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.dns = str;
                this.protectionLevel = str2;
                this.source = str3;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            private final String component3() {
                return this.source;
            }

            public static /* synthetic */ DnsSetFailed copy$default(DnsSetFailed dnsSetFailed, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSetFailed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsSetFailed.protectionLevel;
                }
                if ((i & 4) != 0) {
                    str3 = dnsSetFailed.source;
                }
                return dnsSetFailed.copy(str, str2, str3);
            }

            public final DnsSetFailed copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DnsSetFailed(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSetFailed)) {
                    return false;
                }
                DnsSetFailed dnsSetFailed = (DnsSetFailed) obj;
                return zy5.m23838d(this.dns, dnsSetFailed.dns) && zy5.m23838d(this.protectionLevel, dnsSetFailed.protectionLevel) && zy5.m23838d(this.source, dnsSetFailed.source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_set_failed"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode() + t8c.m18683g(this.dns.hashCode() * 31, this.protectionLevel, 31);
            }

            public String toString() {
                String str = this.dns;
                String str2 = this.protectionLevel;
                return pr1.m15980n(pr1.m15984r("DnsSetFailed(dns=", str, ", protectionLevel=", str2, ", source="), this.source, ")");
            }

            public /* synthetic */ DnsSetFailed(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? "unknown" : str3);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsSetSuccess extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protectionLevel;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSetSuccess(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.dns = str;
                this.protectionLevel = str2;
                this.source = str3;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protectionLevel;
            }

            private final String component3() {
                return this.source;
            }

            public static /* synthetic */ DnsSetSuccess copy$default(DnsSetSuccess dnsSetSuccess, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSetSuccess.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsSetSuccess.protectionLevel;
                }
                if ((i & 4) != 0) {
                    str3 = dnsSetSuccess.source;
                }
                return dnsSetSuccess.copy(str, str2, str3);
            }

            public final DnsSetSuccess copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DnsSetSuccess(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSetSuccess)) {
                    return false;
                }
                DnsSetSuccess dnsSetSuccess = (DnsSetSuccess) obj;
                return zy5.m23838d(this.dns, dnsSetSuccess.dns) && zy5.m23838d(this.protectionLevel, dnsSetSuccess.protectionLevel) && zy5.m23838d(this.source, dnsSetSuccess.source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_set_success"), new vq8(AppBehaviorEvent.PARAM_DNS, this.dns), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode() + t8c.m18683g(this.dns.hashCode() * 31, this.protectionLevel, 31);
            }

            public String toString() {
                String str = this.dns;
                String str2 = this.protectionLevel;
                return pr1.m15980n(pr1.m15984r("DnsSetSuccess(dns=", str, ", protectionLevel=", str2, ", source="), this.source, ")");
            }

            public /* synthetic */ DnsSetSuccess(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? "unknown" : str3);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ScreenViewed extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String previousScreen;
            private final String screenName;
            private final String sourceScreen;

            public /* synthetic */ ScreenViewed(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }

            private final String component1() {
                return this.screenName;
            }

            private final String component2() {
                return this.previousScreen;
            }

            private final String component3() {
                return this.sourceScreen;
            }

            public static /* synthetic */ ScreenViewed copy$default(ScreenViewed screenViewed, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = screenViewed.screenName;
                }
                if ((i & 2) != 0) {
                    str2 = screenViewed.previousScreen;
                }
                if ((i & 4) != 0) {
                    str3 = screenViewed.sourceScreen;
                }
                return screenViewed.copy(str, str2, str3);
            }

            public final ScreenViewed copy(String str, String str2, String str3) {
                str.getClass();
                return new ScreenViewed(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScreenViewed)) {
                    return false;
                }
                ScreenViewed screenViewed = (ScreenViewed) obj;
                return zy5.m23838d(this.screenName, screenViewed.screenName) && zy5.m23838d(this.previousScreen, screenViewed.previousScreen) && zy5.m23838d(this.sourceScreen, screenViewed.sourceScreen);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "screen_viewed");
                g77Var.put(AppBehaviorEvent.PARAM_SCREEN, this.screenName);
                String str = this.previousScreen;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_PREVIOUS_SCREEN, str);
                }
                String str2 = this.sourceScreen;
                if (str2 != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_SOURCE_SCREEN, str2);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int hashCode = this.screenName.hashCode() * 31;
                String str = this.previousScreen;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.sourceScreen;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                String str = this.screenName;
                String str2 = this.previousScreen;
                return pr1.m15980n(pr1.m15984r("ScreenViewed(screenName=", str, ", previousScreen=", str2, ", sourceScreen="), this.sourceScreen, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenViewed(String str, String str2, String str3) {
                super(null);
                str.getClass();
                this.screenName = str;
                this.previousScreen = str2;
                this.sourceScreen = str3;
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class GuardToggled extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final boolean enabled;
            private final String guardType;
            private final String screen;
            private final String trigger;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GuardToggled(String str, boolean z, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.guardType = str;
                this.enabled = z;
                this.screen = str2;
                this.trigger = str3;
            }

            private final String component1() {
                return this.guardType;
            }

            private final boolean component2() {
                return this.enabled;
            }

            private final String component3() {
                return this.screen;
            }

            private final String component4() {
                return this.trigger;
            }

            public static /* synthetic */ GuardToggled copy$default(GuardToggled guardToggled, String str, boolean z, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = guardToggled.guardType;
                }
                if ((i & 2) != 0) {
                    z = guardToggled.enabled;
                }
                if ((i & 4) != 0) {
                    str2 = guardToggled.screen;
                }
                if ((i & 8) != 0) {
                    str3 = guardToggled.trigger;
                }
                return guardToggled.copy(str, z, str2, str3);
            }

            public final GuardToggled copy(String str, boolean z, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new GuardToggled(str, z, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GuardToggled)) {
                    return false;
                }
                GuardToggled guardToggled = (GuardToggled) obj;
                return zy5.m23838d(this.guardType, guardToggled.guardType) && this.enabled == guardToggled.enabled && zy5.m23838d(this.screen, guardToggled.screen) && zy5.m23838d(this.trigger, guardToggled.trigger);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "guard_toggled"), new vq8(AppBehaviorEvent.PARAM_GUARD_TYPE, this.guardType), new vq8(AppBehaviorEvent.PARAM_ENABLED, Boolean.valueOf(this.enabled)), new vq8(AppBehaviorEvent.PARAM_SCREEN, this.screen), new vq8(AppBehaviorEvent.PARAM_TRIGGER, this.trigger));
            }

            public int hashCode() {
                return this.trigger.hashCode() + t8c.m18683g(t8c.m18682f(this.guardType.hashCode() * 31, 31, this.enabled), this.screen, 31);
            }

            public String toString() {
                String str = this.guardType;
                boolean z = this.enabled;
                String str2 = this.screen;
                String str3 = this.trigger;
                StringBuilder sb = new StringBuilder("GuardToggled(guardType=");
                sb.append(str);
                sb.append(", enabled=");
                sb.append(z);
                sb.append(", screen=");
                return pr1.m15981o(sb, str2, ", trigger=", str3, ")");
            }

            public /* synthetic */ GuardToggled(String str, boolean z, String str2, String str3, int i, mr2 mr2Var) {
                this(str, z, str2, (i & 8) != 0 ? "manual" : str3);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DnsSetupCompleted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String protectionLevel;
            private final String source;
            private final boolean success;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSetupCompleted(String str, boolean z, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.protectionLevel = str;
                this.success = z;
                this.source = str2;
            }

            private final String component1() {
                return this.protectionLevel;
            }

            private final boolean component2() {
                return this.success;
            }

            private final String component3() {
                return this.source;
            }

            public static /* synthetic */ DnsSetupCompleted copy$default(DnsSetupCompleted dnsSetupCompleted, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSetupCompleted.protectionLevel;
                }
                if ((i & 2) != 0) {
                    z = dnsSetupCompleted.success;
                }
                if ((i & 4) != 0) {
                    str2 = dnsSetupCompleted.source;
                }
                return dnsSetupCompleted.copy(str, z, str2);
            }

            public final DnsSetupCompleted copy(String str, boolean z, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsSetupCompleted(str, z, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSetupCompleted)) {
                    return false;
                }
                DnsSetupCompleted dnsSetupCompleted = (DnsSetupCompleted) obj;
                return zy5.m23838d(this.protectionLevel, dnsSetupCompleted.protectionLevel) && this.success == dnsSetupCompleted.success && zy5.m23838d(this.source, dnsSetupCompleted.source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "dns_setup_completed"), new vq8(AppBehaviorEvent.PARAM_PROTECTION_LEVEL, this.protectionLevel), new vq8(AppBehaviorEvent.PARAM_SUCCESS, Boolean.valueOf(this.success)), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode() + t8c.m18682f(this.protectionLevel.hashCode() * 31, 31, this.success);
            }

            public String toString() {
                String str = this.protectionLevel;
                boolean z = this.success;
                String str2 = this.source;
                StringBuilder sb = new StringBuilder("DnsSetupCompleted(protectionLevel=");
                sb.append(str);
                sb.append(", success=");
                sb.append(z);
                sb.append(", source=");
                return pr1.m15980n(sb, str2, ")");
            }

            public /* synthetic */ DnsSetupCompleted(String str, boolean z, String str2, int i, mr2 mr2Var) {
                this(str, z, (i & 4) != 0 ? "unknown" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class PremiumDialogResponse extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String featureName;
            private final String screen;
            private final String userResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PremiumDialogResponse(String str, String str2, String str3) {
                super(null);
                str.getClass();
                str2.getClass();
                this.screen = str;
                this.userResponse = str2;
                this.featureName = str3;
            }

            private final String component1() {
                return this.screen;
            }

            private final String component2() {
                return this.userResponse;
            }

            private final String component3() {
                return this.featureName;
            }

            public static /* synthetic */ PremiumDialogResponse copy$default(PremiumDialogResponse premiumDialogResponse, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = premiumDialogResponse.screen;
                }
                if ((i & 2) != 0) {
                    str2 = premiumDialogResponse.userResponse;
                }
                if ((i & 4) != 0) {
                    str3 = premiumDialogResponse.featureName;
                }
                return premiumDialogResponse.copy(str, str2, str3);
            }

            public final PremiumDialogResponse copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                return new PremiumDialogResponse(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PremiumDialogResponse)) {
                    return false;
                }
                PremiumDialogResponse premiumDialogResponse = (PremiumDialogResponse) obj;
                return zy5.m23838d(this.screen, premiumDialogResponse.screen) && zy5.m23838d(this.userResponse, premiumDialogResponse.userResponse) && zy5.m23838d(this.featureName, premiumDialogResponse.featureName);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "premium_dialog_response");
                g77Var.put(AppBehaviorEvent.PARAM_SCREEN, this.screen);
                g77Var.put(AppBehaviorEvent.PARAM_USER_RESPONSE, this.userResponse);
                String str = this.featureName;
                if (str != null) {
                    g77Var.put(AppBehaviorEvent.PARAM_FEATURE_NAME, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(this.screen.hashCode() * 31, this.userResponse, 31);
                String str = this.featureName;
                return m18683g + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.screen;
                String str2 = this.userResponse;
                return pr1.m15980n(pr1.m15984r("PremiumDialogResponse(screen=", str, ", userResponse=", str2, ", featureName="), this.featureName, ")");
            }

            public /* synthetic */ PremiumDialogResponse(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupFlowEmptyState extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String feature;
            private final String flowType;
            private final String osVersion;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupFlowEmptyState(String str, String str2, String str3, String str4, String str5, String str6) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                this.source = str;
                this.feature = str2;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
                this.flowType = str6;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.feature;
            }

            private final String component3() {
                return this.deviceBrand;
            }

            private final String component4() {
                return this.deviceModel;
            }

            private final String component5() {
                return this.osVersion;
            }

            private final String component6() {
                return this.flowType;
            }

            public static /* synthetic */ SetupFlowEmptyState copy$default(SetupFlowEmptyState setupFlowEmptyState, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupFlowEmptyState.source;
                }
                if ((i & 2) != 0) {
                    str2 = setupFlowEmptyState.feature;
                }
                if ((i & 4) != 0) {
                    str3 = setupFlowEmptyState.deviceBrand;
                }
                if ((i & 8) != 0) {
                    str4 = setupFlowEmptyState.deviceModel;
                }
                if ((i & 16) != 0) {
                    str5 = setupFlowEmptyState.osVersion;
                }
                if ((i & 32) != 0) {
                    str6 = setupFlowEmptyState.flowType;
                }
                String str7 = str5;
                String str8 = str6;
                return setupFlowEmptyState.copy(str, str2, str3, str4, str7, str8);
            }

            public final SetupFlowEmptyState copy(String str, String str2, String str3, String str4, String str5, String str6) {
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                return new SetupFlowEmptyState(str, str2, str3, str4, str5, str6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupFlowEmptyState)) {
                    return false;
                }
                SetupFlowEmptyState setupFlowEmptyState = (SetupFlowEmptyState) obj;
                return zy5.m23838d(this.source, setupFlowEmptyState.source) && zy5.m23838d(this.feature, setupFlowEmptyState.feature) && zy5.m23838d(this.deviceBrand, setupFlowEmptyState.deviceBrand) && zy5.m23838d(this.deviceModel, setupFlowEmptyState.deviceModel) && zy5.m23838d(this.osVersion, setupFlowEmptyState.osVersion) && zy5.m23838d(this.flowType, setupFlowEmptyState.flowType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_flow_empty_state"), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source), new vq8(AppBehaviorEvent.PARAM_FEATURE, this.feature), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion), new vq8(AppBehaviorEvent.PARAM_FLOW_TYPE, this.flowType));
            }

            public int hashCode() {
                return this.flowType.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(t8c.m18683g(this.source.hashCode() * 31, this.feature, 31), this.deviceBrand, 31), this.deviceModel, 31), this.osVersion, 31);
            }

            public String toString() {
                String str = this.source;
                String str2 = this.feature;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                String str6 = this.flowType;
                StringBuilder m15984r = pr1.m15984r("SetupFlowEmptyState(source=", str, ", feature=", str2, ", deviceBrand=");
                pr1.m15992z(m15984r, str3, ", deviceModel=", str4, ", osVersion=");
                return pr1.m15981o(m15984r, str5, ", flowType=", str6, ")");
            }

            public /* synthetic */ SetupFlowEmptyState(String str, String str2, String str3, String str4, String str5, String str6, int i, mr2 mr2Var) {
                this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupFlowCompleted extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final String deviceBrand;
            private final String deviceModel;
            private final String feature;
            private final String flowType;
            private final String osVersion;
            private final String source;
            private final int totalSteps;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupFlowCompleted(String str, String str2, int i, String str3, String str4, String str5, String str6) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                this.source = str;
                this.feature = str2;
                this.totalSteps = i;
                this.deviceBrand = str3;
                this.deviceModel = str4;
                this.osVersion = str5;
                this.flowType = str6;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.feature;
            }

            private final int component3() {
                return this.totalSteps;
            }

            private final String component4() {
                return this.deviceBrand;
            }

            private final String component5() {
                return this.deviceModel;
            }

            private final String component6() {
                return this.osVersion;
            }

            private final String component7() {
                return this.flowType;
            }

            public static /* synthetic */ SetupFlowCompleted copy$default(SetupFlowCompleted setupFlowCompleted, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = setupFlowCompleted.source;
                }
                if ((i2 & 2) != 0) {
                    str2 = setupFlowCompleted.feature;
                }
                if ((i2 & 4) != 0) {
                    i = setupFlowCompleted.totalSteps;
                }
                if ((i2 & 8) != 0) {
                    str3 = setupFlowCompleted.deviceBrand;
                }
                if ((i2 & 16) != 0) {
                    str4 = setupFlowCompleted.deviceModel;
                }
                if ((i2 & 32) != 0) {
                    str5 = setupFlowCompleted.osVersion;
                }
                if ((i2 & 64) != 0) {
                    str6 = setupFlowCompleted.flowType;
                }
                String str7 = str5;
                String str8 = str6;
                String str9 = str4;
                int i3 = i;
                return setupFlowCompleted.copy(str, str2, i3, str3, str9, str7, str8);
            }

            public final SetupFlowCompleted copy(String str, String str2, int i, String str3, String str4, String str5, String str6) {
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                return new SetupFlowCompleted(str, str2, i, str3, str4, str5, str6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupFlowCompleted)) {
                    return false;
                }
                SetupFlowCompleted setupFlowCompleted = (SetupFlowCompleted) obj;
                return zy5.m23838d(this.source, setupFlowCompleted.source) && zy5.m23838d(this.feature, setupFlowCompleted.feature) && this.totalSteps == setupFlowCompleted.totalSteps && zy5.m23838d(this.deviceBrand, setupFlowCompleted.deviceBrand) && zy5.m23838d(this.deviceModel, setupFlowCompleted.deviceModel) && zy5.m23838d(this.osVersion, setupFlowCompleted.osVersion) && zy5.m23838d(this.flowType, setupFlowCompleted.flowType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_flow_completed"), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source), new vq8(AppBehaviorEvent.PARAM_FEATURE, this.feature), new vq8(AppBehaviorEvent.PARAM_TOTAL_STEPS, Integer.valueOf(this.totalSteps)), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion), new vq8(AppBehaviorEvent.PARAM_FLOW_TYPE, this.flowType));
            }

            public int hashCode() {
                return this.flowType.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(pr1.m15965A(this.totalSteps, t8c.m18683g(this.source.hashCode() * 31, this.feature, 31), 31), this.deviceBrand, 31), this.deviceModel, 31), this.osVersion, 31);
            }

            public String toString() {
                String str = this.source;
                String str2 = this.feature;
                int i = this.totalSteps;
                String str3 = this.deviceBrand;
                String str4 = this.deviceModel;
                String str5 = this.osVersion;
                String str6 = this.flowType;
                StringBuilder m15984r = pr1.m15984r("SetupFlowCompleted(source=", str, ", feature=", str2, ", totalSteps=");
                m15984r.append(i);
                m15984r.append(", deviceBrand=");
                m15984r.append(str3);
                m15984r.append(", deviceModel=");
                pr1.m15992z(m15984r, str4, ", osVersion=", str5, ", flowType=");
                return pr1.m15980n(m15984r, str6, ")");
            }

            public /* synthetic */ SetupFlowCompleted(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, mr2 mr2Var) {
                this(str, str2, i, str3, str4, str5, (i2 & 64) != 0 ? "" : str6);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SetupFlowAbandoned extends AppBehaviorEvent {
            public static final int $stable = 0;
            private final int completedSteps;
            private final String deviceBrand;
            private final String deviceModel;
            private final String feature;
            private final String flowType;
            private final String lastStepId;
            private final int lastStepIndex;
            private final String osVersion;
            private final String source;
            private final int totalSteps;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupFlowAbandoned(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, String str6, String str7) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                str7.getClass();
                this.source = str;
                this.feature = str2;
                this.lastStepIndex = i;
                this.lastStepId = str3;
                this.completedSteps = i2;
                this.totalSteps = i3;
                this.deviceBrand = str4;
                this.deviceModel = str5;
                this.osVersion = str6;
                this.flowType = str7;
            }

            private final String component1() {
                return this.source;
            }

            private final String component10() {
                return this.flowType;
            }

            private final String component2() {
                return this.feature;
            }

            private final int component3() {
                return this.lastStepIndex;
            }

            private final String component4() {
                return this.lastStepId;
            }

            private final int component5() {
                return this.completedSteps;
            }

            private final int component6() {
                return this.totalSteps;
            }

            private final String component7() {
                return this.deviceBrand;
            }

            private final String component8() {
                return this.deviceModel;
            }

            private final String component9() {
                return this.osVersion;
            }

            public static /* synthetic */ SetupFlowAbandoned copy$default(SetupFlowAbandoned setupFlowAbandoned, String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, String str6, String str7, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = setupFlowAbandoned.source;
                }
                if ((i4 & 2) != 0) {
                    str2 = setupFlowAbandoned.feature;
                }
                if ((i4 & 4) != 0) {
                    i = setupFlowAbandoned.lastStepIndex;
                }
                if ((i4 & 8) != 0) {
                    str3 = setupFlowAbandoned.lastStepId;
                }
                if ((i4 & 16) != 0) {
                    i2 = setupFlowAbandoned.completedSteps;
                }
                if ((i4 & 32) != 0) {
                    i3 = setupFlowAbandoned.totalSteps;
                }
                if ((i4 & 64) != 0) {
                    str4 = setupFlowAbandoned.deviceBrand;
                }
                if ((i4 & 128) != 0) {
                    str5 = setupFlowAbandoned.deviceModel;
                }
                if ((i4 & 256) != 0) {
                    str6 = setupFlowAbandoned.osVersion;
                }
                if ((i4 & 512) != 0) {
                    str7 = setupFlowAbandoned.flowType;
                }
                String str8 = str6;
                String str9 = str7;
                String str10 = str4;
                String str11 = str5;
                int i5 = i2;
                int i6 = i3;
                return setupFlowAbandoned.copy(str, str2, i, str3, i5, i6, str10, str11, str8, str9);
            }

            public final SetupFlowAbandoned copy(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, String str6, String str7) {
                sj8.m18084A(str, str2, str3, str4, str5);
                str6.getClass();
                str7.getClass();
                return new SetupFlowAbandoned(str, str2, i, str3, i2, i3, str4, str5, str6, str7);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupFlowAbandoned)) {
                    return false;
                }
                SetupFlowAbandoned setupFlowAbandoned = (SetupFlowAbandoned) obj;
                return zy5.m23838d(this.source, setupFlowAbandoned.source) && zy5.m23838d(this.feature, setupFlowAbandoned.feature) && this.lastStepIndex == setupFlowAbandoned.lastStepIndex && zy5.m23838d(this.lastStepId, setupFlowAbandoned.lastStepId) && this.completedSteps == setupFlowAbandoned.completedSteps && this.totalSteps == setupFlowAbandoned.totalSteps && zy5.m23838d(this.deviceBrand, setupFlowAbandoned.deviceBrand) && zy5.m23838d(this.deviceModel, setupFlowAbandoned.deviceModel) && zy5.m23838d(this.osVersion, setupFlowAbandoned.osVersion) && zy5.m23838d(this.flowType, setupFlowAbandoned.flowType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AppBehaviorEvent.PARAM_BEHAVIOR_ACTION, "setup_flow_abandoned"), new vq8(AppBehaviorEvent.PARAM_SOURCE, this.source), new vq8(AppBehaviorEvent.PARAM_FEATURE, this.feature), new vq8(AppBehaviorEvent.PARAM_STEP, Integer.valueOf(this.lastStepIndex)), new vq8(AppBehaviorEvent.PARAM_STEP_ID, this.lastStepId), new vq8(AppBehaviorEvent.PARAM_COMPLETED_STEPS, Integer.valueOf(this.completedSteps)), new vq8(AppBehaviorEvent.PARAM_TOTAL_STEPS, Integer.valueOf(this.totalSteps)), new vq8(AppBehaviorEvent.PARAM_DEVICE_BRAND, this.deviceBrand), new vq8(AppBehaviorEvent.PARAM_DEVICE_MODEL, this.deviceModel), new vq8(AppBehaviorEvent.PARAM_OS_VERSION, this.osVersion), new vq8(AppBehaviorEvent.PARAM_FLOW_TYPE, this.flowType));
            }

            public int hashCode() {
                return this.flowType.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(pr1.m15965A(this.totalSteps, pr1.m15965A(this.completedSteps, t8c.m18683g(pr1.m15965A(this.lastStepIndex, t8c.m18683g(this.source.hashCode() * 31, this.feature, 31), 31), this.lastStepId, 31), 31), 31), this.deviceBrand, 31), this.deviceModel, 31), this.osVersion, 31);
            }

            public String toString() {
                String str = this.source;
                String str2 = this.feature;
                int i = this.lastStepIndex;
                String str3 = this.lastStepId;
                int i2 = this.completedSteps;
                int i3 = this.totalSteps;
                String str4 = this.deviceBrand;
                String str5 = this.deviceModel;
                String str6 = this.osVersion;
                String str7 = this.flowType;
                StringBuilder m15984r = pr1.m15984r("SetupFlowAbandoned(source=", str, ", feature=", str2, ", lastStepIndex=");
                m15984r.append(i);
                m15984r.append(", lastStepId=");
                m15984r.append(str3);
                m15984r.append(", completedSteps=");
                sj8.m18085B(m15984r, i2, ", totalSteps=", i3, ", deviceBrand=");
                pr1.m15992z(m15984r, str4, ", deviceModel=", str5, ", osVersion=");
                return pr1.m15981o(m15984r, str6, ", flowType=", str7, ")");
            }

            public /* synthetic */ SetupFlowAbandoned(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, String str6, String str7, int i4, mr2 mr2Var) {
                this(str, str2, i, str3, i2, i3, str4, str5, str6, (i4 & 512) != 0 ? "" : str7);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class AuthEvent extends AnalyticsEvent {
        private static final String ACTION_AUTH = "action_auth";
        private static final String EVENT_NAME = "auth";
        private static final String PARAM_AUTH_ACTIVITY = "auth_activity";
        private static final String PARAM_LOGOUT_TYPE = "logout_type";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class LoginAttempt extends AuthEvent {
            public static final int $stable = 8;
            private final dlb sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoginAttempt(dlb dlbVar) {
                super(AuthEvent.ACTION_AUTH, new vq8[]{new vq8(AuthEvent.PARAM_AUTH_ACTIVITY, zd0.f52187m.m10828H()), new vq8(AuthEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())}, null);
                dlbVar.getClass();
                this.sourceScreen = dlbVar;
            }

            private final dlb component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ LoginAttempt copy$default(LoginAttempt loginAttempt, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    dlbVar = loginAttempt.sourceScreen;
                }
                return loginAttempt.copy(dlbVar);
            }

            public final LoginAttempt copy(dlb dlbVar) {
                dlbVar.getClass();
                return new LoginAttempt(dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoginAttempt) && zy5.m23838d(this.sourceScreen, ((LoginAttempt) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return "LoginAttempt(sourceScreen=" + this.sourceScreen + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class LoginSuccess extends AuthEvent {
            public static final int $stable = 0;
            public static final LoginSuccess INSTANCE = new LoginSuccess();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LoginSuccess);
            }

            public int hashCode() {
                return -1048833365;
            }

            public String toString() {
                return "LoginSuccess";
            }

            private LoginSuccess() {
                super(gcwXtavsqv.NBXyyOQoYXZ, new vq8[]{new vq8(AuthEvent.PARAM_AUTH_ACTIVITY, ae0.f761m.m10828H())}, null);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Logout extends AuthEvent {
            public static final int $stable = 8;
            private final String logoutType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Logout(String str) {
                super(AuthEvent.ACTION_AUTH, new vq8[]{new vq8(AuthEvent.PARAM_AUTH_ACTIVITY, be0.f3173m.m10828H()), new vq8(AuthEvent.PARAM_LOGOUT_TYPE, str)}, null);
                str.getClass();
                this.logoutType = str;
            }

            private final String component1() {
                return this.logoutType;
            }

            public static /* synthetic */ Logout copy$default(Logout logout, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = logout.logoutType;
                }
                return logout.copy(str);
            }

            public final Logout copy(String str) {
                str.getClass();
                return new Logout(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Logout) && zy5.m23838d(this.logoutType, ((Logout) obj).logoutType);
            }

            public int hashCode() {
                return this.logoutType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("Logout(logoutType=", this.logoutType, ")");
            }
        }

        private AuthEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ AuthEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class BillingErrorEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_BACKEND_VERIFICATION_FAILURE = "action_backend_verification_failure";
        private static final String ACTION_PURCHASE_FLOW_FAILURE = "action_purchase_flow_failure";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "billing_error";
        private static final String PARAM_AUTH_TOKEN_LENGTH = "auth_token_length";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_ERROR_TYPE = "error_type";
        private static final String PARAM_PRODUCT_ID = "product_id";
        private final String actionName;
        private final String errorMessage;
        private final String errorType;
        private final String productId;

        public /* synthetic */ BillingErrorEvent(String str, String str2, String str3, String str4, int i, mr2 mr2Var) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, null);
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            g77 g77Var = new g77();
            g77Var.put(AnalyticsEvent.PARAM_ACTION, this.actionName);
            g77Var.put(PARAM_ERROR_TYPE, this.errorType);
            g77Var.put(PARAM_ERROR_MESSAGE, this.errorMessage);
            String str = this.productId;
            if (str != null) {
                g77Var.put(PARAM_PRODUCT_ID, str);
            }
            return g77Var.m8404b();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ BillingErrorEvent(String str, String str2, String str3, String str4, mr2 mr2Var) {
            this(str, str2, str3, str4);
        }

        private BillingErrorEvent(String str, String str2, String str3, String str4) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.errorType = str2;
            this.errorMessage = str3;
            this.productId = str4;
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class PurchaseFlowFailure extends BillingErrorEvent {
            public static final int $stable = 0;
            private final String errorMessage;
            private final String errorType;
            private final String productId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PurchaseFlowFailure(String str, String str2, String str3) {
                super(BillingErrorEvent.ACTION_PURCHASE_FLOW_FAILURE, str, str2, str3, null);
                str.getClass();
                str2.getClass();
                this.errorType = str;
                this.errorMessage = str2;
                this.productId = str3;
            }

            private final String component1() {
                return this.errorType;
            }

            private final String component2() {
                return this.errorMessage;
            }

            private final String component3() {
                return this.productId;
            }

            public static /* synthetic */ PurchaseFlowFailure copy$default(PurchaseFlowFailure purchaseFlowFailure, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = purchaseFlowFailure.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = purchaseFlowFailure.errorMessage;
                }
                if ((i & 4) != 0) {
                    str3 = purchaseFlowFailure.productId;
                }
                return purchaseFlowFailure.copy(str, str2, str3);
            }

            public final PurchaseFlowFailure copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                return new PurchaseFlowFailure(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PurchaseFlowFailure)) {
                    return false;
                }
                PurchaseFlowFailure purchaseFlowFailure = (PurchaseFlowFailure) obj;
                return zy5.m23838d(this.errorType, purchaseFlowFailure.errorType) && zy5.m23838d(this.errorMessage, purchaseFlowFailure.errorMessage) && zy5.m23838d(this.productId, purchaseFlowFailure.productId);
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(this.errorType.hashCode() * 31, this.errorMessage, 31);
                String str = this.productId;
                return m18683g + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.errorType;
                String str2 = this.errorMessage;
                return pr1.m15980n(pr1.m15984r("PurchaseFlowFailure(errorType=", str, ", errorMessage=", str2, ", productId="), this.productId, ")");
            }

            public /* synthetic */ PurchaseFlowFailure(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class BackendVerificationFailure extends BillingErrorEvent {
            public static final int $stable = 0;
            private final Integer authTokenLength;
            private final String errorMessage;
            private final String errorType;
            private final String productId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackendVerificationFailure(String str, String str2, String str3, Integer num) {
                super(BillingErrorEvent.ACTION_BACKEND_VERIFICATION_FAILURE, str, str2, str3, null);
                str.getClass();
                str2.getClass();
                this.errorType = str;
                this.errorMessage = str2;
                this.productId = str3;
                this.authTokenLength = num;
            }

            private final String component1() {
                return this.errorType;
            }

            private final String component2() {
                return this.errorMessage;
            }

            private final String component3() {
                return this.productId;
            }

            private final Integer component4() {
                return this.authTokenLength;
            }

            public static /* synthetic */ BackendVerificationFailure copy$default(BackendVerificationFailure backendVerificationFailure, String str, String str2, String str3, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = backendVerificationFailure.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = backendVerificationFailure.errorMessage;
                }
                if ((i & 4) != 0) {
                    str3 = backendVerificationFailure.productId;
                }
                if ((i & 8) != 0) {
                    num = backendVerificationFailure.authTokenLength;
                }
                return backendVerificationFailure.copy(str, str2, str3, num);
            }

            public final BackendVerificationFailure copy(String str, String str2, String str3, Integer num) {
                str.getClass();
                str2.getClass();
                return new BackendVerificationFailure(str, str2, str3, num);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BackendVerificationFailure)) {
                    return false;
                }
                BackendVerificationFailure backendVerificationFailure = (BackendVerificationFailure) obj;
                return zy5.m23838d(this.errorType, backendVerificationFailure.errorType) && zy5.m23838d(this.errorMessage, backendVerificationFailure.errorMessage) && zy5.m23838d(this.productId, backendVerificationFailure.productId) && zy5.m23838d(this.authTokenLength, backendVerificationFailure.authTokenLength);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent.BillingErrorEvent, com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AnalyticsEvent.PARAM_ACTION, BillingErrorEvent.ACTION_BACKEND_VERIFICATION_FAILURE);
                g77Var.put(BillingErrorEvent.PARAM_ERROR_TYPE, this.errorType);
                g77Var.put(BillingErrorEvent.PARAM_ERROR_MESSAGE, this.errorMessage);
                String str = this.productId;
                if (str != null) {
                    g77Var.put(BillingErrorEvent.PARAM_PRODUCT_ID, str);
                }
                Integer num = this.authTokenLength;
                if (num != null) {
                    g77Var.put(BillingErrorEvent.PARAM_AUTH_TOKEN_LENGTH, Integer.valueOf(num.intValue()));
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(this.errorType.hashCode() * 31, this.errorMessage, 31);
                String str = this.productId;
                int hashCode = (m18683g + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.authTokenLength;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                String str = this.errorType;
                String str2 = this.errorMessage;
                String str3 = this.productId;
                Integer num = this.authTokenLength;
                StringBuilder m15984r = pr1.m15984r("BackendVerificationFailure(errorType=", str, ", errorMessage=", str2, ", productId=");
                m15984r.append(str3);
                m15984r.append(", authTokenLength=");
                m15984r.append(num);
                m15984r.append(")");
                return m15984r.toString();
            }

            public /* synthetic */ BackendVerificationFailure(String str, String str2, String str3, Integer num, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class BrowserLaunchEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_LAUNCH_ATTEMPT = "action_launch_attempt";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "browser_launch";
        public static final String FLOW_LOGIN = "login";
        public static final String FLOW_PAYMENT = "payment";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_ERROR_TYPE = "error_type";
        private static final String PARAM_EXCEPTION_CLASS = "exception_class";
        private static final String PARAM_FLOW = "flow";
        private static final String PARAM_LAUNCH_METHOD = "launch_method";
        private static final String PARAM_SUCCESS = "success";
        private final String actionName;
        private final String errorMessage;
        private final String errorType;
        private final String exceptionClass;
        private final String flow;
        private final String launchMethod;
        private final boolean success;

        public /* synthetic */ BrowserLaunchEvent(String str, String str2, boolean z, String str3, String str4, String str5, String str6, int i, mr2 mr2Var) {
            this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, null);
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            g77 g77Var = new g77();
            g77Var.put(AnalyticsEvent.PARAM_ACTION, this.actionName);
            g77Var.put(PARAM_LAUNCH_METHOD, this.launchMethod);
            g77Var.put(PARAM_SUCCESS, Boolean.valueOf(this.success));
            String str = this.flow;
            if (str != null) {
                g77Var.put(PARAM_FLOW, str);
            }
            String str2 = this.errorType;
            if (str2 != null) {
                g77Var.put(PARAM_ERROR_TYPE, str2);
            }
            String str3 = this.errorMessage;
            if (str3 != null) {
                g77Var.put(PARAM_ERROR_MESSAGE, str3);
            }
            String str4 = this.exceptionClass;
            if (str4 != null) {
                g77Var.put(PARAM_EXCEPTION_CLASS, str4);
            }
            return g77Var.m8404b();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ BrowserLaunchEvent(String str, String str2, boolean z, String str3, String str4, String str5, String str6, mr2 mr2Var) {
            this(str, str2, z, str3, str4, str5, str6);
        }

        private BrowserLaunchEvent(String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.launchMethod = str2;
            this.success = z;
            this.flow = str3;
            this.errorType = str4;
            this.errorMessage = str5;
            this.exceptionClass = str6;
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class LaunchAttempt extends BrowserLaunchEvent {
            public static final int $stable = 0;
            private final String errorMessage;
            private final String errorType;
            private final String exceptionClass;
            private final String flow;
            private final String launchMethod;
            private final boolean success;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LaunchAttempt(String str, boolean z, String str2, String str3, String str4, String str5) {
                super(BrowserLaunchEvent.ACTION_LAUNCH_ATTEMPT, str, z, str2, str3, str4, str5, null);
                str.getClass();
                str2.getClass();
                this.launchMethod = str;
                this.success = z;
                this.flow = str2;
                this.errorType = str3;
                this.errorMessage = str4;
                this.exceptionClass = str5;
            }

            private final String component1() {
                return this.launchMethod;
            }

            private final boolean component2() {
                return this.success;
            }

            private final String component3() {
                return this.flow;
            }

            private final String component4() {
                return this.errorType;
            }

            private final String component5() {
                return this.errorMessage;
            }

            private final String component6() {
                return this.exceptionClass;
            }

            public static /* synthetic */ LaunchAttempt copy$default(LaunchAttempt launchAttempt, String str, boolean z, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = launchAttempt.launchMethod;
                }
                if ((i & 2) != 0) {
                    z = launchAttempt.success;
                }
                if ((i & 4) != 0) {
                    str2 = launchAttempt.flow;
                }
                if ((i & 8) != 0) {
                    str3 = launchAttempt.errorType;
                }
                if ((i & 16) != 0) {
                    str4 = launchAttempt.errorMessage;
                }
                if ((i & 32) != 0) {
                    str5 = launchAttempt.exceptionClass;
                }
                String str6 = str4;
                String str7 = str5;
                return launchAttempt.copy(str, z, str2, str3, str6, str7);
            }

            public final LaunchAttempt copy(String str, boolean z, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                return new LaunchAttempt(str, z, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAttempt)) {
                    return false;
                }
                LaunchAttempt launchAttempt = (LaunchAttempt) obj;
                return zy5.m23838d(this.launchMethod, launchAttempt.launchMethod) && this.success == launchAttempt.success && zy5.m23838d(this.flow, launchAttempt.flow) && zy5.m23838d(this.errorType, launchAttempt.errorType) && zy5.m23838d(this.errorMessage, launchAttempt.errorMessage) && zy5.m23838d(this.exceptionClass, launchAttempt.exceptionClass);
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(t8c.m18682f(this.launchMethod.hashCode() * 31, 31, this.success), this.flow, 31);
                String str = this.errorType;
                int hashCode = (m18683g + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.errorMessage;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.exceptionClass;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                String str = this.launchMethod;
                boolean z = this.success;
                String str2 = this.flow;
                String str3 = this.errorType;
                String str4 = this.errorMessage;
                String str5 = this.exceptionClass;
                StringBuilder sb = new StringBuilder("LaunchAttempt(launchMethod=");
                sb.append(str);
                sb.append(", success=");
                sb.append(z);
                sb.append(", flow=");
                pr1.m15992z(sb, str2, ", errorType=", str3, ", errorMessage=");
                return pr1.m15981o(sb, str4, ", exceptionClass=", str5, ")");
            }

            public /* synthetic */ LaunchAttempt(String str, boolean z, String str2, String str3, String str4, String str5, int i, mr2 mr2Var) {
                this(str, z, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class CopiedDnsEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_COPIED_DNS = "action_copy_dns";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "copy_dns";
        private static final String PARAM_DNS_COPIED = "dns_copied";
        private static final String PARAM_PROTECTION_COPIED = "protection_copied";
        private final String actionName;
        private final String dns;
        private final String protection;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CopiedDns extends CopiedDnsEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CopiedDns(String str, String str2) {
                super(CopiedDnsEvent.ACTION_COPIED_DNS, str, str2, null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protection = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            public static /* synthetic */ CopiedDns copy$default(CopiedDns copiedDns, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = copiedDns.dns;
                }
                if ((i & 2) != 0) {
                    str2 = copiedDns.protection;
                }
                return copiedDns.copy(str, str2);
            }

            public final CopiedDns copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new CopiedDns(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CopiedDns)) {
                    return false;
                }
                CopiedDns copiedDns = (CopiedDns) obj;
                return zy5.m23838d(this.dns, copiedDns.dns) && zy5.m23838d(this.protection, copiedDns.protection);
            }

            public int hashCode() {
                return this.protection.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("CopiedDns(dns=", this.dns, ", protection=", this.protection, ")");
            }
        }

        private CopiedDnsEvent(String str, String str2, String str3) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.dns = str2;
            this.protection = str3;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_DNS_COPIED, this.dns), new vq8(PARAM_PROTECTION_COPIED, this.protection));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ CopiedDnsEvent(String str, String str2, String str3, mr2 mr2Var) {
            this(str, str2, str3);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class CopyScreenEvent extends AnalyticsEvent {
        private static final String ACTION_ENTER_COPY_SCREEN = "action_enter_copy_screen";
        private static final String EVENT_NAME = "copy_screen_activity";
        private static final String PARAM_DNS_COPY_SCREEN = "dns_copy_screen";
        private static final String PARAM_PROTECTION_COPY_SCREEN = "protection_copy_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class EnterCopyScreenScreen extends CopyScreenEvent {
            public static final int $stable = 8;
            private final String dns;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnterCopyScreenScreen(String str, String str2) {
                super(CopyScreenEvent.ACTION_ENTER_COPY_SCREEN, new vq8[]{new vq8(CopyScreenEvent.PARAM_PROTECTION_COPY_SCREEN, str2), new vq8(CopyScreenEvent.PARAM_DNS_COPY_SCREEN, str)}, null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protection = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            public static /* synthetic */ EnterCopyScreenScreen copy$default(EnterCopyScreenScreen enterCopyScreenScreen, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enterCopyScreenScreen.dns;
                }
                if ((i & 2) != 0) {
                    str2 = enterCopyScreenScreen.protection;
                }
                return enterCopyScreenScreen.copy(str, str2);
            }

            public final EnterCopyScreenScreen copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new EnterCopyScreenScreen(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EnterCopyScreenScreen)) {
                    return false;
                }
                EnterCopyScreenScreen enterCopyScreenScreen = (EnterCopyScreenScreen) obj;
                return zy5.m23838d(this.dns, enterCopyScreenScreen.dns) && zy5.m23838d(this.protection, enterCopyScreenScreen.protection);
            }

            public int hashCode() {
                return this.protection.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("EnterCopyScreenScreen(dns=", this.dns, ", protection=", this.protection, ")");
            }
        }

        private CopyScreenEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ CopyScreenEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DailyStatusEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_STATUS_SNAPSHOT = "action_status_snapshot";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "daily_status";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Snapshot extends DailyStatusEvent {
            public static final int $stable = 0;
            private final Map<String, Object> properties;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Snapshot(Map<String, ? extends Object> map) {
                super(null);
                map.getClass();
                this.properties = map;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14872I(this.properties, o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, DailyStatusEvent.ACTION_STATUS_SNAPSHOT), new vq8("timestamp", Long.valueOf(zv5.f53149a.mo2814g().m22370e()))));
            }
        }

        private DailyStatusEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DailyStatusEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsBootstrapDiagnosticEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_BOOTSTRAP_CHECK = "action_bootstrap_check";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "dns_bootstrap_diagnostic";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class BootstrapCheck extends DnsBootstrapDiagnosticEvent {
            public static final int $stable = 0;
            private final int attempt;
            private final Map<String, Object> bootstrapData;
            private final String connectionType;
            private final boolean isFinal;
            private final boolean isVpnActive;
            private final int maxAttempts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BootstrapCheck(Map<String, ? extends Object> map, String str, boolean z, int i, int i2, boolean z2) {
                super(null);
                map.getClass();
                str.getClass();
                this.bootstrapData = map;
                this.connectionType = str;
                this.isVpnActive = z;
                this.attempt = i;
                this.maxAttempts = i2;
                this.isFinal = z2;
            }

            private final Map<String, Object> component1() {
                return this.bootstrapData;
            }

            private final String component2() {
                return this.connectionType;
            }

            private final boolean component3() {
                return this.isVpnActive;
            }

            private final int component4() {
                return this.attempt;
            }

            private final int component5() {
                return this.maxAttempts;
            }

            private final boolean component6() {
                return this.isFinal;
            }

            public static /* synthetic */ BootstrapCheck copy$default(BootstrapCheck bootstrapCheck, Map map, String str, boolean z, int i, int i2, boolean z2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    map = bootstrapCheck.bootstrapData;
                }
                if ((i3 & 2) != 0) {
                    str = bootstrapCheck.connectionType;
                }
                if ((i3 & 4) != 0) {
                    z = bootstrapCheck.isVpnActive;
                }
                if ((i3 & 8) != 0) {
                    i = bootstrapCheck.attempt;
                }
                if ((i3 & 16) != 0) {
                    i2 = bootstrapCheck.maxAttempts;
                }
                if ((i3 & 32) != 0) {
                    z2 = bootstrapCheck.isFinal;
                }
                int i4 = i2;
                boolean z3 = z2;
                return bootstrapCheck.copy(map, str, z, i, i4, z3);
            }

            public final BootstrapCheck copy(Map<String, ? extends Object> map, String str, boolean z, int i, int i2, boolean z2) {
                map.getClass();
                str.getClass();
                return new BootstrapCheck(map, str, z, i, i2, z2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BootstrapCheck)) {
                    return false;
                }
                BootstrapCheck bootstrapCheck = (BootstrapCheck) obj;
                return zy5.m23838d(this.bootstrapData, bootstrapCheck.bootstrapData) && zy5.m23838d(this.connectionType, bootstrapCheck.connectionType) && this.isVpnActive == bootstrapCheck.isVpnActive && this.attempt == bootstrapCheck.attempt && this.maxAttempts == bootstrapCheck.maxAttempts && this.isFinal == bootstrapCheck.isFinal;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AnalyticsEvent.PARAM_ACTION, DnsBootstrapDiagnosticEvent.ACTION_BOOTSTRAP_CHECK);
                g77Var.put("connection_type", this.connectionType);
                g77Var.put("is_vpn_active", Boolean.valueOf(this.isVpnActive));
                g77Var.put("attempt", Integer.valueOf(this.attempt));
                g77Var.put("max_attempts", Integer.valueOf(this.maxAttempts));
                g77Var.put("is_final", Boolean.valueOf(this.isFinal));
                for (Map.Entry<String, Object> entry : this.bootstrapData.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        g77Var.put(key, value);
                    }
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFinal) + pr1.m15965A(this.maxAttempts, pr1.m15965A(this.attempt, t8c.m18682f(t8c.m18683g(this.bootstrapData.hashCode() * 31, this.connectionType, 31), 31, this.isVpnActive), 31), 31);
            }

            public String toString() {
                return "BootstrapCheck(bootstrapData=" + this.bootstrapData + ", connectionType=" + this.connectionType + ", isVpnActive=" + this.isVpnActive + ", attempt=" + this.attempt + ", maxAttempts=" + this.maxAttempts + ", isFinal=" + this.isFinal + ")";
            }
        }

        private DnsBootstrapDiagnosticEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsBootstrapDiagnosticEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsDiagnosticEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_DIAGNOSTIC_RUN = "action_diagnostic_run";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "dns_diagnostic";

        private DnsDiagnosticEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsDiagnosticEvent(mr2 mr2Var) {
            this();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DiagnosticRun extends DnsDiagnosticEvent {
            public static final int $stable = 0;
            private final boolean capturedOffline;
            private final String currentDns;
            private final Map<String, Object> diagnosticData;
            private final boolean fromWorker;
            private final boolean isDnsFailure;
            private final boolean isKahfDns;
            private final String lastKnownDns;
            private final String lastKnownIp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiagnosticRun(Map<String, ? extends Object> map, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
                super(null);
                map.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.diagnosticData = map;
                this.currentDns = str;
                this.lastKnownDns = str2;
                this.lastKnownIp = str3;
                this.isKahfDns = z;
                this.isDnsFailure = z2;
                this.capturedOffline = z3;
                this.fromWorker = z4;
            }

            private final Map<String, Object> component1() {
                return this.diagnosticData;
            }

            private final String component2() {
                return this.currentDns;
            }

            private final String component3() {
                return this.lastKnownDns;
            }

            private final String component4() {
                return this.lastKnownIp;
            }

            private final boolean component5() {
                return this.isKahfDns;
            }

            private final boolean component6() {
                return this.isDnsFailure;
            }

            private final boolean component7() {
                return this.capturedOffline;
            }

            private final boolean component8() {
                return this.fromWorker;
            }

            public static /* synthetic */ DiagnosticRun copy$default(DiagnosticRun diagnosticRun, Map map, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = diagnosticRun.diagnosticData;
                }
                if ((i & 2) != 0) {
                    str = diagnosticRun.currentDns;
                }
                if ((i & 4) != 0) {
                    str2 = diagnosticRun.lastKnownDns;
                }
                if ((i & 8) != 0) {
                    str3 = diagnosticRun.lastKnownIp;
                }
                if ((i & 16) != 0) {
                    z = diagnosticRun.isKahfDns;
                }
                if ((i & 32) != 0) {
                    z2 = diagnosticRun.isDnsFailure;
                }
                if ((i & 64) != 0) {
                    z3 = diagnosticRun.capturedOffline;
                }
                if ((i & 128) != 0) {
                    z4 = diagnosticRun.fromWorker;
                }
                boolean z5 = z3;
                boolean z6 = z4;
                boolean z7 = z;
                boolean z8 = z2;
                return diagnosticRun.copy(map, str, str2, str3, z7, z8, z5, z6);
            }

            public final DiagnosticRun copy(Map<String, ? extends Object> map, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
                map.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DiagnosticRun(map, str, str2, str3, z, z2, z3, z4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DiagnosticRun)) {
                    return false;
                }
                DiagnosticRun diagnosticRun = (DiagnosticRun) obj;
                return zy5.m23838d(this.diagnosticData, diagnosticRun.diagnosticData) && zy5.m23838d(this.currentDns, diagnosticRun.currentDns) && zy5.m23838d(this.lastKnownDns, diagnosticRun.lastKnownDns) && zy5.m23838d(this.lastKnownIp, diagnosticRun.lastKnownIp) && this.isKahfDns == diagnosticRun.isKahfDns && this.isDnsFailure == diagnosticRun.isDnsFailure && this.capturedOffline == diagnosticRun.capturedOffline && this.fromWorker == diagnosticRun.fromWorker;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AnalyticsEvent.PARAM_ACTION, DnsDiagnosticEvent.ACTION_DIAGNOSTIC_RUN);
                g77Var.put("current_dns", this.currentDns);
                g77Var.put(PrefKeys.LAST_KNOWN_DNS, this.lastKnownDns);
                g77Var.put(PrefKeys.LAST_KNOWN_IP, this.lastKnownIp);
                g77Var.put("is_kahf_dns", Boolean.valueOf(this.isKahfDns));
                g77Var.put("is_dns_failure", Boolean.valueOf(this.isDnsFailure));
                g77Var.put("captured_offline", Boolean.valueOf(this.capturedOffline));
                g77Var.put("from_worker", Boolean.valueOf(this.fromWorker));
                for (Map.Entry<String, Object> entry : this.diagnosticData.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        g77Var.put(key, value);
                    }
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                return Boolean.hashCode(this.fromWorker) + t8c.m18682f(t8c.m18682f(t8c.m18682f(t8c.m18683g(t8c.m18683g(t8c.m18683g(this.diagnosticData.hashCode() * 31, this.currentDns, 31), this.lastKnownDns, 31), this.lastKnownIp, 31), 31, this.isKahfDns), 31, this.isDnsFailure), 31, this.capturedOffline);
            }

            public String toString() {
                Map<String, Object> map = this.diagnosticData;
                String str = this.currentDns;
                String str2 = this.lastKnownDns;
                String str3 = this.lastKnownIp;
                boolean z = this.isKahfDns;
                boolean z2 = this.isDnsFailure;
                boolean z3 = this.capturedOffline;
                boolean z4 = this.fromWorker;
                StringBuilder sb = new StringBuilder("DiagnosticRun(diagnosticData=");
                sb.append(map);
                sb.append(", currentDns=");
                sb.append(str);
                sb.append(", lastKnownDns=");
                pr1.m15992z(sb, str2, ", lastKnownIp=", str3, ", isKahfDns=");
                tz6.m19225z(sb, z, ", isDnsFailure=", z2, ", capturedOffline=");
                sb.append(z3);
                sb.append(", fromWorker=");
                sb.append(z4);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ DiagnosticRun(Map map, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, mr2 mr2Var) {
                this(map, str, str2, str3, z, z2, z3, (i & 128) != 0 ? false : z4);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsEvent extends AnalyticsEvent {
        private static final String ACTION_ENTER_SET_DNS_SCREEN = "action_enter_set_dns_screen";
        private static final String ACTION_ENTER_UNSET_DNS_SCREEN = "action_enter_unset_dns_screen";
        private static final String EVENT_NAME = "dns_activity";
        private static final String PARAM_DNS_SET = "dns_set";
        private static final String PARAM_DNS_UNSET = "dns_unset";
        private static final String PARAM_PROTECTION_SET = "protection_set";
        private static final String PARAM_PROTECTION_UNSET = "protection_unset";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class EnterSetDnsScreen extends DnsEvent {
            public static final int $stable = 8;
            private final String dns;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnterSetDnsScreen(String str, String str2) {
                super(DnsEvent.ACTION_ENTER_SET_DNS_SCREEN, new vq8[]{new vq8(DnsEvent.PARAM_PROTECTION_SET, str2), new vq8(DnsEvent.PARAM_DNS_SET, str)}, null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protection = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            public static /* synthetic */ EnterSetDnsScreen copy$default(EnterSetDnsScreen enterSetDnsScreen, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enterSetDnsScreen.dns;
                }
                if ((i & 2) != 0) {
                    str2 = enterSetDnsScreen.protection;
                }
                return enterSetDnsScreen.copy(str, str2);
            }

            public final EnterSetDnsScreen copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new EnterSetDnsScreen(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EnterSetDnsScreen)) {
                    return false;
                }
                EnterSetDnsScreen enterSetDnsScreen = (EnterSetDnsScreen) obj;
                return zy5.m23838d(this.dns, enterSetDnsScreen.dns) && zy5.m23838d(this.protection, enterSetDnsScreen.protection);
            }

            public int hashCode() {
                return this.protection.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("EnterSetDnsScreen(dns=", this.dns, ", protection=", this.protection, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class EnterUnsetDnsScreen extends DnsEvent {
            public static final int $stable = 8;
            private final String dns;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnterUnsetDnsScreen(String str, String str2) {
                super(DnsEvent.ACTION_ENTER_UNSET_DNS_SCREEN, new vq8[]{new vq8(DnsEvent.PARAM_PROTECTION_UNSET, str2), new vq8(DnsEvent.PARAM_DNS_UNSET, str)}, null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protection = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            public static /* synthetic */ EnterUnsetDnsScreen copy$default(EnterUnsetDnsScreen enterUnsetDnsScreen, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enterUnsetDnsScreen.dns;
                }
                if ((i & 2) != 0) {
                    str2 = enterUnsetDnsScreen.protection;
                }
                return enterUnsetDnsScreen.copy(str, str2);
            }

            public final EnterUnsetDnsScreen copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new EnterUnsetDnsScreen(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EnterUnsetDnsScreen)) {
                    return false;
                }
                EnterUnsetDnsScreen enterUnsetDnsScreen = (EnterUnsetDnsScreen) obj;
                return zy5.m23838d(this.dns, enterUnsetDnsScreen.dns) && zy5.m23838d(this.protection, enterUnsetDnsScreen.protection);
            }

            public int hashCode() {
                return this.protection.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("EnterUnsetDnsScreen(dns=", this.dns, ", protection=", this.protection, ")");
            }
        }

        private DnsEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsSafetyEnableBlockedEvent extends AnalyticsEvent {
        private static final String ACTION_ENABLE_BLOCKED = "action_enable_blocked";
        private static final String EVENT_NAME = "dns_safety_enable_blocked";
        private static final String PARAM_FEATURE = "feature";
        private static final String PARAM_PREFERENCE_KEY = "preference_key";
        private final String actionName;
        private final String featureName;
        private final vq8[] networkParams;
        private final String preferenceKey;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class EnableBlocked extends DnsSafetyEnableBlockedEvent {
            public static final int $stable = 8;
            private final String featureName;
            private final Map<String, Object> networkDetails;
            private final String preferenceKey;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public EnableBlocked(String str, String str2, Map<String, ? extends Object> map) {
                super(DnsSafetyEnableBlockedEvent.ACTION_ENABLE_BLOCKED, str, str2, (vq8[]) Arrays.copyOf(r0, r0.length), null);
                str.getClass();
                str2.getClass();
                map.getClass();
                vq8[] vq8VarArr = (vq8[]) o97.m14874K(map).toArray(new vq8[0]);
                this.featureName = str;
                this.preferenceKey = str2;
                this.networkDetails = map;
            }

            private final String component1() {
                return this.featureName;
            }

            private final String component2() {
                return this.preferenceKey;
            }

            private final Map<String, Object> component3() {
                return this.networkDetails;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ EnableBlocked copy$default(EnableBlocked enableBlocked, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enableBlocked.featureName;
                }
                if ((i & 2) != 0) {
                    str2 = enableBlocked.preferenceKey;
                }
                if ((i & 4) != 0) {
                    map = enableBlocked.networkDetails;
                }
                return enableBlocked.copy(str, str2, map);
            }

            public final EnableBlocked copy(String str, String str2, Map<String, ? extends Object> map) {
                str.getClass();
                str2.getClass();
                map.getClass();
                return new EnableBlocked(str, str2, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EnableBlocked)) {
                    return false;
                }
                EnableBlocked enableBlocked = (EnableBlocked) obj;
                return zy5.m23838d(this.featureName, enableBlocked.featureName) && zy5.m23838d(this.preferenceKey, enableBlocked.preferenceKey) && zy5.m23838d(this.networkDetails, enableBlocked.networkDetails);
            }

            public int hashCode() {
                return this.networkDetails.hashCode() + t8c.m18683g(this.featureName.hashCode() * 31, this.preferenceKey, 31);
            }

            public String toString() {
                String str = this.featureName;
                String str2 = this.preferenceKey;
                Map<String, Object> map = this.networkDetails;
                StringBuilder m15984r = pr1.m15984r("EnableBlocked(featureName=", str, ", preferenceKey=", str2, ", networkDetails=");
                m15984r.append(map);
                m15984r.append(")");
                return m15984r.toString();
            }
        }

        private DnsSafetyEnableBlockedEvent(String str, String str2, String str3, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.featureName = str2;
            this.preferenceKey = str3;
            this.networkParams = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(4);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            sj8.m18111w(x11Var, PARAM_FEATURE, this.featureName);
            sj8.m18111w(x11Var, PARAM_PREFERENCE_KEY, this.preferenceKey);
            x11Var.m21792c(this.networkParams);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsSafetyEnableBlockedEvent(String str, String str2, String str3, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, str2, str3, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsSafetyEvent extends AnalyticsEvent {
        private static final String ACTION_DNS_SAFETY_DISABLE = "action_dns_safety_disable";
        private static final String EVENT_NAME = "dns_safety_disable";
        private static final String PARAM_FEATURE = "feature";
        private static final String PARAM_PREFERENCE_KEY = "preference_key";
        private final String actionName;
        private final String featureName;
        private final vq8[] networkParams;
        private final String preferenceKey;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DnsSafetyDisable extends DnsSafetyEvent {
            public static final int $stable = 8;
            private final String featureName;
            private final Map<String, Object> networkDetails;
            private final String preferenceKey;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public DnsSafetyDisable(String str, String str2, Map<String, ? extends Object> map) {
                super(DnsSafetyEvent.ACTION_DNS_SAFETY_DISABLE, str, str2, (vq8[]) Arrays.copyOf(r0, r0.length), null);
                str.getClass();
                str2.getClass();
                map.getClass();
                vq8[] vq8VarArr = (vq8[]) o97.m14874K(map).toArray(new vq8[0]);
                this.featureName = str;
                this.preferenceKey = str2;
                this.networkDetails = map;
            }

            private final String component1() {
                return this.featureName;
            }

            private final String component2() {
                return this.preferenceKey;
            }

            private final Map<String, Object> component3() {
                return this.networkDetails;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DnsSafetyDisable copy$default(DnsSafetyDisable dnsSafetyDisable, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSafetyDisable.featureName;
                }
                if ((i & 2) != 0) {
                    str2 = dnsSafetyDisable.preferenceKey;
                }
                if ((i & 4) != 0) {
                    map = dnsSafetyDisable.networkDetails;
                }
                return dnsSafetyDisable.copy(str, str2, map);
            }

            public final DnsSafetyDisable copy(String str, String str2, Map<String, ? extends Object> map) {
                str.getClass();
                str2.getClass();
                map.getClass();
                return new DnsSafetyDisable(str, str2, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSafetyDisable)) {
                    return false;
                }
                DnsSafetyDisable dnsSafetyDisable = (DnsSafetyDisable) obj;
                return zy5.m23838d(this.featureName, dnsSafetyDisable.featureName) && zy5.m23838d(this.preferenceKey, dnsSafetyDisable.preferenceKey) && zy5.m23838d(this.networkDetails, dnsSafetyDisable.networkDetails);
            }

            public int hashCode() {
                return this.networkDetails.hashCode() + t8c.m18683g(this.featureName.hashCode() * 31, this.preferenceKey, 31);
            }

            public String toString() {
                String str = this.featureName;
                String str2 = this.preferenceKey;
                Map<String, Object> map = this.networkDetails;
                StringBuilder m15984r = pr1.m15984r("DnsSafetyDisable(featureName=", str, ", preferenceKey=", str2, ", networkDetails=");
                m15984r.append(map);
                m15984r.append(")");
                return m15984r.toString();
            }
        }

        private DnsSafetyEvent(String str, String str2, String str3, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.featureName = str2;
            this.preferenceKey = str3;
            this.networkParams = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(4);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            sj8.m18111w(x11Var, PARAM_FEATURE, this.featureName);
            sj8.m18111w(x11Var, PARAM_PREFERENCE_KEY, this.preferenceKey);
            x11Var.m21792c(this.networkParams);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsSafetyEvent(String str, String str2, String str3, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, str2, str3, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsSetFailedEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_DNS_SET_FAILED = "action_dns_set_failed";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "dns_set_failed";
        private static final String PARAM_DNS_FAILED = "dns_failed";
        private static final String PARAM_PROTECTION_FAILED = "protection_failed";
        private final String actionName;
        private final String dns;
        private final String protection;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DnsFailed extends DnsSetFailedEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsFailed(String str, String str2) {
                super(DnsSetFailedEvent.ACTION_DNS_SET_FAILED, str, str2, null);
                str.getClass();
                str2.getClass();
                this.dns = str;
                this.protection = str2;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            public static /* synthetic */ DnsFailed copy$default(DnsFailed dnsFailed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsFailed.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsFailed.protection;
                }
                return dnsFailed.copy(str, str2);
            }

            public final DnsFailed copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new DnsFailed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsFailed)) {
                    return false;
                }
                DnsFailed dnsFailed = (DnsFailed) obj;
                return zy5.m23838d(this.dns, dnsFailed.dns) && zy5.m23838d(this.protection, dnsFailed.protection);
            }

            public int hashCode() {
                return this.protection.hashCode() + (this.dns.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("DnsFailed(dns=", this.dns, ", protection=", this.protection, ")");
            }
        }

        private DnsSetFailedEvent(String str, String str2, String str3) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.dns = str2;
            this.protection = str3;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_DNS_FAILED, this.dns), new vq8(PARAM_PROTECTION_FAILED, this.protection));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsSetFailedEvent(String str, String str2, String str3, mr2 mr2Var) {
            this(str, str2, str3);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class DnsSetSuccessEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_DNS_SET_SUCCESS = "action_dns_set_success";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "dns_set_success";
        private static final String PARAM_DNS_SUCCESS = "dns_success";
        private static final String PARAM_PROTECTION_SUCCESS = "protection_success";
        private static final String PARAM_SOURCE = "source";
        private final String actionName;
        private final String dns;
        private final String protection;
        private final String source;

        private DnsSetSuccessEvent(String str, String str2, String str3, String str4) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.dns = str2;
            this.protection = str3;
            this.source = str4;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_DNS_SUCCESS, this.dns), new vq8(PARAM_PROTECTION_SUCCESS, this.protection), new vq8(PARAM_SOURCE, this.source));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DnsSetSuccessEvent(String str, String str2, String str3, String str4, mr2 mr2Var) {
            this(str, str2, str3, str4);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DnsSuccess extends DnsSetSuccessEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String protection;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSuccess(String str, String str2, String str3) {
                super(DnsSetSuccessEvent.ACTION_DNS_SET_SUCCESS, str, str2, str3, null);
                tz6.m19222w(str, str2, str3);
                this.dns = str;
                this.protection = str2;
                this.source = str3;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            private final String component3() {
                return this.source;
            }

            public static /* synthetic */ DnsSuccess copy$default(DnsSuccess dnsSuccess, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSuccess.dns;
                }
                if ((i & 2) != 0) {
                    str2 = dnsSuccess.protection;
                }
                if ((i & 4) != 0) {
                    str3 = dnsSuccess.source;
                }
                return dnsSuccess.copy(str, str2, str3);
            }

            public final DnsSuccess copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new DnsSuccess(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSuccess)) {
                    return false;
                }
                DnsSuccess dnsSuccess = (DnsSuccess) obj;
                return zy5.m23838d(this.dns, dnsSuccess.dns) && zy5.m23838d(this.protection, dnsSuccess.protection) && zy5.m23838d(this.source, dnsSuccess.source);
            }

            public int hashCode() {
                return this.source.hashCode() + t8c.m18683g(this.dns.hashCode() * 31, this.protection, 31);
            }

            public String toString() {
                String str = this.dns;
                String str2 = this.protection;
                return pr1.m15980n(pr1.m15984r("DnsSuccess(dns=", str, ", protection=", str2, ", source="), this.source, ")");
            }

            public /* synthetic */ DnsSuccess(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? "unknown" : str3);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class GuardEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_GUARD_BLOCK = "action_guard_block";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "guard_activity";
        private static final String PARAM_GUARD_TYPE = "guard_type";
        private final String actionName;
        private final String guardType;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class GuardBlock extends GuardEvent {
            public static final int $stable = 0;
            private final String guardType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GuardBlock(String str) {
                super(GuardEvent.ACTION_GUARD_BLOCK, str, null);
                str.getClass();
                this.guardType = str;
            }

            private final String component1() {
                return this.guardType;
            }

            public static /* synthetic */ GuardBlock copy$default(GuardBlock guardBlock, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = guardBlock.guardType;
                }
                return guardBlock.copy(str);
            }

            public final GuardBlock copy(String str) {
                str.getClass();
                return new GuardBlock(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GuardBlock) && zy5.m23838d(this.guardType, ((GuardBlock) obj).guardType);
            }

            public int hashCode() {
                return this.guardType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("GuardBlock(guardType=", this.guardType, ")");
            }
        }

        private GuardEvent(String str, String str2) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.guardType = str2;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_GUARD_TYPE, this.guardType));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ GuardEvent(String str, String str2, mr2 mr2Var) {
            this(str, str2);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class HabitTrackerEvent extends AnalyticsEvent {
        private static final String ACTION_ADD_BUTTON_CLICK = "action_add_button_click";
        private static final String ACTION_CALENDAR_OPEN = "action_calendar_open";
        private static final String ACTION_CATEGORY_TOGGLE = "action_category_toggle";
        private static final String ACTION_DATE_CHANGE = "action_date_change";
        private static final String ACTION_HABIT_ADD = "action_habit_add";
        private static final String ACTION_HABIT_ADD_BACK_PRESS = "action_habit_add_back_press";
        private static final String ACTION_HABIT_DELETE = "action_habit_delete";
        private static final String ACTION_HABIT_TOGGLE = "action_habit_toggle";
        private static final String ACTION_NOTIFICATION_TOGGLE = "action_notification_toggle";
        private static final String ACTION_PRAYER_SUB_HABIT_TOGGLE = "action_prayer_sub_habit_toggle";
        private static final String ACTION_REPORT_PERIOD_NAVIGATE = "action_report_period_navigate";
        private static final String ACTION_REPORT_TAB_CHANGE = "action_report_tab_change";
        private static final String EVENT_NAME = "habit_tracker_activity";
        private static final String PARAM_CATEGORY_ID = "category_id";
        private static final String PARAM_DATE_SELECTED = "date_selected";
        private static final String PARAM_HABIT_CATEGORY = "habit_category";
        private static final String PARAM_HABIT_COMPLETED = "habit_completed";
        private static final String PARAM_HABIT_NAME = "habit_name";
        private static final String PARAM_IS_EXPANDED = "is_expanded";
        private static final String PARAM_NAVIGATE_DIRECTION = "direction";
        private static final String PARAM_NOTIFICATION_ENABLED = "notification_enabled";
        private static final String PARAM_PERIOD_LABEL = "period_label";
        private static final String PARAM_REPORT_TAB = "tab";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private static final String PARAM_SUB_HABIT_COMPLETED = "sub_habit_completed";
        private static final String PARAM_SUB_HABIT_TYPE = "sub_habit_type";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CalendarOpen extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String sourceScreen;

            private final String component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ CalendarOpen copy$default(CalendarOpen calendarOpen, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = calendarOpen.sourceScreen;
                }
                return calendarOpen.copy(str);
            }

            public final CalendarOpen copy(String str) {
                str.getClass();
                return new CalendarOpen(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CalendarOpen) && zy5.m23838d(this.sourceScreen, ((CalendarOpen) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("CalendarOpen(sourceScreen=", this.sourceScreen, ")");
            }

            public CalendarOpen(String str) {
                super(HabitTrackerEvent.ACTION_CALENDAR_OPEN, new vq8[]{AbstractC0327f4.m7612e(str, XLGovHFQUxVAg.HmNwdHem, str)}, null);
                this.sourceScreen = str;
            }

            public /* synthetic */ CalendarOpen(String str, int i, mr2 mr2Var) {
                this((i & 1) != 0 ? "habit_tracker_dashboard" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public CalendarOpen() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CategoryToggle extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String categoryId;
            private final boolean isExpanded;

            public CategoryToggle(String str, boolean z) {
                super(HabitTrackerEvent.ACTION_CATEGORY_TOGGLE, new vq8[]{AbstractC0327f4.m7612e(str, HabitTrackerEvent.PARAM_CATEGORY_ID, str), new vq8(HabitTrackerEvent.PARAM_IS_EXPANDED, Boolean.valueOf(z))}, null);
                this.categoryId = str;
                this.isExpanded = z;
            }

            private final String component1() {
                return this.categoryId;
            }

            private final boolean component2() {
                return this.isExpanded;
            }

            public static /* synthetic */ CategoryToggle copy$default(CategoryToggle categoryToggle, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = categoryToggle.categoryId;
                }
                if ((i & 2) != 0) {
                    z = categoryToggle.isExpanded;
                }
                return categoryToggle.copy(str, z);
            }

            public final CategoryToggle copy(String str, boolean z) {
                str.getClass();
                return new CategoryToggle(str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoryToggle)) {
                    return false;
                }
                CategoryToggle categoryToggle = (CategoryToggle) obj;
                return zy5.m23838d(this.categoryId, categoryToggle.categoryId) && this.isExpanded == categoryToggle.isExpanded;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isExpanded) + (this.categoryId.hashCode() * 31);
            }

            public String toString() {
                return mmUZEXxylxd.WWgx + this.categoryId + ", isExpanded=" + this.isExpanded + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DateChange extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String dateSelected;

            private final String component1() {
                return this.dateSelected;
            }

            public static /* synthetic */ DateChange copy$default(DateChange dateChange, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dateChange.dateSelected;
                }
                return dateChange.copy(str);
            }

            public final DateChange copy(String str) {
                str.getClass();
                return new DateChange(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DateChange) && zy5.m23838d(this.dateSelected, ((DateChange) obj).dateSelected);
            }

            public int hashCode() {
                return this.dateSelected.hashCode();
            }

            public String toString() {
                return tz6.m19210k("DateChange(dateSelected=", this.dateSelected, ")");
            }

            public DateChange(String str) {
                super(hqZLxhHl.JbEhuhNT, new vq8[]{AbstractC0327f4.m7612e(str, HabitTrackerEvent.PARAM_DATE_SELECTED, str)}, null);
                this.dateSelected = str;
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class HabitAdd extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String habitCategory;
            private final String habitName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HabitAdd(String str, String str2) {
                super(HabitTrackerEvent.ACTION_HABIT_ADD, new vq8[]{new vq8(HabitTrackerEvent.PARAM_HABIT_NAME, str), new vq8(HabitTrackerEvent.PARAM_HABIT_CATEGORY, str2)}, null);
                str.getClass();
                str2.getClass();
                this.habitName = str;
                this.habitCategory = str2;
            }

            private final String component1() {
                return this.habitName;
            }

            private final String component2() {
                return this.habitCategory;
            }

            public static /* synthetic */ HabitAdd copy$default(HabitAdd habitAdd, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = habitAdd.habitName;
                }
                if ((i & 2) != 0) {
                    str2 = habitAdd.habitCategory;
                }
                return habitAdd.copy(str, str2);
            }

            public final HabitAdd copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new HabitAdd(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HabitAdd)) {
                    return false;
                }
                HabitAdd habitAdd = (HabitAdd) obj;
                return zy5.m23838d(this.habitName, habitAdd.habitName) && zy5.m23838d(this.habitCategory, habitAdd.habitCategory);
            }

            public int hashCode() {
                return this.habitCategory.hashCode() + (this.habitName.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("HabitAdd(habitName=", this.habitName, ", habitCategory=", this.habitCategory, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class HabitAddBackPress extends HabitTrackerEvent {
            public static final int $stable = 8;

            public HabitAddBackPress() {
                super(HabitTrackerEvent.ACTION_HABIT_ADD_BACK_PRESS, new vq8[0], null);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class HabitDelete extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String habitCategory;
            private final String habitName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HabitDelete(String str, String str2) {
                super(HabitTrackerEvent.ACTION_HABIT_DELETE, new vq8[]{new vq8(HabitTrackerEvent.PARAM_HABIT_NAME, str), new vq8(HabitTrackerEvent.PARAM_HABIT_CATEGORY, str2)}, null);
                str.getClass();
                str2.getClass();
                this.habitName = str;
                this.habitCategory = str2;
            }

            private final String component1() {
                return this.habitName;
            }

            private final String component2() {
                return this.habitCategory;
            }

            public static /* synthetic */ HabitDelete copy$default(HabitDelete habitDelete, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = habitDelete.habitName;
                }
                if ((i & 2) != 0) {
                    str2 = habitDelete.habitCategory;
                }
                return habitDelete.copy(str, str2);
            }

            public final HabitDelete copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new HabitDelete(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HabitDelete)) {
                    return false;
                }
                HabitDelete habitDelete = (HabitDelete) obj;
                return zy5.m23838d(this.habitName, habitDelete.habitName) && zy5.m23838d(this.habitCategory, habitDelete.habitCategory);
            }

            public int hashCode() {
                return this.habitCategory.hashCode() + (this.habitName.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("HabitDelete(habitName=", this.habitName, ", habitCategory=", this.habitCategory, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class HabitToggle extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String habitCategory;
            private final boolean habitCompleted;
            private final String habitName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HabitToggle(String str, String str2, boolean z) {
                super(HabitTrackerEvent.ACTION_HABIT_TOGGLE, new vq8[]{new vq8(HabitTrackerEvent.PARAM_HABIT_NAME, str), new vq8(HabitTrackerEvent.PARAM_HABIT_CATEGORY, str2), new vq8(HabitTrackerEvent.PARAM_HABIT_COMPLETED, Boolean.valueOf(z))}, null);
                str.getClass();
                str2.getClass();
                this.habitName = str;
                this.habitCategory = str2;
                this.habitCompleted = z;
            }

            private final String component1() {
                return this.habitName;
            }

            private final String component2() {
                return this.habitCategory;
            }

            private final boolean component3() {
                return this.habitCompleted;
            }

            public static /* synthetic */ HabitToggle copy$default(HabitToggle habitToggle, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = habitToggle.habitName;
                }
                if ((i & 2) != 0) {
                    str2 = habitToggle.habitCategory;
                }
                if ((i & 4) != 0) {
                    z = habitToggle.habitCompleted;
                }
                return habitToggle.copy(str, str2, z);
            }

            public final HabitToggle copy(String str, String str2, boolean z) {
                str.getClass();
                str2.getClass();
                return new HabitToggle(str, str2, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HabitToggle)) {
                    return false;
                }
                HabitToggle habitToggle = (HabitToggle) obj;
                return zy5.m23838d(this.habitName, habitToggle.habitName) && zy5.m23838d(this.habitCategory, habitToggle.habitCategory) && this.habitCompleted == habitToggle.habitCompleted;
            }

            public int hashCode() {
                return Boolean.hashCode(this.habitCompleted) + t8c.m18683g(this.habitName.hashCode() * 31, this.habitCategory, 31);
            }

            public String toString() {
                String str = this.habitName;
                String str2 = this.habitCategory;
                return tz6.m19215p(pr1.m15984r("HabitToggle(habitName=", str, ", habitCategory=", str2, ", habitCompleted="), this.habitCompleted, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class NotificationToggle extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final boolean notificationEnabled;

            public NotificationToggle(boolean z) {
                super(HabitTrackerEvent.ACTION_NOTIFICATION_TOGGLE, new vq8[]{new vq8(HabitTrackerEvent.PARAM_NOTIFICATION_ENABLED, Boolean.valueOf(z))}, null);
                this.notificationEnabled = z;
            }

            private final boolean component1() {
                return this.notificationEnabled;
            }

            public static /* synthetic */ NotificationToggle copy$default(NotificationToggle notificationToggle, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = notificationToggle.notificationEnabled;
                }
                return notificationToggle.copy(z);
            }

            public final NotificationToggle copy(boolean z) {
                return new NotificationToggle(z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotificationToggle) && this.notificationEnabled == ((NotificationToggle) obj).notificationEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.notificationEnabled);
            }

            public String toString() {
                return "NotificationToggle(notificationEnabled=" + this.notificationEnabled + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class PrayerSubHabitToggle extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String habitName;
            private final boolean subHabitCompleted;
            private final String subHabitType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrayerSubHabitToggle(String str, String str2, boolean z) {
                super(HabitTrackerEvent.ACTION_PRAYER_SUB_HABIT_TOGGLE, new vq8[]{new vq8(HabitTrackerEvent.PARAM_HABIT_NAME, str), new vq8(HabitTrackerEvent.PARAM_SUB_HABIT_TYPE, str2), new vq8(HabitTrackerEvent.PARAM_SUB_HABIT_COMPLETED, Boolean.valueOf(z))}, null);
                str.getClass();
                str2.getClass();
                this.habitName = str;
                this.subHabitType = str2;
                this.subHabitCompleted = z;
            }

            private final String component1() {
                return this.habitName;
            }

            private final String component2() {
                return this.subHabitType;
            }

            private final boolean component3() {
                return this.subHabitCompleted;
            }

            public static /* synthetic */ PrayerSubHabitToggle copy$default(PrayerSubHabitToggle prayerSubHabitToggle, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = prayerSubHabitToggle.habitName;
                }
                if ((i & 2) != 0) {
                    str2 = prayerSubHabitToggle.subHabitType;
                }
                if ((i & 4) != 0) {
                    z = prayerSubHabitToggle.subHabitCompleted;
                }
                return prayerSubHabitToggle.copy(str, str2, z);
            }

            public final PrayerSubHabitToggle copy(String str, String str2, boolean z) {
                str.getClass();
                str2.getClass();
                return new PrayerSubHabitToggle(str, str2, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrayerSubHabitToggle)) {
                    return false;
                }
                PrayerSubHabitToggle prayerSubHabitToggle = (PrayerSubHabitToggle) obj;
                return zy5.m23838d(this.habitName, prayerSubHabitToggle.habitName) && zy5.m23838d(this.subHabitType, prayerSubHabitToggle.subHabitType) && this.subHabitCompleted == prayerSubHabitToggle.subHabitCompleted;
            }

            public int hashCode() {
                return Boolean.hashCode(this.subHabitCompleted) + t8c.m18683g(this.habitName.hashCode() * 31, this.subHabitType, 31);
            }

            public String toString() {
                String str = this.habitName;
                String str2 = this.subHabitType;
                return tz6.m19215p(pr1.m15984r("PrayerSubHabitToggle(habitName=", str, ", subHabitType=", str2, ", subHabitCompleted="), this.subHabitCompleted, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ReportPeriodNavigate extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String direction;
            private final String periodLabel;
            private final String tab;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReportPeriodNavigate(String str, String str2, String str3) {
                super(HabitTrackerEvent.ACTION_REPORT_PERIOD_NAVIGATE, new vq8[]{new vq8(HabitTrackerEvent.PARAM_NAVIGATE_DIRECTION, str), new vq8(HabitTrackerEvent.PARAM_PERIOD_LABEL, str2), new vq8(HabitTrackerEvent.PARAM_REPORT_TAB, str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.direction = str;
                this.periodLabel = str2;
                this.tab = str3;
            }

            private final String component1() {
                return this.direction;
            }

            private final String component2() {
                return this.periodLabel;
            }

            private final String component3() {
                return this.tab;
            }

            public static /* synthetic */ ReportPeriodNavigate copy$default(ReportPeriodNavigate reportPeriodNavigate, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reportPeriodNavigate.direction;
                }
                if ((i & 2) != 0) {
                    str2 = reportPeriodNavigate.periodLabel;
                }
                if ((i & 4) != 0) {
                    str3 = reportPeriodNavigate.tab;
                }
                return reportPeriodNavigate.copy(str, str2, str3);
            }

            public final ReportPeriodNavigate copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new ReportPeriodNavigate(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReportPeriodNavigate)) {
                    return false;
                }
                ReportPeriodNavigate reportPeriodNavigate = (ReportPeriodNavigate) obj;
                return zy5.m23838d(this.direction, reportPeriodNavigate.direction) && zy5.m23838d(this.periodLabel, reportPeriodNavigate.periodLabel) && zy5.m23838d(this.tab, reportPeriodNavigate.tab);
            }

            public int hashCode() {
                return this.tab.hashCode() + t8c.m18683g(this.direction.hashCode() * 31, this.periodLabel, 31);
            }

            public String toString() {
                String str = this.direction;
                String str2 = this.periodLabel;
                return pr1.m15980n(pr1.m15984r("ReportPeriodNavigate(direction=", str, ", periodLabel=", str2, ", tab="), this.tab, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ReportTabChange extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String tab;

            public ReportTabChange(String str) {
                super(HabitTrackerEvent.ACTION_REPORT_TAB_CHANGE, new vq8[]{AbstractC0327f4.m7612e(str, HabitTrackerEvent.PARAM_REPORT_TAB, str)}, null);
                this.tab = str;
            }

            private final String component1() {
                return this.tab;
            }

            public static /* synthetic */ ReportTabChange copy$default(ReportTabChange reportTabChange, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reportTabChange.tab;
                }
                return reportTabChange.copy(str);
            }

            public final ReportTabChange copy(String str) {
                str.getClass();
                return new ReportTabChange(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReportTabChange) && zy5.m23838d(this.tab, ((ReportTabChange) obj).tab);
            }

            public int hashCode() {
                return this.tab.hashCode();
            }

            public String toString() {
                return tz6.m19210k(kDZkQvvJAhzNl.SRXwslqI, this.tab, ")");
            }
        }

        private HabitTrackerEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ HabitTrackerEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AddButtonClick extends HabitTrackerEvent {
            public static final int $stable = 8;
            private final String sourceScreen;

            public AddButtonClick(String str) {
                super(HabitTrackerEvent.ACTION_ADD_BUTTON_CLICK, new vq8[]{AbstractC0327f4.m7612e(str, HabitTrackerEvent.PARAM_SOURCE_SCREEN, str)}, null);
                this.sourceScreen = str;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ AddButtonClick copy$default(AddButtonClick addButtonClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = addButtonClick.sourceScreen;
                }
                return addButtonClick.copy(str);
            }

            public final AddButtonClick copy(String str) {
                str.getClass();
                return new AddButtonClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddButtonClick) && zy5.m23838d(this.sourceScreen, ((AddButtonClick) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("AddButtonClick(sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ AddButtonClick(String str, int i, mr2 mr2Var) {
                this((i & 1) != 0 ? "habit_tracker_dashboard" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AddButtonClick() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class HomeTourEvent extends AnalyticsEvent {
        private static final String ACTION_COMPLETED = "completed";
        private static final String ACTION_DISMISSED = "dismissed";
        private static final String ACTION_STARTED = "started";
        private static final String ACTION_STEP_BACK_CLICKED = "step_back_clicked";
        private static final String ACTION_STEP_SKIPPED_DECLARATIVE = "step_skipped_declarative";
        private static final String ACTION_STEP_SKIPPED_NO_ANCHOR = "step_skipped_no_anchor";
        private static final String ACTION_STEP_VIEWED = "step_viewed";
        private static final String EVENT_NAME = "home_tour_activity";
        private static final String PARAM_REASON = "reason";
        private static final String PARAM_STEP = "step";
        private static final String PARAM_STEP_INDEX = "step_index";
        private static final String PARAM_TOTAL_COUNT = "total_count";
        public static final String REASON_FIRST_RUN = "first_run";
        public static final String REASON_MORE_MENU = "more_menu";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Completed extends HomeTourEvent {
            public static final int $stable = 8;
            private final int totalCount;

            public Completed(int i) {
                super(HomeTourEvent.ACTION_COMPLETED, new vq8[]{new vq8(HomeTourEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i))}, null);
                this.totalCount = i;
            }

            private final int component1() {
                return this.totalCount;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = completed.totalCount;
                }
                return completed.copy(i);
            }

            public final Completed copy(int i) {
                return new Completed(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Completed) && this.totalCount == ((Completed) obj).totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount);
            }

            public String toString() {
                return pr1.m15973g(this.totalCount, "Completed(totalCount=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Dismissed extends HomeTourEvent {
            public static final int $stable = 8;
            private final String step;
            private final int stepIndex;
            private final int totalCount;

            public Dismissed(String str, int i, int i2) {
                super(HomeTourEvent.ACTION_DISMISSED, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_STEP, str), new vq8(HomeTourEvent.PARAM_STEP_INDEX, Integer.valueOf(i)), new vq8(HomeTourEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i2))}, null);
                this.step = str;
                this.stepIndex = i;
                this.totalCount = i2;
            }

            private final String component1() {
                return this.step;
            }

            private final int component2() {
                return this.stepIndex;
            }

            private final int component3() {
                return this.totalCount;
            }

            public static /* synthetic */ Dismissed copy$default(Dismissed dismissed, String str, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = dismissed.step;
                }
                if ((i3 & 2) != 0) {
                    i = dismissed.stepIndex;
                }
                if ((i3 & 4) != 0) {
                    i2 = dismissed.totalCount;
                }
                return dismissed.copy(str, i, i2);
            }

            public final Dismissed copy(String str, int i, int i2) {
                str.getClass();
                return new Dismissed(str, i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dismissed)) {
                    return false;
                }
                Dismissed dismissed = (Dismissed) obj;
                return zy5.m23838d(this.step, dismissed.step) && this.stepIndex == dismissed.stepIndex && this.totalCount == dismissed.totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount) + pr1.m15965A(this.stepIndex, this.step.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.step;
                return tz6.m19207h(this.totalCount, ")", sj8.m18105q(this.stepIndex, "Dismissed(step=", str, ", stepIndex=", ", totalCount="));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Started extends HomeTourEvent {
            public static final int $stable = 8;
            private final String reason;

            public Started(String str) {
                super(HomeTourEvent.ACTION_STARTED, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_REASON, str)}, null);
                this.reason = str;
            }

            private final String component1() {
                return this.reason;
            }

            public static /* synthetic */ Started copy$default(Started started, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = started.reason;
                }
                return started.copy(str);
            }

            public final Started copy(String str) {
                str.getClass();
                return new Started(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Started) && zy5.m23838d(this.reason, ((Started) obj).reason);
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return tz6.m19210k("Started(reason=", this.reason, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepBackClicked extends HomeTourEvent {
            public static final int $stable = 8;
            private final String step;
            private final int stepIndex;
            private final int totalCount;

            public StepBackClicked(String str, int i, int i2) {
                super(HomeTourEvent.ACTION_STEP_BACK_CLICKED, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_STEP, str), new vq8(HomeTourEvent.PARAM_STEP_INDEX, Integer.valueOf(i)), new vq8(HomeTourEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i2))}, null);
                this.step = str;
                this.stepIndex = i;
                this.totalCount = i2;
            }

            private final String component1() {
                return this.step;
            }

            private final int component2() {
                return this.stepIndex;
            }

            private final int component3() {
                return this.totalCount;
            }

            public static /* synthetic */ StepBackClicked copy$default(StepBackClicked stepBackClicked, String str, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = stepBackClicked.step;
                }
                if ((i3 & 2) != 0) {
                    i = stepBackClicked.stepIndex;
                }
                if ((i3 & 4) != 0) {
                    i2 = stepBackClicked.totalCount;
                }
                return stepBackClicked.copy(str, i, i2);
            }

            public final StepBackClicked copy(String str, int i, int i2) {
                str.getClass();
                return new StepBackClicked(str, i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StepBackClicked)) {
                    return false;
                }
                StepBackClicked stepBackClicked = (StepBackClicked) obj;
                return zy5.m23838d(this.step, stepBackClicked.step) && this.stepIndex == stepBackClicked.stepIndex && this.totalCount == stepBackClicked.totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount) + pr1.m15965A(this.stepIndex, this.step.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.step;
                return tz6.m19207h(this.totalCount, ")", sj8.m18105q(this.stepIndex, "StepBackClicked(step=", str, ", stepIndex=", ", totalCount="));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepSkippedDeclarative extends HomeTourEvent {
            public static final int $stable = 8;
            private final String step;

            public StepSkippedDeclarative(String str) {
                super(HomeTourEvent.ACTION_STEP_SKIPPED_DECLARATIVE, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_STEP, str)}, null);
                this.step = str;
            }

            private final String component1() {
                return this.step;
            }

            public static /* synthetic */ StepSkippedDeclarative copy$default(StepSkippedDeclarative stepSkippedDeclarative, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stepSkippedDeclarative.step;
                }
                return stepSkippedDeclarative.copy(str);
            }

            public final StepSkippedDeclarative copy(String str) {
                str.getClass();
                return new StepSkippedDeclarative(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepSkippedDeclarative) && zy5.m23838d(this.step, ((StepSkippedDeclarative) obj).step);
            }

            public int hashCode() {
                return this.step.hashCode();
            }

            public String toString() {
                return tz6.m19210k("StepSkippedDeclarative(step=", this.step, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepSkippedNoAnchor extends HomeTourEvent {
            public static final int $stable = 8;
            private final String step;

            public StepSkippedNoAnchor(String str) {
                super(HomeTourEvent.ACTION_STEP_SKIPPED_NO_ANCHOR, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_STEP, str)}, null);
                this.step = str;
            }

            private final String component1() {
                return this.step;
            }

            public static /* synthetic */ StepSkippedNoAnchor copy$default(StepSkippedNoAnchor stepSkippedNoAnchor, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stepSkippedNoAnchor.step;
                }
                return stepSkippedNoAnchor.copy(str);
            }

            public final StepSkippedNoAnchor copy(String str) {
                str.getClass();
                return new StepSkippedNoAnchor(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepSkippedNoAnchor) && zy5.m23838d(this.step, ((StepSkippedNoAnchor) obj).step);
            }

            public int hashCode() {
                return this.step.hashCode();
            }

            public String toString() {
                return tz6.m19210k("StepSkippedNoAnchor(step=", this.step, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class StepViewed extends HomeTourEvent {
            public static final int $stable = 8;
            private final String step;
            private final int stepIndex;
            private final int totalCount;

            public StepViewed(String str, int i, int i2) {
                super(HomeTourEvent.ACTION_STEP_VIEWED, new vq8[]{AbstractC0327f4.m7612e(str, HomeTourEvent.PARAM_STEP, str), new vq8(HomeTourEvent.PARAM_STEP_INDEX, Integer.valueOf(i)), new vq8(HomeTourEvent.PARAM_TOTAL_COUNT, Integer.valueOf(i2))}, null);
                this.step = str;
                this.stepIndex = i;
                this.totalCount = i2;
            }

            private final String component1() {
                return this.step;
            }

            private final int component2() {
                return this.stepIndex;
            }

            private final int component3() {
                return this.totalCount;
            }

            public static /* synthetic */ StepViewed copy$default(StepViewed stepViewed, String str, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = stepViewed.step;
                }
                if ((i3 & 2) != 0) {
                    i = stepViewed.stepIndex;
                }
                if ((i3 & 4) != 0) {
                    i2 = stepViewed.totalCount;
                }
                return stepViewed.copy(str, i, i2);
            }

            public final StepViewed copy(String str, int i, int i2) {
                str.getClass();
                return new StepViewed(str, i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StepViewed)) {
                    return false;
                }
                StepViewed stepViewed = (StepViewed) obj;
                return zy5.m23838d(this.step, stepViewed.step) && this.stepIndex == stepViewed.stepIndex && this.totalCount == stepViewed.totalCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.totalCount) + pr1.m15965A(this.stepIndex, this.step.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.step;
                return tz6.m19207h(this.totalCount, ")", sj8.m18105q(this.stepIndex, "StepViewed(step=", str, ", stepIndex=", ", totalCount="));
            }
        }

        private HomeTourEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ HomeTourEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class InfrastructureErrorEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_ACTIVITY_CONTEXT_FAILURE = "action_activity_context_failure";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "infrastructure_error";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_ERROR_TYPE = "error_type";
        private static final String PARAM_EXCEPTION_CLASS = "exception_class";
        private final String actionName;
        private final String errorMessage;
        private final String errorType;
        private final String exceptionClass;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ActivityContextFailure extends InfrastructureErrorEvent {
            public static final int $stable = 0;
            private final String errorMessage;
            private final String errorType;
            private final String exceptionClass;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityContextFailure(String str, String str2, String str3) {
                super(InfrastructureErrorEvent.ACTION_ACTIVITY_CONTEXT_FAILURE, str, str2, str3, null);
                tz6.m19222w(str, str2, str3);
                this.errorType = str;
                this.errorMessage = str2;
                this.exceptionClass = str3;
            }

            private final String component1() {
                return this.errorType;
            }

            private final String component2() {
                return this.errorMessage;
            }

            private final String component3() {
                return this.exceptionClass;
            }

            public static /* synthetic */ ActivityContextFailure copy$default(ActivityContextFailure activityContextFailure, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activityContextFailure.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = activityContextFailure.errorMessage;
                }
                if ((i & 4) != 0) {
                    str3 = activityContextFailure.exceptionClass;
                }
                return activityContextFailure.copy(str, str2, str3);
            }

            public final ActivityContextFailure copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new ActivityContextFailure(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivityContextFailure)) {
                    return false;
                }
                ActivityContextFailure activityContextFailure = (ActivityContextFailure) obj;
                return zy5.m23838d(this.errorType, activityContextFailure.errorType) && zy5.m23838d(this.errorMessage, activityContextFailure.errorMessage) && zy5.m23838d(this.exceptionClass, activityContextFailure.exceptionClass);
            }

            public int hashCode() {
                return this.exceptionClass.hashCode() + t8c.m18683g(this.errorType.hashCode() * 31, this.errorMessage, 31);
            }

            public String toString() {
                String str = this.errorType;
                String str2 = this.errorMessage;
                return pr1.m15980n(pr1.m15984r("ActivityContextFailure(errorType=", str, ", errorMessage=", str2, ", exceptionClass="), this.exceptionClass, ")");
            }
        }

        private InfrastructureErrorEvent(String str, String str2, String str3, String str4) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.errorType = str2;
            this.errorMessage = str3;
            this.exceptionClass = str4;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_ERROR_TYPE, this.errorType), new vq8(PARAM_ERROR_MESSAGE, this.errorMessage), new vq8(PARAM_EXCEPTION_CLASS, this.exceptionClass));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ InfrastructureErrorEvent(String str, String str2, String str3, String str4, mr2 mr2Var) {
            this(str, str2, str3, str4);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class LanguageEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_SET_LANGUAGE = "action_set_language";
        private static final String ACTION_UPDATE_LANGUAGE = "action_update_language";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "language_change";
        private static final String PARAM_LANGUAGE_CHANGED = "language_changed";
        private final String actionName;
        private final String language;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SetLanguage extends LanguageEvent {
            public static final int $stable = 0;
            private final String language;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetLanguage(String str) {
                super(LanguageEvent.ACTION_SET_LANGUAGE, str, null);
                str.getClass();
                this.language = str;
            }

            private final String component1() {
                return this.language;
            }

            public static /* synthetic */ SetLanguage copy$default(SetLanguage setLanguage, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setLanguage.language;
                }
                return setLanguage.copy(str);
            }

            public final SetLanguage copy(String str) {
                str.getClass();
                return new SetLanguage(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetLanguage) && zy5.m23838d(this.language, ((SetLanguage) obj).language);
            }

            public int hashCode() {
                return this.language.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SetLanguage(language=", this.language, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class UpdateLanguage extends LanguageEvent {
            public static final int $stable = 0;
            private final String language;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateLanguage(String str) {
                super(LanguageEvent.ACTION_UPDATE_LANGUAGE, str, null);
                str.getClass();
                this.language = str;
            }

            private final String component1() {
                return this.language;
            }

            public static /* synthetic */ UpdateLanguage copy$default(UpdateLanguage updateLanguage, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateLanguage.language;
                }
                return updateLanguage.copy(str);
            }

            public final UpdateLanguage copy(String str) {
                str.getClass();
                return new UpdateLanguage(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateLanguage) && zy5.m23838d(this.language, ((UpdateLanguage) obj).language);
            }

            public int hashCode() {
                return this.language.hashCode();
            }

            public String toString() {
                return tz6.m19210k("UpdateLanguage(language=", this.language, ")");
            }
        }

        private LanguageEvent(String str, String str2) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.language = str2;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_LANGUAGE_CHANGED, this.language));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ LanguageEvent(String str, String str2, mr2 mr2Var) {
            this(str, str2);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class MindfulPauseEvent extends AnalyticsEvent {
        private static final String ACTION_AUTO_DISMISS = "action_auto_dismiss";
        private static final String ACTION_CLOSE = "action_close";
        private static final String ACTION_CONTINUE = "action_continue";
        private static final String ACTION_LIMIT_REACHED = "action_limit_reached";
        private static final String ACTION_SHOWN = "action_pause_shown";
        private static final String EVENT_NAME = "mindful_pause_activity";
        private static final String PARAM_DAILY_LIMIT = "daily_limit";
        private static final String PARAM_DURATION_SECONDS = "duration_seconds";
        private static final String PARAM_OPENS_IN_WINDOW = "opens_in_window";
        private static final String PARAM_PACKAGE_NAME = "package_name";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AutoDismissed extends MindfulPauseEvent {
            public static final int $stable = 8;
            private final int durationSeconds;
            private final String packageName;

            public AutoDismissed(String str, int i) {
                super(MindfulPauseEvent.ACTION_AUTO_DISMISS, new vq8[]{AbstractC0327f4.m7612e(str, MindfulPauseEvent.PARAM_PACKAGE_NAME, str), new vq8(MindfulPauseEvent.PARAM_DURATION_SECONDS, Integer.valueOf(i))}, null);
                this.packageName = str;
                this.durationSeconds = i;
            }

            private final String component1() {
                return this.packageName;
            }

            private final int component2() {
                return this.durationSeconds;
            }

            public static /* synthetic */ AutoDismissed copy$default(AutoDismissed autoDismissed, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = autoDismissed.packageName;
                }
                if ((i2 & 2) != 0) {
                    i = autoDismissed.durationSeconds;
                }
                return autoDismissed.copy(str, i);
            }

            public final AutoDismissed copy(String str, int i) {
                str.getClass();
                return new AutoDismissed(str, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoDismissed)) {
                    return false;
                }
                AutoDismissed autoDismissed = (AutoDismissed) obj;
                return zy5.m23838d(this.packageName, autoDismissed.packageName) && this.durationSeconds == autoDismissed.durationSeconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.durationSeconds) + (this.packageName.hashCode() * 31);
            }

            public String toString() {
                return pr1.m15975i(this.durationSeconds, "AutoDismissed(packageName=", this.packageName, ", durationSeconds=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Closed extends MindfulPauseEvent {
            public static final int $stable = 8;
            private final int durationSeconds;
            private final String packageName;

            public Closed(String str, int i) {
                super(MindfulPauseEvent.ACTION_CLOSE, new vq8[]{AbstractC0327f4.m7612e(str, MindfulPauseEvent.PARAM_PACKAGE_NAME, str), new vq8(MindfulPauseEvent.PARAM_DURATION_SECONDS, Integer.valueOf(i))}, null);
                this.packageName = str;
                this.durationSeconds = i;
            }

            private final String component1() {
                return this.packageName;
            }

            private final int component2() {
                return this.durationSeconds;
            }

            public static /* synthetic */ Closed copy$default(Closed closed, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = closed.packageName;
                }
                if ((i2 & 2) != 0) {
                    i = closed.durationSeconds;
                }
                return closed.copy(str, i);
            }

            public final Closed copy(String str, int i) {
                str.getClass();
                return new Closed(str, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Closed)) {
                    return false;
                }
                Closed closed = (Closed) obj;
                return zy5.m23838d(this.packageName, closed.packageName) && this.durationSeconds == closed.durationSeconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.durationSeconds) + (this.packageName.hashCode() * 31);
            }

            public String toString() {
                return pr1.m15975i(this.durationSeconds, "Closed(packageName=", this.packageName, ", durationSeconds=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Continued extends MindfulPauseEvent {
            public static final int $stable = 8;
            private final int durationSeconds;
            private final String packageName;

            public Continued(String str, int i) {
                super(MindfulPauseEvent.ACTION_CONTINUE, new vq8[]{AbstractC0327f4.m7612e(str, MindfulPauseEvent.PARAM_PACKAGE_NAME, str), new vq8(MindfulPauseEvent.PARAM_DURATION_SECONDS, Integer.valueOf(i))}, null);
                this.packageName = str;
                this.durationSeconds = i;
            }

            private final String component1() {
                return this.packageName;
            }

            private final int component2() {
                return this.durationSeconds;
            }

            public static /* synthetic */ Continued copy$default(Continued continued, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = continued.packageName;
                }
                if ((i2 & 2) != 0) {
                    i = continued.durationSeconds;
                }
                return continued.copy(str, i);
            }

            public final Continued copy(String str, int i) {
                str.getClass();
                return new Continued(str, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Continued)) {
                    return false;
                }
                Continued continued = (Continued) obj;
                return zy5.m23838d(this.packageName, continued.packageName) && this.durationSeconds == continued.durationSeconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.durationSeconds) + (this.packageName.hashCode() * 31);
            }

            public String toString() {
                return pr1.m15975i(this.durationSeconds, "Continued(packageName=", this.packageName, ", durationSeconds=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class LimitReached extends MindfulPauseEvent {
            public static final int $stable = 8;
            private final int dailyLimit;
            private final String packageName;

            public LimitReached(String str, int i) {
                super(MindfulPauseEvent.ACTION_LIMIT_REACHED, new vq8[]{AbstractC0327f4.m7612e(str, MindfulPauseEvent.PARAM_PACKAGE_NAME, str), new vq8(MindfulPauseEvent.PARAM_DAILY_LIMIT, Integer.valueOf(i))}, null);
                this.packageName = str;
                this.dailyLimit = i;
            }

            private final String component1() {
                return this.packageName;
            }

            private final int component2() {
                return this.dailyLimit;
            }

            public static /* synthetic */ LimitReached copy$default(LimitReached limitReached, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = limitReached.packageName;
                }
                if ((i2 & 2) != 0) {
                    i = limitReached.dailyLimit;
                }
                return limitReached.copy(str, i);
            }

            public final LimitReached copy(String str, int i) {
                str.getClass();
                return new LimitReached(str, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LimitReached)) {
                    return false;
                }
                LimitReached limitReached = (LimitReached) obj;
                return zy5.m23838d(this.packageName, limitReached.packageName) && this.dailyLimit == limitReached.dailyLimit;
            }

            public int hashCode() {
                return Integer.hashCode(this.dailyLimit) + (this.packageName.hashCode() * 31);
            }

            public String toString() {
                return pr1.m15975i(this.dailyLimit, "LimitReached(packageName=", this.packageName, ", dailyLimit=", ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Shown extends MindfulPauseEvent {
            public static final int $stable = 8;
            private final int dailyLimit;
            private final int durationSeconds;
            private final int opensInWindow;
            private final String packageName;

            public Shown(String str, int i, int i2, int i3) {
                super(MindfulPauseEvent.ACTION_SHOWN, new vq8[]{AbstractC0327f4.m7612e(str, MindfulPauseEvent.PARAM_PACKAGE_NAME, str), new vq8(MindfulPauseEvent.PARAM_DURATION_SECONDS, Integer.valueOf(i)), new vq8(MindfulPauseEvent.PARAM_OPENS_IN_WINDOW, Integer.valueOf(i2)), new vq8(MindfulPauseEvent.PARAM_DAILY_LIMIT, Integer.valueOf(i3))}, null);
                this.packageName = str;
                this.durationSeconds = i;
                this.opensInWindow = i2;
                this.dailyLimit = i3;
            }

            private final String component1() {
                return this.packageName;
            }

            private final int component2() {
                return this.durationSeconds;
            }

            private final int component3() {
                return this.opensInWindow;
            }

            private final int component4() {
                return this.dailyLimit;
            }

            public static /* synthetic */ Shown copy$default(Shown shown, String str, int i, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = shown.packageName;
                }
                if ((i4 & 2) != 0) {
                    i = shown.durationSeconds;
                }
                if ((i4 & 4) != 0) {
                    i2 = shown.opensInWindow;
                }
                if ((i4 & 8) != 0) {
                    i3 = shown.dailyLimit;
                }
                return shown.copy(str, i, i2, i3);
            }

            public final Shown copy(String str, int i, int i2, int i3) {
                str.getClass();
                return new Shown(str, i, i2, i3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Shown)) {
                    return false;
                }
                Shown shown = (Shown) obj;
                return zy5.m23838d(this.packageName, shown.packageName) && this.durationSeconds == shown.durationSeconds && this.opensInWindow == shown.opensInWindow && this.dailyLimit == shown.dailyLimit;
            }

            public int hashCode() {
                return Integer.hashCode(this.dailyLimit) + pr1.m15965A(this.opensInWindow, pr1.m15965A(this.durationSeconds, this.packageName.hashCode() * 31, 31), 31);
            }

            public String toString() {
                String str = this.packageName;
                int i = this.durationSeconds;
                return pr1.m15979m(sj8.m18105q(i, "Shown(packageName=", str, ", durationSeconds=", ", opensInWindow="), this.opensInWindow, ", dailyLimit=", this.dailyLimit, ")");
            }
        }

        private MindfulPauseEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ MindfulPauseEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class NetworkEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_DNS_SAFETY_FAILURE = "action_dns_safety_trigger";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "network_event";
        private static final String PARAM_CURRENT_DNS = "current_dns";
        private static final String PARAM_HAS_CAPABILITY = "has_capability";
        private static final String PARAM_IS_CONNECTED = "is_connected";
        private static final String PARAM_IS_VPN = "is_vpn";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class DnsSafetyTrigger extends NetworkEvent {
            public static final int $stable = 0;
            private final String currentDns;
            private final boolean hasInternetCapability;
            private final boolean isConnected;
            private final boolean isVpn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DnsSafetyTrigger(String str, boolean z, boolean z2, boolean z3) {
                super(null);
                str.getClass();
                this.currentDns = str;
                this.isConnected = z;
                this.hasInternetCapability = z2;
                this.isVpn = z3;
            }

            public static /* synthetic */ DnsSafetyTrigger copy$default(DnsSafetyTrigger dnsSafetyTrigger, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dnsSafetyTrigger.currentDns;
                }
                if ((i & 2) != 0) {
                    z = dnsSafetyTrigger.isConnected;
                }
                if ((i & 4) != 0) {
                    z2 = dnsSafetyTrigger.hasInternetCapability;
                }
                if ((i & 8) != 0) {
                    z3 = dnsSafetyTrigger.isVpn;
                }
                return dnsSafetyTrigger.copy(str, z, z2, z3);
            }

            public final String component1() {
                return this.currentDns;
            }

            public final boolean component2() {
                return this.isConnected;
            }

            public final boolean component3() {
                return this.hasInternetCapability;
            }

            public final boolean component4() {
                return this.isVpn;
            }

            public final DnsSafetyTrigger copy(String str, boolean z, boolean z2, boolean z3) {
                str.getClass();
                return new DnsSafetyTrigger(str, z, z2, z3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DnsSafetyTrigger)) {
                    return false;
                }
                DnsSafetyTrigger dnsSafetyTrigger = (DnsSafetyTrigger) obj;
                return zy5.m23838d(this.currentDns, dnsSafetyTrigger.currentDns) && this.isConnected == dnsSafetyTrigger.isConnected && this.hasInternetCapability == dnsSafetyTrigger.hasInternetCapability && this.isVpn == dnsSafetyTrigger.isVpn;
            }

            public final String getCurrentDns() {
                return this.currentDns;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, NetworkEvent.ACTION_DNS_SAFETY_FAILURE), new vq8(NetworkEvent.PARAM_CURRENT_DNS, this.currentDns), new vq8(NetworkEvent.PARAM_IS_CONNECTED, Boolean.valueOf(this.isConnected)), new vq8(NetworkEvent.PARAM_HAS_CAPABILITY, Boolean.valueOf(this.hasInternetCapability)), new vq8(NetworkEvent.PARAM_IS_VPN, Boolean.valueOf(this.isVpn)));
            }

            public final boolean getHasInternetCapability() {
                return this.hasInternetCapability;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isVpn) + t8c.m18682f(t8c.m18682f(this.currentDns.hashCode() * 31, 31, this.isConnected), 31, this.hasInternetCapability);
            }

            public final boolean isConnected() {
                return this.isConnected;
            }

            public final boolean isVpn() {
                return this.isVpn;
            }

            public String toString() {
                return "DnsSafetyTrigger(currentDns=" + this.currentDns + ", isConnected=" + this.isConnected + ", hasInternetCapability=" + this.hasInternetCapability + ", isVpn=" + this.isVpn + ")";
            }
        }

        private NetworkEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ NetworkEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class OpenSettingsEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_OPEN_SETTINGS = "action_open_settings";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "open_settings";
        private static final String PARAM_DNS_SETTINGS = "dns_settings";
        private static final String PARAM_PROTECTION_SETTINGS = "protection_settings";
        private static final String PARAM_SETTINGS_FROM = "settings_from";
        private final String actionName;
        private final String dns;
        private final String from;
        private final String protection;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class OpenSettings extends OpenSettingsEvent {
            public static final int $stable = 0;
            private final String dns;
            private final String from;
            private final String protection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenSettings(String str, String str2, String str3) {
                super(OpenSettingsEvent.ACTION_OPEN_SETTINGS, str, str2, str3, null);
                tz6.m19222w(str, str2, str3);
                this.dns = str;
                this.protection = str2;
                this.from = str3;
            }

            private final String component1() {
                return this.dns;
            }

            private final String component2() {
                return this.protection;
            }

            private final String component3() {
                return this.from;
            }

            public static /* synthetic */ OpenSettings copy$default(OpenSettings openSettings, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openSettings.dns;
                }
                if ((i & 2) != 0) {
                    str2 = openSettings.protection;
                }
                if ((i & 4) != 0) {
                    str3 = openSettings.from;
                }
                return openSettings.copy(str, str2, str3);
            }

            public final OpenSettings copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new OpenSettings(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenSettings)) {
                    return false;
                }
                OpenSettings openSettings = (OpenSettings) obj;
                return zy5.m23838d(this.dns, openSettings.dns) && zy5.m23838d(this.protection, openSettings.protection) && zy5.m23838d(this.from, openSettings.from);
            }

            public int hashCode() {
                return this.from.hashCode() + t8c.m18683g(this.dns.hashCode() * 31, this.protection, 31);
            }

            public String toString() {
                String str = this.dns;
                String str2 = this.protection;
                return pr1.m15980n(pr1.m15984r("OpenSettings(dns=", str, ", protection=", str2, ", from="), this.from, ")");
            }
        }

        private OpenSettingsEvent(String str, String str2, String str3, String str4) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.dns = str2;
            this.protection = str3;
            this.from = str4;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_DNS_SETTINGS, this.dns), new vq8(PARAM_PROTECTION_SETTINGS, this.protection), new vq8(PARAM_SETTINGS_FROM, this.from));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ OpenSettingsEvent(String str, String str2, String str3, String str4, mr2 mr2Var) {
            this(str, str2, str3, str4);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class ParentalControlEvent extends AnalyticsEvent {
        private static final String ACTION_PARENTAL_CONTROL_ACTIVITY = "action_parental_control_activity";
        private static final String EVENT_NAME = "parental_control_activity";
        private static final String PARAM_PARENTAL_CONTROL_ACTIVITY = "parental_control_activity";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class TrackParentalControlActivity extends ParentalControlEvent {
            public static final int $stable = 8;
            private final mu8 activity;
            private final dlb sourceScreen;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public TrackParentalControlActivity(mu8 mu8Var, dlb dlbVar) {
                super(ParentalControlEvent.ACTION_PARENTAL_CONTROL_ACTIVITY, new vq8[]{new vq8("parental_control_activity", r0), new vq8(ParentalControlEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())}, r1);
                String str;
                mu8Var.getClass();
                dlbVar.getClass();
                mr2 mr2Var = null;
                if (mu8Var instanceof ku8) {
                    str = "login_as_supervised_account";
                } else if (mu8Var instanceof hu8) {
                    str = "add_supervised_account";
                } else if (mu8Var instanceof lu8) {
                    str = "manage_child_accounts";
                } else if (mu8Var instanceof gu8) {
                    str = "add_child_clicked";
                } else if (mu8Var instanceof ju8) {
                    str = "emergency_codes_clicked";
                } else {
                    if (!(mu8Var instanceof iu8)) {
                        gpc.m8801a();
                        throw null;
                    }
                    str = "emergency_code_generated";
                }
                this.activity = mu8Var;
                this.sourceScreen = dlbVar;
            }

            private final mu8 component1() {
                return this.activity;
            }

            private final dlb component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ TrackParentalControlActivity copy$default(TrackParentalControlActivity trackParentalControlActivity, mu8 mu8Var, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    mu8Var = trackParentalControlActivity.activity;
                }
                if ((i & 2) != 0) {
                    dlbVar = trackParentalControlActivity.sourceScreen;
                }
                return trackParentalControlActivity.copy(mu8Var, dlbVar);
            }

            public final TrackParentalControlActivity copy(mu8 mu8Var, dlb dlbVar) {
                mu8Var.getClass();
                dlbVar.getClass();
                return new TrackParentalControlActivity(mu8Var, dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrackParentalControlActivity)) {
                    return false;
                }
                TrackParentalControlActivity trackParentalControlActivity = (TrackParentalControlActivity) obj;
                return zy5.m23838d(this.activity, trackParentalControlActivity.activity) && zy5.m23838d(this.sourceScreen, trackParentalControlActivity.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.activity.hashCode() * 31);
            }

            public String toString() {
                return "TrackParentalControlActivity(activity=" + this.activity + ", sourceScreen=" + this.sourceScreen + ")";
            }
        }

        private ParentalControlEvent(String str, vq8... vq8VarArr) {
            super("parental_control_activity", null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ParentalControlEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class PostDnsSetDiagnosticEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_HEALTH_CHECK = "action_health_check";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "post_dns_set_diagnostic";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Check extends PostDnsSetDiagnosticEvent {
            public static final int $stable = 0;
            private final boolean capturedOffline;
            private final String currentDns;
            private final Map<String, Object> diagnosticData;
            private final boolean isDnsFailure;
            private final boolean isKahfDns;
            private final String lastKnownDns;
            private final String lastKnownIp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Check(Map<String, ? extends Object> map, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
                super(null);
                map.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.diagnosticData = map;
                this.currentDns = str;
                this.lastKnownDns = str2;
                this.lastKnownIp = str3;
                this.isKahfDns = z;
                this.isDnsFailure = z2;
                this.capturedOffline = z3;
            }

            private final Map<String, Object> component1() {
                return this.diagnosticData;
            }

            private final String component2() {
                return this.currentDns;
            }

            private final String component3() {
                return this.lastKnownDns;
            }

            private final String component4() {
                return this.lastKnownIp;
            }

            private final boolean component5() {
                return this.isKahfDns;
            }

            private final boolean component6() {
                return this.isDnsFailure;
            }

            private final boolean component7() {
                return this.capturedOffline;
            }

            public static /* synthetic */ Check copy$default(Check check, Map map, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = check.diagnosticData;
                }
                if ((i & 2) != 0) {
                    str = check.currentDns;
                }
                if ((i & 4) != 0) {
                    str2 = check.lastKnownDns;
                }
                if ((i & 8) != 0) {
                    str3 = check.lastKnownIp;
                }
                if ((i & 16) != 0) {
                    z = check.isKahfDns;
                }
                if ((i & 32) != 0) {
                    z2 = check.isDnsFailure;
                }
                if ((i & 64) != 0) {
                    z3 = check.capturedOffline;
                }
                boolean z4 = z2;
                boolean z5 = z3;
                boolean z6 = z;
                String str4 = str2;
                return check.copy(map, str, str4, str3, z6, z4, z5);
            }

            public final Check copy(Map<String, ? extends Object> map, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
                map.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new Check(map, str, str2, str3, z, z2, z3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Check)) {
                    return false;
                }
                Check check = (Check) obj;
                return zy5.m23838d(this.diagnosticData, check.diagnosticData) && zy5.m23838d(this.currentDns, check.currentDns) && zy5.m23838d(this.lastKnownDns, check.lastKnownDns) && zy5.m23838d(this.lastKnownIp, check.lastKnownIp) && this.isKahfDns == check.isKahfDns && this.isDnsFailure == check.isDnsFailure && this.capturedOffline == check.capturedOffline;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(AnalyticsEvent.PARAM_ACTION, PostDnsSetDiagnosticEvent.ACTION_HEALTH_CHECK);
                g77Var.put("current_dns", this.currentDns);
                g77Var.put(PrefKeys.LAST_KNOWN_DNS, this.lastKnownDns);
                g77Var.put(PrefKeys.LAST_KNOWN_IP, this.lastKnownIp);
                g77Var.put("is_kahf_dns", Boolean.valueOf(this.isKahfDns));
                g77Var.put("is_dns_failure", Boolean.valueOf(this.isDnsFailure));
                g77Var.put("captured_offline", Boolean.valueOf(this.capturedOffline));
                for (Map.Entry<String, Object> entry : this.diagnosticData.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        g77Var.put(key, value);
                    }
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                return Boolean.hashCode(this.capturedOffline) + t8c.m18682f(t8c.m18682f(t8c.m18683g(t8c.m18683g(t8c.m18683g(this.diagnosticData.hashCode() * 31, this.currentDns, 31), this.lastKnownDns, 31), this.lastKnownIp, 31), 31, this.isKahfDns), 31, this.isDnsFailure);
            }

            public String toString() {
                Map<String, Object> map = this.diagnosticData;
                String str = this.currentDns;
                String str2 = this.lastKnownDns;
                String str3 = this.lastKnownIp;
                boolean z = this.isKahfDns;
                boolean z2 = this.isDnsFailure;
                boolean z3 = this.capturedOffline;
                StringBuilder sb = new StringBuilder("Check(diagnosticData=");
                sb.append(map);
                sb.append(", currentDns=");
                sb.append(str);
                sb.append(", lastKnownDns=");
                pr1.m15992z(sb, str2, ", lastKnownIp=", str3, ", isKahfDns=");
                tz6.m19225z(sb, z, ", isDnsFailure=", z2, ", capturedOffline=");
                return tz6.m19215p(sb, z3, ")");
            }
        }

        private PostDnsSetDiagnosticEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ PostDnsSetDiagnosticEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class PosthogSetPropTesterEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_TEST_EVENT = "action_test_event";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "posthog_set_prop_tester";
        private static final String PARAM_TEST_MESSAGE = "test_message";
        private final String actionName;
        private final String message;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SendTestEvent extends PosthogSetPropTesterEvent {
            public static final int $stable = 0;
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendTestEvent(String str) {
                super(PosthogSetPropTesterEvent.ACTION_TEST_EVENT, str, null);
                str.getClass();
                this.message = str;
            }

            private final String component1() {
                return this.message;
            }

            public static /* synthetic */ SendTestEvent copy$default(SendTestEvent sendTestEvent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sendTestEvent.message;
                }
                return sendTestEvent.copy(str);
            }

            public final SendTestEvent copy(String str) {
                str.getClass();
                return new SendTestEvent(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SendTestEvent) && zy5.m23838d(this.message, ((SendTestEvent) obj).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SendTestEvent(message=", this.message, ")");
            }
        }

        private PosthogSetPropTesterEvent(String str, String str2) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.message = str2;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_TEST_MESSAGE, this.message));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ PosthogSetPropTesterEvent(String str, String str2, mr2 mr2Var) {
            this(str, str2);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class PrayerSilenceEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_PRAYER_SILENCE_TOGGLE = "action_prayer_silence_toggle";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "prayer_silence_activity";
        private static final String PARAM_WAQT_NAME = "waqt_name";
        private final String actionName;
        private final String waqtName;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class PrayerSilenceToggle extends PrayerSilenceEvent {
            public static final int $stable = 0;
            private final String waqtName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrayerSilenceToggle(String str) {
                super(PrayerSilenceEvent.ACTION_PRAYER_SILENCE_TOGGLE, str, null);
                str.getClass();
                this.waqtName = str;
            }

            private final String component1() {
                return this.waqtName;
            }

            public static /* synthetic */ PrayerSilenceToggle copy$default(PrayerSilenceToggle prayerSilenceToggle, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = prayerSilenceToggle.waqtName;
                }
                return prayerSilenceToggle.copy(str);
            }

            public final PrayerSilenceToggle copy(String str) {
                str.getClass();
                return new PrayerSilenceToggle(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrayerSilenceToggle) && zy5.m23838d(this.waqtName, ((PrayerSilenceToggle) obj).waqtName);
            }

            public int hashCode() {
                return this.waqtName.hashCode();
            }

            public String toString() {
                return tz6.m19210k("PrayerSilenceToggle(waqtName=", this.waqtName, ")");
            }
        }

        private PrayerSilenceEvent(String str, String str2) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.waqtName = str2;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_WAQT_NAME, this.waqtName));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ PrayerSilenceEvent(String str, String str2, mr2 mr2Var) {
            this(str, str2);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class PremiumSupportEvent extends AnalyticsEvent {
        private static final String ACTION_CARD_CLICK = "action_card_click";
        private static final String ACTION_OPEN_FAILURE = "action_open_failure";
        private static final String ACTION_OPEN_SUCCESS = "action_open_success";
        private static final String EVENT_NAME = "premium_support_activity";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_ERROR_TYPE = "error_type";
        private static final String PARAM_LAUNCH_METHOD = "launch_method";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CardClick extends PremiumSupportEvent {
            public static final int $stable = 8;
            private final String sourceScreen;

            public CardClick(String str) {
                super(PremiumSupportEvent.ACTION_CARD_CLICK, new vq8[]{AbstractC0327f4.m7612e(str, PremiumSupportEvent.PARAM_SOURCE_SCREEN, str)}, null);
                this.sourceScreen = str;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            public static /* synthetic */ CardClick copy$default(CardClick cardClick, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cardClick.sourceScreen;
                }
                return cardClick.copy(str);
            }

            public final CardClick copy(String str) {
                str.getClass();
                return new CardClick(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardClick) && zy5.m23838d(this.sourceScreen, ((CardClick) obj).sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode();
            }

            public String toString() {
                return tz6.m19210k("CardClick(sourceScreen=", this.sourceScreen, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class OpenFailure extends PremiumSupportEvent {
            public static final int $stable = 8;
            private final String errorMessage;
            private final String errorType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenFailure(String str, String str2, String str3) {
                super(PremiumSupportEvent.ACTION_OPEN_FAILURE, new vq8[]{new vq8(PremiumSupportEvent.PARAM_SOURCE_SCREEN, str), new vq8(PremiumSupportEvent.PARAM_ERROR_TYPE, str2), new vq8(PremiumSupportEvent.PARAM_ERROR_MESSAGE, str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.sourceScreen = str;
                this.errorType = str2;
                this.errorMessage = str3;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            private final String component2() {
                return this.errorType;
            }

            private final String component3() {
                return this.errorMessage;
            }

            public static /* synthetic */ OpenFailure copy$default(OpenFailure openFailure, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openFailure.sourceScreen;
                }
                if ((i & 2) != 0) {
                    str2 = openFailure.errorType;
                }
                if ((i & 4) != 0) {
                    str3 = openFailure.errorMessage;
                }
                return openFailure.copy(str, str2, str3);
            }

            public final OpenFailure copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new OpenFailure(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenFailure)) {
                    return false;
                }
                OpenFailure openFailure = (OpenFailure) obj;
                return zy5.m23838d(this.sourceScreen, openFailure.sourceScreen) && zy5.m23838d(this.errorType, openFailure.errorType) && zy5.m23838d(this.errorMessage, openFailure.errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode() + t8c.m18683g(this.sourceScreen.hashCode() * 31, this.errorType, 31);
            }

            public String toString() {
                String str = this.sourceScreen;
                String str2 = this.errorType;
                return pr1.m15980n(pr1.m15984r("OpenFailure(sourceScreen=", str, ", errorType=", str2, ", errorMessage="), this.errorMessage, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class OpenSuccess extends PremiumSupportEvent {
            public static final int $stable = 8;
            private final String launchMethod;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenSuccess(String str, String str2) {
                super(PremiumSupportEvent.ACTION_OPEN_SUCCESS, new vq8[]{new vq8(PremiumSupportEvent.PARAM_SOURCE_SCREEN, str), new vq8(PremiumSupportEvent.PARAM_LAUNCH_METHOD, str2)}, null);
                str.getClass();
                str2.getClass();
                this.sourceScreen = str;
                this.launchMethod = str2;
            }

            private final String component1() {
                return this.sourceScreen;
            }

            private final String component2() {
                return this.launchMethod;
            }

            public static /* synthetic */ OpenSuccess copy$default(OpenSuccess openSuccess, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openSuccess.sourceScreen;
                }
                if ((i & 2) != 0) {
                    str2 = openSuccess.launchMethod;
                }
                return openSuccess.copy(str, str2);
            }

            public final OpenSuccess copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new OpenSuccess(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenSuccess)) {
                    return false;
                }
                OpenSuccess openSuccess = (OpenSuccess) obj;
                return zy5.m23838d(this.sourceScreen, openSuccess.sourceScreen) && zy5.m23838d(this.launchMethod, openSuccess.launchMethod);
            }

            public int hashCode() {
                return this.launchMethod.hashCode() + (this.sourceScreen.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("OpenSuccess(sourceScreen=", this.sourceScreen, ", launchMethod=", this.launchMethod, ")");
            }
        }

        private PremiumSupportEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ PremiumSupportEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class ProtectionActiveEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_PROTECTION_ACTIVE = "action_protection_active";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "protection_active";
        private static final String PARAM_ACTIVE_COUNT = "active_protection_count";
        private static final String PARAM_EFFECTIVE = "protection_effective";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Daily extends ProtectionActiveEvent {
            public static final int $stable = 0;
            private final int activeCount;
            private final Map<String, Object> categories;
            private final boolean effective;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Daily(int i, boolean z, Map<String, ? extends Object> map) {
                super(null);
                map.getClass();
                this.activeCount = i;
                this.effective = z;
                this.categories = map;
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14872I(this.categories, o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, ProtectionActiveEvent.ACTION_PROTECTION_ACTIVE), new vq8(ProtectionActiveEvent.PARAM_ACTIVE_COUNT, Integer.valueOf(this.activeCount)), new vq8(ProtectionActiveEvent.PARAM_EFFECTIVE, Boolean.valueOf(this.effective)), new vq8("timestamp", Long.valueOf(zv5.f53149a.mo2814g().m22370e()))));
            }
        }

        private ProtectionActiveEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ProtectionActiveEvent(mr2 mr2Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class ReligionEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        private static final String ACTION_SET_RELIGION = "action_set_religion";
        private static final String ACTION_UPDATE_RELIGION = "action_update_religion";
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "religion_change";
        private static final String PARAM_RELIGION_CHANGED = "religion_changed";
        private final String actionName;
        private final String religion;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SetReligion extends ReligionEvent {
            public static final int $stable = 0;
            private final String religion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetReligion(String str) {
                super(ReligionEvent.ACTION_SET_RELIGION, str, null);
                str.getClass();
                this.religion = str;
            }

            private final String component1() {
                return this.religion;
            }

            public static /* synthetic */ SetReligion copy$default(SetReligion setReligion, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setReligion.religion;
                }
                return setReligion.copy(str);
            }

            public final SetReligion copy(String str) {
                str.getClass();
                return new SetReligion(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetReligion) && zy5.m23838d(this.religion, ((SetReligion) obj).religion);
            }

            public int hashCode() {
                return this.religion.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SetReligion(religion=", this.religion, iazcOQnbJex.SJnJvjo);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class UpdateReligion extends ReligionEvent {
            public static final int $stable = 0;
            private final String religion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateReligion(String str) {
                super(ReligionEvent.ACTION_UPDATE_RELIGION, str, null);
                str.getClass();
                this.religion = str;
            }

            private final String component1() {
                return this.religion;
            }

            public static /* synthetic */ UpdateReligion copy$default(UpdateReligion updateReligion, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateReligion.religion;
                }
                return updateReligion.copy(str);
            }

            public final UpdateReligion copy(String str) {
                str.getClass();
                return new UpdateReligion(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateReligion) && zy5.m23838d(this.religion, ((UpdateReligion) obj).religion);
            }

            public int hashCode() {
                return this.religion.hashCode();
            }

            public String toString() {
                return tz6.m19210k("UpdateReligion(religion=", this.religion, ")");
            }
        }

        private ReligionEvent(String str, String str2) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.religion = str2;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            return o97.m14870G(new vq8(AnalyticsEvent.PARAM_ACTION, this.actionName), new vq8(PARAM_RELIGION_CHANGED, this.religion));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ReligionEvent(String str, String str2, mr2 mr2Var) {
            this(str, str2);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class RestrictionSyncEvent extends AnalyticsEvent {
        private static final String ACTION_SYNC_FAILED = "action_sync_failed";
        private static final String ACTION_SYNC_REFUSED = "action_sync_refused";
        private static final String EVENT_NAME = "restriction_sync";
        private static final String PARAM_FAILURE_STAGE = "failure_stage";
        private static final String PARAM_FEATURE = "feature";
        private static final String PARAM_INTENT = "intent";
        private static final String PARAM_PREFERENCE_KEY = "preference_key";
        private static final String PARAM_REASON = "reason";
        private static final String PARAM_TARGET = "target";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SyncFailed extends RestrictionSyncEvent {
            public static final int $stable = 8;
            private final String failureStage;
            private final String feature;
            private final String intent;
            private final String preferenceKey;
            private final String target;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SyncFailed(String str, String str2, String str3, String str4, String str5) {
                super(RestrictionSyncEvent.ACTION_SYNC_FAILED, new vq8[]{new vq8(RestrictionSyncEvent.PARAM_FEATURE, str), new vq8(RestrictionSyncEvent.PARAM_PREFERENCE_KEY, str2), new vq8(RestrictionSyncEvent.PARAM_INTENT, str3), new vq8(RestrictionSyncEvent.PARAM_TARGET, str4), new vq8(RestrictionSyncEvent.PARAM_FAILURE_STAGE, str5)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                this.feature = str;
                this.preferenceKey = str2;
                this.intent = str3;
                this.target = str4;
                this.failureStage = str5;
            }

            private final String component1() {
                return this.feature;
            }

            private final String component2() {
                return this.preferenceKey;
            }

            private final String component3() {
                return this.intent;
            }

            private final String component4() {
                return this.target;
            }

            private final String component5() {
                return this.failureStage;
            }

            public static /* synthetic */ SyncFailed copy$default(SyncFailed syncFailed, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = syncFailed.feature;
                }
                if ((i & 2) != 0) {
                    str2 = syncFailed.preferenceKey;
                }
                if ((i & 4) != 0) {
                    str3 = syncFailed.intent;
                }
                if ((i & 8) != 0) {
                    str4 = syncFailed.target;
                }
                if ((i & 16) != 0) {
                    str5 = syncFailed.failureStage;
                }
                String str6 = str5;
                String str7 = str3;
                return syncFailed.copy(str, str2, str7, str4, str6);
            }

            public final SyncFailed copy(String str, String str2, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new SyncFailed(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SyncFailed)) {
                    return false;
                }
                SyncFailed syncFailed = (SyncFailed) obj;
                return zy5.m23838d(this.feature, syncFailed.feature) && zy5.m23838d(this.preferenceKey, syncFailed.preferenceKey) && zy5.m23838d(this.intent, syncFailed.intent) && zy5.m23838d(this.target, syncFailed.target) && zy5.m23838d(this.failureStage, syncFailed.failureStage);
            }

            public int hashCode() {
                return this.failureStage.hashCode() + t8c.m18683g(t8c.m18683g(t8c.m18683g(this.feature.hashCode() * 31, this.preferenceKey, 31), this.intent, 31), this.target, 31);
            }

            public String toString() {
                String str = this.feature;
                String str2 = this.preferenceKey;
                String str3 = this.intent;
                String str4 = this.target;
                String str5 = this.failureStage;
                StringBuilder m15984r = pr1.m15984r("SyncFailed(feature=", str, ", preferenceKey=", str2, ", intent=");
                pr1.m15992z(m15984r, str3, ", target=", str4, ", failureStage=");
                return pr1.m15980n(m15984r, str5, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SyncRefused extends RestrictionSyncEvent {
            public static final int $stable = 8;
            private final String reason;

            public SyncRefused(String str) {
                super(RestrictionSyncEvent.ACTION_SYNC_REFUSED, new vq8[]{AbstractC0327f4.m7612e(str, RestrictionSyncEvent.PARAM_REASON, str)}, null);
                this.reason = str;
            }

            private final String component1() {
                return this.reason;
            }

            public static /* synthetic */ SyncRefused copy$default(SyncRefused syncRefused, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = syncRefused.reason;
                }
                return syncRefused.copy(str);
            }

            public final SyncRefused copy(String str) {
                str.getClass();
                return new SyncRefused(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SyncRefused) && zy5.m23838d(this.reason, ((SyncRefused) obj).reason);
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SyncRefused(reason=", this.reason, ")");
            }
        }

        private RestrictionSyncEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ RestrictionSyncEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static abstract class ScreenViewEvent extends AnalyticsEvent {
        private static final String ACTION_VIEW_SCREEN = "action_view_screen";
        private static final String EVENT_NAME = "screen_view";
        private static final String PARAM_PREVIOUS_SCREEN = "previous_screen";
        private static final String PARAM_SCREEN_NAME = "screen_name";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private ScreenViewEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ScreenViewEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ViewScreen extends ScreenViewEvent {
            public static final int $stable = 8;
            private final lva previousScreen;
            private final lva screen;
            private final dlb sourceScreen;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ViewScreen(lva lvaVar, lva lvaVar2, dlb dlbVar) {
                super(ScreenViewEvent.ACTION_VIEW_SCREEN, (vq8[]) r0.toArray(new vq8[r0.size()]), null);
                lvaVar.getClass();
                x11 x11Var = new x11(3);
                sj8.m18111w(x11Var, ScreenViewEvent.PARAM_SCREEN_NAME, lvaVar.m13002a());
                x11Var.m21792c(lvaVar2 != null ? new vq8[]{new vq8(ScreenViewEvent.PARAM_PREVIOUS_SCREEN, lvaVar2.m13002a())} : new vq8[0]);
                x11Var.m21792c(dlbVar != null ? new vq8[]{new vq8(ScreenViewEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())} : new vq8[0]);
                ArrayList arrayList = x11Var.f47436b;
                this.screen = lvaVar;
                this.previousScreen = lvaVar2;
                this.sourceScreen = dlbVar;
            }

            private final lva component1() {
                return this.screen;
            }

            private final lva component2() {
                return this.previousScreen;
            }

            private final dlb component3() {
                return this.sourceScreen;
            }

            public static /* synthetic */ ViewScreen copy$default(ViewScreen viewScreen, lva lvaVar, lva lvaVar2, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lvaVar = viewScreen.screen;
                }
                if ((i & 2) != 0) {
                    lvaVar2 = viewScreen.previousScreen;
                }
                if ((i & 4) != 0) {
                    dlbVar = viewScreen.sourceScreen;
                }
                return viewScreen.copy(lvaVar, lvaVar2, dlbVar);
            }

            public final ViewScreen copy(lva lvaVar, lva lvaVar2, dlb dlbVar) {
                lvaVar.getClass();
                return new ViewScreen(lvaVar, lvaVar2, dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewScreen)) {
                    return false;
                }
                ViewScreen viewScreen = (ViewScreen) obj;
                return zy5.m23838d(this.screen, viewScreen.screen) && zy5.m23838d(this.previousScreen, viewScreen.previousScreen) && zy5.m23838d(this.sourceScreen, viewScreen.sourceScreen);
            }

            public int hashCode() {
                int hashCode = this.screen.hashCode() * 31;
                lva lvaVar = this.previousScreen;
                int hashCode2 = (hashCode + (lvaVar == null ? 0 : lvaVar.hashCode())) * 31;
                dlb dlbVar = this.sourceScreen;
                return hashCode2 + (dlbVar != null ? dlbVar.hashCode() : 0);
            }

            public String toString() {
                return "ViewScreen(screen=" + this.screen + ", previousScreen=" + this.previousScreen + ", sourceScreen=" + this.sourceScreen + ")";
            }

            public /* synthetic */ ViewScreen(lva lvaVar, lva lvaVar2, dlb dlbVar, int i, mr2 mr2Var) {
                this(lvaVar, (i & 2) != 0 ? null : lvaVar2, (i & 4) != 0 ? null : dlbVar);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class SessionEvent extends AnalyticsEvent {
        private static final String ACTION_USER_SESSION = "action_user_session";
        private static final String EVENT_NAME = "session_user";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SessionUser extends SessionEvent {
            public static final int $stable = 0;
            public static final SessionUser INSTANCE = new SessionUser();

            private SessionUser() {
                super(SessionEvent.ACTION_USER_SESSION, new vq8[0], null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SessionUser);
            }

            public int hashCode() {
                return 141875308;
            }

            public String toString() {
                return "SessionUser";
            }
        }

        private SessionEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ SessionEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class SocialActivityEvent extends AnalyticsEvent {
        private static final String ACTION_SOCIAL_ACTIVITY = "action_social_activity";
        private static final String EVENT_NAME = "social_activity";
        private static final String PARAM_ACTIVITY_TYPE = "social_activity_type";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class TrackSocialActivity extends SocialActivityEvent {
            public static final int $stable = 8;
            private final cib activity;
            private final dlb sourceScreen;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public TrackSocialActivity(cib cibVar, dlb dlbVar) {
                super(SocialActivityEvent.ACTION_SOCIAL_ACTIVITY, new vq8[]{new vq8(SocialActivityEvent.PARAM_ACTIVITY_TYPE, r0), new vq8(SocialActivityEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())}, r1);
                String str;
                cibVar.getClass();
                dlbVar.getClass();
                mr2 mr2Var = null;
                if (cibVar instanceof bib) {
                    str = "share_app";
                } else if (cibVar instanceof shb) {
                    str = "go_to_community";
                } else if (cibVar instanceof thb) {
                    str = "go_to_contact";
                } else if (cibVar instanceof uhb) {
                    str = "go_to_support";
                } else if (cibVar instanceof vhb) {
                    str = "go_to_kahf_browser";
                } else if (cibVar instanceof yhb) {
                    str = "go_to_kahf_kids";
                } else if (cibVar instanceof zhb) {
                    str = "go_to_mahfil";
                } else if (cibVar instanceof whb) {
                    str = "go_to_kahf_guard";
                } else if (cibVar instanceof xhb) {
                    str = "go_to_kahf_internet";
                } else {
                    if (!(cibVar instanceof aib)) {
                        gpc.m8801a();
                        throw null;
                    }
                    str = "go_to_muslims_day";
                }
                this.activity = cibVar;
                this.sourceScreen = dlbVar;
            }

            private final cib component1() {
                return this.activity;
            }

            private final dlb component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ TrackSocialActivity copy$default(TrackSocialActivity trackSocialActivity, cib cibVar, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cibVar = trackSocialActivity.activity;
                }
                if ((i & 2) != 0) {
                    dlbVar = trackSocialActivity.sourceScreen;
                }
                return trackSocialActivity.copy(cibVar, dlbVar);
            }

            public final TrackSocialActivity copy(cib cibVar, dlb dlbVar) {
                cibVar.getClass();
                dlbVar.getClass();
                return new TrackSocialActivity(cibVar, dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrackSocialActivity)) {
                    return false;
                }
                TrackSocialActivity trackSocialActivity = (TrackSocialActivity) obj;
                return zy5.m23838d(this.activity, trackSocialActivity.activity) && zy5.m23838d(this.sourceScreen, trackSocialActivity.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.activity.hashCode() * 31);
            }

            public String toString() {
                return "TrackSocialActivity(activity=" + this.activity + ", sourceScreen=" + this.sourceScreen + ")";
            }
        }

        private SocialActivityEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ SocialActivityEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class SocialShareEvent extends AnalyticsEvent {
        private static final String ACTION_SHARE_CLICKED = "action_share_clicked";
        private static final String EVENT_NAME = "social_share";
        private static final String PARAM_SHARE_PLATFORM = "share_platform";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ShareClicked extends SocialShareEvent {
            public static final int $stable = 8;
            private final rib platform;
            private final dlb sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareClicked(rib ribVar, dlb dlbVar) {
                super(SocialShareEvent.ACTION_SHARE_CLICKED, new vq8[]{new vq8(SocialShareEvent.PARAM_SHARE_PLATFORM, ribVar.m17363a()), new vq8(SocialShareEvent.PARAM_SOURCE_SCREEN, dlbVar.m6433a())}, null);
                ribVar.getClass();
                dlbVar.getClass();
                this.platform = ribVar;
                this.sourceScreen = dlbVar;
            }

            private final rib component1() {
                return this.platform;
            }

            private final dlb component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ ShareClicked copy$default(ShareClicked shareClicked, rib ribVar, dlb dlbVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    ribVar = shareClicked.platform;
                }
                if ((i & 2) != 0) {
                    dlbVar = shareClicked.sourceScreen;
                }
                return shareClicked.copy(ribVar, dlbVar);
            }

            public final ShareClicked copy(rib ribVar, dlb dlbVar) {
                ribVar.getClass();
                dlbVar.getClass();
                return new ShareClicked(ribVar, dlbVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShareClicked)) {
                    return false;
                }
                ShareClicked shareClicked = (ShareClicked) obj;
                return zy5.m23838d(this.platform, shareClicked.platform) && zy5.m23838d(this.sourceScreen, shareClicked.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.platform.hashCode() * 31);
            }

            public String toString() {
                return "ShareClicked(platform=" + this.platform + ", sourceScreen=" + this.sourceScreen + ")";
            }
        }

        private SocialShareEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ SocialShareEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class SupervisionEvent extends AnalyticsEvent {
        private static final String ACTION_ACCEPT_REQUEST = "action_accept_request";
        private static final String ACTION_CANCEL_SUPERVISION = "action_cancel_supervision";
        private static final String ACTION_REJECT_REQUEST = "action_reject_request";
        private static final String ACTION_SEND_REQUEST = "action_send_request";
        private static final String ACTION_SUPERVISION_REQUEST_FAILED = "action_supervision_request_failed";
        private static final String ACTION_SUPERVISION_REQUEST_SUCCESS = "action_supervision_request_success";
        private static final String ACTION_VIEW_CHILD_DEVICE = "action_view_child_device";
        private static final String EVENT_NAME = "supervision_activity";
        private static final String PARAM_CHILD_DEVICE_TYPE = "child_device_type";
        private static final String PARAM_ERROR_MESSAGE = "error_message";
        private static final String PARAM_RELATIONSHIP_TYPE = "relationship_type";
        private static final String PARAM_SOURCE_SCREEN = "source_screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private SupervisionEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ SupervisionEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AcceptRequest extends SupervisionEvent {
            public static final int $stable = 8;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AcceptRequest(String str, String str2) {
                super(SupervisionEvent.ACTION_ACCEPT_REQUEST, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str.getClass();
                str2.getClass();
                this.relationshipType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ AcceptRequest copy$default(AcceptRequest acceptRequest, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = acceptRequest.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = acceptRequest.sourceScreen;
                }
                return acceptRequest.copy(str, str2);
            }

            public final AcceptRequest copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new AcceptRequest(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AcceptRequest)) {
                    return false;
                }
                AcceptRequest acceptRequest = (AcceptRequest) obj;
                return zy5.m23838d(this.relationshipType, acceptRequest.relationshipType) && zy5.m23838d(this.sourceScreen, acceptRequest.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.relationshipType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("AcceptRequest(relationshipType=", this.relationshipType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ AcceptRequest(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class CancelSupervision extends SupervisionEvent {
            public static final int $stable = 8;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSupervision(String str, String str2) {
                super(SupervisionEvent.ACTION_CANCEL_SUPERVISION, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str.getClass();
                str2.getClass();
                this.relationshipType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ CancelSupervision copy$default(CancelSupervision cancelSupervision, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cancelSupervision.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = cancelSupervision.sourceScreen;
                }
                return cancelSupervision.copy(str, str2);
            }

            public final CancelSupervision copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new CancelSupervision(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CancelSupervision)) {
                    return false;
                }
                CancelSupervision cancelSupervision = (CancelSupervision) obj;
                return zy5.m23838d(this.relationshipType, cancelSupervision.relationshipType) && zy5.m23838d(this.sourceScreen, cancelSupervision.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.relationshipType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("CancelSupervision(relationshipType=", this.relationshipType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ CancelSupervision(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class RejectRequest extends SupervisionEvent {
            public static final int $stable = 8;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RejectRequest(String str, String str2) {
                super(SupervisionEvent.ACTION_REJECT_REQUEST, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str.getClass();
                str2.getClass();
                this.relationshipType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ RejectRequest copy$default(RejectRequest rejectRequest, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rejectRequest.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = rejectRequest.sourceScreen;
                }
                return rejectRequest.copy(str, str2);
            }

            public final RejectRequest copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new RejectRequest(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RejectRequest)) {
                    return false;
                }
                RejectRequest rejectRequest = (RejectRequest) obj;
                return zy5.m23838d(this.relationshipType, rejectRequest.relationshipType) && zy5.m23838d(this.sourceScreen, rejectRequest.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.relationshipType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("RejectRequest(relationshipType=", this.relationshipType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ RejectRequest(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class RequestSuccess extends SupervisionEvent {
            public static final int $stable = 8;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestSuccess(String str, String str2) {
                super(SupervisionEvent.ACTION_SUPERVISION_REQUEST_SUCCESS, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str.getClass();
                str2.getClass();
                this.relationshipType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ RequestSuccess copy$default(RequestSuccess requestSuccess, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = requestSuccess.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = requestSuccess.sourceScreen;
                }
                return requestSuccess.copy(str, str2);
            }

            public final RequestSuccess copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new RequestSuccess(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestSuccess)) {
                    return false;
                }
                RequestSuccess requestSuccess = (RequestSuccess) obj;
                return zy5.m23838d(this.relationshipType, requestSuccess.relationshipType) && zy5.m23838d(this.sourceScreen, requestSuccess.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.relationshipType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("RequestSuccess(relationshipType=", this.relationshipType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ RequestSuccess(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class SendRequest extends SupervisionEvent {
            public static final int $stable = 8;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendRequest(String str, String str2) {
                super(SupervisionEvent.ACTION_SEND_REQUEST, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str.getClass();
                str2.getClass();
                this.relationshipType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ SendRequest copy$default(SendRequest sendRequest, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sendRequest.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = sendRequest.sourceScreen;
                }
                return sendRequest.copy(str, str2);
            }

            public final SendRequest copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new SendRequest(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SendRequest)) {
                    return false;
                }
                SendRequest sendRequest = (SendRequest) obj;
                return zy5.m23838d(this.relationshipType, sendRequest.relationshipType) && zy5.m23838d(this.sourceScreen, sendRequest.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + (this.relationshipType.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("SendRequest(relationshipType=", this.relationshipType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ SendRequest(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class ViewChildDevice extends SupervisionEvent {
            public static final int $stable = 8;
            private final String deviceType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewChildDevice(String str, String str2) {
                super(SupervisionEvent.ACTION_VIEW_CHILD_DEVICE, new vq8[]{new vq8(SupervisionEvent.PARAM_CHILD_DEVICE_TYPE, str == null ? "unknown" : str), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str2)}, null);
                str2.getClass();
                this.deviceType = str;
                this.sourceScreen = str2;
            }

            private final String component1() {
                return this.deviceType;
            }

            private final String component2() {
                return this.sourceScreen;
            }

            public static /* synthetic */ ViewChildDevice copy$default(ViewChildDevice viewChildDevice, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = viewChildDevice.deviceType;
                }
                if ((i & 2) != 0) {
                    str2 = viewChildDevice.sourceScreen;
                }
                return viewChildDevice.copy(str, str2);
            }

            public final ViewChildDevice copy(String str, String str2) {
                str2.getClass();
                return new ViewChildDevice(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewChildDevice)) {
                    return false;
                }
                ViewChildDevice viewChildDevice = (ViewChildDevice) obj;
                return zy5.m23838d(this.deviceType, viewChildDevice.deviceType) && zy5.m23838d(this.sourceScreen, viewChildDevice.sourceScreen);
            }

            public int hashCode() {
                String str = this.deviceType;
                return this.sourceScreen.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public String toString() {
                return tz6.m19212m("ViewChildDevice(deviceType=", this.deviceType, ", sourceScreen=", this.sourceScreen, ")");
            }

            public /* synthetic */ ViewChildDevice(String str, String str2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? "supervision_hub" : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class RequestFailed extends SupervisionEvent {
            public static final int $stable = 8;
            private final String errorMessage;
            private final String relationshipType;
            private final String sourceScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestFailed(String str, String str2, String str3) {
                super(SupervisionEvent.ACTION_SUPERVISION_REQUEST_FAILED, new vq8[]{new vq8(SupervisionEvent.PARAM_RELATIONSHIP_TYPE, str), new vq8(SupervisionEvent.PARAM_ERROR_MESSAGE, str2), new vq8(SupervisionEvent.PARAM_SOURCE_SCREEN, str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.relationshipType = str;
                this.errorMessage = str2;
                this.sourceScreen = str3;
            }

            private final String component1() {
                return this.relationshipType;
            }

            private final String component2() {
                return this.errorMessage;
            }

            private final String component3() {
                return this.sourceScreen;
            }

            public static /* synthetic */ RequestFailed copy$default(RequestFailed requestFailed, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = requestFailed.relationshipType;
                }
                if ((i & 2) != 0) {
                    str2 = requestFailed.errorMessage;
                }
                if ((i & 4) != 0) {
                    str3 = requestFailed.sourceScreen;
                }
                return requestFailed.copy(str, str2, str3);
            }

            public final RequestFailed copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new RequestFailed(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestFailed)) {
                    return false;
                }
                RequestFailed requestFailed = (RequestFailed) obj;
                return zy5.m23838d(this.relationshipType, requestFailed.relationshipType) && zy5.m23838d(this.errorMessage, requestFailed.errorMessage) && zy5.m23838d(this.sourceScreen, requestFailed.sourceScreen);
            }

            public int hashCode() {
                return this.sourceScreen.hashCode() + t8c.m18683g(this.relationshipType.hashCode() * 31, this.errorMessage, 31);
            }

            public String toString() {
                String str = this.relationshipType;
                String str2 = this.errorMessage;
                return pr1.m15980n(pr1.m15984r("RequestFailed(relationshipType=", str, ", errorMessage=", str2, ", sourceScreen="), this.sourceScreen, ")");
            }

            public /* synthetic */ RequestFailed(String str, String str2, String str3, int i, mr2 mr2Var) {
                this(str, str2, (i & 4) != 0 ? "supervision_hub" : str3);
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static abstract class TutorialEvent extends AnalyticsEvent {
        private static final String ACTION_DISMISS = "dismiss";
        private static final String ACTION_ERROR = "error";
        private static final String ACTION_PLAY = "play";
        private static final String EVENT_NAME = "tutorial";
        private static final String PARAM_ERROR_CODE = "error_code";
        private static final String PARAM_KEY = "tutorial_key";
        private static final String PARAM_LANGUAGE = "language";
        private static final String PARAM_SCREEN = "screen";
        private final String actionName;
        private final vq8[] params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Dismiss extends TutorialEvent {
            public static final int $stable = 8;
            private final String key;
            private final String language;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dismiss(String str, String str2, String str3) {
                super(TutorialEvent.ACTION_DISMISS, new vq8[]{new vq8(TutorialEvent.PARAM_KEY, str), new vq8(TutorialEvent.PARAM_SCREEN, str2), new vq8("language", str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.key = str;
                this.screen = str2;
                this.language = str3;
            }

            private final String component1() {
                return this.key;
            }

            private final String component2() {
                return this.screen;
            }

            private final String component3() {
                return this.language;
            }

            public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dismiss.key;
                }
                if ((i & 2) != 0) {
                    str2 = dismiss.screen;
                }
                if ((i & 4) != 0) {
                    str3 = dismiss.language;
                }
                return dismiss.copy(str, str2, str3);
            }

            public final Dismiss copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new Dismiss(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dismiss)) {
                    return false;
                }
                Dismiss dismiss = (Dismiss) obj;
                return zy5.m23838d(this.key, dismiss.key) && zy5.m23838d(this.screen, dismiss.screen) && zy5.m23838d(this.language, dismiss.language);
            }

            public int hashCode() {
                return this.language.hashCode() + t8c.m18683g(this.key.hashCode() * 31, this.screen, 31);
            }

            public String toString() {
                String str = this.key;
                String str2 = this.screen;
                return pr1.m15980n(pr1.m15984r("Dismiss(key=", str, ", screen=", str2, ", language="), this.language, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Error extends TutorialEvent {
            public static final int $stable = 8;
            private final String errorCode;
            private final String key;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str, String str2, String str3) {
                super(TutorialEvent.ACTION_ERROR, new vq8[]{new vq8(TutorialEvent.PARAM_KEY, str), new vq8(TutorialEvent.PARAM_SCREEN, str2), new vq8(TutorialEvent.PARAM_ERROR_CODE, str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.key = str;
                this.screen = str2;
                this.errorCode = str3;
            }

            private final String component1() {
                return this.key;
            }

            private final String component2() {
                return this.screen;
            }

            private final String component3() {
                return this.errorCode;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.key;
                }
                if ((i & 2) != 0) {
                    str2 = error.screen;
                }
                if ((i & 4) != 0) {
                    str3 = error.errorCode;
                }
                return error.copy(str, str2, str3);
            }

            public final Error copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new Error(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return zy5.m23838d(this.key, error.key) && zy5.m23838d(this.screen, error.screen) && zy5.m23838d(this.errorCode, error.errorCode);
            }

            public int hashCode() {
                return this.errorCode.hashCode() + t8c.m18683g(this.key.hashCode() * 31, this.screen, 31);
            }

            public String toString() {
                String str = this.key;
                String str2 = this.screen;
                return pr1.m15980n(pr1.m15984r("Error(key=", str, ", screen=", str2, ", errorCode="), this.errorCode, jpnKuHlzpT.GUrHbTP);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Play extends TutorialEvent {
            public static final int $stable = 8;
            private final String key;
            private final String language;
            private final String screen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Play(String str, String str2, String str3) {
                super(TutorialEvent.ACTION_PLAY, new vq8[]{new vq8(TutorialEvent.PARAM_KEY, str), new vq8(TutorialEvent.PARAM_SCREEN, str2), new vq8("language", str3)}, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.key = str;
                this.screen = str2;
                this.language = str3;
            }

            private final String component1() {
                return this.key;
            }

            private final String component2() {
                return this.screen;
            }

            private final String component3() {
                return this.language;
            }

            public static /* synthetic */ Play copy$default(Play play, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = play.key;
                }
                if ((i & 2) != 0) {
                    str2 = play.screen;
                }
                if ((i & 4) != 0) {
                    str3 = play.language;
                }
                return play.copy(str, str2, str3);
            }

            public final Play copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new Play(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Play)) {
                    return false;
                }
                Play play = (Play) obj;
                return zy5.m23838d(this.key, play.key) && zy5.m23838d(this.screen, play.screen) && zy5.m23838d(this.language, play.language);
            }

            public int hashCode() {
                return this.language.hashCode() + t8c.m18683g(this.key.hashCode() * 31, this.screen, 31);
            }

            public String toString() {
                String str = this.key;
                String str2 = this.screen;
                return pr1.m15980n(pr1.m15984r("Play(key=", str, ", screen=", str2, ", language="), this.language, ")");
            }
        }

        private TutorialEvent(String str, vq8... vq8VarArr) {
            super(EVENT_NAME, null);
            this.actionName = str;
            this.params = vq8VarArr;
        }

        @Override // com.kahf.dns.core.analytics.AnalyticsEvent
        public Map<String, Object> getData() {
            x11 x11Var = new x11(2);
            sj8.m18111w(x11Var, AnalyticsEvent.PARAM_ACTION, this.actionName);
            x11Var.m21792c(this.params);
            ArrayList arrayList = x11Var.f47436b;
            return o97.m14870G((vq8[]) arrayList.toArray(new vq8[arrayList.size()]));
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ TutorialEvent(String str, vq8[] vq8VarArr, mr2 mr2Var) {
            this(str, vq8VarArr);
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static abstract class UserJourneyEvent extends AnalyticsEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final String EVENT_NAME = "user_journey";
        private static final String PARAM_ERROR = "error";
        private static final String PARAM_FROM_STEP = "from_step";
        private static final String PARAM_GUARD_TYPE = "guard_type";
        private static final String PARAM_JOURNEY_ACTION = "journey_action";
        private static final String PARAM_LANGUAGE = "language";
        private static final String PARAM_PAYMENT_METHOD = "payment_method";
        private static final String PARAM_PLAN = "plan";
        private static final String PARAM_PURPOSE = "purpose";
        private static final String PARAM_REASON = "reason";
        private static final String PARAM_RELIGION = "religion";
        private static final String PARAM_RESULT = "result";
        private static final String PARAM_SOURCE = "source";
        private static final String PARAM_STEP = "step";
        private static final String PARAM_STEP_NAME = "step_name";

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class AppOpened extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final AppOpened INSTANCE = new AppOpened();

            private AppOpened() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AppOpened);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "app_opened");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 349136470;
            }

            public String toString() {
                return "AppOpened";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class AutoNavigateExistingUser extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String reason;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoNavigateExistingUser(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.source = str;
                this.reason = str2;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.reason;
            }

            public static /* synthetic */ AutoNavigateExistingUser copy$default(AutoNavigateExistingUser autoNavigateExistingUser, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = autoNavigateExistingUser.source;
                }
                if ((i & 2) != 0) {
                    str2 = autoNavigateExistingUser.reason;
                }
                return autoNavigateExistingUser.copy(str, str2);
            }

            public final AutoNavigateExistingUser copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new AutoNavigateExistingUser(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoNavigateExistingUser)) {
                    return false;
                }
                AutoNavigateExistingUser autoNavigateExistingUser = (AutoNavigateExistingUser) obj;
                return zy5.m23838d(this.source, autoNavigateExistingUser.source) && zy5.m23838d(this.reason, autoNavigateExistingUser.reason);
            }

            public int hashCode() {
                return this.reason.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("AutoNavigateExistingUser(source=", this.source, ", reason=", this.reason, ")");
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "auto_navigate_existing_user"), new vq8(jpnKuHlzpT.FCCaGLbGx, this.source), new vq8(UserJourneyEvent.PARAM_REASON, this.reason));
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ChildLoginDialogCancelClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final ChildLoginDialogCancelClicked INSTANCE = new ChildLoginDialogCancelClicked();

            private ChildLoginDialogCancelClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ChildLoginDialogCancelClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "child_login_dialog_cancel_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 125842788;
            }

            public String toString() {
                return "ChildLoginDialogCancelClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class ChildLoginDialogOkClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final ChildLoginDialogOkClicked INSTANCE = new ChildLoginDialogOkClicked();

            private ChildLoginDialogOkClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ChildLoginDialogOkClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "child_login_dialog_ok_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 429049666;
            }

            public String toString() {
                return "ChildLoginDialogOkClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DeviceRoleChildLoginResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceRoleChildLoginResult(String str) {
                super(null);
                str.getClass();
                this.result = str;
            }

            private final String component1() {
                return this.result;
            }

            public static /* synthetic */ DeviceRoleChildLoginResult copy$default(DeviceRoleChildLoginResult deviceRoleChildLoginResult, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deviceRoleChildLoginResult.result;
                }
                return deviceRoleChildLoginResult.copy(str);
            }

            public final DeviceRoleChildLoginResult copy(String str) {
                str.getClass();
                return new DeviceRoleChildLoginResult(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeviceRoleChildLoginResult) && zy5.m23838d(this.result, ((DeviceRoleChildLoginResult) obj).result);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "device_role_child_login_result"), new vq8(UserJourneyEvent.PARAM_RESULT, this.result));
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return tz6.m19210k("DeviceRoleChildLoginResult(result=", this.result, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DeviceRoleChildSelected extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final DeviceRoleChildSelected INSTANCE = new DeviceRoleChildSelected();

            private DeviceRoleChildSelected() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DeviceRoleChildSelected);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "device_role_child_selected");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return -584855881;
            }

            public String toString() {
                return "DeviceRoleChildSelected";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class DeviceRoleParentSelected extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final DeviceRoleParentSelected INSTANCE = new DeviceRoleParentSelected();

            private DeviceRoleParentSelected() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DeviceRoleParentSelected);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "device_role_parent_selected");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return -526871931;
            }

            public String toString() {
                return "DeviceRoleParentSelected";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class FirstGuardEnabled extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String guardType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FirstGuardEnabled(String str) {
                super(null);
                str.getClass();
                this.guardType = str;
            }

            private final String component1() {
                return this.guardType;
            }

            public static /* synthetic */ FirstGuardEnabled copy$default(FirstGuardEnabled firstGuardEnabled, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = firstGuardEnabled.guardType;
                }
                return firstGuardEnabled.copy(str);
            }

            public final FirstGuardEnabled copy(String str) {
                str.getClass();
                return new FirstGuardEnabled(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FirstGuardEnabled) && zy5.m23838d(this.guardType, ((FirstGuardEnabled) obj).guardType);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "first_guard_enabled"), new vq8(UserJourneyEvent.PARAM_GUARD_TYPE, this.guardType));
            }

            public int hashCode() {
                return this.guardType.hashCode();
            }

            public String toString() {
                return tz6.m19210k("FirstGuardEnabled(guardType=", this.guardType, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class HomeArrived extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeArrived(String str) {
                super(null);
                str.getClass();
                this.source = str;
            }

            private final String component1() {
                return this.source;
            }

            public static /* synthetic */ HomeArrived copy$default(HomeArrived homeArrived, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = homeArrived.source;
                }
                return homeArrived.copy(str);
            }

            public final HomeArrived copy(String str) {
                str.getClass();
                return new HomeArrived(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HomeArrived) && zy5.m23838d(this.source, ((HomeArrived) obj).source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "home_arrived"), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return tz6.m19210k("HomeArrived(source=", this.source, GqctEyzvnho.kgd);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class IapTrialUnavailableChoice extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String choice;
            private final String productId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IapTrialUnavailableChoice(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.choice = str;
                this.productId = str2;
            }

            private final String component1() {
                return this.choice;
            }

            private final String component2() {
                return this.productId;
            }

            public static /* synthetic */ IapTrialUnavailableChoice copy$default(IapTrialUnavailableChoice iapTrialUnavailableChoice, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iapTrialUnavailableChoice.choice;
                }
                if ((i & 2) != 0) {
                    str2 = iapTrialUnavailableChoice.productId;
                }
                return iapTrialUnavailableChoice.copy(str, str2);
            }

            public final IapTrialUnavailableChoice copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new IapTrialUnavailableChoice(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IapTrialUnavailableChoice)) {
                    return false;
                }
                IapTrialUnavailableChoice iapTrialUnavailableChoice = (IapTrialUnavailableChoice) obj;
                return zy5.m23838d(this.choice, iapTrialUnavailableChoice.choice) && zy5.m23838d(this.productId, iapTrialUnavailableChoice.productId);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "iap_trial_unavailable_choice"), new vq8("choice", this.choice), new vq8("product_id", this.productId));
            }

            public int hashCode() {
                return this.productId.hashCode() + (this.choice.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("IapTrialUnavailableChoice(choice=", this.choice, ", productId=", this.productId, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class IapVerificationResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String errorCode;
            private final String errorType;
            private final Boolean hasFreePhase;
            private final String productCode;
            private final String productId;
            private final boolean restoration;
            private final String result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IapVerificationResult(String str, String str2, String str3, boolean z, String str4, String str5, Boolean bool) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.result = str;
                this.productId = str2;
                this.productCode = str3;
                this.restoration = z;
                this.errorType = str4;
                this.errorCode = str5;
                this.hasFreePhase = bool;
            }

            private final String component1() {
                return this.result;
            }

            private final String component2() {
                return this.productId;
            }

            private final String component3() {
                return this.productCode;
            }

            private final boolean component4() {
                return this.restoration;
            }

            private final String component5() {
                return this.errorType;
            }

            private final String component6() {
                return this.errorCode;
            }

            private final Boolean component7() {
                return this.hasFreePhase;
            }

            public static /* synthetic */ IapVerificationResult copy$default(IapVerificationResult iapVerificationResult, String str, String str2, String str3, boolean z, String str4, String str5, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iapVerificationResult.result;
                }
                if ((i & 2) != 0) {
                    str2 = iapVerificationResult.productId;
                }
                if ((i & 4) != 0) {
                    str3 = iapVerificationResult.productCode;
                }
                if ((i & 8) != 0) {
                    z = iapVerificationResult.restoration;
                }
                if ((i & 16) != 0) {
                    str4 = iapVerificationResult.errorType;
                }
                if ((i & 32) != 0) {
                    str5 = iapVerificationResult.errorCode;
                }
                if ((i & 64) != 0) {
                    bool = iapVerificationResult.hasFreePhase;
                }
                String str6 = str5;
                Boolean bool2 = bool;
                String str7 = str4;
                String str8 = str3;
                return iapVerificationResult.copy(str, str2, str8, z, str7, str6, bool2);
            }

            public final IapVerificationResult copy(String str, String str2, String str3, boolean z, String str4, String str5, Boolean bool) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new IapVerificationResult(str, str2, str3, z, str4, str5, bool);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IapVerificationResult)) {
                    return false;
                }
                IapVerificationResult iapVerificationResult = (IapVerificationResult) obj;
                return zy5.m23838d(this.result, iapVerificationResult.result) && zy5.m23838d(this.productId, iapVerificationResult.productId) && zy5.m23838d(this.productCode, iapVerificationResult.productCode) && this.restoration == iapVerificationResult.restoration && zy5.m23838d(this.errorType, iapVerificationResult.errorType) && zy5.m23838d(this.errorCode, iapVerificationResult.errorCode) && zy5.m23838d(this.hasFreePhase, iapVerificationResult.hasFreePhase);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "iap_verification_result");
                g77Var.put(UserJourneyEvent.PARAM_RESULT, this.result);
                g77Var.put("product_id", this.productId);
                g77Var.put("product_code", this.productCode);
                g77Var.put("restoration", Boolean.valueOf(this.restoration));
                String str = this.errorType;
                if (str != null) {
                    g77Var.put(UserJourneyEvent.PARAM_ERROR, str);
                }
                String str2 = this.errorCode;
                if (str2 != null) {
                    g77Var.put("error_code", str2);
                }
                Boolean bool = this.hasFreePhase;
                if (bool != null) {
                    g77Var.put("has_free_phase", bool);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18682f = t8c.m18682f(t8c.m18683g(t8c.m18683g(this.result.hashCode() * 31, this.productId, 31), this.productCode, 31), 31, this.restoration);
                String str = this.errorType;
                int hashCode = (m18682f + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.errorCode;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.hasFreePhase;
                return hashCode2 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                String str = this.result;
                String str2 = this.productId;
                String str3 = this.productCode;
                boolean z = this.restoration;
                String str4 = this.errorType;
                String str5 = this.errorCode;
                Boolean bool = this.hasFreePhase;
                StringBuilder m15984r = pr1.m15984r("IapVerificationResult(result=", str, ", productId=", str2, jTCFTGKxOS.yQFgBKhc);
                m15984r.append(str3);
                m15984r.append(", restoration=");
                m15984r.append(z);
                m15984r.append(", errorType=");
                pr1.m15992z(m15984r, str4, ", errorCode=", str5, ", hasFreePhase=");
                m15984r.append(bool);
                m15984r.append(")");
                return m15984r.toString();
            }

            public /* synthetic */ IapVerificationResult(String str, String str2, String str3, boolean z, String str4, String str5, Boolean bool, int i, mr2 mr2Var) {
                this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class LanguageSelected extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String language;
            private final String religion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LanguageSelected(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.language = str;
                this.religion = str2;
            }

            private final String component1() {
                return this.language;
            }

            private final String component2() {
                return this.religion;
            }

            public static /* synthetic */ LanguageSelected copy$default(LanguageSelected languageSelected, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = languageSelected.language;
                }
                if ((i & 2) != 0) {
                    str2 = languageSelected.religion;
                }
                return languageSelected.copy(str, str2);
            }

            public final LanguageSelected copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new LanguageSelected(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LanguageSelected)) {
                    return false;
                }
                LanguageSelected languageSelected = (LanguageSelected) obj;
                return zy5.m23838d(this.language, languageSelected.language) && zy5.m23838d(this.religion, languageSelected.religion);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "language_selected"), new vq8("language", this.language), new vq8(UserJourneyEvent.PARAM_RELIGION, this.religion));
            }

            public int hashCode() {
                return this.religion.hashCode() + (this.language.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("LanguageSelected(language=", this.language, ", religion=", this.religion, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class LoginAttempt extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String purpose;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoginAttempt(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.source = str;
                this.purpose = str2;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.purpose;
            }

            public static /* synthetic */ LoginAttempt copy$default(LoginAttempt loginAttempt, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loginAttempt.source;
                }
                if ((i & 2) != 0) {
                    str2 = loginAttempt.purpose;
                }
                return loginAttempt.copy(str, str2);
            }

            public final LoginAttempt copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new LoginAttempt(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoginAttempt)) {
                    return false;
                }
                LoginAttempt loginAttempt = (LoginAttempt) obj;
                return zy5.m23838d(this.source, loginAttempt.source) && zy5.m23838d(this.purpose, loginAttempt.purpose);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "login_attempt"), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source), new vq8(UserJourneyEvent.PARAM_PURPOSE, this.purpose));
            }

            public int hashCode() {
                return this.purpose.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("LoginAttempt(source=", this.source, ", purpose=", this.purpose, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class OnboardingCompleted extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnboardingCompleted(String str) {
                super(null);
                str.getClass();
                this.source = str;
            }

            private final String component1() {
                return this.source;
            }

            public static /* synthetic */ OnboardingCompleted copy$default(OnboardingCompleted onboardingCompleted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = onboardingCompleted.source;
                }
                return onboardingCompleted.copy(str);
            }

            public final OnboardingCompleted copy(String str) {
                str.getClass();
                return new OnboardingCompleted(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnboardingCompleted) && zy5.m23838d(this.source, ((OnboardingCompleted) obj).source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, PrefKeys.ONBOARDING_COMPLETED), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return tz6.m19210k("OnboardingCompleted(source=", this.source, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class OnboardingSkipClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String fromStep;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnboardingSkipClicked(String str) {
                super(null);
                str.getClass();
                this.fromStep = str;
            }

            private final String component1() {
                return this.fromStep;
            }

            public static /* synthetic */ OnboardingSkipClicked copy$default(OnboardingSkipClicked onboardingSkipClicked, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = onboardingSkipClicked.fromStep;
                }
                return onboardingSkipClicked.copy(str);
            }

            public final OnboardingSkipClicked copy(String str) {
                str.getClass();
                return new OnboardingSkipClicked(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnboardingSkipClicked) && zy5.m23838d(this.fromStep, ((OnboardingSkipClicked) obj).fromStep);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "onboarding_skip_clicked"), new vq8(UserJourneyEvent.PARAM_FROM_STEP, this.fromStep));
            }

            public int hashCode() {
                return this.fromStep.hashCode();
            }

            public String toString() {
                return tz6.m19210k("OnboardingSkipClicked(fromStep=", this.fromStep, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class OnboardingStepBack extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String fromStep;
            private final String source;
            private final String toStep;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnboardingStepBack(String str, String str2, String str3) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.fromStep = str;
                this.toStep = str2;
                this.source = str3;
            }

            private final String component1() {
                return this.fromStep;
            }

            private final String component2() {
                return this.toStep;
            }

            private final String component3() {
                return this.source;
            }

            public static /* synthetic */ OnboardingStepBack copy$default(OnboardingStepBack onboardingStepBack, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = onboardingStepBack.fromStep;
                }
                if ((i & 2) != 0) {
                    str2 = onboardingStepBack.toStep;
                }
                if ((i & 4) != 0) {
                    str3 = onboardingStepBack.source;
                }
                return onboardingStepBack.copy(str, str2, str3);
            }

            public final OnboardingStepBack copy(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new OnboardingStepBack(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnboardingStepBack)) {
                    return false;
                }
                OnboardingStepBack onboardingStepBack = (OnboardingStepBack) obj;
                return zy5.m23838d(this.fromStep, onboardingStepBack.fromStep) && zy5.m23838d(this.toStep, onboardingStepBack.toStep) && zy5.m23838d(this.source, onboardingStepBack.source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "onboarding_step_back"), new vq8(UserJourneyEvent.PARAM_FROM_STEP, this.fromStep), new vq8("to_step", this.toStep), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode() + t8c.m18683g(this.fromStep.hashCode() * 31, this.toStep, 31);
            }

            public String toString() {
                String str = this.fromStep;
                String str2 = this.toStep;
                return pr1.m15980n(pr1.m15984r("OnboardingStepBack(fromStep=", str, ", toStep=", str2, ", source="), this.source, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class OnboardingStepViewed extends UserJourneyEvent {
            public static final int $stable = 0;
            private final int step;
            private final String stepName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnboardingStepViewed(int i, String str) {
                super(null);
                str.getClass();
                this.step = i;
                this.stepName = str;
            }

            private final int component1() {
                return this.step;
            }

            private final String component2() {
                return this.stepName;
            }

            public static /* synthetic */ OnboardingStepViewed copy$default(OnboardingStepViewed onboardingStepViewed, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = onboardingStepViewed.step;
                }
                if ((i2 & 2) != 0) {
                    str = onboardingStepViewed.stepName;
                }
                return onboardingStepViewed.copy(i, str);
            }

            public final OnboardingStepViewed copy(int i, String str) {
                str.getClass();
                return new OnboardingStepViewed(i, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnboardingStepViewed)) {
                    return false;
                }
                OnboardingStepViewed onboardingStepViewed = (OnboardingStepViewed) obj;
                return this.step == onboardingStepViewed.step && zy5.m23838d(this.stepName, onboardingStepViewed.stepName);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "onboarding_step_viewed"), new vq8(UserJourneyEvent.PARAM_STEP, Integer.valueOf(this.step)), new vq8(UserJourneyEvent.PARAM_STEP_NAME, this.stepName));
            }

            public int hashCode() {
                return this.stepName.hashCode() + (Integer.hashCode(this.step) * 31);
            }

            public String toString() {
                return hWpfEmw.fkrNpKfQy + this.step + ", stepName=" + this.stepName + ")";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class PurchaseResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String error;
            private final String host;
            private final String paymentMethod;
            private final String plan;
            private final String result;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PurchaseResult(String str, String str2, String str3, String str4, String str5, String str6) {
                super(null);
                sj8.m18084A(str, str2, str3, str4, str5);
                this.source = str;
                this.plan = str2;
                this.paymentMethod = str3;
                this.result = str4;
                this.host = str5;
                this.error = str6;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.plan;
            }

            private final String component3() {
                return this.paymentMethod;
            }

            private final String component4() {
                return this.result;
            }

            private final String component5() {
                return this.host;
            }

            private final String component6() {
                return this.error;
            }

            public static /* synthetic */ PurchaseResult copy$default(PurchaseResult purchaseResult, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = purchaseResult.source;
                }
                if ((i & 2) != 0) {
                    str2 = purchaseResult.plan;
                }
                if ((i & 4) != 0) {
                    str3 = purchaseResult.paymentMethod;
                }
                if ((i & 8) != 0) {
                    str4 = purchaseResult.result;
                }
                if ((i & 16) != 0) {
                    str5 = purchaseResult.host;
                }
                if ((i & 32) != 0) {
                    str6 = purchaseResult.error;
                }
                String str7 = str5;
                String str8 = str6;
                return purchaseResult.copy(str, str2, str3, str4, str7, str8);
            }

            public final PurchaseResult copy(String str, String str2, String str3, String str4, String str5, String str6) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                return new PurchaseResult(str, str2, str3, str4, str5, str6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PurchaseResult)) {
                    return false;
                }
                PurchaseResult purchaseResult = (PurchaseResult) obj;
                return zy5.m23838d(this.source, purchaseResult.source) && zy5.m23838d(this.plan, purchaseResult.plan) && zy5.m23838d(this.paymentMethod, purchaseResult.paymentMethod) && zy5.m23838d(this.result, purchaseResult.result) && zy5.m23838d(this.host, purchaseResult.host) && zy5.m23838d(this.error, purchaseResult.error);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "purchase_result");
                g77Var.put(UserJourneyEvent.PARAM_SOURCE, this.source);
                g77Var.put(UserJourneyEvent.PARAM_PLAN, this.plan);
                g77Var.put(UserJourneyEvent.PARAM_PAYMENT_METHOD, this.paymentMethod);
                g77Var.put(UserJourneyEvent.PARAM_RESULT, this.result);
                g77Var.put("host", this.host);
                String str = this.error;
                if (str != null) {
                    g77Var.put(UserJourneyEvent.PARAM_ERROR, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(t8c.m18683g(t8c.m18683g(t8c.m18683g(this.source.hashCode() * 31, this.plan, 31), this.paymentMethod, 31), this.result, 31), this.host, 31);
                String str = this.error;
                return m18683g + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.source;
                String str2 = this.plan;
                String str3 = this.paymentMethod;
                String str4 = this.result;
                String str5 = this.host;
                String str6 = this.error;
                StringBuilder m15984r = pr1.m15984r(GqctEyzvnho.gUvURX, str, ", plan=", str2, ", paymentMethod=");
                pr1.m15992z(m15984r, str3, ", result=", str4, ", host=");
                return pr1.m15981o(m15984r, str5, ", error=", str6, ")");
            }

            public /* synthetic */ PurchaseResult(String str, String str2, String str3, String str4, String str5, String str6, int i, mr2 mr2Var) {
                this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SadakaUpgradeClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SadakaUpgradeClicked(String str) {
                super(null);
                str.getClass();
                this.source = str;
            }

            private final String component1() {
                return this.source;
            }

            public static /* synthetic */ SadakaUpgradeClicked copy$default(SadakaUpgradeClicked sadakaUpgradeClicked, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sadakaUpgradeClicked.source;
                }
                return sadakaUpgradeClicked.copy(str);
            }

            public final SadakaUpgradeClicked copy(String str) {
                str.getClass();
                return new SadakaUpgradeClicked(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SadakaUpgradeClicked) && zy5.m23838d(this.source, ((SadakaUpgradeClicked) obj).source);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "sadaka_upgrade_clicked"), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source));
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return tz6.m19210k("SadakaUpgradeClicked(source=", this.source, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SafeInternetAlreadyOn extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final SafeInternetAlreadyOn INSTANCE = new SafeInternetAlreadyOn();

            private SafeInternetAlreadyOn() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SafeInternetAlreadyOn);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "safe_internet_already_on");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 406631541;
            }

            public String toString() {
                return "SafeInternetAlreadyOn";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SafeInternetDnsSuccess extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final SafeInternetDnsSuccess INSTANCE = new SafeInternetDnsSuccess();

            private SafeInternetDnsSuccess() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SafeInternetDnsSuccess);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "safe_internet_dns_success");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return -965134788;
            }

            public String toString() {
                return "SafeInternetDnsSuccess";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SafeInternetSetupClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final SafeInternetSetupClicked INSTANCE = new SafeInternetSetupClicked();

            private SafeInternetSetupClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SafeInternetSetupClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "safe_internet_setup_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return 1428326924;
            }

            public String toString() {
                return "SafeInternetSetupClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class SafeInternetSkipClicked extends UserJourneyEvent {
            public static final int $stable = 0;
            public static final SafeInternetSkipClicked INSTANCE = new SafeInternetSkipClicked();

            private SafeInternetSkipClicked() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SafeInternetSkipClicked);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                Map<String, Object> singletonMap = Collections.singletonMap(UserJourneyEvent.PARAM_JOURNEY_ACTION, "safe_internet_skip_clicked");
                singletonMap.getClass();
                return singletonMap;
            }

            public int hashCode() {
                return -1715141050;
            }

            public String toString() {
                return "SafeInternetSkipClicked";
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class WebPaywallDismissed extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebPaywallDismissed(String str) {
                super(null);
                str.getClass();
                this.reason = str;
            }

            private final String component1() {
                return this.reason;
            }

            public static /* synthetic */ WebPaywallDismissed copy$default(WebPaywallDismissed webPaywallDismissed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = webPaywallDismissed.reason;
                }
                return webPaywallDismissed.copy(str);
            }

            public final WebPaywallDismissed copy(String str) {
                str.getClass();
                return new WebPaywallDismissed(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WebPaywallDismissed) && zy5.m23838d(this.reason, ((WebPaywallDismissed) obj).reason);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "web_paywall_dismissed"), new vq8(UserJourneyEvent.PARAM_REASON, this.reason));
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return tz6.m19210k("WebPaywallDismissed(reason=", this.reason, ")");
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class WebPaywallOpened extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String source;
            private final String trigger;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebPaywallOpened(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.source = str;
                this.trigger = str2;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.trigger;
            }

            public static /* synthetic */ WebPaywallOpened copy$default(WebPaywallOpened webPaywallOpened, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = webPaywallOpened.source;
                }
                if ((i & 2) != 0) {
                    str2 = webPaywallOpened.trigger;
                }
                return webPaywallOpened.copy(str, str2);
            }

            public final WebPaywallOpened copy(String str, String str2) {
                str.getClass();
                str2.getClass();
                return new WebPaywallOpened(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebPaywallOpened)) {
                    return false;
                }
                WebPaywallOpened webPaywallOpened = (WebPaywallOpened) obj;
                return zy5.m23838d(this.source, webPaywallOpened.source) && zy5.m23838d(this.trigger, webPaywallOpened.trigger);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                return o97.m14870G(new vq8(UserJourneyEvent.PARAM_JOURNEY_ACTION, "web_paywall_opened"), new vq8(UserJourneyEvent.PARAM_SOURCE, this.source), new vq8("trigger", this.trigger));
            }

            public int hashCode() {
                return this.trigger.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return tz6.m19212m("WebPaywallOpened(source=", this.source, ", trigger=", this.trigger, ")");
            }
        }

        private UserJourneyEvent() {
            super(EVENT_NAME, null);
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        public static final class Companion {
            public /* synthetic */ Companion(mr2 mr2Var) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ UserJourneyEvent(mr2 mr2Var) {
            this();
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class IapBillingResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String productId;
            private final int responseCode;
            private final String result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IapBillingResult(String str, int i, String str2) {
                super(null);
                str.getClass();
                this.result = str;
                this.responseCode = i;
                this.productId = str2;
            }

            private final String component1() {
                return this.result;
            }

            private final int component2() {
                return this.responseCode;
            }

            private final String component3() {
                return this.productId;
            }

            public static /* synthetic */ IapBillingResult copy$default(IapBillingResult iapBillingResult, String str, int i, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = iapBillingResult.result;
                }
                if ((i2 & 2) != 0) {
                    i = iapBillingResult.responseCode;
                }
                if ((i2 & 4) != 0) {
                    str2 = iapBillingResult.productId;
                }
                return iapBillingResult.copy(str, i, str2);
            }

            public final IapBillingResult copy(String str, int i, String str2) {
                str.getClass();
                return new IapBillingResult(str, i, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IapBillingResult)) {
                    return false;
                }
                IapBillingResult iapBillingResult = (IapBillingResult) obj;
                return zy5.m23838d(this.result, iapBillingResult.result) && this.responseCode == iapBillingResult.responseCode && zy5.m23838d(this.productId, iapBillingResult.productId);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "iap_billing_result");
                g77Var.put(UserJourneyEvent.PARAM_RESULT, this.result);
                g77Var.put("response_code", Integer.valueOf(this.responseCode));
                String str = this.productId;
                if (str != null) {
                    g77Var.put("product_id", str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m15965A = pr1.m15965A(this.responseCode, this.result.hashCode() * 31, 31);
                String str = this.productId;
                return m15965A + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.result;
                int i = this.responseCode;
                return pr1.m15980n(sj8.m18105q(i, "IapBillingResult(result=", str, ", responseCode=", ", productId="), this.productId, ")");
            }

            public /* synthetic */ IapBillingResult(String str, int i, String str2, int i2, mr2 mr2Var) {
                this(str, i, (i2 & 4) != 0 ? null : str2);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class LoginResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String error;
            private final String purpose;
            private final String result;
            private final String source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoginResult(String str, String str2, String str3, String str4) {
                super(null);
                tz6.m19222w(str, str2, str3);
                this.source = str;
                this.purpose = str2;
                this.result = str3;
                this.error = str4;
            }

            private final String component1() {
                return this.source;
            }

            private final String component2() {
                return this.purpose;
            }

            private final String component3() {
                return this.result;
            }

            private final String component4() {
                return this.error;
            }

            public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loginResult.source;
                }
                if ((i & 2) != 0) {
                    str2 = loginResult.purpose;
                }
                if ((i & 4) != 0) {
                    str3 = loginResult.result;
                }
                if ((i & 8) != 0) {
                    str4 = loginResult.error;
                }
                return loginResult.copy(str, str2, str3, str4);
            }

            public final LoginResult copy(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                return new LoginResult(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoginResult)) {
                    return false;
                }
                LoginResult loginResult = (LoginResult) obj;
                return zy5.m23838d(this.source, loginResult.source) && zy5.m23838d(this.purpose, loginResult.purpose) && zy5.m23838d(this.result, loginResult.result) && zy5.m23838d(this.error, loginResult.error);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "login_result");
                g77Var.put(UserJourneyEvent.PARAM_SOURCE, this.source);
                g77Var.put(UserJourneyEvent.PARAM_PURPOSE, this.purpose);
                g77Var.put(UserJourneyEvent.PARAM_RESULT, this.result);
                String str = this.error;
                if (str != null) {
                    g77Var.put(UserJourneyEvent.PARAM_ERROR, str);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(t8c.m18683g(this.source.hashCode() * 31, this.purpose, 31), this.result, 31);
                String str = this.error;
                return m18683g + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.source;
                String str2 = this.purpose;
                return pr1.m15981o(pr1.m15984r("LoginResult(source=", str, ", purpose=", str2, ", result="), this.result, ", error=", this.error, ")");
            }

            public /* synthetic */ LoginResult(String str, String str2, String str3, String str4, int i, mr2 mr2Var) {
                this(str, str2, str3, (i & 8) != 0 ? null : str4);
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class WebPaywallReturn extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String amount;
            private final String currency;
            private final boolean hadToken;
            private final String paymentStatus;
            private final String productCode;
            private final boolean session;
            private final String shape;
            private final String source;
            private final Boolean trial;

            public /* synthetic */ WebPaywallReturn(String str, boolean z, boolean z2, String str2, String str3, String str4, Boolean bool, String str5, String str6, int i, mr2 mr2Var) {
                this(str, z, z2, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
            }

            private final String component1() {
                return this.shape;
            }

            private final boolean component2() {
                return this.session;
            }

            private final boolean component3() {
                return this.hadToken;
            }

            private final String component4() {
                return this.source;
            }

            private final String component5() {
                return this.paymentStatus;
            }

            private final String component6() {
                return this.productCode;
            }

            private final Boolean component7() {
                return this.trial;
            }

            private final String component8() {
                return this.amount;
            }

            private final String component9() {
                return this.currency;
            }

            public static /* synthetic */ WebPaywallReturn copy$default(WebPaywallReturn webPaywallReturn, String str, boolean z, boolean z2, String str2, String str3, String str4, Boolean bool, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = webPaywallReturn.shape;
                }
                if ((i & 2) != 0) {
                    z = webPaywallReturn.session;
                }
                if ((i & 4) != 0) {
                    z2 = webPaywallReturn.hadToken;
                }
                if ((i & 8) != 0) {
                    str2 = webPaywallReturn.source;
                }
                if ((i & 16) != 0) {
                    str3 = webPaywallReturn.paymentStatus;
                }
                if ((i & 32) != 0) {
                    str4 = webPaywallReturn.productCode;
                }
                if ((i & 64) != 0) {
                    bool = webPaywallReturn.trial;
                }
                if ((i & 128) != 0) {
                    str5 = webPaywallReturn.amount;
                }
                if ((i & 256) != 0) {
                    str6 = webPaywallReturn.currency;
                }
                String str7 = str5;
                String str8 = str6;
                String str9 = str4;
                Boolean bool2 = bool;
                String str10 = str3;
                boolean z3 = z2;
                return webPaywallReturn.copy(str, z, z3, str2, str10, str9, bool2, str7, str8);
            }

            public final WebPaywallReturn copy(String str, boolean z, boolean z2, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
                str.getClass();
                str2.getClass();
                return new WebPaywallReturn(str, z, z2, str2, str3, str4, bool, str5, str6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebPaywallReturn)) {
                    return false;
                }
                WebPaywallReturn webPaywallReturn = (WebPaywallReturn) obj;
                return zy5.m23838d(this.shape, webPaywallReturn.shape) && this.session == webPaywallReturn.session && this.hadToken == webPaywallReturn.hadToken && zy5.m23838d(this.source, webPaywallReturn.source) && zy5.m23838d(this.paymentStatus, webPaywallReturn.paymentStatus) && zy5.m23838d(this.productCode, webPaywallReturn.productCode) && zy5.m23838d(this.trial, webPaywallReturn.trial) && zy5.m23838d(this.amount, webPaywallReturn.amount) && zy5.m23838d(this.currency, webPaywallReturn.currency);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "web_paywall_return");
                g77Var.put("shape", this.shape);
                g77Var.put("session", Boolean.valueOf(this.session));
                g77Var.put("had_token", Boolean.valueOf(this.hadToken));
                g77Var.put(UserJourneyEvent.PARAM_SOURCE, this.source);
                String str = this.paymentStatus;
                if (str != null) {
                    g77Var.put("payment_status", str);
                }
                String str2 = this.productCode;
                if (str2 != null) {
                    g77Var.put("product_code", str2);
                }
                Boolean bool = this.trial;
                if (bool != null) {
                    g77Var.put("trial", bool);
                }
                String str3 = this.amount;
                if (str3 != null) {
                    g77Var.put("amount", str3);
                }
                String str4 = this.currency;
                if (str4 != null) {
                    g77Var.put("currency", str4);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int m18683g = t8c.m18683g(t8c.m18682f(t8c.m18682f(this.shape.hashCode() * 31, 31, this.session), 31, this.hadToken), this.source, 31);
                String str = this.paymentStatus;
                int hashCode = (m18683g + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.productCode;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.trial;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.amount;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.currency;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                String str = this.shape;
                boolean z = this.session;
                boolean z2 = this.hadToken;
                String str2 = this.source;
                String str3 = this.paymentStatus;
                String str4 = this.productCode;
                Boolean bool = this.trial;
                String str5 = this.amount;
                String str6 = this.currency;
                StringBuilder sb = new StringBuilder("WebPaywallReturn(shape=");
                sb.append(str);
                sb.append(", session=");
                sb.append(z);
                sb.append(", hadToken=");
                sb.append(z2);
                sb.append(", source=");
                sb.append(str2);
                sb.append(", paymentStatus=");
                pr1.m15992z(sb, str3, ", productCode=", str4, ", trial=");
                sb.append(bool);
                sb.append(", amount=");
                sb.append(str5);
                sb.append(", currency=");
                return pr1.m15980n(sb, str6, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WebPaywallReturn(String str, boolean z, boolean z2, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
                super(null);
                str.getClass();
                str2.getClass();
                this.shape = str;
                this.session = z;
                this.hadToken = z2;
                this.source = str2;
                this.paymentStatus = str3;
                this.productCode = str4;
                this.trial = bool;
                this.amount = str5;
                this.currency = str6;
            }
        }

        /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
        /* loaded from: classes2.dex */
        public static final class IapLaunchResult extends UserJourneyEvent {
            public static final int $stable = 0;
            private final String basePlanId;
            private final Boolean hasFreePhase;
            private final String offerId;
            private final String priceId;
            private final String productCode;
            private final String result;
            private final Boolean trial;

            public /* synthetic */ IapLaunchResult(String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, int i, mr2 mr2Var) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool2);
            }

            private final String component1() {
                return this.result;
            }

            private final String component2() {
                return this.priceId;
            }

            private final String component3() {
                return this.productCode;
            }

            private final Boolean component4() {
                return this.trial;
            }

            private final String component5() {
                return this.offerId;
            }

            private final String component6() {
                return this.basePlanId;
            }

            private final Boolean component7() {
                return this.hasFreePhase;
            }

            public static /* synthetic */ IapLaunchResult copy$default(IapLaunchResult iapLaunchResult, String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iapLaunchResult.result;
                }
                if ((i & 2) != 0) {
                    str2 = iapLaunchResult.priceId;
                }
                if ((i & 4) != 0) {
                    str3 = iapLaunchResult.productCode;
                }
                if ((i & 8) != 0) {
                    bool = iapLaunchResult.trial;
                }
                if ((i & 16) != 0) {
                    str4 = iapLaunchResult.offerId;
                }
                if ((i & 32) != 0) {
                    str5 = iapLaunchResult.basePlanId;
                }
                if ((i & 64) != 0) {
                    bool2 = iapLaunchResult.hasFreePhase;
                }
                String str6 = str5;
                Boolean bool3 = bool2;
                String str7 = str4;
                String str8 = str3;
                return iapLaunchResult.copy(str, str2, str8, bool, str7, str6, bool3);
            }

            public final IapLaunchResult copy(String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2) {
                str.getClass();
                return new IapLaunchResult(str, str2, str3, bool, str4, str5, bool2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IapLaunchResult)) {
                    return false;
                }
                IapLaunchResult iapLaunchResult = (IapLaunchResult) obj;
                return zy5.m23838d(this.result, iapLaunchResult.result) && zy5.m23838d(this.priceId, iapLaunchResult.priceId) && zy5.m23838d(this.productCode, iapLaunchResult.productCode) && zy5.m23838d(this.trial, iapLaunchResult.trial) && zy5.m23838d(this.offerId, iapLaunchResult.offerId) && zy5.m23838d(this.basePlanId, iapLaunchResult.basePlanId) && zy5.m23838d(this.hasFreePhase, iapLaunchResult.hasFreePhase);
            }

            @Override // com.kahf.dns.core.analytics.AnalyticsEvent
            public Map<String, Object> getData() {
                g77 g77Var = new g77();
                g77Var.put(UserJourneyEvent.PARAM_JOURNEY_ACTION, "iap_launch_result");
                g77Var.put(UserJourneyEvent.PARAM_RESULT, this.result);
                String str = this.priceId;
                if (str != null) {
                    g77Var.put("price_id", str);
                }
                String str2 = this.productCode;
                if (str2 != null) {
                    g77Var.put("product_code", str2);
                }
                Boolean bool = this.trial;
                if (bool != null) {
                    g77Var.put("trial", bool);
                }
                String str3 = this.offerId;
                if (str3 != null) {
                    g77Var.put("offer_id", str3);
                }
                String str4 = this.basePlanId;
                if (str4 != null) {
                    g77Var.put("base_plan_id", str4);
                }
                Boolean bool2 = this.hasFreePhase;
                if (bool2 != null) {
                    g77Var.put("has_free_phase", bool2);
                }
                return g77Var.m8404b();
            }

            public int hashCode() {
                int hashCode = this.result.hashCode() * 31;
                String str = this.priceId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.productCode;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.trial;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.offerId;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.basePlanId;
                int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Boolean bool2 = this.hasFreePhase;
                return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                String str = this.result;
                String str2 = this.priceId;
                String str3 = this.productCode;
                Boolean bool = this.trial;
                String str4 = this.offerId;
                String str5 = this.basePlanId;
                Boolean bool2 = this.hasFreePhase;
                StringBuilder m15984r = pr1.m15984r("IapLaunchResult(result=", str, ", priceId=", str2, ", productCode=");
                m15984r.append(str3);
                m15984r.append(", trial=");
                m15984r.append(bool);
                m15984r.append(", offerId=");
                pr1.m15992z(m15984r, str4, ", basePlanId=", str5, ", hasFreePhase=");
                m15984r.append(bool2);
                m15984r.append(")");
                return m15984r.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IapLaunchResult(String str, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2) {
                super(null);
                str.getClass();
                this.result = str;
                this.priceId = str2;
                this.productCode = str3;
                this.trial = bool;
                this.offerId = str4;
                this.basePlanId = str5;
                this.hasFreePhase = bool2;
            }
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class Companion {
        public /* synthetic */ Companion(mr2 mr2Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnalyticsEvent(String str, mr2 mr2Var) {
        this(str);
    }
}
