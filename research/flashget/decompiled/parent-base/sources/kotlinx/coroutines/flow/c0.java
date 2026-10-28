package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.u;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Lint.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ao\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0014¢\u0006\u0002\b\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ah\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e23\b\n\u0010\"\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190 H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0084\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\"\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190%¢\u0006\u0002\b\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a)\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a1\u0010/\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0087Hø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a)\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b2\u0010+\u001a1\u00104\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0087Hø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u000206\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b7\u0010+\"\"\u0010<\u001a\u00020!*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109\"\"\u0010@\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010;\u001a\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"T", "Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/i;", "c", "(Lkotlinx/coroutines/flow/i0;)Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "h", "(Lkotlinx/coroutines/flow/i0;Lkotlin/coroutines/g;)Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/t0;", "e", "(Lkotlinx/coroutines/flow/t0;)Lkotlinx/coroutines/flow/i;", "g", "Lkotlinx/coroutines/flow/j;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "action", "d", "(Lkotlinx/coroutines/flow/i0;Lld/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Lkotlinx/coroutines/flow/i0;JLld/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", "o", "(Lkotlinx/coroutines/flow/i0;Lld/r;)Lkotlinx/coroutines/flow/i;", "", "q", "(Lkotlinx/coroutines/flow/i0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "destination", "", "p", "(Lkotlinx/coroutines/flow/i0;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "s", "", "r", "(Lkotlinx/coroutines/flow/i0;Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "f", "k", "(Lkotlinx/coroutines/flow/j;)Z", "l", "(Lkotlinx/coroutines/flow/j;)V", "isActive", "i", "(Lkotlinx/coroutines/flow/j;)Lkotlin/coroutines/g;", "j", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c0 {

    /* compiled from: Lint.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nLint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lint.kt\nkotlinx/coroutines/flow/LintKt$retry$1\n*L\n1#1,193:1\n*E\n"})
    public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79996b;

        public a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l Throwable th, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(th, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f79996b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("蜀\u0001"));
            }
            a1.n(obj);
            return Boolean.TRUE;
        }
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.x0(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@fg.l j<?> jVar, @fg.m CancellationException cancellationException) {
        x.p();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    public static final <T> i<T> c(@fg.l i0<? extends T> i0Var) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> d(i0<? extends T> i0Var, ld.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜁\u0001"));
        return new u.a(i0Var, qVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    public static final <T> i<T> e(@fg.l t0<? extends T> t0Var) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object f(i0<? extends T> i0Var, kotlin.coroutines.d<? super Integer> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜂\u0001"));
        return q.a(i0Var, dVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    public static final <T> i<T> g(@fg.l t0<? extends T> t0Var) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    public static final <T> i<T> h(@fg.l i0<? extends T> i0Var, @fg.l kotlin.coroutines.g gVar) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    public static final kotlin.coroutines.g i(@fg.l j<?> jVar) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.x0(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@fg.l j<?> jVar) {
        x.p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.x0(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> m(i0<? extends T> i0Var, long j4, ld.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜃\u0001"));
        return u.e(i0Var, j4, pVar);
    }

    static i n(i0 i0Var, long j4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = Long.MAX_VALUE;
        }
        if ((i4 & 2) != 0) {
            pVar = new a(2, null);
        }
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜃\u0001"));
        return u.e(i0Var, j4, pVar);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.x0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> o(i0<? extends T> i0Var, ld.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜄\u0001"));
        return new u.f(i0Var, rVar);
    }

    @kotlin.internal.f
    private static final <T> Object p(i0<? extends T> i0Var, List<T> list, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜅\u0001"));
        o.a(i0Var, list, dVar);
        throw new IllegalStateException(ProtectedSandApp.s("蜆\u0001"));
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object q(i0<? extends T> i0Var, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜅\u0001"));
        return o.c(i0Var, null, dVar, 1, null);
    }

    @kotlin.internal.f
    private static final <T> Object r(i0<? extends T> i0Var, Set<T> set, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜇\u0001"));
        o.a(i0Var, set, dVar);
        throw new IllegalStateException(ProtectedSandApp.s("蜆\u0001"));
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object s(i0<? extends T> i0Var, kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, ProtectedSandApp.s("蜇\u0001"));
        return o.e(i0Var, null, dVar, 1, null);
    }
}
