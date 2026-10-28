package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@x4
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/s0;", "Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/foundation/layout/n2;", "insets", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/h;", "b", "(Landroidx/compose/ui/unit/w;)F", "d", "()F", "c", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/n2;", "e", "()Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s0 implements l1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 insets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    public s0(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.d dVar) {
        this.insets = n2Var;
        this.density = dVar;
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: a */
    public float getBottom() {
        androidx.compose.ui.unit.d dVar = this.density;
        return dVar.R(this.insets.c(dVar));
    }

    @Override // androidx.compose.foundation.layout.l1
    public float b(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        androidx.compose.ui.unit.d dVar = this.density;
        return dVar.R(this.insets.d(dVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.l1
    public float c(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        androidx.compose.ui.unit.d dVar = this.density;
        return dVar.R(this.insets.b(dVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.l1
    /* renamed from: d */
    public float getTop() {
        androidx.compose.ui.unit.d dVar = this.density;
        return dVar.R(this.insets.a(dVar));
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final n2 getInsets() {
        return this.insets;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) other;
        return kotlin.jvm.internal.l0.g(this.insets, s0Var.insets) && kotlin.jvm.internal.l0.g(this.density, s0Var.density);
    }

    public int hashCode() {
        return this.density.hashCode() + (this.insets.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
