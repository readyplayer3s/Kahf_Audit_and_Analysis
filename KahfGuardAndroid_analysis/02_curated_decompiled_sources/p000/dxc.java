package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class dxc extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f8940u;

    /* renamed from: v */
    public boolean f8941v;

    /* renamed from: w */
    public final /* synthetic */ Context f8942w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dxc(Context context, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f8940u = b;
        this.f8942w = context;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f8940u;
        Context context = this.f8942w;
        switch (b) {
            case 0:
                dxc dxcVar = new dxc(context, xa2Var, (byte) 0);
                dxcVar.f8941v = ((Boolean) obj).booleanValue();
                return dxcVar;
            default:
                return new dxc(context, xa2Var, (byte) 1);
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8940u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((dxc) create(bool, (xa2) obj2)).invokeSuspend(txcVar);
                return txcVar;
            default:
                return ((dxc) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
        }
    }

    @Override // p000.dp0
    public final Object invokeSuspend(Object obj) {
        byte b = this.f8940u;
        Context context = this.f8942w;
        switch (b) {
            case 0:
                v11.m20244z(obj);
                boolean z = this.f8941v;
                String str = jp8.f20916a;
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                jp8.m11491a(packageManager, new ComponentName(context, (Class<?>) RescheduleReceiver.class), z, hp8.f16699u);
                return txc.f41359a;
            default:
                boolean z2 = this.f8941v;
                xa2 xa2Var = null;
                if (z2) {
                    if (z2) {
                        v11.m20244z(obj);
                        return obj;
                    }
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11.m20244z(obj);
                vu2 vu2Var = k83.f21845a;
                dt2 dt2Var = dt2.f8706v;
                C0602ml c0602ml = new C0602ml(context, xa2Var, (byte) 12);
                this.f8941v = true;
                Object m11694F = jzd.m11694F(dt2Var, c0602ml, this);
                qc2 qc2Var = qc2.f34309u;
                return m11694F == qc2Var ? qc2Var : m11694F;
        }
    }
}
