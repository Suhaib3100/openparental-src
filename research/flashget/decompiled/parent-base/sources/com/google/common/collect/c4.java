package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: Iterables.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class c4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class a<T> implements com.google.common.base.x<Iterable<? extends T>, Iterator<? extends T>> {
        a() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class b<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55437c;

        b(Iterable iterable) {
            this.f55437c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.r(this.f55437c);
        }

        @Override // com.google.common.collect.o1
        public String toString() {
            return String.valueOf(this.f55437c.toString()).concat(ProtectedSandApp.s("\uf475"));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class c<T> extends o1<List<T>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55439d;

        c(Iterable iterable, int i4) {
            this.f55438c = iterable;
            this.f55439d = i4;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return d4.Q(this.f55438c.iterator(), this.f55439d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class d<T> extends o1<List<T>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55440c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55441d;

        d(Iterable iterable, int i4) {
            this.f55440c = iterable;
            this.f55441d = i4;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return d4.P(this.f55440c.iterator(), this.f55441d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class e<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.m0 f55443d;

        e(Iterable iterable, com.google.common.base.m0 m0Var) {
            this.f55442c = iterable;
            this.f55443d = m0Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.x(this.f55442c.iterator(), this.f55443d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class f<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55444c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f55445d;

        f(Iterable iterable, com.google.common.base.x xVar) {
            this.f55444c = iterable;
            this.f55445d = xVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.c0(this.f55444c.iterator(), this.f55445d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class g<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55447d;

        /* compiled from: Iterables.java */
        class a implements Iterator<T> {

            /* renamed from: b, reason: collision with root package name */
            boolean f55448b = true;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f55449c;

            a(g gVar, Iterator it) {
                this.f55449c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55449c.hasNext();
            }

            @Override // java.util.Iterator
            @f5
            public T next() {
                T t4 = (T) this.f55449c.next();
                this.f55448b = false;
                return t4;
            }

            @Override // java.util.Iterator
            public void remove() {
                b0.e(!this.f55448b);
                this.f55449c.remove();
            }
        }

        g(Iterable iterable, int i4) {
            this.f55446c = iterable;
            this.f55447d = i4;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f55446c;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f55447d), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            d4.b(it, this.f55447d);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class h<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55450c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55451d;

        h(Iterable iterable, int i4) {
            this.f55450c = iterable;
            this.f55451d = i4;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.N(this.f55450c.iterator(), this.f55451d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class i<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55452c;

        i(Iterable iterable) {
            this.f55452c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f55452c;
            return iterable instanceof Queue ? new n0((Queue) iterable) : d4.p(iterable.iterator());
        }

        @Override // com.google.common.collect.o1
        public String toString() {
            return ProtectedSandApp.s("\uf476");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    class j<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55453c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Comparator f55454d;

        j(Iterable iterable, Comparator comparator) {
            this.f55453c = iterable;
            this.f55454d = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.O(c4.U(this.f55453c, new a()), this.f55454d);
        }
    }

    /* compiled from: Iterables.java */
    private static final class k<T> extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        private final Iterable<? extends T> f55455c;

        /* synthetic */ k(Iterable iterable, b bVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return d4.f0(this.f55455c.iterator());
        }

        @Override // com.google.common.collect.o1
        public String toString() {
            return this.f55455c.toString();
        }

        private k(Iterable<? extends T> iterable) {
            this.f55455c = iterable;
        }
    }

    private c4() {
    }

    @f5
    public static <T> T A(Iterable<? extends T> iterable, @f5 T t4) {
        return (T) d4.L(iterable.iterator(), t4);
    }

    public static <T> int B(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        return d4.M(iterable.iterator(), m0Var);
    }

    public static boolean C(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> D(Iterable<T> iterable, int i4) {
        iterable.getClass();
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf477"));
        return new h(iterable, i4);
    }

    @d9.a
    public static <T> Iterable<T> E(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.l0.F(iterable, ProtectedSandApp.s("\uf478"));
        com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf479"));
        return new k(new j(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> F(Iterable<T> iterable, int i4) {
        iterable.getClass();
        com.google.common.base.l0.d(i4 > 0);
        return new d(iterable, i4);
    }

    public static <T> Iterable<List<T>> G(Iterable<T> iterable, int i4) {
        iterable.getClass();
        com.google.common.base.l0.d(i4 > 0);
        return new c(iterable, i4);
    }

    @f9.a
    public static boolean H(Iterable<?> iterable, Collection<?> collection) {
        if (!(iterable instanceof Collection)) {
            return d4.V(iterable.iterator(), collection);
        }
        collection.getClass();
        return ((Collection) iterable).removeAll(collection);
    }

    @zc.a
    static <T> T I(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        m0Var.getClass();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (m0Var.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @f9.a
    public static <T> boolean J(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return d4.W(iterable.iterator(), m0Var);
        }
        m0Var.getClass();
        return K((List) iterable, m0Var);
    }

    private static <T> boolean K(List<T> list, com.google.common.base.m0<? super T> m0Var) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < list.size()) {
            T t4 = list.get(i4);
            if (!m0Var.apply(t4)) {
                if (i4 > i5) {
                    try {
                        list.set(i5, t4);
                    } catch (IllegalArgumentException unused) {
                        O(list, m0Var, i5, i4);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        O(list, m0Var, i5, i4);
                        return true;
                    }
                }
                i5++;
            }
            i4++;
        }
        list.subList(i5, list.size()).clear();
        return i4 != i5;
    }

    @f9.a
    public static boolean L(Iterable<?> iterable, Collection<?> collection) {
        if (!(iterable instanceof Collection)) {
            return d4.X(iterable.iterator(), collection);
        }
        collection.getClass();
        return ((Collection) iterable).retainAll(collection);
    }

    public static int M(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : d4.Z(iterable.iterator());
    }

    public static <T> Iterable<T> N(Iterable<T> iterable, int i4) {
        iterable.getClass();
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf47a"));
        return new g(iterable, i4);
    }

    private static <T> void O(List<T> list, com.google.common.base.m0<? super T> m0Var, int i4, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (m0Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            list.remove(i6);
        }
    }

    static Object[] P(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    @d9.c
    public static <T> T[] Q(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) R(iterable, (Object[]) Array.newInstance((Class<?>) cls, 0));
    }

    static <T> T[] R(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) d(iterable).toArray(tArr);
    }

    static <T> com.google.common.base.x<Iterable<? extends T>, Iterator<? extends T>> S() {
        return new a();
    }

    public static String T(Iterable<?> iterable) {
        return d4.b0(iterable.iterator());
    }

    public static <F, T> Iterable<T> U(Iterable<F> iterable, com.google.common.base.x<? super F, ? extends T> xVar) {
        iterable.getClass();
        xVar.getClass();
        return new f(iterable, xVar);
    }

    public static <T> com.google.common.base.g0<T> V(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        return d4.d0(iterable.iterator(), m0Var);
    }

    @Deprecated
    public static <E> Iterable<E> W(b3<E> b3Var) {
        b3Var.getClass();
        return b3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> X(Iterable<? extends T> iterable) {
        iterable.getClass();
        return ((iterable instanceof k) || (iterable instanceof b3)) ? iterable : new k(iterable, null);
    }

    @f9.a
    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return d4.a(collection, iterable.iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        return d4.c(iterable.iterator(), m0Var);
    }

    public static <T> boolean c(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        return d4.d(iterable.iterator(), m0Var);
    }

    private static <E> Collection<E> d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : l4.s(iterable.iterator());
    }

    public static <T> Iterable<T> e(Iterable<? extends Iterable<? extends T>> iterable) {
        return o1.i(iterable);
    }

    public static <T> Iterable<T> f(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return o1.j(iterable, iterable2);
    }

    public static <T> Iterable<T> g(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return o1.l(iterable, iterable2, iterable3);
    }

    public static <T> Iterable<T> h(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return o1.m(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> i(Iterable<? extends T>... iterableArr) {
        return o1.p(iterableArr);
    }

    public static <T> Iterable<T> j(Iterable<T> iterable) {
        iterable.getClass();
        return new i(iterable);
    }

    public static boolean k(Iterable<? extends Object> iterable, @zc.a Object obj) {
        return iterable instanceof Collection ? c0.j((Collection) iterable, obj) : d4.q(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> l(Iterable<T> iterable) {
        iterable.getClass();
        return new b(iterable);
    }

    @SafeVarargs
    public static <T> Iterable<T> m(T... tArr) {
        return l(l4.t(tArr));
    }

    public static boolean n(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return d4.t(iterable.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> o(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        iterable.getClass();
        m0Var.getClass();
        return new e(iterable, m0Var);
    }

    @d9.c
    public static <T> Iterable<T> p(Iterable<?> iterable, Class<T> cls) {
        iterable.getClass();
        cls.getClass();
        return o(iterable, com.google.common.base.n0.o(cls));
    }

    @f5
    public static <T> T q(Iterable<T> iterable, com.google.common.base.m0<? super T> m0Var) {
        return (T) d4.z(iterable.iterator(), m0Var);
    }

    @zc.a
    public static <T> T r(Iterable<? extends T> iterable, com.google.common.base.m0<? super T> m0Var, @zc.a T t4) {
        return (T) d4.A(iterable.iterator(), m0Var, t4);
    }

    public static int s(Iterable<?> iterable, @zc.a Object obj) {
        return iterable instanceof u4 ? ((u4) iterable).W2(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : d4.E(iterable.iterator(), obj);
    }

    @f5
    public static <T> T t(Iterable<T> iterable, int i4) {
        iterable.getClass();
        return iterable instanceof List ? (T) ((List) iterable).get(i4) : (T) d4.F(iterable.iterator(), i4);
    }

    @f5
    public static <T> T u(Iterable<? extends T> iterable, int i4, @f5 T t4) {
        iterable.getClass();
        d4.g(i4);
        if (iterable instanceof List) {
            List list = (List) iterable;
            return i4 < list.size() ? (T) list.get(i4) : t4;
        }
        Iterator<? extends T> it = iterable.iterator();
        d4.b(it, i4);
        return (T) d4.J(it, t4);
    }

    @f5
    public static <T> T v(Iterable<? extends T> iterable, @f5 T t4) {
        return (T) d4.J(iterable.iterator(), t4);
    }

    @f5
    public static <T> T w(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) d4.H(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) y(list);
    }

    @f5
    public static <T> T x(Iterable<? extends T> iterable, @f5 T t4) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t4;
            }
            if (iterable instanceof List) {
                return (T) y((List) iterable);
            }
        }
        return (T) d4.I(iterable.iterator(), t4);
    }

    @f5
    private static <T> T y(List<T> list) {
        return (T) androidx.appcompat.view.menu.d.a(list, 1);
    }

    @f5
    public static <T> T z(Iterable<T> iterable) {
        return (T) d4.K(iterable.iterator());
    }
}
