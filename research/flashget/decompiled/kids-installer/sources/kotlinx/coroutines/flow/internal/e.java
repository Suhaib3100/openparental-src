package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u1;
import kotlinx.coroutines.internal.w0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/internal/d;", "b", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/g;", "emitContext", "e", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "c", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class e {
    @d5.d
    public static final <T> d<T> b(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar) {
        d<T> dVar = iVar instanceof d ? (d) iVar : null;
        return dVar == null ? new h(iVar, null, 0, null, 14, null) : dVar;
    }

    @d5.e
    public static final <T, V> Object c(@d5.d CoroutineContext coroutineContext, V v5, @d5.d Object obj, @d5.d q3.p<? super V, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        Object c6 = w0.c(coroutineContext, obj);
        try {
            Object g02 = ((q3.p) u1.q(pVar, 2)).g0(v5, new x(continuation, coroutineContext));
            w0.a(coroutineContext, c6);
            if (g02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return g02;
        } catch (Throwable th) {
            w0.a(coroutineContext, c6);
            throw th;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, q3.p pVar, Continuation continuation, int i5, Object obj3) {
        if ((i5 & 4) != 0) {
            obj2 = w0.b(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, pVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, CoroutineContext coroutineContext) {
        return jVar instanceof w ? true : jVar instanceof r ? jVar : new z(jVar, coroutineContext);
    }
}
