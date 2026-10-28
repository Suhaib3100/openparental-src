package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f1;
import com.google.common.collect.p4;
import com.google.common.collect.t4;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredEntryMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
class f1<K, V> extends h<K, V> implements l1<K, V> {

    /* renamed from: g, reason: collision with root package name */
    final r4<K, V> f55712g;

    /* renamed from: h, reason: collision with root package name */
    final com.google.common.base.m0<? super Map.Entry<K, V>> f55713h;

    /* compiled from: FilteredEntryMultimap.java */
    class a extends p4.r0<K, Collection<V>> {

        /* compiled from: FilteredEntryMultimap.java */
        /* renamed from: com.google.common.collect.f1$a$a, reason: collision with other inner class name */
        class C0846a extends p4.s<K, Collection<V>> {

            /* compiled from: FilteredEntryMultimap.java */
            /* renamed from: com.google.common.collect.f1$a$a$a, reason: collision with other inner class name */
            class C0847a extends com.google.common.collect.c<Map.Entry<K, Collection<V>>> {

                /* renamed from: d, reason: collision with root package name */
                final Iterator<Map.Entry<K, Collection<V>>> f55716d;

                C0847a() {
                    this.f55716d = f1.this.f55712g.f().entrySet().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @zc.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> a() {
                    while (this.f55716d.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f55716d.next();
                        K key = next.getKey();
                        Collection n4 = f1.n(next.getValue(), new c(key));
                        if (!n4.isEmpty()) {
                            return new c3(key, n4);
                        }
                    }
                    return b();
                }
            }

            C0846a() {
            }

            @Override // com.google.common.collect.p4.s
            Map<K, Collection<V>> i() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0847a();
            }

            @Override // com.google.common.collect.p4.s, com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.n(collection));
            }

            @Override // com.google.common.collect.p4.s, com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)));
            }

            @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return d4.Z(iterator());
            }
        }

        /* compiled from: FilteredEntryMultimap.java */
        class b extends p4.b0<K, Collection<V>> {
            b() {
                super(a.this);
            }

            @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                return a.this.remove(obj) != null;
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.h(com.google.common.base.n0.n(collection), p4.r.KEY));
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.KEY));
            }
        }

        /* compiled from: FilteredEntryMultimap.java */
        class c extends p4.q0<K, Collection<V>> {
            c() {
                super(a.this);
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@zc.a Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<K, Collection<V>>> it = f1.this.f55712g.f().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection n4 = f1.n(next.getValue(), new c(next.getKey()));
                    if (!n4.isEmpty() && collection.equals(n4)) {
                        if (n4.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        n4.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.h(com.google.common.base.n0.n(collection), p4.r.VALUE));
            }

            @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return f1.this.o(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.VALUE));
            }
        }

        a() {
        }

        @Override // com.google.common.collect.p4.r0
        Set<Map.Entry<K, Collection<V>>> b() {
            return new C0846a();
        }

        @Override // com.google.common.collect.p4.r0
        /* renamed from: c */
        Set<K> i() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            f1.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.p4.r0
        Collection<Collection<V>> d() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@zc.a Object obj) {
            Collection<V> collection = f1.this.f55712g.f().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> n4 = f1.n(collection, new c(obj));
            if (n4.isEmpty()) {
                return null;
            }
            return n4;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@zc.a Object obj) {
            Collection<V> collection = f1.this.f55712g.f().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (f1.this.p(obj, next)) {
                    it.remove();
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return f1.this.f55712g instanceof c6 ? Collections.unmodifiableSet(d6.B(arrayList)) : Collections.unmodifiableList(arrayList);
        }
    }

    /* compiled from: FilteredEntryMultimap.java */
    class b extends t4.g<K, V> {

        /* compiled from: FilteredEntryMultimap.java */
        class a extends v4.i<K> {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static boolean l(com.google.common.base.m0 m0Var, Map.Entry entry) {
                return m0Var.apply(new v4.k(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            private boolean m(final com.google.common.base.m0<? super u4.a<K>> m0Var) {
                return f1.this.o(new com.google.common.base.m0() { // from class: com.google.common.collect.g1
                    @Override // com.google.common.base.m0
                    public final boolean apply(Object obj) {
                        boolean l4;
                        l4 = f1.b.a.l(com.google.common.base.m0.this, (Map.Entry) obj);
                        return l4;
                    }
                });
            }

            @Override // com.google.common.collect.v4.i
            u4<K> i() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<u4.a<K>> iterator() {
                return b.this.i();
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return m(com.google.common.base.n0.n(collection));
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return m(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return f1.this.keySet().size();
            }
        }

        b() {
            super(f1.this);
        }

        @Override // com.google.common.collect.t4.g, com.google.common.collect.i, com.google.common.collect.u4
        public int W1(@zc.a Object obj, int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf4b8"));
            if (i4 == 0) {
                return W2(obj);
            }
            Collection<V> collection = f1.this.f55712g.f().get(obj);
            int i5 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (f1.this.p(obj, it.next()) && (i5 = i5 + 1) <= i4) {
                    it.remove();
                }
            }
            return i5;
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6
        public Set<u4.a<K>> entrySet() {
            return new a();
        }
    }

    /* compiled from: FilteredEntryMultimap.java */
    final class c implements com.google.common.base.m0<V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final K f55722b;

        c(@f5 K k4) {
            this.f55722b = k4;
        }

        @Override // com.google.common.base.m0
        public boolean apply(@f5 V v4) {
            return f1.this.p(this.f55722b, v4);
        }
    }

    f1(r4<K, V> r4Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        r4Var.getClass();
        this.f55712g = r4Var;
        m0Var.getClass();
        this.f55713h = m0Var;
    }

    static <E> Collection<E> n(Collection<E> collection, com.google.common.base.m0<? super E> m0Var) {
        return collection instanceof Set ? d6.i((Set) collection, m0Var) : c0.d(collection, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(@f5 K k4, @f5 V v4) {
        return this.f55713h.apply(new c3(k4, v4));
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new a();
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    public Collection<V> b(@zc.a Object obj) {
        return (Collection) com.google.common.base.d0.a(f().remove(obj), q());
    }

    @Override // com.google.common.collect.r4
    public void clear() {
        t().clear();
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        return f().get(obj) != null;
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> d() {
        return n(this.f55712g.t(), this.f55713h);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return f().keySet();
    }

    @Override // com.google.common.collect.h
    u4<K> g() {
        return new b();
    }

    @Override // com.google.common.collect.l1
    public com.google.common.base.m0<? super Map.Entry<K, V>> g2() {
        return this.f55713h;
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Collection<V> v(@f5 K k4) {
        return n(this.f55712g.v(k4), new c(k4));
    }

    @Override // com.google.common.collect.h
    Collection<V> i() {
        return new m1(this);
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> j() {
        throw new AssertionError(ProtectedSandApp.s("\uf4b9"));
    }

    @Override // com.google.common.collect.l1
    public r4<K, V> l() {
        return this.f55712g;
    }

    boolean o(com.google.common.base.m0<? super Map.Entry<K, Collection<V>>> m0Var) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f55712g.f().entrySet().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection n4 = n(next.getValue(), new c(key));
            if (!n4.isEmpty() && m0Var.apply(new c3(key, n4))) {
                if (n4.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    n4.clear();
                }
                z4 = true;
            }
        }
        return z4;
    }

    Collection<V> q() {
        return this.f55712g instanceof c6 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.r4
    public int size() {
        return t().size();
    }
}
