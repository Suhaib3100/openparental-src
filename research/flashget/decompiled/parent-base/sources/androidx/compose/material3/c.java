package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: AndroidAlertDialog.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/c;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "b", "F", "f", "()F", "TonalElevation", "Landroidx/compose/ui/graphics/e6;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "containerColor", "iconContentColor", "e", "titleContentColor", "d", "textContentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f10201a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = c0.k.f37551a.g();

    /* renamed from: c, reason: collision with root package name */
    public static final int f10203c = 0;

    private c() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-285850401);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-285850401, i4, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AndroidAlertDialog.android.kt:219)");
        }
        long k4 = b3.k(c0.k.f37551a.f(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getIconContentColor")
    public final long b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1074292351);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1074292351, i4, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AndroidAlertDialog.android.kt:222)");
        }
        long k4 = b3.k(c0.k.f37551a.l(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-331760525);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-331760525, i4, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AndroidAlertDialog.android.kt:216)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.k.f37551a.h(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getTextContentColor")
    public final long d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1352479489);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1352479489, i4, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AndroidAlertDialog.android.kt:228)");
        }
        long k4 = b3.k(c0.k.f37551a.n(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getTitleContentColor")
    public final long e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(11981687);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(11981687, i4, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AndroidAlertDialog.android.kt:225)");
        }
        long k4 = b3.k(c0.k.f37551a.j(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float f() {
        return TonalElevation;
    }
}
