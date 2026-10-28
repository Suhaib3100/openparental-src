package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: SortedSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface n6<K, V> extends c6<K, V> {
    @zc.a
    Comparator<? super V> K0();

    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    SortedSet<V> b(@zc.a Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    /* bridge */ /* synthetic */ default Collection c(@f5 Object obj, Iterable iterable) {
        return c((n6<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    SortedSet<V> c(@f5 K k4, Iterable<? extends V> iterable);

    @Override // com.google.common.collect.c6, com.google.common.collect.r4
    Map<K, Collection<V>> f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    /* bridge */ /* synthetic */ default Collection get(@f5 Object obj) {
        return get((n6<K, V>) obj);
    }

    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    SortedSet<V> get(@f5 K k4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    /* bridge */ /* synthetic */ default Set c(@f5 Object obj, Iterable iterable) {
        return c((n6<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c6, com.google.common.collect.r4, com.google.common.collect.k4
    /* bridge */ /* synthetic */ default Set get(@f5 Object obj) {
        return get((n6<K, V>) obj);
    }
}
