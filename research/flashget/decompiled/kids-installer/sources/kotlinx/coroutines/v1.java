package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.u1;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/t1;", "Lkotlin/m2;", "t1", "", "now", "Lkotlinx/coroutines/u1$c;", "delayedTask", "s1", "Ljava/lang/Thread;", "q1", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class v1 extends t1 {
    @d5.d
    /* renamed from: q1 */
    protected abstract Thread getThread();

    protected void s1(long j5, @d5.d u1.c cVar) {
        a1.f27251v.B1(j5, cVar);
    }

    protected final void t1() {
        kotlin.m2 m2Var;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
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
}
