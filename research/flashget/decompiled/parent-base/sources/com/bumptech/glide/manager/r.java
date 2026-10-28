package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.util.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes3.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f44707d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f44708e = ProtectedSandApp.s("ੂ");

    /* renamed from: a, reason: collision with root package name */
    private final c f44709a;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    final Set<b.a> f44710b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @b0("this")
    private boolean f44711c;

    /* compiled from: SingletonConnectivityReceiver.java */
    class a implements h.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f44712a;

        a(Context context) {
            this.f44712a = context;
        }

        @Override // com.bumptech.glide.util.h.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f44712a.getSystemService(ProtectedSandApp.s("਼"));
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    class b implements b.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z4) {
            ArrayList arrayList;
            com.bumptech.glide.util.o.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f44710b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z4);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private interface c {
        void a();

        boolean b();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    @x0(24)
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f44715a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f44716b;

        /* renamed from: c, reason: collision with root package name */
        private final h.b<ConnectivityManager> f44717c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f44718d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        class a extends ConnectivityManager.NetworkCallback {

            /* compiled from: SingletonConnectivityReceiver.java */
            /* renamed from: com.bumptech.glide.manager.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0751a implements Runnable {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f44720b;

                RunnableC0751a(boolean z4) {
                    this.f44720b = z4;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f44720b);
                }
            }

            a() {
            }

            private void b(boolean z4) {
                com.bumptech.glide.util.o.y(new RunnableC0751a(z4));
            }

            void a(boolean z4) {
                com.bumptech.glide.util.o.b();
                d dVar = d.this;
                boolean z5 = dVar.f44715a;
                dVar.f44715a = z4;
                if (z5 != z4) {
                    dVar.f44716b.a(z4);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@o0 Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@o0 Network network) {
                b(false);
            }
        }

        d(h.b<ConnectivityManager> bVar, b.a aVar) {
            this.f44717c = bVar;
            this.f44716b = aVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public void a() {
            this.f44717c.get().unregisterNetworkCallback(this.f44718d);
        }

        @Override // com.bumptech.glide.manager.r.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f44715a = this.f44717c.get().getActiveNetwork() != null;
            try {
                this.f44717c.get().registerDefaultNetworkCallback(this.f44718d);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable(ProtectedSandApp.s("\u0a3d"), 5);
                return false;
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private static final class e implements c {

        /* renamed from: g, reason: collision with root package name */
        static final Executor f44722g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a, reason: collision with root package name */
        final Context f44723a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f44724b;

        /* renamed from: c, reason: collision with root package name */
        private final h.b<ConnectivityManager> f44725c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f44726d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f44727e;

        /* renamed from: f, reason: collision with root package name */
        final BroadcastReceiver f44728f = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@o0 Context context, Intent intent) {
                e.this.e();
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f44726d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f44723a.registerReceiver(eVar2.f44728f, new IntentFilter(ProtectedSandApp.s("ਾ")));
                    e.this.f44727e = true;
                } catch (SecurityException unused) {
                    Log.isLoggable(ProtectedSandApp.s("ਿ"), 5);
                    e.this.f44727e = false;
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f44727e) {
                    e.this.f44727e = false;
                    e eVar = e.this;
                    eVar.f44723a.unregisterReceiver(eVar.f44728f);
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z4 = e.this.f44726d;
                e eVar = e.this;
                eVar.f44726d = eVar.c();
                if (z4 != e.this.f44726d) {
                    if (Log.isLoggable(ProtectedSandApp.s("ੀ"), 3)) {
                        boolean z5 = e.this.f44726d;
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.f44726d);
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: com.bumptech.glide.manager.r$e$e, reason: collision with other inner class name */
        class RunnableC0752e implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f44733b;

            RunnableC0752e(boolean z4) {
                this.f44733b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f44724b.a(this.f44733b);
            }
        }

        e(Context context, h.b<ConnectivityManager> bVar, b.a aVar) {
            this.f44723a = context.getApplicationContext();
            this.f44725c = bVar;
            this.f44724b = aVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public void a() {
            f44722g.execute(new c());
        }

        @Override // com.bumptech.glide.manager.r.c
        public boolean b() {
            f44722g.execute(new b());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.f44725c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException unused) {
                Log.isLoggable(ProtectedSandApp.s("ੁ"), 5);
                return true;
            }
        }

        void d(boolean z4) {
            com.bumptech.glide.util.o.y(new RunnableC0752e(z4));
        }

        void e() {
            f44722g.execute(new d());
        }
    }

    private r(@o0 Context context) {
        this.f44709a = new d(com.bumptech.glide.util.h.a(new a(context)), new b());
    }

    static r a(@o0 Context context) {
        if (f44707d == null) {
            synchronized (r.class) {
                try {
                    if (f44707d == null) {
                        f44707d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f44707d;
    }

    @b0("this")
    private void b() {
        if (this.f44711c || this.f44710b.isEmpty()) {
            return;
        }
        this.f44711c = this.f44709a.b();
    }

    @b0("this")
    private void c() {
        if (this.f44711c && this.f44710b.isEmpty()) {
            this.f44709a.a();
            this.f44711c = false;
        }
    }

    @m1
    static void e() {
        f44707d = null;
    }

    synchronized void d(b.a aVar) {
        this.f44710b.add(aVar);
        b();
    }

    synchronized void f(b.a aVar) {
        this.f44710b.remove(aVar);
        c();
    }
}
