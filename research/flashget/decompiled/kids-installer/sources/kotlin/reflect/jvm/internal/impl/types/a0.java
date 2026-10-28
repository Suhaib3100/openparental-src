package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashSet;

/* compiled from: expandedTypeUtils.kt */
/* loaded from: classes5.dex */
public final class a0 {
    @d5.e
    public static final h4.i a(@d5.d r1 r1Var, @d5.d h4.i iVar) {
        kotlin.jvm.internal.l0.p(r1Var, ProtectedSandApp.s("咼"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("咽"));
        return b(r1Var, iVar, new HashSet());
    }

    private static final h4.i b(r1 r1Var, h4.i iVar, HashSet<h4.o> hashSet) {
        h4.i b6;
        h4.i h5;
        h4.o E = r1Var.E(iVar);
        if (!hashSet.add(E)) {
            return null;
        }
        h4.p d02 = r1Var.d0(E);
        if (d02 != null) {
            h4.i B0 = r1Var.B0(d02);
            b6 = b(r1Var, B0, hashSet);
            if (b6 == null) {
                return null;
            }
            boolean z5 = r1Var.g0(r1Var.E(B0)) || ((B0 instanceof h4.k) && r1Var.n((h4.k) B0));
            if ((b6 instanceof h4.k) && r1Var.n((h4.k) b6) && r1Var.M(iVar) && z5) {
                h5 = r1Var.h(B0);
            } else if (!r1Var.M(b6) && r1Var.K(iVar)) {
                h5 = r1Var.h(b6);
            }
            return h5;
        }
        if (!r1Var.g0(E)) {
            return iVar;
        }
        h4.i H = r1Var.H(iVar);
        if (H == null || (b6 = b(r1Var, H, hashSet)) == null) {
            return null;
        }
        if (r1Var.M(iVar)) {
            return r1Var.M(b6) ? iVar : ((b6 instanceof h4.k) && r1Var.n((h4.k) b6)) ? iVar : r1Var.h(b6);
        }
        return b6;
    }
}
