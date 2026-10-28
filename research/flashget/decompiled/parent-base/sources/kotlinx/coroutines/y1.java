package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\u0010\b\u0007\u0010\u000b\"\u00020\u00012\u00020\u0001B\u0002\b\n¨\u0006\f"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/w1;", "d", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/w1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/m0;", "c", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/m0;", "b", "(Lkotlinx/coroutines/m0;)Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/z1;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class y1 {
    @z1
    public static /* synthetic */ void a() {
    }

    @fg.l
    public static final Executor b(@fg.l m0 m0Var) {
        Executor executor;
        w1 w1Var = m0Var instanceof w1 ? (w1) m0Var : null;
        return (w1Var == null || (executor = w1Var.getExecutor()) == null) ? new i1(m0Var) : executor;
    }

    @fg.l
    @kd.i(name = "from")
    public static final m0 c(@fg.l Executor executor) {
        m0 m0Var;
        i1 i1Var = executor instanceof i1 ? (i1) executor : null;
        return (i1Var == null || (m0Var = i1Var.dispatcher) == null) ? new x1(executor) : m0Var;
    }

    @fg.l
    @kd.i(name = "from")
    public static final w1 d(@fg.l ExecutorService executorService) {
        return new x1(executorService);
    }
}
