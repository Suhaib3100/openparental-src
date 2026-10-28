package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ListeningScheduledExecutorService.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public interface e1 extends ScheduledExecutorService, d1 {
    @Override // java.util.concurrent.ScheduledExecutorService
    b1<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> b1<V> schedule(Callable<V> callable, long j4, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    b1<?> scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    b1<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit);
}
