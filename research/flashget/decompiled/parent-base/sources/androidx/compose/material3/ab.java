package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@androidx.compose.runtime.x4
@f5
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u009e\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00020\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/ab;", "", "<init>", "()V", "Landroidx/compose/material3/za;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/za;", "Landroidx/compose/ui/graphics/d2;", "clockDialColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "b", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/za;", "Landroidx/compose/material3/cb;", "d", "(Landroidx/compose/runtime/t;I)I", "Landroidx/compose/material3/a3;", "c", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/za;", "defaultTimePickerColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final ab f9822a = new ab();

    /* renamed from: b, reason: collision with root package name */
    public static final int f9823b = 0;

    private ab() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final za a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2085808058);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2085808058, i4, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:263)");
        }
        za c5 = c(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final za b(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
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
        long j30;
        long j31;
        long j32;
        long j33;
        tVar.P(-646352288);
        if ((i6 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j20 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j20 = j4;
        }
        if ((i6 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j21 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j21 = j5;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j22 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j22 = j6;
        }
        if ((i6 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j23 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j23 = j7;
        }
        if ((i6 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j24 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j24 = j10;
        }
        if ((i6 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j25 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j25 = j11;
        }
        if ((i6 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j26 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j26 = j12;
        }
        if ((i6 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j27 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j27 = j13;
        }
        if ((i6 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j28 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j28 = j14;
        }
        if ((i6 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j29 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j29 = j15;
        }
        if ((i6 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j30 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j30 = j16;
        }
        if ((i6 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j31 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j31 = j17;
        }
        if ((i6 & 4096) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j32 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j32 = j18;
        }
        if ((i6 & 8192) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j33 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j33 = j19;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-646352288, i4, i5, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:309)");
        }
        za b5 = c(p6.f13227a.a(tVar, 6)).b(j20, j23, j24, j25, j21, j22, j26, j27, j28, j29, j30, j31, j32, j33);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    public final za c(@fg.l a3 a3Var) {
        za defaultTimePickerColorsCached = a3Var.getDefaultTimePickerColorsCached();
        if (defaultTimePickerColorsCached != null) {
            return defaultTimePickerColorsCached;
        }
        c0.k1 k1Var = c0.k1.f37594a;
        long h4 = b3.h(a3Var, k1Var.a());
        long h5 = b3.h(a3Var, k1Var.d());
        long h6 = b3.h(a3Var, k1Var.n());
        long h7 = b3.h(a3Var, k1Var.h());
        long h10 = b3.h(a3Var, k1Var.o());
        long h11 = b3.h(a3Var, k1Var.x());
        long h12 = b3.h(a3Var, k1Var.z());
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        za zaVar = new za(h4, h7, h10, h11, h5, h6, h12, androidx.compose.ui.graphics.d2.f17777n, b3.h(a3Var, k1Var.C()), b3.h(a3Var, k1Var.G()), b3.h(a3Var, k1Var.Q()), b3.h(a3Var, k1Var.X()), b3.h(a3Var, k1Var.T()), b3.h(a3Var, k1Var.a0()), null);
        a3Var.i1(zaVar);
        return zaVar;
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public final int d(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(517161502, i4, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:358)");
        }
        int a5 = eb.a(tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return a5;
    }
}
