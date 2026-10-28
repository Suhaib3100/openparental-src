package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008a\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\u0006J\u008a\u0001\u0010-\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0015JN\u0010.\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001fR\u001d\u00102\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u001d\u00104\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b3\u00101R\u0018\u00108\u001a\u00020\u0004*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0018\u0010:\u001a\u00020\u0004*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/material3/n5;", "", "<init>", "()V", "Landroidx/compose/material3/q8;", "e", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/q8;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "f", "(JJJJJJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/q8;", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/r8;", "g", "(FFFFFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/r8;", "", "enabled", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/foundation/c0;", "d", "(ZZJJJJFFLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/c0;", "a", "b", "c", "F", "j", "()F", "Height", "k", "IconSize", "Landroidx/compose/material3/a3;", "i", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/q8;", "defaultFilterChipColors", "h", "defaultElevatedFilterChipColors", "Landroidx/compose/ui/graphics/e6;", "l", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final n5 f12671a = new n5();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12674d = 0;

    static {
        c0.b0 b0Var = c0.b0.f37004a;
        Height = b0Var.a();
        IconSize = b0Var.D();
    }

    private n5() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final q8 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1082953289);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1082953289, i4, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1345)");
        }
        q8 h4 = h(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final q8 b(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        tVar.P(-915841711);
        if ((i6 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j4;
        }
        if ((i6 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j5;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j6;
        }
        if ((i6 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j7;
        }
        if ((i6 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j22 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j22 = j10;
        }
        if ((i6 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j23 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j23 = j11;
        }
        if ((i6 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j24 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j24 = j12;
        }
        if ((i6 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j25 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j25 = j13;
        }
        if ((i6 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j26 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j26 = j14;
        }
        if ((i6 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j27 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j27 = j15;
        }
        if ((i6 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j28 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j28 = j16;
        }
        if ((i6 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j29 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j29 = j17;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-915841711, i4, i5, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1379)");
        }
        q8 b5 = h(p6.f13227a.a(tVar, 6)).b(j18, j19, j20, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final r8 c(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(684803697);
        float h4 = (i5 & 1) != 0 ? c0.b0.f37004a.h() : f4;
        float m4 = (i5 & 2) != 0 ? c0.b0.f37004a.m() : f5;
        float k4 = (i5 & 4) != 0 ? c0.b0.f37004a.k() : f6;
        float l4 = (i5 & 8) != 0 ? c0.b0.f37004a.l() : f7;
        float g4 = (i5 & 16) != 0 ? c0.b0.f37004a.g() : f10;
        float j4 = (i5 & 32) != 0 ? c0.b0.f37004a.j() : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(684803697, i4, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1442)");
        }
        r8 r8Var = new r8(h4, m4, k4, l4, g4, j4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return r8Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.c0 d(boolean z4, boolean z5, long j4, long j5, long j6, long j7, float f4, float f5, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        tVar.P(-1138342447);
        long k4 = (i5 & 4) != 0 ? b3.k(c0.b0.f37004a.A(), tVar, 6) : j4;
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j10 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j10 = j5;
        }
        long w4 = (i5 & 16) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.b0.f37004a.r(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if ((i5 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j11 = j7;
        }
        float B = (i5 & 64) != 0 ? c0.b0.f37004a.B() : f4;
        float v4 = (i5 & 128) != 0 ? c0.b0.f37004a.v() : f5;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1138342447, i4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1331)");
        }
        if (!z4) {
            k4 = z5 ? j11 : w4;
        } else if (z5) {
            k4 = j10;
        }
        if (z5) {
            B = v4;
        }
        androidx.compose.foundation.c0 a5 = androidx.compose.foundation.d0.a(B, k4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final q8 e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1743772077);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1743772077, i4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1197)");
        }
        q8 i5 = i(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final q8 f(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        tVar.P(-1831479801);
        if ((i6 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j4;
        }
        if ((i6 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j5;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j6;
        }
        if ((i6 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j7;
        }
        if ((i6 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j22 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j22 = j10;
        }
        if ((i6 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j23 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j23 = j11;
        }
        if ((i6 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j24 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j24 = j12;
        }
        if ((i6 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j25 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j25 = j13;
        }
        if ((i6 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j26 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j26 = j14;
        }
        if ((i6 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j27 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j27 = j15;
        }
        if ((i6 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j28 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j28 = j16;
        }
        if ((i6 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j29 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j29 = j17;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1831479801, i4, i5, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1231)");
        }
        q8 b5 = i(p6.f13227a.a(tVar, 6)).b(j18, j19, j20, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final r8 g(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-757972185);
        float p4 = (i5 & 1) != 0 ? c0.b0.f37004a.p() : f4;
        float w4 = (i5 & 2) != 0 ? c0.b0.f37004a.w() : f5;
        float t4 = (i5 & 4) != 0 ? c0.b0.f37004a.t() : f6;
        float u4 = (i5 & 8) != 0 ? c0.b0.f37004a.u() : f7;
        float g4 = (i5 & 16) != 0 ? c0.b0.f37004a.g() : f10;
        float f12 = (i5 & 32) != 0 ? p4 : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-757972185, i4, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1294)");
        }
        r8 r8Var = new r8(p4, w4, t4, u4, g4, f12, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return r8Var;
    }

    @fg.l
    public final q8 h(@fg.l a3 a3Var) {
        q8 defaultElevatedFilterChipColorsCached = a3Var.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        c0.b0 b0Var = c0.b0.f37004a;
        q8 q8Var = new q8(b3.h(a3Var, b0Var.o()), b3.h(a3Var, b0Var.f0()), b3.h(a3Var, b0Var.F()), b3.h(a3Var, b0Var.F()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.i()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, b0Var.n()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.i()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, b0Var.P()), b3.h(a3Var, b0Var.Q()), b3.h(a3Var, b0Var.Q()), null);
        a3Var.M0(q8Var);
        return q8Var;
    }

    @fg.l
    public final q8 i(@fg.l a3 a3Var) {
        q8 defaultFilterChipColorsCached = a3Var.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        c0.b0 b0Var = c0.b0.f37004a;
        long h4 = b3.h(a3Var, b0Var.f0());
        long h5 = b3.h(a3Var, b0Var.F());
        long h6 = b3.h(a3Var, b0Var.F());
        companion.getClass();
        q8 q8Var = new q8(j4, h4, h5, h6, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, b0Var.s()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, b0Var.q()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, b0Var.P()), b3.h(a3Var, b0Var.Q()), b3.h(a3Var, b0Var.Q()), null);
        a3Var.P0(q8Var);
        return q8Var;
    }

    public final float j() {
        return Height;
    }

    public final float k() {
        return IconSize;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 l(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1598643637);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1598643637, i4, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1452)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.b0.f37004a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }
}
