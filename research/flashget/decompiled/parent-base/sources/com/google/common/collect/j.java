package com.google.common.collect;

import com.google.common.collect.p4;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: AbstractNavigableMap.java */
@w0
@d9.c
/* loaded from: classes6.dex */
abstract class j<K, V> extends p4.a0<K, V> implements NavigableMap<K, V> {

    /* compiled from: AbstractNavigableMap.java */
    private final class b extends p4.q<K, V> {
        private b() {
        }

        @Override // com.google.common.collect.p4.q
        Iterator<Map.Entry<K, V>> S3() {
            return j.this.c();
        }

        @Override // com.google.common.collect.p4.q
        NavigableMap<K, V> T3() {
            return j.this;
        }
    }

    j() {
    }

    abstract Iterator<Map.Entry<K, V>> c();

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> ceilingEntry(@f5 K k4) {
        return tailMap(k4, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K ceilingKey(@f5 K k4) {
        return (K) p4.T(ceilingEntry(k4));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) d4.J(b(), null);
    }

    @Override // java.util.SortedMap
    @f5
    public K firstKey() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> floorEntry(@f5 K k4) {
        return headMap(k4, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K floorKey(@f5 K k4) {
        return (K) p4.T(floorEntry(k4));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    public abstract V get(@zc.a Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@f5 K k4) {
        return headMap(k4, false);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> higherEntry(@f5 K k4) {
        return tailMap(k4, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K higherKey(@f5 K k4) {
        return (K) p4.T(higherEntry(k4));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) d4.J(c(), null);
    }

    @Override // java.util.SortedMap
    @f5
    public K lastKey() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> lowerEntry(@f5 K k4) {
        return headMap(k4, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @zc.a
    public K lowerKey(@f5 K k4) {
        return (K) p4.T(lowerEntry(k4));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new p4.e0((Map) this);
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) d4.U(b());
    }

    @Override // java.util.NavigableMap
    @zc.a
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) d4.U(c());
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
