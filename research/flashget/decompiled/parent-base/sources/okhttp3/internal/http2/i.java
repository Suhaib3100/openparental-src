package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http2.c;
import okio.m;
import okio.n;

/* compiled from: Http2Writer.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J%\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ-\u0010;\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\u0010J+\u0010?\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010CR\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010ER\u0017\u0010K\u001a\u00020G8\u0006¢\u0006\f\n\u0004\b;\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010E¨\u0006M"}, d2 = {"Lokhttp3/internal/http2/i;", "Ljava/io/Closeable;", "Lokio/n;", "sink", "", "client", "<init>", "(Lokio/n;Z)V", "", "streamId", "", "byteCount", "Lkotlin/k2;", "q", "(IJ)V", "b", "()V", "Lokhttp3/internal/http2/l;", "peerSettings", "a", "(Lokhttp3/internal/http2/l;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "l", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/a;", "errorCode", "m", "(ILokhttp3/internal/http2/a;)V", "i", "()I", "outFinished", "Lokio/m;", "source", "c", "(ZILokio/m;I)V", "flags", "buffer", "d", "(IILokio/m;I)V", "settings", "n", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "", "debugData", "g", "(ILokhttp3/internal/http2/a;[B)V", "windowSizeIncrement", "o", "length", "type", "e", "(IIII)V", "close", "headerBlock", "h", "(ZILjava/util/List;)V", "Lokio/m;", "hpackBuffer", "I", "maxFrameSize", "Z", "closed", "Lokhttp3/internal/http2/c$b;", "Lokhttp3/internal/http2/c$b;", "f", "()Lokhttp3/internal/http2/c$b;", "hpackWriter", "Lokio/n;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class i implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m hpackBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c.b hpackWriter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f84771h = Logger.getLogger(d.class.getName());

    public i(@fg.l n nVar, boolean z4) {
        l0.p(nVar, ProtectedSandApp.s("ᵲ"));
        this.sink = nVar;
        this.client = z4;
        m mVar = new m();
        this.hpackBuffer = mVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new c.b(0, false, mVar, 3, null);
    }

    private final void q(int streamId, long byteCount) throws IOException {
        while (byteCount > 0) {
            long min = Math.min(this.maxFrameSize, byteCount);
            byteCount -= min;
            e(streamId, (int) min, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void a(@fg.l l peerSettings) throws IOException {
        try {
            l0.p(peerSettings, ProtectedSandApp.s("ᵳ"));
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("ᵴ"));
            }
            this.maxFrameSize = peerSettings.g(this.maxFrameSize);
            if (peerSettings.d() != -1) {
                this.hpackWriter.e(peerSettings.d());
            }
            e(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() throws IOException {
        String s4 = ProtectedSandApp.s("ᵵ");
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException(ProtectedSandApp.s("ᵴ"));
                }
                if (this.client) {
                    Logger logger = f84771h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(okhttp3.internal.d.v(s4 + d.CONNECTION_PREFACE.s(), new Object[0]));
                    }
                    this.sink.t3(d.CONNECTION_PREFACE);
                    this.sink.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c(boolean outFinished, int streamId, @fg.m m source, int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        d(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final void d(int streamId, int flags, @fg.m m buffer, int byteCount) throws IOException {
        e(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            n nVar = this.sink;
            l0.m(buffer);
            nVar.write(buffer, byteCount);
        }
    }

    public final void e(int streamId, int length, int type, int flags) throws IOException {
        Logger logger = f84771h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.f84609x.c(false, streamId, length, type, flags));
        }
        if (!(length <= this.maxFrameSize)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("ᵷ") + this.maxFrameSize + ProtectedSandApp.s("ᵸ") + length).toString());
        }
        if (!((((int) 2147483648L) & streamId) == 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ᵶ"), streamId).toString());
        }
        okhttp3.internal.d.k0(this.sink, length);
        this.sink.writeByte(type & 255);
        this.sink.writeByte(flags & 255);
        this.sink.writeInt(streamId & Integer.MAX_VALUE);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final c.b getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        this.sink.flush();
    }

    public final synchronized void g(int lastGoodStreamId, @fg.l a errorCode, @fg.l byte[] debugData) throws IOException {
        try {
            l0.p(errorCode, ProtectedSandApp.s("ᵹ"));
            l0.p(debugData, ProtectedSandApp.s("ᵺ"));
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("ᵴ"));
            }
            boolean z4 = true;
            if (!(errorCode.getHttpCode() != -1)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᵻ"));
            }
            e(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(lastGoodStreamId);
            this.sink.writeInt(errorCode.getHttpCode());
            if (debugData.length != 0) {
                z4 = false;
            }
            if (!z4) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } finally {
        }
    }

    public final synchronized void h(boolean outFinished, int streamId, @fg.l List<b> headerBlock) throws IOException {
        l0.p(headerBlock, ProtectedSandApp.s("ᵼ"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        this.hpackWriter.g(headerBlock);
        long size = this.hpackBuffer.size();
        long min = Math.min(this.maxFrameSize, size);
        int i4 = size == min ? 4 : 0;
        if (outFinished) {
            i4 |= 1;
        }
        e(streamId, (int) min, 1, i4);
        this.sink.write(this.hpackBuffer, min);
        if (size > min) {
            q(streamId, size - min);
        }
    }

    /* renamed from: i, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void k(boolean ack, int payload1, int payload2) throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        e(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void l(int streamId, int promisedStreamId, @fg.l List<b> requestHeaders) throws IOException {
        l0.p(requestHeaders, ProtectedSandApp.s("ᵽ"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        this.hpackWriter.g(requestHeaders);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize - 4, size);
        long j4 = min;
        e(streamId, min + 4, 5, size == j4 ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j4);
        if (size > j4) {
            q(streamId, size - j4);
        }
    }

    public final synchronized void m(int streamId, @fg.l a errorCode) throws IOException {
        l0.p(errorCode, ProtectedSandApp.s("ᵹ"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("ᵴ"));
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᵾ"));
        }
        e(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void n(@fg.l l settings) throws IOException {
        try {
            l0.p(settings, ProtectedSandApp.s("ᵿ"));
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("ᵴ"));
            }
            int i4 = 0;
            e(0, settings.l() * 6, 4, 0);
            while (i4 < 10) {
                if (settings.i(i4)) {
                    this.sink.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                    this.sink.writeInt(settings.b(i4));
                }
                i4++;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(int streamId, long windowSizeIncrement) throws IOException {
        String s4 = ProtectedSandApp.s("ᶀ");
        synchronized (this) {
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("ᵴ"));
            }
            if (!(windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L)) {
                throw new IllegalArgumentException((s4 + windowSizeIncrement).toString());
            }
            e(streamId, 4, 8, 0);
            this.sink.writeInt((int) windowSizeIncrement);
            this.sink.flush();
        }
    }
}
