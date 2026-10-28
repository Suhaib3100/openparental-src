package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u00020\u0004*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/s2;", "", "<init>", "()V", "Landroidx/compose/material3/r2;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/r2;", "Landroidx/compose/ui/graphics/d2;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "b", "(JJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/r2;", "Landroidx/compose/material3/a3;", "c", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/r2;", "defaultCheckboxColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final s2 f14306a = new s2();

    /* renamed from: b, reason: collision with root package name */
    public static final int f14307b = 0;

    private s2() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final r2 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-9530498);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-9530498, i4, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:188)");
        }
        r2 c5 = c(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final r2 b(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        tVar.P(-89536160);
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
            androidx.compose.runtime.x.r0(-89536160, i4, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:213)");
        }
        r2 c5 = c(p6.f13227a.a(tVar, 6));
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j18 = androidx.compose.ui.graphics.d2.f17777n;
        companion.getClass();
        long j19 = androidx.compose.ui.graphics.d2.f17777n;
        companion.getClass();
        r2 d5 = c5.d(j14, j18, j12, j19, j15, androidx.compose.ui.graphics.d2.f17777n, j17, j12, j13, j15, j16, j17);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @fg.l
    public final r2 c(@fg.l a3 a3Var) {
        r2 defaultCheckboxColorsCached = a3Var.getDefaultCheckboxColorsCached();
        if (defaultCheckboxColorsCached != null) {
            return defaultCheckboxColorsCached;
        }
        c0.d dVar = c0.d.f37094a;
        long h4 = b3.h(a3Var, dVar.z());
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        long h5 = b3.h(a3Var, dVar.e());
        companion.getClass();
        long j5 = androidx.compose.ui.graphics.d2.f17777n;
        long w4 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, dVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        companion.getClass();
        r2 r2Var = new r2(h4, j4, h5, j5, w4, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(b3.h(a3Var, dVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, dVar.e()), b3.h(a3Var, dVar.T()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, dVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, dVar.G()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, dVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.H0(r2Var);
        return r2Var;
    }
}
