package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ErasureProjectionComputer.kt */
/* loaded from: classes5.dex */
public class y {
    public static /* synthetic */ l1 b(y yVar, kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, z zVar, k1 k1Var, h0 h0Var, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䪟"));
        }
        if ((i5 & 8) != 0) {
            h0Var = k1Var.c(f1Var, zVar);
        }
        return yVar.a(f1Var, zVar, k1Var, h0Var);
    }

    @d5.d
    public l1 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @d5.d z zVar, @d5.d k1 k1Var, @d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("䪠"));
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("䪡"));
        kotlin.jvm.internal.l0.p(k1Var, ProtectedSandApp.s("䪢"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䪣"));
        return new n1(x1.OUT_VARIANCE, h0Var);
    }
}
