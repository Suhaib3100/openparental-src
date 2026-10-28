package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.p4;
import com.google.common.collect.q0;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TreeRangeMap.java */
@w0
@d9.c
@d9.a
/* loaded from: classes6.dex */
public final class b7<K extends Comparable, V> implements l5<K, V> {

    /* renamed from: c, reason: collision with root package name */
    private static final l5<Comparable<?>, Object> f55387c = new a();

    /* renamed from: b, reason: collision with root package name */
    private final NavigableMap<q0<K>, c<K, V>> f55388b = new TreeMap();

    /* compiled from: TreeRangeMap.java */
    class a implements l5<Comparable<?>, Object> {
        a() {
        }

        @Override // com.google.common.collect.l5
        public void a(j5<Comparable<?>> j5Var) {
            j5Var.getClass();
        }

        @Override // com.google.common.collect.l5
        public j5<Comparable<?>> c() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.l5
        public void clear() {
        }

        @Override // com.google.common.collect.l5
        public l5<Comparable<?>, Object> d(j5<Comparable<?>> j5Var) {
            j5Var.getClass();
            return this;
        }

        @Override // com.google.common.collect.l5
        public Map<j5<Comparable<?>>, Object> e() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.l5
        @zc.a
        public Map.Entry<j5<Comparable<?>>, Object> f(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.l5
        public Map<j5<Comparable<?>>, Object> g() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.l5
        @zc.a
        public Object h(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.l5
        public void i(l5<Comparable<?>, Object> l5Var) {
            if (!l5Var.e().isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf45d"));
            }
        }

        @Override // com.google.common.collect.l5
        public void j(j5<Comparable<?>> j5Var, Object obj) {
            j5Var.getClass();
            String valueOf = String.valueOf(j5Var);
            throw new IllegalArgumentException(com.google.common.base.h.a(valueOf.length() + 46, ProtectedSandApp.s("\uf45e"), valueOf, ProtectedSandApp.s("\uf45f")));
        }

        @Override // com.google.common.collect.l5
        public void k(j5<Comparable<?>> j5Var, Object obj) {
            j5Var.getClass();
            String valueOf = String.valueOf(j5Var);
            throw new IllegalArgumentException(com.google.common.base.h.a(valueOf.length() + 46, ProtectedSandApp.s("\uf45e"), valueOf, ProtectedSandApp.s("\uf45f")));
        }
    }

    /* compiled from: TreeRangeMap.java */
    private final class b extends p4.a0<j5<K>, V> {

        /* renamed from: b, reason: collision with root package name */
        final Iterable<Map.Entry<j5<K>, V>> f55389b;

        b(Iterable<c<K, V>> iterable) {
            this.f55389b = iterable;
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<j5<K>, V>> b() {
            return this.f55389b.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            if (!(obj instanceof j5)) {
                return null;
            }
            j5 j5Var = (j5) obj;
            c cVar = (c) b7.this.f55388b.get(j5Var.f55872b);
            if (cVar == null || !cVar.d().equals(j5Var)) {
                return null;
            }
            return (V) cVar.getValue();
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return b7.this.f55388b.size();
        }
    }

    /* compiled from: TreeRangeMap.java */
    private static final class c<K extends Comparable, V> extends g<j5<K>, V> {

        /* renamed from: b, reason: collision with root package name */
        private final j5<K> f55391b;

        /* renamed from: c, reason: collision with root package name */
        private final V f55392c;

        c(q0<K> q0Var, q0<K> q0Var2, V v4) {
            this(j5.k(q0Var, q0Var2), v4);
        }

        public boolean a(K k4) {
            return this.f55391b.i(k4);
        }

        public j5<K> d() {
            return this.f55391b;
        }

        q0<K> e() {
            return this.f55391b.f55872b;
        }

        q0<K> g() {
            return this.f55391b.f55873c;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public Object getKey() {
            return this.f55391b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f55392c;
        }

        c(j5<K> j5Var, V v4) {
            this.f55391b = j5Var;
            this.f55392c = v4;
        }
    }

    /* compiled from: TreeRangeMap.java */
    private class d implements l5<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final j5<K> f55393b;

        /* compiled from: TreeRangeMap.java */
        class a extends b7<K, V>.d.b {

            /* compiled from: TreeRangeMap.java */
            /* renamed from: com.google.common.collect.b7$d$a$a, reason: collision with other inner class name */
            class C0839a extends com.google.common.collect.c<Map.Entry<j5<K>, V>> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Iterator f55396d;

                C0839a(Iterator it) {
                    this.f55396d = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @zc.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<j5<K>, V> a() {
                    if (!this.f55396d.hasNext()) {
                        return (Map.Entry) b();
                    }
                    c cVar = (c) this.f55396d.next();
                    return cVar.g().compareTo(d.this.f55393b.f55872b) <= 0 ? (Map.Entry) b() : new c3(cVar.d().s(d.this.f55393b), cVar.getValue());
                }
            }

            a() {
                super();
            }

            @Override // com.google.common.collect.b7.d.b
            Iterator<Map.Entry<j5<K>, V>> c() {
                return d.this.f55393b.u() ? d4.l.f55558f : new C0839a(b7.this.f55388b.headMap(d.this.f55393b.f55873c, false).descendingMap().values().iterator());
            }
        }

        /* compiled from: TreeRangeMap.java */
        class b extends AbstractMap<j5<K>, V> {

            /* compiled from: TreeRangeMap.java */
            class a extends p4.b0<j5<K>, V> {
                a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@zc.a Object obj) {
                    return b.this.remove(obj) != null;
                }

                @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.KEY));
                }
            }

            /* compiled from: TreeRangeMap.java */
            /* renamed from: com.google.common.collect.b7$d$b$b, reason: collision with other inner class name */
            class C0840b extends p4.s<j5<K>, V> {
                C0840b() {
                }

                @Override // com.google.common.collect.p4.s
                Map<j5<K>, V> i() {
                    return b.this;
                }

                @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<j5<K>, V>> iterator() {
                    return b.this.c();
                }

                @Override // com.google.common.collect.p4.s, com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)));
                }

                @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return d4.Z(iterator());
                }
            }

            /* compiled from: TreeRangeMap.java */
            class c extends com.google.common.collect.c<Map.Entry<j5<K>, V>> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Iterator f55401d;

                c(Iterator it) {
                    this.f55401d = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @zc.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<j5<K>, V> a() {
                    while (this.f55401d.hasNext()) {
                        c cVar = (c) this.f55401d.next();
                        if (cVar.e().compareTo(d.this.f55393b.f55873c) >= 0) {
                            return (Map.Entry) b();
                        }
                        if (cVar.g().compareTo(d.this.f55393b.f55872b) > 0) {
                            return new c3(cVar.d().s(d.this.f55393b), cVar.getValue());
                        }
                    }
                    return (Map.Entry) b();
                }
            }

            /* compiled from: TreeRangeMap.java */
            /* renamed from: com.google.common.collect.b7$d$b$d, reason: collision with other inner class name */
            class C0841d extends p4.q0<j5<K>, V> {
                C0841d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return b.this.d(com.google.common.base.n0.h(com.google.common.base.n0.n(collection), p4.r.VALUE));
                }

                @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.VALUE));
                }
            }

            b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean d(com.google.common.base.m0<? super Map.Entry<j5<K>, V>> m0Var) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<j5<K>, V> entry : entrySet()) {
                    if (m0Var.apply(entry)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b7.this.a((j5) it.next());
                }
                return !arrayList.isEmpty();
            }

            Iterator<Map.Entry<j5<K>, V>> c() {
                if (d.this.f55393b.u()) {
                    return d4.l.f55558f;
                }
                return new c(b7.this.f55388b.tailMap((q0) com.google.common.base.d0.a((q0) b7.this.f55388b.floorKey(d.this.f55393b.f55872b), d.this.f55393b.f55872b), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@zc.a Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<j5<K>, V>> entrySet() {
                return new C0840b();
            }

            @Override // java.util.AbstractMap, java.util.Map
            @zc.a
            public V get(@zc.a Object obj) {
                c cVar;
                try {
                    if (obj instanceof j5) {
                        j5 j5Var = (j5) obj;
                        if (d.this.f55393b.n(j5Var) && !j5Var.u()) {
                            if (j5Var.f55872b.compareTo(d.this.f55393b.f55872b) == 0) {
                                Map.Entry floorEntry = b7.this.f55388b.floorEntry(j5Var.f55872b);
                                cVar = floorEntry != null ? (c) floorEntry.getValue() : null;
                            } else {
                                cVar = (c) b7.this.f55388b.get(j5Var.f55872b);
                            }
                            if (cVar != null && cVar.d().t(d.this.f55393b) && cVar.d().s(d.this.f55393b).equals(j5Var)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<j5<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @zc.a
            public V remove(@zc.a Object obj) {
                V v4 = (V) get(obj);
                if (v4 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                b7.this.a((j5) obj);
                return v4;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C0841d(this);
            }
        }

        d(j5<K> j5Var) {
            this.f55393b = j5Var;
        }

        @Override // com.google.common.collect.l5
        public void a(j5<K> j5Var) {
            if (j5Var.t(this.f55393b)) {
                b7.this.a(j5Var.s(this.f55393b));
            }
        }

        @Override // com.google.common.collect.l5
        public j5<K> c() {
            q0<K> q0Var;
            Map.Entry floorEntry = b7.this.f55388b.floorEntry(this.f55393b.f55872b);
            if (floorEntry == null || ((c) floorEntry.getValue()).g().compareTo(this.f55393b.f55872b) <= 0) {
                q0Var = (q0) b7.this.f55388b.ceilingKey(this.f55393b.f55872b);
                if (q0Var == null || q0Var.compareTo(this.f55393b.f55873c) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                q0Var = this.f55393b.f55872b;
            }
            Map.Entry lowerEntry = b7.this.f55388b.lowerEntry(this.f55393b.f55873c);
            if (lowerEntry != null) {
                return j5.k(q0Var, ((c) lowerEntry.getValue()).g().compareTo(this.f55393b.f55873c) >= 0 ? this.f55393b.f55873c : ((c) lowerEntry.getValue()).g());
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.l5
        public void clear() {
            b7.this.a(this.f55393b);
        }

        @Override // com.google.common.collect.l5
        public l5<K, V> d(j5<K> j5Var) {
            return !j5Var.t(this.f55393b) ? b7.m(b7.this) : b7.this.d(j5Var.s(this.f55393b));
        }

        @Override // com.google.common.collect.l5
        public Map<j5<K>, V> e() {
            return new b();
        }

        @Override // com.google.common.collect.l5
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof l5) {
                return e().equals(((l5) obj).e());
            }
            return false;
        }

        @Override // com.google.common.collect.l5
        @zc.a
        public Map.Entry<j5<K>, V> f(K k4) {
            Map.Entry<j5<K>, V> f4;
            if (!this.f55393b.i(k4) || (f4 = b7.this.f(k4)) == null) {
                return null;
            }
            return new c3(f4.getKey().s(this.f55393b), f4.getValue());
        }

        @Override // com.google.common.collect.l5
        public Map<j5<K>, V> g() {
            return new a();
        }

        @Override // com.google.common.collect.l5
        @zc.a
        public V h(K k4) {
            if (this.f55393b.i(k4)) {
                return (V) b7.this.h(k4);
            }
            return null;
        }

        @Override // com.google.common.collect.l5
        public int hashCode() {
            return e().hashCode();
        }

        @Override // com.google.common.collect.l5
        public void i(l5<K, V> l5Var) {
            if (l5Var.e().isEmpty()) {
                return;
            }
            j5<K> c5 = l5Var.c();
            com.google.common.base.l0.y(this.f55393b.n(c5), ProtectedSandApp.s("\uf461"), c5, this.f55393b);
            b7.this.i(l5Var);
        }

        @Override // com.google.common.collect.l5
        public void j(j5<K> j5Var, V v4) {
            if (b7.this.f55388b.isEmpty() || !this.f55393b.n(j5Var)) {
                k(j5Var, v4);
                return;
            }
            b7 b7Var = b7.this;
            v4.getClass();
            k(b7Var.o(j5Var, v4).s(this.f55393b), v4);
        }

        @Override // com.google.common.collect.l5
        public void k(j5<K> j5Var, V v4) {
            com.google.common.base.l0.y(this.f55393b.n(j5Var), ProtectedSandApp.s("\uf462"), j5Var, this.f55393b);
            b7.this.k(j5Var, v4);
        }

        @Override // com.google.common.collect.l5
        public String toString() {
            return e().toString();
        }
    }

    private b7() {
    }

    static l5 m(b7 b7Var) {
        b7Var.getClass();
        return f55387c;
    }

    private static <K extends Comparable, V> j5<K> n(j5<K> j5Var, V v4, @zc.a Map.Entry<q0<K>, c<K, V>> entry) {
        return (entry != null && entry.getValue().d().t(j5Var) && entry.getValue().getValue().equals(v4)) ? j5Var.F(entry.getValue().d()) : j5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j5<K> o(j5<K> j5Var, V v4) {
        return n(n(j5Var, v4, this.f55388b.lowerEntry(j5Var.f55872b)), v4, this.f55388b.floorEntry(j5Var.f55873c));
    }

    public static <K extends Comparable, V> b7<K, V> p() {
        return new b7<>();
    }

    private l5<K, V> q() {
        return f55387c;
    }

    private void r(q0<K> q0Var, q0<K> q0Var2, V v4) {
        this.f55388b.put(q0Var, new c<>(q0Var, q0Var2, v4));
    }

    @Override // com.google.common.collect.l5
    public void a(j5<K> j5Var) {
        if (j5Var.u()) {
            return;
        }
        Map.Entry<q0<K>, c<K, V>> lowerEntry = this.f55388b.lowerEntry(j5Var.f55872b);
        if (lowerEntry != null) {
            c<K, V> value = lowerEntry.getValue();
            if (value.g().compareTo(j5Var.f55872b) > 0) {
                if (value.g().compareTo(j5Var.f55873c) > 0) {
                    r(j5Var.f55873c, value.g(), lowerEntry.getValue().getValue());
                }
                r(value.e(), j5Var.f55872b, lowerEntry.getValue().getValue());
            }
        }
        Map.Entry<q0<K>, c<K, V>> lowerEntry2 = this.f55388b.lowerEntry(j5Var.f55873c);
        if (lowerEntry2 != null) {
            c<K, V> value2 = lowerEntry2.getValue();
            if (value2.g().compareTo(j5Var.f55873c) > 0) {
                r(j5Var.f55873c, value2.g(), lowerEntry2.getValue().getValue());
            }
        }
        this.f55388b.subMap(j5Var.f55872b, j5Var.f55873c).clear();
    }

    @Override // com.google.common.collect.l5
    public j5<K> c() {
        Map.Entry<q0<K>, c<K, V>> firstEntry = this.f55388b.firstEntry();
        Map.Entry<q0<K>, c<K, V>> lastEntry = this.f55388b.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new NoSuchElementException();
        }
        return j5.k(firstEntry.getValue().d().f55872b, lastEntry.getValue().d().f55873c);
    }

    @Override // com.google.common.collect.l5
    public void clear() {
        this.f55388b.clear();
    }

    @Override // com.google.common.collect.l5
    public l5<K, V> d(j5<K> j5Var) {
        return j5Var.equals(j5.a()) ? this : new d(j5Var);
    }

    @Override // com.google.common.collect.l5
    public Map<j5<K>, V> e() {
        return new b(this.f55388b.values());
    }

    @Override // com.google.common.collect.l5
    public boolean equals(@zc.a Object obj) {
        if (obj instanceof l5) {
            return e().equals(((l5) obj).e());
        }
        return false;
    }

    @Override // com.google.common.collect.l5
    @zc.a
    public Map.Entry<j5<K>, V> f(K k4) {
        Map.Entry<q0<K>, c<K, V>> floorEntry = this.f55388b.floorEntry(new q0.e(k4));
        if (floorEntry == null || !floorEntry.getValue().a(k4)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.l5
    public Map<j5<K>, V> g() {
        return new b(this.f55388b.descendingMap().values());
    }

    @Override // com.google.common.collect.l5
    @zc.a
    public V h(K k4) {
        Map.Entry<j5<K>, V> f4 = f(k4);
        if (f4 == null) {
            return null;
        }
        return f4.getValue();
    }

    @Override // com.google.common.collect.l5
    public int hashCode() {
        return e().hashCode();
    }

    @Override // com.google.common.collect.l5
    public void i(l5<K, V> l5Var) {
        for (Map.Entry<j5<K>, V> entry : l5Var.e().entrySet()) {
            k(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.l5
    public void j(j5<K> j5Var, V v4) {
        if (this.f55388b.isEmpty()) {
            k(j5Var, v4);
        } else {
            v4.getClass();
            k(o(j5Var, v4), v4);
        }
    }

    @Override // com.google.common.collect.l5
    public void k(j5<K> j5Var, V v4) {
        if (j5Var.u()) {
            return;
        }
        v4.getClass();
        a(j5Var);
        this.f55388b.put(j5Var.f55872b, new c<>(j5Var, v4));
    }

    @Override // com.google.common.collect.l5
    public String toString() {
        return this.f55388b.values().toString();
    }
}
