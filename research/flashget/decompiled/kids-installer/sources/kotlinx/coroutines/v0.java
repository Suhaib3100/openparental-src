package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "m", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "g", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/m2;", "d", "", "message", "", "c", "j", "h", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "k", "(Lkotlinx/coroutines/u0;)Z", "isActive$annotations", "(Lkotlinx/coroutines/u0;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v0 {
    @d5.d
    public static final u0 a(@d5.d CoroutineContext coroutineContext) {
        if (coroutineContext.b(n2.INSTANCE) == null) {
            coroutineContext = coroutineContext.B(s2.c(null, 1, null));
        }
        return new kotlinx.coroutines.internal.j(coroutineContext);
    }

    @d5.d
    public static final u0 b() {
        return new kotlinx.coroutines.internal.j(q3.c(null, 1, null).B(m1.e()));
    }

    public static final void c(@d5.d u0 u0Var, @d5.d String str, @d5.e Throwable th) {
        d(u0Var, y1.a(str, th));
    }

    public static final void d(@d5.d u0 u0Var, @d5.e CancellationException cancellationException) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().b(n2.INSTANCE);
        if (n2Var != null) {
            n2Var.e(cancellationException);
        } else {
            throw new IllegalStateException((ProtectedSandApp.s("庌") + u0Var).toString());
        }
    }

    public static /* synthetic */ void e(u0 u0Var, String str, Throwable th, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        c(u0Var, str, th);
    }

    public static /* synthetic */ void f(u0 u0Var, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        d(u0Var, cancellationException);
    }

    @d5.e
    public static final <R> Object g(@d5.d q3.p<? super u0, ? super Continuation<? super R>, ? extends Object> pVar, @d5.d Continuation<? super R> continuation) {
        kotlinx.coroutines.internal.n0 n0Var = new kotlinx.coroutines.internal.n0(continuation.getF23291o(), continuation);
        Object f6 = q4.b.f(n0Var, n0Var, pVar);
        if (f6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return f6;
    }

    @d5.e
    public static final Object h(@d5.d Continuation<? super CoroutineContext> continuation) {
        return continuation.getF23291o();
    }

    private static final Object i(Continuation<? super CoroutineContext> continuation) {
        throw null;
    }

    public static final void j(@d5.d u0 u0Var) {
        s2.x(u0Var.getCoroutineContext());
    }

    public static final boolean k(@d5.d u0 u0Var) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().b(n2.INSTANCE);
        if (n2Var != null) {
            return n2Var.d();
        }
        return true;
    }

    public static /* synthetic */ void l(u0 u0Var) {
    }

    @d5.d
    public static final u0 m(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext) {
        return new kotlinx.coroutines.internal.j(u0Var.getCoroutineContext().B(coroutineContext));
    }
}
