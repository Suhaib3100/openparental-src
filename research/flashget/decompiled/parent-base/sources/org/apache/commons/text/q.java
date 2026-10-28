package org.apache.commons.text;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.k1;
import org.apache.commons.text.lookup.b0;

/* compiled from: StringSubstitutor.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    public static final char f86615j = '$';

    /* renamed from: k, reason: collision with root package name */
    public static final String f86616k = ":-";

    /* renamed from: l, reason: collision with root package name */
    public static final String f86617l = "}";

    /* renamed from: m, reason: collision with root package name */
    public static final String f86618m = "${";

    /* renamed from: n, reason: collision with root package name */
    public static final org.apache.commons.text.matcher.b f86619n;

    /* renamed from: o, reason: collision with root package name */
    public static final org.apache.commons.text.matcher.b f86620o;

    /* renamed from: p, reason: collision with root package name */
    public static final org.apache.commons.text.matcher.b f86621p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f86622a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f86623b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86624c;

    /* renamed from: d, reason: collision with root package name */
    private char f86625d;

    /* renamed from: e, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86626e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86627f;

    /* renamed from: g, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86628g;

    /* renamed from: h, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86629h;

    /* renamed from: i, reason: collision with root package name */
    private org.apache.commons.text.lookup.t f86630i;

    /* compiled from: StringSubstitutor.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f86631a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86632b;

        public String toString() {
            StringBuilder sb = new StringBuilder("Result [altered=");
            sb.append(this.f86631a);
            sb.append(", lengthChange=");
            return android.support.v4.media.b.a(sb, this.f86632b, "]");
        }

        private b(boolean z4, int i4) {
            this.f86631a = z4;
            this.f86632b = i4;
        }
    }

    static {
        org.apache.commons.text.matcher.c cVar = org.apache.commons.text.matcher.c.f86564c;
        f86619n = cVar.l("${");
        f86620o = cVar.l("}");
        f86621p = cVar.l(":-");
    }

    public q() {
        this((org.apache.commons.text.lookup.t) null, f86619n, f86620o, '$');
    }

    public static String F(Object obj) {
        return new q(b0.f86488a.E()).n(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v0, types: [org.apache.commons.text.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.commons.text.q.b W(org.apache.commons.text.t r26, int r27, int r28, java.util.List<java.lang.String> r29) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.q.W(org.apache.commons.text.t, int, int, java.util.List):org.apache.commons.text.q$b");
    }

    private void a(String str, List<String> list) {
        if (list.contains(str)) {
            t tVar = new t(256);
            tVar.m("Infinite loop in property interpolation of ");
            tVar.m(list.remove(0));
            tVar.m(": ");
            tVar.T(list, "->");
            throw new IllegalStateException(tVar.toString());
        }
    }

    public static q b() {
        return new q(b0.f86488a.p());
    }

    public static <V> String o(Object obj, Map<String, V> map) {
        return new q(map).n(obj);
    }

    public static <V> String p(Object obj, Map<String, V> map, String str, String str2) {
        return new q(map, str, str2).n(obj);
    }

    public static String q(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap hashMap = new HashMap();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            hashMap.put(str, properties.getProperty(str));
        }
        return o(obj, hashMap);
    }

    public boolean A(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return false;
        }
        t q4 = new t(i5).q(stringBuffer, i4, i5);
        if (!X(q4, 0, i5)) {
            return false;
        }
        stringBuffer.replace(i4, i5 + i4, q4.toString());
        return true;
    }

    public boolean B(StringBuilder sb) {
        if (sb == null) {
            return false;
        }
        return C(sb, 0, sb.length());
    }

    public boolean C(StringBuilder sb, int i4, int i5) {
        if (sb == null) {
            return false;
        }
        t s4 = new t(i5).s(sb, i4, i5);
        if (!X(s4, 0, i5)) {
            return false;
        }
        sb.replace(i4, i5 + i4, s4.toString());
        return true;
    }

    public boolean D(t tVar) {
        if (tVar == null) {
            return false;
        }
        return X(tVar, 0, tVar.length());
    }

    public boolean E(t tVar, int i4, int i5) {
        if (tVar == null) {
            return false;
        }
        return X(tVar, i4, i5);
    }

    protected String G(String str, t tVar, int i4, int i5) {
        org.apache.commons.text.lookup.t d5 = d();
        if (d5 == null) {
            return null;
        }
        return d5.lookup(str);
    }

    public q H(boolean z4) {
        this.f86622a = z4;
        return this;
    }

    public q I(boolean z4) {
        this.f86623b = z4;
        return this;
    }

    public q J(boolean z4) {
        this.f86624c = z4;
        return this;
    }

    public q K(char c5) {
        this.f86625d = c5;
        return this;
    }

    public q L(boolean z4) {
        this.f86627f = z4;
        return this;
    }

    public q M(char c5) {
        return O(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public q N(String str) {
        if (str != null && str.length() != 0) {
            return O(org.apache.commons.text.matcher.c.f86564c.l(str));
        }
        O(null);
        return this;
    }

    public q O(org.apache.commons.text.matcher.b bVar) {
        this.f86629h = bVar;
        return this;
    }

    public q P(char c5) {
        return R(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public q Q(String str) {
        k1.B(str != null, "Variable prefix must not be null!", new Object[0]);
        return R(org.apache.commons.text.matcher.c.f86564c.l(str));
    }

    public q R(org.apache.commons.text.matcher.b bVar) {
        k1.B(bVar != null, "Variable prefix matcher must not be null!", new Object[0]);
        this.f86626e = bVar;
        return this;
    }

    public q S(org.apache.commons.text.lookup.t tVar) {
        this.f86630i = tVar;
        return this;
    }

    public q T(char c5) {
        return V(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public q U(String str) {
        k1.B(str != null, "Variable suffix must not be null!", new Object[0]);
        return V(org.apache.commons.text.matcher.c.f86564c.l(str));
    }

    public q V(org.apache.commons.text.matcher.b bVar) {
        k1.B(bVar != null, "Variable suffix matcher must not be null!", new Object[0]);
        this.f86628g = bVar;
        return this;
    }

    protected boolean X(t tVar, int i4, int i5) {
        return W(tVar, i4, i5, null).f86631a;
    }

    public char c() {
        return this.f86625d;
    }

    public org.apache.commons.text.lookup.t d() {
        return this.f86630i;
    }

    public org.apache.commons.text.matcher.b e() {
        return this.f86629h;
    }

    public org.apache.commons.text.matcher.b f() {
        return this.f86626e;
    }

    public org.apache.commons.text.matcher.b g() {
        return this.f86628g;
    }

    public boolean h() {
        return this.f86622a;
    }

    public boolean i() {
        return this.f86623b;
    }

    public boolean j() {
        return this.f86624c;
    }

    public boolean k() {
        return this.f86627f;
    }

    public String l(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return m(charSequence, 0, charSequence.length());
    }

    public String m(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            return null;
        }
        t n4 = new t(i5).n(charSequence.toString(), i4, i5);
        X(n4, 0, i5);
        return n4.toString();
    }

    public String n(Object obj) {
        if (obj == null) {
            return null;
        }
        t l4 = new t().l(obj);
        X(l4, 0, l4.length());
        return l4.toString();
    }

    public String r(String str) {
        if (str == null) {
            return null;
        }
        t tVar = new t(str);
        return !X(tVar, 0, str.length()) ? str : tVar.toString();
    }

    public String s(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        t n4 = new t(i5).n(str, i4, i5);
        return !X(n4, 0, i5) ? str.substring(i4, i5 + i4) : n4.toString();
    }

    public String t(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        t p4 = new t(stringBuffer.length()).p(stringBuffer);
        X(p4, 0, p4.length());
        return p4.toString();
    }

    public String u(StringBuffer stringBuffer, int i4, int i5) {
        if (stringBuffer == null) {
            return null;
        }
        t q4 = new t(i5).q(stringBuffer, i4, i5);
        X(q4, 0, i5);
        return q4.toString();
    }

    public String v(t tVar) {
        if (tVar == null) {
            return null;
        }
        t v4 = new t(tVar.length()).v(tVar);
        X(v4, 0, v4.length());
        return v4.toString();
    }

    public String w(t tVar, int i4, int i5) {
        if (tVar == null) {
            return null;
        }
        t w4 = new t(i5).w(tVar, i4, i5);
        X(w4, 0, i5);
        return w4.toString();
    }

    public String x(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        t y4 = new t(cArr.length).y(cArr);
        X(y4, 0, cArr.length);
        return y4.toString();
    }

    public String y(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        t z4 = new t(i5).z(cArr, i4, i5);
        X(z4, 0, i5);
        return z4.toString();
    }

    public boolean z(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return A(stringBuffer, 0, stringBuffer.length());
    }

    public <V> q(Map<String, V> map) {
        this(b0.f86488a.y(map), f86619n, f86620o, '$');
    }

    public <V> q(Map<String, V> map, String str, String str2) {
        this(b0.f86488a.y(map), str, str2, '$');
    }

    public <V> q(Map<String, V> map, String str, String str2, char c5) {
        this(b0.f86488a.y(map), str, str2, c5);
    }

    public <V> q(Map<String, V> map, String str, String str2, char c5, String str3) {
        this(b0.f86488a.y(map), str, str2, c5, str3);
    }

    public q(org.apache.commons.text.lookup.t tVar) {
        this(tVar, f86619n, f86620o, '$');
    }

    public q(org.apache.commons.text.lookup.t tVar, String str, String str2, char c5) {
        S(tVar);
        Q(str);
        U(str2);
        K(c5);
        O(f86621p);
    }

    public q(org.apache.commons.text.lookup.t tVar, String str, String str2, char c5, String str3) {
        S(tVar);
        Q(str);
        U(str2);
        K(c5);
        N(str3);
    }

    public q(org.apache.commons.text.lookup.t tVar, org.apache.commons.text.matcher.b bVar, org.apache.commons.text.matcher.b bVar2, char c5) {
        this(tVar, bVar, bVar2, c5, f86621p);
    }

    public q(org.apache.commons.text.lookup.t tVar, org.apache.commons.text.matcher.b bVar, org.apache.commons.text.matcher.b bVar2, char c5, org.apache.commons.text.matcher.b bVar3) {
        S(tVar);
        R(bVar);
        V(bVar2);
        K(c5);
        O(bVar3);
    }

    public q(q qVar) {
        this.f86622a = qVar.h();
        this.f86623b = qVar.i();
        this.f86624c = qVar.j();
        this.f86625d = qVar.c();
        this.f86626e = qVar.f();
        this.f86627f = qVar.k();
        this.f86628g = qVar.g();
        this.f86629h = qVar.e();
        this.f86630i = qVar.d();
    }
}
