package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: SetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface c6<K, V> extends r4<K, V> {
    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    Set<V> b(@zc.a Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    /* bridge */ /* synthetic */ default Collection c(@f5 Object obj, Iterable iterable) {
        return c((c6<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    Set<V> c(@f5 K k4, Iterable<? extends V> iterable);

    @Override // com.google.common.collect.r4
    boolean equals(@zc.a Object obj);

    @Override // com.google.common.collect.r4
    Map<K, Collection<V>> f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    /* bridge */ /* synthetic */ default Collection get(@f5 Object obj) {
        return get((c6<K, V>) obj);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    Set<V> get(@f5 K k4);

    @Override // com.google.common.collect.r4
    Set<Map.Entry<K, V>> h();
}
