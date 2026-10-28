package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.k1;
import kotlin.Metadata;

/* compiled from: PagerBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/i;", "Landroidx/compose/foundation/lazy/layout/n;", "Landroidx/compose/foundation/pager/c0;", "state", "", "beyondBoundsPageCount", "<init>", "(Landroidx/compose/foundation/pager/c0;I)V", "Lkotlin/k2;", "a", "()V", "Landroidx/compose/foundation/pager/c0;", "b", "I", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6798c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsPageCount;

    public i(@fg.l c0 c0Var, int i4) {
        this.state = c0Var;
        this.beyondBoundsPageCount = i4;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public void a() {
        k1 V = this.state.V();
        if (V != null) {
            V.p();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int b() {
        return this.state.K();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public boolean c() {
        return !this.state.F().y().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int d() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondBoundsPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public int e() {
        return Math.min(this.state.K() - 1, ((f) kotlin.collections.w.p3(this.state.F().y())).getIndex() + this.beyondBoundsPageCount);
    }
}
