package com.kahf.dns.auto_silence.scheduler;

import android.content.Context;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Calendar;
import p000.C0917v3;
import p000.dab;
import p000.dt2;
import p000.fa7;
import p000.ggc;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.qc2;
import p000.rr7;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.za2;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class SilenceModeWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final Context f6235A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceModeWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f6235A = context;
    }

    /* renamed from: e */
    public static boolean m3572e(ggc ggcVar, ggc ggcVar2, ggc ggcVar3, String str) {
        boolean z = Calendar.getInstance().get(7) == 6;
        if (zy5.m23838d(str, "Jum'a")) {
            if (!z) {
                Log.i("AutoSilencePro", "Not activating Juma silence - not Friday");
                return false;
            }
        } else if (zy5.m23838d(str, "Duhr") && z) {
            Log.i("AutoSilencePro", "Not activating Dhuhr silence - it's Friday");
            return false;
        }
        return fa7.m7822s("Worker check " + str, (ggcVar.f14150a * 60) + ggcVar.f14151b, (ggcVar2.f14150a * 60) + ggcVar2.f14151b, (ggcVar3.f14150a * 60) + ggcVar3.f14151b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        dab dabVar;
        int i;
        if (xa2Var instanceof dab) {
            dabVar = (dab) xa2Var;
            int i2 = dabVar.f7670w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dabVar.f7670w = i2 - Integer.MIN_VALUE;
                Object obj = dabVar.f7668u;
                i = dabVar.f7670w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    rr7 rr7Var = new rr7(this, xa2Var2, (byte) 14);
                    dabVar.f7670w = 1;
                    obj = jzd.m11694F(dt2Var, rr7Var, dabVar);
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
        dabVar = new dab(this, (za2) xa2Var);
        Object obj2 = dabVar.f7668u;
        i = dabVar.f7670w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
