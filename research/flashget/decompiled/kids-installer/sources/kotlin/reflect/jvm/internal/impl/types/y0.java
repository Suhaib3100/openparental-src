package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.a1;

/* compiled from: TypeAliasExpander.kt */
/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f26561c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final y0 f26562d = new y0(a1.a.f26333a, false);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final a1 f26563a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26564b;

    /* compiled from: TypeAliasExpander.kt */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i5, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var) {
            if (i5 <= 100) {
                return;
            }
            throw new AssertionError(ProtectedSandApp.s("塣") + e1Var.getName());
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public y0(@d5.d a1 a1Var, boolean z5) {
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("塤"));
        this.f26563a = a1Var;
        this.f26564b = z5;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f());
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : gVar2) {
            if (hashSet.contains(cVar.f())) {
                this.f26563a.a(cVar);
            }
        }
    }

    private final void b(h0 h0Var, h0 h0Var2) {
        q1 f6 = q1.f(h0Var2);
        kotlin.jvm.internal.l0.o(f6, ProtectedSandApp.s("塥"));
        int i5 = 0;
        for (Object obj : h0Var2.S0()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            l1 l1Var = (l1) obj;
            if (!l1Var.c()) {
                h0 type = l1Var.getType();
                String s5 = ProtectedSandApp.s("塦");
                kotlin.jvm.internal.l0.o(type, s5);
                if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(type)) {
                    l1 l1Var2 = h0Var.S0().get(i5);
                    kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = h0Var.U0().r().get(i5);
                    if (this.f26564b) {
                        a1 a1Var = this.f26563a;
                        h0 type2 = l1Var2.getType();
                        kotlin.jvm.internal.l0.o(type2, ProtectedSandApp.s("塧"));
                        h0 type3 = l1Var.getType();
                        kotlin.jvm.internal.l0.o(type3, s5);
                        kotlin.jvm.internal.l0.o(f1Var, ProtectedSandApp.s("塨"));
                        a1Var.c(f6, type2, type3, f1Var);
                    }
                }
            }
            i5 = i6;
        }
    }

    private final w c(w wVar, d1 d1Var) {
        return wVar.a1(h(wVar, d1Var));
    }

    private final p0 d(p0 p0Var, d1 d1Var) {
        return j0.a(p0Var) ? p0Var : p1.f(p0Var, null, h(p0Var, d1Var), 1, null);
    }

    private final p0 e(p0 p0Var, h0 h0Var) {
        p0 r5 = t1.r(p0Var, h0Var.V0());
        kotlin.jvm.internal.l0.o(r5, ProtectedSandApp.s("塩"));
        return r5;
    }

    private final p0 f(p0 p0Var, h0 h0Var) {
        return d(e(p0Var, h0Var), h0Var.T0());
    }

    private final p0 g(z0 z0Var, d1 d1Var, boolean z5) {
        h1 m5 = z0Var.b().m();
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("塪"));
        return i0.m(d1Var, m5, z0Var.a(), z5, h.c.f26018b);
    }

    private final d1 h(h0 h0Var, d1 d1Var) {
        return j0.a(h0Var) ? h0Var.T0() : d1Var.p(h0Var.T0());
    }

    private final l1 j(l1 l1Var, z0 z0Var, int i5) {
        int b02;
        w1 X0 = l1Var.getType().X0();
        if (x.a(X0)) {
            return l1Var;
        }
        p0 a6 = p1.a(X0);
        if (j0.a(a6) || !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.x(a6)) {
            return l1Var;
        }
        h1 U0 = a6.U0();
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = U0.b();
        U0.r().size();
        a6.S0().size();
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return l1Var;
        }
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1)) {
            p0 m5 = m(a6, z0Var, i5);
            b(a6, m5);
            return new n1(l1Var.b(), m5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var = (kotlin.reflect.jvm.internal.impl.descriptors.e1) b6;
        int i6 = 0;
        if (z0Var.d(e1Var)) {
            this.f26563a.d(e1Var);
            x1 x1Var = x1.INVARIANT;
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.RECURSIVE_TYPE_ALIAS;
            String fVar = e1Var.getName().toString();
            kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("填"));
            return new n1(x1Var, kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, fVar));
        }
        List<l1> S0 = a6.S0();
        b02 = kotlin.collections.b0.b0(S0, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Object obj : S0) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.a0.Z();
            }
            arrayList.add(l((l1) obj, z0Var, U0.r().get(i6), i5 + 1));
            i6 = i7;
        }
        p0 k5 = k(z0.f26568e.a(z0Var, e1Var, arrayList), a6.T0(), a6.V0(), i5 + 1, false);
        p0 m6 = m(a6, z0Var, i5);
        if (!x.a(k5)) {
            k5 = t0.j(k5, m6);
        }
        return new n1(l1Var.b(), k5);
    }

    private final p0 k(z0 z0Var, d1 d1Var, boolean z5, int i5, boolean z6) {
        l1 l5 = l(new n1(x1.INVARIANT, z0Var.b().n0()), z0Var, null, i5);
        h0 type = l5.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("塬"));
        p0 a6 = p1.a(type);
        if (j0.a(a6)) {
            return a6;
        }
        l5.b();
        a(a6.getAnnotations(), l.a(d1Var));
        p0 r5 = t1.r(d(a6, d1Var), z5);
        kotlin.jvm.internal.l0.o(r5, ProtectedSandApp.s("塭"));
        return z6 ? t0.j(r5, g(z0Var, d1Var, z5)) : r5;
    }

    private final l1 l(l1 l1Var, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, int i5) {
        x1 x1Var;
        x1 x1Var2;
        x1 x1Var3;
        f26561c.b(i5, z0Var.b());
        boolean c6 = l1Var.c();
        String s5 = ProtectedSandApp.s("塮");
        if (c6) {
            kotlin.jvm.internal.l0.m(f1Var);
            l1 s6 = t1.s(f1Var);
            kotlin.jvm.internal.l0.o(s6, s5);
            return s6;
        }
        h0 type = l1Var.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("塯"));
        l1 c7 = z0Var.c(type.U0());
        if (c7 == null) {
            return j(l1Var, z0Var, i5);
        }
        if (c7.c()) {
            kotlin.jvm.internal.l0.m(f1Var);
            l1 s7 = t1.s(f1Var);
            kotlin.jvm.internal.l0.o(s7, s5);
            return s7;
        }
        w1 X0 = c7.getType().X0();
        x1 b6 = c7.b();
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("塰"));
        x1 b7 = l1Var.b();
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("塱"));
        if (b7 != b6 && b7 != (x1Var3 = x1.INVARIANT)) {
            if (b6 == x1Var3) {
                b6 = b7;
            } else {
                this.f26563a.b(z0Var.b(), f1Var, X0);
            }
        }
        if (f1Var == null || (x1Var = f1Var.z()) == null) {
            x1Var = x1.INVARIANT;
        }
        kotlin.jvm.internal.l0.o(x1Var, ProtectedSandApp.s("塲"));
        if (x1Var != b6 && x1Var != (x1Var2 = x1.INVARIANT)) {
            if (b6 == x1Var2) {
                b6 = x1Var2;
            } else {
                this.f26563a.b(z0Var.b(), f1Var, X0);
            }
        }
        a(type.getAnnotations(), X0.getAnnotations());
        return new n1(b6, X0 instanceof w ? c((w) X0, type.T0()) : f(p1.a(X0), type));
    }

    private final p0 m(p0 p0Var, z0 z0Var, int i5) {
        int b02;
        h1 U0 = p0Var.U0();
        List<l1> S0 = p0Var.S0();
        b02 = kotlin.collections.b0.b0(S0, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i6 = 0;
        for (Object obj : S0) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.a0.Z();
            }
            l1 l1Var = (l1) obj;
            l1 l5 = l(l1Var, z0Var, U0.r().get(i6), i5 + 1);
            if (!l5.c()) {
                l5 = new n1(l5.b(), t1.q(l5.getType(), l1Var.getType().V0()));
            }
            arrayList.add(l5);
            i6 = i7;
        }
        return p1.f(p0Var, arrayList, null, 2, null);
    }

    @d5.d
    public final p0 i(@d5.d z0 z0Var, @d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(z0Var, ProtectedSandApp.s("塳"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("塴"));
        return k(z0Var, d1Var, false, 0, true);
    }
}
