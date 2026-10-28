package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Job.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/e3;", "parentJob", "Lkotlin/m2;", "U", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes6.dex */
public interface z extends n2 {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <R> R b(@d5.d z zVar, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(zVar, r5, pVar);
        }

        @d5.e
        public static <E extends CoroutineContext.b> E c(@d5.d z zVar, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(zVar, cVar);
        }

        @d5.d
        public static CoroutineContext d(@d5.d z zVar, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(zVar, cVar);
        }

        @d5.d
        public static CoroutineContext e(@d5.d z zVar, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(zVar, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static n2 f(@d5.d z zVar, @d5.d n2 n2Var) {
            return n2Var;
        }
    }

    @i2
    void U(@d5.d e3 e3Var);
}
