package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.a1;

/* compiled from: TypeAliasExpander.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1620#3,3:280\n1559#3:283\n1590#3,4:284\n1559#3:288\n1590#3,4:289\n1864#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f78570c = new a();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final y0 f78571d = new y0(a1.a.f78341a, false);

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final a1 f78572a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78573b;

    /* compiled from: TypeAliasExpander.kt */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i4, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var) {
            if (i4 <= 100) {
                return;
            }
            throw new AssertionError(ProtectedSandApp.s("肢\u0001") + e1Var.getName());
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public y0(@fg.l a1 a1Var, boolean z4) {
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("肣\u0001"));
        this.f78572a = a1Var;
        this.f78573b = z4;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : gVar2) {
            if (hashSet.contains(cVar.g())) {
                this.f78572a.c(cVar);
            }
        }
    }

    private final void b(h0 h0Var, h0 h0Var2) {
        q1 f4 = q1.f(h0Var2);
        kotlin.jvm.internal.l0.o(f4, ProtectedSandApp.s("肤\u0001"));
        int i4 = 0;
        for (Object obj : h0Var2.M0()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            l1 l1Var = (l1) obj;
            if (!l1Var.b()) {
                h0 type = l1Var.getType();
                String s4 = ProtectedSandApp.s("肥\u0001");
                kotlin.jvm.internal.l0.o(type, s4);
                if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(type)) {
                    l1 l1Var2 = h0Var.M0().get(i4);
                    kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = h0Var.O0().getParameters().get(i4);
                    if (this.f78573b) {
                        a1 a1Var = this.f78572a;
                        h0 type2 = l1Var2.getType();
                        kotlin.jvm.internal.l0.o(type2, s4);
                        h0 type3 = l1Var.getType();
                        kotlin.jvm.internal.l0.o(type3, s4);
                        kotlin.jvm.internal.l0.m(f1Var);
                        a1Var.a(f4, type2, type3, f1Var);
                    }
                }
            }
            i4 = i5;
        }
    }

    private final w c(w wVar, d1 d1Var) {
        return wVar.U0(h(wVar, d1Var));
    }

    private final p0 d(p0 p0Var, d1 d1Var) {
        return j0.a(p0Var) ? p0Var : p1.f(p0Var, null, h(p0Var, d1Var), 1, null);
    }

    private final p0 e(p0 p0Var, h0 h0Var) {
        p0 r4 = t1.r(p0Var, h0Var.P0());
        kotlin.jvm.internal.l0.o(r4, ProtectedSandApp.s("肦\u0001"));
        return r4;
    }

    private final p0 f(p0 p0Var, h0 h0Var) {
        return d(e(p0Var, h0Var), h0Var.N0());
    }

    private final p0 g(z0 z0Var, d1 d1Var, boolean z4) {
        h1 j4 = z0Var.b().j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("肧\u0001"));
        return i0.m(d1Var, j4, z0Var.a(), z4, h.c.f78002b);
    }

    private final d1 h(h0 h0Var, d1 d1Var) {
        return j0.a(h0Var) ? h0Var.N0() : d1Var.j(h0Var.N0());
    }

    private final l1 j(l1 l1Var, z0 z0Var, int i4) {
        w1 R0 = l1Var.getType().R0();
        if (x.a(R0)) {
            return l1Var;
        }
        p0 a5 = p1.a(R0);
        if (j0.a(a5) || !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.z(a5)) {
            return l1Var;
        }
        h1 O0 = a5.O0();
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = O0.c();
        O0.getParameters().size();
        a5.M0().size();
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return l1Var;
        }
        if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1)) {
            p0 m4 = m(a5, z0Var, i4);
            b(a5, m4);
            return new n1(l1Var.c(), m4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var = (kotlin.reflect.jvm.internal.impl.descriptors.e1) c5;
        if (z0Var.d(e1Var)) {
            this.f78572a.b(e1Var);
            x1 x1Var = x1.INVARIANT;
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.RECURSIVE_TYPE_ALIAS;
            String fVar = e1Var.getName().toString();
            kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("肨\u0001"));
            return new n1(x1Var, kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, fVar));
        }
        List<l1> M0 = a5.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(M0, 10));
        int i5 = 0;
        for (Object obj : M0) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.Z();
            }
            arrayList.add(l((l1) obj, z0Var, O0.getParameters().get(i5), i4 + 1));
            i5 = i6;
        }
        p0 k4 = k(z0.f78577e.a(z0Var, e1Var, arrayList), a5.N0(), a5.P0(), i4 + 1, false);
        p0 m5 = m(a5, z0Var, i4);
        if (!x.a(k4)) {
            k4 = t0.j(k4, m5);
        }
        return new n1(l1Var.c(), k4);
    }

    private final p0 k(z0 z0Var, d1 d1Var, boolean z4, int i4, boolean z5) {
        l1 l4 = l(new n1(x1.INVARIANT, z0Var.b().v0()), z0Var, null, i4);
        h0 type = l4.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("肥\u0001"));
        p0 a5 = p1.a(type);
        if (j0.a(a5)) {
            return a5;
        }
        l4.c();
        a(a5.getAnnotations(), l.a(d1Var));
        p0 r4 = t1.r(d(a5, d1Var), z4);
        kotlin.jvm.internal.l0.o(r4, ProtectedSandApp.s("肩\u0001"));
        return z5 ? t0.j(r4, g(z0Var, d1Var, z4)) : r4;
    }

    private final l1 l(l1 l1Var, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, int i4) {
        x1 x1Var;
        x1 x1Var2;
        x1 x1Var3;
        f78570c.b(i4, z0Var.b());
        boolean b5 = l1Var.b();
        String s4 = ProtectedSandApp.s("肪\u0001");
        if (b5) {
            kotlin.jvm.internal.l0.m(f1Var);
            l1 s5 = t1.s(f1Var);
            kotlin.jvm.internal.l0.o(s5, s4);
            return s5;
        }
        h0 type = l1Var.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("肥\u0001"));
        l1 c5 = z0Var.c(type.O0());
        if (c5 == null) {
            return j(l1Var, z0Var, i4);
        }
        if (c5.b()) {
            kotlin.jvm.internal.l0.m(f1Var);
            l1 s6 = t1.s(f1Var);
            kotlin.jvm.internal.l0.o(s6, s4);
            return s6;
        }
        w1 R0 = c5.getType().R0();
        x1 c6 = c5.c();
        String s7 = ProtectedSandApp.s("肫\u0001");
        kotlin.jvm.internal.l0.o(c6, s7);
        x1 c7 = l1Var.c();
        kotlin.jvm.internal.l0.o(c7, s7);
        if (c7 != c6 && c7 != (x1Var3 = x1.INVARIANT)) {
            if (c6 == x1Var3) {
                c6 = c7;
            } else {
                this.f78572a.d(z0Var.b(), f1Var, R0);
            }
        }
        if (f1Var == null || (x1Var = f1Var.o()) == null) {
            x1Var = x1.INVARIANT;
        }
        kotlin.jvm.internal.l0.m(x1Var);
        if (x1Var != c6 && x1Var != (x1Var2 = x1.INVARIANT)) {
            if (c6 == x1Var2) {
                c6 = x1Var2;
            } else {
                this.f78572a.d(z0Var.b(), f1Var, R0);
            }
        }
        a(type.getAnnotations(), R0.getAnnotations());
        return new n1(c6, R0 instanceof w ? c((w) R0, type.N0()) : f(p1.a(R0), type));
    }

    private final p0 m(p0 p0Var, z0 z0Var, int i4) {
        h1 O0 = p0Var.O0();
        List<l1> M0 = p0Var.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(M0, 10));
        int i5 = 0;
        for (Object obj : M0) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.Z();
            }
            l1 l1Var = (l1) obj;
            l1 l4 = l(l1Var, z0Var, O0.getParameters().get(i5), i4 + 1);
            if (!l4.b()) {
                l4 = new n1(l4.c(), t1.q(l4.getType(), l1Var.getType().P0()));
            }
            arrayList.add(l4);
            i5 = i6;
        }
        return p1.f(p0Var, arrayList, null, 2, null);
    }

    @fg.l
    public final p0 i(@fg.l z0 z0Var, @fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(z0Var, ProtectedSandApp.s("肬\u0001"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("肭\u0001"));
        return k(z0Var, d1Var, false, 0, true);
    }
}
