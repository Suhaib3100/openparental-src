package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.graph.e0;
import com.google.common.graph.s;

/* compiled from: GraphBuilder.java */
@d9.a
@f9.f
@t
/* loaded from: classes6.dex */
public final class a0<N> extends g<N> {
    private a0(boolean z4) {
        super(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> a0<N1> c() {
        return this;
    }

    public static a0<Object> e() {
        return new a0<>(true);
    }

    public static <N> a0<N> g(z<N> zVar) {
        a0 a0Var = new a0(zVar.e());
        a0Var.f56808b = zVar.j();
        s<N> h4 = zVar.h();
        h4.getClass();
        a0Var.f56809c = h4;
        return a0Var.i(zVar.p());
    }

    public static a0<Object> k() {
        return new a0<>(false);
    }

    public a0<N> a(boolean z4) {
        this.f56808b = z4;
        return this;
    }

    public <N1 extends N> p0<N1> b() {
        return new x0(this);
    }

    a0<N> d() {
        a0<N> a0Var = new a0<>(this.f56807a);
        a0Var.f56808b = this.f56808b;
        a0Var.f56809c = this.f56809c;
        a0Var.f56811e = this.f56811e;
        a0Var.f56810d = this.f56810d;
        return a0Var;
    }

    public a0<N> f(int i4) {
        this.f56811e = com.google.common.base.g0.f(Integer.valueOf(d0.b(i4)));
        return this;
    }

    public <N1 extends N> e0.a<N1> h() {
        return new e0.a<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <N1 extends N> a0<N1> i(s<N1> sVar) {
        com.google.common.base.l0.u(sVar.h() == s.b.UNORDERED || sVar.h() == s.b.STABLE, ProtectedSandApp.s("\uf5a5"), sVar);
        this.f56810d = sVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <N1 extends N> a0<N1> j(s<N1> sVar) {
        sVar.getClass();
        this.f56809c = sVar;
        return this;
    }
}
