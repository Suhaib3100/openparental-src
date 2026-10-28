package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: FakeTimeLimiter.java */
@b0
@d9.c
@f9.a
@d9.a
/* loaded from: classes6.dex */
public final class g0 implements f2 {
    @Override // com.google.common.util.concurrent.f2
    public void a(Runnable runnable, long j4, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        try {
            runnable.run();
        } catch (Error e4) {
            throw new c0((Throwable) e4);
        } catch (RuntimeException e5) {
            throw new UncheckedExecutionException(e5);
        } catch (Throwable th) {
            throw new UncheckedExecutionException(th);
        }
    }

    @Override // com.google.common.util.concurrent.f2
    public <T> T b(T t4, Class<T> cls, long j4, TimeUnit timeUnit) {
        t4.getClass();
        cls.getClass();
        timeUnit.getClass();
        return t4;
    }

    @Override // com.google.common.util.concurrent.f2
    public void c(Runnable runnable, long j4, TimeUnit timeUnit) {
        a(runnable, j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.f2
    @j1
    public <T> T d(Callable<T> callable, long j4, TimeUnit timeUnit) throws ExecutionException {
        return (T) e(callable, j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.f2
    @j1
    public <T> T e(Callable<T> callable, long j4, TimeUnit timeUnit) throws ExecutionException {
        callable.getClass();
        timeUnit.getClass();
        try {
            return callable.call();
        } catch (Error e4) {
            throw new c0((Throwable) e4);
        } catch (RuntimeException e5) {
            throw new UncheckedExecutionException(e5);
        } catch (Exception e6) {
            throw new ExecutionException(e6);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
