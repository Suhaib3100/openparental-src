package androidx.compose.material3;

import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/f7;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "b", "F", "()F", "Elevation", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "containerColor", "Landroidx/compose/foundation/layout/n2;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final f7 f10687a = new f7();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = c0.i0.f37429a.n();

    /* renamed from: c, reason: collision with root package name */
    public static final int f10689c = 0;

    private f7() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1528098623);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1528098623, i4, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:278)");
        }
        long k4 = b3.k(c0.i0.f37429a.m(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float b() {
        return Elevation;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1938678202);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1938678202, i4, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:285)");
        }
        androidx.compose.foundation.layout.n2 a5 = ga.a(androidx.compose.foundation.layout.n2.INSTANCE, tVar, 6);
        g3.Companion companion = androidx.compose.foundation.layout.g3.INSTANCE;
        companion.getClass();
        int i5 = androidx.compose.foundation.layout.g3.f5051m;
        companion.getClass();
        androidx.compose.foundation.layout.n2 j4 = androidx.compose.foundation.layout.r2.j(a5, androidx.compose.foundation.layout.g3.f5048j | i5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }
}
