package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Monitor.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f57809a;

    /* renamed from: b, reason: collision with root package name */
    private final ReentrantLock f57810b;

    /* renamed from: c, reason: collision with root package name */
    @g9.a("lock")
    @zc.a
    private a f57811c;

    /* compiled from: Monitor.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @ma.i
        final f1 f57812a;

        /* renamed from: b, reason: collision with root package name */
        final Condition f57813b;

        /* renamed from: c, reason: collision with root package name */
        @g9.a("monitor.lock")
        int f57814c = 0;

        /* renamed from: d, reason: collision with root package name */
        @g9.a("monitor.lock")
        @zc.a
        a f57815d;

        protected a(f1 f1Var) {
            this.f57812a = (f1) com.google.common.base.l0.F(f1Var, ProtectedSandApp.s("僚"));
            this.f57813b = f1Var.f57810b.newCondition();
        }

        public abstract boolean a();
    }

    public f1() {
        this(false);
    }

    @g9.a("lock")
    private boolean C(a aVar) {
        try {
            return aVar.a();
        } catch (Throwable th) {
            F();
            throw th;
        }
    }

    private static long E(long j4, long j5) {
        if (j5 <= 0) {
            return 0L;
        }
        return j5 - (System.nanoTime() - j4);
    }

    @g9.a("lock")
    private void F() {
        for (a aVar = this.f57811c; aVar != null; aVar = aVar.f57815d) {
            aVar.f57813b.signalAll();
        }
    }

    @g9.a("lock")
    private void G() {
        for (a aVar = this.f57811c; aVar != null; aVar = aVar.f57815d) {
            if (C(aVar)) {
                aVar.f57813b.signal();
                return;
            }
        }
    }

    private static long H(long j4, TimeUnit timeUnit) {
        return com.google.common.primitives.n.f(timeUnit.toNanos(j4), 0L, 6917529027641081853L);
    }

    @g9.a("lock")
    private void b(a aVar, boolean z4) throws InterruptedException {
        if (z4) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.f57813b.await();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @g9.a("lock")
    private boolean c(a aVar, long j4, boolean z4) throws InterruptedException {
        boolean z5 = true;
        while (j4 > 0) {
            if (z5) {
                if (z4) {
                    try {
                        G();
                    } catch (Throwable th) {
                        if (!z5) {
                            f(aVar);
                        }
                        throw th;
                    }
                }
                e(aVar);
                z5 = false;
            }
            j4 = aVar.f57813b.awaitNanos(j4);
            if (aVar.a()) {
                if (!z5) {
                    f(aVar);
                }
                return true;
            }
        }
        if (!z5) {
            f(aVar);
        }
        return false;
    }

    @g9.a("lock")
    private void d(a aVar, boolean z4) {
        if (z4) {
            G();
        }
        e(aVar);
        do {
            try {
                aVar.f57813b.awaitUninterruptibly();
            } finally {
                f(aVar);
            }
        } while (!aVar.a());
    }

    @g9.a("lock")
    private void e(a aVar) {
        int i4 = aVar.f57814c;
        aVar.f57814c = i4 + 1;
        if (i4 == 0) {
            aVar.f57815d = this.f57811c;
            this.f57811c = aVar;
        }
    }

    @g9.a("lock")
    private void f(a aVar) {
        int i4 = aVar.f57814c - 1;
        aVar.f57814c = i4;
        if (i4 == 0) {
            a aVar2 = this.f57811c;
            a aVar3 = null;
            while (aVar2 != aVar) {
                aVar3 = aVar2;
                aVar2 = aVar2.f57815d;
            }
            if (aVar3 == null) {
                this.f57811c = aVar2.f57815d;
            } else {
                aVar3.f57815d = aVar2.f57815d;
            }
            aVar2.f57815d = null;
        }
    }

    private static long y(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    public boolean A() {
        return this.f57810b.isLocked();
    }

    public boolean B() {
        return this.f57810b.isHeldByCurrentThread();
    }

    public void D() {
        ReentrantLock reentrantLock = this.f57810b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean I() {
        return this.f57810b.tryLock();
    }

    public boolean J(a aVar) {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean a5 = aVar.a();
            if (!a5) {
            }
            return a5;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void K(a aVar) throws InterruptedException {
        if (aVar.f57812a != this || !this.f57810b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return;
        }
        b(aVar, true);
    }

    public boolean L(a aVar, long j4, TimeUnit timeUnit) throws InterruptedException {
        long H = H(j4, timeUnit);
        if (aVar.f57812a != this || !this.f57810b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return c(aVar, H, true);
    }

    public void M(a aVar) {
        if (aVar.f57812a != this || !this.f57810b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (aVar.a()) {
            return;
        }
        d(aVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean N(com.google.common.util.concurrent.f1.a r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            long r8 = H(r8, r10)
            com.google.common.util.concurrent.f1 r10 = r7.f57812a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f57810b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.a()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = y(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = r0
        L22:
            boolean r7 = r6.c(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = E(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = r0
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.f1.N(com.google.common.util.concurrent.f1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public void g() {
        this.f57810b.lock();
    }

    public boolean h(long j4, TimeUnit timeUnit) {
        boolean tryLock;
        long H = H(j4, timeUnit);
        ReentrantLock reentrantLock = this.f57810b;
        boolean z4 = true;
        if (!this.f57809a && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j5 = H;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j5, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th) {
                        th = th;
                        if (z4) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    j5 = E(nanoTime, H);
                    interrupted = true;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th2) {
            th = th2;
            z4 = interrupted;
        }
    }

    public boolean i(a aVar) {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        reentrantLock.lock();
        try {
            boolean a5 = aVar.a();
            if (!a5) {
            }
            return a5;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean j(a aVar, long j4, TimeUnit timeUnit) {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        if (!h(j4, timeUnit)) {
            return false;
        }
        try {
            boolean a5 = aVar.a();
            if (!a5) {
            }
            return a5;
        } finally {
            this.f57810b.unlock();
        }
    }

    public boolean k(a aVar) throws InterruptedException {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        reentrantLock.lockInterruptibly();
        try {
            boolean a5 = aVar.a();
            if (!a5) {
            }
            return a5;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean l(a aVar, long j4, TimeUnit timeUnit) throws InterruptedException {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        if (!reentrantLock.tryLock(j4, timeUnit)) {
            return false;
        }
        try {
            boolean a5 = aVar.a();
            if (!a5) {
            }
            return a5;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void m() throws InterruptedException {
        this.f57810b.lockInterruptibly();
    }

    public boolean n(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f57810b.tryLock(j4, timeUnit);
    }

    public void o(a aVar) throws InterruptedException {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (aVar.a()) {
                return;
            }
            b(aVar, isHeldByCurrentThread);
        } catch (Throwable th) {
            D();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (c(r11, r0, r3) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(com.google.common.util.concurrent.f1.a r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = H(r12, r14)
            com.google.common.util.concurrent.f1 r2 = r11.f57812a
            if (r2 != r10) goto L62
            java.util.concurrent.locks.ReentrantLock r2 = r10.f57810b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f57809a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = y(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.a()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L4c
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = E(r8, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            boolean r11 = r10.c(r11, r0, r3)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            goto L4c
        L4a:
            r11 = move-exception
            goto L53
        L4c:
            r5 = 1
        L4d:
            if (r5 != 0) goto L52
            r2.unlock()
        L52:
            return r5
        L53:
            if (r3 != 0) goto L5e
            r10.G()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5e:
            r2.unlock()
            throw r11
        L62:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.f1.p(com.google.common.util.concurrent.f1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public void q(a aVar) {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f57810b;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (aVar.a()) {
                return;
            }
            d(aVar, isHeldByCurrentThread);
        } catch (Throwable th) {
            D();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:5:0x0012, B:7:0x001a, B:22:0x004f, B:33:0x005c, B:34:0x005f, B:35:0x0025, B:38:0x002a, B:13:0x0032, B:17:0x003d, B:18:0x0049, B:27:0x0045), top: B:4:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r(com.google.common.util.concurrent.f1.a r12, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r11 = this;
            long r13 = H(r13, r15)
            com.google.common.util.concurrent.f1 r15 = r12.f57812a
            if (r15 != r11) goto L7f
            java.util.concurrent.locks.ReentrantLock r15 = r11.f57810b
            boolean r0 = r15.isHeldByCurrentThread()
            boolean r1 = java.lang.Thread.interrupted()
            boolean r2 = r11.f57809a     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L25
            boolean r2 = r15.tryLock()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L21
            goto L25
        L21:
            r7 = r4
            goto L32
        L23:
            r12 = move-exception
            goto L75
        L25:
            long r7 = y(r13)     // Catch: java.lang.Throwable -> L23
            r9 = r13
        L2a:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            boolean r2 = r15.tryLock(r9, r2)     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            if (r2 == 0) goto L63
        L32:
            boolean r2 = r12.a()     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            if (r2 == 0) goto L39
            goto L4d
        L39:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L45
            long r7 = y(r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            r9 = r13
            goto L49
        L43:
            r12 = move-exception
            goto L5c
        L45:
            long r9 = E(r7, r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L49:
            boolean r6 = r11.c(r12, r9, r0)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L4d:
            if (r6 != 0) goto L52
            r15.unlock()     // Catch: java.lang.Throwable -> L23
        L52:
            if (r1 == 0) goto L5b
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L5b:
            return r6
        L5c:
            r15.unlock()     // Catch: java.lang.Throwable -> L23
            throw r12     // Catch: java.lang.Throwable -> L23
        L60:
            r0 = r3
            r1 = r6
            goto L32
        L63:
            if (r1 == 0) goto L6c
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L6c:
            return r3
        L6d:
            long r9 = E(r7, r13)     // Catch: java.lang.Throwable -> L73
            r1 = r6
            goto L2a
        L73:
            r12 = move-exception
            r1 = r6
        L75:
            if (r1 == 0) goto L7e
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L7e:
            throw r12
        L7f:
            java.lang.IllegalMonitorStateException r12 = new java.lang.IllegalMonitorStateException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.f1.r(com.google.common.util.concurrent.f1$a, long, java.util.concurrent.TimeUnit):boolean");
    }

    public int s() {
        return this.f57810b.getHoldCount();
    }

    public int t() {
        return this.f57810b.getQueueLength();
    }

    public int u(a aVar) {
        if (aVar.f57812a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f57810b.lock();
        try {
            return aVar.f57814c;
        } finally {
            this.f57810b.unlock();
        }
    }

    public boolean v(Thread thread) {
        return this.f57810b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.f57810b.hasQueuedThreads();
    }

    public boolean x(a aVar) {
        return u(aVar) > 0;
    }

    public boolean z() {
        return this.f57809a;
    }

    public f1(boolean z4) {
        this.f57811c = null;
        this.f57809a = z4;
        this.f57810b = new ReentrantLock(z4);
    }
}
