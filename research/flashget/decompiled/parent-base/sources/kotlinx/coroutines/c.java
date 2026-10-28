package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* compiled from: AbstractTimeSource.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0003\u0010\u0002\u001a \u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0081\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\n\u001a\u00020\tH\u0081\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\tH\u0081\b¢\u0006\u0004\b\f\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\tH\u0081\b¢\u0006\u0004\b\r\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\tH\u0081\b¢\u0006\u0004\b\u000e\u0010\u000b\u001a \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0081\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017\"$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "a", "()J", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "Lkotlin/k2;", "g", "()V", "h", "e", "j", "", "blocker", "nanos", "d", "(Ljava/lang/Object;J)V", "Ljava/lang/Thread;", "thread", "i", "(Ljava/lang/Thread;)V", "Lkotlinx/coroutines/b;", "Lkotlinx/coroutines/b;", "b", "()Lkotlinx/coroutines/b;", "f", "(Lkotlinx/coroutines/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private static b f79270a;

    @kotlin.internal.f
    private static final long a() {
        b bVar = f79270a;
        return bVar != null ? bVar.a() : System.currentTimeMillis();
    }

    @fg.m
    public static final b b() {
        return f79270a;
    }

    @kotlin.internal.f
    private static final long c() {
        b bVar = f79270a;
        return bVar != null ? bVar.b() : System.nanoTime();
    }

    @kotlin.internal.f
    private static final void d(Object obj, long j4) {
        kotlin.k2 k2Var;
        b bVar = f79270a;
        if (bVar != null) {
            bVar.c(obj, j4);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            LockSupport.parkNanos(obj, j4);
        }
    }

    @kotlin.internal.f
    private static final void e() {
        b bVar = f79270a;
        if (bVar != null) {
            bVar.d();
        }
    }

    public static final void f(@fg.m b bVar) {
        f79270a = bVar;
    }

    @kotlin.internal.f
    private static final void g() {
        b bVar = f79270a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @kotlin.internal.f
    private static final void h() {
        b bVar = f79270a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @kotlin.internal.f
    private static final void i(Thread thread) {
        kotlin.k2 k2Var;
        b bVar = f79270a;
        if (bVar != null) {
            bVar.g(thread);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            LockSupport.unpark(thread);
        }
    }

    @kotlin.internal.f
    private static final void j() {
        b bVar = f79270a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @kotlin.internal.f
    private static final Runnable k(Runnable runnable) {
        Runnable i4;
        b bVar = f79270a;
        return (bVar == null || (i4 = bVar.i(runnable)) == null) ? runnable : i4;
    }
}
