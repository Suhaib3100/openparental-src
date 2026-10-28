package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: HitTestResult.kt */
@kd.g
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/p;", "", "", "packedValue", "c", "(J)J", "other", "", "b", "(JJ)I", "", "j", "(J)Ljava/lang/String;", "h", "(J)I", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "g", "()J", "", "f", "(J)F", "distance", "i", "(J)Z", "isInLayer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,341:1\n34#2:342\n62#2:343\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n320#1:342\n323#1:343\n*E\n"})
/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ p(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ p a(long j4) {
        return new p(j4);
    }

    public static final int b(long j4, long j5) {
        boolean i4 = i(j4);
        return i4 != i(j5) ? i4 ? -1 : 1 : (int) Math.signum(f(j4) - f(j5));
    }

    public static long c(long j4) {
        return j4;
    }

    public static boolean d(long j4, Object obj) {
        return (obj instanceof p) && j4 == ((p) obj).packedValue;
    }

    public static final boolean e(long j4, long j5) {
        return j4 == j5;
    }

    public static final float f(long j4) {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static int h(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean i(long j4) {
        return ((int) (j4 & 4294967295L)) != 0;
    }

    public static String j(long j4) {
        return "DistanceAndInLayer(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    /* renamed from: g, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final /* synthetic */ long k() {
        return this.packedValue;
    }

    public String toString() {
        return j(this.packedValue);
    }
}
