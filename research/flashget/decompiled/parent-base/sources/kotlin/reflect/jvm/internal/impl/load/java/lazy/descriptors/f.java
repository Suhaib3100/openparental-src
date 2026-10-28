package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.l1;
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.j0;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import wd.x;
import wd.y;

/* compiled from: LazyJavaClassDescriptor.kt */
@r1({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1747#2,3:323\n1747#2,3:326\n1603#2,9:329\n1855#2:338\n1856#2:340\n1612#2:341\n1045#2:342\n1#3:339\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n185#1:323,3\n188#1:326,3\n200#1:329,9\n200#1:338\n200#1:340\n200#1:341\n202#1:342\n200#1:339\n*E\n"})
/* loaded from: classes7.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.c {

    @fg.l
    public static final a A = new a();

    @fg.l
    private static final Set<String> B = l1.u(ProtectedSandApp.s("煕\u0001"), ProtectedSandApp.s("煖\u0001"), ProtectedSandApp.s("煗\u0001"), ProtectedSandApp.s("煘\u0001"), ProtectedSandApp.s("煙\u0001"), ProtectedSandApp.s("煓\u0001"), ProtectedSandApp.s("煔\u0001"));

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76520k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final wd.g f76521l;

    /* renamed from: m, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f76522m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76523n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final b0 f76524o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f76525p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final e0 f76526q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private final o1 f76527r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f76528s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private final b f76529t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private final g f76530u;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private final y0<g> f76531v;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.f f76532w;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private final l f76533x;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76534y;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> f76535z;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @r1({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1549#2:323\n1620#2,3:324\n1549#2:327\n1620#2,3:328\n1549#2:331\n1620#2,3:332\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n*L\n254#1:323\n254#1:324,3\n280#1:327\n280#1:328,3\n285#1:331\n285#1:332,3\n*E\n"})
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> f76536d;

        /* compiled from: LazyJavaClassDescriptor.kt */
        static final class a extends n0 implements ld.a<List<? extends f1>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f76538b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f76538b = fVar;
            }

            @fg.l
            public final List<f1> a() {
                return g1.d(this.f76538b);
            }

            @Override // ld.a
            public List<? extends f1> invoke() {
                return g1.d(this.f76538b);
            }
        }

        public b() {
            super(f.this.f76523n.e());
            this.f76536d = f.this.f76523n.e().h(new a(f.this));
        }

        private final h0 w() {
            kotlin.reflect.jvm.internal.impl.name.c cVar;
            ArrayList arrayList;
            kotlin.reflect.jvm.internal.impl.name.c x4 = x();
            if (x4 == null || x4.d() || !x4.i(kotlin.reflect.jvm.internal.impl.builtins.l.f75835x)) {
                x4 = null;
            }
            if (x4 == null) {
                cVar = kotlin.reflect.jvm.internal.impl.load.java.m.f76682a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(f.this));
                if (cVar == null) {
                    return null;
                }
            } else {
                cVar = x4;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e w4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.w(f.this.f76523n.d(), cVar, ud.d.FROM_JAVA_LOADER);
            if (w4 == null) {
                return null;
            }
            int size = w4.j().getParameters().size();
            List<f1> parameters = f.this.j().getParameters();
            l0.o(parameters, ProtectedSandApp.s("煋\u0001"));
            int size2 = parameters.size();
            if (size2 == size) {
                List<f1> list = parameters;
                arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n1(x1.INVARIANT, ((f1) it.next()).r()));
                }
            } else {
                if (size2 != 1 || size <= 1 || x4 != null) {
                    return null;
                }
                n1 n1Var = new n1(x1.INVARIANT, ((f1) kotlin.collections.w.h5(parameters)).r());
                kotlin.ranges.l lVar = new kotlin.ranges.l(1, size, 1);
                ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(lVar, 10));
                Iterator<Integer> it2 = lVar.iterator();
                while (it2.hasNext()) {
                    ((u0) it2).c();
                    arrayList2.add(n1Var);
                }
                arrayList = arrayList2;
            }
            d1.f78389c.getClass();
            return i0.g(d1.f78390d, w4, arrayList);
        }

        private final kotlin.reflect.jvm.internal.impl.name.c x() {
            String b5;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = f.this.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.load.java.b0.f76342r;
            l0.o(cVar, ProtectedSandApp.s("煌\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k4 = annotations.k(cVar);
            if (k4 == null) {
                return null;
            }
            Object i5 = kotlin.collections.w.i5(k4.a().values());
            v vVar = i5 instanceof v ? (v) i5 : null;
            if (vVar == null || (b5 = vVar.b()) == null || !kotlin.reflect.jvm.internal.impl.name.e.e(b5)) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.name.c(b5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return f.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public List<f1> getParameters() {
            return this.f76536d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected Collection<h0> k() {
            Collection<wd.j> j4 = f.this.Q0().j();
            ArrayList arrayList = new ArrayList(j4.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            h0 w4 = w();
            Iterator<wd.j> it = j4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wd.j next = it.next();
                h0 h4 = f.this.f76523n.a().r().h(f.this.f76523n.g().o(next, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.SUPERTYPE, false, false, null, 7, null)), f.this.f76523n);
                if (h4.O0().c() instanceof k0.b) {
                    arrayList2.add(next);
                }
                if (!l0.g(h4.O0(), w4 != null ? w4.O0() : null) && !kotlin.reflect.jvm.internal.impl.builtins.h.b0(h4)) {
                    arrayList.add(h4);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = f.this.f76522m;
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, eVar != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.m.a(eVar, f.this).c().p(eVar.r(), x1.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, w4);
            if (!arrayList2.isEmpty()) {
                r c5 = f.this.f76523n.a().c();
                f fVar = f.this;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(arrayList2, 10));
                for (x xVar : arrayList2) {
                    l0.n(xVar, ProtectedSandApp.s("煍\u0001"));
                    arrayList3.add(((wd.j) xVar).G());
                }
                c5.b(fVar, arrayList3);
            }
            return !arrayList.isEmpty() ? kotlin.collections.w.V5(arrayList) : kotlin.collections.w.k(f.this.f76523n.d().p().i());
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.descriptors.d1 o() {
            return f.this.f76523n.a().v();
        }

        @fg.l
        public String toString() {
            String b5 = f.this.getName().b();
            l0.o(b5, ProtectedSandApp.s("煎\u0001"));
            return b5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        @fg.l
        /* renamed from: v */
        public kotlin.reflect.jvm.internal.impl.descriptors.e c() {
            return f.this;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @r1({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$declaredParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1549#2:323\n1620#2,3:324\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$declaredParameters$1\n*L\n151#1:323\n151#1:324,3\n*E\n"})
    static final class c extends n0 implements ld.a<List<? extends f1>> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<f1> invoke() {
            List<y> typeParameters = f.this.Q0().getTypeParameters();
            f fVar = f.this;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(typeParameters, 10));
            for (y yVar : typeParameters) {
                f1 a5 = fVar.f76523n.f().a(yVar);
                if (a5 == null) {
                    throw new AssertionError(ProtectedSandApp.s("煏\u0001") + yVar + ProtectedSandApp.s("煐\u0001") + fVar.Q0() + ProtectedSandApp.s("煑\u0001"));
                }
                arrayList.add(a5);
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n1#1,328:1\n202#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t4).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) t5).b());
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @r1({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$moduleAnnotations$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1#2:323\n*E\n"})
    static final class e extends n0 implements ld.a<List<? extends wd.a>> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<wd.a> invoke() {
            kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(f.this);
            if (k4 != null) {
                return f.this.S0().a().f().a(k4);
            }
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$f, reason: collision with other inner class name */
    static final class C1090f extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, g> {
        C1090f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("煒\u0001"));
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = f.this.f76523n;
            f fVar = f.this;
            return new g(gVar2, fVar, fVar.Q0(), f.this.f76522m != null, f.this.f76530u);
        }
    }

    public /* synthetic */ f(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, wd.g gVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, int i4, w wVar) {
        this(gVar, mVar, gVar2, (i4 & 8) != 0 ? null : eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return null;
    }

    @fg.l
    public final f O0(@fg.l kotlin.reflect.jvm.internal.impl.load.java.components.g gVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("煝\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.f76523n;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g i4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.i(gVar2, gVar2.a().x(gVar));
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = c();
        l0.o(c5, ProtectedSandApp.s("煞\u0001"));
        return new f(i4, c5, this.f76521l, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        return this.f76530u.y0().invoke();
    }

    @fg.l
    public final wd.g Q0() {
        return this.f76521l;
    }

    @fg.m
    public final List<wd.a> R0() {
        return (List) this.f76524o.getValue();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.g S0() {
        return this.f76520k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public g Z() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = super.Z();
        l0.n(Z, ProtectedSandApp.s("煟\u0001"));
        return (g) Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public g l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("煠\u0001"));
        return this.f76531v.c(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h W() {
        return this.f76532w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public h1<p0> X() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.f b() {
        return this.f76525p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f76534y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public u getVisibility() {
        if (!l0.g(this.f76527r, t.f76286a) || this.f76521l.q() != null) {
            return j0.d(this.f76527r);
        }
        u uVar = s.f76692a;
        l0.m(uVar);
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h1 j() {
        return this.f76529t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m() {
        if (this.f76526q != e0.SEALED) {
            return kotlin.collections.j0.f74919b;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null);
        Collection<wd.j> D = this.f76521l.D();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = D.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = this.f76523n.g().o((wd.j) it.next(), b5).O0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return kotlin.collections.w.u5(arrayList, new d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        return this.f76528s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        return this.f76533x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.e p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @fg.l
    public List<f1> s() {
        return this.f76535z.invoke();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("煡\u0001") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public e0 u() {
        return this.f76526q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean v() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean w() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l wd.g gVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(gVar.e(), mVar, gVar2.getName(), gVar.a().t().a(gVar2), false);
        e0 e0Var;
        l0.p(gVar, ProtectedSandApp.s("煚\u0001"));
        l0.p(mVar, ProtectedSandApp.s("煛\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("煜\u0001"));
        this.f76520k = gVar;
        this.f76521l = gVar2;
        this.f76522m = eVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g d5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(gVar, this, gVar2, 0, 4, null);
        this.f76523n = d5;
        d5.a().h().e(gVar2, this);
        gVar2.K();
        this.f76524o = c0.c(new e());
        this.f76525p = gVar2.t() ? kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS : gVar2.f() ? kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE : gVar2.b() ? kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS;
        if (gVar2.t() || gVar2.b()) {
            e0Var = e0.FINAL;
        } else {
            e0Var = e0.Companion.a(gVar2.p(), gVar2.p() || gVar2.isAbstract() || gVar2.f(), !gVar2.isFinal());
        }
        this.f76526q = e0Var;
        this.f76527r = gVar2.getVisibility();
        this.f76528s = (gVar2.q() == null || gVar2.o()) ? false : true;
        this.f76529t = new b();
        g gVar3 = new g(d5, this, gVar2, eVar != null, null, 16, null);
        this.f76530u = gVar3;
        this.f76531v = y0.f76306e.a(this, d5.e(), d5.a().k().c(), new C1090f());
        this.f76532w = new kotlin.reflect.jvm.internal.impl.resolve.scopes.f(gVar3);
        this.f76533x = new l(d5, gVar2, this);
        this.f76534y = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d5, gVar2);
        this.f76535z = d5.e().h(new c());
    }
}
