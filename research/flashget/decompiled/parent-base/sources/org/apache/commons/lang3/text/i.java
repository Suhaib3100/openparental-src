package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.b1;

/* compiled from: StrTokenizer.java */
@Deprecated
/* loaded from: classes6.dex */
public class i implements ListIterator<String>, Cloneable {

    /* renamed from: k, reason: collision with root package name */
    private static final i f86188k;

    /* renamed from: l, reason: collision with root package name */
    private static final i f86189l;

    /* renamed from: b, reason: collision with root package name */
    private char[] f86190b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f86191c;

    /* renamed from: d, reason: collision with root package name */
    private int f86192d;

    /* renamed from: e, reason: collision with root package name */
    private g f86193e;

    /* renamed from: f, reason: collision with root package name */
    private g f86194f;

    /* renamed from: g, reason: collision with root package name */
    private g f86195g;

    /* renamed from: h, reason: collision with root package name */
    private g f86196h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86197i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86198j;

    static {
        i iVar = new i();
        f86188k = iVar;
        iVar.M(g.d());
        iVar.U(g.e());
        iVar.S(g.h());
        iVar.V(g.o());
        iVar.O(false);
        iVar.P(false);
        i iVar2 = new i();
        f86189l = iVar2;
        iVar2.M(g.n());
        iVar2.U(g.e());
        iVar2.S(g.h());
        iVar2.V(g.o());
        iVar2.O(false);
        iVar2.P(false);
    }

    public i() {
        this.f86193e = g.l();
        this.f86194f = g.h();
        this.f86195g = g.h();
        this.f86196h = g.h();
        this.f86197i = false;
        this.f86198j = true;
        this.f86190b = null;
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

    private int E(char[] cArr, int i4, int i5, e eVar, List<String> list) {
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
        return g5 > 0 ? F(cArr, i4 + g5, i5, eVar, list, i4, g5) : F(cArr, i4, i5, eVar, list, 0, 0);
    }

    private int F(char[] cArr, int i4, int i5, e eVar, List<String> list, int i6, int i7) {
        eVar.r0();
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
                        eVar.z(cArr, i13, i7);
                        i10 = (i7 * 2) + i13;
                        i11 = eVar.B1();
                    } else {
                        i11 = i12;
                        i10 = i14;
                        z4 = false;
                    }
                } else {
                    i10 = i13 + 1;
                    eVar.append(cArr[i13]);
                    i11 = eVar.B1();
                }
            } else {
                int i15 = i11;
                int i16 = i10;
                int g4 = m().g(cArr, i16, i4, i5);
                if (g4 > 0) {
                    c(list, eVar.E1(0, i15));
                    return i16 + g4;
                }
                if (i7 <= 0 || !A(cArr, i16, i5, i6, i7)) {
                    int g5 = n().g(cArr, i16, i4, i5);
                    if (g5 <= 0) {
                        g5 = w().g(cArr, i16, i4, i5);
                        if (g5 > 0) {
                            eVar.z(cArr, i16, g5);
                        } else {
                            i10 = i16 + 1;
                            eVar.append(cArr[i16]);
                            i11 = eVar.B1();
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
        c(list, eVar.E1(0, i11));
        return -1;
    }

    private void c(List<String> list, String str) {
        if (b1.G0(str)) {
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
        if (this.f86191c == null) {
            char[] cArr = this.f86190b;
            if (cArr == null) {
                this.f86191c = (String[]) Y(null, 0, 0).toArray(org.apache.commons.lang3.e.f85969u);
            } else {
                this.f86191c = (String[]) Y(cArr, 0, cArr.length).toArray(org.apache.commons.lang3.e.f85969u);
            }
        }
    }

    private static i f() {
        return (i) f86188k.clone();
    }

    public static i g() {
        return f();
    }

    public static i i(String str) {
        i f4 = f();
        f4.H(str);
        return f4;
    }

    public static i k(char[] cArr) {
        i f4 = f();
        f4.I(cArr);
        return f4;
    }

    private static i p() {
        return (i) f86189l.clone();
    }

    public static i r() {
        return p();
    }

    public static i s(String str) {
        i p4 = p();
        p4.H(str);
        return p4;
    }

    public static i t(char[] cArr) {
        i p4 = p();
        p4.I(cArr);
        return p4;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86191c;
        int i4 = this.f86192d;
        this.f86192d = i4 + 1;
        return strArr[i4];
    }

    @Override // java.util.ListIterator
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f86191c;
        int i4 = this.f86192d - 1;
        this.f86192d = i4;
        return strArr[i4];
    }

    public String D() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.f86191c;
        int i4 = this.f86192d - 1;
        this.f86192d = i4;
        return strArr[i4];
    }

    public i G() {
        this.f86192d = 0;
        this.f86191c = null;
        return this;
    }

    public i H(String str) {
        G();
        if (str != null) {
            this.f86190b = str.toCharArray();
        } else {
            this.f86190b = null;
        }
        return this;
    }

    public i I(char[] cArr) {
        G();
        this.f86190b = org.apache.commons.lang3.e.M(cArr);
        return this;
    }

    @Override // java.util.ListIterator
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public i K(char c5) {
        return M(g.a(c5));
    }

    public i M(g gVar) {
        if (gVar == null) {
            this.f86193e = g.h();
        } else {
            this.f86193e = gVar;
        }
        return this;
    }

    public i N(String str) {
        return M(g.m(str));
    }

    public i O(boolean z4) {
        this.f86197i = z4;
        return this;
    }

    public i P(boolean z4) {
        this.f86198j = z4;
        return this;
    }

    public i R(char c5) {
        return S(g.a(c5));
    }

    public i S(g gVar) {
        if (gVar != null) {
            this.f86195g = gVar;
        }
        return this;
    }

    public i T(char c5) {
        return U(g.a(c5));
    }

    public i U(g gVar) {
        if (gVar != null) {
            this.f86194f = gVar;
        }
        return this;
    }

    public i V(g gVar) {
        if (gVar != null) {
            this.f86196h = gVar;
        }
        return this;
    }

    public int W() {
        d();
        return this.f86191c.length;
    }

    protected List<String> Y(char[] cArr, int i4, int i5) {
        if (cArr == null || i5 == 0) {
            return Collections.emptyList();
        }
        e eVar = new e();
        ArrayList arrayList = new ArrayList();
        int i6 = i4;
        while (i6 >= 0 && i6 < i5) {
            i6 = E(cArr, i6, i5, eVar, arrayList);
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
        i iVar = (i) super.clone();
        char[] cArr = iVar.f86190b;
        if (cArr != null) {
            iVar.f86190b = (char[]) cArr.clone();
        }
        iVar.G();
        return iVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        d();
        return this.f86192d < this.f86191c.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        d();
        return this.f86192d > 0;
    }

    public String l() {
        char[] cArr = this.f86190b;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public g m() {
        return this.f86193e;
    }

    public g n() {
        return this.f86195g;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f86192d;
    }

    public String nextToken() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.f86191c;
        int i4 = this.f86192d;
        this.f86192d = i4 + 1;
        return strArr[i4];
    }

    public g o() {
        return this.f86194f;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f86192d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public String toString() {
        if (this.f86191c == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + v();
    }

    public String[] u() {
        d();
        return (String[]) this.f86191c.clone();
    }

    public List<String> v() {
        d();
        ArrayList arrayList = new ArrayList(this.f86191c.length);
        arrayList.addAll(Arrays.asList(this.f86191c));
        return arrayList;
    }

    public g w() {
        return this.f86196h;
    }

    public boolean y() {
        return this.f86197i;
    }

    public boolean z() {
        return this.f86198j;
    }

    public i(String str) {
        this.f86193e = g.l();
        this.f86194f = g.h();
        this.f86195g = g.h();
        this.f86196h = g.h();
        this.f86197i = false;
        this.f86198j = true;
        if (str != null) {
            this.f86190b = str.toCharArray();
        } else {
            this.f86190b = null;
        }
    }

    public i(String str, char c5) {
        this(str);
        K(c5);
    }

    public i(String str, String str2) {
        this(str);
        N(str2);
    }

    public i(String str, g gVar) {
        this(str);
        M(gVar);
    }

    public i(String str, char c5, char c6) {
        this(str, c5);
        T(c6);
    }

    public i(String str, g gVar, g gVar2) {
        this(str, gVar);
        U(gVar2);
    }

    public i(char[] cArr) {
        this.f86193e = g.l();
        this.f86194f = g.h();
        this.f86195g = g.h();
        this.f86196h = g.h();
        this.f86197i = false;
        this.f86198j = true;
        this.f86190b = org.apache.commons.lang3.e.M(cArr);
    }

    public i(char[] cArr, char c5) {
        this(cArr);
        K(c5);
    }

    public i(char[] cArr, String str) {
        this(cArr);
        N(str);
    }

    public i(char[] cArr, g gVar) {
        this(cArr);
        M(gVar);
    }

    public i(char[] cArr, char c5, char c6) {
        this(cArr, c5);
        T(c6);
    }

    public i(char[] cArr, g gVar, g gVar2) {
        this(cArr, gVar);
        U(gVar2);
    }
}
