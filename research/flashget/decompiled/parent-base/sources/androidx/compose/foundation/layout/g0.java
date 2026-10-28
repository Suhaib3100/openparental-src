package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/g0;", "Landroidx/compose/foundation/layout/n2;", "", "leftVal", "topVal", "rightVal", "bottomVal", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g0 implements n2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int leftVal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int topVal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int rightVal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int bottomVal;

    public g0(int i4, int i5, int i6, int i7) {
        this.leftVal = i4;
        this.topVal = i5;
        this.rightVal = i6;
        this.bottomVal = i7;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        return this.topVal;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return this.rightVal;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        return this.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return this.leftVal;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) other;
        return this.leftVal == g0Var.leftVal && this.topVal == g0Var.topVal && this.rightVal == g0Var.rightVal && this.bottomVal == g0Var.bottomVal;
    }

    public int hashCode() {
        return (((((this.leftVal * 31) + this.topVal) * 31) + this.rightVal) * 31) + this.bottomVal;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.leftVal);
        sb.append(", top=");
        sb.append(this.topVal);
        sb.append(", right=");
        sb.append(this.rightVal);
        sb.append(", bottom=");
        return androidx.view.e.a(sb, this.bottomVal, ')');
    }
}
