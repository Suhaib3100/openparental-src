package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: SemanticsModifierNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "", "h1", "()Z", "shouldClearDescendantSemantics", "s6", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface y1 extends j {
    void f6(@fg.l androidx.compose.ui.semantics.z zVar);

    default boolean h1() {
        return false;
    }

    default boolean s6() {
        return false;
    }
}
