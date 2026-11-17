package com.kahf.dns.features.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.inappmessaging.pGL.KMBQqWH;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0898ul;
import p000.C0917v3;
import p000.C1020xw;
import p000.bha;
import p000.bp5;
import p000.cz8;
import p000.d84;
import p000.dt2;
import p000.fp5;
import p000.h88;
import p000.iq5;
import p000.iv6;
import p000.jh6;
import p000.jhd;
import p000.jp5;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.kp2;
import p000.lhd;
import p000.ly6;
import p000.mhd;
import p000.nhd;
import p000.o68;
import p000.ohc;
import p000.ohd;
import p000.pr1;
import p000.qc2;
import p000.rr7;
import p000.so6;
import p000.sx7;
import p000.txc;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.ysb;
import p000.za2;
import p000.zv5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class WeeklyImpactWorker extends CoroutineWorker implements jh6 {

    /* renamed from: D */
    public static final C1020xw f6364D = new C1020xw(2);

    /* renamed from: A */
    public final kl6 f6365A;

    /* renamed from: B */
    public final kl6 f6366B;

    /* renamed from: C */
    public final kl6 f6367C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeeklyImpactWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cz8 cz8Var = new cz8(this, (byte) 23);
        so6 so6Var = so6.f38881u;
        this.f6365A = iq5.m10513r(so6Var, cz8Var);
        this.f6366B = iq5.m10513r(so6Var, new cz8(this, (byte) 24));
        this.f6367C = iq5.m10513r(so6Var, new cz8(this, (byte) 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        nhd nhdVar;
        int i;
        if (xa2Var instanceof nhd) {
            nhdVar = (nhd) xa2Var;
            int i2 = nhdVar.f28306w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nhdVar.f28306w = i2 - Integer.MIN_VALUE;
                Object obj = nhdVar.f28304u;
                i = nhdVar.f28306w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    rr7 rr7Var = new rr7(this, xa2Var2, (byte) 29);
                    nhdVar.f28306w = 1;
                    obj = jzd.m11694F(dt2Var, rr7Var, nhdVar);
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
        nhdVar = new nhd(this, (za2) xa2Var);
        Object obj2 = nhdVar.f28304u;
        i = nhdVar.f28306w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3837e(za2 za2Var) {
        ohd ohdVar;
        int i;
        jhd jhdVar;
        if (za2Var instanceof ohd) {
            ohdVar = (ohd) za2Var;
            int i2 = ohdVar.f30557w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ohdVar.f30557w = i2 - Integer.MIN_VALUE;
                Object obj = ohdVar.f30555u;
                i = ohdVar.f30557w;
                ly6 ly6Var = ly6.f25309v;
                txc txcVar = txc.f41359a;
                if (i != 0) {
                    v11.m20244z(obj);
                    if (new C0898ul().f42622v.getBoolean("disable_weekly_impact", false)) {
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, KMBQqWH.uWGrne);
                        return txcVar;
                    }
                    if (((PreferencesHelper) this.f6366B.getValue()).isParentDevice()) {
                        sx7 sx7Var2 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, "Parent device — skipping weekly impact digest");
                        return txcVar;
                    }
                    d84 d84Var = ohc.f30553b;
                    iv6 m16956a = ysb.m22977Q(zv5.f53149a.mo2814g(), bha.m2079m()).m16956a();
                    if (m16956a.m10602b() != kp2.f22821y) {
                        sx7 sx7Var3 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, "Today is " + m16956a.m10602b() + ", not Friday — skipping show");
                        return txcVar;
                    }
                    bp5 bp5Var = (bp5) this.f6367C.getValue();
                    ohdVar.f30557w = 1;
                    obj = bp5Var.m2258a(ohdVar);
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
                jhdVar = (jhd) obj;
                if (jhdVar.m11345d() != fp5.f12461u) {
                    sx7 sx7Var4 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, "No snapshot history yet — skipping (seeding week)");
                    return txcVar;
                }
                if (jhdVar.m11343b() <= 0) {
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, "Zero blocks this week — skipping show");
                    return txcVar;
                }
                Integer m11342a = jhdVar.m11345d() == fp5.f12463w ? jhdVar.m11342a() : null;
                List list = mhd.f26405a;
                lhd m13436a = mhd.m13436a(this.f21132u, jp5.m11490e(jhdVar.m11343b()), m11342a);
                ((o68) this.f6365A.getValue()).m14842h(new h88(jhdVar.m11343b(), m11342a, m13436a.m12763b(), m13436a.m12762a(), jhdVar.m11344c()));
                sx7 sx7Var6 = sx7.f39332a;
                sx7.m18369g(ly6Var, "WeeklyImpactWorker", null, pr1.m15973g(jhdVar.m11343b(), "Showed weekly impact digest (blocks=", ")"));
                return txcVar;
            }
        }
        ohdVar = new ohd(this, za2Var);
        Object obj2 = ohdVar.f30555u;
        i = ohdVar.f30557w;
        ly6 ly6Var2 = ly6.f25309v;
        txc txcVar2 = txc.f41359a;
        if (i != 0) {
        }
        jhdVar = (jhd) obj2;
        if (jhdVar.m11345d() != fp5.f12461u) {
        }
    }
}
