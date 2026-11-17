package com.kahf.dns.features.permission_flows.dns_update;

import com.kahf.dns.core.analytics.AnalyticsEvent;
import com.kahf.dns.features.permission_flows.dns_update.UserAction;
import p000.C0917v3;
import p000.C1001xd;
import p000.d68;
import p000.gp9;
import p000.gpc;
import p000.iv7;
import p000.jm4;
import p000.pc2;
import p000.qa1;
import p000.qc2;
import p000.s1c;
import p000.sx7;
import p000.txc;
import p000.v11;
import p000.xa2;
import p000.yj2;
import p000.z01;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: com.kahf.dns.features.permission_flows.dns_update.c */
/* loaded from: classes2.dex */
public final class C0218c extends s1c implements jm4 {

    /* renamed from: u */
    public z01 f6371u;

    /* renamed from: v */
    public boolean f6372v;

    /* renamed from: w */
    public final /* synthetic */ qa1 f6373w;

    /* renamed from: x */
    public final /* synthetic */ yj2 f6374x;

    /* renamed from: y */
    public final /* synthetic */ iv7 f6375y;

    /* renamed from: z */
    public final /* synthetic */ iv7 f6376z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218c(qa1 qa1Var, yj2 yj2Var, iv7 iv7Var, iv7 iv7Var2, xa2 xa2Var) {
        super(2, xa2Var);
        this.f6373w = qa1Var;
        this.f6374x = yj2Var;
        this.f6375y = iv7Var;
        this.f6376z = iv7Var2;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new C0218c(this.f6373w, this.f6374x, this.f6375y, this.f6376z, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        return ((C0218c) create((pc2) obj, (xa2) obj2)).invokeSuspend(txc.f41359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z01 it;
        qc2 qc2Var;
        boolean z = this.f6372v;
        if (!z) {
            v11.m20244z(obj);
            it = this.f6373w.iterator();
            this.f6371u = it;
            this.f6372v = true;
            obj = it.m23206a(this);
            qc2Var = qc2.f34309u;
            if (obj == qc2Var) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (!z) {
                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.f6371u;
            v11.m20244z(obj);
            if (((Boolean) obj).booleanValue()) {
                UserAction userAction = (UserAction) it.m23207c();
                if (!(userAction instanceof UserAction.GotoSettingsClicked)) {
                    if (zy5.m23838d(userAction, UserAction.CopyClicked.INSTANCE)) {
                        throw new d68(0);
                    }
                    gpc.m8801a();
                    return null;
                }
                sx7.m18364b(sx7.f39332a, "Open Settings button clicked.", null, 6);
                this.f6375y.setValue(Boolean.TRUE);
                gp9 gp9Var = (gp9) this.f6376z.getValue();
                yj2 yj2Var = this.f6374x;
                if (gp9Var != null) {
                    String str = gp9Var.f14611a;
                    String str2 = gp9Var.f14614d;
                    AnalyticsEvent.OpenSettingsEvent.OpenSettings openSettings = new AnalyticsEvent.OpenSettingsEvent.OpenSettings(str2, str, "unset_dns_screen");
                    C1001xd c1001xd = yj2Var.f50596x;
                    c1001xd.m22025b(openSettings);
                    c1001xd.m22025b(new AnalyticsEvent.AppBehaviorEvent.DnsGotoSettingsClicked(str2, str, "unset"));
                }
                yj2Var.m22883i();
                this.f6371u = it;
                this.f6372v = true;
                obj = it.m23206a(this);
                qc2Var = qc2.f34309u;
                if (obj == qc2Var) {
                    return qc2Var;
                }
                if (((Boolean) obj).booleanValue()) {
                    return txc.f41359a;
                }
            }
        }
    }
}
