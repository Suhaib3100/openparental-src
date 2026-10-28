package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.m2;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086\bø\u0001\u0000R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lokio/q0;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "duration", "c", "b", "a", "Lkotlin/m2;", "h", "monitor", "k", "other", "Lkotlin/Function0;", "block", "g", "Z", "hasDeadline", "J", "timeoutNanos", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasDeadline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long deadlineNanoTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long timeoutNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final q0 f31704d = new a();

    /* compiled from: Timeout.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"okio/q0$a", "Lokio/q0;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "deadlineNanoTime", "e", "Lkotlin/m2;", "h", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class a extends q0 {
        a() {
        }

        @Override // okio.q0
        @d5.d
        public q0 e(long deadlineNanoTime) {
            return this;
        }

        @Override // okio.q0
        public void h() {
        }

        @Override // okio.q0
        @d5.d
        public q0 i(long timeout, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("鍼"));
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokio/q0$b;", "", "", "aNanos", "bNanos", "a", "Lokio/q0;", "NONE", "Lokio/q0;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
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

    @d5.d
    public q0 a() {
        this.hasDeadline = false;
        return this;
    }

    @d5.d
    public q0 b() {
        this.timeoutNanos = 0L;
        return this;
    }

    @d5.d
    public final q0 c(long duration, @d5.d TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("梶"));
        if (duration > 0) {
            return e(unit.toNanos(duration) + System.nanoTime());
        }
        throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("梷"), duration).toString());
    }

    public long d() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException(ProtectedSandApp.s("梸").toString());
    }

    @d5.d
    public q0 e(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    /* renamed from: f, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public final void g(@d5.d q0 q0Var, @d5.d q3.a<m2> aVar) {
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("梹"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("梺"));
        long timeoutNanos = getTimeoutNanos();
        long a6 = INSTANCE.a(q0Var.getTimeoutNanos(), getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(a6, timeUnit);
        if (!getHasDeadline()) {
            if (q0Var.getHasDeadline()) {
                e(q0Var.d());
            }
            try {
                aVar.n();
                i(timeoutNanos, timeUnit);
                if (q0Var.getHasDeadline()) {
                    a();
                    return;
                }
                return;
            } catch (Throwable th) {
                i(timeoutNanos, TimeUnit.NANOSECONDS);
                if (q0Var.getHasDeadline()) {
                    a();
                }
                throw th;
            }
        }
        long d6 = d();
        if (q0Var.getHasDeadline()) {
            e(Math.min(d(), q0Var.d()));
        }
        try {
            aVar.n();
            i(timeoutNanos, timeUnit);
            if (q0Var.getHasDeadline()) {
                e(d6);
            }
        } catch (Throwable th2) {
            i(timeoutNanos, TimeUnit.NANOSECONDS);
            if (q0Var.getHasDeadline()) {
                e(d6);
            }
            throw th2;
        }
    }

    public void h() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(ProtectedSandApp.s("梼"));
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException(ProtectedSandApp.s("梻"));
        }
    }

    @d5.d
    public q0 i(long timeout, @d5.d TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("梽"));
        if (!(timeout >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("梾"), timeout).toString());
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }

    /* renamed from: j, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public final void k(@d5.d Object obj) throws InterruptedIOException {
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("梿"));
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long j5 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, d() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = d() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j6 = timeoutNanos / 1000000;
                obj.wait(j6, (int) (timeoutNanos - (1000000 * j6)));
                j5 = System.nanoTime() - nanoTime;
            }
            if (j5 >= timeoutNanos) {
                throw new InterruptedIOException(ProtectedSandApp.s("检"));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(ProtectedSandApp.s("棁"));
        }
    }
}
