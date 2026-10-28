package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: NestedScrollInteropConnection.android.kt */
@kd.i(name = "NestedScrollInteropConnectionKt")
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0002\u001a\"\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0011\u001a\u00020\u0004*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001d\u001a\u00020\u0004*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "e", "(F)F", "offset", "", "f", "(F)I", "i", "(I)F", "l", "", "consumed", "Li0/f;", "available", "j", "([IJ)J", "Landroidx/compose/ui/input/nestedscroll/f;", "k", "(I)I", "Landroid/view/View;", "hostView", "Landroidx/compose/ui/input/nestedscroll/a;", "h", "(Landroid/view/View;Landroidx/compose/runtime/t;II)Landroidx/compose/ui/input/nestedscroll/a;", "a", "F", "ScrollingAxesThreshold", "g", "(J)I", "scrollAxes", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,239:1\n74#2:240\n36#3:241\n1116#4,6:242\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n235#1:240\n236#1:241\n236#1:242,6\n*E\n"})
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f19952a = 0.5f;

    public static final float d(float f4) {
        return f4 * (-1.0f);
    }

    private static final float e(float f4) {
        return (float) (f4 >= 0.0f ? Math.ceil(f4) : Math.floor(f4));
    }

    public static final int f(float f4) {
        return ((int) e(f4)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(long j4) {
        int i4 = Math.abs(i0.f.p(j4)) >= 0.5f ? 1 : 0;
        return Math.abs(i0.f.r(j4)) >= 0.5f ? i4 | 2 : i4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.input.nestedscroll.a h(@fg.m View view, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1075877987);
        if ((i5 & 1) != 0) {
            view = (View) tVar.x(o0.k());
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1075877987, i4, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(view);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new i2(view);
            tVar.E(Q);
        }
        tVar.p0();
        i2 i2Var = (i2) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i2Var;
    }

    private static final float i(int i4) {
        return i4 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(int[] iArr, long j4) {
        return i0.g.a(i0.f.p(j4) >= 0.0f ? kotlin.ranges.s.A(iArr[0] * (-1.0f), i0.f.p(j4)) : kotlin.ranges.s.t(iArr[0] * (-1.0f), i0.f.p(j4)), i0.f.r(j4) >= 0.0f ? kotlin.ranges.s.A(iArr[1] * (-1.0f), i0.f.r(j4)) : kotlin.ranges.s.t(iArr[1] * (-1.0f), i0.f.r(j4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i4) {
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        return !androidx.compose.ui.input.nestedscroll.f.h(i4, androidx.compose.ui.input.nestedscroll.f.f18687c) ? 1 : 0;
    }

    private static final float l(float f4) {
        return f4 * (-1.0f);
    }
}
