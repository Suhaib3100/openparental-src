package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlinx.coroutines.w1;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00122\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u000b\u00103\u001a\u0002028\u0002X\u0082\u0004¨\u00064"}, d2 = {"Lkotlinx/coroutines/scheduling/g;", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/scheduling/l;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/scheduling/e;", "dispatcher", "", "parallelism", "", "name", "taskMode", "<init>", "(Lkotlinx/coroutines/scheduling/e;ILjava/lang/String;I)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/k2;", "k1", "(Ljava/lang/Runnable;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/g;", "context", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "toString", "()Ljava/lang/String;", "M", "e", "Lkotlinx/coroutines/scheduling/e;", "f", "I", "g", "Ljava/lang/String;", "h", "n0", "()I", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "i", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "j1", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/atomicfu/AtomicInt;", "inFlightTasks", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class g extends w1 implements l, Executor {

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80989j = AtomicIntegerFieldUpdater.newUpdater(g.class, ProtectedSandApp.s("袝\u0001"));

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e dispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String name;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int taskMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

    @x
    private volatile int inFlightTasks;

    public g(@fg.l e eVar, int i4, @fg.m String str, int i5) {
        this.dispatcher = eVar;
        this.parallelism = i4;
        this.name = str;
        this.taskMode = i5;
    }

    private final void k1(Runnable block, boolean tailDispatch) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80989j;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.parallelism) {
                this.dispatcher.t1(block, this, tailDispatch);
                return;
            }
            this.queue.add(block);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.parallelism) {
                return;
            } else {
                block = this.queue.poll();
            }
        } while (block != null);
    }

    @Override // kotlinx.coroutines.scheduling.l
    public void M() {
        Runnable poll = this.queue.poll();
        if (poll != null) {
            this.dispatcher.t1(poll, this, true);
            return;
        }
        f80989j.decrementAndGet(this);
        Runnable poll2 = this.queue.poll();
        if (poll2 == null) {
            return;
        }
        k1(poll2, true);
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        k1(block, false);
    }

    @Override // kotlinx.coroutines.m0
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        k1(block, true);
    }

    @Override // kotlinx.coroutines.w1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ProtectedSandApp.s("袞\u0001"));
    }

    @Override // java.util.concurrent.Executor
    public void execute(@fg.l Runnable command) {
        k1(command, false);
    }

    @Override // kotlinx.coroutines.w1
    @fg.l
    /* renamed from: j1 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.scheduling.l
    /* renamed from: n0, reason: from getter */
    public int getTaskMode() {
        return this.taskMode;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return super.toString() + ProtectedSandApp.s("袟\u0001") + this.dispatcher + ']';
    }
}
