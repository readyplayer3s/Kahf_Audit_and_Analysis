package com.kahf.dns.features.permission_flows.dns_update;

import com.kahf.dns.utils.PrefKeys;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.List;
import p000.C0717pp;
import p000.C0917v3;
import p000.C1030y5;
import p000.cc3;
import p000.cy3;
import p000.d0a;
import p000.dec;
import p000.dq6;
import p000.ec3;
import p000.fc3;
import p000.gc3;
import p000.ha3;
import p000.hkd;
import p000.ih6;
import p000.iq5;
import p000.iv7;
import p000.iwa;
import p000.jm4;
import p000.ka3;
import p000.kw6;
import p000.mn4;
import p000.mta;
import p000.muc;
import p000.mv1;
import p000.o20;
import p000.pc2;
import p000.q02;
import p000.q50;
import p000.q82;
import p000.qa1;
import p000.tl4;
import p000.txc;
import p000.tz6;
import p000.u11;
import p000.u23;
import p000.v20;
import p000.v57;
import p000.vc3;
import p000.vic;
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
/* renamed from: com.kahf.dns.features.permission_flows.dns_update.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0217b {
    /* renamed from: a */
    public static final void m3839a(wy7 wy7Var, hkd hkdVar, yj2 yj2Var, v57 v57Var, String str, y12 y12Var, int i) {
        wy7 wy7Var2;
        mn4 mn4Var;
        yj2 yj2Var2;
        v57 v57Var2;
        int i2;
        yj2 yj2Var3;
        v57 v57Var3;
        int i3;
        xa2 xa2Var;
        iv7 iv7Var;
        iv7 iv7Var2;
        cy3 cy3Var;
        Object fc3Var;
        y3a y3aVar;
        cc3 cc3Var;
        txc txcVar;
        String str2;
        xa2 xa2Var2;
        Object q50Var;
        y3a y3aVar2;
        iv7 iv7Var3;
        dq6 dq6Var;
        cy3 cy3Var2;
        cc3 cc3Var2;
        String str3;
        Object gc3Var;
        iv7 iv7Var4;
        iv7 iv7Var5;
        iv7 iv7Var6;
        txc txcVar2;
        qa1 qa1Var;
        cc3 cc3Var3;
        yj2 yj2Var4;
        wy7Var.getClass();
        mn4 mn4Var2 = (mn4) y12Var;
        mn4Var2.m13580Y(1227542716);
        int i4 = i | (mn4Var2.m13596h(wy7Var) ? 4 : 2) | 128 | (mn4Var2.m13592f(str) ? 16384 : 8192);
        if (mn4Var2.m13570O(i4 & 1, (i4 & 8323) != 8322)) {
            mn4Var2.m13575T();
            if ((i & 1) == 0 || mn4Var2.m13616y()) {
                ycd m12353a = kw6.m12353a(mn4Var2);
                if (m12353a == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yj2 yj2Var5 = (yj2) yw6.m23124t(d0a.m5838a(yj2.class), m12353a.mo6782d(), null, y6d.m22711r(m12353a), ih6.m10330a(mn4Var2), null);
                ycd m12353a2 = kw6.m12353a(mn4Var2);
                if (m12353a2 == null) {
                    C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-8065);
                    yj2Var3 = yj2Var5;
                    v57Var3 = (v57) yw6.m23124t(d0a.m5838a(v57.class), m12353a2.mo6782d(), null, y6d.m22711r(m12353a2), ih6.m10330a(mn4Var2), null);
                }
            } else {
                mn4Var2.m13573R();
                i2 = i4 & (-8065);
                yj2Var3 = yj2Var;
                v57Var3 = v57Var;
            }
            mn4Var2.m13608q();
            cy3 cy3Var3 = (cy3) mn4Var2.m13600j(dec.f7919e);
            iv7 m20265i = v20.m20265i(yj2Var3.f50589C, mn4Var2);
            mta m10330a = ih6.m10330a(mn4Var2);
            boolean m13592f = mn4Var2.m13592f(null) | mn4Var2.m13592f(m10330a);
            Object m13568L = mn4Var2.m13568L();
            y3a y3aVar3 = x12.f47437a;
            if (m13592f || m13568L == y3aVar3) {
                m13568L = tz6.m19205f(PreferencesHelper.class, m10330a, null, null, mn4Var2);
            }
            PreferencesHelper preferencesHelper = (PreferencesHelper) m13568L;
            ycd m12353a3 = kw6.m12353a(mn4Var2);
            if (m12353a3 == null) {
                C0917v3.m20303j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            vc3 vc3Var = (vc3) yw6.m23124t(d0a.m5838a(vc3.class), m12353a3.mo6782d(), null, y6d.m22711r(m12353a3), ih6.m10330a(mn4Var2), null);
            mta m10330a2 = ih6.m10330a(mn4Var2);
            boolean m13592f2 = mn4Var2.m13592f(null) | mn4Var2.m13592f(m10330a2);
            Object m13568L2 = mn4Var2.m13568L();
            if (m13592f2 || m13568L2 == y3aVar3) {
                m13568L2 = tz6.m19205f(vic.class, m10330a2, null, null, mn4Var2);
            }
            Object m13568L3 = mn4Var2.m13568L();
            if (m13568L3 == y3aVar3) {
                m13568L3 = o20.m14750u(mn4Var2);
                mn4Var2.m13595g0(m13568L3);
            }
            pc2 pc2Var = (pc2) m13568L3;
            dq6 dq6Var2 = (dq6) mn4Var2.m13600j(xv6.f49149a);
            Object m13568L4 = mn4Var2.m13568L();
            if (m13568L4 == y3aVar3) {
                m13568L4 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L4);
            }
            iv7 iv7Var7 = (iv7) m13568L4;
            Object m13568L5 = mn4Var2.m13568L();
            if (m13568L5 == y3aVar3) {
                m13568L5 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L5);
            }
            iv7 iv7Var8 = (iv7) m13568L5;
            Object m13568L6 = mn4Var2.m13568L();
            if (m13568L6 == y3aVar3) {
                m13568L6 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L6);
            }
            iv7 iv7Var9 = (iv7) m13568L6;
            Object m13568L7 = mn4Var2.m13568L();
            if (m13568L7 == y3aVar3) {
                m13568L7 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L7);
            }
            iv7 iv7Var10 = (iv7) m13568L7;
            Object[] objArr = new Object[0];
            boolean z = false;
            Object m13568L8 = mn4Var2.m13568L();
            if (m13568L8 == y3aVar3) {
                m13568L8 = new q02((byte) 17);
                mn4Var2.m13595g0(m13568L8);
            }
            String str4 = (String) o20.m14732k0(objArr, (tl4) m13568L8, mn4Var2, 48);
            Object m13568L9 = mn4Var2.m13568L();
            if (m13568L9 == y3aVar3) {
                m13568L9 = yw6.m23120p(Boolean.FALSE);
                mn4Var2.m13595g0(m13568L9);
            }
            iv7 iv7Var11 = (iv7) m13568L9;
            Object m13568L10 = mn4Var2.m13568L();
            if (m13568L10 == y3aVar3) {
                m13568L10 = yw6.m23120p(Boolean.valueOf(mv1.f27114j));
                mn4Var2.m13595g0(m13568L10);
            }
            iv7 iv7Var12 = (iv7) m13568L10;
            Object m13568L11 = mn4Var2.m13568L();
            if (m13568L11 == y3aVar3) {
                i3 = i2;
                m13568L11 = zy5.m23835a(Integer.MAX_VALUE, 6, null);
                mn4Var2.m13595g0(m13568L11);
            } else {
                i3 = i2;
            }
            qa1 qa1Var2 = (qa1) m13568L11;
            Object m13568L12 = mn4Var2.m13568L();
            if (m13568L12 == y3aVar3) {
                xa2Var = null;
                m13568L12 = yw6.m23120p(preferencesHelper.getStringFromPreferences(PrefKeys.LANGUAGE, "en"));
                mn4Var2.m13595g0(m13568L12);
            } else {
                xa2Var = null;
            }
            iv7 iv7Var13 = (iv7) m13568L12;
            boolean m13592f3 = mn4Var2.m13592f((String) iv7Var13.getValue());
            Object m13568L13 = mn4Var2.m13568L();
            if (m13592f3 || m13568L13 == y3aVar3) {
                m13568L13 = new cc3((String) iv7Var13.getValue(), pc2Var);
                mn4Var2.m13595g0(m13568L13);
            }
            cc3 cc3Var4 = (cc3) m13568L13;
            Object m13568L14 = mn4Var2.m13568L();
            if (m13568L14 == y3aVar3) {
                m13568L14 = yw6.m23120p(xa2Var);
                mn4Var2.m13595g0(m13568L14);
            }
            iv7 iv7Var14 = (iv7) m13568L14;
            List m20591f = vc3Var.m20591f();
            iwa m10517w = iq5.m10517w(mn4Var2);
            Object m13568L15 = mn4Var2.m13568L();
            if (m13568L15 == y3aVar3) {
                m13568L15 = yw6.m23120p(0);
                mn4Var2.m13595g0(m13568L15);
            }
            iv7 iv7Var15 = (iv7) m13568L15;
            boolean m13596h = mn4Var2.m13596h(yj2Var3);
            Object m13568L16 = mn4Var2.m13568L();
            if (m13596h || m13568L16 == y3aVar3) {
                iv7Var = iv7Var12;
                m13568L16 = new ec3(yj2Var3, xa2Var);
                mn4Var2.m13595g0(m13568L16);
            } else {
                iv7Var = iv7Var12;
            }
            txc txcVar3 = txc.f41359a;
            o20.m14721f(mn4Var2, (jm4) m13568L16, txcVar3);
            Integer valueOf = Integer.valueOf(((Number) iv7Var15.getValue()).intValue());
            Object m13568L17 = mn4Var2.m13568L();
            if (m13568L17 == y3aVar3) {
                iv7Var2 = iv7Var14;
                cy3Var = cy3Var3;
                m13568L17 = new C0717pp(2, null, (byte) 5);
                mn4Var2.m13595g0(m13568L17);
            } else {
                iv7Var2 = iv7Var14;
                cy3Var = cy3Var3;
            }
            o20.m14721f(mn4Var2, (jm4) m13568L17, valueOf);
            int i5 = i3 & 57344;
            boolean m13596h2 = mn4Var2.m13596h(m20591f) | (i5 == 16384) | mn4Var2.m13596h(yj2Var3) | mn4Var2.m13596h(cc3Var4);
            Object m13568L18 = mn4Var2.m13568L();
            if (m13596h2 || m13568L18 == y3aVar3) {
                y3aVar = y3aVar3;
                cc3Var = cc3Var4;
                txcVar = txcVar3;
                fc3Var = new fc3(m20591f, cc3Var, str, iv7Var2, yj2Var3, null);
                str2 = str;
                mn4Var2.m13595g0(fc3Var);
            } else {
                str2 = str;
                fc3Var = m13568L18;
                cc3Var = cc3Var4;
                txcVar = txcVar3;
                y3aVar = y3aVar3;
            }
            o20.m14721f(mn4Var2, (jm4) fc3Var, txcVar);
            boolean m13596h3 = mn4Var2.m13596h(yj2Var3);
            if (i5 == 16384) {
                z = true;
            }
            boolean z2 = m13596h3 | z;
            Object m13568L19 = mn4Var2.m13568L();
            if (z2 || m13568L19 == y3aVar) {
                xa2Var2 = null;
                m13568L19 = new ka3(yj2Var3, str2, null, (byte) 1);
                mn4Var2.m13595g0(m13568L19);
            } else {
                xa2Var2 = null;
            }
            o20.m14721f(mn4Var2, (jm4) m13568L19, str2);
            Object m13568L20 = mn4Var2.m13568L();
            if (m13568L20 == y3aVar) {
                m13568L20 = new q82(iv7Var11, iv7Var15, xa2Var2, (byte) 2);
                mn4Var2.m13595g0(m13568L20);
            }
            o20.m14721f(mn4Var2, (jm4) m13568L20, txcVar);
            boolean m13596h4 = mn4Var2.m13596h(yj2Var3) | mn4Var2.m13592f(str4) | mn4Var2.m13596h(cc3Var) | mn4Var2.m13596h(dq6Var2);
            Object m13568L21 = mn4Var2.m13568L();
            if (m13596h4 || m13568L21 == y3aVar) {
                cc3 cc3Var5 = cc3Var;
                y3aVar2 = y3aVar;
                iv7Var3 = iv7Var;
                dq6Var = dq6Var2;
                cy3Var2 = cy3Var;
                q50Var = new q50(dq6Var, yj2Var3, cc3Var5, iv7Var8, iv7Var7, iv7Var9, iv7Var10, iv7Var2, str4);
                cc3Var2 = cc3Var5;
                str3 = str4;
                mn4Var2.m13595g0(q50Var);
            } else {
                cc3Var2 = cc3Var;
                q50Var = m13568L21;
                str3 = str4;
                y3aVar2 = y3aVar;
                iv7Var3 = iv7Var;
                dq6Var = dq6Var2;
                cy3Var2 = cy3Var;
            }
            o20.m14713b(dq6Var, (vl4) q50Var, mn4Var2);
            wy7Var2 = wy7Var;
            boolean m13596h5 = mn4Var2.m13596h(qa1Var2) | mn4Var2.m13596h(cc3Var2) | mn4Var2.m13596h(yj2Var3) | mn4Var2.m13592f(str3) | mn4Var2.m13596h(wy7Var2);
            Object m13568L22 = mn4Var2.m13568L();
            if (m13596h5 || m13568L22 == y3aVar2) {
                iv7Var4 = iv7Var3;
                cc3 cc3Var6 = cc3Var2;
                yj2 yj2Var6 = yj2Var3;
                iv7Var5 = iv7Var15;
                iv7Var6 = iv7Var11;
                txcVar2 = txcVar;
                qa1Var = qa1Var2;
                gc3Var = new gc3(qa1Var, cc3Var6, yj2Var6, iv7Var7, iv7Var10, wy7Var, iv7Var9, iv7Var2, str3, null);
                cc3Var3 = cc3Var6;
                yj2Var4 = yj2Var6;
                wy7Var2 = wy7Var;
                mn4Var2.m13595g0(gc3Var);
            } else {
                iv7Var5 = iv7Var15;
                yj2Var4 = yj2Var3;
                iv7Var6 = iv7Var11;
                gc3Var = m13568L22;
                txcVar2 = txcVar;
                iv7Var4 = iv7Var3;
                cc3Var3 = cc3Var2;
                qa1Var = qa1Var2;
            }
            o20.m14721f(mn4Var2, (jm4) gc3Var, txcVar2);
            mn4Var = mn4Var2;
            muc.m13766b(null, new ws1(cy3Var2.f7046a), new ws1(cy3Var2.f7047b), u11.m19275b0(-1853310858, new C1030y5(wy7Var2, cc3Var3, iv7Var4, (byte) 15), mn4Var2), u11.m19275b0(-246030404, new u23(cy3Var2, str, qa1Var, m10517w, cc3Var3, m20265i, iv7Var6, iv7Var5), mn4Var2), mn4Var, 1575936, 49);
            yj2Var2 = yj2Var4;
            v57Var2 = v57Var3;
        } else {
            wy7Var2 = wy7Var;
            mn4Var = mn4Var2;
            mn4Var.m13573R();
            yj2Var2 = yj2Var;
            v57Var2 = v57Var;
        }
        yv9 m13610s = mn4Var.m13610s();
        if (m13610s != null) {
            m13610s.f51276d = new ha3(wy7Var2, hkdVar, yj2Var2, v57Var2, str, i, (byte) 1);
        }
    }
}
