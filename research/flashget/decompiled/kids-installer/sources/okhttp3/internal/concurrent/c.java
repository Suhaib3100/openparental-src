package okhttp3.internal.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: TaskQueue.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u00102\u001a\u00020.\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\bø\u0001\u0000J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\u0011\u001a\u00020\u0010J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\bH\u0016R\"\u0010\u001e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\"\u0010-\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001dR\u001a\u00102\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b0\u00101R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b4\u00105R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002068F¢\u0006\u0006\u001a\u0004\b7\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Lokhttp3/internal/concurrent/c;", "", "Lokhttp3/internal/concurrent/a;", "task", "", "delayNanos", "Lkotlin/m2;", "n", "", "name", "Lkotlin/Function0;", "block", "m", "", "cancelable", "c", "Ljava/util/concurrent/CountDownLatch;", "l", "recurrence", "q", "(Lokhttp3/internal/concurrent/a;JZ)Z", "a", "u", "b", "()Z", "toString", "Z", "j", "t", "(Z)V", "shutdown", "Lokhttp3/internal/concurrent/a;", "e", "()Lokhttp3/internal/concurrent/a;", "r", "(Lokhttp3/internal/concurrent/a;)V", "activeTask", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "futureTasks", "d", "f", "s", "cancelActiveTask", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/d;", "k", "()Lokhttp3/internal/concurrent/d;", "taskRunner", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "", "i", "scheduledTasks", "<init>", "(Lokhttp3/internal/concurrent/d;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private okhttp3.internal.concurrent.a activeTask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<okhttp3.internal.concurrent.a> futureTasks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean cancelActiveTask;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d taskRunner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/internal/concurrent/c$a;", "Lokhttp3/internal/concurrent/a;", "", "f", "Ljava/util/concurrent/CountDownLatch;", "e", "Ljava/util/concurrent/CountDownLatch;", "i", "()Ljava/util/concurrent/CountDownLatch;", "latch", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final CountDownLatch latch;

        public a() {
            super(androidx.concurrent.futures.a.a(new StringBuilder(), okhttp3.internal.d.f30937i, ProtectedSandApp.s("慦")), false);
            this.latch = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.latch.countDown();
            return -1L;
        }

        @d5.d
        /* renamed from: i, reason: from getter */
        public final CountDownLatch getLatch() {
            return this.latch;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q3.a f30810e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30811f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f30812g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q3.a aVar, String str, boolean z5, String str2, boolean z6) {
            super(str2, z6);
            this.f30810e = aVar;
            this.f30811f = str;
            this.f30812g = z5;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f30810e.n();
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/c$c", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.c$c, reason: collision with other inner class name */
    public static final class C0474c extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q3.a f30813e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30814f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0474c(q3.a aVar, String str, String str2) {
            super(str2, false, 2, null);
            this.f30813e = aVar;
            this.f30814f = str;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return ((Number) this.f30813e.n()).longValue();
        }
    }

    public c(@d5.d d dVar, @d5.d String str) {
        l0.p(dVar, ProtectedSandApp.s("慧"));
        l0.p(str, ProtectedSandApp.s("慨"));
        this.taskRunner = dVar;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j5, boolean z5, q3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        l0.p(str, ProtectedSandApp.s("慩"));
        l0.p(aVar, ProtectedSandApp.s("慪"));
        cVar.n(new b(aVar, str, z6, str, z6), j5);
    }

    public static /* synthetic */ void o(c cVar, String str, long j5, q3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        l0.p(str, ProtectedSandApp.s("慫"));
        l0.p(aVar, ProtectedSandApp.s("慬"));
        cVar.n(new C0474c(aVar, str, str), j5);
    }

    public static /* synthetic */ void p(c cVar, okhttp3.internal.concurrent.a aVar, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        cVar.n(aVar, j5);
    }

    public final void a() {
        if (!okhttp3.internal.d.f30936h || !Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                if (b()) {
                    this.taskRunner.i(this);
                }
                m2 m2Var = m2.f23662a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("慭"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("慮"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("慯"));
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final boolean b() {
        okhttp3.internal.concurrent.a aVar = this.activeTask;
        if (aVar != null) {
            l0.m(aVar);
            if (aVar.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z5 = false;
        for (int size = this.futureTasks.size() - 1; size >= 0; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                okhttp3.internal.concurrent.a aVar2 = this.futureTasks.get(size);
                d.INSTANCE.getClass();
                if (d.f30816i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(aVar2, this, ProtectedSandApp.s("慰"));
                }
                this.futureTasks.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    public final void c(@d5.d String str, long j5, boolean z5, @d5.d q3.a<m2> aVar) {
        l0.p(str, ProtectedSandApp.s("慱"));
        l0.p(aVar, ProtectedSandApp.s("慲"));
        n(new b(aVar, str, z5, str, z5), j5);
    }

    @e
    /* renamed from: e, reason: from getter */
    public final okhttp3.internal.concurrent.a getActiveTask() {
        return this.activeTask;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    @d5.d
    public final List<okhttp3.internal.concurrent.a> g() {
        return this.futureTasks;
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @d5.d
    public final List<okhttp3.internal.concurrent.a> i() {
        List<okhttp3.internal.concurrent.a> V5;
        synchronized (this.taskRunner) {
            V5 = j0.V5(this.futureTasks);
        }
        return V5;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    @d5.d
    /* renamed from: k, reason: from getter */
    public final d getTaskRunner() {
        return this.taskRunner;
    }

    @d5.d
    public final CountDownLatch l() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            okhttp3.internal.concurrent.a aVar = this.activeTask;
            if (aVar instanceof a) {
                return ((a) aVar).getLatch();
            }
            for (okhttp3.internal.concurrent.a aVar2 : this.futureTasks) {
                if (aVar2 instanceof a) {
                    return ((a) aVar2).getLatch();
                }
            }
            a aVar3 = new a();
            if (q(aVar3, 0L, false)) {
                this.taskRunner.i(this);
            }
            return aVar3.getLatch();
        }
    }

    public final void m(@d5.d String str, long j5, @d5.d q3.a<Long> aVar) {
        l0.p(str, ProtectedSandApp.s("慳"));
        l0.p(aVar, ProtectedSandApp.s("慴"));
        n(new C0474c(aVar, str, str), j5);
    }

    public final void n(@d5.d okhttp3.internal.concurrent.a aVar, long j5) {
        l0.p(aVar, ProtectedSandApp.s("慵"));
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (q(aVar, j5, false)) {
                    this.taskRunner.i(this);
                }
                m2 m2Var = m2.f23662a;
            } else if (aVar.getCancelable()) {
                d.INSTANCE.getClass();
                if (d.f30816i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(aVar, this, ProtectedSandApp.s("慶"));
                }
            } else {
                d.INSTANCE.getClass();
                if (d.f30816i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(aVar, this, ProtectedSandApp.s("慷"));
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean q(@d5.d okhttp3.internal.concurrent.a task, long delayNanos, boolean recurrence) {
        String str;
        l0.p(task, ProtectedSandApp.s("慸"));
        task.e(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j5 = nanoTime + delayNanos;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j5) {
                d.INSTANCE.getClass();
                if (d.f30816i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(task, this, ProtectedSandApp.s("慹"));
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.g(j5);
        d.INSTANCE.getClass();
        if (d.f30816i.isLoggable(Level.FINE)) {
            if (recurrence) {
                str = ProtectedSandApp.s("慺") + okhttp3.internal.concurrent.b.b(j5 - nanoTime);
            } else {
                str = ProtectedSandApp.s("慻") + okhttp3.internal.concurrent.b.b(j5 - nanoTime);
            }
            okhttp3.internal.concurrent.b.c(task, this, str);
        }
        Iterator<okhttp3.internal.concurrent.a> it = this.futureTasks.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - nanoTime > delayNanos) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            i5 = this.futureTasks.size();
        }
        this.futureTasks.add(i5, task);
        return i5 == 0;
    }

    public final void r(@e okhttp3.internal.concurrent.a aVar) {
        this.activeTask = aVar;
    }

    public final void s(boolean z5) {
        this.cancelActiveTask = z5;
    }

    public final void t(boolean z5) {
        this.shutdown = z5;
    }

    @d5.d
    public String toString() {
        return this.name;
    }

    public final void u() {
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("慼"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("慽"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("慾"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (b()) {
                this.taskRunner.i(this);
            }
            m2 m2Var = m2.f23662a;
        }
    }
}
