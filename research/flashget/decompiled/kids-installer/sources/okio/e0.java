package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokio/e0;", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "Lokio/q0;", "h", "", "toString", "Ljava/io/OutputStream;", "o", "Ljava/io/OutputStream;", "out", "p", "Lokio/q0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lokio/q0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final class e0 implements m0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final q0 timeout;

    public e0(@d5.d OutputStream outputStream, @d5.d q0 q0Var) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("銗"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("銘"));
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
    @d5.d
    /* renamed from: h, reason: from getter */
    public q0 getTimeout() {
        return this.timeout;
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("銙"));
        j.e(mVar.size(), 0L, j5);
        while (j5 > 0) {
            this.timeout.h();
            j0 j0Var = mVar.head;
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(j5, j0Var.limit - j0Var.pos);
            this.out.write(j0Var.data, j0Var.pos, min);
            j0Var.pos += min;
            long j6 = min;
            j5 -= j6;
            mVar.M0(mVar.size() - j6);
            if (j0Var.pos == j0Var.limit) {
                mVar.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("銚") + this.out + ')';
    }
}
