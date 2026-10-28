package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;
import q3.l;

/* compiled from: SelectUnbiased.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "Lkotlin/m2;", "Lkotlin/u;", "builder", "a", "(Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class h {
    @d5.e
    public static final <R> Object a(@d5.d l<? super a<? super R>, m2> lVar, @d5.d Continuation<? super R> continuation) {
        j jVar = new j(continuation);
        try {
            lVar.N(jVar);
        } catch (Throwable th) {
            jVar.e(th);
        }
        Object f6 = jVar.f();
        if (f6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return f6;
    }

    private static final <R> Object b(l<? super a<? super R>, m2> lVar, Continuation<? super R> continuation) {
        j jVar = new j(continuation);
        try {
            lVar.N(jVar);
        } catch (Throwable th) {
            jVar.e(th);
        }
        Object f6 = jVar.f();
        if (f6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return f6;
    }
}
