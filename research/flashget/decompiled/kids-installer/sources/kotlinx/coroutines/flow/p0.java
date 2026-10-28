package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.o0;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "Lkotlin/time/e;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/o0;", "a", "(Lkotlinx/coroutines/flow/o0$a;JJ)Lkotlinx/coroutines/flow/o0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class p0 {
    @d5.d
    public static final o0 a(@d5.d o0.Companion companion, long j5, long j6) {
        return new s0(Duration.S(j5), Duration.S(j6));
    }

    public static o0 b(o0.Companion companion, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            Duration.f27196p.getClass();
            j5 = Duration.f27197q;
        }
        if ((i5 & 2) != 0) {
            Duration.f27196p.getClass();
            j6 = Duration.f27198r;
        }
        return a(companion, j5, j6);
    }
}
