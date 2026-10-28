package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s1;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes6.dex */
class s1 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    private final Context f60315b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f60316c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f60317d;

    /* renamed from: e, reason: collision with root package name */
    private final Queue<a> f60318e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.q0
    private p1 f60319f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f60320g;

    /* compiled from: WithinAppServiceConnection.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f60321a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<Void> f60322b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f60321a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f60321a.getAction();
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.q1
                @Override // java.lang.Runnable
                public final void run() {
                    s1.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.r1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f60322b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f60322b.getTask();
        }
    }

    s1(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    @androidx.annotation.b0("this")
    private void b() {
        while (!this.f60318e.isEmpty()) {
            this.f60318e.poll().d();
        }
    }

    private synchronized void c() {
        try {
            Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3);
            while (!this.f60318e.isEmpty()) {
                Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3);
                p1 p1Var = this.f60319f;
                if (p1Var == null || !p1Var.isBinderAlive()) {
                    e();
                    return;
                } else {
                    Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3);
                    this.f60319f.c(this.f60318e.poll());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @androidx.annotation.b0("this")
    private void e() {
        Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3);
        if (this.f60320g) {
            return;
        }
        this.f60320g = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f60315b, this.f60316c, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f60320g = false;
        b();
    }

    @f9.a
    synchronized Task<Void> d(Intent intent) {
        a aVar;
        Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3);
        aVar = new a(intent);
        aVar.c(this.f60317d);
        this.f60318e.add(aVar);
        c();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3)) {
                Objects.toString(componentName);
            }
            this.f60320g = false;
            if (iBinder instanceof p1) {
                this.f60319f = (p1) iBinder;
                c();
            } else {
                Objects.toString(iBinder);
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(ProtectedSandApp.s("˿\u0001"), 3)) {
            Objects.toString(componentName);
        }
        c();
    }

    @androidx.annotation.m1
    s1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f60318e = new ArrayDeque();
        this.f60320g = false;
        Context applicationContext = context.getApplicationContext();
        this.f60315b = applicationContext;
        this.f60316c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f60317d = scheduledExecutorService;
    }
}
