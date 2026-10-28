package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lokio/q;", "Lokio/m0;", "Lokio/n;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/n;Ljava/util/zip/Deflater;)V", "(Lokio/m0;Ljava/util/zip/Deflater;)V", "", "syncFlush", "Lkotlin/k2;", "a", "(Z)V", "Lokio/m;", "source", "", "byteCount", "write", "(Lokio/m;J)V", "flush", "()V", "b", "close", "Lokio/q0;", "timeout", "()Lokio/q0;", "", "toString", "()Ljava/lang/String;", "Z", "closed", "c", "Lokio/n;", "d", "Ljava/util/zip/Deflater;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class q implements m0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@fg.l m0 m0Var, @fg.l Deflater deflater) {
        this(c0.b(m0Var), deflater);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("†"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("‡"));
    }

    @IgnoreJRERequirement
    private final void a(boolean syncFlush) {
        j0 B0;
        int deflate;
        m bufferField = this.sink.getBufferField();
        while (true) {
            B0 = bufferField.B0(1);
            if (syncFlush) {
                Deflater deflater = this.deflater;
                byte[] bArr = B0.data;
                int i4 = B0.limit;
                deflate = deflater.deflate(bArr, i4, 8192 - i4, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = B0.data;
                int i5 = B0.limit;
                deflate = deflater2.deflate(bArr2, i5, 8192 - i5);
            }
            if (deflate > 0) {
                B0.limit += deflate;
                bufferField.Y(bufferField.size() + deflate);
                this.sink.y0();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (B0.pos == B0.limit) {
            bufferField.head = B0.b();
            k0.d(B0);
        }
    }

    public final void b() {
        this.deflater.finish();
        a(false);
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.sink.flush();
    }

    @Override // okio.m0
    @fg.l
    public q0 timeout() {
        return this.sink.timeout();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("•") + this.sink + ')';
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("‣"));
        j.e(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            j0 j0Var = source.head;
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            this.deflater.setInput(j0Var.data, j0Var.pos, min);
            a(false);
            long j4 = min;
            source.Y(source.size() - j4);
            int i4 = j0Var.pos + min;
            j0Var.pos = i4;
            if (i4 == j0Var.limit) {
                source.head = j0Var.b();
                k0.d(j0Var);
            }
            byteCount -= j4;
        }
    }

    public q(@fg.l n nVar, @fg.l Deflater deflater) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("†"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("‡"));
        this.sink = nVar;
        this.deflater = deflater;
    }
}
