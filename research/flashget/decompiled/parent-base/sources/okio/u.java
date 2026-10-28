package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: GzipSink.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00158G¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lokio/u;", "Lokio/m0;", "sink", "<init>", "(Lokio/m0;)V", "Lkotlin/k2;", "d", "()V", "Lokio/m;", "buffer", "", "byteCount", "c", "(Lokio/m;J)V", "source", "write", "flush", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "Ljava/util/zip/Deflater;", "a", "()Ljava/util/zip/Deflater;", "Lokio/h0;", "b", "Lokio/h0;", "Ljava/util/zip/Deflater;", "deflater", "Lokio/q;", "Lokio/q;", "deflaterSink", "", "e", "Z", "closed", "Ljava/util/zip/CRC32;", "f", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class u implements m0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 sink;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Deflater deflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q deflaterSink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public u(@fg.l m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("‴"));
        h0 h0Var = new h0(m0Var);
        this.sink = h0Var;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new q((n) h0Var, deflater);
        this.crc = new CRC32();
        m mVar = h0Var.bufferField;
        mVar.writeShort(8075);
        mVar.writeByte(8);
        mVar.writeByte(0);
        mVar.writeInt(0);
        mVar.writeByte(0);
        mVar.writeByte(0);
    }

    private final void c(m buffer, long byteCount) {
        j0 j0Var = buffer.head;
        kotlin.jvm.internal.l0.m(j0Var);
        while (byteCount > 0) {
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            this.crc.update(j0Var.data, j0Var.pos, min);
            byteCount -= min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
    }

    private final void d() {
        this.sink.s2((int) this.crc.getValue());
        this.sink.s2((int) this.deflater.getBytesRead());
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "deflater", imports = {}))
    @kd.i(name = "-deprecated_deflater")
    /* renamed from: a, reason: from getter */
    public final Deflater getDeflater() {
        return this.deflater;
    }

    @fg.l
    @kd.i(name = "deflater")
    public final Deflater b() {
        return this.deflater;
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.b();
            d();
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
        this.deflaterSink.flush();
    }

    @Override // okio.m0
    @fg.l
    public q0 timeout() {
        return this.sink.sink.timeout();
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("‵"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("‶"), byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        c(source, byteCount);
        this.deflaterSink.write(source, byteCount);
    }
}
