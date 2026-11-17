package com.kahf.dns.features.analytics;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0917v3;
import p000.C1001xd;
import p000.bha;
import p000.cm0;
import p000.cp5;
import p000.dt2;
import p000.gk2;
import p000.ik2;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.lk2;
import p000.ly6;
import p000.mv1;
import p000.qc2;
import p000.rp9;
import p000.sj8;
import p000.so6;
import p000.sx7;
import p000.tk2;
import p000.tl9;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.y54;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class DailyAnalyticsWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6256A;

    /* renamed from: B */
    public final kl6 f6257B;

    /* renamed from: C */
    public final kl6 f6258C;

    /* renamed from: D */
    public final kl6 f6259D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cm0 cm0Var = new cm0(this, (byte) 7);
        so6 so6Var = so6.f38881u;
        this.f6256A = iq5.m10513r(so6Var, cm0Var);
        this.f6257B = iq5.m10513r(so6Var, new cm0(this, (byte) 8));
        this.f6258C = iq5.m10513r(so6Var, new cm0(this, (byte) 9));
        this.f6259D = iq5.m10513r(so6Var, new cm0(this, (byte) 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        gk2 gk2Var;
        int i;
        if (xa2Var instanceof gk2) {
            gk2Var = (gk2) xa2Var;
            int i2 = gk2Var.f14327w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gk2Var.f14327w = i2 - Integer.MIN_VALUE;
                Object obj = gk2Var.f14325u;
                i = gk2Var.f14327w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    ik2 ik2Var = new ik2(this, xa2Var2, (byte) 0);
                    gk2Var.f14327w = 1;
                    obj = jzd.m11694F(dt2Var, ik2Var, gk2Var);
                    qc2 qc2Var = qc2.f34309u;
                    if (obj == qc2Var) {
                        return qc2Var;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        gk2Var = new gk2(this, (za2) xa2Var);
        Object obj2 = gk2Var.f14325u;
        i = gk2Var.f14327w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final List m3762e() {
        kl6 kl6Var = this.f6258C;
        rp9 rp9Var = (rp9) kl6Var.getValue();
        kl6 kl6Var2 = this.f6257B;
        tk2 tk2Var = new tk2(rp9Var, (C1001xd) kl6Var2.getValue());
        rp9 rp9Var2 = (rp9) kl6Var.getValue();
        C1001xd c1001xd = (C1001xd) kl6Var2.getValue();
        kl6 kl6Var3 = this.f6256A;
        return mv1.m13794F(tk2Var, new tl9(c1001xd, rp9Var2, (PreferencesHelper) kl6Var3.getValue()), new lk2((cp5) this.f6259D.getValue(), (PreferencesHelper) kl6Var3.getValue()));
    }

    /* renamed from: f */
    public final void m3763f(Exception exc) {
        try {
            if (bha.m2089y(this.f21132u)) {
                y54.m22622a().m22624c(exc);
            }
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sj8.m18114z("Failed to record exception to Crashlytics: ", e.getMessage(), ly6.f25311x, "DailyAnalytics", null);
        }
    }
}
