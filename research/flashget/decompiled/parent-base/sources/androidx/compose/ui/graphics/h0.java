package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0019\u0010\u000e\u001a\u00060\u0005j\u0002`\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "image", "Landroidx/compose/ui/graphics/v1;", "a", "(Landroidx/compose/ui/graphics/s4;)Landroidx/compose/ui/graphics/v1;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/v1;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "d", "(Landroidx/compose/ui/graphics/v1;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Canvas f17841a = new Canvas();

    @fg.l
    public static final v1 a(@fg.l s4 s4Var) {
        g0 g0Var = new g0();
        g0Var.U(new Canvas(r0.b(s4Var)));
        return g0Var;
    }

    @fg.l
    public static final v1 b(@fg.l Canvas canvas) {
        g0 g0Var = new g0();
        g0Var.U(canvas);
        return g0Var;
    }

    @fg.l
    public static final Canvas d(@fg.l v1 v1Var) {
        kotlin.jvm.internal.l0.n(v1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((g0) v1Var).getInternalCanvas();
    }
}
