package com.google.common.collect;

import com.google.common.collect.c4;
import com.google.common.collect.d4;
import com.google.common.collect.l4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: FluentIterable.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class o1<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.base.g0<Iterable<E>> f55987b;

    /* compiled from: FluentIterable.java */
    class a extends o1<E> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f55988c = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f55988c.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FluentIterable.java */
    class b<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55989c;

        b(Iterable iterable) {
            this.f55989c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new d4.m(d4.c0(this.f55989c.iterator(), new c4.a()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FluentIterable.java */
    class c<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable[] f55990c;

        /* compiled from: FluentIterable.java */
        class a extends com.google.common.collect.b<Iterator<? extends T>> {
            a(int i4) {
                super(i4, 0);
            }

            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i4) {
                return c.this.f55990c[i4].iterator();
            }
        }

        c(Iterable[] iterableArr) {
            this.f55990c = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new d4.m(new a(this.f55990c.length));
        }
    }

    /* compiled from: FluentIterable.java */
    private static class d<E> implements com.google.common.base.x<Iterable<E>, o1<E>> {
        private d() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o1<E> apply(Iterable<E> iterable) {
            return o1.F(iterable);
        }
    }

    protected o1() {
        this.f55987b = com.google.common.base.g0.a();
    }

    @f9.l(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> o1<E> D(o1<E> o1Var) {
        o1Var.getClass();
        return o1Var;
    }

    public static <E> o1<E> F(Iterable<E> iterable) {
        return iterable instanceof o1 ? (o1) iterable : new a(iterable, iterable);
    }

    @d9.a
    public static <E> o1<E> G(E[] eArr) {
        return F(Arrays.asList(eArr));
    }

    private Iterable<E> H() {
        return this.f55987b.i(this);
    }

    @d9.a
    public static <E> o1<E> P() {
        return F(Collections.emptyList());
    }

    @d9.a
    public static <E> o1<E> Q(@f5 E e4, E... eArr) {
        return F(new l4.e(e4, eArr));
    }

    @d9.a
    public static <T> o1<T> i(Iterable<? extends Iterable<? extends T>> iterable) {
        iterable.getClass();
        return new b(iterable);
    }

    @d9.a
    public static <T> o1<T> j(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return q(iterable, iterable2);
    }

    @d9.a
    public static <T> o1<T> l(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return q(iterable, iterable2, iterable3);
    }

    @d9.a
    public static <T> o1<T> m(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return q(iterable, iterable2, iterable3, iterable4);
    }

    @d9.a
    public static <T> o1<T> p(Iterable<? extends T>... iterableArr) {
        return q((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    private static <T> o1<T> q(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            iterable.getClass();
        }
        return new c(iterableArr);
    }

    public final com.google.common.base.g0<E> A(com.google.common.base.m0<? super E> m0Var) {
        return c4.V(H(), m0Var);
    }

    public final <K> g3<K, E> I(com.google.common.base.x<? super E, K> xVar) {
        return t4.r(H(), xVar);
    }

    @d9.a
    public final String K(com.google.common.base.c0 c0Var) {
        return c0Var.k(this);
    }

    public final com.google.common.base.g0<E> L() {
        E next;
        Iterable<E> H = H();
        if (H instanceof List) {
            List list = (List) H;
            return list.isEmpty() ? com.google.common.base.g0.a() : com.google.common.base.g0.f(list.get(list.size() - 1));
        }
        Iterator<E> it = H.iterator();
        if (!it.hasNext()) {
            return com.google.common.base.g0.a();
        }
        if (H instanceof SortedSet) {
            return com.google.common.base.g0.f(((SortedSet) H).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return com.google.common.base.g0.f(next);
    }

    public final o1<E> O(int i4) {
        return F(c4.D(H(), i4));
    }

    public final o1<E> R(int i4) {
        return F(c4.N(H(), i4));
    }

    @d9.c
    public final E[] S(Class<E> cls) {
        return (E[]) c4.Q(H(), cls);
    }

    public final f3<E> T() {
        return f3.w(H());
    }

    public final <V> h3<E, V> U(com.google.common.base.x<? super E, V> xVar) {
        return p4.u0(H(), xVar);
    }

    public final m3<E> V() {
        return m3.s(H());
    }

    public final q3<E> W() {
        return q3.x(H());
    }

    public final f3<E> X(Comparator<? super E> comparator) {
        return e5.u(comparator).B(H());
    }

    public final w3<E> Z(Comparator<? super E> comparator) {
        return w3.h0(comparator, H());
    }

    public final <T> o1<T> a0(com.google.common.base.x<? super E, T> xVar) {
        return F(c4.U(H(), xVar));
    }

    public final boolean b(com.google.common.base.m0<? super E> m0Var) {
        return c4.b(H(), m0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> o1<T> b0(com.google.common.base.x<? super E, ? extends Iterable<? extends T>> xVar) {
        return i(a0(xVar));
    }

    public final boolean c(com.google.common.base.m0<? super E> m0Var) {
        return c4.c(H(), m0Var);
    }

    public final boolean contains(@zc.a Object obj) {
        return c4.k(H(), obj);
    }

    public final <K> h3<K, E> d0(com.google.common.base.x<? super E, K> xVar) {
        return p4.E0(H(), xVar);
    }

    @d9.a
    public final o1<E> f(Iterable<? extends E> iterable) {
        return j(H(), iterable);
    }

    @f5
    public final E get(int i4) {
        return (E) c4.t(H(), i4);
    }

    @d9.a
    public final o1<E> h(E... eArr) {
        return j(H(), Arrays.asList(eArr));
    }

    public final boolean isEmpty() {
        return !H().iterator().hasNext();
    }

    @f9.a
    public final <C extends Collection<? super E>> C r(C c5) {
        c5.getClass();
        Iterable<E> H = H();
        if (H instanceof Collection) {
            c5.addAll((Collection) H);
        } else {
            Iterator<E> it = H.iterator();
            while (it.hasNext()) {
                c5.add(it.next());
            }
        }
        return c5;
    }

    public final o1<E> s() {
        return F(c4.l(H()));
    }

    public final int size() {
        return c4.M(H());
    }

    public String toString() {
        return c4.T(H());
    }

    public final o1<E> v(com.google.common.base.m0<? super E> m0Var) {
        return F(c4.o(H(), m0Var));
    }

    @d9.c
    public final <T> o1<T> w(Class<T> cls) {
        return F(c4.p(H(), cls));
    }

    public final com.google.common.base.g0<E> x() {
        Iterator<E> it = H().iterator();
        return it.hasNext() ? com.google.common.base.g0.f(it.next()) : com.google.common.base.g0.a();
    }

    o1(Iterable<E> iterable) {
        this.f55987b = com.google.common.base.g0.f(iterable);
    }
}
