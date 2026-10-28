package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: Dispatcher.java */
/* loaded from: classes6.dex */
class j {
    static final int A = 8;
    static final int B = 9;
    static final int C = 10;
    static final int D = 11;
    static final int E = 12;
    static final int F = 13;
    private static final String G = "Dispatcher";
    private static final int H = 200;

    /* renamed from: q, reason: collision with root package name */
    private static final int f70884q = 500;

    /* renamed from: r, reason: collision with root package name */
    private static final int f70885r = 1;

    /* renamed from: s, reason: collision with root package name */
    private static final int f70886s = 0;

    /* renamed from: t, reason: collision with root package name */
    static final int f70887t = 1;

    /* renamed from: u, reason: collision with root package name */
    static final int f70888u = 2;

    /* renamed from: v, reason: collision with root package name */
    static final int f70889v = 3;

    /* renamed from: w, reason: collision with root package name */
    static final int f70890w = 4;

    /* renamed from: x, reason: collision with root package name */
    static final int f70891x = 5;

    /* renamed from: y, reason: collision with root package name */
    static final int f70892y = 6;

    /* renamed from: z, reason: collision with root package name */
    static final int f70893z = 7;

    /* renamed from: a, reason: collision with root package name */
    final c f70894a;

    /* renamed from: b, reason: collision with root package name */
    final Context f70895b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f70896c;

    /* renamed from: d, reason: collision with root package name */
    final k f70897d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, com.squareup.picasso.c> f70898e;

    /* renamed from: f, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f70899f;

    /* renamed from: g, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f70900g;

    /* renamed from: h, reason: collision with root package name */
    final Set<Object> f70901h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f70902i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f70903j;

    /* renamed from: k, reason: collision with root package name */
    final e f70904k;

    /* renamed from: l, reason: collision with root package name */
    final f0 f70905l;

    /* renamed from: m, reason: collision with root package name */
    final List<com.squareup.picasso.c> f70906m;

    /* renamed from: n, reason: collision with root package name */
    final d f70907n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f70908o;

    /* renamed from: p, reason: collision with root package name */
    boolean f70909p;

    /* compiled from: Dispatcher.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f70907n.b();
        }
    }

    /* compiled from: Dispatcher.java */
    private static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final j f70911a;

        /* compiled from: Dispatcher.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Message f70912b;

            a(Message message) {
                this.f70912b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f70912b.what);
            }
        }

        b(Looper looper, j jVar) {
            super(looper);
            this.f70911a = jVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f70911a.x((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.f70911a.q((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    w.f70969q.post(new a(message));
                    break;
                case 4:
                    this.f70911a.r((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.f70911a.w((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.f70911a.s((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.f70911a.p();
                    break;
                case 9:
                    this.f70911a.t((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f70911a.o(message.arg1 == 1);
                    break;
                case 11:
                    this.f70911a.u(message.obj);
                    break;
                case 12:
                    this.f70911a.v(message.obj);
                    break;
            }
        }
    }

    /* compiled from: Dispatcher.java */
    static class c extends HandlerThread {
        c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher.java */
    static class d extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        static final String f70914b = "state";

        /* renamed from: a, reason: collision with root package name */
        private final j f70915a;

        d(j jVar) {
            this.f70915a = jVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f70915a.f70908o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f70915a.f70895b.registerReceiver(this, intentFilter);
        }

        void b() {
            this.f70915a.f70895b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f70915a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f70915a.f(((ConnectivityManager) k0.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    j(Context context, ExecutorService executorService, Handler handler, k kVar, e eVar, f0 f0Var) {
        c cVar = new c();
        this.f70894a = cVar;
        cVar.start();
        k0.i(cVar.getLooper());
        this.f70895b = context;
        this.f70896c = executorService;
        this.f70898e = new LinkedHashMap();
        this.f70899f = new WeakHashMap();
        this.f70900g = new WeakHashMap();
        this.f70901h = new LinkedHashSet();
        this.f70902i = new b(cVar.getLooper(), this);
        this.f70897d = kVar;
        this.f70903j = handler;
        this.f70904k = eVar;
        this.f70905l = f0Var;
        this.f70906m = new ArrayList(4);
        this.f70909p = k0.q(context);
        this.f70908o = k0.p(context, "android.permission.ACCESS_NETWORK_STATE");
        d dVar = new d(this);
        this.f70907n = dVar;
        dVar.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        Bitmap bitmap = cVar.f70800n;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f70906m.add(cVar);
        if (this.f70902i.hasMessages(7)) {
            return;
        }
        this.f70902i.sendEmptyMessageDelayed(7, 200L);
    }

    private void k() {
        if (this.f70899f.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it = this.f70899f.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.a next = it.next();
            it.remove();
            if (next.g().f70984n) {
                k0.t("Dispatcher", "replaying", next.i().e());
            }
            y(next, false);
        }
    }

    private void l(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).q().f70984n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(k0.k(cVar));
        }
        k0.t("Dispatcher", "delivered", sb.toString());
    }

    private void m(com.squareup.picasso.a aVar) {
        Object k4 = aVar.k();
        if (k4 != null) {
            aVar.f70728k = true;
            this.f70899f.put(k4, aVar);
        }
    }

    private void n(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h4 = cVar.h();
        if (h4 != null) {
            m(h4);
        }
        List<com.squareup.picasso.a> i4 = cVar.i();
        if (i4 != null) {
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                m(i4.get(i5));
            }
        }
    }

    void b(boolean z4) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(10, z4 ? 1 : 0, 0));
    }

    void c(com.squareup.picasso.a aVar) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void d(com.squareup.picasso.c cVar) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void e(com.squareup.picasso.c cVar) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(Object obj) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    void h(Object obj) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    void i(com.squareup.picasso.c cVar) {
        Handler handler = this.f70902i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void j(com.squareup.picasso.a aVar) {
        Handler handler = this.f70902i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void o(boolean z4) {
        this.f70909p = z4;
    }

    void p() {
        ArrayList arrayList = new ArrayList(this.f70906m);
        this.f70906m.clear();
        Handler handler = this.f70903j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        l(arrayList);
    }

    void q(com.squareup.picasso.a aVar) {
        String d5 = aVar.d();
        com.squareup.picasso.c cVar = this.f70898e.get(d5);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f70898e.remove(d5);
                if (aVar.g().f70984n) {
                    k0.t("Dispatcher", "canceled", aVar.i().e());
                }
            }
        }
        if (this.f70901h.contains(aVar.j())) {
            this.f70900g.remove(aVar.k());
            if (aVar.g().f70984n) {
                k0.u("Dispatcher", "canceled", aVar.i().e(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a remove = this.f70899f.remove(aVar.k());
        if (remove == null || !remove.g().f70984n) {
            return;
        }
        k0.u("Dispatcher", "canceled", remove.i().e(), "from replaying");
    }

    void r(com.squareup.picasso.c cVar) {
        if (s.shouldWriteToMemoryCache(cVar.p())) {
            this.f70904k.a(cVar.n(), cVar.s());
        }
        this.f70898e.remove(cVar.n());
        a(cVar);
        if (cVar.q().f70984n) {
            k0.u("Dispatcher", "batched", k0.k(cVar), "for completion");
        }
    }

    void s(com.squareup.picasso.c cVar, boolean z4) {
        if (cVar.q().f70984n) {
            k0.u("Dispatcher", "batched", k0.k(cVar), "for error".concat(z4 ? " (will replay)" : ""));
        }
        this.f70898e.remove(cVar.n());
        a(cVar);
    }

    void t(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f70896c;
        if (executorService instanceof y) {
            ((y) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        k();
    }

    void u(Object obj) {
        if (this.f70901h.add(obj)) {
            Iterator<com.squareup.picasso.c> it = this.f70898e.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.c next = it.next();
                boolean z4 = next.q().f70984n;
                com.squareup.picasso.a h4 = next.h();
                List<com.squareup.picasso.a> i4 = next.i();
                boolean z5 = (i4 == null || i4.isEmpty()) ? false : true;
                if (h4 != null || z5) {
                    if (h4 != null && h4.j().equals(obj)) {
                        next.f(h4);
                        this.f70900g.put(h4.k(), h4);
                        if (z4) {
                            k0.u("Dispatcher", "paused", h4.f70719b.e(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z5) {
                        for (int size = i4.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = i4.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f70900g.put(aVar.k(), aVar);
                                if (z4) {
                                    k0.u("Dispatcher", "paused", aVar.f70719b.e(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z4) {
                            k0.u("Dispatcher", "canceled", k0.k(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void v(Object obj) {
        if (this.f70901h.remove(obj)) {
            Iterator<com.squareup.picasso.a> it = this.f70900g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f70903j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    void w(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        boolean z4 = false;
        if (this.f70896c.isShutdown()) {
            s(cVar, false);
            return;
        }
        if (cVar.w(this.f70909p, this.f70908o ? ((ConnectivityManager) k0.o(this.f70895b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.q().f70984n) {
                k0.t("Dispatcher", "retrying", k0.k(cVar));
            }
            if (cVar.k() instanceof u.a) {
                cVar.f70796j |= t.NO_CACHE.index;
            }
            cVar.f70801o = this.f70896c.submit(cVar);
            return;
        }
        if (this.f70908o && cVar.x()) {
            z4 = true;
        }
        s(cVar, z4);
        if (z4) {
            n(cVar);
        }
    }

    void x(com.squareup.picasso.a aVar) {
        y(aVar, true);
    }

    void y(com.squareup.picasso.a aVar, boolean z4) {
        if (this.f70901h.contains(aVar.j())) {
            this.f70900g.put(aVar.k(), aVar);
            if (aVar.g().f70984n) {
                k0.u("Dispatcher", "paused", aVar.f70719b.e(), androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(new StringBuilder("because tag '"), aVar.j(), "' is paused"));
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.f70898e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.f70896c.isShutdown()) {
            if (aVar.g().f70984n) {
                k0.u("Dispatcher", "ignored", aVar.f70719b.e(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c g4 = com.squareup.picasso.c.g(aVar.g(), this, this.f70904k, this.f70905l, aVar);
        g4.f70801o = this.f70896c.submit(g4);
        this.f70898e.put(aVar.d(), g4);
        if (z4) {
            this.f70899f.remove(aVar.k());
        }
        if (aVar.g().f70984n) {
            k0.t("Dispatcher", "enqueued", aVar.f70719b.e());
        }
    }

    void z() {
        ExecutorService executorService = this.f70896c;
        if (executorService instanceof y) {
            executorService.shutdown();
        }
        this.f70897d.shutdown();
        this.f70894a.quit();
        w.f70969q.post(new a());
    }
}
