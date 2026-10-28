package okhttp3.internal.connection;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import okhttp3.i0;
import okhttp3.internal.connection.e;
import okhttp3.k;

/* compiled from: RealConnectionPool.kt */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001e\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$¨\u0006-"}, d2 = {"Lokhttp3/internal/connection/h;", "", "Lokhttp3/internal/connection/f;", "connection", "", "now", "", "g", "f", "d", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "call", "", "Lokhttp3/i0;", "routes", "", "requireMultiplexed", "a", "Lkotlin/m2;", "h", "c", "e", "b", "J", "keepAliveDurationNs", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "okhttp3/internal/connection/h$b", "Lokhttp3/internal/connection/h$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "maxIdleConnections", "Lokhttp3/internal/concurrent/d;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/d;IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long keepAliveDurationNs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c cleanupQueue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b cleanupTask;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<f> connections;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int maxIdleConnections;

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/h$a;", "", "Lokhttp3/k;", "connectionPool", "Lokhttp3/internal/connection/h;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final h a(@d5.d k connectionPool) {
            l0.p(connectionPool, ProtectedSandApp.s("戼"));
            return connectionPool.getDelegate();
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/connection/h$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends okhttp3.internal.concurrent.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(@d5.d okhttp3.internal.concurrent.d dVar, int i5, long j5, @d5.d TimeUnit timeUnit) {
        l0.p(dVar, ProtectedSandApp.s("戽"));
        l0.p(timeUnit, ProtectedSandApp.s("戾"));
        this.maxIdleConnections = i5;
        this.keepAliveDurationNs = timeUnit.toNanos(j5);
        this.cleanupQueue = dVar.j();
        this.cleanupTask = new b(androidx.concurrent.futures.a.a(new StringBuilder(), okhttp3.internal.d.f30937i, ProtectedSandApp.s("房")));
        this.connections = new ConcurrentLinkedQueue<>();
        if (!(j5 > 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("所"), j5).toString());
        }
    }

    private final int g(f connection, long now) {
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("扁"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("扂"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("扃"));
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u5 = connection.u();
        int i5 = 0;
        while (i5 < u5.size()) {
            Reference<e> reference = u5.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                String str = ProtectedSandApp.s("扄") + connection.getRoute().d().w() + ProtectedSandApp.s("扅");
                okhttp3.internal.platform.j.INSTANCE.getClass();
                okhttp3.internal.platform.j.f31323a.o(str, ((e.b) reference).getCallStackTrace());
                u5.remove(i5);
                connection.J(true);
                if (u5.isEmpty()) {
                    connection.I(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return u5.size();
    }

    public final boolean a(@d5.d okhttp3.a address, @d5.d e call, @d5.e List<i0> routes, boolean requireMultiplexed) {
        l0.p(address, ProtectedSandApp.s("扆"));
        l0.p(call, ProtectedSandApp.s("扇"));
        Iterator<f> it = this.connections.iterator();
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("扈"));
            synchronized (next) {
                if (requireMultiplexed) {
                    if (!next.C()) {
                        m2 m2Var = m2.f23662a;
                    }
                }
                if (next.A(address, routes)) {
                    call.c(next);
                    return true;
                }
                m2 m2Var2 = m2.f23662a;
            }
        }
        return false;
    }

    public final long b(long now) {
        Iterator<f> it = this.connections.iterator();
        int i5 = 0;
        long j5 = Long.MIN_VALUE;
        f fVar = null;
        int i6 = 0;
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("扉"));
            synchronized (next) {
                if (g(next, now) > 0) {
                    i6++;
                } else {
                    i5++;
                    long idleAtNs = now - next.getIdleAtNs();
                    if (idleAtNs > j5) {
                        m2 m2Var = m2.f23662a;
                        fVar = next;
                        j5 = idleAtNs;
                    } else {
                        m2 m2Var2 = m2.f23662a;
                    }
                }
            }
        }
        long j6 = this.keepAliveDurationNs;
        if (j5 < j6 && i5 <= this.maxIdleConnections) {
            if (i5 > 0) {
                return j6 - j5;
            }
            if (i6 > 0) {
                return j6;
            }
            return -1L;
        }
        l0.m(fVar);
        synchronized (fVar) {
            if (!fVar.u().isEmpty()) {
                return 0L;
            }
            if (fVar.getIdleAtNs() + j5 != now) {
                return 0L;
            }
            fVar.J(true);
            this.connections.remove(fVar);
            okhttp3.internal.d.n(fVar.d());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean c(@d5.d f connection) {
        l0.p(connection, ProtectedSandApp.s("扊"));
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("手"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("扌"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("才"));
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.J(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        return true;
    }

    public final int d() {
        return this.connections.size();
    }

    public final void e() {
        Socket socket;
        Iterator<f> it = this.connections.iterator();
        l0.o(it, ProtectedSandApp.s("扎"));
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("扏"));
            synchronized (next) {
                if (next.u().isEmpty()) {
                    it.remove();
                    next.J(true);
                    socket = next.d();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                okhttp3.internal.d.n(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
    }

    public final int f() {
        boolean isEmpty;
        ConcurrentLinkedQueue<f> concurrentLinkedQueue = this.connections;
        int i5 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (f fVar : concurrentLinkedQueue) {
                l0.o(fVar, ProtectedSandApp.s("扐"));
                synchronized (fVar) {
                    isEmpty = fVar.u().isEmpty();
                }
                if (isEmpty && (i5 = i5 + 1) < 0) {
                    a0.Y();
                }
            }
        }
        return i5;
    }

    public final void h(@d5.d f fVar) {
        l0.p(fVar, ProtectedSandApp.s("扑"));
        if (!okhttp3.internal.d.f30936h || Thread.holdsLock(fVar)) {
            this.connections.add(fVar);
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("扒"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("打"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("扔"));
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }
}
