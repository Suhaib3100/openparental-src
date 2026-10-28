package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PausableScheduledExecutorServiceImpl.java */
/* loaded from: classes4.dex */
final class m0 extends o implements l0 {

    /* renamed from: q, reason: collision with root package name */
    private final h0 f15478q;

    m0(h0 h0Var, ScheduledExecutorService scheduledExecutorService) {
        super(h0Var, scheduledExecutorService);
        this.f15478q = h0Var;
    }

    @Override // com.google.firebase.concurrent.f0
    public boolean k0() {
        return this.f15478q.k0();
    }

    @Override // com.google.firebase.concurrent.f0
    public void l() {
        this.f15478q.l();
    }

    @Override // com.google.firebase.concurrent.f0
    public void pause() {
        this.f15478q.pause();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
