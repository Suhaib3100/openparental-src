package com.google.common.cache;

import com.google.common.collect.h3;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: Cache.java */
@f9.f("Use CacheBuilder.newBuilder().build()")
@g
@d9.b
/* loaded from: classes6.dex */
public interface c<K, V> {
    @zc.a
    V H1(@f9.c("K") Object obj);

    @f9.b
    ConcurrentMap<K, V> f();

    void f2(Iterable<? extends Object> iterable);

    V j0(K k4, Callable<? extends V> callable) throws ExecutionException;

    h3<K, V> j3(Iterable<? extends Object> iterable);

    void l1(@f9.c("K") Object obj);

    void p();

    void put(K k4, V v4);

    void putAll(Map<? extends K, ? extends V> map);

    @f9.b
    f s3();

    @f9.b
    long size();

    void x();
}
