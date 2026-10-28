package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import ld.p;

/* compiled from: DragAndDropSource.kt */
@z0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062)\b\u0002\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018R8\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001a¨\u0006-"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/draganddrop/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/e;", "Lkotlin/coroutines/d;", "", "dragAndDropSourceHandler", "<init>", "(Lld/l;Lld/p;)V", "u", "()Landroidx/compose/foundation/draganddrop/d;", "node", "x", "(Landroidx/compose/foundation/draganddrop/d;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/l;", "o", "()Lld/p;", "r", "(Lld/l;Lld/p;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/l;", "w", "e", "Lld/p;", "v", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DragAndDropSourceElement extends y0<d> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<e, kotlin.coroutines.d<? super k2>, Object> dragAndDropSourceHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(@l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar, @l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
    }

    public static DragAndDropSourceElement s(DragAndDropSourceElement dragAndDropSourceElement, ld.l lVar, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i4 & 2) != 0) {
            pVar = dragAndDropSourceElement.dragAndDropSourceHandler;
        }
        dragAndDropSourceElement.getClass();
        return new DragAndDropSourceElement(lVar, pVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) other;
        return l0.g(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && l0.g(this.dragAndDropSourceHandler, dragAndDropSourceElement.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode() + (this.drawDragDecoration.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@l a2 a2Var) {
        a2Var.d("dragSource");
        a2Var.getProperties().c("drawDragDecoration", this.drawDragDecoration);
        a2Var.getProperties().c("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @l
    public final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> n() {
        return this.drawDragDecoration;
    }

    @l
    public final p<e, kotlin.coroutines.d<? super k2>, Object> o() {
        return this.dragAndDropSourceHandler;
    }

    @l
    public final DragAndDropSourceElement r(@l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration, @l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> dragAndDropSourceHandler) {
        return new DragAndDropSourceElement(drawDragDecoration, dragAndDropSourceHandler);
    }

    @l
    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    @Override // androidx.compose.ui.node.y0
    @l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @l
    public final p<e, kotlin.coroutines.d<? super k2>, Object> v() {
        return this.dragAndDropSourceHandler;
    }

    @l
    public final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> w() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@l d node) {
        node.M7(this.drawDragDecoration);
        node.L7(this.dragAndDropSourceHandler);
    }
}
