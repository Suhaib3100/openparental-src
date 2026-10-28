package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: FloatAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/core/u0;", "Landroidx/compose/animation/core/q0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JFFF)F", "e", "c", "(FFF)F", "f", "(FFF)J", "a", "F", "h", "()F", "b", "i", "Landroidx/compose/animation/core/w1;", "Landroidx/compose/animation/core/w1;", "spring", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 implements q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2920e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibilityThreshold;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w1 spring;

    public u0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // androidx.compose.animation.core.q0
    public float c(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.q0
    public float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.g(targetValue);
        return g1.h(this.spring.i(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    @Override // androidx.compose.animation.core.q0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.g(targetValue);
        return g1.i(this.spring.i(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    @Override // androidx.compose.animation.core.q0
    public long f(float initialValue, float targetValue, float initialVelocity) {
        float d5 = this.spring.d();
        float dampingRatio = this.spring.getDampingRatio();
        float f4 = initialValue - targetValue;
        float f5 = this.visibilityThreshold;
        return v1.c(d5, dampingRatio, initialVelocity / f5, f4 / f5, 1.0f) * 1000000;
    }

    /* renamed from: h, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* renamed from: i, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    public u0(float f4, float f5, float f6) {
        this.dampingRatio = f4;
        this.stiffness = f5;
        this.visibilityThreshold = f6;
        w1 w1Var = new w1(1.0f);
        w1Var.f(f4);
        w1Var.h(f5);
        this.spring = w1Var;
    }

    public /* synthetic */ u0(float f4, float f5, float f6, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? 1500.0f : f5, (i4 & 4) != 0 ? 0.01f : f6);
    }
}
