package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.w1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\"\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/scheduling/i;", "Lkotlinx/coroutines/w1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/a;", "k1", "()Lkotlinx/coroutines/scheduling/a;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "l1", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "close", "()V", "y1", "timeout", "t1", "(J)V", "n1", "e", "I", "f", "g", "J", "h", "Ljava/lang/String;", "i", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "j1", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class i extends w1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int corePoolSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxPoolSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long idleWorkerKeepAliveNs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String schedulerName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a coroutineScheduler;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    private final a k1() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        a.m(this.coroutineScheduler, block, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.m0
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        a.m(this.coroutineScheduler, block, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.w1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.w1
    @fg.l
    /* renamed from: j1 */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void l1(@fg.l Runnable block, @fg.l l context, boolean tailDispatch) {
        this.coroutineScheduler.l(block, context, tailDispatch);
    }

    public final void n1() {
        y1();
    }

    public final synchronized void t1(long timeout) {
        this.coroutineScheduler.D(timeout);
    }

    public final synchronized void y1() {
        this.coroutineScheduler.D(1000L);
        this.coroutineScheduler = k1();
    }

    public /* synthetic */ i(int i4, int i5, long j4, String str, int i6, w wVar) {
        this((i6 & 1) != 0 ? o.f81007c : i4, (i6 & 2) != 0 ? o.f81008d : i5, (i6 & 4) != 0 ? o.f81009e : j4, (i6 & 8) != 0 ? ProtectedSandApp.s("袔\u0001") : str);
    }

    public i(int i4, int i5, long j4, @fg.l String str) {
        this.corePoolSize = i4;
        this.maxPoolSize = i5;
        this.idleWorkerKeepAliveNs = j4;
        this.schedulerName = str;
        this.coroutineScheduler = k1();
    }
}
