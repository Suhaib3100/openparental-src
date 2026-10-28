package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.v1;
import kotlin.Metadata;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/g;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/s4;", "b", "Landroidx/compose/ui/graphics/s4;", "c", "()Landroidx/compose/ui/graphics/s4;", "f", "(Landroidx/compose/ui/graphics/s4;)V", "imageBitmap", "Landroidx/compose/ui/graphics/v1;", "Landroidx/compose/ui/graphics/v1;", "a", "()Landroidx/compose/ui/graphics/v1;", "d", "(Landroidx/compose/ui/graphics/v1;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/a;", "()Landroidx/compose/ui/graphics/drawscope/a;", "e", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "canvasDrawScope", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f7958a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static s4 imageBitmap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static v1 canvas;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    private g() {
    }

    @fg.m
    public final v1 a() {
        return canvas;
    }

    @fg.m
    public final androidx.compose.ui.graphics.drawscope.a b() {
        return canvasDrawScope;
    }

    @fg.m
    public final s4 c() {
        return imageBitmap;
    }

    public final void d(@fg.m v1 v1Var) {
        canvas = v1Var;
    }

    public final void e(@fg.m androidx.compose.ui.graphics.drawscope.a aVar) {
        canvasDrawScope = aVar;
    }

    public final void f(@fg.m s4 s4Var) {
        imageBitmap = s4Var;
    }
}
