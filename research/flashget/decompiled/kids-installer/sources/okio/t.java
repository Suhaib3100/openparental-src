package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ForwardingTimeout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokio/t;", "Lokio/q0;", "delegate", "m", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "b", "a", "Lkotlin/m2;", "h", "Lokio/q0;", "l", "()Lokio/q0;", "n", "(Lokio/q0;)V", "<init>", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class t extends q0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private q0 delegate;

    public t(@d5.d q0 q0Var) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("鎃"));
        this.delegate = q0Var;
    }

    @Override // okio.q0
    @d5.d
    public q0 a() {
        return this.delegate.a();
    }

    @Override // okio.q0
    @d5.d
    public q0 b() {
        return this.delegate.b();
    }

    @Override // okio.q0
    public long d() {
        return this.delegate.d();
    }

    @Override // okio.q0
    @d5.d
    public q0 e(long deadlineNanoTime) {
        return this.delegate.e(deadlineNanoTime);
    }

    @Override // okio.q0
    /* renamed from: f */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // okio.q0
    public void h() throws IOException {
        this.delegate.h();
    }

    @Override // okio.q0
    @d5.d
    public q0 i(long timeout, @d5.d TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("鎄"));
        return this.delegate.i(timeout, unit);
    }

    @Override // okio.q0
    /* renamed from: j */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @p3.i(name = "delegate")
    @d5.d
    /* renamed from: l, reason: from getter */
    public final q0 getDelegate() {
        return this.delegate;
    }

    @d5.d
    public final t m(@d5.d q0 delegate) {
        kotlin.jvm.internal.l0.p(delegate, ProtectedSandApp.s("鎅"));
        this.delegate = delegate;
        return this;
    }

    public final /* synthetic */ void n(@d5.d q0 q0Var) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("鎆"));
        this.delegate = q0Var;
    }
}
