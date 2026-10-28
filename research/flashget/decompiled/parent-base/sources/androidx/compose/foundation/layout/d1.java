package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@x4
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/d1;", "Landroidx/compose/foundation/layout/n2;", "insets", "Landroidx/compose/foundation/layout/g3;", "sides", "<init>", "(Landroidx/compose/foundation/layout/n2;ILkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "d", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;)I", "a", "(Landroidx/compose/ui/unit/d;)I", "b", "c", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/layout/n2;", "e", "()Landroidx/compose/foundation/layout/n2;", "I", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d1 implements n2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 insets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    public /* synthetic */ d1(n2 n2Var, int i4, kotlin.jvm.internal.w wVar) {
        this(n2Var, i4);
    }

    @Override // androidx.compose.foundation.layout.n2
    public int a(@fg.l androidx.compose.ui.unit.d density) {
        int i4 = this.sides;
        g3.INSTANCE.getClass();
        if (g3.q(i4, g3.f5047i)) {
            return this.insets.a(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int b(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        int i4;
        if (layoutDirection == androidx.compose.ui.unit.w.Ltr) {
            g3.INSTANCE.getClass();
            i4 = g3.f5042d;
        } else {
            g3.INSTANCE.getClass();
            i4 = g3.f5044f;
        }
        if (g3.q(this.sides, i4)) {
            return this.insets.b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int c(@fg.l androidx.compose.ui.unit.d density) {
        int i4 = this.sides;
        g3.INSTANCE.getClass();
        if (g3.q(i4, g3.f5048j)) {
            return this.insets.c(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.n2
    public int d(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        int i4;
        if (layoutDirection == androidx.compose.ui.unit.w.Ltr) {
            g3.INSTANCE.getClass();
            i4 = g3.f5041c;
        } else {
            g3.INSTANCE.getClass();
            i4 = g3.f5043e;
        }
        if (g3.q(this.sides, i4)) {
            return this.insets.d(density, layoutDirection);
        }
        return 0;
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
        if (!(other instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) other;
        return kotlin.jvm.internal.l0.g(this.insets, d1Var.insets) && g3.p(this.sides, d1Var.sides);
    }

    /* renamed from: f, reason: from getter */
    public final int getSides() {
        return this.sides;
    }

    public int hashCode() {
        return g3.r(this.sides) + (this.insets.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "(" + this.insets + " only " + ((Object) g3.t(this.sides)) + ')';
    }

    private d1(n2 n2Var, int i4) {
        this.insets = n2Var;
        this.sides = i4;
    }
}
