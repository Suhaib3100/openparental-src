package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.z1;

/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\fR\u00020\u0000\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0017¢\u0006\u0004\b(\u0010'R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00100\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00105\u001a\u000601j\u0002`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u000b\u00107\u001a\u0002068\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lkotlinx/coroutines/internal/s;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/b1;", "dispatcher", "", "parallelism", "<init>", "(Lkotlinx/coroutines/m0;I)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/s$a;", "Lkotlin/k2;", "startWorker", "l1", "(Ljava/lang/Runnable;Lld/l;)V", "", "t1", "()Z", "n1", "()Ljava/lang/Runnable;", "", "time", "q0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/p;", "continuation", "a", "(JLkotlinx/coroutines/p;)V", "e1", "(I)Lkotlinx/coroutines/m0;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "d", "Lkotlinx/coroutines/m0;", "e", "I", "Lkotlinx/coroutines/internal/z;", "g", "Lkotlinx/coroutines/internal/z;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* loaded from: classes7.dex */
public final class s extends kotlinx.coroutines.m0 implements kotlinx.coroutines.b1 {

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80814i = AtomicIntegerFieldUpdater.newUpdater(s.class, ProtectedSandApp.s("蠌\u0001"));

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.b1 f80817f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z<Runnable> queue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object workerAllocationLock;

    @kd.x
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/s$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lkotlinx/coroutines/internal/s;Ljava/lang/Runnable;)V", "Lkotlin/k2;", "run", "()V", "b", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Runnable currentTask;

        public a(@fg.l Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    kotlinx.coroutines.o0.b(kotlin.coroutines.i.f75057b, th);
                }
                Runnable n12 = s.this.n1();
                if (n12 == null) {
                    return;
                }
                this.currentTask = n12;
                i4++;
                if (i4 >= 16 && s.this.dispatcher.c1(s.this)) {
                    s.this.dispatcher.S0(s.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@fg.l kotlinx.coroutines.m0 m0Var, int i4) {
        this.dispatcher = m0Var;
        this.parallelism = i4;
        kotlinx.coroutines.b1 b1Var = m0Var instanceof kotlinx.coroutines.b1 ? (kotlinx.coroutines.b1) m0Var : null;
        this.f80817f = b1Var == null ? kotlinx.coroutines.y0.a() : b1Var;
        this.queue = new z<>(false);
        this.workerAllocationLock = new Object();
    }

    private final void l1(Runnable block, ld.l<? super a, k2> startWorker) {
        Runnable n12;
        this.queue.a(block);
        if (f80814i.get(this) < this.parallelism && t1() && (n12 = n1()) != null) {
            startWorker.invoke(new a(n12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable n1() {
        while (true) {
            Runnable h4 = this.queue.h();
            if (h4 != null) {
                return h4;
            }
            synchronized (this.workerAllocationLock) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80814i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean t1() {
        synchronized (this.workerAllocationLock) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80814i;
            if (atomicIntegerFieldUpdater.get(this) >= this.parallelism) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        Runnable n12;
        this.queue.a(block);
        if (f80814i.get(this) >= this.parallelism || !t1() || (n12 = n1()) == null) {
            return;
        }
        this.dispatcher.S0(this, new a(n12));
    }

    @Override // kotlinx.coroutines.m0
    @f2
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        Runnable n12;
        this.queue.a(block);
        if (f80814i.get(this) >= this.parallelism || !t1() || (n12 = n1()) == null) {
            return;
        }
        this.dispatcher.U0(this, new a(n12));
    }

    @Override // kotlinx.coroutines.b1
    public void a(long timeMillis, @fg.l kotlinx.coroutines.p<? super k2> continuation) {
        this.f80817f.a(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    @z1
    public kotlinx.coroutines.m0 e1(int parallelism) {
        t.a(parallelism);
        return parallelism >= this.parallelism ? this : super.e1(parallelism);
    }

    @Override // kotlinx.coroutines.b1
    @fg.l
    public m1 q(long timeMillis, @fg.l Runnable block, @fg.l kotlin.coroutines.g context) {
        return this.f80817f.q(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.b1
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object q0(long j4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return this.f80817f.q0(j4, dVar);
    }
}
