package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.b1;

/* compiled from: StrSubstitutor.java */
@Deprecated
/* loaded from: classes6.dex */
public class h {

    /* renamed from: h, reason: collision with root package name */
    public static final char f86177h = '$';

    /* renamed from: i, reason: collision with root package name */
    public static final g f86178i = g.m("${");

    /* renamed from: j, reason: collision with root package name */
    public static final g f86179j = g.m("}");

    /* renamed from: k, reason: collision with root package name */
    public static final g f86180k = g.m(":-");

    /* renamed from: a, reason: collision with root package name */
    private char f86181a;

    /* renamed from: b, reason: collision with root package name */
    private g f86182b;

    /* renamed from: c, reason: collision with root package name */
    private g f86183c;

    /* renamed from: d, reason: collision with root package name */
    private g f86184d;

    /* renamed from: e, reason: collision with root package name */
    private f<?> f86185e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86186f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f86187g;

    public h() {
        this((f<?>) null, f86178i, f86179j, '$');
    }

    public static String C(Object obj) {
        return new h(f.d()).k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [org.apache.commons.lang3.text.h] */
    private int R(e eVar, int i4, int i5, List<String> list) {
        g gVar;
        g gVar2;
        char c5;
        boolean z4;
        String str;
        int g4;
        g d5 = d();
        g f4 = f();
        char b5 = b();
        g c6 = c();
        boolean g5 = g();
        boolean z5 = list == null;
        int i6 = i4;
        int i7 = i4 + i5;
        int i10 = 0;
        int i11 = 0;
        char[] cArr = eVar.f86153b;
        ?? r12 = list;
        while (i6 < i7) {
            int g6 = d5.g(cArr, i6, i4, i7);
            if (g6 != 0) {
                if (i6 > i4) {
                    int i12 = i6 - 1;
                    if (cArr[i12] == b5) {
                        if (this.f86187g) {
                            i6++;
                        } else {
                            eVar.z0(i12);
                            i10--;
                            i7--;
                            gVar = d5;
                            gVar2 = f4;
                            c5 = b5;
                            cArr = eVar.f86153b;
                            z4 = z5;
                            i11 = 1;
                            r12 = r12;
                        }
                    }
                }
                int i13 = i6 + g6;
                int i14 = i13;
                int i15 = 0;
                while (true) {
                    if (i14 >= i7) {
                        gVar = d5;
                        gVar2 = f4;
                        c5 = b5;
                        z4 = z5;
                        i6 = i14;
                        r12 = r12;
                        break;
                    }
                    if (!g5 || (g4 = d5.g(cArr, i14, i4, i7)) == 0) {
                        int g7 = f4.g(cArr, i14, i4, i7);
                        if (g7 == 0) {
                            i14++;
                        } else if (i15 == 0) {
                            gVar2 = f4;
                            c5 = b5;
                            String str2 = new String(cArr, i13, (i14 - i6) - g6);
                            if (g5) {
                                e eVar2 = new e(str2);
                                S(eVar2, 0, eVar2.f86154c);
                                str2 = eVar2.toString();
                            }
                            int i16 = i14 + g7;
                            if (c6 != null) {
                                char[] charArray = str2.toCharArray();
                                z4 = z5;
                                int i17 = 0;
                                while (i17 < charArray.length && (g5 || d5.g(charArray, i17, i17, charArray.length) == 0)) {
                                    int f5 = c6.f(charArray, i17);
                                    if (f5 != 0) {
                                        gVar = d5;
                                        String substring = str2.substring(0, i17);
                                        str = str2.substring(i17 + f5);
                                        str2 = substring;
                                        break;
                                    }
                                    i17++;
                                    d5 = d5;
                                }
                                gVar = d5;
                            } else {
                                gVar = d5;
                                z4 = z5;
                            }
                            str = null;
                            if (r12 == 0) {
                                r12 = new ArrayList();
                                r12.add(new String(cArr, i4, i5));
                            }
                            a(str2, r12);
                            r12.add(str2);
                            String D = D(str2, eVar, i6, i16);
                            if (D != null) {
                                str = D;
                            }
                            if (str != null) {
                                int length = str.length();
                                eVar.l1(i6, i16, str);
                                int R = (R(eVar, i6, length, r12) + length) - (i16 - i6);
                                i7 += R;
                                i10 += R;
                                cArr = eVar.f86153b;
                                i6 = i16 + R;
                                i11 = 1;
                            } else {
                                i6 = i16;
                            }
                            r12.remove(r12.size() - 1);
                            r12 = r12;
                        } else {
                            i15--;
                            i14 += g7;
                            b5 = b5;
                            d5 = d5;
                        }
                    } else {
                        i15++;
                        i14 += g4;
                    }
                }
            } else {
                i6++;
                gVar = d5;
                gVar2 = f4;
                c5 = b5;
                z4 = z5;
                r12 = r12;
            }
            f4 = gVar2;
            b5 = c5;
            z5 = z4;
            d5 = gVar;
        }
        return z5 ? i11 : i10;
    }

    private void a(String str, List<String> list) {
        if (list.contains(str)) {
            e eVar = new e(256);
            eVar.m("Infinite loop in property interpolation of ");
            eVar.m(list.remove(0));
            eVar.m(": ");
            eVar.R(list, "->");
            throw new IllegalStateException(eVar.toString());
        }
    }

    public static <V> String l(Object obj, Map<String, V> map) {
        return new h(map).k(obj);
    }

    public static <V> String m(Object obj, Map<String, V> map, String str, String str2) {
        return new h(map, str, str2).k(obj);
    }

    public static String n(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            hashMap.put(str, properties.getProperty(str));
        }
        return l(obj, hashMap);
    }

    public boolean A(e eVar) {
        if (eVar == null) {
            return false;
        }
        return S(eVar, 0, eVar.length());
    }

    public boolean B(e eVar, int i4, int i5) {
        if (eVar == null) {
            return false;
        }
        return S(eVar, i4, i5);
    }

    protected String D(String str, e eVar, int i4, int i5) {
        f<?> e4 = e();
        if (e4 == null) {
            return null;
        }
        return e4.a(str);
    }

    public void E(boolean z4) {
        this.f86186f = z4;
    }

    public void F(char c5) {
        this.f86181a = c5;
    }

    public void G(boolean z4) {
        this.f86187g = z4;
    }

    public h H(char c5) {
        return J(g.a(c5));
    }

    public h I(String str) {
        if (!b1.G0(str)) {
            return J(g.m(str));
        }
        J(null);
        return this;
    }

    public h J(g gVar) {
        this.f86184d = gVar;
        return this;
    }

    public h K(char c5) {
        return M(g.a(c5));
    }

    public h L(String str) {
        if (str != null) {
            return M(g.m(str));
        }
        throw new IllegalArgumentException("Variable prefix must not be null.");
    }

    public h M(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null.");
        }
        this.f86182b = gVar;
        return this;
    }

    public void N(f<?> fVar) {
        this.f86185e = fVar;
    }

    public h O(char c5) {
        return Q(g.a(c5));
    }

    public h P(String str) {
        if (str != null) {
            return Q(g.m(str));
        }
        throw new IllegalArgumentException("Variable suffix must not be null.");
    }

    public h Q(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null.");
        }
        this.f86183c = gVar;
        return this;
    }

    protected boolean S(e eVar, int i4, int i5) {
        return R(eVar, i4, i5, null) > 0;
    }

    public char b() {
        return this.f86181a;
    }

    public g c() {
        return this.f86184d;
    }

    public g d() {
        return this.f86182b;
    }

    public f<?> e() {
        return this.f86185e;
    }

    public g f() {
        return this.f86183c;
    }

    public boolean g() {
        return this.f86186f;
    }

    public boolean h() {
        return this.f86187g;
    }

    public String i(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return j(charSequence, 0, charSequence.length());
    }

    public String j(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            return null;
        }
        e append = new e(i5).append(charSequence, i4, i5);
        S(append, 0, i5);
        return append.toString();
    }

    public String k(Object obj) {
        if (obj == null) {
            return null;
        }
        e l4 = new e().l(obj);
        S(l4, 0, l4.length());
        return l4.toString();
    }

    public String o(String str) {
        if (str == null) {
            return null;
        }
        e eVar = new e(str);
        return !S(eVar, 0, str.length()) ? str : eVar.toString();
    }

    public String p(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        e n4 = new e(i5).n(str, i4, i5);
        return !S(n4, 0, i5) ? str.substring(i4, i5 + i4) : n4.toString();
    }

    public String q(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        e p4 = new e(stringBuffer.length()).p(stringBuffer);
        S(p4, 0, p4.length());
        return p4.toString();
    }

    public String r(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return null;
        }
        e q4 = new e(i5).q(stringBuffer, i4, i5);
        S(q4, 0, i5);
        return q4.toString();
    }

    public String s(e eVar) {
        if (eVar == null) {
            return null;
        }
        e v4 = new e(eVar.length()).v(eVar);
        S(v4, 0, v4.length());
        return v4.toString();
    }

    public String t(e eVar, int i4, int i5) {
        if (eVar == null) {
            return null;
        }
        e w4 = new e(i5).w(eVar, i4, i5);
        S(w4, 0, i5);
        return w4.toString();
    }

    public String u(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        e y4 = new e(cArr.length).y(cArr);
        S(y4, 0, cArr.length);
        return y4.toString();
    }

    public String v(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        e z4 = new e(i5).z(cArr, i4, i5);
        S(z4, 0, i5);
        return z4.toString();
    }

    public boolean w(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return x(stringBuffer, 0, stringBuffer.length());
    }

    public boolean x(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return false;
        }
        e q4 = new e(i5).q(stringBuffer, i4, i5);
        if (!S(q4, 0, i5)) {
            return false;
        }
        stringBuffer.replace(i4, i5 + i4, q4.toString());
        return true;
    }

    public boolean y(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return z(sb, 0, sb.length());
    }

    public boolean z(StringBuilder sb, int i4, int i5) {
        if (sb == null) {
            return false;
        }
        e s4 = new e(i5).s(sb, i4, i5);
        if (!S(s4, 0, i5)) {
            return false;
        }
        sb.replace(i4, i5 + i4, s4.toString());
        return true;
    }

    public <V> h(Map<String, V> map) {
        this((f<?>) f.b(map), f86178i, f86179j, '$');
    }

    public <V> h(Map<String, V> map, String str, String str2) {
        this((f<?>) f.b(map), str, str2, '$');
    }

    public <V> h(Map<String, V> map, String str, String str2, char c5) {
        this((f<?>) f.b(map), str, str2, c5);
    }

    public <V> h(Map<String, V> map, String str, String str2, char c5, String str3) {
        this((f<?>) f.b(map), str, str2, c5, str3);
    }

    public h(f<?> fVar) {
        this(fVar, f86178i, f86179j, '$');
    }

    public h(f<?> fVar, String str, String str2, char c5) {
        this.f86187g = false;
        N(fVar);
        L(str);
        P(str2);
        F(c5);
        J(f86180k);
    }

    public h(f<?> fVar, String str, String str2, char c5, String str3) {
        this.f86187g = false;
        N(fVar);
        L(str);
        P(str2);
        F(c5);
        I(str3);
    }

    public h(f<?> fVar, g gVar, g gVar2, char c5) {
        this(fVar, gVar, gVar2, c5, f86180k);
    }

    public h(f<?> fVar, g gVar, g gVar2, char c5, g gVar3) {
        this.f86187g = false;
        N(fVar);
        M(gVar);
        Q(gVar2);
        F(c5);
        J(gVar3);
    }
}
