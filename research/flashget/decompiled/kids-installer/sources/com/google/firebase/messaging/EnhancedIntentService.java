package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.j1;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: t, reason: collision with root package name */
    static final long f16999t = 20;

    /* renamed from: u, reason: collision with root package name */
    private static final String f17000u = ProtectedSandApp.s("ᛕ");

    /* renamed from: p, reason: collision with root package name */
    private Binder f17002p;

    /* renamed from: r, reason: collision with root package name */
    private int f17004r;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.m1
    final ExecutorService f17001o = o.e();

    /* renamed from: q, reason: collision with root package name */
    private final Object f17003q = new Object();

    /* renamed from: s, reason: collision with root package name */
    private int f17005s = 0;

    /* loaded from: classes3.dex */
    class a implements j1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.j1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return EnhancedIntentService.this.j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent != null) {
            h1.d(intent);
        }
        synchronized (this.f17003q) {
            int i5 = this.f17005s - 1;
            this.f17005s = i5;
            if (i5 == 0) {
                k(this.f17004r);
            }
        }
    }

    private /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public Task<Void> j(final Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f17001o.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.i(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i5) {
        return stopSelfResult(i5);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable(ProtectedSandApp.s("ᛔ"), 3);
        if (this.f17002p == null) {
            this.f17002p = new j1(new a());
        }
        return this.f17002p;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        this.f17001o.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i5, int i6) {
        synchronized (this.f17003q) {
            this.f17004r = i6;
            this.f17005s++;
        }
        Intent e6 = e(intent);
        if (e6 == null) {
            d(intent);
            return 2;
        }
        Task<Void> j5 = j(e6);
        if (j5.isComplete()) {
            d(intent);
            return 2;
        }
        j5.addOnCompleteListener(new h(), new OnCompleteListener() { // from class: com.google.firebase.messaging.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.this.d(intent);
            }
        });
        return 3;
    }
}
