package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: RenderEffect.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/n6;", "edgeTreatment", "Landroidx/compose/ui/graphics/s1;", "a", "(FFI)Landroidx/compose/ui/graphics/s1;", "offsetX", "offsetY", "Landroidx/compose/ui/graphics/a5;", "c", "(FF)Landroidx/compose/ui/graphics/a5;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t5 {
    @androidx.compose.runtime.x4
    @fg.l
    public static final s1 a(float f4, float f5, int i4) {
        return new s1(null, f4, f5, i4, null);
    }

    public static s1 b(float f4, float f5, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            n6.INSTANCE.getClass();
            i4 = n6.f17973c;
        }
        return a(f4, f5, i4);
    }

    @androidx.compose.runtime.x4
    @fg.l
    public static final a5 c(float f4, float f5) {
        return new a5(null, i0.g.a(f4, f5), null);
    }
}
