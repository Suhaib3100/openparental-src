package androidx.compose.ui.unit;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: Dp.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b \u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/unit/j;", "", "", "packedValue", "d", "(J)J", "Landroidx/compose/ui/unit/h;", "x", "y", "e", "(JFF)J", "other", "o", "(JJ)J", "p", "", "q", "(J)Ljava/lang/String;", "", "n", "(J)I", "", "g", "(JLjava/lang/Object;)Z", "a", "J", "i", "()V", "j", "(J)F", "k", "l", "m", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f21504c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f21505d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/unit/j$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/j;", "Zero", "J", "b", "()J", "Unspecified", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return j.f21505d;
        }

        public final long b() {
            return j.f21504c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        float f4 = 0;
        f21504c = i.a(h.g(f4), f4);
        h.Companion companion = h.INSTANCE;
        companion.getClass();
        float f5 = h.f21501f;
        companion.getClass();
        f21505d = i.a(f5, h.f21501f);
    }

    private /* synthetic */ j(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ j c(long j4) {
        return new j(j4);
    }

    public static long d(long j4) {
        return j4;
    }

    public static final long e(long j4, float f4, float f5) {
        return i.a(f4, f5);
    }

    public static long f(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = j(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = l(j4);
        }
        return i.a(f4, f5);
    }

    public static boolean g(long j4, Object obj) {
        return (obj instanceof j) && j4 == ((j) obj).packedValue;
    }

    public static final boolean h(long j4, long j5) {
        return j4 == j5;
    }

    @w0
    public static /* synthetic */ void i() {
    }

    public static final float j(long j4) {
        if (j4 == f21505d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return h.g(Float.intBitsToFloat((int) (j4 >> 32)));
    }

    @x4
    public static /* synthetic */ void k() {
    }

    public static final float l(long j4) {
        if (j4 == f21505d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return h.g(Float.intBitsToFloat((int) (j4 & 4294967295L)));
    }

    @x4
    public static /* synthetic */ void m() {
    }

    public static int n(long j4) {
        return Long.hashCode(j4);
    }

    @x4
    public static final long o(long j4, long j5) {
        return i.a(h.g(j(j4) - j(j5)), l(j4) - l(j5));
    }

    @x4
    public static final long p(long j4, long j5) {
        return i.a(h.g(j(j5) + j(j4)), l(j5) + l(j4));
    }

    @x4
    @fg.l
    public static String q(long j4) {
        INSTANCE.getClass();
        if (j4 == f21505d) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) h.s(j(j4))) + ", " + ((Object) h.s(l(j4))) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @x4
    @fg.l
    public String toString() {
        return q(this.packedValue);
    }
}
