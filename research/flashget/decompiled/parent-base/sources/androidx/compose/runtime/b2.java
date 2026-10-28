package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\r\u0010\f\"\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"R", "Landroidx/compose/runtime/a2;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "frameTimeMillis", "onFrame", "c", "(Landroidx/compose/runtime/a2;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "frameTimeNanos", "f", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "Lkotlin/coroutines/g;", "a", "(Lkotlin/coroutines/g;)Landroidx/compose/runtime/a2;", "b", "(Lkotlin/coroutines/g;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
/* loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2\n*L\n1#1,120:1\n*E\n"})
    public static final class a<R> extends kotlin.jvm.internal.n0 implements ld.l<Long, R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, R> f15973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f15973b = lVar;
        }

        public final R a(long j4) {
            return this.f15973b.invoke(Long.valueOf(j4 / 1000000));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Long l4) {
            return a(l4.longValue());
        }
    }

    @fg.l
    public static final a2 a(@fg.l kotlin.coroutines.g gVar) {
        a2 a2Var = (a2) gVar.c(a2.INSTANCE);
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @c1
    public static /* synthetic */ void b(kotlin.coroutines.g gVar) {
    }

    @fg.m
    public static final <R> Object c(@fg.l a2 a2Var, @fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return a2Var.u(new a(lVar), dVar);
    }

    @fg.m
    public static final <R> Object d(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return a(dVar.getContext()).u(new a(lVar), dVar);
    }

    private static final <R> Object e(a2 a2Var, ld.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super R> dVar) {
        return a2Var.u(new a(lVar), dVar);
    }

    @fg.m
    public static final <R> Object f(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return a(dVar.getContext()).u(lVar, dVar);
    }
}
