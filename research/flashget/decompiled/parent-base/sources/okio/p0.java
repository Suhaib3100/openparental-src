package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Throttler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0005J+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006\""}, d2 = {"Lokio/p0;", "", "", "allocatedUntil", "<init>", "(J)V", "()V", "g", "(J)J", "f", "nanosToWait", "Lkotlin/k2;", "k", "bytesPerSecond", "waitByteCount", "maxByteCount", "d", "(JJJ)V", "byteCount", "j", "now", "a", "(JJ)J", "Lokio/o0;", "source", "i", "(Lokio/o0;)Lokio/o0;", "Lokio/m0;", "sink", "h", "(Lokio/m0;)Lokio/m0;", "J", "b", "c", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
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
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"okio/p0$a", "Lokio/r;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class a extends r {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f85254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, m0 m0Var2) {
            super(m0Var2);
            this.f85254c = m0Var;
        }

        @Override // okio.r, okio.m0
        public void write(@fg.l m source, long byteCount) throws IOException {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("‖"));
            while (byteCount > 0) {
                try {
                    long j4 = p0.this.j(byteCount);
                    super.write(source, j4);
                    byteCount -= j4;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(ProtectedSandApp.s("‗"));
                }
            }
        }
    }

    /* compiled from: Throttler.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"okio/p0$b", "Lokio/s;", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class b extends s {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o0 f85256d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, o0 o0Var2) {
            super(o0Var2);
            this.f85256d = o0Var;
        }

        @Override // okio.s, okio.o0
        public long w3(@fg.l m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("‚"));
            try {
                return super.w3(sink, p0.this.j(byteCount));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException(ProtectedSandApp.s("‛"));
            }
        }
    }

    public p0(long j4) {
        this.allocatedUntil = j4;
        this.waitByteCount = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void e(p0 p0Var, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = p0Var.waitByteCount;
        }
        long j7 = j5;
        if ((i4 & 4) != 0) {
            j6 = p0Var.maxByteCount;
        }
        p0Var.d(j4, j7, j6);
    }

    private final long f(long j4) {
        return (j4 * 1000000000) / this.bytesPerSecond;
    }

    private final long g(long j4) {
        return (j4 * this.bytesPerSecond) / 1000000000;
    }

    private final void k(long nanosToWait) {
        long j4 = nanosToWait / 1000000;
        wait(j4, (int) (nanosToWait - (1000000 * j4)));
    }

    public final long a(long now, long byteCount) {
        if (this.bytesPerSecond == 0) {
            return byteCount;
        }
        long max = Math.max(this.allocatedUntil - now, 0L);
        long g4 = this.maxByteCount - g(max);
        if (g4 >= byteCount) {
            this.allocatedUntil = now + max + f(byteCount);
            return byteCount;
        }
        long j4 = this.waitByteCount;
        if (g4 >= j4) {
            this.allocatedUntil = now + f(this.maxByteCount);
            return g4;
        }
        long min = Math.min(j4, byteCount);
        long f4 = max + f(min - this.maxByteCount);
        if (f4 != 0) {
            return -f4;
        }
        this.allocatedUntil = now + f(this.maxByteCount);
        return min;
    }

    @kd.j
    public final void b(long j4) {
        e(this, j4, 0L, 0L, 6, null);
    }

    @kd.j
    public final void c(long j4, long j5) {
        e(this, j4, j5, 0L, 4, null);
    }

    @kd.j
    public final void d(long bytesPerSecond, long waitByteCount, long maxByteCount) {
        synchronized (this) {
            if (!(bytesPerSecond >= 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("“"));
            }
            if (!(waitByteCount > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("“"));
            }
            if (!(maxByteCount >= waitByteCount)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("“"));
            }
            this.bytesPerSecond = bytesPerSecond;
            this.waitByteCount = waitByteCount;
            this.maxByteCount = maxByteCount;
            notifyAll();
            k2 k2Var = k2.f75408a;
        }
    }

    @fg.l
    public final m0 h(@fg.l m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("”"));
        return new a(sink, sink);
    }

    @fg.l
    public final o0 i(@fg.l o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("„"));
        return new b(source, source);
    }

    public final long j(long byteCount) {
        long a5;
        if (!(byteCount > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("“"));
        }
        synchronized (this) {
            while (true) {
                a5 = a(System.nanoTime(), byteCount);
                if (a5 < 0) {
                    k(-a5);
                }
            }
        }
        return a5;
    }

    public p0() {
        this(System.nanoTime());
    }
}
