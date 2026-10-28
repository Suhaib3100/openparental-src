package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashSet;

/* compiled from: expandedTypeUtils.kt */
/* loaded from: classes7.dex */
public final class a0 {
    @fg.m
    public static final ce.i a(@fg.l r1 r1Var, @fg.l ce.i iVar) {
        kotlin.jvm.internal.l0.p(r1Var, ProtectedSandApp.s("紭\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("紮\u0001"));
        return b(r1Var, iVar, new HashSet());
    }

    private static final ce.i b(r1 r1Var, ce.i iVar, HashSet<ce.n> hashSet) {
        ce.i b5;
        ce.i Z;
        ce.n L = r1Var.L(iVar);
        if (!hashSet.add(L)) {
            return null;
        }
        ce.o p02 = r1Var.p0(L);
        if (p02 != null) {
            ce.i i02 = r1Var.i0(p02);
            b5 = b(r1Var, i02, hashSet);
            if (b5 == null) {
                return null;
            }
            boolean z4 = r1Var.m(r1Var.L(i02)) || ((i02 instanceof ce.j) && r1Var.o((ce.j) i02));
            if ((b5 instanceof ce.j) && r1Var.o((ce.j) b5) && r1Var.A0(iVar) && z4) {
                Z = r1Var.Z(i02);
            } else if (!r1Var.A0(b5) && r1Var.K(iVar)) {
                Z = r1Var.Z(b5);
            }
            return Z;
        }
        if (!r1Var.m(L)) {
            return iVar;
        }
        ce.i j4 = r1Var.j(iVar);
        if (j4 == null || (b5 = b(r1Var, j4, hashSet)) == null) {
            return null;
        }
        if (r1Var.A0(iVar)) {
            return r1Var.A0(b5) ? iVar : ((b5 instanceof ce.j) && r1Var.o((ce.j) b5)) ? iVar : r1Var.Z(b5);
        }
        return b5;
    }
}
