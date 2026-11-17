package p000;

import java.util.List;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public final class pzc implements InterfaceC0738q9 {

    /* renamed from: u */
    public static final pzc f33593u = new pzc();

    /* renamed from: v */
    public static final List f33594v = mv1.m13794F("success", "message", "error");

    @Override // p000.InterfaceC0738q9
    /* renamed from: j */
    public final void mo25j(bd6 bd6Var, pi2 pi2Var, Object obj) {
        lzc lzcVar = (lzc) obj;
        bd6Var.getClass();
        pi2Var.getClass();
        lzcVar.getClass();
        bd6Var.mo1905F0("success");
        AbstractC0849t9.f39938d.mo25j(bd6Var, pi2Var, Boolean.valueOf(lzcVar.f25391a));
        bd6Var.mo1905F0("message");
        o88 o88Var = AbstractC0849t9.f39940f;
        o88Var.mo25j(bd6Var, pi2Var, lzcVar.f25392b);
        bd6Var.mo1905F0("error");
        o88Var.mo25j(bd6Var, pi2Var, lzcVar.f25393c);
    }

    @Override // p000.InterfaceC0738q9
    /* renamed from: w */
    public final Object mo26w(hc6 hc6Var, pi2 pi2Var) {
        hc6Var.getClass();
        pi2Var.getClass();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (true) {
            int mo9331w0 = hc6Var.mo9331w0(f33594v);
            if (mo9331w0 == 0) {
                bool = (Boolean) AbstractC0849t9.f39938d.mo26w(hc6Var, pi2Var);
            } else if (mo9331w0 == 1) {
                str = (String) AbstractC0849t9.f39940f.mo26w(hc6Var, pi2Var);
            } else {
                if (mo9331w0 != 2) {
                    break;
                }
                str2 = (String) AbstractC0849t9.f39940f.mo26w(hc6Var, pi2Var);
            }
        }
        if (bool != null) {
            return new lzc(str, str2, bool.booleanValue());
        }
        wt4.m21699y(hc6Var, "success");
        throw null;
    }
}
