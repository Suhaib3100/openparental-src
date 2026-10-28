package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0081@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/i9;", "", "", "packedValue", "c", "(J)J", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "h", "()J", "", "j", "(J)F", "i", "()V", "start", "g", "f", "endInclusive", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2151:1\n34#2:2152\n41#2:2153\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n2076#1:2152\n2089#1:2153\n*E\n"})
/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f11620c = g9.i(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material3/i9$a;", "", "<init>", "()V", "Landroidx/compose/material3/i9;", "Unspecified", "J", "a", "()J", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.i9$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @androidx.compose.runtime.x4
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return i9.f11620c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ i9(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ i9 b(long j4) {
        return new i9(j4);
    }

    public static long c(long j4) {
        return j4;
    }

    public static boolean d(long j4, Object obj) {
        return (obj instanceof i9) && j4 == ((i9) obj).packedValue;
    }

    public static final boolean e(long j4, long j5) {
        return j4 == j5;
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void f() {
    }

    public static final float g(long j4) {
        if (j4 == f11620c) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void i() {
    }

    public static final float j(long j4) {
        if (j4 == f11620c) {
            throw new IllegalStateException("SliderRange is unspecified");
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static int k(long j4) {
        return Long.hashCode(j4);
    }

    @fg.l
    public static String l(long j4) {
        if (!g9.A(j4)) {
            return "FloatRange.Unspecified";
        }
        return j(j4) + ".." + g(j4);
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    /* renamed from: h, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final /* synthetic */ long m() {
        return this.packedValue;
    }

    @fg.l
    public String toString() {
        return l(this.packedValue);
    }
}
