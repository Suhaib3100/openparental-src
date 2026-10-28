package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Lokio/q0;", "", "<init>", "()V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lokio/q0;", "j", "()J", "", "f", "()Z", "d", "deadlineNanoTime", "e", "(J)Lokio/q0;", "duration", "c", "b", "()Lokio/q0;", "a", "Lkotlin/k2;", "h", "monitor", "k", "(Ljava/lang/Object;)V", "other", "Lkotlin/Function0;", "block", "g", "(Lokio/q0;Lld/a;)V", "Z", "hasDeadline", "J", "timeoutNanos", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasDeadline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long deadlineNanoTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long timeoutNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final q0 f85260d = new a();

    /* compiled from: Timeout.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"okio/q0$a", "Lokio/q0;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "(JLjava/util/concurrent/TimeUnit;)Lokio/q0;", "deadlineNanoTime", "e", "(J)Lokio/q0;", "Lkotlin/k2;", "h", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class a extends q0 {
        a() {
        }

        @Override // okio.q0
        @fg.l
        public q0 e(long deadlineNanoTime) {
            return this;
        }

        @Override // okio.q0
        public void h() {
        }

        @Override // okio.q0
        @fg.l
        public q0 i(long timeout, @fg.l TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("‟"));
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokio/q0$b;", "", "<init>", "()V", "", "aNanos", "bNanos", "a", "(JJ)J", "Lokio/q0;", "NONE", "Lokio/q0;", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.q0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a(long aNanos, long bNanos) {
            return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    public q0 a() {
        this.hasDeadline = false;
        return this;
    }

    @fg.l
    public q0 b() {
        this.timeoutNanos = 0L;
        return this;
    }

    @fg.l
    public final q0 c(long duration, @fg.l TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("ᵏ"));
        if (duration > 0) {
            return e(unit.toNanos(duration) + System.nanoTime());
        }
        throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ᵐ"), duration).toString());
    }

    public long d() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ᵑ"));
    }

    @fg.l
    public q0 e(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    /* renamed from: f, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public final void g(@fg.l q0 other, @fg.l ld.a<k2> block) {
        kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("ᵒ"));
        kotlin.jvm.internal.l0.p(block, ProtectedSandApp.s("ᵓ"));
        long timeoutNanos = getTimeoutNanos();
        long a5 = INSTANCE.a(other.getTimeoutNanos(), getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(a5, timeUnit);
        if (!getHasDeadline()) {
            if (other.getHasDeadline()) {
                e(other.d());
            }
            try {
                block.invoke();
                i(timeoutNanos, timeUnit);
                if (other.getHasDeadline()) {
                    a();
                    return;
                }
                return;
            } catch (Throwable th) {
                i(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.getHasDeadline()) {
                    a();
                }
                throw th;
            }
        }
        long d5 = d();
        if (other.getHasDeadline()) {
            e(Math.min(d(), other.d()));
        }
        try {
            block.invoke();
            i(timeoutNanos, timeUnit);
            if (other.getHasDeadline()) {
                e(d5);
            }
        } catch (Throwable th2) {
            i(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.getHasDeadline()) {
                e(d5);
            }
            throw th2;
        }
    }

    public void h() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(ProtectedSandApp.s("ᵕ"));
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException(ProtectedSandApp.s("ᵔ"));
        }
    }

    @fg.l
    public q0 i(long timeout, @fg.l TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("ᵏ"));
        if (!(timeout >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ᵖ"), timeout).toString());
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }

    /* renamed from: j, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public final void k(@fg.l Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.l0.p(monitor, ProtectedSandApp.s("ᵗ"));
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long j4 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, d() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = d() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j5 = timeoutNanos / 1000000;
                monitor.wait(j5, (int) (timeoutNanos - (1000000 * j5)));
                j4 = System.nanoTime() - nanoTime;
            }
            if (j4 >= timeoutNanos) {
                throw new InterruptedIOException(ProtectedSandApp.s("ᵘ"));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(ProtectedSandApp.s("ᵕ"));
        }
    }
}
