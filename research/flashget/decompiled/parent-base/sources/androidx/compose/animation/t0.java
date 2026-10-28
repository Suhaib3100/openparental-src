package androidx.compose.animation;

import androidx.compose.runtime.m1;
import androidx.compose.ui.graphics.p6;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/animation/t0;", "", "", "scale", "Landroidx/compose/ui/graphics/p6;", "transformOrigin", "Landroidx/compose/animation/core/p0;", "animationSpec", "<init>", "(FJLandroidx/compose/animation/core/p0;Lkotlin/jvm/internal/w;)V", "a", "()F", "b", "()J", "c", "()Landroidx/compose/animation/core/p0;", "d", "(FJLandroidx/compose/animation/core/p0;)Landroidx/compose/animation/t0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "J", "h", "Landroidx/compose/animation/core/p0;", "f", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f3361d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float scale;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long transformOrigin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.p0<Float> animationSpec;

    public /* synthetic */ t0(float f4, long j4, androidx.compose.animation.core.p0 p0Var, kotlin.jvm.internal.w wVar) {
        this(f4, j4, p0Var);
    }

    public static t0 e(t0 t0Var, float f4, long j4, androidx.compose.animation.core.p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = t0Var.scale;
        }
        if ((i4 & 2) != 0) {
            j4 = t0Var.transformOrigin;
        }
        if ((i4 & 4) != 0) {
            p0Var = t0Var.animationSpec;
        }
        t0Var.getClass();
        return new t0(f4, j4, p0Var);
    }

    /* renamed from: a, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: b, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @fg.l
    public final androidx.compose.animation.core.p0<Float> c() {
        return this.animationSpec;
    }

    @fg.l
    public final t0 d(float scale, long transformOrigin, @fg.l androidx.compose.animation.core.p0<Float> animationSpec) {
        return new t0(scale, transformOrigin, animationSpec);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return Float.compare(this.scale, t0Var.scale) == 0 && p6.i(this.transformOrigin, t0Var.transformOrigin) && kotlin.jvm.internal.l0.g(this.animationSpec, t0Var.animationSpec);
    }

    @fg.l
    public final androidx.compose.animation.core.p0<Float> f() {
        return this.animationSpec;
    }

    public final float g() {
        return this.scale;
    }

    public final long h() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return this.animationSpec.hashCode() + ((p6.m(this.transformOrigin) + (Float.hashCode(this.scale) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) p6.n(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private t0(float f4, long j4, androidx.compose.animation.core.p0<Float> p0Var) {
        this.scale = f4;
        this.transformOrigin = j4;
        this.animationSpec = p0Var;
    }
}
