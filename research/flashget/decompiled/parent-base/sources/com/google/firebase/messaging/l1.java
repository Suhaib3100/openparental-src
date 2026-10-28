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
import java.io.IOException;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes6.dex */
class l1 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f60216g = new Object();

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f60217h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f60218i;

    /* renamed from: b, reason: collision with root package name */
    private final Context f60219b;

    /* renamed from: c, reason: collision with root package name */
    private final p0 f60220c;

    /* renamed from: d, reason: collision with root package name */
    private final PowerManager.WakeLock f60221d;

    /* renamed from: e, reason: collision with root package name */
    private final k1 f60222e;

    /* renamed from: f, reason: collision with root package name */
    private final long f60223f;

    /* compiled from: TopicsSyncTask.java */
    @androidx.annotation.m1
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private l1 f60224a;

        public a(l1 l1Var) {
            this.f60224a = l1Var;
        }

        public void a() {
            l1.j();
            l1.this.f60219b.registerReceiver(this, new IntentFilter(ProtectedSandApp.s("ɿ\u0001")));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            l1 l1Var = this.f60224a;
            if (l1Var == null) {
                return;
            }
            if (l1Var.i()) {
                l1.j();
                this.f60224a.f60222e.n(this.f60224a, 0L);
                context.unregisterReceiver(this);
                this.f60224a = null;
            }
        }
    }

    l1(k1 k1Var, Context context, p0 p0Var, long j4) {
        this.f60222e = k1Var;
        this.f60219b = context;
        this.f60223f = j4;
        this.f60220c = p0Var;
        this.f60221d = ((PowerManager) context.getSystemService(ProtectedSandApp.s("ʀ\u0001"))).newWakeLock(1, ProtectedSandApp.s("ʁ\u0001"));
    }

    private static String e(String str) {
        return android.support.v4.media.d.a(ProtectedSandApp.s("ʂ\u0001"), str, ProtectedSandApp.s("ʃ\u0001"));
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f60216g) {
            try {
                Boolean bool = f60218i;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, ProtectedSandApp.s("ʄ\u0001"), bool) : bool.booleanValue());
                f60218i = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z4 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z4 && Log.isLoggable(ProtectedSandApp.s("ʅ\u0001"), 3)) {
            e(str);
        }
        return z4;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f60216g) {
            try {
                Boolean bool = f60217h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, ProtectedSandApp.s("ʆ\u0001"), bool) : bool.booleanValue());
                f60217h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z4;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f60219b.getSystemService(ProtectedSandApp.s("ʇ\u0001"));
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z4 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable(ProtectedSandApp.s("ʅ\u0001"), 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f60219b)) {
            this.f60221d.acquire(f.f60038c);
        }
        try {
            try {
                this.f60222e.p(true);
            } catch (Throwable th) {
                if (h(this.f60219b)) {
                    try {
                        this.f60221d.release();
                    } catch (RuntimeException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.getMessage();
            this.f60222e.p(false);
            if (!h(this.f60219b)) {
                return;
            }
        }
        if (!this.f60220c.g()) {
            this.f60222e.p(false);
            if (h(this.f60219b)) {
                try {
                    this.f60221d.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            }
            return;
        }
        if (f(this.f60219b) && !i()) {
            new a(this).a();
            if (h(this.f60219b)) {
                try {
                    this.f60221d.release();
                    return;
                } catch (RuntimeException unused3) {
                    return;
                }
            }
            return;
        }
        if (this.f60222e.t()) {
            this.f60222e.p(false);
        } else {
            this.f60222e.u(this.f60223f);
        }
        if (!h(this.f60219b)) {
            return;
        }
        try {
            this.f60221d.release();
        } catch (RuntimeException unused4) {
        }
    }
}
