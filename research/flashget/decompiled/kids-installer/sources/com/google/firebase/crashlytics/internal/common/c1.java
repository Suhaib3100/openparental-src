package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15570a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f15571b = b0.c(ProtectedSandApp.s("Ꮧ"));

    private c1() {
    }

    public static /* synthetic */ Object c(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static <T> T f(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f15571b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.z0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return c1.c(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException(ProtectedSandApp.s("Ꮨ"));
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j5, TimeUnit timeUnit) {
        boolean z5 = false;
        try {
            long nanos = timeUnit.toNanos(j5);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> Task<T> h(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.b1
            @Override // java.lang.Runnable
            public final void run() {
                c1.k(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static /* synthetic */ Object i(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.x0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Object j5;
                    j5 = c1.j(TaskCompletionSource.this, task);
                    return j5;
                }
            });
        } catch (Exception e6) {
            taskCompletionSource.setException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void l(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void m(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> n(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.y0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void l5;
                l5 = c1.l(TaskCompletionSource.this, task3);
                return l5;
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> o(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.a1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m5;
                m5 = c1.m(TaskCompletionSource.this, task3);
                return m5;
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
