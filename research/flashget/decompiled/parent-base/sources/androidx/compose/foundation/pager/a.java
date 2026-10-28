package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/pager/a;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroidx/compose/foundation/pager/c0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "<init>", "(Landroidx/compose/foundation/pager/c0;Landroidx/compose/foundation/gestures/j0;)V", "Landroidx/compose/ui/unit/c0;", "b", "(JLandroidx/compose/foundation/gestures/j0;)J", "Li0/f;", "a", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/c0;", "d", "()Landroidx/compose/foundation/pager/c0;", "c", "Landroidx/compose/foundation/gestures/j0;", "()Landroidx/compose/foundation/gestures/j0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    public a(@fg.l c0 c0Var, @fg.l j0 j0Var) {
        this.state = c0Var;
        this.orientation = j0Var;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long H2(long consumed, long available, int source) {
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18688d)) {
            i0.f.INSTANCE.getClass();
            if (!i0.f.l(available, i0.f.f74147c)) {
                throw new CancellationException();
            }
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    public final long a(long j4, @fg.l j0 j0Var) {
        return j0Var == j0.Vertical ? i0.f.i(j4, 0.0f, 0.0f, 2, null) : i0.f.i(j4, 0.0f, 0.0f, 1, null);
    }

    public final long b(long j4, @fg.l j0 j0Var) {
        return j0Var == j0.Vertical ? androidx.compose.ui.unit.c0.g(j4, 0.0f, 0.0f, 2, null) : androidx.compose.ui.unit.c0.g(j4, 0.0f, 0.0f, 1, null);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final j0 getOrientation() {
        return this.orientation;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final c0 getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long i5(long available, int source) {
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        if (!androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18687c) || Math.abs(this.state.z()) <= com.google.firebase.remoteconfig.p.f60679p) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
        float z4 = this.state.z() * this.state.L();
        float pageSpacing = ((this.state.F().getPageSpacing() + this.state.F().getPageSize()) * (-Math.signum(this.state.z()))) + z4;
        if (this.state.z() > 0.0f) {
            pageSpacing = z4;
            z4 = pageSpacing;
        }
        j0 j0Var = this.orientation;
        j0 j0Var2 = j0.Horizontal;
        float f4 = -this.state.b(-kotlin.ranges.s.H(j0Var == j0Var2 ? i0.f.p(available) : i0.f.r(available), z4, pageSpacing));
        float p4 = this.orientation == j0Var2 ? f4 : i0.f.p(available);
        if (this.orientation != j0.Vertical) {
            f4 = i0.f.r(available);
        }
        return i0.f.h(available, p4, f4);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    public Object w0(long j4, long j5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return androidx.compose.ui.unit.c0.b(b(j5, this.orientation));
    }
}
