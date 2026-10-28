package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: GzipSink.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u000f8G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lokio/u;", "Lokio/m0;", "Lkotlin/m2;", "d", "Lokio/m;", "buffer", "", "byteCount", "c", "source", "t0", "flush", "Lokio/q0;", "h", "close", "Ljava/util/zip/Deflater;", "a", "()Ljava/util/zip/Deflater;", "Lokio/h0;", "o", "Lokio/h0;", "sink", "p", "Ljava/util/zip/Deflater;", "b", "deflater", "Lokio/q;", "q", "Lokio/q;", "deflaterSink", "", "r", "Z", "closed", "Ljava/util/zip/CRC32;", "s", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/m0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class u implements m0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final h0 sink;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Deflater deflater;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final q deflaterSink;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public u(@d5.d m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("鎇"));
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

    private final void c(m mVar, long j5) {
        j0 j0Var = mVar.head;
        kotlin.jvm.internal.l0.m(j0Var);
        while (j5 > 0) {
            int min = (int) Math.min(j5, j0Var.limit - j0Var.pos);
            this.crc.update(j0Var.data, j0Var.pos, min);
            j5 -= min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
    }

    private final void d() {
        this.sink.L((int) this.crc.getValue());
        this.sink.L((int) this.deflater.getBytesRead());
    }

    @p3.i(name = "-deprecated_deflater")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "deflater", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final Deflater getDeflater() {
        return this.deflater;
    }

    @p3.i(name = "deflater")
    @d5.d
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
    @d5.d
    public q0 h() {
        return this.sink.h();
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鎈"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鎉"), j5).toString());
        }
        if (j5 == 0) {
            return;
        }
        c(mVar, j5);
        this.deflaterSink.t0(mVar, j5);
    }
}
