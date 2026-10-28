package androidx.collection;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes2.dex */
public class a<K, V> extends i<K, V> implements Map<K, V> {

    @q0
    h<K, V> A;

    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    class C0015a extends h<K, V> {
        C0015a() {
        }

        @Override // androidx.collection.h
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.h
        protected Object b(int i5, int i6) {
            return a.this.f1537p[(i5 << 1) + i6];
        }

        @Override // androidx.collection.h
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.h
        protected int d() {
            return a.this.f1538q;
        }

        @Override // androidx.collection.h
        protected int e(Object obj) {
            return a.this.h(obj);
        }

        @Override // androidx.collection.h
        protected int f(Object obj) {
            return a.this.k(obj);
        }

        @Override // androidx.collection.h
        protected void g(K k5, V v5) {
            a.this.put(k5, v5);
        }

        @Override // androidx.collection.h
        protected void h(int i5) {
            a.this.n(i5);
        }

        @Override // androidx.collection.h
        protected V i(int i5, V v5) {
            return a.this.p(i5, v5);
        }
    }

    public a() {
    }

    private h<K, V> s() {
        if (this.A == null) {
            this.A = new C0015a();
        }
        return this.A;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return s().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return s().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        e(map.size() + this.f1538q);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(@o0 Collection<?> collection) {
        return h.j(this, collection);
    }

    public boolean t(@o0 Collection<?> collection) {
        return h.o(this, collection);
    }

    public boolean u(@o0 Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return s().n();
    }

    public a(int i5) {
        super(i5);
    }

    public a(i iVar) {
        super(iVar);
    }
}
