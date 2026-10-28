package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import ma.f;

/* compiled from: InterruptibleTask.java */
@b0
@ma.f(f.a.FULL)
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class x0<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f58052b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final Runnable f58053c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final int f58054d = 1000;

    /* compiled from: InterruptibleTask.java */
    @d9.d
    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final x0<?> f58055b;

        static void a(b bVar, Thread thread) {
            bVar.setExclusiveOwnerThread(thread);
        }

        private void b(Thread thread) {
            setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f58055b.toString();
        }

        private b(x0<?> x0Var) {
            this.f58055b = x0Var;
        }
    }

    /* compiled from: InterruptibleTask.java */
    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        c(a aVar) {
        }
    }

    x0() {
    }

    private void g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            boolean z5 = runnable instanceof b;
            if (!z5 && runnable != f58053c) {
                break;
            }
            if (z5) {
                bVar = (b) runnable;
            }
            i4++;
            if (i4 > 1000) {
                Runnable runnable2 = f58053c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z4 = Thread.interrupted() || z4;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z4) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th);

    abstract void b(@j1 T t4);

    final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            b.a(bVar, Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f58052b) == f58053c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    @j1
    abstract T e() throws Exception;

    abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t4 = null;
        if (compareAndSet(null, currentThread)) {
            boolean d5 = d();
            if (!d5) {
                try {
                    t4 = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f58052b)) {
                        g(currentThread);
                    }
                    if (d5) {
                        return;
                    }
                    a(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f58052b)) {
                g(currentThread);
            }
            if (d5) {
                return;
            }
            b(t4);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String s4;
        Runnable runnable = get();
        if (runnable == f58052b) {
            s4 = ProtectedSandApp.s("理");
        } else if (runnable instanceof b) {
            s4 = ProtectedSandApp.s("痢");
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            s4 = com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(name, 21), ProtectedSandApp.s("罹"), name, ProtectedSandApp.s("裏"));
        } else {
            s4 = ProtectedSandApp.s("裡");
        }
        String f4 = f();
        return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(f4, com.google.android.gms.common.internal.b.a(s4, 2)), s4, ProtectedSandApp.s("里"), f4);
    }
}
