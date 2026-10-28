package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.l4;
import com.google.common.collect.p4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Ordering.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class e5<T> implements Comparator<T> {

    /* renamed from: b, reason: collision with root package name */
    static final int f55684b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f55685c = -1;

    /* compiled from: Ordering.java */
    @d9.d
    static class a extends e5<Object> {

        /* renamed from: d, reason: collision with root package name */
        private final AtomicInteger f55686d = new AtomicInteger(0);

        /* renamed from: e, reason: collision with root package name */
        private final ConcurrentMap<Object, Integer> f55687e = h5.l(new n4()).i();

        a() {
        }

        private Integer y0(Object obj) {
            Integer num = this.f55687e.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f55686d.getAndIncrement());
            Integer putIfAbsent = this.f55687e.putIfAbsent(obj, valueOf);
            return putIfAbsent != null ? putIfAbsent : valueOf;
        }

        @Override // com.google.common.collect.e5, java.util.Comparator
        public int compare(@zc.a Object obj, @zc.a Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int z02 = z0(obj);
            int z03 = z0(obj2);
            if (z02 != z03) {
                return z02 < z03 ? -1 : 1;
            }
            int compareTo = y0(obj).compareTo(y0(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return ProtectedSandApp.s("\uf4b3");
        }

        int z0(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* compiled from: Ordering.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final e5<Object> f55688a = new a();

        private b() {
        }
    }

    /* compiled from: Ordering.java */
    @d9.d
    static class c extends ClassCastException {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55689c = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object f55690b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        c(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.String r2 = "\uf4b4"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                java.lang.String r0 = com.google.common.base.i.a(r1, r2, r0)
                r3.<init>(r0)
                r3.f55690b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.e5.c.<init>(java.lang.Object):void");
        }
    }

    protected e5() {
    }

    @d9.b(serializable = true)
    public static e5<Object> a() {
        return r.f56275d;
    }

    @d9.b(serializable = true)
    public static <C extends Comparable> e5<C> c0() {
        return x4.f56632f;
    }

    public static e5<Object> d() {
        return b.f55688a;
    }

    @d9.b(serializable = true)
    public static <T> e5<T> g(Iterable<? extends Comparator<? super T>> iterable) {
        return new l0(iterable);
    }

    @d9.b(serializable = true)
    public static <T> e5<T> n(T t4, T... tArr) {
        return new e1(new l4.e(t4, tArr));
    }

    @d9.b(serializable = true)
    public static <T> e5<T> o(List<T> list) {
        return new e1(list);
    }

    @d9.b(serializable = true)
    @Deprecated
    public static <T> e5<T> t(e5<T> e5Var) {
        e5Var.getClass();
        return e5Var;
    }

    @d9.b(serializable = true)
    public static <T> e5<T> u(Comparator<T> comparator) {
        return comparator instanceof e5 ? (e5) comparator : new i0(comparator);
    }

    @d9.b(serializable = true)
    public static e5<Object> x0() {
        return h7.f55811d;
    }

    public <E extends T> f3<E> B(Iterable<E> iterable) {
        return f3.b0(this, iterable);
    }

    public boolean C(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean D(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> E(Iterable<E> iterable, int i4) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i4 * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i4) {
                    array = Arrays.copyOf(array, i4);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return F(iterable.iterator(), i4);
    }

    public <E extends T> List<E> F(Iterator<E> it, int i4) {
        it.getClass();
        b0.b(i4, ProtectedSandApp.s("\uf445"));
        if (i4 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i4 < 1073741823) {
            u6 d5 = u6.d(i4, this);
            d5.g(it);
            return d5.j();
        }
        ArrayList s4 = l4.s(it);
        Collections.sort(s4, this);
        if (s4.size() > i4) {
            s4.subList(i4, s4.size()).clear();
        }
        s4.trimToSize();
        return Collections.unmodifiableList(s4);
    }

    @d9.b(serializable = true)
    public <S extends T> e5<Iterable<S>> H() {
        return new f4(this);
    }

    @f5
    public <E extends T> E I(Iterable<E> iterable) {
        return (E) M(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f5
    public <E extends T> E J(@f5 E e4, @f5 E e5) {
        return compare(e4, e5) >= 0 ? e4 : e5;
    }

    @f5
    public <E extends T> E K(@f5 E e4, @f5 E e5, @f5 E e6, E... eArr) {
        E e7 = (E) J(J(e4, e5), e6);
        for (E e10 : eArr) {
            e7 = (E) J(e7, e10);
        }
        return e7;
    }

    @f5
    public <E extends T> E M(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) J(next, it.next());
        }
        return next;
    }

    @f5
    public <E extends T> E N(Iterable<E> iterable) {
        return (E) Y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f5
    public <E extends T> E O(@f5 E e4, @f5 E e5) {
        return compare(e4, e5) <= 0 ? e4 : e5;
    }

    @f5
    public <E extends T> E S(@f5 E e4, @f5 E e5, @f5 E e6, E... eArr) {
        E e7 = (E) O(O(e4, e5), e6);
        for (E e10 : eArr) {
            e7 = (E) O(e7, e10);
        }
        return e7;
    }

    @f5
    public <E extends T> E Y(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) O(next, it.next());
        }
        return next;
    }

    @Override // java.util.Comparator
    @f9.a
    public abstract int compare(@f5 T t4, @f5 T t5);

    @Deprecated
    public int e(List<? extends T> list, @f5 T t4) {
        return Collections.binarySearch(list, t4, this);
    }

    @d9.b(serializable = true)
    public <U extends T> e5<U> k(Comparator<? super U> comparator) {
        comparator.getClass();
        return new l0(this, comparator);
    }

    @d9.b(serializable = true)
    public <S extends T> e5<S> o0() {
        return new z4(this);
    }

    @d9.b(serializable = true)
    public <S extends T> e5<S> q0() {
        return new a5(this);
    }

    <T2 extends T> e5<Map.Entry<T2, ?>> t0() {
        return (e5<Map.Entry<T2, ?>>) u0(p4.r.KEY);
    }

    @d9.b(serializable = true)
    public <F> e5<F> u0(com.google.common.base.x<F, ? extends T> xVar) {
        return new y(xVar, this);
    }

    @d9.b(serializable = true)
    public <S extends T> e5<S> v0() {
        return new z5(this);
    }

    public <E extends T> List<E> w0(Iterable<E> iterable) {
        Object[] P = c4.P(iterable);
        Arrays.sort(P, this);
        return l4.r(Arrays.asList(P));
    }

    public <E extends T> List<E> y(Iterable<E> iterable, int i4) {
        return v0().E(iterable, i4);
    }

    public <E extends T> List<E> z(Iterator<E> it, int i4) {
        return v0().F(it, i4);
    }
}
