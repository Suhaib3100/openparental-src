package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u009c\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b,\u0010%R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b-\u0010%R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b.\u0010%R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b0\u0010%R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b1\u0010%R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b2\u0010%R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b3\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/za;", "", "Landroidx/compose/ui/graphics/d2;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "b", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/za;", "", "selected", "r", "(Z)J", "s", "t", "u", "a", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "d", "()J", "m", "c", "g", "h", "e", "f", "i", "k", "j", "l", "n", "p", "o", "q", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f5
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1843:1\n658#2:1844\n646#2:1845\n658#2:1846\n646#2:1847\n658#2:1848\n646#2:1849\n658#2:1850\n646#2:1851\n658#2:1852\n646#2:1853\n658#2:1854\n646#2:1855\n658#2:1856\n646#2:1857\n658#2:1858\n646#2:1859\n658#2:1860\n646#2:1861\n658#2:1862\n646#2:1863\n658#2:1864\n646#2:1865\n658#2:1866\n646#2:1867\n658#2:1868\n646#2:1869\n658#2:1870\n646#2:1871\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n432#1:1844\n432#1:1845\n433#1:1846\n433#1:1847\n434#1:1848\n434#1:1849\n435#1:1850\n435#1:1851\n436#1:1852\n436#1:1853\n437#1:1854\n437#1:1855\n439#1:1856\n439#1:1857\n441#1:1858\n441#1:1859\n442#1:1860\n442#1:1861\n444#1:1862\n444#1:1863\n445#1:1864\n445#1:1865\n447#1:1866\n447#1:1867\n448#1:1868\n448#1:1869\n449#1:1870\n449#1:1871\n*E\n"})
/* loaded from: classes.dex */
public final class za {

    /* renamed from: o, reason: collision with root package name */
    public static final int f15865o = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long clockDialColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectorColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorBorderColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long clockDialSelectedContentColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long clockDialUnselectedContentColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorSelectedContainerColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorUnselectedContainerColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorSelectedContentColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorUnselectedContentColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorSelectedContainerColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorUnselectedContainerColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorSelectedContentColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ za(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    @androidx.compose.runtime.x4
    public final long a(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    @fg.l
    public final za b(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = clockDialColor != androidx.compose.ui.graphics.d2.f17778o ? clockDialColor : this.clockDialColor;
        companion.getClass();
        long j5 = selectorColor != androidx.compose.ui.graphics.d2.f17778o ? selectorColor : this.selectorColor;
        companion.getClass();
        long j6 = containerColor != androidx.compose.ui.graphics.d2.f17778o ? containerColor : this.containerColor;
        companion.getClass();
        long j7 = periodSelectorBorderColor != androidx.compose.ui.graphics.d2.f17778o ? periodSelectorBorderColor : this.periodSelectorBorderColor;
        companion.getClass();
        long j10 = clockDialSelectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? clockDialSelectedContentColor : this.clockDialSelectedContentColor;
        companion.getClass();
        long j11 = clockDialUnselectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? clockDialUnselectedContentColor : this.clockDialUnselectedContentColor;
        companion.getClass();
        long j12 = periodSelectorSelectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? periodSelectorSelectedContainerColor : this.periodSelectorSelectedContainerColor;
        companion.getClass();
        long j13 = periodSelectorUnselectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? periodSelectorUnselectedContainerColor : this.periodSelectorUnselectedContainerColor;
        companion.getClass();
        long j14 = periodSelectorSelectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? periodSelectorSelectedContentColor : this.periodSelectorSelectedContentColor;
        companion.getClass();
        long j15 = periodSelectorUnselectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? periodSelectorUnselectedContentColor : this.periodSelectorUnselectedContentColor;
        companion.getClass();
        long j16 = timeSelectorSelectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? timeSelectorSelectedContainerColor : this.timeSelectorSelectedContainerColor;
        companion.getClass();
        long j17 = timeSelectorUnselectedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? timeSelectorUnselectedContainerColor : this.timeSelectorUnselectedContainerColor;
        companion.getClass();
        long j18 = timeSelectorSelectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? timeSelectorSelectedContentColor : this.timeSelectorSelectedContentColor;
        companion.getClass();
        return new za(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, timeSelectorUnselectedContentColor != androidx.compose.ui.graphics.d2.f17778o ? timeSelectorUnselectedContentColor : this.timeSelectorUnselectedContentColor);
    }

    /* renamed from: d, reason: from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getClockDialSelectedContentColor() {
        return this.clockDialSelectedContentColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || za.class != other.getClass()) {
            return false;
        }
        za zaVar = (za) other;
        return androidx.compose.ui.graphics.d2.y(this.clockDialColor, zaVar.clockDialColor) && kotlin.a2.o(this.selectorColor, zaVar.selectorColor) && kotlin.a2.o(this.containerColor, zaVar.containerColor) && kotlin.a2.o(this.periodSelectorBorderColor, zaVar.periodSelectorBorderColor) && kotlin.a2.o(this.periodSelectorSelectedContainerColor, zaVar.periodSelectorSelectedContainerColor) && kotlin.a2.o(this.periodSelectorUnselectedContainerColor, zaVar.periodSelectorUnselectedContainerColor) && kotlin.a2.o(this.periodSelectorSelectedContentColor, zaVar.periodSelectorSelectedContentColor) && kotlin.a2.o(this.periodSelectorUnselectedContentColor, zaVar.periodSelectorUnselectedContentColor) && kotlin.a2.o(this.timeSelectorSelectedContainerColor, zaVar.timeSelectorSelectedContainerColor) && kotlin.a2.o(this.timeSelectorUnselectedContainerColor, zaVar.timeSelectorUnselectedContainerColor) && kotlin.a2.o(this.timeSelectorSelectedContentColor, zaVar.timeSelectorSelectedContentColor) && kotlin.a2.o(this.timeSelectorUnselectedContentColor, zaVar.timeSelectorUnselectedContentColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getClockDialUnselectedContentColor() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.timeSelectorUnselectedContentColor) + m0.a(this.timeSelectorSelectedContentColor, m0.a(this.timeSelectorUnselectedContainerColor, m0.a(this.timeSelectorSelectedContainerColor, m0.a(this.periodSelectorUnselectedContentColor, m0.a(this.periodSelectorSelectedContentColor, m0.a(this.periodSelectorUnselectedContainerColor, m0.a(this.periodSelectorSelectedContainerColor, m0.a(this.periodSelectorBorderColor, m0.a(this.containerColor, m0.a(this.selectorColor, androidx.compose.ui.graphics.d2.K(this.clockDialColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getPeriodSelectorSelectedContainerColor() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getPeriodSelectorSelectedContentColor() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getPeriodSelectorUnselectedContainerColor() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getPeriodSelectorUnselectedContentColor() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: m, reason: from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getTimeSelectorSelectedContainerColor() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: o, reason: from getter */
    public final long getTimeSelectorSelectedContentColor() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getTimeSelectorUnselectedContainerColor() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: q, reason: from getter */
    public final long getTimeSelectorUnselectedContentColor() {
        return this.timeSelectorUnselectedContentColor;
    }

    @androidx.compose.runtime.x4
    public final long r(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    @androidx.compose.runtime.x4
    public final long s(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    @androidx.compose.runtime.x4
    public final long t(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    @androidx.compose.runtime.x4
    public final long u(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    private za(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.clockDialColor = j4;
        this.selectorColor = j5;
        this.containerColor = j6;
        this.periodSelectorBorderColor = j7;
        this.clockDialSelectedContentColor = j10;
        this.clockDialUnselectedContentColor = j11;
        this.periodSelectorSelectedContainerColor = j12;
        this.periodSelectorUnselectedContainerColor = j13;
        this.periodSelectorSelectedContentColor = j14;
        this.periodSelectorUnselectedContentColor = j15;
        this.timeSelectorSelectedContainerColor = j16;
        this.timeSelectorUnselectedContainerColor = j17;
        this.timeSelectorSelectedContentColor = j18;
        this.timeSelectorUnselectedContentColor = j19;
    }
}
