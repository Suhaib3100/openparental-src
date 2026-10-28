package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.k1;
import kotlin.Metadata;

/* compiled from: LazyListBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/h;", "Landroidx/compose/foundation/lazy/layout/n;", "Landroidx/compose/foundation/lazy/c0;", "state", "", "beyondBoundsItemCount", "<init>", "(Landroidx/compose/foundation/lazy/c0;I)V", "Lkotlin/k2;", "a", "()V", "Landroidx/compose/foundation/lazy/c0;", "g", "()Landroidx/compose/foundation/lazy/c0;", "b", "I", "f", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5883c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsItemCount;

    public h(@fg.l c0 c0Var, int i4) {
        this.state = c0Var;
        this.beyondBoundsItemCount = i4;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public void a() {
        k1 remeasurement = this.state.getRemeasurement();
        if (remeasurement != null) {
            remeasurement.p();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int b() {
        return this.state.A().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public boolean c() {
        return !this.state.A().j().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int d() {
        return Math.max(0, this.state.u() - this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int e() {
        return Math.min(b() - 1, ((n) kotlin.collections.w.p3(this.state.A().j())).getIndex() + this.beyondBoundsItemCount);
    }

    /* renamed from: f, reason: from getter */
    public final int getBeyondBoundsItemCount() {
        return this.beyondBoundsItemCount;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final c0 getState() {
        return this.state;
    }
}
