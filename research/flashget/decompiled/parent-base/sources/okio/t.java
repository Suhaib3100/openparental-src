package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ForwardingTimeout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0004¨\u0006\u001f"}, d2 = {"Lokio/t;", "Lokio/q0;", "delegate", "<init>", "(Lokio/q0;)V", "m", "(Lokio/q0;)Lokio/t;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lokio/q0;", "j", "()J", "", "f", "()Z", "d", "deadlineNanoTime", "e", "(J)Lokio/q0;", "b", "()Lokio/q0;", "a", "Lkotlin/k2;", "h", "()V", "Lokio/q0;", "l", "n", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class t extends q0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private q0 delegate;

    public t(@fg.l q0 q0Var) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("‱"));
        this.delegate = q0Var;
    }

    @Override // okio.q0
    @fg.l
    public q0 a() {
        return this.delegate.a();
    }

    @Override // okio.q0
    @fg.l
    public q0 b() {
        return this.delegate.b();
    }

    @Override // okio.q0
    public long d() {
        return this.delegate.d();
    }

    @Override // okio.q0
    @fg.l
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
    @fg.l
    public q0 i(long timeout, @fg.l TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("′"));
        return this.delegate.i(timeout, unit);
    }

    @Override // okio.q0
    /* renamed from: j */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @fg.l
    @kd.i(name = "delegate")
    /* renamed from: l, reason: from getter */
    public final q0 getDelegate() {
        return this.delegate;
    }

    @fg.l
    public final t m(@fg.l q0 delegate) {
        kotlin.jvm.internal.l0.p(delegate, ProtectedSandApp.s("‱"));
        this.delegate = delegate;
        return this;
    }

    public final /* synthetic */ void n(@fg.l q0 q0Var) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("″"));
        this.delegate = q0Var;
    }
}
