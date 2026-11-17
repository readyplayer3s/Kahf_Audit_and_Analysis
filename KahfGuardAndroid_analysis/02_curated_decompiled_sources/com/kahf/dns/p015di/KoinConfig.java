package com.kahf.dns.p015di;

import p000.lp6;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class KoinConfig {
    public static final int $stable = 0;
    private final boolean enableNetworkLogs;
    private final lp6 logLevel;

    public KoinConfig(boolean z, lp6 lp6Var) {
        lp6Var.getClass();
        this.enableNetworkLogs = z;
        this.logLevel = lp6Var;
    }

    public static /* synthetic */ KoinConfig copy$default(KoinConfig koinConfig, boolean z, lp6 lp6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = koinConfig.enableNetworkLogs;
        }
        if ((i & 2) != 0) {
            lp6Var = koinConfig.logLevel;
        }
        return koinConfig.copy(z, lp6Var);
    }

    public final boolean component1() {
        return this.enableNetworkLogs;
    }

    public final lp6 component2() {
        return this.logLevel;
    }

    public final KoinConfig copy(boolean z, lp6 lp6Var) {
        lp6Var.getClass();
        return new KoinConfig(z, lp6Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KoinConfig)) {
            return false;
        }
        KoinConfig koinConfig = (KoinConfig) obj;
        return this.enableNetworkLogs == koinConfig.enableNetworkLogs && this.logLevel == koinConfig.logLevel;
    }

    public final boolean getEnableNetworkLogs() {
        return this.enableNetworkLogs;
    }

    public final lp6 getLogLevel() {
        return this.logLevel;
    }

    public int hashCode() {
        return this.logLevel.hashCode() + (Boolean.hashCode(this.enableNetworkLogs) * 31);
    }

    public String toString() {
        return "KoinConfig(enableNetworkLogs=" + this.enableNetworkLogs + ", logLevel=" + this.logLevel + ")";
    }
}
