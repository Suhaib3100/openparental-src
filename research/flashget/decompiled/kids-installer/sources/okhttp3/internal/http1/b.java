package okhttp3.internal.http1;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.internal.http.d;
import okhttp3.internal.http.i;
import okhttp3.internal.http.k;
import okhttp3.v;
import okhttp3.w;
import okio.m;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.q0;
import okio.t;

/* compiled from: Http1ExchangeCodec.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0007\u001e\u0016\u001a&\u001d\u0019\u001cB)\u0012\b\u00102\u001a\u0004\u0018\u000100\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010>\u001a\u00020;¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u001a\u00107\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u00020#*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0018\u0010A\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010F\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lokhttp3/internal/http1/b;", "Lokhttp3/internal/http/d;", "Lokio/m0;", "v", "y", "", "length", "Lokio/o0;", "x", "Lokhttp3/w;", "url", "w", "z", "Lokio/t;", "timeout", "Lkotlin/m2;", "r", "Lokhttp3/e0;", "request", "contentLength", "h", "cancel", "b", "Lokhttp3/g0;", "response", "f", "c", "Lokhttp3/v;", "g", "e", "a", "headers", "", "requestLine", "B", "", "expectContinue", "Lokhttp3/g0$a;", "d", "A", "", "I", "state", "Lokhttp3/internal/http1/a;", "Lokhttp3/internal/http1/a;", "headersReader", "Lokhttp3/v;", "trailers", "Lokhttp3/c0;", "Lokhttp3/c0;", "client", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "getConnection", "()Lokhttp3/internal/connection/f;", "connection", "Lokio/o;", "Lokio/o;", "source", "Lokio/n;", "i", "Lokio/n;", "sink", "t", "(Lokhttp3/g0;)Z", "isChunked", "s", "(Lokhttp3/e0;)Z", "u", "()Z", "isClosed", "<init>", "(Lokhttp3/c0;Lokhttp3/internal/connection/f;Lokio/o;Lokio/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: j, reason: collision with root package name */
    private static final long f30983j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f30984k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f30985l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f30986m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f30987n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f30988o = 4;

    /* renamed from: p, reason: collision with root package name */
    private static final int f30989p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f30990q = 6;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http1.a headersReader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private v trailers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c0 client;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.internal.connection.f connection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/http1/b$a;", "Lokio/o0;", "Lokio/q0;", "h", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "c", "Lokio/t;", "o", "Lokio/t;", "b", "()Lokio/t;", "timeout", "", "p", "Z", "a", "()Z", "d", "(Z)V", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private abstract class a implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final t timeout;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a() {
            this.timeout = new t(b.this.source.getTimeout());
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("捙"));
            try {
                return b.this.source.X0(sink, byteCount);
            } catch (IOException e6) {
                b.this.getConnection().G();
                c();
                throw e6;
            }
        }

        /* renamed from: a, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        protected final t getTimeout() {
            return this.timeout;
        }

        public final void c() {
            if (b.this.state == 6) {
                return;
            }
            if (b.this.state == 5) {
                b.this.r(this.timeout);
                b.this.state = 6;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("捚") + b.this.state);
            }
        }

        protected final void d(boolean z5) {
            this.closed = z5;
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/b$b;", "Lokio/m0;", "Lokio/q0;", "h", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "Lokio/t;", "o", "Lokio/t;", "timeout", "", "p", "Z", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http1.b$b, reason: collision with other inner class name */
    private final class C0477b implements m0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final t timeout;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public C0477b() {
            this.timeout = new t(b.this.sink.getTimeout());
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.sink.j0(ProtectedSandApp.s("捛"));
            b.this.r(this.timeout);
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
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.m0
        public void t0(@d5.d m mVar, long j5) {
            l0.p(mVar, ProtectedSandApp.s("捜"));
            if (!(!this.closed)) {
                throw new IllegalStateException(ProtectedSandApp.s("捞").toString());
            }
            if (j5 == 0) {
                return;
            }
            b.this.sink.w0(j5);
            n nVar = b.this.sink;
            String s5 = ProtectedSandApp.s("捝");
            nVar.j0(s5);
            b.this.sink.t0(mVar, j5);
            b.this.sink.j0(s5);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/b$c;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lkotlin/m2;", "e", "Lokio/m;", "sink", "", "byteCount", "X0", "close", "r", "J", "bytesRemainingInChunk", "", "s", "Z", "hasMoreChunks", "Lokhttp3/w;", "t", "Lokhttp3/w;", "url", "<init>", "(Lokhttp3/internal/http1/b;Lokhttp3/w;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    private final class c extends a {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final w url;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ b f31008u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@d5.d b bVar, w wVar) {
            super();
            l0.p(wVar, ProtectedSandApp.s("醺"));
            this.f31008u = bVar;
            this.url = wVar;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r2 != false) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void e() {
            /*
                r8 = this;
                java.lang.String r0 = "醻"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                long r1 = r8.bytesRemainingInChunk
                r3 = -1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L17
                okhttp3.internal.http1.b r1 = r8.f31008u
                okio.o r1 = okhttp3.internal.http1.b.m(r1)
                r1.G0()
            L17:
                okhttp3.internal.http1.b r1 = r8.f31008u     // Catch: java.lang.NumberFormatException -> Lb5
                okio.o r1 = okhttp3.internal.http1.b.m(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                long r1 = r1.o1()     // Catch: java.lang.NumberFormatException -> Lb5
                r8.bytesRemainingInChunk = r1     // Catch: java.lang.NumberFormatException -> Lb5
                okhttp3.internal.http1.b r1 = r8.f31008u     // Catch: java.lang.NumberFormatException -> Lb5
                okio.o r1 = okhttp3.internal.http1.b.m(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.String r1 = r1.G0()     // Catch: java.lang.NumberFormatException -> Lb5
                if (r1 == 0) goto La9
                java.lang.CharSequence r1 = kotlin.text.v.C5(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> Lb5
                long r2 = r8.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> Lb5
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L8d
                int r2 = r1.length()     // Catch: java.lang.NumberFormatException -> Lb5
                r3 = 0
                if (r2 <= 0) goto L48
                r2 = 1
                goto L49
            L48:
                r2 = r3
            L49:
                if (r2 == 0) goto L59
                java.lang.String r2 = "醼"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.NumberFormatException -> Lb5
                r6 = 2
                r7 = 0
                boolean r2 = kotlin.text.v.s2(r1, r2, r3, r6, r7)     // Catch: java.lang.NumberFormatException -> Lb5
                if (r2 == 0) goto L8d
            L59:
                long r0 = r8.bytesRemainingInChunk
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L8c
                r8.hasMoreChunks = r3
                okhttp3.internal.http1.b r0 = r8.f31008u
                okhttp3.internal.http1.a r1 = okhttp3.internal.http1.b.k(r0)
                okhttp3.v r1 = r1.b()
                okhttp3.internal.http1.b.q(r0, r1)
                okhttp3.internal.http1.b r0 = r8.f31008u
                okhttp3.c0 r0 = okhttp3.internal.http1.b.j(r0)
                kotlin.jvm.internal.l0.m(r0)
                okhttp3.n r0 = r0.getCookieJar()
                okhttp3.w r1 = r8.url
                okhttp3.internal.http1.b r2 = r8.f31008u
                okhttp3.v r2 = okhttp3.internal.http1.b.o(r2)
                kotlin.jvm.internal.l0.m(r2)
                okhttp3.internal.http.e.g(r0, r1, r2)
                r8.c()
            L8c:
                return
            L8d:
                java.net.ProtocolException r2 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb5
                r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lb5
                long r4 = r8.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> Lb5
                r3.append(r4)     // Catch: java.lang.NumberFormatException -> Lb5
                r3.append(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                r0 = 34
                r3.append(r0)     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> Lb5
                r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lb5
                throw r2     // Catch: java.lang.NumberFormatException -> Lb5
            La9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.String r1 = "醽"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lb5
                throw r0     // Catch: java.lang.NumberFormatException -> Lb5
            Lb5:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.b.c.e():void");
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("醾"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("釁"), byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException(ProtectedSandApp.s("釀").toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j5 = this.bytesRemainingInChunk;
            if (j5 == 0 || j5 == -1) {
                e();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long X0 = super.X0(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (X0 != -1) {
                this.bytesRemainingInChunk -= X0;
                return X0;
            }
            this.f31008u.getConnection().G();
            ProtocolException protocolException = new ProtocolException(ProtectedSandApp.s("醿"));
            c();
            throw protocolException;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.f31008u.getConnection().G();
                c();
            }
            d(true);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http1/b$e;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "r", "J", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/b;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    private final class e extends a {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        public e(long j5) {
            super();
            this.bytesRemaining = j5;
            if (j5 == 0) {
                c();
            }
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("釂"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("釅"), byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException(ProtectedSandApp.s("釄").toString());
            }
            long j5 = this.bytesRemaining;
            if (j5 == 0) {
                return -1L;
            }
            long X0 = super.X0(sink, Math.min(j5, byteCount));
            if (X0 == -1) {
                b.this.getConnection().G();
                ProtocolException protocolException = new ProtocolException(ProtectedSandApp.s("釃"));
                c();
                throw protocolException;
            }
            long j6 = this.bytesRemaining - X0;
            this.bytesRemaining = j6;
            if (j6 == 0) {
                c();
            }
            return X0;
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
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/b$f;", "Lokio/m0;", "Lokio/q0;", "h", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "Lokio/t;", "o", "Lokio/t;", "timeout", "", "p", "Z", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class f implements m0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final t timeout;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
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
            b.this.r(this.timeout);
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
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.m0
        public void t0(@d5.d m mVar, long j5) {
            l0.p(mVar, ProtectedSandApp.s("损"));
            if (!(!this.closed)) {
                throw new IllegalStateException(ProtectedSandApp.s("捠").toString());
            }
            okhttp3.internal.d.k(mVar.size(), 0L, j5);
            b.this.sink.t0(mVar, j5);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/b$g;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "", "r", "Z", "inputExhausted", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    private final class g extends a {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        public g() {
            super();
        }

        @Override // okhttp3.internal.http1.b.a, okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("釆"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("釈"), byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException(ProtectedSandApp.s("采").toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long X0 = super.X0(sink, byteCount);
            if (X0 != -1) {
                return X0;
            }
            this.inputExhausted = true;
            c();
            return -1L;
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
    }

    public b(@d5.e c0 c0Var, @d5.d okhttp3.internal.connection.f fVar, @d5.d o oVar, @d5.d n nVar) {
        l0.p(fVar, ProtectedSandApp.s("捡"));
        l0.p(oVar, ProtectedSandApp.s("换"));
        l0.p(nVar, ProtectedSandApp.s("捣"));
        this.client = c0Var;
        this.connection = fVar;
        this.source = oVar;
        this.sink = nVar;
        this.headersReader = new okhttp3.internal.http1.a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(t tVar) {
        q0 delegate = tVar.getDelegate();
        tVar.m(q0.f31704d);
        delegate.a();
        delegate.b();
    }

    private final boolean s(e0 e0Var) {
        boolean K1;
        K1 = kotlin.text.e0.K1(ProtectedSandApp.s("捥"), e0Var.i(ProtectedSandApp.s("捤")), true);
        return K1;
    }

    private final boolean t(g0 g0Var) {
        boolean K1;
        K1 = kotlin.text.e0.K1(ProtectedSandApp.s("捧"), g0.P(g0Var, ProtectedSandApp.s("捦"), null, 2, null), true);
        return K1;
    }

    private final m0 v() {
        if (this.state == 1) {
            this.state = 2;
            return new C0477b();
        }
        throw new IllegalStateException((ProtectedSandApp.s("捨") + this.state).toString());
    }

    private final o0 w(w url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, url);
        }
        throw new IllegalStateException((ProtectedSandApp.s("捩") + this.state).toString());
    }

    private final o0 x(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(length);
        }
        throw new IllegalStateException((ProtectedSandApp.s("捪") + this.state).toString());
    }

    private final m0 y() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException((ProtectedSandApp.s("捫") + this.state).toString());
    }

    private final o0 z() {
        if (this.state == 4) {
            this.state = 5;
            this.connection.G();
            return new g();
        }
        throw new IllegalStateException((ProtectedSandApp.s("捬") + this.state).toString());
    }

    public final void A(@d5.d g0 g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("捭"));
        long x5 = okhttp3.internal.d.x(g0Var);
        if (x5 == -1) {
            return;
        }
        o0 x6 = x(x5);
        okhttp3.internal.d.T(x6, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        x6.close();
    }

    public final void B(@d5.d v vVar, @d5.d String str) {
        l0.p(vVar, ProtectedSandApp.s("据"));
        l0.p(str, ProtectedSandApp.s("捯"));
        if (!(this.state == 0)) {
            throw new IllegalStateException((ProtectedSandApp.s("捲") + this.state).toString());
        }
        n j02 = this.sink.j0(str);
        String s5 = ProtectedSandApp.s("捰");
        j02.j0(s5);
        int size = vVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.sink.j0(vVar.q(i5)).j0(ProtectedSandApp.s("捱")).j0(vVar.x(i5)).j0(s5);
        }
        this.sink.j0(s5);
        this.state = 1;
    }

    @Override // okhttp3.internal.http.d
    public void a() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.d
    public void b(@d5.d e0 e0Var) {
        l0.p(e0Var, ProtectedSandApp.s("捳"));
        i iVar = i.f30967a;
        Proxy.Type type = this.connection.getRoute().e().type();
        l0.o(type, ProtectedSandApp.s("捴"));
        B(e0Var.k(), iVar.a(e0Var, type));
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public o0 c(@d5.d g0 response) {
        l0.p(response, ProtectedSandApp.s("捵"));
        if (!okhttp3.internal.http.e.c(response)) {
            return x(0L);
        }
        if (t(response)) {
            return w(response.getRequest().q());
        }
        long x5 = okhttp3.internal.d.x(response);
        return x5 != -1 ? x(x5) : z();
    }

    @Override // okhttp3.internal.http.d
    public void cancel() {
        this.connection.k();
    }

    @Override // okhttp3.internal.http.d
    @d5.e
    public g0.a d(boolean expectContinue) {
        int i5 = this.state;
        boolean z5 = true;
        if (i5 != 1 && i5 != 3) {
            z5 = false;
        }
        if (!z5) {
            throw new IllegalStateException((ProtectedSandApp.s("捷") + this.state).toString());
        }
        try {
            k b6 = k.INSTANCE.b(this.headersReader.c());
            g0.a w5 = new g0.a().B(b6.protocol).g(b6.code).y(b6.message).w(this.headersReader.b());
            if (expectContinue && b6.code == 100) {
                return null;
            }
            if (b6.code == 100) {
                this.state = 3;
                return w5;
            }
            this.state = 4;
            return w5;
        } catch (EOFException e6) {
            throw new IOException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("捶"), this.connection.getRoute().d().w().V()), e6);
        }
    }

    @Override // okhttp3.internal.http.d
    public void e() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.d
    public long f(@d5.d g0 response) {
        l0.p(response, ProtectedSandApp.s("捸"));
        if (!okhttp3.internal.http.e.c(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return okhttp3.internal.d.x(response);
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public v g() {
        if (!(this.state == 6)) {
            throw new IllegalStateException(ProtectedSandApp.s("捹").toString());
        }
        v vVar = this.trailers;
        return vVar != null ? vVar : okhttp3.internal.d.f30930b;
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public okhttp3.internal.connection.f getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public m0 h(@d5.d e0 request, long contentLength) {
        l0.p(request, ProtectedSandApp.s("捺"));
        if (request.f() != null && request.f().p()) {
            throw new ProtocolException(ProtectedSandApp.s("捻"));
        }
        if (s(request)) {
            return v();
        }
        if (contentLength != -1) {
            return y();
        }
        throw new IllegalStateException(ProtectedSandApp.s("捼"));
    }

    public final boolean u() {
        return this.state == 6;
    }
}
