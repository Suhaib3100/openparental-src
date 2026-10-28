package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.z1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0016J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/i;", "Lkotlinx/coroutines/z1;", "Lkotlinx/coroutines/scheduling/a;", "M0", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "y0", "A0", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "N0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "close", "T0", "()V", "", "timeout", "R0", "(J)V", "O0", "", "r", "I", "corePoolSize", "s", "maxPoolSize", "t", "J", "idleWorkerKeepAliveNs", "", "u", "Ljava/lang/String;", "schedulerName", "v", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "J0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class i extends z1 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int corePoolSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int maxPoolSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long idleWorkerKeepAliveNs;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String schedulerName;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private a coroutineScheduler;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    private final a M0() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.o0
    public void A0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        a.o(this.coroutineScheduler, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.z1
    @d5.d
    public Executor J0() {
        return this.coroutineScheduler;
    }

    public final void N0(@d5.d Runnable block, @d5.d l context, boolean tailDispatch) {
        this.coroutineScheduler.n(block, context, tailDispatch);
    }

    public final void O0() {
        T0();
    }

    public final synchronized void R0(long timeout) {
        this.coroutineScheduler.P(timeout);
    }

    public final synchronized void T0() {
        this.coroutineScheduler.P(1000L);
        this.coroutineScheduler = M0();
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        a.o(this.coroutineScheduler, runnable, null, false, 6, null);
    }

    public /* synthetic */ i(int i5, int i6, long j5, String str, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f28890c : i5, (i7 & 2) != 0 ? o.f28891d : i6, (i7 & 4) != 0 ? o.f28892e : j5, (i7 & 8) != 0 ? ProtectedSandApp.s("酦") : str);
    }

    public i(int i5, int i6, long j5, @d5.d String str) {
        this.corePoolSize = i5;
        this.maxPoolSize = i6;
        this.idleWorkerKeepAliveNs = j5;
        this.schedulerName = str;
        this.coroutineScheduler = M0();
    }
}
