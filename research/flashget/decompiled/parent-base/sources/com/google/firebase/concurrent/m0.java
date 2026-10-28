package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PausableScheduledExecutorServiceImpl.java */
/* loaded from: classes6.dex */
final class m0 extends o implements l0 {

    /* renamed from: d, reason: collision with root package name */
    private final h0 f58555d;

    m0(h0 h0Var, ScheduledExecutorService scheduledExecutorService) {
        super(h0Var, scheduledExecutorService);
        this.f58555d = h0Var;
    }

    @Override // com.google.firebase.concurrent.f0
    public boolean d1() {
        return this.f58555d.d1();
    }

    @Override // com.google.firebase.concurrent.f0
    public void pause() {
        this.f58555d.pause();
    }

    @Override // com.google.firebase.concurrent.f0
    public void resume() {
        this.f58555d.resume();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
