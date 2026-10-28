package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: RadioButton.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u00020\u0004*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/z7;", "", "<init>", "()V", "Landroidx/compose/material3/y7;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/y7;", "Landroidx/compose/ui/graphics/d2;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "b", "(JJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/y7;", "Landroidx/compose/material3/a3;", "c", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/y7;", "defaultRadioButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final z7 f15843a = new z7();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15844b = 0;

    private z7() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final y7 a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1191566130);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1191566130, i4, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:139)");
        }
        y7 c5 = c(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final y7 b(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        long j12;
        long j13;
        tVar.P(-351083046);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j10 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j10 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j7;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-351083046, i4, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:158)");
        }
        y7 a5 = c(p6.f13227a.a(tVar, 6)).a(j10, j11, j12, j13);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }

    @fg.l
    public final y7 c(@fg.l a3 a3Var) {
        y7 defaultRadioButtonColorsCached = a3Var.getDefaultRadioButtonColorsCached();
        if (defaultRadioButtonColorsCached != null) {
            return defaultRadioButtonColorsCached;
        }
        c0.u0 u0Var = c0.u0.f38224a;
        y7 y7Var = new y7(b3.h(a3Var, u0Var.f()), b3.h(a3Var, u0Var.k()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, u0Var.a()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, u0Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        a3Var.a1(y7Var);
        return y7Var;
    }
}
