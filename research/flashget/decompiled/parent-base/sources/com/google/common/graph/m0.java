package com.google.common.graph;

import com.google.common.collect.e7;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MapIteratorCache.java */
@t
/* loaded from: classes6.dex */
class m0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f56836a;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private volatile transient Map.Entry<K, V> f56837b;

    /* compiled from: MapIteratorCache.java */
    class a extends AbstractSet<K> {

        /* compiled from: MapIteratorCache.java */
        /* renamed from: com.google.common.graph.m0$a$a, reason: collision with other inner class name */
        class C0870a extends e7<K> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f56839b;

            C0870a(Iterator it) {
                this.f56839b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f56839b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f56839b.next();
                m0.this.f56837b = entry;
                return (K) entry.getKey();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<K> iterator() {
            return new C0870a(m0.this.f56836a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return m0.this.e(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m0.this.f56836a.size();
        }
    }

    m0(Map<K, V> map) {
        map.getClass();
        this.f56836a = map;
    }

    final void c() {
        d();
        this.f56836a.clear();
    }

    void d() {
        this.f56837b = null;
    }

    final boolean e(@zc.a Object obj) {
        return g(obj) != null || this.f56836a.containsKey(obj);
    }

    @zc.a
    V f(Object obj) {
        obj.getClass();
        V g4 = g(obj);
        return g4 == null ? h(obj) : g4;
    }

    @zc.a
    V g(@zc.a Object obj) {
        Map.Entry<K, V> entry = this.f56837b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    @zc.a
    final V h(Object obj) {
        obj.getClass();
        return this.f56836a.get(obj);
    }

    @zc.a
    @f9.a
    final V i(K k4, V v4) {
        k4.getClass();
        v4.getClass();
        d();
        return this.f56836a.put(k4, v4);
    }

    @zc.a
    @f9.a
    final V j(Object obj) {
        obj.getClass();
        d();
        return this.f56836a.remove(obj);
    }

    final Set<K> k() {
        return new a();
    }
}
