package androidx.compose.animation;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B8\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\u00020\u00002#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR2\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Landroidx/compose/animation/y0;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/u;", "Lkotlin/r0;", "name", "fullSize", "Landroidx/compose/ui/unit/q;", "slideOffset", "Landroidx/compose/animation/core/p0;", "animationSpec", "<init>", "(Lld/l;Landroidx/compose/animation/core/p0;)V", "a", "()Lld/l;", "b", "()Landroidx/compose/animation/core/p0;", "c", "(Lld/l;Landroidx/compose/animation/core/p0;)Landroidx/compose/animation/y0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lld/l;", "f", "Landroidx/compose/animation/core/p0;", "e", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class y0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3398c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> slideOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> lVar, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> p0Var) {
        this.slideOffset = lVar;
        this.animationSpec = p0Var;
    }

    public static y0 d(y0 y0Var, ld.l lVar, androidx.compose.animation.core.p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = y0Var.slideOffset;
        }
        if ((i4 & 2) != 0) {
            p0Var = y0Var.animationSpec;
        }
        y0Var.getClass();
        return new y0(lVar, p0Var);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> a() {
        return this.slideOffset;
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> b() {
        return this.animationSpec;
    }

    @fg.l
    public final y0 c(@fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> slideOffset, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec) {
        return new y0(slideOffset, animationSpec);
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> e() {
        return this.animationSpec;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) other;
        return kotlin.jvm.internal.l0.g(this.slideOffset, y0Var.slideOffset) && kotlin.jvm.internal.l0.g(this.animationSpec, y0Var.animationSpec);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> f() {
        return this.slideOffset;
    }

    public int hashCode() {
        return this.animationSpec.hashCode() + (this.slideOffset.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
