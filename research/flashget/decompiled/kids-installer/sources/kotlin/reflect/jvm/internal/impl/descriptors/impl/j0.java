package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes6.dex */
public final class j0 extends p implements i0 {

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n S;

    @d5.d
    private final e1 T;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j U;

    @d5.d
    private kotlin.reflect.jvm.internal.impl.descriptors.d V;
    static final /* synthetic */ KProperty<Object>[] X = {l1.u(new g1(l1.d(j0.class), ProtectedSandApp.s("艔"), ProtectedSandApp.s("艕")))};

    @d5.d
    public static final a W = new a(null);

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final q1 c(e1 e1Var) {
            if (e1Var.D() == null) {
                return null;
            }
            return q1.f(e1Var.d0());
        }

        @d5.e
        public final i0 b(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d e1 e1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.d d6;
            List<x0> list;
            int b02;
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("䞪"));
            kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("䞫"));
            kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("䞬"));
            q1 c6 = c(e1Var);
            if (c6 == null || (d6 = dVar.d(c6)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = dVar.getAnnotations();
            b.a j5 = dVar.j();
            kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("䞭"));
            a1 k5 = e1Var.k();
            kotlin.jvm.internal.l0.o(k5, ProtectedSandApp.s("䞮"));
            j0 j0Var = new j0(nVar, e1Var, d6, null, annotations, j5, k5, null);
            List<j1> V0 = p.V0(j0Var, dVar.n(), c6);
            if (V0 == null) {
                return null;
            }
            p0 c7 = kotlin.reflect.jvm.internal.impl.types.e0.c(d6.i().X0());
            p0 E = e1Var.E();
            kotlin.jvm.internal.l0.o(E, ProtectedSandApp.s("䞯"));
            p0 j6 = t0.j(c7, E);
            x0 m02 = dVar.m0();
            x0 i5 = m02 != null ? kotlin.reflect.jvm.internal.impl.resolve.d.i(j0Var, c6.n(m02.getType(), x1.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.e D = e1Var.D();
            if (D != null) {
                List<x0> y02 = dVar.y0();
                kotlin.jvm.internal.l0.o(y02, ProtectedSandApp.s("䞰"));
                b02 = kotlin.collections.b0.b0(y02, 10);
                list = new ArrayList<>(b02);
                for (x0 x0Var : y02) {
                    kotlin.reflect.jvm.internal.impl.types.h0 n5 = c6.n(x0Var.getType(), x1.INVARIANT);
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = x0Var.getValue();
                    kotlin.jvm.internal.l0.n(value, ProtectedSandApp.s("䞱"));
                    list.add(kotlin.reflect.jvm.internal.impl.resolve.d.c(D, n5, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) value).a(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()));
                }
            } else {
                list = EmptyList.f23167o;
            }
            j0Var.Y0(i5, null, list, e1Var.G(), V0, j6, kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, e1Var.c());
            return j0Var;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    static final class b extends Lambda implements q3.a<j0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f24212q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            super(0);
            this.f24212q = dVar;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 n() {
            int b02;
            kotlin.reflect.jvm.internal.impl.storage.n o02 = j0.this.o0();
            e1 v12 = j0.this.v1();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f24212q;
            j0 j0Var = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = dVar.getAnnotations();
            b.a j5 = this.f24212q.j();
            kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("艑"));
            a1 k5 = j0.this.v1().k();
            kotlin.jvm.internal.l0.o(k5, ProtectedSandApp.s("艒"));
            j0 j0Var2 = new j0(o02, v12, dVar, j0Var, annotations, j5, k5, null);
            j0 j0Var3 = j0.this;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = this.f24212q;
            q1 c6 = j0.W.c(j0Var3.v1());
            if (c6 == null) {
                return null;
            }
            x0 m02 = dVar2.m0();
            x0 d6 = m02 != null ? m02.d(c6) : null;
            List<x0> y02 = dVar2.y0();
            kotlin.jvm.internal.l0.o(y02, ProtectedSandApp.s("艓"));
            b02 = kotlin.collections.b0.b0(y02, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = y02.iterator();
            while (it.hasNext()) {
                arrayList.add(((x0) it.next()).d(c6));
            }
            j0Var2.Y0(null, d6, arrayList, j0Var3.v1().G(), j0Var3.n(), j0Var3.i(), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, j0Var3.v1().c());
            return j0Var2;
        }
    }

    public /* synthetic */ j0(kotlin.reflect.jvm.internal.impl.storage.n nVar, e1 e1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, a1 a1Var, kotlin.jvm.internal.w wVar) {
        this(nVar, e1Var, dVar, i0Var, gVar, aVar, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean M() {
        return this.V.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e N() {
        kotlin.reflect.jvm.internal.impl.descriptors.e N = this.V.N();
        kotlin.jvm.internal.l0.o(N, ProtectedSandApp.s("艖"));
        return N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.i b() {
        return this.T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        kotlin.reflect.jvm.internal.impl.types.h0 i5 = super.i();
        kotlin.jvm.internal.l0.m(i5);
        return i5;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.storage.n o0() {
        return this.S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public i0 r0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar, @d5.d b.a aVar, boolean z5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("艗"));
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("艘"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("艙"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("艚"));
        kotlin.reflect.jvm.internal.impl.descriptors.z build = F().o(mVar).c(e0Var).n(uVar).q(aVar).i(z5).build();
        kotlin.jvm.internal.l0.n(build, ProtectedSandApp.s("艛"));
        return (i0) build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public j0 S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("艜"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("艝"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("艞"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("艟"));
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2) {
            b.a aVar3 = b.a.SYNTHESIZED;
        }
        return new j0(this.S, this.T, this.V, this, gVar, aVar2, a1Var);
    }

    @d5.d
    public e1 t1() {
        return this.T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public i0 a() {
        kotlin.reflect.jvm.internal.impl.descriptors.z a6 = super.a();
        kotlin.jvm.internal.l0.n(a6, ProtectedSandApp.s("艠"));
        return (i0) a6;
    }

    @d5.d
    public e1 v1() {
        return this.T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d w0() {
        return this.V;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.e
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public i0 d(@d5.d q1 q1Var) {
        kotlin.jvm.internal.l0.p(q1Var, ProtectedSandApp.s("艡"));
        kotlin.reflect.jvm.internal.impl.descriptors.z d6 = super.d(q1Var);
        kotlin.jvm.internal.l0.n(d6, ProtectedSandApp.s("艢"));
        j0 j0Var = (j0) d6;
        q1 f6 = q1.f(j0Var.i());
        kotlin.jvm.internal.l0.o(f6, ProtectedSandApp.s("艣"));
        kotlin.reflect.jvm.internal.impl.descriptors.d d7 = this.V.a().d(f6);
        if (d7 == null) {
            return null;
        }
        j0Var.V = d7;
        return j0Var;
    }

    private j0(kotlin.reflect.jvm.internal.impl.storage.n nVar, e1 e1Var, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, b.a aVar, a1 a1Var) {
        super(e1Var, i0Var, gVar, kotlin.reflect.jvm.internal.impl.name.h.f25614j, aVar, a1Var);
        this.S = nVar;
        this.T = e1Var;
        c1(e1Var.L0());
        this.U = nVar.f(new b(dVar));
        this.V = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        return this.T;
    }
}
