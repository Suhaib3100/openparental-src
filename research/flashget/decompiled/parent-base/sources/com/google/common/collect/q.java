package com.google.common.collect;

import com.google.common.collect.s6;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class q<R, C, V> implements s6<R, C, V> {

    /* renamed from: b, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Set<s6.a<R, C, V>> f56179b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Collection<V> f56180c;

    /* compiled from: AbstractTable.java */
    class a extends v6<s6.a<R, C, V>, V> {
        a(q qVar, Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.v6
        @f5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(s6.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* compiled from: AbstractTable.java */
    class b extends AbstractSet<s6.a<R, C, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof s6.a)) {
                return false;
            }
            s6.a aVar = (s6.a) obj;
            Map map = (Map) p4.p0(q.this.m(), aVar.a());
            return map != null && c0.j(map.entrySet(), new c3(aVar.b(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<s6.a<R, C, V>> iterator() {
            return q.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!(obj instanceof s6.a)) {
                return false;
            }
            s6.a aVar = (s6.a) obj;
            Map map = (Map) p4.p0(q.this.m(), aVar.a());
            return map != null && c0.k(map.entrySet(), new c3(aVar.b(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q.this.size();
        }
    }

    /* compiled from: AbstractTable.java */
    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return q.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return q.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return q.this.size();
        }
    }

    q() {
    }

    @Override // com.google.common.collect.s6
    public boolean A2(@zc.a Object obj) {
        return p4.o0(m(), obj);
    }

    @Override // com.google.common.collect.s6
    public Set<s6.a<R, C, V>> B1() {
        Set<s6.a<R, C, V>> set = this.f56179b;
        if (set != null) {
            return set;
        }
        Set<s6.a<R, C, V>> b5 = b();
        this.f56179b = b5;
        return b5;
    }

    @Override // com.google.common.collect.s6
    @zc.a
    @f9.a
    public V D1(@f5 R r4, @f5 C c5, @f5 V v4) {
        return i3(r4).put(c5, v4);
    }

    @Override // com.google.common.collect.s6
    public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        Map map = (Map) p4.p0(m(), obj);
        return map != null && p4.o0(map, obj2);
    }

    @Override // com.google.common.collect.s6
    @zc.a
    public V L(@zc.a Object obj, @zc.a Object obj2) {
        Map map = (Map) p4.p0(m(), obj);
        if (map == null) {
            return null;
        }
        return (V) p4.p0(map, obj2);
    }

    @Override // com.google.common.collect.s6
    public boolean S(@zc.a Object obj) {
        return p4.o0(j1(), obj);
    }

    abstract Iterator<s6.a<R, C, V>> a();

    Set<s6.a<R, C, V>> b() {
        return new b();
    }

    Collection<V> c() {
        return new c();
    }

    @Override // com.google.common.collect.s6
    public void clear() {
        d4.h(B1().iterator());
    }

    @Override // com.google.common.collect.s6
    public boolean containsValue(@zc.a Object obj) {
        Iterator<Map<C, V>> it = m().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    Iterator<V> d() {
        return new a(B1().iterator());
    }

    @Override // com.google.common.collect.s6
    public void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
        for (s6.a<? extends R, ? extends C, ? extends V> aVar : s6Var.B1()) {
            D1(aVar.a(), aVar.b(), aVar.getValue());
        }
    }

    @Override // com.google.common.collect.s6
    public boolean equals(@zc.a Object obj) {
        return t6.b(this, obj);
    }

    @Override // com.google.common.collect.s6
    public int hashCode() {
        return B1().hashCode();
    }

    @Override // com.google.common.collect.s6
    public Set<R> i() {
        return m().keySet();
    }

    @Override // com.google.common.collect.s6
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.s6
    public Set<C> q2() {
        return j1().keySet();
    }

    @Override // com.google.common.collect.s6
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj, @zc.a Object obj2) {
        Map map = (Map) p4.p0(m(), obj);
        if (map == null) {
            return null;
        }
        return (V) p4.q0(map, obj2);
    }

    public String toString() {
        return m().toString();
    }

    @Override // com.google.common.collect.s6
    public Collection<V> values() {
        Collection<V> collection = this.f56180c;
        if (collection != null) {
            return collection;
        }
        Collection<V> c5 = c();
        this.f56180c = c5;
        return c5;
    }
}
