package com.googlecode.mp4parser.util;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: RangeStartMap.java */
/* loaded from: classes6.dex */
public class n<K extends Comparable, V> implements Map<K, V> {

    /* renamed from: b, reason: collision with root package name */
    TreeMap<K, V> f64114b = new TreeMap<>(new a());

    /* compiled from: RangeStartMap.java */
    class a implements Comparator<K> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(K k4, K k5) {
            return -k4.compareTo(k5);
        }
    }

    public n() {
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public V put(K k4, V v4) {
        return this.f64114b.put(k4, v4);
    }

    @Override // java.util.Map
    public void clear() {
        this.f64114b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f64114b.get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f64114b.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it = this.f64114b.keySet().iterator();
        K next = it.next();
        while (true) {
            K k4 = next;
            if (!it.hasNext()) {
                return this.f64114b.get(k4);
            }
            if (comparable.compareTo(k4) >= 0) {
                return this.f64114b.get(k4);
            }
            next = it.next();
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f64114b.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f64114b.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.f64114b.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it = this.f64114b.keySet().iterator();
        K next = it.next();
        while (true) {
            K k4 = next;
            if (!it.hasNext()) {
                return this.f64114b.remove(k4);
            }
            if (comparable.compareTo(k4) >= 0) {
                return this.f64114b.remove(k4);
            }
            next = it.next();
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f64114b.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f64114b.values();
    }

    public n(K k4, V v4) {
        put(k4, v4);
    }
}
