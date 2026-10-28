package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.u2;
import kotlinx.coroutines.w0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"E", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/w0;", "start", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/f;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/channels/k0;", "a", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;ILkotlinx/coroutines/w0;Lq3/l;Lq3/p;)Lkotlinx/coroutines/channels/k0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class e {
    @d3
    @d5.d
    public static final <E> k0<E> a(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d w0 w0Var, @d5.e q3.l<? super Throwable, m2> lVar, @d5.d q3.p<? super f<E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        CoroutineContext e6 = kotlinx.coroutines.n0.e(u0Var, coroutineContext);
        n d6 = q.d(i5, null, null, 6, null);
        d zVar = w0Var.isLazy() ? new z(e6, d6, pVar) : new d(e6, d6, true);
        if (lVar != null) {
            ((u2) zVar).m0(lVar);
        }
        ((kotlinx.coroutines.a) zVar).J1(w0Var, zVar, pVar);
        return (k0<E>) zVar;
    }

    public static /* synthetic */ k0 b(u0 u0Var, CoroutineContext coroutineContext, int i5, w0 w0Var, q3.l lVar, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, coroutineContext2, i7, w0Var2, lVar, pVar);
    }
}
