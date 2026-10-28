package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"kotlinx/coroutines/r2", "kotlinx/coroutines/s2"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q2 {
    public static final void A(@d5.d n2 n2Var) {
        s2.y(n2Var);
    }

    @d5.d
    public static final n2 B(@d5.d CoroutineContext coroutineContext) {
        return s2.z(coroutineContext);
    }

    public static final boolean C(@d5.d CoroutineContext coroutineContext) {
        return s2.A(coroutineContext);
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

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void e(CoroutineContext coroutineContext) {
        s2.f(coroutineContext, null);
    }

    public static final void f(@d5.d CoroutineContext coroutineContext, @d5.e CancellationException cancellationException) {
        s2.f(coroutineContext, cancellationException);
    }

    public static final void g(@d5.d n2 n2Var, @d5.d String str, @d5.e Throwable th) {
        s2.g(n2Var, str, th);
    }

    @d5.e
    public static final Object l(@d5.d n2 n2Var, @d5.d Continuation<? super kotlin.m2> continuation) {
        return s2.l(n2Var, continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void m(CoroutineContext coroutineContext) {
        s2.o(coroutineContext, null);
    }

    public static final void o(@d5.d CoroutineContext coroutineContext, @d5.e CancellationException cancellationException) {
        s2.o(coroutineContext, cancellationException);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void p(n2 n2Var) {
        s2.r(n2Var, null);
    }

    public static final void r(@d5.d n2 n2Var, @d5.e CancellationException cancellationException) {
        s2.r(n2Var, cancellationException);
    }

    public static final void w(@d5.d q<?> qVar, @d5.d Future<?> future) {
        r2.a(qVar, future);
    }

    @d5.d
    @i2
    public static final p1 x(@d5.d n2 n2Var, @d5.d Future<?> future) {
        return r2.b(n2Var, future);
    }

    @d5.d
    public static final p1 y(@d5.d n2 n2Var, @d5.d p1 p1Var) {
        return s2.w(n2Var, p1Var);
    }

    public static final void z(@d5.d CoroutineContext coroutineContext) {
        s2.x(coroutineContext);
    }
}
