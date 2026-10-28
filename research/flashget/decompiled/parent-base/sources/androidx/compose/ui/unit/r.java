package androidx.compose.ui.unit;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f*\u00020\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u0003*\u00020\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "x", "y", "Landroidx/compose/ui/unit/q;", "a", "(II)J", "start", "stop", "", "fraction", "b", "(JJF)J", "Li0/f;", "h", "(J)J", "offset", "e", "(JJ)J", "c", "f", "d", "g", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,180:1\n48#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:181\n*E\n"})
/* loaded from: classes.dex */
public final class r {
    @x4
    public static final long a(int i4, int i5) {
        return q.e((i5 & 4294967295L) | (i4 << 32));
    }

    @x4
    public static final long b(long j4, long j5, float f4) {
        return a(androidx.compose.ui.util.d.b(q.m(j4), (int) (j5 >> 32), f4), androidx.compose.ui.util.d.b((int) (j4 & 4294967295L), (int) (j5 & 4294967295L), f4));
    }

    @x4
    public static final long c(long j4, long j5) {
        return i0.g.a(i0.f.p(j4) - q.m(j5), i0.f.r(j4) - ((int) (j5 & 4294967295L)));
    }

    @x4
    public static final long d(long j4, long j5) {
        return i0.g.a(q.m(j4) - i0.f.p(j5), ((int) (j4 & 4294967295L)) - i0.f.r(j5));
    }

    @x4
    public static final long e(long j4, long j5) {
        return i0.g.a(i0.f.p(j4) + q.m(j5), i0.f.r(j4) + ((int) (j5 & 4294967295L)));
    }

    @x4
    public static final long f(long j4, long j5) {
        return i0.g.a(i0.f.p(j5) + q.m(j4), i0.f.r(j5) + ((int) (j4 & 4294967295L)));
    }

    @x4
    public static final long g(long j4) {
        return a(kotlin.math.b.L0(i0.f.p(j4)), kotlin.math.b.L0(i0.f.r(j4)));
    }

    @x4
    public static final long h(long j4) {
        return i0.g.a(q.m(j4), (int) (j4 & 4294967295L));
    }
}
