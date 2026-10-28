package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/n2;", "Ljava/util/concurrent/Future;", "future", "Lkotlinx/coroutines/p1;", "b", "Lkotlinx/coroutines/q;", "Lkotlin/m2;", "a", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes5.dex */
final /* synthetic */ class r2 {
    public static final void a(@d5.d q<?> qVar, @d5.d Future<?> future) {
        qVar.K(new m(future));
    }

    @d5.d
    @i2
    public static final p1 b(@d5.d n2 n2Var, @d5.d Future<?> future) {
        return n2Var.m0(new n(future));
    }
}
