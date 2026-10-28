package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.a;

/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljava/lang/Thread;", "thread", "", "a", "(Ljava/lang/Thread;)Z", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @kd.i(name = "isSchedulerWorker")
    public static final boolean a(@fg.l Thread thread) {
        return thread instanceof a.c;
    }

    @kd.i(name = "mayNotBlock")
    public static final boolean b(@fg.l Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).state == a.d.CPU_ACQUIRED;
    }
}
