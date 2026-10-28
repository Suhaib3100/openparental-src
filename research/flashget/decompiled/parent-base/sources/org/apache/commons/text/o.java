package org.apache.commons.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: StrTokenizer.java */
@Deprecated
/* loaded from: classes3.dex */
public class o implements ListIterator<String>, Cloneable {

    /* renamed from: k, reason: collision with root package name */
    private static final o f86584k;

    /* renamed from: l, reason: collision with root package name */
    private static final o f86585l;

    /* renamed from: b, reason: collision with root package name */
    private char[] f86586b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f86587c;

    /* renamed from: d, reason: collision with root package name */
    private int f86588d;

    /* renamed from: e, reason: collision with root package name */
    private m f86589e;

    /* renamed from: f, reason: collision with root package name */
    private m f86590f;

    /* renamed from: g, reason: collision with root package name */
    private m f86591g;

    /* renamed from: h, reason: collision with root package name */
    private m f86592h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86593i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86594j;

    static {
        o oVar = new o();
        f86584k = oVar;
        oVar.M(m.d());
        oVar.U(m.e());
        oVar.S(m.h());
        oVar.V(m.o());
        oVar.O(false);
        oVar.P(false);
        o oVar2 = new o();
        f86585l = oVar2;
        oVar2.M(m.n());
        oVar2.U(m.e());
        oVar2.S(m.h());
        oVar2.V(m.o());
        oVar2.O(false);
        oVar2.P(false);
    }

    public o() {
        this.f86589e = m.l();
        this.f86590f = m.h();
        this.f86591g = m.h();
        this.f86592h = m.h();
        this.f86593i = false;
        this.f86594j = true;
        this.f86586b = null;
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

    private int E(char[] cArr, int i4, int i5, k kVar, List<String> list) {
        while (i4 < i5) {
            int max = Math.max(n().g(cArr, i4, i4, i5), w().g(cArr, i4, i4, i5));
            if (max == 0 || m().g(cArr, i4, i4, i5) > 0 || o().g(cArr, i4, i4, i5) > 0) {
                break;
            }
            i4 += max;
        }
        if (i4 >= i5) {
            c(list, "");
            return -1;
        }
        int g4 = m().g(cArr, i4, i4, i5);
        if (g4 > 0) {
            c(list, "");
            return i4 + g4;
        }
        int g5 = o().g(cArr, i4, i4, i5);
        return g5 > 0 ? F(cArr, i4 + g5, i5, kVar, list, i4, g5) : F(cArr, i4, i5, kVar, list, 0, 0);
    }

    private int F(char[] cArr, int i4, int i5, k kVar, List<String> list, int i6, int i7) {
        kVar.r0();
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
                        kVar.z(cArr, i13, i7);
                        i10 = (i7 * 2) + i13;
                        i11 = kVar.B1();
                    } else {
                        i11 = i12;
                        i10 = i14;
                        z4 = false;
                    }
                } else {
                    i10 = i13 + 1;
                    kVar.append(cArr[i13]);
                    i11 = kVar.B1();
                }
            } else {
                int i15 = i11;
                int i16 = i10;
                int g4 = m().g(cArr, i16, i4, i5);
                if (g4 > 0) {
                    c(list, kVar.E1(0, i15));
                    return i16 + g4;
                }
                if (i7 <= 0 || !A(cArr, i16, i5, i6, i7)) {
                    int g5 = n().g(cArr, i16, i4, i5);
                    if (g5 <= 0) {
                        g5 = w().g(cArr, i16, i4, i5);
                        if (g5 > 0) {
                            kVar.z(cArr, i16, g5);
                        } else {
                            i10 = i16 + 1;
                            kVar.append(cArr[i16]);
                            i11 = kVar.B1();
                        }
                    }
                    i10 = i16 + g5;
                    i11 = i15;
                } else {
                    i10 = i16 + i7;
                    i11 = i15;
                    z4 = true;
                }
            }
        }
        c(list, kVar.E1(0, i11));
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
        if (this.f86587c == null) {
            char[] cArr = this.f86586b;
            if (cArr == null) {
                List<String> Y = Y(null, 0, 0);
                this.f86587c = (String[]) Y.toArray(new String[Y.size()]);
            } else {
                List<String> Y2 = Y(cArr, 0, cArr.length);
                this.f86587c = (String[]) Y2.toArray(new String[Y2.size()]);
            }
        }
    }

    private static o f() {
        return (o) f86584k.clone();
    }

    public static o g() {
        return f();
    }

    public static o i(String str) {
        o f4 = f();
        f4.H(str);
        return f4;
    }

    public static o k(char[] cArr) {
        o f4 = f();
        f4.I(cArr);
        return f4;
    }

    private static o p() {
        return (o) f86585l.clone();
    }

    public static o r() {
        return p();
    }

    public static o s(String str) {
        o p4 = p();
        p4.H(str);
        return p4;
    }

    public static o t(char[] cArr) {
        o p4 = p();
        p4.I(cArr);
        return p4;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86587c;
        int i4 = this.f86588d;
        this.f86588d = i4 + 1;
        return strArr[i4];
    }

    @Override // java.util.ListIterator
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86587c;
        int i4 = this.f86588d - 1;
        this.f86588d = i4;
        return strArr[i4];
    }

    public String D() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.f86587c;
        int i4 = this.f86588d - 1;
        this.f86588d = i4;
        return strArr[i4];
    }

    public o G() {
        this.f86588d = 0;
        this.f86587c = null;
        return this;
    }

    public o H(String str) {
        G();
        if (str != null) {
            this.f86586b = str.toCharArray();
        } else {
            this.f86586b = null;
        }
        return this;
    }

    public o I(char[] cArr) {
        G();
        if (cArr != null) {
            this.f86586b = (char[]) cArr.clone();
        } else {
            this.f86586b = null;
        }
        return this;
    }

    @Override // java.util.ListIterator
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public o K(char c5) {
        return M(m.a(c5));
    }

    public o M(m mVar) {
        if (mVar == null) {
            this.f86589e = m.h();
        } else {
            this.f86589e = mVar;
        }
        return this;
    }

    public o N(String str) {
        return M(m.m(str));
    }

    public o O(boolean z4) {
        this.f86593i = z4;
        return this;
    }

    public o P(boolean z4) {
        this.f86594j = z4;
        return this;
    }

    public o R(char c5) {
        return S(m.a(c5));
    }

    public o S(m mVar) {
        if (mVar != null) {
            this.f86591g = mVar;
        }
        return this;
    }

    public o T(char c5) {
        return U(m.a(c5));
    }

    public o U(m mVar) {
        if (mVar != null) {
            this.f86590f = mVar;
        }
        return this;
    }

    public o V(m mVar) {
        if (mVar != null) {
            this.f86592h = mVar;
        }
        return this;
    }

    public int W() {
        d();
        return this.f86587c.length;
    }

    protected List<String> Y(char[] cArr, int i4, int i5) {
        if (cArr == null || i5 == 0) {
            return Collections.emptyList();
        }
        k kVar = new k();
        ArrayList arrayList = new ArrayList();
        int i6 = i4;
        while (i6 >= 0 && i6 < i5) {
            i6 = E(cArr, i6, i5, kVar, arrayList);
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
        o oVar = (o) super.clone();
        char[] cArr = oVar.f86586b;
        if (cArr != null) {
            oVar.f86586b = (char[]) cArr.clone();
        }
        oVar.G();
        return oVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        d();
        return this.f86588d < this.f86587c.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        d();
        return this.f86588d > 0;
    }

    public String l() {
        char[] cArr = this.f86586b;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public m m() {
        return this.f86589e;
    }

    public m n() {
        return this.f86591g;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f86588d;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.f86587c;
        int i4 = this.f86588d;
        this.f86588d = i4 + 1;
        return strArr[i4];
    }

    public m o() {
        return this.f86590f;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f86588d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public String toString() {
        if (this.f86587c == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + v();
    }

    public String[] u() {
        d();
        return (String[]) this.f86587c.clone();
    }

    public List<String> v() {
        d();
        ArrayList arrayList = new ArrayList(this.f86587c.length);
        Collections.addAll(arrayList, this.f86587c);
        return arrayList;
    }

    public m w() {
        return this.f86592h;
    }

    public boolean y() {
        return this.f86593i;
    }

    public boolean z() {
        return this.f86594j;
    }

    public o(String str) {
        this.f86589e = m.l();
        this.f86590f = m.h();
        this.f86591g = m.h();
        this.f86592h = m.h();
        this.f86593i = false;
        this.f86594j = true;
        if (str != null) {
            this.f86586b = str.toCharArray();
        } else {
            this.f86586b = null;
        }
    }

    public o(String str, char c5) {
        this(str);
        K(c5);
    }

    public o(String str, String str2) {
        this(str);
        N(str2);
    }

    public o(String str, m mVar) {
        this(str);
        M(mVar);
    }

    public o(String str, char c5, char c6) {
        this(str, c5);
        T(c6);
    }

    public o(String str, m mVar, m mVar2) {
        this(str, mVar);
        U(mVar2);
    }

    public o(char[] cArr) {
        this.f86589e = m.l();
        this.f86590f = m.h();
        this.f86591g = m.h();
        this.f86592h = m.h();
        this.f86593i = false;
        this.f86594j = true;
        if (cArr == null) {
            this.f86586b = null;
        } else {
            this.f86586b = (char[]) cArr.clone();
        }
    }

    public o(char[] cArr, char c5) {
        this(cArr);
        K(c5);
    }

    public o(char[] cArr, String str) {
        this(cArr);
        N(str);
    }

    public o(char[] cArr, m mVar) {
        this(cArr);
        M(mVar);
    }

    public o(char[] cArr, char c5, char c6) {
        this(cArr, c5);
        T(c6);
    }

    public o(char[] cArr, m mVar, m mVar2) {
        this(cArr, mVar);
        U(mVar2);
    }
}
