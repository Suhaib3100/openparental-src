package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Functions.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class z {

    /* compiled from: Functions.java */
    private static class b<E> implements x<Object, E>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55078c = 0;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private final E f55079b;

        public b(@i0 E e4) {
            this.f55079b = e4;
        }

        @Override // com.google.common.base.x
        @i0
        public E apply(@zc.a Object obj) {
            return this.f55079b;
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof b) {
                return f0.a(this.f55079b, ((b) obj).f55079b);
            }
            return false;
        }

        public int hashCode() {
            E e4 = this.f55079b;
            if (e4 == null) {
                return 0;
            }
            return e4.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55079b);
            return com.google.common.base.h.a(valueOf.length() + 20, ProtectedSandApp.s("\uf3bb"), valueOf, ProtectedSandApp.s("\uf3bc"));
        }
    }

    /* compiled from: Functions.java */
    private static class c<K, V> implements x<K, V>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55080d = 0;

        /* renamed from: b, reason: collision with root package name */
        final Map<K, ? extends V> f55081b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        final V f55082c;

        c(Map<K, ? extends V> map, @i0 V v4) {
            map.getClass();
            this.f55081b = map;
            this.f55082c = v4;
        }

        @Override // com.google.common.base.x
        @i0
        public V apply(@i0 K k4) {
            V v4 = this.f55081b.get(k4);
            return (v4 != null || this.f55081b.containsKey(k4)) ? v4 : this.f55082c;
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f55081b.equals(cVar.f55081b) && f0.a(this.f55082c, cVar.f55082c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f55081b, this.f55082c});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55081b);
            String valueOf2 = String.valueOf(this.f55082c);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 33, ProtectedSandApp.s("\uf3bd"), valueOf, ProtectedSandApp.s("\uf3be"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf3bf"));
            return a5.toString();
        }
    }

    /* compiled from: Functions.java */
    private static class d<A, B, C> implements x<A, C>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55083d = 0;

        /* renamed from: b, reason: collision with root package name */
        private final x<B, C> f55084b;

        /* renamed from: c, reason: collision with root package name */
        private final x<A, ? extends B> f55085c;

        public d(x<B, C> xVar, x<A, ? extends B> xVar2) {
            xVar.getClass();
            this.f55084b = xVar;
            xVar2.getClass();
            this.f55085c = xVar2;
        }

        @Override // com.google.common.base.x
        @i0
        public C apply(@i0 A a5) {
            return (C) this.f55084b.apply(this.f55085c.apply(a5));
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f55085c.equals(dVar.f55085c) && this.f55084b.equals(dVar.f55084b);
        }

        public int hashCode() {
            return this.f55085c.hashCode() ^ this.f55084b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55084b);
            String valueOf2 = String.valueOf(this.f55085c);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 2, valueOf, ProtectedSandApp.s("\uf3c0"), valueOf2, ProtectedSandApp.s("\uf3c1"));
        }
    }

    /* compiled from: Functions.java */
    private static class e<K, V> implements x<K, V>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55086c = 0;

        /* renamed from: b, reason: collision with root package name */
        final Map<K, V> f55087b;

        e(Map<K, V> map) {
            map.getClass();
            this.f55087b = map;
        }

        @Override // com.google.common.base.x
        @i0
        public V apply(@i0 K k4) {
            V v4 = this.f55087b.get(k4);
            l0.u(v4 != null || this.f55087b.containsKey(k4), ProtectedSandApp.s("\uf3c2"), k4);
            return v4;
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof e) {
                return this.f55087b.equals(((e) obj).f55087b);
            }
            return false;
        }

        public int hashCode() {
            return this.f55087b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55087b);
            return com.google.common.base.h.a(valueOf.length() + 18, ProtectedSandApp.s("\uf3c3"), valueOf, ProtectedSandApp.s("\uf3c4"));
        }
    }

    /* compiled from: Functions.java */
    private enum f implements x<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.x
        @zc.a
        public Object apply(@zc.a Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf3c6");
        }
    }

    /* compiled from: Functions.java */
    private static class g<T> implements x<T, Boolean>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55088c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final m0<T> f55089b;

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(@i0 T t4) {
            return Boolean.valueOf(this.f55089b.apply(t4));
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof g) {
                return this.f55089b.equals(((g) obj).f55089b);
            }
            return false;
        }

        public int hashCode() {
            return this.f55089b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55089b);
            return com.google.common.base.h.a(valueOf.length() + 24, ProtectedSandApp.s("\uf3c7"), valueOf, ProtectedSandApp.s("\uf3c8"));
        }

        private g(m0<T> m0Var) {
            m0Var.getClass();
            this.f55089b = m0Var;
        }
    }

    /* compiled from: Functions.java */
    private static class h<F, T> implements x<F, T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55090c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final u0<T> f55091b;

        @Override // com.google.common.base.x
        @i0
        public T apply(@i0 F f4) {
            return this.f55091b.get();
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof h) {
                return this.f55091b.equals(((h) obj).f55091b);
            }
            return false;
        }

        public int hashCode() {
            return this.f55091b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55091b);
            return com.google.common.base.h.a(valueOf.length() + 23, ProtectedSandApp.s("\uf3c9"), valueOf, ProtectedSandApp.s("\uf3ca"));
        }

        private h(u0<T> u0Var) {
            u0Var.getClass();
            this.f55091b = u0Var;
        }
    }

    /* compiled from: Functions.java */
    private enum i implements x<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf3cc");
        }

        @Override // com.google.common.base.x
        public String apply(Object obj) {
            obj.getClass();
            return obj.toString();
        }
    }

    private z() {
    }

    public static <A, B, C> x<A, C> a(x<B, C> xVar, x<A, ? extends B> xVar2) {
        return new d(xVar, xVar2);
    }

    public static <E> x<Object, E> b(@i0 E e4) {
        return new b(e4);
    }

    public static <K, V> x<K, V> c(Map<K, V> map) {
        return new e(map);
    }

    public static <K, V> x<K, V> d(Map<K, ? extends V> map, @i0 V v4) {
        return new c(map, v4);
    }

    public static <T> x<T, Boolean> e(m0<T> m0Var) {
        return new g(m0Var);
    }

    public static <F, T> x<F, T> f(u0<T> u0Var) {
        return new h(u0Var);
    }

    public static <E> x<E, E> g() {
        return f.INSTANCE;
    }

    public static x<Object, String> h() {
        return i.INSTANCE;
    }
}
