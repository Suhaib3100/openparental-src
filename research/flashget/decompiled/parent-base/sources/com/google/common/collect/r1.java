package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* compiled from: ForwardingConcurrentMap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class r1<K, V> extends b2<K, V> implements ConcurrentMap<K, V> {
    protected r1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: R3, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> u3();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @zc.a
    @f9.a
    public V putIfAbsent(K k4, V v4) {
        return u3().putIfAbsent(k4, v4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        return u3().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @zc.a
    @f9.a
    public V replace(K k4, V v4) {
        return u3().replace(k4, v4);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @f9.a
    public boolean replace(K k4, V v4, V v5) {
        return u3().replace(k4, v4, v5);
    }
}
