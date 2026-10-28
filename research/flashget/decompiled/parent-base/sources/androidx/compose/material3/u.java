package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006Jb\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JN\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J0\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u0006Jb\u0010(\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011JN\u0010)\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001bR\u001d\u0010-\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010,R\u0018\u00103\u001a\u00020\u0004*\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u00020\u0004*\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00109\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/u;", "", "<init>", "()V", "Landroidx/compose/material3/v2;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/v2;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "d", "(JJJJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/v2;", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/w2;", "e", "(FFFFFFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/w2;", "", "enabled", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/c0;", "b", "(ZJJFLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/c0;", "Landroidx/compose/material3/u2;", "a", "(JJFLandroidx/compose/runtime/t;II)Landroidx/compose/material3/u2;", "f", "g", "h", "F", "k", "()F", "Height", "l", "IconSize", "Landroidx/compose/material3/a3;", "i", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/v2;", "defaultAssistChipColors", "j", "defaultElevatedAssistChipColors", "Landroidx/compose/ui/graphics/e6;", "m", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u f14832a = new u();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14835d = 0;

    static {
        c0.a aVar = c0.a.f36944a;
        Height = aVar.a();
        IconSize = aVar.z();
    }

    private u() {
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @kotlin.x0(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @androidx.compose.runtime.i
    public final u2 a(long j4, long j5, float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(382372847);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.a.f36944a.s(), tVar, 6) : j4;
        long w4 = (i5 & 2) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a.f36944a.q(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float t4 = (i5 & 4) != 0 ? c0.a.f36944a.t() : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(382372847, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1076)");
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
    public final androidx.compose.foundation.c0 b(boolean z4, long j4, long j5, float f4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1458649561);
        long k4 = (i5 & 2) != 0 ? b3.k(c0.a.f36944a.s(), tVar, 6) : j4;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a.f36944a.q(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        float t4 = (i5 & 8) != 0 ? c0.a.f36944a.t() : f4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1458649561, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1053)");
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
    public final v2 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1961061417);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1961061417, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:952)");
        }
        v2 i5 = i(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 d(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        tVar.P(-391745725);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j16 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j16 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j17 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j17 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j10;
        }
        if ((i5 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j11;
        }
        if ((i5 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j12;
        }
        if ((i5 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j13;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-391745725, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:977)");
        }
        v2 b5 = i(p6.f13227a.a(tVar, 6)).b(j14, j15, j16, j17, j18, j19, j20, j21);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w2 e(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(245366099);
        float p4 = (i5 & 1) != 0 ? c0.a.f36944a.p() : f4;
        float f12 = (i5 & 2) != 0 ? p4 : f5;
        float f13 = (i5 & 4) != 0 ? p4 : f6;
        float f14 = (i5 & 8) != 0 ? p4 : f7;
        float f15 = (i5 & 16) != 0 ? c0.a.f36944a.f() : f10;
        float f16 = (i5 & 32) != 0 ? p4 : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(245366099, i4, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1029)");
        }
        w2 w2Var = new w2(p4, f12, f13, f14, f15, f16, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w2Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(655175583);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(655175583, i4, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1087)");
        }
        v2 j4 = j(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final v2 g(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        tVar.P(-535762675);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j16 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j16 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j17 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j17 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j18 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j18 = j10;
        }
        if ((i5 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j19 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j19 = j11;
        }
        if ((i5 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j12;
        }
        if ((i5 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j13;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-535762675, i4, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1112)");
        }
        v2 b5 = w9.f15301a.d(p6.f13227a.a(tVar, 6)).b(j14, j15, j16, j17, j18, j19, j20, j21);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w2 h(float f4, float f5, float f6, float f7, float f10, float f11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1457698077);
        float j4 = (i5 & 1) != 0 ? c0.a.f36944a.j() : f4;
        float o4 = (i5 & 2) != 0 ? c0.a.f36944a.o() : f5;
        float m4 = (i5 & 4) != 0 ? c0.a.f36944a.m() : f6;
        float n4 = (i5 & 8) != 0 ? c0.a.f36944a.n() : f7;
        float f12 = (i5 & 16) != 0 ? c0.a.f36944a.f() : f10;
        float l4 = (i5 & 32) != 0 ? c0.a.f36944a.l() : f11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1457698077, i4, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1164)");
        }
        w2 w2Var = new w2(j4, o4, m4, n4, f12, l4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w2Var;
    }

    @fg.l
    public final v2 i(@fg.l a3 a3Var) {
        v2 defaultAssistChipColorsCached = a3Var.getDefaultAssistChipColorsCached();
        if (defaultAssistChipColorsCached != null) {
            return defaultAssistChipColorsCached;
        }
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        c0.a aVar = c0.a.f36944a;
        long h4 = b3.h(a3Var, aVar.A());
        long h5 = b3.h(a3Var, aVar.y());
        long h6 = b3.h(a3Var, aVar.y());
        companion.getClass();
        v2 v2Var = new v2(j4, h4, h5, h6, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.D0(v2Var);
        return v2Var;
    }

    @fg.l
    public final v2 j(@fg.l a3 a3Var) {
        v2 defaultElevatedAssistChipColorsCached = a3Var.getDefaultElevatedAssistChipColorsCached();
        if (defaultElevatedAssistChipColorsCached != null) {
            return defaultElevatedAssistChipColorsCached;
        }
        c0.a aVar = c0.a.f36944a;
        v2 v2Var = new v2(b3.h(a3Var, aVar.i()), b3.h(a3Var, aVar.A()), b3.h(a3Var, aVar.y()), b3.h(a3Var, aVar.y()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.k()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, aVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.J0(v2Var);
        return v2Var;
    }

    public final float k() {
        return Height;
    }

    public final float l() {
        return IconSize;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 m(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1988153916);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1988153916, i4, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1174)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.a.f36944a.b(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }
}
