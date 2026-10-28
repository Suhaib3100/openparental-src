package androidx.compose.material3;

import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: NavigationDrawer.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00138Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/v4;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "b", "F", "d", "()F", "ModalDrawerElevation", "c", "e", "PermanentDrawerElevation", "DismissibleDrawerElevation", "MaximumDrawerWidth", "Landroidx/compose/ui/graphics/e6;", "g", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "f", "(Landroidx/compose/runtime/t;I)J", "scrimColor", "a", "containerColor", "Landroidx/compose/foundation/layout/n2;", "h", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final v4 f15026a = new v4();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ModalDrawerElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float PermanentDrawerElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float DismissibleDrawerElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MaximumDrawerWidth;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15031f = 0;

    static {
        c0.j0 j0Var = c0.j0.f37499a;
        ModalDrawerElevation = j0Var.F();
        PermanentDrawerElevation = j0Var.G();
        DismissibleDrawerElevation = j0Var.G();
        MaximumDrawerWidth = j0Var.q();
    }

    private v4() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1797317261);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1797317261, i4, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:687)");
        }
        long k4 = b3.k(c0.j0.f37499a.n(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float b() {
        return DismissibleDrawerElevation;
    }

    public final float c() {
        return MaximumDrawerWidth;
    }

    public final float d() {
        return ModalDrawerElevation;
    }

    public final float e() {
        return PermanentDrawerElevation;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getScrimColor")
    public final long f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1055074989);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1055074989, i4, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:684)");
        }
        long w4 = androidx.compose.ui.graphics.d2.w(b3.k(c0.w0.f38295a.a(), tVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(928378975);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(928378975, i4, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:680)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.j0.f37499a.o(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 h(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-909973510);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-909973510, i4, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:697)");
        }
        androidx.compose.foundation.layout.n2 a5 = ga.a(androidx.compose.foundation.layout.n2.INSTANCE, tVar, 6);
        g3.Companion companion = androidx.compose.foundation.layout.g3.INSTANCE;
        companion.getClass();
        int i5 = androidx.compose.foundation.layout.g3.f5052n;
        companion.getClass();
        androidx.compose.foundation.layout.n2 j4 = androidx.compose.foundation.layout.r2.j(a5, androidx.compose.foundation.layout.g3.f5045g | i5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }
}
