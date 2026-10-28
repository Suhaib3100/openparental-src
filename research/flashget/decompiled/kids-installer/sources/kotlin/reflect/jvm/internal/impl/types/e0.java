package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes5.dex */
public final class e0 {
    @d5.d
    public static final b0 a(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("嘉"));
        w1 X0 = h0Var.X0();
        kotlin.jvm.internal.l0.n(X0, ProtectedSandApp.s("嘊"));
        return (b0) X0;
    }

    public static final boolean b(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("嘋"));
        return h0Var.X0() instanceof b0;
    }

    @d5.d
    public static final p0 c(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("嘌"));
        w1 X0 = h0Var.X0();
        if (X0 instanceof b0) {
            return ((b0) X0).c1();
        }
        if (X0 instanceof p0) {
            return (p0) X0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @d5.d
    public static final p0 d(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("嘍"));
        w1 X0 = h0Var.X0();
        if (X0 instanceof b0) {
            return ((b0) X0).d1();
        }
        if (X0 instanceof p0) {
            return (p0) X0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
