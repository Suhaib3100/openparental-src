package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.c;
import com.annimon.stream.function.f0;
import com.annimon.stream.function.i0;
import com.annimon.stream.function.q;
import com.annimon.stream.function.r;
import com.annimon.stream.function.s;
import com.annimon.stream.function.v1;
import com.annimon.stream.function.x;
import com.annimon.stream.function.z0;
import com.annimon.stream.operator.a2;
import com.annimon.stream.operator.b2;
import com.annimon.stream.operator.c2;
import com.annimon.stream.operator.d2;
import com.annimon.stream.operator.e2;
import com.annimon.stream.operator.f2;
import com.annimon.stream.operator.g2;
import com.annimon.stream.operator.h2;
import com.annimon.stream.operator.i2;
import com.annimon.stream.operator.j2;
import com.annimon.stream.operator.k2;
import com.annimon.stream.operator.l2;
import com.annimon.stream.operator.m2;
import com.annimon.stream.operator.n2;
import com.annimon.stream.operator.o2;
import com.annimon.stream.operator.p2;
import com.annimon.stream.operator.q2;
import com.annimon.stream.operator.r1;
import com.annimon.stream.operator.r2;
import com.annimon.stream.operator.s1;
import com.annimon.stream.operator.s2;
import com.annimon.stream.operator.t1;
import com.annimon.stream.operator.t2;
import com.annimon.stream.operator.u1;
import com.annimon.stream.operator.u2;
import com.annimon.stream.operator.v2;
import com.annimon.stream.operator.w1;
import com.annimon.stream.operator.w2;
import com.annimon.stream.operator.x1;
import com.annimon.stream.operator.x2;
import com.annimon.stream.operator.y1;
import com.annimon.stream.operator.z1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: Stream.java */
/* loaded from: classes3.dex */
public class p<T> implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private static final int f41839d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f41840e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f41841f = 2;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41842b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.internal.d f41843c;

    /* compiled from: Stream.java */
    class a implements z0<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f41844a;

        a(Class cls) {
            this.f41844a = cls;
        }

        @Override // com.annimon.stream.function.z0
        public boolean test(T t4) {
            return this.f41844a.isInstance(t4);
        }
    }

    /* compiled from: Stream.java */
    class b implements z0<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f41846a;

        b(Object obj) {
            this.f41846a = obj;
        }

        @Override // com.annimon.stream.function.z0
        public boolean test(T t4) {
            return i.e(t4, this.f41846a);
        }
    }

    /* compiled from: Stream.java */
    class c implements x<T, com.annimon.stream.f<T>> {
        c() {
        }

        @Override // com.annimon.stream.function.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.annimon.stream.f<T> a(int i4, T t4) {
            return new com.annimon.stream.f<>(i4, t4);
        }
    }

    /* compiled from: Stream.java */
    class d implements Comparator<T> {
        d() {
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return ((Comparable) t4).compareTo((Comparable) t5);
        }
    }

    /* compiled from: Stream.java */
    class e implements q<List<T>, T> {
        e() {
        }

        @Override // com.annimon.stream.function.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(List<T> list) {
            return list.get(0);
        }
    }

    /* compiled from: Stream.java */
    class f implements i0<Object[]> {
        f() {
        }

        @Override // com.annimon.stream.function.i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] c(int i4) {
            return new Object[i4];
        }
    }

    /* compiled from: Stream.java */
    class g implements com.annimon.stream.function.c<T> {
        g() {
        }

        @Override // com.annimon.stream.function.b
        public T apply(T t4, T t5) {
            return t5;
        }
    }

    private p(Iterator<? extends T> it) {
        this((com.annimon.stream.internal.d) null, it);
    }

    public static <T> p<T> B0(p<? extends T> pVar, p<? extends T> pVar2, com.annimon.stream.function.b<? super T, ? super T, m2.b> bVar) {
        pVar.getClass();
        pVar2.getClass();
        return C0(((p) pVar).f41842b, ((p) pVar2).f41842b, bVar);
    }

    public static p<Long> B1(long j4, long j5) {
        return h.n0(j4, j5).c();
    }

    public static <T> p<T> C0(Iterator<? extends T> it, Iterator<? extends T> it2, com.annimon.stream.function.b<? super T, ? super T, m2.b> bVar) {
        it.getClass();
        it2.getClass();
        return new p<>((com.annimon.stream.internal.d) null, new m2(it, it2, bVar));
    }

    public static <F, S, R> p<R> I2(p<? extends F> pVar, p<? extends S> pVar2, com.annimon.stream.function.b<? super F, ? super S, ? extends R> bVar) {
        pVar.getClass();
        pVar2.getClass();
        return M2(((p) pVar).f41842b, ((p) pVar2).f41842b, bVar);
    }

    public static <T> p<T> M(a1<T> a1Var) {
        a1Var.getClass();
        return new p<>((com.annimon.stream.internal.d) null, new e2(a1Var));
    }

    public static <F, S, R> p<R> M2(Iterator<? extends F> it, Iterator<? extends S> it2, com.annimon.stream.function.b<? super F, ? super S, ? extends R> bVar) {
        it.getClass();
        it2.getClass();
        return new p<>((com.annimon.stream.internal.d) null, new x2(it, it2, bVar));
    }

    public static <T> p<T> N0(Iterable<? extends T> iterable) {
        iterable.getClass();
        return new p<>(iterable);
    }

    public static <T> p<T> O0(Iterator<? extends T> it) {
        it.getClass();
        return new p<>((com.annimon.stream.internal.d) null, it);
    }

    public static <T> p<T> S(T t4, z0<? super T> z0Var, v1<T> v1Var) {
        z0Var.getClass();
        return X(t4, v1Var).w2(z0Var);
    }

    public static <K, V> p<Map.Entry<K, V>> S0(Map<K, V> map) {
        map.getClass();
        return new p<>(map.entrySet());
    }

    public static <T> p<T> U0(T... tArr) {
        tArr.getClass();
        return tArr.length == 0 ? q() : new p<>((com.annimon.stream.internal.d) null, new r1(tArr));
    }

    public static <T> p<T> X(T t4, v1<T> v1Var) {
        v1Var.getClass();
        return new p<>((com.annimon.stream.internal.d) null, new f2(t4, v1Var));
    }

    public static <T> p<T> c1(Iterable<? extends T> iterable) {
        return iterable == null ? q() : N0(iterable);
    }

    public static <T> p<T> d1(T t4) {
        return t4 == null ? q() : U0(t4);
    }

    public static <T> p<T> e1(Iterator<? extends T> it) {
        return it == null ? q() : O0(it);
    }

    public static <T> p<T> f(p<? extends T> pVar, p<? extends T> pVar2) {
        pVar.getClass();
        pVar2.getClass();
        return new p((com.annimon.stream.internal.d) null, new t1(((p) pVar).f41842b, ((p) pVar2).f41842b)).k1(com.annimon.stream.internal.b.a(pVar, pVar2));
    }

    public static <T> p<T> g(Iterator<? extends T> it, Iterator<? extends T> it2) {
        it.getClass();
        it2.getClass();
        return new p<>((com.annimon.stream.internal.d) null, new t1(it, it2));
    }

    public static <K, V> p<Map.Entry<K, V>> g1(Map<K, V> map) {
        return map == null ? q() : S0(map);
    }

    public static <T> p<T> j1(T[] tArr) {
        return tArr == null ? q() : U0(tArr);
    }

    public static p<Integer> n1(int i4, int i5) {
        return com.annimon.stream.g.n0(i4, i5).c();
    }

    public static <T> p<T> q() {
        return N0(Collections.emptyList());
    }

    public static p<Long> t1(long j4, long j5) {
        return h.j0(j4, j5).c();
    }

    private boolean u0(z0<? super T> z0Var, int i4) {
        boolean z4 = i4 == 0;
        boolean z5 = i4 == 1;
        while (this.f41842b.hasNext()) {
            boolean test = z0Var.test(this.f41842b.next());
            if (test ^ z5) {
                return z4 && test;
            }
        }
        return !z4;
    }

    public static p<Integer> y1(int i4, int i5) {
        return com.annimon.stream.g.o0(i4, i5).c();
    }

    public j<T> A0(Comparator<? super T> comparator) {
        return D1(c.a.a(comparator));
    }

    public p<T> A2(f0<? super T> f0Var) {
        return x2(0, 1, f0Var);
    }

    public j<com.annimon.stream.f<T>> B(int i4, int i5, f0<? super T> f0Var) {
        while (this.f41842b.hasNext()) {
            T next = this.f41842b.next();
            if (f0Var.a(i4, next)) {
                return j.r(new com.annimon.stream.f(i4, next));
            }
            i4 += i5;
        }
        return j.b();
    }

    public Object[] B2() {
        return D2(new f());
    }

    public j<com.annimon.stream.f<T>> C(f0<? super T> f0Var) {
        return B(0, 1, f0Var);
    }

    public j<T> D() {
        return D1(new g());
    }

    public j<T> D1(com.annimon.stream.function.b<T, T, T> bVar) {
        boolean z4 = false;
        T t4 = null;
        while (this.f41842b.hasNext()) {
            T next = this.f41842b.next();
            if (z4) {
                t4 = bVar.apply(t4, next);
            } else {
                z4 = true;
                t4 = next;
            }
        }
        return z4 ? j.r(t4) : j.b();
    }

    public <R> R[] D2(i0<R[]> i0Var) {
        return (R[]) com.annimon.stream.internal.c.a(this.f41842b, i0Var);
    }

    public j<T> E() {
        if (!this.f41842b.hasNext()) {
            return j.b();
        }
        T next = this.f41842b.next();
        if (this.f41842b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("߯"));
        }
        return j.r(next);
    }

    public <R> p<R> F(q<? super T, ? extends p<? extends R>> qVar) {
        return new p<>(this.f41843c, new a2(this.f41842b, qVar));
    }

    public com.annimon.stream.d G(q<? super T, ? extends com.annimon.stream.d> qVar) {
        return new com.annimon.stream.d(this.f41843c, new b2(this.f41842b, qVar));
    }

    public List<T> G2() {
        ArrayList arrayList = new ArrayList();
        while (this.f41842b.hasNext()) {
            arrayList.add(this.f41842b.next());
        }
        return arrayList;
    }

    public com.annimon.stream.g H(q<? super T, ? extends com.annimon.stream.g> qVar) {
        return new com.annimon.stream.g(this.f41843c, new c2(this.f41842b, qVar));
    }

    public j<T> H0(Comparator<? super T> comparator) {
        return D1(c.a.b(comparator));
    }

    public <R> R H1(R r4, com.annimon.stream.function.b<? super R, ? super T, ? extends R> bVar) {
        while (this.f41842b.hasNext()) {
            r4 = bVar.apply(r4, this.f41842b.next());
        }
        return r4;
    }

    public p<T> H2() {
        return t(z0.a.d());
    }

    public h I(q<? super T, ? extends h> qVar) {
        return new h(this.f41843c, new d2(this.f41842b, qVar));
    }

    public void J(com.annimon.stream.function.h<? super T> hVar) {
        while (this.f41842b.hasNext()) {
            hVar.accept(this.f41842b.next());
        }
    }

    public void K(int i4, int i5, s<? super T> sVar) {
        while (this.f41842b.hasNext()) {
            sVar.a(i4, this.f41842b.next());
            i4 += i5;
        }
    }

    public boolean K0(z0<? super T> z0Var) {
        return u0(z0Var, 2);
    }

    public <R> R K1(int i4, int i5, R r4, r<? super R, ? super T, ? extends R> rVar) {
        while (this.f41842b.hasNext()) {
            r4 = rVar.a(i4, r4, this.f41842b.next());
            i4 += i5;
        }
        return r4;
    }

    public void L(s<? super T> sVar) {
        K(0, 1, sVar);
    }

    public <R> R L1(R r4, r<? super R, ? super T, ? extends R> rVar) {
        return (R) K1(0, 1, r4, rVar);
    }

    public p<T> M0() {
        return y(z0.a.d());
    }

    public p<T> M1(int i4) {
        if (i4 > 0) {
            return i4 == 1 ? this : (p<T>) f2(1, i4).c0(new e());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߰"));
    }

    public <K> p<Map.Entry<K, List<T>>> N(q<? super T, ? extends K> qVar) {
        return new p<>(this.f41843c, ((Map) d(com.annimon.stream.b.n(qVar))).entrySet());
    }

    public p<com.annimon.stream.f<T>> O() {
        return Q(0, 1);
    }

    public p<com.annimon.stream.f<T>> Q(int i4, int i5) {
        return (p<com.annimon.stream.f<T>>) j0(i4, i5, new c());
    }

    public p<T> S1(com.annimon.stream.function.b<T, T, T> bVar) {
        bVar.getClass();
        return new p<>(this.f41843c, new o2(this.f41842b, bVar));
    }

    public <R> p<R> T1(R r4, com.annimon.stream.function.b<? super R, ? super T, ? extends R> bVar) {
        bVar.getClass();
        return new p<>(this.f41843c, new p2(this.f41842b, r4, bVar));
    }

    public <TT> p<TT> W1(Class<TT> cls) {
        return t(new a(cls));
    }

    public p<T> Y(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? q() : new p<>(this.f41843c, new g2(this.f41842b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߱"));
    }

    public boolean a(z0<? super T> z0Var) {
        return u0(z0Var, 1);
    }

    public T a2() {
        if (!this.f41842b.hasNext()) {
            throw new NoSuchElementException(ProtectedSandApp.s("߲"));
        }
        T next = this.f41842b.next();
        if (this.f41842b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("߯"));
        }
        return next;
    }

    public boolean b(z0<? super T> z0Var) {
        return u0(z0Var, 0);
    }

    public <K> p<List<T>> c(q<? super T, ? extends K> qVar) {
        return new p<>(this.f41843c, new s1(this.f41842b, qVar));
    }

    public <R> p<R> c0(q<? super T, ? extends R> qVar) {
        return new p<>(this.f41843c, new h2(this.f41842b, qVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Runnable runnable;
        com.annimon.stream.internal.d dVar = this.f41843c;
        if (dVar == null || (runnable = dVar.f41494a) == null) {
            return;
        }
        runnable.run();
        this.f41843c.f41494a = null;
    }

    public <R, A> R d(com.annimon.stream.a<? super T, A, R> aVar) {
        A a5 = aVar.supplier().get();
        while (this.f41842b.hasNext()) {
            aVar.accumulator().accept(a5, this.f41842b.next());
        }
        return aVar.finisher() != null ? aVar.finisher().apply(a5) : (R) com.annimon.stream.b.h().apply(a5);
    }

    public p<T> d2(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? this : new p<>(this.f41843c, new q2(this.f41842b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߳"));
    }

    public <R> R e(a1<R> a1Var, com.annimon.stream.function.a<R, ? super T> aVar) {
        R r4 = a1Var.get();
        while (this.f41842b.hasNext()) {
            aVar.accept(r4, this.f41842b.next());
        }
        return r4;
    }

    public p<List<T>> e2(int i4) {
        return f2(i4, 1);
    }

    public p<List<T>> f2(int i4, int i5) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ߴ"));
        }
        if (i5 > 0) {
            return new p<>(this.f41843c, new r2(this.f41842b, i4, i5));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߰"));
    }

    public <R extends Comparable<? super R>> p<T> g2(q<? super T, ? extends R> qVar) {
        return m2(com.annimon.stream.c.g(qVar));
    }

    public long h() {
        long j4 = 0;
        while (this.f41842b.hasNext()) {
            this.f41842b.next();
            j4++;
        }
        return j4;
    }

    public <R> R i(q<p<T>, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public Iterator<? extends T> iterator() {
        return this.f41842b;
    }

    public <R> p<R> j0(int i4, int i5, x<? super T, ? extends R> xVar) {
        return new p<>(this.f41843c, new i2(new com.annimon.stream.iterator.a(i4, i5, this.f41842b), xVar));
    }

    public p<T> k() {
        return new p<>(this.f41843c, new u1(this.f41842b));
    }

    public p<T> k1(Runnable runnable) {
        runnable.getClass();
        com.annimon.stream.internal.d dVar = this.f41843c;
        if (dVar == null) {
            dVar = new com.annimon.stream.internal.d();
            dVar.f41494a = runnable;
        } else {
            dVar.f41494a = com.annimon.stream.internal.b.b(dVar.f41494a, runnable);
        }
        return new p<>(dVar, this.f41842b);
    }

    public <K> p<T> l(q<? super T, ? extends K> qVar) {
        return new p<>(this.f41843c, new com.annimon.stream.operator.v1(this.f41842b, qVar));
    }

    public p<T> l1(com.annimon.stream.function.h<? super T> hVar) {
        return new p<>(this.f41843c, new n2(this.f41842b, hVar));
    }

    public p<T> l2() {
        return m2(new d());
    }

    public p<T> m(z0<? super T> z0Var) {
        return new p<>(this.f41843c, new w1(this.f41842b, z0Var));
    }

    public p<T> m2(Comparator<? super T> comparator) {
        return new p<>(this.f41843c, new s2(this.f41842b, comparator));
    }

    public p<T> n(int i4, int i5, f0<? super T> f0Var) {
        return new p<>(this.f41843c, new x1(new com.annimon.stream.iterator.a(i4, i5, this.f41842b), f0Var));
    }

    public <R> p<R> n0(x<? super T, ? extends R> xVar) {
        return j0(0, 1, xVar);
    }

    public p<T> n2(z0<? super T> z0Var) {
        return new p<>(this.f41843c, new t2(this.f41842b, z0Var));
    }

    public p<T> o(f0<? super T> f0Var) {
        return n(0, 1, f0Var);
    }

    public com.annimon.stream.d o0(com.annimon.stream.function.s1<? super T> s1Var) {
        return new com.annimon.stream.d(this.f41843c, new j2(this.f41842b, s1Var));
    }

    public p<T> o2(int i4, int i5, f0<? super T> f0Var) {
        return new p<>(this.f41843c, new u2(new com.annimon.stream.iterator.a(i4, i5, this.f41842b), f0Var));
    }

    public com.annimon.stream.g q0(com.annimon.stream.function.t1<? super T> t1Var) {
        return new com.annimon.stream.g(this.f41843c, new k2(this.f41842b, t1Var));
    }

    public p<T> q2(f0<? super T> f0Var) {
        return o2(0, 1, f0Var);
    }

    public h r0(com.annimon.stream.function.u1<? super T> u1Var) {
        return new h(this.f41843c, new l2(this.f41842b, u1Var));
    }

    public p<T> s(T t4) {
        return t(new b(t4));
    }

    public p<T> t(z0<? super T> z0Var) {
        return new p<>(this.f41843c, new y1(this.f41842b, z0Var));
    }

    public p<T> u(int i4, int i5, f0<? super T> f0Var) {
        return new p<>(this.f41843c, new z1(new com.annimon.stream.iterator.a(i4, i5, this.f41842b), f0Var));
    }

    public p<T> w2(z0<? super T> z0Var) {
        return new p<>(this.f41843c, new v2(this.f41842b, z0Var));
    }

    public p<T> x(f0<? super T> f0Var) {
        return u(0, 1, f0Var);
    }

    public p<T> x2(int i4, int i5, f0<? super T> f0Var) {
        return new p<>(this.f41843c, new w2(new com.annimon.stream.iterator.a(i4, i5, this.f41842b), f0Var));
    }

    public p<T> y(z0<? super T> z0Var) {
        return t(z0.a.c(z0Var));
    }

    public j<T> z() {
        return this.f41842b.hasNext() ? j.r(this.f41842b.next()) : j.b();
    }

    private p(Iterable<? extends T> iterable) {
        this((com.annimon.stream.internal.d) null, new com.annimon.stream.iterator.b(iterable));
    }

    private p(com.annimon.stream.internal.d dVar, Iterable<? extends T> iterable) {
        this(dVar, new com.annimon.stream.iterator.b(iterable));
    }

    p(com.annimon.stream.internal.d dVar, Iterator<? extends T> it) {
        this.f41843c = dVar;
        this.f41842b = it;
    }
}
