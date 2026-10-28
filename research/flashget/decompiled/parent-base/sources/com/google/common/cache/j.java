package com.google.common.cache;

import com.google.common.collect.h3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: LoadingCache.java */
@g
@d9.b
/* loaded from: classes6.dex */
public interface j<K, V> extends c<K, V>, com.google.common.base.x<K, V> {
    void H2(K k4);

    V X(K k4);

    @Override // com.google.common.base.x
    @Deprecated
    V apply(K k4);

    @Override // com.google.common.cache.c
    ConcurrentMap<K, V> f();

    V get(K k4) throws ExecutionException;

    h3<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException;
}
