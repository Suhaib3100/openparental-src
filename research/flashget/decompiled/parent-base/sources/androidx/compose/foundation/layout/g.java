package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/g;", "", "<init>", "()V", "", "time", "Landroidx/compose/foundation/layout/g$a;", "b", "(F)J", "velocity", "friction", "", "a", "(FF)D", "", "I", "NbSamples", "", "c", "[F", "SplinePositions", "d", "SplineTimes", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n25#2,3:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n700#1:726,3\n*E\n"})
/* loaded from: classes.dex */
final class g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int NbSamples = 100;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f5023a = new g();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] SplinePositions = new float[101];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] SplineTimes = new float[101];

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/g$a;", "", "", "packedValue", "b", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "", "e", "(J)F", "distanceCoefficient", "f", "velocityCoefficient", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    @kotlin.jvm.internal.r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n34#2:726\n41#2:727\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:726\n722#1:727\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long packedValue;

        private /* synthetic */ a(long j4) {
            this.packedValue = j4;
        }

        public static final /* synthetic */ a a(long j4) {
            return new a(j4);
        }

        public static long b(long j4) {
            return j4;
        }

        public static boolean c(long j4, Object obj) {
            return (obj instanceof a) && j4 == ((a) obj).packedValue;
        }

        public static final boolean d(long j4, long j5) {
            return j4 == j5;
        }

        public static final float e(long j4) {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
            return Float.intBitsToFloat((int) (j4 >> 32));
        }

        public static final float f(long j4) {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
            return Float.intBitsToFloat((int) (j4 & 4294967295L));
        }

        public static int g(long j4) {
            return Long.hashCode(j4);
        }

        public static String h(long j4) {
            return "FlingResult(packedValue=" + j4 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.packedValue, obj);
        }

        public int hashCode() {
            return Long.hashCode(this.packedValue);
        }

        /* renamed from: i, reason: from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        public String toString() {
            return h(this.packedValue);
        }
    }

    static {
        float f4;
        float f5;
        float f6;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i4 = 0; i4 < 100; i4++) {
            float f16 = i4 / 100;
            float f17 = 1.0f;
            while (true) {
                f4 = ((f17 - f14) / 2.0f) + f14;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float a5 = androidx.compose.animation.z0.a(f4, 0.35000002f, f5 * 0.175f, f6) + f7;
                if (Math.abs(a5 - f16) < 1.0E-5d) {
                    break;
                } else if (a5 > f16) {
                    f17 = f4;
                } else {
                    f14 = f4;
                }
            }
            float f18 = 0.5f;
            SplinePositions[i4] = (((f5 * 0.5f) + f4) * f6) + f7;
            float f19 = 1.0f;
            while (true) {
                f10 = ((f19 - f15) / 2.0f) + f15;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float a6 = androidx.compose.animation.z0.a(f11, f18, f10, f12) + f13;
                if (Math.abs(a6 - f16) >= 1.0E-5d) {
                    if (a6 > f16) {
                        f19 = f10;
                    } else {
                        f15 = f10;
                    }
                    f18 = 0.5f;
                }
            }
            SplineTimes[i4] = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private g() {
    }

    public final double a(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    public final long b(float time) {
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
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }
}
