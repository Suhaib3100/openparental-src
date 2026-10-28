package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/g1;", "type", "stopType", "Landroidx/compose/ui/q$d;", "b", "(Landroidx/compose/ui/node/j;II)Landroidx/compose/ui/q$d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q.d b(j jVar, int i4, int i5) {
        q.d child = jVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i4) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i5) != 0) {
                return null;
            }
            if ((kindSet & i4) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
