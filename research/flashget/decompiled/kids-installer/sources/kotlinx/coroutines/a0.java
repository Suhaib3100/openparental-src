package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/a0;", "T", "Lkotlinx/coroutines/c1;", "value", "", "i0", "(Ljava/lang/Object;)Z", "", "exception", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface a0<T> extends c1<T> {

    /* compiled from: CompletableDeferred.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <T, R> R b(@d5.d a0<T> a0Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(a0Var, r5, pVar);
        }

        @d5.e
        public static <T, E extends CoroutineContext.b> E c(@d5.d a0<T> a0Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(a0Var, cVar);
        }

        @d5.d
        public static <T> CoroutineContext d(@d5.d a0<T> a0Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(a0Var, cVar);
        }

        @d5.d
        public static <T> CoroutineContext e(@d5.d a0<T> a0Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(a0Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static <T> n2 f(@d5.d a0<T> a0Var, @d5.d n2 n2Var) {
            return n2Var;
        }
    }

    boolean i0(T value);

    boolean k(@d5.d Throwable exception);
}
