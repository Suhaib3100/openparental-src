package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.ws.e;
import okhttp3.r;
import okhttp3.u;
import okio.a0;
import okio.m;
import okio.m0;
import okio.o0;
import okio.s;

/* compiled from: Exchange.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u000270B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u001bJ\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u001bJ\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u0010\u001bJ\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u001bJ9\u00107\u001a\u00028\u0000\"\n\b\u0000\u00102*\u0004\u0018\u00010\f2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000e¢\u0006\u0004\b9\u0010\u001bR$\u0010>\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010C\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010MR\u0014\u0010O\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010=¨\u0006P"}, d2 = {"Lokhttp3/internal/connection/c;", "", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "eventListener", "Lokhttp3/internal/connection/d;", "finder", "Lokhttp3/internal/http/d;", "codec", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/r;Lokhttp3/internal/connection/d;Lokhttp3/internal/http/d;)V", "Ljava/io/IOException;", "e", "Lkotlin/k2;", "t", "(Ljava/io/IOException;)V", "Lokhttp3/d0;", "request", "w", "(Lokhttp3/d0;)V", "", "duplex", "Lokio/m0;", "c", "(Lokhttp3/d0;Z)Lokio/m0;", "f", "()V", "s", "expectContinue", "Lokhttp3/f0$a;", "q", "(Z)Lokhttp3/f0$a;", "Lokhttp3/f0;", "response", "r", "(Lokhttp3/f0;)V", "Lokhttp3/g0;", "p", "(Lokhttp3/f0;)Lokhttp3/g0;", "Lokhttp3/u;", "u", "()Lokhttp3/u;", "Lokhttp3/internal/ws/e$d;", "m", "()Lokhttp3/internal/ws/e$d;", "v", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "h", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/connection/e;", "g", "()Lokhttp3/internal/connection/e;", "Lokhttp3/r;", "i", "()Lokhttp3/r;", "Lokhttp3/internal/connection/d;", "j", "()Lokhttp3/internal/connection/d;", "Lokhttp3/internal/http/d;", "k", "isCoalescedConnection", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final f connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final e call;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final r eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final d finder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http.d codec;

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/connection/c$a;", "Lokio/r;", "Lokio/m0;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/c;Lokio/m0;J)V", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/m;", "source", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "", "b", "Z", "completed", "c", "J", "bytesReceived", "d", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class a extends okio.r {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f84365f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l c cVar, m0 m0Var, long j4) {
            super(m0Var);
            l0.p(m0Var, ProtectedSandApp.s("ꂡ\u0001"));
            this.f84365f = cVar;
            this.contentLength = j4;
        }

        private final <E extends IOException> E a(E e4) {
            if (this.completed) {
                return e4;
            }
            this.completed = true;
            return (E) this.f84365f.a(this.bytesReceived, false, true, e4);
        }

        @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j4 = this.contentLength;
            if (j4 != -1 && this.bytesReceived != j4) {
                throw new ProtocolException(ProtectedSandApp.s("ꂢ\u0001"));
            }
            try {
                super.close();
                a(null);
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // okio.r, okio.m0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // okio.r, okio.m0
        public void write(@l m source, long byteCount) throws IOException {
            l0.p(source, ProtectedSandApp.s("ꂣ\u0001"));
            if (this.closed) {
                throw new IllegalStateException(ProtectedSandApp.s("ꂦ\u0001"));
            }
            long j4 = this.contentLength;
            if (j4 == -1 || this.bytesReceived + byteCount <= j4) {
                try {
                    super.write(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e4) {
                    throw a(e4);
                }
            }
            throw new ProtocolException(ProtectedSandApp.s("ꂤ\u0001") + this.contentLength + ProtectedSandApp.s("ꂥ\u0001") + (this.bytesReceived + byteCount));
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/connection/c$b;", "Lokio/s;", "Lokio/o0;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/c;Lokio/o0;J)V", "Lokio/m;", "sink", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "bytesReceived", "", "d", "Z", "invokeStartEvent", "completed", "f", "closed", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class b extends s {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c f84371h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l c cVar, o0 o0Var, long j4) {
            super(o0Var);
            l0.p(o0Var, ProtectedSandApp.s("ꂧ\u0001"));
            this.f84371h = cVar;
            this.contentLength = j4;
            this.invokeStartEvent = true;
            if (j4 == 0) {
                c(null);
            }
        }

        public final <E extends IOException> E c(E e4) {
            if (this.completed) {
                return e4;
            }
            this.completed = true;
            if (e4 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f84371h.getEventListener().responseBodyStart(this.f84371h.getCall());
            }
            return (E) this.f84371h.a(this.bytesReceived, true, false, e4);
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
            } catch (IOException e4) {
                throw c(e4);
            }
        }

        @Override // okio.s, okio.o0
        public long w3(@l m sink, long byteCount) throws IOException {
            String s4 = ProtectedSandApp.s("ꂨ\u0001");
            l0.p(sink, ProtectedSandApp.s("ꂩ\u0001"));
            if (this.closed) {
                throw new IllegalStateException(ProtectedSandApp.s("ꂫ\u0001"));
            }
            try {
                long w32 = b().w3(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f84371h.getEventListener().responseBodyStart(this.f84371h.getCall());
                }
                if (w32 == -1) {
                    c(null);
                    return -1L;
                }
                long j4 = this.bytesReceived + w32;
                long j5 = this.contentLength;
                if (j5 != -1 && j4 > j5) {
                    throw new ProtocolException(s4 + this.contentLength + ProtectedSandApp.s("ꂪ\u0001") + j4);
                }
                this.bytesReceived = j4;
                if (j4 == j5) {
                    c(null);
                }
                return w32;
            } catch (IOException e4) {
                throw c(e4);
            }
        }
    }

    public c(@l e eVar, @l r rVar, @l d dVar, @l okhttp3.internal.http.d dVar2) {
        l0.p(eVar, ProtectedSandApp.s("ꂬ\u0001"));
        l0.p(rVar, ProtectedSandApp.s("ꂭ\u0001"));
        l0.p(dVar, ProtectedSandApp.s("ꂮ\u0001"));
        l0.p(dVar2, ProtectedSandApp.s("ꂯ\u0001"));
        this.call = eVar;
        this.eventListener = rVar;
        this.finder = dVar;
        this.codec = dVar2;
        this.connection = dVar2.getConnection();
    }

    private final void t(IOException e4) {
        this.finder.h(e4);
        this.codec.getConnection().N(this.call, e4);
    }

    public final <E extends IOException> E a(long bytesRead, boolean responseDone, boolean requestDone, E e4) {
        if (e4 != null) {
            t(e4);
        }
        if (requestDone) {
            if (e4 != null) {
                this.eventListener.requestFailed(this.call, e4);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e4 != null) {
                this.eventListener.responseFailed(this.call, e4);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return (E) this.call.v(this, requestDone, responseDone, e4);
    }

    public final void b() {
        this.codec.cancel();
    }

    @l
    public final m0 c(@l d0 request, boolean duplex) throws IOException {
        l0.p(request, ProtectedSandApp.s("ꂰ\u0001"));
        this.isDuplex = duplex;
        e0 f4 = request.f();
        l0.m(f4);
        long contentLength = f4.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new a(this, this.codec.e(request, contentLength), contentLength);
    }

    public final void d() {
        this.codec.cancel();
        this.call.v(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.codec.a();
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            t(e4);
            throw e4;
        }
    }

    public final void f() throws IOException {
        try {
            this.codec.h();
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            t(e4);
            throw e4;
        }
    }

    @l
    /* renamed from: g, reason: from getter */
    public final e getCall() {
        return this.call;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    @l
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

    @l
    public final e.d m() throws SocketException {
        this.call.D();
        return this.codec.getConnection().E(this);
    }

    public final void n() {
        this.codec.getConnection().G();
    }

    public final void o() {
        this.call.v(this, true, false, null);
    }

    @l
    public final g0 p(@l f0 response) throws IOException {
        l0.p(response, ProtectedSandApp.s("ꂱ\u0001"));
        try {
            String C = f0.C(response, ProtectedSandApp.s("ꂲ\u0001"), null, 2, null);
            long d5 = this.codec.d(response);
            return new okhttp3.internal.http.h(C, d5, a0.d(new b(this, this.codec.b(response), d5)));
        } catch (IOException e4) {
            this.eventListener.responseFailed(this.call, e4);
            t(e4);
            throw e4;
        }
    }

    @fg.m
    public final f0.a q(boolean expectContinue) throws IOException {
        try {
            f0.a g4 = this.codec.g(expectContinue);
            if (g4 != null) {
                g4.x(this);
            }
            return g4;
        } catch (IOException e4) {
            this.eventListener.responseFailed(this.call, e4);
            t(e4);
            throw e4;
        }
    }

    public final void r(@l f0 response) {
        l0.p(response, ProtectedSandApp.s("ꂱ\u0001"));
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void s() {
        this.eventListener.responseHeadersStart(this.call);
    }

    @l
    public final u u() throws IOException {
        return this.codec.i();
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(@l d0 request) throws IOException {
        l0.p(request, ProtectedSandApp.s("ꂰ\u0001"));
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.f(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            t(e4);
            throw e4;
        }
    }
}
