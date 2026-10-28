package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u0019\u0012<\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u0017*\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:RJ\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<RJ\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010<R\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106¨\u0006>"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/gestures/c0;", "Landroidx/compose/foundation/gestures/d0;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "", "canDrag", "Landroidx/compose/foundation/gestures/j0;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/d0;Lld/l;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/q;Lld/q;Z)V", "n", "()Landroidx/compose/foundation/gestures/c0;", "node", "o", "(Landroidx/compose/foundation/gestures/c0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/gestures/d0;", "e", "Lld/l;", "f", "Landroidx/compose/foundation/gestures/j0;", "g", "Z", "h", "Landroidx/compose/foundation/interaction/k;", "i", "Lld/a;", "j", "Lld/q;", "l", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends androidx.compose.ui.node.y0<c0> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f3737m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.input.pointer.b0, Boolean> canDrag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> startDragImmediately;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> onDragStarted;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> onDragStopped;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@fg.l d0 d0Var, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, @fg.l j0 j0Var, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<Boolean> aVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, boolean z5) {
        this.state = d0Var;
        this.canDrag = lVar;
        this.orientation = j0Var;
        this.enabled = z4;
        this.interactionSource = kVar;
        this.startDragImmediately = aVar;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z5;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return kotlin.jvm.internal.l0.g(this.state, draggableElement.state) && kotlin.jvm.internal.l0.g(this.canDrag, draggableElement.canDrag) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && kotlin.jvm.internal.l0.g(this.interactionSource, draggableElement.interactionSource) && kotlin.jvm.internal.l0.g(this.startDragImmediately, draggableElement.startDragImmediately) && kotlin.jvm.internal.l0.g(this.onDragStarted, draggableElement.onDragStarted) && kotlin.jvm.internal.l0.g(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.enabled, (this.orientation.hashCode() + ((this.canDrag.hashCode() + (this.state.hashCode() * 31)) * 31)) * 31, 31);
        androidx.compose.foundation.interaction.k kVar = this.interactionSource;
        return Boolean.hashCode(this.reverseDirection) + ((this.onDragStopped.hashCode() + ((this.onDragStarted.hashCode() + ((this.startDragImmediately.hashCode() + ((a5 + (kVar != null ? kVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("draggable");
        a2Var.getProperties().c("canDrag", this.canDrag);
        a2Var.getProperties().c("orientation", this.orientation);
        androidx.compose.foundation.h0.a(this.reverseDirection, androidx.compose.foundation.h0.a(this.enabled, a2Var.getProperties(), "enabled", a2Var), "reverseDirection", a2Var).c("interactionSource", this.interactionSource);
        a2Var.getProperties().c("startDragImmediately", this.startDragImmediately);
        a2Var.getProperties().c("onDragStarted", this.onDragStarted);
        a2Var.getProperties().c("onDragStopped", this.onDragStopped);
        a2Var.getProperties().c("state", this.state);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c0 i() {
        return new c0(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l c0 node) {
        node.t8(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
