package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.n2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/n2;", "parent", "Lkotlinx/coroutines/d0;", "a", "b", "(Lkotlinx/coroutines/n2;)Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/p1;", "handle", "w", "Lkotlin/m2;", "l", "(Lkotlinx/coroutines/n2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", "p", "", "q", "Lkotlin/coroutines/g;", "f", "e", "y", "x", "", "message", "g", "", "h", "o", "m", "n", "job", "B", "(Ljava/lang/Throwable;Lkotlinx/coroutines/n2;)Ljava/lang/Throwable;", "A", "(Lkotlin/coroutines/g;)Z", "isActive", "z", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/n2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class s2 {
    public static final boolean A(@d5.d CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        return n2Var != null && n2Var.d();
    }

    private static final Throwable B(Throwable th, n2 n2Var) {
        return th == null ? new JobCancellationException(ProtectedSandApp.s("帜"), null, n2Var) : th;
    }

    @d5.d
    public static final d0 a(@d5.e n2 n2Var) {
        return new p2(n2Var);
    }

    @p3.i(name = "Job")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final n2 b(n2 n2Var) {
        return new p2(n2Var);
    }

    public static d0 c(n2 n2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            n2Var = null;
        }
        return new p2(n2Var);
    }

    public static n2 d(n2 n2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            n2Var = null;
        }
        return new p2(n2Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void e(CoroutineContext coroutineContext) {
        f(coroutineContext, null);
    }

    public static final void f(@d5.d CoroutineContext coroutineContext, @d5.e CancellationException cancellationException) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var != null) {
            n2Var.e(cancellationException);
        }
    }

    public static final void g(@d5.d n2 n2Var, @d5.d String str, @d5.e Throwable th) {
        n2Var.e(y1.a(str, th));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th) {
        CoroutineContext.b b6 = coroutineContext.b(n2.INSTANCE);
        u2 u2Var = b6 instanceof u2 ? (u2) b6 : null;
        if (u2Var == null) {
            return false;
        }
        u2Var.y0(B(th, u2Var));
        return true;
    }

    public static void i(CoroutineContext coroutineContext, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        f(coroutineContext, cancellationException);
    }

    public static void j(n2 n2Var, String str, Throwable th, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        g(n2Var, str, th);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        return h(coroutineContext, th);
    }

    @d5.e
    public static final Object l(@d5.d n2 n2Var, @d5.d Continuation<? super kotlin.m2> continuation) {
        n2.a.b(n2Var, null, 1, null);
        Object H = n2Var.H(continuation);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : kotlin.m2.f23662a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void m(CoroutineContext coroutineContext) {
        o(coroutineContext, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(CoroutineContext coroutineContext, Throwable th) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var == null) {
            return;
        }
        for (n2 n2Var2 : n2Var.F()) {
            u2 u2Var = n2Var2 instanceof u2 ? (u2) n2Var2 : null;
            if (u2Var != null) {
                u2Var.y0(B(th, n2Var));
            }
        }
    }

    public static final void o(@d5.d CoroutineContext coroutineContext, @d5.e CancellationException cancellationException) {
        Sequence<n2> F;
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var == null || (F = n2Var.F()) == null) {
            return;
        }
        Iterator<n2> it = F.iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void p(n2 n2Var) {
        r(n2Var, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(n2 n2Var, Throwable th) {
        for (n2 n2Var2 : n2Var.F()) {
            u2 u2Var = n2Var2 instanceof u2 ? (u2) n2Var2 : null;
            if (u2Var != null) {
                u2Var.y0(B(th, n2Var));
            }
        }
    }

    public static final void r(@d5.d n2 n2Var, @d5.e CancellationException cancellationException) {
        Iterator<n2> it = n2Var.F().iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    public static /* synthetic */ void s(CoroutineContext coroutineContext, Throwable th, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        n(coroutineContext, th);
    }

    public static void t(CoroutineContext coroutineContext, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        o(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void u(n2 n2Var, Throwable th, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        q(n2Var, th);
    }

    public static void v(n2 n2Var, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        r(n2Var, cancellationException);
    }

    @d5.d
    public static final p1 w(@d5.d n2 n2Var, @d5.d p1 p1Var) {
        return n2Var.m0(new r1(p1Var));
    }

    public static final void x(@d5.d CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var != null) {
            y(n2Var);
        }
    }

    public static final void y(@d5.d n2 n2Var) {
        if (!n2Var.d()) {
            throw n2Var.O();
        }
    }

    @d5.d
    public static final n2 z(@d5.d CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException((ProtectedSandApp.s("帝") + coroutineContext).toString());
    }
}
