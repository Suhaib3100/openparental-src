package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TimeLimiter.java */
@b0
@d9.c
@d9.a
@f9.f("Use FakeTimeLimiter")
/* loaded from: classes6.dex */
public interface f2 {
    void a(Runnable runnable, long j4, TimeUnit timeUnit) throws TimeoutException, InterruptedException;

    <T> T b(T t4, Class<T> cls, long j4, TimeUnit timeUnit);

    void c(Runnable runnable, long j4, TimeUnit timeUnit) throws TimeoutException;

    @f9.a
    <T> T d(Callable<T> callable, long j4, TimeUnit timeUnit) throws TimeoutException, ExecutionException;

    @f9.a
    <T> T e(Callable<T> callable, long j4, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException;
}
