package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e1;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/z1;", "Lkotlinx/coroutines/e1;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "N0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/m2;", "M0", "y0", "Lkotlinx/coroutines/q;", "continuation", "g", "Lkotlinx/coroutines/p1;", "b0", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "r", "Ljava/util/concurrent/Executor;", "J0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a2 extends z1 implements e1 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Executor executor;

    public a2(@d5.d Executor executor) {
        this.executor = executor;
        kotlinx.coroutines.internal.f.c(executor);
    }

    private final void M0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        s2.f(coroutineContext, y1.a(ProtectedSandApp.s("遊"), rejectedExecutionException));
    }

    private final ScheduledFuture<?> N0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j5) {
        try {
            return scheduledExecutorService.schedule(runnable, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e6) {
            M0(coroutineContext, e6);
            return null;
        }
    }

    @Override // kotlinx.coroutines.z1
    @d5.d
    /* renamed from: J0, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.e1
    @d5.d
    public p1 b0(long timeMillis, @d5.d Runnable block, @d5.d CoroutineContext context) {
        Executor executor = this.executor;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> N0 = scheduledExecutorService != null ? N0(scheduledExecutorService, block, context, timeMillis) : null;
        return N0 != null ? new o1(N0) : a1.f27251v.D1(timeMillis, block);
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.executor;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @d5.e
    public Object e0(long j5, @d5.d Continuation<? super kotlin.m2> continuation) {
        return e1.a.a(this, j5, continuation);
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof a2) && ((a2) other).executor == this.executor;
    }

    @Override // kotlinx.coroutines.e1
    public void g(long j5, @d5.d q<? super kotlin.m2> qVar) {
        Executor executor = this.executor;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> N0 = scheduledExecutorService != null ? N0(scheduledExecutorService, new i3(this, qVar), qVar.getContext(), j5) : null;
        if (N0 != null) {
            r2.a(qVar, N0);
        } else {
            a1.f27251v.g(j5, qVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.executor);
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        return this.executor.toString();
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = this.executor;
            b b6 = c.b();
            if (b6 == null || (runnable2 = b6.i(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException e6) {
            b b7 = c.b();
            if (b7 != null) {
                b7.f();
            }
            M0(coroutineContext, e6);
            m1.c().y0(coroutineContext, runnable);
        }
    }
}
