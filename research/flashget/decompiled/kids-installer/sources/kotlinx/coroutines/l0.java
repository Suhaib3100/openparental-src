package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ThreadContextElement.kt */
@c2
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/l0;", "S", "Lkotlinx/coroutines/r3;", "d0", "Lkotlin/coroutines/g$b;", "overwritingElement", "Lkotlin/coroutines/g;", "z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@g1
/* loaded from: classes6.dex */
public interface l0<S> extends r3<S> {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <S, R> R a(@d5.d l0<S> l0Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(l0Var, r5, pVar);
        }

        @d5.e
        public static <S, E extends CoroutineContext.b> E b(@d5.d l0<S> l0Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(l0Var, cVar);
        }

        @d5.d
        public static <S> CoroutineContext c(@d5.d l0<S> l0Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(l0Var, cVar);
        }

        @d5.d
        public static <S> CoroutineContext d(@d5.d l0<S> l0Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(l0Var, coroutineContext);
        }
    }

    @d5.d
    l0<S> d0();

    @d5.d
    CoroutineContext z(@d5.d CoroutineContext.b overwritingElement);
}
