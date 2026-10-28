package com.google.firebase.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes2.dex */
final class n0 implements Executor {

    /* renamed from: t, reason: collision with root package name */
    private static final Logger f15481t = Logger.getLogger(n0.class.getName());

    /* renamed from: o, reason: collision with root package name */
    private final Executor f15482o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private final Deque<Runnable> f15483p = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private c f15484q = c.IDLE;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private long f15485r = 0;

    /* renamed from: s, reason: collision with root package name */
    private final b f15486s = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Runnable f15487o;

        a(Runnable runnable) {
            this.f15487o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15487o.run();
        }

        public String toString() {
            return this.f15487o.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    private final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        @CheckForNull
        Runnable f15489o;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        
            r8.f15489o.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            com.google.firebase.concurrent.n0.f15481t.log(java.util.logging.Level.SEVERE, com.flashget.kidsdownloader.ProtectedSandApp.s("Ꭽ") + r8.f15489o, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        
            r8.f15489o = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.n0 r2 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L86
                java.util.Deque r2 = com.google.firebase.concurrent.n0.a(r2)     // Catch: java.lang.Throwable -> L86
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L86
                if (r0 != 0) goto L2b
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0$c r0 = com.google.firebase.concurrent.n0.b(r0)     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.RUNNING     // Catch: java.lang.Throwable -> L83
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0.d(r0)     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L83
                r0 = 1
            L2b:
                com.google.firebase.concurrent.n0 r3 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L83
                java.util.Deque r3 = com.google.firebase.concurrent.n0.a(r3)     // Catch: java.lang.Throwable -> L83
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L83
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L83
                r8.f15489o = r3     // Catch: java.lang.Throwable -> L83
                if (r3 != 0) goto L4d
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.IDLE     // Catch: java.lang.Throwable -> L83
                com.google.firebase.concurrent.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L83
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L86
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f15489o     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f15489o = r2     // Catch: java.lang.Throwable -> L86
                goto L2
            L5c:
                r0 = move-exception
                goto L80
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.n0.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Ꭽ"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f15489o     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L80:
                r8.f15489o = r2     // Catch: java.lang.Throwable -> L86
                throw r0     // Catch: java.lang.Throwable -> L86
            L83:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                throw r0     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                if (r1 == 0) goto L90
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L90:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.n0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e6) {
                synchronized (n0.this.f15483p) {
                    n0.this.f15484q = c.IDLE;
                    throw e6;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f15489o;
            String s5 = ProtectedSandApp.s("Ꭾ");
            if (runnable != null) {
                return ProtectedSandApp.s("Ꭿ") + runnable + s5;
            }
            return ProtectedSandApp.s("Ꮀ") + n0.this.f15484q + s5;
        }

        /* synthetic */ b(n0 n0Var, a aVar) {
            this();
        }
    }

    /* compiled from: SequentialExecutor.java */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    n0(Executor executor) {
        this.f15482o = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long d(n0 n0Var) {
        long j5 = n0Var.f15485r;
        n0Var.f15485r = 1 + j5;
        return j5;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f15483p) {
            c cVar2 = this.f15484q;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j5 = this.f15485r;
                a aVar = new a(runnable);
                this.f15483p.add(aVar);
                c cVar3 = c.QUEUING;
                this.f15484q = cVar3;
                try {
                    this.f15482o.execute(this.f15486s);
                    if (this.f15484q != cVar3) {
                        return;
                    }
                    synchronized (this.f15483p) {
                        if (this.f15485r == j5 && this.f15484q == cVar3) {
                            this.f15484q = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e6) {
                    synchronized (this.f15483p) {
                        c cVar4 = this.f15484q;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f15483p.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e6 instanceof RejectedExecutionException) || r0) {
                            throw e6;
                        }
                    }
                    return;
                }
            }
            this.f15483p.add(runnable);
        }
    }

    public String toString() {
        return ProtectedSandApp.s("Ꮅ") + System.identityHashCode(this) + ProtectedSandApp.s("Ꮆ") + this.f15482o + ProtectedSandApp.s("Ꮇ");
    }
}
