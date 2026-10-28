package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: WorkQueue.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/q;", "", "Lkotlinx/coroutines/scheduling/k;", "task", "c", "(Lkotlinx/coroutines/scheduling/k;)Lkotlinx/coroutines/scheduling/k;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/q;Z)J", "Lkotlinx/coroutines/scheduling/f;", "queue", "j", "(Lkotlinx/coroutines/scheduling/f;)Z", "i", "()Lkotlinx/coroutines/scheduling/k;", "Lkotlin/m2;", "d", "(Lkotlinx/coroutines/scheduling/k;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "l", "(Lkotlinx/coroutines/scheduling/q;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/f;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28899b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, ProtectedSandApp.s("幌"));

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28900c = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("幍"));

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28901d = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("幎"));

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28902e = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("幏"));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final AtomicReferenceArray<k> buffer = new AtomicReferenceArray<>(128);

    @d5.d
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @d5.d
    private volatile /* synthetic */ int producerIndex = 0;

    @d5.d
    private volatile /* synthetic */ int consumerIndex = 0;

    @d5.d
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return qVar.a(kVar, z5);
    }

    private final k c(k task) {
        if (task.taskContext.getTaskMode() == 1) {
            f28902e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return task;
        }
        int i5 = this.producerIndex & 127;
        while (this.buffer.get(i5) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i5, task);
        f28900c.incrementAndGet(this);
        return null;
    }

    private final void d(k kVar) {
        if (kVar != null) {
            if (kVar.taskContext.getTaskMode() == 1) {
                f28902e.decrementAndGet(this);
            }
        }
    }

    private final k i() {
        k andSet;
        while (true) {
            int i5 = this.consumerIndex;
            if (i5 - this.producerIndex == 0) {
                return null;
            }
            int i6 = i5 & 127;
            if (f28901d.compareAndSet(this, i5, i5 + 1) && (andSet = this.buffer.getAndSet(i6, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(f queue) {
        k i5 = i();
        if (i5 == null) {
            return false;
        }
        queue.a(i5);
        return true;
    }

    private final long m(q victim, boolean blockingOnly) {
        k kVar;
        do {
            kVar = (k) victim.lastScheduledTask;
            if (kVar == null) {
                return -2L;
            }
            if (blockingOnly) {
                if (!(kVar.taskContext.getTaskMode() == 1)) {
                    return -2L;
                }
            }
            long a6 = o.f28893f.a() - kVar.submissionTime;
            long j5 = o.f28889b;
            if (a6 < j5) {
                return j5 - a6;
            }
        } while (!androidx.concurrent.futures.d.a(f28899b, victim, kVar, null));
        b(this, kVar, false, 2, null);
        return -1L;
    }

    @d5.e
    public final k a(@d5.d k task, boolean fair) {
        if (fair) {
            return c(task);
        }
        k kVar = (k) f28899b.getAndSet(this, task);
        if (kVar == null) {
            return null;
        }
        return c(kVar);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final void g(@d5.d f globalQueue) {
        k kVar = (k) f28899b.getAndSet(this, null);
        if (kVar != null) {
            globalQueue.a(kVar);
        }
        while (j(globalQueue)) {
        }
    }

    @d5.e
    public final k h() {
        k kVar = (k) f28899b.getAndSet(this, null);
        return kVar == null ? i() : kVar;
    }

    public final long k(@d5.d q victim) {
        int i5 = victim.consumerIndex;
        int i6 = victim.producerIndex;
        AtomicReferenceArray<k> atomicReferenceArray = victim.buffer;
        while (true) {
            if (i5 == i6) {
                break;
            }
            int i7 = i5 & 127;
            if (victim.blockingTasksInBuffer == 0) {
                break;
            }
            k kVar = atomicReferenceArray.get(i7);
            if (kVar != null) {
                if ((kVar.taskContext.getTaskMode() == 1) && kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i7, kVar, null)) {
                    f28902e.decrementAndGet(victim);
                    b(this, kVar, false, 2, null);
                    return -1L;
                }
            }
            i5++;
        }
        return m(victim, true);
    }

    public final long l(@d5.d q victim) {
        k i5 = victim.i();
        if (i5 == null) {
            return m(victim, false);
        }
        b(this, i5, false, 2, null);
        return -1L;
    }
}
