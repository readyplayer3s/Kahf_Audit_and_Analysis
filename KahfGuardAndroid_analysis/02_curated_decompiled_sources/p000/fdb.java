package p000;

import com.kahf.dns.p015di.PlatformModule_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class fdb {

    /* renamed from: a */
    public final fcb f11723a;

    /* renamed from: b */
    public final xcb f11724b;

    /* renamed from: c */
    public final ifc f11725c;

    public fdb(fcb fcbVar, xcb xcbVar, zd8 zd8Var, ifc ifcVar) {
        fcbVar.getClass();
        xcbVar.getClass();
        this.f11723a = fcbVar;
        this.f11724b = xcbVar;
        this.f11725c = ifcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0091, code lost:
    
        if (r3 == r15) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.String, java.util.Iterator, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0145 -> B:33:0x0148). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m7915a(String str, za2 za2Var) {
        edb edbVar;
        int i;
        String str2;
        String str3;
        String platformModule$lambda$0$30$0;
        List list;
        String str4;
        Collection arrayList;
        Iterator it;
        m2d m2dVar;
        List list2;
        xr1 xr1Var;
        String str5;
        List list3;
        Collection collection;
        List list4;
        edb edbVar2;
        Collection collection2;
        Iterator it2;
        m2d m2dVar2;
        ddb ddbVar;
        int ordinal;
        ?? r4;
        Iterator it3;
        if (za2Var instanceof edb) {
            edbVar = (edb) za2Var;
            int i2 = edbVar.f9792D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                edbVar.f9792D = i2 - Integer.MIN_VALUE;
                Object obj = edbVar.f9790B;
                i = edbVar.f9792D;
                m2d m2dVar3 = m2d.f25510u;
                xcb xcbVar = this.f11724b;
                fcb fcbVar = this.f11723a;
                boolean z = true;
                xa2 xa2Var = null;
                qc2 qc2Var = qc2.f34309u;
                switch (i) {
                    case 0:
                        v11.m20244z(obj);
                        str2 = str;
                        edbVar.f9793u = str2;
                        edbVar.f9792D = 1;
                        Object m11694F = jzd.m11694F(xcbVar.f48140c, new C0482jc(xcbVar, xa2Var, (byte) 11), edbVar);
                        if (m11694F != qc2Var) {
                            m11694F = txc.f41359a;
                            break;
                        }
                        break;
                    case 1:
                        String str6 = edbVar.f9793u;
                        v11.m20244z(obj);
                        str2 = str6;
                        edbVar.f9793u = str2;
                        edbVar.f9792D = 2;
                        Object m11694F2 = jzd.m11694F(xcbVar.f48140c, new uca(xcbVar, str2, xa2Var, (byte) 9), edbVar);
                        if (m11694F2 != qc2Var) {
                            str3 = str2;
                            obj = m11694F2;
                            if (((Boolean) obj).booleanValue()) {
                                return m2dVar3;
                            }
                            platformModule$lambda$0$30$0 = PlatformModule_androidKt.platformModule$lambda$0$30$0();
                            platformModule$lambda$0$30$0.getClass();
                            iv6 m8919a = gv6.m8919a(iv6.Companion, platformModule$lambda$0$30$0);
                            dp2.Companion.getClass();
                            String iv6Var = u6d.m19383r(m8919a, 34, dp2.f8498c).toString();
                            edbVar.f9793u = str3;
                            edbVar.f9792D = 3;
                            Object m14552x = nud.m14552x(edbVar, ((hcb) fcbVar).f15982a, true, false, new C0486jg(iv6Var, (byte) 22));
                            if (m14552x != qc2Var) {
                                obj = m14552x;
                                list = (List) obj;
                                if (!list.isEmpty()) {
                                    return m2dVar3;
                                }
                                str4 = str3;
                                arrayList = new ArrayList(qs1.m16870Y(list, 10));
                                it = list.iterator();
                                if (it.hasNext()) {
                                    icb icbVar = (icb) it.next();
                                    xr1Var = xr1.f48903E;
                                    str5 = icbVar.f18049a;
                                    edbVar.f9793u = str4;
                                    edbVar.f9794v = list;
                                    edbVar.f9795w = arrayList;
                                    edbVar.f9796x = it;
                                    edbVar.f9797y = str5;
                                    edbVar.f9798z = xr1Var;
                                    edbVar.f9789A = arrayList;
                                    edbVar.f9792D = 4;
                                    Object m14552x2 = nud.m14552x(edbVar, ((hcb) fcbVar).f15982a, z, false, new C0486jg(str5, (byte) 23));
                                    if (m14552x2 != qc2Var) {
                                        list3 = list;
                                        obj = m14552x2;
                                        collection = arrayList;
                                        list4 = (List) obj;
                                        xr1Var.getClass();
                                        str5.getClass();
                                        list4.getClass();
                                        if (list4.size() > 2000) {
                                            ArrayList arrayList2 = new ArrayList(qs1.m16870Y(list4, 10));
                                            Iterator it4 = list4.iterator();
                                            while (it4.hasNext()) {
                                                lcb lcbVar = (lcb) it4.next();
                                                arrayList2.add(new ycb(lcbVar.f24128b, lcbVar.f24130d, lcbVar.f24131e, (int) (lcbVar.f24132f / 1000), lcbVar.f24129c));
                                                it4 = it4;
                                                edbVar = edbVar;
                                            }
                                            edbVar2 = edbVar;
                                            ddbVar = new ddb(str5, arrayList2);
                                            collection2 = collection;
                                            it2 = it;
                                            m2dVar2 = m2dVar3;
                                        } else {
                                            edbVar2 = edbVar;
                                            ArrayList arrayList3 = new ArrayList();
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Object obj2 : list4) {
                                                if (zy5.m23838d(((lcb) obj2).f24129c, "*")) {
                                                    arrayList3.add(obj2);
                                                } else {
                                                    arrayList4.add(obj2);
                                                }
                                            }
                                            List m16015N0 = ps1.m16015N0(arrayList4, new u70(new u70(new u70(new u70(new m8a((byte) 6), (byte) 6), (byte) 7), (byte) 4), (byte) 5));
                                            List m16017P0 = ps1.m16017P0(m16015N0, 1976);
                                            ArrayList m16006E0 = ps1.m16006E0(ps1.m16033k0(m16015N0, 1976), arrayList3);
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it5 = m16006E0.iterator();
                                            while (it5.hasNext()) {
                                                Object next = it5.next();
                                                Integer valueOf = Integer.valueOf(((lcb) next).f24128b);
                                                Object obj3 = linkedHashMap.get(valueOf);
                                                if (obj3 == null) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    linkedHashMap.put(valueOf, arrayList5);
                                                    obj3 = arrayList5;
                                                }
                                                ((List) obj3).add(next);
                                            }
                                            ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                int intValue = ((Number) entry.getKey()).intValue();
                                                List list5 = (List) entry.getValue();
                                                Iterator it6 = list5.iterator();
                                                int i3 = 0;
                                                while (it6.hasNext()) {
                                                    i3 += ((lcb) it6.next()).f24130d;
                                                }
                                                Iterator it7 = list5.iterator();
                                                int i4 = 0;
                                                while (it7.hasNext()) {
                                                    i4 += ((lcb) it7.next()).f24131e;
                                                }
                                                Iterator it8 = list5.iterator();
                                                long j = 0;
                                                while (it8.hasNext()) {
                                                    j += ((lcb) it8.next()).f24132f;
                                                    collection = collection;
                                                    str5 = str5;
                                                }
                                                arrayList6.add(new lcb(intValue, i3, i4, j, str5, "*"));
                                                collection = collection;
                                            }
                                            collection2 = collection;
                                            ArrayList m16006E02 = ps1.m16006E0(m16017P0, ps1.m16015N0(arrayList6, new m8a((byte) 7)));
                                            ArrayList arrayList7 = new ArrayList(qs1.m16870Y(m16006E02, 10));
                                            Iterator it9 = m16006E02.iterator();
                                            while (it9.hasNext()) {
                                                lcb lcbVar2 = (lcb) it9.next();
                                                arrayList7.add(new ycb(lcbVar2.f24128b, lcbVar2.f24130d, lcbVar2.f24131e, (int) (lcbVar2.f24132f / 1000), lcbVar2.f24129c));
                                                it9 = it9;
                                                m2dVar3 = m2dVar3;
                                                it = it;
                                            }
                                            it2 = it;
                                            m2dVar2 = m2dVar3;
                                            ddbVar = new ddb(str5, arrayList7);
                                        }
                                        arrayList.add(ddbVar);
                                        list = list3;
                                        arrayList = collection2;
                                        m2dVar3 = m2dVar2;
                                        it = it2;
                                        edbVar = edbVar2;
                                        z = true;
                                        if (it.hasNext()) {
                                            m2dVar = m2dVar3;
                                            edbVar.f9793u = null;
                                            edbVar.f9794v = list;
                                            edbVar.f9795w = null;
                                            edbVar.f9796x = null;
                                            edbVar.f9797y = null;
                                            edbVar.f9798z = null;
                                            edbVar.f9789A = null;
                                            edbVar.f9792D = 5;
                                            Enum m10299K = this.f11725c.m10299K(edbVar, str4, (List) arrayList);
                                            if (m10299K != qc2Var) {
                                                List list6 = list;
                                                obj = m10299K;
                                                list2 = list6;
                                                ordinal = ((zcb) obj).ordinal();
                                                if (ordinal == 0) {
                                                    if (ordinal == 1) {
                                                        return m2d.f25512w;
                                                    }
                                                    if (ordinal == 2) {
                                                        return m2dVar;
                                                    }
                                                    gpc.m8801a();
                                                    return null;
                                                }
                                                r4 = 0;
                                                it3 = list2.iterator();
                                                while (it3.hasNext()) {
                                                    icb icbVar2 = (icb) it3.next();
                                                    String str7 = icbVar2.f18049a;
                                                    long j2 = icbVar2.f18050b;
                                                    edbVar.f9793u = r4;
                                                    edbVar.f9794v = r4;
                                                    edbVar.f9795w = it3;
                                                    edbVar.f9796x = r4;
                                                    edbVar.f9792D = 6;
                                                    if (nud.m14552x(edbVar, ((hcb) fcbVar).f15982a, false, true, new z45((byte) 5, j2, str7)) == qc2Var) {
                                                    }
                                                }
                                                return m2d.f25511v;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return qc2Var;
                    case 2:
                        str3 = edbVar.f9793u;
                        v11.m20244z(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        str3 = edbVar.f9793u;
                        v11.m20244z(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                        }
                        break;
                    case 4:
                        arrayList = edbVar.f9789A;
                        xr1Var = edbVar.f9798z;
                        str5 = edbVar.f9797y;
                        it = edbVar.f9796x;
                        collection = (Collection) edbVar.f9795w;
                        list3 = edbVar.f9794v;
                        str4 = edbVar.f9793u;
                        v11.m20244z(obj);
                        list4 = (List) obj;
                        xr1Var.getClass();
                        str5.getClass();
                        list4.getClass();
                        if (list4.size() > 2000) {
                        }
                        arrayList.add(ddbVar);
                        list = list3;
                        arrayList = collection2;
                        m2dVar3 = m2dVar2;
                        it = it2;
                        edbVar = edbVar2;
                        z = true;
                        if (it.hasNext()) {
                        }
                        return qc2Var;
                    case 5:
                        list2 = edbVar.f9794v;
                        v11.m20244z(obj);
                        m2dVar = m2dVar3;
                        ordinal = ((zcb) obj).ordinal();
                        if (ordinal == 0) {
                        }
                        break;
                    case 6:
                        it3 = (Iterator) edbVar.f9795w;
                        v11.m20244z(obj);
                        r4 = 0;
                        while (it3.hasNext()) {
                        }
                        return m2d.f25511v;
                    default:
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        edbVar = new edb(this, za2Var);
        Object obj4 = edbVar.f9790B;
        i = edbVar.f9792D;
        m2d m2dVar32 = m2d.f25510u;
        xcb xcbVar2 = this.f11724b;
        fcb fcbVar2 = this.f11723a;
        boolean z2 = true;
        xa2 xa2Var2 = null;
        qc2 qc2Var2 = qc2.f34309u;
        switch (i) {
        }
    }
}
