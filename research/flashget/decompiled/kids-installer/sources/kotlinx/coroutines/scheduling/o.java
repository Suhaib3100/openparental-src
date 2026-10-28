package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.v0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/j;", "f", "Lkotlinx/coroutines/scheduling/j;", "schedulerTimeSource", "g", "TASK_NON_BLOCKING", "h", "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/l;", "i", "Lkotlinx/coroutines/scheduling/l;", "NonBlockingContext", "j", "BlockingContext", "Lkotlinx/coroutines/scheduling/k;", "", "(Lkotlinx/coroutines/scheduling/k;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final String f28888a = ProtectedSandApp.s("幇");

    /* renamed from: b, reason: collision with root package name */
    @p3.f
    public static final long f28889b;

    /* renamed from: c, reason: collision with root package name */
    @p3.f
    public static final int f28890c;

    /* renamed from: d, reason: collision with root package name */
    @p3.f
    public static final int f28891d;

    /* renamed from: e, reason: collision with root package name */
    @p3.f
    public static final long f28892e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @p3.f
    public static j f28893f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28894g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f28895h = 1;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f28896i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f28897j;

    static {
        long e6;
        int d6;
        int d7;
        long e7;
        e6 = v0.e(ProtectedSandApp.s("幈"), 100000L, 0L, 0L, 12, null);
        f28889b = e6;
        String s5 = ProtectedSandApp.s("幉");
        int a6 = t0.a();
        d6 = v0.d(s5, a6 < 2 ? 2 : a6, 1, 0, 8, null);
        f28890c = d6;
        d7 = v0.d(ProtectedSandApp.s("幊"), a.J, 0, a.J, 4, null);
        f28891d = d7;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e7 = v0.e(ProtectedSandApp.s("幋"), 60L, 0L, 0L, 12, null);
        f28892e = timeUnit.toNanos(e7);
        f28893f = h.f28878a;
        f28896i = new m(0);
        f28897j = new m(1);
    }

    public static final boolean a(@d5.d k kVar) {
        return kVar.taskContext.getTaskMode() == 1;
    }
}
