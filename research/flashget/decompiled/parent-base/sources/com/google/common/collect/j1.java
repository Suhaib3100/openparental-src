package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredKeyMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
class j1<K, V> extends h<K, V> implements l1<K, V> {

    /* renamed from: g, reason: collision with root package name */
    final r4<K, V> f55824g;

    /* renamed from: h, reason: collision with root package name */
    final com.google.common.base.m0<? super K> f55825h;

    /* compiled from: FilteredKeyMultimap.java */
    static class a<K, V> extends y1<V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55826b;

        a(@f5 K k4) {
            this.f55826b = k4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.y1, com.google.common.collect.q1
        /* renamed from: T3 */
        public List<V> u3() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 V v4) {
            add(0, v4);
            return true;
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.y1, java.util.List
        public void add(int i4, @f5 V v4) {
            com.google.common.base.l0.d0(i4, 0);
            String valueOf = String.valueOf(this.f55826b);
            throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 32, ProtectedSandApp.s("\uf4dd"), valueOf));
        }

        @Override // com.google.common.collect.y1, java.util.List
        @f9.a
        public boolean addAll(int i4, Collection<? extends V> collection) {
            collection.getClass();
            com.google.common.base.l0.d0(i4, 0);
            String valueOf = String.valueOf(this.f55826b);
            throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 32, ProtectedSandApp.s("\uf4dd"), valueOf));
        }
    }

    /* compiled from: FilteredKeyMultimap.java */
    static class b<K, V> extends j2<V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f55827b;

        b(@f5 K k4) {
            this.f55827b = k4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<V> u3() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Queue
        public boolean add(@f5 V v4) {
            String valueOf = String.valueOf(this.f55827b);
            throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 32, ProtectedSandApp.s("\uf4de"), valueOf));
        }

        @Override // com.google.common.collect.q1, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            collection.getClass();
            String valueOf = String.valueOf(this.f55827b);
            throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 32, ProtectedSandApp.s("\uf4de"), valueOf));
        }
    }

    /* compiled from: FilteredKeyMultimap.java */
    class c extends q1<Map.Entry<K, V>> {
        c() {
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (j1.this.f55824g.containsKey(entry.getKey()) && j1.this.f55825h.apply((Object) entry.getKey())) {
                return j1.this.f55824g.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q1, com.google.common.collect.h2
        /* renamed from: v3 */
        public Collection<Map.Entry<K, V>> u3() {
            return c0.d(j1.this.f55824g.t(), j1.this.g2());
        }
    }

    j1(r4<K, V> r4Var, com.google.common.base.m0<? super K> m0Var) {
        r4Var.getClass();
        this.f55824g = r4Var;
        m0Var.getClass();
        this.f55825h = m0Var;
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return p4.G(this.f55824g.f(), this.f55825h);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    public Collection<V> b(@zc.a Object obj) {
        return containsKey(obj) ? this.f55824g.b(obj) : m();
    }

    @Override // com.google.common.collect.r4
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        if (this.f55824g.containsKey(obj)) {
            return this.f55825h.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> d() {
        return new c();
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return d6.i(this.f55824g.keySet(), this.f55825h);
    }

    @Override // com.google.common.collect.h
    u4<K> g() {
        return v4.j(this.f55824g.keys(), this.f55825h);
    }

    @Override // com.google.common.collect.l1
    public com.google.common.base.m0<? super Map.Entry<K, V>> g2() {
        return com.google.common.base.n0.h(this.f55825h, p4.r.KEY);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Collection<V> v(@f5 K k4) {
        return this.f55825h.apply(k4) ? this.f55824g.v(k4) : this.f55824g instanceof c6 ? new b(k4) : new a(k4);
    }

    @Override // com.google.common.collect.h
    Collection<V> i() {
        return new m1(this);
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> j() {
        throw new AssertionError(ProtectedSandApp.s("\uf4d4"));
    }

    public r4<K, V> l() {
        return this.f55824g;
    }

    Collection<V> m() {
        return this.f55824g instanceof c6 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.r4
    public int size() {
        Iterator<Collection<V>> it = f().values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().size();
        }
        return i4;
    }
}
