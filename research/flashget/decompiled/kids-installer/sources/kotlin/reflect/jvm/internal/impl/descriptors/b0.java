package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.m2;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final g0<c0> f24129a = new g0<>(ProtectedSandApp.s("䝯"));

    public static final void a(@d5.d h0 h0Var) {
        m2 m2Var;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䝰"));
        c0 c0Var = (c0) h0Var.P0(f24129a);
        if (c0Var != null) {
            c0Var.a(h0Var);
            m2Var = m2.f23662a;
        } else {
            m2Var = null;
        }
        if (m2Var != null) {
            return;
        }
        throw new InvalidModuleException(ProtectedSandApp.s("䝱") + h0Var);
    }
}
