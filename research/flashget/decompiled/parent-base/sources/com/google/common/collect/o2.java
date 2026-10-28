package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ForwardingSortedSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class o2<K, V> extends k2<K, V> implements n6<K, V> {
    protected o2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.k2, com.google.common.collect.d2
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public abstract n6<K, V> u3();

    @Override // com.google.common.collect.n6
    @zc.a
    public Comparator<? super V> K0() {
        return u3().K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
        return c((o2<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Collection get(@f5 Object obj) {
        return get((o2<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Set c(@f5 Object obj, Iterable iterable) {
        return c((o2<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public /* bridge */ /* synthetic */ Set get(@f5 Object obj) {
        return get((o2<K, V>) obj);
    }

    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public SortedSet<V> b(@zc.a Object obj) {
        return u3().b(obj);
    }

    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public SortedSet<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return u3().c((n6<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.k2, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
    public SortedSet<V> get(@f5 K k4) {
        return u3().get((n6<K, V>) k4);
    }
}
