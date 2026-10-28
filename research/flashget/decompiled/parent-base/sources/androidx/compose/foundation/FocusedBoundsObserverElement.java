package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/i1;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "onPositioned", "<init>", "(Lld/l;)V", "n", "()Landroidx/compose/foundation/i1;", "node", "r", "(Landroidx/compose/foundation/i1;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Lld/l;", "o", "()Lld/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusedBoundsObserverElement extends androidx.compose.ui.node.y0<i1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.layout.u, kotlin.k2> onPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(@fg.l ld.l<? super androidx.compose.ui.layout.u, kotlin.k2> lVar) {
        this.onPositioned = lVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = other instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) other : null;
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.onPositioned, focusedBoundsObserverElement.onPositioned);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.onPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("onFocusedBoundsChanged");
        a2Var.getProperties().c("onPositioned", this.onPositioned);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i1 i() {
        return new i1(this.onPositioned);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.layout.u, kotlin.k2> o() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l i1 node) {
        node.B7(this.onPositioned);
    }
}
