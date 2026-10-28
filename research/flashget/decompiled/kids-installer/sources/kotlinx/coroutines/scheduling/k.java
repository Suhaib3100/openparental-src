package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/scheduling/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "o", "J", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "p", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "", "b", "()I", "mode", "<init>", "(JLkotlinx/coroutines/scheduling/l;)V", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class k implements Runnable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public long submissionTime;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public l taskContext;

    public k(long j5, @d5.d l lVar) {
        this.submissionTime = j5;
        this.taskContext = lVar;
    }

    public final int b() {
        return this.taskContext.getTaskMode();
    }

    public k() {
        this(0L, o.f28896i);
    }
}
