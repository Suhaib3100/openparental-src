package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/y5;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/s5;", "inputRenderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/n6;", "edgeTreatment", "Landroid/graphics/RenderEffect;", "a", "(Landroidx/compose/ui/graphics/s5;FFI)Landroid/graphics/RenderEffect;", "Li0/f;", "offset", "b", "(Landroidx/compose/ui/graphics/s5;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(31)
/* loaded from: classes.dex */
final class y5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final y5 f18482a = new y5();

    private y5() {
    }

    @fg.l
    @androidx.annotation.u
    public final RenderEffect a(@fg.m s5 inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        RenderEffect createBlurEffect;
        RenderEffect createBlurEffect2;
        if (inputRenderEffect == null) {
            createBlurEffect2 = RenderEffect.createBlurEffect(radiusX, radiusY, f1.b(edgeTreatment));
            return createBlurEffect2;
        }
        createBlurEffect = RenderEffect.createBlurEffect(radiusX, radiusY, inputRenderEffect.a(), f1.b(edgeTreatment));
        return createBlurEffect;
    }

    @fg.l
    @androidx.annotation.u
    public final RenderEffect b(@fg.m s5 inputRenderEffect, long offset) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        if (inputRenderEffect == null) {
            createOffsetEffect2 = RenderEffect.createOffsetEffect(i0.f.p(offset), i0.f.r(offset));
            return createOffsetEffect2;
        }
        createOffsetEffect = RenderEffect.createOffsetEffect(i0.f.p(offset), i0.f.r(offset), inputRenderEffect.a());
        return createOffsetEffect;
    }
}
