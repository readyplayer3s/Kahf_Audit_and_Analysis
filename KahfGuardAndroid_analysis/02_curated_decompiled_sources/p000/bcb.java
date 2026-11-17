package p000;

import java.net.IDN;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes2.dex */
public abstract class bcb {

    /* renamed from: a */
    public static final k1a f3083a = new k1a("^[a-z0-9.\\-:\\[\\]]+$");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        if (p000.bcb.f3083a.m11765d(r9) != false) goto L37;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a91 m1876a(List list, d3d d3dVar) {
        d3d d3dVar2;
        String lowerCase;
        Object obj;
        if (d3dVar == null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!((d3d) obj).f7288b) {
                    break;
                }
            }
            d3dVar2 = (d3d) obj;
        } else {
            d3dVar2 = d3dVar;
        }
        String str = d3dVar2.f7287a;
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == ' ') {
                z = false;
                break;
            }
            if (charAt == '.') {
                z = true;
            }
        }
        if (z) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                lowerCase = ascii.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.length() <= 253) {
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        lowerCase = null;
        if (lowerCase != null) {
            return new a91(lowerCase, d3dVar2.f7288b, d3dVar != null);
        }
        return null;
    }
}
