package p000;

import java.util.ArrayList;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class jcb {

    /* renamed from: a */
    public final String f20187a;

    /* renamed from: b */
    public final ArrayList f20188b;

    public jcb(String str, ArrayList arrayList) {
        bdb bdbVar = bdb.BROWSER_BAR;
        this.f20187a = str;
        this.f20188b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcb)) {
            return false;
        }
        jcb jcbVar = (jcb) obj;
        if (!this.f20187a.equals(jcbVar.f20187a)) {
            return false;
        }
        bdb bdbVar = bdb.BROWSER_BAR;
        return this.f20188b.equals(jcbVar.f20188b);
    }

    public final int hashCode() {
        return this.f20188b.hashCode() + ((bdb.BROWSER_BAR.hashCode() + (this.f20187a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SiteVisitDayInput(day=" + this.f20187a + ", source=" + bdb.BROWSER_BAR + ", hours=" + this.f20188b + ")";
    }
}
