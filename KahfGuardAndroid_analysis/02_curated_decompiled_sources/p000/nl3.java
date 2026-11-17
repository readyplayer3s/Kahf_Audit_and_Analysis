package p000;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public class nl3 implements xy0, InterfaceC0738q9, dc2, f87, yn7, InterfaceC0918v4, e94, cnd, e51, i83, vpa, de6, hd7, x6d, wc2, bwa, ab8, hhb, oad {

    /* renamed from: u */
    public final /* synthetic */ byte f28462u;

    /* renamed from: v */
    public static final nl3 f28457v = new nl3((byte) 1);

    /* renamed from: w */
    public static final nl3 f28458w = new nl3((byte) 2);

    /* renamed from: x */
    public static final /* synthetic */ nl3 f28459x = new nl3((byte) 3);

    /* renamed from: y */
    public static final nl3 f28460y = new nl3((byte) 4);

    /* renamed from: z */
    public static final nl3 f28461z = new nl3((byte) 5);

    /* renamed from: A */
    public static final nl3 f28455A = new nl3((byte) 7);

    /* renamed from: B */
    public static final nl3 f28456B = new nl3((byte) 8);

    public nl3() {
        this.f28462u = (byte) 15;
        vu2 vu2Var = k83.f21845a;
        n75 n75Var = h57.f15547a;
        dt2 dt2Var = dt2.f8706v;
    }

    /* renamed from: J */
    public static C0260da m14260J(List list, haa haaVar) {
        list.getClass();
        haaVar.getClass();
        return new C0260da(list, m14265P(haaVar.f15850a), m14265P(haaVar.f15851b), m14264O(haaVar.f15852c), m14263N(haaVar.f15853d));
    }

    /* renamed from: L */
    public static f4a m14261L(String str, List list) {
        list.getClass();
        str.getClass();
        return new f4a(list, new ak8(str), zj8.f52554g);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m14262M(n11 n11Var, String str) {
        int i;
        String str2;
        n11Var.getClass();
        str.getClass();
        String[] strArr = o11.f29321B;
        n11Var.writeByte(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    n11Var.mo13924A(i2, str, i);
                }
                n11Var.mo13929h0(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                n11Var.mo13929h0(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            n11Var.mo13924A(i2, str, length);
        }
        n11Var.writeByte(34);
    }

    /* renamed from: N */
    public static xa7 m14263N(List list) {
        v9a v9aVar;
        xa7 xa7Var;
        xa7 xa7Var2;
        xa7 xa7Var3;
        xa7 xa7Var4;
        lp2 lp2Var;
        pw0 pw0Var;
        xa7 xa7Var5 = zj8.f52554g;
        if (list == null) {
            return xa7Var5;
        }
        ArrayList arrayList = new ArrayList(qs1.m16870Y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9a r9aVar = (r9a) it.next();
            u9a u9aVar = r9aVar.f36328a;
            u9aVar.getClass();
            int ordinal = u9aVar.ordinal();
            xa7 xa7Var6 = null;
            if (ordinal == 0) {
                v9aVar = v9a.f44041x;
            } else if (ordinal == 1) {
                v9aVar = v9a.f44042y;
            } else {
                if (ordinal != 2) {
                    gpc.m8801a();
                    return null;
                }
                v9aVar = v9a.f44043z;
            }
            v9a v9aVar2 = v9aVar;
            String str = r9aVar.f36329b;
            ow0 ow0Var = r9aVar.f36330c;
            if (ow0Var != null) {
                int ordinal2 = ow0Var.ordinal();
                if (ordinal2 == 0) {
                    pw0Var = pw0.QUICK;
                } else if (ordinal2 == 1) {
                    pw0Var = pw0.ALWAYS;
                } else {
                    if (ordinal2 != 2) {
                        gpc.m8801a();
                        return null;
                    }
                    pw0Var = pw0.SCHEDULE;
                }
                xa7Var = new ak8(pw0Var);
            } else {
                xa7Var = xa7Var5;
            }
            xa7 m14265P = m14265P(r9aVar.f36331d);
            xa7 m14265P2 = m14265P(r9aVar.f36332e);
            List<dw0> list2 = r9aVar.f36333f;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(qs1.m16870Y(list2, 10));
                for (dw0 dw0Var : list2) {
                    xa7 m14265P3 = m14265P(dw0Var.f8842a);
                    xa7 m14265P4 = m14265P(dw0Var.f8843b);
                    xa7 m14265P5 = m14265P(dw0Var.f8844c);
                    List<jp2> list3 = dw0Var.f8845d;
                    if (list3 != null) {
                        xa7Var3 = xa7Var6;
                        ArrayList arrayList3 = new ArrayList(qs1.m16870Y(list3, 10));
                        for (jp2 jp2Var : list3) {
                            jp2Var.getClass();
                            switch (jp2Var.ordinal()) {
                                case 0:
                                    lp2Var = lp2.f24822x;
                                    break;
                                case 1:
                                    lp2Var = lp2.f24823y;
                                    break;
                                case 2:
                                    lp2Var = lp2.f24824z;
                                    break;
                                case 3:
                                    lp2Var = lp2.f24814A;
                                    break;
                                case 4:
                                    lp2Var = lp2.f24815B;
                                    break;
                                case 5:
                                    lp2Var = lp2.f24816C;
                                    break;
                                case 6:
                                    lp2Var = lp2.f24817D;
                                    break;
                                default:
                                    gpc.m8801a();
                                    return xa7Var3;
                            }
                            arrayList3.add(lp2Var);
                        }
                        xa7Var4 = new ak8(arrayList3);
                    } else {
                        xa7Var3 = xa7Var6;
                        xa7Var4 = xa7Var5;
                    }
                    arrayList2.add(new ew0(m14265P3, m14265P4, m14265P5, xa7Var4, m14265P(dw0Var.f8846e)));
                    xa7Var6 = xa7Var3;
                }
                xa7Var2 = new ak8(arrayList2);
            } else {
                xa7Var2 = xa7Var5;
            }
            arrayList.add(new s9a(v9aVar2, str, xa7Var, m14265P, m14265P2, xa7Var2, m14264O(r9aVar.f36334g)));
        }
        return new ak8(arrayList);
    }

    /* renamed from: O */
    public static xa7 m14264O(List list) {
        if (list == null) {
            return zj8.f52554g;
        }
        ArrayList arrayList = new ArrayList(qs1.m16870Y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            laa laaVar = (laa) it.next();
            arrayList.add(new jx7(laaVar.f23982a, laaVar.f23983b));
        }
        return new ak8(arrayList);
    }

    /* renamed from: P */
    public static xa7 m14265P(Object obj) {
        return obj == null ? zj8.f52554g : new ak8(obj);
    }

    /* renamed from: Q */
    public static t1d m14266Q(List list, String str, haa haaVar) {
        list.getClass();
        str.getClass();
        haaVar.getClass();
        return new t1d(list, new ak8(str), m14265P(haaVar.f15851b), m14264O(haaVar.f15852c), m14263N(haaVar.f15853d), zj8.f52554g);
    }

    @Override // p000.e94
    /* renamed from: A */
    public long mo6981A(float f) {
        return 0L;
    }

    @Override // p000.e94
    /* renamed from: B */
    public float mo6982B(float f, float f2) {
        return 0.0f;
    }

    @Override // p000.f87
    /* renamed from: D */
    public e87 mo2807D(g87 g87Var, Object obj, int i, e87 e87Var) {
        c97 c97Var = (c97) g87Var;
        b97 b97Var = (b97) e87Var;
        return b97Var == null ? new b97(c97Var.f4686B, obj, i) : new a97(c97Var.f4686B, obj, i, b97Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    @Override // p000.cnd
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ku0 mo2808E(String str, int i, EnumMap enumMap) {
        char c;
        int i2;
        int i3;
        int i4;
        ju0 ju0Var;
        int i5;
        int i6;
        int i7;
        ju0 m19751m;
        int i8;
        int i9;
        int i10;
        LinkedList m21177a;
        Charset charset = StandardCharsets.ISO_8859_1;
        hp3 hp3Var = hp3.f16681v;
        if (enumMap.containsKey(hp3Var)) {
            charset = Charset.forName(enumMap.get(hp3Var).toString());
        }
        hp3 hp3Var2 = hp3.f16680u;
        int parseInt = enumMap.containsKey(hp3Var2) ? Integer.parseInt(enumMap.get(hp3Var2).toString()) : 33;
        hp3 hp3Var3 = hp3.f16676D;
        int parseInt2 = enumMap.containsKey(hp3Var3) ? Integer.parseInt(enumMap.get(hp3Var3).toString()) : 0;
        int i11 = 1;
        if (i != 1) {
            gpc.m8805e("Can only encode AZTEC, but got ".concat(AbstractC0327f4.m7607A(i)));
            return null;
        }
        byte[] bytes = str.getBytes(charset);
        int[] iArr = ume.f42752d;
        List<unb> singletonList = Collections.singletonList(unb.f42859e);
        int i12 = 0;
        while (true) {
            int i13 = 4;
            int i14 = 2;
            c = '\n';
            i2 = 3;
            if (i12 >= bytes.length) {
                break;
            }
            int i15 = i12 + 1;
            byte b = i15 < bytes.length ? bytes[i15] : (byte) 0;
            byte b2 = bytes[i12];
            if (b2 == 13) {
                if (b == 10) {
                    i9 = 2;
                    if (i9 <= 0) {
                    }
                    singletonList = m21177a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = m21177a;
                i12++;
                i11 = i10;
            } else if (b2 == 44) {
                if (b == 32) {
                    i9 = 4;
                    if (i9 <= 0) {
                    }
                    singletonList = m21177a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = m21177a;
                i12++;
                i11 = i10;
            } else if (b2 != 46) {
                if (b2 == 58 && b == 32) {
                    i9 = 5;
                    if (i9 <= 0) {
                        LinkedList linkedList = new LinkedList();
                        for (unb unbVar : singletonList) {
                            unb m19858b = unbVar.m19858b(i12);
                            linkedList.add(m19858b.m19860d(4, i9));
                            if (unbVar.f42860a != 4) {
                                linkedList.add(m19858b.m19861e(4, i9));
                            }
                            if (i9 == 3 || i9 == 4) {
                                linkedList.add(m19858b.m19860d(2, 16 - i9).m19860d(2, i11));
                            }
                            if (unbVar.f42862c > 0) {
                                linkedList.add(unbVar.m19857a(i12).m19857a(i15));
                            }
                        }
                        m21177a = w95.m21177a(linkedList);
                        i10 = i11;
                        i12 = i15;
                    } else {
                        LinkedList linkedList2 = new LinkedList();
                        for (unb unbVar2 : singletonList) {
                            char c2 = (char) (bytes[i12] & 255);
                            int[][] iArr2 = w95.f45966c;
                            int i16 = unbVar2.f42860a;
                            int i17 = iArr2[i16][c2] > 0 ? i11 : 0;
                            unb unbVar3 = null;
                            int i18 = 0;
                            while (i18 <= i13) {
                                int i19 = i11;
                                int i20 = iArr2[i18][c2];
                                if (i20 > 0) {
                                    if (unbVar3 == null) {
                                        unbVar3 = unbVar2.m19858b(i12);
                                    }
                                    unb unbVar4 = unbVar3;
                                    if (i17 == 0 || i18 == i16 || i18 == i14) {
                                        linkedList2.add(unbVar4.m19860d(i18, i20));
                                    }
                                    if (i17 == 0 && w95.f45967d[i16][i18] >= 0) {
                                        linkedList2.add(unbVar4.m19861e(i18, i20));
                                    }
                                    unbVar3 = unbVar4;
                                }
                                i18++;
                                i11 = i19;
                                i13 = 4;
                                i14 = 2;
                            }
                            int i21 = i11;
                            if (unbVar2.f42862c > 0 || iArr2[i16][c2] == 0) {
                                linkedList2.add(unbVar2.m19857a(i12));
                            }
                            i11 = i21;
                            i13 = 4;
                            i14 = 2;
                        }
                        i10 = i11;
                        m21177a = w95.m21177a(linkedList2);
                    }
                    singletonList = m21177a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = m21177a;
                i12++;
                i11 = i10;
            } else {
                if (b == 32) {
                    i9 = 3;
                    if (i9 <= 0) {
                    }
                    singletonList = m21177a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = m21177a;
                i12++;
                i11 = i10;
            }
        }
        int i22 = i11;
        unb unbVar5 = (unb) Collections.min(singletonList, new hg4((byte) 18));
        unbVar5.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (vkc vkcVar = unbVar5.m19858b(bytes.length).f42861b; vkcVar != null; vkcVar = vkcVar.f44599a) {
            linkedList3.addFirst(vkcVar);
        }
        ju0 ju0Var2 = new ju0();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((vkc) it.next()).mo7447a(ju0Var2, bytes);
        }
        int i23 = ju0Var2.f21172v;
        int i24 = ((parseInt * i23) / 100) + 11;
        int i25 = i23 + i24;
        if (parseInt2 == 0) {
            ju0 ju0Var3 = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i2 ? i22 : 0;
                int i29 = i28 != 0 ? i26 + 1 : i26;
                int i30 = ((i28 != 0 ? 88 : 112) + (i29 << 4)) * i29;
                if (i25 <= i30) {
                    if (ju0Var3 == null || i27 != iArr[i29]) {
                        i3 = iArr[i29];
                        ju0Var3 = ume.m19733G(ju0Var2, i3);
                    } else {
                        i3 = i27;
                    }
                    int i31 = i30 - (i30 % i3);
                    if ((i28 == 0 || ju0Var3.f21172v <= (i3 << 6)) && ju0Var3.f21172v + i24 <= i31) {
                        i4 = i3;
                        ju0Var = ju0Var3;
                        i5 = i28;
                        i6 = i29;
                        i7 = i30;
                    } else {
                        i27 = i3;
                    }
                }
                i26++;
                c = c;
                i2 = 3;
            }
            gpc.m8805e("Data too large for an Aztec code");
            return null;
        }
        i5 = parseInt2 < 0 ? i22 : 0;
        i6 = Math.abs(parseInt2);
        if (i6 > (i5 != 0 ? 4 : 32)) {
            gpc.m8805e(pr1.m15973g(parseInt2, "Illegal value ", " for layers"));
            return null;
        }
        i7 = ((i5 != 0 ? 88 : 112) + (i6 << 4)) * i6;
        i4 = iArr[i6];
        int i32 = i7 - (i7 % i4);
        ju0Var = ume.m19733G(ju0Var2, i4);
        int i33 = ju0Var.f21172v;
        if (i24 + i33 > i32) {
            gpc.m8805e("Data to large for user specified layer");
            return null;
        }
        if (i5 != 0 && i33 > (i4 << 6)) {
            gpc.m8805e("Data to large for user specified layer");
            return null;
        }
        ju0 m19751m2 = ume.m19751m(ju0Var, i7, i4);
        int i34 = ju0Var.f21172v / i4;
        ju0 ju0Var4 = new ju0();
        if (i5 != 0) {
            ju0Var4.m11562b(i6 - 1, 2);
            ju0Var4.m11562b(i34 - 1, 6);
            m19751m = ume.m19751m(ju0Var4, 28, 4);
        } else {
            ju0Var4.m11562b(i6 - 1, 5);
            ju0Var4.m11562b(i34 - 1, 11);
            m19751m = ume.m19751m(ju0Var4, 40, 4);
        }
        int i35 = (i5 == 0 ? 14 : 11) + (i6 << 2);
        int[] iArr3 = new int[i35];
        if (i5 != 0) {
            for (int i36 = 0; i36 < i35; i36++) {
                iArr3[i36] = i36;
            }
            i8 = i35;
        } else {
            int i37 = i35 / 2;
            i8 = (((i37 - 1) / 15) * 2) + i35 + 1;
            int i38 = i8 / 2;
            for (int i39 = 0; i39 < i37; i39++) {
                iArr3[(i37 - i39) - 1] = (i38 - r10) - 1;
                iArr3[i37 + i39] = (i39 / 15) + i39 + i38 + 1;
            }
        }
        ku0 ku0Var = new ku0(i8, i8);
        int i40 = 0;
        for (int i41 = 0; i41 < i6; i41++) {
            int i42 = ((i6 - i41) << 2) + (i5 != 0 ? 9 : 12);
            for (int i43 = 0; i43 < i42; i43++) {
                int i44 = i43 << 1;
                for (int i45 = 0; i45 < 2; i45++) {
                    if (m19751m2.m11564d(i40 + i44 + i45)) {
                        int i46 = i41 << 1;
                        ku0Var.m12306b(iArr3[i46 + i45], iArr3[i46 + i43]);
                    }
                    if (m19751m2.m11564d((i42 << 1) + i40 + i44 + i45)) {
                        int i47 = i41 << 1;
                        ku0Var.m12306b(iArr3[i47 + i43], iArr3[((i35 - 1) - i47) - i45]);
                    }
                    if (m19751m2.m11564d((i42 << 2) + i40 + i44 + i45)) {
                        int i48 = (i35 - 1) - (i41 << 1);
                        ku0Var.m12306b(iArr3[i48 - i45], iArr3[i48 - i43]);
                    }
                    if (m19751m2.m11564d((i42 * 6) + i40 + i44 + i45)) {
                        int i49 = i41 << 1;
                        ku0Var.m12306b(iArr3[((i35 - 1) - i49) - i43], iArr3[i49 + i45]);
                    }
                }
            }
            i40 += i42 << 3;
        }
        int i50 = i8 / 2;
        if (i5 != 0) {
            for (int i51 = 0; i51 < 7; i51++) {
                int i52 = (i50 - 3) + i51;
                if (m19751m.m11564d(i51)) {
                    ku0Var.m12306b(i52, i50 - 5);
                }
                if (m19751m.m11564d(i51 + 7)) {
                    ku0Var.m12306b(i50 + 5, i52);
                }
                if (m19751m.m11564d(20 - i51)) {
                    ku0Var.m12306b(i52, i50 + 5);
                }
                if (m19751m.m11564d(27 - i51)) {
                    ku0Var.m12306b(i50 - 5, i52);
                }
            }
        } else {
            for (int i53 = 0; i53 < 10; i53++) {
                int i54 = (i53 / 5) + (i50 - 5) + i53;
                if (m19751m.m11564d(i53)) {
                    ku0Var.m12306b(i54, i50 - 7);
                }
                if (m19751m.m11564d(i53 + 10)) {
                    ku0Var.m12306b(i50 + 7, i54);
                }
                if (m19751m.m11564d(29 - i53)) {
                    ku0Var.m12306b(i54, i50 + 7);
                }
                if (m19751m.m11564d(39 - i53)) {
                    ku0Var.m12306b(i50 - 7, i54);
                }
            }
        }
        if (i5 != 0) {
            ume.m19750l(ku0Var, i50, 5);
        } else {
            ume.m19750l(ku0Var, i50, 7);
            int i55 = 0;
            int i56 = 0;
            while (i55 < (i35 / 2) - 1) {
                for (int i57 = i50 & 1; i57 < i8; i57 += 2) {
                    int i58 = i50 - i56;
                    ku0Var.m12306b(i58, i57);
                    int i59 = i50 + i56;
                    ku0Var.m12306b(i59, i57);
                    ku0Var.m12306b(i57, i58);
                    ku0Var.m12306b(i57, i59);
                }
                i55 += 15;
                i56 += 16;
            }
        }
        int i60 = ku0Var.f23057u;
        int max = Math.max(200, i60);
        int i61 = ku0Var.f23058v;
        int max2 = Math.max(200, i61);
        int min = Math.min(max / i60, max2 / i61);
        int i62 = (max - (i60 * min)) / 2;
        int i63 = (max2 - (i61 * min)) / 2;
        ku0 ku0Var2 = new ku0(max, max2);
        int i64 = 0;
        while (i64 < i61) {
            int i65 = i62;
            int i66 = 0;
            while (i66 < i60) {
                if (ku0Var.m12305a(i66, i64)) {
                    ku0Var2.m12307c(i65, i63, min, min);
                }
                i66++;
                i65 += min;
            }
            i64++;
            i63 += min;
        }
        return ku0Var2;
    }

    @Override // p000.yn7
    /* renamed from: F */
    public xn7 mo3270F(qt5 qt5Var) {
        return uxc.f43413b;
    }

    @Override // p000.oad
    /* renamed from: G */
    public void mo2809G(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new nad((ByteBuffer) obj));
    }

    @Override // p000.vpa
    /* renamed from: H */
    public int mo1253H(nu5 nu5Var, nq2 nq2Var, int i) {
        nq2Var.f45464v = 4;
        return -4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        if (r7 == r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        if (r7 == r2) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m14267K(kx3 kx3Var, kx3 kx3Var2, g86 g86Var, mm4 mm4Var, ova ovaVar, za2 za2Var) {
        af8 af8Var;
        int i;
        g86 g86Var2;
        g86 g86Var3;
        mm4 mm4Var2;
        ova ovaVar2;
        g86 g86Var4;
        ova ovaVar3;
        mm4 mm4Var3;
        g86 g86Var5;
        g86 g86Var6;
        g86 g86Var7;
        g86 g86Var8;
        int intValue;
        List list;
        int i2;
        List list2;
        int i3;
        g86 g86Var9;
        ova ovaVar4;
        g86 g86Var10;
        ova ovaVar5;
        w86 w86Var;
        g86 g86Var11;
        g86 g86Var12;
        ova ovaVar6;
        g86 g86Var13;
        w86 w86Var2;
        g86 g86Var14;
        g86 g86Var15;
        ova ovaVar7;
        Object mo258a;
        if (za2Var instanceof af8) {
            af8Var = (af8) za2Var;
            int i4 = af8Var.f883I;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                af8Var.f883I = i4 - Integer.MIN_VALUE;
                Object obj = af8Var.f881G;
                i = af8Var.f883I;
                Object obj2 = qc2.f34309u;
                switch (i) {
                    case 0:
                        v11.m20244z(obj);
                        af8Var.f884u = kx3Var2;
                        af8Var.f885v = g86Var;
                        af8Var.f886w = mm4Var;
                        af8Var.f887x = ovaVar;
                        af8Var.f883I = 1;
                        obj = kx3Var.m12362l(ovaVar, af8Var);
                        break;
                    case 1:
                        ovaVar = af8Var.f887x;
                        mm4Var = af8Var.f886w;
                        g86Var = af8Var.f885v;
                        kx3Var2 = af8Var.f884u;
                        v11.m20244z(obj);
                        obj.getClass();
                        g86Var2 = (g86) obj;
                        af8Var.f884u = null;
                        af8Var.f885v = g86Var;
                        af8Var.f886w = mm4Var;
                        af8Var.f887x = ovaVar;
                        af8Var.f888y = g86Var2;
                        af8Var.f883I = 2;
                        obj = kx3Var2.m12362l(ovaVar, af8Var);
                        if (obj != obj2) {
                            mm4 mm4Var4 = mm4Var;
                            g86Var3 = g86Var;
                            mm4Var2 = mm4Var4;
                            ovaVar2 = ovaVar;
                            g86 g86Var16 = (g86) obj;
                            if (!muc.m13752J(g86Var2)) {
                                g86Var2.getClass();
                                muc.m13772h(g86Var2);
                                af8Var.f884u = null;
                                af8Var.f885v = g86Var3;
                                af8Var.f886w = mm4Var2;
                                af8Var.f887x = ovaVar2;
                                af8Var.f888y = g86Var2;
                                af8Var.f889z = null;
                                af8Var.f883I = 3;
                                obj = ovaVar2.mo1510p(g86Var16, af8Var);
                                break;
                            } else {
                                if (!(g86Var2 instanceof w86)) {
                                    throw new IllegalStateException(("Can't assign '" + g86Var3 + "' by index (" + g86Var16 + ")").toString());
                                }
                                af8Var.f884u = null;
                                af8Var.f885v = g86Var3;
                                af8Var.f886w = mm4Var2;
                                af8Var.f887x = ovaVar2;
                                af8Var.f888y = g86Var2;
                                af8Var.f889z = g86Var16;
                                af8Var.f883I = 5;
                                Object mo2882z = g86Var2.mo2882z(g86Var16, ovaVar2, af8Var);
                                if (mo2882z != obj2) {
                                    g86Var4 = g86Var3;
                                    ovaVar3 = ovaVar2;
                                    mm4Var3 = mm4Var2;
                                    g86Var5 = g86Var2;
                                    g86Var6 = g86Var16;
                                    obj = mo2882z;
                                    if (((Boolean) obj).booleanValue() || mm4Var3 == null) {
                                        af8Var.f884u = null;
                                        af8Var.f885v = null;
                                        af8Var.f886w = null;
                                        af8Var.f887x = ovaVar3;
                                        af8Var.f888y = g86Var5;
                                        af8Var.f889z = g86Var6;
                                        af8Var.f883I = 9;
                                        if (((w86) g86Var5).mo2869S(af8Var, g86Var6, g86Var4, ovaVar3) != obj2) {
                                            g86Var9 = g86Var5;
                                            ovaVar4 = ovaVar3;
                                            af8Var.f884u = null;
                                            af8Var.f885v = null;
                                            af8Var.f886w = null;
                                            af8Var.f887x = null;
                                            af8Var.f888y = null;
                                            af8Var.f889z = null;
                                            af8Var.f883I = 10;
                                            mo258a = g86Var9.mo258a(g86Var6, ovaVar4, af8Var);
                                            if (mo258a != obj2) {
                                                return mo258a;
                                            }
                                        }
                                    } else {
                                        w86 w86Var3 = (w86) g86Var5;
                                        af8Var.f884u = null;
                                        af8Var.f885v = g86Var4;
                                        af8Var.f886w = null;
                                        af8Var.f887x = ovaVar3;
                                        af8Var.f888y = g86Var5;
                                        g86 g86Var17 = g86Var6;
                                        af8Var.f889z = g86Var17;
                                        af8Var.f875A = w86Var3;
                                        af8Var.f876B = g86Var17;
                                        af8Var.f877C = mm4Var3;
                                        af8Var.f878D = ovaVar3;
                                        af8Var.f883I = 6;
                                        Object mo258a2 = g86Var5.mo258a(g86Var6, ovaVar3, af8Var);
                                        if (mo258a2 != obj2) {
                                            g86Var10 = g86Var5;
                                            ovaVar5 = ovaVar3;
                                            w86Var = w86Var3;
                                            g86Var11 = g86Var6;
                                            obj = mo258a2;
                                            g86Var12 = g86Var11;
                                            ovaVar6 = ovaVar5;
                                            af8Var.f884u = null;
                                            af8Var.f885v = null;
                                            af8Var.f886w = null;
                                            af8Var.f887x = ovaVar5;
                                            af8Var.f888y = g86Var10;
                                            af8Var.f889z = g86Var12;
                                            af8Var.f875A = w86Var;
                                            af8Var.f876B = g86Var11;
                                            af8Var.f877C = null;
                                            af8Var.f878D = null;
                                            af8Var.f883I = 7;
                                            obj = mm4Var3.mo1d(ovaVar6, obj, g86Var4, af8Var);
                                            if (obj != obj2) {
                                                g86Var13 = g86Var11;
                                                w86Var2 = w86Var;
                                                g86Var14 = g86Var12;
                                                g86Var15 = g86Var10;
                                                ovaVar7 = ovaVar5;
                                                af8Var.f884u = null;
                                                af8Var.f885v = null;
                                                af8Var.f886w = null;
                                                af8Var.f887x = ovaVar7;
                                                af8Var.f888y = g86Var15;
                                                af8Var.f889z = g86Var14;
                                                af8Var.f875A = null;
                                                af8Var.f876B = null;
                                                af8Var.f883I = 8;
                                                if (w86Var2.mo2869S(af8Var, g86Var13, (g86) obj, ovaVar7) != obj2) {
                                                    g86Var6 = g86Var14;
                                                    g86Var9 = g86Var15;
                                                    ovaVar4 = ovaVar7;
                                                    af8Var.f884u = null;
                                                    af8Var.f885v = null;
                                                    af8Var.f886w = null;
                                                    af8Var.f887x = null;
                                                    af8Var.f888y = null;
                                                    af8Var.f889z = null;
                                                    af8Var.f883I = 10;
                                                    mo258a = g86Var9.mo258a(g86Var6, ovaVar4, af8Var);
                                                    if (mo258a != obj2) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 2:
                        g86Var2 = af8Var.f888y;
                        ovaVar2 = af8Var.f887x;
                        mm4Var2 = af8Var.f886w;
                        g86Var3 = af8Var.f885v;
                        v11.m20244z(obj);
                        g86 g86Var162 = (g86) obj;
                        if (!muc.m13752J(g86Var2)) {
                        }
                        return obj2;
                    case 3:
                        g86 g86Var18 = af8Var.f889z;
                        g86Var2 = af8Var.f888y;
                        ovaVar2 = af8Var.f887x;
                        mm4Var2 = af8Var.f886w;
                        g86Var3 = af8Var.f885v;
                        v11.m20244z(obj);
                        g86 g86Var19 = g86Var3;
                        g86Var7 = g86Var2;
                        g86Var8 = g86Var19;
                        Number number = (Number) obj;
                        if (Double.isNaN(number.doubleValue())) {
                            rf6.m17315l("Unexpected index: ", number);
                            return null;
                        }
                        intValue = number.intValue();
                        while (true) {
                            list = (List) g86Var7;
                            if (mv1.m13826o(list) >= intValue) {
                                g86 g86Var20 = (g86) list.get(intValue);
                                if ((g86Var20 instanceof wwc) || mm4Var2 == null) {
                                    i2 = intValue;
                                    list.set(intValue, g86Var8);
                                    return (g86) ((List) g86Var7).get(i2);
                                }
                                af8Var.f884u = null;
                                af8Var.f885v = null;
                                af8Var.f886w = null;
                                af8Var.f887x = null;
                                af8Var.f888y = g86Var7;
                                af8Var.f889z = null;
                                af8Var.f875A = null;
                                af8Var.f876B = null;
                                af8Var.f877C = list;
                                af8Var.f879E = intValue;
                                af8Var.f880F = intValue;
                                af8Var.f883I = 4;
                                Object mo1d = mm4Var2.mo1d(ovaVar2, g86Var20, g86Var8, af8Var);
                                if (mo1d != obj2) {
                                    i2 = intValue;
                                    list2 = list;
                                    obj = mo1d;
                                    i3 = i2;
                                    int i5 = i3;
                                    g86Var8 = (g86) obj;
                                    intValue = i5;
                                    list = list2;
                                    list.set(intValue, g86Var8);
                                    return (g86) ((List) g86Var7).get(i2);
                                }
                                return obj2;
                            }
                            list.add(wwc.f47276u);
                        }
                    case 4:
                        i3 = af8Var.f880F;
                        i2 = af8Var.f879E;
                        list2 = (List) af8Var.f877C;
                        g86 g86Var21 = af8Var.f876B;
                        g86 g86Var22 = af8Var.f889z;
                        g86Var7 = af8Var.f888y;
                        g86 g86Var23 = af8Var.f885v;
                        v11.m20244z(obj);
                        int i52 = i3;
                        g86Var8 = (g86) obj;
                        intValue = i52;
                        list = list2;
                        list.set(intValue, g86Var8);
                        return (g86) ((List) g86Var7).get(i2);
                    case 5:
                        g86Var6 = af8Var.f889z;
                        g86 g86Var24 = af8Var.f888y;
                        ova ovaVar8 = af8Var.f887x;
                        mm4 mm4Var5 = af8Var.f886w;
                        g86 g86Var25 = af8Var.f885v;
                        v11.m20244z(obj);
                        g86Var5 = g86Var24;
                        mm4Var3 = mm4Var5;
                        ovaVar3 = ovaVar8;
                        g86Var4 = g86Var25;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        af8Var.f884u = null;
                        af8Var.f885v = null;
                        af8Var.f886w = null;
                        af8Var.f887x = ovaVar3;
                        af8Var.f888y = g86Var5;
                        af8Var.f889z = g86Var6;
                        af8Var.f883I = 9;
                        if (((w86) g86Var5).mo2869S(af8Var, g86Var6, g86Var4, ovaVar3) != obj2) {
                        }
                        return obj2;
                    case 6:
                        ovaVar6 = af8Var.f878D;
                        mm4Var3 = (mm4) af8Var.f877C;
                        g86Var11 = af8Var.f876B;
                        w86Var = af8Var.f875A;
                        g86Var12 = af8Var.f889z;
                        g86Var10 = af8Var.f888y;
                        ovaVar5 = af8Var.f887x;
                        g86Var4 = af8Var.f885v;
                        v11.m20244z(obj);
                        af8Var.f884u = null;
                        af8Var.f885v = null;
                        af8Var.f886w = null;
                        af8Var.f887x = ovaVar5;
                        af8Var.f888y = g86Var10;
                        af8Var.f889z = g86Var12;
                        af8Var.f875A = w86Var;
                        af8Var.f876B = g86Var11;
                        af8Var.f877C = null;
                        af8Var.f878D = null;
                        af8Var.f883I = 7;
                        obj = mm4Var3.mo1d(ovaVar6, obj, g86Var4, af8Var);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 7:
                        g86Var13 = af8Var.f876B;
                        w86Var2 = af8Var.f875A;
                        g86Var14 = af8Var.f889z;
                        g86Var15 = af8Var.f888y;
                        ovaVar7 = af8Var.f887x;
                        g86 g86Var26 = af8Var.f885v;
                        v11.m20244z(obj);
                        af8Var.f884u = null;
                        af8Var.f885v = null;
                        af8Var.f886w = null;
                        af8Var.f887x = ovaVar7;
                        af8Var.f888y = g86Var15;
                        af8Var.f889z = g86Var14;
                        af8Var.f875A = null;
                        af8Var.f876B = null;
                        af8Var.f883I = 8;
                        if (w86Var2.mo2869S(af8Var, g86Var13, (g86) obj, ovaVar7) != obj2) {
                        }
                        return obj2;
                    case 8:
                    case 9:
                        g86Var6 = af8Var.f889z;
                        g86Var9 = af8Var.f888y;
                        ovaVar4 = af8Var.f887x;
                        g86 g86Var27 = af8Var.f885v;
                        v11.m20244z(obj);
                        af8Var.f884u = null;
                        af8Var.f885v = null;
                        af8Var.f886w = null;
                        af8Var.f887x = null;
                        af8Var.f888y = null;
                        af8Var.f889z = null;
                        af8Var.f883I = 10;
                        mo258a = g86Var9.mo258a(g86Var6, ovaVar4, af8Var);
                        if (mo258a != obj2) {
                            return obj2;
                        }
                        break;
                    case 10:
                        g86 g86Var28 = af8Var.f889z;
                        g86 g86Var29 = af8Var.f888y;
                        g86 g86Var30 = af8Var.f885v;
                        v11.m20244z(obj);
                        return obj;
                    default:
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        af8Var = new af8(this, za2Var);
        Object obj3 = af8Var.f881G;
        i = af8Var.f883I;
        Object obj22 = qc2.f34309u;
        switch (i) {
        }
    }

    @Override // p000.e51
    /* renamed from: a */
    public byte[] mo766a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.x6d
    /* renamed from: b */
    public void mo14268b(vy3 vy3Var) {
        Log.e("sj9", "Got unexpected exception: " + vy3Var);
    }

    @Override // p000.xy0
    /* renamed from: c */
    public Rect mo2812c(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            xy0.f49239a.getClass();
            Log.w(wy0.f47313b, e);
            return c7d.f4583w.mo2812c(activity);
        }
    }

    @Override // p000.vpa
    /* renamed from: d */
    public boolean mo1254d() {
        return true;
    }

    @Override // p000.x6d
    /* renamed from: e */
    public void mo14269e(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString("id") : null;
        if (optString == null) {
            Log.w("sj9", "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        v30.f43643B.m7756n().m20321J(new sj9(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null), true);
    }

    @Override // p000.ab8
    /* renamed from: f */
    public long mo342f(oy3 oy3Var) {
        return -1L;
    }

    @Override // p000.e94
    /* renamed from: g */
    public float mo6983g() {
        return 0.0f;
    }

    @Override // p000.hd7
    /* renamed from: h */
    public long mo6032h() {
        throw new NoSuchElementException();
    }

    @Override // p000.f87
    /* renamed from: i */
    public g87 mo2815i(h97 h97Var, int i) {
        return new c97(h97Var, i);
    }

    @Override // p000.InterfaceC0738q9
    /* renamed from: j */
    public void mo25j(bd6 bd6Var, pi2 pi2Var, Object obj) {
        switch (this.f28462u) {
            case 2:
                q13 q13Var = (q13) obj;
                bd6Var.getClass();
                pi2Var.getClass();
                q13Var.getClass();
                bd6Var.mo1906K(q13Var.f33677u);
                break;
            default:
                mcb mcbVar = (mcb) obj;
                bd6Var.getClass();
                pi2Var.getClass();
                mcbVar.getClass();
                bd6Var.mo1905F0("host");
                AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, mcbVar.f26111a);
                bd6Var.mo1905F0("hour");
                cj7 cj7Var = AbstractC0849t9.f39936b;
                cj7Var.mo25j(bd6Var, pi2Var, Integer.valueOf(mcbVar.f26112b));
                bd6Var.mo1905F0("visits");
                cj7Var.mo25j(bd6Var, pi2Var, Integer.valueOf(mcbVar.f26113c));
                bd6Var.mo1905F0("blocked");
                cj7Var.mo25j(bd6Var, pi2Var, Integer.valueOf(mcbVar.f26114d));
                bd6Var.mo1905F0("activeSeconds");
                cj7Var.mo25j(bd6Var, pi2Var, Integer.valueOf(mcbVar.f26115e));
                break;
        }
    }

    @Override // p000.f87
    /* renamed from: l */
    public k87 mo2816l() {
        return k87.f21856v;
    }

    @Override // p000.e94
    /* renamed from: m */
    public float mo6984m(float f, long j) {
        return 0.0f;
    }

    @Override // p000.vpa
    /* renamed from: n */
    public int mo1256n(long j) {
        return 0;
    }

    @Override // p000.hd7
    public boolean next() {
        return false;
    }

    @Override // p000.f87
    /* renamed from: o */
    public k87 mo2817o() {
        return k87.f21856v;
    }

    @Override // p000.e94
    /* renamed from: p */
    public float mo6985p(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // p000.oad
    /* renamed from: q */
    public void mo2819q(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new nad((ByteBuffer) obj));
    }

    @Override // p000.InterfaceC0918v4
    /* renamed from: r */
    public String mo14270r() {
        return "fb_extend_sso_token";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    @Override // p000.hhb
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2821s(Object obj, Object obj2) {
        o9c o9cVar = (o9c) obj;
        o9c o9cVar2 = (o9c) obj2;
        if (o9cVar == null || o9cVar2 == null) {
            return !((o9cVar == null) ^ (o9cVar2 == null));
        }
        if (o9cVar.f29921a != o9cVar2.f29921a || !zy5.m23838d(o9cVar.f29922b, o9cVar2.f29922b) || o9cVar.f29923c != o9cVar2.f29923c || o9cVar.f29924d != o9cVar2.f29924d || o9cVar.f29925e != o9cVar2.f29925e) {
        }
    }

    @Override // p000.f87
    /* renamed from: u */
    public e87 mo2823u(g87 g87Var, e87 e87Var, e87 e87Var2) {
        c97 c97Var = (c97) g87Var;
        b97 b97Var = (b97) e87Var;
        b97 b97Var2 = (b97) e87Var2;
        T t = b97Var.get();
        if (t == 0) {
            return null;
        }
        int i = g87.f13629A;
        if (b97Var.f2847b.get() == null) {
            return null;
        }
        int i2 = b97Var.f2800a;
        b97 b97Var3 = b97Var2 == null ? new b97(c97Var.f4686B, t, i2) : new a97(c97Var.f4686B, t, i2, b97Var2);
        b97Var3.f2847b = b97Var.f2847b.mo6995b(c97Var.f4687C, b97Var3);
        return b97Var3;
    }

    @Override // p000.hd7
    /* renamed from: v */
    public long mo6033v() {
        throw new NoSuchElementException();
    }

    @Override // p000.InterfaceC0738q9
    /* renamed from: w */
    public Object mo26w(hc6 hc6Var, pi2 pi2Var) {
        switch (this.f28462u) {
            case 2:
                hc6Var.getClass();
                pi2Var.getClass();
                String mo9327s = hc6Var.mo9327s();
                mo9327s.getClass();
                q13.f33672v.getClass();
                return mo9327s.equals("OPEN") ? q13.OPEN : mo9327s.equals("RESOLVED") ? q13.RESOLVED : q13.UNKNOWN__;
            default:
                hc6Var.getClass();
                pi2Var.getClass();
                throw new IllegalStateException("Input type used in output position");
        }
    }

    @Override // p000.f87
    /* renamed from: x */
    public void mo2824x(g87 g87Var, e87 e87Var, Object obj) {
        b97 b97Var = (b97) e87Var;
        e97 e97Var = b97Var.f2847b;
        b97Var.f2847b = new f97(((c97) g87Var).f4687C, obj, b97Var);
        e97Var.clear();
    }

    @Override // p000.ab8
    /* renamed from: y */
    public cya mo343y() {
        return new nm0(-9223372036854775807L);
    }

    @Override // p000.InterfaceC0918v4
    /* renamed from: z */
    public String mo14272z() {
        return "oauth/access_token";
    }

    public nl3(C1058yx c1058yx) {
        this.f28462u = (byte) 20;
        c1058yx.getClass();
    }

    public /* synthetic */ nl3(byte b) {
        this.f28462u = b;
    }

    @Override // p000.vpa
    /* renamed from: k */
    public void mo1255k() {
    }

    @Override // p000.ab8
    /* renamed from: I */
    public void mo341I(long j) {
    }

    @Override // p000.wc2
    /* renamed from: t */
    public Object mo14271t(vc2 vc2Var) {
        throw vc2Var;
    }

    @Override // p000.bwa
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.bwa
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
