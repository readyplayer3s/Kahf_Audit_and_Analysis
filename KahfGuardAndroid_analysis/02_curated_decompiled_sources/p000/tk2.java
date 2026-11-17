package p000;

import android.content.Context;
import com.kahf.dns.core.analytics.AnalyticsEvent;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class tk2 implements az8 {

    /* renamed from: a */
    public final rp9 f40682a;

    /* renamed from: b */
    public final C1001xd f40683b;

    static {
        Set set = rp9.f37067d;
    }

    public tk2(rp9 rp9Var, C1001xd c1001xd) {
        rp9Var.getClass();
        c1001xd.getClass();
        this.f40682a = rp9Var;
        this.f40683b = c1001xd;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: Exception -> 0x0033, CancellationException -> 0x00ab, TryCatch #2 {CancellationException -> 0x00ab, Exception -> 0x0033, blocks: (B:12:0x002f, B:13:0x0090, B:19:0x003b, B:20:0x0058, B:23:0x007a, B:27:0x0071, B:29:0x0042), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // p000.az8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1532a(Context context, za2 za2Var) {
        sk2 sk2Var;
        int i;
        yy8 yy8Var;
        qc2 qc2Var;
        Map map;
        C1001xd c1001xd;
        AnalyticsEvent.DailyStatusEvent.Snapshot snapshot;
        Map map2;
        try {
            if (za2Var instanceof sk2) {
                sk2Var = (sk2) za2Var;
                int i2 = sk2Var.f38646x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sk2Var.f38646x = i2 - Integer.MIN_VALUE;
                    Object obj = sk2Var.f38644v;
                    i = sk2Var.f38646x;
                    yy8Var = yy8.f51457a;
                    qc2Var = qc2.f34309u;
                    if (i != 0) {
                        v11.m20244z(obj);
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6.f25309v, "DailyStatusTask", null, "Starting daily status snapshot task");
                        rp9 rp9Var = this.f40682a;
                        sk2Var.f38646x = 1;
                        Set set = rp9.f37067d;
                        obj = rp9Var.m17488a(context, true, sk2Var);
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map2 = sk2Var.f38643u;
                            v11.m20244z(obj);
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18368f("DailyStatusTask", new C0993x5(map2, (byte) 27));
                            return yy8Var;
                        }
                        v11.m20244z(obj);
                    }
                    map = (Map) obj;
                    ad0 ad0Var = ic9.f18043a;
                    o02 o02Var = u11.f41528b;
                    Date date = new Date();
                    map.getClass();
                    ad0Var.getClass();
                    if (map.isEmpty()) {
                        ad0Var.m372d(new u68(o02Var, map, date, (byte) 3));
                    }
                    c1001xd = this.f40683b;
                    snapshot = new AnalyticsEvent.DailyStatusEvent.Snapshot(map);
                    sk2Var.f38643u = map;
                    sk2Var.f38646x = 2;
                    if (c1001xd.m22027d(snapshot, sk2Var) != qc2Var) {
                        map2 = map;
                        sx7 sx7Var22 = sx7.f39332a;
                        sx7.m18368f("DailyStatusTask", new C0993x5(map2, (byte) 27));
                        return yy8Var;
                    }
                    return qc2Var;
                }
            }
            if (i != 0) {
            }
            map = (Map) obj;
            ad0 ad0Var2 = ic9.f18043a;
            o02 o02Var2 = u11.f41528b;
            Date date2 = new Date();
            map.getClass();
            ad0Var2.getClass();
            if (map.isEmpty()) {
            }
            c1001xd = this.f40683b;
            snapshot = new AnalyticsEvent.DailyStatusEvent.Snapshot(map);
            sk2Var.f38643u = map;
            sk2Var.f38646x = 2;
            if (c1001xd.m22027d(snapshot, sk2Var) != qc2Var) {
            }
            return qc2Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var3 = sx7.f39332a;
            sj8.m18114z("Error in daily status task: ", e2.getMessage(), ly6.f25312y, "DailyStatusTask", null);
            return yy8Var;
        }
        sk2Var = new sk2(this, za2Var);
        Object obj2 = sk2Var.f38644v;
        i = sk2Var.f38646x;
        yy8Var = yy8.f51457a;
        qc2Var = qc2.f34309u;
    }

    @Override // p000.az8
    /* renamed from: b */
    public final String mo1533b() {
        return "daily_status";
    }
}
