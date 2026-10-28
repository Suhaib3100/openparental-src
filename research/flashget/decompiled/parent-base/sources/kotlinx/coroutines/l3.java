package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/l3;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "M0", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/k2;", "H", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface l3<S> extends g.b {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@fg.l l3<S> l3Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(l3Var, r4, pVar);
        }

        @fg.m
        public static <S, E extends g.b> E b(@fg.l l3<S> l3Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(l3Var, cVar);
        }

        @fg.l
        public static <S> kotlin.coroutines.g c(@fg.l l3<S> l3Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(l3Var, cVar);
        }

        @fg.l
        public static <S> kotlin.coroutines.g d(@fg.l l3<S> l3Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(l3Var, gVar);
        }
    }

    void H(@fg.l kotlin.coroutines.g context, S oldState);

    S M0(@fg.l kotlin.coroutines.g context);
}
