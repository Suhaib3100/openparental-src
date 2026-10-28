package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: ThreadContextElement.kt */
@z1
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/j0;", "S", "Lkotlinx/coroutines/l3;", "G", "()Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/g$b;", "overwritingElement", "Lkotlin/coroutines/g;", "n", "(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@e1
/* loaded from: classes7.dex */
public interface j0<S> extends l3<S> {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@fg.l j0<S> j0Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(j0Var, r4, pVar);
        }

        @fg.m
        public static <S, E extends g.b> E b(@fg.l j0<S> j0Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(j0Var, cVar);
        }

        @fg.l
        public static <S> kotlin.coroutines.g c(@fg.l j0<S> j0Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(j0Var, cVar);
        }

        @fg.l
        public static <S> kotlin.coroutines.g d(@fg.l j0<S> j0Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(j0Var, gVar);
        }
    }

    @fg.l
    j0<S> G();

    @fg.l
    kotlin.coroutines.g n(@fg.l g.b overwritingElement);
}
