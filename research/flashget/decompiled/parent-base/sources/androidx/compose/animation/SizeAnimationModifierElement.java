package androidx.compose.animation;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: AnimationModifier.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u0019\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018RI\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001a¨\u0006."}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/animation/v0;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/u;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "initialValue", "targetValue", "Lkotlin/k2;", "finishedListener", "<init>", "(Landroidx/compose/animation/core/p0;Lld/p;)V", "u", "()Landroidx/compose/animation/v0;", "node", "x", "(Landroidx/compose/animation/v0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/animation/core/p0;", "o", "()Lld/p;", "r", "(Landroidx/compose/animation/core/p0;Lld/p;)Landroidx/compose/animation/SizeAnimationModifierElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/animation/core/p0;", "v", "e", "Lld/p;", "w", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SizeAnimationModifierElement extends androidx.compose.ui.node.y0<v0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> animationSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.m ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> pVar) {
        this.animationSpec = p0Var;
        this.finishedListener = pVar;
    }

    public static SizeAnimationModifierElement s(SizeAnimationModifierElement sizeAnimationModifierElement, androidx.compose.animation.core.p0 p0Var, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = sizeAnimationModifierElement.animationSpec;
        }
        if ((i4 & 2) != 0) {
            pVar = sizeAnimationModifierElement.finishedListener;
        }
        sizeAnimationModifierElement.getClass();
        return new SizeAnimationModifierElement(p0Var, pVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) other;
        return kotlin.jvm.internal.l0.g(this.animationSpec, sizeAnimationModifierElement.animationSpec) && kotlin.jvm.internal.l0.g(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = this.animationSpec.hashCode() * 31;
        ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> pVar = this.finishedListener;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("animateContentSize");
        a2Var.getProperties().c("animationSpec", this.animationSpec);
        a2Var.getProperties().c("finishedListener", this.finishedListener);
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> n() {
        return this.animationSpec;
    }

    @fg.m
    public final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> o() {
        return this.finishedListener;
    }

    @fg.l
    public final SizeAnimationModifierElement r(@fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> animationSpec, @fg.m ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> finishedListener) {
        return new SizeAnimationModifierElement(animationSpec, finishedListener);
    }

    @fg.l
    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", finishedListener=" + this.finishedListener + ')';
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public v0 i() {
        return new v0(this.animationSpec, this.finishedListener);
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> v() {
        return this.animationSpec;
    }

    @fg.m
    public final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> w() {
        return this.finishedListener;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l v0 node) {
        node.D7(this.animationSpec);
        node.E7(this.finishedListener);
    }
}
