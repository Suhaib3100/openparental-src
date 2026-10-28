package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ListenerCallQueue.java */
@b0
@d9.c
/* loaded from: classes6.dex */
final class c1<L> {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f57708b = Logger.getLogger(c1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final List<b<L>> f57709a = Collections.synchronizedList(new ArrayList());

    /* compiled from: ListenerCallQueue.java */
    interface a<L> {
        void a(L l4);
    }

    /* compiled from: ListenerCallQueue.java */
    private static final class b<L> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final L f57710b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f57711c;

        /* renamed from: d, reason: collision with root package name */
        @g9.a("this")
        final Queue<a<L>> f57712d = new ArrayDeque();

        /* renamed from: e, reason: collision with root package name */
        @g9.a("this")
        final Queue<Object> f57713e = new ArrayDeque();

        /* renamed from: f, reason: collision with root package name */
        @g9.a("this")
        boolean f57714f;

        b(L l4, Executor executor) {
            l4.getClass();
            this.f57710b = l4;
            executor.getClass();
            this.f57711c = executor;
        }

        synchronized void a(a<L> aVar, Object obj) {
            this.f57712d.add(aVar);
            this.f57713e.add(obj);
        }

        void b() {
            boolean z4;
            synchronized (this) {
                try {
                    if (this.f57714f) {
                        z4 = false;
                    } else {
                        z4 = true;
                        this.f57714f = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                try {
                    this.f57711c.execute(this);
                } catch (RuntimeException e4) {
                    synchronized (this) {
                        this.f57714f = false;
                        Logger logger = c1.f57708b;
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(this.f57710b);
                        String valueOf2 = String.valueOf(this.f57711c);
                        logger.log(level, com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 42, ProtectedSandApp.s("說"), valueOf, ProtectedSandApp.s("廉"), valueOf2), (Throwable) e4);
                        throw e4;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r2.a(r10.f57710b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            r4 = com.google.common.util.concurrent.c1.f57708b;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r10.f57710b);
            r3 = java.lang.String.valueOf(r3);
            r8 = new java.lang.StringBuilder((r6.length() + 37) + r3.length());
            r8.append(com.flashget.parentalcontrol.ProtectedSandApp.s("念"));
            r8.append(r6);
            r8.append(com.flashget.parentalcontrol.ProtectedSandApp.s("捻"));
            r8.append(r3);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L2b
                boolean r2 = r10.f57714f     // Catch: java.lang.Throwable -> L1f
                com.google.common.base.l0.g0(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<com.google.common.util.concurrent.c1$a<L>> r2 = r10.f57712d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                com.google.common.util.concurrent.c1$a r2 = (com.google.common.util.concurrent.c1.a) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<java.lang.Object> r3 = r10.f57713e     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L24
                r10.f57714f = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L6e
            L1f:
                r2 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L6e
            L24:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1f
                L r4 = r10.f57710b     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
                r2.a(r4)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
                goto L0
            L2b:
                r2 = move-exception
                goto L77
            L2d:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.c1.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2b
                L r6 = r10.f57710b     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L2b
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch: java.lang.Throwable -> L2b
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "念"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L2b
                r8.append(r7)     // Catch: java.lang.Throwable -> L2b
                r8.append(r6)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = "捻"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L2b
                r8.append(r6)     // Catch: java.lang.Throwable -> L2b
                r8.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L2b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2b
                goto L0
            L6e:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
                throw r1     // Catch: java.lang.Throwable -> L70
            L70:
                r1 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L77
            L75:
                r1 = move-exception
                goto L6e
            L77:
                if (r1 == 0) goto L81
                monitor-enter(r10)
                r10.f57714f = r0     // Catch: java.lang.Throwable -> L7e
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
                goto L81
            L7e:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
                throw r0
            L81:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.c1.b.run():void");
        }
    }

    c1() {
    }

    private void f(a<L> aVar, Object obj) {
        com.google.common.base.l0.F(aVar, ProtectedSandApp.s("殮"));
        com.google.common.base.l0.F(obj, ProtectedSandApp.s("簾"));
        synchronized (this.f57709a) {
            try {
                Iterator<b<L>> it = this.f57709a.iterator();
                while (it.hasNext()) {
                    it.next().a(aVar, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(L l4, Executor executor) {
        com.google.common.base.l0.F(l4, ProtectedSandApp.s("獵"));
        com.google.common.base.l0.F(executor, ProtectedSandApp.s("令"));
        this.f57709a.add(new b<>(l4, executor));
    }

    public void c() {
        for (int i4 = 0; i4 < this.f57709a.size(); i4++) {
            this.f57709a.get(i4).b();
        }
    }

    public void d(a<L> aVar) {
        f(aVar, aVar);
    }

    public void e(a<L> aVar, String str) {
        f(aVar, str);
    }
}
