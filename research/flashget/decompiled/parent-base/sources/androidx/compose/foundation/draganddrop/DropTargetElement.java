package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragAndDropTarget.kt */
@z0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR2\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/draganddrop/DropTargetElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/draganddrop/g;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/b;", "Lkotlin/r0;", "name", "event", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/g;", "target", "<init>", "(Lld/l;Landroidx/compose/ui/draganddrop/g;)V", "n", "()Landroidx/compose/foundation/draganddrop/g;", "node", "Lkotlin/k2;", "s", "(Landroidx/compose/foundation/draganddrop/g;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lld/l;", "o", "()Lld/l;", "e", "Landroidx/compose/ui/draganddrop/g;", "r", "()Landroidx/compose/ui/draganddrop/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DropTargetElement extends y0<g> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<androidx.compose.ui.draganddrop.b, Boolean> shouldStartDragAndDrop;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.ui.draganddrop.g target;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(@l ld.l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @l androidx.compose.ui.draganddrop.g gVar) {
        this.shouldStartDragAndDrop = lVar;
        this.target = gVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) other;
        if (l0.g(this.target, dropTargetElement.target)) {
            return l0.g(this.shouldStartDragAndDrop, dropTargetElement.shouldStartDragAndDrop);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.shouldStartDragAndDrop.hashCode() + (this.target.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@l a2 a2Var) {
        a2Var.d("dropTarget");
        a2Var.getProperties().c("target", this.target);
        a2Var.getProperties().c("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    @Override // androidx.compose.ui.node.y0
    @l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g i() {
        return new g(this.shouldStartDragAndDrop, this.target);
    }

    @l
    public final ld.l<androidx.compose.ui.draganddrop.b, Boolean> o() {
        return this.shouldStartDragAndDrop;
    }

    @l
    /* renamed from: r, reason: from getter */
    public final androidx.compose.ui.draganddrop.g getTarget() {
        return this.target;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(@l g node) {
        node.M7(this.target);
        node.L7(this.shouldStartDragAndDrop);
    }
}
