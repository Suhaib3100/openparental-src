package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: ImmutableIntArray.java */
@f
@f9.j
@d9.b
@d9.a
/* loaded from: classes6.dex */
public final class j implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final j f57497e = new j(new int[0]);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f57498b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f57499c;

    /* renamed from: d, reason: collision with root package name */
    private final int f57500d;

    /* compiled from: ImmutableIntArray.java */
    static class b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final j f57501b;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer get(int i4) {
            return Integer.valueOf(this.f57501b.k(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof b) {
                return this.f57501b.equals(((b) obj).f57501b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i4 = this.f57501b.f57499c;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i5 = i4 + 1;
                    if (this.f57501b.f57498b[i4] == ((Integer) obj2).intValue()) {
                        i4 = i5;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f57501b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            if (obj instanceof Integer) {
                return this.f57501b.l(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            if (obj instanceof Integer) {
                return this.f57501b.o(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57501b.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i4, int i5) {
            return this.f57501b.z(i4, i5).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f57501b.toString();
        }

        private b(j jVar) {
            this.f57501b = jVar;
        }
    }

    /* compiled from: ImmutableIntArray.java */
    @f9.a
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private int[] f57502a;

        /* renamed from: b, reason: collision with root package name */
        private int f57503b = 0;

        c(int i4) {
            this.f57502a = new int[i4];
        }

        private void g(int i4) {
            int i5 = this.f57503b + i4;
            int[] iArr = this.f57502a;
            if (i5 > iArr.length) {
                this.f57502a = Arrays.copyOf(iArr, h(iArr.length, i5));
            }
        }

        private static int h(int i4, int i5) {
            if (i5 < 0) {
                throw new AssertionError(ProtectedSandApp.s("\uf8b1"));
            }
            int i6 = i4 + (i4 >> 1) + 1;
            if (i6 < i5) {
                i6 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i6 < 0) {
                return Integer.MAX_VALUE;
            }
            return i6;
        }

        public c a(int i4) {
            g(1);
            int[] iArr = this.f57502a;
            int i5 = this.f57503b;
            iArr[i5] = i4;
            this.f57503b = i5 + 1;
            return this;
        }

        public c b(j jVar) {
            g(jVar.p());
            System.arraycopy(jVar.f57498b, jVar.f57499c, this.f57502a, this.f57503b, jVar.p());
            this.f57503b = jVar.p() + this.f57503b;
            return this;
        }

        public c c(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        public c d(Collection<Integer> collection) {
            g(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f57502a;
                int i4 = this.f57503b;
                this.f57503b = i4 + 1;
                iArr[i4] = num.intValue();
            }
            return this;
        }

        public c e(int[] iArr) {
            g(iArr.length);
            System.arraycopy(iArr, 0, this.f57502a, this.f57503b, iArr.length);
            this.f57503b += iArr.length;
            return this;
        }

        @f9.b
        public j f() {
            if (this.f57503b == 0) {
                return j.f57497e;
            }
            return new j(this.f57502a, 0, this.f57503b);
        }
    }

    public static c e() {
        return new c(10);
    }

    public static c f(int i4) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8b2"), i4);
        return new c(i4);
    }

    public static j h(Iterable<Integer> iterable) {
        return iterable instanceof Collection ? i((Collection) iterable) : e().c(iterable).f();
    }

    public static j i(Collection<Integer> collection) {
        return collection.isEmpty() ? f57497e : new j(l.B(collection));
    }

    public static j j(int[] iArr) {
        return iArr.length == 0 ? f57497e : new j(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean n() {
        return this.f57499c > 0 || this.f57500d < this.f57498b.length;
    }

    public static j q() {
        return f57497e;
    }

    public static j r(int i4) {
        return new j(new int[]{i4});
    }

    public static j s(int i4, int i5) {
        return new j(new int[]{i4, i5});
    }

    public static j t(int i4, int i5, int i6) {
        return new j(new int[]{i4, i5, i6});
    }

    public static j u(int i4, int i5, int i6, int i7) {
        return new j(new int[]{i4, i5, i6, i7});
    }

    public static j v(int i4, int i5, int i6, int i7, int i10) {
        return new j(new int[]{i4, i5, i6, i7, i10});
    }

    public static j w(int i4, int i5, int i6, int i7, int i10, int i11) {
        return new j(new int[]{i4, i5, i6, i7, i10, i11});
    }

    public static j x(int i4, int... iArr) {
        l0.e(iArr.length <= 2147483646, ProtectedSandApp.s("\uf8b3"));
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i4;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new j(iArr2);
    }

    public int[] A() {
        return Arrays.copyOfRange(this.f57498b, this.f57499c, this.f57500d);
    }

    public j B() {
        return n() ? new j(A()) : this;
    }

    Object C() {
        return B();
    }

    public List<Integer> d() {
        return new b();
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (p() != jVar.p()) {
            return false;
        }
        for (int i4 = 0; i4 < p(); i4++) {
            if (k(i4) != jVar.k(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(int i4) {
        return l(i4) >= 0;
    }

    public int hashCode() {
        int i4 = 1;
        for (int i5 = this.f57499c; i5 < this.f57500d; i5++) {
            i4 = (i4 * 31) + this.f57498b[i5];
        }
        return i4;
    }

    public int k(int i4) {
        l0.C(i4, p());
        return this.f57498b[this.f57499c + i4];
    }

    public int l(int i4) {
        for (int i5 = this.f57499c; i5 < this.f57500d; i5++) {
            if (this.f57498b[i5] == i4) {
                return i5 - this.f57499c;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.f57500d == this.f57499c;
    }

    public int o(int i4) {
        int i5;
        int i6 = this.f57500d;
        do {
            i6--;
            i5 = this.f57499c;
            if (i6 < i5) {
                return -1;
            }
        } while (this.f57498b[i6] != i4);
        return i6 - i5;
    }

    public int p() {
        return this.f57500d - this.f57499c;
    }

    public String toString() {
        if (m()) {
            return ProtectedSandApp.s("\uf8b4");
        }
        StringBuilder sb = new StringBuilder(p() * 5);
        sb.append('[');
        sb.append(this.f57498b[this.f57499c]);
        int i4 = this.f57499c;
        while (true) {
            i4++;
            if (i4 >= this.f57500d) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(ProtectedSandApp.s("\uf8b5"));
            sb.append(this.f57498b[i4]);
        }
    }

    Object y() {
        return m() ? f57497e : this;
    }

    public j z(int i4, int i5) {
        l0.f0(i4, i5, p());
        if (i4 == i5) {
            return f57497e;
        }
        int[] iArr = this.f57498b;
        int i6 = this.f57499c;
        return new j(iArr, i4 + i6, i6 + i5);
    }

    private j(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private j(int[] iArr, int i4, int i5) {
        this.f57498b = iArr;
        this.f57499c = i4;
        this.f57500d = i5;
    }
}
