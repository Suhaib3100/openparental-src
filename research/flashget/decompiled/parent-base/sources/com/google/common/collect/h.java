package com.google.common.collect;

import com.google.common.collect.p4;
import com.google.common.collect.t4;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class h<K, V> implements r4<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Collection<Map.Entry<K, V>> f55777b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Set<K> f55778c;

    /* renamed from: d, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient u4<K> f55779d;

    /* renamed from: e, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Collection<V> f55780e;

    /* renamed from: f, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Map<K, Collection<V>> f55781f;

    /* compiled from: AbstractMultimap.java */
    class a extends t4.f<K, V> {
        a() {
        }

        @Override // com.google.common.collect.t4.f
        r4<K, V> b() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.j();
        }
    }

    /* compiled from: AbstractMultimap.java */
    class b extends h<K, V>.a implements Set<Map.Entry<K, V>> {
        b(h hVar) {
            super();
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

    /* compiled from: AbstractMultimap.java */
    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return h.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return h.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    h() {
    }

    @Override // com.google.common.collect.r4
    public boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        Collection<V> collection = f().get(obj);
        return collection != null && collection.contains(obj2);
    }

    abstract Map<K, Collection<V>> a();

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Collection<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        iterable.getClass();
        Collection<V> b5 = b(k4);
        k1(k4, iterable);
        return b5;
    }

    @Override // com.google.common.collect.r4
    public boolean containsValue(@zc.a Object obj) {
        Iterator<Collection<V>> it = f().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Collection<Map.Entry<K, V>> d();

    abstract Set<K> e();

    @Override // com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.r4
    public Map<K, Collection<V>> f() {
        Map<K, Collection<V>> map = this.f55781f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a5 = a();
        this.f55781f = a5;
        return a5;
    }

    abstract u4<K> g();

    @Override // com.google.common.collect.r4
    public Collection<Map.Entry<K, V>> h() {
        Collection<Map.Entry<K, V>> collection = this.f55777b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> d5 = d();
        this.f55777b = d5;
        return d5;
    }

    @Override // com.google.common.collect.r4
    public int hashCode() {
        return f().hashCode();
    }

    abstract Collection<V> i();

    @Override // com.google.common.collect.r4
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract Iterator<Map.Entry<K, V>> j();

    Iterator<V> k() {
        return new p4.f(h().iterator());
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean k1(@f5 K k4, Iterable<? extends V> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k4).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && d4.a(get(k4), it);
    }

    @Override // com.google.common.collect.r4
    public Set<K> keySet() {
        Set<K> set = this.f55778c;
        if (set != null) {
            return set;
        }
        Set<K> e4 = e();
        this.f55778c = e4;
        return e4;
    }

    @Override // com.google.common.collect.r4
    public u4<K> keys() {
        u4<K> u4Var = this.f55779d;
        if (u4Var != null) {
            return u4Var;
        }
        u4<K> g4 = g();
        this.f55779d = g4;
        return g4;
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean n0(r4<? extends K, ? extends V> r4Var) {
        boolean z4 = false;
        for (Map.Entry<? extends K, ? extends V> entry : r4Var.h()) {
            z4 |= put(entry.getKey(), entry.getValue());
        }
        return z4;
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean put(@f5 K k4, @f5 V v4) {
        return get(k4).add(v4);
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        Collection<V> collection = f().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return f().toString();
    }

    @Override // com.google.common.collect.r4
    public Collection<V> values() {
        Collection<V> collection = this.f55780e;
        if (collection != null) {
            return collection;
        }
        Collection<V> i4 = i();
        this.f55780e = i4;
        return i4;
    }
}
