package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: UnsignedUtils.kt */
@kd.i(name = "UnsignedKt")
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u0004\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "v1", "v2", "c", "(II)I", "", "g", "(JJ)I", "Lkotlin/w1;", "d", "e", "Lkotlin/a2;", "h", "(JJ)J", "i", "", "v", "a", "(D)I", "b", "(D)J", "f", "(I)D", "j", "(J)D", "", "k", "(J)Ljava/lang/String;", "base", "l", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n2 {
    @w0
    public static final int a(double d5) {
        if (Double.isNaN(d5) || d5 <= f(0)) {
            return 0;
        }
        if (d5 >= f(-1)) {
            return -1;
        }
        return d5 <= 2.147483647E9d ? w1.h((int) d5) : w1.h((int) (d5 - Integer.MAX_VALUE)) + Integer.MAX_VALUE;
    }

    @w0
    public static final long b(double d5) {
        if (Double.isNaN(d5) || d5 <= j(0L)) {
            return 0L;
        }
        if (d5 >= j(-1L)) {
            return -1L;
        }
        return d5 < 9.223372036854776E18d ? a2.h((long) d5) : a2.h((long) (d5 - 9.223372036854776E18d)) - Long.MIN_VALUE;
    }

    @w0
    public static final int c(int i4, int i5) {
        return kotlin.jvm.internal.l0.t(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    @w0
    public static final int d(int i4, int i5) {
        return w1.h((int) ((i4 & 4294967295L) / (i5 & 4294967295L)));
    }

    @w0
    public static final int e(int i4, int i5) {
        return w1.h((int) ((i4 & 4294967295L) % (i5 & 4294967295L)));
    }

    @w0
    public static final double f(int i4) {
        return (((i4 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i4);
    }

    @w0
    public static final int g(long j4, long j5) {
        return kotlin.jvm.internal.l0.u(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    @w0
    public static final long h(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 < 0 ? a2.h(0L) : a2.h(1L);
        }
        if (j4 >= 0) {
            return a2.h(j4 / j5);
        }
        long j6 = ((j4 >>> 1) / j5) << 1;
        compare = Long.compare(a2.h(j4 - (j6 * j5)) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return j6 + (compare < 0 ? 0 : 1);
    }

    @w0
    public static final long i(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 < 0 ? j4 : a2.h(j4 - j5);
        }
        if (j4 >= 0) {
            return a2.h(j4 % j5);
        }
        long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
        compare = Long.compare(a2.h(j6) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare < 0) {
            j5 = 0;
        }
        return j6 - j5;
    }

    @w0
    public static final double j(long j4) {
        return ((j4 >>> 11) * 2048) + (j4 & 2047);
    }

    @fg.l
    public static final String k(long j4) {
        return l(j4, 10);
    }

    @fg.l
    public static final String l(long j4, int i4) {
        String s4 = ProtectedSandApp.s("斄\u0001");
        if (j4 >= 0) {
            String l4 = Long.toString(j4, kotlin.text.c.a(i4));
            kotlin.jvm.internal.l0.o(l4, s4);
            return l4;
        }
        long j5 = i4;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        String l5 = Long.toString(j6, kotlin.text.c.a(i4));
        kotlin.jvm.internal.l0.o(l5, s4);
        sb.append(l5);
        String l6 = Long.toString(j7, kotlin.text.c.a(i4));
        kotlin.jvm.internal.l0.o(l6, s4);
        sb.append(l6);
        return sb.toString();
    }
}
