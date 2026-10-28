package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
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
import q3.l;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26544a;

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
            f26544a = iArr;
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.b$b, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0393b extends Lambda implements l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0393b f26545p = new C0393b();

        C0393b() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(w1 w1Var) {
            l0.o(w1Var, ProtectedSandApp.s("覡"));
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(w1Var));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* loaded from: classes6.dex */
    public static final class c extends i1 {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.i1
        @e
        public l1 k(@d5.d h1 h1Var) {
            l0.p(h1Var, ProtectedSandApp.s("覢"));
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b bVar = h1Var instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b ? (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) h1Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.e().c() ? new n1(x1.OUT_VARIANCE, bVar.e().getType()) : bVar.e();
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements l<f, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26546p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(f fVar) {
            a(fVar);
            return m2.f23662a;
        }

        public final void a(@d5.d f fVar) {
            l0.p(fVar, ProtectedSandApp.s("覣"));
            fVar.h(b.a.f25807a);
        }
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a(@d5.d h0 h0Var) {
        List<Pair> i6;
        boolean z5;
        Object e6;
        l0.p(h0Var, ProtectedSandApp.s("堭"));
        if (e0.b(h0Var)) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a6 = a(e0.c(h0Var));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a7 = a(e0.d(h0Var));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(v1.b(i0.d(e0.c(a6.c()), e0.d(a7.c())), h0Var), v1.b(i0.d(e0.c(a6.d()), e0.d(a7.d())), h0Var));
        }
        h1 U0 = h0Var.U0();
        boolean d6 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(h0Var);
        String s5 = ProtectedSandApp.s("堮");
        if (d6) {
            l0.n(U0, ProtectedSandApp.s("堯"));
            l1 e7 = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) U0).e();
            h0 type = e7.getType();
            l0.o(type, ProtectedSandApp.s("堰"));
            h0 b6 = b(type, h0Var);
            int i5 = a.f26544a[e7.b().ordinal()];
            if (i5 == 2) {
                p0 I = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).I();
                l0.o(I, ProtectedSandApp.s("堲"));
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(b6, I);
            }
            if (i5 == 3) {
                p0 H = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).H();
                l0.o(H, s5);
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(b(H, h0Var), b6);
            }
            throw new AssertionError(ProtectedSandApp.s("報") + e7);
        }
        if (h0Var.S0().isEmpty() || h0Var.S0().size() != U0.r().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(h0Var, h0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<l1> S0 = h0Var.S0();
        List<f1> r5 = U0.r();
        l0.o(r5, ProtectedSandApp.s("堳"));
        i6 = j0.i6(S0, r5);
        for (Pair pair : i6) {
            l1 l1Var = (l1) pair.a();
            f1 f1Var = (f1) pair.b();
            l0.o(f1Var, ProtectedSandApp.s("場"));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.c g5 = g(l1Var, f1Var);
            if (l1Var.c()) {
                arrayList.add(g5);
                arrayList2.add(g5);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> d7 = d(g5);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.c a8 = d7.a();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.c b7 = d7.b();
                arrayList.add(a8);
                arrayList2.add(b7);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z5 = true;
                if (!((kotlin.reflect.jvm.internal.impl.types.typesApproximation.c) it.next()).d()) {
                    break;
                }
            }
        }
        z5 = false;
        if (z5) {
            e6 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).H();
            l0.o(e6, s5);
        } else {
            e6 = e(h0Var, arrayList);
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(e6, e(h0Var, arrayList2));
    }

    private static final h0 b(h0 h0Var, h0 h0Var2) {
        h0 q5 = t1.q(h0Var, h0Var2.V0());
        l0.o(q5, ProtectedSandApp.s("堵"));
        return q5;
    }

    @e
    public static final l1 c(@e l1 l1Var, boolean z5) {
        if (l1Var == null) {
            return null;
        }
        if (l1Var.c()) {
            return l1Var;
        }
        h0 type = l1Var.getType();
        l0.o(type, ProtectedSandApp.s("堶"));
        if (!t1.c(type, C0393b.f26545p)) {
            return l1Var;
        }
        x1 b6 = l1Var.b();
        l0.o(b6, ProtectedSandApp.s("堷"));
        return b6 == x1.OUT_VARIANCE ? new n1(b6, a(type).d()) : z5 ? new n1(b6, a(type).c()) : f(l1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> d(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar) {
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a6 = a(cVar.a());
        h0 a7 = a6.a();
        h0 b6 = a6.b();
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<h0> a8 = a(cVar.b());
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(cVar.c(), b6, a8.a()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(cVar.c(), a7, a8.b()));
    }

    private static final h0 e(h0 h0Var, List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.c> list) {
        int b02;
        h0Var.S0().size();
        list.size();
        b02 = b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((kotlin.reflect.jvm.internal.impl.types.typesApproximation.c) it.next()));
        }
        return p1.e(h0Var, arrayList, null, null, 6, null);
    }

    private static final l1 f(l1 l1Var) {
        q1 g5 = q1.g(new c());
        l0.o(g5, ProtectedSandApp.s("堸"));
        return g5.t(l1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.c g(l1 l1Var, f1 f1Var) {
        int i5 = a.f26544a[q1.c(f1Var.z(), l1Var).ordinal()];
        String s5 = ProtectedSandApp.s("堹");
        if (i5 == 1) {
            h0 type = l1Var.getType();
            l0.o(type, s5);
            h0 type2 = l1Var.getType();
            l0.o(type2, s5);
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, type, type2);
        }
        if (i5 == 2) {
            h0 type3 = l1Var.getType();
            l0.o(type3, s5);
            p0 I = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).I();
            l0.o(I, ProtectedSandApp.s("堻"));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, type3, I);
        }
        if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        p0 H = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).H();
        l0.o(H, ProtectedSandApp.s("堺"));
        h0 type4 = l1Var.getType();
        l0.o(type4, s5);
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.c(f1Var, H, type4);
    }

    private static final l1 h(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar) {
        cVar.d();
        if (!l0.g(cVar.a(), cVar.b())) {
            x1 z5 = cVar.c().z();
            x1 x1Var = x1.IN_VARIANCE;
            if (z5 != x1Var) {
                return (!h.m0(cVar.a()) || cVar.c().z() == x1Var) ? h.o0(cVar.b()) ? new n1(i(cVar, x1Var), cVar.a()) : new n1(i(cVar, x1.OUT_VARIANCE), cVar.b()) : new n1(i(cVar, x1.OUT_VARIANCE), cVar.b());
            }
        }
        return new n1(cVar.a());
    }

    private static final x1 i(kotlin.reflect.jvm.internal.impl.types.typesApproximation.c cVar, x1 x1Var) {
        return x1Var == cVar.c().z() ? x1.INVARIANT : x1Var;
    }
}
