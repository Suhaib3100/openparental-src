package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.x0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.z0;

/* compiled from: OutcomeReceiver.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/core/os/h;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "result", "Lkotlin/k2;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/d;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(31)
/* loaded from: classes3.dex */
final class h<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l kotlin.coroutines.d<? super R> dVar) {
        super(false);
        this.continuation = dVar;
    }

    public void onError(@fg.l E error) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.continuation;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(a1.a(error));
        }
    }

    public void onResult(R result) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.continuation;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(result);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @fg.l
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
