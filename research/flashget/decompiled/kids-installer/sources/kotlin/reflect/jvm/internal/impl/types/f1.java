package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeCapabilities.kt */
/* loaded from: classes5.dex */
public final class f1 {
    @d5.e
    public static final o a(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("圅"));
        h4.i X0 = h0Var.X0();
        o oVar = X0 instanceof o ? (o) X0 : null;
        if (oVar == null || !oVar.H0()) {
            return null;
        }
        return oVar;
    }

    public static final boolean b(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("圆"));
        h4.i X0 = h0Var.X0();
        o oVar = X0 instanceof o ? (o) X0 : null;
        if (oVar != null) {
            return oVar.H0();
        }
        return false;
    }
}
