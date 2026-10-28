package com.google.common.graph;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: AbstractUndirectedNetworkConnections.java */
@t
/* loaded from: classes6.dex */
abstract class i<N, E> implements u0<N, E> {

    /* renamed from: a, reason: collision with root package name */
    final Map<E, N> f56825a;

    i(Map<E, N> map) {
        map.getClass();
        this.f56825a = map;
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return c();
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return c();
    }

    @Override // com.google.common.graph.u0
    @zc.a
    public N d(E e4, boolean z4) {
        if (z4) {
            return null;
        }
        return j(e4);
    }

    @Override // com.google.common.graph.u0
    public void e(E e4, N n4) {
        com.google.common.base.l0.g0(this.f56825a.put(e4, n4) == null);
    }

    @Override // com.google.common.graph.u0
    public void f(E e4, N n4, boolean z4) {
        if (z4) {
            return;
        }
        e(e4, n4);
    }

    @Override // com.google.common.graph.u0
    public Set<E> g() {
        return Collections.unmodifiableSet(this.f56825a.keySet());
    }

    @Override // com.google.common.graph.u0
    public N h(E e4) {
        N n4 = this.f56825a.get(e4);
        Objects.requireNonNull(n4);
        return n4;
    }

    @Override // com.google.common.graph.u0
    public Set<E> i() {
        return g();
    }

    @Override // com.google.common.graph.u0
    public N j(E e4) {
        N remove = this.f56825a.remove(e4);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.u0
    public Set<E> k() {
        return g();
    }
}
