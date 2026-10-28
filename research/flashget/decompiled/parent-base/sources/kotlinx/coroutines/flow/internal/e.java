package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlinx.coroutines.internal.y0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a]\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/internal/d;", "b", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/g;", "emitContext", "e", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)Lkotlinx/coroutines/flow/j;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "c", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
/* loaded from: classes7.dex */
public final class e {
    @fg.l
    public static final <T> d<T> b(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        d<T> dVar = iVar instanceof d ? (d) iVar : null;
        return dVar == null ? new h(iVar, null, 0, null, 14, null) : dVar;
    }

    @fg.m
    public static final <T, V> Object c(@fg.l kotlin.coroutines.g gVar, V v4, @fg.l Object obj, @fg.l ld.p<? super V, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        Object c5 = y0.c(gVar, obj);
        try {
            Object invoke = ((ld.p) u1.q(pVar, 2)).invoke(v4, new x(dVar, gVar));
            y0.a(gVar, c5);
            if (invoke == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            y0.a(gVar, c5);
            throw th;
        }
    }

    public static /* synthetic */ Object d(kotlin.coroutines.g gVar, Object obj, Object obj2, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = y0.b(gVar);
        }
        return c(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.g gVar) {
        return jVar instanceof w ? true : jVar instanceof r ? jVar : new z(jVar, gVar);
    }
}
