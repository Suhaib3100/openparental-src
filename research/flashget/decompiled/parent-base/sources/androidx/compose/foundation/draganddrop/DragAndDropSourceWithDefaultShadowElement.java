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

/* compiled from: AndroidDragAndDropSource.android.kt */
@z0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR8\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/draganddrop/h;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/e;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "dragAndDropSourceHandler", "<init>", "(Lld/p;)V", "n", "()Landroidx/compose/foundation/draganddrop/h;", "node", "r", "(Landroidx/compose/foundation/draganddrop/h;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lld/p;", "o", "()Lld/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends y0<h> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<e, kotlin.coroutines.d<? super k2>, Object> dragAndDropSourceHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceWithDefaultShadowElement(@l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DragAndDropSourceWithDefaultShadowElement) {
            return l0.g(this.dragAndDropSourceHandler, ((DragAndDropSourceWithDefaultShadowElement) other).dragAndDropSourceHandler);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@l a2 a2Var) {
        a2Var.d("dragSourceWithDefaultPainter");
        a2Var.getProperties().c("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.y0
    @l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public h i() {
        return new h(this.dragAndDropSourceHandler);
    }

    @l
    public final p<e, kotlin.coroutines.d<? super k2>, Object> o() {
        return this.dragAndDropSourceHandler;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@l h node) {
        node.K7(this.dragAndDropSourceHandler);
    }
}
