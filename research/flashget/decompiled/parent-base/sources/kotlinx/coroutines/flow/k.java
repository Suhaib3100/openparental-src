package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.z1;

@Metadata(d1 = {"kotlinx/coroutines/flow/l", "kotlinx/coroutines/flow/m", "kotlinx/coroutines/flow/n", "kotlinx/coroutines/flow/o", "kotlinx/coroutines/flow/p", "kotlinx/coroutines/flow/q", "kotlinx/coroutines/flow/r", "kotlinx/coroutines/flow/s", "kotlinx/coroutines/flow/t", "kotlinx/coroutines/flow/u", "kotlinx/coroutines/flow/v", "kotlinx/coroutines/flow/w", "kotlinx/coroutines/flow/x", "kotlinx/coroutines/flow/y", "kotlinx/coroutines/flow/z", "kotlinx/coroutines/flow/a0", "kotlinx/coroutines/flow/b0"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f80193a = ProtectedSandApp.s("蝄\u0001");

    @fg.m
    public static final <T> Object A(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n.f(iVar, pVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.x0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> A0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.l(iVar, pVar);
    }

    @fg.l
    public static final <T> i<T> A1(@fg.l i<? extends T> iVar, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return new a0.k(iVar, qVar);
    }

    @fg.m
    public static final <T> Object B(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return v.b(iVar, pVar, dVar);
    }

    @fg.l
    @z1
    public static final <T, R> i<R> B0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.a(iVar, pVar);
    }

    @fg.l
    @a2
    public static final <T> i<T> B1(@fg.l i<? extends T> iVar, long j4) {
        return r.h(iVar, j4);
    }

    @fg.l
    @z1
    public static final <T, R> i<R> C0(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.b(iVar, pVar);
    }

    @fg.l
    @a2
    public static final <T> i<T> C1(@fg.l i<? extends T> iVar, long j4) {
        return r.i(iVar, j4);
    }

    @fg.l
    public static final <T1, T2, T3, T4, T5, R> i<R> D(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l i<? extends T5> iVar5, @fg.l ld.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @fg.l
    @z1
    public static final <T, R> i<R> D0(@fg.l i<? extends T> iVar, int i4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.c(iVar, i4, pVar);
    }

    @fg.l
    public static final <T, R> i<R> D1(@fg.l i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new a0.i(r4, iVar, qVar);
    }

    @fg.l
    public static final <T1, T2, T3, T4, R> i<R> E(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l ld.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.x0(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> E1(@fg.l i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return x.B(iVar, r4, qVar);
    }

    @fg.l
    public static final <T1, T2, T3, R> i<R> F(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l @InterfaceC1469b ld.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.x0(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> F0(@fg.l i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.x0(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> F1(@fg.l i<? extends T> iVar, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return new a0.k(iVar, qVar);
    }

    @fg.l
    public static final <T1, T2, R> i<R> G(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @fg.l
    @z1
    public static final <T> i<T> G0(@fg.l i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @fg.l
    public static final <T> i0<T> G1(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l o0 o0Var, int i4) {
        return z.g(iVar, r0Var, o0Var, i4);
    }

    @fg.l
    @z1
    public static final <T> i<T> H0(@fg.l i<? extends i<? extends T>> iVar, int i4) {
        return w.f(iVar, i4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l i<? extends T5> iVar5, @fg.l ld.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @fg.m
    public static final <T> Object I1(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.j(iVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> J(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l ld.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @fg.l
    public static final <T> i<T> J0(@fg.l @InterfaceC1469b ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @fg.m
    public static final <T> Object J1(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.k(iVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> K(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l ld.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @fg.l
    @kd.i(name = "flowCombine")
    public static final <T1, T2, R> i<R> K0(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.x0(expression = "drop(count)", imports = {}))
    public static final <T> i<T> K1(@fg.l i<? extends T> iVar, int i4) {
        return x.D(iVar, i4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> L(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @fg.l
    @kd.i(name = "flowCombineTransform")
    public static final <T1, T2, R> i<R> L0(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l @InterfaceC1469b ld.r<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super k2>, ? extends Object> rVar) {
        return b0.q(iVar, iVar2, rVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.x0(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> L1(@fg.l i<? extends T> iVar, T t4) {
        return x.E(iVar, t4);
    }

    @fg.l
    public static final <T> i<T> M0(T t4) {
        return new l.C1243l(t4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.x0(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> M1(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @fg.l
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l i<? extends T5> iVar5, @fg.l @InterfaceC1469b ld.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super k2>, ? extends Object> uVar) {
        return b0.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @fg.l
    public static final <T> i<T> N0(@fg.l T... tArr) {
        return new l.k(tArr);
    }

    @fg.m
    public static final <T> Object N1(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l kotlin.coroutines.d<? super t0<? extends T>> dVar) {
        return z.i(iVar, r0Var, dVar);
    }

    @fg.l
    public static final <T1, T2, T3, T4, R> i<R> O(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l @InterfaceC1469b ld.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super k2>, ? extends Object> tVar) {
        return b0.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @fg.l
    public static final <T> i<T> O0(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        return p.h(iVar, gVar);
    }

    @fg.l
    public static final <T> t0<T> O1(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l o0 o0Var, T t4) {
        return z.j(iVar, r0Var, o0Var, t4);
    }

    @fg.l
    public static final <T1, T2, T3, R> i<R> P(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l @InterfaceC1469b ld.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super k2>, ? extends Object> sVar) {
        return b0.k(iVar, iVar2, iVar3, sVar);
    }

    @fg.m
    public static final <T, R> Object P0(@fg.l i<? extends T> iVar, R r4, @fg.l ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return y.e(iVar, r4, qVar, dVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@fg.l i<? extends T> iVar) {
        x.G(iVar);
    }

    @fg.l
    public static final <T1, T2, R> i<R> Q(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l @InterfaceC1469b ld.r<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super k2>, ? extends Object> rVar) {
        return b0.l(iVar, iVar2, rVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.x0(expression = "collect(action)", imports = {}))
    public static final <T> void Q0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        x.n(iVar, pVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        x.H(iVar, pVar);
    }

    public static final int R0() {
        return w.h();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void R1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l ld.p<? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar2) {
        x.I(iVar, pVar, pVar2);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.x0(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> S(@fg.l i<? extends T> iVar, @fg.l ld.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return x.f(iVar, lVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> S1(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        return x.J(iVar, gVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.x0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> T(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, ? extends i<? extends R>> lVar) {
        return x.g(iVar, lVar);
    }

    @fg.m
    public static final <T> Object T0(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.g(iVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.x0(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> T1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.K(iVar, pVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.x0(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> U(@fg.l i<? extends T> iVar, T t4) {
        return x.h(iVar, t4);
    }

    @fg.m
    public static final <T> Object U0(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.h(iVar, dVar);
    }

    @fg.l
    public static final <T> i<T> U1(@fg.l i<? extends T> iVar, int i4) {
        return v.g(iVar, i4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.x0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> V(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.k2 V0(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var) {
        return n.h(iVar, r0Var);
    }

    @fg.l
    public static final <T> i<T> V1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new v.j(iVar, pVar);
    }

    @fg.l
    public static final <T> i<T> W(@fg.l i<? extends T> iVar) {
        return p.g(iVar);
    }

    @fg.l
    public static final <T, R> i<R> W0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new a0.f(iVar, pVar);
    }

    @fg.l
    @a2
    public static final <T> i<T> W1(@fg.l i<? extends T> iVar, long j4) {
        return r.j(iVar, j4);
    }

    @fg.l
    public static final <T> i<T> X(@fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var) {
        return m.c(d0Var);
    }

    @fg.l
    @z1
    public static final <T, R> i<R> X0(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return w.k(iVar, pVar);
    }

    @fg.m
    public static final <T, C extends Collection<? super T>> Object X1(@fg.l i<? extends T> iVar, @fg.l C c5, @fg.l kotlin.coroutines.d<? super C> dVar) {
        return o.a(iVar, c5, dVar);
    }

    @fg.m
    public static final <T> Object Y(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super Integer> dVar) {
        return q.a(iVar, dVar);
    }

    @fg.l
    public static final <T, R> i<R> Y0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new a0.g(iVar, pVar);
    }

    @fg.m
    public static final <T> Object Y1(@fg.l i<? extends T> iVar, @fg.l List<T> list, @fg.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return o.a(iVar, list, dVar);
    }

    @fg.m
    public static final <T> Object Z(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super Integer> dVar) {
        return q.b(iVar, pVar, dVar);
    }

    @fg.l
    public static final <T> i<T> Z0(@fg.l Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @fg.l
    public static final <T> i<T> a(@fg.l Iterable<? extends T> iterable) {
        return new l.d(iterable);
    }

    @fg.l
    @a2
    public static final <T> i<T> a0(@fg.l i<? extends T> iVar, long j4) {
        return r.a(iVar, j4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.x0(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> a1(@fg.l i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @fg.m
    public static final <T> Object a2(@fg.l i<? extends T> iVar, @fg.l Set<T> set, @fg.l kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return o.a(iVar, set, dVar);
    }

    @fg.l
    public static final <T> i<T> b(@fg.l Iterator<? extends T> it) {
        return new l.e(it);
    }

    @fg.l
    @kotlin.p0
    @a2
    public static final <T> i<T> b0(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, Long> lVar) {
        return r.b(iVar, lVar);
    }

    @fg.l
    public static final <T> i<T> b1(@fg.l i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @fg.l
    public static final i<Integer> c(@fg.l kotlin.ranges.l lVar) {
        return new l.j(lVar);
    }

    @fg.l
    @a2
    public static final <T> i<T> c0(@fg.l i<? extends T> iVar, long j4) {
        return r.c(iVar, j4);
    }

    @fg.l
    public static final Void c1() {
        return x.p();
    }

    @fg.l
    public static final <T, R> i<R> c2(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return t.g(iVar, qVar);
    }

    @fg.l
    public static final i<Long> d(@fg.l kotlin.ranges.o oVar) {
        return new l.a(oVar);
    }

    @fg.l
    @kd.i(name = "debounceDuration")
    @kotlin.p0
    @a2
    public static final <T> i<T> d0(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, kotlin.time.e> lVar) {
        return r.d(iVar, lVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> d1(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        return x.q(iVar, gVar);
    }

    @fg.l
    @z1
    public static final <T, R> i<R> d2(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return w.n(iVar, qVar);
    }

    @fg.l
    public static final <T> i<T> e(@fg.l kotlin.sequences.m<? extends T> mVar) {
        return new l.f(mVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.x0(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> e0(@fg.l i<? extends T> iVar, long j4) {
        return x.j(iVar, j4);
    }

    @fg.l
    public static final <T> i<T> e1(@fg.l i<? extends T> iVar, @fg.l ld.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new t.b(iVar, qVar);
    }

    @fg.l
    public static final <T, R> i<R> e2(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar) {
        return v.i(iVar, qVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> f(@fg.l kotlinx.coroutines.channels.d<T> dVar) {
        return new m.a(dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.x0(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> f0(@fg.l i<? extends T> iVar, long j4) {
        return x.k(iVar, j4);
    }

    @fg.l
    public static final <T> i<T> f1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new a0.h(iVar, pVar);
    }

    @fg.l
    @kotlin.w0
    public static final <T, R> i<R> f2(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new t.g(iVar, qVar);
    }

    @fg.l
    public static final <T> i<T> g(@fg.l ld.a<? extends T> aVar) {
        return new l.b(aVar);
    }

    @fg.l
    public static final <T> i<T> g0(@fg.l i<? extends T> iVar) {
        return s.a(iVar);
    }

    @fg.l
    public static final <T> i<T> g1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new t.c(iVar, pVar);
    }

    @fg.l
    public static final <T> i<kotlin.collections.r0<T>> g2(@fg.l i<? extends T> iVar) {
        return new a0.m(iVar);
    }

    @fg.l
    public static final <T> i<T> h(@fg.l ld.l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        return new l.c(lVar);
    }

    @fg.l
    public static final <T> i<T> h0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super T, Boolean> pVar) {
        return s.b(iVar, pVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> h1(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @fg.l
    public static final <T1, T2, R> i<R> h2(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new k.b(iVar2, iVar, qVar);
    }

    @fg.l
    public static final i<Integer> i(@fg.l int[] iArr) {
        return new l.h(iArr);
    }

    @fg.l
    public static final <T, K> i<T> i0(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, ? extends K> lVar) {
        return s.c(iVar, lVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> i1(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @fg.l
    public static final i<Long> j(@fg.l long[] jArr) {
        return new l.i(jArr);
    }

    @fg.l
    public static final <T> i<T> j0(@fg.l i<? extends T> iVar, int i4) {
        return v.d(iVar, i4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> j1(@fg.l i<? extends T> iVar, T t4) {
        return x.t(iVar, t4);
    }

    @fg.l
    public static final <T> i<T> k(@fg.l T[] tArr) {
        return new l.g(tArr);
    }

    @fg.l
    public static final <T> i<T> k0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new v.e(iVar, pVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.x0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> k1(@fg.l i<? extends T> iVar, T t4, @fg.l ld.l<? super Throwable, Boolean> lVar) {
        return x.u(iVar, t4, lVar);
    }

    @fg.l
    public static final <T> i0<T> l(@fg.l d0<T> d0Var) {
        return z.a(d0Var);
    }

    @fg.m
    public static final <T> Object l0(@fg.l j<? super T> jVar, @fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return m.d(jVar, d0Var, dVar);
    }

    @fg.l
    public static final <T> t0<T> m(@fg.l e0<T> e0Var) {
        return z.b(e0Var);
    }

    @fg.m
    public static final <T> Object m0(@fg.l j<? super T> jVar, @fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n.g(jVar, iVar, dVar);
    }

    @fg.l
    public static final <T> i<T> m1(@fg.l i<? extends T> iVar, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new t.e(pVar, iVar);
    }

    @fg.l
    public static final <T> i<T> n0() {
        return h.f80019b;
    }

    @fg.l
    public static final <T> i0<T> n1(@fg.l i0<? extends T> i0Var, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @fg.l
    public static final <T> i<T> o(@fg.l i<? extends T> iVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar2) {
        return p.b(iVar, i4, iVar2);
    }

    public static final void o0(@fg.l j<?> jVar) {
        t.b(jVar);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.channels.d0<T> o1(@fg.l i<? extends T> iVar, @fg.l kotlinx.coroutines.r0 r0Var) {
        return m.f(iVar, r0Var);
    }

    @fg.l
    public static final <T> i<T> p0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new a0.a(iVar, pVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> p1(@fg.l i<? extends T> iVar) {
        return x.w(iVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> q1(@fg.l i<? extends T> iVar, int i4) {
        return x.x(iVar, i4);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> r(@fg.l i<? extends T> iVar) {
        return x.a(iVar);
    }

    @fg.l
    public static final <R> i<R> r0(@fg.l i<?> iVar, @fg.l kotlin.reflect.d<R> dVar) {
        return new a0.c(iVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> r1(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        return x.y(iVar, gVar);
    }

    @fg.l
    public static final <T> i<T> s(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return l.k(pVar);
    }

    @fg.l
    public static final <T> i<T> s0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new a0.d(iVar, pVar);
    }

    @fg.l
    public static final <T> i<T> s1(@fg.l kotlinx.coroutines.channels.d0<? extends T> d0Var) {
        return m.g(d0Var);
    }

    @fg.l
    public static final <T> i<T> t(@fg.l i<? extends T> iVar) {
        return p.e(iVar);
    }

    @fg.l
    public static final <T> i<T> t0(@fg.l i<? extends T> iVar) {
        return new a0.e(iVar);
    }

    @fg.m
    public static final <S, T extends S> Object t1(@fg.l i<? extends T> iVar, @fg.l ld.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super S> dVar) {
        return y.i(iVar, qVar, dVar);
    }

    @fg.l
    public static final <T> i<T> u(@fg.l i<? extends T> iVar, @fg.l ld.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new u.a(iVar, qVar);
    }

    @fg.m
    public static final <T> Object u0(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.a(iVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> u1(@fg.l i<? extends T> iVar) {
        return x.z(iVar);
    }

    @fg.m
    public static final <T> Object v(@fg.l i<? extends T> iVar, @fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<? super Throwable> dVar) {
        return u.b(iVar, jVar, dVar);
    }

    @fg.m
    public static final <T> Object v0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.b(iVar, pVar, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> v1(@fg.l i<? extends T> iVar, int i4) {
        return x.A(iVar, i4);
    }

    @fg.l
    public static final <T> i<T> w(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return l.l(pVar);
    }

    @fg.m
    public static final <T> Object w0(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.c(iVar, dVar);
    }

    @fg.l
    public static final <T> i<T> w1(@fg.l i<? extends T> iVar, long j4, @fg.l ld.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return u.e(iVar, j4, pVar);
    }

    @fg.m
    public static final Object x(@fg.l i<?> iVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n.a(iVar, dVar);
    }

    @fg.m
    public static final <T> Object x0(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return y.d(iVar, pVar, dVar);
    }

    @fg.l
    public static final kotlinx.coroutines.channels.d0<k2> y0(@fg.l kotlinx.coroutines.r0 r0Var, long j4, long j5) {
        return r.f(r0Var, j4, j5);
    }

    @fg.l
    public static final <T> i<T> y1(@fg.l i<? extends T> iVar, @fg.l ld.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        return new u.f(iVar, rVar);
    }

    @fg.m
    public static final <T> Object z(@fg.l i<? extends T> iVar, @fg.l ld.q<? super Integer, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n.d(iVar, qVar, dVar);
    }

    @fg.l
    public static final <T, R> i<R> z1(@fg.l i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new a0.i(r4, iVar, qVar);
    }
}
