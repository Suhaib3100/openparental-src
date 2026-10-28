package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@x4
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/o1;", "Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/l1;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/foundation/layout/l1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o1 implements n2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 paddingValues;

    public o1(@fg.l l1 l1Var) {
        this.paddingValues = l1Var;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        return density.q2(this.paddingValues.getTop());
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return density.q2(this.paddingValues.c(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        return density.q2(this.paddingValues.getBottom());
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        return density.q2(this.paddingValues.b(layoutDirection));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof o1) {
            return kotlin.jvm.internal.l0.g(((o1) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @fg.l
    public String toString() {
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        return "PaddingValues(" + ((Object) androidx.compose.ui.unit.h.s(this.paddingValues.b(wVar))) + ", " + ((Object) androidx.compose.ui.unit.h.s(this.paddingValues.getTop())) + ", " + ((Object) androidx.compose.ui.unit.h.s(this.paddingValues.c(wVar))) + ", " + ((Object) androidx.compose.ui.unit.h.s(this.paddingValues.getBottom())) + ')';
    }
}
