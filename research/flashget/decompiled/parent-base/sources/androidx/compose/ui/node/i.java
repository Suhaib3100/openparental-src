package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: CompositionLocalConsumerModifierNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Landroidx/compose/ui/node/h;", "Landroidx/compose/runtime/d0;", "local", "a", "(Landroidx/compose/ui/node/h;Landroidx/compose/runtime/d0;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    public static final <T> T a(@fg.l h hVar, @fg.l androidx.compose.runtime.d0<T> d0Var) {
        if (hVar.getNode().getIsAttached()) {
            return (T) k.p(hVar).getCompositionLocalMap().b(d0Var);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
    }
}
