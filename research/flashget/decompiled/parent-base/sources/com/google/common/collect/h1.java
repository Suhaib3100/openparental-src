package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredEntrySetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class h1<K, V> extends f1<K, V> implements n1<K, V> {
    h1(c6<K, V> c6Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        super(c6Var, m0Var);
    }

    @Override // com.google.common.collect.f1, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection b(@zc.a Object obj) {
        return (Set) super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection c(@f5 Object obj, Iterable iterable) {
        return (Set) super.c((h1<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Collection v(@f5 Object obj) {
        return (Set) super.v((h1<K, V>) obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Collection t() {
        return (Set) super.t();
    }

    @Override // com.google.common.collect.f1, com.google.common.collect.l1
    public r4 l() {
        return (c6) this.f55712g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f1, com.google.common.collect.h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> d() {
        return d6.i(((c6) this.f55712g).t(), this.f55713h);
    }

    @Override // com.google.common.collect.f1, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> b(@zc.a Object obj) {
        return (Set) super.b(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (Set) super.c((h1<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.f1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Set<V> v(@f5 K k4) {
        return (Set) super.v((h1<K, V>) k4);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Set<Map.Entry<K, V>> t() {
        return (Set) super.t();
    }

    @Override // com.google.common.collect.f1, com.google.common.collect.l1
    public c6<K, V> l() {
        return (c6) this.f55712g;
    }
}
