package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class k2<K, V> extends d2<K, V> implements c6<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.d2
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public abstract c6<K, V> u3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((k2<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Collection get(@f5 Object obj) {
        return get((k2<K, V>) obj);
    }

    @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Set<V> b(@zc.a Object obj) {
        return u3().b(obj);
    }

    @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return u3().c((c6<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public Set<V> get(@f5 K k4) {
        return u3().get((c6<K, V>) k4);
    }

    @Override // com.google.common.collect.d2, com.google.common.collect.r4
    public Set<Map.Entry<K, V>> h() {
        return u3().h();
    }
}
