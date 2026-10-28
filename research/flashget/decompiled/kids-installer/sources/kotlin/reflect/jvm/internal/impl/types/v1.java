package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes5.dex */
public final class v1 {
    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static final h0 a(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("塊"));
        if (h0Var instanceof u1) {
            return ((u1) h0Var).Q();
        }
        return null;
    }

    @d5.d
    public static final w1 b(@d5.d w1 w1Var, @d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("塋"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("塌"));
        return d(w1Var, a(h0Var));
    }

    @d5.d
    public static final w1 c(@d5.d w1 w1Var, @d5.d h0 h0Var, @d5.d q3.l<? super h0, ? extends h0> lVar) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("塍"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("塎"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("塏"));
        h0 a6 = a(h0Var);
        return d(w1Var, a6 != null ? lVar.N(a6) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final w1 d(@d5.d w1 w1Var, @d5.e h0 h0Var) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("塐"));
        if (w1Var instanceof u1) {
            return d(((u1) w1Var).M0(), h0Var);
        }
        if (h0Var == null || kotlin.jvm.internal.l0.g(h0Var, w1Var)) {
            return w1Var;
        }
        if (w1Var instanceof p0) {
            return new s0((p0) w1Var, h0Var);
        }
        if (w1Var instanceof b0) {
            return new d0((b0) w1Var, h0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
