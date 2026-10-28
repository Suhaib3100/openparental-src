package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Lkotlin/coroutines/g;Lq3/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class k {
    public static final <T> T a(@d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar) throws InterruptedException {
        t1 a6;
        CoroutineContext e6;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.b(ContinuationInterceptor.f23289d);
        if (continuationInterceptor == null) {
            a6 = t3.f29007a.b();
            e6 = n0.e(e2.f27717o, coroutineContext.B(a6));
        } else {
            t1 t1Var = continuationInterceptor instanceof t1 ? (t1) continuationInterceptor : null;
            if (t1Var != null) {
                t1 t1Var2 = t1Var.n1() ? t1Var : null;
                if (t1Var2 != null) {
                    a6 = t1Var2;
                    e6 = n0.e(e2.f27717o, coroutineContext);
                }
            }
            a6 = t3.f29007a.a();
            e6 = n0.e(e2.f27717o, coroutineContext);
        }
        h hVar = new h(e6, currentThread, a6);
        w0.DEFAULT.invoke(pVar, hVar, hVar);
        return (T) hVar.K1();
    }

    public static Object b(CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) throws InterruptedException {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        return a(coroutineContext, pVar);
    }
}
