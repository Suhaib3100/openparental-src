package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ8\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010!\u001a\u00020\u001e8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/o5;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/p5;", "c", "(FFFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/p5;", "j", "a", "(FFFF)Landroidx/compose/material3/p5;", "b", "F", "f", "()F", "LargeIconSize", "Landroidx/compose/ui/graphics/e6;", "h", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "i", "smallShape", "g", "largeShape", "e", "extendedFabShape", "Landroidx/compose/ui/graphics/d2;", "d", "(Landroidx/compose/runtime/t;I)J", "containerColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n154#2:672\n154#2:673\n154#2:674\n154#2:675\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n463#1:672\n464#1:673\n465#1:674\n466#1:675\n*E\n"})
/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o5 f12924a = new o5();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float LargeIconSize = c0.q.f37948a.k();

    /* renamed from: c, reason: collision with root package name */
    public static final int f12926c = 0;

    private o5() {
    }

    public static /* synthetic */ p5 b(o5 o5Var, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return o5Var.a(f4, f5, f6, f7);
    }

    @fg.l
    public final p5 a(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        return new p5(defaultElevation, pressedElevation, focusedElevation, hoveredElevation, null);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final p5 c(float f4, float f5, float f6, float f7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-241106249);
        if ((i5 & 1) != 0) {
            f4 = c0.s.f38085a.b();
        }
        float f10 = f4;
        if ((i5 & 2) != 0) {
            f5 = c0.s.f38085a.p();
        }
        float f11 = f5;
        if ((i5 & 4) != 0) {
            f6 = c0.s.f38085a.f();
        }
        float f12 = f6;
        if ((i5 & 8) != 0) {
            f7 = c0.s.f38085a.h();
        }
        float f13 = f7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-241106249, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        p5 p5Var = new p5(f10, f11, f12, f13, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p5Var;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1855656391);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1855656391, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:402)");
        }
        long k4 = b3.k(c0.s.f38085a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getExtendedFabShape")
    public final androidx.compose.ui.graphics.e6 e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-536021915);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-536021915, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:399)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.p.f37848a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float f() {
        return LargeIconSize;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getLargeShape")
    public final androidx.compose.ui.graphics.e6 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1835912187);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1835912187, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:395)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.q.f37948a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 h(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-53247565);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-53247565, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:389)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.s.f38085a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSmallShape")
    public final androidx.compose.ui.graphics.e6 i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(394933381);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(394933381, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:392)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.r.f38014a.d(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final p5 j(float f4, float f5, float f6, float f7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-285065125);
        if ((i5 & 1) != 0) {
            f4 = c0.s.f38085a.l();
        }
        float f10 = f4;
        if ((i5 & 2) != 0) {
            f5 = c0.s.f38085a.o();
        }
        float f11 = f5;
        if ((i5 & 4) != 0) {
            f6 = c0.s.f38085a.m();
        }
        float f12 = f6;
        if ((i5 & 8) != 0) {
            f7 = c0.s.f38085a.n();
        }
        float f13 = f7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-285065125, i4, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:444)");
        }
        p5 p5Var = new p5(f10, f11, f12, f13, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p5Var;
    }
}
