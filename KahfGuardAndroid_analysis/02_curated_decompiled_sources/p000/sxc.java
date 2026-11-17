package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import coil3.transform.p010aL.bbNCAFLw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class sxc {

    /* renamed from: a */
    public static final sxc f39342a = new sxc();

    /* renamed from: b */
    public static final long f39343b;

    static {
        f95 f95Var = dj3.f8146v;
        f39343b = qr5.m16842H(5, hj3.SECONDS);
    }

    /* renamed from: a */
    public static LinkedHashMap m18372a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("com.google.android.gms.permission.AD_ID", Boolean.valueOf(zy5.m23841g(context, "com.google.android.gms.permission.AD_ID") == 0));
        linkedHashMap.put("android.permission.READ_PHONE_STATE", Boolean.valueOf(zy5.m23841g(context, "android.permission.READ_PHONE_STATE") == 0));
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: Exception -> 0x002c, CancellationException -> 0x006a, TryCatch #2 {CancellationException -> 0x006a, Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x004a, B:14:0x004f, B:15:0x005d, B:22:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18374b(long j, og1 og1Var, za2 za2Var) {
        rxc rxcVar;
        Object obj;
        int i;
        try {
            if (za2Var instanceof rxc) {
                rxcVar = (rxc) za2Var;
                int i2 = rxcVar.f37474x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rxcVar.f37474x = i2 - Integer.MIN_VALUE;
                    obj = rxcVar.f37472v;
                    i = rxcVar.f37474x;
                    xa2 xa2Var = null;
                    if (i != 0) {
                        v11.m20244z(obj);
                        c19 c19Var = new c19((byte) 4, xa2Var, og1Var);
                        rxcVar.f37471u = j;
                        rxcVar.f37474x = 1;
                        obj = muc.m13763Y(j, c19Var, rxcVar);
                        qc2 qc2Var = qc2.f34309u;
                        if (obj == qc2Var) {
                            return qc2Var;
                        }
                    } else {
                        if (i != 1) {
                            C0917v3.m20303j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = rxcVar.f37471u;
                        v11.m20244z(obj);
                    }
                    if (((String) obj) == null) {
                        sx7 sx7Var = sx7.f39332a;
                        sx7.m18370h(2, "[DEVICE_ID] No device ID within ".concat(dj3.m6355m(j)), "KG_SYNC");
                    }
                    return (String) obj;
                }
            }
            if (i != 0) {
            }
            if (((String) obj) == null) {
            }
            return (String) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18369g(ly6.f25312y, "KG_SYNC", e2, "[DEVICE_ID] Error reading unique device ID");
            return null;
        }
        rxcVar = new rxc(this, za2Var);
        obj = rxcVar.f37472v;
        i = rxcVar.f37474x;
        xa2 xa2Var2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (r0.length() != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204 A[Catch: Exception -> 0x0208, TryCatch #3 {Exception -> 0x0208, blocks: (B:53:0x01f5, B:55:0x0204, B:56:0x020a, B:59:0x021c, B:69:0x0237, B:70:0x023a, B:58:0x0219, B:66:0x0235), top: B:52:0x01f5, inners: #1, #2 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m18373c(Context context) {
        sx7 sx7Var;
        sx7 sx7Var2;
        String str;
        boolean m20278v;
        String str2;
        String str3;
        String m16045w0;
        String upperCase;
        File file;
        File file2;
        ly6 ly6Var = ly6.f25311x;
        ly6 ly6Var2 = ly6.f25312y;
        sx7 sx7Var3 = sx7.f39332a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_prefs", 0);
        String string = sharedPreferences.getString("unique_user_id", null);
        if (string != null) {
            sx7.m18364b(sx7Var3, "[DEVICE_ID] Retrieved existing unique device ID from SharedPreferences: ".concat(string), "KG_SYNC", 2);
            return string;
        }
        try {
            file2 = new File(new File(context.getFilesDir(), "device_data"), "device_id.dat");
        } catch (Exception e) {
            sx7Var = sx7.f39332a;
            sx7.m18369g(ly6Var2, "UniqueUserIdManager", e, "Failed to read user ID from backup file");
        }
        if (file2.exists() && file2.canRead()) {
            Charset charset = zc1.f52140a;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
            try {
                String m16837C = qr5.m16837C(inputStreamReader);
                inputStreamReader.close();
                str = stb.m18242B1(m16837C).toString();
                if (str.length() > 0) {
                    sx7.m18364b(sx7Var3, "Read user ID from backup file: ".concat(str), "UniqueUserIdManager", 2);
                    sx7Var2 = sx7Var3;
                    if (str == null) {
                        sx7.m18364b(sx7Var2, "[DEVICE_ID] Retrieved existing unique device ID from backup file: ".concat(str), "KG_SYNC", 2);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.putString("unique_user_id", str);
                        edit.apply();
                        sx7.m18364b(sx7Var2, "[DEVICE_ID] Saved backup ID to SharedPreferences for faster access", "KG_SYNC", 2);
                        return str;
                    }
                    sx7.m18364b(sx7Var2, "[DEVICE_ID] No existing ID found, generating new unique device ID", "KG_SYNC", 2);
                    m20278v = v20.m20278v();
                    try {
                        str2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    } catch (Exception e2) {
                        sx7 sx7Var4 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "UniqueUserIdManager", e2, "Failed to get Android ID");
                    }
                    try {
                        if (str2 != null && !str2.equals("9774d56d682e549c") && str2.length() != 0) {
                            sx7.m18364b(sx7Var2, "Successfully retrieved Android ID", "UniqueUserIdManager", 2);
                            str3 = ps1.m16045w0(mv1.m13794F(Build.BOARD, Build.BRAND, Build.DEVICE, Build.HARDWARE, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT), "|", null, null, null, 62);
                        }
                        str3 = ps1.m16045w0(mv1.m13794F(Build.BOARD, Build.BRAND, Build.DEVICE, Build.HARDWARE, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT), "|", null, null, null, 62);
                    } catch (Exception e3) {
                        sx7 sx7Var5 = sx7.f39332a;
                        sx7.m18369g(ly6Var, "UniqueUserIdManager", e3, "Failed to get build info");
                    }
                    sx7.m18370h(2, "Invalid Android ID detected", "UniqueUserIdManager");
                    str2 = null;
                }
            } finally {
            }
        }
        sx7Var = sx7Var3;
        sx7Var2 = sx7Var;
        str = null;
        if (str == null) {
        }
        sx7.m18364b(sx7Var3, "[DEVICE_ID] Successfully saved new unique device ID to preferences and backup file", "KG_SYNC", 2);
        return r1;
        String concat = r1.concat(upperCase);
        sx7.m18364b(sx7Var3, "[DEVICE_ID] Generated new unique device ID: ".concat(concat), "KG_SYNC", 2);
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.getClass();
        edit2.putString("unique_user_id", concat);
        edit2.apply();
        try {
            file = new File(context.getFilesDir(), "device_data");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file3 = new File(file, "device_id.dat");
            Charset charset2 = zc1.f52140a;
            charset2.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                v44.m20350L(fileOutputStream, concat, charset2);
                fileOutputStream.close();
                sx7.m18364b(sx7Var3, "Saved user ID to backup file: " + file3.getAbsolutePath(), "UniqueUserIdManager", 2);
            } finally {
            }
        } catch (Exception e4) {
            sx7 sx7Var6 = sx7.f39332a;
            sx7.m18369g(ly6Var2, "UniqueUserIdManager", e4, bbNCAFLw.oAhJLB);
        }
        sx7.m18364b(sx7Var3, "[DEVICE_ID] Successfully saved new unique device ID to preferences and backup file", "KG_SYNC", 2);
        return concat;
        str3 = null;
        ls6 m13818g = mv1.m13818g();
        if (str2 != null) {
            m13818g.add("aid:".concat(str2));
        }
        if (str3 != null) {
            m13818g.add("bld:".concat(str3));
        }
        ls6 m13815d = mv1.m13815d(m13818g);
        if (m13815d.isEmpty()) {
            m16045w0 = "uuid:" + UUID.randomUUID();
        } else {
            m16045w0 = ps1.m16045w0(m13815d, "|", null, null, null, 62);
        }
        String str4 = m20278v ? "DBG" : "PRD";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = m16045w0.getBytes(zc1.f52140a);
            bytes.getClass();
            byte[] digest = messageDigest.digest(bytes);
            digest.getClass();
            String m20550b0 = v90.m20550b0(digest, "", new mmc((byte) 10), 30);
            if (m20550b0.length() > 12) {
                String substring = m20550b0.substring(0, 12);
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = substring.toUpperCase(locale);
                upperCase.getClass();
            } else {
                String m18265e1 = stb.m18265e1(m20550b0, 12, 'O');
                Locale locale2 = Locale.US;
                locale2.getClass();
                upperCase = m18265e1.toUpperCase(locale2);
                upperCase.getClass();
            }
        } catch (Exception e5) {
            sx7 sx7Var7 = sx7.f39332a;
            sx7.m18369g(ly6Var2, "UniqueUserIdManager", e5, "Error hashing ID");
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            String m18283w1 = stb.m18283w1(12, uuid);
            Locale locale3 = Locale.US;
            locale3.getClass();
            upperCase = m18283w1.toUpperCase(locale3);
            upperCase.getClass();
        }
        String concat2 = str4.concat(upperCase);
        sx7.m18364b(sx7Var3, "[DEVICE_ID] Generated new unique device ID: ".concat(concat2), "KG_SYNC", 2);
        SharedPreferences.Editor edit22 = sharedPreferences.edit();
        edit22.getClass();
        edit22.putString("unique_user_id", concat2);
        edit22.apply();
        file = new File(context.getFilesDir(), "device_data");
        if (!file.exists()) {
        }
        File file32 = new File(file, "device_id.dat");
        Charset charset22 = zc1.f52140a;
        charset22.getClass();
        FileOutputStream fileOutputStream2 = new FileOutputStream(file32);
        v44.m20350L(fileOutputStream2, concat2, charset22);
        fileOutputStream2.close();
        sx7.m18364b(sx7Var3, "Saved user ID to backup file: " + file32.getAbsolutePath(), "UniqueUserIdManager", 2);
        sx7.m18364b(sx7Var3, "[DEVICE_ID] Successfully saved new unique device ID to preferences and backup file", "KG_SYNC", 2);
        return concat2;
    }
}
