package com.kahf.dns.features.user;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p000.C0602ml;
import p000.C0639nl;
import p000.C0917v3;
import p000.b53;
import p000.dt2;
import p000.ged;
import p000.iq5;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.l74;
import p000.ly6;
import p000.mv1;
import p000.qc2;
import p000.qv5;
import p000.sj8;
import p000.so6;
import p000.sv5;
import p000.sx7;
import p000.tda;
import p000.tv5;
import p000.txc;
import p000.uda;
import p000.uv5;
import p000.v11;
import p000.v43;
import p000.vu2;
import p000.vv5;
import p000.xa2;
import p000.y33;
import p000.y82;
import p000.za2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class InstalledAppsSyncWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6383A;

    /* renamed from: B */
    public final kl6 f6384B;

    /* renamed from: C */
    public final kl6 f6385C;

    /* renamed from: D */
    public final kl6 f6386D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        y82 y82Var = new y82(this, (byte) 28);
        so6 so6Var = so6.f38881u;
        this.f6383A = iq5.m10513r(so6Var, y82Var);
        this.f6384B = iq5.m10513r(so6Var, new y82(this, (byte) 29));
        this.f6385C = iq5.m10513r(so6Var, new uv5(this, (byte) 0));
        this.f6386D = iq5.m10513r(so6Var, new uv5(this, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        tv5 tv5Var;
        int i;
        if (xa2Var instanceof tv5) {
            tv5Var = (tv5) xa2Var;
            int i2 = tv5Var.f41214w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tv5Var.f41214w = i2 - Integer.MIN_VALUE;
                Object obj = tv5Var.f41212u;
                i = tv5Var.f41214w;
                xa2 xa2Var2 = null;
                byte b = 1;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    l74 l74Var = new l74(this, xa2Var2, b);
                    tv5Var.f41214w = 1;
                    obj = jzd.m11694F(dt2Var, l74Var, tv5Var);
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
        tv5Var = new tv5(this, (za2) xa2Var);
        Object obj2 = tv5Var.f41212u;
        i = tv5Var.f41214w;
        xa2 xa2Var22 = null;
        byte b2 = 1;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0124 A[Catch: Exception -> 0x0043, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, Exception -> 0x0043, blocks: (B:13:0x003a, B:14:0x0120, B:16:0x0124, B:19:0x014d, B:21:0x0155, B:22:0x0159, B:27:0x0054, B:28:0x00b6, B:30:0x0091, B:32:0x0097, B:36:0x00be, B:38:0x00d9, B:40:0x00f9, B:43:0x00ba, B:45:0x005a, B:46:0x0082, B:48:0x0061), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014d A[Catch: Exception -> 0x0043, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, Exception -> 0x0043, blocks: (B:13:0x003a, B:14:0x0120, B:16:0x0124, B:19:0x014d, B:21:0x0155, B:22:0x0159, B:27:0x0054, B:28:0x00b6, B:30:0x0091, B:32:0x0097, B:36:0x00be, B:38:0x00d9, B:40:0x00f9, B:43:0x00ba, B:45:0x005a, B:46:0x0082, B:48:0x0061), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[Catch: Exception -> 0x0043, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, Exception -> 0x0043, blocks: (B:13:0x003a, B:14:0x0120, B:16:0x0124, B:19:0x014d, B:21:0x0155, B:22:0x0159, B:27:0x0054, B:28:0x00b6, B:30:0x0091, B:32:0x0097, B:36:0x00be, B:38:0x00d9, B:40:0x00f9, B:43:0x00ba, B:45:0x005a, B:46:0x0082, B:48:0x0061), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: Exception -> 0x0043, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, Exception -> 0x0043, blocks: (B:13:0x003a, B:14:0x0120, B:16:0x0124, B:19:0x014d, B:21:0x0155, B:22:0x0159, B:27:0x0054, B:28:0x00b6, B:30:0x0091, B:32:0x0097, B:36:0x00be, B:38:0x00d9, B:40:0x00f9, B:43:0x00ba, B:45:0x005a, B:46:0x0082, B:48:0x0061), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[Catch: Exception -> 0x0043, CancellationException -> 0x016e, TryCatch #2 {CancellationException -> 0x016e, Exception -> 0x0043, blocks: (B:13:0x003a, B:14:0x0120, B:16:0x0124, B:19:0x014d, B:21:0x0155, B:22:0x0159, B:27:0x0054, B:28:0x00b6, B:30:0x0091, B:32:0x0097, B:36:0x00be, B:38:0x00d9, B:40:0x00f9, B:43:0x00ba, B:45:0x005a, B:46:0x0082, B:48:0x0061), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b3 -> B:28:0x00b6). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3841e(String str, za2 za2Var) {
        vv5 vv5Var;
        int i;
        txc txcVar;
        Collection arrayList;
        String str2;
        Iterator it;
        List list;
        Object m1658e;
        String str3;
        try {
            if (za2Var instanceof vv5) {
                vv5Var = (vv5) za2Var;
                int i2 = vv5Var.f45141A;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vv5Var.f45141A = i2 - Integer.MIN_VALUE;
                    Object obj = vv5Var.f45146y;
                    i = vv5Var.f45141A;
                    kl6 kl6Var = this.f6384B;
                    kl6 kl6Var2 = this.f6385C;
                    txcVar = txc.f41359a;
                    Object[] objArr = 0;
                    qc2 qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        sv5 sv5Var = (sv5) kl6Var2.getValue();
                        vv5Var.f45142u = str;
                        vv5Var.f45141A = 1;
                        C0639nl c0639nl = (C0639nl) sv5Var;
                        c0639nl.getClass();
                        vu2 vu2Var = k83.f21845a;
                        obj = jzd.m11694F(dt2.f8706v, new C0602ml(c0639nl, objArr == true ? 1 : 0, (byte) 0), vv5Var);
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str3 = (String) vv5Var.f45144w;
                                list = vv5Var.f45143v;
                                v11.m20244z(obj);
                                m1658e = ((uda) obj).f42208u;
                                if (!(m1658e instanceof tda)) {
                                    sx7 sx7Var = sx7.f39332a;
                                    Throwable m19582a = uda.m19582a(m1658e);
                                    sx7.m18370h(2, "Failed to sync VPN service apps: " + (m19582a != null ? m19582a.getMessage() : null), "KG_SYNC");
                                    return txcVar;
                                }
                                ((PreferencesHelper) kl6Var.getValue()).saveToPreferences("pref_last_synced_vpn_service_apps", str3);
                                sx7.m18364b(sx7.f39332a, "VPN service apps synced: " + list.size() + " app(s)", "KG_SYNC", 2);
                                return txcVar;
                            }
                            it = vv5Var.f45145x;
                            arrayList = (Collection) vv5Var.f45144w;
                            str2 = vv5Var.f45142u;
                            v11.m20244z(obj);
                            qv5 qv5Var = (qv5) obj;
                            if (qv5Var != null) {
                                arrayList.add(qv5Var);
                            }
                            if (!it.hasNext()) {
                                String str4 = (String) it.next();
                                sv5 sv5Var2 = (sv5) kl6Var2.getValue();
                                vv5Var.f45142u = str2;
                                vv5Var.f45143v = null;
                                vv5Var.f45144w = arrayList;
                                vv5Var.f45145x = it;
                                vv5Var.f45141A = 2;
                                obj = ((C0639nl) sv5Var2).m14253a(str4, vv5Var);
                                if (obj == qc2Var) {
                                }
                                qv5 qv5Var2 = (qv5) obj;
                                if (qv5Var2 != null) {
                                }
                                if (!it.hasNext()) {
                                    list = (List) arrayList;
                                    String m8615a = ged.m8615a(list);
                                    String m8616b = ged.m8616b(str2, m8615a);
                                    if (m8616b.equals(PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) kl6Var.getValue(), "pref_last_synced_vpn_service_apps", null, 2, null))) {
                                        sx7.m18364b(sx7.f39332a, "VPN service apps unchanged (" + list.size() + "), skipping sync", "KG_SYNC", 2);
                                        return txcVar;
                                    }
                                    v43 v43Var = (v43) this.f6386D.getValue();
                                    List m13793E = mv1.m13793E(new y33("vpn_service_apps", m8615a));
                                    vv5Var.f45142u = null;
                                    vv5Var.f45143v = list;
                                    vv5Var.f45144w = m8616b;
                                    vv5Var.f45145x = null;
                                    vv5Var.f45141A = 3;
                                    m1658e = ((b53) v43Var).m1658e(vv5Var, str2, m13793E);
                                    if (m1658e != qc2Var) {
                                        str3 = m8616b;
                                        if (!(m1658e instanceof tda)) {
                                        }
                                    }
                                }
                            }
                            return qc2Var;
                        }
                        str = vv5Var.f45142u;
                        v11.m20244z(obj);
                    }
                    arrayList = new ArrayList();
                    str2 = str;
                    it = ((Set) obj).iterator();
                    if (!it.hasNext()) {
                    }
                    return qc2Var;
                }
            }
            if (i != 0) {
            }
            arrayList = new ArrayList();
            str2 = str;
            it = ((Set) obj).iterator();
            if (!it.hasNext()) {
            }
            return qc2Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25311x, "KG_SYNC", e2, sj8.m18102n("Exception syncing VPN service apps: ", e2.getMessage()));
            return txcVar;
        }
        vv5Var = new vv5(this, za2Var);
        Object obj2 = vv5Var.f45146y;
        i = vv5Var.f45141A;
        kl6 kl6Var3 = this.f6384B;
        kl6 kl6Var22 = this.f6385C;
        txcVar = txc.f41359a;
        Object[] objArr2 = 0;
        qc2 qc2Var2 = qc2.f34309u;
    }
}
