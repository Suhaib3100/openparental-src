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
import java.io.IOException;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes2.dex */
class f1 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f17281t = new Object();

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f17282u;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f17283v;

    /* renamed from: o, reason: collision with root package name */
    private final Context f17284o;

    /* renamed from: p, reason: collision with root package name */
    private final k0 f17285p;

    /* renamed from: q, reason: collision with root package name */
    private final PowerManager.WakeLock f17286q;

    /* renamed from: r, reason: collision with root package name */
    private final e1 f17287r;

    /* renamed from: s, reason: collision with root package name */
    private final long f17288s;

    /* compiled from: TopicsSyncTask.java */
    @androidx.annotation.m1
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        @androidx.annotation.b0("this")
        private f1 f17289a;

        public a(f1 f1Var) {
            this.f17289a = f1Var;
        }

        public void a() {
            f1.j();
            f1.this.f17284o.registerReceiver(this, new IntentFilter(ProtectedSandApp.s("᠅")));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            f1 f1Var = this.f17289a;
            if (f1Var == null) {
                return;
            }
            if (f1Var.i()) {
                f1.j();
                this.f17289a.f17287r.n(this.f17289a, 0L);
                context.unregisterReceiver(this);
                this.f17289a = null;
            }
        }
    }

    f1(e1 e1Var, Context context, k0 k0Var, long j5) {
        this.f17287r = e1Var;
        this.f17284o = context;
        this.f17288s = j5;
        this.f17285p = k0Var;
        this.f17286q = ((PowerManager) context.getSystemService(ProtectedSandApp.s("᠆"))).newWakeLock(1, ProtectedSandApp.s("᠇"));
    }

    private static String e(String str) {
        return androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("᠈"), str, ProtectedSandApp.s("᠉"));
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f17281t) {
            Boolean bool = f17283v;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, ProtectedSandApp.s("᠊"), bool) : bool.booleanValue());
            f17283v = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable(ProtectedSandApp.s("᠋"), 3)) {
            e(str);
        }
        return z5;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f17281t) {
            Boolean bool = f17282u;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, ProtectedSandApp.s("᠌"), bool) : bool.booleanValue());
            f17282u = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z5;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f17284o.getSystemService(ProtectedSandApp.s("᠍"));
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z5 = activeNetworkInfo.isConnected();
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable(ProtectedSandApp.s("\u180e"), 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f17284o)) {
            this.f17286q.acquire(e.f17159c);
        }
        try {
            try {
                this.f17287r.p(true);
            } catch (IOException e6) {
                e6.getMessage();
                this.f17287r.p(false);
                if (!h(this.f17284o)) {
                    return;
                }
            }
            if (!this.f17285p.g()) {
                this.f17287r.p(false);
                if (h(this.f17284o)) {
                    try {
                        this.f17286q.release();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                return;
            }
            if (f(this.f17284o) && !i()) {
                new a(this).a();
                if (h(this.f17284o)) {
                    try {
                        this.f17286q.release();
                        return;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                return;
            }
            if (this.f17287r.t()) {
                this.f17287r.p(false);
            } else {
                this.f17287r.u(this.f17288s);
            }
            if (!h(this.f17284o)) {
                return;
            }
            try {
                this.f17286q.release();
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th) {
            if (h(this.f17284o)) {
                try {
                    this.f17286q.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
