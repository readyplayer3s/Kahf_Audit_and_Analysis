package com.kahf.dns.features.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.features.analytics.FtDH.mmUZEXxylxd;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0625n7;
import p000.C0662o7;
import p000.C0809s6;
import p000.C0917v3;
import p000.b5b;
import p000.cm0;
import p000.dt2;
import p000.gd7;
import p000.iq5;
import p000.j14;
import p000.jh6;
import p000.jzd;
import p000.k14;
import p000.k83;
import p000.kl6;
import p000.ly6;
import p000.qc2;
import p000.qd7;
import p000.r2c;
import p000.so6;
import p000.sx7;
import p000.tda;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AccessibilityServiceMonitorWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6345A;

    /* renamed from: B */
    public final r2c f6346B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceMonitorWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f6345A = iq5.m10513r(so6.f38881u, new cm0(this, (byte) 2));
        this.f6346B = new r2c(new C0809s6((byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        C0625n7 c0625n7;
        int i;
        if (xa2Var instanceof C0625n7) {
            c0625n7 = (C0625n7) xa2Var;
            int i2 = c0625n7.f27725w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0625n7.f27725w = i2 - Integer.MIN_VALUE;
                Object obj = c0625n7.f27723u;
                i = c0625n7.f27725w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0662o7 c0662o7 = new C0662o7(this, xa2Var2, (byte) 0);
                    c0625n7.f27725w = 1;
                    obj = jzd.m11694F(dt2Var, c0662o7, c0625n7);
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
        c0625n7 = new C0625n7(this, (za2) xa2Var);
        Object obj2 = c0625n7.f27723u;
        i = c0625n7.f27725w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* renamed from: e */
    public final boolean m3813e() {
        Object tdaVar;
        try {
            ArrayList m11757a = k14.m11757a();
            boolean z = false;
            if (!m11757a.isEmpty()) {
                Iterator it = m11757a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (m3815g().getBooleanFromPreferences(((j14) it.next()).f19420f, false)) {
                        z = true;
                        break;
                    }
                }
            }
            tdaVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        Object obj = Boolean.TRUE;
        if (tdaVar instanceof tda) {
            tdaVar = obj;
        }
        return ((Boolean) tdaVar).booleanValue();
    }

    /* renamed from: g */
    public final PreferencesHelper m3815g() {
        return (PreferencesHelper) this.f6345A.getValue();
    }

    /* renamed from: f */
    public final void m3814f() {
        if (m3815g().getAuthToken().length() != 0) {
            Context context = this.f21132u;
            if (gd7.m8535L(qd7.m16518t(context).m16221a(), PreferencesHelper.getStringFromPreferences$default(m3815g(), PrefKeys.LAST_REPORTED_PERMISSION_FINGERPRINT, null, 2, null))) {
                sx7 sx7Var = sx7.f39332a;
                sx7.m18369g(ly6.f25309v, mmUZEXxylxd.CksvRMIBTSpvPm, null, "[PERMISSION] watchdog detected grant change → reporting");
                b5b.m1671z(context);
            }
        }
    }
}
