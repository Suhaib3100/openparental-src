package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.android.volley.a;
import com.android.volley.b;
import com.android.volley.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncRequestQueue.java */
/* loaded from: classes3.dex */
public class c extends o {

    /* renamed from: w, reason: collision with root package name */
    private static final int f40820w = 4;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private final com.android.volley.a f40821m;

    /* renamed from: n, reason: collision with root package name */
    private final com.android.volley.b f40822n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorService f40823o;

    /* renamed from: p, reason: collision with root package name */
    private ScheduledExecutorService f40824p;

    /* renamed from: q, reason: collision with root package name */
    private ExecutorService f40825q;

    /* renamed from: r, reason: collision with root package name */
    private h f40826r;

    /* renamed from: s, reason: collision with root package name */
    private final u f40827s;

    /* renamed from: t, reason: collision with root package name */
    private final List<n<?>> f40828t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f40829u;

    /* renamed from: v, reason: collision with root package name */
    private final Object f40830v;

    /* compiled from: AsyncRequestQueue.java */
    class a implements Runnable {

        /* compiled from: AsyncRequestQueue.java */
        /* renamed from: com.android.volley.c$a$a, reason: collision with other inner class name */
        class C0673a implements a.b {
            C0673a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                c.this.B();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f40821m.c(new C0673a());
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    class b implements Runnable {

        /* compiled from: AsyncRequestQueue.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.B();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h().c();
            c.this.f40823o.execute(new a());
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    /* renamed from: com.android.volley.c$c, reason: collision with other inner class name */
    class C0674c implements Comparator<Runnable> {
        C0674c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof p)) {
                return runnable2 instanceof p ? -1 : 0;
            }
            if (runnable2 instanceof p) {
                return ((p) runnable).a((p) runnable2);
            }
            return 1;
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public static class d {

        /* renamed from: b, reason: collision with root package name */
        private final com.android.volley.b f40836b;

        /* renamed from: a, reason: collision with root package name */
        @q0
        private com.android.volley.a f40835a = null;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private com.android.volley.e f40837c = null;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private h f40838d = null;

        /* renamed from: e, reason: collision with root package name */
        @q0
        private r f40839e = null;

        /* compiled from: AsyncRequestQueue.java */
        class a extends h {

            /* compiled from: AsyncRequestQueue.java */
            /* renamed from: com.android.volley.c$d$a$a, reason: collision with other inner class name */
            class ThreadFactoryC0675a implements ThreadFactory {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f40841b;

                ThreadFactoryC0675a(String str) {
                    this.f40841b = str;
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@o0 Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName(ProtectedSandApp.s("٤") + this.f40841b);
                    return newThread;
                }
            }

            a() {
            }

            private ThreadPoolExecutor d(int i4, String str, BlockingQueue<Runnable> blockingQueue) {
                return new ThreadPoolExecutor(0, i4, 60L, TimeUnit.SECONDS, blockingQueue, new ThreadFactoryC0675a(str));
            }

            private ThreadFactory e(String str) {
                return new ThreadFactoryC0675a(str);
            }

            @Override // com.android.volley.c.h
            public ExecutorService a(BlockingQueue<Runnable> blockingQueue) {
                return d(4, ProtectedSandApp.s("٥"), blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ExecutorService b(BlockingQueue<Runnable> blockingQueue) {
                return d(1, ProtectedSandApp.s("٦"), blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ScheduledExecutorService c() {
                return new ScheduledThreadPoolExecutor(0, new ThreadFactoryC0675a(ProtectedSandApp.s("٧")));
            }
        }

        public d(com.android.volley.b bVar) {
            if (bVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("٨"));
            }
            this.f40836b = bVar;
        }

        private h b() {
            return new a();
        }

        public c a() {
            com.android.volley.e eVar = this.f40837c;
            if (eVar == null && this.f40835a == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("٩"));
            }
            if (eVar == null) {
                this.f40837c = new l();
            }
            if (this.f40839e == null) {
                this.f40839e = new com.android.volley.h(new Handler(Looper.getMainLooper()));
            }
            if (this.f40838d == null) {
                this.f40838d = new a();
            }
            return new c(this.f40837c, this.f40836b, this.f40835a, this.f40839e, this.f40838d, null);
        }

        public d c(com.android.volley.a aVar) {
            this.f40835a = aVar;
            return this;
        }

        public d d(com.android.volley.e eVar) {
            this.f40837c = eVar;
            return this;
        }

        public d e(h hVar) {
            this.f40838d = hVar;
            return this;
        }

        public d f(r rVar) {
            this.f40839e = rVar;
            return this;
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private class e<T> extends p<T> {

        /* renamed from: c, reason: collision with root package name */
        e.a f40843c;

        /* renamed from: d, reason: collision with root package name */
        long f40844d;

        /* compiled from: AsyncRequestQueue.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                c.this.n(eVar.f40937b);
            }
        }

        e(n<T> nVar, e.a aVar, long j4) {
            super(nVar);
            this.f40843c = aVar;
            this.f40844d = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40937b.addMarker(ProtectedSandApp.s("٪"));
            n<T> nVar = this.f40937b;
            e.a aVar = this.f40843c;
            q<T> parseNetworkResponse = nVar.parseNetworkResponse(new com.android.volley.l(200, aVar.f40862a, false, 0L, aVar.f40869h));
            this.f40937b.addMarker(ProtectedSandApp.s("٫"));
            if (!this.f40843c.d(this.f40844d)) {
                c.this.i().a(this.f40937b, parseNetworkResponse);
                return;
            }
            this.f40937b.addMarker(ProtectedSandApp.s("٬"));
            this.f40937b.setCacheEntry(this.f40843c);
            parseNetworkResponse.f40941d = true;
            if (c.this.f40827s.c(this.f40937b)) {
                c.this.i().a(this.f40937b, parseNetworkResponse);
            } else {
                c.this.i().b(this.f40937b, parseNetworkResponse, new a());
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private class f<T> extends p<T> {

        /* renamed from: c, reason: collision with root package name */
        q<?> f40847c;

        /* compiled from: AsyncRequestQueue.java */
        class a implements a.b {
            a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                f fVar = f.this;
                c.this.y(fVar.f40937b, fVar.f40847c, true);
            }
        }

        f(n<T> nVar, q<?> qVar) {
            super(nVar);
            this.f40847c = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f40821m != null) {
                c.this.f40821m.e(this.f40937b.getCacheKey(), this.f40847c.f40939b, new a());
            } else {
                c.this.h().e(this.f40937b.getCacheKey(), this.f40847c.f40939b);
                c.this.y(this.f40937b, this.f40847c, true);
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private class g<T> extends p<T> {

        /* compiled from: AsyncRequestQueue.java */
        class a implements a.InterfaceC0671a {
            a() {
            }

            @Override // com.android.volley.a.InterfaceC0671a
            public void a(e.a aVar) {
                g gVar = g.this;
                c.this.A(aVar, gVar.f40937b);
            }
        }

        g(n<T> nVar) {
            super(nVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40937b.isCanceled()) {
                this.f40937b.finish(ProtectedSandApp.s("٭"));
                return;
            }
            this.f40937b.addMarker(ProtectedSandApp.s("ٮ"));
            if (c.this.f40821m != null) {
                c.this.f40821m.b(this.f40937b.getCacheKey(), new a());
            } else {
                c.this.A(c.this.h().get(this.f40937b.getCacheKey()), this.f40937b);
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public static abstract class h {
        public abstract ExecutorService a(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService b(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService c();
    }

    /* compiled from: AsyncRequestQueue.java */
    private class i<T> extends p<T> {

        /* renamed from: c, reason: collision with root package name */
        com.android.volley.l f40852c;

        i(n<T> nVar, com.android.volley.l lVar) {
            super(nVar);
            this.f40852c = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q<T> parseNetworkResponse = this.f40937b.parseNetworkResponse(this.f40852c);
            this.f40937b.addMarker(ProtectedSandApp.s("ٯ"));
            if (!this.f40937b.shouldCache() || parseNetworkResponse.f40939b == null) {
                c.this.y(this.f40937b, parseNetworkResponse, false);
            } else if (c.this.f40821m != null) {
                c.this.f40823o.execute(c.this.new f(this.f40937b, parseNetworkResponse));
            } else {
                c.this.f40825q.execute(c.this.new f(this.f40937b, parseNetworkResponse));
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private class j<T> extends p<T> {

        /* compiled from: AsyncRequestQueue.java */
        class a implements b.InterfaceC0672b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f40855a;

            a(long j4) {
                this.f40855a = j4;
            }

            @Override // com.android.volley.b.InterfaceC0672b
            public void a(VolleyError volleyError) {
                volleyError.b(SystemClock.elapsedRealtime() - this.f40855a);
                ExecutorService executorService = c.this.f40825q;
                j jVar = j.this;
                executorService.execute(c.this.new k(jVar.f40937b, volleyError));
            }

            @Override // com.android.volley.b.InterfaceC0672b
            public void b(com.android.volley.l lVar) {
                j.this.f40937b.addMarker(ProtectedSandApp.s("ٰ"));
                if (lVar.f40903e && j.this.f40937b.hasHadResponseDelivered()) {
                    j.this.f40937b.finish(ProtectedSandApp.s("ٱ"));
                    j.this.f40937b.notifyListenerResponseNotUsable();
                } else {
                    ExecutorService executorService = c.this.f40825q;
                    j jVar = j.this;
                    executorService.execute(c.this.new i(jVar.f40937b, lVar));
                }
            }
        }

        j(n<T> nVar) {
            super(nVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40937b.isCanceled()) {
                this.f40937b.finish(ProtectedSandApp.s("ٲ"));
                this.f40937b.notifyListenerResponseNotUsable();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f40937b.addMarker(ProtectedSandApp.s("ٳ"));
                c.this.f40822n.e(this.f40937b, new a(elapsedRealtime));
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private class k<T> extends p<T> {

        /* renamed from: c, reason: collision with root package name */
        VolleyError f40857c;

        k(n<T> nVar, VolleyError volleyError) {
            super(nVar);
            this.f40857c = volleyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.i().c(this.f40937b, this.f40937b.parseNetworkError(this.f40857c));
            this.f40937b.notifyListenerResponseNotUsable();
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    private static class l implements com.android.volley.e {
        private l() {
        }

        @Override // com.android.volley.e
        public void c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void d(String str, boolean z4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void e(String str, e.a aVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public e.a get(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.e
        public void remove(String str) {
            throw new UnsupportedOperationException();
        }

        l(a aVar) {
        }
    }

    /* synthetic */ c(com.android.volley.e eVar, com.android.volley.b bVar, com.android.volley.a aVar, r rVar, h hVar, a aVar2) {
        this(eVar, bVar, aVar, rVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(e.a aVar, n<?> nVar) {
        if (aVar == null) {
            nVar.addMarker(ProtectedSandApp.s("ٶ"));
            if (this.f40827s.c(nVar)) {
                return;
            }
            n(nVar);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!aVar.b(currentTimeMillis)) {
            this.f40825q.execute(new e(nVar, aVar, currentTimeMillis));
            return;
        }
        nVar.addMarker(ProtectedSandApp.s("ٷ"));
        nVar.setCacheEntry(aVar);
        if (this.f40827s.c(nVar)) {
            return;
        }
        n(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ArrayList arrayList;
        synchronized (this.f40830v) {
            arrayList = new ArrayList(this.f40828t);
            this.f40828t.clear();
            this.f40829u = true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d((n) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(n<?> nVar, q<?> qVar, boolean z4) {
        if (z4) {
            nVar.addMarker(ProtectedSandApp.s("ٸ"));
        }
        nVar.markDelivered();
        i().a(nVar, qVar);
        nVar.notifyListenerResponseReceived(qVar);
    }

    private static PriorityBlockingQueue<Runnable> z() {
        return new PriorityBlockingQueue<>(11, new C0674c());
    }

    @Override // com.android.volley.o
    <T> void d(n<T> nVar) {
        if (!this.f40829u) {
            synchronized (this.f40830v) {
                try {
                    if (!this.f40829u) {
                        this.f40828t.add(nVar);
                        return;
                    }
                } finally {
                }
            }
        }
        if (!nVar.shouldCache()) {
            n(nVar);
        } else if (this.f40821m != null) {
            this.f40823o.execute(new g(nVar));
        } else {
            this.f40825q.execute(new g(nVar));
        }
    }

    @Override // com.android.volley.o
    <T> void n(n<T> nVar) {
        this.f40823o.execute(new j(nVar));
    }

    @Override // com.android.volley.o
    public void o() {
        p();
        this.f40823o = this.f40826r.b(z());
        this.f40825q = this.f40826r.a(z());
        this.f40824p = this.f40826r.c();
        this.f40822n.f(this.f40825q);
        this.f40822n.g(this.f40823o);
        this.f40822n.h(this.f40824p);
        if (this.f40821m != null) {
            this.f40823o.execute(new a());
        } else {
            this.f40825q.execute(new b());
        }
    }

    @Override // com.android.volley.o
    public void p() {
        ExecutorService executorService = this.f40823o;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f40823o = null;
        }
        ExecutorService executorService2 = this.f40825q;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f40825q = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f40824p;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f40824p = null;
        }
    }

    private c(com.android.volley.e eVar, com.android.volley.b bVar, @q0 com.android.volley.a aVar, r rVar, h hVar) {
        super(eVar, bVar, 0, rVar);
        this.f40827s = new u(this);
        this.f40828t = new ArrayList();
        this.f40829u = false;
        this.f40830v = new Object[0];
        this.f40821m = aVar;
        this.f40822n = bVar;
        this.f40826r = hVar;
    }
}
