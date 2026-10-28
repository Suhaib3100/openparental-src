package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Draggable2D.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\u0015*\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106RJ\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108RJ\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102¨\u0006:"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/gestures/x;", "Landroidx/compose/foundation/gestures/y;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/y;Lld/l;ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/q;Lld/q;Z)V", "n", "()Landroidx/compose/foundation/gestures/x;", "node", "o", "(Landroidx/compose/foundation/gestures/x;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/gestures/y;", "e", "Lld/l;", "f", "Z", "g", "Landroidx/compose/foundation/interaction/k;", "h", "Lld/a;", "i", "Lld/q;", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Draggable2DElement extends androidx.compose.ui.node.y0<x> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f3728l = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.input.pointer.b0, Boolean> canDrag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> startDragImmediately;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> onDragStarted;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> onDragStopped;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DElement(@fg.l y yVar, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<Boolean> aVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, boolean z5) {
        this.state = yVar;
        this.canDrag = lVar;
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
        if (other == null || Draggable2DElement.class != other.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) other;
        return kotlin.jvm.internal.l0.g(this.state, draggable2DElement.state) && kotlin.jvm.internal.l0.g(this.canDrag, draggable2DElement.canDrag) && this.enabled == draggable2DElement.enabled && kotlin.jvm.internal.l0.g(this.interactionSource, draggable2DElement.interactionSource) && kotlin.jvm.internal.l0.g(this.startDragImmediately, draggable2DElement.startDragImmediately) && kotlin.jvm.internal.l0.g(this.onDragStarted, draggable2DElement.onDragStarted) && kotlin.jvm.internal.l0.g(this.onDragStopped, draggable2DElement.onDragStopped) && this.reverseDirection == draggable2DElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.enabled, (this.canDrag.hashCode() + (this.state.hashCode() * 31)) * 31, 31);
        androidx.compose.foundation.interaction.k kVar = this.interactionSource;
        return Boolean.hashCode(this.reverseDirection) + ((this.onDragStopped.hashCode() + ((this.onDragStarted.hashCode() + ((this.startDragImmediately.hashCode() + ((a5 + (kVar != null ? kVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("draggable2D");
        a2Var.getProperties().c("canDrag", this.canDrag);
        androidx.compose.foundation.h0.a(this.enabled, a2Var.getProperties(), "enabled", a2Var).c("interactionSource", this.interactionSource);
        a2Var.getProperties().c("startDragImmediately", this.startDragImmediately);
        a2Var.getProperties().c("onDragStarted", this.onDragStarted);
        a2Var.getProperties().c("onDragStopped", this.onDragStopped);
        androidx.compose.foundation.h0.a(this.reverseDirection, a2Var.getProperties(), "reverseDirection", a2Var).c("state", this.state);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public x i() {
        return new x(this.state, this.canDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l x node) {
        node.s8(this.state, this.canDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
