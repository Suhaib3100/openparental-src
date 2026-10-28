package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.ui.node.l;
import kotlin.Metadata;

/* compiled from: DragAndDropTarget.kt */
@z0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B2\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR=\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/draganddrop/g;", "Landroidx/compose/ui/node/l;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/b;", "Lkotlin/r0;", "name", "event", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/g;", "target", "<init>", "(Lld/l;Landroidx/compose/ui/draganddrop/g;)V", "s", "Lld/l;", "J7", "()Lld/l;", "L7", "(Lld/l;)V", "t", "Landroidx/compose/ui/draganddrop/g;", "K7", "()Landroidx/compose/ui/draganddrop/g;", "M7", "(Landroidx/compose/ui/draganddrop/g;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends l {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.draganddrop.b, Boolean> shouldStartDragAndDrop;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.draganddrop.g target;

    public g(@fg.l ld.l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @fg.l androidx.compose.ui.draganddrop.g gVar) {
        this.shouldStartDragAndDrop = lVar;
        this.target = gVar;
        y7(androidx.compose.ui.draganddrop.f.b(lVar, gVar));
    }

    @fg.l
    public final ld.l<androidx.compose.ui.draganddrop.b, Boolean> J7() {
        return this.shouldStartDragAndDrop;
    }

    @fg.l
    /* renamed from: K7, reason: from getter */
    public final androidx.compose.ui.draganddrop.g getTarget() {
        return this.target;
    }

    public final void L7(@fg.l ld.l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar) {
        this.shouldStartDragAndDrop = lVar;
    }

    public final void M7(@fg.l androidx.compose.ui.draganddrop.g gVar) {
        this.target = gVar;
    }
}
