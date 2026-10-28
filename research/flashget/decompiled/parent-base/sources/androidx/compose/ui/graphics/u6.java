package androidx.compose.ui.graphics;

import android.graphics.Paint;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/u6;", "", "<init>", "()V", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Landroidx/compose/ui/graphics/k1;", "mode", "Lkotlin/k2;", "a", "(Landroid/graphics/Paint;I)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(29)
/* loaded from: classes.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u6 f18052a = new u6();

    private u6() {
    }

    @androidx.annotation.u
    public final void a(@fg.l Paint paint, int mode) {
        paint.setBlendMode(f0.b(mode));
    }
}
