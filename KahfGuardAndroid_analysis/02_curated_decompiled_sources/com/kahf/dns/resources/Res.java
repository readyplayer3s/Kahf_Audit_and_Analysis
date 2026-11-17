package com.kahf.dns.resources;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import org.jetbrains.compose.resources.AndroidContextProvider;
import p000.AbstractC0673oi;
import p000.C0917v3;
import p000.dk3;
import p000.kd0;
import p000.sj8;
import p000.t8a;
import p000.u11;
import p000.xa2;
import p000.zq2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class Res {
    public static final int $stable = 0;
    public static final Res INSTANCE = new Res();

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final class array {
        public static final int $stable = 0;
        public static final array INSTANCE = new array();

        private array() {
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class drawable {
        public static final int $stable = 0;
        public static final drawable INSTANCE = new drawable();

        private drawable() {
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class font {
        public static final int $stable = 0;
        public static final font INSTANCE = new font();

        private font() {
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final class plurals {
        public static final int $stable = 0;
        public static final plurals INSTANCE = new plurals();

        private plurals() {
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class string {
        public static final int $stable = 0;
        public static final string INSTANCE = new string();

        private string() {
        }
    }

    private Res() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003d, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0020, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        r2 = android.net.Uri.parse("file:///android_asset/".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x001e, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getUri(String str) {
        InputStream open;
        AssetManager assetManager;
        str.getClass();
        String concat = "composeResources/com.kahf.dns.resources/".concat(str);
        dk3 dk3Var = t8a.f39932a;
        Context context = AndroidContextProvider.f31087u;
        AssetManager assets = context != null ? context.getAssets() : null;
        if (assets != null) {
            try {
                try {
                    open = assets.open(concat);
                } catch (NoClassDefFoundError unused) {
                    assetManager = null;
                    if (assetManager != null) {
                        try {
                            open = assetManager.open(concat);
                        } catch (FileNotFoundException unused2) {
                            ClassLoader classLoader = zq2.class.getClassLoader();
                            if (classLoader == null) {
                                C0917v3.m20303j("Cannot find class loader");
                                return null;
                            }
                            URL resource = classLoader.getResource(concat);
                            if (resource != null) {
                                Object parse = resource.toURI();
                                return parse.toString();
                            }
                            if (AndroidContextProvider.f31087u == null) {
                                throw new kd0(concat, 0);
                            }
                            throw new kd0(concat, (byte) 9);
                        }
                    }
                    throw new FileNotFoundException("Current AssetManager is null.");
                }
            } catch (FileNotFoundException unused3) {
                assetManager = AbstractC0673oi.m15103b().getAssets();
                if (assetManager != null) {
                }
                throw new FileNotFoundException("Current AssetManager is null.");
            }
        }
        throw new FileNotFoundException("Current AssetManager is null.");
    }

    public final Object readBytes(String str, xa2 xa2Var) {
        String m18102n = sj8.m18102n("composeResources/com.kahf.dns.resources/", str);
        dk3 dk3Var = t8a.f39932a;
        InputStream m23716a = zq2.m23716a(m18102n);
        try {
            byte[] m19274a0 = u11.m19274a0(m23716a);
            m23716a.close();
            return m19274a0;
        } finally {
        }
    }
}
