package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\b*\u001e\b\u0002\u0010\u001b\u001a\u0004\b\u0000\u0010\u0019\"\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0012\u0004\u0012\u00028\u00000\u001a¨\u0006\u001c"}, d2 = {"", "timeMillis", "d", "(J)J", "timeNanos", "c", "Lkotlinx/coroutines/internal/s0;", "a", "Lkotlinx/coroutines/internal/s0;", "DISPOSED_TASK", "", "b", "I", "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "e", "J", "MS_TO_NS", "f", "MAX_MS", "g", "MAX_DELAY_NS", "h", "CLOSED_EMPTY", "T", "Lkotlinx/coroutines/internal/a0;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class u1 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f81162b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f81163c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f81164d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final long f81165e = 1000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f81166f = 9223372036854L;

    /* renamed from: g, reason: collision with root package name */
    private static final long f81167g = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f81161a = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("褅\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f81168h = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("褆\u0001"));

    public static final long c(long j4) {
        return j4 / 1000000;
    }

    public static final long d(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j4 >= f81166f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j4;
    }
}
