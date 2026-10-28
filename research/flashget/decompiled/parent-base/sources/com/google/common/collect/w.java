package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* compiled from: BiMap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface w<K, V> extends Map<K, V> {
    w<V, K> M2();

    @zc.a
    @f9.a
    V a2(@f5 K k4, @f5 V v4);

    @zc.a
    @f9.a
    V put(@f5 K k4, @f5 V v4);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.w
    Set<V> values();
}
