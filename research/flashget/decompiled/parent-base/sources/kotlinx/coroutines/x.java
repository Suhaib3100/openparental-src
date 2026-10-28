package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: Job.kt */
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/b3;", "parentJob", "Lkotlin/k2;", "C", "(Lkotlinx/coroutines/b3;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface x extends k2 {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@fg.l x xVar, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(xVar, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E c(@fg.l x xVar, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(xVar, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l x xVar, @fg.l g.c<?> cVar) {
            return g.b.a.c(xVar, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g e(@fg.l x xVar, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(xVar, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static k2 f(@fg.l x xVar, @fg.l k2 k2Var) {
            return k2Var;
        }
    }

    @f2
    void C(@fg.l b3 parentJob);
}
