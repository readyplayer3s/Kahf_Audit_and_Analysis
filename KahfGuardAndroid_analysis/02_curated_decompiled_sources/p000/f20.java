package p000;

import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public abstract class f20 {

    /* renamed from: a */
    public static final r2c f11013a = new r2c(new C0407h9(8));

    /* renamed from: b */
    public static final String f11014b = "phc_OmqCNJqYWGInDc1b3GQEGWDnPPIV6etPJ1bO7pLRL8N";

    /* renamed from: c */
    public static final String f11015c = "https://p.kahf.co.uk";

    /* renamed from: a */
    public static int m7592a() {
        return (int) (Build.VERSION.SDK_INT >= 28 ? AbstractC0246cx.m5783d((PackageInfo) f11013a.getValue()) : r0.versionCode);
    }
}
