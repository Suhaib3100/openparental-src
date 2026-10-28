package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b6;
import com.google.common.collect.d4;
import com.google.common.collect.u4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableMultimap.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class l3<K, V> extends v<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long f55892i = 0;

    /* renamed from: g, reason: collision with root package name */
    final transient h3<K, ? extends b3<V>> f55893g;

    /* renamed from: h, reason: collision with root package name */
    final transient int f55894h;

    /* compiled from: ImmutableMultimap.java */
    class a extends e7<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends b3<V>>> f55895b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        K f55896c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f55897d = d4.l.f55558f;

        a() {
            this.f55895b = l3.this.f55893g.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f55897d.hasNext()) {
                Map.Entry<K, ? extends b3<V>> next = this.f55895b.next();
                this.f55896c = next.getKey();
                this.f55897d = next.getValue().iterator();
            }
            K k4 = this.f55896c;
            Objects.requireNonNull(k4);
            return new c3(k4, this.f55897d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55897d.hasNext() || this.f55895b.hasNext();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    class b extends e7<V> {

        /* renamed from: b, reason: collision with root package name */
        Iterator<? extends b3<V>> f55899b;

        /* renamed from: c, reason: collision with root package name */
        Iterator<V> f55900c = d4.l.f55558f;

        b() {
            this.f55899b = l3.this.f55893g.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55900c.hasNext() || this.f55899b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f55900c.hasNext()) {
                this.f55900c = this.f55899b.next().iterator();
            }
            return this.f55900c.next();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @f9.f
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final Map<K, Collection<V>> f55902a = d0.u();

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        Comparator<? super K> f55903b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        Comparator<? super V> f55904c;

        public l3<K, V> a() {
            Collection entrySet = this.f55902a.entrySet();
            Comparator<? super K> comparator = this.f55903b;
            if (comparator != null) {
                entrySet = e5.u(comparator).t0().B(entrySet);
            }
            return g3.N(entrySet, this.f55904c);
        }

        @f9.a
        c<K, V> b(c<K, V> cVar) {
            for (Map.Entry<K, Collection<V>> entry : cVar.f55902a.entrySet()) {
                j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        Collection<V> c() {
            return new ArrayList();
        }

        @f9.a
        public c<K, V> d(Comparator<? super K> comparator) {
            comparator.getClass();
            this.f55903b = comparator;
            return this;
        }

        @f9.a
        public c<K, V> e(Comparator<? super V> comparator) {
            comparator.getClass();
            this.f55904c = comparator;
            return this;
        }

        @f9.a
        public c<K, V> f(K k4, V v4) {
            b0.a(k4, v4);
            Collection<V> collection = this.f55902a.get(k4);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f55902a;
                Collection<V> c5 = c();
                map.put(k4, c5);
                collection = c5;
            }
            collection.add(v4);
            return this;
        }

        @f9.a
        public c<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        @f9.a
        public c<K, V> h(r4<? extends K, ? extends V> r4Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : r4Var.f().entrySet()) {
                j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @d9.a
        @f9.a
        public c<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @f9.a
        public c<K, V> j(K k4, Iterable<? extends V> iterable) {
            if (k4 == null) {
                String valueOf = String.valueOf(c4.T(iterable));
                int length = valueOf.length();
                String s4 = ProtectedSandApp.s("\uf4c6");
                throw new NullPointerException(length != 0 ? s4.concat(valueOf) : new String(s4));
            }
            Collection<V> collection = this.f55902a.get(k4);
            if (collection != null) {
                for (V v4 : iterable) {
                    b0.a(k4, v4);
                    collection.add(v4);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> c5 = c();
            while (it.hasNext()) {
                V next = it.next();
                b0.a(k4, next);
                c5.add(next);
            }
            this.f55902a.put(k4, c5);
            return this;
        }

        @f9.a
        public c<K, V> k(K k4, V... vArr) {
            return j(k4, Arrays.asList(vArr));
        }
    }

    /* compiled from: ImmutableMultimap.java */
    private static class d<K, V> extends b3<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55905d = 0;

        /* renamed from: c, reason: collision with root package name */
        @ma.i
        final l3<K, V> f55906c;

        d(l3<K, V> l3Var) {
            this.f55906c = l3Var;
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f55906c.T2(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return this.f55906c.x();
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public e7<Map.Entry<K, V>> iterator() {
            return this.f55906c.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f55906c.size();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @d9.c
    static class e {

        /* renamed from: a, reason: collision with root package name */
        static final b6.b<l3> f55907a = b6.a(l3.class, ProtectedSandApp.s("\uf4ea"));

        /* renamed from: b, reason: collision with root package name */
        static final b6.b<l3> f55908b = b6.a(l3.class, ProtectedSandApp.s("\uf4eb"));

        e() {
        }
    }

    /* compiled from: ImmutableMultimap.java */
    class f extends m3<K> {
        f() {
        }

        @Override // com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
        /* renamed from: A */
        public q3<K> d() {
            return l3.this.keySet();
        }

        @Override // com.google.common.collect.m3
        u4.a<K> F(int i4) {
            Map.Entry<K, ? extends b3<V>> entry = l3.this.f55893g.entrySet().b().get(i4);
            return v4.k(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            b3<V> b3Var = l3.this.f55893g.get(obj);
            if (b3Var == null) {
                return 0;
            }
            return b3Var.size();
        }

        @Override // com.google.common.collect.m3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return l3.this.containsKey(obj);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.m3, com.google.common.collect.b3
        @d9.c
        Object m() {
            return new g(l3.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public int size() {
            return l3.this.size();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @d9.c
    private static final class g implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final l3<?, ?> f55910b;

        g(l3<?, ?> l3Var) {
            this.f55910b = l3Var;
        }

        Object a() {
            return this.f55910b.keys();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    private static final class h<K, V> extends b3<V> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f55911d = 0;

        /* renamed from: c, reason: collision with root package name */
        @ma.i
        private final transient l3<K, V> f55912c;

        h(l3<K, V> l3Var) {
            this.f55912c = l3Var;
        }

        @Override // com.google.common.collect.b3
        @d9.c
        int c(Object[] objArr, int i4) {
            e7<? extends b3<V>> it = this.f55912c.f55893g.values().iterator();
            while (it.hasNext()) {
                i4 = it.next().c(objArr, i4);
            }
            return i4;
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return this.f55912c.containsValue(obj);
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f55912c.k();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.b3
        /* renamed from: l */
        public e7<V> iterator() {
            return this.f55912c.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f55912c.size();
        }
    }

    l3(h3<K, ? extends b3<V>> h3Var, int i4) {
        this.f55893g = h3Var;
        this.f55894h = i4;
    }

    public static <K, V> l3<K, V> A() {
        return y0.f56641l;
    }

    public static <K, V> l3<K, V> B(K k4, V v4) {
        return g3.S(k4, v4);
    }

    public static <K, V> l3<K, V> C(K k4, V v4, K k5, V v5) {
        return g3.T(k4, v4, k5, v5);
    }

    public static <K, V> l3<K, V> D(K k4, V v4, K k5, V v5, K k6, V v6) {
        return g3.U(k4, v4, k5, v5, k6, v6);
    }

    public static <K, V> l3<K, V> E(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        return g3.V(k4, v4, k5, v5, k6, v6, k7, v7);
    }

    public static <K, V> l3<K, V> F(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10) {
        return g3.W(k4, v4, k5, v5, k6, v6, k7, v7, k10, v10);
    }

    public static <K, V> c<K, V> n() {
        return new c<>();
    }

    public static <K, V> l3<K, V> o(r4<? extends K, ? extends V> r4Var) {
        if (r4Var instanceof l3) {
            l3<K, V> l3Var = (l3) r4Var;
            if (!l3Var.x()) {
                return l3Var;
            }
        }
        return g3.L(r4Var);
    }

    @d9.a
    public static <K, V> l3<K, V> p(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return g3.M(iterable);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b3<V> b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b3<V> c(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public e7<V> k() {
        return new b();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public b3<V> values() {
        return (b3) super.values();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        throw new AssertionError(ProtectedSandApp.s("\uf4c7"));
    }

    @Override // com.google.common.collect.r4
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        return this.f55893g.containsKey(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean containsValue(@zc.a Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        throw new AssertionError(ProtectedSandApp.s("\uf4c8"));
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean k1(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public h3<K, Collection<V>> f() {
        return this.f55893g;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean n0(r4<? extends K, ? extends V> r4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b3<Map.Entry<K, V>> d() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public m3<K> g() {
        return new f();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b3<V> i() {
        return new h(this);
    }

    @Override // com.google.common.collect.r4
    public int size() {
        return this.f55894h;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public b3<Map.Entry<K, V>> t() {
        return (b3) super.t();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public e7<Map.Entry<K, V>> j() {
        return new a();
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    public abstract b3<V> v(K k4);

    public abstract l3<V, K> w();

    boolean x() {
        return this.f55893g.p();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public q3<K> keySet() {
        return this.f55893g.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m3<K> keys() {
        return (m3) super.keys();
    }
}
