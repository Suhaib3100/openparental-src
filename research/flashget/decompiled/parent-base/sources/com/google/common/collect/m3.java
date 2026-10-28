package com.google.common.collect;

import com.google.common.collect.b3;
import com.google.common.collect.u4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableMultiset.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public abstract class m3<E> extends n3<E> implements u4<E> {

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient f3<E> f55952c;

    /* renamed from: d, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient q3<u4.a<E>> f55953d;

    /* compiled from: ImmutableMultiset.java */
    class a extends e7<E> {

        /* renamed from: b, reason: collision with root package name */
        int f55954b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        E f55955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f55956d;

        a(m3 m3Var, Iterator it) {
            this.f55956d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55954b > 0 || this.f55956d.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f55954b <= 0) {
                u4.a aVar = (u4.a) this.f55956d.next();
                this.f55955c = (E) aVar.getElement();
                this.f55954b = aVar.getCount();
            }
            this.f55954b--;
            E e4 = this.f55955c;
            Objects.requireNonNull(e4);
            return e4;
        }
    }

    /* compiled from: ImmutableMultiset.java */
    @d9.c
    static class d<E> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final m3<E> f55962b;

        d(m3<E> m3Var) {
            this.f55962b = m3Var;
        }

        Object a() {
            return this.f55962b.entrySet();
        }
    }

    m3() {
    }

    public static <E> m3<E> G() {
        return s5.f56414h;
    }

    public static <E> m3<E> H(E e4) {
        return q(e4);
    }

    public static <E> m3<E> I(E e4, E e5) {
        return q(e4, e5);
    }

    public static <E> m3<E> K(E e4, E e5, E e6) {
        return q(e4, e5, e6);
    }

    public static <E> m3<E> L(E e4, E e5, E e6, E e7) {
        return q(e4, e5, e6, e7);
    }

    public static <E> m3<E> O(E e4, E e5, E e6, E e7, E e10) {
        return q(e4, e5, e6, e7, e10);
    }

    public static <E> m3<E> P(E e4, E e5, E e6, E e7, E e10, E e11, E... eArr) {
        return new b(4).k(e4, 1).a(e5).a(e6).a(e7).a(e10).a(e11).b(eArr).e();
    }

    public static <E> b<E> p() {
        return new b<>(4);
    }

    private static <E> m3<E> q(E... eArr) {
        return new b(4).b(eArr).e();
    }

    static <E> m3<E> r(Collection<? extends u4.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (u4.a<? extends E> aVar : collection) {
            bVar.k(aVar.getElement(), aVar.getCount());
        }
        return bVar.e();
    }

    public static <E> m3<E> s(Iterable<? extends E> iterable) {
        if (iterable instanceof m3) {
            m3<E> m3Var = (m3) iterable;
            if (!m3Var.j()) {
                return m3Var;
            }
        }
        b bVar = new b(v4.l(iterable));
        bVar.c(iterable);
        return bVar.e();
    }

    public static <E> m3<E> v(Iterator<? extends E> it) {
        return new b(4).d(it).e();
    }

    public static <E> m3<E> w(E[] eArr) {
        return q(eArr);
    }

    private q3<u4.a<E>> x() {
        return isEmpty() ? t5.f56492m : new c(this, null);
    }

    @Override // com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    /* renamed from: A */
    public abstract q3<E> d();

    @Override // com.google.common.collect.u4, com.google.common.collect.k6
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public q3<u4.a<E>> entrySet() {
        q3<u4.a<E>> q3Var = this.f55953d;
        if (q3Var != null) {
            return q3Var;
        }
        q3<u4.a<E>> x4 = x();
        this.f55953d = x4;
        return x4;
    }

    abstract u4.a<E> F(int i4);

    @Override // com.google.common.collect.u4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int W1(@zc.a Object obj, int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b3
    public f3<E> b() {
        f3<E> f3Var = this.f55952c;
        if (f3Var != null) {
            return f3Var;
        }
        f3<E> b5 = super.b();
        this.f55952c = b5;
        return b5;
    }

    @Override // com.google.common.collect.b3
    @d9.c
    int c(Object[] objArr, int i4) {
        e7<u4.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            u4.a<E> next = it.next();
            Arrays.fill(objArr, i4, next.getCount() + i4, next.getElement());
            i4 += next.getCount();
        }
        return i4;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return W2(obj) > 0;
    }

    @Override // com.google.common.collect.u4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int d2(E e4, int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, com.google.common.collect.u4
    public boolean equals(@zc.a Object obj) {
        return v4.i(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.u4
    public int hashCode() {
        return d6.k(entrySet());
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.b3
    @d9.c
    abstract Object m();

    @Override // com.google.common.collect.u4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int o0(E e4, int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.u4
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.u4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean x2(E e4, int i4, int i5) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: ImmutableMultiset.java */
    private final class c extends z3<u4.a<E>> {

        /* renamed from: h, reason: collision with root package name */
        private static final long f55960h = 0;

        private c() {
        }

        u4.a<E> T(int i4) {
            return m3.this.F(i4);
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof u4.a)) {
                return false;
            }
            u4.a aVar = (u4.a) obj;
            return aVar.getCount() > 0 && m3.this.W2(aVar.getElement()) == aVar.getCount();
        }

        @Override // com.google.common.collect.z3
        Object get(int i4) {
            return m3.this.F(i4);
        }

        @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
        public int hashCode() {
            return m3.this.hashCode();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return m3.this.j();
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3
        @d9.c
        Object m() {
            return new d(m3.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m3.this.d().size();
        }

        /* synthetic */ c(m3 m3Var, a aVar) {
            this();
        }
    }

    /* compiled from: ImmutableMultiset.java */
    public static class b<E> extends b3.b<E> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        c5<E> f55957b;

        /* renamed from: c, reason: collision with root package name */
        boolean f55958c;

        /* renamed from: d, reason: collision with root package name */
        boolean f55959d;

        b(int i4) {
            this.f55958c = false;
            this.f55959d = false;
            this.f55957b = new c5<>(i4);
        }

        @zc.a
        static <T> c5<T> n(Iterable<T> iterable) {
            if (iterable instanceof s5) {
                return ((s5) iterable).f56415e;
            }
            if (iterable instanceof f) {
                return ((f) iterable).f55693d;
            }
            return null;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<E> a(E e4) {
            return k(e4, 1);
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<E> c(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f55957b);
            if (iterable instanceof u4) {
                u4 u4Var = (u4) iterable;
                c5 n4 = n(u4Var);
                if (n4 != null) {
                    c5<E> c5Var = this.f55957b;
                    c5Var.e(Math.max(c5Var.D(), n4.D()));
                    for (int f4 = n4.f(); f4 >= 0; f4 = n4.t(f4)) {
                        k(n4.j(f4), n4.l(f4));
                    }
                } else {
                    Set<u4.a<E>> entrySet = u4Var.entrySet();
                    c5<E> c5Var2 = this.f55957b;
                    c5Var2.e(Math.max(c5Var2.D(), entrySet.size()));
                    for (u4.a<E> aVar : u4Var.entrySet()) {
                        k(aVar.getElement(), aVar.getCount());
                    }
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.b3.b
        @f9.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @f9.a
        public b<E> k(E e4, int i4) {
            Objects.requireNonNull(this.f55957b);
            if (i4 == 0) {
                return this;
            }
            if (this.f55958c) {
                this.f55957b = new c5<>(this.f55957b);
                this.f55959d = false;
            }
            this.f55958c = false;
            e4.getClass();
            c5<E> c5Var = this.f55957b;
            c5Var.v(e4, i4 + c5Var.g(e4));
            return this;
        }

        @Override // com.google.common.collect.b3.b
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public m3<E> e() {
            Objects.requireNonNull(this.f55957b);
            if (this.f55957b.D() == 0) {
                return m3.G();
            }
            if (this.f55959d) {
                this.f55957b = new c5<>(this.f55957b);
                this.f55959d = false;
            }
            this.f55958c = true;
            return new s5(this.f55957b);
        }

        @f9.a
        public b<E> m(E e4, int i4) {
            Objects.requireNonNull(this.f55957b);
            if (i4 == 0 && !this.f55959d) {
                this.f55957b = new d5(this.f55957b);
                this.f55959d = true;
            } else if (this.f55958c) {
                this.f55957b = new c5<>(this.f55957b);
                this.f55959d = false;
            }
            this.f55958c = false;
            e4.getClass();
            if (i4 == 0) {
                this.f55957b.w(e4);
            } else {
                this.f55957b.v(e4, i4);
            }
            return this;
        }

        b(boolean z4) {
            this.f55958c = false;
            this.f55959d = false;
            this.f55957b = null;
        }

        public b() {
            this(4);
        }
    }
}
