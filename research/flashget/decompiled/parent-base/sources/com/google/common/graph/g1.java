package com.google.common.graph;

import com.google.common.collect.h3;
import com.google.common.collect.u4;
import com.google.common.collect.w2;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: UndirectedMultiNetworkConnections.java */
@t
/* loaded from: classes6.dex */
final class g1<N, E> extends i<N, E> {

    /* renamed from: b, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Reference<u4<N>> f56814b;

    /* compiled from: UndirectedMultiNetworkConnections.java */
    class a extends o0<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f56815d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f56815d = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g1.this.n().W2(this.f56815d);
        }
    }

    private g1(Map<E, N> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u4<N> n() {
        u4<N> u4Var = (u4) o(this.f56814b);
        if (u4Var != null) {
            return u4Var;
        }
        w2 s4 = w2.s(this.f56825a.values());
        this.f56814b = new SoftReference(s4);
        return s4;
    }

    @zc.a
    private static <T> T o(@zc.a Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> g1<N, E> p() {
        return new g1<>(new HashMap(2, 1.0f));
    }

    static <N, E> g1<N, E> q(Map<E, N> map) {
        return new g1<>(h3.i(map));
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return Collections.unmodifiableSet(n().d());
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    @zc.a
    public N d(E e4, boolean z4) {
        if (z4) {
            return null;
        }
        return j(e4);
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public void e(E e4, N n4) {
        super.e(e4, n4);
        u4 u4Var = (u4) o(this.f56814b);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.add(n4));
        }
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public void f(E e4, N n4, boolean z4) {
        if (z4) {
            return;
        }
        e(e4, n4);
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public N j(E e4) {
        N n4 = (N) super.j(e4);
        u4 u4Var = (u4) o(this.f56814b);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.remove(n4));
        }
        return n4;
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n4) {
        return new a(this.f56825a, n4, n4);
    }
}
