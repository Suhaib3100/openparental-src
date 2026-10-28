package com.google.common.graph;

import com.google.common.collect.h3;
import com.google.common.collect.p4;
import com.google.common.graph.h;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableNetwork.java */
@f9.j(containerOf = {"N", "E"})
@d9.a
@t
/* loaded from: classes6.dex */
public final class i0<N, E> extends a1<N, E> {

    /* compiled from: ImmutableNetwork.java */
    public static class a<N, E> {

        /* renamed from: a, reason: collision with root package name */
        private final q0<N, E> f56826a;

        a(t0<N, E> t0Var) {
            t0Var.getClass();
            this.f56826a = new y0(t0Var);
        }

        @f9.a
        public a<N, E> a(u<N> uVar, E e4) {
            this.f56826a.A(uVar, e4);
            return this;
        }

        @f9.a
        public a<N, E> b(N n4, N n5, E e4) {
            this.f56826a.M(n4, n5, e4);
            return this;
        }

        @f9.a
        public a<N, E> c(N n4) {
            this.f56826a.q(n4);
            return this;
        }

        public i0<N, E> d() {
            return i0.c0(this.f56826a);
        }
    }

    private i0(s0<N, E> s0Var) {
        super(t0.i(s0Var), e0(s0Var), d0(s0Var));
    }

    private static <N, E> com.google.common.base.x<E, N> Y(s0<N, E> s0Var, N n4) {
        return new g0(s0Var, n4);
    }

    private static <N, E> u0<N, E> a0(s0<N, E> s0Var, N n4) {
        if (!s0Var.e()) {
            Map j4 = p4.j(s0Var.l(n4), new g0(s0Var, n4));
            return s0Var.y() ? g1.q(j4) : h1.n(j4);
        }
        Map j5 = p4.j(s0Var.K(n4), new f0(s0Var));
        Map j6 = p4.j(s0Var.v(n4), new h0(s0Var));
        int size = s0Var.x(n4, n4).size();
        return s0Var.y() ? p.q(j5, j6, size) : q.o(j5, j6, size);
    }

    @Deprecated
    public static <N, E> i0<N, E> b0(i0<N, E> i0Var) {
        i0Var.getClass();
        return i0Var;
    }

    public static <N, E> i0<N, E> c0(s0<N, E> s0Var) {
        return s0Var instanceof i0 ? (i0) s0Var : new i0<>(s0Var);
    }

    private static <N, E> Map<E, N> d0(s0<N, E> s0Var) {
        h3.b c5 = h3.c();
        for (E e4 : s0Var.c()) {
            c5.i(e4, s0Var.F(e4).h());
        }
        return c5.d();
    }

    private static <N, E> Map<N, u0<N, E>> e0(s0<N, E> s0Var) {
        h3.b c5 = h3.c();
        for (N n4 : s0Var.m()) {
            c5.i(n4, a0(s0Var, n4));
        }
        return c5.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f0(s0 s0Var, Object obj, Object obj2) {
        return s0Var.F(obj2).b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g0(s0 s0Var, Object obj) {
        return s0Var.F(obj).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h0(s0 s0Var, Object obj) {
        return s0Var.F(obj).q();
    }

    private static <N, E> com.google.common.base.x<E, N> i0(s0<N, E> s0Var) {
        return new f0(s0Var);
    }

    private static <N, E> com.google.common.base.x<E, N> j0(s0<N, E> s0Var) {
        return new h0(s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ u F(Object obj) {
        return super.F(obj);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ s H() {
        return super.H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set K(Object obj) {
        return super.K(obj);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public e0<N> t() {
        return new e0<>(new h.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a((i0<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b((i0<N, E>) obj);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ s h() {
        return super.h();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set v(Object obj) {
        return super.v(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.h, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set x(Object obj, Object obj2) {
        return super.x(obj, obj2);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }
}
