package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.p0;
import androidx.compose.animation.core.z2;
import androidx.compose.foundation.z0;
import kotlin.Metadata;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/p0;", "", "appearanceSpec", "Landroidx/compose/ui/unit/q;", "placementSpec", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;Landroidx/compose/animation/core/p0;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @fg.l
    @z0
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m p0<Float> p0Var, @fg.m p0<androidx.compose.ui.unit.q> p0Var2) {
        return (p0Var == null && p0Var2 == null) ? qVar : qVar.w3(new AnimateItemElement(p0Var, p0Var2));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, p0 p0Var, p0 p0Var2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.r(220, 0, null, 6, null);
        }
        if ((i4 & 2) != 0) {
            p0Var2 = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        return a(qVar, p0Var, p0Var2);
    }
}
