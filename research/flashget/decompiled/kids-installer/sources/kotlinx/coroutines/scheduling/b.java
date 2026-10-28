package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.a;

/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "a", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class b {
    @p3.i(name = "isSchedulerWorker")
    public static final boolean a(@d5.d Thread thread) {
        return thread instanceof a.c;
    }

    @p3.i(name = "mayNotBlock")
    public static final boolean b(@d5.d Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).state == a.d.CPU_ACQUIRED;
    }
}
