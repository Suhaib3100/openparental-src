package okhttp3;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okio.d0;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: MultipartReader.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003-./B\u0017\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\b\u0018\u00010\u0019R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lokhttp3/a0;", "Ljava/io/Closeable;", "", "maxResult", "j", "Lokhttp3/a0$b;", "k", "Lkotlin/m2;", "close", "Lokio/p;", "o", "Lokio/p;", "dashDashBoundary", "p", "crlfDashDashBoundary", "", "q", "I", "partCount", "", "r", "Z", "closed", "s", "noMoreParts", "Lokhttp3/a0$c;", "t", "Lokhttp3/a0$c;", "currentPart", "Lokio/o;", "u", "Lokio/o;", "source", "", "v", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/o;Ljava/lang/String;)V", "Lokhttp3/h0;", "response", "(Lokhttp3/h0;)V", "x", "a", "b", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a0 implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private static final okio.d0 f30448w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final okio.p dashDashBoundary;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final okio.p crlfDashDashBoundary;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int partCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreParts;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private c currentPart;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final okio.o source;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String boundary;

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/a0$a;", "", "Lokio/d0;", "afterBoundaryOptions", "Lokio/d0;", "a", "()Lokio/d0;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.a0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final okio.d0 a() {
            return a0.f30448w;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/a0$b;", "Ljava/io/Closeable;", "Lkotlin/m2;", "close", "Lokhttp3/v;", "o", "Lokhttp3/v;", "b", "()Lokhttp3/v;", "headers", "Lokio/o;", "p", "Lokio/o;", "a", "()Lokio/o;", "body", "<init>", "(Lokhttp3/v;Lokio/o;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements Closeable {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final v headers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final okio.o body;

        public b(@d5.d v vVar, @d5.d okio.o oVar) {
            kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("庶"));
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("康"));
            this.headers = vVar;
            this.body = oVar;
        }

        @p3.i(name = "body")
        @d5.d
        /* renamed from: a, reason: from getter */
        public final okio.o getBody() {
            return this.body;
        }

        @p3.i(name = "headers")
        @d5.d
        /* renamed from: b, reason: from getter */
        public final v getHeaders() {
            return this.headers;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/a0$c;", "Lokio/o0;", "Lkotlin/m2;", "close", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "o", "Lokio/q0;", "timeout", "<init>", "(Lokhttp3/a0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class c implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        public c() {
        }

        @Override // okio.o0
        public long X0(@d5.d okio.m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("庸"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("庺"), byteCount).toString());
            }
            if (!kotlin.jvm.internal.l0.g(a0.this.currentPart, this)) {
                throw new IllegalStateException(ProtectedSandApp.s("庹").toString());
            }
            q0 timeout = a0.this.source.getTimeout();
            q0 q0Var = this.timeout;
            long timeoutNanos = timeout.getTimeoutNanos();
            long a6 = q0.INSTANCE.a(q0Var.getTimeoutNanos(), timeout.getTimeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.i(a6, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (q0Var.getHasDeadline()) {
                    timeout.e(q0Var.d());
                }
                try {
                    long j5 = a0.this.j(byteCount);
                    long X0 = j5 == 0 ? -1L : a0.this.source.X0(sink, j5);
                    timeout.i(timeoutNanos, timeUnit);
                    if (q0Var.getHasDeadline()) {
                        timeout.a();
                    }
                    return X0;
                } catch (Throwable th) {
                    timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (q0Var.getHasDeadline()) {
                        timeout.a();
                    }
                    throw th;
                }
            }
            long d6 = timeout.d();
            if (q0Var.getHasDeadline()) {
                timeout.e(Math.min(timeout.d(), q0Var.d()));
            }
            try {
                long j6 = a0.this.j(byteCount);
                long X02 = j6 == 0 ? -1L : a0.this.source.X0(sink, j6);
                timeout.i(timeoutNanos, timeUnit);
                if (q0Var.getHasDeadline()) {
                    timeout.e(d6);
                }
                return X02;
            } catch (Throwable th2) {
                timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                if (q0Var.getHasDeadline()) {
                    timeout.e(d6);
                }
                throw th2;
            }
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (kotlin.jvm.internal.l0.g(a0.this.currentPart, this)) {
                a0.this.currentPart = null;
            }
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        d0.Companion companion = okio.d0.INSTANCE;
        p.Companion companion2 = okio.p.INSTANCE;
        f30448w = companion.d(companion2.l(ProtectedSandApp.s("庻")), companion2.l(ProtectedSandApp.s("庼")), companion2.l(ProtectedSandApp.s("庽")), companion2.l(ProtectedSandApp.s("庾")));
    }

    public a0(@d5.d okio.o oVar, @d5.d String str) throws IOException {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("廂"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("廃"));
        this.source = oVar;
        this.boundary = str;
        this.dashDashBoundary = new okio.m().j0(ProtectedSandApp.s("廄")).j0(str).x0();
        this.crlfDashDashBoundary = new okio.m().j0(ProtectedSandApp.s("廅")).j0(str).x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long maxResult) {
        this.source.h1(this.crlfDashDashBoundary.i0());
        long K = this.source.i().K(this.crlfDashDashBoundary);
        return K == -1 ? Math.min(maxResult, (this.source.i().size() - this.crlfDashDashBoundary.i0()) + 1) : Math.min(maxResult, K);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @p3.i(name = "boundary")
    @d5.d
    /* renamed from: g, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @d5.e
    public final b k() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("廈").toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.q0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.i0());
        } else {
            while (true) {
                long j5 = j(8192L);
                if (j5 == 0) {
                    break;
                }
                this.source.skip(j5);
            }
            this.source.skip(this.crlfDashDashBoundary.i0());
        }
        boolean z5 = false;
        while (true) {
            int r12 = this.source.r1(f30448w);
            String s5 = ProtectedSandApp.s("廆");
            if (r12 == -1) {
                throw new ProtocolException(s5);
            }
            if (r12 == 0) {
                this.partCount++;
                v b6 = new okhttp3.internal.http1.a(this.source).b();
                c cVar = new c();
                this.currentPart = cVar;
                return new b(b6, okio.a0.d(cVar));
            }
            if (r12 == 1) {
                if (z5) {
                    throw new ProtocolException(s5);
                }
                if (this.partCount == 0) {
                    throw new ProtocolException(ProtectedSandApp.s("廇"));
                }
                this.noMoreParts = true;
                return null;
            }
            if (r12 == 2 || r12 == 3) {
                z5 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@d5.d okhttp3.h0 r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "庿"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            okio.o r0 = r3.getSource()
            okhttp3.y r3 = r3.getF30637r()
            if (r3 == 0) goto L23
            java.lang.String r1 = "廀"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.String r3 = r3.i(r1)
            if (r3 == 0) goto L23
            r2.<init>(r0, r3)
            return
        L23:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "廁"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.a0.<init>(okhttp3.h0):void");
    }
}
