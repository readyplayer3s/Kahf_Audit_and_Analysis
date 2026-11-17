package com.kahf.dns.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.p014PK.jpnKuHlzpT;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.kahf.dns.p019ui.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import p000.AbstractC0492jm;
import p000.C0084c5;
import p000.C0308em;
import p000.C0345fm;
import p000.C0382gm;
import p000.C0853td;
import p000.InterfaceC0048b5;
import p000.bd7;
import p000.df7;
import p000.dt2;
import p000.i13;
import p000.iq5;
import p000.j95;
import p000.jzd;
import p000.k83;
import p000.kl6;
import p000.kod;
import p000.ly6;
import p000.muc;
import p000.mv1;
import p000.o0c;
import p000.pr1;
import p000.pt7;
import p000.qa2;
import p000.s43;
import p000.so6;
import p000.stb;
import p000.sx7;
import p000.sy0;
import p000.tda;
import p000.ttb;
import p000.txc;
import p000.tz6;
import p000.u3a;
import p000.u6d;
import p000.uda;
import p000.up2;
import p000.ut4;
import p000.v3a;
import p000.v90;
import p000.vu2;
import p000.xt4;
import p000.z3b;
import p000.zc3;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class AndroidNotificationService extends FirebaseMessagingService {

    /* renamed from: F */
    public static final List f6407F = mv1.m13794F("notification_id", "campaign_name", "campaign_number", "click_url", "compose_screen");

    /* renamed from: B */
    public final kl6 f6408B;

    /* renamed from: C */
    public final kl6 f6409C;

    /* renamed from: D */
    public final kl6 f6410D;

    /* renamed from: E */
    public final qa2 f6411E;

    public AndroidNotificationService() {
        C0382gm c0382gm = new C0382gm(this, (byte) 0);
        so6 so6Var = so6.f38881u;
        this.f6408B = iq5.m10513r(so6Var, c0382gm);
        this.f6409C = iq5.m10513r(so6Var, new C0382gm(this, (byte) 1));
        this.f6410D = iq5.m10513r(so6Var, new C0382gm(this, (byte) 2));
        vu2 vu2Var = k83.f21845a;
        this.f6411E = muc.m13765a(dt2.f8706v.plus(sy0.m18375J()));
    }

    /* renamed from: e */
    public static int m5511e(int i, int i2) {
        int i3 = 1;
        if (i2 <= 1024 && i <= 1024) {
            return 1;
        }
        int i4 = i2 / 2;
        int i5 = i / 2;
        while (i4 / i3 >= 1024 && i5 / i3 >= 1024) {
            i3 *= 2;
        }
        return i3;
    }

    /* renamed from: k */
    public static byte[] m5512k(InputStream inputStream, C0345fm c0345fm) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        while (((Number) c0345fm.invoke()).intValue() > 0) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            if (byteArrayOutputStream.size() + read > 5242880) {
                Log.w("SZ_NOTI", "Image exceeded 5242880B cap (chunked or mis-declared); abandoning");
                return null;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        Log.w("SZ_NOTI", "Image budget exhausted after " + byteArrayOutputStream.size() + " bytes; abandoning");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: d */
    public final void mo3508d(String str) {
        str.getClass();
        j95.m11012b();
        jzd.m11709o(this.f6411E, null, null, new C0853td(this, str, null, (byte) 1), 3);
    }

    /* renamed from: f */
    public final Notification m5513f(v3a v3aVar, Bitmap bitmap) {
        String str;
        String str2;
        Bitmap bitmap2;
        u3a m20346d = v3aVar.m20346d();
        if ((m20346d == null || (str = m20346d.m19313s()) == null) && (str = (String) v3aVar.m20344a().get("title")) == null) {
            str = "Kahf Guard";
        }
        u3a m20346d2 = v3aVar.m20346d();
        if ((m20346d2 == null || (str2 = m20346d2.m19295a()) == null) && (str2 = (String) v3aVar.m20344a().get("body")) == null) {
            str2 = "Click to open";
        }
        HashMap m20344a = v3aVar.m20344a();
        int i = MainActivity.f6412i0;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(335544320);
        String m20345c = v3aVar.m20345c();
        if (m20345c != null) {
            intent.putExtra("google.message_id", m20345c);
        }
        for (String str3 : f6407F) {
            String str4 = (String) m20344a.get(str3);
            if (str4 != null) {
                intent.putExtra(str3, str4);
            }
        }
        String str5 = (String) m20344a.get("notification_id");
        if (str5 == null) {
            str5 = v3aVar.m20345c();
        }
        PendingIntent activity = PendingIntent.getActivity(this, str5 != null ? str5.hashCode() : 0, intent, 201326592);
        activity.getClass();
        Notification.Builder contentIntent = new Notification.Builder(this, "KAHF_LIVE").setContentTitle(str).setContentText(str2).setSmallIcon(Icon.createWithResource(this, 2131231024)).setAutoCancel(true).setContentIntent(activity);
        contentIntent.getClass();
        if (bitmap != null) {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
            createBitmap.getClass();
            if (createBitmap.getWidth() != 256) {
                bitmap2 = Bitmap.createScaledBitmap(createBitmap, 256, 256, true);
                bitmap2.getClass();
            } else {
                bitmap2 = createBitmap;
            }
            if (!createBitmap.equals(bitmap2) && !createBitmap.equals(bitmap)) {
                createBitmap.recycle();
            }
            contentIntent.setLargeIcon(bitmap2).setStyle(new Notification.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Icon) null));
        }
        Notification build = contentIntent.build();
        build.getClass();
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0240, code lost:
    
        android.util.Log.e("SZ_NOTI", "Invalid image dimensions: " + r5 + "x" + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b7, code lost:
    
        if (r4 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d6, code lost:
    
        android.util.Log.w("SZ_NOTI", "Image budget (12000ms) exhausted during redirects");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        if (r2 < 3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        android.util.Log.w("SZ_NOTI", "Too many redirects (" + r2 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        if (r4 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0197, code lost:
    
        r4.getClass();
        r2 = r4.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a0, code lost:
    
        if (r2 <= 5242880) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a2, code lost:
    
        android.util.Log.w("SZ_NOTI", "Image too large (" + r2 + " bytes), max: 5242880");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
    
        r2 = r4.getInputStream();
        r2.getClass();
        r2 = m5512k(r2, new p000.C0345fm(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cc, code lost:
    
        if (r2 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        r3 = new android.graphics.BitmapFactory.Options();
        r3.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeByteArray(r2, 0, r2.length, r3);
        r5 = r3.outWidth;
        r6 = r3.outHeight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01df, code lost:
    
        if (r5 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e1, code lost:
    
        if (r6 > 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e4, code lost:
    
        r13 = m5511e(r5, r6);
        r5 = r5 / r13;
        r6 = r6 / r13;
        r3.inJustDecodeBounds = false;
        r3.inSampleSize = r13;
        r3.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = android.graphics.BitmapFactory.decodeByteArray(r2, 0, r2.length, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f7, code lost:
    
        if (r0 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f9, code lost:
    
        android.util.Log.e("SZ_NOTI", "Failed to decode image bitmap");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        r0.getWidth();
        r0.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020c, code lost:
    
        if (r0.getWidth() <= 1024) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020e, code lost:
    
        r2 = android.graphics.Bitmap.createScaledBitmap(r0, 1024, (int) (r0.getHeight() * (1024.0f / r0.getWidth())), true);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0228, code lost:
    
        if (r2.equals(r0) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x022a, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022f, code lost:
    
        r2.getWidth();
        r2.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0235, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
    
        android.util.Log.e("SZ_NOTI", "Error closing connection", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022e, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5514g(v3a v3aVar) {
        String str;
        u3a m20346d;
        u3a m20346d2;
        Bitmap bitmap;
        int i;
        HttpURLConnection httpURLConnection;
        Throwable th;
        String headerField;
        Uri m19303i;
        String str2 = (String) v3aVar.m20344a().get("notification_id");
        if (str2 == null) {
            str2 = "20202";
        }
        String str3 = str2;
        String str4 = (String) v3aVar.m20344a().get("image_url");
        HttpURLConnection httpURLConnection2 = null;
        if (str4 == null) {
            u3a m20346d3 = v3aVar.m20346d();
            if (m20346d3 == null || (m19303i = m20346d3.m19303i()) == null) {
                str = null;
                m20346d = v3aVar.m20346d();
                if ((m20346d != null || (r0 = m20346d.m19313s()) == null) && (r0 = (String) v3aVar.m20344a().get("title")) == null) {
                    String str5 = "Kahf Guard";
                }
                String str6 = str5;
                m20346d2 = v3aVar.m20346d();
                if ((m20346d2 != null || (r0 = m20346d2.m19295a()) == null) && (r0 = (String) v3aVar.m20344a().get("body")) == null) {
                    String str7 = "Click to open";
                }
                jzd.m11709o(this.f6411E, null, null, new C0308em(this, str6, str7, str, (String) v3aVar.m20344a().get("click_url"), (String) v3aVar.m20344a().get("compose_screen"), v3aVar.m20346d() == null ? "fcm_notification" : "fcm_data", str3, null), 3);
                if (str != null && str.length() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + 12000;
                    i = 0;
                    while (true) {
                        if (i < 3) {
                            httpURLConnection = null;
                            break;
                        }
                        try {
                            int m19374i = (int) u6d.m19374i(elapsedRealtime - SystemClock.elapsedRealtime(), 0L, 2147483647L);
                            if (m19374i <= 0) {
                                break;
                            }
                            URLConnection openConnection = new URL(str).openConnection();
                            openConnection.getClass();
                            httpURLConnection = (HttpURLConnection) openConnection;
                            try {
                                try {
                                    httpURLConnection.setConnectTimeout(Math.min(10000, m19374i));
                                    httpURLConnection.setReadTimeout(Math.min(10000, m19374i));
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    httpURLConnection.setDoInput(true);
                                    httpURLConnection.connect();
                                    int responseCode = httpURLConnection.getResponseCode();
                                    if ((301 > responseCode || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
                                        if (responseCode != 200) {
                                            Log.w("SZ_NOTI", "HTTP error: " + responseCode);
                                        }
                                    }
                                    headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        Log.w("SZ_NOTI", "Redirect without Location header");
                                        break;
                                    } else {
                                        httpURLConnection.disconnect();
                                        i++;
                                        str = headerField;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpURLConnection2 = httpURLConnection;
                                    if (httpURLConnection2 == null) {
                                        throw th;
                                    }
                                    try {
                                        httpURLConnection2.disconnect();
                                        throw th;
                                    } catch (Exception e) {
                                        Log.e("SZ_NOTI", "Error closing connection", e);
                                        throw th;
                                    }
                                }
                            } catch (SocketTimeoutException e2) {
                                e = e2;
                                Log.e("SZ_NOTI", "Timeout downloading image: " + e.getMessage());
                            } catch (IOException e3) {
                                e = e3;
                                Log.e("SZ_NOTI", "IO error downloading image: " + e.getMessage());
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e4) {
                                        Log.e("SZ_NOTI", "Error closing connection", e4);
                                    }
                                }
                                bitmap = null;
                                if (m5517j(v3aVar, bitmap, str3)) {
                                }
                            } catch (Exception e5) {
                                e = e5;
                                Log.e("SZ_NOTI", "Error downloading image: " + e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                bitmap = null;
                                if (m5517j(v3aVar, bitmap, str3)) {
                                }
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                Log.e("SZ_NOTI", "OOM processing image", e);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                bitmap = null;
                                if (m5517j(v3aVar, bitmap, str3)) {
                                }
                            }
                        } catch (SocketTimeoutException e7) {
                            e = e7;
                            httpURLConnection = null;
                        } catch (IOException e8) {
                            e = e8;
                            httpURLConnection = null;
                        } catch (Exception e9) {
                            e = e9;
                            httpURLConnection = null;
                        } catch (OutOfMemoryError e10) {
                            e = e10;
                            httpURLConnection = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                bitmap = null;
                if (m5517j(v3aVar, bitmap, str3) || bitmap == null) {
                }
                m5517j(v3aVar, null, str3);
                return;
            }
            str4 = m19303i.toString();
        }
        str = str4;
        m20346d = v3aVar.m20346d();
        if (m20346d != null) {
        }
        String str52 = "Kahf Guard";
        String str62 = str52;
        m20346d2 = v3aVar.m20346d();
        if (m20346d2 != null) {
        }
        String str72 = "Click to open";
        jzd.m11709o(this.f6411E, null, null, new C0308em(this, str62, str72, str, (String) v3aVar.m20344a().get("click_url"), (String) v3aVar.m20344a().get("compose_screen"), v3aVar.m20346d() == null ? "fcm_notification" : "fcm_data", str3, null), 3);
        if (str != null) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() + 12000;
            i = 0;
            while (true) {
                if (i < 3) {
                }
                httpURLConnection.disconnect();
                i++;
                str = headerField;
            }
        }
        bitmap = null;
        if (m5517j(v3aVar, bitmap, str3)) {
        }
    }

    /* renamed from: h */
    public final void m5515h(v3a v3aVar) {
        if (Build.VERSION.SDK_INT < 33) {
            m5514g(v3aVar);
        } else if (checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            m5514g(v3aVar);
        } else {
            Log.w("SZ_NOTI", "Notification permission not granted");
        }
    }

    /* renamed from: i */
    public final void m5516i(Notification notification, String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Log.w("SZ_NOTI", "Invalid notification ID format: " + str + ". Using fallback ID.", e);
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() <= 0) {
                sb2 = null;
            }
            int i3 = 20202;
            if (sb2 != null) {
                try {
                    i3 = Integer.parseInt(stb.m18284x1(5, sb2));
                } catch (NumberFormatException unused) {
                }
            }
            i = i3;
        }
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).notify(i, notification);
    }

    /* renamed from: j */
    public final boolean m5517j(v3a v3aVar, Bitmap bitmap, String str) {
        try {
            m5516i(m5513f(v3aVar, bitmap), str);
            return true;
        } catch (Exception e) {
            Log.e("SZ_NOTI", "Failed to build/post notification (hasImage=" + (bitmap != null) + ")", e);
            return false;
        } catch (OutOfMemoryError e2) {
            Log.e("SZ_NOTI", "OOM building/posting notification (hasImage=" + (bitmap != null) + ")", e2);
            return false;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        NotificationChannel notificationChannel = new NotificationChannel("KAHF_LIVE", "Default Channel", 3);
        notificationChannel.setDescription("Default channel for app notifications");
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        muc.m13775k(this.f6411E, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: c */
    public final void mo3507c(v3a v3aVar) {
        Object tdaVar;
        Object tdaVar2;
        String str;
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        v3aVar.m20344a().toString();
        u3a m20346d = v3aVar.m20346d();
        if (m20346d != null) {
            String m19295a = m20346d.m19295a();
            String[] m19296b = m20346d.m19296b();
            if (m19296b == null) {
                str = "null";
            } else {
                str = v90.m20549a0(63, m19296b);
            }
            String m19297c = m20346d.m19297c();
            if (m19297c == null) {
                m19297c = "null";
            }
            String m19298d = m20346d.m19298d();
            if (m19298d == null) {
                m19298d = "null";
            }
            String m19299e = m20346d.m19299e();
            if (m19299e == null) {
                m19299e = "null";
            }
            String m19300f = m20346d.m19300f();
            if (m19300f == null) {
                m19300f = "null";
            }
            if (m20346d.m19304j() == null) {
                z = true;
            } else {
                z = false;
            }
            boolean m23838d = zy5.m23838d(m20346d.m19309o(), "default");
            if (m20346d.m19316v() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object m19301g = m20346d.m19301g();
            if (m19301g == null) {
                m19301g = "null";
            }
            String m19302h = m20346d.m19302h();
            if (m19302h == null) {
                m19302h = "null";
            }
            Uri m19303i = m20346d.m19303i();
            if (m19303i == null) {
                obj = "null";
            } else {
                obj = m19303i;
            }
            int[] m19304j = m20346d.m19304j();
            int i = 1;
            if (m19304j != null) {
                str2 = "null";
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                obj2 = obj;
                int length = m19304j.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = m19304j[i2];
                    int i5 = length;
                    int i6 = i3 + 1;
                    int i7 = i2;
                    if (i6 > i) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append((CharSequence) String.valueOf(i4));
                    i2 = i7 + 1;
                    i3 = i6;
                    length = i5;
                    i = 1;
                }
                sb.append((CharSequence) "");
                str3 = sb.toString();
            } else {
                obj2 = obj;
                str2 = "null";
                str3 = str2;
            }
            Uri m19305k = m20346d.m19305k();
            if (m19305k == null) {
                m19305k = str2;
            }
            boolean m19306l = m20346d.m19306l();
            Integer m19307m = m20346d.m19307m();
            if (m19307m == null) {
                num = str2;
            } else {
                num = m19307m;
            }
            Integer m19308n = m20346d.m19308n();
            if (m19308n == null) {
                num2 = str2;
            } else {
                num2 = m19308n;
            }
            String m19309o = m20346d.m19309o();
            if (m19309o == null) {
                str4 = str2;
            } else {
                str4 = m19309o;
            }
            boolean m19310p = m20346d.m19310p();
            String m19311q = m20346d.m19311q();
            if (m19311q == null) {
                str5 = str2;
            } else {
                str5 = m19311q;
            }
            String m19312r = m20346d.m19312r();
            if (m19312r == null) {
                str6 = str2;
            } else {
                str6 = m19312r;
            }
            String m19313s = m20346d.m19313s();
            if (m19313s == null) {
                str7 = str2;
            } else {
                str7 = m19313s;
            }
            String[] m19314t = m20346d.m19314t();
            Uri uri = m19305k;
            if (m19314t != null) {
                str8 = v90.m20549a0(63, m19314t);
            } else {
                str8 = str2;
            }
            String m19315u = m20346d.m19315u();
            if (m19315u == null) {
                m19315u = str2;
            }
            String str13 = str8;
            long[] m19316v = m20346d.m19316v();
            if (m19316v != null) {
                str10 = m19315u;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "");
                str9 = str3;
                int length2 = m19316v.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    long j = m19316v[i8];
                    int i10 = length2;
                    int i11 = i8;
                    int i12 = i9 + 1;
                    if (i12 > 1) {
                        sb2.append((CharSequence) ", ");
                    }
                    sb2.append((CharSequence) String.valueOf(j));
                    i9 = i12;
                    i8 = i11 + 1;
                    length2 = i10;
                }
                sb2.append((CharSequence) "");
                str11 = sb2.toString();
            } else {
                str9 = str3;
                str10 = m19315u;
                str11 = str2;
            }
            Integer m19317w = m20346d.m19317w();
            if (m19317w == null) {
                str12 = str2;
            } else {
                str12 = m19317w;
            }
            StringBuilder m15984r = pr1.m15984r("\n        |Notification Details:\n        |Body: ", m19295a, "\n        |BodyLocArgs: ", str, "\n        |BodyLocKey: ");
            pr1.m15992z(m15984r, m19297c, "\n        |ChannelId: ", m19298d, "\n        |ClickAction: ");
            pr1.m15992z(m15984r, m19299e, "\n        |Color: ", m19300f, "\n        |DefaultLightSettings: ");
            tz6.m19225z(m15984r, z, "\n        |DefaultSound: ", m23838d, "\n        |DefaultVibrateTimings: ");
            m15984r.append(z2);
            m15984r.append("\n        |EventTime: ");
            m15984r.append(m19301g);
            m15984r.append("\n        |Icon: ");
            m15984r.append(m19302h);
            m15984r.append("\n        |ImageUrl: ");
            m15984r.append(obj2);
            m15984r.append("\n        |LightSettings: ");
            m15984r.append(str9);
            m15984r.append("\n        |Link: ");
            m15984r.append(uri);
            m15984r.append("\n        |LocalOnly: ");
            m15984r.append(m19306l);
            m15984r.append("\n        |NotificationCount: ");
            m15984r.append(num);
            m15984r.append("\n        |NotificationPriority: ");
            m15984r.append(num2);
            m15984r.append("\n        |Sound: ");
            m15984r.append(str4);
            m15984r.append("\n        |Sticky: ");
            m15984r.append(m19310p);
            m15984r.append("\n        |Tag: ");
            m15984r.append(str5);
            m15984r.append("\n        |Ticker: ");
            pr1.m15992z(m15984r, str6, "\n        |Title: ", str7, "\n        |TitleLocArgs: ");
            pr1.m15992z(m15984r, str13, "\n        |TitleLocKey: ", str10, "\n        |VibrateTimings: ");
            m15984r.append(str11);
            m15984r.append("\n        |Visibility: ");
            m15984r.append((Object) str12);
            m15984r.append("\n    ");
            ttb.m19040p0(m15984r.toString());
        }
        if (!v3aVar.m20344a().isEmpty() && bd7.m1929l(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] 📨 Routing to RestrictionFCMHandler");
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            bd7.m1927j(applicationContext, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && pt7.m16116y(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] 🔐 Routing to PermissionSyncFCMHandler");
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            pt7.m16115x(applicationContext2, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && s43.m17766e(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] 📊 Routing to MetadataSyncFCMHandler");
            Context applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            s43.m17764c(applicationContext3, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && zc3.m23501c(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] 🌐 Routing to DnsSyncFCMHandler");
            Context applicationContext4 = getApplicationContext();
            applicationContext4.getClass();
            zc3.f52148u.m23502b(applicationContext4, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && zy5.m23838d(v3aVar.m20344a().get("type"), "installed_apps_sync")) {
            Log.i("KG_SYNC", "[FCM_SERVICE] 📱 Routing to InstalledAppsSyncFCMHandler");
            Context applicationContext5 = getApplicationContext();
            applicationContext5.getClass();
            z3b.m23324i0(applicationContext5, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && zy5.m23838d(v3aVar.m20344a().get("type"), "app_usage_sync")) {
            Log.i("KG_SYNC", jpnKuHlzpT.QOEqktyldvG);
            Context applicationContext6 = getApplicationContext();
            applicationContext6.getClass();
            kod.m12203u(applicationContext6, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty() && xt4.m22332y(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] Routing to BlockCountsSyncFCMHandler");
            Context applicationContext7 = getApplicationContext();
            applicationContext7.getClass();
            xt4.m22329v(applicationContext7, v3aVar.m20344a());
        }
        if (!v3aVar.m20344a().isEmpty()) {
            kl6 kl6Var = o0c.f29298u;
            if (o0c.m14671c(v3aVar.m20344a())) {
                Log.i("KG_SYNC", "[FCM_SERVICE] Routing to SupervisionUpdateFCMHandler");
                o0c.m14670b(v3aVar.m20344a());
            }
        }
        if (!v3aVar.m20344a().isEmpty()) {
            kl6 kl6Var2 = i13.f17235u;
            if (i13.m9849c(v3aVar.m20344a())) {
                Log.i("KG_SYNC", "[FCM_SERVICE] Routing to DeviceAlertFCMHandler");
                Context applicationContext8 = getApplicationContext();
                applicationContext8.getClass();
                i13.m9848b(applicationContext8, v3aVar.m20344a());
            }
        }
        if (!v3aVar.m20344a().isEmpty()) {
            kl6 kl6Var3 = j95.f19939u;
            if (zy5.m23838d(v3aVar.m20344a().get("type"), "heartbeat")) {
                Log.i("KG_SYNC", "[FCM_SERVICE] 💓 Routing to HeartbeatFCMHandler");
                Context applicationContext9 = getApplicationContext();
                applicationContext9.getClass();
                try {
                    if (zy5.m23838d(v3aVar.m20344a().get("type"), "heartbeat")) {
                        if (!applicationContext9.getSharedPreferences("AppPreferences", 0).getBoolean("pref_user_enabled_guards", false)) {
                            sx7 sx7Var = sx7.f39332a;
                            sx7.m18369g(ly6.f25309v, "KG_SYNC", null, "[FCM] 💓 heartbeat — guards never enabled, skipping");
                        } else {
                            boolean m20085w = ut4.m20085w(applicationContext9);
                            boolean m11418y = AbstractC0492jm.m11418y();
                            try {
                                Object systemService = applicationContext9.getSystemService("power");
                                systemService.getClass();
                                tdaVar = Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(applicationContext9.getPackageName()));
                            } catch (Throwable th) {
                                tdaVar = new tda(th);
                            }
                            Object obj3 = Boolean.FALSE;
                            if (tdaVar instanceof tda) {
                                tdaVar = obj3;
                            }
                            boolean booleanValue = ((Boolean) tdaVar).booleanValue();
                            sx7 sx7Var2 = sx7.f39332a;
                            sx7.m18369g(ly6.f25310w, "KG_SYNC", null, "[FCM] 💓 heartbeat health: accessibility=" + m20085w + " fgs=" + m11418y + " battery=" + booleanValue);
                            ly6 ly6Var = ly6.f25311x;
                            Object obj4 = txc.f41359a;
                            if (!m11418y) {
                                try {
                                    ((C0084c5) ((InterfaceC0048b5) j95.f19939u.getValue())).m2653a();
                                    tdaVar2 = obj4;
                                } catch (Throwable th2) {
                                    tdaVar2 = new tda(th2);
                                }
                                Throwable m19582a = uda.m19582a(tdaVar2);
                                if (m19582a != null) {
                                    sx7 sx7Var3 = sx7.f39332a;
                                    sx7.m18369g(ly6Var, "KG_SYNC", m19582a, "[FCM] heartbeat: monitor start failed");
                                }
                            }
                            try {
                                up2.m19906F(applicationContext9);
                            } catch (Throwable th3) {
                                obj4 = new tda(th3);
                            }
                            Throwable m19582a2 = uda.m19582a(obj4);
                            if (m19582a2 != null) {
                                sx7 sx7Var4 = sx7.f39332a;
                                sx7.m18369g(ly6Var, "KG_SYNC", m19582a2, "[FCM] heartbeat: watchdog schedule failed");
                            }
                        }
                    }
                } catch (Exception e) {
                    sx7 sx7Var5 = sx7.f39332a;
                    sx7.m18369g(ly6.f25312y, "KG_SYNC", e, "[FCM] ❌ Error handling heartbeat");
                }
            }
        }
        if (!v3aVar.m20344a().isEmpty() && s43.m17765d(v3aVar.m20344a())) {
            Log.i("KG_SYNC", "[FCM_SERVICE] Routing to DeviceRemovedFCMHandler");
            s43.m17763b(v3aVar.m20344a());
        }
        boolean m6221N = df7.m6221N(v3aVar.m20344a());
        if (v3aVar.m20346d() != null) {
            m5515h(v3aVar);
        } else if (!m6221N && !v3aVar.m20344a().isEmpty()) {
            m5515h(v3aVar);
        }
    }
}
