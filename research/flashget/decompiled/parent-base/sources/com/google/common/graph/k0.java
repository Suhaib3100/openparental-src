package com.google.common.graph;

import com.google.common.collect.h3;
import com.google.common.collect.p4;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableValueGraph.java */
@f9.j(containerOf = {"N", "V"})
@d9.a
@t
/* loaded from: classes6.dex */
public final class k0<N, V> extends b1<N, V> {

    /* compiled from: ImmutableValueGraph.java */
    public static class a<N, V> {

        /* renamed from: a, reason: collision with root package name */
        private final r0<N, V> f56831a;

        a(j1<N, V> j1Var) {
            g i4 = j1Var.d().i(s.g());
            i4.getClass();
            this.f56831a = new z0(i4);
        }

        @f9.a
        public a<N, V> a(N n4) {
            this.f56831a.q(n4);
            return this;
        }

        public k0<N, V> b() {
            return k0.Z(this.f56831a);
        }

        @f9.a
        public a<N, V> c(u<N> uVar, V v4) {
            this.f56831a.C(uVar, v4);
            return this;
        }

        @f9.a
        public a<N, V> d(N n4, N n5, V v4) {
            this.f56831a.L(n4, n5, v4);
            return this;
        }
    }

    private k0(i1<N, V> i1Var) {
        super(j1.g(i1Var), a0(i1Var), i1Var.c().size());
    }

    private static <N, V> b0<N, V> X(final i1<N, V> i1Var, final N n4) {
        com.google.common.base.x xVar = new com.google.common.base.x() { // from class: com.google.common.graph.j0
            @Override // com.google.common.base.x
            public final Object apply(Object obj) {
                Object b02;
                b02 = k0.b0(i1.this, n4, obj);
                return b02;
            }
        };
        return i1Var.e() ? o.y(n4, i1Var.l(n4), xVar) : f1.m(p4.j(i1Var.k(n4), xVar));
    }

    @Deprecated
    public static <N, V> k0<N, V> Y(k0<N, V> k0Var) {
        k0Var.getClass();
        return k0Var;
    }

    public static <N, V> k0<N, V> Z(i1<N, V> i1Var) {
        return i1Var instanceof k0 ? (k0) i1Var : new k0<>(i1Var);
    }

    private static <N, V> h3<N, b0<N, V>> a0(i1<N, V> i1Var) {
        h3.b c5 = h3.c();
        for (N n4 : i1Var.m()) {
            c5.i(n4, X(i1Var, n4));
        }
        return c5.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b0(i1 i1Var, Object obj, Object obj2) {
        Object z4 = i1Var.z(obj, obj2, null);
        Objects.requireNonNull(z4);
        return z4;
    }

    public e0<N> W() {
        return new e0<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((k0<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((k0<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean d(Object obj, Object obj2) {
        return super.d(obj, obj2);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean f(u uVar) {
        return super.f(uVar);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ s h() {
        return super.h();
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
    public s<N> p() {
        return s.g();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.i1
    public z t() {
        return new e0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.i1
    @zc.a
    public /* bridge */ /* synthetic */ Object u(u uVar, @zc.a Object obj) {
        return super.u(uVar, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.i1
    @zc.a
    public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, @zc.a Object obj3) {
        return super.z(obj, obj2, obj3);
    }
}
