package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.work.impl.workers.dFe.kfGHxXNRt;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class c7d implements xy0, uz2, f87, InterfaceC0738q9, kp3, d51, byb, gq1, du6, cnd, jz3, hhb, oad {

    /* renamed from: u */
    public final /* synthetic */ byte f4587u;

    /* renamed from: v */
    public static final c7d f4582v = new c7d((byte) 0);

    /* renamed from: w */
    public static final c7d f4583w = new c7d((byte) 1);

    /* renamed from: x */
    public static final c7d f4584x = new c7d((byte) 2);

    /* renamed from: y */
    public static final c7d f4585y = new c7d((byte) 4);

    /* renamed from: z */
    public static final c7d f4586z = new c7d((byte) 5);

    /* renamed from: A */
    public static final c7d f4579A = new c7d((byte) 6);

    /* renamed from: B */
    public static final c7d f4580B = new c7d((byte) 7);

    /* renamed from: C */
    public static final c7d f4581C = new c7d((byte) 8);

    public c7d(yy5[] yy5VarArr) {
        this.f4587u = (byte) 23;
    }

    /* renamed from: d */
    public static xk5 m2801d(long j, long j2, y12 y12Var, int i) {
        xk5 xk5Var;
        long m16877b = (i & 2) != 0 ? qt1.m16877b(j, y12Var) : j2;
        long j3 = ws1.f47056g;
        ot1 ot1Var = ((sa7) ((mn4) y12Var).m13600j(wa7.f46041a)).f38169a;
        xk5 xk5Var2 = ot1Var.f31190g0;
        if (xk5Var2 == null) {
            xk5 xk5Var3 = new xk5(qt1.m16879d(ot1Var, vt4.f45061e), qt1.m16879d(ot1Var, vt4.f45066j), ws1.m21647c(vt4.f45063g, qt1.m16879d(ot1Var, vt4.f45062f)), ws1.m21647c(vt4.f45065i, qt1.m16879d(ot1Var, vt4.f45064h)));
            ot1Var.f31190g0 = xk5Var3;
            xk5Var = xk5Var3;
        } else {
            xk5Var = xk5Var2;
        }
        return xk5Var.m22163a(j, m16877b, j3, j3);
    }

    /* renamed from: f */
    public static yz4 m2802f(String str) {
        if (str != null) {
            if (stb.m18260Z0(str)) {
                str = null;
            }
            if (str != null) {
                LinkedHashMap linkedHashMap = yz4.f51492B;
                String lowerCase = stb.m18242B1(str).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return (yz4) linkedHashMap.get(lowerCase);
            }
        }
        return null;
    }

    /* renamed from: h */
    public static ie9 m2803h(String str) {
        Object obj;
        str.getClass();
        ts3 ts3Var = ie9.f18124x;
        ts3Var.getClass();
        C0619n1 c0619n1 = new C0619n1(ts3Var, (byte) 0);
        while (true) {
            if (!c0619n1.hasNext()) {
                obj = null;
                break;
            }
            obj = c0619n1.next();
            if (((ie9) obj).f18125u.equals(str)) {
                break;
            }
        }
        return (ie9) obj;
    }

    /* renamed from: m */
    public static yz4 m2804m(String str) {
        if (str != null) {
            if (stb.m18260Z0(str)) {
                str = null;
            }
            if (str != null) {
                Map map = yz4.f51493C;
                String lowerCase = stb.m18242B1(str).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return (yz4) map.get(lowerCase);
            }
        }
        return null;
    }

    /* renamed from: n */
    public static final File m2805n() {
        if (ee2.f9818a.contains(c7d.class)) {
            return null;
        }
        try {
            File file = new File(dz3.m6798a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            ee2.m7125a(c7d.class, th);
            return null;
        }
    }

    /* renamed from: v */
    public static long m2806v() {
        float f = zy5.f53272f;
        return c3e.m2609b(zy5.f53273g + f + f, 40.0f);
    }

    @Override // p000.f87
    /* renamed from: D */
    public e87 mo2807D(g87 g87Var, Object obj, int i, e87 e87Var) {
        z87 z87Var = (z87) g87Var;
        y87 y87Var = (y87) e87Var;
        return y87Var == null ? new y87(z87Var.f51934B, obj, i) : new x87(z87Var.f51934B, obj, i, y87Var);
    }

    @Override // p000.oad
    /* renamed from: G */
    public void mo2809G(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p000.d51
    /* renamed from: a */
    public byte[] mo2810a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.uz2
    /* renamed from: b */
    public float mo2811b(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // p000.xy0
    /* renamed from: c */
    public Rect mo2812c(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        wy0 wy0Var = xy0.f49239a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            wy0Var.getClass();
            Log.w(wy0.f47313b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (AbstractC1031y6.m22660x(obj2)) {
                    displayCutout = AbstractC1031y6.m22644h(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                wy0Var.getClass();
                Log.w(wy0.f47313b, e2);
            }
            if (displayCutout != null) {
                int i3 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i3 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i4 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i4 == safeInsetRight) {
                    int i5 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i5;
                }
                int i6 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i6 == safeInsetTop) {
                    rect.top = 0;
                }
                int i7 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i7 == safeInsetBottom) {
                    int i8 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i8;
                }
            }
        }
        return rect;
    }

    @Override // p000.jz3
    /* renamed from: e */
    public Object mo2813e() {
        try {
            return new uoa(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            w54.m21090m(e);
            return null;
        }
    }

    @Override // p000.gq1
    /* renamed from: g */
    public xv5 mo2814g() {
        ou9 ou9Var = xv5.f49144w;
        return ou9.m15346x(System.currentTimeMillis());
    }

    @Override // p000.f87
    /* renamed from: i */
    public g87 mo2815i(h97 h97Var, int i) {
        return new z87(h97Var, i);
    }

    @Override // p000.InterfaceC0738q9
    /* renamed from: j */
    public void mo25j(bd6 bd6Var, pi2 pi2Var, Object obj) {
        switch (this.f4587u) {
            case 6:
                s9a s9aVar = (s9a) obj;
                bd6Var.getClass();
                pi2Var.getClass();
                s9aVar.getClass();
                xa7 xa7Var = s9aVar.f38108g;
                xa7 xa7Var2 = s9aVar.f38107f;
                xa7 xa7Var3 = s9aVar.f38106e;
                xa7 xa7Var4 = s9aVar.f38105d;
                bd6Var.mo1905F0("type");
                bd6Var.mo1906K(s9aVar.f38102a.f44044u);
                bd6Var.mo1905F0("value");
                AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, s9aVar.f38103b);
                xa7 xa7Var5 = s9aVar.f38104c;
                if (xa7Var5 instanceof ak8) {
                    bd6Var.mo1905F0("blockingMode");
                    w3a w3aVar = w3a.f45643w;
                    Object obj2 = ((ak8) xa7Var5).f1241g;
                    if (obj2 == null) {
                        bd6Var.mo1902A0();
                    } else {
                        w3aVar.mo25j(bd6Var, pi2Var, obj2);
                    }
                }
                if (xa7Var4 instanceof ak8) {
                    bd6Var.mo1905F0("startTimestamp");
                    AbstractC0849t9.m18688a(AbstractC0849t9.f39943i).mo25j(bd6Var, pi2Var, (ak8) xa7Var4);
                }
                if (xa7Var3 instanceof ak8) {
                    bd6Var.mo1905F0("duration");
                    AbstractC0849t9.m18688a(AbstractC0849t9.f39941g).mo25j(bd6Var, pi2Var, (ak8) xa7Var3);
                }
                if (xa7Var2 instanceof ak8) {
                    bd6Var.mo1905F0("schedules");
                    js6 js6Var = new js6(new js6(cj7.f5260w, (byte) 1), (byte) 0);
                    Object obj3 = ((ak8) xa7Var2).f1241g;
                    if (obj3 == null) {
                        bd6Var.mo1902A0();
                    } else {
                        js6Var.mo25j(bd6Var, pi2Var, obj3);
                    }
                }
                if (xa7Var instanceof ak8) {
                    bd6Var.mo1905F0("metadata");
                    js6 js6Var2 = new js6(new js6(u03.f41461A, (byte) 1), (byte) 0);
                    Object obj4 = ((ak8) xa7Var).f1241g;
                    if (obj4 != null) {
                        js6Var2.mo25j(bd6Var, pi2Var, obj4);
                        break;
                    } else {
                        bd6Var.mo1902A0();
                        break;
                    }
                }
                break;
            default:
                jcb jcbVar = (jcb) obj;
                bd6Var.getClass();
                pi2Var.getClass();
                jcbVar.getClass();
                bd6Var.mo1905F0("day");
                AbstractC0849t9.f39935a.mo25j(bd6Var, pi2Var, jcbVar.f20187a);
                bd6Var.mo1905F0("source");
                bdb bdbVar = bdb.BROWSER_BAR;
                bd6Var.mo1906K("BROWSER_BAR");
                bd6Var.mo1905F0("hours");
                nl3 nl3Var = nl3.f28455A;
                ArrayList arrayList = jcbVar.f20188b;
                bd6Var.mo1911l();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    bd6Var.mo1909i();
                    nl3Var.mo25j(bd6Var, pi2Var, next);
                    bd6Var.mo1908f();
                }
                bd6Var.mo1910j();
                break;
        }
    }

    @Override // p000.byb
    /* renamed from: k */
    public sle mo1715k(Object obj) {
        return af2.m552s(Boolean.TRUE);
    }

    @Override // p000.f87
    /* renamed from: l */
    public k87 mo2816l() {
        return k87.f21856v;
    }

    @Override // p000.f87
    /* renamed from: o */
    public k87 mo2817o() {
        return k87.f21855u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f2, code lost:
    
        if (r5 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        if (r5 == r2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2818p(c8d c8dVar, String str, kx3 kx3Var, g86 g86Var, mm4 mm4Var, ova ovaVar, za2 za2Var) {
        xe8 xe8Var;
        int i;
        c8d c8dVar2;
        g86 g86Var2;
        String str2;
        ova ovaVar2;
        mm4 mm4Var2;
        g86 g86Var3;
        c8d c8dVar3;
        g86 g86Var4;
        String str3;
        kx3 kx3Var2;
        mm4 mm4Var3;
        c8d c8dVar4;
        if (za2Var instanceof xe8) {
            xe8Var = (xe8) za2Var;
            int i2 = xe8Var.f48243E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xe8Var.f48243E = i2 - Integer.MIN_VALUE;
                Object obj = xe8Var.f48241C;
                i = xe8Var.f48243E;
                qc2 qc2Var = qc2.f34309u;
                switch (i) {
                    case 0:
                        v11.m20244z(obj);
                        if (kx3Var == null) {
                            c8dVar2 = c8dVar;
                            g86Var2 = null;
                            if (kx3Var != null) {
                                g86 m11894n = k97.m11894n(str);
                                xe8Var.f48244u = c8dVar2;
                                xe8Var.f48245v = str;
                                xe8Var.f48246w = kx3Var;
                                xe8Var.f48247x = g86Var;
                                xe8Var.f48248y = mm4Var;
                                xe8Var.f48249z = ovaVar;
                                xe8Var.f48239A = g86Var2;
                                xe8Var.f48243E = 2;
                                Object mo1496L0 = ovaVar.mo1496L0(m11894n, xe8Var);
                                if (mo1496L0 != qc2Var) {
                                    c8dVar3 = c8dVar2;
                                    obj = mo1496L0;
                                    ova ovaVar3 = ovaVar;
                                    str3 = str;
                                    ovaVar2 = ovaVar3;
                                    mm4 mm4Var4 = mm4Var;
                                    kx3Var2 = kx3Var;
                                    mm4Var3 = mm4Var4;
                                    g86Var4 = (g86) obj;
                                    String str4 = str3;
                                    mm4Var2 = mm4Var3;
                                    kx3Var = kx3Var2;
                                    g86Var3 = g86Var;
                                    str2 = str4;
                                    if (mm4Var2 != null || g86Var4 != null) {
                                        if (g86Var4 != null && mm4Var2 != null) {
                                            xe8Var.f48244u = c8dVar3;
                                            xe8Var.f48245v = str2;
                                            xe8Var.f48246w = kx3Var;
                                            xe8Var.f48247x = null;
                                            xe8Var.f48248y = null;
                                            xe8Var.f48249z = ovaVar2;
                                            xe8Var.f48239A = g86Var2;
                                            xe8Var.f48243E = 4;
                                            obj = mm4Var2.mo1d(ovaVar2, g86Var4, g86Var3, xe8Var);
                                            if (obj != qc2Var) {
                                                c8dVar4 = c8dVar3;
                                                c8dVar3 = c8dVar4;
                                                g86Var3 = (g86) obj;
                                            }
                                        }
                                        if (kx3Var == null) {
                                            if (!(g86Var2 instanceof w86)) {
                                                j56 m1506i = av7.m1403v(ovaVar2).m1506i();
                                                g86 m11894n2 = k97.m11894n("Cannot set properties of " + g86Var2);
                                                wf8 wf8Var = d76.f7491a;
                                                vab vabVar = new vab(m11894n2);
                                                xe8Var.f48244u = null;
                                                xe8Var.f48245v = null;
                                                xe8Var.f48246w = null;
                                                xe8Var.f48247x = null;
                                                xe8Var.f48248y = null;
                                                xe8Var.f48249z = null;
                                                xe8Var.f48239A = null;
                                                xe8Var.f48240B = null;
                                                xe8Var.f48243E = 7;
                                                obj = b26.m1590s0(m1506i, vabVar, ovaVar2, xe8Var);
                                                break;
                                            } else {
                                                g86 m11894n3 = k97.m11894n(str2);
                                                xe8Var.f48244u = null;
                                                xe8Var.f48245v = null;
                                                xe8Var.f48246w = null;
                                                xe8Var.f48247x = null;
                                                xe8Var.f48248y = null;
                                                xe8Var.f48249z = null;
                                                xe8Var.f48239A = null;
                                                xe8Var.f48240B = g86Var3;
                                                xe8Var.f48243E = 6;
                                                if (((w86) g86Var2).mo2869S(xe8Var, m11894n3, g86Var3, ovaVar2) == qc2Var) {
                                                }
                                            }
                                        } else {
                                            g86 m11894n4 = k97.m11894n(str2);
                                            xe8Var.f48244u = null;
                                            xe8Var.f48245v = null;
                                            xe8Var.f48246w = null;
                                            xe8Var.f48247x = null;
                                            xe8Var.f48248y = null;
                                            xe8Var.f48249z = null;
                                            xe8Var.f48239A = null;
                                            xe8Var.f48240B = g86Var3;
                                            xe8Var.f48243E = 5;
                                            if (ovaVar2.mo15353Q(m11894n4, g86Var3, c8dVar3, xe8Var) != qc2Var) {
                                                return g86Var3;
                                            }
                                        }
                                    } else {
                                        rf6.m17312i(tz6.m19210k("Cant modify ", str2, " as it is undefined"));
                                        return null;
                                    }
                                }
                            } else if (g86Var2 != null) {
                                g86 m11894n5 = k97.m11894n(str);
                                xe8Var.f48244u = c8dVar2;
                                xe8Var.f48245v = str;
                                xe8Var.f48246w = kx3Var;
                                xe8Var.f48247x = g86Var;
                                xe8Var.f48248y = mm4Var;
                                xe8Var.f48249z = ovaVar;
                                xe8Var.f48239A = g86Var2;
                                xe8Var.f48243E = 3;
                                Object mo258a = g86Var2.mo258a(m11894n5, ovaVar, xe8Var);
                                if (mo258a != qc2Var) {
                                    c8dVar3 = c8dVar2;
                                    obj = mo258a;
                                    ova ovaVar4 = ovaVar;
                                    str3 = str;
                                    ovaVar2 = ovaVar4;
                                    mm4 mm4Var5 = mm4Var;
                                    kx3Var2 = kx3Var;
                                    mm4Var3 = mm4Var5;
                                    g86Var4 = (g86) obj;
                                    String str42 = str3;
                                    mm4Var2 = mm4Var3;
                                    kx3Var = kx3Var2;
                                    g86Var3 = g86Var;
                                    str2 = str42;
                                    if (mm4Var2 != null) {
                                    }
                                    if (g86Var4 != null) {
                                        xe8Var.f48244u = c8dVar3;
                                        xe8Var.f48245v = str2;
                                        xe8Var.f48246w = kx3Var;
                                        xe8Var.f48247x = null;
                                        xe8Var.f48248y = null;
                                        xe8Var.f48249z = ovaVar2;
                                        xe8Var.f48239A = g86Var2;
                                        xe8Var.f48243E = 4;
                                        obj = mm4Var2.mo1d(ovaVar2, g86Var4, g86Var3, xe8Var);
                                        if (obj != qc2Var) {
                                        }
                                    }
                                    if (kx3Var == null) {
                                    }
                                }
                            } else {
                                g86 g86Var5 = g86Var;
                                str2 = str;
                                ovaVar2 = ovaVar;
                                mm4Var2 = mm4Var;
                                g86Var3 = g86Var5;
                                c8dVar3 = c8dVar2;
                                g86Var4 = null;
                                if (mm4Var2 != null) {
                                }
                                if (g86Var4 != null) {
                                }
                                if (kx3Var == null) {
                                }
                            }
                            return qc2Var;
                        }
                        xe8Var.f48244u = c8dVar;
                        xe8Var.f48245v = str;
                        xe8Var.f48246w = kx3Var;
                        xe8Var.f48247x = g86Var;
                        xe8Var.f48248y = mm4Var;
                        xe8Var.f48249z = ovaVar;
                        xe8Var.f48243E = 1;
                        obj = kx3Var.m12362l(ovaVar, xe8Var);
                        break;
                    case 1:
                        ovaVar = xe8Var.f48249z;
                        mm4Var = xe8Var.f48248y;
                        g86Var = xe8Var.f48247x;
                        kx3 kx3Var3 = xe8Var.f48246w;
                        str = xe8Var.f48245v;
                        c8d c8dVar5 = xe8Var.f48244u;
                        v11.m20244z(obj);
                        kx3Var = kx3Var3;
                        c8dVar = c8dVar5;
                        c8d c8dVar6 = c8dVar;
                        g86Var2 = (g86) obj;
                        c8dVar2 = c8dVar6;
                        if (kx3Var != null) {
                        }
                        return qc2Var;
                    case 2:
                        g86Var2 = xe8Var.f48239A;
                        ovaVar2 = xe8Var.f48249z;
                        mm4Var3 = xe8Var.f48248y;
                        g86Var = xe8Var.f48247x;
                        kx3Var2 = xe8Var.f48246w;
                        str3 = xe8Var.f48245v;
                        c8dVar3 = xe8Var.f48244u;
                        v11.m20244z(obj);
                        g86Var4 = (g86) obj;
                        String str422 = str3;
                        mm4Var2 = mm4Var3;
                        kx3Var = kx3Var2;
                        g86Var3 = g86Var;
                        str2 = str422;
                        if (mm4Var2 != null) {
                        }
                        if (g86Var4 != null) {
                        }
                        if (kx3Var == null) {
                        }
                        break;
                    case 3:
                        g86Var2 = xe8Var.f48239A;
                        ovaVar2 = xe8Var.f48249z;
                        mm4Var3 = xe8Var.f48248y;
                        g86Var = xe8Var.f48247x;
                        kx3Var2 = xe8Var.f48246w;
                        str3 = xe8Var.f48245v;
                        c8dVar3 = xe8Var.f48244u;
                        v11.m20244z(obj);
                        g86Var4 = (g86) obj;
                        String str4222 = str3;
                        mm4Var2 = mm4Var3;
                        kx3Var = kx3Var2;
                        g86Var3 = g86Var;
                        str2 = str4222;
                        if (mm4Var2 != null) {
                        }
                        if (g86Var4 != null) {
                        }
                        if (kx3Var == null) {
                        }
                        break;
                    case 4:
                        g86Var2 = xe8Var.f48239A;
                        ovaVar2 = xe8Var.f48249z;
                        g86 g86Var6 = xe8Var.f48247x;
                        kx3Var = xe8Var.f48246w;
                        str2 = xe8Var.f48245v;
                        c8dVar4 = xe8Var.f48244u;
                        v11.m20244z(obj);
                        c8dVar3 = c8dVar4;
                        g86Var3 = (g86) obj;
                        if (kx3Var == null) {
                        }
                        break;
                    case 5:
                    case 6:
                        g86 g86Var7 = xe8Var.f48240B;
                        g86 g86Var8 = xe8Var.f48239A;
                        g86 g86Var9 = xe8Var.f48247x;
                        v11.m20244z(obj);
                        return g86Var7;
                    case 7:
                        g86 g86Var10 = xe8Var.f48240B;
                        g86 g86Var11 = xe8Var.f48239A;
                        g86 g86Var12 = xe8Var.f48247x;
                        v11.m20244z(obj);
                        obj.getClass();
                        throw ((Throwable) obj);
                    default:
                        C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        xe8Var = new xe8(this, za2Var);
        Object obj2 = xe8Var.f48241C;
        i = xe8Var.f48243E;
        qc2 qc2Var2 = qc2.f34309u;
        switch (i) {
        }
    }

    @Override // p000.oad
    /* renamed from: q */
    public void mo2819q(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* renamed from: r */
    public String m2820r(String str) {
        List list;
        if (ee2.f9818a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = zy5.m23842h(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str.subSequence(i, length + 1).toString();
            Pattern compile = Pattern.compile("\\s+");
            compile.getClass();
            obj.getClass();
            stb.m18271k1(0);
            Matcher matcher = compile.matcher(obj);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int i2 = 0;
                do {
                    arrayList.add(obj.subSequence(i2, matcher.start()).toString());
                    i2 = matcher.end();
                } while (matcher.find());
                arrayList.add(obj.subSequence(i2, obj.length()).toString());
                list = arrayList;
            } else {
                list = mv1.m13793E(obj.toString());
            }
            String join = TextUtils.join(" ", (String[]) list.toArray(new String[0]));
            join.getClass();
            return join;
        } catch (Throwable th) {
            ee2.m7125a(this, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    @Override // p000.hhb
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2821s(Object obj, Object obj2) {
        n9c n9cVar = (n9c) obj;
        n9c n9cVar2 = (n9c) obj2;
        if (n9cVar == null || n9cVar2 == null) {
            return !((n9cVar == null) ^ (n9cVar2 == null));
        }
        if (n9cVar.f27902e != n9cVar2.f27902e || n9cVar.f27903f != n9cVar2.f27903f || n9cVar.f27899b != n9cVar2.f27899b || !zy5.m23838d(n9cVar.f27900c, n9cVar2.f27900c) || !n72.m13973c(n9cVar.f27901d, n9cVar2.f27901d)) {
        }
    }

    @Override // p000.kp3
    /* renamed from: t */
    public void mo2822t(op3 op3Var) {
        int i;
        String str = op3Var.f30985a;
        int i2 = op3Var.f30988d;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (wj8.m21476Y(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = str.charAt(op3Var.f30988d);
            char charAt3 = str.charAt(op3Var.f30988d + 1);
            if (wj8.m21476Y(charAt2) && wj8.m21476Y(charAt3)) {
                op3Var.m15221d((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                op3Var.f30988d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char m15218a = op3Var.m15218a();
        int m21481b0 = wj8.m21481b0(op3Var.f30988d, 0, str);
        if (m21481b0 == 0) {
            if (!wj8.m21477Z(m15218a)) {
                op3Var.m15221d((char) (m15218a + 1));
                op3Var.f30988d++;
                return;
            } else {
                op3Var.m15221d((char) 235);
                op3Var.m15221d((char) (m15218a - 127));
                op3Var.f30988d++;
                return;
            }
        }
        if (m21481b0 == 1) {
            op3Var.m15221d((char) 230);
            op3Var.f30989e = 1;
            return;
        }
        if (m21481b0 == 2) {
            op3Var.m15221d((char) 239);
            op3Var.f30989e = 2;
            return;
        }
        if (m21481b0 == 3) {
            op3Var.m15221d((char) 238);
            op3Var.f30989e = 3;
        } else if (m21481b0 == 4) {
            op3Var.m15221d((char) 240);
            op3Var.f30989e = 4;
        } else if (m21481b0 != 5) {
            C0917v3.m20303j("Illegal mode: ".concat(String.valueOf(m21481b0)));
        } else {
            op3Var.m15221d((char) 231);
            op3Var.f30989e = 5;
        }
    }

    @Override // p000.f87
    /* renamed from: u */
    public e87 mo2823u(g87 g87Var, e87 e87Var, e87 e87Var2) {
        z87 z87Var = (z87) g87Var;
        y87 y87Var = (y87) e87Var;
        y87 y87Var2 = (y87) e87Var2;
        T t = y87Var.get();
        if (t == 0) {
            return null;
        }
        int i = y87Var.f2800a;
        y87 y87Var3 = y87Var2 == null ? new y87(z87Var.f51934B, t, i) : new x87(z87Var.f51934B, t, i, y87Var2);
        y87Var3.f49908b = y87Var.f49908b;
        return y87Var3;
    }

    @Override // p000.InterfaceC0738q9
    /* renamed from: w */
    public Object mo26w(hc6 hc6Var, pi2 pi2Var) {
        switch (this.f4587u) {
            case 6:
                hc6Var.getClass();
                pi2Var.getClass();
                throw new IllegalStateException("Input type used in output position");
            default:
                hc6Var.getClass();
                pi2Var.getClass();
                throw new IllegalStateException("Input type used in output position");
        }
    }

    @Override // p000.f87
    /* renamed from: x */
    public void mo2824x(g87 g87Var, e87 e87Var, Object obj) {
        ((y87) e87Var).f49908b = obj;
    }

    /* renamed from: y */
    public int[] m2825y(String str) {
        if (ee2.f9818a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String m2820r = m2820r(str);
            Charset forName = Charset.forName("UTF-8");
            forName.getClass();
            byte[] bytes = m2820r.getBytes(forName);
            bytes.getClass();
            for (int i = 0; i < 128; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            ee2.m7125a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x066a, code lost:
    
        r9 = r29 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b A[LOOP:1: B:63:0x015d->B:71:0x018b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0392 A[LOOP:3: B:97:0x0390->B:98:0x0392, LOOP_END] */
    @Override // p000.cnd
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ku0 mo2808E(String str, int i, EnumMap enumMap) {
        int i2;
        boolean equals;
        sn7 sn7Var;
        byte[] bytes;
        int length;
        int i3;
        sn7 sn7Var2;
        hp3 hp3Var;
        int i4;
        int ordinal;
        hp3 hp3Var2;
        dad dadVar;
        int i5;
        int i6;
        int m11565e;
        int i7;
        int i8;
        int i9;
        char c;
        int i10;
        wc1 wc1Var;
        int i11;
        int[] iArr = aj2.f1129g;
        if (str.isEmpty()) {
            gpc.m8805e("Found empty contents");
            return null;
        }
        if (i != 12) {
            gpc.m8805e("Can only encode QR_CODE, but got ".concat(AbstractC0327f4.m7607A(i)));
            return null;
        }
        hp3 hp3Var3 = hp3.f16680u;
        if (enumMap.containsKey(hp3Var3)) {
            String obj = enumMap.get(hp3Var3).toString();
            if (obj == null) {
                ut1.m20047g("Name is null");
            } else if (!obj.equals(kfGHxXNRt.peNJt)) {
                if (obj.equals("M")) {
                    i2 = 2;
                } else if (obj.equals("Q")) {
                    i2 = 3;
                } else if (obj.equals("H")) {
                    i2 = 4;
                } else {
                    gpc.m8805e("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                }
                hp3 hp3Var4 = hp3.f16685z;
                int parseInt = enumMap.containsKey(hp3Var4) ? Integer.parseInt(enumMap.get(hp3Var4).toString()) : 4;
                hp3 hp3Var5 = hp3.f16681v;
                boolean containsKey = enumMap.containsKey(hp3Var5);
                String obj2 = containsKey ? enumMap.get(hp3Var5).toString() : "ISO-8859-1";
                equals = "Shift_JIS".equals(obj2);
                int i12 = 0;
                sn7Var = sn7.BYTE;
                if (equals) {
                    try {
                        bytes = str.getBytes("Shift_JIS");
                        length = bytes.length;
                    } catch (UnsupportedEncodingException unused) {
                    }
                    if (length % 2 == 0) {
                        for (0; i3 < length; i3 + 2) {
                            int i13 = bytes[i3] & 255;
                            i3 = ((i13 >= 129 && i13 <= 159) || (i13 >= 224 && i13 <= 235)) ? i3 + 2 : 0;
                        }
                        sn7Var2 = sn7.KANJI;
                        int[] iArr2 = sn7Var2.f38835u;
                        ju0 ju0Var = new ju0();
                        if (sn7Var2 != sn7Var && containsKey && (wc1Var = (wc1) wc1.f46135x.get(obj2)) != null) {
                            ju0Var.m11562b(7, 4);
                            ju0Var.m11562b(wc1Var.f46137u[0], 8);
                        }
                        hp3Var = hp3.f16678F;
                        if (enumMap.containsKey(hp3Var) || !Boolean.valueOf(enumMap.get(hp3Var).toString()).booleanValue()) {
                            i4 = 4;
                        } else {
                            i4 = 4;
                            ju0Var.m11562b(5, 4);
                        }
                        ju0Var.m11562b(sn7Var2.f38836v, i4);
                        ju0 ju0Var2 = new ju0();
                        ordinal = sn7Var2.ordinal();
                        int i14 = 10;
                        if (ordinal == 1) {
                            int i15 = 8;
                            if (ordinal == 2) {
                                int length2 = str.length();
                                int i16 = 0;
                                while (i16 < length2) {
                                    char charAt = str.charAt(i16);
                                    int i17 = charAt < '`' ? iArr[charAt] : -1;
                                    if (i17 == -1) {
                                        throw new dnd();
                                    }
                                    int i18 = i16 + 1;
                                    if (i18 < length2) {
                                        char charAt2 = str.charAt(i18);
                                        int i19 = charAt2 < '`' ? iArr[charAt2] : -1;
                                        if (i19 == -1) {
                                            throw new dnd();
                                        }
                                        ju0Var2.m11562b((i17 * 45) + i19, 11);
                                        i16 += 2;
                                    } else {
                                        ju0Var2.m11562b(i17, 6);
                                        i16 = i18;
                                    }
                                }
                            } else if (ordinal == i4) {
                                try {
                                    byte[] bytes2 = str.getBytes(obj2);
                                    int length3 = bytes2.length;
                                    int i20 = 0;
                                    while (i20 < length3) {
                                        ju0Var2.m11562b(bytes2[i20], i15);
                                        i20++;
                                        i15 = 8;
                                    }
                                } catch (UnsupportedEncodingException e) {
                                    throw new dnd(e);
                                }
                            } else {
                                if (ordinal != 6) {
                                    throw new dnd("Invalid mode: ".concat(String.valueOf(sn7Var2)));
                                }
                                try {
                                    byte[] bytes3 = str.getBytes("Shift_JIS");
                                    int length4 = bytes3.length;
                                    for (int i21 = 0; i21 < length4; i21 += 2) {
                                        int i22 = ((bytes3[i21] & 255) << 8) | (bytes3[i21 + 1] & 255);
                                        int i23 = 33088;
                                        if (i22 < 33088 || i22 > 40956) {
                                            if (i22 < 57408 || i22 > 60351) {
                                                i10 = -1;
                                                if (i10 != -1) {
                                                    throw new dnd("Invalid byte sequence");
                                                }
                                                ju0Var2.m11562b(((i10 >> 8) * 192) + (i10 & 255), 13);
                                            } else {
                                                i23 = 49472;
                                            }
                                        }
                                        i10 = i22 - i23;
                                        if (i10 != -1) {
                                        }
                                    }
                                } catch (UnsupportedEncodingException e2) {
                                    throw new dnd(e2);
                                }
                            }
                        } else {
                            int length5 = str.length();
                            int i24 = 0;
                            while (i24 < length5) {
                                int charAt3 = str.charAt(i24) - '0';
                                int i25 = i24 + 2;
                                if (i25 < length5) {
                                    ju0Var2.m11562b(((str.charAt(i24 + 1) - '0') * 10) + (charAt3 * 100) + (str.charAt(i25) - '0'), i14);
                                    i24 += 3;
                                } else {
                                    i24++;
                                    if (i24 < length5) {
                                        ju0Var2.m11562b((charAt3 * 10) + (str.charAt(i24) - '0'), 7);
                                        i24 = i25;
                                    } else {
                                        ju0Var2.m11562b(charAt3, 4);
                                    }
                                }
                                i14 = 10;
                            }
                        }
                        hp3Var2 = hp3.f16677E;
                        if (enumMap.containsKey(hp3Var2)) {
                            dad m6034a = dad.m6034a(1);
                            int i26 = ju0Var.f21172v;
                            byte b = m6034a.f7674a;
                            int i27 = iArr2[b <= 9 ? (char) 0 : b <= 26 ? (char) 1 : (char) 2] + i26 + ju0Var2.f21172v;
                            int i28 = 1;
                            while (i28 <= 40) {
                                dad m6034a2 = dad.m6034a(i28);
                                int i29 = m6034a2.f7676c;
                                cad cadVar = m6034a2.f7675b[sj8.m18088E(i2)];
                                int i30 = cadVar.f4734u;
                                bad[] badVarArr = (bad[]) cadVar.f4735v;
                                int length6 = badVarArr.length;
                                int i31 = i12;
                                int i32 = i31;
                                while (i31 < length6) {
                                    int i33 = i31;
                                    i32 += badVarArr[i33].f2975a;
                                    i31 = i33 + 1;
                                }
                                if (i29 - (i32 * i30) >= (i27 + 7) / 8) {
                                    int i34 = ju0Var.f21172v;
                                    byte b2 = m6034a2.f7674a;
                                    int i35 = iArr2[b2 <= 9 ? i12 : b2 <= 26 ? 1 : 2] + i34 + ju0Var2.f21172v;
                                    int i36 = 1;
                                    while (i36 <= 40) {
                                        dad m6034a3 = dad.m6034a(i36);
                                        int i37 = m6034a3.f7676c;
                                        cad cadVar2 = m6034a3.f7675b[sj8.m18088E(i2)];
                                        int i38 = cadVar2.f4734u;
                                        bad[] badVarArr2 = (bad[]) cadVar2.f4735v;
                                        int length7 = badVarArr2.length;
                                        int i39 = i12;
                                        int i40 = i39;
                                        while (i39 < length7) {
                                            int i41 = i39;
                                            i40 += badVarArr2[i41].f2975a;
                                            i39 = i41 + 1;
                                        }
                                        if (i37 - (i40 * i38) >= (i35 + 7) / 8) {
                                            dadVar = m6034a3;
                                        } else {
                                            i36++;
                                            i12 = 0;
                                        }
                                    }
                                    throw new dnd("Data too big");
                                }
                                i28++;
                                i12 = 0;
                            }
                            throw new dnd("Data too big");
                        }
                        dadVar = dad.m6034a(Integer.parseInt(enumMap.get(hp3Var2).toString()));
                        int i42 = ju0Var.f21172v;
                        byte b3 = dadVar.f7674a;
                        int i43 = iArr2[b3 <= 9 ? (char) 0 : b3 <= 26 ? (char) 1 : (char) 2] + i42 + ju0Var2.f21172v;
                        int i44 = dadVar.f7676c;
                        cad cadVar3 = dadVar.f7675b[sj8.m18088E(i2)];
                        int i45 = cadVar3.f4734u;
                        int i46 = 0;
                        for (bad badVar : (bad[]) cadVar3.f4735v) {
                            i46 += badVar.f2975a;
                        }
                        if (i44 - (i46 * i45) < (i43 + 7) / 8) {
                            throw new dnd("Data too big for requested version");
                        }
                        byte b4 = dadVar.f7674a;
                        int i47 = dadVar.f7676c;
                        ju0 ju0Var3 = new ju0();
                        i5 = ju0Var.f21172v;
                        ju0Var3.m11563c(i5);
                        for (i6 = i12; i6 < i5; i6++) {
                            ju0Var3.m11561a(ju0Var.m11564d(i6));
                        }
                        m11565e = sn7Var2 != sn7Var ? ju0Var2.m11565e() : str.length();
                        int i48 = iArr2[b4 > 9 ? i12 : b4 <= 26 ? 1 : 2];
                        i7 = 1 << i48;
                        if (m11565e < i7) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(m11565e);
                            sb.append(" is bigger than ");
                            sb.append(i7 - 1);
                            throw new dnd(sb.toString());
                        }
                        ju0Var3.m11562b(m11565e, i48);
                        int i49 = ju0Var2.f21172v;
                        ju0Var3.m11563c(ju0Var3.f21172v + i49);
                        for (int i50 = i12; i50 < i49; i50++) {
                            ju0Var3.m11561a(ju0Var2.m11564d(i50));
                        }
                        cad cadVar4 = dadVar.f7675b[sj8.m18088E(i2)];
                        int i51 = cadVar4.f4734u;
                        bad[] badVarArr3 = (bad[]) cadVar4.f4735v;
                        int length8 = badVarArr3.length;
                        int i52 = i12;
                        int i53 = i52;
                        while (i52 < length8) {
                            i53 += badVarArr3[i52].f2975a;
                            i52++;
                        }
                        int i54 = i47 - (i53 * i51);
                        int i55 = i54 << 3;
                        if (ju0Var3.f21172v > i55) {
                            throw new dnd("data bits cannot fit in the QR Code" + ju0Var3.f21172v + " > " + i55);
                        }
                        for (int i56 = i12; i56 < 4 && ju0Var3.f21172v < i55; i56++) {
                            ju0Var3.m11561a(i12);
                        }
                        boolean z = i12;
                        int i57 = ju0Var3.f21172v & 7;
                        if (i57 > 0) {
                            while (i57 < 8) {
                                ju0Var3.m11561a(z);
                                i57++;
                                z = 0;
                            }
                        }
                        int m11565e2 = i54 - ju0Var3.m11565e();
                        for (int i58 = 0; i58 < m11565e2; i58++) {
                            ju0Var3.m11562b((i58 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (ju0Var3.f21172v != i55) {
                            throw new dnd("Bits size does not equal capacity");
                        }
                        int i59 = 0;
                        for (bad badVar2 : badVarArr3) {
                            i59 += badVar2.f2975a;
                        }
                        if (ju0Var3.m11565e() != i54) {
                            throw new dnd("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(i59);
                        int i60 = 0;
                        int i61 = 0;
                        int i62 = 0;
                        int i63 = 0;
                        while (i60 < i59) {
                            int[] iArr3 = new int[1];
                            int[] iArr4 = new int[1];
                            if (i60 >= i59) {
                                throw new dnd("Block ID too large");
                            }
                            int i64 = i47 % i59;
                            byte b5 = b4;
                            int i65 = i59 - i64;
                            int i66 = i47 / i59;
                            int i67 = i54 / i59;
                            int i68 = i67 + 1;
                            int i69 = parseInt;
                            int i70 = i66 - i67;
                            int i71 = (i66 + 1) - i68;
                            if (i70 != i71) {
                                throw new dnd("EC bytes mismatch");
                            }
                            if (i59 != i65 + i64) {
                                throw new dnd("RS blocks mismatch");
                            }
                            if (i47 != ((i68 + i71) * i64) + ((i67 + i70) * i65)) {
                                throw new dnd("Total bytes mismatch");
                            }
                            if (i60 < i65) {
                                c = 0;
                                iArr3[0] = i67;
                                iArr4[0] = i70;
                            } else {
                                c = 0;
                                iArr3[0] = i68;
                                iArr4[0] = i71;
                            }
                            int i72 = iArr3[c];
                            byte[] bArr = new byte[i72];
                            int i73 = i61 << 3;
                            int i74 = 0;
                            while (i74 < i72) {
                                int i75 = i60;
                                int i76 = i59;
                                int i77 = i74;
                                int i78 = i73;
                                int i79 = 0;
                                for (int i80 = 0; i80 < 8; i80++) {
                                    if (ju0Var3.m11564d(i78)) {
                                        i79 |= 1 << (7 - i80);
                                    }
                                    i78++;
                                }
                                bArr[i77] = (byte) i79;
                                i74 = i77 + 1;
                                i73 = i78;
                                i60 = i75;
                                i59 = i76;
                            }
                            int i81 = i60;
                            int i82 = i59;
                            int i83 = iArr4[0];
                            int[] iArr5 = new int[i72 + i83];
                            for (int i84 = 0; i84 < i72; i84++) {
                                iArr5[i84] = bArr[i84] & 255;
                            }
                            new wg5(go4.f14526k).m21340r(iArr5, i83);
                            byte[] bArr2 = new byte[i83];
                            int i85 = 0;
                            while (i85 < i83) {
                                int[] iArr6 = iArr5;
                                bArr2[i85] = (byte) iArr6[i72 + i85];
                                i85++;
                                iArr5 = iArr6;
                            }
                            arrayList.add(new nv0(bArr, bArr2));
                            i62 = Math.max(i62, i72);
                            i63 = Math.max(i63, i83);
                            i61 += iArr3[0];
                            i60 = i81 + 1;
                            i59 = i82;
                            b4 = b5;
                            parseInt = i69;
                        }
                        byte b6 = b4;
                        int i86 = parseInt;
                        if (i54 != i61) {
                            throw new dnd("Data bytes does not match offset");
                        }
                        ju0 ju0Var4 = new ju0();
                        for (int i87 = 0; i87 < i62; i87++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArr3 = ((nv0) it.next()).f28938a;
                                if (i87 < bArr3.length) {
                                    ju0Var4.m11562b(bArr3[i87], 8);
                                }
                            }
                        }
                        for (int i88 = 0; i88 < i63; i88++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArr4 = ((nv0) it2.next()).f28939b;
                                if (i88 < bArr4.length) {
                                    ju0Var4.m11562b(bArr4[i88], 8);
                                }
                            }
                        }
                        if (i47 != ju0Var4.m11565e()) {
                            StringBuilder m19217r = tz6.m19217r(i47, "Interleaving error: ", " and ");
                            m19217r.append(ju0Var4.m11565e());
                            m19217r.append(" differ.");
                            throw new dnd(m19217r.toString());
                        }
                        int i89 = (b6 * 4) + 17;
                        xa8 xa8Var = new xa8(i89, i89);
                        int i90 = xa8Var.f48008w;
                        int i91 = xa8Var.f48007v;
                        int i92 = Integer.MAX_VALUE;
                        int i93 = 0;
                        int i94 = -1;
                        while (i93 < 8) {
                            yv5.m23081h(ju0Var4, i2, dadVar, i93, xa8Var);
                            int m7812e = fa7.m7812e(xa8Var, false) + fa7.m7812e(xa8Var, true);
                            byte[][] bArr5 = (byte[][]) xa8Var.f48009x;
                            int i95 = 0;
                            int i96 = 0;
                            while (i95 < i90 - 1) {
                                byte[] bArr6 = bArr5[i95];
                                int i97 = i96;
                                int i98 = 0;
                                while (i98 < i91 - 1) {
                                    byte b7 = bArr6[i98];
                                    int i99 = i98 + 1;
                                    int i100 = i95;
                                    if (b7 == bArr6[i99]) {
                                        byte[] bArr7 = bArr5[i100 + 1];
                                        if (b7 == bArr7[i98] && b7 == bArr7[i99]) {
                                            i97++;
                                        }
                                    }
                                    i98 = i99;
                                    i95 = i100;
                                }
                                i95++;
                                i96 = i97;
                            }
                            int i101 = (i96 * 3) + m7812e;
                            int i102 = 0;
                            int i103 = 0;
                            while (i102 < i90) {
                                int i104 = 0;
                                while (i104 < i91) {
                                    byte[] bArr8 = bArr5[i102];
                                    int i105 = i104 + 6;
                                    int i106 = i103;
                                    if (i105 < i91) {
                                        i8 = i93;
                                        byte b8 = 1;
                                        if (bArr8[i104] == 1 && bArr8[i104 + 1] == 0 && bArr8[i104 + 2] == 1 && bArr8[i104 + 3] == 1 && bArr8[i104 + 4] == 1 && bArr8[i104 + 5] == 0 && bArr8[i105] == 1) {
                                            int max = Math.max(i104 - 4, 0);
                                            int min = Math.min(i104, bArr8.length);
                                            while (true) {
                                                if (max >= min) {
                                                    break;
                                                }
                                                int i107 = max;
                                                if (bArr8[i107] == b8) {
                                                    int max2 = Math.max(i104 + 7, 0);
                                                    int min2 = Math.min(i104 + 11, bArr8.length);
                                                    while (max2 < min2) {
                                                        int i108 = max2;
                                                        if (bArr8[max2] != 1) {
                                                            max2 = i108 + 1;
                                                        }
                                                    }
                                                } else {
                                                    max = i107 + 1;
                                                    b8 = 1;
                                                }
                                            }
                                        }
                                    } else {
                                        i8 = i93;
                                    }
                                    i103 = i106;
                                    int i109 = i102 + 6;
                                    if (i109 < i90) {
                                        byte b9 = 1;
                                        if (bArr5[i102][i104] == 1 && bArr5[i102 + 1][i104] == 0 && bArr5[i102 + 2][i104] == 1 && bArr5[i102 + 3][i104] == 1 && bArr5[i102 + 4][i104] == 1 && bArr5[i102 + 5][i104] == 0 && bArr5[i109][i104] == 1) {
                                            int max3 = Math.max(i102 - 4, 0);
                                            int min3 = Math.min(i102, bArr5.length);
                                            while (true) {
                                                if (max3 >= min3) {
                                                    i9 = i102;
                                                    break;
                                                }
                                                i9 = i102;
                                                if (bArr5[max3][i104] == b9) {
                                                    int min4 = Math.min(i9 + 11, bArr5.length);
                                                    for (int max4 = Math.max(i9 + 7, 0); max4 < min4; max4++) {
                                                        if (bArr5[max4][i104] == 1) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    max3++;
                                                    i102 = i9;
                                                    b9 = 1;
                                                }
                                            }
                                            i103++;
                                            i104++;
                                            i93 = i8;
                                            i102 = i9;
                                        }
                                    }
                                    i9 = i102;
                                    i104++;
                                    i93 = i8;
                                    i102 = i9;
                                }
                                i102++;
                            }
                            int i110 = i93;
                            int i111 = (i103 * 40) + i101;
                            int i112 = 0;
                            for (int i113 = 0; i113 < i90; i113++) {
                                byte[] bArr9 = bArr5[i113];
                                for (int i114 = 0; i114 < i91; i114++) {
                                    if (bArr9[i114] == 1) {
                                        i112++;
                                    }
                                }
                            }
                            int i115 = i90 * i91;
                            int abs = (((Math.abs((i112 << 1) - i115) * 10) / i115) * 10) + i111;
                            if (abs < i92) {
                                i92 = abs;
                                i94 = i110;
                            }
                            i93 = i110 + 1;
                        }
                        yv5.m23081h(ju0Var4, i2, dadVar, i94, xa8Var);
                        int i116 = i86 << 1;
                        int i117 = i91 + i116;
                        int i118 = i116 + i90;
                        int max5 = Math.max(200, i117);
                        int max6 = Math.max(200, i118);
                        int min5 = Math.min(max5 / i117, max6 / i118);
                        int i119 = (max5 - (i91 * min5)) / 2;
                        int i120 = (max6 - (i90 * min5)) / 2;
                        ku0 ku0Var = new ku0(max5, max6);
                        int i121 = 0;
                        while (i121 < i90) {
                            int i122 = i119;
                            int i123 = 0;
                            while (i123 < i91) {
                                if (xa8Var.m21986e(i123, i121) == 1) {
                                    ku0Var.m12307c(i122, i120, min5, min5);
                                }
                                i123++;
                                i122 += min5;
                            }
                            i121++;
                            i120 += min5;
                        }
                        return ku0Var;
                    }
                }
                i11 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i11 < str.length()) {
                        char charAt4 = str.charAt(i11);
                        if (charAt4 < '0' || charAt4 > '9') {
                            if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                                break;
                            }
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        i11++;
                    } else if (z2) {
                        sn7Var2 = sn7.ALPHANUMERIC;
                    } else if (z3) {
                        sn7Var2 = sn7.NUMERIC;
                    }
                }
                sn7Var2 = sn7Var;
                int[] iArr22 = sn7Var2.f38835u;
                ju0 ju0Var5 = new ju0();
                if (sn7Var2 != sn7Var) {
                }
                hp3Var = hp3.f16678F;
                if (enumMap.containsKey(hp3Var)) {
                }
                i4 = 4;
                ju0Var5.m11562b(sn7Var2.f38836v, i4);
                ju0 ju0Var22 = new ju0();
                ordinal = sn7Var2.ordinal();
                int i142 = 10;
                if (ordinal == 1) {
                }
                hp3Var2 = hp3.f16677E;
                if (enumMap.containsKey(hp3Var2)) {
                }
                byte b42 = dadVar.f7674a;
                int i472 = dadVar.f7676c;
                ju0 ju0Var32 = new ju0();
                i5 = ju0Var5.f21172v;
                ju0Var32.m11563c(i5);
                while (i6 < i5) {
                }
                if (sn7Var2 != sn7Var) {
                }
                int i482 = iArr22[b42 > 9 ? i12 : b42 <= 26 ? 1 : 2];
                i7 = 1 << i482;
                if (m11565e < i7) {
                }
            }
            i2 = 0;
            hp3 hp3Var42 = hp3.f16685z;
            if (enumMap.containsKey(hp3Var42)) {
            }
            hp3 hp3Var52 = hp3.f16681v;
            boolean containsKey2 = enumMap.containsKey(hp3Var52);
            if (containsKey2) {
            }
            equals = "Shift_JIS".equals(obj2);
            int i124 = 0;
            sn7Var = sn7.BYTE;
            if (equals) {
            }
            i11 = 0;
            boolean z22 = false;
            boolean z32 = false;
            while (true) {
                if (i11 < str.length()) {
                }
                i11++;
            }
            sn7Var2 = sn7Var;
            int[] iArr222 = sn7Var2.f38835u;
            ju0 ju0Var52 = new ju0();
            if (sn7Var2 != sn7Var) {
            }
            hp3Var = hp3.f16678F;
            if (enumMap.containsKey(hp3Var)) {
            }
            i4 = 4;
            ju0Var52.m11562b(sn7Var2.f38836v, i4);
            ju0 ju0Var222 = new ju0();
            ordinal = sn7Var2.ordinal();
            int i1422 = 10;
            if (ordinal == 1) {
            }
            hp3Var2 = hp3.f16677E;
            if (enumMap.containsKey(hp3Var2)) {
            }
            byte b422 = dadVar.f7674a;
            int i4722 = dadVar.f7676c;
            ju0 ju0Var322 = new ju0();
            i5 = ju0Var52.f21172v;
            ju0Var322.m11563c(i5);
            while (i6 < i5) {
            }
            if (sn7Var2 != sn7Var) {
            }
            int i4822 = iArr222[b422 > 9 ? i124 : b422 <= 26 ? 1 : 2];
            i7 = 1 << i4822;
            if (m11565e < i7) {
            }
        }
        i2 = 1;
        hp3 hp3Var422 = hp3.f16685z;
        if (enumMap.containsKey(hp3Var422)) {
        }
        hp3 hp3Var522 = hp3.f16681v;
        boolean containsKey22 = enumMap.containsKey(hp3Var522);
        if (containsKey22) {
        }
        equals = "Shift_JIS".equals(obj2);
        int i1242 = 0;
        sn7Var = sn7.BYTE;
        if (equals) {
        }
        i11 = 0;
        boolean z222 = false;
        boolean z322 = false;
        while (true) {
            if (i11 < str.length()) {
            }
            i11++;
        }
        sn7Var2 = sn7Var;
        int[] iArr2222 = sn7Var2.f38835u;
        ju0 ju0Var522 = new ju0();
        if (sn7Var2 != sn7Var) {
        }
        hp3Var = hp3.f16678F;
        if (enumMap.containsKey(hp3Var)) {
        }
        i4 = 4;
        ju0Var522.m11562b(sn7Var2.f38836v, i4);
        ju0 ju0Var2222 = new ju0();
        ordinal = sn7Var2.ordinal();
        int i14222 = 10;
        if (ordinal == 1) {
        }
        hp3Var2 = hp3.f16677E;
        if (enumMap.containsKey(hp3Var2)) {
        }
        byte b4222 = dadVar.f7674a;
        int i47222 = dadVar.f7676c;
        ju0 ju0Var3222 = new ju0();
        i5 = ju0Var522.f21172v;
        ju0Var3222.m11563c(i5);
        while (i6 < i5) {
        }
        if (sn7Var2 != sn7Var) {
        }
        int i48222 = iArr2222[b4222 > 9 ? i1242 : b4222 <= 26 ? 1 : 2];
        i7 = 1 << i48222;
        if (m11565e < i7) {
        }
    }

    public /* synthetic */ c7d(byte b) {
        this.f4587u = b;
    }
}
