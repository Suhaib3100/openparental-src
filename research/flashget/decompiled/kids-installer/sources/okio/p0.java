package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.m2;

/* compiled from: Throttler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lokio/p0;", "", "", "g", "f", "nanosToWait", "Lkotlin/m2;", "k", "bytesPerSecond", "waitByteCount", "maxByteCount", "d", "byteCount", "j", "(J)J", "now", "a", "(JJ)J", "Lokio/o0;", "source", "i", "Lokio/m0;", "sink", "h", "J", "b", "c", "allocatedUntil", "<init>", "(J)V", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long bytesPerSecond;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long waitByteCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long maxByteCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long allocatedUntil;

    /* compiled from: Throttler.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"okio/p0$a", "Lokio/r;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class a extends r {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ m0 f31698q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, m0 m0Var2) {
            super(m0Var2);
            this.f31698q = m0Var;
        }

        @Override // okio.r, okio.m0
        public void t0(@d5.d m mVar, long j5) throws IOException {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鍸"));
            while (j5 > 0) {
                try {
                    long j6 = p0.this.j(j5);
                    super.t0(mVar, j6);
                    j5 -= j6;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(ProtectedSandApp.s("鍹"));
                }
            }
        }
    }

    /* compiled from: Throttler.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"okio/p0$b", "Lokio/s;", "Lokio/m;", "sink", "", "byteCount", "X0", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class b extends s {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ o0 f31700q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, o0 o0Var2) {
            super(o0Var2);
            this.f31700q = o0Var;
        }

        @Override // okio.s, okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鍺"));
            try {
                return super.X0(sink, p0.this.j(byteCount));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException(ProtectedSandApp.s("鍻"));
            }
        }
    }

    public p0(long j5) {
        this.allocatedUntil = j5;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
    }

    public static /* synthetic */ void e(p0 p0Var, long j5, long j6, long j7, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = p0Var.waitByteCount;
        }
        long j8 = j6;
        if ((i5 & 4) != 0) {
            j7 = p0Var.maxByteCount;
        }
        p0Var.d(j5, j8, j7);
    }

    private final long f(long j5) {
        return (j5 * 1000000000) / this.bytesPerSecond;
    }

    private final long g(long j5) {
        return (j5 * this.bytesPerSecond) / 1000000000;
    }

    private final void k(long j5) {
        long j6 = j5 / 1000000;
        wait(j6, (int) (j5 - (1000000 * j6)));
    }

    public final long a(long now, long byteCount) {
        if (this.bytesPerSecond == 0) {
            return byteCount;
        }
        long max = Math.max(this.allocatedUntil - now, 0L);
        long g5 = this.maxByteCount - g(max);
        if (g5 >= byteCount) {
            this.allocatedUntil = now + max + f(byteCount);
            return byteCount;
        }
        long j5 = this.waitByteCount;
        if (g5 >= j5) {
            this.allocatedUntil = now + f(this.maxByteCount);
            return g5;
        }
        long min = Math.min(j5, byteCount);
        long f6 = max + f(min - this.maxByteCount);
        if (f6 != 0) {
            return -f6;
        }
        this.allocatedUntil = now + f(this.maxByteCount);
        return min;
    }

    @p3.j
    public final void b(long j5) {
        e(this, j5, 0L, 0L, 6, null);
    }

    @p3.j
    public final void c(long j5, long j6) {
        e(this, j5, j6, 0L, 4, null);
    }

    @p3.j
    public final void d(long j5, long j6, long j7) {
        synchronized (this) {
            if (!(j5 >= 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("桶").toString());
            }
            if (!(j6 > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("桵").toString());
            }
            if (!(j7 >= j6)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("桴").toString());
            }
            this.bytesPerSecond = j5;
            this.waitByteCount = j6;
            this.maxByteCount = j7;
            notifyAll();
            m2 m2Var = m2.f23662a;
        }
    }

    @d5.d
    public final m0 h(@d5.d m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("桷"));
        return new a(sink, sink);
    }

    @d5.d
    public final o0 i(@d5.d o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("桸"));
        return new b(source, source);
    }

    public final long j(long byteCount) {
        long a6;
        if (!(byteCount > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("桹").toString());
        }
        synchronized (this) {
            while (true) {
                a6 = a(System.nanoTime(), byteCount);
                if (a6 < 0) {
                    k(-a6);
                }
            }
        }
        return a6;
    }

    public p0() {
        this(System.nanoTime());
    }
}
