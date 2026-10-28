package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.p0;
import androidx.compose.animation.core.z2;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LazyItemScope.kt */
@x4
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\f\u001a\u00020\u0002*\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/b;", "", "Landroidx/compose/ui/q;", "", "fraction", "h", "(Landroidx/compose/ui/q;F)Landroidx/compose/ui/q;", "g", "f", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "animationSpec", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;)Landroidx/compose/ui/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@e0
/* loaded from: classes.dex */
public interface b {

    /* compiled from: LazyItemScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ androidx.compose.ui.q b(b bVar, androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return bVar.g(qVar, f4);
    }

    static /* synthetic */ androidx.compose.ui.q c(b bVar, androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return bVar.h(qVar, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.q d(b bVar, androidx.compose.ui.q qVar, p0 p0Var, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.q.b(z2.d(androidx.compose.ui.unit.q.INSTANCE)), 1, null);
        }
        return bVar.a(qVar, p0Var);
    }

    static /* synthetic */ androidx.compose.ui.q e(b bVar, androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return bVar.f(qVar, f4);
    }

    @fg.l
    @z0
    androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l p0<androidx.compose.ui.unit.q> p0Var);

    @fg.l
    androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4);

    @fg.l
    androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4);

    @fg.l
    androidx.compose.ui.q h(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4);
}
