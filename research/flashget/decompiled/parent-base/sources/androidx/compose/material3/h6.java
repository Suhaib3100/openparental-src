package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ListItem.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/h6;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/g6;", "a", "(JJJJJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/g6;", "Landroidx/compose/ui/unit/h;", "b", "F", "d", "()F", "Elevation", "Landroidx/compose/ui/graphics/e6;", "e", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "(Landroidx/compose/runtime/t;I)J", "c", "contentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h6 f11350a = new h6();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = c0.f0.f37245a.b();

    /* renamed from: c, reason: collision with root package name */
    public static final int f11352c = 0;

    private h6() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final g6 a(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j15;
        long j16;
        long j17;
        tVar.P(-352515689);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.f0.f37245a.a(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.f0.f37245a.t(), tVar, 6) : j5;
        long k6 = (i5 & 4) != 0 ? b3.k(c0.f0.f37245a.B(), tVar, 6) : j6;
        long k7 = (i5 & 8) != 0 ? b3.k(c0.f0.f37245a.J(), tVar, 6) : j7;
        long k10 = (i5 & 16) != 0 ? b3.k(c0.f0.f37245a.Q(), tVar, 6) : j10;
        long k11 = (i5 & 32) != 0 ? b3.k(c0.f0.f37245a.T(), tVar, 6) : j11;
        if ((i5 & 64) != 0) {
            c0.f0 f0Var = c0.f0.f37245a;
            j15 = androidx.compose.ui.graphics.d2.w(b3.k(f0Var.d(), tVar, 6), f0Var.e(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j12;
        }
        if ((i5 & 128) != 0) {
            c0.f0 f0Var2 = c0.f0.f37245a;
            j16 = androidx.compose.ui.graphics.d2.w(b3.k(f0Var2.f(), tVar, 6), f0Var2.g(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j13;
        }
        if ((i5 & 256) != 0) {
            c0.f0 f0Var3 = c0.f0.f37245a;
            j17 = androidx.compose.ui.graphics.d2.w(b3.k(f0Var3.h(), tVar, 6), f0Var3.i(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j14;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-352515689, i4, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:439)");
        }
        g6 g6Var = new g6(k4, k5, k6, k7, k10, k11, j15, j16, j17, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g6Var;
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1253579929, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:400)");
        }
        long k4 = b3.k(c0.f0.f37245a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return k4;
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    @kd.i(name = "getContentColor")
    public final long c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1076068327, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:405)");
        }
        long k4 = b3.k(c0.f0.f37245a.t(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return k4;
    }

    public final float d() {
        return Elevation;
    }

    @androidx.compose.runtime.d3
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-496871597, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:395)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.f0.f37245a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return e4;
    }
}
