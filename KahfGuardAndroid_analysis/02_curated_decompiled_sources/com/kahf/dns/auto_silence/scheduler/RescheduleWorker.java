package com.kahf.dns.auto_silence.scheduler;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.firebase.remoteconfig.internal.muA.zkLKzAr;
import p000.C1020xw;
import p000.ft6;
import p000.gt6;
import p000.ht6;
import p000.it6;
import p000.xd9;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class RescheduleWorker extends Worker {

    /* renamed from: y */
    public final Context f6234y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f6234y = context;
    }

    @Override // androidx.work.Worker
    /* renamed from: d */
    public final it6 mo1176d() {
        Log.i("AutoSilencePro", "RescheduleWorker: Starting prayer reschedule");
        int i = this.f21133v.f1868d;
        Log.i("AutoSilencePro", "RescheduleWorker: Attempt " + i);
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (Exception e) {
                Log.e("AutoSilencePro", "RescheduleWorker: Failed to reschedule prayers", e);
                return i < 3 ? new gt6() : new ft6();
            }
        }
        int i2 = xd9.f48201x;
        C1020xw.m22384d(this.f6234y);
        Log.i("AutoSilencePro", zkLKzAr.HblAxqZwNBUDi);
        return new ht6();
    }
}
