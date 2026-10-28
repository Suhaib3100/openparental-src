package com.google.common.cache;

import com.google.common.collect.h3;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/* compiled from: AbstractLoadingCache.java */
@d9.c
@g
/* loaded from: classes6.dex */
public abstract class b<K, V> extends a<K, V> implements j<K, V> {
    protected b() {
    }

    @Override // com.google.common.cache.j
    public void H2(K k4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.j
    public V X(K k4) {
        try {
            return get(k4);
        } catch (ExecutionException e4) {
            throw new UncheckedExecutionException(e4.getCause());
        }
    }

    @Override // com.google.common.cache.j, com.google.common.base.x
    public final V apply(K k4) {
        return X(k4);
    }

    @Override // com.google.common.cache.j
    public h3<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k4 : iterable) {
            if (!linkedHashMap.containsKey(k4)) {
                linkedHashMap.put(k4, get(k4));
            }
        }
        return h3.i(linkedHashMap);
    }
}
