package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/v2;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/w;)V", "b", "(JJJJJJJJ)Landroidx/compose/material3/v2;", "", "enabled", "a", "(Z)J", "l", "m", "n", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "d", "()J", "i", "c", "j", "k", "e", "f", "g", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2741:1\n658#2:2742\n646#2:2743\n658#2:2744\n646#2:2745\n658#2:2746\n646#2:2747\n658#2:2748\n646#2:2749\n658#2:2750\n646#2:2751\n658#2:2752\n646#2:2753\n658#2:2754\n646#2:2755\n658#2:2756\n646#2:2757\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n*L\n2407#1:2742\n2407#1:2743\n2408#1:2744\n2408#1:2745\n2409#1:2746\n2409#1:2747\n2410#1:2748\n2410#1:2749\n2411#1:2750\n2411#1:2751\n2412#1:2752\n2412#1:2753\n2413#1:2754\n2413#1:2755\n2414#1:2756\n2414#1:2757\n*E\n"})
/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f14996i = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long labelColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconContentColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconContentColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconContentColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconContentColor;

    public /* synthetic */ v2(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13);
    }

    @androidx.compose.runtime.x4
    public final long a(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    @fg.l
    public final v2 b(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j5 = labelColor != androidx.compose.ui.graphics.d2.f17778o ? labelColor : this.labelColor;
        companion.getClass();
        long j6 = leadingIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? leadingIconContentColor : this.leadingIconContentColor;
        companion.getClass();
        long j7 = trailingIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? trailingIconContentColor : this.trailingIconContentColor;
        companion.getClass();
        long j10 = disabledContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledContainerColor : this.disabledContainerColor;
        companion.getClass();
        long j11 = disabledLabelColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLabelColor : this.disabledLabelColor;
        companion.getClass();
        long j12 = disabledLeadingIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLeadingIconContentColor : this.disabledLeadingIconContentColor;
        companion.getClass();
        return new v2(j4, j5, j6, j7, j10, j11, j12, disabledTrailingIconContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledTrailingIconContentColor : this.disabledTrailingIconContentColor);
    }

    /* renamed from: d, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) other;
        return androidx.compose.ui.graphics.d2.y(this.containerColor, v2Var.containerColor) && kotlin.a2.o(this.labelColor, v2Var.labelColor) && kotlin.a2.o(this.leadingIconContentColor, v2Var.leadingIconContentColor) && kotlin.a2.o(this.trailingIconContentColor, v2Var.trailingIconContentColor) && kotlin.a2.o(this.disabledContainerColor, v2Var.disabledContainerColor) && kotlin.a2.o(this.disabledLabelColor, v2Var.disabledLabelColor) && kotlin.a2.o(this.disabledLeadingIconContentColor, v2Var.disabledLeadingIconContentColor) && kotlin.a2.o(this.disabledTrailingIconContentColor, v2Var.disabledTrailingIconContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getDisabledLeadingIconContentColor() {
        return this.disabledLeadingIconContentColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getDisabledTrailingIconContentColor() {
        return this.disabledTrailingIconContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledTrailingIconContentColor) + m0.a(this.disabledLeadingIconContentColor, m0.a(this.disabledLabelColor, m0.a(this.disabledContainerColor, m0.a(this.trailingIconContentColor, m0.a(this.leadingIconContentColor, m0.a(this.labelColor, androidx.compose.ui.graphics.d2.K(this.containerColor) * 31, 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getLabelColor() {
        return this.labelColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getLeadingIconContentColor() {
        return this.leadingIconContentColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getTrailingIconContentColor() {
        return this.trailingIconContentColor;
    }

    @androidx.compose.runtime.x4
    public final long l(boolean enabled) {
        return enabled ? this.labelColor : this.disabledLabelColor;
    }

    @androidx.compose.runtime.x4
    public final long m(boolean enabled) {
        return enabled ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    @androidx.compose.runtime.x4
    public final long n(boolean enabled) {
        return enabled ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    private v2(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13) {
        this.containerColor = j4;
        this.labelColor = j5;
        this.leadingIconContentColor = j6;
        this.trailingIconContentColor = j7;
        this.disabledContainerColor = j10;
        this.disabledLabelColor = j11;
        this.disabledLeadingIconContentColor = j12;
        this.disabledTrailingIconContentColor = j13;
    }
}
