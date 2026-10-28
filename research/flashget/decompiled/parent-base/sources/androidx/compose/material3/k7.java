package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: NavigationDrawer.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/k7;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "selectedContainerColor", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "Landroidx/compose/material3/j7;", "a", "(JJJJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/j7;", "Landroidx/compose/foundation/layout/l1;", "b", "Landroidx/compose/foundation/layout/l1;", "()Landroidx/compose/foundation/layout/l1;", "ItemPadding", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,948:1\n154#2:949\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n846#1:949\n*E\n"})
/* loaded from: classes.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k7 f12097a = new k7();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 ItemPadding = androidx.compose.foundation.layout.j1.c(androidx.compose.ui.unit.h.g(12), 0.0f, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f12099c = 0;

    private k7() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final j7 a(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1574983348);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.j0.f37499a.f(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.j0.f37499a.n(), tVar, 6) : j5;
        long k6 = (i5 & 4) != 0 ? b3.k(c0.j0.f37499a.e(), tVar, 6) : j6;
        long k7 = (i5 & 8) != 0 ? b3.k(c0.j0.f37499a.y(), tVar, 6) : j7;
        long k10 = (i5 & 16) != 0 ? b3.k(c0.j0.f37499a.j(), tVar, 6) : j10;
        long k11 = (i5 & 32) != 0 ? b3.k(c0.j0.f37499a.z(), tVar, 6) : j11;
        long j14 = (i5 & 64) != 0 ? k10 : j12;
        long j15 = (i5 & 128) != 0 ? k11 : j13;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1574983348, i4, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:830)");
        }
        l4 l4Var = new l4(k6, k7, k10, k11, k4, k5, j14, j15, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return l4Var;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 b() {
        return ItemPadding;
    }
}
