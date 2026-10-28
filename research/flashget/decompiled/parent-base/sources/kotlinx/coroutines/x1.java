package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.b1;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/b1;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "l1", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/g;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/k2;", "k1", "(Lkotlin/coroutines/g;Ljava/util/concurrent/RejectedExecutionException;)V", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "Lkotlinx/coroutines/p;", "continuation", "a", "(JLkotlinx/coroutines/p;)V", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "Ljava/util/concurrent/Executor;", "j1", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class x1 extends w1 implements b1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor executor;

    public x1(@fg.l Executor executor) {
        this.executor = executor;
        kotlinx.coroutines.internal.e.c(executor);
    }

    private final void k1(kotlin.coroutines.g context, RejectedExecutionException exception) {
        p2.f(context, v1.a(ProtectedSandApp.s("褞\u0001"), exception));
    }

    private final ScheduledFuture<?> l1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.g gVar, long j4) {
        try {
            return scheduledExecutorService.schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            k1(gVar, e4);
            return null;
        }
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        Runnable runnable;
        try {
            Executor executor = this.executor;
            b b5 = c.b();
            if (b5 != null) {
                runnable = b5.i(block);
                if (runnable == null) {
                }
                executor.execute(runnable);
            }
            runnable = block;
            executor.execute(runnable);
        } catch (RejectedExecutionException e4) {
            b b6 = c.b();
            if (b6 != null) {
                b6.f();
            }
            k1(context, e4);
            j1.c().S0(context, block);
        }
    }

    @Override // kotlinx.coroutines.b1
    public void a(long timeMillis, @fg.l p<? super kotlin.k2> continuation) {
        Executor executor = this.executor;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> l12 = scheduledExecutorService != null ? l1(scheduledExecutorService, new e3(this, continuation), continuation.getF75054b(), timeMillis) : null;
        if (l12 != null) {
            o2.a(continuation, l12);
        } else {
            x0.f81189j.a(timeMillis, continuation);
        }
    }

    @Override // kotlinx.coroutines.w1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.executor;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof x1) && ((x1) other).executor == this.executor;
    }

    public int hashCode() {
        return System.identityHashCode(this.executor);
    }

    @Override // kotlinx.coroutines.w1
    @fg.l
    /* renamed from: j1, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.b1
    @fg.l
    public m1 q(long timeMillis, @fg.l Runnable block, @fg.l kotlin.coroutines.g context) {
        Executor executor = this.executor;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> l12 = scheduledExecutorService != null ? l1(scheduledExecutorService, block, context, timeMillis) : null;
        return l12 != null ? new l1(l12) : x0.f81189j.x2(timeMillis, block);
    }

    @Override // kotlinx.coroutines.b1
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object q0(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        return b1.a.a(this, j4, dVar);
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        return this.executor.toString();
    }
}
