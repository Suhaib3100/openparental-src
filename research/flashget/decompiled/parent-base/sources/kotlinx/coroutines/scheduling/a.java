package kotlinx.coroutines.scheduling;

import androidx.collection.r2;
import androidx.compose.ui.input.pointer.s;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kd.x;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.w0;

/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003a8\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0082\b¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b%\u0010\u001fJ\u001f\u0010(\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u001cJ+\u0010/\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\u0013J)\u00104\u001a\u00020 2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b8\u0010\u0019J\u001b\u0010<\u001a\u00020 2\n\u0010;\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020 H\u0016¢\u0006\u0004\b>\u0010\"J\u0015\u0010@\u001a\u00020 2\u0006\u0010?\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ-\u0010E\u001a\u00020 2\n\u0010B\u001a\u000609j\u0002`:2\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010.\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\f2\n\u0010B\u001a\u000609j\u0002`:2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020 ¢\u0006\u0004\bI\u0010\"J\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010OR\u0014\u0010R\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010QR\u0014\u0010S\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u001e\u0010V\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000T8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010UR\u0015\u0010X\u001a\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u001cR\u0015\u0010Z\u001a\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u001cR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b[\u0010$R\u000b\u0010]\u001a\u00020\\8\u0002X\u0082\u0004R\u000b\u0010_\u001a\u00020^8\u0002X\u0082\u0004R\u000b\u0010`\u001a\u00020^8\u0002X\u0082\u0004¨\u0006b"}, d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/k;", "task", "", "b", "(Lkotlinx/coroutines/scheduling/k;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "x", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", "u", "(Lkotlinx/coroutines/scheduling/a$c;)I", "state", "g", "(J)I", "d", "s", "()I", "k", "q", "()J", "Lkotlin/k2;", "i", "()V", "H", "()Z", "B", "stateSnapshot", "skipUnpark", "E", "(JZ)V", "I", "(J)Z", "K", "e", "tailDispatch", "G", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "h", "oldIndex", "newIndex", "z", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "y", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "D", "(J)V", "block", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "l", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "f", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;)Lkotlinx/coroutines/scheduling/k;", "F", "toString", "()Ljava/lang/String;", "C", "(Lkotlinx/coroutines/scheduling/k;)V", "J", "Ljava/lang/String;", "Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/scheduling/f;", "globalCpuQueue", "globalBlockingQueue", "Lkotlinx/coroutines/internal/n0;", "Lkotlinx/coroutines/internal/n0;", "workers", "o", "createdWorkers", "n", "availableCpuPermits", "isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n93#2:1034\n93#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n90#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
/* loaded from: classes7.dex */
public final class a implements Executor, Closeable {

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f80947j = AtomicLongFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("衶\u0001"));

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f80948k = AtomicLongFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("衷\u0001"));

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80949l = AtomicIntegerFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("衸\u0001"));

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final s0 f80950m = new s0(ProtectedSandApp.s("衹\u0001"));

    /* renamed from: n, reason: collision with root package name */
    private static final int f80951n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f80952o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static final int f80953p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f80954q = 21;

    /* renamed from: r, reason: collision with root package name */
    private static final long f80955r = 2097151;

    /* renamed from: s, reason: collision with root package name */
    private static final long f80956s = 4398044413952L;

    /* renamed from: t, reason: collision with root package name */
    private static final int f80957t = 42;

    /* renamed from: u, reason: collision with root package name */
    private static final long f80958u = 9223367638808264704L;

    /* renamed from: v, reason: collision with root package name */
    public static final int f80959v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f80960w = 2097150;

    /* renamed from: x, reason: collision with root package name */
    private static final long f80961x = 2097151;

    /* renamed from: y, reason: collision with root package name */
    private static final long f80962y = -2097152;

    /* renamed from: z, reason: collision with root package name */
    private static final long f80963z = 2097152;

    @x
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int corePoolSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int maxPoolSize;

    @x
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long idleWorkerKeepAliveNs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final String schedulerName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final f globalCpuQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final f globalBlockingQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final n0<c> workers;

    @x
    private volatile long parkedWorkersStack;

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80971a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f80971a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i4, int i5, long j4, @fg.l String str) {
        this.corePoolSize = i4;
        this.maxPoolSize = i5;
        this.idleWorkerKeepAliveNs = j4;
        this.schedulerName = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("衿\u0001"), i4, ProtectedSandApp.s("袀\u0001")).toString());
        }
        String s4 = ProtectedSandApp.s("衺\u0001");
        if (i5 < i4) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(s4, i5, ProtectedSandApp.s("衾\u0001"), i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(r2.a(s4, i5, ProtectedSandApp.s("衽\u0001")).toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("衻\u0001"), j4, ProtectedSandApp.s("衼\u0001")).toString());
        }
        this.globalCpuQueue = new f(false);
        this.globalBlockingQueue = new f(false);
        this.workers = new n0<>((i4 + 1) * 2);
        this.controlState = i4 << 42;
        this._isTerminated = 0;
    }

    private final long B() {
        return f80948k.addAndGet(this, 4398046511104L);
    }

    private final void E(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || K() || I(stateSnapshot)) {
            return;
        }
        K();
    }

    private final k G(c cVar, k kVar, boolean z4) {
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
        return cVar.localQueue.a(kVar, z4);
    }

    private final boolean H() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80948k;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (((int) ((f80958u & j4) >> 42)) == 0) {
                return false;
            }
        } while (!f80948k.compareAndSet(this, j4, j4 - 4398046511104L));
        return true;
    }

    private final boolean I(long state) {
        int i4 = ((int) (2097151 & state)) - ((int) ((state & f80956s) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 < this.corePoolSize) {
            int e4 = e();
            if (e4 == 1 && this.corePoolSize > 1) {
                e();
            }
            if (e4 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean J(a aVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = f80948k.get(aVar);
        }
        return aVar.I(j4);
    }

    private final boolean K() {
        c x4;
        do {
            x4 = x();
            if (x4 == null) {
                return false;
            }
        } while (!c.m().compareAndSet(x4, -1, 0));
        LockSupport.unpark(x4);
        return true;
    }

    private final boolean b(k task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final int d(long state) {
        return (int) ((state & f80956s) >> 21);
    }

    private final int e() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f80948k;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & f80956s) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.corePoolSize) {
                    return 0;
                }
                if (i4 >= this.maxPoolSize) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.workers.b(i6) != null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("袁\u0001"));
                }
                c cVar = new c(this, i6);
                this.workers.c(i6, cVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("袁\u0001"));
                }
                int i7 = i5 + 1;
                cVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final int g(long state) {
        return (int) (state & 2097151);
    }

    private final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void i() {
        f80948k.addAndGet(this, f80962y);
    }

    private final int k() {
        return (int) (f80948k.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void m(a aVar, Runnable runnable, l lVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = o.f81013i;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        aVar.l(runnable, lVar, z4);
    }

    private final int n() {
        return (int) ((f80948k.get(this) & f80958u) >> 42);
    }

    private final int o() {
        return (int) (f80948k.get(this) & 2097151);
    }

    private final long q() {
        return f80948k.addAndGet(this, 2097152L);
    }

    private final int s() {
        return (int) (f80948k.incrementAndGet(this) & 2097151);
    }

    private final void t(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int u(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f80950m) {
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

    private final c x() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80947j;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            c b5 = this.workers.b((int) (2097151 & j4));
            if (b5 == null) {
                return null;
            }
            long j5 = (2097152 + j4) & f80962y;
            int u4 = u(b5);
            if (u4 >= 0 && f80947j.compareAndSet(this, j4, u4 | j5)) {
                b5.w(f80950m);
                return b5;
            }
        }
    }

    public final void C(@fg.l k task) {
        try {
            task.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
                if (b5 == null) {
                }
            } finally {
                kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
                if (b6 != null) {
                    b6.f();
                }
            }
        }
    }

    public final void D(long timeout) {
        int i4;
        k h4;
        if (f80949l.compareAndSet(this, 0, 1)) {
            c h5 = h();
            synchronized (this.workers) {
                i4 = (int) (f80948k.get(this) & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    c b5 = this.workers.b(i5);
                    l0.m(b5);
                    c cVar = b5;
                    if (cVar != h5) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.g(this.globalBlockingQueue);
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (h5 != null) {
                    h4 = h5.h(true);
                    if (h4 != null) {
                        continue;
                        C(h4);
                    }
                }
                h4 = this.globalCpuQueue.h();
                if (h4 == null && (h4 = this.globalBlockingQueue.h()) == null) {
                    break;
                }
                C(h4);
            }
            if (h5 != null) {
                h5.z(d.TERMINATED);
            }
            f80947j.set(this, 0L);
            f80948k.set(this, 0L);
        }
    }

    public final void F() {
        if (K() || J(this, 0L, 1, null)) {
            return;
        }
        K();
    }

    public final int c(long state) {
        return (int) ((state & f80958u) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        D(i0.f35991f);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@fg.l Runnable command) {
        m(this, command, null, false, 6, null);
    }

    @fg.l
    public final k f(@fg.l Runnable block, @fg.l l taskContext) {
        long a5 = o.f81010f.a();
        if (!(block instanceof k)) {
            return new n(block, a5, taskContext);
        }
        k kVar = (k) block;
        kVar.submissionTime = a5;
        kVar.taskContext = taskContext;
        return kVar;
    }

    public final boolean isTerminated() {
        return f80949l.get(this) != 0;
    }

    public final void l(@fg.l Runnable block, @fg.l l taskContext, boolean tailDispatch) {
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        if (b5 != null) {
            b5.e();
        }
        k f4 = f(block, taskContext);
        boolean z4 = false;
        boolean z5 = f4.taskContext.getTaskMode() == 1;
        long addAndGet = z5 ? f80948k.addAndGet(this, 2097152L) : 0L;
        c h4 = h();
        k G = G(h4, f4, tailDispatch);
        if (G != null && !b(G)) {
            throw new RejectedExecutionException(android.support.v4.media.c.a(new StringBuilder(), this.schedulerName, ProtectedSandApp.s("袂\u0001")));
        }
        if (tailDispatch && h4 != null) {
            z4 = true;
        }
        if (z5) {
            E(addAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            F();
        }
    }

    @fg.l
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a5 = this.workers.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < a5; i11++) {
            c b5 = this.workers.b(i11);
            if (b5 != null) {
                int f4 = b5.localQueue.f();
                int i12 = b.f80971a[b5.state.ordinal()];
                if (i12 == 1) {
                    i6++;
                } else if (i12 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f4);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i12 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f4);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i12 == 4) {
                    i7++;
                    if (f4 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f4);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i12 == 5) {
                    i10++;
                }
            }
        }
        long j4 = f80948k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.schedulerName);
        sb4.append('@');
        sb4.append(w0.b(this));
        sb4.append(ProtectedSandApp.s("袃\u0001"));
        sb4.append(this.corePoolSize);
        sb4.append(ProtectedSandApp.s("袄\u0001"));
        androidx.paging.l.a(sb4, this.maxPoolSize, ProtectedSandApp.s("袅\u0001"), i4, ProtectedSandApp.s("袆\u0001"));
        androidx.paging.l.a(sb4, i5, ProtectedSandApp.s("袇\u0001"), i6, ProtectedSandApp.s("袈\u0001"));
        androidx.paging.l.a(sb4, i7, ProtectedSandApp.s("袉\u0001"), i10, ProtectedSandApp.s("袊\u0001"));
        sb4.append(arrayList);
        sb4.append(ProtectedSandApp.s("袋\u0001"));
        sb4.append(this.globalCpuQueue.c());
        sb4.append(ProtectedSandApp.s("袌\u0001"));
        sb4.append(this.globalBlockingQueue.c());
        sb4.append(ProtectedSandApp.s("袍\u0001"));
        sb4.append((int) (2097151 & j4));
        sb4.append(ProtectedSandApp.s("袎\u0001"));
        sb4.append((int) ((f80956s & j4) >> 21));
        sb4.append(ProtectedSandApp.s("袏\u0001"));
        sb4.append(this.corePoolSize - ((int) ((f80958u & j4) >> 42)));
        sb4.append(ProtectedSandApp.s("袐\u0001"));
        return sb4.toString();
    }

    public final boolean y(@fg.l c worker) {
        long j4;
        long j5;
        int indexInArray;
        if (worker.getNextParkedWorker() != f80950m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80947j;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            j5 = (2097152 + j4) & f80962y;
            indexInArray = worker.getIndexInArray();
            worker.w(this.workers.b((int) (2097151 & j4)));
        } while (!f80947j.compareAndSet(this, j4, j5 | indexInArray));
        return true;
    }

    public final void z(@fg.l c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80947j;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & f80962y;
            if (i4 == oldIndex) {
                i4 = newIndex == 0 ? u(worker) : newIndex;
            }
            if (i4 >= 0 && f80947j.compareAndSet(this, j4, j5 | i4)) {
                return;
            }
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u001d\u0010$\u001a\u0004\u0018\u00010\u000f2\n\u0010#\u001a\u00060\u0004j\u0002`\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\fJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0015\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u0010 R*\u00104\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0015R\u0014\u0010;\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u0016\u0010@\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0016\u00102\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010LR\u0012\u0010P\u001a\u00020M8Æ\u0002¢\u0006\u0006\u001a\u0004\bN\u0010OR\b\u0010R\u001a\u00020Q8\u0006¨\u0006S"}, d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "", "index", "(Lkotlinx/coroutines/scheduling/a;I)V", "", "x", "()Z", "Lkotlin/k2;", "u", "()V", "y", "o", "Lkotlinx/coroutines/scheduling/k;", "task", "d", "(Lkotlinx/coroutines/scheduling/k;)V", "taskMode", "c", "(I)V", "b", "r", "B", "mode", "n", "f", "()Lkotlinx/coroutines/scheduling/k;", "g", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/k;", "s", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "A", "(I)Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "z", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "", "t", "()J", "p", "upperBound", "q", "(I)I", "mayHaveLocalTasks", "h", "indexInArray", "I", "i", "()I", "v", "Lkotlinx/coroutines/scheduling/q;", "Lkotlinx/coroutines/scheduling/q;", "localQueue", "Lkotlin/jvm/internal/k1$h;", "Lkotlin/jvm/internal/k1$h;", "stolenTask", "Lkotlinx/coroutines/scheduling/a$d;", "state", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "w", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/coroutines/scheduling/a;", "k", "()Lkotlinx/coroutines/scheduling/a;", "scheduler", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n90#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    public final class c extends Thread {

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        private static final AtomicIntegerFieldUpdater f80972j = AtomicIntegerFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("衮\u0001"));

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final q localQueue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final k1.h<k> stolenTask;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public d state;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @fg.m
        private volatile Object nextParkedWorker;

        @x
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.localQueue = new q();
            this.stolenTask = new k1.h<>();
            this.state = d.DORMANT;
            this.nextParkedWorker = a.f80950m;
            this.rngState = kotlin.random.f.INSTANCE.l();
        }

        private final k A(int stealingMode) {
            int i4 = (int) (a.f80948k.get(a.this) & 2097151);
            if (i4 < 2) {
                return null;
            }
            int q4 = q(i4);
            a aVar = a.this;
            long j4 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                q4++;
                if (q4 > i4) {
                    q4 = 1;
                }
                c b5 = aVar.workers.b(q4);
                if (b5 != null && b5 != this) {
                    long p4 = b5.localQueue.p(stealingMode, this.stolenTask);
                    if (p4 == -1) {
                        k1.h<k> hVar = this.stolenTask;
                        k kVar = hVar.f75329b;
                        hVar.f75329b = null;
                        return kVar;
                    }
                    if (p4 > 0) {
                        j4 = Math.min(j4, p4);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.minDelayUntilStealableTaskNs = j4;
            return null;
        }

        private final void B() {
            a aVar = a.this;
            synchronized (aVar.workers) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.f80948k.get(aVar) & 2097151)) <= aVar.corePoolSize) {
                        return;
                    }
                    if (f80972j.compareAndSet(this, -1, 1)) {
                        int i4 = this.indexInArray;
                        v(0);
                        aVar.z(this, i4, 0);
                        int andDecrement = (int) (a.f80948k.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i4) {
                            c b5 = aVar.workers.b(andDecrement);
                            l0.m(b5);
                            c cVar = b5;
                            aVar.workers.c(i4, cVar);
                            cVar.v(i4);
                            aVar.z(cVar, andDecrement, i4);
                        }
                        aVar.workers.c(andDecrement, null);
                        k2 k2Var = k2.f75408a;
                        this.state = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private final void b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            a.f80948k.addAndGet(a.this, a.f80962y);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        private final void c(int taskMode) {
            if (taskMode != 0 && z(d.BLOCKING)) {
                a.this.F();
            }
        }

        private final void d(k task) {
            int taskMode = task.taskContext.getTaskMode();
            n(taskMode);
            c(taskMode);
            a.this.C(task);
            b(taskMode);
        }

        private final k e(boolean scanLocalQueue) {
            k s4;
            k s5;
            if (scanLocalQueue) {
                boolean z4 = q(a.this.corePoolSize * 2) == 0;
                if (z4 && (s5 = s()) != null) {
                    return s5;
                }
                k h4 = this.localQueue.h();
                if (h4 != null) {
                    return h4;
                }
                if (!z4 && (s4 = s()) != null) {
                    return s4;
                }
            } else {
                k s6 = s();
                if (s6 != null) {
                    return s6;
                }
            }
            return A(3);
        }

        private final k f() {
            k i4 = this.localQueue.i();
            if (i4 != null) {
                return i4;
            }
            k h4 = a.this.globalBlockingQueue.h();
            return h4 == null ? A(1) : h4;
        }

        private final k g() {
            k k4 = this.localQueue.k();
            if (k4 != null) {
                return k4;
            }
            k h4 = a.this.globalBlockingQueue.h();
            return h4 == null ? A(2) : h4;
        }

        @fg.l
        public static final AtomicIntegerFieldUpdater m() {
            return f80972j;
        }

        private final void n(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
        }

        private final boolean o() {
            return this.nextParkedWorker != a.f80950m;
        }

        private final void r() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                B();
            }
        }

        private final k s() {
            if (q(2) == 0) {
                k h4 = a.this.globalCpuQueue.h();
                return h4 != null ? h4 : a.this.globalBlockingQueue.h();
            }
            k h5 = a.this.globalBlockingQueue.h();
            return h5 != null ? h5 : a.this.globalCpuQueue.h();
        }

        private final void u() {
            loop0: while (true) {
                boolean z4 = false;
                while (!a.this.isTerminated() && this.state != d.TERMINATED) {
                    k h4 = h(this.mayHaveLocalTasks);
                    if (h4 != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        d(h4);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            y();
                        } else if (z4) {
                            z(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z4 = true;
                        }
                    }
                }
            }
            z(d.TERMINATED);
        }

        private final boolean x() {
            long j4;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f80948k;
            do {
                j4 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((a.f80958u & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f80948k.compareAndSet(aVar, j4, j4 - 4398046511104L));
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        private final void y() {
            if (!o()) {
                a.this.y(this);
                return;
            }
            f80972j.set(this, -1);
            while (o() && f80972j.get(this) == -1 && !a.this.isTerminated() && this.state != d.TERMINATED) {
                z(d.PARKING);
                Thread.interrupted();
                r();
            }
        }

        @fg.m
        public final k h(boolean mayHaveLocalTasks) {
            return x() ? e(mayHaveLocalTasks) : f();
        }

        /* renamed from: i, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @fg.m
        /* renamed from: j, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @fg.l
        /* renamed from: k, reason: from getter */
        public final a getF80980i() {
            return a.this;
        }

        /* renamed from: l, reason: from getter */
        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        public final boolean p() {
            return this.state == d.BLOCKING;
        }

        public final int q(int upperBound) {
            int i4 = this.rngState;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >> 17);
            int i7 = i6 ^ (i6 << 5);
            this.rngState = i7;
            int i10 = upperBound - 1;
            return (i10 & upperBound) == 0 ? i7 & i10 : (i7 & Integer.MAX_VALUE) % upperBound;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            u();
        }

        public final long t() {
            boolean z4 = this.state == d.CPU_ACQUIRED;
            k g4 = z4 ? g() : f();
            if (g4 == null) {
                long j4 = this.minDelayUntilStealableTaskNs;
                if (j4 == 0) {
                    return -1L;
                }
                return j4;
            }
            a.this.C(g4);
            if (!z4) {
                a.f80948k.addAndGet(a.this, a.f80962y);
            }
            return 0L;
        }

        public final void v(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.schedulerName);
            sb.append(ProtectedSandApp.s("衯\u0001"));
            sb.append(i4 == 0 ? ProtectedSandApp.s("衰\u0001") : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void w(@fg.m Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean z(@fg.l d newState) {
            d dVar = this.state;
            boolean z4 = dVar == d.CPU_ACQUIRED;
            if (z4) {
                a.f80948k.addAndGet(a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z4;
        }

        public c(a aVar, int i4) {
            this();
            v(i4);
        }
    }

    public /* synthetic */ a(int i4, int i5, long j4, String str, int i6, w wVar) {
        this(i4, i5, (i6 & 4) != 0 ? o.f81009e : j4, (i6 & 8) != 0 ? o.f81005a : str);
    }
}
