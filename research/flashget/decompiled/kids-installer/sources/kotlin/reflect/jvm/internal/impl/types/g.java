package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final g f26418a = new g();

    /* renamed from: b, reason: collision with root package name */
    @p3.f
    public static boolean f26419b;

    /* compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26420a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26421b;

        static {
            int[] iArr = new int[h4.w.values().length];
            try {
                iArr[h4.w.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h4.w.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h4.w.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26420a = iArr;
            int[] iArr2 = new int[g1.b.values().length];
            try {
                iArr2[g1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g1.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f26421b = iArr2;
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<g1.a, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<h4.k> f26422p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g1 f26423q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ h4.r f26424r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h4.k f26425s;

        /* compiled from: AbstractTypeChecker.kt */
        static final class a extends Lambda implements q3.a<Boolean> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ g1 f26426p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ h4.r f26427q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ h4.k f26428r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ h4.k f26429s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1 g1Var, h4.r rVar, h4.k kVar, h4.k kVar2) {
                super(0);
                this.f26426p = g1Var;
                this.f26427q = rVar;
                this.f26428r = kVar;
                this.f26429s = kVar2;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean n() {
                return Boolean.valueOf(g.f26418a.q(this.f26426p, this.f26427q.W(this.f26428r), this.f26429s));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends h4.k> list, g1 g1Var, h4.r rVar, h4.k kVar) {
            super(1);
            this.f26422p = list;
            this.f26423q = g1Var;
            this.f26424r = rVar;
            this.f26425s = kVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(g1.a aVar) {
            a(aVar);
            return m2.f23662a;
        }

        public final void a(@d5.d g1.a aVar) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("褻"));
            Iterator<h4.k> it = this.f26422p.iterator();
            while (it.hasNext()) {
                aVar.a(new a(this.f26423q, this.f26424r, it.next(), this.f26425s));
            }
        }
    }

    private g() {
    }

    private final Boolean a(g1 g1Var, h4.k kVar, h4.k kVar2) {
        h4.r j5 = g1Var.j();
        if (!j5.E0(kVar) && !j5.E0(kVar2)) {
            return null;
        }
        if (d(j5, kVar) && d(j5, kVar2)) {
            return Boolean.TRUE;
        }
        if (j5.E0(kVar)) {
            if (e(j5, g1Var, kVar, kVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j5.E0(kVar2) && (c(j5, kVar) || e(j5, g1Var, kVar2, kVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(h4.r rVar, h4.k kVar) {
        if (!(kVar instanceof h4.d)) {
            return false;
        }
        h4.n k5 = rVar.k(rVar.x0((h4.d) kVar));
        return !rVar.o(k5) && rVar.E0(rVar.u(rVar.r(k5)));
    }

    private static final boolean c(h4.r rVar, h4.k kVar) {
        boolean z5;
        h4.o g5 = rVar.g(kVar);
        if (!(g5 instanceof h4.h)) {
            return false;
        }
        Collection<h4.i> A0 = rVar.A0(g5);
        if (!(A0 instanceof Collection) || !A0.isEmpty()) {
            Iterator<T> it = A0.iterator();
            while (it.hasNext()) {
                h4.k e6 = rVar.e((h4.i) it.next());
                if (e6 != null && rVar.E0(e6)) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        return z5;
    }

    private static final boolean d(h4.r rVar, h4.k kVar) {
        return rVar.E0(kVar) || b(rVar, kVar);
    }

    private static final boolean e(h4.r rVar, g1 g1Var, h4.k kVar, h4.k kVar2, boolean z5) {
        Collection<h4.i> v02 = rVar.v0(kVar);
        if ((v02 instanceof Collection) && v02.isEmpty()) {
            return false;
        }
        for (h4.i iVar : v02) {
            if (kotlin.jvm.internal.l0.g(rVar.E(iVar), rVar.g(kVar2)) || (z5 && t(f26418a, g1Var, kVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0128, code lost:
    
        if (r10 != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean f(kotlin.reflect.jvm.internal.impl.types.g1 r15, h4.k r16, h4.k r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.g.f(kotlin.reflect.jvm.internal.impl.types.g1, h4.k, h4.k):java.lang.Boolean");
    }

    private final List<h4.k> g(g1 g1Var, h4.k kVar, h4.o oVar) {
        String m32;
        g1.c s02;
        List<h4.k> k5;
        h4.r j5 = g1Var.j();
        List<h4.k> j02 = j5.j0(kVar, oVar);
        if (j02 != null) {
            return j02;
        }
        if (!j5.T(oVar) && j5.c0(kVar)) {
            return EmptyList.f23167o;
        }
        if (j5.b0(oVar)) {
            if (!j5.I(j5.g(kVar), oVar)) {
                return EmptyList.f23167o;
            }
            h4.k Q = j5.Q(kVar, h4.b.FOR_SUBTYPING);
            if (Q != null) {
                kVar = Q;
            }
            k5 = kotlin.collections.z.k(kVar);
            return k5;
        }
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        g1Var.k();
        ArrayDeque<h4.k> h5 = g1Var.h();
        kotlin.jvm.internal.l0.m(h5);
        Set<h4.k> i5 = g1Var.i();
        kotlin.jvm.internal.l0.m(i5);
        h5.push(kVar);
        while (!h5.isEmpty()) {
            if (i5.size() > 1000) {
                StringBuilder a6 = c.a(ProtectedSandApp.s("圔"), kVar, ProtectedSandApp.s("圕"));
                m32 = kotlin.collections.j0.m3(i5, null, null, null, 0, null, null, 63, null);
                a6.append(m32);
                throw new IllegalStateException(a6.toString().toString());
            }
            h4.k pop = h5.pop();
            kotlin.jvm.internal.l0.o(pop, ProtectedSandApp.s("圓"));
            if (i5.add(pop)) {
                h4.k Q2 = j5.Q(pop, h4.b.FOR_SUBTYPING);
                if (Q2 == null) {
                    Q2 = pop;
                }
                if (j5.I(j5.g(Q2), oVar)) {
                    eVar.add(Q2);
                    s02 = g1.c.C0389c.f26449a;
                } else {
                    s02 = j5.U(Q2) == 0 ? g1.c.b.f26448a : g1Var.j().s0(Q2);
                }
                if (!(!kotlin.jvm.internal.l0.g(s02, g1.c.C0389c.f26449a))) {
                    s02 = null;
                }
                if (s02 != null) {
                    h4.r j6 = g1Var.j();
                    Iterator<h4.i> it = j6.A0(j6.g(pop)).iterator();
                    while (it.hasNext()) {
                        h5.add(s02.a(g1Var, it.next()));
                    }
                }
            }
        }
        g1Var.e();
        return eVar;
    }

    private final List<h4.k> h(g1 g1Var, h4.k kVar, h4.o oVar) {
        return w(g1Var, g(g1Var, kVar, oVar));
    }

    private final boolean i(g1 g1Var, h4.i iVar, h4.i iVar2, boolean z5) {
        h4.r j5 = g1Var.j();
        h4.i o5 = g1Var.o(g1Var.p(iVar));
        h4.i o6 = g1Var.o(g1Var.p(iVar2));
        g gVar = f26418a;
        Boolean f6 = gVar.f(g1Var, j5.t0(o5), j5.u(o6));
        if (f6 == null) {
            Boolean c6 = g1Var.c(o5, o6, z5);
            return c6 != null ? c6.booleanValue() : gVar.u(g1Var, j5.t0(o5), j5.u(o6));
        }
        boolean booleanValue = f6.booleanValue();
        g1Var.c(o5, o6, z5);
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r8.i0(r8.E(r9), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final h4.p m(h4.r r8, h4.i r9, h4.i r10) {
        /*
            r7 = this;
            int r0 = r8.U(r9)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            h4.n r4 = r8.C(r9, r2)
            boolean r5 = r8.o(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            h4.i r3 = r8.r(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            h4.k r4 = r8.t0(r3)
            h4.k r4 = r8.V(r4)
            boolean r4 = r8.m0(r4)
            if (r4 == 0) goto L3c
            h4.k r4 = r8.t0(r10)
            h4.k r4 = r8.V(r4)
            boolean r4 = r8.m0(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = kotlin.jvm.internal.l0.g(r3, r10)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            h4.o r4 = r8.E(r3)
            h4.o r5 = r8.E(r10)
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            h4.p r3 = r7.m(r8, r3, r10)
            if (r3 == 0) goto L64
            return r3
        L5b:
            h4.o r9 = r8.E(r9)
            h4.p r8 = r8.i0(r9, r2)
            return r8
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.g.m(h4.r, h4.i, h4.i):h4.p");
    }

    private final boolean n(g1 g1Var, h4.k kVar) {
        String m32;
        h4.r j5 = g1Var.j();
        h4.o g5 = j5.g(kVar);
        if (j5.T(g5)) {
            return j5.l0(g5);
        }
        if (j5.l0(j5.g(kVar))) {
            return true;
        }
        g1Var.k();
        ArrayDeque<h4.k> h5 = g1Var.h();
        kotlin.jvm.internal.l0.m(h5);
        Set<h4.k> i5 = g1Var.i();
        kotlin.jvm.internal.l0.m(i5);
        h5.push(kVar);
        while (!h5.isEmpty()) {
            if (i5.size() > 1000) {
                StringBuilder a6 = c.a(ProtectedSandApp.s("圗"), kVar, ProtectedSandApp.s("團"));
                m32 = kotlin.collections.j0.m3(i5, null, null, null, 0, null, null, 63, null);
                a6.append(m32);
                throw new IllegalStateException(a6.toString().toString());
            }
            h4.k pop = h5.pop();
            kotlin.jvm.internal.l0.o(pop, ProtectedSandApp.s("圖"));
            if (i5.add(pop)) {
                g1.c cVar = j5.c0(pop) ? g1.c.C0389c.f26449a : g1.c.b.f26448a;
                if (!(!kotlin.jvm.internal.l0.g(cVar, g1.c.C0389c.f26449a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    h4.r j6 = g1Var.j();
                    Iterator<h4.i> it = j6.A0(j6.g(pop)).iterator();
                    while (it.hasNext()) {
                        h4.k a7 = cVar.a(g1Var, it.next());
                        if (j5.l0(j5.g(a7))) {
                            g1Var.e();
                            return true;
                        }
                        h5.add(a7);
                    }
                }
            }
        }
        g1Var.e();
        return false;
    }

    private final boolean o(h4.r rVar, h4.i iVar) {
        return (!rVar.w0(rVar.E(iVar)) || rVar.Y(iVar) || rVar.o0(iVar) || rVar.x(iVar) || !kotlin.jvm.internal.l0.g(rVar.g(rVar.t0(iVar)), rVar.g(rVar.u(iVar)))) ? false : true;
    }

    private final boolean p(h4.r rVar, h4.k kVar, h4.k kVar2) {
        h4.k kVar3;
        h4.k kVar4;
        h4.e R = rVar.R(kVar);
        if (R == null || (kVar3 = rVar.C0(R)) == null) {
            kVar3 = kVar;
        }
        h4.e R2 = rVar.R(kVar2);
        if (R2 == null || (kVar4 = rVar.C0(R2)) == null) {
            kVar4 = kVar2;
        }
        if (rVar.g(kVar3) != rVar.g(kVar4)) {
            return false;
        }
        if (rVar.o0(kVar) || !rVar.o0(kVar2)) {
            return !rVar.y(kVar) || rVar.y(kVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(g gVar, g1 g1Var, h4.i iVar, h4.i iVar2, boolean z5, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        return gVar.s(g1Var, iVar, iVar2, z5);
    }

    private final boolean u(g1 g1Var, h4.k kVar, h4.k kVar2) {
        int b02;
        Object B2;
        int b03;
        h4.i r5;
        h4.r j5 = g1Var.j();
        if (f26419b) {
            if (!j5.c(kVar) && !j5.e0(j5.g(kVar))) {
                g1Var.l(kVar);
            }
            if (!j5.c(kVar2)) {
                g1Var.l(kVar2);
            }
        }
        boolean z5 = false;
        if (!d.f26378a.d(g1Var, kVar, kVar2)) {
            return false;
        }
        g gVar = f26418a;
        Boolean a6 = gVar.a(g1Var, j5.t0(kVar), j5.u(kVar2));
        if (a6 != null) {
            boolean booleanValue = a6.booleanValue();
            g1.d(g1Var, kVar, kVar2, false, 4, null);
            return booleanValue;
        }
        h4.o g5 = j5.g(kVar2);
        boolean z6 = true;
        if ((j5.I(j5.g(kVar), g5) && j5.m(g5) == 0) || j5.P(j5.g(kVar2))) {
            return true;
        }
        List<h4.k> l5 = gVar.l(g1Var, kVar, g5);
        int i5 = 10;
        b02 = kotlin.collections.b0.b0(l5, 10);
        ArrayList<h4.k> arrayList = new ArrayList(b02);
        for (h4.k kVar3 : l5) {
            h4.k e6 = j5.e(g1Var.o(kVar3));
            if (e6 != null) {
                kVar3 = e6;
            }
            arrayList.add(kVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f26418a.n(g1Var, kVar);
        }
        if (size == 1) {
            g gVar2 = f26418a;
            B2 = kotlin.collections.j0.B2(arrayList);
            return gVar2.q(g1Var, j5.W((h4.k) B2), kVar2);
        }
        h4.a aVar = new h4.a(j5.m(g5));
        int m5 = j5.m(g5);
        int i6 = 0;
        boolean z7 = false;
        while (i6 < m5) {
            z7 = (z7 || j5.N(j5.i0(g5, i6)) != h4.w.OUT) ? z6 : z5;
            if (!z7) {
                b03 = kotlin.collections.b0.b0(arrayList, i5);
                ArrayList arrayList2 = new ArrayList(b03);
                for (h4.k kVar4 : arrayList) {
                    h4.n f02 = j5.f0(kVar4, i6);
                    if (f02 != null) {
                        if (!(j5.q(f02) == h4.w.INV)) {
                            f02 = null;
                        }
                        if (f02 != null && (r5 = j5.r(f02)) != null) {
                            arrayList2.add(r5);
                        }
                    }
                    throw new IllegalStateException((ProtectedSandApp.s("圙") + kVar4 + ProtectedSandApp.s("圚") + kVar + ProtectedSandApp.s("圛") + kVar2).toString());
                }
                aVar.add(j5.t(j5.L(arrayList2)));
            }
            i6++;
            z5 = false;
            z6 = true;
            i5 = 10;
        }
        if (z7 || !f26418a.q(g1Var, aVar, kVar2)) {
            return g1Var.q(new b(arrayList, g1Var, j5, kVar2));
        }
        return true;
    }

    private final boolean v(h4.r rVar, h4.i iVar, h4.i iVar2, h4.o oVar) {
        h4.p B;
        h4.k e6 = rVar.e(iVar);
        if (!(e6 instanceof h4.d)) {
            return false;
        }
        h4.d dVar = (h4.d) e6;
        if (rVar.j(dVar) || !rVar.o(rVar.k(rVar.x0(dVar))) || rVar.r0(dVar) != h4.b.FOR_SUBTYPING) {
            return false;
        }
        h4.o E = rVar.E(iVar2);
        h4.v vVar = E instanceof h4.v ? (h4.v) E : null;
        return (vVar == null || (B = rVar.B(vVar)) == null || !rVar.a0(B, oVar)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<h4.k> w(g1 g1Var, List<? extends h4.k> list) {
        h4.r j5 = g1Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            h4.m W = j5.W((h4.k) next);
            int l5 = j5.l(W);
            int i5 = 0;
            while (true) {
                if (i5 >= l5) {
                    break;
                }
                if (!(j5.z(j5.r(j5.z0(W, i5))) == null)) {
                    z5 = false;
                    break;
                }
                i5++;
            }
            if (z5) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    @d5.e
    public final h4.w j(@d5.d h4.w wVar, @d5.d h4.w wVar2) {
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("圜"));
        kotlin.jvm.internal.l0.p(wVar2, ProtectedSandApp.s("圝"));
        h4.w wVar3 = h4.w.INV;
        if (wVar == wVar3) {
            return wVar2;
        }
        if (wVar2 == wVar3) {
            return wVar;
        }
        if (wVar == wVar2) {
            return wVar;
        }
        return null;
    }

    public final boolean k(@d5.d g1 g1Var, @d5.d h4.i iVar, @d5.d h4.i iVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圞"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("土"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("圠"));
        h4.r j5 = g1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        g gVar = f26418a;
        if (gVar.o(j5, iVar) && gVar.o(j5, iVar2)) {
            h4.i o5 = g1Var.o(g1Var.p(iVar));
            h4.i o6 = g1Var.o(g1Var.p(iVar2));
            h4.k t02 = j5.t0(o5);
            if (!j5.I(j5.E(o5), j5.E(o6))) {
                return false;
            }
            if (j5.U(t02) == 0) {
                return j5.u0(o5) || j5.u0(o6) || j5.y(t02) == j5.y(j5.t0(o6));
            }
        }
        return t(gVar, g1Var, iVar, iVar2, false, 8, null) && t(gVar, g1Var, iVar2, iVar, false, 8, null);
    }

    @d5.d
    public final List<h4.k> l(@d5.d g1 g1Var, @d5.d h4.k kVar, @d5.d h4.o oVar) {
        String m32;
        g1.c cVar;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圡"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("圢"));
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("圣"));
        h4.r j5 = g1Var.j();
        if (j5.c0(kVar)) {
            return f26418a.h(g1Var, kVar, oVar);
        }
        if (!j5.T(oVar) && !j5.A(oVar)) {
            return f26418a.g(g1Var, kVar, oVar);
        }
        kotlin.reflect.jvm.internal.impl.utils.e<h4.k> eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        g1Var.k();
        ArrayDeque<h4.k> h5 = g1Var.h();
        kotlin.jvm.internal.l0.m(h5);
        Set<h4.k> i5 = g1Var.i();
        kotlin.jvm.internal.l0.m(i5);
        h5.push(kVar);
        while (!h5.isEmpty()) {
            if (i5.size() > 1000) {
                StringBuilder a6 = c.a(ProtectedSandApp.s("圥"), kVar, ProtectedSandApp.s("圦"));
                m32 = kotlin.collections.j0.m3(i5, null, null, null, 0, null, null, 63, null);
                a6.append(m32);
                throw new IllegalStateException(a6.toString().toString());
            }
            h4.k pop = h5.pop();
            kotlin.jvm.internal.l0.o(pop, ProtectedSandApp.s("圤"));
            if (i5.add(pop)) {
                if (j5.c0(pop)) {
                    eVar.add(pop);
                    cVar = g1.c.C0389c.f26449a;
                } else {
                    cVar = g1.c.b.f26448a;
                }
                if (!(!kotlin.jvm.internal.l0.g(cVar, g1.c.C0389c.f26449a))) {
                    cVar = null;
                }
                if (cVar != null) {
                    h4.r j6 = g1Var.j();
                    Iterator<h4.i> it = j6.A0(j6.g(pop)).iterator();
                    while (it.hasNext()) {
                        h5.add(cVar.a(g1Var, it.next()));
                    }
                }
            }
        }
        g1Var.e();
        ArrayList arrayList = new ArrayList();
        for (h4.k kVar2 : eVar) {
            g gVar = f26418a;
            kotlin.jvm.internal.l0.o(kVar2, ProtectedSandApp.s("圧"));
            kotlin.collections.f0.q0(arrayList, gVar.h(g1Var, kVar2, oVar));
        }
        return arrayList;
    }

    public final boolean q(@d5.d g1 g1Var, @d5.d h4.m mVar, @d5.d h4.k kVar) {
        int i5;
        int i6;
        boolean k5;
        int i7;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("在"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("圩"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("圪"));
        h4.r j5 = g1Var.j();
        h4.o g5 = j5.g(kVar);
        int l5 = j5.l(mVar);
        int m5 = j5.m(g5);
        if (l5 != m5 || l5 != j5.U(kVar)) {
            return false;
        }
        for (int i8 = 0; i8 < m5; i8++) {
            h4.n C = j5.C(kVar, i8);
            if (!j5.o(C)) {
                h4.i r5 = j5.r(C);
                h4.n z02 = j5.z0(mVar, i8);
                j5.q(z02);
                h4.w wVar = h4.w.INV;
                h4.i r6 = j5.r(z02);
                g gVar = f26418a;
                h4.w j6 = gVar.j(j5.N(j5.i0(g5, i8)), j5.q(C));
                if (j6 == null) {
                    return g1Var.m();
                }
                if (j6 == wVar && (gVar.v(j5, r6, r5, g5) || gVar.v(j5, r5, r6, g5))) {
                    continue;
                } else {
                    i5 = g1Var.f26443g;
                    if (i5 > 100) {
                        throw new IllegalStateException((ProtectedSandApp.s("圫") + r6).toString());
                    }
                    i6 = g1Var.f26443g;
                    g1Var.f26443g = i6 + 1;
                    int i9 = a.f26420a[j6.ordinal()];
                    if (i9 == 1) {
                        k5 = gVar.k(g1Var, r6, r5);
                    } else if (i9 == 2) {
                        k5 = t(gVar, g1Var, r6, r5, false, 8, null);
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k5 = t(gVar, g1Var, r5, r6, false, 8, null);
                    }
                    i7 = g1Var.f26443g;
                    g1Var.f26443g = i7 - 1;
                    if (!k5) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @p3.j
    public final boolean r(@d5.d g1 g1Var, @d5.d h4.i iVar, @d5.d h4.i iVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圬"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("圭"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("圮"));
        return t(this, g1Var, iVar, iVar2, false, 8, null);
    }

    @p3.j
    public final boolean s(@d5.d g1 g1Var, @d5.d h4.i iVar, @d5.d h4.i iVar2, boolean z5) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圯"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("地"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("圱"));
        if (iVar == iVar2) {
            return true;
        }
        if (g1Var.f(iVar, iVar2)) {
            return i(g1Var, iVar, iVar2, z5);
        }
        return false;
    }
}
