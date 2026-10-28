package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.r6;
import kotlin.Metadata;

/* compiled from: AndroidVertexMode.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/r6;", "Landroid/graphics/Canvas$VertexMode;", "a", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g1 {
    @fg.l
    public static final Canvas.VertexMode a(int i4) {
        r6.Companion companion = r6.INSTANCE;
        companion.getClass();
        if (r6.g(i4, r6.f18017c)) {
            return Canvas.VertexMode.TRIANGLES;
        }
        companion.getClass();
        if (r6.g(i4, r6.f18018d)) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        companion.getClass();
        return r6.g(i4, r6.f18019e) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
