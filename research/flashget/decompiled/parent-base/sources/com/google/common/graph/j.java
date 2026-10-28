package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import com.google.common.graph.a;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: AbstractValueGraph.java */
@d9.a
@t
/* loaded from: classes6.dex */
public abstract class j<N, V> extends com.google.common.graph.a<N> implements i1<N, V> {

    /* compiled from: AbstractValueGraph.java */
    class a extends f<N> {
        a() {
        }

        @Override // com.google.common.graph.k, com.google.common.graph.w0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((a) obj);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.c1
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((a) obj);
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public Set<u<N>> c() {
            return j.this.c();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public boolean e() {
            return j.this.e();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public int g(N n4) {
            return j.this.g(n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public s<N> h() {
            return j.this.h();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public int i(N n4) {
            return j.this.i(n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public boolean j() {
            return j.this.j();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public Set<N> k(N n4) {
            return j.this.k(n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public Set<N> m() {
            return j.this.m();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public int n(N n4) {
            return j.this.n(n4);
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public s<N> p() {
            return j.this.p();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.w0
        public Set<N> a(N n4) {
            return j.this.a((j) n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.c1
        public Set<N> b(N n4) {
            return j.this.b((j) n4);
        }
    }

    /* compiled from: AbstractValueGraph.java */
    class b implements com.google.common.base.x<u<N>, V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f56828b;

        b(i1 i1Var) {
            this.f56828b = i1Var;
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public V apply(u<N> uVar) {
            V v4 = (V) this.f56828b.z(uVar.h(), uVar.i(), null);
            Objects.requireNonNull(v4);
            return v4;
        }
    }

    private static <N, V> Map<u<N>, V> Q(i1<N, V> i1Var) {
        return p4.j(i1Var.c(), new b(i1Var));
    }

    @Override // com.google.common.graph.a, com.google.common.graph.k
    public Set c() {
        return new a.C0866a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean d(Object obj, Object obj2) {
        return super.d(obj, obj2);
    }

    @Override // com.google.common.graph.i1
    public final boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return e() == i1Var.e() && m().equals(i1Var.m()) && Q(this).equals(Q(i1Var));
    }

    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean f(u uVar) {
        return super.f(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // com.google.common.graph.i1
    public final int hashCode() {
        return Q(this).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.k
    public s p() {
        return s.i();
    }

    @Override // com.google.common.graph.i1
    public z<N> t() {
        return new a();
    }

    public String toString() {
        boolean e4 = e();
        boolean j4 = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(Q(this));
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 59);
        sb.append(ProtectedSandApp.s("\uf5b1"));
        sb.append(e4);
        sb.append(ProtectedSandApp.s("\uf5b2"));
        sb.append(j4);
        return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("\uf5b3"), valueOf, ProtectedSandApp.s("\uf5b4"), valueOf2);
    }
}
