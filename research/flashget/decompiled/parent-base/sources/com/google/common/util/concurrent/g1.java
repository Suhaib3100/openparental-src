package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.o0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MoreExecutors.java */
@b0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class g1 {

    /* compiled from: MoreExecutors.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f57843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f57844c;

        a(BlockingQueue blockingQueue, ListenableFuture listenableFuture) {
            this.f57843b = blockingQueue;
            this.f57844c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57843b.add(this.f57844c);
        }
    }

    /* compiled from: MoreExecutors.java */
    class b implements Executor {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f57845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.u0 f57846c;

        b(Executor executor, com.google.common.base.u0 u0Var) {
            this.f57845b = executor;
            this.f57846c = u0Var;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f57845b.execute(w.k(runnable, this.f57846c));
        }
    }

    /* compiled from: MoreExecutors.java */
    class c extends l2 {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.u0 f57847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExecutorService executorService, com.google.common.base.u0 u0Var) {
            super(executorService);
            this.f57847c = u0Var;
        }

        @Override // com.google.common.util.concurrent.l2
        protected Runnable c(Runnable runnable) {
            return w.k(runnable, this.f57847c);
        }

        @Override // com.google.common.util.concurrent.l2
        protected <T> Callable<T> d(Callable<T> callable) {
            return w.l(callable, this.f57847c);
        }
    }

    /* compiled from: MoreExecutors.java */
    class d extends m2 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.u0 f57848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ScheduledExecutorService scheduledExecutorService, com.google.common.base.u0 u0Var) {
            super(scheduledExecutorService);
            this.f57848d = u0Var;
        }

        @Override // com.google.common.util.concurrent.l2
        protected Runnable c(Runnable runnable) {
            return w.k(runnable, this.f57848d);
        }

        @Override // com.google.common.util.concurrent.l2
        protected <T> Callable<T> d(Callable<T> callable) {
            return w.l(callable, this.f57848d);
        }
    }

    /* compiled from: MoreExecutors.java */
    class e implements Executor {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f57849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.c f57850c;

        e(Executor executor, com.google.common.util.concurrent.c cVar) {
            this.f57849b = executor;
            this.f57850c = cVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f57849b.execute(runnable);
            } catch (RejectedExecutionException e4) {
                this.f57850c.C(e4);
            }
        }
    }

    /* compiled from: MoreExecutors.java */
    @d9.d
    @d9.c
    static class f {

        /* compiled from: MoreExecutors.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExecutorService f57851b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f57852c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ TimeUnit f57853d;

            a(f fVar, ExecutorService executorService, long j4, TimeUnit timeUnit) {
                this.f57851b = executorService;
                this.f57852c = j4;
                this.f57853d = timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f57851b.shutdown();
                    this.f57851b.awaitTermination(this.f57852c, this.f57853d);
                } catch (InterruptedException unused) {
                }
            }
        }

        f() {
        }

        final void a(ExecutorService executorService, long j4, TimeUnit timeUnit) {
            executorService.getClass();
            timeUnit.getClass();
            String valueOf = String.valueOf(executorService);
            b(g1.n(com.google.common.base.i.a(valueOf.length() + 24, ProtectedSandApp.s("流"), valueOf), new a(this, executorService, j4, timeUnit)));
        }

        @d9.d
        void b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        final ExecutorService c(ThreadPoolExecutor threadPoolExecutor) {
            return d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService d(ThreadPoolExecutor threadPoolExecutor, long j4, TimeUnit timeUnit) {
            g1.v(threadPoolExecutor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            a(threadPoolExecutor, j4, timeUnit);
            return unconfigurableExecutorService;
        }

        final ScheduledExecutorService e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j4, TimeUnit timeUnit) {
            g1.v(scheduledThreadPoolExecutor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            a(scheduledThreadPoolExecutor, j4, timeUnit);
            return unconfigurableScheduledExecutorService;
        }
    }

    /* compiled from: MoreExecutors.java */
    @d9.c
    private static class h extends com.google.common.util.concurrent.e {

        /* renamed from: b, reason: collision with root package name */
        private final ExecutorService f57857b;

        h(ExecutorService executorService) {
            executorService.getClass();
            this.f57857b = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
            return this.f57857b.awaitTermination(j4, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f57857b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f57857b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f57857b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f57857b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f57857b.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.f57857b);
            return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(obj, 2), obj, ProtectedSandApp.s("琉"), valueOf, ProtectedSandApp.s("留"));
        }
    }

    /* compiled from: MoreExecutors.java */
    @d9.c
    private static final class i extends h implements e1 {

        /* renamed from: c, reason: collision with root package name */
        final ScheduledExecutorService f57858c;

        /* compiled from: MoreExecutors.java */
        private static final class a<V> extends o0.a<V> implements b1<V> {

            /* renamed from: c, reason: collision with root package name */
            private final ScheduledFuture<?> f57859c;

            public a(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.f57859c = scheduledFuture;
            }

            public int E3(Delayed delayed) {
                return this.f57859c.compareTo(delayed);
            }

            @Override // com.google.common.util.concurrent.n0, java.util.concurrent.Future
            public boolean cancel(boolean z4) {
                boolean cancel = super.cancel(z4);
                if (cancel) {
                    this.f57859c.cancel(z4);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.f57859c.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f57859c.getDelay(timeUnit);
            }
        }

        /* compiled from: MoreExecutors.java */
        @d9.c
        private static final class b extends c.j<Void> implements Runnable {

            /* renamed from: j, reason: collision with root package name */
            private final Runnable f57860j;

            public b(Runnable runnable) {
                runnable.getClass();
                this.f57860j = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f57860j.run();
                } catch (Throwable th) {
                    C(th);
                    throw com.google.common.base.w0.q(th);
                }
            }

            @Override // com.google.common.util.concurrent.c
            protected String y() {
                String valueOf = String.valueOf(this.f57860j);
                return com.google.common.base.h.a(valueOf.length() + 7, ProtectedSandApp.s("硫"), valueOf, ProtectedSandApp.s("紐"));
            }
        }

        i(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            scheduledExecutorService.getClass();
            this.f57858c = scheduledExecutorService;
        }

        @Override // com.google.common.util.concurrent.e1, java.util.concurrent.ScheduledExecutorService
        public b1<?> scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f57858c.scheduleAtFixedRate(bVar, j4, j5, timeUnit));
        }

        @Override // com.google.common.util.concurrent.e1, java.util.concurrent.ScheduledExecutorService
        public b1<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f57858c.scheduleWithFixedDelay(bVar, j4, j5, timeUnit));
        }

        @Override // com.google.common.util.concurrent.e1, java.util.concurrent.ScheduledExecutorService
        public b1<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
            h2 Q = h2.Q(runnable, null);
            return new a(Q, this.f57858c.schedule(Q, j4, timeUnit));
        }

        @Override // com.google.common.util.concurrent.e1, java.util.concurrent.ScheduledExecutorService
        public <V> b1<V> schedule(Callable<V> callable, long j4, TimeUnit timeUnit) {
            h2 R = h2.R(callable);
            return new a(R, this.f57858c.schedule(R, j4, timeUnit));
        }
    }

    private g1() {
    }

    @d9.a
    @d9.c
    public static void b(ExecutorService executorService, long j4, TimeUnit timeUnit) {
        new f().a(executorService, j4, timeUnit);
    }

    public static Executor c() {
        return a0.INSTANCE;
    }

    @d9.a
    @d9.c
    public static ExecutorService d(ThreadPoolExecutor threadPoolExecutor) {
        return new f().c(threadPoolExecutor);
    }

    @d9.a
    @d9.c
    public static ExecutorService e(ThreadPoolExecutor threadPoolExecutor, long j4, TimeUnit timeUnit) {
        return new f().d(threadPoolExecutor, j4, timeUnit);
    }

    @d9.a
    @d9.c
    public static ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new f().e(scheduledThreadPoolExecutor);
    }

    @d9.a
    @d9.c
    public static ScheduledExecutorService g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j4, TimeUnit timeUnit) {
        return new f().f(scheduledThreadPoolExecutor, j4, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[SYNTHETIC] */
    @d9.c
    @com.google.common.util.concurrent.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> T h(com.google.common.util.concurrent.d1 r16, java.util.Collection<? extends java.util.concurrent.Callable<T>> r17, boolean r18, long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r1 = r16
            r16.getClass()
            r21.getClass()
            int r0 = r17.size()
            r2 = 1
            if (r0 <= 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = 0
        L12:
            com.google.common.base.l0.d(r3)
            java.util.ArrayList r3 = com.google.common.collect.l4.u(r0)
            java.util.concurrent.LinkedBlockingQueue r4 = new java.util.concurrent.LinkedBlockingQueue
            r4.<init>()
            r5 = r19
            r7 = r21
            long r5 = r7.toNanos(r5)
            if (r18 == 0) goto L30
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r0 = move-exception
            goto Lbd
        L30:
            r7 = 0
        L32:
            java.util.Iterator r9 = r17.iterator()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10     // Catch: java.lang.Throwable -> L2d
            com.google.common.util.concurrent.ListenableFuture r10 = u(r1, r10, r4)     // Catch: java.lang.Throwable -> L2d
            r3.add(r10)     // Catch: java.lang.Throwable -> L2d
            int r0 = r0 + (-1)
            r10 = 0
            r11 = r2
            r12 = r10
        L48:
            java.lang.Object r13 = r4.poll()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2d
            if (r13 != 0) goto L63
            if (r0 <= 0) goto L67
            int r0 = r0 + (-1)
            java.lang.Object r14 = r9.next()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.Callable r14 = (java.util.concurrent.Callable) r14     // Catch: java.lang.Throwable -> L2d
            com.google.common.util.concurrent.ListenableFuture r14 = u(r1, r14, r4)     // Catch: java.lang.Throwable -> L2d
            r3.add(r14)     // Catch: java.lang.Throwable -> L2d
            int r11 = r11 + 1
        L63:
            r14 = r7
        L64:
            r6 = r5
            r5 = r0
            goto L92
        L67:
            if (r11 != 0) goto L71
            if (r12 != 0) goto L70
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2d
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L2d
        L70:
            throw r12     // Catch: java.lang.Throwable -> L2d
        L71:
            if (r18 == 0) goto L8b
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = r4.poll(r5, r13)     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2d
            if (r13 == 0) goto L85
            long r14 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2d
            long r7 = r14 - r7
            long r5 = r5 - r7
            goto L64
        L85:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            throw r0     // Catch: java.lang.Throwable -> L2d
        L8b:
            java.lang.Object r13 = r4.take()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2d
            goto L63
        L92:
            if (r13 == 0) goto Lb9
            int r11 = r11 + (-1)
            java.lang.Object r0 = r13.get()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> Laf java.util.concurrent.ExecutionException -> Lb7
            java.util.Iterator r1 = r3.iterator()
        L9e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto L9e
        Lae:
            return r0
        Laf:
            r0 = move-exception
            r8 = r0
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2d
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            goto Lb9
        Lb7:
            r0 = move-exception
            r12 = r0
        Lb9:
            r0 = r5
            r5 = r6
            r7 = r14
            goto L48
        Lbd:
            java.util.Iterator r1 = r3.iterator()
        Lc1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto Lc1
        Ld1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.g1.h(com.google.common.util.concurrent.d1, java.util.Collection, boolean, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @d9.c
    private static boolean i() {
        if (System.getProperty(ProtectedSandApp.s("類")) == null) {
            return false;
        }
        try {
            Class.forName(ProtectedSandApp.s("六"));
            return Class.forName(ProtectedSandApp.s("戮")).getMethod(ProtectedSandApp.s("陸"), null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @d9.c
    public static d1 j(ExecutorService executorService) {
        if (executorService instanceof d1) {
            return (d1) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new i((ScheduledExecutorService) executorService) : new h(executorService);
    }

    @d9.c
    public static e1 k(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof e1 ? (e1) scheduledExecutorService : new i(scheduledExecutorService);
    }

    @d9.c
    public static d1 l() {
        return new g(null);
    }

    @d9.c
    public static Executor m(Executor executor) {
        return new o1(executor);
    }

    @d9.c
    static Thread n(String str, Runnable runnable) {
        str.getClass();
        runnable.getClass();
        Thread newThread = o().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    @d9.a
    @d9.c
    public static ThreadFactory o() {
        String s4 = ProtectedSandApp.s("倫");
        if (!i()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName(ProtectedSandApp.s("崙")).getMethod(ProtectedSandApp.s("淪"), null).invoke(null, null);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(s4, e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(s4, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(s4, e6);
        } catch (InvocationTargetException e7) {
            throw com.google.common.base.w0.q(e7.getCause());
        }
    }

    static Executor p(Executor executor, com.google.common.util.concurrent.c<?> cVar) {
        executor.getClass();
        cVar.getClass();
        return executor == a0.INSTANCE ? executor : new e(executor, cVar);
    }

    @d9.c
    static Executor q(Executor executor, com.google.common.base.u0<String> u0Var) {
        executor.getClass();
        u0Var.getClass();
        return new b(executor, u0Var);
    }

    @d9.c
    static ExecutorService r(ExecutorService executorService, com.google.common.base.u0<String> u0Var) {
        executorService.getClass();
        u0Var.getClass();
        return new c(executorService, u0Var);
    }

    @d9.c
    static ScheduledExecutorService s(ScheduledExecutorService scheduledExecutorService, com.google.common.base.u0<String> u0Var) {
        scheduledExecutorService.getClass();
        u0Var.getClass();
        return new d(scheduledExecutorService, u0Var);
    }

    @d9.a
    @d9.c
    @f9.a
    public static boolean t(ExecutorService executorService, long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @d9.c
    private static <T> ListenableFuture<T> u(d1 d1Var, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        ListenableFuture<T> submit = d1Var.submit((Callable) callable);
        submit.n2(new a(blockingQueue, submit), a0.INSTANCE);
        return submit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d9.c
    public static void v(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new e2().e(true).h(threadPoolExecutor.getThreadFactory()).b());
    }

    /* compiled from: MoreExecutors.java */
    @d9.c
    private static final class g extends com.google.common.util.concurrent.e {

        /* renamed from: b, reason: collision with root package name */
        private final Object f57854b;

        /* renamed from: c, reason: collision with root package name */
        @g9.a("lock")
        private int f57855c;

        /* renamed from: d, reason: collision with root package name */
        @g9.a("lock")
        private boolean f57856d;

        private g() {
            this.f57854b = new Object();
            this.f57855c = 0;
            this.f57856d = false;
        }

        private void a() {
            synchronized (this.f57854b) {
                try {
                    int i4 = this.f57855c - 1;
                    this.f57855c = i4;
                    if (i4 == 0) {
                        this.f57854b.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void b() {
            synchronized (this.f57854b) {
                try {
                    if (this.f57856d) {
                        throw new RejectedExecutionException(ProtectedSandApp.s("溜"));
                    }
                    this.f57855c++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j4);
            synchronized (this.f57854b) {
                while (true) {
                    try {
                        if (this.f57856d && this.f57855c == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long nanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.f57854b, nanos);
                        nanos -= System.nanoTime() - nanoTime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b();
            try {
                runnable.run();
            } finally {
                a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z4;
            synchronized (this.f57854b) {
                z4 = this.f57856d;
            }
            return z4;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z4;
            synchronized (this.f57854b) {
                try {
                    z4 = this.f57856d && this.f57855c == 0;
                } finally {
                }
            }
            return z4;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f57854b) {
                try {
                    this.f57856d = true;
                    if (this.f57855c == 0) {
                        this.f57854b.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }
}
