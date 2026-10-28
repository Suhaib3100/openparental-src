package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.flow.o0;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "Lkotlin/time/e;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/o0;", "a", "(Lkotlinx/coroutines/flow/o0$a;JJ)Lkotlinx/coroutines/flow/o0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p0 {
    @fg.l
    public static final o0 a(@fg.l o0.Companion companion, long j4, long j5) {
        return new s0(kotlin.time.e.M(j4), kotlin.time.e.M(j5));
    }

    public static o0 b(o0.Companion companion, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            kotlin.time.e.INSTANCE.getClass();
            j4 = kotlin.time.e.f79210d;
        }
        if ((i4 & 2) != 0) {
            kotlin.time.e.INSTANCE.getClass();
            j5 = kotlin.time.e.f79211e;
        }
        return a(companion, j4, j5);
    }
}
