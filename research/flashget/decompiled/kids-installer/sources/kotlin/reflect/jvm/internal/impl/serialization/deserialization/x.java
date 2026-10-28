package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final m f26262a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e f26263b;

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f26265q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f26266r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
            super(0);
            this.f26265q = oVar;
            this.f26266r = bVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            x xVar = x.this;
            a0 c6 = xVar.c(xVar.f26262a.e());
            if (c6 != null) {
                list = j0.V5(x.this.f26262a.c().d().j(c6, this.f26265q, this.f26266r));
            } else {
                list = null;
            }
            return list == null ? EmptyList.f23167o : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f26268q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ a.n f26269r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z5, a.n nVar) {
            super(0);
            this.f26268q = z5;
            this.f26269r = nVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            x xVar = x.this;
            a0 c6 = xVar.c(xVar.f26262a.e());
            if (c6 != null) {
                boolean z5 = this.f26268q;
                x xVar2 = x.this;
                a.n nVar = this.f26269r;
                list = z5 ? j0.V5(xVar2.f26262a.c().d().i(c6, nVar)) : j0.V5(xVar2.f26262a.c().d().g(c6, nVar));
            } else {
                list = null;
            }
            return list == null ? EmptyList.f23167o : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f26271q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f26272r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
            super(0);
            this.f26271q = oVar;
            this.f26272r = bVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            x xVar = x.this;
            a0 c6 = xVar.c(xVar.f26262a.e());
            if (c6 != null) {
                list = x.this.f26262a.c().d().h(c6, this.f26271q, this.f26272r);
            } else {
                list = null;
            }
            return list == null ? EmptyList.f23167o : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a.n f26274q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f26275r;

        /* compiled from: MemberDeserializer.kt */
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ x f26276p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ a.n f26277q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f26278r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
                super(0);
                this.f26276p = xVar;
                this.f26277q = nVar;
                this.f26278r = kVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n() {
                x xVar = this.f26276p;
                a0 c6 = xVar.c(xVar.f26262a.e());
                l0.m(c6);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d6 = this.f26276p.f26262a.c().d();
                a.n nVar = this.f26277q;
                h0 i5 = this.f26278r.i();
                l0.o(i5, ProtectedSandApp.s("蠣"));
                return d6.e(c6, nVar, i5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
            super(0);
            this.f26274q = nVar;
            this.f26275r = kVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n() {
            return x.this.f26262a.h().f(new a(x.this, this.f26274q, this.f26275r));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a.n f26280q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f26281r;

        /* compiled from: MemberDeserializer.kt */
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ x f26282p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ a.n f26283q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f26284r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
                super(0);
                this.f26282p = xVar;
                this.f26283q = nVar;
                this.f26284r = kVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n() {
                x xVar = this.f26282p;
                a0 c6 = xVar.c(xVar.f26262a.e());
                l0.m(c6);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d6 = this.f26282p.f26262a.c().d();
                a.n nVar = this.f26283q;
                h0 i5 = this.f26284r.i();
                l0.o(i5, ProtectedSandApp.s("蠤"));
                return d6.k(c6, nVar, i5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
            super(0);
            this.f26280q = nVar;
            this.f26281r = kVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n() {
            return x.this.f26262a.h().f(new a(x.this, this.f26280q, this.f26281r));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a0 f26286q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f26287r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f26288s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f26289t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ a.u f26290u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a0 a0Var, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, int i5, a.u uVar) {
            super(0);
            this.f26286q = a0Var;
            this.f26287r = oVar;
            this.f26288s = bVar;
            this.f26289t = i5;
            this.f26290u = uVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> V5;
            V5 = j0.V5(x.this.f26262a.c().d().b(this.f26286q, this.f26287r, this.f26288s, this.f26289t, this.f26290u));
            return V5;
        }
    }

    public x(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("呔"));
        this.f26262a = mVar;
        this.f26263b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(mVar.c().p(), mVar.c().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a0 c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            return new a0.b(((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).f(), this.f26262a.g(), this.f26262a.j(), this.f26262a.d());
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) mVar).m1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, int i5, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25435c.d(i5).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f26262a.h(), new a(oVar, bVar));
    }

    private final x0 e() {
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = this.f26262a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e6 : null;
        if (eVar != null) {
            return eVar.Q0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f(a.n nVar, boolean z5) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25435c.d(nVar.b0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f26262a.h(), new b(z5, nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f26262a.h(), new c(oVar, bVar));
    }

    private final void h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar, x0 x0Var, x0 x0Var2, List<? extends x0> list, List<? extends f1> list2, List<? extends j1> list3, h0 h0Var, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, Map<? extends a.InterfaceC0274a<?>, ?> map) {
        lVar.v1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, map);
    }

    private final int k(int i5) {
        return (i5 & 63) + ((i5 >> 8) << 6);
    }

    private final x0 n(a.q qVar, m mVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        return kotlin.reflect.jvm.internal.impl.resolve.d.b(aVar, mVar.i().q(qVar), null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b());
    }

    private final List<j1> o(List<a.u> list, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        int b02;
        List<j1> V5;
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = this.f26262a.e();
        l0.n(e6, ProtectedSandApp.s("呕"));
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) e6;
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = aVar.b();
        l0.o(b6, ProtectedSandApp.s("呖"));
        a0 c6 = c(b6);
        b02 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            a.u uVar = (a.u) obj;
            int K = uVar.Q() ? uVar.K() : 0;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b7 = (c6 == null || !w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25435c, K, ProtectedSandApp.s("呗"))) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f26262a.h(), new f(c6, oVar, bVar, i5, uVar));
            kotlin.reflect.jvm.internal.impl.name.f b8 = y.b(this.f26262a.g(), uVar.L());
            h0 q5 = this.f26262a.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, this.f26262a.j()));
            boolean a6 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.G, K, ProtectedSandApp.s("员"));
            boolean a7 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.H, K, ProtectedSandApp.s("呙"));
            boolean a8 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I, K, ProtectedSandApp.s("呚"));
            a.q t5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.t(uVar, this.f26262a.j());
            h0 q6 = t5 != null ? this.f26262a.i().q(t5) : null;
            a1 a1Var = a1.f24103a;
            l0.o(a1Var, ProtectedSandApp.s("呛"));
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(aVar, null, i5, b7, b8, q5, a6, a7, a8, q6, a1Var));
            arrayList = arrayList2;
            i5 = i6;
        }
        V5 = j0.V5(arrayList);
        return V5;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.d i(@d5.d a.d dVar, boolean z5) {
        l0.p(dVar, ProtectedSandApp.s("呜"));
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = this.f26262a.e();
        l0.n(e6, ProtectedSandApp.s("呝"));
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) e6;
        int J = dVar.J();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(eVar, null, d(dVar, J, bVar), z5, b.a.DECLARATION, dVar, this.f26262a.g(), this.f26262a.j(), this.f26262a.k(), this.f26262a.d(), null, 1024, null);
        x f6 = m.b(this.f26262a, dVar2, EmptyList.f23167o, null, null, null, null, 60, null).f();
        List<a.u> M = dVar.M();
        l0.o(M, ProtectedSandApp.s("呞"));
        dVar2.x1(f6.o(M, dVar, bVar), c0.a(b0.f26063a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d.d(dVar.J())));
        dVar2.n1(eVar.E());
        dVar2.d1(eVar.U());
        dVar2.f1(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25446n.d(dVar.J()).booleanValue());
        return dVar2;
    }

    @d5.d
    public final z0 j(@d5.d a.i iVar) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h k5;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar;
        x0 x0Var;
        Map<? extends a.InterfaceC0274a<?>, ?> z5;
        h0 q5;
        l0.p(iVar, ProtectedSandApp.s("呟"));
        int d02 = iVar.t0() ? iVar.d0() : k(iVar.f0());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d6 = d(iVar, d02, bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g(iVar) ? g(iVar, bVar) : kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        if (l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(this.f26262a.e()).c(y.b(this.f26262a.g(), iVar.e0())), d0.f26080a)) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f25466b.getClass();
            k5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f25467c;
        } else {
            k5 = this.f26262a.k();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l(this.f26262a.e(), null, d6, y.b(this.f26262a.g(), iVar.e0()), c0.b(b0.f26063a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25447o.d(d02)), iVar, this.f26262a.g(), this.f26262a.j(), k5, this.f26262a.d(), null, 1024, null);
        m mVar = this.f26262a;
        List<a.s> m02 = iVar.m0();
        l0.o(m02, ProtectedSandApp.s("呠"));
        m b6 = m.b(mVar, lVar2, m02, null, null, null, null, 60, null);
        a.q k6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(iVar, this.f26262a.j());
        if (k6 == null || (q5 = b6.i().q(k6)) == null) {
            lVar = lVar2;
            x0Var = null;
        } else {
            lVar = lVar2;
            x0Var = kotlin.reflect.jvm.internal.impl.resolve.d.i(lVar, q5, g5);
        }
        x0 x0Var2 = x0Var;
        x0 e6 = e();
        List<a.q> c6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.c(iVar, this.f26262a.j());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c6.iterator();
        while (it.hasNext()) {
            x0 n5 = n((a.q) it.next(), b6, lVar);
            if (n5 != null) {
                arrayList.add(n5);
            }
        }
        List<f1> j5 = b6.i().j();
        x f6 = b6.f();
        List<a.u> q02 = iVar.q0();
        l0.o(q02, ProtectedSandApp.s("呡"));
        List<j1> o5 = f6.o(q02, iVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION);
        h0 q6 = b6.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(iVar, this.f26262a.j()));
        b0 b0Var = b0.f26063a;
        kotlin.reflect.jvm.internal.impl.descriptors.e0 b7 = b0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25437e.d(d02));
        kotlin.reflect.jvm.internal.impl.descriptors.u a6 = c0.a(b0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d.d(d02));
        z5 = kotlin.collections.f1.z();
        lVar.v1(x0Var2, e6, arrayList, j5, o5, q6, b7, a6, z5);
        Boolean d7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25448p.d(d02);
        l0.o(d7, ProtectedSandApp.s("呢"));
        lVar.m1(d7.booleanValue());
        Boolean d8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25449q.d(d02);
        l0.o(d8, ProtectedSandApp.s("呣"));
        lVar.j1(d8.booleanValue());
        Boolean d9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25452t.d(d02);
        l0.o(d9, ProtectedSandApp.s("呤"));
        lVar.e1(d9.booleanValue());
        Boolean d10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25450r.d(d02);
        l0.o(d10, ProtectedSandApp.s("呥"));
        lVar.l1(d10.booleanValue());
        Boolean d11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25451s.d(d02);
        l0.o(d11, ProtectedSandApp.s("呦"));
        lVar.p1(d11.booleanValue());
        Boolean d12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25453u.d(d02);
        l0.o(d12, ProtectedSandApp.s("呧"));
        lVar.o1(d12.booleanValue());
        Boolean d13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25454v.d(d02);
        l0.o(d13, ProtectedSandApp.s("周"));
        lVar.d1(d13.booleanValue());
        lVar.f1(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25455w.d(d02).booleanValue());
        Pair<a.InterfaceC0274a<?>, Object> a7 = this.f26262a.c().h().a(iVar, lVar, this.f26262a.j(), b6.i());
        if (a7 != null) {
            lVar.b1(a7.e(), a7.f());
        }
        return lVar;
    }

    @d5.d
    public final u0 l(@d5.d a.n nVar) {
        a.n nVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar;
        x0 x0Var;
        int b02;
        m mVar;
        b.d<a.x> dVar;
        b.d<a.k> dVar2;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar2;
        a.n nVar3;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var2;
        boolean z5;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        x xVar;
        List<a.u> k5;
        Object h5;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d6;
        h0 q5;
        l0.p(nVar, ProtectedSandApp.s("呩"));
        int b03 = nVar.p0() ? nVar.b0() : k(nVar.e0());
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = this.f26262a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d7 = d(nVar, b03, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY);
        b0 b0Var = b0.f26063a;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k(e6, null, d7, b0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25437e.d(b03)), c0.a(b0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d.d(b03)), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25456x, b03, ProtectedSandApp.s("呪")), y.b(this.f26262a.g(), nVar.d0()), c0.b(b0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25447o.d(b03)), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B, b03, ProtectedSandApp.s("呫")), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A, b03, ProtectedSandApp.s("呬")), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D, b03, ProtectedSandApp.s("呭")), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E, b03, ProtectedSandApp.s("呮")), w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.F, b03, ProtectedSandApp.s("呯")), nVar, this.f26262a.g(), this.f26262a.j(), this.f26262a.k(), this.f26262a.d());
        m mVar2 = this.f26262a;
        List<a.s> n02 = nVar.n0();
        l0.o(n02, ProtectedSandApp.s("呰"));
        m b7 = m.b(mVar2, kVar3, n02, null, null, null, null, 60, null);
        boolean a6 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25457y, b03, ProtectedSandApp.s("呱"));
        if (a6 && kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h(nVar)) {
            nVar2 = nVar;
            b6 = g(nVar2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER);
        } else {
            nVar2 = nVar;
            b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        }
        h0 q6 = b7.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(nVar2, this.f26262a.j()));
        List<f1> j5 = b7.i().j();
        x0 e7 = e();
        a.q l5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.l(nVar2, this.f26262a.j());
        if (l5 == null || (q5 = b7.i().q(l5)) == null) {
            kVar = kVar3;
            x0Var = null;
        } else {
            kVar = kVar3;
            x0Var = kotlin.reflect.jvm.internal.impl.resolve.d.i(kVar, q5, b6);
        }
        List<a.q> d8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.d(nVar2, this.f26262a.j());
        b02 = kotlin.collections.b0.b0(d8, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = d8.iterator();
        while (it.hasNext()) {
            arrayList.add(n((a.q) it.next(), b7, kVar));
        }
        kVar.j1(q6, j5, e7, x0Var, arrayList);
        boolean a7 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25435c, b03, ProtectedSandApp.s("呲"));
        b.d<a.x> dVar3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d;
        a.x d9 = dVar3.d(b03);
        b.d<a.k> dVar4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25437e;
        int b8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b(a7, d9, dVar4.d(b03), false, false, false);
        if (a6) {
            int c02 = nVar.q0() ? nVar.c0() : b8;
            boolean a8 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J, c02, ProtectedSandApp.s("味"));
            boolean a9 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K, c02, ProtectedSandApp.s("呴"));
            boolean a10 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L, c02, ProtectedSandApp.s("呵"));
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d10 = d(nVar2, c02, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER);
            if (a8) {
                b0 b0Var2 = b0.f26063a;
                mVar = b7;
                dVar2 = dVar4;
                kVar2 = kVar;
                dVar = dVar3;
                nVar3 = nVar2;
                d6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d0(kVar, d10, b0Var2.b(dVar4.d(c02)), c0.a(b0Var2, dVar3.d(c02)), !a8, a9, a10, kVar.j(), null, a1.f24103a);
            } else {
                mVar = b7;
                dVar = dVar3;
                dVar2 = dVar4;
                kVar2 = kVar;
                nVar3 = nVar2;
                d6 = kotlin.reflect.jvm.internal.impl.resolve.d.d(kVar2, d10);
                l0.o(d6, ProtectedSandApp.s("呶"));
            }
            d6.X0(kVar2.i());
            d0Var = d6;
        } else {
            mVar = b7;
            dVar = dVar3;
            dVar2 = dVar4;
            kVar2 = kVar;
            nVar3 = nVar2;
            d0Var = null;
        }
        if (w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25458z, b03, ProtectedSandApp.s("呷"))) {
            if (nVar.x0()) {
                b8 = nVar.j0();
            }
            int i5 = b8;
            boolean a11 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J, i5, ProtectedSandApp.s("呸"));
            boolean a12 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K, i5, ProtectedSandApp.s("呹"));
            boolean a13 = w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L, i5, ProtectedSandApp.s("呺"));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d11 = d(nVar3, i5, bVar);
            if (a11) {
                b0 b0Var3 = b0.f26063a;
                z5 = true;
                d0Var2 = d0Var;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e0(kVar2, d11, b0Var3.b(dVar2.d(i5)), c0.a(b0Var3, dVar.d(i5)), !a11, a12, a13, kVar2.j(), null, a1.f24103a);
                x f6 = m.b(mVar, e0Var2, EmptyList.f23167o, null, null, null, null, 60, null).f();
                k5 = kotlin.collections.z.k(nVar.k0());
                h5 = j0.h5(f6.o(k5, nVar3, bVar));
                e0Var2.Y0((j1) h5);
                e0Var = e0Var2;
            } else {
                d0Var2 = d0Var;
                z5 = true;
                e0Var = kotlin.reflect.jvm.internal.impl.resolve.d.e(kVar2, d11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b());
                l0.o(e0Var, ProtectedSandApp.s("呻"));
            }
        } else {
            d0Var2 = d0Var;
            z5 = true;
            e0Var = null;
        }
        boolean z6 = z5;
        if (w.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C, b03, ProtectedSandApp.s("呼"))) {
            xVar = this;
            kVar2.T0(xVar.new d(nVar3, kVar2));
        } else {
            xVar = this;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m e8 = xVar.f26262a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e8 : null;
        if ((eVar != null ? eVar.j() : null) == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) {
            kVar2.T0(xVar.new e(nVar3, kVar2));
        }
        kVar2.d1(d0Var2, e0Var, new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(xVar.f(nVar3, false), kVar2), new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(xVar.f(nVar3, z6), kVar2));
        return kVar2;
    }

    @d5.d
    public final e1 m(@d5.d a.r rVar) {
        int b02;
        l0.p(rVar, ProtectedSandApp.s("命"));
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        List<a.b> Q = rVar.Q();
        l0.o(Q, ProtectedSandApp.s("呾"));
        b02 = kotlin.collections.b0.b0(Q, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (a.b bVar : Q) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.e eVar = this.f26263b;
            l0.o(bVar, ProtectedSandApp.s("呿"));
            arrayList.add(eVar.a(bVar, this.f26262a.g()));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m mVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m(this.f26262a.h(), this.f26262a.e(), aVar.a(arrayList), y.b(this.f26262a.g(), rVar.W()), c0.a(b0.f26063a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d.d(rVar.V())), rVar, this.f26262a.g(), this.f26262a.j(), this.f26262a.k(), this.f26262a.d());
        m mVar2 = this.f26262a;
        List<a.s> a02 = rVar.a0();
        l0.o(a02, ProtectedSandApp.s("咀"));
        m b6 = m.b(mVar2, mVar, a02, null, null, null, null, 60, null);
        mVar.X0(b6.i().j(), b6.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.r(rVar, this.f26262a.j()), false), b6.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.e(rVar, this.f26262a.j()), false));
        return mVar;
    }
}
