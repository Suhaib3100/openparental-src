package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/q$d;", "b", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/q$d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,128:1\n74#2:129\n72#2:130\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n114#1:129\n115#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class k0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q.d b(j jVar) {
        q.d child = jVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & 4) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & 2) == 0) {
            if ((child.getKindSet() & 4) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
