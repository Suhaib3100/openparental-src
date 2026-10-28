package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.r1({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,835:1\n1#2:836\n1#2:853\n1#2:905\n1#2:943\n132#3,16:837\n148#3,13:854\n46#3,8:875\n132#3,16:889\n148#3,13:906\n132#3,16:927\n148#3,13:944\n1549#4:867\n1620#4,3:868\n1549#4:871\n1620#4,3:872\n1726#4,3:883\n1726#4,3:886\n766#4:919\n857#4:920\n858#4:926\n1360#4:957\n1446#4,5:958\n1747#4,3:963\n1747#4,3:966\n568#5,5:921\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n342#1:853\n622#1:905\n692#1:943\n342#1:837,16\n342#1:854,13\n475#1:875,8\n622#1:889,16\n622#1:906,13\n692#1:927,16\n692#1:944,13\n378#1:867\n378#1:868,3\n389#1:871\n389#1:872,3\n561#1:883,3\n572#1:886,3\n667#1:919\n667#1:920\n667#1:926\n701#1:957\n701#1:958,5\n295#1:963,3\n303#1:966,3\n668#1:921,5\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f78427a = new g();

    /* renamed from: b, reason: collision with root package name */
    @kd.f
    public static boolean f78428b;

    /* compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78429a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78430b;

        static {
            int[] iArr = new int[ce.v.values().length];
            try {
                iArr[ce.v.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ce.v.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ce.v.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78429a = iArr;
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
            f78430b = iArr2;
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<g1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ce.j> f78431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f78432c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ce.q f78433d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ce.j f78434e;

        /* compiled from: AbstractTypeChecker.kt */
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g1 f78435b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ce.q f78436c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ce.j f78437d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ce.j f78438e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1 g1Var, ce.q qVar, ce.j jVar, ce.j jVar2) {
                super(0);
                this.f78435b = g1Var;
                this.f78436c = qVar;
                this.f78437d = jVar;
                this.f78438e = jVar2;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(g.f78427a.q(this.f78435b, this.f78436c.F0(this.f78437d), this.f78438e));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends ce.j> list, g1 g1Var, ce.q qVar, ce.j jVar) {
            super(1);
            this.f78431b = list;
            this.f78432c = g1Var;
            this.f78433d = qVar;
            this.f78434e = jVar;
        }

        public final void a(@fg.l g1.a aVar) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("缬\u0001"));
            Iterator<ce.j> it = this.f78431b.iterator();
            while (it.hasNext()) {
                aVar.a(new a(this.f78432c, this.f78433d, it.next(), this.f78434e));
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(g1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    private g() {
    }

    private final Boolean a(g1 g1Var, ce.j jVar, ce.j jVar2) {
        ce.q j4 = g1Var.j();
        if (!j4.N(jVar) && !j4.N(jVar2)) {
            return null;
        }
        if (d(j4, jVar) && d(j4, jVar2)) {
            return Boolean.TRUE;
        }
        if (j4.N(jVar)) {
            if (e(j4, g1Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j4.N(jVar2) && (c(j4, jVar) || e(j4, g1Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(ce.q qVar, ce.j jVar) {
        if (!(jVar instanceof ce.d)) {
            return false;
        }
        ce.m n4 = qVar.n(qVar.u((ce.d) jVar));
        return !qVar.y(n4) && qVar.N(qVar.V(qVar.n0(n4)));
    }

    private static final boolean c(ce.q qVar, ce.j jVar) {
        ce.n d5 = qVar.d(jVar);
        if (d5 instanceof ce.h) {
            Collection<ce.i> x4 = qVar.x(d5);
            if (!(x4 instanceof Collection) || !x4.isEmpty()) {
                Iterator<T> it = x4.iterator();
                while (it.hasNext()) {
                    ce.j g4 = qVar.g((ce.i) it.next());
                    if (g4 != null && qVar.N(g4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean d(ce.q qVar, ce.j jVar) {
        return qVar.N(jVar) || b(qVar, jVar);
    }

    private static final boolean e(ce.q qVar, g1 g1Var, ce.j jVar, ce.j jVar2, boolean z4) {
        Collection<ce.i> b02 = qVar.b0(jVar);
        if ((b02 instanceof Collection) && b02.isEmpty()) {
            return false;
        }
        for (ce.i iVar : b02) {
            if (kotlin.jvm.internal.l0.g(qVar.L(iVar), qVar.d(jVar2)) || (z4 && t(f78427a, g1Var, jVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    private final Boolean f(g1 g1Var, ce.j jVar, ce.j jVar2) {
        ce.j jVar3;
        ce.q j4 = g1Var.j();
        if (j4.C0(jVar) || j4.C0(jVar2)) {
            return g1Var.m() ? Boolean.TRUE : (!j4.O(jVar) || j4.O(jVar2)) ? Boolean.valueOf(e.f78391a.b(j4, j4.a(jVar, false), j4.a(jVar2, false))) : Boolean.FALSE;
        }
        if (j4.m0(jVar) && j4.m0(jVar2)) {
            return Boolean.valueOf(f78427a.p(j4, jVar, jVar2) || g1Var.n());
        }
        if (j4.a0(jVar) || j4.a0(jVar2)) {
            return Boolean.valueOf(g1Var.n());
        }
        ce.e B = j4.B(jVar2);
        if (B == null || (jVar3 = j4.e0(B)) == null) {
            jVar3 = jVar2;
        }
        ce.d e4 = j4.e(jVar3);
        ce.i E0 = e4 != null ? j4.E0(e4) : null;
        if (e4 != null && E0 != null) {
            if (j4.O(jVar2)) {
                E0 = j4.t(E0, true);
            } else if (j4.W(jVar2)) {
                E0 = j4.Q(E0);
            }
            ce.i iVar = E0;
            int i4 = a.f78430b[g1Var.g(jVar, e4).ordinal()];
            if (i4 == 1) {
                return Boolean.valueOf(t(f78427a, g1Var, jVar, iVar, false, 8, null));
            }
            if (i4 == 2 && t(f78427a, g1Var, jVar, iVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        ce.n d5 = j4.d(jVar2);
        if (j4.G(d5)) {
            j4.O(jVar2);
            Collection<ce.i> x4 = j4.x(d5);
            if (!(x4 instanceof Collection) || !x4.isEmpty()) {
                Iterator<T> it = x4.iterator();
                while (it.hasNext()) {
                    if (!t(f78427a, g1Var, jVar, (ce.i) it.next(), false, 8, null)) {
                        break;
                    }
                }
            }
            r10 = true;
            return Boolean.valueOf(r10);
        }
        ce.n d6 = j4.d(jVar);
        if (!(jVar instanceof ce.d)) {
            if (j4.G(d6)) {
                Collection<ce.i> x5 = j4.x(d6);
                if (!(x5 instanceof Collection) || !x5.isEmpty()) {
                    Iterator<T> it2 = x5.iterator();
                    while (it2.hasNext()) {
                        if (!(((ce.i) it2.next()) instanceof ce.d)) {
                            break;
                        }
                    }
                }
            }
            return null;
        }
        ce.o m4 = f78427a.m(g1Var.j(), jVar2, jVar);
        if (m4 != null && j4.E(m4, j4.d(jVar2))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private final List<ce.j> g(g1 g1Var, ce.j jVar, ce.n nVar) {
        g1.c w4;
        ce.j jVar2 = jVar;
        ce.q j4 = g1Var.j();
        List<ce.j> k4 = j4.k(jVar2, nVar);
        if (k4 != null) {
            return k4;
        }
        if (!j4.v(nVar) && j4.p(jVar2)) {
            return kotlin.collections.j0.f74919b;
        }
        if (j4.C(nVar)) {
            if (!j4.I(j4.d(jVar2), nVar)) {
                return kotlin.collections.j0.f74919b;
            }
            ce.j w02 = j4.w0(jVar2, ce.b.FOR_SUBTYPING);
            if (w02 != null) {
                jVar2 = w02;
            }
            return kotlin.collections.w.k(jVar2);
        }
        kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        g1Var.k();
        ArrayDeque<ce.j> h4 = g1Var.h();
        kotlin.jvm.internal.l0.m(h4);
        Set<ce.j> i4 = g1Var.i();
        kotlin.jvm.internal.l0.m(i4);
        h4.push(jVar2);
        while (!h4.isEmpty()) {
            if (i4.size() > 1000) {
                StringBuilder a5 = c.a(ProtectedSandApp.s("罂\u0001"), jVar2, ProtectedSandApp.s("罃\u0001"));
                a5.append(kotlin.collections.w.m3(i4, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(a5.toString().toString());
            }
            ce.j pop = h4.pop();
            kotlin.jvm.internal.l0.m(pop);
            if (i4.add(pop)) {
                ce.j w03 = j4.w0(pop, ce.b.FOR_SUBTYPING);
                if (w03 == null) {
                    w03 = pop;
                }
                if (j4.I(j4.d(w03), nVar)) {
                    fVar.add(w03);
                    w4 = g1.c.C1193c.f78458a;
                } else {
                    w4 = j4.D0(w03) == 0 ? g1.c.b.f78457a : g1Var.j().w(w03);
                }
                if (kotlin.jvm.internal.l0.g(w4, g1.c.C1193c.f78458a)) {
                    w4 = null;
                }
                if (w4 != null) {
                    ce.q j5 = g1Var.j();
                    Iterator<ce.i> it = j5.x(j5.d(pop)).iterator();
                    while (it.hasNext()) {
                        h4.add(w4.a(g1Var, it.next()));
                    }
                }
            }
        }
        g1Var.e();
        return fVar;
    }

    private final List<ce.j> h(g1 g1Var, ce.j jVar, ce.n nVar) {
        return w(g1Var, g(g1Var, jVar, nVar));
    }

    private final boolean i(g1 g1Var, ce.i iVar, ce.i iVar2, boolean z4) {
        ce.q j4 = g1Var.j();
        ce.i o4 = g1Var.o(g1Var.p(iVar));
        ce.i o5 = g1Var.o(g1Var.p(iVar2));
        g gVar = f78427a;
        Boolean f4 = gVar.f(g1Var, j4.c0(o4), j4.V(o5));
        if (f4 == null) {
            Boolean c5 = g1Var.c(o4, o5, z4);
            return c5 != null ? c5.booleanValue() : gVar.u(g1Var, j4.c0(o4), j4.V(o5));
        }
        boolean booleanValue = f4.booleanValue();
        g1Var.c(o4, o5, z4);
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r7.u0(r7.L(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ce.o m(ce.q r7, ce.i r8, ce.i r9) {
        /*
            r6 = this;
            int r0 = r7.D0(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            ce.m r4 = r7.h0(r8, r2)
            boolean r5 = r7.y(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            ce.i r3 = r7.n0(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            ce.j r4 = r7.c0(r3)
            ce.j r4 = r7.y0(r4)
            boolean r4 = r7.f0(r4)
            if (r4 == 0) goto L3b
            ce.j r4 = r7.c0(r9)
            ce.j r4 = r7.y0(r4)
            boolean r4 = r7.f0(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = kotlin.jvm.internal.l0.g(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            ce.n r4 = r7.L(r3)
            ce.n r5 = r7.L(r9)
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            ce.o r3 = r6.m(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            ce.n r8 = r7.L(r8)
            ce.o r7 = r7.u0(r8, r2)
            return r7
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.g.m(ce.q, ce.i, ce.i):ce.o");
    }

    private final boolean n(g1 g1Var, ce.j jVar) {
        ce.q j4 = g1Var.j();
        ce.n d5 = j4.d(jVar);
        if (j4.v(d5)) {
            return j4.F(d5);
        }
        if (j4.F(j4.d(jVar))) {
            return true;
        }
        g1Var.k();
        ArrayDeque<ce.j> h4 = g1Var.h();
        kotlin.jvm.internal.l0.m(h4);
        Set<ce.j> i4 = g1Var.i();
        kotlin.jvm.internal.l0.m(i4);
        h4.push(jVar);
        while (!h4.isEmpty()) {
            if (i4.size() > 1000) {
                StringBuilder a5 = c.a(ProtectedSandApp.s("罂\u0001"), jVar, ProtectedSandApp.s("罃\u0001"));
                a5.append(kotlin.collections.w.m3(i4, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(a5.toString().toString());
            }
            ce.j pop = h4.pop();
            kotlin.jvm.internal.l0.m(pop);
            if (i4.add(pop)) {
                g1.c cVar = j4.p(pop) ? g1.c.C1193c.f78458a : g1.c.b.f78457a;
                if (kotlin.jvm.internal.l0.g(cVar, g1.c.C1193c.f78458a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ce.q j5 = g1Var.j();
                    Iterator<ce.i> it = j5.x(j5.d(pop)).iterator();
                    while (it.hasNext()) {
                        ce.j a6 = cVar.a(g1Var, it.next());
                        if (j4.F(j4.d(a6))) {
                            g1Var.e();
                            return true;
                        }
                        h4.add(a6);
                    }
                }
            }
        }
        g1Var.e();
        return false;
    }

    private final boolean o(ce.q qVar, ce.i iVar) {
        return (!qVar.z(qVar.L(iVar)) || qVar.k0(iVar) || qVar.W(iVar) || qVar.B0(iVar) || !kotlin.jvm.internal.l0.g(qVar.d(qVar.c0(iVar)), qVar.d(qVar.V(iVar)))) ? false : true;
    }

    private final boolean p(ce.q qVar, ce.j jVar, ce.j jVar2) {
        ce.j jVar3;
        ce.j jVar4;
        ce.e B = qVar.B(jVar);
        if (B == null || (jVar3 = qVar.e0(B)) == null) {
            jVar3 = jVar;
        }
        ce.e B2 = qVar.B(jVar2);
        if (B2 == null || (jVar4 = qVar.e0(B2)) == null) {
            jVar4 = jVar2;
        }
        if (qVar.d(jVar3) != qVar.d(jVar4)) {
            return false;
        }
        if (qVar.W(jVar) || !qVar.W(jVar2)) {
            return !qVar.O(jVar) || qVar.O(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(g gVar, g1 g1Var, ce.i iVar, ce.i iVar2, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return gVar.s(g1Var, iVar, iVar2, z4);
    }

    private final boolean u(g1 g1Var, ce.j jVar, ce.j jVar2) {
        ce.i n02;
        ce.q j4 = g1Var.j();
        if (f78428b) {
            if (!j4.f(jVar) && !j4.G(j4.d(jVar))) {
                g1Var.l(jVar);
            }
            if (!j4.f(jVar2)) {
                g1Var.l(jVar2);
            }
        }
        boolean z4 = false;
        if (!d.f78386a.d(g1Var, jVar, jVar2)) {
            return false;
        }
        g gVar = f78427a;
        Boolean a5 = gVar.a(g1Var, j4.c0(jVar), j4.V(jVar2));
        if (a5 != null) {
            boolean booleanValue = a5.booleanValue();
            g1.d(g1Var, jVar, jVar2, false, 4, null);
            return booleanValue;
        }
        ce.n d5 = j4.d(jVar2);
        boolean z5 = true;
        if ((j4.I(j4.d(jVar), d5) && j4.H(d5) == 0) || j4.j0(j4.d(jVar2))) {
            return true;
        }
        List<ce.j> l4 = gVar.l(g1Var, jVar, d5);
        int i4 = 10;
        ArrayList<ce.j> arrayList = new ArrayList(kotlin.collections.w.b0(l4, 10));
        for (ce.j jVar3 : l4) {
            ce.j g4 = j4.g(g1Var.o(jVar3));
            if (g4 != null) {
                jVar3 = g4;
            }
            arrayList.add(jVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f78427a.n(g1Var, jVar);
        }
        if (size == 1) {
            return f78427a.q(g1Var, j4.F0((ce.j) kotlin.collections.w.B2(arrayList)), jVar2);
        }
        ce.a aVar = new ce.a(j4.H(d5));
        int H = j4.H(d5);
        int i5 = 0;
        boolean z6 = false;
        while (i5 < H) {
            z6 = (z6 || j4.A(j4.u0(d5, i5)) != ce.v.OUT) ? z5 : z4;
            if (!z6) {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(arrayList, i4));
                for (ce.j jVar4 : arrayList) {
                    ce.m X = j4.X(jVar4, i5);
                    if (X != null) {
                        if (j4.s(X) != ce.v.INV) {
                            X = null;
                        }
                        if (X != null && (n02 = j4.n0(X)) != null) {
                            arrayList2.add(n02);
                        }
                    }
                    throw new IllegalStateException((ProtectedSandApp.s("罄\u0001") + jVar4 + ProtectedSandApp.s("罅\u0001") + jVar + ProtectedSandApp.s("罆\u0001") + jVar2).toString());
                }
                aVar.add(j4.h(j4.d0(arrayList2)));
            }
            i5++;
            z4 = false;
            z5 = true;
            i4 = 10;
        }
        if (z6 || !f78427a.q(g1Var, aVar, jVar2)) {
            return g1Var.q(new b(arrayList, g1Var, j4, jVar2));
        }
        return true;
    }

    private final boolean v(ce.q qVar, ce.i iVar, ce.i iVar2, ce.n nVar) {
        ce.o x02;
        ce.j g4 = qVar.g(iVar);
        if (!(g4 instanceof ce.d)) {
            return false;
        }
        ce.d dVar = (ce.d) g4;
        if (qVar.s0(dVar) || !qVar.y(qVar.n(qVar.u(dVar))) || qVar.T(dVar) != ce.b.FOR_SUBTYPING) {
            return false;
        }
        ce.n L = qVar.L(iVar2);
        ce.u uVar = L instanceof ce.u ? (ce.u) L : null;
        return (uVar == null || (x02 = qVar.x0(uVar)) == null || !qVar.E(x02, nVar)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ce.j> w(g1 g1Var, List<? extends ce.j> list) {
        int i4;
        ce.q j4 = g1Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ce.l F0 = j4.F0((ce.j) obj);
            int r4 = j4.r(F0);
            while (true) {
                if (i4 >= r4) {
                    arrayList.add(obj);
                    break;
                }
                i4 = j4.P(j4.n0(j4.i(F0, i4))) == null ? i4 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    @fg.m
    public final ce.v j(@fg.l ce.v vVar, @fg.l ce.v vVar2) {
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("罇\u0001"));
        kotlin.jvm.internal.l0.p(vVar2, ProtectedSandApp.s("罈\u0001"));
        ce.v vVar3 = ce.v.INV;
        if (vVar == vVar3) {
            return vVar2;
        }
        if (vVar2 == vVar3) {
            return vVar;
        }
        if (vVar == vVar2) {
            return vVar;
        }
        return null;
    }

    public final boolean k(@fg.l g1 g1Var, @fg.l ce.i iVar, @fg.l ce.i iVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罉\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("罊\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("罋\u0001"));
        ce.q j4 = g1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        g gVar = f78427a;
        if (gVar.o(j4, iVar) && gVar.o(j4, iVar2)) {
            ce.i o4 = g1Var.o(g1Var.p(iVar));
            ce.i o5 = g1Var.o(g1Var.p(iVar2));
            ce.j c02 = j4.c0(o4);
            if (!j4.I(j4.L(o4), j4.L(o5))) {
                return false;
            }
            if (j4.D0(c02) == 0) {
                return j4.U(o4) || j4.U(o5) || j4.O(c02) == j4.O(j4.c0(o5));
            }
        }
        return t(gVar, g1Var, iVar, iVar2, false, 8, null) && t(gVar, g1Var, iVar2, iVar, false, 8, null);
    }

    @fg.l
    public final List<ce.j> l(@fg.l g1 g1Var, @fg.l ce.j jVar, @fg.l ce.n nVar) {
        g1.c cVar;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罉\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("罌\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("罍\u0001"));
        ce.q j4 = g1Var.j();
        if (j4.p(jVar)) {
            return f78427a.h(g1Var, jVar, nVar);
        }
        if (!j4.v(nVar) && !j4.t0(nVar)) {
            return f78427a.g(g1Var, jVar, nVar);
        }
        kotlin.reflect.jvm.internal.impl.utils.f<ce.j> fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        g1Var.k();
        ArrayDeque<ce.j> h4 = g1Var.h();
        kotlin.jvm.internal.l0.m(h4);
        Set<ce.j> i4 = g1Var.i();
        kotlin.jvm.internal.l0.m(i4);
        h4.push(jVar);
        while (!h4.isEmpty()) {
            if (i4.size() > 1000) {
                StringBuilder a5 = c.a(ProtectedSandApp.s("罂\u0001"), jVar, ProtectedSandApp.s("罃\u0001"));
                a5.append(kotlin.collections.w.m3(i4, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(a5.toString().toString());
            }
            ce.j pop = h4.pop();
            kotlin.jvm.internal.l0.m(pop);
            if (i4.add(pop)) {
                if (j4.p(pop)) {
                    fVar.add(pop);
                    cVar = g1.c.C1193c.f78458a;
                } else {
                    cVar = g1.c.b.f78457a;
                }
                if (kotlin.jvm.internal.l0.g(cVar, g1.c.C1193c.f78458a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    ce.q j5 = g1Var.j();
                    Iterator<ce.i> it = j5.x(j5.d(pop)).iterator();
                    while (it.hasNext()) {
                        h4.add(cVar.a(g1Var, it.next()));
                    }
                }
            }
        }
        g1Var.e();
        ArrayList arrayList = new ArrayList();
        for (ce.j jVar2 : fVar) {
            g gVar = f78427a;
            kotlin.jvm.internal.l0.m(jVar2);
            kotlin.collections.w.q0(arrayList, gVar.h(g1Var, jVar2, nVar));
        }
        return arrayList;
    }

    public final boolean q(@fg.l g1 g1Var, @fg.l ce.l lVar, @fg.l ce.j jVar) {
        int i4;
        int i5;
        boolean k4;
        int i6;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罎\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("罏\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("罐\u0001"));
        ce.q j4 = g1Var.j();
        ce.n d5 = j4.d(jVar);
        int r4 = j4.r(lVar);
        int H = j4.H(d5);
        if (r4 != H || r4 != j4.D0(jVar)) {
            return false;
        }
        for (int i7 = 0; i7 < H; i7++) {
            ce.m h02 = j4.h0(jVar, i7);
            if (!j4.y(h02)) {
                ce.i n02 = j4.n0(h02);
                ce.m i10 = j4.i(lVar, i7);
                j4.s(i10);
                ce.v vVar = ce.v.INV;
                ce.i n03 = j4.n0(i10);
                g gVar = f78427a;
                ce.v j5 = gVar.j(j4.A(j4.u0(d5, i7)), j4.s(h02));
                if (j5 == null) {
                    return g1Var.m();
                }
                if (j5 != vVar || (!gVar.v(j4, n03, n02, d5) && !gVar.v(j4, n02, n03, d5))) {
                    i4 = g1Var.f78452g;
                    if (i4 > 100) {
                        throw new IllegalStateException((ProtectedSandApp.s("网\u0001") + n03).toString());
                    }
                    i5 = g1Var.f78452g;
                    g1Var.f78452g = i5 + 1;
                    int i11 = a.f78429a[j5.ordinal()];
                    if (i11 == 1) {
                        k4 = gVar.k(g1Var, n03, n02);
                    } else if (i11 == 2) {
                        k4 = t(gVar, g1Var, n03, n02, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k4 = t(gVar, g1Var, n02, n03, false, 8, null);
                    }
                    i6 = g1Var.f78452g;
                    g1Var.f78452g = i6 - 1;
                    if (!k4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @kd.j
    public final boolean r(@fg.l g1 g1Var, @fg.l ce.i iVar, @fg.l ce.i iVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罉\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("罌\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("罐\u0001"));
        return t(this, g1Var, iVar, iVar2, false, 8, null);
    }

    @kd.j
    public final boolean s(@fg.l g1 g1Var, @fg.l ce.i iVar, @fg.l ce.i iVar2, boolean z4) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罉\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("罌\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("罐\u0001"));
        if (iVar == iVar2) {
            return true;
        }
        if (g1Var.f(iVar, iVar2)) {
            return i(g1Var, iVar, iVar2, z4);
        }
        return false;
    }
}
