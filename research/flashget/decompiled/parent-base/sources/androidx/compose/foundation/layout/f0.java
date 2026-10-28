package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/f0;", "Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/h;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1#2:749\n*E\n"})
/* loaded from: classes.dex */
final class f0 implements n2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float leftDp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float topDp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float rightDp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float bottomDp;

    public /* synthetic */ f0(float f4, float f5, float f6, float f7, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        return density.q2(this.topDp);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return density.q2(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        return density.q2(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return density.q2(this.leftDp);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return androidx.compose.ui.unit.h.l(this.leftDp, f0Var.leftDp) && androidx.compose.ui.unit.h.l(this.topDp, f0Var.topDp) && androidx.compose.ui.unit.h.l(this.rightDp, f0Var.rightDp) && androidx.compose.ui.unit.h.l(this.bottomDp, f0Var.bottomDp);
    }

    public int hashCode() {
        return Float.hashCode(this.bottomDp) + androidx.compose.animation.l0.a(this.rightDp, androidx.compose.animation.l0.a(this.topDp, androidx.compose.ui.unit.h.n(this.leftDp) * 31, 31), 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        androidx.compose.foundation.b0.a(this.leftDp, sb, ", top=");
        androidx.compose.foundation.b0.a(this.topDp, sb, ", right=");
        androidx.compose.foundation.b0.a(this.rightDp, sb, ", bottom=");
        sb.append((Object) androidx.compose.ui.unit.h.s(this.bottomDp));
        sb.append(')');
        return sb.toString();
    }

    private f0(float f4, float f5, float f6, float f7) {
        this.leftDp = f4;
        this.topDp = f5;
        this.rightDp = f6;
        this.bottomDp = f7;
    }
}
