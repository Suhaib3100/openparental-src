package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: KotlinType.kt */
/* loaded from: classes6.dex */
public abstract class p0 extends w1 implements h4.k, h4.m {
    public p0() {
        super(null);
    }

    @d5.d
    public abstract p0 b1(boolean z5);

    @d5.d
    public abstract p0 c1(@d5.d d1 d1Var);

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.b0.k0(sb, ProtectedSandApp.s("薏"), kotlin.reflect.jvm.internal.impl.renderer.c.u(kotlin.reflect.jvm.internal.impl.renderer.c.f25819j, it.next(), null, 2, null), ProtectedSandApp.s("薐"));
        }
        sb.append(U0());
        if (!S0().isEmpty()) {
            kotlin.collections.y.k3(S0(), sb, ProtectedSandApp.s("薑"), ProtectedSandApp.s("薒"), ProtectedSandApp.s("薓"), 0, null, null, 112, null);
        }
        if (V0()) {
            sb.append(ProtectedSandApp.s("薔"));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("薕"));
        return sb2;
    }
}
