package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Job.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/e3;", "Lkotlinx/coroutines/n2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "l0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes6.dex */
public interface e3 extends n2 {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <R> R b(@d5.d e3 e3Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(e3Var, r5, pVar);
        }

        @d5.e
        public static <E extends CoroutineContext.b> E c(@d5.d e3 e3Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(e3Var, cVar);
        }

        @d5.d
        public static CoroutineContext d(@d5.d e3 e3Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(e3Var, cVar);
        }

        @d5.d
        public static CoroutineContext e(@d5.d e3 e3Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(e3Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static n2 f(@d5.d e3 e3Var, @d5.d n2 n2Var) {
            return n2Var;
        }
    }

    @d5.d
    @i2
    CancellationException l0();
}
