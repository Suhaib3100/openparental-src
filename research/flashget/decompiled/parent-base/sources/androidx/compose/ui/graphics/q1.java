package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import kotlin.Metadata;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/q1;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "a", "(JI)Landroid/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "Landroidx/compose/ui/graphics/l1;", "b", "(Landroid/graphics/BlendModeColorFilter;)Landroidx/compose/ui/graphics/l1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(29)
/* loaded from: classes.dex */
final class q1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q1 f18009a = new q1();

    private q1() {
    }

    @fg.l
    @androidx.annotation.u
    public final BlendModeColorFilter a(long color, int blendMode) {
        p1.a();
        return o1.a(f2.r(color), f0.b(blendMode));
    }

    @fg.l
    @androidx.annotation.u
    public final l1 b(@fg.l BlendModeColorFilter androidBlendModeColorFilter) {
        int color;
        BlendMode mode;
        color = androidBlendModeColorFilter.getColor();
        long b5 = f2.b(color);
        mode = androidBlendModeColorFilter.getMode();
        return new l1(b5, f0.c(mode), androidBlendModeColorFilter, null);
    }
}
