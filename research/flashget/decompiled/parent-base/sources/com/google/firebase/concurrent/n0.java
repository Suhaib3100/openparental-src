package com.google.firebase.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes6.dex */
final class n0 implements Executor {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f58558g = Logger.getLogger(n0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Executor f58559b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private final Deque<Runnable> f58560c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private c f58561d = c.IDLE;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("queue")
    private long f58562e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final b f58563f = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f58564b;

        a(Runnable runnable) {
            this.f58564b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58564b.run();
        }

        public String toString() {
            return this.f58564b.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    private final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        Runnable f58566b;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            r8.f58566b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
        
            r8.f58566b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            com.google.firebase.concurrent.n0.f58558g.log(java.util.logging.Level.SEVERE, com.flashget.parentalcontrol.ProtectedSandApp.s("ﮘ") + r8.f58566b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
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
                com.google.firebase.concurrent.n0 r2 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = com.google.firebase.concurrent.n0.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0$c r0 = com.google.firebase.concurrent.n0.b(r0)     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L87
            L22:
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0.d(r0)     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.firebase.concurrent.n0 r3 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.firebase.concurrent.n0.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f58566b = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                com.google.firebase.concurrent.n0 r0 = com.google.firebase.concurrent.n0.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.n0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f58566b     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f58566b = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L89
            L60:
                r0 = move-exception
                goto L84
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.n0.e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "ﮘ"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f58566b     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L84:
                r8.f58566b = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L87:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L89:
                if (r1 == 0) goto L92
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L92:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.n0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e4) {
                synchronized (n0.this.f58560c) {
                    n0.this.f58561d = c.IDLE;
                    throw e4;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f58566b;
            String s4 = ProtectedSandApp.s("ﮙ");
            if (runnable != null) {
                return ProtectedSandApp.s("ﮚ") + runnable + s4;
            }
            return ProtectedSandApp.s("ﮛ") + n0.this.f58561d + s4;
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
        this.f58559b = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long d(n0 n0Var) {
        long j4 = n0Var.f58562e;
        n0Var.f58562e = 1 + j4;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f58560c
            monitor-enter(r0)
            com.google.firebase.concurrent.n0$c r1 = r7.f58561d     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.n0$c r2 = com.google.firebase.concurrent.n0.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            com.google.firebase.concurrent.n0$c r2 = com.google.firebase.concurrent.n0.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f58562e     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.n0$a r1 = new com.google.firebase.concurrent.n0$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.f58560c     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            com.google.firebase.concurrent.n0$c r8 = com.google.firebase.concurrent.n0.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f58561d = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f58559b     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.firebase.concurrent.n0$b r5 = r7.f58563f     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.firebase.concurrent.n0$c r0 = r7.f58561d
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f58560c
            monitor-enter(r0)
            long r5 = r7.f58562e     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.firebase.concurrent.n0$c r1 = r7.f58561d     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f58561d = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.f58560c
            monitor-enter(r2)
            com.google.firebase.concurrent.n0$c r0 = r7.f58561d     // Catch: java.lang.Throwable -> L55
            com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            com.google.firebase.concurrent.n0$c r3 = com.google.firebase.concurrent.n0.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.f58560c     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.f58560c     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.n0.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return ProtectedSandApp.s("ﮠ") + System.identityHashCode(this) + ProtectedSandApp.s("ﮡ") + this.f58559b + ProtectedSandApp.s("ﮢ");
    }
}
