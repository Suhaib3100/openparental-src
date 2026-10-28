package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.z0;

/* compiled from: Runnable.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/core/util/h;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/d;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class h extends AtomicBoolean implements Runnable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<k2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l kotlin.coroutines.d<? super k2> dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<k2> dVar = this.continuation;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(k2.f75408a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @fg.l
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
