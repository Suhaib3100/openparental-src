package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: UnsignedUtils.kt */
@p3.i(name = "UnsignedKt")
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p2 {
    @PublishedApi
    public static final int a(double d6) {
        if (Double.isNaN(d6) || d6 <= f(0)) {
            return 0;
        }
        if (d6 >= f(-1)) {
            return -1;
        }
        return d6 <= 2.147483647E9d ? UInt.r((int) d6) : UInt.r((int) (d6 - Integer.MAX_VALUE)) + Integer.MAX_VALUE;
    }

    @PublishedApi
    public static final long b(double d6) {
        if (Double.isNaN(d6) || d6 <= j(0L)) {
            return 0L;
        }
        if (d6 >= j(-1L)) {
            return -1L;
        }
        return d6 < 9.223372036854776E18d ? ULong.r((long) d6) : ULong.r((long) (d6 - 9.223372036854776E18d)) - Long.MIN_VALUE;
    }

    @PublishedApi
    public static final int c(int i5, int i6) {
        return kotlin.jvm.internal.l0.t(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    public static final int d(int i5, int i6) {
        return UInt.r((int) ((i5 & 4294967295L) / (i6 & 4294967295L)));
    }

    @PublishedApi
    public static final int e(int i5, int i6) {
        return UInt.r((int) ((i5 & 4294967295L) % (i6 & 4294967295L)));
    }

    @PublishedApi
    public static final double f(int i5) {
        return (((i5 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i5);
    }

    @PublishedApi
    public static final int g(long j5, long j6) {
        return kotlin.jvm.internal.l0.u(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    public static final long h(long j5, long j6) {
        int compare;
        int compare2;
        if (j6 < 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            return compare2 < 0 ? ULong.r(0L) : ULong.r(1L);
        }
        if (j5 >= 0) {
            return ULong.r(j5 / j6);
        }
        long j7 = ((j5 >>> 1) / j6) << 1;
        compare = Long.compare(ULong.r(j5 - (j7 * j6)) ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return j7 + (compare < 0 ? 0 : 1);
    }

    @PublishedApi
    public static final long i(long j5, long j6) {
        int compare;
        int compare2;
        if (j6 < 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            return compare2 < 0 ? j5 : ULong.r(j5 - j6);
        }
        if (j5 >= 0) {
            return ULong.r(j5 % j6);
        }
        long j7 = j5 - ((((j5 >>> 1) / j6) << 1) * j6);
        compare = Long.compare(ULong.r(j7) ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        if (compare < 0) {
            j6 = 0;
        }
        return j7 - j6;
    }

    @PublishedApi
    public static final double j(long j5) {
        return ((j5 >>> 11) * 2048) + (j5 & 2047);
    }

    @d5.d
    public static final String k(long j5) {
        return l(j5, 10);
    }

    @d5.d
    public static final String l(long j5, int i5) {
        int a6;
        int a7;
        int a8;
        String s5 = ProtectedSandApp.s("䆱");
        if (j5 >= 0) {
            a8 = kotlin.text.d.a(i5);
            String l5 = Long.toString(j5, a8);
            kotlin.jvm.internal.l0.o(l5, s5);
            return l5;
        }
        long j6 = i5;
        long j7 = ((j5 >>> 1) / j6) << 1;
        long j8 = j5 - (j7 * j6);
        if (j8 >= j6) {
            j8 -= j6;
            j7++;
        }
        StringBuilder sb = new StringBuilder();
        a6 = kotlin.text.d.a(i5);
        String l6 = Long.toString(j7, a6);
        kotlin.jvm.internal.l0.o(l6, s5);
        sb.append(l6);
        a7 = kotlin.text.d.a(i5);
        String l7 = Long.toString(j8, a7);
        kotlin.jvm.internal.l0.o(l7, s5);
        sb.append(l7);
        return sb.toString();
    }
}
