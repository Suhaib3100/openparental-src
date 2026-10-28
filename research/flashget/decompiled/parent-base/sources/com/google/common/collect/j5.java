package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.q0;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: Range.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class j5<C extends Comparable> extends k5 implements com.google.common.base.m0<C>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final j5<Comparable> f55870d = new j5<>(q0.d.f56189d, q0.b.f56186d);

    /* renamed from: e, reason: collision with root package name */
    private static final long f55871e = 0;

    /* renamed from: b, reason: collision with root package name */
    final q0<C> f55872b;

    /* renamed from: c, reason: collision with root package name */
    final q0<C> f55873c;

    /* compiled from: Range.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55874a;

        static {
            int[] iArr = new int[x.values().length];
            f55874a = iArr;
            try {
                iArr[x.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55874a[x.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Range.java */
    static class b implements com.google.common.base.x<j5, q0> {

        /* renamed from: b, reason: collision with root package name */
        static final b f55875b = new b();

        b() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 apply(j5 j5Var) {
            return j5Var.f55872b;
        }
    }

    /* compiled from: Range.java */
    private static class c extends e5<j5<?>> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final e5<j5<?>> f55876d = new c();

        /* renamed from: e, reason: collision with root package name */
        private static final long f55877e = 0;

        private c() {
        }

        @Override // com.google.common.collect.e5, java.util.Comparator
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int compare(j5<?> j5Var, j5<?> j5Var2) {
            return k0.n().i(j5Var.f55872b, j5Var2.f55872b).i(j5Var.f55873c, j5Var2.f55873c).m();
        }
    }

    /* compiled from: Range.java */
    static class d implements com.google.common.base.x<j5, q0> {

        /* renamed from: b, reason: collision with root package name */
        static final d f55878b = new d();

        d() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 apply(j5 j5Var) {
            return j5Var.f55873c;
        }
    }

    private j5(q0<C> q0Var, q0<C> q0Var2) {
        q0Var.getClass();
        this.f55872b = q0Var;
        q0Var2.getClass();
        this.f55873c = q0Var2;
        if (q0Var.compareTo(q0Var2) > 0 || q0Var == q0.b.f56186d || q0Var2 == q0.d.f56189d) {
            String valueOf = String.valueOf(G(q0Var, q0Var2));
            int length = valueOf.length();
            String s4 = ProtectedSandApp.s("\uf4e3");
            throw new IllegalArgumentException(length != 0 ? s4.concat(valueOf) : new String(s4));
        }
    }

    public static <C extends Comparable<?>> j5<C> A(C c5, C c6) {
        return new j5<>(new q0.c(c5), new q0.c(c6));
    }

    public static <C extends Comparable<?>> j5<C> B(C c5, x xVar, C c6, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        x xVar3 = x.OPEN;
        return new j5<>(xVar == xVar3 ? new q0.c(c5) : new q0.e(c5), xVar2 == xVar3 ? new q0.e(c6) : new q0.c(c6));
    }

    static <C extends Comparable<?>> e5<j5<C>> C() {
        return (e5<j5<C>>) c.f55876d;
    }

    public static <C extends Comparable<?>> j5<C> E(C c5) {
        return f(c5, c5);
    }

    private static String G(q0<?> q0Var, q0<?> q0Var2) {
        StringBuilder sb = new StringBuilder(16);
        q0Var.g(sb);
        sb.append(ProtectedSandApp.s("\uf4e4"));
        q0Var2.h(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> j5<C> H(C c5, x xVar) {
        int i4 = a.f55874a[xVar.ordinal()];
        if (i4 == 1) {
            return v(c5);
        }
        if (i4 == 2) {
            return d(c5);
        }
        throw new AssertionError();
    }

    static <C extends Comparable<?>> com.google.common.base.x<j5<C>, q0<C>> I() {
        return d.f55878b;
    }

    public static <C extends Comparable<?>> j5<C> a() {
        return (j5<C>) f55870d;
    }

    public static <C extends Comparable<?>> j5<C> c(C c5) {
        return new j5<>(new q0.e(c5), q0.b.f56186d);
    }

    public static <C extends Comparable<?>> j5<C> d(C c5) {
        return new j5<>(q0.d.f56189d, new q0.c(c5));
    }

    public static <C extends Comparable<?>> j5<C> f(C c5, C c6) {
        return new j5<>(new q0.e(c5), new q0.c(c6));
    }

    public static <C extends Comparable<?>> j5<C> g(C c5, C c6) {
        return new j5<>(new q0.e(c5), new q0.e(c6));
    }

    static int h(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static <C extends Comparable<?>> j5<C> k(q0<C> q0Var, q0<C> q0Var2) {
        return new j5<>(q0Var, q0Var2);
    }

    public static <C extends Comparable<?>> j5<C> l(C c5, x xVar) {
        int i4 = a.f55874a[xVar.ordinal()];
        if (i4 == 1) {
            return p(c5);
        }
        if (i4 == 2) {
            return c(c5);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> j5<C> m(Iterable<C> iterable) {
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (x4.f56632f.equals(comparator) || comparator == null) {
                return f((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        C next = it.next();
        next.getClass();
        Comparable comparable = next;
        while (it.hasNext()) {
            C next2 = it.next();
            next2.getClass();
            x4 x4Var = x4.f56632f;
            next = (Comparable) x4Var.O(next, next2);
            comparable = (Comparable) x4Var.J(comparable, next2);
        }
        return f(next, comparable);
    }

    public static <C extends Comparable<?>> j5<C> p(C c5) {
        return new j5<>(new q0.c(c5), q0.b.f56186d);
    }

    public static <C extends Comparable<?>> j5<C> v(C c5) {
        return new j5<>(q0.d.f56189d, new q0.e(c5));
    }

    static <C extends Comparable<?>> com.google.common.base.x<j5<C>, q0<C>> w() {
        return b.f55875b;
    }

    public static <C extends Comparable<?>> j5<C> z(C c5, C c6) {
        return new j5<>(new q0.c(c5), new q0.e(c6));
    }

    Object D() {
        j5<Comparable> j5Var = f55870d;
        return equals(j5Var) ? j5Var : this;
    }

    public j5<C> F(j5<C> j5Var) {
        int compareTo = this.f55872b.compareTo(j5Var.f55872b);
        int compareTo2 = this.f55873c.compareTo(j5Var.f55873c);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo < 0 || compareTo2 > 0) {
            return new j5<>(compareTo <= 0 ? this.f55872b : j5Var.f55872b, compareTo2 >= 0 ? this.f55873c : j5Var.f55873c);
        }
        return j5Var;
    }

    public x J() {
        return this.f55873c.n();
    }

    public C K() {
        return this.f55873c.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.m0
    @Deprecated
    public boolean apply(Object obj) {
        return i((Comparable) obj);
    }

    @Deprecated
    public boolean b(C c5) {
        return i(c5);
    }

    public j5<C> e(v0<C> v0Var) {
        v0Var.getClass();
        q0<C> e4 = this.f55872b.e(v0Var);
        q0<C> e5 = this.f55873c.e(v0Var);
        return (e4 == this.f55872b && e5 == this.f55873c) ? this : new j5<>(e4, e5);
    }

    @Override // com.google.common.base.m0
    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return this.f55872b.equals(j5Var.f55872b) && this.f55873c.equals(j5Var.f55873c);
    }

    public int hashCode() {
        return (this.f55872b.hashCode() * 31) + this.f55873c.hashCode();
    }

    public boolean i(C c5) {
        c5.getClass();
        return this.f55872b.k(c5) && !this.f55873c.k(c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean j(Iterable<? extends C> iterable) {
        if (c4.C(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (x4.f56632f.equals(comparator) || comparator == null) {
                return i((Comparable) sortedSet.first()) && i((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(j5<C> j5Var) {
        return this.f55872b.compareTo(j5Var.f55872b) <= 0 && this.f55873c.compareTo(j5Var.f55873c) >= 0;
    }

    public j5<C> o(j5<C> j5Var) {
        if (this.f55872b.compareTo(j5Var.f55873c) < 0 && j5Var.f55872b.compareTo(this.f55873c) < 0) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(j5Var);
            throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 39, ProtectedSandApp.s("\uf4e5"), valueOf, ProtectedSandApp.s("\uf4e6"), valueOf2));
        }
        boolean z4 = this.f55872b.compareTo(j5Var.f55872b) < 0;
        j5<C> j5Var2 = z4 ? this : j5Var;
        if (!z4) {
            j5Var = this;
        }
        return new j5<>(j5Var2.f55873c, j5Var.f55872b);
    }

    public boolean q() {
        return this.f55872b != q0.d.f56189d;
    }

    public boolean r() {
        return this.f55873c != q0.b.f56186d;
    }

    public j5<C> s(j5<C> j5Var) {
        int compareTo = this.f55872b.compareTo(j5Var.f55872b);
        int compareTo2 = this.f55873c.compareTo(j5Var.f55873c);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return j5Var;
        }
        q0<C> q0Var = compareTo >= 0 ? this.f55872b : j5Var.f55872b;
        q0<C> q0Var2 = compareTo2 <= 0 ? this.f55873c : j5Var.f55873c;
        com.google.common.base.l0.y(q0Var.compareTo(q0Var2) <= 0, ProtectedSandApp.s("\uf4e7"), this, j5Var);
        return new j5<>(q0Var, q0Var2);
    }

    public boolean t(j5<C> j5Var) {
        return this.f55872b.compareTo(j5Var.f55873c) <= 0 && j5Var.f55872b.compareTo(this.f55873c) <= 0;
    }

    public String toString() {
        return G(this.f55872b, this.f55873c);
    }

    public boolean u() {
        return this.f55872b.equals(this.f55873c);
    }

    public x x() {
        return this.f55872b.m();
    }

    public C y() {
        return this.f55872b.i();
    }
}
