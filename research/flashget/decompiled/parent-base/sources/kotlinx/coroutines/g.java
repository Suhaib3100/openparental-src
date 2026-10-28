package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/g;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/g;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/q1;", "eventLoop", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/q1;)V", "", "state", "Lkotlin/k2;", "y0", "(Ljava/lang/Object;)V", "b2", "()Ljava/lang/Object;", "e", "Ljava/lang/Thread;", "f", "Lkotlinx/coroutines/q1;", "", "o1", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes7.dex */
final class g<T> extends a<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Thread blockedThread;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final q1 eventLoop;

    public g(@fg.l kotlin.coroutines.g gVar, @fg.l Thread thread, @fg.m q1 q1Var) {
        super(gVar, true, true);
        this.blockedThread = thread;
        this.eventLoop = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T b2() {
        kotlin.k2 k2Var;
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            q1 q1Var = this.eventLoop;
            if (q1Var != null) {
                q1.B1(q1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    q1 q1Var2 = this.eventLoop;
                    long L1 = q1Var2 != null ? q1Var2.L1() : Long.MAX_VALUE;
                    if (l()) {
                        q1 q1Var3 = this.eventLoop;
                        if (q1Var3 != null) {
                            q1.k1(q1Var3, false, 1, null);
                        }
                        T t4 = (T) s2.h(i1());
                        d0 d0Var = t4 instanceof d0 ? (d0) t4 : null;
                        if (d0Var == null) {
                            return t4;
                        }
                        throw d0Var.cause;
                    }
                    b b6 = c.b();
                    if (b6 != null) {
                        b6.c(this, L1);
                        k2Var = kotlin.k2.f75408a;
                    } else {
                        k2Var = null;
                    }
                    if (k2Var == null) {
                        LockSupport.parkNanos(this, L1);
                    }
                } catch (Throwable th) {
                    q1 q1Var4 = this.eventLoop;
                    if (q1Var4 != null) {
                        q1.k1(q1Var4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            F0(interruptedException);
            throw interruptedException;
        } finally {
            b b7 = c.b();
            if (b7 != null) {
                b7.h();
            }
        }
    }

    @Override // kotlinx.coroutines.r2
    protected boolean o1() {
        return true;
    }

    @Override // kotlinx.coroutines.r2
    protected void y0(@fg.m Object state) {
        kotlin.k2 k2Var;
        if (kotlin.jvm.internal.l0.g(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        b b5 = c.b();
        if (b5 != null) {
            b5.g(thread);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            LockSupport.unpark(thread);
        }
    }
}
