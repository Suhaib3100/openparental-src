package com.google.firebase.concurrent;

import androidx.annotation.m1;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PausableExecutorImpl.java */
/* loaded from: classes3.dex */
final class g0 implements f0 {

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f15447o;

    /* renamed from: p, reason: collision with root package name */
    private final Executor f15448p;

    /* renamed from: q, reason: collision with root package name */
    @m1
    final LinkedBlockingQueue<Runnable> f15449q = new LinkedBlockingQueue<>();

    g0(boolean z5, Executor executor) {
        this.f15447o = z5;
        this.f15448p = executor;
    }

    private void a() {
        if (this.f15447o) {
            return;
        }
        Runnable poll = this.f15449q.poll();
        while (poll != null) {
            this.f15448p.execute(poll);
            poll = !this.f15447o ? this.f15449q.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15449q.offer(runnable);
        a();
    }

    @Override // com.google.firebase.concurrent.f0
    public boolean k0() {
        return this.f15447o;
    }

    @Override // com.google.firebase.concurrent.f0
    public void l() {
        this.f15447o = false;
        a();
    }

    @Override // com.google.firebase.concurrent.f0
    public void pause() {
        this.f15447o = true;
    }
}
