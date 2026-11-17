package p000;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p003ui.platform.AndroidViewsHandler;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import java.nio.charset.Charset;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public abstract class gd7 {

    /* renamed from: a */
    public static in5 f13936a = null;

    /* renamed from: b */
    public static in5 f13937b = null;

    /* renamed from: c */
    public static in5 f13938c = null;

    /* renamed from: d */
    public static long f13939d = 3000;

    /* renamed from: e */
    public static long f13940e = 30000;

    /* renamed from: f */
    public static int f13941f = 3;

    /* renamed from: g */
    public static volatile boolean f13942g = true;

    /* renamed from: A */
    public static int m8524A(dk6 dk6Var, l17 l17Var, sc7 sc7Var, int i) {
        return dk6Var.mo6386d(new gz5(l17Var, l17Var.getLayoutDirection()), new ct2(sc7Var, ed7.f9776u, fd7.f11715v, (byte) 1), p72.m15563b(0, i, 0, 0, 13)).getHeight();
    }

    /* renamed from: B */
    public static int m8525B(dk6 dk6Var, l17 l17Var, sc7 sc7Var, int i) {
        return dk6Var.mo6386d(new gz5(l17Var, l17Var.getLayoutDirection()), new ct2(sc7Var, ed7.f9776u, fd7.f11714u, (byte) 1), p72.m15563b(0, 0, 0, i, 7)).getWidth();
    }

    /* renamed from: C */
    public static final long m8526C(f79 f79Var) {
        return m8528E(f79Var, false);
    }

    /* renamed from: D */
    public static final long m8527D(f79 f79Var) {
        return m8528E(f79Var, true);
    }

    /* renamed from: E */
    public static final long m8528E(f79 f79Var, boolean z) {
        long m9275f = ha8.m9275f(f79Var.f11261c, f79Var.f11265g);
        if (z || !f79Var.m7718l()) {
            return m9275f;
        }
        return 0L;
    }

    /* renamed from: F */
    public static final boolean m8529F(f79 f79Var) {
        return !ha8.m9272c(m8528E(f79Var, true), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m8530G(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text;
        int length;
        String m8571v;
        int length2;
        String m8571v2;
        accessibilityNodeInfo.getClass();
        h90 m16875a = qs9.m16875a();
        m16875a.addLast(accessibilityNodeInfo);
        ArrayList arrayList = null;
        List list = null;
        int i = 0;
        while (!m16875a.isEmpty() && i < 100) {
            try {
                AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                if (accessibilityNodeInfo2.isVisibleToUser()) {
                    i++;
                    String viewIdResourceName = accessibilityNodeInfo2.getViewIdResourceName();
                    if (zy5.m23838d(viewIdResourceName, "io.kahf.browser:id/kahf_guard_url_beacon")) {
                        String string = accessibilityNodeInfo2.getExtras().getString("io.kahf.browser.extra.CURRENT_HOST");
                        if (string != null && !stb.m18260Z0(string) && 3 <= (length2 = string.length()) && length2 < 301) {
                            m8571v2 = m8571v(string);
                            if (m8571v2 != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList(1);
                                }
                                ArrayList arrayList2 = arrayList;
                                arrayList.add(new d3d(m8571v2, false));
                                arrayList = arrayList2;
                            }
                        }
                        m8571v2 = null;
                        if (m8571v2 != null) {
                        }
                    } else if (a13.f55e.contains(viewIdResourceName) && (text = accessibilityNodeInfo2.getText()) != null && !stb.m18260Z0(text) && 3 <= (length = text.length()) && length < 301 && (m8571v = m8571v(text)) != null) {
                        if (list == null) {
                            list = new ArrayList(2);
                        }
                        list.add(new d3d(m8571v, accessibilityNodeInfo2.isFocused()));
                        list = list;
                    }
                    int childCount = accessibilityNodeInfo2.getChildCount();
                    if (childCount > 0) {
                        int min = Math.min(childCount, 10);
                        for (int i2 = 0; i2 < min; i2++) {
                            AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i2);
                            if (child != null) {
                                m16875a.addLast(child);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                m16875a.clear();
                throw th;
            }
        }
        if (arrayList == null) {
            if (list == null) {
                list = xo3.f48775u;
            }
            m16875a.clear();
            return list;
        }
        if (list != null) {
            arrayList = ps1.m16006E0(arrayList, list);
        }
        m16875a.clear();
        return arrayList;
    }

    /* renamed from: H */
    public static int m8531H(ea1 ea1Var, int i, int i2, int i3) {
        sy0.m18386U(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (ea1Var.m7007b() < i) {
            return -1;
        }
        int m7012g = ea1Var.m7012g(i);
        if (m7012g == i4) {
            if (ea1Var.m7007b() < i2) {
                return -1;
            }
            int m7012g2 = ea1Var.m7012g(i2);
            m7012g += m7012g2;
            if (m7012g2 == i5) {
                if (ea1Var.m7007b() < i3) {
                    return -1;
                }
                return ea1Var.m7012g(i3) + m7012g;
            }
        }
        return m7012g;
    }

    /* renamed from: J */
    public static mm8 m8533J(km8 km8Var, rl8 rl8Var) {
        km8Var.getClass();
        boolean equals = km8Var.equals(gm8.f14404a);
        dl8 dl8Var = dl8.f8305a;
        kl8 kl8Var = kl8.f22588a;
        dm8 dm8Var = dm8.f8341a;
        if (equals) {
            if (!(rl8Var instanceof ml8)) {
                return rl8Var.equals(kl8Var) ? new mm8(dm8Var, dl8Var) : new mm8(km8Var, null);
            }
            qm8 qm8Var = ((ml8) rl8Var).f26638a;
            return new mm8(new im8(qm8Var), new fl8(qm8Var));
        }
        if (km8Var instanceof im8) {
            if (rl8Var instanceof ol8) {
                return new mm8(new em8(((im8) km8Var).f18493a, ((ol8) rl8Var).f30754a), null);
            }
            if (!(rl8Var instanceof nl8)) {
                return rl8Var.equals(kl8Var) ? new mm8(dm8Var, dl8Var) : new mm8(km8Var, null);
            }
            jl8 jl8Var = ((nl8) rl8Var).f28466a;
            return new mm8(new hm8(jl8Var), new hl8(jl8Var));
        }
        if (km8Var instanceof em8) {
            if (!(rl8Var instanceof ll8)) {
                return rl8Var.equals(kl8Var) ? new mm8(dm8Var, dl8Var) : new mm8(km8Var, null);
            }
            qm8 qm8Var2 = ((em8) km8Var).f10243a;
            x09 x09Var = ((ll8) rl8Var).f24581a;
            return new mm8(new jm8(qm8Var2, x09Var), new gl8(qm8Var2, x09Var));
        }
        boolean z = km8Var instanceof jm8;
        fm8 fm8Var = fm8.f12277a;
        if (z) {
            if (rl8Var.equals(ql8.f34969a)) {
                return new mm8(fm8Var, el8.f10197a);
            }
            if (!(rl8Var instanceof pl8)) {
                return new mm8(km8Var, null);
            }
            jl8 jl8Var2 = ((pl8) rl8Var).f32829a;
            return new mm8(new hm8(jl8Var2), new hl8(jl8Var2));
        }
        if (km8Var.equals(fm8Var) || km8Var.equals(dm8Var) || (km8Var instanceof hm8)) {
            return new mm8(km8Var, null);
        }
        gpc.m8801a();
        return null;
    }

    /* renamed from: K */
    public static final AndroidViewHolder m8534K(AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qk6) ((Map.Entry) obj).getKey()).f34866v == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* renamed from: L */
    public static final boolean m8535L(String str, String str2) {
        str2.getClass();
        return !str.equals(str2);
    }

    /* renamed from: M */
    public static void m8536M(ea1 ea1Var) {
        ea1Var.m7020o(3);
        ea1Var.m7020o(8);
        boolean m7011f = ea1Var.m7011f();
        boolean m7011f2 = ea1Var.m7011f();
        if (m7011f) {
            ea1Var.m7020o(5);
        }
        if (m7011f2) {
            ea1Var.m7020o(6);
        }
    }

    /* renamed from: N */
    public static void m8537N(ea1 ea1Var) {
        int m7012g;
        int m7012g2 = ea1Var.m7012g(2);
        if (m7012g2 == 0) {
            ea1Var.m7020o(6);
            return;
        }
        int m8531H = m8531H(ea1Var, 5, 8, 16) + 1;
        if (m7012g2 == 1) {
            ea1Var.m7020o(m8531H * 7);
            return;
        }
        if (m7012g2 == 2) {
            boolean m7011f = ea1Var.m7011f();
            int i = m7011f ? 1 : 5;
            int i2 = m7011f ? 7 : 5;
            int i3 = m7011f ? 8 : 6;
            int i4 = 0;
            while (i4 < m8531H) {
                if (ea1Var.m7011f()) {
                    ea1Var.m7020o(7);
                    m7012g = 0;
                } else {
                    if (ea1Var.m7012g(2) == 3 && ea1Var.m7012g(i2) * i != 0) {
                        ea1Var.m7019n();
                    }
                    m7012g = ea1Var.m7012g(i3) * i;
                    if (m7012g != 0 && m7012g != 180) {
                        ea1Var.m7019n();
                    }
                    ea1Var.m7019n();
                }
                if (m7012g != 0 && m7012g != 180 && ea1Var.m7011f()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* renamed from: O */
    public static final byte[] m8538O(String str, Charset charset) {
        return qd7.m16522x(str, charset);
    }

    /* renamed from: P */
    public static final ow0 m8539P(pw0 pw0Var) {
        pw0Var.getClass();
        int ordinal = pw0Var.ordinal();
        if (ordinal == 0) {
            return ow0.f31337v;
        }
        if (ordinal == 1) {
            return ow0.f31338w;
        }
        if (ordinal == 2) {
            return ow0.f31339x;
        }
        if (ordinal == 3) {
            return ow0.f31338w;
        }
        gpc.m8801a();
        return null;
    }

    /* renamed from: Q */
    public static final jp2 m8540Q(lp2 lp2Var) {
        lp2Var.getClass();
        switch (lp2Var.ordinal()) {
            case 0:
                return jp2.f20905v;
            case 1:
                return jp2.f20906w;
            case 2:
                return jp2.f20907x;
            case 3:
                return jp2.f20908y;
            case 4:
                return jp2.f20909z;
            case 5:
                return jp2.f20901A;
            case 6:
                return jp2.f20902B;
            case 7:
                return jp2.f20906w;
            default:
                gpc.m8801a();
                return null;
        }
    }

    /* renamed from: R */
    public static final u9a m8541R(v9a v9aVar) {
        int ordinal = v9aVar.ordinal();
        if (ordinal == 0) {
            return u9a.f42035v;
        }
        if (ordinal == 1) {
            return u9a.f42036w;
        }
        if (ordinal == 2) {
            return u9a.f42037x;
        }
        if (ordinal == 3) {
            return u9a.f42035v;
        }
        gpc.m8801a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public static final z9a m8542S(C0053ba c0053ba) {
        xo3 xo3Var;
        String str;
        String str2;
        ArrayList arrayList;
        char c;
        xo3 xo3Var2;
        int i;
        xo3 xo3Var3;
        ArrayList arrayList2;
        String str3 = c0053ba.f2909a;
        String str4 = c0053ba.f2910b;
        Boolean bool = c0053ba.f2911c;
        int i2 = c0053ba.f2912d;
        List<C1071z9> list = c0053ba.f2913e;
        xo3 xo3Var4 = xo3.f48775u;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(qs1.m16870Y(list, 10));
            for (C1071z9 c1071z9 : list) {
                arrayList3.add(new laa(c1071z9.f51974a, c1071z9.f51975b));
            }
            xo3Var = arrayList3;
        } else {
            xo3Var = xo3Var4;
        }
        ArrayList arrayList4 = c0053ba.f2914f;
        ArrayList arrayList5 = new ArrayList(qs1.m16870Y(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            C0011aa c0011aa = (C0011aa) it.next();
            c0011aa.getClass();
            String str5 = c0011aa.f514a;
            u9a m8541R = m8541R(c0011aa.f515b);
            String str6 = c0011aa.f516c;
            pw0 pw0Var = c0011aa.f517d;
            ow0 m8539P = pw0Var != null ? m8539P(pw0Var) : null;
            Object obj = c0011aa.f518e;
            String obj2 = obj != null ? obj.toString() : null;
            Integer num = c0011aa.f519f;
            List list2 = c0011aa.f520g;
            Iterator it2 = it;
            if (list2 != null) {
                str = str3;
                str2 = str4;
                ArrayList arrayList6 = new ArrayList(qs1.m16870Y(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C0089ca c0089ca = (C0089ca) it3.next();
                    c0089ca.getClass();
                    String str7 = c0089ca.f4691a;
                    Iterator it4 = it3;
                    Object obj3 = c0089ca.f4692b;
                    String obj4 = obj3 != null ? obj3.toString() : null;
                    Object obj5 = c0089ca.f4693c;
                    String obj6 = obj5 != null ? obj5.toString() : null;
                    List list3 = c0089ca.f4694d;
                    Boolean bool2 = bool;
                    if (list3 != null) {
                        i = i2;
                        xo3Var3 = xo3Var;
                        ArrayList arrayList7 = new ArrayList(qs1.m16870Y(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(m8540Q((lp2) it5.next()));
                        }
                        arrayList2 = arrayList7;
                    } else {
                        i = i2;
                        xo3Var3 = xo3Var;
                        arrayList2 = null;
                    }
                    arrayList6.add(new zv0(str7, obj4, obj6, arrayList2, c0089ca.f4695e));
                    it3 = it4;
                    bool = bool2;
                    i2 = i;
                    xo3Var = xo3Var3;
                }
                arrayList = arrayList6;
            } else {
                str = str3;
                str2 = str4;
                arrayList = null;
            }
            Boolean bool3 = bool;
            int i3 = i2;
            xo3 xo3Var5 = xo3Var;
            List<C1034y9> list4 = c0011aa.f521h;
            if (list4 != null) {
                c = '\n';
                ArrayList arrayList8 = new ArrayList(qs1.m16870Y(list4, 10));
                for (C1034y9 c1034y9 : list4) {
                    arrayList8.add(new laa(c1034y9.f49937a, c1034y9.f49938b));
                }
                xo3Var2 = arrayList8;
            } else {
                c = '\n';
                xo3Var2 = xo3Var4;
            }
            arrayList5.add(new o9a(str5, m8541R, str6, m8539P, obj2, num, arrayList, xo3Var2));
            it = it2;
            str3 = str;
            str4 = str2;
            bool = bool3;
            i2 = i3;
            xo3Var = xo3Var5;
        }
        return new z9a(str3, str4, bool, i2, xo3Var, arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public static final z9a m8543T(cr4 cr4Var) {
        xo3 xo3Var;
        String str;
        String str2;
        ArrayList arrayList;
        char c;
        xo3 xo3Var2;
        int i;
        xo3 xo3Var3;
        ArrayList arrayList2;
        String str3 = cr4Var.f6616a;
        String str4 = cr4Var.f6617b;
        Boolean bool = cr4Var.f6618c;
        int i2 = cr4Var.f6619d;
        List<ar4> list = cr4Var.f6620e;
        xo3 xo3Var4 = xo3.f48775u;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(qs1.m16870Y(list, 10));
            for (ar4 ar4Var : list) {
                arrayList3.add(new laa(ar4Var.f2036a, ar4Var.f2037b));
            }
            xo3Var = arrayList3;
        } else {
            xo3Var = xo3Var4;
        }
        ArrayList arrayList4 = cr4Var.f6621f;
        ArrayList arrayList5 = new ArrayList(qs1.m16870Y(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            br4 br4Var = (br4) it.next();
            br4Var.getClass();
            String str5 = br4Var.f3822a;
            u9a m8541R = m8541R(br4Var.f3823b);
            String str6 = br4Var.f3824c;
            pw0 pw0Var = br4Var.f3825d;
            ow0 m8539P = pw0Var != null ? m8539P(pw0Var) : null;
            Object obj = br4Var.f3826e;
            String obj2 = obj != null ? obj.toString() : null;
            Integer num = br4Var.f3827f;
            List list2 = br4Var.f3828g;
            Iterator it2 = it;
            if (list2 != null) {
                str = str3;
                str2 = str4;
                ArrayList arrayList6 = new ArrayList(qs1.m16870Y(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    dr4 dr4Var = (dr4) it3.next();
                    dr4Var.getClass();
                    String str7 = dr4Var.f8583a;
                    Iterator it4 = it3;
                    Object obj3 = dr4Var.f8584b;
                    String obj4 = obj3 != null ? obj3.toString() : null;
                    Object obj5 = dr4Var.f8585c;
                    String obj6 = obj5 != null ? obj5.toString() : null;
                    List list3 = dr4Var.f8586d;
                    Boolean bool2 = bool;
                    if (list3 != null) {
                        i = i2;
                        xo3Var3 = xo3Var;
                        ArrayList arrayList7 = new ArrayList(qs1.m16870Y(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(m8540Q((lp2) it5.next()));
                        }
                        arrayList2 = arrayList7;
                    } else {
                        i = i2;
                        xo3Var3 = xo3Var;
                        arrayList2 = null;
                    }
                    arrayList6.add(new zv0(str7, obj4, obj6, arrayList2, dr4Var.f8587e));
                    it3 = it4;
                    bool = bool2;
                    i2 = i;
                    xo3Var = xo3Var3;
                }
                arrayList = arrayList6;
            } else {
                str = str3;
                str2 = str4;
                arrayList = null;
            }
            Boolean bool3 = bool;
            int i3 = i2;
            xo3 xo3Var5 = xo3Var;
            List<zq4> list4 = br4Var.f3829h;
            if (list4 != null) {
                c = '\n';
                ArrayList arrayList8 = new ArrayList(qs1.m16870Y(list4, 10));
                for (zq4 zq4Var : list4) {
                    arrayList8.add(new laa(zq4Var.f52886a, zq4Var.f52887b));
                }
                xo3Var2 = arrayList8;
            } else {
                c = '\n';
                xo3Var2 = xo3Var4;
            }
            arrayList5.add(new o9a(str5, m8541R, str6, m8539P, obj2, num, arrayList, xo3Var2));
            it = it2;
            str3 = str;
            str4 = str2;
            bool = bool3;
            i2 = i3;
            xo3Var = xo3Var5;
        }
        return new z9a(str3, str4, bool, i2, xo3Var, arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U */
    public static final z9a m8544U(q1d q1dVar) {
        xo3 xo3Var;
        String str;
        String str2;
        ArrayList arrayList;
        char c;
        xo3 xo3Var2;
        int i;
        xo3 xo3Var3;
        ArrayList arrayList2;
        String str3 = q1dVar.f33746a;
        String str4 = q1dVar.f33747b;
        Boolean bool = q1dVar.f33748c;
        int i2 = q1dVar.f33749d;
        List<o1d> list = q1dVar.f33750e;
        xo3 xo3Var4 = xo3.f48775u;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(qs1.m16870Y(list, 10));
            for (o1d o1dVar : list) {
                arrayList3.add(new laa(o1dVar.f29371a, o1dVar.f29372b));
            }
            xo3Var = arrayList3;
        } else {
            xo3Var = xo3Var4;
        }
        ArrayList arrayList4 = q1dVar.f33751f;
        ArrayList arrayList5 = new ArrayList(qs1.m16870Y(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            p1d p1dVar = (p1d) it.next();
            p1dVar.getClass();
            String str5 = p1dVar.f31640a;
            u9a m8541R = m8541R(p1dVar.f31641b);
            String str6 = p1dVar.f31642c;
            pw0 pw0Var = p1dVar.f31643d;
            ow0 m8539P = pw0Var != null ? m8539P(pw0Var) : null;
            Object obj = p1dVar.f31644e;
            String obj2 = obj != null ? obj.toString() : null;
            Integer num = p1dVar.f31645f;
            List list2 = p1dVar.f31646g;
            Iterator it2 = it;
            if (list2 != null) {
                str = str3;
                str2 = str4;
                ArrayList arrayList6 = new ArrayList(qs1.m16870Y(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    r1d r1dVar = (r1d) it3.next();
                    r1dVar.getClass();
                    String str7 = r1dVar.f35862a;
                    Iterator it4 = it3;
                    Object obj3 = r1dVar.f35863b;
                    String obj4 = obj3 != null ? obj3.toString() : null;
                    Object obj5 = r1dVar.f35864c;
                    String obj6 = obj5 != null ? obj5.toString() : null;
                    List list3 = r1dVar.f35865d;
                    Boolean bool2 = bool;
                    if (list3 != null) {
                        i = i2;
                        xo3Var3 = xo3Var;
                        ArrayList arrayList7 = new ArrayList(qs1.m16870Y(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(m8540Q((lp2) it5.next()));
                        }
                        arrayList2 = arrayList7;
                    } else {
                        i = i2;
                        xo3Var3 = xo3Var;
                        arrayList2 = null;
                    }
                    arrayList6.add(new zv0(str7, obj4, obj6, arrayList2, r1dVar.f35866e));
                    it3 = it4;
                    bool = bool2;
                    i2 = i;
                    xo3Var = xo3Var3;
                }
                arrayList = arrayList6;
            } else {
                str = str3;
                str2 = str4;
                arrayList = null;
            }
            Boolean bool3 = bool;
            int i3 = i2;
            xo3 xo3Var5 = xo3Var;
            List<n1d> list4 = p1dVar.f31647h;
            if (list4 != null) {
                c = '\n';
                ArrayList arrayList8 = new ArrayList(qs1.m16870Y(list4, 10));
                for (n1d n1dVar : list4) {
                    arrayList8.add(new laa(n1dVar.f27475a, n1dVar.f27476b));
                }
                xo3Var2 = arrayList8;
            } else {
                c = '\n';
                xo3Var2 = xo3Var4;
            }
            arrayList5.add(new o9a(str5, m8541R, str6, m8539P, obj2, num, arrayList, xo3Var2));
            it = it2;
            str3 = str;
            str4 = str2;
            bool = bool3;
            i2 = i3;
            xo3Var = xo3Var5;
        }
        return new z9a(str3, str4, bool, i2, xo3Var, arrayList5);
    }

    /* renamed from: V */
    public static final pda m8545V(aba abaVar) {
        switch (abaVar == null ? -1 : iaa.f17804a[abaVar.ordinal()]) {
            case -1:
            case 6:
                return pda.f32337z;
            case 0:
            default:
                gpc.m8801a();
                return null;
            case 1:
                return pda.f32332u;
            case 2:
                return pda.f32333v;
            case 3:
                return pda.f32334w;
            case 4:
                return pda.f32335x;
            case 5:
                return pda.f32336y;
        }
    }

    /* renamed from: W */
    public static final String m8546W(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* renamed from: X */
    public static int m8547X() {
        return f13941f;
    }

    /* renamed from: Y */
    public static long m8548Y() {
        return f13939d;
    }

    /* renamed from: Z */
    public static boolean m8549Z() {
        return f13942g;
    }

    /* renamed from: a */
    public static final void m8550a(String str, String str2, String str3, boolean z, boolean z2, tl4 tl4Var, y12 y12Var, int i) {
        tl4Var.getClass();
        mn4 mn4Var = (mn4) y12Var;
        mn4Var.m13580Y(-1745426606);
        int i2 = i | (mn4Var.m13592f(str) ? 4 : 2) | (mn4Var.m13592f(str2) ? 32 : 16) | (mn4Var.m13592f(str3) ? 256 : 128);
        if (mn4Var.m13570O(i2 & 1, (65683 & i2) != 65682)) {
            vt4.m20919g(tl4Var, null, u11.m19275b0(2142269417, new bi4(str, str2, str3, tl4Var), mn4Var), mn4Var, 390, 2);
        } else {
            mn4Var.m13573R();
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new yj3(str, str2, str3, z, z2, tl4Var, i, (byte) 1);
        }
    }

    /* renamed from: b */
    public static final void m8551b(fo7 fo7Var, wx1 wx1Var, y12 y12Var, int i) {
        mn4 mn4Var = (mn4) y12Var;
        mn4Var.m13580Y(-1854833411);
        int i2 = (mn4Var.m13592f(fo7Var) ? 4 : 2) | i;
        byte b = 1;
        if (mn4Var.m13570O(i2 & 1, (i2 & 19) != 18)) {
            Object m13568L = mn4Var.m13568L();
            if (m13568L == x12.f47437a) {
                m13568L = C1007xj.f48501e;
                mn4Var.m13595g0(m13568L);
            }
            xc7 xc7Var = (xc7) m13568L;
            int hashCode = Long.hashCode(mn4Var.f26756T);
            e09 m13603l = mn4Var.m13603l();
            fo7 m559z = af2.m559z(mn4Var, fo7Var);
            s12.f37639c.getClass();
            mn4Var.m13583a0();
            if (mn4Var.f26755S) {
                mn4Var.m13602k(qk6.f34825m0);
            } else {
                mn4Var.m13601j0();
            }
            v11.m20239s(mn4Var, wpa.f46980z, xc7Var);
            v11.m20239s(mn4Var, wpa.f46979y, m13603l);
            v11.m20239s(mn4Var, wpa.f46967A, Integer.valueOf(hashCode));
            v11.m20237q(mn4Var);
            v11.m20239s(mn4Var, wpa.f46978x, m559z);
            pr1.m15987u(6, wx1Var, mn4Var, true);
        } else {
            mn4Var.m13573R();
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new c0b(fo7Var, wx1Var, i, b);
        }
    }

    /* renamed from: e */
    public static final void m8554e(fp0 fp0Var, C0677om c0677om, C1093zv c1093zv, float f, float[] fArr, AbstractC0035at abstractC0035at, tl4 tl4Var, nu5 nu5Var) {
        c0677om.getClass();
        c1093zv.getClass();
        fArr.getClass();
        nu5Var.getClass();
        n84 n84Var = fp0Var != null ? fp0Var.f12451a : null;
        Object ws1Var = new ws1(c0677om.m15171b());
        if (n84Var != null) {
            int i = gl9.f14376a;
            ws1Var = n84Var.m13994a(c1093zv, ws1Var);
        }
        c0677om.m15177h(((ws1) ws1Var).f47058a);
        c0677om.m15174e(f);
        if (abstractC0035at != null) {
            c0677om.m15174e(u6d.m19371f(t20.m18484H(abstractC0035at, c1093zv) * c0677om.m15170a(), 0.0f, 1.0f));
        }
        c0677om.m15174e(u6d.m19371f(c0677om.m15170a(), 0.0f, 1.0f));
        c0677om.m15178i(c0677om.f30775d);
        c0677om.m15176g(c0677om.f30773b);
    }

    /* renamed from: f */
    public static final boolean m8555f(f79 f79Var) {
        return (f79Var.m7718l() || f79Var.f11266h || !f79Var.f11262d) ? false : true;
    }

    /* renamed from: g */
    public static final boolean m8556g(f79 f79Var) {
        return !f79Var.f11266h && f79Var.f11262d;
    }

    /* renamed from: h */
    public static final boolean m8557h(f79 f79Var) {
        return (f79Var.m7718l() || !f79Var.f11266h || f79Var.f11262d) ? false : true;
    }

    /* renamed from: i */
    public static final boolean m8558i(f79 f79Var) {
        return f79Var.f11266h && !f79Var.f11262d;
    }

    /* renamed from: j */
    public static iv7 m8559j() {
        return new ft8(txc.f41359a, ou9.f31288A);
    }

    /* renamed from: k */
    public static final boolean m8560k(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !zy5.m23838d(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!m8560k((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!v90.m20528F((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static final int m8561l(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? m8561l((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    /* renamed from: m */
    public static final fwa m8562m(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((fwa) arrayList.get(i2)).f13104u == i) {
                return (fwa) arrayList.get(i2);
            }
        }
        return null;
    }

    /* renamed from: n */
    public static final float m8563n(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* renamed from: o */
    public static final int[] m8564o(ncc nccVar, Layout layout, C0812s9 c0812s9, RectF rectF, int i, C0751qm c0751qm) {
        vya kx4Var;
        int i2;
        byte b = 29;
        if (i == 1) {
            kx4Var = new wg5(nccVar.f28069f.getText(), nccVar.m14147k(), b);
        } else {
            CharSequence text = nccVar.f28069f.getText();
            kx4Var = Build.VERSION.SDK_INT >= 29 ? new kx4(text, nccVar.f28064a) : new lx4(text);
        }
        vya vyaVar = kx4Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > nccVar.m14140d(lineForVertical) && (lineForVertical = lineForVertical + 1) >= nccVar.f28070g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < nccVar.m14144h(0)) {
            return null;
        }
        int m8566q = m8566q(nccVar, layout, c0812s9, i3, rectF, vyaVar, c0751qm, true);
        while (true) {
            i2 = i3;
            if (m8566q != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            m8566q = m8566q(nccVar, layout, c0812s9, i3, rectF, vyaVar, c0751qm, true);
        }
        if (m8566q == -1) {
            return null;
        }
        int m8566q2 = m8566q(nccVar, layout, c0812s9, lineForVertical2, rectF, vyaVar, c0751qm, false);
        while (m8566q2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            m8566q2 = m8566q(nccVar, layout, c0812s9, i4, rectF, vyaVar, c0751qm, false);
            lineForVertical2 = i4;
        }
        if (m8566q2 == -1) {
            return null;
        }
        return new int[]{vyaVar.mo9762k(m8566q + 1), vyaVar.mo9763l(m8566q2 - 1)};
    }

    /* renamed from: p */
    public static final Float m8565p(o1b o1bVar) {
        vl4 vl4Var;
        ArrayList arrayList = new ArrayList();
        Object m2468g = o1bVar.f29362u.m2468g(n1b.f27446C);
        if (m2468g == null) {
            m2468g = null;
        }
        C0992x4 c0992x4 = (C0992x4) m2468g;
        if (c0992x4 == null || (vl4Var = (vl4) c0992x4.f47611b) == null || !((Boolean) vl4Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    /* renamed from: q */
    public static final int m8566q(ncc nccVar, Layout layout, C0812s9 c0812s9, int i, RectF rectF, vya vyaVar, C0751qm c0751qm, boolean z) {
        yj6[] yj6VarArr;
        yj6[] yj6VarArr2;
        int i2;
        int mo9763l;
        int i3;
        int i4;
        int mo9762k;
        Bidi createLineBidi;
        boolean z2;
        float m8522a;
        float m8522a2;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = nccVar.f28069f;
        int lineStart2 = layout2.getLineStart(i);
        int m14141e = nccVar.m14141e(i);
        if (i5 < (m14141e - lineStart2) * 2) {
            cu5.m5698a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        gd5 gd5Var = new gd5(nccVar);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < m14141e) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                m8522a = gd5Var.m8522a(lineStart2, z3, z3, true);
                f = gd5Var.m8522a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = gd5Var.m8522a(lineStart2, false, false, false);
                m8522a = gd5Var.m8522a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    m8522a2 = gd5Var.m8522a(lineStart2, false, false, true);
                    m8522a = gd5Var.m8522a(lineStart2 + 1, true, true, true);
                } else {
                    m8522a = gd5Var.m8522a(lineStart2, false, false, false);
                    m8522a2 = gd5Var.m8522a(lineStart2 + 1, true, true, false);
                }
                f = m8522a2;
            }
            fArr[i6] = m8522a;
            fArr[i6 + 1] = f;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) c0812s9.f38076u;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int m17941u = c0812s9.m17941u(lineStart3, false);
        int m17942v = c0812s9.m17942v(m17941u);
        int i7 = lineStart3 - m17942v;
        int i8 = lineEnd2 - m17942v;
        Bidi m17931j = c0812s9.m17931j(m17941u);
        if (m17931j == null || (createLineBidi = m17931j.createLineBidi(i7, i8)) == null) {
            yj6VarArr = new yj6[]{new yj6(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            yj6VarArr = new yj6[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                yj6VarArr[i9] = new yj6(createLineBidi.getRunStart(i9) + lineStart3, createLineBidi.getRunLimit(i9) + lineStart3, createLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        sw5 uw5Var = z ? new uw5(0, yj6VarArr.length - 1, 1) : new sw5(yj6VarArr.length - 1, 0, -1);
        int i11 = uw5Var.f39239u;
        int i12 = uw5Var.f39240v;
        int i13 = uw5Var.f39241w;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            yj6 yj6Var = yj6VarArr[i11];
            boolean z5 = yj6Var.f50621c;
            int i14 = yj6Var.f50619a;
            int i15 = yj6Var.f50620b;
            float f2 = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
            float m8563n = z5 ? m8563n(i14, lineStart, fArr) : m8563n(i15 - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i16 = i13;
            if (z) {
                if (m8563n >= f3) {
                    float f4 = rectF.right;
                    if (f2 <= f4) {
                        if ((z5 || f3 > f2) && (!z5 || f4 < m8563n)) {
                            int i17 = i15;
                            int i18 = i14;
                            while (true) {
                                i3 = i17;
                                if (i17 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i3 + i18) / 2;
                                float f5 = fArr[(i19 - lineStart) * 2];
                                if ((z5 || f5 <= rectF.left) && (!z5 || f5 >= rectF.right)) {
                                    i17 = i3;
                                    i18 = i19;
                                } else {
                                    i17 = i19;
                                }
                            }
                            i4 = z5 ? i3 : i18;
                        } else {
                            i4 = i14;
                        }
                        int mo9763l2 = vyaVar.mo9763l(i4);
                        if (mo9763l2 != -1 && (mo9762k = vyaVar.mo9762k(mo9763l2)) < i15) {
                            if (mo9762k >= i14) {
                                i14 = mo9762k;
                            }
                            if (mo9763l2 > i15) {
                                mo9763l2 = i15;
                            }
                            yj6VarArr2 = yj6VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = mo9763l2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
                                rectF2.right = z5 ? m8563n(i14, lineStart, fArr) : m8563n(i20 - 1, lineStart, fArr);
                                if (!((Boolean) c0751qm.invoke(rectF2, rectF)).booleanValue()) {
                                    i14 = vyaVar.mo9760h(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = vyaVar.mo9763l(i14);
                                    if (i20 > i15) {
                                        i20 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i14 = -1;
                        }
                    }
                }
                yj6VarArr2 = yj6VarArr;
                i14 = -1;
            } else {
                yj6VarArr2 = yj6VarArr;
                if (m8563n >= f3) {
                    float f6 = rectF.right;
                    if (f2 <= f6) {
                        if ((z5 || f6 < m8563n) && (!z5 || f3 > f2)) {
                            int i21 = i15;
                            int i22 = i14;
                            while (i21 - i22 > 1) {
                                int i23 = (i21 + i22) / 2;
                                float f7 = fArr[(i23 - lineStart) * 2];
                                int i24 = i21;
                                if ((z5 || f7 <= rectF.right) && (!z5 || f7 >= rectF.left)) {
                                    i21 = i24;
                                    i22 = i23;
                                } else {
                                    i21 = i23;
                                }
                            }
                            i2 = z5 ? i21 : i22;
                        } else {
                            i2 = i15 - 1;
                        }
                        int mo9762k2 = vyaVar.mo9762k(i2 + 1);
                        if (mo9762k2 != -1 && (mo9763l = vyaVar.mo9763l(mo9762k2)) > i14) {
                            if (mo9762k2 < i14) {
                                mo9762k2 = i14;
                            }
                            if (mo9763l <= i15) {
                                i15 = mo9763l;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = mo9762k2;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z5 ? m8563n(i25, lineStart, fArr) : m8563n(i15 - 1, lineStart, fArr);
                                if (!((Boolean) c0751qm.invoke(rectF3, rectF)).booleanValue()) {
                                    i15 = vyaVar.mo9761j(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i25 = vyaVar.mo9762k(i15);
                                    if (i25 < i14) {
                                        i25 = i14;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i14 = i15;
            }
            if (i14 >= 0) {
                return i14;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i16;
            i13 = i16;
            yj6VarArr = yj6VarArr2;
        }
    }

    /* renamed from: r */
    public static final in5 m8567r() {
        in5 in5Var = f13936a;
        if (in5Var != null) {
            return in5Var;
        }
        hn5 hn5Var = new hn5("Rounded.TaskAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = o8d.f29868a;
        ajb ajbVar = new ajb(ws1.f47051b);
        x11 m18093d = sj8.m18093d(21.29f, 5.89f, -10.0f, 10.0f);
        m18093d.m21797h(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        m18093d.m21801l(-2.83f, -2.83f);
        m18093d.m21797h(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        m18093d.m21801l(0.0f, 0.0f);
        m18093d.m21797h(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        m18093d.m21801l(2.12f, 2.12f);
        m18093d.m21801l(9.29f, -9.29f);
        m18093d.m21797h(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        m18093d.m21801l(0.0f, 0.0f);
        m18093d.m21796g(21.68f, 4.87f, 21.68f, 5.5f, 21.29f, 5.89f);
        m18093d.m21795f();
        m18093d.m21802m(15.77f, 2.74f);
        m18093d.m21797h(-1.69f, -0.69f, -3.61f, -0.93f, -5.61f, -0.57f);
        m18093d.m21796g(6.09f, 2.9f, 2.84f, 6.18f, 2.15f, 10.25f);
        m18093d.m21796g(1.01f, 17.0f, 6.63f, 22.78f, 13.34f, 21.91f);
        m18093d.m21797h(3.96f, -0.51f, 7.28f, -3.46f, 8.32f, -7.31f);
        m18093d.m21797h(0.4f, -1.47f, 0.44f, -2.89f, 0.21f, -4.22f);
        m18093d.m21797h(-0.13f, -0.8f, -1.12f, -1.11f, -1.7f, -0.54f);
        m18093d.m21807r(0.0f);
        m18093d.m21797h(-0.23f, 0.23f, -0.33f, 0.57f, -0.27f, 0.89f);
        m18093d.m21797h(0.22f, 1.33f, 0.12f, 2.75f, -0.52f, 4.26f);
        m18093d.m21797h(-1.16f, 2.71f, -3.68f, 4.7f, -6.61f, 4.97f);
        m18093d.m21797h(-5.1f, 0.47f, -9.33f, -3.85f, -8.7f, -8.98f);
        m18093d.m21797h(0.43f, -3.54f, 3.28f, -6.42f, 6.81f, -6.91f);
        m18093d.m21797h(1.73f, -0.24f, 3.37f, 0.09f, 4.77f, 0.81f);
        m18093d.m21797h(0.39f, 0.2f, 0.86f, 0.13f, 1.17f, -0.18f);
        m18093d.m21801l(0.0f, 0.0f);
        m18093d.m21797h(0.48f, -0.48f, 0.36f, -1.29f, -0.24f, -1.6f);
        m18093d.m21796g(16.31f, 2.98f, 16.04f, 2.85f, 15.77f, 2.74f);
        m18093d.m21795f();
        hn5.m9584d(hn5Var, m18093d.f47436b, 0, ajbVar);
        in5 m9587e = hn5Var.m9587e();
        f13936a = m9587e;
        return m9587e;
    }

    /* renamed from: s */
    public static final pcc m8568s(o1b o1bVar) {
        vl4 vl4Var;
        ArrayList arrayList = new ArrayList();
        Object m2468g = o1bVar.f29362u.m2468g(n1b.f27447a);
        if (m2468g == null) {
            m2468g = null;
        }
        C0992x4 c0992x4 = (C0992x4) m2468g;
        if (c0992x4 == null || (vl4Var = (vl4) c0992x4.f47611b) == null || !((Boolean) vl4Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (pcc) arrayList.get(0);
    }

    /* renamed from: t */
    public static final in5 m8569t() {
        in5 in5Var = f13937b;
        if (in5Var != null) {
            return in5Var;
        }
        hn5 hn5Var = new hn5("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = o8d.f29868a;
        ajb ajbVar = new ajb(ws1.f47051b);
        x11 x11Var = new x11((byte) 3);
        x11Var.m21802m(8.79f, 9.24f);
        x11Var.m21806q(5.5f);
        x11Var.m21797h(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        x11Var.m21804o(2.5f, 1.12f, 2.5f, 2.5f);
        x11Var.m21807r(3.74f);
        x11Var.m21797h(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        x11Var.m21797h(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        x11Var.m21804o(-4.5f, 2.01f, -4.5f, 4.5f);
        x11Var.m21796g(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
        x11Var.m21795f();
        x11Var.m21802m(14.29f, 11.71f);
        x11Var.m21797h(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        x11Var.m21799j(-0.61f);
        x11Var.m21807r(-6.0f);
        x11Var.m21797h(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        x11Var.m21804o(-1.5f, 0.67f, -1.5f, 1.5f);
        x11Var.m21807r(10.74f);
        x11Var.m21801l(-3.44f, -0.72f);
        x11Var.m21797h(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
        x11Var.m21797h(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
        x11Var.m21801l(4.01f, 4.01f);
        x11Var.m21796g(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
        x11Var.m21799j(6.1f);
        x11Var.m21797h(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        x11Var.m21801l(0.63f, -4.47f);
        x11Var.m21797h(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
        x11Var.m21800k(14.29f, 11.71f);
        x11Var.m21795f();
        hn5.m9584d(hn5Var, x11Var.f47436b, 0, ajbVar);
        in5 m9587e = hn5Var.m9587e();
        f13937b = m9587e;
        return m9587e;
    }

    /* renamed from: u */
    public static final in5 m8570u() {
        in5 in5Var = f13938c;
        if (in5Var != null) {
            return in5Var;
        }
        hn5 hn5Var = new hn5("Rounded.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = o8d.f29868a;
        ajb ajbVar = new ajb(ws1.f47051b);
        x11 m15969c = pr1.m15969c(12.0f, 6.5f);
        m15969c.m21797h(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        m15969c.m21797h(0.0f, 0.51f, -0.1f, 1.0f, -0.24f, 1.46f);
        m15969c.m21801l(3.06f, 3.06f);
        m15969c.m21797h(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        m15969c.m21796g(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        m15969c.m21797h(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        m15969c.m21801l(2.17f, 2.17f);
        m15969c.m21797h(0.47f, -0.14f, 0.96f, -0.24f, 1.47f, -0.24f);
        m15969c.m21795f();
        m15969c.m21802m(2.71f, 3.16f);
        m15969c.m21797h(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        m15969c.m21801l(1.97f, 1.97f);
        m15969c.m21796g(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        m15969c.m21796g(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        m15969c.m21797h(1.52f, 0.0f, 2.97f, -0.3f, 4.31f, -0.82f);
        m15969c.m21801l(2.72f, 2.72f);
        m15969c.m21797h(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        m15969c.m21797h(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        m15969c.m21800k(4.13f, 3.16f);
        m15969c.m21797h(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        m15969c.m21795f();
        m15969c.m21802m(12.0f, 16.5f);
        m15969c.m21797h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        m15969c.m21797h(0.0f, -0.77f, 0.18f, -1.5f, 0.49f, -2.14f);
        m15969c.m21801l(1.57f, 1.57f);
        m15969c.m21797h(-0.03f, 0.18f, -0.06f, 0.37f, -0.06f, 0.57f);
        m15969c.m21797h(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        m15969c.m21797h(0.2f, 0.0f, 0.38f, -0.03f, 0.57f, -0.07f);
        m15969c.m21800k(14.14f, 16.0f);
        m15969c.m21797h(-0.65f, 0.32f, -1.37f, 0.5f, -2.14f, 0.5f);
        m15969c.m21795f();
        m15969c.m21802m(14.97f, 11.17f);
        m15969c.m21797h(-0.15f, -1.4f, -1.25f, -2.49f, -2.64f, -2.64f);
        m15969c.m21801l(2.64f, 2.64f);
        m15969c.m21795f();
        hn5.m9584d(hn5Var, m15969c.f47436b, 0, ajbVar);
        in5 m9587e = hn5Var.m9587e();
        f13938c = m9587e;
        return m9587e;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0099  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m8571v(CharSequence charSequence) {
        uw5 m19364E;
        int length = charSequence.length();
        if (length != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                if (i3 >= length) {
                    break;
                }
                if (charSequence.charAt(i2) == ':' && charSequence.charAt(i2 + 1) == '/' && charSequence.charAt(i3) == '/') {
                    i = i2 + 3;
                    break;
                }
                i2++;
            }
            if (i < length) {
                for (int i4 = i; i4 < length; i4++) {
                    char charAt = charSequence.charAt(i4);
                    if (charAt == ' ' || charAt == '#' || charAt == '/' || charAt == '?') {
                        length = i4;
                        break;
                    }
                }
                if (i < length) {
                    int i5 = i;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (charSequence.charAt(i5) == '@') {
                            i = i5 + 1;
                            break;
                        }
                        i5++;
                    }
                    if (i < length) {
                        if (charSequence.charAt(i) == '[') {
                            int i6 = i + 1;
                            int i7 = i6;
                            while (true) {
                                if (i7 >= length) {
                                    i7 = -1;
                                    break;
                                }
                                if (charSequence.charAt(i7) == ']') {
                                    break;
                                }
                                i7++;
                            }
                            if (i7 >= 0) {
                                m19364E = new uw5(i6, i7, 1);
                            }
                        } else {
                            int i8 = i;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                }
                                if (charSequence.charAt(i8) == ':') {
                                    length = i8;
                                    break;
                                }
                                i8++;
                            }
                            m19364E = u6d.m19364E(i, length);
                        }
                        if (m19364E != null) {
                            return null;
                        }
                        String lowerCase = charSequence.subSequence(m19364E.f39239u, m19364E.f39240v + 1).toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        return lowerCase;
                    }
                }
            }
        }
        m19364E = null;
        if (m19364E != null) {
        }
    }

    /* renamed from: w */
    public static final boolean m8572w(long j, f79 f79Var) {
        long j2 = f79Var.f11261c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (intBitsToFloat2 < 0.0f) | (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    /* renamed from: x */
    public static final boolean m8573x(f79 f79Var, long j, long j2) {
        int i = f79Var.f11267i == 1 ? 1 : 0;
        long j3 = f79Var.f11261c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    /* renamed from: y */
    public static int m8574y(dk6 dk6Var, l17 l17Var, sc7 sc7Var, int i) {
        return dk6Var.mo6386d(new gz5(l17Var, l17Var.getLayoutDirection()), new ct2(sc7Var, ed7.f9777v, fd7.f11715v, (byte) 1), p72.m15563b(0, i, 0, 0, 13)).getHeight();
    }

    /* renamed from: z */
    public static int m8575z(dk6 dk6Var, l17 l17Var, sc7 sc7Var, int i) {
        return dk6Var.mo6386d(new gz5(l17Var, l17Var.getLayoutDirection()), new ct2(sc7Var, ed7.f9777v, fd7.f11714u, (byte) 1), p72.m15563b(0, 0, 0, i, 7)).getWidth();
    }
}
