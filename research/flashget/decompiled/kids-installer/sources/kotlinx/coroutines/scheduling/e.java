package kotlinx.coroutines.scheduling;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.z1;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b,\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0017\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/z1;", "Lkotlinx/coroutines/scheduling/a;", "O0", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "y0", "A0", "close", "", "toString", "", "parallelism", "Lkotlinx/coroutines/o0;", "M0", "T0", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "R0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "r", "I", "corePoolSize", "s", "maxPoolSize", "", "t", "J", "idleWorkerKeepAliveNs", "u", "Ljava/lang/String;", "schedulerName", "v", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "J0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes6.dex */
public class e extends z1 {

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

    public /* synthetic */ e(int i5, int i6, long j5, String str, int i7, w wVar) {
        this(i5, i6, j5, (i7 & 8) != 0 ? ProtectedSandApp.s("酪") : str);
    }

    public static /* synthetic */ o0 N0(e eVar, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("酬"));
        }
        if ((i6 & 1) != 0) {
            i5 = 16;
        }
        return eVar.M0(i5);
    }

    private final a O0() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.o0
    public void A0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        try {
            a.o(this.coroutineScheduler, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            a1.f27251v.y0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.z1
    @d5.d
    /* renamed from: J0 */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    @d5.d
    public final o0 M0(int parallelism) {
        if (parallelism > 0) {
            return new g(this, parallelism, null, 1);
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("酭"), parallelism).toString());
    }

    public final void R0(@d5.d Runnable block, @d5.d l context, boolean tailDispatch) {
        try {
            this.coroutineScheduler.n(block, context, tailDispatch);
        } catch (RejectedExecutionException unused) {
            a1.f27251v.x1(this.coroutineScheduler.e(block, context));
        }
    }

    @d5.d
    public final o0 T0(int parallelism) {
        if (!(parallelism > 0)) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("酰"), parallelism).toString());
        }
        if (parallelism <= this.corePoolSize) {
            return new g(this, parallelism, null, 0);
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("酮") + this.corePoolSize + ProtectedSandApp.s("酯") + parallelism).toString());
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        return super.toString() + ProtectedSandApp.s("酱") + this.coroutineScheduler + ']';
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        try {
            a.o(this.coroutineScheduler, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            a1.f27251v.x1(runnable);
        }
    }

    public e(int i5, int i6, long j5, @d5.d String str) {
        this.corePoolSize = i5;
        this.maxPoolSize = i6;
        this.idleWorkerKeepAliveNs = j5;
        this.schedulerName = str;
        this.coroutineScheduler = O0();
    }

    public /* synthetic */ e(int i5, int i6, String str, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f28890c : i5, (i7 & 2) != 0 ? o.f28891d : i6, (i7 & 4) != 0 ? ProtectedSandApp.s("酫") : str);
    }

    public e(int i5, int i6, @d5.d String str) {
        this(i5, i6, o.f28892e, str);
    }

    public /* synthetic */ e(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f28890c : i5, (i7 & 2) != 0 ? o.f28891d : i6);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i5, int i6) {
        this(i5, i6, o.f28892e, null, 8, null);
    }
}
