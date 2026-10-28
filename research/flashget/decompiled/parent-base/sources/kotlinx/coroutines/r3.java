package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: ThreadPoolDispatcher.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "nThreads", "", "name", "Lkotlinx/coroutines/w1;", "b", "(ILjava/lang/String;)Lkotlinx/coroutines/w1;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
@kotlin.jvm.internal.r1({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class r3 {
    @fg.l
    @e1
    public static final w1 b(final int i4, @fg.l final String str) {
        if (i4 < 1) {
            throw new IllegalArgumentException(androidx.collection.r2.a(ProtectedSandApp.s("衣\u0001"), i4, ProtectedSandApp.s("衤\u0001")).toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new x1(Executors.newScheduledThreadPool(i4, new ThreadFactory() { // from class: kotlinx.coroutines.q3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread c5;
                c5 = r3.c(i4, str, atomicInteger, runnable);
                return c5;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i4, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i4 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
