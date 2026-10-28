package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/r3;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "o0", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/m2;", "f0", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface r3<S> extends CoroutineContext.b {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static <S, R> R a(@d5.d r3<S> r3Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(r3Var, r5, pVar);
        }

        @d5.e
        public static <S, E extends CoroutineContext.b> E b(@d5.d r3<S> r3Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(r3Var, cVar);
        }

        @d5.d
        public static <S> CoroutineContext c(@d5.d r3<S> r3Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(r3Var, cVar);
        }

        @d5.d
        public static <S> CoroutineContext d(@d5.d r3<S> r3Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(r3Var, coroutineContext);
        }
    }

    void f0(@d5.d CoroutineContext context, S oldState);

    S o0(@d5.d CoroutineContext context);
}
