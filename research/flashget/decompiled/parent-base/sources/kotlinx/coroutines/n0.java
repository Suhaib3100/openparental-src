package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "N", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "o2", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface n0 extends g.b {

    /* renamed from: o2, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f80868b;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@fg.l n0 n0Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(n0Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E b(@fg.l n0 n0Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(n0Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g c(@fg.l n0 n0Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(n0Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l n0 n0Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(n0Var, gVar);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/n0$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/n0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.n0$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<n0> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f80868b = new Companion();

        private Companion() {
        }
    }

    void N(@fg.l kotlin.coroutines.g context, @fg.l Throwable exception);
}
