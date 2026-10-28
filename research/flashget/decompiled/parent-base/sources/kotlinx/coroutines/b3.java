package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: Job.kt */
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/b3;", "Lkotlinx/coroutines/k2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "L", "()Ljava/util/concurrent/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface b3 extends k2 {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@fg.l b3 b3Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(b3Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E c(@fg.l b3 b3Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(b3Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l b3 b3Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(b3Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g e(@fg.l b3 b3Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(b3Var, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static k2 f(@fg.l b3 b3Var, @fg.l k2 k2Var) {
            return k2Var;
        }
    }

    @fg.l
    @f2
    CancellationException L();
}
