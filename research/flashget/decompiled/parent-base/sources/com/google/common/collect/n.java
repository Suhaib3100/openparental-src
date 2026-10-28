package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: AbstractSortedKeySortedSetMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class n<K, V> extends p<K, V> {
    n(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> f() {
        return (SortedMap) super.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> t() {
        return (SortedMap) super.t();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Set<K> e() {
        return x();
    }
}
