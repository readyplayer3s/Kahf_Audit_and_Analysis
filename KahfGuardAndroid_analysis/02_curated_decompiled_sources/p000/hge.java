package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.UserManager;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.DragEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public abstract class hge {

    /* renamed from: a */
    public static UserManager f16188a = null;

    /* renamed from: b */
    public static volatile boolean f16189b = false;

    /* renamed from: c */
    public static final wx1 f16190c = new wx1(210148896, false, new yu1(7));

    /* renamed from: d */
    public static final wx1 f16191d = new wx1(1121996006, false, new az1(27));

    /* renamed from: e */
    public static final String[] f16192e = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: f */
    public static final u03 f16193f = new u03(21);

    /* renamed from: g */
    public static final pt1 f16194g;

    /* renamed from: h */
    public static final float f16195h;

    /* renamed from: i */
    public static final pt1 f16196i;

    /* renamed from: j */
    public static final pt1 f16197j;

    /* renamed from: k */
    public static final jw9 f16198k;

    /* renamed from: l */
    public static final byte[] f16199l;

    /* renamed from: m */
    public static final byte[] f16200m;

    /* renamed from: n */
    public static in5 f16201n;

    /* renamed from: o */
    public static in5 f16202o;

    /* renamed from: p */
    public static in5 f16203p;

    /* renamed from: q */
    public static in5 f16204q;

    /* renamed from: r */
    public static in5 f16205r;

    static {
        pt1 pt1Var = pt1.f33253C;
        f16194g = pt1Var;
        f16195h = 0.38f;
        f16196i = pt1Var;
        f16197j = pt1.f33256F;
        f16198k = new jw9(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        f16199l = new byte[]{0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
        f16200m = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    }

    /* renamed from: A */
    public static pt1 m9437A() {
        return f16197j;
    }

    /* renamed from: B */
    public static final long m9438B(lf3 lf3Var) {
        DragEvent dragEvent = lf3Var.f24254a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    /* renamed from: C */
    public static final n17 m9439C(n17 n17Var) {
        qk6 qk6Var = n17Var.f27435O.f25648O;
        while (true) {
            qk6 m16748u = qk6Var.m16748u();
            qk6 qk6Var2 = null;
            if ((m16748u != null ? m16748u.f34829B : null) == null) {
                n17 mo9713Z0 = qk6Var.f34853Z.f11172d.mo9713Z0();
                mo9713Z0.getClass();
                return mo9713Z0;
            }
            qk6 m16748u2 = qk6Var.m16748u();
            if (m16748u2 != null) {
                qk6Var2 = m16748u2.f34829B;
            }
            qk6Var2.getClass();
            qk6 m16748u3 = qk6Var.m16748u();
            m16748u3.getClass();
            qk6Var = m16748u3.f34829B;
            qk6Var.getClass();
        }
    }

    /* renamed from: D */
    public static final long m9440D(u01 u01Var, byte b, long j, long j2) {
        sya syaVar;
        long j3;
        u01Var.getClass();
        long min = Math.min(j2, u01Var.f41454w);
        jzd.m11699e(u01Var.f41454w, j, min);
        long j4 = -1;
        if (j == min || (syaVar = u01Var.f41452u) == null) {
            return -1L;
        }
        long j5 = u01Var.f41454w;
        if (j5 - j >= j) {
            long j6 = 0;
            while (syaVar != null) {
                long j7 = (syaVar.f39374c - syaVar.f39373b) + j6;
                if (j7 > j) {
                    break;
                }
                syaVar = syaVar.f39377f;
                j6 = j7;
            }
            if (j6 == -1) {
                return -1L;
            }
            while (min > j6) {
                syaVar.getClass();
                int m17855B = s6d.m17855B(syaVar, b, Math.max((int) (j - j6), 0), Math.min(syaVar.m18427b(), (int) (min - j6)));
                if (m17855B != -1) {
                    return j6 + m17855B;
                }
                j6 += syaVar.m18427b();
                syaVar = syaVar.f39377f;
                if (syaVar == null || j6 >= min) {
                    return -1L;
                }
            }
            C0917v3.m20303j("Check failed.");
            return 0L;
        }
        sya syaVar2 = u01Var.f41453v;
        while (syaVar2 != null && j5 > j) {
            j3 = j4;
            j5 -= syaVar2.f39374c - syaVar2.f39373b;
            if (j5 <= j) {
                break;
            }
            syaVar2 = syaVar2.f39378g;
            j4 = j3;
        }
        j3 = j4;
        if (j5 == j3) {
            return j3;
        }
        while (min > j5) {
            syaVar2.getClass();
            int m17855B2 = s6d.m17855B(syaVar2, b, Math.max((int) (j - j5), 0), Math.min(syaVar2.m18427b(), (int) (min - j5)));
            if (m17855B2 != -1) {
                return j5 + m17855B2;
            }
            j5 += syaVar2.m18427b();
            syaVar2 = syaVar2.f39377f;
            if (syaVar2 == null || j5 >= min) {
                return j3;
            }
        }
        C0917v3.m20303j("Check failed.");
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* renamed from: E */
    public static final Object m9441E(Map map, List list) {
        for (Object obj : list) {
            if (map instanceof List) {
                obj.getClass();
                map = ((List) map).get(((Integer) obj).intValue());
            } else {
                map.getClass();
                map = ((Map) map).get(obj);
            }
        }
        return map;
    }

    /* renamed from: F */
    public static ih4 m9442F(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        List list;
        int i2;
        ArrayList arrayList;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m9446J(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), vs9.f44978b);
        int i4 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), vs9.f44979c);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        String string7 = obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m9446J(xmlResourceParser);
                        }
                        arrayList2.add(new kh4(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        m9446J(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new jh4((kh4[]) arrayList2.toArray(new kh4[0]));
        }
        List m9444H = m9444H(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), vs9.f44980d);
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i5) {
                            m9446J(xmlResourceParser);
                        }
                        arrayList = arrayList3;
                        i3 = i5;
                        int i10 = integer;
                        list = m9444H;
                        i2 = i10;
                        typedArray = obtainAttributes3;
                        try {
                            ch4 ch4Var = new ch4(string, string2, string8, string9, string10, list);
                            typedArray.recycle();
                            arrayList.add(ch4Var);
                        } catch (Throwable th) {
                            th = th;
                        }
                        th = th;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                int i11 = integer;
                list = m9444H;
                i2 = i11;
                arrayList = arrayList3;
                i3 = i5;
                m9446J(xmlResourceParser);
                List list2 = list;
                integer = i2;
                m9444H = list2;
                i5 = i3;
                arrayList3 = arrayList;
                i = 2;
                i4 = 0;
            }
        }
        int i12 = integer;
        List list3 = m9444H;
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            return new lh4(arrayList4, i12, integer2, string5);
        }
        if (string3 == null) {
            gpc.m8805e("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new ch4(string, string2, string3, null, null, list3));
        if (string4 != null) {
            arrayList4.add(new ch4(string, string2, string4, null, null, list3));
        }
        return new lh4(arrayList4, i12, integer2, string5);
    }

    /* renamed from: G */
    public static final xv5 m9443G(Object obj) {
        Object tdaVar;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        try {
            ou9 ou9Var = xv5.f49144w;
            tdaVar = ou9.m15348z(str);
        } catch (Throwable th) {
            tdaVar = new tda(th);
        }
        return (xv5) (tdaVar instanceof tda ? null : tdaVar);
    }

    /* renamed from: H */
    public static List m9444H(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: I */
    public static final void m9445I(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* renamed from: J */
    public static void m9446J(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: K */
    public static hs9 m9447K(int i, oy3 oy3Var, tu8 tu8Var) {
        hs9 m9677a = hs9.m9677a(oy3Var, tu8Var);
        while (true) {
            int i2 = m9677a.f16835w;
            if (i2 == i) {
                return m9677a;
            }
            AbstractC0327f4.m7619l(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = m9677a.f16834v;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw av8.m1412d("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            oy3Var.mo2140l((int) j2);
            m9677a = hs9.m9677a(oy3Var, tu8Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [xo3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* renamed from: L */
    public static final SpannableString m9448L(C0613mw c0613mw, tz2 tz2Var, v30 v30Var) {
        ArrayList arrayList;
        int i;
        String str = c0613mw.f27183v;
        List list = c0613mw.f27182u;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = c0613mw.f27184w;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                C0576lw c0576lw = (C0576lw) arrayList2.get(i2);
                flb flbVar = (flb) c0576lw.f25191a;
                int i3 = c0576lw.f25192b;
                int i4 = c0576lw.f25193c;
                int i5 = size;
                long mo16227b = flbVar.f12232a.mo16227b();
                long j = flbVar.f12233b;
                vh4 vh4Var = flbVar.f12234c;
                ph4 ph4Var = flbVar.f12235d;
                sbc sbcVar = flbVar.f12241j;
                pw6 pw6Var = flbVar.f12242k;
                ArrayList arrayList3 = arrayList2;
                long j2 = flbVar.f12243l;
                d7c d7cVar = flbVar.f12244m;
                rbc rbcVar = flbVar.f12232a;
                long mo16227b2 = rbcVar.mo16227b();
                int i6 = ws1.f47057h;
                u6d.m19388w(spannableString, (qvc.m16976a(mo16227b, mo16227b2) ? rbcVar : mo16227b != 16 ? new xt1(mo16227b) : qbc.f34300a).mo16227b(), i3, i4);
                u6d.m19389x(spannableString, j, tz2Var, i3, i4);
                if (vh4Var == null && ph4Var == null) {
                    i = 33;
                } else {
                    if (vh4Var == null) {
                        vh4Var = vh4.f44421A;
                    }
                    StyleSpan styleSpan = new StyleSpan(wt4.m21690o(vh4Var, ph4Var != null ? ph4Var.f32627a : 0));
                    i = 33;
                    spannableString.setSpan(styleSpan, i3, i4, 33);
                }
                if (d7cVar != null) {
                    int i7 = d7cVar.f7513a;
                    if ((i7 | 1) == i7) {
                        spannableString.setSpan(new UnderlineSpan(), i3, i4, i);
                    }
                    if ((i7 | 2) == i7) {
                        spannableString.setSpan(new StrikethroughSpan(), i3, i4, i);
                    }
                }
                if (sbcVar != null) {
                    spannableString.setSpan(new ScaleXSpan(sbcVar.f38231a), i3, i4, i);
                }
                if (pw6Var != null) {
                    spannableString.setSpan(un0.m19829p0(pw6Var), i3, i4, i);
                }
                if (j2 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(s6d.m17862I(j2)), i3, i4, i);
                }
                i2++;
                size = i5;
                arrayList2 = arrayList3;
            }
        }
        int length = str.length();
        ?? r4 = xo3.f48775u;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Object obj = list.get(i8);
                C0576lw c0576lw2 = (C0576lw) obj;
                if ((c0576lw2.f25191a instanceof l9d) && AbstractC0650nw.m14561c(0, length, c0576lw2.f25192b, c0576lw2.f25193c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = r4;
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            C0576lw c0576lw3 = (C0576lw) arrayList.get(i9);
            l9d l9dVar = (l9d) c0576lw3.f25191a;
            int i10 = c0576lw3.f25192b;
            int i11 = c0576lw3.f25193c;
            if (!(l9dVar instanceof l9d)) {
                gpc.m8801a();
                return null;
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(l9dVar.f23930a).build(), i10, i11, 33);
        }
        int length2 = str.length();
        if (list != null) {
            r4 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Object obj2 = list.get(i12);
                C0576lw c0576lw4 = (C0576lw) obj2;
                if ((c0576lw4.f25191a instanceof c3d) && AbstractC0650nw.m14561c(0, length2, c0576lw4.f25192b, c0576lw4.f25193c)) {
                    r4.add(obj2);
                }
            }
        }
        int size5 = r4.size();
        for (int i13 = 0; i13 < size5; i13++) {
            C0576lw c0576lw5 = (C0576lw) r4.get(i13);
            c3d c3dVar = (c3d) c0576lw5.f25191a;
            int i14 = c0576lw5.f25192b;
            int i15 = c0576lw5.f25193c;
            WeakHashMap weakHashMap = (WeakHashMap) v30Var.f43648v;
            Object obj3 = weakHashMap.get(c3dVar);
            if (obj3 == null) {
                obj3 = new URLSpan(c3dVar.f4365a);
                weakHashMap.put(c3dVar, obj3);
            }
            spannableString.setSpan((URLSpan) obj3, i14, i15, 33);
        }
        List m13855a = c0613mw.m13855a(str.length());
        int size6 = m13855a.size();
        for (int i16 = 0; i16 < size6; i16++) {
            C0576lw c0576lw6 = (C0576lw) m13855a.get(i16);
            int i17 = c0576lw6.f25192b;
            Object obj4 = c0576lw6.f25191a;
            int i18 = c0576lw6.f25193c;
            if (i17 != i18) {
                if (((xr6) obj4) instanceof wr6) {
                    obj4.getClass();
                    wr6 wr6Var = (wr6) obj4;
                    C0576lw c0576lw7 = new C0576lw(i17, i18, wr6Var);
                    WeakHashMap weakHashMap2 = (WeakHashMap) v30Var.f43649w;
                    Object obj5 = weakHashMap2.get(c0576lw7);
                    if (obj5 == null) {
                        obj5 = new URLSpan(wr6Var.f47026a);
                        weakHashMap2.put(c0576lw7, obj5);
                    }
                    spannableString.setSpan((URLSpan) obj5, i17, i18, 33);
                } else {
                    WeakHashMap weakHashMap3 = (WeakHashMap) v30Var.f43650x;
                    Object obj6 = weakHashMap3.get(c0576lw6);
                    if (obj6 == null) {
                        obj6 = new x02((xr6) obj4);
                        weakHashMap3.put(c0576lw6, obj6);
                    }
                    spannableString.setSpan((ClickableSpan) obj6, i17, i18, 33);
                }
            }
        }
        return spannableString;
    }

    /* renamed from: M */
    public static final f6c m9449M(Map map) {
        v01 v01Var = new v01();
        df7.m6231Z(new o11(v01Var), map);
        return new f6c(v01Var.m20192U());
    }

    /* renamed from: N */
    public static Throwable m9450N(vx5 vx5Var) {
        return vx5Var.mo1553c();
    }

    /* renamed from: O */
    public static final jw9 m9451O(vj6 vj6Var) {
        jw9 m2916c = cb1.m2916c(vj6Var, true);
        long mo13201s = vj6Var.mo13201s(m2916c.m11605g());
        long mo13201s2 = vj6Var.mo13201s(m2916c.m11602d());
        return new jw9(Float.intBitsToFloat((int) (mo13201s >> 32)), Float.intBitsToFloat((int) (mo13201s & 4294967295L)), Float.intBitsToFloat((int) (mo13201s2 >> 32)), Float.intBitsToFloat((int) (mo13201s2 & 4294967295L)));
    }

    /* renamed from: P */
    public static AbstractC0044b1 m9452P(Context context, Callable callable, Executor executor) {
        k1d k1dVar = new k1d((Object) callable, (byte) 11);
        if (m9453Q(context)) {
            jsc jscVar = new jsc();
            jscVar.f21113C = new isc(jscVar, k1dVar);
            executor.execute(jscVar);
            return jscVar;
        }
        c6b c6bVar = new c6b();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        yfe yfeVar = new yfe(atomicBoolean, context, c6bVar, k1dVar, executor);
        context.registerReceiver(yfeVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!m9453Q(context) || !atomicBoolean.compareAndSet(false, true)) {
            c6bVar.mo46a(new u8b((byte) 9, c6bVar, atomicBoolean, context, yfeVar, false), u63.f41823u);
            return c6bVar;
        }
        try {
            context.unregisterReceiver(yfeVar);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        jsc jscVar2 = new jsc();
        jscVar2.f21113C = new isc(jscVar2, k1dVar);
        executor.execute(jscVar2);
        c6bVar.m1561v(jscVar2);
        return c6bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = true;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9453Q(Context context) {
        boolean z;
        if (f16189b) {
            return true;
        }
        synchronized (hge.class) {
            try {
                if (f16189b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z = false;
                    if (i > 2) {
                        break;
                    }
                    UserManager userManager = f16188a;
                    if (userManager == null) {
                        userManager = (UserManager) context.getSystemService(UserManager.class);
                        f16188a = userManager;
                    }
                    if (userManager == null) {
                        z = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        f16188a = null;
                        i++;
                    }
                }
                if (z) {
                    f16188a = null;
                }
                if (z) {
                    f16189b = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static final void m9454a(e14 e14Var, tl4 tl4Var, fo7 fo7Var, y12 y12Var, int i) {
        fo7 fo7Var2;
        pmc pmcVar;
        mn4 mn4Var = (mn4) y12Var;
        mn4Var.m13580Y(-315825408);
        byte b = 16;
        int i2 = i | (mn4Var.m13592f(e14Var) ? 4 : 2) | (mn4Var.m13596h(tl4Var) ? 32 : 16) | 384;
        byte b2 = 0;
        if (mn4Var.m13570O(i2 & 1, (i2 & 147) != 146)) {
            cy3 cy3Var = (cy3) mn4Var.m13600j(dec.f7919e);
            co7 co7Var = co7.f5557u;
            fo7 m17261c = rdb.m17261c(co7Var, 1.0f);
            f24 f24Var = e14Var.f9124a;
            pmc.f32875u.getClass();
            if (f24Var.equals(d24.f7231a)) {
                pmcVar = pmc.f32877w;
            } else if (f24Var.equals(a24.f126a)) {
                pmcVar = pmc.f32878x;
            } else if (f24Var.equals(e24.f9194a)) {
                pmcVar = pmc.f32879y;
            } else if (f24Var.equals(z14.f51597a)) {
                pmcVar = pmc.f32880z;
            } else if (f24Var.equals(y14.f49490a)) {
                pmcVar = pmc.f32871A;
            } else if (f24Var.equals(b24.f2483a)) {
                pmcVar = pmc.f32872B;
            } else {
                if (!f24Var.equals(c24.f4298a)) {
                    gpc.m8801a();
                    return;
                }
                pmcVar = pmc.f32873C;
            }
            dk3 dk3Var = xlc.f48643a;
            m17261c.getClass();
            k1c.m11769a(iw5.m10685n(af2.m545l(m17261c, new ns0(pmcVar, b)), false, null, null, tl4Var, 15), wha.m21392b(16.0f), e14Var.f9128e, 0L, 0.0f, 0.0f, y6d.m22687a(1.0f, ws1.m21647c(0.15f, e14Var.f9129f)), u11.m19275b0(882999323, new g24(e14Var, cy3Var, b2), mn4Var), mn4Var, 12607488, 40);
            fo7Var2 = co7Var;
        } else {
            mn4Var.m13573R();
            fo7Var2 = fo7Var;
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new C1030y5(e14Var, tl4Var, fo7Var2, i, (byte) 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* renamed from: b */
    public static final void m9455b(List list, vl4 vl4Var, fo7 fo7Var, y12 y12Var, int i) {
        int i2;
        C0596mf c0596mf = wpa.f46978x;
        C0596mf c0596mf2 = wpa.f46967A;
        C0596mf c0596mf3 = wpa.f46979y;
        C0596mf c0596mf4 = wpa.f46980z;
        kt0 kt0Var = aj7.f1181J;
        list.getClass();
        vl4Var.getClass();
        mn4 mn4Var = (mn4) y12Var;
        mn4Var.m13580Y(-1833620214);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? mn4Var.m13592f(list) : mn4Var.m13596h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= mn4Var.m13596h(vl4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= mn4Var.m13592f(fo7Var) ? 256 : 128;
        }
        if (mn4Var.m13570O(i2 & 1, (i2 & 147) != 146)) {
            cy3 cy3Var = (cy3) mn4Var.m13600j(dec.f7919e);
            fo7 m14718d0 = o20.m14718d0(fo7Var, 16.0f, 0.0f, 2);
            boolean z = 0;
            ku1 m10556a = iu1.m10556a(new c90(10.0f, true, new C0917v3((byte) 20)), kt0Var, mn4Var, 6);
            int hashCode = Long.hashCode(mn4Var.f26756T);
            e09 m13603l = mn4Var.m13603l();
            fo7 m559z = af2.m559z(mn4Var, m14718d0);
            s12.f37639c.getClass();
            mn4Var.m13583a0();
            boolean z2 = mn4Var.f26755S;
            wm5 wm5Var = qk6.f34825m0;
            if (z2) {
                mn4Var.m13602k(wm5Var);
            } else {
                mn4Var.m13601j0();
            }
            v11.m20239s(mn4Var, c0596mf4, m10556a);
            v11.m20239s(mn4Var, c0596mf3, m13603l);
            sj8.m18109u(hashCode, mn4Var, c0596mf2, mn4Var);
            Iterator m15986t = pr1.m15986t(mn4Var, m559z, c0596mf, 1683773266, list);
            while (m15986t.hasNext()) {
                o14 o14Var = (o14) m15986t.next();
                ku1 m10556a2 = iu1.m10556a(new c90(8.0f, true, new C0917v3((byte) 20)), kt0Var, mn4Var, 6);
                int hashCode2 = Long.hashCode(mn4Var.f26756T);
                e09 m13603l2 = mn4Var.m13603l();
                fo7 m559z2 = af2.m559z(mn4Var, co7.f5557u);
                s12.f37639c.getClass();
                mn4Var.m13583a0();
                if (mn4Var.f26755S) {
                    mn4Var.m13602k(wm5Var);
                } else {
                    mn4Var.m13601j0();
                }
                v11.m20239s(mn4Var, c0596mf4, m10556a2);
                v11.m20239s(mn4Var, c0596mf3, m13603l2);
                sj8.m18109u(hashCode2, mn4Var, c0596mf2, mn4Var);
                v11.m20239s(mn4Var, c0596mf, m559z2);
                cy3 cy3Var2 = cy3Var;
                mn4 mn4Var2 = mn4Var;
                jcc.m11084b((String) o14Var.f29337a.invoke(mn4Var, Integer.valueOf((int) z)), null, cy3Var.f7051f, yy5.m23189p(12), null, vh4.f44424D, null, yy5.m23189p(1), null, null, 0L, 0, false, 0, 0, null, mn4Var2, 102260736, 0, 261802);
                k1c.m11769a(null, wha.m21392b(16.0f), cy3Var2.f7046a, 0L, 1.0f, 0.0f, y6d.m22687a(1.0f, cy3Var2.f7055j), u11.m19275b0(-912996099, new td1((Object) o14Var, (Object) vl4Var, (byte) 29), mn4Var2), mn4Var2, 12607488, 41);
                mn4Var = mn4Var2;
                mn4Var.m13607p(true);
                z = 0;
                wm5Var = wm5Var;
                cy3Var = cy3Var2;
                c0596mf = c0596mf;
            }
            mn4Var.m13607p(z);
            mn4Var.m13607p(true);
        } else {
            mn4Var.m13573R();
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new dg1(list, vl4Var, fo7Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0288, code lost:
    
        if (r7.f37927d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r4.f37927d == r12) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m9456c(k72 k72Var, tr6 tr6Var, ArrayList arrayList, int i) {
        int i2;
        ka1[] ka1VarArr;
        int i3;
        int i4;
        s62[] s62VarArr;
        boolean z;
        j72 j72Var;
        float f;
        boolean z2;
        boolean z3;
        int i5;
        j72 j72Var2;
        tr6 tr6Var2;
        j72 j72Var3;
        hjb hjbVar;
        s62 s62Var;
        hjb hjbVar2;
        j72 j72Var4;
        int i6;
        s62[] s62VarArr2;
        s62 s62Var2;
        hjb hjbVar3;
        j72 j72Var5;
        j72 j72Var6;
        int i7;
        s62 s62Var3;
        s62[] s62VarArr3;
        int i8;
        s62 s62Var4;
        hjb hjbVar4;
        hjb hjbVar5;
        int size;
        ArrayList arrayList2;
        int i9;
        j72 j72Var7;
        int i10;
        float f2;
        int i11;
        float f3;
        j72 j72Var8;
        int i12;
        int i13;
        int i14;
        j72 j72Var9;
        s62 s62Var5;
        j72 j72Var10;
        int i15;
        k72 k72Var2 = k72Var;
        tr6 tr6Var3 = tr6Var;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i2 = k72Var2.f21800y0;
            ka1VarArr = k72Var2.f21781B0;
            i3 = 0;
        } else {
            i2 = k72Var2.f21801z0;
            ka1VarArr = k72Var2.f21780A0;
            i3 = 2;
        }
        int i16 = i2;
        ka1[] ka1VarArr2 = ka1VarArr;
        int i17 = 0;
        while (i17 < i16) {
            ka1 ka1Var = ka1VarArr2[i17];
            boolean z4 = ka1Var.f21998q;
            j72 j72Var11 = ka1Var.f21982a;
            s62[] s62VarArr4 = j72Var11.f19796P;
            int i18 = 3;
            int i19 = 8;
            float f4 = 0.0f;
            if (z4) {
                i4 = i17;
            } else {
                boolean z5 = ka1Var.f21993l;
                int i20 = (z5 ? 1 : 0) * 2;
                j72 j72Var12 = j72Var11;
                j72 j72Var13 = j72Var12;
                boolean z6 = false;
                int i21 = z5;
                j72 j72Var14 = j72Var12;
                while (!z6) {
                    ka1Var.f21990i++;
                    j72[] j72VarArr = j72Var14.f19830l0;
                    s62[] s62VarArr5 = j72Var14.f19796P;
                    j72VarArr[i21] = null;
                    j72Var14.f19828k0[i21] = null;
                    if (j72Var14.f19818f0 != i19) {
                        j72Var14.m10973h(i21);
                        s62VarArr5[i20].m17838d();
                        int i22 = i20 + 1;
                        s62VarArr5[i22].m17838d();
                        s62VarArr5[i20].m17838d();
                        s62VarArr5[i22].m17838d();
                        if (ka1Var.f21983b == null) {
                            ka1Var.f21983b = j72Var14;
                        }
                        ka1Var.f21985d = j72Var14;
                        int i23 = j72Var14.f19836o0[i21];
                        if (i23 == i18) {
                            int i24 = j72Var14.f19841t[i21];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                ka1Var.f21991j++;
                                float f5 = j72Var14.f19826j0[i21];
                                if (f5 > 0.0f) {
                                    i13 = i17;
                                    ka1Var.f21992k += f5;
                                } else {
                                    i13 = i17;
                                }
                                int i25 = i21;
                                if (j72Var14.f19818f0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f5 < 0.0f) {
                                        ka1Var.f21995n = true;
                                    } else {
                                        ka1Var.f21996o = true;
                                    }
                                    ArrayList arrayList4 = ka1Var.f21989h;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        ka1Var.f21989h = arrayList4;
                                    }
                                    arrayList4.add(j72Var14);
                                }
                                if (ka1Var.f21987f == null) {
                                    ka1Var.f21987f = j72Var14;
                                }
                                j72 j72Var15 = ka1Var.f21988g;
                                if (j72Var15 != null) {
                                    j72Var15.f19828k0[i25] = j72Var14;
                                }
                                ka1Var.f21988g = j72Var14;
                                i15 = i25;
                            } else {
                                i13 = i17;
                                i15 = i21;
                            }
                            if (i15 == 0) {
                                i14 = i15;
                                if (j72Var14.f19839r == 0) {
                                    i14 = i15;
                                    if (j72Var14.f19842u == 0) {
                                        int i26 = j72Var14.f19843v;
                                        i14 = i15;
                                    }
                                }
                            } else {
                                i14 = i15;
                                if (j72Var14.f19840s == 0) {
                                    i14 = i15;
                                    if (j72Var14.f19845x == 0) {
                                        int i27 = j72Var14.f19846y;
                                        i14 = i15;
                                    }
                                }
                            }
                            j72Var9 = j72Var13;
                            if (j72Var9 != j72Var14) {
                                j72Var9.f19830l0[i14] = j72Var14;
                            }
                            s62Var5 = s62VarArr5[i20 + 1].f37929f;
                            if (s62Var5 != null) {
                                j72Var10 = s62Var5.f37927d;
                                s62 s62Var6 = j72Var10.f19796P[i20].f37929f;
                                if (s62Var6 != null) {
                                }
                            }
                            j72Var10 = null;
                            if (j72Var10 != null) {
                                j72Var10 = j72Var14;
                                z6 = true;
                            }
                            j72Var13 = j72Var14;
                            i21 = i14;
                            i18 = 3;
                            i19 = 8;
                            j72Var14 = j72Var10;
                            i17 = i13;
                        }
                    }
                    i13 = i17;
                    i14 = i21;
                    j72Var9 = j72Var13;
                    if (j72Var9 != j72Var14) {
                    }
                    s62Var5 = s62VarArr5[i20 + 1].f37929f;
                    if (s62Var5 != null) {
                    }
                    j72Var10 = null;
                    if (j72Var10 != null) {
                    }
                    j72Var13 = j72Var14;
                    i21 = i14;
                    i18 = 3;
                    i19 = 8;
                    j72Var14 = j72Var10;
                    i17 = i13;
                }
                i4 = i17;
                int i28 = i21;
                j72 j72Var16 = ka1Var.f21983b;
                if (j72Var16 != null) {
                    j72Var16.f19796P[i20].m17838d();
                }
                j72 j72Var17 = ka1Var.f21985d;
                if (j72Var17 != null) {
                    j72Var17.f19796P[i20 + 1].m17838d();
                }
                ka1Var.f21984c = j72Var14;
                if (i28 == true || !ka1Var.f21994m) {
                    ka1Var.f21986e = j72Var11;
                } else {
                    ka1Var.f21986e = j72Var14;
                }
                ka1Var.f21997p = ka1Var.f21996o && ka1Var.f21995n;
            }
            ka1Var.f21998q = true;
            if (arrayList3 == null || arrayList3.contains(j72Var11)) {
                j72 j72Var18 = ka1Var.f21984c;
                j72 j72Var19 = ka1Var.f21983b;
                j72 j72Var20 = ka1Var.f21985d;
                j72 j72Var21 = ka1Var.f21986e;
                float f6 = ka1Var.f21992k;
                int[] iArr = k72Var2.f19836o0;
                s62[] s62VarArr6 = k72Var2.f19796P;
                boolean z7 = iArr[i] == 2;
                if (i == 0) {
                    int i29 = j72Var21.f19822h0;
                    boolean z8 = i29 == 0;
                    s62VarArr = s62VarArr4;
                    boolean z9 = i29 == 1;
                    z = i29 == 2;
                    j72Var = j72Var11;
                    f = f6;
                    z3 = z9;
                    z2 = z8;
                } else {
                    s62VarArr = s62VarArr4;
                    int i30 = j72Var21.f19824i0;
                    boolean z10 = i30 == 0;
                    boolean z11 = i30 == 1;
                    z = i30 == 2;
                    j72Var = j72Var11;
                    f = f6;
                    z2 = z10;
                    z3 = z11;
                }
                boolean z12 = false;
                while (!z12) {
                    s62[] s62VarArr7 = j72Var.f19796P;
                    int[] iArr2 = j72Var.f19836o0;
                    s62 s62Var7 = s62VarArr7[i3];
                    int i31 = z ? 1 : 4;
                    int m17838d = s62Var7.m17838d();
                    boolean z13 = z7;
                    boolean z14 = z;
                    boolean z15 = iArr2[i] == 3 && j72Var.f19841t[i] == 0;
                    s62 s62Var8 = s62Var7.f37929f;
                    if (s62Var8 != null && j72Var != j72Var11) {
                        m17838d = s62Var8.m17838d() + m17838d;
                    }
                    int i32 = m17838d;
                    if (z14 && j72Var != j72Var11 && j72Var != j72Var19) {
                        i31 = 8;
                    }
                    j72 j72Var22 = j72Var11;
                    s62 s62Var9 = s62Var7.f37929f;
                    if (s62Var9 != null) {
                        boolean z16 = z15;
                        hjb hjbVar6 = s62Var7.f37932i;
                        hjb hjbVar7 = s62Var9.f37932i;
                        if (j72Var == j72Var19) {
                            tr6Var3.m19011f(hjbVar6, hjbVar7, i32, 6);
                        } else {
                            tr6Var3.m19011f(hjbVar6, hjbVar7, i32, 8);
                        }
                        if (z16 && !z14) {
                            i31 = 5;
                        }
                        tr6Var3.m19010e(s62Var7.f37932i, s62Var7.f37929f.f37932i, i32, (j72Var == j72Var19 && z14 && j72Var.f19798R[i]) ? 5 : i31);
                    }
                    if (z13) {
                        if (j72Var.f19818f0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            tr6Var3.m19011f(s62VarArr7[i3 + 1].f37932i, s62VarArr7[i3].f37932i, 0, 5);
                        }
                        tr6Var3.m19011f(s62VarArr7[i3].f37932i, s62VarArr6[i3].f37932i, i12, 8);
                    }
                    s62 s62Var10 = s62VarArr7[i3 + 1].f37929f;
                    if (s62Var10 != null) {
                        j72Var8 = s62Var10.f37927d;
                        s62 s62Var11 = j72Var8.f19796P[i3].f37929f;
                        if (s62Var11 != null) {
                        }
                    }
                    j72Var8 = null;
                    if (j72Var8 != null) {
                        j72Var = j72Var8;
                    } else {
                        z12 = true;
                    }
                    j72Var11 = j72Var22;
                    z7 = z13;
                    z = z14;
                }
                boolean z17 = z7;
                boolean z18 = z;
                if (j72Var20 != null) {
                    int i33 = i3 + 1;
                    if (j72Var18.f19796P[i33].f37929f != null) {
                        s62 s62Var12 = j72Var20.f19796P[i33];
                        if (j72Var20.f19836o0[i] == 3 && j72Var20.f19841t[i] == 0 && !z18) {
                            s62 s62Var13 = s62Var12.f37929f;
                            if (s62Var13.f37927d == k72Var2) {
                                tr6Var3.m19010e(s62Var12.f37932i, s62Var13.f37932i, -s62Var12.m17838d(), 5);
                                tr6Var3.m19012g(s62Var12.f37932i, j72Var18.f19796P[i33].f37929f.f37932i, -s62Var12.m17838d(), 6);
                            }
                        }
                        if (z18) {
                            s62 s62Var14 = s62Var12.f37929f;
                            if (s62Var14.f37927d == k72Var2) {
                                tr6Var3.m19010e(s62Var12.f37932i, s62Var14.f37932i, -s62Var12.m17838d(), 4);
                            }
                        }
                        tr6Var3.m19012g(s62Var12.f37932i, j72Var18.f19796P[i33].f37929f.f37932i, -s62Var12.m17838d(), 6);
                    }
                }
                if (z17) {
                    int i34 = i3 + 1;
                    hjb hjbVar8 = s62VarArr6[i34].f37932i;
                    s62 s62Var15 = j72Var18.f19796P[i34];
                    tr6Var3.m19011f(hjbVar8, s62Var15.f37932i, s62Var15.m17838d(), 8);
                }
                ArrayList arrayList5 = ka1Var.f21989h;
                if (arrayList5 != null && (size = arrayList5.size()) > 1) {
                    if (ka1Var.f21995n && !ka1Var.f21997p) {
                        f = ka1Var.f21991j;
                    }
                    j72 j72Var23 = null;
                    float f7 = 0.0f;
                    int i35 = 0;
                    while (i35 < size) {
                        j72 j72Var24 = (j72) arrayList5.get(i35);
                        float[] fArr = j72Var24.f19826j0;
                        s62[] s62VarArr8 = j72Var24.f19796P;
                        float f8 = fArr[i];
                        if (f8 < f4) {
                            if (ka1Var.f21997p) {
                                arrayList2 = arrayList5;
                                i9 = size;
                                tr6Var3.m19010e(s62VarArr8[i3 + 1].f37932i, s62VarArr8[i3].f37932i, 0, 4);
                                f3 = f7;
                                i10 = i16;
                                f2 = f4;
                                f7 = f3;
                                i11 = i35;
                                i35 = i11 + 1;
                                i16 = i10;
                                arrayList5 = arrayList2;
                                size = i9;
                                f4 = f2;
                            } else {
                                f8 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList5;
                        i9 = size;
                        if (f8 == f4) {
                            f3 = f7;
                            tr6Var3.m19010e(s62VarArr8[i3 + 1].f37932i, s62VarArr8[i3].f37932i, 0, 8);
                            i10 = i16;
                            f2 = f4;
                            f7 = f3;
                            i11 = i35;
                            i35 = i11 + 1;
                            i16 = i10;
                            arrayList5 = arrayList2;
                            size = i9;
                            f4 = f2;
                        } else {
                            float f9 = f7;
                            if (j72Var23 != null) {
                                s62[] s62VarArr9 = j72Var23.f19796P;
                                hjb hjbVar9 = s62VarArr9[i3].f37932i;
                                int i36 = i3 + 1;
                                hjb hjbVar10 = s62VarArr9[i36].f37932i;
                                hjb hjbVar11 = s62VarArr8[i3].f37932i;
                                hjb hjbVar12 = s62VarArr8[i36].f37932i;
                                s90 m19017l = tr6Var3.m19017l();
                                j72Var7 = j72Var24;
                                float f10 = f4;
                                m19017l.f38082b = f10;
                                f2 = f10;
                                if (f == f10 || f9 == f8) {
                                    i11 = i35;
                                    i10 = i16;
                                    m19017l.f38084d.m10108g(hjbVar9, 1.0f);
                                    m19017l.f38084d.m10108g(hjbVar10, -1.0f);
                                    m19017l.f38084d.m10108g(hjbVar12, 1.0f);
                                    m19017l.f38084d.m10108g(hjbVar11, -1.0f);
                                } else {
                                    i90 i90Var = m19017l.f38084d;
                                    if (f9 == f2) {
                                        i11 = i35;
                                        i90Var.m10108g(hjbVar9, 1.0f);
                                        m19017l.f38084d.m10108g(hjbVar10, -1.0f);
                                        i10 = i16;
                                    } else {
                                        i11 = i35;
                                        i10 = i16;
                                        if (f8 == f4) {
                                            i90Var.m10108g(hjbVar11, 1.0f);
                                            m19017l.f38084d.m10108g(hjbVar12, -1.0f);
                                        } else {
                                            float f11 = (f9 / f) / (f8 / f);
                                            i90Var.m10108g(hjbVar9, 1.0f);
                                            m19017l.f38084d.m10108g(hjbVar10, -1.0f);
                                            m19017l.f38084d.m10108g(hjbVar12, f11);
                                            m19017l.f38084d.m10108g(hjbVar11, -f11);
                                        }
                                    }
                                }
                                tr6Var3.m19008c(m19017l);
                            } else {
                                j72Var7 = j72Var24;
                                i10 = i16;
                                f2 = f4;
                                i11 = i35;
                            }
                            f7 = f8;
                            j72Var23 = j72Var7;
                            i35 = i11 + 1;
                            i16 = i10;
                            arrayList5 = arrayList2;
                            size = i9;
                            f4 = f2;
                        }
                    }
                }
                i5 = i16;
                if (j72Var19 == null || !(j72Var19 == j72Var20 || z18)) {
                    j72Var2 = j72Var20;
                    if (z2 && j72Var19 != null) {
                        int i37 = ka1Var.f21991j;
                        boolean z19 = i37 > 0 && ka1Var.f21990i == i37;
                        j72 j72Var25 = j72Var19;
                        j72 j72Var26 = j72Var25;
                        while (true) {
                            s62[] s62VarArr10 = j72Var26.f19796P;
                            if (j72Var25 == null) {
                                break;
                            }
                            s62[] s62VarArr11 = j72Var25.f19796P;
                            j72 j72Var27 = j72Var25.f19830l0[i];
                            while (true) {
                                if (j72Var27 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (j72Var27.f19818f0 != 8) {
                                    break;
                                } else {
                                    j72Var27 = j72Var27.f19830l0[i];
                                }
                            }
                            if (j72Var27 != null || j72Var25 == j72Var2) {
                                s62 s62Var16 = s62VarArr11[i3];
                                hjb hjbVar13 = s62Var16.f37932i;
                                s62 s62Var17 = s62Var16.f37929f;
                                hjb hjbVar14 = s62Var17 != null ? s62Var17.f37932i : null;
                                if (j72Var26 != j72Var25) {
                                    hjbVar14 = s62VarArr10[i3 + 1].f37932i;
                                } else if (j72Var25 == j72Var19) {
                                    s62 s62Var18 = s62VarArr[i3].f37929f;
                                    hjbVar14 = s62Var18 != null ? s62Var18.f37932i : null;
                                }
                                int m17838d2 = s62Var16.m17838d();
                                int i38 = i3 + 1;
                                int m17838d3 = s62VarArr11[i38].m17838d();
                                if (j72Var27 != null) {
                                    s62Var2 = j72Var27.f19796P[i3];
                                    s62VarArr2 = s62VarArr10;
                                    hjbVar3 = s62Var2.f37932i;
                                } else {
                                    s62VarArr2 = s62VarArr10;
                                    s62Var2 = j72Var18.f19796P[i38].f37929f;
                                    hjbVar3 = s62Var2 != null ? s62Var2.f37932i : null;
                                }
                                hjb hjbVar15 = s62VarArr11[i38].f37932i;
                                if (s62Var2 != null) {
                                    m17838d3 += s62Var2.m17838d();
                                }
                                int m17838d4 = s62VarArr2[i38].m17838d() + m17838d2;
                                if (hjbVar13 == null || hjbVar14 == null || hjbVar3 == null || hjbVar15 == null) {
                                    j72Var5 = j72Var27;
                                    j72Var6 = j72Var26;
                                    i7 = 8;
                                } else {
                                    if (j72Var25 == j72Var19) {
                                        m17838d4 = j72Var19.f19796P[i3].m17838d();
                                    }
                                    int i39 = m17838d4;
                                    if (j72Var25 == j72Var2) {
                                        m17838d3 = j72Var2.f19796P[i38].m17838d();
                                    }
                                    j72Var5 = j72Var27;
                                    j72Var6 = j72Var26;
                                    i7 = 8;
                                    tr6Var.m19007b(hjbVar13, hjbVar14, i39, 0.5f, hjbVar3, hjbVar15, m17838d3, z19 ? 8 : 5);
                                }
                            } else {
                                j72Var5 = j72Var27;
                                j72Var6 = j72Var26;
                                i7 = i6;
                            }
                            if (j72Var25.f19818f0 != i7) {
                                j72Var6 = j72Var25;
                            }
                            j72Var25 = j72Var5;
                            j72Var26 = j72Var6;
                        }
                    } else {
                        int i40 = 8;
                        if (z3 && j72Var19 != null) {
                            int i41 = ka1Var.f21991j;
                            boolean z20 = i41 > 0 && ka1Var.f21990i == i41;
                            j72 j72Var28 = j72Var19;
                            j72 j72Var29 = j72Var28;
                            while (true) {
                                s62[] s62VarArr12 = j72Var28.f19796P;
                                if (j72Var29 == null) {
                                    break;
                                }
                                s62[] s62VarArr13 = j72Var29.f19796P;
                                j72 j72Var30 = j72Var29.f19830l0[i];
                                while (j72Var30 != null && j72Var30.f19818f0 == i40) {
                                    j72Var30 = j72Var30.f19830l0[i];
                                }
                                if (j72Var29 == j72Var19 || j72Var29 == j72Var2 || j72Var30 == null) {
                                    j72Var3 = j72Var28;
                                } else {
                                    if (j72Var30 == j72Var2) {
                                        j72Var30 = null;
                                    }
                                    s62 s62Var19 = s62VarArr13[i3];
                                    hjb hjbVar16 = s62Var19.f37932i;
                                    int i42 = i3 + 1;
                                    hjb hjbVar17 = s62VarArr12[i42].f37932i;
                                    int m17838d5 = s62Var19.m17838d();
                                    int m17838d6 = s62VarArr13[i42].m17838d();
                                    if (j72Var30 != null) {
                                        s62Var = j72Var30.f19796P[i3];
                                        hjbVar = s62Var.f37932i;
                                        j72Var3 = j72Var28;
                                        s62 s62Var20 = s62Var.f37929f;
                                        hjbVar2 = s62Var20 != null ? s62Var20.f37932i : null;
                                    } else {
                                        j72Var3 = j72Var28;
                                        s62 s62Var21 = j72Var2.f19796P[i3];
                                        hjbVar = s62Var21 != null ? s62Var21.f37932i : null;
                                        hjb hjbVar18 = s62VarArr13[i42].f37932i;
                                        s62Var = s62Var21;
                                        hjbVar2 = hjbVar18;
                                    }
                                    if (s62Var != null) {
                                        m17838d6 += s62Var.m17838d();
                                    }
                                    int m17838d7 = s62VarArr12[i42].m17838d() + m17838d5;
                                    j72 j72Var31 = j72Var30;
                                    int i43 = m17838d6;
                                    int i44 = z20 ? 8 : 4;
                                    if (hjbVar16 == null || hjbVar17 == null || hjbVar == null || hjbVar2 == null) {
                                        j72Var4 = j72Var31;
                                    } else {
                                        hjb hjbVar19 = hjbVar;
                                        j72Var4 = j72Var31;
                                        tr6Var.m19007b(hjbVar16, hjbVar17, m17838d7, 0.5f, hjbVar19, hjbVar2, i43, i44);
                                    }
                                    j72Var30 = j72Var4;
                                }
                                if (j72Var29.f19818f0 != 8) {
                                    j72Var3 = j72Var29;
                                }
                                j72Var29 = j72Var30;
                                i40 = 8;
                                j72Var28 = j72Var3;
                            }
                            tr6Var2 = tr6Var;
                            s62 s62Var22 = j72Var19.f19796P[i3];
                            s62 s62Var23 = s62VarArr[i3].f37929f;
                            int i45 = i3 + 1;
                            s62 s62Var24 = j72Var2.f19796P[i45];
                            s62 s62Var25 = j72Var18.f19796P[i45].f37929f;
                            if (s62Var23 != null) {
                                if (j72Var19 != j72Var2) {
                                    tr6Var2.m19010e(s62Var22.f37932i, s62Var23.f37932i, s62Var22.m17838d(), 5);
                                } else if (s62Var25 != null) {
                                    tr6Var2.m19007b(s62Var22.f37932i, s62Var23.f37932i, s62Var22.m17838d(), 0.5f, s62Var24.f37932i, s62Var25.f37932i, s62Var24.m17838d(), 5);
                                }
                            }
                            if (s62Var25 != null && j72Var19 != j72Var2) {
                                tr6Var2.m19010e(s62Var24.f37932i, s62Var25.f37932i, -s62Var24.m17838d(), 5);
                            }
                            if ((!z2 || z3) && j72Var19 != null && j72Var19 != j72Var2) {
                                s62[] s62VarArr14 = j72Var19.f19796P;
                                s62Var3 = s62VarArr14[i3];
                                if (j72Var2 == null) {
                                    j72Var2 = j72Var19;
                                }
                                s62VarArr3 = j72Var2.f19796P;
                                i8 = i3 + 1;
                                s62Var4 = s62VarArr3[i8];
                                s62 s62Var26 = s62Var3.f37929f;
                                hjbVar4 = s62Var26 == null ? s62Var26.f37932i : null;
                                s62 s62Var27 = s62Var4.f37929f;
                                hjbVar5 = s62Var27 == null ? s62Var27.f37932i : null;
                                if (j72Var18 != j72Var2) {
                                    s62 s62Var28 = j72Var18.f19796P[i8].f37929f;
                                    hjbVar5 = s62Var28 != null ? s62Var28.f37932i : null;
                                }
                                if (j72Var19 == j72Var2) {
                                    s62Var4 = s62VarArr14[i8];
                                }
                                if (hjbVar4 != null && hjbVar5 != null) {
                                    tr6Var2.m19007b(s62Var3.f37932i, hjbVar4, s62Var3.m17838d(), 0.5f, hjbVar5, s62Var4.f37932i, s62VarArr3[i8].m17838d(), 5);
                                }
                            }
                        }
                    }
                } else {
                    s62 s62Var29 = s62VarArr[i3];
                    int i46 = i3 + 1;
                    s62 s62Var30 = j72Var18.f19796P[i46];
                    s62 s62Var31 = s62Var29.f37929f;
                    hjb hjbVar20 = s62Var31 != null ? s62Var31.f37932i : null;
                    s62 s62Var32 = s62Var30.f37929f;
                    hjb hjbVar21 = s62Var32 != null ? s62Var32.f37932i : null;
                    s62 s62Var33 = j72Var19.f19796P[i3];
                    if (j72Var20 != null) {
                        s62Var30 = j72Var20.f19796P[i46];
                    }
                    if (hjbVar20 == null || hjbVar21 == null) {
                        j72Var2 = j72Var20;
                    } else {
                        float f12 = i == 0 ? j72Var21.f19812c0 : j72Var21.f19814d0;
                        int m17838d8 = s62Var33.m17838d();
                        int m17838d9 = s62Var30.m17838d();
                        hjb hjbVar22 = s62Var33.f37932i;
                        hjb hjbVar23 = s62Var30.f37932i;
                        hjb hjbVar24 = hjbVar20;
                        j72Var2 = j72Var20;
                        tr6Var3.m19007b(hjbVar22, hjbVar24, m17838d8, f12, hjbVar21, hjbVar23, m17838d9, 7);
                    }
                }
                tr6Var2 = tr6Var;
                if (!z2) {
                }
                s62[] s62VarArr142 = j72Var19.f19796P;
                s62Var3 = s62VarArr142[i3];
                if (j72Var2 == null) {
                }
                s62VarArr3 = j72Var2.f19796P;
                i8 = i3 + 1;
                s62Var4 = s62VarArr3[i8];
                s62 s62Var262 = s62Var3.f37929f;
                if (s62Var262 == null) {
                }
                s62 s62Var272 = s62Var4.f37929f;
                if (s62Var272 == null) {
                }
                if (j72Var18 != j72Var2) {
                }
                if (j72Var19 == j72Var2) {
                }
                if (hjbVar4 != null) {
                    tr6Var2.m19007b(s62Var3.f37932i, hjbVar4, s62Var3.m17838d(), 0.5f, hjbVar5, s62Var4.f37932i, s62VarArr3[i8].m17838d(), 5);
                }
            } else {
                i5 = i16;
            }
            i17 = i4 + 1;
            k72Var2 = k72Var;
            tr6Var3 = tr6Var;
            arrayList3 = arrayList;
            i16 = i5;
        }
    }

    /* renamed from: d */
    public static boolean m9457d(oy3 oy3Var) {
        tu8 tu8Var = new tu8(8);
        int i = hs9.m9677a(oy3Var, tu8Var).f16835w;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        oy3Var.mo2141o(tu8Var.f41168a, 0, 4);
        tu8Var.m19100M(0);
        int m19111m = tu8Var.m19111m();
        if (m19111m == 1463899717) {
            return true;
        }
        ut4.m20074l("WavHeaderReader", "Unsupported form type: " + m19111m);
        return false;
    }

    /* renamed from: e */
    public static void m9458e(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public static boolean m9459f(Object[] objArr, d14 d14Var) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Objects.equals(objArr[i], d14Var)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m9460g(CharSequence charSequence, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m9462i(charSequence, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m9461h(CharSequence charSequence, Set set) {
        int length;
        int i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int length2 = str.length();
            if (length2 != 0 && length2 <= charSequence.length() && (length = charSequence.length() - length2) >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (Character.toLowerCase(charSequence.charAt(i2 + i3)) != Character.toLowerCase(str.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else if ((i2 <= 0 || !Character.isLetterOrDigit(charSequence.charAt(i2 - 1))) && ((i = i2 + length2) >= charSequence.length() || !Character.isLetterOrDigit(charSequence.charAt(i)))) {
                            return true;
                        }
                    }
                    if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m9462i(CharSequence charSequence, String str) {
        int length;
        int length2 = str.length();
        if (length2 != 0 && length2 <= charSequence.length() && (length = charSequence.length() - length2) >= 0) {
            int i = 0;
            while (true) {
                for (int i2 = 0; i2 < length2; i2++) {
                    if (Character.toLowerCase(charSequence.charAt(i + i2)) != Character.toLowerCase(str.charAt(i2))) {
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m9463j(long j, jw9 jw9Var) {
        float f = jw9Var.f21272a;
        float f2 = jw9Var.f21274c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = jw9Var.f21273b;
        float f4 = jw9Var.f21275d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    /* renamed from: k */
    public static final void m9464k(Map map, Map map2) {
        map.getClass();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str) && muc.m13753K(map.get(str))) {
                Object obj = map.get(str);
                obj.getClass();
                Map m13773i = muc.m13773i(obj);
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    rf6.m17321r(str, "' is an object in destination but not in map", "'");
                    return;
                }
                m9464k(m13773i, map3);
            } else {
                map.put(str, value);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r10 = r9.getContentDescription();
        r11 = r9.getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (m9460g(r10, p000.a13.f75y) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (m9460g(r11, p000.a13.f75y) == false) goto L28;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9465l(AccessibilityNodeInfo accessibilityNodeInfo) {
        int childCount;
        CharSequence text;
        CharSequence text2;
        accessibilityNodeInfo.getClass();
        h90 m16875a = qs9.m16875a();
        m16875a.addLast(accessibilityNodeInfo);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (!m16875a.isEmpty() && i < 100) {
            try {
                AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                i4--;
                i++;
                if (!z && (text2 = accessibilityNodeInfo2.getText()) != null && text2.length() != 0 && stb.m18246L0(text2, "Kahf Guard", true)) {
                    z = true;
                }
                if (!z3 && (text = accessibilityNodeInfo2.getText()) != null && m9460g(text, a13.f76z)) {
                    z3 = true;
                }
                if (z && z2) {
                    m16875a.clear();
                    return true;
                }
                if (i2 < 24 && (childCount = accessibilityNodeInfo2.getChildCount()) > 0) {
                    for (int i5 = 0; i5 < childCount; i5++) {
                        AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i5);
                        if (child != null) {
                            m16875a.addLast(child);
                            i3++;
                        }
                    }
                }
                if (i4 == 0) {
                    i2++;
                    i4 = i3;
                    i3 = 0;
                }
            } catch (Throwable th) {
                m16875a.clear();
                throw th;
            }
        }
        m16875a.clear();
        return false;
    }

    /* renamed from: m */
    public static boolean m9466m(AccessibilityNodeInfo accessibilityNodeInfo) {
        int childCount;
        accessibilityNodeInfo.getClass();
        h90 m16875a = qs9.m16875a();
        m16875a.addLast(accessibilityNodeInfo);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (!m16875a.isEmpty() && i < 100) {
            try {
                AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                i4--;
                if (accessibilityNodeInfo2.isVisibleToUser()) {
                    i++;
                    CharSequence text = accessibilityNodeInfo2.getText();
                    CharSequence contentDescription = accessibilityNodeInfo2.getContentDescription();
                    if (!z && text != null && m9460g(text, a13.f48A)) {
                        z = true;
                    }
                    if (!z2 && ((contentDescription != null && m9460g(contentDescription, a13.f49B)) || (text != null && m9460g(text, a13.f49B)))) {
                        z2 = true;
                    }
                    if (!z3 && ((contentDescription != null && m9460g(contentDescription, a13.f75y)) || (text != null && m9460g(text, a13.f75y)))) {
                        z3 = true;
                    }
                    if (z && z2 && z3) {
                        m16875a.clear();
                        return true;
                    }
                    if (i2 < 24 && (childCount = accessibilityNodeInfo2.getChildCount()) > 0) {
                        int min = Math.min(childCount, 10);
                        for (int i5 = 0; i5 < min; i5++) {
                            AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i5);
                            if (child != null) {
                                m16875a.addLast(child);
                                i3++;
                            }
                        }
                    }
                }
                if (i4 == 0) {
                    i2++;
                    i4 = i3;
                    i3 = 0;
                }
            } catch (Throwable th) {
                m16875a.clear();
                throw th;
            }
        }
        m16875a.clear();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0014, B:7:0x001e, B:9:0x002c, B:11:0x0038, B:18:0x0050, B:20:0x0056, B:24:0x0064, B:26:0x006f, B:32:0x00bd, B:34:0x00c3, B:36:0x00cc, B:38:0x00d2, B:48:0x0075, B:50:0x007b, B:57:0x0093, B:59:0x0099, B:63:0x0082, B:68:0x00a2, B:74:0x003f), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0014, B:7:0x001e, B:9:0x002c, B:11:0x0038, B:18:0x0050, B:20:0x0056, B:24:0x0064, B:26:0x006f, B:32:0x00bd, B:34:0x00c3, B:36:0x00cc, B:38:0x00d2, B:48:0x0075, B:50:0x007b, B:57:0x0093, B:59:0x0099, B:63:0x0082, B:68:0x00a2, B:74:0x003f), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0014, B:7:0x001e, B:9:0x002c, B:11:0x0038, B:18:0x0050, B:20:0x0056, B:24:0x0064, B:26:0x006f, B:32:0x00bd, B:34:0x00c3, B:36:0x00cc, B:38:0x00d2, B:48:0x0075, B:50:0x007b, B:57:0x0093, B:59:0x0099, B:63:0x0082, B:68:0x00a2, B:74:0x003f), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004d  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9467n(AccessibilityNodeInfo accessibilityNodeInfo, Set set) {
        CharSequence charSequence;
        CharSequence contentDescription;
        boolean z;
        int length;
        boolean z2;
        CharSequence m18242B1;
        int childCount;
        int length2;
        boolean z3;
        accessibilityNodeInfo.getClass();
        set.getClass();
        h90 m16875a = qs9.m16875a();
        m16875a.addLast(accessibilityNodeInfo);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (!m16875a.isEmpty() && i < 100) {
            try {
                AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                i5--;
                if (accessibilityNodeInfo2.isVisibleToUser()) {
                    i++;
                    CharSequence text = accessibilityNodeInfo2.getText();
                    CharSequence charSequence2 = null;
                    if (text != null) {
                        if (!stb.m18260Z0(text) && 3 <= (length2 = text.length()) && length2 < 201) {
                            z3 = true;
                            if (z3) {
                                text = null;
                            }
                            if (text != null && (charSequence = stb.m18242B1(text)) != null && charSequence.length() > 0) {
                                if (charSequence != null || !m9461h(charSequence, set) || (i2 = i2 + 1) < 1) {
                                    contentDescription = accessibilityNodeInfo2.getContentDescription();
                                    if (contentDescription != null) {
                                        if (!stb.m18260Z0(contentDescription) && 3 <= (length = contentDescription.length()) && length < 201) {
                                            z2 = true;
                                            if (z2) {
                                                contentDescription = null;
                                            }
                                            if (contentDescription != null && (m18242B1 = stb.m18242B1(contentDescription)) != null && m18242B1.length() > 0) {
                                                charSequence2 = m18242B1;
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                        }
                                        if (contentDescription != null) {
                                            charSequence2 = m18242B1;
                                        }
                                    }
                                    if (charSequence2 != null || !m9461h(charSequence2, set) || (i2 = i2 + 1) < 1) {
                                        z = false;
                                        if (!z) {
                                            m16875a.clear();
                                            return true;
                                        }
                                        if (i3 < 24 && (childCount = accessibilityNodeInfo2.getChildCount()) > 0) {
                                            int min = Math.min(childCount, 10);
                                            for (int i6 = 0; i6 < min; i6++) {
                                                AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i6);
                                                if (child != null) {
                                                    m16875a.addLast(child);
                                                    i4++;
                                                }
                                            }
                                        }
                                    }
                                }
                                z = true;
                                if (!z) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                        if (text != null) {
                            if (charSequence != null) {
                            }
                            contentDescription = accessibilityNodeInfo2.getContentDescription();
                            if (contentDescription != null) {
                            }
                            if (charSequence2 != null) {
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                    }
                    charSequence = null;
                    if (charSequence != null) {
                    }
                    contentDescription = accessibilityNodeInfo2.getContentDescription();
                    if (contentDescription != null) {
                    }
                    if (charSequence2 != null) {
                    }
                    z = false;
                    if (!z) {
                    }
                }
                if (i5 == 0) {
                    i3++;
                    i5 = i4;
                    i4 = 0;
                }
            } catch (Throwable th) {
                m16875a.clear();
                throw th;
            }
        }
        m16875a.clear();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x04ac, code lost:
    
        if (r8.isSelected() != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04b4, code lost:
    
        if (m9460g(r6, p000.a13.f66p) == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04b9, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04bc, code lost:
    
        if (r3 < 2) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04be, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04c0, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04a6, code lost:
    
        if (m9460g(r6, p000.a13.f64n) != false) goto L354;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0419 A[Catch: all -> 0x044e, TryCatch #5 {all -> 0x044e, blocks: (B:183:0x0401, B:187:0x040b, B:189:0x0419, B:191:0x0421, B:193:0x0429, B:195:0x0435, B:197:0x043b, B:199:0x0443, B:201:0x0449, B:209:0x04d0, B:211:0x04d6, B:213:0x04df, B:215:0x04e5, B:233:0x045c, B:235:0x0462, B:236:0x046a, B:238:0x0470, B:240:0x047c, B:247:0x0486, B:249:0x0496, B:254:0x04a8, B:256:0x04ae, B:265:0x049e), top: B:182:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9468o(String str, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int childCount;
        int childCount2;
        CharSequence className;
        CharSequence contentDescription;
        AccessibilityNodeInfo parent;
        CharSequence className2;
        h90 m16875a;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        boolean z;
        CharSequence contentDescription2;
        int childCount3;
        CharSequence text;
        int childCount4;
        int length;
        boolean z2;
        int childCount5;
        boolean z3;
        boolean z4;
        boolean contains;
        int childCount6;
        CharSequence className3;
        str.getClass();
        if (accessibilityNodeInfo != null) {
            int i3 = 100;
            switch (str.hashCode()) {
                case -2103713194:
                    i = 0;
                    if (!str.equals("com.whatsapp.w4b")) {
                        return false;
                    }
                    m16875a = qs9.m16875a();
                    m16875a.addLast(accessibilityNodeInfo);
                    int i4 = i;
                    int i5 = i4;
                    int i6 = i5;
                    int i7 = i6;
                    int i8 = i7;
                    i2 = 1;
                    while (!m16875a.isEmpty() && i4 < 100) {
                        try {
                            accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                            i2--;
                            if (!accessibilityNodeInfo2.isVisibleToUser()) {
                                i4++;
                                String viewIdResourceName = accessibilityNodeInfo2.getViewIdResourceName();
                                if (viewIdResourceName != null && a13.f54d.contains(viewIdResourceName)) {
                                    int i9 = i5 + 1;
                                    if (stb.m18246L0(viewIdResourceName, "navigation_bar_item_large_label_view", i) && (text = accessibilityNodeInfo2.getText()) != null && m9471r(text, a13.f65o) && accessibilityNodeInfo2.isSelected()) {
                                        i5 += 2;
                                        i8 = 1;
                                    } else {
                                        i5 = i9;
                                    }
                                    if (i5 >= 2) {
                                        z = true;
                                        if (!z) {
                                            m16875a.clear();
                                            return true;
                                        }
                                        if (i6 < 24 && (childCount3 = accessibilityNodeInfo2.getChildCount()) > 0) {
                                            int min = Math.min(childCount3, 10);
                                            for (int i10 = 0; i10 < min; i10++) {
                                                AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i10);
                                                if (child != null) {
                                                    m16875a.addLast(child);
                                                    i7++;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i11 = i8;
                                if (i11 == 0 && (contentDescription2 = accessibilityNodeInfo2.getContentDescription()) != null) {
                                    Iterator it = a13.f63m.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            String str2 = (String) it.next();
                                            int length2 = str2.length();
                                            if (length2 != 0 && length2 <= contentDescription2.length()) {
                                                for (int i12 = 0; i12 < length2; i12++) {
                                                    if (!ab7.m332r(contentDescription2.charAt(i12), str2.charAt(i12), true)) {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                i8 = i11;
                                z = false;
                                if (!z) {
                                }
                            }
                            if (i2 != 0) {
                                i6++;
                                i2 = i7;
                                i7 = 0;
                            }
                            i = 0;
                        } finally {
                            m16875a.clear();
                        }
                    }
                    m16875a.clear();
                    return false;
                case -2075712516:
                    if (!str.equals("com.google.android.youtube")) {
                        return false;
                    }
                    h90 m16875a2 = qs9.m16875a();
                    m16875a2.addLast(accessibilityNodeInfo);
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 1;
                    while (!m16875a2.isEmpty() && i13 < 100) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo3 = (AccessibilityNodeInfo) m16875a2.removeFirst();
                            i17--;
                            if (accessibilityNodeInfo3.isVisibleToUser()) {
                                i13++;
                                String viewIdResourceName2 = accessibilityNodeInfo3.getViewIdResourceName();
                                if (viewIdResourceName2 != null && a13.f51a.contains(viewIdResourceName2) && (i14 = i14 + 1) >= 2) {
                                    m16875a2.clear();
                                    return true;
                                }
                                if (i15 < 24 && (childCount = accessibilityNodeInfo3.getChildCount()) > 0) {
                                    int min2 = Math.min(childCount, 10);
                                    for (int i18 = 0; i18 < min2; i18++) {
                                        AccessibilityNodeInfo child2 = accessibilityNodeInfo3.getChild(i18);
                                        if (child2 != null) {
                                            m16875a2.addLast(child2);
                                            i16++;
                                        }
                                    }
                                }
                            }
                            if (i17 == 0) {
                                i15++;
                                i17 = i16;
                                i16 = 0;
                            }
                        } catch (Throwable th) {
                            m16875a2.clear();
                            throw th;
                        }
                    }
                    m16875a2.clear();
                    return false;
                case -1897170512:
                    if (!str.equals("org.telegram.messenger")) {
                        return false;
                    }
                    h90 m16875a3 = qs9.m16875a();
                    m16875a3.addLast(accessibilityNodeInfo);
                    int i19 = 1;
                    int i20 = 0;
                    boolean z5 = false;
                    boolean z6 = false;
                    int i21 = 0;
                    boolean z7 = false;
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    int i22 = 0;
                    while (!m16875a3.isEmpty() && i20 < i3) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo4 = (AccessibilityNodeInfo) m16875a3.removeFirst();
                            i19--;
                            if (accessibilityNodeInfo4.isVisibleToUser()) {
                                i20++;
                                if (!z5 && !z6 && (contentDescription = accessibilityNodeInfo4.getContentDescription()) != null && accessibilityNodeInfo4.isSelected()) {
                                    boolean m9471r = m9471r(contentDescription, a13.f68r);
                                    boolean z13 = !m9471r && m9471r(contentDescription, a13.f69s);
                                    if ((m9471r || z13) && (parent = accessibilityNodeInfo4.getParent()) != null && (className2 = parent.getClassName()) != null && m9462i(className2, "RecyclerView")) {
                                        if (m9471r) {
                                            z5 = true;
                                        } else {
                                            z6 = true;
                                        }
                                    }
                                }
                                if (!z7 && (className = accessibilityNodeInfo4.getClassName()) != null && m9462i(className, "EditText")) {
                                    CharSequence contentDescription3 = accessibilityNodeInfo4.getContentDescription();
                                    CharSequence text2 = accessibilityNodeInfo4.getText();
                                    if (contentDescription3 != null && m9471r(contentDescription3, a13.f74x) && text2 != null && text2.length() >= 2 && !stb.m18260Z0(text2)) {
                                        z7 = true;
                                    }
                                }
                                CharSequence text3 = accessibilityNodeInfo4.getText();
                                if (text3 != null) {
                                    if (!z8 && m9471r(text3, a13.f70t)) {
                                        z8 = true;
                                    }
                                    if (!z9 && m9471r(text3, a13.f71u)) {
                                        z9 = true;
                                    }
                                    if (!z10 && m9471r(text3, a13.f72v)) {
                                        z10 = true;
                                    }
                                    if (!z11 && m9471r(text3, a13.f73w)) {
                                        z11 = true;
                                    }
                                    if (!z12 && m9471r(text3, a13.f68r)) {
                                        z12 = true;
                                    }
                                }
                                if ((!z5 || ((!z8 || !z9) && ((!z10 || !z11) && !z12))) && (!z6 || !z8 || !z9)) {
                                    if (i21 < 24 && (childCount2 = accessibilityNodeInfo4.getChildCount()) > 0) {
                                        int min3 = Math.min(childCount2, 10);
                                        for (int i23 = 0; i23 < min3; i23++) {
                                            AccessibilityNodeInfo child3 = accessibilityNodeInfo4.getChild(i23);
                                            if (child3 != null) {
                                                m16875a3.addLast(child3);
                                                i22++;
                                            }
                                        }
                                    }
                                }
                            }
                            if (i19 == 0) {
                                i21++;
                                i19 = i22;
                                i3 = 100;
                                i22 = 0;
                            } else {
                                i3 = 100;
                            }
                        } finally {
                            m16875a3.clear();
                        }
                    }
                    m16875a3.clear();
                    return (z5 && ((z8 && z9) || ((z10 && z11) || z12))) || (z6 && z8 && z9) || (!z5 && !z6 && z7 && z8 && z9);
                case -1547699361:
                    i = 0;
                    if (!str.equals("com.whatsapp")) {
                        return false;
                    }
                    m16875a = qs9.m16875a();
                    m16875a.addLast(accessibilityNodeInfo);
                    int i42 = i;
                    int i52 = i42;
                    int i62 = i52;
                    int i72 = i62;
                    int i82 = i72;
                    i2 = 1;
                    while (!m16875a.isEmpty()) {
                        accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                        i2--;
                        if (!accessibilityNodeInfo2.isVisibleToUser()) {
                        }
                        if (i2 != 0) {
                        }
                        i = 0;
                        break;
                    }
                    m16875a.clear();
                    return false;
                case -662003450:
                    if (!str.equals("com.instagram.android")) {
                        return false;
                    }
                    h90 m16875a4 = qs9.m16875a();
                    m16875a4.addLast(accessibilityNodeInfo);
                    int i24 = 1;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (!m16875a4.isEmpty() && i25 < 100) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo5 = (AccessibilityNodeInfo) m16875a4.removeFirst();
                            i24--;
                            if (accessibilityNodeInfo5.isVisibleToUser()) {
                                i25++;
                                String viewIdResourceName3 = accessibilityNodeInfo5.getViewIdResourceName();
                                if (viewIdResourceName3 != null && a13.f52b.contains(viewIdResourceName3) && (i26 = i26 + 1) >= 2) {
                                    m16875a4.clear();
                                    return true;
                                }
                                if (i27 < 24 && (childCount4 = accessibilityNodeInfo5.getChildCount()) > 0) {
                                    int min4 = Math.min(childCount4, 10);
                                    for (int i29 = 0; i29 < min4; i29++) {
                                        AccessibilityNodeInfo child4 = accessibilityNodeInfo5.getChild(i29);
                                        if (child4 != null) {
                                            m16875a4.addLast(child4);
                                            i28++;
                                        }
                                    }
                                }
                            }
                            if (i24 == 0) {
                                i27++;
                                i24 = i28;
                                i28 = 0;
                            }
                        } catch (Throwable th2) {
                            m16875a4.clear();
                            throw th2;
                        }
                    }
                    m16875a4.clear();
                    return false;
                case 714499313:
                    if (!str.equals("com.facebook.katana")) {
                        return false;
                    }
                    h90 m16875a5 = qs9.m16875a();
                    m16875a5.addLast(accessibilityNodeInfo);
                    int i30 = 1;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    while (!m16875a5.isEmpty() && i31 < 100) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo6 = (AccessibilityNodeInfo) m16875a5.removeFirst();
                            i30--;
                            if (accessibilityNodeInfo6.isVisibleToUser()) {
                                i31++;
                                CharSequence contentDescription4 = accessibilityNodeInfo6.getContentDescription();
                                if (contentDescription4 != null && 4 <= (length = contentDescription4.length()) && length < 36) {
                                    Iterator it2 = a13.f57g.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (m9472s(contentDescription4, (String) it2.next())) {
                                                i34++;
                                                z2 = i34 >= 2;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        m16875a5.clear();
                                        return true;
                                    }
                                    if (i32 < 24 && (childCount5 = accessibilityNodeInfo6.getChildCount()) > 0) {
                                        int min5 = Math.min(childCount5, 10);
                                        for (int i35 = 0; i35 < min5; i35++) {
                                            AccessibilityNodeInfo child5 = accessibilityNodeInfo6.getChild(i35);
                                            if (child5 != null) {
                                                m16875a5.addLast(child5);
                                                i33++;
                                            }
                                        }
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            if (i30 == 0) {
                                i32++;
                                i30 = i33;
                                i33 = 0;
                            }
                        } catch (Throwable th3) {
                            m16875a5.clear();
                            throw th3;
                        }
                    }
                    m16875a5.clear();
                    return false;
                case 908042537:
                    if (str.equals("com.facebook.lite")) {
                        m16875a = qs9.m16875a();
                        m16875a.addLast(accessibilityNodeInfo);
                        int i36 = 1;
                        int i37 = 0;
                        boolean z14 = false;
                        boolean z15 = false;
                        int i38 = 0;
                        int i39 = 0;
                        while (!m16875a.isEmpty() && i37 < 100) {
                            try {
                                AccessibilityNodeInfo accessibilityNodeInfo7 = (AccessibilityNodeInfo) m16875a.removeFirst();
                                i36--;
                                if (accessibilityNodeInfo7.isVisibleToUser()) {
                                    i37++;
                                    if (!z14 && accessibilityNodeInfo7.isScrollable() && (className3 = accessibilityNodeInfo7.getClassName()) != null && m9462i(className3, "RecyclerView")) {
                                        z14 = true;
                                    }
                                    String viewIdResourceName4 = accessibilityNodeInfo7.getViewIdResourceName();
                                    if (viewIdResourceName4 == null) {
                                        contains = false;
                                    } else {
                                        if (viewIdResourceName4.equals("com.facebook.lite:id/video_view")) {
                                            z15 = true;
                                        }
                                        contains = a13.f53c.contains(viewIdResourceName4);
                                    }
                                    if (contains) {
                                        m16875a.clear();
                                        z4 = true;
                                        z3 = false;
                                        if (z4 && z14 && z15) {
                                            return true;
                                        }
                                        return z3;
                                    }
                                    if (i38 < 24 && (childCount6 = accessibilityNodeInfo7.getChildCount()) > 0) {
                                        int min6 = Math.min(childCount6, 10);
                                        for (int i40 = 0; i40 < min6; i40++) {
                                            AccessibilityNodeInfo child6 = accessibilityNodeInfo7.getChild(i40);
                                            if (child6 != null) {
                                                m16875a.addLast(child6);
                                                i39++;
                                            }
                                        }
                                    }
                                }
                                if (i36 == 0) {
                                    i38++;
                                    i36 = i39;
                                    i39 = 0;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        z3 = false;
                        m16875a.clear();
                        z4 = false;
                        return z4 ? z3 : z3;
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0196, code lost:
    
        if (r0 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x019e, code lost:
    
        if (r2 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01a7, code lost:
    
        if (r2 != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013e A[Catch: all -> 0x009e, LOOP:3: B:104:0x010b->B:115:0x013e, LOOP_END, TryCatch #0 {all -> 0x009e, blocks: (B:7:0x001b, B:11:0x0025, B:14:0x0031, B:16:0x003e, B:26:0x0082, B:28:0x008b, B:30:0x0093, B:39:0x01b1, B:41:0x01be, B:43:0x01c4, B:81:0x00ae, B:83:0x00b9, B:85:0x00c1, B:87:0x00c9, B:89:0x00d4, B:91:0x00dc, B:93:0x00e4, B:94:0x00e8, B:96:0x00ee, B:98:0x00fa, B:101:0x0101, B:105:0x010d, B:110:0x0124, B:115:0x013e, B:112:0x0145, B:124:0x016d, B:126:0x0175, B:160:0x0045, B:164:0x0058, B:166:0x005e, B:172:0x0065), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b1 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #0 {all -> 0x009e, blocks: (B:7:0x001b, B:11:0x0025, B:14:0x0031, B:16:0x003e, B:26:0x0082, B:28:0x008b, B:30:0x0093, B:39:0x01b1, B:41:0x01be, B:43:0x01c4, B:81:0x00ae, B:83:0x00b9, B:85:0x00c1, B:87:0x00c9, B:89:0x00d4, B:91:0x00dc, B:93:0x00e4, B:94:0x00e8, B:96:0x00ee, B:98:0x00fa, B:101:0x0101, B:105:0x010d, B:110:0x0124, B:115:0x013e, B:112:0x0145, B:124:0x016d, B:126:0x0175, B:160:0x0045, B:164:0x0058, B:166:0x005e, B:172:0x0065), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac A[SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vq8 m9469p(AccessibilityNodeInfo accessibilityNodeInfo, boolean z, boolean z2) {
        int i;
        int length;
        boolean z3;
        boolean z4;
        boolean z5;
        Iterator it;
        boolean z6;
        int length2;
        int length3;
        boolean z7;
        if (accessibilityNodeInfo == null || !(z || z2)) {
            Boolean bool = Boolean.FALSE;
            return new vq8(bool, bool);
        }
        h90 m16875a = qs9.m16875a();
        m16875a.addLast(accessibilityNodeInfo);
        int i2 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (!m16875a.isEmpty() && i2 < 95) {
            try {
                AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) m16875a.removeFirst();
                if (accessibilityNodeInfo2.isVisibleToUser()) {
                    int i3 = i2 + 1;
                    CharSequence text = accessibilityNodeInfo2.getText();
                    CharSequence charSequence = null;
                    if (text != null) {
                        if (!stb.m18260Z0(text) && 4 <= (length3 = text.length()) && length3 < 81) {
                            z7 = true;
                            if (z7) {
                                text = null;
                            }
                            if (text != null) {
                                if (z) {
                                    i = i3;
                                } else {
                                    if (!z8) {
                                        if (!stb.m18246L0(text, "KG-GuardZ", false) && !stb.m18246L0(text, "Click to Enable Kahf-Guardz", false) && !stb.m18246L0(text, "Kahf Guard Protections", false)) {
                                            z8 = false;
                                            if (z8 && !z2) {
                                                i = i3;
                                                z4 = z8;
                                                z5 = true;
                                                if (z5) {
                                                    m16875a.clear();
                                                    z8 = z4;
                                                    break;
                                                }
                                                int min = Math.min(accessibilityNodeInfo2.getChildCount(), 15);
                                                for (int i4 = 0; i4 < min; i4++) {
                                                    AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(i4);
                                                    if (child != null) {
                                                        m16875a.addLast(child);
                                                    }
                                                }
                                                z8 = z4;
                                                i2 = i;
                                            }
                                        }
                                        z8 = true;
                                        if (z8) {
                                            i = i3;
                                            z4 = z8;
                                            z5 = true;
                                            if (z5) {
                                            }
                                        }
                                    }
                                    if (!z9) {
                                        z9 = stb.m18246L0(text, "Kahf Guard", false);
                                    }
                                    if (!z10) {
                                        z10 = m9460g(text, a13.f60j);
                                    }
                                    if (!z11) {
                                        z11 = m9460g(text, a13.f58h);
                                    }
                                    if (!z12) {
                                        z12 = stb.m18246L0(text, "KG-AdminZ", true);
                                    }
                                    if (!z13) {
                                        z13 = m9460g(text, a13.f61k);
                                    }
                                    if (!z14) {
                                        LinkedHashSet linkedHashSet = a13.f62l;
                                        if (!linkedHashSet.isEmpty()) {
                                            Iterator it2 = linkedHashSet.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    i = i3;
                                                    z14 = false;
                                                    break;
                                                }
                                                String str = (String) it2.next();
                                                int length4 = str.length();
                                                if (length4 != 0 && length4 <= text.length() && (length2 = text.length() - length4) >= 0) {
                                                    it = it2;
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 > 0) {
                                                            i = i3;
                                                            if (Character.isLetterOrDigit(text.charAt(i5 - 1))) {
                                                                z6 = z8;
                                                                if (i5 == length2) {
                                                                    i5++;
                                                                    i3 = i;
                                                                    z8 = z6;
                                                                }
                                                            }
                                                        } else {
                                                            i = i3;
                                                        }
                                                        int i6 = 0;
                                                        while (i6 < length4) {
                                                            z6 = z8;
                                                            int i7 = i6;
                                                            if (Character.toLowerCase(text.charAt(i5 + i6)) != Character.toLowerCase(str.charAt(i6))) {
                                                                if (i5 == length2) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i6 = i7 + 1;
                                                                z8 = z6;
                                                            }
                                                        }
                                                        z14 = true;
                                                        break;
                                                    }
                                                    it2 = it;
                                                    i3 = i;
                                                    z8 = z6;
                                                }
                                                it = it2;
                                                i = i3;
                                                z6 = z8;
                                                it2 = it;
                                                i3 = i;
                                                z8 = z6;
                                            }
                                            z8 = z8;
                                        }
                                    }
                                    i = i3;
                                    z8 = z8;
                                }
                                if (z2) {
                                    if (!z15) {
                                        z15 = m9460g(text, a13.f59i);
                                    }
                                    if (!z16) {
                                        z16 = m9460g(text, a13.f56f);
                                    }
                                }
                                boolean z17 = !z8 || (z9 && z10) || (z9 && z11);
                                boolean z18 = !z15 && z16;
                                if (z) {
                                    if (!z2) {
                                    }
                                }
                                if (!z) {
                                    if (z2) {
                                    }
                                }
                                if (z) {
                                    if (z2) {
                                        if (z17) {
                                        }
                                    }
                                }
                                z4 = z8;
                                z5 = false;
                                if (z5) {
                                }
                            }
                        }
                        z7 = false;
                        if (z7) {
                        }
                        if (text != null) {
                        }
                    }
                    CharSequence contentDescription = accessibilityNodeInfo2.getContentDescription();
                    if (contentDescription != null) {
                        if (!stb.m18260Z0(contentDescription) && 4 <= (length = contentDescription.length()) && length < 81) {
                            z3 = true;
                            if (z3) {
                                charSequence = contentDescription;
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                    if (charSequence == null) {
                        i = i3;
                        z4 = z8;
                        z5 = false;
                        if (z5) {
                        }
                    } else {
                        text = charSequence;
                        if (z) {
                        }
                        if (z2) {
                        }
                        if (z8) {
                        }
                        if (z15) {
                        }
                        if (z) {
                        }
                        if (!z) {
                        }
                        if (z) {
                        }
                        z4 = z8;
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
            } catch (Throwable th) {
                m16875a.clear();
                throw th;
            }
        }
        m16875a.clear();
        boolean z19 = z && (z8 || ((z9 && z10) || ((z9 && z11) || (z12 && z13 && !z14))));
        boolean z20 = z2 && z15 && z16;
        if (z19) {
            v20.m20278v();
        }
        if (z20) {
            v20.m20278v();
            v20.m20278v();
        }
        return new vq8(Boolean.valueOf(z19), Boolean.valueOf(z20));
    }

    /* renamed from: q */
    public static final void m9470q() {
        File[] listFiles;
        dz3 dz3Var = dz3.f8993a;
        if (!r4d.m17116b() || y6d.m22673J()) {
            return;
        }
        File m23185l = yy5.m23185l();
        byte b = 2;
        if (m23185l == null) {
            listFiles = new File[0];
        } else {
            listFiles = m23185l.listFiles(new he2((byte) 2));
            listFiles.getClass();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            file.getClass();
            kt3 kt3Var = new kt3();
            String name = file.getName();
            name.getClass();
            kt3Var.f23012a = name;
            JSONObject m23171P = yy5.m23171P(name);
            if (m23171P != null) {
                kt3Var.f23014c = Long.valueOf(m23171P.optLong("timestamp", 0L));
                kt3Var.f23013b = m23171P.optString("error_message", null);
            }
            if (kt3Var.f23013b != null && kt3Var.f23014c != null) {
                arrayList.add(kt3Var);
            }
        }
        ts1.m19028a0(new C0434i((byte) 13), arrayList);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        yy5.m23172T("error_reports", jSONArray, new C0469j(arrayList, b));
    }

    /* renamed from: r */
    public static boolean m9471r(CharSequence charSequence, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m9472s(charSequence, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m9472s(CharSequence charSequence, String str) {
        if (charSequence.length() == str.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (ab7.m332r(charSequence.charAt(i), str.charAt(i), true)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static pt1 m9473t() {
        return f16194g;
    }

    /* renamed from: u */
    public static float m9474u() {
        return f16195h;
    }

    /* renamed from: v */
    public static final in5 m9475v() {
        in5 in5Var = f16203p;
        if (in5Var != null) {
            return in5Var;
        }
        hn5 hn5Var = new hn5("Rounded.Group", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = o8d.f29868a;
        ajb ajbVar = new ajb(ws1.f47051b);
        x11 m15969c = pr1.m15969c(16.0f, 11.0f);
        m15969c.m21797h(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        m15969c.m21803n(17.66f, 5.0f, 16.0f, 5.0f);
        m15969c.m21804o(-3.0f, 1.34f, -3.0f, 3.0f);
        m15969c.m21804o(1.34f, 3.0f, 3.0f, 3.0f);
        m15969c.m21795f();
        m15969c.m21802m(8.0f, 11.0f);
        m15969c.m21797h(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        m15969c.m21803n(9.66f, 5.0f, 8.0f, 5.0f);
        m15969c.m21803n(5.0f, 6.34f, 5.0f, 8.0f);
        m15969c.m21804o(1.34f, 3.0f, 3.0f, 3.0f);
        m15969c.m21795f();
        m15969c.m21802m(8.0f, 13.0f);
        m15969c.m21797h(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        m15969c.m21800k(1.0f, 18.0f);
        m15969c.m21797h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        m15969c.m21799j(12.0f);
        m15969c.m21797h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        m15969c.m21807r(-1.5f);
        m15969c.m21797h(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        m15969c.m21795f();
        m15969c.m21802m(16.0f, 13.0f);
        m15969c.m21797h(-0.29f, 0.0f, -0.62f, 0.02f, -0.97f, 0.05f);
        m15969c.m21797h(0.02f, 0.01f, 0.03f, 0.03f, 0.04f, 0.04f);
        m15969c.m21797h(1.14f, 0.83f, 1.93f, 1.94f, 1.93f, 3.41f);
        m15969c.m21800k(17.0f, 18.0f);
        m15969c.m21797h(0.0f, 0.35f, -0.07f, 0.69f, -0.18f, 1.0f);
        m15969c.m21800k(22.0f, 19.0f);
        m15969c.m21797h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        m15969c.m21807r(-1.5f);
        m15969c.m21797h(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        m15969c.m21795f();
        hn5.m9584d(hn5Var, m15969c.f47436b, 0, ajbVar);
        in5 m9587e = hn5Var.m9587e();
        f16203p = m9587e;
        return m9587e;
    }

    /* renamed from: w */
    public static C0735q6 m9476w() {
        C0735q6 c0735q6 = C0735q6.f33964w;
        if (c0735q6 != null) {
            return c0735q6;
        }
        C0735q6 c0735q62 = new C0735q6();
        C0735q6.f33964w = c0735q62;
        return c0735q62;
    }

    /* renamed from: x */
    public static pt1 m9477x() {
        return f16196i;
    }

    /* renamed from: y */
    public static final in5 m9478y() {
        in5 in5Var = f16205r;
        if (in5Var != null) {
            return in5Var;
        }
        hn5 hn5Var = new hn5("Rounded.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = o8d.f29868a;
        long j = ws1.f47051b;
        ajb ajbVar = new ajb(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new cx8(12.0f, 22.0f));
        arrayList.add(new hx8(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f));
        arrayList.add(new ix8(-4.0f));
        arrayList.add(new zw8(10.0f, 21.1f, 10.9f, 22.0f, 12.0f, 22.0f));
        yw8 yw8Var = yw8.f51320c;
        arrayList.add(yw8Var);
        hn5.m9584d(hn5Var, arrayList, 0, ajbVar);
        ajb ajbVar2 = new ajb(j);
        x11 x11Var = new x11((byte) 3);
        x11Var.m21802m(9.0f, 19.0f);
        x11Var.m21799j(6.0f);
        x11Var.m21797h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        x11Var.m21807r(0.0f);
        x11Var.m21797h(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        x11Var.m21798i(9.0f);
        x11Var.m21797h(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        x11Var.m21807r(0.0f);
        x11Var.m21796g(8.0f, 18.55f, 8.45f, 19.0f, 9.0f, 19.0f);
        x11Var.m21795f();
        hn5.m9584d(hn5Var, x11Var.f47436b, 0, ajbVar2);
        ajb ajbVar3 = new ajb(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new cx8(12.0f, 2.0f));
        arrayList2.add(new zw8(7.86f, 2.0f, 4.5f, 5.36f, 4.5f, 9.5f));
        arrayList2.add(new hx8(0.0f, 3.82f, 2.66f, 5.86f, 3.77f, 6.5f));
        arrayList2.add(new ix8(7.46f));
        arrayList2.add(new hx8(1.11f, -0.64f, 3.77f, -2.68f, 3.77f, -6.5f));
        arrayList2.add(new zw8(19.5f, 5.36f, 16.14f, 2.0f, 12.0f, 2.0f));
        arrayList2.add(yw8Var);
        hn5.m9584d(hn5Var, arrayList2, 0, ajbVar3);
        in5 m9587e = hn5Var.m9587e();
        f16205r = m9587e;
        return m9587e;
    }

    /* renamed from: z */
    public static final long m9479z(y0b y0bVar, long j, wza wzaVar) {
        vj6 m11556c;
        long m10502b;
        long j2;
        us7 us7Var;
        int m20023d;
        float m19371f;
        us7 us7Var2;
        int m20023d2;
        us7 us7Var3;
        int m20023d3;
        float m20021b;
        us7 us7Var4;
        int m20023d4;
        jt7 m22464c = y0bVar.m22464c(wzaVar);
        if (m22464c == null) {
            return 9205357640488583168L;
        }
        i0b i0bVar = m22464c.f21138c;
        vj6 vj6Var = y0bVar.f49437F;
        if (vj6Var == null || (m11556c = m22464c.m11556c()) == null) {
            return 9205357640488583168L;
        }
        int i = wzaVar.f47375b;
        pcc pccVar = (pcc) i0bVar.invoke();
        if (i > (pccVar == null ? 0 : m22464c.m11555b(pccVar))) {
            return 9205357640488583168L;
        }
        ha8 ha8Var = (ha8) y0bVar.f49442K.getValue();
        ha8Var.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (m11556c.mo13166G(vj6Var, ha8Var.f15848a) >> 32));
        pcc pccVar2 = (pcc) i0bVar.invoke();
        if (pccVar2 == null) {
            m10502b = edc.f9799b;
        } else {
            us7 us7Var5 = pccVar2.f32263b;
            int m11555b = m22464c.m11555b(pccVar2);
            if (m11555b < 1) {
                m10502b = edc.f9799b;
            } else {
                int m20023d5 = us7Var5.m20023d(u6d.m19372g(i, 0, m11555b - 1));
                m10502b = iq5.m10502b(pccVar2.m15666i(m20023d5), us7Var5.m20022c(m20023d5, true));
            }
        }
        if (edc.m7112d(m10502b)) {
            pcc pccVar3 = (pcc) i0bVar.invoke();
            m19371f = (pccVar3 != null && (m20023d4 = (us7Var4 = pccVar3.f32263b).m20023d(i)) < us7Var4.f43126f) ? pccVar3.m15664g(m20023d4) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i2 = (int) (m10502b >> 32);
            pcc pccVar4 = (pcc) i0bVar.invoke();
            float m15664g = (pccVar4 != null && (m20023d2 = (us7Var2 = pccVar4.f32263b).m20023d(i2)) < us7Var2.f43126f) ? pccVar4.m15664g(m20023d2) : -1.0f;
            int i3 = ((int) (m10502b & 4294967295L)) - 1;
            pcc pccVar5 = (pcc) i0bVar.invoke();
            float m15665h = (pccVar5 != null && (m20023d = (us7Var = pccVar5.f32263b).m20023d(i3)) < us7Var.f43126f) ? pccVar5.m15665h(m20023d) : -1.0f;
            m19371f = u6d.m19371f(intBitsToFloat, Math.min(m15664g, m15665h), Math.max(m15664g, m15665h));
        }
        if (m19371f == -1.0f) {
            return 9205357640488583168L;
        }
        if (!zw5.m23817a(j, 0L) && Math.abs(intBitsToFloat - m19371f) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        pcc pccVar6 = (pcc) i0bVar.invoke();
        if (pccVar6 != null && (m20023d3 = (us7Var3 = pccVar6.f32263b).m20023d(i)) < us7Var3.f43126f) {
            float m20025f = us7Var3.m20025f(m20023d3);
            m20021b = ((us7Var3.m20021b(m20023d3) - m20025f) / 2.0f) + m20025f;
        } else {
            m20021b = -1.0f;
        }
        if (m20021b == -1.0f) {
            return 9205357640488583168L;
        }
        return vj6Var.mo13166G(m11556c, (Float.floatToRawIntBits(m19371f) << 32) | (Float.floatToRawIntBits(m20021b) & j2));
    }
}
