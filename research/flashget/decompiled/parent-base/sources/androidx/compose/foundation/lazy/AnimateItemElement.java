package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.p0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J4\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/AnimateItemElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/lazy/layout/j;", "Landroidx/compose/animation/core/p0;", "", "appearanceSpec", "Landroidx/compose/ui/unit/q;", "placementSpec", "<init>", "(Landroidx/compose/animation/core/p0;Landroidx/compose/animation/core/p0;)V", "u", "()Landroidx/compose/foundation/lazy/layout/j;", "node", "Lkotlin/k2;", "x", "(Landroidx/compose/foundation/lazy/layout/j;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/animation/core/p0;", "o", "r", "(Landroidx/compose/animation/core/p0;Landroidx/compose/animation/core/p0;)Landroidx/compose/foundation/lazy/AnimateItemElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/animation/core/p0;", "v", "e", "w", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class AnimateItemElement extends y0<androidx.compose.foundation.lazy.layout.j> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final p0<Float> appearanceSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final p0<androidx.compose.ui.unit.q> placementSpec;

    public AnimateItemElement(@fg.m p0<Float> p0Var, @fg.m p0<androidx.compose.ui.unit.q> p0Var2) {
        this.appearanceSpec = p0Var;
        this.placementSpec = p0Var2;
    }

    public static AnimateItemElement s(AnimateItemElement animateItemElement, p0 p0Var, p0 p0Var2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = animateItemElement.appearanceSpec;
        }
        if ((i4 & 2) != 0) {
            p0Var2 = animateItemElement.placementSpec;
        }
        animateItemElement.getClass();
        return new AnimateItemElement(p0Var, p0Var2);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimateItemElement)) {
            return false;
        }
        AnimateItemElement animateItemElement = (AnimateItemElement) other;
        return l0.g(this.appearanceSpec, animateItemElement.appearanceSpec) && l0.g(this.placementSpec, animateItemElement.placementSpec);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        p0<Float> p0Var = this.appearanceSpec;
        int hashCode = (p0Var == null ? 0 : p0Var.hashCode()) * 31;
        p0<androidx.compose.ui.unit.q> p0Var2 = this.placementSpec;
        return hashCode + (p0Var2 != null ? p0Var2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("animateItemPlacement");
        a2Var.e(this.placementSpec);
    }

    @fg.m
    public final p0<Float> n() {
        return this.appearanceSpec;
    }

    @fg.m
    public final p0<androidx.compose.ui.unit.q> o() {
        return this.placementSpec;
    }

    @fg.l
    public final AnimateItemElement r(@fg.m p0<Float> appearanceSpec, @fg.m p0<androidx.compose.ui.unit.q> placementSpec) {
        return new AnimateItemElement(appearanceSpec, placementSpec);
    }

    @fg.l
    public String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.appearanceSpec + ", placementSpec=" + this.placementSpec + ')';
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.j i() {
        return new androidx.compose.foundation.lazy.layout.j(this.appearanceSpec, this.placementSpec);
    }

    @fg.m
    public final p0<Float> v() {
        return this.appearanceSpec;
    }

    @fg.m
    public final p0<androidx.compose.ui.unit.q> w() {
        return this.placementSpec;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l androidx.compose.foundation.lazy.layout.j node) {
        node.A7(this.appearanceSpec);
        node.B7(this.placementSpec);
    }
}
