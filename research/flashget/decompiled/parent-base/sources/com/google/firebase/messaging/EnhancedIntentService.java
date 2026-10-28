package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.p1;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes6.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: g, reason: collision with root package name */
    static final long f59874g = 20;

    /* renamed from: h, reason: collision with root package name */
    private static final String f59875h = ProtectedSandApp.s("ń\u0001");

    /* renamed from: c, reason: collision with root package name */
    private Binder f59877c;

    /* renamed from: e, reason: collision with root package name */
    private int f59879e;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.m1
    final ExecutorService f59876b = o.e();

    /* renamed from: d, reason: collision with root package name */
    private final Object f59878d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private int f59880f = 0;

    class a implements p1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.p1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return EnhancedIntentService.this.j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent != null) {
            n1.d(intent);
        }
        synchronized (this.f59878d) {
            try {
                int i4 = this.f59880f - 1;
                this.f59880f = i4;
                if (i4 == 0) {
                    k(this.f59879e);
                }
            } catch (Throwable th) {
                throw th;
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
        this.f59876b.execute(new Runnable() { // from class: com.google.firebase.messaging.i
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

    boolean k(int i4) {
        return stopSelfResult(i4);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable(ProtectedSandApp.s("ń\u0001"), 3);
            if (this.f59877c == null) {
                this.f59877c = new p1(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f59877c;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        this.f59876b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i4, int i5) {
        synchronized (this.f59878d) {
            this.f59879e = i5;
            this.f59880f++;
        }
        Intent e4 = e(intent);
        if (e4 == null) {
            d(intent);
            return 2;
        }
        Task<Void> j4 = j(e4);
        if (j4.isComplete()) {
            d(intent);
            return 2;
        }
        j4.addOnCompleteListener(new androidx.credentials.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.this.d(intent);
            }
        });
        return 3;
    }
}
