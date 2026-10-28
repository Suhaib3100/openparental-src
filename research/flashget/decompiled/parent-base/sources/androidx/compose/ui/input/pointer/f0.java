package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/f0;", "", "Landroidx/compose/ui/node/h0;", "root", "<init>", "(Landroidx/compose/ui/node/h0;)V", "Landroidx/compose/ui/input/pointer/d0;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r0;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/s0;", "b", "(Landroidx/compose/ui/input/pointer/d0;Landroidx/compose/ui/input/pointer/r0;Z)I", "Lkotlin/k2;", "d", "()V", "a", "Landroidx/compose/ui/node/h0;", "()Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/input/pointer/g;", "Landroidx/compose/ui/input/pointer/g;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/c0;", "c", "Landroidx/compose/ui/input/pointer/c0;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/t;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18749f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.h0 root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g hitPathTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 pointerInputChangeEventProducer = new c0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.t hitResult = new androidx.compose.ui.node.t();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public f0(@fg.l androidx.compose.ui.node.h0 h0Var) {
        this.root = h0Var;
        this.hitPathTracker = new g(h0Var.v());
    }

    public static /* synthetic */ int c(f0 f0Var, d0 d0Var, r0 r0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return f0Var.b(d0Var, r0Var, z4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.node.h0 getRoot() {
        return this.root;
    }

    public final int b(@fg.l d0 pointerEvent, @fg.l r0 positionCalculator, boolean isInBounds) {
        boolean z4;
        if (this.isProcessing) {
            return g0.a(false, false);
        }
        boolean z5 = true;
        try {
            this.isProcessing = true;
            h b5 = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int z6 = b5.a().z();
            for (int i4 = 0; i4 < z6; i4++) {
                b0 A = b5.a().A(i4);
                if (!A.getPressed() && !A.getPreviousPressed()) {
                }
                z4 = false;
                break;
            }
            z4 = true;
            int z7 = b5.a().z();
            for (int i5 = 0; i5 < z7; i5++) {
                b0 A2 = b5.a().A(i5);
                if (z4 || q.c(A2)) {
                    int type = A2.getType();
                    q0.INSTANCE.getClass();
                    androidx.compose.ui.node.h0.J0(this.root, A2.getPosition(), this.hitResult, q0.i(type, q0.f18817d), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.a(A2.getId(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.f();
            boolean b6 = this.hitPathTracker.b(b5, isInBounds);
            if (!b5.getSuppressMovementConsumption()) {
                int z10 = b5.a().z();
                for (int i6 = 0; i6 < z10; i6++) {
                    b0 A3 = b5.a().A(i6);
                    if (q.q(A3) && A3.D()) {
                        break;
                    }
                }
            }
            z5 = false;
            int a5 = g0.a(b6, z5);
            this.isProcessing = false;
            return a5;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void d() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.e();
    }
}
