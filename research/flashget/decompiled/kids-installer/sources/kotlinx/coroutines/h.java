package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/h;", "T", "Lkotlinx/coroutines/a;", "", "state", "Lkotlin/m2;", "s0", "K1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "q", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/t1;", "r", "Lkotlinx/coroutines/t1;", "eventLoop", "", "Z0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", "parentContext", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/t1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class h<T> extends a<T> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Thread blockedThread;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final t1 eventLoop;

    public h(@d5.d CoroutineContext coroutineContext, @d5.d Thread thread, @d5.e t1 t1Var) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T K1() {
        kotlin.m2 m2Var;
        b b6 = c.b();
        if (b6 != null) {
            b6.d();
        }
        try {
            t1 t1Var = this.eventLoop;
            if (t1Var != null) {
                t1.U0(t1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    t1 t1Var2 = this.eventLoop;
                    long i12 = t1Var2 != null ? t1Var2.i1() : Long.MAX_VALUE;
                    if (m()) {
                        T t5 = (T) v2.o(T0());
                        r3 = t5 instanceof f0 ? (f0) t5 : null;
                        if (r3 == null) {
                            return t5;
                        }
                        throw r3.cause;
                    }
                    b b7 = c.b();
                    if (b7 != null) {
                        b7.c(this, i12);
                        m2Var = kotlin.m2.f23662a;
                    } else {
                        m2Var = null;
                    }
                    if (m2Var == null) {
                        LockSupport.parkNanos(this, i12);
                    }
                } finally {
                    t1 t1Var3 = this.eventLoop;
                    if (t1Var3 != null) {
                        t1.M0(t1Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            x0(interruptedException);
            throw interruptedException;
        } finally {
            b b8 = c.b();
            if (b8 != null) {
                b8.h();
            }
        }
    }

    @Override // kotlinx.coroutines.u2
    protected boolean Z0() {
        return true;
    }

    @Override // kotlinx.coroutines.u2
    protected void s0(@d5.e Object obj) {
        kotlin.m2 m2Var;
        if (kotlin.jvm.internal.l0.g(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        b b6 = c.b();
        if (b6 != null) {
            b6.g(thread);
            m2Var = kotlin.m2.f23662a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            LockSupport.unpark(thread);
        }
    }
}
