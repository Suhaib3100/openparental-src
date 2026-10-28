package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/b1;", "", "", "time", "Lkotlin/k2;", "q0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "a", "(JLkotlinx/coroutines/p;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface b1 {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n30#1:163,11\n*E\n"})
    public static final class a {
        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@fg.l b1 b1Var, long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            if (j4 <= 0) {
                return kotlin.k2.f75408a;
            }
            q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            b1Var.a(j4, qVar);
            Object y4 = qVar.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : kotlin.k2.f75408a;
        }

        @fg.l
        public static m1 b(@fg.l b1 b1Var, long j4, @fg.l Runnable runnable, @fg.l kotlin.coroutines.g gVar) {
            return y0.a().q(j4, runnable, gVar);
        }
    }

    void a(long timeMillis, @fg.l p<? super kotlin.k2> continuation);

    @fg.l
    m1 q(long timeMillis, @fg.l Runnable block, @fg.l kotlin.coroutines.g context);

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    Object q0(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar);
}
