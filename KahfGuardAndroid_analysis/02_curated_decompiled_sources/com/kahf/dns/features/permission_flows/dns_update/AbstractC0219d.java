package com.kahf.dns.features.permission_flows.dns_update;

import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0717pp;
import p000.C0917v3;
import p000.C0919v5;
import p000.C0925vb;
import p000.cy3;
import p000.d0a;
import p000.dec;
import p000.dq6;
import p000.fd3;
import p000.gd3;
import p000.ha3;
import p000.hd3;
import p000.hkd;
import p000.ih6;
import p000.iv7;
import p000.jm4;
import p000.kw6;
import p000.mn4;
import p000.mta;
import p000.muc;
import p000.o20;
import p000.q82;
import p000.qa1;
import p000.txc;
import p000.tz6;
import p000.u11;
import p000.v20;
import p000.v57;
import p000.vc3;
import p000.vl4;
import p000.ws1;
import p000.wy7;
import p000.x12;
import p000.xa2;
import p000.xv6;
import p000.y12;
import p000.y3a;
import p000.y6d;
import p000.ycd;
import p000.yj2;
import p000.yv9;
import p000.yw6;
import p000.zy5;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* renamed from: com.kahf.dns.features.permission_flows.dns_update.d */
/* loaded from: classes2.dex */
public abstract class AbstractC0219d {
    /* renamed from: a */
    public static final void m3840a(wy7 wy7Var, hkd hkdVar, yj2 yj2Var, v57 v57Var, String str, y12 y12Var, int i) {
        yj2 yj2Var2;
        v57 v57Var2;
        yj2 yj2Var3;
        int i2;
        v57 v57Var3;
        xa2 xa2Var;
        int i3;
        iv7 iv7Var;
        iv7 iv7Var2;
        Object hd3Var;
        iv7 iv7Var3;
        qa1 qa1Var;
        dq6 dq6Var;
        iv7 iv7Var4;
        iv7 iv7Var5;
        Object c0919v5;
        iv7 iv7Var6;
        cy3 cy3Var;
        dq6 dq6Var2;
        iv7 iv7Var7;
        qa1 qa1Var2;
        yj2 yj2Var4;
        wy7Var.getClass();
        mn4 mn4Var = (mn4) y12Var;
        mn4Var.m13580Y(-689160274);
        int i4 = i | (mn4Var.m13596h(wy7Var) ? 4 : 2) | 128 | (mn4Var.m13592f(str) ? 16384 : 8192);
        if (mn4Var.m13570O(i4 & 1, (i4 & 8323) != 8322)) {
            mn4Var.m13575T();
            if ((i & 1) == 0 || mn4Var.m13616y()) {
                ycd m12353a = kw6.m12353a(mn4Var);
                if (m12353a == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yj2 yj2Var5 = (yj2) yw6.m23124t(d0a.m5838a(yj2.class), m12353a.mo6782d(), null, y6d.m22711r(m12353a), ih6.m10330a(mn4Var), null);
                ycd m12353a2 = kw6.m12353a(mn4Var);
                if (m12353a2 == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    yj2Var3 = yj2Var5;
                    i2 = i4 & (-8065);
                    v57Var3 = (v57) yw6.m23124t(d0a.m5838a(v57.class), m12353a2.mo6782d(), null, y6d.m22711r(m12353a2), ih6.m10330a(mn4Var), null);
                }
            } else {
                mn4Var.m13573R();
                yj2Var3 = yj2Var;
                i2 = i4 & (-8065);
                v57Var3 = v57Var;
            }
            mn4Var.m13608q();
            cy3 cy3Var2 = (cy3) mn4Var.m13600j(dec.f7919e);
            iv7 m20265i = v20.m20265i(yj2Var3.f50589C, mn4Var);
            mta m10330a = ih6.m10330a(mn4Var);
            boolean m13592f = mn4Var.m13592f(null) | mn4Var.m13592f(m10330a);
            Object m13568L = mn4Var.m13568L();
            y3a y3aVar = x12.f47437a;
            if (m13592f || m13568L == y3aVar) {
                m13568L = tz6.m19205f(PreferencesHelper.class, m10330a, null, null, mn4Var);
            }
            PreferencesHelper preferencesHelper = (PreferencesHelper) m13568L;
            ycd m12353a3 = kw6.m12353a(mn4Var);
            if (m12353a3 == null) {
                C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            vc3 vc3Var = (vc3) yw6.m23124t(d0a.m5838a(vc3.class), m12353a3.mo6782d(), null, y6d.m22711r(m12353a3), ih6.m10330a(mn4Var), null);
            dq6 dq6Var3 = (dq6) mn4Var.m13600j(xv6.f49149a);
            Object m13568L2 = mn4Var.m13568L();
            if (m13568L2 == y3aVar) {
                m13568L2 = zy5.m23835a(Integer.MAX_VALUE, 6, null);
                mn4Var.m13595g0(m13568L2);
            }
            qa1 qa1Var3 = (qa1) m13568L2;
            Object m13568L3 = mn4Var.m13568L();
            if (m13568L3 == y3aVar) {
                m13568L3 = yw6.m23120p(Boolean.FALSE);
                mn4Var.m13595g0(m13568L3);
            }
            iv7 iv7Var8 = (iv7) m13568L3;
            Object m13568L4 = mn4Var.m13568L();
            if (m13568L4 == y3aVar) {
                m13568L4 = yw6.m23120p(Boolean.FALSE);
                mn4Var.m13595g0(m13568L4);
            }
            iv7 iv7Var9 = (iv7) m13568L4;
            Object m13568L5 = mn4Var.m13568L();
            if (m13568L5 == y3aVar) {
                xa2Var = null;
                m13568L5 = yw6.m23120p(preferencesHelper.getStringFromPreferences(PrefKeys.LANGUAGE, "en"));
                mn4Var.m13595g0(m13568L5);
            } else {
                xa2Var = null;
            }
            Object m13568L6 = mn4Var.m13568L();
            if (m13568L6 == y3aVar) {
                m13568L6 = yw6.m23120p(xa2Var);
                mn4Var.m13595g0(m13568L6);
            }
            iv7 iv7Var10 = (iv7) m13568L6;
            List m20591f = vc3Var.m20591f();
            Object m13568L7 = mn4Var.m13568L();
            if (m13568L7 == y3aVar) {
                m13568L7 = yw6.m23120p(Boolean.FALSE);
                mn4Var.m13595g0(m13568L7);
            }
            iv7 iv7Var11 = (iv7) m13568L7;
            Object m13568L8 = mn4Var.m13568L();
            if (m13568L8 == y3aVar) {
                m13568L8 = yw6.m23120p(0);
                mn4Var.m13595g0(m13568L8);
            }
            iv7 iv7Var12 = (iv7) m13568L8;
            v57 v57Var4 = v57Var3;
            Integer valueOf = Integer.valueOf(((Number) iv7Var12.getValue()).intValue());
            Object m13568L9 = mn4Var.m13568L();
            if (m13568L9 == y3aVar) {
                i3 = i2;
                iv7Var = iv7Var8;
                iv7Var2 = iv7Var12;
                m13568L9 = new C0717pp(2, xa2Var, (byte) 6);
                mn4Var.m13595g0(m13568L9);
            } else {
                i3 = i2;
                iv7Var = iv7Var8;
                iv7Var2 = iv7Var12;
            }
            o20.m14721f(mn4Var, (jm4) m13568L9, valueOf);
            boolean m13596h = mn4Var.m13596h(yj2Var3);
            Object m13568L10 = mn4Var.m13568L();
            if (m13596h || m13568L10 == y3aVar) {
                m13568L10 = new gd3(yj2Var3, null);
                mn4Var.m13595g0(m13568L10);
            }
            txc txcVar = txc.f41359a;
            o20.m14721f(mn4Var, (jm4) m13568L10, txcVar);
            boolean m13596h2 = mn4Var.m13596h(m20591f) | ((i3 & 57344) == 16384) | mn4Var.m13596h(yj2Var3);
            Object m13568L11 = mn4Var.m13568L();
            if (m13596h2 || m13568L11 == y3aVar) {
                iv7Var3 = iv7Var11;
                qa1Var = qa1Var3;
                dq6Var = dq6Var3;
                iv7Var4 = iv7Var10;
                iv7Var5 = iv7Var2;
                hd3Var = new hd3(m20591f, str, iv7Var4, yj2Var3, null);
                mn4Var.m13595g0(hd3Var);
            } else {
                hd3Var = m13568L11;
                qa1Var = qa1Var3;
                dq6Var = dq6Var3;
                iv7Var3 = iv7Var11;
                iv7Var4 = iv7Var10;
                iv7Var5 = iv7Var2;
            }
            o20.m14721f(mn4Var, (jm4) hd3Var, txcVar);
            Object m13568L12 = mn4Var.m13568L();
            if (m13568L12 == y3aVar) {
                m13568L12 = new q82(iv7Var3, iv7Var5, null, (byte) 3);
                mn4Var.m13595g0(m13568L12);
            }
            o20.m14721f(mn4Var, (jm4) m13568L12, txcVar);
            boolean m13596h3 = mn4Var.m13596h(yj2Var3) | mn4Var.m13596h(dq6Var);
            Object m13568L13 = mn4Var.m13568L();
            if (m13596h3 || m13568L13 == y3aVar) {
                iv7Var6 = iv7Var;
                iv7 iv7Var13 = iv7Var4;
                cy3Var = cy3Var2;
                dq6Var2 = dq6Var;
                c0919v5 = new C0919v5(dq6Var2, yj2Var3, iv7Var6, iv7Var9, iv7Var13);
                iv7Var7 = iv7Var13;
                mn4Var.m13595g0(c0919v5);
            } else {
                iv7Var6 = iv7Var;
                c0919v5 = m13568L13;
                cy3Var = cy3Var2;
                iv7Var7 = iv7Var4;
                dq6Var2 = dq6Var;
            }
            o20.m14713b(dq6Var2, (vl4) c0919v5, mn4Var);
            boolean m13596h4 = mn4Var.m13596h(qa1Var) | mn4Var.m13596h(yj2Var3);
            Object m13568L14 = mn4Var.m13568L();
            if (m13596h4 || m13568L14 == y3aVar) {
                qa1Var2 = qa1Var;
                C0218c c0218c = new C0218c(qa1Var2, yj2Var3, iv7Var6, iv7Var7, null);
                yj2Var4 = yj2Var3;
                mn4Var.m13595g0(c0218c);
                m13568L14 = c0218c;
            } else {
                qa1Var2 = qa1Var;
                yj2Var4 = yj2Var3;
            }
            o20.m14721f(mn4Var, (jm4) m13568L14, txcVar);
            muc.m13766b(null, new ws1(cy3Var.f7046a), new ws1(cy3Var.f7047b), u11.m19275b0(1782299240, new C0925vb(wy7Var, (byte) 11), mn4Var), u11.m19275b0(1157090990, new fd3(cy3Var, str, qa1Var2, m20265i, iv7Var3, iv7Var5, (byte) 0), mn4Var), mn4Var, 1575936, 49);
            yj2Var2 = yj2Var4;
            v57Var2 = v57Var4;
        } else {
            mn4Var.m13573R();
            yj2Var2 = yj2Var;
            v57Var2 = v57Var;
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new ha3(wy7Var, hkdVar, yj2Var2, v57Var2, str, i, (byte) 2);
        }
    }
}
