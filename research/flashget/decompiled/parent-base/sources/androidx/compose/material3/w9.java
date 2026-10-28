package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J0\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\u0006JN\u0010&\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJN\u0010'\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0019R\u001d\u0010+\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010-\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b,\u0010*R\u0018\u00101\u001a\u00020\u0004*\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material3/w9;", "", "<init>", "()V", "Landroidx/compose/material3/v2;", "j", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/v2;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "k", "(JJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/v2;", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/w2;", "l", "(FFFFFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/w2;", "", "enabled", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/c0;", "i", "(ZJJFLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/c0;", "Landroidx/compose/material3/u2;", "h", "(JJFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/u2;", "a", "b", "c", "F", "e", "()F", "Height", "f", "IconSize", "Landroidx/compose/material3/a3;", "d", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/v2;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/ui/graphics/e6;", "g", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final w9 f15301a = new w9();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15304d = 0;

    static {
        c0.g1 g1Var = c0.g1.f37330a;
        Height = g1Var.a();
        IconSize = g1Var.B();
    }

    private w9() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1671233087);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1671233087, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1758)");
        }
        v2 d5 = d(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 b(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        tVar.P(1269423125);
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
            androidx.compose.runtime.x.r0(1269423125, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1779)");
        }
        v2 d5 = d(p6.f13227a.a(tVar, 6));
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j18 = androidx.compose.ui.graphics.d2.f17778o;
        companion.getClass();
        v2 b5 = d5.b(j12, j13, j14, j18, j15, j16, j17, androidx.compose.ui.graphics.d2.f17778o);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w2 c(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1118088467);
        float j4 = (i5 & 1) != 0 ? c0.g1.f37330a.j() : f4;
        float o4 = (i5 & 2) != 0 ? c0.g1.f37330a.o() : f5;
        float m4 = (i5 & 4) != 0 ? c0.g1.f37330a.m() : f6;
        float n4 = (i5 & 8) != 0 ? c0.g1.f37330a.n() : f7;
        float f12 = (i5 & 16) != 0 ? c0.g1.f37330a.f() : f10;
        float l4 = (i5 & 32) != 0 ? c0.g1.f37330a.l() : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1118088467, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1831)");
        }
        w2 w2Var = new w2(j4, o4, m4, n4, f12, l4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w2Var;
    }

    @fg.l
    public final v2 d(@fg.l a3 a3Var) {
        v2 defaultElevatedSuggestionChipColorsCached = a3Var.getDefaultElevatedSuggestionChipColorsCached();
        if (defaultElevatedSuggestionChipColorsCached != null) {
            return defaultElevatedSuggestionChipColorsCached;
        }
        c0.g1 g1Var = c0.g1.f37330a;
        long h4 = b3.h(a3Var, g1Var.i());
        long h5 = b3.h(a3Var, g1Var.y());
        long h6 = b3.h(a3Var, g1Var.A());
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17778o;
        long w4 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g1Var.k()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        long w5 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long w6 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, c0.a.f36944a.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        companion.getClass();
        v2 v2Var = new v2(h4, h5, h6, j4, w4, w5, w6, androidx.compose.ui.graphics.d2.f17778o, null);
        a3Var.N0(v2Var);
        return v2Var;
    }

    public final float e() {
        return Height;
    }

    public final float f() {
        return IconSize;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(641188183);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(641188183, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1841)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.g1.f37330a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @kotlin.x0(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @androidx.compose.runtime.i
    public final u2 h(long j4, long j5, float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(439283919);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.g1.f37330a.s(), tVar, 6) : j4;
        long w4 = (i5 & 2) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.g1.f37330a.q(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float t4 = (i5 & 4) != 0 ? c0.g1.f37330a.t() : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(439283919, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1746)");
        }
        u2 u2Var = new u2(k4, w4, t4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u2Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.c0 i(boolean z4, long j4, long j5, float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-637354809);
        long k4 = (i5 & 2) != 0 ? b3.k(c0.g1.f37330a.s(), tVar, 6) : j4;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.g1.f37330a.q(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float t4 = (i5 & 8) != 0 ? c0.g1.f37330a.t() : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-637354809, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1724)");
        }
        if (!z4) {
            k4 = w4;
        }
        androidx.compose.foundation.c0 a5 = androidx.compose.foundation.d0.a(t4, k4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 j(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1918570697);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1918570697, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1649)");
        }
        v2 s4 = x2.s(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 k(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        tVar.P(1882647883);
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
            androidx.compose.runtime.x.r0(1882647883, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1670)");
        }
        v2 s4 = x2.s(p6.f13227a.a(tVar, 6));
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j18 = androidx.compose.ui.graphics.d2.f17778o;
        companion.getClass();
        v2 b5 = s4.b(j12, j13, j14, j18, j15, j16, j17, androidx.compose.ui.graphics.d2.f17778o);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w2 l(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1929994057);
        float p4 = (i5 & 1) != 0 ? c0.g1.f37330a.p() : f4;
        float f12 = (i5 & 2) != 0 ? p4 : f5;
        float f13 = (i5 & 4) != 0 ? p4 : f6;
        float f14 = (i5 & 8) != 0 ? p4 : f7;
        float f15 = (i5 & 16) != 0 ? c0.g1.f37330a.f() : f10;
        float f16 = (i5 & 32) != 0 ? p4 : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1929994057, i4, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1700)");
        }
        w2 w2Var = new w2(p4, f12, f13, f14, f15, f16, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w2Var;
    }
}
