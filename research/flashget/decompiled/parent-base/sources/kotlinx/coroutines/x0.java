package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.r1;

/* compiled from: DefaultExecutor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\u0005J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001e\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u0005R\u0014\u00104\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00108\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00109\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u0010;\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00103R\u0016\u0010<\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010>\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\rR\u0014\u0010@\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\rR\u0014\u0010B\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\nR\u0014\u0010D\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\r¨\u0006E"}, d2 = {"Lkotlinx/coroutines/x0;", "Lkotlinx/coroutines/r1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Lkotlin/k2;", "V2", "Ljava/lang/Thread;", "G2", "()Ljava/lang/Thread;", "", "T2", "()Z", "D2", "task", "g2", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/r1$c;", "delayedTask", "W1", "(JLkotlinx/coroutines/r1$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "run", "H2", "timeout", "W2", "(J)V", "", "k", "Ljava/lang/String;", "THREAD_NAME", "l", "J", "DEFAULT_KEEP_ALIVE_MS", "m", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "I2", "", "n", "I", "FRESH", "o", "ACTIVE", "p", "SHUTDOWN_REQ", "SHUTDOWN_ACK", "r", "SHUTDOWN", "debugStatus", "M2", "isShutDown", "N2", "isShutdownRequested", "T1", "thread", "R2", "isThreadPresent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes7.dex */
public final class x0 extends r1 implements Runnable {

    @fg.m
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    public static final x0 f81189j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String THREAD_NAME = ProtectedSandApp.s("褚\u0001");

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final int FRESH = 0;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final int ACTIVE = 1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN_REQ = 2;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN_ACK = 3;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN = 4;

    static {
        Long l4;
        x0 x0Var = new x0();
        f81189j = x0Var;
        q1.B1(x0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong(ProtectedSandApp.s("褛\u0001"), 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l4.longValue());
    }

    private x0() {
    }

    private final synchronized void D2() {
        if (N2()) {
            debugStatus = 3;
            o2();
            kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("褜\u0001"));
            notifyAll();
        }
    }

    private final synchronized Thread G2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, ProtectedSandApp.s("褚\u0001"));
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void I2() {
    }

    private final boolean M2() {
        return debugStatus == 4;
    }

    private final boolean N2() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    private final synchronized boolean T2() {
        if (N2()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("褜\u0001"));
        notifyAll();
        return true;
    }

    private final void V2() {
        throw new RejectedExecutionException(ProtectedSandApp.s("褝\u0001"));
    }

    public final synchronized void H2() {
        debugStatus = 0;
        G2();
        while (debugStatus == 0) {
            kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("褜\u0001"));
            wait();
        }
    }

    public final boolean R2() {
        return _thread != null;
    }

    @Override // kotlinx.coroutines.s1
    @fg.l
    /* renamed from: T1 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? G2() : thread;
    }

    @Override // kotlinx.coroutines.s1
    protected void W1(long now, @fg.l r1.c delayedTask) {
        V2();
    }

    public final synchronized void W2(long timeout) {
        kotlin.k2 k2Var;
        try {
            long currentTimeMillis = System.currentTimeMillis() + timeout;
            if (!N2()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    b b5 = c.b();
                    if (b5 != null) {
                        b5.g(thread);
                        k2Var = kotlin.k2.f75408a;
                    } else {
                        k2Var = null;
                    }
                    if (k2Var == null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("褜\u0001"));
                wait(timeout);
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // kotlinx.coroutines.r1
    public void g2(@fg.l Runnable task) {
        if (M2()) {
            V2();
        }
        super.g2(task);
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.b1
    @fg.l
    public m1 q(long timeMillis, @fg.l Runnable block, @fg.l kotlin.coroutines.g context) {
        return x2(timeMillis, block);
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.k2 k2Var;
        n3.f80870a.d(this);
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            if (!T2()) {
                _thread = null;
                D2();
                b b6 = c.b();
                if (b6 != null) {
                    b6.h();
                }
                if (D1()) {
                    return;
                }
                getThread();
                return;
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long L1 = L1();
                if (L1 == Long.MAX_VALUE) {
                    b b7 = c.b();
                    long b10 = b7 != null ? b7.b() : System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = KEEP_ALIVE_NANOS + b10;
                    }
                    long j5 = j4 - b10;
                    if (j5 <= 0) {
                        _thread = null;
                        D2();
                        b b11 = c.b();
                        if (b11 != null) {
                            b11.h();
                        }
                        if (D1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    L1 = kotlin.ranges.s.C(L1, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (L1 > 0) {
                    if (N2()) {
                        _thread = null;
                        D2();
                        b b12 = c.b();
                        if (b12 != null) {
                            b12.h();
                        }
                        if (D1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    b b13 = c.b();
                    if (b13 != null) {
                        b13.c(this, L1);
                        k2Var = kotlin.k2.f75408a;
                    } else {
                        k2Var = null;
                    }
                    if (k2Var == null) {
                        LockSupport.parkNanos(this, L1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            D2();
            b b14 = c.b();
            if (b14 != null) {
                b14.h();
            }
            if (!D1()) {
                getThread();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.q1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
