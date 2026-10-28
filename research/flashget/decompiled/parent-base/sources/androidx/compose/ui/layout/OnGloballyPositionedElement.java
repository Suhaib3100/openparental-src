package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/layout/x0;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "onGloballyPositioned", "<init>", "(Lld/l;)V", "n", "()Landroidx/compose/ui/layout/x0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "r", "(Landroidx/compose/ui/layout/x0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Lld/l;", "o", "()Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends androidx.compose.ui.node.y0<x0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<u, k2> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@fg.l ld.l<? super u, k2> lVar) {
        this.onGloballyPositioned = lVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OnGloballyPositionedElement) {
            return kotlin.jvm.internal.l0.g(this.onGloballyPositioned, ((OnGloballyPositionedElement) other).onGloballyPositioned);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("onGloballyPositioned");
        a2Var.getProperties().c("onGloballyPositioned", this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public x0 i() {
        return new x0(this.onGloballyPositioned);
    }

    @fg.l
    public final ld.l<u, k2> o() {
        return this.onGloballyPositioned;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l x0 node) {
        node.z7(this.onGloballyPositioned);
    }
}
