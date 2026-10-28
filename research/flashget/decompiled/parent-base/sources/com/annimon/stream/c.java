package com.annimon.stream;

import com.annimon.stream.function.q;
import com.annimon.stream.function.s1;
import com.annimon.stream.function.t1;
import com.annimon.stream.function.u1;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: ComparatorCompat.java */
/* loaded from: classes3.dex */
public final class c<T> implements Comparator<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final c<Comparable<Object>> f41330c = new c<>(new a());

    /* renamed from: d, reason: collision with root package name */
    private static final c<Comparable<Object>> f41331d = new c<>(Collections.reverseOrder());

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f41332b;

    /* compiled from: ComparatorCompat.java */
    static class a implements Comparator<Comparable<Object>> {
        a() {
        }

        public int a(Comparable<Object> comparable, Comparable<Object> comparable2) {
            return comparable.compareTo(comparable2);
        }

        @Override // java.util.Comparator
        public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class b implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f41333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator f41334c;

        b(Comparator comparator, Comparator comparator2) {
            this.f41333b = comparator;
            this.f41334c = comparator2;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            int compare = this.f41333b.compare(t4, t5);
            return compare != 0 ? compare : this.f41334c.compare(t4, t5);
        }
    }

    /* compiled from: ComparatorCompat.java */
    /* renamed from: com.annimon.stream.c$c, reason: collision with other inner class name */
    static class C0684c implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f41335b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator f41336c;

        C0684c(q qVar, Comparator comparator) {
            this.f41335b = qVar;
            this.f41336c = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return this.f41336c.compare(this.f41335b.apply(t4), this.f41335b.apply(t5));
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class d implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f41337b;

        d(q qVar) {
            this.f41337b = qVar;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return ((Comparable) this.f41337b.apply(t4)).compareTo((Comparable) this.f41337b.apply(t5));
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class e implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f41338b;

        e(t1 t1Var) {
            this.f41338b = t1Var;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return com.annimon.stream.i.b(this.f41338b.c(t4), this.f41338b.c(t5));
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class f implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1 f41339b;

        f(u1 u1Var) {
            this.f41339b = u1Var;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return com.annimon.stream.i.c(this.f41339b.applyAsLong(t4), this.f41339b.applyAsLong(t5));
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class g implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1 f41340b;

        g(s1 s1Var) {
            this.f41340b = s1Var;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            return Double.compare(this.f41340b.c(t4), this.f41340b.c(t5));
        }
    }

    /* compiled from: ComparatorCompat.java */
    static class h implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f41341b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator f41342c;

        h(boolean z4, Comparator comparator) {
            this.f41341b = z4;
            this.f41342c = comparator;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            if (t4 == null) {
                if (t5 == null) {
                    return 0;
                }
                return this.f41341b ? -1 : 1;
            }
            if (t5 == null) {
                return this.f41341b ? 1 : -1;
            }
            Comparator comparator = this.f41342c;
            if (comparator == null) {
                return 0;
            }
            return comparator.compare(t4, t5);
        }
    }

    /* compiled from: ComparatorCompat.java */
    class i implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f41343b;

        i(Comparator comparator) {
            this.f41343b = comparator;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            int compare = c.this.f41332b.compare(t4, t5);
            return compare != 0 ? compare : this.f41343b.compare(t4, t5);
        }
    }

    public c(Comparator<? super T> comparator) {
        this.f41332b = comparator;
    }

    public static <T> c<T> B(Comparator<? super T> comparator) {
        return y(true, comparator);
    }

    public static <T> c<T> C() {
        return y(false, null);
    }

    public static <T> c<T> D(Comparator<? super T> comparator) {
        return y(false, comparator);
    }

    public static <T extends Comparable<? super T>> c<T> E() {
        return (c<T>) f41331d;
    }

    public static <T> Comparator<T> H(Comparator<T> comparator) {
        return Collections.reverseOrder(comparator);
    }

    public static <T> Comparator<T> M(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new b(comparator, comparator2);
    }

    public static <T> c<T> d(Comparator<T> comparator) {
        return new c<>(comparator);
    }

    public static <T, U extends Comparable<? super U>> c<T> g(q<? super T, ? extends U> qVar) {
        qVar.getClass();
        return new c<>(new d(qVar));
    }

    public static <T, U> c<T> k(q<? super T, ? extends U> qVar, Comparator<? super U> comparator) {
        qVar.getClass();
        comparator.getClass();
        return new c<>(new C0684c(qVar, comparator));
    }

    public static <T> c<T> n(s1<? super T> s1Var) {
        s1Var.getClass();
        return new c<>(new g(s1Var));
    }

    public static <T> c<T> o(t1<? super T> t1Var) {
        t1Var.getClass();
        return new c<>(new e(t1Var));
    }

    public static <T> c<T> t(u1<? super T> u1Var) {
        u1Var.getClass();
        return new c<>(new f(u1Var));
    }

    public static <T extends Comparable<? super T>> c<T> u() {
        return (c<T>) f41330c;
    }

    private static <T> c<T> y(boolean z4, Comparator<? super T> comparator) {
        return new c<>(new h(z4, comparator));
    }

    public static <T> c<T> z() {
        return y(true, null);
    }

    @Override // java.util.Comparator
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public c<T> reversed() {
        return new c<>(Collections.reverseOrder(this.f41332b));
    }

    public <U extends Comparable<? super U>> c<T> I(q<? super T, ? extends U> qVar) {
        return thenComparing(g(qVar));
    }

    public <U> c<T> J(q<? super T, ? extends U> qVar, Comparator<? super U> comparator) {
        return thenComparing(k(qVar, comparator));
    }

    @Override // java.util.Comparator
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public c<T> thenComparing(Comparator<? super T> comparator) {
        comparator.getClass();
        return new c<>(new i(comparator));
    }

    public c<T> N(s1<? super T> s1Var) {
        return thenComparing(n(s1Var));
    }

    public c<T> O(t1<? super T> t1Var) {
        return thenComparing(o(t1Var));
    }

    public c<T> S(u1<? super T> u1Var) {
        return thenComparing(t(u1Var));
    }

    @Override // java.util.Comparator
    public int compare(T t4, T t5) {
        return this.f41332b.compare(t4, t5);
    }

    public Comparator<T> e() {
        return this.f41332b;
    }
}
