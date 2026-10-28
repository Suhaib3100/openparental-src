package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: NavigationRail.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/o7;", "", "<init>", "()V", "Landroidx/compose/material3/n7;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/n7;", "Landroidx/compose/ui/graphics/d2;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "b", "(JJJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/n7;", "c", "(JJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/n7;", "Landroidx/compose/material3/a3;", "d", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/n7;", "defaultNavigationRailItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o7 f12928a = new o7();

    /* renamed from: b, reason: collision with root package name */
    public static final int f12929b = 0;

    private o7() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n7 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2014332261);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2014332261, i4, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:293)");
        }
        n7 d5 = d(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final n7 b(long j4, long j5, long j6, long j7, long j10, long j11, long j12, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-2104358508);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.k0.f37568a.e(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.k0.f37568a.j(), tVar, 6) : j5;
        long k6 = (i5 & 4) != 0 ? b3.k(c0.k0.f37568a.f(), tVar, 6) : j6;
        long k7 = (i5 & 8) != 0 ? b3.k(c0.k0.f37568a.v(), tVar, 6) : j7;
        long k10 = (i5 & 16) != 0 ? b3.k(c0.k0.f37568a.w(), tVar, 6) : j10;
        long w4 = (i5 & 32) != 0 ? androidx.compose.ui.graphics.d2.w(k7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long w5 = (i5 & 64) != 0 ? androidx.compose.ui.graphics.d2.w(k10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2104358508, i4, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:317)");
        }
        n7 a5 = d(p6.f13227a.a(tVar, 6)).a(k4, k5, k6, k7, k10, w4, w5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    @androidx.compose.runtime.i
    public final /* synthetic */ n7 c(long j4, long j5, long j6, long j7, long j10, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1621601574);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.k0.f37568a.e(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.k0.f37568a.j(), tVar, 6) : j5;
        long k6 = (i5 & 4) != 0 ? b3.k(c0.k0.f37568a.f(), tVar, 6) : j6;
        long k7 = (i5 & 8) != 0 ? b3.k(c0.k0.f37568a.v(), tVar, 6) : j7;
        long k10 = (i5 & 16) != 0 ? b3.k(c0.k0.f37568a.w(), tVar, 6) : j10;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1621601574, i4, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:355)");
        }
        n7 n7Var = new n7(k4, k5, k6, k7, k10, androidx.compose.ui.graphics.d2.w(k7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(k10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return n7Var;
    }

    @fg.l
    public final n7 d(@fg.l a3 a3Var) {
        n7 defaultNavigationRailItemColorsCached = a3Var.getDefaultNavigationRailItemColorsCached();
        if (defaultNavigationRailItemColorsCached != null) {
            return defaultNavigationRailItemColorsCached;
        }
        c0.k0 k0Var = c0.k0.f37568a;
        n7 n7Var = new n7(b3.h(a3Var, k0Var.e()), b3.h(a3Var, k0Var.j()), b3.h(a3Var, k0Var.f()), b3.h(a3Var, k0Var.v()), b3.h(a3Var, k0Var.w()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, k0Var.v()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, k0Var.w()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.W0(n7Var);
        return n7Var;
    }
}
