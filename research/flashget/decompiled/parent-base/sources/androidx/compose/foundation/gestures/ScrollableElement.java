package androidx.compose.foundation.gestures;

import androidx.compose.foundation.i2;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u0017*\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/gestures/v0;", "Landroidx/compose/foundation/gestures/w0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/i2;", "overscrollEffect", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/gestures/k;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/i2;ZZLandroidx/compose/foundation/gestures/e0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/gestures/k;)V", "n", "()Landroidx/compose/foundation/gestures/v0;", "node", "Lkotlin/k2;", "A", "(Landroidx/compose/foundation/gestures/v0;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/gestures/w0;", "z", "()Landroidx/compose/foundation/gestures/w0;", "e", "Landroidx/compose/foundation/gestures/j0;", "v", "()Landroidx/compose/foundation/gestures/j0;", "f", "Landroidx/compose/foundation/i2;", "w", "()Landroidx/compose/foundation/i2;", "g", "Z", "r", "()Z", "h", "x", "i", "Landroidx/compose/foundation/gestures/e0;", "s", "()Landroidx/compose/foundation/gestures/e0;", "j", "Landroidx/compose/foundation/interaction/k;", "u", "()Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/gestures/k;", "o", "()Landroidx/compose/foundation/gestures/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends androidx.compose.ui.node.y0<v0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i2 overscrollEffect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e0 flingBehavior;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k bringIntoViewSpec;

    public ScrollableElement(@fg.l w0 w0Var, @fg.l j0 j0Var, @fg.m i2 i2Var, boolean z4, boolean z5, @fg.m e0 e0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l k kVar2) {
        this.state = w0Var;
        this.orientation = j0Var;
        this.overscrollEffect = i2Var;
        this.enabled = z4;
        this.reverseDirection = z5;
        this.flingBehavior = e0Var;
        this.interactionSource = kVar;
        this.bringIntoViewSpec = kVar2;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l v0 node) {
        node.Q7(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return kotlin.jvm.internal.l0.g(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && kotlin.jvm.internal.l0.g(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && kotlin.jvm.internal.l0.g(this.flingBehavior, scrollableElement.flingBehavior) && kotlin.jvm.internal.l0.g(this.interactionSource, scrollableElement.interactionSource) && kotlin.jvm.internal.l0.g(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = (this.orientation.hashCode() + (this.state.hashCode() * 31)) * 31;
        i2 i2Var = this.overscrollEffect;
        int a5 = androidx.compose.animation.d1.a(this.reverseDirection, androidx.compose.animation.d1.a(this.enabled, (hashCode + (i2Var != null ? i2Var.hashCode() : 0)) * 31, 31), 31);
        e0 e0Var = this.flingBehavior;
        int hashCode2 = (a5 + (e0Var != null ? e0Var.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.k kVar = this.interactionSource;
        return this.bringIntoViewSpec.hashCode() + ((hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("scrollable");
        a2Var.getProperties().c("orientation", this.orientation);
        a2Var.getProperties().c("state", this.state);
        a2Var.getProperties().c("overscrollEffect", this.overscrollEffect);
        androidx.compose.foundation.h0.a(this.reverseDirection, androidx.compose.foundation.h0.a(this.enabled, a2Var.getProperties(), "enabled", a2Var), "reverseDirection", a2Var).c("flingBehavior", this.flingBehavior);
        a2Var.getProperties().c("interactionSource", this.interactionSource);
        a2Var.getProperties().c("scrollableBringIntoViewConfig", this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public v0 i() {
        return new v0(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final k getBringIntoViewSpec() {
        return this.bringIntoViewSpec;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final e0 getFlingBehavior() {
        return this.flingBehavior;
    }

    @fg.m
    /* renamed from: u, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInteractionSource() {
        return this.interactionSource;
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final j0 getOrientation() {
        return this.orientation;
    }

    @fg.m
    /* renamed from: w, reason: from getter */
    public final i2 getOverscrollEffect() {
        return this.overscrollEffect;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @fg.l
    /* renamed from: z, reason: from getter */
    public final w0 getState() {
        return this.state;
    }
}
