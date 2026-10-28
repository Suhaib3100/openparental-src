package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.w0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0010\u001a\u00020\u000e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "<init>", "(JLkotlinx/coroutines/scheduling/l;)V", "()V", "b", "J", "c", "Lkotlinx/coroutines/scheduling/l;", "", "()I", "mode", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public abstract class k implements Runnable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public long submissionTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public l taskContext;

    public k(long j4, @fg.l l lVar) {
        this.submissionTime = j4;
        this.taskContext = lVar;
    }

    public final int b() {
        return this.taskContext.getTaskMode();
    }

    public k() {
        this(0L, o.f81013i);
    }
}
