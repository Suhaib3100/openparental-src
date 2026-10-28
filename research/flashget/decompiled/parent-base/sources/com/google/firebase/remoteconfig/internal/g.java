package com.google.firebase.remoteconfig.internal;

import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    static final long f60447d = 5;

    /* renamed from: e, reason: collision with root package name */
    @b0("ConfigCacheClient.class")
    private static final Map<String, g> f60448e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Executor f60449f = new androidx.credentials.k();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f60450a;

    /* renamed from: b, reason: collision with root package name */
    private final v f60451b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    @b0("this")
    private Task<h> f60452c = null;

    /* compiled from: ConfigCacheClient.java */
    private static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f60453a;

        private b() {
            this.f60453a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.f60453a.await();
        }

        public boolean b(long j4, TimeUnit timeUnit) throws InterruptedException {
            return this.f60453a.await(j4, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f60453a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@o0 Exception exc) {
            this.f60453a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f60453a.countDown();
        }
    }

    private g(Executor executor, v vVar) {
        this.f60450a = executor;
        this.f60451b = vVar;
    }

    private static <TResult> TResult c(Task<TResult> task, long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f60449f;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.b(j4, timeUnit)) {
            throw new TimeoutException(ProtectedSandApp.s("ͭ\u0001"));
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    @m1
    public static synchronized void e() {
        synchronized (g.class) {
            f60448e.clear();
        }
    }

    public static synchronized g j(Executor executor, v vVar) {
        g gVar;
        synchronized (g.class) {
            try {
                String c5 = vVar.c();
                Map<String, g> map = f60448e;
                if (!map.containsKey(c5)) {
                    map.put(c5, new g(executor, vVar));
                }
                gVar = map.get(c5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    private /* synthetic */ Void k(h hVar) throws Exception {
        return this.f60451b.f(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task l(boolean z4, h hVar, Void r32) throws Exception {
        if (z4) {
            o(hVar);
        }
        return Tasks.forResult(hVar);
    }

    private synchronized void o(h hVar) {
        this.f60452c = Tasks.forResult(hVar);
    }

    public void d() {
        synchronized (this) {
            this.f60452c = Tasks.forResult(null);
        }
        this.f60451b.a();
    }

    public synchronized Task<h> f() {
        try {
            Task<h> task = this.f60452c;
            if (task != null) {
                if (task.isComplete() && !this.f60452c.isSuccessful()) {
                }
            }
            Executor executor = this.f60450a;
            final v vVar = this.f60451b;
            Objects.requireNonNull(vVar);
            this.f60452c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return v.this.e();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.f60452c;
    }

    @q0
    public h g() {
        return h(5L);
    }

    @q0
    @m1
    h h(long j4) {
        synchronized (this) {
            try {
                Task<h> task = this.f60452c;
                if (task == null || !task.isSuccessful()) {
                    try {
                        return (h) c(f(), j4, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return this.f60452c.getResult();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    @m1
    synchronized Task<h> i() {
        return this.f60452c;
    }

    public Task<h> m(h hVar) {
        return n(hVar, true);
    }

    public Task<h> n(final h hVar, final boolean z4) {
        return Tasks.call(this.f60450a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void f4;
                f4 = g.this.f60451b.f(hVar);
                return f4;
            }
        }).onSuccessTask(this.f60450a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task l4;
                l4 = g.this.l(z4, hVar, (Void) obj);
                return l4;
            }
        });
    }
}
