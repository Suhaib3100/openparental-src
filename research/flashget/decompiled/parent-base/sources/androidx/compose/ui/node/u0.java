package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;

/* compiled from: MeasureBlocks.kt */
@kotlin.k(message = "MeasureBlocks was deprecated. Please use MeasurePolicy instead.")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0012J-\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0012J-\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/u0;", "", "Landroidx/compose/ui/layout/o0;", "measureScope", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/p;", "", "h", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "w", "c", "b", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface u0 {
    @fg.l
    androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 measureScope, @fg.l List<? extends androidx.compose.ui.layout.l0> measurables, long constraints);

    int b(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l List<? extends androidx.compose.ui.layout.p> measurables, int h4);

    int c(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l List<? extends androidx.compose.ui.layout.p> measurables, int w4);

    int d(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l List<? extends androidx.compose.ui.layout.p> measurables, int h4);

    int e(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l List<? extends androidx.compose.ui.layout.p> measurables, int w4);
}
