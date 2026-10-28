package com.google.common.collect;

import com.google.common.collect.n4;

/* compiled from: Interners.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public final class b4 {

    /* compiled from: Interners.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final n4 f55382a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55383b;

        public <E> a4<E> a() {
            if (!this.f55383b) {
                this.f55382a.l();
            }
            return new d(this.f55382a);
        }

        public b b(int i4) {
            this.f55382a.a(i4);
            return this;
        }

        public b c() {
            this.f55383b = true;
            return this;
        }

        @d9.c("java.lang.ref.WeakReference")
        public b d() {
            this.f55383b = false;
            return this;
        }

        private b() {
            this.f55382a = new n4();
            this.f55383b = true;
        }
    }

    /* compiled from: Interners.java */
    private static class c<E> implements com.google.common.base.x<E, E> {

        /* renamed from: b, reason: collision with root package name */
        private final a4<E> f55384b;

        public c(a4<E> a4Var) {
            this.f55384b = a4Var;
        }

        @Override // com.google.common.base.x
        public E apply(E e4) {
            return this.f55384b.a(e4);
        }

        @Override // com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof c) {
                return this.f55384b.equals(((c) obj).f55384b);
            }
            return false;
        }

        public int hashCode() {
            return this.f55384b.hashCode();
        }
    }

    /* compiled from: Interners.java */
    @d9.d
    static final class d<E> implements a4<E> {

        /* renamed from: a, reason: collision with root package name */
        @d9.d
        final o4<E, n4.a, ?, ?> f55385a;

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.collect.o4$j] */
        @Override // com.google.common.collect.a4
        public E a(E e4) {
            E e5;
            do {
                ?? h4 = this.f55385a.h(e4);
                if (h4 != 0 && (e5 = (E) h4.getKey()) != null) {
                    return e5;
                }
            } while (this.f55385a.putIfAbsent(e4, n4.a.VALUE) != null);
            return e4;
        }

        private d(n4 n4Var) {
            this.f55385a = o4.f(n4Var.h(com.google.common.base.q.c()));
        }
    }

    private b4() {
    }

    public static <E> com.google.common.base.x<E, E> a(a4<E> a4Var) {
        a4Var.getClass();
        return new c(a4Var);
    }

    public static b b() {
        return new b();
    }

    public static <E> a4<E> c() {
        return b().c().a();
    }

    @d9.c("java.lang.ref.WeakReference")
    public static <E> a4<E> d() {
        return b().d().a();
    }
}
