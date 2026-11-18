package p000;

import java.util.Map;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class nm9 extends s1c implements jm4 {

    /* renamed from: u */
    public ynb f28499u;

    /* renamed from: v */
    public Object f28500v;

    /* renamed from: w */
    public qfb f28501w;

    /* renamed from: x */
    public boolean f28502x;

    /* renamed from: y */
    public final /* synthetic */ wo9 f28503y;

    /* renamed from: z */
    public final /* synthetic */ Map f28504z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm9(wo9 wo9Var, Map map, xa2 xa2Var) {
        super(2, xa2Var);
        this.f28503y = wo9Var;
        this.f28504z = map;
    }

    @Override // p000.dp0
    public final xa2 create(Object obj, xa2 xa2Var) {
        return new nm9(this.f28503y, this.f28504z, xa2Var);
    }

    @Override // p000.jm4
    public final Object invoke(Object obj, Object obj2) {
        return ((nm9) create((pc2) obj, (xa2) obj2)).invokeSuspend(txc.f41359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0046 -> B:5:0x0049). Please report as a decompilation issue!!! */
    @Override // p000.dp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nm9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
