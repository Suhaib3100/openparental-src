package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes7.dex */
public final class p1 {
    @fg.l
    public static final p0 a(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羼\u0001"));
        w1 R0 = h0Var.R0();
        p0 p0Var = R0 instanceof p0 ? (p0) R0 : null;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException((ProtectedSandApp.s("羽\u0001") + h0Var).toString());
    }

    @fg.l
    @kd.j
    public static final h0 b(@fg.l h0 h0Var, @fg.l List<? extends l1> list, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羼\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("羾\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("羿\u0001"));
        return e(h0Var, list, gVar, null, 4, null);
    }

    @fg.l
    @kd.j
    public static final h0 c(@fg.l h0 h0Var, @fg.l List<? extends l1> list, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l List<? extends l1> list2) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羼\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("羾\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("羿\u0001"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("翀\u0001"));
        if ((list.isEmpty() || list == h0Var.M0()) && gVar == h0Var.getAnnotations()) {
            return h0Var;
        }
        d1 N0 = h0Var.N0();
        if ((gVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.l) && ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.l) gVar).isEmpty()) {
            gVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        }
        d1 a5 = e1.a(N0, gVar);
        w1 R0 = h0Var.R0();
        if (R0 instanceof b0) {
            b0 b0Var = (b0) R0;
            return i0.d(d(b0Var.W0(), list, a5), d(b0Var.X0(), list2, a5));
        }
        if (R0 instanceof p0) {
            return d((p0) R0, list, a5);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    @kd.j
    public static final p0 d(@fg.l p0 p0Var, @fg.l List<? extends l1> list, @fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("羼\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("羾\u0001"));
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("翁\u0001"));
        return (list.isEmpty() && d1Var == p0Var.N0()) ? p0Var : list.isEmpty() ? p0Var.U0(d1Var) : p0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.h ? ((kotlin.reflect.jvm.internal.impl.types.error.h) p0Var).a1(list) : i0.l(d1Var, p0Var.O0(), list, p0Var.P0(), null, 16, null);
    }

    public static /* synthetic */ h0 e(h0 h0Var, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = h0Var.M0();
        }
        if ((i4 & 2) != 0) {
            gVar = h0Var.getAnnotations();
        }
        if ((i4 & 4) != 0) {
            list2 = list;
        }
        return c(h0Var, list, gVar, list2);
    }

    public static /* synthetic */ p0 f(p0 p0Var, List list, d1 d1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = p0Var.M0();
        }
        if ((i4 & 2) != 0) {
            d1Var = p0Var.N0();
        }
        return d(p0Var, list, d1Var);
    }
}
