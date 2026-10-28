package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.d3;

@Metadata(d1 = {"kotlinx/coroutines/channels/t", "kotlinx/coroutines/channels/u", "kotlinx/coroutines/channels/v"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final String f27391a = ProtectedSandApp.s("峘");

    @PublishedApi
    @d5.d
    public static final <E, R> g0<R> J(@d5.d g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super R>, ? extends Object> pVar) {
        return v.E(g0Var, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E, R> g0<R> L(@d5.d g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.q<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> qVar) {
        return v.G(g0Var, coroutineContext, qVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @d5.d
    public static final <E> kotlinx.coroutines.selects.d<E> U(@d5.d g0<? extends E> g0Var) {
        return g0Var.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @d5.e
    public static final <E> Object V(@d5.d g0<? extends E> g0Var, @d5.d Continuation<? super E> continuation) {
        return g0Var.C(continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ g0 W(g0 g0Var) {
        g0 F;
        F = v.F(g0Var, null, new v.c0(g0Var, null), 1, null);
        return F;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@d5.d k0<? super E> k0Var, E e6) {
        t.a(k0Var, e6);
    }

    @PublishedApi
    public static final void b(@d5.d g0<?> g0Var, @d5.e Throwable th) {
        u.a(g0Var, th);
    }

    @d3
    public static final <E, R> R c(@d5.d i<E> iVar, @d5.d q3.l<? super g0<? extends E>, ? extends R> lVar) {
        return (R) u.b(iVar, lVar);
    }

    public static final <E, R> R d(@d5.d g0<? extends E> g0Var, @d5.d q3.l<? super g0<? extends E>, ? extends R> lVar) {
        return (R) u.c(g0Var, lVar);
    }

    @d3
    @d5.e
    public static final <E> Object e(@d5.d i<E> iVar, @d5.d q3.l<? super E, m2> lVar, @d5.d Continuation<? super m2> continuation) {
        return u.d(iVar, lVar, continuation);
    }

    @d5.e
    @PublishedApi
    public static final <E, C extends k0<? super E>> Object e0(@d5.d g0<? extends E> g0Var, @d5.d C c6, @d5.d Continuation<? super C> continuation) {
        return v.W(g0Var, c6, continuation);
    }

    @d5.e
    public static final <E> Object f(@d5.d g0<? extends E> g0Var, @d5.d q3.l<? super E, m2> lVar, @d5.d Continuation<? super m2> continuation) {
        return u.e(g0Var, lVar, continuation);
    }

    @d5.e
    @PublishedApi
    public static final <E, C extends Collection<? super E>> Object f0(@d5.d g0<? extends E> g0Var, @d5.d C c6, @d5.d Continuation<? super C> continuation) {
        return v.X(g0Var, c6, continuation);
    }

    @PublishedApi
    @d5.d
    public static final q3.l<Throwable, m2> g(@d5.d g0<?> g0Var) {
        return new v.b(g0Var);
    }

    @d5.e
    public static final <E> Object g0(@d5.d g0<? extends E> g0Var, @d5.d Continuation<? super List<? extends E>> continuation) {
        return u.j(g0Var, continuation);
    }

    @PublishedApi
    @d5.d
    public static final q3.l<Throwable, m2> h(@d5.d g0<?>... g0VarArr) {
        return new v.c(g0VarArr);
    }

    @d5.e
    @PublishedApi
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@d5.d g0<? extends Pair<? extends K, ? extends V>> g0Var, @d5.d M m5, @d5.d Continuation<? super M> continuation) {
        return v.Y(g0Var, m5, continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ g0 j(g0 g0Var) {
        g0 g5;
        g5 = v.g(g0Var, null, new v.e(null), 1, null);
        return g5;
    }

    @PublishedApi
    @d5.d
    public static final <E, K> g0<E> k(@d5.d g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super K>, ? extends Object> pVar) {
        return v.f(g0Var, coroutineContext, pVar);
    }

    @d5.e
    @PublishedApi
    public static final <E> Object k0(@d5.d g0<? extends E> g0Var, @d5.d Continuation<? super Set<E>> continuation) {
        return v.b0(g0Var, continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object l0(g0 g0Var, Continuation continuation) {
        return v.b0(g0Var, continuation);
    }

    @d5.d
    public static final <E> Object m0(@d5.d k0<? super E> k0Var, E e6) {
        return t.b(k0Var, e6);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ g0 p0(g0 g0Var, g0 g0Var2) {
        g0 h02;
        h02 = v.h0(g0Var, g0Var2, null, v.l0.f27523p, 2, null);
        return h02;
    }

    @PublishedApi
    @d5.d
    public static final <E, R, V> g0<V> q0(@d5.d g0<? extends E> g0Var, @d5.d g0<? extends R> g0Var2, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super R, ? extends V> pVar) {
        return v.g0(g0Var, g0Var2, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E> g0<E> s(@d5.d g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return v.n(g0Var, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E> g0<E> y(@d5.d g0<? extends E> g0Var) {
        return v.t(g0Var);
    }
}
