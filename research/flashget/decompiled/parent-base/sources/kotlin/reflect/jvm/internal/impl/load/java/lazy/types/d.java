package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.load.java.j0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.k;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import wd.a0;
import wd.c0;
import wd.i;
import wd.j;
import wd.v;
import wd.x;
import wd.y;

/* compiled from: JavaTypeResolver.kt */
@r1({"SMAP\nJavaTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1#2:322\n19#3:323\n1549#4:324\n1620#4,3:325\n1549#4:328\n1620#4,3:329\n1549#4:332\n1620#4,3:333\n*S KotlinDebug\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n*L\n144#1:323\n205#1:324\n205#1:325,3\n263#1:328\n263#1:329,3\n267#1:332\n267#1:333,3\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76661a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final k f76662b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final f f76663c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final k1 f76664d;

    /* compiled from: JavaTypeResolver.kt */
    static final class a extends n0 implements ld.a<h0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f1 f76666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f76667d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h1 f76668e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f76669f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, h1 h1Var, j jVar) {
            super(0);
            this.f76666c = f1Var;
            this.f76667d = aVar;
            this.f76668e = h1Var;
            this.f76669f = jVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            k1 k1Var = d.this.f76664d;
            f1 f1Var = this.f76666c;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar = this.f76667d;
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = this.f76668e.c();
            return k1Var.c(f1Var, aVar.k(c5 != null ? c5.r() : null).j(this.f76669f.x()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @l k kVar) {
        l0.p(gVar, ProtectedSandApp.s("爙\u0001"));
        l0.p(kVar, ProtectedSandApp.s("爚\u0001"));
        this.f76661a = gVar;
        this.f76662b = kVar;
        f fVar = new f();
        this.f76663c = fVar;
        this.f76664d = new k1(fVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        x1 o4;
        if (!a0.a((x) w.v3(jVar.B()))) {
            return false;
        }
        List<f1> parameters = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f75754a.b(eVar).j().getParameters();
        l0.o(parameters, ProtectedSandApp.s("爛\u0001"));
        f1 f1Var = (f1) w.v3(parameters);
        return (f1Var == null || (o4 = f1Var.o()) == null || o4 == x1.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0.isEmpty() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.l1> c(wd.j r10, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r11, kotlin.reflect.jvm.internal.impl.types.h1 r12) {
        /*
            r9 = this;
            boolean r0 = r10.x()
            java.lang.String r1 = "爛\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            if (r0 != 0) goto L28
            java.util.List r0 = r10.B()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.l0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.l0.o(r2, r1)
            if (r0 == 0) goto L37
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L37:
            int r11 = r2.size()
            java.util.List r12 = r10.B()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L8b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.w.b0(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L56:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L86
            java.lang.Object r12 = r11.next()
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r12 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r12
            kotlin.reflect.jvm.internal.impl.types.n1 r0 = new kotlin.reflect.jvm.internal.impl.types.n1
            kotlin.reflect.jvm.internal.impl.types.error.j r1 = kotlin.reflect.jvm.internal.impl.types.error.j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            kotlin.reflect.jvm.internal.impl.name.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String r2 = "爜\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r12, r2)
            java.lang.String[] r12 = new java.lang.String[]{r12}
            kotlin.reflect.jvm.internal.impl.types.error.h r12 = kotlin.reflect.jvm.internal.impl.types.error.k.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L56
        L86:
            java.util.List r10 = kotlin.collections.w.V5(r10)
            return r10
        L8b:
            java.util.List r10 = r10.B()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = kotlin.collections.w.h6(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.w.b0(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        La2:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Ld7
            java.lang.Object r12 = r10.next()
            kotlin.collections.r0 r12 = (kotlin.collections.r0) r12
            int r0 = r12.getIndex()
            java.lang.Object r12 = r12.b()
            wd.x r12 = (wd.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r0
            kotlin.reflect.jvm.internal.impl.types.s1 r3 = kotlin.reflect.jvm.internal.impl.types.s1.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.l0.m(r0)
            kotlin.reflect.jvm.internal.impl.types.l1 r12 = r9.p(r12, r1, r0)
            r11.add(r12)
            goto La2
        Ld7:
            java.util.List r10 = kotlin.collections.w.V5(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.c(wd.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a, kotlin.reflect.jvm.internal.impl.types.h1):java.util.List");
    }

    private final List<l1> d(j jVar, List<? extends f1> list, h1 h1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        List<? extends f1> list2 = list;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        for (f1 f1Var : list2) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.l(f1Var, null, aVar.c()) ? t1.t(f1Var, aVar) : this.f76663c.a(f1Var, aVar.j(jVar.x()), this.f76664d, new k0(this.f76661a.e(), new a(f1Var, aVar, h1Var, jVar))));
        }
        return arrayList;
    }

    private final p0 e(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, p0 p0Var) {
        d1 b5;
        if (p0Var == null || (b5 = p0Var.N0()) == null) {
            b5 = e1.b(new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.f76661a, jVar, false, 4, null));
        }
        d1 d1Var = b5;
        h1 f4 = f(jVar, aVar);
        if (f4 == null) {
            return null;
        }
        boolean i4 = i(aVar);
        return (l0.g(p0Var != null ? p0Var.O0() : null, f4) && !jVar.x() && i4) ? p0Var.V0(true) : i0.l(d1Var, f4, c(jVar, aVar, f4), i4, null, 16, null);
    }

    private final h1 f(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        h1 j4;
        i d5 = jVar.d();
        if (d5 == null) {
            return g(jVar);
        }
        if (!(d5 instanceof wd.g)) {
            if (!(d5 instanceof y)) {
                throw new IllegalStateException(ProtectedSandApp.s("爞\u0001") + d5);
            }
            f1 a5 = this.f76662b.a((y) d5);
            if (a5 != null) {
                return a5.j();
            }
            return null;
        }
        wd.g gVar = (wd.g) d5;
        kotlin.reflect.jvm.internal.impl.name.c g4 = gVar.g();
        if (g4 == null) {
            throw new AssertionError(ProtectedSandApp.s("爝\u0001") + d5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e j5 = j(jVar, aVar, g4);
        if (j5 == null) {
            j5 = this.f76661a.a().n().a(gVar);
        }
        return (j5 == null || (j4 = j5.j()) == null) ? g(jVar) : j4;
    }

    private final h1 g(j jVar) {
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(jVar.I()));
        l0.o(m4, ProtectedSandApp.s("爟\u0001"));
        h1 j4 = this.f76661a.a().b().d().r().d(m4, w.k(0)).j();
        l0.o(j4, ProtectedSandApp.s("爠\u0001"));
        return j4;
    }

    private final boolean h(x1 x1Var, f1 f1Var) {
        return (f1Var.o() == x1.INVARIANT || x1Var == f1Var.o()) ? false : true;
    }

    private final boolean i(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == s1.SUPERTYPE) ? false : true;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e j(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVar2;
        if (aVar.h()) {
            cVar2 = e.f76670a;
            if (l0.g(cVar, cVar2)) {
                return this.f76661a.a().p().c();
            }
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f75754a;
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(dVar, cVar, this.f76661a.d().p(), null, 4, null);
        if (f4 == null) {
            return null;
        }
        return (dVar.d(f4) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == s1.SUPERTYPE || b(jVar, f4))) ? dVar.b(f4) : f4;
    }

    public static /* synthetic */ h0 l(d dVar, wd.f fVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return dVar.k(fVar, aVar, z4);
    }

    private final h0 m(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        boolean z4 = (aVar.h() || aVar.b() == s1.SUPERTYPE) ? false : true;
        boolean x4 = jVar.x();
        if (!x4 && !z4) {
            p0 e4 = e(jVar, aVar, null);
            return e4 != null ? e4 : n(jVar);
        }
        p0 e5 = e(jVar, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (e5 == null) {
            return n(jVar);
        }
        p0 e6 = e(jVar, aVar.l(c.FLEXIBLE_UPPER_BOUND), e5);
        return e6 == null ? n(jVar) : x4 ? new h(e5, e6) : i0.d(e5, e6);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.h n(j jVar) {
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_JAVA_CLASS, jVar.G());
    }

    private final l1 p(x xVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, f1 f1Var) {
        l1 t4;
        if (!(xVar instanceof c0)) {
            return new n1(x1.INVARIANT, o(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x A = c0Var.A();
        x1 x1Var = c0Var.isExtends() ? x1.OUT_VARIANCE : x1.IN_VARIANCE;
        if (A == null || h(x1Var, f1Var)) {
            t4 = t1.t(f1Var, aVar);
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a5 = j0.a(this.f76661a, c0Var);
            h0 o4 = o(A, b.b(s1.COMMON, false, false, null, 7, null));
            if (a5 != null) {
                o4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.x(o4, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.A4(o4.getAnnotations(), a5)));
            }
            t4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(o4, x1Var, f1Var);
        }
        l0.m(t4);
        return t4;
    }

    @l
    public final h0 k(@l wd.f fVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, boolean z4) {
        l0.p(fVar, ProtectedSandApp.s("爡\u0001"));
        l0.p(aVar, ProtectedSandApp.s("爢\u0001"));
        x s4 = fVar.s();
        v vVar = s4 instanceof v ? (v) s4 : null;
        kotlin.reflect.jvm.internal.impl.builtins.i type = vVar != null ? vVar.getType() : null;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.f76661a, fVar, true);
        if (type != null) {
            p0 O = this.f76661a.d().p().O(type);
            l0.m(O);
            h0 x4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.x(O, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(O.getAnnotations(), dVar));
            l0.n(x4, ProtectedSandApp.s("爣\u0001"));
            p0 p0Var = (p0) x4;
            return aVar.h() ? p0Var : i0.d(p0Var, p0Var.V0(true));
        }
        h0 o4 = o(s4, b.b(s1.COMMON, aVar.h(), false, null, 6, null));
        boolean h4 = aVar.h();
        String s5 = ProtectedSandApp.s("爤\u0001");
        if (h4) {
            p0 m4 = this.f76661a.d().p().m(z4 ? x1.OUT_VARIANCE : x1.INVARIANT, o4, dVar);
            l0.o(m4, s5);
            return m4;
        }
        p0 m5 = this.f76661a.d().p().m(x1.INVARIANT, o4, dVar);
        l0.o(m5, s5);
        return i0.d(m5, this.f76661a.d().p().m(x1.OUT_VARIANCE, o4, dVar).V0(true));
    }

    @l
    public final h0 o(@m x xVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        h0 o4;
        l0.p(aVar, ProtectedSandApp.s("爢\u0001"));
        if (xVar instanceof v) {
            kotlin.reflect.jvm.internal.impl.builtins.i type = ((v) xVar).getType();
            p0 R = type != null ? this.f76661a.d().p().R(type) : this.f76661a.d().p().Z();
            l0.m(R);
            return R;
        }
        if (xVar instanceof j) {
            return m((j) xVar, aVar);
        }
        if (xVar instanceof wd.f) {
            return l(this, (wd.f) xVar, aVar, false, 4, null);
        }
        boolean z4 = xVar instanceof c0;
        String s4 = ProtectedSandApp.s("爥\u0001");
        if (z4) {
            x A = ((c0) xVar).A();
            if (A != null && (o4 = o(A, aVar)) != null) {
                return o4;
            }
            p0 y4 = this.f76661a.d().p().y();
            l0.o(y4, s4);
            return y4;
        }
        if (xVar == null) {
            p0 y5 = this.f76661a.d().p().y();
            l0.o(y5, s4);
            return y5;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("爦\u0001") + xVar);
    }
}
