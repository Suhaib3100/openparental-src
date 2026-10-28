package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.graph.m0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: StandardValueGraph.java */
@t
/* loaded from: classes6.dex */
class b1<N, V> extends j<N, V> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f56753a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f56754b;

    /* renamed from: c, reason: collision with root package name */
    private final s<N> f56755c;

    /* renamed from: d, reason: collision with root package name */
    final m0<N, b0<N, V>> f56756d;

    /* renamed from: e, reason: collision with root package name */
    long f56757e;

    /* compiled from: StandardValueGraph.java */
    class a extends l0<N> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f56758d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b1 b1Var, k kVar, Object obj, b0 b0Var) {
            super(kVar, obj);
            this.f56758d = b0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u<N>> iterator() {
            return this.f56758d.g(this.f56833b);
        }
    }

    b1(g<? super N> gVar, Map<N, b0<N, V>> map, long j4) {
        this.f56753a = gVar.f56807a;
        this.f56754b = gVar.f56808b;
        s<? super N> sVar = gVar.f56809c;
        sVar.getClass();
        this.f56755c = sVar;
        this.f56756d = map instanceof TreeMap ? new n0<>(map) : new m0<>(map);
        this.f56757e = d0.c(j4);
    }

    private final b0<N, V> R(N n4) {
        b0<N, V> f4 = this.f56756d.f(n4);
        if (f4 != null) {
            return f4;
        }
        n4.getClass();
        String valueOf = String.valueOf(n4);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf.length() + 38, ProtectedSandApp.s("\uf5b5"), valueOf, ProtectedSandApp.s("\uf5b6")));
    }

    @zc.a
    private final V T(N n4, N n5, @zc.a V v4) {
        b0<N, V> f4 = this.f56756d.f(n4);
        V d5 = f4 == null ? null : f4.d(n5);
        return d5 == null ? v4 : d5;
    }

    private final boolean U(N n4, N n5) {
        b0<N, V> f4 = this.f56756d.f(n4);
        return f4 != null && f4.a().contains(n5);
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return this.f56757e;
    }

    final boolean S(@zc.a N n4) {
        return this.f56756d.e(n4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((b1<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((b1<N, V>) obj);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public boolean d(N n4, N n5) {
        n4.getClass();
        n5.getClass();
        return U(n4, n5);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean e() {
        return this.f56753a;
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public boolean f(u<N> uVar) {
        uVar.getClass();
        return O(uVar) && U(uVar.h(), uVar.i());
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public s<N> h() {
        return this.f56755c;
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public boolean j() {
        return this.f56754b;
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> k(N n4) {
        return R(n4).c();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public Set<u<N>> l(N n4) {
        return new a(this, this, n4, R(n4));
    }

    @Override // com.google.common.graph.k, com.google.common.graph.i1
    public Set<N> m() {
        m0<N, b0<N, V>> m0Var = this.f56756d;
        m0Var.getClass();
        return new m0.a();
    }

    @Override // com.google.common.graph.i1
    @zc.a
    public V u(u<N> uVar, @zc.a V v4) {
        P(uVar);
        return T(uVar.h(), uVar.i(), v4);
    }

    @Override // com.google.common.graph.i1
    @zc.a
    public V z(N n4, N n5, @zc.a V v4) {
        n4.getClass();
        n5.getClass();
        return T(n4, n5, v4);
    }

    @Override // com.google.common.graph.k, com.google.common.graph.w0
    public Set<N> a(N n4) {
        return R(n4).b();
    }

    @Override // com.google.common.graph.k, com.google.common.graph.c1
    public Set<N> b(N n4) {
        return R(n4).a();
    }

    b1(g<? super N> gVar) {
        this(gVar, gVar.f56809c.c(gVar.f56811e.i(10).intValue()), 0L);
    }
}
