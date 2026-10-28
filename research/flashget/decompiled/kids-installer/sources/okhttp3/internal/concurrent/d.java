package okhttp3.internal.concurrent;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import p3.f;

/* compiled from: TaskRunner.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0014\u0018\u0011B\u000f\u0012\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0006\u0010\u0012\u001a\u00020\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lokhttp3/internal/concurrent/d;", "", "Lokhttp3/internal/concurrent/a;", "task", "Lkotlin/m2;", "f", "k", "", "delayNanos", "d", "Lokhttp3/internal/concurrent/c;", "taskQueue", "i", "(Lokhttp3/internal/concurrent/c;)V", "e", "j", "", "c", "g", "", "a", "I", "nextQueueName", "", "b", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Lokhttp3/internal/concurrent/d$a;", "Lokhttp3/internal/concurrent/d$a;", "h", "()Lokhttp3/internal/concurrent/d$a;", "backend", "<init>", "(Lokhttp3/internal/concurrent/d$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final Logger f30816i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int nextQueueName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatorWaiting;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long coordinatorWakeUpAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<okhttp3.internal.concurrent.c> busyQueues;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<okhttp3.internal.concurrent.c> readyQueues;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a backend;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @f
    public static final d f30815h = new d(new c(okhttp3.internal.d.U(okhttp3.internal.d.f30937i + ProtectedSandApp.s("憇"), true)));

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/concurrent/d$a;", "", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/m2;", "c", "", "nanoTime", "a", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void a(@d5.d d dVar);

        void b(@d5.d d dVar, long j5);

        void c(@d5.d d dVar);

        void execute(@d5.d Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lokhttp3/internal/concurrent/d$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/d;", "INSTANCE", "Lokhttp3/internal/concurrent/d;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final Logger a() {
            return d.f30816i;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/concurrent/d$c;", "Lokhttp3/internal/concurrent/d$a;", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/m2;", "c", "", "nanoTime", "a", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "d", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        public c(@d5.d ThreadFactory threadFactory) {
            l0.p(threadFactory, ProtectedSandApp.s("慿"));
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void a(@d5.d d dVar) {
            l0.p(dVar, ProtectedSandApp.s("憀"));
            dVar.notify();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void b(@d5.d d dVar, long j5) throws InterruptedException {
            l0.p(dVar, ProtectedSandApp.s("憁"));
            long j6 = j5 / 1000000;
            long j7 = j5 - (1000000 * j6);
            if (j6 > 0 || j5 > 0) {
                dVar.wait(j6, (int) j7);
            }
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void c(@d5.d d dVar) {
            l0.p(dVar, ProtectedSandApp.s("憂"));
        }

        public final void d() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void execute(@d5.d Runnable runnable) {
            l0.p(runnable, ProtectedSandApp.s("憃"));
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/d$d", "Ljava/lang/Runnable;", "Lkotlin/m2;", "run", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.d$d, reason: collision with other inner class name */
    public static final class RunnableC0475d implements Runnable {
        RunnableC0475d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.internal.concurrent.a e6;
            long j5;
            while (true) {
                synchronized (d.this) {
                    e6 = d.this.e();
                }
                if (e6 == null) {
                    return;
                }
                okhttp3.internal.concurrent.c queue = e6.getQueue();
                l0.m(queue);
                d.INSTANCE.getClass();
                boolean isLoggable = d.f30816i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j5 = queue.k().getBackend().nanoTime();
                    b.c(e6, queue, ProtectedSandApp.s("憄"));
                } else {
                    j5 = -1;
                }
                try {
                    try {
                        d.this.k(e6);
                        m2 m2Var = m2.f23662a;
                        if (isLoggable) {
                            b.c(e6, queue, ProtectedSandApp.s("憅") + b.b(queue.k().getBackend().nanoTime() - j5));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        b.c(e6, queue, ProtectedSandApp.s("憆") + b.b(queue.k().getBackend().nanoTime() - j5));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        l0.o(logger, ProtectedSandApp.s("憈"));
        f30816i = logger;
    }

    public d(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("憉"));
        this.backend = aVar;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new RunnableC0475d();
    }

    private final void d(okhttp3.internal.concurrent.a aVar, long j5) {
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憊"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("憋"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("憌"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        okhttp3.internal.concurrent.c queue = aVar.getQueue();
        l0.m(queue);
        if (!(queue.e() == aVar)) {
            throw new IllegalStateException(ProtectedSandApp.s("憍").toString());
        }
        boolean f6 = queue.f();
        queue.s(false);
        queue.r(null);
        this.busyQueues.remove(queue);
        if (j5 != -1 && !f6 && !queue.j()) {
            queue.q(aVar, j5, true);
        }
        if (!queue.g().isEmpty()) {
            this.readyQueues.add(queue);
        }
    }

    private final void f(okhttp3.internal.concurrent.a aVar) {
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憎"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("憏"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("憐"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        aVar.g(-1L);
        okhttp3.internal.concurrent.c queue = aVar.getQueue();
        l0.m(queue);
        queue.g().remove(aVar);
        this.readyQueues.remove(queue);
        queue.r(aVar);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(okhttp3.internal.concurrent.a aVar) {
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憑"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("憒"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("憓"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        l0.o(currentThread2, ProtectedSandApp.s("憔"));
        String name = currentThread2.getName();
        currentThread2.setName(aVar.getName());
        try {
            long f6 = aVar.f();
            synchronized (this) {
                d(aVar, f6);
                m2 m2Var = m2.f23662a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                d(aVar, -1L);
                m2 m2Var2 = m2.f23662a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    @d5.d
    public final List<okhttp3.internal.concurrent.c> c() {
        List<okhttp3.internal.concurrent.c> D4;
        synchronized (this) {
            D4 = j0.D4(this.busyQueues, this.readyQueues);
        }
        return D4;
    }

    @e
    public final okhttp3.internal.concurrent.a e() {
        boolean z5;
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憕"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("憖"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("憗"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            Iterator<okhttp3.internal.concurrent.c> it = this.readyQueues.iterator();
            long j5 = Long.MAX_VALUE;
            okhttp3.internal.concurrent.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                okhttp3.internal.concurrent.a aVar2 = it.next().g().get(0);
                long max = Math.max(0L, aVar2.getNextExecuteNanoTime() - nanoTime);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar != null) {
                        z5 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z5 || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                    this.backend.execute(this.runnable);
                }
                return aVar;
            }
            if (this.coordinatorWaiting) {
                if (j5 < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.a(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = nanoTime + j5;
            try {
                try {
                    this.backend.b(this, j5);
                } catch (InterruptedException unused) {
                    g();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void g() {
        for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
            this.busyQueues.get(size).b();
        }
        for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
            okhttp3.internal.concurrent.c cVar = this.readyQueues.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    public final void i(@d5.d okhttp3.internal.concurrent.c taskQueue) {
        l0.p(taskQueue, ProtectedSandApp.s("憘"));
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憙"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("憚"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("憛"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.e() == null) {
            if (!taskQueue.g().isEmpty()) {
                okhttp3.internal.d.a(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.a(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    @d5.d
    public final okhttp3.internal.concurrent.c j() {
        int i5;
        synchronized (this) {
            i5 = this.nextQueueName;
            this.nextQueueName = i5 + 1;
        }
        return new okhttp3.internal.concurrent.c(this, s.a(ProtectedSandApp.s("憜"), i5));
    }
}
