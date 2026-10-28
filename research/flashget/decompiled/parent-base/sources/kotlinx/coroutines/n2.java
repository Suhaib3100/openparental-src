package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/o2", "kotlinx/coroutines/p2"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class n2 {
    public static final void A(@fg.l k2 k2Var) {
        p2.y(k2Var);
    }

    @fg.l
    public static final k2 B(@fg.l kotlin.coroutines.g gVar) {
        return p2.z(gVar);
    }

    public static final boolean C(@fg.l kotlin.coroutines.g gVar) {
        return p2.A(gVar);
    }

    @fg.l
    public static final b0 a(@fg.m k2 k2Var) {
        return new m2(k2Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kd.i(name = "Job")
    public static final k2 b(k2 k2Var) {
        return new m2(k2Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void e(kotlin.coroutines.g gVar) {
        p2.f(gVar, null);
    }

    public static final void f(@fg.l kotlin.coroutines.g gVar, @fg.m CancellationException cancellationException) {
        p2.f(gVar, cancellationException);
    }

    public static final void g(@fg.l k2 k2Var, @fg.l String str, @fg.m Throwable th) {
        p2.g(k2Var, str, th);
    }

    @fg.m
    public static final Object l(@fg.l k2 k2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        return p2.l(k2Var, dVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void m(kotlin.coroutines.g gVar) {
        p2.o(gVar, null);
    }

    public static final void o(@fg.l kotlin.coroutines.g gVar, @fg.m CancellationException cancellationException) {
        p2.o(gVar, cancellationException);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void p(k2 k2Var) {
        p2.r(k2Var, null);
    }

    public static final void r(@fg.l k2 k2Var, @fg.m CancellationException cancellationException) {
        p2.r(k2Var, cancellationException);
    }

    public static final void w(@fg.l p<?> pVar, @fg.l Future<?> future) {
        o2.a(pVar, future);
    }

    @fg.l
    @f2
    public static final m1 x(@fg.l k2 k2Var, @fg.l Future<?> future) {
        return o2.b(k2Var, future);
    }

    @fg.l
    public static final m1 y(@fg.l k2 k2Var, @fg.l m1 m1Var) {
        return p2.w(k2Var, m1Var);
    }

    public static final void z(@fg.l kotlin.coroutines.g gVar) {
        p2.x(gVar);
    }
}
