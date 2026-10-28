package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b*\u0010#R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b+\u0010#R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b,\u0010#R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b-\u0010#R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b.\u0010#R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b/\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/material3/m8;", "", "Landroidx/compose/ui/graphics/d2;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "d", "(JJJJJJJJJJJJ)Landroidx/compose/material3/m8;", "", "enabled", "active", "a", "(ZZ)J", "checked", "c", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "g", "()J", "h", "f", "p", "e", "q", "o", "j", "k", "i", "m", "n", "l", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f5
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,786:1\n658#2:787\n646#2:788\n658#2:789\n646#2:790\n658#2:791\n646#2:792\n658#2:793\n646#2:794\n658#2:795\n646#2:796\n658#2:797\n646#2:798\n658#2:799\n646#2:800\n658#2:801\n646#2:802\n658#2:803\n646#2:804\n658#2:805\n646#2:806\n658#2:807\n646#2:808\n658#2:809\n646#2:810\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n*L\n664#1:787\n664#1:788\n665#1:789\n665#1:790\n666#1:791\n666#1:792\n667#1:793\n667#1:794\n668#1:795\n668#1:796\n669#1:797\n669#1:798\n670#1:799\n670#1:800\n671#1:801\n671#1:802\n672#1:803\n672#1:804\n673#1:805\n673#1:806\n674#1:807\n674#1:808\n675#1:809\n675#1:810\n*E\n"})
/* loaded from: classes.dex */
public final class m8 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f12548m = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long activeContainerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long activeContentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long activeBorderColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long inactiveContainerColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long inactiveContentColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long inactiveBorderColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveContainerColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveContentColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveBorderColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveContainerColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveContentColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveBorderColor;

    public /* synthetic */ m8(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @androidx.compose.runtime.x4
    public final long a(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeBorderColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveBorderColor : this.disabledActiveBorderColor : this.inactiveBorderColor;
    }

    @androidx.compose.runtime.x4
    public final long b(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeContainerColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveContainerColor : this.disabledActiveContainerColor : this.inactiveContainerColor;
    }

    @androidx.compose.runtime.x4
    public final long c(boolean enabled, boolean checked) {
        return (enabled && checked) ? this.activeContentColor : (!enabled || checked) ? (enabled || !checked) ? this.disabledInactiveContentColor : this.disabledActiveContentColor : this.inactiveContentColor;
    }

    @fg.l
    public final m8 d(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = activeContainerColor != androidx.compose.ui.graphics.d2.f17778o ? activeContainerColor : this.activeContainerColor;
        companion.getClass();
        long j5 = activeContentColor != androidx.compose.ui.graphics.d2.f17778o ? activeContentColor : this.activeContentColor;
        companion.getClass();
        long j6 = activeBorderColor != androidx.compose.ui.graphics.d2.f17778o ? activeBorderColor : this.activeBorderColor;
        companion.getClass();
        long j7 = inactiveContainerColor != androidx.compose.ui.graphics.d2.f17778o ? inactiveContainerColor : this.inactiveContainerColor;
        companion.getClass();
        long j10 = inactiveContentColor != androidx.compose.ui.graphics.d2.f17778o ? inactiveContentColor : this.inactiveContentColor;
        companion.getClass();
        long j11 = inactiveBorderColor != androidx.compose.ui.graphics.d2.f17778o ? inactiveBorderColor : this.inactiveBorderColor;
        companion.getClass();
        long j12 = disabledActiveContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledActiveContainerColor : this.disabledActiveContainerColor;
        companion.getClass();
        long j13 = disabledActiveContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledActiveContentColor : this.disabledActiveContentColor;
        companion.getClass();
        long j14 = disabledActiveBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledActiveBorderColor : this.disabledActiveBorderColor;
        companion.getClass();
        long j15 = disabledInactiveContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledInactiveContainerColor : this.disabledInactiveContainerColor;
        companion.getClass();
        long j16 = disabledInactiveContentColor != androidx.compose.ui.graphics.d2.f17778o ? disabledInactiveContentColor : this.disabledInactiveContentColor;
        companion.getClass();
        return new m8(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, disabledInactiveBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledInactiveBorderColor : this.disabledInactiveBorderColor);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || m8.class != other.getClass()) {
            return false;
        }
        m8 m8Var = (m8) other;
        return androidx.compose.ui.graphics.d2.y(this.activeBorderColor, m8Var.activeBorderColor) && kotlin.a2.o(this.activeContentColor, m8Var.activeContentColor) && kotlin.a2.o(this.activeContainerColor, m8Var.activeContainerColor) && kotlin.a2.o(this.inactiveBorderColor, m8Var.inactiveBorderColor) && kotlin.a2.o(this.inactiveContentColor, m8Var.inactiveContentColor) && kotlin.a2.o(this.inactiveContainerColor, m8Var.inactiveContainerColor) && kotlin.a2.o(this.disabledActiveBorderColor, m8Var.disabledActiveBorderColor) && kotlin.a2.o(this.disabledActiveContentColor, m8Var.disabledActiveContentColor) && kotlin.a2.o(this.disabledActiveContainerColor, m8Var.disabledActiveContainerColor) && kotlin.a2.o(this.disabledInactiveBorderColor, m8Var.disabledInactiveBorderColor) && kotlin.a2.o(this.disabledInactiveContentColor, m8Var.disabledInactiveContentColor) && kotlin.a2.o(this.disabledInactiveContainerColor, m8Var.disabledInactiveContainerColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getActiveBorderColor() {
        return this.activeBorderColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getActiveContainerColor() {
        return this.activeContainerColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getActiveContentColor() {
        return this.activeContentColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledInactiveContainerColor) + m0.a(this.disabledInactiveContentColor, m0.a(this.disabledInactiveBorderColor, m0.a(this.disabledActiveContainerColor, m0.a(this.disabledActiveContentColor, m0.a(this.disabledActiveBorderColor, m0.a(this.inactiveContainerColor, m0.a(this.inactiveContentColor, m0.a(this.inactiveBorderColor, m0.a(this.activeContainerColor, m0.a(this.activeContentColor, androidx.compose.ui.graphics.d2.K(this.activeBorderColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDisabledActiveBorderColor() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getDisabledActiveContainerColor() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getDisabledActiveContentColor() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getDisabledInactiveBorderColor() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: m, reason: from getter */
    public final long getDisabledInactiveContainerColor() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getDisabledInactiveContentColor() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: o, reason: from getter */
    public final long getInactiveBorderColor() {
        return this.inactiveBorderColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getInactiveContainerColor() {
        return this.inactiveContainerColor;
    }

    /* renamed from: q, reason: from getter */
    public final long getInactiveContentColor() {
        return this.inactiveContentColor;
    }

    private m8(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.activeContainerColor = j4;
        this.activeContentColor = j5;
        this.activeBorderColor = j6;
        this.inactiveContainerColor = j7;
        this.inactiveContentColor = j10;
        this.inactiveBorderColor = j11;
        this.disabledActiveContainerColor = j12;
        this.disabledActiveContentColor = j13;
        this.disabledActiveBorderColor = j14;
        this.disabledInactiveContainerColor = j15;
        this.disabledInactiveContentColor = j16;
        this.disabledInactiveBorderColor = j17;
    }
}
