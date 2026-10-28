package kotlin.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: progressionUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\t\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\n\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"", "a", "b", "e", "(II)I", "", "f", "(JJ)J", "c", "(III)I", "(JJJ)J", "start", "end", "step", "d", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n {
    private static final int a(int i4, int i5, int i6) {
        return e(e(i4, i6) - e(i5, i6), i6);
    }

    private static final long b(long j4, long j5, long j6) {
        return f(f(j4, j6) - f(j5, j6), j6);
    }

    @w0
    public static final int c(int i4, int i5, int i6) {
        if (i6 > 0) {
            return i4 >= i5 ? i5 : i5 - a(i5, i4, i6);
        }
        if (i6 < 0) {
            return i4 <= i5 ? i5 : i5 + a(i4, i5, -i6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("掙\u0001"));
    }

    @w0
    public static final long d(long j4, long j5, long j6) {
        if (j6 > 0) {
            return j4 >= j5 ? j5 : j5 - b(j5, j4, j6);
        }
        if (j6 < 0) {
            return j4 <= j5 ? j5 : j5 + b(j4, j5, -j6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("掙\u0001"));
    }

    private static final int e(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 >= 0 ? i6 : i6 + i5;
    }

    private static final long f(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 >= 0 ? j6 : j6 + j5;
    }
}
