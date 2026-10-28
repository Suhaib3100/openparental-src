package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.k1;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/e;", "Landroidx/compose/foundation/lazy/layout/n;", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;)V", "Lkotlin/k2;", "a", "()V", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "f", "()Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "", "b", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6265b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 state;

    public e(@fg.l j0 j0Var) {
        this.state = j0Var;
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
        return this.state.B().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public boolean c() {
        return !this.state.B().j().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int d() {
        return this.state.w();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int e() {
        return ((j) kotlin.collections.w.p3(this.state.B().j())).getIndex();
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final j0 getState() {
        return this.state;
    }
}
