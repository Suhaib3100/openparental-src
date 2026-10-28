package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.x;
import b4.y;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.collections.q1;
import kotlin.collections.z;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: LazyJavaClassDescriptor.kt */
/* loaded from: classes6.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.c {

    @d5.d
    public static final a N = new a(null);

    @d5.d
    private static final Set<String> O;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g A;

    @d5.d
    private final Lazy B;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.f C;

    @d5.d
    private final e0 D;

    @d5.d
    private final o1 E;
    private final boolean F;

    @d5.d
    private final b G;

    @d5.d
    private final g H;

    @d5.d
    private final y0<g> I;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.f J;

    @d5.d
    private final l K;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g L;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> M;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24661x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final b4.g f24662y;

    /* renamed from: z, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f24663z;

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> f24664d;

        /* compiled from: LazyJavaClassDescriptor.kt */
        static final class a extends Lambda implements q3.a<List<? extends f1>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ f f24666p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f24666p = fVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<f1> n() {
                return g1.d(this.f24666p);
            }
        }

        public b() {
            super(f.this.A.e());
            this.f24664d = f.this.A.e().d(new a(f.this));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if ((!r0.d() && r0.i(kotlin.reflect.jvm.internal.impl.builtins.l.f24034t)) != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final kotlin.reflect.jvm.internal.impl.types.h0 x() {
            /*
                r8 = this;
                kotlin.reflect.jvm.internal.impl.name.c r0 = r8.y()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.d()
                if (r3 != 0) goto L18
                kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.builtins.l.f24034t
                boolean r3 = r0.i(r3)
                if (r3 == 0) goto L18
                r3 = r1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                kotlin.reflect.jvm.internal.impl.load.java.m r3 = kotlin.reflect.jvm.internal.impl.load.java.m.f24807a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this
                kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(r4)
                kotlin.reflect.jvm.internal.impl.name.c r3 = r3.b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this
                kotlin.reflect.jvm.internal.impl.load.java.lazy.g r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.S0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.h0 r4 = r4.d()
                z3.d r5 = z3.d.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.descriptors.e r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.v(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                kotlin.reflect.jvm.internal.impl.types.h1 r4 = r3.m()
                java.util.List r4 = r4.r()
                int r4 = r4.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.this
                kotlin.reflect.jvm.internal.impl.types.h1 r5 = r5.m()
                java.util.List r5 = r5.r()
                java.lang.String r6 = "蒃"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                kotlin.jvm.internal.l0.o(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L91
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.y.b0(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L76:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lcb
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r2
                kotlin.reflect.jvm.internal.impl.types.n1 r4 = new kotlin.reflect.jvm.internal.impl.types.n1
                kotlin.reflect.jvm.internal.impl.types.x1 r5 = kotlin.reflect.jvm.internal.impl.types.x1.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.p0 r2 = r2.E()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L76
            L91:
                if (r6 != r1) goto Ld9
                if (r4 <= r1) goto Ld9
                if (r0 != 0) goto Ld9
                kotlin.reflect.jvm.internal.impl.types.n1 r0 = new kotlin.reflect.jvm.internal.impl.types.n1
                kotlin.reflect.jvm.internal.impl.types.x1 r2 = kotlin.reflect.jvm.internal.impl.types.x1.INVARIANT
                java.lang.Object r5 = kotlin.collections.y.h5(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r5
                kotlin.reflect.jvm.internal.impl.types.p0 r5 = r5.E()
                r0.<init>(r2, r5)
                kotlin.ranges.l r2 = new kotlin.ranges.l
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.y.b0(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lba:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lca
                r4 = r2
                kotlin.collections.x0 r4 = (kotlin.collections.IntIterator) r4
                r4.nextInt()
                r1.add(r0)
                goto Lba
            Lca:
                r0 = r1
            Lcb:
                kotlin.reflect.jvm.internal.impl.types.d1$a r1 = kotlin.reflect.jvm.internal.impl.types.d1.f26381p
                r1.getClass()
                kotlin.reflect.jvm.internal.impl.types.d1 r1 = kotlin.reflect.jvm.internal.impl.types.d1.h()
                kotlin.reflect.jvm.internal.impl.types.p0 r0 = kotlin.reflect.jvm.internal.impl.types.i0.g(r1, r3, r0)
                return r0
            Ld9:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.b.x():kotlin.reflect.jvm.internal.impl.types.h0");
        }

        private final kotlin.reflect.jvm.internal.impl.name.c y() {
            Object i5;
            String b6;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = f.this.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.c cVar = b0.f24491q;
            l0.o(cVar, ProtectedSandApp.s("蒄"));
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e6 = annotations.e(cVar);
            if (e6 == null) {
                return null;
            }
            i5 = j0.i5(e6.a().values());
            v vVar = i5 instanceof v ? (v) i5 : null;
            if (vVar == null || (b6 = vVar.b()) == null || !kotlin.reflect.jvm.internal.impl.name.e.e(b6)) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.name.c(b6);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
            return f.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected Collection<h0> k() {
            List k5;
            List V5;
            int b02;
            Collection<b4.j> m5 = f.this.W0().m();
            ArrayList arrayList = new ArrayList(m5.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            h0 x5 = x();
            Iterator<b4.j> it = m5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b4.j next = it.next();
                h0 h5 = f.this.A.a().r().h(f.this.A.g().o(next, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.SUPERTYPE, false, false, null, 7, null)), f.this.A);
                if (h5.U0().b() instanceof k0.b) {
                    arrayList2.add(next);
                }
                if (!l0.g(h5.U0(), x5 != null ? x5.U0() : null) && !kotlin.reflect.jvm.internal.impl.builtins.h.b0(h5)) {
                    arrayList.add(h5);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = f.this.f24663z;
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, eVar != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.l.a(eVar, f.this).c().p(eVar.E(), x1.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, x5);
            if (!arrayList2.isEmpty()) {
                r c6 = f.this.A.a().c();
                f fVar = f.this;
                b02 = kotlin.collections.b0.b0(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(b02);
                for (x xVar : arrayList2) {
                    l0.n(xVar, ProtectedSandApp.s("蒅"));
                    arrayList3.add(((b4.j) xVar).q());
                }
                c6.b(fVar, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                V5 = j0.V5(arrayList);
                return V5;
            }
            k5 = z.k(f.this.A.d().A().i());
            return k5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected d1 p() {
            return f.this.A.a().v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<f1> r() {
            return this.f24664d.n();
        }

        @d5.d
        public String toString() {
            String h5 = f.this.getName().h();
            l0.o(h5, ProtectedSandApp.s("蒆"));
            return h5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        @d5.d
        /* renamed from: w */
        public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
            return f.this;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    static final class c extends Lambda implements q3.a<List<? extends f1>> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<f1> n() {
            int b02;
            List<y> typeParameters = f.this.W0().getTypeParameters();
            f fVar = f.this;
            b02 = kotlin.collections.b0.b0(typeParameters, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (y yVar : typeParameters) {
                f1 a6 = fVar.A.f().a(yVar);
                if (a6 == null) {
                    throw new AssertionError(ProtectedSandApp.s("蒇") + yVar + ProtectedSandApp.s("蒈") + fVar.W0() + ProtectedSandApp.s("蒉"));
                }
                arrayList.add(a6);
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t5).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t6).b());
            return l5;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    static final class e extends Lambda implements q3.a<List<? extends b4.a>> {
        e() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<b4.a> n() {
            kotlin.reflect.jvm.internal.impl.name.b k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(f.this);
            if (k5 != null) {
                return f.this.Y0().a().f().a(k5);
            }
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$f, reason: collision with other inner class name */
    static final class C0286f extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, g> {
        C0286f() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("蒊"));
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = f.this.A;
            f fVar = f.this;
            return new g(gVar2, fVar, fVar.W0(), f.this.f24663z != null, f.this.H);
        }
    }

    static {
        Set<String> u5;
        u5 = q1.u(ProtectedSandApp.s("蒋"), ProtectedSandApp.s("蒌"), ProtectedSandApp.s("蒍"), ProtectedSandApp.s("蒎"), ProtectedSandApp.s("蒏"), ProtectedSandApp.s("蒐"), ProtectedSandApp.s("蒑"));
        O = u5;
    }

    public /* synthetic */ f(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, b4.g gVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, int i5, w wVar) {
        this(gVar, mVar, gVar2, (i5 & 8) != 0 ? null : eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        return this.M.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public h1<p0> G0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean L() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    @d5.d
    public final f U0(@d5.d kotlin.reflect.jvm.internal.impl.load.java.components.g gVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("蒕"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.A;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g i5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.i(gVar2, gVar2.a().x(gVar));
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = b();
        l0.o(b6, ProtectedSandApp.s("蒖"));
        return new f(i5, b6, this.f24662y, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        return this.H.y0().n();
    }

    @d5.d
    public final b4.g W0() {
        return this.f24662y;
    }

    @d5.e
    public final List<b4.a> X0() {
        return (List) this.B.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return null;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.g Y0() {
        return this.f24661x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        return this.K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public g K0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h K0 = super.K0();
        l0.n(K0, ProtectedSandApp.s("蒗"));
        return (g) K0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public g S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("蒘"));
        return this.I.c(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e b0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public u c() {
        if (!l0.g(this.E, t.f24436a) || this.f24662y.u() != null) {
            return kotlin.reflect.jvm.internal.impl.load.java.j0.d(this.E);
        }
        u uVar = s.f24817a;
        l0.o(uVar, ProtectedSandApp.s("蒙"));
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        return this.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h1 m() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean p() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public e0 r() {
        return this.D;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蒚") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w() {
        List u5;
        if (this.D != e0.SEALED) {
            return EmptyList.f23167o;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null);
        Collection<b4.j> Q = this.f24662y.Q();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = Q.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h b7 = this.A.g().o((b4.j) it.next(), b6).U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b7 : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        u5 = j0.u5(arrayList, new d());
        return u5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        return this.F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d b4.g gVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(gVar.e(), mVar, gVar2.getName(), gVar.a().t().a(gVar2), false);
        Lazy c6;
        e0 e0Var;
        l0.p(gVar, ProtectedSandApp.s("蒒"));
        l0.p(mVar, ProtectedSandApp.s("蒓"));
        l0.p(gVar2, ProtectedSandApp.s("蒔"));
        this.f24661x = gVar;
        this.f24662y = gVar2;
        this.f24663z = eVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g d6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(gVar, this, gVar2, 0, 4, null);
        this.A = d6;
        d6.a().h().d(gVar2, this);
        gVar2.L();
        c6 = d0.c(new e());
        this.B = c6;
        this.C = gVar2.x() ? kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS : gVar2.K() ? kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE : gVar2.G() ? kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS;
        if (gVar2.x() || gVar2.G()) {
            e0Var = e0.FINAL;
        } else {
            e0Var = e0.Companion.a(gVar2.t(), gVar2.t() || gVar2.d() || gVar2.K(), !gVar2.a());
        }
        this.D = e0Var;
        this.E = gVar2.c();
        this.F = (gVar2.u() == null || gVar2.T()) ? false : true;
        this.G = new b();
        g gVar3 = new g(d6, this, gVar2, eVar != null, null, 16, null);
        this.H = gVar3;
        this.I = y0.f24456e.a(this, d6.e(), d6.a().k().c(), new C0286f());
        this.J = new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(gVar3);
        this.K = new l(d6, gVar2, this);
        this.L = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d6, gVar2);
        this.M = d6.e().d(new c());
    }
}
