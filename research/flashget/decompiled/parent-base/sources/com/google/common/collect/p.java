package com.google.common.collect;

import com.google.common.collect.e;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: AbstractSortedSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class p<K, V> extends m<K, V> implements n6<K, V> {

    /* renamed from: k, reason: collision with root package name */
    private static final long f56080k = 430848587173315748L;

    protected p(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    Collection<V> E(@f5 K k4, Collection<V> collection) {
        return collection instanceof NavigableSet ? new e.m(k4, (NavigableSet) collection, null) : new e.o(k4, (SortedSet) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* renamed from: I */
    public abstract SortedSet<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> y() {
        return (SortedSet<V>) D(u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> D(Collection<E> collection) {
        return collection instanceof NavigableSet ? d6.O((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((p<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    public Map<K, Collection<V>> f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
        return v((p<K, V>) obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public Collection<V> values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Set c(@f5 Object obj, Iterable iterable) {
        return c((p<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ Set v(@f5 Object obj) {
        return v((p<K, V>) obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public SortedSet<V> b(@zc.a Object obj) {
        return (SortedSet) super.b(obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public SortedSet<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return (SortedSet) super.c((p<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public SortedSet<V> v(@f5 K k4) {
        return (SortedSet) super.v((p<K, V>) k4);
    }
}
