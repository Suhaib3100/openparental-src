package okhttp3.internal.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: TaskRunner.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0003\u001e\"\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lokhttp3/internal/concurrent/d;", "", "Lokhttp3/internal/concurrent/d$a;", "backend", "<init>", "(Lokhttp3/internal/concurrent/d$a;)V", "Lokhttp3/internal/concurrent/a;", "task", "Lkotlin/k2;", "f", "(Lokhttp3/internal/concurrent/a;)V", "k", "", "delayNanos", "d", "(Lokhttp3/internal/concurrent/a;J)V", "Lokhttp3/internal/concurrent/c;", "taskQueue", "i", "(Lokhttp3/internal/concurrent/c;)V", "e", "()Lokhttp3/internal/concurrent/a;", "j", "()Lokhttp3/internal/concurrent/c;", "", "c", "()Ljava/util/List;", "g", "()V", "", "a", "I", "nextQueueName", "", "b", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Lokhttp3/internal/concurrent/d$a;", "h", "()Lokhttp3/internal/concurrent/d$a;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final Logger f84337i;

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
    @l
    private final a backend;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @l
    @f
    public static final d f84336h = new d(new c(okhttp3.internal.d.U(okhttp3.internal.d.f84464i + ProtectedSandApp.s("ꂌ\u0001"), true)));

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/concurrent/d$a;", "", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/k2;", "c", "(Lokhttp3/internal/concurrent/d;)V", "", "nanoTime", "()J", "a", "nanos", "b", "(Lokhttp3/internal/concurrent/d;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void a(@l d taskRunner);

        void b(@l d taskRunner, long nanos);

        void c(@l d taskRunner);

        void execute(@l Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/concurrent/d$b;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/d;", "INSTANCE", "Lokhttp3/internal/concurrent/d;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final Logger a() {
            return d.f84337i;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/concurrent/d$c;", "Lokhttp3/internal/concurrent/d$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/k2;", "c", "(Lokhttp3/internal/concurrent/d;)V", "", "nanoTime", "()J", "a", "nanos", "b", "(Lokhttp3/internal/concurrent/d;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "d", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        public c(@l ThreadFactory threadFactory) {
            l0.p(threadFactory, ProtectedSandApp.s("ꂆ\u0001"));
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void a(@l d taskRunner) {
            l0.p(taskRunner, ProtectedSandApp.s("ꂇ\u0001"));
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void b(@l d taskRunner, long nanos) throws InterruptedException {
            l0.p(taskRunner, ProtectedSandApp.s("ꂇ\u0001"));
            long j4 = nanos / 1000000;
            long j5 = nanos - (1000000 * j4);
            if (j4 > 0 || nanos > 0) {
                taskRunner.wait(j4, (int) j5);
            }
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void c(@l d taskRunner) {
            l0.p(taskRunner, ProtectedSandApp.s("ꂇ\u0001"));
        }

        public final void d() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void execute(@l Runnable runnable) {
            l0.p(runnable, ProtectedSandApp.s("ꂈ\u0001"));
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/d$d", "Ljava/lang/Runnable;", "Lkotlin/k2;", "run", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.d$d, reason: collision with other inner class name */
    public static final class RunnableC1314d implements Runnable {
        RunnableC1314d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.internal.concurrent.a e4;
            long j4;
            while (true) {
                synchronized (d.this) {
                    e4 = d.this.e();
                }
                if (e4 == null) {
                    return;
                }
                okhttp3.internal.concurrent.c queue = e4.getQueue();
                l0.m(queue);
                d.INSTANCE.getClass();
                boolean isLoggable = d.f84337i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j4 = queue.getTaskRunner().getBackend().nanoTime();
                    b.c(e4, queue, ProtectedSandApp.s("ꂉ\u0001"));
                } else {
                    j4 = -1;
                }
                try {
                    try {
                        d.this.k(e4);
                        k2 k2Var = k2.f75408a;
                        if (isLoggable) {
                            b.c(e4, queue, ProtectedSandApp.s("ꂊ\u0001") + b.b(queue.getTaskRunner().getBackend().nanoTime() - j4));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        b.c(e4, queue, ProtectedSandApp.s("ꂋ\u0001") + b.b(queue.getTaskRunner().getBackend().nanoTime() - j4));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        l0.o(logger, ProtectedSandApp.s("ꂍ\u0001"));
        f84337i = logger;
    }

    public d(@l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("ꂎ\u0001"));
        this.backend = aVar;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new RunnableC1314d();
    }

    private final void d(okhttp3.internal.concurrent.a task, long delayNanos) {
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂏ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꂐ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꂑ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        okhttp3.internal.concurrent.c queue = task.getQueue();
        l0.m(queue);
        if (!(queue.getActiveTask() == task)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꂒ\u0001"));
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.s(false);
        queue.r(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.q(task, delayNanos, true);
        }
        if (queue.g().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    private final void f(okhttp3.internal.concurrent.a task) {
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂏ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꂐ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꂑ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        task.g(-1L);
        okhttp3.internal.concurrent.c queue = task.getQueue();
        l0.m(queue);
        queue.g().remove(task);
        this.readyQueues.remove(queue);
        queue.r(task);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(okhttp3.internal.concurrent.a task) {
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂏ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꂐ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꂓ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        l0.o(currentThread2, ProtectedSandApp.s("ꂔ\u0001"));
        String name = currentThread2.getName();
        currentThread2.setName(task.getName());
        try {
            long f4 = task.f();
            synchronized (this) {
                d(task, f4);
                k2 k2Var = k2.f75408a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                d(task, -1L);
                k2 k2Var2 = k2.f75408a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    @l
    public final List<okhttp3.internal.concurrent.c> c() {
        List<okhttp3.internal.concurrent.c> D4;
        synchronized (this) {
            D4 = kotlin.collections.w.D4(this.busyQueues, this.readyQueues);
        }
        return D4;
    }

    @m
    public final okhttp3.internal.concurrent.a e() {
        boolean z4;
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂏ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꂐ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꂑ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            Iterator<okhttp3.internal.concurrent.c> it = this.readyQueues.iterator();
            long j4 = Long.MAX_VALUE;
            okhttp3.internal.concurrent.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                okhttp3.internal.concurrent.a aVar2 = it.next().g().get(0);
                long max = Math.max(0L, aVar2.getNextExecuteNanoTime() - nanoTime);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (aVar != null) {
                        z4 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z4 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return aVar;
            }
            if (this.coordinatorWaiting) {
                if (j4 < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.a(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = nanoTime + j4;
            try {
                try {
                    this.backend.b(this, j4);
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

    @l
    /* renamed from: h, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    public final void i(@l okhttp3.internal.concurrent.c taskQueue) {
        l0.p(taskQueue, ProtectedSandApp.s("ꂕ\u0001"));
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂏ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꂐ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꂑ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.g().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                okhttp3.internal.d.a(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.a(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    @l
    public final okhttp3.internal.concurrent.c j() {
        int i4;
        synchronized (this) {
            i4 = this.nextQueueName;
            this.nextQueueName = i4 + 1;
        }
        return new okhttp3.internal.concurrent.c(this, android.support.v4.media.a.a(ProtectedSandApp.s("ꂖ\u0001"), i4));
    }
}
