package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.r1;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/q1;", "<init>", "()V", "Lkotlin/k2;", "a2", "", "now", "Lkotlinx/coroutines/r1$c;", "delayedTask", "W1", "(JLkotlinx/coroutines/r1$c;)V", "Ljava/lang/Thread;", "T1", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class s1 extends q1 {
    @fg.l
    /* renamed from: T1 */
    protected abstract Thread getThread();

    protected void W1(long now, @fg.l r1.c delayedTask) {
        x0.f81189j.q2(now, delayedTask);
    }

    protected final void a2() {
        kotlin.k2 k2Var;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
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
}
