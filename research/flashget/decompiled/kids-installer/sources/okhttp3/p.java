package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.m2;
import okhttp3.internal.connection.e;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u00020\u001e¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R.\u00101\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001e\u00107\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00108\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0011\u0010:\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b5\u0010 ¨\u0006>"}, d2 = {"Lokhttp3/p;", "", "", "host", "Lokhttp3/internal/connection/e$a;", "Lokhttp3/internal/connection/e;", "f", "", "m", "T", "Ljava/util/Deque;", "calls", "call", "Lkotlin/m2;", "g", "(Ljava/util/Deque;Ljava/lang/Object;)V", "c", "(Lokhttp3/internal/connection/e$a;)V", "b", "d", "(Lokhttp3/internal/connection/e;)V", "h", "i", "", "Lokhttp3/e;", "n", "p", "", "o", "q", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "I", "k", "()I", "s", "(I)V", "maxRequestsPerHost", "l", "t", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "j", "()Ljava/lang/Runnable;", "r", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "e", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "executorService", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
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
            if (kotlin.jvm.internal.l0.g(next.d(), host)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (kotlin.jvm.internal.l0.g(next2.d(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void g(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError(ProtectedSandApp.s("暘"));
            }
            runnable = this.idleCallback;
            m2 m2Var = m2.f23662a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean m() {
        int i5;
        boolean z5;
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("暙"));
            Thread currentThread = Thread.currentThread();
            kotlin.jvm.internal.l0.o(currentThread, ProtectedSandApp.s("暚"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("暛"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.readyAsyncCalls.iterator();
            kotlin.jvm.internal.l0.o(it, ProtectedSandApp.s("暜"));
            while (it.hasNext()) {
                e.a next = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    kotlin.jvm.internal.l0.o(next, ProtectedSandApp.s("暝"));
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z5 = q() > 0;
            m2 m2Var = m2.f23662a;
        }
        int size = arrayList.size();
        for (i5 = 0; i5 < size; i5++) {
            ((e.a) arrayList.get(i5)).a(e());
        }
        return z5;
    }

    @p3.i(name = "-deprecated_executorService")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "executorService", imports = {}))
    @d5.d
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        Iterator<e.a> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getF30875q().cancel();
        }
        Iterator<e.a> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getF30875q().cancel();
        }
        Iterator<okhttp3.internal.connection.e> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void c(@d5.d e.a call) {
        e.a f6;
        kotlin.jvm.internal.l0.p(call, ProtectedSandApp.s("暞"));
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getF30875q().getForWebSocket() && (f6 = f(call.d())) != null) {
                call.f(f6);
            }
            m2 m2Var = m2.f23662a;
        }
        m();
    }

    public final synchronized void d(@d5.d okhttp3.internal.connection.e call) {
        kotlin.jvm.internal.l0.p(call, ProtectedSandApp.s("暟"));
        this.runningSyncCalls.add(call);
    }

    @p3.i(name = "executorService")
    @d5.d
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), okhttp3.internal.d.U(okhttp3.internal.d.f30937i + ProtectedSandApp.s("暠"), false));
        }
        executorService = this.executorServiceOrNull;
        kotlin.jvm.internal.l0.m(executorService);
        return executorService;
    }

    public final void h(@d5.d e.a call) {
        kotlin.jvm.internal.l0.p(call, ProtectedSandApp.s("暡"));
        call.getCallsPerHost().decrementAndGet();
        g(this.runningAsyncCalls, call);
    }

    public final void i(@d5.d okhttp3.internal.connection.e call) {
        kotlin.jvm.internal.l0.p(call, ProtectedSandApp.s("暢"));
        g(this.runningSyncCalls, call);
    }

    @d5.e
    public final synchronized Runnable j() {
        return this.idleCallback;
    }

    public final synchronized int k() {
        return this.maxRequests;
    }

    public final synchronized int l() {
        return this.maxRequestsPerHost;
    }

    @d5.d
    public final synchronized List<e> n() {
        int b02;
        List<e> unmodifiableList;
        ArrayDeque<e.a> arrayDeque = this.readyAsyncCalls;
        b02 = kotlin.collections.b0.b0(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).getF30875q());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("暣"));
        return unmodifiableList;
    }

    public final synchronized int o() {
        return this.readyAsyncCalls.size();
    }

    @d5.d
    public final synchronized List<e> p() {
        int b02;
        List D4;
        List<e> unmodifiableList;
        ArrayDeque<okhttp3.internal.connection.e> arrayDeque = this.runningSyncCalls;
        ArrayDeque<e.a> arrayDeque2 = this.runningAsyncCalls;
        b02 = kotlin.collections.b0.b0(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).getF30875q());
        }
        D4 = kotlin.collections.j0.D4(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(D4);
        kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("暤"));
        return unmodifiableList;
    }

    public final synchronized int q() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void r(@d5.e Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void s(int i5) {
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("暥"), i5).toString());
        }
        synchronized (this) {
            this.maxRequests = i5;
            m2 m2Var = m2.f23662a;
        }
        m();
    }

    public final void t(int i5) {
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("暦"), i5).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i5;
            m2 m2Var = m2.f23662a;
        }
        m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@d5.d ExecutorService executorService) {
        this();
        kotlin.jvm.internal.l0.p(executorService, ProtectedSandApp.s("暗"));
        this.executorServiceOrNull = executorService;
    }
}
