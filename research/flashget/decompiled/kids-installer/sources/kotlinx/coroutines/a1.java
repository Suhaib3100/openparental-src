package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.u1;

/* compiled from: DefaultExecutor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\bA\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u001bR\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00106\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00109\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010>\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00108¨\u0006B"}, d2 = {"Lkotlinx/coroutines/a1;", "Lkotlinx/coroutines/u1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/m2;", "O1", "Ljava/lang/Thread;", "H1", "", "N1", "G1", "task", "x1", "", "now", "Lkotlinx/coroutines/u1$c;", "delayedTask", "s1", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/p1;", "b0", "run", "I1", "()V", "timeout", "P1", "", "w", "Ljava/lang/String;", "THREAD_NAME", "x", "J", "DEFAULT_KEEP_ALIVE_MS", "y", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "z", "I", "FRESH", "A", "ACTIVE", "B", "SHUTDOWN_REQ", "C", "SHUTDOWN_ACK", "D", "SHUTDOWN", "debugStatus", "K1", "()Z", "isShutDown", "L1", "isShutdownRequested", "q1", "()Ljava/lang/Thread;", "thread", "M1", "isThreadPresent", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a1 extends u1 implements Runnable {

    /* renamed from: A, reason: from kotlin metadata */
    private static final int ACTIVE = 1;

    /* renamed from: B, reason: from kotlin metadata */
    private static final int SHUTDOWN_REQ = 2;

    /* renamed from: C, reason: from kotlin metadata */
    private static final int SHUTDOWN_ACK = 3;

    /* renamed from: D, reason: from kotlin metadata */
    private static final int SHUTDOWN = 4;

    @d5.e
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    public static final a1 f27251v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final String THREAD_NAME = ProtectedSandApp.s("遆");

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final int FRESH = 0;

    static {
        Long valueOf;
        a1 a1Var = new a1();
        f27251v = a1Var;
        t1.U0(a1Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            valueOf = Long.getLong(ProtectedSandApp.s("遇"), DEFAULT_KEEP_ALIVE_MS);
        } catch (SecurityException unused) {
            valueOf = Long.valueOf(DEFAULT_KEEP_ALIVE_MS);
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(valueOf.longValue());
    }

    private a1() {
    }

    private final synchronized void G1() {
        if (L1()) {
            debugStatus = 3;
            A1();
            notifyAll();
        }
    }

    private final synchronized Thread H1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, ProtectedSandApp.s("遈"));
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void J1() {
    }

    private final boolean K1() {
        return debugStatus == 4;
    }

    private final boolean L1() {
        int i5 = debugStatus;
        return i5 == 2 || i5 == 3;
    }

    private final synchronized boolean N1() {
        if (L1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void O1() {
        throw new RejectedExecutionException(ProtectedSandApp.s("遉"));
    }

    public final synchronized void I1() {
        debugStatus = 0;
        H1();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean M1() {
        return _thread != null;
    }

    public final synchronized void P1(long j5) {
        kotlin.m2 m2Var;
        long currentTimeMillis = System.currentTimeMillis() + j5;
        if (!L1()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                b b6 = c.b();
                if (b6 != null) {
                    b6.g(thread);
                    m2Var = kotlin.m2.f23662a;
                } else {
                    m2Var = null;
                }
                if (m2Var == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            } else {
                wait(j5);
            }
        }
        debugStatus = 0;
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.e1
    @d5.d
    public p1 b0(long timeMillis, @d5.d Runnable block, @d5.d CoroutineContext context) {
        return D1(timeMillis, block);
    }

    @Override // kotlinx.coroutines.v1
    @d5.d
    /* renamed from: q1 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? H1() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.m2 m2Var;
        boolean b12;
        t3.f29007a.d(this);
        b b6 = c.b();
        if (b6 != null) {
            b6.d();
        }
        try {
            if (!N1()) {
                if (b12) {
                    return;
                } else {
                    return;
                }
            }
            long j5 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long i12 = i1();
                if (i12 == Long.MAX_VALUE) {
                    b b7 = c.b();
                    long b8 = b7 != null ? b7.b() : System.nanoTime();
                    if (j5 == Long.MAX_VALUE) {
                        j5 = KEEP_ALIVE_NANOS + b8;
                    }
                    long j6 = j5 - b8;
                    if (j6 <= 0) {
                        _thread = null;
                        G1();
                        b b9 = c.b();
                        if (b9 != null) {
                            b9.h();
                        }
                        if (b1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    if (i12 > j6) {
                        i12 = j6;
                    }
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (i12 > 0) {
                    if (L1()) {
                        _thread = null;
                        G1();
                        b b10 = c.b();
                        if (b10 != null) {
                            b10.h();
                        }
                        if (b1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    b b11 = c.b();
                    if (b11 != null) {
                        b11.c(this, i12);
                        m2Var = kotlin.m2.f23662a;
                    } else {
                        m2Var = null;
                    }
                    if (m2Var == null) {
                        LockSupport.parkNanos(this, i12);
                    }
                }
            }
        } finally {
            _thread = null;
            G1();
            b b13 = c.b();
            if (b13 != null) {
                b13.h();
            }
            if (!b1()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.v1
    protected void s1(long j5, @d5.d u1.c cVar) {
        O1();
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.t1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.u1
    public void x1(@d5.d Runnable runnable) {
        if (K1()) {
            O1();
        }
        super.x1(runnable);
    }
}
