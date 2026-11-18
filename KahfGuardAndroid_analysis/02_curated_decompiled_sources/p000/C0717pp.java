package p000;

import android.view.Choreographer;
import com.github.mikephil.charting.charts.Chart;
import com.kahf.dns.features.notification.AnsarReminderWorker;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: pp */
/* loaded from: classes2.dex */
public final class C0717pp extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f32984u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717pp(byte b) {
        super(2, null);
        this.f32984u = b;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        switch (this.f32984u) {
            case 0:
                return new C0717pp(2, xa2Var, (byte) 0);
            case 1:
                return new C0717pp(2, xa2Var, (byte) 1);
            case 2:
                return new C0717pp(2, xa2Var, (byte) 2);
            case 3:
                return new C0717pp(2, xa2Var, (byte) 3);
            case 4:
                return new C0717pp(2, xa2Var, (byte) 4);
            case 5:
                return new C0717pp(2, xa2Var, (byte) 5);
            case 6:
                return new C0717pp(2, xa2Var, (byte) 6);
            case 7:
                return new C0717pp(2, xa2Var, (byte) 7);
            case 8:
                return new C0717pp(2, xa2Var, (byte) 8);
            case 9:
                return new C0717pp(2, xa2Var, (byte) 9);
            case 10:
                return new C0717pp(2, xa2Var, (byte) 10);
            case 11:
                return new C0717pp(2, xa2Var, (byte) 11);
            case 12:
                return new C0717pp(2, xa2Var, (byte) 12);
            case 13:
                return new C0717pp(2, xa2Var, (byte) 13);
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                return new C0717pp(2, xa2Var, (byte) 14);
            case ba7.f2964h /* 15 */:
                return new C0717pp(2, xa2Var, (byte) 15);
            case 16:
                return new C0717pp(2, xa2Var, (byte) 16);
            default:
                return new C0717pp(2, xa2Var, (byte) 17);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32984u;
        wwc wwcVar = wwc.f47276u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                return ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 1:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 2:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 3:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 4:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 5:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 6:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 7:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 8:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 9:
                ((C0717pp) create((ova) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return wwcVar;
            case 10:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 11:
                return ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 12:
                ((C0717pp) create((ova) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return wwcVar;
            case 13:
                ((C0717pp) create((ova) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return Boolean.TRUE;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                ((C0717pp) create((ova) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return wwcVar;
            case ba7.f2964h /* 15 */:
                ((C0717pp) create((gwa) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            case 16:
                return ((C0717pp) create((ova) obj, (xa2) obj2)).invokeSuspend(txcVar);
            default:
                ((C0717pp) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
        }
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        byte b = this.f32984u;
        boolean z = false;
        wwc wwcVar = wwc.f47276u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                v11.m20244z(obj);
                return Choreographer.getInstance();
            case 1:
                v11.m20244z(obj);
                try {
                    AnsarReminderWorker.f6347C.m22385e(sa2.f38142u.m17960c());
                } catch (Exception e) {
                    sx7 sx7Var = sx7.f39332a;
                    sj8.m18114z("Failed to schedule ansar reminder: ", e.getMessage(), ly6.f25312y, "AnsarReminderScheduler", null);
                }
                return txcVar;
            case 2:
                v11.m20244z(obj);
                return txcVar;
            case 3:
                v11.m20244z(obj);
                return txcVar;
            case 4:
                v11.m20244z(obj);
                return txcVar;
            case 5:
                v11.m20244z(obj);
                return txcVar;
            case 6:
                v11.m20244z(obj);
                return txcVar;
            case 7:
                v11.m20244z(obj);
                return txcVar;
            case 8:
                v11.m20244z(obj);
                return txcVar;
            case 9:
                v11.m20244z(obj);
                return wwcVar;
            case 10:
                v11.m20244z(obj);
                return txcVar;
            case 11:
                ly6 ly6Var = ly6.f25309v;
                v11.m20244z(obj);
                try {
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress("1.1.1.1", 443), 3000);
                        socket.close();
                        z = true;
                    } finally {
                    }
                } catch (CancellationException e2) {
                    sx7 sx7Var2 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "DNS_TRACE", null, "hasInternet: Cancelled");
                    throw e2;
                } catch (Exception e3) {
                    sx7 sx7Var3 = sx7.f39332a;
                    sj8.m18114z("Direct internet check failed: ", e3.getMessage(), ly6Var, "DNS_TRACE", null);
                }
                return Boolean.valueOf(z);
            case 12:
                v11.m20244z(obj);
                return wwcVar;
            case 13:
                v11.m20244z(obj);
                return Boolean.TRUE;
            case Chart.PAINT_CENTER_TEXT /* 14 */:
                v11.m20244z(obj);
                return wwcVar;
            case ba7.f2964h /* 15 */:
                v11.m20244z(obj);
                return txcVar;
            case 16:
                v11.m20244z(obj);
                return new m16(z);
            default:
                v11.m20244z(obj);
                return txcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717pp(int i, xa2 xa2Var, byte b) {
        super(i, xa2Var);
        this.f32984u = b;
    }
}
