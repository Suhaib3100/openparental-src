package okhttp3.internal.http2;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 D2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00101\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b\u001f\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00106¨\u0006E"}, d2 = {"Lokhttp3/internal/http2/i;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lkotlin/m2;", "w", "b", "Lokhttp3/internal/http2/l;", "peerSettings", "a", "promisedStreamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "n", "flush", "Lokhttp3/internal/http2/a;", "errorCode", "o", "l", "", "outFinished", "Lokio/m;", "source", "c", "flags", "buffer", "d", "settings", "r", "ack", "payload1", "payload2", "m", "lastGoodStreamId", "", "debugData", "j", "windowSizeIncrement", "t", "length", "type", "e", "close", "headerBlock", "k", "Lokio/m;", "hpackBuffer", "p", "I", "maxFrameSize", "q", "Z", "closed", "Lokhttp3/internal/http2/c$b;", "Lokhttp3/internal/http2/c$b;", "g", "()Lokhttp3/internal/http2/c$b;", "hpackWriter", "Lokio/n;", "s", "Lokio/n;", "sink", "client", "<init>", "(Lokio/n;Z)V", "v", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i implements Closeable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final m hpackBuffer;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final c.b hpackWriter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: u, reason: collision with root package name */
    private static final Logger f31231u = Logger.getLogger(d.class.getName());

    public i(@d5.d n nVar, boolean z5) {
        l0.p(nVar, ProtectedSandApp.s("擇"));
        this.sink = nVar;
        this.client = z5;
        m mVar = new m();
        this.hpackBuffer = mVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new c.b(0, false, mVar, 3, null);
    }

    private final void w(int i5, long j5) throws IOException {
        while (j5 > 0) {
            long min = Math.min(this.maxFrameSize, j5);
            j5 -= min;
            e(i5, (int) min, 9, j5 == 0 ? 4 : 0);
            this.sink.t0(this.hpackBuffer, min);
        }
    }

    public final synchronized void a(@d5.d l lVar) throws IOException {
        l0.p(lVar, ProtectedSandApp.s("擈"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擉"));
        }
        this.maxFrameSize = lVar.g(this.maxFrameSize);
        if (lVar.d() != -1) {
            this.hpackWriter.e(lVar.d());
        }
        e(0, 0, 4, 1);
        this.sink.flush();
    }

    public final synchronized void b() throws IOException {
        String s5 = ProtectedSandApp.s("擊");
        synchronized (this) {
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("擋"));
            }
            if (this.client) {
                Logger logger = f31231u;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(okhttp3.internal.d.v(s5 + d.CONNECTION_PREFACE.C(), new Object[0]));
                }
                this.sink.S0(d.CONNECTION_PREFACE);
                this.sink.flush();
            }
        }
    }

    public final synchronized void c(boolean z5, int i5, @d5.e m mVar, int i6) throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擌"));
        }
        d(i5, z5 ? 1 : 0, mVar, i6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final void d(int i5, int i6, @d5.e m mVar, int i7) throws IOException {
        e(i5, i7, 0, i6);
        if (i7 > 0) {
            n nVar = this.sink;
            l0.m(mVar);
            nVar.t0(mVar, i7);
        }
    }

    public final void e(int i5, int i6, int i7, int i8) throws IOException {
        Logger logger = f31231u;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.f31082x.c(false, i5, i6, i7, i8));
        }
        if (!(i6 <= this.maxFrameSize)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("擎") + this.maxFrameSize + ProtectedSandApp.s("擏") + i6).toString());
        }
        if (!((((int) 2147483648L) & i5) == 0)) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("操"), i5).toString());
        }
        okhttp3.internal.d.k0(this.sink, i6);
        this.sink.writeByte(i7 & 255);
        this.sink.writeByte(i8 & 255);
        this.sink.writeInt(i5 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擐"));
        }
        this.sink.flush();
    }

    @d5.d
    /* renamed from: g, reason: from getter */
    public final c.b getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void j(int i5, @d5.d a aVar, @d5.d byte[] bArr) throws IOException {
        l0.p(aVar, ProtectedSandApp.s("擑"));
        l0.p(bArr, ProtectedSandApp.s("擒"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擔"));
        }
        if (!(aVar.getHttpCode() != -1)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("擓").toString());
        }
        e(0, bArr.length + 8, 7, 0);
        this.sink.writeInt(i5);
        this.sink.writeInt(aVar.getHttpCode());
        if (!(bArr.length == 0)) {
            this.sink.write(bArr);
        }
        this.sink.flush();
    }

    public final synchronized void k(boolean z5, int i5, @d5.d List<b> list) throws IOException {
        l0.p(list, ProtectedSandApp.s("擕"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擖"));
        }
        this.hpackWriter.g(list);
        long size = this.hpackBuffer.size();
        long min = Math.min(this.maxFrameSize, size);
        int i6 = size == min ? 4 : 0;
        if (z5) {
            i6 |= 1;
        }
        e(i5, (int) min, 1, i6);
        this.sink.t0(this.hpackBuffer, min);
        if (size > min) {
            w(i5, size - min);
        }
    }

    /* renamed from: l, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void m(boolean z5, int i5, int i6) throws IOException {
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擗"));
        }
        e(0, 8, 6, z5 ? 1 : 0);
        this.sink.writeInt(i5);
        this.sink.writeInt(i6);
        this.sink.flush();
    }

    public final synchronized void n(int i5, int i6, @d5.d List<b> list) throws IOException {
        l0.p(list, ProtectedSandApp.s("擘"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擙"));
        }
        this.hpackWriter.g(list);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize - 4, size);
        long j5 = min;
        e(i5, min + 4, 5, size == j5 ? 4 : 0);
        this.sink.writeInt(i6 & Integer.MAX_VALUE);
        this.sink.t0(this.hpackBuffer, j5);
        if (size > j5) {
            w(i5, size - j5);
        }
    }

    public final synchronized void o(int i5, @d5.d a aVar) throws IOException {
        l0.p(aVar, ProtectedSandApp.s("據"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擜"));
        }
        if (!(aVar.getHttpCode() != -1)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("擛").toString());
        }
        e(i5, 4, 3, 0);
        this.sink.writeInt(aVar.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void r(@d5.d l lVar) throws IOException {
        l0.p(lVar, ProtectedSandApp.s("擝"));
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("擞"));
        }
        int i5 = 0;
        e(0, lVar.l() * 6, 4, 0);
        while (i5 < 10) {
            if (lVar.i(i5)) {
                this.sink.writeShort(i5 != 4 ? i5 != 7 ? i5 : 4 : 3);
                this.sink.writeInt(lVar.b(i5));
            }
            i5++;
        }
        this.sink.flush();
    }

    public final synchronized void t(int i5, long j5) throws IOException {
        String s5 = ProtectedSandApp.s("擟");
        synchronized (this) {
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("擠"));
            }
            if (!(j5 != 0 && j5 <= 2147483647L)) {
                throw new IllegalArgumentException((s5 + j5).toString());
            }
            e(i5, 4, 8, 0);
            this.sink.writeInt((int) j5);
            this.sink.flush();
        }
    }
}
