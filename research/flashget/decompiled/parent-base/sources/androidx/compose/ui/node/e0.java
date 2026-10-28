package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "b", "(Landroidx/compose/ui/node/q0;Landroidx/compose/ui/layout/a;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(q0 q0Var, androidx.compose.ui.layout.a aVar) {
        q0 N0 = q0Var.N0();
        if (N0 == null) {
            throw new IllegalStateException(("Child of " + q0Var + " cannot be null when calculating alignment line").toString());
        }
        if (q0Var.S0().p().containsKey(aVar)) {
            Integer num = q0Var.S0().p().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int q4 = N0.q(aVar);
        if (q4 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        N0.m1(true);
        q0Var.k1(true);
        q0Var.h1();
        N0.m1(false);
        q0Var.k1(false);
        return (aVar instanceof androidx.compose.ui.layout.m ? androidx.compose.ui.unit.q.o(N0.getPosition()) : androidx.compose.ui.unit.q.m(N0.getPosition())) + q4;
    }
}
