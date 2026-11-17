package com.kahf.dns.features.permission_flows;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import p000.C0917v3;
import p000.cz8;
import p000.dt2;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.qc2;
import p000.rz8;
import p000.so6;
import p000.v11;
import p000.vu2;
import p000.xa2;
import p000.z27;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class PermissionStatusSyncWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6368A;

    /* renamed from: B */
    public final kl6 f6369B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionStatusSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cz8 cz8Var = new cz8(this, (byte) 4);
        so6 so6Var = so6.f38881u;
        this.f6368A = iq5.m10513r(so6Var, cz8Var);
        this.f6369B = iq5.m10513r(so6Var, new cz8(this, (byte) 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        rz8 rz8Var;
        int i;
        if (xa2Var instanceof rz8) {
            rz8Var = (rz8) xa2Var;
            int i2 = rz8Var.f37566w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rz8Var.f37566w = i2 - Integer.MIN_VALUE;
                Object obj = rz8Var.f37564u;
                i = rz8Var.f37566w;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    z27 z27Var = new z27(this, null);
                    rz8Var.f37566w = 1;
                    obj = jzd.m11694F(dt2Var, z27Var, rz8Var);
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
        rz8Var = new rz8(this, (za2) xa2Var);
        Object obj2 = rz8Var.f37564u;
        i = rz8Var.f37566w;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
