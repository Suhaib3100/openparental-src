package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CompletableJob.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/d0;", "Lkotlinx/coroutines/n2;", "", "j", "", "exception", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface d0 extends n2 {

    /* compiled from: CompletableJob.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <R> R b(@d5.d d0 d0Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(d0Var, r5, pVar);
        }

        @d5.e
        public static <E extends CoroutineContext.b> E c(@d5.d d0 d0Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(d0Var, cVar);
        }

        @d5.d
        public static CoroutineContext d(@d5.d d0 d0Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(d0Var, cVar);
        }

        @d5.d
        public static CoroutineContext e(@d5.d d0 d0Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(d0Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static n2 f(@d5.d d0 d0Var, @d5.d n2 n2Var) {
            return n2Var;
        }
    }

    boolean j();

    boolean k(@d5.d Throwable exception);
}
