package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;

/* compiled from: AbstractTimeSource.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "a", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lkotlin/m2;", "g", "h", "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lkotlinx/coroutines/b;", "Lkotlinx/coroutines/b;", "b", "()Lkotlinx/coroutines/b;", "f", "(Lkotlinx/coroutines/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private static b f27278a;

    @InlineOnly
    private static final long a() {
        b bVar = f27278a;
        return bVar != null ? bVar.a() : System.currentTimeMillis();
    }

    @d5.e
    public static final b b() {
        return f27278a;
    }

    @InlineOnly
    private static final long c() {
        b bVar = f27278a;
        return bVar != null ? bVar.b() : System.nanoTime();
    }

    @InlineOnly
    private static final void d(Object obj, long j5) {
        kotlin.m2 m2Var;
        b bVar = f27278a;
        if (bVar != null) {
            bVar.c(obj, j5);
            m2Var = kotlin.m2.f23662a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            LockSupport.parkNanos(obj, j5);
        }
    }

    @InlineOnly
    private static final void e() {
        b bVar = f27278a;
        if (bVar != null) {
            bVar.d();
        }
    }

    public static final void f(@d5.e b bVar) {
        f27278a = bVar;
    }

    @InlineOnly
    private static final void g() {
        b bVar = f27278a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @InlineOnly
    private static final void h() {
        b bVar = f27278a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @InlineOnly
    private static final void i(Thread thread) {
        kotlin.m2 m2Var;
        b bVar = f27278a;
        if (bVar != null) {
            bVar.g(thread);
            m2Var = kotlin.m2.f23662a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            LockSupport.unpark(thread);
        }
    }

    @InlineOnly
    private static final void j() {
        b bVar = f27278a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @InlineOnly
    private static final Runnable k(Runnable runnable) {
        Runnable i5;
        b bVar = f27278a;
        return (bVar == null || (i5 = bVar.i(runnable)) == null) ? runnable : i5;
    }
}
