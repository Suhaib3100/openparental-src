package org.apache.http.pool;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.util.Args;

@ThreadSafe
/* loaded from: classes3.dex */
abstract class PoolEntryFuture<T> implements Future<T> {
    private final FutureCallback<T> callback;
    private volatile boolean cancelled;
    private volatile boolean completed;
    private final Condition condition;
    private final Lock lock;
    private T result;

    PoolEntryFuture(Lock lock, FutureCallback<T> futureCallback) {
        this.lock = lock;
        this.condition = lock.newCondition();
        this.callback = futureCallback;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean z4;
        this.lock.lock();
        try {
            if (this.cancelled) {
                throw new InterruptedException("Operation interrupted");
            }
            if (date != null) {
                z4 = this.condition.awaitUntil(date);
            } else {
                this.condition.await();
                z4 = true;
            }
            if (this.cancelled) {
                throw new InterruptedException("Operation interrupted");
            }
            this.lock.unlock();
            return z4;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        this.lock.lock();
        try {
            if (this.completed) {
                this.lock.unlock();
                return false;
            }
            this.completed = true;
            this.cancelled = true;
            FutureCallback<T> futureCallback = this.callback;
            if (futureCallback != null) {
                futureCallback.cancelled();
            }
            this.condition.signalAll();
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e4) {
            throw new ExecutionException(e4);
        }
    }

    protected abstract T getPoolEntry(long j4, TimeUnit timeUnit) throws IOException, InterruptedException, TimeoutException;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.completed;
    }

    public void wakeup() {
        this.lock.lock();
        try {
            this.condition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        T t4;
        Args.notNull(timeUnit, "Time unit");
        this.lock.lock();
        try {
            try {
                if (this.completed) {
                    t4 = this.result;
                } else {
                    this.result = getPoolEntry(j4, timeUnit);
                    this.completed = true;
                    FutureCallback<T> futureCallback = this.callback;
                    if (futureCallback != null) {
                        futureCallback.completed(this.result);
                    }
                    t4 = this.result;
                }
                return t4;
            } catch (IOException e4) {
                this.completed = true;
                this.result = null;
                FutureCallback<T> futureCallback2 = this.callback;
                if (futureCallback2 != null) {
                    futureCallback2.failed(e4);
                }
                throw new ExecutionException(e4);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
