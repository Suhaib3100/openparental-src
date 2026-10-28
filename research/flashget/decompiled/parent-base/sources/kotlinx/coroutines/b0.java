package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: CompletableJob.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/k2;", "", "h", "()Z", "", "exception", "e", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface b0 extends k2 {

    /* compiled from: CompletableJob.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@fg.l b0 b0Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(b0Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E c(@fg.l b0 b0Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(b0Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l b0 b0Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(b0Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g e(@fg.l b0 b0Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(b0Var, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static k2 f(@fg.l b0 b0Var, @fg.l k2 k2Var) {
            return k2Var;
        }
    }

    boolean e(@fg.l Throwable exception);

    boolean h();
}
