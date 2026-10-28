package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokio/e0;", "Lokio/m0;", "Ljava/io/OutputStream;", "out", "Lokio/q0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lokio/q0;)V", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "()Lokio/q0;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/io/OutputStream;", "c", "Lokio/q0;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class e0 implements m0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q0 timeout;

    public e0(@fg.l OutputStream outputStream, @fg.l q0 q0Var) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("Ἦ"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("Ἧ"));
        this.out = outputStream;
        this.timeout = q0Var;
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // okio.m0
    @fg.l
    /* renamed from: timeout, reason: from getter */
    public q0 getTimeout() {
        return this.timeout;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ἰ") + this.out + ')';
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("ἱ"));
        j.e(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.h();
            j0 j0Var = source.head;
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            this.out.write(j0Var.data, j0Var.pos, min);
            j0Var.pos += min;
            long j4 = min;
            byteCount -= j4;
            source.Y(source.size() - j4);
            if (j0Var.pos == j0Var.limit) {
                source.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }
}
