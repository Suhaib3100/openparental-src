package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* compiled from: Cut.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class q0<C extends Comparable> implements Comparable<q0<C>>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f56183c = 0;

    /* renamed from: b, reason: collision with root package name */
    final C f56184b;

    /* compiled from: Cut.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56185a;

        static {
            int[] iArr = new int[x.values().length];
            f56185a = iArr;
            try {
                iArr[x.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56185a[x.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    static final class b extends q0<Comparable<?>> {

        /* renamed from: d, reason: collision with root package name */
        private static final b f56186d = new b();

        /* renamed from: e, reason: collision with root package name */
        private static final long f56187e = 0;

        private b() {
            super("");
        }

        private Object r() {
            return f56186d;
        }

        @Override // com.google.common.collect.q0, java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(q0<Comparable<?>> q0Var) {
            return q0Var == this ? 0 : 1;
        }

        @Override // com.google.common.collect.q0
        void g(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q0
        void h(StringBuilder sb) {
            sb.append(ProtectedSandApp.s("\uf524"));
        }

        @Override // com.google.common.collect.q0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.q0
        Comparable<?> i() {
            throw new IllegalStateException(ProtectedSandApp.s("\uf525"));
        }

        @Override // com.google.common.collect.q0
        Comparable<?> j(v0<Comparable<?>> v0Var) {
            return v0Var.e();
        }

        @Override // com.google.common.collect.q0
        boolean k(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.q0
        Comparable<?> l(v0<Comparable<?>> v0Var) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q0
        x m() {
            throw new AssertionError(ProtectedSandApp.s("\uf526"));
        }

        @Override // com.google.common.collect.q0
        x n() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.q0
        q0<Comparable<?>> o(x xVar, v0<Comparable<?>> v0Var) {
            throw new AssertionError(ProtectedSandApp.s("\uf526"));
        }

        @Override // com.google.common.collect.q0
        q0<Comparable<?>> p(x xVar, v0<Comparable<?>> v0Var) {
            throw new IllegalStateException();
        }

        public String toString() {
            return ProtectedSandApp.s("\uf527");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    static final class c<C extends Comparable> extends q0<C> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56188d = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c5) {
            super(c5);
            c5.getClass();
        }

        @Override // com.google.common.collect.q0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((q0) obj);
        }

        @Override // com.google.common.collect.q0
        q0<C> e(v0<C> v0Var) {
            C g4 = v0Var.g(this.f56184b);
            return g4 != null ? new e(g4) : b.f56186d;
        }

        @Override // com.google.common.collect.q0
        void g(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f56184b);
        }

        @Override // com.google.common.collect.q0
        void h(StringBuilder sb) {
            sb.append(this.f56184b);
            sb.append(']');
        }

        @Override // com.google.common.collect.q0
        public int hashCode() {
            return ~this.f56184b.hashCode();
        }

        @Override // com.google.common.collect.q0
        C j(v0<C> v0Var) {
            return this.f56184b;
        }

        @Override // com.google.common.collect.q0
        boolean k(C c5) {
            return j5.h(this.f56184b, c5) < 0;
        }

        @Override // com.google.common.collect.q0
        @zc.a
        C l(v0<C> v0Var) {
            return v0Var.g(this.f56184b);
        }

        @Override // com.google.common.collect.q0
        x m() {
            return x.OPEN;
        }

        @Override // com.google.common.collect.q0
        x n() {
            return x.CLOSED;
        }

        @Override // com.google.common.collect.q0
        q0<C> o(x xVar, v0<C> v0Var) {
            int i4 = a.f56185a[xVar.ordinal()];
            if (i4 == 1) {
                C g4 = v0Var.g(this.f56184b);
                return g4 == null ? d.f56189d : new e(g4);
            }
            if (i4 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q0
        q0<C> p(x xVar, v0<C> v0Var) {
            int i4 = a.f56185a[xVar.ordinal()];
            if (i4 == 1) {
                return this;
            }
            if (i4 != 2) {
                throw new AssertionError();
            }
            C g4 = v0Var.g(this.f56184b);
            return g4 == null ? b.f56186d : new e(g4);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f56184b);
            return com.google.common.base.h.a(valueOf.length() + 2, ProtectedSandApp.s("\uf528"), valueOf, ProtectedSandApp.s("\uf529"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    static final class d extends q0<Comparable<?>> {

        /* renamed from: d, reason: collision with root package name */
        private static final d f56189d = new d();

        /* renamed from: e, reason: collision with root package name */
        private static final long f56190e = 0;

        private d() {
            super("");
        }

        private Object r() {
            return f56189d;
        }

        @Override // com.google.common.collect.q0
        q0<Comparable<?>> e(v0<Comparable<?>> v0Var) {
            try {
                return new e(v0Var.f());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.q0, java.lang.Comparable
        /* renamed from: f */
        public int compareTo(q0<Comparable<?>> q0Var) {
            return q0Var == this ? 0 : -1;
        }

        @Override // com.google.common.collect.q0
        void g(StringBuilder sb) {
            sb.append(ProtectedSandApp.s("\uf52a"));
        }

        @Override // com.google.common.collect.q0
        void h(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.q0
        Comparable<?> i() {
            throw new IllegalStateException(ProtectedSandApp.s("\uf52b"));
        }

        @Override // com.google.common.collect.q0
        Comparable<?> j(v0<Comparable<?>> v0Var) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q0
        boolean k(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.q0
        Comparable<?> l(v0<Comparable<?>> v0Var) {
            return v0Var.f();
        }

        @Override // com.google.common.collect.q0
        x m() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.q0
        x n() {
            throw new AssertionError(ProtectedSandApp.s("\uf52c"));
        }

        @Override // com.google.common.collect.q0
        q0<Comparable<?>> o(x xVar, v0<Comparable<?>> v0Var) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.q0
        q0<Comparable<?>> p(x xVar, v0<Comparable<?>> v0Var) {
            throw new AssertionError(ProtectedSandApp.s("\uf52c"));
        }

        public String toString() {
            return ProtectedSandApp.s("\uf52d");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cut.java */
    static final class e<C extends Comparable> extends q0<C> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56191d = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C c5) {
            super(c5);
            c5.getClass();
        }

        @Override // com.google.common.collect.q0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((q0) obj);
        }

        @Override // com.google.common.collect.q0
        void g(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f56184b);
        }

        @Override // com.google.common.collect.q0
        void h(StringBuilder sb) {
            sb.append(this.f56184b);
            sb.append(')');
        }

        @Override // com.google.common.collect.q0
        public int hashCode() {
            return this.f56184b.hashCode();
        }

        @Override // com.google.common.collect.q0
        @zc.a
        C j(v0<C> v0Var) {
            return v0Var.i(this.f56184b);
        }

        @Override // com.google.common.collect.q0
        boolean k(C c5) {
            return j5.h(this.f56184b, c5) <= 0;
        }

        @Override // com.google.common.collect.q0
        C l(v0<C> v0Var) {
            return this.f56184b;
        }

        @Override // com.google.common.collect.q0
        x m() {
            return x.CLOSED;
        }

        @Override // com.google.common.collect.q0
        x n() {
            return x.OPEN;
        }

        @Override // com.google.common.collect.q0
        q0<C> o(x xVar, v0<C> v0Var) {
            int i4 = a.f56185a[xVar.ordinal()];
            if (i4 == 1) {
                return this;
            }
            if (i4 != 2) {
                throw new AssertionError();
            }
            C i5 = v0Var.i(this.f56184b);
            return i5 == null ? d.f56189d : new c(i5);
        }

        @Override // com.google.common.collect.q0
        q0<C> p(x xVar, v0<C> v0Var) {
            int i4 = a.f56185a[xVar.ordinal()];
            if (i4 == 1) {
                C i5 = v0Var.i(this.f56184b);
                return i5 == null ? b.f56186d : new c(i5);
            }
            if (i4 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f56184b);
            return com.google.common.base.h.a(valueOf.length() + 2, ProtectedSandApp.s("\uf52e"), valueOf, ProtectedSandApp.s("\uf52f"));
        }
    }

    q0(C c5) {
        this.f56184b = c5;
    }

    static <C extends Comparable> q0<C> a() {
        return b.f56186d;
    }

    static <C extends Comparable> q0<C> b(C c5) {
        return new c(c5);
    }

    static <C extends Comparable> q0<C> c() {
        return d.f56189d;
    }

    static <C extends Comparable> q0<C> d(C c5) {
        return new e(c5);
    }

    q0<C> e(v0<C> v0Var) {
        return this;
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        try {
            return compareTo((q0) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(q0<C> q0Var) {
        if (q0Var == d.f56189d) {
            return 1;
        }
        if (q0Var == b.f56186d) {
            return -1;
        }
        int h4 = j5.h(this.f56184b, q0Var.f56184b);
        return h4 != 0 ? h4 : com.google.common.primitives.a.d(this instanceof c, q0Var instanceof c);
    }

    abstract void g(StringBuilder sb);

    abstract void h(StringBuilder sb);

    public abstract int hashCode();

    C i() {
        return this.f56184b;
    }

    @zc.a
    abstract C j(v0<C> v0Var);

    abstract boolean k(C c5);

    @zc.a
    abstract C l(v0<C> v0Var);

    abstract x m();

    abstract x n();

    abstract q0<C> o(x xVar, v0<C> v0Var);

    abstract q0<C> p(x xVar, v0<C> v0Var);
}
