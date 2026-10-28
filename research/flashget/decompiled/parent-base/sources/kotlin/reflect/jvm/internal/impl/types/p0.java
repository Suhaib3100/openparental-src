package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: KotlinType.kt */
/* loaded from: classes7.dex */
public abstract class p0 extends w1 implements ce.j, ce.l {
    public p0() {
        super(null);
    }

    @fg.l
    public abstract p0 V0(boolean z4);

    @fg.l
    public abstract p0 W0(@fg.l d1 d1Var);

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.v.k0(sb, ProtectedSandApp.s("犡\u0001"), kotlin.reflect.jvm.internal.impl.renderer.c.u(kotlin.reflect.jvm.internal.impl.renderer.c.f77801j, it.next(), null, 2, null), ProtectedSandApp.s("犠\u0001"));
        }
        sb.append(O0());
        if (!M0().isEmpty()) {
            kotlin.collections.g0.j3(M0(), sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("犢\u0001"), (r14 & 4) != 0 ? "" : ProtectedSandApp.s("犣\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("犤\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
        }
        if (P0()) {
            sb.append(ProtectedSandApp.s("犥\u0001"));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("犦\u0001"));
        return sb2;
    }
}
