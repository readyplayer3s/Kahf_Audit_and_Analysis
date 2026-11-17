package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import coil3.decode.p009lL.mDZxtsynkk;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.measurement.internal.jhdS.oavfxXVsJYlYK;
import com.kahf.dns.R;
import com.kahf.dns.features.analytics.FtDH.mmUZEXxylxd;
import com.kahf.dns.p015di.core.p016mT.NwivstN;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: gi */
/* loaded from: classes.dex */
public abstract class AbstractC0378gi {

    /* renamed from: a */
    public static final char[] f14222a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final Class[] f14223b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: c */
    public static final ok7 f14224c = new ok7(5);

    /* renamed from: d */
    public static final ok7 f14225d = new ok7(6);

    /* renamed from: e */
    public static final ok7 f14226e = new ok7(7);

    /* renamed from: f */
    public static final ok7 f14227f = new ok7(8);

    /* renamed from: g */
    public static final Object f14228g = new Object();

    /* renamed from: h */
    public static boolean f14229h;

    /* renamed from: i */
    public static int f14230i;

    /* renamed from: j */
    public static volatile String f14231j;

    /* renamed from: k */
    public static volatile String f14232k;

    /* renamed from: l */
    public static volatile boolean f14233l;

    /* renamed from: m */
    public static in5 f14234m;

    /* renamed from: n */
    public static in5 f14235n;

    /* renamed from: A */
    public static final Object[] m8656A(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        v90.m20535M(0, i, 6, objArr, objArr2);
        v90.m20531I(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* renamed from: C */
    public static byte[] m8658C(xk2 xk2Var) {
        String str;
        xk2Var.getClass();
        HashMap hashMap = xk2Var.f48544a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    m8659D(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            str = nn2.f28518a;
            sy6.m18418c().m18421b(str, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    /* renamed from: D */
    public static final void m8659D(DataOutputStream dataOutputStream, String str, Object obj) {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                gpc.m8805e(sj8.m18102n("Unsupported value type ", d0a.m5838a(obj.getClass()).m23680f()));
                return;
            }
            Object[] objArr = (Object[]) obj;
            zn1 m5838a = d0a.m5838a(objArr.getClass());
            if (m5838a.equals(d0a.m5838a(Boolean[].class))) {
                i = 8;
            } else if (m5838a.equals(d0a.m5838a(Byte[].class))) {
                i = 9;
            } else if (m5838a.equals(d0a.m5838a(Integer[].class))) {
                i = 10;
            } else if (m5838a.equals(d0a.m5838a(Long[].class))) {
                i = 11;
            } else if (m5838a.equals(d0a.m5838a(Float[].class))) {
                i = 12;
            } else if (m5838a.equals(d0a.m5838a(Double[].class))) {
                i = 13;
            } else {
                if (!m5838a.equals(d0a.m5838a(String[].class))) {
                    gpc.m8805e(sj8.m18102n("Unsupported value type ", d0a.m5838a(objArr.getClass()).m23679e()));
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : Utils.DOUBLE_EPSILON);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* renamed from: a */
    public static final void m8660a(File file, File file2) {
        Path path = file.toPath();
        Path path2 = file2.toPath();
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            path.getClass();
            path2.getClass();
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e2) {
                u6d.m19366a(e2, e);
                throw e2;
            }
        } catch (FileAlreadyExistsException e3) {
            path.getClass();
            path2.getClass();
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e4) {
                u6d.m19366a(e4, e3);
                throw e4;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m8661b(Object obj) {
        if (obj instanceof fhb) {
            fhb fhbVar = (fhb) obj;
            if (fhbVar.mo2439d() == ou9.f31288A || fhbVar.mo2439d() == ou9.f31290C || fhbVar.mo2439d() == ou9.f31289B) {
                Object value = fhbVar.getValue();
                if (value == null) {
                    return true;
                }
                return m8661b(value);
            }
        } else if (!(obj instanceof km4) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f14223b[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m8662c(Object obj, Object obj2) {
        if (obj == null) {
            ut1.m20047g(pr1.m15978l("null key in entry: null=", obj2));
        } else {
            if (obj2 != null) {
                return;
            }
            ut1.m20047g(tz6.m19209j(obj, "null value in entry: ", "=null"));
        }
    }

    /* renamed from: d */
    public static void m8663d(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: e */
    public static final boolean m8664e(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static p07 m8665f() {
        return i0a.f17210y == null ? new i0a() : new ifc((byte) 6);
    }

    /* renamed from: g */
    public static final float m8666g(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: i */
    public static final Serializable m8668i(DataInputStream dataInputStream, byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i < readInt) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i < readInt2) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i < readInt3) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i < readInt4) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i < readInt5) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i < readInt6) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b != 14) {
            C0917v3.m20303j(sj8.m18101m(b, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (zy5.m23838d(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i] = readUTF;
            i++;
        }
        return r1;
    }

    /* renamed from: j */
    public static final ycd m8669j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            ycd ycdVar = tag instanceof ycd ? (ycd) tag : null;
            if (ycdVar != null) {
                return ycdVar;
            }
            Object m14544p = nud.m14544p(view);
            view = m14544p instanceof View ? (View) m14544p : null;
        }
        return null;
    }

    /* renamed from: l */
    public static String m8670l() {
        String m18243C1;
        if (f14233l) {
            m18243C1 = f14232k;
        } else {
            if (v20.m20278v()) {
                String m22286E = xt4.m22286E();
                if (m22286E != null) {
                    m18243C1 = stb.m18243C1(stb.m18242B1(m22286E).toString(), '/');
                    if (m18243C1.length() == 0) {
                        m18243C1 = null;
                    }
                    f14232k = m18243C1;
                    f14233l = true;
                    if (m18243C1 != null) {
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18369g(ly6.f25311x, "ApiEndpoint", null, "⚠️ DEBUG API base URL override in use: ".concat(m18243C1));
                    }
                }
            } else {
                f14233l = true;
            }
            m18243C1 = null;
        }
        String str = f14231j;
        return m18243C1 == null ? str == null ? "https://id.kahf.co" : str : m18243C1;
    }

    /* renamed from: n */
    public static final Class m8671n(jd6 jd6Var) {
        jd6Var.getClass();
        Class mo12220d = ((xn1) jd6Var).mo12220d();
        mo12220d.getClass();
        return mo12220d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: o */
    public static final Class m8672o(jd6 jd6Var) {
        jd6Var.getClass();
        Class mo12220d = ((xn1) jd6Var).mo12220d();
        if (mo12220d.isPrimitive()) {
            String name = mo12220d.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return mo12220d;
    }

    /* renamed from: p */
    public static String m8673p(Class cls) {
        LinkedHashMap linkedHashMap = k28.f21533b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            i28 i28Var = (i28) cls.getAnnotation(i28.class);
            str = i28Var != null ? i28Var.value() : null;
            if (str == null || str.length() <= 0) {
                C0917v3.m20302i("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    /* renamed from: q */
    public static final wd6 m8674q(wd6 wd6Var) {
        wd6Var.getClass();
        return wd6Var.mo12d().mo2594c() ? wd6Var : new r88(wd6Var);
    }

    /* renamed from: s */
    public static final int m8675s(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: t */
    public static final Object[] m8676t(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        v90.m20535M(0, i, 6, objArr, objArr2);
        v90.m20531I(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* renamed from: v */
    public static String m8677v(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            gpc.m8805e("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: w */
    public static final void m8678w(float[] fArr, float[] fArr2) {
        float m8666g = m8666g(0, 0, fArr2, fArr);
        float m8666g2 = m8666g(0, 1, fArr2, fArr);
        float m8666g3 = m8666g(0, 2, fArr2, fArr);
        float m8666g4 = m8666g(0, 3, fArr2, fArr);
        float m8666g5 = m8666g(1, 0, fArr2, fArr);
        float m8666g6 = m8666g(1, 1, fArr2, fArr);
        float m8666g7 = m8666g(1, 2, fArr2, fArr);
        float m8666g8 = m8666g(1, 3, fArr2, fArr);
        float m8666g9 = m8666g(2, 0, fArr2, fArr);
        float m8666g10 = m8666g(2, 1, fArr2, fArr);
        float m8666g11 = m8666g(2, 2, fArr2, fArr);
        float m8666g12 = m8666g(2, 3, fArr2, fArr);
        float m8666g13 = m8666g(3, 0, fArr2, fArr);
        float m8666g14 = m8666g(3, 1, fArr2, fArr);
        float m8666g15 = m8666g(3, 2, fArr2, fArr);
        float m8666g16 = m8666g(3, 3, fArr2, fArr);
        fArr[0] = m8666g;
        fArr[1] = m8666g2;
        fArr[2] = m8666g3;
        fArr[3] = m8666g4;
        fArr[4] = m8666g5;
        fArr[5] = m8666g6;
        fArr[6] = m8666g7;
        fArr[7] = m8666g8;
        fArr[8] = m8666g9;
        fArr[9] = m8666g10;
        fArr[10] = m8666g11;
        fArr[11] = m8666g12;
        fArr[12] = m8666g13;
        fArr[13] = m8666g14;
        fArr[14] = m8666g15;
        fArr[15] = m8666g16;
    }

    /* renamed from: x */
    public static final void m8679x(float[] fArr, float f, float f2, float[] fArr2) {
        db7.m6059e(fArr2);
        db7.m6063i(fArr2, f, f2);
        m8678w(fArr, fArr2);
    }

    /* renamed from: z */
    public static final Object[] m8681z(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        v90.m20535M(0, i, 6, objArr, objArr2);
        v90.m20531I(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* renamed from: k */
    public Method mo8294k(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* renamed from: m */
    public Constructor mo8295m(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* renamed from: r */
    public String[] mo8296r(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* renamed from: u */
    public boolean mo8297u(Class cls) {
        return false;
    }

    /* renamed from: B */
    public static void m8657B(Context context, p99 p99Var) {
        String str;
        jb9 jb9Var = p99Var.f30028x;
        if (jb9Var instanceof mb9) {
            jb9Var = new cx5(p99Var, (byte) 23);
        }
        jb9Var.getClass();
        p99Var.f30028x = jb9Var;
        r2c r2cVar = new r2c(new C0755qq(context, p99Var, (byte) 12));
        C0381gl c0381gl = new C0381gl(r2cVar, (byte) 29);
        String packageName = context.getPackageName();
        String str2 = "";
        String str3 = packageName == null ? "" : packageName;
        if (str3.length() > 0 && !ztb.m23781F0(str3, "android.", false)) {
            ((List) p99Var.f30021q.f8141b).add(str3);
        }
        r99 r99Var = p99Var.f30030z;
        w99 w99Var = p99Var.f29996H;
        List list = null;
        if (r99Var == null) {
            if (w99Var == null) {
                w99Var = null;
            }
            if (w99Var == null) {
                w99Var = new w99(context);
            }
            w99 w99Var2 = w99Var;
            if (p99Var.f29996H == null) {
                p99Var.f29996H = w99Var2;
            }
            p99Var.f30030z = new r99(context, p99Var, c0381gl, new C0561lh(0, w99Var2, w99.class, "getNetworkProperties", "getNetworkProperties$posthog_android_release()Ljava/util/Map;", 0, (byte) 5));
            if (p99Var.f29996H != w99Var2) {
                p99Var.m14916a(new x99(w99Var2));
            }
        } else if (w99Var == null) {
            p99Var.f29996H = new w99(context);
        }
        r2c r2cVar2 = new r2c(new n74(context, (byte) 3));
        String str4 = p99Var.f29991C;
        if (str4 == null) {
            str4 = context.getDir(mmUZEXxylxd.YdOZVEc, 0).getAbsolutePath();
        }
        p99Var.f29991C = str4;
        String str5 = p99Var.f29992D;
        if (str5 == null) {
            str5 = new File((File) r2cVar2.getValue(), "posthog-disk-queue").getAbsolutePath();
        }
        p99Var.f29992D = str5;
        String str6 = p99Var.f29993E;
        if (str6 == null) {
            str6 = new File((File) r2cVar2.getValue(), "posthog-disk-replay-queue").getAbsolutePath();
        }
        p99Var.f29993E = str6;
        String str7 = p99Var.f29994F;
        if (str7 == null) {
            str7 = new File((File) r2cVar2.getValue(), "posthog-disk-logs-queue").getAbsolutePath();
        }
        p99Var.f29994F = str7;
        pb9 pb9Var = p99Var.f29995G;
        if (pb9Var == null) {
            pb9Var = new qd9(context, p99Var);
        }
        p99Var.f29995G = pb9Var;
        if (Build.VERSION.SDK_INT >= 33) {
            ra9 ra9Var = p99Var.f30000L;
            if (ra9Var instanceof ta9) {
                t99 t99Var = new t99();
                p99Var.f30000L = t99Var;
                wfc.f46409e = t99Var;
                Object obj = pd9.f32322a;
                pd9.f32325d = t99Var;
            } else {
                byte[] bArr = wfc.f46406b;
                ra9Var.getClass();
                wfc.f46409e = ra9Var;
                Object obj2 = pd9.f32322a;
                ra9 ra9Var2 = p99Var.f30000L;
                ra9Var2.getClass();
                pd9.f32325d = ra9Var2;
            }
        }
        if (!zy5.m23838d(p99Var.f29989A, NwivstN.fHhRw) && !zy5.m23838d(p99Var.f29989A, "posthog-react-native") && !zy5.m23838d(p99Var.f29989A, "posthog-kmp")) {
            p99Var.f29989A = "posthog-android";
            p99Var.f29990B = "3.72.9";
        }
        Object obj3 = pd9.f32322a;
        pd9.f32328g = zy5.m23838d(p99Var.f29989A, "posthog-react-native");
        byte b = 1;
        pd9.f32329h = true;
        String str8 = p99Var.f30022r;
        if (str8 == null || str8.length() == 0) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open("posthog-meta.properties"));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    List m13793E = mv1.m13793E(properties);
                    bufferedInputStream.close();
                    list = m13793E;
                } finally {
                }
            } catch (FileNotFoundException unused) {
            } catch (Throwable th) {
                tz6.m19223x("Failed reading the meta properties: ", th, '.', p99Var.f30028x);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.posthog.proguard.mapid");
                    if (property != null && property.length() != 0) {
                        p99Var.f30028x.log("releaseIdentifier found: ".concat(property));
                        p99Var.f30022r = property;
                        break;
                    }
                }
            }
            PackageInfo packageInfo = (PackageInfo) r2cVar.getValue();
            if (packageInfo != null && (str = packageInfo.versionName) != null) {
                str2 = str;
            }
            String str9 = str3 + '@' + str2 + '+' + (packageInfo != null ? mv1.m13810W(packageInfo) : 0L);
            p99Var.f30028x.log("releaseIdentifier not found, using fallback: ".concat(str9));
            p99Var.f30022r = str9;
        }
        p99Var.f29998J = new sp3(p99Var, b);
        x30 x30Var = new x30((byte) 26);
        try {
            p99Var.m14916a(new cd9(context, p99Var, x30Var));
        } catch (Throwable th2) {
            o20.m14710Z(p99Var, "PostHogReplayIntegration", th2);
        }
        try {
            p99Var.m14916a(new vd9(p99Var));
        } catch (Throwable th3) {
            o20.m14710Z(p99Var, "PostHogTouchActivityIntegration", th3);
        }
        try {
            p99Var.m14916a(new gb9(p99Var));
        } catch (Throwable th4) {
            o20.m14710Z(p99Var, "PostHogLogCatIntegration", th4);
        }
        if ((context instanceof Application) && (p99Var.f32084R || p99Var.f32085S || p99Var.f32088V)) {
            try {
                p99Var.m14916a(new l99((Application) context, p99Var));
            } catch (Throwable th5) {
                o20.m14710Z(p99Var, "PostHogActivityLifecycleCallbackIntegration", th5);
            }
        }
        try {
            p99Var.m14916a(new ma9(context, p99Var, c0381gl));
        } catch (Throwable th6) {
            o20.m14710Z(p99Var, "PostHogAppInstallIntegration", th6);
        }
        try {
            p99Var.m14916a(new fb9(context, p99Var, x30Var, c0381gl));
        } catch (Throwable th7) {
            o20.m14710Z(p99Var, "PostHogLifecycleObserverIntegration", th7);
        }
        if (p99Var.f32087U) {
            try {
                p99Var.m14916a(new qb9(p99Var));
            } catch (Throwable th8) {
                o20.m14710Z(p99Var, "PostHogPushSubscriptionIntegration", th8);
            }
        }
        p99Var.f30021q.getClass();
    }

    /* renamed from: h */
    public static xk2 m8667h(byte[] bArr) {
        String str;
        String str2;
        String str3 = mDZxtsynkk.wxSuUWZbLyyqE;
        bArr.getClass();
        if (bArr.length > 10240) {
            C0917v3.m20303j("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return xk2.f48543b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    while (i < readInt) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short readShort = dataInputStream.readShort();
                    if (readShort == -21521) {
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            rf6.m17312i(sj8.m18101m(readShort2, "Unsupported version number: "));
                        }
                    } else {
                        rf6.m17312i(sj8.m18101m(readShort, "Magic number doesn't match: "));
                    }
                    int readInt2 = dataInputStream.readInt();
                    while (i < readInt2) {
                        linkedHashMap.put(dataInputStream.readUTF(), m8668i(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException e) {
            str2 = nn2.f28518a;
            sy6.m18418c().m18421b(str2, str3, e);
        } catch (ClassNotFoundException e2) {
            str = nn2.f28518a;
            sy6.m18418c().m18421b(str, str3, e2);
        }
        return new xk2(linkedHashMap);
    }

    /* renamed from: y */
    public static void m8680y(p99 p99Var, boolean z) {
        pb9 pb9Var;
        if (z) {
            List m14917b = p99Var.m14917b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m14917b) {
                if (obj instanceof ma9) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ma9 ma9Var = (ma9) it.next();
                String str = oavfxXVsJYlYK.rCNpSFEXAEC;
                synchronized (ma9Var) {
                    try {
                        pb9Var = ma9Var.f25965u.f29995G;
                    } finally {
                    }
                    if (pb9Var == null || pb9Var.mo15639c()) {
                        PackageInfo packageInfo = (PackageInfo) ma9Var.f25966v.invoke();
                        if (packageInfo != null) {
                            pb9 pb9Var2 = ma9Var.f25965u.f29995G;
                            if (pb9Var2 != null) {
                                String str2 = packageInfo.versionName;
                                if (str2 != null) {
                                    pb9Var2.mo12672b("version", str2);
                                }
                                pb9Var2.mo12672b("build", Long.valueOf(mv1.m13810W(packageInfo)));
                            }
                        }
                    }
                }
            }
        }
    }
}
