package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: IncidentEdgeSet.java */
@t
/* loaded from: classes6.dex */
abstract class l0<N> extends AbstractSet<u<N>> {

    /* renamed from: b, reason: collision with root package name */
    final N f56833b;

    /* renamed from: c, reason: collision with root package name */
    final k<N> f56834c;

    l0(k<N> kVar, N n4) {
        this.f56834c = kVar;
        this.f56833b = n4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zc.a Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f56834c.e()) {
            if (!uVar.c()) {
                return false;
            }
            Object p4 = uVar.p();
            Object q4 = uVar.q();
            return (this.f56833b.equals(p4) && this.f56834c.b((k<N>) this.f56833b).contains(q4)) || (this.f56833b.equals(q4) && this.f56834c.a((k<N>) this.f56833b).contains(p4));
        }
        if (uVar.c()) {
            return false;
        }
        Set<N> k4 = this.f56834c.k(this.f56833b);
        Object h4 = uVar.h();
        Object i4 = uVar.i();
        return (this.f56833b.equals(i4) && k4.contains(h4)) || (this.f56833b.equals(h4) && k4.contains(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f56834c.e() ? (this.f56834c.n(this.f56833b) + this.f56834c.i(this.f56833b)) - (this.f56834c.b((k<N>) this.f56833b).contains(this.f56833b) ? 1 : 0) : this.f56834c.k(this.f56833b).size();
    }
}
