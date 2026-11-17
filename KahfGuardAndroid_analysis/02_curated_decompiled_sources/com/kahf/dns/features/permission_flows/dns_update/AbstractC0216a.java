package com.kahf.dns.features.permission_flows.dns_update;

import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0717pp;
import p000.C0913v;
import p000.C0917v3;
import p000.C1024y;
import p000.C1030y5;
import p000.cy3;
import p000.d0a;
import p000.dec;
import p000.dq6;
import p000.fa3;
import p000.ga3;
import p000.ha3;
import p000.hkd;
import p000.ih6;
import p000.iq5;
import p000.iv7;
import p000.iwa;
import p000.j32;
import p000.ja3;
import p000.jm4;
import p000.ka3;
import p000.kw6;
import p000.la3;
import p000.mn4;
import p000.mta;
import p000.muc;
import p000.mv1;
import p000.o20;
import p000.pc2;
import p000.q82;
import p000.qa1;
import p000.txc;
import p000.tz2;
import p000.tz6;
import p000.u11;
import p000.v20;
import p000.v57;
import p000.vc3;
import p000.vl4;
import p000.ws1;
import p000.wx1;
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
/* renamed from: com.kahf.dns.features.permission_flows.dns_update.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0216a {
    /* renamed from: a */
    public static final void m3838a(wy7 wy7Var, hkd hkdVar, yj2 yj2Var, v57 v57Var, String str, y12 y12Var, int i) {
        mn4 mn4Var;
        yj2 yj2Var2;
        v57 v57Var2;
        yj2 yj2Var3;
        int i2;
        v57 v57Var3;
        int i3;
        xa2 xa2Var;
        iv7 iv7Var;
        iv7 iv7Var2;
        iv7 iv7Var3;
        boolean z;
        yj2 yj2Var4;
        fa3 fa3Var;
        v57 v57Var4;
        iwa iwaVar;
        iv7 iv7Var4;
        iv7 iv7Var5;
        iv7 iv7Var6;
        y3a y3aVar;
        wy7Var.getClass();
        mn4 mn4Var2 = (mn4) y12Var;
        mn4Var2.m13580Y(-1384303060);
        int i4 = i | (mn4Var2.m13596h(wy7Var) ? 4 : 2) | 128 | (mn4Var2.m13592f(str) ? 16384 : 8192);
        if (mn4Var2.m13570O(i4 & 1, (i4 & 8323) != 8322)) {
            mn4Var2.m13575T();
            if ((i & 1) == 0 || mn4Var2.m13616y()) {
                ycd m12353a = kw6.m12353a(mn4Var2);
                if (m12353a == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yj2Var3 = (yj2) yw6.m23124t(d0a.m5838a(yj2.class), m12353a.mo6782d(), null, y6d.m22711r(m12353a), ih6.m10330a(mn4Var2), null);
                ycd m12353a2 = kw6.m12353a(mn4Var2);
                if (m12353a2 == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-8065);
                    v57Var3 = (v57) yw6.m23124t(d0a.m5838a(v57.class), m12353a2.mo6782d(), null, y6d.m22711r(m12353a2), ih6.m10330a(mn4Var2), null);
                }
            } else {
                mn4Var2.m13573R();
                i2 = i4 & (-8065);
                yj2Var3 = yj2Var;
                v57Var3 = v57Var;
            }
            mn4Var2.m13608q();
            iv7 m20265i = v20.m20265i(yj2Var3.f50589C, mn4Var2);
            mta m10330a = ih6.m10330a(mn4Var2);
            boolean m13592f = mn4Var2.m13592f(null) | mn4Var2.m13592f(m10330a);
            Object m13568L = mn4Var2.m13568L();
            y3a y3aVar2 = x12.f47437a;
            if (m13592f || m13568L == y3aVar2) {
                m13568L = tz6.m19205f(PreferencesHelper.class, m10330a, null, null, mn4Var2);
            }
            PreferencesHelper preferencesHelper = (PreferencesHelper) m13568L;
            ycd m12353a3 = kw6.m12353a(mn4Var2);
            if (m12353a3 == null) {
                C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            vc3 vc3Var = (vc3) yw6.m23124t(d0a.m5838a(vc3.class), m12353a3.mo6782d(), null, y6d.m22711r(m12353a3), ih6.m10330a(mn4Var2), null);
            Object m13568L2 = mn4Var2.m13568L();
            if (m13568L2 == y3aVar2) {
                m13568L2 = o20.m14750u(mn4Var2);
                mn4Var2.m13595g0(m13568L2);
            }
            pc2 pc2Var = (pc2) m13568L2;
            dq6 dq6Var = (dq6) mn4Var2.m13600j(xv6.f49149a);
            Object m13568L3 = mn4Var2.m13568L();
            if (m13568L3 == y3aVar2) {
                m13568L3 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L3);
            }
            iv7 iv7Var7 = (iv7) m13568L3;
            Object m13568L4 = mn4Var2.m13568L();
            if (m13568L4 == y3aVar2) {
                m13568L4 = yw6.m23120p(Boolean.valueOf(mv1.f27114j));
                mn4Var2.m13595g0(m13568L4);
            }
            iv7 iv7Var8 = (iv7) m13568L4;
            Object m13568L5 = mn4Var2.m13568L();
            if (m13568L5 == y3aVar2) {
                i3 = i2;
                m13568L5 = zy5.m23835a(Integer.MAX_VALUE, 6, null);
                mn4Var2.m13595g0(m13568L5);
            } else {
                i3 = i2;
            }
            qa1 qa1Var = (qa1) m13568L5;
            Object m13568L6 = mn4Var2.m13568L();
            if (m13568L6 == y3aVar2) {
                xa2Var = null;
                m13568L6 = yw6.m23120p(preferencesHelper.getStringFromPreferences(PrefKeys.LANGUAGE, "en"));
                mn4Var2.m13595g0(m13568L6);
            } else {
                xa2Var = null;
            }
            iv7 iv7Var9 = (iv7) m13568L6;
            Object m13568L7 = mn4Var2.m13568L();
            if (m13568L7 == y3aVar2) {
                m13568L7 = yw6.m23120p(xa2Var);
                mn4Var2.m13595g0(m13568L7);
            }
            iv7 iv7Var10 = (iv7) m13568L7;
            List m20591f = vc3Var.m20591f();
            iwa m10517w = iq5.m10517w(mn4Var2);
            ((tz2) mn4Var2.m13600j(j32.f19533h)).getDensity();
            Object m13568L8 = mn4Var2.m13568L();
            if (m13568L8 == y3aVar2) {
                m13568L8 = yw6.m23120p(0);
                mn4Var2.m13595g0(m13568L8);
            }
            iv7 iv7Var11 = (iv7) m13568L8;
            boolean m13592f2 = mn4Var2.m13592f((String) iv7Var9.getValue());
            Object m13568L9 = mn4Var2.m13568L();
            if (m13592f2 || m13568L9 == y3aVar2) {
                m13568L9 = new fa3((String) iv7Var9.getValue(), pc2Var);
                mn4Var2.m13595g0(m13568L9);
            }
            fa3 fa3Var2 = (fa3) m13568L9;
            Integer valueOf = Integer.valueOf(((Number) iv7Var11.getValue()).intValue());
            Object m13568L10 = mn4Var2.m13568L();
            if (m13568L10 == y3aVar2) {
                iv7Var = iv7Var7;
                iv7Var2 = iv7Var10;
                iv7Var3 = m20265i;
                m13568L10 = new C0717pp(2, xa2Var, (byte) 4);
                mn4Var2.m13595g0(m13568L10);
            } else {
                iv7Var = iv7Var7;
                iv7Var2 = iv7Var10;
                iv7Var3 = m20265i;
            }
            o20.m14721f(mn4Var2, (jm4) m13568L10, valueOf);
            boolean m13596h = mn4Var2.m13596h(yj2Var3);
            Object m13568L11 = mn4Var2.m13568L();
            if (m13596h || m13568L11 == y3aVar2) {
                m13568L11 = new ja3(yj2Var3, null);
                mn4Var2.m13595g0(m13568L11);
            }
            txc txcVar = txc.f41359a;
            o20.m14721f(mn4Var2, (jm4) m13568L11, txcVar);
            int i5 = i3 & 57344;
            boolean m13596h2 = mn4Var2.m13596h(yj2Var3) | (i5 == 16384);
            Object m13568L12 = mn4Var2.m13568L();
            if (m13596h2 || m13568L12 == y3aVar2) {
                z = false;
                m13568L12 = new ka3(yj2Var3, str, null, (byte) 0);
                mn4Var2.m13595g0(m13568L12);
            } else {
                z = false;
            }
            o20.m14721f(mn4Var2, (jm4) m13568L12, str);
            boolean m13596h3 = mn4Var2.m13596h(m20591f);
            if (i5 == 16384) {
                z = true;
            }
            boolean m13596h4 = z | m13596h3 | mn4Var2.m13596h(yj2Var3) | mn4Var2.m13596h(fa3Var2);
            Object m13568L13 = mn4Var2.m13568L();
            if (m13596h4 || m13568L13 == y3aVar2) {
                yj2Var4 = yj2Var3;
                fa3Var = fa3Var2;
                v57Var4 = v57Var3;
                iwaVar = m10517w;
                iv7Var4 = iv7Var8;
                iv7Var5 = iv7Var;
                iv7Var6 = iv7Var11;
                y3aVar = y3aVar2;
                la3 la3Var = new la3(m20591f, fa3Var, str, iv7Var2, yj2Var4, null);
                mn4Var2.m13595g0(la3Var);
                m13568L13 = la3Var;
            } else {
                yj2Var4 = yj2Var3;
                v57Var4 = v57Var3;
                iwaVar = m10517w;
                iv7Var4 = iv7Var8;
                iv7Var5 = iv7Var;
                iv7Var6 = iv7Var11;
                fa3Var = fa3Var2;
                y3aVar = y3aVar2;
            }
            o20.m14721f(mn4Var2, (jm4) m13568L13, txcVar);
            Object m13568L14 = mn4Var2.m13568L();
            if (m13568L14 == y3aVar) {
                m13568L14 = new q82(iv7Var5, iv7Var6, null, (byte) 1);
                mn4Var2.m13595g0(m13568L14);
            }
            o20.m14721f(mn4Var2, (jm4) m13568L14, txcVar);
            boolean m13596h5 = mn4Var2.m13596h(dq6Var) | mn4Var2.m13596h(fa3Var);
            Object m13568L15 = mn4Var2.m13568L();
            if (m13596h5 || m13568L15 == y3aVar) {
                m13568L15 = new C0913v(dq6Var, fa3Var, (byte) 18);
                mn4Var2.m13595g0(m13568L15);
            }
            o20.m14713b(dq6Var, (vl4) m13568L15, mn4Var2);
            boolean m13596h6 = mn4Var2.m13596h(qa1Var) | mn4Var2.m13596h(fa3Var);
            Object m13568L16 = mn4Var2.m13568L();
            if (m13596h6 || m13568L16 == y3aVar) {
                m13568L16 = new C1024y(qa1Var, fa3Var, (xa2) null, (byte) 18);
                mn4Var2.m13595g0(m13568L16);
            }
            o20.m14721f(mn4Var2, (jm4) m13568L16, txcVar);
            cy3 cy3Var = (cy3) mn4Var2.m13600j(dec.f7919e);
            ws1 ws1Var = new ws1(cy3Var.f7046a);
            ws1 ws1Var2 = new ws1(cy3Var.f7047b);
            wx1 m19275b0 = u11.m19275b0(1442846566, new C1030y5(wy7Var, fa3Var, iv7Var4, (byte) 14), mn4Var2);
            yj2 yj2Var5 = yj2Var4;
            wx1 m19275b02 = u11.m19275b0(-148863700, new ga3(cy3Var, iv7Var3, iwaVar, str, yj2Var5, qa1Var, wy7Var, iv7Var5, iv7Var6, iv7Var2), mn4Var2);
            mn4Var = mn4Var2;
            muc.m13766b(null, ws1Var, ws1Var2, m19275b0, m19275b02, mn4Var, 1575936, 49);
            v57Var2 = v57Var4;
            yj2Var2 = yj2Var5;
        } else {
            mn4Var = mn4Var2;
            mn4Var.m13573R();
            yj2Var2 = yj2Var;
            v57Var2 = v57Var;
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new ha3(wy7Var, hkdVar, yj2Var2, v57Var2, str, i, (byte) 0);
        }
    }
}
