package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* compiled from: RegularContiguousSet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class n5<C extends Comparable> extends o0<C> {

    /* renamed from: k, reason: collision with root package name */
    private static final long f55974k = 0;

    /* renamed from: j, reason: collision with root package name */
    private final j5<C> f55975j;

    /* compiled from: RegularContiguousSet.java */
    class a extends l<C> {

        /* renamed from: c, reason: collision with root package name */
        final C f55976c;

        a(Comparable comparable) {
            super(comparable);
            this.f55976c = (C) n5.this.last();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l
        @zc.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c5) {
            if (n5.o1(c5, this.f55976c)) {
                return null;
            }
            return n5.this.f55986i.g(c5);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    class b extends l<C> {

        /* renamed from: c, reason: collision with root package name */
        final C f55978c;

        b(Comparable comparable) {
            super(comparable);
            this.f55978c = (C) n5.this.first();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l
        @zc.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c5) {
            if (n5.o1(c5, this.f55978c)) {
                return null;
            }
            return n5.this.f55986i.i(c5);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    class c extends y2<C> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.y2
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public w3<C> f0() {
            return n5.this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public C get(int i4) {
            com.google.common.base.l0.C(i4, size());
            n5 n5Var = n5.this;
            return (C) n5Var.f55986i.h(n5Var.first(), i4);
        }
    }

    /* compiled from: RegularContiguousSet.java */
    @d9.c
    private static final class d<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final j5<C> f55981b;

        /* renamed from: c, reason: collision with root package name */
        final v0<C> f55982c;

        /* synthetic */ d(j5 j5Var, v0 v0Var, a aVar) {
            this(j5Var, v0Var);
        }

        private Object a() {
            return new n5(this.f55981b, this.f55982c);
        }

        private d(j5<C> j5Var, v0<C> v0Var) {
            this.f55981b = j5Var;
            this.f55982c = v0Var;
        }
    }

    n5(j5<C> j5Var, v0<C> v0Var) {
        super(v0Var);
        this.f55975j = j5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o1(Comparable<?> comparable, @zc.a Comparable<?> comparable2) {
        return comparable2 != null && j5.h(comparable, comparable2) == 0;
    }

    private o0<C> q1(j5<C> j5Var) {
        return this.f55975j.t(j5Var) ? o0.Y0(this.f55975j.s(j5Var), this.f55986i) : new x0(this.f55986i);
    }

    @Override // com.google.common.collect.q3
    f3<C> G() {
        return this.f55986i.f56564b ? new c() : super.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    /* renamed from: b1 */
    public o0<C> u0(C c5, boolean z4) {
        return q1(j5.H(c5, x.forBoolean(z4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f55975j.i((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return c0.b(this, collection);
    }

    @Override // com.google.common.collect.o0
    public o0<C> d1(o0<C> o0Var) {
        o0Var.getClass();
        com.google.common.base.l0.d(this.f55986i.equals(o0Var.f55986i));
        if (o0Var.isEmpty()) {
            return o0Var;
        }
        x4 x4Var = x4.f56632f;
        Comparable comparable = (Comparable) x4Var.J(first(), (Comparable) o0Var.first());
        Comparable comparable2 = (Comparable) x4Var.O(last(), (Comparable) o0Var.last());
        return comparable.compareTo(comparable2) <= 0 ? o0.Y0(j5.f(comparable, comparable2), this.f55986i) : new x0(this.f55986i);
    }

    @Override // com.google.common.collect.o0
    public j5<C> e1() {
        x xVar = x.CLOSED;
        return f1(xVar, xVar);
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n5) {
            n5 n5Var = (n5) obj;
            if (this.f55986i.equals(n5Var.f55986i)) {
                return first().equals(n5Var.first()) && last().equals(n5Var.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.o0
    public j5<C> f1(x xVar, x xVar2) {
        return j5.k(this.f55975j.f55872b.o(xVar, this.f55986i), this.f55975j.f55873c.p(xVar2, this.f55986i));
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public int hashCode() {
        return d6.k(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.w3
    @d9.c
    int indexOf(@zc.a Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        v0<C> v0Var = this.f55986i;
        C first = first();
        Objects.requireNonNull(obj);
        return (int) v0Var.b(first, (Comparable) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    /* renamed from: j1 */
    public o0<C> M0(C c5, boolean z4, C c6, boolean z5) {
        return (c5.compareTo(c6) != 0 || z4 || z5) ? q1(j5.B(c5, x.forBoolean(z4), c6, x.forBoolean(z5))) : new x0(this.f55986i);
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new d(this.f55975j, this.f55986i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    /* renamed from: m1 */
    public o0<C> Q0(C c5, boolean z4) {
        return q1(j5.l(c5, x.forBoolean(z4)));
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c
    /* renamed from: p0 */
    public e7<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C first() {
        C l4 = this.f55975j.f55872b.l(this.f55986i);
        Objects.requireNonNull(l4);
        return l4;
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C last() {
        C j4 = this.f55975j.f55873c.j(this.f55986i);
        Objects.requireNonNull(j4);
        return j4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long b5 = this.f55986i.b(first(), last());
        if (b5 >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) b5) + 1;
    }
}
