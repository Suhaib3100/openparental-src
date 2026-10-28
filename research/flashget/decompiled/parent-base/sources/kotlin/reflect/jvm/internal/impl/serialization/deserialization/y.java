package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
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
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;

/* compiled from: MemberDeserializer.kt */
@r1({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final m f78274a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e f78275b;

    /* compiled from: MemberDeserializer.kt */
    static final class a extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f78277c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f78278d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
            super(0);
            this.f78277c = oVar;
            this.f78278d = bVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            y yVar = y.this;
            b0 c5 = yVar.c(yVar.f78274a.e());
            if (c5 != null) {
                list = kotlin.collections.w.V5(y.this.f78274a.c().d().e(c5, this.f78277c, this.f78278d));
            } else {
                list = null;
            }
            return list == null ? j0.f74919b : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    static final class b extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f78280c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.n f78281d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, a.n nVar) {
            super(0);
            this.f78280c = z4;
            this.f78281d = nVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            y yVar = y.this;
            b0 c5 = yVar.c(yVar.f78274a.e());
            if (c5 != null) {
                boolean z4 = this.f78280c;
                y yVar2 = y.this;
                a.n nVar = this.f78281d;
                list = z4 ? kotlin.collections.w.V5(yVar2.f78274a.c().d().k(c5, nVar)) : kotlin.collections.w.V5(yVar2.f78274a.c().d().i(c5, nVar));
            } else {
                list = null;
            }
            return list == null ? j0.f74919b : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    static final class c extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f78283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f78284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
            super(0);
            this.f78283c = oVar;
            this.f78284d = bVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list;
            y yVar = y.this;
            b0 c5 = yVar.c(yVar.f78274a.e());
            if (c5 != null) {
                list = y.this.f78274a.c().d().j(c5, this.f78283c, this.f78284d);
            } else {
                list = null;
            }
            return list == null ? j0.f74919b : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    static final class d extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.n f78286c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f78287d;

        /* compiled from: MemberDeserializer.kt */
        static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f78288b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a.n f78289c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f78290d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
                super(0);
                this.f78288b = yVar;
                this.f78289c = nVar;
                this.f78290d = kVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                y yVar = this.f78288b;
                b0 c5 = yVar.c(yVar.f78274a.e());
                l0.m(c5);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d5 = this.f78288b.f78274a.c().d();
                a.n nVar = this.f78289c;
                kotlin.reflect.jvm.internal.impl.types.h0 returnType = this.f78290d.getReturnType();
                l0.o(returnType, ProtectedSandApp.s("粛\u0001"));
                return d5.h(c5, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
            super(0);
            this.f78286c = nVar;
            this.f78287d = kVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            return y.this.f78274a.h().i(new a(y.this, this.f78286c, this.f78287d));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    static final class e extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.n f78292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f78293d;

        /* compiled from: MemberDeserializer.kt */
        static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f78294b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a.n f78295c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k f78296d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
                super(0);
                this.f78294b = yVar;
                this.f78295c = nVar;
                this.f78296d = kVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                y yVar = this.f78294b;
                b0 c5 = yVar.c(yVar.f78274a.e());
                l0.m(c5);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d5 = this.f78294b.f78274a.c().d();
                a.n nVar = this.f78295c;
                kotlin.reflect.jvm.internal.impl.types.h0 returnType = this.f78296d.getReturnType();
                l0.o(returnType, ProtectedSandApp.s("粜\u0001"));
                return d5.f(c5, nVar, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar) {
            super(0);
            this.f78292c = nVar;
            this.f78293d = kVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            return y.this.f78274a.h().i(new a(y.this, this.f78292c, this.f78293d));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    static final class f extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f78298c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.o f78299d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.b f78300e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f78301f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a.u f78302g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b0 b0Var, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, int i4, a.u uVar) {
            super(0);
            this.f78298c = b0Var;
            this.f78299d = oVar;
            this.f78300e = bVar;
            this.f78301f = i4;
            this.f78302g = uVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            return kotlin.collections.w.V5(y.this.f78274a.c().d().a(this.f78298c, this.f78299d, this.f78300e, this.f78301f, this.f78302g));
        }
    }

    public y(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("粝\u0001"));
        this.f78274a = mVar;
        this.f78275b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(mVar.c().q(), mVar.c().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            return new b0.b(((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).g(), this.f78274a.g(), this.f78274a.j(), this.f78274a.d());
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) mVar).f1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, int i4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77413c.d(i4).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f78274a.h(), new a(oVar, bVar));
    }

    private final x0 e() {
        kotlin.reflect.jvm.internal.impl.descriptors.m e4 = this.f78274a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e4 : null;
        if (eVar != null) {
            return eVar.K0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f(a.n nVar, boolean z4) {
        return !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77413c.d(nVar.b0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f78274a.h(), new b(z4, nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f78274a.h(), new c(oVar, bVar));
    }

    private final void h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar, x0 x0Var, x0 x0Var2, List<? extends x0> list, List<? extends f1> list2, List<? extends j1> list3, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, kotlin.reflect.jvm.internal.impl.descriptors.e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, Map<? extends a.InterfaceC1077a<?>, ?> map) {
        lVar.p1(x0Var, x0Var2, list, list2, list3, h0Var, e0Var, uVar, map);
    }

    private final int k(int i4) {
        return (i4 & 63) + ((i4 >> 8) << 6);
    }

    private final x0 n(a.q qVar, m mVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, int i4) {
        return kotlin.reflect.jvm.internal.impl.resolve.e.b(aVar, mVar.i().q(qVar), null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), i4);
    }

    private final List<j1> o(List<a.u> list, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.m e4 = this.f78274a.e();
        l0.n(e4, ProtectedSandApp.s("粞\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) e4;
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = aVar.c();
        l0.o(c5, ProtectedSandApp.s("粟\u0001"));
        b0 c6 = c(c5);
        List<a.u> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            a.u uVar = (a.u) obj;
            int L = uVar.R() ? uVar.L() : 0;
            String s4 = ProtectedSandApp.s("粠\u0001");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b5 = (c6 == null || !x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77413c, L, s4)) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b() : new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o(this.f78274a.h(), new f(c6, oVar, bVar, i4, uVar));
            kotlin.reflect.jvm.internal.impl.name.f b6 = z.b(this.f78274a.g(), uVar.M());
            kotlin.reflect.jvm.internal.impl.types.h0 q4 = this.f78274a.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, this.f78274a.j()));
            boolean a5 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.H, L, s4);
            boolean a6 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I, L, s4);
            boolean a7 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J, L, s4);
            a.q t4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.t(uVar, this.f78274a.j());
            kotlin.reflect.jvm.internal.impl.types.h0 q5 = t4 != null ? this.f78274a.i().q(t4) : null;
            a1 a1Var = a1.f75900a;
            l0.o(a1Var, ProtectedSandApp.s("粡\u0001"));
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(aVar, null, i4, b5, b6, q4, a5, a6, a7, q5, a1Var));
            arrayList = arrayList2;
            i4 = i5;
        }
        return kotlin.collections.w.V5(arrayList);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.d i(@fg.l a.d dVar, boolean z4) {
        l0.p(dVar, ProtectedSandApp.s("粢\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.m e4 = this.f78274a.e();
        l0.n(e4, ProtectedSandApp.s("粣\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) e4;
        int K = dVar.K();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(eVar, null, d(dVar, K, bVar), z4, b.a.DECLARATION, dVar, this.f78274a.g(), this.f78274a.j(), this.f78274a.k(), this.f78274a.d(), null, 1024, null);
        y f4 = m.b(this.f78274a, dVar2, j0.f74919b, null, null, null, null, 60, null).f();
        List<a.u> N = dVar.N();
        l0.o(N, ProtectedSandApp.s("粤\u0001"));
        dVar2.r1(f4.o(N, dVar, bVar), d0.a(c0.f78056a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d.d(dVar.K())));
        dVar2.h1(eVar.r());
        dVar2.X0(eVar.m0());
        dVar2.Z0(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77425o.d(dVar.K()).booleanValue());
        return dVar2;
    }

    @fg.l
    public final z0 j(@fg.l a.i iVar) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h k4;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar;
        x0 x0Var;
        kotlin.reflect.jvm.internal.impl.types.h0 q4;
        l0.p(iVar, ProtectedSandApp.s("粢\u0001"));
        int d02 = iVar.u0() ? iVar.d0() : k(iVar.f0());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d5 = d(iVar, d02, bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g(iVar) ? g(iVar, bVar) : kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        if (l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(this.f78274a.e()).c(z.b(this.f78274a.g(), iVar.e0())), e0.f78191a)) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77444b.getClass();
            k4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77445c;
        } else {
            k4 = this.f78274a.k();
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l lVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l(this.f78274a.e(), null, d5, z.b(this.f78274a.g(), iVar.e0()), d0.b(c0.f78056a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77426p.d(d02)), iVar, this.f78274a.g(), this.f78274a.j(), k4, this.f78274a.d(), null, 1024, null);
        m mVar = this.f78274a;
        List<a.s> m02 = iVar.m0();
        l0.o(m02, ProtectedSandApp.s("粥\u0001"));
        m b5 = m.b(mVar, lVar2, m02, null, null, null, null, 60, null);
        a.q k5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(iVar, this.f78274a.j());
        if (k5 == null || (q4 = b5.i().q(k5)) == null) {
            lVar = lVar2;
            x0Var = null;
        } else {
            lVar = lVar2;
            x0Var = kotlin.reflect.jvm.internal.impl.resolve.e.i(lVar, q4, g4);
        }
        x0 x0Var2 = x0Var;
        x0 e4 = e();
        List<a.q> c5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.c(iVar, this.f78274a.j());
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : c5) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            x0 n4 = n((a.q) obj, b5, lVar, i4);
            if (n4 != null) {
                arrayList.add(n4);
            }
            i4 = i5;
        }
        List<f1> j4 = b5.i().j();
        y f4 = b5.f();
        List<a.u> q02 = iVar.q0();
        l0.o(q02, ProtectedSandApp.s("粤\u0001"));
        List<j1> o4 = f4.o(q02, iVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.FUNCTION);
        kotlin.reflect.jvm.internal.impl.types.h0 q5 = b5.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(iVar, this.f78274a.j()));
        c0 c0Var = c0.f78056a;
        lVar.p1(x0Var2, e4, arrayList, j4, o4, q5, c0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77415e.d(d02)), d0.a(c0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d.d(d02)), kotlin.collections.z0.z());
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77427q.d(d02);
        String s4 = ProtectedSandApp.s("粠\u0001");
        l0.o(d6, s4);
        lVar.g1(d6.booleanValue());
        Boolean d7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77428r.d(d02);
        l0.o(d7, s4);
        lVar.d1(d7.booleanValue());
        Boolean d10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77431u.d(d02);
        l0.o(d10, s4);
        lVar.Y0(d10.booleanValue());
        Boolean d11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77429s.d(d02);
        l0.o(d11, s4);
        lVar.f1(d11.booleanValue());
        Boolean d12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77430t.d(d02);
        l0.o(d12, s4);
        lVar.j1(d12.booleanValue());
        Boolean d13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77432v.d(d02);
        l0.o(d13, s4);
        lVar.i1(d13.booleanValue());
        Boolean d14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77433w.d(d02);
        l0.o(d14, s4);
        lVar.X0(d14.booleanValue());
        lVar.Z0(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77434x.d(d02).booleanValue());
        q0<a.InterfaceC1077a<?>, Object> a5 = this.f78274a.c().h().a(iVar, lVar, this.f78274a.j(), b5.i());
        if (a5 != null) {
            lVar.V0(a5.e(), a5.f());
        }
        return lVar;
    }

    @fg.l
    public final u0 l(@fg.l a.n nVar) {
        a.n nVar2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b5;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar;
        x0 x0Var;
        m mVar;
        b.d<a.k> dVar;
        b.d<a.x> dVar2;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar2;
        a.n nVar3;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var2;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        y yVar;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var3;
        kotlin.reflect.jvm.internal.impl.types.h0 q4;
        l0.p(nVar, ProtectedSandApp.s("粢\u0001"));
        int b02 = nVar.p0() ? nVar.b0() : k(nVar.e0());
        kotlin.reflect.jvm.internal.impl.descriptors.m e4 = this.f78274a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d5 = d(nVar, b02, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY);
        c0 c0Var = c0.f78056a;
        kotlin.reflect.jvm.internal.impl.descriptors.e0 b6 = c0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77415e.d(b02));
        kotlin.reflect.jvm.internal.impl.descriptors.u a5 = d0.a(c0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d.d(b02));
        b.C1156b c1156b = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77435y;
        String s4 = ProtectedSandApp.s("粠\u0001");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k(e4, null, d5, b6, a5, x.a(c1156b, b02, s4), z.b(this.f78274a.g(), nVar.d0()), d0.b(c0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77426p.d(b02)), x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C, b02, s4), x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B, b02, s4), x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E, b02, s4), x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.F, b02, s4), x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.G, b02, s4), nVar, this.f78274a.g(), this.f78274a.j(), this.f78274a.k(), this.f78274a.d());
        m mVar2 = this.f78274a;
        List<a.s> n02 = nVar.n0();
        l0.o(n02, ProtectedSandApp.s("粥\u0001"));
        m b7 = m.b(mVar2, kVar3, n02, null, null, null, null, 60, null);
        boolean a6 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77436z, b02, s4);
        if (a6 && kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h(nVar)) {
            nVar2 = nVar;
            b5 = g(nVar2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER);
        } else {
            nVar2 = nVar;
            b5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        }
        kotlin.reflect.jvm.internal.impl.types.h0 q5 = b7.i().q(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(nVar2, this.f78274a.j()));
        List<f1> j4 = b7.i().j();
        x0 e5 = e();
        a.q l4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.l(nVar2, this.f78274a.j());
        if (l4 == null || (q4 = b7.i().q(l4)) == null) {
            kVar = kVar3;
            x0Var = null;
        } else {
            kVar = kVar3;
            x0Var = kotlin.reflect.jvm.internal.impl.resolve.e.i(kVar, q4, b5);
        }
        List<a.q> d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.d(nVar2, this.f78274a.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(d6, 10));
        int i4 = 0;
        for (Object obj : d6) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            arrayList.add(n((a.q) obj, b7, kVar, i4));
            i4 = i5;
        }
        kVar.d1(q5, j4, e5, x0Var, arrayList);
        boolean a7 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77413c, b02, s4);
        b.d<a.x> dVar3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d;
        a.x d7 = dVar3.d(b02);
        b.d<a.k> dVar4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77415e;
        int b10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b(a7, d7, dVar4.d(b02), false, false, false);
        if (a6) {
            int c02 = nVar.q0() ? nVar.c0() : b10;
            boolean a8 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K, c02, s4);
            boolean a10 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L, c02, s4);
            boolean a11 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.M, c02, s4);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d10 = d(nVar2, c02, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER);
            if (a8) {
                c0 c0Var2 = c0.f78056a;
                dVar = dVar4;
                mVar = b7;
                kVar2 = kVar;
                dVar2 = dVar3;
                nVar3 = nVar2;
                d0Var3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d0(kVar, d10, c0Var2.b(dVar4.d(c02)), d0.a(c0Var2, dVar3.d(c02)), !a8, a10, a11, kVar.b(), null, a1.f75900a);
            } else {
                mVar = b7;
                dVar = dVar4;
                dVar2 = dVar3;
                kVar2 = kVar;
                nVar3 = nVar2;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d11 = kotlin.reflect.jvm.internal.impl.resolve.e.d(kVar2, d10);
                l0.m(d11);
                d0Var3 = d11;
            }
            d0Var3.R0(kVar2.getReturnType());
            d0Var = d0Var3;
        } else {
            mVar = b7;
            dVar = dVar4;
            dVar2 = dVar3;
            kVar2 = kVar;
            nVar3 = nVar2;
            d0Var = null;
        }
        if (x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A, b02, s4)) {
            if (nVar.y0()) {
                b10 = nVar.j0();
            }
            int i6 = b10;
            boolean a12 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K, i6, s4);
            boolean a13 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L, i6, s4);
            boolean a14 = x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.M, i6, s4);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d12 = d(nVar3, i6, bVar);
            if (a12) {
                c0 c0Var3 = c0.f78056a;
                d0Var2 = d0Var;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e0(kVar2, d12, c0Var3.b(dVar.d(i6)), d0.a(c0Var3, dVar2.d(i6)), !a12, a13, a14, kVar2.b(), null, a1.f75900a);
                e0Var2.S0((j1) kotlin.collections.w.h5(m.b(mVar, e0Var2, j0.f74919b, null, null, null, null, 60, null).f().o(kotlin.collections.w.k(nVar.k0()), nVar3, bVar)));
                e0Var = e0Var2;
            } else {
                d0Var2 = d0Var;
                e0Var = kotlin.reflect.jvm.internal.impl.resolve.e.e(kVar2, d12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b());
                l0.m(e0Var);
            }
        } else {
            d0Var2 = d0Var;
            e0Var = null;
        }
        if (x.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D, b02, s4)) {
            yVar = this;
            kVar2.N0(yVar.new d(nVar3, kVar2));
        } else {
            yVar = this;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = yVar.f78274a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = e6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) e6 : null;
        if ((eVar != null ? eVar.b() : null) == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) {
            kVar2.N0(yVar.new e(nVar3, kVar2));
        }
        kVar2.X0(d0Var2, e0Var, new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(yVar.f(nVar3, false), kVar2), new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(yVar.f(nVar3, true), kVar2));
        return kVar2;
    }

    @fg.l
    public final e1 m(@fg.l a.r rVar) {
        l0.p(rVar, ProtectedSandApp.s("粢\u0001"));
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2;
        List<a.b> R = rVar.R();
        l0.o(R, ProtectedSandApp.s("粦\u0001"));
        List<a.b> list = R;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
        for (a.b bVar : list) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.e eVar = this.f78275b;
            l0.m(bVar);
            arrayList.add(eVar.a(bVar, this.f78274a.g()));
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m mVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m(this.f78274a.h(), this.f78274a.e(), aVar.a(arrayList), z.b(this.f78274a.g(), rVar.X()), d0.a(c0.f78056a, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d.d(rVar.W())), rVar, this.f78274a.g(), this.f78274a.j(), this.f78274a.k(), this.f78274a.d());
        m mVar2 = this.f78274a;
        List<a.s> a02 = rVar.a0();
        l0.o(a02, ProtectedSandApp.s("粥\u0001"));
        m b5 = m.b(mVar2, mVar, a02, null, null, null, null, 60, null);
        mVar.R0(b5.i().j(), b5.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.r(rVar, this.f78274a.j()), false), b5.i().l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.e(rVar, this.f78274a.j()), false));
        return mVar;
    }
}
