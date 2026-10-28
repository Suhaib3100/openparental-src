package q4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.v2;
import q3.l;
import q3.p;

/* compiled from: Undispatched.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u001aT\u0010\u000e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/m2;", "c", "(Lq3/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "d", "(Lq3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "a", "b", "block", "e", "Lkotlinx/coroutines/internal/n0;", "Lkotlin/u;", "f", "(Lkotlinx/coroutines/internal/n0;Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;", "g", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", "h", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class b {
    public static final <T> void a(@d l<? super Continuation<? super T>, ? extends Object> lVar, @d Continuation<? super T> continuation) {
        l0.p(continuation, ProtectedSandApp.s("椟"));
        try {
            CoroutineContext f23291o = continuation.getF23291o();
            Object c6 = w0.c(f23291o, null);
            try {
                Object N = ((l) u1.q(lVar, 1)).N(continuation);
                if (N != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    Result.a aVar = Result.f27242p;
                    continuation.s(N);
                }
            } finally {
                w0.a(f23291o, c6);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(th));
        }
    }

    public static final <R, T> void b(@d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d Continuation<? super T> continuation) {
        l0.p(continuation, ProtectedSandApp.s("椠"));
        try {
            CoroutineContext f23291o = continuation.getF23291o();
            Object c6 = w0.c(f23291o, null);
            try {
                Object g02 = ((p) u1.q(pVar, 2)).g0(r5, continuation);
                if (g02 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    Result.a aVar = Result.f27242p;
                    continuation.s(g02);
                }
            } finally {
                w0.a(f23291o, c6);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(th));
        }
    }

    public static final <T> void c(@d l<? super Continuation<? super T>, ? extends Object> lVar, @d Continuation<? super T> continuation) {
        l0.p(continuation, ProtectedSandApp.s("椡"));
        try {
            Object N = ((l) u1.q(lVar, 1)).N(continuation);
            if (N != CoroutineSingletons.COROUTINE_SUSPENDED) {
                Result.a aVar = Result.f27242p;
                continuation.s(N);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(th));
        }
    }

    public static final <R, T> void d(@d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d Continuation<? super T> continuation) {
        l0.p(continuation, ProtectedSandApp.s("椢"));
        try {
            Object g02 = ((p) u1.q(pVar, 2)).g0(r5, continuation);
            if (g02 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                Result.a aVar = Result.f27242p;
                continuation.s(g02);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(th));
        }
    }

    private static final <T> void e(Continuation<? super T> continuation, l<? super Continuation<? super T>, ? extends Object> lVar) {
        l0.p(continuation, ProtectedSandApp.s("椣"));
        try {
            Object N = lVar.N(continuation);
            if (N != CoroutineSingletons.COROUTINE_SUSPENDED) {
                Result.a aVar = Result.f27242p;
                continuation.s(N);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(th));
        }
    }

    @e
    public static final <T, R> Object f(@d n0<? super T> n0Var, R r5, @d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object f0Var;
        Object f12;
        try {
            f0Var = ((p) u1.q(pVar, 2)).g0(r5, n0Var);
        } catch (Throwable th) {
            f0Var = new f0(th, false, 2, null);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (f0Var == coroutineSingletons || (f12 = n0Var.f1(f0Var)) == v2.f29045b) {
            return coroutineSingletons;
        }
        if (f12 instanceof f0) {
            throw ((f0) f12).cause;
        }
        return v2.o(f12);
    }

    @e
    public static final <T, R> Object g(@d n0<? super T> n0Var, R r5, @d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object f0Var;
        Object f12;
        try {
            f0Var = ((p) u1.q(pVar, 2)).g0(r5, n0Var);
        } catch (Throwable th) {
            f0Var = new f0(th, false, 2, null);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (f0Var == coroutineSingletons || (f12 = n0Var.f1(f0Var)) == v2.f29045b) {
            return coroutineSingletons;
        }
        if (f12 instanceof f0) {
            Throwable th2 = ((f0) f12).cause;
            if (((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == n0Var) ? false : true) {
                throw th2;
            }
            if (f0Var instanceof f0) {
                throw ((f0) f0Var).cause;
            }
        } else {
            f0Var = v2.o(f12);
        }
        return f0Var;
    }

    private static final <T> Object h(n0<? super T> n0Var, l<? super Throwable, Boolean> lVar, q3.a<? extends Object> aVar) {
        Object f0Var;
        try {
            f0Var = aVar.n();
        } catch (Throwable th) {
            f0Var = new f0(th, false, 2, null);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (f0Var == coroutineSingletons) {
            return coroutineSingletons;
        }
        Object f12 = n0Var.f1(f0Var);
        if (f12 == v2.f29045b) {
            return coroutineSingletons;
        }
        if (!(f12 instanceof f0)) {
            return v2.o(f12);
        }
        f0 f0Var2 = (f0) f12;
        if (lVar.N(f0Var2.cause).booleanValue()) {
            throw f0Var2.cause;
        }
        if (f0Var instanceof f0) {
            throw ((f0) f0Var).cause;
        }
        return f0Var;
    }
}
