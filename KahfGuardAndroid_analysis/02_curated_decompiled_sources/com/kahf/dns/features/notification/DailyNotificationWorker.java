package com.kahf.dns.features.notification;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import p000.AbstractC0327f4;
import p000.C0816sd;
import p000.C0917v3;
import p000.C0993x5;
import p000.ag7;
import p000.cm0;
import p000.d80;
import p000.d84;
import p000.do2;
import p000.dt2;
import p000.iq5;
import p000.iv6;
import p000.jh6;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.mk2;
import p000.nk2;
import p000.o68;
import p000.ohc;
import p000.ok2;
import p000.pk2;
import p000.qc2;
import p000.qk2;
import p000.qr5;
import p000.r2c;
import p000.rk2;
import p000.so6;
import p000.stb;
import p000.txc;
import p000.u6d;
import p000.v11;
import p000.vq8;
import p000.vu2;
import p000.w78;
import p000.xa2;
import p000.xv5;
import p000.za2;
import p000.ztb;
import p000.zv5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class DailyNotificationWorker extends CoroutineWorker implements jh6 {

    /* renamed from: A */
    public final kl6 f6356A;

    /* renamed from: B */
    public final kl6 f6357B;

    /* renamed from: C */
    public final r2c f6358C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cm0 cm0Var = new cm0(this, (byte) 11);
        so6 so6Var = so6.f38881u;
        this.f6356A = iq5.m10513r(so6Var, cm0Var);
        this.f6357B = iq5.m10513r(so6Var, new cm0(this, (byte) 12));
        this.f6358C = new r2c(new C0993x5(this, (byte) 26));
    }

    /* renamed from: h */
    public static int m3821h(String str) {
        int i = 0;
        for (String str2 : stb.m18274n1(stb.m18242B1(str).toString(), new String[]{" "}, 0, 6)) {
            if (ztb.m23791x0(str2, "h", false)) {
                Integer m23782G0 = ztb.m23782G0(10, stb.m18269i1(str2, "h"));
                i += (m23782G0 != null ? m23782G0.intValue() : 0) * 60;
            } else if (ztb.m23791x0(str2, "m", false)) {
                Integer m23782G02 = ztb.m23782G0(10, stb.m18269i1(str2, "m"));
                i += m23782G02 != null ? m23782G02.intValue() : 0;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1175d(xa2 xa2Var) {
        nk2 nk2Var;
        int i;
        if (xa2Var instanceof nk2) {
            nk2Var = (nk2) xa2Var;
            int i2 = nk2Var.f28409w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nk2Var.f28409w = i2 - Integer.MIN_VALUE;
                Object obj = nk2Var.f28407u;
                i = nk2Var.f28409w;
                xa2 xa2Var2 = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    vu2 vu2Var = k83.f21845a;
                    dt2 dt2Var = dt2.f8706v;
                    C0816sd c0816sd = new C0816sd((Object) this, xa2Var2, (byte) 10);
                    nk2Var.f28409w = 1;
                    obj = jzd.m11694F(dt2Var, c0816sd, nk2Var);
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
        nk2Var = new nk2(this, (za2) xa2Var);
        Object obj2 = nk2Var.f28407u;
        i = nk2Var.f28409w;
        xa2 xa2Var22 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:15)(2:12|13))(9:19|20|(1:22)(1:39)|23|24|(1:26)|27|(2:29|(1:31))(1:(2:34|(1:36))(1:37))|32)|16|17))|42|6|7|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (m3826j(r0) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        r8 = p000.sx7.f39332a;
        p000.sx7.m18369g(p000.ly6.f25312y, "DailyNotifWorker", r7, "Usage stats check failed");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x006f -> B:16:0x007a). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3822e(za2 za2Var) {
        mk2 mk2Var;
        int i;
        if (za2Var instanceof mk2) {
            mk2Var = (mk2) za2Var;
            int i2 = mk2Var.f26519w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mk2Var.f26519w = i2 - Integer.MIN_VALUE;
                Object obj = mk2Var.f26517u;
                i = mk2Var.f26519w;
                if (i != 0) {
                    v11.m20244z(obj);
                    Calendar calendar = Calendar.getInstance();
                    boolean z = calendar.get(5) == 1;
                    boolean z2 = calendar.get(7) == 6;
                    Object obj2 = qc2.f34309u;
                    if (z) {
                        mk2Var.f26519w = 1;
                        if (m3827k(mk2Var) == obj2) {
                        }
                    } else if (z2) {
                        mk2Var.f26519w = 2;
                        if (m3828l(mk2Var) == obj2) {
                        }
                    } else {
                        mk2Var.f26519w = 3;
                    }
                    return obj2;
                }
                if (i != 1 && i != 2 && i != 3) {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                return txc.f41359a;
            }
        }
        mk2Var = new mk2(this, za2Var);
        Object obj3 = mk2Var.f26517u;
        i = mk2Var.f26519w;
        if (i != 0) {
        }
        return txc.f41359a;
    }

    /* renamed from: f */
    public final d80 m3823f() {
        return (d80) this.f6357B.getValue();
    }

    /* renamed from: g */
    public final long m3824g(iv6 iv6Var) {
        d80 m3823f = m3823f();
        LocalDate localDate = iv6Var.f19042u;
        return m3823f.m5986i(localDate.getYear(), qr5.m16864u(iv6Var.m10603c()) - 1, localDate.getDayOfMonth());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3825i(long j, long j2, za2 za2Var) {
        ok2 ok2Var;
        int i;
        if (za2Var instanceof ok2) {
            ok2Var = (ok2) za2Var;
            int i2 = ok2Var.f30683w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ok2Var.f30683w = i2 - Integer.MIN_VALUE;
                ok2 ok2Var2 = ok2Var;
                Object obj = ok2Var2.f30681u;
                i = ok2Var2.f30683w;
                if (i != 0) {
                    v11.m20244z(obj);
                    d80 m3823f = m3823f();
                    ok2Var2.f30683w = 1;
                    obj = m3823f.m5984g(j, j2, 1, ok2Var2);
                    Object obj2 = qc2.f34309u;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                return new Integer(m3821h((String) ((vq8) obj).f44884u));
            }
        }
        ok2Var = new ok2(this, za2Var);
        ok2 ok2Var22 = ok2Var;
        Object obj3 = ok2Var22.f30681u;
        i = ok2Var22.f30683w;
        if (i != 0) {
        }
        return new Integer(m3821h((String) ((vq8) obj3).f44884u));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3826j(za2 za2Var) {
        pk2 pk2Var;
        int i;
        if (za2Var instanceof pk2) {
            pk2Var = (pk2) za2Var;
            int i2 = pk2Var.f32781w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pk2Var.f32781w = i2 - Integer.MIN_VALUE;
                pk2 pk2Var2 = pk2Var;
                Object obj = pk2Var2.f32779u;
                i = pk2Var2.f32781w;
                if (i != 0) {
                    v11.m20244z(obj);
                    xv5 mo2814g = zv5.f53149a.mo2814g();
                    d84 d84Var = ohc.f30553b;
                    iv6 m7611d = AbstractC0327f4.m7611d(mo2814g);
                    LocalDate localDate = m7611d.f19042u;
                    long m5986i = m3823f().m5986i(localDate.getYear(), qr5.m16864u(m7611d.m10603c()) - 1, localDate.getDayOfMonth());
                    d80 m3823f = m3823f();
                    pk2Var2.f32781w = 1;
                    obj = m3823f.m5984g(m5986i, 86399999 + m5986i, 3, pk2Var2);
                    Object obj2 = qc2.f34309u;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                vq8 vq8Var = (vq8) obj;
                String str = "📊 Today's App Usage";
                ((o68) this.f6356A.getValue()).m14842h(new w78(str, (String) vq8Var.f44884u, (List) vq8Var.f44885v, 4001, (Integer) null, 48));
                return txc.f41359a;
            }
        }
        pk2Var = new pk2(this, za2Var);
        pk2 pk2Var22 = pk2Var;
        Object obj3 = pk2Var22.f32779u;
        i = pk2Var22.f32781w;
        if (i != 0) {
        }
        vq8 vq8Var2 = (vq8) obj3;
        String str2 = "📊 Today's App Usage";
        ((o68) this.f6356A.getValue()).m14842h(new w78(str2, (String) vq8Var2.f44884u, (List) vq8Var2.f44885v, 4001, (Integer) null, 48));
        return txc.f41359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3827k(za2 za2Var) {
        qk2 qk2Var;
        int i;
        Integer num;
        long j;
        int m3821h;
        int i2;
        long j2;
        long j3;
        if (za2Var instanceof qk2) {
            qk2Var = (qk2) za2Var;
            int i3 = qk2Var.f34818x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qk2Var.f34818x = i3 - Integer.MIN_VALUE;
                qk2 qk2Var2 = qk2Var;
                Object obj = qk2Var2.f34816v;
                i = qk2Var2.f34818x;
                num = null;
                if (i != 0) {
                    v11.m20244z(obj);
                    xv5 mo2814g = zv5.f53149a.mo2814g();
                    d84 d84Var = ohc.f30553b;
                    iv6 m7611d = AbstractC0327f4.m7611d(mo2814g);
                    long m3824g = m3824g(m7611d);
                    d80 m3823f = m3823f();
                    qk2Var2.f34815u = m3824g;
                    qk2Var2.f34818x = 1;
                    obj = m3823f.m5984g(m3824g(u6d.m19384s(m7611d, new do2(29))), m3824g + 86399999, 3, qk2Var2);
                    Object obj2 = qc2.f34309u;
                    if (obj == obj2) {
                        return obj2;
                    }
                    j = m3824g;
                } else {
                    if (i != 1) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = qk2Var2.f34815u;
                    v11.m20244z(obj);
                }
                vq8 vq8Var = (vq8) obj;
                String str = (String) vq8Var.f44884u;
                List list = (List) vq8Var.f44885v;
                m3821h = m3821h(str);
                r2c r2cVar = this.f6358C;
                i2 = ((SharedPreferences) r2cVar.getValue()).getInt("month_total_minutes", -1);
                j2 = ((SharedPreferences) r2cVar.getValue()).getLong("month_recorded_midnight", -1L);
                if (i2 >= 0 && j2 >= 0) {
                    j3 = (j - j2) / 86400000;
                    if (20 <= j3 && j3 < 46) {
                        num = ag7.m609z(m3821h, i2, 60);
                    }
                }
                ((SharedPreferences) r2cVar.getValue()).edit().putInt("month_total_minutes", m3821h).putLong("month_recorded_midnight", j).apply();
                String str2 = "📊 Last 30 Days App Usage";
                ((o68) this.f6356A.getValue()).m14842h(new w78(str2, str, list, 4003, num, 32));
                return txc.f41359a;
            }
        }
        qk2Var = new qk2(this, za2Var);
        qk2 qk2Var22 = qk2Var;
        Object obj3 = qk2Var22.f34816v;
        i = qk2Var22.f34818x;
        num = null;
        if (i != 0) {
        }
        vq8 vq8Var2 = (vq8) obj3;
        String str3 = (String) vq8Var2.f44884u;
        List list2 = (List) vq8Var2.f44885v;
        m3821h = m3821h(str3);
        r2c r2cVar2 = this.f6358C;
        i2 = ((SharedPreferences) r2cVar2.getValue()).getInt("month_total_minutes", -1);
        j2 = ((SharedPreferences) r2cVar2.getValue()).getLong("month_recorded_midnight", -1L);
        if (i2 >= 0) {
            j3 = (j - j2) / 86400000;
            if (20 <= j3) {
                num = ag7.m609z(m3821h, i2, 60);
            }
        }
        ((SharedPreferences) r2cVar2.getValue()).edit().putInt("month_total_minutes", m3821h).putLong("month_recorded_midnight", j).apply();
        String str22 = "📊 Last 30 Days App Usage";
        ((o68) this.f6356A.getValue()).m14842h(new w78(str22, str3, list2, 4003, num, 32));
        return txc.f41359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3828l(za2 za2Var) {
        rk2 rk2Var;
        Object obj;
        int i;
        qc2 qc2Var;
        rk2 rk2Var2;
        iv6 iv6Var;
        long j;
        long j2;
        DailyNotificationWorker dailyNotificationWorker;
        int i2;
        String str;
        List list;
        if (za2Var instanceof rk2) {
            rk2Var = (rk2) za2Var;
            int i3 = rk2Var.f36865D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rk2Var.f36865D = i3 - Integer.MIN_VALUE;
                rk2 rk2Var3 = rk2Var;
                obj = rk2Var3.f36863B;
                i = rk2Var3.f36865D;
                qc2Var = qc2.f34309u;
                if (i != 0) {
                    v11.m20244z(obj);
                    xv5 mo2814g = zv5.f53149a.mo2814g();
                    d84 d84Var = ohc.f30553b;
                    iv6 m7611d = AbstractC0327f4.m7611d(mo2814g);
                    long m3824g = m3824g(u6d.m19384s(m7611d, new do2(6)));
                    long m3824g2 = m3824g(m7611d) + 86399999;
                    d80 m3823f = m3823f();
                    rk2Var3.f36866u = m7611d;
                    rk2Var3.f36870y = m3824g;
                    rk2Var3.f36871z = m3824g2;
                    rk2Var3.f36865D = 1;
                    rk2Var2 = rk2Var3;
                    Serializable m5984g = m3823f.m5984g(m3824g, m3824g2, 3, rk2Var2);
                    if (m5984g != qc2Var) {
                        iv6Var = m7611d;
                        obj = m5984g;
                        j = m3824g2;
                        j2 = m3824g;
                    }
                    return qc2Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = rk2Var3.f36862A;
                    dailyNotificationWorker = rk2Var3.f36869x;
                    List list2 = rk2Var3.f36868w;
                    String str2 = rk2Var3.f36867v;
                    v11.m20244z(obj);
                    list = list2;
                    str = str2;
                    int intValue = ((Number) obj).intValue();
                    dailyNotificationWorker.getClass();
                    String str3 = "📊 Last 7 Days App Usage";
                    ((o68) this.f6356A.getValue()).m14842h(new w78(str3, str, list, 4002, ag7.m609z(i2, intValue, 60), 32));
                    return txc.f41359a;
                }
                j = rk2Var3.f36871z;
                j2 = rk2Var3.f36870y;
                iv6Var = rk2Var3.f36866u;
                v11.m20244z(obj);
                rk2Var2 = rk2Var3;
                vq8 vq8Var = (vq8) obj;
                String str4 = (String) vq8Var.f44884u;
                List list3 = (List) vq8Var.f44885v;
                int m3821h = m3821h(str4);
                rk2Var2.f36866u = null;
                rk2Var2.f36867v = str4;
                rk2Var2.f36868w = list3;
                rk2Var2.f36869x = this;
                rk2Var2.f36870y = j2;
                rk2Var2.f36871z = j;
                rk2Var2.f36862A = m3821h;
                rk2Var2.f36865D = 2;
                obj = m3825i(m3824g(u6d.m19384s(iv6Var, new do2(13))), j2 - 1, rk2Var2);
                if (obj != qc2Var) {
                    dailyNotificationWorker = this;
                    i2 = m3821h;
                    str = str4;
                    list = list3;
                    int intValue2 = ((Number) obj).intValue();
                    dailyNotificationWorker.getClass();
                    String str32 = "📊 Last 7 Days App Usage";
                    ((o68) this.f6356A.getValue()).m14842h(new w78(str32, str, list, 4002, ag7.m609z(i2, intValue2, 60), 32));
                    return txc.f41359a;
                }
                return qc2Var;
            }
        }
        rk2Var = new rk2(this, za2Var);
        rk2 rk2Var32 = rk2Var;
        obj = rk2Var32.f36863B;
        i = rk2Var32.f36865D;
        qc2Var = qc2.f34309u;
        if (i != 0) {
        }
        vq8 vq8Var2 = (vq8) obj;
        String str42 = (String) vq8Var2.f44884u;
        List list32 = (List) vq8Var2.f44885v;
        int m3821h2 = m3821h(str42);
        rk2Var2.f36866u = null;
        rk2Var2.f36867v = str42;
        rk2Var2.f36868w = list32;
        rk2Var2.f36869x = this;
        rk2Var2.f36870y = j2;
        rk2Var2.f36871z = j;
        rk2Var2.f36862A = m3821h2;
        rk2Var2.f36865D = 2;
        obj = m3825i(m3824g(u6d.m19384s(iv6Var, new do2(13))), j2 - 1, rk2Var2);
        if (obj != qc2Var) {
        }
        return qc2Var;
    }
}
