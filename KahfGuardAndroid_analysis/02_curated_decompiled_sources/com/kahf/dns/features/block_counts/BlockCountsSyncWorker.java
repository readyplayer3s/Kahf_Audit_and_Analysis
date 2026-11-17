package com.kahf.dns.features.block_counts;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import p000.dt2;
import p000.gt6;
import p000.ht6;
import p000.iq5;
import p000.it6;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.pr1;
import p000.so6;
import p000.sx7;
import p000.vu2;
import p000.x00;
import p000.xa2;
import p000.y82;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class BlockCountsSyncWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6272A;

    /* renamed from: B */
    public final kl6 f6273B;

    /* renamed from: C */
    public final kl6 f6274C;

    /* renamed from: D */
    public final kl6 f6275D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockCountsSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        y82 y82Var = new y82(this, (byte) 23);
        so6 so6Var = so6.f38881u;
        this.f6272A = iq5.m10513r(so6Var, y82Var);
        this.f6273B = iq5.m10513r(so6Var, new y82(this, (byte) 24));
        this.f6274C = iq5.m10513r(so6Var, new y82(this, (byte) 25));
        this.f6275D = iq5.m10513r(so6Var, new y82(this, (byte) 26));
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    public final Object mo1175d(xa2 xa2Var) {
        vu2 vu2Var = k83.f21845a;
        return jzd.m11694F(dt2.f8706v, new x00(this, null, (byte) 4), xa2Var);
    }

    /* renamed from: e */
    public final PreferencesHelper m3768e() {
        return (PreferencesHelper) this.f6272A.getValue();
    }

    /* renamed from: f */
    public final it6 m3769f() {
        int i = this.f21133v.f1868d;
        if (i < 3) {
            sx7.m18364b(sx7.f39332a, pr1.m15973g(i + 1, "Retrying block counts sync (attempt ", "/3)"), "KG_SYNC", 2);
            return new gt6();
        }
        sx7 sx7Var = sx7.f39332a;
        sx7.m18366d(2, "Max retry attempts reached for block counts sync, giving up", "KG_SYNC", null);
        return new ht6();
    }
}
