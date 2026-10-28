package com.google.common.collect;

import java.util.Collection;
import java.util.List;

/* compiled from: FilteredKeyListMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class i1<K, V> extends j1<K, V> implements k4<K, V> {
    i1(k4<K, V> k4Var, com.google.common.base.m0<? super K> m0Var) {
        super(k4Var, m0Var);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection b(@zc.a Object obj) {
        return (List) super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public Collection c(@f5 Object obj, Iterable iterable) {
        return (List) super.c((i1<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public Collection v(@f5 Object obj) {
        return (List) super.v((i1<K, V>) obj);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.l1
    public r4 l() {
        return (k4) this.f55824g;
    }

    public k4<K, V> n() {
        return (k4) this.f55824g;
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    public List<V> b(@zc.a Object obj) {
        return (List) super.b(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    public List<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (List) super.c((i1<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public List<V> v(@f5 K k4) {
        return (List) super.v((i1<K, V>) k4);
    }
}
