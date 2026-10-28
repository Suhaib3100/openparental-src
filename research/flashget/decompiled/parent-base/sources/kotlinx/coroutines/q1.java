package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010(\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\f¨\u0006."}, d2 = {"Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "", "unconfined", "", "l1", "(Z)J", "L1", "()J", "M1", "()Z", "S1", "Lkotlinx/coroutines/g1;", "task", "Lkotlin/k2;", "n1", "(Lkotlinx/coroutines/g1;)V", "y1", "(Z)V", "j1", "", "parallelism", "e1", "(I)Lkotlinx/coroutines/m0;", "shutdown", "d", "J", "useCount", "e", "Z", "shared", "Lkotlin/collections/k;", "f", "Lkotlin/collections/k;", "unconfinedQueue", "D1", "isEmpty", "t1", "nextTime", "isActive", "H1", "isUnconfinedLoopActive", "K1", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: classes7.dex */
public abstract class q1 extends m0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlin.collections.k<g1<?>> unconfinedQueue;

    public static /* synthetic */ void B1(q1 q1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蟆\u0001"));
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        q1Var.y1(z4);
    }

    public static /* synthetic */ void k1(q1 q1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蟇\u0001"));
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        q1Var.j1(z4);
    }

    private final long l1(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    protected boolean D1() {
        return K1();
    }

    public final boolean H1() {
        return this.useCount >= l1(true);
    }

    public final boolean K1() {
        kotlin.collections.k<g1<?>> kVar = this.unconfinedQueue;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    public long L1() {
        return !M1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean M1() {
        g1<?> A;
        kotlin.collections.k<g1<?>> kVar = this.unconfinedQueue;
        if (kVar == null || (A = kVar.A()) == null) {
            return false;
        }
        A.run();
        return true;
    }

    public boolean S1() {
        return false;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public final m0 e1(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return this;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    public final void j1(boolean unconfined) {
        long l12 = this.useCount - l1(unconfined);
        this.useCount = l12;
        if (l12 <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void n1(@fg.l g1<?> task) {
        kotlin.collections.k<g1<?>> kVar = this.unconfinedQueue;
        if (kVar == null) {
            kVar = new kotlin.collections.k<>();
            this.unconfinedQueue = kVar;
        }
        kVar.addLast(task);
    }

    public void shutdown() {
    }

    protected long t1() {
        kotlin.collections.k<g1<?>> kVar = this.unconfinedQueue;
        return (kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void y1(boolean unconfined) {
        this.useCount += l1(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }
}
