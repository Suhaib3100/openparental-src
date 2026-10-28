package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/r0;", "a", "(Landroidx/compose/ui/node/r0;)Landroidx/compose/ui/node/r0;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {
    @fg.l
    public static final androidx.compose.ui.node.r0 a(@fg.l androidx.compose.ui.node.r0 r0Var) {
        androidx.compose.ui.node.h0 layoutNode = r0Var.getLayoutNode();
        while (true) {
            androidx.compose.ui.node.h0 B0 = layoutNode.B0();
            if ((B0 != null ? B0.getLookaheadRoot() : null) == null) {
                androidx.compose.ui.node.r0 lookaheadDelegate = layoutNode.z0().getLookaheadDelegate();
                kotlin.jvm.internal.l0.m(lookaheadDelegate);
                return lookaheadDelegate;
            }
            androidx.compose.ui.node.h0 B02 = layoutNode.B0();
            androidx.compose.ui.node.h0 lookaheadRoot = B02 != null ? B02.getLookaheadRoot() : null;
            kotlin.jvm.internal.l0.m(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.B0();
                kotlin.jvm.internal.l0.m(layoutNode);
            } else {
                androidx.compose.ui.node.h0 B03 = layoutNode.B0();
                kotlin.jvm.internal.l0.m(B03);
                layoutNode = B03.getLookaheadRoot();
                kotlin.jvm.internal.l0.m(layoutNode);
            }
        }
    }
}
