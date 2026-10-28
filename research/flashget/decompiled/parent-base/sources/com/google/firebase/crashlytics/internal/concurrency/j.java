package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.m1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsWorker.java */
/* loaded from: classes6.dex */
public class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f58861b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f58862c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Task<?> f58863d = Tasks.forResult(null);

    j(ExecutorService executorService) {
        this.f58861b = executorService;
    }

    public static /* synthetic */ Task a(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ Task f(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ Task g(Callable callable, Task task) {
        return (Task) callable.call();
    }

    private static /* synthetic */ void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task k(Callable callable, Task task) throws Exception {
        return Tasks.forResult(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task l(Runnable runnable, Task task) throws Exception {
        runnable.run();
        return Tasks.forResult(null);
    }

    private static /* synthetic */ Task m(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    private static /* synthetic */ Task n(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    private static /* synthetic */ Task o(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task p(SuccessContinuation successContinuation, Task task) throws Exception {
        return task.isSuccessful() ? successContinuation.then(task.getResult()) : task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f58861b.execute(runnable);
    }

    @m1
    public void h() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(q(new e()), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    public ExecutorService i() {
        return this.f58861b;
    }

    @f9.a
    public Task<Void> q(final Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f58862c) {
            continueWithTask = this.f58863d.continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Task l4;
                    l4 = j.l(runnable, task);
                    return l4;
                }
            });
            this.f58863d = continueWithTask;
        }
        return continueWithTask;
    }

    @f9.a
    public <T> Task<T> r(final Callable<T> callable) {
        zzw zzwVar;
        synchronized (this.f58862c) {
            zzwVar = (Task<T>) this.f58863d.continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Task k4;
                    k4 = j.k(callable, task);
                    return k4;
                }
            });
            this.f58863d = zzwVar;
        }
        return zzwVar;
    }

    @f9.a
    public <T> Task<T> s(final Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.f58862c) {
            zzwVar = (Task<T>) this.f58863d.continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return (Task) callable.call();
                }
            });
            this.f58863d = zzwVar;
        }
        return zzwVar;
    }

    @f9.a
    public <T, R> Task<R> t(final Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        zzw zzwVar;
        synchronized (this.f58862c) {
            zzwVar = (Task<R>) this.f58863d.continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return (Task) callable.call();
                }
            }).continueWithTask(this.f58861b, continuation);
            this.f58863d = zzwVar;
        }
        return zzwVar;
    }

    @f9.a
    public <T, R> Task<R> u(final Callable<Task<T>> callable, final SuccessContinuation<T, R> successContinuation) {
        zzw zzwVar;
        synchronized (this.f58862c) {
            zzwVar = (Task<R>) this.f58863d.continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.h
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return (Task) callable.call();
                }
            }).continueWithTask(this.f58861b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Task p4;
                    p4 = j.p(SuccessContinuation.this, task);
                    return p4;
                }
            });
            this.f58863d = zzwVar;
        }
        return zzwVar;
    }
}
