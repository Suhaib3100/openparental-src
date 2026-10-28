package com.google.firebase.remoteconfig.internal;

import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ConfigCacheClient.java */
@androidx.annotation.d
/* loaded from: classes2.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    static final long f17920d = 5;

    /* renamed from: e, reason: collision with root package name */
    @b0("ConfigCacheClient.class")
    private static final Map<String, g> f17921e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Executor f17922f = new com.google.firebase.messaging.h();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17923a;

    /* renamed from: b, reason: collision with root package name */
    private final v f17924b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    @b0("this")
    private Task<h> f17925c = null;

    /* compiled from: ConfigCacheClient.java */
    /* loaded from: classes3.dex */
    private static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f17926a;

        private b() {
            this.f17926a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.f17926a.await();
        }

        public boolean b(long j5, TimeUnit timeUnit) throws InterruptedException {
            return this.f17926a.await(j5, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f17926a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@o0 Exception exc) {
            this.f17926a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f17926a.countDown();
        }
    }

    private g(Executor executor, v vVar) {
        this.f17923a = executor;
        this.f17924b = vVar;
    }

    private static <TResult> TResult c(Task<TResult> task, long j5, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f17922f;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.b(j5, timeUnit)) {
            throw new TimeoutException(ProtectedSandApp.s("᥎"));
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    @m1
    public static synchronized void e() {
        synchronized (g.class) {
            f17921e.clear();
        }
    }

    public static synchronized g j(Executor executor, v vVar) {
        g gVar;
        synchronized (g.class) {
            String c6 = vVar.c();
            Map<String, g> map = f17921e;
            if (!map.containsKey(c6)) {
                map.put(c6, new g(executor, vVar));
            }
            gVar = map.get(c6);
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k(h hVar) throws Exception {
        return this.f17924b.f(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task l(boolean z5, h hVar, Void r32) throws Exception {
        if (z5) {
            o(hVar);
        }
        return Tasks.forResult(hVar);
    }

    private synchronized void o(h hVar) {
        this.f17925c = Tasks.forResult(hVar);
    }

    public void d() {
        synchronized (this) {
            this.f17925c = Tasks.forResult(null);
        }
        this.f17924b.a();
    }

    public synchronized Task<h> f() {
        Task<h> task = this.f17925c;
        if (task == null || (task.isComplete() && !this.f17925c.isSuccessful())) {
            Executor executor = this.f17923a;
            final v vVar = this.f17924b;
            Objects.requireNonNull(vVar);
            this.f17925c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return v.this.e();
                }
            });
        }
        return this.f17925c;
    }

    @q0
    public h g() {
        return h(f17920d);
    }

    @q0
    @m1
    h h(long j5) {
        synchronized (this) {
            Task<h> task = this.f17925c;
            if (task == null || !task.isSuccessful()) {
                try {
                    return (h) c(f(), j5, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            }
            return this.f17925c.getResult();
        }
    }

    @q0
    @m1
    synchronized Task<h> i() {
        return this.f17925c;
    }

    public Task<h> m(h hVar) {
        return n(hVar, true);
    }

    public Task<h> n(final h hVar, final boolean z5) {
        return Tasks.call(this.f17923a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k5;
                k5 = g.this.k(hVar);
                return k5;
            }
        }).onSuccessTask(this.f17923a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task l5;
                l5 = g.this.l(z5, hVar, (Void) obj);
                return l5;
            }
        });
    }
}
