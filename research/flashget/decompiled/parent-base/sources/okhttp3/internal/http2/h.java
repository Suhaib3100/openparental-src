package okhttp3.internal.http2;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import okhttp3.u;
import okio.m0;
import okio.o;
import okio.o0;
import okio.q0;

/* compiled from: Http2Stream.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 Y2\u00020\u0001:\u0004;7=+B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J+\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b6\u0010.J\u000f\u00107\u001a\u00020\u001aH\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0000¢\u0006\u0004\b=\u00108J\u000f\u0010>\u001a\u00020\u001aH\u0000¢\u0006\u0004\b>\u00108R*\u0010C\u001a\u0002092\u0006\u0010?\u001a\u0002098\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010>\u001a\u0004\b@\u0010A\"\u0004\bB\u0010<R*\u0010F\u001a\u0002092\u0006\u0010?\u001a\u0002098\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010>\u001a\u0004\bD\u0010A\"\u0004\bE\u0010<R*\u0010I\u001a\u0002092\u0006\u0010?\u001a\u0002098\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\bG\u0010A\"\u0004\bH\u0010<R*\u0010L\u001a\u0002092\u0006\u0010?\u001a\u0002098\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010>\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010<R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\u001e\u00100\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060VR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010a\u001a\u00060\\R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001e\u0010d\u001a\u00060\\R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\b]\u0010g\"\u0004\bh\u0010.R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010i\u001a\u0004\bb\u0010j\"\u0004\bk\u0010lR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\be\u0010mR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010n\u001a\u0004\bW\u0010oR\u0011\u0010r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0011\u0010t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bs\u0010q¨\u0006u"}, d2 = {"Lokhttp3/internal/http2/h;", "", "", "id", "Lokhttp3/internal/http2/e;", "connection", "", "outFinished", "inFinished", "Lokhttp3/u;", "headers", "<init>", "(ILokhttp3/internal/http2/e;ZZLokhttp3/u;)V", "Lokhttp3/internal/http2/a;", "errorCode", "Ljava/io/IOException;", "errorException", "e", "(Lokhttp3/internal/http2/a;Ljava/io/IOException;)Z", "H", "()Lokhttp3/u;", "I", "", "Lokhttp3/internal/http2/b;", "responseHeaders", "flushHeaders", "Lkotlin/k2;", "K", "(Ljava/util/List;ZZ)V", "trailers", "g", "(Lokhttp3/u;)V", "Lokio/q0;", "x", "()Lokio/q0;", "L", "Lokio/o0;", "q", "()Lokio/o0;", "Lokio/m0;", "o", "()Lokio/m0;", "rstStatusCode", "d", "(Lokhttp3/internal/http2/a;Ljava/io/IOException;)V", "f", "(Lokhttp3/internal/http2/a;)V", "Lokio/o;", "source", "length", "y", "(Lokio/o;I)V", "z", "(Lokhttp3/u;Z)V", "A", "b", "()V", "", "delta", "a", "(J)V", "c", "J", "<set-?>", "m", "()J", "E", "readBytesTotal", "l", "D", "readBytesAcknowledged", "t", "G", "writeBytesTotal", "s", "F", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "Lokhttp3/internal/http2/h$c;", "Lokhttp3/internal/http2/h$c;", "r", "()Lokhttp3/internal/http2/h$c;", "Lokhttp3/internal/http2/h$b;", "h", "Lokhttp3/internal/http2/h$b;", "p", "()Lokhttp3/internal/http2/h$b;", "sink", "Lokhttp3/internal/http2/h$d;", "i", "Lokhttp3/internal/http2/h$d;", "n", "()Lokhttp3/internal/http2/h$d;", "readTimeout", "j", "u", "writeTimeout", "k", "Lokhttp3/internal/http2/a;", "()Lokhttp3/internal/http2/a;", "B", "Ljava/io/IOException;", "()Ljava/io/IOException;", "C", "(Ljava/io/IOException;)V", "()I", "Lokhttp3/internal/http2/e;", "()Lokhttp3/internal/http2/e;", "w", "()Z", "isOpen", "v", "isLocallyInitiated", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: o, reason: collision with root package name */
    public static final long f84742o = 16384;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<u> headersQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c source;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b sink;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d readTimeout;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d writeTimeout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @m
    private a errorCode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @m
    private IOException errorException;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e connection;

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR$\u0010'\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b\u001a\u0010*\"\u0004\b/\u0010,¨\u00060"}, d2 = {"Lokhttp3/internal/http2/h$c;", "Lokio/o0;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/h;JZ)V", "read", "Lkotlin/k2;", "k", "(J)V", "Lokio/m;", "sink", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/o;", "source", "f", "(Lokio/o;J)V", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "()V", "b", "Lokio/m;", "d", "()Lokio/m;", "receiveBuffer", "c", "readBuffer", "Lokhttp3/u;", "Lokhttp3/u;", "e", "()Lokhttp3/u;", "i", "(Lokhttp3/u;)V", "trailers", "Z", "a", "()Z", "g", "(Z)V", "closed", "J", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class c implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okio.m receiveBuffer = new okio.m();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okio.m readBuffer = new okio.m();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        private u trailers;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        public c(long j4, boolean z4) {
            this.maxByteCount = j4;
            this.finished = z4;
        }

        private final void k(long read) {
            h hVar = h.this;
            if (!okhttp3.internal.d.f84463h || !Thread.holdsLock(hVar)) {
                h.this.getConnection().g1(read);
                return;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵇ"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ᵈ"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ᵉ"));
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final okio.m getReadBuffer() {
            return this.readBuffer;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (h.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.d();
                h hVar = h.this;
                if (hVar == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ᵊ"));
                }
                hVar.notifyAll();
                k2 k2Var = k2.f75408a;
            }
            if (size > 0) {
                k(size);
            }
            h.this.b();
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final okio.m getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @m
        /* renamed from: e, reason: from getter */
        public final u getTrailers() {
            return this.trailers;
        }

        public final void f(@fg.l o source, long byteCount) throws IOException {
            boolean z4;
            boolean z5;
            long j4;
            l0.p(source, ProtectedSandApp.s("ᵋ"));
            h hVar = h.this;
            if (okhttp3.internal.d.f84463h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵇ"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ᵈ"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ᵉ"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            while (byteCount > 0) {
                synchronized (h.this) {
                    z4 = this.finished;
                    z5 = this.readBuffer.size() + byteCount > this.maxByteCount;
                    k2 k2Var = k2.f75408a;
                }
                if (z5) {
                    source.skip(byteCount);
                    h.this.f(a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z4) {
                    source.skip(byteCount);
                    return;
                }
                long w32 = source.w3(this.receiveBuffer, byteCount);
                if (w32 == -1) {
                    throw new EOFException();
                }
                byteCount -= w32;
                synchronized (h.this) {
                    try {
                        if (this.closed) {
                            j4 = this.receiveBuffer.size();
                            this.receiveBuffer.d();
                        } else {
                            boolean z6 = this.readBuffer.size() == 0;
                            this.readBuffer.b1(this.receiveBuffer);
                            if (z6) {
                                h hVar2 = h.this;
                                if (hVar2 == null) {
                                    throw new NullPointerException(ProtectedSandApp.s("ᵊ"));
                                }
                                hVar2.notifyAll();
                            }
                            j4 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (j4 > 0) {
                    k(j4);
                }
            }
        }

        public final void g(boolean z4) {
            this.closed = z4;
        }

        public final void h(boolean z4) {
            this.finished = z4;
        }

        public final void i(@m u uVar) {
            this.trailers = uVar;
        }

        @Override // okio.o0
        @fg.l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return h.this.getReadTimeout();
        }

        /* JADX WARN: Finally extract failed */
        @Override // okio.o0
        public long w3(@fg.l okio.m sink, long byteCount) throws IOException {
            IOException iOException;
            long j4;
            boolean z4;
            l0.p(sink, ProtectedSandApp.s("ᵌ"));
            long j5 = 0;
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ᵎ"), byteCount).toString());
            }
            while (true) {
                synchronized (h.this) {
                    h.this.getReadTimeout().v();
                    try {
                        if (h.this.i() != null) {
                            iOException = h.this.getErrorException();
                            if (iOException == null) {
                                a i4 = h.this.i();
                                l0.m(i4);
                                iOException = new StreamResetException(i4);
                            }
                        } else {
                            iOException = null;
                        }
                        if (this.closed) {
                            throw new IOException(ProtectedSandApp.s("ᵍ"));
                        }
                        if (this.readBuffer.size() > j5) {
                            okio.m mVar = this.readBuffer;
                            j4 = mVar.w3(sink, Math.min(byteCount, mVar.size()));
                            h hVar = h.this;
                            hVar.E(hVar.getReadBytesTotal() + j4);
                            long readBytesTotal = h.this.getReadBytesTotal() - h.this.getReadBytesAcknowledged();
                            if (iOException == null && readBytesTotal >= h.this.getConnection().getOkHttpSettings().e() / 2) {
                                h.this.getConnection().D1(h.this.getId(), readBytesTotal);
                                h hVar2 = h.this;
                                hVar2.D(hVar2.getReadBytesTotal());
                            }
                        } else if (this.finished || iOException != null) {
                            j4 = -1;
                        } else {
                            h.this.J();
                            j4 = -1;
                            z4 = true;
                            h.this.getReadTimeout().D();
                            k2 k2Var = k2.f75408a;
                        }
                        z4 = false;
                        h.this.getReadTimeout().D();
                        k2 k2Var2 = k2.f75408a;
                    } catch (Throwable th) {
                        h.this.getReadTimeout().D();
                        throw th;
                    }
                }
                if (!z4) {
                    if (j4 != -1) {
                        k(j4);
                        return j4;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    l0.m(iOException);
                    throw iOException;
                }
                j5 = 0;
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/h$d;", "Lokio/k;", "<init>", "(Lokhttp3/internal/http2/h;)V", "Lkotlin/k2;", "B", "()V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "D", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class d extends okio.k {
        public d() {
        }

        @Override // okio.k
        protected void B() {
            h.this.f(a.CANCEL);
            h.this.getConnection().H0();
        }

        public final void D() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // okio.k
        @fg.l
        protected IOException x(@m IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProtectedSandApp.s("ᵞ"));
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
    }

    public h(int i4, @fg.l e eVar, boolean z4, boolean z5, @m u uVar) {
        l0.p(eVar, ProtectedSandApp.s("ᵟ"));
        this.id = i4;
        this.connection = eVar;
        this.writeBytesMaximum = eVar.getPeerSettings().e();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(eVar.getOkHttpSettings().e(), z5);
        this.sink = new b(z4);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (uVar == null) {
            if (!v()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᵡ"));
            }
        } else {
            if (v()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᵠ"));
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(a errorCode, IOException errorException) {
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵢ"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ᵣ"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ᵤ"));
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
            k2 k2Var = k2.f75408a;
            this.connection.C0(this.id);
            return true;
        }
    }

    public final synchronized void A(@fg.l a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("ᵥ"));
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void B(@m a aVar) {
        this.errorCode = aVar;
    }

    public final void C(@m IOException iOException) {
        this.errorException = iOException;
    }

    public final void D(long j4) {
        this.readBytesAcknowledged = j4;
    }

    public final void E(long j4) {
        this.readBytesTotal = j4;
    }

    public final void F(long j4) {
        this.writeBytesMaximum = j4;
    }

    public final void G(long j4) {
        this.writeBytesTotal = j4;
    }

    @fg.l
    public final synchronized u H() throws IOException {
        u removeFirst;
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
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            l0.m(aVar);
            throw new StreamResetException(aVar);
        }
        removeFirst = this.headersQueue.removeFirst();
        l0.o(removeFirst, ProtectedSandApp.s("ᵦ"));
        return removeFirst;
    }

    @fg.l
    public final synchronized u I() throws IOException {
        u trailers;
        try {
            if (this.errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException != null) {
                    throw iOException;
                }
                a aVar = this.errorCode;
                l0.m(aVar);
                throw new StreamResetException(aVar);
            }
            if (!(this.source.getFinished() && this.source.getReceiveBuffer().t2() && this.source.getReadBuffer().t2())) {
                throw new IllegalStateException(ProtectedSandApp.s("ᵧ"));
            }
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = okhttp3.internal.d.f84457b;
            }
        } finally {
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

    public final void K(@fg.l List<okhttp3.internal.http2.b> responseHeaders, boolean outFinished, boolean flushHeaders) throws IOException {
        boolean z4;
        l0.p(responseHeaders, ProtectedSandApp.s("ᵨ"));
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵢ"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ᵣ"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ᵤ"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                this.hasResponseHeaders = true;
                if (outFinished) {
                    this.sink.f(true);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!flushHeaders) {
            synchronized (this.connection) {
                z4 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            flushHeaders = z4;
        }
        this.connection.k1(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    @fg.l
    public final q0 L() {
        return this.writeTimeout;
    }

    public final void a(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z4;
        boolean w4;
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵢ"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ᵣ"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ᵤ"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            try {
                if (this.source.getFinished() || !this.source.getClosed() || (!this.sink.getFinished() && !this.sink.getClosed())) {
                    z4 = false;
                    w4 = w();
                    k2 k2Var = k2.f75408a;
                }
                z4 = true;
                w4 = w();
                k2 k2Var2 = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            d(a.CANCEL, null);
        } else {
            if (w4) {
                return;
            }
            this.connection.C0(this.id);
        }
    }

    public final void c() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException(ProtectedSandApp.s("ᵪ"));
        }
        if (this.sink.getFinished()) {
            throw new IOException(ProtectedSandApp.s("ᵩ"));
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

    public final void d(@fg.l a rstStatusCode, @m IOException errorException) throws IOException {
        l0.p(rstStatusCode, ProtectedSandApp.s("ᵫ"));
        if (e(rstStatusCode, errorException)) {
            this.connection.y1(this.id, rstStatusCode);
        }
    }

    public final void f(@fg.l a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("ᵥ"));
        if (e(errorCode, null)) {
            this.connection.B1(this.id, errorCode);
        }
    }

    public final void g(@fg.l u trailers) {
        l0.p(trailers, ProtectedSandApp.s("ᵬ"));
        synchronized (this) {
            if (this.sink.getFinished()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᵮ"));
            }
            if (!(trailers.size() != 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᵭ"));
            }
            this.sink.g(trailers);
            k2 k2Var = k2.f75408a;
        }
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final e getConnection() {
        return this.connection;
    }

    @m
    public final synchronized a i() {
        return this.errorCode;
    }

    @m
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

    @fg.l
    /* renamed from: n, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0013, B:15:0x0019, B:16:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0019 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0013, B:15:0x0019, B:16:0x0024), top: B:2:0x0001 }] */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.m0 o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            boolean r0 = r2.v()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lc
            goto L10
        Lc:
            r0 = 0
            goto L11
        Le:
            r0 = move-exception
            goto L25
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L19
            kotlin.k2 r0 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            okhttp3.internal.http2.h$b r0 = r2.sink
            return r0
        L19:
            java.lang.String r0 = "ᵯ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L25:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.o():okio.m0");
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final b getSink() {
        return this.sink;
    }

    @fg.l
    public final o0 q() {
        return this.source;
    }

    @fg.l
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

    @fg.l
    /* renamed from: u, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean v() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean w() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (!this.source.getFinished()) {
                if (this.source.getClosed()) {
                }
                return true;
            }
            if (this.sink.getFinished() || this.sink.getClosed()) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @fg.l
    public final q0 x() {
        return this.readTimeout;
    }

    public final void y(@fg.l o source, int length) throws IOException {
        l0.p(source, ProtectedSandApp.s("ᵰ"));
        if (!okhttp3.internal.d.f84463h || !Thread.holdsLock(this)) {
            this.source.f(source, length);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵢ"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ᵣ"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("ᵤ"));
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:10:0x004a, B:14:0x0052, B:16:0x0063, B:17:0x0068, B:24:0x005a), top: B:9:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(@fg.l okhttp3.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "ᵱ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            boolean r0 = okhttp3.internal.d.f84463h
            if (r0 == 0) goto L49
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L14
            goto L49
        L14:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "ᵢ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "ᵣ"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = "ᵤ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L49:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L58
            r1 = 1
            if (r0 == 0) goto L5a
            if (r4 != 0) goto L52
            goto L5a
        L52:
            okhttp3.internal.http2.h$c r0 = r2.source     // Catch: java.lang.Throwable -> L58
            r0.i(r3)     // Catch: java.lang.Throwable -> L58
            goto L61
        L58:
            r3 = move-exception
            goto L7c
        L5a:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque<okhttp3.u> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L58
            r0.add(r3)     // Catch: java.lang.Throwable -> L58
        L61:
            if (r4 == 0) goto L68
            okhttp3.internal.http2.h$c r3 = r2.source     // Catch: java.lang.Throwable -> L58
            r3.h(r1)     // Catch: java.lang.Throwable -> L58
        L68:
            boolean r3 = r2.w()     // Catch: java.lang.Throwable -> L58
            r2.notifyAll()     // Catch: java.lang.Throwable -> L58
            kotlin.k2 r4 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L58
            monitor-exit(r2)
            if (r3 != 0) goto L7b
            okhttp3.internal.http2.e r3 = r2.connection
            int r4 = r2.id
            r3.C0(r4)
        L7b:
            return
        L7c:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.z(okhttp3.u, boolean):void");
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010!\u001a\u0004\b\u0016\u0010\"\"\u0004\b#\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010!\u001a\u0004\b\u001a\u0010\"\"\u0004\b%\u0010\t¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/h$b;", "Lokio/m0;", "", "finished", "<init>", "(Lokhttp3/internal/http2/h;Z)V", "outFinishedOnLastFrame", "Lkotlin/k2;", "a", "(Z)V", "Lokio/m;", "source", "", "byteCount", "write", "(Lokio/m;J)V", "flush", "()V", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "b", "Lokio/m;", "sendBuffer", "Lokhttp3/u;", "c", "Lokhttp3/u;", "d", "()Lokhttp3/u;", "g", "(Lokhttp3/u;)V", "trailers", "Z", "()Z", "e", "closed", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class b implements m0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final okio.m sendBuffer;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private u trailers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        public b(boolean z4) {
            this.finished = z4;
            this.sendBuffer = new okio.m();
        }

        private final void a(boolean outFinishedOnLastFrame) throws IOException {
            long min;
            boolean z4;
            synchronized (h.this) {
                try {
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
                    z4 = outFinishedOnLastFrame && min == this.sendBuffer.size() && h.this.i() == null;
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h.this.getWriteTimeout().v();
            try {
                h.this.getConnection().j1(h.this.getId(), z4, this.sendBuffer, min);
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
            if (okhttp3.internal.d.f84463h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵃ"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ᵄ"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ᵅ"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (h.this) {
                if (this.closed) {
                    return;
                }
                boolean z4 = h.this.i() == null;
                k2 k2Var = k2.f75408a;
                if (!h.this.getSink().finished) {
                    boolean z5 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            a(false);
                        }
                        e connection = h.this.getConnection();
                        int id2 = h.this.getId();
                        u uVar = this.trailers;
                        l0.m(uVar);
                        connection.k1(id2, z4, okhttp3.internal.d.W(uVar));
                    } else if (z5) {
                        while (this.sendBuffer.size() > 0) {
                            a(true);
                        }
                    } else if (z4) {
                        h.this.getConnection().j1(h.this.getId(), true, null, 0L);
                    }
                }
                synchronized (h.this) {
                    this.closed = true;
                    k2 k2Var2 = k2.f75408a;
                }
                h.this.getConnection().flush();
                h.this.b();
            }
        }

        @m
        /* renamed from: d, reason: from getter */
        public final u getTrailers() {
            return this.trailers;
        }

        public final void e(boolean z4) {
            this.closed = z4;
        }

        public final void f(boolean z4) {
            this.finished = z4;
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() throws IOException {
            h hVar = h.this;
            if (okhttp3.internal.d.f84463h && Thread.holdsLock(hVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵃ"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ᵄ"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ᵅ"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (h.this) {
                h.this.c();
                k2 k2Var = k2.f75408a;
            }
            while (this.sendBuffer.size() > 0) {
                a(false);
                h.this.getConnection().flush();
            }
        }

        public final void g(@m u uVar) {
            this.trailers = uVar;
        }

        @Override // okio.m0
        @fg.l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return h.this.getWriteTimeout();
        }

        @Override // okio.m0
        public void write(@fg.l okio.m source, long byteCount) throws IOException {
            l0.p(source, ProtectedSandApp.s("ᵆ"));
            h hVar = h.this;
            if (!okhttp3.internal.d.f84463h || !Thread.holdsLock(hVar)) {
                this.sendBuffer.write(source, byteCount);
                while (this.sendBuffer.size() >= 16384) {
                    a(false);
                }
            } else {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᵃ"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ᵄ"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ᵅ"));
                sb.append(hVar);
                throw new AssertionError(sb.toString());
            }
        }

        public /* synthetic */ b(h hVar, boolean z4, int i4, w wVar) {
            this((i4 & 1) != 0 ? false : z4);
        }
    }
}
