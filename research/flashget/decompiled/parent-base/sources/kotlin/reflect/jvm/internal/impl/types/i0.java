package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a1;

/* compiled from: KotlinTypeFactory.kt */
@kotlin.jvm.internal.r1({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
/* loaded from: classes7.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i0 f78477a = new i0();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> f78478b = a.f78479b;

    /* compiled from: KotlinTypeFactory.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78479b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罜\u0001"));
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final p0 f78480a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final h1 f78481b;

        public b(@fg.m p0 p0Var, @fg.m h1 h1Var) {
            this.f78480a = p0Var;
            this.f78481b = h1Var;
        }

        @fg.m
        public final p0 a() {
            return this.f78480a;
        }

        @fg.m
        public final h1 b() {
            return this.f78481b;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    @kotlin.jvm.internal.r1({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory$simpleType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1 f78482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<l1> f78483c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d1 f78484d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f78485e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h1 h1Var, List<? extends l1> list, d1 d1Var, boolean z4) {
            super(1);
            this.f78482b = h1Var;
            this.f78483c = list;
            this.f78484d = d1Var;
            this.f78485e = z4;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罝\u0001"));
            b f4 = i0.f78477a.f(this.f78482b, gVar, this.f78483c);
            if (f4 == null) {
                return null;
            }
            p0 a5 = f4.a();
            if (a5 != null) {
                return a5;
            }
            d1 d1Var = this.f78484d;
            h1 b5 = f4.b();
            kotlin.jvm.internal.l0.m(b5);
            return i0.j(d1Var, b5, this.f78483c, this.f78485e, gVar);
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    @kotlin.jvm.internal.r1({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1 f78486b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<l1> f78487c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d1 f78488d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f78489e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78490f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h1 h1Var, List<? extends l1> list, d1 d1Var, boolean z4, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            super(1);
            this.f78486b = h1Var;
            this.f78487c = list;
            this.f78488d = d1Var;
            this.f78489e = z4;
            this.f78490f = hVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罞\u0001"));
            b f4 = i0.f78477a.f(this.f78486b, gVar, this.f78487c);
            if (f4 == null) {
                return null;
            }
            p0 a5 = f4.a();
            if (a5 != null) {
                return a5;
            }
            d1 d1Var = this.f78488d;
            h1 b5 = f4.b();
            kotlin.jvm.internal.l0.m(b5);
            return i0.m(d1Var, b5, this.f78487c, this.f78489e, this.f78490f);
        }
    }

    private i0() {
    }

    @fg.l
    @kd.n
    public static final p0 b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, @fg.l List<? extends l1> list) {
        kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("罟\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        y0 y0Var = new y0(a1.a.f78341a, false);
        z0 a5 = z0.f78577e.a(null, e1Var, list);
        d1.f78389c.getClass();
        return y0Var.i(a5, d1.f78390d);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h c(h1 h1Var, List<? extends l1> list, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.f1) c5).r().q();
        }
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            if (gVar == null) {
                gVar = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(c5));
            }
            return list.isEmpty() ? kotlin.reflect.jvm.internal.impl.descriptors.impl.u.b((kotlin.reflect.jvm.internal.impl.descriptors.e) c5, gVar) : kotlin.reflect.jvm.internal.impl.descriptors.impl.u.a((kotlin.reflect.jvm.internal.impl.descriptors.e) c5, i1.f78491c.b(h1Var, list), gVar);
        }
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1) {
            kotlin.reflect.jvm.internal.impl.types.error.g gVar2 = kotlin.reflect.jvm.internal.impl.types.error.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((kotlin.reflect.jvm.internal.impl.descriptors.e1) c5).getName().toString();
            kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("罡\u0001"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.a(gVar2, true, fVar);
        }
        if (h1Var instanceof g0) {
            return ((g0) h1Var).e();
        }
        throw new IllegalStateException(ProtectedSandApp.s("罢\u0001") + c5 + ProtectedSandApp.s("罣\u0001") + h1Var);
    }

    @fg.l
    @kd.n
    public static final w1 d(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("罤\u0001"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("罥\u0001"));
        return kotlin.jvm.internal.l0.g(p0Var, p0Var2) ? p0Var : new c0(p0Var, p0Var2);
    }

    @fg.l
    @kd.n
    public static final p0 e(@fg.l d1 d1Var, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.n nVar, boolean z4) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("罧\u0001"));
        return m(d1Var, nVar, kotlin.collections.j0.f74919b, z4, kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.INTEGER_LITERAL_TYPE_SCOPE, true, ProtectedSandApp.s("罨\u0001")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b f(h1 h1Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, List<? extends l1> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.h f4;
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        if (c5 == null || (f4 = gVar.f(c5)) == null) {
            return null;
        }
        if (f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1) {
            return new b(b((kotlin.reflect.jvm.internal.impl.descriptors.e1) f4, list), null);
        }
        h1 a5 = f4.j().a(gVar);
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("罩\u0001"));
        return new b(null, a5);
    }

    @fg.l
    @kd.n
    public static final p0 g(@fg.l d1 d1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l List<? extends l1> list) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("罪\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        h1 j4 = eVar.j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("罫\u0001"));
        return l(d1Var, j4, list, false, null, 16, null);
    }

    @fg.l
    @kd.n
    public static final p0 h(@fg.l p0 p0Var, @fg.l d1 d1Var, @fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("罬\u0001"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罭\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罧\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        return l(d1Var, h1Var, list, z4, null, 16, null);
    }

    @fg.l
    @kd.j
    @kd.n
    public static final p0 i(@fg.l d1 d1Var, @fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罧\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        return l(d1Var, h1Var, list, z4, null, 16, null);
    }

    @fg.l
    @kd.j
    @kd.n
    public static final p0 j(@fg.l d1 d1Var, @fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4, @fg.m kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罧\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        if (!d1Var.isEmpty() || !list.isEmpty() || z4 || h1Var.c() == null) {
            return n(d1Var, h1Var, list, z4, f78477a.c(h1Var, list, gVar), new c(h1Var, list, d1Var, z4));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        kotlin.jvm.internal.l0.m(c5);
        p0 r4 = c5.r();
        kotlin.jvm.internal.l0.o(r4, ProtectedSandApp.s("置\u0001"));
        return r4;
    }

    public static /* synthetic */ p0 k(p0 p0Var, d1 d1Var, h1 h1Var, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            d1Var = p0Var.N0();
        }
        if ((i4 & 4) != 0) {
            h1Var = p0Var.O0();
        }
        if ((i4 & 8) != 0) {
            list = p0Var.M0();
        }
        if ((i4 & 16) != 0) {
            z4 = p0Var.P0();
        }
        return h(p0Var, d1Var, h1Var, list, z4);
    }

    public static /* synthetic */ p0 l(d1 d1Var, h1 h1Var, List list, boolean z4, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            gVar = null;
        }
        return j(d1Var, h1Var, list, z4, gVar);
    }

    @fg.l
    @kd.n
    public static final p0 m(@fg.l d1 d1Var, @fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罧\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("罯\u0001"));
        q0 q0Var = new q0(h1Var, list, z4, hVar, new d(h1Var, list, d1Var, z4, hVar));
        return d1Var.isEmpty() ? q0Var : new r0(q0Var, d1Var);
    }

    @fg.l
    @kd.n
    public static final p0 n(@fg.l d1 d1Var, @fg.l h1 h1Var, @fg.l List<? extends l1> list, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends p0> lVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("罦\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罧\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罠\u0001"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("罯\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("罰\u0001"));
        q0 q0Var = new q0(h1Var, list, z4, hVar, lVar);
        return d1Var.isEmpty() ? q0Var : new r0(q0Var, d1Var);
    }
}
