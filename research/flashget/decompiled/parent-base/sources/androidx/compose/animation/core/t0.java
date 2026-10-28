package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: FloatDecayAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/t0;", "Landroidx/compose/animation/core/r0;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JFF)F", "b", "c", "(FF)J", "d", "(FF)F", "a", "F", "()F", "friction", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2909c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.t0.<init>():void");
    }

    @Override // androidx.compose.animation.core.r0
    /* renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.r0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) Math.exp(((playTimeNanos / 1000000) / 1000.0f) * this.friction));
    }

    @Override // androidx.compose.animation.core.r0
    public long c(float initialValue, float initialVelocity) {
        return ((long) ((((float) Math.log(this.absVelocityThreshold / Math.abs(initialVelocity))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // androidx.compose.animation.core.r0
    public float d(float initialValue, float initialVelocity) {
        if (Math.abs(initialVelocity) <= this.absVelocityThreshold) {
            return initialValue;
        }
        double log = Math.log(Math.abs(r1 / initialVelocity));
        float f4 = this.friction;
        return ((initialVelocity / f4) * ((float) Math.exp((f4 * ((log / f4) * 1000)) / 1000.0f))) + (initialValue - (initialVelocity / f4));
    }

    @Override // androidx.compose.animation.core.r0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        float f4 = this.friction;
        return ((initialVelocity / f4) * ((float) Math.exp((f4 * (playTimeNanos / 1000000)) / 1000.0f))) + (initialValue - (initialVelocity / f4));
    }

    public t0(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f4, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f5) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f5));
        this.friction = Math.max(1.0E-4f, f4) * (-4.2f);
    }

    public /* synthetic */ t0(float f4, float f5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? 0.1f : f5);
    }
}
