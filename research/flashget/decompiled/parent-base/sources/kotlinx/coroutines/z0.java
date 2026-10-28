package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: Deferred.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/z0;", "T", "Lkotlinx/coroutines/k2;", "z", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "", "s", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/selects/g;", "X", "()Lkotlinx/coroutines/selects/g;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface z0<T> extends k2 {

    /* compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@fg.l z0<? extends T> z0Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(z0Var, r4, pVar);
        }

        @fg.m
        public static <T, E extends g.b> E c(@fg.l z0<? extends T> z0Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(z0Var, cVar);
        }

        @fg.l
        public static <T> kotlin.coroutines.g d(@fg.l z0<? extends T> z0Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(z0Var, cVar);
        }

        @fg.l
        public static <T> kotlin.coroutines.g e(@fg.l z0<? extends T> z0Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(z0Var, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> k2 f(@fg.l z0<? extends T> z0Var, @fg.l k2 k2Var) {
            return k2Var;
        }
    }

    @fg.l
    kotlinx.coroutines.selects.g<T> X();

    @z1
    T k();

    @fg.m
    @z1
    Throwable s();

    @fg.m
    Object z(@fg.l kotlin.coroutines.d<? super T> dVar);
}
