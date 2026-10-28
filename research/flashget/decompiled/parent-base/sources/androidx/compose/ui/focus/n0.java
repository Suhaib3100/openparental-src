package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.p1;
import kotlin.Metadata;

/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/o0;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/o0;", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "b", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 b(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.h0 layoutNode;
        p1 owner;
        s focusOwner;
        e1 coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void c(@fg.l FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.k.q(focusTargetNode).getFocusOwner().i(focusTargetNode);
    }

    @fg.l
    public static final o0 d(@fg.l FocusTargetNode focusTargetNode) {
        return androidx.compose.ui.node.k.q(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
