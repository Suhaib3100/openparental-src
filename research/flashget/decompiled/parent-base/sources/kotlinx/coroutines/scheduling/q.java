package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.d2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;

/* compiled from: WorkQueue.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010\u001eJ\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0019¢\u0006\u0004\b*\u0010+R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0014\u00101\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002048\u0002X\u0082\u0004R\u0013\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004078\u0002X\u0082\u0004R\u000b\u00109\u001a\u0002048\u0002X\u0082\u0004¨\u0006:"}, d2 = {"Lkotlinx/coroutines/scheduling/q;", "", "<init>", "()V", "Lkotlinx/coroutines/scheduling/k;", "task", "c", "(Lkotlinx/coroutines/scheduling/k;)Lkotlinx/coroutines/scheduling/k;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "n", "(I)Lkotlinx/coroutines/scheduling/k;", "", "onlyBlocking", "m", "(Z)Lkotlinx/coroutines/scheduling/k;", "index", "o", "(IZ)Lkotlinx/coroutines/scheduling/k;", "Lkotlin/jvm/internal/k1$h;", "stolenTaskRef", "", "q", "(ILkotlin/jvm/internal/k1$h;)J", "Lkotlinx/coroutines/scheduling/f;", "queue", "l", "(Lkotlinx/coroutines/scheduling/f;)Z", "j", "()Lkotlinx/coroutines/scheduling/k;", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/scheduling/k;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "p", "i", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/f;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "f", "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n93#2:256\n93#2:257\n93#2:258\n93#2:261\n93#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f81016b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, ProtectedSandApp.s("袨\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f81017c = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("袩\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f81018d = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("袪\u0001"));

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f81019e = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("被\u0001"));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReferenceArray<k> buffer = new AtomicReferenceArray<>(128);

    @x
    private volatile int blockingTasksInBuffer;

    @x
    private volatile int consumerIndex;

    @fg.m
    @x
    private volatile Object lastScheduledTask;

    @x
    private volatile int producerIndex;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return qVar.a(kVar, z4);
    }

    private final k c(k task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            f81019e.incrementAndGet(this);
        }
        int i4 = f81017c.get(this) & 127;
        while (this.buffer.get(i4) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i4, task);
        f81017c.incrementAndGet(this);
        return null;
    }

    private final void d(k kVar) {
        if (kVar == null || kVar.taskContext.getTaskMode() != 1) {
            return;
        }
        f81019e.decrementAndGet(this);
    }

    private final int e() {
        return f81017c.get(this) - f81018d.get(this);
    }

    private final k j() {
        k andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f81018d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f81017c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (andSet = this.buffer.getAndSet(i5, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean l(f queue) {
        k j4 = j();
        if (j4 == null) {
            return false;
        }
        queue.a(j4);
        return true;
    }

    private final k m(boolean onlyBlocking) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k kVar;
        do {
            atomicReferenceFieldUpdater = f81016b;
            kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar != null) {
                if ((kVar.taskContext.getTaskMode() == 1) == onlyBlocking) {
                }
            }
            int i4 = f81018d.get(this);
            int i5 = f81017c.get(this);
            while (i4 != i5) {
                if (onlyBlocking && f81019e.get(this) == 0) {
                    return null;
                }
                i5--;
                k o4 = o(i5, onlyBlocking);
                if (o4 != null) {
                    return o4;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, kVar, null));
        return kVar;
    }

    private final k n(int stealingMode) {
        int i4 = f81018d.get(this);
        int i5 = f81017c.get(this);
        boolean z4 = stealingMode == 1;
        while (i4 != i5) {
            if (z4 && f81019e.get(this) == 0) {
                return null;
            }
            int i6 = i4 + 1;
            k o4 = o(i4, z4);
            if (o4 != null) {
                return o4;
            }
            i4 = i6;
        }
        return null;
    }

    private final k o(int index, boolean onlyBlocking) {
        int i4 = index & 127;
        k kVar = this.buffer.get(i4);
        if (kVar != null) {
            if ((kVar.taskContext.getTaskMode() == 1) == onlyBlocking && d2.a(this.buffer, i4, kVar, null)) {
                if (onlyBlocking) {
                    f81019e.decrementAndGet(this);
                }
                return kVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.k] */
    private final long q(int stealingMode, k1.h<k> stolenTaskRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f81016b;
            r12 = (k) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.taskContext.getTaskMode() != 1 ? 2 : 1) & stealingMode) == 0) {
                return -2L;
            }
            long a5 = o.f81010f.a() - r12.submissionTime;
            long j4 = o.f81006b;
            if (a5 < j4) {
                return j4 - a5;
            }
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, r12, null));
        stolenTaskRef.f75329b = r12;
        return -1L;
    }

    @fg.m
    public final k a(@fg.l k task, boolean fair) {
        if (fair) {
            return c(task);
        }
        k kVar = (k) f81016b.getAndSet(this, task);
        if (kVar == null) {
            return null;
        }
        return c(kVar);
    }

    public final int f() {
        return f81016b.get(this) != null ? e() + 1 : e();
    }

    public final void g(@fg.l f globalQueue) {
        k kVar = (k) f81016b.getAndSet(this, null);
        if (kVar != null) {
            globalQueue.a(kVar);
        }
        while (l(globalQueue)) {
        }
    }

    @fg.m
    public final k h() {
        k kVar = (k) f81016b.getAndSet(this, null);
        return kVar == null ? j() : kVar;
    }

    @fg.m
    public final k i() {
        return m(true);
    }

    @fg.m
    public final k k() {
        return m(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p(int stealingMode, @fg.l k1.h<k> stolenTaskRef) {
        T j4 = stealingMode == 3 ? j() : n(stealingMode);
        if (j4 == 0) {
            return q(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.f75329b = j4;
        return -1L;
    }
}
