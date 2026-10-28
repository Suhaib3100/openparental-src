package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import h4.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.x1;
import p3.j;
import q3.l;

/* compiled from: TypeUtils.kt */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typeUtil.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0392a extends Lambda implements l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0392a f26538p = new C0392a();

        C0392a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("覞"));
            h b6 = w1Var.U0().b();
            return Boolean.valueOf(b6 != null ? a.q(b6) : false);
        }
    }

    /* compiled from: TypeUtils.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f26539p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(w1 w1Var) {
            return Boolean.valueOf(t1.m(w1Var));
        }
    }

    /* compiled from: TypeUtils.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26540p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("覟"));
            h b6 = w1Var.U0().b();
            boolean z5 = false;
            if (b6 != null && ((b6 instanceof e1) || (b6 instanceof f1))) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: TypeUtils.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements l<w1, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26541p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("覠"));
            return Boolean.valueOf((w1Var instanceof x0) || (w1Var.U0() instanceof v) || j0.a(w1Var));
        }
    }

    @d5.d
    public static final l1 a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堇"));
        return new n1(h0Var);
    }

    public static final boolean b(@d5.d h0 h0Var, @d5.d l<? super w1, Boolean> lVar) {
        l0.p(h0Var, ProtectedSandApp.s("堈"));
        l0.p(lVar, ProtectedSandApp.s("堉"));
        return t1.c(h0Var, lVar);
    }

    private static final boolean c(h0 h0Var, h1 h1Var, Set<? extends f1> set) {
        Iterable<IndexedValue> h6;
        f1 f1Var;
        boolean z5;
        Object W2;
        if (l0.g(h0Var.U0(), h1Var)) {
            return true;
        }
        h b6 = h0Var.U0().b();
        i iVar = b6 instanceof i ? (i) b6 : null;
        List<f1> G = iVar != null ? iVar.G() : null;
        h6 = kotlin.collections.j0.h6(h0Var.S0());
        if (!(h6 instanceof Collection) || !((Collection) h6).isEmpty()) {
            for (IndexedValue indexedValue : h6) {
                int f23235a = indexedValue.getF23235a();
                l1 l1Var = (l1) indexedValue.b();
                if (G != null) {
                    W2 = kotlin.collections.j0.W2(G, f23235a);
                    f1Var = (f1) W2;
                } else {
                    f1Var = null;
                }
                if (((f1Var == null || set == null || !set.contains(f1Var)) ? false : true) || l1Var.c()) {
                    z5 = false;
                } else {
                    h0 type = l1Var.getType();
                    l0.o(type, ProtectedSandApp.s("堊"));
                    z5 = c(type, h1Var, set);
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堋"));
        return b(h0Var, C0392a.f26538p);
    }

    public static final boolean e(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堌"));
        return t1.c(h0Var, b.f26539p);
    }

    @d5.d
    public static final l1 f(@d5.d h0 h0Var, @d5.d x1 x1Var, @e f1 f1Var) {
        l0.p(h0Var, ProtectedSandApp.s("堍"));
        l0.p(x1Var, ProtectedSandApp.s("堎"));
        if ((f1Var != null ? f1Var.z() : null) == x1Var) {
            x1Var = x1.INVARIANT;
        }
        return new n1(x1Var, h0Var);
    }

    @d5.d
    public static final Set<f1> g(@d5.d h0 h0Var, @e Set<? extends f1> set) {
        l0.p(h0Var, ProtectedSandApp.s("堏"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(h0Var, h0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(h0 h0Var, h0 h0Var2, Set<f1> set, Set<? extends f1> set2) {
        f1 f1Var;
        boolean W1;
        Object W2;
        h b6 = h0Var.U0().b();
        if (b6 instanceof f1) {
            if (!l0.g(h0Var.U0(), h0Var2.U0())) {
                set.add(b6);
                return;
            }
            for (h0 h0Var3 : ((f1) b6).getUpperBounds()) {
                l0.o(h0Var3, ProtectedSandApp.s("堐"));
                h(h0Var3, h0Var2, set, set2);
            }
            return;
        }
        h b7 = h0Var.U0().b();
        i iVar = b7 instanceof i ? (i) b7 : null;
        List<f1> G = iVar != null ? iVar.G() : null;
        int i5 = 0;
        for (l1 l1Var : h0Var.S0()) {
            int i6 = i5 + 1;
            if (G != null) {
                W2 = kotlin.collections.j0.W2(G, i5);
                f1Var = (f1) W2;
            } else {
                f1Var = null;
            }
            if (!((f1Var == null || set2 == null || !set2.contains(f1Var)) ? false : true) && !l1Var.c()) {
                W1 = kotlin.collections.j0.W1(set, l1Var.getType().U0().b());
                if (!W1 && !l0.g(l1Var.getType().U0(), h0Var2.U0())) {
                    h0 type = l1Var.getType();
                    l0.o(type, ProtectedSandApp.s("堑"));
                    h(type, h0Var2, set, set2);
                }
            }
            i5 = i6;
        }
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.builtins.h i(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堒"));
        kotlin.reflect.jvm.internal.impl.builtins.h A = h0Var.U0().A();
        l0.o(A, ProtectedSandApp.s("堓"));
        return A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r3 = r2;
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.h0 j(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 r7) {
        /*
            java.lang.String r0 = "堔"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "堕"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.l0.o(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L59
            java.lang.Object r2 = r0.next()
            r4 = r2
            kotlin.reflect.jvm.internal.impl.types.h0 r4 = (kotlin.reflect.jvm.internal.impl.types.h0) r4
            kotlin.reflect.jvm.internal.impl.types.h1 r4 = r4.U0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.b()
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e
            if (r5 == 0) goto L41
            r3 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r3
        L41:
            r4 = 0
            if (r3 != 0) goto L45
            goto L56
        L45:
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r3.j()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE
            if (r5 == r6) goto L56
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS
            if (r3 == r5) goto L56
            r4 = 1
        L56:
            if (r4 == 0) goto L24
            r3 = r2
        L59:
            kotlin.reflect.jvm.internal.impl.types.h0 r3 = (kotlin.reflect.jvm.internal.impl.types.h0) r3
            if (r3 != 0) goto L74
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.l0.o(r7, r1)
            java.lang.Object r7 = kotlin.collections.y.B2(r7)
            java.lang.String r0 = "堖"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r7, r0)
            r3 = r7
            kotlin.reflect.jvm.internal.impl.types.h0 r3 = (kotlin.reflect.jvm.internal.impl.types.h0) r3
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(kotlin.reflect.jvm.internal.impl.descriptors.f1):kotlin.reflect.jvm.internal.impl.types.h0");
    }

    @j
    public static final boolean k(@d5.d f1 f1Var) {
        l0.p(f1Var, ProtectedSandApp.s("堗"));
        return m(f1Var, null, null, 6, null);
    }

    @j
    public static final boolean l(@d5.d f1 f1Var, @e h1 h1Var, @e Set<? extends f1> set) {
        l0.p(f1Var, ProtectedSandApp.s("堘"));
        List<h0> upperBounds = f1Var.getUpperBounds();
        l0.o(upperBounds, ProtectedSandApp.s("堙"));
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (h0 h0Var : upperBounds) {
            l0.o(h0Var, ProtectedSandApp.s("堚"));
            if (c(h0Var, f1Var.E().U0(), set) && (h1Var == null || l0.g(h0Var.U0(), h1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(f1 f1Var, h1 h1Var, Set set, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            h1Var = null;
        }
        if ((i5 & 4) != 0) {
            set = null;
        }
        return l(f1Var, h1Var, set);
    }

    public static final boolean n(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堛"));
        if (h0Var instanceof f) {
            return true;
        }
        return (h0Var instanceof q) && (((q) h0Var).g1() instanceof f);
    }

    public static final boolean o(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堜"));
        if (h0Var instanceof x0) {
            return true;
        }
        return (h0Var instanceof q) && (((q) h0Var).g1() instanceof x0);
    }

    public static final boolean p(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("堝"));
        l0.p(h0Var2, ProtectedSandApp.s("堞"));
        return kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a.d(h0Var, h0Var2);
    }

    public static final boolean q(@d5.d h hVar) {
        l0.p(hVar, ProtectedSandApp.s("堟"));
        return (hVar instanceof f1) && (((f1) hVar).b() instanceof e1);
    }

    public static final boolean r(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堠"));
        return t1.m(h0Var);
    }

    public static final boolean s(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堡"));
        return (h0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.h) && ((kotlin.reflect.jvm.internal.impl.types.error.h) h0Var).e1().isUnresolved();
    }

    @d5.d
    public static final h0 t(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堢"));
        h0 n5 = t1.n(h0Var);
        l0.o(n5, ProtectedSandApp.s("堣"));
        return n5;
    }

    @d5.d
    public static final h0 u(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堤"));
        h0 o5 = t1.o(h0Var);
        l0.o(o5, ProtectedSandApp.s("堥"));
        return o5;
    }

    @d5.d
    public static final h0 v(@d5.d h0 h0Var, @d5.d g gVar) {
        l0.p(h0Var, ProtectedSandApp.s("堦"));
        l0.p(gVar, ProtectedSandApp.s("堧"));
        return (h0Var.getAnnotations().isEmpty() && gVar.isEmpty()) ? h0Var : h0Var.X0().a1(kotlin.reflect.jvm.internal.impl.types.e1.a(h0Var.T0(), gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.reflect.jvm.internal.impl.types.w1] */
    @d5.d
    public static final h0 w(@d5.d h0 h0Var) {
        int b02;
        p0 p0Var;
        int b03;
        int b04;
        l0.p(h0Var, ProtectedSandApp.s("堨"));
        w1 X0 = h0Var.X0();
        boolean z5 = X0 instanceof b0;
        String s5 = ProtectedSandApp.s("堩");
        if (z5) {
            b0 b0Var = (b0) X0;
            p0 c12 = b0Var.c1();
            if (!c12.U0().r().isEmpty() && c12.U0().b() != null) {
                List<f1> r5 = c12.U0().r();
                l0.o(r5, s5);
                b04 = kotlin.collections.b0.b0(r5, 10);
                ArrayList arrayList = new ArrayList(b04);
                Iterator it = r5.iterator();
                while (it.hasNext()) {
                    arrayList.add(new v0((f1) it.next()));
                }
                c12 = p1.f(c12, arrayList, null, 2, null);
            }
            p0 d12 = b0Var.d1();
            if (!d12.U0().r().isEmpty() && d12.U0().b() != null) {
                List<f1> r6 = d12.U0().r();
                l0.o(r6, s5);
                b03 = kotlin.collections.b0.b0(r6, 10);
                ArrayList arrayList2 = new ArrayList(b03);
                Iterator it2 = r6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new v0((f1) it2.next()));
                }
                d12 = p1.f(d12, arrayList2, null, 2, null);
            }
            p0Var = i0.d(c12, d12);
        } else {
            if (!(X0 instanceof p0)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 p0Var2 = (p0) X0;
            boolean isEmpty = p0Var2.U0().r().isEmpty();
            p0Var = p0Var2;
            if (!isEmpty) {
                h b6 = p0Var2.U0().b();
                p0Var = p0Var2;
                if (b6 != null) {
                    List<f1> r7 = p0Var2.U0().r();
                    l0.o(r7, s5);
                    b02 = kotlin.collections.b0.b0(r7, 10);
                    ArrayList arrayList3 = new ArrayList(b02);
                    Iterator it3 = r7.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new v0((f1) it3.next()));
                    }
                    p0Var = p1.f(p0Var2, arrayList3, null, 2, null);
                }
            }
        }
        return v1.b(p0Var, X0);
    }

    public static final boolean x(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("堪"));
        return b(h0Var, c.f26540p);
    }

    public static final boolean y(@e h0 h0Var) {
        return h0Var == null || b(h0Var, d.f26541p);
    }
}
