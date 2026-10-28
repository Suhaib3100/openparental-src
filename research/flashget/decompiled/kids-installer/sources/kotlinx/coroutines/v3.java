package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: ThreadPoolDispatcher.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lkotlinx/coroutines/z1;", "d", "", "nThreads", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v3 {
    @g1
    @d5.d
    public static final z1 b(final int i5, @d5.d final String str) {
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("庒"), i5, ProtectedSandApp.s("库")).toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new a2(Executors.newScheduledThreadPool(i5, new ThreadFactory() { // from class: kotlinx.coroutines.u3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread c6;
                c6 = v3.c(i5, str, atomicInteger, runnable);
                return c6;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i5, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i5 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @g1
    @d5.d
    public static final z1 d(@d5.d String str) {
        return b(1, str);
    }
}
