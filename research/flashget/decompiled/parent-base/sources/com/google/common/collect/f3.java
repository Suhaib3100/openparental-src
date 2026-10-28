package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public abstract class f3<E> extends b3<E> implements List<E>, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final f7<Object> f55728c = new b(q5.f56234f, 0);

    /* compiled from: ImmutableList.java */
    public static final class a<E> extends b3.a<E> {
        public a() {
            super(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b b(Object[] objArr) {
            h(objArr, objArr.length);
            return this;
        }

        @Override // com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b c(Iterable iterable) {
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        public b3.b d(Iterator it) {
            super.d(it);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.b3.a
        @f9.a
        /* renamed from: g */
        public b3.a a(Object obj) {
            super.a(obj);
            return this;
        }

        @f9.a
        public a<E> j(E e4) {
            super.a(e4);
            return this;
        }

        @f9.a
        public a<E> k(E... eArr) {
            h(eArr, eArr.length);
            return this;
        }

        @f9.a
        public a<E> l(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @f9.a
        public a<E> m(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // com.google.common.collect.b3.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public f3<E> e() {
            this.f55380d = true;
            return f3.q(this.f55378b, this.f55379c);
        }

        @f9.a
        a<E> o(a<E> aVar) {
            h(aVar.f55378b, aVar.f55379c);
            return this;
        }

        a(int i4) {
            super(i4);
        }
    }

    /* compiled from: ImmutableList.java */
    static class b<E> extends com.google.common.collect.b<E> {

        /* renamed from: d, reason: collision with root package name */
        private final f3<E> f55729d;

        b(f3<E> f3Var, int i4) {
            super(f3Var.size(), i4);
            this.f55729d = f3Var;
        }

        @Override // com.google.common.collect.b
        protected E a(int i4) {
            return this.f55729d.get(i4);
        }
    }

    /* compiled from: ImmutableList.java */
    private static class c<E> extends f3<E> {

        /* renamed from: d, reason: collision with root package name */
        private final transient f3<E> f55730d;

        c(f3<E> f3Var) {
            this.f55730d = f3Var;
        }

        private int f0(int i4) {
            return (size() - 1) - i4;
        }

        private int g0(int i4) {
            return size() - i4;
        }

        @Override // com.google.common.collect.f3
        public f3<E> Z() {
            return this.f55730d;
        }

        @Override // com.google.common.collect.f3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return this.f55730d.contains(obj);
        }

        @Override // com.google.common.collect.f3, java.util.List
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public f3<E> subList(int i4, int i5) {
            com.google.common.base.l0.f0(i4, i5, size());
            return this.f55730d.subList(size() - i5, size() - i4).Z();
        }

        @Override // java.util.List
        public E get(int i4) {
            com.google.common.base.l0.C(i4, size());
            return this.f55730d.get(f0(i4));
        }

        @Override // com.google.common.collect.f3, java.util.List
        public int indexOf(@zc.a Object obj) {
            int lastIndexOf = this.f55730d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return f0(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.f3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return this.f55730d.j();
        }

        @Override // com.google.common.collect.f3, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int indexOf = this.f55730d.indexOf(obj);
            if (indexOf >= 0) {
                return f0(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.f3, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55730d.size();
        }

        @Override // com.google.common.collect.f3, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
            return super.listIterator(i4);
        }
    }

    /* compiled from: ImmutableList.java */
    static class d implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55731c = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f55732b;

        d(Object[] objArr) {
            this.f55732b = objArr;
        }

        Object a() {
            return f3.D(this.f55732b);
        }
    }

    /* compiled from: ImmutableList.java */
    class e extends f3<E> {

        /* renamed from: d, reason: collision with root package name */
        final transient int f55733d;

        /* renamed from: e, reason: collision with root package name */
        final transient int f55734e;

        e(int i4, int i5) {
            this.f55733d = i4;
            this.f55734e = i5;
        }

        @Override // com.google.common.collect.f3, java.util.List
        /* renamed from: d0 */
        public f3<E> subList(int i4, int i5) {
            com.google.common.base.l0.f0(i4, i5, this.f55734e);
            f3 f3Var = f3.this;
            int i6 = this.f55733d;
            return f3Var.subList(i4 + i6, i5 + i6);
        }

        @Override // com.google.common.collect.b3
        @zc.a
        Object[] f() {
            return f3.this.f();
        }

        @Override // java.util.List
        public E get(int i4) {
            com.google.common.base.l0.C(i4, this.f55734e);
            return f3.this.get(i4 + this.f55733d);
        }

        @Override // com.google.common.collect.b3
        int h() {
            return f3.this.i() + this.f55733d + this.f55734e;
        }

        @Override // com.google.common.collect.b3
        int i() {
            return f3.this.i() + this.f55733d;
        }

        @Override // com.google.common.collect.f3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.f3, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55734e;
        }

        @Override // com.google.common.collect.f3, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
            return super.listIterator(i4);
        }
    }

    f3() {
    }

    public static <E> f3<E> A(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return (f3<E>) q5.f56234f;
        }
        E next = it.next();
        return !it.hasNext() ? I(next) : new a(4).j(next).m(it).e();
    }

    public static <E> f3<E> D(E[] eArr) {
        return eArr.length == 0 ? (f3<E>) q5.f56234f : v((Object[]) eArr.clone());
    }

    public static <E> f3<E> H() {
        return (f3<E>) q5.f56234f;
    }

    public static <E> f3<E> I(E e4) {
        return v(e4);
    }

    public static <E> f3<E> K(E e4, E e5) {
        return v(e4, e5);
    }

    public static <E> f3<E> L(E e4, E e5, E e6) {
        return v(e4, e5, e6);
    }

    public static <E> f3<E> O(E e4, E e5, E e6, E e7) {
        return v(e4, e5, e6, e7);
    }

    public static <E> f3<E> P(E e4, E e5, E e6, E e7, E e10) {
        return v(e4, e5, e6, e7, e10);
    }

    public static <E> f3<E> Q(E e4, E e5, E e6, E e7, E e10, E e11) {
        return v(e4, e5, e6, e7, e10, e11);
    }

    public static <E> f3<E> R(E e4, E e5, E e6, E e7, E e10, E e11, E e12) {
        return v(e4, e5, e6, e7, e10, e11, e12);
    }

    public static <E> f3<E> S(E e4, E e5, E e6, E e7, E e10, E e11, E e12, E e13) {
        return v(e4, e5, e6, e7, e10, e11, e12, e13);
    }

    public static <E> f3<E> T(E e4, E e5, E e6, E e7, E e10, E e11, E e12, E e13, E e14) {
        return v(e4, e5, e6, e7, e10, e11, e12, e13, e14);
    }

    public static <E> f3<E> U(E e4, E e5, E e6, E e7, E e10, E e11, E e12, E e13, E e14, E e15) {
        return v(e4, e5, e6, e7, e10, e11, e12, e13, e14, e15);
    }

    public static <E> f3<E> V(E e4, E e5, E e6, E e7, E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return v(e4, e5, e6, e7, e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> f3<E> W(E e4, E e5, E e6, E e7, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E... eArr) {
        com.google.common.base.l0.e(eArr.length <= 2147483635, ProtectedSandApp.s("\uf49c"));
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e4;
        objArr[1] = e5;
        objArr[2] = e6;
        objArr[3] = e7;
        objArr[4] = e10;
        objArr[5] = e11;
        objArr[6] = e12;
        objArr[7] = e13;
        objArr[8] = e14;
        objArr[9] = e15;
        objArr[10] = e16;
        objArr[11] = e17;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return v(objArr);
    }

    private void X(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("\uf49d"));
    }

    public static <E extends Comparable<? super E>> f3<E> a0(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) c4.R(iterable, new Comparable[0]);
        b5.c(comparableArr, comparableArr.length);
        Arrays.sort(comparableArr);
        return q(comparableArr, comparableArr.length);
    }

    public static <E> f3<E> b0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        comparator.getClass();
        Object[] P = c4.P(iterable);
        b5.c(P, P.length);
        Arrays.sort(P, comparator);
        return q(P, P.length);
    }

    static <E> f3<E> p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    static <E> f3<E> q(Object[] objArr, int i4) {
        return i4 == 0 ? (f3<E>) q5.f56234f : new q5(objArr, i4);
    }

    public static <E> a<E> r() {
        return new a<>(4);
    }

    @d9.a
    public static <E> a<E> s(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf49e"));
        return new a<>(i4);
    }

    private static <E> f3<E> v(Object... objArr) {
        b5.c(objArr, objArr.length);
        return q(objArr, objArr.length);
    }

    public static <E> f3<E> w(Iterable<? extends E> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? x((Collection) iterable) : A(iterable.iterator());
    }

    public static <E> f3<E> x(Collection<? extends E> collection) {
        if (!(collection instanceof b3)) {
            return v(collection.toArray());
        }
        f3<E> b5 = ((b3) collection).b();
        if (!b5.j()) {
            return b5;
        }
        Object[] array = b5.toArray();
        return q(array, array.length);
    }

    @Override // java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public f7<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public f7<E> listIterator(int i4) {
        com.google.common.base.l0.d0(i4, size());
        return isEmpty() ? (f7<E>) f55728c : new b(this, i4);
    }

    public f3<E> Z() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b3
    @f9.l(replacement = "this")
    @Deprecated
    public final f3<E> b() {
        return this;
    }

    @Override // com.google.common.collect.b3
    int c(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: d0 */
    public f3<E> subList(int i4, int i5) {
        com.google.common.base.l0.f0(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? (f3<E>) q5.f56234f : e0(i4, i5);
    }

    f3<E> e0(int i4, int i5) {
        return new e(i4, i5 - i4);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@zc.a Object obj) {
        return l4.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = ~(~(get(i5).hashCode() + (i4 * 31)));
        }
        return i4;
    }

    @Override // java.util.List
    public int indexOf(@zc.a Object obj) {
        if (obj == null) {
            return -1;
        }
        return l4.l(this, obj);
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e7<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@zc.a Object obj) {
        if (obj == null) {
            return -1;
        }
        return l4.n(this, obj);
    }

    @Override // com.google.common.collect.b3
    Object m() {
        return new d(toArray());
    }

    @Override // java.util.List
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i4, E e4) {
        throw new UnsupportedOperationException();
    }
}
