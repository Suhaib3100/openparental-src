package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.p0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: LazyGridItemScopeImpl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/grid/AnimateItemElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/lazy/layout/j;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "placementSpec", "<init>", "(Landroidx/compose/animation/core/p0;)V", "s", "()Landroidx/compose/foundation/lazy/layout/j;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/foundation/lazy/layout/j;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/animation/core/p0;", "o", "(Landroidx/compose/animation/core/p0;)Landroidx/compose/foundation/lazy/grid/AnimateItemElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/animation/core/p0;", "u", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class AnimateItemElement extends y0<androidx.compose.foundation.lazy.layout.j> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p0<androidx.compose.ui.unit.q> placementSpec;

    public AnimateItemElement(@fg.l p0<androidx.compose.ui.unit.q> p0Var) {
        this.placementSpec = p0Var;
    }

    public static AnimateItemElement r(AnimateItemElement animateItemElement, p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = animateItemElement.placementSpec;
        }
        animateItemElement.getClass();
        return new AnimateItemElement(p0Var);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnimateItemElement) && kotlin.jvm.internal.l0.g(this.placementSpec, ((AnimateItemElement) other).placementSpec);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.placementSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("animateItemPlacement");
        a2Var.e(this.placementSpec);
    }

    @fg.l
    public final p0<androidx.compose.ui.unit.q> n() {
        return this.placementSpec;
    }

    @fg.l
    public final AnimateItemElement o(@fg.l p0<androidx.compose.ui.unit.q> placementSpec) {
        return new AnimateItemElement(placementSpec);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.j i() {
        return new androidx.compose.foundation.lazy.layout.j(null, this.placementSpec);
    }

    @fg.l
    public String toString() {
        return "AnimateItemElement(placementSpec=" + this.placementSpec + ')';
    }

    @fg.l
    public final p0<androidx.compose.ui.unit.q> u() {
        return this.placementSpec;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l androidx.compose.foundation.lazy.layout.j node) {
        node.B7(this.placementSpec);
    }
}
