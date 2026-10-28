package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.q;

/* compiled from: SpecialTypes.kt */
@kotlin.jvm.internal.r1({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,5:222\n112#2,7:228\n1549#3:219\n1620#3,2:220\n1622#3:227\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,5\n214#1:228,7\n214#1:219\n214#1:220,2\n214#1:227\n*E\n"})
/* loaded from: classes7.dex */
public final class t0 {
    @fg.m
    public static final a a(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("耇\u0001"));
        w1 R0 = h0Var.R0();
        if (R0 instanceof a) {
            return (a) R0;
        }
        return null;
    }

    @fg.m
    public static final p0 b(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("耇\u0001"));
        a a5 = a(h0Var);
        if (a5 != null) {
            return a5.a1();
        }
        return null;
    }

    public static final boolean c(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("耇\u0001"));
        return h0Var.R0() instanceof q;
    }

    private static final g0 d(g0 g0Var) {
        h0 h0Var;
        Collection<h0> j4 = g0Var.j();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(j4, 10));
        Iterator<T> it = j4.iterator();
        boolean z4 = false;
        while (true) {
            h0Var = null;
            if (!it.hasNext()) {
                break;
            }
            h0 h0Var2 = (h0) it.next();
            if (t1.l(h0Var2)) {
                h0Var2 = f(h0Var2.R0(), false, 1, null);
                z4 = true;
            }
            arrayList.add(h0Var2);
        }
        if (!z4) {
            return null;
        }
        h0 g4 = g0Var.g();
        if (g4 != null) {
            if (t1.l(g4)) {
                g4 = f(g4.R0(), false, 1, null);
            }
            h0Var = g4;
        }
        return new g0(arrayList).l(h0Var);
    }

    @fg.l
    public static final w1 e(@fg.l w1 w1Var, boolean z4) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("耇\u0001"));
        q c5 = q.a.c(q.f78524e, w1Var, z4, false, 4, null);
        if (c5 != null) {
            return c5;
        }
        p0 g4 = g(w1Var);
        return g4 != null ? g4 : w1Var.V0(false);
    }

    public static /* synthetic */ w1 f(w1 w1Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return e(w1Var, z4);
    }

    private static final p0 g(h0 h0Var) {
        g0 d5;
        h1 O0 = h0Var.O0();
        g0 g0Var = O0 instanceof g0 ? (g0) O0 : null;
        if (g0Var == null || (d5 = d(g0Var)) == null) {
            return null;
        }
        return d5.f();
    }

    @fg.l
    public static final p0 h(@fg.l p0 p0Var, boolean z4) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("耇\u0001"));
        q c5 = q.a.c(q.f78524e, p0Var, z4, false, 4, null);
        if (c5 != null) {
            return c5;
        }
        p0 g4 = g(p0Var);
        return g4 == null ? p0Var.V0(false) : g4;
    }

    public static /* synthetic */ p0 i(p0 p0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return h(p0Var, z4);
    }

    @fg.l
    public static final p0 j(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("耇\u0001"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("耈\u0001"));
        return j0.a(p0Var) ? p0Var : new a(p0Var, p0Var2);
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.types.checker.i k(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("耇\u0001"));
        return new kotlin.reflect.jvm.internal.impl.types.checker.i(iVar.X0(), iVar.Y0(), iVar.Z0(), iVar.N0(), iVar.P0(), true);
    }
}
