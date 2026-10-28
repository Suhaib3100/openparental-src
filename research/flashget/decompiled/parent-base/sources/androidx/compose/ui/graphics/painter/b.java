package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.m4;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.v;
import fg.l;
import kotlin.Metadata;

/* compiled from: BitmapPainter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "image", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "Landroidx/compose/ui/graphics/m4;", "filterQuality", "Landroidx/compose/ui/graphics/painter/a;", "a", "(Landroidx/compose/ui/graphics/s4;JJI)Landroidx/compose/ui/graphics/painter/a;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    @l
    public static final a a(@l s4 s4Var, long j4, long j5, int i4) {
        a aVar = new a(s4Var, j4, j5, null);
        aVar.m(i4);
        return aVar;
    }

    public static a b(s4 s4Var, long j4, long j5, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            q.INSTANCE.getClass();
            j4 = q.f21519c;
        }
        long j6 = j4;
        if ((i5 & 4) != 0) {
            j5 = v.a(s4Var.getWidth(), s4Var.getHeight());
        }
        long j7 = j5;
        if ((i5 & 8) != 0) {
            m4.INSTANCE.getClass();
            i4 = m4.f17930d;
        }
        return a(s4Var, j6, j7, i4);
    }
}
