package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/e1;", "", "", "time", "Lkotlin/m2;", "e0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/q;", "continuation", "g", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/p1;", "b0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes5.dex */
public interface e1 {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @d5.e
        public static Object a(@d5.d e1 e1Var, long j5, @d5.d Continuation<? super kotlin.m2> continuation) {
            Continuation e6;
            if (j5 <= 0) {
                return kotlin.m2.f23662a;
            }
            e6 = kotlin.coroutines.intrinsics.c.e(continuation);
            s sVar = new s(e6, 1);
            sVar.X();
            e1Var.g(j5, sVar);
            Object A = sVar.A();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (A == coroutineSingletons) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return A == coroutineSingletons ? A : kotlin.m2.f23662a;
        }

        @d5.d
        public static p1 b(@d5.d e1 e1Var, long j5, @d5.d Runnable runnable, @d5.d CoroutineContext coroutineContext) {
            return b1.a().b0(j5, runnable, coroutineContext);
        }
    }

    @d5.d
    p1 b0(long timeMillis, @d5.d Runnable block, @d5.d CoroutineContext context);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @d5.e
    Object e0(long j5, @d5.d Continuation<? super kotlin.m2> continuation);

    void g(long j5, @d5.d q<? super kotlin.m2> qVar);
}
