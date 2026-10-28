package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes5.dex */
public final class p1 {
    @d5.d
    public static final p0 a(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("垄"));
        w1 X0 = h0Var.X0();
        p0 p0Var = X0 instanceof p0 ? (p0) X0 : null;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException((ProtectedSandApp.s("垅") + h0Var).toString());
    }

    @d5.d
    @p3.j
    public static final h0 b(@d5.d h0 h0Var, @d5.d List<? extends l1> list, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("垆"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("垇"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("垈"));
        return e(h0Var, list, gVar, null, 4, null);
    }

    @d5.d
    @p3.j
    public static final h0 c(@d5.d h0 h0Var, @d5.d List<? extends l1> list, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d List<? extends l1> list2) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("垉"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("垊"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("型"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("垌"));
        if ((list.isEmpty() || list == h0Var.S0()) && gVar == h0Var.getAnnotations()) {
            return h0Var;
        }
        d1 T0 = h0Var.T0();
        if ((gVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.l) && gVar.isEmpty()) {
            gVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        }
        d1 a6 = e1.a(T0, gVar);
        w1 X0 = h0Var.X0();
        if (X0 instanceof b0) {
            b0 b0Var = (b0) X0;
            return i0.d(d(b0Var.c1(), list, a6), d(b0Var.d1(), list2, a6));
        }
        if (X0 instanceof p0) {
            return d((p0) X0, list, a6);
        }
        throw new NoWhenBranchMatchedException();
    }

    @d5.d
    @p3.j
    public static final p0 d(@d5.d p0 p0Var, @d5.d List<? extends l1> list, @d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("垍"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("垎"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("垏"));
        return (list.isEmpty() && d1Var == p0Var.T0()) ? p0Var : list.isEmpty() ? p0Var.a1(d1Var) : i0.l(d1Var, p0Var.U0(), list, p0Var.V0(), null, 16, null);
    }

    public static /* synthetic */ h0 e(h0 h0Var, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = h0Var.S0();
        }
        if ((i5 & 2) != 0) {
            gVar = h0Var.getAnnotations();
        }
        if ((i5 & 4) != 0) {
            list2 = list;
        }
        return c(h0Var, list, gVar, list2);
    }

    public static /* synthetic */ p0 f(p0 p0Var, List list, d1 d1Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = p0Var.S0();
        }
        if ((i5 & 2) != 0) {
            d1Var = p0Var.T0();
        }
        return d(p0Var, list, d1Var);
    }
}
