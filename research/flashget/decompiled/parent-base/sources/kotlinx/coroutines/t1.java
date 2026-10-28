package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.a;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\t\u001a\u00020\u00072\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/q1;", "a", "()Lkotlinx/coroutines/q1;", "", "d", "()J", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "c", "(Lld/a;)V", "e", "Ljava/lang/Thread;", "", "b", "(Ljava/lang/Thread;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t1 {
    @fg.l
    public static final q1 a() {
        return new h(Thread.currentThread());
    }

    @kotlin.w0
    @e1
    @f2
    public static final boolean b(@fg.l Thread thread) {
        if (thread instanceof a.c) {
            return ((a.c) thread).p();
        }
        return false;
    }

    public static final void c(@fg.l ld.a<kotlin.k2> aVar) {
        aVar.invoke();
    }

    @f2
    public static final long d() {
        q1 a5 = n3.f80870a.a();
        if (a5 != null) {
            return a5.L1();
        }
        return Long.MAX_VALUE;
    }

    @kotlin.w0
    @e1
    @f2
    public static final long e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a.c) {
            return ((a.c) currentThread).t();
        }
        throw new IllegalStateException(ProtectedSandApp.s("裾\u0001") + currentThread);
    }
}
