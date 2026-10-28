package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.p0;
import androidx.compose.foundation.z0;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridItemScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u0004*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/q;", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "<init>", "()V", "Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "animationSpec", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;)Landroidx/compose/ui/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q f6438a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final int f6439b = 0;

    private q() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.p
    @fg.l
    @z0
    public androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l p0<androidx.compose.ui.unit.q> p0Var) {
        return qVar.w3(new AnimateItemElement(p0Var));
    }
}
