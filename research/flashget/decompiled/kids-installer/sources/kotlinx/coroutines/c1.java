package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Deferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/c1;", "T", "Lkotlinx/coroutines/n2;", "R", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "()Ljava/lang/Object;", "", "G", "Lkotlinx/coroutines/selects/d;", "D", "()Lkotlinx/coroutines/selects/d;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface c1<T> extends n2 {

    /* compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <T, R> R b(@d5.d c1<? extends T> c1Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(c1Var, r5, pVar);
        }

        @d5.e
        public static <T, E extends CoroutineContext.b> E c(@d5.d c1<? extends T> c1Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(c1Var, cVar);
        }

        @d5.d
        public static <T> CoroutineContext d(@d5.d c1<? extends T> c1Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(c1Var, cVar);
        }

        @d5.d
        public static <T> CoroutineContext e(@d5.d c1<? extends T> c1Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(c1Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static <T> n2 f(@d5.d c1<? extends T> c1Var, @d5.d n2 n2Var) {
            return n2Var;
        }
    }

    @d5.d
    kotlinx.coroutines.selects.d<T> D();

    @c2
    @d5.e
    Throwable G();

    @d5.e
    Object R(@d5.d Continuation<? super T> continuation);

    @c2
    T t();
}
