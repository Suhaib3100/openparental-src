package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.c4;
import com.google.common.collect.d4;
import com.google.common.collect.p4;
import com.google.common.collect.q3;
import com.google.common.graph.d1;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: Graphs.java */
@d9.a
@t
/* loaded from: classes6.dex */
public final class d0 {

    /* compiled from: Graphs.java */
    private enum a {
        PENDING,
        COMPLETE
    }

    /* compiled from: Graphs.java */
    private static class b<N> extends w<N> {

        /* renamed from: a, reason: collision with root package name */
        private final z<N> f56775a;

        /* compiled from: Graphs.java */
        class a extends l0<N> {

            /* compiled from: Graphs.java */
            /* renamed from: com.google.common.graph.d0$b$a$a, reason: collision with other inner class name */
            class C0867a implements com.google.common.base.x<u<N>, u<N>> {
                C0867a() {
                }

                @Override // com.google.common.base.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public u<N> apply(u<N> uVar) {
                    return u.j(b.this.Q(), uVar.i(), uVar.h());
                }
            }

            a(k kVar, Object obj) {
                super(kVar, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<u<N>> iterator() {
                return d4.c0(b.this.Q().l(this.f56833b).iterator(), new C0867a());
            }
        }

        b(z<N> zVar) {
            this.f56775a = zVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.w
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public z<N> Q() {
            return this.f56775a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.w0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((b<N>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.c1
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((b<N>) obj);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public boolean d(N n4, N n5) {
            return Q().d(n5, n4);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public boolean f(u<N> uVar) {
            return Q().f(d0.q(uVar));
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public int i(N n4) {
            return Q().n(n4);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public Set<u<N>> l(N n4) {
            return new a(this, n4);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.k
        public int n(N n4) {
            return Q().i(n4);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.w0
        public Set<N> a(N n4) {
            return Q().b((z<N>) n4);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.k, com.google.common.graph.c1
        public Set<N> b(N n4) {
            return Q().a((z<N>) n4);
        }
    }

    /* compiled from: Graphs.java */
    private static class c<N, E> extends x<N, E> {

        /* renamed from: a, reason: collision with root package name */
        private final s0<N, E> f56778a;

        c(s0<N, E> s0Var) {
            this.f56778a = s0Var;
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public Set<E> D(u<N> uVar) {
            return R().D(d0.q(uVar));
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        @zc.a
        public E E(N n4, N n5) {
            return R().E(n5, n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public u<N> F(E e4) {
            u<N> F = R().F(e4);
            return u.l(this.f56778a, F.i(), F.h());
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        @zc.a
        public E I(u<N> uVar) {
            return R().I(d0.q(uVar));
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public Set<E> K(N n4) {
            return R().v(n4);
        }

        @Override // com.google.common.graph.x
        s0<N, E> R() {
            return this.f56778a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.x, com.google.common.graph.s0, com.google.common.graph.w0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((c<N, E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.x, com.google.common.graph.s0, com.google.common.graph.c1
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((c<N, E>) obj);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public boolean d(N n4, N n5) {
            return R().d(n5, n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public boolean f(u<N> uVar) {
            return R().f(d0.q(uVar));
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public int i(N n4) {
            return R().n(n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public int n(N n4) {
            return R().i(n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public Set<E> v(N n4) {
            return R().K(n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public Set<E> x(N n4, N n5) {
            return R().x(n5, n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0, com.google.common.graph.w0
        public Set<N> a(N n4) {
            return R().b((s0<N, E>) n4);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0, com.google.common.graph.c1
        public Set<N> b(N n4) {
            return R().a((s0<N, E>) n4);
        }
    }

    /* compiled from: Graphs.java */
    private static class d<N, V> extends y<N, V> {

        /* renamed from: a, reason: collision with root package name */
        private final i1<N, V> f56779a;

        d(i1<N, V> i1Var) {
            this.f56779a = i1Var;
        }

        @Override // com.google.common.graph.y
        i1<N, V> R() {
            return this.f56779a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.y, com.google.common.graph.k, com.google.common.graph.w0
        public /* bridge */ /* synthetic */ Iterable a(Object obj) {
            return a((d<N, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.y, com.google.common.graph.k, com.google.common.graph.c1
        public /* bridge */ /* synthetic */ Iterable b(Object obj) {
            return b((d<N, V>) obj);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
        public boolean d(N n4, N n5) {
            return R().d(n5, n4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
        public boolean f(u<N> uVar) {
            return R().f(d0.q(uVar));
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
        public int i(N n4) {
            return R().n(n4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.k
        public int n(N n4) {
            return R().i(n4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.i1
        @zc.a
        public V u(u<N> uVar, @zc.a V v4) {
            return R().u(d0.q(uVar), v4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.i1
        @zc.a
        public V z(N n4, N n5, @zc.a V v4) {
            return R().z(n5, n4, v4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.k, com.google.common.graph.w0
        public Set<N> a(N n4) {
            return R().b((i1<N, V>) n4);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.k, com.google.common.graph.c1
        public Set<N> b(N n4) {
            return R().a((i1<N, V>) n4);
        }
    }

    private d0() {
    }

    private static boolean a(z<?> zVar, Object obj, @zc.a Object obj2) {
        return zVar.e() || !com.google.common.base.f0.a(obj2, obj);
    }

    @f9.a
    static int b(int i4) {
        com.google.common.base.l0.k(i4 >= 0, ProtectedSandApp.s("\uf5c7"), i4);
        return i4;
    }

    @f9.a
    static long c(long j4) {
        com.google.common.base.l0.p(j4 >= 0, ProtectedSandApp.s("\uf5c7"), j4);
        return j4;
    }

    @f9.a
    static int d(int i4) {
        com.google.common.base.l0.k(i4 > 0, ProtectedSandApp.s("\uf5c8"), i4);
        return i4;
    }

    @f9.a
    static long e(long j4) {
        com.google.common.base.l0.p(j4 > 0, ProtectedSandApp.s("\uf5c8"), j4);
        return j4;
    }

    public static <N> p0<N> f(z<N> zVar) {
        a0<N> f4 = a0.g(zVar).f(zVar.m().size());
        f4.getClass();
        x0 x0Var = new x0(f4);
        Iterator<N> it = zVar.m().iterator();
        while (it.hasNext()) {
            x0Var.q(it.next());
        }
        for (u<N> uVar : zVar.c()) {
            x0Var.G(uVar.h(), uVar.i());
        }
        return x0Var;
    }

    public static <N, E> q0<N, E> g(s0<N, E> s0Var) {
        t0<N, E> g4 = t0.i(s0Var).h(s0Var.m().size()).g(s0Var.c().size());
        g4.getClass();
        y0 y0Var = new y0(g4);
        Iterator<N> it = s0Var.m().iterator();
        while (it.hasNext()) {
            y0Var.q(it.next());
        }
        for (E e4 : s0Var.c()) {
            u<N> F = s0Var.F(e4);
            y0Var.M(F.h(), F.i(), e4);
        }
        return y0Var;
    }

    public static <N, V> r0<N, V> h(i1<N, V> i1Var) {
        j1<N, V> f4 = j1.g(i1Var).f(i1Var.m().size());
        f4.getClass();
        z0 z0Var = new z0(f4);
        Iterator<N> it = i1Var.m().iterator();
        while (it.hasNext()) {
            z0Var.q(it.next());
        }
        for (u<N> uVar : i1Var.c()) {
            N h4 = uVar.h();
            N i4 = uVar.i();
            V z4 = i1Var.z(uVar.h(), uVar.i(), null);
            Objects.requireNonNull(z4);
            z0Var.L(h4, i4, z4);
        }
        return z0Var;
    }

    public static <N> boolean i(z<N> zVar) {
        int size = zVar.c().size();
        if (size == 0) {
            return false;
        }
        if (!zVar.e() && size >= zVar.m().size()) {
            return true;
        }
        HashMap a02 = p4.a0(zVar.m().size());
        Iterator<N> it = zVar.m().iterator();
        while (it.hasNext()) {
            if (o(zVar, a02, it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(s0<?, ?> s0Var) {
        if (s0Var.e() || !s0Var.y() || s0Var.c().size() <= s0Var.t().c().size()) {
            return i(s0Var.t());
        }
        return true;
    }

    public static <N> p0<N> k(z<N> zVar, Iterable<? extends N> iterable) {
        x0 x0Var;
        if (iterable instanceof Collection) {
            a0<N> f4 = a0.g(zVar).f(((Collection) iterable).size());
            f4.getClass();
            x0Var = new x0(f4);
        } else {
            a0 g4 = a0.g(zVar);
            g4.getClass();
            x0Var = new x0(g4);
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            x0Var.q(it.next());
        }
        for (N n4 : x0Var.m()) {
            for (N n5 : zVar.b((z<N>) n4)) {
                if (x0Var.m().contains(n5)) {
                    x0Var.G(n4, n5);
                }
            }
        }
        return x0Var;
    }

    public static <N, E> q0<N, E> l(s0<N, E> s0Var, Iterable<? extends N> iterable) {
        y0 y0Var;
        if (iterable instanceof Collection) {
            t0<N, E> h4 = t0.i(s0Var).h(((Collection) iterable).size());
            h4.getClass();
            y0Var = new y0(h4);
        } else {
            t0 i4 = t0.i(s0Var);
            i4.getClass();
            y0Var = new y0(i4);
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            y0Var.q(it.next());
        }
        for (E e4 : y0Var.m()) {
            for (E e5 : s0Var.v(e4)) {
                N b5 = s0Var.F(e5).b(e4);
                if (y0Var.m().contains(b5)) {
                    y0Var.M(e4, b5, e5);
                }
            }
        }
        return y0Var;
    }

    public static <N, V> r0<N, V> m(i1<N, V> i1Var, Iterable<? extends N> iterable) {
        z0 z0Var;
        if (iterable instanceof Collection) {
            j1<N, V> f4 = j1.g(i1Var).f(((Collection) iterable).size());
            f4.getClass();
            z0Var = new z0(f4);
        } else {
            j1 g4 = j1.g(i1Var);
            g4.getClass();
            z0Var = new z0(g4);
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            z0Var.q(it.next());
        }
        for (N n4 : z0Var.m()) {
            for (N n5 : i1Var.b((i1<N, V>) n4)) {
                if (z0Var.m().contains(n5)) {
                    V z4 = i1Var.z(n4, n5, null);
                    Objects.requireNonNull(z4);
                    z0Var.L(n4, n5, z4);
                }
            }
        }
        return z0Var;
    }

    public static <N> Set<N> n(z<N> zVar, N n4) {
        com.google.common.base.l0.u(zVar.m().contains(n4), ProtectedSandApp.s("\uf5c9"), n4);
        return q3.x(new d1.a(zVar, zVar).b(n4));
    }

    private static <N> boolean o(z<N> zVar, Map<Object, a> map, N n4, @zc.a N n5) {
        a aVar = map.get(n4);
        if (aVar == a.COMPLETE) {
            return false;
        }
        a aVar2 = a.PENDING;
        if (aVar == aVar2) {
            return true;
        }
        map.put(n4, aVar2);
        for (N n6 : zVar.b((z<N>) n4)) {
            if (a(zVar, n6, n5) && o(zVar, map, n6, n4)) {
                return true;
            }
        }
        map.put(n4, a.COMPLETE);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> z<N> p(z<N> zVar) {
        a0 g4 = a0.g(zVar);
        g4.f56808b = true;
        x0 x0Var = new x0(g4);
        if (zVar.e()) {
            for (N n4 : zVar.m()) {
                Iterator it = n(zVar, n4).iterator();
                while (it.hasNext()) {
                    x0Var.G(n4, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n5 : zVar.m()) {
                if (!hashSet.contains(n5)) {
                    Set n6 = n(zVar, n5);
                    hashSet.addAll(n6);
                    int i4 = 1;
                    for (Object obj : n6) {
                        int i5 = i4 + 1;
                        Iterator it2 = c4.D(n6, i4).iterator();
                        while (it2.hasNext()) {
                            x0Var.G(obj, it2.next());
                        }
                        i4 = i5;
                    }
                }
            }
        }
        return x0Var;
    }

    static <N> u<N> q(u<N> uVar) {
        return uVar.c() ? u.m(uVar.q(), uVar.p()) : uVar;
    }

    public static <N> z<N> r(z<N> zVar) {
        return !zVar.e() ? zVar : zVar instanceof b ? ((b) zVar).f56775a : new b(zVar);
    }

    public static <N, E> s0<N, E> s(s0<N, E> s0Var) {
        return !s0Var.e() ? s0Var : s0Var instanceof c ? ((c) s0Var).f56778a : new c(s0Var);
    }

    public static <N, V> i1<N, V> t(i1<N, V> i1Var) {
        return !i1Var.e() ? i1Var : i1Var instanceof d ? ((d) i1Var).f56779a : new d(i1Var);
    }
}
