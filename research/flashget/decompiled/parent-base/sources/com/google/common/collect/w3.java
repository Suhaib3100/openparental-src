package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.collect.q3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: ImmutableSortedSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public abstract class w3<E> extends x3<E> implements NavigableSet<E>, g6<E> {

    /* renamed from: g, reason: collision with root package name */
    final transient Comparator<? super E> f56614g;

    /* renamed from: h, reason: collision with root package name */
    @g9.b
    @zc.a
    @d9.c
    transient w3<E> f56615h;

    /* compiled from: ImmutableSortedSet.java */
    public static final class a<E> extends q3.a<E> {

        /* renamed from: g, reason: collision with root package name */
        private final Comparator<? super E> f56616g;

        public a(Comparator<? super E> comparator) {
            super(4);
            comparator.getClass();
            this.f56616g = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.q3.a, com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b a(Object obj) {
            super.a(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.q3.a, com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b b(Object[] objArr) {
            super.b(objArr);
            return this;
        }

        @Override // com.google.common.collect.q3.a, com.google.common.collect.b3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b c(Iterable iterable) {
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.q3.a, com.google.common.collect.b3.b
        @f9.a
        public b3.b d(Iterator it) {
            super.d(it);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.q3.a, com.google.common.collect.b3.a
        @f9.a
        /* renamed from: g */
        public b3.a a(Object obj) {
            super.a(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.q3.a
        @f9.a
        /* renamed from: j */
        public q3.a a(Object obj) {
            super.a(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.q3.a
        @f9.a
        /* renamed from: k */
        public q3.a b(Object[] objArr) {
            super.b(objArr);
            return this;
        }

        @Override // com.google.common.collect.q3.a
        @f9.a
        /* renamed from: l */
        public q3.a c(Iterable iterable) {
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.q3.a
        @f9.a
        /* renamed from: m */
        public q3.a d(Iterator it) {
            super.d(it);
            return this;
        }

        @Override // com.google.common.collect.q3.a
        @f9.a
        q3.a p(q3.a aVar) {
            super.p(aVar);
            return this;
        }

        @f9.a
        public a<E> q(E e4) {
            super.a(e4);
            return this;
        }

        @f9.a
        public a<E> r(E... eArr) {
            super.b(eArr);
            return this;
        }

        @f9.a
        public a<E> s(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @f9.a
        public a<E> t(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // com.google.common.collect.q3.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public w3<E> e() {
            w3<E> e02 = w3.e0(this.f56616g, this.f55379c, this.f55378b);
            this.f55379c = e02.size();
            this.f55380d = true;
            return e02;
        }

        @f9.a
        a<E> v(q3.a<E> aVar) {
            super.p(aVar);
            return this;
        }
    }

    /* compiled from: ImmutableSortedSet.java */
    private static class b<E> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56617d = 0;

        /* renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f56618b;

        /* renamed from: c, reason: collision with root package name */
        final Object[] f56619c;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f56618b = comparator;
            this.f56619c = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object a() {
            return new a(this.f56618b).r(this.f56619c).e();
        }
    }

    w3(Comparator<? super E> comparator) {
        this.f56614g = comparator;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 D0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return e0(x4.f56632f, 4, comparable, comparable2, comparable3, comparable4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 E0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return e0(x4.f56632f, 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 F0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return e0(x4.f56632f, length, comparableArr2);
    }

    public static <E> a<E> G0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    private void I0(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("\uf504"));
    }

    public static <E extends Comparable<?>> a<E> J0() {
        return new a<>(Collections.reverseOrder());
    }

    static int T0(Comparator<?> comparator, Object obj, @zc.a Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> w3<E> e0(Comparator<? super E> comparator, int i4, E... eArr) {
        if (i4 == 0) {
            return r0(comparator);
        }
        b5.c(eArr, i4);
        Arrays.sort(eArr, 0, i4, comparator);
        int i5 = 1;
        for (int i6 = 1; i6 < i4; i6++) {
            a0.c cVar = (Object) eArr[i6];
            if (comparator.compare(cVar, (Object) eArr[i5 - 1]) != 0) {
                eArr[i5] = cVar;
                i5++;
            }
        }
        Arrays.fill(eArr, i5, i4, (Object) null);
        if (i5 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i5);
        }
        return new v5(f3.q(eArr, i5), comparator);
    }

    public static <E> w3<E> f0(Iterable<? extends E> iterable) {
        return h0(x4.f56632f, iterable);
    }

    public static <E> w3<E> g0(Collection<? extends E> collection) {
        return h0(x4.f56632f, collection);
    }

    public static <E> w3<E> h0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        comparator.getClass();
        if (h6.b(comparator, iterable) && (iterable instanceof w3)) {
            w3<E> w3Var = (w3) iterable;
            if (!w3Var.j()) {
                return w3Var;
            }
        }
        Object[] P = c4.P(iterable);
        return e0(comparator, P.length, P);
    }

    public static <E> w3<E> i0(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return h0(comparator, collection);
    }

    public static <E> w3<E> j0(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).t(it).e();
    }

    public static <E> w3<E> k0(Iterator<? extends E> it) {
        return j0(x4.f56632f, it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 l0(Comparable[] comparableArr) {
        return e0(x4.f56632f, comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> w3<E> m0(SortedSet<E> sortedSet) {
        Comparator a5 = h6.a(sortedSet);
        f3 x4 = f3.x(sortedSet);
        return x4.isEmpty() ? r0(a5) : new v5(x4, a5);
    }

    static <E> v5<E> r0(Comparator<? super E> comparator) {
        return x4.f56632f.equals(comparator) ? (v5<E>) v5.f56610j : new v5<>(f3.H(), comparator);
    }

    public static <E extends Comparable<?>> a<E> v0() {
        return new a<>(x4.f56632f);
    }

    public static <E> w3<E> w0() {
        return v5.f56610j;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 x0(Comparable comparable) {
        return new v5(f3.I(comparable), x4.f56632f);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 y0(Comparable comparable, Comparable comparable2) {
        return e0(x4.f56632f, 2, comparable, comparable2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/w3<TE;>; */
    public static w3 z0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return e0(x4.f56632f, 3, comparable, comparable2, comparable3);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public w3<E> subSet(E e4, E e5) {
        return subSet(e4, true, e5, false);
    }

    @Override // java.util.NavigableSet
    @d9.c
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public w3<E> subSet(E e4, boolean z4, E e5, boolean z5) {
        e4.getClass();
        e5.getClass();
        com.google.common.base.l0.d(this.f56614g.compare(e4, e5) <= 0);
        return M0(e4, z4, e5, z5);
    }

    abstract w3<E> M0(E e4, boolean z4, E e5, boolean z5);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public w3<E> tailSet(E e4) {
        return tailSet(e4, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public w3<E> tailSet(E e4, boolean z4) {
        e4.getClass();
        return Q0(e4, z4);
    }

    abstract w3<E> Q0(E e4, boolean z4);

    int R0(Object obj, @zc.a Object obj2) {
        return this.f56614g.compare(obj, obj2);
    }

    @zc.a
    public E ceiling(E e4) {
        return (E) c4.v(tailSet(e4, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.g6
    public Comparator<? super E> comparator() {
        return this.f56614g;
    }

    public E first() {
        return iterator().next();
    }

    @zc.a
    public E floor(E e4) {
        return (E) d4.J(headSet(e4, true).descendingIterator(), null);
    }

    @zc.a
    @d9.c
    public E higher(E e4) {
        return (E) c4.v(tailSet(e4, false), null);
    }

    abstract int indexOf(@zc.a Object obj);

    @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract e7<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    @zc.a
    @d9.c
    public E lower(E e4) {
        return (E) d4.J(headSet(e4, false).descendingIterator(), null);
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    Object m() {
        return new b(this.f56614g, toArray());
    }

    @d9.c
    abstract w3<E> n0();

    @Override // java.util.NavigableSet
    @d9.c
    /* renamed from: p0 */
    public abstract e7<E> descendingIterator();

    @Override // java.util.NavigableSet
    @zc.a
    @d9.c
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @zc.a
    @d9.c
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @d9.c
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public w3<E> descendingSet() {
        w3<E> w3Var = this.f56615h;
        if (w3Var != null) {
            return w3Var;
        }
        w3<E> n02 = n0();
        this.f56615h = n02;
        n02.f56615h = this;
        return n02;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public w3<E> headSet(E e4) {
        return headSet(e4, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public w3<E> headSet(E e4, boolean z4) {
        e4.getClass();
        return u0(e4, z4);
    }

    abstract w3<E> u0(E e4, boolean z4);
}
