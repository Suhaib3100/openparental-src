package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15631a;

    /* renamed from: b, reason: collision with root package name */
    private Task<Void> f15632b = Tasks.forResult(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f15633c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Boolean> f15634d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f15634d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f15636a;

        b(Runnable runnable) {
            this.f15636a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.f15636a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    class c<T> implements Continuation<Void, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f15638a;

        c(Callable callable) {
            this.f15638a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(@androidx.annotation.o0 Task<Void> task) throws Exception {
            return (T) this.f15638a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    class d<T> implements Continuation<T, Void> {
        d() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(@androidx.annotation.o0 Task<T> task) throws Exception {
            return null;
        }
    }

    public n(Executor executor) {
        this.f15631a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.f15631a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f15634d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException(ProtectedSandApp.s("ᐞ"));
        }
    }

    public Executor c() {
        return this.f15631a;
    }

    Task<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f15633c) {
            continueWith = this.f15632b.continueWith(this.f15631a, new c(callable));
            this.f15632b = d(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f15633c) {
            continueWithTask = this.f15632b.continueWithTask(this.f15631a, new c(callable));
            this.f15632b = d(continueWithTask);
        }
        return continueWithTask;
    }
}
