package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.p0;
import androidx.compose.animation.core.z2;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridItemScope.kt */
@x4
@c0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "animationSpec", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/lazy/staggeredgrid/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface p {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.q b(p pVar, androidx.compose.ui.q qVar, p0 p0Var, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        return pVar.a(qVar, p0Var);
    }

    @fg.l
    @z0
    androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l p0<androidx.compose.ui.unit.q> p0Var);
}
