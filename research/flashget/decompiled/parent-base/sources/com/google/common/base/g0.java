package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Optional.java */
@f9.f("Use Optional.of(value) or Optional.absent()")
@o
@d9.b(serializable = true)
/* loaded from: classes6.dex */
public abstract class g0<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final long f54941b = 0;

    /* compiled from: Optional.java */
    class a implements Iterable<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f54942b;

        /* compiled from: Optional.java */
        /* renamed from: com.google.common.base.g0$a$a, reason: collision with other inner class name */
        class C0829a extends b<T> {

            /* renamed from: d, reason: collision with root package name */
            private final Iterator<? extends g0<? extends T>> f54943d;

            C0829a() {
                Iterator<? extends g0<? extends T>> it = a.this.f54942b.iterator();
                it.getClass();
                this.f54943d = it;
            }

            @Override // com.google.common.base.b
            @zc.a
            protected T a() {
                while (this.f54943d.hasNext()) {
                    g0<? extends T> next = this.f54943d.next();
                    if (next.e()) {
                        return next.d();
                    }
                }
                return b();
            }
        }

        a(Iterable iterable) {
            this.f54942b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0829a();
        }
    }

    g0() {
    }

    public static <T> g0<T> a() {
        return com.google.common.base.a.n();
    }

    public static <T> g0<T> c(@zc.a T t4) {
        return t4 == null ? com.google.common.base.a.n() : new o0(t4);
    }

    public static <T> g0<T> f(T t4) {
        t4.getClass();
        return new o0(t4);
    }

    @d9.a
    public static <T> Iterable<T> k(Iterable<? extends g0<? extends T>> iterable) {
        iterable.getClass();
        return new a(iterable);
    }

    public abstract Set<T> b();

    public abstract T d();

    public abstract boolean e();

    public abstract boolean equals(@zc.a Object obj);

    public abstract g0<T> g(g0<? extends T> g0Var);

    @d9.a
    public abstract T h(u0<? extends T> u0Var);

    public abstract int hashCode();

    public abstract T i(T t4);

    @zc.a
    public abstract T j();

    public abstract <V> g0<V> l(x<? super T, V> xVar);

    public abstract String toString();
}
