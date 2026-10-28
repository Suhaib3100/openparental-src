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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
class a1 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final long f17109o;

    /* renamed from: p, reason: collision with root package name */
    private final PowerManager.WakeLock f17110p;

    /* renamed from: q, reason: collision with root package name */
    private final FirebaseMessaging f17111q;

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    @androidx.annotation.m1
    ExecutorService f17112r = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(ProtectedSandApp.s("\u1716")));

    /* compiled from: SyncTask.java */
    @androidx.annotation.m1
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private a1 f17113a;

        public a(a1 a1Var) {
            this.f17113a = a1Var;
        }

        public void a() {
            a1.c();
            this.f17113a.b().registerReceiver(this, new IntentFilter(ProtectedSandApp.s("᜕")));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a1 a1Var = this.f17113a;
            if (a1Var != null && a1Var.d()) {
                a1.c();
                this.f17113a.f17111q.s(this.f17113a, 0L);
                this.f17113a.b().unregisterReceiver(this);
                this.f17113a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @androidx.annotation.m1
    public a1(FirebaseMessaging firebaseMessaging, long j5) {
        this.f17111q = firebaseMessaging;
        this.f17109o = j5;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService(ProtectedSandApp.s("\u1717"))).newWakeLock(1, ProtectedSandApp.s("\u1718"));
        this.f17110p = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable(ProtectedSandApp.s("\u1719"), 3);
    }

    Context b() {
        return this.f17111q.t();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService(ProtectedSandApp.s("\u171a"));
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @androidx.annotation.m1
    boolean e() throws IOException {
        try {
            if (this.f17111q.n() == null) {
                return false;
            }
            Log.isLoggable(ProtectedSandApp.s("\u171b"), 3);
            return true;
        } catch (IOException e6) {
            if (f0.h(e6.getMessage())) {
                e6.getMessage();
                return false;
            }
            if (e6.getMessage() == null) {
                return false;
            }
            throw e6;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (w0.b().e(b())) {
            this.f17110p.acquire();
        }
        try {
            try {
                this.f17111q.U(true);
            } catch (IOException e6) {
                e6.getMessage();
                this.f17111q.U(false);
                if (!w0.b().e(b())) {
                    return;
                }
            }
            if (!this.f17111q.D()) {
                this.f17111q.U(false);
                if (w0.b().e(b())) {
                    this.f17110p.release();
                    return;
                }
                return;
            }
            if (w0.b().d(b()) && !d()) {
                new a(this).a();
                if (w0.b().e(b())) {
                    this.f17110p.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f17111q.U(false);
            } else {
                this.f17111q.Y(this.f17109o);
            }
            if (!w0.b().e(b())) {
                return;
            }
            this.f17110p.release();
        } catch (Throwable th) {
            if (w0.b().e(b())) {
                this.f17110p.release();
            }
            throw th;
        }
    }
}
