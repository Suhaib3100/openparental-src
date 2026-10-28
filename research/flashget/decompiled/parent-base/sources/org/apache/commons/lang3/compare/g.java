package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* compiled from: ComparableUtils.java */
/* loaded from: classes6.dex */
public class g {

    /* compiled from: ComparableUtils.java */
    public static class b<A extends Comparable<A>> {

        /* renamed from: a, reason: collision with root package name */
        private final A f85868a;

        private boolean c(A a5, A a6) {
            return g(a5) && i(a6);
        }

        private boolean d(A a5, A a6) {
            return f(a5) && h(a6);
        }

        public boolean a(A a5, A a6) {
            return c(a5, a6) || c(a6, a5);
        }

        public boolean b(A a5, A a6) {
            return d(a5, a6) || d(a6, a5);
        }

        public boolean e(A a5) {
            return this.f85868a.compareTo(a5) == 0;
        }

        public boolean f(A a5) {
            return this.f85868a.compareTo(a5) > 0;
        }

        public boolean g(A a5) {
            return this.f85868a.compareTo(a5) >= 0;
        }

        public boolean h(A a5) {
            return this.f85868a.compareTo(a5) < 0;
        }

        public boolean i(A a5) {
            return this.f85868a.compareTo(a5) <= 0;
        }

        private b(A a5) {
            this.f85868a = a5;
        }
    }

    private g() {
    }

    public static <A extends Comparable<A>> Predicate<A> g(final A a5, final A a6) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l4;
                l4 = g.l(a5, a6, (Comparable) obj);
                return l4;
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> h(final A a5, final A a6) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m4;
                m4 = g.m(a5, a6, (Comparable) obj);
                return m4;
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> i(final A a5) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean n4;
                n4 = g.n(a5, (Comparable) obj);
                return n4;
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> j(final A a5) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean o4;
                o4 = g.o(a5, (Comparable) obj);
                return o4;
            }
        };
    }

    public static <A extends Comparable<A>> b<A> k(A a5) {
        return new b<>(a5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean l(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return k(comparable3).a(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return k(comparable3).b(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n(Comparable comparable, Comparable comparable2) {
        return k(comparable2).g(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o(Comparable comparable, Comparable comparable2) {
        return k(comparable2).f(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(Comparable comparable, Comparable comparable2) {
        return k(comparable2).i(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q(Comparable comparable, Comparable comparable2) {
        return k(comparable2).h(comparable);
    }

    public static <A extends Comparable<A>> Predicate<A> r(final A a5) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean p4;
                p4 = g.p(a5, (Comparable) obj);
                return p4;
            }
        };
    }

    public static <A extends Comparable<A>> Predicate<A> s(final A a5) {
        return new Predicate() { // from class: org.apache.commons.lang3.compare.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean q4;
                q4 = g.q(a5, (Comparable) obj);
                return q4;
            }
        };
    }
}
