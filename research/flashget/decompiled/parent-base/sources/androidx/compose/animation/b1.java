package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/b1;", "Landroidx/compose/animation/core/r0;", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/ui/unit/d;)V", "", "startVelocity", "f", "(F)F", "initialValue", "initialVelocity", "d", "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "Landroidx/compose/animation/m0;", "a", "Landroidx/compose/animation/m0;", "flingCalculator", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b1 implements androidx.compose.animation.core.r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2509b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 flingCalculator;

    public b1(@fg.l androidx.compose.ui.unit.d dVar) {
        this.flingCalculator = new m0(c1.a(), dVar);
    }

    private final float f(float startVelocity) {
        return Math.signum(startVelocity) * this.flingCalculator.b(startVelocity);
    }

    @Override // androidx.compose.animation.core.r0
    /* renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.r0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).j(playTimeNanos / 1000000);
    }

    @Override // androidx.compose.animation.core.r0
    public long c(float initialValue, float initialVelocity) {
        return this.flingCalculator.c(initialVelocity) * 1000000;
    }

    @Override // androidx.compose.animation.core.r0
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // androidx.compose.animation.core.r0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).i(playTimeNanos / 1000000) + initialValue;
    }
}
