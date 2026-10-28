package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.internal.x0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/j;", "f", "Lkotlinx/coroutines/scheduling/j;", "schedulerTimeSource", "g", "TASK_NON_BLOCKING", "h", "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/l;", "i", "Lkotlinx/coroutines/scheduling/l;", "NonBlockingContext", "j", "BlockingContext", "Lkotlinx/coroutines/scheduling/k;", "", "(Lkotlinx/coroutines/scheduling/k;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final String f81005a = v0.e(ProtectedSandApp.s("袢\u0001"), ProtectedSandApp.s("袣\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @kd.f
    public static final long f81006b;

    /* renamed from: c, reason: collision with root package name */
    @kd.f
    public static final int f81007c;

    /* renamed from: d, reason: collision with root package name */
    @kd.f
    public static final int f81008d;

    /* renamed from: e, reason: collision with root package name */
    @kd.f
    public static final long f81009e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static j f81010f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81011g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81012h = 1;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f81013i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f81014j;

    static {
        long f4;
        int e4;
        int e5;
        long f5;
        f4 = x0.f(ProtectedSandApp.s("袤\u0001"), 100000L, 0L, 0L, 12, null);
        f81006b = f4;
        int a5 = v0.a();
        e4 = x0.e(ProtectedSandApp.s("袥\u0001"), a5 < 2 ? 2 : a5, 1, 0, 8, null);
        f81007c = e4;
        e5 = x0.e(ProtectedSandApp.s("袦\u0001"), a.f80960w, 0, a.f80960w, 4, null);
        f81008d = e5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5 = x0.f(ProtectedSandApp.s("袧\u0001"), 60L, 0L, 0L, 12, null);
        f81009e = timeUnit.toNanos(f5);
        f81010f = h.f80995a;
        f81013i = new m(0);
        f81014j = new m(1);
    }

    public static final boolean a(@fg.l k kVar) {
        return kVar.taskContext.getTaskMode() == 1;
    }
}
