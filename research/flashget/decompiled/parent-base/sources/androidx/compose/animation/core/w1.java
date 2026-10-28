package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: SpringSimulation.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R*\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b \u0010\u0005R$\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b$\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/w1;", "", "", "finalPosition", "<init>", "(F)V", "Lkotlin/k2;", "e", "()V", "lastDisplacement", "lastVelocity", "a", "(FF)F", "", "timeElapsed", "Landroidx/compose/animation/core/g1;", "i", "(FFJ)J", "F", "c", "()F", "g", "", "b", "D", "naturalFreq", "", "Z", "initialized", "d", "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", "h", "stiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f2963h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double gammaPlus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double gammaMinus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double dampedFreq;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public w1(float f4) {
        this.finalPosition = f4;
    }

    private final void e() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == x1.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f4 = this.dampingRatio;
        double d5 = f4 * f4;
        if (f4 > 1.0f) {
            double d6 = this.naturalFreq;
            double d7 = d5 - 1;
            this.gammaPlus = (Math.sqrt(d7) * d6) + ((-f4) * d6);
            double d10 = -this.dampingRatio;
            double d11 = this.naturalFreq;
            this.gammaMinus = (d10 * d11) - (Math.sqrt(d7) * d11);
        } else if (f4 >= 0.0f && f4 < 1.0f) {
            this.dampedFreq = Math.sqrt(1 - d5) * this.naturalFreq;
        }
        this.initialized = true;
    }

    public final float a(float lastDisplacement, float lastVelocity) {
        float f4 = lastDisplacement - this.finalPosition;
        double d5 = this.naturalFreq;
        return (float) (((-(d5 * d5)) * f4) - (((d5 * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    /* renamed from: b, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* renamed from: c, reason: from getter */
    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float d() {
        double d5 = this.naturalFreq;
        return (float) (d5 * d5);
    }

    public final void f(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f4;
        this.initialized = false;
    }

    public final void g(float f4) {
        this.finalPosition = f4;
    }

    public final void h(float f4) {
        double d5 = this.naturalFreq;
        if (((float) (d5 * d5)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f4);
        this.initialized = false;
    }

    public final long i(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double cos;
        double d5;
        double d6;
        double exp;
        e();
        float f4 = lastDisplacement - this.finalPosition;
        double d7 = timeElapsed / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d10 = f4;
            double d11 = this.gammaMinus;
            double d12 = lastVelocity;
            double d13 = this.gammaPlus;
            double d14 = d10 - (((d11 * d10) - d12) / (d11 - d13));
            double d15 = ((d10 * d11) - d12) / (d11 - d13);
            d5 = (Math.exp(this.gammaPlus * d7) * d15) + (Math.exp(d11 * d7) * d14);
            double d16 = this.gammaMinus;
            d6 = Math.exp(d16 * d7) * d14 * d16;
            double d17 = this.gammaPlus;
            exp = Math.exp(d17 * d7) * d15 * d17;
        } else {
            if (f5 != 1.0f) {
                double d18 = 1 / this.dampedFreq;
                double d19 = this.naturalFreq;
                double d20 = f4;
                double d21 = ((f5 * d19 * d20) + lastVelocity) * d18;
                double exp2 = Math.exp((-f5) * d19 * d7) * ((Math.sin(this.dampedFreq * d7) * d21) + (Math.cos(this.dampedFreq * d7) * d20));
                double d22 = this.naturalFreq;
                double d23 = (-d22) * exp2 * this.dampingRatio;
                double exp3 = Math.exp((-r7) * d22 * d7);
                double d24 = this.dampedFreq;
                double sin = Math.sin(d24 * d7) * (-d24) * d20;
                double d25 = this.dampedFreq;
                cos = (((Math.cos(d25 * d7) * d21 * d25) + sin) * exp3) + d23;
                d5 = exp2;
                return x1.a((float) (d5 + this.finalPosition), (float) cos);
            }
            double d26 = this.naturalFreq;
            double d27 = f4;
            double d28 = (d26 * d27) + lastVelocity;
            double d29 = (d28 * d7) + d27;
            d5 = Math.exp((-d26) * d7) * d29;
            double exp4 = Math.exp((-this.naturalFreq) * d7) * d29;
            double d30 = this.naturalFreq;
            d6 = exp4 * (-d30);
            exp = Math.exp((-d30) * d7) * d28;
        }
        cos = exp + d6;
        return x1.a((float) (d5 + this.finalPosition), (float) cos);
    }
}
