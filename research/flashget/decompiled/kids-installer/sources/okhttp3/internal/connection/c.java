package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.internal.ws.e;
import okhttp3.r;
import okhttp3.v;
import okio.a0;
import okio.m;
import okio.m0;
import okio.o0;
import okio.s;

/* compiled from: Exchange.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002$\u001dB'\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u0010:\u001a\u000206\u0012\u0006\u0010?\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J9\u0010$\u001a\u00028\u0000\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010&\u001a\u00020\u0004R$\u0010+\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u001a\u00100\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010D\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010*¨\u0006G"}, d2 = {"Lokhttp3/internal/connection/c;", "", "Ljava/io/IOException;", "e", "Lkotlin/m2;", "t", "Lokhttp3/e0;", "request", "w", "", "duplex", "Lokio/m0;", "c", "f", "s", "expectContinue", "Lokhttp3/g0$a;", "q", "Lokhttp3/g0;", "response", "r", "Lokhttp3/h0;", "p", "Lokhttp3/v;", "u", "Lokhttp3/internal/ws/e$d;", "m", "v", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "h", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "g", "()Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "Lokhttp3/r;", "i", "()Lokhttp3/r;", "eventListener", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "j", "()Lokhttp3/internal/connection/d;", "finder", "Lokhttp3/internal/http/d;", "Lokhttp3/internal/http/d;", "codec", "k", "isCoalescedConnection", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/r;Lokhttp3/internal/connection/d;Lokhttp3/internal/http/d;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final f connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e call;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final r eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d finder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http.d codec;

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/connection/c$a;", "Lokio/r;", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "", "p", "Z", "completed", "q", "J", "bytesReceived", "r", "closed", "s", "contentLength", "Lokio/m0;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lokio/m0;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    private final class a extends okio.r {

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ c f30844t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d c cVar, m0 m0Var, long j5) {
            super(m0Var);
            l0.p(m0Var, ProtectedSandApp.s("醩"));
            this.f30844t = cVar;
            this.contentLength = j5;
        }

        private final <E extends IOException> E c(E e6) {
            if (this.completed) {
                return e6;
            }
            this.completed = true;
            return (E) this.f30844t.a(this.bytesReceived, false, true, e6);
        }

        @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j5 = this.contentLength;
            if (j5 != -1 && this.bytesReceived != j5) {
                throw new ProtocolException(ProtectedSandApp.s("醪"));
            }
            try {
                super.close();
                c(null);
            } catch (IOException e6) {
                throw c(e6);
            }
        }

        @Override // okio.r, okio.m0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e6) {
                throw c(e6);
            }
        }

        @Override // okio.r, okio.m0
        public void t0(@d5.d m mVar, long j5) throws IOException {
            l0.p(mVar, ProtectedSandApp.s("醫"));
            if (!(!this.closed)) {
                throw new IllegalStateException(ProtectedSandApp.s("醮").toString());
            }
            long j6 = this.contentLength;
            if (j6 == -1 || this.bytesReceived + j5 <= j6) {
                try {
                    super.t0(mVar, j5);
                    this.bytesReceived += j5;
                    return;
                } catch (IOException e6) {
                    throw c(e6);
                }
            }
            throw new ProtocolException(ProtectedSandApp.s("醬") + this.contentLength + ProtectedSandApp.s("醭") + (this.bytesReceived + j5));
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/connection/c$b;", "Lokio/s;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "p", "J", "bytesReceived", "", "q", "Z", "invokeStartEvent", "r", "completed", "s", "closed", "t", "contentLength", "Lokio/o0;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lokio/o0;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public final class b extends s {

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ c f30850u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d c cVar, o0 o0Var, long j5) {
            super(o0Var);
            l0.p(o0Var, ProtectedSandApp.s("醯"));
            this.f30850u = cVar;
            this.contentLength = j5;
            this.invokeStartEvent = true;
            if (j5 == 0) {
                c(null);
            }
        }

        @Override // okio.s, okio.o0
        public long X0(@d5.d m sink, long byteCount) throws IOException {
            String s5 = ProtectedSandApp.s("醰");
            l0.p(sink, ProtectedSandApp.s("醱"));
            if (!(!this.closed)) {
                throw new IllegalStateException(ProtectedSandApp.s("醳").toString());
            }
            try {
                long X0 = b().X0(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f30850u.getEventListener().w(this.f30850u.getCall());
                }
                if (X0 == -1) {
                    c(null);
                    return -1L;
                }
                long j5 = this.bytesReceived + X0;
                long j6 = this.contentLength;
                if (j6 != -1 && j5 > j6) {
                    throw new ProtocolException(s5 + this.contentLength + ProtectedSandApp.s("醲") + j5);
                }
                this.bytesReceived = j5;
                if (j5 == j6) {
                    c(null);
                }
                return X0;
            } catch (IOException e6) {
                throw c(e6);
            }
        }

        public final <E extends IOException> E c(E e6) {
            if (this.completed) {
                return e6;
            }
            this.completed = true;
            if (e6 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f30850u.getEventListener().w(this.f30850u.getCall());
            }
            return (E) this.f30850u.a(this.bytesReceived, true, false, e6);
        }

        @Override // okio.s, okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                c(null);
            } catch (IOException e6) {
                throw c(e6);
            }
        }
    }

    public c(@d5.d e eVar, @d5.d r rVar, @d5.d d dVar, @d5.d okhttp3.internal.http.d dVar2) {
        l0.p(eVar, ProtectedSandApp.s("憧"));
        l0.p(rVar, ProtectedSandApp.s("憨"));
        l0.p(dVar, ProtectedSandApp.s("憩"));
        l0.p(dVar2, ProtectedSandApp.s("憪"));
        this.call = eVar;
        this.eventListener = rVar;
        this.finder = dVar;
        this.codec = dVar2;
        this.connection = dVar2.getConnection();
    }

    private final void t(IOException iOException) {
        this.finder.h(iOException);
        this.codec.getConnection().N(this.call, iOException);
    }

    public final <E extends IOException> E a(long bytesRead, boolean responseDone, boolean requestDone, E e6) {
        if (e6 != null) {
            t(e6);
        }
        if (requestDone) {
            if (e6 != null) {
                this.eventListener.s(this.call, e6);
            } else {
                this.eventListener.q(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e6 != null) {
                this.eventListener.x(this.call, e6);
            } else {
                this.eventListener.v(this.call, bytesRead);
            }
        }
        return (E) this.call.w(this, requestDone, responseDone, e6);
    }

    public final void b() {
        this.codec.cancel();
    }

    @d5.d
    public final m0 c(@d5.d e0 request, boolean duplex) throws IOException {
        l0.p(request, ProtectedSandApp.s("憫"));
        this.isDuplex = duplex;
        f0 f6 = request.f();
        l0.m(f6);
        long a6 = f6.a();
        this.eventListener.r(this.call);
        return new a(this, this.codec.h(request, a6), a6);
    }

    public final void d() {
        this.codec.cancel();
        this.call.w(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.codec.a();
        } catch (IOException e6) {
            this.eventListener.s(this.call, e6);
            t(e6);
            throw e6;
        }
    }

    public final void f() throws IOException {
        try {
            this.codec.e();
        } catch (IOException e6) {
            this.eventListener.s(this.call, e6);
            t(e6);
            throw e6;
        }
    }

    @d5.d
    /* renamed from: g, reason: from getter */
    public final e getCall() {
        return this.call;
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    @d5.d
    /* renamed from: i, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    @d5.d
    /* renamed from: j, reason: from getter */
    public final d getFinder() {
        return this.finder;
    }

    public final boolean k() {
        return !l0.g(this.finder.getAddress().w().getHost(), this.connection.getRoute().d().w().getHost());
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    @d5.d
    public final e.d m() throws SocketException {
        this.call.D();
        return this.codec.getConnection().E(this);
    }

    public final void n() {
        this.codec.getConnection().G();
    }

    public final void o() {
        this.call.w(this, true, false, null);
    }

    @d5.d
    public final h0 p(@d5.d g0 response) throws IOException {
        l0.p(response, ProtectedSandApp.s("憬"));
        try {
            String P = g0.P(response, ProtectedSandApp.s("憭"), null, 2, null);
            long f6 = this.codec.f(response);
            return new okhttp3.internal.http.h(P, f6, a0.d(new b(this, this.codec.c(response), f6)));
        } catch (IOException e6) {
            this.eventListener.x(this.call, e6);
            t(e6);
            throw e6;
        }
    }

    @d5.e
    public final g0.a q(boolean expectContinue) throws IOException {
        try {
            g0.a d6 = this.codec.d(expectContinue);
            if (d6 != null) {
                d6.x(this);
            }
            return d6;
        } catch (IOException e6) {
            this.eventListener.x(this.call, e6);
            t(e6);
            throw e6;
        }
    }

    public final void r(@d5.d g0 g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("憮"));
        this.eventListener.y(this.call, g0Var);
    }

    public final void s() {
        this.eventListener.z(this.call);
    }

    @d5.d
    public final v u() throws IOException {
        return this.codec.g();
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(@d5.d e0 e0Var) throws IOException {
        l0.p(e0Var, ProtectedSandApp.s("憯"));
        try {
            this.eventListener.u(this.call);
            this.codec.b(e0Var);
            this.eventListener.t(this.call, e0Var);
        } catch (IOException e6) {
            this.eventListener.s(this.call, e6);
            t(e6);
            throw e6;
        }
    }
}
