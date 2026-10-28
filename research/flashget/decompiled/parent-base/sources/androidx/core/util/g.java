package androidx.core.util;

import androidx.annotation.x0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: PlatformConsumer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/core/util/g;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "value", "Lkotlin/k2;", "accept", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/d;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(24)
/* loaded from: classes3.dex */
final class g<T> extends AtomicBoolean implements Consumer<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l kotlin.coroutines.d<? super T> dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T value) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<T> dVar = this.continuation;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(value);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @fg.l
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
