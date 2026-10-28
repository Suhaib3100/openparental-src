package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.w0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.w1;
import kotlinx.coroutines.x0;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bB\u001d\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b!\u0010 J+\u0010%\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0011\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/w1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "Lkotlinx/coroutines/scheduling/a;", "n1", "()Lkotlinx/coroutines/scheduling/a;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "close", "()V", "toString", "()Ljava/lang/String;", "parallelism", "Lkotlinx/coroutines/m0;", "k1", "(I)Lkotlinx/coroutines/m0;", "y1", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "t1", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "e", "I", "f", "g", "J", "h", "Ljava/lang/String;", "i", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "j1", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
@r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
/* loaded from: classes7.dex */
public class e extends w1 {

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

    public /* synthetic */ e(int i4, int i5, long j4, String str, int i6, w wVar) {
        this(i4, i5, j4, (i6 & 8) != 0 ? ProtectedSandApp.s("袗\u0001") : str);
    }

    public static /* synthetic */ m0 l1(e eVar, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("袘\u0001"));
        }
        if ((i5 & 1) != 0) {
            i4 = 16;
        }
        return eVar.k1(i4);
    }

    private final a n1() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        try {
            a.m(this.coroutineScheduler, block, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            x0.f81189j.g2(block);
        }
    }

    @Override // kotlinx.coroutines.m0
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        try {
            a.m(this.coroutineScheduler, block, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            x0.f81189j.S0(context, block);
        }
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

    @fg.l
    public final m0 k1(int parallelism) {
        if (parallelism > 0) {
            return new g(this, parallelism, null, 1);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("袙\u0001"), parallelism).toString());
    }

    public final void t1(@fg.l Runnable block, @fg.l l context, boolean tailDispatch) {
        try {
            this.coroutineScheduler.l(block, context, tailDispatch);
        } catch (RejectedExecutionException unused) {
            x0.f81189j.g2(this.coroutineScheduler.f(block, context));
        }
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        return super.toString() + ProtectedSandApp.s("袚\u0001") + this.coroutineScheduler + ']';
    }

    @fg.l
    public final m0 y1(int parallelism) {
        if (parallelism <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("袙\u0001"), parallelism).toString());
        }
        if (parallelism <= this.corePoolSize) {
            return new g(this, parallelism, null, 0);
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("袛\u0001") + this.corePoolSize + ProtectedSandApp.s("袜\u0001") + parallelism).toString());
    }

    public e(int i4, int i5, long j4, @fg.l String str) {
        this.corePoolSize = i4;
        this.maxPoolSize = i5;
        this.idleWorkerKeepAliveNs = j4;
        this.schedulerName = str;
        this.coroutineScheduler = n1();
    }

    public /* synthetic */ e(int i4, int i5, String str, int i6, w wVar) {
        this((i6 & 1) != 0 ? o.f81007c : i4, (i6 & 2) != 0 ? o.f81008d : i5, (i6 & 4) != 0 ? o.f81005a : str);
    }

    public e(int i4, int i5, @fg.l String str) {
        this(i4, i5, o.f81009e, str);
    }

    public /* synthetic */ e(int i4, int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? o.f81007c : i4, (i6 & 2) != 0 ? o.f81008d : i5);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i4, int i5) {
        this(i4, i5, o.f81009e, null, 8, null);
    }
}
