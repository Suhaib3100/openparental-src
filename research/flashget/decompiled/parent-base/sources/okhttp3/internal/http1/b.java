package okhttp3.internal.http1;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.internal.http.d;
import okhttp3.internal.http.i;
import okhttp3.internal.http.k;
import okhttp3.u;
import okhttp3.v;
import okio.m;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.q0;
import okio.t;

/* compiled from: Http1ExchangeCodec.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 V2\u00020\u0001:\u00073-A+#'<B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u0010&J\u000f\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b3\u0010&J\u001d\u00107\u001a\u00020\u001d2\u0006\u00104\u001a\u00020/2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0019\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010GR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\bA\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010MR\u0018\u0010P\u001a\u000209*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0018\u0010P\u001a\u000209*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u0002098F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lokhttp3/internal/http1/b;", "Lokhttp3/internal/http/d;", "Lokhttp3/b0;", "client", "Lokhttp3/internal/connection/f;", "connection", "Lokio/o;", "source", "Lokio/n;", "sink", "<init>", "(Lokhttp3/b0;Lokhttp3/internal/connection/f;Lokio/o;Lokio/n;)V", "Lokio/m0;", "w", "()Lokio/m0;", "z", "", "length", "Lokio/o0;", "y", "(J)Lokio/o0;", "Lokhttp3/v;", "url", "x", "(Lokhttp3/v;)Lokio/o0;", "A", "()Lokio/o0;", "Lokio/t;", "timeout", "Lkotlin/k2;", "s", "(Lokio/t;)V", "Lokhttp3/d0;", "request", "contentLength", "e", "(Lokhttp3/d0;J)Lokio/m0;", "cancel", "()V", "f", "(Lokhttp3/d0;)V", "Lokhttp3/f0;", "response", "d", "(Lokhttp3/f0;)J", "b", "(Lokhttp3/f0;)Lokio/o0;", "Lokhttp3/u;", "i", "()Lokhttp3/u;", "h", "a", "headers", "", "requestLine", "C", "(Lokhttp3/u;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/f0$a;", "g", "(Z)Lokhttp3/f0$a;", "B", "(Lokhttp3/f0;)V", "", "c", "I", "state", "Lokhttp3/internal/http1/a;", "Lokhttp3/internal/http1/a;", "headersReader", "Lokhttp3/u;", "trailers", "Lokhttp3/b0;", "Lokhttp3/internal/connection/f;", "()Lokhttp3/internal/connection/f;", "Lokio/o;", "Lokio/n;", "u", "(Lokhttp3/f0;)Z", "isChunked", "t", "(Lokhttp3/d0;)Z", "v", "()Z", "isClosed", "r", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: j, reason: collision with root package name */
    private static final long f84510j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f84511k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f84512l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f84513m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f84514n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f84515o = 4;

    /* renamed from: p, reason: collision with root package name */
    private static final int f84516p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f84517q = 6;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http1.a headersReader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u trailers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b0 client;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final okhttp3.internal.connection.f connection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/http1/b$a;", "Lokio/o0;", "<init>", "(Lokhttp3/internal/http1/b;)V", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "c", "()V", "Lokio/t;", "b", "Lokio/t;", "()Lokio/t;", "", "Z", "a", "()Z", "d", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
    private abstract class a implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final t timeout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a() {
            this.timeout = new t(b.this.source.getTimeout());
        }

        /* renamed from: a, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        @l
        /* renamed from: b, reason: from getter */
        protected final t getTimeout() {
            return this.timeout;
        }

        public final void c() {
            if (b.this.state == 6) {
                return;
            }
            if (b.this.state == 5) {
                b.this.s(this.timeout);
                b.this.state = 6;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("|") + b.this.state);
            }
        }

        protected final void d(boolean z4) {
            this.closed = z4;
        }

        @Override // okio.o0
        @l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.o0
        public long w3(@l m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("}"));
            try {
                return b.this.source.w3(sink, byteCount);
            } catch (IOException e4) {
                b.this.getConnection().G();
                c();
                throw e4;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/b$b;", "Lokio/m0;", "<init>", "(Lokhttp3/internal/http1/b;)V", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "Lokio/t;", "b", "Lokio/t;", "", "c", "Z", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http1.b$b, reason: collision with other inner class name */
    private final class C1316b implements m0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final t timeout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public C1316b() {
            this.timeout = new t(b.this.sink.getTimeout());
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.sink.Q0(ProtectedSandApp.s("~"));
            b.this.s(this.timeout);
            b.this.state = 3;
        }

        @Override // okio.m0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }

        @Override // okio.m0
        @l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.m0
        public void write(@l m source, long byteCount) {
            l0.p(source, ProtectedSandApp.s("\u007f"));
            if (this.closed) {
                throw new IllegalStateException(ProtectedSandApp.s("\u0081"));
            }
            if (byteCount == 0) {
                return;
            }
            b.this.sink.a3(byteCount);
            n nVar = b.this.sink;
            String s4 = ProtectedSandApp.s("\u0080");
            nVar.Q0(s4);
            b.this.sink.write(source, byteCount);
            b.this.sink.Q0(s4);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http1/b$c;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokhttp3/v;", "url", "<init>", "(Lokhttp3/internal/http1/b;Lokhttp3/v;)V", "Lkotlin/k2;", "e", "()V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "close", "J", "bytesRemainingInChunk", "", "f", "Z", "hasMoreChunks", "g", "Lokhttp3/v;", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class c extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final v url;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f84535h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@l b bVar, v vVar) {
            super();
            l0.p(vVar, ProtectedSandApp.s("\u0082"));
            this.f84535h = bVar;
            this.url = vVar;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void e() {
            String s4 = ProtectedSandApp.s("\u0083");
            if (this.bytesRemainingInChunk != -1) {
                this.f84535h.source.m1();
            }
            try {
                this.bytesRemainingInChunk = this.f84535h.source.H3();
                String m12 = this.f84535h.source.m1();
                if (m12 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("\u0085"));
                }
                String obj = kotlin.text.v.C5(m12).toString();
                if (this.bytesRemainingInChunk < 0 || (obj.length() > 0 && !kotlin.text.v.s2(obj, ProtectedSandApp.s("\u0084"), false, 2, null))) {
                    throw new ProtocolException(s4 + this.bytesRemainingInChunk + obj + kotlin.text.m0.quote);
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    b bVar = this.f84535h;
                    bVar.trailers = bVar.headersReader.b();
                    b0 b0Var = this.f84535h.client;
                    l0.m(b0Var);
                    okhttp3.n cookieJar = b0Var.getCookieJar();
                    v vVar = this.url;
                    u uVar = this.f84535h.trailers;
                    l0.m(uVar);
                    okhttp3.internal.http.e.g(cookieJar, vVar, uVar);
                    c();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.f84535h.getConnection().G();
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long w3(@l m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("\u0086"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("\u0089"), byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException(ProtectedSandApp.s("\u0088"));
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j4 = this.bytesRemainingInChunk;
            if (j4 == 0 || j4 == -1) {
                e();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long w32 = super.w3(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (w32 != -1) {
                this.bytesRemainingInChunk -= w32;
                return w32;
            }
            this.f84535h.getConnection().G();
            ProtocolException protocolException = new ProtocolException(ProtectedSandApp.s("\u0087"));
            c();
            throw protocolException;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/b$e;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/b;J)V", "Lokio/m;", "sink", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "e", "J", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class e extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        public e(long j4) {
            super();
            this.bytesRemaining = j4;
            if (j4 == 0) {
                c();
            }
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.getConnection().G();
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long w3(@l m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("\u008a"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("\u008d"), byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException(ProtectedSandApp.s("\u008c"));
            }
            long j4 = this.bytesRemaining;
            if (j4 == 0) {
                return -1L;
            }
            long w32 = super.w3(sink, Math.min(j4, byteCount));
            if (w32 == -1) {
                b.this.getConnection().G();
                ProtocolException protocolException = new ProtocolException(ProtectedSandApp.s("\u008b"));
                c();
                throw protocolException;
            }
            long j5 = this.bytesRemaining - w32;
            this.bytesRemaining = j5;
            if (j5 == 0) {
                c();
            }
            return w32;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/b$f;", "Lokio/m0;", "<init>", "(Lokhttp3/internal/http1/b;)V", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "Lokio/t;", "b", "Lokio/t;", "", "c", "Z", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class f implements m0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final t timeout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public f() {
            this.timeout = new t(b.this.sink.getTimeout());
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.s(this.timeout);
            b.this.state = 3;
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }

        @Override // okio.m0
        @l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.m0
        public void write(@l m source, long byteCount) {
            l0.p(source, ProtectedSandApp.s("\u008e"));
            if (this.closed) {
                throw new IllegalStateException(ProtectedSandApp.s("\u008f"));
            }
            okhttp3.internal.d.k(source.size(), 0L, byteCount);
            b.this.sink.write(source, byteCount);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http1/b$g;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "<init>", "(Lokhttp3/internal/http1/b;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "", "e", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class g extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        public g() {
            super();
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                c();
            }
            d(true);
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long w3(@l m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("\u0090"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("\u0092"), byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException(ProtectedSandApp.s("\u0091"));
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long w32 = super.w3(sink, byteCount);
            if (w32 != -1) {
                return w32;
            }
            this.inputExhausted = true;
            c();
            return -1L;
        }
    }

    public b(@fg.m b0 b0Var, @l okhttp3.internal.connection.f fVar, @l o oVar, @l n nVar) {
        l0.p(fVar, ProtectedSandApp.s("\u0093"));
        l0.p(oVar, ProtectedSandApp.s("\u0094"));
        l0.p(nVar, ProtectedSandApp.s("\u0095"));
        this.client = b0Var;
        this.connection = fVar;
        this.source = oVar;
        this.sink = nVar;
        this.headersReader = new okhttp3.internal.http1.a(oVar);
    }

    private final o0 A() {
        if (this.state == 4) {
            this.state = 5;
            this.connection.G();
            return new g();
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(t timeout) {
        q0 delegate = timeout.getDelegate();
        timeout.m(q0.f85260d);
        delegate.a();
        delegate.b();
    }

    private final boolean t(d0 d0Var) {
        return kotlin.text.v.K1(ProtectedSandApp.s("\u0098"), d0Var.i(ProtectedSandApp.s("\u0097")), true);
    }

    private final boolean u(f0 f0Var) {
        return kotlin.text.v.K1(ProtectedSandApp.s("\u0098"), f0.C(f0Var, ProtectedSandApp.s("\u0097"), null, 2, null), true);
    }

    private final m0 w() {
        if (this.state == 1) {
            this.state = 2;
            return new C1316b();
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
    }

    private final o0 x(v url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, url);
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
    }

    private final o0 y(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(length);
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
    }

    private final m0 z() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
    }

    public final void B(@l f0 response) {
        l0.p(response, ProtectedSandApp.s("\u0099"));
        long x4 = okhttp3.internal.d.x(response);
        if (x4 == -1) {
            return;
        }
        o0 y4 = y(x4);
        okhttp3.internal.d.T(y4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        y4.close();
    }

    public final void C(@l u headers, @l String requestLine) {
        l0.p(headers, ProtectedSandApp.s("\u009a"));
        l0.p(requestLine, ProtectedSandApp.s("\u009b"));
        if (!(this.state == 0)) {
            throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
        }
        n Q0 = this.sink.Q0(requestLine);
        String s4 = ProtectedSandApp.s("\u009c");
        Q0.Q0(s4);
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.sink.Q0(headers.j(i4)).Q0(ProtectedSandApp.s("\u009d")).Q0(headers.s(i4)).Q0(s4);
        }
        this.sink.Q0(s4);
        this.state = 1;
    }

    @Override // okhttp3.internal.http.d
    public void a() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.d
    @l
    public o0 b(@l f0 response) {
        l0.p(response, ProtectedSandApp.s("\u0099"));
        if (!okhttp3.internal.http.e.c(response)) {
            return y(0L);
        }
        if (u(response)) {
            return x(response.getRequest().q());
        }
        long x4 = okhttp3.internal.d.x(response);
        return x4 != -1 ? y(x4) : A();
    }

    @Override // okhttp3.internal.http.d
    @l
    /* renamed from: c, reason: from getter */
    public okhttp3.internal.connection.f getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.d
    public void cancel() {
        this.connection.k();
    }

    @Override // okhttp3.internal.http.d
    public long d(@l f0 response) {
        l0.p(response, ProtectedSandApp.s("\u0099"));
        if (!okhttp3.internal.http.e.c(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return okhttp3.internal.d.x(response);
    }

    @Override // okhttp3.internal.http.d
    @l
    public m0 e(@l d0 request, long contentLength) {
        l0.p(request, ProtectedSandApp.s("\u009e"));
        if (request.f() != null && request.f().isDuplex()) {
            throw new ProtocolException(ProtectedSandApp.s("\u009f"));
        }
        if (t(request)) {
            return w();
        }
        if (contentLength != -1) {
            return z();
        }
        throw new IllegalStateException(ProtectedSandApp.s(" "));
    }

    @Override // okhttp3.internal.http.d
    public void f(@l d0 request) {
        l0.p(request, ProtectedSandApp.s("\u009e"));
        i iVar = i.f84494a;
        Proxy.Type type = this.connection.getRoute().e().type();
        l0.o(type, ProtectedSandApp.s("¡"));
        C(request.k(), iVar.a(request, type));
    }

    @Override // okhttp3.internal.http.d
    @fg.m
    public f0.a g(boolean expectContinue) {
        int i4 = this.state;
        boolean z4 = true;
        if (i4 != 1 && i4 != 3) {
            z4 = false;
        }
        if (!z4) {
            throw new IllegalStateException((ProtectedSandApp.s("\u0096") + this.state).toString());
        }
        try {
            k b5 = k.INSTANCE.b(this.headersReader.c());
            f0.a w4 = new f0.a().B(b5.protocol).g(b5.code).y(b5.message).w(this.headersReader.b());
            if (expectContinue && b5.code == 100) {
                return null;
            }
            if (b5.code == 100) {
                this.state = 3;
                return w4;
            }
            this.state = 4;
            return w4;
        } catch (EOFException e4) {
            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("¢"), this.connection.getRoute().d().w().V()), e4);
        }
    }

    @Override // okhttp3.internal.http.d
    public void h() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.d
    @l
    public u i() {
        if (!(this.state == 6)) {
            throw new IllegalStateException(ProtectedSandApp.s("£"));
        }
        u uVar = this.trailers;
        return uVar != null ? uVar : okhttp3.internal.d.f84457b;
    }

    public final boolean v() {
        return this.state == 6;
    }
}
