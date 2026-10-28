package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/a2;", "Lkotlin/coroutines/g$b;", "R", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "frameTimeNanos", "onFrame", "u", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "T", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface a2 extends g.b {

    /* renamed from: T, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f15906b;

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@fg.l a2 a2Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(a2Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E b(@fg.l a2 a2Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(a2Var, cVar);
        }

        @fg.l
        @Deprecated
        public static g.c<?> c(@fg.l a2 a2Var) {
            return a2.D(a2Var);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l a2 a2Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(a2Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g e(@fg.l a2 a2Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(a2Var, gVar);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/a2$b;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/runtime/a2;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.a2$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<a2> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f15906b = new Companion();

        private Companion() {
        }
    }

    static g.c D(a2 a2Var) {
        a2Var.getClass();
        return INSTANCE;
    }

    @Override // kotlin.coroutines.g.b
    @fg.l
    default g.c<?> getKey() {
        return INSTANCE;
    }

    @fg.m
    <R> Object u(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar);
}
