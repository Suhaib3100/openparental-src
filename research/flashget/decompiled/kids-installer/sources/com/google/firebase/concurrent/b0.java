package com.google.firebase.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: LimitedConcurrencyExecutor.java */
/* loaded from: classes2.dex */
class b0 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f15427o;

    /* renamed from: p, reason: collision with root package name */
    private final Semaphore f15428p;

    /* renamed from: q, reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f15429q = new LinkedBlockingQueue<>();

    b0(Executor executor, int i5) {
        com.google.firebase.components.a0.a(i5 > 0, ProtectedSandApp.s("Ꭻ"));
        this.f15427o = executor;
        this.f15428p = new Semaphore(i5, true);
    }

    private Runnable b(Runnable runnable) {
        return new a0(this, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f15428p.release();
            d();
        }
    }

    private void d() {
        while (this.f15428p.tryAcquire()) {
            Runnable poll = this.f15429q.poll();
            if (poll == null) {
                this.f15428p.release();
                return;
            }
            this.f15427o.execute(new a0(this, poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15429q.offer(runnable);
        d();
    }
}
