package kotlin.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.p1;
import kotlin.q1;
import kotlin.w0;
import kotlin.w1;

/* compiled from: UProgressionUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0004\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a'\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0003\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlin/w1;", "a", "b", "c", "(III)I", "Lkotlin/a2;", "(JJJ)J", "start", "end", "", "step", "d", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r {
    private static final int a(int i4, int i5, int i6) {
        int compare;
        int a5 = p1.a(i4, i6);
        int a6 = p1.a(i5, i6);
        compare = Integer.compare(a5 ^ Integer.MIN_VALUE, a6 ^ Integer.MIN_VALUE);
        int h4 = w1.h(a5 - a6);
        return compare >= 0 ? h4 : h4 + i6;
    }

    private static final long b(long j4, long j5, long j6) {
        int compare;
        long a5 = q1.a(j4, j6);
        long a6 = q1.a(j5, j6);
        compare = Long.compare(a5 ^ Long.MIN_VALUE, a6 ^ Long.MIN_VALUE);
        long h4 = a2.h(a5 - a6);
        return compare >= 0 ? h4 : h4 + j6;
    }

    @c1(version = "1.3")
    @w0
    public static final long c(long j4, long j5, long j6) {
        int compare;
        int compare2;
        if (j6 > 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j5 : j5 - b(j5, j4, a2.h(j6));
        }
        if (j6 >= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("掝\u0001"));
        }
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare <= 0 ? j5 : j5 + b(j4, j5, a2.h(-j6));
    }

    @c1(version = "1.3")
    @w0
    public static final int d(int i4, int i5, int i6) {
        int compare;
        int compare2;
        if (i6 > 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i5 : i5 - a(i5, i4, w1.h(i6));
        }
        if (i6 >= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("掝\u0001"));
        }
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i5 : i5 + a(i4, i5, w1.h(-i6));
    }
}
