package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: StringTokenizer.java */
/* loaded from: classes3.dex */
public class r implements ListIterator<String>, Cloneable {

    /* renamed from: k, reason: collision with root package name */
    private static final r f86633k;

    /* renamed from: l, reason: collision with root package name */
    private static final r f86634l;

    /* renamed from: b, reason: collision with root package name */
    private char[] f86635b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f86636c;

    /* renamed from: d, reason: collision with root package name */
    private int f86637d;

    /* renamed from: e, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86638e;

    /* renamed from: f, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86639f;

    /* renamed from: g, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86640g;

    /* renamed from: h, reason: collision with root package name */
    private org.apache.commons.text.matcher.b f86641h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86642i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86643j;

    static {
        r rVar = new r();
        f86633k = rVar;
        org.apache.commons.text.matcher.c cVar = org.apache.commons.text.matcher.c.f86564c;
        rVar.M(cVar.e());
        rVar.U(cVar.f());
        rVar.S(cVar.g());
        rVar.V(cVar.o());
        rVar.O(false);
        rVar.P(false);
        r rVar2 = new r();
        f86634l = rVar2;
        rVar2.M(cVar.n());
        rVar2.U(cVar.f());
        rVar2.S(cVar.g());
        rVar2.V(cVar.o());
        rVar2.O(false);
        rVar2.P(false);
    }

    public r() {
        org.apache.commons.text.matcher.c cVar = org.apache.commons.text.matcher.c.f86564c;
        this.f86638e = cVar.k();
        this.f86639f = cVar.g();
        this.f86640g = cVar.g();
        this.f86641h = cVar.g();
        this.f86642i = false;
        this.f86643j = true;
        this.f86635b = null;
    }

    private boolean A(char[] cArr, int i4, int i5, int i6, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = i4 + i10;
            if (i11 >= i5 || cArr[i11] != cArr[i6 + i10]) {
                return false;
            }
        }
        return true;
    }

    private int E(char[] cArr, int i4, int i5, t tVar, List<String> list) {
        while (i4 < i5) {
            int max = Math.max(n().b(cArr, i4, i4, i5), w().b(cArr, i4, i4, i5));
            if (max == 0 || m().b(cArr, i4, i4, i5) > 0 || o().b(cArr, i4, i4, i5) > 0) {
                break;
            }
            i4 += max;
        }
        if (i4 >= i5) {
            c(list, "");
            return -1;
        }
        int b5 = m().b(cArr, i4, i4, i5);
        if (b5 > 0) {
            c(list, "");
            return i4 + b5;
        }
        int b6 = o().b(cArr, i4, i4, i5);
        return b6 > 0 ? F(cArr, i4 + b6, i5, tVar, list, i4, b6) : F(cArr, i4, i5, tVar, list, 0, 0);
    }

    private int F(char[] cArr, int i4, int i5, t tVar, List<String> list, int i6, int i7) {
        tVar.t0();
        boolean z4 = i7 > 0;
        int i10 = i4;
        int i11 = 0;
        while (i10 < i5) {
            if (z4) {
                int i12 = i11;
                int i13 = i10;
                if (A(cArr, i10, i5, i6, i7)) {
                    int i14 = i13 + i7;
                    if (A(cArr, i14, i5, i6, i7)) {
                        tVar.z(cArr, i13, i7);
                        i10 = (i7 * 2) + i13;
                        i11 = tVar.N1();
                    } else {
                        i11 = i12;
                        i10 = i14;
                        z4 = false;
                    }
                } else {
                    i10 = i13 + 1;
                    tVar.append(cArr[i13]);
                    i11 = tVar.N1();
                }
            } else {
                int i15 = i11;
                int i16 = i10;
                int b5 = m().b(cArr, i16, i4, i5);
                if (b5 > 0) {
                    c(list, tVar.Q1(0, i15));
                    return i16 + b5;
                }
                if (i7 <= 0 || !A(cArr, i16, i5, i6, i7)) {
                    int b6 = n().b(cArr, i16, i4, i5);
                    if (b6 <= 0) {
                        b6 = w().b(cArr, i16, i4, i5);
                        if (b6 > 0) {
                            tVar.z(cArr, i16, b6);
                        } else {
                            i10 = i16 + 1;
                            tVar.append(cArr[i16]);
                            i11 = tVar.N1();
                        }
                    }
                    i10 = i16 + b6;
                    i11 = i15;
                } else {
                    i10 = i16 + i7;
                    i11 = i15;
                    z4 = true;
                }
            }
        }
        c(list, tVar.Q1(0, i11));
        return -1;
    }

    private void c(List<String> list, String str) {
        if (str == null || str.length() == 0) {
            if (z()) {
                return;
            }
            if (y()) {
                str = null;
            }
        }
        list.add(str);
    }

    private void d() {
        if (this.f86636c == null) {
            char[] cArr = this.f86635b;
            if (cArr == null) {
                List<String> Y = Y(null, 0, 0);
                this.f86636c = (String[]) Y.toArray(new String[Y.size()]);
            } else {
                List<String> Y2 = Y(cArr, 0, cArr.length);
                this.f86636c = (String[]) Y2.toArray(new String[Y2.size()]);
            }
        }
    }

    private static r f() {
        return (r) f86633k.clone();
    }

    public static r g() {
        return f();
    }

    public static r i(String str) {
        r f4 = f();
        f4.H(str);
        return f4;
    }

    public static r k(char[] cArr) {
        r f4 = f();
        f4.I(cArr);
        return f4;
    }

    private static r p() {
        return (r) f86634l.clone();
    }

    public static r r() {
        return p();
    }

    public static r s(String str) {
        r p4 = p();
        p4.H(str);
        return p4;
    }

    public static r t(char[] cArr) {
        r p4 = p();
        p4.I(cArr);
        return p4;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86636c;
        int i4 = this.f86637d;
        this.f86637d = i4 + 1;
        return strArr[i4];
    }

    @Override // java.util.ListIterator
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86636c;
        int i4 = this.f86637d - 1;
        this.f86637d = i4;
        return strArr[i4];
    }

    public String D() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.f86636c;
        int i4 = this.f86637d - 1;
        this.f86637d = i4;
        return strArr[i4];
    }

    public r G() {
        this.f86637d = 0;
        this.f86636c = null;
        return this;
    }

    public r H(String str) {
        G();
        if (str != null) {
            this.f86635b = str.toCharArray();
        } else {
            this.f86635b = null;
        }
        return this;
    }

    public r I(char[] cArr) {
        G();
        if (cArr != null) {
            this.f86635b = (char[]) cArr.clone();
        } else {
            this.f86635b = null;
        }
        return this;
    }

    @Override // java.util.ListIterator
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public r K(char c5) {
        return M(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public r M(org.apache.commons.text.matcher.b bVar) {
        if (bVar == null) {
            this.f86638e = org.apache.commons.text.matcher.c.f86564c.g();
        } else {
            this.f86638e = bVar;
        }
        return this;
    }

    public r N(String str) {
        return M(org.apache.commons.text.matcher.c.f86564c.l(str));
    }

    public r O(boolean z4) {
        this.f86642i = z4;
        return this;
    }

    public r P(boolean z4) {
        this.f86643j = z4;
        return this;
    }

    public r R(char c5) {
        return S(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public r S(org.apache.commons.text.matcher.b bVar) {
        if (bVar != null) {
            this.f86640g = bVar;
        }
        return this;
    }

    public r T(char c5) {
        return U(org.apache.commons.text.matcher.c.f86564c.b(c5));
    }

    public r U(org.apache.commons.text.matcher.b bVar) {
        if (bVar != null) {
            this.f86639f = bVar;
        }
        return this;
    }

    public r V(org.apache.commons.text.matcher.b bVar) {
        if (bVar != null) {
            this.f86641h = bVar;
        }
        return this;
    }

    public int W() {
        d();
        return this.f86636c.length;
    }

    protected List<String> Y(char[] cArr, int i4, int i5) {
        if (cArr == null || i5 == 0) {
            return Collections.emptyList();
        }
        t tVar = new t();
        ArrayList arrayList = new ArrayList();
        int i6 = i4;
        while (i6 >= 0 && i6 < i5) {
            i6 = E(cArr, i6, i5, tVar, arrayList);
            if (i6 >= i5) {
                c(arrayList, "");
            }
        }
        return arrayList;
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public Object clone() {
        try {
            return e();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    Object e() throws CloneNotSupportedException {
        r rVar = (r) super.clone();
        char[] cArr = rVar.f86635b;
        if (cArr != null) {
            rVar.f86635b = (char[]) cArr.clone();
        }
        rVar.G();
        return rVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        d();
        return this.f86637d < this.f86636c.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        d();
        return this.f86637d > 0;
    }

    public String l() {
        char[] cArr = this.f86635b;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public org.apache.commons.text.matcher.b m() {
        return this.f86638e;
    }

    public org.apache.commons.text.matcher.b n() {
        return this.f86640g;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f86637d;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.f86636c;
        int i4 = this.f86637d;
        this.f86637d = i4 + 1;
        return strArr[i4];
    }

    public org.apache.commons.text.matcher.b o() {
        return this.f86639f;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f86637d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public String toString() {
        if (this.f86636c == null) {
            return "StringTokenizer[not tokenized yet]";
        }
        return "StringTokenizer" + v();
    }

    public String[] u() {
        d();
        return (String[]) this.f86636c.clone();
    }

    public List<String> v() {
        d();
        ArrayList arrayList = new ArrayList(this.f86636c.length);
        Collections.addAll(arrayList, this.f86636c);
        return arrayList;
    }

    public org.apache.commons.text.matcher.b w() {
        return this.f86641h;
    }

    public boolean y() {
        return this.f86642i;
    }

    public boolean z() {
        return this.f86643j;
    }

    public r(String str) {
        org.apache.commons.text.matcher.c cVar = org.apache.commons.text.matcher.c.f86564c;
        this.f86638e = cVar.k();
        this.f86639f = cVar.g();
        this.f86640g = cVar.g();
        this.f86641h = cVar.g();
        this.f86642i = false;
        this.f86643j = true;
        if (str != null) {
            this.f86635b = str.toCharArray();
        } else {
            this.f86635b = null;
        }
    }

    public r(String str, char c5) {
        this(str);
        K(c5);
    }

    public r(String str, String str2) {
        this(str);
        N(str2);
    }

    public r(String str, org.apache.commons.text.matcher.b bVar) {
        this(str);
        M(bVar);
    }

    public r(String str, char c5, char c6) {
        this(str, c5);
        T(c6);
    }

    public r(String str, org.apache.commons.text.matcher.b bVar, org.apache.commons.text.matcher.b bVar2) {
        this(str, bVar);
        U(bVar2);
    }

    public r(char[] cArr) {
        org.apache.commons.text.matcher.c cVar = org.apache.commons.text.matcher.c.f86564c;
        this.f86638e = cVar.k();
        this.f86639f = cVar.g();
        this.f86640g = cVar.g();
        this.f86641h = cVar.g();
        this.f86642i = false;
        this.f86643j = true;
        if (cArr == null) {
            this.f86635b = null;
        } else {
            this.f86635b = (char[]) cArr.clone();
        }
    }

    public r(char[] cArr, char c5) {
        this(cArr);
        K(c5);
    }

    public r(char[] cArr, String str) {
        this(cArr);
        N(str);
    }

    public r(char[] cArr, org.apache.commons.text.matcher.b bVar) {
        this(cArr);
        M(bVar);
    }

    public r(char[] cArr, char c5, char c6) {
        this(cArr, c5);
        T(c6);
    }

    public r(char[] cArr, org.apache.commons.text.matcher.b bVar, org.apache.commons.text.matcher.b bVar2) {
        this(cArr, bVar);
        U(bVar2);
    }
}
