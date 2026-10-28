package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: SpringSimulation.kt */
@kd.g
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/g1;", "", "", "packedValue", "b", "(J)J", "", "value", "velocity", "c", "(JFF)J", "", "k", "(J)Ljava/lang/String;", "", "j", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "g", "()J", "h", "(J)F", "i", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n34#2:244\n41#2:245\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:245\n*E\n"})
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ g1(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ g1 a(long j4) {
        return new g1(j4);
    }

    public static long b(long j4) {
        return j4;
    }

    public static final long c(long j4, float f4, float f5) {
        return x1.a(f4, f5);
    }

    public static long d(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = h(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = i(j4);
        }
        return x1.a(f4, f5);
    }

    public static boolean e(long j4, Object obj) {
        return (obj instanceof g1) && j4 == ((g1) obj).packedValue;
    }

    public static final boolean f(long j4, long j5) {
        return j4 == j5;
    }

    public static final float h(long j4) {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float i(long j4) {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static int j(long j4) {
        return Long.hashCode(j4);
    }

    public static String k(long j4) {
        return "Motion(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.packedValue, obj);
    }

    /* renamed from: g, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final /* synthetic */ long l() {
        return this.packedValue;
    }

    public String toString() {
        return k(this.packedValue);
    }
}
