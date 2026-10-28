package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractListMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class d<K, V> extends e<K, V> implements k4<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f55507j = 6588350623831699109L;

    protected d(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.e
    <E> Collection<E> D(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.e
    Collection<V> E(@f5 K k4, Collection<V> collection) {
        return F(k4, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: G */
    public abstract List<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public List<V> y() {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((d<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public Map<K, Collection<V>> f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Collection get(@f5 Object obj) {
        return get((d<K, V>) obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public boolean put(@f5 K k4, @f5 V v4) {
        return super.put(k4, v4);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public List<V> b(@zc.a Object obj) {
        return (List) super.b(obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public List<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (List) super.c((d<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    public List<V> get(@f5 K k4) {
        return (List) super.get((d<K, V>) k4);
    }
}
