package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.m2;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.p;
import okhttp3.r;
import okhttp3.w;
import okio.k;
import okio.q0;

/* compiled from: RealCall.kt */
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001C\u0018\u00002\u00020\u0001:\u0002noB\u001f\u0012\u0006\u0010f\u001a\u00020b\u0012\u0006\u0010i\u001a\u00020\u0012\u0012\u0006\u0010k\u001a\u00020\u0015¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u000f\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0015J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J;\u0010-\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b/\u0010\u0007J\u0011\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\u0002J\u0017\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0015H\u0000¢\u0006\u0004\b5\u00106J\u0006\u00107\u001a\u00020\u0015J\u000f\u00108\u001a\u00020\rH\u0000¢\u0006\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b;\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010OR(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010Q\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010R\u001a\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010UR(\u0010Y\u001a\u0004\u0018\u00010$2\b\u0010Q\u001a\u0004\u0018\u00010$8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010W\u001a\u0004\bD\u0010XR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010UR\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010UR\u0016\u0010\\\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010UR\u0016\u0010]\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010UR\u0018\u0010*\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010WR$\u0010a\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010R\u001a\u0004\b_\u0010T\"\u0004\b^\u0010`R\u0017\u0010f\u001a\u00020b8\u0006¢\u0006\f\n\u0004\b3\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010i\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010g\u001a\u0004\bK\u0010hR\u0017\u0010k\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b?\u0010j¨\u0006p"}, d2 = {"Lokhttp3/internal/connection/e;", "Lokhttp3/e;", "Lkotlin/m2;", "e", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "Lokhttp3/w;", "url", "Lokhttp3/a;", "i", "", "F", "Lokio/k;", "C", "f", "Lokhttp3/e0;", "g", "cancel", "", "t", "Lokhttp3/g0;", "execute", "Lokhttp3/f;", "responseCallback", "R", "r", "u", "()Lokhttp3/g0;", "request", "newExchangeFinder", "j", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/connection/c;", "v", "(Lokhttp3/internal/http/g;)Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/f;", "connection", "c", "exchange", "requestDone", "responseDone", "w", "(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "x", "Ljava/net/Socket;", "z", "()Ljava/net/Socket;", "D", "closeExchange", "k", "(Z)V", "A", "y", "()Ljava/lang/String;", "Lokhttp3/internal/connection/h;", "o", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/r;", "p", "Lokhttp3/r;", "()Lokhttp3/r;", "eventListener", "okhttp3/internal/connection/e$c", "q", "Lokhttp3/internal/connection/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "s", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "exchangeFinder", "<set-?>", "Lokhttp3/internal/connection/f;", "m", "()Lokhttp3/internal/connection/f;", "Z", "timeoutEarlyExit", "Lokhttp3/internal/connection/c;", "()Lokhttp3/internal/connection/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "B", "n", "(Lokhttp3/internal/connection/f;)V", "connectionToCancel", "Lokhttp3/c0;", "Lokhttp3/c0;", "l", "()Lokhttp3/c0;", "client", "Lokhttp3/e0;", "()Lokhttp3/e0;", "originalRequest", "()Z", "forWebSocket", "<init>", "(Lokhttp3/c0;Lokhttp3/e0;Z)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class e implements okhttp3.e {

    /* renamed from: A, reason: from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: B, reason: from kotlin metadata */
    private volatile okhttp3.internal.connection.c exchange;

    /* renamed from: C, reason: from kotlin metadata */
    @d5.e
    private volatile f connectionToCancel;

    /* renamed from: D, reason: from kotlin metadata */
    @d5.d
    private final c0 client;

    /* renamed from: E, reason: from kotlin metadata */
    @d5.d
    private final e0 originalRequest;

    /* renamed from: F, reason: from kotlin metadata */
    private final boolean forWebSocket;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final h connectionPool;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final r eventListener;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final c timeout;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private d exchangeFinder;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private f connection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private okhttp3.internal.connection.c interceptorScopedExchange;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lokhttp3/internal/connection/e$a;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/e;", "other", "Lkotlin/m2;", "f", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "o", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "Lokhttp3/f;", "p", "Lokhttp3/f;", "responseCallback", "", "d", "()Ljava/lang/String;", "host", "Lokhttp3/e0;", "e", "()Lokhttp3/e0;", "request", "b", "()Lokhttp3/internal/connection/e;", "call", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/f;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private volatile AtomicInteger callsPerHost;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final okhttp3.f responseCallback;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e f30875q;

        public a(@d5.d e eVar, okhttp3.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("憽"));
            this.f30875q = eVar;
            this.responseCallback = fVar;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void a(@d5.d ExecutorService executorService) {
            l0.p(executorService, ProtectedSandApp.s("憾"));
            p dispatcher = this.f30875q.getClient().getDispatcher();
            if (okhttp3.internal.d.f30936h && Thread.holdsLock(dispatcher)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憿"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("懀"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("懁"));
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e6) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("懂"));
                    interruptedIOException.initCause(e6);
                    this.f30875q.x(interruptedIOException);
                    this.responseCallback.b(this.f30875q, interruptedIOException);
                    this.f30875q.getClient().getDispatcher().h(this);
                }
            } catch (Throwable th) {
                this.f30875q.getClient().getDispatcher().h(this);
                throw th;
            }
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final e getF30875q() {
            return this.f30875q;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @d5.d
        public final String d() {
            return this.f30875q.s().q().getHost();
        }

        @d5.d
        public final e0 e() {
            return this.f30875q.s();
        }

        public final void f(@d5.d a aVar) {
            l0.p(aVar, ProtectedSandApp.s("懃"));
            this.callsPerHost = aVar.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            p dispatcher;
            String s5 = ProtectedSandApp.s("懄");
            String s6 = ProtectedSandApp.s("懅");
            String str = ProtectedSandApp.s("懆") + this.f30875q.y();
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("懇"));
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f30875q.timeout.v();
                boolean z5 = false;
                try {
                    try {
                    } catch (Throwable th) {
                        this.f30875q.getClient().getDispatcher().h(this);
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.responseCallback.a(this.f30875q, this.f30875q.u());
                    dispatcher = this.f30875q.getClient().getDispatcher();
                } catch (IOException e7) {
                    e = e7;
                    z5 = true;
                    if (z5) {
                        okhttp3.internal.platform.j.INSTANCE.getClass();
                        okhttp3.internal.platform.j.f31323a.m(s6 + this.f30875q.F(), 4, e);
                    } else {
                        this.responseCallback.b(this.f30875q, e);
                    }
                    dispatcher = this.f30875q.getClient().getDispatcher();
                    dispatcher.h(this);
                } catch (Throwable th3) {
                    th = th3;
                    z5 = true;
                    this.f30875q.cancel();
                    if (!z5) {
                        IOException iOException = new IOException(s5 + th);
                        kotlin.p.a(iOException, th);
                        this.responseCallback.b(this.f30875q, iOException);
                    }
                    throw th;
                }
                dispatcher.h(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/e$b;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/e;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lokhttp3/internal/connection/e;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d e eVar, @d5.e Object obj) {
            super(eVar);
            l0.p(eVar, ProtectedSandApp.s("懈"));
            this.callStackTrace = obj;
        }

        @d5.e
        /* renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"okhttp3/internal/connection/e$c", "Lokio/k;", "Lkotlin/m2;", "B", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class c extends k {
        c() {
        }

        @Override // okio.k
        protected void B() {
            e.this.cancel();
        }
    }

    public e(@d5.d c0 c0Var, @d5.d e0 e0Var, boolean z5) {
        l0.p(c0Var, ProtectedSandApp.s("應"));
        l0.p(e0Var, ProtectedSandApp.s("懊"));
        this.client = c0Var;
        this.originalRequest = e0Var;
        this.forWebSocket = z5;
        this.connectionPool = c0Var.getConnectionPool().getDelegate();
        this.eventListener = c0Var.getEventListenerFactory().a(this);
        c cVar = new c();
        cVar.i(c0Var.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        m2 m2Var = m2.f23662a;
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
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("懋"));
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.canceled ? ProtectedSandApp.s("懌") : "");
        sb.append(this.forWebSocket ? ProtectedSandApp.s("懍") : ProtectedSandApp.s("懎"));
        sb.append(ProtectedSandApp.s("懏"));
        sb.append(y());
        return sb.toString();
    }

    private final <E extends IOException> E d(E e6) {
        Socket z5;
        boolean z6 = okhttp3.internal.d.f30936h;
        if (z6 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("懐"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("懑"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("懒"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        f fVar = this.connection;
        if (fVar != null) {
            if (z6 && Thread.holdsLock(fVar)) {
                StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("懓"));
                Thread currentThread2 = Thread.currentThread();
                l0.o(currentThread2, ProtectedSandApp.s("懔"));
                sb2.append(currentThread2.getName());
                sb2.append(ProtectedSandApp.s("懕"));
                sb2.append(fVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (fVar) {
                z5 = z();
            }
            if (this.connection == null) {
                if (z5 != null) {
                    okhttp3.internal.d.n(z5);
                }
                this.eventListener.l(this, fVar);
            } else {
                if (!(z5 == null)) {
                    throw new IllegalStateException(ProtectedSandApp.s("懖").toString());
                }
            }
        }
        E e7 = (E) E(e6);
        if (e6 != null) {
            r rVar = this.eventListener;
            l0.m(e7);
            rVar.e(this, e7);
        } else {
            this.eventListener.d(this);
        }
        return e7;
    }

    private final void e() {
        okhttp3.internal.platform.j.INSTANCE.getClass();
        this.callStackTrace = okhttp3.internal.platform.j.f31323a.k(ProtectedSandApp.s("懗"));
        this.eventListener.f(this);
    }

    private final okhttp3.a i(w url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        okhttp3.g gVar;
        if (url.getIsHttps()) {
            sSLSocketFactory = this.client.u0();
            hostnameVerifier = this.client.getHostnameVerifier();
            gVar = this.client.getCertificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new okhttp3.a(url.getHost(), url.getPort(), this.client.getDns(), this.client.t0(), sSLSocketFactory, hostnameVerifier, gVar, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.m0(), this.client.V(), this.client.q0());
    }

    public final boolean A() {
        d dVar = this.exchangeFinder;
        l0.m(dVar);
        return dVar.e();
    }

    public final void B(@d5.e f fVar) {
        this.connectionToCancel = fVar;
    }

    @d5.d
    public k C() {
        return this.timeout;
    }

    public final void D() {
        if (!(!this.timeoutEarlyExit)) {
            throw new IllegalStateException(ProtectedSandApp.s("懘").toString());
        }
        this.timeoutEarlyExit = true;
        this.timeout.w();
    }

    @Override // okhttp3.e
    public void R(@d5.d okhttp3.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("懙"));
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException(ProtectedSandApp.s("懚").toString());
        }
        e();
        this.client.getDispatcher().c(new a(this, fVar));
    }

    public final void c(@d5.d f fVar) {
        l0.p(fVar, ProtectedSandApp.s("懛"));
        if (!okhttp3.internal.d.f30936h || Thread.holdsLock(fVar)) {
            if (!(this.connection == null)) {
                throw new IllegalStateException(ProtectedSandApp.s("懟").toString());
            }
            this.connection = fVar;
            fVar.u().add(new b(this, this.callStackTrace));
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("懜"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("懝"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("懞"));
        sb.append(fVar);
        throw new AssertionError(sb.toString());
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
        this.eventListener.g(this);
    }

    @Override // okhttp3.e
    @d5.d
    public g0 execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException(ProtectedSandApp.s("懠").toString());
        }
        this.timeout.v();
        e();
        try {
            this.client.getDispatcher().d(this);
            return u();
        } finally {
            this.client.getDispatcher().i(this);
        }
    }

    @Override // okhttp3.e
    @d5.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo104clone() {
        return new e(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.e
    @d5.d
    /* renamed from: g, reason: from getter */
    public e0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.e
    public q0 h() {
        return this.timeout;
    }

    public final void j(@d5.d e0 e0Var, boolean z5) {
        l0.p(e0Var, ProtectedSandApp.s("懡"));
        if (!(this.interceptorScopedExchange == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("懤").toString());
        }
        synchronized (this) {
            if (!(!this.responseBodyOpen)) {
                throw new IllegalStateException(ProtectedSandApp.s("懣").toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new IllegalStateException(ProtectedSandApp.s("懢").toString());
            }
            m2 m2Var = m2.f23662a;
        }
        if (z5) {
            this.exchangeFinder = new d(this.connectionPool, i(e0Var.q()), this, this.eventListener);
        }
    }

    public final void k(boolean closeExchange) {
        okhttp3.internal.connection.c cVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException(ProtectedSandApp.s("懥").toString());
            }
            m2 m2Var = m2.f23662a;
        }
        if (closeExchange && (cVar = this.exchange) != null) {
            cVar.d();
        }
        this.interceptorScopedExchange = null;
    }

    @d5.d
    /* renamed from: l, reason: from getter */
    public final c0 getClient() {
        return this.client;
    }

    @d5.e
    /* renamed from: m, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    @d5.e
    /* renamed from: n, reason: from getter */
    public final f getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @d5.d
    /* renamed from: o, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @d5.e
    /* renamed from: q, reason: from getter */
    public final okhttp3.internal.connection.c getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @Override // okhttp3.e
    public boolean r() {
        return this.executed.get();
    }

    @d5.d
    public final e0 s() {
        return this.originalRequest;
    }

    @Override // okhttp3.e
    /* renamed from: t, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.g0 u() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.c0 r0 = r11.client
            java.util.List r0 = r0.h0()
            kotlin.collections.y.q0(r2, r0)
            okhttp3.internal.http.j r0 = new okhttp3.internal.http.j
            okhttp3.c0 r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.a r0 = new okhttp3.internal.http.a
            okhttp3.c0 r1 = r11.client
            okhttp3.n r1 = r1.getCookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.a r0 = new okhttp3.internal.cache.a
            okhttp3.c0 r1 = r11.client
            okhttp3.c r1 = r1.getCache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.a.f30829b
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L46
            okhttp3.c0 r0 = r11.client
            java.util.List r0 = r0.j0()
            kotlin.collections.y.q0(r2, r0)
        L46:
            okhttp3.internal.http.b r0 = new okhttp3.internal.http.b
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.g r9 = new okhttp3.internal.http.g
            r3 = 0
            r4 = 0
            okhttp3.e0 r5 = r11.originalRequest
            okhttp3.c0 r0 = r11.client
            int r6 = r0.getConnectTimeoutMillis()
            okhttp3.c0 r0 = r11.client
            int r7 = r0.r0()
            okhttp3.c0 r0 = r11.client
            int r8 = r0.w0()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.e0 r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            okhttp3.g0 r2 = r9.e(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            boolean r3 = r11.canceled     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            if (r3 != 0) goto L7d
            r11.x(r0)
            return r2
        L7d:
            okhttp3.internal.d.l(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            java.lang.String r3 = "懦"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L8e
        L8c:
            r2 = move-exception
            goto La7
        L8e:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.x(r1)     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto La2
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = "懧"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> La3
            r1.<init>(r3)     // Catch: java.lang.Throwable -> La3
            throw r1     // Catch: java.lang.Throwable -> La3
        La2:
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La7:
            if (r1 != 0) goto Lac
            r11.x(r0)
        Lac:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.u():okhttp3.g0");
    }

    @d5.d
    public final okhttp3.internal.connection.c v(@d5.d okhttp3.internal.http.g chain) {
        l0.p(chain, ProtectedSandApp.s("懨"));
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException(ProtectedSandApp.s("懬").toString());
            }
            if (!(!this.responseBodyOpen)) {
                throw new IllegalStateException(ProtectedSandApp.s("懫").toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new IllegalStateException(ProtectedSandApp.s("懪").toString());
            }
            m2 m2Var = m2.f23662a;
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
            throw new IOException(ProtectedSandApp.s("懩"));
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:45:0x0018, B:12:0x0027, B:14:0x002b, B:15:0x002d, B:17:0x0031, B:21:0x003a, B:23:0x003e, B:27:0x0047, B:9:0x0021), top: B:44:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:45:0x0018, B:12:0x0027, B:14:0x002b, B:15:0x002d, B:17:0x0031, B:21:0x003a, B:23:0x003e, B:27:0x0047, B:9:0x0021), top: B:44:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E w(@d5.d okhttp3.internal.connection.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "懭"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            okhttp3.internal.connection.c r0 = r2.exchange
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L14
            return r6
        L14:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L25
            goto L1f
        L1d:
            r3 = move-exception
            goto L5e
        L1f:
            if (r5 == 0) goto L46
            boolean r1 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L46
        L25:
            if (r4 == 0) goto L29
            r2.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L1d
        L29:
            if (r5 == 0) goto L2d
            r2.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L1d
        L2d:
            boolean r4 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L37
            boolean r5 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L37
            r5 = r0
            goto L38
        L37:
            r5 = r3
        L38:
            if (r4 != 0) goto L43
            boolean r4 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L43
            boolean r4 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L43
            goto L44
        L43:
            r0 = r3
        L44:
            r3 = r5
            goto L47
        L46:
            r0 = r3
        L47:
            kotlin.m2 r4 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            if (r3 == 0) goto L56
            r3 = 0
            r2.exchange = r3
            okhttp3.internal.connection.f r3 = r2.connection
            if (r3 == 0) goto L56
            r3.z()
        L56:
            if (r0 == 0) goto L5d
            java.io.IOException r3 = r2.d(r6)
            return r3
        L5d:
            return r6
        L5e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.w(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @d5.e
    public final IOException x(@d5.e IOException e6) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z5 = true;
                }
            }
            m2 m2Var = m2.f23662a;
        }
        return z5 ? d(e6) : e6;
    }

    @d5.d
    public final String y() {
        return this.originalRequest.q().V();
    }

    @d5.e
    public final Socket z() {
        f fVar = this.connection;
        l0.m(fVar);
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("懮"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("懯"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("懰"));
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u5 = fVar.u();
        Iterator<Reference<e>> it = u5.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (l0.g(it.next().get(), this)) {
                break;
            }
            i5++;
        }
        if (!(i5 != -1)) {
            throw new IllegalStateException(ProtectedSandApp.s("懱").toString());
        }
        u5.remove(i5);
        this.connection = null;
        if (u5.isEmpty()) {
            fVar.I(System.nanoTime());
            if (this.connectionPool.c(fVar)) {
                return fVar.d();
            }
        }
        return null;
    }
}
