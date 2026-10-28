package com.google.common.collect;

import com.google.common.collect.e;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class m<K, V> extends e<K, V> implements c6<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f55939j = 7431625294878419160L;

    protected m(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.e
    <E> Collection<E> D(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.e
    Collection<V> E(@f5 K k4, Collection<V> collection) {
        return new e.n(k4, (Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: G */
    public abstract Set<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Set<V> y() {
        return Collections.emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((m<K, V>) obj, iterable);
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
        return get((m<K, V>) obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public boolean put(@f5 K k4, @f5 V v4) {
        return super.put(k4, v4);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Set<V> b(@zc.a Object obj) {
        return (Set) super.b(obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (Set) super.c((m<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> get(@f5 K k4) {
        return (Set) super.get((m<K, V>) k4);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public Set<Map.Entry<K, V>> h() {
        return (Set) super.h();
    }
}
