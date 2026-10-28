package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Multimap.java */
@w0
@f9.f("Use ImmutableMultimap, HashMultimap, or another implementation")
@d9.b
/* loaded from: classes6.dex */
public interface r4<K, V> {
    boolean T2(@f9.c("K") @zc.a Object obj, @f9.c("V") @zc.a Object obj2);

    @f9.a
    Collection<V> b(@f9.c("K") @zc.a Object obj);

    @f9.a
    Collection<V> c(@f5 K k4, Iterable<? extends V> iterable);

    void clear();

    boolean containsKey(@f9.c("K") @zc.a Object obj);

    boolean containsValue(@f9.c("V") @zc.a Object obj);

    boolean equals(@zc.a Object obj);

    Map<K, Collection<V>> f();

    Collection<V> get(@f5 K k4);

    Collection<Map.Entry<K, V>> h();

    int hashCode();

    boolean isEmpty();

    @f9.a
    boolean k1(@f5 K k4, Iterable<? extends V> iterable);

    Set<K> keySet();

    u4<K> keys();

    @f9.a
    boolean n0(r4<? extends K, ? extends V> r4Var);

    @f9.a
    boolean put(@f5 K k4, @f5 V v4);

    @f9.a
    boolean remove(@f9.c("K") @zc.a Object obj, @f9.c("V") @zc.a Object obj2);

    int size();

    Collection<V> values();
}
