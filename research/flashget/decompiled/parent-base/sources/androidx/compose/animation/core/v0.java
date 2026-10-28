package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: FloatAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/v0;", "Landroidx/compose/animation/core/q0;", "", "duration", "delay", "Landroidx/compose/animation/core/d0;", "easing", "<init>", "(IILandroidx/compose/animation/core/d0;)V", "", "playTime", "h", "(J)J", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "d", "(JFFF)F", "f", "(FFF)J", "e", "a", "I", "j", "()I", "b", "i", "c", "Landroidx/compose/animation/core/d0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v0 implements q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2950d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 easing;

    public v0() {
        this(0, 0, null, 7, null);
    }

    private final long h(long playTime) {
        return kotlin.ranges.s.K(playTime - this.delay, 0L, this.duration);
    }

    @Override // androidx.compose.animation.core.q0
    public float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long h4 = h(playTimeNanos / 1000000);
        int i4 = this.duration;
        return k2.k(initialValue, targetValue, this.easing.a(kotlin.ranges.s.H(i4 == 0 ? 1.0f : h4 / i4, 0.0f, 1.0f)));
    }

    @Override // androidx.compose.animation.core.q0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long h4 = h(playTimeNanos / 1000000);
        if (h4 < 0) {
            return 0.0f;
        }
        if (h4 == 0) {
            return initialVelocity;
        }
        return (d(h4 * 1000000, initialValue, targetValue, initialVelocity) - d((h4 - 1) * 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.q0
    public long f(float initialValue, float targetValue, float initialVelocity) {
        return (this.delay + this.duration) * 1000000;
    }

    /* renamed from: i, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* renamed from: j, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public v0(int i4, int i5, @fg.l d0 d0Var) {
        this.duration = i4;
        this.delay = i5;
        this.easing = d0Var;
    }

    public /* synthetic */ v0(int i4, int i5, d0 d0Var, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 300 : i4, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? m0.d() : d0Var);
    }
}
