package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b-\u0010%R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b.\u0010%R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b0\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/material3/r2;", "", "Landroidx/compose/ui/graphics/d2;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "d", "(JJJJJJJJJJJJ)Landroidx/compose/material3/r2;", "Lp0/a;", "state", "Landroidx/compose/runtime/b5;", "c", "(Lp0/a;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "", "enabled", "b", "(ZLp0/a;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "a", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "h", "()J", "q", "g", "p", "e", "j", "f", "n", "l", "i", "o", "k", "m", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,597:1\n658#2:598\n646#2:599\n658#2:600\n646#2:601\n658#2:602\n646#2:603\n658#2:604\n646#2:605\n658#2:606\n646#2:607\n658#2:608\n646#2:609\n658#2:610\n646#2:611\n658#2:612\n646#2:613\n658#2:614\n646#2:615\n658#2:616\n646#2:617\n658#2:618\n646#2:619\n658#2:620\n646#2:621\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n457#1:598\n457#1:599\n458#1:600\n458#1:601\n459#1:602\n459#1:603\n460#1:604\n460#1:605\n461#1:606\n461#1:607\n462#1:608\n462#1:609\n463#1:610\n463#1:611\n464#1:612\n464#1:613\n465#1:614\n465#1:615\n466#1:616\n466#1:617\n467#1:618\n467#1:619\n468#1:620\n468#1:621\n*E\n"})
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f13928m = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBoxColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13941a;

        static {
            int[] iArr = new int[p0.a.values().length];
            try {
                iArr[p0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13941a = iArr;
        }
    }

    public /* synthetic */ r2(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> a(boolean z4, @fg.l p0.a aVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        long j4;
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4;
        tVar.P(1009643462);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1009643462, i4, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:526)");
        }
        if (z4) {
            int i5 = a.f13941a[aVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                j4 = this.checkedBorderColor;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j4 = this.uncheckedBorderColor;
            }
        } else {
            int i6 = a.f13941a[aVar.ordinal()];
            if (i6 == 1) {
                j4 = this.disabledBorderColor;
            } else if (i6 == 2) {
                j4 = this.disabledIndeterminateBorderColor;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j4 = this.disabledUncheckedBorderColor;
            }
        }
        long j5 = j4;
        if (z4) {
            tVar.P(1209374481);
            u4 = androidx.compose.animation.u0.c(j5, androidx.compose.animation.core.l.r(aVar == p0.a.Off ? 100 : 50, 0, null, 6, null), null, null, tVar, 0, 12);
            tVar.p0();
        } else {
            tVar.P(1209374667);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j5), tVar, 0);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b(boolean z4, @fg.l p0.a aVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        long j4;
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4;
        tVar.P(360729865);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(360729865, i4, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:495)");
        }
        if (z4) {
            int i5 = a.f13941a[aVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                j4 = this.checkedBoxColor;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j4 = this.uncheckedBoxColor;
            }
        } else {
            int i6 = a.f13941a[aVar.ordinal()];
            if (i6 == 1) {
                j4 = this.disabledCheckedBoxColor;
            } else if (i6 == 2) {
                j4 = this.disabledIndeterminateBoxColor;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j4 = this.disabledUncheckedBoxColor;
            }
        }
        long j5 = j4;
        if (z4) {
            tVar.P(1143723294);
            u4 = androidx.compose.animation.u0.c(j5, androidx.compose.animation.core.l.r(aVar == p0.a.Off ? 100 : 50, 0, null, 6, null), null, null, tVar, 0, 12);
            tVar.p0();
        } else {
            tVar.P(1143723480);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j5), tVar, 0);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c(@fg.l p0.a aVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-507585681);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-507585681, i4, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:476)");
        }
        p0.a aVar2 = p0.a.Off;
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5 = androidx.compose.animation.u0.c(aVar == aVar2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, androidx.compose.animation.core.l.r(aVar == aVar2 ? 100 : 50, 0, null, 6, null), null, null, tVar, 0, 12);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    public final r2 d(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = checkedCheckmarkColor != androidx.compose.ui.graphics.d2.f17778o ? checkedCheckmarkColor : this.checkedCheckmarkColor;
        companion.getClass();
        long j5 = uncheckedCheckmarkColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedCheckmarkColor : this.uncheckedCheckmarkColor;
        companion.getClass();
        long j6 = checkedBoxColor != androidx.compose.ui.graphics.d2.f17778o ? checkedBoxColor : this.checkedBoxColor;
        companion.getClass();
        long j7 = uncheckedBoxColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedBoxColor : this.uncheckedBoxColor;
        companion.getClass();
        long j10 = disabledCheckedBoxColor != androidx.compose.ui.graphics.d2.f17778o ? disabledCheckedBoxColor : this.disabledCheckedBoxColor;
        companion.getClass();
        long j11 = disabledUncheckedBoxColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedBoxColor : this.disabledUncheckedBoxColor;
        companion.getClass();
        long j12 = disabledIndeterminateBoxColor != androidx.compose.ui.graphics.d2.f17778o ? disabledIndeterminateBoxColor : this.disabledIndeterminateBoxColor;
        companion.getClass();
        long j13 = checkedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? checkedBorderColor : this.checkedBorderColor;
        companion.getClass();
        long j14 = uncheckedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? uncheckedBorderColor : this.uncheckedBorderColor;
        companion.getClass();
        long j15 = disabledBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledBorderColor : this.disabledBorderColor;
        companion.getClass();
        long j16 = disabledUncheckedBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor;
        companion.getClass();
        return new r2(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, disabledIndeterminateBorderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledIndeterminateBorderColor : this.disabledIndeterminateBorderColor);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) other;
        return androidx.compose.ui.graphics.d2.y(this.checkedCheckmarkColor, r2Var.checkedCheckmarkColor) && kotlin.a2.o(this.uncheckedCheckmarkColor, r2Var.uncheckedCheckmarkColor) && kotlin.a2.o(this.checkedBoxColor, r2Var.checkedBoxColor) && kotlin.a2.o(this.uncheckedBoxColor, r2Var.uncheckedBoxColor) && kotlin.a2.o(this.disabledCheckedBoxColor, r2Var.disabledCheckedBoxColor) && kotlin.a2.o(this.disabledUncheckedBoxColor, r2Var.disabledUncheckedBoxColor) && kotlin.a2.o(this.disabledIndeterminateBoxColor, r2Var.disabledIndeterminateBoxColor) && kotlin.a2.o(this.checkedBorderColor, r2Var.checkedBorderColor) && kotlin.a2.o(this.uncheckedBorderColor, r2Var.uncheckedBorderColor) && kotlin.a2.o(this.disabledBorderColor, r2Var.disabledBorderColor) && kotlin.a2.o(this.disabledUncheckedBorderColor, r2Var.disabledUncheckedBorderColor) && kotlin.a2.o(this.disabledIndeterminateBorderColor, r2Var.disabledIndeterminateBorderColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getCheckedBoxColor() {
        return this.checkedBoxColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getCheckedCheckmarkColor() {
        return this.checkedCheckmarkColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.disabledIndeterminateBorderColor) + m0.a(this.disabledUncheckedBorderColor, m0.a(this.disabledBorderColor, m0.a(this.uncheckedBorderColor, m0.a(this.checkedBorderColor, m0.a(this.disabledIndeterminateBoxColor, m0.a(this.disabledUncheckedBoxColor, m0.a(this.disabledCheckedBoxColor, m0.a(this.uncheckedBoxColor, m0.a(this.checkedBoxColor, m0.a(this.uncheckedCheckmarkColor, androidx.compose.ui.graphics.d2.K(this.checkedCheckmarkColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getDisabledCheckedBoxColor() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getDisabledIndeterminateBorderColor() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: l, reason: from getter */
    public final long getDisabledIndeterminateBoxColor() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: m, reason: from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getDisabledUncheckedBoxColor() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: o, reason: from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getUncheckedBoxColor() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: q, reason: from getter */
    public final long getUncheckedCheckmarkColor() {
        return this.uncheckedCheckmarkColor;
    }

    private r2(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.checkedCheckmarkColor = j4;
        this.uncheckedCheckmarkColor = j5;
        this.checkedBoxColor = j6;
        this.uncheckedBoxColor = j7;
        this.disabledCheckedBoxColor = j10;
        this.disabledUncheckedBoxColor = j11;
        this.disabledIndeterminateBoxColor = j12;
        this.checkedBorderColor = j13;
        this.uncheckedBorderColor = j14;
        this.disabledBorderColor = j15;
        this.disabledUncheckedBorderColor = j16;
        this.disabledIndeterminateBorderColor = j17;
    }
}
