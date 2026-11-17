package p000;

import android.content.Context;
import android.database.SQLException;
import android.util.Log;
import com.google.firebase.concurrent.GfAS.xsIgieWT;
import com.kahf.dns.KahfGuardApp;
import com.kahf.dns.features.user.InstalledAppsSyncWorker;
import com.kahf.dns.p019ui.MainActivity;
import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class l74 extends s1c implements jm4 {

    /* renamed from: u */
    public final /* synthetic */ byte f23811u;

    /* renamed from: v */
    public byte f23812v;

    /* renamed from: w */
    public Object f23813w;

    /* renamed from: x */
    public final /* synthetic */ Object f23814x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l74(Object obj, Object obj2, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f23811u = b;
        this.f23813w = obj;
        this.f23814x = obj2;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        byte b = this.f23811u;
        Object obj2 = this.f23814x;
        switch (b) {
            case 0:
                return new l74((m74) this.f23813w, (o5b) obj2, xa2Var, (byte) 0);
            case 1:
                return new l74((InstalledAppsSyncWorker) obj2, xa2Var, (byte) 1);
            case 2:
                return new l74((MainActivity) obj2, xa2Var, (byte) 2);
            case 3:
                return new l74((v57) this.f23813w, (wy7) obj2, xa2Var, (byte) 3);
            case 4:
                return new l74((v57) obj2, xa2Var, (byte) 4);
            case 5:
                return new l74((a9b) this.f23813w, (j4b) obj2, xa2Var, (byte) 5);
            case 6:
                return new l74((d4b) obj2, xa2Var, (byte) 6);
            default:
                l74 l74Var = new l74((mqc) obj2, xa2Var, (byte) 7);
                l74Var.f23813w = obj;
                return l74Var;
        }
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23811u;
        txc txcVar = txc.f41359a;
        switch (b) {
            case 0:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 1:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 2:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 3:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 4:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 5:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            case 6:
                return ((l74) create((pc2) obj, (xa2) obj2)).invokeSuspend(txcVar);
            default:
                return ((l74) create((rnc) obj, (xa2) obj2)).invokeSuspend(txcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cd, code lost:
    
        if (r0 == r8) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0546, code lost:
    
        if (r2.m16312b(r18) == r8) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x050f, code lost:
    
        if (r3 == r8) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r2 != r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r0.invoke(r2, r18) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
    
        if (p000.i30.m9887C((p000.v94) r0, r3, r18) == r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
    
        if (r0 != r8) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d8 A[Catch: Exception -> 0x0214, xhc -> 0x0217, TryCatch #6 {xhc -> 0x0217, Exception -> 0x0214, blocks: (B:126:0x020f, B:131:0x0224, B:133:0x025f, B:138:0x02d4, B:140:0x02d8, B:145:0x02f3, B:146:0x02f8, B:147:0x0283, B:148:0x028b, B:150:0x0291, B:153:0x02a3, B:157:0x02aa, B:158:0x02b2, B:160:0x02b8, B:169:0x022d), top: B:122:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f3 A[Catch: Exception -> 0x0214, xhc -> 0x0217, TryCatch #6 {xhc -> 0x0217, Exception -> 0x0214, blocks: (B:126:0x020f, B:131:0x0224, B:133:0x025f, B:138:0x02d4, B:140:0x02d8, B:145:0x02f3, B:146:0x02f8, B:147:0x0283, B:148:0x028b, B:150:0x0291, B:153:0x02a3, B:157:0x02aa, B:158:0x02b2, B:160:0x02b8, B:169:0x022d), top: B:122:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044d A[Catch: Exception -> 0x0333, TryCatch #4 {Exception -> 0x0333, blocks: (B:184:0x032e, B:185:0x04a5, B:190:0x0340, B:192:0x0445, B:194:0x044d, B:196:0x046c, B:198:0x0472, B:200:0x047a, B:202:0x0480, B:206:0x04ab, B:208:0x04af, B:209:0x04b5, B:214:0x034c, B:216:0x03cf, B:217:0x03fa, B:219:0x0400, B:221:0x041d, B:226:0x0357, B:228:0x0370, B:230:0x037c, B:232:0x038e, B:234:0x039f), top: B:179:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046c A[Catch: Exception -> 0x0333, TryCatch #4 {Exception -> 0x0333, blocks: (B:184:0x032e, B:185:0x04a5, B:190:0x0340, B:192:0x0445, B:194:0x044d, B:196:0x046c, B:198:0x0472, B:200:0x047a, B:202:0x0480, B:206:0x04ab, B:208:0x04af, B:209:0x04b5, B:214:0x034c, B:216:0x03cf, B:217:0x03fa, B:219:0x0400, B:221:0x041d, B:226:0x0357, B:228:0x0370, B:230:0x037c, B:232:0x038e, B:234:0x039f), top: B:179:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v14, types: [j4b] */
    /* JADX WARN: Type inference failed for: r6v17, types: [pc2, qa2] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00be -> B:30:0x00c2). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m19413b;
        String stringFromPreferences$default;
        Object m11694F;
        Object m14483I;
        C0726py c0726py;
        LinkedHashMap m18372a;
        Object m13761W;
        String str;
        KahfGuardApp kahfGuardApp;
        Object m13762X;
        Object tdaVar;
        Throwable m19582a;
        Object obj2;
        C0853td c0853td;
        rnc rncVar;
        Object mo14564a;
        Object mo14565d;
        byte b = this.f23811u;
        ly6 ly6Var = ly6.f25312y;
        byte b2 = 8;
        byte b3 = 3;
        Object obj3 = txc.f41359a;
        Object obj4 = this.f23814x;
        Object obj5 = qc2.f34309u;
        char c = 1;
        xa2 xa2Var = null;
        switch (b) {
            case 0:
                m74 m74Var = (m74) this.f23813w;
                q5b q5bVar = m74Var.f25761b;
                byte b4 = this.f23812v;
                if (b4 == 0) {
                    v11.m20244z(obj);
                    u74 u74Var = u74.f41905a;
                    this.f23812v = (byte) 1;
                    m19413b = u74Var.m19413b(this);
                    break;
                } else {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v11.m20244z(obj);
                        Boolean mo93a = q5bVar.f33953a.mo93a();
                        if (!((mo93a == null && (mo93a = q5bVar.f33954b.mo93a()) == null) ? true : mo93a.booleanValue())) {
                            nud.m14535g(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                            return obj3;
                        }
                        v54 v54Var = m74Var.f25760a;
                        w54 w54Var = new w54((byte) 9);
                        v54Var.m20388a();
                        v54Var.f43757j.add(w54Var);
                        return obj3;
                    }
                    v11.m20244z(obj);
                    m19413b = obj;
                }
                Collection values = ((Map) m19413b).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((ge2) it.next()).f13978a.m2189a()) {
                            this.f23812v = (byte) 2;
                            break;
                        }
                    }
                }
                nud.m14535g(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return obj3;
            case 1:
                InstalledAppsSyncWorker installedAppsSyncWorker = (InstalledAppsSyncWorker) obj4;
                kl6 kl6Var = installedAppsSyncWorker.f6384B;
                byte b5 = this.f23812v;
                try {
                    if (b5 == 0) {
                        v11.m20244z(obj);
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18364b(sx7Var, "Starting installed apps sync work", "KG_SYNC", 2);
                        if (PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) kl6Var.getValue(), PrefKeys.KEY_USER_ID, null, 2, null).length() == 0) {
                            sx7.m18364b(sx7Var, "User not logged in, skipping sync", "KG_SYNC", 2);
                            return new ht6();
                        }
                        stringFromPreferences$default = PreferencesHelper.getStringFromPreferences$default((PreferencesHelper) kl6Var.getValue(), PrefKeys.KEY_DEVICE_MONGODB_ID, null, 2, null);
                        if (stringFromPreferences$default.length() == 0) {
                            sx7.m18366d(2, "Device ID not available, cannot sync", "KG_SYNC", null);
                            sx7.m18366d(2, "[MONGO_ID] Device MongoDB ID not found in preferences - cannot sync installed apps", "KG_SYNC", null);
                            return new ft6();
                        }
                        sx7.m18364b(sx7Var, "Collecting installed apps for device: ".concat(stringFromPreferences$default), "KG_SYNC", 2);
                        sx7.m18364b(sx7Var, "[MONGO_ID] Using device MongoDB ID for installed apps sync: ".concat(stringFromPreferences$default), "KG_SYNC", 2);
                        sv5 sv5Var = (sv5) installedAppsSyncWorker.f6385C.getValue();
                        this.f23813w = stringFromPreferences$default;
                        this.f23812v = (byte) 1;
                        C0639nl c0639nl = (C0639nl) sv5Var;
                        c0639nl.getClass();
                        vu2 vu2Var = k83.f21845a;
                        m11694F = jzd.m11694F(dt2.f8706v, new C0565ll(c0639nl, null), this);
                        if (m11694F == obj5) {
                            return obj5;
                        }
                    } else {
                        if (b5 != 1) {
                            if (b5 != 2) {
                                if (b5 == 3) {
                                    v11.m20244z(obj);
                                    return new ht6();
                                }
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str2 = (String) this.f23813w;
                            v11.m20244z(obj);
                            stringFromPreferences$default = str2;
                            m14483I = obj;
                            c0726py = (C0726py) m14483I;
                            if (!c0726py.m16202a()) {
                                sx7 sx7Var2 = sx7.f39332a;
                                sx7.m18366d(2, "GraphQL errors: " + c0726py.f33501d, "KG_SYNC", null);
                                return new gt6();
                            }
                            yzc yzcVar = (yzc) c0726py.f33500c;
                            zzc m23205a = yzcVar != null ? yzcVar.m23205a() : null;
                            if (m23205a == null || !m23205a.m23870c()) {
                                sx7 sx7Var3 = sx7.f39332a;
                                sx7.m18366d(2, "Failed to sync installed apps: " + (m23205a != null ? m23205a.m23868a() : null), "KG_SYNC", null);
                                return new gt6();
                            }
                            sx7.m18364b(sx7.f39332a, "Installed apps synced successfully: " + m23205a.m23869b(), "KG_SYNC", 2);
                            this.f23813w = null;
                            this.f23812v = (byte) 3;
                            if (installedAppsSyncWorker.m3841e(stringFromPreferences$default, this) == obj5) {
                                return obj5;
                            }
                            return new ht6();
                        }
                        String str3 = (String) this.f23813w;
                        v11.m20244z(obj);
                        stringFromPreferences$default = str3;
                        m11694F = obj;
                    }
                    List<qv5> list = (List) m11694F;
                    sx7.m18364b(sx7.f39332a, "Found " + list.size() + " installed apps", "KG_SYNC", 2);
                    ArrayList arrayList = new ArrayList(qs1.m16870Y(list, 10));
                    for (qv5 qv5Var : list) {
                        arrayList.add(new rv5(qv5Var.f35511a, qv5Var.f35512b, ra7.m17228y(Boolean.valueOf(qv5Var.f35513c))));
                    }
                    sx7.m18364b(sx7.f39332a, "Sending installed apps to server", "KG_SYNC", 2);
                    C1058yx c1058yx = (C1058yx) installedAppsSyncWorker.f6383A.getValue();
                    a0d a0dVar = new a0d(stringFromPreferences$default, arrayList);
                    c1058yx.getClass();
                    nu5 nu5Var = new nu5(c1058yx, (oj8) a0dVar);
                    this.f23813w = stringFromPreferences$default;
                    this.f23812v = (byte) 2;
                    m14483I = nu5Var.m14483I(this);
                    if (m14483I == obj5) {
                        return obj5;
                    }
                    c0726py = (C0726py) m14483I;
                    if (!c0726py.m16202a()) {
                    }
                } catch (Exception e) {
                    sx7 sx7Var4 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "KG_SYNC", e, sj8.m18102n("Exception during installed apps sync: ", e.getMessage()));
                    return new gt6();
                }
                break;
            case 2:
                MainActivity mainActivity = (MainActivity) obj4;
                byte b6 = this.f23812v;
                try {
                    if (b6 == 0) {
                        v11.m20244z(obj);
                        sx7.m18364b(sx7.f39332a, "Starting analytics initialization", "Analytics", 2);
                        sxc sxcVar = sxc.f39342a;
                        Context applicationContext = mainActivity.getApplicationContext();
                        applicationContext.getClass();
                        m18372a = sxc.m18372a(applicationContext);
                        Context applicationContext2 = mainActivity.getApplicationContext();
                        applicationContext2.getClass();
                        this.f23813w = m18372a;
                        this.f23812v = (byte) 1;
                        m13761W = muc.m13761W(i30.m9932k0(sxc.f39343b), new dxc(applicationContext2, xa2Var, c == true ? 1 : 0), this);
                        if (m13761W == obj5) {
                            return obj5;
                        }
                    } else {
                        if (b6 != 1) {
                            if (b6 == 2) {
                                v11.m20244z(obj);
                                return obj3;
                            }
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m18372a = (LinkedHashMap) this.f23813w;
                        v11.m20244z(obj);
                        m13761W = obj;
                    }
                    String str4 = (String) m13761W;
                    sx7.m18364b(sx7.f39332a, "User ID ready: " + stb.m18283w1(8, str4) + "...", "Analytics", 2);
                    if (!m18372a.isEmpty()) {
                        Iterator it2 = m18372a.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                if (!m18372a.isEmpty()) {
                                    Iterator it3 = m18372a.entrySet().iterator();
                                    while (it3.hasNext()) {
                                        if (((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                                            str = "partial";
                                            String str5 = str;
                                            kahfGuardApp = KahfGuardApp.f6225y;
                                            if (kahfGuardApp == null) {
                                                zy5.m23857x("INSTANCE");
                                                throw null;
                                            }
                                            boolean z = kahfGuardApp.f6227v;
                                            vu2 vu2Var2 = k83.f21845a;
                                            n75 n75Var = h57.f15547a;
                                            C0391gv c0391gv = new C0391gv(mainActivity, str4, str5, z, (xa2) null);
                                            this.f23813w = null;
                                            this.f23812v = (byte) 2;
                                            if (jzd.m11694F(n75Var, c0391gv, this) != obj5) {
                                                return obj3;
                                            }
                                            return obj5;
                                        }
                                    }
                                }
                                str = "basic";
                                String str52 = str;
                                kahfGuardApp = KahfGuardApp.f6225y;
                                if (kahfGuardApp == null) {
                                }
                            }
                        }
                    }
                    str = "optimal";
                    String str522 = str;
                    kahfGuardApp = KahfGuardApp.f6225y;
                    if (kahfGuardApp == null) {
                    }
                } catch (xhc e2) {
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "Analytics", e2, "Analytics initialization timed out");
                    KahfGuardApp kahfGuardApp2 = KahfGuardApp.f6225y;
                    v20.m20254A("Analytics-Timeout", e2);
                    return obj3;
                } catch (Exception e3) {
                    sx7 sx7Var6 = sx7.f39332a;
                    sx7.m18369g(ly6Var, "Analytics", e3, "Failed to initialize analytics");
                    KahfGuardApp kahfGuardApp3 = KahfGuardApp.f6225y;
                    v20.m20254A(xsIgieWT.KnUFGucRak, e3);
                    return obj3;
                }
            case 3:
                byte b7 = this.f23812v;
                if (b7 == 0) {
                    v11.m20244z(obj);
                    x00 x00Var = new x00((wy7) obj4, xa2Var, (byte) 11);
                    this.f23812v = (byte) 1;
                    m13762X = muc.m13762X(2000L, x00Var, this);
                    break;
                } else {
                    if (b7 != 1) {
                        if (b7 == 2) {
                            v11.m20244z(obj);
                            return obj3;
                        }
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                    m13762X = obj;
                }
                if (!zy5.m23838d((Boolean) m13762X, Boolean.TRUE)) {
                    sx7 sx7Var7 = sx7.f39332a;
                    sx7.m18366d(2, "MainScreen: NavController timeout (2s), skipping deeplink navigation", "MainScreen", null);
                    return obj3;
                }
                sx7.m18364b(sx7.f39332a, "MainScreen: NavController ready, observing deeplink events", "MainScreen", 2);
                v57 v57Var = (v57) this.f23813w;
                sa1 sa1Var = v57Var.f43773F;
                r21 r21Var = new r21(v57Var, b3);
                this.f23812v = (byte) 2;
                if (sa1Var.collect(r21Var, this) != obj5) {
                    return obj3;
                }
                return obj5;
            case 4:
                v57 v57Var2 = (v57) obj4;
                byte b8 = this.f23812v;
                if (b8 == 0) {
                    v11.m20244z(obj);
                    m6b m6bVar = v57Var2.f43776v;
                    this.f23812v = (byte) 1;
                    n6b n6bVar = (n6b) m6bVar;
                    n6bVar.getClass();
                    try {
                        tdaVar = n6bVar.f27714b;
                        break;
                    } catch (Exception e4) {
                        tdaVar = new tda(e4);
                        break;
                    }
                } else {
                    if (b8 != 1) {
                        if (b8 != 2) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tdaVar = this.f23813w;
                        v11.m20244z(obj);
                        m19582a = uda.m19582a(tdaVar);
                        if (m19582a != null) {
                            return obj3;
                        }
                        sx7 sx7Var8 = sx7.f39332a;
                        pr1.m15991y("Error getting theme: ", m19582a.getMessage(), null, null, 6);
                        return obj3;
                    }
                    v11.m20244z(obj);
                    tdaVar = ((uda) obj).f42208u;
                }
                if (!(tdaVar instanceof tda)) {
                    u57 u57Var = new u57(v57Var2, null);
                    this.f23813w = tdaVar;
                    this.f23812v = (byte) 2;
                    break;
                }
                m19582a = uda.m19582a(tdaVar);
                if (m19582a != null) {
                }
            case 5:
                j4b j4bVar = (j4b) obj4;
                a9b a9bVar = (a9b) this.f23813w;
                byte b9 = this.f23812v;
                try {
                } catch (Exception e5) {
                    e5.getMessage();
                    if (!a9bVar.m250d(j4bVar)) {
                        return obj3;
                    }
                    o4b m21885a = a9bVar.f498b.m21885a(j4bVar.f19646a);
                    a9bVar.f504h = j4b.m10862a(j4bVar, m21885a, null, null, 4);
                    w4b w4bVar = a9bVar.f499c;
                    j4bVar = muc.m13765a(w4bVar.f45699e);
                    jzd.m11709o(j4bVar, null, null, new u4b(w4bVar, m21885a, null), 3);
                    String str6 = m21885a.f29541a;
                    this.f23812v = (byte) 2;
                    if (a9bVar.m251e(str6, y8b.f49918v, this) != obj5) {
                        return obj3;
                    }
                    obj3 = obj5;
                }
                if (b9 == 0) {
                    v11.m20244z(obj);
                    zl2 zl2Var = a9bVar.f501e;
                    C0927vd c0927vd = new C0927vd(a9bVar, xa2Var, b2);
                    this.f23812v = (byte) 1;
                    if (zl2Var.mo8623a(c0927vd, this) != obj5) {
                        obj3 = obj5;
                    }
                    obj3 = obj5;
                } else {
                    if (b9 != 1) {
                        if (b9 == 2) {
                            v11.m20244z(obj);
                            return obj3;
                        }
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v11.m20244z(obj);
                }
                return obj3;
            case 6:
                d4b d4bVar = (d4b) obj4;
                byte b10 = this.f23812v;
                if (b10 == 0) {
                    v11.m20244z(obj);
                    if (((AtomicInteger) ((gha) d4bVar.f7326y).f14216v).get() <= 0) {
                        C0917v3.m20303j("Check failed.");
                    }
                    nld.m14307l(((qa2) d4bVar.f7323v).f34191u);
                    c0853td = (C0853td) d4bVar.f7324w;
                    h11 h11Var = (h11) d4bVar.f7325x;
                    this.f23813w = c0853td;
                    this.f23812v = (byte) 1;
                    obj2 = h11Var.mo9073j(this);
                } else if (b10 == 1) {
                    c0853td = (C0853td) this.f23813w;
                    v11.m20244z(obj);
                    obj2 = obj;
                    this.f23813w = null;
                    this.f23812v = (byte) 2;
                    break;
                } else if (b10 == 2) {
                    v11.m20244z(obj);
                    if (((AtomicInteger) ((gha) d4bVar.f7326y).f14216v).decrementAndGet() == 0) {
                        return obj3;
                    }
                    nld.m14307l(((qa2) d4bVar.f7323v).f34191u);
                    c0853td = (C0853td) d4bVar.f7324w;
                    h11 h11Var2 = (h11) d4bVar.f7325x;
                    this.f23813w = c0853td;
                    this.f23812v = (byte) 1;
                    obj2 = h11Var2.mo9073j(this);
                    break;
                } else {
                    C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                byte b11 = this.f23812v;
                try {
                    if (b11 == 0) {
                        v11.m20244z(obj);
                        rncVar = (rnc) this.f23813w;
                        this.f23813w = rncVar;
                        this.f23812v = (byte) 1;
                        mo14564a = rncVar.mo14564a(this);
                        if (mo14564a == obj5) {
                            return obj5;
                        }
                    } else {
                        if (b11 != 1) {
                            if (b11 != 2) {
                                C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            v11.m20244z(obj);
                            mo14565d = obj;
                            return (Set) mo14565d;
                        }
                        rncVar = (rnc) this.f23813w;
                        v11.m20244z(obj);
                        mo14564a = obj;
                    }
                    if (!((Boolean) mo14564a).booleanValue()) {
                        qnc qncVar = qnc.f35060v;
                        C0853td c0853td2 = new C0853td((mqc) obj4, xa2Var, (byte) 21);
                        this.f23813w = null;
                        this.f23812v = (byte) 2;
                        mo14565d = rncVar.mo14565d(qncVar, c0853td2, this);
                        if (mo14565d == obj5) {
                            return obj5;
                        }
                        return (Set) mo14565d;
                    }
                } catch (SQLException unused) {
                }
                return ep3.f10423u;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l74(Object obj, xa2 xa2Var, byte b) {
        super(2, xa2Var);
        this.f23811u = b;
        this.f23814x = obj;
    }
}
