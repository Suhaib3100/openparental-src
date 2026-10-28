package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.d6;
import com.google.common.collect.p4;
import com.google.common.collect.q3;
import com.google.common.graph.a;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractNetwork.java */
@d9.a
@t
/* loaded from: classes6.dex */
public abstract class h<N, E> implements s0<N, E> {

    /* compiled from: AbstractNetwork.java */
    class a extends f<N> {

        /* compiled from: AbstractNetwork.java */
        /* renamed from: com.google.common.graph.h$a$a, reason: collision with other inner class name */
        class C0868a extends AbstractSet<u<N>> {

            /* compiled from: AbstractNetwork.java */
            /* renamed from: com.google.common.graph.h$a$a$a, reason: collision with other inner class name */
            class C0869a implements com.google.common.base.x<E, u<N>> {
                C0869a() {
                }

                @Override // com.google.common.base.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public u<N> apply(E e4) {
                    return h.this.F(e4);
                }
            }

            C0868a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@zc.a Object obj) {
                if (!(obj instanceof u)) {
                    return false;
                }
                u<?> uVar = (u) obj;
                return a.this.O(uVar) && a.this.m().contains(uVar.h()) && a.this.b((a) uVar.h()).contains(uVar.i());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<u<N>> iterator() {
                return d4.c0(h.this.c().iterator(), new C0869a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.c().size();
            }
        }

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
            return h.this.y() ? new a.C0866a() : new C0868a();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public boolean e() {
            return h.this.e();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public s<N> h() {
            return h.this.h();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public boolean j() {
            return h.this.j();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public Set<N> k(N n4) {
            return h.this.k(n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.i1
        public Set<N> m() {
            return h.this.m();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public s<N> p() {
            return s.i();
        }

        @Override // com.google.common.graph.k, com.google.common.graph.w0
        public Set<N> a(N n4) {
            return h.this.a((h) n4);
        }

        @Override // com.google.common.graph.k, com.google.common.graph.c1
        public Set<N> b(N n4) {
            return h.this.b((h) n4);
        }
    }

    /* compiled from: AbstractNetwork.java */
    class b implements com.google.common.base.m0<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f56820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f56821c;

        b(Object obj, Object obj2) {
            this.f56820b = obj;
            this.f56821c = obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.m0
        public boolean apply(E e4) {
            return h.this.F(e4).b(this.f56820b).equals(this.f56821c);
        }
    }

    /* compiled from: AbstractNetwork.java */
    class c implements com.google.common.base.x<E, u<N>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f56823b;

        c(s0 s0Var) {
            this.f56823b = s0Var;
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u<N> apply(E e4) {
            return this.f56823b.F(e4);
        }
    }

    private com.google.common.base.m0<E> N(N n4, N n5) {
        return new b(n4, n5);
    }

    private static <N, E> Map<E, u<N>> O(s0<N, E> s0Var) {
        return p4.j(s0Var.c(), new c(s0Var));
    }

    @Override // com.google.common.graph.s0
    public Set<E> D(u<N> uVar) {
        Q(uVar);
        return x(uVar.h(), uVar.i());
    }

    @Override // com.google.common.graph.s0
    @zc.a
    public E E(N n4, N n5) {
        Set<E> x4 = x(n4, n5);
        int size = x4.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return x4.iterator().next();
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf5a6"), n4, n5));
    }

    @Override // com.google.common.graph.s0
    @zc.a
    public E I(u<N> uVar) {
        Q(uVar);
        return E(uVar.h(), uVar.i());
    }

    protected final boolean P(u<?> uVar) {
        return uVar.c() || !e();
    }

    protected final void Q(u<?> uVar) {
        uVar.getClass();
        com.google.common.base.l0.e(P(uVar), ProtectedSandApp.s("\uf5a7"));
    }

    @Override // com.google.common.graph.s0
    public boolean d(N n4, N n5) {
        n4.getClass();
        n5.getClass();
        return m().contains(n4) && b((h<N, E>) n4).contains(n5);
    }

    @Override // com.google.common.graph.s0
    public final boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return e() == s0Var.e() && m().equals(s0Var.m()) && O(this).equals(O(s0Var));
    }

    @Override // com.google.common.graph.s0
    public boolean f(u<N> uVar) {
        uVar.getClass();
        if (P(uVar)) {
            return d(uVar.h(), uVar.i());
        }
        return false;
    }

    @Override // com.google.common.graph.s0
    public int g(N n4) {
        return e() ? com.google.common.math.f.t(K(n4).size(), v(n4).size()) : com.google.common.math.f.t(l(n4).size(), x(n4, n4).size());
    }

    @Override // com.google.common.graph.s0
    public final int hashCode() {
        return O(this).hashCode();
    }

    @Override // com.google.common.graph.s0
    public int i(N n4) {
        return e() ? v(n4).size() : g(n4);
    }

    @Override // com.google.common.graph.s0
    public int n(N n4) {
        return e() ? K(n4).size() : g(n4);
    }

    @Override // com.google.common.graph.s0
    public z<N> t() {
        return new a();
    }

    public String toString() {
        boolean e4 = e();
        boolean y4 = y();
        boolean j4 = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(O(this));
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 87);
        sb.append(ProtectedSandApp.s("\uf5a8"));
        sb.append(e4);
        sb.append(ProtectedSandApp.s("\uf5a9"));
        sb.append(y4);
        sb.append(ProtectedSandApp.s("\uf5aa"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf5ab"));
        sb.append(valueOf);
        return android.support.v4.media.c.a(sb, ProtectedSandApp.s("\uf5ac"), valueOf2);
    }

    @Override // com.google.common.graph.s0
    public Set<E> w(E e4) {
        u<N> F = F(e4);
        return d6.f(d6.N(l(F.h()), l(F.i())), q3.K(e4));
    }

    @Override // com.google.common.graph.s0
    public Set<E> x(N n4, N n5) {
        Set<E> v4 = v(n4);
        Set<E> K = K(n5);
        return v4.size() <= K.size() ? Collections.unmodifiableSet(d6.i(v4, new b(n4, n5))) : Collections.unmodifiableSet(d6.i(K, new b(n5, n4)));
    }
}
