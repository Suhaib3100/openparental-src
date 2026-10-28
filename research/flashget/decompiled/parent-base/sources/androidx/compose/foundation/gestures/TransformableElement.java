package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/gestures/e1;", "Landroidx/compose/foundation/gestures/f1;", "state", "Lkotlin/Function1;", "Li0/f;", "", "canPan", "lockRotationOnZoomPan", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/f1;Lld/l;ZZ)V", "n", "()Landroidx/compose/foundation/gestures/e1;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/foundation/gestures/e1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/gestures/f1;", "e", "Lld/l;", "f", "Z", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TransformableElement extends androidx.compose.ui.node.y0<e1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f1 state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<i0.f, Boolean> canPan;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean lockRotationOnZoomPan;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformableElement(@fg.l f1 f1Var, @fg.l ld.l<? super i0.f, Boolean> lVar, boolean z4, boolean z5) {
        this.state = f1Var;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z4;
        this.enabled = z5;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TransformableElement.class != other.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) other;
        return kotlin.jvm.internal.l0.g(this.state, transformableElement.state) && kotlin.jvm.internal.l0.g(this.canPan, transformableElement.canPan) && this.lockRotationOnZoomPan == transformableElement.lockRotationOnZoomPan && this.enabled == transformableElement.enabled;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.enabled) + androidx.compose.animation.d1.a(this.lockRotationOnZoomPan, (this.canPan.hashCode() + (this.state.hashCode() * 31)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("transformable");
        a2Var.getProperties().c("state", this.state);
        a2Var.getProperties().c("canPan", this.canPan);
        androidx.compose.foundation.h0.a(this.enabled, a2Var.getProperties(), "enabled", a2Var).c("lockRotationOnZoomPan", Boolean.valueOf(this.lockRotationOnZoomPan));
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e1 i() {
        return new e1(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l e1 node) {
        node.P7(this.state, this.canPan, this.lockRotationOnZoomPan, this.enabled);
    }
}
