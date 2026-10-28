package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.q0;
import kotlin.w0;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.channels.u;

@Metadata(d1 = {"kotlinx/coroutines/channels/s", "kotlinx/coroutines/channels/t", "kotlinx/coroutines/channels/u"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f79416a = ProtectedSandApp.s("虢\u0001");

    @fg.l
    @w0
    public static final <E, R> d0<R> J(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return u.E(d0Var, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E, R> d0<R> L(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return u.G(d0Var, gVar, qVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ d0 W(d0 d0Var) {
        d0 F;
        F = u.F(d0Var, null, new u.c0(d0Var, null), 1, null);
        return F;
    }

    @w0
    public static final void b(@fg.l d0<?> d0Var, @fg.m Throwable th) {
        t.a(d0Var, th);
    }

    @a3
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R c(@fg.l d<E> dVar, @fg.l ld.l<? super d0<? extends E>, ? extends R> lVar) {
        return (R) t.b(dVar, lVar);
    }

    public static final <E, R> R d(@fg.l d0<? extends E> d0Var, @fg.l ld.l<? super d0<? extends E>, ? extends R> lVar) {
        return (R) t.c(d0Var, lVar);
    }

    @fg.m
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object e(@fg.l d<E> dVar, @fg.l ld.l<? super E, k2> lVar, @fg.l kotlin.coroutines.d<? super k2> dVar2) {
        return t.d(dVar, lVar, dVar2);
    }

    @fg.m
    @w0
    public static final <E, C extends e0<? super E>> Object e0(@fg.l d0<? extends E> d0Var, @fg.l C c5, @fg.l kotlin.coroutines.d<? super C> dVar) {
        return u.W(d0Var, c5, dVar);
    }

    @fg.m
    public static final <E> Object f(@fg.l d0<? extends E> d0Var, @fg.l ld.l<? super E, k2> lVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return t.e(d0Var, lVar, dVar);
    }

    @fg.m
    @w0
    public static final <E, C extends Collection<? super E>> Object f0(@fg.l d0<? extends E> d0Var, @fg.l C c5, @fg.l kotlin.coroutines.d<? super C> dVar) {
        return u.X(d0Var, c5, dVar);
    }

    @fg.l
    @w0
    public static final ld.l<Throwable, k2> g(@fg.l d0<?> d0Var) {
        return new u.b(d0Var);
    }

    @fg.m
    public static final <E> Object g0(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.d<? super List<? extends E>> dVar) {
        return t.j(d0Var, dVar);
    }

    @fg.l
    @w0
    public static final ld.l<Throwable, k2> h(@fg.l d0<?>... d0VarArr) {
        return new u.c(d0VarArr);
    }

    @fg.m
    @w0
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@fg.l d0<? extends q0<? extends K, ? extends V>> d0Var, @fg.l M m4, @fg.l kotlin.coroutines.d<? super M> dVar) {
        return u.Y(d0Var, m4, dVar);
    }

    @fg.l
    @w0
    public static final <E, K> d0<E> k(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar) {
        return u.f(d0Var, gVar, pVar);
    }

    @fg.m
    @w0
    public static final <E> Object k0(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.d<? super Set<E>> dVar) {
        return u.b0(d0Var, dVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final Object l0(d0 d0Var, kotlin.coroutines.d dVar) {
        return u.b0(d0Var, dVar);
    }

    @fg.l
    public static final <E> Object m0(@fg.l e0<? super E> e0Var, E e4) {
        return s.b(e0Var, e4);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ d0 p0(d0 d0Var, d0 d0Var2) {
        d0 h02;
        h02 = u.h0(d0Var, d0Var2, null, u.l0.f79548b, 2, null);
        return h02;
    }

    @fg.l
    @w0
    public static final <E, R, V> d0<V> q0(@fg.l d0<? extends E> d0Var, @fg.l d0<? extends R> d0Var2, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super R, ? extends V> pVar) {
        return u.g0(d0Var, d0Var2, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E> d0<E> s(@fg.l d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return u.n(d0Var, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E> d0<E> y(@fg.l d0<? extends E> d0Var) {
        return u.t(d0Var);
    }
}
