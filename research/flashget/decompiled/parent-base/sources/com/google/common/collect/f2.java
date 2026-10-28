package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* compiled from: ForwardingNavigableMap.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public abstract class f2<K, V> extends l2<K, V> implements NavigableMap<K, V> {

    /* compiled from: ForwardingNavigableMap.java */
    @d9.a
    protected class a extends p4.q<K, V> {

        /* compiled from: ForwardingNavigableMap.java */
        /* renamed from: com.google.common.collect.f2$a$a, reason: collision with other inner class name */
        class C0848a implements Iterator<Map.Entry<K, V>> {

            /* renamed from: b, reason: collision with root package name */
            @zc.a
            private Map.Entry<K, V> f55725b = null;

            /* renamed from: c, reason: collision with root package name */
            @zc.a
            private Map.Entry<K, V> f55726c;

            C0848a() {
                this.f55726c = a.this.T3().lastEntry();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.f55726c;
                if (entry == null) {
                    throw new NoSuchElementException();
                }
                this.f55725b = entry;
                this.f55726c = a.this.T3().lowerEntry(this.f55726c.getKey());
                return entry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55726c != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f55725b == null) {
                    throw new IllegalStateException(ProtectedSandApp.s("\uf4ba"));
                }
                a.this.T3().remove(this.f55725b.getKey());
                this.f55725b = null;
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.p4.q
        protected Iterator<Map.Entry<K, V>> S3() {
            return new C0848a();
        }

        @Override // com.google.common.collect.p4.q
        NavigableMap<K, V> T3() {
            return f2.this;
        }
    }

    /* compiled from: ForwardingNavigableMap.java */
    @d9.a
    protected class b extends p4.e0<K, V> {
        public b(f2 f2Var) {
            super((Map) f2Var);
        }
    }

    protected f2() {
    }

    @Override // com.google.common.collect.l2
    protected SortedMap<K, V> S3(@f5 K k4, @f5 K k5) {
        return subMap(k4, true, k5, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.l2, com.google.common.collect.b2
    /* renamed from: U3, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> u3();

    @zc.a
    protected Map.Entry<K, V> V3(@f5 K k4) {
        return tailMap(k4, true).firstEntry();
    }

    @zc.a
    protected K W3(@f5 K k4) {
        return (K) p4.T(ceilingEntry(k4));
    }

    @d9.a
    protected NavigableSet<K> X3() {
        return descendingMap().navigableKeySet();
    }

    @zc.a
    protected Map.Entry<K, V> Y3() {
        return (Map.Entry) c4.v(entrySet(), null);
    }

    protected K Z3() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @zc.a
    protected Map.Entry<K, V> a4(@f5 K k4) {
        return headMap(k4, true).lastEntry();
    }

    @zc.a
    protected K b4(@f5 K k4) {
        return (K) p4.T(floorEntry(k4));
    }

    protected SortedMap<K, V> c4(@f5 K k4) {
        return headMap(k4, false);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> ceilingEntry(@f5 K k4) {
        return u3().ceilingEntry(k4);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K ceilingKey(@f5 K k4) {
        return u3().ceilingKey(k4);
    }

    @zc.a
    protected Map.Entry<K, V> d4(@f5 K k4) {
        return tailMap(k4, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return u3().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return u3().descendingMap();
    }

    @zc.a
    protected K e4(@f5 K k4) {
        return (K) p4.T(higherEntry(k4));
    }

    @zc.a
    protected Map.Entry<K, V> f4() {
        return (Map.Entry) c4.v(descendingMap().entrySet(), null);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> firstEntry() {
        return u3().firstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> floorEntry(@f5 K k4) {
        return u3().floorEntry(k4);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K floorKey(@f5 K k4) {
        return u3().floorKey(k4);
    }

    protected K g4() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @zc.a
    protected Map.Entry<K, V> h4(@f5 K k4) {
        return headMap(k4, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@f5 K k4, boolean z4) {
        return u3().headMap(k4, z4);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> higherEntry(@f5 K k4) {
        return u3().higherEntry(k4);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K higherKey(@f5 K k4) {
        return u3().higherKey(k4);
    }

    @zc.a
    protected K i4(@f5 K k4) {
        return (K) p4.T(lowerEntry(k4));
    }

    @zc.a
    protected Map.Entry<K, V> j4() {
        return (Map.Entry) d4.U(entrySet().iterator());
    }

    @zc.a
    protected Map.Entry<K, V> k4() {
        return (Map.Entry) d4.U(descendingMap().entrySet().iterator());
    }

    protected SortedMap<K, V> l4(@f5 K k4) {
        return tailMap(k4, true);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lastEntry() {
        return u3().lastEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lowerEntry(@f5 K k4) {
        return u3().lowerEntry(k4);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K lowerKey(@f5 K k4) {
        return u3().lowerKey(k4);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return u3().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> pollFirstEntry() {
        return u3().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> pollLastEntry() {
        return u3().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@f5 K k4, boolean z4, @f5 K k5, boolean z5) {
        return u3().subMap(k4, z4, k5, z5);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@f5 K k4, boolean z4) {
        return u3().tailMap(k4, z4);
    }
}
