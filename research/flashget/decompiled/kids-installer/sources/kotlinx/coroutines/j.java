package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"kotlinx/coroutines/k", "kotlinx/coroutines/l"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class j {
    @d5.d
    public static final <T> c1<T> a(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, @d5.d w0 w0Var, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar) {
        return l.a(u0Var, coroutineContext, w0Var, pVar);
    }

    @d5.e
    public static final <T> Object c(@d5.d o0 o0Var, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return l.g(o0Var, pVar, continuation);
    }

    @d5.d
    public static final n2 d(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, @d5.d w0 w0Var, @d5.d q3.p<? super u0, ? super Continuation<? super kotlin.m2>, ? extends Object> pVar) {
        return l.e(u0Var, coroutineContext, w0Var, pVar);
    }

    public static final <T> T f(@d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar) throws InterruptedException {
        return (T) k.a(coroutineContext, pVar);
    }

    @d5.e
    public static final <T> Object h(@d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return l.g(coroutineContext, pVar, continuation);
    }
}
