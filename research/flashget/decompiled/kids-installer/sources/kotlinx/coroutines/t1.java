package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u001e¨\u0006+"}, d2 = {"Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/o0;", "", "unconfined", "", "N0", "i1", "m1", "n1", "Lkotlinx/coroutines/j1;", "task", "Lkotlin/m2;", "O0", "T0", "J0", "", "parallelism", "E0", "shutdown", "q", "J", "useCount", "r", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "s", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "b1", "()Z", "isEmpty", "R0", "()J", "nextTime", "d", "isActive", "f1", "isUnconfinedLoopActive", "g1", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class t1 extends o0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private kotlinx.coroutines.internal.a<j1<?>> unconfinedQueue;

    public static /* synthetic */ void M0(t1 t1Var, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("遁"));
        }
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        t1Var.J0(z5);
    }

    private final long N0(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public static /* synthetic */ void U0(t1 t1Var, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("遂"));
        }
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        t1Var.T0(z5);
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public final o0 E0(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return this;
    }

    public final void J0(boolean z5) {
        long N0 = this.useCount - N0(z5);
        this.useCount = N0;
        if (N0 <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void O0(@d5.d j1<?> j1Var) {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.unconfinedQueue = aVar;
        }
        aVar.a(j1Var);
    }

    protected long R0() {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.unconfinedQueue;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void T0(boolean z5) {
        this.useCount += N0(z5);
        if (z5) {
            return;
        }
        this.shared = true;
    }

    protected boolean b1() {
        return g1();
    }

    public final boolean d() {
        return this.useCount > 0;
    }

    public final boolean f1() {
        return this.useCount >= N0(true);
    }

    public final boolean g1() {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.unconfinedQueue;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public long i1() {
        return !m1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean m1() {
        j1<?> e6;
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.unconfinedQueue;
        if (aVar == null || (e6 = aVar.e()) == null) {
            return false;
        }
        e6.run();
        return true;
    }

    public boolean n1() {
        return false;
    }

    public void shutdown() {
    }
}
