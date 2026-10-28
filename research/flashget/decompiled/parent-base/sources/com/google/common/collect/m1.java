package com.google.common.collect;

import com.google.common.collect.p4;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FilteredMultimapValues.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class m1<K, V> extends AbstractCollection<V> {

    /* renamed from: b, reason: collision with root package name */
    @ma.i
    private final l1<K, V> f55950b;

    m1(l1<K, V> l1Var) {
        l1Var.getClass();
        this.f55950b = l1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f55950b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return this.f55950b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new p4.f(this.f55950b.t().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@zc.a Object obj) {
        com.google.common.base.m0<? super Map.Entry<K, V>> g22 = this.f55950b.g2();
        Iterator<Map.Entry<K, V>> it = this.f55950b.l().t().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (g22.apply(next) && com.google.common.base.f0.a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return c4.J(this.f55950b.l().t(), com.google.common.base.n0.d(this.f55950b.g2(), com.google.common.base.n0.h(com.google.common.base.n0.n(collection), p4.r.VALUE)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return c4.J(this.f55950b.l().t(), com.google.common.base.n0.d(this.f55950b.g2(), com.google.common.base.n0.h(com.google.common.base.n0.q(com.google.common.base.n0.n(collection)), p4.r.VALUE)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f55950b.size();
    }
}
