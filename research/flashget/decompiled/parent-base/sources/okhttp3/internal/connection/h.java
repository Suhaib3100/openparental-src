package okhttp3.internal.connection;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import okhttp3.h0;
import okhttp3.internal.connection.e;
import okhttp3.k;

/* compiled from: RealConnectionPool.kt */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001-\u0018\u0000 \u00112\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J5\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103¨\u00064"}, d2 = {"Lokhttp3/internal/connection/h;", "", "Lokhttp3/internal/concurrent/d;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/d;IJLjava/util/concurrent/TimeUnit;)V", "Lokhttp3/internal/connection/f;", "connection", "now", "g", "(Lokhttp3/internal/connection/f;J)I", "f", "()I", "d", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "call", "", "Lokhttp3/h0;", "routes", "", "requireMultiplexed", "a", "(Lokhttp3/a;Lokhttp3/internal/connection/e;Ljava/util/List;Z)Z", "Lkotlin/k2;", "h", "(Lokhttp3/internal/connection/f;)V", "c", "(Lokhttp3/internal/connection/f;)Z", "e", "()V", "b", "(J)J", "J", "keepAliveDurationNs", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "okhttp3/internal/connection/h$b", "Lokhttp3/internal/connection/h$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/h$a;", "", "<init>", "()V", "Lokhttp3/k;", "connectionPool", "Lokhttp3/internal/connection/h;", "a", "(Lokhttp3/k;)Lokhttp3/internal/connection/h;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final h a(@l k connectionPool) {
            l0.p(connectionPool, ProtectedSandApp.s("ꄠ\u0001"));
            return connectionPool.getDelegate();
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/connection/h$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends okhttp3.internal.concurrent.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(@l okhttp3.internal.concurrent.d dVar, int i4, long j4, @l TimeUnit timeUnit) {
        l0.p(dVar, ProtectedSandApp.s("ꄡ\u0001"));
        l0.p(timeUnit, ProtectedSandApp.s("ꄢ\u0001"));
        this.maxIdleConnections = i4;
        this.keepAliveDurationNs = timeUnit.toNanos(j4);
        this.cleanupQueue = dVar.j();
        this.cleanupTask = new b(android.support.v4.media.c.a(new StringBuilder(), okhttp3.internal.d.f84464i, ProtectedSandApp.s("ꄣ\u0001")));
        this.connections = new ConcurrentLinkedQueue<>();
        if (!(j4 > 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ꄤ\u0001"), j4).toString());
        }
    }

    private final int g(f connection, long now) {
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꄥ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꄦ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꄧ\u0001"));
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u4 = connection.u();
        int i4 = 0;
        while (i4 < u4.size()) {
            Reference<e> reference = u4.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                String str = ProtectedSandApp.s("ꄨ\u0001") + connection.getRoute().d().w() + ProtectedSandApp.s("ꄩ\u0001");
                okhttp3.internal.platform.j.INSTANCE.getClass();
                okhttp3.internal.platform.j.f84863a.o(str, ((e.b) reference).getCallStackTrace());
                u4.remove(i4);
                connection.J(true);
                if (u4.isEmpty()) {
                    connection.I(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return u4.size();
    }

    public final boolean a(@l okhttp3.a address, @l e call, @m List<h0> routes, boolean requireMultiplexed) {
        l0.p(address, ProtectedSandApp.s("ꄪ\u0001"));
        l0.p(call, ProtectedSandApp.s("ꄫ\u0001"));
        Iterator<f> it = this.connections.iterator();
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("ꄬ\u0001"));
            synchronized (next) {
                if (requireMultiplexed) {
                    try {
                        if (!next.C()) {
                            k2 k2Var = k2.f75408a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.A(address, routes)) {
                    call.d(next);
                    return true;
                }
                k2 k2Var2 = k2.f75408a;
            }
        }
        return false;
    }

    public final long b(long now) {
        Iterator<f> it = this.connections.iterator();
        int i4 = 0;
        long j4 = Long.MIN_VALUE;
        f fVar = null;
        int i5 = 0;
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("ꄬ\u0001"));
            synchronized (next) {
                try {
                    if (g(next, now) > 0) {
                        i5++;
                    } else {
                        i4++;
                        long idleAtNs = now - next.getIdleAtNs();
                        if (idleAtNs > j4) {
                            k2 k2Var = k2.f75408a;
                            fVar = next;
                            j4 = idleAtNs;
                        } else {
                            k2 k2Var2 = k2.f75408a;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        long j5 = this.keepAliveDurationNs;
        if (j4 < j5 && i4 <= this.maxIdleConnections) {
            if (i4 > 0) {
                return j5 - j4;
            }
            if (i5 > 0) {
                return j5;
            }
            return -1L;
        }
        l0.m(fVar);
        synchronized (fVar) {
            if (!fVar.u().isEmpty()) {
                return 0L;
            }
            if (fVar.getIdleAtNs() + j4 != now) {
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

    public final boolean c(@l f connection) {
        l0.p(connection, ProtectedSandApp.s("ꄬ\u0001"));
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꄥ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꄦ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꄧ\u0001"));
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
        l0.o(it, ProtectedSandApp.s("ꄭ\u0001"));
        while (it.hasNext()) {
            f next = it.next();
            l0.o(next, ProtectedSandApp.s("ꄬ\u0001"));
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
        int i4 = 0;
        if (concurrentLinkedQueue == null || !concurrentLinkedQueue.isEmpty()) {
            for (f fVar : concurrentLinkedQueue) {
                l0.o(fVar, ProtectedSandApp.s("ꄮ\u0001"));
                synchronized (fVar) {
                    isEmpty = fVar.u().isEmpty();
                }
                if (isEmpty && (i4 = i4 + 1) < 0) {
                    kotlin.collections.w.Y();
                }
            }
        }
        return i4;
    }

    public final void h(@l f connection) {
        l0.p(connection, ProtectedSandApp.s("ꄬ\u0001"));
        if (!okhttp3.internal.d.f84463h || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꄥ\u0001"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ꄦ\u0001"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("ꄧ\u0001"));
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }
}
