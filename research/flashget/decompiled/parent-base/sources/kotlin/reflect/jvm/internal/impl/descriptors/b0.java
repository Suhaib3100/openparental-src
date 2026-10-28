package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.k2;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final g0<c0> f75927a = new g0<>(ProtectedSandApp.s("歬\u0001"));

    public static final void a(@fg.l h0 h0Var) {
        k2 k2Var;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("歭\u0001"));
        c0 c0Var = (c0) h0Var.J0(f75927a);
        if (c0Var != null) {
            c0Var.a(h0Var);
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var != null) {
            return;
        }
        throw new InvalidModuleException(ProtectedSandApp.s("歮\u0001") + h0Var);
    }
}
