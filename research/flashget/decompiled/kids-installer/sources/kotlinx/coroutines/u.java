package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlinx/coroutines/q;", "Lkotlin/m2;", "block", "d", "(Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/s;", "b", "Lkotlinx/coroutines/internal/y;", "node", "c", "Lkotlinx/coroutines/p1;", "handle", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class u {
    @i2
    public static final void a(@d5.d q<?> qVar, @d5.d p1 p1Var) {
        qVar.K(new q1(p1Var));
    }

    @d5.d
    public static final <T> s<T> b(@d5.d Continuation<? super T> continuation) {
        if (!(continuation instanceof kotlinx.coroutines.internal.l)) {
            return new s<>(continuation, 1);
        }
        s<T> n5 = ((kotlinx.coroutines.internal.l) continuation).n();
        if (n5 != null) {
            if (!n5.N()) {
                n5 = null;
            }
            if (n5 != null) {
                return n5;
            }
        }
        return new s<>(continuation, 2);
    }

    public static final void c(@d5.d q<?> qVar, @d5.d kotlinx.coroutines.internal.y yVar) {
        qVar.K(new f3(yVar));
    }

    @d5.e
    public static final <T> Object d(@d5.d q3.l<? super q<? super T>, kotlin.m2> lVar, @d5.d Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar = new s(e6, 1);
        sVar.X();
        lVar.N(sVar);
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    private static final <T> Object e(q3.l<? super q<? super T>, kotlin.m2> lVar, Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar = new s(e6, 1);
        sVar.X();
        lVar.N(sVar);
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    @d5.e
    public static final <T> Object f(@d5.d q3.l<? super q<? super T>, kotlin.m2> lVar, @d5.d Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s b6 = b(e6);
        lVar.N(b6);
        Object A = b6.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    private static final <T> Object g(q3.l<? super q<? super T>, kotlin.m2> lVar, Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s b6 = b(e6);
        lVar.N(b6);
        Object A = b6.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }
}
