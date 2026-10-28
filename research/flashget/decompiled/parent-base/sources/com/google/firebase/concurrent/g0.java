package com.google.firebase.concurrent;

import androidx.annotation.m1;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PausableExecutorImpl.java */
/* loaded from: classes6.dex */
final class g0 implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f58526b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f58527c;

    /* renamed from: d, reason: collision with root package name */
    @m1
    final LinkedBlockingQueue<Runnable> f58528d = new LinkedBlockingQueue<>();

    g0(boolean z4, Executor executor) {
        this.f58526b = z4;
        this.f58527c = executor;
    }

    private void a() {
        if (this.f58526b) {
            return;
        }
        Runnable poll = this.f58528d.poll();
        while (poll != null) {
            this.f58527c.execute(poll);
            poll = !this.f58526b ? this.f58528d.poll() : null;
        }
    }

    @Override // com.google.firebase.concurrent.f0
    public boolean d1() {
        return this.f58526b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f58528d.offer(runnable);
        a();
    }

    @Override // com.google.firebase.concurrent.f0
    public void pause() {
        this.f58526b = true;
    }

    @Override // com.google.firebase.concurrent.f0
    public void resume() {
        this.f58526b = false;
        a();
    }
}
