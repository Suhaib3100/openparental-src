package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.a1;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final i0 f26468a = new i0();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> f26469b = a.f26470p;

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l {

        /* renamed from: p, reason: collision with root package name */
        public static final a f26470p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襐"));
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final p0 f26471a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final h1 f26472b;

        public b(@d5.e p0 p0Var, @d5.e h1 h1Var) {
            this.f26471a = p0Var;
            this.f26472b = h1Var;
        }

        @d5.e
        public final p0 a() {
            return this.f26471a;
        }

        @d5.e
        public final h1 b() {
            return this.f26472b;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ h1 f26473p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ List<l1> f26474q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ d1 f26475r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f26476s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h1 h1Var, List<? extends l1> list, d1 d1Var, boolean z5) {
            super(1);
            this.f26473p = h1Var;
            this.f26474q = list;
            this.f26475r = d1Var;
            this.f26476s = z5;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襑"));
            b f6 = i0.f26468a.f(this.f26473p, gVar, this.f26474q);
            if (f6 == null) {
                return null;
            }
            p0 a6 = f6.a();
            if (a6 != null) {
                return a6;
            }
            d1 d1Var = this.f26475r;
            h1 b6 = f6.b();
            kotlin.jvm.internal.l0.m(b6);
            return i0.j(d1Var, b6, this.f26474q, this.f26476s, gVar);
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ h1 f26477p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ List<l1> f26478q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ d1 f26479r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f26480s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.h f26481t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h1 h1Var, List<? extends l1> list, d1 d1Var, boolean z5, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            super(1);
            this.f26477p = h1Var;
            this.f26478q = list;
            this.f26479r = d1Var;
            this.f26480s = z5;
            this.f26481t = hVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襒"));
            b f6 = i0.f26468a.f(this.f26477p, gVar, this.f26478q);
            if (f6 == null) {
                return null;
            }
            p0 a6 = f6.a();
            if (a6 != null) {
                return a6;
            }
            d1 d1Var = this.f26479r;
            h1 b6 = f6.b();
            kotlin.jvm.internal.l0.m(b6);
            return i0.m(d1Var, b6, this.f26478q, this.f26480s, this.f26481t);
        }
    }

    private i0() {
    }

    @d5.d
    @p3.n
    public static final p0 b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, @d5.d List<? extends l1> list) {
        kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("圴"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("圵"));
        y0 y0Var = new y0(a1.a.f26333a, false);
        z0 a6 = z0.f26568e.a(null, e1Var, list);
        d1.f26381p.getClass();
        return y0Var.i(a6, d1.f26382q);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h c(h1 h1Var, List<? extends l1> list, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.f1) b6).E().C();
        }
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            if (gVar == null) {
                gVar = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(b6));
            }
            return list.isEmpty() ? kotlin.reflect.jvm.internal.impl.descriptors.impl.u.b((kotlin.reflect.jvm.internal.impl.descriptors.e) b6, gVar) : kotlin.reflect.jvm.internal.impl.descriptors.impl.u.a((kotlin.reflect.jvm.internal.impl.descriptors.e) b6, i1.f26482c.b(h1Var, list), gVar);
        }
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1) {
            kotlin.reflect.jvm.internal.impl.types.error.g gVar2 = kotlin.reflect.jvm.internal.impl.types.error.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((kotlin.reflect.jvm.internal.impl.descriptors.e1) b6).getName().toString();
            kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("圶"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.a(gVar2, true, fVar);
        }
        if (h1Var instanceof g0) {
            return ((g0) h1Var).f();
        }
        throw new IllegalStateException(ProtectedSandApp.s("圷") + b6 + ProtectedSandApp.s("圸") + h1Var);
    }

    @d5.d
    @p3.n
    public static final w1 d(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("圹"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("场"));
        return kotlin.jvm.internal.l0.g(p0Var, p0Var2) ? p0Var : new c0(p0Var, p0Var2);
    }

    @d5.d
    @p3.n
    public static final p0 e(@d5.d d1 d1Var, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.n nVar, boolean z5) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("圻"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("圼"));
        return m(d1Var, nVar, EmptyList.f23167o, z5, kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.INTEGER_LITERAL_TYPE_SCOPE, true, ProtectedSandApp.s("圽")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b f(h1 h1Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, List<? extends l1> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.h f6;
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        if (b6 == null || (f6 = gVar.f(b6)) == null) {
            return null;
        }
        if (f6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1) {
            return new b(b((kotlin.reflect.jvm.internal.impl.descriptors.e1) f6, list), null);
        }
        h1 a6 = f6.m().a(gVar);
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("圾"));
        return new b(null, a6);
    }

    @d5.d
    @p3.n
    public static final p0 g(@d5.d d1 d1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<? extends l1> list) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("圿"));
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("址"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坁"));
        h1 m5 = eVar.m();
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("坂"));
        return l(d1Var, m5, list, false, null, 16, null);
    }

    @d5.d
    @p3.n
    public static final p0 h(@d5.d p0 p0Var, @d5.d d1 d1Var, @d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("坃"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坄"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("坅"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坆"));
        return l(d1Var, h1Var, list, z5, null, 16, null);
    }

    @d5.d
    @p3.j
    @p3.n
    public static final p0 i(@d5.d d1 d1Var, @d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("均"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("坈"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坉"));
        return l(d1Var, h1Var, list, z5, null, 16, null);
    }

    @d5.d
    @p3.j
    @p3.n
    public static final p0 j(@d5.d d1 d1Var, @d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5, @d5.e kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坊"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("坋"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坌"));
        if (!d1Var.isEmpty() || !list.isEmpty() || z5 || h1Var.b() == null) {
            return n(d1Var, h1Var, list, z5, f26468a.c(h1Var, list, gVar), new c(h1Var, list, d1Var, z5));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        kotlin.jvm.internal.l0.m(b6);
        p0 E = b6.E();
        kotlin.jvm.internal.l0.o(E, ProtectedSandApp.s("坍"));
        return E;
    }

    public static /* synthetic */ p0 k(p0 p0Var, d1 d1Var, h1 h1Var, List list, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            d1Var = p0Var.T0();
        }
        if ((i5 & 4) != 0) {
            h1Var = p0Var.U0();
        }
        if ((i5 & 8) != 0) {
            list = p0Var.S0();
        }
        if ((i5 & 16) != 0) {
            z5 = p0Var.V0();
        }
        return h(p0Var, d1Var, h1Var, list, z5);
    }

    public static /* synthetic */ p0 l(d1 d1Var, h1 h1Var, List list, boolean z5, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            gVar = null;
        }
        return j(d1Var, h1Var, list, z5, gVar);
    }

    @d5.d
    @p3.n
    public static final p0 m(@d5.d d1 d1Var, @d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坎"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("坏"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坐"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("坑"));
        q0 q0Var = new q0(h1Var, list, z5, hVar, new d(h1Var, list, d1Var, z5, hVar));
        return d1Var.isEmpty() ? q0Var : new r0(q0Var, d1Var);
    }

    @d5.d
    @p3.n
    public static final p0 n(@d5.d d1 d1Var, @d5.d h1 h1Var, @d5.d List<? extends l1> list, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends p0> lVar) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坒"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("坓"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("坔"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("坕"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("坖"));
        q0 q0Var = new q0(h1Var, list, z5, hVar, lVar);
        return d1Var.isEmpty() ? q0Var : new r0(q0Var, d1Var);
    }
}
