package kotlin.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.o1;
import kotlin.r1;

/* compiled from: UProgressionUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r {
    private static final int a(int i5, int i6, int i7) {
        int compare;
        int a6 = o1.a(i5, i7);
        int a7 = o1.a(i6, i7);
        compare = Integer.compare(a6 ^ Integer.MIN_VALUE, a7 ^ Integer.MIN_VALUE);
        int r5 = UInt.r(a6 - a7);
        return compare >= 0 ? r5 : r5 + i7;
    }

    private static final long b(long j5, long j6, long j7) {
        int compare;
        long a6 = r1.a(j5, j7);
        long a7 = r1.a(j6, j7);
        compare = Long.compare(a6 ^ Long.MIN_VALUE, a7 ^ Long.MIN_VALUE);
        long r5 = ULong.r(a6 - a7);
        return compare >= 0 ? r5 : r5 + j7;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final long c(long j5, long j6, long j7) {
        int compare;
        int compare2;
        if (j7 > 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j6 : j6 - b(j6, j5, ULong.r(j7));
        }
        if (j7 >= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㽞"));
        }
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare <= 0 ? j6 : j6 + b(j5, j6, ULong.r(-j7));
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final int d(int i5, int i6, int i7) {
        int compare;
        int compare2;
        if (i7 > 0) {
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i6 : i6 - a(i6, i5, UInt.r(i7));
        }
        if (i7 >= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㽟"));
        }
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i6 : i6 + a(i5, i6, UInt.r(-i7));
    }
}
