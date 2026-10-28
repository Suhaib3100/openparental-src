package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0092\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010$R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010$R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010$R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010$R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010$R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010$R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material3/q8;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "b", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/q8;", "", "enabled", "selected", "Landroidx/compose/runtime/b5;", "a", "(ZZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "d", "(ZZ)J", "e", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "g", "h", "i", "j", "k", "l", "m", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2741:1\n658#2:2742\n646#2:2743\n658#2:2744\n646#2:2745\n658#2:2746\n646#2:2747\n658#2:2748\n646#2:2749\n658#2:2750\n646#2:2751\n658#2:2752\n646#2:2753\n658#2:2754\n646#2:2755\n658#2:2756\n646#2:2757\n658#2:2758\n646#2:2759\n658#2:2760\n646#2:2761\n658#2:2762\n646#2:2763\n658#2:2764\n646#2:2765\n658#2:2766\n646#2:2767\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2545#1:2742\n2545#1:2743\n2546#1:2744\n2546#1:2745\n2547#1:2746\n2547#1:2747\n2548#1:2748\n2548#1:2749\n2549#1:2750\n2549#1:2751\n2550#1:2752\n2550#1:2753\n2551#1:2754\n2551#1:2755\n2552#1:2756\n2552#1:2757\n2553#1:2758\n2553#1:2759\n2554#1:2760\n2554#1:2761\n2555#1:2762\n2555#1:2763\n2556#1:2764\n2556#1:2765\n2557#1:2766\n2557#1:2767\n*E\n"})
/* loaded from: classes.dex */
public final class q8 {

    /* renamed from: n, reason: collision with root package name */
    public static final int f13719n = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long labelColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long selectedContainerColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedContainerColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long selectedLabelColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long selectedLeadingIconColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long selectedTrailingIconColor;

    public /* synthetic */ q8(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> a(boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2126903408);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2126903408, i4, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:2566)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? z5 ? this.disabledSelectedContainerColor : this.disabledContainerColor : !z5 ? this.containerColor : this.selectedContainerColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    public final q8 b(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = labelColor != androidx.compose.ui.graphics.d2.f17778o ? labelColor : this.labelColor;
        companion.getClass();
        long j6 = leadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? leadingIconColor : this.leadingIconColor;
        companion.getClass();
        long j7 = trailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? trailingIconColor : this.trailingIconColor;
        companion.getClass();
        long j10 = disabledContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledContainerColor : this.disabledContainerColor;
        companion.getClass();
        long j11 = disabledLabelColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLabelColor : this.disabledLabelColor;
        companion.getClass();
        long j12 = disabledLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLeadingIconColor : this.disabledLeadingIconColor;
        companion.getClass();
        long j13 = disabledTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledTrailingIconColor : this.disabledTrailingIconColor;
        companion.getClass();
        long j14 = selectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? selectedContainerColor : this.selectedContainerColor;
        companion.getClass();
        long j15 = disabledSelectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSelectedContainerColor : this.disabledSelectedContainerColor;
        companion.getClass();
        long j16 = selectedLabelColor != androidx.compose.ui.graphics.d2.f17778o ? selectedLabelColor : this.selectedLabelColor;
        companion.getClass();
        long j17 = selectedLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? selectedLeadingIconColor : this.selectedLeadingIconColor;
        companion.getClass();
        return new q8(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, selectedTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? selectedTrailingIconColor : this.selectedTrailingIconColor);
    }

    public final long d(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLabelColor : !selected ? this.labelColor : this.selectedLabelColor;
    }

    public final long e(boolean enabled, boolean selected) {
        return !enabled ? this.disabledLeadingIconColor : !selected ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, q8Var.containerColor) && kotlin.a2.o(this.labelColor, q8Var.labelColor) && kotlin.a2.o(this.leadingIconColor, q8Var.leadingIconColor) && kotlin.a2.o(this.trailingIconColor, q8Var.trailingIconColor) && kotlin.a2.o(this.disabledContainerColor, q8Var.disabledContainerColor) && kotlin.a2.o(this.disabledLabelColor, q8Var.disabledLabelColor) && kotlin.a2.o(this.disabledLeadingIconColor, q8Var.disabledLeadingIconColor) && kotlin.a2.o(this.disabledTrailingIconColor, q8Var.disabledTrailingIconColor) && kotlin.a2.o(this.selectedContainerColor, q8Var.selectedContainerColor) && kotlin.a2.o(this.disabledSelectedContainerColor, q8Var.disabledSelectedContainerColor) && kotlin.a2.o(this.selectedLabelColor, q8Var.selectedLabelColor) && kotlin.a2.o(this.selectedLeadingIconColor, q8Var.selectedLeadingIconColor) && kotlin.a2.o(this.selectedTrailingIconColor, q8Var.selectedTrailingIconColor);
    }

    public final long f(boolean enabled, boolean selected) {
        return !enabled ? this.disabledTrailingIconColor : !selected ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.selectedTrailingIconColor) + m0.a(this.selectedLeadingIconColor, m0.a(this.selectedLabelColor, m0.a(this.disabledSelectedContainerColor, m0.a(this.selectedContainerColor, m0.a(this.disabledTrailingIconColor, m0.a(this.disabledLeadingIconColor, m0.a(this.disabledLabelColor, m0.a(this.disabledContainerColor, m0.a(this.trailingIconColor, m0.a(this.leadingIconColor, m0.a(this.labelColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    private q8(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.containerColor = j4;
        this.labelColor = j5;
        this.leadingIconColor = j6;
        this.trailingIconColor = j7;
        this.disabledContainerColor = j10;
        this.disabledLabelColor = j11;
        this.disabledLeadingIconColor = j12;
        this.disabledTrailingIconColor = j13;
        this.selectedContainerColor = j14;
        this.disabledSelectedContainerColor = j15;
        this.selectedLabelColor = j16;
        this.selectedLeadingIconColor = j17;
        this.selectedTrailingIconColor = j18;
    }
}
