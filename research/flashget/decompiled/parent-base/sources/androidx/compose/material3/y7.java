package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: RadioButton.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/y7;", "", "Landroidx/compose/ui/graphics/d2;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "a", "(JJJJ)Landroidx/compose/material3/y7;", "", "enabled", "selected", "Landroidx/compose/runtime/b5;", "g", "(ZZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "e", "()J", "b", "f", "c", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,268:1\n658#2:269\n646#2:270\n658#2:271\n646#2:272\n658#2:273\n646#2:274\n658#2:275\n646#2:276\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n*L\n211#1:269\n211#1:270\n212#1:271\n212#1:272\n213#1:273\n213#1:274\n214#1:275\n214#1:276\n*E\n"})
/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f15813e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectedColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unselectedColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledUnselectedColor;

    public /* synthetic */ y7(long j4, long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7);
    }

    @fg.l
    public final y7 a(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = selectedColor != androidx.compose.ui.graphics.d2.f17778o ? selectedColor : this.selectedColor;
        companion.getClass();
        long j5 = unselectedColor != androidx.compose.ui.graphics.d2.f17778o ? unselectedColor : this.unselectedColor;
        companion.getClass();
        long j6 = disabledSelectedColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedColor : this.disabledSelectedColor;
        companion.getClass();
        return new y7(j4, j5, j6, disabledUnselectedColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUnselectedColor : this.disabledUnselectedColor);
    }

    /* renamed from: c, reason: from getter */
    public final long getDisabledSelectedColor() {
        return this.disabledSelectedColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getDisabledUnselectedColor() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getSelectedColor() {
        return this.selectedColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) other;
        return androidx.compose.ui.graphics.d2.y(this.selectedColor, y7Var.selectedColor) && kotlin.a2.o(this.unselectedColor, y7Var.unselectedColor) && kotlin.a2.o(this.disabledSelectedColor, y7Var.disabledSelectedColor) && kotlin.a2.o(this.disabledUnselectedColor, y7Var.disabledUnselectedColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getUnselectedColor() {
        return this.unselectedColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> g(boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4;
        tVar.P(-1840145292);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1840145292, i4, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:224)");
        }
        long j4 = (z4 && z5) ? this.selectedColor : (!z4 || z5) ? (z4 || !z5) ? this.disabledUnselectedColor : this.disabledSelectedColor : this.unselectedColor;
        if (z4) {
            tVar.P(-1943768162);
            u4 = androidx.compose.animation.u0.c(j4, androidx.compose.animation.core.l.r(100, 0, null, 6, null), null, null, tVar, 48, 12);
            tVar.p0();
        } else {
            tVar.P(-1943768057);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j4), tVar, 0);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledUnselectedColor) + m0.a(this.disabledSelectedColor, m0.a(this.unselectedColor, androidx.compose.ui.graphics.d2.K(this.selectedColor) * 31, 31), 31);
    }

    private y7(long j4, long j5, long j6, long j7) {
        this.selectedColor = j4;
        this.unselectedColor = j5;
        this.disabledSelectedColor = j6;
        this.disabledUnselectedColor = j7;
    }
}
