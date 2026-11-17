package com.kahf.dns.p015di.core;

import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0812s9;
import p000.C0917v3;
import p000.aj5;
import p000.b1a;
import p000.g5b;
import p000.gpc;
import p000.ih5;
import p000.jh5;
import p000.li5;
import p000.mr2;
import p000.p11;
import p000.qc2;
import p000.s0a;
import p000.stb;
import p000.t0a;
import p000.ts2;
import p000.txc;
import p000.u0a;
import p000.v0a;
import p000.v11;
import p000.w0a;
import p000.x0a;
import p000.xa2;
import p000.zg5;
import p000.ztb;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AuthInterceptor implements ih5 {
    private static final String APP_NAME = "kahf-guard";
    private static final String AUTHORIZATION = "Authorization";
    private static final String FALLBACK_DEVICE_ID = "UNKNOWN_DEVICE";
    private static final int HTTP_UNAUTHORIZED = 401;
    private final PreferencesHelper preferencesHelper;
    private final g5b refreshFlows;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = PreferencesHelper.$stable;

    public AuthInterceptor(g5b g5bVar, PreferencesHelper preferencesHelper) {
        preferencesHelper.getClass();
        this.refreshFlows = g5bVar;
        this.preferencesHelper = preferencesHelper;
    }

    private final li5 withAuth(li5 li5Var, String str, String str2) {
        C0812s9 m12775f = li5.m12775f(li5Var);
        if (str != null && !stb.m18260Z0(str)) {
            m12775f.m17929h(AUTHORIZATION, "Bearer ".concat(str));
        }
        m12775f.m17929h("X-Device-Id", str2);
        m12775f.m17929h("app-name", APP_NAME);
        return m12775f.m17933l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x013a, code lost:
    
        if (r5 == r2) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p000.ih5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(li5 li5Var, jh5 jh5Var, xa2 xa2Var) {
        AuthInterceptor$intercept$1 authInterceptor$intercept$1;
        int i;
        String uniqueDeviceId;
        b1a m8365a;
        Object m1564a;
        li5 li5Var2;
        String str;
        jh5 jh5Var2;
        b1a b1aVar;
        String str2;
        aj5 aj5Var;
        aj5 aj5Var2;
        x0a x0aVar;
        b1a b1aVar2;
        aj5 aj5Var3;
        if (xa2Var instanceof AuthInterceptor$intercept$1) {
            authInterceptor$intercept$1 = (AuthInterceptor$intercept$1) xa2Var;
            int i2 = authInterceptor$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authInterceptor$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authInterceptor$intercept$1.result;
                i = authInterceptor$intercept$1.label;
                qc2 qc2Var = qc2.f34309u;
                switch (i) {
                    case 0:
                        v11.m20244z(obj);
                        uniqueDeviceId = this.preferencesHelper.getUniqueDeviceId();
                        if (uniqueDeviceId == null) {
                            uniqueDeviceId = FALLBACK_DEVICE_ID;
                        }
                        List m12778c = li5Var.m12778c();
                        if (!((ArrayList) m12778c).isEmpty()) {
                            Iterator it = ((ArrayList) m12778c).iterator();
                            while (it.hasNext()) {
                                if (ztb.m23792y0(((zg5) it.next()).f52394a, AUTHORIZATION, true)) {
                                    li5 withAuth = withAuth(li5Var, null, uniqueDeviceId);
                                    authInterceptor$intercept$1.L$0 = null;
                                    authInterceptor$intercept$1.L$1 = null;
                                    authInterceptor$intercept$1.L$2 = null;
                                    authInterceptor$intercept$1.label = 1;
                                    Object m19029a = ((ts2) jh5Var).m19029a(withAuth, authInterceptor$intercept$1);
                                    return m19029a == qc2Var ? qc2Var : m19029a;
                                }
                            }
                        }
                        g5b g5bVar = this.refreshFlows;
                        if (g5bVar != null && (m8365a = g5bVar.m8365a()) != null) {
                            authInterceptor$intercept$1.L$0 = li5Var;
                            authInterceptor$intercept$1.L$1 = jh5Var;
                            authInterceptor$intercept$1.L$2 = uniqueDeviceId;
                            authInterceptor$intercept$1.L$3 = m8365a;
                            authInterceptor$intercept$1.label = 3;
                            m1564a = m8365a.m1564a(authInterceptor$intercept$1);
                            break;
                        } else {
                            String authToken = this.preferencesHelper.getAuthToken();
                            if (stb.m18260Z0(authToken)) {
                                authToken = null;
                            }
                            li5 withAuth2 = withAuth(li5Var, authToken, uniqueDeviceId);
                            authInterceptor$intercept$1.L$0 = null;
                            authInterceptor$intercept$1.L$1 = null;
                            authInterceptor$intercept$1.L$2 = null;
                            authInterceptor$intercept$1.label = 2;
                            Object m19029a2 = ((ts2) jh5Var).m19029a(withAuth2, authInterceptor$intercept$1);
                            if (m19029a2 != qc2Var) {
                                return m19029a2;
                            }
                        }
                    case 1:
                    case 2:
                        v11.m20244z(obj);
                        return obj;
                    case 3:
                        b1a b1aVar3 = (b1a) authInterceptor$intercept$1.L$3;
                        String str3 = (String) authInterceptor$intercept$1.L$2;
                        jh5 jh5Var3 = (jh5) authInterceptor$intercept$1.L$1;
                        li5 li5Var3 = (li5) authInterceptor$intercept$1.L$0;
                        v11.m20244z(obj);
                        m8365a = b1aVar3;
                        li5Var = li5Var3;
                        m1564a = obj;
                        uniqueDeviceId = str3;
                        jh5Var = jh5Var3;
                        String str4 = (String) m1564a;
                        li5 withAuth3 = withAuth(li5Var, str4, uniqueDeviceId);
                        authInterceptor$intercept$1.L$0 = li5Var;
                        authInterceptor$intercept$1.L$1 = jh5Var;
                        authInterceptor$intercept$1.L$2 = uniqueDeviceId;
                        authInterceptor$intercept$1.L$3 = m8365a;
                        authInterceptor$intercept$1.L$4 = str4;
                        authInterceptor$intercept$1.label = 4;
                        ts2 ts2Var = (ts2) jh5Var;
                        Object m19029a3 = ts2Var.m19029a(withAuth3, authInterceptor$intercept$1);
                        if (m19029a3 != qc2Var) {
                            li5Var2 = li5Var;
                            str = str4;
                            jh5Var2 = ts2Var;
                            b1aVar = m8365a;
                            str2 = uniqueDeviceId;
                            obj = m19029a3;
                            aj5Var = (aj5) obj;
                            if (aj5Var.m758b() == HTTP_UNAUTHORIZED) {
                                return aj5Var;
                            }
                            authInterceptor$intercept$1.L$0 = li5Var2;
                            authInterceptor$intercept$1.L$1 = jh5Var2;
                            authInterceptor$intercept$1.L$2 = str2;
                            authInterceptor$intercept$1.L$3 = b1aVar;
                            authInterceptor$intercept$1.L$4 = null;
                            authInterceptor$intercept$1.L$5 = aj5Var;
                            authInterceptor$intercept$1.label = 5;
                            Object m1565b = b1aVar.m1565b(str, authInterceptor$intercept$1);
                            if (m1565b != qc2Var) {
                                obj = m1565b;
                                aj5Var2 = aj5Var;
                                x0aVar = (x0a) obj;
                                if (x0aVar instanceof u0a) {
                                    if (zy5.m23838d(x0aVar, v0a.f43525a) || zy5.m23838d(x0aVar, w0a.f45515a) || zy5.m23838d(x0aVar, t0a.f39495a) || (x0aVar instanceof s0a)) {
                                        return aj5Var2;
                                    }
                                    gpc.m8801a();
                                    return null;
                                }
                                p11 m757a = aj5Var2.m757a();
                                if (m757a != null) {
                                    m757a.close();
                                }
                                li5 withAuth4 = withAuth(li5Var2, ((u0a) x0aVar).m19253a(), str2);
                                authInterceptor$intercept$1.L$0 = null;
                                authInterceptor$intercept$1.L$1 = null;
                                authInterceptor$intercept$1.L$2 = null;
                                authInterceptor$intercept$1.L$3 = b1aVar;
                                authInterceptor$intercept$1.L$4 = null;
                                authInterceptor$intercept$1.L$5 = null;
                                authInterceptor$intercept$1.L$6 = null;
                                authInterceptor$intercept$1.label = 6;
                                obj = ((ts2) jh5Var2).m19029a(withAuth4, authInterceptor$intercept$1);
                                if (obj != qc2Var) {
                                    b1aVar2 = b1aVar;
                                    aj5Var3 = (aj5) obj;
                                    if (aj5Var3.m758b() == HTTP_UNAUTHORIZED) {
                                        authInterceptor$intercept$1.L$0 = null;
                                        authInterceptor$intercept$1.L$1 = null;
                                        authInterceptor$intercept$1.L$2 = null;
                                        authInterceptor$intercept$1.L$3 = null;
                                        authInterceptor$intercept$1.L$4 = null;
                                        authInterceptor$intercept$1.L$5 = null;
                                        authInterceptor$intercept$1.L$6 = null;
                                        authInterceptor$intercept$1.L$7 = aj5Var3;
                                        authInterceptor$intercept$1.label = 7;
                                        b1aVar2.f2449a.clear();
                                        Object invoke = b1aVar2.f2452d.invoke(authInterceptor$intercept$1);
                                        if (invoke != qc2Var) {
                                            invoke = txc.f41359a;
                                        }
                                        if (invoke == qc2Var) {
                                        }
                                    }
                                    return aj5Var3;
                                }
                            }
                        }
                    case 4:
                        str = (String) authInterceptor$intercept$1.L$4;
                        b1aVar = (b1a) authInterceptor$intercept$1.L$3;
                        str2 = (String) authInterceptor$intercept$1.L$2;
                        jh5Var2 = (jh5) authInterceptor$intercept$1.L$1;
                        li5Var2 = (li5) authInterceptor$intercept$1.L$0;
                        v11.m20244z(obj);
                        aj5Var = (aj5) obj;
                        if (aj5Var.m758b() == HTTP_UNAUTHORIZED) {
                        }
                        break;
                    case 5:
                        aj5Var2 = (aj5) authInterceptor$intercept$1.L$5;
                        b1aVar = (b1a) authInterceptor$intercept$1.L$3;
                        str2 = (String) authInterceptor$intercept$1.L$2;
                        jh5Var2 = (jh5) authInterceptor$intercept$1.L$1;
                        li5Var2 = (li5) authInterceptor$intercept$1.L$0;
                        v11.m20244z(obj);
                        x0aVar = (x0a) obj;
                        if (x0aVar instanceof u0a) {
                        }
                        break;
                    case 6:
                        b1aVar2 = (b1a) authInterceptor$intercept$1.L$3;
                        v11.m20244z(obj);
                        aj5Var3 = (aj5) obj;
                        if (aj5Var3.m758b() == HTTP_UNAUTHORIZED) {
                        }
                        return aj5Var3;
                    case 7:
                        aj5 aj5Var4 = (aj5) authInterceptor$intercept$1.L$7;
                        v11.m20244z(obj);
                        return aj5Var4;
                    default:
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        authInterceptor$intercept$1 = new AuthInterceptor$intercept$1(this, xa2Var);
        Object obj2 = authInterceptor$intercept$1.result;
        i = authInterceptor$intercept$1.label;
        qc2 qc2Var2 = qc2.f34309u;
        switch (i) {
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class Companion {
        public /* synthetic */ Companion(mr2 mr2Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // p000.ih5
    public /* bridge */ void dispose() {
    }
}
