package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/z;", "Lokio/o0;", "Ljava/io/InputStream;", "input", "Lokio/q0;", "timeout", "<init>", "(Ljava/io/InputStream;Lokio/q0;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "()Lokio/q0;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/io/InputStream;", "c", "Lokio/q0;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class z implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q0 timeout;

    public z(@fg.l InputStream inputStream, @fg.l q0 q0Var) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("\u2063"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("\u2064"));
        this.input = inputStream;
        this.timeout = q0Var;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // okio.o0
    @fg.l
    /* renamed from: timeout, reason: from getter */
    public q0 getTimeout() {
        return this.timeout;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("\u2065") + this.input + ')';
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("\u2066"));
        if (byteCount == 0) {
            return 0L;
        }
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("\u2067"), byteCount).toString());
        }
        try {
            this.timeout.h();
            j0 B0 = sink.B0(1);
            int read = this.input.read(B0.data, B0.limit, (int) Math.min(byteCount, 8192 - B0.limit));
            if (read != -1) {
                B0.limit += read;
                long j4 = read;
                sink.Y(sink.size() + j4);
                return j4;
            }
            if (B0.pos != B0.limit) {
                return -1L;
            }
            sink.head = B0.b();
            k0.d(B0);
            return -1L;
        } catch (AssertionError e4) {
            if (b0.d(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }
}
