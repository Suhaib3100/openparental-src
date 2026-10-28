package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\n\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00062\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/paging/b;", "", "Key", "Value", "<init>", "()V", "R", "Lkotlin/Function1;", "Landroidx/paging/a;", "block", "b", "(Lld/l;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lkotlinx/coroutines/flow/e0;", "Landroidx/paging/f0;", "Lkotlinx/coroutines/flow/e0;", "_loadStates", "c", "Landroidx/paging/a;", "internalState", "Lkotlinx/coroutines/flow/t0;", "()Lkotlinx/coroutines/flow/t0;", "loadStates", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class b<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ReentrantLock lock = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.e0<f0> _loadStates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a<Key, Value> internalState;

    public b() {
        f0.INSTANCE.getClass();
        this._loadStates = kotlinx.coroutines.flow.v0.a(f0.f31687e);
        this.internalState = new a<>();
    }

    @fg.l
    public final kotlinx.coroutines.flow.t0<f0> a() {
        return this._loadStates;
    }

    public final <R> R b(@fg.l ld.l<? super a<Key, Value>, ? extends R> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            R invoke = block.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.e());
            return invoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
