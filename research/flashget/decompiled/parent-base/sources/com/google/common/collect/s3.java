package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.collect.h3;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: ImmutableSortedMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public final class s3<K, V> extends t3<K, V> implements NavigableMap<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f56378j;

    /* renamed from: k, reason: collision with root package name */
    private static final s3<Comparable, Object> f56379k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f56380l = 0;

    /* renamed from: g, reason: collision with root package name */
    private final transient v5<K> f56381g;

    /* renamed from: h, reason: collision with root package name */
    private final transient f3<V> f56382h;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    private transient s3<K, V> f56383i;

    /* compiled from: ImmutableSortedMap.java */
    class a implements Comparator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f56384b;

        a(Comparator comparator) {
            this.f56384b = comparator;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@zc.a Map.Entry<K, V> entry, @zc.a Map.Entry<K, V> entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f56384b.compare(entry.getKey(), entry2.getKey());
        }
    }

    /* compiled from: ImmutableSortedMap.java */
    class b extends i3<K, V> {

        /* compiled from: ImmutableSortedMap.java */
        class a extends f3<Map.Entry<K, V>> {
            a() {
            }

            @Override // java.util.List
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i4) {
                return new AbstractMap.SimpleImmutableEntry(s3.this.f56381g.b().get(i4), s3.this.f56382h.get(i4));
            }

            @Override // com.google.common.collect.b3
            boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return s3.this.size();
            }
        }

        b() {
        }

        @Override // com.google.common.collect.q3
        f3<Map.Entry<K, V>> G() {
            return new a();
        }

        @Override // com.google.common.collect.i3
        h3<K, V> T() {
            return s3.this;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public e7<Map.Entry<K, V>> iterator() {
            return b().iterator();
        }
    }

    /* compiled from: ImmutableSortedMap.java */
    private static class d<K, V> extends h3.e<K, V> {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56390g = 0;

        /* renamed from: f, reason: collision with root package name */
        private final Comparator<? super K> f56391f;

        d(s3<K, V> s3Var) {
            super(s3Var);
            this.f56391f = s3Var.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h3.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<K, V> b(int i4) {
            return new c<>(this.f56391f);
        }
    }

    static {
        x4 x4Var = x4.f56632f;
        f56378j = x4Var;
        f56379k = new s3<>(w3.r0(x4Var), f3.H(), null);
    }

    s3(v5<K> v5Var, f3<V> f3Var, @zc.a s3<K, V> s3Var) {
        this.f56381g = v5Var;
        this.f56382h = f3Var;
        this.f56383i = s3Var;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 A0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5), h3.m(comparable6, obj6), h3.m(comparable7, obj7), h3.m(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 B0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5), h3.m(comparable6, obj6), h3.m(comparable7, obj7), h3.m(comparable8, obj8), h3.m(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 C0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5), h3.m(comparable6, obj6), h3.m(comparable7, obj7), h3.m(comparable8, obj8), h3.m(comparable9, obj9), h3.m(comparable10, obj10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> s3<K, V> D0(Comparator<? super K> comparator, K k4, V v4) {
        f3 I = f3.I(k4);
        comparator.getClass();
        return new s3<>(new v5(I, comparator), f3.I(v4), null);
    }

    public static <K, V> c<K, V> E0(Comparator<K> comparator) {
        return new c<>(comparator);
    }

    public static <K extends Comparable<?>, V> c<K, V> F0() {
        x4.f56632f.getClass();
        return new c<>(y5.f56654d);
    }

    @d9.a
    public static <K, V> s3<K, V> Z(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return a0(iterable, (e5) f56378j);
    }

    @d9.a
    public static <K, V> s3<K, V> a0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        comparator.getClass();
        return i0(comparator, false, iterable);
    }

    public static <K, V> s3<K, V> b0(Map<? extends K, ? extends V> map) {
        return d0(map, (e5) f56378j);
    }

    public static <K, V> s3<K, V> c0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        comparator.getClass();
        return d0(map, comparator);
    }

    private static <K, V> s3<K, V> d0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z4 = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z4 = comparator.equals(comparator2);
            } else if (comparator == f56378j) {
                z4 = true;
            }
        }
        if (z4 && (map instanceof s3)) {
            s3<K, V> s3Var = (s3) map;
            if (!s3Var.p()) {
                return s3Var;
            }
        }
        return i0(comparator, z4, map.entrySet());
    }

    public static <K, V> s3<K, V> e0(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f56378j;
        }
        if (sortedMap instanceof s3) {
            s3<K, V> s3Var = (s3) sortedMap;
            if (!s3Var.p()) {
                return s3Var;
            }
        }
        return i0(comparator, true, sortedMap.entrySet());
    }

    static <K, V> s3<K, V> h0(Comparator<? super K> comparator) {
        return x4.f56632f.equals(comparator) ? (s3<K, V>) f56379k : new s3<>(w3.r0(comparator), f3.H(), null);
    }

    private static <K, V> s3<K, V> i0(Comparator<? super K> comparator, boolean z4, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) c4.R(iterable, h3.f55789f);
        return j0(comparator, z4, entryArr, entryArr.length);
    }

    private static <K, V> s3<K, V> j0(Comparator<? super K> comparator, boolean z4, Map.Entry<K, V>[] entryArr, int i4) {
        if (i4 == 0) {
            return h0(comparator);
        }
        if (i4 == 1) {
            Map.Entry<K, V> entry = entryArr[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return D0(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[i4];
        Object[] objArr2 = new Object[i4];
        if (z4) {
            for (int i5 = 0; i5 < i4; i5++) {
                Map.Entry<K, V> entry3 = entryArr[i5];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                K key = entry4.getKey();
                V value = entry4.getValue();
                b0.a(key, value);
                objArr[i5] = key;
                objArr2[i5] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i4, new a(comparator));
            Map.Entry<K, V> entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Map.Entry<K, V> entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            V value2 = entry6.getValue();
            objArr2[0] = value2;
            b0.a(objArr[0], value2);
            int i6 = 1;
            while (i6 < i4) {
                Map.Entry<K, V> entry7 = entryArr[i6 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry<K, V> entry8 = entry7;
                Map.Entry<K, V> entry9 = entryArr[i6];
                Objects.requireNonNull(entry9);
                Map.Entry<K, V> entry10 = entry9;
                Object key3 = entry10.getKey();
                V value3 = entry10.getValue();
                b0.a(key3, value3);
                objArr[i6] = key3;
                objArr2[i6] = value3;
                h3.e(comparator.compare(key2, key3) != 0, ProtectedSandApp.s("\uf541"), entry8, entry10);
                i6++;
                key2 = key3;
            }
        }
        return new s3<>(new v5(f3.p(objArr), comparator), f3.q(objArr2, i4), null);
    }

    private static <K extends Comparable<? super K>, V> s3<K, V> k0(Map.Entry<K, V>... entryArr) {
        return j0(x4.f56632f, false, entryArr, entryArr.length);
    }

    private s3<K, V> l0(int i4, int i5) {
        return (i4 == 0 && i5 == this.f56382h.size()) ? this : i4 == i5 ? h0(this.f56381g.f56614g) : new s3<>(this.f56381g.U0(i4, i5), this.f56382h.subList(i4, i5), null);
    }

    public static <K extends Comparable<?>, V> c<K, V> p0() {
        return new c<>(x4.f56632f);
    }

    public static <K, V> s3<K, V> r0() {
        return (s3<K, V>) f56379k;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 s0(Comparable comparable, Object obj) {
        return D0(x4.f56632f, comparable, obj);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 t0(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 v0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 w0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 x0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 y0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5), h3.m(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/s3<TK;TV;>; */
    public static s3 z0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return k0(h3.m(comparable, obj), h3.m(comparable2, obj2), h3.m(comparable3, obj3), h3.m(comparable4, obj4), h3.m(comparable5, obj5), h3.m(comparable6, obj6), h3.m(comparable7, obj7));
    }

    @Override // com.google.common.collect.h3
    /* renamed from: F */
    public b3<V> values() {
        return this.f56382h;
    }

    public s3<K, V> G0(K k4, K k5) {
        return subMap(k4, true, k5, false);
    }

    @Override // com.google.common.collect.h3
    Object H() {
        return new d(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public s3<K, V> subMap(K k4, boolean z4, K k5, boolean z5) {
        k4.getClass();
        k5.getClass();
        com.google.common.base.l0.y(this.f56381g.f56614g.compare(k4, k5) <= 0, ProtectedSandApp.s("\uf542"), k4, k5);
        return headMap(k5, z5).tailMap(k4, z4);
    }

    public s3<K, V> I0(K k4) {
        return tailMap(k4, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public s3<K, V> tailMap(K k4, boolean z4) {
        v5<K> v5Var = this.f56381g;
        k4.getClass();
        return l0(v5Var.W0(k4, z4), this.f56382h.size());
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> ceilingEntry(K k4) {
        return tailMap(k4, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K ceilingKey(K k4) {
        return (K) p4.T(ceilingEntry(k4));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return this.f56381g.f56614g;
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return this.f56381g.descendingSet();
    }

    @Override // com.google.common.collect.h3, java.util.Map
    public Set entrySet() {
        return super.entrySet();
    }

    public w3<K> f0() {
        return this.f56381g.descendingSet();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().b().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return this.f56381g.first();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> floorEntry(K k4) {
        return headMap(k4, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K floorKey(K k4) {
        return (K) p4.T(floorEntry(k4));
    }

    @Override // java.util.NavigableMap
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public s3<K, V> descendingMap() {
        s3<K, V> s3Var = this.f56383i;
        return s3Var == null ? isEmpty() ? h0(e5.u(this.f56381g.f56614g).v0()) : new s3<>((v5) this.f56381g.descendingSet(), this.f56382h.Z(), this) : s3Var;
    }

    @Override // com.google.common.collect.h3, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        int indexOf = this.f56381g.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f56382h.get(indexOf);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> higherEntry(K k4) {
        return tailMap(k4, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K higherKey(K k4) {
        return (K) p4.T(higherEntry(k4));
    }

    @Override // com.google.common.collect.h3
    q3<Map.Entry<K, V>> j() {
        return isEmpty() ? q3.I() : new b();
    }

    @Override // com.google.common.collect.h3
    q3<K> k() {
        throw new AssertionError(ProtectedSandApp.s("\uf543"));
    }

    @Override // com.google.common.collect.h3, java.util.Map
    public Set keySet() {
        return this.f56381g;
    }

    @Override // com.google.common.collect.h3
    b3<V> l() {
        throw new AssertionError(ProtectedSandApp.s("\uf543"));
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().b().get(this.f56382h.size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return this.f56381g.last();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lowerEntry(K k4) {
        return headMap(k4, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K lowerKey(K k4) {
        return (K) p4.T(lowerEntry(k4));
    }

    public s3<K, V> m0(K k4) {
        return headMap(k4, false);
    }

    @Override // com.google.common.collect.h3
    /* renamed from: n */
    public q3<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public s3<K, V> headMap(K k4, boolean z4) {
        v5<K> v5Var = this.f56381g;
        k4.getClass();
        return l0(0, v5Var.V0(k4, z4));
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        return this.f56381g;
    }

    public w3<K> o0() {
        return this.f56381g;
    }

    @Override // com.google.common.collect.h3
    boolean p() {
        return this.f56381g.f56611i.j() || this.f56382h.j();
    }

    @Override // java.util.NavigableMap
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public w3<K> q0() {
        return this.f56381g;
    }

    @Override // com.google.common.collect.h3
    /* renamed from: r */
    public q3 keySet() {
        return this.f56381g;
    }

    @Override // java.util.Map
    public int size() {
        return this.f56382h.size();
    }

    @Override // com.google.common.collect.h3, java.util.Map
    public Collection values() {
        return this.f56382h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* compiled from: ImmutableSortedMap.java */
    public static class c<K, V> extends h3.b<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private transient Object[] f56387f;

        /* renamed from: g, reason: collision with root package name */
        private transient Object[] f56388g;

        /* renamed from: h, reason: collision with root package name */
        private final Comparator<? super K> f56389h;

        private c(Comparator<? super K> comparator, int i4) {
            super(4);
            comparator.getClass();
            this.f56389h = comparator;
            this.f56387f = new Object[i4];
            this.f56388g = new Object[i4];
        }

        private void f(int i4) {
            Object[] objArr = this.f56387f;
            if (i4 > objArr.length) {
                int f4 = b3.b.f(objArr.length, i4);
                this.f56387f = Arrays.copyOf(this.f56387f, f4);
                this.f56388g = Arrays.copyOf(this.f56388g, f4);
            }
        }

        @Override // com.google.common.collect.h3.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public s3<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.h3.b
        @f9.e
        @Deprecated
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final s3<K, V> c() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf53d"));
        }

        @Override // com.google.common.collect.h3.b
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public s3<K, V> d() {
            int i4 = this.f55797c;
            if (i4 == 0) {
                return s3.h0(this.f56389h);
            }
            if (i4 == 1) {
                Comparator<? super K> comparator = this.f56389h;
                Object obj = this.f56387f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f56388g[0];
                Objects.requireNonNull(obj2);
                return s3.D0(comparator, obj, obj2);
            }
            Object[] copyOf = Arrays.copyOf(this.f56387f, i4);
            Arrays.sort(copyOf, this.f56389h);
            int i5 = this.f55797c;
            Object[] objArr = new Object[i5];
            for (int i6 = 0; i6 < this.f55797c; i6++) {
                if (i6 > 0) {
                    int i7 = i6 - 1;
                    if (this.f56389h.compare(copyOf[i7], copyOf[i6]) == 0) {
                        String valueOf = String.valueOf(copyOf[i7]);
                        String valueOf2 = String.valueOf(copyOf[i6]);
                        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 57, ProtectedSandApp.s("\uf53e"), valueOf, ProtectedSandApp.s("\uf53f"), valueOf2));
                    }
                }
                Object obj3 = this.f56387f[i6];
                Objects.requireNonNull(obj3);
                int binarySearch = Arrays.binarySearch(copyOf, obj3, this.f56389h);
                Object obj4 = this.f56388g[i6];
                Objects.requireNonNull(obj4);
                objArr[binarySearch] = obj4;
            }
            return new s3<>(new v5(f3.p(copyOf), this.f56389h), f3.q(objArr, i5), null);
        }

        @f9.a
        c<K, V> q(c<K, V> cVar) {
            f(this.f55797c + cVar.f55797c);
            System.arraycopy(cVar.f56387f, 0, this.f56387f, this.f55797c, cVar.f55797c);
            System.arraycopy(cVar.f56388g, 0, this.f56388g, this.f55797c, cVar.f55797c);
            this.f55797c += cVar.f55797c;
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        @Deprecated
        @d9.a
        @f9.e("Always throws UnsupportedOperationException")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final c<K, V> h(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf540"));
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public c<K, V> i(K k4, V v4) {
            f(this.f55797c + 1);
            b0.a(k4, v4);
            Object[] objArr = this.f56387f;
            int i4 = this.f55797c;
            objArr[i4] = k4;
            this.f56388g[i4] = v4;
            this.f55797c = i4 + 1;
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public c<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @d9.a
        @f9.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public c<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public c(Comparator<? super K> comparator) {
            this(comparator, 4);
        }
    }

    s3(v5<K> v5Var, f3<V> f3Var) {
        this(v5Var, f3Var, null);
    }
}
