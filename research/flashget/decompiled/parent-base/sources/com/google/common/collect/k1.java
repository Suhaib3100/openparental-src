package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredKeySetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class k1<K, V> extends j1<K, V> implements n1<K, V> {

    /* compiled from: FilteredKeySetMultimap.java */
    class a extends j1<K, V>.c implements Set<Map.Entry<K, V>> {
        a(k1 k1Var) {
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

    k1(c6<K, V> c6Var, com.google.common.base.m0<? super K> m0Var) {
        super(c6Var, m0Var);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection b(@zc.a Object obj) {
        return (Set) super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection c(@f5 Object obj, Iterable iterable) {
        return (Set) super.c((k1<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.h
    Collection d() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Collection v(@f5 Object obj) {
        return (Set) super.v((k1<K, V>) obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Collection t() {
        return (Set) super.t();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.l1
    public r4 l() {
        return (c6) this.f55824g;
    }

    Set<Map.Entry<K, V>> n() {
        return new a();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> b(@zc.a Object obj) {
        return (Set) super.b(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (Set) super.c((k1<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Set<V> v(@f5 K k4) {
        return (Set) super.v((k1<K, V>) k4);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Set<Map.Entry<K, V>> t() {
        return (Set) super.t();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.l1
    public c6<K, V> l() {
        return (c6) this.f55824g;
    }
}
