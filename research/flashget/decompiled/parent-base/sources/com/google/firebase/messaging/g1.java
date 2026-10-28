package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes6.dex */
class g1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final long f60135b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f60136c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f60137d;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    @androidx.annotation.m1
    ExecutorService f60138e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(ProtectedSandApp.s("Ⱥ\u0001")));

    /* compiled from: SyncTask.java */
    @androidx.annotation.m1
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private g1 f60139a;

        public a(g1 g1Var) {
            this.f60139a = g1Var;
        }

        public void a() {
            g1.c();
            this.f60139a.b().registerReceiver(this, new IntentFilter(ProtectedSandApp.s("ȹ\u0001")));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            g1 g1Var = this.f60139a;
            if (g1Var != null && g1Var.d()) {
                g1.c();
                this.f60139a.f60137d.w(this.f60139a, 0L);
                this.f60139a.b().unregisterReceiver(this);
                this.f60139a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @androidx.annotation.m1
    public g1(FirebaseMessaging firebaseMessaging, long j4) {
        this.f60137d = firebaseMessaging;
        this.f60135b = j4;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService(ProtectedSandApp.s("Ȼ\u0001"))).newWakeLock(1, ProtectedSandApp.s("ȼ\u0001"));
        this.f60136c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable(ProtectedSandApp.s("Ƚ\u0001"), 3);
    }

    Context b() {
        return this.f60137d.x();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService(ProtectedSandApp.s("Ⱦ\u0001"));
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @androidx.annotation.m1
    boolean e() throws IOException {
        try {
            if (this.f60137d.r() == null) {
                return false;
            }
            Log.isLoggable(ProtectedSandApp.s("Ƚ\u0001"), 3);
            return true;
        } catch (IOException e4) {
            if (j0.i(e4.getMessage())) {
                e4.getMessage();
                return false;
            }
            if (e4.getMessage() == null) {
                return false;
            }
            throw e4;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (c1.b().e(b())) {
            this.f60136c.acquire();
        }
        try {
            try {
                this.f60137d.e0(true);
            } catch (IOException e4) {
                e4.getMessage();
                this.f60137d.e0(false);
                if (!c1.b().e(b())) {
                    return;
                }
            }
            if (!this.f60137d.J()) {
                this.f60137d.e0(false);
                if (c1.b().e(b())) {
                    this.f60136c.release();
                    return;
                }
                return;
            }
            if (c1.b().d(b()) && !d()) {
                new a(this).a();
                if (c1.b().e(b())) {
                    this.f60136c.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f60137d.e0(false);
            } else {
                this.f60137d.j0(this.f60135b);
            }
            if (!c1.b().e(b())) {
                return;
            }
            this.f60136c.release();
        } catch (Throwable th) {
            if (c1.b().e(b())) {
                this.f60136c.release();
            }
            throw th;
        }
    }
}
