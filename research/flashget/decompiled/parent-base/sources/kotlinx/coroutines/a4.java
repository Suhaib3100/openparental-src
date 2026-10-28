package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lkotlin/k2;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a4 {
    @fg.m
    public static final Object a(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object obj;
        kotlin.coroutines.g context = dVar.getContext();
        p2.x(context);
        kotlin.coroutines.d e4 = kotlin.coroutines.intrinsics.b.e(dVar);
        kotlinx.coroutines.internal.l lVar = e4 instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) e4 : null;
        if (lVar == null) {
            obj = kotlin.k2.f75408a;
        } else {
            if (lVar.dispatcher.c1(context)) {
                lVar.m(context, kotlin.k2.f75408a);
            } else {
                z3 z3Var = new z3();
                kotlin.coroutines.g O = context.O(z3Var);
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                lVar.m(O, k2Var);
                if (z3Var.dispatcherWasUnconfined) {
                    obj = kotlinx.coroutines.internal.m.f(lVar) ? kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED : k2Var;
                }
            }
            obj = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (obj == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj == aVar ? obj : kotlin.k2.f75408a;
    }
}
