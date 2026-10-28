package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Suppliers.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class v0 {

    /* compiled from: Suppliers.java */
    @d9.d
    static class a<T> implements u0<T>, Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final long f55049f = 0;

        /* renamed from: b, reason: collision with root package name */
        final u0<T> f55050b;

        /* renamed from: c, reason: collision with root package name */
        final long f55051c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        volatile transient T f55052d;

        /* renamed from: e, reason: collision with root package name */
        volatile transient long f55053e;

        a(u0<T> u0Var, long j4, TimeUnit timeUnit) {
            u0Var.getClass();
            this.f55050b = u0Var;
            this.f55051c = timeUnit.toNanos(j4);
            l0.t(j4 > 0, ProtectedSandApp.s("\uf39c"), j4, timeUnit);
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            long j4 = this.f55053e;
            long l4 = k0.l();
            if (j4 == 0 || l4 - j4 >= 0) {
                synchronized (this) {
                    try {
                        if (j4 == this.f55053e) {
                            T t4 = this.f55050b.get();
                            this.f55052d = t4;
                            long j5 = l4 + this.f55051c;
                            if (j5 == 0) {
                                j5 = 1;
                            }
                            this.f55053e = j5;
                            return t4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f55052d;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55050b);
            long j4 = this.f55051c;
            StringBuilder sb = new StringBuilder(valueOf.length() + 62);
            sb.append(ProtectedSandApp.s("\uf39d"));
            sb.append(valueOf);
            sb.append(ProtectedSandApp.s("\uf39e"));
            return android.support.v4.media.session.b.a(sb, j4, ProtectedSandApp.s("\uf39f"));
        }
    }

    /* compiled from: Suppliers.java */
    @d9.d
    static class b<T> implements u0<T>, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f55054e = 0;

        /* renamed from: b, reason: collision with root package name */
        final u0<T> f55055b;

        /* renamed from: c, reason: collision with root package name */
        volatile transient boolean f55056c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        transient T f55057d;

        b(u0<T> u0Var) {
            u0Var.getClass();
            this.f55055b = u0Var;
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            if (!this.f55056c) {
                synchronized (this) {
                    try {
                        if (!this.f55056c) {
                            T t4 = this.f55055b.get();
                            this.f55057d = t4;
                            this.f55056c = true;
                            return t4;
                        }
                    } finally {
                    }
                }
            }
            return this.f55057d;
        }

        public String toString() {
            Object obj;
            if (this.f55056c) {
                String valueOf = String.valueOf(this.f55057d);
                obj = com.google.common.base.h.a(valueOf.length() + 25, ProtectedSandApp.s("\uf3a0"), valueOf, ProtectedSandApp.s("\uf3a1"));
            } else {
                obj = this.f55055b;
            }
            String valueOf2 = String.valueOf(obj);
            return com.google.common.base.h.a(valueOf2.length() + 19, ProtectedSandApp.s("\uf3a2"), valueOf2, ProtectedSandApp.s("\uf3a3"));
        }
    }

    /* compiled from: Suppliers.java */
    @d9.d
    static class c<T> implements u0<T> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        volatile u0<T> f55058b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f55059c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        T f55060d;

        c(u0<T> u0Var) {
            u0Var.getClass();
            this.f55058b = u0Var;
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            if (!this.f55059c) {
                synchronized (this) {
                    try {
                        if (!this.f55059c) {
                            u0<T> u0Var = this.f55058b;
                            Objects.requireNonNull(u0Var);
                            T t4 = u0Var.get();
                            this.f55060d = t4;
                            this.f55059c = true;
                            this.f55058b = null;
                            return t4;
                        }
                    } finally {
                    }
                }
            }
            return this.f55060d;
        }

        public String toString() {
            Object obj = this.f55058b;
            if (obj == null) {
                String valueOf = String.valueOf(this.f55060d);
                obj = com.google.common.base.h.a(valueOf.length() + 25, ProtectedSandApp.s("\uf3a4"), valueOf, ProtectedSandApp.s("\uf3a5"));
            }
            String valueOf2 = String.valueOf(obj);
            return com.google.common.base.h.a(valueOf2.length() + 19, ProtectedSandApp.s("\uf3a6"), valueOf2, ProtectedSandApp.s("\uf3a7"));
        }
    }

    /* compiled from: Suppliers.java */
    private static class d<F, T> implements u0<T>, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55061d = 0;

        /* renamed from: b, reason: collision with root package name */
        final x<? super F, T> f55062b;

        /* renamed from: c, reason: collision with root package name */
        final u0<F> f55063c;

        d(x<? super F, T> xVar, u0<F> u0Var) {
            xVar.getClass();
            this.f55062b = xVar;
            u0Var.getClass();
            this.f55063c = u0Var;
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f55062b.equals(dVar.f55062b) && this.f55063c.equals(dVar.f55063c);
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            return this.f55062b.apply(this.f55063c.get());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f55062b, this.f55063c});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55062b);
            String valueOf2 = String.valueOf(this.f55063c);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 21, ProtectedSandApp.s("\uf3a8"), valueOf, ProtectedSandApp.s("\uf3a9"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf3aa"));
            return a5.toString();
        }
    }

    /* compiled from: Suppliers.java */
    private interface e<T> extends x<u0<T>, T> {
    }

    /* compiled from: Suppliers.java */
    private enum f implements e<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf3ac");
        }

        @Override // com.google.common.base.x
        @zc.a
        public Object apply(u0<Object> u0Var) {
            return u0Var.get();
        }
    }

    /* compiled from: Suppliers.java */
    private static class g<T> implements u0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55064c = 0;

        /* renamed from: b, reason: collision with root package name */
        @i0
        final T f55065b;

        g(@i0 T t4) {
            this.f55065b = t4;
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof g) {
                return f0.a(this.f55065b, ((g) obj).f55065b);
            }
            return false;
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            return this.f55065b;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f55065b});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55065b);
            return com.google.common.base.h.a(valueOf.length() + 22, ProtectedSandApp.s("\uf3ad"), valueOf, ProtectedSandApp.s("\uf3ae"));
        }
    }

    /* compiled from: Suppliers.java */
    private static class h<T> implements u0<T>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55066c = 0;

        /* renamed from: b, reason: collision with root package name */
        final u0<T> f55067b;

        h(u0<T> u0Var) {
            u0Var.getClass();
            this.f55067b = u0Var;
        }

        @Override // com.google.common.base.u0
        @i0
        public T get() {
            T t4;
            synchronized (this.f55067b) {
                t4 = this.f55067b.get();
            }
            return t4;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f55067b);
            return com.google.common.base.h.a(valueOf.length() + 32, ProtectedSandApp.s("\uf3af"), valueOf, ProtectedSandApp.s("\uf3b0"));
        }
    }

    private v0() {
    }

    public static <F, T> u0<T> a(x<? super F, T> xVar, u0<F> u0Var) {
        return new d(xVar, u0Var);
    }

    public static <T> u0<T> b(u0<T> u0Var) {
        return ((u0Var instanceof c) || (u0Var instanceof b)) ? u0Var : u0Var instanceof Serializable ? new b(u0Var) : new c(u0Var);
    }

    public static <T> u0<T> c(u0<T> u0Var, long j4, TimeUnit timeUnit) {
        return new a(u0Var, j4, timeUnit);
    }

    public static <T> u0<T> d(@i0 T t4) {
        return new g(t4);
    }

    public static <T> x<u0<T>, T> e() {
        return f.INSTANCE;
    }

    public static <T> u0<T> f(u0<T> u0Var) {
        return new h(u0Var);
    }
}
