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

/* compiled from: DirectedMultiNetworkConnections.java */
@t
/* loaded from: classes6.dex */
final class p<N, E> extends e<N, E> {

    /* renamed from: d, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Reference<u4<N>> f56869d;

    /* renamed from: e, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient Reference<u4<N>> f56870e;

    /* compiled from: DirectedMultiNetworkConnections.java */
    class a extends o0<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f56871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f56871d = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.s().W2(this.f56871d);
        }
    }

    private p(Map<E, N> map, Map<E, N> map2, int i4) {
        super(map, map2, i4);
    }

    @zc.a
    private static <T> T o(@zc.a Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> p<N, E> p() {
        return new p<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    static <N, E> p<N, E> q(Map<E, N> map, Map<E, N> map2, int i4) {
        return new p<>(h3.i(map), h3.i(map2), i4);
    }

    private u4<N> r() {
        u4<N> u4Var = (u4) o(this.f56869d);
        if (u4Var != null) {
            return u4Var;
        }
        w2 s4 = w2.s(this.f56797a.values());
        this.f56869d = new SoftReference(s4);
        return s4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u4<N> s() {
        u4<N> u4Var = (u4) o(this.f56870e);
        if (u4Var != null) {
            return u4Var;
        }
        w2 s4 = w2.s(this.f56798b.values());
        this.f56870e = new SoftReference(s4);
        return s4;
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return Collections.unmodifiableSet(s().d());
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return Collections.unmodifiableSet(r().d());
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public N d(E e4, boolean z4) {
        N n4 = (N) super.d(e4, z4);
        u4 u4Var = (u4) o(this.f56869d);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.remove(n4));
        }
        return n4;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public void e(E e4, N n4) {
        super.e(e4, n4);
        u4 u4Var = (u4) o(this.f56870e);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.add(n4));
        }
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public void f(E e4, N n4, boolean z4) {
        super.f(e4, n4, z4);
        u4 u4Var = (u4) o(this.f56869d);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.add(n4));
        }
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public N j(E e4) {
        N n4 = (N) super.j(e4);
        u4 u4Var = (u4) o(this.f56870e);
        if (u4Var != null) {
            com.google.common.base.l0.g0(u4Var.remove(n4));
        }
        return n4;
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n4) {
        return new a(this.f56798b, n4, n4);
    }
}
