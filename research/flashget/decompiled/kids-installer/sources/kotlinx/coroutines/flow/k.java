package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.n2;

@Metadata(d1 = {"kotlinx/coroutines/flow/l", "kotlinx/coroutines/flow/m", "kotlinx/coroutines/flow/n", "kotlinx/coroutines/flow/o", "kotlinx/coroutines/flow/p", "kotlinx/coroutines/flow/q", "kotlinx/coroutines/flow/r", "kotlinx/coroutines/flow/s", "kotlinx/coroutines/flow/t", "kotlinx/coroutines/flow/u", "kotlinx/coroutines/flow/v", "kotlinx/coroutines/flow/w", "kotlinx/coroutines/flow/x", "kotlinx/coroutines/flow/y", "kotlinx/coroutines/flow/z", "kotlinx/coroutines/flow/a0", "kotlinx/coroutines/flow/b0"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final String f28160a = ProtectedSandApp.s("嵤");

    @d5.e
    public static final <T> Object A(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d Continuation<? super m2> continuation) {
        return n.f(iVar, pVar, continuation);
    }

    @d2
    @d5.d
    public static final <T, R> i<R> A0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return w.a(iVar, pVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> A1(@d5.d i<? extends T> iVar, long j5) {
        return r.h(iVar, j5);
    }

    @d5.e
    public static final <T> Object B(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, @d5.d Continuation<? super m2> continuation) {
        return v.b(iVar, pVar, continuation);
    }

    @c2
    @d5.d
    public static final <T, R> i<R> B0(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return w.b(iVar, pVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> B1(@d5.d i<? extends T> iVar, long j5) {
        return r.i(iVar, j5);
    }

    @d2
    @d5.d
    public static final <T, R> i<R> C0(@d5.d i<? extends T> iVar, int i5, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return w.c(iVar, i5, pVar);
    }

    @d5.d
    public static final <T, R> i<R> C1(@d5.d i<? extends T> iVar, R r5, @BuilderInference @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new a0.h(r5, iVar, qVar);
    }

    @d5.d
    public static final <T1, T2, T3, T4, T5, R> i<R> D(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @d5.d i<? extends T5> iVar5, @d5.d q3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @d5.d
    public static final <T, R> i<R> D1(@d5.d i<? extends T> iVar, R r5, @BuilderInference @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return x.B(iVar, r5, qVar);
    }

    @d5.d
    public static final <T1, T2, T3, T4, R> i<R> E(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @d5.d q3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @d5.d
    public static final <T> i<T> E0(@d5.d i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @d5.d
    public static final <T> i<T> E1(@d5.d i<? extends T> iVar, @d5.d q3.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return new a0.j(iVar, qVar);
    }

    @d5.d
    public static final <T1, T2, T3, R> i<R> F(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @BuilderInference @d5.d q3.r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> F0(@d5.d i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @d5.d
    public static final <T> i0<T> F1(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d o0 o0Var, int i5) {
        return z.g(iVar, u0Var, o0Var, i5);
    }

    @d5.d
    public static final <T1, T2, R> i<R> G(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> G0(@d5.d i<? extends i<? extends T>> iVar, int i5) {
        return w.f(iVar, i5);
    }

    @d5.e
    public static final <T> Object H1(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.j(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @d5.d
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @d5.d i<? extends T5> iVar5, @d5.d q3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @d5.d
    public static final <T> i<T> I0(@BuilderInference @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @d5.e
    public static final <T> Object I1(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.k(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @d5.d
    public static final <T1, T2, T3, T4, R> i<R> J(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @d5.d q3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @p3.i(name = "flowCombine")
    @d5.d
    public static final <T1, T2, R> i<R> J0(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @ReplaceWith(expression = "drop(count)", imports = {}))
    @d5.d
    public static final <T> i<T> J1(@d5.d i<? extends T> iVar, int i5) {
        return x.D(iVar, i5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @d5.d
    public static final <T1, T2, T3, R> i<R> K(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d q3.r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @p3.i(name = "flowCombineTransform")
    @d5.d
    public static final <T1, T2, R> i<R> K0(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @BuilderInference @d5.d q3.r<? super j<? super R>, ? super T1, ? super T2, ? super Continuation<? super m2>, ? extends Object> rVar) {
        return b0.q(iVar, iVar2, rVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @d5.d
    public static final <T> i<T> K1(@d5.d i<? extends T> iVar, T t5) {
        return x.E(iVar, t5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @d5.d
    public static final <T1, T2, R> i<R> L(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @d5.d
    public static final <T> i<T> L0(T t5) {
        return new l.C0436l(t5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @d5.d
    public static final <T> i<T> L1(@d5.d i<? extends T> iVar, @d5.d i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @d5.d
    public static final <T> i<T> M0(@d5.d T... tArr) {
        return new l.k(tArr);
    }

    @d5.e
    public static final <T> Object M1(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d Continuation<? super t0<? extends T>> continuation) {
        return z.i(iVar, u0Var, continuation);
    }

    @d5.d
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @d5.d i<? extends T5> iVar5, @BuilderInference @d5.d q3.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super m2>, ? extends Object> uVar) {
        return b0.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @d5.d
    public static final <T> i<T> N0(@d5.d i<? extends T> iVar, @d5.d CoroutineContext coroutineContext) {
        return p.h(iVar, coroutineContext);
    }

    @d5.d
    public static final <T> t0<T> N1(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var, @d5.d o0 o0Var, T t5) {
        return z.j(iVar, u0Var, o0Var, t5);
    }

    @d5.d
    public static final <T1, T2, T3, T4, R> i<R> O(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @d5.d i<? extends T4> iVar4, @BuilderInference @d5.d q3.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super m2>, ? extends Object> tVar) {
        return b0.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @d5.e
    public static final <T, R> Object O0(@d5.d i<? extends T> iVar, R r5, @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, @d5.d Continuation<? super R> continuation) {
        return y.e(iVar, r5, qVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@d5.d i<? extends T> iVar) {
        x.G(iVar);
    }

    @d5.d
    public static final <T1, T2, T3, R> i<R> P(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d i<? extends T3> iVar3, @BuilderInference @d5.d q3.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super m2>, ? extends Object> sVar) {
        return b0.k(iVar, iVar2, iVar3, sVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar) {
        x.n(iVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar) {
        x.H(iVar, pVar);
    }

    @d5.d
    public static final <T1, T2, R> i<R> Q(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @BuilderInference @d5.d q3.r<? super j<? super R>, ? super T1, ? super T2, ? super Continuation<? super m2>, ? extends Object> rVar) {
        return b0.l(iVar, iVar2, rVar);
    }

    public static final int Q0() {
        return w.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d q3.p<? super Throwable, ? super Continuation<? super m2>, ? extends Object> pVar2) {
        x.I(iVar, pVar, pVar2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @d5.d
    public static final <T> i<T> R1(@d5.d i<? extends T> iVar, @d5.d CoroutineContext coroutineContext) {
        return x.J(iVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @ReplaceWith(expression = "let(transformer)", imports = {}))
    @d5.d
    public static final <T, R> i<R> S(@d5.d i<? extends T> iVar, @d5.d q3.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return x.f(iVar, lVar);
    }

    @d5.e
    public static final <T> Object S0(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.g(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @d5.d
    public static final <T, R> i<R> S1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return x.K(iVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @d5.d
    public static final <T, R> i<R> T(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, ? extends i<? extends R>> lVar) {
        return x.g(iVar, lVar);
    }

    @d5.e
    public static final <T> Object T0(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.h(iVar, continuation);
    }

    @d5.d
    public static final <T> i<T> T1(@d5.d i<? extends T> iVar, int i5) {
        return v.g(iVar, i5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @d5.d
    public static final <T> i<T> U(@d5.d i<? extends T> iVar, T t5) {
        return x.h(iVar, t5);
    }

    @d5.d
    public static final <T> n2 U0(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var) {
        return n.h(iVar, u0Var);
    }

    @d5.d
    public static final <T> i<T> U1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new v.j(iVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @d5.d
    public static final <T> i<T> V(@d5.d i<? extends T> iVar, @d5.d i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @d5.d
    public static final <T, R> i<R> V0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return new a0.e(iVar, pVar);
    }

    @d5.e
    public static final <T, C extends Collection<? super T>> Object V1(@d5.d i<? extends T> iVar, @d5.d C c6, @d5.d Continuation<? super C> continuation) {
        return o.a(iVar, c6, continuation);
    }

    @d5.d
    public static final <T> i<T> W(@d5.d i<? extends T> iVar) {
        return p.g(iVar);
    }

    @c2
    @d5.d
    public static final <T, R> i<R> W0(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return w.k(iVar, pVar);
    }

    @d5.e
    public static final <T> Object W1(@d5.d i<? extends T> iVar, @d5.d List<T> list, @d5.d Continuation<? super List<? extends T>> continuation) {
        return o.a(iVar, list, continuation);
    }

    @d5.d
    public static final <T> i<T> X(@d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return m.c(g0Var);
    }

    @d5.d
    public static final <T, R> i<R> X0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return new a0.f(iVar, pVar);
    }

    @d5.e
    public static final <T> Object Y(@d5.d i<? extends T> iVar, @d5.d Continuation<? super Integer> continuation) {
        return q.a(iVar, continuation);
    }

    @d5.d
    public static final <T> i<T> Y0(@d5.d Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @d5.e
    public static final <T> Object Y1(@d5.d i<? extends T> iVar, @d5.d Set<T> set, @d5.d Continuation<? super Set<? extends T>> continuation) {
        return o.a(iVar, set, continuation);
    }

    @d5.e
    public static final <T> Object Z(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, @d5.d Continuation<? super Integer> continuation) {
        return q.b(iVar, pVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @d5.d
    public static final <T> i<T> Z0(@d5.d i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @d5.d
    public static final <T> i<T> a(@d5.d Iterable<? extends T> iterable) {
        return new l.d(iterable);
    }

    @d2
    @d5.d
    public static final <T> i<T> a0(@d5.d i<? extends T> iVar, long j5) {
        return r.a(iVar, j5);
    }

    @d5.d
    public static final <T> i<T> a1(@d5.d i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @d5.d
    public static final <T, R> i<R> a2(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return t.g(iVar, qVar);
    }

    @d5.d
    public static final <T> i<T> b(@d5.d Iterator<? extends T> it) {
        return new l.e(it);
    }

    @d2
    @d5.d
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> b0(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, Long> lVar) {
        return r.b(iVar, lVar);
    }

    @d5.d
    public static final Void b1() {
        return x.p();
    }

    @c2
    @d5.d
    public static final <T, R> i<R> b2(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return w.n(iVar, qVar);
    }

    @d5.d
    public static final i<Integer> c(@d5.d IntRange intRange) {
        return new l.j(intRange);
    }

    @d2
    @d5.d
    public static final <T> i<T> c0(@d5.d i<? extends T> iVar, long j5) {
        return r.c(iVar, j5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @d5.d
    public static final <T> i<T> c1(@d5.d i<? extends T> iVar, @d5.d CoroutineContext coroutineContext) {
        return x.q(iVar, coroutineContext);
    }

    @d5.d
    public static final <T, R> i<R> c2(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar) {
        return v.i(iVar, qVar);
    }

    @d5.d
    public static final i<Long> d(@d5.d LongRange longRange) {
        return new l.a(longRange);
    }

    @d2
    @p3.i(name = "debounceDuration")
    @d5.d
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> d0(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, Duration> lVar) {
        return r.d(iVar, lVar);
    }

    @d5.d
    public static final <T> i<T> d1(@d5.d i<? extends T> iVar, @d5.d q3.q<? super j<? super T>, ? super Throwable, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new t.b(iVar, qVar);
    }

    @PublishedApi
    @d5.d
    public static final <T, R> i<R> d2(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new t.g(iVar, qVar);
    }

    @d5.d
    public static final <T> i<T> e(@d5.d Sequence<? extends T> sequence) {
        return new l.f(sequence);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @d5.d
    public static final <T> i<T> e0(@d5.d i<? extends T> iVar, long j5) {
        return x.j(iVar, j5);
    }

    @d5.d
    public static final <T> i<T> e1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new a0.g(iVar, pVar);
    }

    @d5.d
    public static final <T> i<IndexedValue<T>> e2(@d5.d i<? extends T> iVar) {
        return new a0.l(iVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @d5.d
    public static final <T> i<T> f(@d5.d kotlinx.coroutines.channels.i<T> iVar) {
        return new m.a(iVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @d5.d
    public static final <T> i<T> f0(@d5.d i<? extends T> iVar, long j5) {
        return x.k(iVar, j5);
    }

    @d5.d
    public static final <T> i<T> f1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new t.c(iVar, pVar);
    }

    @d5.d
    public static final <T1, T2, R> i<R> f2(@d5.d i<? extends T1> iVar, @d5.d i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new k.b(iVar2, iVar, qVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> g(@d5.d q3.a<? extends T> aVar) {
        return new l.b(aVar);
    }

    @d5.d
    public static final <T> i<T> g0(@d5.d i<? extends T> iVar) {
        return s.a(iVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @d5.d
    public static final <T> i<T> g1(@d5.d i<? extends T> iVar, @d5.d i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @d2
    @d5.d
    public static final <T> i<T> h(@d5.d q3.l<? super Continuation<? super T>, ? extends Object> lVar) {
        return new l.c(lVar);
    }

    @d5.d
    public static final <T> i<T> h0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super T, Boolean> pVar) {
        return s.b(iVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @d5.d
    public static final <T> i<T> h1(@d5.d i<? extends T> iVar, @d5.d i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @d5.d
    public static final i<Integer> i(@d5.d int[] iArr) {
        return new l.h(iArr);
    }

    @d5.d
    public static final <T, K> i<T> i0(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, ? extends K> lVar) {
        return s.c(iVar, lVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @d5.d
    public static final <T> i<T> i1(@d5.d i<? extends T> iVar, T t5) {
        return x.t(iVar, t5);
    }

    @d5.d
    public static final i<Long> j(@d5.d long[] jArr) {
        return new l.i(jArr);
    }

    @d5.d
    public static final <T> i<T> j0(@d5.d i<? extends T> iVar, int i5) {
        return v.d(iVar, i5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @d5.d
    public static final <T> i<T> j1(@d5.d i<? extends T> iVar, T t5, @d5.d q3.l<? super Throwable, Boolean> lVar) {
        return x.u(iVar, t5, lVar);
    }

    @d5.d
    public static final <T> i<T> k(@d5.d T[] tArr) {
        return new l.g(tArr);
    }

    @d5.d
    public static final <T> i<T> k0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new v.e(iVar, pVar);
    }

    @d5.d
    public static final <T> i0<T> l(@d5.d d0<T> d0Var) {
        return z.a(d0Var);
    }

    @d5.e
    public static final <T> Object l0(@d5.d j<? super T> jVar, @d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var, @d5.d Continuation<? super m2> continuation) {
        return m.d(jVar, g0Var, continuation);
    }

    @d5.d
    public static final <T> i<T> l1(@d5.d i<? extends T> iVar, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new t.e(pVar, iVar);
    }

    @d5.d
    public static final <T> t0<T> m(@d5.d e0<T> e0Var) {
        return z.b(e0Var);
    }

    @d5.e
    public static final <T> Object m0(@d5.d j<? super T> jVar, @d5.d i<? extends T> iVar, @d5.d Continuation<? super m2> continuation) {
        return n.g(jVar, iVar, continuation);
    }

    @d5.d
    public static final <T> i0<T> m1(@d5.d i0<? extends T> i0Var, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @d5.d
    public static final <T> i<T> n0() {
        return h.f27988o;
    }

    @d2
    @d5.d
    public static final <T> kotlinx.coroutines.channels.g0<T> n1(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var) {
        return m.f(iVar, u0Var);
    }

    @d5.d
    public static final <T> i<T> o(@d5.d i<? extends T> iVar, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        return p.b(iVar, i5, mVar);
    }

    public static final void o0(@d5.d j<?> jVar) {
        t.b(jVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @d5.d
    public static final <T> i<T> o1(@d5.d i<? extends T> iVar) {
        return x.w(iVar);
    }

    @d5.d
    public static final <T> i<T> p0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new a0.a(iVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @d5.d
    public static final <T> i<T> p1(@d5.d i<? extends T> iVar, int i5) {
        return x.x(iVar, i5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @d5.d
    public static final <T> i<T> q1(@d5.d i<? extends T> iVar, @d5.d CoroutineContext coroutineContext) {
        return x.y(iVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @d5.d
    public static final <T> i<T> r(@d5.d i<? extends T> iVar) {
        return x.a(iVar);
    }

    @d5.d
    public static final <T> i<T> r0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new a0.c(iVar, pVar);
    }

    @d5.d
    public static final <T> i<T> r1(@d5.d kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return m.g(g0Var);
    }

    @d5.d
    public static final <T> i<T> s(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return l.k(pVar);
    }

    @d5.d
    public static final <T> i<T> s0(@d5.d i<? extends T> iVar) {
        return new a0.d(iVar);
    }

    @d5.e
    public static final <S, T extends S> Object s1(@d5.d i<? extends T> iVar, @d5.d q3.q<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> qVar, @d5.d Continuation<? super S> continuation) {
        return y.i(iVar, qVar, continuation);
    }

    @d5.d
    public static final <T> i<T> t(@d5.d i<? extends T> iVar) {
        return p.e(iVar);
    }

    @d5.e
    public static final <T> Object t0(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.a(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @d5.d
    public static final <T> i<T> t1(@d5.d i<? extends T> iVar) {
        return x.z(iVar);
    }

    @d5.d
    public static final <T> i<T> u(@d5.d i<? extends T> iVar, @d5.d q3.q<? super j<? super T>, ? super Throwable, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new u.a(iVar, qVar);
    }

    @d5.e
    public static final <T> Object u0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return y.b(iVar, pVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @d5.d
    public static final <T> i<T> u1(@d5.d i<? extends T> iVar, int i5) {
        return x.A(iVar, i5);
    }

    @d5.e
    public static final <T> Object v(@d5.d i<? extends T> iVar, @d5.d j<? super T> jVar, @d5.d Continuation<? super Throwable> continuation) {
        return u.b(iVar, jVar, continuation);
    }

    @d5.e
    public static final <T> Object v0(@d5.d i<? extends T> iVar, @d5.d Continuation<? super T> continuation) {
        return y.c(iVar, continuation);
    }

    @d5.d
    public static final <T> i<T> v1(@d5.d i<? extends T> iVar, long j5, @d5.d q3.p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return u.e(iVar, j5, pVar);
    }

    @d5.d
    public static final <T> i<T> w(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return l.l(pVar);
    }

    @d5.e
    public static final <T> Object w0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return y.d(iVar, pVar, continuation);
    }

    @d5.e
    public static final Object x(@d5.d i<?> iVar, @d5.d Continuation<? super m2> continuation) {
        return n.a(iVar, continuation);
    }

    @d5.d
    public static final kotlinx.coroutines.channels.g0<m2> x0(@d5.d kotlinx.coroutines.u0 u0Var, long j5, long j6) {
        return r.f(u0Var, j5, j6);
    }

    @d5.d
    public static final <T> i<T> x1(@d5.d i<? extends T> iVar, @d5.d q3.r<? super j<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> rVar) {
        return new u.f(iVar, rVar);
    }

    @d5.d
    public static final <T, R> i<R> y1(@d5.d i<? extends T> iVar, R r5, @BuilderInference @d5.d q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new a0.h(r5, iVar, qVar);
    }

    @d5.e
    public static final <T> Object z(@d5.d i<? extends T> iVar, @d5.d q3.q<? super Integer, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, @d5.d Continuation<? super m2> continuation) {
        return n.d(iVar, qVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @d5.d
    public static final <T, R> i<R> z0(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> pVar) {
        return x.l(iVar, pVar);
    }

    @d5.d
    public static final <T> i<T> z1(@d5.d i<? extends T> iVar, @d5.d q3.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return new a0.j(iVar, qVar);
    }
}
