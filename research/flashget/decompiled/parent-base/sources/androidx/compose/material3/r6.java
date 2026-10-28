package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Menu.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0018\u001a\u00020\u0004*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/r6;", "", "<init>", "()V", "Landroidx/compose/material3/s6;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/s6;", "Landroidx/compose/ui/graphics/d2;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "d", "(JJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/s6;", "Landroidx/compose/foundation/layout/l1;", "b", "Landroidx/compose/foundation/layout/l1;", "()Landroidx/compose/foundation/layout/l1;", "DropdownMenuItemContentPadding", "Landroidx/compose/material3/a3;", "a", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/s6;", "defaultMenuItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,407:1\n154#2:408\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n123#1:408\n*E\n"})
/* loaded from: classes.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r6 f14073a = new r6();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 DropdownMenuItemContentPadding = androidx.compose.foundation.layout.j1.b(t6.f14576b, androidx.compose.ui.unit.h.g(0));

    /* renamed from: c, reason: collision with root package name */
    public static final int f14075c = 0;

    private r6() {
    }

    @fg.l
    public final s6 a(@fg.l a3 a3Var) {
        s6 defaultMenuItemColorsCached = a3Var.getDefaultMenuItemColorsCached();
        if (defaultMenuItemColorsCached != null) {
            return defaultMenuItemColorsCached;
        }
        c0.g0 g0Var = c0.g0.f37304a;
        s6 s6Var = new s6(b3.h(a3Var, g0Var.k()), b3.h(a3Var, g0Var.o()), b3.h(a3Var, g0Var.v()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g0Var.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g0Var.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g0Var.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.U0(s6Var);
        return s6Var;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 b() {
        return DropdownMenuItemContentPadding;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s6 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1326531516);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1326531516, i4, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:67)");
        }
        s6 a5 = a(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s6 d(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        tVar.P(-1278543580);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j16 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j16 = j10;
        }
        if ((i5 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j17 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j17 = j11;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1278543580, i4, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:91)");
        }
        s6 a5 = a(p6.f13227a.a(tVar, 6)).a(j12, j13, j14, j15, j16, j17);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }
}
