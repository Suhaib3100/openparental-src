package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.internal.x0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.w1;
import kotlinx.coroutines.z1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/w1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Lkotlin/k2;", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "Lkotlinx/coroutines/m0;", "e1", "(I)Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "U0", "close", "", "toString", "()Ljava/lang/String;", "f", "Lkotlinx/coroutines/m0;", "default", "j1", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends w1 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final c f80981e = new c();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final m0 default;

    static {
        int e4;
        p pVar = p.f81015d;
        int a5 = v0.a();
        e4 = x0.e(ProtectedSandApp.s("袑\u0001"), 64 < a5 ? a5 : 64, 0, 0, 12, null);
        default = pVar.e1(e4);
    }

    private c() {
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        default.S0(context, block);
    }

    @Override // kotlinx.coroutines.m0
    @f2
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        default.U0(context, block);
    }

    @Override // kotlinx.coroutines.w1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(ProtectedSandApp.s("袒\u0001"));
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    @z1
    public m0 e1(int parallelism) {
        return p.f81015d.e1(parallelism);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@fg.l Runnable command) {
        S0(kotlin.coroutines.i.f75057b, command);
    }

    @Override // kotlinx.coroutines.w1
    @fg.l
    /* renamed from: j1 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("袓\u0001");
    }
}
