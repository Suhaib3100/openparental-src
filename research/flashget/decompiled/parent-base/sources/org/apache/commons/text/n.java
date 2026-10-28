package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.k1;

/* compiled from: StrSubstitutor.java */
@Deprecated
/* loaded from: classes3.dex */
public class n {

    /* renamed from: i, reason: collision with root package name */
    public static final char f86572i = '$';

    /* renamed from: j, reason: collision with root package name */
    public static final m f86573j = m.m("${");

    /* renamed from: k, reason: collision with root package name */
    public static final m f86574k = m.m("}");

    /* renamed from: l, reason: collision with root package name */
    public static final m f86575l = m.m(":-");

    /* renamed from: a, reason: collision with root package name */
    private char f86576a;

    /* renamed from: b, reason: collision with root package name */
    private m f86577b;

    /* renamed from: c, reason: collision with root package name */
    private m f86578c;

    /* renamed from: d, reason: collision with root package name */
    private m f86579d;

    /* renamed from: e, reason: collision with root package name */
    private l<?> f86580e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86581f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f86582g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f86583h;

    public n() {
        this((l<?>) null, f86573j, f86574k, '$');
    }

    public static String D(Object obj) {
        return new n(l.e()).l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r25v0, types: [org.apache.commons.text.n] */
    private int T(k kVar, int i4, int i5, List<String> list) {
        m mVar;
        char c5;
        boolean z4;
        int i6;
        int i7;
        int i10;
        String str;
        m d5 = d();
        m f4 = f();
        char b5 = b();
        m c6 = c();
        boolean h4 = h();
        boolean g4 = g();
        boolean z5 = list == null;
        int i11 = i4;
        int i12 = i4 + i5;
        int i13 = 0;
        int i14 = 0;
        char[] cArr = kVar.f86472b;
        ?? r13 = list;
        while (i11 < i12) {
            int g5 = d5.g(cArr, i11, i4, i12);
            if (g5 != 0) {
                if (i11 > i4) {
                    int i15 = i11 - 1;
                    z4 = z5;
                    if (cArr[i15] == b5) {
                        if (this.f86582g) {
                            i11++;
                            z5 = z4;
                        } else {
                            kVar.z0(i15);
                            i13--;
                            mVar = f4;
                            c5 = b5;
                            cArr = kVar.f86472b;
                            i6 = i12 - 1;
                            i14 = 1;
                            r13 = r13;
                        }
                    }
                } else {
                    z4 = z5;
                }
                int i16 = i11 + g5;
                int i17 = i16;
                int i18 = 0;
                while (true) {
                    if (i17 >= i12) {
                        mVar = f4;
                        c5 = b5;
                        i6 = i12;
                        i11 = i17;
                        r13 = r13;
                        break;
                    }
                    if (!h4 || d5.g(cArr, i17, i4, i12) == 0) {
                        int g6 = f4.g(cArr, i17, i4, i12);
                        if (g6 == 0) {
                            i17++;
                        } else if (i18 == 0) {
                            mVar = f4;
                            c5 = b5;
                            String str2 = new String(cArr, i16, (i17 - i11) - g5);
                            if (h4) {
                                k kVar2 = new k(str2);
                                U(kVar2, 0, kVar2.length());
                                str2 = kVar2.toString();
                            }
                            int i19 = i17 + g6;
                            if (c6 != null) {
                                char[] charArray = str2.toCharArray();
                                i7 = i12;
                                for (int i20 = 0; i20 < charArray.length && (h4 || d5.g(charArray, i20, i20, charArray.length) == 0); i20++) {
                                    if (c6.f(charArray, i20) != 0) {
                                        int f5 = c6.f(charArray, i20);
                                        i10 = 0;
                                        String substring = str2.substring(0, i20);
                                        str = str2.substring(i20 + f5);
                                        str2 = substring;
                                        break;
                                    }
                                }
                            } else {
                                i7 = i12;
                            }
                            i10 = 0;
                            str = null;
                            if (r13 == 0) {
                                r13 = new ArrayList();
                                r13.add(new String(cArr, i4, i5));
                            }
                            a(str2, r13);
                            r13.add(str2);
                            String E = E(str2, kVar, i11, i19);
                            if (E != null) {
                                str = E;
                            }
                            if (str != null) {
                                int length = str.length();
                                kVar.l1(i11, i19, str);
                                int T = ((!g4 ? T(kVar, i11, length, r13) : i10) + length) - (i19 - i11);
                                i6 = i7 + T;
                                i13 += T;
                                cArr = kVar.f86472b;
                                i11 = i19 + T;
                                i14 = 1;
                            } else {
                                i6 = i7;
                                i11 = i19;
                            }
                            r13.remove(r13.size() - 1);
                            r13 = r13;
                        } else {
                            i18--;
                            i17 += g6;
                            i12 = i12;
                        }
                    } else {
                        i18++;
                        i17 += d5.g(cArr, i17, i4, i12);
                    }
                }
            } else {
                i11++;
                mVar = f4;
                c5 = b5;
                z4 = z5;
                i6 = i12;
                r13 = r13;
            }
            i12 = i6;
            z5 = z4;
            f4 = mVar;
            b5 = c5;
        }
        return z5 ? i14 : i13;
    }

    private void a(String str, List<String> list) {
        if (list.contains(str)) {
            k kVar = new k(256);
            kVar.m("Infinite loop in property interpolation of ");
            kVar.m(list.remove(0));
            kVar.m(": ");
            kVar.R(list, "->");
            throw new IllegalStateException(kVar.toString());
        }
    }

    public static <V> String m(Object obj, Map<String, V> map) {
        return new n(map).l(obj);
    }

    public static <V> String n(Object obj, Map<String, V> map, String str, String str2) {
        return new n(map, str, str2).l(obj);
    }

    public static String o(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            hashMap.put(str, properties.getProperty(str));
        }
        return m(obj, hashMap);
    }

    public boolean A(StringBuilder sb, int i4, int i5) {
        if (sb == null) {
            return false;
        }
        k s4 = new k(i5).s(sb, i4, i5);
        if (!U(s4, 0, i5)) {
            return false;
        }
        sb.replace(i4, i5 + i4, s4.toString());
        return true;
    }

    public boolean B(k kVar) {
        if (kVar == null) {
            return false;
        }
        return U(kVar, 0, kVar.length());
    }

    public boolean C(k kVar, int i4, int i5) {
        if (kVar == null) {
            return false;
        }
        return U(kVar, i4, i5);
    }

    protected String E(String str, k kVar, int i4, int i5) {
        l<?> e4 = e();
        if (e4 == null) {
            return null;
        }
        return e4.lookup(str);
    }

    public void F(boolean z4) {
        this.f86583h = z4;
    }

    public void G(boolean z4) {
        this.f86581f = z4;
    }

    public void H(char c5) {
        this.f86576a = c5;
    }

    public void I(boolean z4) {
        this.f86582g = z4;
    }

    public n J(char c5) {
        return L(m.a(c5));
    }

    public n K(String str) {
        if (str != null && str.length() != 0) {
            return L(m.m(str));
        }
        L(null);
        return this;
    }

    public n L(m mVar) {
        this.f86579d = mVar;
        return this;
    }

    public n M(char c5) {
        return O(m.a(c5));
    }

    public n N(String str) {
        k1.B(str != null, "Variable prefix must not be null!", new Object[0]);
        return O(m.m(str));
    }

    public n O(m mVar) {
        k1.B(mVar != null, "Variable prefix matcher must not be null!", new Object[0]);
        this.f86577b = mVar;
        return this;
    }

    public void P(l<?> lVar) {
        this.f86580e = lVar;
    }

    public n Q(char c5) {
        return S(m.a(c5));
    }

    public n R(String str) {
        k1.B(str != null, "Variable suffix must not be null!", new Object[0]);
        return S(m.m(str));
    }

    public n S(m mVar) {
        k1.B(mVar != null, "Variable suffix matcher must not be null!", new Object[0]);
        this.f86578c = mVar;
        return this;
    }

    protected boolean U(k kVar, int i4, int i5) {
        return T(kVar, i4, i5, null) > 0;
    }

    public char b() {
        return this.f86576a;
    }

    public m c() {
        return this.f86579d;
    }

    public m d() {
        return this.f86577b;
    }

    public l<?> e() {
        return this.f86580e;
    }

    public m f() {
        return this.f86578c;
    }

    public boolean g() {
        return this.f86583h;
    }

    public boolean h() {
        return this.f86581f;
    }

    public boolean i() {
        return this.f86582g;
    }

    public String j(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return k(charSequence, 0, charSequence.length());
    }

    public String k(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            return null;
        }
        k append = new k(i5).append(charSequence, i4, i5);
        U(append, 0, i5);
        return append.toString();
    }

    public String l(Object obj) {
        if (obj == null) {
            return null;
        }
        k l4 = new k().l(obj);
        U(l4, 0, l4.length());
        return l4.toString();
    }

    public String p(String str) {
        if (str == null) {
            return null;
        }
        k kVar = new k(str);
        return !U(kVar, 0, str.length()) ? str : kVar.toString();
    }

    public String q(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        k n4 = new k(i5).n(str, i4, i5);
        return !U(n4, 0, i5) ? str.substring(i4, i5 + i4) : n4.toString();
    }

    public String r(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        k p4 = new k(stringBuffer.length()).p(stringBuffer);
        U(p4, 0, p4.length());
        return p4.toString();
    }

    public String s(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return null;
        }
        k q4 = new k(i5).q(stringBuffer, i4, i5);
        U(q4, 0, i5);
        return q4.toString();
    }

    public String t(k kVar) {
        if (kVar == null) {
            return null;
        }
        k v4 = new k(kVar.length()).v(kVar);
        U(v4, 0, v4.length());
        return v4.toString();
    }

    public String u(k kVar, int i4, int i5) {
        if (kVar == null) {
            return null;
        }
        k w4 = new k(i5).w(kVar, i4, i5);
        U(w4, 0, i5);
        return w4.toString();
    }

    public String v(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        k y4 = new k(cArr.length).y(cArr);
        U(y4, 0, cArr.length);
        return y4.toString();
    }

    public String w(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        k z4 = new k(i5).z(cArr, i4, i5);
        U(z4, 0, i5);
        return z4.toString();
    }

    public boolean x(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return y(stringBuffer, 0, stringBuffer.length());
    }

    public boolean y(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return false;
        }
        k q4 = new k(i5).q(stringBuffer, i4, i5);
        if (!U(q4, 0, i5)) {
            return false;
        }
        stringBuffer.replace(i4, i5 + i4, q4.toString());
        return true;
    }

    public boolean z(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return A(sb, 0, sb.length());
    }

    public <V> n(Map<String, V> map) {
        this((l<?>) l.b(map), f86573j, f86574k, '$');
    }

    public <V> n(Map<String, V> map, String str, String str2) {
        this((l<?>) l.b(map), str, str2, '$');
    }

    public <V> n(Map<String, V> map, String str, String str2, char c5) {
        this((l<?>) l.b(map), str, str2, c5);
    }

    public <V> n(Map<String, V> map, String str, String str2, char c5, String str3) {
        this((l<?>) l.b(map), str, str2, c5, str3);
    }

    public n(l<?> lVar) {
        this(lVar, f86573j, f86574k, '$');
    }

    public n(l<?> lVar, String str, String str2, char c5) {
        this.f86582g = false;
        P(lVar);
        N(str);
        R(str2);
        H(c5);
        L(f86575l);
    }

    public n(l<?> lVar, String str, String str2, char c5, String str3) {
        this.f86582g = false;
        P(lVar);
        N(str);
        R(str2);
        H(c5);
        K(str3);
    }

    public n(l<?> lVar, m mVar, m mVar2, char c5) {
        this(lVar, mVar, mVar2, c5, f86575l);
    }

    public n(l<?> lVar, m mVar, m mVar2, char c5, m mVar3) {
        this.f86582g = false;
        P(lVar);
        O(mVar);
        S(mVar2);
        H(c5);
        L(mVar3);
    }
}
