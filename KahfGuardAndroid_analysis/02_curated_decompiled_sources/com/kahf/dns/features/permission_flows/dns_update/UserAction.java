package com.kahf.dns.features.permission_flows.dns_update;

import p000.mr2;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public abstract class UserAction {
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class CopyClicked extends UserAction {
        public static final int $stable = 0;
        public static final CopyClicked INSTANCE = new CopyClicked();

        private CopyClicked() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyClicked);
        }

        public int hashCode() {
            return -341046086;
        }

        public String toString() {
            return "CopyClicked";
        }
    }

    /* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
    public static final class GotoSettingsClicked extends UserAction {
        public static final int $stable = 0;
        public static final GotoSettingsClicked INSTANCE = new GotoSettingsClicked();

        private GotoSettingsClicked() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GotoSettingsClicked);
        }

        public int hashCode() {
            return -1249010583;
        }

        public String toString() {
            return "GotoSettingsClicked";
        }
    }

    public /* synthetic */ UserAction(mr2 mr2Var) {
        this();
    }

    private UserAction() {
    }
}
