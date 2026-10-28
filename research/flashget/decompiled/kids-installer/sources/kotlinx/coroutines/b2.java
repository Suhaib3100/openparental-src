package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/z1;", "d", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/z1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/o0;", "c", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/o0;", "b", "Lkotlinx/coroutines/c2;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    @d5.d
    public static final Executor b(@d5.d o0 o0Var) {
        Executor executor;
        z1 z1Var = o0Var instanceof z1 ? (z1) o0Var : null;
        return (z1Var == null || (executor = z1Var.getExecutor()) == null) ? new l1(o0Var) : executor;
    }

    @p3.i(name = "from")
    @d5.d
    public static final o0 c(@d5.d Executor executor) {
        o0 o0Var;
        l1 l1Var = executor instanceof l1 ? (l1) executor : null;
        return (l1Var == null || (o0Var = l1Var.dispatcher) == null) ? new a2(executor) : o0Var;
    }

    @p3.i(name = "from")
    @d5.d
    public static final z1 d(@d5.d ExecutorService executorService) {
        return new a2(executorService);
    }
}
