package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0098\u0001\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¤\u0001\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a¸\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aÂ\u0001\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010&\u001a\u00020\u0000*\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/q;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/p6;", "transformOrigin", "Landroidx/compose/ui/graphics/e6;", "shape", "", "clip", "h", "(Landroidx/compose/ui/q;FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "b", "(Landroidx/compose/ui/q;FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/d2;", "ambientShadowColor", "spotShadowColor", "f", "(Landroidx/compose/ui/q;FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;JJ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/i4;", "compositingStrategy", "d", "(Landroidx/compose/ui/q;FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;JJI)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "block", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "j", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p4 {
    @androidx.compose.runtime.x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super q4, kotlin.k2> lVar) {
        return qVar.w3(new BlockGraphicsLayerElement(lVar));
    }

    @androidx.compose.runtime.x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @kotlin.x0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final androidx.compose.ui.q b(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var) {
        long b5 = r4.b();
        long b6 = r4.b();
        i4.INSTANCE.getClass();
        return d(qVar, f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, s5Var, b5, b6, i4.f17852c);
    }

    public static androidx.compose.ui.q c(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, int i4, Object obj) {
        long j5;
        float f16 = (i4 & 1) != 0 ? 1.0f : f4;
        float f17 = (i4 & 2) != 0 ? 1.0f : f5;
        float f18 = (i4 & 4) == 0 ? f6 : 1.0f;
        float f19 = (i4 & 8) != 0 ? 0.0f : f7;
        float f20 = (i4 & 16) != 0 ? 0.0f : f10;
        float f21 = (i4 & 32) != 0 ? 0.0f : f11;
        float f22 = (i4 & 64) != 0 ? 0.0f : f12;
        float f23 = (i4 & 128) != 0 ? 0.0f : f13;
        float f24 = (i4 & 256) == 0 ? f14 : 0.0f;
        float f25 = (i4 & 512) != 0 ? 8.0f : f15;
        if ((i4 & 1024) != 0) {
            p6.INSTANCE.getClass();
            j5 = p6.f17986c;
        } else {
            j5 = j4;
        }
        return b(qVar, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, j5, (i4 & 2048) != 0 ? r5.a() : e6Var, (i4 & 4096) != 0 ? false : z4, (i4 & 8192) != 0 ? null : s5Var);
    }

    @androidx.compose.runtime.x4
    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, @fg.l e6 e6Var, boolean z4, @fg.m s5 s5Var, long j5, long j6, int i4) {
        return qVar.w3(new GraphicsLayerElement(f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, s5Var, j5, j6, i4, null));
    }

    public static androidx.compose.ui.q e(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4, int i5, Object obj) {
        long j7;
        int i6;
        float f16 = (i5 & 1) != 0 ? 1.0f : f4;
        float f17 = (i5 & 2) != 0 ? 1.0f : f5;
        float f18 = (i5 & 4) == 0 ? f6 : 1.0f;
        float f19 = (i5 & 8) != 0 ? 0.0f : f7;
        float f20 = (i5 & 16) != 0 ? 0.0f : f10;
        float f21 = (i5 & 32) != 0 ? 0.0f : f11;
        float f22 = (i5 & 64) != 0 ? 0.0f : f12;
        float f23 = (i5 & 128) != 0 ? 0.0f : f13;
        float f24 = (i5 & 256) == 0 ? f14 : 0.0f;
        float f25 = (i5 & 512) != 0 ? 8.0f : f15;
        if ((i5 & 1024) != 0) {
            p6.INSTANCE.getClass();
            j7 = p6.f17986c;
        } else {
            j7 = j4;
        }
        e6 a5 = (i5 & 2048) != 0 ? r5.a() : e6Var;
        boolean z5 = (i5 & 4096) != 0 ? false : z4;
        s5 s5Var2 = (i5 & 8192) != 0 ? null : s5Var;
        long b5 = (i5 & 16384) != 0 ? r4.b() : j5;
        long b6 = (i5 & 32768) != 0 ? r4.b() : j6;
        if ((i5 & 65536) != 0) {
            i4.INSTANCE.getClass();
            i6 = i4.f17852c;
        } else {
            i6 = i4;
        }
        return d(qVar, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, j7, a5, z5, s5Var2, b5, b6, i6);
    }

    @androidx.compose.runtime.x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @kotlin.x0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    public static final androidx.compose.ui.q f(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6) {
        i4.INSTANCE.getClass();
        return d(qVar, f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, s5Var, j5, j6, i4.f17852c);
    }

    public static androidx.compose.ui.q g(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4, Object obj) {
        long j7;
        float f16 = (i4 & 1) != 0 ? 1.0f : f4;
        float f17 = (i4 & 2) != 0 ? 1.0f : f5;
        float f18 = (i4 & 4) == 0 ? f6 : 1.0f;
        float f19 = (i4 & 8) != 0 ? 0.0f : f7;
        float f20 = (i4 & 16) != 0 ? 0.0f : f10;
        float f21 = (i4 & 32) != 0 ? 0.0f : f11;
        float f22 = (i4 & 64) != 0 ? 0.0f : f12;
        float f23 = (i4 & 128) != 0 ? 0.0f : f13;
        float f24 = (i4 & 256) == 0 ? f14 : 0.0f;
        float f25 = (i4 & 512) != 0 ? 8.0f : f15;
        if ((i4 & 1024) != 0) {
            p6.INSTANCE.getClass();
            j7 = p6.f17986c;
        } else {
            j7 = j4;
        }
        return f(qVar, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, j7, (i4 & 2048) != 0 ? r5.a() : e6Var, (i4 & 4096) != 0 ? false : z4, (i4 & 8192) != 0 ? null : s5Var, (i4 & 16384) != 0 ? r4.b() : j5, (i4 & 32768) != 0 ? r4.b() : j6);
    }

    @androidx.compose.runtime.x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @kotlin.x0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.q h(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4) {
        return e(qVar, f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, null, 0L, 0L, 0, 114688, null);
    }

    public static androidx.compose.ui.q i(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, int i4, Object obj) {
        long j5;
        float f16 = (i4 & 1) != 0 ? 1.0f : f4;
        float f17 = (i4 & 2) != 0 ? 1.0f : f5;
        float f18 = (i4 & 4) == 0 ? f6 : 1.0f;
        float f19 = (i4 & 8) != 0 ? 0.0f : f7;
        float f20 = (i4 & 16) != 0 ? 0.0f : f10;
        float f21 = (i4 & 32) != 0 ? 0.0f : f11;
        float f22 = (i4 & 64) != 0 ? 0.0f : f12;
        float f23 = (i4 & 128) != 0 ? 0.0f : f13;
        float f24 = (i4 & 256) == 0 ? f14 : 0.0f;
        float f25 = (i4 & 512) != 0 ? 8.0f : f15;
        if ((i4 & 1024) != 0) {
            p6.INSTANCE.getClass();
            j5 = p6.f17986c;
        } else {
            j5 = j4;
        }
        return h(qVar, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, j5, (i4 & 2048) != 0 ? r5.a() : e6Var, (i4 & 4096) != 0 ? false : z4);
    }

    @androidx.compose.runtime.x4
    @fg.l
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar) {
        return androidx.compose.ui.platform.y1.e() ? qVar.w3(e(androidx.compose.ui.q.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : qVar;
    }
}
