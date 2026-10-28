package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import ld.l;

/* compiled from: CapturedTypeApproximation.kt */
@r1({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1747#2,3:179\n1549#2:183\n1620#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78553a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78553a = iArr;
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.b$b, reason: collision with other inner class name */
    static final class C1197b extends n0 implements l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1197b f78554b = new C1197b(1);

        C1197b() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(w1 w1Var) {
            l0.m(w1Var);
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(w1Var));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    public static final class c extends i1 {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.i1
        @m
        public l1 k(@fg.l h1 h1Var) {
            l0.p(h1Var, ProtectedSandApp.s("聠\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b bVar = h1Var instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b ? (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) h1Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.getProjection().b() ? new n1(x1.OUT_VARIANCE, bVar.getProjection().getType()) : bVar.getProjection();
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    static final class d extends n0 implements l<f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78555b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l f fVar) {
            l0.p(fVar, ProtectedSandApp.s("聡\u0001"));
            fVar.o(b.a.f77789a);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a(@fg.l h0 h0Var) {
        Object e4;
        l0.p(h0Var, ProtectedSandApp.s("聢\u0001"));
        if (e0.b(h0Var)) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a5 = a(e0.c(h0Var));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a6 = a(e0.d(h0Var));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(v1.b(i0.d(e0.c(a5.c()), e0.d(a6.c())), h0Var), v1.b(i0.d(e0.c(a5.d()), e0.d(a6.d())), h0Var));
        }
        h1 O0 = h0Var.O0();
        boolean d5 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(h0Var);
        String s4 = ProtectedSandApp.s("聣\u0001");
        if (d5) {
            l0.n(O0, ProtectedSandApp.s("聤\u0001"));
            l1 projection = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) O0).getProjection();
            h0 type = projection.getType();
            l0.o(type, ProtectedSandApp.s("聥\u0001"));
            h0 b5 = b(type, h0Var);
            int i4 = a.f78553a[projection.c().ordinal()];
            if (i4 == 2) {
                p0 I = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).I();
                l0.o(I, ProtectedSandApp.s("聧\u0001"));
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(b5, I);
            }
            if (i4 == 3) {
                p0 H = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).H();
                l0.o(H, s4);
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(b(H, h0Var), b5);
            }
            throw new AssertionError(ProtectedSandApp.s("聦\u0001") + projection);
        }
        if (h0Var.M0().isEmpty() || h0Var.M0().size() != O0.getParameters().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(h0Var, h0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<l1> M0 = h0Var.M0();
        List<f1> parameters = O0.getParameters();
        l0.o(parameters, ProtectedSandApp.s("聨\u0001"));
        for (q0 q0Var : w.i6(M0, parameters)) {
            l1 l1Var = (l1) q0Var.a();
            f1 f1Var = (f1) q0Var.b();
            l0.m(f1Var);
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.c g4 = g(l1Var, f1Var);
            if (l1Var.b()) {
                arrayList.add(g4);
                arrayList2.add(g4);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> d6 = d(g4);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.c a7 = d6.a();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.c b6 = d6.b();
                arrayList.add(a7);
                arrayList2.add(b6);
            }
        }
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((kotlin.reflect.jvm.internal.impl.types.typesApproximation.c) it.next()).d()) {
                    z4 = true;
                    break;
                }
            }
        }
        if (z4) {
            e4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).H();
            l0.o(e4, s4);
        } else {
            e4 = e(h0Var, arrayList);
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(e4, e(h0Var, arrayList2));
    }

    private static final h0 b(h0 h0Var, h0 h0Var2) {
        h0 q4 = t1.q(h0Var, h0Var2.P0());
        l0.o(q4, ProtectedSandApp.s("聩\u0001"));
        return q4;
    }

    @m
    public static final l1 c(@m l1 l1Var, boolean z4) {
        if (l1Var == null) {
            return null;
        }
        if (l1Var.b()) {
            return l1Var;
        }
        h0 type = l1Var.getType();
        l0.o(type, ProtectedSandApp.s("聥\u0001"));
        if (!t1.c(type, C1197b.f78554b)) {
            return l1Var;
        }
        x1 c5 = l1Var.c();
        l0.o(c5, ProtectedSandApp.s("聪\u0001"));
        return c5 == x1.OUT_VARIANCE ? new n1(c5, a(type).d()) : z4 ? new n1(c5, a(type).c()) : f(l1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> d(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar) {
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a5 = a(cVar.a());
        h0 a6 = a5.a();
        h0 b5 = a5.b();
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a7 = a(cVar.b());
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(cVar.c(), b5, a7.a()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(cVar.c(), a6, a7.b()));
    }

    private static final h0 e(h0 h0Var, List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> list) {
        h0Var.M0().size();
        list.size();
        List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((kotlin.reflect.jvm.internal.impl.types.typesApproximation.c) it.next()));
        }
        return p1.e(h0Var, arrayList, null, null, 6, null);
    }

    private static final l1 f(l1 l1Var) {
        q1 g4 = q1.g(new c());
        l0.o(g4, ProtectedSandApp.s("聫\u0001"));
        return g4.t(l1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.c g(l1 l1Var, f1 f1Var) {
        int i4 = a.f78553a[q1.c(f1Var.o(), l1Var).ordinal()];
        String s4 = ProtectedSandApp.s("聥\u0001");
        if (i4 == 1) {
            h0 type = l1Var.getType();
            l0.o(type, s4);
            h0 type2 = l1Var.getType();
            l0.o(type2, s4);
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, type, type2);
        }
        if (i4 == 2) {
            h0 type3 = l1Var.getType();
            l0.o(type3, s4);
            p0 I = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).I();
            l0.o(I, ProtectedSandApp.s("聧\u0001"));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, type3, I);
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        p0 H = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).H();
        l0.o(H, ProtectedSandApp.s("聣\u0001"));
        h0 type4 = l1Var.getType();
        l0.o(type4, s4);
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, H, type4);
    }

    private static final l1 h(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar) {
        cVar.d();
        if (!l0.g(cVar.a(), cVar.b())) {
            x1 o4 = cVar.c().o();
            x1 x1Var = x1.IN_VARIANCE;
            if (o4 != x1Var) {
                return (!h.n0(cVar.a()) || cVar.c().o() == x1Var) ? h.p0(cVar.b()) ? new n1(i(cVar, x1Var), cVar.a()) : new n1(i(cVar, x1.OUT_VARIANCE), cVar.b()) : new n1(i(cVar, x1.OUT_VARIANCE), cVar.b());
            }
        }
        return new n1(cVar.a());
    }

    private static final x1 i(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar, x1 x1Var) {
        return x1Var == cVar.c().o() ? x1.INVARIANT : x1Var;
    }
}
