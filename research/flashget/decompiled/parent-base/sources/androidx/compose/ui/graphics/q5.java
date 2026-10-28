package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: RectHelper.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li0/i;", "Landroid/graphics/Rect;", "b", "(Li0/i;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Li0/i;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Li0/i;", "Landroidx/compose/ui/unit/s;", "a", "(Landroidx/compose/ui/unit/s;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/s;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q5 {
    @fg.l
    public static final Rect a(@fg.l androidx.compose.ui.unit.s sVar) {
        return new Rect(sVar.t(), sVar.getTop(), sVar.x(), sVar.j());
    }

    @fg.l
    @kotlin.k(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @kotlin.x0(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final Rect b(@fg.l i0.i iVar) {
        return new Rect((int) iVar.t(), (int) iVar.getTop(), (int) iVar.x(), (int) iVar.j());
    }

    @fg.l
    public static final RectF c(@fg.l i0.i iVar) {
        return new RectF(iVar.t(), iVar.getTop(), iVar.x(), iVar.j());
    }

    @fg.l
    public static final androidx.compose.ui.unit.s d(@fg.l Rect rect) {
        return new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
    }

    @fg.l
    public static final i0.i e(@fg.l Rect rect) {
        return new i0.i(rect.left, rect.top, rect.right, rect.bottom);
    }
}
