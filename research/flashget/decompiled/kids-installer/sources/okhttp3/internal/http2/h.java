package okhttp3.internal.http2;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import okhttp3.v;
import okio.m;
import okio.m0;
import okio.o;
import okio.o0;
import okio.q0;

/* compiled from: Http2Stream.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 I2\u00020\u0001:\u0004+',\u001cB3\b\u0000\u0012\u0006\u0010_\u001a\u00020 \u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bi\u0010jJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010'\u001a\u00020\u0010H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010(J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b-\u0010(R*\u00103\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010-\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00106\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010-\u001a\u0004\b4\u00100\"\u0004\b5\u00102R*\u00109\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b7\u00100\"\u0004\b8\u00102R*\u0010<\u001a\u00020)2\u0006\u0010.\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010@R\u001e\u0010\u001f\u001a\u00060BR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u001e\u0010K\u001a\u00060FR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001e\u0010Q\u001a\u00060LR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001e\u0010T\u001a\u00060LR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bM\u0010W\"\u0004\bX\u0010YR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010Z\u001a\u0004\bR\u0010[\"\u0004\b\\\u0010]R\u0017\u0010_\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\bU\u0010^R\u0017\u0010c\u001a\u00020`8\u0006¢\u0006\f\n\u0004\bO\u0010a\u001a\u0004\bG\u0010bR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006k"}, d2 = {"Lokhttp3/internal/http2/h;", "", "Lokhttp3/internal/http2/a;", "errorCode", "Ljava/io/IOException;", "errorException", "", "e", "Lokhttp3/v;", "H", "I", "", "Lokhttp3/internal/http2/b;", "responseHeaders", "outFinished", "flushHeaders", "Lkotlin/m2;", "K", "trailers", "g", "Lokio/q0;", "x", "L", "Lokio/o0;", "q", "Lokio/m0;", "o", "rstStatusCode", "d", "f", "Lokio/o;", "source", "", "length", "y", "headers", "inFinished", "z", "A", "b", "()V", "", "delta", "a", "c", "J", "<set-?>", "m", "()J", "E", "(J)V", "readBytesTotal", "l", "D", "readBytesAcknowledged", "t", "G", "writeBytesTotal", "s", "F", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Lokhttp3/internal/http2/h$c;", "Lokhttp3/internal/http2/h$c;", "r", "()Lokhttp3/internal/http2/h$c;", "Lokhttp3/internal/http2/h$b;", "h", "Lokhttp3/internal/http2/h$b;", "p", "()Lokhttp3/internal/http2/h$b;", "sink", "Lokhttp3/internal/http2/h$d;", "i", "Lokhttp3/internal/http2/h$d;", "n", "()Lokhttp3/internal/http2/h$d;", "readTimeout", "j", "u", "writeTimeout", "k", "Lokhttp3/internal/http2/a;", "()Lokhttp3/internal/http2/a;", "B", "(Lokhttp3/internal/http2/a;)V", "Ljava/io/IOException;", "()Ljava/io/IOException;", "C", "(Ljava/io/IOException;)V", "()I", "id", "Lokhttp3/internal/http2/e;", "Lokhttp3/internal/http2/e;", "()Lokhttp3/internal/http2/e;", "connection", "w", "()Z", "isOpen", "v", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/e;ZZLokhttp3/v;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: o, reason: collision with root package name */
    public static final long f31202o = 16384;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<v> headersQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final c source;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final b sink;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d readTimeout;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d writeTimeout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private a errorCode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private IOException errorException;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e connection;

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020!¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010/\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'¨\u00062"}, d2 = {"Lokhttp3/internal/http2/h$c;", "Lokio/o0;", "", "read", "Lkotlin/m2;", "m", "Lokio/m;", "sink", "byteCount", "X0", "Lokio/o;", "source", "g", "(Lokio/o;J)V", "Lokio/q0;", "h", "close", "o", "Lokio/m;", "d", "()Lokio/m;", "receiveBuffer", "p", "c", "readBuffer", "Lokhttp3/v;", "q", "Lokhttp3/v;", "e", "()Lokhttp3/v;", "l", "(Lokhttp3/v;)V", "trailers", "", "r", "Z", "a", "()Z", "j", "(Z)V", "closed", "s", "J", "maxByteCount", "t", "b", "k", "finished", "<init>", "(Lokhttp3/internal/http2/h;JZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class c implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final m receiveBuffer = new m();

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final m readBuffer = new m();

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private v trailers;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        public c(long j5, boolean z5) {
            this.maxByteCount = j5;
            this.finished = z5;
        }

        private final void m(long j5) {
            h hVar = h.this;
            if (!okhttp3.internal.d.f30936h || !Thread.holdsLock(hVar)) {
                h.this.getConnection().t1(j5);
                return;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撛"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("撜"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("撝"));
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) throws IOException {
            IOException iOException;
            long j5;
            boolean z5;
            long j6;
            l0.p(sink, ProtectedSandApp.s("撞"));
            long j7 = 0;
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("撠"), byteCount).toString());
            }
            while (true) {
                synchronized (h.this) {
                    h.this.getReadTimeout().v();
                    try {
                        if (h.this.i() != null) {
                            iOException = h.this.getErrorException();
                            if (iOException == null) {
                                a i5 = h.this.i();
                                l0.m(i5);
                                iOException = new StreamResetException(i5);
                            }
                        } else {
                            iOException = null;
                        }
                        if (this.closed) {
                            throw new IOException(ProtectedSandApp.s("撟"));
                        }
                        if (this.readBuffer.size() > j7) {
                            m mVar = this.readBuffer;
                            j5 = mVar.X0(sink, Math.min(byteCount, mVar.size()));
                            h hVar = h.this;
                            hVar.E(hVar.getReadBytesTotal() + j5);
                            long readBytesTotal = h.this.getReadBytesTotal() - h.this.getReadBytesAcknowledged();
                            if (iOException == null && readBytesTotal >= h.this.getConnection().getOkHttpSettings().e() / 2) {
                                h.this.getConnection().B1(h.this.getId(), readBytesTotal);
                                h hVar2 = h.this;
                                hVar2.D(hVar2.getReadBytesTotal());
                            }
                        } else if (this.finished || iOException != null) {
                            j5 = -1;
                        } else {
                            h.this.J();
                            z5 = true;
                            j6 = -1;
                            h.this.getReadTimeout().D();
                            m2 m2Var = m2.f23662a;
                        }
                        long j8 = j5;
                        z5 = false;
                        j6 = j8;
                        h.this.getReadTimeout().D();
                        m2 m2Var2 = m2.f23662a;
                    } catch (Throwable th) {
                        h.this.getReadTimeout().D();
                        throw th;
                    }
                }
                if (!z5) {
                    if (j6 != -1) {
                        m(j6);
                        return j6;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    l0.m(iOException);
                    throw iOException;
                }
                j7 = 0;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final m getReadBuffer() {
            return this.readBuffer;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (h.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.c();
                h hVar = h.this;
                if (hVar == null) {
                    throw new NullPointerException(ProtectedSandApp.s("撡"));
                }
                hVar.notifyAll();
                m2 m2Var = m2.f23662a;
            }
            if (size > 0) {
                m(size);
            }
            h.this.b();
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final m getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @d5.e
        /* renamed from: e, reason: from getter */
        public final v getTrailers() {
            return this.trailers;
        }

        public final void g(@d5.d o source, long byteCount) throws IOException {
            boolean z5;
            boolean z6;
            boolean z7;
            long j5;
            l0.p(source, ProtectedSandApp.s("撢"));
            h hVar = h.this;
            if (okhttp3.internal.d.f30936h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撣"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("撤"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("撥"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            while (byteCount > 0) {
                synchronized (h.this) {
                    z5 = this.finished;
                    z6 = true;
                    z7 = this.readBuffer.size() + byteCount > this.maxByteCount;
                    m2 m2Var = m2.f23662a;
                }
                if (z7) {
                    source.skip(byteCount);
                    h.this.f(a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z5) {
                    source.skip(byteCount);
                    return;
                }
                long X0 = source.X0(this.receiveBuffer, byteCount);
                if (X0 == -1) {
                    throw new EOFException();
                }
                byteCount -= X0;
                synchronized (h.this) {
                    if (this.closed) {
                        j5 = this.receiveBuffer.size();
                        this.receiveBuffer.c();
                    } else {
                        if (this.readBuffer.size() != 0) {
                            z6 = false;
                        }
                        this.readBuffer.v0(this.receiveBuffer);
                        if (z6) {
                            h hVar2 = h.this;
                            if (hVar2 == null) {
                                throw new NullPointerException(ProtectedSandApp.s("撦"));
                            }
                            hVar2.notifyAll();
                        }
                        j5 = 0;
                    }
                }
                if (j5 > 0) {
                    m(j5);
                }
            }
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return h.this.getReadTimeout();
        }

        public final void j(boolean z5) {
            this.closed = z5;
        }

        public final void k(boolean z5) {
            this.finished = z5;
        }

        public final void l(@d5.e v vVar) {
            this.trailers = vVar;
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lokhttp3/internal/http2/h$d;", "Lokio/k;", "Lkotlin/m2;", "B", "Ljava/io/IOException;", "cause", "x", "D", "<init>", "(Lokhttp3/internal/http2/h;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public final class d extends okio.k {
        public d() {
        }

        @Override // okio.k
        protected void B() {
            h.this.f(a.CANCEL);
            h.this.getConnection().T0();
        }

        public final void D() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // okio.k
        @d5.d
        protected IOException x(@d5.e IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProtectedSandApp.s("針"));
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
    }

    public h(int i5, @d5.d e eVar, boolean z5, boolean z6, @d5.e v vVar) {
        l0.p(eVar, ProtectedSandApp.s("撧"));
        this.id = i5;
        this.connection = eVar;
        this.writeBytesMaximum = eVar.getPeerSettings().e();
        ArrayDeque<v> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(eVar.getOkHttpSettings().e(), z6);
        this.sink = new b(z5);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (vVar == null) {
            if (!v()) {
                throw new IllegalStateException(ProtectedSandApp.s("撩").toString());
            }
        } else {
            if (!(!v())) {
                throw new IllegalStateException(ProtectedSandApp.s("撨").toString());
            }
            arrayDeque.add(vVar);
        }
    }

    private final boolean e(a errorCode, IOException errorException) {
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撪"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("撫"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("撬"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            m2 m2Var = m2.f23662a;
            this.connection.R0(this.id);
            return true;
        }
    }

    public final synchronized void A(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("播"));
        if (this.errorCode == null) {
            this.errorCode = aVar;
            notifyAll();
        }
    }

    public final void B(@d5.e a aVar) {
        this.errorCode = aVar;
    }

    public final void C(@d5.e IOException iOException) {
        this.errorException = iOException;
    }

    public final void D(long j5) {
        this.readBytesAcknowledged = j5;
    }

    public final void E(long j5) {
        this.readBytesTotal = j5;
    }

    public final void F(long j5) {
        this.writeBytesMaximum = j5;
    }

    public final void G(long j5) {
        this.writeBytesTotal = j5;
    }

    @d5.d
    public final synchronized v H() throws IOException {
        v removeFirst;
        this.readTimeout.v();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                J();
            } catch (Throwable th) {
                this.readTimeout.D();
                throw th;
            }
        }
        this.readTimeout.D();
        if (!(!this.headersQueue.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            l0.m(aVar);
            throw new StreamResetException(aVar);
        }
        removeFirst = this.headersQueue.removeFirst();
        l0.o(removeFirst, ProtectedSandApp.s("撮"));
        return removeFirst;
    }

    @d5.d
    public final synchronized v I() throws IOException {
        v trailers;
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            l0.m(aVar);
            throw new StreamResetException(aVar);
        }
        if (!(this.source.getFinished() && this.source.getReceiveBuffer().M() && this.source.getReadBuffer().M())) {
            throw new IllegalStateException(ProtectedSandApp.s("撯").toString());
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = okhttp3.internal.d.f30930b;
        }
        return trailers;
    }

    public final void J() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void K(@d5.d List<okhttp3.internal.http2.b> list, boolean z5, boolean z6) throws IOException {
        boolean z7;
        l0.p(list, ProtectedSandApp.s("撰"));
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撱"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("撲"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("撳"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z5) {
                this.sink.g(true);
            }
            m2 m2Var = m2.f23662a;
        }
        if (!z6) {
            synchronized (this.connection) {
                z7 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z6 = z7;
        }
        this.connection.v1(this.id, z5, list);
        if (z6) {
            this.connection.flush();
        }
    }

    @d5.d
    public final q0 L() {
        return this.writeTimeout;
    }

    public final void a(long j5) {
        this.writeBytesMaximum += j5;
        if (j5 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z5;
        boolean w5;
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撴"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("撵"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("撶"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            z5 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
            w5 = w();
            m2 m2Var = m2.f23662a;
        }
        if (z5) {
            d(a.CANCEL, null);
        } else {
            if (w5) {
                return;
            }
            this.connection.R0(this.id);
        }
    }

    public final void c() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException(ProtectedSandApp.s("撸"));
        }
        if (this.sink.getFinished()) {
            throw new IOException(ProtectedSandApp.s("撷"));
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            l0.m(aVar);
            throw new StreamResetException(aVar);
        }
    }

    public final void d(@d5.d a aVar, @d5.e IOException iOException) throws IOException {
        l0.p(aVar, ProtectedSandApp.s("撹"));
        if (e(aVar, iOException)) {
            this.connection.z1(this.id, aVar);
        }
    }

    public final void f(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("撺"));
        if (e(aVar, null)) {
            this.connection.A1(this.id, aVar);
        }
    }

    public final void g(@d5.d v vVar) {
        l0.p(vVar, ProtectedSandApp.s("撻"));
        synchronized (this) {
            boolean z5 = true;
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException(ProtectedSandApp.s("撽").toString());
            }
            if (vVar.size() == 0) {
                z5 = false;
            }
            if (!z5) {
                throw new IllegalArgumentException(ProtectedSandApp.s("撼").toString());
            }
            this.sink.j(vVar);
            m2 m2Var = m2.f23662a;
        }
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final e getConnection() {
        return this.connection;
    }

    @d5.e
    public final synchronized a i() {
        return this.errorCode;
    }

    @d5.e
    /* renamed from: j, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* renamed from: k, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: l, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* renamed from: m, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @d5.d
    /* renamed from: n, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0026), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0026), top: B:2:0x0001 }] */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.m0 o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto Le
            boolean r0 = r2.v()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.m2 r0 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            okhttp3.internal.http2.h$b r0 = r2.sink
            return r0
        L17:
            java.lang.String r0 = "撾"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.o():okio.m0");
    }

    @d5.d
    /* renamed from: p, reason: from getter */
    public final b getSink() {
        return this.sink;
    }

    @d5.d
    public final o0 q() {
        return this.source;
    }

    @d5.d
    /* renamed from: r, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    /* renamed from: s, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: t, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @d5.d
    /* renamed from: u, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean v() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean w() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    @d5.d
    public final q0 x() {
        return this.readTimeout;
    }

    public final void y(@d5.d o oVar, int i5) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("撿"));
        if (!okhttp3.internal.d.f30936h || !Thread.holdsLock(this)) {
            this.source.g(oVar, i5);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("擀"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("擁"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("擂"));
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:10:0x004a, B:14:0x0052, B:16:0x0061, B:17:0x0066, B:24:0x0058), top: B:9:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(@d5.d okhttp3.v r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "擃"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            boolean r0 = okhttp3.internal.d.f30936h
            if (r0 == 0) goto L49
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L14
            goto L49
        L14:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "擄"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "擅"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = "擆"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L49:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L7a
            r1 = 1
            if (r0 == 0) goto L58
            if (r4 != 0) goto L52
            goto L58
        L52:
            okhttp3.internal.http2.h$c r0 = r2.source     // Catch: java.lang.Throwable -> L7a
            r0.l(r3)     // Catch: java.lang.Throwable -> L7a
            goto L5f
        L58:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayDeque<okhttp3.v> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L7a
            r0.add(r3)     // Catch: java.lang.Throwable -> L7a
        L5f:
            if (r4 == 0) goto L66
            okhttp3.internal.http2.h$c r3 = r2.source     // Catch: java.lang.Throwable -> L7a
            r3.k(r1)     // Catch: java.lang.Throwable -> L7a
        L66:
            boolean r3 = r2.w()     // Catch: java.lang.Throwable -> L7a
            r2.notifyAll()     // Catch: java.lang.Throwable -> L7a
            kotlin.m2 r4 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)
            if (r3 != 0) goto L79
            okhttp3.internal.http2.e r3 = r2.connection
            int r4 = r2.id
            r3.R0(r4)
        L79:
            return
        L7a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.z(okhttp3.v, boolean):void");
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/h$b;", "Lokio/m0;", "", "outFinishedOnLastFrame", "Lkotlin/m2;", "a", "Lokio/m;", "source", "", "byteCount", "t0", "flush", "Lokio/q0;", "h", "close", "o", "Lokio/m;", "sendBuffer", "Lokhttp3/v;", "p", "Lokhttp3/v;", "d", "()Lokhttp3/v;", "j", "(Lokhttp3/v;)V", "trailers", "q", "Z", "b", "()Z", "e", "(Z)V", "closed", "r", "c", "g", "finished", "<init>", "(Lokhttp3/internal/http2/h;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class b implements m0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final m sendBuffer;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private v trailers;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        public b(boolean z5) {
            this.finished = z5;
            this.sendBuffer = new m();
        }

        private final void a(boolean z5) throws IOException {
            long min;
            boolean z6;
            synchronized (h.this) {
                h.this.getWriteTimeout().v();
                while (h.this.getWriteBytesTotal() >= h.this.getWriteBytesMaximum() && !this.finished && !this.closed && h.this.i() == null) {
                    try {
                        h.this.J();
                    } finally {
                    }
                }
                h.this.getWriteTimeout().D();
                h.this.c();
                min = Math.min(h.this.getWriteBytesMaximum() - h.this.getWriteBytesTotal(), this.sendBuffer.size());
                h hVar = h.this;
                hVar.G(hVar.getWriteBytesTotal() + min);
                z6 = z5 && min == this.sendBuffer.size() && h.this.i() == null;
                m2 m2Var = m2.f23662a;
            }
            h.this.getWriteTimeout().v();
            try {
                h.this.getConnection().u1(h.this.getId(), z6, this.sendBuffer, min);
            } finally {
            }
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            h hVar = h.this;
            if (okhttp3.internal.d.f30936h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撑"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("撒"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("撓"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (h.this) {
                if (this.closed) {
                    return;
                }
                boolean z5 = h.this.i() == null;
                m2 m2Var = m2.f23662a;
                if (!h.this.getSink().finished) {
                    boolean z6 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            a(false);
                        }
                        e connection = h.this.getConnection();
                        int id = h.this.getId();
                        v vVar = this.trailers;
                        l0.m(vVar);
                        connection.v1(id, z5, okhttp3.internal.d.W(vVar));
                    } else if (z6) {
                        while (this.sendBuffer.size() > 0) {
                            a(true);
                        }
                    } else if (z5) {
                        h.this.getConnection().u1(h.this.getId(), true, null, 0L);
                    }
                }
                synchronized (h.this) {
                    this.closed = true;
                    m2 m2Var2 = m2.f23662a;
                }
                h.this.getConnection().flush();
                h.this.b();
            }
        }

        @d5.e
        /* renamed from: d, reason: from getter */
        public final v getTrailers() {
            return this.trailers;
        }

        public final void e(boolean z5) {
            this.closed = z5;
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() throws IOException {
            h hVar = h.this;
            if (okhttp3.internal.d.f30936h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撔"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("撕"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("撖"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (h.this) {
                h.this.c();
                m2 m2Var = m2.f23662a;
            }
            while (this.sendBuffer.size() > 0) {
                a(false);
                h.this.getConnection().flush();
            }
        }

        public final void g(boolean z5) {
            this.finished = z5;
        }

        @Override // okio.m0
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return h.this.getWriteTimeout();
        }

        public final void j(@d5.e v vVar) {
            this.trailers = vVar;
        }

        @Override // okio.m0
        public void t0(@d5.d m mVar, long j5) throws IOException {
            l0.p(mVar, ProtectedSandApp.s("撗"));
            h hVar = h.this;
            if (!okhttp3.internal.d.f30936h || !Thread.holdsLock(hVar)) {
                this.sendBuffer.t0(mVar, j5);
                while (this.sendBuffer.size() >= h.f31202o) {
                    a(false);
                }
            } else {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("撘"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("撙"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("撚"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
        }

        public /* synthetic */ b(h hVar, boolean z5, int i5, w wVar) {
            this((i5 & 1) != 0 ? false : z5);
        }
    }
}
