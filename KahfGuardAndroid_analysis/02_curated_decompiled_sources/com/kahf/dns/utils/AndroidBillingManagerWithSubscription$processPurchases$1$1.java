package com.kahf.dns.utils;

import java.util.List;
import p000.C0917v3;
import p000.aad;
import p000.gpc;
import p000.jm4;
import p000.m9d;
import p000.pc2;
import p000.pr9;
import p000.qc2;
import p000.rp2;
import p000.rr9;
import p000.s1c;
import p000.sx7;
import p000.t9d;
import p000.txc;
import p000.tz6;
import p000.v11;
import p000.xa2;
import p000.xv5;
import p000.z9d;
import p000.zv5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
@rp2(m17482c = "com.kahf.dns.utils.AndroidBillingManagerWithSubscription$processPurchases$1$1", m17483f = "AndroidBillingManagerWithSubscription.kt", m17484l = {1514}, m17485m = "invokeSuspend", m17486v = 2)
/* loaded from: classes2.dex */
final class AndroidBillingManagerWithSubscription$processPurchases$1$1 extends s1c implements jm4 {
    final /* synthetic */ long $epoch;
    final /* synthetic */ rr9 $kind;
    final /* synthetic */ String $productId;
    final /* synthetic */ pr9 $purchase;
    final /* synthetic */ String $token;
    final /* synthetic */ aad $trigger;
    Object L$0;
    int label;

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m9d.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBillingManagerWithSubscription$processPurchases$1$1(rr9 rr9Var, String str, pr9 pr9Var, aad aadVar, String str2, long j, xa2 xa2Var) {
        super(2, xa2Var);
        this.$kind = rr9Var;
        this.$token = str;
        this.$purchase = pr9Var;
        this.$trigger = aadVar;
        this.$productId = str2;
        this.$epoch = j;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new AndroidBillingManagerWithSubscription$processPurchases$1$1(this.$kind, this.$token, this.$purchase, this.$trigger, this.$productId, this.$epoch, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(pc2 pc2Var, xa2 xa2Var) {
        return ((AndroidBillingManagerWithSubscription$processPurchases$1$1) create(pc2Var, xa2Var)).invokeSuspend(txc.f41359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (p000.dj3.m6345c(r6.m22368c(r0), p000.z9d.f52014e) >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r7 = r8;
     */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.label;
        if (i == 0) {
            v11.m20244z(obj);
            List list = z9d.f52010a;
            AndroidBillingManagerWithSubscription androidBillingManagerWithSubscription = AndroidBillingManagerWithSubscription.INSTANCE;
            t9d access$loadVerificationRecord = AndroidBillingManagerWithSubscription.access$loadVerificationRecord(androidBillingManagerWithSubscription, this.$kind, this.$token);
            String access$currentAccountId = AndroidBillingManagerWithSubscription.access$currentAccountId(androidBillingManagerWithSubscription);
            boolean optBoolean = this.$purchase.f33151c.optBoolean("acknowledged", true);
            aad aadVar = this.$trigger;
            xv5 mo2814g = zv5.f53149a.mo2814g();
            aadVar.getClass();
            mo2814g.getClass();
            m9d m9dVar = m9d.f25913u;
            if (access$loadVerificationRecord != null && aadVar != aad.f555u && (str = access$loadVerificationRecord.f39981f) != null && str.equals(access$currentAccountId)) {
                xv5 xv5Var = access$loadVerificationRecord.f39980e;
                m9d m9dVar2 = m9d.f25915w;
                if (xv5Var != null) {
                    if (!optBoolean) {
                        m9dVar = m9d.f25914v;
                    }
                } else if (aadVar == aad.f557w) {
                }
            }
            int ordinal = m9dVar.ordinal();
            if (ordinal == 0) {
                pr9 pr9Var = this.$purchase;
                rr9 rr9Var = this.$kind;
                aad aadVar2 = this.$trigger;
                long j = this.$epoch;
                this.L$0 = null;
                this.label = 1;
                Object access$verifyAndFinalize = AndroidBillingManagerWithSubscription.access$verifyAndFinalize(androidBillingManagerWithSubscription, pr9Var, rr9Var, aadVar2, j, this);
                qc2 qc2Var = qc2.f34309u;
                if (access$verifyAndFinalize == qc2Var) {
                    return qc2Var;
                }
            } else if (ordinal == 1) {
                sx7.m18367e(sx7.f39332a, tz6.m19210k("✅ ", this.$productId, " already verified; finishing the Google acknowledgement"), "androidBilling", 2);
                AndroidBillingManagerWithSubscription.access$finalizeWithGoogle(androidBillingManagerWithSubscription, this.$purchase, this.$kind);
            } else {
                if (ordinal != 2) {
                    gpc.m8801a();
                    return null;
                }
                sx7.m18364b(sx7.f39332a, "⏭️ Verification not due for " + this.$productId, "androidBilling", 2);
            }
        } else {
            if (i != 1) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v11.m20244z(obj);
        }
        return txc.f41359a;
    }
}
