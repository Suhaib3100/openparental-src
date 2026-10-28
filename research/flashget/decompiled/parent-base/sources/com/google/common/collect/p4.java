package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.c0;
import com.google.common.collect.d6;
import com.google.common.collect.h3;
import com.google.common.collect.m4;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Maps.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class p4 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* compiled from: Maps.java */
    class a<V1, V2> implements com.google.common.base.x<V1, V2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f56107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f56108c;

        a(t tVar, Object obj) {
            this.f56107b = tVar;
            this.f56108c = obj;
        }

        @Override // com.google.common.base.x
        @f5
        public V2 apply(@f5 V1 v12) {
            return (V2) this.f56107b.a(this.f56108c, v12);
        }
    }

    /* compiled from: Maps.java */
    static abstract class a0<K, V> extends AbstractMap<K, V> {

        /* compiled from: Maps.java */
        class a extends s<K, V> {
            a() {
            }

            @Override // com.google.common.collect.p4.s
            Map<K, V> i() {
                return a0.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a0.this.b();
            }
        }

        a0() {
        }

        abstract Iterator<Map.Entry<K, V>> b();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            d4.h(b());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: Maps.java */
    class b<K, V1, V2> implements com.google.common.base.x<Map.Entry<K, V1>, V2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f56110b;

        b(t tVar) {
            this.f56110b = tVar;
        }

        @Override // com.google.common.base.x
        @f5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f56110b.a(entry.getKey(), entry.getValue());
        }
    }

    /* compiled from: Maps.java */
    static class b0<K, V> extends d6.k<K> {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final Map<K, V> f56111b;

        b0(Map<K, V> map) {
            map.getClass();
            this.f56111b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return j().containsKey(obj);
        }

        /* renamed from: i */
        Map<K, V> j() {
            return this.f56111b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return j().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(j().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!contains(obj)) {
                return false;
            }
            j().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* compiled from: Maps.java */
    class c<K, V2> extends com.google.common.collect.g<K, V2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f56112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f56113c;

        c(Map.Entry entry, t tVar) {
            this.f56112b = entry;
            this.f56113c = tVar;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getKey() {
            return (K) this.f56112b.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V2 getValue() {
            return (V2) this.f56113c.a(this.f56112b.getKey(), this.f56112b.getValue());
        }
    }

    /* compiled from: Maps.java */
    static class c0<K, V> implements m4<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final Map<K, V> f56114a;

        /* renamed from: b, reason: collision with root package name */
        final Map<K, V> f56115b;

        /* renamed from: c, reason: collision with root package name */
        final Map<K, V> f56116c;

        /* renamed from: d, reason: collision with root package name */
        final Map<K, m4.a<V>> f56117d;

        c0(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, m4.a<V>> map4) {
            this.f56114a = p4.K0(map);
            this.f56115b = p4.K0(map2);
            this.f56116c = p4.K0(map3);
            this.f56117d = p4.K0(map4);
        }

        @Override // com.google.common.collect.m4
        public Map<K, V> a() {
            return this.f56115b;
        }

        @Override // com.google.common.collect.m4
        public Map<K, V> b() {
            return this.f56114a;
        }

        @Override // com.google.common.collect.m4
        public Map<K, m4.a<V>> c() {
            return this.f56117d;
        }

        @Override // com.google.common.collect.m4
        public Map<K, V> d() {
            return this.f56116c;
        }

        @Override // com.google.common.collect.m4
        public boolean e() {
            return this.f56114a.isEmpty() && this.f56115b.isEmpty() && this.f56117d.isEmpty();
        }

        @Override // com.google.common.collect.m4
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m4)) {
                return false;
            }
            m4 m4Var = (m4) obj;
            return b().equals(m4Var.b()) && a().equals(m4Var.a()) && d().equals(m4Var.d()) && c().equals(m4Var.c());
        }

        @Override // com.google.common.collect.m4
        public int hashCode() {
            return Arrays.hashCode(new Object[]{b(), a(), d(), c()});
        }

        public String toString() {
            if (e()) {
                return ProtectedSandApp.s("\uf511");
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf512"));
            if (!this.f56114a.isEmpty()) {
                sb.append(ProtectedSandApp.s("\uf513"));
                sb.append(this.f56114a);
            }
            if (!this.f56115b.isEmpty()) {
                sb.append(ProtectedSandApp.s("\uf514"));
                sb.append(this.f56115b);
            }
            if (!this.f56117d.isEmpty()) {
                sb.append(ProtectedSandApp.s("\uf515"));
                sb.append(this.f56117d);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: Maps.java */
    class d<K, V1, V2> implements com.google.common.base.x<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f56118b;

        d(t tVar) {
            this.f56118b = tVar;
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return p4.A0(this.f56118b, entry);
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    private static final class d0<K, V> extends com.google.common.collect.j<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableSet<K> f56119b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.common.base.x<? super K, V> f56120c;

        d0(NavigableSet<K> navigableSet, com.google.common.base.x<? super K, V> xVar) {
            navigableSet.getClass();
            this.f56119b = navigableSet;
            xVar.getClass();
            this.f56120c = xVar;
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<K, V>> b() {
            return p4.m(this.f56119b, this.f56120c);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<K, V>> c() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f56119b.clear();
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return this.f56119b.comparator();
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return new d0(this.f56119b.descendingSet(), this.f56120c);
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            if (com.google.common.collect.c0.j(this.f56119b, obj)) {
                return this.f56120c.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@f5 K k4, boolean z4) {
            return new d0(this.f56119b.headSet(k4, z4), this.f56120c);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new j(this.f56119b);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56119b.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return new d0(this.f56119b.subSet(k4, z4, k5, z5), this.f56120c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@f5 K k4, boolean z4) {
            return new d0(this.f56119b.tailSet(k4, z4), this.f56120c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class e<K, V> extends v6<Map.Entry<K, V>, K> {
        e(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v6
        @f5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    static class e0<K, V> extends g0<K, V> implements NavigableSet<K> {
        e0(NavigableMap<K, V> navigableMap) {
            super((Map) navigableMap);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K ceiling(@f5 K k4) {
            return i().ceilingKey(k4);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return i().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K floor(@f5 K k4) {
            return i().floorKey(k4);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@f5 K k4, boolean z4) {
            return i().headMap(k4, z4).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K higher(@f5 K k4) {
            return i().higherKey(k4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.g0
        /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> j() {
            return (NavigableMap) this.f56111b;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K lower(@f5 K k4) {
            return i().lowerKey(k4);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K pollFirst() {
            return (K) p4.T(i().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public K pollLast() {
            return (K) p4.T(i().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return i().subMap(k4, z4, k5, z5).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@f5 K k4, boolean z4) {
            return i().tailMap(k4, z4).navigableKeySet();
        }

        @Override // com.google.common.collect.p4.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@f5 K k4) {
            return headSet(k4, false);
        }

        @Override // com.google.common.collect.p4.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@f5 K k4, @f5 K k5) {
            return subSet(k4, true, k5, false);
        }

        @Override // com.google.common.collect.p4.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@f5 K k4) {
            return tailSet(k4, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class f<K, V> extends v6<Map.Entry<K, V>, V> {
        f(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v6
        @f5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* compiled from: Maps.java */
    private static class f0<K, V> extends o<K, V> implements SortedMap<K, V> {
        f0(SortedSet<K> sortedSet, com.google.common.base.x<? super K, V> xVar) {
            super(sortedSet, xVar);
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.o
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> e() {
            return (SortedSet) super.e();
        }

        @Override // java.util.SortedMap
        @f5
        public K firstKey() {
            return e().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@f5 K k4) {
            return new f0((Set) e().headSet(k4), (com.google.common.base.x) this.f56139f);
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return new i(e());
        }

        @Override // java.util.SortedMap
        @f5
        public K lastKey() {
            return e().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@f5 K k4, @f5 K k5) {
            return new f0((Set) e().subSet(k4, k5), (com.google.common.base.x) this.f56139f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@f5 K k4) {
            return new f0((Set) e().tailSet(k4), (com.google.common.base.x) this.f56139f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class g<K, V> extends v6<K, Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f56121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Iterator it, com.google.common.base.x xVar) {
            super(it);
            this.f56121c = xVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@f5 K k4) {
            return new c3(k4, this.f56121c.apply(k4));
        }
    }

    /* compiled from: Maps.java */
    static class g0<K, V> extends b0<K, V> implements SortedSet<K> {
        g0(SortedMap<K, V> sortedMap) {
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
            return new g0((Map) j().headMap(k4));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.b0
        public SortedMap<K, V> j() {
            return (SortedMap) this.f56111b;
        }

        @Override // java.util.SortedSet
        @f5
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(@f5 K k4, @f5 K k5) {
            return new g0((Map) j().subMap(k4, k5));
        }

        public SortedSet<K> tailSet(@f5 K k4) {
            return new g0((Map) j().tailMap(k4));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Maps.java */
    class h<E> extends j2<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f56122b;

        h(Set set) {
            this.f56122b = set;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3, reason: merged with bridge method [inline-methods] */
        public Set<E> u3() {
            return this.f56122b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: Maps.java */
    static class h0<K, V> extends c0<K, V> implements j6<K, V> {
        h0(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, m4.a<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.p4.c0, com.google.common.collect.m4
        public SortedMap<K, V> a() {
            return (SortedMap) this.f56115b;
        }

        @Override // com.google.common.collect.p4.c0, com.google.common.collect.m4
        public SortedMap<K, V> b() {
            return (SortedMap) this.f56114a;
        }

        @Override // com.google.common.collect.p4.c0, com.google.common.collect.m4
        public SortedMap<K, m4.a<V>> c() {
            return (SortedMap) this.f56117d;
        }

        @Override // com.google.common.collect.p4.c0, com.google.common.collect.m4
        public SortedMap<K, V> d() {
            return (SortedMap) this.f56116c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Maps.java */
    class i<E> extends n2<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SortedSet f56123b;

        i(SortedSet sortedSet) {
            this.f56123b = sortedSet;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: W3 */
        public SortedSet<E> u3() {
            return this.f56123b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@f5 E e4) {
            return new i(super.headSet(e4));
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
            return new i(super.subSet(e4, e5));
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@f5 E e4) {
            return new i(super.tailSet(e4));
        }
    }

    /* compiled from: Maps.java */
    static class i0<K, V1, V2> extends a0<K, V2> {

        /* renamed from: b, reason: collision with root package name */
        final Map<K, V1> f56124b;

        /* renamed from: c, reason: collision with root package name */
        final t<? super K, ? super V1, V2> f56125c;

        i0(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
            map.getClass();
            this.f56124b = map;
            tVar.getClass();
            this.f56125c = tVar;
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<K, V2>> b() {
            return d4.c0(this.f56124b.entrySet().iterator(), p4.g(this.f56125c));
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f56124b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56124b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V2 get(@zc.a Object obj) {
            V1 v12 = this.f56124b.get(obj);
            if (v12 != null || this.f56124b.containsKey(obj)) {
                return this.f56125c.a(obj, v12);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f56124b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V2 remove(@zc.a Object obj) {
            if (this.f56124b.containsKey(obj)) {
                return this.f56125c.a(obj, this.f56124b.remove(obj));
            }
            return null;
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56124b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new q0(this);
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    private static class j0<K, V1, V2> extends k0<K, V1, V2> implements NavigableMap<K, V2> {
        j0(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
            super((Map) navigableMap, (t) tVar);
        }

        @zc.a
        private Map.Entry<K, V2> i(@zc.a Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return p4.A0(this.f56125c, entry);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> ceilingEntry(@f5 K k4) {
            return i(c().ceilingEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K ceilingKey(@f5 K k4) {
            return c().ceilingKey(k4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p4.k0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> c() {
            return (NavigableMap) ((SortedMap) this.f56124b);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return c().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return new j0((Map) c().descendingMap(), (t) this.f56125c);
        }

        @Override // com.google.common.collect.p4.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(@f5 K k4) {
            return headMap(k4, false);
        }

        @Override // com.google.common.collect.p4.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(@f5 K k4, @f5 K k5) {
            return subMap(k4, true, k5, false);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> firstEntry() {
            return i(c().firstEntry());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> floorEntry(@f5 K k4) {
            return i(c().floorEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K floorKey(@f5 K k4) {
            return c().floorKey(k4);
        }

        @Override // com.google.common.collect.p4.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(@f5 K k4) {
            return tailMap(k4, true);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> higherEntry(@f5 K k4) {
            return i(c().higherEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K higherKey(@f5 K k4) {
            return c().higherKey(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> lastEntry() {
            return i(c().lastEntry());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> lowerEntry(@f5 K k4) {
            return i(c().lowerEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K lowerKey(@f5 K k4) {
            return c().lowerKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return c().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> pollFirstEntry() {
            return i(c().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V2> pollLastEntry() {
            return i(c().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@f5 K k4, boolean z4) {
            return new j0((Map) c().headMap(k4, z4), (t) this.f56125c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return new j0((Map) c().subMap(k4, z4, k5, z5), (t) this.f56125c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@f5 K k4, boolean z4) {
            return new j0((Map) c().tailMap(k4, z4), (t) this.f56125c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class k<K, V> extends com.google.common.collect.g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f56127b;

        k(Map.Entry entry) {
            this.f56127b = entry;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getKey() {
            return (K) this.f56127b.getKey();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V getValue() {
            return (V) this.f56127b.getValue();
        }
    }

    /* compiled from: Maps.java */
    static class k0<K, V1, V2> extends i0<K, V1, V2> implements SortedMap<K, V2> {
        k0(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
            super(sortedMap, tVar);
        }

        protected SortedMap<K, V1> c() {
            return (SortedMap) this.f56124b;
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedMap
        @f5
        public K firstKey() {
            return c().firstKey();
        }

        public SortedMap<K, V2> headMap(@f5 K k4) {
            return new k0((Map) c().headMap(k4), (t) this.f56125c);
        }

        @Override // java.util.SortedMap
        @f5
        public K lastKey() {
            return c().lastKey();
        }

        public SortedMap<K, V2> subMap(@f5 K k4, @f5 K k5) {
            return new k0((Map) c().subMap(k4, k5), (t) this.f56125c);
        }

        public SortedMap<K, V2> tailMap(@f5 K k4) {
            return new k0((Map) c().tailMap(k4), (t) this.f56125c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class l<K, V> extends e7<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f56128b;

        l(Iterator it) {
            this.f56128b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return p4.H0((Map.Entry) this.f56128b.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56128b.hasNext();
        }
    }

    /* compiled from: Maps.java */
    private static class l0<K, V> extends b2<K, V> implements com.google.common.collect.w<K, V>, Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56129f = 0;

        /* renamed from: b, reason: collision with root package name */
        final Map<K, V> f56130b;

        /* renamed from: c, reason: collision with root package name */
        final com.google.common.collect.w<? extends K, ? extends V> f56131c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        @ma.h
        com.google.common.collect.w<V, K> f56132d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        transient Set<V> f56133e;

        l0(com.google.common.collect.w<? extends K, ? extends V> wVar, @zc.a com.google.common.collect.w<V, K> wVar2) {
            this.f56130b = Collections.unmodifiableMap(wVar);
            this.f56131c = wVar;
            this.f56132d = wVar2;
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> M2() {
            com.google.common.collect.w<V, K> wVar = this.f56132d;
            if (wVar != null) {
                return wVar;
            }
            l0 l0Var = new l0(this.f56131c.M2(), this);
            this.f56132d = l0Var;
            return l0Var;
        }

        @Override // com.google.common.collect.w
        @zc.a
        public V a2(@f5 K k4, @f5 V v4) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.b2, com.google.common.collect.h2
        /* renamed from: v3, reason: merged with bridge method [inline-methods] */
        public Map<K, V> u3() {
            return this.f56130b;
        }

        @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
        public Set<V> values() {
            Set<V> set = this.f56133e;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.f56131c.values());
            this.f56133e = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: Maps.java */
    class m<K, V1, V2> implements t<K, V1, V2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f56134a;

        m(com.google.common.base.x xVar) {
            this.f56134a = xVar;
        }

        @Override // com.google.common.collect.p4.t
        @f5
        public V2 a(@f5 K k4, @f5 V1 v12) {
            return (V2) this.f56134a.apply(v12);
        }
    }

    /* compiled from: Maps.java */
    static class m0<K, V> extends q1<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private final Collection<Map.Entry<K, V>> f56135b;

        m0(Collection<Map.Entry<K, V>> collection) {
            this.f56135b = collection;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new l(this.f56135b.iterator());
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Q3();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q1, com.google.common.collect.h2
        /* renamed from: v3 */
        public Collection<Map.Entry<K, V>> u3() {
            return this.f56135b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) R3(tArr);
        }
    }

    /* compiled from: Maps.java */
    private static abstract class n<K, V> extends r0<K, V> {

        /* renamed from: e, reason: collision with root package name */
        final Map<K, V> f56136e;

        /* renamed from: f, reason: collision with root package name */
        final com.google.common.base.m0<? super Map.Entry<K, V>> f56137f;

        n(Map<K, V> map, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            this.f56136e = map;
            this.f56137f = m0Var;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56136e.containsKey(obj) && e(obj, this.f56136e.get(obj));
        }

        @Override // com.google.common.collect.p4.r0
        Collection<V> d() {
            return new z(this, this.f56136e, this.f56137f);
        }

        boolean e(@zc.a Object obj, @f5 V v4) {
            return this.f56137f.apply(new c3(obj, v4));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            V v4 = this.f56136e.get(obj);
            if (v4 == null || !e(obj, v4)) {
                return null;
            }
            return v4;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(@f5 K k4, @f5 V v4) {
            com.google.common.base.l0.d(e(k4, v4));
            return this.f56136e.put(k4, v4);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.l0.d(e(entry.getKey(), entry.getValue()));
            }
            this.f56136e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            if (containsKey(obj)) {
                return this.f56136e.remove(obj);
            }
            return null;
        }
    }

    /* compiled from: Maps.java */
    static class n0<K, V> extends m0<K, V> implements Set<Map.Entry<K, V>> {
        n0(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return d6.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d6.k(this);
        }
    }

    /* compiled from: Maps.java */
    private static class o<K, V> extends r0<K, V> {

        /* renamed from: e, reason: collision with root package name */
        private final Set<K> f56138e;

        /* renamed from: f, reason: collision with root package name */
        final com.google.common.base.x<? super K, V> f56139f;

        /* compiled from: Maps.java */
        class a extends s<K, V> {
            a() {
            }

            @Override // com.google.common.collect.p4.s
            Map<K, V> i() {
                return o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return p4.m(o.this.e(), o.this.f56139f);
            }
        }

        o(Set<K> set, com.google.common.base.x<? super K, V> xVar) {
            set.getClass();
            this.f56138e = set;
            xVar.getClass();
            this.f56139f = xVar;
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<K, V>> b() {
            return new a();
        }

        @Override // com.google.common.collect.p4.r0
        /* renamed from: c */
        public Set<K> i() {
            return new h(e());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return e().contains(obj);
        }

        @Override // com.google.common.collect.p4.r0
        Collection<V> d() {
            return new c0.f(this.f56138e, this.f56139f);
        }

        Set<K> e() {
            return this.f56138e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            if (com.google.common.collect.c0.j(e(), obj)) {
                return this.f56139f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            if (e().remove(obj)) {
                return this.f56139f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return e().size();
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    static class o0<K, V> extends l2<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableMap<K, ? extends V> f56141b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        private transient o0<K, V> f56142c;

        o0(NavigableMap<K, ? extends V> navigableMap) {
            this.f56141b = navigableMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l2, com.google.common.collect.b2
        /* renamed from: R3, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> u3() {
            return Collections.unmodifiableSortedMap(this.f56141b);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> ceilingEntry(@f5 K k4) {
            return p4.M0(this.f56141b.ceilingEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K ceilingKey(@f5 K k4) {
            return this.f56141b.ceilingKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return d6.O(this.f56141b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            o0<K, V> o0Var = this.f56142c;
            if (o0Var != null) {
                return o0Var;
            }
            o0<K, V> o0Var2 = new o0<>(this.f56141b.descendingMap(), this);
            this.f56142c = o0Var2;
            return o0Var2;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> firstEntry() {
            return p4.M0(this.f56141b.firstEntry());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> floorEntry(@f5 K k4) {
            return p4.M0(this.f56141b.floorEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K floorKey(@f5 K k4) {
            return this.f56141b.floorKey(k4);
        }

        @Override // com.google.common.collect.l2, java.util.SortedMap
        public SortedMap<K, V> headMap(@f5 K k4) {
            return headMap(k4, false);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> higherEntry(@f5 K k4) {
            return p4.M0(this.f56141b.higherEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K higherKey(@f5 K k4) {
            return this.f56141b.higherKey(k4);
        }

        @Override // com.google.common.collect.b2, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lastEntry() {
            return p4.M0(this.f56141b.lastEntry());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lowerEntry(@f5 K k4) {
            return p4.M0(this.f56141b.lowerEntry(k4));
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K lowerKey(@f5 K k4) {
            return this.f56141b.lowerKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return d6.O(this.f56141b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @zc.a
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l2, java.util.SortedMap
        public SortedMap<K, V> subMap(@f5 K k4, @f5 K k5) {
            return subMap(k4, true, k5, false);
        }

        @Override // com.google.common.collect.l2, java.util.SortedMap
        public SortedMap<K, V> tailMap(@f5 K k4) {
            return tailMap(k4, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@f5 K k4, boolean z4) {
            return p4.L0(this.f56141b.headMap(k4, z4));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return p4.L0(this.f56141b.subMap(k4, z4, k5, z5));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@f5 K k4, boolean z4) {
            return p4.L0(this.f56141b.tailMap(k4, z4));
        }

        o0(NavigableMap<K, ? extends V> navigableMap, o0<K, V> o0Var) {
            this.f56141b = navigableMap;
            this.f56142c = o0Var;
        }
    }

    /* compiled from: Maps.java */
    private static final class p<A, B> extends com.google.common.base.m<A, B> implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56143e = 0;

        /* renamed from: d, reason: collision with root package name */
        private final com.google.common.collect.w<A, B> f56144d;

        p(com.google.common.collect.w<A, B> wVar) {
            wVar.getClass();
            this.f56144d = wVar;
        }

        private static <X, Y> Y o(com.google.common.collect.w<X, Y> wVar, X x4) {
            Y y4 = wVar.get(x4);
            com.google.common.base.l0.u(y4 != null, ProtectedSandApp.s("\uf519"), x4);
            return y4;
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof p) {
                return this.f56144d.equals(((p) obj).f56144d);
            }
            return false;
        }

        @Override // com.google.common.base.m
        protected A h(B b5) {
            return (A) o(this.f56144d.M2(), b5);
        }

        public int hashCode() {
            return this.f56144d.hashCode();
        }

        @Override // com.google.common.base.m
        protected B i(A a5) {
            return (B) o(this.f56144d, a5);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f56144d);
            return com.google.common.base.h.a(valueOf.length() + 18, ProtectedSandApp.s("\uf51a"), valueOf, ProtectedSandApp.s("\uf51b"));
        }
    }

    /* compiled from: Maps.java */
    static class p0<V> implements m4.a<V> {

        /* renamed from: a, reason: collision with root package name */
        @f5
        private final V f56145a;

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final V f56146b;

        private p0(@f5 V v4, @f5 V v5) {
            this.f56145a = v4;
            this.f56146b = v5;
        }

        static <V> m4.a<V> c(@f5 V v4, @f5 V v5) {
            return new p0(v4, v5);
        }

        @Override // com.google.common.collect.m4.a
        @f5
        public V a() {
            return this.f56145a;
        }

        @Override // com.google.common.collect.m4.a
        @f5
        public V b() {
            return this.f56146b;
        }

        @Override // com.google.common.collect.m4.a
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof m4.a)) {
                return false;
            }
            m4.a aVar = (m4.a) obj;
            return com.google.common.base.f0.a(this.f56145a, aVar.a()) && com.google.common.base.f0.a(this.f56146b, aVar.b());
        }

        @Override // com.google.common.collect.m4.a
        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f56145a, this.f56146b});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f56145a);
            String valueOf2 = String.valueOf(this.f56146b);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 4, ProtectedSandApp.s("\uf516"), valueOf, ProtectedSandApp.s("\uf517"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf518"));
            return a5.toString();
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    static abstract class q<K, V> extends b2<K, V> implements NavigableMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private transient Comparator<? super K> f56147b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        private transient Set<Map.Entry<K, V>> f56148c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private transient NavigableSet<K> f56149d;

        /* compiled from: Maps.java */
        class a extends s<K, V> {
            a() {
            }

            @Override // com.google.common.collect.p4.s
            Map<K, V> i() {
                return q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return q.this.S3();
            }
        }

        q() {
        }

        private static <T> e5<T> U3(Comparator<T> comparator) {
            return e5.u(comparator).v0();
        }

        Set<Map.Entry<K, V>> R3() {
            return new a();
        }

        abstract Iterator<Map.Entry<K, V>> S3();

        abstract NavigableMap<K, V> T3();

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> ceilingEntry(@f5 K k4) {
            return T3().floorEntry(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K ceilingKey(@f5 K k4) {
            return T3().floorKey(k4);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f56147b;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = T3().comparator();
            if (comparator2 == null) {
                comparator2 = x4.f56632f;
            }
            e5 U3 = U3(comparator2);
            this.f56147b = U3;
            return U3;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return T3().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return T3();
        }

        @Override // com.google.common.collect.b2, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f56148c;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> R3 = R3();
            this.f56148c = R3;
            return R3;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> firstEntry() {
            return T3().lastEntry();
        }

        @Override // java.util.SortedMap
        @f5
        public K firstKey() {
            return T3().lastKey();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> floorEntry(@f5 K k4) {
            return T3().ceilingEntry(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K floorKey(@f5 K k4) {
            return T3().ceilingKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@f5 K k4, boolean z4) {
            return T3().tailMap(k4, z4).descendingMap();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> higherEntry(@f5 K k4) {
            return T3().lowerEntry(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K higherKey(@f5 K k4) {
            return T3().lowerKey(k4);
        }

        @Override // com.google.common.collect.b2, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lastEntry() {
            return T3().firstEntry();
        }

        @Override // java.util.SortedMap
        @f5
        public K lastKey() {
            return T3().firstKey();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lowerEntry(@f5 K k4) {
            return T3().higherEntry(k4);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K lowerKey(@f5 K k4) {
            return T3().higherKey(k4);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f56149d;
            if (navigableSet != null) {
                return navigableSet;
            }
            e0 e0Var = new e0((Map) this);
            this.f56149d = e0Var;
            return e0Var;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollFirstEntry() {
            return T3().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollLastEntry() {
            return T3().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return T3().subMap(k5, z5, k4, z4).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@f5 K k4, boolean z4) {
            return T3().headMap(k4, z4).descendingMap();
        }

        @Override // com.google.common.collect.h2
        public String toString() {
            return Q3();
        }

        @Override // com.google.common.collect.b2, com.google.common.collect.h2
        protected Object u3() {
            return T3();
        }

        @Override // com.google.common.collect.b2
        /* renamed from: v3 */
        protected final Map<K, V> u3() {
            return T3();
        }

        @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
        public Collection<V> values() {
            return new q0(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@f5 K k4) {
            return headMap(k4, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@f5 K k4, @f5 K k5) {
            return subMap(k4, true, k5, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@f5 K k4) {
            return tailMap(k4, true);
        }
    }

    /* compiled from: Maps.java */
    static class q0<K, V> extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final Map<K, V> f56151b;

        q0(Map<K, V> map) {
            map.getClass();
            this.f56151b = map;
        }

        final Map<K, V> b() {
            return this.f56151b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f56151b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return this.f56151b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f56151b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f(this.f56151b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@zc.a Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f56151b.entrySet()) {
                    if (com.google.common.base.f0.a(obj, entry.getValue())) {
                        this.f56151b.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f56151b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f56151b.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f56151b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f56151b.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f56151b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    static abstract class r implements com.google.common.base.x<Map.Entry<?, ?>, Object> {
        public static final r KEY = new a(ProtectedSandApp.s("\uf51c"), 0);
        public static final r VALUE = new b(ProtectedSandApp.s("\uf51d"), 1);
        private static final /* synthetic */ r[] $VALUES = $values();

        /* compiled from: Maps.java */
        enum a extends r {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.base.x
            @zc.a
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        enum b extends r {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.base.x
            @zc.a
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ r[] $values() {
            return new r[]{KEY, VALUE};
        }

        private r(String str, int i4) {
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        /* synthetic */ r(String str, int i4, e eVar) {
            this(str, i4);
        }
    }

    /* compiled from: Maps.java */
    @d9.b
    static abstract class r0<K, V> extends AbstractMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private transient Set<Map.Entry<K, V>> f56152b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        private transient Set<K> f56153c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private transient Collection<V> f56154d;

        r0() {
        }

        abstract Set<Map.Entry<K, V>> b();

        /* renamed from: c */
        Set<K> i() {
            return new b0(this);
        }

        Collection<V> d() {
            return new q0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f56152b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> b5 = b();
            this.f56152b = b5;
            return b5;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f56153c;
            if (set != null) {
                return set;
            }
            Set<K> i4 = i();
            this.f56153c = i4;
            return i4;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f56154d;
            if (collection != null) {
                return collection;
            }
            Collection<V> d5 = d();
            this.f56154d = d5;
            return d5;
        }
    }

    /* compiled from: Maps.java */
    static abstract class s<K, V> extends d6.k<Map.Entry<K, V>> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object p02 = p4.p0(i(), key);
            if (com.google.common.base.f0.a(p02, entry.getValue())) {
                return p02 != null || i().containsKey(key);
            }
            return false;
        }

        abstract Map<K, V> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return i().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return d6.I(this, collection);
            } catch (UnsupportedOperationException unused) {
                return d6.J(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet y4 = d6.y(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        y4.add(((Map.Entry) obj).getKey());
                    }
                }
                return i().keySet().retainAll(y4);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    /* compiled from: Maps.java */
    public interface t<K, V1, V2> {
        V2 a(@f5 K k4, @f5 V1 v12);
    }

    /* compiled from: Maps.java */
    static final class u<K, V> extends v<K, V> implements com.google.common.collect.w<K, V> {

        /* renamed from: h, reason: collision with root package name */
        @ma.h
        private final com.google.common.collect.w<V, K> f56155h;

        /* compiled from: Maps.java */
        class a implements com.google.common.base.m0<Map.Entry<V, K>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.common.base.m0 f56156b;

            a(com.google.common.base.m0 m0Var) {
                this.f56156b = m0Var;
            }

            @Override // com.google.common.base.m0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> entry) {
                return this.f56156b.apply(new c3(entry.getValue(), entry.getKey()));
            }
        }

        u(com.google.common.collect.w<K, V> wVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            super(wVar, m0Var);
            this.f56155h = new u(wVar.M2(), new a(m0Var), this);
        }

        private static <K, V> com.google.common.base.m0<Map.Entry<V, K>> i(com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            return new a(m0Var);
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> M2() {
            return this.f56155h;
        }

        @Override // com.google.common.collect.w
        @zc.a
        public V a2(@f5 K k4, @f5 V v4) {
            com.google.common.base.l0.d(e(k4, v4));
            return (V) ((com.google.common.collect.w) this.f56136e).a2(k4, v4);
        }

        com.google.common.collect.w<K, V> j() {
            return (com.google.common.collect.w) this.f56136e;
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Collection values() {
            return this.f56155h.keySet();
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f56155h.keySet();
        }

        private u(com.google.common.collect.w<K, V> wVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var, com.google.common.collect.w<V, K> wVar2) {
            super(wVar, m0Var);
            this.f56155h = wVar2;
        }
    }

    /* compiled from: Maps.java */
    static class v<K, V> extends n<K, V> {

        /* renamed from: g, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f56157g;

        /* compiled from: Maps.java */
        private class a extends j2<Map.Entry<K, V>> {

            /* compiled from: Maps.java */
            /* renamed from: com.google.common.collect.p4$v$a$a, reason: collision with other inner class name */
            class C0853a extends v6<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* compiled from: Maps.java */
                /* renamed from: com.google.common.collect.p4$v$a$a$a, reason: collision with other inner class name */
                class C0854a extends c2<K, V> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Map.Entry f56160b;

                    C0854a(Map.Entry entry) {
                        this.f56160b = entry;
                    }

                    @Override // com.google.common.collect.c2, java.util.Map.Entry
                    @f5
                    public V setValue(@f5 V v4) {
                        com.google.common.base.l0.d(v.this.e(getKey(), v4));
                        return (V) super.setValue(v4);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.c2, com.google.common.collect.h2
                    /* renamed from: v3 */
                    public Map.Entry<K, V> u3() {
                        return this.f56160b;
                    }
                }

                C0853a(Iterator it) {
                    super(it);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.v6
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> a(Map.Entry<K, V> entry) {
                    return new C0854a(entry);
                }
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.j2, com.google.common.collect.q1
            /* renamed from: T3 */
            public Set<Map.Entry<K, V>> u3() {
                return v.this.f56157g;
            }

            @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0853a(v.this.f56157g.iterator());
            }

            /* synthetic */ a(v vVar, e eVar) {
                this();
            }
        }

        /* compiled from: Maps.java */
        class b extends b0<K, V> {
            b() {
                super(v.this);
            }

            @Override // com.google.common.collect.p4.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!v.this.containsKey(obj)) {
                    return false;
                }
                v.this.f56136e.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.f(vVar.f56136e, vVar.f56137f, collection);
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.h(vVar.f56136e, vVar.f56137f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return l4.s(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) l4.s(iterator()).toArray(tArr);
            }
        }

        v(Map<K, V> map, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            super(map, m0Var);
            this.f56157g = d6.i(map.entrySet(), this.f56137f);
        }

        static <K, V> boolean f(Map<K, V> map, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (m0Var.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        static <K, V> boolean h(Map<K, V> map, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (m0Var.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<K, V>> b() {
            return new a(this, null);
        }

        @Override // com.google.common.collect.p4.r0
        /* renamed from: c */
        Set<K> i() {
            return new b();
        }
    }

    /* compiled from: Maps.java */
    @d9.c
    private static class w<K, V> extends com.google.common.collect.j<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableMap<K, V> f56163b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.common.base.m0<? super Map.Entry<K, V>> f56164c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<K, V> f56165d;

        /* compiled from: Maps.java */
        class a extends e0<K, V> {
            a(NavigableMap navigableMap) {
                super((Map) navigableMap);
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.f(w.this.f56163b, w.this.f56164c, collection);
            }

            @Override // com.google.common.collect.d6.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.h(w.this.f56163b, w.this.f56164c, collection);
            }
        }

        w(NavigableMap<K, V> navigableMap, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            navigableMap.getClass();
            this.f56163b = navigableMap;
            this.f56164c = m0Var;
            this.f56165d = new v(navigableMap, m0Var);
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<K, V>> b() {
            return d4.x(this.f56163b.entrySet().iterator(), this.f56164c);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<K, V>> c() {
            return d4.x(this.f56163b.descendingMap().entrySet().iterator(), this.f56164c);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f56165d.clear();
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return this.f56163b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56165d.containsKey(obj);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return p4.z(this.f56163b.descendingMap(), this.f56164c);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f56165d.entrySet();
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @zc.a
        public V get(@zc.a Object obj) {
            return this.f56165d.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@f5 K k4, boolean z4) {
            return p4.z(this.f56163b.headMap(k4, z4), this.f56164c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !c4.c(this.f56163b.entrySet(), this.f56164c);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) c4.I(this.f56163b.entrySet(), this.f56164c);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) c4.I(this.f56163b.descendingMap().entrySet(), this.f56164c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(@f5 K k4, @f5 V v4) {
            return this.f56165d.put(k4, v4);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f56165d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            return this.f56165d.remove(obj);
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56165d.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
            return p4.z(this.f56163b.subMap(k4, z4, k5, z5), this.f56164c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@f5 K k4, boolean z4) {
            return p4.z(this.f56163b.tailMap(k4, z4), this.f56164c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new z(this, this.f56163b, this.f56164c);
        }
    }

    /* compiled from: Maps.java */
    private static class x<K, V> extends v<K, V> implements SortedMap<K, V> {

        /* compiled from: Maps.java */
        class a extends v<K, V>.b implements SortedSet<K> {
            a() {
                super();
            }

            @Override // java.util.SortedSet
            @zc.a
            public Comparator<? super K> comparator() {
                return x.this.k().comparator();
            }

            @Override // java.util.SortedSet
            @f5
            public K first() {
                return (K) x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@f5 K k4) {
                return (SortedSet) x.this.headMap(k4).keySet();
            }

            @Override // java.util.SortedSet
            @f5
            public K last() {
                return (K) x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@f5 K k4, @f5 K k5) {
                return (SortedSet) x.this.subMap(k4, k5).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@f5 K k4) {
                return (SortedSet) x.this.tailMap(k4).keySet();
            }
        }

        x(SortedMap<K, V> sortedMap, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            super(sortedMap, m0Var);
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        @f5
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@f5 K k4) {
            return new x((Map) k().headMap(k4), (com.google.common.base.m0) this.f56137f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.v, com.google.common.collect.p4.r0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> i() {
            return new a();
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }

        SortedMap<K, V> k() {
            return (SortedMap) this.f56136e;
        }

        @Override // java.util.SortedMap
        @f5
        public K lastKey() {
            SortedMap<K, V> k4 = k();
            while (true) {
                K lastKey = k4.lastKey();
                if (e(lastKey, this.f56136e.get(lastKey))) {
                    return lastKey;
                }
                k4 = k().headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@f5 K k4, @f5 K k5) {
            return new x((Map) k().subMap(k4, k5), (com.google.common.base.m0) this.f56137f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@f5 K k4) {
            return new x((Map) k().tailMap(k4), (com.google.common.base.m0) this.f56137f);
        }
    }

    /* compiled from: Maps.java */
    private static class y<K, V> extends n<K, V> {

        /* renamed from: g, reason: collision with root package name */
        final com.google.common.base.m0<? super K> f56168g;

        y(Map<K, V> map, com.google.common.base.m0<? super K> m0Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var2) {
            super(map, m0Var2);
            this.f56168g = m0Var;
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<K, V>> b() {
            return d6.i(this.f56136e.entrySet(), this.f56137f);
        }

        @Override // com.google.common.collect.p4.r0
        /* renamed from: c */
        Set<K> i() {
            return d6.i(this.f56136e.keySet(), this.f56168g);
        }

        @Override // com.google.common.collect.p4.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56136e.containsKey(obj) && this.f56168g.apply(obj);
        }
    }

    /* compiled from: Maps.java */
    private static final class z<K, V> extends q0<K, V> {

        /* renamed from: c, reason: collision with root package name */
        final Map<K, V> f56169c;

        /* renamed from: d, reason: collision with root package name */
        final com.google.common.base.m0<? super Map.Entry<K, V>> f56170d;

        z(Map<K, V> map, Map<K, V> map2, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
            super(map);
            this.f56169c = map2;
            this.f56170d = m0Var;
        }

        @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@zc.a Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f56169c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f56170d.apply(next) && com.google.common.base.f0.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f56169c.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f56170d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // com.google.common.collect.p4.q0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f56169c.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f56170d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z4 = true;
                }
            }
            return z4;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return l4.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l4.s(iterator()).toArray(tArr);
        }
    }

    private p4() {
    }

    public static <K, V> SortedMap<K, V> A(SortedMap<K, V> sortedMap, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        m0Var.getClass();
        if (sortedMap instanceof x) {
            return E((x) sortedMap, m0Var);
        }
        sortedMap.getClass();
        return new x((Map) sortedMap, (com.google.common.base.m0) m0Var);
    }

    static <V2, K, V1> Map.Entry<K, V2> A0(t<? super K, ? super V1, V2> tVar, Map.Entry<K, V1> entry) {
        tVar.getClass();
        entry.getClass();
        return new c(entry, tVar);
    }

    private static <K, V> com.google.common.collect.w<K, V> B(u<K, V> uVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new u((com.google.common.collect.w) uVar.f56136e, com.google.common.base.n0.d(uVar.f56137f, m0Var));
    }

    public static <K, V1, V2> Map<K, V2> B0(Map<K, V1> map, com.google.common.base.x<? super V1, V2> xVar) {
        return new i0(map, i(xVar));
    }

    private static <K, V> Map<K, V> C(n<K, V> nVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new v(nVar.f56136e, com.google.common.base.n0.d(nVar.f56137f, m0Var));
    }

    @d9.c
    public static <K, V1, V2> NavigableMap<K, V2> C0(NavigableMap<K, V1> navigableMap, com.google.common.base.x<? super V1, V2> xVar) {
        return new j0((Map) navigableMap, i(xVar));
    }

    @d9.c
    private static <K, V> NavigableMap<K, V> D(w<K, V> wVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new w(((w) wVar).f56163b, com.google.common.base.n0.d(((w) wVar).f56164c, m0Var));
    }

    public static <K, V1, V2> SortedMap<K, V2> D0(SortedMap<K, V1> sortedMap, com.google.common.base.x<? super V1, V2> xVar) {
        return new k0((Map) sortedMap, i(xVar));
    }

    private static <K, V> SortedMap<K, V> E(x<K, V> xVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new x((Map) xVar.k(), com.google.common.base.n0.d(xVar.f56137f, m0Var));
    }

    @f9.a
    public static <K, V> h3<K, V> E0(Iterable<V> iterable, com.google.common.base.x<? super V, K> xVar) {
        return F0(iterable.iterator(), xVar);
    }

    public static <K, V> com.google.common.collect.w<K, V> F(com.google.common.collect.w<K, V> wVar, com.google.common.base.m0<? super K> m0Var) {
        m0Var.getClass();
        return x(wVar, com.google.common.base.n0.h(m0Var, r.KEY));
    }

    @f9.a
    public static <K, V> h3<K, V> F0(Iterator<V> it, com.google.common.base.x<? super V, K> xVar) {
        xVar.getClass();
        h3.b c5 = h3.c();
        while (it.hasNext()) {
            V next = it.next();
            c5.i(xVar.apply(next), next);
        }
        try {
            return c5.d();
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(String.valueOf(e4.getMessage()).concat(ProtectedSandApp.s("\uf51e")));
        }
    }

    public static <K, V> Map<K, V> G(Map<K, V> map, com.google.common.base.m0<? super K> m0Var) {
        m0Var.getClass();
        com.google.common.base.m0 h4 = com.google.common.base.n0.h(m0Var, r.KEY);
        if (map instanceof n) {
            return C((n) map, h4);
        }
        map.getClass();
        return new y(map, m0Var, h4);
    }

    public static <K, V> com.google.common.collect.w<K, V> G0(com.google.common.collect.w<? extends K, ? extends V> wVar) {
        return new l0(wVar, null);
    }

    @d9.c
    public static <K, V> NavigableMap<K, V> H(NavigableMap<K, V> navigableMap, com.google.common.base.m0<? super K> m0Var) {
        return z(navigableMap, com.google.common.base.n0.h(m0Var, r.KEY));
    }

    static <K, V> Map.Entry<K, V> H0(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        return new k(entry);
    }

    public static <K, V> SortedMap<K, V> I(SortedMap<K, V> sortedMap, com.google.common.base.m0<? super K> m0Var) {
        return A(sortedMap, com.google.common.base.n0.h(m0Var, r.KEY));
    }

    static <K, V> e7<Map.Entry<K, V>> I0(Iterator<Map.Entry<K, V>> it) {
        return new l(it);
    }

    public static <K, V> com.google.common.collect.w<K, V> J(com.google.common.collect.w<K, V> wVar, com.google.common.base.m0<? super V> m0Var) {
        return x(wVar, com.google.common.base.n0.h(m0Var, r.VALUE));
    }

    static <K, V> Set<Map.Entry<K, V>> J0(Set<Map.Entry<K, V>> set) {
        return new n0((Collection) Collections.unmodifiableSet(set));
    }

    public static <K, V> Map<K, V> K(Map<K, V> map, com.google.common.base.m0<? super V> m0Var) {
        return y(map, com.google.common.base.n0.h(m0Var, r.VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> K0(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    @d9.c
    public static <K, V> NavigableMap<K, V> L(NavigableMap<K, V> navigableMap, com.google.common.base.m0<? super V> m0Var) {
        return z(navigableMap, com.google.common.base.n0.h(m0Var, r.VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    public static <K, V> NavigableMap<K, V> L0(NavigableMap<K, ? extends V> navigableMap) {
        navigableMap.getClass();
        return navigableMap instanceof o0 ? navigableMap : new o0(navigableMap);
    }

    public static <K, V> SortedMap<K, V> M(SortedMap<K, V> sortedMap, com.google.common.base.m0<? super V> m0Var) {
        return A(sortedMap, com.google.common.base.n0.h(m0Var, r.VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public static <K, V> Map.Entry<K, V> M0(@zc.a Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return H0(entry);
    }

    @d9.c
    public static h3<String, String> N(Properties properties) {
        h3.b c5 = h3.c();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object nextElement = propertyNames.nextElement();
            Objects.requireNonNull(nextElement);
            String str = (String) nextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            c5.i(str, property);
        }
        return c5.d();
    }

    static <V> com.google.common.base.x<Map.Entry<?, V>, V> N0() {
        return r.VALUE;
    }

    @d9.b(serializable = true)
    public static <K, V> Map.Entry<K, V> O(@f5 K k4, @f5 V v4) {
        return new c3(k4, v4);
    }

    static <K, V> Iterator<V> O0(Iterator<Map.Entry<K, V>> it) {
        return new f(it);
    }

    @d9.b(serializable = true)
    public static <K extends Enum<K>, V> h3<K, V> P(Map<K, ? extends V> map) {
        if (map instanceof d3) {
            return (d3) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return h3.t();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        com.google.common.collect.b0.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((EnumMap) key, (K) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            com.google.common.collect.b0.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return d3.J(enumMap);
    }

    @zc.a
    static <V> V P0(@zc.a Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static <E> h3<E, Integer> Q(Collection<E> collection) {
        h3.b bVar = new h3.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bVar.i(it.next(), Integer.valueOf(i4));
            i4++;
        }
        return bVar.d();
    }

    static <V> com.google.common.base.m0<Map.Entry<?, V>> Q0(com.google.common.base.m0<? super V> m0Var) {
        return com.google.common.base.n0.h(m0Var, r.VALUE);
    }

    static <K> com.google.common.base.x<Map.Entry<K, ?>, K> R() {
        return r.KEY;
    }

    static <K, V> Iterator<K> S(Iterator<Map.Entry<K, V>> it) {
        return new e(it);
    }

    @zc.a
    static <K> K T(@zc.a Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static <K> com.google.common.base.m0<Map.Entry<K, ?>> U(com.google.common.base.m0<? super K> m0Var) {
        return com.google.common.base.n0.h(m0Var, r.KEY);
    }

    public static <K, V> ConcurrentMap<K, V> V() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> W(Class<K> cls) {
        cls.getClass();
        return new EnumMap<>(cls);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> X(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> Y() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> Z(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a0(int i4) {
        return new HashMap<>(o(i4));
    }

    static Set b(Set set) {
        return new h(set);
    }

    public static <K, V> IdentityHashMap<K, V> b0() {
        return new IdentityHashMap<>();
    }

    static SortedSet c(SortedSet sortedSet) {
        return new i(sortedSet);
    }

    public static <K, V> LinkedHashMap<K, V> c0() {
        return new LinkedHashMap<>();
    }

    static NavigableSet d(NavigableSet navigableSet) {
        return new j(navigableSet);
    }

    public static <K, V> LinkedHashMap<K, V> d0(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> e0(int i4) {
        return new LinkedHashMap<>(o(i4));
    }

    public static <A, B> com.google.common.base.m<A, B> f(com.google.common.collect.w<A, B> wVar) {
        return new p(wVar);
    }

    public static <K extends Comparable, V> TreeMap<K, V> f0() {
        return new TreeMap<>();
    }

    static <K, V1, V2> com.google.common.base.x<Map.Entry<K, V1>, Map.Entry<K, V2>> g(t<? super K, ? super V1, V2> tVar) {
        tVar.getClass();
        return new d(tVar);
    }

    public static <C, K extends C, V> TreeMap<K, V> g0(@zc.a Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    static <K, V1, V2> com.google.common.base.x<Map.Entry<K, V1>, V2> h(t<? super K, ? super V1, V2> tVar) {
        tVar.getClass();
        return new b(tVar);
    }

    public static <K, V> TreeMap<K, V> h0(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    static <K, V1, V2> t<K, V1, V2> i(com.google.common.base.x<? super V1, V2> xVar) {
        xVar.getClass();
        return new m(xVar);
    }

    static <E> Comparator<? super E> i0(@zc.a Comparator<? super E> comparator) {
        return comparator != null ? comparator : x4.f56632f;
    }

    public static <K, V> Map<K, V> j(Set<K> set, com.google.common.base.x<? super K, V> xVar) {
        return new o(set, xVar);
    }

    static <K, V> void j0(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @d9.c
    public static <K, V> NavigableMap<K, V> k(NavigableSet<K> navigableSet, com.google.common.base.x<? super K, V> xVar) {
        return new d0(navigableSet, xVar);
    }

    static <K, V> boolean k0(Collection<Map.Entry<K, V>> collection, @zc.a Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(H0((Map.Entry) obj));
        }
        return false;
    }

    public static <K, V> SortedMap<K, V> l(SortedSet<K> sortedSet, com.google.common.base.x<? super K, V> xVar) {
        return new f0((Set) sortedSet, (com.google.common.base.x) xVar);
    }

    @d9.c
    private static <E> NavigableSet<E> l0(NavigableSet<E> navigableSet) {
        return new j(navigableSet);
    }

    static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, com.google.common.base.x<? super K, V> xVar) {
        return new g(set.iterator(), xVar);
    }

    private static <E> Set<E> m0(Set<E> set) {
        return new h(set);
    }

    static <K, V1, V2> com.google.common.base.x<V1, V2> n(t<? super K, V1, V2> tVar, @f5 K k4) {
        tVar.getClass();
        return new a(tVar, k4);
    }

    private static <E> SortedSet<E> n0(SortedSet<E> sortedSet) {
        return new i(sortedSet);
    }

    static int o(int i4) {
        if (i4 < 3) {
            com.google.common.collect.b0.b(i4, ProtectedSandApp.s("\uf51f"));
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static boolean o0(Map<?, ?> map, @zc.a Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <K, V> boolean p(Collection<Map.Entry<K, V>> collection, @zc.a Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(H0((Map.Entry) obj));
        }
        return false;
    }

    @zc.a
    static <V> V p0(Map<?, V> map, @zc.a Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean q(Map<?, ?> map, @zc.a Object obj) {
        return d4.q(new e(map.entrySet().iterator()), obj);
    }

    @zc.a
    static <V> V q0(Map<?, V> map, @zc.a Object obj) {
        map.getClass();
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean r(Map<?, ?> map, @zc.a Object obj) {
        return d4.q(new f(map.entrySet().iterator()), obj);
    }

    @d9.a
    @d9.c
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> r0(NavigableMap<K, V> navigableMap, j5<K> j5Var) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != x4.f56632f && j5Var.q() && j5Var.r()) {
            com.google.common.base.l0.e(navigableMap.comparator().compare(j5Var.f55872b.i(), j5Var.f55873c.i()) <= 0, ProtectedSandApp.s("\uf520"));
        }
        if (j5Var.q() && j5Var.r()) {
            K i4 = j5Var.f55872b.i();
            com.google.common.collect.x m4 = j5Var.f55872b.m();
            com.google.common.collect.x xVar = com.google.common.collect.x.CLOSED;
            return navigableMap.subMap(i4, m4 == xVar, j5Var.f55873c.i(), j5Var.f55873c.n() == xVar);
        }
        if (j5Var.q()) {
            return navigableMap.tailMap(j5Var.f55872b.i(), j5Var.f55872b.m() == com.google.common.collect.x.CLOSED);
        }
        if (j5Var.r()) {
            return navigableMap.headMap(j5Var.f55873c.i(), j5Var.f55873c.n() == com.google.common.collect.x.CLOSED);
        }
        return navigableMap;
    }

    public static <K, V> m4<K, V> s(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? u((SortedMap) map, map2) : t(map, map2, com.google.common.base.q.c());
    }

    public static <K, V> com.google.common.collect.w<K, V> s0(com.google.common.collect.w<K, V> wVar) {
        return r6.g(wVar, null);
    }

    public static <K, V> m4<K, V> t(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, com.google.common.base.q<? super V> qVar) {
        qVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        v(map, map2, qVar, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return new c0(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }

    @d9.c
    public static <K, V> NavigableMap<K, V> t0(NavigableMap<K, V> navigableMap) {
        return r6.o(navigableMap);
    }

    public static <K, V> j6<K, V> u(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        sortedMap.getClass();
        map.getClass();
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = x4.f56632f;
        }
        TreeMap treeMap = new TreeMap(comparator);
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map);
        TreeMap treeMap3 = new TreeMap(comparator);
        TreeMap treeMap4 = new TreeMap(comparator);
        v(sortedMap, map, com.google.common.base.q.c(), treeMap, treeMap2, treeMap3, treeMap4);
        return new h0((Map) treeMap, (Map) treeMap2, (Map) treeMap3, (Map) treeMap4);
    }

    public static <K, V> h3<K, V> u0(Iterable<K> iterable, com.google.common.base.x<? super K, V> xVar) {
        return v0(iterable.iterator(), xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void v(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, com.google.common.base.q<? super V> qVar, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, m4.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V remove = map4.remove(key);
                if (qVar.d(value, remove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, p0.c(value, remove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static <K, V> h3<K, V> v0(Iterator<K> it, com.google.common.base.x<? super K, V> xVar) {
        xVar.getClass();
        h3.b c5 = h3.c();
        while (it.hasNext()) {
            K next = it.next();
            c5.i(next, xVar.apply(next));
        }
        return c5.c();
    }

    static boolean w(Map<?, ?> map, @zc.a Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String w0(Map<?, ?> map) {
        StringBuilder f4 = com.google.common.collect.c0.f(map.size());
        f4.append('{');
        boolean z4 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z4) {
                f4.append(ProtectedSandApp.s("\uf521"));
            }
            f4.append(entry.getKey());
            f4.append('=');
            f4.append(entry.getValue());
            z4 = false;
        }
        f4.append('}');
        return f4.toString();
    }

    public static <K, V> com.google.common.collect.w<K, V> x(com.google.common.collect.w<K, V> wVar, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        wVar.getClass();
        m0Var.getClass();
        return wVar instanceof u ? B((u) wVar, m0Var) : new u(wVar, m0Var);
    }

    public static <K, V1, V2> Map<K, V2> x0(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
        return new i0(map, tVar);
    }

    public static <K, V> Map<K, V> y(Map<K, V> map, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        m0Var.getClass();
        if (map instanceof n) {
            return C((n) map, m0Var);
        }
        map.getClass();
        return new v(map, m0Var);
    }

    @d9.c
    public static <K, V1, V2> NavigableMap<K, V2> y0(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
        return new j0((Map) navigableMap, (t) tVar);
    }

    @d9.c
    public static <K, V> NavigableMap<K, V> z(NavigableMap<K, V> navigableMap, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        m0Var.getClass();
        if (navigableMap instanceof w) {
            return D((w) navigableMap, m0Var);
        }
        navigableMap.getClass();
        return new w(navigableMap, m0Var);
    }

    public static <K, V1, V2> SortedMap<K, V2> z0(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
        return new k0((Map) sortedMap, (t) tVar);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Maps.java */
    class j<E> extends g2<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavigableSet f56126b;

        j(NavigableSet navigableSet) {
            this.f56126b = navigableSet;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g2, com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: Y3, reason: merged with bridge method [inline-methods] */
        public NavigableSet<E> u3() {
            return this.f56126b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new j(super.descendingSet());
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(@f5 E e4) {
            return new i(super.headSet(e4));
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
            return new i(super.subSet(e4, e5));
        }

        @Override // com.google.common.collect.n2, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(@f5 E e4) {
            return new i(super.tailSet(e4));
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
            return new j(super.headSet(e4, z4));
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
            return new j(super.subSet(e4, z4, e5, z5));
        }

        @Override // com.google.common.collect.g2, java.util.NavigableSet
        public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
            return new j(super.tailSet(e4, z4));
        }
    }
}
