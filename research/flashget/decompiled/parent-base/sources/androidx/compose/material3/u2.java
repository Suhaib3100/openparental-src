package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.m1
@kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/u2;", "", "Landroidx/compose/ui/graphics/d2;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/h;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "", "enabled", "Landroidx/compose/runtime/b5;", "Landroidx/compose/foundation/c0;", "a", "(ZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "b", "c", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f14836d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long borderColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float borderWidth;

    public /* synthetic */ u2(long j4, long j5, float f4, kotlin.jvm.internal.w wVar) {
        this(j4, j5, f4);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.foundation.c0> a(boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1899621712);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1899621712, i4, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2677)");
        }
        androidx.compose.runtime.b5<androidx.compose.foundation.c0> u4 = androidx.compose.runtime.o4.u(androidx.compose.foundation.d0.a(this.borderWidth, z4 ? this.borderColor : this.disabledBorderColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) other;
        return androidx.compose.ui.graphics.d2.y(this.borderColor, u2Var.borderColor) && kotlin.a2.o(this.disabledBorderColor, u2Var.disabledBorderColor) && androidx.compose.ui.unit.h.l(this.borderWidth, u2Var.borderWidth);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.h.n(this.borderWidth) + m0.a(this.disabledBorderColor, androidx.compose.ui.graphics.d2.K(this.borderColor) * 31, 31);
    }

    private u2(long j4, long j5, float f4) {
        this.borderColor = j4;
        this.disabledBorderColor = j5;
        this.borderWidth = f4;
    }
}
