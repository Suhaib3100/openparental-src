package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.d0;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: MultipartReader.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0003-\u0016\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010'\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+¨\u0006."}, d2 = {"Lokhttp3/z;", "Ljava/io/Closeable;", "Lokio/o;", "source", "", "boundary", "<init>", "(Lokio/o;Ljava/lang/String;)V", "Lokhttp3/g0;", "response", "(Lokhttp3/g0;)V", "", "maxResult", "g", "(J)J", "Lokhttp3/z$b;", "h", "()Lokhttp3/z$b;", "Lkotlin/k2;", "close", "()V", "Lokio/p;", "b", "Lokio/p;", "dashDashBoundary", "c", "crlfDashDashBoundary", "", "d", "I", "partCount", "", "e", "Z", "closed", "f", "noMoreParts", "Lokhttp3/z$c;", "Lokhttp3/z$c;", "currentPart", "Lokio/o;", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "k", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class z implements Closeable {

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final okio.d0 f85142j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final okio.p dashDashBoundary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final okio.p crlfDashDashBoundary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int partCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreParts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c currentPart;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final okio.o source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String boundary;

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/z$a;", "", "<init>", "()V", "Lokio/d0;", "afterBoundaryOptions", "Lokio/d0;", "a", "()Lokio/d0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.z$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final okio.d0 a() {
            return z.f85142j;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/z$b;", "Ljava/io/Closeable;", "Lokhttp3/u;", "headers", "Lokio/o;", "body", "<init>", "(Lokhttp3/u;Lokio/o;)V", "Lkotlin/k2;", "close", "()V", "b", "Lokhttp3/u;", "()Lokhttp3/u;", "c", "Lokio/o;", "a", "()Lokio/o;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements Closeable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final u headers;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okio.o body;

        public b(@fg.l u uVar, @fg.l okio.o oVar) {
            l0.p(uVar, ProtectedSandApp.s("ꋡ\u0001"));
            l0.p(oVar, ProtectedSandApp.s("ꋢ\u0001"));
            this.headers = uVar;
            this.body = oVar;
        }

        @fg.l
        @kd.i(name = "body")
        /* renamed from: a, reason: from getter */
        public final okio.o getBody() {
            return this.body;
        }

        @fg.l
        @kd.i(name = "headers")
        /* renamed from: b, reason: from getter */
        public final u getHeaders() {
            return this.headers;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/z$c;", "Lokio/o0;", "<init>", "(Lokhttp3/z;)V", "Lkotlin/k2;", "close", "()V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "b", "Lokio/q0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class c implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        public c() {
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (l0.g(z.this.currentPart, this)) {
                z.this.currentPart = null;
            }
        }

        @Override // okio.o0
        @fg.l
        /* renamed from: timeout, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.o0
        public long w3(@fg.l okio.m sink, long byteCount) {
            l0.p(sink, ProtectedSandApp.s("ꋣ\u0001"));
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ꋥ\u0001"), byteCount).toString());
            }
            if (!l0.g(z.this.currentPart, this)) {
                throw new IllegalStateException(ProtectedSandApp.s("ꋤ\u0001"));
            }
            q0 timeout = z.this.source.getTimeout();
            q0 q0Var = this.timeout;
            long timeoutNanos = timeout.getTimeoutNanos();
            long a5 = q0.INSTANCE.a(q0Var.getTimeoutNanos(), timeout.getTimeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.i(a5, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (q0Var.getHasDeadline()) {
                    timeout.e(q0Var.d());
                }
                try {
                    long g4 = z.this.g(byteCount);
                    long w32 = g4 == 0 ? -1L : z.this.source.w3(sink, g4);
                    timeout.i(timeoutNanos, timeUnit);
                    if (q0Var.getHasDeadline()) {
                        timeout.a();
                    }
                    return w32;
                } catch (Throwable th) {
                    timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (q0Var.getHasDeadline()) {
                        timeout.a();
                    }
                    throw th;
                }
            }
            long d5 = timeout.d();
            if (q0Var.getHasDeadline()) {
                timeout.e(Math.min(timeout.d(), q0Var.d()));
            }
            try {
                long g5 = z.this.g(byteCount);
                long w33 = g5 == 0 ? -1L : z.this.source.w3(sink, g5);
                timeout.i(timeoutNanos, timeUnit);
                if (q0Var.getHasDeadline()) {
                    timeout.e(d5);
                }
                return w33;
            } catch (Throwable th2) {
                timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                if (q0Var.getHasDeadline()) {
                    timeout.e(d5);
                }
                throw th2;
            }
        }
    }

    static {
        d0.Companion companion = okio.d0.INSTANCE;
        p.Companion companion2 = okio.p.INSTANCE;
        f85142j = companion.d(companion2.l(ProtectedSandApp.s("ꋦ\u0001")), companion2.l(ProtectedSandApp.s("ꋧ\u0001")), companion2.l(ProtectedSandApp.s("ꋨ\u0001")), companion2.l(ProtectedSandApp.s("ꋩ\u0001")));
    }

    public z(@fg.l okio.o oVar, @fg.l String str) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("ꋭ\u0001"));
        l0.p(str, ProtectedSandApp.s("ꋫ\u0001"));
        this.source = oVar;
        this.boundary = str;
        this.dashDashBoundary = new okio.m().Q0(ProtectedSandApp.s("ꋧ\u0001")).Q0(str).b3();
        this.crlfDashDashBoundary = new okio.m().Q0(ProtectedSandApp.s("ꋮ\u0001")).Q0(str).b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g(long maxResult) {
        this.source.J1(this.crlfDashDashBoundary.q());
        long m02 = this.source.getBufferField().m0(this.crlfDashDashBoundary);
        return m02 == -1 ? Math.min(maxResult, (this.source.getBufferField().size() - this.crlfDashDashBoundary.q()) + 1) : Math.min(maxResult, m02);
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

    @fg.l
    @kd.i(name = "boundary")
    /* renamed from: f, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @fg.m
    public final b h() throws IOException {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ꋱ\u0001"));
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.T0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.q());
        } else {
            while (true) {
                long g4 = g(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (g4 == 0) {
                    break;
                }
                this.source.skip(g4);
            }
            this.source.skip(this.crlfDashDashBoundary.q());
        }
        boolean z4 = false;
        while (true) {
            int K3 = this.source.K3(f85142j);
            String s4 = ProtectedSandApp.s("ꋯ\u0001");
            if (K3 == -1) {
                throw new ProtocolException(s4);
            }
            if (K3 == 0) {
                this.partCount++;
                u b5 = new okhttp3.internal.http1.a(this.source).b();
                c cVar = new c();
                this.currentPart = cVar;
                return new b(b5, okio.a0.d(cVar));
            }
            if (K3 == 1) {
                if (z4) {
                    throw new ProtocolException(s4);
                }
                if (this.partCount == 0) {
                    throw new ProtocolException(ProtectedSandApp.s("ꋰ\u0001"));
                }
                this.noMoreParts = true;
                return null;
            }
            if (K3 == 2 || K3 == 3) {
                z4 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(@fg.l okhttp3.g0 r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "ꋪ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            okio.o r0 = r3.getSource()
            okhttp3.x r3 = r3.getF84143e()
            if (r3 == 0) goto L25
            java.lang.String r1 = "ꋫ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r3 = r3.i(r1)
            if (r3 == 0) goto L25
            r2.<init>(r0, r3)
            return
        L25:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "ꋬ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.z.<init>(okhttp3.g0):void");
    }
}
