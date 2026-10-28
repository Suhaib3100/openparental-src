package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.z1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/z1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/m2;", "execute", "", "parallelism", "Lkotlinx/coroutines/o0;", "E0", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "y0", "A0", "close", "", "toString", "s", "Lkotlinx/coroutines/o0;", "default", "J0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class c extends z1 implements Executor {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final c f28864r = new c();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final o0 default;

    static {
        int d6;
        p pVar = p.f28898q;
        String s5 = ProtectedSandApp.s("酣");
        int a6 = t0.a();
        if (64 >= a6) {
            a6 = 64;
        }
        d6 = v0.d(s5, a6, 0, 0, 12, null);
        default = pVar.E0(d6);
    }

    private c() {
    }

    @Override // kotlinx.coroutines.o0
    @i2
    public void A0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        default.A0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @d5.d
    public o0 E0(int parallelism) {
        return p.f28898q.E0(parallelism);
    }

    @Override // kotlinx.coroutines.z1
    @d5.d
    /* renamed from: J0 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ProtectedSandApp.s("酤").toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@d5.d Runnable runnable) {
        y0(EmptyCoroutineContext.f23294o, runnable);
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酥");
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        default.y0(coroutineContext, runnable);
    }
}
