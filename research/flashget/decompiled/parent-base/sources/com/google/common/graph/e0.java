package com.google.common.graph;

import com.google.common.collect.h3;
import com.google.common.collect.p4;
import com.google.common.graph.c0;
import java.util.Set;

/* compiled from: ImmutableGraph.java */
@f9.j(containerOf = {"N"})
@d9.a
@t
/* loaded from: classes6.dex */
public class e0<N> extends w<N> {

    /* renamed from: a, reason: collision with root package name */
    private final k<N> f56801a;

    /* compiled from: ImmutableGraph.java */
    public static class a<N> {

        /* renamed from: a, reason: collision with root package name */
        private final p0<N> f56802a;

        a(a0<N> a0Var) {
            g i4 = a0Var.d().i(s.g());
            i4.getClass();
            this.f56802a = new x0(i4);
        }

        @f9.a
        public a<N> a(N n4) {
            this.f56802a.q(n4);
            return this;
        }

        public e0<N> b() {
            return e0.S(this.f56802a);
        }

        @f9.a
        public a<N> c(u<N> uVar) {
            this.f56802a.B(uVar);
            return this;
        }

        @f9.a
        public a<N> d(N n4, N n5) {
            this.f56802a.G(n4, n5);
            return this;
        }
    }

    e0(k<N> kVar) {
        this.f56801a = kVar;
    }

    private static <N> b0<N, c0.a> R(z<N> zVar, N n4) {
        com.google.common.base.x b5 = com.google.common.base.z.b(c0.a.EDGE_EXISTS);
        return zVar.e() ? o.y(n4, zVar.l(n4), b5) : f1.m(p4.j(zVar.k(n4), b5));
    }

    public static <N> e0<N> S(z<N> zVar) {
        return zVar instanceof e0 ? (e0) zVar : new e0<>(new b1(a0.g(zVar), U(zVar), zVar.c().size()));
    }

    @Deprecated
    public static <N> e0<N> T(e0<N> e0Var) {
        e0Var.getClass();
        return e0Var;
    }

    private static <N> h3<N, b0<N, c0.a>> U(z<N> zVar) {
        h3.b c5 = h3.c();
        for (N n4 : zVar.m()) {
            c5.i(n4, R(zVar, n4));
        }
        return c5.d();
    }

    @Override // com.google.common.graph.w
    k<N> Q() {
        return this.f56801a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((e0<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((e0<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean d(Object obj, Object obj2) {
        return super.d(obj, obj2);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean f(u uVar) {
        return super.f(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ s h() {
        return super.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
    public s<N> p() {
        return s.g();
    }
}
