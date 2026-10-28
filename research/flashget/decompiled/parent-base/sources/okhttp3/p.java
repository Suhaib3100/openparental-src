package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.x0;
import okhttp3.internal.connection.e;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010!J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020#2\u0006\u0010)\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010*\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R*\u0010.\u001a\u00020#2\u0006\u0010.\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b/\u0010%\"\u0004\b0\u0010-R.\u00108\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00109R\u001e\u0010>\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b<\u0010(¨\u0006A"}, d2 = {"Lokhttp3/p;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "", "host", "Lokhttp3/internal/connection/e$a;", "Lokhttp3/internal/connection/e;", "f", "(Ljava/lang/String;)Lokhttp3/internal/connection/e$a;", "", "m", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "Lkotlin/k2;", "g", "(Ljava/util/Deque;Ljava/lang/Object;)V", "c", "(Lokhttp3/internal/connection/e$a;)V", "b", "d", "(Lokhttp3/internal/connection/e;)V", "h", "i", "", "Lokhttp3/e;", "n", "()Ljava/util/List;", "p", "", "o", "()I", "q", "a", "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "I", "k", "s", "(I)V", "maxRequestsPerHost", "l", "t", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "j", "()Ljava/lang/Runnable;", "r", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "e", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Runnable idleCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorServiceOrNull;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<e.a> readyAsyncCalls;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<e.a> runningAsyncCalls;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<okhttp3.internal.connection.e> runningSyncCalls;

    public p() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final e.a f(String host) {
        Iterator<e.a> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (l0.g(next.d(), host)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (l0.g(next2.d(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void g(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError(ProtectedSandApp.s("ꇷ\u0001"));
            }
            runnable = this.idleCallback;
            k2 k2Var = k2.f75408a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean m() {
        int i4;
        boolean z4;
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꇸ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꇹ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꇺ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e.a> it = this.readyAsyncCalls.iterator();
                l0.o(it, ProtectedSandApp.s("ꇻ\u0001"));
                while (it.hasNext()) {
                    e.a next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        l0.o(next, ProtectedSandApp.s("ꇼ\u0001"));
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                z4 = q() > 0;
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i4 = 0; i4 < size; i4++) {
            ((e.a) arrayList.get(i4)).a(e());
        }
        return z4;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "executorService", imports = {}))
    @kd.i(name = "-deprecated_executorService")
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        try {
            Iterator<e.a> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().getF84402d().cancel();
            }
            Iterator<e.a> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().getF84402d().cancel();
            }
            Iterator<okhttp3.internal.connection.e> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(@fg.l e.a call) {
        e.a f4;
        l0.p(call, ProtectedSandApp.s("ꇽ\u0001"));
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(call);
                if (!call.getF84402d().getForWebSocket() && (f4 = f(call.d())) != null) {
                    call.f(f4);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        m();
    }

    public final synchronized void d(@fg.l okhttp3.internal.connection.e call) {
        l0.p(call, ProtectedSandApp.s("ꇽ\u0001"));
        this.runningSyncCalls.add(call);
    }

    @fg.l
    @kd.i(name = "executorService")
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), okhttp3.internal.d.U(okhttp3.internal.d.f84464i + ProtectedSandApp.s("ꇾ\u0001"), false));
            }
            executorService = this.executorServiceOrNull;
            l0.m(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void h(@fg.l e.a call) {
        l0.p(call, ProtectedSandApp.s("ꇽ\u0001"));
        call.getCallsPerHost().decrementAndGet();
        g(this.runningAsyncCalls, call);
    }

    public final void i(@fg.l okhttp3.internal.connection.e call) {
        l0.p(call, ProtectedSandApp.s("ꇽ\u0001"));
        g(this.runningSyncCalls, call);
    }

    @fg.m
    public final synchronized Runnable j() {
        return this.idleCallback;
    }

    public final synchronized int k() {
        return this.maxRequests;
    }

    public final synchronized int l() {
        return this.maxRequestsPerHost;
    }

    @fg.l
    public final synchronized List<e> n() {
        List<e> unmodifiableList;
        try {
            ArrayDeque<e.a> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).getF84402d());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            l0.o(unmodifiableList, ProtectedSandApp.s("ꇿ\u0001"));
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int o() {
        return this.readyAsyncCalls.size();
    }

    @fg.l
    public final synchronized List<e> p() {
        List<e> unmodifiableList;
        try {
            ArrayDeque<okhttp3.internal.connection.e> arrayDeque = this.runningSyncCalls;
            ArrayDeque<e.a> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).getF84402d());
            }
            unmodifiableList = Collections.unmodifiableList(kotlin.collections.w.D4(arrayDeque, arrayList));
            l0.o(unmodifiableList, ProtectedSandApp.s("ꇿ\u0001"));
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int q() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void r(@fg.m Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void s(int i4) {
        if (!(i4 >= 1)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ꈀ\u0001"), i4).toString());
        }
        synchronized (this) {
            this.maxRequests = i4;
            k2 k2Var = k2.f75408a;
        }
        m();
    }

    public final void t(int i4) {
        if (!(i4 >= 1)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ꈀ\u0001"), i4).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i4;
            k2 k2Var = k2.f75408a;
        }
        m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@fg.l ExecutorService executorService) {
        this();
        l0.p(executorService, ProtectedSandApp.s("ꇶ\u0001"));
        this.executorServiceOrNull = executorService;
    }
}
