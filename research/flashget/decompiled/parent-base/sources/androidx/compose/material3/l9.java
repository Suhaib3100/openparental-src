package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0017\u0010\u000f\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u0011\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0013\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/l9;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/e6;", "f", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "c", "(Landroidx/compose/runtime/t;I)J", "color", "d", "contentColor", "a", "actionColor", "b", "actionContentColor", "e", "dismissActionContentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l9 f12464a = new l9();

    /* renamed from: b, reason: collision with root package name */
    public static final int f12465b = 0;

    private l9() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getActionColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(743425465);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(743425465, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:419)");
        }
        long k4 = b3.k(c0.e1.f37200a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getActionContentColor")
    public final long b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1313141593);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1313141593, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:422)");
        }
        long k4 = b3.k(c0.e1.f37200a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getColor")
    public final long c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(987938253);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(987938253, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:413)");
        }
        long k4 = b3.k(c0.e1.f37200a.f(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContentColor")
    public final long d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1021310823);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1021310823, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:416)");
        }
        long k4 = b3.k(c0.e1.f37200a.o(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getDismissActionContentColor")
    public final long e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-528602817);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-528602817, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:425)");
        }
        long k4 = b3.k(c0.e1.f37200a.k(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-551629101);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-551629101, i4, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:410)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.e1.f37200a.h(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }
}
