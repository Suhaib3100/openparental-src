package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/z;", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "Lokio/q0;", "h", "", "toString", "Ljava/io/InputStream;", "o", "Ljava/io/InputStream;", "input", "p", "Lokio/q0;", "timeout", "<init>", "(Ljava/io/InputStream;Lokio/q0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final class z implements o0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final q0 timeout;

    public z(@d5.d InputStream inputStream, @d5.d q0 q0Var) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("鎫"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("鎬"));
        this.input = inputStream;
        this.timeout = q0Var;
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鎭"));
        if (byteCount == 0) {
            return 0L;
        }
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鎮"), byteCount).toString());
        }
        try {
            this.timeout.h();
            j0 i12 = sink.i1(1);
            int read = this.input.read(i12.data, i12.limit, (int) Math.min(byteCount, 8192 - i12.limit));
            if (read != -1) {
                i12.limit += read;
                long j5 = read;
                sink.M0(sink.size() + j5);
                return j5;
            }
            if (i12.pos != i12.limit) {
                return -1L;
            }
            sink.head = i12.b();
            k0.d(i12);
            return -1L;
        } catch (AssertionError e6) {
            if (b0.d(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // okio.o0
    @d5.d
    /* renamed from: h, reason: from getter */
    public q0 getTimeout() {
        return this.timeout;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("鎯") + this.input + ')';
    }
}
