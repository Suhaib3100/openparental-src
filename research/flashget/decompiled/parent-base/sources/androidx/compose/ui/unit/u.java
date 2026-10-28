package androidx.compose.ui.unit;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: IntSize.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001e\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/unit/u;", "", "", "packedValue", "e", "(J)J", "", "c", "(J)I", "d", "other", "o", "(JI)J", "f", "", "p", "(J)Ljava/lang/String;", "n", "", "g", "(JLjava/lang/Object;)Z", "a", "J", "k", "()V", "m", "l", "width", "j", "i", "height", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,112:1\n55#2:113\n62#2:114\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:113\n53#1:114\n*E\n"})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f21529c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: IntSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/u$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/u;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return u.f21529c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ u(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ u b(long j4) {
        return new u(j4);
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

    @x4
    public static final long f(long j4, int i4) {
        return v.a(((int) (j4 >> 32)) / i4, ((int) (j4 & 4294967295L)) / i4);
    }

    public static boolean g(long j4, Object obj) {
        return (obj instanceof u) && j4 == ((u) obj).packedValue;
    }

    public static final boolean h(long j4, long j5) {
        return j4 == j5;
    }

    @x4
    public static /* synthetic */ void i() {
    }

    public static final int j(long j4) {
        return (int) (j4 & 4294967295L);
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

    public static int n(long j4) {
        return Long.hashCode(j4);
    }

    @x4
    public static final long o(long j4, int i4) {
        return v.a(((int) (j4 >> 32)) * i4, ((int) (j4 & 4294967295L)) * i4);
    }

    @x4
    @fg.l
    public static String p(long j4) {
        return ((int) (j4 >> 32)) + " x " + ((int) (j4 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return g(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: q, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @x4
    @fg.l
    public String toString() {
        return p(this.packedValue);
    }
}
