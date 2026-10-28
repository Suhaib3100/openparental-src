package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.h;
import com.google.common.collect.p4;
import com.google.common.collect.t4;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: AbstractMapBasedMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class e<K, V> extends com.google.common.collect.h<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long f55629i = 2447537837011683357L;

    /* renamed from: g, reason: collision with root package name */
    private transient Map<K, Collection<V>> f55630g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f55631h;

    /* compiled from: AbstractMapBasedMultimap.java */
    class a extends e<K, V>.d<V> {
        a(e eVar) {
            super();
        }

        @Override // com.google.common.collect.e.d
        @f5
        V a(@f5 K k4, @f5 V v4) {
            return v4;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class b extends e<K, V>.d<Map.Entry<K, V>> {
        b(e eVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@f5 K k4, @f5 V v4) {
            return new c3(k4, v4);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    private class c extends p4.r0<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        final transient Map<K, Collection<V>> f55632e;

        /* compiled from: AbstractMapBasedMultimap.java */
        class a extends p4.s<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                return c0.j(c.this.f55632e.entrySet(), obj);
            }

            @Override // com.google.common.collect.p4.s
            Map<K, Collection<V>> i() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                e.this.B(entry.getKey());
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f55635b;

            /* renamed from: c, reason: collision with root package name */
            @zc.a
            Collection<V> f55636c;

            b() {
                this.f55635b = c.this.f55632e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f55635b.next();
                this.f55636c = next.getValue();
                return c.this.h(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55635b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.l0.h0(this.f55636c != null, ProtectedSandApp.s("\uf4a9"));
                this.f55635b.remove();
                e.r(e.this, this.f55636c.size());
                this.f55636c.clear();
                this.f55636c = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f55632e = map;
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<K, Collection<V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f55632e == e.this.f55630g) {
                e.this.clear();
            } else {
                d4.h(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return p4.o0(this.f55632e, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@zc.a Object obj) {
            Collection<V> collection = (Collection) p4.p0(this.f55632e, obj);
            if (collection == null) {
                return null;
            }
            return e.this.E(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@zc.a Object obj) {
            return this == obj || this.f55632e.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@zc.a Object obj) {
            Collection<V> remove = this.f55632e.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> u4 = e.this.u();
            u4.addAll(remove);
            e.r(e.this, remove.size());
            remove.clear();
            return u4;
        }

        Map.Entry<K, Collection<V>> h(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new c3(key, e.this.E(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f55632e.hashCode();
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return e.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f55632e.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f55632e.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f55638b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        K f55639c = null;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        Collection<V> f55640d = null;

        /* renamed from: e, reason: collision with root package name */
        Iterator<V> f55641e = d4.n.INSTANCE;

        d() {
            this.f55638b = e.this.f55630g.entrySet().iterator();
        }

        abstract T a(@f5 K k4, @f5 V v4);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55638b.hasNext() || this.f55641e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f55641e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f55638b.next();
                this.f55639c = next.getKey();
                Collection<V> value = next.getValue();
                this.f55640d = value;
                this.f55641e = value.iterator();
            }
            return a(this.f55639c, this.f55641e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f55641e.remove();
            Collection<V> collection = this.f55640d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f55638b.remove();
            }
            e.p(e.this);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.e$e, reason: collision with other inner class name */
    private class C0845e extends p4.b0<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.e$e$a */
        class a implements Iterator<K> {

            /* renamed from: b, reason: collision with root package name */
            @zc.a
            Map.Entry<K, Collection<V>> f55644b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f55645c;

            a(Iterator it) {
                this.f55645c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55645c.hasNext();
            }

            @Override // java.util.Iterator
            @f5
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f55645c.next();
                this.f55644b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.l0.h0(this.f55644b != null, ProtectedSandApp.s("\uf4aa"));
                Collection<V> value = this.f55644b.getValue();
                this.f55645c.remove();
                e.r(e.this, value.size());
                value.clear();
                this.f55644b = null;
            }
        }

        C0845e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d4.h(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return j().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return this == obj || j().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return j().keySet().hashCode();
        }

        @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(j().entrySet().iterator());
        }

        @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            int i4;
            Collection<V> remove = j().remove(obj);
            if (remove != null) {
                i4 = remove.size();
                remove.clear();
                e.r(e.this, i4);
            } else {
                i4 = 0;
            }
            return i4 > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class f extends e<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> ceilingEntry(@f5 K k4) {
            Map.Entry<K, Collection<V>> ceilingEntry = k().ceilingEntry(k4);
            if (ceilingEntry == null) {
                return null;
            }
            return h(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K ceilingKey(@f5 K k4) {
            return k().ceilingKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(k().descendingMap());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = k().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return h(firstEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> floorEntry(@f5 K k4) {
            Map.Entry<K, Collection<V>> floorEntry = k().floorEntry(k4);
            if (floorEntry == null) {
                return null;
            }
            return h(floorEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K floorKey(@f5 K k4) {
            return k().floorKey(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> higherEntry(@f5 K k4) {
            Map.Entry<K, Collection<V>> higherEntry = k().higherEntry(k4);
            if (higherEntry == null) {
                return null;
            }
            return h(higherEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K higherKey(@f5 K k4) {
            return k().higherKey(k4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.i
        /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> i() {
            return new g(k());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = k().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return h(lastEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> lowerEntry(@f5 K k4) {
            Map.Entry<K, Collection<V>> lowerEntry = k().lowerEntry(k4);
            if (lowerEntry == null) {
                return null;
            }
            return h(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K lowerKey(@f5 K k4) {
            return k().lowerKey(k4);
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(@f5 K k4) {
            return headMap(k4, false);
        }

        @Override // com.google.common.collect.e.i, com.google.common.collect.e.c, com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return j();
        }

        @zc.a
        Map.Entry<K, Collection<V>> o(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> u4 = e.this.u();
            u4.addAll(next.getValue());
            it.remove();
            return new c3(next.getKey(), e.this.D(u4));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.i
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> k() {
            return (NavigableMap) ((SortedMap) this.f55632e);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return o(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return o(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(@f5 K k4, @f5 K k5) {
            return subMap(k4, true, k5, false);
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(@f5 K k4) {
            return tailMap(k4, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@f5 K k4, boolean z4) {
            return new f(k().headMap(k4, z4));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return new f(k().subMap(k4, z4, k5, z5));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@f5 K k4, boolean z4) {
            return new f(k().tailMap(k4, z4));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class g extends e<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K ceiling(@f5 K k4) {
            return j().ceilingKey(k4);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(j().descendingMap());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K floor(@f5 K k4) {
            return j().floorKey(k4);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K higher(@f5 K k4) {
            return j().higherKey(k4);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(@f5 K k4) {
            return headSet(k4, false);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K lower(@f5 K k4) {
            return j().lowerKey(k4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.j
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) ((SortedMap) this.f56111b);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(@f5 K k4, @f5 K k5) {
            return subSet(k4, true, k5, false);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K pollFirst() {
            return (K) d4.U(iterator());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K pollLast() {
            return (K) d4.U(descendingIterator());
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(@f5 K k4) {
            return tailSet(k4, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@f5 K k4, boolean z4) {
            return new g(j().headMap(k4, z4));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return new g(j().subMap(k4, z4, k5, z5));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@f5 K k4, boolean z4) {
            return new g(j().tailMap(k4, z4));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    private class h extends e<K, V>.l implements RandomAccess {
        h(@f5 e eVar, K k4, @zc.a List<V> list, e<K, V>.k kVar) {
            super(k4, list, kVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    private class i extends e<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        SortedSet<K> f55649g;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        @f5
        public K firstKey() {
            return k().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@f5 K k4) {
            return new i(k().headMap(k4));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.r0
        public SortedSet<K> i() {
            return new j(k());
        }

        @Override // com.google.common.collect.e.c, com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        /* renamed from: j */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f55649g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> i4 = i();
            this.f55649g = i4;
            return i4;
        }

        SortedMap<K, Collection<V>> k() {
            return (SortedMap) this.f55632e;
        }

        @Override // java.util.SortedMap
        @f5
        public K lastKey() {
            return k().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@f5 K k4, @f5 K k5) {
            return new i(k().subMap(k4, k5));
        }

        public SortedMap<K, Collection<V>> tailMap(@f5 K k4) {
            return new i(k().tailMap(k4));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    private class j extends e<K, V>.C0845e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @zc.a
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        @f5
        public K first() {
            return j().firstKey();
        }

        public SortedSet<K> headSet(@f5 K k4) {
            return new j(j().headMap(k4));
        }

        SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.f56111b;
        }

        @Override // java.util.SortedSet
        @f5
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(@f5 K k4, @f5 K k5) {
            return new j(j().subMap(k4, k5));
        }

        public SortedSet<K> tailSet(@f5 K k4) {
            return new j(j().tailMap(k4));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class m extends e<K, V>.o implements NavigableSet<V> {
        m(@f5 K k4, NavigableSet<V> navigableSet, @zc.a e<K, V>.k kVar) {
            super(k4, navigableSet, kVar);
        }

        private NavigableSet<V> p(NavigableSet<V> navigableSet) {
            return new m(this.f55652b, navigableSet, c() == null ? this : c());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V ceiling(@f5 V v4) {
            return l().ceiling(v4);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(l().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return p(l().descendingSet());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V floor(@f5 V v4) {
            return l().floor(v4);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@f5 V v4, boolean z4) {
            return p(l().headSet(v4, z4));
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V higher(@f5 V v4) {
            return l().higher(v4);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V lower(@f5 V v4) {
            return l().lower(v4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.o
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> l() {
            return (NavigableSet) ((SortedSet) f());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V pollFirst() {
            return (V) d4.U(iterator());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public V pollLast() {
            return (V) d4.U(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@f5 V v4, boolean z4, @f5 V v5, boolean z5) {
            return p(l().subSet(v4, z4, v5, z5));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@f5 V v4, boolean z4) {
            return p(l().tailSet(v4, z4));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class n extends e<K, V>.k implements Set<V> {
        n(@f5 K k4, Set<V> set) {
            super(k4, set, null);
        }

        @Override // com.google.common.collect.e.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean I = d6.I((Set) this.f55653c, collection);
            if (I) {
                e.q(e.this, this.f55653c.size() - size);
                j();
            }
            return I;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class o extends e<K, V>.k implements SortedSet<V> {
        o(@f5 K k4, SortedSet<V> sortedSet, @zc.a e<K, V>.k kVar) {
            super(k4, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        @zc.a
        public Comparator<? super V> comparator() {
            return l().comparator();
        }

        @Override // java.util.SortedSet
        @f5
        public V first() {
            i();
            return l().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@f5 V v4) {
            i();
            return new o(h(), l().headSet(v4), c() == null ? this : c());
        }

        SortedSet<V> l() {
            return (SortedSet) f();
        }

        @Override // java.util.SortedSet
        @f5
        public V last() {
            i();
            return l().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@f5 V v4, @f5 V v5) {
            i();
            return new o(h(), l().subSet(v4, v5), c() == null ? this : c());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@f5 V v4) {
            i();
            return new o(h(), l().tailSet(v4), c() == null ? this : c());
        }
    }

    protected e(Map<K, Collection<V>> map) {
        com.google.common.base.l0.d(map.isEmpty());
        this.f55630g = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> A(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(@zc.a Object obj) {
        Collection collection = (Collection) p4.q0(this.f55630g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f55631h -= size;
        }
    }

    static /* synthetic */ int o(e eVar) {
        int i4 = eVar.f55631h;
        eVar.f55631h = i4 + 1;
        return i4;
    }

    static /* synthetic */ int p(e eVar) {
        int i4 = eVar.f55631h;
        eVar.f55631h = i4 - 1;
        return i4;
    }

    static /* synthetic */ int q(e eVar, int i4) {
        int i5 = eVar.f55631h + i4;
        eVar.f55631h = i5;
        return i5;
    }

    static /* synthetic */ int r(e eVar, int i4) {
        int i5 = eVar.f55631h - i4;
        eVar.f55631h = i5;
        return i5;
    }

    private Collection<V> z(@f5 K k4) {
        Collection<V> collection = this.f55630g.get(k4);
        if (collection != null) {
            return collection;
        }
        Collection<V> v4 = v(k4);
        this.f55630g.put(k4, v4);
        return v4;
    }

    final void C(Map<K, Collection<V>> map) {
        this.f55630g = map;
        this.f55631h = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.l0.d(!collection.isEmpty());
            this.f55631h = collection.size() + this.f55631h;
        }
    }

    <E> Collection<E> D(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    Collection<V> E(@f5 K k4, Collection<V> collection) {
        return new k(k4, collection, null);
    }

    final List<V> F(@f5 K k4, List<V> list, @zc.a e<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k4, list, kVar) : new l(k4, list, kVar);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new c(this.f55630g);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    public Collection<V> b(@zc.a Object obj) {
        Collection<V> remove = this.f55630g.remove(obj);
        if (remove == null) {
            return y();
        }
        Collection u4 = u();
        u4.addAll(remove);
        this.f55631h -= remove.size();
        remove.clear();
        return (Collection<V>) D(u4);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return b(k4);
        }
        Collection<V> z4 = z(k4);
        Collection<V> u4 = u();
        u4.addAll(z4);
        this.f55631h -= z4.size();
        z4.clear();
        while (it.hasNext()) {
            if (z4.add(it.next())) {
                this.f55631h++;
            }
        }
        return (Collection<V>) D(u4);
    }

    @Override // com.google.common.collect.r4
    public void clear() {
        Iterator<Collection<V>> it = this.f55630g.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f55630g.clear();
        this.f55631h = 0;
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        return this.f55630g.containsKey(obj);
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> d() {
        return this instanceof c6 ? new h.b(this) : new h.a();
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return new C0845e(this.f55630g);
    }

    @Override // com.google.common.collect.h
    u4<K> g() {
        return new t4.g(this);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    public Collection<V> get(@f5 K k4) {
        Collection<V> collection = this.f55630g.get(k4);
        if (collection == null) {
            collection = v(k4);
        }
        return E(k4, collection);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public Collection<Map.Entry<K, V>> h() {
        return super.h();
    }

    @Override // com.google.common.collect.h
    Collection<V> i() {
        return new h.c();
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> j() {
        return new b(this);
    }

    @Override // com.google.common.collect.h
    Iterator<V> k() {
        return new a(this);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean put(@f5 K k4, @f5 V v4) {
        Collection<V> collection = this.f55630g.get(k4);
        if (collection != null) {
            if (!collection.add(v4)) {
                return false;
            }
            this.f55631h++;
            return true;
        }
        Collection<V> v5 = v(k4);
        if (!v5.add(v4)) {
            throw new AssertionError(ProtectedSandApp.s("\uf4a8"));
        }
        this.f55631h++;
        this.f55630g.put(k4, v5);
        return true;
    }

    @Override // com.google.common.collect.r4
    public int size() {
        return this.f55631h;
    }

    Map<K, Collection<V>> t() {
        return this.f55630g;
    }

    abstract Collection<V> u();

    Collection<V> v(@f5 K k4) {
        return u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public Collection<V> values() {
        return super.values();
    }

    final Map<K, Collection<V>> w() {
        Map<K, Collection<V>> map = this.f55630g;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f55630g) : map instanceof SortedMap ? new i((SortedMap) this.f55630g) : new c(this.f55630g);
    }

    final Set<K> x() {
        Map<K, Collection<V>> map = this.f55630g;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f55630g) : map instanceof SortedMap ? new j((SortedMap) this.f55630g) : new C0845e(this.f55630g);
    }

    Collection<V> y() {
        return (Collection<V>) D(u());
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class k extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55652b;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f55653c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        final e<K, V>.k f55654d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        final Collection<V> f55655e;

        k(@f5 K k4, Collection<V> collection, @zc.a e<K, V>.k kVar) {
            this.f55652b = k4;
            this.f55653c = collection;
            this.f55654d = kVar;
            this.f55655e = kVar == null ? null : kVar.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@f5 V v4) {
            i();
            boolean isEmpty = this.f55653c.isEmpty();
            boolean add = this.f55653c.add(v4);
            if (add) {
                e.o(e.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f55653c.addAll(collection);
            if (addAll) {
                e.q(e.this, this.f55653c.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        void b() {
            e<K, V>.k kVar = this.f55654d;
            if (kVar != null) {
                kVar.b();
            } else {
                e.this.f55630g.put(this.f55652b, this.f55653c);
            }
        }

        @zc.a
        e<K, V>.k c() {
            return this.f55654d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f55653c.clear();
            e.r(e.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            i();
            return this.f55653c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.f55653c.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f55653c.equals(obj);
        }

        Collection<V> f() {
            return this.f55653c;
        }

        @f5
        K h() {
            return this.f55652b;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f55653c.hashCode();
        }

        void i() {
            Collection<V> collection;
            e<K, V>.k kVar = this.f55654d;
            if (kVar != null) {
                kVar.i();
                if (this.f55654d.f() != this.f55655e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f55653c.isEmpty() || (collection = (Collection) e.this.f55630g.get(this.f55652b)) == null) {
                    return;
                }
                this.f55653c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        void j() {
            e<K, V>.k kVar = this.f55654d;
            if (kVar != null) {
                kVar.j();
            } else if (this.f55653c.isEmpty()) {
                e.this.f55630g.remove(this.f55652b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@zc.a Object obj) {
            i();
            boolean remove = this.f55653c.remove(obj);
            if (remove) {
                e.p(e.this);
                j();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f55653c.removeAll(collection);
            if (removeAll) {
                e.q(e.this, this.f55653c.size() - size);
                j();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f55653c.retainAll(collection);
            if (retainAll) {
                e.q(e.this, this.f55653c.size() - size);
                j();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f55653c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f55653c.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<V> f55657b;

            /* renamed from: c, reason: collision with root package name */
            final Collection<V> f55658c;

            a() {
                Collection<V> collection = k.this.f55653c;
                this.f55658c = collection;
                this.f55657b = e.A(collection);
            }

            Iterator<V> a() {
                b();
                return this.f55657b;
            }

            void b() {
                k.this.i();
                if (k.this.f55653c != this.f55658c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f55657b.hasNext();
            }

            @Override // java.util.Iterator
            @f5
            public V next() {
                b();
                return this.f55657b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f55657b.remove();
                e.p(e.this);
                k.this.j();
            }

            a(Iterator<V> it) {
                this.f55658c = k.this.f55653c;
                this.f55657b = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    class l extends e<K, V>.k implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        private class a extends e<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(@f5 V v4) {
                boolean isEmpty = l.this.isEmpty();
                ((ListIterator) a()).add(v4);
                e.o(e.this);
                if (isEmpty) {
                    l.this.b();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return ((ListIterator) a()).hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return ((ListIterator) a()).nextIndex();
            }

            @Override // java.util.ListIterator
            @f5
            public V previous() {
                return (V) ((ListIterator) a()).previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return ((ListIterator) a()).previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@f5 V v4) {
                ((ListIterator) a()).set(v4);
            }

            public a(int i4) {
                super(l.this.l().listIterator(i4));
            }
        }

        l(@f5 K k4, List<V> list, @zc.a e<K, V>.k kVar) {
            super(k4, list, kVar);
        }

        @Override // java.util.List
        public void add(int i4, @f5 V v4) {
            i();
            boolean isEmpty = f().isEmpty();
            l().add(i4, v4);
            e.o(e.this);
            if (isEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i4, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = l().addAll(i4, collection);
            if (addAll) {
                e.q(e.this, f().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        @f5
        public V get(int i4) {
            i();
            return l().get(i4);
        }

        @Override // java.util.List
        public int indexOf(@zc.a Object obj) {
            i();
            return l().indexOf(obj);
        }

        List<V> l() {
            return (List) f();
        }

        @Override // java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            i();
            return l().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        @f5
        public V remove(int i4) {
            i();
            V remove = l().remove(i4);
            e.p(e.this);
            j();
            return remove;
        }

        @Override // java.util.List
        @f5
        public V set(int i4, @f5 V v4) {
            i();
            return l().set(i4, v4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i4, int i5) {
            i();
            return e.this.F(h(), l().subList(i4, i5), c() == null ? this : c());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i4) {
            i();
            return new a(i4);
        }
    }
}
