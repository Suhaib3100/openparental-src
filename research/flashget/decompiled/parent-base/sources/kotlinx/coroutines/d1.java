package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.b1;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/b1;", "Lkotlin/time/e;", "timeout", "", "y", "(J)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface d1 extends b1 {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@fg.l d1 d1Var, long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            Object a5 = b1.a.a(d1Var, j4, dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
        }

        @fg.l
        public static m1 b(@fg.l d1 d1Var, long j4, @fg.l Runnable runnable, @fg.l kotlin.coroutines.g gVar) {
            return b1.a.b(d1Var, j4, runnable, gVar);
        }
    }

    @fg.l
    String y(long timeout);
}
