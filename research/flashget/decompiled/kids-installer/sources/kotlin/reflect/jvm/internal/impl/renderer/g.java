package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.x0;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.text.e0;

/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes5.dex */
public final class g implements f {
    static final /* synthetic */ KProperty<Object>[] X = {l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傭"), ProtectedSandApp.s("傮"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傯"), ProtectedSandApp.s("傰"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傱"), ProtectedSandApp.s("傲"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傳"), ProtectedSandApp.s("傴"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("債"), ProtectedSandApp.s("傶"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傷"), ProtectedSandApp.s("傸"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傹"), ProtectedSandApp.s("傺"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傻"), ProtectedSandApp.s("傼"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傽"), ProtectedSandApp.s("傾"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("傿"), ProtectedSandApp.s("僀"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僁"), ProtectedSandApp.s("僂"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僃"), ProtectedSandApp.s("僄"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僅"), ProtectedSandApp.s("僆"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僇"), ProtectedSandApp.s("僈"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僉"), ProtectedSandApp.s("僊"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僋"), ProtectedSandApp.s("僌"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("働"), ProtectedSandApp.s("僎"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("像"), ProtectedSandApp.s("僐"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僑"), ProtectedSandApp.s("僒"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僓"), ProtectedSandApp.s("僔"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僕"), ProtectedSandApp.s("僖"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僗"), ProtectedSandApp.s("僘"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僙"), ProtectedSandApp.s("僚"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僛"), ProtectedSandApp.s("僜"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僝"), ProtectedSandApp.s("僞"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僟"), ProtectedSandApp.s("僠"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僡"), ProtectedSandApp.s("僢"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僣"), ProtectedSandApp.s("僤"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僥"), ProtectedSandApp.s("僦"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僧"), ProtectedSandApp.s("僨"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僩"), ProtectedSandApp.s("僪"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僫"), ProtectedSandApp.s("僬"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僭"), ProtectedSandApp.s("僮"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僯"), ProtectedSandApp.s("僰"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僱"), ProtectedSandApp.s("僲"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僳"), ProtectedSandApp.s("僴"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僵"), ProtectedSandApp.s("僶"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僷"), ProtectedSandApp.s("僸"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("價"), ProtectedSandApp.s("僺"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僻"), ProtectedSandApp.s("僼"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僽"), ProtectedSandApp.s("僾"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("僿"), ProtectedSandApp.s("儀"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儁"), ProtectedSandApp.s("儂"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儃"), ProtectedSandApp.s("億"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儅"), ProtectedSandApp.s("儆"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儇"), ProtectedSandApp.s("儈"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儉"), ProtectedSandApp.s("儊"))), l1.k(new x0(l1.d(g.class), ProtectedSandApp.s("儋"), ProtectedSandApp.s("儌")))};

    @d5.d
    private final ReadWriteProperty A;

    @d5.d
    private final ReadWriteProperty B;

    @d5.d
    private final ReadWriteProperty C;

    @d5.d
    private final ReadWriteProperty D;

    @d5.d
    private final ReadWriteProperty E;

    @d5.d
    private final ReadWriteProperty F;

    @d5.d
    private final ReadWriteProperty G;

    @d5.d
    private final ReadWriteProperty H;

    @d5.d
    private final ReadWriteProperty I;

    @d5.d
    private final ReadWriteProperty J;

    @d5.d
    private final ReadWriteProperty K;

    @d5.d
    private final ReadWriteProperty L;

    @d5.d
    private final ReadWriteProperty M;

    @d5.d
    private final ReadWriteProperty N;

    @d5.d
    private final ReadWriteProperty O;

    @d5.d
    private final ReadWriteProperty P;

    @d5.d
    private final ReadWriteProperty Q;

    @d5.d
    private final ReadWriteProperty R;

    @d5.d
    private final ReadWriteProperty S;

    @d5.d
    private final ReadWriteProperty T;

    @d5.d
    private final ReadWriteProperty U;

    @d5.d
    private final ReadWriteProperty V;

    @d5.d
    private final ReadWriteProperty W;

    /* renamed from: a, reason: collision with root package name */
    private boolean f25846a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25847b = o0(b.c.f25809a);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25848c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25849d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25850e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25851f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25852g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25853h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25854i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25855j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25856k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25857l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25858m;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25859n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25860o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25861p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25862q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25863r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25864s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25865t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25866u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25867v;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25868w;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25869x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25870y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final ReadWriteProperty f25871z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<j1, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f25872p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d j1 j1Var) {
            l0.p(j1Var, ProtectedSandApp.s("虀"));
            return ProtectedSandApp.s("虁");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    /* loaded from: classes6.dex */
    public static final class b<T> extends ObservableProperty<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f25873b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, g gVar) {
            super(obj);
            this.f25873b = gVar;
        }

        @Override // kotlin.properties.ObservableProperty
        protected boolean d(@d5.d KProperty<?> kProperty, T t5, T t6) {
            l0.p(kProperty, ProtectedSandApp.s("虂"));
            if (this.f25873b.m0()) {
                throw new IllegalStateException(ProtectedSandApp.s("虃"));
            }
            return true;
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<h0, h0> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f25874p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        public h0 N(h0 h0Var) {
            h0 h0Var2 = h0Var;
            l0.p(h0Var2, ProtectedSandApp.s("虄"));
            return h0Var2;
        }

        @d5.d
        public final h0 a(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("虅"));
            return h0Var;
        }
    }

    public g() {
        Boolean bool = Boolean.TRUE;
        this.f25848c = o0(bool);
        this.f25849d = o0(bool);
        this.f25850e = o0(e.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f25851f = o0(bool2);
        this.f25852g = o0(bool2);
        this.f25853h = o0(bool2);
        this.f25854i = o0(bool2);
        this.f25855j = o0(bool2);
        this.f25856k = o0(bool);
        this.f25857l = o0(bool2);
        this.f25858m = o0(bool2);
        this.f25859n = o0(bool2);
        this.f25860o = o0(bool);
        this.f25861p = o0(bool);
        this.f25862q = o0(bool2);
        this.f25863r = o0(bool2);
        this.f25864s = o0(bool2);
        this.f25865t = o0(bool2);
        this.f25866u = o0(bool2);
        this.f25867v = o0(bool2);
        this.f25868w = o0(bool2);
        this.f25869x = o0(c.f25874p);
        this.f25870y = o0(a.f25872p);
        this.f25871z = o0(bool);
        this.A = o0(j.RENDER_OPEN);
        this.B = o0(c.l.a.f25832a);
        this.C = o0(m.PLAIN);
        this.D = o0(k.ALL);
        this.E = o0(bool2);
        this.F = o0(bool2);
        this.G = o0(l.DEBUG);
        this.H = o0(bool2);
        this.I = o0(bool2);
        this.J = o0(EmptySet.f23181o);
        this.K = o0(h.f25875a.a());
        this.L = o0(null);
        this.M = o0(kotlin.reflect.jvm.internal.impl.renderer.a.NO_ARGUMENTS);
        this.N = o0(bool2);
        this.O = o0(bool);
        this.P = o0(bool);
        this.Q = o0(bool2);
        this.R = o0(bool);
        this.S = o0(bool);
        this.T = o0(bool2);
        this.U = o0(bool2);
        this.V = o0(bool2);
        this.W = o0(bool);
    }

    private final <T> ReadWriteProperty<g, T> o0(T t5) {
        Delegates delegates = Delegates.f23674a;
        return new b(t5, this);
    }

    public boolean A() {
        return ((Boolean) this.I.a(this, X[33])).booleanValue();
    }

    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> B() {
        return (Set) this.J.a(this, X[34]);
    }

    public boolean C() {
        return ((Boolean) this.R.a(this, X[42])).booleanValue();
    }

    public boolean D() {
        return f.a.a(this);
    }

    public boolean E() {
        return f.a.b(this);
    }

    public boolean F() {
        return ((Boolean) this.f25866u.a(this, X[19])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.W.a(this, X[47])).booleanValue();
    }

    @d5.d
    public Set<e> H() {
        return (Set) this.f25850e.a(this, X[3]);
    }

    public boolean I() {
        return ((Boolean) this.f25859n.a(this, X[12])).booleanValue();
    }

    @d5.d
    public j J() {
        return (j) this.A.a(this, X[25]);
    }

    @d5.d
    public k K() {
        return (k) this.D.a(this, X[28]);
    }

    public boolean L() {
        return ((Boolean) this.S.a(this, X[43])).booleanValue();
    }

    public boolean M() {
        return ((Boolean) this.U.a(this, X[45])).booleanValue();
    }

    @d5.d
    public l N() {
        return (l) this.G.a(this, X[31]);
    }

    public boolean O() {
        return ((Boolean) this.E.a(this, X[29])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.F.a(this, X[30])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.f25862q.a(this, X[15])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.O.a(this, X[39])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.H.a(this, X[32])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f25861p.a(this, X[14])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f25860o.a(this, X[13])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f25863r.a(this, X[16])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.Q.a(this, X[41])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.P.a(this, X[40])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f25871z.a(this, X[24])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f25852g.a(this, X[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(@d5.d Set<kotlin.reflect.jvm.internal.impl.name.c> set) {
        l0.p(set, ProtectedSandApp.s("儍"));
        this.K.b(this, X[35], set);
    }

    public boolean a0() {
        return ((Boolean) this.f25851f.a(this, X[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(boolean z5) {
        this.f25851f.b(this, X[4], Boolean.valueOf(z5));
    }

    @d5.d
    public m b0() {
        return (m) this.C.a(this, X[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(@d5.d Set<? extends e> set) {
        l0.p(set, ProtectedSandApp.s("儎"));
        this.f25850e.b(this, X[3], set);
    }

    @d5.d
    public q3.l<h0, h0> c0() {
        return (q3.l) this.f25869x.a(this, X[22]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void d(@d5.d k kVar) {
        l0.p(kVar, ProtectedSandApp.s("儏"));
        this.D.b(this, X[28], kVar);
    }

    public boolean d0() {
        return ((Boolean) this.f25865t.a(this, X[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z5) {
        this.f25848c.b(this, X[1], Boolean.valueOf(z5));
    }

    public boolean e0() {
        return ((Boolean) this.f25856k.a(this, X[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z5) {
        this.f25855j.b(this, X[8], Boolean.valueOf(z5));
    }

    @d5.d
    public c.l f0() {
        return (c.l) this.B.a(this, X[26]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean g() {
        return ((Boolean) this.f25858m.a(this, X[11])).booleanValue();
    }

    public boolean g0() {
        return ((Boolean) this.f25855j.a(this, X[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(@d5.d kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("儐"));
        this.f25847b.b(this, X[0], bVar);
    }

    public boolean h0() {
        return ((Boolean) this.f25848c.a(this, X[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void i(boolean z5) {
        this.f25868w.b(this, X[21], Boolean.valueOf(z5));
    }

    public boolean i0() {
        return ((Boolean) this.f25849d.a(this, X[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void j(boolean z5) {
        this.f25853h.b(this, X[6], Boolean.valueOf(z5));
    }

    public boolean j0() {
        return ((Boolean) this.f25857l.a(this, X[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(boolean z5) {
        this.F.b(this, X[30], Boolean.valueOf(z5));
    }

    public boolean k0() {
        return ((Boolean) this.f25868w.a(this, X[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(boolean z5) {
        this.E.b(this, X[29], Boolean.valueOf(z5));
    }

    public boolean l0() {
        return ((Boolean) this.f25867v.a(this, X[20])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("儑"));
        this.C.b(this, X[27], mVar);
    }

    public final boolean m0() {
        return this.f25846a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(@d5.d kotlin.reflect.jvm.internal.impl.renderer.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("儒"));
        this.M.b(this, X[37], aVar);
    }

    public final void n0() {
        this.f25846a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.c> o() {
        return (Set) this.K.a(this, X[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean p() {
        return ((Boolean) this.f25853h.a(this, X[6])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    @d5.d
    public kotlin.reflect.jvm.internal.impl.renderer.a q() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a) this.M.a(this, X[37]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void r(boolean z5) {
        this.f25867v.b(this, X[20], Boolean.valueOf(z5));
    }

    @d5.d
    public final g s() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        l0.o(declaredFields, ProtectedSandApp.s("儓"));
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    String s5 = ProtectedSandApp.s("儔");
                    l0.o(name, s5);
                    e0.s2(name, ProtectedSandApp.s("儕"), false, 2, null);
                    KClass d6 = l1.d(g.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("儖"));
                    String name3 = field.getName();
                    l0.o(name3, s5);
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        l0.o(substring, ProtectedSandApp.s("儗"));
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(gVar, gVar.o0(observableProperty.a(this, new g1(d6, name2, sb.toString()))));
                }
            }
        }
        return gVar;
    }

    public boolean t() {
        return ((Boolean) this.f25864s.a(this, X[17])).booleanValue();
    }

    public boolean u() {
        return ((Boolean) this.N.a(this, X[38])).booleanValue();
    }

    @d5.e
    public q3.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> v() {
        return (q3.l) this.L.a(this, X[36]);
    }

    public boolean w() {
        return ((Boolean) this.V.a(this, X[46])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f25854i.a(this, X[7])).booleanValue();
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.renderer.b y() {
        return (kotlin.reflect.jvm.internal.impl.renderer.b) this.f25847b.a(this, X[0]);
    }

    @d5.e
    public q3.l<j1, String> z() {
        return (q3.l) this.f25870y.a(this, X[23]);
    }
}
