package com.kahf.dns.p015di;

import p000.gpc;
import p000.lp6;
import p000.mr2;
import p000.sx7;
import p000.uy6;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
final class NapierKoinLogger extends uy6 {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "Koin";

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[lp6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NapierKoinLogger(lp6 lp6Var) {
        super(lp6Var);
        lp6Var.getClass();
    }

    @Override // p000.uy6
    public void display(lp6 lp6Var, String str) {
        lp6Var.getClass();
        str.getClass();
        int ordinal = lp6Var.ordinal();
        if (ordinal == 0) {
            sx7.m18364b(sx7.f39332a, str, TAG, 2);
            return;
        }
        if (ordinal == 1) {
            sx7.m18367e(sx7.f39332a, str, TAG, 2);
            return;
        }
        if (ordinal == 2) {
            sx7 sx7Var = sx7.f39332a;
            sx7.m18370h(2, str, TAG);
        } else if (ordinal == 3) {
            sx7 sx7Var2 = sx7.f39332a;
            sx7.m18366d(2, str, TAG, null);
        } else {
            if (ordinal == 4) {
                return;
            }
            gpc.m8801a();
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class Companion {
        public /* synthetic */ Companion(mr2 mr2Var) {
            this();
        }

        private Companion() {
        }
    }
}
