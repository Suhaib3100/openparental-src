package kotlinx.coroutines.scheduling;

import android.content.preferences.protobuf.v;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.random.Random;
import kotlinx.coroutines.internal.m0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.z0;

/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0003\u0006\u0013%B+\u0012\u0006\u0010I\u001a\u00020\f\u0012\u0006\u0010K\u001a\u00020\f\u0012\b\b\u0002\u0010N\u001a\u00020\u000f\u0012\b\b\u0002\u0010Q\u001a\u00020B¢\u0006\u0004\b_\u0010`J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001e\u0010[\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000X8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0015\u0010\\\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0015R\u0015\u0010]\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0015R\u0011\u0010^\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b^\u0010\u001d¨\u0006b"}, d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/k;", "task", "", "a", "(Lkotlinx/coroutines/scheduling/k;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "D", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", "", "B", "(Lkotlinx/coroutines/scheduling/a$c;)I", "", "state", "g", "(J)I", "c", "z", "()I", "m", "w", "()J", "Lkotlin/m2;", "k", "()V", "Z", "()Z", "H", "skipUnpark", "R", "(Z)V", "b0", "(J)Z", "e0", "d", "tailDispatch", "X", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "j", "oldIndex", "newIndex", "G", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "F", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "b", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "P", "(J)V", "block", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "n", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "e", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;)Lkotlinx/coroutines/scheduling/k;", "U", "", "toString", "()Ljava/lang/String;", "O", "(Lkotlinx/coroutines/scheduling/k;)V", "o", "I", "corePoolSize", "p", "maxPoolSize", "q", "J", "idleWorkerKeepAliveNs", "r", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/f;", "s", "Lkotlinx/coroutines/scheduling/f;", "globalCpuQueue", "t", "globalBlockingQueue", "Lkotlinx/coroutines/internal/m0;", "u", "Lkotlinx/coroutines/internal/m0;", "workers", "createdWorkers", "availableCpuPermits", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "v", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class a implements Executor, Closeable {
    private static final int A = -1;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 21;
    private static final long E = 2097151;
    private static final long F = 4398044413952L;
    private static final int G = 42;
    private static final long H = 9223367638808264704L;
    public static final int I = 1;
    public static final int J = 2097150;
    private static final long K = 2097151;
    private static final long L = -2097152;
    private static final long M = 2097152;

    @d5.d
    private volatile /* synthetic */ int _isTerminated;

    @d5.d
    volatile /* synthetic */ long controlState;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int corePoolSize;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int maxPoolSize;

    @d5.d
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final long idleWorkerKeepAliveNs;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final String schedulerName;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final f globalCpuQueue;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final f globalBlockingQueue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final m0<c> workers;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f28847z = new r0(ProtectedSandApp.s("帨"));

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f28844w = AtomicLongFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("帩"));

    /* renamed from: x, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f28845x = AtomicLongFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("帪"));

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28846y = AtomicIntegerFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("師"));

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28855a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f28855a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i5, int i6, long j5, @d5.d String str) {
        this.corePoolSize = i5;
        this.maxPoolSize = i6;
        this.idleWorkerKeepAliveNs = j5;
        this.schedulerName = str;
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("帱"), i5, ProtectedSandApp.s("帲")).toString());
        }
        boolean z5 = i6 >= i5;
        String s5 = ProtectedSandApp.s("帬");
        if (!z5) {
            throw new IllegalArgumentException(v.a(s5, i6, ProtectedSandApp.s("帰"), i5).toString());
        }
        if (!(i6 <= 2097150)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(s5, i6, ProtectedSandApp.s("帯")).toString());
        }
        if (!(j5 > 0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("席") + j5 + ProtectedSandApp.s("帮")).toString());
        }
        this.globalCpuQueue = new f();
        this.globalBlockingQueue = new f();
        this.parkedWorkersStack = 0L;
        this.workers = new m0<>(i5 + 1);
        this.controlState = i5 << 42;
        this._isTerminated = 0;
    }

    private final int B(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f28847z) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    private final c D() {
        while (true) {
            long j5 = this.parkedWorkersStack;
            c b6 = this.workers.b((int) (2097151 & j5));
            if (b6 == null) {
                return null;
            }
            long j6 = (M + j5) & L;
            int B2 = B(b6);
            if (B2 >= 0 && f28844w.compareAndSet(this, j5, B2 | j6)) {
                b6.q(f28847z);
                return b6;
            }
        }
    }

    private final long H() {
        return f28845x.addAndGet(this, 4398046511104L);
    }

    private final void R(boolean skipUnpark) {
        long addAndGet = f28845x.addAndGet(this, M);
        if (skipUnpark || e0() || b0(addAndGet)) {
            return;
        }
        e0();
    }

    private final k X(c cVar, k kVar, boolean z5) {
        if (cVar == null) {
            return kVar;
        }
        if (cVar.state == d.TERMINATED) {
            return kVar;
        }
        if (kVar.taskContext.getTaskMode() == 0 && cVar.state == d.BLOCKING) {
            return kVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(kVar, z5);
    }

    private final boolean Z() {
        long j5;
        do {
            j5 = this.controlState;
            if (((int) ((H & j5) >> 42)) == 0) {
                return false;
            }
        } while (!f28845x.compareAndSet(this, j5, j5 - 4398046511104L));
        return true;
    }

    private final boolean a(k task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final boolean b0(long state) {
        int i5 = ((int) (2097151 & state)) - ((int) ((state & F) >> 21));
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 < this.corePoolSize) {
            int d6 = d();
            if (d6 == 1 && this.corePoolSize > 1) {
                d();
            }
            if (d6 > 0) {
                return true;
            }
        }
        return false;
    }

    private final int c(long state) {
        return (int) ((state & F) >> 21);
    }

    private final int d() {
        synchronized (this.workers) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j5 = this.controlState;
            int i5 = (int) (j5 & 2097151);
            int i6 = i5 - ((int) ((j5 & F) >> 21));
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 >= this.corePoolSize) {
                return 0;
            }
            if (i5 >= this.maxPoolSize) {
                return 0;
            }
            int i7 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i7 > 0 && this.workers.b(i7) == null)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("帵").toString());
            }
            c cVar = new c(this, i7);
            this.workers.c(i7, cVar);
            if (!(i7 == ((int) (2097151 & f28845x.incrementAndGet(this))))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("帴").toString());
            }
            cVar.start();
            return i6 + 1;
        }
    }

    static /* synthetic */ boolean d0(a aVar, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = aVar.controlState;
        }
        return aVar.b0(j5);
    }

    private final boolean e0() {
        c D2;
        do {
            D2 = D();
            if (D2 == null) {
                return false;
            }
        } while (!c.f28856v.compareAndSet(D2, -1, 0));
        LockSupport.unpark(D2);
        return true;
    }

    private final int g(long state) {
        return (int) (state & 2097151);
    }

    private final c j() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void k() {
        f28845x.addAndGet(this, L);
    }

    private final int m() {
        return (int) (f28845x.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void o(a aVar, Runnable runnable, l lVar, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = o.f28896i;
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        aVar.n(runnable, lVar, z5);
    }

    private final int r() {
        return (int) ((this.controlState & H) >> 42);
    }

    private final int t() {
        return (int) (this.controlState & 2097151);
    }

    private final long w() {
        return f28845x.addAndGet(this, M);
    }

    private final int z() {
        return (int) (f28845x.incrementAndGet(this) & 2097151);
    }

    public final boolean F(@d5.d c worker) {
        long j5;
        long j6;
        int indexInArray;
        if (worker.getNextParkedWorker() != f28847z) {
            return false;
        }
        do {
            j5 = this.parkedWorkersStack;
            j6 = (M + j5) & L;
            indexInArray = worker.getIndexInArray();
            worker.q(this.workers.b((int) (2097151 & j5)));
        } while (!f28844w.compareAndSet(this, j5, j6 | indexInArray));
        return true;
    }

    public final void G(@d5.d c worker, int oldIndex, int newIndex) {
        while (true) {
            long j5 = this.parkedWorkersStack;
            int i5 = (int) (2097151 & j5);
            long j6 = (M + j5) & L;
            if (i5 == oldIndex) {
                i5 = newIndex == 0 ? B(worker) : newIndex;
            }
            if (i5 >= 0 && f28844w.compareAndSet(this, j5, j6 | i5)) {
                return;
            }
        }
    }

    public final void O(@d5.d k task) {
        try {
            task.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
                if (b6 == null) {
                }
            } finally {
                kotlinx.coroutines.b b7 = kotlinx.coroutines.c.b();
                if (b7 != null) {
                    b7.f();
                }
            }
        }
    }

    public final void P(long timeout) {
        int i5;
        k g5;
        if (f28846y.compareAndSet(this, 0, 1)) {
            c j5 = j();
            synchronized (this.workers) {
                i5 = (int) (this.controlState & 2097151);
            }
            if (1 <= i5) {
                int i6 = 1;
                while (true) {
                    c b6 = this.workers.b(i6);
                    l0.m(b6);
                    c cVar = b6;
                    if (cVar != j5) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.g(this.globalBlockingQueue);
                    }
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (j5 != null) {
                    g5 = j5.f(true);
                    if (g5 != null) {
                        continue;
                        O(g5);
                    }
                }
                g5 = this.globalCpuQueue.g();
                if (g5 == null && (g5 = this.globalBlockingQueue.g()) == null) {
                    break;
                }
                O(g5);
            }
            if (j5 != null) {
                j5.t(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void U() {
        if (e0() || d0(this, 0L, 1, null)) {
            return;
        }
        e0();
    }

    public final int b(long state) {
        return (int) ((state & H) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        P(10000L);
    }

    @d5.d
    public final k e(@d5.d Runnable block, @d5.d l taskContext) {
        long a6 = o.f28893f.a();
        if (!(block instanceof k)) {
            return new n(block, a6, taskContext);
        }
        k kVar = (k) block;
        kVar.submissionTime = a6;
        kVar.taskContext = taskContext;
        return kVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@d5.d Runnable command) {
        o(this, command, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void n(@d5.d Runnable block, @d5.d l taskContext, boolean tailDispatch) {
        kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
        if (b6 != null) {
            b6.e();
        }
        k e6 = e(block, taskContext);
        c j5 = j();
        k X = X(j5, e6, tailDispatch);
        if (X != null && !a(X)) {
            throw new RejectedExecutionException(androidx.concurrent.futures.a.a(new StringBuilder(), this.schedulerName, ProtectedSandApp.s("帶")));
        }
        boolean z5 = tailDispatch && j5 != null;
        if (e6.taskContext.getTaskMode() != 0) {
            R(z5);
        } else {
            if (z5) {
                return;
            }
            U();
        }
    }

    @d5.d
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a6 = this.workers.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a6; i10++) {
            c b6 = this.workers.b(i10);
            if (b6 != null) {
                int f6 = b6.localQueue.f();
                int i11 = b.f28855a[b6.state.ordinal()];
                if (i11 == 1) {
                    i7++;
                } else if (i11 == 2) {
                    i6++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f6);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i11 == 3) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f6);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i11 == 4) {
                    i8++;
                    if (f6 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f6);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i11 == 5) {
                    i9++;
                }
            }
        }
        long j5 = this.controlState;
        return this.schedulerName + '@' + z0.b(this) + ProtectedSandApp.s("帷") + this.corePoolSize + ProtectedSandApp.s("常") + this.maxPoolSize + ProtectedSandApp.s("帹") + i5 + ProtectedSandApp.s("帺") + i6 + ProtectedSandApp.s("帻") + i7 + ProtectedSandApp.s("帼") + i8 + ProtectedSandApp.s("帽") + i9 + ProtectedSandApp.s("帾") + arrayList + ProtectedSandApp.s("帿") + this.globalCpuQueue.c() + ProtectedSandApp.s("幀") + this.globalBlockingQueue.c() + ProtectedSandApp.s("幁") + ((int) (2097151 & j5)) + ProtectedSandApp.s("幂") + ((int) ((F & j5) >> 21)) + ProtectedSandApp.s("幃") + (this.corePoolSize - ((int) ((H & j5) >> 42))) + ProtectedSandApp.s("幄");
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bD\u0010FJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b3\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010>R\u0012\u0010C\u001a\u00020@8Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "", "r", "()Z", "Lkotlin/m2;", "o", "()V", "s", "k", "Lkotlinx/coroutines/scheduling/k;", "task", "d", "(Lkotlinx/coroutines/scheduling/k;)V", "", "taskMode", "c", "(I)V", "b", "m", "v", "mode", "j", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/k;", "n", "()Lkotlinx/coroutines/scheduling/k;", "blockingOnly", "u", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "t", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "upperBound", "l", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "p", "Lkotlinx/coroutines/scheduling/q;", "Lkotlinx/coroutines/scheduling/q;", "localQueue", "Lkotlinx/coroutines/scheduling/a$d;", "state", "", "q", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "Lkotlinx/coroutines/scheduling/a;", "i", "()Lkotlinx/coroutines/scheduling/a;", "scheduler", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class c extends Thread {

        /* renamed from: v, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f28856v = AtomicIntegerFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("帠"));
        private volatile int indexInArray;

        @d5.e
        private volatile Object nextParkedWorker;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final q localQueue;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public d state;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public boolean mayHaveLocalTasks;

        @d5.d
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.localQueue = new q();
            this.state = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f28847z;
            this.rngState = Random.f23691o.l();
        }

        private final void b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            a.f28845x.addAndGet(a.this, a.L);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        private final void c(int taskMode) {
            if (taskMode != 0 && t(d.BLOCKING)) {
                a.this.U();
            }
        }

        private final void d(k task) {
            int taskMode = task.taskContext.getTaskMode();
            j(taskMode);
            c(taskMode);
            a.this.O(task);
            b(taskMode);
        }

        private final k e(boolean scanLocalQueue) {
            k n5;
            k n6;
            if (scanLocalQueue) {
                boolean z5 = l(a.this.corePoolSize * 2) == 0;
                if (z5 && (n6 = n()) != null) {
                    return n6;
                }
                k h5 = this.localQueue.h();
                if (h5 != null) {
                    return h5;
                }
                if (!z5 && (n5 = n()) != null) {
                    return n5;
                }
            } else {
                k n7 = n();
                if (n7 != null) {
                    return n7;
                }
            }
            return u(false);
        }

        private final void j(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
        }

        private final boolean k() {
            return this.nextParkedWorker != a.f28847z;
        }

        private final void m() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                v();
            }
        }

        private final k n() {
            if (l(2) == 0) {
                k g5 = a.this.globalCpuQueue.g();
                return g5 != null ? g5 : a.this.globalBlockingQueue.g();
            }
            k g6 = a.this.globalBlockingQueue.g();
            return g6 != null ? g6 : a.this.globalCpuQueue.g();
        }

        private final void o() {
            loop0: while (true) {
                boolean z5 = false;
                while (!a.this.isTerminated() && this.state != d.TERMINATED) {
                    k f6 = f(this.mayHaveLocalTasks);
                    if (f6 != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        d(f6);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            s();
                        } else if (z5) {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z5 = true;
                        }
                    }
                }
            }
            t(d.TERMINATED);
        }

        private final boolean r() {
            boolean z5;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            while (true) {
                long j5 = aVar.controlState;
                if (((int) ((a.H & j5) >> 42)) == 0) {
                    z5 = false;
                    break;
                }
                if (a.f28845x.compareAndSet(aVar, j5, j5 - 4398046511104L)) {
                    z5 = true;
                    break;
                }
            }
            if (!z5) {
                return false;
            }
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        private final void s() {
            if (!k()) {
                a.this.F(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !a.this.isTerminated() && this.state != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                m();
            }
        }

        private final k u(boolean blockingOnly) {
            int i5 = (int) (a.this.controlState & 2097151);
            if (i5 < 2) {
                return null;
            }
            int l5 = l(i5);
            a aVar = a.this;
            long j5 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < i5; i6++) {
                l5++;
                if (l5 > i5) {
                    l5 = 1;
                }
                c b6 = aVar.workers.b(l5);
                if (b6 != null && b6 != this) {
                    long k5 = blockingOnly ? this.localQueue.k(b6.localQueue) : this.localQueue.l(b6.localQueue);
                    if (k5 == -1) {
                        return this.localQueue.h();
                    }
                    if (k5 > 0) {
                        j5 = Math.min(j5, k5);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.minDelayUntilStealableTaskNs = j5;
            return null;
        }

        private final void v() {
            a aVar = a.this;
            synchronized (aVar.workers) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.corePoolSize) {
                    return;
                }
                if (f28856v.compareAndSet(this, -1, 1)) {
                    int i5 = this.indexInArray;
                    p(0);
                    aVar.G(this, i5, 0);
                    int andDecrement = (int) (a.f28845x.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i5) {
                        c b6 = aVar.workers.b(andDecrement);
                        l0.m(b6);
                        c cVar = b6;
                        aVar.workers.c(i5, cVar);
                        cVar.p(i5);
                        aVar.G(cVar, andDecrement, i5);
                    }
                    aVar.workers.c(andDecrement, null);
                    m2 m2Var = m2.f23662a;
                    this.state = d.TERMINATED;
                }
            }
        }

        @d5.e
        public final k f(boolean scanLocalQueue) {
            k g5;
            if (r()) {
                return e(scanLocalQueue);
            }
            if (scanLocalQueue) {
                g5 = this.localQueue.h();
                if (g5 == null) {
                    g5 = a.this.globalBlockingQueue.g();
                }
            } else {
                g5 = a.this.globalBlockingQueue.g();
            }
            return g5 == null ? u(true) : g5;
        }

        /* renamed from: g, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @d5.e
        /* renamed from: h, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @d5.d
        /* renamed from: i, reason: from getter */
        public final a getF28863u() {
            return a.this;
        }

        public final int l(int upperBound) {
            int i5 = this.rngState;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.rngState = i8;
            int i9 = upperBound - 1;
            return (i9 & upperBound) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % upperBound;
        }

        public final void p(int i5) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.schedulerName);
            sb.append(ProtectedSandApp.s("帡"));
            sb.append(i5 == 0 ? ProtectedSandApp.s("帢") : String.valueOf(i5));
            setName(sb.toString());
            this.indexInArray = i5;
        }

        public final void q(@d5.e Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final boolean t(@d5.d d newState) {
            d dVar = this.state;
            boolean z5 = dVar == d.CPU_ACQUIRED;
            if (z5) {
                a.f28845x.addAndGet(a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z5;
        }

        public c(a aVar, int i5) {
            this();
            p(i5);
        }
    }

    public /* synthetic */ a(int i5, int i6, long j5, String str, int i7, w wVar) {
        this(i5, i6, (i7 & 4) != 0 ? o.f28892e : j5, (i7 & 8) != 0 ? ProtectedSandApp.s("帳") : str);
    }
}
