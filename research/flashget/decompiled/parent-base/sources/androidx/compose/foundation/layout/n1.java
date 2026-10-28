package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u000eR&\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u000eR&\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u000eR&\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/n1;", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "b", "(Landroidx/compose/ui/unit/w;)F", "d", "()F", "c", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "i", "j", "()V", "k", "l", "g", "h", "e", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n294#1:468\n296#1:469\n298#1:470\n300#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class n1 implements l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5225e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    public /* synthetic */ n1(float f4, float f5, float f6, float f7, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7);
    }

    @x4
    public static /* synthetic */ void f() {
    }

    @x4
    public static /* synthetic */ void h() {
    }

    @x4
    public static /* synthetic */ void j() {
    }

    @x4
    public static /* synthetic */ void l() {
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: a, reason: from getter */
    public float getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.l1
    public float b(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.w.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.l1
    public float c(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.w.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: d, reason: from getter */
    public float getTop() {
        return this.top;
    }

    public final float e() {
        return this.bottom;
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) other;
        return androidx.compose.ui.unit.h.l(this.start, n1Var.start) && androidx.compose.ui.unit.h.l(this.top, n1Var.top) && androidx.compose.ui.unit.h.l(this.end, n1Var.end) && androidx.compose.ui.unit.h.l(this.bottom, n1Var.bottom);
    }

    /* renamed from: g, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + androidx.compose.animation.l0.a(this.end, androidx.compose.animation.l0.a(this.top, androidx.compose.ui.unit.h.n(this.start) * 31, 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    public final float k() {
        return this.top;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        androidx.compose.foundation.b0.a(this.start, sb, ", top=");
        androidx.compose.foundation.b0.a(this.top, sb, ", end=");
        androidx.compose.foundation.b0.a(this.end, sb, ", bottom=");
        sb.append((Object) androidx.compose.ui.unit.h.s(this.bottom));
        sb.append(')');
        return sb.toString();
    }

    private n1(float f4, float f5, float f6, float f7) {
        this.start = f4;
        this.top = f5;
        this.end = f6;
        this.bottom = f7;
    }

    public /* synthetic */ n1(float f4, float f5, float f6, float f7, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? androidx.compose.ui.unit.h.g(0) : f4, (i4 & 2) != 0 ? androidx.compose.ui.unit.h.g(0) : f5, (i4 & 4) != 0 ? androidx.compose.ui.unit.h.g(0) : f6, (i4 & 8) != 0 ? androidx.compose.ui.unit.h.g(0) : f7);
    }
}
