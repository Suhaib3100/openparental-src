package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: SplineBasedDecay.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/c;", "", "<init>", "()V", "", "time", "Landroidx/compose/animation/c$a;", "b", "(F)Landroidx/compose/animation/c$a;", "velocity", "friction", "", "a", "(FF)D", "", "I", "NbSamples", "", "c", "[F", "SplinePositions", "d", "SplineTimes", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f2511a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int NbSamples = 100;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] SplinePositions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] SplineTimes;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2515e;

    /* compiled from: SplineBasedDecay.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/c$a;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "a", "()F", "b", "c", "(FF)Landroidx/compose/animation/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "e", "f", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f2516c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float distanceCoefficient;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float velocityCoefficient;

        public a(float f4, float f5) {
            this.distanceCoefficient = f4;
            this.velocityCoefficient = f5;
        }

        public static a d(a aVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = aVar.distanceCoefficient;
            }
            if ((i4 & 2) != 0) {
                f5 = aVar.velocityCoefficient;
            }
            aVar.getClass();
            return new a(f4, f5);
        }

        /* renamed from: a, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        /* renamed from: b, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        @fg.l
        public final a c(float distanceCoefficient, float velocityCoefficient) {
            return new a(distanceCoefficient, velocityCoefficient);
        }

        public final float e() {
            return this.distanceCoefficient;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.distanceCoefficient, aVar.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, aVar.velocityCoefficient) == 0;
        }

        public final float f() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return Float.hashCode(this.velocityCoefficient) + (Float.hashCode(this.distanceCoefficient) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.distanceCoefficient);
            sb.append(", velocityCoefficient=");
            return b.a(sb, this.velocityCoefficient, ')');
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        a1.b(fArr, fArr2, 100);
        f2515e = 8;
    }

    private c() {
    }

    public final double a(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    @fg.l
    public final a b(float time) {
        float f4;
        float f5;
        float f6 = 100;
        int i4 = (int) (f6 * time);
        if (i4 < 100) {
            float f7 = i4 / f6;
            int i5 = i4 + 1;
            float f10 = i5 / f6;
            float[] fArr = SplinePositions;
            float f11 = fArr[i4];
            f5 = (fArr[i5] - f11) / (f10 - f7);
            f4 = androidx.appcompat.graphics.drawable.d.a(time, f7, f5, f11);
        } else {
            f4 = 1.0f;
            f5 = 0.0f;
        }
        return new a(f4, f5);
    }
}
