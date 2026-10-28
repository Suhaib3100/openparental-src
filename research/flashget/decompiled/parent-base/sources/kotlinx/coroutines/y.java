package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/y;", "T", "Lkotlinx/coroutines/z0;", "value", "", "I", "(Ljava/lang/Object;)Z", "", "exception", "e", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface y<T> extends z0<T> {

    /* compiled from: CompletableDeferred.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@fg.l y<T> yVar, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(yVar, r4, pVar);
        }

        @fg.m
        public static <T, E extends g.b> E c(@fg.l y<T> yVar, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(yVar, cVar);
        }

        @fg.l
        public static <T> kotlin.coroutines.g d(@fg.l y<T> yVar, @fg.l g.c<?> cVar) {
            return g.b.a.c(yVar, cVar);
        }

        @fg.l
        public static <T> kotlin.coroutines.g e(@fg.l y<T> yVar, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(yVar, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> k2 f(@fg.l y<T> yVar, @fg.l k2 k2Var) {
            return k2Var;
        }
    }

    boolean I(T value);

    boolean e(@fg.l Throwable exception);
}
