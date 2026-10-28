package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/h;", "Lkotlinx/coroutines/r1;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "j", "Ljava/lang/Thread;", "T1", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h extends r1 {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Thread thread;

    public h(@fg.l Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.s1
    @fg.l
    /* renamed from: T1, reason: from getter */
    protected Thread getThread() {
        return this.thread;
    }
}
