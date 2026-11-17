package com.kahf.dns.features.analytics;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0917v3;
import p000.C1001xd;
import p000.bha;
import p000.bz8;
import p000.cz8;
import p000.d48;
import p000.dt2;
import p000.fb3;
import p000.ik2;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.ly6;
import p000.mv1;
import p000.qa3;
import p000.qc2;
import p000.sj8;
import p000.so6;
import p000.sx7;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.y54;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class PeriodicAnalyticsWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6260A;

    /* renamed from: B */
    public final kl6 f6261B;

    /* renamed from: C */
    public final kl6 f6262C;

    /* renamed from: D */
    public final kl6 f6263D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cz8 cz8Var = new cz8(this, (byte) 0);
        so6 so6Var = so6.f38881u;
        this.f6260A = iq5.m10513r(so6Var, cz8Var);
        this.f6261B = iq5.m10513r(so6Var, new cz8(this, (byte) 1));
        this.f6262C = iq5.m10513r(so6Var, new cz8(this, (byte) 2));
        this.f6263D = iq5.m10513r(so6Var, new cz8(this, (byte) 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        bz8 bz8Var;
        int i;
        if (xa2Var instanceof bz8) {
            bz8Var = (bz8) xa2Var;
            int i2 = bz8Var.f4182w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bz8Var.f4182w = i2 - Integer.MIN_VALUE;
                Object obj = bz8Var.f4180u;
                i = bz8Var.f4182w;
                xa2 xa2Var2 = null;
                byte b = 1;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    ik2 ik2Var = new ik2(this, xa2Var2, b);
                    bz8Var.f4182w = 1;
                    obj = jzd.m11694F(dt2Var, ik2Var, bz8Var);
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
        bz8Var = new bz8(this, (za2) xa2Var);
        Object obj2 = bz8Var.f4180u;
        i = bz8Var.f4182w;
        xa2 xa2Var22 = null;
        byte b2 = 1;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final List m3764e() {
        return mv1.m13793E(new qa3((d48) this.f6260A.getValue(), (fb3) this.f6261B.getValue(), (PreferencesHelper) this.f6262C.getValue(), (C1001xd) this.f6263D.getValue()));
    }

    /* renamed from: f */
    public final void m3765f(Exception exc) {
        try {
            if (bha.m2089y(this.f21132u)) {
                y54.m22622a().m22624c(exc);
            }
        } catch (Exception e) {
            sx7 sx7Var = sx7.f39332a;
            sj8.m18114z("Failed to record exception to Crashlytics: ", e.getMessage(), ly6.f25311x, "PeriodicAnalytics", null);
        }
    }
}
