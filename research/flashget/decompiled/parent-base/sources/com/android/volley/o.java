package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: l, reason: collision with root package name */
    private static final int f40917l = 4;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f40918a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<n<?>> f40919b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f40920c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f40921d;

    /* renamed from: e, reason: collision with root package name */
    private final com.android.volley.e f40922e;

    /* renamed from: f, reason: collision with root package name */
    private final j f40923f;

    /* renamed from: g, reason: collision with root package name */
    private final r f40924g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f40925h;

    /* renamed from: i, reason: collision with root package name */
    private f f40926i;

    /* renamed from: j, reason: collision with root package name */
    private final List<e> f40927j;

    /* renamed from: k, reason: collision with root package name */
    private final List<c> f40928k;

    /* compiled from: RequestQueue.java */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f40929a;

        a(Object obj) {
            this.f40929a = obj;
        }

        @Override // com.android.volley.o.d
        public boolean a(n<?> nVar) {
            return nVar.getTag() == this.f40929a;
        }
    }

    /* compiled from: RequestQueue.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* renamed from: n1, reason: collision with root package name */
        public static final int f40931n1 = 0;

        /* renamed from: o1, reason: collision with root package name */
        public static final int f40932o1 = 1;

        /* renamed from: p1, reason: collision with root package name */
        public static final int f40933p1 = 2;

        /* renamed from: q1, reason: collision with root package name */
        public static final int f40934q1 = 3;

        /* renamed from: r1, reason: collision with root package name */
        public static final int f40935r1 = 4;

        /* renamed from: s1, reason: collision with root package name */
        public static final int f40936s1 = 5;
    }

    /* compiled from: RequestQueue.java */
    public interface c {
        void a(n<?> nVar, int i4);
    }

    /* compiled from: RequestQueue.java */
    public interface d {
        boolean a(n<?> nVar);
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    public interface e<T> {
        void a(n<T> nVar);
    }

    public o(com.android.volley.e eVar, j jVar, int i4, r rVar) {
        this.f40918a = new AtomicInteger();
        this.f40919b = new HashSet();
        this.f40920c = new PriorityBlockingQueue<>();
        this.f40921d = new PriorityBlockingQueue<>();
        this.f40927j = new ArrayList();
        this.f40928k = new ArrayList();
        this.f40922e = eVar;
        this.f40923f = jVar;
        this.f40925h = new k[i4];
        this.f40924g = rVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.setRequestQueue(this);
        synchronized (this.f40919b) {
            this.f40919b.add(nVar);
        }
        nVar.setSequence(j());
        nVar.addMarker(ProtectedSandApp.s("ٴ"));
        m(nVar, 0);
        d(nVar);
        return nVar;
    }

    public void b(c cVar) {
        synchronized (this.f40928k) {
            this.f40928k.add(cVar);
        }
    }

    @Deprecated
    public <T> void c(e<T> eVar) {
        synchronized (this.f40927j) {
            this.f40927j.add(eVar);
        }
    }

    <T> void d(n<T> nVar) {
        if (nVar.shouldCache()) {
            this.f40920c.add(nVar);
        } else {
            n(nVar);
        }
    }

    public void e(d dVar) {
        synchronized (this.f40919b) {
            try {
                for (n<?> nVar : this.f40919b) {
                    if (dVar.a(nVar)) {
                        nVar.cancel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ٵ"));
        }
        e(new a(obj));
    }

    <T> void g(n<T> nVar) {
        synchronized (this.f40919b) {
            this.f40919b.remove(nVar);
        }
        synchronized (this.f40927j) {
            try {
                Iterator<e> it = this.f40927j.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m(nVar, 5);
    }

    public com.android.volley.e h() {
        return this.f40922e;
    }

    public r i() {
        return this.f40924g;
    }

    public int j() {
        return this.f40918a.incrementAndGet();
    }

    public void k(c cVar) {
        synchronized (this.f40928k) {
            this.f40928k.remove(cVar);
        }
    }

    @Deprecated
    public <T> void l(e<T> eVar) {
        synchronized (this.f40927j) {
            this.f40927j.remove(eVar);
        }
    }

    void m(n<?> nVar, int i4) {
        synchronized (this.f40928k) {
            try {
                Iterator<c> it = this.f40928k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    <T> void n(n<T> nVar) {
        this.f40921d.add(nVar);
    }

    public void o() {
        p();
        f fVar = new f(this.f40920c, this.f40921d, this.f40922e, this.f40924g);
        this.f40926i = fVar;
        fVar.start();
        for (int i4 = 0; i4 < this.f40925h.length; i4++) {
            k kVar = new k(this.f40921d, this.f40923f, this.f40922e, this.f40924g);
            this.f40925h[i4] = kVar;
            kVar.start();
        }
    }

    public void p() {
        f fVar = this.f40926i;
        if (fVar != null) {
            fVar.d();
        }
        for (k kVar : this.f40925h) {
            if (kVar != null) {
                kVar.e();
            }
        }
    }

    public o(com.android.volley.e eVar, j jVar, int i4) {
        this(eVar, jVar, i4, new h(new Handler(Looper.getMainLooper())));
    }

    public o(com.android.volley.e eVar, j jVar) {
        this(eVar, jVar, 4);
    }
}
