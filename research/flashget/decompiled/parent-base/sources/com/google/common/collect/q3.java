package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ImmutableSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public abstract class q3<E> extends b3<E> implements Set<E> {

    /* renamed from: d, reason: collision with root package name */
    static final int f56200d = 1073741824;

    /* renamed from: e, reason: collision with root package name */
    private static final double f56201e = 0.7d;

    /* renamed from: f, reason: collision with root package name */
    private static final int f56202f = 751619276;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient f3<E> f56203c;

    /* compiled from: ImmutableSet.java */
    public static class a<E> extends b3.a<E> {

        /* renamed from: e, reason: collision with root package name */
        @d9.d
        @zc.a
        Object[] f56204e;

        /* renamed from: f, reason: collision with root package name */
        private int f56205f;

        public a() {
            super(4);
        }

        private void n(E e4) {
            Objects.requireNonNull(this.f56204e);
            int length = this.f56204e.length - 1;
            int hashCode = e4.hashCode();
            int c5 = x2.c(hashCode);
            while (true) {
                int i4 = c5 & length;
                Object[] objArr = this.f56204e;
                Object obj = objArr[i4];
                if (obj == null) {
                    objArr[i4] = e4;
                    this.f56205f += hashCode;
                    super.a(e4);
                    return;
                } else if (obj.equals(e4)) {
                    return;
                } else {
                    c5 = i4 + 1;
                }
            }
        }

        @Override // com.google.common.collect.b3.a
        @f9.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e4) {
            e4.getClass();
            if (this.f56204e != null && q3.v(this.f55379c) <= this.f56204e.length) {
                n(e4);
                return this;
            }
            this.f56204e = null;
            super.a(e4);
            return this;
        }

        @Override // com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            if (this.f56204e != null) {
                for (E e4 : eArr) {
                    a(e4);
                }
            } else {
                h(eArr, eArr.length);
            }
            return this;
        }

        @Override // com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            iterable.getClass();
            if (this.f56204e != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            it.getClass();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.b3.b
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public q3<E> e() {
            q3<E> w4;
            int i4 = this.f55379c;
            if (i4 == 0) {
                return q3.I();
            }
            if (i4 == 1) {
                Object obj = this.f55378b[0];
                Objects.requireNonNull(obj);
                return q3.K(obj);
            }
            if (this.f56204e == null || q3.v(i4) != this.f56204e.length) {
                w4 = q3.w(this.f55379c, this.f55378b);
                this.f55379c = w4.size();
            } else {
                Object[] copyOf = q3.S(this.f55379c, this.f55378b.length) ? Arrays.copyOf(this.f55378b, this.f55379c) : this.f55378b;
                w4 = new t5<>(copyOf, this.f56205f, this.f56204e, r5.length - 1, this.f55379c);
            }
            this.f55380d = true;
            this.f56204e = null;
            return w4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        a<E> p(a<E> aVar) {
            if (this.f56204e != null) {
                for (int i4 = 0; i4 < aVar.f55379c; i4++) {
                    Object obj = aVar.f55378b[i4];
                    Objects.requireNonNull(obj);
                    a(obj);
                }
            } else {
                h(aVar.f55378b, aVar.f55379c);
            }
            return this;
        }

        a(int i4) {
            super(i4);
            this.f56204e = new Object[q3.v(i4)];
        }
    }

    /* compiled from: ImmutableSet.java */
    private static class b implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56206c = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f56207b;

        b(Object[] objArr) {
            this.f56207b = objArr;
        }

        Object a() {
            return q3.F(this.f56207b);
        }
    }

    q3() {
    }

    public static <E> q3<E> A(Collection<? extends E> collection) {
        if ((collection instanceof q3) && !(collection instanceof SortedSet)) {
            q3<E> q3Var = (q3) collection;
            if (!q3Var.j()) {
                return q3Var;
            }
        }
        Object[] array = collection.toArray();
        return w(array.length, array);
    }

    public static <E> q3<E> D(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return t5.f56492m;
        }
        E next = it.next();
        return !it.hasNext() ? new e6(next) : new a(4).a(next).d(it).e();
    }

    public static <E> q3<E> F(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? w(eArr.length, (Object[]) eArr.clone()) : new e6(eArr[0]) : t5.f56492m;
    }

    public static <E> q3<E> I() {
        return t5.f56492m;
    }

    public static <E> q3<E> K(E e4) {
        return new e6(e4);
    }

    public static <E> q3<E> L(E e4, E e5) {
        return w(2, e4, e5);
    }

    public static <E> q3<E> O(E e4, E e5, E e6) {
        return w(3, e4, e5, e6);
    }

    public static <E> q3<E> P(E e4, E e5, E e6, E e7) {
        return w(4, e4, e5, e6, e7);
    }

    public static <E> q3<E> Q(E e4, E e5, E e6, E e7, E e10) {
        return w(5, e4, e5, e6, e7, e10);
    }

    @SafeVarargs
    public static <E> q3<E> R(E e4, E e5, E e6, E e7, E e10, E e11, E... eArr) {
        com.google.common.base.l0.e(eArr.length <= 2147483641, ProtectedSandApp.s("\uf4b0"));
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e4;
        objArr[1] = e5;
        objArr[2] = e6;
        objArr[3] = e7;
        objArr[4] = e10;
        objArr[5] = e11;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return w(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean S(int i4, int i5) {
        return i4 < (i5 >> 1) + (i5 >> 2);
    }

    public static <E> a<E> r() {
        return new a<>(4);
    }

    @d9.a
    public static <E> a<E> s(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf4b1"));
        return new a<>(i4);
    }

    @d9.d
    static int v(int i4) {
        int max = Math.max(i4, 2);
        if (max >= f56202f) {
            com.google.common.base.l0.e(max < 1073741824, ProtectedSandApp.s("\uf4b2"));
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * f56201e < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> q3<E> w(int i4, Object... objArr) {
        if (i4 == 0) {
            return t5.f56492m;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new e6(obj);
        }
        int v4 = v(i4);
        Object[] objArr2 = new Object[v4];
        int i5 = v4 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object a5 = b5.a(objArr[i10], i10);
            int hashCode = a5.hashCode();
            int c5 = x2.c(hashCode);
            while (true) {
                int i11 = c5 & i5;
                Object obj2 = objArr2[i11];
                if (obj2 == null) {
                    objArr[i7] = a5;
                    objArr2[i11] = a5;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (obj2.equals(a5)) {
                    break;
                }
                c5++;
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new e6(obj3);
        }
        if (v(i7) < v4 / 2) {
            return w(i7, objArr);
        }
        if (S(i7, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new t5(objArr, i6, objArr2, i5, i7);
    }

    public static <E> q3<E> x(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? A((Collection) iterable) : D(iterable.iterator());
    }

    f3<E> G() {
        return f3.p(toArray());
    }

    boolean H() {
        return false;
    }

    @Override // com.google.common.collect.b3
    public f3<E> b() {
        f3<E> f3Var = this.f56203c;
        if (f3Var != null) {
            return f3Var;
        }
        f3<E> G = G();
        this.f56203c = G;
        return G;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q3) && H() && ((q3) obj).H() && hashCode() != obj.hashCode()) {
            return false;
        }
        return d6.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d6.k(this);
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract e7<E> iterator();

    @Override // com.google.common.collect.b3
    Object m() {
        return new b(toArray());
    }
}
