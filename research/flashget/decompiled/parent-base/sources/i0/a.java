package i0;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.w0;

/* compiled from: CornerRadius.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 (2\u00020\u0001:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Li0/a;", "", "", "packedValue", "e", "(J)J", "", "c", "(J)F", "d", "x", "y", "f", "(JFF)J", "u", "other", "q", "(JJ)J", "r", "operand", "s", "(JF)J", "h", "", "t", "(J)Ljava/lang/String;", "", "p", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "a", "J", "k", "()V", "m", "l", "o", "n", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f74139c = b.b(0.0f, 0.0f, 2, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Li0/a$a;", "", "<init>", "()V", "Li0/a;", "Zero", "J", "a", "()J", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return a.f74139c;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ a(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ a b(long j4) {
        return new a(j4);
    }

    @x4
    public static final float c(long j4) {
        return m(j4);
    }

    @x4
    public static final float d(long j4) {
        return o(j4);
    }

    public static long e(long j4) {
        return j4;
    }

    public static final long f(long j4, float f4, float f5) {
        return b.a(f4, f5);
    }

    public static long g(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = m(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = o(j4);
        }
        return b.a(f4, f5);
    }

    @x4
    public static final long h(long j4, float f4) {
        return b.a(m(j4) / f4, o(j4) / f4);
    }

    public static boolean i(long j4, Object obj) {
        return (obj instanceof a) && j4 == ((a) obj).packedValue;
    }

    public static final boolean j(long j4, long j5) {
        return j4 == j5;
    }

    @w0
    public static /* synthetic */ void k() {
    }

    @x4
    public static /* synthetic */ void l() {
    }

    public static final float m(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    @x4
    public static /* synthetic */ void n() {
    }

    public static final float o(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static int p(long j4) {
        return Long.hashCode(j4);
    }

    @x4
    public static final long q(long j4, long j5) {
        return b.a(m(j4) - m(j5), o(j4) - o(j5));
    }

    @x4
    public static final long r(long j4, long j5) {
        return b.a(m(j5) + m(j4), o(j5) + o(j4));
    }

    @x4
    public static final long s(long j4, float f4) {
        return b.a(m(j4) * f4, o(j4) * f4);
    }

    @fg.l
    public static String t(long j4) {
        if (m(j4) == o(j4)) {
            return "CornerRadius.circular(" + c.a(m(j4), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(m(j4), 1) + ", " + c.a(o(j4), 1) + ')';
    }

    @x4
    public static final long u(long j4) {
        return b.a(-m(j4), -o(j4));
    }

    public boolean equals(Object obj) {
        return i(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    @fg.l
    public String toString() {
        return t(this.packedValue);
    }

    /* renamed from: v, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
