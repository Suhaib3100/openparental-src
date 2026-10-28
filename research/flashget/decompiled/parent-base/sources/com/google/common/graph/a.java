package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.d6;
import com.google.common.collect.e7;
import com.google.common.collect.q3;
import com.google.common.graph.a;
import java.util.AbstractSet;
import java.util.Set;

/* compiled from: AbstractBaseGraph.java */
@t
/* loaded from: classes6.dex */
abstract class a<N> implements k<N> {

    /* compiled from: AbstractBaseGraph.java */
    /* renamed from: com.google.common.graph.a$a, reason: collision with other inner class name */
    class C0866a extends AbstractSet<u<N>> {
        C0866a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7<u<N>> iterator() {
            return v.e(a.this);
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

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.primitives.l.x(a.this.N());
        }
    }

    /* compiled from: AbstractBaseGraph.java */
    class b extends l0<N> {
        b(a aVar, k kVar, Object obj) {
            super(kVar, obj);
        }

        private /* synthetic */ u i(Object obj) {
            return u.m(obj, this.f56833b);
        }

        private /* synthetic */ u j(Object obj) {
            return u.m(this.f56833b, obj);
        }

        private /* synthetic */ u l(Object obj) {
            return u.r(this.f56833b, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e7<u<N>> iterator() {
            return this.f56834c.e() ? d4.f0(d4.j(d4.c0(this.f56834c.a((k<N>) this.f56833b).iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.b
                @Override // com.google.common.base.x
                public final Object apply(Object obj) {
                    u m4;
                    m4 = u.m(obj, a.b.this.f56833b);
                    return m4;
                }
            }), d4.c0(d6.f(this.f56834c.b((k<N>) this.f56833b), q3.K(this.f56833b)).iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.c
                @Override // com.google.common.base.x
                public final Object apply(Object obj) {
                    u m4;
                    m4 = u.m(a.b.this.f56833b, obj);
                    return m4;
                }
            }))) : d4.f0(d4.c0(this.f56834c.k(this.f56833b).iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.d
                @Override // com.google.common.base.x
                public final Object apply(Object obj) {
                    u r4;
                    r4 = u.r(a.b.this.f56833b, obj);
                    return r4;
                }
            }));
        }
    }

    a() {
    }

    protected long N() {
        long j4 = 0;
        while (m().iterator().hasNext()) {
            j4 += g(r0.next());
        }
        com.google.common.base.l0.g0((1 & j4) == 0);
        return j4 >>> 1;
    }

    protected final boolean O(u<?> uVar) {
        return uVar.c() || !e();
    }

    protected final void P(u<?> uVar) {
        uVar.getClass();
        com.google.common.base.l0.e(O(uVar), ProtectedSandApp.s("\uf5af"));
    }

    @Override // com.google.common.graph.k
    public Set<u<N>> c() {
        return new C0866a();
    }

    @Override // com.google.common.graph.k
    public boolean d(N n4, N n5) {
        n4.getClass();
        n5.getClass();
        return m().contains(n4) && b((a<N>) n4).contains(n5);
    }

    @Override // com.google.common.graph.k
    public boolean f(u<N> uVar) {
        uVar.getClass();
        if (!O(uVar)) {
            return false;
        }
        N h4 = uVar.h();
        return m().contains(h4) && b((a<N>) h4).contains(uVar.i());
    }

    @Override // com.google.common.graph.k
    public int g(N n4) {
        if (e()) {
            return com.google.common.math.f.t(a((a<N>) n4).size(), b((a<N>) n4).size());
        }
        Set<N> k4 = k(n4);
        return com.google.common.math.f.t(k4.size(), (j() && k4.contains(n4)) ? 1 : 0);
    }

    @Override // com.google.common.graph.k
    public int i(N n4) {
        return e() ? b((a<N>) n4).size() : g(n4);
    }

    @Override // com.google.common.graph.k
    public Set<u<N>> l(N n4) {
        n4.getClass();
        com.google.common.base.l0.u(m().contains(n4), ProtectedSandApp.s("\uf5b0"), n4);
        return new b(this, n4);
    }

    @Override // com.google.common.graph.k
    public int n(N n4) {
        return e() ? a((a<N>) n4).size() : g(n4);
    }

    @Override // com.google.common.graph.k
    public s<N> p() {
        return s.i();
    }
}
