package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJt\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010!R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b(\u0010!R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b&\u0010!R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b+\u0010!R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b*\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/material3/d9;", "", "Landroidx/compose/ui/graphics/d2;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/w;)V", "a", "(JJJJJJJJJJ)Landroidx/compose/material3/d9;", "", "enabled", "m", "(Z)J", "active", "o", "(ZZ)J", "n", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "l", "()J", "b", "d", "c", "k", "e", "j", "f", "i", "g", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2151:1\n658#2:2152\n646#2:2153\n658#2:2154\n646#2:2155\n658#2:2156\n646#2:2157\n658#2:2158\n646#2:2159\n658#2:2160\n646#2:2161\n658#2:2162\n646#2:2163\n658#2:2164\n646#2:2165\n658#2:2166\n646#2:2167\n658#2:2168\n646#2:2169\n658#2:2170\n646#2:2171\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n*L\n1641#1:2152\n1641#1:2153\n1642#1:2154\n1642#1:2155\n1643#1:2156\n1643#1:2157\n1644#1:2158\n1644#1:2159\n1645#1:2160\n1645#1:2161\n1646#1:2162\n1646#1:2163\n1647#1:2164\n1647#1:2165\n1648#1:2166\n1648#1:2167\n1649#1:2168\n1649#1:2169\n1650#1:2170\n1650#1:2171\n*E\n"})
/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f10484k = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long thumbColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long activeTrackColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long activeTickColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTrackColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTickColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledThumbColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTrackColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTickColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTrackColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTickColor;

    public /* synthetic */ d9(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15);
    }

    @fg.l
    public final d9 a(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = thumbColor != androidx.compose.ui.graphics.d2.f17778o ? thumbColor : this.thumbColor;
        companion.getClass();
        long j5 = activeTrackColor != androidx.compose.ui.graphics.d2.f17778o ? activeTrackColor : this.activeTrackColor;
        companion.getClass();
        long j6 = activeTickColor != androidx.compose.ui.graphics.d2.f17778o ? activeTickColor : this.activeTickColor;
        companion.getClass();
        long j7 = inactiveTrackColor != androidx.compose.ui.graphics.d2.f17778o ? inactiveTrackColor : this.inactiveTrackColor;
        companion.getClass();
        long j10 = inactiveTickColor != androidx.compose.ui.graphics.d2.f17778o ? inactiveTickColor : this.inactiveTickColor;
        companion.getClass();
        long j11 = disabledThumbColor != androidx.compose.ui.graphics.d2.f17778o ? disabledThumbColor : this.disabledThumbColor;
        companion.getClass();
        long j12 = disabledActiveTrackColor != androidx.compose.ui.graphics.d2.f17778o ? disabledActiveTrackColor : this.disabledActiveTrackColor;
        companion.getClass();
        long j13 = disabledActiveTickColor != androidx.compose.ui.graphics.d2.f17778o ? disabledActiveTickColor : this.disabledActiveTickColor;
        companion.getClass();
        long j14 = disabledInactiveTrackColor != androidx.compose.ui.graphics.d2.f17778o ? disabledInactiveTrackColor : this.disabledInactiveTrackColor;
        companion.getClass();
        return new d9(j4, j5, j6, j7, j10, j11, j12, j13, j14, disabledInactiveTickColor != androidx.compose.ui.graphics.d2.f17778o ? disabledInactiveTickColor : this.disabledInactiveTickColor);
    }

    /* renamed from: c, reason: from getter */
    public final long getActiveTickColor() {
        return this.activeTickColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getActiveTrackColor() {
        return this.activeTrackColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getDisabledActiveTickColor() {
        return this.disabledActiveTickColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) other;
        return androidx.compose.ui.graphics.d2.y(this.thumbColor, d9Var.thumbColor) && kotlin.a2.o(this.activeTrackColor, d9Var.activeTrackColor) && kotlin.a2.o(this.activeTickColor, d9Var.activeTickColor) && kotlin.a2.o(this.inactiveTrackColor, d9Var.inactiveTrackColor) && kotlin.a2.o(this.inactiveTickColor, d9Var.inactiveTickColor) && kotlin.a2.o(this.disabledThumbColor, d9Var.disabledThumbColor) && kotlin.a2.o(this.disabledActiveTrackColor, d9Var.disabledActiveTrackColor) && kotlin.a2.o(this.disabledActiveTickColor, d9Var.disabledActiveTickColor) && kotlin.a2.o(this.disabledInactiveTrackColor, d9Var.disabledInactiveTrackColor) && kotlin.a2.o(this.disabledInactiveTickColor, d9Var.disabledInactiveTickColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getDisabledActiveTrackColor() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getDisabledInactiveTickColor() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getDisabledInactiveTrackColor() {
        return this.disabledInactiveTrackColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledInactiveTickColor) + m0.a(this.disabledInactiveTrackColor, m0.a(this.disabledActiveTickColor, m0.a(this.disabledActiveTrackColor, m0.a(this.disabledThumbColor, m0.a(this.inactiveTickColor, m0.a(this.inactiveTrackColor, m0.a(this.activeTickColor, m0.a(this.activeTrackColor, androidx.compose.ui.graphics.d2.K(this.thumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDisabledThumbColor() {
        return this.disabledThumbColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getInactiveTickColor() {
        return this.inactiveTickColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getInactiveTrackColor() {
        return this.inactiveTrackColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getThumbColor() {
        return this.thumbColor;
    }

    @androidx.compose.runtime.x4
    public final long m(boolean enabled) {
        return enabled ? this.thumbColor : this.disabledThumbColor;
    }

    @androidx.compose.runtime.x4
    public final long n(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTickColor : this.inactiveTickColor : active ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    @androidx.compose.runtime.x4
    public final long o(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTrackColor : this.inactiveTrackColor : active ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    private d9(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.thumbColor = j4;
        this.activeTrackColor = j5;
        this.activeTickColor = j6;
        this.inactiveTrackColor = j7;
        this.inactiveTickColor = j10;
        this.disabledThumbColor = j11;
        this.disabledActiveTrackColor = j12;
        this.disabledActiveTickColor = j13;
        this.disabledInactiveTrackColor = j14;
        this.disabledInactiveTickColor = j15;
    }
}
