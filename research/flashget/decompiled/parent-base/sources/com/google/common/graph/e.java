package com.google.common.graph;

import com.google.common.collect.d4;
import com.google.common.collect.d6;
import com.google.common.collect.e7;
import com.google.common.collect.o1;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: AbstractDirectedNetworkConnections.java */
@t
/* loaded from: classes6.dex */
abstract class e<N, E> implements u0<N, E> {

    /* renamed from: a, reason: collision with root package name */
    final Map<E, N> f56797a;

    /* renamed from: b, reason: collision with root package name */
    final Map<E, N> f56798b;

    /* renamed from: c, reason: collision with root package name */
    private int f56799c;

    /* compiled from: AbstractDirectedNetworkConnections.java */
    class a extends AbstractSet<E> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<E> iterator() {
            return d4.f0((e.this.f56799c == 0 ? o1.j(e.this.f56797a.keySet(), e.this.f56798b.keySet()) : d6.N(e.this.f56797a.keySet(), e.this.f56798b.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return e.this.f56797a.containsKey(obj) || e.this.f56798b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.t(e.this.f56797a.size(), e.this.f56798b.size() - e.this.f56799c);
        }
    }

    e(Map<E, N> map, Map<E, N> map2, int i4) {
        map.getClass();
        this.f56797a = map;
        map2.getClass();
        this.f56798b = map2;
        this.f56799c = d0.b(i4);
        com.google.common.base.l0.g0(i4 <= map.size() && i4 <= map2.size());
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return d6.N(b(), a());
    }

    @Override // com.google.common.graph.u0
    public N d(E e4, boolean z4) {
        if (z4) {
            int i4 = this.f56799c - 1;
            this.f56799c = i4;
            d0.b(i4);
        }
        N remove = this.f56797a.remove(e4);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.u0
    public void e(E e4, N n4) {
        e4.getClass();
        n4.getClass();
        com.google.common.base.l0.g0(this.f56798b.put(e4, n4) == null);
    }

    @Override // com.google.common.graph.u0
    public void f(E e4, N n4, boolean z4) {
        e4.getClass();
        n4.getClass();
        if (z4) {
            int i4 = this.f56799c + 1;
            this.f56799c = i4;
            d0.d(i4);
        }
        com.google.common.base.l0.g0(this.f56797a.put(e4, n4) == null);
    }

    @Override // com.google.common.graph.u0
    public Set<E> g() {
        return new a();
    }

    @Override // com.google.common.graph.u0
    public N h(E e4) {
        N n4 = this.f56798b.get(e4);
        Objects.requireNonNull(n4);
        return n4;
    }

    @Override // com.google.common.graph.u0
    public Set<E> i() {
        return Collections.unmodifiableSet(this.f56797a.keySet());
    }

    @Override // com.google.common.graph.u0
    public N j(E e4) {
        N remove = this.f56798b.remove(e4);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.u0
    public Set<E> k() {
        return Collections.unmodifiableSet(this.f56798b.keySet());
    }
}
