package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/m2;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class d4 {
    @d5.e
    public static final Object a(@d5.d Continuation<? super kotlin.m2> continuation) {
        Continuation e6;
        Object obj;
        CoroutineContext context = continuation.getContext();
        s2.x(context);
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.internal.l lVar = e6 instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) e6 : null;
        if (lVar == null) {
            obj = kotlin.m2.f23662a;
        } else {
            if (lVar.dispatcher.B0(context)) {
                lVar.o(context, kotlin.m2.f23662a);
            } else {
                c4 c4Var = new c4();
                CoroutineContext B = context.B(c4Var);
                kotlin.m2 m2Var = kotlin.m2.f23662a;
                lVar.o(B, m2Var);
                if (c4Var.dispatcherWasUnconfined) {
                    obj = kotlinx.coroutines.internal.m.h(lVar) ? CoroutineSingletons.COROUTINE_SUSPENDED : m2Var;
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return obj == coroutineSingletons ? obj : kotlin.m2.f23662a;
    }
}
