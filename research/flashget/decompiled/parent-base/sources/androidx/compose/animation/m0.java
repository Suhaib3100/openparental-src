package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: FlingCalculator.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/m0;", "", "", "friction", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(FLandroidx/compose/ui/unit/d;)V", "a", "(Landroidx/compose/ui/unit/d;)F", "velocity", "", "f", "(F)D", "", "c", "(F)J", "b", "(F)F", "Landroidx/compose/animation/m0$a;", "d", "(F)Landroidx/compose/animation/m0$a;", "F", "Landroidx/compose/ui/unit/d;", "e", "()Landroidx/compose/ui/unit/d;", "magicPhysicalCoefficient", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f3230d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    /* compiled from: FlingCalculator.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Landroidx/compose/animation/m0$a;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", "i", "(J)F", "j", "a", "()F", "b", "c", "()J", "d", "(FFJ)Landroidx/compose/animation/m0$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "h", "f", "J", "g", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f3234d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float initialVelocity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float distance;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long duration;

        public a(float f4, float f5, long j4) {
            this.initialVelocity = f4;
            this.distance = f5;
            this.duration = j4;
        }

        public static a e(a aVar, float f4, float f5, long j4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = aVar.initialVelocity;
            }
            if ((i4 & 2) != 0) {
                f5 = aVar.distance;
            }
            if ((i4 & 4) != 0) {
                j4 = aVar.duration;
            }
            aVar.getClass();
            return new a(f4, f5, j4);
        }

        /* renamed from: a, reason: from getter */
        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        /* renamed from: b, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        /* renamed from: c, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @fg.l
        public final a d(float initialVelocity, float distance, long duration) {
            return new a(initialVelocity, distance, duration);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.initialVelocity, aVar.initialVelocity) == 0 && Float.compare(this.distance, aVar.distance) == 0 && this.duration == aVar.duration;
        }

        public final float f() {
            return this.distance;
        }

        public final long g() {
            return this.duration;
        }

        public final float h() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return Long.hashCode(this.duration) + l0.a(this.distance, Float.hashCode(this.initialVelocity) * 31, 31);
        }

        public final float i(long time) {
            long j4 = this.duration;
            return c.f2511a.b(j4 > 0 ? time / j4 : 1.0f).e() * Math.signum(this.initialVelocity) * this.distance;
        }

        public final float j(long time) {
            long j4 = this.duration;
            return (((Math.signum(this.initialVelocity) * c.f2511a.b(j4 > 0 ? time / j4 : 1.0f).f()) * this.distance) / this.duration) * 1000.0f;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.initialVelocity);
            sb.append(", distance=");
            sb.append(this.distance);
            sb.append(", duration=");
            return androidx.collection.y0.a(sb, this.duration, ')');
        }
    }

    public m0(float f4, @fg.l androidx.compose.ui.unit.d dVar) {
        this.friction = f4;
        this.density = dVar;
        this.magicPhysicalCoefficient = a(dVar);
    }

    private final float a(androidx.compose.ui.unit.d density) {
        float c5;
        c5 = n0.c(0.84f, density.b());
        return c5;
    }

    private final double f(float velocity) {
        return c.f2511a.a(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final float b(float velocity) {
        float f4;
        float f5;
        double f6 = f(velocity);
        f4 = n0.f3240c;
        double d5 = f4 - 1.0d;
        double d6 = this.friction * this.magicPhysicalCoefficient;
        f5 = n0.f3240c;
        return (float) (Math.exp((f5 / d5) * f6) * d6);
    }

    public final long c(float velocity) {
        float f4;
        double f5 = f(velocity);
        f4 = n0.f3240c;
        return (long) (Math.exp(f5 / (f4 - 1.0d)) * 1000.0d);
    }

    @fg.l
    public final a d(float velocity) {
        float f4;
        float f5;
        double f6 = f(velocity);
        f4 = n0.f3240c;
        double d5 = f4 - 1.0d;
        double d6 = this.friction * this.magicPhysicalCoefficient;
        f5 = n0.f3240c;
        return new a(velocity, (float) (Math.exp((f5 / d5) * f6) * d6), (long) (Math.exp(f6 / d5) * 1000.0d));
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }
}
