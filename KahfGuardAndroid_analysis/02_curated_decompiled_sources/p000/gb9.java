package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class gb9 implements bb9 {

    /* renamed from: z */
    public static final AtomicBoolean f13808z = new AtomicBoolean(false);

    /* renamed from: u */
    public final p99 f13809u;

    /* renamed from: v */
    public volatile boolean f13810v;

    /* renamed from: w */
    public Thread f13811w;

    /* renamed from: x */
    public cb9 f13812x;

    /* renamed from: y */
    public boolean f13813y;

    public gb9(p99 p99Var) {
        this.f13809u = p99Var;
    }

    /* renamed from: d */
    public static ArrayList m8477d(long j) {
        return mv1.m13797I("logcat", "-v", "epoch", "-T", (j / 1000) + '.' + stb.m18266f1(3, String.valueOf(j % 1000)), "*:E");
    }

    @Override // p000.bb9
    /* renamed from: a */
    public final void mo1846a(boolean z) {
        if (z) {
            qc9 qc9Var = this.f13809u.f29999K;
            if (qc9Var != null ? qc9Var.f34336K : true) {
                cb9 cb9Var = this.f13812x;
                if (cb9Var != null) {
                    mo1848c(cb9Var);
                    return;
                }
                return;
            }
            synchronized (this) {
                if (this.f13813y) {
                    try {
                        this.f13810v = false;
                        Thread thread = this.f13811w;
                        if (thread != null) {
                            try {
                                thread.interrupt();
                            } catch (Throwable unused) {
                            }
                        }
                    } finally {
                        this.f13813y = false;
                        f13808z.set(false);
                    }
                }
            }
        }
    }

    @Override // p000.bb9
    /* renamed from: c */
    public final synchronized void mo1848c(cb9 cb9Var) {
        gb9 gb9Var;
        Throwable th;
        boolean z;
        try {
            try {
                cb9Var.getClass();
                this.f13812x = cb9Var;
                qc9 qc9Var = this.f13809u.f29999K;
                if (qc9Var != null) {
                    try {
                        z = qc9Var.f34336K;
                    } catch (Throwable th2) {
                        th = th2;
                        gb9Var = this;
                        throw th;
                    }
                } else {
                    z = true;
                }
                this.f13809u.f32086T.getClass();
                if (z) {
                    if (f13808z.compareAndSet(false, true)) {
                        this.f13813y = true;
                        ArrayList m8477d = m8477d(this.f13809u.f30000L.mo17230a());
                        qy6 qy6Var = new qy6();
                        this.f13810v = false;
                        Thread thread = this.f13811w;
                        if (thread != null) {
                            try {
                                thread.interrupt();
                            } catch (Throwable unused) {
                            }
                        }
                        Thread thread2 = new Thread(new tu2(m8477d, this, qy6Var, cb9Var, (byte) 1));
                        this.f13811w = thread2;
                        thread2.start();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            gb9Var = this;
            th = th;
            throw th;
        }
    }
}
