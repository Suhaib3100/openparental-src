package androidx.compose.ui.unit;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 )2\u00020\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\nø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\nø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0005J\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/unit/q;", "", "", "packedValue", "e", "(J)J", "", "c", "(J)I", "d", "x", "y", "f", "(JII)J", "other", "q", "(JJ)J", "r", "v", "", "operand", "t", "(JF)J", "h", "s", "(JI)J", "", "u", "(J)Ljava/lang/String;", "p", "", "i", "(JLjava/lang/Object;)Z", "a", "J", "k", "()V", "m", "l", "o", "n", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,180:1\n55#2:181\n62#2:182\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:181\n60#1:182\n*E\n"})
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f21519c = r.a(0, 0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/q$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/q;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.q$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return q.f21519c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ q(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ q b(long j4) {
        return new q(j4);
    }

    @x4
    public static final int c(long j4) {
        return (int) (j4 >> 32);
    }

    @x4
    public static final int d(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static long e(long j4) {
        return j4;
    }

    public static final long f(long j4, int i4, int i5) {
        return r.a(i4, i5);
    }

    public static long g(long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = (int) (j4 >> 32);
        }
        if ((i6 & 2) != 0) {
            i5 = (int) (j4 & 4294967295L);
        }
        return r.a(i4, i5);
    }

    @x4
    public static final long h(long j4, float f4) {
        return r.a(kotlin.math.b.L0(((int) (j4 >> 32)) / f4), kotlin.math.b.L0(((int) (j4 & 4294967295L)) / f4));
    }

    public static boolean i(long j4, Object obj) {
        return (obj instanceof q) && j4 == ((q) obj).packedValue;
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

    public static final int m(long j4) {
        return (int) (j4 >> 32);
    }

    @x4
    public static /* synthetic */ void n() {
    }

    public static final int o(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static int p(long j4) {
        return Long.hashCode(j4);
    }

    @x4
    public static final long q(long j4, long j5) {
        return r.a(((int) (j4 >> 32)) - ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) - ((int) (j5 & 4294967295L)));
    }

    @x4
    public static final long r(long j4, long j5) {
        return r.a(((int) (j4 >> 32)) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L)));
    }

    @x4
    public static final long s(long j4, int i4) {
        return r.a(((int) (j4 >> 32)) % i4, ((int) (j4 & 4294967295L)) % i4);
    }

    @x4
    public static final long t(long j4, float f4) {
        return r.a(kotlin.math.b.L0(((int) (j4 >> 32)) * f4), kotlin.math.b.L0(((int) (j4 & 4294967295L)) * f4));
    }

    @x4
    @fg.l
    public static String u(long j4) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return androidx.view.e.a(sb, (int) (j4 & 4294967295L), ')');
    }

    @x4
    public static final long v(long j4) {
        return r.a(-((int) (j4 >> 32)), -((int) (j4 & 4294967295L)));
    }

    public boolean equals(Object obj) {
        return i(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    @x4
    @fg.l
    public String toString() {
        return u(this.packedValue);
    }

    /* renamed from: w, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
