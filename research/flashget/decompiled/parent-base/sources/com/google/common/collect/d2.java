package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMultimap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class d2<K, V> extends h2 implements r4<K, V> {
    protected d2() {
    }

    @Override // com.google.common.collect.r4
    public boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return u3().T2(obj, obj2);
    }

    @f9.a
    public Collection<V> b(@zc.a Object obj) {
        return u3().b(obj);
    }

    @f9.a
    public Collection<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return u3().c(k4, iterable);
    }

    @Override // com.google.common.collect.r4
    public void clear() {
        u3().clear();
    }

    @Override // com.google.common.collect.r4
    public boolean containsKey(@zc.a Object obj) {
        return u3().containsKey(obj);
    }

    @Override // com.google.common.collect.r4
    public boolean containsValue(@zc.a Object obj) {
        return u3().containsValue(obj);
    }

    @Override // com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // com.google.common.collect.r4
    public Map<K, Collection<V>> f() {
        return u3().f();
    }

    public Collection<V> get(@f5 K k4) {
        return u3().get(k4);
    }

    @Override // com.google.common.collect.r4
    public Collection<Map.Entry<K, V>> h() {
        return u3().h();
    }

    @Override // com.google.common.collect.r4
    public int hashCode() {
        return u3().hashCode();
    }

    @Override // com.google.common.collect.r4
    public boolean isEmpty() {
        return u3().isEmpty();
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean k1(@f5 K k4, Iterable<? extends V> iterable) {
        return u3().k1(k4, iterable);
    }

    @Override // com.google.common.collect.r4
    public Set<K> keySet() {
        return u3().keySet();
    }

    @Override // com.google.common.collect.r4
    public u4<K> keys() {
        return u3().keys();
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean n0(r4<? extends K, ? extends V> r4Var) {
        return u3().n0(r4Var);
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean put(@f5 K k4, @f5 V v4) {
        return u3().put(k4, v4);
    }

    @Override // com.google.common.collect.r4
    @f9.a
    public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        return u3().remove(obj, obj2);
    }

    @Override // com.google.common.collect.r4
    public int size() {
        return u3().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract r4<K, V> u3();

    @Override // com.google.common.collect.r4
    public Collection<V> values() {
        return u3().values();
    }
}
