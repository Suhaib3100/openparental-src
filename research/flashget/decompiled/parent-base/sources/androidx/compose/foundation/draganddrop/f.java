package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.ui.q;
import fg.l;
import kotlin.Metadata;

/* compiled from: DragAndDropTarget.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\n\u001a\u00020\u0000*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/b;", "Lkotlin/r0;", "name", "startEvent", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/g;", "target", "a", "(Landroidx/compose/ui/q;Lld/l;Landroidx/compose/ui/draganddrop/g;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    @l
    @z0
    public static final q a(@l q qVar, @l ld.l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @l androidx.compose.ui.draganddrop.g gVar) {
        return qVar.w3(new DropTargetElement(lVar, gVar));
    }
}
