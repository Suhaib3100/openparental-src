package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Supervisor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/n2;", "parent", "Lkotlinx/coroutines/d0;", "a", "b", "(Lkotlinx/coroutines/n2;)Lkotlinx/coroutines/n2;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "e", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q3 {
    @d5.d
    public static final d0 a(@d5.e n2 n2Var) {
        return new p3(n2Var);
    }

    @p3.i(name = "SupervisorJob")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final n2 b(n2 n2Var) {
        return new p3(n2Var);
    }

    public static d0 c(n2 n2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            n2Var = null;
        }
        return new p3(n2Var);
    }

    public static n2 d(n2 n2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            n2Var = null;
        }
        return new p3(n2Var);
    }

    @d5.e
    public static final <R> Object e(@d5.d q3.p<? super u0, ? super Continuation<? super R>, ? extends Object> pVar, @d5.d Continuation<? super R> continuation) {
        o3 o3Var = new o3(continuation.getF23291o(), continuation);
        Object f6 = q4.b.f(o3Var, o3Var, pVar);
        if (f6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return f6;
    }
}
