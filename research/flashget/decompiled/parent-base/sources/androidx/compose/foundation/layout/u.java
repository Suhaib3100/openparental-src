package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Column.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/u;", "", "Landroidx/compose/ui/q;", "", "weight", "", "fill", "b", "(Landroidx/compose/ui/q;FZ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/c$b;", "alignment", "e", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c$b;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/w1;", "alignmentLine", "d", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/w1;)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/p0;", "", "alignmentLineBlock", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b1
/* loaded from: classes.dex */
public interface u {

    /* compiled from: Column.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ androidx.compose.ui.q c(u uVar, androidx.compose.ui.q qVar, float f4, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return uVar.b(qVar, f4, z4);
    }

    @x4
    @fg.l
    androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar);

    @x4
    @fg.l
    androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f4, boolean z4);

    @x4
    @fg.l
    androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.layout.w1 w1Var);

    @x4
    @fg.l
    androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l c.b bVar);
}
