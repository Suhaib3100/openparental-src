package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: ListMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface k4<K, V> extends r4<K, V> {
    @Override // 
    @f9.a
    List<V> b(@zc.a Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @f9.a
    /* bridge */ /* synthetic */ default Collection c(@f5 Object obj, Iterable iterable) {
        return c((k4<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    List<V> c(@f5 K k4, Iterable<? extends V> iterable);

    @Override // com.google.common.collect.r4
    boolean equals(@zc.a Object obj);

    @Override // com.google.common.collect.r4
    Map<K, Collection<V>> f();

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@f5 Object obj) {
        return get((k4<K, V>) obj);
    }

    @Override // com.google.common.collect.r4, com.google.common.collect.k4
    List<V> get(@f5 K k4);
}
