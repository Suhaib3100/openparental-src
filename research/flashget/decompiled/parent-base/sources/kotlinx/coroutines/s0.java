package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aO\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u001b\u0010$\u001a\u00020 *\u00020\u00008F¢\u0006\f\u0012\u0004\b#\u0010\u001d\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "m", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;)Lkotlinx/coroutines/r0;", "b", "()Lkotlinx/coroutines/r0;", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "g", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/r0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/r0;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(Lkotlinx/coroutines/r0;Ljava/lang/String;Ljava/lang/Throwable;)V", "j", "(Lkotlinx/coroutines/r0;)V", "h", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "k", "(Lkotlinx/coroutines/r0;)Z", "l", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s0 {
    @fg.l
    public static final r0 a(@fg.l kotlin.coroutines.g gVar) {
        if (gVar.c(k2.INSTANCE) == null) {
            gVar = gVar.O(p2.c(null, 1, null));
        }
        return new kotlinx.coroutines.internal.h(gVar);
    }

    @fg.l
    public static final r0 b() {
        return new kotlinx.coroutines.internal.h(k3.c(null, 1, null).O(j1.e()));
    }

    public static final void c(@fg.l r0 r0Var, @fg.l String str, @fg.m Throwable th) {
        d(r0Var, v1.a(str, th));
    }

    public static final void d(@fg.l r0 r0Var, @fg.m CancellationException cancellationException) {
        k2 k2Var = (k2) r0Var.getCoroutineContext().c(k2.INSTANCE);
        if (k2Var != null) {
            k2Var.b(cancellationException);
        } else {
            throw new IllegalStateException((ProtectedSandApp.s("衦\u0001") + r0Var).toString());
        }
    }

    public static /* synthetic */ void e(r0 r0Var, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        c(r0Var, str, th);
    }

    public static /* synthetic */ void f(r0 r0Var, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        d(r0Var, cancellationException);
    }

    @fg.m
    public static final <R> Object g(@fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.internal.o0 o0Var = new kotlinx.coroutines.internal.o0(dVar.getContext(), dVar);
        Object e4 = me.b.e(o0Var, o0Var, pVar);
        if (e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e4;
    }

    @fg.m
    public static final Object h(@fg.l kotlin.coroutines.d<? super kotlin.coroutines.g> dVar) {
        return dVar.getContext();
    }

    private static final Object i(kotlin.coroutines.d<? super kotlin.coroutines.g> dVar) {
        throw null;
    }

    public static final void j(@fg.l r0 r0Var) {
        p2.x(r0Var.getCoroutineContext());
    }

    public static final boolean k(@fg.l r0 r0Var) {
        k2 k2Var = (k2) r0Var.getCoroutineContext().c(k2.INSTANCE);
        if (k2Var != null) {
            return k2Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void l(r0 r0Var) {
    }

    @fg.l
    public static final r0 m(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar) {
        return new kotlinx.coroutines.internal.h(r0Var.getCoroutineContext().O(gVar));
    }
}
