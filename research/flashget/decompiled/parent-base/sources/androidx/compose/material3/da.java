package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J°\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010 \u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b-\u0010'R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b.\u0010'R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b/\u0010'R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b1\u0010'R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b4\u0010'R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b5\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/da;", "", "Landroidx/compose/ui/graphics/d2;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "b", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/da;", "", "enabled", "checked", "u", "(ZZ)J", "v", "a", "t", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "f", "()J", "g", "c", "d", "e", "r", "s", "p", "h", "q", "i", "j", "k", "l", "m", "n", "o", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,573:1\n658#2:574\n646#2:575\n658#2:576\n646#2:577\n658#2:578\n646#2:579\n658#2:580\n646#2:581\n658#2:582\n646#2:583\n658#2:584\n646#2:585\n658#2:586\n646#2:587\n658#2:588\n646#2:589\n658#2:590\n646#2:591\n658#2:592\n646#2:593\n658#2:594\n646#2:595\n658#2:596\n646#2:597\n658#2:598\n646#2:599\n658#2:600\n646#2:601\n658#2:602\n646#2:603\n658#2:604\n646#2:605\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n455#1:574\n455#1:575\n456#1:576\n456#1:577\n457#1:578\n457#1:579\n458#1:580\n458#1:581\n459#1:582\n459#1:583\n460#1:584\n460#1:585\n461#1:586\n461#1:587\n462#1:588\n462#1:589\n463#1:590\n463#1:591\n464#1:592\n464#1:593\n465#1:594\n465#1:595\n466#1:596\n466#1:597\n467#1:598\n467#1:599\n468#1:600\n468#1:601\n469#1:602\n469#1:603\n470#1:604\n470#1:605\n*E\n"})
/* loaded from: classes.dex */
public final class da {

    /* renamed from: q, reason: collision with root package name */
    public static final int f10495q = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedThumbColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long checkedTrackColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long checkedIconColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedThumbColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedTrackColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedIconColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedThumbColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedTrackColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBorderColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedIconColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedThumbColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedTrackColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedIconColor;

    public /* synthetic */ da(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    @androidx.compose.runtime.x4
    public final long a(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedBorderColor : this.uncheckedBorderColor : checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    @fg.l
    public final da b(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = checkedThumbColor != androidx.compose.ui.graphics.d2.f17778o ? checkedThumbColor : this.checkedThumbColor;
        companion.getClass();
        long j5 = checkedTrackColor != androidx.compose.ui.graphics.d2.f17778o ? checkedTrackColor : this.checkedTrackColor;
        companion.getClass();
        long j6 = checkedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? checkedBorderColor : this.checkedBorderColor;
        companion.getClass();
        long j7 = checkedIconColor != androidx.compose.ui.graphics.d2.f17778o ? checkedIconColor : this.checkedIconColor;
        companion.getClass();
        long j10 = uncheckedThumbColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedThumbColor : this.uncheckedThumbColor;
        companion.getClass();
        long j11 = uncheckedTrackColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedTrackColor : this.uncheckedTrackColor;
        companion.getClass();
        long j12 = uncheckedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedBorderColor : this.uncheckedBorderColor;
        companion.getClass();
        long j13 = uncheckedIconColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedIconColor : this.uncheckedIconColor;
        companion.getClass();
        long j14 = disabledCheckedThumbColor != androidx.compose.ui.graphics.d2.f17778o ? disabledCheckedThumbColor : this.disabledCheckedThumbColor;
        companion.getClass();
        long j15 = disabledCheckedTrackColor != androidx.compose.ui.graphics.d2.f17778o ? disabledCheckedTrackColor : this.disabledCheckedTrackColor;
        companion.getClass();
        long j16 = disabledCheckedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledCheckedBorderColor : this.disabledCheckedBorderColor;
        companion.getClass();
        long j17 = disabledCheckedIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledCheckedIconColor : this.disabledCheckedIconColor;
        companion.getClass();
        long j18 = disabledUncheckedThumbColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedThumbColor : this.disabledUncheckedThumbColor;
        companion.getClass();
        long j19 = disabledUncheckedTrackColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedTrackColor : this.disabledUncheckedTrackColor;
        companion.getClass();
        long j20 = disabledUncheckedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor;
        companion.getClass();
        return new da(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, disabledUncheckedIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedIconColor : this.disabledUncheckedIconColor);
    }

    /* renamed from: d, reason: from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getCheckedIconColor() {
        return this.checkedIconColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof da)) {
            return false;
        }
        da daVar = (da) other;
        return androidx.compose.ui.graphics.d2.y(this.checkedThumbColor, daVar.checkedThumbColor) && kotlin.a2.o(this.checkedTrackColor, daVar.checkedTrackColor) && kotlin.a2.o(this.checkedBorderColor, daVar.checkedBorderColor) && kotlin.a2.o(this.checkedIconColor, daVar.checkedIconColor) && kotlin.a2.o(this.uncheckedThumbColor, daVar.uncheckedThumbColor) && kotlin.a2.o(this.uncheckedTrackColor, daVar.uncheckedTrackColor) && kotlin.a2.o(this.uncheckedBorderColor, daVar.uncheckedBorderColor) && kotlin.a2.o(this.uncheckedIconColor, daVar.uncheckedIconColor) && kotlin.a2.o(this.disabledCheckedThumbColor, daVar.disabledCheckedThumbColor) && kotlin.a2.o(this.disabledCheckedTrackColor, daVar.disabledCheckedTrackColor) && kotlin.a2.o(this.disabledCheckedBorderColor, daVar.disabledCheckedBorderColor) && kotlin.a2.o(this.disabledCheckedIconColor, daVar.disabledCheckedIconColor) && kotlin.a2.o(this.disabledUncheckedThumbColor, daVar.disabledUncheckedThumbColor) && kotlin.a2.o(this.disabledUncheckedTrackColor, daVar.disabledUncheckedTrackColor) && kotlin.a2.o(this.disabledUncheckedBorderColor, daVar.disabledUncheckedBorderColor) && kotlin.a2.o(this.disabledUncheckedIconColor, daVar.disabledUncheckedIconColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getCheckedThumbColor() {
        return this.checkedThumbColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getDisabledCheckedBorderColor() {
        return this.disabledCheckedBorderColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledUncheckedIconColor) + m0.a(this.disabledUncheckedBorderColor, m0.a(this.disabledUncheckedTrackColor, m0.a(this.disabledUncheckedThumbColor, m0.a(this.disabledCheckedIconColor, m0.a(this.disabledCheckedBorderColor, m0.a(this.disabledCheckedTrackColor, m0.a(this.disabledCheckedThumbColor, m0.a(this.uncheckedIconColor, m0.a(this.uncheckedBorderColor, m0.a(this.uncheckedTrackColor, m0.a(this.uncheckedThumbColor, m0.a(this.checkedIconColor, m0.a(this.checkedBorderColor, m0.a(this.checkedTrackColor, androidx.compose.ui.graphics.d2.K(this.checkedThumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDisabledCheckedIconColor() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getDisabledCheckedThumbColor() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getDisabledCheckedTrackColor() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: m, reason: from getter */
    public final long getDisabledUncheckedIconColor() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getDisabledUncheckedThumbColor() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: o, reason: from getter */
    public final long getDisabledUncheckedTrackColor() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: q, reason: from getter */
    public final long getUncheckedIconColor() {
        return this.uncheckedIconColor;
    }

    /* renamed from: r, reason: from getter */
    public final long getUncheckedThumbColor() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: s, reason: from getter */
    public final long getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    @androidx.compose.runtime.x4
    public final long t(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedIconColor : this.uncheckedIconColor : checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    @androidx.compose.runtime.x4
    public final long u(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedThumbColor : this.uncheckedThumbColor : checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    @androidx.compose.runtime.x4
    public final long v(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedTrackColor : this.uncheckedTrackColor : checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private da(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.checkedThumbColor = j4;
        this.checkedTrackColor = j5;
        this.checkedBorderColor = j6;
        this.checkedIconColor = j7;
        this.uncheckedThumbColor = j10;
        this.uncheckedTrackColor = j11;
        this.uncheckedBorderColor = j12;
        this.uncheckedIconColor = j13;
        this.disabledCheckedThumbColor = j14;
        this.disabledCheckedTrackColor = j15;
        this.disabledCheckedBorderColor = j16;
        this.disabledCheckedIconColor = j17;
        this.disabledUncheckedThumbColor = j18;
        this.disabledUncheckedTrackColor = j19;
        this.disabledUncheckedBorderColor = j20;
        this.disabledUncheckedIconColor = j21;
    }
}
