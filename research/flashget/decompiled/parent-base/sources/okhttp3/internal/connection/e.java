package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.o;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.p;
import okhttp3.r;
import okhttp3.v;
import okio.k;
import okio.q0;

/* compiled from: RealCall.kt */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b*\u0001S\u0018\u00002\u00020\u0001:\u0002vJB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010,\u001a\u00020$H\u0000¢\u0006\u0004\b,\u0010&J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J;\u0010=\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b?\u0010\u0010J\u0011\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\n¢\u0006\u0004\bC\u0010\fJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0006H\u0000¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0006¢\u0006\u0004\bG\u0010#J\u000f\u0010H\u001a\u00020\u0017H\u0000¢\u0006\u0004\bH\u0010\u0019R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010]R(\u00107\u001a\u0004\u0018\u0001062\b\u0010_\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010`\u001a\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010cR(\u0010h\u001a\u0004\u0018\u0001032\b\u0010_\u001a\u0004\u0018\u0001038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010cR\u0016\u0010j\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010cR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010cR\u0016\u0010m\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010cR\u0018\u0010:\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010eR$\u0010p\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010`\u001a\u0004\bn\u0010b\"\u0004\bo\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bk\u0010sR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010t\u001a\u0004\bu\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bu\u0010c\u001a\u0004\bq\u0010#¨\u0006w"}, d2 = {"Lokhttp3/internal/connection/e;", "Lokhttp3/e;", "Lokhttp3/b0;", "client", "Lokhttp3/d0;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/b0;Lokhttp3/d0;Z)V", "Lkotlin/k2;", "f", "()V", "Ljava/io/IOException;", "E", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "Lokhttp3/v;", "url", "Lokhttp3/a;", "i", "(Lokhttp3/v;)Lokhttp3/a;", "", "F", "()Ljava/lang/String;", "Lokio/k;", "C", "()Lokio/k;", "g", "()Lokhttp3/internal/connection/e;", "h", "()Lokhttp3/d0;", "cancel", "L", "()Z", "Lokhttp3/f0;", "j", "()Lokhttp3/f0;", "Lokhttp3/f;", "responseCallback", "n2", "(Lokhttp3/f;)V", "x", "t", "request", "newExchangeFinder", "k", "(Lokhttp3/d0;Z)V", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/connection/c;", "u", "(Lokhttp3/internal/http/g;)Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/f;", "connection", "d", "(Lokhttp3/internal/connection/f;)V", "exchange", "requestDone", "responseDone", "v", "(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "w", "Ljava/net/Socket;", "z", "()Ljava/net/Socket;", "D", "closeExchange", "l", "(Z)V", "A", "y", "Lokhttp3/internal/connection/h;", "b", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/r;", "c", "Lokhttp3/r;", "p", "()Lokhttp3/r;", "eventListener", "okhttp3/internal/connection/e$c", "Lokhttp3/internal/connection/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "exchangeFinder", "<set-?>", "Lokhttp3/internal/connection/f;", "n", "()Lokhttp3/internal/connection/f;", "Z", "timeoutEarlyExit", "Lokhttp3/internal/connection/c;", "r", "()Lokhttp3/internal/connection/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "m", "expectMoreExchanges", "canceled", "o", "B", "connectionToCancel", "q", "Lokhttp3/b0;", "()Lokhttp3/b0;", "Lokhttp3/d0;", "s", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class e implements okhttp3.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h connectionPool;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final r eventListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c timeout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d exchangeFinder;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private f connection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private okhttp3.internal.connection.c interceptorScopedExchange;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private volatile okhttp3.internal.connection.c exchange;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @m
    private volatile f connectionToCancel;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 client;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    private final d0 originalRequest;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010!¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/e$a;", "Ljava/lang/Runnable;", "Lokhttp3/f;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/f;)V", "Lokhttp3/internal/connection/e;", "other", "Lkotlin/k2;", "f", "(Lokhttp3/internal/connection/e$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Lokhttp3/f;", "", "d", "()Ljava/lang/String;", "host", "Lokhttp3/d0;", "e", "()Lokhttp3/d0;", "request", "()Lokhttp3/internal/connection/e;", "call", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private volatile AtomicInteger callsPerHost;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final okhttp3.f responseCallback;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f84402d;

        public a(@l e eVar, okhttp3.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("ꂿ\u0001"));
            this.f84402d = eVar;
            this.responseCallback = fVar;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void a(@l ExecutorService executorService) {
            l0.p(executorService, ProtectedSandApp.s("ꃀ\u0001"));
            p dispatcher = this.f84402d.getClient().getDispatcher();
            if (okhttp3.internal.d.f84463h && Thread.holdsLock(dispatcher)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃁ\u0001"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ꃂ\u0001"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ꃃ\u0001"));
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("ꃄ\u0001"));
                    interruptedIOException.initCause(e4);
                    this.f84402d.w(interruptedIOException);
                    this.responseCallback.a(this.f84402d, interruptedIOException);
                    this.f84402d.getClient().getDispatcher().h(this);
                }
            } catch (Throwable th) {
                this.f84402d.getClient().getDispatcher().h(this);
                throw th;
            }
        }

        @l
        /* renamed from: b, reason: from getter */
        public final e getF84402d() {
            return this.f84402d;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @l
        public final String d() {
            return this.f84402d.s().q().getHost();
        }

        @l
        public final d0 e() {
            return this.f84402d.s();
        }

        public final void f(@l a other) {
            l0.p(other, ProtectedSandApp.s("ꃅ\u0001"));
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            p dispatcher;
            String s4 = ProtectedSandApp.s("ꃆ\u0001");
            String s5 = ProtectedSandApp.s("ꃇ\u0001");
            String str = ProtectedSandApp.s("ꃈ\u0001") + this.f84402d.y();
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃉ\u0001"));
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f84402d.timeout.v();
                boolean z4 = false;
                try {
                    try {
                        try {
                            this.responseCallback.b(this.f84402d, this.f84402d.t());
                            dispatcher = this.f84402d.getClient().getDispatcher();
                        } catch (IOException e4) {
                            e = e4;
                            z4 = true;
                            if (z4) {
                                okhttp3.internal.platform.j.INSTANCE.getClass();
                                okhttp3.internal.platform.j.f84863a.m(s4 + this.f84402d.F(), 4, e);
                            } else {
                                this.responseCallback.a(this.f84402d, e);
                            }
                            dispatcher = this.f84402d.getClient().getDispatcher();
                            dispatcher.h(this);
                        } catch (Throwable th) {
                            th = th;
                            z4 = true;
                            this.f84402d.cancel();
                            if (!z4) {
                                IOException iOException = new IOException(s5 + th);
                                o.a(iOException, th);
                                this.responseCallback.a(this.f84402d, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f84402d.getClient().getDispatcher().h(this);
                        throw th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                } catch (Throwable th3) {
                    th = th3;
                }
                dispatcher.h(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/e$b;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/e;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/e;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l e eVar, @m Object obj) {
            super(eVar);
            l0.p(eVar, ProtectedSandApp.s("ꃊ\u0001"));
            this.callStackTrace = obj;
        }

        @m
        /* renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/connection/e$c", "Lokio/k;", "Lkotlin/k2;", "B", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c extends k {
        c() {
        }

        @Override // okio.k
        protected void B() {
            e.this.cancel();
        }
    }

    public e(@l b0 b0Var, @l d0 d0Var, boolean z4) {
        l0.p(b0Var, ProtectedSandApp.s("ꃋ\u0001"));
        l0.p(d0Var, ProtectedSandApp.s("ꃌ\u0001"));
        this.client = b0Var;
        this.originalRequest = d0Var;
        this.forWebSocket = z4;
        this.connectionPool = b0Var.getConnectionPool().getDelegate();
        this.eventListener = b0Var.getEventListenerFactory().create(this);
        c cVar = new c();
        cVar.i(b0Var.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        k2 k2Var = k2.f75408a;
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E E(E cause) {
        if (this.timeoutEarlyExit) {
            return cause;
        }
        if (!this.timeout.w()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("ꃍ\u0001"));
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.canceled ? ProtectedSandApp.s("ꃎ\u0001") : "");
        sb.append(this.forWebSocket ? ProtectedSandApp.s("ꃏ\u0001") : ProtectedSandApp.s("ꃐ\u0001"));
        sb.append(ProtectedSandApp.s("ꃑ\u0001"));
        sb.append(y());
        return sb.toString();
    }

    private final <E extends IOException> E e(E e4) {
        Socket z4;
        boolean z5 = okhttp3.internal.d.f84463h;
        if (z5 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃒ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃓ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꃔ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        f fVar = this.connection;
        if (fVar != null) {
            if (z5 && Thread.holdsLock(fVar)) {
                StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("ꃒ\u0001"));
                Thread currentThread2 = Thread.currentThread();
                l0.o(currentThread2, ProtectedSandApp.s("ꃓ\u0001"));
                sb2.append(currentThread2.getName());
                sb2.append(ProtectedSandApp.s("ꃔ\u0001"));
                sb2.append(fVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (fVar) {
                z4 = z();
            }
            if (this.connection == null) {
                if (z4 != null) {
                    okhttp3.internal.d.n(z4);
                }
                this.eventListener.connectionReleased(this, fVar);
            } else {
                if (!(z4 == null)) {
                    throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
                }
            }
        }
        E e5 = (E) E(e4);
        if (e4 != null) {
            r rVar = this.eventListener;
            l0.m(e5);
            rVar.callFailed(this, e5);
        } else {
            this.eventListener.callEnd(this);
        }
        return e5;
    }

    private final void f() {
        okhttp3.internal.platform.j.INSTANCE.getClass();
        this.callStackTrace = okhttp3.internal.platform.j.f84863a.k(ProtectedSandApp.s("ꃖ\u0001"));
        this.eventListener.callStart(this);
    }

    private final okhttp3.a i(v url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        okhttp3.g gVar;
        if (url.getIsHttps()) {
            sSLSocketFactory = this.client.q0();
            hostnameVerifier = this.client.getHostnameVerifier();
            gVar = this.client.getCertificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new okhttp3.a(url.getHost(), url.getPort(), this.client.getDns(), this.client.p0(), sSLSocketFactory, hostnameVerifier, gVar, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.h0(), this.client.S(), this.client.l0());
    }

    public final boolean A() {
        d dVar = this.exchangeFinder;
        l0.m(dVar);
        return dVar.e();
    }

    public final void B(@m f fVar) {
        this.connectionToCancel = fVar;
    }

    @l
    public k C() {
        return this.timeout;
    }

    public final void D() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
        }
        this.timeoutEarlyExit = true;
        this.timeout.w();
    }

    @Override // okhttp3.e
    /* renamed from: L, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.e
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        okhttp3.internal.connection.c cVar = this.exchange;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.connectionToCancel;
        if (fVar != null) {
            fVar.k();
        }
        this.eventListener.canceled(this);
    }

    public final void d(@l f connection) {
        l0.p(connection, ProtectedSandApp.s("ꃗ\u0001"));
        if (!okhttp3.internal.d.f84463h || Thread.holdsLock(connection)) {
            if (!(this.connection == null)) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
            }
            this.connection = connection;
            connection.u().add(new b(this, this.callStackTrace));
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃒ\u0001"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ꃓ\u0001"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("ꃘ\u0001"));
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }

    @Override // okhttp3.e
    @l
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo22clone() {
        return new e(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.e
    @l
    /* renamed from: h, reason: from getter */
    public d0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.e
    @l
    public f0 j() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꃙ\u0001"));
        }
        this.timeout.v();
        f();
        try {
            this.client.getDispatcher().d(this);
            return t();
        } finally {
            this.client.getDispatcher().i(this);
        }
    }

    public final void k(@l d0 request, boolean newExchangeFinder) {
        l0.p(request, ProtectedSandApp.s("ꃚ\u0001"));
        if (!(this.interceptorScopedExchange == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃛ\u0001"));
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
            }
            k2 k2Var = k2.f75408a;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new d(this.connectionPool, i(request.q()), this, this.eventListener);
        }
    }

    public final void l(boolean closeExchange) {
        okhttp3.internal.connection.c cVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃜ\u0001"));
            }
            k2 k2Var = k2.f75408a;
        }
        if (closeExchange && (cVar = this.exchange) != null) {
            cVar.d();
        }
        this.interceptorScopedExchange = null;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final b0 getClient() {
        return this.client;
    }

    @m
    /* renamed from: n, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    @Override // okhttp3.e
    public void n2(@l okhttp3.f responseCallback) {
        l0.p(responseCallback, ProtectedSandApp.s("ꃝ\u0001"));
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꃙ\u0001"));
        }
        f();
        this.client.getDispatcher().c(new a(this, responseCallback));
    }

    @m
    /* renamed from: o, reason: from getter */
    public final f getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @m
    /* renamed from: r, reason: from getter */
    public final okhttp3.internal.connection.c getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @l
    public final d0 s() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.f0 t() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.b0 r0 = r11.client
            java.util.List r0 = r0.c0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.w.q0(r2, r0)
            okhttp3.internal.http.j r0 = new okhttp3.internal.http.j
            okhttp3.b0 r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.a r0 = new okhttp3.internal.http.a
            okhttp3.b0 r1 = r11.client
            okhttp3.n r1 = r1.getCookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.a r0 = new okhttp3.internal.cache.a
            okhttp3.b0 r1 = r11.client
            okhttp3.c r1 = r1.getCache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.a.f84350b
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L4a
            okhttp3.b0 r0 = r11.client
            java.util.List r0 = r0.e0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.w.q0(r2, r0)
        L4a:
            okhttp3.internal.http.b r0 = new okhttp3.internal.http.b
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.g r9 = new okhttp3.internal.http.g
            okhttp3.d0 r5 = r11.originalRequest
            okhttp3.b0 r0 = r11.client
            int r6 = r0.getConnectTimeoutMillis()
            okhttp3.b0 r0 = r11.client
            int r7 = r0.m0()
            okhttp3.b0 r0 = r11.client
            int r8 = r0.t0()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.d0 r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            okhttp3.f0 r2 = r9.c(r2)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            boolean r3 = r11.canceled     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            if (r3 != 0) goto L81
            r11.w(r0)
            return r2
        L81:
            okhttp3.internal.d.l(r2)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.lang.String r3 = "ꃞ\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            throw r2     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
        L91:
            r2 = move-exception
            goto Lae
        L93:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.w(r1)     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lad
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = "ꃟ\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> La8
            r1.<init>(r3)     // Catch: java.lang.Throwable -> La8
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto Lae
        Lad:
            throw r1     // Catch: java.lang.Throwable -> La8
        Lae:
            if (r1 != 0) goto Lb3
            r11.w(r0)
        Lb3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.t():okhttp3.f0");
    }

    @Override // okhttp3.e
    public q0 timeout() {
        return this.timeout;
    }

    @l
    public final okhttp3.internal.connection.c u(@l okhttp3.internal.http.g chain) {
        l0.p(chain, ProtectedSandApp.s("ꃠ\u0001"));
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃜ\u0001"));
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
            }
            k2 k2Var = k2.f75408a;
        }
        d dVar = this.exchangeFinder;
        l0.m(dVar);
        okhttp3.internal.connection.c cVar = new okhttp3.internal.connection.c(this, this.eventListener, dVar, dVar.a(this.client, chain));
        this.interceptorScopedExchange = cVar;
        this.exchange = cVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException(ProtectedSandApp.s("ꃞ\u0001"));
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:44:0x0017, B:12:0x0026, B:14:0x002a, B:15:0x002c, B:17:0x0031, B:21:0x003a, B:23:0x003e, B:27:0x0047, B:9:0x0020), top: B:43:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:44:0x0017, B:12:0x0026, B:14:0x002a, B:15:0x002c, B:17:0x0031, B:21:0x003a, B:23:0x003e, B:27:0x0047, B:9:0x0020), top: B:43:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E v(@fg.l okhttp3.internal.connection.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "ꃡ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            okhttp3.internal.connection.c r0 = r1.exchange
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r0)
            if (r2 != 0) goto L13
            return r5
        L13:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L1e
            boolean r0 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L24
            goto L1e
        L1c:
            r2 = move-exception
            goto L5e
        L1e:
            if (r4 == 0) goto L46
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L46
        L24:
            if (r3 == 0) goto L28
            r1.requestBodyOpen = r2     // Catch: java.lang.Throwable -> L1c
        L28:
            if (r4 == 0) goto L2c
            r1.responseBodyOpen = r2     // Catch: java.lang.Throwable -> L1c
        L2c:
            boolean r3 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L1c
            r4 = 1
            if (r3 != 0) goto L37
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L37
            r0 = r4
            goto L38
        L37:
            r0 = r2
        L38:
            if (r3 != 0) goto L43
            boolean r3 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L43
            boolean r3 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L43
            r2 = r4
        L43:
            r3 = r2
            r2 = r0
            goto L47
        L46:
            r3 = r2
        L47:
            kotlin.k2 r4 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            if (r2 == 0) goto L56
            r2 = 0
            r1.exchange = r2
            okhttp3.internal.connection.f r2 = r1.connection
            if (r2 == 0) goto L56
            r2.z()
        L56:
            if (r3 == 0) goto L5d
            java.io.IOException r2 = r1.e(r5)
            return r2
        L5d:
            return r5
        L5e:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.v(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @m
    public final IOException w(@m IOException e4) {
        boolean z4;
        synchronized (this) {
            try {
                z4 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z4 = true;
                    }
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4 ? e(e4) : e4;
    }

    @Override // okhttp3.e
    public boolean x() {
        return this.executed.get();
    }

    @l
    public final String y() {
        return this.originalRequest.q().V();
    }

    @m
    public final Socket z() {
        f fVar = this.connection;
        l0.m(fVar);
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃒ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃓ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꃘ\u0001"));
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u4 = fVar.u();
        Iterator<Reference<e>> it = u4.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (l0.g(it.next().get(), this)) {
                break;
            }
            i4++;
        }
        if (!(i4 != -1)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꃕ\u0001"));
        }
        u4.remove(i4);
        this.connection = null;
        if (u4.isEmpty()) {
            fVar.I(System.nanoTime());
            if (this.connectionPool.c(fVar)) {
                return fVar.d();
            }
        }
        return null;
    }
}
