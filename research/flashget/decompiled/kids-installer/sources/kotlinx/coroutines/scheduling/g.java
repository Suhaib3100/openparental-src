package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.z1;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b/\u00100J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001e\u0010+\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lkotlinx/coroutines/scheduling/g;", "Lkotlinx/coroutines/z1;", "Lkotlinx/coroutines/scheduling/l;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/m2;", "M0", "(Ljava/lang/Runnable;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/g;", "context", "y0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "A0", "", "toString", "()Ljava/lang/String;", "r", "Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/scheduling/e;", "dispatcher", "", "s", "I", "parallelism", "t", "Ljava/lang/String;", "name", "u", "X", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "v", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "J0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lkotlinx/coroutines/scheduling/e;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class g extends z1 implements l, Executor {

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28872w = AtomicIntegerFieldUpdater.newUpdater(g.class, ProtectedSandApp.s("酲"));

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e dispatcher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String name;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int taskMode;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

    @d5.d
    private volatile /* synthetic */ int inFlightTasks = 0;

    public g(@d5.d e eVar, int i5, @d5.e String str, int i6) {
        this.dispatcher = eVar;
        this.parallelism = i5;
        this.name = str;
        this.taskMode = i6;
    }

    private final void M0(Runnable block, boolean tailDispatch) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f28872w;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.parallelism) {
                this.dispatcher.R0(block, this, tailDispatch);
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

    @Override // kotlinx.coroutines.o0
    public void A0(@d5.d CoroutineContext context, @d5.d Runnable block) {
        M0(block, true);
    }

    @Override // kotlinx.coroutines.z1
    @d5.d
    /* renamed from: J0 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.scheduling.l
    /* renamed from: X, reason: from getter */
    public int getTaskMode() {
        return this.taskMode;
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ProtectedSandApp.s("酳").toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@d5.d Runnable command) {
        M0(command, false);
    }

    @Override // kotlinx.coroutines.scheduling.l
    public void r() {
        Runnable poll = this.queue.poll();
        if (poll != null) {
            this.dispatcher.R0(poll, this, true);
            return;
        }
        f28872w.decrementAndGet(this);
        Runnable poll2 = this.queue.poll();
        if (poll2 == null) {
            return;
        }
        M0(poll2, true);
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return super.toString() + ProtectedSandApp.s("酴") + this.dispatcher + ']';
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext context, @d5.d Runnable block) {
        M0(block, false);
    }
}
