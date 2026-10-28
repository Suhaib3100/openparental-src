package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/w0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/n2;", "e", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;Lkotlinx/coroutines/w0;Lq3/p;)Lkotlinx/coroutines/n2;", "T", "Lkotlinx/coroutines/c1;", "a", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;Lkotlinx/coroutines/w0;Lq3/p;)Lkotlinx/coroutines/c1;", "g", "(Lkotlin/coroutines/g;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/o0;", "c", "(Lkotlinx/coroutines/o0;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "I", "UNDECIDED", "b", "SUSPENDED", "RESUMED", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28800a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f28801b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f28802c = 2;

    @d5.d
    public static final <T> c1<T> a(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, @d5.d w0 w0Var, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar) {
        CoroutineContext e6 = n0.e(u0Var, coroutineContext);
        d1 w2Var = w0Var.isLazy() ? new w2(e6, pVar) : new d1(e6, true);
        ((a) w2Var).J1(w0Var, w2Var, pVar);
        return (c1<T>) w2Var;
    }

    public static c1 b(u0 u0Var, CoroutineContext coroutineContext, w0 w0Var, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i5 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return a(u0Var, coroutineContext, w0Var, pVar);
    }

    @d5.e
    public static final <T> Object c(@d5.d o0 o0Var, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return g(o0Var, pVar, continuation);
    }

    private static final <T> Object d(o0 o0Var, q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return g(o0Var, pVar, continuation);
    }

    @d5.d
    public static final n2 e(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, @d5.d w0 w0Var, @d5.d q3.p<? super u0, ? super Continuation<? super kotlin.m2>, ? extends Object> pVar) {
        CoroutineContext e6 = n0.e(u0Var, coroutineContext);
        a x2Var = w0Var.isLazy() ? new x2(e6, pVar) : new n3(e6, true);
        x2Var.J1(w0Var, x2Var, pVar);
        return x2Var;
    }

    public static n2 f(u0 u0Var, CoroutineContext coroutineContext, w0 w0Var, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i5 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return e(u0Var, coroutineContext, w0Var, pVar);
    }

    @d5.e
    public static final <T> Object g(@d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        Object L1;
        CoroutineContext context = continuation.getContext();
        CoroutineContext d6 = n0.d(context, coroutineContext);
        s2.x(d6);
        if (d6 == context) {
            kotlinx.coroutines.internal.n0 n0Var = new kotlinx.coroutines.internal.n0(d6, continuation);
            L1 = q4.b.f(n0Var, n0Var, pVar);
        } else {
            ContinuationInterceptor.b bVar = ContinuationInterceptor.f23289d;
            if (kotlin.jvm.internal.l0.g(d6.b(bVar), context.b(bVar))) {
                a4 a4Var = new a4(d6, continuation);
                Object c6 = kotlinx.coroutines.internal.w0.c(d6, null);
                try {
                    Object f6 = q4.b.f(a4Var, a4Var, pVar);
                    kotlinx.coroutines.internal.w0.a(d6, c6);
                    L1 = f6;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.w0.a(d6, c6);
                    throw th;
                }
            } else {
                i1 i1Var = new i1(d6, continuation);
                q4.a.f(pVar, i1Var, i1Var, null, 4, null);
                L1 = i1Var.L1();
            }
        }
        if (L1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return L1;
    }
}
