package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.p0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.i2;
import kotlin.Metadata;

/* compiled from: LazyItemScopeImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0014\u001a\u00020\n*\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/c;", "Landroidx/compose/foundation/lazy/b;", "<init>", "()V", "", "width", "height", "Lkotlin/k2;", "i", "(II)V", "Landroidx/compose/ui/q;", "", "fraction", "h", "(Landroidx/compose/ui/q;F)Landroidx/compose/ui/q;", "g", "f", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "animationSpec", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;)Landroidx/compose/ui/q;", "Landroidx/compose/runtime/i2;", "Landroidx/compose/runtime/i2;", "maxWidthState", "b", "maxHeightState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5504c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private i2 maxWidthState = androidx.compose.runtime.b.c(Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private i2 maxHeightState = androidx.compose.runtime.b.c(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.b
    @fg.l
    @z0
    public androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l p0<androidx.compose.ui.unit.q> p0Var) {
        return d.a(qVar, null, p0Var);
    }

    @Override // androidx.compose.foundation.lazy.b
    @fg.l
    public androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new ParentSizeElement(f4, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.b
    @fg.l
    public androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new ParentSizeElement(f4, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    @Override // androidx.compose.foundation.lazy.b
    @fg.l
    public androidx.compose.ui.q h(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new ParentSizeElement(f4, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    public final void i(int width, int height) {
        this.maxWidthState.k(width);
        this.maxHeightState.k(height);
    }
}
