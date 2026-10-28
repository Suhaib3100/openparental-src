package com.google.firebase.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: LimitedConcurrencyExecutor.java */
/* loaded from: classes6.dex */
class b0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f58504b;

    /* renamed from: c, reason: collision with root package name */
    private final Semaphore f58505c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f58506d = new LinkedBlockingQueue<>();

    b0(Executor executor, int i4) {
        com.google.firebase.components.a0.a(i4 > 0, ProtectedSandApp.s("ﮓ"));
        this.f58504b = executor;
        this.f58505c = new Semaphore(i4, true);
    }

    private Runnable b(Runnable runnable) {
        return new a0(this, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f58505c.release();
            d();
        }
    }

    private void d() {
        while (this.f58505c.tryAcquire()) {
            Runnable poll = this.f58506d.poll();
            if (poll == null) {
                this.f58505c.release();
                return;
            }
            this.f58504b.execute(new a0(this, poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f58506d.offer(runnable);
        d();
    }
}
