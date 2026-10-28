package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.o;
import kotlin.text.v;

/* compiled from: DescriptorRendererOptionsImpl.kt */
@r1({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,136:1\n1#2:137\n51#3,3:138\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n61#1:138,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g implements f {
    static final /* synthetic */ o<Object>[] Y = {l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矍\u0001"), ProtectedSandApp.s("矎\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矏\u0001"), ProtectedSandApp.s("矐\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矑\u0001"), ProtectedSandApp.s("矒\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矓\u0001"), ProtectedSandApp.s("矔\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矕\u0001"), ProtectedSandApp.s("矖\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矗\u0001"), ProtectedSandApp.s("矘\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矙\u0001"), ProtectedSandApp.s("矚\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矛\u0001"), ProtectedSandApp.s("矜\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矝\u0001"), ProtectedSandApp.s("矞\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矟\u0001"), ProtectedSandApp.s("矠\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矡\u0001"), ProtectedSandApp.s("矢\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矣\u0001"), ProtectedSandApp.s("矤\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("知\u0001"), ProtectedSandApp.s("矦\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矧\u0001"), ProtectedSandApp.s("矨\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矩\u0001"), ProtectedSandApp.s("矪\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矫\u0001"), ProtectedSandApp.s("矬\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("短\u0001"), ProtectedSandApp.s("矮\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矯\u0001"), ProtectedSandApp.s("矰\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矱\u0001"), ProtectedSandApp.s("矲\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("石\u0001"), ProtectedSandApp.s("矴\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矵\u0001"), ProtectedSandApp.s("矶\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矷\u0001"), ProtectedSandApp.s("矸\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矹\u0001"), ProtectedSandApp.s("矺\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矻\u0001"), ProtectedSandApp.s("矼\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矽\u0001"), ProtectedSandApp.s("矾\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("矿\u0001"), ProtectedSandApp.s("砀\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("码\u0001"), ProtectedSandApp.s("砂\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砃\u0001"), ProtectedSandApp.s("砄\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砅\u0001"), ProtectedSandApp.s("砆\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砇\u0001"), ProtectedSandApp.s("砈\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砉\u0001"), ProtectedSandApp.s("砊\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砋\u0001"), ProtectedSandApp.s("砌\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砍\u0001"), ProtectedSandApp.s("砎\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砏\u0001"), ProtectedSandApp.s("砐\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砑\u0001"), ProtectedSandApp.s("砒\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砓\u0001"), ProtectedSandApp.s("研\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砕\u0001"), ProtectedSandApp.s("砖\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砗\u0001"), ProtectedSandApp.s("砘\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砙\u0001"), ProtectedSandApp.s("砚\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砛\u0001"), ProtectedSandApp.s("砜\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砝\u0001"), ProtectedSandApp.s("砞\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砟\u0001"), ProtectedSandApp.s("砠\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砡\u0001"), ProtectedSandApp.s("砢\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砣\u0001"), ProtectedSandApp.s("砤\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砥\u0001"), ProtectedSandApp.s("砦\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砧\u0001"), ProtectedSandApp.s("砨\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砩\u0001"), ProtectedSandApp.s("砪\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砫\u0001"), ProtectedSandApp.s("砬\u0001"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("砭\u0001"), ProtectedSandApp.s("砮\u0001")))};

    @fg.l
    private final kotlin.properties.f A;

    @fg.l
    private final kotlin.properties.f B;

    @fg.l
    private final kotlin.properties.f C;

    @fg.l
    private final kotlin.properties.f D;

    @fg.l
    private final kotlin.properties.f E;

    @fg.l
    private final kotlin.properties.f F;

    @fg.l
    private final kotlin.properties.f G;

    @fg.l
    private final kotlin.properties.f H;

    @fg.l
    private final kotlin.properties.f I;

    @fg.l
    private final kotlin.properties.f J;

    @fg.l
    private final kotlin.properties.f K;

    @fg.l
    private final kotlin.properties.f L;

    @fg.l
    private final kotlin.properties.f M;

    @fg.l
    private final kotlin.properties.f N;

    @fg.l
    private final kotlin.properties.f O;

    @fg.l
    private final kotlin.properties.f P;

    @fg.l
    private final kotlin.properties.f Q;

    @fg.l
    private final kotlin.properties.f R;

    @fg.l
    private final kotlin.properties.f S;

    @fg.l
    private final kotlin.properties.f T;

    @fg.l
    private final kotlin.properties.f U;

    @fg.l
    private final kotlin.properties.f V;

    @fg.l
    private final kotlin.properties.f W;

    @fg.l
    private final kotlin.properties.f X;

    /* renamed from: a, reason: collision with root package name */
    private boolean f77827a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77828b = p0(b.c.f77791a);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77829c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77830d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77831e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77832f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77833g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77834h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77835i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77836j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77837k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77838l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77839m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77840n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77841o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77842p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77843q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77844r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77845s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77846t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77847u;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77848v;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77849w;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77850x;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77851y;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private final kotlin.properties.f f77852z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class a extends n0 implements ld.l<j1, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f77853b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l j1 j1Var) {
            l0.p(j1Var, ProtectedSandApp.s("矈\u0001"));
            return ProtectedSandApp.s("矉\u0001");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    @r1({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n+ 2 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n1#1,73:1\n62#2,5:74\n*E\n"})
    public static final class b<T> extends kotlin.properties.c<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f77854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, g gVar) {
            super(obj);
            this.f77854b = gVar;
        }

        @Override // kotlin.properties.c
        protected boolean d(@fg.l o<?> oVar, T t4, T t5) {
            l0.p(oVar, ProtectedSandApp.s("矊\u0001"));
            if (this.f77854b.n0()) {
                throw new IllegalStateException(ProtectedSandApp.s("矋\u0001"));
            }
            return true;
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class c extends n0 implements ld.l<h0, h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f77855b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final h0 a(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("矌\u0001"));
            return h0Var;
        }

        @Override // ld.l
        public h0 invoke(h0 h0Var) {
            h0 h0Var2 = h0Var;
            l0.p(h0Var2, ProtectedSandApp.s("矌\u0001"));
            return h0Var2;
        }
    }

    public g() {
        Boolean bool = Boolean.TRUE;
        this.f77829c = p0(bool);
        this.f77830d = p0(bool);
        this.f77831e = p0(e.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f77832f = p0(bool2);
        this.f77833g = p0(bool2);
        this.f77834h = p0(bool2);
        this.f77835i = p0(bool2);
        this.f77836j = p0(bool2);
        this.f77837k = p0(bool);
        this.f77838l = p0(bool2);
        this.f77839m = p0(bool2);
        this.f77840n = p0(bool2);
        this.f77841o = p0(bool);
        this.f77842p = p0(bool);
        this.f77843q = p0(bool2);
        this.f77844r = p0(bool2);
        this.f77845s = p0(bool2);
        this.f77846t = p0(bool2);
        this.f77847u = p0(bool2);
        this.f77848v = p0(null);
        this.f77849w = p0(bool2);
        this.f77850x = p0(bool2);
        this.f77851y = p0(c.f77855b);
        this.f77852z = p0(a.f77853b);
        this.A = p0(bool);
        this.B = p0(j.RENDER_OPEN);
        this.C = p0(c.l.a.f77814a);
        this.D = p0(m.PLAIN);
        this.E = p0(k.ALL);
        this.F = p0(bool2);
        this.G = p0(bool2);
        this.H = p0(l.DEBUG);
        this.I = p0(bool2);
        this.J = p0(bool2);
        this.K = p0(kotlin.collections.l0.f74939b);
        this.L = p0(h.f77856a.a());
        this.M = p0(null);
        this.N = p0(kotlin.reflect.jvm.internal.impl.renderer.a.NO_ARGUMENTS);
        this.O = p0(bool2);
        this.P = p0(bool);
        this.Q = p0(bool);
        this.R = p0(bool2);
        this.S = p0(bool);
        this.T = p0(bool);
        this.U = p0(bool2);
        this.V = p0(bool2);
        this.W = p0(bool2);
        this.X = p0(bool);
    }

    private final <T> kotlin.properties.f<g, T> p0(T t4) {
        kotlin.properties.a aVar = kotlin.properties.a.f75425a;
        return new b(t4, this);
    }

    public boolean A() {
        return ((Boolean) this.J.a(this, Y[34])).booleanValue();
    }

    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.c> B() {
        return (Set) this.K.a(this, Y[35]);
    }

    public boolean C() {
        return ((Boolean) this.S.a(this, Y[43])).booleanValue();
    }

    public boolean D() {
        return f.a.a(this);
    }

    public boolean E() {
        return f.a.b(this);
    }

    public boolean F() {
        return ((Boolean) this.f77847u.a(this, Y[19])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.X.a(this, Y[48])).booleanValue();
    }

    @fg.l
    public Set<e> H() {
        return (Set) this.f77831e.a(this, Y[3]);
    }

    public boolean I() {
        return ((Boolean) this.f77840n.a(this, Y[12])).booleanValue();
    }

    @fg.l
    public j J() {
        return (j) this.B.a(this, Y[26]);
    }

    @fg.l
    public k K() {
        return (k) this.E.a(this, Y[29]);
    }

    public boolean L() {
        return ((Boolean) this.T.a(this, Y[44])).booleanValue();
    }

    public boolean M() {
        return ((Boolean) this.V.a(this, Y[46])).booleanValue();
    }

    @fg.l
    public l N() {
        return (l) this.H.a(this, Y[32]);
    }

    @fg.m
    public ld.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, String> O() {
        return (ld.l) this.f77848v.a(this, Y[20]);
    }

    public boolean P() {
        return ((Boolean) this.F.a(this, Y[30])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.G.a(this, Y[31])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f77843q.a(this, Y[15])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.P.a(this, Y[40])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.I.a(this, Y[33])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f77842p.a(this, Y[14])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f77841o.a(this, Y[13])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f77844r.a(this, Y[16])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.R.a(this, Y[42])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.Q.a(this, Y[41])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.A.a(this, Y[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(boolean z4) {
        this.f77832f.b(this, Y[4], Boolean.valueOf(z4));
    }

    public boolean a0() {
        return ((Boolean) this.f77833g.a(this, Y[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(@fg.l k kVar) {
        l0.p(kVar, ProtectedSandApp.s("砯\u0001"));
        this.E.b(this, Y[29], kVar);
    }

    public boolean b0() {
        return ((Boolean) this.f77832f.a(this, Y[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(boolean z4) {
        this.f77829c.b(this, Y[1], Boolean.valueOf(z4));
    }

    @fg.l
    public m c0() {
        return (m) this.D.a(this, Y[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean d() {
        return ((Boolean) this.f77839m.a(this, Y[11])).booleanValue();
    }

    @fg.l
    public ld.l<h0, h0> d0() {
        return (ld.l) this.f77851y.a(this, Y[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z4) {
        this.f77850x.b(this, Y[22], Boolean.valueOf(z4));
    }

    public boolean e0() {
        return ((Boolean) this.f77846t.a(this, Y[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z4) {
        this.F.b(this, Y[30], Boolean.valueOf(z4));
    }

    public boolean f0() {
        return ((Boolean) this.f77837k.a(this, Y[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("砯\u0001"));
        this.D.b(this, Y[28], mVar);
    }

    @fg.l
    public c.l g0() {
        return (c.l) this.C.a(this, Y[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(@fg.l kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("砯\u0001"));
        this.N.b(this, Y[38], aVar);
    }

    public boolean h0() {
        return ((Boolean) this.f77836j.a(this, Y[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.c> i() {
        return (Set) this.L.a(this, Y[36]);
    }

    public boolean i0() {
        return ((Boolean) this.f77829c.a(this, Y[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean j() {
        return ((Boolean) this.f77834h.a(this, Y[6])).booleanValue();
    }

    public boolean j0() {
        return ((Boolean) this.f77830d.a(this, Y[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @fg.l
    public kotlin.reflect.jvm.internal.impl.renderer.a k() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a) this.N.a(this, Y[38]);
    }

    public boolean k0() {
        return ((Boolean) this.f77838l.a(this, Y[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(@fg.l Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        l0.p(set, ProtectedSandApp.s("砯\u0001"));
        this.L.b(this, Y[36], set);
    }

    public boolean l0() {
        return ((Boolean) this.f77850x.a(this, Y[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(@fg.l Set<? extends e> set) {
        l0.p(set, ProtectedSandApp.s("砯\u0001"));
        this.f77831e.b(this, Y[3], set);
    }

    public boolean m0() {
        return ((Boolean) this.f77849w.a(this, Y[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(boolean z4) {
        this.f77836j.b(this, Y[8], Boolean.valueOf(z4));
    }

    public final boolean n0() {
        return this.f77827a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void o(@fg.l kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("砯\u0001"));
        this.f77828b.b(this, Y[0], bVar);
    }

    public final void o0() {
        this.f77827a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z4) {
        this.f77834h.b(this, Y[6], Boolean.valueOf(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void q(boolean z4) {
        this.G.b(this, Y[31], Boolean.valueOf(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void r(boolean z4) {
        this.f77849w.b(this, Y[21], Boolean.valueOf(z4));
    }

    @fg.l
    public final g s() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("砰\u0001"));
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                kotlin.properties.c cVar = obj instanceof kotlin.properties.c ? (kotlin.properties.c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    String s4 = ProtectedSandApp.s("砱\u0001");
                    l0.o(name, s4);
                    v.s2(name, ProtectedSandApp.s("砲\u0001"), false, 2, null);
                    kotlin.reflect.d d5 = l1.d(g.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("砳\u0001"));
                    String name3 = field.getName();
                    l0.o(name3, s4);
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        l0.o(substring, ProtectedSandApp.s("破\u0001"));
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(gVar, gVar.p0(cVar.a(this, new g1(d5, name2, sb.toString()))));
                }
            }
        }
        return gVar;
    }

    public boolean t() {
        return ((Boolean) this.f77845s.a(this, Y[17])).booleanValue();
    }

    public boolean u() {
        return ((Boolean) this.O.a(this, Y[39])).booleanValue();
    }

    @fg.m
    public ld.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> v() {
        return (ld.l) this.M.a(this, Y[37]);
    }

    public boolean w() {
        return ((Boolean) this.W.a(this, Y[47])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f77835i.a(this, Y[7])).booleanValue();
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.renderer.b y() {
        return (kotlin.reflect.jvm.internal.impl.renderer.b) this.f77828b.a(this, Y[0]);
    }

    @fg.m
    public ld.l<j1, String> z() {
        return (ld.l) this.f77852z.a(this, Y[24]);
    }
}
