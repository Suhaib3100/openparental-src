package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Equivalence.java */
@o
@d9.b
/* loaded from: classes6.dex */
public abstract class q<T> {

    /* compiled from: Equivalence.java */
    static final class b extends q<Object> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        static final b f55004b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final long f55005c = 1;

        b() {
        }

        private Object k() {
            return f55004b;
        }

        @Override // com.google.common.base.q
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.q
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    private static final class c<T> implements m0<T>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55006d = 0;

        /* renamed from: b, reason: collision with root package name */
        private final q<T> f55007b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        private final T f55008c;

        c(q<T> qVar, @zc.a T t4) {
            qVar.getClass();
            this.f55007b = qVar;
            this.f55008c = t4;
        }

        @Override // com.google.common.base.m0
        public boolean apply(@zc.a T t4) {
            return this.f55007b.d(t4, this.f55008c);
        }

        @Override // com.google.common.base.m0
        public boolean equals(@zc.a Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f55007b.equals(cVar.f55007b) && f0.a(this.f55008c, cVar.f55008c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f55007b, this.f55008c});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55007b);
            String valueOf2 = String.valueOf(this.f55008c);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 15, valueOf, ProtectedSandApp.s("\uf336"), valueOf2, ProtectedSandApp.s("\uf337"));
        }
    }

    /* compiled from: Equivalence.java */
    static final class d extends q<Object> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        static final d f55009b = new d();

        /* renamed from: c, reason: collision with root package name */
        private static final long f55010c = 1;

        d() {
        }

        private Object k() {
            return f55009b;
        }

        @Override // com.google.common.base.q
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.q
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* compiled from: Equivalence.java */
    public static final class e<T> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55011d = 0;

        /* renamed from: b, reason: collision with root package name */
        private final q<? super T> f55012b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private final T f55013c;

        @i0
        public T a() {
            return this.f55013c;
        }

        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f55012b.equals(eVar.f55012b)) {
                return this.f55012b.d(this.f55013c, eVar.f55013c);
            }
            return false;
        }

        public int hashCode() {
            return this.f55012b.f(this.f55013c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55012b);
            String valueOf2 = String.valueOf(this.f55013c);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 7, valueOf, ProtectedSandApp.s("\uf338"), valueOf2, ProtectedSandApp.s("\uf339"));
        }

        private e(q<? super T> qVar, @i0 T t4) {
            qVar.getClass();
            this.f55012b = qVar;
            this.f55013c = t4;
        }
    }

    protected q() {
    }

    public static q<Object> c() {
        return b.f55004b;
    }

    public static q<Object> g() {
        return d.f55009b;
    }

    @f9.g
    protected abstract boolean a(T t4, T t5);

    @f9.g
    protected abstract int b(T t4);

    public final boolean d(@zc.a T t4, @zc.a T t5) {
        if (t4 == t5) {
            return true;
        }
        if (t4 == null || t5 == null) {
            return false;
        }
        return a(t4, t5);
    }

    public final m0<T> e(@zc.a T t4) {
        return new c(this, t4);
    }

    public final int f(@zc.a T t4) {
        if (t4 == null) {
            return 0;
        }
        return b(t4);
    }

    public final <F> q<F> h(x<? super F, ? extends T> xVar) {
        return new y(xVar, this);
    }

    @d9.b(serializable = true)
    public final <S extends T> q<Iterable<S>> i() {
        return new h0(this);
    }

    public final <S extends T> e<S> j(@i0 S s4) {
        return new e<>(s4);
    }
}
