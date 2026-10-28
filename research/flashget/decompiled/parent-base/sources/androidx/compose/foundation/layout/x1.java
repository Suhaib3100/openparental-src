package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Row.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/x1;", "", "Landroidx/compose/ui/q;", "", "weight", "", "fill", "b", "(Landroidx/compose/ui/q;FZ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/c$c;", "alignment", "f", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c$c;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/m;", "alignmentLine", "d", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/m;)Landroidx/compose/ui/q;", "c", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/p0;", "", "alignmentLineBlock", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b1
/* loaded from: classes.dex */
public interface x1 {

    /* compiled from: Row.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ androidx.compose.ui.q e(x1 x1Var, androidx.compose.ui.q qVar, float f4, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return x1Var.b(qVar, f4, z4);
    }

    @x4
    @fg.l
    androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar);

    @x4
    @fg.l
    androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f4, boolean z4);

    @x4
    @fg.l
    androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar);

    @x4
    @fg.l
    androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.layout.m mVar);

    @x4
    @fg.l
    androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, @fg.l c.InterfaceC0326c interfaceC0326c);
}
