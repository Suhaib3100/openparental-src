package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import b4.a0;
import b4.c0;
import b4.i;
import b4.j;
import b4.v;
import b4.x;
import b4.y;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
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

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24786a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final k f24787b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final f f24788c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final k1 f24789d;

    /* compiled from: JavaTypeResolver.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<h0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ f1 f24791q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f24792r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h1 f24793s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f24794t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, h1 h1Var, j jVar) {
            super(0);
            this.f24791q = f1Var;
            this.f24792r = aVar;
            this.f24793s = h1Var;
            this.f24794t = jVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 n() {
            k1 k1Var = d.this.f24789d;
            f1 f1Var = this.f24791q;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar = this.f24792r;
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = this.f24793s.b();
            return k1Var.c(f1Var, aVar.k(b6 != null ? b6.E() : null).j(this.f24794t.B()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d k kVar) {
        l0.p(gVar, ProtectedSandApp.s("䪋"));
        l0.p(kVar, ProtectedSandApp.s("䪌"));
        this.f24786a = gVar;
        this.f24787b = kVar;
        f fVar = new f();
        this.f24788c = fVar;
        this.f24789d = new k1(fVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Object v32;
        Object v33;
        x1 z5;
        v32 = j0.v3(jVar.I());
        if (!a0.a((x) v32)) {
            return false;
        }
        List<f1> r5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f23962a.b(eVar).m().r();
        l0.o(r5, ProtectedSandApp.s("䪍"));
        v33 = j0.v3(r5);
        f1 f1Var = (f1) v33;
        return (f1Var == null || (z5 = f1Var.z()) == null || z5 == x1.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((!r0.isEmpty()) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.l1> c(b4.j r12, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r13, kotlin.reflect.jvm.internal.impl.types.h1 r14) {
        /*
            r11 = this;
            boolean r0 = r12.B()
            r1 = 0
            java.lang.String r2 = "䪎"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r3 = 1
            if (r0 != 0) goto L29
            java.util.List r0 = r12.I()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            java.util.List r0 = r14.r()
            kotlin.jvm.internal.l0.o(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r1
            goto L2a
        L29:
            r0 = r3
        L2a:
            java.util.List r4 = r14.r()
            kotlin.jvm.internal.l0.o(r4, r2)
            if (r0 == 0) goto L38
            java.util.List r12 = r11.d(r12, r4, r14, r13)
            return r12
        L38:
            int r13 = r4.size()
            java.util.List r14 = r12.I()
            int r14 = r14.size()
            r0 = 10
            if (r13 == r14) goto L8a
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = kotlin.collections.y.b0(r4, r0)
            r12.<init>(r13)
            java.util.Iterator r13 = r4.iterator()
        L55:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L85
            java.lang.Object r14 = r13.next()
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r14 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r14
            kotlin.reflect.jvm.internal.impl.types.n1 r0 = new kotlin.reflect.jvm.internal.impl.types.n1
            kotlin.reflect.jvm.internal.impl.types.error.j r2 = kotlin.reflect.jvm.internal.impl.types.error.j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            kotlin.reflect.jvm.internal.impl.name.f r14 = r14.getName()
            java.lang.String r14 = r14.h()
            java.lang.String r5 = "䪏"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            kotlin.jvm.internal.l0.o(r14, r5)
            r4[r1] = r14
            kotlin.reflect.jvm.internal.impl.types.error.h r14 = kotlin.reflect.jvm.internal.impl.types.error.k.d(r2, r4)
            r0.<init>(r14)
            r12.add(r0)
            goto L55
        L85:
            java.util.List r12 = kotlin.collections.y.V5(r12)
            return r12
        L8a:
            java.util.List r12 = r12.I()
            java.lang.Iterable r12 = kotlin.collections.y.h6(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = kotlin.collections.y.b0(r12, r0)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L9f:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lda
            java.lang.Object r14 = r12.next()
            kotlin.collections.u0 r14 = (kotlin.collections.IndexedValue) r14
            int r0 = r14.getF23235a()
            java.lang.Object r14 = r14.b()
            b4.x r14 = (b4.x) r14
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r0
            kotlin.reflect.jvm.internal.impl.types.s1 r5 = kotlin.reflect.jvm.internal.impl.types.s1.COMMON
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "䪐"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.l1 r14 = r11.p(r14, r1, r0)
            r13.add(r14)
            goto L9f
        Lda:
            java.util.List r12 = kotlin.collections.y.V5(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.c(b4.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a, kotlin.reflect.jvm.internal.impl.types.h1):java.util.List");
    }

    private final List<l1> d(j jVar, List<? extends f1> list, h1 h1Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        int b02;
        b02 = b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (f1 f1Var : list) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.l(f1Var, null, aVar.c()) ? t1.t(f1Var, aVar) : this.f24788c.a(f1Var, aVar.j(jVar.B()), this.f24789d, new k0(this.f24786a.e(), new a(f1Var, aVar, h1Var, jVar))));
        }
        return arrayList;
    }

    private final p0 e(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, p0 p0Var) {
        d1 b6;
        if (p0Var == null || (b6 = p0Var.T0()) == null) {
            b6 = e1.b(new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.f24786a, jVar, false, 4, null));
        }
        d1 d1Var = b6;
        h1 f6 = f(jVar, aVar);
        if (f6 == null) {
            return null;
        }
        boolean i5 = i(aVar);
        return (l0.g(p0Var != null ? p0Var.U0() : null, f6) && !jVar.B() && i5) ? p0Var.b1(true) : i0.l(d1Var, f6, c(jVar, aVar, f6), i5, null, 16, null);
    }

    private final h1 f(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        h1 m5;
        i k5 = jVar.k();
        if (k5 == null) {
            return g(jVar);
        }
        if (!(k5 instanceof b4.g)) {
            if (!(k5 instanceof y)) {
                throw new IllegalStateException(ProtectedSandApp.s("䪒") + k5);
            }
            f1 a6 = this.f24787b.a((y) k5);
            if (a6 != null) {
                return a6.m();
            }
            return null;
        }
        b4.g gVar = (b4.g) k5;
        kotlin.reflect.jvm.internal.impl.name.c f6 = gVar.f();
        if (f6 == null) {
            throw new AssertionError(ProtectedSandApp.s("䪑") + k5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e j5 = j(jVar, aVar, f6);
        if (j5 == null) {
            j5 = this.f24786a.a().n().a(gVar);
        }
        return (j5 == null || (m5 = j5.m()) == null) ? g(jVar) : m5;
    }

    private final h1 g(j jVar) {
        List<Integer> k5;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(jVar.C()));
        l0.o(m5, ProtectedSandApp.s("䪓"));
        kotlin.reflect.jvm.internal.impl.descriptors.k0 q5 = this.f24786a.a().b().d().q();
        k5 = z.k(0);
        h1 m6 = q5.d(m5, k5).m();
        l0.o(m6, ProtectedSandApp.s("䪔"));
        return m6;
    }

    private final boolean h(x1 x1Var, f1 f1Var) {
        return (f1Var.z() == x1.INVARIANT || x1Var == f1Var.z()) ? false : true;
    }

    private final boolean i(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == s1.SUPERTYPE) ? false : true;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e j(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVar2;
        if (aVar.h()) {
            cVar2 = e.f24795a;
            if (l0.g(cVar, cVar2)) {
                return this.f24786a.a().p().c();
            }
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f23962a;
        kotlin.reflect.jvm.internal.impl.descriptors.e f6 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(dVar, cVar, this.f24786a.d().A(), null, 4, null);
        if (f6 == null) {
            return null;
        }
        return (dVar.d(f6) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == s1.SUPERTYPE || b(jVar, f6))) ? dVar.b(f6) : f6;
    }

    public static /* synthetic */ h0 l(d dVar, b4.f fVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return dVar.k(fVar, aVar, z5);
    }

    private final h0 m(j jVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        boolean z5 = (aVar.h() || aVar.b() == s1.SUPERTYPE) ? false : true;
        boolean B = jVar.B();
        if (!B && !z5) {
            p0 e6 = e(jVar, aVar, null);
            return e6 != null ? e6 : n(jVar);
        }
        p0 e7 = e(jVar, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (e7 == null) {
            return n(jVar);
        }
        p0 e8 = e(jVar, aVar.l(c.FLEXIBLE_UPPER_BOUND), e7);
        return e8 == null ? n(jVar) : B ? new h(e7, e8) : i0.d(e7, e8);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.h n(j jVar) {
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_JAVA_CLASS, jVar.q());
    }

    private final l1 p(x xVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, f1 f1Var) {
        l1 t5;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> A4;
        if (!(xVar instanceof c0)) {
            return new n1(x1.INVARIANT, o(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x H = c0Var.H();
        x1 x1Var = c0Var.M() ? x1.OUT_VARIANCE : x1.IN_VARIANCE;
        if (H == null || h(x1Var, f1Var)) {
            t5 = t1.t(f1Var, aVar);
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a6 = kotlin.reflect.jvm.internal.impl.load.java.j0.a(this.f24786a, c0Var);
            h0 o5 = o(H, b.b(s1.COMMON, false, false, null, 7, null));
            if (a6 != null) {
                g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
                A4 = j0.A4(o5.getAnnotations(), a6);
                o5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.v(o5, aVar2.a(A4));
            }
            t5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(o5, x1Var, f1Var);
        }
        l0.o(t5, ProtectedSandApp.s("䪕"));
        return t5;
    }

    @d5.d
    public final h0 k(@d5.d b4.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, boolean z5) {
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> z42;
        l0.p(fVar, ProtectedSandApp.s("䪖"));
        l0.p(aVar, ProtectedSandApp.s("䪗"));
        x p5 = fVar.p();
        v vVar = p5 instanceof v ? (v) p5 : null;
        kotlin.reflect.jvm.internal.impl.builtins.i type = vVar != null ? vVar.getType() : null;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(this.f24786a, fVar, true);
        if (type != null) {
            p0 O = this.f24786a.d().A().O(type);
            l0.o(O, ProtectedSandApp.s("䪘"));
            g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
            z42 = j0.z4(dVar, O.getAnnotations());
            kotlin.reflect.jvm.internal.impl.types.typeUtil.a.v(O, aVar2.a(z42));
            return aVar.h() ? O : i0.d(O, O.b1(true));
        }
        h0 o5 = o(p5, b.b(s1.COMMON, aVar.h(), false, null, 6, null));
        boolean h5 = aVar.h();
        String s5 = ProtectedSandApp.s("䪙");
        if (h5) {
            p0 m5 = this.f24786a.d().A().m(z5 ? x1.OUT_VARIANCE : x1.INVARIANT, o5, dVar);
            l0.o(m5, s5);
            return m5;
        }
        p0 m6 = this.f24786a.d().A().m(x1.INVARIANT, o5, dVar);
        l0.o(m6, s5);
        return i0.d(m6, this.f24786a.d().A().m(x1.OUT_VARIANCE, o5, dVar).b1(true));
    }

    @d5.d
    public final h0 o(@d5.e x xVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        h0 o5;
        l0.p(aVar, ProtectedSandApp.s("䪚"));
        if (xVar instanceof v) {
            kotlin.reflect.jvm.internal.impl.builtins.i type = ((v) xVar).getType();
            p0 R = type != null ? this.f24786a.d().A().R(type) : this.f24786a.d().A().Z();
            l0.o(R, ProtectedSandApp.s("䪛"));
            return R;
        }
        if (xVar instanceof j) {
            return m((j) xVar, aVar);
        }
        if (xVar instanceof b4.f) {
            return l(this, (b4.f) xVar, aVar, false, 4, null);
        }
        boolean z5 = xVar instanceof c0;
        String s5 = ProtectedSandApp.s("䪜");
        if (z5) {
            x H = ((c0) xVar).H();
            if (H != null && (o5 = o(H, aVar)) != null) {
                return o5;
            }
            p0 y5 = this.f24786a.d().A().y();
            l0.o(y5, s5);
            return y5;
        }
        if (xVar == null) {
            p0 y6 = this.f24786a.d().A().y();
            l0.o(y6, s5);
            return y6;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("䪝") + xVar);
    }
}
