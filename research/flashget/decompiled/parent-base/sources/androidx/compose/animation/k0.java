package androidx.compose.animation;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/k0;", "", "", "alpha", "Landroidx/compose/animation/core/p0;", "animationSpec", "<init>", "(FLandroidx/compose/animation/core/p0;)V", "a", "()F", "b", "()Landroidx/compose/animation/core/p0;", "c", "(FLandroidx/compose/animation/core/p0;)Landroidx/compose/animation/k0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "e", "Landroidx/compose/animation/core/p0;", "f", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3194c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.p0<Float> animationSpec;

    public k0(float f4, @fg.l androidx.compose.animation.core.p0<Float> p0Var) {
        this.alpha = f4;
        this.animationSpec = p0Var;
    }

    public static k0 d(k0 k0Var, float f4, androidx.compose.animation.core.p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = k0Var.alpha;
        }
        if ((i4 & 2) != 0) {
            p0Var = k0Var.animationSpec;
        }
        k0Var.getClass();
        return new k0(f4, p0Var);
    }

    /* renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @fg.l
    public final androidx.compose.animation.core.p0<Float> b() {
        return this.animationSpec;
    }

    @fg.l
    public final k0 c(float alpha, @fg.l androidx.compose.animation.core.p0<Float> animationSpec) {
        return new k0(alpha, animationSpec);
    }

    public final float e() {
        return this.alpha;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) other;
        return Float.compare(this.alpha, k0Var.alpha) == 0 && kotlin.jvm.internal.l0.g(this.animationSpec, k0Var.animationSpec);
    }

    @fg.l
    public final androidx.compose.animation.core.p0<Float> f() {
        return this.animationSpec;
    }

    public int hashCode() {
        return this.animationSpec.hashCode() + (Float.hashCode(this.alpha) * 31);
    }

    @fg.l
    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
