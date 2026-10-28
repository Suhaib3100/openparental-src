package okhttp3.internal.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: TaskQueue.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0013H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u00103\u001a\b\u0012\u0004\u0012\u00020\b0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\"\u00107\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010$\u001a\u0004\b5\u0010!\"\u0004\b6\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0=8F¢\u0006\u0006\u001a\u0004\b>\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Lokhttp3/internal/concurrent/c;", "", "Lokhttp3/internal/concurrent/d;", "taskRunner", "", "name", "<init>", "(Lokhttp3/internal/concurrent/d;Ljava/lang/String;)V", "Lokhttp3/internal/concurrent/a;", "task", "", "delayNanos", "Lkotlin/k2;", "n", "(Lokhttp3/internal/concurrent/a;J)V", "Lkotlin/Function0;", "block", "m", "(Ljava/lang/String;JLld/a;)V", "", "cancelable", "c", "(Ljava/lang/String;JZLld/a;)V", "Ljava/util/concurrent/CountDownLatch;", "l", "()Ljava/util/concurrent/CountDownLatch;", "recurrence", "q", "(Lokhttp3/internal/concurrent/a;JZ)Z", "a", "()V", "u", "b", "()Z", "toString", "()Ljava/lang/String;", "Z", "j", "t", "(Z)V", "shutdown", "Lokhttp3/internal/concurrent/a;", "e", "()Lokhttp3/internal/concurrent/a;", "r", "(Lokhttp3/internal/concurrent/a;)V", "activeTask", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "futureTasks", "d", "f", "s", "cancelActiveTask", "Lokhttp3/internal/concurrent/d;", "k", "()Lokhttp3/internal/concurrent/d;", "Ljava/lang/String;", "h", "", "i", "scheduledTasks", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private okhttp3.internal.concurrent.a activeTask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<okhttp3.internal.concurrent.a> futureTasks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean cancelActiveTask;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final d taskRunner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final String name;

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/internal/concurrent/c$a;", "Lokhttp3/internal/concurrent/a;", "<init>", "()V", "", "f", "()J", "Ljava/util/concurrent/CountDownLatch;", "e", "Ljava/util/concurrent/CountDownLatch;", "i", "()Ljava/util/concurrent/CountDownLatch;", "latch", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final CountDownLatch latch;

        public a() {
            super(android.support.v4.media.c.a(new StringBuilder(), okhttp3.internal.d.f84464i, ProtectedSandApp.s("ꁸ\u0001")), false);
            this.latch = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.latch.countDown();
            return -1L;
        }

        @l
        /* renamed from: i, reason: from getter */
        public final CountDownLatch getLatch() {
            return this.latch;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f84331e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f84332f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f84333g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ld.a aVar, String str, boolean z4, String str2, boolean z5) {
            super(str2, z5);
            this.f84331e = aVar;
            this.f84332f = str;
            this.f84333g = z4;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f84331e.invoke();
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/c$c", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.concurrent.c$c, reason: collision with other inner class name */
    public static final class C1313c extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f84334e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f84335f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1313c(ld.a aVar, String str, String str2) {
            super(str2, false, 2, null);
            this.f84334e = aVar;
            this.f84335f = str;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return ((Number) this.f84334e.invoke()).longValue();
        }
    }

    public c(@l d dVar, @l String str) {
        l0.p(dVar, ProtectedSandApp.s("ꁹ\u0001"));
        l0.p(str, ProtectedSandApp.s("ꁺ\u0001"));
        this.taskRunner = dVar;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j4, boolean z4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        l0.p(str, ProtectedSandApp.s("ꁺ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꁻ\u0001"));
        cVar.n(new b(aVar, str, z5, str, z5), j4);
    }

    public static /* synthetic */ void o(c cVar, String str, long j4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        l0.p(str, ProtectedSandApp.s("ꁺ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꁻ\u0001"));
        cVar.n(new C1313c(aVar, str, str), j4);
    }

    public static /* synthetic */ void p(c cVar, okhttp3.internal.concurrent.a aVar, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        cVar.n(aVar, j4);
    }

    public final void a() {
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꁼ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꁽ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꁾ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.taskRunner) {
            try {
                if (b()) {
                    this.taskRunner.i(this);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        okhttp3.internal.concurrent.a aVar = this.activeTask;
        if (aVar != null) {
            l0.m(aVar);
            if (aVar.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z4 = false;
        for (int size = this.futureTasks.size() - 1; size >= 0; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                okhttp3.internal.concurrent.a aVar2 = this.futureTasks.get(size);
                d.INSTANCE.getClass();
                if (d.f84337i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(aVar2, this, ProtectedSandApp.s("ꁿ\u0001"));
                }
                this.futureTasks.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(@l String name, long delayNanos, boolean cancelable, @l ld.a<k2> block) {
        l0.p(name, ProtectedSandApp.s("ꁺ\u0001"));
        l0.p(block, ProtectedSandApp.s("ꁻ\u0001"));
        n(new b(block, name, cancelable, name, cancelable), delayNanos);
    }

    @m
    /* renamed from: e, reason: from getter */
    public final okhttp3.internal.concurrent.a getActiveTask() {
        return this.activeTask;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    @l
    public final List<okhttp3.internal.concurrent.a> g() {
        return this.futureTasks;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    public final List<okhttp3.internal.concurrent.a> i() {
        List<okhttp3.internal.concurrent.a> V5;
        synchronized (this.taskRunner) {
            V5 = w.V5(this.futureTasks);
        }
        return V5;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final d getTaskRunner() {
        return this.taskRunner;
    }

    @l
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

    public final void m(@l String name, long delayNanos, @l ld.a<Long> block) {
        l0.p(name, ProtectedSandApp.s("ꁺ\u0001"));
        l0.p(block, ProtectedSandApp.s("ꁻ\u0001"));
        n(new C1313c(block, name, name), delayNanos);
    }

    public final void n(@l okhttp3.internal.concurrent.a task, long delayNanos) {
        l0.p(task, ProtectedSandApp.s("ꂀ\u0001"));
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (q(task, delayNanos, false)) {
                    this.taskRunner.i(this);
                }
                k2 k2Var = k2.f75408a;
            } else if (task.getCancelable()) {
                d.INSTANCE.getClass();
                if (d.f84337i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(task, this, ProtectedSandApp.s("ꂁ\u0001"));
                }
            } else {
                d.INSTANCE.getClass();
                if (d.f84337i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(task, this, ProtectedSandApp.s("ꂂ\u0001"));
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean q(@l okhttp3.internal.concurrent.a task, long delayNanos, boolean recurrence) {
        String str;
        l0.p(task, ProtectedSandApp.s("ꂀ\u0001"));
        task.e(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j4 = nanoTime + delayNanos;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j4) {
                d.INSTANCE.getClass();
                if (d.f84337i.isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(task, this, ProtectedSandApp.s("ꂃ\u0001"));
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.g(j4);
        d.INSTANCE.getClass();
        if (d.f84337i.isLoggable(Level.FINE)) {
            if (recurrence) {
                str = ProtectedSandApp.s("ꂄ\u0001") + okhttp3.internal.concurrent.b.b(j4 - nanoTime);
            } else {
                str = ProtectedSandApp.s("ꂅ\u0001") + okhttp3.internal.concurrent.b.b(j4 - nanoTime);
            }
            okhttp3.internal.concurrent.b.c(task, this, str);
        }
        Iterator<okhttp3.internal.concurrent.a> it = this.futureTasks.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - nanoTime > delayNanos) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = this.futureTasks.size();
        }
        this.futureTasks.add(i4, task);
        return i4 == 0;
    }

    public final void r(@m okhttp3.internal.concurrent.a aVar) {
        this.activeTask = aVar;
    }

    public final void s(boolean z4) {
        this.cancelActiveTask = z4;
    }

    public final void t(boolean z4) {
        this.shutdown = z4;
    }

    @l
    public String toString() {
        return this.name;
    }

    public final void u() {
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꁼ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꁽ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꁾ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (b()) {
                    this.taskRunner.i(this);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
