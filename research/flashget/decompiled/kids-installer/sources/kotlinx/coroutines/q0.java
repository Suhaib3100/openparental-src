package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/m2;", "a", "", "Lkotlinx/coroutines/p0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final List<p0> f28831a;

    static {
        Sequence e6;
        e6 = kotlin.sequences.s.e(ServiceLoader.load(p0.class, p0.class.getClassLoader()).iterator());
        f28831a = kotlin.sequences.v.c3(e6);
    }

    public static final void a(@d5.d CoroutineContext coroutineContext, @d5.d Throwable th) {
        Iterator<p0> it = f28831a.iterator();
        while (it.hasNext()) {
            try {
                it.next().n0(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, r0.c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.a aVar = Result.f27242p;
            kotlin.p.a(th, new h1(coroutineContext));
            kotlin.m2 m2Var = kotlin.m2.f23662a;
        } catch (Throwable th3) {
            Result.a aVar2 = Result.f27242p;
            kotlin.a1.a(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
