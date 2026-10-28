package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.g;
import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/h2;", "Landroidx/compose/animation/core/r0;", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/ui/unit/d;)V", "", "velocity", "", "g", "(F)D", "f", "(F)F", "initialValue", "initialVelocity", "d", "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "a", "F", "magicPhysicalCoefficient", "()F", "absVelocityThreshold", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h2 implements androidx.compose.animation.core.r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    public h2(@fg.l androidx.compose.ui.unit.d dVar) {
        this.magicPhysicalCoefficient = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double g(float velocity) {
        float f4;
        g gVar = g.f5023a;
        f4 = p2.f5244b;
        return gVar.a(velocity, f4 * this.magicPhysicalCoefficient);
    }

    @Override // androidx.compose.animation.core.r0
    /* renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.r0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        long c5 = c(0.0f, initialVelocity);
        return ((g.a.f(g.f5023a.b(c5 > 0 ? playTimeNanos / c5 : 1.0f)) * f(initialVelocity)) / c5) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.r0
    public long c(float initialValue, float initialVelocity) {
        double d5;
        double g4 = g(initialVelocity);
        d5 = p2.f5248f;
        return (long) (Math.exp(g4 / d5) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.r0
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // androidx.compose.animation.core.r0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        long c5 = c(0.0f, initialVelocity);
        return (g.a.e(g.f5023a.b(c5 > 0 ? playTimeNanos / c5 : 1.0f)) * f(initialVelocity)) + initialValue;
    }

    public final float f(float velocity) {
        float f4;
        double d5;
        double d6;
        double g4 = g(velocity);
        f4 = p2.f5244b;
        double d7 = f4 * this.magicPhysicalCoefficient;
        d5 = p2.f5247e;
        d6 = p2.f5248f;
        return Math.signum(velocity) * ((float) (Math.exp((d5 / d6) * g4) * d7));
    }
}
