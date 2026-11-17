package com.kahf.dns.p015di;

import p000.mr2;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public abstract class DIError extends Exception {
    public static final int $stable = 8;

    public /* synthetic */ DIError(mr2 mr2Var) {
        this();
    }

    private DIError() {
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class InitializationError extends DIError {
        public static final int $stable = 8;
        private final Throwable cause;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializationError(String str, Throwable th) {
            super(null);
            str.getClass();
            this.message = str;
            this.cause = th;
        }

        public static /* synthetic */ InitializationError copy$default(InitializationError initializationError, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initializationError.message;
            }
            if ((i & 2) != 0) {
                th = initializationError.cause;
            }
            return initializationError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.cause;
        }

        public final InitializationError copy(String str, Throwable th) {
            str.getClass();
            return new InitializationError(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationError)) {
                return false;
            }
            InitializationError initializationError = (InitializationError) obj;
            return zy5.m23838d(this.message, initializationError.message) && zy5.m23838d(this.cause, initializationError.cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InitializationError(message=" + this.message + ", cause=" + this.cause + ")";
        }

        public /* synthetic */ InitializationError(String str, Throwable th, int i, mr2 mr2Var) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }
}
