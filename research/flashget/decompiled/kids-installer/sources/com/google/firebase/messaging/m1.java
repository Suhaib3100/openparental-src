package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m1;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes2.dex */
class m1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17340a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f17341b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f17342c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<a> f17343d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private j1 f17344e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f17345f;

    /* compiled from: WithinAppServiceConnection.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f17346a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<Void> f17347b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f17346a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f17346a.getAction();
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.k1
                @Override // java.lang.Runnable
                public final void run() {
                    m1.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.l1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f17347b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f17347b.getTask();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    m1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory(ProtectedSandApp.s("ᢑ"))));
    }

    @androidx.annotation.b0("this")
    private void a() {
        while (!this.f17343d.isEmpty()) {
            this.f17343d.poll().d();
        }
    }

    private synchronized void b() {
        Log.isLoggable(ProtectedSandApp.s("ᢒ"), 3);
        while (!this.f17343d.isEmpty()) {
            Log.isLoggable(ProtectedSandApp.s("ᢓ"), 3);
            j1 j1Var = this.f17344e;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                d();
                return;
            } else {
                Log.isLoggable(ProtectedSandApp.s("ᢔ"), 3);
                this.f17344e.c(this.f17343d.poll());
            }
        }
    }

    @androidx.annotation.b0("this")
    private void d() {
        Log.isLoggable(ProtectedSandApp.s("ᢕ"), 3);
        if (this.f17345f) {
            return;
        }
        this.f17345f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f17340a, this.f17341b, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f17345f = false;
        a();
    }

    @x1.a
    synchronized Task<Void> c(Intent intent) {
        a aVar;
        Log.isLoggable(ProtectedSandApp.s("ᢖ"), 3);
        aVar = new a(intent);
        aVar.c(this.f17342c);
        this.f17343d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(ProtectedSandApp.s("ᢗ"), 3)) {
            Objects.toString(componentName);
        }
        this.f17345f = false;
        if (iBinder instanceof j1) {
            this.f17344e = (j1) iBinder;
            b();
        } else {
            Objects.toString(iBinder);
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(ProtectedSandApp.s("ᢘ"), 3)) {
            Objects.toString(componentName);
        }
        b();
    }

    @androidx.annotation.m1
    m1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f17343d = new ArrayDeque();
        this.f17345f = false;
        Context applicationContext = context.getApplicationContext();
        this.f17340a = applicationContext;
        this.f17341b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f17342c = scheduledExecutorService;
    }
}
