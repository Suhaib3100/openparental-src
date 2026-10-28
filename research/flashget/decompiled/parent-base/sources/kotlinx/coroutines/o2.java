package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/k2;", "Ljava/util/concurrent/Future;", "future", "Lkotlinx/coroutines/m1;", "b", "(Lkotlinx/coroutines/k2;Ljava/util/concurrent/Future;)Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/p;Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes7.dex */
final /* synthetic */ class o2 {
    public static final void a(@fg.l p<?> pVar, @fg.l Future<?> future) {
        pVar.k0(new l(future));
    }

    @fg.l
    @f2
    public static final m1 b(@fg.l k2 k2Var, @fg.l Future<?> future) {
        return k2Var.F(new m(future));
    }
}
