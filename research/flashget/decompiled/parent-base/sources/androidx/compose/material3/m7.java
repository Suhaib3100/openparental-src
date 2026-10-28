package androidx.compose.material3;

import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/m7;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "ContainerColor", "Landroidx/compose/foundation/layout/n2;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m7 f12546a = new m7();

    /* renamed from: b, reason: collision with root package name */
    public static final int f12547b = 0;

    private m7() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1949394041);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1949394041, i4, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:275)");
        }
        long k4 = b3.k(c0.k0.f37568a.m(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1546379058);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1546379058, i4, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:282)");
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
